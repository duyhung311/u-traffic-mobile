package com.hcmut.admin.utrafficsystem.util;

import android.content.Context;
import android.media.MediaPlayer;

import com.hcmut.admin.utrafficsystem.R;

public class Sound {
    public static void play(Context context) {
        MediaPlayer mp = MediaPlayer.create(context, R.raw.sound);
        if (mp.isPlaying()) {
            mp.stop();
            mp.release();
            mp = MediaPlayer.create(context, R.raw.sound);
        }
        mp.start();
    }

    public static void stop(Context context) {
        MediaPlayer mp = MediaPlayer.create(context, R.raw.sound);
        if (mp.isPlaying()) {
            mp.stop();
            mp.release();
        }
    }
}
