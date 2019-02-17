/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.belajar.perpus.config.transaksiController;

import id.co.belajar.perpus.config.dao.bukuDao;
import id.co.belajar.perpus.config.dao.peminjamDao;
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
@WebServlet(urlPatterns = "/transaksi/pinjam")
public class addTransaksi extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            bukuDao bd = new bukuDao();
            peminjamDao pd = new peminjamDao();
            pd.findAll();
            
            req.setAttribute("listBuku", bd.findAll());
            req.setAttribute("listPeminjam", pd.findAll());
            req.getRequestDispatcher("/pages/Transaksi/addTransaksi.jsp").forward(req, resp);
        } catch (SQLException ex) {
            Logger.getLogger(addTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
