/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nachts;

/**
 *
 * @author k_k_r
 */
public class Variable {
    
    /*
    int
    chr
    bool
    string
    */
    
    String tipo;
    String id;
    boolean esArray = false;
    public Variable(String tipo, String id) {
        this.tipo = tipo;
        this.id = id;
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
        return "Variable{" + "tipo=" + tipo + ", id=" + id + '}';
    }
 
}
