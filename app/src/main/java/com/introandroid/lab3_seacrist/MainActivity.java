package com.introandroid.lab3_seacrist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private ListView classList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String class1 = getResources().getString(R.string.CSCI_220);
        String class2 = getResources().getString(R.string.CSCI_380);
        String class3 = getResources().getString(R.string.CSCI_392);
        String class4 = getResources().getString(R.string.CSCI_470);
        String class5 = getResources().getString(R.string.CSCI_495);


        classList = findViewById(R.id.class_schedule);
        final String [] myClasses = {class1, class2, class3, class4, class5};
        final ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, myClasses);

        classList.setAdapter(adapter);

        classList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast toast = Toast.makeText(getApplicationContext(),"You clicked: " +
                        myClasses [i], Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
}
