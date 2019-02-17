<%-- 
    Document   : addTransaksi
    Created on : Feb 18, 2019, 1:04:21 AM
    Author     : Krizz2ND
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="${pageContext.servletContext.contextPath}/transaksi/pinjam" method="post">
            <div>
                <label for="bukuId">Pilih Buku</label>
                    <select name="bukuId" id="bukuId">
                        <option value="1">Java fundamental 12</option>
                        <option value="2">Java Middle 13</option>
                        <option value="1">Java Pro 14</option>
                        <option value="1">Java Prooo sangat 15</option>
                    </select>
            </div>
            <div>
                <label for="pengunjungId">Pilih pengunjung</label>
                    <select>
                        <option value="1">wakwaw</option>
                        <option value="2">brwonia</option>
                        <option value="1">nina</option>
                        <option value="1">senina</option>
                    </select>
            </div>
            <div>
                <button type="submit">Submit</button>
                <button type="reset">Reset</button>
            </div>
        </form>
    </body>
</html>
