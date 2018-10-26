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
public class ViewUsuario extends JFrame implements ActionListener{
    
    
    JButton botaoUsuSalvar;
    JButton botaoUsuCancelar;
    JTextField campoUsuNome;
    JTextField campoUsuLogin;
    JTextField campoUsuCodigo;
    JTextField campoUsuSenha;
    
    public ViewUsuario(){
    
    JLabel labelUsuNome;
    JLabel labelUsuCodigo;
    JLabel labelUsuLogin;
    JLabel labelUsuSenha;
    
  this.setBounds(300,300,600,350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);
    
    labelUsuCodigo = new JLabel("Codigo");
    labelUsuCodigo.setBounds(30, 25, 70, 25);
    this.getContentPane().add(labelUsuCodigo);
            
    campoUsuCodigo = new JTextField();    
    campoUsuCodigo.setBounds(100, 25, 300, 25);        
    this.getContentPane().add(campoUsuCodigo);
    
            
    labelUsuNome = new JLabel("Nome");
    labelUsuNome.setBounds(30, 80, 70, 25);
    this.getContentPane().add(labelUsuNome);
    
    campoUsuNome = new JTextField();
    campoUsuNome.setBounds(100, 80, 300, 25);
    this.getContentPane().add(campoUsuNome);
    
    
    labelUsuLogin = new JLabel("Login");
    labelUsuLogin.setBounds(30, 135, 70, 25);
    this.getContentPane().add(labelUsuLogin);
    
    campoUsuLogin = new JTextField();
    campoUsuLogin.setBounds(100, 135, 300, 25);
    this.getContentPane().add(campoUsuLogin);
    
    
    
    labelUsuSenha = new JLabel("Senha");
    labelUsuSenha.setBounds(30, 190, 70, 25);
    this.getContentPane().add(labelUsuSenha);
    
    
    campoUsuSenha = new JTextField();
    campoUsuSenha.setBounds(100, 190, 300, 25);
    this.getContentPane().add(campoUsuSenha);
    
    
    
    
    botaoUsuCancelar = new JButton("Cancelar");
    botaoUsuCancelar.setBounds(50, 250, 100, 25);
    this.getContentPane().add(botaoUsuCancelar);
        botaoUsuCancelar.setActionCommand("UsuCancelar");
        botaoUsuCancelar.addActionListener(this);
        
        
    botaoUsuSalvar = new JButton("Salvar");
    botaoUsuSalvar.setBounds(425, 250, 100, 25);
    this.getContentPane().add(botaoUsuSalvar);
        botaoUsuSalvar.setActionCommand("UsuSalvar");
        botaoUsuSalvar.addActionListener(this);
    
    }
    
    
     
    public void actionPerformed(ActionEvent e){
        
      
        switch (e.getActionCommand()){
             case "UsuSalvar":
                 
                 controller.ControllerViewUsuario.CadastrarUsuario();
                 
                 break;
          
                 
             case "UsuCancelar":
                 
                 dispose();
                 
                 break;
                 
             
                 
                 
                 
                 
         }
           
            
        } 
    
    
    
    
    
    
}
