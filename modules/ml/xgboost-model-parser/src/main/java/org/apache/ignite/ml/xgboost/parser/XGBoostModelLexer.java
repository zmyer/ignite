/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.ml.xgboost.parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

/**
 * XGBoost model lexer generated by ANTLR.
 */
@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XGBoostModelLexer extends Lexer {
    /** ANTLR version checker. */
    static {
        RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION);
    }

    /** Decision to DFA. */
    protected static final DFA[] _decisionToDFA;

    /** Shared context cache. */
    protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();

    /** */
    public static final int
        YES = 1, NO = 2, MISSING = 3, EQ = 4, COMMA = 5, PLUS = 6, MINUS = 7, DOT = 8, EXP = 9,
        BOOSTER = 10, LBRACK = 11, RBRACK = 12, COLON = 13, LEAF = 14, INT = 15, DOUBLE = 16,
        STRING = 17, NEWLINE = 18, LT = 19, WS = 20;

    /** Channel names. */
    public static String[] channelNames = {
        "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    /** Mode names. */
    public static String[] modeNames = {
        "DEFAULT_MODE"
    };

    /** Rule names. */
    public static final String[] ruleNames = {
        "YES", "NO", "MISSING", "EQ", "COMMA", "PLUS", "MINUS", "DOT", "EXP",
        "BOOSTER", "LBRACK", "RBRACK", "COLON", "LEAF", "INT", "DOUBLE", "STRING",
        "NEWLINE", "LT", "WS"
    };

    /** Literal names. */
    private static final String[] _LITERAL_NAMES = {
        null, "'yes'", "'no'", "'missing'", "'='", "','", "'+'", "'-'", "'.'",
        null, "'booster'", "'['", "']'", "':'", "'leaf'", null, null, null, null,
        "'<'"
    };

    /** Symbolic names. */
    private static final String[] _SYMBOLIC_NAMES = {
        null, "YES", "NO", "MISSING", "EQ", "COMMA", "PLUS", "MINUS", "DOT", "EXP",
        "BOOSTER", "LBRACK", "RBRACK", "COLON", "LEAF", "INT", "DOUBLE", "STRING",
        "NEWLINE", "LT", "WS"
    };

    /** Vocabulary. */
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * Token names.
     *
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;

    /** */
    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    /** {@inheritDoc} */
    @Deprecated
    @Override public String[] getTokenNames() {
        return tokenNames;
    }

    /** {@inheritDoc} */
    @Override public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    /**
     * Constructs a new instance of XGBoost model lexer.
     *
     * @param input Character stream.
     */
    public XGBoostModelLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    /** {@inheritDoc} */
    @Override public String getGrammarFileName() {
        return "XGBoostModel.g4";
    }

    /** {@inheritDoc} */
    @Override public String[] getRuleNames() {
        return ruleNames;
    }

    /** {@inheritDoc} */
    @Override public String getSerializedATN() {
        return _serializedATN;
    }

    /** {@inheritDoc} */
    @Override public String[] getChannelNames() {
        return channelNames;
    }

    /** {@inheritDoc} */
    @Override public String[] getModeNames() {
        return modeNames;
    }

    /** {@inheritDoc} */
    @Override public ATN getATN() {
        return _ATN;
    }

    /** Serialized ATN. */
    public static final String _serializedATN =
        "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u0083\b\1\4\2" +
            "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
            "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
            "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3" +
            "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n" +
            "\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16" +
            "\3\17\3\17\3\17\3\17\3\17\3\20\3\20\5\20\\\n\20\3\20\6\20_\n\20\r\20\16" +
            "\20`\3\21\3\21\3\21\7\21f\n\21\f\21\16\21i\13\21\3\21\3\21\3\21\5\21n" +
            "\n\21\3\22\3\22\6\22r\n\22\r\22\16\22s\3\23\3\23\3\23\5\23y\n\23\3\24" +
            "\3\24\3\25\6\25~\n\25\r\25\16\25\177\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6" +
            "\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24" +
            "\'\25)\26\3\2\b\4\2GGgg\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17" +
            "\4\2\13\13\"\"\2\u008a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2" +
            "\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25" +
            "\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2" +
            "\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2" +
            "\2\5/\3\2\2\2\7\62\3\2\2\2\t:\3\2\2\2\13<\3\2\2\2\r>\3\2\2\2\17@\3\2\2" +
            "\2\21B\3\2\2\2\23D\3\2\2\2\25F\3\2\2\2\27N\3\2\2\2\31P\3\2\2\2\33R\3\2" +
            "\2\2\35T\3\2\2\2\37[\3\2\2\2!b\3\2\2\2#o\3\2\2\2%x\3\2\2\2\'z\3\2\2\2" +
            ")}\3\2\2\2+,\7{\2\2,-\7g\2\2-.\7u\2\2.\4\3\2\2\2/\60\7p\2\2\60\61\7q\2" +
            "\2\61\6\3\2\2\2\62\63\7o\2\2\63\64\7k\2\2\64\65\7u\2\2\65\66\7u\2\2\66" +
            "\67\7k\2\2\678\7p\2\289\7i\2\29\b\3\2\2\2:;\7?\2\2;\n\3\2\2\2<=\7.\2\2" +
            "=\f\3\2\2\2>?\7-\2\2?\16\3\2\2\2@A\7/\2\2A\20\3\2\2\2BC\7\60\2\2C\22\3" +
            "\2\2\2DE\t\2\2\2E\24\3\2\2\2FG\7d\2\2GH\7q\2\2HI\7q\2\2IJ\7u\2\2JK\7v" +
            "\2\2KL\7g\2\2LM\7t\2\2M\26\3\2\2\2NO\7]\2\2O\30\3\2\2\2PQ\7_\2\2Q\32\3" +
            "\2\2\2RS\7<\2\2S\34\3\2\2\2TU\7n\2\2UV\7g\2\2VW\7c\2\2WX\7h\2\2X\36\3" +
            "\2\2\2Y\\\5\r\7\2Z\\\5\17\b\2[Y\3\2\2\2[Z\3\2\2\2[\\\3\2\2\2\\^\3\2\2" +
            "\2]_\t\3\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a \3\2\2\2bc\5\37" +
            "\20\2cg\5\21\t\2df\t\3\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hm\3" +
            "\2\2\2ig\3\2\2\2jk\5\23\n\2kl\5\37\20\2ln\3\2\2\2mj\3\2\2\2mn\3\2\2\2" +
            "n\"\3\2\2\2oq\t\4\2\2pr\t\5\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2" +
            "\2t$\3\2\2\2uv\7\17\2\2vy\7\f\2\2wy\t\6\2\2xu\3\2\2\2xw\3\2\2\2y&\3\2" +
            "\2\2z{\7>\2\2{(\3\2\2\2|~\t\7\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2" +
            "\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\b\25\2\2\u0082*\3\2" +
            "\2\2\n\2[`gmsx\177\3\b\2\2";

    /** ATN. */
    public static final ATN _ATN =
        new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    /** */
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}
