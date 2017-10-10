package com.remotetiger.viewpager_tabs_week2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Abhimanyu on 9/26/2017.
 */


import android.widget.Toast;

import org.w3c.dom.Text;

public class Detailed extends AppCompatActivity {

    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed);
/*
        ImageView img = (ImageView)findViewById(R.id.image);*/
        TextView title = (TextView)findViewById(R.id.title);
        TextView description = (TextView)findViewById(R.id.description);


//        Toast.makeText(this,editText.toString(),Toast.LENGTH_LONG).show();

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                editText = (EditText)findViewById(R.id.edit_Text);

                Intent returnIntent = new Intent();
                returnIntent.putExtra("result", editText.getText().toString());
                setResult(Detailed.RESULT_OK,returnIntent);
                finish();
            }
        });
    }


}
