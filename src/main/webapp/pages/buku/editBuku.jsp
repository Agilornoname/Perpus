<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action="${pageContext.servletContext.contextPath}/buku/ubah" method="post" >
            <div class="form-group">
                <label for="name">No</label>
                <input type="hidden" name="no" class="form-control" id="judulBuku" value="${buku.no}">
                <label for="name">judulBuku</label>
                <input type="text" name="judulBuku" class="form-control" id="judulBuku" value="${buku.judul_buku}">
                <label for="alamat">Tahun Terbit</label>
                <input type="text" name="tahunTerbit" class="form-control" id="tahunTerbit" value="${buku.tahun_terbit}">
                <label for="name">pengerang</label>
                <input type="text" name="pengarang" class="form-control" id="pengarang" value="${buku.pengarang}">
                <label for="alamat">jumlah Buku</label>
                <input type="text" name="jumlahBuku" class="form-control" id="jumlahBuku" value="${buku.jml_buku}">
                <button type="submit">Kirim</button>
                <button type="reset">Reset</button>
            </div>
        </form>
    </body>
</html>
