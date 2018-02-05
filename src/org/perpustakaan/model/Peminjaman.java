/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.perpustakaan.model;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Cascade;

/**
 *
 * @author ngarambes
 */
@Entity
@Table(name = "peminjaman")
public class Peminjaman {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_peminjaman")
    @SequenceGenerator(name = "seq_peminjaman", sequenceName = "peminjaman_id_seq", allocationSize = 1)
    private Long id;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "tanggal", nullable = false)
    private Date tanggal;
    
    @OneToMany(mappedBy = "peminjaman", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Cascade(org.hibernate.annotations.CascadeType.DELETE_ORPHAN)
    private List<PeminjamanDetail> peminjamanDetails;
    
    @OneToOne
    @JoinColumn(name = "anggota_id")
    private Anggota anggota;
    
    @OneToOne(mappedBy = "peminjaman", cascade = CascadeType.ALL)
    @Cascade(org.hibernate.annotations.CascadeType.DELETE_ORPHAN)
    private Pengembalian pengembalian;

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
     * @return the peminjamanDetails
     */
    public List<PeminjamanDetail> getPeminjamanDetails() {
        return peminjamanDetails;
    }

    /**
     * @param peminjamanDetails the peminjamanDetails to set
     */
    public void setPeminjamanDetails(List<PeminjamanDetail> peminjamanDetails) {
        this.peminjamanDetails = peminjamanDetails;
    }

    /**
     * @return the anggota
     */
    public Anggota getAnggota() {
        return anggota;
    }

    /**
     * @param anggota the anggota to set
     */
    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    /**
     * @return the pengembalian
     */
    public Pengembalian getPengembalian() {
        return pengembalian;
    }

    /**
     * @param pengembalian the pengembalian to set
     */
    public void setPengembalian(Pengembalian pengembalian) {
        this.pengembalian = pengembalian;
    }
    
}
