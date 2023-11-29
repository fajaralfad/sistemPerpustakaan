/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.util.ArrayList;

/**
 *
 * @author USER HP
 */
public class Admin {
    private ArrayList<AnggotaPerpustakaan> anggota = new ArrayList<>();
    private ArrayList<Buku> daftarBuku = new ArrayList<>();
    private ArrayList<TransaksiPeminjaman> transaksi_peminjaman = new ArrayList<>();
    private ArrayList<TransaksiPengembalian> transaksi_pengembalian = new ArrayList<>();
    private int id_admin;
    private String nama_admin;
    
        public void addAnggota(AnggotaPerpustakaan anggota) {
        this.anggota.add(anggota);
    }

    public void setTransaksi_peminjaman(TransaksiPeminjaman transaksi_peminjaman) {
        this.transaksi_peminjaman.add(transaksi_peminjaman);
    }

    public void setTransaksi_pengembalian(TransaksiPengembalian transaksi_pengembalian) {
        this.transaksi_pengembalian.add(transaksi_pengembalian);
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }

    public void setNama_admin(String nama_admin) {
        this.nama_admin = nama_admin;
    }

    public Admin(int id_admin, String nama_admin) {
        this.id_admin = id_admin;
        this.nama_admin = nama_admin;
    }
    
    public void addBuku(Buku buku){
        daftarBuku.add(buku);
    }

    public ArrayList<AnggotaPerpustakaan> getAnggota() {
        return anggota;
    }

    public ArrayList<Buku> getDaftarBuku() {
        return daftarBuku;
    }

    public ArrayList<TransaksiPeminjaman> getTransaksi_peminjaman() {
        return transaksi_peminjaman;
    }

    public ArrayList<TransaksiPengembalian> getTransaksi_pengembalian() {
        return transaksi_pengembalian;
    }

    public int getId_admin() {
        return id_admin;
    }

    public String getName_admin() {
        return nama_admin;
    }
}


