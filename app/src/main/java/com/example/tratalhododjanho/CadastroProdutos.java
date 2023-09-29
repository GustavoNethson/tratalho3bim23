package com.example.tratalhododjanho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroProdutos extends AppCompatActivity {

    private EditText etCodProduto;

    private EditText etDescProduto;

    private EditText etValUnitProduto;

    private Button btSalvarProduto;

    private EditText etListaProdutosCadastrados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_produtos);

        etCodProduto = findViewById(R.id.etCodProduto);
        etDescProduto = findViewById(R.id.etDescProduto);
        etListaProdutosCadastrados = findViewById(R.id.etListaProdutosCadastrados);
        etValUnitProduto = findViewById(R.id.etValUnitProduto);
        btSalvarProduto = findViewById(R.id.btSalvarProduto);
        btSalvarProduto.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                SalvarProduto();
            }
        });

        atualizarLista();

    }

    private void SalvarProduto(){
        int codProd;
        if(etCodProduto.getText().toString().isEmpty()){
            etCodProduto.setError("Favor informe o código do produto");
            return;
        }else{
            try {
                codProd = integer.parseInt(etCodProduto.getText().toString());
            }catch (Exeption ex){
                etCodProduto.setError("O código deve conter apenas numeros");
            }
        }
        if(etDescProduto.getText().toString().isEmpty()){
            etDescProduto.setError("Favor informar o nome do produto.");
            return;
        }

        Produto produto = new produto();
        produto.setCodProd(CodProd);
        produto.setNomProd(etDescProduto.getText().toString());

        Controller.getInstancia().salvarProduto(produto);

        Toast.makeText(CadastroProdutos.this, "Produto Cadastrado com Sucesso!!", Toast.LENGTH_LONG).show();

        finish();

    }

    private void atualizarLista(){
        String texto = "";
        ArrayList<Produto> lista = Controller.getInstancia().retornaProduto();
        for(Produto produto: lista) {
            texto += produto.getCodProd()+" - "+produto.getDesc()+"\n";
        }
        etListaProdutosCadastrados.setText(texto);
    }

}