package com.example.debugtools;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    private final String TAG = "DEFAULT_TAG";

    private final int min = 20, max = 80, random = new Random().nextInt((max - min) + 1) + min;
    private int[] array = new int[random];
    private int[] pointer;

    private int thread_count, current_value;

	private Thread thread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        createThread();
    }

    private void createThread() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    Log.d(TAG, "Number of threads running: " + thread_count++);
                    Log.d(TAG, "Current value: " + current_value++);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        if (!thread.isAlive()) {
            thread.start();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        thread.interrupt();
    }
}