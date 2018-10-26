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

/**
 *
 * @author Kenny Alex P.H. 1224
 */
public class ViewInicio extends JFrame implements ActionListener{
    
    
    JButton botaoIniSair;
    JButton botaoIniConfirmar;
    JButton botaoIniNovoUsuario;
    
    JTextField campoIniLogin;
    JTextField campoIniSenha;
    
    public ViewInicio(){
    
    JLabel labelIniLogin;
    JLabel labelIniSenha;
    
    
  this.setBounds(300,300,600,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);
    
        
    labelIniLogin = new JLabel("Login");
    labelIniLogin.setBounds(30, 25, 70, 25);
    this.getContentPane().add(labelIniLogin);
            
    campoIniLogin = new JTextField();    
    campoIniLogin.setBounds(100, 25, 300, 25);        
    this.getContentPane().add(campoIniLogin);
    
            
    labelIniSenha = new JLabel("Senha");
    labelIniSenha.setBounds(30, 80, 70, 25);
    this.getContentPane().add(labelIniSenha);
    
    campoIniSenha = new JTextField();
    campoIniSenha.setBounds(100, 80, 300, 25);
    this.getContentPane().add(campoIniSenha);
    
    
    
    
    botaoIniNovoUsuario = new JButton("Novo Usuario");
    botaoIniNovoUsuario.setBounds(30, 200, 120, 25);
    this.getContentPane().add(botaoIniNovoUsuario);
        botaoIniNovoUsuario.setActionCommand("IniNovoUsuario");
        botaoIniNovoUsuario.addActionListener(this);
    
    
        
    botaoIniSair = new JButton("Sair");
    botaoIniSair.setBounds(320, 200, 100, 25);
    this.getContentPane().add(botaoIniSair);
        botaoIniSair.setActionCommand("IniSair");
        botaoIniSair.addActionListener(this);
        
        
        
    botaoIniConfirmar = new JButton("Confirmar");
    botaoIniConfirmar.setBounds(445, 200, 100, 25);
    this.getContentPane().add(botaoIniConfirmar);
        botaoIniConfirmar.setActionCommand("IniConfirmar");
        botaoIniConfirmar.addActionListener(this);
    
    }
    
    
     
    public void actionPerformed(ActionEvent e){
        
        
      switch (e.getActionCommand()){
             case "IniConfirmar":
                 
                 
                 
                 break;
          
                 
             case "IniSair":
                 
                 dispose();
                 
                 break;
                 
             case "IniNovoUsuario":
                 
                 controller.ControllerViewUsuario.CadastrarUsuario();
                 
                 
                 break;
                 
                 
                 
                 
         }
        
           
            
        } 
    
    
    
    
    
    
    
}
