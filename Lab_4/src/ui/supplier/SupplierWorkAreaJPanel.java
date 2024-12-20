/*
 * ProductManagerWorkAreaJPanel.java
 *
 * Created on October 3, 2008, 8:06 AM
 */
package ui.supplier;

import model.Supplier;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import ui.LoginScreen;

/**
 *
 * @author Rushabh
 */
public class SupplierWorkAreaJPanel extends javax.swing.JPanel {

    JPanel mainWorkArea;
    Supplier supplier;
//    MasterOrderCatalog masterOrderCatalog;

    /**
     * Creates new form ProductManagerWorkAreaJPanel
     */
    public SupplierWorkAreaJPanel(JPanel mainWorkArea, Supplier supplier) {

        initComponents();
        this.mainWorkArea = mainWorkArea;
        
        this.supplier = supplier;
        if (supplier != null) lblWelcome3.setText("Welcome to Lab 4, "+supplier.getSupplyName());
        
//      masterOrderCatalog = moc;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        menuBar3 = new javax.swing.JPanel();
        btnLogOut3 = new javax.swing.JButton();
        lblWelcome3 = new javax.swing.JLabel();
        btnManageProductCatalog3 = new javax.swing.JButton();
        btnManageStaff3 = new javax.swing.JButton();
        Performance3 = new javax.swing.JButton();
        btnManageProductCatalog4 = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();

        splitPane.setDividerLocation(50);
        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        menuBar3.setBackground(new java.awt.Color(153, 153, 255));

        btnLogOut3.setBackground(new java.awt.Color(51, 0, 102));
        btnLogOut3.setForeground(new java.awt.Color(255, 255, 255));
        btnLogOut3.setText("Log Out");
        btnLogOut3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOut3ActionPerformed(evt);
            }
        });

        lblWelcome3.setForeground(new java.awt.Color(51, 0, 102));
        lblWelcome3.setText("<WelcomeMsg>");

        btnManageProductCatalog3.setBackground(new java.awt.Color(51, 0, 102));
        btnManageProductCatalog3.setForeground(new java.awt.Color(255, 255, 255));
        btnManageProductCatalog3.setText("Product Catalog");
        btnManageProductCatalog3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProductCatalog3ActionPerformed(evt);
            }
        });

        btnManageStaff3.setBackground(new java.awt.Color(51, 0, 102));
        btnManageStaff3.setForeground(new java.awt.Color(255, 255, 255));
        btnManageStaff3.setText("Manage Staff");
        btnManageStaff3.setEnabled(false);

        Performance3.setBackground(new java.awt.Color(51, 0, 102));
        Performance3.setForeground(new java.awt.Color(255, 255, 255));
        Performance3.setText("Performance");
        Performance3.setEnabled(false);
        Performance3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Performance3ActionPerformed(evt);
            }
        });

        btnManageProductCatalog4.setBackground(new java.awt.Color(51, 0, 102));
        btnManageProductCatalog4.setForeground(new java.awt.Color(255, 255, 255));
        btnManageProductCatalog4.setText("Update Profile");
        btnManageProductCatalog4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProductCatalog4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuBar3Layout = new javax.swing.GroupLayout(menuBar3);
        menuBar3.setLayout(menuBar3Layout);
        menuBar3Layout.setHorizontalGroup(
            menuBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBar3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblWelcome3, javax.swing.GroupLayout.DEFAULT_SIZE, 1290, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageProductCatalog3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageProductCatalog4)
                .addGap(13, 13, 13)
                .addComponent(btnManageStaff3)
                .addGap(18, 18, 18)
                .addComponent(Performance3)
                .addGap(18, 18, 18)
                .addComponent(btnLogOut3)
                .addGap(46, 46, 46))
        );
        menuBar3Layout.setVerticalGroup(
            menuBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBar3Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(menuBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogOut3)
                    .addComponent(lblWelcome3)
                    .addComponent(btnManageProductCatalog3)
                    .addComponent(Performance3)
                    .addComponent(btnManageStaff3)
                    .addComponent(btnManageProductCatalog4))
                .addContainerGap())
        );

        splitPane.setTopComponent(menuBar3);

        workArea.setBackground(new java.awt.Color(153, 153, 255));
        workArea.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(workArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(splitPane))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOut3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOut3ActionPerformed
        // TODO add your handling code here:

        mainWorkArea.remove(this);

        Component[] componentArray = mainWorkArea.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LoginScreen loginPanel = (LoginScreen) component;
        loginPanel.populateSupplierCombo();

        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.previous(mainWorkArea);
    }//GEN-LAST:event_btnLogOut3ActionPerformed

    private void btnManageProductCatalog3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProductCatalog3ActionPerformed
        // TODO add your handling code here:
        ManageProductCatalogJPanel mpcjp = new ManageProductCatalogJPanel(workArea, supplier);
        workArea.add("ManageProductCatalogJPanel", mpcjp);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnManageProductCatalog3ActionPerformed

    private void Performance3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Performance3ActionPerformed
        // TODO add your handling code here:
        //        ProductReportJPanel prjp = new workArea(userProcessContainer, supplier);
        //        workArea.add("ProductReportJPanelSupplier", prjp);
        //        CardLayout layout = (CardLayout)workArea.getLayout();
        //        layout.next(userProcessContainer);
    }//GEN-LAST:event_Performance3ActionPerformed

    private void btnManageProductCatalog4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProductCatalog4ActionPerformed
        // TODO add your handling code here:
        UpdateProfileJPanel updatePanel = new UpdateProfileJPanel(workArea, supplier);
        workArea.add("UpdateSupplierProfileJPanel", updatePanel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnManageProductCatalog4ActionPerformed

    public String toString() {
        return "Supplier";
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Performance3;
    private javax.swing.JButton btnLogOut3;
    private javax.swing.JButton btnManageProductCatalog3;
    private javax.swing.JButton btnManageProductCatalog4;
    private javax.swing.JButton btnManageStaff3;
    private javax.swing.JLabel lblWelcome3;
    private javax.swing.JPanel menuBar3;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}
