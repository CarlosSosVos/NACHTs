/* The following code was generated by JFlex 1.6.1 */


package nachts;
import java_cup.runtime.*;
import java.util.ArrayList;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>./src/tools/nachts.jflex</tt>
 */
class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  6,  5, 51, 51,  6,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     6, 32, 29,  3,  0, 40, 35, 30, 46, 47,  4, 38, 48, 39, 50, 37, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2, 41, 49, 33, 31, 33, 34, 
     0,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1, 28,  1,  1,  1,  1,  1,  1, 44,  0, 45,  0,  1, 
     0, 13, 17, 14, 25, 20, 10, 19, 15,  7,  1, 26, 11, 22,  8, 12, 
    27,  1, 16, 18,  9, 23, 24, 21,  1,  1,  1, 42, 36, 43,  0,  0, 
     0,  0,  0,  0,  0, 51,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\1\1\4\1\5\1\6"+
    "\20\2\2\1\1\7\1\1\1\7\1\10\2\1\2\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\3\0\1\25\1\2\1\26\10\2"+
    "\1\27\6\2\1\30\1\2\1\31\6\2\1\0\1\32"+
    "\1\0\1\33\1\34\1\35\1\36\1\37\1\40\3\0"+
    "\1\41\3\2\1\42\1\2\1\43\4\2\1\44\1\45"+
    "\1\2\1\46\7\2\1\47\1\50\1\2\1\51\1\0"+
    "\1\52\1\2\1\53\1\54\4\2\1\55\1\56\1\2"+
    "\1\57\1\60\1\61\1\62\1\63\1\64\1\2\1\65"+
    "\1\66\1\67\3\2\1\70\1\71\1\72\1\73";

  private static int [] zzUnpackAction() {
    int [] result = new int[142];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\64\0\150\0\234\0\320\0\u0104\0\64\0\64"+
    "\0\u0138\0\u016c\0\u01a0\0\u01d4\0\u0208\0\u023c\0\u0270\0\u02a4"+
    "\0\u02d8\0\u030c\0\u0340\0\u0374\0\u03a8\0\u03dc\0\u0410\0\u0444"+
    "\0\u0478\0\u04ac\0\64\0\u04e0\0\u04e0\0\64\0\u0514\0\u0548"+
    "\0\u057c\0\u05b0\0\64\0\u05e4\0\64\0\64\0\64\0\64"+
    "\0\64\0\64\0\64\0\64\0\64\0\u0618\0\u064c\0\u0680"+
    "\0\64\0\u06b4\0\150\0\u06e8\0\u071c\0\u0750\0\u0784\0\u07b8"+
    "\0\u07ec\0\u0820\0\u0854\0\150\0\u0888\0\u08bc\0\u08f0\0\u0924"+
    "\0\u0958\0\u098c\0\150\0\u09c0\0\150\0\u09f4\0\u0a28\0\u0a5c"+
    "\0\u0a90\0\u0ac4\0\u0af8\0\u0478\0\64\0\u0b2c\0\64\0\64"+
    "\0\64\0\64\0\64\0\u0618\0\u0b60\0\u0b94\0\u0bc8\0\150"+
    "\0\u0bfc\0\u0c30\0\u0c64\0\150\0\u0c98\0\150\0\u0ccc\0\u0d00"+
    "\0\u0d34\0\u0d68\0\150\0\150\0\u0d9c\0\150\0\u0dd0\0\u0e04"+
    "\0\u0e38\0\u0e6c\0\u0ea0\0\u0ed4\0\u0f08\0\150\0\150\0\u0f3c"+
    "\0\64\0\u0f70\0\64\0\u0fa4\0\150\0\150\0\u0fd8\0\u100c"+
    "\0\u1040\0\u1074\0\150\0\150\0\u10a8\0\150\0\150\0\150"+
    "\0\150\0\150\0\150\0\u10dc\0\150\0\150\0\150\0\u1110"+
    "\0\u1144\0\u1178\0\150\0\150\0\150\0\150";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[142];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\3\1\15\1\16\1\17\1\3"+
    "\1\20\1\21\1\22\1\3\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\3\3\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\6\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
    "\1\55\66\0\2\3\4\0\26\3\31\0\1\4\57\0"+
    "\1\56\4\0\1\57\1\60\116\0\1\61\25\0\2\3"+
    "\4\0\1\3\1\62\1\3\1\63\22\3\30\0\2\3"+
    "\4\0\20\3\1\64\5\3\30\0\2\3\4\0\11\3"+
    "\1\65\14\3\30\0\2\3\4\0\1\3\1\66\2\3"+
    "\1\67\1\70\1\71\17\3\30\0\2\3\4\0\20\3"+
    "\1\72\3\3\1\73\1\3\30\0\2\3\4\0\2\3"+
    "\1\74\23\3\30\0\2\3\4\0\6\3\1\75\1\3"+
    "\1\76\15\3\30\0\2\3\4\0\2\3\1\77\23\3"+
    "\30\0\2\3\4\0\5\3\1\100\3\3\1\101\14\3"+
    "\30\0\2\3\4\0\2\3\1\102\13\3\1\103\7\3"+
    "\30\0\2\3\4\0\4\3\1\104\21\3\30\0\2\3"+
    "\4\0\10\3\1\105\15\3\30\0\2\3\4\0\6\3"+
    "\1\106\17\3\30\0\2\3\4\0\24\3\1\107\1\3"+
    "\30\0\2\3\4\0\5\3\1\110\1\111\17\3\30\0"+
    "\2\3\4\0\3\3\1\112\12\3\1\113\7\3\27\0"+
    "\35\114\1\115\26\114\36\116\1\117\25\116\37\0\1\33"+
    "\67\0\1\120\64\0\1\120\56\0\1\121\6\0\1\122"+
    "\54\0\1\121\7\0\1\122\53\0\1\123\26\0\1\124"+
    "\61\0\5\125\1\0\56\125\4\126\1\127\57\126\1\0"+
    "\2\3\4\0\2\3\1\130\21\3\1\131\1\3\30\0"+
    "\2\3\4\0\4\3\1\132\21\3\30\0\2\3\4\0"+
    "\20\3\1\133\5\3\30\0\2\3\4\0\7\3\1\134"+
    "\16\3\30\0\2\3\4\0\5\3\1\135\20\3\30\0"+
    "\2\3\4\0\11\3\1\136\14\3\30\0\2\3\4\0"+
    "\4\3\1\137\21\3\30\0\2\3\4\0\2\3\1\140"+
    "\23\3\30\0\2\3\4\0\2\3\1\141\23\3\30\0"+
    "\2\3\4\0\13\3\1\142\12\3\30\0\2\3\4\0"+
    "\11\3\1\143\14\3\30\0\2\3\4\0\1\3\1\144"+
    "\24\3\30\0\2\3\4\0\5\3\1\145\20\3\30\0"+
    "\2\3\4\0\23\3\1\146\2\3\30\0\2\3\4\0"+
    "\11\3\1\147\3\3\1\150\10\3\30\0\2\3\4\0"+
    "\1\151\12\3\1\152\12\3\30\0\2\3\4\0\1\153"+
    "\25\3\30\0\2\3\4\0\25\3\1\154\30\0\2\3"+
    "\4\0\1\155\25\3\30\0\2\3\4\0\11\3\1\156"+
    "\14\3\30\0\2\3\4\0\2\3\1\157\23\3\30\0"+
    "\2\3\4\0\1\3\1\160\24\3\65\0\1\117\25\0"+
    "\5\125\1\161\56\125\4\126\1\162\57\126\3\0\1\163"+
    "\1\127\60\0\2\3\4\0\20\3\1\164\5\3\30\0"+
    "\2\3\4\0\4\3\1\165\21\3\30\0\2\3\4\0"+
    "\15\3\1\166\10\3\30\0\2\3\4\0\6\3\1\167"+
    "\17\3\30\0\2\3\4\0\13\3\1\170\12\3\30\0"+
    "\2\3\4\0\24\3\1\171\1\3\30\0\2\3\4\0"+
    "\1\172\25\3\30\0\2\3\4\0\15\3\1\173\10\3"+
    "\30\0\2\3\4\0\4\3\1\174\21\3\30\0\2\3"+
    "\4\0\1\175\25\3\30\0\2\3\4\0\24\3\1\176"+
    "\1\3\30\0\2\3\4\0\3\3\1\177\22\3\30\0"+
    "\2\3\4\0\15\3\1\200\10\3\30\0\2\3\4\0"+
    "\1\3\1\201\24\3\30\0\2\3\4\0\5\3\1\202"+
    "\20\3\30\0\2\3\4\0\22\3\1\203\3\3\30\0"+
    "\2\3\4\0\25\3\1\204\27\0\3\126\1\163\1\162"+
    "\57\126\1\0\2\3\4\0\2\3\1\205\23\3\30\0"+
    "\2\3\4\0\2\3\1\206\23\3\30\0\2\3\4\0"+
    "\15\3\1\207\10\3\30\0\2\3\4\0\20\3\1\210"+
    "\5\3\30\0\2\3\4\0\5\3\1\211\20\3\30\0"+
    "\2\3\4\0\1\3\1\212\24\3\30\0\2\3\4\0"+
    "\5\3\1\213\20\3\30\0\2\3\4\0\2\3\1\214"+
    "\23\3\30\0\2\3\4\0\1\3\1\215\24\3\30\0"+
    "\2\3\4\0\14\3\1\216\11\3\27\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4524];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\2\11\22\1\1\11\2\1\1\11"+
    "\4\1\1\11\1\1\11\11\3\0\1\11\32\1\1\0"+
    "\1\11\1\0\5\11\1\1\3\0\31\1\1\11\1\0"+
    "\1\11\33\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[142];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    public String accum = "";
    String error= "";
    ArrayList<String> errors = new ArrayList();
    public String getAccum(){
        return this.accum;
    }   


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }



  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(Sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { String descripcion_error =", token no reconocido";
        
        String error = "ERROR EN" + "("+ yyline +","+ yycolumn+")" + descripcion_error ;
        accum+= error +"\n";
        System.out.println(error);
        errors.add(error);
            }
          case 60: break;
          case 2: 
            { String output= "ID "+ yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.ID, yycolumn, yyline, yytext());
            }
          case 61: break;
          case 3: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output); 
        return new Symbol(Sym.NUM, yycolumn, yyline, yytext());
            }
          case 62: break;
          case 4: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.OPMULT, yycolumn, yyline, yytext());
            }
          case 63: break;
          case 5: 
            { //System.out.println("encuentra salto de linea");
            }
          case 64: break;
          case 6: 
            { //System.out.println("encuentra espacio");
            }
          case 65: break;
          case 7: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output); 
        return new Symbol(Sym.OPREL, yycolumn, yyline, yytext());
            }
          case 66: break;
          case 8: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output); 
        return new Symbol(Sym.OPCOND, yycolumn, yyline, yytext());
            }
          case 67: break;
          case 9: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output); 
        return new Symbol(Sym.OPSUM, yycolumn, yyline, yytext());
            }
          case 68: break;
          case 10: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.OPMOD, yycolumn, yyline, yytext());
            }
          case 69: break;
          case 11: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.COLON, yycolumn, yyline, yytext());
            }
          case 70: break;
          case 12: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.L_KEY, yycolumn, yyline, yytext());
            }
          case 71: break;
          case 13: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.R_KEY, yycolumn, yyline, yytext());
            }
          case 72: break;
          case 14: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.L_BRACKET, yycolumn, yyline, yytext());
            }
          case 73: break;
          case 15: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.R_BRACKET, yycolumn, yyline, yytext());
            }
          case 74: break;
          case 16: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.L_PAR, yycolumn, yyline, yytext());
            }
          case 75: break;
          case 17: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.R_PAR, yycolumn, yyline, yytext());
            }
          case 76: break;
          case 18: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.COMMA, yycolumn, yyline, yytext());
            }
          case 77: break;
          case 19: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.SEMICOLON, yycolumn, yyline, yytext());
            }
          case 78: break;
          case 20: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.DOT, yycolumn, yyline, yytext());
            }
          case 79: break;
          case 21: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.OPASIGNMULT, yycolumn, yyline, yytext());
            }
          case 80: break;
          case 22: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output); 
        return new Symbol(Sym.IF, yycolumn, yyline, yytext());
            }
          case 81: break;
          case 23: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.AT, yycolumn, yyline, yytext());
            }
          case 82: break;
          case 24: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.SWITCH, yycolumn, yyline, yytext());
            }
          case 83: break;
          case 25: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.WHILE, yycolumn, yyline, yytext());
            }
          case 84: break;
          case 26: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println("Definicion del string: " + output);
        return new Symbol(Sym.CONSTSTRING, yycolumn, yyline, yytext());
            }
          case 85: break;
          case 27: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        System.out.println("Definicion del caracter: " + output);
        return new Symbol(Sym.CONSTCHAR, yycolumn, yyline, yytext());
            }
          case 86: break;
          case 28: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.OPLOG, yycolumn, yyline, yytext());
            }
          case 87: break;
          case 29: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.OPASIGNADD, yycolumn, yyline, yytext());
            }
          case 88: break;
          case 30: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.OPINC, yycolumn, yyline, yytext());
            }
          case 89: break;
          case 31: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.OPASIGN, yycolumn, yyline, yytext());
            }
          case 90: break;
          case 32: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output); 
        return new Symbol(Sym.FLOAT_VAL, yycolumn, yyline, yytext());
            }
          case 91: break;
          case 33: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.INTEGER, yycolumn, yyline, yytext());
            }
          case 92: break;
          case 34: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.FUNCTION, yycolumn, yyline, yytext());
            }
          case 93: break;
          case 35: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.FOR, yycolumn, yyline, yytext());
            }
          case 94: break;
          case 36: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.CHARACTER, yycolumn, yyline, yytext());
            }
          case 95: break;
          case 37: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output); 
        return new Symbol(Sym.RETURN, yycolumn, yyline, yytext());
            }
          case 96: break;
          case 38: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.BREAK, yycolumn, yyline, yytext());
            }
          case 97: break;
          case 39: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.VARIABLE, yycolumn, yyline, yytext());
            }
          case 98: break;
          case 40: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.DEFAULT, yycolumn, yyline, yytext());
            }
          case 99: break;
          case 41: 
            { String output = "Se encuentra comentario de linea en ("+ yyline +","+ yycolumn+")\n" +yytext();
        accum+= output +"\n";
        //System.out.println(output);
            }
          case 100: break;
          case 42: 
            { String output = "Se encuentra comentario en ("+ yyline +","+ yycolumn+")\n" +yytext();
        accum+= output +"\n";
        //System.out.println(output);
            }
          case 101: break;
          case 43: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.NULL, yycolumn, yyline, yytext());
            }
          case 102: break;
          case 44: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.TRUE, yycolumn, yyline, yytext());
            }
          case 103: break;
          case 45: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.CASE, yycolumn, yyline, yytext());
            }
          case 104: break;
          case 46: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.BOOLEAN, yycolumn, yyline, yytext());
            }
          case 105: break;
          case 47: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.STEP, yycolumn, yyline, yytext());
            }
          case 106: break;
          case 48: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.ELIF, yycolumn, yyline, yytext());
            }
          case 107: break;
          case 49: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.ELSE, yycolumn, yyline, yytext());
            }
          case 108: break;
          case 50: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.MAIN, yycolumn, yyline, yytext());
            }
          case 109: break;
          case 51: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.UPTO, yycolumn, yyline, yytext());
            }
          case 110: break;
          case 52: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.VOID, yycolumn, yyline, yytext());
            }
          case 111: break;
          case 53: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.INPUT, yycolumn, yyline, yytext());
            }
          case 112: break;
          case 54: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.FLOAT, yycolumn, yyline, yytext());
            }
          case 113: break;
          case 55: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output); 
        return new Symbol(Sym.FALSE, yycolumn, yyline, yytext());
            }
          case 114: break;
          case 56: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.DOWNTO, yycolumn, yyline, yytext());
            }
          case 115: break;
          case 57: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output); 
        return new Symbol(Sym.OUTPUT, yycolumn, yyline, yytext());
            }
          case 116: break;
          case 58: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.OPTION, yycolumn, yyline, yytext());
            }
          case 117: break;
          case 59: 
            { String output= yytext() + " en ("+ yyline +","+ yycolumn+")";
        accum+= output +"\n";
        //System.out.println(output);
        return new Symbol(Sym.STRING, yycolumn, yyline, yytext());
            }
          case 118: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
