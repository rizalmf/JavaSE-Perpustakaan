/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.perpustakaan.ui.transaksi.peminjaman;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.perpustakaan.Main;
import org.perpustakaan.model.Peminjaman;
import org.perpustakaan.model.PeminjamanDetail;

/**
 *
 * @author ngarambes
 */
public class FormPeminjaman_Riwayat extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormPeminjaman_Riwayat
     */
    private DefaultTableModel tabmode;
    void showRiwayat(){
        Object[] column = {"Id Peminjaman", "Peminjam", "Tanggal"};
        Object[][] data = new Object[Main.getpemiPeminjamanService().getPeminjamans().size()][3];
        int i = 0;
        for(Peminjaman p: Main.getpemiPeminjamanService().getPeminjamans()){
            Object[] arr_data = {p.getId(), p.getAnggota().getNama(), p.getTanggal()};
            data[i] = arr_data;
            i++;
        }
        tabmode = new DefaultTableModel(data, column);
        tabelRiwayat.setModel(tabmode);
    }
    public FormPeminjaman_Riwayat() {
        initComponents();
        showRiwayat();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelRiwayat = new javax.swing.JTable();
        bDetail = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        bKeluar = new javax.swing.JButton();

        jLabel1.setText("RIWAYAT PEMINJAMAN");

        tabelRiwayat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(tabelRiwayat);

        bDetail.setText("Detail");
        bDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDetailActionPerformed(evt);
            }
        });

        bHapus.setText("Hapus");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        bKeluar.setText("Keluar");
        bKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bDetail)
                        .addGap(18, 18, 18)
                        .addComponent(bHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bKeluar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDetail)
                    .addComponent(bHapus)
                    .addComponent(bKeluar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKeluarActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_bKeluarActionPerformed

    private void bDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDetailActionPerformed
        int tabel = tabelRiwayat.getSelectedRow();
        if (tabel == -1){
            JOptionPane.showMessageDialog(null, "Pilih salah satu riwayyat");
            return;
        }
        Long id = Long.parseLong(tabelRiwayat.getValueAt(tabel, 0).toString());
       // Main.peminjaman = new Peminjaman();
       // List<PeminjamanDetail> pd = new ArrayList<>();
       // Main.peminjaman.setPeminjamanDetails(pd);
        Main.peminjaman = Main.getpemiPeminjamanService().getPeminjaman(id);
        
        FormPeminjaman fp = new FormPeminjaman(Main.peminjaman.getAnggota().getNama());
        JDesktopPane desktopPane = getDesktopPane();
        desktopPane.add(fp);
        this.setEnabled(false);
        fp.setVisible(true);
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_bDetailActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        int tabel = tabelRiwayat.getSelectedRow();
        if(tabel == -1){
            JOptionPane.showMessageDialog(null, "Pilih salah satu riwayat");
            return;
        }
        String nama = tabelRiwayat.getValueAt(tabel, 1).toString();
        int confirm = JOptionPane.showConfirmDialog(null, "Hapus riwayat peminjaman?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
        if(confirm == JOptionPane.OK_OPTION){
            Long id = Long.parseLong(tabelRiwayat.getValueAt(tabel, 0).toString());
            Main.peminjaman = Main.getpemiPeminjamanService().getPeminjaman(id);
            Main.getpemiPeminjamanService().delete(Main.peminjaman);
            showRiwayat();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_bHapusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDetail;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bKeluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelRiwayat;
    // End of variables declaration//GEN-END:variables
}
