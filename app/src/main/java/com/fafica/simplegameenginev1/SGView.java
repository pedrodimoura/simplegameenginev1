package com.fafica.simplegameenginev1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.view.View;

/**
 * Created by pedrodimoura on 21/09/16.
 */

public class SGView extends View {

    private SGImageFactory      mImageFactory;
    private SGStepWatch         mStepWatch = new SGStepWatch();
    private Point               mDimensions = new Point();
    private boolean             mHasStarted;

    public SGView(Context context) {
        super(context);
        this.mImageFactory = new SGImageFactory(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.LTGRAY);

        step(canvas, mStepWatch.tick());
        invalidate();
    }

    public void step(Canvas canvas, float ellapsedTimeInSeconds) {

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        this.mDimensions.set(w, h);

        if (!this.mHasStarted) {
            setup();
            this.mHasStarted = true;
        }

    }

    protected void setup() {

    }

    public Point getDimensions() {
        return this.mDimensions;
    }

    public SGImageFactory getImageFactory() {
        return this.mImageFactory;
    }
}
