/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.perpustakaan.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ngarambes
 */
@Entity
@Table(name = "pengembalian")
public class Pengembalian {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pengembalian")
    @SequenceGenerator(name = "seq_pengembalian", sequenceName = "pengembalian_id_seq", allocationSize = 1)
    private Long id;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "tanggal", nullable = true)
    private Date tanggal;
    
    @OneToOne
    @JoinColumn(name = "peminjaman_id", nullable = false)
    private Peminjaman peminjaman;

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
     * @return the tanggal
     */
    public Date getTanggal() {
        return tanggal;
    }

    /**
     * @param tanggal the tanggal to set
     */
    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
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
}
