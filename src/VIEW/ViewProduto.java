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
public class ViewProduto extends JFrame implements  ActionListener{
    
    
    
    JButton botaoProSalvar;
    JButton botaoProCancelar;
    JTextField campoProNome;
    JTextField campoProEstoque;
    JTextField campoProCodigo;
    JTextField campoProValor;
    
    public ViewProduto (){
    
    JLabel labelProNome;
    JLabel labelProCodigo;
    JLabel labelProValor;
    JLabel labelProEstoque;
    
    this.setBounds(300,300,600,350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);
    
    labelProCodigo = new JLabel("Codigo");
    labelProCodigo.setBounds(30, 25, 70, 25);
    this.getContentPane().add(labelProCodigo);
            
    campoProCodigo = new JTextField();    
    campoProCodigo.setBounds(100, 25, 300, 25);        
    this.getContentPane().add(campoProCodigo);
    
            
    labelProNome = new JLabel("Nome");
    labelProNome.setBounds(30, 80, 70, 25);
    this.getContentPane().add(labelProNome);
    
    campoProNome = new JTextField();
    campoProNome.setBounds(100, 80, 300, 25);
    this.getContentPane().add(campoProNome);
    
    
    labelProValor = new JLabel("Valor");
    labelProValor.setBounds(30, 135, 70, 25);
    this.getContentPane().add(labelProValor);
    
    campoProValor = new JTextField();
    campoProValor.setBounds(100, 135, 300, 25);
    this.getContentPane().add(campoProValor);
    
    
    
    labelProEstoque = new JLabel("Estoque");
    labelProEstoque.setBounds(30, 190, 70, 25);
    this.getContentPane().add(labelProEstoque);
    
    campoProEstoque = new JTextField();
    campoProEstoque.setBounds(100, 190, 300, 25);
    this.getContentPane().add(campoProEstoque);
    
    
   
    
    
    botaoProCancelar = new JButton("Cancelar");
    botaoProCancelar.setBounds(50, 250, 100, 25);
    this.getContentPane().add(botaoProCancelar);
        botaoProCancelar.setActionCommand("ProCancelar");
        botaoProCancelar.addActionListener(this);
    
    
   
   
        
        
        
    botaoProSalvar = new JButton("Salvar");
    botaoProSalvar.setBounds(425, 250, 100, 25);
    this.getContentPane().add(botaoProSalvar);
        botaoProSalvar.setActionCommand("ProSalvar");
        botaoProSalvar.addActionListener(this);
    
    
        
        
        
}
    
    public void actionPerformed(ActionEvent e){
        
      
         switch (e.getActionCommand()){
             case "ProSalvar":
                 
                 controller.ControllerViewProduto.CadastrarProduto();
                 
                 break;
          
                 
             case "ProCancelar":
                 
                 dispose();
                 
                 break;
                 
             
                 
                 
                 
                 
         }
           
            
        } 
    
    
    
    
    
    
    
    
    
    
    
    
    
}
