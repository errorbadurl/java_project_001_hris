/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author egrubellano
 */
public class PanelPositions extends javax.swing.JPanel {

    /**
     * Creates new form PanelDashboard
     */
    public PanelPositions() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_breadcrumb = new javax.swing.JPanel();
        panel_breadcrumb_panel = new javax.swing.JPanel();
        label_breadcrumb_text = new javax.swing.JLabel();
        label_breadcrumb_arrow = new javax.swing.JLabel();
        panel_breadcrumb_title = new javax.swing.JPanel();
        label_breadcrumb_title = new javax.swing.JLabel();
        label_breadcrumb_logo = new javax.swing.JLabel();
        panel_frame = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        panel_breadcrumb.setBackground(new java.awt.Color(55, 55, 55));
        panel_breadcrumb.setMaximumSize(new java.awt.Dimension(0, 35));
        panel_breadcrumb.setMinimumSize(new java.awt.Dimension(0, 35));
        panel_breadcrumb.setPreferredSize(new java.awt.Dimension(0, 35));
        panel_breadcrumb.setLayout(new java.awt.BorderLayout());

        panel_breadcrumb_panel.setOpaque(false);
        panel_breadcrumb_panel.setLayout(new java.awt.BorderLayout());

        label_breadcrumb_text.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        label_breadcrumb_text.setForeground(new java.awt.Color(255, 255, 255));
        label_breadcrumb_text.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        label_breadcrumb_text.setText("SUMMARY");
        label_breadcrumb_text.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 10));
        panel_breadcrumb_panel.add(label_breadcrumb_text, java.awt.BorderLayout.CENTER);

        label_breadcrumb_arrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/merged/white/icon_15_bullet_left.png"))); // NOI18N
        label_breadcrumb_arrow.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 2, 0));
        label_breadcrumb_arrow.setPreferredSize(new java.awt.Dimension(17, 35));
        panel_breadcrumb_panel.add(label_breadcrumb_arrow, java.awt.BorderLayout.LINE_END);

        panel_breadcrumb.add(panel_breadcrumb_panel, java.awt.BorderLayout.CENTER);

        panel_breadcrumb_title.setMinimumSize(new java.awt.Dimension(121, 35));
        panel_breadcrumb_title.setOpaque(false);
        panel_breadcrumb_title.setPreferredSize(new java.awt.Dimension(116, 35));
        panel_breadcrumb_title.setLayout(new java.awt.BorderLayout());

        label_breadcrumb_title.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        label_breadcrumb_title.setForeground(new java.awt.Color(255, 255, 255));
        label_breadcrumb_title.setText("POSITIONS");
        panel_breadcrumb_title.add(label_breadcrumb_title, java.awt.BorderLayout.CENTER);

        label_breadcrumb_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/merged/white/icon_25_position.png"))); // NOI18N
        label_breadcrumb_logo.setMaximumSize(new java.awt.Dimension(39, 35));
        label_breadcrumb_logo.setMinimumSize(new java.awt.Dimension(39, 35));
        label_breadcrumb_logo.setPreferredSize(new java.awt.Dimension(39, 35));
        panel_breadcrumb_title.add(label_breadcrumb_logo, java.awt.BorderLayout.LINE_END);

        panel_breadcrumb.add(panel_breadcrumb_title, java.awt.BorderLayout.LINE_END);

        add(panel_breadcrumb, java.awt.BorderLayout.PAGE_START);

        panel_frame.setBackground(new java.awt.Color(255, 255, 255));
        panel_frame.setLayout(new java.awt.CardLayout());
        add(panel_frame, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label_breadcrumb_arrow;
    private javax.swing.JLabel label_breadcrumb_logo;
    private javax.swing.JLabel label_breadcrumb_text;
    private javax.swing.JLabel label_breadcrumb_title;
    private javax.swing.JPanel panel_breadcrumb;
    private javax.swing.JPanel panel_breadcrumb_panel;
    private javax.swing.JPanel panel_breadcrumb_title;
    private javax.swing.JPanel panel_frame;
    // End of variables declaration//GEN-END:variables
}
