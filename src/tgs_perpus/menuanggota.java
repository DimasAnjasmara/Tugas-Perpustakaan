package tgs_perpus;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * menuanggota.java
 *
 * Created on Apr 17, 2017, 10:19:39 PM
 */
/**
 *
 * @author Dimas
 */
public class menuanggota extends javax.swing.JFrame {
     private static Connection koneksi;
     
     public void tampilkandata() {
    
        DefaultTableModel tblanggota = new DefaultTableModel();
        tblanggota.addColumn("id_anggota");
        tblanggota.addColumn("Nama");
        tblanggota.addColumn("Alamat");
        
        try {
            konek();
            String sql = "select * from tbl_anggota";
            Statement stat = (Statement) koneksi.createStatement();
            ResultSet res=stat.executeQuery(sql);
            while (res.next()) {
                tblanggota.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3)});
            }
           tbl_anggota.setModel(tblanggota);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan "+e.getMessage());
        }

    }



    /** Creates new form menuanggota */
    public menuanggota() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_anggota = new javax.swing.JTable();
        btnlihat = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btncari = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtalamat = new javax.swing.JTextField();
        btndatabuku = new javax.swing.JButton();
        btnpinjam = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Data Anggota Perpustakaan");

        tbl_anggota.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbl_anggota);

        btnlihat.setText("Lihat");
        btnlihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlihatActionPerformed(evt);
            }
        });

        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btncari.setText("Cari");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });

        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        jLabel2.setText("ID Anggota");

        jLabel3.setText("Nama");

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });

        jLabel4.setText("Alamat");

        btndatabuku.setText("DATA BUKU");
        btndatabuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndatabukuActionPerformed(evt);
            }
        });

        btnpinjam.setText("PINJAM BUKU");
        btnpinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpinjamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnlihat)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtalamat, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(txtnama, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btndelete))
                            .addComponent(txt_id, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btncari, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnsimpan))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnpinjam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btndatabuku, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsimpan)
                    .addComponent(btncari)
                    .addComponent(btndelete)
                    .addComponent(btnlihat)
                    .addComponent(btnedit))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btndatabuku, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnpinjam, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     
 
    private void btndatabukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndatabukuActionPerformed
        // TODO add your handling code here:
        new menubuku().setVisible(true);
        dispose();
    }//GEN-LAST:event_btndatabukuActionPerformed

    private void btnpinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpinjamActionPerformed
        // TODO add your handling code here:
        new menupinjam().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnpinjamActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
        if((txt_id.getText().equals(""))||(txtnama.getText().equals(""))||(txtalamat.getText().equals("")))
                 
            {
                JOptionPane.showMessageDialog(btnsimpan, "Data Ada Yang Kosong", "INFORMASI", WIDTH, null);
            }
            else 
        {
                Connection c= konek(); //panggil function koneksi
         String sqlkode="Insert into tbl_anggota (id_anggota,Nama,Alamat)values('"+this.txt_id.getText()+"',"
                     + "'"+this.txtnama.getText()+"',"+ "'"+this.txtalamat.getText()+"')";
            try { //jalankan query tersebut
               PreparedStatement p2=(PreparedStatement) c.prepareStatement(sqlkode);
               p2.executeUpdate();
               p2.close();
               
               //tampilkan data
                tampilkandata();
                JOptionPane.showMessageDialog(this, "Simpan Berhasil","Informasi",1);
                
                txt_id.setText("");
                txtnama.setText("");
                txtalamat.setText("");
                btndelete.setEnabled(true);
                btnedit.setEnabled(true);
                txt_id.requestFocus();
           
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Eror"+ex.getMessage());
    }//GEN-LAST:event_btnsimpanActionPerformed
        }
    }
         private void btnlihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlihatActionPerformed
             // TODO add your handling code here:
             tampilkandata();
        txt_id.requestFocus();
        txtnama.requestFocus();
        txtalamat.requestFocus();
        btndelete.setEnabled(true);
        btnedit.setEnabled(true);
         }//GEN-LAST:event_btnlihatActionPerformed

         private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
             // TODO add your handling code here:
             if(txt_id.getText().equals("")){
              JOptionPane.showMessageDialog(this, "Text ID Kosong","Informasi",1);
              txt_id.requestFocus();
          }
        else{
        DefaultTableModel tblanggota = new DefaultTableModel();
        tblanggota.addColumn("Id_anggota");
        tblanggota.addColumn("Nama");
        tblanggota.addColumn("Alamat");
        
        try {
            konek();
            String sql = "Select * from tbl_anggota where id_anggota like '%" +txt_id.getText()+
                    "%'" +"or Nama like '%" + txt_id.getText() + "%'"; 
            Statement stat = (Statement) koneksi.createStatement();
            ResultSet res=stat.executeQuery(sql);
          
            txt_id.setText("");
            txtnama.setText("");
            txtalamat.setText("");
            txt_id.requestFocus();
            
            while (res.next()) {
                tblanggota.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3)});
            }
           tbl_anggota.setModel(tblanggota);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Data Tidak Ditemukan ");
        }
        }
         }//GEN-LAST:event_btncariActionPerformed

         private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
             // TODO add your handling code here:
             if((txt_id.getText().equals(""))||(txtnama.getText().equals(""))||(txtalamat.getText().equals("")))
                 
            {
                JOptionPane.showMessageDialog(btnsimpan, "Data Ada Yang Kosong", "INFORMASI", WIDTH, null);
            }
            else 
        {
                Connection c= konek(); //panggil function koneksi
         String sqlkode="Update tbl_anggota SET Nama='"+this.txtnama.getText()+"'," + "Alamat='"+this.txtalamat.getText()+"',"
                + "Where id_anggota='"+this.txt_id.getText()+"'";
            try { //jalankan query tersebut
               PreparedStatement p2=(PreparedStatement) c.prepareStatement(sqlkode);
               p2.executeUpdate();
               p2.close();
               
               //tampilkan data
                tampilkandata();
                JOptionPane.showMessageDialog(this, "Simpan Berhasil","Informasi",1);
                
                txt_id.setText("");
                txtnama.setText("");
                txtalamat.setText("");
                btndelete.setEnabled(true);
                btnedit.setEnabled(true);
                txt_id.requestFocus();
           
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Eror"+ex.getMessage());
    }
        }
         }//GEN-LAST:event_btneditActionPerformed

         private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
             // TODO add your handling code here:
             if((txt_id.getText().equals(""))||(txtnama.getText().equals(""))||(txtalamat.getText().equals("")))
                 
            {
                JOptionPane.showMessageDialog(btnsimpan, "Data Ada Yang Kosong", "INFORMASI", WIDTH, null);
            }
            else 
        {
                Connection c= konek(); //panggil function koneksi
         String sqlkode="Delete from tbl_anggota "
                 + "Where id_anggota='"+this.txt_id.getText()+"'";
            try { //jalankan query tersebut
               PreparedStatement p2=(PreparedStatement) c.prepareStatement(sqlkode);
               p2.executeUpdate();
               p2.close();
               
               //tampilkan data
                tampilkandata();
                JOptionPane.showMessageDialog(this, "Simpan Berhasil","Informasi",1);
                
                txt_id.setText("");
                txtnama.setText("");
                txtalamat.setText("");
                btndelete.setEnabled(true);
                btnedit.setEnabled(true);
                txt_id.requestFocus();
           
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Eror"+ex.getMessage());
    }
        }
         }//GEN-LAST:event_btndeleteActionPerformed
        
    
    
    public static void main(String args[]) {
         java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new menuanggota().setVisible(true);
            }
        });
    }

       
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncari;
    private javax.swing.JButton btndatabuku;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnlihat;
    private javax.swing.JButton btnpinjam;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_anggota;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
