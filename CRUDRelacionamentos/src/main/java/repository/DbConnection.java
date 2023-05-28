/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Warley Ramires
 */

public class DbConnection{
    private static final String url = "jdbc:mysql://localhost:3306/atividade3";
    private static final String user = "root";
    private static final String password = "wRamires1997";
    
    private static Connection conn;
    
    public static Connection getConexao(){
        
        try{
            if(conn == null){
            
                conn = DriverManager.getConnection(url, user, password);
                return conn;
            }else{
                return conn;
            }
        }
        catch(SQLException error){
                System.out.println("FALHA AO CRIAR CONEXÃO COM O BD");
                return null;
        }
        
        
    }
        
    
}







//public class DbConnection {
//   
//        public Connection conectaBD(){
//            Connection conn = null;
//            
//            try{
//                String url = "jdbc:mysql://localhost:3306/atividade3?user=root&password=wRamires1997";
//                conn = DriverManager.getConnection(url);
//                
//            }catch(SQLException error){
//                System.out.println("FALHA AO CRIAR CONEXÃO COM O BD");
//            }
//            
//            return conn;
//        };
//        
//        
//        
//}
