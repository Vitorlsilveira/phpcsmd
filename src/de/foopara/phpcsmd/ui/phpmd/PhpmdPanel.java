package de.foopara.phpcsmd.ui.phpmd;

import de.foopara.phpcsmd.generics.GenericHelper;
import de.foopara.phpcsmd.generics.GenericOptionsPanel;
import de.foopara.phpcsmd.option.PhpmdOptions;
import de.foopara.phpcsmd.option.phpmd.GenericPhpmdSniffRegistry;

/**
 *
 * @author nspecht
 */
public class PhpmdPanel extends GenericOptionsPanel
{

    private static PhpmdPanel instance = null;

    public static PhpmdPanel getInstance() {
        return PhpmdPanel.instance;
    }

    /**
     * Creates new form PhpmdPanel
     */
    public PhpmdPanel() {
        initComponents();
        PhpmdPanel.instance = this;
        this.jLabel5.setText("e.g. " + GenericHelper.implode(",", GenericPhpmdSniffRegistry.getInstance().getRulesets()));
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

        optActive = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        optScript = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        optRules = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        optSuffixes = new javax.swing.JTextField();
        JLabel4 = new javax.swing.JLabel();
        optExclude = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        optPriority = new javax.swing.JTextField();
        optStrict = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        optActive.setText(org.openide.util.NbBundle.getMessage(PhpmdPanel.class, "PhpmdPanel.optActive.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optActive, gridBagConstraints);

        jLabel1.setText(org.openide.util.NbBundle.getMessage(PhpmdPanel.class, "PhpmdPanel.jLabel1.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jLabel1, gridBagConstraints);

        optScript.setText(org.openide.util.NbBundle.getMessage(PhpmdPanel.class, "PhpmdPanel.optScript.text")); // NOI18N
        optScript.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                optScriptKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optScript, gridBagConstraints);

        jLabel2.setText(org.openide.util.NbBundle.getMessage(PhpmdPanel.class, "PhpmdPanel.jLabel2.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 100;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jLabel2, gridBagConstraints);

        optRules.setText(org.openide.util.NbBundle.getMessage(PhpmdPanel.class, "PhpmdPanel.optRules.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 100;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optRules, gridBagConstraints);

        jLabel3.setText(org.openide.util.NbBundle.getMessage(PhpmdPanel.class, "PhpmdPanel.jLabel3.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 102;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jLabel3, gridBagConstraints);

        optSuffixes.setText(org.openide.util.NbBundle.getMessage(PhpmdPanel.class, "PhpmdPanel.optSuffixes.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 102;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optSuffixes, gridBagConstraints);

        JLabel4.setText(org.openide.util.NbBundle.getMessage(PhpmdPanel.class, "PhpmdPanel.JLabel4.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 103;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(JLabel4, gridBagConstraints);

        optExclude.setText(org.openide.util.NbBundle.getMessage(PhpmdPanel.class, "PhpmdPanel.optExclude.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 103;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optExclude, gridBagConstraints);

        jLabel4.setText(org.openide.util.NbBundle.getMessage(PhpmdPanel.class, "PhpmdPanel.jLabel4.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 104;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jLabel4, gridBagConstraints);

        optPriority.setText(org.openide.util.NbBundle.getMessage(PhpmdPanel.class, "PhpmdPanel.optPriority.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 104;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optPriority, gridBagConstraints);

        optStrict.setText(org.openide.util.NbBundle.getMessage(PhpmdPanel.class, "PhpmdPanel.optStrict.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 105;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optStrict, gridBagConstraints);

        jLabel5.setText(org.openide.util.NbBundle.getMessage(PhpmdPanel.class, "PhpmdPanel.jLabel5.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 101;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jLabel5, gridBagConstraints);

        jButton1.setText(org.openide.util.NbBundle.getMessage(PhpmdPanel.class, "PhpmdPanel.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jButton1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.chooseScriptFile(this.optScript);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void optScriptKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_optScriptKeyReleased
        this.hasValidValues();
    }//GEN-LAST:event_optScriptKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JCheckBox optActive;
    private javax.swing.JTextField optExclude;
    private javax.swing.JTextField optPriority;
    private javax.swing.JTextField optRules;
    private javax.swing.JTextField optScript;
    private javax.swing.JCheckBox optStrict;
    private javax.swing.JTextField optSuffixes;
    // End of variables declaration//GEN-END:variables

    @Override
    public void load() {
        this.optActive.setSelected((Boolean)PhpmdOptions.loadOriginal(PhpmdOptions.Settings.ACTIVATED));
        this.optScript.setText((String)PhpmdOptions.loadOriginal(PhpmdOptions.Settings.SCRIPT));
        this.optRules.setText((String)PhpmdOptions.loadOriginal(PhpmdOptions.Settings.RULES));
        this.optSuffixes.setText((String)PhpmdOptions.loadOriginal(PhpmdOptions.Settings.SUFFIXES));
        this.optExclude.setText((String)PhpmdOptions.loadOriginal(PhpmdOptions.Settings.EXCLUDE));
        this.optPriority.setText((String)PhpmdOptions.loadOriginal(PhpmdOptions.Settings.MINPRIORITY));
        this.optStrict.setSelected((Boolean)PhpmdOptions.loadOriginal(PhpmdOptions.Settings.STRICT));
        this.hasValidValues();
    }

    @Override
    public void save() {
        PhpmdOptions.set(PhpmdOptions.Settings.ACTIVATED, this.optActive.isSelected());

        PhpmdOptions.set(PhpmdOptions.Settings.SCRIPT, this.optScript.getText());
        PhpmdOptions.set(PhpmdOptions.Settings.RULES, this.optRules.getText());
        PhpmdOptions.set(PhpmdOptions.Settings.SUFFIXES, this.optSuffixes.getText());
        PhpmdOptions.set(PhpmdOptions.Settings.EXCLUDE, this.optExclude.getText());
        PhpmdOptions.set(PhpmdOptions.Settings.MINPRIORITY, this.optPriority.getText());
        PhpmdOptions.set(PhpmdOptions.Settings.STRICT, this.optStrict.isSelected());
    }

    @Override
    public boolean hasValidValues() {
        boolean ret = true;
        ret = ret & (!this.optActive.isSelected() || this.textfieldContainsExistingFile(this.optScript));
        return ret;
    }

}
