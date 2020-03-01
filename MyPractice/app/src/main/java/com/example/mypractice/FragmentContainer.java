package com.example.mypractice;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by 11861 on 2020/2/22.
 */

public class FragmentContainer extends Fragment {
    private int fragmentIndex;
    private View rootView;
    private View.OnClickListener onClickListener;

    public FragmentContainer(){}

    @SuppressLint("ValidFragment")
    public FragmentContainer(int fragmentIndex){
        this.fragmentIndex = fragmentIndex;
    }

    public void setOnClickListener(View.OnClickListener onClickListener){
        this.onClickListener = onClickListener;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.i("FragmentOne", "onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.fragment_container,null);
        TextView tvContent = rootView.findViewById(R.id.tv_content);
        if(fragmentIndex == 1){
            tvContent.setText("第一个 Fragment");
            tvContent.setBackgroundResource(android.R.color.holo_red_light);
        }else if(fragmentIndex == 2){
            tvContent.setText("第二个 Fragment");
            tvContent.setBackgroundResource(android.R.color.holo_green_light);
        }else{
            tvContent.setText("第三个 Fragment");
            tvContent.setBackgroundResource(android.R.color.holo_blue_light);
        }
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if(onClickListener != null){
            rootView.setOnClickListener(onClickListener);
        }
    }

}









