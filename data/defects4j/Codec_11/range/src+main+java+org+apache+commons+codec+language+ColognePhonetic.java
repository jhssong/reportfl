{
  "filepath": "/tmp/Codec-11b/src/main/java/org/apache/commons/codec/language/ColognePhonetic.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ColognePhonetic",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.StringEncoder"
      ],
      "begin_line": 183,
      "end_line": 429,
      "comment": "\n * \u003cp\u003e\n * Encodes a string into a Cologne Phonetic value.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Implements the \u003ca href\u003d\"http://de.wikipedia.org/wiki/K%C3%B6lner_Phonetik\"\u003eK\u0026ouml;lner Phonetik\u003c/a\u003e (Cologne Phonetic)\n * algorithm issued by Hans Joachim Postel in 1969.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * The \u003ci\u003eK\u0026ouml;lner Phonetik\u003c/i\u003e is a phonetic algorithm which is optimized for the German language. It is related to the\n * well-known soundex algorithm.\n * \u003c/p\u003e\n * \n * \u003ch2\u003eAlgorithm\u003c/h2\u003e\n * \n * \u003cul\u003e\n * \n * \u003cli\u003e\n * \u003ch3\u003eStep 1:\u003c/h3\u003e\n * After preprocessing (conversion to upper case, transcription of \u003ca\n * href\u003d\"http://en.wikipedia.org/wiki/Germanic_umlaut\"\u003egermanic umlauts\u003c/a\u003e, removal of non alphabetical characters) the\n * letters of the supplied text are replaced by their phonetic code according to the following table.\n * \u003ctable border\u003d\"1\"\u003e\n * \u003ctbody\u003e\n * \u003ctr\u003e\n * \u003cth\u003eLetter\u003c/th\u003e\n * \u003cth\u003eContext\u003c/th\u003e\n * \u003cth align\u003d\"center\"\u003eCode\u003c/th\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eA, E, I, J, O, U, Y\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd align\u003d\"center\"\u003e0\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \n * \u003ctd\u003eH\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd align\u003d\"center\"\u003e-\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eB\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd rowspan\u003d\"2\" align\u003d\"center\"\u003e1\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eP\u003c/td\u003e\n * \u003ctd\u003enot before H\u003c/td\u003e\n * \n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eD, T\u003c/td\u003e\n * \u003ctd\u003enot before C, S, Z\u003c/td\u003e\n * \u003ctd align\u003d\"center\"\u003e2\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eF, V, W\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd rowspan\u003d\"2\" align\u003d\"center\"\u003e3\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \n * \u003ctd\u003eP\u003c/td\u003e\n * \u003ctd\u003ebefore H\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eG, K, Q\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd rowspan\u003d\"3\" align\u003d\"center\"\u003e4\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd rowspan\u003d\"2\"\u003eC\u003c/td\u003e\n * \u003ctd\u003eat onset before A, H, K, L, O, Q, R, U, X\u003c/td\u003e\n * \n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003ebefore A, H, K, O, Q, U, X except after S, Z\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eX\u003c/td\u003e\n * \u003ctd\u003enot after C, K, Q\u003c/td\u003e\n * \u003ctd align\u003d\"center\"\u003e48\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eL\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \n * \u003ctd align\u003d\"center\"\u003e5\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eM, N\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd align\u003d\"center\"\u003e6\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eR\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd align\u003d\"center\"\u003e7\u003c/td\u003e\n * \u003c/tr\u003e\n * \n * \u003ctr\u003e\n * \u003ctd\u003eS, Z\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd rowspan\u003d\"6\" align\u003d\"center\"\u003e8\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd rowspan\u003d\"3\"\u003eC\u003c/td\u003e\n * \u003ctd\u003eafter S, Z\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eat onset except before A, H, K, L, O, Q, R, U, X\u003c/td\u003e\n * \u003c/tr\u003e\n * \n * \u003ctr\u003e\n * \u003ctd\u003enot before A, H, K, O, Q, U, X\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eD, T\u003c/td\u003e\n * \u003ctd\u003ebefore C, S, Z\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eX\u003c/td\u003e\n * \u003ctd\u003eafter C, K, Q\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003c/tbody\u003e\n * \u003c/table\u003e\n * \u003cp\u003e\n * \u003csmall\u003e\u003ci\u003e(Source: \u003ca href\u003d \"http://de.wikipedia.org/wiki/K%C3%B6lner_Phonetik#Buchstabencodes\" \u003eWikipedia (de):\n * K\u0026ouml;lner Phonetik -- Buchstabencodes\u003c/a\u003e)\u003c/i\u003e\u003c/small\u003e\n * \u003c/p\u003e\n * \n * \u003ch4\u003eExample:\u003c/h4\u003e\n * \n * {@code \"M}\u0026uuml;{@code ller-L}\u0026uuml;{@code denscheidt\" \u003d\u003e \"MULLERLUDENSCHEIDT\" \u003d\u003e \"6005507500206880022\"}\n * \n * \u003c/li\u003e\n * \n * \u003cli\u003e\n * \u003ch3\u003eStep 2:\u003c/h3\u003e\n * Collapse of all multiple consecutive code digits.\n * \u003ch4\u003eExample:\u003c/h4\u003e\n * {@code \"6005507500206880022\" \u003d\u003e \"6050750206802\"}\u003c/li\u003e\n * \n * \u003cli\u003e\n * \u003ch3\u003eStep 3:\u003c/h3\u003e\n * Removal of all codes \"0\" except at the beginning. This means that two or more identical consecutive digits can occur\n * if they occur after removing the \"0\" digits.\n * \n * \u003ch4\u003eExample:\u003c/h4\u003e\n * {@code \"6050750206802\" \u003d\u003e \"65752682\"}\u003c/li\u003e\n * \n * \u003c/ul\u003e\n * \n * @see \u003ca href\u003d\"http://de.wikipedia.org/wiki/K%C3%B6lner_Phonetik\"\u003eWikipedia (de): K\u0026ouml;lner Phonetik (in German)\u003c/a\u003e\n * @author Apache Software Foundation\n * @since 1.5\n "
    },
    {
      "type": "class_interface",
      "name": "CologneBuffer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 185,
      "end_line": 211,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "length"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneBuffer.CologneBuffer(char[])",
      "begin_line": 191,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 192,col 13)-(line 192,col 29)",
        "(line 193,col 13)-(line 193,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneBuffer.CologneBuffer(int)",
      "begin_line": 196,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 197,col 13)-(line 197,col 43)",
        "(line 198,col 13)-(line 198,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneBuffer.copyData(int, int)",
      "begin_line": 201,
      "end_line": 201,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneBuffer.length()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 204,col 13)-(line 204,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneBuffer.toString()",
      "begin_line": 207,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 209,col 13)-(line 209,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CologneOutputBuffer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.language.ColognePhonetic.CologneBuffer"
      ],
      "begin_line": 213,
      "end_line": 230,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneOutputBuffer.CologneOutputBuffer(int)",
      "begin_line": 215,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 216,col 13)-(line 216,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneOutputBuffer.addRight(char)",
      "begin_line": 219,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 220,col 13)-(line 220,col 31)",
        "(line 221,col 13)-(line 221,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneOutputBuffer.copyData(int, int)",
      "begin_line": 224,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 226,col 13)-(line 226,col 46)",
        "(line 227,col 13)-(line 227,col 62)",
        "(line 228,col 13)-(line 228,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CologneInputBuffer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.language.ColognePhonetic.CologneBuffer"
      ],
      "begin_line": 232,
      "end_line": 263,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneInputBuffer.CologneInputBuffer(char[])",
      "begin_line": 234,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 235,col 13)-(line 235,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneInputBuffer.addLeft(char)",
      "begin_line": 238,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 239,col 13)-(line 239,col 21)",
        "(line 240,col 13)-(line 240,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneInputBuffer.copyData(int, int)",
      "begin_line": 243,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 245,col 13)-(line 245,col 46)",
        "(line 246,col 13)-(line 246,col 90)",
        "(line 247,col 13)-(line 247,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneInputBuffer.getNextChar()",
      "begin_line": 250,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 251,col 13)-(line 251,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneInputBuffer.getNextPos()",
      "begin_line": 254,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 255,col 13)-(line 255,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneInputBuffer.removeNext()",
      "begin_line": 258,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 259,col 13)-(line 259,col 36)",
        "(line 260,col 13)-(line 260,col 21)",
        "(line 261,col 13)-(line 261,col 22)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "PREPROCESS_MAP"
      ],
      "begin_line": 274,
      "end_line": 279,
      "comment": "\n     * Maps some Germanic characters to plain for internal processing. The following characters are mapped:\n     * \u003cul\u003e\n     * \u003cli\u003ecapital a, umlaut mark\u003c/li\u003e\n     * \u003cli\u003ecapital u, umlaut mark\u003c/li\u003e\n     * \u003cli\u003ecapital o, umlaut mark\u003c/li\u003e\n     * \u003cli\u003esmall sharp s, German\u003c/li\u003e\n     * \u003c/ul\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.arrayContains(char[], char)",
      "begin_line": 284,
      "end_line": 291,
      "comment": "\n     * Returns whether the array contains the key, or not.\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 290,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.colognePhonetic(java.lang.String)",
      "begin_line": 304,
      "end_line": 388,
      "comment": "\n     * \u003cp\u003e\n     * Implements the \u003ci\u003eK\u0026ouml;lner Phonetik\u003c/i\u003e algorithm.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * In contrast to the initial description of the algorithm, this implementation does the encoding in one pass.\n     * \u003c/p\u003e\n     * \n     * @param text\n     * @return the corresponding encoding according to the \u003ci\u003eK\u0026ouml;lner Phonetik\u003c/i\u003e algorithm\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 307,col 9)",
        "(line 309,col 9)-(line 309,col 32)",
        "(line 311,col 9)-(line 311,col 80)",
        "(line 312,col 9)-(line 312,col 78)",
        "(line 314,col 9)-(line 314,col 22)",
        "(line 316,col 9)-(line 316,col 28)",
        "(line 317,col 9)-(line 317,col 28)",
        "(line 318,col 9)-(line 318,col 18)",
        "(line 319,col 9)-(line 319,col 17)",
        "(line 321,col 9)-(line 321,col 41)",
        "(line 323,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 387,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.encode(java.lang.Object)",
      "begin_line": 390,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 391,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 398,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.encode(java.lang.String)",
      "begin_line": 401,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.isEncodeEqual(java.lang.String, java.lang.String)",
      "begin_line": 405,
      "end_line": 407,
      "comment": "",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.preprocess(java.lang.String)",
      "begin_line": 412,
      "end_line": 428,
      "comment": "\n     * Converts the string to upper case and replaces germanic characters as defined in {@link #PREPROCESS_MAP}.\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 47)",
        "(line 415,col 9)-(line 415,col 41)",
        "(line 417,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 427,col 32)"
      ]
    }
  ]
}