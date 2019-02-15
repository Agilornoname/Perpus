/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.belajar.perpus.config;

import java.sql.SQLException;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author Krizz2ND
 */


public class koneksiDatabase {
    private final static String URL = "jdbc:postgresql://localhost:5432/postgres";
    private final static String username = "postgres";
    private final static String pass = "123456";
    
    public DataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setUsername(username);
        ds.setPassword(pass);
        ds.setUrl(URL);
        return ds;
    }
    
    public static void main(String[] args) throws SQLException {
        koneksiDatabase db = new koneksiDatabase();
        db.getDataSource().getConnection();
    }
}
