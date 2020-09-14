/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nachts;

import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class Node {

    public String etiqueta;
    public ArrayList<Node> hijos = new ArrayList<>();
    public String valor;
    public int id;
   
    
    public void setEtiqueta(String e) {
        etiqueta = e;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    // hijos
    public void addHijos(Node n) {
        hijos.add(n);
    }

    public ArrayList<Node> getHijos() {
        return hijos;
    }

    // valor
    public void setValor(String v) {
        valor = v;
    }

    public String getValor() {
        return valor;
    }

    // id
    public void setID(int i) {
        id = i;
    }

    public int getID() {
        return id;
    }
}
