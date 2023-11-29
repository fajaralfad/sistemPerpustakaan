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
import java.util.Date;

public class Buku {
    private String nomorISBN;
    private String judul;
    private String pengarang;
    private boolean statusKetersediaan;

    public Buku(String nomorISBN, String judul, String pengarang, boolean statusKetersediaan) {
        this.nomorISBN = nomorISBN;
        this.judul = judul;
        this.pengarang = pengarang;
        this.statusKetersediaan = statusKetersediaan;
    }

    public String getNomorISBN() {
        return nomorISBN;
    }

    public void setNomorISBN(String nomorISBN) {
        this.nomorISBN = nomorISBN;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public boolean isStatusKetersediaan() {
        return statusKetersediaan;
    }

    public void setStatusKetersediaan(boolean statusKetersediaan) {
        this.statusKetersediaan = statusKetersediaan;
    }
    
} 


