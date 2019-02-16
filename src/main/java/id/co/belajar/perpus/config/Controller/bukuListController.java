/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.belajar.perpus.config.Controller;

import id.co.belajar.perpus.config.dao.bukuDao;
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
@WebServlet(urlPatterns = "/buku/list")
public class bukuListController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            bukuDao bd = new bukuDao();
            req.setAttribute("twerk", bd.findAll());
        } catch (SQLException ex) {
            Logger.getLogger(bukuListController.class.getName()).log(Level.SEVERE, null, ex);
        }
        req.getRequestDispatcher("/pages/buku/listBuku.jsp").forward(req, resp);
    }

}
