/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.foopara.phpcsmd.ui.reports;

import de.foopara.phpcsmd.exec.pdepend.PdependTypes;
import javax.swing.JLabel;

/**
 *
 * @author n.specht
 */
public class PdependMetricsPanel extends javax.swing.JPanel {

    private JLabel displayAHH;
    private JLabel displayANDC;

    /**
     * Creates new form PdependMetricsPanel
     */
    public PdependMetricsPanel() {
        initComponents();
        int row = 0;
        this.displayAHH  = this.addLabel("Average Hierarchy Height"         , row); row++;
        this.displayANDC = this.addLabel("Average Number of Derived Classes", row); row++;

    }

    private JLabel addLabel(String caption, int row) {
        java.awt.GridBagConstraints gridBagConstraints;

        JLabel cap = new JLabel(caption + ": ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = row;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        this.add(cap, gridBagConstraints);

        JLabel ret = new JLabel("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = row;
        this.add(ret, gridBagConstraints);

        return ret;
    }

    public void setMetrics(PdependTypes.PdependMetrics metrics) {
        this.displayAHH.setText("" + metrics.ahh);
        this.displayANDC.setText("" + metrics.andc);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.GridBagLayout());
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
