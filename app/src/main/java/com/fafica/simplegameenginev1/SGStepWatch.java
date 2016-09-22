package com.fafica.simplegameenginev1;

import android.os.SystemClock;

/**
 * Created by pedrodimoura on 21/09/16.
 */

public class SGStepWatch {

    protected long  mCurrentTime;
    protected long  mLastTime;
    protected float mElapsedTime;

    protected float tick() {
        if (mCurrentTime == 0) {
            mLastTime = mCurrentTime = SystemClock.uptimeMillis();
        } else {
            mCurrentTime = SystemClock.uptimeMillis();
        }

        mElapsedTime = (mCurrentTime - mLastTime) / 1000.0f;

        mLastTime = mCurrentTime;

        return mElapsedTime;
    }

}
