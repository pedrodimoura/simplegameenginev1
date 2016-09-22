package com.fafica.simplegameenginev1;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by pedrodimoura on 21/09/16.
 */

public class SGImageFactory {

    protected Context mContext = null;

    public SGImageFactory(Context context) {
        this.mContext = context;
    }

    public SGImage createImage(String filename) {
        Bitmap bitmap = null;

        try {

            AssetManager assetManager = this.mContext.getAssets();
            InputStream inputStream = assetManager.open(filename);
            bitmap = BitmapFactory.decodeStream(inputStream);
            inputStream.close();

        } catch (IOException ioe) {
            Log.d(SGActivity.TAG, "SGImageFactory.createImage(): arquivo " + filename + " não encontrado!");
            return null;
        }

        return new SGImage(bitmap);
    }

    public SGImage createImage(int resourceId) {

        Bitmap bitmap = null;

        try {

            Resources resources = this.mContext.getResources();
            InputStream inputStream = resources.openRawResource(resourceId);

            bitmap = BitmapFactory.decodeStream(inputStream);
            inputStream.close();

        } catch (IOException ioe) {

        }
        return new SGImage(bitmap);
    }

    public Context getContext() {
        return this.mContext;
    }

}
