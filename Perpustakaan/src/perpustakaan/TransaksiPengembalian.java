
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

public class TransaksiPengembalian extends TransaksiPeminjaman  {
    TransaksiPeminjaman tp;
    

    public TransaksiPengembalian(TransaksiPeminjaman tp) {
        this.tp = tp;
    }
}

