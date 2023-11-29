/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.util.Date;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author USER HP
 */
public class Notifikasi {
    private AnggotaPerpustakaan penerima;
    private TransaksiPeminjaman transaksi;
    private String pesan;
    private Date waktu;

    public Notifikasi(TransaksiPeminjaman transaksi) {
        this.transaksi = transaksi;
    }
    
    public int Durasi() {
        Date awal = transaksi.getTanggalPeminjaman();
        Date akhir = transaksi.getTanggalPengembalian();
        long selisihMilidetik = akhir.getTime() - awal.getTime();
        int durasi = (int) TimeUnit.MILLISECONDS.toDays(selisihMilidetik);
        return durasi;
    }

    
    public void pesan(){
        Date now = new Date();
        if(this.Durasi() ==1){
            System.out.println("Batas peminjaman Anda tinggal " + this.Durasi() + " Hari");
        }else if(this.Durasi() < 0){
            System.out.println("Kena Denda");
        }
    }
}

