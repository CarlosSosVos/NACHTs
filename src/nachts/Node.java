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
    public boolean ValueIsID = false;
    public String tipo;
    public String isInt;
    public int ambito; //ambito de ubicacion
    public String operador="";

    public boolean isValueIsID() {
        return ValueIsID;
    }

    public void setValueIsID(boolean ValueIsID) {
        this.ValueIsID = ValueIsID;
    }
    
    
    public ArrayList<Integer> Ambitos = new ArrayList(); // Ambito de los llamadores
    //a trastear esta onda

    public ArrayList<Integer> getAmbitos() {
        return Ambitos;
    }
    
    public void setAmbitos(ArrayList<Integer> Ambitos) {
        this.Ambitos = Ambitos;
    }
    
    public void addNewAmbito(int pos){    
        this.Ambitos.add(pos);
    }

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

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }
    
    @Override
    public String toString() {

        String retval = "";
        if(this.getTipo().equals("string")){
            retval = (String)this.getValue();
        }

        else if (this.getTipo().equals("chr")) {
            retval = (char)this.getValue() + "";
        }

        else if (this.getTipo().equals("int")) {
            retval = (int)this.getValue() + "";
        }
        else if (this.getTipo().equals("bool")) {
            retval = (boolean)this.getValue()+ "";
        }

        return "Node{" + "etiqueta=" + etiqueta + ", hijos=" + hijos + ", padre=" + padre.getEtiqueta() + ", valor=" + valor + ", value=" + retval + ", id=" + id + ", tipo=" + tipo + ", isInt=" + isInt + '}';
    }
    
    
}
