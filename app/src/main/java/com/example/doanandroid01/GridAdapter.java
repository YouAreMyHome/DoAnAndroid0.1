package com.example.doanandroid01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {
    Context context;
    String[] tentruyen;
    int[] biatruyen;

    LayoutInflater inflater;

    public GridAdapter (Context context, String[] tentruyen, int[] biatruyen)
    {
        this.context = context;
        this.tentruyen = tentruyen;
        this.biatruyen = biatruyen;
    }

    @Override
    public int getCount() {
        return tentruyen.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater==null)
            inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        if (convertView==null){
            convertView = inflater.inflate(R.layout.grid_item, null);

        }

        ImageView imageView = convertView.findViewById(R.id.grid_image);
        TextView textView = convertView.findViewById(R.id.item_name);

        imageView.setImageResource(biatruyen[position]);
        textView.setText(tentruyen[position]);
        return convertView;
    }
}
