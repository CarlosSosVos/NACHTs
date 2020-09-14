/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nachts;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author k_k_r
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        New_file_JF = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_Ncode = new javax.swing.JTextArea();
        Ok_BT = new javax.swing.JButton();
        Cancel_BT = new javax.swing.JButton();
        name_tf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_code = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_result = new javax.swing.JTextArea();
        btn_run = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Save_BT = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_openFile = new javax.swing.JMenuItem();
        menu_genFlex = new javax.swing.JMenuItem();
        menu_new = new javax.swing.JMenuItem();
        menu_genCup = new javax.swing.JMenuItem();
        menu_lenguaje = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        New_file_JF.setBackground(new java.awt.Color(0, 0, 0));
        New_file_JF.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                New_file_JFWindowClosed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        txt_Ncode.setColumns(20);
        txt_Ncode.setRows(5);
        jScrollPane3.setViewportView(txt_Ncode);

        Ok_BT.setText("Ok");
        Ok_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ok_BTActionPerformed(evt);
            }
        });

        Cancel_BT.setText("Cancel");
        Cancel_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_BTActionPerformed(evt);
            }
        });

        name_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_tfActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cancel_BT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ok_BT)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(27, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ok_BT)
                    .addComponent(Cancel_BT)
                    .addComponent(name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout New_file_JFLayout = new javax.swing.GroupLayout(New_file_JF.getContentPane());
        New_file_JF.getContentPane().setLayout(New_file_JFLayout);
        New_file_JFLayout.setHorizontalGroup(
            New_file_JFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        New_file_JFLayout.setVerticalGroup(
            New_file_JFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        txt_code.setColumns(20);
        txt_code.setRows(5);
        jScrollPane1.setViewportView(txt_code);

        txt_result.setEditable(false);
        txt_result.setColumns(20);
        txt_result.setRows(5);
        jScrollPane2.setViewportView(txt_result);

        btn_run.setText("RUN");
        btn_run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_runActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Texto de Entrada");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Salida");

        Save_BT.setText("Guardar");
        Save_BT.setEnabled(false);
        Save_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_BTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Save_BT))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_run)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(30, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_run)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Save_BT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        menu_openFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menu_openFile.setText("Abrir archivo");
        menu_openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_openFileActionPerformed(evt);
            }
        });
        jMenu1.add(menu_openFile);

        menu_genFlex.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        menu_genFlex.setText("GenerarFlex");
        menu_genFlex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_genFlexActionPerformed(evt);
            }
        });
        jMenu1.add(menu_genFlex);

        menu_new.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menu_new.setText("Nuevo Archivo");
        menu_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_newActionPerformed(evt);
            }
        });
        jMenu1.add(menu_new);

        menu_genCup.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menu_genCup.setText("Generar Cup");
        menu_genCup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_genCupActionPerformed(evt);
            }
        });
        jMenu1.add(menu_genCup);

        menu_lenguaje.setText("Manual NACHTs");
        menu_lenguaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_lenguajeActionPerformed(evt);
            }
        });
        jMenu1.add(menu_lenguaje);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String getText(File file) throws FileNotFoundException, IOException {
        String out = "";

        if (file != null) {
            clear();
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null) {
                out += st + "\n";
            }
            br.close();
            this.Save_BT.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "No se cargo ningun archivo");
        }
        return out;
    }

    void clear() {
        this.txt_code.setText("");
        this.txt_result.setText("");
    }

    public void generateLexer() {
      
        String parametros[] = {"-d","src/nachts/","src/tools/nachts.jflex"};
        try {
            jflex.Main.generate(parametros);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void generateCup() {
        
        String parametros[] = { "-destdir", "src/nachts/", "-parser", "parser","-symbols","Sym",
                "src/tools/parser.cup"};

        try {
            java_cup.Main.main(parametros);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    private void menu_openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_openFileActionPerformed
        JFileChooser jfc = new JFileChooser("./test_files/");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("NACHTs", "ncht");
        jfc.setFileFilter(filter);
        
        int op = jfc.showOpenDialog(this);
        if (op == 0) {
            this.input_file = jfc.getSelectedFile();
        }

        try {
            this.txt_code.setText(this.getText(input_file));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_menu_openFileActionPerformed

    private void menu_genFlexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_genFlexActionPerformed
        this.generateLexer();
    }//GEN-LAST:event_menu_genFlexActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void btn_runActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_runActionPerformed
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(this.input_file));
            Lexer lex = new Lexer(br);
            //lex.yylex();
            this.txt_result.setText(lex.getAccum());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_runActionPerformed

    private void menu_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_newActionPerformed
        //this.setVisible(false);
        this.New_file_JF.pack();
        this.New_file_JF.setVisible(true);
    }//GEN-LAST:event_menu_newActionPerformed

    private void Ok_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ok_BTActionPerformed
        if (!name_tf.getText().equals("")) {
            Path path = Paths.get("./test_files/"+this.name_tf.getText()+".cal");
            try {
                Files.createDirectories(path.getParent());
                Files.createFile(path);
                PrintWriter writer = new PrintWriter(new FileWriter(path.toString(),true));
                writer.append(this.txt_Ncode.getText());
                writer.close();
                System.out.println("se creo");
                this.New_file_JF.setVisible(false);
                this.input_file=new File("./test_files/"+this.name_tf.getText()+".cal");
                this.txt_Ncode.setText("");
                this.name_tf.setText("");
                this.txt_code.setText(this.getText(input_file));
                this.Save_BT.setEnabled(true);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
            System.out.println("Elija un nombre valido para el archivo");
        }
    }//GEN-LAST:event_Ok_BTActionPerformed

    private void New_file_JFWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_New_file_JFWindowClosed

    }//GEN-LAST:event_New_file_JFWindowClosed

    private void Save_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_BTActionPerformed
        try {
            String temp=this.txt_code.getText();
            //System.out.println("-----"+this.txt_code.getText().equals(this.getText(input_file)));
            FileOutputStream archivo=new FileOutputStream(this.input_file);
            byte[] bytesTxt=this.txt_code.getText().getBytes();
            archivo.write(bytesTxt);
            this.txt_code.setText(temp);
            System.out.println("se Modifico");
        }catch (Exception ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_Save_BTActionPerformed

    private void Cancel_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_BTActionPerformed
        this.New_file_JF.setVisible(false);
        this.txt_Ncode.setText("");
        this.name_tf.setText("");
    }//GEN-LAST:event_Cancel_BTActionPerformed

    private void name_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_tfActionPerformed

    private void menu_genCupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_genCupActionPerformed
        this.generateCup();
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_genCupActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            parser p = new parser();
            
            
        } catch (Exception ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
             
    }//GEN-LAST:event_jButton2ActionPerformed

    private void menu_lenguajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_lenguajeActionPerformed
        try {
            File htmlFile = new File("principal.html");
            Desktop.getDesktop().browse(htmlFile.toURI());
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menu_lenguajeActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel_BT;
    private javax.swing.JFrame New_file_JF;
    private javax.swing.JButton Ok_BT;
    private javax.swing.JButton Save_BT;
    private javax.swing.JButton btn_run;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenuItem menu_genCup;
    private javax.swing.JMenuItem menu_genFlex;
    private javax.swing.JMenuItem menu_lenguaje;
    private javax.swing.JMenuItem menu_new;
    private javax.swing.JMenuItem menu_openFile;
    private javax.swing.JTextField name_tf;
    private javax.swing.JTextArea txt_Ncode;
    private javax.swing.JTextArea txt_code;
    private javax.swing.JTextArea txt_result;
    // End of variables declaration//GEN-END:variables
    private File input_file;
    
}