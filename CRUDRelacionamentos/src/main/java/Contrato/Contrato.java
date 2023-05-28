/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contrato;

import java.time.LocalDate;

/**
 *
 * @author Warley Ramires
 */
public class Contrato {

    private Long id;
    private String redacao;
    private LocalDate ultimaAtualizacao;

    public Contrato() {
    }

    public Contrato(Long id, String redacao, LocalDate ultimaAtualizacao) {
        this.id = id;
        this.redacao = redacao;
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRedacao() {
        return redacao;
    }

    public void setRedacao(String redacao) {
        this.redacao = redacao;
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
                + "id=" + id
                + ", redacao=" + redacao
                + ", ultimaAtualizacao=" + ultimaAtualizacao
                + '}';
    }

}
