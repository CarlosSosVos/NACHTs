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
public class Function {

    public String tipo, id;
    public ArrayList<Variable> parametros;
    public boolean returnsArray = false;

    public boolean isReturnsArray() {
        return returnsArray;
    }

    public void setReturnsArray(boolean returnsArray) {
        this.returnsArray = returnsArray;
    }

    public Function(String tipo, String id, boolean returnsArray) {
        this.tipo = tipo;
        this.id = id;
        this.returnsArray = returnsArray;
        this.parametros = new ArrayList();
    }

    void add_param(Variable var) {
        if (this.parametros != null) {
            this.parametros.add(var);
        }
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

    public ArrayList<Variable> getParametros() {
        return parametros;
    }

    public void setParametros(ArrayList<Variable> parametros) {
        this.parametros = parametros;
    }

    @Override
    public String toString() {
        String ret_val = "Funcion: " + id + "\n" + "tipo: " + tipo + "\n";
        if (this.parametros.size() > 0) {
            for (int i = 0; i < parametros.size(); i++) {
                ret_val += "parametro no: " + i + " | id: " + parametros.get(i).getId() + " | tipo: " + parametros.get(i).getTipo() +"\n";
            }
        }
        return ret_val;
    }

}
