/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import classes.ClassComplexCellrenderer;
import classes.ClassConstantsCustom;
import classes.ClassDateFormatValue;
import classes.ClassJTableCustomCellRenderer;
import classes.ClassMyDBConnectionEmbeddedDerby;
import classes.ClassSearchBy;
import classes.ClassTableButtonEditor;
import classes.ClassTableButtonRenderer;
import classes.ClassTableHeaderListenerCheckbox;
import classes.ClassTableHeaderRendererAlignCenter;
import classes.ClassTableHeaderRendererAlignLeft;
import classes.ClassTableHeaderRendererAlignRight;
import classes.ClassTableHeaderRendererCheckbox;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author egrubellano
 */
public class PanelEmployeesSummary extends javax.swing.JPanel {

    Color rowBGColorOdd = new Color(245, 245, 245);
    Color rowBGColorEvn = new Color(250, 250, 250);
    Color rowBGColorSel = new Color(115, 164, 209);
    Color btnFGColorBasic = new Color(40, 40, 40);
    Color btnBGColorBasic = new Color(205, 205, 205);
    Color btnBGColorHover = new Color(115, 164, 209);
    private BufferedImage img;
    private TableRowSorter sorter;
    private DefaultTableModel model;
    private DefaultComboBoxModel dcbm;
    private final ClassSearchBy searchBy = new ClassSearchBy();
    private final ClassConstantsCustom constant = new ClassConstantsCustom();
    private final ClassDateFormatValue format_date = new ClassDateFormatValue();
    private final ClassJTableCustomCellRenderer chkboxCellRenderer = new ClassJTableCustomCellRenderer();
    private final ImageIcon imgBtnUpdate = new javax.swing.ImageIcon(getClass().getResource("/images/icons/icon_24_eye.png"));
    private final TableCellRenderer th_align_left = new ClassTableHeaderRendererAlignLeft();
    private final TableCellRenderer th_align_right = new ClassTableHeaderRendererAlignRight();
    private final TableCellRenderer th_align_center = new ClassTableHeaderRendererAlignCenter();

    /**
     * Creates new form PanelDashboard
     */
    public PanelEmployeesSummary() {
        initComponents();
        initAdditionalComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panel_control = new javax.swing.JPanel();
        panel_control_buttons = new javax.swing.JPanel();
        panel_control_search = new javax.swing.JPanel();
        panel_search = new javax.swing.JPanel();
        label_search = new javax.swing.JLabel();
        txtfld_search = new javax.swing.JTextField();
        panel_center = new javax.swing.JPanel();
        panel_table = new javax.swing.JPanel();
        scrollpane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        panel_table_result = new javax.swing.JPanel();
        label_table_result_logo = new javax.swing.JLabel();
        label_table_result_total = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        panel_control.setMaximumSize(new java.awt.Dimension(0, 55));
        panel_control.setMinimumSize(new java.awt.Dimension(0, 55));
        panel_control.setOpaque(false);
        panel_control.setPreferredSize(new java.awt.Dimension(0, 55));
        panel_control.setLayout(new java.awt.BorderLayout());

        panel_control_buttons.setOpaque(false);
        panel_control_buttons.setLayout(new java.awt.BorderLayout());
        panel_control.add(panel_control_buttons, java.awt.BorderLayout.CENTER);

        panel_control_search.setMinimumSize(new java.awt.Dimension(210, 35));
        panel_control_search.setOpaque(false);
        panel_control_search.setPreferredSize(new java.awt.Dimension(210, 35));
        panel_control_search.setLayout(new java.awt.CardLayout());

        panel_search.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 10, 10));
        panel_search.setOpaque(false);
        panel_search.setLayout(new java.awt.GridBagLayout());

        label_search.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        label_search.setForeground(new java.awt.Color(50, 50, 50));
        label_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icon_16_magnifier.png"))); // NOI18N
        label_search.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        panel_search.add(label_search, gridBagConstraints);

        txtfld_search.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        txtfld_search.setForeground(new java.awt.Color(75, 75, 75));
        txtfld_search.setMargin(new java.awt.Insets(2, 5, 2, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        panel_search.add(txtfld_search, gridBagConstraints);

        panel_control_search.add(panel_search, "card2");

        panel_control.add(panel_control_search, java.awt.BorderLayout.LINE_END);

        add(panel_control, java.awt.BorderLayout.PAGE_START);

        panel_center.setOpaque(false);
        panel_center.setLayout(new java.awt.BorderLayout());

        panel_table.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 10));
        panel_table.setLayout(new java.awt.CardLayout());

        table.setFillsViewportHeight(true);
        table.setRequestFocusEnabled(false);
        table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrollpane.setViewportView(table);

        panel_table.add(scrollpane, "card_table_result");

        panel_center.add(panel_table, java.awt.BorderLayout.CENTER);

        panel_table_result.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 12, 10, 10));
        panel_table_result.setMinimumSize(new java.awt.Dimension(20, 35));
        panel_table_result.setPreferredSize(new java.awt.Dimension(20, 35));
        panel_table_result.setLayout(new java.awt.BorderLayout());

        label_table_result_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icon_16_user_silhouette_2.png"))); // NOI18N
        label_table_result_logo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        label_table_result_logo.setEnabled(false);
        label_table_result_logo.setMaximumSize(new java.awt.Dimension(16, 0));
        label_table_result_logo.setMinimumSize(new java.awt.Dimension(16, 0));
        label_table_result_logo.setPreferredSize(new java.awt.Dimension(16, 0));
        panel_table_result.add(label_table_result_logo, java.awt.BorderLayout.LINE_START);

        label_table_result_total.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        label_table_result_total.setForeground(new java.awt.Color(125, 125, 125));
        label_table_result_total.setText("0 result");
        label_table_result_total.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        label_table_result_total.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, -1, 0));
        label_table_result_total.setMaximumSize(new java.awt.Dimension(0, 35));
        label_table_result_total.setMinimumSize(new java.awt.Dimension(0, 35));
        label_table_result_total.setPreferredSize(new java.awt.Dimension(0, 35));
        label_table_result_total.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panel_table_result.add(label_table_result_total, java.awt.BorderLayout.CENTER);

        panel_center.add(panel_table_result, java.awt.BorderLayout.PAGE_END);

        add(panel_center, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    public void initAdditionalComponents() {
        initTable();
        fillTable("First Name");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label_search;
    private javax.swing.JLabel label_table_result_logo;
    private javax.swing.JLabel label_table_result_total;
    private javax.swing.JPanel panel_center;
    private javax.swing.JPanel panel_control;
    private javax.swing.JPanel panel_control_buttons;
    private javax.swing.JPanel panel_control_search;
    private javax.swing.JPanel panel_search;
    private javax.swing.JPanel panel_table;
    private javax.swing.JPanel panel_table_result;
    private javax.swing.JScrollPane scrollpane;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtfld_search;
    // End of variables declaration//GEN-END:variables

    enum Status {

        SELECTED, DESELECTED, INDETERMINATE
    }

    private void initTable() {

        // Configure current default-table-model
        model = new DefaultTableModel() {
            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 1:
                        return Boolean.class;
                    default:
                        return String.class;
                }
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                switch (column) {
                    case 1:
                    case 2:
                        return true;
                    default:
                        return false;
                }
            }
        };

        ArrayList<Object> columnTitle = new ArrayList<>();
        int rowCount = 0;

        // Initialize derby database
        ClassMyDBConnectionEmbeddedDerby.initDB();

        try {
            Connection conn = ClassMyDBConnectionEmbeddedDerby.getMyConnection();
            try (Statement st = conn.createStatement()) {
                ResultSet rs = st.executeQuery(
                        "SELECT "
                        + " h.id, "
                        + " COALESCE(h.name_first || ' ', '') || COALESCE(h.name_middle || ' ', '') || h.name_last AS \"Employee Name\", "
                        + " h.plantilla_id AS \"Plantilla No.\", "
                        + " p.name AS \"Position\", "
                        + " o.name AS \"Office\", "
                        + " c.name AS \"Category\", "
                        + " h.date_hired AS \"Date Hired\", "
                        + " d.gender AS \"Gender\", "
                        + " d.civil_status AS \"Civil Status\", "
                        + " d.date_birth AS \"Date of Birth\" "
                        + " FROM "
                        + constant.TABLE_EMPLOYEE_HEADER + " AS h "
                        + " LEFT JOIN " + constant.TABLE_EMPLOYEE_DETAIL + " AS d ON h.id=d.header_id "
                        + " LEFT JOIN " + constant.TABLE_LIST_OFFICE + " AS o ON h.list_off_id=o.id "
                        + " LEFT JOIN " + constant.TABLE_LIST_POSITION + " AS p ON h.list_pos_id=p.id "
                        + " LEFT JOIN " + constant.TABLE_LIST_CATEGORY + " AS c ON h.list_cat_id=c.id "
                        + " WHERE " + constant.COLUMN_FIRST_NAME_UC + " LIKE '!)@(#*$&%^-/+_=~' "
                );

                ResultSetMetaData rsm = rs.getMetaData();
                int columnCount = rsm.getColumnCount();

                for (int i = 1; i <= columnCount; i++) {
                    columnTitle.add(rsm.getColumnName(i));
                    if (i == 1) {
                        columnTitle.add(Status.INDETERMINATE);
                        columnTitle.add("");
                    }
                }

                // Set column headers
                model.setDataVector(null, columnTitle.toArray());

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "\nClosing system.", "Database Connection: Failed", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        // Set model as table's default model
        table = new JTable() {

            @Override
            public Component prepareRenderer(TableCellRenderer renderer, int row, int col) {

                Component c = super.prepareRenderer(renderer, row, col);
                if (c instanceof JComponent) {
                    JComponent jc = (JComponent) c;
                    String name = getValueAt(row, 0).toString();
                    String html = getHtml("employee_" + name);
                    jc.setToolTipText(html);
                }

                return c;
            }

        };

        table.setRowHeight(35);
        table.setModel(model);
        table.setSelectionBackground(new Color(102, 204, 255));
        scrollpane.setViewportView(table);

        // Create & set table sorter
        sorter = new TableRowSorter(model);
        sorter.setSortable(1, false);
        sorter.setSortable(2, false);
        table.setRowSorter(sorter);

        // Set table resize to OFF
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        // Turn OFF user ability to re-order columns
        table.getTableHeader().setReorderingAllowed(false);

        // Initialize custom row color
        table.setDefaultRenderer(Boolean.class, chkboxCellRenderer.CheckboxCellRenderer(rowBGColorOdd, rowBGColorEvn, rowBGColorSel));
        table.setDefaultRenderer(String.class, chkboxCellRenderer.StringCellRenderer(rowBGColorOdd, rowBGColorEvn, rowBGColorSel));

        // Initialize checkbox on table header
        model.addTableModelListener(new ClassTableHeaderListenerCheckbox(table, 1));

        // Initialize checkbox on table columns
        TableCellRenderer r = new ClassTableHeaderRendererCheckbox(table.getTableHeader(), 1);
        table.getColumnModel().getColumn(1).setHeaderRenderer(r);
        table.getColumnModel().getColumn(2).setHeaderRenderer(th_align_left);
        table.getColumnModel().getColumn(3).setHeaderRenderer(th_align_center);
        table.getColumnModel().getColumn(4).setHeaderRenderer(th_align_center);
        table.getColumnModel().getColumn(5).setHeaderRenderer(th_align_center);
        table.getColumnModel().getColumn(6).setHeaderRenderer(th_align_center);
        table.getColumnModel().getColumn(7).setHeaderRenderer(th_align_center);
        table.getColumnModel().getColumn(8).setHeaderRenderer(th_align_center);
        table.getColumnModel().getColumn(9).setHeaderRenderer(th_align_center);
        table.getColumnModel().getColumn(10).setHeaderRenderer(th_align_center);
        table.getColumnModel().getColumn(11).setHeaderRenderer(th_align_center);

        // Set table's header font
        JTableHeader th = table.getTableHeader();
        th.setFont(new Font("Century Gothic", Font.BOLD, 13));

        // Employee's ID
        table.getColumnModel().getColumn(0).setMaxWidth(0);
        table.getColumnModel().getColumn(0).setMinWidth(0);
        table.getColumnModel().getColumn(0).setPreferredWidth(0);
        table.getColumnModel().getColumn(0).setResizable(false);

        // Checkbox
        table.getColumnModel().getColumn(1).setMaxWidth(30);
        table.getColumnModel().getColumn(1).setMinWidth(30);
        table.getColumnModel().getColumn(1).setPreferredWidth(30);
        table.getColumnModel().getColumn(1).setResizable(false);

        // Initialize table update button
        ClassTableButtonEditor tblEditor_BtnUpdate = new ClassTableButtonEditor(imgBtnUpdate, rowBGColorOdd, rowBGColorEvn, rowBGColorSel) {

            @Override
            public void pushAction() {
                int valueUpdate = JOptionPane.showOptionDialog(null, "Update this account?", "Are you sure?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Update", "Cancel"}, null);
                if (valueUpdate == 0) {
                    System.out.println("Update id : " + table.getModel().getValueAt(table.getSelectedRow(), 0));
                }
            }
        };
        tblEditor_BtnUpdate.setTable(table); // Set-up table update button

        ClassTableButtonRenderer tblRenderer_BtnUpdate = new ClassTableButtonRenderer(imgBtnUpdate, rowBGColorOdd, rowBGColorEvn, rowBGColorSel);

        // Update button
        table.getColumnModel().getColumn(2).setCellEditor(tblEditor_BtnUpdate);
        table.getColumnModel().getColumn(2).setCellRenderer(tblRenderer_BtnUpdate);
        table.getColumnModel().getColumn(2).setMaxWidth(35);
        table.getColumnModel().getColumn(2).setMinWidth(35);
        table.getColumnModel().getColumn(2).setPreferredWidth(35);
        table.getColumnModel().getColumn(2).setResizable(false);

        // Employee's name
        table.getColumnModel().getColumn(3).setMinWidth(400);
        table.getColumnModel().getColumn(3).setPreferredWidth(400);

        // Employee's plantilla number
        table.getColumnModel().getColumn(4).setMinWidth(128);
        table.getColumnModel().getColumn(4).setPreferredWidth(128);

        // Employee's position
        table.getColumnModel().getColumn(5).setMinWidth(175);
        table.getColumnModel().getColumn(5).setPreferredWidth(175);

        // Employee's office
        table.getColumnModel().getColumn(6).setMinWidth(224);
        table.getColumnModel().getColumn(6).setPreferredWidth(224);

        // Employee's category
        table.getColumnModel().getColumn(7).setMinWidth(160);
        table.getColumnModel().getColumn(7).setPreferredWidth(160);

        // Employee's date hired
        table.getColumnModel().getColumn(8).setMinWidth(150);
        table.getColumnModel().getColumn(8).setPreferredWidth(150);

        // Employee's gender
        table.getColumnModel().getColumn(9).setMinWidth(75);
        table.getColumnModel().getColumn(9).setPreferredWidth(75);

        // Employee's civil status
        table.getColumnModel().getColumn(10).setMinWidth(100);
        table.getColumnModel().getColumn(10).setPreferredWidth(100);

        // Employee's date of birth
        table.getColumnModel().getColumn(11).setMinWidth(150);
        table.getColumnModel().getColumn(11).setPreferredWidth(150);

        // Repaint table
        table.repaint();

        // Set row count
        label_table_result_total.setText( rowCount + ((rowCount <= 1) ? " result" : " results"));
    }

    private void fillTable(String addWhere) {

        // Empty table data
        model.setRowCount(0);

        // Reset checkbox table header
        table.getTableHeader().getColumnModel().getColumn(1).setHeaderValue(Status.DESELECTED);
        table.getTableHeader().repaint();

        // Ready variables needed
        ArrayList<Object> addRow;
        int rowCount = 0;

        // Initialize derby database
        ClassMyDBConnectionEmbeddedDerby.initDB();

        try {
            Connection conn = ClassMyDBConnectionEmbeddedDerby.getMyConnection();
            try (Statement st = conn.createStatement()) {
                ResultSet rs = st.executeQuery(
                        "SELECT "
                        + " h.id, "
                        + " COALESCE(h.name_first || ' ', '') || COALESCE(h.name_middle || ' ', '') || h.name_last AS \"Employee Name\", "
                        + " h.plantilla_id AS \"Plantilla No.\", "
                        + " p.name AS \"Position\", "
                        + " o.name AS \"Office\", "
                        + " c.name AS \"Category\", "
                        + " h.date_hired AS \"Date Hired\", "
                        + " d.gender AS \"Gender\", "
                        + " d.civil_status AS \"Civil Status\", "
                        + " d.date_birth AS \"Date of Birth\" "
                        + " FROM "
                        + constant.TABLE_EMPLOYEE_HEADER + " AS h "
                        + " LEFT JOIN " + constant.TABLE_EMPLOYEE_DETAIL + " AS d ON h.id=d.header_id "
                        + " LEFT JOIN " + constant.TABLE_LIST_OFFICE + " AS o ON h.list_off_id=o.id "
                        + " LEFT JOIN " + constant.TABLE_LIST_POSITION + " AS p ON h.list_pos_id=p.id "
                        + " LEFT JOIN " + constant.TABLE_LIST_CATEGORY + " AS c ON h.list_cat_id=c.id "
                //                    + " WHERE " + addWhere
                );

                // Set column information
                while (rs.next()) {
                    addRow = new ArrayList<>();
                    for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                        if (i == 7 || i == 10) {
                            addRow.add(format_date.formatDateToString(format_date.formatStringToDate(rs.getString(i)), "MMMM dd, YYYY"));
                        } else {
                            addRow.add(rs.getString(i));
                        }

                        if (i == 1) {
                            addRow.add(false);
                            addRow.add("");
                        }
                    }

                    // Add column data
                    model.addRow(addRow.toArray());
                    model.addRow(addRow.toArray());
                    model.addRow(addRow.toArray());
                    model.addRow(addRow.toArray());
                    model.addRow(addRow.toArray());
                    model.addRow(addRow.toArray());

                    rowCount++;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "\nClosing system.", "Database Connection: Failed", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        // Set model as table's default model
        table.setModel(model);

        // Repaint table
        table.repaint();

        // Set row count
        label_table_result_total.setText( rowCount + ((rowCount <= 1) ? " result" : " results"));
    }

    private void comboBoxLoadFromConstants(ArrayList array, JComboBox cmbbox, String title) {

        dcbm = new DefaultComboBoxModel();
        dcbm.addElement("");

        for (Object arrayData : array) {
            dcbm.addElement(arrayData);
        }

        cmbbox.setModel(dcbm);
        ClassComplexCellrenderer renderer = new ClassComplexCellrenderer();
        renderer.fontTitle = new Font("Arial", Font.ITALIC, 12);
        renderer.font = new Font("Arial", Font.PLAIN, 12);
        renderer.title = title;
        cmbbox.setRenderer(renderer);
    }

    private String getHtml(String name) {

        URL url = getClass().getResource("/img_emp_src/" + name + ".png");
        if (url == null) {
            url = getClass().getResource("/images/emp/preview~1.png");
        }
        String html
                = "<html><body>"
                + "<img src='"
                + url
                + "' width=175 height=175 style='background-color:#FFF;' /></body></html>";
        return html;
    }

}
