
package nachts;
import java_cup.runtime.*;
import java.util.ArrayList;

%%
%unicode 
%line
%column
%int
%class Lexer
%cupsym Sym
%cup
%type java_cup.runtime.Symbol
%full

//%state COMMENT
//%state L_COMMENT 

%{
    public String accum = "";
    String error= "";
    ArrayList<String> errors = new ArrayList();
    public String getAccum(){
        return this.accum;
    }   
%}


letter = [a-zA-Z]|"_"
digit = [0-9]
id = {letter}({letter}|{digit})*
numbers = {digit}+

//comentarios
comment = "#*" [^*] ~"*#" | "#*" "*"+ "#"
l_comment = "##"[^["\n"]]+"\n"

//saltos de linea y espacios
newline = [\n]
spaces = [ \n\t\r]

//reservadas
integer = "int"
character= "chr"
bool = "bool"
string = "string"
if = "if"
else ="else"
while= "wh"
for = "for"
main = "main"
return = "return"
void = "void"
true = "true"
false ="false"
null="null"
break ="brk"
function = "fnc"
upTo = "upTo"
downTo= "dwnTo"
step = "step"
var = "var"
at= "at"
return = "rtn"

cont_string = ("\""[^["\""]]+"\"")|("\"\"")

//cont_char = ("\'"[^["\'"]]"\'")|("\'\'")
cont_char = ("\'")([^"\'"])("\'")|("\'\'")

//Escritura y lectura

input = "input"
output = "output"
//switch propio
switch = "sw"
case = "case"
option = "option"
default= "dft"

//operadores relacionales


OPCOMP= "="
OPDIF = "!="
OPGREATER= ">"
OPGREATEREQ= ">="
OPLESS= "<"
OPLESSEQ = "<="
OPREL = {OPCOMP}|{OPDIF}|{OPGREATER}|{OPGREATEREQ}|{OPLESS}|{OPLESSEQ}
OPCOND ="?"
OPAND ="&&"
OPOR="||"
OPLOG = {OPAND}|{OPOR}

//operadores aritmeticos
OPMULT = "*"|"/"
OPSUM = "+"|"-"
OPINC = "++"|"--"
OPMOD= "%"
//operadores de asignacion
OPASIGN=":="
OPASIGNADD= "+=" | "-="
OPASIGNMULT= "*=" | "/="


//separadores y delimitadores
l_key = "{"
r_key = "}"
l_bracket= "["
r_bracket ="]"
l_par="("
r_par=")"
comma =","
semicolon=";"
colon=":"
dot="."

%%

<YYINITIAL> {
   
    {function} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.FUNCTION, yycolumn, yyline, yytext());
    }
    {comment} {
        String output = "Se encuentra comentario en ("+ yyline +","+ yycolumn+")\n" +yytext();
        accum+= output +"\n";
        //System.out.println(output);           
    }   
        
    {l_comment} {
    
        String output = "Se encuentra comentario de linea en ("+ yyline +","+ yycolumn+")\n" +yytext();
        accum+= output +"\n";
        //System.out.println(output);    
    }
    {newline} {
                //System.out.println("encuentra salto de linea"); 

    }
    {spaces} {
                //System.out.println("encuentra espacio"); 

    }
    {at} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.AT, yycolumn, yyline, yytext());
    }
    
    {numbers} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output); 
        return new Symbol(Sym.NUM, yycolumn, yyline, yytext());
    }
    
  
    {upTo} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.UPTO, yycolumn, yyline, yytext());
    }   
   
    {downTo} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.DOWNTO, yycolumn, yyline, yytext());
    }

    {downTo} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.DOWNTO, yycolumn, yyline, yytext());
    }

    {step} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.STEP, yycolumn, yyline, yytext());
    }
    {var} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.VARIABLE, yycolumn, yyline, yytext());
    }

    {string} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.STRING, yycolumn, yyline, yytext());
    }

    {cont_string} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println("Definicion del string: " + output);
        return new Symbol(Sym.CONSTSTRING, yycolumn, yyline, yytext());
    }

    {cont_char} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println("Definicion del caracter: " + output);
        return new Symbol(Sym.CONSTCHAR, yycolumn, yyline, yytext());
    }

    {integer} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.INTEGER, yycolumn, yyline, yytext());
    }
    {character} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.CHARACTER, yycolumn, yyline, yytext());
    }
    {bool} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.BOOLEAN, yycolumn, yyline, yytext());
    }
    {if} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output); 
        return new Symbol(Sym.IF, yycolumn, yyline, yytext());
    }
    {else} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.ELSE, yycolumn, yyline, yytext());
    }
    {while} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.WHILE, yycolumn, yyline, yytext());
    }
    {for} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.FOR, yycolumn, yyline, yytext());
    }
    {main} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.MAIN, yycolumn, yyline, yytext());

    }
    {return} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output); 
        return new Symbol(Sym.RETURN, yycolumn, yyline, yytext());
    }
    {void} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.VOID, yycolumn, yyline, yytext());
    }
    {true} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.TRUE, yycolumn, yyline, yytext());
    }
    {false} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output); 
        return new Symbol(Sym.FALSE, yycolumn, yyline, yytext());
    }
    {break} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.BREAK, yycolumn, yyline, yytext());
    }
    {null} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.NULL, yycolumn, yyline, yytext());
    }
    {input} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.INPUT, yycolumn, yyline, yytext());
    }
    {output} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output); 
        return new Symbol(Sym.OUTPUT, yycolumn, yyline, yytext());
    }
    {switch} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.SWITCH, yycolumn, yyline, yytext());
    }
    {case} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.CASE, yycolumn, yyline, yytext());
    }
    {option} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.OPTION, yycolumn, yyline, yytext());
    }
    {default} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.DEFAULT, yycolumn, yyline, yytext());
    }
    {id} {
        String output= "ID "+ yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.ID, yycolumn, yyline, yytext());
    }
    
    {OPREL} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output); 
        return new Symbol(Sym.OPREL, yycolumn, yyline, yytext());
    }
    
    {OPCOND} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output); 
        return new Symbol(Sym.OPCOND, yycolumn, yyline, yytext());
    }
   
    {OPLOG} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.OPLOG, yycolumn, yyline, yytext());
    }

    {OPMOD} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.OPMOD, yycolumn, yyline, yytext());
    }
    {OPMULT} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.OPMULT, yycolumn, yyline, yytext());
    }
    {OPSUM} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output); 
        return new Symbol(Sym.OPSUM, yycolumn, yyline, yytext());
    }
    
    {OPINC} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.OPINC, yycolumn, yyline, yytext());
    }
    {OPASIGN} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.OPASIGN, yycolumn, yyline, yytext());
    }
    {OPASIGNADD} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.OPASIGNADD, yycolumn, yyline, yytext());
    }
    {OPASIGNMULT} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.OPASIGNMULT, yycolumn, yyline, yytext());
    }
    {l_key} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.L_KEY, yycolumn, yyline, yytext());
    }
    {r_key} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.R_KEY, yycolumn, yyline, yytext());
    }
    {l_bracket} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.L_BRACKET, yycolumn, yyline, yytext());
    }
    {r_bracket} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.R_BRACKET, yycolumn, yyline, yytext());
    }
    {l_par} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.L_PAR, yycolumn, yyline, yytext());
    }
    {r_par} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.R_PAR, yycolumn, yyline, yytext());
    }
    {comma} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.COMMA, yycolumn, yyline, yytext());
    }
    {semicolon} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.SEMICOLON, yycolumn, yyline, yytext());
    }
    {colon} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.COLON, yycolumn, yyline, yytext());
    }

    {dot} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.DOT, yycolumn, yyline, yytext());
    }

    

    .   {
        
        String descripcion_error =", token no reconocido";
        
        String error = "ERROR EN" + "("+ yyline +","+ yycolumn+")" + descripcion_error ;
        accum+= error +"\n";
        System.out.println(error);
        errors.add(error);
        
    }

}


