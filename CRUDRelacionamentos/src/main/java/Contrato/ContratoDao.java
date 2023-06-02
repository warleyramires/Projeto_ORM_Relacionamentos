package Contrato;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import repository.Dao;

public class ContratoDao extends Dao<Contrato> {
        private static ContratoDao conexao;
        private ContratoDao() {
    }
    
    public static ContratoDao pegarConexao(){
        if(conexao==null) return conexao = new ContratoDao();
        else return conexao;
    }
    
    
    public static final String TABLE = "contrato";

    @Override   
    public String getInsertSQL() {
       return "INSERT INTO " + TABLE + "(redacao, ultima_atualizacao,cliente_id) values (?, ?, ?)";
    }

    @Override
    public String getUpdateSQL() {
        return "UPDATE " + TABLE + " SET redacao = ?, ultima_atualizacao = ?, cliente_id = ? where id = ?";
    }

    @Override
    public String getSelectAllSQL() {
         return "select id, redacao, ultima_atualizacao cliente_id"
                + " from Contrato"
                + " where exlcuido = false"; // fix

    }

    @Override
    public String getSelectByIdSQL() {
        return 
                "select id, redacao, ultima_atualizacao, cliente_id"
                + " from Contrato where id = ?";
    }

    @Override
    public void createInsertOrUpdateSQL(PreparedStatement pstmt, Contrato e) {
        
         try
        {
            pstmt.setObject(1, e.getRedacao(), java.sql.Types.VARCHAR);
            pstmt.setObject(2, e.getUltimaAtualizacao(), java.sql.Types.DATE);
            pstmt.setLong(3, e.getCliente().getId());
            // Just for the update
            if (e.getId() != null)
            {
                pstmt.setLong(4, e.getId());
            }

        } catch (SQLException ex)
        {
            Logger.getLogger(e.getRedacao()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Contrato extractObject(ResultSet resultSet) {
        Contrato contrato = null;
            
        try{
            contrato = new Contrato();
            contrato.setId(resultSet.getLong("id"));
            contrato.setRedacao(resultSet.getString("redacao"));
            contrato.setUltimaAtualizacao(resultSet.getDate("ultima_atualizacao").toLocalDate());
        }catch(SQLException e){
            Logger.getLogger(ContratoDao.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return contrato;
    
    }
    

}