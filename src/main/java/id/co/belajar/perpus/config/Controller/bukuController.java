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
@WebServlet(urlPatterns = "/buku/new")
public class bukuController extends HttpServlet {

    Buku bu = new Buku();
    bukuDao bd = new bukuDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/pages/buku/tambahBuku.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            bu.setJudulBuku(req.getParameter("judulBuku"));
            bu.setTahunTerbit(Integer.valueOf(req.getParameter("tahunTerbit")));
            bu.setPengarang(req.getParameter("pengarang"));
            bu.setJmlBuku(Integer.valueOf(req.getParameter("jumlahBuku")));
            bd.save(bu);
        } catch (SQLException ex) {
            Logger.getLogger(bukuController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
