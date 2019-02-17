/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.belajar.perpus.model;

/**
 *
 * @author Krizz2ND
 */
public class Buku {
    private Integer Id;
    private String judul_buku;
    private Integer tahun_terbit;
    private String pengarang;
    private Integer jml_buku;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getJudul_buku() {
        return judul_buku;
    }

    public void setJudul_buku(String judul_buku) {
        this.judul_buku = judul_buku;
    }

    public Integer getTahun_terbit() {
        return tahun_terbit;
    }

    public void setTahun_terbit(Integer tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public Integer getJml_buku() {
        return jml_buku;
    }

    public void setJml_buku(Integer jml_buku) {
        this.jml_buku = jml_buku;
    }
}
