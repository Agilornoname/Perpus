/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.belajar.perpus.config.dao;

import id.co.belajar.perpus.config.koneksiDatabase;
import id.co.belajar.perpus.model.Buku;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author Krizz2ND
 */
public class bukuDao {

    private static final String simpan = "insert into perpus.buku (judul_buku,tahun_terbit,pengarang,jml_buku) values (?,?,?,?)";
    private PreparedStatement ps;
    private Connection con;

    public void save() throws SQLException {
        koneksiDatabase kd = new koneksiDatabase();
        DataSource ds = kd.getDataSource();
        con = ds.getConnection();
        ps = con.prepareStatement(simpan);
        ps.setString(1, "Belajar java kode");
        ps.setInt(2, 2017);
        ps.setString(3, "Asal");
        ps.setInt(4, 4);
        ps.executeUpdate();
        ps.close();
        con.close();

    }
    void update() {

    }

    void delete() {

    }

    public List<Buku> findAll() {
        return null;
    }

    public Buku findById(Integer idBuku) {
        return null;
    }
}
