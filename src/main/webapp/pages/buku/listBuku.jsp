<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
    <head>
        <title>List buku</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    </head>
    <body>
        <h2>Cari data Anda</h2>

        <input type="search" class="light-table-filter" data-table="table table-striped" placeholder="Filtrer" />
        <hr>

        <table class="table table-striped">
            <thead>
                <tr>
                    <th>NO</th>
                    <th>Judul Buku</th>
                    <th>Tahun terbit</th>
                    <th>Pengarang</th>
                    <th>Jumlah Buku</th>
                    <th>Aksi</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${twerk}" var="qqq" varStatus="qwe">
                    <tr>
                        <td>${qwe.count}</td>
                        <td>${qqq.judul_buku}</td>
                        <td>${qqq.tahun_terbit}</td>
                        <td>${qqq.pengarang}</td>
                        <td>${qqq.jml_buku}</td>
                        <td><a href="${pageContext.servletContext.contextPath}/buku/ubah?kodeBuku=${qqq.no}" class="btn btn-success btn-md">Update</a>  <a href="${pageContext.servletContext.contextPath}/buku/delete?kodeBuku=${qqq.no}" class="btn btn-danger btn-md">Delete</a>
                        </td>
                    </tr>
                </c:forEach>   
            </tbody>
        </table>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
    </body>
</html>