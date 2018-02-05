/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.perpustakaan.report;

/**
 *
 * @author ngarambes
 */
public class LaporanPeminjamanHarian {
    private String peminjam;
    private String judul;

    /**
     * @return the peminjam
     */
    public String getPeminjam() {
        return peminjam;
    }

    /**
     * @param peminjam the peminjam to set
     */
    public void setPeminjam(String peminjam) {
        this.peminjam = peminjam;
    }

    /**
     * @return the judulBuku
     */
    public String getJudul() {
        return judul;
    }

    /**
     * @param judul the judulBuku to set
     */
    public void setJudul(String judul) {
        this.judul = judul;
    }
    
}
