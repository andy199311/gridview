package com.mingwei.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;


import com.mingwei.Adapter.GridViewAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private List<Map<String, Object>> list;
    private GridView m_gv;
    private int images[] = {R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m_gv=findViewById(R.id.gv_id);
        list = new ArrayList<Map<String, Object>>();
        for(int i=0;i<images.length;++i){
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", images[i]);
            map.put("text", "图片" + i);
            list.add(map);
            //test
            //adb test
            //i am fan mingwei
            //mod
            //aaaaaa
        }
        GridViewAdapter gridViewAdapter=new GridViewAdapter(this,list);
        m_gv.setAdapter(gridViewAdapter);
        m_gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             // Toast.makeText(this,list.get(position).get("text").toString(),Toast.LENGTH_SHORT).show();
             Toast.makeText(MainActivity.this,list.get(position).get("text").toString(),Toast.LENGTH_SHORT).show();


            }
        });

    }
}
