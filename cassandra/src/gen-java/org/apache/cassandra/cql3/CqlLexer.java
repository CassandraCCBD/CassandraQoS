// $ANTLR 3.2 Sep 23, 2009 12:02:23 /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g 2015-09-15 19:32:31

    package org.apache.cassandra.cql3;

    import org.apache.cassandra.exceptions.SyntaxException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CqlLexer extends Lexer {
    public static final int EXPONENT=132;
    public static final int K_PERMISSIONS=69;
    public static final int LETTER=130;
    public static final int K_INT=96;
    public static final int K_PERMISSION=70;
    public static final int K_CREATE=38;
    public static final int K_CLUSTERING=47;
    public static final int K_WRITETIME=16;
    public static final int K_INFINITY=84;
    public static final int K_EXISTS=27;
    public static final int EOF=-1;
    public static final int K_PRIMARY=43;
    public static final int K_AUTHORIZE=67;
    public static final int K_VALUES=24;
    public static final int K_USE=4;
    public static final int STRING_LITERAL=52;
    public static final int T__148=148;
    public static final int K_DISTINCT=6;
    public static final int K_GRANT=61;
    public static final int T__147=147;
    public static final int K_ON=51;
    public static final int T__149=149;
    public static final int K_USING=28;
    public static final int K_ADD=57;
    public static final int K_ASC=20;
    public static final int K_CUSTOM=48;
    public static final int K_KEY=44;
    public static final int K_TRUNCATE=60;
    public static final int COMMENT=134;
    public static final int T__150=150;
    public static final int T__151=151;
    public static final int K_ORDER=11;
    public static final int K_ALL=68;
    public static final int K_OF=64;
    public static final int T__152=152;
    public static final int HEXNUMBER=82;
    public static final int T__153=153;
    public static final int T__139=139;
    public static final int D=116;
    public static final int E=104;
    public static final int T__138=138;
    public static final int F=108;
    public static final int T__137=137;
    public static final int G=122;
    public static final int T__136=136;
    public static final int K_COUNT=7;
    public static final int K_KEYSPACE=39;
    public static final int K_TYPE=56;
    public static final int A=112;
    public static final int B=123;
    public static final int C=106;
    public static final int L=105;
    public static final int M=111;
    public static final int N=115;
    public static final int O=110;
    public static final int H=114;
    public static final int I=119;
    public static final int J=127;
    public static final int K_UPDATE=30;
    public static final int K=117;
    public static final int K_FILTERING=15;
    public static final int U=120;
    public static final int T=107;
    public static final int W=113;
    public static final int K_TEXT=97;
    public static final int V=125;
    public static final int Q=128;
    public static final int P=121;
    public static final int K_COMPACT=45;
    public static final int S=103;
    public static final int R=109;
    public static final int T__141=141;
    public static final int T__142=142;
    public static final int K_TTL=17;
    public static final int T__140=140;
    public static final int Y=118;
    public static final int T__145=145;
    public static final int X=124;
    public static final int T__146=146;
    public static final int T__143=143;
    public static final int Z=126;
    public static final int T__144=144;
    public static final int K_INDEX=49;
    public static final int K_INSERT=22;
    public static final int WS=133;
    public static final int K_NOT=26;
    public static final int K_RENAME=58;
    public static final int K_APPLY=37;
    public static final int K_INET=95;
    public static final int K_STORAGE=46;
    public static final int K_TIMESTAMP=29;
    public static final int K_NULL=85;
    public static final int K_AND=19;
    public static final int K_DESC=21;
    public static final int QMARK=78;
    public static final int K_TOKEN=86;
    public static final int K_BATCH=36;
    public static final int K_UUID=98;
    public static final int K_ASCII=88;
    public static final int UUID=81;
    public static final int K_LIST=63;
    public static final int K_DELETE=32;
    public static final int K_TO=59;
    public static final int K_BY=12;
    public static final int FLOAT=79;
    public static final int K_SUPERUSER=73;
    public static final int K_FLOAT=94;
    public static final int K_VARINT=100;
    public static final int K_DOUBLE=93;
    public static final int K_SELECT=5;
    public static final int K_LIMIT=13;
    public static final int K_ALTER=55;
    public static final int K_BOOLEAN=91;
    public static final int K_TRIGGER=53;
    public static final int K_SET=31;
    public static final int K_WHERE=10;
    public static final int QUOTED_NAME=77;
    public static final int MULTILINE_COMMENT=135;
    public static final int K_UNLOGGED=34;
    public static final int BOOLEAN=80;
    public static final int K_BLOB=90;
    public static final int K_INTO=23;
    public static final int HEX=131;
    public static final int K_PASSWORD=76;
    public static final int K_REVOKE=62;
    public static final int K_ALLOW=14;
    public static final int K_VARCHAR=99;
    public static final int IDENT=50;
    public static final int DIGIT=129;
    public static final int K_USERS=75;
    public static final int K_BEGIN=33;
    public static final int INTEGER=18;
    public static final int K_KEYSPACES=71;
    public static final int K_COUNTER=35;
    public static final int K_DECIMAL=92;
    public static final int K_WITH=40;
    public static final int K_IN=87;
    public static final int K_NORECURSIVE=65;
    public static final int K_MAP=102;
    public static final int K_IF=25;
    public static final int K_NAN=83;
    public static final int K_FROM=9;
    public static final int K_STATIC=42;
    public static final int K_COLUMNFAMILY=41;
    public static final int K_MODIFY=66;
    public static final int K_DROP=54;
    public static final int K_NOSUPERUSER=74;
    public static final int K_AS=8;
    public static final int K_BIGINT=89;
    public static final int K_TIMEUUID=101;
    public static final int K_USER=72;

        List<Token> tokens = new ArrayList<Token>();

        public void emit(Token token)
        {
            state.token = token;
            tokens.add(token);
        }

        public Token nextToken()
        {
            super.nextToken();
            if (tokens.size() == 0)
                return Token.EOF_TOKEN;
            return tokens.remove(0);
        }

        private List<String> recognitionErrors = new ArrayList<String>();

        public void displayRecognitionError(String[] tokenNames, RecognitionException e)
        {
            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);
            recognitionErrors.add(hdr + " " + msg);
        }

        public List<String> getRecognitionErrors()
        {
            return recognitionErrors;
        }

        public void throwLastRecognitionError() throws SyntaxException
        {
            if (recognitionErrors.size() > 0)
                throw new SyntaxException(recognitionErrors.get((recognitionErrors.size()-1)));
        }


    // delegates
    // delegators

    public CqlLexer() {;} 
    public CqlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CqlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g"; }

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:50:8: ( ';' )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:50:10: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:51:8: ( '(' )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:51:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:52:8: ( ')' )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:52:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:53:8: ( ',' )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:53:10: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:54:8: ( '\\*' )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:54:10: '\\*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:55:8: ( '[' )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:55:10: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:56:8: ( ']' )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:56:10: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "T__143"
    public final void mT__143() throws RecognitionException {
        try {
            int _type = T__143;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:57:8: ( '.' )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:57:10: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__143"

    // $ANTLR start "T__144"
    public final void mT__144() throws RecognitionException {
        try {
            int _type = T__144;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:58:8: ( '-' )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:58:10: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__144"

    // $ANTLR start "T__145"
    public final void mT__145() throws RecognitionException {
        try {
            int _type = T__145;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:59:8: ( '{' )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:59:10: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__145"

    // $ANTLR start "T__146"
    public final void mT__146() throws RecognitionException {
        try {
            int _type = T__146;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:60:8: ( ':' )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:60:10: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__146"

    // $ANTLR start "T__147"
    public final void mT__147() throws RecognitionException {
        try {
            int _type = T__147;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:61:8: ( '}' )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:61:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__147"

    // $ANTLR start "T__148"
    public final void mT__148() throws RecognitionException {
        try {
            int _type = T__148;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:62:8: ( '=' )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:62:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__148"

    // $ANTLR start "T__149"
    public final void mT__149() throws RecognitionException {
        try {
            int _type = T__149;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:63:8: ( '+' )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:63:10: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__149"

    // $ANTLR start "T__150"
    public final void mT__150() throws RecognitionException {
        try {
            int _type = T__150;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:64:8: ( '<' )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:64:10: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__150"

    // $ANTLR start "T__151"
    public final void mT__151() throws RecognitionException {
        try {
            int _type = T__151;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:65:8: ( '<=' )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:65:10: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__151"

    // $ANTLR start "T__152"
    public final void mT__152() throws RecognitionException {
        try {
            int _type = T__152;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:66:8: ( '>' )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:66:10: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__152"

    // $ANTLR start "T__153"
    public final void mT__153() throws RecognitionException {
        try {
            int _type = T__153;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:67:8: ( '>=' )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:67:10: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__153"

    // $ANTLR start "K_SELECT"
    public final void mK_SELECT() throws RecognitionException {
        try {
            int _type = K_SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1073:9: ( S E L E C T )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1073:16: S E L E C T
            {
            mS(); 
            mE(); 
            mL(); 
            mE(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_SELECT"

    // $ANTLR start "K_FROM"
    public final void mK_FROM() throws RecognitionException {
        try {
            int _type = K_FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1074:7: ( F R O M )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1074:16: F R O M
            {
            mF(); 
            mR(); 
            mO(); 
            mM(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_FROM"

    // $ANTLR start "K_AS"
    public final void mK_AS() throws RecognitionException {
        try {
            int _type = K_AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1075:5: ( A S )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1075:16: A S
            {
            mA(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_AS"

    // $ANTLR start "K_WHERE"
    public final void mK_WHERE() throws RecognitionException {
        try {
            int _type = K_WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1076:8: ( W H E R E )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1076:16: W H E R E
            {
            mW(); 
            mH(); 
            mE(); 
            mR(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_WHERE"

    // $ANTLR start "K_AND"
    public final void mK_AND() throws RecognitionException {
        try {
            int _type = K_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1077:6: ( A N D )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1077:16: A N D
            {
            mA(); 
            mN(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_AND"

    // $ANTLR start "K_KEY"
    public final void mK_KEY() throws RecognitionException {
        try {
            int _type = K_KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1078:6: ( K E Y )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1078:16: K E Y
            {
            mK(); 
            mE(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_KEY"

    // $ANTLR start "K_INSERT"
    public final void mK_INSERT() throws RecognitionException {
        try {
            int _type = K_INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1079:9: ( I N S E R T )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1079:16: I N S E R T
            {
            mI(); 
            mN(); 
            mS(); 
            mE(); 
            mR(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_INSERT"

    // $ANTLR start "K_UPDATE"
    public final void mK_UPDATE() throws RecognitionException {
        try {
            int _type = K_UPDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1080:9: ( U P D A T E )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1080:16: U P D A T E
            {
            mU(); 
            mP(); 
            mD(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_UPDATE"

    // $ANTLR start "K_WITH"
    public final void mK_WITH() throws RecognitionException {
        try {
            int _type = K_WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1081:7: ( W I T H )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1081:16: W I T H
            {
            mW(); 
            mI(); 
            mT(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_WITH"

    // $ANTLR start "K_LIMIT"
    public final void mK_LIMIT() throws RecognitionException {
        try {
            int _type = K_LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1082:8: ( L I M I T )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1082:16: L I M I T
            {
            mL(); 
            mI(); 
            mM(); 
            mI(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_LIMIT"

    // $ANTLR start "K_USING"
    public final void mK_USING() throws RecognitionException {
        try {
            int _type = K_USING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1083:8: ( U S I N G )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1083:16: U S I N G
            {
            mU(); 
            mS(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_USING"

    // $ANTLR start "K_USE"
    public final void mK_USE() throws RecognitionException {
        try {
            int _type = K_USE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1084:6: ( U S E )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1084:16: U S E
            {
            mU(); 
            mS(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_USE"

    // $ANTLR start "K_DISTINCT"
    public final void mK_DISTINCT() throws RecognitionException {
        try {
            int _type = K_DISTINCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1085:11: ( D I S T I N C T )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1085:16: D I S T I N C T
            {
            mD(); 
            mI(); 
            mS(); 
            mT(); 
            mI(); 
            mN(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_DISTINCT"

    // $ANTLR start "K_COUNT"
    public final void mK_COUNT() throws RecognitionException {
        try {
            int _type = K_COUNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1086:8: ( C O U N T )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1086:16: C O U N T
            {
            mC(); 
            mO(); 
            mU(); 
            mN(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_COUNT"

    // $ANTLR start "K_SET"
    public final void mK_SET() throws RecognitionException {
        try {
            int _type = K_SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1087:6: ( S E T )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1087:16: S E T
            {
            mS(); 
            mE(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_SET"

    // $ANTLR start "K_BEGIN"
    public final void mK_BEGIN() throws RecognitionException {
        try {
            int _type = K_BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1088:8: ( B E G I N )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1088:16: B E G I N
            {
            mB(); 
            mE(); 
            mG(); 
            mI(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_BEGIN"

    // $ANTLR start "K_UNLOGGED"
    public final void mK_UNLOGGED() throws RecognitionException {
        try {
            int _type = K_UNLOGGED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1089:11: ( U N L O G G E D )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1089:16: U N L O G G E D
            {
            mU(); 
            mN(); 
            mL(); 
            mO(); 
            mG(); 
            mG(); 
            mE(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_UNLOGGED"

    // $ANTLR start "K_BATCH"
    public final void mK_BATCH() throws RecognitionException {
        try {
            int _type = K_BATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1090:8: ( B A T C H )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1090:16: B A T C H
            {
            mB(); 
            mA(); 
            mT(); 
            mC(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_BATCH"

    // $ANTLR start "K_APPLY"
    public final void mK_APPLY() throws RecognitionException {
        try {
            int _type = K_APPLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1091:8: ( A P P L Y )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1091:16: A P P L Y
            {
            mA(); 
            mP(); 
            mP(); 
            mL(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_APPLY"

    // $ANTLR start "K_TRUNCATE"
    public final void mK_TRUNCATE() throws RecognitionException {
        try {
            int _type = K_TRUNCATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1092:11: ( T R U N C A T E )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1092:16: T R U N C A T E
            {
            mT(); 
            mR(); 
            mU(); 
            mN(); 
            mC(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_TRUNCATE"

    // $ANTLR start "K_DELETE"
    public final void mK_DELETE() throws RecognitionException {
        try {
            int _type = K_DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1093:9: ( D E L E T E )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1093:16: D E L E T E
            {
            mD(); 
            mE(); 
            mL(); 
            mE(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_DELETE"

    // $ANTLR start "K_IN"
    public final void mK_IN() throws RecognitionException {
        try {
            int _type = K_IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1094:5: ( I N )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1094:16: I N
            {
            mI(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_IN"

    // $ANTLR start "K_CREATE"
    public final void mK_CREATE() throws RecognitionException {
        try {
            int _type = K_CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1095:9: ( C R E A T E )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1095:16: C R E A T E
            {
            mC(); 
            mR(); 
            mE(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_CREATE"

    // $ANTLR start "K_KEYSPACE"
    public final void mK_KEYSPACE() throws RecognitionException {
        try {
            int _type = K_KEYSPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1096:11: ( ( K E Y S P A C E | S C H E M A ) )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1096:16: ( K E Y S P A C E | S C H E M A )
            {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1096:16: ( K E Y S P A C E | S C H E M A )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='K'||LA1_0=='k') ) {
                alt1=1;
            }
            else if ( (LA1_0=='S'||LA1_0=='s') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1096:18: K E Y S P A C E
                    {
                    mK(); 
                    mE(); 
                    mY(); 
                    mS(); 
                    mP(); 
                    mA(); 
                    mC(); 
                    mE(); 

                    }
                    break;
                case 2 :
                    // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1097:20: S C H E M A
                    {
                    mS(); 
                    mC(); 
                    mH(); 
                    mE(); 
                    mM(); 
                    mA(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_KEYSPACE"

    // $ANTLR start "K_KEYSPACES"
    public final void mK_KEYSPACES() throws RecognitionException {
        try {
            int _type = K_KEYSPACES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1098:12: ( K E Y S P A C E S )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1098:16: K E Y S P A C E S
            {
            mK(); 
            mE(); 
            mY(); 
            mS(); 
            mP(); 
            mA(); 
            mC(); 
            mE(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_KEYSPACES"

    // $ANTLR start "K_COLUMNFAMILY"
    public final void mK_COLUMNFAMILY() throws RecognitionException {
        try {
            int _type = K_COLUMNFAMILY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1099:15: ( ( C O L U M N F A M I L Y | T A B L E ) )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1099:16: ( C O L U M N F A M I L Y | T A B L E )
            {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1099:16: ( C O L U M N F A M I L Y | T A B L E )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='C'||LA2_0=='c') ) {
                alt2=1;
            }
            else if ( (LA2_0=='T'||LA2_0=='t') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1099:18: C O L U M N F A M I L Y
                    {
                    mC(); 
                    mO(); 
                    mL(); 
                    mU(); 
                    mM(); 
                    mN(); 
                    mF(); 
                    mA(); 
                    mM(); 
                    mI(); 
                    mL(); 
                    mY(); 

                    }
                    break;
                case 2 :
                    // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1100:20: T A B L E
                    {
                    mT(); 
                    mA(); 
                    mB(); 
                    mL(); 
                    mE(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_COLUMNFAMILY"

    // $ANTLR start "K_INDEX"
    public final void mK_INDEX() throws RecognitionException {
        try {
            int _type = K_INDEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1101:8: ( I N D E X )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1101:16: I N D E X
            {
            mI(); 
            mN(); 
            mD(); 
            mE(); 
            mX(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_INDEX"

    // $ANTLR start "K_CUSTOM"
    public final void mK_CUSTOM() throws RecognitionException {
        try {
            int _type = K_CUSTOM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1102:9: ( C U S T O M )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1102:16: C U S T O M
            {
            mC(); 
            mU(); 
            mS(); 
            mT(); 
            mO(); 
            mM(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_CUSTOM"

    // $ANTLR start "K_ON"
    public final void mK_ON() throws RecognitionException {
        try {
            int _type = K_ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1103:5: ( O N )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1103:16: O N
            {
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_ON"

    // $ANTLR start "K_TO"
    public final void mK_TO() throws RecognitionException {
        try {
            int _type = K_TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1104:5: ( T O )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1104:16: T O
            {
            mT(); 
            mO(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_TO"

    // $ANTLR start "K_DROP"
    public final void mK_DROP() throws RecognitionException {
        try {
            int _type = K_DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1105:7: ( D R O P )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1105:16: D R O P
            {
            mD(); 
            mR(); 
            mO(); 
            mP(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_DROP"

    // $ANTLR start "K_PRIMARY"
    public final void mK_PRIMARY() throws RecognitionException {
        try {
            int _type = K_PRIMARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1106:10: ( P R I M A R Y )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1106:16: P R I M A R Y
            {
            mP(); 
            mR(); 
            mI(); 
            mM(); 
            mA(); 
            mR(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_PRIMARY"

    // $ANTLR start "K_INTO"
    public final void mK_INTO() throws RecognitionException {
        try {
            int _type = K_INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1107:7: ( I N T O )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1107:16: I N T O
            {
            mI(); 
            mN(); 
            mT(); 
            mO(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_INTO"

    // $ANTLR start "K_VALUES"
    public final void mK_VALUES() throws RecognitionException {
        try {
            int _type = K_VALUES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1108:9: ( V A L U E S )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1108:16: V A L U E S
            {
            mV(); 
            mA(); 
            mL(); 
            mU(); 
            mE(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_VALUES"

    // $ANTLR start "K_TIMESTAMP"
    public final void mK_TIMESTAMP() throws RecognitionException {
        try {
            int _type = K_TIMESTAMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1109:12: ( T I M E S T A M P )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1109:16: T I M E S T A M P
            {
            mT(); 
            mI(); 
            mM(); 
            mE(); 
            mS(); 
            mT(); 
            mA(); 
            mM(); 
            mP(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_TIMESTAMP"

    // $ANTLR start "K_TTL"
    public final void mK_TTL() throws RecognitionException {
        try {
            int _type = K_TTL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1110:6: ( T T L )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1110:16: T T L
            {
            mT(); 
            mT(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_TTL"

    // $ANTLR start "K_ALTER"
    public final void mK_ALTER() throws RecognitionException {
        try {
            int _type = K_ALTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1111:8: ( A L T E R )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1111:16: A L T E R
            {
            mA(); 
            mL(); 
            mT(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_ALTER"

    // $ANTLR start "K_RENAME"
    public final void mK_RENAME() throws RecognitionException {
        try {
            int _type = K_RENAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1112:9: ( R E N A M E )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1112:16: R E N A M E
            {
            mR(); 
            mE(); 
            mN(); 
            mA(); 
            mM(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_RENAME"

    // $ANTLR start "K_ADD"
    public final void mK_ADD() throws RecognitionException {
        try {
            int _type = K_ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1113:6: ( A D D )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1113:16: A D D
            {
            mA(); 
            mD(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_ADD"

    // $ANTLR start "K_TYPE"
    public final void mK_TYPE() throws RecognitionException {
        try {
            int _type = K_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1114:7: ( T Y P E )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1114:16: T Y P E
            {
            mT(); 
            mY(); 
            mP(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_TYPE"

    // $ANTLR start "K_COMPACT"
    public final void mK_COMPACT() throws RecognitionException {
        try {
            int _type = K_COMPACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1115:10: ( C O M P A C T )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1115:16: C O M P A C T
            {
            mC(); 
            mO(); 
            mM(); 
            mP(); 
            mA(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_COMPACT"

    // $ANTLR start "K_STORAGE"
    public final void mK_STORAGE() throws RecognitionException {
        try {
            int _type = K_STORAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1116:10: ( S T O R A G E )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1116:16: S T O R A G E
            {
            mS(); 
            mT(); 
            mO(); 
            mR(); 
            mA(); 
            mG(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_STORAGE"

    // $ANTLR start "K_ORDER"
    public final void mK_ORDER() throws RecognitionException {
        try {
            int _type = K_ORDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1117:8: ( O R D E R )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1117:16: O R D E R
            {
            mO(); 
            mR(); 
            mD(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_ORDER"

    // $ANTLR start "K_BY"
    public final void mK_BY() throws RecognitionException {
        try {
            int _type = K_BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1118:5: ( B Y )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1118:16: B Y
            {
            mB(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_BY"

    // $ANTLR start "K_ASC"
    public final void mK_ASC() throws RecognitionException {
        try {
            int _type = K_ASC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1119:6: ( A S C )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1119:16: A S C
            {
            mA(); 
            mS(); 
            mC(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_ASC"

    // $ANTLR start "K_DESC"
    public final void mK_DESC() throws RecognitionException {
        try {
            int _type = K_DESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1120:7: ( D E S C )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1120:16: D E S C
            {
            mD(); 
            mE(); 
            mS(); 
            mC(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_DESC"

    // $ANTLR start "K_ALLOW"
    public final void mK_ALLOW() throws RecognitionException {
        try {
            int _type = K_ALLOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1121:8: ( A L L O W )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1121:16: A L L O W
            {
            mA(); 
            mL(); 
            mL(); 
            mO(); 
            mW(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_ALLOW"

    // $ANTLR start "K_FILTERING"
    public final void mK_FILTERING() throws RecognitionException {
        try {
            int _type = K_FILTERING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1122:12: ( F I L T E R I N G )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1122:16: F I L T E R I N G
            {
            mF(); 
            mI(); 
            mL(); 
            mT(); 
            mE(); 
            mR(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_FILTERING"

    // $ANTLR start "K_IF"
    public final void mK_IF() throws RecognitionException {
        try {
            int _type = K_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1123:5: ( I F )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1123:16: I F
            {
            mI(); 
            mF(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_IF"

    // $ANTLR start "K_GRANT"
    public final void mK_GRANT() throws RecognitionException {
        try {
            int _type = K_GRANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1125:8: ( G R A N T )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1125:16: G R A N T
            {
            mG(); 
            mR(); 
            mA(); 
            mN(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_GRANT"

    // $ANTLR start "K_ALL"
    public final void mK_ALL() throws RecognitionException {
        try {
            int _type = K_ALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1126:6: ( A L L )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1126:16: A L L
            {
            mA(); 
            mL(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_ALL"

    // $ANTLR start "K_PERMISSION"
    public final void mK_PERMISSION() throws RecognitionException {
        try {
            int _type = K_PERMISSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1127:13: ( P E R M I S S I O N )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1127:16: P E R M I S S I O N
            {
            mP(); 
            mE(); 
            mR(); 
            mM(); 
            mI(); 
            mS(); 
            mS(); 
            mI(); 
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_PERMISSION"

    // $ANTLR start "K_PERMISSIONS"
    public final void mK_PERMISSIONS() throws RecognitionException {
        try {
            int _type = K_PERMISSIONS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1128:14: ( P E R M I S S I O N S )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1128:16: P E R M I S S I O N S
            {
            mP(); 
            mE(); 
            mR(); 
            mM(); 
            mI(); 
            mS(); 
            mS(); 
            mI(); 
            mO(); 
            mN(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_PERMISSIONS"

    // $ANTLR start "K_OF"
    public final void mK_OF() throws RecognitionException {
        try {
            int _type = K_OF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1129:5: ( O F )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1129:16: O F
            {
            mO(); 
            mF(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_OF"

    // $ANTLR start "K_REVOKE"
    public final void mK_REVOKE() throws RecognitionException {
        try {
            int _type = K_REVOKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1130:9: ( R E V O K E )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1130:16: R E V O K E
            {
            mR(); 
            mE(); 
            mV(); 
            mO(); 
            mK(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_REVOKE"

    // $ANTLR start "K_MODIFY"
    public final void mK_MODIFY() throws RecognitionException {
        try {
            int _type = K_MODIFY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1131:9: ( M O D I F Y )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1131:16: M O D I F Y
            {
            mM(); 
            mO(); 
            mD(); 
            mI(); 
            mF(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_MODIFY"

    // $ANTLR start "K_AUTHORIZE"
    public final void mK_AUTHORIZE() throws RecognitionException {
        try {
            int _type = K_AUTHORIZE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1132:12: ( A U T H O R I Z E )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1132:16: A U T H O R I Z E
            {
            mA(); 
            mU(); 
            mT(); 
            mH(); 
            mO(); 
            mR(); 
            mI(); 
            mZ(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_AUTHORIZE"

    // $ANTLR start "K_NORECURSIVE"
    public final void mK_NORECURSIVE() throws RecognitionException {
        try {
            int _type = K_NORECURSIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1133:14: ( N O R E C U R S I V E )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1133:16: N O R E C U R S I V E
            {
            mN(); 
            mO(); 
            mR(); 
            mE(); 
            mC(); 
            mU(); 
            mR(); 
            mS(); 
            mI(); 
            mV(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_NORECURSIVE"

    // $ANTLR start "K_USER"
    public final void mK_USER() throws RecognitionException {
        try {
            int _type = K_USER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1135:7: ( U S E R )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1135:16: U S E R
            {
            mU(); 
            mS(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_USER"

    // $ANTLR start "K_USERS"
    public final void mK_USERS() throws RecognitionException {
        try {
            int _type = K_USERS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1136:8: ( U S E R S )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1136:16: U S E R S
            {
            mU(); 
            mS(); 
            mE(); 
            mR(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_USERS"

    // $ANTLR start "K_SUPERUSER"
    public final void mK_SUPERUSER() throws RecognitionException {
        try {
            int _type = K_SUPERUSER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1137:12: ( S U P E R U S E R )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1137:16: S U P E R U S E R
            {
            mS(); 
            mU(); 
            mP(); 
            mE(); 
            mR(); 
            mU(); 
            mS(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_SUPERUSER"

    // $ANTLR start "K_NOSUPERUSER"
    public final void mK_NOSUPERUSER() throws RecognitionException {
        try {
            int _type = K_NOSUPERUSER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1138:14: ( N O S U P E R U S E R )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1138:16: N O S U P E R U S E R
            {
            mN(); 
            mO(); 
            mS(); 
            mU(); 
            mP(); 
            mE(); 
            mR(); 
            mU(); 
            mS(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_NOSUPERUSER"

    // $ANTLR start "K_PASSWORD"
    public final void mK_PASSWORD() throws RecognitionException {
        try {
            int _type = K_PASSWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1139:11: ( P A S S W O R D )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1139:16: P A S S W O R D
            {
            mP(); 
            mA(); 
            mS(); 
            mS(); 
            mW(); 
            mO(); 
            mR(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_PASSWORD"

    // $ANTLR start "K_CLUSTERING"
    public final void mK_CLUSTERING() throws RecognitionException {
        try {
            int _type = K_CLUSTERING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1141:13: ( C L U S T E R I N G )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1141:16: C L U S T E R I N G
            {
            mC(); 
            mL(); 
            mU(); 
            mS(); 
            mT(); 
            mE(); 
            mR(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_CLUSTERING"

    // $ANTLR start "K_ASCII"
    public final void mK_ASCII() throws RecognitionException {
        try {
            int _type = K_ASCII;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1142:8: ( A S C I I )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1142:16: A S C I I
            {
            mA(); 
            mS(); 
            mC(); 
            mI(); 
            mI(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_ASCII"

    // $ANTLR start "K_BIGINT"
    public final void mK_BIGINT() throws RecognitionException {
        try {
            int _type = K_BIGINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1143:9: ( B I G I N T )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1143:16: B I G I N T
            {
            mB(); 
            mI(); 
            mG(); 
            mI(); 
            mN(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_BIGINT"

    // $ANTLR start "K_BLOB"
    public final void mK_BLOB() throws RecognitionException {
        try {
            int _type = K_BLOB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1144:7: ( B L O B )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1144:16: B L O B
            {
            mB(); 
            mL(); 
            mO(); 
            mB(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_BLOB"

    // $ANTLR start "K_BOOLEAN"
    public final void mK_BOOLEAN() throws RecognitionException {
        try {
            int _type = K_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1145:10: ( B O O L E A N )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1145:16: B O O L E A N
            {
            mB(); 
            mO(); 
            mO(); 
            mL(); 
            mE(); 
            mA(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_BOOLEAN"

    // $ANTLR start "K_COUNTER"
    public final void mK_COUNTER() throws RecognitionException {
        try {
            int _type = K_COUNTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1146:10: ( C O U N T E R )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1146:16: C O U N T E R
            {
            mC(); 
            mO(); 
            mU(); 
            mN(); 
            mT(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_COUNTER"

    // $ANTLR start "K_DECIMAL"
    public final void mK_DECIMAL() throws RecognitionException {
        try {
            int _type = K_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1147:10: ( D E C I M A L )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1147:16: D E C I M A L
            {
            mD(); 
            mE(); 
            mC(); 
            mI(); 
            mM(); 
            mA(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_DECIMAL"

    // $ANTLR start "K_DOUBLE"
    public final void mK_DOUBLE() throws RecognitionException {
        try {
            int _type = K_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1148:9: ( D O U B L E )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1148:16: D O U B L E
            {
            mD(); 
            mO(); 
            mU(); 
            mB(); 
            mL(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_DOUBLE"

    // $ANTLR start "K_FLOAT"
    public final void mK_FLOAT() throws RecognitionException {
        try {
            int _type = K_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1149:8: ( F L O A T )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1149:16: F L O A T
            {
            mF(); 
            mL(); 
            mO(); 
            mA(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_FLOAT"

    // $ANTLR start "K_INET"
    public final void mK_INET() throws RecognitionException {
        try {
            int _type = K_INET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1150:7: ( I N E T )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1150:16: I N E T
            {
            mI(); 
            mN(); 
            mE(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_INET"

    // $ANTLR start "K_INT"
    public final void mK_INT() throws RecognitionException {
        try {
            int _type = K_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1151:6: ( I N T )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1151:16: I N T
            {
            mI(); 
            mN(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_INT"

    // $ANTLR start "K_TEXT"
    public final void mK_TEXT() throws RecognitionException {
        try {
            int _type = K_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1152:7: ( T E X T )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1152:16: T E X T
            {
            mT(); 
            mE(); 
            mX(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_TEXT"

    // $ANTLR start "K_UUID"
    public final void mK_UUID() throws RecognitionException {
        try {
            int _type = K_UUID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1153:7: ( U U I D )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1153:16: U U I D
            {
            mU(); 
            mU(); 
            mI(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_UUID"

    // $ANTLR start "K_VARCHAR"
    public final void mK_VARCHAR() throws RecognitionException {
        try {
            int _type = K_VARCHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1154:10: ( V A R C H A R )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1154:16: V A R C H A R
            {
            mV(); 
            mA(); 
            mR(); 
            mC(); 
            mH(); 
            mA(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_VARCHAR"

    // $ANTLR start "K_VARINT"
    public final void mK_VARINT() throws RecognitionException {
        try {
            int _type = K_VARINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1155:9: ( V A R I N T )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1155:16: V A R I N T
            {
            mV(); 
            mA(); 
            mR(); 
            mI(); 
            mN(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_VARINT"

    // $ANTLR start "K_TIMEUUID"
    public final void mK_TIMEUUID() throws RecognitionException {
        try {
            int _type = K_TIMEUUID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1156:11: ( T I M E U U I D )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1156:16: T I M E U U I D
            {
            mT(); 
            mI(); 
            mM(); 
            mE(); 
            mU(); 
            mU(); 
            mI(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_TIMEUUID"

    // $ANTLR start "K_TOKEN"
    public final void mK_TOKEN() throws RecognitionException {
        try {
            int _type = K_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1157:8: ( T O K E N )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1157:16: T O K E N
            {
            mT(); 
            mO(); 
            mK(); 
            mE(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_TOKEN"

    // $ANTLR start "K_WRITETIME"
    public final void mK_WRITETIME() throws RecognitionException {
        try {
            int _type = K_WRITETIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1158:12: ( W R I T E T I M E )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1158:16: W R I T E T I M E
            {
            mW(); 
            mR(); 
            mI(); 
            mT(); 
            mE(); 
            mT(); 
            mI(); 
            mM(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_WRITETIME"

    // $ANTLR start "K_NULL"
    public final void mK_NULL() throws RecognitionException {
        try {
            int _type = K_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1160:7: ( N U L L )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1160:16: N U L L
            {
            mN(); 
            mU(); 
            mL(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_NULL"

    // $ANTLR start "K_NOT"
    public final void mK_NOT() throws RecognitionException {
        try {
            int _type = K_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1161:6: ( N O T )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1161:16: N O T
            {
            mN(); 
            mO(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_NOT"

    // $ANTLR start "K_EXISTS"
    public final void mK_EXISTS() throws RecognitionException {
        try {
            int _type = K_EXISTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1162:9: ( E X I S T S )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1162:16: E X I S T S
            {
            mE(); 
            mX(); 
            mI(); 
            mS(); 
            mT(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_EXISTS"

    // $ANTLR start "K_MAP"
    public final void mK_MAP() throws RecognitionException {
        try {
            int _type = K_MAP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1164:6: ( M A P )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1164:16: M A P
            {
            mM(); 
            mA(); 
            mP(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_MAP"

    // $ANTLR start "K_LIST"
    public final void mK_LIST() throws RecognitionException {
        try {
            int _type = K_LIST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1165:7: ( L I S T )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1165:16: L I S T
            {
            mL(); 
            mI(); 
            mS(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_LIST"

    // $ANTLR start "K_NAN"
    public final void mK_NAN() throws RecognitionException {
        try {
            int _type = K_NAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1166:6: ( N A N )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1166:16: N A N
            {
            mN(); 
            mA(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_NAN"

    // $ANTLR start "K_INFINITY"
    public final void mK_INFINITY() throws RecognitionException {
        try {
            int _type = K_INFINITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1167:11: ( I N F I N I T Y )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1167:16: I N F I N I T Y
            {
            mI(); 
            mN(); 
            mF(); 
            mI(); 
            mN(); 
            mI(); 
            mT(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_INFINITY"

    // $ANTLR start "K_TRIGGER"
    public final void mK_TRIGGER() throws RecognitionException {
        try {
            int _type = K_TRIGGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1169:10: ( T R I G G E R )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1169:16: T R I G G E R
            {
            mT(); 
            mR(); 
            mI(); 
            mG(); 
            mG(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_TRIGGER"

    // $ANTLR start "K_STATIC"
    public final void mK_STATIC() throws RecognitionException {
        try {
            int _type = K_STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1170:9: ( S T A T I C )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1170:16: S T A T I C
            {
            mS(); 
            mT(); 
            mA(); 
            mT(); 
            mI(); 
            mC(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_STATIC"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1173:11: ( ( 'a' | 'A' ) )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1173:13: ( 'a' | 'A' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "B"
    public final void mB() throws RecognitionException {
        try {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1174:11: ( ( 'b' | 'B' ) )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1174:13: ( 'b' | 'B' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "B"

    // $ANTLR start "C"
    public final void mC() throws RecognitionException {
        try {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1175:11: ( ( 'c' | 'C' ) )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1175:13: ( 'c' | 'C' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "C"

    // $ANTLR start "D"
    public final void mD() throws RecognitionException {
        try {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1176:11: ( ( 'd' | 'D' ) )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1176:13: ( 'd' | 'D' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "D"

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1177:11: ( ( 'e' | 'E' ) )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1177:13: ( 'e' | 'E' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "E"

    // $ANTLR start "F"
    public final void mF() throws RecognitionException {
        try {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1178:11: ( ( 'f' | 'F' ) )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1178:13: ( 'f' | 'F' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "F"

    // $ANTLR start "G"
    public final void mG() throws RecognitionException {
        try {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1179:11: ( ( 'g' | 'G' ) )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1179:13: ( 'g' | 'G' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "G"

    // $ANTLR start "H"
    public final void mH() throws RecognitionException {
        try {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1180:11: ( ( 'h' | 'H' ) )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1180:13: ( 'h' | 'H' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "H"

    // $ANTLR start "I"
    public final void mI() throws RecognitionException {
        try {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1181:11: ( ( 'i' | 'I' ) )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1181:13: ( 'i' | 'I' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "I"

    // $ANTLR start "J"
    public final void mJ() throws RecognitionException {
        try {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1182:11: ( ( 'j' | 'J' ) )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1182:13: ( 'j' | 'J' )
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "J"

    // $ANTLR start "K"
    public final void mK() throws RecognitionException {
        try {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1183:11: ( ( 'k' | 'K' ) )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1183:13: ( 'k' | 'K' )
            {
            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "K"

    // $ANTLR start "L"
    public final void mL() throws RecognitionException {
        try {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1184:11: ( ( 'l' | 'L' ) )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1184:13: ( 'l' | 'L' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "L"

    // $ANTLR start "M"
    public final void mM() throws RecognitionException {
        try {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1185:11: ( ( 'm' | 'M' ) )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1185:13: ( 'm' | 'M' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "M"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1186:11: ( ( 'n' | 'N' ) )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1186:13: ( 'n' | 'N' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "O"
    public final void mO() throws RecognitionException {
        try {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1187:11: ( ( 'o' | 'O' ) )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1187:13: ( 'o' | 'O' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "O"

    // $ANTLR start "P"
    public final void mP() throws RecognitionException {
        try {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1188:11: ( ( 'p' | 'P' ) )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1188:13: ( 'p' | 'P' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "P"

    // $ANTLR start "Q"
    public final void mQ() throws RecognitionException {
        try {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1189:11: ( ( 'q' | 'Q' ) )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1189:13: ( 'q' | 'Q' )
            {
            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Q"

    // $ANTLR start "R"
    public final void mR() throws RecognitionException {
        try {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1190:11: ( ( 'r' | 'R' ) )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1190:13: ( 'r' | 'R' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "R"

    // $ANTLR start "S"
    public final void mS() throws RecognitionException {
        try {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1191:11: ( ( 's' | 'S' ) )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1191:13: ( 's' | 'S' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "S"

    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1192:11: ( ( 't' | 'T' ) )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1192:13: ( 't' | 'T' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "T"

    // $ANTLR start "U"
    public final void mU() throws RecognitionException {
        try {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1193:11: ( ( 'u' | 'U' ) )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1193:13: ( 'u' | 'U' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "U"

    // $ANTLR start "V"
    public final void mV() throws RecognitionException {
        try {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1194:11: ( ( 'v' | 'V' ) )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1194:13: ( 'v' | 'V' )
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "V"

    // $ANTLR start "W"
    public final void mW() throws RecognitionException {
        try {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1195:11: ( ( 'w' | 'W' ) )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1195:13: ( 'w' | 'W' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "W"

    // $ANTLR start "X"
    public final void mX() throws RecognitionException {
        try {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1196:11: ( ( 'x' | 'X' ) )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1196:13: ( 'x' | 'X' )
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "X"

    // $ANTLR start "Y"
    public final void mY() throws RecognitionException {
        try {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1197:11: ( ( 'y' | 'Y' ) )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1197:13: ( 'y' | 'Y' )
            {
            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Y"

    // $ANTLR start "Z"
    public final void mZ() throws RecognitionException {
        try {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1198:11: ( ( 'z' | 'Z' ) )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1198:13: ( 'z' | 'Z' )
            {
            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Z"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            int c;

             StringBuilder b = new StringBuilder(); 
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1203:5: ( '\\'' (c=~ ( '\\'' ) | '\\'' '\\'' )* '\\'' )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1203:7: '\\'' (c=~ ( '\\'' ) | '\\'' '\\'' )* '\\''
            {
            match('\''); 
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1203:12: (c=~ ( '\\'' ) | '\\'' '\\'' )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\'') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='\'') ) {
                        alt3=2;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1203:13: c=~ ( '\\'' )
            	    {
            	    c= input.LA(1);
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}

            	     b.appendCodePoint(c);

            	    }
            	    break;
            	case 2 :
            	    // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1203:50: '\\'' '\\''
            	    {
            	    match('\''); 
            	    match('\''); 
            	     b.appendCodePoint('\''); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
             setText(b.toString());     }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "QUOTED_NAME"
    public final void mQUOTED_NAME() throws RecognitionException {
        try {
            int _type = QUOTED_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            int c;

             StringBuilder b = new StringBuilder(); 
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1209:5: ( '\\\"' (c=~ ( '\\\"' ) | '\\\"' '\\\"' )+ '\\\"' )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1209:7: '\\\"' (c=~ ( '\\\"' ) | '\\\"' '\\\"' )+ '\\\"'
            {
            match('\"'); 
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1209:12: (c=~ ( '\\\"' ) | '\\\"' '\\\"' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\"') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='\"') ) {
                        alt4=2;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1209:13: c=~ ( '\\\"' )
            	    {
            	    c= input.LA(1);
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}

            	     b.appendCodePoint(c); 

            	    }
            	    break;
            	case 2 :
            	    // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1209:51: '\\\"' '\\\"'
            	    {
            	    match('\"'); 
            	    match('\"'); 
            	     b.appendCodePoint('\"'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
             setText(b.toString());     }
        finally {
        }
    }
    // $ANTLR end "QUOTED_NAME"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1213:5: ( '0' .. '9' )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1213:7: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1217:5: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1217:7: ( 'A' .. 'Z' | 'a' .. 'z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "HEX"
    public final void mHEX() throws RecognitionException {
        try {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1221:5: ( ( 'A' .. 'F' | 'a' .. 'f' | '0' .. '9' ) )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1221:7: ( 'A' .. 'F' | 'a' .. 'f' | '0' .. '9' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1225:5: ( E ( '+' | '-' )? ( DIGIT )+ )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1225:7: E ( '+' | '-' )? ( DIGIT )+
            {
            mE(); 
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1225:9: ( '+' | '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='+'||LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1225:22: ( DIGIT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1225:22: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1229:5: ( ( '-' )? ( DIGIT )+ )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1229:7: ( '-' )? ( DIGIT )+
            {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1229:7: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='-') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1229:7: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1229:12: ( DIGIT )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1229:12: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "QMARK"
    public final void mQMARK() throws RecognitionException {
        try {
            int _type = QMARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1233:5: ( '?' )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1233:7: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QMARK"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1241:5: ( INTEGER EXPONENT | INTEGER '.' ( DIGIT )* ( EXPONENT )? )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1241:7: INTEGER EXPONENT
                    {
                    mINTEGER(); 
                    mEXPONENT(); 

                    }
                    break;
                case 2 :
                    // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1242:7: INTEGER '.' ( DIGIT )* ( EXPONENT )?
                    {
                    mINTEGER(); 
                    match('.'); 
                    // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1242:19: ( DIGIT )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1242:19: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1242:26: ( EXPONENT )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='E'||LA10_0=='e') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1242:26: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1249:5: ( T R U E | F A L S E )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='T'||LA12_0=='t') ) {
                alt12=1;
            }
            else if ( (LA12_0=='F'||LA12_0=='f') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1249:7: T R U E
                    {
                    mT(); 
                    mR(); 
                    mU(); 
                    mE(); 

                    }
                    break;
                case 2 :
                    // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1249:17: F A L S E
                    {
                    mF(); 
                    mA(); 
                    mL(); 
                    mS(); 
                    mE(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1253:5: ( LETTER ( LETTER | DIGIT | '_' )* )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1253:7: LETTER ( LETTER | DIGIT | '_' )*
            {
            mLETTER(); 
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1253:14: ( LETTER | DIGIT | '_' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "HEXNUMBER"
    public final void mHEXNUMBER() throws RecognitionException {
        try {
            int _type = HEXNUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1257:5: ( '0' X ( HEX )* )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1257:7: '0' X ( HEX )*
            {
            match('0'); 
            mX(); 
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1257:13: ( HEX )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='F')||(LA14_0>='a' && LA14_0<='f')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1257:13: HEX
            	    {
            	    mHEX(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HEXNUMBER"

    // $ANTLR start "UUID"
    public final void mUUID() throws RecognitionException {
        try {
            int _type = UUID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1261:5: ( HEX HEX HEX HEX HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1261:7: HEX HEX HEX HEX HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX
            {
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            match('-'); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            match('-'); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            match('-'); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            match('-'); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UUID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1269:5: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1269:7: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1269:7: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1273:5: ( ( '--' | '//' ) ( . )* ( '\\n' | '\\r' ) )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1273:7: ( '--' | '//' ) ( . )* ( '\\n' | '\\r' )
            {
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1273:7: ( '--' | '//' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='-') ) {
                alt16=1;
            }
            else if ( (LA16_0=='/') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1273:8: '--'
                    {
                    match("--"); 


                    }
                    break;
                case 2 :
                    // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1273:15: '//'
                    {
                    match("//"); 


                    }
                    break;

            }

            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1273:21: ( . )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                    alt17=2;
                }
                else if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1273:21: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "MULTILINE_COMMENT"
    public final void mMULTILINE_COMMENT() throws RecognitionException {
        try {
            int _type = MULTILINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1277:5: ( '/*' ( . )* '*/' )
            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1277:7: '/*' ( . )* '*/'
            {
            match("/*"); 

            // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1277:12: ( . )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='*') ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1=='/') ) {
                        alt18=2;
                    }
                    else if ( ((LA18_1>='\u0000' && LA18_1<='.')||(LA18_1>='0' && LA18_1<='\uFFFF')) ) {
                        alt18=1;
                    }


                }
                else if ( ((LA18_0>='\u0000' && LA18_0<=')')||(LA18_0>='+' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1277:12: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            match("*/"); 

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULTILINE_COMMENT"

    public void mTokens() throws RecognitionException {
        // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:8: ( T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | K_SELECT | K_FROM | K_AS | K_WHERE | K_AND | K_KEY | K_INSERT | K_UPDATE | K_WITH | K_LIMIT | K_USING | K_USE | K_DISTINCT | K_COUNT | K_SET | K_BEGIN | K_UNLOGGED | K_BATCH | K_APPLY | K_TRUNCATE | K_DELETE | K_IN | K_CREATE | K_KEYSPACE | K_KEYSPACES | K_COLUMNFAMILY | K_INDEX | K_CUSTOM | K_ON | K_TO | K_DROP | K_PRIMARY | K_INTO | K_VALUES | K_TIMESTAMP | K_TTL | K_ALTER | K_RENAME | K_ADD | K_TYPE | K_COMPACT | K_STORAGE | K_ORDER | K_BY | K_ASC | K_DESC | K_ALLOW | K_FILTERING | K_IF | K_GRANT | K_ALL | K_PERMISSION | K_PERMISSIONS | K_OF | K_REVOKE | K_MODIFY | K_AUTHORIZE | K_NORECURSIVE | K_USER | K_USERS | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD | K_CLUSTERING | K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INET | K_INT | K_TEXT | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID | K_TOKEN | K_WRITETIME | K_NULL | K_NOT | K_EXISTS | K_MAP | K_LIST | K_NAN | K_INFINITY | K_TRIGGER | K_STATIC | STRING_LITERAL | QUOTED_NAME | INTEGER | QMARK | FLOAT | BOOLEAN | IDENT | HEXNUMBER | UUID | WS | COMMENT | MULTILINE_COMMENT )
        int alt19=120;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:10: T__136
                {
                mT__136(); 

                }
                break;
            case 2 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:17: T__137
                {
                mT__137(); 

                }
                break;
            case 3 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:24: T__138
                {
                mT__138(); 

                }
                break;
            case 4 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:31: T__139
                {
                mT__139(); 

                }
                break;
            case 5 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:38: T__140
                {
                mT__140(); 

                }
                break;
            case 6 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:45: T__141
                {
                mT__141(); 

                }
                break;
            case 7 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:52: T__142
                {
                mT__142(); 

                }
                break;
            case 8 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:59: T__143
                {
                mT__143(); 

                }
                break;
            case 9 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:66: T__144
                {
                mT__144(); 

                }
                break;
            case 10 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:73: T__145
                {
                mT__145(); 

                }
                break;
            case 11 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:80: T__146
                {
                mT__146(); 

                }
                break;
            case 12 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:87: T__147
                {
                mT__147(); 

                }
                break;
            case 13 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:94: T__148
                {
                mT__148(); 

                }
                break;
            case 14 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:101: T__149
                {
                mT__149(); 

                }
                break;
            case 15 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:108: T__150
                {
                mT__150(); 

                }
                break;
            case 16 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:115: T__151
                {
                mT__151(); 

                }
                break;
            case 17 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:122: T__152
                {
                mT__152(); 

                }
                break;
            case 18 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:129: T__153
                {
                mT__153(); 

                }
                break;
            case 19 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:136: K_SELECT
                {
                mK_SELECT(); 

                }
                break;
            case 20 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:145: K_FROM
                {
                mK_FROM(); 

                }
                break;
            case 21 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:152: K_AS
                {
                mK_AS(); 

                }
                break;
            case 22 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:157: K_WHERE
                {
                mK_WHERE(); 

                }
                break;
            case 23 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:165: K_AND
                {
                mK_AND(); 

                }
                break;
            case 24 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:171: K_KEY
                {
                mK_KEY(); 

                }
                break;
            case 25 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:177: K_INSERT
                {
                mK_INSERT(); 

                }
                break;
            case 26 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:186: K_UPDATE
                {
                mK_UPDATE(); 

                }
                break;
            case 27 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:195: K_WITH
                {
                mK_WITH(); 

                }
                break;
            case 28 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:202: K_LIMIT
                {
                mK_LIMIT(); 

                }
                break;
            case 29 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:210: K_USING
                {
                mK_USING(); 

                }
                break;
            case 30 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:218: K_USE
                {
                mK_USE(); 

                }
                break;
            case 31 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:224: K_DISTINCT
                {
                mK_DISTINCT(); 

                }
                break;
            case 32 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:235: K_COUNT
                {
                mK_COUNT(); 

                }
                break;
            case 33 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:243: K_SET
                {
                mK_SET(); 

                }
                break;
            case 34 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:249: K_BEGIN
                {
                mK_BEGIN(); 

                }
                break;
            case 35 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:257: K_UNLOGGED
                {
                mK_UNLOGGED(); 

                }
                break;
            case 36 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:268: K_BATCH
                {
                mK_BATCH(); 

                }
                break;
            case 37 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:276: K_APPLY
                {
                mK_APPLY(); 

                }
                break;
            case 38 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:284: K_TRUNCATE
                {
                mK_TRUNCATE(); 

                }
                break;
            case 39 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:295: K_DELETE
                {
                mK_DELETE(); 

                }
                break;
            case 40 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:304: K_IN
                {
                mK_IN(); 

                }
                break;
            case 41 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:309: K_CREATE
                {
                mK_CREATE(); 

                }
                break;
            case 42 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:318: K_KEYSPACE
                {
                mK_KEYSPACE(); 

                }
                break;
            case 43 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:329: K_KEYSPACES
                {
                mK_KEYSPACES(); 

                }
                break;
            case 44 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:341: K_COLUMNFAMILY
                {
                mK_COLUMNFAMILY(); 

                }
                break;
            case 45 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:356: K_INDEX
                {
                mK_INDEX(); 

                }
                break;
            case 46 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:364: K_CUSTOM
                {
                mK_CUSTOM(); 

                }
                break;
            case 47 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:373: K_ON
                {
                mK_ON(); 

                }
                break;
            case 48 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:378: K_TO
                {
                mK_TO(); 

                }
                break;
            case 49 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:383: K_DROP
                {
                mK_DROP(); 

                }
                break;
            case 50 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:390: K_PRIMARY
                {
                mK_PRIMARY(); 

                }
                break;
            case 51 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:400: K_INTO
                {
                mK_INTO(); 

                }
                break;
            case 52 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:407: K_VALUES
                {
                mK_VALUES(); 

                }
                break;
            case 53 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:416: K_TIMESTAMP
                {
                mK_TIMESTAMP(); 

                }
                break;
            case 54 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:428: K_TTL
                {
                mK_TTL(); 

                }
                break;
            case 55 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:434: K_ALTER
                {
                mK_ALTER(); 

                }
                break;
            case 56 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:442: K_RENAME
                {
                mK_RENAME(); 

                }
                break;
            case 57 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:451: K_ADD
                {
                mK_ADD(); 

                }
                break;
            case 58 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:457: K_TYPE
                {
                mK_TYPE(); 

                }
                break;
            case 59 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:464: K_COMPACT
                {
                mK_COMPACT(); 

                }
                break;
            case 60 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:474: K_STORAGE
                {
                mK_STORAGE(); 

                }
                break;
            case 61 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:484: K_ORDER
                {
                mK_ORDER(); 

                }
                break;
            case 62 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:492: K_BY
                {
                mK_BY(); 

                }
                break;
            case 63 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:497: K_ASC
                {
                mK_ASC(); 

                }
                break;
            case 64 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:503: K_DESC
                {
                mK_DESC(); 

                }
                break;
            case 65 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:510: K_ALLOW
                {
                mK_ALLOW(); 

                }
                break;
            case 66 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:518: K_FILTERING
                {
                mK_FILTERING(); 

                }
                break;
            case 67 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:530: K_IF
                {
                mK_IF(); 

                }
                break;
            case 68 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:535: K_GRANT
                {
                mK_GRANT(); 

                }
                break;
            case 69 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:543: K_ALL
                {
                mK_ALL(); 

                }
                break;
            case 70 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:549: K_PERMISSION
                {
                mK_PERMISSION(); 

                }
                break;
            case 71 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:562: K_PERMISSIONS
                {
                mK_PERMISSIONS(); 

                }
                break;
            case 72 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:576: K_OF
                {
                mK_OF(); 

                }
                break;
            case 73 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:581: K_REVOKE
                {
                mK_REVOKE(); 

                }
                break;
            case 74 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:590: K_MODIFY
                {
                mK_MODIFY(); 

                }
                break;
            case 75 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:599: K_AUTHORIZE
                {
                mK_AUTHORIZE(); 

                }
                break;
            case 76 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:611: K_NORECURSIVE
                {
                mK_NORECURSIVE(); 

                }
                break;
            case 77 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:625: K_USER
                {
                mK_USER(); 

                }
                break;
            case 78 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:632: K_USERS
                {
                mK_USERS(); 

                }
                break;
            case 79 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:640: K_SUPERUSER
                {
                mK_SUPERUSER(); 

                }
                break;
            case 80 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:652: K_NOSUPERUSER
                {
                mK_NOSUPERUSER(); 

                }
                break;
            case 81 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:666: K_PASSWORD
                {
                mK_PASSWORD(); 

                }
                break;
            case 82 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:677: K_CLUSTERING
                {
                mK_CLUSTERING(); 

                }
                break;
            case 83 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:690: K_ASCII
                {
                mK_ASCII(); 

                }
                break;
            case 84 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:698: K_BIGINT
                {
                mK_BIGINT(); 

                }
                break;
            case 85 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:707: K_BLOB
                {
                mK_BLOB(); 

                }
                break;
            case 86 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:714: K_BOOLEAN
                {
                mK_BOOLEAN(); 

                }
                break;
            case 87 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:724: K_COUNTER
                {
                mK_COUNTER(); 

                }
                break;
            case 88 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:734: K_DECIMAL
                {
                mK_DECIMAL(); 

                }
                break;
            case 89 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:744: K_DOUBLE
                {
                mK_DOUBLE(); 

                }
                break;
            case 90 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:753: K_FLOAT
                {
                mK_FLOAT(); 

                }
                break;
            case 91 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:761: K_INET
                {
                mK_INET(); 

                }
                break;
            case 92 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:768: K_INT
                {
                mK_INT(); 

                }
                break;
            case 93 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:774: K_TEXT
                {
                mK_TEXT(); 

                }
                break;
            case 94 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:781: K_UUID
                {
                mK_UUID(); 

                }
                break;
            case 95 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:788: K_VARCHAR
                {
                mK_VARCHAR(); 

                }
                break;
            case 96 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:798: K_VARINT
                {
                mK_VARINT(); 

                }
                break;
            case 97 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:807: K_TIMEUUID
                {
                mK_TIMEUUID(); 

                }
                break;
            case 98 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:818: K_TOKEN
                {
                mK_TOKEN(); 

                }
                break;
            case 99 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:826: K_WRITETIME
                {
                mK_WRITETIME(); 

                }
                break;
            case 100 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:838: K_NULL
                {
                mK_NULL(); 

                }
                break;
            case 101 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:845: K_NOT
                {
                mK_NOT(); 

                }
                break;
            case 102 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:851: K_EXISTS
                {
                mK_EXISTS(); 

                }
                break;
            case 103 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:860: K_MAP
                {
                mK_MAP(); 

                }
                break;
            case 104 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:866: K_LIST
                {
                mK_LIST(); 

                }
                break;
            case 105 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:873: K_NAN
                {
                mK_NAN(); 

                }
                break;
            case 106 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:879: K_INFINITY
                {
                mK_INFINITY(); 

                }
                break;
            case 107 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:890: K_TRIGGER
                {
                mK_TRIGGER(); 

                }
                break;
            case 108 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:900: K_STATIC
                {
                mK_STATIC(); 

                }
                break;
            case 109 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:909: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 110 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:924: QUOTED_NAME
                {
                mQUOTED_NAME(); 

                }
                break;
            case 111 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:936: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 112 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:944: QMARK
                {
                mQMARK(); 

                }
                break;
            case 113 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:950: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 114 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:956: BOOLEAN
                {
                mBOOLEAN(); 

                }
                break;
            case 115 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:964: IDENT
                {
                mIDENT(); 

                }
                break;
            case 116 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:970: HEXNUMBER
                {
                mHEXNUMBER(); 

                }
                break;
            case 117 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:980: UUID
                {
                mUUID(); 

                }
                break;
            case 118 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:985: WS
                {
                mWS(); 

                }
                break;
            case 119 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:988: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 120 :
                // /root/Cassandra_Team/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1:996: MULTILINE_COMMENT
                {
                mMULTILINE_COMMENT(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA11_eotS =
        "\5\uffff";
    static final String DFA11_eofS =
        "\5\uffff";
    static final String DFA11_minS =
        "\1\55\1\60\1\56\2\uffff";
    static final String DFA11_maxS =
        "\2\71\1\145\2\uffff";
    static final String DFA11_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA11_specialS =
        "\5\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1\2\uffff\12\2",
            "\12\2",
            "\1\3\1\uffff\12\2\13\uffff\1\4\37\uffff\1\4",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1240:1: FLOAT : ( INTEGER EXPONENT | INTEGER '.' ( DIGIT )* ( EXPONENT )? );";
        }
    }
    static final String DFA19_eotS =
        "\11\uffff\1\57\5\uffff\1\61\1\63\24\51\2\uffff\1\162\2\uffff\1\162"+
        "\3\uffff\1\162\5\uffff\14\51\1\u0088\6\51\1\u0090\1\u0096\15\51"+
        "\1\u00aa\13\51\1\u00b7\1\51\1\u00ba\1\u00bb\14\51\1\uffff\1\162"+
        "\5\uffff\3\51\1\u00d2\7\51\1\u00da\1\u00db\2\51\1\uffff\1\u00df"+
        "\1\u00e1\4\51\1\u00e6\1\uffff\1\51\1\u00e9\3\51\1\uffff\4\51\1\u00f2"+
        "\16\51\1\uffff\6\51\1\u0108\5\51\1\uffff\2\51\2\uffff\11\51\1\u011b"+
        "\2\51\1\u011e\1\u011f\2\51\1\162\1\uffff\1\165\3\51\1\uffff\2\51"+
        "\1\u012a\4\51\2\uffff\3\51\1\uffff\1\51\1\uffff\1\51\1\u0134\2\51"+
        "\1\uffff\2\51\1\uffff\1\u0139\1\51\1\u013b\1\51\1\u013d\3\51\1\uffff"+
        "\1\u0141\1\51\1\u0144\1\u0145\3\51\1\u0149\11\51\1\u0153\2\51\1"+
        "\u0156\1\uffff\2\51\1\u0159\2\51\1\u015d\14\51\1\uffff\2\51\2\uffff"+
        "\1\u016c\1\51\1\162\1\uffff\1\165\5\51\1\uffff\1\u0159\2\51\1\u0178"+
        "\1\u0179\1\u017a\1\u017b\1\u017c\1\51\1\uffff\1\51\1\u017f\2\51"+
        "\1\uffff\1\51\1\uffff\1\u0183\1\uffff\2\51\1\u0186\1\uffff\1\u0187"+
        "\1\u0188\2\uffff\3\51\1\uffff\1\51\1\u018d\5\51\1\u0194\1\u0195"+
        "\1\uffff\2\51\1\uffff\2\51\1\uffff\2\51\1\u019c\1\uffff\1\u019d"+
        "\1\u019e\10\51\1\u01a7\3\51\1\uffff\1\51\1\162\1\uffff\1\165\1\51"+
        "\1\u01b0\1\51\1\u01b2\1\u01b3\2\51\5\uffff\2\51\1\uffff\2\51\1\u01ba"+
        "\1\uffff\1\51\1\u01bc\3\uffff\1\51\1\u01be\1\u01bf\1\51\1\uffff"+
        "\4\51\1\u01c5\1\u01c6\2\uffff\1\u01c7\5\51\3\uffff\4\51\1\u01d1"+
        "\1\u01d2\1\u01d3\1\u01d4\1\uffff\1\u01d5\2\51\1\u01d8\1\162\1\uffff"+
        "\1\165\1\51\1\uffff\1\u01dd\2\uffff\6\51\1\uffff\1\51\1\uffff\1"+
        "\u01e5\2\uffff\1\51\1\u01e7\1\51\1\u01e9\1\51\3\uffff\1\u01eb\1"+
        "\u01ec\5\51\1\u01f2\1\u01f3\5\uffff\2\51\1\uffff\1\162\1\uffff\1"+
        "\165\1\51\1\uffff\4\51\1\u01b3\1\u01fe\1\u01ff\1\uffff\1\u0200\1"+
        "\uffff\1\51\1\uffff\1\51\2\uffff\1\u0203\1\51\1\u0205\1\51\1\u0207"+
        "\2\uffff\2\51\1\162\1\uffff\1\165\1\u020b\1\u020c\1\u020d\1\u020e"+
        "\1\u020f\3\uffff\2\51\1\uffff\1\u0212\1\uffff\1\51\1\uffff\2\51"+
        "\6\uffff\1\51\1\u0218\1\uffff\1\u0219\2\51\1\165\1\51\2\uffff\1"+
        "\u021f\1\u0220\1\u0221\1\165\1\u019c\3\uffff\2\165";
    static final String DFA19_eofS =
        "\u0224\uffff";
    static final String DFA19_minS =
        "\1\11\10\uffff\1\55\5\uffff\2\75\1\103\2\60\1\110\1\105\1\106\1"+
        "\116\1\111\3\60\1\101\1\106\2\101\1\105\1\122\2\101\1\60\2\uffff"+
        "\1\56\2\uffff\1\56\1\uffff\1\52\1\uffff\1\56\5\uffff\1\120\1\101"+
        "\1\114\1\110\1\117\1\60\1\114\1\60\1\117\1\60\1\114\1\120\1\60\1"+
        "\104\2\124\1\111\1\105\1\131\2\60\1\111\1\114\1\104\1\105\1\115"+
        "\1\60\1\125\1\117\1\123\1\114\1\125\1\123\1\105\3\60\1\117\1\107"+
        "\1\117\1\130\1\114\1\111\1\115\1\102\1\120\1\60\1\104\2\60\1\122"+
        "\1\123\1\111\1\114\1\116\1\101\1\104\1\120\1\122\1\116\1\114\1\111"+
        "\1\uffff\1\56\2\uffff\1\53\2\uffff\1\105\1\124\1\122\1\60\2\105"+
        "\1\115\1\123\1\60\1\124\1\101\2\60\1\105\1\114\1\uffff\2\60\2\110"+
        "\1\124\1\122\1\60\1\uffff\1\111\1\60\1\105\1\124\1\105\1\uffff\1"+
        "\104\1\117\1\101\1\116\1\60\1\111\1\124\1\103\1\60\1\105\1\102\1"+
        "\120\1\124\1\116\1\125\1\120\1\123\1\124\1\101\1\uffff\1\103\1\111"+
        "\1\102\1\111\1\114\1\124\1\60\1\107\2\105\1\114\1\105\1\uffff\2"+
        "\105\2\uffff\1\115\1\123\1\115\1\103\1\125\1\117\1\101\1\116\1\111"+
        "\1\60\1\105\1\125\2\60\1\114\1\123\1\56\1\53\1\60\1\122\1\111\1"+
        "\101\1\uffff\1\103\1\115\1\60\1\105\1\60\1\105\1\124\2\uffff\1\127"+
        "\1\122\1\131\1\uffff\1\111\1\uffff\1\117\1\60\2\105\1\uffff\1\120"+
        "\1\116\1\uffff\1\60\1\122\1\60\1\130\1\60\1\107\1\124\1\107\1\uffff"+
        "\1\60\1\124\2\60\1\115\1\124\1\114\1\60\1\111\1\124\1\115\1\101"+
        "\1\124\1\117\1\124\1\110\1\116\1\60\1\116\1\105\1\60\1\uffff\1\107"+
        "\1\103\1\60\1\123\1\105\1\60\1\116\1\122\1\111\1\127\1\101\1\110"+
        "\1\116\1\105\1\113\1\115\1\124\1\106\1\uffff\1\103\1\120\2\uffff"+
        "\1\60\1\124\1\56\1\53\1\60\1\125\1\103\1\107\1\124\1\101\1\uffff"+
        "\2\60\1\122\5\60\1\122\1\uffff\1\124\1\60\1\101\1\111\1\uffff\1"+
        "\124\1\uffff\1\60\1\uffff\1\107\1\105\1\60\1\uffff\2\60\2\uffff"+
        "\1\101\2\105\1\uffff\1\116\1\60\1\116\1\103\1\105\1\115\1\105\2"+
        "\60\1\uffff\1\124\1\101\1\uffff\1\105\1\101\1\uffff\1\124\1\125"+
        "\1\60\1\uffff\2\60\1\123\1\117\1\122\1\101\1\124\1\123\2\105\1\60"+
        "\1\131\1\125\1\105\1\uffff\1\123\1\56\1\53\1\60\1\123\1\60\1\105"+
        "\3\60\1\111\5\uffff\2\111\1\uffff\1\103\1\124\1\60\1\uffff\1\105"+
        "\1\60\3\uffff\1\114\2\60\1\103\1\uffff\1\122\1\106\1\124\1\122\2"+
        "\60\2\uffff\1\60\1\116\1\122\1\124\1\101\1\111\3\uffff\1\123\1\122"+
        "\1\131\1\122\4\60\1\uffff\1\60\2\122\1\60\1\56\1\53\1\60\1\105\1"+
        "\uffff\1\60\2\uffff\1\60\1\116\1\132\1\115\1\105\1\131\1\uffff\1"+
        "\104\1\uffff\1\60\2\uffff\1\124\1\60\1\101\1\60\1\111\3\uffff\2"+
        "\60\1\105\1\115\1\104\1\111\1\104\2\60\5\uffff\1\123\1\125\1\uffff"+
        "\1\56\1\53\1\60\1\122\1\uffff\1\55\1\107\2\105\3\60\1\uffff\1\60"+
        "\1\uffff\1\115\1\uffff\1\116\2\uffff\1\60\1\120\1\60\1\117\1\60"+
        "\2\uffff\1\111\1\123\1\55\1\53\1\55\5\60\3\uffff\1\111\1\107\1\uffff"+
        "\1\60\1\uffff\1\116\1\uffff\1\126\1\105\1\60\5\uffff\1\114\1\60"+
        "\1\uffff\1\60\1\105\1\122\1\60\1\131\2\uffff\5\60\3\uffff\1\60\1"+
        "\55";
    static final String DFA19_maxS =
        "\1\175\10\uffff\1\71\5\uffff\2\75\1\165\1\162\1\165\1\162\1\145"+
        "\1\156\1\165\1\151\1\162\1\165\2\171\2\162\1\141\1\145\1\162\1\157"+
        "\1\165\1\170\2\uffff\1\170\2\uffff\1\146\1\uffff\1\57\1\uffff\1"+
        "\145\5\uffff\1\160\1\157\1\164\1\150\1\157\2\154\1\146\1\157\1\146"+
        "\1\164\1\160\1\172\1\144\2\164\1\151\1\145\1\171\2\172\1\151\1\154"+
        "\1\144\1\151\2\163\1\165\1\157\1\163\2\165\1\163\1\145\1\172\1\164"+
        "\1\147\1\157\1\147\1\157\1\170\1\154\1\165\1\155\1\142\1\160\1\172"+
        "\1\144\2\172\1\162\1\163\1\151\1\162\1\166\1\141\1\144\1\160\1\164"+
        "\1\156\1\154\1\151\1\uffff\1\146\2\uffff\1\146\2\uffff\1\145\1\164"+
        "\1\162\1\172\2\145\1\155\1\163\1\146\1\164\1\141\2\172\1\145\1\154"+
        "\1\uffff\2\172\2\150\1\164\1\162\1\172\1\uffff\1\151\1\172\1\145"+
        "\1\164\1\145\1\uffff\1\144\1\157\1\141\1\156\1\172\1\151\1\164\1"+
        "\143\1\151\1\145\1\142\1\160\1\164\1\156\1\165\1\160\1\163\1\164"+
        "\1\141\1\uffff\1\143\1\151\1\142\1\151\1\154\1\164\1\172\1\147\1"+
        "\156\1\145\1\154\1\145\1\uffff\2\145\2\uffff\1\155\1\163\1\155\1"+
        "\151\1\165\1\157\1\141\1\156\1\151\1\172\1\145\1\165\2\172\1\154"+
        "\1\163\3\146\1\162\1\151\1\141\1\uffff\1\143\1\155\1\172\1\145\1"+
        "\146\1\145\1\164\2\uffff\1\167\1\162\1\171\1\uffff\1\151\1\uffff"+
        "\1\157\1\172\2\145\1\uffff\1\160\1\156\1\uffff\1\172\1\162\1\172"+
        "\1\170\1\172\1\147\1\164\1\147\1\uffff\1\172\1\164\2\172\1\155\1"+
        "\164\1\154\1\172\1\151\1\164\1\155\1\141\1\164\1\157\1\164\1\150"+
        "\1\156\1\172\1\156\1\145\1\172\1\uffff\1\147\1\143\1\172\1\165\1"+
        "\145\1\172\1\156\1\162\1\151\1\167\1\141\1\150\1\156\1\145\1\153"+
        "\1\155\1\164\1\146\1\uffff\1\143\1\160\2\uffff\1\172\1\164\3\146"+
        "\1\165\1\143\1\147\1\164\1\141\1\uffff\1\172\1\146\1\162\5\172\1"+
        "\162\1\uffff\1\164\1\172\1\141\1\151\1\uffff\1\164\1\uffff\1\172"+
        "\1\uffff\1\147\1\145\1\172\1\uffff\2\172\2\uffff\1\141\2\145\1\uffff"+
        "\1\156\1\172\1\156\1\143\1\145\1\155\1\145\2\172\1\uffff\1\164\1"+
        "\141\1\uffff\1\145\1\141\1\uffff\1\164\1\165\1\172\1\uffff\2\172"+
        "\1\163\1\157\1\162\1\141\1\164\1\163\2\145\1\172\1\171\1\165\1\145"+
        "\1\uffff\1\163\3\146\1\163\1\172\1\145\2\172\1\146\1\151\5\uffff"+
        "\2\151\1\uffff\1\143\1\164\1\172\1\uffff\1\145\1\172\3\uffff\1\154"+
        "\2\172\1\143\1\uffff\1\162\1\146\1\164\1\162\2\172\2\uffff\1\172"+
        "\1\156\1\162\1\164\1\141\1\151\3\uffff\1\163\1\162\1\171\1\162\4"+
        "\172\1\uffff\1\172\2\162\1\172\3\146\1\145\1\uffff\1\172\2\uffff"+
        "\1\146\1\156\1\172\1\155\1\145\1\171\1\uffff\1\144\1\uffff\1\172"+
        "\2\uffff\1\164\1\172\1\141\1\172\1\151\3\uffff\2\172\1\145\1\155"+
        "\1\144\1\151\1\144\2\172\5\uffff\1\163\1\165\1\uffff\3\146\1\162"+
        "\1\uffff\1\55\1\147\2\145\3\172\1\uffff\1\172\1\uffff\1\155\1\uffff"+
        "\1\156\2\uffff\1\172\1\160\1\172\1\157\1\172\2\uffff\1\151\1\163"+
        "\1\145\1\71\1\55\5\172\3\uffff\1\151\1\147\1\uffff\1\172\1\uffff"+
        "\1\156\1\uffff\1\166\1\145\1\146\5\uffff\1\154\1\172\1\uffff\1\172"+
        "\1\145\1\162\1\146\1\171\2\uffff\3\172\1\146\1\172\3\uffff\1\146"+
        "\1\55";
    static final String DFA19_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\12\1\13\1\14"+
        "\1\15\1\16\26\uffff\1\155\1\156\1\uffff\1\160\1\163\1\uffff\1\166"+
        "\1\uffff\1\167\1\uffff\1\11\1\20\1\17\1\22\1\21\76\uffff\1\157\1"+
        "\uffff\1\164\1\161\1\uffff\1\165\1\170\17\uffff\1\25\7\uffff\1\50"+
        "\5\uffff\1\103\23\uffff\1\76\14\uffff\1\60\2\uffff\1\57\1\110\26"+
        "\uffff\1\41\7\uffff\1\71\1\105\3\uffff\1\77\1\uffff\1\27\4\uffff"+
        "\1\30\2\uffff\1\134\10\uffff\1\36\25\uffff\1\66\22\uffff\1\147\2"+
        "\uffff\1\145\1\151\12\uffff\1\24\11\uffff\1\33\4\uffff\1\63\1\uffff"+
        "\1\133\1\uffff\1\136\3\uffff\1\115\2\uffff\1\150\1\100\3\uffff\1"+
        "\61\11\uffff\1\125\2\uffff\1\135\2\uffff\1\162\3\uffff\1\72\16\uffff"+
        "\1\144\13\uffff\1\132\1\101\1\67\1\45\1\123\2\uffff\1\26\3\uffff"+
        "\1\55\2\uffff\1\35\1\116\1\34\4\uffff\1\40\6\uffff\1\44\1\42\6\uffff"+
        "\1\54\1\142\1\75\10\uffff\1\104\10\uffff\1\154\1\uffff\1\23\1\52"+
        "\6\uffff\1\31\1\uffff\1\32\1\uffff\1\47\1\131\5\uffff\1\56\1\51"+
        "\1\124\11\uffff\1\140\1\64\1\111\1\70\1\112\2\uffff\1\146\4\uffff"+
        "\1\74\7\uffff\1\130\1\uffff\1\127\1\uffff\1\73\1\uffff\1\126\1\153"+
        "\5\uffff\1\62\1\137\12\uffff\1\152\1\43\1\37\2\uffff\1\46\1\uffff"+
        "\1\141\1\uffff\1\121\3\uffff\1\117\1\102\1\113\1\143\1\53\2\uffff"+
        "\1\65\5\uffff\1\122\1\106\5\uffff\1\107\1\114\1\120\2\uffff";
    static final String DFA19_specialS =
        "\u0224\uffff}>";
    static final String[] DFA19_transitionS = {
            "\2\53\2\uffff\1\53\22\uffff\1\53\1\uffff\1\46\4\uffff\1\45\1"+
            "\2\1\3\1\5\1\16\1\4\1\11\1\10\1\54\1\47\11\52\1\13\1\1\1\17"+
            "\1\15\1\20\1\50\1\uffff\1\23\1\33\1\32\1\31\1\44\1\22\1\41\1"+
            "\51\1\26\1\51\1\25\1\30\1\42\1\43\1\35\1\36\1\51\1\40\1\21\1"+
            "\34\1\27\1\37\1\24\3\51\1\6\1\uffff\1\7\3\uffff\1\23\1\33\1"+
            "\32\1\31\1\44\1\22\1\41\1\51\1\26\1\51\1\25\1\30\1\42\1\43\1"+
            "\35\1\36\1\51\1\40\1\21\1\34\1\27\1\37\1\24\3\51\1\12\1\uffff"+
            "\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\55\2\uffff\12\56",
            "",
            "",
            "",
            "",
            "",
            "\1\60",
            "\1\62",
            "\1\67\1\uffff\1\66\16\uffff\1\65\1\64\15\uffff\1\67\1\uffff"+
            "\1\66\16\uffff\1\65\1\64",
            "\12\73\7\uffff\1\71\5\73\2\uffff\1\72\2\uffff\1\74\5\uffff"+
            "\1\70\16\uffff\1\71\5\73\2\uffff\1\72\2\uffff\1\74\5\uffff\1"+
            "\70",
            "\12\73\7\uffff\3\73\1\75\2\73\5\uffff\1\76\1\uffff\1\101\1"+
            "\uffff\1\77\2\uffff\1\100\1\uffff\1\102\13\uffff\3\73\1\75\2"+
            "\73\5\uffff\1\76\1\uffff\1\101\1\uffff\1\77\2\uffff\1\100\1"+
            "\uffff\1\102",
            "\1\105\1\103\10\uffff\1\104\25\uffff\1\105\1\103\10\uffff\1"+
            "\104",
            "\1\106\37\uffff\1\106",
            "\1\110\7\uffff\1\107\27\uffff\1\110\7\uffff\1\107",
            "\1\112\1\uffff\1\113\2\uffff\1\114\1\uffff\1\111\30\uffff\1"+
            "\112\1\uffff\1\113\2\uffff\1\114\1\uffff\1\111",
            "\1\115\37\uffff\1\115",
            "\12\73\7\uffff\4\73\1\116\1\73\2\uffff\1\121\5\uffff\1\117"+
            "\2\uffff\1\120\16\uffff\4\73\1\116\1\73\2\uffff\1\121\5\uffff"+
            "\1\117\2\uffff\1\120",
            "\12\73\7\uffff\6\73\5\uffff\1\123\2\uffff\1\122\2\uffff\1\125"+
            "\2\uffff\1\124\13\uffff\6\73\5\uffff\1\123\2\uffff\1\122\2\uffff"+
            "\1\125\2\uffff\1\124",
            "\12\73\7\uffff\1\127\3\73\1\130\1\73\2\uffff\1\132\2\uffff"+
            "\1\131\2\uffff\1\133\11\uffff\1\126\7\uffff\1\127\3\73\1\130"+
            "\1\73\2\uffff\1\132\2\uffff\1\131\2\uffff\1\133\11\uffff\1\126",
            "\1\140\3\uffff\1\134\3\uffff\1\137\5\uffff\1\142\2\uffff\1"+
            "\136\1\uffff\1\135\4\uffff\1\141\7\uffff\1\140\3\uffff\1\134"+
            "\3\uffff\1\137\5\uffff\1\142\2\uffff\1\136\1\uffff\1\135\4\uffff"+
            "\1\141",
            "\1\145\7\uffff\1\144\3\uffff\1\143\23\uffff\1\145\7\uffff\1"+
            "\144\3\uffff\1\143",
            "\1\147\3\uffff\1\146\14\uffff\1\150\16\uffff\1\147\3\uffff"+
            "\1\146\14\uffff\1\150",
            "\1\151\37\uffff\1\151",
            "\1\152\37\uffff\1\152",
            "\1\153\37\uffff\1\153",
            "\1\155\15\uffff\1\154\21\uffff\1\155\15\uffff\1\154",
            "\1\157\15\uffff\1\156\5\uffff\1\160\13\uffff\1\157\15\uffff"+
            "\1\156\5\uffff\1\160",
            "\12\73\7\uffff\6\73\21\uffff\1\161\10\uffff\6\73\21\uffff\1"+
            "\161",
            "",
            "",
            "\1\165\1\uffff\12\163\7\uffff\4\167\1\166\1\167\21\uffff\1"+
            "\164\10\uffff\4\167\1\166\1\167\21\uffff\1\164",
            "",
            "",
            "\1\165\1\uffff\12\163\7\uffff\4\167\1\166\1\167\32\uffff\4"+
            "\167\1\166\1\167",
            "",
            "\1\170\4\uffff\1\55",
            "",
            "\1\165\1\uffff\12\56\13\uffff\1\165\37\uffff\1\165",
            "",
            "",
            "",
            "",
            "",
            "\1\171\37\uffff\1\171",
            "\1\172\15\uffff\1\173\21\uffff\1\172\15\uffff\1\173",
            "\1\175\7\uffff\1\174\27\uffff\1\175\7\uffff\1\174",
            "\1\176\37\uffff\1\176",
            "\1\177\37\uffff\1\177",
            "\12\u0081\7\uffff\6\u0081\5\uffff\1\u0080\24\uffff\6\u0081"+
            "\5\uffff\1\u0080",
            "\1\u0082\37\uffff\1\u0082",
            "\12\u0081\7\uffff\6\u0081\32\uffff\6\u0081",
            "\1\u0083\37\uffff\1\u0083",
            "\12\u0081\7\uffff\3\u0081\1\u0084\2\u0081\32\uffff\3\u0081"+
            "\1\u0084\2\u0081",
            "\1\u0085\7\uffff\1\u0086\27\uffff\1\u0085\7\uffff\1\u0086",
            "\1\u0087\37\uffff\1\u0087",
            "\12\51\7\uffff\2\51\1\u0089\27\51\4\uffff\1\51\1\uffff\2\51"+
            "\1\u0089\27\51",
            "\1\u008a\37\uffff\1\u008a",
            "\1\u008b\37\uffff\1\u008b",
            "\1\u008c\37\uffff\1\u008c",
            "\1\u008d\37\uffff\1\u008d",
            "\1\u008e\37\uffff\1\u008e",
            "\1\u008f\37\uffff\1\u008f",
            "\12\51\7\uffff\3\51\1\u0095\1\u0094\1\u0091\14\51\1\u0093\1"+
            "\u0092\6\51\4\uffff\1\51\1\uffff\3\51\1\u0095\1\u0094\1\u0091"+
            "\14\51\1\u0093\1\u0092\6\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0097\37\uffff\1\u0097",
            "\1\u0098\37\uffff\1\u0098",
            "\1\u0099\37\uffff\1\u0099",
            "\1\u009b\3\uffff\1\u009a\33\uffff\1\u009b\3\uffff\1\u009a",
            "\1\u009c\5\uffff\1\u009d\31\uffff\1\u009c\5\uffff\1\u009d",
            "\12\u0081\7\uffff\2\u0081\1\u009f\3\u0081\5\uffff\1\u00a0\6"+
            "\uffff\1\u009e\15\uffff\2\u0081\1\u009f\3\u0081\5\uffff\1\u00a0"+
            "\6\uffff\1\u009e",
            "\1\u00a1\37\uffff\1\u00a1",
            "\1\u00a2\37\uffff\1\u00a2",
            "\1\u00a3\37\uffff\1\u00a3",
            "\1\u00a5\1\u00a6\7\uffff\1\u00a4\26\uffff\1\u00a5\1\u00a6\7"+
            "\uffff\1\u00a4",
            "\1\u00a7\37\uffff\1\u00a7",
            "\1\u00a8\37\uffff\1\u00a8",
            "\1\u00a9\37\uffff\1\u00a9",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\u0081\7\uffff\6\u0081\15\uffff\1\u00ab\14\uffff\6\u0081"+
            "\15\uffff\1\u00ab",
            "\12\u0081\7\uffff\6\u0081\1\u00ac\31\uffff\6\u0081\1\u00ac",
            "\1\u00ad\37\uffff\1\u00ad",
            "\1\u00ae\37\uffff\1\u00ae",
            "\1\u00af\37\uffff\1\u00af",
            "\1\u00b0\37\uffff\1\u00b0",
            "\1\u00b1\37\uffff\1\u00b1",
            "\1\u00b2\13\uffff\1\u00b3\23\uffff\1\u00b2\13\uffff\1\u00b3",
            "\1\u00b4\37\uffff\1\u00b4",
            "\1\u00b5\37\uffff\1\u00b5",
            "\1\u00b6\37\uffff\1\u00b6",
            "\12\51\7\uffff\12\51\1\u00b8\17\51\4\uffff\1\51\1\uffff\12"+
            "\51\1\u00b8\17\51",
            "\1\u00b9\37\uffff\1\u00b9",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00bc\37\uffff\1\u00bc",
            "\1\u00bd\37\uffff\1\u00bd",
            "\1\u00be\37\uffff\1\u00be",
            "\1\u00c0\5\uffff\1\u00bf\31\uffff\1\u00c0\5\uffff\1\u00bf",
            "\1\u00c2\7\uffff\1\u00c1\27\uffff\1\u00c2\7\uffff\1\u00c1",
            "\1\u00c3\37\uffff\1\u00c3",
            "\1\u00c4\37\uffff\1\u00c4",
            "\1\u00c5\37\uffff\1\u00c5",
            "\1\u00c6\1\u00c7\1\u00c8\35\uffff\1\u00c6\1\u00c7\1\u00c8",
            "\1\u00c9\37\uffff\1\u00c9",
            "\1\u00ca\37\uffff\1\u00ca",
            "\1\u00cb\37\uffff\1\u00cb",
            "",
            "\1\165\1\uffff\12\u00cc\7\uffff\4\167\1\u00cd\1\167\32\uffff"+
            "\4\167\1\u00cd\1\167",
            "",
            "",
            "\1\165\1\uffff\1\165\2\uffff\12\u00ce\7\uffff\6\167\32\uffff"+
            "\6\167",
            "",
            "",
            "\1\u00cf\37\uffff\1\u00cf",
            "\1\u00d0\37\uffff\1\u00d0",
            "\1\u00d1\37\uffff\1\u00d1",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00d3\37\uffff\1\u00d3",
            "\1\u00d4\37\uffff\1\u00d4",
            "\1\u00d5\37\uffff\1\u00d5",
            "\1\u00d6\37\uffff\1\u00d6",
            "\12\u00d7\7\uffff\6\u00d7\32\uffff\6\u00d7",
            "\1\u00d8\37\uffff\1\u00d8",
            "\1\u00d9\37\uffff\1\u00d9",
            "\12\u00d7\7\uffff\6\u00d7\24\51\4\uffff\1\51\1\uffff\6\u00d7"+
            "\24\51",
            "\12\51\7\uffff\16\51\1\u00dc\13\51\4\uffff\1\51\1\uffff\16"+
            "\51\1\u00dc\13\51",
            "\1\u00dd\37\uffff\1\u00dd",
            "\1\u00de\37\uffff\1\u00de",
            "",
            "\12\51\7\uffff\10\51\1\u00e0\21\51\4\uffff\1\51\1\uffff\10"+
            "\51\1\u00e0\21\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00e2\37\uffff\1\u00e2",
            "\1\u00e3\37\uffff\1\u00e3",
            "\1\u00e4\37\uffff\1\u00e4",
            "\1\u00e5\37\uffff\1\u00e5",
            "\12\51\7\uffff\22\51\1\u00e7\7\51\4\uffff\1\51\1\uffff\22\51"+
            "\1\u00e7\7\51",
            "",
            "\1\u00e8\37\uffff\1\u00e8",
            "\12\51\7\uffff\16\51\1\u00ea\13\51\4\uffff\1\51\1\uffff\16"+
            "\51\1\u00ea\13\51",
            "\1\u00eb\37\uffff\1\u00eb",
            "\1\u00ec\37\uffff\1\u00ec",
            "\1\u00ed\37\uffff\1\u00ed",
            "",
            "\1\u00ee\37\uffff\1\u00ee",
            "\1\u00ef\37\uffff\1\u00ef",
            "\1\u00f0\37\uffff\1\u00f0",
            "\1\u00f1\37\uffff\1\u00f1",
            "\12\51\7\uffff\21\51\1\u00f3\10\51\4\uffff\1\51\1\uffff\21"+
            "\51\1\u00f3\10\51",
            "\1\u00f4\37\uffff\1\u00f4",
            "\1\u00f5\37\uffff\1\u00f5",
            "\1\u00f6\37\uffff\1\u00f6",
            "\12\u00d7\7\uffff\6\u00d7\2\uffff\1\u00f7\27\uffff\6\u00d7"+
            "\2\uffff\1\u00f7",
            "\1\u00f8\37\uffff\1\u00f8",
            "\1\u00f9\37\uffff\1\u00f9",
            "\1\u00fa\37\uffff\1\u00fa",
            "\1\u00fb\37\uffff\1\u00fb",
            "\1\u00fc\37\uffff\1\u00fc",
            "\1\u00fd\37\uffff\1\u00fd",
            "\1\u00fe\37\uffff\1\u00fe",
            "\1\u00ff\37\uffff\1\u00ff",
            "\1\u0100\37\uffff\1\u0100",
            "\1\u0101\37\uffff\1\u0101",
            "",
            "\1\u0102\37\uffff\1\u0102",
            "\1\u0103\37\uffff\1\u0103",
            "\1\u0104\37\uffff\1\u0104",
            "\1\u0105\37\uffff\1\u0105",
            "\1\u0106\37\uffff\1\u0106",
            "\1\u0107\37\uffff\1\u0107",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0109\37\uffff\1\u0109",
            "\1\u010b\10\uffff\1\u010a\26\uffff\1\u010b\10\uffff\1\u010a",
            "\1\u010c\37\uffff\1\u010c",
            "\1\u010d\37\uffff\1\u010d",
            "\1\u010e\37\uffff\1\u010e",
            "",
            "\1\u010f\37\uffff\1\u010f",
            "\1\u0110\37\uffff\1\u0110",
            "",
            "",
            "\1\u0111\37\uffff\1\u0111",
            "\1\u0112\37\uffff\1\u0112",
            "\1\u0113\37\uffff\1\u0113",
            "\1\u0114\5\uffff\1\u0115\31\uffff\1\u0114\5\uffff\1\u0115",
            "\1\u0116\37\uffff\1\u0116",
            "\1\u0117\37\uffff\1\u0117",
            "\1\u0118\37\uffff\1\u0118",
            "\1\u0119\37\uffff\1\u0119",
            "\1\u011a\37\uffff\1\u011a",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u011c\37\uffff\1\u011c",
            "\1\u011d\37\uffff\1\u011d",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0120\37\uffff\1\u0120",
            "\1\u0121\37\uffff\1\u0121",
            "\1\165\1\uffff\12\u0122\7\uffff\4\167\1\u0123\1\167\32\uffff"+
            "\4\167\1\u0123\1\167",
            "\1\165\1\uffff\1\165\2\uffff\12\u0124\7\uffff\6\167\32\uffff"+
            "\6\167",
            "\12\u0124\7\uffff\6\167\32\uffff\6\167",
            "\1\u0125\37\uffff\1\u0125",
            "\1\u0126\37\uffff\1\u0126",
            "\1\u0127\37\uffff\1\u0127",
            "",
            "\1\u0128\37\uffff\1\u0128",
            "\1\u0129\37\uffff\1\u0129",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u012b\37\uffff\1\u012b",
            "\12\u012c\7\uffff\6\u012c\32\uffff\6\u012c",
            "\1\u012d\37\uffff\1\u012d",
            "\1\u012e\37\uffff\1\u012e",
            "",
            "",
            "\1\u012f\37\uffff\1\u012f",
            "\1\u0130\37\uffff\1\u0130",
            "\1\u0131\37\uffff\1\u0131",
            "",
            "\1\u0132\37\uffff\1\u0132",
            "",
            "\1\u0133\37\uffff\1\u0133",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0135\37\uffff\1\u0135",
            "\1\u0136\37\uffff\1\u0136",
            "",
            "\1\u0137\37\uffff\1\u0137",
            "\1\u0138\37\uffff\1\u0138",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u013a\37\uffff\1\u013a",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u013c\37\uffff\1\u013c",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u013e\37\uffff\1\u013e",
            "\1\u013f\37\uffff\1\u013f",
            "\1\u0140\37\uffff\1\u0140",
            "",
            "\12\51\7\uffff\22\51\1\u0142\7\51\4\uffff\1\51\1\uffff\22\51"+
            "\1\u0142\7\51",
            "\1\u0143\37\uffff\1\u0143",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0146\37\uffff\1\u0146",
            "\1\u0147\37\uffff\1\u0147",
            "\1\u0148\37\uffff\1\u0148",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u014a\37\uffff\1\u014a",
            "\1\u014b\37\uffff\1\u014b",
            "\1\u014c\37\uffff\1\u014c",
            "\1\u014d\37\uffff\1\u014d",
            "\1\u014e\37\uffff\1\u014e",
            "\1\u014f\37\uffff\1\u014f",
            "\1\u0150\37\uffff\1\u0150",
            "\1\u0151\37\uffff\1\u0151",
            "\1\u0152\37\uffff\1\u0152",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0154\37\uffff\1\u0154",
            "\1\u0155\37\uffff\1\u0155",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u0157\37\uffff\1\u0157",
            "\1\u0158\37\uffff\1\u0158",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u015a\1\uffff\1\u015b\35\uffff\1\u015a\1\uffff\1\u015b",
            "\1\u015c\37\uffff\1\u015c",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u015e\37\uffff\1\u015e",
            "\1\u015f\37\uffff\1\u015f",
            "\1\u0160\37\uffff\1\u0160",
            "\1\u0161\37\uffff\1\u0161",
            "\1\u0162\37\uffff\1\u0162",
            "\1\u0163\37\uffff\1\u0163",
            "\1\u0164\37\uffff\1\u0164",
            "\1\u0165\37\uffff\1\u0165",
            "\1\u0166\37\uffff\1\u0166",
            "\1\u0167\37\uffff\1\u0167",
            "\1\u0168\37\uffff\1\u0168",
            "\1\u0169\37\uffff\1\u0169",
            "",
            "\1\u016a\37\uffff\1\u016a",
            "\1\u016b\37\uffff\1\u016b",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u016d\37\uffff\1\u016d",
            "\1\165\1\uffff\12\u016e\7\uffff\4\167\1\u016f\1\167\32\uffff"+
            "\4\167\1\u016f\1\167",
            "\1\165\1\uffff\1\165\2\uffff\12\u0170\7\uffff\6\167\32\uffff"+
            "\6\167",
            "\12\u0170\7\uffff\6\167\32\uffff\6\167",
            "\1\u0171\37\uffff\1\u0171",
            "\1\u0172\37\uffff\1\u0172",
            "\1\u0173\37\uffff\1\u0173",
            "\1\u0174\37\uffff\1\u0174",
            "\1\u0175\37\uffff\1\u0175",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\u0176\7\uffff\6\u0176\32\uffff\6\u0176",
            "\1\u0177\37\uffff\1\u0177",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u017d\37\uffff\1\u017d",
            "",
            "\1\u017e\37\uffff\1\u017e",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0180\37\uffff\1\u0180",
            "\1\u0181\37\uffff\1\u0181",
            "",
            "\1\u0182\37\uffff\1\u0182",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u0184\37\uffff\1\u0184",
            "\1\u0185\37\uffff\1\u0185",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\1\u0189\37\uffff\1\u0189",
            "\1\u018a\37\uffff\1\u018a",
            "\1\u018b\37\uffff\1\u018b",
            "",
            "\1\u018c\37\uffff\1\u018c",
            "\12\51\7\uffff\4\51\1\u018e\25\51\4\uffff\1\51\1\uffff\4\51"+
            "\1\u018e\25\51",
            "\1\u018f\37\uffff\1\u018f",
            "\1\u0190\37\uffff\1\u0190",
            "\1\u0191\37\uffff\1\u0191",
            "\1\u0192\37\uffff\1\u0192",
            "\1\u0193\37\uffff\1\u0193",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u0196\37\uffff\1\u0196",
            "\1\u0197\37\uffff\1\u0197",
            "",
            "\1\u0198\37\uffff\1\u0198",
            "\1\u0199\37\uffff\1\u0199",
            "",
            "\1\u019a\37\uffff\1\u019a",
            "\1\u019b\37\uffff\1\u019b",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u019f\37\uffff\1\u019f",
            "\1\u01a0\37\uffff\1\u01a0",
            "\1\u01a1\37\uffff\1\u01a1",
            "\1\u01a2\37\uffff\1\u01a2",
            "\1\u01a3\37\uffff\1\u01a3",
            "\1\u01a4\37\uffff\1\u01a4",
            "\1\u01a5\37\uffff\1\u01a5",
            "\1\u01a6\37\uffff\1\u01a6",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u01a8\37\uffff\1\u01a8",
            "\1\u01a9\37\uffff\1\u01a9",
            "\1\u01aa\37\uffff\1\u01aa",
            "",
            "\1\u01ab\37\uffff\1\u01ab",
            "\1\165\1\uffff\12\u01ac\7\uffff\4\167\1\u01ad\1\167\32\uffff"+
            "\4\167\1\u01ad\1\167",
            "\1\165\1\uffff\1\165\2\uffff\12\u01ae\7\uffff\6\167\32\uffff"+
            "\6\167",
            "\12\u01ae\7\uffff\6\167\32\uffff\6\167",
            "\1\u01af\37\uffff\1\u01af",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u01b1\37\uffff\1\u01b1",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\u01b4\7\uffff\6\u01b4\32\uffff\6\u01b4",
            "\1\u01b5\37\uffff\1\u01b5",
            "",
            "",
            "",
            "",
            "",
            "\1\u01b6\37\uffff\1\u01b6",
            "\1\u01b7\37\uffff\1\u01b7",
            "",
            "\1\u01b8\37\uffff\1\u01b8",
            "\1\u01b9\37\uffff\1\u01b9",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u01bb\37\uffff\1\u01bb",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "\1\u01bd\37\uffff\1\u01bd",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u01c0\37\uffff\1\u01c0",
            "",
            "\1\u01c1\37\uffff\1\u01c1",
            "\1\u01c2\37\uffff\1\u01c2",
            "\1\u01c3\37\uffff\1\u01c3",
            "\1\u01c4\37\uffff\1\u01c4",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u01c8\37\uffff\1\u01c8",
            "\1\u01c9\37\uffff\1\u01c9",
            "\1\u01ca\37\uffff\1\u01ca",
            "\1\u01cb\37\uffff\1\u01cb",
            "\1\u01cc\37\uffff\1\u01cc",
            "",
            "",
            "",
            "\1\u01cd\37\uffff\1\u01cd",
            "\1\u01ce\37\uffff\1\u01ce",
            "\1\u01cf\37\uffff\1\u01cf",
            "\1\u01d0\37\uffff\1\u01d0",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u01d6\37\uffff\1\u01d6",
            "\1\u01d7\37\uffff\1\u01d7",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\165\1\uffff\12\u01d9\7\uffff\4\167\1\u01da\1\167\32\uffff"+
            "\4\167\1\u01da\1\167",
            "\1\165\1\uffff\1\165\2\uffff\12\u01db\7\uffff\6\167\32\uffff"+
            "\6\167",
            "\12\u01db\7\uffff\6\167\32\uffff\6\167",
            "\1\u01dc\37\uffff\1\u01dc",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\12\u01de\7\uffff\6\u01de\32\uffff\6\u01de",
            "\1\u01df\37\uffff\1\u01df",
            "\1\u01e0\37\uffff\1\u01e0",
            "\1\u01e1\37\uffff\1\u01e1",
            "\1\u01e2\37\uffff\1\u01e2",
            "\1\u01e3\37\uffff\1\u01e3",
            "",
            "\1\u01e4\37\uffff\1\u01e4",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\1\u01e6\37\uffff\1\u01e6",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u01e8\37\uffff\1\u01e8",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u01ea\37\uffff\1\u01ea",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u01ed\37\uffff\1\u01ed",
            "\1\u01ee\37\uffff\1\u01ee",
            "\1\u01ef\37\uffff\1\u01ef",
            "\1\u01f0\37\uffff\1\u01f0",
            "\1\u01f1\37\uffff\1\u01f1",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "",
            "",
            "\1\u01f4\37\uffff\1\u01f4",
            "\1\u01f5\37\uffff\1\u01f5",
            "",
            "\1\165\1\uffff\12\u01f6\7\uffff\4\167\1\u01f7\1\167\32\uffff"+
            "\4\167\1\u01f7\1\167",
            "\1\165\1\uffff\1\165\2\uffff\12\u01f8\7\uffff\6\167\32\uffff"+
            "\6\167",
            "\12\u01f8\7\uffff\6\167\32\uffff\6\167",
            "\1\u01f9\37\uffff\1\u01f9",
            "",
            "\1\167",
            "\1\u01fa\37\uffff\1\u01fa",
            "\1\u01fb\37\uffff\1\u01fb",
            "\1\u01fc\37\uffff\1\u01fc",
            "\12\51\7\uffff\22\51\1\u01fd\7\51\4\uffff\1\51\1\uffff\22\51"+
            "\1\u01fd\7\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u0201\37\uffff\1\u0201",
            "",
            "\1\u0202\37\uffff\1\u0202",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0204\37\uffff\1\u0204",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0206\37\uffff\1\u0206",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\1\u0208\37\uffff\1\u0208",
            "\1\u0209\37\uffff\1\u0209",
            "\1\167\1\165\1\uffff\12\56\13\uffff\1\165\37\uffff\1\165",
            "\1\165\1\uffff\1\u020a\2\uffff\12\165",
            "\1\167",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "\1\u0210\37\uffff\1\u0210",
            "\1\u0211\37\uffff\1\u0211",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u0213\37\uffff\1\u0213",
            "",
            "\1\u0214\37\uffff\1\u0214",
            "\1\u0215\37\uffff\1\u0215",
            "\12\u0216\7\uffff\6\167\32\uffff\6\167",
            "",
            "",
            "",
            "",
            "",
            "\1\u0217\37\uffff\1\u0217",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\22\51\1\u021a\7\51\4\uffff\1\51\1\uffff\22\51"+
            "\1\u021a\7\51",
            "\1\u021b\37\uffff\1\u021b",
            "\1\u021c\37\uffff\1\u021c",
            "\12\u021d\7\uffff\6\167\32\uffff\6\167",
            "\1\u021e\37\uffff\1\u021e",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\u0222\7\uffff\6\167\32\uffff\6\167",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "\12\u0223\7\uffff\6\167\32\uffff\6\167",
            "\1\167"
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | K_SELECT | K_FROM | K_AS | K_WHERE | K_AND | K_KEY | K_INSERT | K_UPDATE | K_WITH | K_LIMIT | K_USING | K_USE | K_DISTINCT | K_COUNT | K_SET | K_BEGIN | K_UNLOGGED | K_BATCH | K_APPLY | K_TRUNCATE | K_DELETE | K_IN | K_CREATE | K_KEYSPACE | K_KEYSPACES | K_COLUMNFAMILY | K_INDEX | K_CUSTOM | K_ON | K_TO | K_DROP | K_PRIMARY | K_INTO | K_VALUES | K_TIMESTAMP | K_TTL | K_ALTER | K_RENAME | K_ADD | K_TYPE | K_COMPACT | K_STORAGE | K_ORDER | K_BY | K_ASC | K_DESC | K_ALLOW | K_FILTERING | K_IF | K_GRANT | K_ALL | K_PERMISSION | K_PERMISSIONS | K_OF | K_REVOKE | K_MODIFY | K_AUTHORIZE | K_NORECURSIVE | K_USER | K_USERS | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD | K_CLUSTERING | K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INET | K_INT | K_TEXT | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID | K_TOKEN | K_WRITETIME | K_NULL | K_NOT | K_EXISTS | K_MAP | K_LIST | K_NAN | K_INFINITY | K_TRIGGER | K_STATIC | STRING_LITERAL | QUOTED_NAME | INTEGER | QMARK | FLOAT | BOOLEAN | IDENT | HEXNUMBER | UUID | WS | COMMENT | MULTILINE_COMMENT );";
        }
    }
 

}