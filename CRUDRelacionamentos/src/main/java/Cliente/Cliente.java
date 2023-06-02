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

    public Cliente(Long id, Long cpf, String nome) {

        setId(id);
        setCpf(cpf);
        setNome(nome);

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

    public void setNome(String nome) {
         try {
            if (nome.length() <= 45) {
                this.nome = nome;
            } else {
                throw new IllegalArgumentException("O nome deve ter no máximo 45 caracteres.");
            }
        } catch (IllegalArgumentException e) {
            // Tratar a exceção, por exemplo, exibir uma mensagem de erro ou registrar o erro em um log
            System.out.println("Erro: " + e.getMessage());
        }    }

    public ArrayList<Contrato> getContratos() {
        return contratos;
    }
    
    public void setContratos(ArrayList<Contrato> contratos) {
        this.contratos = contratos;
        
    }

    public void addContrato(Contrato contrato) {
        contratos.add(contrato);
        contrato.setCliente(this);
    }
    
       @Override
    public String toString() {
        return "Cliente{"
                + "cpf=" + cpf
                + ", nome=" + nome
                + ", contratos=\n" + contratos.toString()
                + '}';
    }

}
