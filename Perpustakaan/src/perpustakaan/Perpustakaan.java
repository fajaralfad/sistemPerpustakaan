package perpustakaan;

import java.util.ArrayList;
import java.util.Date;

public class Perpustakaan {

    public static void main(String[] args) {
        Admin admin = new Admin(1, "Admin Perpustakaan");

        Buku buku1 = new Buku("234", "Harry Portal", "JK ROLLER", true);
        Buku buku2 = new Buku("232", "Lord of The jack", "Dobby", true);

        admin.addBuku(buku1);
        admin.addBuku(buku2);

        AnggotaPerpustakaan anggota = new AnggotaPerpustakaan(101, "Ahlan Sayyid", "Kobum");

        admin.addAnggota(anggota);

        Date tanggalPeminjaman = new Date(2023,11,28);
        Date tanggalPengembalian = new Date(2023,12,1); 
        TransaksiPeminjaman transaksiPeminjaman = new TransaksiPeminjaman(tanggalPeminjaman, tanggalPengembalian, anggota);

        admin.setTransaksi_peminjaman(transaksiPeminjaman);

        anggota.pinjamBuku(buku1, transaksiPeminjaman);

        TransaksiPengembalian transaksiPengembalian = new TransaksiPengembalian(transaksiPeminjaman);
        anggota.kembalikanBuku(buku1, transaksiPengembalian);

        anggota.cariBuku("Lord of The jack", admin);

        Notifikasi notifikasi = new Notifikasi(transaksiPeminjaman);

        notifikasi.pesan();
    }
    
}
