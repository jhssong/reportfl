{
  "filepath": "/tmp/Codec-17b/src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DoubleMetaphone",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.StringEncoder"
      ],
      "begin_line": 38,
      "end_line": 1009,
      "comment": "\n * Encodes a string into a double metaphone value. This Implementation is based on the algorithm by \u003cCITE\u003eLawrence\n * Philips\u003c/CITE\u003e.\n * \u003cp\u003e\n * This class is conditionally thread-safe. The instance field {@link #maxCodeLen} is mutable\n * {@link #setMaxCodeLen(int)} but is not volatile, and accesses are not synchronized. If an instance of the class is\n * shared between threads, the caller needs to ensure that suitable synchronization is used to ensure safe publication\n * of the value between threads, and must not invoke {@link #setMaxCodeLen(int)} after initial setup.\n *\n * @see \u003ca href\u003d\"http://drdobbs.com/184401251?pgno\u003d2\"\u003eOriginal Article\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Metaphone\"\u003ehttp://en.wikipedia.org/wiki/Metaphone\u003c/a\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "VOWELS"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * \"Vowels\" to test for\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SILENT_START"
      ],
      "begin_line": 48,
      "end_line": 49,
      "comment": "\n     * Prefixes when present which are not pronounced\n     "
    },
    {
      "type": "field",
      "varNames": [
        "L_R_N_M_B_H_F_V_W_SPACE"
      ],
      "begin_line": 50,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER"
      ],
      "begin_line": 52,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "L_T_K_S_N_M_B_Z"
      ],
      "begin_line": 54,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxCodeLen"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Maximum length of an encoding, default is 4\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphone()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Creates an instance of this DoubleMetaphone encoder\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.doubleMetaphone(java.lang.String)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Encode a value with Double Metaphone.\n     *\n     * @param value String to encode\n     * @return an encoded string\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.doubleMetaphone(java.lang.String, boolean)",
      "begin_line": 86,
      "end_line": 191,
      "comment": "\n     * Encode a value with Double Metaphone, optionally using the alternate encoding.\n     *\n     * @param value String to encode\n     * @param alternate use alternate encode\n     * @return an encoded string\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 34)",
        "(line 88,col 9)-(line 90,col 9)",
        "(line 92,col 9)-(line 92,col 61)",
        "(line 93,col 9)-(line 93,col 49)",
        "(line 95,col 9)-(line 95,col 93)",
        "(line 97,col 9)-(line 188,col 9)",
        "(line 190,col 9)-(line 190,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.encode(java.lang.Object)",
      "begin_line": 201,
      "end_line": 207,
      "comment": "\n     * Encode the value using DoubleMetaphone.  It will only work if\n     * \u003ccode\u003eobj\u003c/code\u003e is a \u003ccode\u003eString\u003c/code\u003e (like \u003ccode\u003eMetaphone\u003c/code\u003e).\n     *\n     * @param obj Object to encode (should be of type String)\n     * @return An encoded Object (will be of type String)\n     * @throws EncoderException encode parameter is not of type String\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 206,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.encode(java.lang.String)",
      "begin_line": 215,
      "end_line": 218,
      "comment": "\n     * Encode the value using DoubleMetaphone.\n     *\n     * @param value String to encode\n     * @return An encoded String\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual(java.lang.String, java.lang.String)",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\n     * Check if the Double Metaphone values of two \u003ccode\u003eString\u003c/code\u003e values\n     * are equal.\n     *\n     * @param value1 The left-hand side of the encoded {@link String#equals(Object)}.\n     * @param value2 The right-hand side of the encoded {@link String#equals(Object)}.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the encoded \u003ccode\u003eString\u003c/code\u003es are equal;\n     *          \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     * @see #isDoubleMetaphoneEqual(String,String,boolean)\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual(java.lang.String, java.lang.String, boolean)",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n     * Check if the Double Metaphone values of two \u003ccode\u003eString\u003c/code\u003e values\n     * are equal, optionally using the alternate value.\n     *\n     * @param value1 The left-hand side of the encoded {@link String#equals(Object)}.\n     * @param value2 The right-hand side of the encoded {@link String#equals(Object)}.\n     * @param alternate use the alternate value if \u003ccode\u003etrue\u003c/code\u003e.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the encoded \u003ccode\u003eString\u003c/code\u003es are equal;\n     *          \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 106)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.getMaxCodeLen()",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\n     * Returns the maxCodeLen.\n     * @return int\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.setMaxCodeLen(int)",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\n     * Sets the maxCodeLen.\n     * @param maxCodeLen The maxCodeLen to set\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleAEIOUY(org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 269,
      "end_line": 274,
      "comment": "\n     * Handles \u0027A\u0027, \u0027E\u0027, \u0027I\u0027, \u0027O\u0027, \u0027U\u0027, and \u0027Y\u0027 cases.\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 273,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 279,
      "end_line": 326,
      "comment": "\n     * Handles \u0027C\u0027 cases.\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 323,col 9)",
        "(line 325,col 9)-(line 325,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleCC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 331,
      "end_line": 350,
      "comment": "\n     * Handles \u0027CC\u0027 cases.\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 347,col 9)",
        "(line 349,col 9)-(line 349,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleCH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 355,
      "end_line": 379,
      "comment": "\n     * Handles \u0027CH\u0027 cases.\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 378,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleD(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 384,
      "end_line": 403,
      "comment": "\n     * Handles \u0027D\u0027 cases.\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 402,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleG(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int, boolean)",
      "begin_line": 408,
      "end_line": 461,
      "comment": "\n     * Handles \u0027G\u0027 cases.\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 459,col 9)",
        "(line 460,col 9)-(line 460,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleGH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 466,
      "end_line": 493,
      "comment": "\n     * Handles \u0027GH\u0027 cases.\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 491,col 9)",
        "(line 492,col 9)-(line 492,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 498,
      "end_line": 509,
      "comment": "\n     * Handles \u0027H\u0027 cases.\n     ",
      "child_ranges": [
        "(line 500,col 9)-(line 507,col 9)",
        "(line 508,col 9)-(line 508,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleJ(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int, boolean)",
      "begin_line": 514,
      "end_line": 545,
      "comment": "\n     * Handles \u0027J\u0027 cases.\n     ",
      "child_ranges": [
        "(line 516,col 9)-(line 543,col 13)",
        "(line 544,col 9)-(line 544,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleL(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 550,
      "end_line": 563,
      "comment": "\n     * Handles \u0027L\u0027 cases.\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 561,col 9)",
        "(line 562,col 9)-(line 562,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleP(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 568,
      "end_line": 577,
      "comment": "\n     * Handles \u0027P\u0027 cases.\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 575,col 9)",
        "(line 576,col 9)-(line 576,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleR(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int, boolean)",
      "begin_line": 582,
      "end_line": 592,
      "comment": "\n     * Handles \u0027R\u0027 cases.\n     ",
      "child_ranges": [
        "(line 584,col 9)-(line 590,col 9)",
        "(line 591,col 9)-(line 591,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleS(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int, boolean)",
      "begin_line": 597,
      "end_line": 642,
      "comment": "\n     * Handles \u0027S\u0027 cases.\n     ",
      "child_ranges": [
        "(line 599,col 9)-(line 640,col 9)",
        "(line 641,col 9)-(line 641,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleSC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 647,
      "end_line": 671,
      "comment": "\n     * Handles \u0027SC\u0027 cases.\n     ",
      "child_ranges": [
        "(line 648,col 9)-(line 669,col 9)",
        "(line 670,col 9)-(line 670,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleT(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 676,
      "end_line": 698,
      "comment": "\n     * Handles \u0027T\u0027 cases.\n     ",
      "child_ranges": [
        "(line 677,col 9)-(line 696,col 9)",
        "(line 697,col 9)-(line 697,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleW(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 703,
      "end_line": 734,
      "comment": "\n     * Handles \u0027W\u0027 cases.\n     ",
      "child_ranges": [
        "(line 704,col 9)-(line 732,col 9)",
        "(line 733,col 9)-(line 733,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleX(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 739,
      "end_line": 753,
      "comment": "\n     * Handles \u0027X\u0027 cases.\n     ",
      "child_ranges": [
        "(line 740,col 9)-(line 751,col 9)",
        "(line 752,col 9)-(line 752,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleZ(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int, boolean)",
      "begin_line": 758,
      "end_line": 774,
      "comment": "\n     * Handles \u0027Z\u0027 cases.\n     ",
      "child_ranges": [
        "(line 760,col 9)-(line 772,col 9)",
        "(line 773,col 9)-(line 773,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.conditionC0(java.lang.String, int)",
      "begin_line": 781,
      "end_line": 795,
      "comment": "\n     * Complex condition 0 for \u0027C\u0027.\n     ",
      "child_ranges": [
        "(line 782,col 9)-(line 794,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.conditionCH0(java.lang.String, int)",
      "begin_line": 800,
      "end_line": 811,
      "comment": "\n     * Complex condition 0 for \u0027CH\u0027.\n     ",
      "child_ranges": [
        "(line 801,col 9)-(line 810,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.conditionCH1(java.lang.String, int)",
      "begin_line": 816,
      "end_line": 822,
      "comment": "\n     * Complex condition 1 for \u0027CH\u0027.\n     ",
      "child_ranges": [
        "(line 817,col 9)-(line 821,col 111)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.conditionL0(java.lang.String, int)",
      "begin_line": 827,
      "end_line": 838,
      "comment": "\n     * Complex condition 0 for \u0027L\u0027.\n     ",
      "child_ranges": [
        "(line 828,col 9)-(line 837,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.conditionM0(java.lang.String, int)",
      "begin_line": 843,
      "end_line": 849,
      "comment": "\n     * Complex condition 0 for \u0027M\u0027.\n     ",
      "child_ranges": [
        "(line 844,col 9)-(line 846,col 9)",
        "(line 847,col 9)-(line 848,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.isSlavoGermanic(java.lang.String)",
      "begin_line": 857,
      "end_line": 860,
      "comment": "\n     * Determines whether or not a value is of slavo-germanic origin. A value is\n     * of slavo-germanic origin if it contians any of \u0027W\u0027, \u0027K\u0027, \u0027CZ\u0027, or \u0027WITZ\u0027.\n     ",
      "child_ranges": [
        "(line 858,col 9)-(line 859,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.isVowel(char)",
      "begin_line": 865,
      "end_line": 867,
      "comment": "\n     * Determines whether or not a character is a vowel or not\n     ",
      "child_ranges": [
        "(line 866,col 9)-(line 866,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.isSilentStart(java.lang.String)",
      "begin_line": 874,
      "end_line": 883,
      "comment": "\n     * Determines whether or not the value starts with a silent letter.  It will\n     * return \u003ccode\u003etrue\u003c/code\u003e if the value starts with any of \u0027GN\u0027, \u0027KN\u0027,\n     * \u0027PN\u0027, \u0027WR\u0027 or \u0027PS\u0027.\n     ",
      "child_ranges": [
        "(line 875,col 9)-(line 875,col 31)",
        "(line 876,col 9)-(line 881,col 9)",
        "(line 882,col 9)-(line 882,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.cleanInput(java.lang.String)",
      "begin_line": 888,
      "end_line": 897,
      "comment": "\n     * Cleans the input.\n     ",
      "child_ranges": [
        "(line 889,col 9)-(line 891,col 9)",
        "(line 892,col 9)-(line 892,col 29)",
        "(line 893,col 9)-(line 895,col 9)",
        "(line 896,col 9)-(line 896,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.charAt(java.lang.String, int)",
      "begin_line": 904,
      "end_line": 909,
      "comment": "\n     * Gets the character at index \u003ccode\u003eindex\u003c/code\u003e if available, otherwise\n     * it returns \u003ccode\u003eCharacter.MIN_VALUE\u003c/code\u003e so that there is some sort\n     * of a default.\n     ",
      "child_ranges": [
        "(line 905,col 9)-(line 907,col 9)",
        "(line 908,col 9)-(line 908,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.contains(java.lang.String, int, int, java.lang.String...)",
      "begin_line": 915,
      "end_line": 929,
      "comment": "\n     * Determines whether \u003ccode\u003evalue\u003c/code\u003e contains any of the criteria starting at index \u003ccode\u003estart\u003c/code\u003e and\n     * matching up to length \u003ccode\u003elength\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 917,col 9)-(line 917,col 31)",
        "(line 918,col 9)-(line 927,col 9)",
        "(line 928,col 9)-(line 928,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DoubleMetaphoneResult",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 936,
      "end_line": 1008,
      "comment": "\n     * Inner class for storing results, since there is the optional alternate encoding.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "primary"
      ],
      "begin_line": 938,
      "end_line": 938,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "alternate"
      ],
      "begin_line": 939,
      "end_line": 939,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxLength"
      ],
      "begin_line": 940,
      "end_line": 940,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.DoubleMetaphoneResult(int)",
      "begin_line": 942,
      "end_line": 944,
      "comment": "",
      "child_ranges": [
        "(line 943,col 13)-(line 943,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.append(char)",
      "begin_line": 946,
      "end_line": 949,
      "comment": "",
      "child_ranges": [
        "(line 947,col 13)-(line 947,col 33)",
        "(line 948,col 13)-(line 948,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.append(char, char)",
      "begin_line": 951,
      "end_line": 954,
      "comment": "",
      "child_ranges": [
        "(line 952,col 13)-(line 952,col 35)",
        "(line 953,col 13)-(line 953,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.appendPrimary(char)",
      "begin_line": 956,
      "end_line": 960,
      "comment": "",
      "child_ranges": [
        "(line 957,col 13)-(line 959,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.appendAlternate(char)",
      "begin_line": 962,
      "end_line": 966,
      "comment": "",
      "child_ranges": [
        "(line 963,col 13)-(line 965,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.append(java.lang.String)",
      "begin_line": 968,
      "end_line": 971,
      "comment": "",
      "child_ranges": [
        "(line 969,col 13)-(line 969,col 33)",
        "(line 970,col 13)-(line 970,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.append(java.lang.String, java.lang.String)",
      "begin_line": 973,
      "end_line": 976,
      "comment": "",
      "child_ranges": [
        "(line 974,col 13)-(line 974,col 35)",
        "(line 975,col 13)-(line 975,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.appendPrimary(java.lang.String)",
      "begin_line": 978,
      "end_line": 985,
      "comment": "",
      "child_ranges": [
        "(line 979,col 13)-(line 979,col 72)",
        "(line 980,col 13)-(line 984,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.appendAlternate(java.lang.String)",
      "begin_line": 987,
      "end_line": 994,
      "comment": "",
      "child_ranges": [
        "(line 988,col 13)-(line 988,col 74)",
        "(line 989,col 13)-(line 993,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.getPrimary()",
      "begin_line": 996,
      "end_line": 998,
      "comment": "",
      "child_ranges": [
        "(line 997,col 13)-(line 997,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.getAlternate()",
      "begin_line": 1000,
      "end_line": 1002,
      "comment": "",
      "child_ranges": [
        "(line 1001,col 13)-(line 1001,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.isComplete()",
      "begin_line": 1004,
      "end_line": 1007,
      "comment": "",
      "child_ranges": [
        "(line 1005,col 13)-(line 1006,col 61)"
      ]
    }
  ]
}