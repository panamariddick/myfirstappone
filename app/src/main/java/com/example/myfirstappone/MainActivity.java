package com.example.myfirstappone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtCounter;
    private Button btnIncrement;

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        init();

        txtCounter.setText( "0" );

        btnIncrement.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = counter + 1;

                txtCounter.setText( String.valueOf( counter ) );

            }
        } );


    }

    private void init() {

        txtCounter = findViewById( R.id.txtcount );
        btnIncrement = findViewById( R.id.btnincrement );

    }
}
