package com.example.app_cd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CategoriasP extends AppCompatActivity {
    Button btn_inicio,btn_carrito,btn_chocolates,btn_caramelos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias_p);
        btn_inicio=findViewById(R.id.btn_inicio);
        btn_carrito=findViewById(R.id.btn_carrito);
        btn_chocolates=findViewById(R.id.btn_chocolates);
        btn_caramelos=findViewById(R.id.btn_caramelos);

        btn_inicio.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(CategoriasP.this,Tienda.class));
                finish();
            }
        });
        btn_carrito.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(CategoriasP.this,Carrito.class));
                finish();
            }
        });
        btn_chocolates.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(CategoriasP.this,CatChocolates.class));
                finish();
            }
        });
        btn_caramelos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(CategoriasP.this,catCaramelos.class));
                finish();
            }
        });
    }
}
