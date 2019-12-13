package com.example.app_cd;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetalleProducto extends AppCompatActivity{
    Button btn_inicio,btn_carrito,agregar_car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_producto);

        btn_inicio=findViewById(R.id.btn_inicio);
        btn_carrito=findViewById(R.id.btn_carrito);
        agregar_car=findViewById(R.id.agregar_car);

        btn_inicio.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(DetalleProducto.this,Tienda.class));
                finish();
            }
        });
        btn_carrito.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(DetalleProducto.this,Carrito.class));
                finish();
            }
        });
        agregar_car.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(DetalleProducto.this,Carrito.class));
                finish();
            }
        });

    }

}
