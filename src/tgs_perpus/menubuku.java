/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * menubuku.java
 *
 * Created on Apr 17, 2017, 10:31:46 PM
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
public class menubuku extends javax.swing.JFrame {
    private static Connection koneksi;
     
     public void tampilkandata() {
    
        DefaultTableModel tblbuku = new DefaultTableModel();
        tblbuku.addColumn("id_buku");
        tblbuku.addColumn("Judul");
        tblbuku.addColumn("Penulis");
        tblbuku.addColumn("Pengarang");
        tblbuku.addColumn("Penerbit");
        
        try {
            konek();
            String sql = "select * from tbl_buku";
            Statement stat = (Statement) koneksi.createStatement();
            ResultSet res=stat.executeQuery(sql);
            while (res.next()) {
                tblbuku.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5)});
            }
           tbl_buku.setModel(tblbuku);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan "+e.getMessage());
        }
     }
    /** Creates new form menubuku */
    public menubuku() {
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
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_buku = new javax.swing.JTable();
        btnlihat = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btncari = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtpenulis = new javax.swing.JTextField();
        txtjudul = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        btnanggota = new javax.swing.JButton();
        btnpinjam = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtpengarang = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtpenerbit = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Data Buku Perpustakaan");

        tbl_buku.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbl_buku);

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

        jLabel2.setText("ID Buku");

        jLabel3.setText("Judul");

        jLabel4.setText("Penulis");

        txtjudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjudulActionPerformed(evt);
            }
        });

        btnanggota.setText("DATA ANGGOTA");
        btnanggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanggotaActionPerformed(evt);
            }
        });

        btnpinjam.setText("PINJAM BUKU");
        btnpinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpinjamActionPerformed(evt);
            }
        });

        jLabel5.setText("Pengarang");

        jLabel6.setText("Penerbit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addComponent(btnlihat))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpenerbit, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(txtpengarang, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(txtjudul, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addComponent(btndelete))
                            .addComponent(txt_id, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(txtpenulis, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnpinjam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btncari, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnsimpan))
                            .addComponent(btnanggota, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlihat)
                    .addComponent(btnedit)
                    .addComponent(btndelete)
                    .addComponent(btncari)
                    .addComponent(btnsimpan))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtjudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtpenulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtpengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnanggota, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnpinjam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtpenerbit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnanggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanggotaActionPerformed
        // TODO add your handling code here:
        new menuanggota().setVisible(true);
        dispose();
}//GEN-LAST:event_btnanggotaActionPerformed

    private void btnpinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpinjamActionPerformed
        // TODO add your handling code here:
        new menupinjam().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnpinjamActionPerformed

    private void txtjudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjudulActionPerformed

    private void btnlihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlihatActionPerformed
        // TODO add your handling code here:
        tampilkandata();
    }//GEN-LAST:event_btnlihatActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
        if((txt_id.getText().equals(""))||(txtjudul.getText().equals(""))||(txtpenulis.getText().equals(""))||(txtpengarang.getText().equals(""))||(txtpenerbit.getText().equals("")))
                 
            {
                JOptionPane.showMessageDialog(btnsimpan, "Data Ada Yang Kosong", "INFORMASI", WIDTH, null);
            }
            else 
        {
                Connection c= konek(); //panggil function koneksi
         String sqlkode="Insert into tbl_buku (id_buku,Judul,Penulis,Pengarang,Penerbit)values('"+this.txt_id.getText()+"',"
                     + "'"+this.txtjudul.getText()+"',"+ "'"+this.txtpenulis.getText()+"',"+"'"+this.txtpengarang.getText()+"',"+ "'"+this.txtpenerbit.getText()+"')";
            try { //jalankan query tersebut
               PreparedStatement p2=(PreparedStatement) c.prepareStatement(sqlkode);
               p2.executeUpdate();
               p2.close();
               
               //tampilkan data
                tampilkandata();
                JOptionPane.showMessageDialog(this, "Simpan Berhasil","Informasi",1);
                
                txt_id.setText("");
                txtjudul.setText("");
                txtpenulis.setText("");
                txtpengarang.setText("");
                txtpenerbit.setText("");
                btndelete.setEnabled(true);
                btnedit.setEnabled(true);
                txt_id.requestFocus();
           
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Eror"+ex.getMessage());
    }                                         
        }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        if((txt_id.getText().equals(""))||(txtjudul.getText().equals(""))||(txtpenulis.getText().equals(""))
               ||(txtpengarang.getText().equals(""))||(txtpenerbit.getText().equals("")) )
                 
            {
                JOptionPane.showMessageDialog(btnsimpan, "Data Ada Yang Kosong", "INFORMASI", WIDTH, null);
            }
            else 
        {
                Connection c= konek(); //panggil function koneksi
         String sqlkode="Update tbl_buku SET Judul='"+this.txtjudul.getText()+"'," + "Penulis='"+this.txtpenulis.getText()+"',"
                + "Where id_buku='"+this.txt_id.getText()+"'";
            try { //jalankan query tersebut
               PreparedStatement p2=(PreparedStatement) c.prepareStatement(sqlkode);
               p2.executeUpdate();
               p2.close();
               
               //tampilkan data
                tampilkandata();
                JOptionPane.showMessageDialog(this, "Simpan Berhasil","Informasi",1);
                
                txt_id.setText("");
                txtjudul.setText("");
                txtpenulis.setText("");
                txtpengarang.setText("");
                txtpenerbit.setText("");
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
         if((txt_id.getText().equals(""))||(txtjudul.getText().equals(""))||(txtpenulis.getText().equals(""))
               ||(txtpengarang.getText().equals(""))||(txtpenerbit.getText().equals("")) )
                 
            {
                JOptionPane.showMessageDialog(btnsimpan, "Data Ada Yang Kosong", "INFORMASI", WIDTH, null);
            }
            else 
        {
                Connection c= konek(); //panggil function koneksi
         String sqlkode="Delete from tbl_buku "
                 + "Where id_buku='"+this.txt_id.getText()+"'";
            try { //jalankan query tersebut
               PreparedStatement p2=(PreparedStatement) c.prepareStatement(sqlkode);
               p2.executeUpdate();
               p2.close();
               
               //tampilkan data
                tampilkandata();
                JOptionPane.showMessageDialog(this, "Simpan Berhasil","Informasi",1);
                
                txt_id.setText("");
                txtjudul.setText("");
                txtpenulis.setText("");
                txtpengarang.setText("");
                txtpenerbit.setText("");
                btndelete.setEnabled(true);
                btnedit.setEnabled(true);
                txt_id.requestFocus();
           
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Eror"+ex.getMessage());
    }
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblbuku = new DefaultTableModel();
        tblbuku.addColumn("id_buku");
        tblbuku.addColumn("Judul");
        tblbuku.addColumn("Penulis");
        tblbuku.addColumn("Pengarang");
        tblbuku.addColumn("Penerbit");
        
        try {
            konek();
            String sql = "Select * from tbl_buku where id_buku like '%" +txt_id.getText()+
                    "%'" +"or Judul like '%" + txt_id.getText() + "%'"; 
            Statement stat = (Statement) koneksi.createStatement();
            ResultSet res=stat.executeQuery(sql);
                txt_id.setText("");
                txtjudul.setText("");
                txtpenulis.setText("");
                txtpengarang.setText("");
                txtpenerbit.setText("");
                btndelete.setEnabled(true);
                btnedit.setEnabled(true);
                txt_id.requestFocus();
                while (res.next()) {
                tblbuku.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5)});
            }
           tbl_buku.setModel(tblbuku);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan "+e.getMessage());
        }
    }//GEN-LAST:event_btncariActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new menubuku().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnanggota;
    private javax.swing.JButton btncari;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnlihat;
    private javax.swing.JButton btnpinjam;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_buku;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txtjudul;
    private javax.swing.JTextField txtpenerbit;
    private javax.swing.JTextField txtpengarang;
    private javax.swing.JTextField txtpenulis;
    // End of variables declaration//GEN-END:variables
}
