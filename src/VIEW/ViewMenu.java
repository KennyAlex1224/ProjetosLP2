/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;



import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JTabbedPane;
/**
 *
 * @author Kenny Alex P.H. 1224
 */
public class ViewMenu extends JFrame implements ActionListener{
    
    JButton botaoIniSair;
    JButton botaoIniConfirmar;
    JButton botaoIniNovoUsuario;
    JButton botaoIniAlterarUsuario;
    JTabbedPane tabbedPane1;
    JTextField campoIniLogin;
    JTextField campoIniSenha;
    
    public ViewMenu(){
    
    JLabel labelMenuUsuNome;
    JLabel labelMenuUsuEndereco;
    
    
  this.setBounds(300,300,600,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);
    
    
     tabbedPane1 = new JTabbedPane();
     
     tabbedPane1.setBounds(300,300,600,300);
     
     tabbedPane1.setVisible(true);
        labelMenuUsuNome = new JLabel();
        labelMenuUsuNome.setText("Nome");
        labelMenuUsuNome.setVisible(true);
        tabbedPane1.addTab("Usuario",labelMenuUsuNome);
        
    }
    
    
     
    public void actionPerformed(ActionEvent e){
        
      
        
           
            
        } 
    
    
    
    
    
}
