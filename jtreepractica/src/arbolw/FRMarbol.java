package arbolw;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;


public class FRMarbol extends javax.swing.JFrame {

    DefaultTreeModel modelo = null;
    
    public FRMarbol()
    {
        initComponents();
        meter();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tree = new javax.swing.JTree();
        btn_Agregar = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(Tree);

        btn_Agregar.setText("Agregar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });

        btn_Delete.setText("Borrar");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Delete))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(302, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Agregar)
                    .addComponent(btn_Delete))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        //Agrega un nodo en donde es creado en el orden correcto
        String cade = JOptionPane.showInputDialog(this, "Ingrese el nombre del libro :");
        DefaultMutableTreeNode parentNode = null;
        DefaultMutableTreeNode child = new DefaultMutableTreeNode(cade);
        TreePath parentPath = Tree.getSelectionPath();

        if (parentPath == null) 
        {} 
        else
        {
            parentNode = (DefaultMutableTreeNode) (parentPath.getLastPathComponent());
        }
        modelo.insertNodeInto(child, parentNode, parentNode.getChildCount());
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        DefaultMutableTreeNode parentNode = null;
        TreePath parentPath = Tree.getSelectionPath();

        if (parentPath == null) 
        { } 
        else 
        {
            parentNode = (DefaultMutableTreeNode) (parentPath.getLastPathComponent());
        }
        modelo.removeNodeFromParent(parentNode);
    }//GEN-LAST:event_btn_DeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    UIManager.setLookAndFeel(
                            UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                    System.err.println("Couldn't use system look and feel.");
                }

                new FRMarbol().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree Tree;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public DefaultTreeModel cargarArbol() {

        DefaultMutableTreeNode Titulo = null;
        DefaultMutableTreeNode categorias = null;
        DefaultMutableTreeNode libros = null;
        //Raiz
        Titulo = new DefaultMutableTreeNode("Inventario Libros");
        modelo = new DefaultTreeModel(Titulo);
        //Rama uno
        categorias = new DefaultMutableTreeNode("Novelas");
        libros = new DefaultMutableTreeNode("Inferno");
        modelo.insertNodeInto(categorias, Titulo, 0);
        modelo.insertNodeInto(libros, categorias, 0);
        
        libros = new DefaultMutableTreeNode("akakaka");
        modelo.insertNodeInto(categorias, Titulo, 0);
        modelo.insertNodeInto(libros, categorias, 1);
        
        libros = new DefaultMutableTreeNode("hnhgnhn");
        modelo.insertNodeInto(categorias, Titulo, 0);
        modelo.insertNodeInto(libros, categorias, 2);
        //Rama dos
        categorias = new DefaultMutableTreeNode("Terror");
        libros = new DefaultMutableTreeNode("Eso");
        modelo.insertNodeInto(categorias, Titulo, 1);
        modelo.insertNodeInto(libros, categorias, 0);
        //Rama tres
        categorias = new DefaultMutableTreeNode("Historia");
        libros = new DefaultMutableTreeNode("Mexico");
        modelo.insertNodeInto(categorias, Titulo, 2);
        modelo.insertNodeInto(libros, categorias, 0);
        return modelo;
    }

    public void meter()
    {
        Tree.setModel(cargarArbol());
    }
}
