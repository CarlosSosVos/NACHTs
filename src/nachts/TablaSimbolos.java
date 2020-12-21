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
public class TablaSimbolos {

    ArrayList<Record> simbolos = new ArrayList();

    public TablaSimbolos() {
        this.simbolos = new ArrayList();
    }

    public int symbol_exists(String id, String ambito) {
        for (Record simbolo : simbolos) {
            if (simbolo.getId() == id) {
                if (simbolo.getAmbito() == ambito) {
                    return simbolos.indexOf(simbolo);
                }
            }
        }
        return -1;
    }
    
    public Record getSymbol(String id, String ambito){
        if(symbol_exists(id,ambito) >-1){
            return simbolos.get(symbol_exists(id,ambito));
        }
        return null;
    }
    
     public int getOffsetAmbito(String ambito){
        int retVal = 0;
         for (Record simbolo : simbolos) {
             
         }
        return retVal;
    }
    
    public void newVar(Variable var){
        simbolos.add(var);
    }
   
    public void newFunc(Function Fun){
        simbolos.add(Fun);
    }
    
    public void clear(){
        this.simbolos.clear();
    }

    public String toString(){
    String output = "";
    
        for (Record simbolo : simbolos) {
            if (simbolo instanceof Variable){
                output +="\n"+((Variable)simbolo).toString();
            }
            if (simbolo instanceof Function){
                output +="\n"+((Function)simbolo).toString();
            }
        }
    
    return output;
    }
}
