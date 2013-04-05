/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.foopara.phpcsmd.ui.pdepend;

import de.foopara.phpcsmd.generics.GenericOptionsPanel;
import de.foopara.phpcsmd.option.PdependOptions;
import org.openide.util.Lookup;

public class PdependPropertyPanel extends GenericOptionsPanel
{

    protected Lookup lkp = null;

    public PdependPropertyPanel() {
        this(null);
    }

    /**
     * Creates new form PdependPropertyPanel
     */
    public PdependPropertyPanel(Lookup lkp) {
        super();
        this.lkp = lkp;
        initComponents();
        this.load();
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        optSuffix = new javax.swing.JTextField();
        owSuffix = new javax.swing.JCheckBox();
        owExclude = new javax.swing.JCheckBox();
        optExclude = new javax.swing.JTextField();
        owIgnore = new javax.swing.JCheckBox();
        optIgnore = new javax.swing.JTextField();
        owIniOverwrite = new javax.swing.JCheckBox();
        optIniOverwrite = new javax.swing.JTextField();
        owTabs = new javax.swing.JCheckBox();
        owJdepend = new javax.swing.JCheckBox();
        optTabs = new javax.swing.JCheckBox();
        optJdepend = new javax.swing.JCheckBox();

        setLayout(new java.awt.GridBagLayout());

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(PdependPropertyPanel.class, "PdependPropertyPanel.jLabel1.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 2, 2);
        add(jLabel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 2, 2);
        add(jSeparator1, gridBagConstraints);

        optSuffix.setText(org.openide.util.NbBundle.getMessage(PdependPropertyPanel.class, "PdependPropertyPanel.optSuffix.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optSuffix, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(owSuffix, org.openide.util.NbBundle.getMessage(PdependPropertyPanel.class, "PdependPropertyPanel.owSuffix.text")); // NOI18N
        owSuffix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                owActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(owSuffix, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(owExclude, org.openide.util.NbBundle.getMessage(PdependPropertyPanel.class, "PdependPropertyPanel.owExclude.text")); // NOI18N
        owExclude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                owActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(owExclude, gridBagConstraints);

        optExclude.setText(org.openide.util.NbBundle.getMessage(PdependPropertyPanel.class, "PdependPropertyPanel.optExclude.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optExclude, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(owIgnore, org.openide.util.NbBundle.getMessage(PdependPropertyPanel.class, "PdependPropertyPanel.owIgnore.text")); // NOI18N
        owIgnore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                owActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(owIgnore, gridBagConstraints);

        optIgnore.setText(org.openide.util.NbBundle.getMessage(PdependPropertyPanel.class, "PdependPropertyPanel.optIgnore.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optIgnore, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(owIniOverwrite, org.openide.util.NbBundle.getMessage(PdependPropertyPanel.class, "PdependPropertyPanel.owIniOverwrite.text")); // NOI18N
        owIniOverwrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                owActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(owIniOverwrite, gridBagConstraints);

        optIniOverwrite.setText(org.openide.util.NbBundle.getMessage(PdependPropertyPanel.class, "PdependPropertyPanel.optIniOverwrite.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optIniOverwrite, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(owTabs, org.openide.util.NbBundle.getMessage(PdependPropertyPanel.class, "PdependPropertyPanel.owTabs.text")); // NOI18N
        owTabs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                owActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(owTabs, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(owJdepend, org.openide.util.NbBundle.getMessage(PdependPropertyPanel.class, "PdependPropertyPanel.owJdepend.text")); // NOI18N
        owJdepend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                owActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(owJdepend, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(optTabs, org.openide.util.NbBundle.getMessage(PdependPropertyPanel.class, "PdependPropertyPanel.optTabs.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optTabs, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(optJdepend, org.openide.util.NbBundle.getMessage(PdependPropertyPanel.class, "PdependPropertyPanel.optJdepend.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optJdepend, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void owActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_owActionPerformed
        this.updateForm();
    }//GEN-LAST:event_owActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField optExclude;
    private javax.swing.JTextField optIgnore;
    private javax.swing.JTextField optIniOverwrite;
    private javax.swing.JCheckBox optJdepend;
    private javax.swing.JTextField optSuffix;
    private javax.swing.JCheckBox optTabs;
    private javax.swing.JCheckBox owExclude;
    private javax.swing.JCheckBox owIgnore;
    private javax.swing.JCheckBox owIniOverwrite;
    private javax.swing.JCheckBox owJdepend;
    private javax.swing.JCheckBox owSuffix;
    private javax.swing.JCheckBox owTabs;
    // End of variables declaration//GEN-END:variables

    @Override
    public void load() {
        owSuffix.setSelected(PdependOptions.isOverwritten(PdependOptions.Settings.SUFFIXES, this.lkp));
        optSuffix.setText((String)PdependOptions.load(PdependOptions.Settings.SUFFIXES, this.lkp));
        owExclude.setSelected(PdependOptions.isOverwritten(PdependOptions.Settings.EXCLUDE, this.lkp));
        optExclude.setText((String)PdependOptions.load(PdependOptions.Settings.EXCLUDE, this.lkp));
        owIgnore.setSelected(PdependOptions.isOverwritten(PdependOptions.Settings.IGNORES, this.lkp));
        optIgnore.setText((String)PdependOptions.load(PdependOptions.Settings.IGNORES, this.lkp));
        owIniOverwrite.setSelected(PdependOptions.isOverwritten(PdependOptions.Settings.INIOVERWRITE, this.lkp));
        optIniOverwrite.setText((String)PdependOptions.load(PdependOptions.Settings.INIOVERWRITE, this.lkp));
        owTabs.setSelected(PdependOptions.isOverwritten(PdependOptions.Settings.USETABS, this.lkp));
        optTabs.setSelected((Boolean)PdependOptions.load(PdependOptions.Settings.USETABS, this.lkp));
        owJdepend.setSelected(PdependOptions.isOverwritten(PdependOptions.Settings.JDEPEND, this.lkp));
        optJdepend.setSelected((Boolean)PdependOptions.load(PdependOptions.Settings.JDEPEND, this.lkp));
        this.updateForm();
    }

    @Override
    public void save() {
        PdependOptions.overwrite(PdependOptions.Settings.SUFFIXES, owSuffix.isSelected() ? optSuffix.getText() : null, this.lkp);
        PdependOptions.overwrite(PdependOptions.Settings.EXCLUDE, owExclude.isSelected() ? optExclude.getText() : null, this.lkp);
        PdependOptions.overwrite(PdependOptions.Settings.IGNORES, owIgnore.isSelected() ? optIgnore.getText() : null, this.lkp);
        PdependOptions.overwrite(PdependOptions.Settings.INIOVERWRITE, owIniOverwrite.isSelected() ? optIniOverwrite.getText() : null, this.lkp);
        PdependOptions.overwrite(PdependOptions.Settings.USETABS, owTabs.isSelected() ? optTabs.isSelected() : null, this.lkp);
        PdependOptions.overwrite(PdependOptions.Settings.JDEPEND, owJdepend.isSelected() ? optJdepend.isSelected() : null, this.lkp);
    }

    @Override
    public boolean hasValidValues() {
        return true;
    }

    public void updateForm() {
        optSuffix.setEnabled(owSuffix.isSelected());
        optExclude.setEnabled(owExclude.isSelected());
        optIgnore.setEnabled(owIgnore.isSelected());
        optIniOverwrite.setEnabled(owIniOverwrite.isSelected());
        optTabs.setEnabled(owTabs.isSelected());
        optJdepend.setEnabled(owJdepend.isSelected());
    }

}