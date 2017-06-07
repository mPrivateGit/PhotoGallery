package com.example.aprivate.photogallery.network;

import android.os.AsyncTask;
import android.util.Log;

import java.io.IOException;



public class FetchItemTask extends AsyncTask <Void, Void, Void>{
    private static final String TAG = "FetchItemTask: ";

    @Override
    protected Void doInBackground(Void... params) {
        try {
            String result = new FlickrFetchr()
                    .getUrlString("https://www.bignerdranch.com");
            Log.i(TAG, "Fetched contents of URL: " + result);
        } catch (IOException ioe) {
            Log.e(TAG, "Failed to fetch URL: ", ioe);
        }
        return null;
    }

}
