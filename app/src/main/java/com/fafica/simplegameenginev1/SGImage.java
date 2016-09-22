package com.fafica.simplegameenginev1;

import android.graphics.Bitmap;
import android.graphics.Point;

/**
 * Created by pedrodimoura on 21/09/16.
 */

public class SGImage {

    private Bitmap  mBitmap = null;
    private Point   mDimensions = new Point();

    public SGImage(Bitmap bitmap) {
        this.mBitmap = bitmap;
        this.mDimensions.set(mBitmap.getWidth(), mBitmap.getHeight());
    }

    public Bitmap getBitmap() {
        return this.mBitmap;
    }

    public Point getDimensions() {
        return this.mDimensions;
    }

}
