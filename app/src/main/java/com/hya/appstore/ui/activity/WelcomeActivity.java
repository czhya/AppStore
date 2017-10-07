package com.hya.appstore.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AccelerateDecelerateInterpolator;

import com.eftimoff.androipathview.PathView;
import com.hya.appstore.R;
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
        pathView.getPathAnimator()
                .delay(100)
                .duration(3000)
                .interpolator(new AccelerateDecelerateInterpolator())
                .listenerEnd(new PathView.AnimatorBuilder.ListenerEnd() {
                    @Override
                    public void onAnimationEnd() {
                        jump();
                    }
                })

                .start();
    }

    private void jump() {

        if (ACache.get(this).getAsString(GuideActivity.IS_GUIDE).equals("")){
            startActivity(new Intent(this,MainActivity.class));
            this.finish();
        }else {
            startActivity(new Intent(this,GuideActivity.class));
        }
    }
}
