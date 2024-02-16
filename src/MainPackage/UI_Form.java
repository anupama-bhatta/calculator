/* 
    Author: Anupama Bhatta
    Date: 01/16/2018
    Description: Program that presents Heart Rate Calculator and BMI Calculator to the user to interact with.
*/

package MainPackage;

import AuxPackage.AuxValidator;

public class UI_Form extends javax.swing.JFrame {


    public UI_Form() {
        initComponents();
        txtAge.setText(null);
        lblAgeError.setVisible(false);
        lblOutputHR.setText(null);
        lblOutputHR.setVisible(false);
        lblIntensity.setText(slidIntensity.getValue() + "%");
        
        txtWeight.setText(null);
        lblWeightError.setVisible(false);
        lblOutputBMI.setText(null);
        lblOutputBMI.setVisible(false);
        lblSuggestionBMI.setText(null);
        lblSuggestionBMI.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpnlMainTabPanel = new javax.swing.JTabbedPane();
        pnlHR = new javax.swing.JPanel();
        lblAgeLabel = new javax.swing.JLabel();
        lblIntensityLabel = new javax.swing.JLabel();
        slidIntensity = new javax.swing.JSlider();
        lblIntensity = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblAgeError = new javax.swing.JLabel();
        lblOutputHR = new javax.swing.JLabel();
        pnlBMI = new javax.swing.JPanel();
        lblHeightLabel = new javax.swing.JLabel();
        lblWeightLabel = new javax.swing.JLabel();
        comboHeightFeet = new javax.swing.JComboBox<>();
        comboHeightInch = new javax.swing.JComboBox<>();
        txtWeight = new javax.swing.JTextField();
        lblWeightError = new javax.swing.JLabel();
        lblOutputBMI = new javax.swing.JLabel();
        lblSuggestionBMI = new javax.swing.JLabel();
        menuMain = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAgeLabel.setText("Enter your age:");

        lblIntensityLabel.setText("Intensity:");

        slidIntensity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slidIntensityStateChanged(evt);
            }
        });

        lblIntensity.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblIntensity.setForeground(new java.awt.Color(204, 0, 0));
        lblIntensity.setText("Intensity percentage");

        txtAge.setText("jTextField1");
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });

        lblAgeError.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblAgeError.setForeground(new java.awt.Color(204, 0, 0));
        lblAgeError.setText("Age validation goes there");

        lblOutputHR.setText("jLabel1");

        javax.swing.GroupLayout pnlHRLayout = new javax.swing.GroupLayout(pnlHR);
        pnlHR.setLayout(pnlHRLayout);
        pnlHRLayout.setHorizontalGroup(
            pnlHRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHRLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnlHRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHRLayout.createSequentialGroup()
                        .addComponent(lblIntensityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slidIntensity, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIntensity, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlHRLayout.createSequentialGroup()
                        .addComponent(lblAgeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAgeError, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblOutputHR, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(283, Short.MAX_VALUE))
        );
        pnlHRLayout.setVerticalGroup(
            pnlHRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHRLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pnlHRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(lblAgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge)
                    .addComponent(lblAgeError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlHRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIntensityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlHRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblIntensity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(slidIntensity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26)
                .addComponent(lblOutputHR, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        tpnlMainTabPanel.addTab("Heart Rate Calculator", pnlHR);

        lblHeightLabel.setText("Height (feet/inches):");

        lblWeightLabel.setText("Enter weight:");

        comboHeightFeet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        comboHeightFeet.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboHeightFeetPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        comboHeightFeet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                comboHeightFeetMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboHeightFeetMouseClicked(evt);
            }
        });
        comboHeightFeet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboHeightFeetActionPerformed(evt);
            }
        });
        comboHeightFeet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                comboHeightFeetKeyReleased(evt);
            }
        });

        comboHeightInch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        comboHeightInch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboHeightInchMouseClicked(evt);
            }
        });
        comboHeightInch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboHeightInchActionPerformed(evt);
            }
        });
        comboHeightInch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                comboHeightInchKeyReleased(evt);
            }
        });

        txtWeight.setText("jTextField1");
        txtWeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtWeightKeyReleased(evt);
            }
        });

        lblWeightError.setForeground(new java.awt.Color(204, 0, 0));
        lblWeightError.setText("Weight validation goes there");

        lblOutputBMI.setText("jLabel1");

        lblSuggestionBMI.setText("jLabel1");

        javax.swing.GroupLayout pnlBMILayout = new javax.swing.GroupLayout(pnlBMI);
        pnlBMI.setLayout(pnlBMILayout);
        pnlBMILayout.setHorizontalGroup(
            pnlBMILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBMILayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pnlBMILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBMILayout.createSequentialGroup()
                        .addComponent(lblWeightLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblWeightError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlBMILayout.createSequentialGroup()
                        .addGroup(pnlBMILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSuggestionBMI, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOutputBMI, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlBMILayout.createSequentialGroup()
                                .addComponent(lblHeightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboHeightFeet, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboHeightInch, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlBMILayout.setVerticalGroup(
            pnlBMILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBMILayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pnlBMILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboHeightFeet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboHeightInch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnlBMILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWeightError, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOutputBMI, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSuggestionBMI, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
        );

        tpnlMainTabPanel.addTab("BMI Calculator", pnlBMI);

        jMenu1.setText("File");

        itemExit.setText("Exit");
        itemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemExitActionPerformed(evt);
            }
        });
        jMenu1.add(itemExit);

        menuMain.add(jMenu1);

        setJMenuBar(menuMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tpnlMainTabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(tpnlMainTabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemExitActionPerformed

    private void slidIntensityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slidIntensityStateChanged
        int i = slidIntensity.getValue();
        String desc = "Selected intensity: " + i + "%";
        lblIntensity.setText(desc);
            calculateHR();
    }//GEN-LAST:event_slidIntensityStateChanged

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
            
            calculateHR();
        
    }//GEN-LAST:event_txtAgeKeyReleased

    private void txtWeightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWeightKeyReleased

            calculateBMI();
            
    }//GEN-LAST:event_txtWeightKeyReleased

    private void comboHeightFeetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboHeightFeetActionPerformed

            calculateBMI();
        
    }//GEN-LAST:event_comboHeightFeetActionPerformed

    private void comboHeightFeetPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboHeightFeetPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_comboHeightFeetPopupMenuWillBecomeInvisible

    private void comboHeightFeetMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboHeightFeetMouseReleased

    }//GEN-LAST:event_comboHeightFeetMouseReleased

    private void comboHeightInchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboHeightInchActionPerformed
            
            calculateBMI();
        
    }//GEN-LAST:event_comboHeightInchActionPerformed

    private void comboHeightFeetKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboHeightFeetKeyReleased

    }//GEN-LAST:event_comboHeightFeetKeyReleased

    private void comboHeightInchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboHeightInchKeyReleased
        
    }//GEN-LAST:event_comboHeightInchKeyReleased

    private void comboHeightFeetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboHeightFeetMouseClicked

    }//GEN-LAST:event_comboHeightFeetMouseClicked

    private void comboHeightInchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboHeightInchMouseClicked

    }//GEN-LAST:event_comboHeightInchMouseClicked

    private boolean validateWeight()
    {
        // Validate user input
        String sInput = txtWeight.getText();
        String sErr = "Please provide a valid integer between 20 and 500.";
        
        if (AuxValidator.isInt(sInput))
        {
            // validate the range
            int iWeight = Integer.parseInt(sInput);
            if (iWeight < 20)
            {
                String e = "Weight is too small. " + sErr;
                lblWeightError.setText(e);
                lblWeightError.setVisible(true);
                txtWeight.setBackground(new java.awt.Color(255, 102, 102));
                return false;
            }
            else if (iWeight > 500)   
            {
                String e = "Weight is too large. " + sErr;
                lblWeightError.setText(e);
                lblWeightError.setVisible(true);
                txtWeight.setBackground(new java.awt.Color(255, 102, 102));
                return false;
            }
            else
            {
                 lblWeightError.setText(null);
                 lblWeightError.setVisible(false);
                 txtWeight.setBackground(new java.awt.Color(255, 255, 255));
                 return true;
            }
        }
        else
        {
            // diplay error message
            lblWeightError.setText(sErr);
            lblWeightError.setVisible(true);
            txtWeight.setBackground(new java.awt.Color(255, 102, 102));
            return false;
        }
    }
    
    
    private boolean validateAge()
    {
        // Validate user input
        String sInput = txtAge.getText();
        String sErr = "Please provide a valid integer from 3 through 200.";
        if (AuxValidator.isInt(sInput))
        {
            // validate the range
            int iAge = Integer.parseInt(sInput);
            if (iAge < 3)
            {
                String e = "Age is too small. " + sErr;
                lblAgeError.setText(e);
                lblAgeError.setVisible(true);
                txtAge.setBackground(new java.awt.Color(255, 102, 102));
                return false;
            }
            else if (iAge > 200)
            {
                String e = "Age is too large. " + sErr;
                lblAgeError.setText(e);
                lblAgeError.setVisible(true);
                txtAge.setBackground(new java.awt.Color(255, 102, 102));
                return false;
            }
            else 
            {
                lblAgeError.setText(null);
                lblAgeError.setVisible(false);
                txtAge.setBackground(new java.awt.Color(255, 255, 255));
                return true;
            }
                
        }
        else 
        {
            // display error message
            lblAgeError.setText(sErr);
            lblAgeError.setVisible(true);
            txtAge.setBackground(new java.awt.Color(255, 255, 255));
            return false;
        }
    }
    
    private void calculateHR()
    {
        if (validateAge())
        {
        int iAge = Integer.parseInt(txtAge.getText());
        int iIntensity = slidIntensity.getValue();
        CalculatorHR calc = new CalculatorHR(iAge, iIntensity);
        
        lblOutputHR.setForeground(calc.getColorIntensity());
        lblOutputHR.setText(calc.toString());
        lblOutputHR.setVisible(true);
        
        }
        else 
        {
            lblOutputHR.setText("");
        }
    }
    
    private void calculateBMI()
    {
        if (validateWeight())
        {
        int iWeight = Integer.parseInt(txtWeight.getText());
        String sFeet = comboHeightFeet.getSelectedItem().toString();
        int iFeet = Integer.parseInt(sFeet);
        String sInch = comboHeightInch.getSelectedItem().toString();
        int iInch = Integer.parseInt(sInch);
        
        CalculatorBMI calc = new CalculatorBMI(iWeight, iFeet, iInch);
        
        lblOutputBMI.setText(calc.toString());
        lblOutputBMI.setVisible(true);
        lblSuggestionBMI.setForeground(calc.getColorConclusion());
        lblSuggestionBMI.setText(calc.getConclusion());
        lblSuggestionBMI.setVisible(true);
        }
        else
        {
            lblOutputBMI.setText("");
            lblSuggestionBMI.setText("");
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboHeightFeet;
    private javax.swing.JComboBox<String> comboHeightInch;
    private javax.swing.JMenuItem itemExit;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JLabel lblAgeError;
    private javax.swing.JLabel lblAgeLabel;
    private javax.swing.JLabel lblHeightLabel;
    private javax.swing.JLabel lblIntensity;
    private javax.swing.JLabel lblIntensityLabel;
    private javax.swing.JLabel lblOutputBMI;
    private javax.swing.JLabel lblOutputHR;
    private javax.swing.JLabel lblSuggestionBMI;
    private javax.swing.JLabel lblWeightError;
    private javax.swing.JLabel lblWeightLabel;
    private javax.swing.JMenuBar menuMain;
    private javax.swing.JPanel pnlBMI;
    private javax.swing.JPanel pnlHR;
    private javax.swing.JSlider slidIntensity;
    private javax.swing.JTabbedPane tpnlMainTabPanel;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
