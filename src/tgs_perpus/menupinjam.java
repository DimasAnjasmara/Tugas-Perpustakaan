/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * menupinjam.java
 *
 * Created on Apr 17, 2017, 9:35:59 PM
 */
package tgs_perpus;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dimas
 */
public class menupinjam extends javax.swing.JFrame {
    private static Connection koneksi;
     
     public void tampilkandata() {
    DefaultTableModel tblpinjam = new DefaultTableModel();
        tblpinjam.addColumn("id_anggota");
        tblpinjam.addColumn("id_buku");
        tblpinjam.addColumn("tgl_pinjam");
        tblpinjam.addColumn("tgl_kembali");
        tblpinjam.addColumn("Denda");
        
        try {
            konek();
            String sql = "select * from tbl_pinjam";
            Statement stat = (Statement) koneksi.createStatement();
            ResultSet res=stat.executeQuery(sql);
            while (res.next()) {
                tblpinjam.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5)});
            }
           tbl_pinjam.setModel(tblpinjam);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan "+e.getMessage());
        }
     }
    
    public menupinjam() {
        initComponents();
    }
    
private static Connection konek(){
        if (koneksi==null) {
            try {
                String driver = "com.mysql.jdbc.Driver";
                String url="jdbc:mysql://localhost:3306/anggota"; 
                String user="root"; 
                String password="";
               
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi=(Connection) DriverManager.getConnection(url,user,password);
                
            }catch (SQLException t) {
                JOptionPane.showMessageDialog(null,"Terjadi kesalahan "+t.getMessage());
            }
        }
     return koneksi;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtanggota = new javax.swing.JTextField();
        txtbuku = new javax.swing.JTextField();
        txtpinjam = new javax.swing.JTextField();
        txtkembali = new javax.swing.JTextField();
        txtdenda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_pinjam = new javax.swing.JTable();
        btnsimpan = new javax.swing.JButton();
        btntampil = new javax.swing.JButton();
        btncari = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnbuku = new javax.swing.JButton();
        btnanggota = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("id_anggota");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pinjaman Buku");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel3.setText("id_buku");

        jLabel4.setText("tgl_pinjam");

        jLabel5.setText("tgl_kembali");

        jLabel6.setText("Denda");

        txtkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkembaliActionPerformed(evt);
            }
        });

        tbl_pinjam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_pinjam);

        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btntampil.setText("Tampil");
        btntampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntampilActionPerformed(evt);
            }
        });

        btncari.setText("Cari");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });

        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnbuku.setText("DATA BUKU");
        btnbuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbukuActionPerformed(evt);
            }
        });

        btnanggota.setText("DATA ANGGOTA");
        btnanggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanggotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnbuku, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnanggota, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnsimpan)
                            .addGap(18, 18, 18)
                            .addComponent(btntampil)
                            .addGap(18, 18, 18)
                            .addComponent(btncari)
                            .addGap(18, 18, 18)
                            .addComponent(btnhapus))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(46, 46, 46)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtbuku)
                                .addComponent(txtpinjam)
                                .addComponent(txtkembali)
                                .addComponent(txtanggota)
                                .addComponent(txtdenda, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtanggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtbuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtkembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtdenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, 0, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnhapus)
                            .addComponent(btncari)
                            .addComponent(btntampil)
                            .addComponent(btnsimpan)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnanggota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnbuku, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
        if((txtanggota.getText().equals(""))||(txtbuku.getText().equals(""))||(txtpinjam.getText().equals(""))||(txtkembali.getText().equals(""))||(txtdenda.getText().equals("")))
                 
            {
                JOptionPane.showMessageDialog(btnsimpan, "Data Ada Yang Kosong", "INFORMASI", WIDTH, null);
            }
            else 
        {
                Connection c= konek(); //panggil function koneksi
         String sqlkode="Insert into tbl_pinjam (id_anggota,id_buku,tgl_pinjam,tgl_kembali,denda)values('"+this.txtanggota.getText()+"',"
                     + "'"+this.txtbuku.getText()+"',"+ "'"+this.txtpinjam.getText()+"',"+"'"+this.txtkembali.getText()+"',"+ "'"+this.txtdenda.getText()+"')";
            try { //jalankan query tersebut
               PreparedStatement p2=(PreparedStatement) c.prepareStatement(sqlkode);
               p2.executeUpdate();
               p2.close();
               
               //tampilkan data
                tampilkandata();
                JOptionPane.showMessageDialog(this, "Simpan Berhasil","Informasi",1);
                
                txtbuku.setText("");
                txtanggota.setText("");
                txtpinjam.setText("");
                txtkembali.setText("");
                txtdenda.setText("");
                btnhapus.setEnabled(true);
                btnsimpan.setEnabled(true);
                txtanggota.requestFocus();
           
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Eror"+ex.getMessage());
    }                                         
        }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnbukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbukuActionPerformed
        // TODO add your handling code here:
        new menubuku().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnbukuActionPerformed

    private void btnanggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanggotaActionPerformed
        // TODO add your handling code here:
        new menuanggota().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnanggotaActionPerformed

    private void txtkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkembaliActionPerformed

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblpinjam = new DefaultTableModel();
        tblpinjam.addColumn("id_anggota");
        tblpinjam.addColumn("id_buku");
        tblpinjam.addColumn("tgl_pinjam");
        tblpinjam.addColumn("tgl_kembali");
        tblpinjam.addColumn("Denda");
        
        try {
            konek();
            String sql = "Select * from tbl_pinjam where id_buku like '%" +txtanggota.getText()+
                    "%'" +"or id_anggota like '%" + txtanggota.getText() + "%'"; 
            Statement stat = (Statement) koneksi.createStatement();
            ResultSet res=stat.executeQuery(sql);
            
                txtbuku.setText("");
                txtanggota.setText("");
                txtpinjam.setText("");
                txtkembali.setText("");
                txtdenda.setText("");
                btnhapus.setEnabled(true);
                btnsimpan.setEnabled(true);
                txtanggota.requestFocus();
                while (res.next()) {
                tblpinjam.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5)});
            }
           tbl_pinjam.setModel(tblpinjam);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Eror"+ex.getMessage());
    }                                         
        
    }//GEN-LAST:event_btncariActionPerformed

    private void btntampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntampilActionPerformed
        // TODO add your handling code here:
        tampilkandata();
    }//GEN-LAST:event_btntampilActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
        if((txtanggota.getText().equals(""))||(txtbuku.getText().equals(""))||(txtpinjam.getText().equals(""))
               ||(txtkembali.getText().equals(""))||(txtdenda.getText().equals("")) )
                 
            {
                JOptionPane.showMessageDialog(btnsimpan, "Data Ada Yang Kosong", "INFORMASI", WIDTH, null);
            }
            else 
        {
                Connection c= konek(); //panggil function koneksi
         String sqlkode="Delete from tbl_pinjam " 
                 + "Where id_anggota='"+this.txtanggota.getText()+"'";
            try { //jalankan query tersebut
               PreparedStatement p2=(PreparedStatement) c.prepareStatement(sqlkode);
               p2.executeUpdate();
               p2.close();
               
               //tampilkan data
                tampilkandata();
                JOptionPane.showMessageDialog(this, "Simpan Berhasil","Informasi",1);
                txtbuku.setText("");
                txtanggota.setText("");
                txtpinjam.setText("");
                txtkembali.setText("");
                txtdenda.setText("");
                btnhapus.setEnabled(true);
                btnsimpan.setEnabled(true);
                txtanggota.requestFocus();
    }//GEN-LAST:event_btnhapusActionPerformed
                catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Eror"+ex.getMessage());
    }         
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new menupinjam().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnanggota;
    private javax.swing.JButton btnbuku;
    private javax.swing.JButton btncari;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btntampil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_pinjam;
    private javax.swing.JTextField txtanggota;
    private javax.swing.JTextField txtbuku;
    private javax.swing.JTextField txtdenda;
    private javax.swing.JTextField txtkembali;
    private javax.swing.JTextField txtpinjam;
    // End of variables declaration//GEN-END:variables
}
