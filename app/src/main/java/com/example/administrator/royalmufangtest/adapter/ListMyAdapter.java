package com.example.administrator.royalmufangtest.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.royalmufangtest.R;
import com.example.administrator.royalmufangtest.bean.UserListBean;

import java.util.List;

/**
 * Created by ZhangDongXu on 2016/12/7.
 */
public class ListMyAdapter extends BaseAdapter{

    private List<UserListBean> list;
    private Context context;

    public ListMyAdapter(List<UserListBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder vh;
        if (view==null){
            vh=new ViewHolder();
            view=View.inflate(context, R.layout.list_item,null);
            vh.listimg=(ImageView)view.findViewById(R.id.listimg);
            vh.listtv=(TextView)view.findViewById(R.id.listtv);
            view.setTag(vh);
        }else{
            vh= (ViewHolder) view.getTag();
        }
        return view;
    }

    class ViewHolder{
        ImageView listimg;
        TextView  listtv;
    }
}
