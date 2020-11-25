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
public class Variable {
    
    String tipo, id,ambito = "0";
    Object value;
    boolean esArray = false;
    ArrayList<Integer> ambitos;
    
    
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
        this.tipo = tipo;
        this.id = id;
        this.value = new Object();
        this.ambitos = new ArrayList();
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
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Variable{" + "tipo=" + tipo + ", id=" + id + ", ambito=" + ambito + ", value=" + value + ", esArray=" + esArray + ", ambitos=" + ambitos.toString() + '}';
    }

    
 
}
