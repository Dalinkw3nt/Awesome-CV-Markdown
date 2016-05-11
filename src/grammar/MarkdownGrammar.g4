parser grammar MarkdownGrammar;

options {tokenVocab=MarkdownLexer;}
@members{
    public Data.Table table = new Data.Table();
    public Data.Info info = new Data.Info();
}
cv:info BLOCKSPLITTER NEWLINE+ (block BLOCKSPLITTER  NEWLINE+)+;

info:name subHeader+ address contacts+;
subHeader:(SHARP SHARP WORD+ NEWLINE);

name:SHARP WORD+{info.addName($WORD.text);} NEWLINE;

address: STAR any NEWLINE;
contacts: CLOSE_ANGLE_BRACKET icon any NEWLINE+;

block: blockName subBlock+;
subBlock: (blockSubName boldText?)? (blockList+|table|any);

blockList: STAR  any+ NEWLINE blockListCell*;
blockListCell: COLON icon? any? NEWLINE;

table: tableHeader NEWLINE tableBody;
tableBody: (tableLine NEWLINE)+;


icon locals[boolean allow=true]: OPEN_CURLY WORD STAR_CLASS?{String s=$STAR_CLASS.text; if(s!=null){String[] ints= s.split("/");float esquerda=Float.valueOf(ints[0].trim()); float direita=Float.valueOf(ints[1].trim()); if(esquerda>direita){System.err.println("Nr of stars cannot be bigger than total stars");$allow=false;}else $allow=true;}} {$allow}? CLOSE_CURLY;

boldText: TILT any+ NEWLINE+;
tableHeader: WORD+(HAT WORD+)+;
tableCell: tablecontent SPLIT ;
tableLine: tableCell+;
blockName: SHARP SHARP SHARP WORD+ NEWLINE+;
blockSubName: SHARP SHARP SHARP SHARP WORD+ NEWLINE+;

any: (WORD | INT| SYMBOL|ESCAPE )+;
tablecontent: (icon| any)+;