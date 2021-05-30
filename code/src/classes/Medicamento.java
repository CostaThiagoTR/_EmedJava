/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author caios
 */
public class Medicamento {
    
    //atributes
    private String idMed;
    private Integer quant;
    private String cas;
    
    //functions
    public boolean verificaVazio(){
        
        boolean result = false;
        
        if(getQuant()==0){
            result = true;
        }
        
        return result;
    }

    //getters 'n setters   
    public String getIdMed() {
        return idMed;
    }
      
    public void setIdMed(String idMed) {
        this.idMed = idMed;
    }

    public Integer getQuant() {
        return quant;
    }

    public void setQuant(Integer quant) {
        if(quant>0){
            this.quant = quant;
        }      
    }

    public String getCas() {
        return cas;
    }

    public void setCas(String cas) {
        this.cas = cas;
    }
}
