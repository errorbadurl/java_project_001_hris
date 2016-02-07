/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_001_hris;

import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Web Dev
 */
public final class DialogCreateElg extends javax.swing.JDialog {

    ArrayList<Component> reqList = new ArrayList<>();
    ArrayList<Integer> cmbboxId = new ArrayList<>();
    Calendar currentDate = Calendar.getInstance();
    ClassConstantVariables constant = new ClassConstantVariables();
    ClassFormatDateValue fmtDateVal = new ClassFormatDateValue();
    ClassRequiredField reqField = new ClassRequiredField();
    DefaultTableModel dtm;
    TableRowSorter<TableModel> sorter;

    /**
     * Creates new form DialogCreateDependents
     *
     * @param parent
     * @param modal
     */
    public DialogCreateElg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initAdditionalComponents();
        initTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelView = new javax.swing.JPanel();
        panelViewLabels = new javax.swing.JPanel();
        lblViewName = new javax.swing.JLabel();
        panelViewLabelAge = new javax.swing.JPanel();
        panelViewLabelAgeSeparator = new javax.swing.JPanel();
        panelViewLabelAgeSeparatorTop = new javax.swing.JPanel();
        separatorViewLabels = new javax.swing.JSeparator();
        panelViewLabelAgeSeparatorBot = new javax.swing.JPanel();
        lblViewAge = new javax.swing.JLabel();
        panelViewTable = new javax.swing.JPanel();
        scrollpane = new javax.swing.JScrollPane();
        lblTitle = new javax.swing.JLabel();
        panelMain = new javax.swing.JPanel();
        panelMainLeft = new javax.swing.JPanel();
        panelMainCenter = new javax.swing.JPanel();
        panelMainCenterForm = new javax.swing.JPanel();
        panelMainCenterFormFields = new javax.swing.JPanel();
        cmbboxName = new santhosh.WideComboBox();
        dateSelected = new com.toedter.calendar.JDateChooser();
        panelFiller001 = new javax.swing.JPanel();
        panelFiller001TopLabel = new javax.swing.JLabel();
        panelFiller001Separator = new javax.swing.JSeparator();
        panelFiller001LeftPanel = new javax.swing.JPanel();
        panelFiller001RightPanel = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        labelBullet = new javax.swing.JLabel();
        panelMainCenterView = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        table_view = new javax.swing.JTable();
        panelMainCenterFormBottom = new javax.swing.JPanel();
        panelFiller002 = new javax.swing.JPanel();
        panelFiller002TopLabel = new javax.swing.JLabel();
        panelFiller002Separator = new javax.swing.JSeparator();
        panelFiller002LeftPanel = new javax.swing.JPanel();
        panelFiller002RightPanel = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        panelFiller3 = new javax.swing.JPanel();
        panelMainRight = new javax.swing.JPanel();
        panelClose = new javax.swing.JPanel();

        panelView.setLayout(new java.awt.BorderLayout());

        panelViewLabels.setPreferredSize(new java.awt.Dimension(0, 20));
        panelViewLabels.setLayout(new java.awt.BorderLayout());

        lblViewName.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblViewName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewName.setText("Name");
        lblViewName.setOpaque(true);
        panelViewLabels.add(lblViewName, java.awt.BorderLayout.CENTER);

        panelViewLabelAge.setPreferredSize(new java.awt.Dimension(100, 20));
        panelViewLabelAge.setLayout(new java.awt.BorderLayout());

        panelViewLabelAgeSeparator.setPreferredSize(new java.awt.Dimension(2, 2));
        panelViewLabelAgeSeparator.setLayout(new java.awt.BorderLayout());

        panelViewLabelAgeSeparatorTop.setPreferredSize(new java.awt.Dimension(3, 3));

        javax.swing.GroupLayout panelViewLabelAgeSeparatorTopLayout = new javax.swing.GroupLayout(panelViewLabelAgeSeparatorTop);
        panelViewLabelAgeSeparatorTop.setLayout(panelViewLabelAgeSeparatorTopLayout);
        panelViewLabelAgeSeparatorTopLayout.setHorizontalGroup(
            panelViewLabelAgeSeparatorTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        panelViewLabelAgeSeparatorTopLayout.setVerticalGroup(
            panelViewLabelAgeSeparatorTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        panelViewLabelAgeSeparator.add(panelViewLabelAgeSeparatorTop, java.awt.BorderLayout.PAGE_START);

        separatorViewLabels.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separatorViewLabels.setPreferredSize(new java.awt.Dimension(2, 2));
        panelViewLabelAgeSeparator.add(separatorViewLabels, java.awt.BorderLayout.CENTER);

        panelViewLabelAgeSeparatorBot.setPreferredSize(new java.awt.Dimension(3, 3));

        javax.swing.GroupLayout panelViewLabelAgeSeparatorBotLayout = new javax.swing.GroupLayout(panelViewLabelAgeSeparatorBot);
        panelViewLabelAgeSeparatorBot.setLayout(panelViewLabelAgeSeparatorBotLayout);
        panelViewLabelAgeSeparatorBotLayout.setHorizontalGroup(
            panelViewLabelAgeSeparatorBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        panelViewLabelAgeSeparatorBotLayout.setVerticalGroup(
            panelViewLabelAgeSeparatorBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        panelViewLabelAgeSeparator.add(panelViewLabelAgeSeparatorBot, java.awt.BorderLayout.PAGE_END);

        panelViewLabelAge.add(panelViewLabelAgeSeparator, java.awt.BorderLayout.LINE_START);

        lblViewAge.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblViewAge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewAge.setText("Age");
        lblViewAge.setOpaque(true);
        lblViewAge.setPreferredSize(new java.awt.Dimension(100, 16));
        panelViewLabelAge.add(lblViewAge, java.awt.BorderLayout.CENTER);

        panelViewLabels.add(panelViewLabelAge, java.awt.BorderLayout.LINE_END);

        panelView.add(panelViewLabels, java.awt.BorderLayout.PAGE_START);

        panelViewTable.setLayout(new java.awt.GridLayout(1, 0));
        panelViewTable.add(scrollpane);

        panelView.add(panelViewTable, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 153, 255));
        setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img_src/icon_16_medal_gold_red_premium.png")).getImage());
        setMinimumSize(new java.awt.Dimension(450, 375));
        setModal(true);
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("Century Gothic", 3, 15)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(51, 51, 51));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblTitle.setOpaque(true);
        lblTitle.setPreferredSize(new java.awt.Dimension(20, 20));
        lblTitle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lblTitle, java.awt.BorderLayout.PAGE_START);

        panelMain.setBackground(new java.awt.Color(0, 153, 255));
        panelMain.setLayout(new java.awt.BorderLayout());

        panelMainLeft.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout panelMainLeftLayout = new javax.swing.GroupLayout(panelMainLeft);
        panelMainLeft.setLayout(panelMainLeftLayout);
        panelMainLeftLayout.setHorizontalGroup(
            panelMainLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        panelMainLeftLayout.setVerticalGroup(
            panelMainLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );

        panelMain.add(panelMainLeft, java.awt.BorderLayout.LINE_START);

        panelMainCenter.setPreferredSize(new java.awt.Dimension(10, 204));
        panelMainCenter.setLayout(new java.awt.BorderLayout());

        panelMainCenterForm.setPreferredSize(new java.awt.Dimension(276, 55));
        panelMainCenterForm.setLayout(new java.awt.BorderLayout());

        panelMainCenterFormFields.setBackground(new java.awt.Color(225, 225, 225));
        panelMainCenterFormFields.setLayout(new java.awt.GridLayout(1, 1));

        cmbboxName.setForeground(new java.awt.Color(51, 51, 51));
        cmbboxName.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        panelMainCenterFormFields.add(cmbboxName);
        reqList.add(0, cmbboxName);

        dateSelected.setForeground(new java.awt.Color(51, 51, 51));
        dateSelected.setDateFormatString(" MMMM dd, yyyy");
        dateSelected.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        dateSelected.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_src/icon_16_calendar_red.png")));
        dateSelected.setMaxSelectableDate(currentDate.getTime());
        panelMainCenterFormFields.add(dateSelected);
        reqList.add(1, dateSelected);

        panelMainCenterForm.add(panelMainCenterFormFields, java.awt.BorderLayout.CENTER);

        panelFiller001.setPreferredSize(new java.awt.Dimension(15, 15));
        panelFiller001.setLayout(new java.awt.BorderLayout());

        panelFiller001TopLabel.setPreferredSize(new java.awt.Dimension(4, 4));
        panelFiller001.add(panelFiller001TopLabel, java.awt.BorderLayout.PAGE_START);
        panelFiller001.add(panelFiller001Separator, java.awt.BorderLayout.CENTER);

        panelFiller001LeftPanel.setPreferredSize(new java.awt.Dimension(6, 6));

        javax.swing.GroupLayout panelFiller001LeftPanelLayout = new javax.swing.GroupLayout(panelFiller001LeftPanel);
        panelFiller001LeftPanel.setLayout(panelFiller001LeftPanelLayout);
        panelFiller001LeftPanelLayout.setHorizontalGroup(
            panelFiller001LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        panelFiller001LeftPanelLayout.setVerticalGroup(
            panelFiller001LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );

        panelFiller001.add(panelFiller001LeftPanel, java.awt.BorderLayout.LINE_START);

        panelFiller001RightPanel.setPreferredSize(new java.awt.Dimension(6, 6));

        javax.swing.GroupLayout panelFiller001RightPanelLayout = new javax.swing.GroupLayout(panelFiller001RightPanel);
        panelFiller001RightPanel.setLayout(panelFiller001RightPanelLayout);
        panelFiller001RightPanelLayout.setHorizontalGroup(
            panelFiller001RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        panelFiller001RightPanelLayout.setVerticalGroup(
            panelFiller001RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );

        panelFiller001.add(panelFiller001RightPanel, java.awt.BorderLayout.LINE_END);

        panelMainCenterForm.add(panelFiller001, java.awt.BorderLayout.PAGE_END);

        btnAdd.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(25, 25, 25));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_src/icon_16_plus_button.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setToolTipText("");
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnAdd.setIconTextGap(3);
        btnAdd.setPreferredSize(new java.awt.Dimension(85, 85));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        panelMainCenterForm.add(btnAdd, java.awt.BorderLayout.LINE_END);

        labelBullet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_src/icon_16_bullet_arrow_right.png"))); // NOI18N
        labelBullet.setLabelFor(panelMainCenterForm);
        labelBullet.setIconTextGap(0);
        labelBullet.setPreferredSize(new java.awt.Dimension(20, 20));
        panelMainCenterForm.add(labelBullet, java.awt.BorderLayout.LINE_START);

        panelMainCenter.add(panelMainCenterForm, java.awt.BorderLayout.PAGE_START);

        panelMainCenterView.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelMainCenterView.setLayout(new java.awt.CardLayout());

        scrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        table_view.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        table_view.setForeground(new java.awt.Color(51, 51, 51));
        table_view.setModel(new javax.swing.table.DefaultTableModel(
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
        table_view.setFillsViewportHeight(true);
        table_view.setGridColor(new java.awt.Color(230, 230, 230));
        table_view.setRowHeight(30);
        table_view.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                table_viewMouseReleased(evt);
            }
        });
        scrollPane.setViewportView(table_view);

        panelMainCenterView.add(scrollPane, "card2");

        panelMainCenter.add(panelMainCenterView, java.awt.BorderLayout.CENTER);

        panelMainCenterFormBottom.setPreferredSize(new java.awt.Dimension(276, 40));
        panelMainCenterFormBottom.setLayout(new java.awt.BorderLayout());

        panelFiller002.setPreferredSize(new java.awt.Dimension(16, 16));
        panelFiller002.setLayout(new java.awt.BorderLayout());

        panelFiller002TopLabel.setPreferredSize(new java.awt.Dimension(2, 2));
        panelFiller002.add(panelFiller002TopLabel, java.awt.BorderLayout.PAGE_START);
        panelFiller002.add(panelFiller002Separator, java.awt.BorderLayout.CENTER);

        panelFiller002LeftPanel.setPreferredSize(new java.awt.Dimension(6, 6));

        javax.swing.GroupLayout panelFiller002LeftPanelLayout = new javax.swing.GroupLayout(panelFiller002LeftPanel);
        panelFiller002LeftPanel.setLayout(panelFiller002LeftPanelLayout);
        panelFiller002LeftPanelLayout.setHorizontalGroup(
            panelFiller002LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        panelFiller002LeftPanelLayout.setVerticalGroup(
            panelFiller002LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        panelFiller002.add(panelFiller002LeftPanel, java.awt.BorderLayout.LINE_START);

        panelFiller002RightPanel.setPreferredSize(new java.awt.Dimension(6, 6));

        javax.swing.GroupLayout panelFiller002RightPanelLayout = new javax.swing.GroupLayout(panelFiller002RightPanel);
        panelFiller002RightPanel.setLayout(panelFiller002RightPanelLayout);
        panelFiller002RightPanelLayout.setHorizontalGroup(
            panelFiller002RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        panelFiller002RightPanelLayout.setVerticalGroup(
            panelFiller002RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        panelFiller002.add(panelFiller002RightPanel, java.awt.BorderLayout.LINE_END);

        panelMainCenterFormBottom.add(panelFiller002, java.awt.BorderLayout.CENTER);

        btnClose.setFont(new java.awt.Font("Century Gothic", 3, 13)); // NOI18N
        btnClose.setForeground(new java.awt.Color(25, 25, 25));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_src/icon_16_back.png"))); // NOI18N
        btnClose.setText("Back");
        btnClose.setIconTextGap(3);
        btnClose.setPreferredSize(new java.awt.Dimension(85, 85));
        btnClose.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        panelMainCenterFormBottom.add(btnClose, java.awt.BorderLayout.LINE_START);

        panelFiller3.setPreferredSize(new java.awt.Dimension(2, 2));
        panelFiller3.setLayout(new java.awt.BorderLayout());
        panelMainCenterFormBottom.add(panelFiller3, java.awt.BorderLayout.PAGE_START);

        panelMainCenter.add(panelMainCenterFormBottom, java.awt.BorderLayout.PAGE_END);

        panelMain.add(panelMainCenter, java.awt.BorderLayout.CENTER);

        panelMainRight.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout panelMainRightLayout = new javax.swing.GroupLayout(panelMainRight);
        panelMainRight.setLayout(panelMainRightLayout);
        panelMainRightLayout.setHorizontalGroup(
            panelMainRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        panelMainRightLayout.setVerticalGroup(
            panelMainRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );

        panelMain.add(panelMainRight, java.awt.BorderLayout.LINE_END);

        getContentPane().add(panelMain, java.awt.BorderLayout.CENTER);

        panelClose.setPreferredSize(new java.awt.Dimension(20, 20));
        panelClose.setLayout(new java.awt.CardLayout());
        getContentPane().add(panelClose, java.awt.BorderLayout.PAGE_END);

        setSize(new java.awt.Dimension(466, 414));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void initAdditionalComponents() {
        
        comboBoxLoad();
        setPlaceHolder();
        reqField.requiredFieldsInitialize(reqList);
        
        setTitle("Eligibility Manager");
        
        dateSelected.getComponent(0).setBackground(new Color(180, 180, 180));
        cmbboxName.setBackground(new Color(150, 150, 150));
        
        JTextFieldDateEditor dateTextEditor = (JTextFieldDateEditor) dateSelected.getDateEditor();
        dateTextEditor.setEditable(false);
        dateTextEditor.setHorizontalAlignment(JTextField.CENTER);
        
    }

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        
        this.dispose();
//        for (int x = 0; x < table_view.getRowCount(); x++) {
//            System.out.print(table_view.getModel().getValueAt(x, 0));
//            System.out.print(table_view.getModel().getValueAt(x, 1));
//            System.out.println(table_view.getModel().getValueAt(x, 2));
//        }
        
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        if (reqField.requiredFieldsValidate(reqList)) {
            ArrayList<Object> addNewRow = new ArrayList<>();
            addNewRow.add(cmbboxId.get(cmbboxName.getSelectedIndex()-1));
            addNewRow.add(cmbboxName.getSelectedItem().toString().trim());
            addNewRow.add(fmtDateVal.formatDateToString(dateSelected).trim());
            addNewRow.add("");
            
            dtm.addRow(addNewRow.toArray());
            table_view.setModel(dtm);
            sorter = new TableRowSorter<TableModel>(dtm);
            table_view.setRowSorter(sorter);
            
            dateSelected.setDate(null);
            cmbboxName.setSelectedIndex(0);
            cmbboxName.requestFocus();
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void table_viewMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_viewMouseReleased
        
//        if (evt.getButton() == 3 && table_view.getSelectedRow() >= 0) {
//            popupMenu.show(table_view, (int)evt.getX(), (int)evt.getY());
//        }
        
    }//GEN-LAST:event_table_viewMouseReleased

    /**
     * Get table model.
     * @return table_view
     */
    public JTable getTableModel() {
        
        return table_view;
        
    }

    /**
     * Set table model.
     * @param tbl
     */
    public void setTableModel(JTable tbl) {
        
        clearDialog();
        sorter = new TableRowSorter<TableModel>(dtm);
        table_view.setRowSorter(sorter);
        
        for (int i = 0; i < tbl.getRowCount(); i++) {
            ArrayList<Object> addNewRow = new ArrayList<>();
//            for (int j = 0; j < tbl.getColumnCount(); j++) {
            addNewRow.add(tbl.getValueAt(i, 0));
            addNewRow.add(tbl.getValueAt(i, 1));
            addNewRow.add(tbl.getValueAt(i, 2));
            addNewRow.add(tbl.getValueAt(i, 3));
//            }
            dtm.addRow(addNewRow.toArray());
        }
        
        table_view.setModel(dtm);
        
    }

    /**
     * Clear all dialog fields.
     */
    public void clearDialog() {
        
        DefaultTableModel tm = (DefaultTableModel)table_view.getModel();
        tm.getDataVector().removeAllElements();
        table_view.setModel(tm);
        table_view.repaint();
        cmbboxName.setSelectedIndex(0);
        cmbboxName.requestFocus();
        dateSelected.setDate(null);
        
    }

    /**
     * Refresh all dialog fields.
     */
    public void refreshDialog() {
        
        table_view.repaint();
        cmbboxName.setSelectedIndex(0);
        cmbboxName.requestFocus();
        dateSelected.setDate(null);
        
    }

    public void setPlaceHolder() {
        
        JTextFieldDateEditor dateTextEditor = (JTextFieldDateEditor) dateSelected.getDateEditor();
        ClassTextPrompt tpTxtfldDate = new ClassTextPrompt("Select a Date", dateTextEditor);
        
        ClassTextPrompt[] placeholder = {
            tpTxtfldDate
        };
        
        // adjust display
        for (ClassTextPrompt placeholder1 : placeholder) {
            placeholder1.changeAlpha(0.3f);
            placeholder1.changeStyle(Font.ITALIC);
            placeholder1.setHorizontalAlignment(JTextField.CENTER);
        }
        
    }

    private DialogCreateElg getThisDialog() {
        
        return this;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogCreateElg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                DialogCreateElg dialog = new DialogCreateElg(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private santhosh.WideComboBox cmbboxName;
    private com.toedter.calendar.JDateChooser dateSelected;
    private javax.swing.JLabel labelBullet;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblViewAge;
    private javax.swing.JLabel lblViewName;
    private javax.swing.JPanel panelClose;
    private javax.swing.JPanel panelFiller001;
    private javax.swing.JPanel panelFiller001LeftPanel;
    private javax.swing.JPanel panelFiller001RightPanel;
    private javax.swing.JSeparator panelFiller001Separator;
    private javax.swing.JLabel panelFiller001TopLabel;
    private javax.swing.JPanel panelFiller002;
    private javax.swing.JPanel panelFiller002LeftPanel;
    private javax.swing.JPanel panelFiller002RightPanel;
    private javax.swing.JSeparator panelFiller002Separator;
    private javax.swing.JLabel panelFiller002TopLabel;
    private javax.swing.JPanel panelFiller3;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelMainCenter;
    private javax.swing.JPanel panelMainCenterForm;
    private javax.swing.JPanel panelMainCenterFormBottom;
    private javax.swing.JPanel panelMainCenterFormFields;
    private javax.swing.JPanel panelMainCenterView;
    private javax.swing.JPanel panelMainLeft;
    private javax.swing.JPanel panelMainRight;
    private javax.swing.JPanel panelView;
    private javax.swing.JPanel panelViewLabelAge;
    private javax.swing.JPanel panelViewLabelAgeSeparator;
    private javax.swing.JPanel panelViewLabelAgeSeparatorBot;
    private javax.swing.JPanel panelViewLabelAgeSeparatorTop;
    private javax.swing.JPanel panelViewLabels;
    private javax.swing.JPanel panelViewTable;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JScrollPane scrollpane;
    private javax.swing.JSeparator separatorViewLabels;
    public javax.swing.JTable table_view;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
        
        ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/img_src/icon_16_delete.png"));
        
        ClassJTableButtonRenderer buttonTableRender = new ClassJTableButtonRenderer(icon);
        ClassJTableButtonEditor buttonTableEditor = new ClassJTableButtonEditor(new JCheckBox(), icon){
            
            // Override with custom table row delete.
            @Override
            protected void fireEditingStopped() {
                DefaultTableModel tm = (DefaultTableModel)table_view.getModel();
                tm.removeRow(table_view.convertRowIndexToModel(table_view.getSelectedRow()));

                table_view.setModel(tm);
                table_view.repaint();
            }
            
        };
        
        this.dtm = new DefaultTableModel(){
            @Override
            public Class getColumnClass(int column){
                Class returnValue;
                try {
                    if((column>=0) && (column<getColumnCount()) && (column!=2)) {
                        returnValue = getValueAt(0, column).getClass();
                    } else {
                        returnValue = Object.class;
                    }
                } catch (Exception ex) {
//                    System.out.println(ex.getMessage());
                    returnValue = Object.class;
                }
                return returnValue;
            }
            @Override
            public boolean isCellEditable(int row, int column) {
                switch(column) {
                    case 3:
                        return true;
                    default:
                        return false;
                }
            }
        };

        ArrayList<Object> columnTitle = new ArrayList<>();
        
        columnTitle.add("");
        columnTitle.add("ELIGIBILITY NAME");
        columnTitle.add("DATE");
        columnTitle.add("");
        
        dtm.setDataVector(null, columnTitle.toArray());
        
        table_view.setModel(dtm);
        table_view.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table_view.getColumnModel().getColumn(0).setMinWidth(0);
        table_view.getColumnModel().getColumn(0).setResizable(false);
        table_view.getColumnModel().getColumn(0).setPreferredWidth(0);
        table_view.getColumnModel().getColumn(1).setMinWidth(243);
        table_view.getColumnModel().getColumn(2).setResizable(false);
        table_view.getColumnModel().getColumn(2).setPreferredWidth(80);
        table_view.getColumnModel().getColumn(3).setResizable(false);
        table_view.getColumnModel().getColumn(3).setPreferredWidth(30);
        table_view.getColumnModel().getColumn(3).setCellEditor(buttonTableEditor);
        table_view.getColumnModel().getColumn(3).setCellRenderer(buttonTableRender);
        
        JTableHeader th = table_view.getTableHeader();
        th.setFont(new Font("Century Gothic", Font.BOLD, 13));
        
        DefaultTableCellRenderer renderHeaderCenter = (DefaultTableCellRenderer)table_view.getTableHeader().getDefaultRenderer();
        renderHeaderCenter.setHorizontalAlignment(JLabel.CENTER);
        table_view.getColumnModel().getColumn(1).setHeaderRenderer(renderHeaderCenter);
        
        DefaultTableCellRenderer renderCellLeft = new DefaultTableCellRenderer();
        renderCellLeft.setHorizontalAlignment(SwingConstants.LEFT);
        table_view.getColumnModel().getColumn(1).setCellRenderer(renderCellLeft);
        
        DefaultTableCellRenderer renderCellCenter = new DefaultTableCellRenderer();
        renderCellCenter.setHorizontalAlignment(SwingConstants.CENTER);
        table_view.getColumnModel().getColumn(2).setCellRenderer(renderCellCenter);
        
    }

    private void comboBoxLoad() {
        
        DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
        dcbm.addElement("");
        
        try {
            //Database connection
            ClassMyDBConnectionEmbeddedDerby.initDB();
            
            try (Connection c = ClassMyDBConnectionEmbeddedDerby.getMyConnection()) {
                PreparedStatement ps;
                ResultSet rs;
                int ct;
                
                ps = c.prepareStatement("SELECT id, name FROM " + constant.TABLE_LIST_ELIGIBILITY + " ORDER BY name ASC");
                rs = ps.executeQuery();
                ct = 0;
                
                while (rs.next()) {
                    if(!rs.getString(2).trim().isEmpty()) {
                        cmbboxId.add(ct, Integer.parseInt(rs.getString(1)));
                        dcbm.addElement(rs.getString(2).trim());
                        ct++;
                    }
                }
                
                cmbboxName.setModel(dcbm);
                ClassComplexCellRenderer renderer = new ClassComplexCellRenderer();
                renderer.title = "Select an Eligibility";
                renderer.isForDialog = true;
                cmbboxName.setRenderer(renderer);
                
                // Close excess connection
                c.close();
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(FrameMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
