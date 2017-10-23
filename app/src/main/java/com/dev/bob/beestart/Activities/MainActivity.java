package com.dev.bob.beestart.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.dev.bob.beestart.R;
import com.dev.bob.beestart.Util.StartToolBarTitle;

public class MainActivity extends AppCompatActivity {
    private Button btnCad;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //altera o título na toolbar
        StartToolBarTitle.startToolBar(this,getString(R.string.app_name));

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

    //abre a activity ao clicar no botão específico
    private void startOtherActivity(Class<?> cls) {
        Intent intent = new Intent(this, cls);
        startActivity(intent);
    }
}
