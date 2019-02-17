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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author Krizz2ND
 */
public class bukuDao {

    private static final String simpan = "insert into perpus.buku (judul_buku,tahun_terbit,pengarang,jml_buku) values (?,?,?,?)";
    private static final String list = "select Id , judul_buku , tahun_terbit , pengarang , jml_buku  from perpus.buku";
    private static final String delete = "delete from perpus.buku where Id = ?";
    private static final String findById = "select * from perpus.buku where Id = ?";
    private static final String update = "UPDATE perpus.buku set judul_buku = ? , tahun_terbit = ? , pengarang = ? , jml_buku = ? WHERE Id=?";
    private PreparedStatement ps;
    private Connection con;
    private DataSource ds;
    private ResultSet rs;
    koneksiDatabase kd;

    public void save(Buku d) throws SQLException {
        kd = new koneksiDatabase();
        ds = kd.getDataSource();
        con = ds.getConnection();
        ps = con.prepareStatement(simpan);
        ps.setString(1, d.getJudul_buku());
        ps.setInt(2, d.getTahun_terbit());
        ps.setString(3, d.getPengarang());
        ps.setInt(4, d.getJml_buku());
        ps.executeUpdate();
        ps.close();
        con.close();

    }

    public void update(Buku bk) throws SQLException {
        Buku d = new Buku();
        kd = new koneksiDatabase();
        ds = kd.getDataSource();
        con = ds.getConnection();
        ps = con.prepareStatement(update);

        ps.setString(1, bk.getJudul_buku());
        ps.setInt(2, bk.getTahun_terbit());
        ps.setString(3, bk.getPengarang());
        ps.setInt(4, bk.getJml_buku());
        ps.setInt(5, bk.getId());

        ps.executeUpdate();
        
        ps.close();
        con.close();
    }

    public void delete(Integer hapus) throws SQLException {
        kd = new koneksiDatabase();
        ds = kd.getDataSource();
        con = ds.getConnection();
        ps = con.prepareStatement(delete);
        ps.setInt(1, hapus);
        ps.executeUpdate();
        ps.close();
        con.close();

    }

    public List<Buku> findAll() throws SQLException {

        List<Buku> lb = new ArrayList<>();
        kd = new koneksiDatabase();
        ds = kd.getDataSource();
        con = ds.getConnection();
        ps = con.prepareStatement(list);
        rs = ps.executeQuery();

        while (rs.next()) {
            Buku d = new Buku();
            d.setId(rs.getInt("Id"));
            d.setJudul_buku(rs.getString("judul_buku"));
            d.setTahun_terbit(rs.getInt("tahun_terbit"));
            d.setPengarang(rs.getString("pengarang"));
            d.setJml_buku(rs.getInt("jml_buku"));
            lb.add(d);
        }
        rs.close();
        ps.close();
        con.close();
        return lb;
    }

    public Buku findById(Integer IdBuku) throws SQLException {
        Buku d = new Buku();
        kd = new koneksiDatabase();
        ds = kd.getDataSource();
        con = ds.getConnection();
        ps = con.prepareStatement(findById);
        ps.setInt(1, IdBuku);
        rs = ps.executeQuery();

        if (rs.next()) {
            d.setId(rs.getInt("Id"));
            d.setJudul_buku(rs.getString("judul_buku"));
            d.setTahun_terbit(rs.getInt("tahun_terbit"));
            d.setPengarang(rs.getString("pengarang"));
            d.setJml_buku(rs.getInt("jml_buku"));
        }
        rs.close();
        ps.close();
        con.close();
        return d;
    }
}
