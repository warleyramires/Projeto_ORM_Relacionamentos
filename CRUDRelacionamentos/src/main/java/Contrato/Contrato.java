/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contrato;

import Cliente.Cliente;
import Entity.Entity;
import java.time.LocalDate;

/**
 *
 * @author Warley Ramires
 */
public class Contrato extends Entity {

    Cliente cliente;
    private String redacao;
    private LocalDate ultimaAtualizacao;

    public Contrato() {
    }

    public Contrato(Long id, String redacao, LocalDate ultimaAtualizacao) {
        setId(id);

        setRedacao(redacao);

        setUltimaAtualizacao(ultimaAtualizacao);

    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getRedacao() {
        return redacao;
    }

    public void setRedacao(String redacao) {
        try {
            if (redacao.length() <= 100000) {
                this.redacao = redacao;
            } else {
                throw new IllegalArgumentException("A redação deve ter no máximo 100000 caracteres.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public LocalDate getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(LocalDate ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    @Override
    public String toString() {
        return "Contrato{"
                + ", redacao=" + redacao
                + ", ultimaAtualizacao=" + ultimaAtualizacao
                + '}';
    }

}
