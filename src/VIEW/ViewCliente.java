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
public class ViewCliente extends JFrame implements ActionListener{
    
    JButton botaoCliSalvar;
    JButton botaoCliCancelar;
    JTextField campoCliNome;
    JTextField campoCliEndereco;
    JTextField campoCliCodigo;
    JTextField campoCliTelefone;
    JTextField campoCliCidade;
    JTextField campoCliCep;
    JComboBox ComboCliUf;
    
    public ViewCliente(){
    
    JLabel labelCliNome;
    JLabel labelCliEndereco;
    JLabel labelCliCodigo;
    JLabel labelCliTelefone;
    JLabel labelCliCidade;
    JLabel labelCliCep;
    JLabel labelCliUf;
    
    this.setBounds(300,300,600,450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);
    
    labelCliCodigo = new JLabel("Codigo");
    labelCliCodigo.setBounds(30, 26, 70, 25);
    this.getContentPane().add(labelCliCodigo);
            
    campoCliCodigo = new JTextField();    
    campoCliCodigo.setBounds(100, 25, 300, 25);        
    this.getContentPane().add(campoCliCodigo);
    
            
    labelCliNome = new JLabel("Nome");
    labelCliNome.setBounds(30, 80, 70, 25);
    this.getContentPane().add(labelCliNome);
    
    campoCliNome = new JTextField();
    campoCliNome.setBounds(100, 80, 300, 25);
    this.getContentPane().add(campoCliNome);
    
    
    labelCliEndereco = new JLabel("Endereço");
    labelCliEndereco.setBounds(30, 135, 70, 25);
    this.getContentPane().add(labelCliEndereco);
    
    campoCliEndereco = new JTextField();
    campoCliEndereco.setBounds(100, 135, 300, 25);
    this.getContentPane().add(campoCliEndereco);
    
    
    
    labelCliTelefone = new JLabel("Telefone");
    labelCliTelefone.setBounds(30, 190, 70, 25);
    this.getContentPane().add(labelCliTelefone);
    
    campoCliTelefone = new JTextField();
    campoCliTelefone.setBounds(100, 190, 300, 25);
    this.getContentPane().add(campoCliTelefone);
    
    
    labelCliCidade = new JLabel("Cidade");
    labelCliCidade.setBounds(30, 245, 70, 25);
    this.getContentPane().add(labelCliCidade);
    
    campoCliCidade = new JTextField();
    campoCliCidade.setBounds(100, 245, 250, 25);
    this.getContentPane().add(campoCliCidade);
    
    
   labelCliUf = new JLabel("UF");
    labelCliUf.setBounds(400, 245, 250, 25);
    this.getContentPane().add(labelCliUf);
    
    ComboCliUf = new JComboBox();
    ComboCliUf.setBounds(425, 245, 50, 25);
    this.getContentPane().add(ComboCliUf);
    
    
    
    labelCliCep = new JLabel("CEP");
    labelCliCep.setBounds(30, 300, 70, 25);
    this.getContentPane().add(labelCliCep);
    
    campoCliCep = new JTextField();
    campoCliCep.setBounds(100, 300, 300, 25);
    this.getContentPane().add(campoCliCep);
    
    
    botaoCliCancelar = new JButton("Cancelar");
    botaoCliCancelar.setBounds(50, 375, 100, 25);
    this.getContentPane().add(botaoCliCancelar);
        botaoCliCancelar.setActionCommand("CliCancelar");
        botaoCliCancelar.addActionListener(this);
    
    
  
        
        
    botaoCliSalvar = new JButton("Salvar");
    botaoCliSalvar.setBounds(425, 375, 100, 25);
    this.getContentPane().add(botaoCliSalvar);
        botaoCliSalvar.setActionCommand("CliSalvar");
        botaoCliSalvar.addActionListener(this);
    
    
        
        
        
}
    
    public void actionPerformed(ActionEvent e){
        
      
         switch (e.getActionCommand()){
             case "CliSalvar":
                 
                 controller.ControllerViewCliente.CadastrarCliente();
                 
                 break;
          
                 
             case "CliCancelar":
                 
                dispose(); 
                 
                 break;
        
           
            
        } 
    
    
    
    
    
    
    
    
}
}
    
    

