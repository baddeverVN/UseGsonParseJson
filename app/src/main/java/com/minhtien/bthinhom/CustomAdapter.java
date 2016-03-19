package com.minhtien.bthinhom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by MinhTien on 3/18/2016.
 */
public class CustomAdapter extends BaseAdapter {
    private List<Response.ItemsBean> list;
    private Context context;

    public CustomAdapter( Context context,List<Response.ItemsBean> list) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.item_list, parent, false);
        Response.ItemsBean item = (Response.ItemsBean) getItem(position);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.thumbnail);
        TextView txtType = (TextView) convertView.findViewById(R.id.kind);
        TextView txtTM = (TextView) convertView.findViewById(R.id.first);
        TextView txtCK = (TextView) convertView.findViewById(R.id.second);
        String imageurl = item.getImageurl();
        Picasso.with(context).load(imageurl).into(imageView);
        txtType.setText(item.getType());
        String strTM = "Mua TM : " + item.getMuatienmat() + "    Bán TM : " + item.getBantienmat();
        txtTM.setText(strTM);
        String strCK = "Mua CK : " + item.getMuack() + "   Bán CK : " +  item.getBanck();
        txtCK.setText(strCK);
        return convertView;
    }

}
