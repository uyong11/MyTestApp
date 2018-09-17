package com.cordoba.mytestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void addNew(View view){
        EditText newItem= (EditText) findViewById(R.id.txtNewItem);
        String txtItem = newItem.getText().toString();
        Toast.makeText(getApplicationContext(),  txtItem, Toast.LENGTH_SHORT).show();
    }
}
