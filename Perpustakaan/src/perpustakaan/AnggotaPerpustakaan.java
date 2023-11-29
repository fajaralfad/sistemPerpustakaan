/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

/**
 *
 * @author USER HP
 */
import java.util.ArrayList;
import java.util.List;

public class AnggotaPerpustakaan {
    private int nomorAnggota;
    private String nama;
    private String alamat;
    private ArrayList<TransaksiPeminjaman> transaksi_peminjaman = new ArrayList<>();
    private ArrayList<Buku> buku = new ArrayList<>();

    public AnggotaPerpustakaan(int nomorAnggota, String nama, String alamat) {
        this.nomorAnggota = nomorAnggota;
        this.nama = nama;
        this.alamat = alamat;
    }

    public int getNomorAnggota() {
        return nomorAnggota;
    }

    public void setNomorAnggota(int nomorAnggota) {
        this.nomorAnggota = nomorAnggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public ArrayList<TransaksiPeminjaman> getTransaksi_peminjaman() {
        return transaksi_peminjaman;
    }

    public ArrayList<Buku> getBuku() {
        return buku;
    }

    public void pinjamBuku(Buku buku, TransaksiPeminjaman transaksi) {
        if(buku.isStatusKetersediaan()){
            this.getBuku().add(buku);
            buku.setStatusKetersediaan(false);
            System.out.println("Pinjam Buku Berhasil");
            return;
        }
        System.out.println("Buku tidak tersedia");
    }

    public void kembalikanBuku(Buku buku, TransaksiPengembalian transaksi) {
         if(!buku.isStatusKetersediaan()){
            this.getBuku().remove(buku);
            buku.setStatusKetersediaan(true);
            System.out.println("Pengembalian Buku Berhasil");
            return;
    }

        System.out.println("Buku tidak tersedia");
    }

    public void cariBuku(String cari, Admin a){
        for(Buku i : a.getDaftarBuku() ){
            if(i.getJudul().equals(cari)){
                System.out.println("Nama Buku : " + i.getJudul());
                System.out.println("ISBN : " + i.getNomorISBN());
                System.out.println("Pengarang " + i.getPengarang());
                System.out.println("Tersedia :  " +  (i.isStatusKetersediaan() ? "Ada" : "Tidak Ada"));
                return;
            }    
        }

    }

}

