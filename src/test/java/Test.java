
import id.co.belajar.perpus.config.dao.bukuDao;
import java.sql.SQLException;
import junit.framework.TestCase;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Krizz2ND
 */
public class Test extends TestCase {

    bukuDao bd = new bukuDao();
    
    @org.junit.Test
    public void testSave() throws SQLException {

        bd.save();
    }
}
