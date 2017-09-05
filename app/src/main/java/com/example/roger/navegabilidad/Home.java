package com.example.roger.navegabilidad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    //Mètodo para ir de  MainActivity a Home activity
    public void Volver(View b){

        //Linea para mensaje de alerta. Semejante a ShowMesageDialog in java.
        Toast.makeText(this,"Hola metodo",Toast.LENGTH_LONG).show();

        Intent ir = new Intent(Home.this,MainActivity.class);
        startActivity(ir.addFlags(ir.FLAG_ACTIVITY_CLEAR_TOP | ir.FLAG_ACTIVITY_CLEAR_TASK));
    }
}
