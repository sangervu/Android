package com.example.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        this.customSimpleAdapterListView();

    }

    // This method shows how to customize SimpleAdapter to show image and text in ListView.
    private void customSimpleAdapterListView() {
        setTitle("Scales on Intervals");

        MusicScales musicScales = new MusicScales();

        String[] interval = {"WHWWWWH","HWWWWHW","WWWWHWH","WWWHWHW","WWHWHWW","WHWHWWW","HWHWWWW"};
        //String[] scale = {"mi Ma7 Melodic minor scale (mm)","mi7 Dorian b2 mm scale","Ma7#5 Lydian augmented mm scale",
         //       "7 Lydian dom./Acoustic mm scale","7 Aeolian dom. mm scale","mi7b5 Half dim. mm scale","7 Altered mm scale"};

        ArrayList<Map<String, Object>> itemDataList = new ArrayList<Map<String, Object>>();
        ;

        int titleLen = interval.length;
        for (int i = 0; i < titleLen; i++) {
            Map<String, Object> listItemMap = new HashMap<String, Object>();

            listItemMap.put("interval", interval[i]);
            listItemMap.put("scale", musicScales.getScales(interval[i]));
            itemDataList.add(listItemMap);
        }

        SimpleAdapter simpleAdapter = new SimpleAdapter(this, itemDataList, R.layout.activity_list_view,
                new String[]{"interval", "scale"}, new int[]{R.id.intervalsDesc, R.id.scaleDesc});

        ListView listView = (ListView) findViewById(R.id.listViewExample);
        listView.setAdapter(simpleAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int index, long l) {
                Object clickItemObj = adapterView.getAdapter().getItem(index);
                Toast.makeText(ListViewActivity.this, "You clicked " + clickItemObj.toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}