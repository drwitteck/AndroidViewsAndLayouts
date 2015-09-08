package edu.temple.viewsandlayouts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });

        //  Create and populate string array for use with spinner adapter

        String[] roles = new String[3];

        roles[0] = "Student";
        roles[1] = "Faculty";
        roles[2] = "Staff";


        //  Create adapter for Spinner widget
        ArrayAdapter<String> rolesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, roles);
        final Spinner spinner = (Spinner) findViewById(R.id.spinner);

        //  Assign adapter to widget
        spinner.setAdapter(rolesAdapter);


        Button saveButton = (Button) findViewById(R.id.saveButton);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  Do some action

                User user = new User(((EditText) findViewById(R.id.nameText)).getText().toString(),
                        ((EditText) findViewById(R.id.emailText)).getText().toString(),
                        ((EditText) findViewById(R.id.telephoneText)).getText().toString(),
                        spinner.getSelectedItem().toString());

                String data = user.identifyUser();

                Toast.makeText(MainActivity.this, data, Toast.LENGTH_LONG).show();


            }
        });

    }

}
