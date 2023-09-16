package com.inventario.appinventario;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class bajas extends AppCompatActivity {

    Button actualizar;
    EditText codigo, equipo, estado, encargado, ubicacion;
    private FirebaseFirestore mfirestore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bajas);

        mfirestore = FirebaseFirestore.getInstance();

        codigo = findViewById(R.id.codigo);
        equipo = findViewById(R.id.equipo);
        estado = findViewById(R.id.estado);
        encargado = findViewById(R.id.encargado);
        ubicacion = findViewById(R.id.ubicacion);
        actualizar = findViewById(R.id.actualizar);

        actualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String codigoAc = codigo.getText().toString().trim();
                String equipoAc = equipo.getText().toString().trim();
                String estadoAc = estado.getText().toString().trim();
                String encargadoAc = encargado.getText().toString().trim();
                String ubicacionAc = ubicacion.getText().toString().trim();

                if (codigoAc.isEmpty() && equipoAc.isEmpty() && estadoAc.isEmpty() && encargadoAc.isEmpty() && ubicacionAc.isEmpty() ){
                    Toast.makeText(getApplicationContext(), "Ingrese los Datos", Toast.LENGTH_SHORT).show();

                }else{
                    postPet(codigoAc, equipoAc, estadoAc, encargadoAc, ubicacionAc);
                }
            }
        });


    }
    private void postPet(String codigoAc, String equipoAc, String estadoAc, String encargadoAc, String ubicacionAc ) {
        Map<String, Object> map = new HashMap<>();
        map.put("codigo", codigoAc);
        map.put("equipo", equipoAc);
        map.put("estado", estadoAc);
        map.put("encargado", encargadoAc);
        map.put("ubicacion", ubicacionAc);
        mfirestore.collection("Activos").add(map).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
            @Override
            public void onSuccess(DocumentReference documentReference) {
                Toast.makeText(getApplicationContext(), "Datos Actualizados", Toast.LENGTH_SHORT).show();
                finish();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(getApplicationContext(), "Ingrese los Datos", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }


}