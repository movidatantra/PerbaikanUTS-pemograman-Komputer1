/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author HP
 */
public class koneksi {
  
   try{
            MysqlDataSource m = new MysqlDataSource();
            m.setDatabaseName("mahasiswa2");
            m.setUser("root"); 
            m.setPassword(""); 
            m.setServerName("localhost"); 
            m.setPortNumber(3306); 
            m.setServerTimezone("Asia/Jakarta"); 
            Connection h = m.getConnection();
            System.out.println("Sukses!");
          
          
            return h;
        } catch (SQLException e) {
            System.err.println("Error: "+e.getMessage());
        }
        
        return null;
    }

    

    
    
    

