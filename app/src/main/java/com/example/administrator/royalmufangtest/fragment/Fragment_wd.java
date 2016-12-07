package com.example.administrator.royalmufangtest.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.administrator.royalmufangtest.R;
import com.example.administrator.royalmufangtest.bean.UserListBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangDongXu on 2016/12/6.
 */
public class Fragment_wd extends Fragment {
    private ListView flv;
    private List<UserListBean> list=new ArrayList<UserListBean>();


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wd, null);

        flv=(ListView)view.findViewById(R.id.fragment_lv);


        return view;

    }








    //list添加数据
    private void LoadData(){

        UserListBean user1=new UserListBean("我的订单",R.mipmap.my_order_icon);
        UserListBean user2=new UserListBean("邀请有礼",R.mipmap.my_invite_gift_icon);
        UserListBean user3=new UserListBean("刷脸测尺寸",R.mipmap.my_vip_icon);
        UserListBean user4=new UserListBean("我的现金券",R.mipmap.my_coupon_icon);
        UserListBean user5=new UserListBean("我的抽奖单",R.mipmap.my_lottery_icon);
        UserListBean user6=new UserListBean("我收藏的商品",R.mipmap.my_collection_icon);
        UserListBean user7=new UserListBean("联系客服",R.mipmap.personal_center_contact_service_icon);

        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);
        list.add(user6);
        list.add(user7);


    }
}
