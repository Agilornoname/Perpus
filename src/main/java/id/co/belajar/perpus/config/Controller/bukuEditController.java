/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.belajar.perpus.config.Controller;

import id.co.belajar.perpus.config.dao.bukuDao;
import id.co.belajar.perpus.model.Buku;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Krizz2ND
 */
@WebServlet(urlPatterns = "/buku/ubah")
public class bukuEditController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Integer get = Integer.valueOf(req.getParameter("kodeBuku"));
            bukuDao bd = new bukuDao();
            bd.findById(get);
            req.setAttribute("buku", bd.findById(get));
            req.getRequestDispatcher("/pages/buku/editBuku.jsp").forward(req, resp);
        } catch (SQLException ex) {
            Logger.getLogger(bukuEditController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            Buku bu = new Buku();
            bu.setNo(Integer.valueOf(req.getParameter("no")));
            bu.setJudul_buku(req.getParameter("judulBuku"));
            bu.setTahun_terbit(Integer.valueOf(req.getParameter("tahunTerbit")));
            bu.setPengarang(req.getParameter("pengarang"));
            bu.setJml_buku(Integer.valueOf(req.getParameter("jumlahBuku")));
            bukuDao bd = new bukuDao();
            bd.update(bu);
        } catch (SQLException ex) {
            Logger.getLogger(bukuEditController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
