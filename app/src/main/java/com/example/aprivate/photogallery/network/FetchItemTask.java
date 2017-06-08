package com.example.aprivate.photogallery.network;

import android.os.AsyncTask;



public class FetchItemTask extends AsyncTask <Void, Void, Void>{
    private static final String TAG = "FetchItemTask: ";

    @Override
    protected Void doInBackground(Void... params) {
        new FlickrFetchr().fetchItems();
        return null;
    }

}
