package com.example.aprivate.photogallery.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.aprivate.photogallery.GalleryItem;
import com.example.aprivate.photogallery.holders.PhotoHolder;

import java.util.List;


public class PhotoAdapter extends RecyclerView.Adapter<PhotoHolder> {
    private List<GalleryItem> mGalleryItems;
    private Context mContext;

    public PhotoAdapter(List<GalleryItem> galleryItems, Context context) {
        mContext = context;
        mGalleryItems = galleryItems;
    }

    @Override
    public PhotoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TextView textView = new TextView(mContext);
        return new PhotoHolder(textView, mContext);
    }

    @Override
    public void onBindViewHolder(PhotoHolder holder, int position) {
        GalleryItem galleryItem = mGalleryItems.get(position);
        holder.bindGalleryItem(galleryItem);
    }

    @Override
    public int getItemCount() {
        return mGalleryItems.size();
    }
}
