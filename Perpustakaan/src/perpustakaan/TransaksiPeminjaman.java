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
import java.util.Date;

public class TransaksiPeminjaman {
    private Date tanggalPeminjaman;
    private Date tanggalPengembalian;
    private ArrayList<Buku> buku = new ArrayList<>();
    private AnggotaPerpustakaan anggota;

    public TransaksiPeminjaman(Date tanggalPeminjaman, Date tanggalPengembalian, AnggotaPerpustakaan anggota) {
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.tanggalPengembalian = tanggalPengembalian;
        this.anggota = anggota;
    }
    public TransaksiPeminjaman(){
        
    }

    public Date getTanggalPeminjaman() {
        return tanggalPeminjaman;
    }

    public Date getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    public ArrayList<Buku> getBuku() {
        return buku;
    }

    public AnggotaPerpustakaan getAnggota() {
        return anggota;
    }

}

