package com.example.app_cd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class Tienda extends AppCompatActivity {

    //DECLARAR BOTONES

    ViewFlipper v_flipper;
    Button btn_carrito,btn_inicio,btn_categorias,prod1,prod2,prod3,prod4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tienda);
        //VALIDAR BOTONES
        btn_inicio=findViewById(R.id.btn_inicio);
        btn_carrito=findViewById(R.id.btn_carrito);
        btn_categorias=findViewById(R.id.btn_categorias);
        prod1=findViewById(R.id.prod1);
        prod2=findViewById(R.id.prod2);
        prod3=findViewById(R.id.prod3);
        prod4=findViewById(R.id.prod4);
        //RUTEAR BOTONES
        btn_inicio.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(Tienda.this,Tienda.class));
                finish();
            }
        });

        btn_categorias.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(Tienda.this,CategoriasP.class));
                finish();
            }
        });

        btn_carrito.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(Tienda.this,Carrito.class));
                finish();
            }
        });
        prod1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(Tienda.this,DetalleProducto.class));
                finish();
            }
        });
        prod2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(Tienda.this,DetalleProducto.class));
                finish();
            }
        });
        prod3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(Tienda.this,DetalleProducto.class));
                finish();
            }
        });
        prod4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(Tienda.this,DetalleProducto.class));
                finish();
            }
        });

        int images [] ={R.drawable.slide1,R.drawable.slide2,R.drawable.slide3};
        v_flipper = findViewById(R.id.v_flipper);

        for (int i =0; i < images.length;i++){
            flipperImages(images[i]);
        }
    }
    public void flipperImages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(4000);
        v_flipper.setAutoStart(true);

        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setInAnimation(this,android.R.anim.slide_out_right);
    }
}