/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlnhanvien.view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import qlnhanvien.controller.TrinhDo_controller;

/**
 *
 * @author nhatnguyen
 */
public class TrinhDo_panel extends javax.swing.JPanel {

    
    int flag = 0;

    public TrinhDo_panel() {
        initComponents();
        EnableECRUD();
        DataTable();
        Authen();
    }

    public void Authen(){
        if(Login.role == 1){
            btnAdd.setEnabled(false);
            btnUpdate.setEnabled(false);
            btnDelete.setEnabled(false);
        }
    }
    public void DataTable() {
        String[] columns = {"Mã trình độ", "Tên trình độ", "Trạng thái"};
        DefaultTableModel model;
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        tblTrinhDo.setModel(model);
        TrinhDo_controller ctrl = new TrinhDo_controller();
        String matdhv = "";
        String tentd = "";
        String trangthai = "";
        for (int i = 0; i < ctrl.getDataTable().size(); i++) {

            matdhv = ctrl.getDataTable().get(i).getMatdhv();
            tentd = ctrl.getDataTable().get(i).getTentd();

            switch (String.valueOf(ctrl.getDataTable().get(i).getTrangthai())) {
                case "1":
                    trangthai = "Active";
                    break;
                case "0":
                    trangthai = "Disactive";
                    break;

            }
            model.addRow(new Object[]{
                matdhv, tentd, trangthai
            });
        }

    }

    public void EnableECRUD() {
        btnSave.setEnabled(false);
        btnCancel.setEnabled(false);

        btnAdd.setEnabled(true);
        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);

    }

    public void DisableECRUD() {
        btnSave.setEnabled(true);
        btnCancel.setEnabled(true);

        btnAdd.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDelete = new javax.swing.JButton();
        txtMaTD = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTenTD = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTrinhDo = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        chbTrangThai = new javax.swing.JCheckBox();
        btnCancel = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icdelete.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel11.setText("Tên trình độ:");

        btnAdd.setBackground(new java.awt.Color(0, 102, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icadd.png"))); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        tblTrinhDo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblTrinhDo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblTrinhDo.setFillsViewportHeight(true);
        tblTrinhDo.setRowHeight(30);
        tblTrinhDo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTrinhDoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTrinhDo);

        jLabel14.setText("Trạng thái:");

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icsave.png"))); // NOI18N
        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        chbTrangThai.setText("Còn hoạt động");

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iccancel.png"))); // NOI18N
        btnCancel.setText("Hủy");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 102, 102));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icreload.png"))); // NOI18N
        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel10.setText("Mã trình độ:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chbTrangThai)
                    .addComponent(txtMaTD, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                    .addComponent(txtTenTD))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdd)
                        .addComponent(btnUpdate)
                        .addComponent(btnDelete))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSave)
                        .addComponent(btnCancel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtMaTD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtTenTD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chbTrangThai)
                            .addComponent(jLabel14))
                        .addContainerGap())
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        TrinhDo_controller ctrl = new TrinhDo_controller();
        String matdhv = txtMaTD.getText();
        String tentd = txtTenTD.getText();
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa \"" + tentd + "\" khỏi danh sách không?", "Xác nhận", dialogButton);

        if (dialogResult == JOptionPane.YES_NO_OPTION) {
            int rowDeleted = ctrl.get_Delete_TrinhDo(matdhv);
            if (rowDeleted > 0) {
                JOptionPane.showMessageDialog(this, "Xóa trình độ thành công");
                DataTable();
            } else {
                JOptionPane.showMessageDialog(this, "Xóa trình độ thất bại");
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        flag = 1;
        DisableECRUD();
    }//GEN-LAST:event_btnAddActionPerformed

    private void tblTrinhDoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTrinhDoMouseClicked
        int row = tblTrinhDo.getSelectedRow();
        txtMaTD.setText(tblTrinhDo.getValueAt(row, 0).toString());
        txtTenTD.setText(tblTrinhDo.getValueAt(row, 1).toString());
        if (tblTrinhDo.getValueAt(row, 2).toString().trim().equals("Active")) {
            chbTrangThai.setSelected(true);
        } else {
            chbTrangThai.setSelected(false);
        }
    }//GEN-LAST:event_tblTrinhDoMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        TrinhDo_controller ctrl = new TrinhDo_controller();
        String matdhv = txtMaTD.getText().trim();
        String tentd = txtTenTD.getText();
        int trangthai;
        if (chbTrangThai.isSelected()) {
            trangthai = 1;
        } else {
            trangthai = 0;
        }

        if (matdhv.equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ thông tin, nhập lại!");
        } else if (tentd.equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ thông tin, nhập lại!");
        } else {
            switch (flag) {
                case 1:
                    int rowInserted = ctrl.get_Insert_TrinhDo(matdhv, tentd, trangthai);
                    if (rowInserted > 0) {
                        JOptionPane.showMessageDialog(this, "Thêm trình độ thành công");
                        EnableECRUD();
                        DataTable();

                    } else {
                        JOptionPane.showMessageDialog(this, "Mã trình độ đã tồn tại");
                    }
                    break;

                case 2:
                    int rowUpdated = ctrl.get_Update_TrinhDo(matdhv, tentd, trangthai);
                    if (rowUpdated > 0) {
                        JOptionPane.showMessageDialog(this, "Sửa trình độ thành công");
                        EnableECRUD();
                        DataTable();

                    } else {
                        JOptionPane.showMessageDialog(this, "Sửa trình độ thất bại!");
                    }
                    break;
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        EnableECRUD();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        flag = 2;
        DisableECRUD();
        txtMaTD.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox chbTrangThai;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTrinhDo;
    private javax.swing.JTextField txtMaTD;
    private javax.swing.JTextField txtTenTD;
    // End of variables declaration//GEN-END:variables
}
