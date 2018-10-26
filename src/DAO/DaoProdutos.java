/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelProduto;
/**
 *
 * @author Kenny Alex P.H. 1224
 */
public class DaoProdutos extends ConexaoMySql{
    
    
    /**
     * SALVAR - CADASTRAR UM PRODUTO DO BANCO
     * PARAM pModelProdutos
     * return int;
    */
    
    public int salvarProdutosDAO(ModelProduto pModelProdutos){
        
        try{
             
            this.conectar();
            
            return this.insertSQL("INSERT INTO tbl_produto ("
                    +"pk_id_produto,"
                    +"pro_nome,"
                    +"pro_valor,"
                    +"pro_estoque"
                    + ") VALUES ("
                    +"'" + pModelProdutos.getProNome() + "',"
                    +"'" + pModelProdutos.getProValor() + "',"
                    +"'" + pModelProdutos.getProEstoque() + "'"
                    
            );
            
        }catch(Exception e){
            
            e.printStackTrace();
            return 0;
            
        }finally{
            this.fecharConexao();
        }
        
    }
    
    /**
     * EXCLUIR UM PRODUTO DO BANCO
     * PARAM pidProduto
     * return boolean;
    */
    
    public boolean excluirProdutosDAO(int pidProduto){
        
        try{
            
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl produto WHERE pk id_produto = '"+pidProduto+"'");
            
            
            
            
            
        }catch (Exception e){
            e.printStackTrace();
            return false;
            
        }finally{
            this.fecharConexao();
        }
        
        
        
    }
    
     /**
     * ALTERAR UM PRODUTO DO BANCO
     * PARAM pModelProdutos
     * return boolean;
    */
    
    public boolean alterarProdutosDAO(ModelProduto pModelProdutos){
        try{
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_produto SET"
                    + "pro_nome = '"+pModelProdutos.getProNome()+"'," 
                    + "pro_valor = '"+pModelProdutos.getProValor()+"'," 
                    + "pro_estoque = '"+pModelProdutos.getProEstoque()+"'"
                    + " WHERE pk_id_produto = '"+pModelProdutos.getIdProduto()+"'"
            
            
            
            
            );
            
            
        }catch(Exception e){
            e.printStackTrace();
            return false;
            
        
            
            
        }finally{
            this.fecharConexao();
        }
        
        
        
        
        
        
    }
    
    
    
        /**
     * RETORNAR UM PRODUTO DO BANCO
     * PARAM pIdProduto
     * return ModelProdutos;
    */
    
    public ModelProduto retornarProdutosDAO(int pIdProduto){
        ModelProduto modelProdutos = new ModelProduto();
        try{
            this.conectar();
            this.executarSQL("SELECT"
            + "pk_id_produto,"
            + "pro_nome,"        
            + "pro_valor,"
            + "pro_estoque"
            + "FROM tbl_produto WHERE pk_id_produto = '"+pIdProduto+"'");
             while (this.getResultSet().next()){
              modelProdutos.setIdProduto(this.getResultSet().getInt(1));
              modelProdutos.setProNome(this.getResultSet().getString(2));
              modelProdutos.setProValor(this.getResultSet().getDouble(3));
              modelProdutos.setProEstoque(this.getResultSet().getInt(4));
              
               
                 
             }
            
        }catch (Exception e){
            e.printStackTrace();
           
        }finally{
            this.fecharConexao();
        }
        
            
            
        
        return modelProdutos;
    }
    
    
        /**
     * RETORNAR UMA LISTA COMPLETA DE PRODUTOS
     
     * return listaModelProdutos;
    */
    
    public ArrayList<ModelProduto> retornarListaProdutosDAO(){
        ArrayList<ModelProduto> listaModelProdutos = new ArrayList<>();
        ModelProduto modelProdutos= new ModelProduto();
        
        try{
            this.conectar();
            this.executarSQL("SELECT"
            + "pk_id_produto,"
            + "pro_nome,"        
            + "pro_valor,"
            + "pro_estoque"
            + "FROM tbl_produto;");
            
              while (this.getResultSet().next()){
              modelProdutos = new ModelProduto();
              modelProdutos.setIdProduto(this.getResultSet().getInt(1));
              modelProdutos.setProNome(this.getResultSet().getString(2));
              modelProdutos.setProValor(this.getResultSet().getDouble(3));
              modelProdutos.setProEstoque(this.getResultSet().getInt(4));
              listaModelProdutos.add(modelProdutos);
               
                 
             }
            
            
            
            
        }catch (Exception e){
            e.printStackTrace();
           
        }finally{
            this.fecharConexao();
        }
        
        return listaModelProdutos;
    }
    
    
}
