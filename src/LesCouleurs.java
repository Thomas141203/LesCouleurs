
import javax.swing.*;
import java.awt.*; 
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Thomas
 */
public class LesCouleurs extends javax.swing.JFrame {
    //Attributs de notre class Frame
    private ArrayList<Color> lstCoulDispo; //On crée un attribut lstCoulDispo de type List, plus précisement une liste de Couleur 
    private ArrayList<String> lstNomCoulDispo; //On crée un attirubt lstNomCoulDispo de type List et précisement une liste de Chaîne de caractères
    private Color tabCoulSelect[]; // On crée un attribut tabCoulSelect qui est un tableau de Couleur
    private String tabNomCoulSelect[]; // On crée un attribut tabNomCoulSelect qui représente un tableau de chaîne de caractère
    private int nb; // On crée un attribut nb de type Integer
    private final int  max = 100; //Ici on va crée un attribut max, qui sera initialiser à 100 et qui à la particularité d'être final et donc qu'il ne pourra pas changer de valeur
    private Color couleurCourante; // Un attribut couleurCourante de type Color 
    private Color couleurBase; //Et un attribut couleurBase de type Color

    public LesCouleurs(){
        //Ici on crée un constructeur de notre class LesCouleurs, on initie notre fenêtre graphique avec le iniComponents.
        //Puis on y instancie nos attributs 
        initComponents();
        this.lstCoulDispo=new ArrayList<Color>();
        this.lstNomCoulDispo=new ArrayList<String>();
        initLstCoulDispo();
        initListeCouleurs(); 
        DefaultListModel mod= new DefaultListModel();
        listColor.setModel(mod);
        this.tabCoulSelect = new Color [this.max];
        this.tabNomCoulSelect = new String [this.max];
        this.nb=0;
        this.couleurCourante = centerBottomLeft.getBackground(); 
        this.couleurBase = centerBottomLeft.getBackground(); 

    }
    private void initLstCoulDispo(){
        //On crée une méthode initLstCoulDispo, qui permet d'ajouter des couleurs défini dans nos deux listes
        //En l'occurence, ici, Bleu Azur, Acajou, Jaune Citron et Rouge Brique
        //On a une liste pour y stocker les codes RGB de nos couleurs, lstCoulDispo
        //Et l'autre pour y mettre le nom de la couleur, lstNomCoulDispo
        Color c1, c2, c3, c4;
        c1 = new Color(0, 127, 155);
        this.lstCoulDispo.add(c1);
        this.lstNomCoulDispo.add("Bleu Azur");
        c2 = new Color(136, 66, 29);
        this.lstCoulDispo.add(c2);
        this.lstNomCoulDispo.add("Acajou");
        c3 = new Color(247, 255, 60);
        this.lstCoulDispo.add(c3);
        this.lstNomCoulDispo.add("Jaune Citron");
        c4 = new Color(132, 46, 27);
        this.lstCoulDispo.add(c4);
        this.lstNomCoulDispo.add("Rouge Brique");
    }
    private void initListeCouleurs(){
        //On crée une méthode initListeCouleurs qui permet d'ajouter nos nom de couleur de la liste lstNomCoulDispo dans notre JList 
        for(int i=0; i<this.lstNomCoulDispo.size(); i++){
            choiceColor.addItem(this.lstNomCoulDispo.get(i));
        }
    }
    public void colorierPanneau(){
        //Cette méthode ci, colorierPanneau, permet de colorier notre JPanel centreBottomLeft (le Panneau en bas à gauche servent de repère visuelle
        //pour l'utilisateur)
        int vert, bleu, rouge;
        vert = 0;
        bleu = 0;
        rouge = 0;
        if(this.nb !=0){
            if(this.nb == 0){
                centerBottomLeft.setBackground(this.tabCoulSelect[0]);
                this.couleurCourante = this.tabCoulSelect[0];
            }
            else{
                for(int i=0; i<this.nb; i++){
                    vert += this.tabCoulSelect[i].getGreen();
                    bleu += this.tabCoulSelect[i].getBlue();
                    rouge += this.tabCoulSelect[i].getRed();
                }
                vert = vert/this.nb;
                bleu = bleu/this.nb;
                rouge = rouge/this.nb;
                this.couleurCourante = new Color(rouge, vert, bleu);
                centerBottomLeft.setBackground(this.couleurCourante);
            }
        }
    }
    public void afficherInformations(){
        //La méthode afficherInformations permet d'afficher, si l'utilisteur le choisit, les informations relative au mélange des couleurs choisit
        //Ses informations sont inscrites dans notre JTextArea de notre JPanel centreBottomRight
        textArea.setText("");
        for(int i=0; i<this.nb; i++){
            textArea.append("\n"+this.tabCoulSelect[i]);
            textArea.append("\nCouleur actuelle : "+this.couleurCourante.getRed()+" "+this.couleurCourante.getGreen()+" "+" "+this.couleurCourante.getBlue());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //Cette méthode, initComponents sert simplement à crée le rendu visuelle et qui est automatiquement gérer par l'IDE
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        top = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        center = new javax.swing.JPanel();
        centerTop = new javax.swing.JPanel();
        centerTopLeft = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        red = new javax.swing.JRadioButton();
        green = new javax.swing.JRadioButton();
        blue = new javax.swing.JRadioButton();
        informations = new javax.swing.JCheckBox();
        centerTopCenter = new javax.swing.JPanel();
        title2 = new javax.swing.JLabel();
        choiceColor = new javax.swing.JComboBox<>();
        PanneauCouleurSelect = new javax.swing.JPanel();
        addColor = new javax.swing.JButton();
        centerTopRight = new javax.swing.JPanel();
        title3 = new javax.swing.JLabel();
        jScrollPaneListColor = new javax.swing.JScrollPane();
        listColor = new javax.swing.JList<>();
        centerBottom = new javax.swing.JPanel();
        centerBottomLeft = new javax.swing.JPanel();
        centerBottomRight = new javax.swing.JPanel();
        jScrollPaneAfterColor = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        bottom = new javax.swing.JPanel();
        reset = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setText("Mélange les couleurs !");
        top.add(title);

        getContentPane().add(top, java.awt.BorderLayout.NORTH);

        center.setLayout(new java.awt.GridLayout(2, 1));

        centerTop.setLayout(new java.awt.GridLayout(1, 3));

        centerTopLeft.setLayout(new java.awt.GridLayout(5, 0));

        title1.setText("Cochez les couleurs à ajouter");
        centerTopLeft.add(title1);

        red.setText("Rouge");
        red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redActionPerformed(evt);
            }
        });
        centerTopLeft.add(red);

        green.setText("Vert");
        green.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenActionPerformed(evt);
            }
        });
        centerTopLeft.add(green);

        blue.setText("Bleu");
        blue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueActionPerformed(evt);
            }
        });
        centerTopLeft.add(blue);

        informations.setText("Informations");
        informations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informationsActionPerformed(evt);
            }
        });
        centerTopLeft.add(informations);

        centerTop.add(centerTopLeft);

        centerTopCenter.setLayout(new java.awt.GridLayout(5, 0));

        title2.setText("Choississez une couleur à ajouter");
        centerTopCenter.add(title2);

        choiceColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceColorActionPerformed(evt);
            }
        });
        centerTopCenter.add(choiceColor);

        PanneauCouleurSelect.setBackground(java.awt.Color.white);

        javax.swing.GroupLayout PanneauCouleurSelectLayout = new javax.swing.GroupLayout(PanneauCouleurSelect);
        PanneauCouleurSelect.setLayout(PanneauCouleurSelectLayout);
        PanneauCouleurSelectLayout.setHorizontalGroup(
            PanneauCouleurSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 273, Short.MAX_VALUE)
        );
        PanneauCouleurSelectLayout.setVerticalGroup(
            PanneauCouleurSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        centerTopCenter.add(PanneauCouleurSelect);

        addColor.setText("Ajouter");
        addColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addColorActionPerformed(evt);
            }
        });
        centerTopCenter.add(addColor);

        centerTop.add(centerTopCenter);

        centerTopRight.setLayout(new java.awt.BorderLayout());

        title3.setText("Liste des couleurs mélangées");
        centerTopRight.add(title3, java.awt.BorderLayout.NORTH);

        listColor.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPaneListColor.setViewportView(listColor);

        centerTopRight.add(jScrollPaneListColor, java.awt.BorderLayout.CENTER);

        centerTop.add(centerTopRight);

        center.add(centerTop);

        centerBottom.setLayout(new java.awt.GridLayout(1, 2));

        centerBottomLeft.setBackground(java.awt.Color.white);

        javax.swing.GroupLayout centerBottomLeftLayout = new javax.swing.GroupLayout(centerBottomLeft);
        centerBottomLeft.setLayout(centerBottomLeftLayout);
        centerBottomLeftLayout.setHorizontalGroup(
            centerBottomLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        centerBottomLeftLayout.setVerticalGroup(
            centerBottomLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
        );

        centerBottom.add(centerBottomLeft);

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPaneAfterColor.setViewportView(textArea);

        javax.swing.GroupLayout centerBottomRightLayout = new javax.swing.GroupLayout(centerBottomRight);
        centerBottomRight.setLayout(centerBottomRightLayout);
        centerBottomRightLayout.setHorizontalGroup(
            centerBottomRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerBottomRightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneAfterColor, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addContainerGap())
        );
        centerBottomRightLayout.setVerticalGroup(
            centerBottomRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneAfterColor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
        );

        centerBottom.add(centerBottomRight);

        center.add(centerBottom);

        getContentPane().add(center, java.awt.BorderLayout.CENTER);

        reset.setText("Réinitialiser");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        bottom.add(reset);

        exit.setText("Fermer");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        bottom.add(exit);

        getContentPane().add(bottom, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void redActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redActionPerformed
        // La méthode redActionPerformed attend en parmamètre un évenement de la part de l'utilisateur (un click sur le bouton)
        // Et elle va ajouter du rouge si il clic sur leJRadioButton puis va utilise notre méthode colorierPanneau pour remplir la zone
        // Enfin on décide d'affiche les informations de la nouvelle couleurs si il a cliqué sur la JCheckBox informations
        if(red.isSelected()){
            this.tabCoulSelect[this.nb] = Color.red;
            this.tabNomCoulSelect[this.nb] = "Rouge";
            this.nb++;
            colorierPanneau();
            DefaultListModel mod= (DefaultListModel)listColor.getModel();
            mod.addElement("Rouge");
            if(informations.isSelected()){ 
                afficherInformations();
            }
        }
    }//GEN-LAST:event_redActionPerformed

    private void greenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenActionPerformed
        // Cette méthode est identique à celle de redActionPerformed mais ajoute du vert à la place si il coche sur le JRadioButton
        if (green.isSelected()){
            this.tabCoulSelect[this.nb]=Color.green;
            this.tabNomCoulSelect[this.nb]="Vert";
            this.nb++;
            colorierPanneau();
            DefaultListModel mod= (DefaultListModel)listColor.getModel();
            mod.addElement("Vert");
            if (informations.isSelected()){ 
                afficherInformations();
            }
        }
    }//GEN-LAST:event_greenActionPerformed

    private void blueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueActionPerformed
        // Idem, sauf que encore cette fois on le fait pour la couleur bleu avec sa JRadioButton associé
        if (blue.isSelected()){
            this.tabCoulSelect[this.nb]=Color.blue;
            this.tabNomCoulSelect[this.nb]="Bleu";
            this.nb++;
            colorierPanneau();
            DefaultListModel mod= (DefaultListModel)listColor.getModel();
            mod.addElement("Bleu");
            if (informations.isSelected()){ 
                afficherInformations();
            }
        }
    }//GEN-LAST:event_blueActionPerformed

    private void informationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informationsActionPerformed
        // Cette méthode permet d'ajouter les informations relative à la couleur actuelle mélanger si il click sur la JCheckBox
        // Il l'affiche dans le JTextArea vue plus haut dans le code
        if(informations.isSelected()){ 
                afficherInformations();
        }
        else{
            textArea.setText("");
        }
    }//GEN-LAST:event_informationsActionPerformed

    private void choiceColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceColorActionPerformed
        // La méthode si, choiceColorActionPerformed, permet de récuperer l'index de placement de notre JComboBox
        // Puis de colorier le JPanel en dessous, qui s'appelle PanneauCouleurSelect, de la couleur choisie de notre JComboBox
        int ind = choiceColor.getSelectedIndex();
        if(ind!=-1){
            PanneauCouleurSelect.setBackground(this.lstCoulDispo.get(ind));
        }
    }//GEN-LAST:event_choiceColorActionPerformed

    private void addColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addColorActionPerformed
        // Cette méthode permet d'ajouter la couleur choisie de notre JComboBox avec la méthode juste au-dessus choiceColorActionPerformed
        int ind = choiceColor.getSelectedIndex();
        if(ind != -1){
            this.tabCoulSelect[this.nb]=this.lstCoulDispo.get(ind);
            this.tabNomCoulSelect[this.nb]=this.lstNomCoulDispo.get(ind);
            this.nb++;
            DefaultListModel mod= (DefaultListModel)listColor.getModel();
            mod.addElement(this.lstNomCoulDispo.get(ind));
            colorierPanneau();
            if (informations.isSelected()){ 
                afficherInformations();
            }
        }
    }//GEN-LAST:event_addColorActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // Cette méthode permet de réinitiliser toutes nos infos relative à l'apllication LesCouleurs
        // Quand il clic sur le JBouton reset en bas de la fenêtre 
        red.setSelected(false);
        green.setSelected(false);
        blue.setSelected(false);
        informations.setSelected(false);
        textArea.setText("");
        centerBottomLeft.setBackground(this.couleurBase);
        DefaultListModel mod= (DefaultListModel)listColor.getModel();
        mod.clear();
        choiceColor.setSelectedIndex(0);
        PanneauCouleurSelect.setBackground(Color.WHITE);
    }//GEN-LAST:event_resetActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // Cette méthode permet simplement de fermer la fenêtre quand l'utilisateur clic sur le JButton exit
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Ici est déclaré toutes nos variables relative à la création de notre fénêtre qui sont utiliser dans notre initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanneauCouleurSelect;
    private javax.swing.JButton addColor;
    private javax.swing.JRadioButton blue;
    private javax.swing.JPanel bottom;
    private javax.swing.JPanel center;
    private javax.swing.JPanel centerBottom;
    private javax.swing.JPanel centerBottomLeft;
    private javax.swing.JPanel centerBottomRight;
    private javax.swing.JPanel centerTop;
    private javax.swing.JPanel centerTopCenter;
    private javax.swing.JPanel centerTopLeft;
    private javax.swing.JPanel centerTopRight;
    private javax.swing.JComboBox<String> choiceColor;
    private javax.swing.JButton exit;
    private javax.swing.JRadioButton green;
    private javax.swing.JCheckBox informations;
    private javax.swing.JScrollPane jScrollPaneAfterColor;
    private javax.swing.JScrollPane jScrollPaneListColor;
    private javax.swing.JList<String> listColor;
    private javax.swing.JRadioButton red;
    private javax.swing.JButton reset;
    private javax.swing.JTextArea textArea;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    private javax.swing.JPanel top;
    // End of variables declaration//GEN-END:variables
    // Puis la fin de nos variables et du programme
}

