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
    public Node padre;
    public String valor;
    public Object value;
    public int id;
    public String tipo;
    public String isInt;
    public int ambito; 
    //a trastear esta onda

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmbito() {
        return ambito;
    }

    public void setAmbito(int ambito) {
        this.ambito = ambito;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


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

    public Node getPadre() {
        return padre;
    }

    public void setPadre(Node padre) {
        this.padre = padre;
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

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String isIsInt() {
        return isInt;
    }

    public void setIsInt(String isInt) {
        this.isInt = isInt;
    }

    @Override
    public String toString() {
        return "Node{" + "etiqueta=" + etiqueta + ", hijos=" + hijos + ", padre=" + padre.getEtiqueta() + ", valor=" + valor + ", value=" + value + ", id=" + id + ", tipo=" + tipo + ", isInt=" + isInt + '}';
    }
    
    
}
