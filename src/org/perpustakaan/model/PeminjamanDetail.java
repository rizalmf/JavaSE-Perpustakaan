/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.perpustakaan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author ngarambes
 */
@Entity
@Table(name = "peminjaman_detail")
public class PeminjamanDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pd")
    @SequenceGenerator(name = "seq_pd", sequenceName = "pd_id_seq", allocationSize = 1)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "peminjaman_id", nullable = false)
    private Peminjaman peminjaman;
    
    @ManyToOne
    @JoinColumn(name = "buku_id", nullable = false)
    private Buku buku;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the peminjaman
     */
    public Peminjaman getPeminjaman() {
        return peminjaman;
    }

    /**
     * @param peminjaman the peminjaman to set
     */
    public void setPeminjaman(Peminjaman peminjaman) {
        this.peminjaman = peminjaman;
    }

    /**
     * @return the buku
     */
    public Buku getBuku() {
        return buku;
    }

    /**
     * @param buku the buku to set
     */
    public void setBuku(Buku buku) {
        this.buku = buku;
    }
}
