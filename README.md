# catatan

<!DOCTYPE html>
<html>
    <head>
        <title>Form Pendaftaran Siswa</title>

    </head>

    <body>
        <h1>
            Pendaftaran Siswa SMA Pelita
        </h1>
        <form method="POST"
        action="sukses.php">
        <table border="0">

            <tr>
                <td>Nama Lengkap </td>
                <td colspan="3"><input
                type="text" name="nama"/></td>
            </tr>

            <tr>
                <td>Nama Panggilan </td>
                <td colspan="3"><input
                type="text" name="panggil"/></td>
            </tr>

            <tr>
                <td>Tempat Lahir </td>
                <td colspan="3"><input
                type="text" name="tempat"/></td>
            </tr>

        
        </table>
        <input type="submit" value="simpan" />
    
    </form>


    </body>
</html>




<?php

    $nama = $_POST['nama'];

    $panggil = $_POST['panggil']; 

    $tempat = $_POST['tempat'];

 ?>
 
 <html>
    <head>
        <title>Form Pendaftaran Siswa</title>

    </head>

    <body>
        <h1>
            Pendaftaran Siswa SMA Pelita
        </h1>

        <?php
            echo "<p>Halo ".$panggil." Terimakasih sudah mengisi form "



