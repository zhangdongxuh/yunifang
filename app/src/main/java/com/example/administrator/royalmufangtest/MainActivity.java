package com.example.administrator.royalmufangtest;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.RadioButton;

import com.example.administrator.royalmufangtest.fragment.Fragment_fl;
import com.example.administrator.royalmufangtest.fragment.Fragment_gw;
import com.example.administrator.royalmufangtest.fragment.Fragment_sy;
import com.example.administrator.royalmufangtest.fragment.Fragment_wd;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragment;
    private Fragment_sy fragment_sy;
    private Fragment_fl fragment_fl;
    private Fragment_gw fragment_gw;
    private Fragment_wd fragment_wd;
    private RadioButton rb01;
    private RadioButton rb02;
    private RadioButton rb03;
    private RadioButton rb04;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        inintView();


        //获取fragment
        fragment = getSupportFragmentManager();
        FragmentTransaction transaction = fragment.beginTransaction();
        //获取四个页面fragment对象
        fragment_sy = new Fragment_sy();
        fragment_fl = new Fragment_fl();
        fragment_gw = new Fragment_gw();
        fragment_wd = new Fragment_wd();
        //添加
        transaction.add(R.id.fragment,fragment_sy);
        transaction.add(R.id.fragment,fragment_fl);
        transaction.add(R.id.fragment,fragment_gw);
        transaction.add(R.id.fragment,fragment_wd);
        //设置隐藏与现实
        transaction.hide(fragment_wd);
        transaction.hide(fragment_fl);
        transaction.hide(fragment_gw);
        transaction.show(fragment_sy);
        //提交事务
        transaction.commit();
    }

    /**
     * 设置界面按钮监听
     * @param
     */

    private void inintView() {

        rb01=(RadioButton)findViewById(R.id.rb01);
        rb02=(RadioButton)findViewById(R.id.rb02);
        rb03=(RadioButton)findViewById(R.id.rb03);
        rb04=(RadioButton)findViewById(R.id.rb04);

        rb01.setOnClickListener(onlist);
        rb02.setOnClickListener(onlist);
        rb03.setOnClickListener(onlist);
        rb04.setOnClickListener(onlist);


    }

    View.OnClickListener onlist=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            FragmentTransaction transaction = fragment.beginTransaction();
            switch (view.getId()){
                case R.id.rb01:
                    transaction.hide(fragment_fl);
                    transaction.hide(fragment_gw);
                    transaction.hide(fragment_wd);
                    transaction.show(fragment_sy);
                    break;
                case R.id.rb02:
                    transaction.hide(fragment_sy);
                    transaction.hide(fragment_gw);
                    transaction.hide(fragment_wd);
                    transaction.show(fragment_fl);
                    break;
                case R.id.rb03:
                    transaction.hide(fragment_sy);
                    transaction.hide(fragment_fl);
                    transaction.hide(fragment_wd);
                    transaction.show(fragment_gw);
                    break;
                case R.id.rb04:
                    transaction.hide(fragment_sy);
                    transaction.hide(fragment_fl);
                    transaction.hide(fragment_gw);
                    transaction.show(fragment_wd);
                    break;

        }
        transaction.commit();

        }
    };


}
