{
  "filepath": "/tmp/Codec-13b/src/main/java/org/apache/commons/codec/language/ColognePhonetic.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ColognePhonetic",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.StringEncoder"
      ],
      "begin_line": 178,
      "end_line": 441,
      "comment": "\n * Encodes a string into a Cologne Phonetic value.\n * \u003cp\u003e\n * Implements the \u003ca href\u003d\"http://de.wikipedia.org/wiki/K%C3%B6lner_Phonetik\"\u003eK\u0026ouml;lner Phonetik\u003c/a\u003e\n * (Cologne Phonetic) algorithm issued by Hans Joachim Postel in 1969.\n * \u003cp\u003e\n * The \u003ci\u003eK\u0026ouml;lner Phonetik\u003c/i\u003e is a phonetic algorithm which is optimized for the German language.\n * It is related to the well-known soundex algorithm.\n * \u003cp\u003e\n *\n * \u003ch2\u003eAlgorithm\u003c/h2\u003e\n *\n * \u003cul\u003e\n *\n * \u003cli\u003e\n * \u003ch3\u003eStep 1:\u003c/h3\u003e\n * After preprocessing (conversion to upper case, transcription of \u003ca\n * href\u003d\"http://en.wikipedia.org/wiki/Germanic_umlaut\"\u003egermanic umlauts\u003c/a\u003e, removal of non alphabetical characters) the\n * letters of the supplied text are replaced by their phonetic code according to the following table.\n * \u003ctable border\u003d\"1\"\u003e\n * \u003ccaption style\u003d\"caption-side: bottom\"\u003e\u003csmall\u003e\u003ci\u003e(Source: \u003ca href\u003d\"http://de.wikipedia.org/wiki/K%C3%B6lner_Phonetik#Buchstabencodes\"\u003eWikipedia (de):\n * K\u0026ouml;lner Phonetik -- Buchstabencodes\u003c/a\u003e)\u003c/i\u003e\u003c/small\u003e\u003c/caption\u003e\n * \u003ctbody\u003e\n * \u003ctr\u003e\n * \u003cth\u003eLetter\u003c/th\u003e\n * \u003cth\u003eContext\u003c/th\u003e\n * \u003cth align\u003d\"center\"\u003eCode\u003c/th\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eA, E, I, J, O, U, Y\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd align\u003d\"center\"\u003e0\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n *\n * \u003ctd\u003eH\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd align\u003d\"center\"\u003e-\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eB\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd rowspan\u003d\"2\" align\u003d\"center\"\u003e1\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eP\u003c/td\u003e\n * \u003ctd\u003enot before H\u003c/td\u003e\n *\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eD, T\u003c/td\u003e\n * \u003ctd\u003enot before C, S, Z\u003c/td\u003e\n * \u003ctd align\u003d\"center\"\u003e2\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eF, V, W\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd rowspan\u003d\"2\" align\u003d\"center\"\u003e3\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n *\n * \u003ctd\u003eP\u003c/td\u003e\n * \u003ctd\u003ebefore H\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eG, K, Q\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd rowspan\u003d\"3\" align\u003d\"center\"\u003e4\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd rowspan\u003d\"2\"\u003eC\u003c/td\u003e\n * \u003ctd\u003eat onset before A, H, K, L, O, Q, R, U, X\u003c/td\u003e\n *\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003ebefore A, H, K, O, Q, U, X except after S, Z\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eX\u003c/td\u003e\n * \u003ctd\u003enot after C, K, Q\u003c/td\u003e\n * \u003ctd align\u003d\"center\"\u003e48\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eL\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n *\n * \u003ctd align\u003d\"center\"\u003e5\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eM, N\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd align\u003d\"center\"\u003e6\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eR\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd align\u003d\"center\"\u003e7\u003c/td\u003e\n * \u003c/tr\u003e\n *\n * \u003ctr\u003e\n * \u003ctd\u003eS, Z\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd rowspan\u003d\"6\" align\u003d\"center\"\u003e8\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd rowspan\u003d\"3\"\u003eC\u003c/td\u003e\n * \u003ctd\u003eafter S, Z\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eat onset except before A, H, K, L, O, Q, R, U, X\u003c/td\u003e\n * \u003c/tr\u003e\n *\n * \u003ctr\u003e\n * \u003ctd\u003enot before A, H, K, O, Q, U, X\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eD, T\u003c/td\u003e\n * \u003ctd\u003ebefore C, S, Z\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eX\u003c/td\u003e\n * \u003ctd\u003eafter C, K, Q\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003c/tbody\u003e\n * \u003c/table\u003e\n *\n * \u003ch4\u003eExample:\u003c/h4\u003e\n *\n * {@code \"M}\u0026uuml;{@code ller-L}\u0026uuml;{@code denscheidt\" \u003d\u003e \"MULLERLUDENSCHEIDT\" \u003d\u003e \"6005507500206880022\"}\n *\n * \u003c/li\u003e\n *\n * \u003cli\u003e\n * \u003ch3\u003eStep 2:\u003c/h3\u003e\n * Collapse of all multiple consecutive code digits.\n * \u003ch4\u003eExample:\u003c/h4\u003e\n * {@code \"6005507500206880022\" \u003d\u003e \"6050750206802\"}\u003c/li\u003e\n *\n * \u003cli\u003e\n * \u003ch3\u003eStep 3:\u003c/h3\u003e\n * Removal of all codes \"0\" except at the beginning. This means that two or more identical consecutive digits can occur\n * if they occur after removing the \"0\" digits.\n *\n * \u003ch4\u003eExample:\u003c/h4\u003e\n * {@code \"6050750206802\" \u003d\u003e \"65752682\"}\u003c/li\u003e\n *\n * \u003c/ul\u003e\n *\n * This class is thread-safe.\n *\n * @see \u003ca href\u003d\"http://de.wikipedia.org/wiki/K%C3%B6lner_Phonetik\"\u003eWikipedia (de): K\u0026ouml;lner Phonetik (in German)\u003c/a\u003e\n * @since 1.5\n "
    },
    {
      "type": "field",
      "varNames": [
        "AEIJOUY"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": " Predefined char arrays for better performance and less GC load"
    },
    {
      "type": "field",
      "varNames": [
        "SCZ"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WFPV"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GKQ"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CKQ"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "AHKLOQRUX"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SZ"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "AHOUKQX"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TDX"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "CologneBuffer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 196,
      "end_line": 222,
      "comment": "\n     * This class is not thread-safe; the field {@link #length} is mutable.\n     * However, it is not shared between threads, as it is constructed on demand\n     * by the method {@link ColognePhonetic#colognePhonetic(String)}\n     "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "length"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneBuffer.CologneBuffer(char[])",
      "begin_line": 202,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 203,col 13)-(line 203,col 29)",
        "(line 204,col 13)-(line 204,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneBuffer.CologneBuffer(int)",
      "begin_line": 207,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 208,col 13)-(line 208,col 43)",
        "(line 209,col 13)-(line 209,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneBuffer.copyData(int, int)",
      "begin_line": 212,
      "end_line": 212,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneBuffer.length()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 215,col 13)-(line 215,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneBuffer.toString()",
      "begin_line": 218,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 220,col 13)-(line 220,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CologneOutputBuffer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.language.ColognePhonetic.CologneBuffer"
      ],
      "begin_line": 224,
      "end_line": 241,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneOutputBuffer.CologneOutputBuffer(int)",
      "begin_line": 226,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 227,col 13)-(line 227,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneOutputBuffer.addRight(char)",
      "begin_line": 230,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 231,col 13)-(line 231,col 31)",
        "(line 232,col 13)-(line 232,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneOutputBuffer.copyData(int, int)",
      "begin_line": 235,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 237,col 13)-(line 237,col 52)",
        "(line 238,col 13)-(line 238,col 62)",
        "(line 239,col 13)-(line 239,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CologneInputBuffer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.language.ColognePhonetic.CologneBuffer"
      ],
      "begin_line": 243,
      "end_line": 274,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneInputBuffer.CologneInputBuffer(char[])",
      "begin_line": 245,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 246,col 13)-(line 246,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneInputBuffer.addLeft(char)",
      "begin_line": 249,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 250,col 13)-(line 250,col 21)",
        "(line 251,col 13)-(line 251,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneInputBuffer.copyData(int, int)",
      "begin_line": 254,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 256,col 13)-(line 256,col 52)",
        "(line 257,col 13)-(line 257,col 90)",
        "(line 258,col 13)-(line 258,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneInputBuffer.getNextChar()",
      "begin_line": 261,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 262,col 13)-(line 262,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneInputBuffer.getNextPos()",
      "begin_line": 265,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 266,col 13)-(line 266,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneInputBuffer.removeNext()",
      "begin_line": 269,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 270,col 13)-(line 270,col 42)",
        "(line 271,col 13)-(line 271,col 21)",
        "(line 272,col 13)-(line 272,col 22)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "PREPROCESS_MAP"
      ],
      "begin_line": 285,
      "end_line": 290,
      "comment": "\n     * Maps some Germanic characters to plain for internal processing. The following characters are mapped:\n     * \u003cul\u003e\n     * \u003cli\u003ecapital a, umlaut mark\u003c/li\u003e\n     * \u003cli\u003ecapital u, umlaut mark\u003c/li\u003e\n     * \u003cli\u003ecapital o, umlaut mark\u003c/li\u003e\n     * \u003cli\u003esmall sharp s, German\u003c/li\u003e\n     * \u003c/ul\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.arrayContains(char[], char)",
      "begin_line": 295,
      "end_line": 302,
      "comment": "\n     * Returns whether the array contains the key, or not.\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 301,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.colognePhonetic(java.lang.String)",
      "begin_line": 315,
      "end_line": 398,
      "comment": "\n     * \u003cp\u003e\n     * Implements the \u003ci\u003eK\u0026ouml;lner Phonetik\u003c/i\u003e algorithm.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * In contrast to the initial description of the algorithm, this implementation does the encoding in one pass.\n     * \u003c/p\u003e\n     *\n     * @param text\n     * @return the corresponding encoding according to the \u003ci\u003eK\u0026ouml;lner Phonetik\u003c/i\u003e algorithm\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 318,col 9)",
        "(line 320,col 9)-(line 320,col 32)",
        "(line 322,col 9)-(line 322,col 86)",
        "(line 323,col 9)-(line 323,col 84)",
        "(line 325,col 9)-(line 325,col 22)",
        "(line 327,col 9)-(line 327,col 28)",
        "(line 328,col 9)-(line 328,col 28)",
        "(line 329,col 9)-(line 329,col 18)",
        "(line 330,col 9)-(line 330,col 17)",
        "(line 332,col 9)-(line 332,col 41)",
        "(line 334,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 397,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.encode(java.lang.Object)",
      "begin_line": 400,
      "end_line": 410,
      "comment": "",
      "child_ranges": [
        "(line 402,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 409,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.encode(java.lang.String)",
      "begin_line": 412,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.isEncodeEqual(java.lang.String, java.lang.String)",
      "begin_line": 417,
      "end_line": 419,
      "comment": "",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.preprocess(java.lang.String)",
      "begin_line": 424,
      "end_line": 440,
      "comment": "\n     * Converts the string to upper case and replaces germanic characters as defined in {@link #PREPROCESS_MAP}.\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 47)",
        "(line 427,col 9)-(line 427,col 47)",
        "(line 429,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 439,col 32)"
      ]
    }
  ]
}