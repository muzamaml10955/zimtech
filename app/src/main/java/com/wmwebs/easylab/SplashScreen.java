package com.wmwebs.easylab;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    int status = 0;
    Handler handler = new Handler();
    Dialog dialog;
    ProgressBar text;
    TextView text2;
    ProgressBar progressBar;
    TextView textView;
    Intent intent;

    private Handler mWaitHandler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);



        mWaitHandler.postDelayed(new Runnable() {

            @Override
            public void run() {

                //The following code will execute after the 5 seconds.

                try {

                    //Go to next page i.e, start the next activity.
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);

                    //Let's Finish Splash Activity since we don't want to show this when user press back button.
                    finish();
                } catch (Exception ignored) {
                    ignored.printStackTrace();
                }
            }
        }, 2300);  // Give a 5 seconds delay.
    }






       /* try {
            Thread.sleep(30000);
            startActivity(new Intent(this, MainActivity.class));
            finish();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        /*getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        progressBar = findViewById(R.id.Progress_Bar);
        textView = findViewById(R.id.textview);
        progressBar.setMax(100);
        progressBar.setScaleY(3f);
        progressAnimation();*/
}

 /*   private void progressAnimation() {
        ProgressBarAnimation anim = new ProgressBarAnimation(this, progressBar, textView, 0f, 100f);
        anim.setDuration(3000);
        progressBar.setAnimation(anim);

    }
*/


/*
    public class ProgressBarAnimation extends Animation {
        private Context context;
        private ProgressBar progressBar;
        private TextView textView;
        private float from;
        private float to;
        public ProgressBarAnimation( Context context,ProgressBar progressBar ,TextView textView,float from,float to )
        {
            this.context=context;
            this.progressBar=progressBar;
            this.textView=textView;
            this.from=from;
            this.to=to;
        }*/

       /* @Override
        protected void applyTransformation(float interpolatedTime, Transformation t) {
            super.applyTransformation(interpolatedTime, t);
            float value =from +(to-from)* interpolatedTime;
            progressBar.setProgress((int)value);
            textView.setText((int)value+" %");
            if( value == to)
            {
                *//*intent=new Intent(context,MainActivity.class);*//*
                startActivity(new Intent(context, MainActivity.class));
                finish();
            }

        }
*/









