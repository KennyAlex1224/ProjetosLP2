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
public class ViewVenda extends JFrame implements ActionListener {
    
    
    
    
     
    JButton botaoVenSalvar;
    JButton botaoVenCancelar;
    JTextField campoVenCodigo;
    JTextField campoVenIdCliente;
    JTextField campoVenIdProduto;
    JTextField campoVenDataVenda;
    JTextField campoVenValor;
    JTextField campoVenValorTotal;
    JTextField campoVenDesconto;
    
    
    public ViewVenda(){
    
    JLabel labelVenIdCliente;
    JLabel labelVenCodigo;
    JLabel labelVenIdProduto;
    JLabel labelVenDataVenda;
    JLabel labelVenValor;
    JLabel labelVenValorTotal;
    JLabel labelVenDesconto;
    
    
  this.setBounds(300,300,600,520);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);
    
    labelVenCodigo = new JLabel("Codigo");
    labelVenCodigo.setBounds(30, 25, 70, 25);
    this.getContentPane().add(labelVenCodigo);
            
    campoVenCodigo = new JTextField();    
    campoVenCodigo.setBounds(100, 25, 300, 25);        
    this.getContentPane().add(campoVenCodigo);
    
            
    labelVenIdProduto = new JLabel("ID do Produto");
    labelVenIdProduto.setBounds(30, 80, 100, 25);
    this.getContentPane().add(labelVenIdProduto);
    
    campoVenIdProduto = new JTextField();
    campoVenIdProduto.setBounds(120, 80, 280, 25);
    this.getContentPane().add(campoVenIdProduto);
    
    
    labelVenIdCliente = new JLabel("ID do Cliente");
    labelVenIdCliente.setBounds(30, 135, 70, 25);
    this.getContentPane().add(labelVenIdCliente);
    
    campoVenIdCliente = new JTextField();
    campoVenIdCliente.setBounds(120, 135, 280, 25);
    this.getContentPane().add(campoVenIdCliente);
    
    
    
    labelVenDataVenda = new JLabel("Data");
    labelVenDataVenda.setBounds(30, 190, 70, 25);
    this.getContentPane().add(labelVenDataVenda);
    
    
    campoVenDataVenda = new JTextField();
    campoVenDataVenda.setBounds(100, 190, 300, 25);
    this.getContentPane().add(campoVenDataVenda);
    
    
    
      labelVenValor = new JLabel("Valor");
    labelVenValor.setBounds(30, 245, 70, 25);
    this.getContentPane().add(labelVenValor);
    
    campoVenValor = new JTextField();
    campoVenValor.setBounds(100, 245, 300, 25);
    this.getContentPane().add(campoVenValor);
    
    
    labelVenValorTotal = new JLabel("Valor Total");
    labelVenValorTotal.setBounds(30, 300, 70, 25);
    this.getContentPane().add(labelVenValorTotal);
    
    campoVenValorTotal = new JTextField();
    campoVenValorTotal.setBounds(100, 300, 300, 25);
    this.getContentPane().add(campoVenValorTotal);
    
    
    
    labelVenDesconto = new JLabel("Desconto");
    labelVenDesconto.setBounds(30, 355, 70, 25);
    this.getContentPane().add(labelVenDesconto);
    
    
    campoVenDesconto = new JTextField();
    campoVenDesconto.setBounds(100, 355, 300, 25);
    this.getContentPane().add(campoVenDesconto);
    
    
    
    
    
    
    botaoVenCancelar = new JButton("Cancelar");
    botaoVenCancelar.setBounds(50, 410, 100, 25);
    this.getContentPane().add(botaoVenCancelar);
        botaoVenCancelar.setActionCommand("VenCancelar");
        botaoVenCancelar.addActionListener(this);
    
    
        
        
    botaoVenSalvar = new JButton("Salvar");
    botaoVenSalvar.setBounds(425, 410, 100, 25);
    this.getContentPane().add(botaoVenSalvar);
        botaoVenSalvar.setActionCommand("VenSalvar");
        botaoVenSalvar.addActionListener(this);
    
    }
    
    
     
    public void actionPerformed(ActionEvent e){
        
      
        
        switch (e.getActionCommand()){
             case "VenSalvar":
                 
                 controller.ControllerViewVenda.CadastrarVenda();
                 
                 break;
          
                 
             case "VenCancelar":
                 
                 dispose();
                 
                 break;
                 
             
                 
                 
                 
                 
         }
        
           
            
        } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
