package Contrato;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import repository.Dao;

public class ContratoDao extends Dao<Contrato> {
    
    public static final String TABLE = "contrato";

    @Override
    public String getInsertSQL() {
       return "INSERT INTO " + TABLE + "(redacao, ultimaAtualizacao) values (?, ?)";
    }

    @Override
    public String getUpdateSQL() {
        return "UPDATE " + TABLE + " SET redacao = ?, ultimaAtualizacao = ? where id = ?";
    }

    @Override
    public String getSelectAllSQL() {
         return "select id, redacao, ultimaAtualizacao"
                + " from Contrato"
                + " where exlcuido = false";

    }

    @Override
    public String getSelectByIdSQL() {
        return 
                "select id, redacao, ultimaAtualizacao"
                + " from Contrato where id = ?";
    }

    @Override
    public void createInsertOrUpdateSQL(PreparedStatement pstmt, Contrato e) {
        
         try
        {
            pstmt.setObject(1, e.getRedacao(), java.sql.Types.VARCHAR);
            pstmt.setObject(2, e.getUltimaAtualizacao(), java.sql.Types.DATE);

            // Just for the update
            if (e.getId() != null)
            {
                pstmt.setLong(3, e.getId());
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
            contrato.setUltimaAtualizacao(resultSet.getDate("ultimaAtualizacao").toLocalDate());
        }catch(SQLException e){
            Logger.getLogger(ContratoDao.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return contrato;
    
    }
    

}