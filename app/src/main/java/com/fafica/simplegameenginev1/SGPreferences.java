package com.fafica.simplegameenginev1;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by pedrodimoura on 21/09/16.
 */

public class SGPreferences {

    private SharedPreferences.Editor    mEditor = null;
    private SharedPreferences           mPreferences = null;

    public SGPreferences(AppCompatActivity appCompatActivity) {
        this.mPreferences = appCompatActivity.getPreferences(Context.MODE_PRIVATE);
        this.mEditor = this.mPreferences.edit();
    }

    public boolean getBoolean(String key, boolean defaultValue) {
        try {
            return this.mPreferences.getBoolean(key, defaultValue);
        } catch (ClassCastException cce) {
            Log.d(SGActivity.TAG, "SGPreferences.getBoolean(): Valor possui um tipo diferente");
            return defaultValue;
        }
    }

    public float getFloat(String key, float defaultValue) {
        try {
            return this.mPreferences.getFloat(key, defaultValue);
        } catch (ClassCastException cce) {
            Log.d(SGActivity.TAG, "SGPreferences.getFloat(): Valor possui um tipo diferente");
            return defaultValue;
        }
    }

    public int getInt(String key, int defaultValue) {
        try {
            return this.mPreferences.getInt(key, defaultValue);
        } catch (ClassCastException cce) {
            Log.d(SGActivity.TAG, "SGPreferences.getInt(): Valor possui um tipo diferente");
            return defaultValue;
        }
    }

    public long getLong(String key, long defaultValue) {
        try {
            return this.mPreferences.getLong(key, defaultValue);
        } catch (ClassCastException cce) {
            Log.d(SGActivity.TAG, "SGPreferences.getLong(): Valor possui um tipo diferente");
            return defaultValue;
        }
    }

    public String getString(String key, String defaultValue) {
        try {
            return this.mPreferences.getString(key, defaultValue);
        } catch (ClassCastException cce) {
            Log.d(SGActivity.TAG, "SGPreferences.getString(): Valor possui um tipo diferente");
            return defaultValue;
        }
    }

    public SGPreferences begin() {
        this.mEditor = this.mPreferences.edit();
        return SGPreferences.this;
    }

    public SGPreferences putBoolean(String key, boolean value) {
        this.mEditor.putBoolean(key, value);
        return SGPreferences.this;
    }

    public SGPreferences putFloat(String key, float value) {
        this.mEditor.putFloat(key, value);
        return SGPreferences.this;
    }

    public SGPreferences putInt(String key, int value) {
        this.mEditor.putInt(key, value);
        return SGPreferences.this;
    }

    public SGPreferences putLong(String key, long value) {
        this.mEditor.putLong(key, value);
        return SGPreferences.this;
    }

    public SGPreferences putString(String key, String value) {
        this.mEditor.putString(key, value);
        return SGPreferences.this;
    }

    public SGPreferences remove(String key) {
        this.mEditor.remove(key);
        return SGPreferences.this;
    }

    public void end() {
        this.mEditor.apply();
    }

}
