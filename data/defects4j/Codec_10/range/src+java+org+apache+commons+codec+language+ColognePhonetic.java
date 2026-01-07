{
  "filepath": "/tmp/Codec-10b/src/java/org/apache/commons/codec/language/ColognePhonetic.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ColognePhonetic",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.StringEncoder"
      ],
      "begin_line": 182,
      "end_line": 418,
      "comment": "\n * \u003cp\u003e\n * Implements of the \u003ca href\u003d\"http://de.wikipedia.org/wiki/K%C3%B6lner_Phonetik\"\u003e“Kölner Phonetic”\u003c/a\u003e (cologne\n * phonetic) algorithm issued by Hans Joachim Postel in 1969.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * The \u003ci\u003eKölner Phonetik\u003c/i\u003e is a phonetic algorithm which is optimized for the German language. It is related to the\n * well-known soundex algorithm.\n * \u003c/p\u003e\n * \n * \u003ch2\u003eAlgorithm\u003c/h2\u003e\n * \n * \u003cul\u003e\n * \n * \u003cli\u003e\n * \u003ch3\u003eFirst step:\u003c/h3\u003e\n * After preprocessing (convertion to upper case, transcription of \u003ca\n * href\u003d\"http://en.wikipedia.org/wiki/Germanic_umlaut\"\u003egermanic umlauts\u003c/a\u003e, removal of non alphabetical characters) the\n * letters of the supplied text are replaced by their phonetic code according to the folowing table.\n * \u003ctable border\u003d\"1\"\u003e\n * \u003ctbody\u003e\n * \u003ctr\u003e\n * \u003cth\u003eLetter\u003c/th\u003e\n * \u003cth\u003eContext\u003c/th\u003e\n * \u003cth align\u003d\"center\"\u003eCode\u003c/th\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eA, E, I, J, O, U, Y\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd align\u003d\"center\"\u003e0\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \n * \u003ctd\u003eH\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd align\u003d\"center\"\u003e-\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eB\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd rowspan\u003d\"2\" align\u003d\"center\"\u003e1\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eP\u003c/td\u003e\n * \u003ctd\u003enot before H\u003c/td\u003e\n * \n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eD, T\u003c/td\u003e\n * \u003ctd\u003enot before C, S, Z\u003c/td\u003e\n * \u003ctd align\u003d\"center\"\u003e2\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eF, V, W\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd rowspan\u003d\"2\" align\u003d\"center\"\u003e3\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \n * \u003ctd\u003eP\u003c/td\u003e\n * \u003ctd\u003ebefore H\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eG, K, Q\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd rowspan\u003d\"3\" align\u003d\"center\"\u003e4\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd rowspan\u003d\"2\"\u003eC\u003c/td\u003e\n * \u003ctd\u003eat onset before A, H, K, L, O, Q, R, U, X\u003c/td\u003e\n * \n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003ebefore A, H, K, O, Q, U, X except after S, Z\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eX\u003c/td\u003e\n * \u003ctd\u003enot after C, K, Q\u003c/td\u003e\n * \u003ctd align\u003d\"center\"\u003e48\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eL\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \n * \u003ctd align\u003d\"center\"\u003e5\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eM, N\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd align\u003d\"center\"\u003e6\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eR\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd align\u003d\"center\"\u003e7\u003c/td\u003e\n * \u003c/tr\u003e\n * \n * \u003ctr\u003e\n * \u003ctd\u003eS, Z\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd rowspan\u003d\"6\" align\u003d\"center\"\u003e8\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd rowspan\u003d\"3\"\u003eC\u003c/td\u003e\n * \u003ctd\u003eafter S, Z\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eat onset except before A, H, K, L, O, Q, R, U, X\u003c/td\u003e\n * \u003c/tr\u003e\n * \n * \u003ctr\u003e\n * \u003ctd\u003enot before A, H, K, O, Q, U, X\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eD, T\u003c/td\u003e\n * \u003ctd\u003ebefore C, S, Z\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eX\u003c/td\u003e\n * \u003ctd\u003eafter C, K, Q\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003c/tbody\u003e\n * \u003c/table\u003e\n * \u003cp\u003e\n * \u003csmall\u003e\u003ci\u003e(Source: \u003ca href\u003d \"http://de.wikipedia.org/wiki/K%C3%B6lner_Phonetik#Buchstabencodes\" \u003eWikipedia (de):\n * Kölner Phonetik – Buchstabencodes\u003c/a\u003e)\u003c/i\u003e\u003c/small\u003e\n * \u003c/p\u003e\n * \n * \u003ch4\u003eExample:\u003c/h4\u003e\n * \n * {@code \"Müller-Lüdenscheidt\" \u003d\u003e \"MULLERLUDENSCHEIDT\" \u003d\u003e \"6005507500206880022\"}\n * \n * \u003c/li\u003e\n * \n * \u003cli\u003e\n * \u003ch3\u003eSecond step:\u003c/h3\u003e\n * Collapse of all multiple consecutive code digits.\n * \u003ch4\u003eExample:\u003c/h4\u003e\n * {@code \"6005507500206880022\" \u003d\u003e \"6050750206802\"}\u003c/li\u003e\n * \n * \u003cli\u003e\n * \u003ch3\u003eThird step:\u003c/h3\u003e\n * Removal of all codes “0” except at the beginning. This means that two or more identical consecutive digits can occur\n *  if they occur after removing the \"0\" digits.\n * \n * \u003ch4\u003eExample:\u003c/h4\u003e\n * {@code \"6050750206802\" \u003d\u003e \"65752682\"}\u003c/li\u003e\n * \n * \u003c/ul\u003e\n * \n * @see \u003ca href\u003d\"http://de.wikipedia.org/wiki/K%C3%B6lner_Phonetik\"\u003e\u003cspan\n *      style\u003d\"font-variant:small-caps\"\u003eWikipedia\u003c/span\u003e (de): \u003ci\u003eKölner Phonetik\u003c/i\u003e\u003c/a\u003e (a German description of the\n *      algorithm and more sources)\n * @author Apache Software Foundation\n * @since 1.5\n "
    },
    {
      "type": "class_interface",
      "name": "CologneBuffer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 184,
      "end_line": 209,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "length"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneBuffer.CologneBuffer(char[])",
      "begin_line": 190,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 191,col 13)-(line 191,col 29)",
        "(line 192,col 13)-(line 192,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneBuffer.CologneBuffer(int)",
      "begin_line": 195,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 196,col 13)-(line 196,col 43)",
        "(line 197,col 13)-(line 197,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneBuffer.copyData(int, int)",
      "begin_line": 200,
      "end_line": 200,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneBuffer.length()",
      "begin_line": 202,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 203,col 13)-(line 203,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneBuffer.toString()",
      "begin_line": 206,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 207,col 13)-(line 207,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CologneOutputBuffer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.language.ColognePhonetic.CologneBuffer"
      ],
      "begin_line": 211,
      "end_line": 227,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneOutputBuffer.CologneOutputBuffer(int)",
      "begin_line": 213,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 214,col 13)-(line 214,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneOutputBuffer.addRight(char)",
      "begin_line": 217,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 218,col 13)-(line 218,col 31)",
        "(line 219,col 13)-(line 219,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneOutputBuffer.copyData(int, int)",
      "begin_line": 222,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 223,col 13)-(line 223,col 46)",
        "(line 224,col 13)-(line 224,col 62)",
        "(line 225,col 13)-(line 225,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CologneInputBuffer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.language.ColognePhonetic.CologneBuffer"
      ],
      "begin_line": 229,
      "end_line": 259,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneInputBuffer.CologneInputBuffer(char[])",
      "begin_line": 231,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 232,col 13)-(line 232,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneInputBuffer.addLeft(char)",
      "begin_line": 235,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 236,col 13)-(line 236,col 21)",
        "(line 237,col 13)-(line 237,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneInputBuffer.copyData(int, int)",
      "begin_line": 240,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 241,col 13)-(line 241,col 46)",
        "(line 242,col 13)-(line 242,col 90)",
        "(line 243,col 13)-(line 243,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneInputBuffer.getNextChar()",
      "begin_line": 246,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 247,col 13)-(line 247,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneInputBuffer.getNextPos()",
      "begin_line": 250,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 251,col 13)-(line 251,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneInputBuffer.removeNext()",
      "begin_line": 254,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 255,col 13)-(line 255,col 36)",
        "(line 256,col 13)-(line 256,col 21)",
        "(line 257,col 13)-(line 257,col 22)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "PREPROCESS_MAP"
      ],
      "begin_line": 261,
      "end_line": 266,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.arrayContains(char[], char)",
      "begin_line": 271,
      "end_line": 278,
      "comment": "\n     * Returns whether the array contains the key, or not.\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 277,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.colognePhonetic(java.lang.String)",
      "begin_line": 294,
      "end_line": 378,
      "comment": "\n     * \u003cp\u003e\n     * \u003cb\u003ecolognePhonetic()\u003c/b\u003e is the actual implementations of the \u003ci\u003eKölner\n     * Phonetik\u003c/i\u003e algorithm.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * In contrast to the initial description of the algorithm, this\n     * implementation does the encoding in one pass.\n     * \u003c/p\u003e\n     * \n     * @param text\n     * @return the corresponding encoding according to the \u003ci\u003eKölner\n     *         Phonetik\u003c/i\u003e algorithm\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 297,col 9)",
        "(line 299,col 9)-(line 299,col 32)",
        "(line 301,col 9)-(line 301,col 80)",
        "(line 302,col 9)-(line 302,col 78)",
        "(line 304,col 9)-(line 304,col 22)",
        "(line 306,col 9)-(line 306,col 28)",
        "(line 307,col 9)-(line 307,col 28)",
        "(line 308,col 9)-(line 308,col 18)",
        "(line 309,col 9)-(line 309,col 17)",
        "(line 311,col 9)-(line 311,col 41)",
        "(line 313,col 9)-(line 376,col 9)",
        "(line 377,col 9)-(line 377,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.encode(java.lang.Object)",
      "begin_line": 380,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 381,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 386,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.encode(java.lang.String)",
      "begin_line": 389,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.isEncodeEqual(java.lang.String, java.lang.String)",
      "begin_line": 393,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.preprocess(java.lang.String)",
      "begin_line": 401,
      "end_line": 417,
      "comment": "\n     * Converts the string to upper case and replaces germanic umlauts, and the\n     * “ß”.\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 47)",
        "(line 404,col 9)-(line 404,col 41)",
        "(line 406,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 416,col 32)"
      ]
    }
  ]
}