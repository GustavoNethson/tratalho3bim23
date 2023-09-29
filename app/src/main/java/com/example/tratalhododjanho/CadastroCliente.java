package com.example.tratalhododjanho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroCliente extends AppCompatActivity {

    private EditText etNomeCliente;

    private EditText etCPFCliente;

    private Button btSalvarCliente;

    private EditText etMostrarClientes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_cliente);

        etNomeCliente = findViewById(R.id.etNomeCLiente);
        etCPFCliente = findViewById(R.id.etCPFCliente);
        btSalvarCliente = findViewById(R.id.btSalvarCliente);
        etMostrarClientes = findViewById(R.id.etMostrarClientes);
        btSalvarCliente.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                SalvarCliente();
            }
        });

        atualizarLista();

    }

    private void SalvarCliente(){
        int CPFCliente;
        if(etCPFCliente.getText().toString().isEmpty()){
            etCPFCliente.setError("Favor informar o CPF do cliente");
            return;
        }else{
            try {
                CPFCliente = integer.parseInt(etCPFCliente.getText().toString());
            }catch (Exeption ex){
                etCPFCliente.setError("O cpf deve conter apenas numeros");
            }
        }
        if(etNomeCliente.getText().toString().isEmpty()){
            etNomeCliente.setError("Favor informar o nome do Cliente.");
            return;
        }

        Cliente cliente = new Cliente();
        cliente.setNomeCliente(nomeCliente);
        cliente.setCPFCliente(etCPFCliente.getText().toString());

        Controller.getInstancia().salvarCliente(cliente);

        Toast.makeText(CadastroCliente.this, "Cliente Cadastrado com Sucesso!!", Toast.LENGTH_LONG).show();

        finish();

    }

    private void atualizarLista(){
        String texto = "";
        ArrayList<Clientes> lista = controller.getInstancia().retornarCliente();
        for(Clientes produto: lista) {
            texto += produto.getCPFCliente()+" - "+produto.getNomeCliente()+"\n";
        }
        etMostrarClientes.setText(texto);
    }

}