package com.example.tratalhododjanho.;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btCadastrarCliente;

    private Button btCadastrarProduto;

    private Button btPedidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btCadastrarCliente = findViewById(R.id.btCadastrarCliente);
        btCadastrarProduto = findViewById(R.id.btCadastrarProduto);
        btPedidos = findViewById(R.id.btPedidos);

        btCadastrarCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {abrirCadastroCliente();}
        });

        btCadastrarProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {abrirCadastroProduto();}
        });

        btPedidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {abrirLancamentoPedido();}
        });
    }

    private void abrirCadastroCliente(){
        Intent intent = new Intent(MainActivity.this, CadastroCliente.class);

        startActivity(intent);
    }

    private void abrirCadastroProduto(){
        Intent intente = new Intent(MainActivity.this, CadastroProdutos.class);

        startActivity(intente);
    }

    private void abrirLancamentoPedido(){
        Intent intent = new Intent(MainActivity.this, LancamentoPedido.class);

        startActivity(intent);
    }

}