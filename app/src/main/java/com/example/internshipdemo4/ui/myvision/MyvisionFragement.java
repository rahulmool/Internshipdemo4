package com.example.internshipdemo4.ui.myvision;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.internshipdemo4.HttpHandler;
import com.example.internshipdemo4.R;

import org.json.JSONException;
import org.json.JSONObject;


public class MyvisionFragement extends Fragment{
    private MyvisionViewModel myvisionViewModel;


    private String TAG = MyvisionFragement.class.getSimpleName();

    private ProgressDialog pDialog;
    private TextView tv;
    private WebView wv;
    public String vision="";

    // URL to get contacts JSON
    private static String url = "http://iamapp.incubatorsdwnmt.com/api/frontend/vision/35/wew/31/hgf/1";

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        myvisionViewModel =
                ViewModelProviders.of(this).get(MyvisionViewModel.class);
        View root = inflater.inflate(R.layout.fragement_myvision, container, false);
        wv = (WebView) root.findViewById(R.id.webv);

        new GetContacts().execute();

        return root;
    }

    /**
     * Async task class to get json by making HTTP call
     */
    private class GetContacts extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            // Showing progress dialog
            pDialog = new ProgressDialog(getActivity());
            pDialog.setMessage("Please wait...");
            pDialog.setCancelable(false);
            pDialog.show();

        }

        @Override
        protected Void doInBackground(Void... arg0) {
            HttpHandler sh = new HttpHandler();

            // Making a request to url and getting response
            String jsonStr = sh.makeServiceCall(url);

            Log.e(TAG, "Response from url: " + jsonStr);

            if (jsonStr != null) {
                try {
                    Log.e(TAG,"rahul");

                    JSONObject jsonObj = new JSONObject(jsonStr);

                    // Getting JSON Array node
                    String temp;
                    temp=jsonObj.getString("message");
                    JSONObject obj = new JSONObject(temp);
                    vision=obj.getString("data");

                } catch (final JSONException e) {
                    Log.e(TAG, "Json parsing error: " + e.getMessage());
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getActivity().getApplicationContext(),
                                    "Json parsing error: " + e.getMessage(),
                                    Toast.LENGTH_LONG)
                                    .show();
                        }
                    });

                }
            } else {
                Log.e(TAG, "Couldn't get json from server.");
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(getActivity().getApplicationContext(),
                                "Couldn't get json from server. Check LogCat for possible errors!",
                                Toast.LENGTH_LONG)
                                .show();
                    }
                });

            }

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
            // Dismiss the progress dialog
            if (pDialog.isShowing())
                pDialog.dismiss();
            /**
             * Updating parsed JSON data into ListView
             * */
            String encodedHtml = Base64.encodeToString(vision.getBytes(),
                    Base64.NO_PADDING);
            wv.loadData(encodedHtml, "text/html", "base64");
        }

    }
}
