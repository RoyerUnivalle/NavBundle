package com.example.roger.navegabilidad;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
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

    public void alertDialogo(View f){
        AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);
        dialogo1.setTitle("Importante");
        dialogo1.setMessage("¿ Acepta la ejecución de este programa en modo prueba ?");
        dialogo1.setCancelable(false);
        dialogo1.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogo1, int id) {
                aceptar();
            }
        });
        dialogo1.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogo1, int id) {
                cancelar();
            }
        });
        dialogo1.show();

    }
    public void aceptar() {
        //Toast t=Toast.makeText(this,"Bienvenido a probar el programa.", Toast.LENGTH_SHORT);
        //t.show();
        Intent ir = new Intent(MainActivity.this,Home.class);
        startActivity(ir.addFlags(ir.FLAG_ACTIVITY_CLEAR_TOP | ir.FLAG_ACTIVITY_CLEAR_TASK));
    }
    public void cancelar() {
        finish();
    }

}
