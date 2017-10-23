package com.dev.bob.beestart.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dev.bob.beestart.R;
import com.dev.bob.beestart.Util.StartToolBarTitle;

public class LoginActivity extends AppCompatActivity {
    private Button btnLoginScreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //alterar o título na toolbar
        StartToolBarTitle.startToolBar(this,getString(R.string.string_title_login));

        btnLoginScreen = (Button)findViewById(R.id.btnScreenLogin);
        btnLoginScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
