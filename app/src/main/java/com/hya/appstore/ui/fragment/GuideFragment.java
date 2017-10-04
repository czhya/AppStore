package com.hya.appstore.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hya.appstore.R;
import com.hya.appstore.di.component.AppComponent;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

import static android.content.ContentValues.TAG;

/**
 * Created by 洪裕安 on 2017/10/3.
 */

public class GuideFragment extends Fragment {

    public static final String IMG_ID = "IMG_ID";
    public static final String COLOR_ID = "COLOR_ID";
    public static final String TEXT_ID = "TEXT_ID";

    @BindView(R.id.imgView_guide)
    ImageView imgViewGuide;
    @BindView(R.id.text_guide)
    TextView textGuide;
    Unbinder unbinder;
    @BindView(R.id.layout_linear)
    LinearLayout layoutLinear;

    private View mView;

    public static GuideFragment newInstance(int imgResId, int bgColorResId, int textResId) {
        Log.d(TAG, "newInstance: "+bgColorResId);
        GuideFragment fragment = new GuideFragment();

        Bundle bundle = new Bundle();

        bundle.putInt(IMG_ID, imgResId);
        bundle.putInt(COLOR_ID, bgColorResId);
        bundle.putInt(TEXT_ID, textResId);

        fragment.setArguments(bundle);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_guide, container, false);
        unbinder = ButterKnife.bind(this,mView);
        init();
        return mView;
    }

    public void init() {
        Bundle bundle = getArguments();

        int imgResId = bundle.getInt(IMG_ID);
        int bgColorResId = bundle.getInt(COLOR_ID);
        int textResId = bundle.getInt(TEXT_ID);
        Log.d("qwertyuio", "init: "+imgResId+" "+bgColorResId+" "+textResId);

        layoutLinear.setBackgroundColor(getResources().getColor(bgColorResId));
        imgViewGuide.setImageResource(imgResId);
        textGuide.setText(textResId);
    }

}
