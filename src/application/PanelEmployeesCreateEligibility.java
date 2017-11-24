/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import classes.ClassComplexCellrenderer;
import classes.ClassConstantsCustom;
import classes.ClassDateFormatValue;
import classes.ClassMyDBConnectionEmbeddedDerby;
import classes.ClassTableButtonEditor;
import classes.ClassTableButtonRenderer;
import classes.ClassTableCustomCellRenderer;
import classes.ClassTextfieldPrompt;
import classes.ClassTextfieldRequired;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author egrubellano
 */
public class PanelEmployeesCreateEligibility extends javax.swing.JPanel {

    protected final ArrayList<Component> reqList = new ArrayList<>();
    protected final ArrayList<Integer> cmbboxList = new ArrayList<>();
    protected final Calendar currentDate = Calendar.getInstance();
    protected ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/images/icons/icon_16_remove.png"));
    protected DefaultTableModel dtm;
    protected ClassConstantsCustom constant;
    protected ClassDateFormatValue fmtDateVal;
    protected ClassTableCustomCellRenderer chkboxCellRenderer;
    protected ClassTextfieldRequired reqField;
    protected FramePrime panel_ancestor;
    protected PanelEmployees panel_parent;
    protected PanelEmployeesCreate panel_child;
    protected TableRowSorter<TableModel> sorter;
    
    

    /**
     * Creates new form PanelEmployeesCreateEligibility
     */
    public PanelEmployeesCreateEligibility() {
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

        panelTitle = new javax.swing.JPanel();
        panelFormListTitle_001_caption = new javax.swing.JPanel();
        labelFormListTitle_001_icon = new javax.swing.JLabel();
        labelFormListTitle_001_name = new javax.swing.JLabel();
        panelFormListTitle_001_hr = new javax.swing.JPanel();
        panelFormListTitle_001_breakline = new javax.swing.JSeparator();
        panelMain = new javax.swing.JPanel();
        panelMainCenterView = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        table_view = new javax.swing.JTable();
        panel_table_result = new javax.swing.JPanel();
        label_table_result_logo = new javax.swing.JLabel();
        label_table_result_total = new javax.swing.JLabel();
        panelMainFormCenter = new javax.swing.JPanel();
        panelMainForm = new javax.swing.JPanel();
        panelControls = new javax.swing.JPanel();
        panelControlsContainer = new javax.swing.JPanel();
        label_button_sav = new javax.swing.JLabel();
        panelMainCenterFormFields = new javax.swing.JPanel();
        panelFormListField_001 = new javax.swing.JPanel();
        labelFormListField_001_head = new javax.swing.JLabel();
        cmbboxName = new santhosh.WideComboBox();
        labelFormListField_001_required = new javax.swing.JLabel();
        panelFormListField_002 = new javax.swing.JPanel();
        labelFormListField_002_head = new javax.swing.JLabel();
        dateSelected = new com.toedter.calendar.JDateChooser();
        labelFormListField_002_required = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 250, 250));
        setLayout(new java.awt.BorderLayout());

        panelTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 5, 0));
        panelTitle.setOpaque(false);
        panelTitle.setPreferredSize(new java.awt.Dimension(10, 40));
        panelTitle.setLayout(new java.awt.BorderLayout());

        panelFormListTitle_001_caption.setMinimumSize(new java.awt.Dimension(147, 100));
        panelFormListTitle_001_caption.setOpaque(false);
        panelFormListTitle_001_caption.setPreferredSize(new java.awt.Dimension(185, 100));
        panelFormListTitle_001_caption.setLayout(new java.awt.BorderLayout());

        labelFormListTitle_001_icon.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        labelFormListTitle_001_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFormListTitle_001_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icon_16_magic_wand_2.png"))); // NOI18N
        labelFormListTitle_001_icon.setPreferredSize(new java.awt.Dimension(25, 25));
        panelFormListTitle_001_caption.add(labelFormListTitle_001_icon, java.awt.BorderLayout.LINE_START);

        labelFormListTitle_001_name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelFormListTitle_001_name.setForeground(new java.awt.Color(25, 25, 25));
        labelFormListTitle_001_name.setText(" Eligibility(s) information");
        labelFormListTitle_001_name.setRequestFocusEnabled(false);
        panelFormListTitle_001_caption.add(labelFormListTitle_001_name, java.awt.BorderLayout.CENTER);

        panelTitle.add(panelFormListTitle_001_caption, java.awt.BorderLayout.LINE_START);

        panelFormListTitle_001_hr.setBorder(javax.swing.BorderFactory.createEmptyBorder(18, 0, 0, 8));
        panelFormListTitle_001_hr.setOpaque(false);
        panelFormListTitle_001_hr.setLayout(new java.awt.GridLayout(0, 1));
        panelFormListTitle_001_hr.add(panelFormListTitle_001_breakline);

        panelTitle.add(panelFormListTitle_001_hr, java.awt.BorderLayout.CENTER);

        add(panelTitle, java.awt.BorderLayout.PAGE_START);

        panelMain.setOpaque(false);
        panelMain.setLayout(new java.awt.BorderLayout());

        panelMainCenterView.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 5));
        panelMainCenterView.setOpaque(false);
        panelMainCenterView.setLayout(new java.awt.BorderLayout());

        scrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

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

        panelMainCenterView.add(scrollPane, java.awt.BorderLayout.CENTER);

        panel_table_result.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 10, 0));
        panel_table_result.setMinimumSize(new java.awt.Dimension(20, 35));
        panel_table_result.setOpaque(false);
        panel_table_result.setPreferredSize(new java.awt.Dimension(20, 35));
        panel_table_result.setLayout(new java.awt.BorderLayout());

        label_table_result_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icon_16_magic_wand_2.png"))); // NOI18N
        label_table_result_logo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        label_table_result_logo.setEnabled(false);
        label_table_result_logo.setMaximumSize(new java.awt.Dimension(16, 0));
        label_table_result_logo.setMinimumSize(new java.awt.Dimension(16, 0));
        label_table_result_logo.setPreferredSize(new java.awt.Dimension(16, 0));
        panel_table_result.add(label_table_result_logo, java.awt.BorderLayout.LINE_START);

        label_table_result_total.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_table_result_total.setForeground(new java.awt.Color(125, 125, 125));
        label_table_result_total.setText("0");
        label_table_result_total.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        label_table_result_total.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 8, 0, 0));
        label_table_result_total.setMaximumSize(new java.awt.Dimension(0, 35));
        label_table_result_total.setMinimumSize(new java.awt.Dimension(0, 35));
        label_table_result_total.setPreferredSize(new java.awt.Dimension(0, 35));
        label_table_result_total.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panel_table_result.add(label_table_result_total, java.awt.BorderLayout.CENTER);

        panelMainCenterView.add(panel_table_result, java.awt.BorderLayout.PAGE_END);

        panelMain.add(panelMainCenterView, java.awt.BorderLayout.CENTER);

        panelMainFormCenter.setOpaque(false);
        panelMainFormCenter.setPreferredSize(new java.awt.Dimension(300, 80));
        panelMainFormCenter.setLayout(new java.awt.BorderLayout());

        panelMainForm.setOpaque(false);
        panelMainForm.setPreferredSize(new java.awt.Dimension(545, 100));
        panelMainForm.setLayout(new java.awt.BorderLayout());

        panelControls.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 5, 7));
        panelControls.setOpaque(false);
        panelControls.setPreferredSize(new java.awt.Dimension(125, 125));
        panelControls.setLayout(new java.awt.BorderLayout());

        panelControlsContainer.setOpaque(false);
        panelControlsContainer.setPreferredSize(new java.awt.Dimension(225, 95));
        panelControlsContainer.setLayout(new java.awt.GridLayout(1, 0));

        label_button_sav.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        label_button_sav.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_button_sav.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icon_30_magic_wand.png"))); // NOI18N
        label_button_sav.setText("add eligibility");
        label_button_sav.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(159, 159, 159)));
        label_button_sav.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_button_sav.setIconTextGap(10);
        label_button_sav.setOpaque(true);
        label_button_sav.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        label_button_sav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_button_savMouseClicked(evt);
            }
        });
        panelControlsContainer.add(label_button_sav);

        panelControls.add(panelControlsContainer, java.awt.BorderLayout.CENTER);

        panelMainForm.add(panelControls, java.awt.BorderLayout.LINE_END);

        panelMainCenterFormFields.setBackground(new java.awt.Color(225, 225, 225));
        panelMainCenterFormFields.setOpaque(false);
        panelMainCenterFormFields.setPreferredSize(new java.awt.Dimension(1000, 80));
        panelMainCenterFormFields.setLayout(new java.awt.GridLayout(2, 0));

        panelFormListField_001.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 5, 0));
        panelFormListField_001.setOpaque(false);
        panelFormListField_001.setPreferredSize(new java.awt.Dimension(10, 4));
        panelFormListField_001.setLayout(new java.awt.BorderLayout());

        labelFormListField_001_head.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        labelFormListField_001_head.setForeground(new java.awt.Color(30, 30, 30));
        labelFormListField_001_head.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_src/icon_16_bullet_arrow_right.png"))); // NOI18N
        labelFormListField_001_head.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));
        labelFormListField_001_head.setMaximumSize(new java.awt.Dimension(125, 0));
        labelFormListField_001_head.setMinimumSize(new java.awt.Dimension(125, 0));
        labelFormListField_001_head.setPreferredSize(new java.awt.Dimension(20, 0));
        panelFormListField_001.add(labelFormListField_001_head, java.awt.BorderLayout.LINE_START);

        cmbboxName.setForeground(new java.awt.Color(51, 51, 51));
        cmbboxName.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        cmbboxName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbboxNameFocusGained(evt);
            }
        });
        panelFormListField_001.add(cmbboxName, java.awt.BorderLayout.CENTER);
        reqList.add(0, cmbboxName);

        labelFormListField_001_required.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        labelFormListField_001_required.setForeground(new java.awt.Color(255, 0, 0));
        labelFormListField_001_required.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFormListField_001_required.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icon_8_bullet_red.png"))); // NOI18N
        labelFormListField_001_required.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        labelFormListField_001_required.setBorder(javax.swing.BorderFactory.createEmptyBorder(-5, 0, 0, 5));
        labelFormListField_001_required.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelFormListField_001_required.setPreferredSize(new java.awt.Dimension(15, 15));
        labelFormListField_001_required.setVerifyInputWhenFocusTarget(false);
        panelFormListField_001.add(labelFormListField_001_required, java.awt.BorderLayout.LINE_END);

        panelMainCenterFormFields.add(panelFormListField_001);

        panelFormListField_002.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 5, 0));
        panelFormListField_002.setOpaque(false);
        panelFormListField_002.setPreferredSize(new java.awt.Dimension(10, 4));
        panelFormListField_002.setLayout(new java.awt.BorderLayout());

        labelFormListField_002_head.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        labelFormListField_002_head.setForeground(new java.awt.Color(30, 30, 30));
        labelFormListField_002_head.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_src/icon_16_bullet_arrow_right.png"))); // NOI18N
        labelFormListField_002_head.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));
        labelFormListField_002_head.setMaximumSize(new java.awt.Dimension(125, 0));
        labelFormListField_002_head.setMinimumSize(new java.awt.Dimension(125, 0));
        labelFormListField_002_head.setPreferredSize(new java.awt.Dimension(20, 0));
        panelFormListField_002.add(labelFormListField_002_head, java.awt.BorderLayout.LINE_START);

        dateSelected.setForeground(new java.awt.Color(51, 51, 51));
        dateSelected.setDateFormatString("  MMMM dd, yyyy");
        dateSelected.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        dateSelected.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_src/icon_16_calendar_red.png")));
        dateSelected.setMaxSelectableDate(currentDate.getTime());
        dateSelected.setOpaque(false);
        panelFormListField_002.add(dateSelected, java.awt.BorderLayout.CENTER);
        reqList.add(1, dateSelected);

        labelFormListField_002_required.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        labelFormListField_002_required.setForeground(new java.awt.Color(255, 0, 0));
        labelFormListField_002_required.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFormListField_002_required.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icon_8_bullet_red.png"))); // NOI18N
        labelFormListField_002_required.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        labelFormListField_002_required.setBorder(javax.swing.BorderFactory.createEmptyBorder(-5, 0, 0, 5));
        labelFormListField_002_required.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelFormListField_002_required.setPreferredSize(new java.awt.Dimension(15, 15));
        labelFormListField_002_required.setVerifyInputWhenFocusTarget(false);
        panelFormListField_002.add(labelFormListField_002_required, java.awt.BorderLayout.LINE_END);

        panelMainCenterFormFields.add(panelFormListField_002);

        panelMainForm.add(panelMainCenterFormFields, java.awt.BorderLayout.CENTER);

        panelMainFormCenter.add(panelMainForm, java.awt.BorderLayout.CENTER);

        panelMain.add(panelMainFormCenter, java.awt.BorderLayout.PAGE_START);

        add(panelMain, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    public void initAdditionalComponents(PanelEmployeesCreate panel_create) {
        
        setFrameChild(panel_create);
        
        comboBoxLoad();
        
        setPlaceHolder();
        
        reqField.requiredFieldsInitialize(reqList);
        
        dateSelected.getComponent(0).setBackground(new Color(180, 180, 180));
        cmbboxName.setBackground(new Color(150, 150, 150));
        
        panel_parent.lbl_btn.addClass(label_button_sav, constant.BUTTON_BG_COLOR_PRESS_DEFAULT, constant.BUTTON_BG_COLOR_NEW_DEFAULT, constant.BUTTON_BG_COLOR_OLD, constant.BUTTON_FG_COLOR_NEW, constant.BUTTON_FG_COLOR_OLD);
        
        this.setName(this.constant.PANEL_EMP_ELG);
        
        this.addComponentListener(new ComponentListener() {
            @Override
            public void componentHidden(ComponentEvent e) { revalidate(); repaint(); }
            @Override
            public void componentMoved(ComponentEvent e) { revalidate(); repaint(); }
            @Override
            public void componentShown(ComponentEvent e) { revalidate(); repaint(); }
            @Override
            public void componentResized(ComponentEvent e) {
                // Get current panel size.
                Dimension newSize = e.getComponent().getBounds().getSize();          
                // Determine what layout to use.
                if(newSize.width < 725) {
                    panelMainFormCenter.setPreferredSize(new Dimension(0, 80));
                    panelMain.add(panelMainFormCenter, java.awt.BorderLayout.PAGE_START);
                    panelControls.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 5, 7));
                    panelControls.add(panelControlsContainer, java.awt.BorderLayout.CENTER);
                    panelMainForm.add(panelControls, java.awt.BorderLayout.LINE_END);
                    panelMainForm.add(panelMainCenterFormFields, java.awt.BorderLayout.CENTER);
                } else {
                    panelMainFormCenter.setPreferredSize(new Dimension(300, 160));
                    panelMain.add(panelMainFormCenter, java.awt.BorderLayout.LINE_START);
                    panelControls.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 80, 5, 80));
                    panelControls.add(panelControlsContainer, java.awt.BorderLayout.PAGE_START);
                    panelMainForm.add(panelControls, java.awt.BorderLayout.CENTER);
                    panelMainForm.add(panelMainCenterFormFields, java.awt.BorderLayout.PAGE_START);
                }
                // Revalidate and repaint this panel.
                revalidate();
                repaint();
            }
        });
        
        initTable();
        
    }

    private void table_viewMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_viewMouseReleased

//        if (evt.getButton() == 3 && table_view.getSelectedRow() >= 0) {
//            popupMenu.show(table_view, (int)evt.getX(), (int)evt.getY());
//        }

    }//GEN-LAST:event_table_viewMouseReleased

    private void label_button_savMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_button_savMouseClicked

        if (reqField.requiredFieldsValidate(reqList)) {
            ArrayList<Object> addNewRow = new ArrayList<>();
            addNewRow.add(cmbboxList.get(cmbboxName.getSelectedIndex()-1));
            addNewRow.add(cmbboxName.getSelectedItem().toString().trim());
            addNewRow.add(fmtDateVal.formatDateToString(dateSelected.getDate(), "MMMM dd, yyyy").trim());
            addNewRow.add("");
            dtm.addRow(addNewRow.toArray());

            // Set created model to table used
            table_view.setModel(dtm);

            // Set created custom sorter to table used
            sorter = new TableRowSorter<TableModel>(dtm);
            sorter.setSortable(0, false);
            sorter.setSortable(3, false);
            table_view.setRowSorter(sorter);

            // Initialize custom row color
            table_view.setDefaultRenderer(Boolean.class, chkboxCellRenderer.CheckboxCellRenderer(constant.ROW_BG_COLOR_ODD, constant.ROW_BG_COLOR_EVEN, constant.ROW_BG_COLOR_SELECT_DEFAULT));
            table_view.setDefaultRenderer(String.class, chkboxCellRenderer.StringCellRenderer(constant.ROW_BG_COLOR_ODD, constant.ROW_BG_COLOR_EVEN, constant.ROW_BG_COLOR_SELECT_DEFAULT));

            // Clear fields
            dateSelected.setDate(null);
            cmbboxName.setSelectedIndex(0);
            cmbboxName.requestFocus();

            // Repaint table
            table_view.repaint();

            // Set row count
            countTableRow();

        }
        
    }//GEN-LAST:event_label_button_savMouseClicked

    private void cmbboxNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbboxNameFocusGained

        cmbboxName.doLayout();
        cmbboxName.repaint();
        cmbboxName.validate();

    }//GEN-LAST:event_cmbboxNameFocusGained

    /**
     * Get table model.
     * @return table_view
     */
    public JTable getTable() {
        
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
     * Clear fields.
     */
    public void clearFields() {
                
        // Clear input fields
        dateSelected.setDate(null);
        cmbboxName.setSelectedIndex(0);
        cmbboxName.requestFocus();
        
        // Reset text field color
        cmbboxName.setBackground(new Color(150, 150, 150));
        
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
        dateTextEditor.setEditable(false);
        ClassTextfieldPrompt tpTxtfldDate = new ClassTextfieldPrompt("  Select Eligibility Date", dateTextEditor);
        
        ClassTextfieldPrompt[] placeholder = {
            tpTxtfldDate
        };
        
        // adjust display
        for (ClassTextfieldPrompt placeholder1 : placeholder) {
            placeholder1.changeAlpha(0.3f);
            placeholder1.changeStyle(Font.ITALIC);
        }
        
    }

    public void resetLabelButtons() {

        label_button_sav.setBackground(constant.BUTTON_BG_COLOR_OLD);
        label_button_sav.setForeground(constant.BUTTON_FG_COLOR_OLD);
    }

    private void setFrameChild(PanelEmployeesCreate child_value) {

        this.panel_child = child_value;
        setFrameParent(this.panel_child.panel_parent);
        setFrameAncestor(this.panel_parent.panel_ancestor);
        setFrameConstants(this.panel_ancestor.constant);
        
        this.fmtDateVal = this.panel_ancestor.fmtDateVal;
        this.chkboxCellRenderer = this.panel_ancestor.chkboxCellRenderer;
        this.reqField = this.panel_ancestor.reqField;
    }

    private void setFrameParent(PanelEmployees parent_value) {

        this.panel_parent = parent_value;
    }

    private void setFrameAncestor(FramePrime ancestor_value) {

        this.panel_ancestor = ancestor_value;
    }

    private void setFrameConstants(ClassConstantsCustom constant_value) {

        this.constant = constant_value;
    }

    private void countTableRow() {

        // Set row count
        int rowCount = table_view.getRowCount();
        label_table_result_total.setText(rowCount + "");
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private santhosh.WideComboBox cmbboxName;
    private com.toedter.calendar.JDateChooser dateSelected;
    private javax.swing.JLabel labelFormListField_001_head;
    private javax.swing.JLabel labelFormListField_001_required;
    private javax.swing.JLabel labelFormListField_002_head;
    private javax.swing.JLabel labelFormListField_002_required;
    private javax.swing.JLabel labelFormListTitle_001_icon;
    private javax.swing.JLabel labelFormListTitle_001_name;
    private javax.swing.JLabel label_button_sav;
    private javax.swing.JLabel label_table_result_logo;
    private javax.swing.JLabel label_table_result_total;
    private javax.swing.JPanel panelControls;
    private javax.swing.JPanel panelControlsContainer;
    private javax.swing.JPanel panelFormListField_001;
    private javax.swing.JPanel panelFormListField_002;
    private javax.swing.JSeparator panelFormListTitle_001_breakline;
    private javax.swing.JPanel panelFormListTitle_001_caption;
    private javax.swing.JPanel panelFormListTitle_001_hr;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelMainCenterFormFields;
    private javax.swing.JPanel panelMainCenterView;
    private javax.swing.JPanel panelMainForm;
    private javax.swing.JPanel panelMainFormCenter;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JPanel panel_table_result;
    private javax.swing.JScrollPane scrollPane;
    public javax.swing.JTable table_view;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
        
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
        columnTitle.add("Eligibility Name");
        columnTitle.add("Eligibility Date");
        columnTitle.add("");
        
        dtm.setDataVector(null, columnTitle.toArray());
        
        table_view.setRowHeight(35);
        table_view.setModel(dtm);
        table_view.setSelectionBackground(constant.ROW_BG_COLOR_SELECT_DEFAULT);
        table_view.setFont(new Font("Tahoma", Font.PLAIN, 11));
        scrollPane.setViewportView(table_view);
        
        // Create & set table sorter
        sorter = new TableRowSorter(dtm);
        sorter.setSortable(0, false);
        sorter.setSortable(3, false);
        table_view.setRowSorter(sorter);

        // Turn OFF user ability to re-order columns
        table_view.getTableHeader().setReorderingAllowed(false);
        
        // Initialize checkbox on table columns
        table_view.getColumnModel().getColumn(0).setMinWidth(0);
        table_view.getColumnModel().getColumn(0).setMaxWidth(0);
        table_view.getColumnModel().getColumn(0).setResizable(false);
        table_view.getColumnModel().getColumn(0).setPreferredWidth(0);
        
        table_view.getColumnModel().getColumn(1).setMinWidth(243);
        
        table_view.getColumnModel().getColumn(2).setPreferredWidth(80);
        table_view.getColumnModel().getColumn(2).setResizable(true);
        
        // Initialize table update button
        ClassTableButtonEditor tblEditor_BtnUpdate = new ClassTableButtonEditor(icon, constant.ROW_BG_COLOR_ODD, constant.ROW_BG_COLOR_EVEN, constant.ROW_BG_COLOR_SELECT_DEFAULT) {

            @Override
            protected void fireEditingStopped() {
                DefaultTableModel tm = (DefaultTableModel)table_view.getModel();
                tm.removeRow(table_view.convertRowIndexToModel(table_view.getSelectedRow()));

                table_view.setModel(tm);
                table_view.repaint();
                
                // Set row count
                countTableRow();
            }

        };
        tblEditor_BtnUpdate.setTable(table_view); // Set-up table update button

        ClassTableButtonRenderer tblRenderer_BtnUpdate = new ClassTableButtonRenderer(icon, constant.ROW_BG_COLOR_ODD, constant.ROW_BG_COLOR_EVEN, constant.ROW_BG_COLOR_SELECT_DEFAULT);

        table_view.getColumnModel().getColumn(3).setCellEditor(tblEditor_BtnUpdate);
        table_view.getColumnModel().getColumn(3).setCellRenderer(tblRenderer_BtnUpdate);
        table_view.getColumnModel().getColumn(3).setMinWidth(35);
        table_view.getColumnModel().getColumn(3).setMaxWidth(35);
        table_view.getColumnModel().getColumn(3).setPreferredWidth(35);
        table_view.getColumnModel().getColumn(3).setResizable(false);
        table_view.setFillsViewportHeight(true);
        
        // Set table's header font
        JTableHeader th = table_view.getTableHeader();
        th.setFont(new Font("Tahoma", Font.BOLD, 11));
        
        DefaultTableCellRenderer renderHeaderCenter = (DefaultTableCellRenderer)table_view.getTableHeader().getDefaultRenderer();
        renderHeaderCenter.setHorizontalAlignment(JLabel.CENTER);
        table_view.getColumnModel().getColumn(1).setHeaderRenderer(renderHeaderCenter);
        
        DefaultTableCellRenderer renderCellLeft = new DefaultTableCellRenderer();
        renderCellLeft.setHorizontalAlignment(SwingConstants.LEFT);
        table_view.getColumnModel().getColumn(1).setCellRenderer(renderCellLeft);
        
        DefaultTableCellRenderer renderCellCenter = new DefaultTableCellRenderer();
        renderCellCenter.setHorizontalAlignment(SwingConstants.CENTER);
        table_view.getColumnModel().getColumn(2).setCellRenderer(renderCellCenter);
        
        // Repaint table
        table_view.repaint();
        
        // Set row count
        countTableRow();
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
                        cmbboxList.add(ct, Integer.parseInt(rs.getString(1)));
                        dcbm.addElement(rs.getString(2).trim());
                        ct++;
                    }
                }
                
                cmbboxName.setModel(dcbm);
                ClassComplexCellrenderer renderer = new ClassComplexCellrenderer();
                renderer.title = "Select an Eligibility";
                renderer.isForDialog = true;
                cmbboxName.setRenderer(renderer);
                
                // Close excess connection
                c.close();
                
            }
        } catch (SQLException ex) {
            // Logger.getLogger(this.panel_ancestor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
