/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.belajar.perpus.config.dao;

import id.co.belajar.perpus.config.koneksiDatabase;
import id.co.belajar.perpus.model.Buku;
import id.co.belajar.perpus.model.Peminjam;
import id.co.belajar.perpus.model.Transaksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author Krizz2ND
 */
public class peminjamDao {

    private PreparedStatement ps;
    private Connection con;
    private DataSource ds;
    private ResultSet rs;
    koneksiDatabase kd;

    private static final String list = "select * from perpus.peminjam";

    public List<Peminjam> findAll() throws SQLException {
        List<Peminjam> la = new ArrayList<>();
        kd = new koneksiDatabase();
        ds = kd.getDataSource();
        con = ds.getConnection();
        ps = con.prepareStatement(list);
        rs = ps.executeQuery();

        while (rs.next()) {
            Peminjam d = new Peminjam();
            d.setId(rs.getInt("Id"));
            d.setAlamat(rs.getString("nama"));
            d.setAlamat(rs.getString("alamat"));
            la.add(d);
        }
        rs.close();
        ps.close();
        con.close();
        return la;
    }

}
