
package calichescript;

%%
%unicode 
%line
%column
%int
%class Lexer

//%state COMMENT
//%state L_COMMENT 

%{
    public String accum = "";
%}

%{
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
    /*{hash} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
    }*/
    {function} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
    }
    {comment} {
        String output = "Se encuentra comentario en ("+ yyline +","+ yycolumn+")\n" +yytext();
        accum+= output +"\n";
        System.out.println(output); 
        
        //yybegin(COMMENT);    
    }   
    /*
    {s_comment} {
        System.out.print("comienzo de comentario"); 
        System.out.print(yytext());    
        yybegin(COMMENT);    
    }*/   
    
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
    }
    
    /*
    {def_char} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println("Definicion del caracter:" + output);
    }
    */
    {upTo} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
    }
    {downTo} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
    }
    {step} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
    }
    {var} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
    }

    {string} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output);
    }

    {cont_string} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println("Definicion del string: " + output);
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
    }
    {character} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {bool} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {if} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {else} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {while} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {for} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
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
    }
    {void} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {true} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {false} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {break} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {null} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {input} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {output} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {switch} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {case} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {option} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {default} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {id} {
        String output= "ID "+ yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {OPCOMP} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {OPDIF} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {OPGREATER} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {OPGREATEREQ} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {OPLESS} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {OPLESSEQ} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {OPCOND} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {OPAND} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {OPOR} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {OPMOD} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {OPMULT} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {OPSUM} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    
    {OPINC} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {OPASIGN} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {OPASIGNADD} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {OPASIGNMULT} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {l_key} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {r_key} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {l_bracket} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {r_bracket} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {l_par} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {r_par} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {comma} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {semicolon} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    {colon} {
        String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println(output); 
    }
    .   {
        String error = "ERROR EN" + "("+ yyline +","+ yycolumn+")" + ", token no recnocido";
        accum+= error +"\n";
        System.out.println(error);
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

