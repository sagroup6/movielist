package com.example.luruoxuan.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lw on 2017/4/14.
 */

public class FruitAdapter extends ArrayAdapter{
    private final int resourceId;

    public FruitAdapter(Context context, int textViewResourceId, List<Fruit> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Fruit fruit = (Fruit) getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId, null);
        ImageView fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
        TextView fruitName = (TextView) view.findViewById(R.id.fruit_name);
        TextView info = (TextView) view.findViewById(R.id.info);
        TextView desc=(TextView)view.findViewById(R.id.desc);
        TextView time=(TextView)view.findViewById(R.id.time);
        ImageView level = (ImageView) view.findViewById(R.id.level);
        fruitImage.setImageResource(fruit.getImageId());
        fruitName.setText(fruit.getName());
        info.setText(fruit.getInfo());
        desc.setText(fruit.getDesc());
        time.setText(fruit.getTime());
        level.setImageResource(fruit.getLevel());
        return view;
    }
}