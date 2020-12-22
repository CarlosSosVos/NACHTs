/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nachts;

import java.util.ArrayList;

/**
 *
 * @author k_k_r
 */
public class Variable extends Record {
    
    String ambito = "0";
    Object value=null;
    boolean esArray = false;
    boolean parametro=false;
    ArrayList<Integer> ambitos;
    int offset;
    
    
    public boolean isEsArray() {
        return esArray;
    }
    
    
    public void setEsArray(boolean esArray) {
        this.esArray = esArray;
    }

    public String getAmbito() {
        return ambito;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }
    
    
    public Variable(String tipo, String id) {
        super(tipo,id);
        this.value = null;// new Object();
        this.ambitos = new ArrayList();
        this.ambitos.add(-1);            
        this.offset=0;
    }

    public ArrayList<Integer> getAmbitos() {
        return ambitos;
    }

    public void setAmbitos(ArrayList<Integer> ambitos) {
        this.ambitos = ambitos;
    }
    public void addAmbito(int param) {
        this.ambitos.add(param);
    }

    public boolean isArray() {
        return esArray;
    }

    public void setArray(boolean esArray) {
        this.esArray = esArray;
    }

    public boolean isParametro() {
        return parametro;
    }

    public void setParametro(boolean parametro) {
        this.parametro = parametro;
    }
    
    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        String StringValor;
        if(esArray){
            
        
        }
        
        return "Variable{" + "tipo=" + super.getTipo() + ", id=" + super.getId() + ", value=" + value + ", ambitos=" + ambitos + ", offset=" + offset + '}';
    }
    
    

    
 
}
