package de.foopara.phpcsmd.ui.phpcs;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.HashMap;

import javax.swing.DefaultComboBoxModel;

import de.foopara.phpcsmd.exec.phpcs.Phpcs;
import de.foopara.phpcsmd.generics.GenericOptionsPanel;
import de.foopara.phpcsmd.option.PhpcsOptions;
import de.foopara.phpcsmd.option.phpcs.GenericPhpcsSniffRegistry;
import de.foopara.phpcsmd.option.phpcs.PhpcsSniff;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author nspecht
 */
public class PhpcsPanel extends GenericOptionsPanel
{

    private static PhpcsPanel instance = null;
    private javax.swing.JPanel standardPanel;

    private HashMap<String, javax.swing.JCheckBox> sniffOpts = new HashMap<String, javax.swing.JCheckBox>();

    private HashMap<String, javax.swing.JCheckBox> sniffTask = new HashMap<String, javax.swing.JCheckBox>();

    public static PhpcsPanel getInstance() {
        return PhpcsPanel.instance;
    }

    private void _clearInstalledStandards() {
        this.jComboBox1.removeAllItems();
        ((DefaultComboBoxModel)this.jComboBox1.getModel())
                .addElement("-- you can select one of the following standards --");
    }

    /**
     * Creates new form PhpcsPanel
     */
    public PhpcsPanel() {
        initComponents();
        this.provideStandards();
        this.jComboBox1.setModel(new DefaultComboBoxModel());
        this._clearInstalledStandards();
        PhpcsPanel.instance = this;
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
        optScript = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        optStandard = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        optExt = new javax.swing.JTextField();
        optIgnore = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        optWarning = new javax.swing.JCheckBox();
        optActive = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        optSniffs = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        optTabwidth = new javax.swing.JSpinner();
        optXtra = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        optIniOverwrite = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        jLabel1.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.jLabel1.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 50;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jLabel1, gridBagConstraints);

        optScript.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.optScript.text")); // NOI18N
        optScript.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                optScriptKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 50;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optScript, gridBagConstraints);

        jLabel2.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.jLabel2.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 101;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jLabel2, gridBagConstraints);

        optStandard.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.optStandard.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 101;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optStandard, gridBagConstraints);

        jLabel3.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.jLabel3.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 103;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jLabel3, gridBagConstraints);

        jLabel4.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.jLabel4.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 104;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jLabel4, gridBagConstraints);

        optExt.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.optExt.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 103;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optExt, gridBagConstraints);

        optIgnore.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.optIgnore.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 104;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optIgnore, gridBagConstraints);

        jButton3.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.jButton3.text")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 101;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jButton3, gridBagConstraints);

        optWarning.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.optWarning.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 200;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optWarning, gridBagConstraints);

        optActive.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.optActive.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optActive, gridBagConstraints);

        jButton2.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.jButton2.text")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 51;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jButton2, gridBagConstraints);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--- select ---" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 51;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jComboBox1, gridBagConstraints);

        jLabel5.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.jLabel5.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 102;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jLabel5, gridBagConstraints);

        optSniffs.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.optSniffs.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 102;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optSniffs, gridBagConstraints);

        jLabel6.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.jLabel6.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 105;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jLabel6, gridBagConstraints);

        optTabwidth.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(-1), Integer.valueOf(-1), null, Integer.valueOf(1)));
        optTabwidth.setToolTipText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.optTabwidth.toolTipText")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 105;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optTabwidth, gridBagConstraints);

        optXtra.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.optXtra.text")); // NOI18N
        optXtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optXtraActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 300;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(optXtra, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 300;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        add(jSeparator1, gridBagConstraints);

        jLabel7.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.jLabel7.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 106;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jLabel7, gridBagConstraints);

        optIniOverwrite.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.optIniOverwrite.text")); // NOI18N
        optIniOverwrite.setToolTipText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.optIniOverwrite.toolTipText")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 106;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(optIniOverwrite, gridBagConstraints);

        jButton1.setText(org.openide.util.NbBundle.getMessage(PhpcsPanel.class, "PhpcsPanel.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 50;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(jButton1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this._clearInstalledStandards();

        String installed[] = Phpcs.getStandards(optScript.getText());
        if (installed != null && installed.length > 0) {
            for (String standard : installed) {
                ((DefaultComboBoxModel)this.jComboBox1.getModel()).addElement(standard.trim());
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (this.jComboBox1.getSelectedIndex() > 0) {
            this.optStandard.setText((String)this.jComboBox1.getModel().getSelectedItem());
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void optScriptKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_optScriptKeyReleased
        this.hasValidValues();
    }//GEN-LAST:event_optScriptKeyReleased

    private void optXtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optXtraActionPerformed
        this.standardPanel.setVisible(this.optXtra.isSelected());
    }//GEN-LAST:event_optXtraActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        File script = new File(optStandard.getText());

        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Custom Standard");
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fc.setMultiSelectionEnabled(false);
        if (script.exists()) {
            fc.setSelectedFile(script);
        }
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            optStandard.setText(fc.getSelectedFile().getAbsolutePath());
        }
        this.hasValidValues();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.chooseScriptFile(this.optScript);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox optActive;
    private javax.swing.JTextField optExt;
    private javax.swing.JTextField optIgnore;
    private javax.swing.JTextField optIniOverwrite;
    private javax.swing.JTextField optScript;
    private javax.swing.JTextField optSniffs;
    private javax.swing.JTextField optStandard;
    private javax.swing.JSpinner optTabwidth;
    private javax.swing.JCheckBox optWarning;
    private javax.swing.JCheckBox optXtra;
    // End of variables declaration//GEN-END:variables

    @Override
    public void load() {
        this.optActive.setSelected((Boolean)PhpcsOptions.loadOriginal(PhpcsOptions.Settings.ACTIVATED));

        this.optScript.setText((String)PhpcsOptions.loadOriginal(PhpcsOptions.Settings.SCRIPT));
        this.optStandard.setText((String)PhpcsOptions.loadOriginal(PhpcsOptions.Settings.STANDARD));
        this.optSniffs.setText((String)PhpcsOptions.loadOriginal(PhpcsOptions.Settings.SNIFFS));
        this.optExt.setText((String)PhpcsOptions.loadOriginal(PhpcsOptions.Settings.EXTENSIONS));
        this.optIgnore.setText((String)PhpcsOptions.loadOriginal(PhpcsOptions.Settings.IGNORES));
        this.optTabwidth.setValue((Integer)PhpcsOptions.loadOriginal(PhpcsOptions.Settings.TABWIDTH));
        this.optIniOverwrite.setText((String)PhpcsOptions.loadOriginal(PhpcsOptions.Settings.INIOVERWRITE));

        this.optWarning.setSelected((Boolean)PhpcsOptions.loadOriginal(PhpcsOptions.Settings.WARNINGS));
        this.optXtra.setSelected((Boolean)PhpcsOptions.loadOriginal(PhpcsOptions.Settings.EXTRAS));

        for (String key : this.sniffOpts.keySet()) {
            this.sniffOpts.get(key).setSelected(PhpcsOptions.getSniff(key));
        }

        for (String key : this.sniffTask.keySet()) {
            this.sniffTask.get(key).setSelected(PhpcsOptions.getSniffTask(key));
        }

        this.hasValidValues();
        this.optXtraActionPerformed(null);
    }

    @Override
    public void save() {
        PhpcsOptions.set(PhpcsOptions.Settings.ACTIVATED, this.optActive.isSelected());

        PhpcsOptions.set(PhpcsOptions.Settings.SCRIPT, this.optScript.getText());
        PhpcsOptions.set(PhpcsOptions.Settings.STANDARD, this.optStandard.getText());
        PhpcsOptions.set(PhpcsOptions.Settings.SNIFFS, this.optSniffs.getText());
        PhpcsOptions.set(PhpcsOptions.Settings.EXTENSIONS, this.optExt.getText());
        PhpcsOptions.set(PhpcsOptions.Settings.IGNORES, this.optIgnore.getText());
        PhpcsOptions.set(PhpcsOptions.Settings.TABWIDTH, (Integer)this.optTabwidth.getValue());
        PhpcsOptions.set(PhpcsOptions.Settings.INIOVERWRITE, this.optIniOverwrite.getText());

        PhpcsOptions.set(PhpcsOptions.Settings.WARNINGS, this.optWarning.isSelected());
        PhpcsOptions.set(PhpcsOptions.Settings.EXTRAS, this.optXtra.isSelected());

        for (String key : this.sniffOpts.keySet()) {
            PhpcsOptions.setSniff(key, this.sniffOpts.get(key).isSelected());
        }
        for (String key : this.sniffTask.keySet()) {
            PhpcsOptions.setSniffTask(key, this.sniffTask.get(key).isSelected());
        }
    }

    public void provideStandards() {

        java.awt.GridBagConstraints gridBagConstraints;

        javax.swing.JTabbedPane standardTab = new javax.swing.JTabbedPane();
        standardTab.setTabLayoutPolicy(javax.swing.JTabbedPane.WRAP_TAB_LAYOUT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 0);

        this.standardPanel = new javax.swing.JPanel();
        this.standardPanel.setLayout(new java.awt.GridBagLayout());
        this.standardPanel.add(standardTab, gridBagConstraints);
        this.standardPanel.setMinimumSize(new Dimension(-1, 200));
        this.standardPanel.setMaximumSize(new Dimension(-1, 400));
        this.standardPanel.setPreferredSize(new Dimension(-1, 400));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 301;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        add(this.standardPanel, gridBagConstraints);


        for (String standardStr : GenericPhpcsSniffRegistry.getInstance().getStandards()) {
            javax.swing.JTabbedPane classTab = new javax.swing.JTabbedPane();
            classTab.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
            classTab.setTabPlacement(javax.swing.JTabbedPane.LEFT);
            standardTab.add(standardStr, classTab);

            for (String classStr : GenericPhpcsSniffRegistry.getInstance().getStandard(standardStr).getClasses()) {
                javax.swing.JPanel classPanel = new javax.swing.JPanel();
                javax.swing.JScrollPane scroll = new javax.swing.JScrollPane(classPanel);
                classPanel.setLayout(new java.awt.GridBagLayout());
                scroll.setMaximumSize(new Dimension(-1, 200));
                classTab.add(scroll, classStr);

                javax.swing.JLabel labelSniff = new javax.swing.JLabel("<html><body><b>Sniff</b></body></html>");
                javax.swing.JLabel labelTask = new javax.swing.JLabel("<html><body><b>show in Tasklist</b></body></html>");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
                gridBagConstraints.weightx = 0.8;
                gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
                classPanel.add(labelSniff, gridBagConstraints);

                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 2;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
                gridBagConstraints.weightx = 0.2;
                gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
                classPanel.add(labelTask, gridBagConstraints);

                int offset = 1;
                for (PhpcsSniff sniff : GenericPhpcsSniffRegistry.getInstance().getStandard(standardStr).getClass(classStr).getSniffs()) {
                    java.awt.Image img;
                    if (sniff.annotationType != null) {
                        img = Toolkit.getDefaultToolkit().getImage(PhpcsPanel.class.getResource("/de/foopara/phpcsmd/resources/phpcs/" + sniff.annotationType + ".png"));
                    } else {
                        img = Toolkit.getDefaultToolkit().getImage(PhpcsPanel.class.getResource("/de/foopara/phpcsmd/resources/phpcs/violation.jpg"));
                    }
                    javax.swing.JLabel icon = new javax.swing.JLabel(new javax.swing.ImageIcon(img));
                    gridBagConstraints = new java.awt.GridBagConstraints();
                    gridBagConstraints.gridx = 0;
                    gridBagConstraints.gridy = offset;
                    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
                    gridBagConstraints.weightx = 0;
                    gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
                    classPanel.add(icon, gridBagConstraints);

                    javax.swing.JCheckBox compSniff = new javax.swing.JCheckBox(sniff.getDescription());
                    this.sniffOpts.put(sniff.shortName, compSniff);
                    gridBagConstraints = new java.awt.GridBagConstraints();
                    gridBagConstraints.gridx = 1;
                    gridBagConstraints.gridy = offset;
                    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
                    gridBagConstraints.weightx = 0.2;
                    gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
                    classPanel.add(compSniff, gridBagConstraints);

                    javax.swing.JCheckBox compTask = new javax.swing.JCheckBox();
                    this.sniffTask.put(sniff.shortName, compTask);
                    gridBagConstraints = new java.awt.GridBagConstraints();
                    gridBagConstraints.gridx = 2;
                    gridBagConstraints.gridy = offset;
                    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
                    gridBagConstraints.weightx = 1;
                    gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
                    classPanel.add(compTask, gridBagConstraints);
                    offset++;

                    if (sniff.getKeyCount() > 1) {
                        for (String sniffKey : sniff.getKeys().keySet()) {
                            javax.swing.JCheckBox compSniffKey = new javax.swing.JCheckBox("ignore " + sniff.getKeys().get(sniffKey));
                            this.sniffOpts.put(sniffKey, compSniffKey);
                            gridBagConstraints = new java.awt.GridBagConstraints();
                            gridBagConstraints.gridx = 1;
                            gridBagConstraints.gridy = offset;
                            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
                            gridBagConstraints.weightx = 0.2;
                            gridBagConstraints.insets = new java.awt.Insets(0, 20, 2, 2);
                            classPanel.add(compSniffKey, gridBagConstraints);
                            offset++;
                        }
                    }
                }
            }
        }
    }

    @Override
    public boolean hasValidValues() {
        boolean ret = true;
        ret = ret & (!this.optActive.isSelected() || this.textfieldContainsExistingFile(this.optScript));
        return ret;
    }

}
