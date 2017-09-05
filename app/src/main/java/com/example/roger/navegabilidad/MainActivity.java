package com.example.roger.navegabilidad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    String className;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        className=getApplication().getClass().toString();
    }

    ///https://developer.android.com/guide/components/activities/activity-lifecycle.html
    //http://html-color-codes.info/codigos-de-colores-hexadecimales/

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart "+className,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume "+className,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy "+className,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPause "+className,Toast.LENGTH_LONG).show();
    }


    //Mètodo para ir de  MainActivity a Home activity
    public void irHome(View b){

        //Linea para mensaje de alerta. Semejante a ShowMesageDialog in java.
        Toast.makeText(this,"Hola metodo",Toast.LENGTH_LONG).show();

        Intent ir = new Intent(MainActivity.this,Home.class);
        startActivity(ir.addFlags(ir.FLAG_ACTIVITY_CLEAR_TOP | ir.FLAG_ACTIVITY_CLEAR_TASK));
    }

}
