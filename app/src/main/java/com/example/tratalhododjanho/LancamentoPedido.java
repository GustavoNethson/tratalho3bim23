package com.example.tratalhododjanho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class LancamentoPedido extends AppCompatActivity {

    private Spinner spSelecaoCliente;

    private Spinner spSelecionarProduto;

    private EditText etQuantProd;

    private EditText etValUnit;

    private Button btAdicionarAoCarrinho;

    private EditText etListaPedido;

    private EditText etListaValores;

    private EditText etListaValoresTotais;

    private Button btFinalizarPedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lancamento_pedido);

        spSelecaoCliente = findViewById(R.id.spSelecaoCliente);
        spSelecionarProduto = findViewById(R.id.spSelecionarProduto);
        etQuantProd = findViewById(R.id.etQuantProd);
        etValUnit = findViewById(R.id.etValUnit);
        btAdicionarAoCarrinho = findViewById(R.id.btAdicionarAoCarrinho);
        etListaPedido = findViewById(R.id.etListaPedido);
        etListaValores = findViewById(R.id.etListaValores);
        etListaValoresTotais = findViewById(R.id.etListaValoresTotais);
        btFinalizarPedido = findViewById(R.id.btFinalizarPedido);
    }
}