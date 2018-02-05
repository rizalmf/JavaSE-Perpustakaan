/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.perpustakaan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author ngarambes
 */
@Entity
@Table(name = "buku")
public class Buku {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_buku")
    @SequenceGenerator(name = "seq_buku", sequenceName = "buku_id_seq", allocationSize = 1)
    private Long id;
    
    @Column(name = "judul", length = 100, nullable = false)
    private String judul;
    
    @Column(name = "pengarang", length = 100, nullable = false)
    private String pengarang;
    
    @Column(name = "penerbit", length = 100, nullable = false)
    private String penerbit;

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
     * @return the judul
     */
    public String getJudul() {
        return judul;
    }

    /**
     * @param judul the judul to set
     */
    public void setJudul(String judul) {
        this.judul = judul;
    }

    /**
     * @return the pengarang
     */
    public String getPengarang() {
        return pengarang;
    }

    /**
     * @param pengarang the pengarang to set
     */
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    /**
     * @return the penerbit
     */
    public String getPenerbit() {
        return penerbit;
    }

    /**
     * @param penerbit the penerbit to set
     */
    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
    
}
