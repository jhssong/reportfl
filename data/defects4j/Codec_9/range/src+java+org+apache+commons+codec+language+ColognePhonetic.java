{
  "filepath": "/tmp/Codec-9b/src/java/org/apache/commons/codec/language/ColognePhonetic.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ColognePhonetic",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.StringEncoder"
      ],
      "begin_line": 181,
      "end_line": 428,
      "comment": "\n * \u003cp\u003e\n * Implements of the \u003ca href\u003d\"http://de.wikipedia.org/wiki/K%C3%B6lner_Phonetik\"\u003e“Kölner Phonetic”\u003c/a\u003e (cologne\n * phonetic) algorithm issued by Hans Joachim Postel in 1969.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * The \u003ci\u003eKölner Phonetik\u003c/i\u003e is a phonetic algorithm which is optimized for the German language. It is related to the\n * well-known soundex algorithm.\n * \u003c/p\u003e\n * \n * \u003ch2\u003eAlgorithm\u003c/h2\u003e\n * \n * \u003cul\u003e\n * \n * \u003cli\u003e\n * \u003ch3\u003eFirst step:\u003c/h3\u003e\n * After a preprocessing (convertion to upper case, transcription of \u003ca\n * href\u003d\"http://en.wikipedia.org/wiki/Germanic_umlaut\"\u003egermanic umlauts\u003c/a\u003e, removal of non alphabetical characters) the\n * letters of the supplied text are replaced by their phonetic code according to the folowing table.\n * \u003ctable border\u003d\"1\"\u003e\n * \u003ctbody\u003e\n * \u003ctr\u003e\n * \u003cth\u003eLetter\u003c/th\u003e\n * \u003cth\u003eContext\u003c/th\u003e\n * \u003cth align\u003d\"center\"\u003eCode\u003c/th\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eA, E, I, J, O, U, Y\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd align\u003d\"center\"\u003e0\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \n * \u003ctd\u003eH\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd align\u003d\"center\"\u003e-\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eB\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd rowspan\u003d\"2\" align\u003d\"center\"\u003e1\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eP\u003c/td\u003e\n * \u003ctd\u003enot before H\u003c/td\u003e\n * \n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eD, T\u003c/td\u003e\n * \u003ctd\u003enot before C, S, Z\u003c/td\u003e\n * \u003ctd align\u003d\"center\"\u003e2\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eF, V, W\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd rowspan\u003d\"2\" align\u003d\"center\"\u003e3\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \n * \u003ctd\u003eP\u003c/td\u003e\n * \u003ctd\u003ebefore H\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eG, K, Q\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd rowspan\u003d\"3\" align\u003d\"center\"\u003e4\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd rowspan\u003d\"2\"\u003eC\u003c/td\u003e\n * \u003ctd\u003eat onset before A, H, K, L, O, Q, R, U, X\u003c/td\u003e\n * \n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003ebefore A, H, K, O, Q, U, X except after S, Z\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eX\u003c/td\u003e\n * \u003ctd\u003enot after C, K, Q\u003c/td\u003e\n * \u003ctd align\u003d\"center\"\u003e48\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eL\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \n * \u003ctd align\u003d\"center\"\u003e5\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eM, N\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd align\u003d\"center\"\u003e6\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eR\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd align\u003d\"center\"\u003e7\u003c/td\u003e\n * \u003c/tr\u003e\n * \n * \u003ctr\u003e\n * \u003ctd\u003eS, Z\u003c/td\u003e\n * \u003ctd\u003e\u003c/td\u003e\n * \u003ctd rowspan\u003d\"6\" align\u003d\"center\"\u003e8\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd rowspan\u003d\"3\"\u003eC\u003c/td\u003e\n * \u003ctd\u003eafter S, Z\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eat onset except before A, H, K, L, O, Q, R, U, X\u003c/td\u003e\n * \u003c/tr\u003e\n * \n * \u003ctr\u003e\n * \u003ctd\u003enot before A, H, K, O, Q, U, X\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eD, T\u003c/td\u003e\n * \u003ctd\u003ebefore C, S, Z\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eX\u003c/td\u003e\n * \u003ctd\u003eafter C, K, Q\u003c/td\u003e\n * \u003c/tr\u003e\n * \u003c/tbody\u003e\n * \u003c/table\u003e\n * \u003cp\u003e\n * \u003csmall\u003e\u003ci\u003e(Source: \u003ca href\u003d \"http://de.wikipedia.org/wiki/K%C3%B6lner_Phonetik#Buchstabencodes\" \u003eWikipedia (de):\n * Kölner Phonetik – Buchstabencodes\u003c/a\u003e)\u003c/i\u003e\u003c/small\u003e\n * \u003c/p\u003e\n * \n * \u003ch4\u003eExample:\u003c/h4\u003e\n * \n * {@code \"Müller-Lüdenscheidt\" \u003d\u003e \"MULLERLUDENSCHEIDT\" \u003d\u003e \"6005507500206880022\"}\n * \n * \u003c/li\u003e\n * \n * \u003cli\u003e\n * \u003ch3\u003eSecond step:\u003c/h3\u003e\n * Removal of all doubly codes.\n * \u003ch4\u003eExample:\u003c/h4\u003e\n * {@code \"6005507500206880022\" \u003d\u003e \"6050750206802\"}\u003c/li\u003e\n * \n * \u003cli\u003e\n * \u003ch3\u003eThird step:\u003c/h3\u003e\n * Removal of all codes “0” except at the beginning\n * \n * \u003ch4\u003eExample:\u003c/h4\u003e\n * {@code \"6050750206802\" \u003d\u003e \"65752682\"}\u003c/li\u003e\n * \n * \u003c/ul\u003e\n * \n * @see \u003ca href\u003d\"http://de.wikipedia.org/wiki/K%C3%B6lner_Phonetik\"\u003e\u003cspan\n *      style\u003d\"font-variant:small-caps\"\u003eWikipedia\u003c/span\u003e (de): \u003ci\u003eKölner Phonetik\u003c/i\u003e\u003c/a\u003e (a German description of the\n *      algorithm and more sources)\n * @author Apache Software Foundation\n * @since 1.5\n "
    },
    {
      "type": "class_interface",
      "name": "CologneBuffer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 183,
      "end_line": 208,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "length"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneBuffer.CologneBuffer(char[])",
      "begin_line": 189,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 190,col 13)-(line 190,col 29)",
        "(line 191,col 13)-(line 191,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneBuffer.CologneBuffer(int)",
      "begin_line": 194,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 195,col 13)-(line 195,col 43)",
        "(line 196,col 13)-(line 196,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneBuffer.copyData(int, int)",
      "begin_line": 199,
      "end_line": 199,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneBuffer.length()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 202,col 13)-(line 202,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneBuffer.toString()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 206,col 13)-(line 206,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CologneLeftBuffer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.language.ColognePhonetic.CologneBuffer"
      ],
      "begin_line": 210,
      "end_line": 226,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneLeftBuffer.CologneLeftBuffer(int)",
      "begin_line": 212,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 213,col 13)-(line 213,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneLeftBuffer.addRight(char)",
      "begin_line": 216,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 217,col 13)-(line 217,col 31)",
        "(line 218,col 13)-(line 218,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneLeftBuffer.copyData(int, int)",
      "begin_line": 221,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 222,col 13)-(line 222,col 46)",
        "(line 223,col 13)-(line 223,col 62)",
        "(line 224,col 13)-(line 224,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CologneRightBuffer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.language.ColognePhonetic.CologneBuffer"
      ],
      "begin_line": 228,
      "end_line": 258,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneRightBuffer.CologneRightBuffer(char[])",
      "begin_line": 230,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 231,col 13)-(line 231,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneRightBuffer.addLeft(char)",
      "begin_line": 234,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 235,col 13)-(line 235,col 21)",
        "(line 236,col 13)-(line 236,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneRightBuffer.copyData(int, int)",
      "begin_line": 239,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 240,col 13)-(line 240,col 46)",
        "(line 241,col 13)-(line 241,col 90)",
        "(line 242,col 13)-(line 242,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneRightBuffer.getNextChar()",
      "begin_line": 245,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 246,col 13)-(line 246,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneRightBuffer.getNextPos()",
      "begin_line": 249,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 250,col 13)-(line 250,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.CologneRightBuffer.removeNext()",
      "begin_line": 253,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 254,col 13)-(line 254,col 36)",
        "(line 255,col 13)-(line 255,col 21)",
        "(line 256,col 13)-(line 256,col 22)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "PRE_REPLACEMENTS"
      ],
      "begin_line": 260,
      "end_line": 265,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.arrayContains(char[], char)",
      "begin_line": 270,
      "end_line": 277,
      "comment": "\n     * Returns whether the array contains the key, or not.\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 276,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.colognePhonetic(java.lang.String)",
      "begin_line": 293,
      "end_line": 383,
      "comment": "\n     * \u003cp\u003e\n     * \u003cb\u003ecolognePhonetic()\u003c/b\u003e is the actual implementations of the \u003ci\u003eKölner\n     * Phonetik\u003c/i\u003e algorithm.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * In contrast to the initial description of the algorithm, this\n     * implementation does the encoding in one pass.\n     * \u003c/p\u003e\n     * \n     * @param text\n     * @return the corresponding encoding according to the \u003ci\u003eKölner\n     *         Phonetik\u003c/i\u003e algorithm\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 296,col 9)",
        "(line 298,col 9)-(line 298,col 32)",
        "(line 300,col 9)-(line 300,col 74)",
        "(line 301,col 9)-(line 301,col 78)",
        "(line 303,col 9)-(line 303,col 22)",
        "(line 305,col 9)-(line 305,col 28)",
        "(line 306,col 9)-(line 306,col 28)",
        "(line 307,col 9)-(line 307,col 18)",
        "(line 308,col 9)-(line 308,col 17)",
        "(line 310,col 9)-(line 310,col 41)",
        "(line 312,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 382,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.encode(java.lang.Object)",
      "begin_line": 385,
      "end_line": 394,
      "comment": "",
      "child_ranges": [
        "(line 386,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 393,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.encode(java.lang.String)",
      "begin_line": 396,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.isCologneEqual(java.lang.String, java.lang.String)",
      "begin_line": 400,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.ColognePhonetic.preprocess(java.lang.String)",
      "begin_line": 408,
      "end_line": 427,
      "comment": "\n     * Converts the string to upper case and replaces germanic umlauts, and the\n     * “ß”.\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 47)",
        "(line 411,col 9)-(line 411,col 41)",
        "(line 413,col 9)-(line 422,col 9)",
        "(line 424,col 9)-(line 424,col 32)",
        "(line 426,col 9)-(line 426,col 20)"
      ]
    }
  ]
}