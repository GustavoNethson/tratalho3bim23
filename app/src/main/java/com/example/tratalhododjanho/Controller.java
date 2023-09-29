package com.example.tratalhododjanho;

import java.util.ArrayList;

public class Controller {

    private static Controller instancia;

    private ArrayList<Cliente> listaClientes;

    private ArrayList<Produto> listaProdutos;

    public static Controller getInstancia(){
        if(instancia == null){
            return  instancia = new Controller();
        }else {
            return instancia;
        }
    }
    public void salvarcliente(Cliente cliente) {listaClientes.add(cliente);}

    public ArrayList<Cliente> retornarCliente() {return listaClientes;}

    public void salvarProduto(Produto produto) {listaProdutos.add(Produto);}

    public ArrayList<Produto> retornaProduto() {return listaProdutos;}

}
