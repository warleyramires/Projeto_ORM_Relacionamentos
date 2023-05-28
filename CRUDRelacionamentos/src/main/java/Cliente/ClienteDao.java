/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

import java.security.PublicKey;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.mysql.cj.x.protobuf.MysqlxNotice.Warning.Level;

import repository.Dao;

/**
 *
 * @author Warley Ramires
 */
public class ClienteDao extends Dao<Cliente> {

    public static final String TABLE = "cliente";

    @Override
    public String getInsertSQL() {
        return "INSERT INTO " + TABLE + " (cpf, nome) values(?, ?, ?)";
    }

    @Override
    public String getUpdateSQL() {
        return "UPDATE " + TABLE + " SET cpf = ?, nome = ? where id = ?";
    }

    @Override
    public Cliente extractObject(ResultSet resultSet) {
        Cliente cliente = null;

        try {
            cliente = new Cliente();

            cliente.setCpf(resultSet.getLong("cpf"));
            cliente.setNome(resultSet.getString("nome"));
            cliente.
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return cliente;
    }
}

//
// CREATE TABLE cliente (
// id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
// cpf BIGINT NOT NULL,
// nome VARCHAR(200) NOT NULL

// );

// CREATE TABLE

// cliente (
// id BIGINT AUTO_INCREMENT PRIMARY KEY,

// cpf VARCHAR(11) NOT NULL,

// nome VARCHAR(200) NOT NULL
// );

//