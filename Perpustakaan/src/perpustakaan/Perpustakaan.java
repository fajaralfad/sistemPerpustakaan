/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author USER HP
 */
public class Perpustakaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek Admin
        Admin admin = new Admin(1, "Admin Perpustakaan");

        // Membuat beberapa objek Buku
        Buku buku1 = new Buku("1234567890", "Judul Buku 1", "Pengarang 1", true);
        Buku buku2 = new Buku("0987654321", "Judul Buku 2", "Pengarang 2", true);

        // Menambahkan buku ke daftar buku admin
        admin.addBuku(buku1);
        admin.addBuku(buku2);

        // Membuat objek AnggotaPerpustakaan
        AnggotaPerpustakaan anggota = new AnggotaPerpustakaan(101, "Nama Anggota", "Alamat Anggota");

        // Menambahkan anggota ke daftar anggota admin
        admin.addAnggota(anggota);

        // Membuat objek TransaksiPeminjaman
        Date tanggalPeminjaman = new Date();
        Date tanggalPengembalian = new Date(tanggalPeminjaman.getTime() + (1000 * 60 * 60 * 24 * 7)); // Contoh pengembalian seminggu setelah peminjaman
        TransaksiPeminjaman transaksiPeminjaman = new TransaksiPeminjaman(tanggalPeminjaman, tanggalPengembalian, anggota);

        // Menambahkan transaksi peminjaman ke daftar transaksi peminjaman admin
        admin.setTransaksi_peminjaman(transaksiPeminjaman);

        // Meminjam buku oleh anggota
        anggota.pinjamBuku(buku1, transaksiPeminjaman);

        // Mengembalikan buku oleh anggota
        TransaksiPengembalian transaksiPengembalian = new TransaksiPengembalian(transaksiPeminjaman);
        anggota.kembalikanBuku(buku1, transaksiPengembalian);

        // Mencari buku oleh anggota
        anggota.cariBuku("Judul Buku 2", admin);

        // Membuat objek Notifikasi
        Notifikasi notifikasi = new Notifikasi(transaksiPeminjaman);

        // Menampilkan pesan notifikasi
        notifikasi.pesan();
    }
    
}
