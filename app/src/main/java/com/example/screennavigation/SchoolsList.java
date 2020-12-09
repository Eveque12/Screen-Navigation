package com.example.screennavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class SchoolsList extends AppCompatActivity {



    String[] schools={"IPRC KGL","UR","MOUNT KENYA","ULK","KHE","KIE","GSRR","GOB","CY","BT","IPK","TMB","JSP"};
    String[] highschools;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schools_list);
        setTitle("Schools");

        highschools=getResources().getStringArray(R.array.Secondaryschoolist);

        ListView listView=(ListView)findViewById(R.id.list);

       // ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.list_item,R.id.textView5,schools);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.list_item,R.id.textView5,highschools);

       listView.setAdapter(adapter);
       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              String Selected=((TextView)view.findViewById(R.id.textView5)).getText().toString();
//               Toast.makeText(getApplicationContext(),Selected,Toast.LENGTH_LONG).show();
//               if (Selected.contains("IPRC")){
//                   Toast.makeText(getApplicationContext(), "This is polytechnic school",Toast.LENGTH_LONG).show();
//               }else if (Selected.equals("UR GIKONDO")){





               switch(position){
                   case 0:
                       Toast.makeText(getApplicationContext(),Selected,Toast.LENGTH_LONG).show();
                       Toast.makeText(getApplicationContext(),"Kalibuni" +position, Toast.LENGTH_LONG).show();
                       break;
                       case 1:
                           Toast.makeText(getApplicationContext(),Selected,Toast.LENGTH_LONG);
                           Toast.makeText(getApplicationContext(),"Welcome" +position,Toast.LENGTH_LONG).show();

                   case 2:
                       Toast.makeText(getApplicationContext(),Selected,Toast.LENGTH_LONG);
                       Toast.makeText(getApplicationContext(),"Murakaza" +position,Toast.LENGTH_LONG).show();

                   case 3:
                       Toast.makeText(getApplicationContext(),Selected,Toast.LENGTH_LONG);
                       Toast.makeText(getApplicationContext(),"Bienvenue" +position,Toast.LENGTH_LONG).show();



               }

           }
       });

    }

}
