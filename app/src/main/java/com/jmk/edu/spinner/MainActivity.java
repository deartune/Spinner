package com.jmk.edu.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Spinner spinner=(Spinner)findViewById(R.id.spinner);
    List<String> list = new ArrayList<String>();
    list.add("Apple");
    list.add("Mango");
    list.add("Banana");
    ArrayAdapter<String> dataAdapter =
            new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
    dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    spinner.setAdapter(dataAdapter);
    spinner.setOnItemSelectedListener(this);
}

@Override
public void onItemSelected(AdapterView<?> adapterView, View view,
        int position, long id) {

        String seleted = ((TextView)view).getText().toString();
        String text = adapterView.getItemAtPosition(position).toString();

        }

@Override
public void onNothingSelected(AdapterView<?> adapterView) { }
}