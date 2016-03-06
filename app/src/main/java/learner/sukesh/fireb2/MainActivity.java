package learner.sukesh.fireb2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView l;

    String[] names = {
            "Papa",
            "Mummi",
            "Bro",
            "Craziest one"


    };
    String[] relationship = {
            "Dad","Mom","Brother","me"
    };

    Integer[] imageIDs = {
            R.drawable.ic_launcher,
            R.drawable.ic_launcher,
            R.drawable.ic_launcher,
            R.drawable.ic_launcher,




    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       l= (ListView) findViewById(R.id.list);
     FAdapter adapter = new FAdapter(this, names,relationship, imageIDs);
        l.setAdapter(adapter);


    }




}