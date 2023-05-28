/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author Warley Ramires
 */
public class Cliente {
    
    //private Long id;
    private Long cpf;
    private String nome;
    private ArrayList<Contrato> contratos;

    public Cliente() {
        contratos = new ArrayList<>();
    }

    public Cliente(/*Long id*/ Long cpf, String nome, ArrayList<Contrato> contratos) {
        //this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.contratos = contratos;
    }
    
    

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Contrato> getContratos() {
        return contratos;
    }

    public void setContratos(ArrayList<Contrato> contratos) {
        this.contratos = contratos;
    }
    
    
    
}
