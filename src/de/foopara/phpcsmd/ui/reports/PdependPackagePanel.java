/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.foopara.phpcsmd.ui.reports;

import de.foopara.phpcsmd.exec.pdepend.PdependTypes;
import de.foopara.phpcsmd.option.PdependOptions;
import java.util.HashSet;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author nspecht
 */
public class PdependPackagePanel extends PdependGenericResultPanel {

    private boolean jDependActive = false;
    /**
     * Creates new form PdependPackagePanel
     */
    public PdependPackagePanel() {
        super();
        initComponents();
        this.addLabel("name", "Name", "Package");
        this.addSeparator(null, "Counts", "Package");
        this.addLabel("noc", "Number of Classes", "Package");
        this.addLabel("noi", "Number of Interfaces", "Package");
        this.addLabel("nom", "Number of Methods", "Package");
        this.addLabel("nof", "Number of Functions", "Package");

        this.jDependActive = PdependOptions.getJDepend();
        if (this.jDependActive) {
            this.addSeparator(null, "JDepend Graph", "JDepend Graph");
            this.addComponent(new JdependGraph(), "JDependGraph", null, "JDepend Graph");
            this.addSeparator(null, "JDepend", "JDepend");
            this.addLabel("TotalClasses", "Total Classes", "JDepend");
            this.addLabel("ConcreteClasses", "Concrete Classes", "JDepend");
            this.addLabel("AbstractClasses", "Abstract Classes", "JDepend");
            this.addLabel("Ca", "Afferent Coupling", "JDepend");
            this.addLabel("Ce", "Efferent Coupling", "JDepend");
            this.addProgressbar("A",  "Abstraction", "JDepend");
            this.addProgressbar("I",  "Instability", "JDepend");
            this.addProgressbar("D",  "Distance", "JDepend");
            this.addLabel("dependsOn", "Depends On", "JDepend");
            this.addLabel("usedBy", "Used By", "JDepend");

            ((JProgressBar)this.elements.get("A")).setMaximum(100);
            ((JProgressBar)this.elements.get("I")).setMaximum(100);
            ((JProgressBar)this.elements.get("D")).setMaximum(100);
        }
    }

    public void setPackage(PdependTypes.PdependPackage pack) {
        this.setFields(pack);
        JProgressBar bar;

        if (this.jDependActive) {
            bar = (JProgressBar)this.elements.get("A");
            bar.setValue((int)(pack.A*100));
            bar.setString(bar.getValue() + "%");

            bar = (JProgressBar)this.elements.get("I");
            bar.setValue((int)(pack.I*100));
            bar.setString(bar.getValue() + "%");

            bar = (JProgressBar)this.elements.get("D");
            bar.setValue((int)(pack.D*100));
            bar.setString(bar.getValue() + "%");

            HashSet<PdependTypes.PdependPackage> hashSet = new HashSet<PdependTypes.PdependPackage>();
            hashSet.add(pack);
            ((JdependGraph)this.elements.get("JDependGraph")).setPackages(hashSet);

            StringBuilder buf;

            buf = new StringBuilder("<html><body>");
            for(PdependTypes.PdependPackage p : pack.getDepends()) {
                buf.append(p.name).append("<br>");
            }
            buf.append("</body></html>");
            ((JLabel)this.elements.get("dependsOn")).setText(buf.toString());

            buf = new StringBuilder("<html><body>");
            for(PdependTypes.PdependPackage p : pack.getUsedBy()) {
                buf.append(p.name).append("<br>");
            }
            buf.append("</body></html>");
            ((JLabel)this.elements.get("usedBy")).setText(buf.toString());
        }
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
