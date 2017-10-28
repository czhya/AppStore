package com.hya.appstore.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AccelerateDecelerateInterpolator;

import com.eftimoff.androipathview.PathView;
import com.hya.appstore.R;
import com.hya.appstore.common.Constant;
import com.hya.appstore.common.util.ACache;

import butterknife.BindView;
import butterknife.ButterKnife;


public class WelcomeActivity extends AppCompatActivity {

    @BindView(R.id.pathView)
    PathView pathView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(this);

        pathView.getPathAnimator().delay(100)
                .duration(5000)
                .interpolator(new AccelerateDecelerateInterpolator())
                .listenerEnd(new PathView.AnimatorBuilder.ListenerEnd() {
                    @Override
                    public void onAnimationEnd() {
                        jump();

                    }
                })
                .start();

    }

    void jump(){
        String isShowGuide = ACache.get(this).getAsString(Constant.IS_SHOW_GUIDE);

        if (null ==isShowGuide){
            startActivity(new Intent(WelcomeActivity.this,GuideActivity.class));

        }else {
            startActivity(new Intent(WelcomeActivity.this,MainActivity.class));

        }

        this.finish();
    }
}
