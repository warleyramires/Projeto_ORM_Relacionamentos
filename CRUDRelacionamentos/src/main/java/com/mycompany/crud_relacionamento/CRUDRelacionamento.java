package com.mycompany.crud_relacionamento;

import Cliente.ClienteDao;
import Cliente.Cliente;
import Contrato.Contrato;
import Contrato.ContratoDao;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import repository.Dao;

public class CRUDRelacionamento {

    public static void main(String[] args) {

        // Inserindo Cliente Ana Zaíra
        Cliente cliente1 = new Cliente();
        cliente1.setCpf(11929826303l);

        try {
            cliente1.setNome("Ana Zaíra");
        } catch (Exception ex) {
            Logger.getLogger(CRUDRelacionamento.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Contratos de Ana Zaíra
        // Contrato 1
        Contrato contrato1 = new Contrato();
        contrato1.setRedacao("Contrato por tempo determinado");
        contrato1.setUltimaAtualizacao(LocalDate.parse("21/05/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        contrato1.setCliente(cliente1);
        contrato1.setId(1L);

        // Contrato 2
        Contrato contrato2 = new Contrato();
        contrato2.setRedacao("Contrato por tempo determinado");
        contrato2.setUltimaAtualizacao(LocalDate.parse("01/05/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        contrato2.setCliente(cliente1);
        contrato2.setId(2L);

        // Contrato 3
        Contrato contrato3 = new Contrato();
        contrato3.setRedacao("Contrato por tempo determinado");
        contrato3.setUltimaAtualizacao(LocalDate.parse("26/05/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        contrato3.setCliente(cliente1);
        contrato3.setId(3L);

        // Cliente Beatriz Yana
        Cliente cliente2 = new Cliente();
        cliente2.setCpf(26752965030L);

        try {
            cliente2.setNome("Beatriz Yana");
        } catch (Exception ex) {
            Logger.getLogger(CRUDRelacionamento.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Inserindo Contratos de Beatriz Yana
        // Inserindo Contrato 4
        Contrato contrato4 = new Contrato();
        contrato4.setRedacao("Contrato de estágio");
        contrato4.setUltimaAtualizacao(LocalDate.parse("15/10/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        contrato4.setCliente(cliente2);
        contrato4.setId(4L);

        // Inserindo Contrato 5
        Contrato contrato5 = new Contrato();
        contrato5.setRedacao("Contrato de experiência");
        contrato5.setUltimaAtualizacao(LocalDate.parse("16/09/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        contrato5.setCliente(cliente2);
        contrato5.setId(5L);

        // Inserindo Contrato 6
        Contrato contrato6 = new Contrato();
        contrato6.setRedacao("Contrato de teletrabalho");
        contrato6.setUltimaAtualizacao(LocalDate.parse("17/08/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        contrato6.setCliente(cliente2);
        contrato6.setId(6L);

        // Inserindo Contrato 7
        Contrato contrato7 = new Contrato();
        contrato7.setRedacao("Contrato intermitente");
        contrato7.setUltimaAtualizacao(LocalDate.parse("15/07/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        contrato7.setCliente(cliente2);
        contrato7.setId(7L);

        cliente1.addContrato(contrato1);
        cliente1.addContrato(contrato2);
        cliente1.addContrato(contrato3);

        cliente2.addContrato(contrato4);
        cliente2.addContrato(contrato5);
        cliente2.addContrato(contrato6);
        cliente2.addContrato(contrato7);

        System.out.println(cliente1);
        System.out.println("\n");
        System.out.println(cliente2);

        ClienteDao.pegarConexao().saveOrUpdate(cliente1);
        ClienteDao.pegarConexao().saveOrUpdate(cliente2);

        ContratoDao.pegarConexao().saveOrUpdate(contrato1);
        ContratoDao.pegarConexao().saveOrUpdate(contrato2);
        ContratoDao.pegarConexao().saveOrUpdate(contrato3);
        ContratoDao.pegarConexao().saveOrUpdate(contrato4);
        ContratoDao.pegarConexao().saveOrUpdate(contrato5);
        ContratoDao.pegarConexao().saveOrUpdate(contrato6);
        ContratoDao.pegarConexao().saveOrUpdate(contrato7);
    }
}
