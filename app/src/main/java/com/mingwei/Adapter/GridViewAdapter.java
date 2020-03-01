package com.mingwei.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mingwei.gridview.R;

import java.util.List;
import java.util.Map;

public class GridViewAdapter extends BaseAdapter {
Context m_context;
List<Map<String, Object>>   m_list;

  public GridViewAdapter(Context context,List<Map<String, Object>> list){
    this.m_context=context;
    this.m_list=list;
}
    @Override
    public Object getItem(int position) {
      return   m_list.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
      ViewHolder viewHolder;
      if(convertView==null){   //构造模板
          convertView = LayoutInflater.from(m_context).inflate(
                  R.layout.item, null);
          viewHolder=new ViewHolder();
      viewHolder.imageView=(ImageView) convertView.findViewById(R.id.grid_img);
      viewHolder.textView=(TextView)convertView.findViewById(R.id.grid_text);
      convertView.setTag(viewHolder);

      }else {
          viewHolder=(ViewHolder) convertView.getTag();
      }


      viewHolder.imageView.setImageResource((Integer) m_list.get(position).get("image"));
      viewHolder.textView.setText((String) m_list.get(position).get("text"));
        return convertView;
    }

    @Override
    public long getItemId(int position) {
      return position;
    }

    @Override
    public int getCount() {
       return  m_list.size();
    }
    class ViewHolder{
      ImageView imageView;
      TextView textView;
    }
}
