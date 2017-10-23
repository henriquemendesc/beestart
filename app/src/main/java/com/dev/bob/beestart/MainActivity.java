package com.dev.bob.beestart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dev.bob.beestart.Activities.CadastroActivity;
import com.dev.bob.beestart.Activities.LoginActivity;

public class MainActivity extends AppCompatActivity {
    private Button btnCad;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCad = (Button) findViewById(R.id.btnCadastro);
        btnCad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startOtherActivity(CadastroActivity.class);
            }
        });
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startOtherActivity(LoginActivity.class);
            }
        });
    }

    private void startOtherActivity(Class<?> cls) {
        Intent intent = new Intent(this, cls);
        startActivity(intent);
    }
}
