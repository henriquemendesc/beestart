package com.dev.bob.beestart.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dev.bob.beestart.MainActivity;
import com.dev.bob.beestart.R;

public class CadastroActivity extends AppCompatActivity {
    private Button btnScreenCad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        //alterar o título na toolbar
        MainActivity.startToolBar(this,getString(R.string.string_title_cadastro));

        btnScreenCad = (Button)findViewById(R.id.btnScreenCad);
        btnScreenCad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
