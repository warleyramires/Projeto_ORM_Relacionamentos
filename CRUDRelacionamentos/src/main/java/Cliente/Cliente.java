/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

import java.util.ArrayList;
import Entity.Entity;
import Contrato.Contrato;

/**
 *
 * @author Warley Ramires
 */
public class Cliente extends Entity {

    private Long cpf;
    private String nome;
    private ArrayList<Contrato> contratos;

    public Cliente() {
        contratos = new ArrayList<>();
    }

    public Cliente(Long id, Long cpf, String nome, ArrayList<Contrato> contratos) {
        setId(id);
        this.cpf = cpf;
        this.nome = nome;
        this.contratos = contratos;
    }



    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
       this.cpf = cpf;
    }
    
    public String getNome() {
        return nome;
        


    }

    public ArrayList<Contrato> getContratos() {
        return contratos;
    }

    public void addContrato(Contrato contrato) {
        contratos.add(contrato);
    }
}
