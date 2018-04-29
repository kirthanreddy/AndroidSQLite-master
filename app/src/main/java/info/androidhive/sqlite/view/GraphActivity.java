package info.androidhive.sqlite.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import info.androidhive.sqlite.R;

public class GraphActivity extends AppCompatActivity {

    private Button TextNote;

    private Button Logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);

        Logout = (Button)findViewById(R.id.button_logout);
        TextNote = (Button)findViewById(R.id.button_text);

        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GraphActivity.this, SecondActivity.class);

                startActivity(intent);
            }
        });


        TextNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GraphActivity.this, MainActivity.class);

                startActivity(intent);
            }
        });

    }
}



