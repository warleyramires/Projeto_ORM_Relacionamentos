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
import java.sql.PreparedStatement;

import repository.Dao;

/**
 *
 * @author Warley Ramires
 */
public class ClienteDao extends Dao<Cliente> {
    
    private static ClienteDao conexao;

    private ClienteDao() {
    }
    
    public static ClienteDao pegarConexao(){
        if(conexao==null) return conexao = new ClienteDao();
        else return conexao;
    }
    
    
   
    
    public static final String TABLE = "cliente";

    @Override
    public String getInsertSQL() {
        return "INSERT INTO " + TABLE + "(cpf, nome) values(?, ?)";
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

            cliente = new Cliente();
            cliente.setId(resultSet.getLong("id"));
            cliente.setCpf(resultSet.getLong("cpf"));
            cliente.setNome(resultSet.getString("nome"));

        } catch (SQLException e) {

            //Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cliente;
    }

    @Override
    public String getSelectAllSQL() {
        return "select id, cpf, nome"
                + " from Cliente"
                + " where exlcuido = false";
    }

    @Override
    public String getSelectByIdSQL() {
        return "select id, cpf, nome"
                + " from Cliente where id = ?";
    }

    @Override
    public void createInsertOrUpdateSQL(PreparedStatement pstmt, Cliente e) {
        try {
            pstmt.setObject(1, e.getCpf(), java.sql.Types.NUMERIC);
            pstmt.setObject(2, e.getNome(), java.sql.Types.VARCHAR);

            // Just for the update
            if (e.getId() != null) {
                pstmt.setLong(3, e.getId());
            }

        } catch (SQLException ex) {

            //Logger.getLogger(e.getNome()).log(Level.SEVERE, null, ex);
        }

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
