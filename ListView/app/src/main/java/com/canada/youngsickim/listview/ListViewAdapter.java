package com.canada.youngsickim.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by youngsickim on 2017-05-20.
 */

public class ListViewAdapter extends BaseAdapter{

    ArrayList<String> title;
    ArrayList<String> subTitle;
    ArrayList<String> images;
    Context context;

    private static LayoutInflater inflater = null;

    public ListViewAdapter(MainActivity mainActivity, ArrayList<String> getTitle, ArrayList<String> getSubTitle,ArrayList<String> getImages) {
        title = getTitle;
        subTitle = getSubTitle;
        images = getImages;
        context = mainActivity;

        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return title.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class Holder {
        TextView tv_title;
        TextView tv_subTitle;
        ImageView imgv;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder = new Holder();

        View rootView = inflater.inflate(R.layout.listview_item,null);

        holder.tv_title = (TextView)rootView.findViewById(R.id.tv_subject);
        holder.tv_subTitle = (TextView)rootView.findViewById(R.id.tv_subtitle);
        holder.imgv = (ImageView) rootView.findViewById(R.id.iv_thumb);

        holder.tv_title.setText(title.get(position));
        holder.tv_subTitle.setText(subTitle.get(position));
        int id = context.getResources().getIdentifier("drawable/"+images.get(position),null,context.getPackageName());
        holder.imgv.setImageResource(id);

        return rootView;
    }
}
