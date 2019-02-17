<%-- 
    Document   : addTransaksi
    Created on : Feb 18, 2019, 1:04:21 AM
    Author     : Krizz2ND
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
                    <c:forEach items="${listBuku}" var="qqq" varStatus="qwe">
                        <option value="${qqq.id}">${qqq.judul_buku} ${qqq.jml_buku}</option>
                    </c:forEach>
                </select>
            </div>
            <div>
                <label for="pengunjungId">Pilih peminjam</label>
                <select>
                    <c:forEach items="${listPeminjam}" var="b" varStatus="qwe">
                        <option value="${b.id}">${b.nama} ${b.alamat}</option>
                    </c:forEach>
                </select>
            </div>
            <div>
                <button type="submit">Submit</button>
                <button type="reset">Reset</button>
            </div>
        </form>
    </body>
</html>
