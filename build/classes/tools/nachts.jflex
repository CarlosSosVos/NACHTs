
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
anything = [\s]|[\S]
simple_quote = "\'"
double_quote= "\""
hash = [#]
asterisk = [*] 
//def_char= {simple_quote}{anything}{simple_quote}
//comentarios
comment = "#*" [^*] ~"*#" | "#*" "*"+ "#"
s_comment = {hash}{asterisk}
e_comment ={asterisk}{hash}
//l_comment= {hash}{hash}
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

cont_string = ("\""[^["\""]]+"\"")|("\"\"") 
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
OPCOND ="?"
OPAND ="&&"
OPOR="||"
OPMOD= "%"

//operadores aritmeticos
OPMULT = "*"|"/"
OPSUM = "+"|"-"
OPINC = "++"|"--"
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

%%

<YYINITIAL> {
   
    {function} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.FUNCTION, yycolumn, yyline, yytext());
    }
    {comment} {
        String output = "Se encuentra comentario en ("+ yyline +","+ yycolumn+")\n" +yytext();
        accum+= output +"\n";
        System.out.println(output);           
    }   
        
    {l_comment} {
    
        String output = "Se encuentra comentario de linea en ("+ yyline +","+ yycolumn+")\n" +yytext();
        accum+= output +"\n";
        System.out.println(output);    
    }
    {newline} {
                //System.out.println("encuentra salto de linea"); 

    }
    {spaces} {
                //System.out.println("encuentra espacio"); 

    }
    
    {numbers} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
        return new Symbol(sym.NUM, yycolumn, yyline, yytext());
    }
    
    /*
    {def_char} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println("Definicion del caracter:" + output);
        return new Symbol(sym.CONSTCHAR, yycolumn, yyline, yytext());
    }
    */
    {upTo} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.UPTO, yycolumn, yyline, yytext());
    }
    {downTo} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.DOWNTO, yycolumn, yyline, yytext());
    }
    {step} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.STEP, yycolumn, yyline, yytext());
    }
    {var} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.VARIABLE, yycolumn, yyline, yytext());
    }

    {string} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.STRING, yycolumn, yyline, yytext());
    }

    {cont_string} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println("Definicion del string: " + output);
        return new Symbol(sym.CONSTSTRING, yycolumn, yyline, yytext());
    }

    {simple_quote} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
    }

    /*{double_quote} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
    } */

    {integer} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.INTEGER, yycolumn, yyline, yytext());
    }
    {character} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.CHARACTER, yycolumn, yyline, yytext());
    }
    {bool} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.BOOLEAN, yycolumn, yyline, yytext());
    }
    {if} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
        return new Symbol(sym.IF, yycolumn, yyline, yytext());
    }
    {else} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.ELSE, yycolumn, yyline, yytext());
    }
    {while} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.WHILE, yycolumn, yyline, yytext());
    }
    {for} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.FOR, yycolumn, yyline, yytext());
    }
    {main} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {return} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
        return new Symbol(sym.RETURN, yycolumn, yyline, yytext());
    }
    {void} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.VOID, yycolumn, yyline, yytext());
    }
    {true} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.TRUE, yycolumn, yyline, yytext());
    }
    {false} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
        return new Symbol(sym.FALSE, yycolumn, yyline, yytext());
    }
    {break} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.BREAK, yycolumn, yyline, yytext());
    }
    {null} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.NULL, yycolumn, yyline, yytext());
    }
    {input} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.INPUT, yycolumn, yyline, yytext());
    }
    {output} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
        return new Symbol(sym.OUTPUT, yycolumn, yyline, yytext());
    }
    {switch} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.SWITCH, yycolumn, yyline, yytext());
    }
    {case} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.CASE, yycolumn, yyline, yytext());
    }
    {option} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.OPTION, yycolumn, yyline, yytext());
    }
    {default} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.DEFAULT, yycolumn, yyline, yytext());
    }
    {id} {
        String output= "ID "+ yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.ID, yycolumn, yyline, yytext());
    }
    {OPCOMP} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.OPCOMP, yycolumn, yyline, yytext());
    }
    {OPDIF} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.OPDIF, yycolumn, yyline, yytext());
    }
    {OPGREATER} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.OPGREATER, yycolumn, yyline, yytext());
    }
    {OPGREATEREQ} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.OPGREATEREQ, yycolumn, yyline, yytext());
    }
    {OPLESS} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.OPLESS, yycolumn, yyline, yytext());
    }
    {OPLESSEQ} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.OPLESSEQ, yycolumn, yyline, yytext());
    }
    {OPCOND} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
        return new Symbol(sym.OPCOND, yycolumn, yyline, yytext());
    }
    {OPAND} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.OPAND, yycolumn, yyline, yytext());
    }
    {OPOR} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.OPOR, yycolumn, yyline, yytext());
    }
    {OPMOD} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.OPMOD, yycolumn, yyline, yytext());
    }
    {OPMULT} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.OPMULT, yycolumn, yyline, yytext());
    }
    {OPSUM} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
        return new Symbol(sym.OPSUM, yycolumn, yyline, yytext());
    }
    
    {OPINC} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.OPINC, yycolumn, yyline, yytext());
    }
    {OPASIGN} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.OPASIGN, yycolumn, yyline, yytext());
    }
    {OPASIGNADD} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.OPASIGNADD, yycolumn, yyline, yytext());
    }
    {OPASIGNMULT} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.OPASIGNMULT, yycolumn, yyline, yytext());
    }
    {l_key} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.L_KEY, yycolumn, yyline, yytext());
    }
    {r_key} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.R_KEY, yycolumn, yyline, yytext());
    }
    {l_bracket} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.L_BRACKET, yycolumn, yyline, yytext());
    }
    {r_bracket} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.R_BRACKET, yycolumn, yyline, yytext());
    }
    {l_par} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.L_PAR, yycolumn, yyline, yytext());
    }
    {r_par} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.R_PAR, yycolumn, yyline, yytext());
    }
    {comma} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.COMMA, yycolumn, yyline, yytext());
    }
    {semicolon} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.SEMICOLON, yycolumn, yyline, yytext());
    }
    {colon} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
        return new Symbol(sym.COLON, yycolumn, yyline, yytext());
    }
    .   {
        String error = "ERROR EN" + "("+ yyline +","+ yycolumn+")" + ", token no recnocido";
        accum+= error +"\n";
        System.out.println(error);
        errors.add(error);
    }

}
/*<COMMENT> {
    {e_comment} {
        System.out.println(yytext());
        accum+= yytext() + "\n" ;
        yybegin(1); 
    }
    {s_comment} {
        String error = "ERROR EN" + "("+ yyline +","+ yycolumn+")";
        accum+= error + "\n" ;

        System.out.println(error);
    }
}
<L_COMMENT> {
    {newline} {
        System.out.println(yytext());
        accum+= yytext() + "\n" ;
        yybegin(1);
    }
    .         {
        System.out.print(yytext());
        accum+= yytext();

    }
}*/

