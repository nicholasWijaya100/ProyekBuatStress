
import java.util.ArrayList;
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author nichw
 */
public class MainMenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainMenuFrame
     */
    
    public MainMenuFrame() {
        initComponents();
        this.setSize(1021, 785);
        playBtn.setLocation(530, 110);
        playBtn.setOpaque(false);
        playBtn.setContentAreaFilled(false);
        playBtn.setBorderPainted(false);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainMenu1 = new MainMenu();
        playBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Zombie Vs Plants");

        playBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainMenu1Layout = new javax.swing.GroupLayout(mainMenu1);
        mainMenu1.setLayout(mainMenu1Layout);
        mainMenu1Layout.setHorizontalGroup(
            mainMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenu1Layout.createSequentialGroup()
                .addContainerGap(610, Short.MAX_VALUE)
                .addComponent(playBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        mainMenu1Layout.setVerticalGroup(
            mainMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenu1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(playBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(571, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, 1091, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playBtnActionPerformed
        GameWindowFrame GameWindow = new GameWindowFrame();
        GameWindow.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_playBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private MainMenu mainMenu1;
    private javax.swing.JButton playBtn;
    // End of variables declaration//GEN-END:variables
}
