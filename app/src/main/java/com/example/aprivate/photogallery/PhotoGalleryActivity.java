package com.example.aprivate.photogallery;

import android.support.v4.app.Fragment;
import com.example.aprivate.photogallery.abstract_fragment.SingleFragmentActivity;

public class PhotoGalleryActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return PhotoGalleryFragment.newInstance();
    }
}
