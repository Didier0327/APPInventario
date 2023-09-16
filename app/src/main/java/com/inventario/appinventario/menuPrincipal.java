package com.inventario.appinventario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }

    public void irActivos(View view){
        Intent i = new Intent(this, RegistroActivos.class);
        startActivity(i);
    }

    public void irConsultas(View view){
        Intent i = new Intent(this, Consultas.class);
        startActivity(i);
    }

    public void irRegistro(View view){
        Intent i = new Intent(this, registro.class);
        startActivity(i);
    }

    public void irBajas(View view){
        Intent i = new Intent(this, bajas.class);
        startActivity(i);
    }

    public void irSalidas(View view){
        Intent i = new Intent(this, Salidas.class);
        startActivity(i);
    }

    public void irIngresos(View view){
        Intent i = new Intent(this, Ingresos.class);
        startActivity(i);
    }

}