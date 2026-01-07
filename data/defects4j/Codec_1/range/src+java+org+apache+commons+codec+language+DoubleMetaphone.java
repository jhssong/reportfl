{
  "filepath": "/tmp/Codec-1b/src/java/org/apache/commons/codec/language/DoubleMetaphone.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DoubleMetaphone",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.StringEncoder"
      ],
      "begin_line": 37,
      "end_line": 1104,
      "comment": "\n * Encodes a string into a double metaphone value.\n * This Implementation is based on the algorithm by \u003cCITE\u003eLawrence Philips\u003c/CITE\u003e.\n * \u003cul\u003e\n * \u003cli\u003eOriginal Article: \u003ca \n * href\u003d\"http://www.cuj.com/documents/s\u003d8038/cuj0006philips/\"\u003e\n * http://www.cuj.com/documents/s\u003d8038/cuj0006philips/\u003c/a\u003e\u003c/li\u003e\n * \u003cli\u003eOriginal Source Code: \u003ca href\u003d\"ftp://ftp.cuj.com/pub/2000/1806/philips.zip\"\u003e\n * ftp://ftp.cuj.com/pub/2000/1806/philips.zip\u003c/a\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n * \n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "VOWELS"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * \"Vowels\" to test for\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SILENT_START"
      ],
      "begin_line": 47,
      "end_line": 48,
      "comment": "\n     * Prefixes when present which are not pronounced\n     "
    },
    {
      "type": "field",
      "varNames": [
        "L_R_N_M_B_H_F_V_W_SPACE"
      ],
      "begin_line": 49,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER"
      ],
      "begin_line": 51,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "L_T_K_S_N_M_B_Z"
      ],
      "begin_line": 53,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxCodeLen"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Maximum length of an encoding, default is 4\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphone()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Creates an instance of this DoubleMetaphone encoder\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.doubleMetaphone(java.lang.String)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Encode a value with Double Metaphone\n     *\n     * @param value String to encode\n     * @return an encoded string\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.doubleMetaphone(java.lang.String, boolean)",
      "begin_line": 86,
      "end_line": 191,
      "comment": "\n     * Encode a value with Double Metaphone, optionally using the alternate\n     * encoding.\n     *\n     * @param value String to encode\n     * @param alternate use alternate encode\n     * @return an encoded string\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 34)",
        "(line 88,col 9)-(line 90,col 9)",
        "(line 92,col 9)-(line 92,col 55)",
        "(line 93,col 9)-(line 93,col 49)",
        "(line 95,col 9)-(line 95,col 87)",
        "(line 97,col 9)-(line 188,col 9)",
        "(line 190,col 9)-(line 190,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.encode(java.lang.Object)",
      "begin_line": 201,
      "end_line": 206,
      "comment": "\n     * Encode the value using DoubleMetaphone.  It will only work if \n     * \u003ccode\u003eobj\u003c/code\u003e is a \u003ccode\u003eString\u003c/code\u003e (like \u003ccode\u003eMetaphone\u003c/code\u003e).\n     *\n     * @param obj Object to encode (should be of type String)\n     * @return An encoded Object (will be of type String)\n     * @throws EncoderException encode parameter is not of type String\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 205,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.encode(java.lang.String)",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * Encode the value using DoubleMetaphone.\n     *\n     * @param value String to encode\n     * @return An encoded String\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual(java.lang.String, java.lang.String)",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\n     * Check if the Double Metaphone values of two \u003ccode\u003eString\u003c/code\u003e values\n     * are equal.\n     * \n     * @param value1 The left-hand side of the encoded {@link String#equals(Object)}.\n     * @param value2 The right-hand side of the encoded {@link String#equals(Object)}.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the encoded \u003ccode\u003eString\u003c/code\u003es are equal;\n     *          \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     * @see #isDoubleMetaphoneEqual(String,String,boolean)\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual(java.lang.String, java.lang.String, boolean)",
      "begin_line": 242,
      "end_line": 247,
      "comment": "\n     * Check if the Double Metaphone values of two \u003ccode\u003eString\u003c/code\u003e values\n     * are equal, optionally using the alternate value.\n     * \n     * @param value1 The left-hand side of the encoded {@link String#equals(Object)}.\n     * @param value2 The right-hand side of the encoded {@link String#equals(Object)}.\n     * @param alternate use the alternate value if \u003ccode\u003etrue\u003c/code\u003e.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the encoded \u003ccode\u003eString\u003c/code\u003es are equal;\n     *          \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 246,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.getMaxCodeLen()",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\n     * Returns the maxCodeLen.\n     * @return int\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.setMaxCodeLen(int)",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\n     * Sets the maxCodeLen.\n     * @param maxCodeLen The maxCodeLen to set\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleAEIOUY(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 270,
      "end_line": 276,
      "comment": "\n     * Handles \u0027A\u0027, \u0027E\u0027, \u0027I\u0027, \u0027O\u0027, \u0027U\u0027, and \u0027Y\u0027 cases\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 281,
      "end_line": 330,
      "comment": "\n     * Handles \u0027C\u0027 cases\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 327,col 9)",
        "(line 329,col 9)-(line 329,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleCC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 335,
      "end_line": 356,
      "comment": "\n     * Handles \u0027CC\u0027 cases\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 353,col 9)",
        "(line 355,col 9)-(line 355,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleCH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 361,
      "end_line": 387,
      "comment": "\n     * Handles \u0027CH\u0027 cases\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 386,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleD(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 392,
      "end_line": 413,
      "comment": "\n     * Handles \u0027D\u0027 cases\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 412,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleG(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int, boolean)",
      "begin_line": 418,
      "end_line": 469,
      "comment": "\n     * Handles \u0027G\u0027 cases\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 467,col 9)",
        "(line 468,col 9)-(line 468,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleGH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 474,
      "end_line": 503,
      "comment": "\n     * Handles \u0027GH\u0027 cases\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 501,col 9)",
        "(line 502,col 9)-(line 502,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 508,
      "end_line": 521,
      "comment": "\n     * Handles \u0027H\u0027 cases\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 519,col 9)",
        "(line 520,col 9)-(line 520,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleJ(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int, boolean)",
      "begin_line": 526,
      "end_line": 556,
      "comment": "\n     * Handles \u0027J\u0027 cases\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 554,col 13)",
        "(line 555,col 9)-(line 555,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleL(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 561,
      "end_line": 574,
      "comment": "\n     * Handles \u0027L\u0027 cases\n     ",
      "child_ranges": [
        "(line 564,col 9)-(line 564,col 27)",
        "(line 565,col 9)-(line 572,col 9)",
        "(line 573,col 9)-(line 573,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleP(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 579,
      "end_line": 590,
      "comment": "\n     * Handles \u0027P\u0027 cases\n     ",
      "child_ranges": [
        "(line 582,col 9)-(line 588,col 9)",
        "(line 589,col 9)-(line 589,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleR(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int, boolean)",
      "begin_line": 595,
      "end_line": 607,
      "comment": "\n     * Handles \u0027R\u0027 cases\n     ",
      "child_ranges": [
        "(line 599,col 9)-(line 605,col 9)",
        "(line 606,col 9)-(line 606,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleS(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int, boolean)",
      "begin_line": 612,
      "end_line": 660,
      "comment": "\n     * Handles \u0027S\u0027 cases\n     ",
      "child_ranges": [
        "(line 616,col 9)-(line 658,col 9)",
        "(line 659,col 9)-(line 659,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleSC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 665,
      "end_line": 692,
      "comment": "\n     * Handles \u0027SC\u0027 cases\n     ",
      "child_ranges": [
        "(line 668,col 9)-(line 690,col 9)",
        "(line 691,col 9)-(line 691,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleT(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 697,
      "end_line": 722,
      "comment": "\n     * Handles \u0027T\u0027 cases\n     ",
      "child_ranges": [
        "(line 700,col 9)-(line 720,col 9)",
        "(line 721,col 9)-(line 721,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleW(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 727,
      "end_line": 761,
      "comment": "\n     * Handles \u0027W\u0027 cases\n     ",
      "child_ranges": [
        "(line 730,col 9)-(line 759,col 9)",
        "(line 760,col 9)-(line 760,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleX(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 766,
      "end_line": 782,
      "comment": "\n     * Handles \u0027X\u0027 cases\n     ",
      "child_ranges": [
        "(line 769,col 9)-(line 780,col 9)",
        "(line 781,col 9)-(line 781,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleZ(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int, boolean)",
      "begin_line": 787,
      "end_line": 802,
      "comment": "\n     * Handles \u0027Z\u0027 cases\n     ",
      "child_ranges": [
        "(line 789,col 9)-(line 800,col 9)",
        "(line 801,col 9)-(line 801,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.conditionC0(java.lang.String, int)",
      "begin_line": 809,
      "end_line": 823,
      "comment": "\n     * Complex condition 0 for \u0027C\u0027\n     ",
      "child_ranges": [
        "(line 810,col 3)-(line 822,col 3)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.conditionCH0(java.lang.String, int)",
      "begin_line": 828,
      "end_line": 839,
      "comment": "\n\t * Complex condition 0 for \u0027CH\u0027\n\t ",
      "child_ranges": [
        "(line 829,col 9)-(line 838,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.conditionCH1(java.lang.String, int)",
      "begin_line": 844,
      "end_line": 851,
      "comment": "\n     * Complex condition 1 for \u0027CH\u0027\n     ",
      "child_ranges": [
        "(line 845,col 9)-(line 850,col 111)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.conditionL0(java.lang.String, int)",
      "begin_line": 856,
      "end_line": 867,
      "comment": "\n     * Complex condition 0 for \u0027L\u0027\n     ",
      "child_ranges": [
        "(line 857,col 9)-(line 866,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.conditionM0(java.lang.String, int)",
      "begin_line": 872,
      "end_line": 879,
      "comment": "\n     * Complex condition 0 for \u0027M\u0027\n     ",
      "child_ranges": [
        "(line 873,col 3)-(line 875,col 3)",
        "(line 876,col 3)-(line 878,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.isSlavoGermanic(java.lang.String)",
      "begin_line": 887,
      "end_line": 890,
      "comment": "\n\t * Determines whether or not a value is of slavo-germanic orgin. A value is\n\t * of slavo-germanic origin if it contians any of \u0027W\u0027, \u0027K\u0027, \u0027CZ\u0027, or \u0027WITZ\u0027.\n\t ",
      "child_ranges": [
        "(line 888,col 9)-(line 889,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.isVowel(char)",
      "begin_line": 895,
      "end_line": 897,
      "comment": "\n     * Determines whether or not a character is a vowel or not\n     ",
      "child_ranges": [
        "(line 896,col 9)-(line 896,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.isSilentStart(java.lang.String)",
      "begin_line": 904,
      "end_line": 913,
      "comment": "\n     * Determines whether or not the value starts with a silent letter.  It will\n     * return \u003ccode\u003etrue\u003c/code\u003e if the value starts with any of \u0027GN\u0027, \u0027KN\u0027,\n     * \u0027PN\u0027, \u0027WR\u0027 or \u0027PS\u0027.\n     ",
      "child_ranges": [
        "(line 905,col 9)-(line 905,col 31)",
        "(line 906,col 9)-(line 911,col 9)",
        "(line 912,col 9)-(line 912,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.cleanInput(java.lang.String)",
      "begin_line": 918,
      "end_line": 927,
      "comment": "\n     * Cleans the input\n     ",
      "child_ranges": [
        "(line 919,col 3)-(line 921,col 3)",
        "(line 922,col 3)-(line 922,col 23)",
        "(line 923,col 3)-(line 925,col 3)",
        "(line 926,col 3)-(line 926,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.charAt(java.lang.String, int)",
      "begin_line": 934,
      "end_line": 939,
      "comment": "\n\t * Gets the character at index \u003ccode\u003eindex\u003c/code\u003e if available, otherwise\n\t * it returns \u003ccode\u003eCharacter.MIN_VALUE\u003c/code\u003e so that there is some sort\n\t * of a default\n\t ",
      "child_ranges": [
        "(line 935,col 9)-(line 937,col 9)",
        "(line 938,col 9)-(line 938,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.contains(java.lang.String, int, int, java.lang.String)",
      "begin_line": 944,
      "end_line": 948,
      "comment": "\n     * Shortcut method with 1 criteria\n     ",
      "child_ranges": [
        "(line 946,col 9)-(line 947,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.contains(java.lang.String, int, int, java.lang.String, java.lang.String)",
      "begin_line": 953,
      "end_line": 957,
      "comment": "\n     * Shortcut method with 2 criteria\n     ",
      "child_ranges": [
        "(line 955,col 9)-(line 956,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.contains(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 962,
      "end_line": 967,
      "comment": "\n     * Shortcut method with 3 criteria\n     ",
      "child_ranges": [
        "(line 965,col 9)-(line 966,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.contains(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 972,
      "end_line": 978,
      "comment": "\n     * Shortcut method with 4 criteria\n     ",
      "child_ranges": [
        "(line 975,col 9)-(line 977,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.contains(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 983,
      "end_line": 990,
      "comment": "\n     * Shortcut method with 5 criteria\n     ",
      "child_ranges": [
        "(line 987,col 9)-(line 989,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.contains(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 995,
      "end_line": 1002,
      "comment": "\n     * Shortcut method with 6 criteria\n     ",
      "child_ranges": [
        "(line 999,col 9)-(line 1001,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.contains(java.lang.String, int, int, java.lang.String[])",
      "begin_line": 1009,
      "end_line": 1023,
      "comment": "\n     * Determines whether \u003ccode\u003evalue\u003c/code\u003e contains any of the criteria \n     starting\n     * at index \u003ccode\u003estart\u003c/code\u003e and matching up to length \u003ccode\u003elength\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1011,col 9)-(line 1011,col 31)",
        "(line 1012,col 9)-(line 1021,col 9)",
        "(line 1022,col 9)-(line 1022,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DoubleMetaphoneResult",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1031,
      "end_line": 1103,
      "comment": "\n     * Inner class for storing results, since there is the optional alternate\n     * encoding.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "primary"
      ],
      "begin_line": 1033,
      "end_line": 1033,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "alternate"
      ],
      "begin_line": 1034,
      "end_line": 1034,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxLength"
      ],
      "begin_line": 1035,
      "end_line": 1035,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.DoubleMetaphoneResult(int)",
      "begin_line": 1037,
      "end_line": 1039,
      "comment": "",
      "child_ranges": [
        "(line 1038,col 13)-(line 1038,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.append(char)",
      "begin_line": 1041,
      "end_line": 1044,
      "comment": "",
      "child_ranges": [
        "(line 1042,col 13)-(line 1042,col 33)",
        "(line 1043,col 13)-(line 1043,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.append(char, char)",
      "begin_line": 1046,
      "end_line": 1049,
      "comment": "",
      "child_ranges": [
        "(line 1047,col 13)-(line 1047,col 35)",
        "(line 1048,col 13)-(line 1048,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.appendPrimary(char)",
      "begin_line": 1051,
      "end_line": 1055,
      "comment": "",
      "child_ranges": [
        "(line 1052,col 13)-(line 1054,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.appendAlternate(char)",
      "begin_line": 1057,
      "end_line": 1061,
      "comment": "",
      "child_ranges": [
        "(line 1058,col 13)-(line 1060,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.append(java.lang.String)",
      "begin_line": 1063,
      "end_line": 1066,
      "comment": "",
      "child_ranges": [
        "(line 1064,col 13)-(line 1064,col 33)",
        "(line 1065,col 13)-(line 1065,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.append(java.lang.String, java.lang.String)",
      "begin_line": 1068,
      "end_line": 1071,
      "comment": "",
      "child_ranges": [
        "(line 1069,col 13)-(line 1069,col 35)",
        "(line 1070,col 13)-(line 1070,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.appendPrimary(java.lang.String)",
      "begin_line": 1073,
      "end_line": 1080,
      "comment": "",
      "child_ranges": [
        "(line 1074,col 13)-(line 1074,col 66)",
        "(line 1075,col 13)-(line 1079,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.appendAlternate(java.lang.String)",
      "begin_line": 1082,
      "end_line": 1089,
      "comment": "",
      "child_ranges": [
        "(line 1083,col 13)-(line 1083,col 68)",
        "(line 1084,col 13)-(line 1088,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.getPrimary()",
      "begin_line": 1091,
      "end_line": 1093,
      "comment": "",
      "child_ranges": [
        "(line 1092,col 13)-(line 1092,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.getAlternate()",
      "begin_line": 1095,
      "end_line": 1097,
      "comment": "",
      "child_ranges": [
        "(line 1096,col 13)-(line 1096,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.isComplete()",
      "begin_line": 1099,
      "end_line": 1102,
      "comment": "",
      "child_ranges": [
        "(line 1100,col 13)-(line 1101,col 58)"
      ]
    }
  ]
}