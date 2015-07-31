// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g 2015-07-31 01:02:51

    package org.apache.cassandra.cql3;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Collections;
    import java.util.EnumSet;
    import java.util.HashMap;
    import java.util.LinkedHashMap;
    import java.util.List;
    import java.util.Map;
    import java.util.Set;

    import org.apache.cassandra.auth.Permission;
    import org.apache.cassandra.auth.DataResource;
    import org.apache.cassandra.auth.IResource;
    import org.apache.cassandra.cql3.*;
    import org.apache.cassandra.cql3.statements.*;
    import org.apache.cassandra.cql3.functions.FunctionCall;
    import org.apache.cassandra.db.marshal.CollectionType;
    import org.apache.cassandra.exceptions.ConfigurationException;
    import org.apache.cassandra.exceptions.InvalidRequestException;
    import org.apache.cassandra.exceptions.SyntaxException;
    import org.apache.cassandra.utils.Pair;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "K_USE", "K_SELECT", "K_DISTINCT", "K_COUNT", "K_AS", "K_FROM", "K_WHERE", "K_ORDER", "K_BY", "K_LIMIT", "K_ALLOW", "K_FILTERING", "K_WRITETIME", "K_TTL", "INTEGER", "K_AND", "K_ASC", "K_DESC", "K_INSERT", "K_INTO", "K_VALUES", "K_IF", "K_NOT", "K_EXISTS", "K_USING", "K_TIMESTAMP", "K_UPDATE", "K_SET", "K_DELETE", "K_BEGIN", "K_UNLOGGED", "K_COUNTER", "K_BATCH", "K_APPLY", "K_CREATE", "K_KEYSPACE", "K_WITH", "K_COLUMNFAMILY", "K_STATIC", "K_PRIMARY", "K_KEY", "K_COMPACT", "K_STORAGE", "K_CLUSTERING", "K_CUSTOM", "K_INDEX", "IDENT", "K_ON", "STRING_LITERAL", "K_TRIGGER", "K_DROP", "K_ALTER", "K_TYPE", "K_ADD", "K_RENAME", "K_TO", "K_TRUNCATE", "K_GRANT", "K_REVOKE", "K_LIST", "K_OF", "K_NORECURSIVE", "K_MODIFY", "K_AUTHORIZE", "K_ALL", "K_PERMISSIONS", "K_PERMISSION", "K_KEYSPACES", "K_USER", "K_SUPERUSER", "K_NOSUPERUSER", "K_USERS", "K_PASSWORD", "QUOTED_NAME", "QMARK", "FLOAT", "BOOLEAN", "UUID", "HEXNUMBER", "K_NAN", "K_INFINITY", "K_NULL", "K_TOKEN", "K_IN", "K_ASCII", "K_BIGINT", "K_BLOB", "K_BOOLEAN", "K_DECIMAL", "K_DOUBLE", "K_FLOAT", "K_INET", "K_INT", "K_TEXT", "K_UUID", "K_VARCHAR", "K_VARINT", "K_TIMEUUID", "K_MAP", "S", "E", "L", "C", "T", "F", "R", "O", "M", "A", "W", "H", "N", "D", "K", "Y", "I", "U", "P", "G", "B", "X", "V", "Z", "J", "Q", "DIGIT", "LETTER", "HEX", "EXPONENT", "WS", "COMMENT", "MULTILINE_COMMENT", "';'", "'('", "')'", "','", "'\\*'", "'['", "']'", "'.'", "'-'", "'{'", "':'", "'}'", "'='", "'+'", "'<'", "'<='", "'>'", "'>='"
    };
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
    public static final int K_DISTINCT=6;
    public static final int T__148=148;
    public static final int STRING_LITERAL=52;
    public static final int T__147=147;
    public static final int K_GRANT=61;
    public static final int T__149=149;
    public static final int K_ON=51;
    public static final int K_USING=28;
    public static final int K_ADD=57;
    public static final int K_ASC=20;
    public static final int K_CUSTOM=48;
    public static final int K_KEY=44;
    public static final int COMMENT=134;
    public static final int K_TRUNCATE=60;
    public static final int T__150=150;
    public static final int K_ORDER=11;
    public static final int T__151=151;
    public static final int HEXNUMBER=82;
    public static final int T__152=152;
    public static final int K_OF=64;
    public static final int K_ALL=68;
    public static final int T__153=153;
    public static final int D=116;
    public static final int T__139=139;
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
    public static final int K_TOKEN=86;
    public static final int QMARK=78;
    public static final int K_UUID=98;
    public static final int K_BATCH=36;
    public static final int K_ASCII=88;
    public static final int UUID=81;
    public static final int K_LIST=63;
    public static final int K_DELETE=32;
    public static final int K_TO=59;
    public static final int K_BY=12;
    public static final int FLOAT=79;
    public static final int K_VARINT=100;
    public static final int K_FLOAT=94;
    public static final int K_SUPERUSER=73;
    public static final int K_DOUBLE=93;
    public static final int K_SELECT=5;
    public static final int K_LIMIT=13;
    public static final int K_BOOLEAN=91;
    public static final int K_ALTER=55;
    public static final int K_SET=31;
    public static final int K_TRIGGER=53;
    public static final int K_WHERE=10;
    public static final int QUOTED_NAME=77;
    public static final int MULTILINE_COMMENT=135;
    public static final int K_BLOB=90;
    public static final int BOOLEAN=80;
    public static final int K_UNLOGGED=34;
    public static final int HEX=131;
    public static final int K_INTO=23;
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
    public static final int K_NAN=83;
    public static final int K_IF=25;
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

    // delegates
    // delegators


        public CqlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CqlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return CqlParser.tokenNames; }
    public String getGrammarFileName() { return "/home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g"; }


        private final List<String> recognitionErrors = new ArrayList<String>();
        private final List<ColumnIdentifier> bindVariables = new ArrayList<ColumnIdentifier>();

        public AbstractMarker.Raw newBindVariables(ColumnIdentifier name)
        {
            AbstractMarker.Raw marker = new AbstractMarker.Raw(bindVariables.size());
            bindVariables.add(name);
            return marker;
        }

        public AbstractMarker.INRaw newINBindVariables(ColumnIdentifier name)
        {
            AbstractMarker.INRaw marker = new AbstractMarker.INRaw(bindVariables.size());
            bindVariables.add(name);
            return marker;
        }

        public Tuples.Raw newTupleBindVariables(ColumnIdentifier name)
        {
            Tuples.Raw marker = new Tuples.Raw(bindVariables.size());
            bindVariables.add(name);
            return marker;
        }

        public Tuples.INRaw newTupleINBindVariables(ColumnIdentifier name)
        {
            Tuples.INRaw marker = new Tuples.INRaw(bindVariables.size());
            bindVariables.add(name);
            return marker;
        }

        public void displayRecognitionError(String[] tokenNames, RecognitionException e)
        {
            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);
            recognitionErrors.add(hdr + " " + msg);
        }

        public void addRecognitionError(String msg)
        {
            recognitionErrors.add(msg);
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

        public Map<String, String> convertPropertyMap(Maps.Literal map)
        {
            if (map == null || map.entries == null || map.entries.isEmpty())
                return Collections.<String, String>emptyMap();

            Map<String, String> res = new HashMap<String, String>(map.entries.size());

            for (Pair<Term.Raw, Term.Raw> entry : map.entries)
            {
                // Because the parser tries to be smart and recover on error (to
                // allow displaying more than one error I suppose), we have null
                // entries in there. Just skip those, a proper error will be thrown in the end.
                if (entry.left == null || entry.right == null)
                    break;

                if (!(entry.left instanceof Constants.Literal))
                {
                    String msg = "Invalid property name: " + entry.left;
                    if (entry.left instanceof AbstractMarker.Raw)
                        msg += " (bind variables are not supported in DDL queries)";
                    addRecognitionError(msg);
                    break;
                }
                if (!(entry.right instanceof Constants.Literal))
                {
                    String msg = "Invalid property value: " + entry.right + " for property: " + entry.left;
                    if (entry.right instanceof AbstractMarker.Raw)
                        msg += " (bind variables are not supported in DDL queries)";
                    addRecognitionError(msg);
                    break;
                }

                res.put(((Constants.Literal)entry.left).getRawText(), ((Constants.Literal)entry.right).getRawText());
            }

            return res;
        }

        public void addRawUpdate(List<Pair<ColumnIdentifier.Raw, Operation.RawUpdate>> operations, ColumnIdentifier.Raw key, Operation.RawUpdate update)
        {
            for (Pair<ColumnIdentifier.Raw, Operation.RawUpdate> p : operations)
            {
                if (p.left.equals(key) && !p.right.isCompatibleWith(update))
                    addRecognitionError("Multiple incompatible setting of column " + key);
            }
            operations.add(Pair.create(key, update));
        }



    // $ANTLR start "query"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:200:1: query returns [ParsedStatement stmnt] : st= cqlStatement ( ';' )* EOF ;
    public final ParsedStatement query() throws RecognitionException {
        ParsedStatement stmnt = null;

        ParsedStatement st = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:203:5: (st= cqlStatement ( ';' )* EOF )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:203:7: st= cqlStatement ( ';' )* EOF
            {
            pushFollow(FOLLOW_cqlStatement_in_query72);
            st=cqlStatement();

            state._fsp--;

            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:203:23: ( ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==136) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:203:24: ';'
            	    {
            	    match(input,136,FOLLOW_136_in_query75); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_query79); 
             stmnt = st; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmnt;
    }
    // $ANTLR end "query"


    // $ANTLR start "cqlStatement"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:206:1: cqlStatement returns [ParsedStatement stmt] : (st1= selectStatement | st2= insertStatement | st3= updateStatement | st4= batchStatement | st5= deleteStatement | st6= useStatement | st7= truncateStatement | st8= createKeyspaceStatement | st9= createTableStatement | st10= createIndexStatement | st11= dropKeyspaceStatement | st12= dropTableStatement | st13= dropIndexStatement | st14= alterTableStatement | st15= alterKeyspaceStatement | st16= grantStatement | st17= revokeStatement | st18= listPermissionsStatement | st19= createUserStatement | st20= alterUserStatement | st21= dropUserStatement | st22= listUsersStatement | st23= createTriggerStatement | st24= dropTriggerStatement );
    public final ParsedStatement cqlStatement() throws RecognitionException {
        ParsedStatement stmt = null;

        SelectStatement.RawStatement st1 = null;

        UpdateStatement.ParsedInsert st2 = null;

        UpdateStatement.ParsedUpdate st3 = null;

        BatchStatement.Parsed st4 = null;

        DeleteStatement.Parsed st5 = null;

        UseStatement st6 = null;

        TruncateStatement st7 = null;

        CreateKeyspaceStatement st8 = null;

        CreateTableStatement.RawStatement st9 = null;

        CreateIndexStatement st10 = null;

        DropKeyspaceStatement st11 = null;

        DropTableStatement st12 = null;

        DropIndexStatement st13 = null;

        AlterTableStatement st14 = null;

        AlterKeyspaceStatement st15 = null;

        GrantStatement st16 = null;

        RevokeStatement st17 = null;

        ListPermissionsStatement st18 = null;

        CreateUserStatement st19 = null;

        AlterUserStatement st20 = null;

        DropUserStatement st21 = null;

        ListUsersStatement st22 = null;

        CreateTriggerStatement st23 = null;

        DropTriggerStatement st24 = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:208:5: (st1= selectStatement | st2= insertStatement | st3= updateStatement | st4= batchStatement | st5= deleteStatement | st6= useStatement | st7= truncateStatement | st8= createKeyspaceStatement | st9= createTableStatement | st10= createIndexStatement | st11= dropKeyspaceStatement | st12= dropTableStatement | st13= dropIndexStatement | st14= alterTableStatement | st15= alterKeyspaceStatement | st16= grantStatement | st17= revokeStatement | st18= listPermissionsStatement | st19= createUserStatement | st20= alterUserStatement | st21= dropUserStatement | st22= listUsersStatement | st23= createTriggerStatement | st24= dropTriggerStatement )
            int alt2=24;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:208:7: st1= selectStatement
                    {
                    pushFollow(FOLLOW_selectStatement_in_cqlStatement113);
                    st1=selectStatement();

                    state._fsp--;

                     stmt = st1; 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:209:7: st2= insertStatement
                    {
                    pushFollow(FOLLOW_insertStatement_in_cqlStatement138);
                    st2=insertStatement();

                    state._fsp--;

                     stmt = st2; 

                    }
                    break;
                case 3 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:210:7: st3= updateStatement
                    {
                    pushFollow(FOLLOW_updateStatement_in_cqlStatement163);
                    st3=updateStatement();

                    state._fsp--;

                     stmt = st3; 

                    }
                    break;
                case 4 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:211:7: st4= batchStatement
                    {
                    pushFollow(FOLLOW_batchStatement_in_cqlStatement188);
                    st4=batchStatement();

                    state._fsp--;

                     stmt = st4; 

                    }
                    break;
                case 5 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:212:7: st5= deleteStatement
                    {
                    pushFollow(FOLLOW_deleteStatement_in_cqlStatement214);
                    st5=deleteStatement();

                    state._fsp--;

                     stmt = st5; 

                    }
                    break;
                case 6 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:213:7: st6= useStatement
                    {
                    pushFollow(FOLLOW_useStatement_in_cqlStatement239);
                    st6=useStatement();

                    state._fsp--;

                     stmt = st6; 

                    }
                    break;
                case 7 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:214:7: st7= truncateStatement
                    {
                    pushFollow(FOLLOW_truncateStatement_in_cqlStatement267);
                    st7=truncateStatement();

                    state._fsp--;

                     stmt = st7; 

                    }
                    break;
                case 8 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:215:7: st8= createKeyspaceStatement
                    {
                    pushFollow(FOLLOW_createKeyspaceStatement_in_cqlStatement290);
                    st8=createKeyspaceStatement();

                    state._fsp--;

                     stmt = st8; 

                    }
                    break;
                case 9 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:216:7: st9= createTableStatement
                    {
                    pushFollow(FOLLOW_createTableStatement_in_cqlStatement307);
                    st9=createTableStatement();

                    state._fsp--;

                     stmt = st9; 

                    }
                    break;
                case 10 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:217:7: st10= createIndexStatement
                    {
                    pushFollow(FOLLOW_createIndexStatement_in_cqlStatement326);
                    st10=createIndexStatement();

                    state._fsp--;

                     stmt = st10; 

                    }
                    break;
                case 11 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:218:7: st11= dropKeyspaceStatement
                    {
                    pushFollow(FOLLOW_dropKeyspaceStatement_in_cqlStatement345);
                    st11=dropKeyspaceStatement();

                    state._fsp--;

                     stmt = st11; 

                    }
                    break;
                case 12 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:219:7: st12= dropTableStatement
                    {
                    pushFollow(FOLLOW_dropTableStatement_in_cqlStatement363);
                    st12=dropTableStatement();

                    state._fsp--;

                     stmt = st12; 

                    }
                    break;
                case 13 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:220:7: st13= dropIndexStatement
                    {
                    pushFollow(FOLLOW_dropIndexStatement_in_cqlStatement384);
                    st13=dropIndexStatement();

                    state._fsp--;

                     stmt = st13; 

                    }
                    break;
                case 14 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:221:7: st14= alterTableStatement
                    {
                    pushFollow(FOLLOW_alterTableStatement_in_cqlStatement405);
                    st14=alterTableStatement();

                    state._fsp--;

                     stmt = st14; 

                    }
                    break;
                case 15 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:222:7: st15= alterKeyspaceStatement
                    {
                    pushFollow(FOLLOW_alterKeyspaceStatement_in_cqlStatement425);
                    st15=alterKeyspaceStatement();

                    state._fsp--;

                     stmt = st15; 

                    }
                    break;
                case 16 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:223:7: st16= grantStatement
                    {
                    pushFollow(FOLLOW_grantStatement_in_cqlStatement442);
                    st16=grantStatement();

                    state._fsp--;

                     stmt = st16; 

                    }
                    break;
                case 17 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:224:7: st17= revokeStatement
                    {
                    pushFollow(FOLLOW_revokeStatement_in_cqlStatement467);
                    st17=revokeStatement();

                    state._fsp--;

                     stmt = st17; 

                    }
                    break;
                case 18 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:225:7: st18= listPermissionsStatement
                    {
                    pushFollow(FOLLOW_listPermissionsStatement_in_cqlStatement491);
                    st18=listPermissionsStatement();

                    state._fsp--;

                     stmt = st18; 

                    }
                    break;
                case 19 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:226:7: st19= createUserStatement
                    {
                    pushFollow(FOLLOW_createUserStatement_in_cqlStatement506);
                    st19=createUserStatement();

                    state._fsp--;

                     stmt = st19; 

                    }
                    break;
                case 20 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:227:7: st20= alterUserStatement
                    {
                    pushFollow(FOLLOW_alterUserStatement_in_cqlStatement526);
                    st20=alterUserStatement();

                    state._fsp--;

                     stmt = st20; 

                    }
                    break;
                case 21 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:228:7: st21= dropUserStatement
                    {
                    pushFollow(FOLLOW_dropUserStatement_in_cqlStatement547);
                    st21=dropUserStatement();

                    state._fsp--;

                     stmt = st21; 

                    }
                    break;
                case 22 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:229:7: st22= listUsersStatement
                    {
                    pushFollow(FOLLOW_listUsersStatement_in_cqlStatement569);
                    st22=listUsersStatement();

                    state._fsp--;

                     stmt = st22; 

                    }
                    break;
                case 23 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:230:7: st23= createTriggerStatement
                    {
                    pushFollow(FOLLOW_createTriggerStatement_in_cqlStatement590);
                    st23=createTriggerStatement();

                    state._fsp--;

                     stmt = st23; 

                    }
                    break;
                case 24 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:231:7: st24= dropTriggerStatement
                    {
                    pushFollow(FOLLOW_dropTriggerStatement_in_cqlStatement607);
                    st24=dropTriggerStatement();

                    state._fsp--;

                     stmt = st24; 

                    }
                    break;

            }
             if (stmt != null) stmt.setBoundVariables(bindVariables); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "cqlStatement"


    // $ANTLR start "useStatement"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:237:1: useStatement returns [UseStatement stmt] : K_USE ks= keyspaceName ;
    public final UseStatement useStatement() throws RecognitionException {
        UseStatement stmt = null;

        String ks = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:238:5: ( K_USE ks= keyspaceName )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:238:7: K_USE ks= keyspaceName
            {
            match(input,K_USE,FOLLOW_K_USE_in_useStatement639); 
            pushFollow(FOLLOW_keyspaceName_in_useStatement643);
            ks=keyspaceName();

            state._fsp--;

             stmt = new UseStatement(ks); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "useStatement"


    // $ANTLR start "selectStatement"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:241:1: selectStatement returns [SelectStatement.RawStatement expr] : K_SELECT ( ( K_DISTINCT )? sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= ident )? ) ) K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )? ;
    public final SelectStatement.RawStatement selectStatement() throws RecognitionException {
        SelectStatement.RawStatement expr = null;

        List<RawSelector> sclause = null;

        ColumnIdentifier c = null;

        CFName cf = null;

        List<Relation> wclause = null;

        Term.Raw rows = null;



                boolean isDistinct = false;
                boolean isCount = false;
                ColumnIdentifier countAlias = null;
                Term.Raw limit = null;
                Map<ColumnIdentifier.Raw, Boolean> orderings = new LinkedHashMap<ColumnIdentifier.Raw, Boolean>();
                boolean allowFiltering = false;
            
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:256:5: ( K_SELECT ( ( K_DISTINCT )? sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= ident )? ) ) K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )? )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:256:7: K_SELECT ( ( K_DISTINCT )? sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= ident )? ) ) K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )?
            {
            match(input,K_SELECT,FOLLOW_K_SELECT_in_selectStatement677); 
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:256:16: ( ( K_DISTINCT )? sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= ident )? ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==K_DISTINCT||LA5_0==K_AS||(LA5_0>=K_FILTERING && LA5_0<=K_TTL)||LA5_0==K_VALUES||LA5_0==K_EXISTS||LA5_0==K_TIMESTAMP||LA5_0==K_COUNTER||LA5_0==K_STATIC||(LA5_0>=K_KEY && LA5_0<=K_CUSTOM)||LA5_0==IDENT||LA5_0==K_TRIGGER||LA5_0==K_TYPE||LA5_0==K_LIST||(LA5_0>=K_ALL && LA5_0<=QUOTED_NAME)||LA5_0==K_TOKEN||(LA5_0>=K_ASCII && LA5_0<=K_MAP)||LA5_0==140) ) {
                alt5=1;
            }
            else if ( (LA5_0==K_COUNT) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==137) ) {
                    alt5=2;
                }
                else if ( ((LA5_2>=K_AS && LA5_2<=K_FROM)||LA5_2==139) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:256:18: ( K_DISTINCT )? sclause= selectClause
                    {
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:256:18: ( K_DISTINCT )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==K_DISTINCT) ) {
                        int LA3_1 = input.LA(2);

                        if ( (LA3_1==K_AS) ) {
                            int LA3_3 = input.LA(3);

                            if ( (LA3_3==K_AS) ) {
                                int LA3_5 = input.LA(4);

                                if ( ((LA3_5>=K_DISTINCT && LA3_5<=K_AS)||(LA3_5>=K_FILTERING && LA3_5<=K_TTL)||LA3_5==K_VALUES||LA3_5==K_EXISTS||LA3_5==K_TIMESTAMP||LA3_5==K_COUNTER||LA3_5==K_STATIC||(LA3_5>=K_KEY && LA3_5<=K_CUSTOM)||LA3_5==IDENT||LA3_5==K_TRIGGER||LA3_5==K_TYPE||LA3_5==K_LIST||(LA3_5>=K_ALL && LA3_5<=QUOTED_NAME)||(LA3_5>=K_ASCII && LA3_5<=K_MAP)) ) {
                                    alt3=1;
                                }
                            }
                            else if ( (LA3_3==K_FROM||LA3_3==137||LA3_3==139) ) {
                                alt3=1;
                            }
                        }
                        else if ( ((LA3_1>=K_DISTINCT && LA3_1<=K_COUNT)||(LA3_1>=K_FILTERING && LA3_1<=K_TTL)||LA3_1==K_VALUES||LA3_1==K_EXISTS||LA3_1==K_TIMESTAMP||LA3_1==K_COUNTER||LA3_1==K_STATIC||(LA3_1>=K_KEY && LA3_1<=K_CUSTOM)||LA3_1==IDENT||LA3_1==K_TRIGGER||LA3_1==K_TYPE||LA3_1==K_LIST||(LA3_1>=K_ALL && LA3_1<=QUOTED_NAME)||LA3_1==K_TOKEN||(LA3_1>=K_ASCII && LA3_1<=K_MAP)||LA3_1==140) ) {
                            alt3=1;
                        }
                    }
                    switch (alt3) {
                        case 1 :
                            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:256:20: K_DISTINCT
                            {
                            match(input,K_DISTINCT,FOLLOW_K_DISTINCT_in_selectStatement683); 
                             isDistinct = true; 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_selectClause_in_selectStatement692);
                    sclause=selectClause();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:257:18: ( K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= ident )? )
                    {
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:257:18: ( K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= ident )? )
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:257:19: K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= ident )?
                    {
                    match(input,K_COUNT,FOLLOW_K_COUNT_in_selectStatement712); 
                    match(input,137,FOLLOW_137_in_selectStatement714); 
                    pushFollow(FOLLOW_selectCountClause_in_selectStatement718);
                    sclause=selectCountClause();

                    state._fsp--;

                    match(input,138,FOLLOW_138_in_selectStatement720); 
                     isCount = true; 
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:257:81: ( K_AS c= ident )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==K_AS) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:257:82: K_AS c= ident
                            {
                            match(input,K_AS,FOLLOW_K_AS_in_selectStatement725); 
                            pushFollow(FOLLOW_ident_in_selectStatement729);
                            c=ident();

                            state._fsp--;

                             countAlias = c; 

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            match(input,K_FROM,FOLLOW_K_FROM_in_selectStatement744); 
            pushFollow(FOLLOW_columnFamilyName_in_selectStatement748);
            cf=columnFamilyName();

            state._fsp--;

            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:259:7: ( K_WHERE wclause= whereClause )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==K_WHERE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:259:9: K_WHERE wclause= whereClause
                    {
                    match(input,K_WHERE,FOLLOW_K_WHERE_in_selectStatement758); 
                    pushFollow(FOLLOW_whereClause_in_selectStatement762);
                    wclause=whereClause();

                    state._fsp--;


                    }
                    break;

            }

            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:260:7: ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==K_ORDER) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:260:9: K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )*
                    {
                    match(input,K_ORDER,FOLLOW_K_ORDER_in_selectStatement775); 
                    match(input,K_BY,FOLLOW_K_BY_in_selectStatement777); 
                    pushFollow(FOLLOW_orderByClause_in_selectStatement779);
                    orderByClause(orderings);

                    state._fsp--;

                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:260:47: ( ',' orderByClause[orderings] )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==139) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:260:49: ',' orderByClause[orderings]
                    	    {
                    	    match(input,139,FOLLOW_139_in_selectStatement784); 
                    	    pushFollow(FOLLOW_orderByClause_in_selectStatement786);
                    	    orderByClause(orderings);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:261:7: ( K_LIMIT rows= intValue )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==K_LIMIT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:261:9: K_LIMIT rows= intValue
                    {
                    match(input,K_LIMIT,FOLLOW_K_LIMIT_in_selectStatement803); 
                    pushFollow(FOLLOW_intValue_in_selectStatement807);
                    rows=intValue();

                    state._fsp--;

                     limit = rows; 

                    }
                    break;

            }

            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:262:7: ( K_ALLOW K_FILTERING )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==K_ALLOW) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:262:9: K_ALLOW K_FILTERING
                    {
                    match(input,K_ALLOW,FOLLOW_K_ALLOW_in_selectStatement822); 
                    match(input,K_FILTERING,FOLLOW_K_FILTERING_in_selectStatement824); 
                     allowFiltering = true; 

                    }
                    break;

            }


                      SelectStatement.Parameters params = new SelectStatement.Parameters(orderings,
                                                                                         isDistinct,
                                                                                         isCount,
                                                                                         countAlias,
                                                                                         allowFiltering);
                      expr = new SelectStatement.RawStatement(cf, params, sclause, wclause, limit);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "selectStatement"


    // $ANTLR start "selectClause"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:273:1: selectClause returns [List<RawSelector> expr] : (t1= selector ( ',' tN= selector )* | '\\*' );
    public final List<RawSelector> selectClause() throws RecognitionException {
        List<RawSelector> expr = null;

        RawSelector t1 = null;

        RawSelector tN = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:274:5: (t1= selector ( ',' tN= selector )* | '\\*' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=K_DISTINCT && LA12_0<=K_AS)||(LA12_0>=K_FILTERING && LA12_0<=K_TTL)||LA12_0==K_VALUES||LA12_0==K_EXISTS||LA12_0==K_TIMESTAMP||LA12_0==K_COUNTER||LA12_0==K_STATIC||(LA12_0>=K_KEY && LA12_0<=K_CUSTOM)||LA12_0==IDENT||LA12_0==K_TRIGGER||LA12_0==K_TYPE||LA12_0==K_LIST||(LA12_0>=K_ALL && LA12_0<=QUOTED_NAME)||LA12_0==K_TOKEN||(LA12_0>=K_ASCII && LA12_0<=K_MAP)) ) {
                alt12=1;
            }
            else if ( (LA12_0==140) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:274:7: t1= selector ( ',' tN= selector )*
                    {
                    pushFollow(FOLLOW_selector_in_selectClause861);
                    t1=selector();

                    state._fsp--;

                     expr = new ArrayList<RawSelector>(); expr.add(t1); 
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:274:76: ( ',' tN= selector )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==139) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:274:77: ',' tN= selector
                    	    {
                    	    match(input,139,FOLLOW_139_in_selectClause866); 
                    	    pushFollow(FOLLOW_selector_in_selectClause870);
                    	    tN=selector();

                    	    state._fsp--;

                    	     expr.add(tN); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:275:7: '\\*'
                    {
                    match(input,140,FOLLOW_140_in_selectClause882); 
                     expr = Collections.<RawSelector>emptyList();

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "selectClause"


    // $ANTLR start "selector"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:278:1: selector returns [RawSelector s] : us= unaliasedSelector ( K_AS c= ident )? ;
    public final RawSelector selector() throws RecognitionException {
        RawSelector s = null;

        Selectable.Raw us = null;

        ColumnIdentifier c = null;


         ColumnIdentifier alias = null; 
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:280:5: (us= unaliasedSelector ( K_AS c= ident )? )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:280:7: us= unaliasedSelector ( K_AS c= ident )?
            {
            pushFollow(FOLLOW_unaliasedSelector_in_selector915);
            us=unaliasedSelector();

            state._fsp--;

            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:280:28: ( K_AS c= ident )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==K_AS) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:280:29: K_AS c= ident
                    {
                    match(input,K_AS,FOLLOW_K_AS_in_selector918); 
                    pushFollow(FOLLOW_ident_in_selector922);
                    c=ident();

                    state._fsp--;

                     alias = c; 

                    }
                    break;

            }

             s = new RawSelector(us, alias); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return s;
    }
    // $ANTLR end "selector"


    // $ANTLR start "unaliasedSelector"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:283:1: unaliasedSelector returns [Selectable.Raw s] : (c= cident | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | f= functionName args= selectionFunctionArgs );
    public final Selectable.Raw unaliasedSelector() throws RecognitionException {
        Selectable.Raw s = null;

        ColumnIdentifier.Raw c = null;

        String f = null;

        List<Selectable.Raw> args = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:284:5: (c= cident | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | f= functionName args= selectionFunctionArgs )
            int alt14=4;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:284:7: c= cident
                    {
                    pushFollow(FOLLOW_cident_in_unaliasedSelector951);
                    c=cident();

                    state._fsp--;

                     s = c; 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:285:7: K_WRITETIME '(' c= cident ')'
                    {
                    match(input,K_WRITETIME,FOLLOW_K_WRITETIME_in_unaliasedSelector994); 
                    match(input,137,FOLLOW_137_in_unaliasedSelector996); 
                    pushFollow(FOLLOW_cident_in_unaliasedSelector1000);
                    c=cident();

                    state._fsp--;

                    match(input,138,FOLLOW_138_in_unaliasedSelector1002); 
                     s = new Selectable.WritetimeOrTTL.Raw(c, true); 

                    }
                    break;
                case 3 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:286:7: K_TTL '(' c= cident ')'
                    {
                    match(input,K_TTL,FOLLOW_K_TTL_in_unaliasedSelector1025); 
                    match(input,137,FOLLOW_137_in_unaliasedSelector1033); 
                    pushFollow(FOLLOW_cident_in_unaliasedSelector1037);
                    c=cident();

                    state._fsp--;

                    match(input,138,FOLLOW_138_in_unaliasedSelector1039); 
                     s = new Selectable.WritetimeOrTTL.Raw(c, false); 

                    }
                    break;
                case 4 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:287:7: f= functionName args= selectionFunctionArgs
                    {
                    pushFollow(FOLLOW_functionName_in_unaliasedSelector1064);
                    f=functionName();

                    state._fsp--;

                    pushFollow(FOLLOW_selectionFunctionArgs_in_unaliasedSelector1068);
                    args=selectionFunctionArgs();

                    state._fsp--;

                     s = new Selectable.WithFunction.Raw(f, args); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return s;
    }
    // $ANTLR end "unaliasedSelector"


    // $ANTLR start "selectionFunctionArgs"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:290:1: selectionFunctionArgs returns [List<Selectable.Raw> a] : ( '(' ')' | '(' s1= unaliasedSelector ( ',' sn= unaliasedSelector )* ')' );
    public final List<Selectable.Raw> selectionFunctionArgs() throws RecognitionException {
        List<Selectable.Raw> a = null;

        Selectable.Raw s1 = null;

        Selectable.Raw sn = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:291:5: ( '(' ')' | '(' s1= unaliasedSelector ( ',' sn= unaliasedSelector )* ')' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==137) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==138) ) {
                    alt16=1;
                }
                else if ( ((LA16_1>=K_DISTINCT && LA16_1<=K_AS)||(LA16_1>=K_FILTERING && LA16_1<=K_TTL)||LA16_1==K_VALUES||LA16_1==K_EXISTS||LA16_1==K_TIMESTAMP||LA16_1==K_COUNTER||LA16_1==K_STATIC||(LA16_1>=K_KEY && LA16_1<=K_CUSTOM)||LA16_1==IDENT||LA16_1==K_TRIGGER||LA16_1==K_TYPE||LA16_1==K_LIST||(LA16_1>=K_ALL && LA16_1<=QUOTED_NAME)||LA16_1==K_TOKEN||(LA16_1>=K_ASCII && LA16_1<=K_MAP)) ) {
                    alt16=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:291:7: '(' ')'
                    {
                    match(input,137,FOLLOW_137_in_selectionFunctionArgs1091); 
                    match(input,138,FOLLOW_138_in_selectionFunctionArgs1093); 
                     a = Collections.emptyList(); 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:292:7: '(' s1= unaliasedSelector ( ',' sn= unaliasedSelector )* ')'
                    {
                    match(input,137,FOLLOW_137_in_selectionFunctionArgs1103); 
                    pushFollow(FOLLOW_unaliasedSelector_in_selectionFunctionArgs1107);
                    s1=unaliasedSelector();

                    state._fsp--;

                     List<Selectable.Raw> args = new ArrayList<Selectable.Raw>(); args.add(s1); 
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:293:11: ( ',' sn= unaliasedSelector )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==139) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:293:13: ',' sn= unaliasedSelector
                    	    {
                    	    match(input,139,FOLLOW_139_in_selectionFunctionArgs1123); 
                    	    pushFollow(FOLLOW_unaliasedSelector_in_selectionFunctionArgs1127);
                    	    sn=unaliasedSelector();

                    	    state._fsp--;

                    	     args.add(sn); 

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    match(input,138,FOLLOW_138_in_selectionFunctionArgs1141); 
                     a = args; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return a;
    }
    // $ANTLR end "selectionFunctionArgs"


    // $ANTLR start "selectCountClause"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:297:1: selectCountClause returns [List<RawSelector> expr] : ( '\\*' | i= INTEGER );
    public final List<RawSelector> selectCountClause() throws RecognitionException {
        List<RawSelector> expr = null;

        Token i=null;

        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:298:5: ( '\\*' | i= INTEGER )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==140) ) {
                alt17=1;
            }
            else if ( (LA17_0==INTEGER) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:298:7: '\\*'
                    {
                    match(input,140,FOLLOW_140_in_selectCountClause1164); 
                     expr = Collections.<RawSelector>emptyList();

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:299:7: i= INTEGER
                    {
                    i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_selectCountClause1186); 
                     if (!i.getText().equals("1")) addRecognitionError("Only COUNT(1) is supported, got COUNT(" + i.getText() + ")"); expr = Collections.<RawSelector>emptyList();

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "selectCountClause"


    // $ANTLR start "whereClause"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:302:1: whereClause returns [List<Relation> clause] : relation[$clause] ( K_AND relation[$clause] )* ;
    public final List<Relation> whereClause() throws RecognitionException {
        List<Relation> clause = null;

         clause = new ArrayList<Relation>(); 
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:304:5: ( relation[$clause] ( K_AND relation[$clause] )* )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:304:7: relation[$clause] ( K_AND relation[$clause] )*
            {
            pushFollow(FOLLOW_relation_in_whereClause1222);
            relation(clause);

            state._fsp--;

            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:304:25: ( K_AND relation[$clause] )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==K_AND) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:304:26: K_AND relation[$clause]
            	    {
            	    match(input,K_AND,FOLLOW_K_AND_in_whereClause1226); 
            	    pushFollow(FOLLOW_relation_in_whereClause1228);
            	    relation(clause);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return clause;
    }
    // $ANTLR end "whereClause"


    // $ANTLR start "orderByClause"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:307:1: orderByClause[Map<ColumnIdentifier.Raw, Boolean> orderings] : c= cident ( K_ASC | K_DESC )? ;
    public final void orderByClause(Map<ColumnIdentifier.Raw, Boolean> orderings) throws RecognitionException {
        ColumnIdentifier.Raw c = null;



                ColumnIdentifier.Raw orderBy = null;
                boolean reversed = false;
            
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:312:5: (c= cident ( K_ASC | K_DESC )? )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:312:7: c= cident ( K_ASC | K_DESC )?
            {
            pushFollow(FOLLOW_cident_in_orderByClause1259);
            c=cident();

            state._fsp--;

             orderBy = c; 
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:312:33: ( K_ASC | K_DESC )?
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==K_ASC) ) {
                alt19=1;
            }
            else if ( (LA19_0==K_DESC) ) {
                alt19=2;
            }
            switch (alt19) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:312:34: K_ASC
                    {
                    match(input,K_ASC,FOLLOW_K_ASC_in_orderByClause1264); 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:312:42: K_DESC
                    {
                    match(input,K_DESC,FOLLOW_K_DESC_in_orderByClause1268); 
                     reversed = true; 

                    }
                    break;

            }

             orderings.put(c, reversed); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "orderByClause"


    // $ANTLR start "insertStatement"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:315:1: insertStatement returns [UpdateStatement.ParsedInsert expr] : K_INSERT K_INTO cf= columnFamilyName '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? ;
    public final UpdateStatement.ParsedInsert insertStatement() throws RecognitionException {
        UpdateStatement.ParsedInsert expr = null;

        CFName cf = null;

        ColumnIdentifier.Raw c1 = null;

        ColumnIdentifier.Raw cn = null;

        Term.Raw v1 = null;

        Term.Raw vn = null;



                Attributes.Raw attrs = new Attributes.Raw();
                List<ColumnIdentifier.Raw> columnNames  = new ArrayList<ColumnIdentifier.Raw>();
                List<Term.Raw> values = new ArrayList<Term.Raw>();
                boolean ifNotExists = false;
            
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:328:5: ( K_INSERT K_INTO cf= columnFamilyName '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )? )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:328:7: K_INSERT K_INTO cf= columnFamilyName '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( K_IF K_NOT K_EXISTS )? ( usingClause[attrs] )?
            {
            match(input,K_INSERT,FOLLOW_K_INSERT_in_insertStatement1306); 
            match(input,K_INTO,FOLLOW_K_INTO_in_insertStatement1308); 
            pushFollow(FOLLOW_columnFamilyName_in_insertStatement1312);
            cf=columnFamilyName();

            state._fsp--;

            match(input,137,FOLLOW_137_in_insertStatement1324); 
            pushFollow(FOLLOW_cident_in_insertStatement1328);
            c1=cident();

            state._fsp--;

             columnNames.add(c1); 
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:329:51: ( ',' cn= cident )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==139) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:329:53: ',' cn= cident
            	    {
            	    match(input,139,FOLLOW_139_in_insertStatement1335); 
            	    pushFollow(FOLLOW_cident_in_insertStatement1339);
            	    cn=cident();

            	    state._fsp--;

            	     columnNames.add(cn); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            match(input,138,FOLLOW_138_in_insertStatement1346); 
            match(input,K_VALUES,FOLLOW_K_VALUES_in_insertStatement1356); 
            match(input,137,FOLLOW_137_in_insertStatement1368); 
            pushFollow(FOLLOW_term_in_insertStatement1372);
            v1=term();

            state._fsp--;

             values.add(v1); 
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:331:43: ( ',' vn= term )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==139) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:331:45: ',' vn= term
            	    {
            	    match(input,139,FOLLOW_139_in_insertStatement1378); 
            	    pushFollow(FOLLOW_term_in_insertStatement1382);
            	    vn=term();

            	    state._fsp--;

            	     values.add(vn); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            match(input,138,FOLLOW_138_in_insertStatement1389); 
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:333:9: ( K_IF K_NOT K_EXISTS )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==K_IF) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:333:11: K_IF K_NOT K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_insertStatement1402); 
                    match(input,K_NOT,FOLLOW_K_NOT_in_insertStatement1404); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_insertStatement1406); 
                     ifNotExists = true; 

                    }
                    break;

            }

            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:334:9: ( usingClause[attrs] )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==K_USING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:334:11: usingClause[attrs]
                    {
                    pushFollow(FOLLOW_usingClause_in_insertStatement1423);
                    usingClause(attrs);

                    state._fsp--;


                    }
                    break;

            }


                      expr = new UpdateStatement.ParsedInsert(cf,
                                                               attrs,
                                                               columnNames,
                                                               values,
                                                               ifNotExists);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "insertStatement"


    // $ANTLR start "usingClause"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:344:1: usingClause[Attributes.Raw attrs] : K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )* ;
    public final void usingClause(Attributes.Raw attrs) throws RecognitionException {
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:345:5: ( K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )* )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:345:7: K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )*
            {
            match(input,K_USING,FOLLOW_K_USING_in_usingClause1453); 
            pushFollow(FOLLOW_usingClauseObjective_in_usingClause1455);
            usingClauseObjective(attrs);

            state._fsp--;

            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:345:43: ( K_AND usingClauseObjective[attrs] )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==K_AND) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:345:45: K_AND usingClauseObjective[attrs]
            	    {
            	    match(input,K_AND,FOLLOW_K_AND_in_usingClause1460); 
            	    pushFollow(FOLLOW_usingClauseObjective_in_usingClause1462);
            	    usingClauseObjective(attrs);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "usingClause"


    // $ANTLR start "usingClauseObjective"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:348:1: usingClauseObjective[Attributes.Raw attrs] : ( K_TIMESTAMP ts= intValue | K_TTL t= intValue );
    public final void usingClauseObjective(Attributes.Raw attrs) throws RecognitionException {
        Term.Raw ts = null;

        Term.Raw t = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:349:5: ( K_TIMESTAMP ts= intValue | K_TTL t= intValue )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==K_TIMESTAMP) ) {
                alt25=1;
            }
            else if ( (LA25_0==K_TTL) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:349:7: K_TIMESTAMP ts= intValue
                    {
                    match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_usingClauseObjective1484); 
                    pushFollow(FOLLOW_intValue_in_usingClauseObjective1488);
                    ts=intValue();

                    state._fsp--;

                     attrs.timestamp = ts; 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:350:7: K_TTL t= intValue
                    {
                    match(input,K_TTL,FOLLOW_K_TTL_in_usingClauseObjective1498); 
                    pushFollow(FOLLOW_intValue_in_usingClauseObjective1502);
                    t=intValue();

                    state._fsp--;

                     attrs.timeToLive = t; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "usingClauseObjective"


    // $ANTLR start "updateStatement"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:353:1: updateStatement returns [UpdateStatement.ParsedUpdate expr] : K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF ( K_EXISTS | conditions= updateConditions ) )? ;
    public final UpdateStatement.ParsedUpdate updateStatement() throws RecognitionException {
        UpdateStatement.ParsedUpdate expr = null;

        CFName cf = null;

        List<Relation> wclause = null;

        List<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>> conditions = null;



                Attributes.Raw attrs = new Attributes.Raw();
                List<Pair<ColumnIdentifier.Raw, Operation.RawUpdate>> operations = new ArrayList<Pair<ColumnIdentifier.Raw, Operation.RawUpdate>>();
                boolean ifExists = false;
            
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:366:5: ( K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF ( K_EXISTS | conditions= updateConditions ) )? )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:366:7: K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF ( K_EXISTS | conditions= updateConditions ) )?
            {
            match(input,K_UPDATE,FOLLOW_K_UPDATE_in_updateStatement1536); 
            pushFollow(FOLLOW_columnFamilyName_in_updateStatement1540);
            cf=columnFamilyName();

            state._fsp--;

            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:367:7: ( usingClause[attrs] )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==K_USING) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:367:9: usingClause[attrs]
                    {
                    pushFollow(FOLLOW_usingClause_in_updateStatement1550);
                    usingClause(attrs);

                    state._fsp--;


                    }
                    break;

            }

            match(input,K_SET,FOLLOW_K_SET_in_updateStatement1562); 
            pushFollow(FOLLOW_columnOperation_in_updateStatement1564);
            columnOperation(operations);

            state._fsp--;

            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:368:41: ( ',' columnOperation[operations] )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==139) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:368:42: ',' columnOperation[operations]
            	    {
            	    match(input,139,FOLLOW_139_in_updateStatement1568); 
            	    pushFollow(FOLLOW_columnOperation_in_updateStatement1570);
            	    columnOperation(operations);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            match(input,K_WHERE,FOLLOW_K_WHERE_in_updateStatement1581); 
            pushFollow(FOLLOW_whereClause_in_updateStatement1585);
            wclause=whereClause();

            state._fsp--;

            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:370:7: ( K_IF ( K_EXISTS | conditions= updateConditions ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==K_IF) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:370:9: K_IF ( K_EXISTS | conditions= updateConditions )
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_updateStatement1595); 
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:370:14: ( K_EXISTS | conditions= updateConditions )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==K_EXISTS) ) {
                        int LA28_1 = input.LA(2);

                        if ( (LA28_1==141||LA28_1==148) ) {
                            alt28=2;
                        }
                        else if ( (LA28_1==EOF||LA28_1==K_INSERT||LA28_1==K_UPDATE||LA28_1==K_DELETE||LA28_1==K_APPLY||LA28_1==136) ) {
                            alt28=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 28, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( ((LA28_0>=K_DISTINCT && LA28_0<=K_AS)||(LA28_0>=K_FILTERING && LA28_0<=K_TTL)||LA28_0==K_VALUES||LA28_0==K_TIMESTAMP||LA28_0==K_COUNTER||LA28_0==K_STATIC||(LA28_0>=K_KEY && LA28_0<=K_CUSTOM)||LA28_0==IDENT||LA28_0==K_TRIGGER||LA28_0==K_TYPE||LA28_0==K_LIST||(LA28_0>=K_ALL && LA28_0<=QUOTED_NAME)||(LA28_0>=K_ASCII && LA28_0<=K_MAP)) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:370:16: K_EXISTS
                            {
                            match(input,K_EXISTS,FOLLOW_K_EXISTS_in_updateStatement1599); 
                             ifExists = true; 

                            }
                            break;
                        case 2 :
                            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:370:48: conditions= updateConditions
                            {
                            pushFollow(FOLLOW_updateConditions_in_updateStatement1607);
                            conditions=updateConditions();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


                      return new UpdateStatement.ParsedUpdate(cf,
                                                              attrs,
                                                              operations,
                                                              wclause,
                                                              conditions == null ? Collections.<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>>emptyList() : conditions,
                                                              ifExists);
                 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "updateStatement"


    // $ANTLR start "updateConditions"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:381:1: updateConditions returns [List<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>> conditions] : columnCondition[conditions] ( K_AND columnCondition[conditions] )* ;
    public final List<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>> updateConditions() throws RecognitionException {
        List<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>> conditions = null;

         conditions = new ArrayList<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>>(); 
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:383:5: ( columnCondition[conditions] ( K_AND columnCondition[conditions] )* )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:383:7: columnCondition[conditions] ( K_AND columnCondition[conditions] )*
            {
            pushFollow(FOLLOW_columnCondition_in_updateConditions1649);
            columnCondition(conditions);

            state._fsp--;

            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:383:35: ( K_AND columnCondition[conditions] )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==K_AND) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:383:37: K_AND columnCondition[conditions]
            	    {
            	    match(input,K_AND,FOLLOW_K_AND_in_updateConditions1654); 
            	    pushFollow(FOLLOW_columnCondition_in_updateConditions1656);
            	    columnCondition(conditions);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return conditions;
    }
    // $ANTLR end "updateConditions"


    // $ANTLR start "deleteStatement"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:387:1: deleteStatement returns [DeleteStatement.Parsed expr] : K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF ( K_EXISTS | conditions= updateConditions ) )? ;
    public final DeleteStatement.Parsed deleteStatement() throws RecognitionException {
        DeleteStatement.Parsed expr = null;

        List<Operation.RawDeletion> dels = null;

        CFName cf = null;

        List<Relation> wclause = null;

        List<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>> conditions = null;



                Attributes.Raw attrs = new Attributes.Raw();
                List<Operation.RawDeletion> columnDeletions = Collections.emptyList();
                boolean ifExists = false;
            
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:400:5: ( K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF ( K_EXISTS | conditions= updateConditions ) )? )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:400:7: K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF ( K_EXISTS | conditions= updateConditions ) )?
            {
            match(input,K_DELETE,FOLLOW_K_DELETE_in_deleteStatement1693); 
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:400:16: (dels= deleteSelection )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=K_DISTINCT && LA31_0<=K_AS)||(LA31_0>=K_FILTERING && LA31_0<=K_TTL)||LA31_0==K_VALUES||LA31_0==K_EXISTS||LA31_0==K_TIMESTAMP||LA31_0==K_COUNTER||LA31_0==K_STATIC||(LA31_0>=K_KEY && LA31_0<=K_CUSTOM)||LA31_0==IDENT||LA31_0==K_TRIGGER||LA31_0==K_TYPE||LA31_0==K_LIST||(LA31_0>=K_ALL && LA31_0<=QUOTED_NAME)||(LA31_0>=K_ASCII && LA31_0<=K_MAP)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:400:18: dels= deleteSelection
                    {
                    pushFollow(FOLLOW_deleteSelection_in_deleteStatement1699);
                    dels=deleteSelection();

                    state._fsp--;

                     columnDeletions = dels; 

                    }
                    break;

            }

            match(input,K_FROM,FOLLOW_K_FROM_in_deleteStatement1712); 
            pushFollow(FOLLOW_columnFamilyName_in_deleteStatement1716);
            cf=columnFamilyName();

            state._fsp--;

            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:402:7: ( usingClauseDelete[attrs] )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==K_USING) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:402:9: usingClauseDelete[attrs]
                    {
                    pushFollow(FOLLOW_usingClauseDelete_in_deleteStatement1726);
                    usingClauseDelete(attrs);

                    state._fsp--;


                    }
                    break;

            }

            match(input,K_WHERE,FOLLOW_K_WHERE_in_deleteStatement1738); 
            pushFollow(FOLLOW_whereClause_in_deleteStatement1742);
            wclause=whereClause();

            state._fsp--;

            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:404:7: ( K_IF ( K_EXISTS | conditions= updateConditions ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==K_IF) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:404:9: K_IF ( K_EXISTS | conditions= updateConditions )
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_deleteStatement1752); 
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:404:14: ( K_EXISTS | conditions= updateConditions )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==K_EXISTS) ) {
                        int LA33_1 = input.LA(2);

                        if ( (LA33_1==141||LA33_1==148) ) {
                            alt33=2;
                        }
                        else if ( (LA33_1==EOF||LA33_1==K_INSERT||LA33_1==K_UPDATE||LA33_1==K_DELETE||LA33_1==K_APPLY||LA33_1==136) ) {
                            alt33=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( ((LA33_0>=K_DISTINCT && LA33_0<=K_AS)||(LA33_0>=K_FILTERING && LA33_0<=K_TTL)||LA33_0==K_VALUES||LA33_0==K_TIMESTAMP||LA33_0==K_COUNTER||LA33_0==K_STATIC||(LA33_0>=K_KEY && LA33_0<=K_CUSTOM)||LA33_0==IDENT||LA33_0==K_TRIGGER||LA33_0==K_TYPE||LA33_0==K_LIST||(LA33_0>=K_ALL && LA33_0<=QUOTED_NAME)||(LA33_0>=K_ASCII && LA33_0<=K_MAP)) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:404:16: K_EXISTS
                            {
                            match(input,K_EXISTS,FOLLOW_K_EXISTS_in_deleteStatement1756); 
                             ifExists = true; 

                            }
                            break;
                        case 2 :
                            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:404:48: conditions= updateConditions
                            {
                            pushFollow(FOLLOW_updateConditions_in_deleteStatement1764);
                            conditions=updateConditions();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


                      return new DeleteStatement.Parsed(cf,
                                                        attrs,
                                                        columnDeletions,
                                                        wclause,
                                                        conditions == null ? Collections.<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>>emptyList() : conditions,
                                                        ifExists);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "deleteStatement"


    // $ANTLR start "deleteSelection"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:415:1: deleteSelection returns [List<Operation.RawDeletion> operations] : t1= deleteOp ( ',' tN= deleteOp )* ;
    public final List<Operation.RawDeletion> deleteSelection() throws RecognitionException {
        List<Operation.RawDeletion> operations = null;

        Operation.RawDeletion t1 = null;

        Operation.RawDeletion tN = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:416:5: (t1= deleteOp ( ',' tN= deleteOp )* )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:416:7: t1= deleteOp ( ',' tN= deleteOp )*
            {
             operations = new ArrayList<Operation.RawDeletion>(); 
            pushFollow(FOLLOW_deleteOp_in_deleteSelection1811);
            t1=deleteOp();

            state._fsp--;

             operations.add(t1); 
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:418:11: ( ',' tN= deleteOp )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==139) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:418:12: ',' tN= deleteOp
            	    {
            	    match(input,139,FOLLOW_139_in_deleteSelection1826); 
            	    pushFollow(FOLLOW_deleteOp_in_deleteSelection1830);
            	    tN=deleteOp();

            	    state._fsp--;

            	     operations.add(tN); 

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return operations;
    }
    // $ANTLR end "deleteSelection"


    // $ANTLR start "deleteOp"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:421:1: deleteOp returns [Operation.RawDeletion op] : (c= cident | c= cident '[' t= term ']' );
    public final Operation.RawDeletion deleteOp() throws RecognitionException {
        Operation.RawDeletion op = null;

        ColumnIdentifier.Raw c = null;

        Term.Raw t = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:422:5: (c= cident | c= cident '[' t= term ']' )
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:422:7: c= cident
                    {
                    pushFollow(FOLLOW_cident_in_deleteOp1857);
                    c=cident();

                    state._fsp--;

                     op = new Operation.ColumnDeletion(c); 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:423:7: c= cident '[' t= term ']'
                    {
                    pushFollow(FOLLOW_cident_in_deleteOp1884);
                    c=cident();

                    state._fsp--;

                    match(input,141,FOLLOW_141_in_deleteOp1886); 
                    pushFollow(FOLLOW_term_in_deleteOp1890);
                    t=term();

                    state._fsp--;

                    match(input,142,FOLLOW_142_in_deleteOp1892); 
                     op = new Operation.ElementDeletion(c, t); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return op;
    }
    // $ANTLR end "deleteOp"


    // $ANTLR start "usingClauseDelete"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:426:1: usingClauseDelete[Attributes.Raw attrs] : K_USING K_TIMESTAMP ts= intValue ;
    public final void usingClauseDelete(Attributes.Raw attrs) throws RecognitionException {
        Term.Raw ts = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:427:5: ( K_USING K_TIMESTAMP ts= intValue )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:427:7: K_USING K_TIMESTAMP ts= intValue
            {
            match(input,K_USING,FOLLOW_K_USING_in_usingClauseDelete1912); 
            match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_usingClauseDelete1914); 
            pushFollow(FOLLOW_intValue_in_usingClauseDelete1918);
            ts=intValue();

            state._fsp--;

             attrs.timestamp = ts; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "usingClauseDelete"


    // $ANTLR start "batchStatement"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:430:1: batchStatement returns [BatchStatement.Parsed expr] : K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH ;
    public final BatchStatement.Parsed batchStatement() throws RecognitionException {
        BatchStatement.Parsed expr = null;

        ModificationStatement.Parsed s = null;



                BatchStatement.Type type = BatchStatement.Type.LOGGED;
                List<ModificationStatement.Parsed> statements = new ArrayList<ModificationStatement.Parsed>();
                Attributes.Raw attrs = new Attributes.Raw();
            
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:460:5: ( K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:460:7: K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH
            {
            match(input,K_BEGIN,FOLLOW_K_BEGIN_in_batchStatement1952); 
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:461:7: ( K_UNLOGGED | K_COUNTER )?
            int alt37=3;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==K_UNLOGGED) ) {
                alt37=1;
            }
            else if ( (LA37_0==K_COUNTER) ) {
                alt37=2;
            }
            switch (alt37) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:461:9: K_UNLOGGED
                    {
                    match(input,K_UNLOGGED,FOLLOW_K_UNLOGGED_in_batchStatement1962); 
                     type = BatchStatement.Type.UNLOGGED; 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:461:63: K_COUNTER
                    {
                    match(input,K_COUNTER,FOLLOW_K_COUNTER_in_batchStatement1968); 
                     type = BatchStatement.Type.COUNTER; 

                    }
                    break;

            }

            match(input,K_BATCH,FOLLOW_K_BATCH_in_batchStatement1981); 
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:462:15: ( usingClause[attrs] )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==K_USING) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:462:17: usingClause[attrs]
                    {
                    pushFollow(FOLLOW_usingClause_in_batchStatement1985);
                    usingClause(attrs);

                    state._fsp--;


                    }
                    break;

            }

            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:463:11: (s= batchStatementObjective ( ';' )? )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==K_INSERT||LA40_0==K_UPDATE||LA40_0==K_DELETE) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:463:13: s= batchStatementObjective ( ';' )?
            	    {
            	    pushFollow(FOLLOW_batchStatementObjective_in_batchStatement2005);
            	    s=batchStatementObjective();

            	    state._fsp--;

            	    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:463:39: ( ';' )?
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==136) ) {
            	        alt39=1;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:463:39: ';'
            	            {
            	            match(input,136,FOLLOW_136_in_batchStatement2007); 

            	            }
            	            break;

            	    }

            	     statements.add(s); 

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            match(input,K_APPLY,FOLLOW_K_APPLY_in_batchStatement2021); 
            match(input,K_BATCH,FOLLOW_K_BATCH_in_batchStatement2023); 

                      return new BatchStatement.Parsed(type, attrs, statements);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "batchStatement"


    // $ANTLR start "batchStatementObjective"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:470:1: batchStatementObjective returns [ModificationStatement.Parsed statement] : (i= insertStatement | u= updateStatement | d= deleteStatement );
    public final ModificationStatement.Parsed batchStatementObjective() throws RecognitionException {
        ModificationStatement.Parsed statement = null;

        UpdateStatement.ParsedInsert i = null;

        UpdateStatement.ParsedUpdate u = null;

        DeleteStatement.Parsed d = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:471:5: (i= insertStatement | u= updateStatement | d= deleteStatement )
            int alt41=3;
            switch ( input.LA(1) ) {
            case K_INSERT:
                {
                alt41=1;
                }
                break;
            case K_UPDATE:
                {
                alt41=2;
                }
                break;
            case K_DELETE:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:471:7: i= insertStatement
                    {
                    pushFollow(FOLLOW_insertStatement_in_batchStatementObjective2054);
                    i=insertStatement();

                    state._fsp--;

                     statement = i; 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:472:7: u= updateStatement
                    {
                    pushFollow(FOLLOW_updateStatement_in_batchStatementObjective2067);
                    u=updateStatement();

                    state._fsp--;

                     statement = u; 

                    }
                    break;
                case 3 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:473:7: d= deleteStatement
                    {
                    pushFollow(FOLLOW_deleteStatement_in_batchStatementObjective2080);
                    d=deleteStatement();

                    state._fsp--;

                     statement = d; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return statement;
    }
    // $ANTLR end "batchStatementObjective"


    // $ANTLR start "createKeyspaceStatement"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:476:1: createKeyspaceStatement returns [CreateKeyspaceStatement expr] : K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs] ;
    public final CreateKeyspaceStatement createKeyspaceStatement() throws RecognitionException {
        CreateKeyspaceStatement expr = null;

        String ks = null;



                KSPropDefs attrs = new KSPropDefs();
                boolean ifNotExists = false;
            
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:484:5: ( K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs] )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:484:7: K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs]
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createKeyspaceStatement2115); 
            match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_createKeyspaceStatement2117); 
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:484:27: ( K_IF K_NOT K_EXISTS )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==K_IF) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:484:28: K_IF K_NOT K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_createKeyspaceStatement2120); 
                    match(input,K_NOT,FOLLOW_K_NOT_in_createKeyspaceStatement2122); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createKeyspaceStatement2124); 
                     ifNotExists = true; 

                    }
                    break;

            }

            pushFollow(FOLLOW_keyspaceName_in_createKeyspaceStatement2133);
            ks=keyspaceName();

            state._fsp--;

            match(input,K_WITH,FOLLOW_K_WITH_in_createKeyspaceStatement2141); 
            pushFollow(FOLLOW_properties_in_createKeyspaceStatement2143);
            properties(attrs);

            state._fsp--;

             expr = new CreateKeyspaceStatement(ks, attrs, ifNotExists); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "createKeyspaceStatement"


    // $ANTLR start "createTableStatement"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:488:1: createTableStatement returns [CreateTableStatement.RawStatement expr] : K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName cfamDefinition[expr] ;
    public final CreateTableStatement.RawStatement createTableStatement() throws RecognitionException {
        CreateTableStatement.RawStatement expr = null;

        CFName cf = null;


         boolean ifNotExists = false; 
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:497:5: ( K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName cfamDefinition[expr] )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:497:7: K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName cfamDefinition[expr]
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createTableStatement2178); 
            match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_createTableStatement2180); 
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:497:31: ( K_IF K_NOT K_EXISTS )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==K_IF) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:497:32: K_IF K_NOT K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_createTableStatement2183); 
                    match(input,K_NOT,FOLLOW_K_NOT_in_createTableStatement2185); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createTableStatement2187); 
                     ifNotExists = true; 

                    }
                    break;

            }

            pushFollow(FOLLOW_columnFamilyName_in_createTableStatement2202);
            cf=columnFamilyName();

            state._fsp--;

             expr = new CreateTableStatement.RawStatement(cf, ifNotExists); 
            pushFollow(FOLLOW_cfamDefinition_in_createTableStatement2212);
            cfamDefinition(expr);

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "createTableStatement"


    // $ANTLR start "cfamDefinition"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:502:1: cfamDefinition[CreateTableStatement.RawStatement expr] : '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )? ;
    public final void cfamDefinition(CreateTableStatement.RawStatement expr) throws RecognitionException {
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:503:5: ( '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )? )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:503:7: '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )?
            {
            match(input,137,FOLLOW_137_in_cfamDefinition2231); 
            pushFollow(FOLLOW_cfamColumns_in_cfamDefinition2233);
            cfamColumns(expr);

            state._fsp--;

            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:503:29: ( ',' ( cfamColumns[expr] )? )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==139) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:503:31: ',' ( cfamColumns[expr] )?
            	    {
            	    match(input,139,FOLLOW_139_in_cfamDefinition2238); 
            	    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:503:35: ( cfamColumns[expr] )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( ((LA44_0>=K_DISTINCT && LA44_0<=K_AS)||(LA44_0>=K_FILTERING && LA44_0<=K_TTL)||LA44_0==K_VALUES||LA44_0==K_EXISTS||LA44_0==K_TIMESTAMP||LA44_0==K_COUNTER||(LA44_0>=K_STATIC && LA44_0<=K_CUSTOM)||LA44_0==IDENT||LA44_0==K_TRIGGER||LA44_0==K_TYPE||LA44_0==K_LIST||(LA44_0>=K_ALL && LA44_0<=QUOTED_NAME)||(LA44_0>=K_ASCII && LA44_0<=K_MAP)) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:503:35: cfamColumns[expr]
            	            {
            	            pushFollow(FOLLOW_cfamColumns_in_cfamDefinition2240);
            	            cfamColumns(expr);

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            match(input,138,FOLLOW_138_in_cfamDefinition2247); 
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:504:7: ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==K_WITH) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:504:9: K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )*
                    {
                    match(input,K_WITH,FOLLOW_K_WITH_in_cfamDefinition2257); 
                    pushFollow(FOLLOW_cfamProperty_in_cfamDefinition2259);
                    cfamProperty(expr);

                    state._fsp--;

                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:504:35: ( K_AND cfamProperty[expr] )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==K_AND) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:504:37: K_AND cfamProperty[expr]
                    	    {
                    	    match(input,K_AND,FOLLOW_K_AND_in_cfamDefinition2264); 
                    	    pushFollow(FOLLOW_cfamProperty_in_cfamDefinition2266);
                    	    cfamProperty(expr);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cfamDefinition"


    // $ANTLR start "cfamColumns"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:507:1: cfamColumns[CreateTableStatement.RawStatement expr] : (k= ident v= comparatorType ( K_STATIC )? ( K_PRIMARY K_KEY )? | K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= ident )* ')' );
    public final void cfamColumns(CreateTableStatement.RawStatement expr) throws RecognitionException {
        ColumnIdentifier k = null;

        CQL3Type v = null;

        ColumnIdentifier c = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:508:5: (k= ident v= comparatorType ( K_STATIC )? ( K_PRIMARY K_KEY )? | K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= ident )* ')' )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=K_DISTINCT && LA51_0<=K_AS)||(LA51_0>=K_FILTERING && LA51_0<=K_TTL)||LA51_0==K_VALUES||LA51_0==K_EXISTS||LA51_0==K_TIMESTAMP||LA51_0==K_COUNTER||LA51_0==K_STATIC||(LA51_0>=K_KEY && LA51_0<=K_CUSTOM)||LA51_0==IDENT||LA51_0==K_TRIGGER||LA51_0==K_TYPE||LA51_0==K_LIST||(LA51_0>=K_ALL && LA51_0<=QUOTED_NAME)||(LA51_0>=K_ASCII && LA51_0<=K_MAP)) ) {
                alt51=1;
            }
            else if ( (LA51_0==K_PRIMARY) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:508:7: k= ident v= comparatorType ( K_STATIC )? ( K_PRIMARY K_KEY )?
                    {
                    pushFollow(FOLLOW_ident_in_cfamColumns2292);
                    k=ident();

                    state._fsp--;

                    pushFollow(FOLLOW_comparatorType_in_cfamColumns2296);
                    v=comparatorType();

                    state._fsp--;

                     boolean isStatic=false; 
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:508:60: ( K_STATIC )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==K_STATIC) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:508:61: K_STATIC
                            {
                            match(input,K_STATIC,FOLLOW_K_STATIC_in_cfamColumns2301); 
                            isStatic = true;

                            }
                            break;

                    }

                     expr.addDefinition(k, v, isStatic); 
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:509:9: ( K_PRIMARY K_KEY )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==K_PRIMARY) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:509:10: K_PRIMARY K_KEY
                            {
                            match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_cfamColumns2318); 
                            match(input,K_KEY,FOLLOW_K_KEY_in_cfamColumns2320); 
                             expr.addKeyAliases(Collections.singletonList(k)); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:510:7: K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= ident )* ')'
                    {
                    match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_cfamColumns2332); 
                    match(input,K_KEY,FOLLOW_K_KEY_in_cfamColumns2334); 
                    match(input,137,FOLLOW_137_in_cfamColumns2336); 
                    pushFollow(FOLLOW_pkDef_in_cfamColumns2338);
                    pkDef(expr);

                    state._fsp--;

                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:510:39: ( ',' c= ident )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==139) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:510:40: ',' c= ident
                    	    {
                    	    match(input,139,FOLLOW_139_in_cfamColumns2342); 
                    	    pushFollow(FOLLOW_ident_in_cfamColumns2346);
                    	    c=ident();

                    	    state._fsp--;

                    	     expr.addColumnAlias(c); 

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    match(input,138,FOLLOW_138_in_cfamColumns2353); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cfamColumns"


    // $ANTLR start "pkDef"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:513:1: pkDef[CreateTableStatement.RawStatement expr] : (k= ident | '(' k1= ident ( ',' kn= ident )* ')' );
    public final void pkDef(CreateTableStatement.RawStatement expr) throws RecognitionException {
        ColumnIdentifier k = null;

        ColumnIdentifier k1 = null;

        ColumnIdentifier kn = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:514:5: (k= ident | '(' k1= ident ( ',' kn= ident )* ')' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=K_DISTINCT && LA53_0<=K_AS)||(LA53_0>=K_FILTERING && LA53_0<=K_TTL)||LA53_0==K_VALUES||LA53_0==K_EXISTS||LA53_0==K_TIMESTAMP||LA53_0==K_COUNTER||LA53_0==K_STATIC||(LA53_0>=K_KEY && LA53_0<=K_CUSTOM)||LA53_0==IDENT||LA53_0==K_TRIGGER||LA53_0==K_TYPE||LA53_0==K_LIST||(LA53_0>=K_ALL && LA53_0<=QUOTED_NAME)||(LA53_0>=K_ASCII && LA53_0<=K_MAP)) ) {
                alt53=1;
            }
            else if ( (LA53_0==137) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:514:7: k= ident
                    {
                    pushFollow(FOLLOW_ident_in_pkDef2373);
                    k=ident();

                    state._fsp--;

                     expr.addKeyAliases(Collections.singletonList(k)); 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:515:7: '(' k1= ident ( ',' kn= ident )* ')'
                    {
                    match(input,137,FOLLOW_137_in_pkDef2383); 
                     List<ColumnIdentifier> l = new ArrayList<ColumnIdentifier>(); 
                    pushFollow(FOLLOW_ident_in_pkDef2389);
                    k1=ident();

                    state._fsp--;

                     l.add(k1); 
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:515:101: ( ',' kn= ident )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==139) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:515:103: ',' kn= ident
                    	    {
                    	    match(input,139,FOLLOW_139_in_pkDef2395); 
                    	    pushFollow(FOLLOW_ident_in_pkDef2399);
                    	    kn=ident();

                    	    state._fsp--;

                    	     l.add(kn); 

                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    match(input,138,FOLLOW_138_in_pkDef2406); 
                     expr.addKeyAliases(l); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "pkDef"


    // $ANTLR start "cfamProperty"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:518:1: cfamProperty[CreateTableStatement.RawStatement expr] : ( property[expr.properties] | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[expr] ( ',' cfamOrdering[expr] )* ')' );
    public final void cfamProperty(CreateTableStatement.RawStatement expr) throws RecognitionException {
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:519:5: ( property[expr.properties] | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[expr] ( ',' cfamOrdering[expr] )* ')' )
            int alt55=3;
            switch ( input.LA(1) ) {
            case K_DISTINCT:
            case K_COUNT:
            case K_AS:
            case K_FILTERING:
            case K_WRITETIME:
            case K_TTL:
            case K_VALUES:
            case K_EXISTS:
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_STATIC:
            case K_KEY:
            case K_STORAGE:
            case K_CUSTOM:
            case IDENT:
            case K_TRIGGER:
            case K_TYPE:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case QUOTED_NAME:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt55=1;
                }
                break;
            case K_COMPACT:
                {
                int LA55_2 = input.LA(2);

                if ( (LA55_2==K_STORAGE) ) {
                    alt55=2;
                }
                else if ( (LA55_2==148) ) {
                    alt55=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 2, input);

                    throw nvae;
                }
                }
                break;
            case K_CLUSTERING:
                {
                int LA55_3 = input.LA(2);

                if ( (LA55_3==K_ORDER) ) {
                    alt55=3;
                }
                else if ( (LA55_3==148) ) {
                    alt55=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:519:7: property[expr.properties]
                    {
                    pushFollow(FOLLOW_property_in_cfamProperty2426);
                    property(expr.properties);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:520:7: K_COMPACT K_STORAGE
                    {
                    match(input,K_COMPACT,FOLLOW_K_COMPACT_in_cfamProperty2435); 
                    match(input,K_STORAGE,FOLLOW_K_STORAGE_in_cfamProperty2437); 
                     expr.setCompactStorage(); 

                    }
                    break;
                case 3 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:521:7: K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[expr] ( ',' cfamOrdering[expr] )* ')'
                    {
                    match(input,K_CLUSTERING,FOLLOW_K_CLUSTERING_in_cfamProperty2447); 
                    match(input,K_ORDER,FOLLOW_K_ORDER_in_cfamProperty2449); 
                    match(input,K_BY,FOLLOW_K_BY_in_cfamProperty2451); 
                    match(input,137,FOLLOW_137_in_cfamProperty2453); 
                    pushFollow(FOLLOW_cfamOrdering_in_cfamProperty2455);
                    cfamOrdering(expr);

                    state._fsp--;

                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:521:56: ( ',' cfamOrdering[expr] )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==139) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:521:57: ',' cfamOrdering[expr]
                    	    {
                    	    match(input,139,FOLLOW_139_in_cfamProperty2459); 
                    	    pushFollow(FOLLOW_cfamOrdering_in_cfamProperty2461);
                    	    cfamOrdering(expr);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    match(input,138,FOLLOW_138_in_cfamProperty2466); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cfamProperty"


    // $ANTLR start "cfamOrdering"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:524:1: cfamOrdering[CreateTableStatement.RawStatement expr] : k= ident ( K_ASC | K_DESC ) ;
    public final void cfamOrdering(CreateTableStatement.RawStatement expr) throws RecognitionException {
        ColumnIdentifier k = null;


         boolean reversed=false; 
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:526:5: (k= ident ( K_ASC | K_DESC ) )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:526:7: k= ident ( K_ASC | K_DESC )
            {
            pushFollow(FOLLOW_ident_in_cfamOrdering2494);
            k=ident();

            state._fsp--;

            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:526:15: ( K_ASC | K_DESC )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==K_ASC) ) {
                alt56=1;
            }
            else if ( (LA56_0==K_DESC) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:526:16: K_ASC
                    {
                    match(input,K_ASC,FOLLOW_K_ASC_in_cfamOrdering2497); 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:526:24: K_DESC
                    {
                    match(input,K_DESC,FOLLOW_K_DESC_in_cfamOrdering2501); 
                     reversed=true;

                    }
                    break;

            }

             expr.setOrdering(k, reversed); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cfamOrdering"


    // $ANTLR start "createIndexStatement"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:529:1: createIndexStatement returns [CreateIndexStatement expr] : K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? (idxName= IDENT )? K_ON cf= columnFamilyName '(' id= cident ')' ( K_USING cls= STRING_LITERAL )? ( K_WITH properties[props] )? ;
    public final CreateIndexStatement createIndexStatement() throws RecognitionException {
        CreateIndexStatement expr = null;

        Token idxName=null;
        Token cls=null;
        CFName cf = null;

        ColumnIdentifier.Raw id = null;



                IndexPropDefs props = new IndexPropDefs();
                boolean ifNotExists = false;
            
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:538:5: ( K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? (idxName= IDENT )? K_ON cf= columnFamilyName '(' id= cident ')' ( K_USING cls= STRING_LITERAL )? ( K_WITH properties[props] )? )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:538:7: K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? (idxName= IDENT )? K_ON cf= columnFamilyName '(' id= cident ')' ( K_USING cls= STRING_LITERAL )? ( K_WITH properties[props] )?
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createIndexStatement2539); 
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:538:16: ( K_CUSTOM )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==K_CUSTOM) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:538:17: K_CUSTOM
                    {
                    match(input,K_CUSTOM,FOLLOW_K_CUSTOM_in_createIndexStatement2542); 
                     props.isCustom = true; 

                    }
                    break;

            }

            match(input,K_INDEX,FOLLOW_K_INDEX_in_createIndexStatement2548); 
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:538:63: ( K_IF K_NOT K_EXISTS )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==K_IF) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:538:64: K_IF K_NOT K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_createIndexStatement2551); 
                    match(input,K_NOT,FOLLOW_K_NOT_in_createIndexStatement2553); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createIndexStatement2555); 
                     ifNotExists = true; 

                    }
                    break;

            }

            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:539:9: (idxName= IDENT )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==IDENT) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:539:10: idxName= IDENT
                    {
                    idxName=(Token)match(input,IDENT,FOLLOW_IDENT_in_createIndexStatement2573); 

                    }
                    break;

            }

            match(input,K_ON,FOLLOW_K_ON_in_createIndexStatement2577); 
            pushFollow(FOLLOW_columnFamilyName_in_createIndexStatement2581);
            cf=columnFamilyName();

            state._fsp--;

            match(input,137,FOLLOW_137_in_createIndexStatement2583); 
            pushFollow(FOLLOW_cident_in_createIndexStatement2587);
            id=cident();

            state._fsp--;

            match(input,138,FOLLOW_138_in_createIndexStatement2589); 
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:540:9: ( K_USING cls= STRING_LITERAL )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==K_USING) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:540:10: K_USING cls= STRING_LITERAL
                    {
                    match(input,K_USING,FOLLOW_K_USING_in_createIndexStatement2600); 
                    cls=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createIndexStatement2604); 
                     props.customClass = (cls!=null?cls.getText():null); 

                    }
                    break;

            }

            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:541:9: ( K_WITH properties[props] )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==K_WITH) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:541:10: K_WITH properties[props]
                    {
                    match(input,K_WITH,FOLLOW_K_WITH_in_createIndexStatement2619); 
                    pushFollow(FOLLOW_properties_in_createIndexStatement2621);
                    properties(props);

                    state._fsp--;


                    }
                    break;

            }

             expr = new CreateIndexStatement(cf, (idxName!=null?idxName.getText():null), id, props, ifNotExists); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "createIndexStatement"


    // $ANTLR start "createTriggerStatement"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:545:1: createTriggerStatement returns [CreateTriggerStatement expr] : K_CREATE K_TRIGGER (name= IDENT ) K_ON cf= columnFamilyName K_USING cls= STRING_LITERAL ;
    public final CreateTriggerStatement createTriggerStatement() throws RecognitionException {
        CreateTriggerStatement expr = null;

        Token name=null;
        Token cls=null;
        CFName cf = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:549:5: ( K_CREATE K_TRIGGER (name= IDENT ) K_ON cf= columnFamilyName K_USING cls= STRING_LITERAL )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:549:7: K_CREATE K_TRIGGER (name= IDENT ) K_ON cf= columnFamilyName K_USING cls= STRING_LITERAL
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createTriggerStatement2655); 
            match(input,K_TRIGGER,FOLLOW_K_TRIGGER_in_createTriggerStatement2657); 
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:549:26: (name= IDENT )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:549:27: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_createTriggerStatement2662); 

            }

            match(input,K_ON,FOLLOW_K_ON_in_createTriggerStatement2665); 
            pushFollow(FOLLOW_columnFamilyName_in_createTriggerStatement2669);
            cf=columnFamilyName();

            state._fsp--;

            match(input,K_USING,FOLLOW_K_USING_in_createTriggerStatement2671); 
            cls=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createTriggerStatement2675); 
             expr = new CreateTriggerStatement(cf, (name!=null?name.getText():null), (cls!=null?cls.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "createTriggerStatement"


    // $ANTLR start "dropTriggerStatement"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:553:1: dropTriggerStatement returns [DropTriggerStatement expr] : K_DROP K_TRIGGER (name= IDENT ) K_ON cf= columnFamilyName ;
    public final DropTriggerStatement dropTriggerStatement() throws RecognitionException {
        DropTriggerStatement expr = null;

        Token name=null;
        CFName cf = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:557:5: ( K_DROP K_TRIGGER (name= IDENT ) K_ON cf= columnFamilyName )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:557:7: K_DROP K_TRIGGER (name= IDENT ) K_ON cf= columnFamilyName
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropTriggerStatement2706); 
            match(input,K_TRIGGER,FOLLOW_K_TRIGGER_in_dropTriggerStatement2708); 
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:557:24: (name= IDENT )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:557:25: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_dropTriggerStatement2713); 

            }

            match(input,K_ON,FOLLOW_K_ON_in_dropTriggerStatement2716); 
            pushFollow(FOLLOW_columnFamilyName_in_dropTriggerStatement2720);
            cf=columnFamilyName();

            state._fsp--;

             expr = new DropTriggerStatement(cf, (name!=null?name.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "dropTriggerStatement"


    // $ANTLR start "alterKeyspaceStatement"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:561:1: alterKeyspaceStatement returns [AlterKeyspaceStatement expr] : K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs] ;
    public final AlterKeyspaceStatement alterKeyspaceStatement() throws RecognitionException {
        AlterKeyspaceStatement expr = null;

        String ks = null;


         KSPropDefs attrs = new KSPropDefs(); 
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:566:5: ( K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs] )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:566:7: K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs]
            {
            match(input,K_ALTER,FOLLOW_K_ALTER_in_alterKeyspaceStatement2760); 
            match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_alterKeyspaceStatement2762); 
            pushFollow(FOLLOW_keyspaceName_in_alterKeyspaceStatement2766);
            ks=keyspaceName();

            state._fsp--;

            match(input,K_WITH,FOLLOW_K_WITH_in_alterKeyspaceStatement2776); 
            pushFollow(FOLLOW_properties_in_alterKeyspaceStatement2778);
            properties(attrs);

            state._fsp--;

             expr = new AlterKeyspaceStatement(ks, attrs); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "alterKeyspaceStatement"


    // $ANTLR start "alterTableStatement"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:571:1: alterTableStatement returns [AlterTableStatement expr] : K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType ( K_STATIC )? | K_DROP id= cident | K_WITH properties[props] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* ) ;
    public final AlterTableStatement alterTableStatement() throws RecognitionException {
        AlterTableStatement expr = null;

        CFName cf = null;

        ColumnIdentifier.Raw id = null;

        CQL3Type v = null;

        ColumnIdentifier.Raw id1 = null;

        ColumnIdentifier.Raw toId1 = null;

        ColumnIdentifier.Raw idn = null;

        ColumnIdentifier.Raw toIdn = null;



                AlterTableStatement.Type type = null;
                CFPropDefs props = new CFPropDefs();
                Map<ColumnIdentifier.Raw, ColumnIdentifier.Raw> renames = new HashMap<ColumnIdentifier.Raw, ColumnIdentifier.Raw>();
                boolean isStatic = false;
            
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:585:5: ( K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType ( K_STATIC )? | K_DROP id= cident | K_WITH properties[props] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* ) )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:585:7: K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType ( K_STATIC )? | K_DROP id= cident | K_WITH properties[props] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* )
            {
            match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTableStatement2814); 
            match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_alterTableStatement2816); 
            pushFollow(FOLLOW_columnFamilyName_in_alterTableStatement2820);
            cf=columnFamilyName();

            state._fsp--;

            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:586:11: ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType ( K_STATIC )? | K_DROP id= cident | K_WITH properties[props] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* )
            int alt64=5;
            switch ( input.LA(1) ) {
            case K_ALTER:
                {
                alt64=1;
                }
                break;
            case K_ADD:
                {
                alt64=2;
                }
                break;
            case K_DROP:
                {
                alt64=3;
                }
                break;
            case K_WITH:
                {
                alt64=4;
                }
                break;
            case K_RENAME:
                {
                alt64=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:586:13: K_ALTER id= cident K_TYPE v= comparatorType
                    {
                    match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTableStatement2834); 
                    pushFollow(FOLLOW_cident_in_alterTableStatement2838);
                    id=cident();

                    state._fsp--;

                    match(input,K_TYPE,FOLLOW_K_TYPE_in_alterTableStatement2840); 
                    pushFollow(FOLLOW_comparatorType_in_alterTableStatement2844);
                    v=comparatorType();

                    state._fsp--;

                     type = AlterTableStatement.Type.ALTER; 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:587:13: K_ADD id= cident v= comparatorType ( K_STATIC )?
                    {
                    match(input,K_ADD,FOLLOW_K_ADD_in_alterTableStatement2860); 
                    pushFollow(FOLLOW_cident_in_alterTableStatement2866);
                    id=cident();

                    state._fsp--;

                    pushFollow(FOLLOW_comparatorType_in_alterTableStatement2870);
                    v=comparatorType();

                    state._fsp--;

                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:587:48: ( K_STATIC )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==K_STATIC) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:587:49: K_STATIC
                            {
                             isStatic=true; 
                            match(input,K_STATIC,FOLLOW_K_STATIC_in_alterTableStatement2875); 

                            }
                            break;

                    }

                     type = AlterTableStatement.Type.ADD; 

                    }
                    break;
                case 3 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:588:13: K_DROP id= cident
                    {
                    match(input,K_DROP,FOLLOW_K_DROP_in_alterTableStatement2893); 
                    pushFollow(FOLLOW_cident_in_alterTableStatement2898);
                    id=cident();

                    state._fsp--;

                     type = AlterTableStatement.Type.DROP; 

                    }
                    break;
                case 4 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:589:13: K_WITH properties[props]
                    {
                    match(input,K_WITH,FOLLOW_K_WITH_in_alterTableStatement2938); 
                    pushFollow(FOLLOW_properties_in_alterTableStatement2941);
                    properties(props);

                    state._fsp--;

                     type = AlterTableStatement.Type.OPTS; 

                    }
                    break;
                case 5 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:590:13: K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )*
                    {
                    match(input,K_RENAME,FOLLOW_K_RENAME_in_alterTableStatement2974); 
                     type = AlterTableStatement.Type.RENAME; 
                    pushFollow(FOLLOW_cident_in_alterTableStatement3028);
                    id1=cident();

                    state._fsp--;

                    match(input,K_TO,FOLLOW_K_TO_in_alterTableStatement3030); 
                    pushFollow(FOLLOW_cident_in_alterTableStatement3034);
                    toId1=cident();

                    state._fsp--;

                     renames.put(id1, toId1); 
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:592:16: ( K_AND idn= cident K_TO toIdn= cident )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==K_AND) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:592:18: K_AND idn= cident K_TO toIdn= cident
                    	    {
                    	    match(input,K_AND,FOLLOW_K_AND_in_alterTableStatement3055); 
                    	    pushFollow(FOLLOW_cident_in_alterTableStatement3059);
                    	    idn=cident();

                    	    state._fsp--;

                    	    match(input,K_TO,FOLLOW_K_TO_in_alterTableStatement3061); 
                    	    pushFollow(FOLLOW_cident_in_alterTableStatement3065);
                    	    toIdn=cident();

                    	    state._fsp--;

                    	     renames.put(idn, toIdn); 

                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);


                    }
                    break;

            }


                    expr = new AlterTableStatement(cf, type, id, v, props, renames, isStatic);
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "alterTableStatement"


    // $ANTLR start "dropKeyspaceStatement"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:599:1: dropKeyspaceStatement returns [DropKeyspaceStatement ksp] : K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName ;
    public final DropKeyspaceStatement dropKeyspaceStatement() throws RecognitionException {
        DropKeyspaceStatement ksp = null;

        String ks = null;


         boolean ifExists = false; 
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:604:5: ( K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:604:7: K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropKeyspaceStatement3120); 
            match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement3122); 
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:604:25: ( K_IF K_EXISTS )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==K_IF) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:604:26: K_IF K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_dropKeyspaceStatement3125); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropKeyspaceStatement3127); 
                     ifExists = true; 

                    }
                    break;

            }

            pushFollow(FOLLOW_keyspaceName_in_dropKeyspaceStatement3136);
            ks=keyspaceName();

            state._fsp--;

             ksp = new DropKeyspaceStatement(ks, ifExists); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ksp;
    }
    // $ANTLR end "dropKeyspaceStatement"


    // $ANTLR start "dropTableStatement"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:607:1: dropTableStatement returns [DropTableStatement stmt] : K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? cf= columnFamilyName ;
    public final DropTableStatement dropTableStatement() throws RecognitionException {
        DropTableStatement stmt = null;

        CFName cf = null;


         boolean ifExists = false; 
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:612:5: ( K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? cf= columnFamilyName )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:612:7: K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? cf= columnFamilyName
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropTableStatement3170); 
            match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_dropTableStatement3172); 
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:612:29: ( K_IF K_EXISTS )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==K_IF) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:612:30: K_IF K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_dropTableStatement3175); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropTableStatement3177); 
                     ifExists = true; 

                    }
                    break;

            }

            pushFollow(FOLLOW_columnFamilyName_in_dropTableStatement3186);
            cf=columnFamilyName();

            state._fsp--;

             stmt = new DropTableStatement(cf, ifExists); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "dropTableStatement"


    // $ANTLR start "dropIndexStatement"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:615:1: dropIndexStatement returns [DropIndexStatement expr] : K_DROP K_INDEX ( K_IF K_EXISTS )? index= IDENT ;
    public final DropIndexStatement dropIndexStatement() throws RecognitionException {
        DropIndexStatement expr = null;

        Token index=null;

         boolean ifExists = false; 
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:620:5: ( K_DROP K_INDEX ( K_IF K_EXISTS )? index= IDENT )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:620:7: K_DROP K_INDEX ( K_IF K_EXISTS )? index= IDENT
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropIndexStatement3220); 
            match(input,K_INDEX,FOLLOW_K_INDEX_in_dropIndexStatement3222); 
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:620:22: ( K_IF K_EXISTS )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==K_IF) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:620:23: K_IF K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_dropIndexStatement3225); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropIndexStatement3227); 
                     ifExists = true; 

                    }
                    break;

            }

            index=(Token)match(input,IDENT,FOLLOW_IDENT_in_dropIndexStatement3236); 
             expr = new DropIndexStatement((index!=null?index.getText():null), ifExists); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "dropIndexStatement"


    // $ANTLR start "truncateStatement"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:624:1: truncateStatement returns [TruncateStatement stmt] : K_TRUNCATE cf= columnFamilyName ;
    public final TruncateStatement truncateStatement() throws RecognitionException {
        TruncateStatement stmt = null;

        CFName cf = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:628:5: ( K_TRUNCATE cf= columnFamilyName )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:628:7: K_TRUNCATE cf= columnFamilyName
            {
            match(input,K_TRUNCATE,FOLLOW_K_TRUNCATE_in_truncateStatement3267); 
            pushFollow(FOLLOW_columnFamilyName_in_truncateStatement3271);
            cf=columnFamilyName();

            state._fsp--;

             stmt = new TruncateStatement(cf); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "truncateStatement"


    // $ANTLR start "grantStatement"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:631:1: grantStatement returns [GrantStatement stmt] : K_GRANT permissionOrAll K_ON resource K_TO username ;
    public final GrantStatement grantStatement() throws RecognitionException {
        GrantStatement stmt = null;

        Set<Permission> permissionOrAll1 = null;

        IResource resource2 = null;

        CqlParser.username_return username3 = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:635:5: ( K_GRANT permissionOrAll K_ON resource K_TO username )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:635:7: K_GRANT permissionOrAll K_ON resource K_TO username
            {
            match(input,K_GRANT,FOLLOW_K_GRANT_in_grantStatement3296); 
            pushFollow(FOLLOW_permissionOrAll_in_grantStatement3308);
            permissionOrAll1=permissionOrAll();

            state._fsp--;

            match(input,K_ON,FOLLOW_K_ON_in_grantStatement3316); 
            pushFollow(FOLLOW_resource_in_grantStatement3328);
            resource2=resource();

            state._fsp--;

            match(input,K_TO,FOLLOW_K_TO_in_grantStatement3336); 
            pushFollow(FOLLOW_username_in_grantStatement3348);
            username3=username();

            state._fsp--;

             stmt = new GrantStatement(permissionOrAll1, resource2, (username3!=null?input.toString(username3.start,username3.stop):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "grantStatement"


    // $ANTLR start "revokeStatement"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:644:1: revokeStatement returns [RevokeStatement stmt] : K_REVOKE permissionOrAll K_ON resource K_FROM username ;
    public final RevokeStatement revokeStatement() throws RecognitionException {
        RevokeStatement stmt = null;

        Set<Permission> permissionOrAll4 = null;

        IResource resource5 = null;

        CqlParser.username_return username6 = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:648:5: ( K_REVOKE permissionOrAll K_ON resource K_FROM username )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:648:7: K_REVOKE permissionOrAll K_ON resource K_FROM username
            {
            match(input,K_REVOKE,FOLLOW_K_REVOKE_in_revokeStatement3379); 
            pushFollow(FOLLOW_permissionOrAll_in_revokeStatement3391);
            permissionOrAll4=permissionOrAll();

            state._fsp--;

            match(input,K_ON,FOLLOW_K_ON_in_revokeStatement3399); 
            pushFollow(FOLLOW_resource_in_revokeStatement3411);
            resource5=resource();

            state._fsp--;

            match(input,K_FROM,FOLLOW_K_FROM_in_revokeStatement3419); 
            pushFollow(FOLLOW_username_in_revokeStatement3431);
            username6=username();

            state._fsp--;

             stmt = new RevokeStatement(permissionOrAll4, resource5, (username6!=null?input.toString(username6.start,username6.stop):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "revokeStatement"


    // $ANTLR start "listPermissionsStatement"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:657:1: listPermissionsStatement returns [ListPermissionsStatement stmt] : K_LIST permissionOrAll ( K_ON resource )? ( K_OF username )? ( K_NORECURSIVE )? ;
    public final ListPermissionsStatement listPermissionsStatement() throws RecognitionException {
        ListPermissionsStatement stmt = null;

        IResource resource7 = null;

        CqlParser.username_return username8 = null;

        Set<Permission> permissionOrAll9 = null;



                IResource resource = null;
                String username = null;
                boolean recursive = true;
            
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:663:5: ( K_LIST permissionOrAll ( K_ON resource )? ( K_OF username )? ( K_NORECURSIVE )? )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:663:7: K_LIST permissionOrAll ( K_ON resource )? ( K_OF username )? ( K_NORECURSIVE )?
            {
            match(input,K_LIST,FOLLOW_K_LIST_in_listPermissionsStatement3469); 
            pushFollow(FOLLOW_permissionOrAll_in_listPermissionsStatement3481);
            permissionOrAll9=permissionOrAll();

            state._fsp--;

            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:665:7: ( K_ON resource )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==K_ON) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:665:9: K_ON resource
                    {
                    match(input,K_ON,FOLLOW_K_ON_in_listPermissionsStatement3491); 
                    pushFollow(FOLLOW_resource_in_listPermissionsStatement3493);
                    resource7=resource();

                    state._fsp--;

                     resource = resource7; 

                    }
                    break;

            }

            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:666:7: ( K_OF username )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==K_OF) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:666:9: K_OF username
                    {
                    match(input,K_OF,FOLLOW_K_OF_in_listPermissionsStatement3508); 
                    pushFollow(FOLLOW_username_in_listPermissionsStatement3510);
                    username8=username();

                    state._fsp--;

                     username = (username8!=null?input.toString(username8.start,username8.stop):null); 

                    }
                    break;

            }

            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:667:7: ( K_NORECURSIVE )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==K_NORECURSIVE) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:667:9: K_NORECURSIVE
                    {
                    match(input,K_NORECURSIVE,FOLLOW_K_NORECURSIVE_in_listPermissionsStatement3525); 
                     recursive = false; 

                    }
                    break;

            }

             stmt = new ListPermissionsStatement(permissionOrAll9, resource, username, recursive); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "listPermissionsStatement"


    // $ANTLR start "permission"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:671:1: permission returns [Permission perm] : p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE ) ;
    public final Permission permission() throws RecognitionException {
        Permission perm = null;

        Token p=null;

        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:672:5: (p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE ) )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:672:7: p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE )
            {
            p=(Token)input.LT(1);
            if ( input.LA(1)==K_SELECT||input.LA(1)==K_CREATE||(input.LA(1)>=K_DROP && input.LA(1)<=K_ALTER)||(input.LA(1)>=K_MODIFY && input.LA(1)<=K_AUTHORIZE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             perm = Permission.valueOf((p!=null?p.getText():null).toUpperCase()); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return perm;
    }
    // $ANTLR end "permission"


    // $ANTLR start "permissionOrAll"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:676:1: permissionOrAll returns [Set<Permission> perms] : ( K_ALL ( K_PERMISSIONS )? | p= permission ( K_PERMISSION )? );
    public final Set<Permission> permissionOrAll() throws RecognitionException {
        Set<Permission> perms = null;

        Permission p = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:677:5: ( K_ALL ( K_PERMISSIONS )? | p= permission ( K_PERMISSION )? )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==K_ALL) ) {
                alt73=1;
            }
            else if ( (LA73_0==K_SELECT||LA73_0==K_CREATE||(LA73_0>=K_DROP && LA73_0<=K_ALTER)||(LA73_0>=K_MODIFY && LA73_0<=K_AUTHORIZE)) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:677:7: K_ALL ( K_PERMISSIONS )?
                    {
                    match(input,K_ALL,FOLLOW_K_ALL_in_permissionOrAll3610); 
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:677:13: ( K_PERMISSIONS )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==K_PERMISSIONS) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:677:15: K_PERMISSIONS
                            {
                            match(input,K_PERMISSIONS,FOLLOW_K_PERMISSIONS_in_permissionOrAll3614); 

                            }
                            break;

                    }

                     perms = Permission.ALL_DATA; 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:678:7: p= permission ( K_PERMISSION )?
                    {
                    pushFollow(FOLLOW_permission_in_permissionOrAll3635);
                    p=permission();

                    state._fsp--;

                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:678:20: ( K_PERMISSION )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==K_PERMISSION) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:678:22: K_PERMISSION
                            {
                            match(input,K_PERMISSION,FOLLOW_K_PERMISSION_in_permissionOrAll3639); 

                            }
                            break;

                    }

                     perms = EnumSet.of(p); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return perms;
    }
    // $ANTLR end "permissionOrAll"


    // $ANTLR start "resource"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:681:1: resource returns [IResource res] : r= dataResource ;
    public final IResource resource() throws RecognitionException {
        IResource res = null;

        DataResource r = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:682:5: (r= dataResource )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:682:7: r= dataResource
            {
            pushFollow(FOLLOW_dataResource_in_resource3667);
            r=dataResource();

            state._fsp--;

             res = r; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return res;
    }
    // $ANTLR end "resource"


    // $ANTLR start "dataResource"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:685:1: dataResource returns [DataResource res] : ( K_ALL K_KEYSPACES | K_KEYSPACE ks= keyspaceName | ( K_COLUMNFAMILY )? cf= columnFamilyName );
    public final DataResource dataResource() throws RecognitionException {
        DataResource res = null;

        String ks = null;

        CFName cf = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:686:5: ( K_ALL K_KEYSPACES | K_KEYSPACE ks= keyspaceName | ( K_COLUMNFAMILY )? cf= columnFamilyName )
            int alt75=3;
            switch ( input.LA(1) ) {
            case K_ALL:
                {
                int LA75_1 = input.LA(2);

                if ( (LA75_1==K_KEYSPACES) ) {
                    alt75=1;
                }
                else if ( (LA75_1==EOF||LA75_1==K_FROM||LA75_1==K_TO||(LA75_1>=K_OF && LA75_1<=K_NORECURSIVE)||LA75_1==136||LA75_1==143) ) {
                    alt75=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 75, 1, input);

                    throw nvae;
                }
                }
                break;
            case K_KEYSPACE:
                {
                alt75=2;
                }
                break;
            case K_DISTINCT:
            case K_COUNT:
            case K_AS:
            case K_FILTERING:
            case K_WRITETIME:
            case K_TTL:
            case K_VALUES:
            case K_EXISTS:
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_COLUMNFAMILY:
            case K_STATIC:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_CUSTOM:
            case IDENT:
            case K_TRIGGER:
            case K_TYPE:
            case K_LIST:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case QUOTED_NAME:
            case QMARK:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt75=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:686:7: K_ALL K_KEYSPACES
                    {
                    match(input,K_ALL,FOLLOW_K_ALL_in_dataResource3690); 
                    match(input,K_KEYSPACES,FOLLOW_K_KEYSPACES_in_dataResource3692); 
                     res = DataResource.root(); 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:687:7: K_KEYSPACE ks= keyspaceName
                    {
                    match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_dataResource3702); 
                    pushFollow(FOLLOW_keyspaceName_in_dataResource3708);
                    ks=keyspaceName();

                    state._fsp--;

                     res = DataResource.keyspace(ks); 

                    }
                    break;
                case 3 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:688:7: ( K_COLUMNFAMILY )? cf= columnFamilyName
                    {
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:688:7: ( K_COLUMNFAMILY )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==K_COLUMNFAMILY) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:688:9: K_COLUMNFAMILY
                            {
                            match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_dataResource3720); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_columnFamilyName_in_dataResource3729);
                    cf=columnFamilyName();

                    state._fsp--;

                     res = DataResource.columnFamily(cf.getKeyspace(), cf.getColumnFamily()); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return res;
    }
    // $ANTLR end "dataResource"


    // $ANTLR start "createUserStatement"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:692:1: createUserStatement returns [CreateUserStatement stmt] : K_CREATE K_USER ( K_IF K_NOT K_EXISTS )? username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? ;
    public final CreateUserStatement createUserStatement() throws RecognitionException {
        CreateUserStatement stmt = null;

        CqlParser.username_return username10 = null;



                UserOptions opts = new UserOptions();
                boolean superuser = false;
                boolean ifNotExists = false;
            
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:701:5: ( K_CREATE K_USER ( K_IF K_NOT K_EXISTS )? username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:701:7: K_CREATE K_USER ( K_IF K_NOT K_EXISTS )? username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )?
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createUserStatement3769); 
            match(input,K_USER,FOLLOW_K_USER_in_createUserStatement3771); 
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:701:23: ( K_IF K_NOT K_EXISTS )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==K_IF) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:701:24: K_IF K_NOT K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_createUserStatement3774); 
                    match(input,K_NOT,FOLLOW_K_NOT_in_createUserStatement3776); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createUserStatement3778); 
                     ifNotExists = true; 

                    }
                    break;

            }

            pushFollow(FOLLOW_username_in_createUserStatement3784);
            username10=username();

            state._fsp--;

            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:702:7: ( K_WITH userOptions[opts] )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==K_WITH) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:702:9: K_WITH userOptions[opts]
                    {
                    match(input,K_WITH,FOLLOW_K_WITH_in_createUserStatement3794); 
                    pushFollow(FOLLOW_userOptions_in_createUserStatement3796);
                    userOptions(opts);

                    state._fsp--;


                    }
                    break;

            }

            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:703:7: ( K_SUPERUSER | K_NOSUPERUSER )?
            int alt78=3;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==K_SUPERUSER) ) {
                alt78=1;
            }
            else if ( (LA78_0==K_NOSUPERUSER) ) {
                alt78=2;
            }
            switch (alt78) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:703:9: K_SUPERUSER
                    {
                    match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_createUserStatement3810); 
                     superuser = true; 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:703:45: K_NOSUPERUSER
                    {
                    match(input,K_NOSUPERUSER,FOLLOW_K_NOSUPERUSER_in_createUserStatement3816); 
                     superuser = false; 

                    }
                    break;

            }

             stmt = new CreateUserStatement((username10!=null?input.toString(username10.start,username10.stop):null), opts, superuser, ifNotExists); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "createUserStatement"


    // $ANTLR start "alterUserStatement"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:707:1: alterUserStatement returns [AlterUserStatement stmt] : K_ALTER K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? ;
    public final AlterUserStatement alterUserStatement() throws RecognitionException {
        AlterUserStatement stmt = null;

        CqlParser.username_return username11 = null;



                UserOptions opts = new UserOptions();
                Boolean superuser = null;
            
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:715:5: ( K_ALTER K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:715:7: K_ALTER K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )?
            {
            match(input,K_ALTER,FOLLOW_K_ALTER_in_alterUserStatement3861); 
            match(input,K_USER,FOLLOW_K_USER_in_alterUserStatement3863); 
            pushFollow(FOLLOW_username_in_alterUserStatement3865);
            username11=username();

            state._fsp--;

            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:716:7: ( K_WITH userOptions[opts] )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==K_WITH) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:716:9: K_WITH userOptions[opts]
                    {
                    match(input,K_WITH,FOLLOW_K_WITH_in_alterUserStatement3875); 
                    pushFollow(FOLLOW_userOptions_in_alterUserStatement3877);
                    userOptions(opts);

                    state._fsp--;


                    }
                    break;

            }

            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:717:7: ( K_SUPERUSER | K_NOSUPERUSER )?
            int alt80=3;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==K_SUPERUSER) ) {
                alt80=1;
            }
            else if ( (LA80_0==K_NOSUPERUSER) ) {
                alt80=2;
            }
            switch (alt80) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:717:9: K_SUPERUSER
                    {
                    match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_alterUserStatement3891); 
                     superuser = true; 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:717:45: K_NOSUPERUSER
                    {
                    match(input,K_NOSUPERUSER,FOLLOW_K_NOSUPERUSER_in_alterUserStatement3897); 
                     superuser = false; 

                    }
                    break;

            }

             stmt = new AlterUserStatement((username11!=null?input.toString(username11.start,username11.stop):null), opts, superuser); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "alterUserStatement"


    // $ANTLR start "dropUserStatement"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:721:1: dropUserStatement returns [DropUserStatement stmt] : K_DROP K_USER ( K_IF K_EXISTS )? username ;
    public final DropUserStatement dropUserStatement() throws RecognitionException {
        DropUserStatement stmt = null;

        CqlParser.username_return username12 = null;


         boolean ifExists = false; 
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:726:5: ( K_DROP K_USER ( K_IF K_EXISTS )? username )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:726:7: K_DROP K_USER ( K_IF K_EXISTS )? username
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropUserStatement3942); 
            match(input,K_USER,FOLLOW_K_USER_in_dropUserStatement3944); 
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:726:21: ( K_IF K_EXISTS )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==K_IF) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:726:22: K_IF K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_dropUserStatement3947); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropUserStatement3949); 
                     ifExists = true; 

                    }
                    break;

            }

            pushFollow(FOLLOW_username_in_dropUserStatement3955);
            username12=username();

            state._fsp--;

             stmt = new DropUserStatement((username12!=null?input.toString(username12.start,username12.stop):null), ifExists); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "dropUserStatement"


    // $ANTLR start "listUsersStatement"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:729:1: listUsersStatement returns [ListUsersStatement stmt] : K_LIST K_USERS ;
    public final ListUsersStatement listUsersStatement() throws RecognitionException {
        ListUsersStatement stmt = null;

        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:733:5: ( K_LIST K_USERS )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:733:7: K_LIST K_USERS
            {
            match(input,K_LIST,FOLLOW_K_LIST_in_listUsersStatement3980); 
            match(input,K_USERS,FOLLOW_K_USERS_in_listUsersStatement3982); 
             stmt = new ListUsersStatement(); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "listUsersStatement"


    // $ANTLR start "userOptions"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:736:1: userOptions[UserOptions opts] : userOption[opts] ;
    public final void userOptions(UserOptions opts) throws RecognitionException {
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:737:5: ( userOption[opts] )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:737:7: userOption[opts]
            {
            pushFollow(FOLLOW_userOption_in_userOptions4002);
            userOption(opts);

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "userOptions"


    // $ANTLR start "userOption"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:740:1: userOption[UserOptions opts] : k= K_PASSWORD v= STRING_LITERAL ;
    public final void userOption(UserOptions opts) throws RecognitionException {
        Token k=null;
        Token v=null;

        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:741:5: (k= K_PASSWORD v= STRING_LITERAL )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:741:7: k= K_PASSWORD v= STRING_LITERAL
            {
            k=(Token)match(input,K_PASSWORD,FOLLOW_K_PASSWORD_in_userOption4023); 
            v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_userOption4027); 
             opts.put((k!=null?k.getText():null), (v!=null?v.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "userOption"


    // $ANTLR start "cident"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:744:1: cident returns [ColumnIdentifier.Raw id] : (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword );
    public final ColumnIdentifier.Raw cident() throws RecognitionException {
        ColumnIdentifier.Raw id = null;

        Token t=null;
        String k = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:750:5: (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword )
            int alt82=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt82=1;
                }
                break;
            case QUOTED_NAME:
                {
                alt82=2;
                }
                break;
            case K_DISTINCT:
            case K_COUNT:
            case K_AS:
            case K_FILTERING:
            case K_WRITETIME:
            case K_TTL:
            case K_VALUES:
            case K_EXISTS:
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_STATIC:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_CUSTOM:
            case K_TRIGGER:
            case K_TYPE:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt82=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:750:7: t= IDENT
                    {
                    t=(Token)match(input,IDENT,FOLLOW_IDENT_in_cident4058); 
                     id = new ColumnIdentifier.Raw((t!=null?t.getText():null), false); 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:751:7: t= QUOTED_NAME
                    {
                    t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_cident4083); 
                     id = new ColumnIdentifier.Raw((t!=null?t.getText():null), true); 

                    }
                    break;
                case 3 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:752:7: k= unreserved_keyword
                    {
                    pushFollow(FOLLOW_unreserved_keyword_in_cident4102);
                    k=unreserved_keyword();

                    state._fsp--;

                     id = new ColumnIdentifier.Raw(k, false); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return id;
    }
    // $ANTLR end "cident"


    // $ANTLR start "ident"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:756:1: ident returns [ColumnIdentifier id] : (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword );
    public final ColumnIdentifier ident() throws RecognitionException {
        ColumnIdentifier id = null;

        Token t=null;
        String k = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:757:5: (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword )
            int alt83=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt83=1;
                }
                break;
            case QUOTED_NAME:
                {
                alt83=2;
                }
                break;
            case K_DISTINCT:
            case K_COUNT:
            case K_AS:
            case K_FILTERING:
            case K_WRITETIME:
            case K_TTL:
            case K_VALUES:
            case K_EXISTS:
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_STATIC:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_CUSTOM:
            case K_TRIGGER:
            case K_TYPE:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt83=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:757:7: t= IDENT
                    {
                    t=(Token)match(input,IDENT,FOLLOW_IDENT_in_ident4128); 
                     id = new ColumnIdentifier((t!=null?t.getText():null), false); 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:758:7: t= QUOTED_NAME
                    {
                    t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_ident4153); 
                     id = new ColumnIdentifier((t!=null?t.getText():null), true); 

                    }
                    break;
                case 3 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:759:7: k= unreserved_keyword
                    {
                    pushFollow(FOLLOW_unreserved_keyword_in_ident4172);
                    k=unreserved_keyword();

                    state._fsp--;

                     id = new ColumnIdentifier(k, false); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return id;
    }
    // $ANTLR end "ident"


    // $ANTLR start "keyspaceName"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:763:1: keyspaceName returns [String id] : cfOrKsName[name, true] ;
    public final String keyspaceName() throws RecognitionException {
        String id = null;

         CFName name = new CFName(); 
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:765:5: ( cfOrKsName[name, true] )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:765:7: cfOrKsName[name, true]
            {
            pushFollow(FOLLOW_cfOrKsName_in_keyspaceName4205);
            cfOrKsName(name, true);

            state._fsp--;

             id = name.getKeyspace(); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return id;
    }
    // $ANTLR end "keyspaceName"


    // $ANTLR start "columnFamilyName"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:768:1: columnFamilyName returns [CFName name] : ( cfOrKsName[name, true] '.' )? cfOrKsName[name, false] ;
    public final CFName columnFamilyName() throws RecognitionException {
        CFName name = null;

         name = new CFName(); 
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:770:5: ( ( cfOrKsName[name, true] '.' )? cfOrKsName[name, false] )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:770:7: ( cfOrKsName[name, true] '.' )? cfOrKsName[name, false]
            {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:770:7: ( cfOrKsName[name, true] '.' )?
            int alt84=2;
            alt84 = dfa84.predict(input);
            switch (alt84) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:770:8: cfOrKsName[name, true] '.'
                    {
                    pushFollow(FOLLOW_cfOrKsName_in_columnFamilyName4239);
                    cfOrKsName(name, true);

                    state._fsp--;

                    match(input,143,FOLLOW_143_in_columnFamilyName4242); 

                    }
                    break;

            }

            pushFollow(FOLLOW_cfOrKsName_in_columnFamilyName4246);
            cfOrKsName(name, false);

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return name;
    }
    // $ANTLR end "columnFamilyName"


    // $ANTLR start "cfOrKsName"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:773:1: cfOrKsName[CFName name, boolean isKs] : (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword | QMARK );
    public final void cfOrKsName(CFName name, boolean isKs) throws RecognitionException {
        Token t=null;
        String k = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:774:5: (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword | QMARK )
            int alt85=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt85=1;
                }
                break;
            case QUOTED_NAME:
                {
                alt85=2;
                }
                break;
            case K_DISTINCT:
            case K_COUNT:
            case K_AS:
            case K_FILTERING:
            case K_WRITETIME:
            case K_TTL:
            case K_VALUES:
            case K_EXISTS:
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_STATIC:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_CUSTOM:
            case K_TRIGGER:
            case K_TYPE:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt85=3;
                }
                break;
            case QMARK:
                {
                alt85=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:774:7: t= IDENT
                    {
                    t=(Token)match(input,IDENT,FOLLOW_IDENT_in_cfOrKsName4267); 
                     if (isKs) name.setKeyspace((t!=null?t.getText():null), false); else name.setColumnFamily((t!=null?t.getText():null), false); 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:775:7: t= QUOTED_NAME
                    {
                    t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_cfOrKsName4292); 
                     if (isKs) name.setKeyspace((t!=null?t.getText():null), true); else name.setColumnFamily((t!=null?t.getText():null), true); 

                    }
                    break;
                case 3 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:776:7: k= unreserved_keyword
                    {
                    pushFollow(FOLLOW_unreserved_keyword_in_cfOrKsName4311);
                    k=unreserved_keyword();

                    state._fsp--;

                     if (isKs) name.setKeyspace(k, false); else name.setColumnFamily(k, false); 

                    }
                    break;
                case 4 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:777:7: QMARK
                    {
                    match(input,QMARK,FOLLOW_QMARK_in_cfOrKsName4321); 
                    addRecognitionError("Bind variables cannot be used for keyspace or table names");

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cfOrKsName"


    // $ANTLR start "constant"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:780:1: constant returns [Constants.Literal constant] : (t= STRING_LITERAL | t= INTEGER | t= FLOAT | t= BOOLEAN | t= UUID | t= HEXNUMBER | ( '-' )? t= ( K_NAN | K_INFINITY ) );
    public final Constants.Literal constant() throws RecognitionException {
        Constants.Literal constant = null;

        Token t=null;

        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:781:5: (t= STRING_LITERAL | t= INTEGER | t= FLOAT | t= BOOLEAN | t= UUID | t= HEXNUMBER | ( '-' )? t= ( K_NAN | K_INFINITY ) )
            int alt87=7;
            switch ( input.LA(1) ) {
            case STRING_LITERAL:
                {
                alt87=1;
                }
                break;
            case INTEGER:
                {
                alt87=2;
                }
                break;
            case FLOAT:
                {
                alt87=3;
                }
                break;
            case BOOLEAN:
                {
                alt87=4;
                }
                break;
            case UUID:
                {
                alt87=5;
                }
                break;
            case HEXNUMBER:
                {
                alt87=6;
                }
                break;
            case K_NAN:
            case K_INFINITY:
            case 144:
                {
                alt87=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:781:7: t= STRING_LITERAL
                    {
                    t=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_constant4346); 
                     constant = Constants.Literal.string((t!=null?t.getText():null)); 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:782:7: t= INTEGER
                    {
                    t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_constant4358); 
                     constant = Constants.Literal.integer((t!=null?t.getText():null)); 

                    }
                    break;
                case 3 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:783:7: t= FLOAT
                    {
                    t=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constant4377); 
                     constant = Constants.Literal.floatingPoint((t!=null?t.getText():null)); 

                    }
                    break;
                case 4 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:784:7: t= BOOLEAN
                    {
                    t=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_constant4398); 
                     constant = Constants.Literal.bool((t!=null?t.getText():null)); 

                    }
                    break;
                case 5 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:785:7: t= UUID
                    {
                    t=(Token)match(input,UUID,FOLLOW_UUID_in_constant4417); 
                     constant = Constants.Literal.uuid((t!=null?t.getText():null)); 

                    }
                    break;
                case 6 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:786:7: t= HEXNUMBER
                    {
                    t=(Token)match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_constant4439); 
                     constant = Constants.Literal.hex((t!=null?t.getText():null)); 

                    }
                    break;
                case 7 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:787:7: ( '-' )? t= ( K_NAN | K_INFINITY )
                    {
                     String sign=""; 
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:787:27: ( '-' )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==144) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:787:28: '-'
                            {
                            match(input,144,FOLLOW_144_in_constant4457); 
                            sign = "-"; 

                            }
                            break;

                    }

                    t=(Token)input.LT(1);
                    if ( (input.LA(1)>=K_NAN && input.LA(1)<=K_INFINITY) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                     constant = Constants.Literal.floatingPoint(sign + (t!=null?t.getText():null)); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return constant;
    }
    // $ANTLR end "constant"


    // $ANTLR start "map_literal"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:790:1: map_literal returns [Maps.Literal map] : '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}' ;
    public final Maps.Literal map_literal() throws RecognitionException {
        Maps.Literal map = null;

        Term.Raw k1 = null;

        Term.Raw v1 = null;

        Term.Raw kn = null;

        Term.Raw vn = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:791:5: ( '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}' )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:791:7: '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}'
            {
            match(input,145,FOLLOW_145_in_map_literal4495); 
             List<Pair<Term.Raw, Term.Raw>> m = new ArrayList<Pair<Term.Raw, Term.Raw>>(); 
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:792:11: (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==K_DISTINCT||LA89_0==K_AS||LA89_0==K_FILTERING||LA89_0==INTEGER||LA89_0==K_VALUES||LA89_0==K_EXISTS||LA89_0==K_TIMESTAMP||LA89_0==K_COUNTER||LA89_0==K_STATIC||(LA89_0>=K_KEY && LA89_0<=K_CUSTOM)||LA89_0==IDENT||(LA89_0>=STRING_LITERAL && LA89_0<=K_TRIGGER)||LA89_0==K_TYPE||LA89_0==K_LIST||(LA89_0>=K_ALL && LA89_0<=K_PASSWORD)||(LA89_0>=QMARK && LA89_0<=K_TOKEN)||(LA89_0>=K_ASCII && LA89_0<=K_MAP)||LA89_0==137||LA89_0==141||(LA89_0>=144 && LA89_0<=146)) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:792:13: k1= term ':' v1= term ( ',' kn= term ':' vn= term )*
                    {
                    pushFollow(FOLLOW_term_in_map_literal4513);
                    k1=term();

                    state._fsp--;

                    match(input,146,FOLLOW_146_in_map_literal4515); 
                    pushFollow(FOLLOW_term_in_map_literal4519);
                    v1=term();

                    state._fsp--;

                     m.add(Pair.create(k1, v1)); 
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:792:65: ( ',' kn= term ':' vn= term )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==139) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:792:67: ',' kn= term ':' vn= term
                    	    {
                    	    match(input,139,FOLLOW_139_in_map_literal4525); 
                    	    pushFollow(FOLLOW_term_in_map_literal4529);
                    	    kn=term();

                    	    state._fsp--;

                    	    match(input,146,FOLLOW_146_in_map_literal4531); 
                    	    pushFollow(FOLLOW_term_in_map_literal4535);
                    	    vn=term();

                    	    state._fsp--;

                    	     m.add(Pair.create(kn, vn)); 

                    	    }
                    	    break;

                    	default :
                    	    break loop88;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,147,FOLLOW_147_in_map_literal4551); 
             map = new Maps.Literal(m); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return map;
    }
    // $ANTLR end "map_literal"


    // $ANTLR start "set_or_map"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:796:1: set_or_map[Term.Raw t] returns [Term.Raw value] : ( ':' v= term ( ',' kn= term ':' vn= term )* | ( ',' tn= term )* );
    public final Term.Raw set_or_map(Term.Raw t) throws RecognitionException {
        Term.Raw value = null;

        Term.Raw v = null;

        Term.Raw kn = null;

        Term.Raw vn = null;

        Term.Raw tn = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:797:5: ( ':' v= term ( ',' kn= term ':' vn= term )* | ( ',' tn= term )* )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==146) ) {
                alt92=1;
            }
            else if ( (LA92_0==139||LA92_0==147) ) {
                alt92=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:797:7: ':' v= term ( ',' kn= term ':' vn= term )*
                    {
                    match(input,146,FOLLOW_146_in_set_or_map4575); 
                    pushFollow(FOLLOW_term_in_set_or_map4579);
                    v=term();

                    state._fsp--;

                     List<Pair<Term.Raw, Term.Raw>> m = new ArrayList<Pair<Term.Raw, Term.Raw>>(); m.add(Pair.create(t, v)); 
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:798:11: ( ',' kn= term ':' vn= term )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==139) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:798:13: ',' kn= term ':' vn= term
                    	    {
                    	    match(input,139,FOLLOW_139_in_set_or_map4595); 
                    	    pushFollow(FOLLOW_term_in_set_or_map4599);
                    	    kn=term();

                    	    state._fsp--;

                    	    match(input,146,FOLLOW_146_in_set_or_map4601); 
                    	    pushFollow(FOLLOW_term_in_set_or_map4605);
                    	    vn=term();

                    	    state._fsp--;

                    	     m.add(Pair.create(kn, vn)); 

                    	    }
                    	    break;

                    	default :
                    	    break loop90;
                        }
                    } while (true);

                     value = new Maps.Literal(m); 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:800:7: ( ',' tn= term )*
                    {
                     List<Term.Raw> s = new ArrayList<Term.Raw>(); s.add(t); 
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:801:11: ( ',' tn= term )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==139) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:801:13: ',' tn= term
                    	    {
                    	    match(input,139,FOLLOW_139_in_set_or_map4640); 
                    	    pushFollow(FOLLOW_term_in_set_or_map4644);
                    	    tn=term();

                    	    state._fsp--;

                    	     s.add(tn); 

                    	    }
                    	    break;

                    	default :
                    	    break loop91;
                        }
                    } while (true);

                     value = new Sets.Literal(s); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "set_or_map"


    // $ANTLR start "collection_literal"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:805:1: collection_literal returns [Term.Raw value] : ( '[' (t1= term ( ',' tn= term )* )? ']' | '{' t= term v= set_or_map[t] '}' | '{' '}' );
    public final Term.Raw collection_literal() throws RecognitionException {
        Term.Raw value = null;

        Term.Raw t1 = null;

        Term.Raw tn = null;

        Term.Raw t = null;

        Term.Raw v = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:806:5: ( '[' (t1= term ( ',' tn= term )* )? ']' | '{' t= term v= set_or_map[t] '}' | '{' '}' )
            int alt95=3;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==141) ) {
                alt95=1;
            }
            else if ( (LA95_0==145) ) {
                int LA95_2 = input.LA(2);

                if ( (LA95_2==147) ) {
                    alt95=3;
                }
                else if ( (LA95_2==K_DISTINCT||LA95_2==K_AS||LA95_2==K_FILTERING||LA95_2==INTEGER||LA95_2==K_VALUES||LA95_2==K_EXISTS||LA95_2==K_TIMESTAMP||LA95_2==K_COUNTER||LA95_2==K_STATIC||(LA95_2>=K_KEY && LA95_2<=K_CUSTOM)||LA95_2==IDENT||(LA95_2>=STRING_LITERAL && LA95_2<=K_TRIGGER)||LA95_2==K_TYPE||LA95_2==K_LIST||(LA95_2>=K_ALL && LA95_2<=K_PASSWORD)||(LA95_2>=QMARK && LA95_2<=K_TOKEN)||(LA95_2>=K_ASCII && LA95_2<=K_MAP)||LA95_2==137||LA95_2==141||(LA95_2>=144 && LA95_2<=146)) ) {
                    alt95=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 95, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:806:7: '[' (t1= term ( ',' tn= term )* )? ']'
                    {
                    match(input,141,FOLLOW_141_in_collection_literal4678); 
                     List<Term.Raw> l = new ArrayList<Term.Raw>(); 
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:807:11: (t1= term ( ',' tn= term )* )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==K_DISTINCT||LA94_0==K_AS||LA94_0==K_FILTERING||LA94_0==INTEGER||LA94_0==K_VALUES||LA94_0==K_EXISTS||LA94_0==K_TIMESTAMP||LA94_0==K_COUNTER||LA94_0==K_STATIC||(LA94_0>=K_KEY && LA94_0<=K_CUSTOM)||LA94_0==IDENT||(LA94_0>=STRING_LITERAL && LA94_0<=K_TRIGGER)||LA94_0==K_TYPE||LA94_0==K_LIST||(LA94_0>=K_ALL && LA94_0<=K_PASSWORD)||(LA94_0>=QMARK && LA94_0<=K_TOKEN)||(LA94_0>=K_ASCII && LA94_0<=K_MAP)||LA94_0==137||LA94_0==141||(LA94_0>=144 && LA94_0<=146)) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:807:13: t1= term ( ',' tn= term )*
                            {
                            pushFollow(FOLLOW_term_in_collection_literal4696);
                            t1=term();

                            state._fsp--;

                             l.add(t1); 
                            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:807:36: ( ',' tn= term )*
                            loop93:
                            do {
                                int alt93=2;
                                int LA93_0 = input.LA(1);

                                if ( (LA93_0==139) ) {
                                    alt93=1;
                                }


                                switch (alt93) {
                            	case 1 :
                            	    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:807:38: ',' tn= term
                            	    {
                            	    match(input,139,FOLLOW_139_in_collection_literal4702); 
                            	    pushFollow(FOLLOW_term_in_collection_literal4706);
                            	    tn=term();

                            	    state._fsp--;

                            	     l.add(tn); 

                            	    }
                            	    break;

                            	default :
                            	    break loop93;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,142,FOLLOW_142_in_collection_literal4722); 
                     value = new Lists.Literal(l); 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:809:7: '{' t= term v= set_or_map[t] '}'
                    {
                    match(input,145,FOLLOW_145_in_collection_literal4732); 
                    pushFollow(FOLLOW_term_in_collection_literal4736);
                    t=term();

                    state._fsp--;

                    pushFollow(FOLLOW_set_or_map_in_collection_literal4740);
                    v=set_or_map(t);

                    state._fsp--;

                     value = v; 
                    match(input,147,FOLLOW_147_in_collection_literal4745); 

                    }
                    break;
                case 3 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:812:7: '{' '}'
                    {
                    match(input,145,FOLLOW_145_in_collection_literal4763); 
                    match(input,147,FOLLOW_147_in_collection_literal4765); 
                     value = new Sets.Literal(Collections.<Term.Raw>emptyList()); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "collection_literal"


    // $ANTLR start "value"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:815:1: value returns [Term.Raw value] : (c= constant | l= collection_literal | K_NULL | ':' id= ident | QMARK );
    public final Term.Raw value() throws RecognitionException {
        Term.Raw value = null;

        Constants.Literal c = null;

        Term.Raw l = null;

        ColumnIdentifier id = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:816:5: (c= constant | l= collection_literal | K_NULL | ':' id= ident | QMARK )
            int alt96=5;
            switch ( input.LA(1) ) {
            case INTEGER:
            case STRING_LITERAL:
            case FLOAT:
            case BOOLEAN:
            case UUID:
            case HEXNUMBER:
            case K_NAN:
            case K_INFINITY:
            case 144:
                {
                alt96=1;
                }
                break;
            case 141:
            case 145:
                {
                alt96=2;
                }
                break;
            case K_NULL:
                {
                alt96=3;
                }
                break;
            case 146:
                {
                alt96=4;
                }
                break;
            case QMARK:
                {
                alt96=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:816:7: c= constant
                    {
                    pushFollow(FOLLOW_constant_in_value4790);
                    c=constant();

                    state._fsp--;

                     value = c; 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:817:7: l= collection_literal
                    {
                    pushFollow(FOLLOW_collection_literal_in_value4812);
                    l=collection_literal();

                    state._fsp--;

                     value = l; 

                    }
                    break;
                case 3 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:818:7: K_NULL
                    {
                    match(input,K_NULL,FOLLOW_K_NULL_in_value4822); 
                     value = Constants.NULL_LITERAL; 

                    }
                    break;
                case 4 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:819:7: ':' id= ident
                    {
                    match(input,146,FOLLOW_146_in_value4846); 
                    pushFollow(FOLLOW_ident_in_value4850);
                    id=ident();

                    state._fsp--;

                     value = newBindVariables(id); 

                    }
                    break;
                case 5 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:820:7: QMARK
                    {
                    match(input,QMARK,FOLLOW_QMARK_in_value4868); 
                     value = newBindVariables(null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "value"


    // $ANTLR start "intValue"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:823:1: intValue returns [Term.Raw value] : ( | t= INTEGER | ':' id= ident | QMARK );
    public final Term.Raw intValue() throws RecognitionException {
        Term.Raw value = null;

        Token t=null;
        ColumnIdentifier id = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:824:5: ( | t= INTEGER | ':' id= ident | QMARK )
            int alt97=4;
            switch ( input.LA(1) ) {
            case EOF:
            case K_WHERE:
            case K_ALLOW:
            case K_AND:
            case K_INSERT:
            case K_UPDATE:
            case K_SET:
            case K_DELETE:
            case K_APPLY:
            case 136:
                {
                alt97=1;
                }
                break;
            case INTEGER:
                {
                alt97=2;
                }
                break;
            case 146:
                {
                alt97=3;
                }
                break;
            case QMARK:
                {
                alt97=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:825:5: 
                    {
                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:825:7: t= INTEGER
                    {
                    t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_intValue4914); 
                     value = Constants.Literal.integer((t!=null?t.getText():null)); 

                    }
                    break;
                case 3 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:826:7: ':' id= ident
                    {
                    match(input,146,FOLLOW_146_in_intValue4928); 
                    pushFollow(FOLLOW_ident_in_intValue4932);
                    id=ident();

                    state._fsp--;

                     value = newBindVariables(id); 

                    }
                    break;
                case 4 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:827:7: QMARK
                    {
                    match(input,QMARK,FOLLOW_QMARK_in_intValue4943); 
                     value = newBindVariables(null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "intValue"


    // $ANTLR start "functionName"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:830:1: functionName returns [String s] : (f= IDENT | u= unreserved_function_keyword | K_TOKEN );
    public final String functionName() throws RecognitionException {
        String s = null;

        Token f=null;
        String u = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:831:5: (f= IDENT | u= unreserved_function_keyword | K_TOKEN )
            int alt98=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt98=1;
                }
                break;
            case K_DISTINCT:
            case K_AS:
            case K_FILTERING:
            case K_VALUES:
            case K_EXISTS:
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_STATIC:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_CUSTOM:
            case K_TRIGGER:
            case K_TYPE:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt98=2;
                }
                break;
            case K_TOKEN:
                {
                alt98=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:831:7: f= IDENT
                    {
                    f=(Token)match(input,IDENT,FOLLOW_IDENT_in_functionName4976); 
                     s = (f!=null?f.getText():null); 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:832:7: u= unreserved_function_keyword
                    {
                    pushFollow(FOLLOW_unreserved_function_keyword_in_functionName5010);
                    u=unreserved_function_keyword();

                    state._fsp--;

                     s = u; 

                    }
                    break;
                case 3 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:833:7: K_TOKEN
                    {
                    match(input,K_TOKEN,FOLLOW_K_TOKEN_in_functionName5020); 
                     s = "token"; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return s;
    }
    // $ANTLR end "functionName"


    // $ANTLR start "functionArgs"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:836:1: functionArgs returns [List<Term.Raw> a] : ( '(' ')' | '(' t1= term ( ',' tn= term )* ')' );
    public final List<Term.Raw> functionArgs() throws RecognitionException {
        List<Term.Raw> a = null;

        Term.Raw t1 = null;

        Term.Raw tn = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:837:5: ( '(' ')' | '(' t1= term ( ',' tn= term )* ')' )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==137) ) {
                int LA100_1 = input.LA(2);

                if ( (LA100_1==138) ) {
                    alt100=1;
                }
                else if ( (LA100_1==K_DISTINCT||LA100_1==K_AS||LA100_1==K_FILTERING||LA100_1==INTEGER||LA100_1==K_VALUES||LA100_1==K_EXISTS||LA100_1==K_TIMESTAMP||LA100_1==K_COUNTER||LA100_1==K_STATIC||(LA100_1>=K_KEY && LA100_1<=K_CUSTOM)||LA100_1==IDENT||(LA100_1>=STRING_LITERAL && LA100_1<=K_TRIGGER)||LA100_1==K_TYPE||LA100_1==K_LIST||(LA100_1>=K_ALL && LA100_1<=K_PASSWORD)||(LA100_1>=QMARK && LA100_1<=K_TOKEN)||(LA100_1>=K_ASCII && LA100_1<=K_MAP)||LA100_1==137||LA100_1==141||(LA100_1>=144 && LA100_1<=146)) ) {
                    alt100=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:837:7: '(' ')'
                    {
                    match(input,137,FOLLOW_137_in_functionArgs5065); 
                    match(input,138,FOLLOW_138_in_functionArgs5067); 
                     a = Collections.emptyList(); 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:838:7: '(' t1= term ( ',' tn= term )* ')'
                    {
                    match(input,137,FOLLOW_137_in_functionArgs5077); 
                    pushFollow(FOLLOW_term_in_functionArgs5081);
                    t1=term();

                    state._fsp--;

                     List<Term.Raw> args = new ArrayList<Term.Raw>(); args.add(t1); 
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:839:11: ( ',' tn= term )*
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==139) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:839:13: ',' tn= term
                    	    {
                    	    match(input,139,FOLLOW_139_in_functionArgs5097); 
                    	    pushFollow(FOLLOW_term_in_functionArgs5101);
                    	    tn=term();

                    	    state._fsp--;

                    	     args.add(tn); 

                    	    }
                    	    break;

                    	default :
                    	    break loop99;
                        }
                    } while (true);

                    match(input,138,FOLLOW_138_in_functionArgs5115); 
                     a = args; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return a;
    }
    // $ANTLR end "functionArgs"


    // $ANTLR start "term"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:843:1: term returns [Term.Raw term] : (v= value | f= functionName args= functionArgs | '(' c= comparatorType ')' t= term );
    public final Term.Raw term() throws RecognitionException {
        Term.Raw term = null;

        Term.Raw v = null;

        String f = null;

        List<Term.Raw> args = null;

        CQL3Type c = null;

        Term.Raw t = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:844:5: (v= value | f= functionName args= functionArgs | '(' c= comparatorType ')' t= term )
            int alt101=3;
            switch ( input.LA(1) ) {
            case INTEGER:
            case STRING_LITERAL:
            case QMARK:
            case FLOAT:
            case BOOLEAN:
            case UUID:
            case HEXNUMBER:
            case K_NAN:
            case K_INFINITY:
            case K_NULL:
            case 141:
            case 144:
            case 145:
            case 146:
                {
                alt101=1;
                }
                break;
            case K_DISTINCT:
            case K_AS:
            case K_FILTERING:
            case K_VALUES:
            case K_EXISTS:
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_STATIC:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_CUSTOM:
            case IDENT:
            case K_TRIGGER:
            case K_TYPE:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case K_TOKEN:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt101=2;
                }
                break;
            case 137:
                {
                alt101=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:844:7: v= value
                    {
                    pushFollow(FOLLOW_value_in_term5140);
                    v=value();

                    state._fsp--;

                     term = v; 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:845:7: f= functionName args= functionArgs
                    {
                    pushFollow(FOLLOW_functionName_in_term5177);
                    f=functionName();

                    state._fsp--;

                    pushFollow(FOLLOW_functionArgs_in_term5181);
                    args=functionArgs();

                    state._fsp--;

                     term = new FunctionCall.Raw(f, args); 

                    }
                    break;
                case 3 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:846:7: '(' c= comparatorType ')' t= term
                    {
                    match(input,137,FOLLOW_137_in_term5191); 
                    pushFollow(FOLLOW_comparatorType_in_term5195);
                    c=comparatorType();

                    state._fsp--;

                    match(input,138,FOLLOW_138_in_term5197); 
                    pushFollow(FOLLOW_term_in_term5201);
                    t=term();

                    state._fsp--;

                     term = new TypeCast(c, t); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return term;
    }
    // $ANTLR end "term"


    // $ANTLR start "columnOperation"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:849:1: columnOperation[List<Pair<ColumnIdentifier.Raw, Operation.RawUpdate>> operations] : (key= cident '=' t= term ( '+' c= cident )? | key= cident '=' c= cident sig= ( '+' | '-' ) t= term | key= cident '=' c= cident i= INTEGER | key= cident '[' k= term ']' '=' t= term );
    public final void columnOperation(List<Pair<ColumnIdentifier.Raw, Operation.RawUpdate>> operations) throws RecognitionException {
        Token sig=null;
        Token i=null;
        ColumnIdentifier.Raw key = null;

        Term.Raw t = null;

        ColumnIdentifier.Raw c = null;

        Term.Raw k = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:850:5: (key= cident '=' t= term ( '+' c= cident )? | key= cident '=' c= cident sig= ( '+' | '-' ) t= term | key= cident '=' c= cident i= INTEGER | key= cident '[' k= term ']' '=' t= term )
            int alt103=4;
            alt103 = dfa103.predict(input);
            switch (alt103) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:850:7: key= cident '=' t= term ( '+' c= cident )?
                    {
                    pushFollow(FOLLOW_cident_in_columnOperation5224);
                    key=cident();

                    state._fsp--;

                    match(input,148,FOLLOW_148_in_columnOperation5226); 
                    pushFollow(FOLLOW_term_in_columnOperation5230);
                    t=term();

                    state._fsp--;

                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:850:29: ( '+' c= cident )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==149) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:850:30: '+' c= cident
                            {
                            match(input,149,FOLLOW_149_in_columnOperation5233); 
                            pushFollow(FOLLOW_cident_in_columnOperation5237);
                            c=cident();

                            state._fsp--;


                            }
                            break;

                    }


                              if (c == null)
                              {
                                  addRawUpdate(operations, key, new Operation.SetValue(t));
                              }
                              else
                              {
                                  if (!key.equals(c))
                                      addRecognitionError("Only expressions of the form X = <value> + X are supported.");
                                  addRawUpdate(operations, key, new Operation.Prepend(t));
                              }
                          

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:863:7: key= cident '=' c= cident sig= ( '+' | '-' ) t= term
                    {
                    pushFollow(FOLLOW_cident_in_columnOperation5258);
                    key=cident();

                    state._fsp--;

                    match(input,148,FOLLOW_148_in_columnOperation5260); 
                    pushFollow(FOLLOW_cident_in_columnOperation5264);
                    c=cident();

                    state._fsp--;

                    sig=(Token)input.LT(1);
                    if ( input.LA(1)==144||input.LA(1)==149 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_term_in_columnOperation5278);
                    t=term();

                    state._fsp--;


                              if (!key.equals(c))
                                  addRecognitionError("Only expressions of the form X = X " + (sig!=null?sig.getText():null) + "<value> are supported.");
                              addRawUpdate(operations, key, (sig!=null?sig.getText():null).equals("+") ? new Operation.Addition(t) : new Operation.Substraction(t));
                          

                    }
                    break;
                case 3 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:869:7: key= cident '=' c= cident i= INTEGER
                    {
                    pushFollow(FOLLOW_cident_in_columnOperation5296);
                    key=cident();

                    state._fsp--;

                    match(input,148,FOLLOW_148_in_columnOperation5298); 
                    pushFollow(FOLLOW_cident_in_columnOperation5302);
                    c=cident();

                    state._fsp--;

                    i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_columnOperation5306); 

                              // Note that this production *is* necessary because X = X - 3 will in fact be lexed as [ X, '=', X, INTEGER].
                              if (!key.equals(c))
                                  // We don't yet allow a '+' in front of an integer, but we could in the future really, so let's be future-proof in our error message
                                  addRecognitionError("Only expressions of the form X = X " + ((i!=null?i.getText():null).charAt(0) == '-' ? '-' : '+') + " <value> are supported.");
                              addRawUpdate(operations, key, new Operation.Addition(Constants.Literal.integer((i!=null?i.getText():null))));
                          

                    }
                    break;
                case 4 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:877:7: key= cident '[' k= term ']' '=' t= term
                    {
                    pushFollow(FOLLOW_cident_in_columnOperation5324);
                    key=cident();

                    state._fsp--;

                    match(input,141,FOLLOW_141_in_columnOperation5326); 
                    pushFollow(FOLLOW_term_in_columnOperation5330);
                    k=term();

                    state._fsp--;

                    match(input,142,FOLLOW_142_in_columnOperation5332); 
                    match(input,148,FOLLOW_148_in_columnOperation5334); 
                    pushFollow(FOLLOW_term_in_columnOperation5338);
                    t=term();

                    state._fsp--;


                              addRawUpdate(operations, key, new Operation.SetElement(k, t));
                          

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "columnOperation"


    // $ANTLR start "columnCondition"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:883:1: columnCondition[List<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>> conditions] : (key= cident '=' t= term | key= cident '[' element= term ']' '=' t= term );
    public final void columnCondition(List<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>> conditions) throws RecognitionException {
        ColumnIdentifier.Raw key = null;

        Term.Raw t = null;

        Term.Raw element = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:885:5: (key= cident '=' t= term | key= cident '[' element= term ']' '=' t= term )
            int alt104=2;
            alt104 = dfa104.predict(input);
            switch (alt104) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:885:7: key= cident '=' t= term
                    {
                    pushFollow(FOLLOW_cident_in_columnCondition5371);
                    key=cident();

                    state._fsp--;

                    match(input,148,FOLLOW_148_in_columnCondition5373); 
                    pushFollow(FOLLOW_term_in_columnCondition5377);
                    t=term();

                    state._fsp--;

                     conditions.add(Pair.create(key, ColumnCondition.Raw.simpleEqual(t))); 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:886:7: key= cident '[' element= term ']' '=' t= term
                    {
                    pushFollow(FOLLOW_cident_in_columnCondition5389);
                    key=cident();

                    state._fsp--;

                    match(input,141,FOLLOW_141_in_columnCondition5391); 
                    pushFollow(FOLLOW_term_in_columnCondition5395);
                    element=term();

                    state._fsp--;

                    match(input,142,FOLLOW_142_in_columnCondition5397); 
                    match(input,148,FOLLOW_148_in_columnCondition5399); 
                    pushFollow(FOLLOW_term_in_columnCondition5403);
                    t=term();

                    state._fsp--;

                     conditions.add(Pair.create(key, ColumnCondition.Raw.collectionEqual(t, element))); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "columnCondition"


    // $ANTLR start "properties"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:889:1: properties[PropertyDefinitions props] : property[props] ( K_AND property[props] )* ;
    public final void properties(PropertyDefinitions props) throws RecognitionException {
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:890:5: ( property[props] ( K_AND property[props] )* )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:890:7: property[props] ( K_AND property[props] )*
            {
            pushFollow(FOLLOW_property_in_properties5424);
            property(props);

            state._fsp--;

            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:890:23: ( K_AND property[props] )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==K_AND) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:890:24: K_AND property[props]
            	    {
            	    match(input,K_AND,FOLLOW_K_AND_in_properties5428); 
            	    pushFollow(FOLLOW_property_in_properties5430);
            	    property(props);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop105;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "properties"


    // $ANTLR start "property"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:893:1: property[PropertyDefinitions props] : (k= ident '=' simple= propertyValue | k= ident '=' map= map_literal );
    public final void property(PropertyDefinitions props) throws RecognitionException {
        ColumnIdentifier k = null;

        String simple = null;

        Maps.Literal map = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:894:5: (k= ident '=' simple= propertyValue | k= ident '=' map= map_literal )
            int alt106=2;
            alt106 = dfa106.predict(input);
            switch (alt106) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:894:7: k= ident '=' simple= propertyValue
                    {
                    pushFollow(FOLLOW_ident_in_property5453);
                    k=ident();

                    state._fsp--;

                    match(input,148,FOLLOW_148_in_property5455); 
                    pushFollow(FOLLOW_propertyValue_in_property5459);
                    simple=propertyValue();

                    state._fsp--;

                     try { props.addProperty(k.toString(), simple); } catch (SyntaxException e) { addRecognitionError(e.getMessage()); } 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:895:7: k= ident '=' map= map_literal
                    {
                    pushFollow(FOLLOW_ident_in_property5471);
                    k=ident();

                    state._fsp--;

                    match(input,148,FOLLOW_148_in_property5473); 
                    pushFollow(FOLLOW_map_literal_in_property5477);
                    map=map_literal();

                    state._fsp--;

                     try { props.addProperty(k.toString(), convertPropertyMap(map)); } catch (SyntaxException e) { addRecognitionError(e.getMessage()); } 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "property"


    // $ANTLR start "propertyValue"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:898:1: propertyValue returns [String str] : (c= constant | u= unreserved_keyword );
    public final String propertyValue() throws RecognitionException {
        String str = null;

        Constants.Literal c = null;

        String u = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:899:5: (c= constant | u= unreserved_keyword )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==INTEGER||LA107_0==STRING_LITERAL||(LA107_0>=FLOAT && LA107_0<=K_INFINITY)||LA107_0==144) ) {
                alt107=1;
            }
            else if ( ((LA107_0>=K_DISTINCT && LA107_0<=K_AS)||(LA107_0>=K_FILTERING && LA107_0<=K_TTL)||LA107_0==K_VALUES||LA107_0==K_EXISTS||LA107_0==K_TIMESTAMP||LA107_0==K_COUNTER||LA107_0==K_STATIC||(LA107_0>=K_KEY && LA107_0<=K_CUSTOM)||LA107_0==K_TRIGGER||LA107_0==K_TYPE||LA107_0==K_LIST||(LA107_0>=K_ALL && LA107_0<=K_PASSWORD)||(LA107_0>=K_ASCII && LA107_0<=K_MAP)) ) {
                alt107=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:899:7: c= constant
                    {
                    pushFollow(FOLLOW_constant_in_propertyValue5502);
                    c=constant();

                    state._fsp--;

                     str = c.getRawText(); 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:900:7: u= unreserved_keyword
                    {
                    pushFollow(FOLLOW_unreserved_keyword_in_propertyValue5524);
                    u=unreserved_keyword();

                    state._fsp--;

                     str = u; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "propertyValue"


    // $ANTLR start "relationType"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:903:1: relationType returns [Relation.Type op] : ( '=' | '<' | '<=' | '>' | '>=' );
    public final Relation.Type relationType() throws RecognitionException {
        Relation.Type op = null;

        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:904:5: ( '=' | '<' | '<=' | '>' | '>=' )
            int alt108=5;
            switch ( input.LA(1) ) {
            case 148:
                {
                alt108=1;
                }
                break;
            case 150:
                {
                alt108=2;
                }
                break;
            case 151:
                {
                alt108=3;
                }
                break;
            case 152:
                {
                alt108=4;
                }
                break;
            case 153:
                {
                alt108=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }

            switch (alt108) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:904:7: '='
                    {
                    match(input,148,FOLLOW_148_in_relationType5547); 
                     op = Relation.Type.EQ; 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:905:7: '<'
                    {
                    match(input,150,FOLLOW_150_in_relationType5558); 
                     op = Relation.Type.LT; 

                    }
                    break;
                case 3 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:906:7: '<='
                    {
                    match(input,151,FOLLOW_151_in_relationType5569); 
                     op = Relation.Type.LTE; 

                    }
                    break;
                case 4 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:907:7: '>'
                    {
                    match(input,152,FOLLOW_152_in_relationType5579); 
                     op = Relation.Type.GT; 

                    }
                    break;
                case 5 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:908:7: '>='
                    {
                    match(input,153,FOLLOW_153_in_relationType5590); 
                     op = Relation.Type.GTE; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return op;
    }
    // $ANTLR end "relationType"


    // $ANTLR start "relation"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:911:1: relation[List<Relation> clauses] : (name= cident type= relationType t= term | K_TOKEN l= tupleOfIdentifiers type= relationType t= term | name= cident K_IN marker= inMarker | name= cident K_IN inValues= singleColumnInValues | ids= tupleOfIdentifiers ( K_IN ( '(' ')' | tupleInMarker= inMarkerForTuple | literals= tupleOfTupleLiterals | markers= tupleOfMarkersForTuples ) | type= relationType literal= tupleLiteral | type= relationType tupleMarker= markerForTuple ) | '(' relation[$clauses] ')' );
    public final void relation(List<Relation> clauses) throws RecognitionException {
        ColumnIdentifier.Raw name = null;

        Relation.Type type = null;

        Term.Raw t = null;

        List<ColumnIdentifier.Raw> l = null;

        AbstractMarker.INRaw marker = null;

        List<Term.Raw> inValues = null;

        List<ColumnIdentifier.Raw> ids = null;

        Tuples.INRaw tupleInMarker = null;

        List<Tuples.Literal> literals = null;

        List<Tuples.Raw> markers = null;

        Tuples.Literal literal = null;

        Tuples.Raw tupleMarker = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:912:5: (name= cident type= relationType t= term | K_TOKEN l= tupleOfIdentifiers type= relationType t= term | name= cident K_IN marker= inMarker | name= cident K_IN inValues= singleColumnInValues | ids= tupleOfIdentifiers ( K_IN ( '(' ')' | tupleInMarker= inMarkerForTuple | literals= tupleOfTupleLiterals | markers= tupleOfMarkersForTuples ) | type= relationType literal= tupleLiteral | type= relationType tupleMarker= markerForTuple ) | '(' relation[$clauses] ')' )
            int alt111=6;
            alt111 = dfa111.predict(input);
            switch (alt111) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:912:7: name= cident type= relationType t= term
                    {
                    pushFollow(FOLLOW_cident_in_relation5612);
                    name=cident();

                    state._fsp--;

                    pushFollow(FOLLOW_relationType_in_relation5616);
                    type=relationType();

                    state._fsp--;

                    pushFollow(FOLLOW_term_in_relation5620);
                    t=term();

                    state._fsp--;

                     clauses.add(new SingleColumnRelation(name, type, t)); 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:913:7: K_TOKEN l= tupleOfIdentifiers type= relationType t= term
                    {
                    match(input,K_TOKEN,FOLLOW_K_TOKEN_in_relation5630); 
                    pushFollow(FOLLOW_tupleOfIdentifiers_in_relation5634);
                    l=tupleOfIdentifiers();

                    state._fsp--;

                    pushFollow(FOLLOW_relationType_in_relation5638);
                    type=relationType();

                    state._fsp--;

                    pushFollow(FOLLOW_term_in_relation5642);
                    t=term();

                    state._fsp--;


                                for (ColumnIdentifier.Raw id : l)
                                    clauses.add(new SingleColumnRelation(id, type, t, true));
                            

                    }
                    break;
                case 3 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:918:7: name= cident K_IN marker= inMarker
                    {
                    pushFollow(FOLLOW_cident_in_relation5662);
                    name=cident();

                    state._fsp--;

                    match(input,K_IN,FOLLOW_K_IN_in_relation5664); 
                    pushFollow(FOLLOW_inMarker_in_relation5668);
                    marker=inMarker();

                    state._fsp--;

                     clauses.add(new SingleColumnRelation(name, Relation.Type.IN, marker)); 

                    }
                    break;
                case 4 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:920:7: name= cident K_IN inValues= singleColumnInValues
                    {
                    pushFollow(FOLLOW_cident_in_relation5688);
                    name=cident();

                    state._fsp--;

                    match(input,K_IN,FOLLOW_K_IN_in_relation5690); 
                    pushFollow(FOLLOW_singleColumnInValues_in_relation5694);
                    inValues=singleColumnInValues();

                    state._fsp--;

                     clauses.add(SingleColumnRelation.createInRelation(name, inValues)); 

                    }
                    break;
                case 5 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:922:7: ids= tupleOfIdentifiers ( K_IN ( '(' ')' | tupleInMarker= inMarkerForTuple | literals= tupleOfTupleLiterals | markers= tupleOfMarkersForTuples ) | type= relationType literal= tupleLiteral | type= relationType tupleMarker= markerForTuple )
                    {
                    pushFollow(FOLLOW_tupleOfIdentifiers_in_relation5714);
                    ids=tupleOfIdentifiers();

                    state._fsp--;

                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:923:7: ( K_IN ( '(' ')' | tupleInMarker= inMarkerForTuple | literals= tupleOfTupleLiterals | markers= tupleOfMarkersForTuples ) | type= relationType literal= tupleLiteral | type= relationType tupleMarker= markerForTuple )
                    int alt110=3;
                    switch ( input.LA(1) ) {
                    case K_IN:
                        {
                        alt110=1;
                        }
                        break;
                    case 148:
                        {
                        int LA110_2 = input.LA(2);

                        if ( (LA110_2==137) ) {
                            alt110=2;
                        }
                        else if ( (LA110_2==QMARK||LA110_2==146) ) {
                            alt110=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 110, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 150:
                        {
                        int LA110_3 = input.LA(2);

                        if ( (LA110_3==QMARK||LA110_3==146) ) {
                            alt110=3;
                        }
                        else if ( (LA110_3==137) ) {
                            alt110=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 110, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 151:
                        {
                        int LA110_4 = input.LA(2);

                        if ( (LA110_4==QMARK||LA110_4==146) ) {
                            alt110=3;
                        }
                        else if ( (LA110_4==137) ) {
                            alt110=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 110, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 152:
                        {
                        int LA110_5 = input.LA(2);

                        if ( (LA110_5==137) ) {
                            alt110=2;
                        }
                        else if ( (LA110_5==QMARK||LA110_5==146) ) {
                            alt110=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 110, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 153:
                        {
                        int LA110_6 = input.LA(2);

                        if ( (LA110_6==137) ) {
                            alt110=2;
                        }
                        else if ( (LA110_6==QMARK||LA110_6==146) ) {
                            alt110=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 110, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 110, 0, input);

                        throw nvae;
                    }

                    switch (alt110) {
                        case 1 :
                            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:923:9: K_IN ( '(' ')' | tupleInMarker= inMarkerForTuple | literals= tupleOfTupleLiterals | markers= tupleOfMarkersForTuples )
                            {
                            match(input,K_IN,FOLLOW_K_IN_in_relation5724); 
                            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:924:11: ( '(' ')' | tupleInMarker= inMarkerForTuple | literals= tupleOfTupleLiterals | markers= tupleOfMarkersForTuples )
                            int alt109=4;
                            int LA109_0 = input.LA(1);

                            if ( (LA109_0==137) ) {
                                switch ( input.LA(2) ) {
                                case 138:
                                    {
                                    alt109=1;
                                    }
                                    break;
                                case 137:
                                    {
                                    alt109=3;
                                    }
                                    break;
                                case QMARK:
                                case 146:
                                    {
                                    alt109=4;
                                    }
                                    break;
                                default:
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 109, 1, input);

                                    throw nvae;
                                }

                            }
                            else if ( (LA109_0==QMARK||LA109_0==146) ) {
                                alt109=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 109, 0, input);

                                throw nvae;
                            }
                            switch (alt109) {
                                case 1 :
                                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:924:13: '(' ')'
                                    {
                                    match(input,137,FOLLOW_137_in_relation5738); 
                                    match(input,138,FOLLOW_138_in_relation5740); 
                                     clauses.add(MultiColumnRelation.createInRelation(ids, new ArrayList<Tuples.Literal>())); 

                                    }
                                    break;
                                case 2 :
                                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:926:13: tupleInMarker= inMarkerForTuple
                                    {
                                    pushFollow(FOLLOW_inMarkerForTuple_in_relation5772);
                                    tupleInMarker=inMarkerForTuple();

                                    state._fsp--;

                                     clauses.add(MultiColumnRelation.createSingleMarkerInRelation(ids, tupleInMarker)); 

                                    }
                                    break;
                                case 3 :
                                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:928:13: literals= tupleOfTupleLiterals
                                    {
                                    pushFollow(FOLLOW_tupleOfTupleLiterals_in_relation5806);
                                    literals=tupleOfTupleLiterals();

                                    state._fsp--;


                                                      clauses.add(MultiColumnRelation.createInRelation(ids, literals));
                                                  

                                    }
                                    break;
                                case 4 :
                                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:932:13: markers= tupleOfMarkersForTuples
                                    {
                                    pushFollow(FOLLOW_tupleOfMarkersForTuples_in_relation5840);
                                    markers=tupleOfMarkersForTuples();

                                    state._fsp--;

                                     clauses.add(MultiColumnRelation.createInRelation(ids, markers)); 

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:935:9: type= relationType literal= tupleLiteral
                            {
                            pushFollow(FOLLOW_relationType_in_relation5882);
                            type=relationType();

                            state._fsp--;

                            pushFollow(FOLLOW_tupleLiteral_in_relation5886);
                            literal=tupleLiteral();

                            state._fsp--;


                                          clauses.add(MultiColumnRelation.createNonInRelation(ids, type, literal));
                                      

                            }
                            break;
                        case 3 :
                            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:939:9: type= relationType tupleMarker= markerForTuple
                            {
                            pushFollow(FOLLOW_relationType_in_relation5912);
                            type=relationType();

                            state._fsp--;

                            pushFollow(FOLLOW_markerForTuple_in_relation5916);
                            tupleMarker=markerForTuple();

                            state._fsp--;

                             clauses.add(MultiColumnRelation.createNonInRelation(ids, type, tupleMarker)); 

                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:942:7: '(' relation[$clauses] ')'
                    {
                    match(input,137,FOLLOW_137_in_relation5946); 
                    pushFollow(FOLLOW_relation_in_relation5948);
                    relation(clauses);

                    state._fsp--;

                    match(input,138,FOLLOW_138_in_relation5951); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "relation"


    // $ANTLR start "inMarker"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:945:1: inMarker returns [AbstractMarker.INRaw marker] : ( QMARK | ':' name= ident );
    public final AbstractMarker.INRaw inMarker() throws RecognitionException {
        AbstractMarker.INRaw marker = null;

        ColumnIdentifier name = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:946:5: ( QMARK | ':' name= ident )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==QMARK) ) {
                alt112=1;
            }
            else if ( (LA112_0==146) ) {
                alt112=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:946:7: QMARK
                    {
                    match(input,QMARK,FOLLOW_QMARK_in_inMarker5972); 
                     marker = newINBindVariables(null); 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:947:7: ':' name= ident
                    {
                    match(input,146,FOLLOW_146_in_inMarker5982); 
                    pushFollow(FOLLOW_ident_in_inMarker5986);
                    name=ident();

                    state._fsp--;

                     marker = newINBindVariables(name); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return marker;
    }
    // $ANTLR end "inMarker"


    // $ANTLR start "tupleOfIdentifiers"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:950:1: tupleOfIdentifiers returns [List<ColumnIdentifier.Raw> ids] : '(' n1= cident ( ',' ni= cident )* ')' ;
    public final List<ColumnIdentifier.Raw> tupleOfIdentifiers() throws RecognitionException {
        List<ColumnIdentifier.Raw> ids = null;

        ColumnIdentifier.Raw n1 = null;

        ColumnIdentifier.Raw ni = null;


         ids = new ArrayList<ColumnIdentifier.Raw>(); 
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:952:5: ( '(' n1= cident ( ',' ni= cident )* ')' )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:952:7: '(' n1= cident ( ',' ni= cident )* ')'
            {
            match(input,137,FOLLOW_137_in_tupleOfIdentifiers6018); 
            pushFollow(FOLLOW_cident_in_tupleOfIdentifiers6022);
            n1=cident();

            state._fsp--;

             ids.add(n1); 
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:952:39: ( ',' ni= cident )*
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==139) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:952:40: ',' ni= cident
            	    {
            	    match(input,139,FOLLOW_139_in_tupleOfIdentifiers6027); 
            	    pushFollow(FOLLOW_cident_in_tupleOfIdentifiers6031);
            	    ni=cident();

            	    state._fsp--;

            	     ids.add(ni); 

            	    }
            	    break;

            	default :
            	    break loop113;
                }
            } while (true);

            match(input,138,FOLLOW_138_in_tupleOfIdentifiers6037); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ids;
    }
    // $ANTLR end "tupleOfIdentifiers"


    // $ANTLR start "singleColumnInValues"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:955:1: singleColumnInValues returns [List<Term.Raw> terms] : '(' (t1= term ( ',' ti= term )* )? ')' ;
    public final List<Term.Raw> singleColumnInValues() throws RecognitionException {
        List<Term.Raw> terms = null;

        Term.Raw t1 = null;

        Term.Raw ti = null;


         terms = new ArrayList<Term.Raw>(); 
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:957:5: ( '(' (t1= term ( ',' ti= term )* )? ')' )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:957:7: '(' (t1= term ( ',' ti= term )* )? ')'
            {
            match(input,137,FOLLOW_137_in_singleColumnInValues6067); 
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:957:11: (t1= term ( ',' ti= term )* )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==K_DISTINCT||LA115_0==K_AS||LA115_0==K_FILTERING||LA115_0==INTEGER||LA115_0==K_VALUES||LA115_0==K_EXISTS||LA115_0==K_TIMESTAMP||LA115_0==K_COUNTER||LA115_0==K_STATIC||(LA115_0>=K_KEY && LA115_0<=K_CUSTOM)||LA115_0==IDENT||(LA115_0>=STRING_LITERAL && LA115_0<=K_TRIGGER)||LA115_0==K_TYPE||LA115_0==K_LIST||(LA115_0>=K_ALL && LA115_0<=K_PASSWORD)||(LA115_0>=QMARK && LA115_0<=K_TOKEN)||(LA115_0>=K_ASCII && LA115_0<=K_MAP)||LA115_0==137||LA115_0==141||(LA115_0>=144 && LA115_0<=146)) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:957:13: t1= term ( ',' ti= term )*
                    {
                    pushFollow(FOLLOW_term_in_singleColumnInValues6075);
                    t1=term();

                    state._fsp--;

                     terms.add(t1); 
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:957:43: ( ',' ti= term )*
                    loop114:
                    do {
                        int alt114=2;
                        int LA114_0 = input.LA(1);

                        if ( (LA114_0==139) ) {
                            alt114=1;
                        }


                        switch (alt114) {
                    	case 1 :
                    	    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:957:44: ',' ti= term
                    	    {
                    	    match(input,139,FOLLOW_139_in_singleColumnInValues6080); 
                    	    pushFollow(FOLLOW_term_in_singleColumnInValues6084);
                    	    ti=term();

                    	    state._fsp--;

                    	     terms.add(ti); 

                    	    }
                    	    break;

                    	default :
                    	    break loop114;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,138,FOLLOW_138_in_singleColumnInValues6093); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return terms;
    }
    // $ANTLR end "singleColumnInValues"


    // $ANTLR start "tupleLiteral"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:960:1: tupleLiteral returns [Tuples.Literal literal] : '(' t1= term ( ',' ti= term )* ')' ;
    public final Tuples.Literal tupleLiteral() throws RecognitionException {
        Tuples.Literal literal = null;

        Term.Raw t1 = null;

        Term.Raw ti = null;


         List<Term.Raw> terms = new ArrayList<>(); 
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:962:5: ( '(' t1= term ( ',' ti= term )* ')' )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:962:7: '(' t1= term ( ',' ti= term )* ')'
            {
            match(input,137,FOLLOW_137_in_tupleLiteral6123); 
            pushFollow(FOLLOW_term_in_tupleLiteral6127);
            t1=term();

            state._fsp--;

             terms.add(t1); 
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:962:38: ( ',' ti= term )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==139) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:962:39: ',' ti= term
            	    {
            	    match(input,139,FOLLOW_139_in_tupleLiteral6132); 
            	    pushFollow(FOLLOW_term_in_tupleLiteral6136);
            	    ti=term();

            	    state._fsp--;

            	     terms.add(ti); 

            	    }
            	    break;

            	default :
            	    break loop116;
                }
            } while (true);

            match(input,138,FOLLOW_138_in_tupleLiteral6142); 
             literal = new Tuples.Literal(terms); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return literal;
    }
    // $ANTLR end "tupleLiteral"


    // $ANTLR start "tupleOfTupleLiterals"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:965:1: tupleOfTupleLiterals returns [List<Tuples.Literal> literals] : '(' t1= tupleLiteral ( ',' ti= tupleLiteral )* ')' ;
    public final List<Tuples.Literal> tupleOfTupleLiterals() throws RecognitionException {
        List<Tuples.Literal> literals = null;

        Tuples.Literal t1 = null;

        Tuples.Literal ti = null;


         literals = new ArrayList<>(); 
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:967:5: ( '(' t1= tupleLiteral ( ',' ti= tupleLiteral )* ')' )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:967:7: '(' t1= tupleLiteral ( ',' ti= tupleLiteral )* ')'
            {
            match(input,137,FOLLOW_137_in_tupleOfTupleLiterals6174); 
            pushFollow(FOLLOW_tupleLiteral_in_tupleOfTupleLiterals6178);
            t1=tupleLiteral();

            state._fsp--;

             literals.add(t1); 
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:967:50: ( ',' ti= tupleLiteral )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==139) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:967:51: ',' ti= tupleLiteral
            	    {
            	    match(input,139,FOLLOW_139_in_tupleOfTupleLiterals6183); 
            	    pushFollow(FOLLOW_tupleLiteral_in_tupleOfTupleLiterals6187);
            	    ti=tupleLiteral();

            	    state._fsp--;

            	     literals.add(ti); 

            	    }
            	    break;

            	default :
            	    break loop117;
                }
            } while (true);

            match(input,138,FOLLOW_138_in_tupleOfTupleLiterals6193); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return literals;
    }
    // $ANTLR end "tupleOfTupleLiterals"


    // $ANTLR start "markerForTuple"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:970:1: markerForTuple returns [Tuples.Raw marker] : ( QMARK | ':' name= ident );
    public final Tuples.Raw markerForTuple() throws RecognitionException {
        Tuples.Raw marker = null;

        ColumnIdentifier name = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:971:5: ( QMARK | ':' name= ident )
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==QMARK) ) {
                alt118=1;
            }
            else if ( (LA118_0==146) ) {
                alt118=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }
            switch (alt118) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:971:7: QMARK
                    {
                    match(input,QMARK,FOLLOW_QMARK_in_markerForTuple6214); 
                     marker = newTupleBindVariables(null); 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:972:7: ':' name= ident
                    {
                    match(input,146,FOLLOW_146_in_markerForTuple6224); 
                    pushFollow(FOLLOW_ident_in_markerForTuple6228);
                    name=ident();

                    state._fsp--;

                     marker = newTupleBindVariables(name); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return marker;
    }
    // $ANTLR end "markerForTuple"


    // $ANTLR start "tupleOfMarkersForTuples"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:975:1: tupleOfMarkersForTuples returns [List<Tuples.Raw> markers] : '(' m1= markerForTuple ( ',' mi= markerForTuple )* ')' ;
    public final List<Tuples.Raw> tupleOfMarkersForTuples() throws RecognitionException {
        List<Tuples.Raw> markers = null;

        Tuples.Raw m1 = null;

        Tuples.Raw mi = null;


         markers = new ArrayList<Tuples.Raw>(); 
        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:977:5: ( '(' m1= markerForTuple ( ',' mi= markerForTuple )* ')' )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:977:7: '(' m1= markerForTuple ( ',' mi= markerForTuple )* ')'
            {
            match(input,137,FOLLOW_137_in_tupleOfMarkersForTuples6260); 
            pushFollow(FOLLOW_markerForTuple_in_tupleOfMarkersForTuples6264);
            m1=markerForTuple();

            state._fsp--;

             markers.add(m1); 
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:977:51: ( ',' mi= markerForTuple )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==139) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:977:52: ',' mi= markerForTuple
            	    {
            	    match(input,139,FOLLOW_139_in_tupleOfMarkersForTuples6269); 
            	    pushFollow(FOLLOW_markerForTuple_in_tupleOfMarkersForTuples6273);
            	    mi=markerForTuple();

            	    state._fsp--;

            	     markers.add(mi); 

            	    }
            	    break;

            	default :
            	    break loop119;
                }
            } while (true);

            match(input,138,FOLLOW_138_in_tupleOfMarkersForTuples6279); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return markers;
    }
    // $ANTLR end "tupleOfMarkersForTuples"


    // $ANTLR start "inMarkerForTuple"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:980:1: inMarkerForTuple returns [Tuples.INRaw marker] : ( QMARK | ':' name= ident );
    public final Tuples.INRaw inMarkerForTuple() throws RecognitionException {
        Tuples.INRaw marker = null;

        ColumnIdentifier name = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:981:5: ( QMARK | ':' name= ident )
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==QMARK) ) {
                alt120=1;
            }
            else if ( (LA120_0==146) ) {
                alt120=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }
            switch (alt120) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:981:7: QMARK
                    {
                    match(input,QMARK,FOLLOW_QMARK_in_inMarkerForTuple6300); 
                     marker = newTupleINBindVariables(null); 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:982:7: ':' name= ident
                    {
                    match(input,146,FOLLOW_146_in_inMarkerForTuple6310); 
                    pushFollow(FOLLOW_ident_in_inMarkerForTuple6314);
                    name=ident();

                    state._fsp--;

                     marker = newTupleINBindVariables(name); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return marker;
    }
    // $ANTLR end "inMarkerForTuple"


    // $ANTLR start "comparatorType"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:985:1: comparatorType returns [CQL3Type t] : (c= native_type | c= collection_type | s= STRING_LITERAL );
    public final CQL3Type comparatorType() throws RecognitionException {
        CQL3Type t = null;

        Token s=null;
        CQL3Type c = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:986:5: (c= native_type | c= collection_type | s= STRING_LITERAL )
            int alt121=3;
            switch ( input.LA(1) ) {
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
                {
                alt121=1;
                }
                break;
            case K_SET:
            case K_LIST:
            case K_MAP:
                {
                alt121=2;
                }
                break;
            case STRING_LITERAL:
                {
                alt121=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;
            }

            switch (alt121) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:986:7: c= native_type
                    {
                    pushFollow(FOLLOW_native_type_in_comparatorType6339);
                    c=native_type();

                    state._fsp--;

                     t = c; 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:987:7: c= collection_type
                    {
                    pushFollow(FOLLOW_collection_type_in_comparatorType6355);
                    c=collection_type();

                    state._fsp--;

                     t = c; 

                    }
                    break;
                case 3 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:988:7: s= STRING_LITERAL
                    {
                    s=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_comparatorType6367); 

                            try {
                                t = new CQL3Type.Custom((s!=null?s.getText():null));
                            } catch (SyntaxException e) {
                                addRecognitionError("Cannot parse type " + (s!=null?s.getText():null) + ": " + e.getMessage());
                            } catch (ConfigurationException e) {
                                addRecognitionError("Error setting type " + (s!=null?s.getText():null) + ": " + e.getMessage());
                            }
                          

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return t;
    }
    // $ANTLR end "comparatorType"


    // $ANTLR start "native_type"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1000:1: native_type returns [CQL3Type t] : ( K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INET | K_INT | K_TEXT | K_TIMESTAMP | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID );
    public final CQL3Type native_type() throws RecognitionException {
        CQL3Type t = null;

        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1001:5: ( K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INET | K_INT | K_TEXT | K_TIMESTAMP | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID )
            int alt122=16;
            switch ( input.LA(1) ) {
            case K_ASCII:
                {
                alt122=1;
                }
                break;
            case K_BIGINT:
                {
                alt122=2;
                }
                break;
            case K_BLOB:
                {
                alt122=3;
                }
                break;
            case K_BOOLEAN:
                {
                alt122=4;
                }
                break;
            case K_COUNTER:
                {
                alt122=5;
                }
                break;
            case K_DECIMAL:
                {
                alt122=6;
                }
                break;
            case K_DOUBLE:
                {
                alt122=7;
                }
                break;
            case K_FLOAT:
                {
                alt122=8;
                }
                break;
            case K_INET:
                {
                alt122=9;
                }
                break;
            case K_INT:
                {
                alt122=10;
                }
                break;
            case K_TEXT:
                {
                alt122=11;
                }
                break;
            case K_TIMESTAMP:
                {
                alt122=12;
                }
                break;
            case K_UUID:
                {
                alt122=13;
                }
                break;
            case K_VARCHAR:
                {
                alt122=14;
                }
                break;
            case K_VARINT:
                {
                alt122=15;
                }
                break;
            case K_TIMEUUID:
                {
                alt122=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }

            switch (alt122) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1001:7: K_ASCII
                    {
                    match(input,K_ASCII,FOLLOW_K_ASCII_in_native_type6396); 
                     t = CQL3Type.Native.ASCII; 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1002:7: K_BIGINT
                    {
                    match(input,K_BIGINT,FOLLOW_K_BIGINT_in_native_type6410); 
                     t = CQL3Type.Native.BIGINT; 

                    }
                    break;
                case 3 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1003:7: K_BLOB
                    {
                    match(input,K_BLOB,FOLLOW_K_BLOB_in_native_type6423); 
                     t = CQL3Type.Native.BLOB; 

                    }
                    break;
                case 4 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1004:7: K_BOOLEAN
                    {
                    match(input,K_BOOLEAN,FOLLOW_K_BOOLEAN_in_native_type6438); 
                     t = CQL3Type.Native.BOOLEAN; 

                    }
                    break;
                case 5 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1005:7: K_COUNTER
                    {
                    match(input,K_COUNTER,FOLLOW_K_COUNTER_in_native_type6450); 
                     t = CQL3Type.Native.COUNTER; 

                    }
                    break;
                case 6 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1006:7: K_DECIMAL
                    {
                    match(input,K_DECIMAL,FOLLOW_K_DECIMAL_in_native_type6462); 
                     t = CQL3Type.Native.DECIMAL; 

                    }
                    break;
                case 7 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1007:7: K_DOUBLE
                    {
                    match(input,K_DOUBLE,FOLLOW_K_DOUBLE_in_native_type6474); 
                     t = CQL3Type.Native.DOUBLE; 

                    }
                    break;
                case 8 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1008:7: K_FLOAT
                    {
                    match(input,K_FLOAT,FOLLOW_K_FLOAT_in_native_type6487); 
                     t = CQL3Type.Native.FLOAT; 

                    }
                    break;
                case 9 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1009:7: K_INET
                    {
                    match(input,K_INET,FOLLOW_K_INET_in_native_type6501); 
                     t = CQL3Type.Native.INET;

                    }
                    break;
                case 10 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1010:7: K_INT
                    {
                    match(input,K_INT,FOLLOW_K_INT_in_native_type6516); 
                     t = CQL3Type.Native.INT; 

                    }
                    break;
                case 11 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1011:7: K_TEXT
                    {
                    match(input,K_TEXT,FOLLOW_K_TEXT_in_native_type6532); 
                     t = CQL3Type.Native.TEXT; 

                    }
                    break;
                case 12 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1012:7: K_TIMESTAMP
                    {
                    match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_native_type6547); 
                     t = CQL3Type.Native.TIMESTAMP; 

                    }
                    break;
                case 13 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1013:7: K_UUID
                    {
                    match(input,K_UUID,FOLLOW_K_UUID_in_native_type6557); 
                     t = CQL3Type.Native.UUID; 

                    }
                    break;
                case 14 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1014:7: K_VARCHAR
                    {
                    match(input,K_VARCHAR,FOLLOW_K_VARCHAR_in_native_type6572); 
                     t = CQL3Type.Native.VARCHAR; 

                    }
                    break;
                case 15 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1015:7: K_VARINT
                    {
                    match(input,K_VARINT,FOLLOW_K_VARINT_in_native_type6584); 
                     t = CQL3Type.Native.VARINT; 

                    }
                    break;
                case 16 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1016:7: K_TIMEUUID
                    {
                    match(input,K_TIMEUUID,FOLLOW_K_TIMEUUID_in_native_type6597); 
                     t = CQL3Type.Native.TIMEUUID; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return t;
    }
    // $ANTLR end "native_type"


    // $ANTLR start "collection_type"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1019:1: collection_type returns [CQL3Type pt] : ( K_MAP '<' t1= comparatorType ',' t2= comparatorType '>' | K_LIST '<' t= comparatorType '>' | K_SET '<' t= comparatorType '>' );
    public final CQL3Type collection_type() throws RecognitionException {
        CQL3Type pt = null;

        CQL3Type t1 = null;

        CQL3Type t2 = null;

        CQL3Type t = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1020:5: ( K_MAP '<' t1= comparatorType ',' t2= comparatorType '>' | K_LIST '<' t= comparatorType '>' | K_SET '<' t= comparatorType '>' )
            int alt123=3;
            switch ( input.LA(1) ) {
            case K_MAP:
                {
                alt123=1;
                }
                break;
            case K_LIST:
                {
                alt123=2;
                }
                break;
            case K_SET:
                {
                alt123=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }

            switch (alt123) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1020:7: K_MAP '<' t1= comparatorType ',' t2= comparatorType '>'
                    {
                    match(input,K_MAP,FOLLOW_K_MAP_in_collection_type6621); 
                    match(input,150,FOLLOW_150_in_collection_type6624); 
                    pushFollow(FOLLOW_comparatorType_in_collection_type6628);
                    t1=comparatorType();

                    state._fsp--;

                    match(input,139,FOLLOW_139_in_collection_type6630); 
                    pushFollow(FOLLOW_comparatorType_in_collection_type6634);
                    t2=comparatorType();

                    state._fsp--;

                    match(input,152,FOLLOW_152_in_collection_type6636); 
                     try {
                                // if we can't parse either t1 or t2, antlr will "recover" and we may have t1 or t2 null.
                                if (t1 != null && t2 != null)
                                    pt = CQL3Type.Collection.map(t1, t2);
                              } catch (InvalidRequestException e) { addRecognitionError(e.getMessage()); } 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1026:7: K_LIST '<' t= comparatorType '>'
                    {
                    match(input,K_LIST,FOLLOW_K_LIST_in_collection_type6654); 
                    match(input,150,FOLLOW_150_in_collection_type6656); 
                    pushFollow(FOLLOW_comparatorType_in_collection_type6660);
                    t=comparatorType();

                    state._fsp--;

                    match(input,152,FOLLOW_152_in_collection_type6662); 
                     try { if (t != null) pt = CQL3Type.Collection.list(t); } catch (InvalidRequestException e) { addRecognitionError(e.getMessage()); } 

                    }
                    break;
                case 3 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1028:7: K_SET '<' t= comparatorType '>'
                    {
                    match(input,K_SET,FOLLOW_K_SET_in_collection_type6680); 
                    match(input,150,FOLLOW_150_in_collection_type6683); 
                    pushFollow(FOLLOW_comparatorType_in_collection_type6687);
                    t=comparatorType();

                    state._fsp--;

                    match(input,152,FOLLOW_152_in_collection_type6689); 
                     try { if (t != null) pt = CQL3Type.Collection.set(t); } catch (InvalidRequestException e) { addRecognitionError(e.getMessage()); } 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return pt;
    }
    // $ANTLR end "collection_type"

    public static class username_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "username"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1032:1: username : ( IDENT | STRING_LITERAL );
    public final CqlParser.username_return username() throws RecognitionException {
        CqlParser.username_return retval = new CqlParser.username_return();
        retval.start = input.LT(1);

        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1033:5: ( IDENT | STRING_LITERAL )
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:
            {
            if ( input.LA(1)==IDENT||input.LA(1)==STRING_LITERAL ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "username"


    // $ANTLR start "unreserved_keyword"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1037:1: unreserved_keyword returns [String str] : (u= unreserved_function_keyword | k= ( K_TTL | K_COUNT | K_WRITETIME ) );
    public final String unreserved_keyword() throws RecognitionException {
        String str = null;

        Token k=null;
        String u = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1038:5: (u= unreserved_function_keyword | k= ( K_TTL | K_COUNT | K_WRITETIME ) )
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==K_DISTINCT||LA124_0==K_AS||LA124_0==K_FILTERING||LA124_0==K_VALUES||LA124_0==K_EXISTS||LA124_0==K_TIMESTAMP||LA124_0==K_COUNTER||LA124_0==K_STATIC||(LA124_0>=K_KEY && LA124_0<=K_CUSTOM)||LA124_0==K_TRIGGER||LA124_0==K_TYPE||LA124_0==K_LIST||(LA124_0>=K_ALL && LA124_0<=K_PASSWORD)||(LA124_0>=K_ASCII && LA124_0<=K_MAP)) ) {
                alt124=1;
            }
            else if ( (LA124_0==K_COUNT||(LA124_0>=K_WRITETIME && LA124_0<=K_TTL)) ) {
                alt124=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }
            switch (alt124) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1038:7: u= unreserved_function_keyword
                    {
                    pushFollow(FOLLOW_unreserved_function_keyword_in_unreserved_keyword6747);
                    u=unreserved_function_keyword();

                    state._fsp--;

                     str = u; 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1039:7: k= ( K_TTL | K_COUNT | K_WRITETIME )
                    {
                    k=(Token)input.LT(1);
                    if ( input.LA(1)==K_COUNT||(input.LA(1)>=K_WRITETIME && input.LA(1)<=K_TTL) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                     str = (k!=null?k.getText():null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "unreserved_keyword"


    // $ANTLR start "unreserved_function_keyword"
    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1042:1: unreserved_function_keyword returns [String str] : (k= ( K_KEY | K_AS | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD | K_EXISTS | K_CUSTOM | K_TRIGGER | K_DISTINCT | K_STATIC ) | t= native_type );
    public final String unreserved_function_keyword() throws RecognitionException {
        String str = null;

        Token k=null;
        CQL3Type t = null;


        try {
            // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1043:5: (k= ( K_KEY | K_AS | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD | K_EXISTS | K_CUSTOM | K_TRIGGER | K_DISTINCT | K_STATIC ) | t= native_type )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==K_DISTINCT||LA125_0==K_AS||LA125_0==K_FILTERING||LA125_0==K_VALUES||LA125_0==K_EXISTS||LA125_0==K_STATIC||(LA125_0>=K_KEY && LA125_0<=K_CUSTOM)||LA125_0==K_TRIGGER||LA125_0==K_TYPE||LA125_0==K_LIST||(LA125_0>=K_ALL && LA125_0<=K_PASSWORD)||LA125_0==K_MAP) ) {
                alt125=1;
            }
            else if ( (LA125_0==K_TIMESTAMP||LA125_0==K_COUNTER||(LA125_0>=K_ASCII && LA125_0<=K_TIMEUUID)) ) {
                alt125=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }
            switch (alt125) {
                case 1 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1043:7: k= ( K_KEY | K_AS | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD | K_EXISTS | K_CUSTOM | K_TRIGGER | K_DISTINCT | K_STATIC )
                    {
                    k=(Token)input.LT(1);
                    if ( input.LA(1)==K_DISTINCT||input.LA(1)==K_AS||input.LA(1)==K_FILTERING||input.LA(1)==K_VALUES||input.LA(1)==K_EXISTS||input.LA(1)==K_STATIC||(input.LA(1)>=K_KEY && input.LA(1)<=K_CUSTOM)||input.LA(1)==K_TRIGGER||input.LA(1)==K_TYPE||input.LA(1)==K_LIST||(input.LA(1)>=K_ALL && input.LA(1)<=K_PASSWORD)||input.LA(1)==K_MAP ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                     str = (k!=null?k.getText():null); 

                    }
                    break;
                case 2 :
                    // /home/yasu/Summer Stuff/CassandraQoS/CassandraQoS/cassandra/src/java/org/apache/cassandra/cql3/Cql.g:1068:7: t= native_type
                    {
                    pushFollow(FOLLOW_native_type_in_unreserved_function_keyword7098);
                    t=native_type();

                    state._fsp--;

                     str = t.toString(); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "unreserved_function_keyword"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA84 dfa84 = new DFA84(this);
    protected DFA103 dfa103 = new DFA103(this);
    protected DFA104 dfa104 = new DFA104(this);
    protected DFA106 dfa106 = new DFA106(this);
    protected DFA111 dfa111 = new DFA111(this);
    static final String DFA2_eotS =
        "\35\uffff";
    static final String DFA2_eofS =
        "\35\uffff";
    static final String DFA2_minS =
        "\1\4\7\uffff\3\47\2\uffff\1\5\17\uffff";
    static final String DFA2_maxS =
        "\1\77\7\uffff\3\110\2\uffff\1\113\17\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\3\uffff\1\20\1\21\1\uffff\1"+
        "\10\1\11\1\23\1\27\1\12\1\13\1\14\1\15\1\25\1\30\1\16\1\17\1\24"+
        "\1\26\1\22";
    static final String DFA2_specialS =
        "\35\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\6\1\1\20\uffff\1\2\7\uffff\1\3\1\uffff\1\5\1\4\4\uffff\1"+
            "\10\17\uffff\1\11\1\12\4\uffff\1\7\1\13\1\14\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\16\1\uffff\1\17\6\uffff\2\22\3\uffff\1\21\22\uffff\1\20",
            "\1\23\1\uffff\1\24\7\uffff\1\25\3\uffff\1\27\22\uffff\1\26",
            "\1\31\1\uffff\1\30\36\uffff\1\32",
            "",
            "",
            "\1\34\40\uffff\1\34\17\uffff\2\34\12\uffff\3\34\6\uffff\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "206:1: cqlStatement returns [ParsedStatement stmt] : (st1= selectStatement | st2= insertStatement | st3= updateStatement | st4= batchStatement | st5= deleteStatement | st6= useStatement | st7= truncateStatement | st8= createKeyspaceStatement | st9= createTableStatement | st10= createIndexStatement | st11= dropKeyspaceStatement | st12= dropTableStatement | st13= dropIndexStatement | st14= alterTableStatement | st15= alterKeyspaceStatement | st16= grantStatement | st17= revokeStatement | st18= listPermissionsStatement | st19= createUserStatement | st20= alterUserStatement | st21= dropUserStatement | st22= listUsersStatement | st23= createTriggerStatement | st24= dropTriggerStatement );";
        }
    }
    static final String DFA14_eotS =
        "\31\uffff";
    static final String DFA14_eofS =
        "\31\uffff";
    static final String DFA14_minS =
        "\1\6\1\10\1\uffff\23\10\3\uffff";
    static final String DFA14_maxS =
        "\1\146\1\u008b\1\uffff\23\u008b\3\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\1\23\uffff\1\4\1\2\1\3";
    static final String DFA14_specialS =
        "\31\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\3\1\2\1\3\6\uffff\1\3\1\24\1\25\6\uffff\1\3\2\uffff\1\3\1"+
            "\uffff\1\17\5\uffff\1\10\6\uffff\1\3\1\uffff\5\3\1\uffff\1\1"+
            "\2\uffff\1\3\2\uffff\1\3\6\uffff\1\3\4\uffff\11\3\1\2\10\uffff"+
            "\1\26\1\uffff\1\4\1\5\1\6\1\7\1\11\1\12\1\13\1\14\1\15\1\16"+
            "\1\20\1\21\1\22\1\23\1\3",
            "\2\2\177\uffff\1\26\2\2",
            "",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\26\2\2",
            "\2\2\177\uffff\1\27\2\2",
            "\2\2\177\uffff\1\30\2\2",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "283:1: unaliasedSelector returns [Selectable.Raw s] : (c= cident | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | f= functionName args= selectionFunctionArgs );";
        }
    }
    static final String DFA36_eotS =
        "\27\uffff";
    static final String DFA36_eofS =
        "\27\uffff";
    static final String DFA36_minS =
        "\1\6\24\11\2\uffff";
    static final String DFA36_maxS =
        "\1\146\24\u008d\2\uffff";
    static final String DFA36_acceptS =
        "\25\uffff\1\2\1\1";
    static final String DFA36_specialS =
        "\27\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\3\1\24\1\3\6\uffff\1\3\2\24\6\uffff\1\3\2\uffff\1\3\1\uffff"+
            "\1\17\5\uffff\1\10\6\uffff\1\3\1\uffff\5\3\1\uffff\1\1\2\uffff"+
            "\1\3\2\uffff\1\3\6\uffff\1\3\4\uffff\11\3\1\2\12\uffff\1\4\1"+
            "\5\1\6\1\7\1\11\1\12\1\13\1\14\1\15\1\16\1\20\1\21\1\22\1\23"+
            "\1\3",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "\1\26\u0081\uffff\1\26\1\uffff\1\25",
            "",
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "421:1: deleteOp returns [Operation.RawDeletion op] : (c= cident | c= cident '[' t= term ']' );";
        }
    }
    static final String DFA84_eotS =
        "\30\uffff";
    static final String DFA84_eofS =
        "\1\uffff\25\27\2\uffff";
    static final String DFA84_minS =
        "\1\6\25\11\2\uffff";
    static final String DFA84_maxS =
        "\1\146\25\u008f\2\uffff";
    static final String DFA84_acceptS =
        "\26\uffff\1\1\1\2";
    static final String DFA84_specialS =
        "\30\uffff}>";
    static final String[] DFA84_transitionS = {
            "\1\3\1\24\1\3\6\uffff\1\3\2\24\6\uffff\1\3\2\uffff\1\3\1\uffff"+
            "\1\17\5\uffff\1\10\6\uffff\1\3\1\uffff\5\3\1\uffff\1\1\2\uffff"+
            "\1\3\2\uffff\1\3\6\uffff\1\3\4\uffff\11\3\1\2\1\25\11\uffff"+
            "\1\4\1\5\1\6\1\7\1\11\1\12\1\13\1\14\1\15\1\16\1\20\1\21\1\22"+
            "\1\23\1\3",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "\3\27\1\uffff\2\27\15\uffff\1\27\2\uffff\1\27\10\uffff\1\27"+
            "\15\uffff\2\27\1\uffff\3\27\4\uffff\2\27\106\uffff\2\27\5\uffff"+
            "\1\26",
            "",
            ""
    };

    static final short[] DFA84_eot = DFA.unpackEncodedString(DFA84_eotS);
    static final short[] DFA84_eof = DFA.unpackEncodedString(DFA84_eofS);
    static final char[] DFA84_min = DFA.unpackEncodedStringToUnsignedChars(DFA84_minS);
    static final char[] DFA84_max = DFA.unpackEncodedStringToUnsignedChars(DFA84_maxS);
    static final short[] DFA84_accept = DFA.unpackEncodedString(DFA84_acceptS);
    static final short[] DFA84_special = DFA.unpackEncodedString(DFA84_specialS);
    static final short[][] DFA84_transition;

    static {
        int numStates = DFA84_transitionS.length;
        DFA84_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA84_transition[i] = DFA.unpackEncodedString(DFA84_transitionS[i]);
        }
    }

    class DFA84 extends DFA {

        public DFA84(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 84;
            this.eot = DFA84_eot;
            this.eof = DFA84_eof;
            this.min = DFA84_min;
            this.max = DFA84_max;
            this.accept = DFA84_accept;
            this.special = DFA84_special;
            this.transition = DFA84_transition;
        }
        public String getDescription() {
            return "770:7: ( cfOrKsName[name, true] '.' )?";
        }
    }
    static final String DFA103_eotS =
        "\56\uffff";
    static final String DFA103_eofS =
        "\56\uffff";
    static final String DFA103_minS =
        "\1\6\24\u008d\1\6\1\uffff\24\22\3\uffff";
    static final String DFA103_maxS =
        "\1\146\24\u0094\1\u0092\1\uffff\24\u0095\3\uffff";
    static final String DFA103_acceptS =
        "\26\uffff\1\4\24\uffff\1\1\1\3\1\2";
    static final String DFA103_specialS =
        "\56\uffff}>";
    static final String[] DFA103_transitionS = {
            "\1\3\1\24\1\3\6\uffff\1\3\2\24\6\uffff\1\3\2\uffff\1\3\1\uffff"+
            "\1\17\5\uffff\1\10\6\uffff\1\3\1\uffff\5\3\1\uffff\1\1\2\uffff"+
            "\1\3\2\uffff\1\3\6\uffff\1\3\4\uffff\11\3\1\2\12\uffff\1\4\1"+
            "\5\1\6\1\7\1\11\1\12\1\13\1\14\1\15\1\16\1\20\1\21\1\22\1\23"+
            "\1\3",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\31\1\52\1\31\6\uffff\1\31\2\52\1\53\5\uffff\1\31\2\uffff"+
            "\1\31\1\uffff\1\45\5\uffff\1\36\6\uffff\1\31\1\uffff\5\31\1"+
            "\uffff\1\27\1\uffff\1\53\1\31\2\uffff\1\31\6\uffff\1\31\4\uffff"+
            "\11\31\1\30\11\53\1\uffff\1\32\1\33\1\34\1\35\1\37\1\40\1\41"+
            "\1\42\1\43\1\44\1\46\1\47\1\50\1\51\1\31\42\uffff\1\53\3\uffff"+
            "\1\53\2\uffff\3\53",
            "",
            "\1\54\166\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\175\uffff\1\55\4\uffff\1\55",
            "\1\54\166\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\166\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\166\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\166\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\166\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\166\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\166\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\166\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\166\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\166\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\166\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\166\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\166\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\166\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\166\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\166\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\166\uffff\1\53\6\uffff\1\55\4\uffff\1\55",
            "\1\54\175\uffff\1\55\4\uffff\1\55",
            "",
            "",
            ""
    };

    static final short[] DFA103_eot = DFA.unpackEncodedString(DFA103_eotS);
    static final short[] DFA103_eof = DFA.unpackEncodedString(DFA103_eofS);
    static final char[] DFA103_min = DFA.unpackEncodedStringToUnsignedChars(DFA103_minS);
    static final char[] DFA103_max = DFA.unpackEncodedStringToUnsignedChars(DFA103_maxS);
    static final short[] DFA103_accept = DFA.unpackEncodedString(DFA103_acceptS);
    static final short[] DFA103_special = DFA.unpackEncodedString(DFA103_specialS);
    static final short[][] DFA103_transition;

    static {
        int numStates = DFA103_transitionS.length;
        DFA103_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA103_transition[i] = DFA.unpackEncodedString(DFA103_transitionS[i]);
        }
    }

    class DFA103 extends DFA {

        public DFA103(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 103;
            this.eot = DFA103_eot;
            this.eof = DFA103_eof;
            this.min = DFA103_min;
            this.max = DFA103_max;
            this.accept = DFA103_accept;
            this.special = DFA103_special;
            this.transition = DFA103_transition;
        }
        public String getDescription() {
            return "849:1: columnOperation[List<Pair<ColumnIdentifier.Raw, Operation.RawUpdate>> operations] : (key= cident '=' t= term ( '+' c= cident )? | key= cident '=' c= cident sig= ( '+' | '-' ) t= term | key= cident '=' c= cident i= INTEGER | key= cident '[' k= term ']' '=' t= term );";
        }
    }
    static final String DFA104_eotS =
        "\27\uffff";
    static final String DFA104_eofS =
        "\27\uffff";
    static final String DFA104_minS =
        "\1\6\24\u008d\2\uffff";
    static final String DFA104_maxS =
        "\1\146\24\u0094\2\uffff";
    static final String DFA104_acceptS =
        "\25\uffff\1\1\1\2";
    static final String DFA104_specialS =
        "\27\uffff}>";
    static final String[] DFA104_transitionS = {
            "\1\3\1\24\1\3\6\uffff\1\3\2\24\6\uffff\1\3\2\uffff\1\3\1\uffff"+
            "\1\17\5\uffff\1\10\6\uffff\1\3\1\uffff\5\3\1\uffff\1\1\2\uffff"+
            "\1\3\2\uffff\1\3\6\uffff\1\3\4\uffff\11\3\1\2\12\uffff\1\4\1"+
            "\5\1\6\1\7\1\11\1\12\1\13\1\14\1\15\1\16\1\20\1\21\1\22\1\23"+
            "\1\3",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "\1\26\6\uffff\1\25",
            "",
            ""
    };

    static final short[] DFA104_eot = DFA.unpackEncodedString(DFA104_eotS);
    static final short[] DFA104_eof = DFA.unpackEncodedString(DFA104_eofS);
    static final char[] DFA104_min = DFA.unpackEncodedStringToUnsignedChars(DFA104_minS);
    static final char[] DFA104_max = DFA.unpackEncodedStringToUnsignedChars(DFA104_maxS);
    static final short[] DFA104_accept = DFA.unpackEncodedString(DFA104_acceptS);
    static final short[] DFA104_special = DFA.unpackEncodedString(DFA104_specialS);
    static final short[][] DFA104_transition;

    static {
        int numStates = DFA104_transitionS.length;
        DFA104_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA104_transition[i] = DFA.unpackEncodedString(DFA104_transitionS[i]);
        }
    }

    class DFA104 extends DFA {

        public DFA104(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 104;
            this.eot = DFA104_eot;
            this.eof = DFA104_eof;
            this.min = DFA104_min;
            this.max = DFA104_max;
            this.accept = DFA104_accept;
            this.special = DFA104_special;
            this.transition = DFA104_transition;
        }
        public String getDescription() {
            return "883:1: columnCondition[List<Pair<ColumnIdentifier.Raw, ColumnCondition.Raw>> conditions] : (key= cident '=' t= term | key= cident '[' element= term ']' '=' t= term );";
        }
    }
    static final String DFA106_eotS =
        "\30\uffff";
    static final String DFA106_eofS =
        "\30\uffff";
    static final String DFA106_minS =
        "\1\6\24\u0094\1\6\2\uffff";
    static final String DFA106_maxS =
        "\1\146\24\u0094\1\u0091\2\uffff";
    static final String DFA106_acceptS =
        "\26\uffff\1\2\1\1";
    static final String DFA106_specialS =
        "\30\uffff}>";
    static final String[] DFA106_transitionS = {
            "\1\3\1\24\1\3\6\uffff\1\3\2\24\6\uffff\1\3\2\uffff\1\3\1\uffff"+
            "\1\17\5\uffff\1\10\6\uffff\1\3\1\uffff\5\3\1\uffff\1\1\2\uffff"+
            "\1\3\2\uffff\1\3\6\uffff\1\3\4\uffff\11\3\1\2\12\uffff\1\4\1"+
            "\5\1\6\1\7\1\11\1\12\1\13\1\14\1\15\1\16\1\20\1\21\1\22\1\23"+
            "\1\3",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\3\27\6\uffff\4\27\5\uffff\1\27\2\uffff\1\27\1\uffff\1\27\5"+
            "\uffff\1\27\6\uffff\1\27\1\uffff\5\27\3\uffff\2\27\2\uffff\1"+
            "\27\6\uffff\1\27\4\uffff\11\27\2\uffff\6\27\3\uffff\17\27\51"+
            "\uffff\1\27\1\26",
            "",
            ""
    };

    static final short[] DFA106_eot = DFA.unpackEncodedString(DFA106_eotS);
    static final short[] DFA106_eof = DFA.unpackEncodedString(DFA106_eofS);
    static final char[] DFA106_min = DFA.unpackEncodedStringToUnsignedChars(DFA106_minS);
    static final char[] DFA106_max = DFA.unpackEncodedStringToUnsignedChars(DFA106_maxS);
    static final short[] DFA106_accept = DFA.unpackEncodedString(DFA106_acceptS);
    static final short[] DFA106_special = DFA.unpackEncodedString(DFA106_specialS);
    static final short[][] DFA106_transition;

    static {
        int numStates = DFA106_transitionS.length;
        DFA106_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA106_transition[i] = DFA.unpackEncodedString(DFA106_transitionS[i]);
        }
    }

    class DFA106 extends DFA {

        public DFA106(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 106;
            this.eot = DFA106_eot;
            this.eof = DFA106_eof;
            this.min = DFA106_min;
            this.max = DFA106_max;
            this.accept = DFA106_accept;
            this.special = DFA106_special;
            this.transition = DFA106_transition;
        }
        public String getDescription() {
            return "893:1: property[PropertyDefinitions props] : (k= ident '=' simple= propertyValue | k= ident '=' map= map_literal );";
        }
    }
    static final String DFA111_eotS =
        "\61\uffff";
    static final String DFA111_eofS =
        "\61\uffff";
    static final String DFA111_minS =
        "\1\6\24\127\1\uffff\1\6\1\116\1\uffff\24\127\4\uffff";
    static final String DFA111_maxS =
        "\1\u0089\24\u0099\1\uffff\1\u0089\1\u0092\1\uffff\24\u0099\4\uffff";
    static final String DFA111_acceptS =
        "\25\uffff\1\2\2\uffff\1\1\24\uffff\1\6\1\3\1\4\1\5";
    static final String DFA111_specialS =
        "\61\uffff}>";
    static final String[] DFA111_transitionS = {
            "\1\3\1\24\1\3\6\uffff\1\3\2\24\6\uffff\1\3\2\uffff\1\3\1\uffff"+
            "\1\17\5\uffff\1\10\6\uffff\1\3\1\uffff\5\3\1\uffff\1\1\2\uffff"+
            "\1\3\2\uffff\1\3\6\uffff\1\3\4\uffff\11\3\1\2\10\uffff\1\25"+
            "\1\uffff\1\4\1\5\1\6\1\7\1\11\1\12\1\13\1\14\1\15\1\16\1\20"+
            "\1\21\1\22\1\23\1\3\42\uffff\1\26",
            "\1\27\74\uffff\1\30\1\uffff\4\30",
            "\1\27\74\uffff\1\30\1\uffff\4\30",
            "\1\27\74\uffff\1\30\1\uffff\4\30",
            "\1\27\74\uffff\1\30\1\uffff\4\30",
            "\1\27\74\uffff\1\30\1\uffff\4\30",
            "\1\27\74\uffff\1\30\1\uffff\4\30",
            "\1\27\74\uffff\1\30\1\uffff\4\30",
            "\1\27\74\uffff\1\30\1\uffff\4\30",
            "\1\27\74\uffff\1\30\1\uffff\4\30",
            "\1\27\74\uffff\1\30\1\uffff\4\30",
            "\1\27\74\uffff\1\30\1\uffff\4\30",
            "\1\27\74\uffff\1\30\1\uffff\4\30",
            "\1\27\74\uffff\1\30\1\uffff\4\30",
            "\1\27\74\uffff\1\30\1\uffff\4\30",
            "\1\27\74\uffff\1\30\1\uffff\4\30",
            "\1\27\74\uffff\1\30\1\uffff\4\30",
            "\1\27\74\uffff\1\30\1\uffff\4\30",
            "\1\27\74\uffff\1\30\1\uffff\4\30",
            "\1\27\74\uffff\1\30\1\uffff\4\30",
            "\1\27\74\uffff\1\30\1\uffff\4\30",
            "",
            "\1\33\1\54\1\33\6\uffff\1\33\2\54\6\uffff\1\33\2\uffff\1\33"+
            "\1\uffff\1\47\5\uffff\1\40\6\uffff\1\33\1\uffff\5\33\1\uffff"+
            "\1\31\2\uffff\1\33\2\uffff\1\33\6\uffff\1\33\4\uffff\11\33\1"+
            "\32\10\uffff\1\55\1\uffff\1\34\1\35\1\36\1\37\1\41\1\42\1\43"+
            "\1\44\1\45\1\46\1\50\1\51\1\52\1\53\1\33\42\uffff\1\55",
            "\1\56\72\uffff\1\57\10\uffff\1\56",
            "",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "\1\55\62\uffff\2\60\10\uffff\1\55\1\uffff\4\55",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA111_eot = DFA.unpackEncodedString(DFA111_eotS);
    static final short[] DFA111_eof = DFA.unpackEncodedString(DFA111_eofS);
    static final char[] DFA111_min = DFA.unpackEncodedStringToUnsignedChars(DFA111_minS);
    static final char[] DFA111_max = DFA.unpackEncodedStringToUnsignedChars(DFA111_maxS);
    static final short[] DFA111_accept = DFA.unpackEncodedString(DFA111_acceptS);
    static final short[] DFA111_special = DFA.unpackEncodedString(DFA111_specialS);
    static final short[][] DFA111_transition;

    static {
        int numStates = DFA111_transitionS.length;
        DFA111_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA111_transition[i] = DFA.unpackEncodedString(DFA111_transitionS[i]);
        }
    }

    class DFA111 extends DFA {

        public DFA111(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 111;
            this.eot = DFA111_eot;
            this.eof = DFA111_eof;
            this.min = DFA111_min;
            this.max = DFA111_max;
            this.accept = DFA111_accept;
            this.special = DFA111_special;
            this.transition = DFA111_transition;
        }
        public String getDescription() {
            return "911:1: relation[List<Relation> clauses] : (name= cident type= relationType t= term | K_TOKEN l= tupleOfIdentifiers type= relationType t= term | name= cident K_IN marker= inMarker | name= cident K_IN inValues= singleColumnInValues | ids= tupleOfIdentifiers ( K_IN ( '(' ')' | tupleInMarker= inMarkerForTuple | literals= tupleOfTupleLiterals | markers= tupleOfMarkersForTuples ) | type= relationType literal= tupleLiteral | type= relationType tupleMarker= markerForTuple ) | '(' relation[$clauses] ')' );";
        }
    }
 

    public static final BitSet FOLLOW_cqlStatement_in_query72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_query75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_EOF_in_query79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectStatement_in_cqlStatement113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insertStatement_in_cqlStatement138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateStatement_in_cqlStatement163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_batchStatement_in_cqlStatement188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deleteStatement_in_cqlStatement214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_useStatement_in_cqlStatement239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_truncateStatement_in_cqlStatement267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createKeyspaceStatement_in_cqlStatement290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createTableStatement_in_cqlStatement307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createIndexStatement_in_cqlStatement326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropKeyspaceStatement_in_cqlStatement345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropTableStatement_in_cqlStatement363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropIndexStatement_in_cqlStatement384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterTableStatement_in_cqlStatement405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterKeyspaceStatement_in_cqlStatement425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_grantStatement_in_cqlStatement442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_revokeStatement_in_cqlStatement467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listPermissionsStatement_in_cqlStatement491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createUserStatement_in_cqlStatement506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterUserStatement_in_cqlStatement526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropUserStatement_in_cqlStatement547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listUsersStatement_in_cqlStatement569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createTriggerStatement_in_cqlStatement590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropTriggerStatement_in_cqlStatement607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_USE_in_useStatement639 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_keyspaceName_in_useStatement643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_SELECT_in_selectStatement677 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF403FF0L,0x0000000000001000L});
    public static final BitSet FOLLOW_K_DISTINCT_in_selectStatement683 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF403FF0L,0x0000000000001000L});
    public static final BitSet FOLLOW_selectClause_in_selectStatement692 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_K_COUNT_in_selectStatement712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_selectStatement714 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_selectCountClause_in_selectStatement718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_selectStatement720 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_K_AS_in_selectStatement725 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_ident_in_selectStatement729 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_K_FROM_in_selectStatement744 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_columnFamilyName_in_selectStatement748 = new BitSet(new long[]{0x0000000000006C02L});
    public static final BitSet FOLLOW_K_WHERE_in_selectStatement758 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF403FF0L,0x0000000000000200L});
    public static final BitSet FOLLOW_whereClause_in_selectStatement762 = new BitSet(new long[]{0x0000000000006802L});
    public static final BitSet FOLLOW_K_ORDER_in_selectStatement775 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_K_BY_in_selectStatement777 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_orderByClause_in_selectStatement779 = new BitSet(new long[]{0x0000000000006002L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_selectStatement784 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_orderByClause_in_selectStatement786 = new BitSet(new long[]{0x0000000000006002L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_K_LIMIT_in_selectStatement803 = new BitSet(new long[]{0x0000000000044000L,0x0000000000004000L,0x0000000000040000L});
    public static final BitSet FOLLOW_intValue_in_selectStatement807 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_K_ALLOW_in_selectStatement822 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_K_FILTERING_in_selectStatement824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_selectClause861 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_selectClause866 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF403FF0L});
    public static final BitSet FOLLOW_selector_in_selectClause870 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_140_in_selectClause882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaliasedSelector_in_selector915 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_K_AS_in_selector918 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_ident_in_selector922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_unaliasedSelector951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_WRITETIME_in_unaliasedSelector994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_unaliasedSelector996 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_unaliasedSelector1000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_unaliasedSelector1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TTL_in_unaliasedSelector1025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_unaliasedSelector1033 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_unaliasedSelector1037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_unaliasedSelector1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionName_in_unaliasedSelector1064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_selectionFunctionArgs_in_unaliasedSelector1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_selectionFunctionArgs1091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_selectionFunctionArgs1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_selectionFunctionArgs1103 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF403FF0L});
    public static final BitSet FOLLOW_unaliasedSelector_in_selectionFunctionArgs1107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_139_in_selectionFunctionArgs1123 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF403FF0L});
    public static final BitSet FOLLOW_unaliasedSelector_in_selectionFunctionArgs1127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_138_in_selectionFunctionArgs1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_selectCountClause1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_selectCountClause1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relation_in_whereClause1222 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_K_AND_in_whereClause1226 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF403FF0L,0x0000000000000200L});
    public static final BitSet FOLLOW_relation_in_whereClause1228 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_cident_in_orderByClause1259 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_K_ASC_in_orderByClause1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DESC_in_orderByClause1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_INSERT_in_insertStatement1306 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_K_INTO_in_insertStatement1308 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_columnFamilyName_in_insertStatement1312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_insertStatement1324 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_insertStatement1328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_139_in_insertStatement1335 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_insertStatement1339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_138_in_insertStatement1346 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_K_VALUES_in_insertStatement1356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_insertStatement1368 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_insertStatement1372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_139_in_insertStatement1378 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_insertStatement1382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_138_in_insertStatement1389 = new BitSet(new long[]{0x0000000012000002L});
    public static final BitSet FOLLOW_K_IF_in_insertStatement1402 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_K_NOT_in_insertStatement1404 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_insertStatement1406 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_usingClause_in_insertStatement1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_USING_in_usingClause1453 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_usingClauseObjective_in_usingClause1455 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_K_AND_in_usingClause1460 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_usingClauseObjective_in_usingClause1462 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_K_TIMESTAMP_in_usingClauseObjective1484 = new BitSet(new long[]{0x0000000000040000L,0x0000000000004000L,0x0000000000040000L});
    public static final BitSet FOLLOW_intValue_in_usingClauseObjective1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TTL_in_usingClauseObjective1498 = new BitSet(new long[]{0x0000000000040000L,0x0000000000004000L,0x0000000000040000L});
    public static final BitSet FOLLOW_intValue_in_usingClauseObjective1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_UPDATE_in_updateStatement1536 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_columnFamilyName_in_updateStatement1540 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_usingClause_in_updateStatement1550 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_K_SET_in_updateStatement1562 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_columnOperation_in_updateStatement1564 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_updateStatement1568 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_columnOperation_in_updateStatement1570 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_K_WHERE_in_updateStatement1581 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF403FF0L,0x0000000000000200L});
    public static final BitSet FOLLOW_whereClause_in_updateStatement1585 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_K_IF_in_updateStatement1595 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_K_EXISTS_in_updateStatement1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateConditions_in_updateStatement1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_columnCondition_in_updateConditions1649 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_K_AND_in_updateConditions1654 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_columnCondition_in_updateConditions1656 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_K_DELETE_in_deleteStatement1693 = new BitSet(new long[]{0x8125F408290383C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_deleteSelection_in_deleteStatement1699 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_K_FROM_in_deleteStatement1712 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_columnFamilyName_in_deleteStatement1716 = new BitSet(new long[]{0x0000000010000400L});
    public static final BitSet FOLLOW_usingClauseDelete_in_deleteStatement1726 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_K_WHERE_in_deleteStatement1738 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF403FF0L,0x0000000000000200L});
    public static final BitSet FOLLOW_whereClause_in_deleteStatement1742 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_K_IF_in_deleteStatement1752 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_K_EXISTS_in_deleteStatement1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateConditions_in_deleteStatement1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deleteOp_in_deleteSelection1811 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_deleteSelection1826 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_deleteOp_in_deleteSelection1830 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_cident_in_deleteOp1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_deleteOp1884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_deleteOp1886 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_deleteOp1890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_142_in_deleteOp1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_USING_in_usingClauseDelete1912 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_K_TIMESTAMP_in_usingClauseDelete1914 = new BitSet(new long[]{0x0000000000040000L,0x0000000000004000L,0x0000000000040000L});
    public static final BitSet FOLLOW_intValue_in_usingClauseDelete1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_BEGIN_in_batchStatement1952 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_K_UNLOGGED_in_batchStatement1962 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_K_COUNTER_in_batchStatement1968 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_K_BATCH_in_batchStatement1981 = new BitSet(new long[]{0x0000002150400000L});
    public static final BitSet FOLLOW_usingClause_in_batchStatement1985 = new BitSet(new long[]{0x0000002140400000L});
    public static final BitSet FOLLOW_batchStatementObjective_in_batchStatement2005 = new BitSet(new long[]{0x0000002140400000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_batchStatement2007 = new BitSet(new long[]{0x0000002140400000L});
    public static final BitSet FOLLOW_K_APPLY_in_batchStatement2021 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_K_BATCH_in_batchStatement2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insertStatement_in_batchStatementObjective2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateStatement_in_batchStatementObjective2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deleteStatement_in_batchStatementObjective2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createKeyspaceStatement2115 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_K_KEYSPACE_in_createKeyspaceStatement2117 = new BitSet(new long[]{0x8125F4082B0381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_K_IF_in_createKeyspaceStatement2120 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_K_NOT_in_createKeyspaceStatement2122 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_createKeyspaceStatement2124 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_keyspaceName_in_createKeyspaceStatement2133 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_K_WITH_in_createKeyspaceStatement2141 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_properties_in_createKeyspaceStatement2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createTableStatement2178 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_K_COLUMNFAMILY_in_createTableStatement2180 = new BitSet(new long[]{0x8125F4082B0381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_K_IF_in_createTableStatement2183 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_K_NOT_in_createTableStatement2185 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_createTableStatement2187 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_columnFamilyName_in_createTableStatement2202 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_cfamDefinition_in_createTableStatement2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_cfamDefinition2231 = new BitSet(new long[]{0x8125FC08290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cfamColumns_in_cfamDefinition2233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_139_in_cfamDefinition2238 = new BitSet(new long[]{0x8125FC08290381C0L,0x0000007FFF003FF0L,0x0000000000000C00L});
    public static final BitSet FOLLOW_cfamColumns_in_cfamDefinition2240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_138_in_cfamDefinition2247 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_K_WITH_in_cfamDefinition2257 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cfamProperty_in_cfamDefinition2259 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_K_AND_in_cfamDefinition2264 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cfamProperty_in_cfamDefinition2266 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ident_in_cfamColumns2292 = new BitSet(new long[]{0x8131F408A9008140L,0x0000007FFF001FF0L});
    public static final BitSet FOLLOW_comparatorType_in_cfamColumns2296 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_K_STATIC_in_cfamColumns2301 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_K_PRIMARY_in_cfamColumns2318 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_K_KEY_in_cfamColumns2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_PRIMARY_in_cfamColumns2332 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_K_KEY_in_cfamColumns2334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_cfamColumns2336 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L,0x0000000000000200L});
    public static final BitSet FOLLOW_pkDef_in_cfamColumns2338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_139_in_cfamColumns2342 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_ident_in_cfamColumns2346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_138_in_cfamColumns2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_pkDef2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_pkDef2383 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_ident_in_pkDef2389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_139_in_pkDef2395 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_ident_in_pkDef2399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_138_in_pkDef2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_cfamProperty2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_COMPACT_in_cfamProperty2435 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_K_STORAGE_in_cfamProperty2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CLUSTERING_in_cfamProperty2447 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_K_ORDER_in_cfamProperty2449 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_K_BY_in_cfamProperty2451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_cfamProperty2453 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cfamOrdering_in_cfamProperty2455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_139_in_cfamProperty2459 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cfamOrdering_in_cfamProperty2461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_138_in_cfamProperty2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_cfamOrdering2494 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_K_ASC_in_cfamOrdering2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DESC_in_cfamOrdering2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createIndexStatement2539 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_K_CUSTOM_in_createIndexStatement2542 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_K_INDEX_in_createIndexStatement2548 = new BitSet(new long[]{0x000C000002000000L});
    public static final BitSet FOLLOW_K_IF_in_createIndexStatement2551 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_K_NOT_in_createIndexStatement2553 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_createIndexStatement2555 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_IDENT_in_createIndexStatement2573 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_K_ON_in_createIndexStatement2577 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_columnFamilyName_in_createIndexStatement2581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_createIndexStatement2583 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_createIndexStatement2587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_createIndexStatement2589 = new BitSet(new long[]{0x0000010010000002L});
    public static final BitSet FOLLOW_K_USING_in_createIndexStatement2600 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_createIndexStatement2604 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_K_WITH_in_createIndexStatement2619 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_properties_in_createIndexStatement2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createTriggerStatement2655 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_K_TRIGGER_in_createTriggerStatement2657 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_IDENT_in_createTriggerStatement2662 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_K_ON_in_createTriggerStatement2665 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_columnFamilyName_in_createTriggerStatement2669 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_K_USING_in_createTriggerStatement2671 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_createTriggerStatement2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_dropTriggerStatement2706 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_K_TRIGGER_in_dropTriggerStatement2708 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_IDENT_in_dropTriggerStatement2713 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_K_ON_in_dropTriggerStatement2716 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_columnFamilyName_in_dropTriggerStatement2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ALTER_in_alterKeyspaceStatement2760 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_K_KEYSPACE_in_alterKeyspaceStatement2762 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_keyspaceName_in_alterKeyspaceStatement2766 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_K_WITH_in_alterKeyspaceStatement2776 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_properties_in_alterKeyspaceStatement2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ALTER_in_alterTableStatement2814 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_K_COLUMNFAMILY_in_alterTableStatement2816 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_columnFamilyName_in_alterTableStatement2820 = new BitSet(new long[]{0x06C0010000000000L});
    public static final BitSet FOLLOW_K_ALTER_in_alterTableStatement2834 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_alterTableStatement2838 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_K_TYPE_in_alterTableStatement2840 = new BitSet(new long[]{0x8131F408A9008140L,0x0000007FFF001FF0L});
    public static final BitSet FOLLOW_comparatorType_in_alterTableStatement2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ADD_in_alterTableStatement2860 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_alterTableStatement2866 = new BitSet(new long[]{0x8131F408A9008140L,0x0000007FFF001FF0L});
    public static final BitSet FOLLOW_comparatorType_in_alterTableStatement2870 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_K_STATIC_in_alterTableStatement2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_alterTableStatement2893 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_alterTableStatement2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_WITH_in_alterTableStatement2938 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_properties_in_alterTableStatement2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_RENAME_in_alterTableStatement2974 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_alterTableStatement3028 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_K_TO_in_alterTableStatement3030 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_alterTableStatement3034 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_K_AND_in_alterTableStatement3055 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_alterTableStatement3059 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_K_TO_in_alterTableStatement3061 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_alterTableStatement3065 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_K_DROP_in_dropKeyspaceStatement3120 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement3122 = new BitSet(new long[]{0x8125F4082B0381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_K_IF_in_dropKeyspaceStatement3125 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_dropKeyspaceStatement3127 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_keyspaceName_in_dropKeyspaceStatement3136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_dropTableStatement3170 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_K_COLUMNFAMILY_in_dropTableStatement3172 = new BitSet(new long[]{0x8125F4082B0381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_K_IF_in_dropTableStatement3175 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_dropTableStatement3177 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_columnFamilyName_in_dropTableStatement3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_dropIndexStatement3220 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_K_INDEX_in_dropIndexStatement3222 = new BitSet(new long[]{0x0004000002000000L});
    public static final BitSet FOLLOW_K_IF_in_dropIndexStatement3225 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_dropIndexStatement3227 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_IDENT_in_dropIndexStatement3236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TRUNCATE_in_truncateStatement3267 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_columnFamilyName_in_truncateStatement3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_GRANT_in_grantStatement3296 = new BitSet(new long[]{0x00C0004000000020L,0x000000000000001CL});
    public static final BitSet FOLLOW_permissionOrAll_in_grantStatement3308 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_K_ON_in_grantStatement3316 = new BitSet(new long[]{0x8125F688290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_resource_in_grantStatement3328 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_K_TO_in_grantStatement3336 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_username_in_grantStatement3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_REVOKE_in_revokeStatement3379 = new BitSet(new long[]{0x00C0004000000020L,0x000000000000001CL});
    public static final BitSet FOLLOW_permissionOrAll_in_revokeStatement3391 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_K_ON_in_revokeStatement3399 = new BitSet(new long[]{0x8125F688290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_resource_in_revokeStatement3411 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_K_FROM_in_revokeStatement3419 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_username_in_revokeStatement3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_LIST_in_listPermissionsStatement3469 = new BitSet(new long[]{0x00C0004000000020L,0x000000000000001CL});
    public static final BitSet FOLLOW_permissionOrAll_in_listPermissionsStatement3481 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_K_ON_in_listPermissionsStatement3491 = new BitSet(new long[]{0x8125F688290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_resource_in_listPermissionsStatement3493 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_K_OF_in_listPermissionsStatement3508 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_username_in_listPermissionsStatement3510 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_K_NORECURSIVE_in_listPermissionsStatement3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_permission3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ALL_in_permissionOrAll3610 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_K_PERMISSIONS_in_permissionOrAll3614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_permission_in_permissionOrAll3635 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_K_PERMISSION_in_permissionOrAll3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dataResource_in_resource3667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ALL_in_dataResource3690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_K_KEYSPACES_in_dataResource3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_KEYSPACE_in_dataResource3702 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_keyspaceName_in_dataResource3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_COLUMNFAMILY_in_dataResource3720 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_columnFamilyName_in_dataResource3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createUserStatement3769 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_K_USER_in_createUserStatement3771 = new BitSet(new long[]{0x0014000002000000L});
    public static final BitSet FOLLOW_K_IF_in_createUserStatement3774 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_K_NOT_in_createUserStatement3776 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_createUserStatement3778 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_username_in_createUserStatement3784 = new BitSet(new long[]{0x0000010000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_K_WITH_in_createUserStatement3794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_userOptions_in_createUserStatement3796 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_K_SUPERUSER_in_createUserStatement3810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_NOSUPERUSER_in_createUserStatement3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ALTER_in_alterUserStatement3861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_K_USER_in_alterUserStatement3863 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_username_in_alterUserStatement3865 = new BitSet(new long[]{0x0000010000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_K_WITH_in_alterUserStatement3875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_userOptions_in_alterUserStatement3877 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_K_SUPERUSER_in_alterUserStatement3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_NOSUPERUSER_in_alterUserStatement3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_dropUserStatement3942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_K_USER_in_dropUserStatement3944 = new BitSet(new long[]{0x0014000002000000L});
    public static final BitSet FOLLOW_K_IF_in_dropUserStatement3947 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_dropUserStatement3949 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_username_in_dropUserStatement3955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_LIST_in_listUsersStatement3980 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_K_USERS_in_listUsersStatement3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_userOption_in_userOptions4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_PASSWORD_in_userOption4023 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_userOption4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_cident4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_NAME_in_cident4083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_keyword_in_cident4102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_ident4128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_NAME_in_ident4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_keyword_in_ident4172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cfOrKsName_in_keyspaceName4205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cfOrKsName_in_columnFamilyName4239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_columnFamilyName4242 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF007FF0L});
    public static final BitSet FOLLOW_cfOrKsName_in_columnFamilyName4246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_cfOrKsName4267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_NAME_in_cfOrKsName4292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_keyword_in_cfOrKsName4311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QMARK_in_cfOrKsName4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_constant4346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_constant4358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_constant4377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_constant4398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UUID_in_constant4417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_constant4439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_constant4457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_set_in_constant4466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_map_literal4495 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x00000000000F2200L});
    public static final BitSet FOLLOW_term_in_map_literal4513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_146_in_map_literal4515 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_map_literal4519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_139_in_map_literal4525 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_map_literal4529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_146_in_map_literal4531 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_map_literal4535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080800L});
    public static final BitSet FOLLOW_147_in_map_literal4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_set_or_map4575 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_set_or_map4579 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_set_or_map4595 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_set_or_map4599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_146_in_set_or_map4601 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_set_or_map4605 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_set_or_map4640 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_set_or_map4644 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_141_in_collection_literal4678 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000076200L});
    public static final BitSet FOLLOW_term_in_collection_literal4696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004800L});
    public static final BitSet FOLLOW_139_in_collection_literal4702 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_collection_literal4706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004800L});
    public static final BitSet FOLLOW_142_in_collection_literal4722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_collection_literal4732 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_collection_literal4736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000C0800L});
    public static final BitSet FOLLOW_set_or_map_in_collection_literal4740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_147_in_collection_literal4745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_collection_literal4763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_147_in_collection_literal4765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_value4790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collection_literal_in_value4812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_NULL_in_value4822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_value4846 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_ident_in_value4850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QMARK_in_value4868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_intValue4914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_intValue4928 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_ident_in_intValue4932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QMARK_in_intValue4943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_functionName4976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_function_keyword_in_functionName5010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TOKEN_in_functionName5020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_functionArgs5065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_functionArgs5067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_functionArgs5077 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_functionArgs5081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_139_in_functionArgs5097 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_functionArgs5101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_138_in_functionArgs5115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_term5140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionName_in_term5177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_functionArgs_in_term5181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_term5191 = new BitSet(new long[]{0x8131F408A9008140L,0x0000007FFF001FF0L});
    public static final BitSet FOLLOW_comparatorType_in_term5195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_term5197 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_term5201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_columnOperation5224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_columnOperation5226 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_columnOperation5230 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_149_in_columnOperation5233 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_columnOperation5237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_columnOperation5258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_columnOperation5260 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_columnOperation5264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000210000L});
    public static final BitSet FOLLOW_set_in_columnOperation5268 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_columnOperation5278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_columnOperation5296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_columnOperation5298 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_columnOperation5302 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_INTEGER_in_columnOperation5306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_columnOperation5324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_columnOperation5326 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_columnOperation5330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_142_in_columnOperation5332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_columnOperation5334 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_columnOperation5338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_columnCondition5371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_columnCondition5373 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_columnCondition5377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_columnCondition5389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_columnCondition5391 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_columnCondition5395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_142_in_columnCondition5397 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_columnCondition5399 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_columnCondition5403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_properties5424 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_K_AND_in_properties5428 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_property_in_properties5430 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ident_in_property5453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_property5455 = new BitSet(new long[]{0x8131F408290781C0L,0x0000007FFF1F9FF0L,0x0000000000010000L});
    public static final BitSet FOLLOW_propertyValue_in_property5459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_property5471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_property5473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_map_literal_in_property5477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_propertyValue5502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_keyword_in_propertyValue5524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_relationType5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_relationType5558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_relationType5569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_relationType5579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_relationType5590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_relation5612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000003D00000L});
    public static final BitSet FOLLOW_relationType_in_relation5616 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_relation5620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TOKEN_in_relation5630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_tupleOfIdentifiers_in_relation5634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000003D00000L});
    public static final BitSet FOLLOW_relationType_in_relation5638 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_relation5642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_relation5662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_K_IN_in_relation5664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0000000000040000L});
    public static final BitSet FOLLOW_inMarker_in_relation5668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_relation5688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_K_IN_in_relation5690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_singleColumnInValues_in_relation5694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleOfIdentifiers_in_relation5714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L,0x0000000003D00000L});
    public static final BitSet FOLLOW_K_IN_in_relation5724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0000000000040200L});
    public static final BitSet FOLLOW_137_in_relation5738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_relation5740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inMarkerForTuple_in_relation5772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleOfTupleLiterals_in_relation5806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleOfMarkersForTuples_in_relation5840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationType_in_relation5882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_tupleLiteral_in_relation5886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationType_in_relation5912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0000000000040000L});
    public static final BitSet FOLLOW_markerForTuple_in_relation5916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_relation5946 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF403FF0L,0x0000000000000200L});
    public static final BitSet FOLLOW_relation_in_relation5948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_relation5951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QMARK_in_inMarker5972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_inMarker5982 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_ident_in_inMarker5986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_tupleOfIdentifiers6018 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_tupleOfIdentifiers6022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_139_in_tupleOfIdentifiers6027 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_cident_in_tupleOfIdentifiers6031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_138_in_tupleOfIdentifiers6037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_singleColumnInValues6067 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072600L});
    public static final BitSet FOLLOW_term_in_singleColumnInValues6075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_139_in_singleColumnInValues6080 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_singleColumnInValues6084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_138_in_singleColumnInValues6093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_tupleLiteral6123 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_tupleLiteral6127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_139_in_tupleLiteral6132 = new BitSet(new long[]{0x8135F408290781C0L,0x0000007FFF7FFFF0L,0x0000000000072200L});
    public static final BitSet FOLLOW_term_in_tupleLiteral6136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_138_in_tupleLiteral6142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_tupleOfTupleLiterals6174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_tupleLiteral_in_tupleOfTupleLiterals6178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_139_in_tupleOfTupleLiterals6183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_tupleLiteral_in_tupleOfTupleLiterals6187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_138_in_tupleOfTupleLiterals6193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QMARK_in_markerForTuple6214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_markerForTuple6224 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_ident_in_markerForTuple6228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_tupleOfMarkersForTuples6260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0000000000040000L});
    public static final BitSet FOLLOW_markerForTuple_in_tupleOfMarkersForTuples6264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_139_in_tupleOfMarkersForTuples6269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0000000000040000L});
    public static final BitSet FOLLOW_markerForTuple_in_tupleOfMarkersForTuples6273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_138_in_tupleOfMarkersForTuples6279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QMARK_in_inMarkerForTuple6300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_inMarkerForTuple6310 = new BitSet(new long[]{0x8125F408290381C0L,0x0000007FFF003FF0L});
    public static final BitSet FOLLOW_ident_in_inMarkerForTuple6314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_native_type_in_comparatorType6339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collection_type_in_comparatorType6355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_comparatorType6367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ASCII_in_native_type6396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_BIGINT_in_native_type6410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_BLOB_in_native_type6423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_BOOLEAN_in_native_type6438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_COUNTER_in_native_type6450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DECIMAL_in_native_type6462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DOUBLE_in_native_type6474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_FLOAT_in_native_type6487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_INET_in_native_type6501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_INT_in_native_type6516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TEXT_in_native_type6532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TIMESTAMP_in_native_type6547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_UUID_in_native_type6557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_VARCHAR_in_native_type6572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_VARINT_in_native_type6584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TIMEUUID_in_native_type6597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_MAP_in_collection_type6621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_collection_type6624 = new BitSet(new long[]{0x8131F408A9008140L,0x0000007FFF001FF0L});
    public static final BitSet FOLLOW_comparatorType_in_collection_type6628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_collection_type6630 = new BitSet(new long[]{0x8131F408A9008140L,0x0000007FFF001FF0L});
    public static final BitSet FOLLOW_comparatorType_in_collection_type6634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_152_in_collection_type6636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_LIST_in_collection_type6654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_collection_type6656 = new BitSet(new long[]{0x8131F408A9008140L,0x0000007FFF001FF0L});
    public static final BitSet FOLLOW_comparatorType_in_collection_type6660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_152_in_collection_type6662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_SET_in_collection_type6680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_150_in_collection_type6683 = new BitSet(new long[]{0x8131F408A9008140L,0x0000007FFF001FF0L});
    public static final BitSet FOLLOW_comparatorType_in_collection_type6687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_152_in_collection_type6689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_username0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_function_keyword_in_unreserved_keyword6747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unreserved_keyword6763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unreserved_function_keyword6798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_native_type_in_unreserved_function_keyword7098 = new BitSet(new long[]{0x0000000000000002L});

}