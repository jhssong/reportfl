{
  "filepath": "/tmp/Codec-13b/src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DoubleMetaphone",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.StringEncoder"
      ],
      "begin_line": 37,
      "end_line": 1008,
      "comment": "\n * Encodes a string into a double metaphone value. This Implementation is based on the algorithm by \u003cCITE\u003eLawrence\n * Philips\u003c/CITE\u003e.\n * \u003cp\u003e\n * This class is conditionally thread-safe. The instance field {@link #maxCodeLen} is mutable\n * {@link #setMaxCodeLen(int)} but is not volatile, and accesses are not synchronized. If an instance of the class is\n * shared between threads, the caller needs to ensure that suitable synchronization is used to ensure safe publication\n * of the value between threads, and must not invoke {@link #setMaxCodeLen(int)} after initial setup.\n *\n * @see \u003ca href\u003d\"http://drdobbs.com/184401251?pgno\u003d2\"\u003eOriginal Article\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Metaphone\"\u003ehttp://en.wikipedia.org/wiki/Metaphone\u003c/a\u003e\n *\n * @version $Id$\n "
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
      "comment": "\n     * Encode a value with Double Metaphone.\n     *\n     * @param value String to encode\n     * @return an encoded string\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.doubleMetaphone(java.lang.String, boolean)",
      "begin_line": 85,
      "end_line": 190,
      "comment": "\n     * Encode a value with Double Metaphone, optionally using the alternate encoding.\n     *\n     * @param value String to encode\n     * @param alternate use alternate encode\n     * @return an encoded string\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 34)",
        "(line 87,col 9)-(line 89,col 9)",
        "(line 91,col 9)-(line 91,col 61)",
        "(line 92,col 9)-(line 92,col 49)",
        "(line 94,col 9)-(line 94,col 93)",
        "(line 96,col 9)-(line 187,col 9)",
        "(line 189,col 9)-(line 189,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.encode(java.lang.Object)",
      "begin_line": 200,
      "end_line": 206,
      "comment": "\n     * Encode the value using DoubleMetaphone.  It will only work if\n     * \u003ccode\u003eobj\u003c/code\u003e is a \u003ccode\u003eString\u003c/code\u003e (like \u003ccode\u003eMetaphone\u003c/code\u003e).\n     *\n     * @param obj Object to encode (should be of type String)\n     * @return An encoded Object (will be of type String)\n     * @throws EncoderException encode parameter is not of type String\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 205,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.encode(java.lang.String)",
      "begin_line": 214,
      "end_line": 217,
      "comment": "\n     * Encode the value using DoubleMetaphone.\n     *\n     * @param value String to encode\n     * @return An encoded String\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual(java.lang.String, java.lang.String)",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n     * Check if the Double Metaphone values of two \u003ccode\u003eString\u003c/code\u003e values\n     * are equal.\n     *\n     * @param value1 The left-hand side of the encoded {@link String#equals(Object)}.\n     * @param value2 The right-hand side of the encoded {@link String#equals(Object)}.\n     * @return {@code true} if the encoded \u003ccode\u003eString\u003c/code\u003es are equal;\n     *          {@code false} otherwise.\n     * @see #isDoubleMetaphoneEqual(String,String,boolean)\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual(java.lang.String, java.lang.String, boolean)",
      "begin_line": 243,
      "end_line": 245,
      "comment": "\n     * Check if the Double Metaphone values of two \u003ccode\u003eString\u003c/code\u003e values\n     * are equal, optionally using the alternate value.\n     *\n     * @param value1 The left-hand side of the encoded {@link String#equals(Object)}.\n     * @param value2 The right-hand side of the encoded {@link String#equals(Object)}.\n     * @param alternate use the alternate value if {@code true}.\n     * @return {@code true} if the encoded \u003ccode\u003eString\u003c/code\u003es are equal;\n     *          {@code false} otherwise.\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.getMaxCodeLen()",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\n     * Returns the maxCodeLen.\n     * @return int\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.setMaxCodeLen(int)",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\n     * Sets the maxCodeLen.\n     * @param maxCodeLen The maxCodeLen to set\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleAEIOUY(org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 268,
      "end_line": 273,
      "comment": "\n     * Handles \u0027A\u0027, \u0027E\u0027, \u0027I\u0027, \u0027O\u0027, \u0027U\u0027, and \u0027Y\u0027 cases.\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 272,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 278,
      "end_line": 325,
      "comment": "\n     * Handles \u0027C\u0027 cases.\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 322,col 9)",
        "(line 324,col 9)-(line 324,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleCC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 330,
      "end_line": 349,
      "comment": "\n     * Handles \u0027CC\u0027 cases.\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 346,col 9)",
        "(line 348,col 9)-(line 348,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleCH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 354,
      "end_line": 378,
      "comment": "\n     * Handles \u0027CH\u0027 cases.\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 377,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleD(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 383,
      "end_line": 402,
      "comment": "\n     * Handles \u0027D\u0027 cases.\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 401,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleG(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int, boolean)",
      "begin_line": 407,
      "end_line": 460,
      "comment": "\n     * Handles \u0027G\u0027 cases.\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 458,col 9)",
        "(line 459,col 9)-(line 459,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleGH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 465,
      "end_line": 492,
      "comment": "\n     * Handles \u0027GH\u0027 cases.\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 490,col 9)",
        "(line 491,col 9)-(line 491,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 497,
      "end_line": 508,
      "comment": "\n     * Handles \u0027H\u0027 cases.\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 507,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleJ(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int, boolean)",
      "begin_line": 513,
      "end_line": 544,
      "comment": "\n     * Handles \u0027J\u0027 cases.\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 542,col 13)",
        "(line 543,col 9)-(line 543,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleL(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 549,
      "end_line": 562,
      "comment": "\n     * Handles \u0027L\u0027 cases.\n     ",
      "child_ranges": [
        "(line 550,col 9)-(line 560,col 9)",
        "(line 561,col 9)-(line 561,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleP(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 567,
      "end_line": 576,
      "comment": "\n     * Handles \u0027P\u0027 cases.\n     ",
      "child_ranges": [
        "(line 568,col 9)-(line 574,col 9)",
        "(line 575,col 9)-(line 575,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleR(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int, boolean)",
      "begin_line": 581,
      "end_line": 591,
      "comment": "\n     * Handles \u0027R\u0027 cases.\n     ",
      "child_ranges": [
        "(line 583,col 9)-(line 589,col 9)",
        "(line 590,col 9)-(line 590,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleS(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int, boolean)",
      "begin_line": 596,
      "end_line": 641,
      "comment": "\n     * Handles \u0027S\u0027 cases.\n     ",
      "child_ranges": [
        "(line 598,col 9)-(line 639,col 9)",
        "(line 640,col 9)-(line 640,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleSC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 646,
      "end_line": 670,
      "comment": "\n     * Handles \u0027SC\u0027 cases.\n     ",
      "child_ranges": [
        "(line 647,col 9)-(line 668,col 9)",
        "(line 669,col 9)-(line 669,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleT(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 675,
      "end_line": 697,
      "comment": "\n     * Handles \u0027T\u0027 cases.\n     ",
      "child_ranges": [
        "(line 676,col 9)-(line 695,col 9)",
        "(line 696,col 9)-(line 696,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleW(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 702,
      "end_line": 733,
      "comment": "\n     * Handles \u0027W\u0027 cases.\n     ",
      "child_ranges": [
        "(line 703,col 9)-(line 731,col 9)",
        "(line 732,col 9)-(line 732,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleX(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 738,
      "end_line": 752,
      "comment": "\n     * Handles \u0027X\u0027 cases.\n     ",
      "child_ranges": [
        "(line 739,col 9)-(line 750,col 9)",
        "(line 751,col 9)-(line 751,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleZ(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int, boolean)",
      "begin_line": 757,
      "end_line": 773,
      "comment": "\n     * Handles \u0027Z\u0027 cases.\n     ",
      "child_ranges": [
        "(line 759,col 9)-(line 771,col 9)",
        "(line 772,col 9)-(line 772,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.conditionC0(java.lang.String, int)",
      "begin_line": 780,
      "end_line": 794,
      "comment": "\n     * Complex condition 0 for \u0027C\u0027.\n     ",
      "child_ranges": [
        "(line 781,col 9)-(line 793,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.conditionCH0(java.lang.String, int)",
      "begin_line": 799,
      "end_line": 810,
      "comment": "\n     * Complex condition 0 for \u0027CH\u0027.\n     ",
      "child_ranges": [
        "(line 800,col 9)-(line 809,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.conditionCH1(java.lang.String, int)",
      "begin_line": 815,
      "end_line": 821,
      "comment": "\n     * Complex condition 1 for \u0027CH\u0027.\n     ",
      "child_ranges": [
        "(line 816,col 9)-(line 820,col 111)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.conditionL0(java.lang.String, int)",
      "begin_line": 826,
      "end_line": 837,
      "comment": "\n     * Complex condition 0 for \u0027L\u0027.\n     ",
      "child_ranges": [
        "(line 827,col 9)-(line 836,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.conditionM0(java.lang.String, int)",
      "begin_line": 842,
      "end_line": 848,
      "comment": "\n     * Complex condition 0 for \u0027M\u0027.\n     ",
      "child_ranges": [
        "(line 843,col 9)-(line 845,col 9)",
        "(line 846,col 9)-(line 847,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.isSlavoGermanic(java.lang.String)",
      "begin_line": 856,
      "end_line": 859,
      "comment": "\n     * Determines whether or not a value is of slavo-germanic origin. A value is\n     * of slavo-germanic origin if it contians any of \u0027W\u0027, \u0027K\u0027, \u0027CZ\u0027, or \u0027WITZ\u0027.\n     ",
      "child_ranges": [
        "(line 857,col 9)-(line 858,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.isVowel(char)",
      "begin_line": 864,
      "end_line": 866,
      "comment": "\n     * Determines whether or not a character is a vowel or not\n     ",
      "child_ranges": [
        "(line 865,col 9)-(line 865,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.isSilentStart(java.lang.String)",
      "begin_line": 873,
      "end_line": 882,
      "comment": "\n     * Determines whether or not the value starts with a silent letter.  It will\n     * return {@code true} if the value starts with any of \u0027GN\u0027, \u0027KN\u0027,\n     * \u0027PN\u0027, \u0027WR\u0027 or \u0027PS\u0027.\n     ",
      "child_ranges": [
        "(line 874,col 9)-(line 874,col 31)",
        "(line 875,col 9)-(line 880,col 9)",
        "(line 881,col 9)-(line 881,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.cleanInput(java.lang.String)",
      "begin_line": 887,
      "end_line": 896,
      "comment": "\n     * Cleans the input.\n     ",
      "child_ranges": [
        "(line 888,col 9)-(line 890,col 9)",
        "(line 891,col 9)-(line 891,col 29)",
        "(line 892,col 9)-(line 894,col 9)",
        "(line 895,col 9)-(line 895,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.charAt(java.lang.String, int)",
      "begin_line": 903,
      "end_line": 908,
      "comment": "\n     * Gets the character at index \u003ccode\u003eindex\u003c/code\u003e if available, otherwise\n     * it returns \u003ccode\u003eCharacter.MIN_VALUE\u003c/code\u003e so that there is some sort\n     * of a default.\n     ",
      "child_ranges": [
        "(line 904,col 9)-(line 906,col 9)",
        "(line 907,col 9)-(line 907,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.contains(java.lang.String, int, int, java.lang.String...)",
      "begin_line": 914,
      "end_line": 928,
      "comment": "\n     * Determines whether \u003ccode\u003evalue\u003c/code\u003e contains any of the criteria starting at index \u003ccode\u003estart\u003c/code\u003e and\n     * matching up to length \u003ccode\u003elength\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 916,col 9)-(line 916,col 31)",
        "(line 917,col 9)-(line 926,col 9)",
        "(line 927,col 9)-(line 927,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DoubleMetaphoneResult",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 935,
      "end_line": 1007,
      "comment": "\n     * Inner class for storing results, since there is the optional alternate encoding.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "primary"
      ],
      "begin_line": 937,
      "end_line": 937,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "alternate"
      ],
      "begin_line": 938,
      "end_line": 938,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxLength"
      ],
      "begin_line": 939,
      "end_line": 939,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.DoubleMetaphoneResult(int)",
      "begin_line": 941,
      "end_line": 943,
      "comment": "",
      "child_ranges": [
        "(line 942,col 13)-(line 942,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.append(char)",
      "begin_line": 945,
      "end_line": 948,
      "comment": "",
      "child_ranges": [
        "(line 946,col 13)-(line 946,col 33)",
        "(line 947,col 13)-(line 947,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.append(char, char)",
      "begin_line": 950,
      "end_line": 953,
      "comment": "",
      "child_ranges": [
        "(line 951,col 13)-(line 951,col 35)",
        "(line 952,col 13)-(line 952,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.appendPrimary(char)",
      "begin_line": 955,
      "end_line": 959,
      "comment": "",
      "child_ranges": [
        "(line 956,col 13)-(line 958,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.appendAlternate(char)",
      "begin_line": 961,
      "end_line": 965,
      "comment": "",
      "child_ranges": [
        "(line 962,col 13)-(line 964,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.append(java.lang.String)",
      "begin_line": 967,
      "end_line": 970,
      "comment": "",
      "child_ranges": [
        "(line 968,col 13)-(line 968,col 33)",
        "(line 969,col 13)-(line 969,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.append(java.lang.String, java.lang.String)",
      "begin_line": 972,
      "end_line": 975,
      "comment": "",
      "child_ranges": [
        "(line 973,col 13)-(line 973,col 35)",
        "(line 974,col 13)-(line 974,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.appendPrimary(java.lang.String)",
      "begin_line": 977,
      "end_line": 984,
      "comment": "",
      "child_ranges": [
        "(line 978,col 13)-(line 978,col 72)",
        "(line 979,col 13)-(line 983,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.appendAlternate(java.lang.String)",
      "begin_line": 986,
      "end_line": 993,
      "comment": "",
      "child_ranges": [
        "(line 987,col 13)-(line 987,col 74)",
        "(line 988,col 13)-(line 992,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.getPrimary()",
      "begin_line": 995,
      "end_line": 997,
      "comment": "",
      "child_ranges": [
        "(line 996,col 13)-(line 996,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.getAlternate()",
      "begin_line": 999,
      "end_line": 1001,
      "comment": "",
      "child_ranges": [
        "(line 1000,col 13)-(line 1000,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.isComplete()",
      "begin_line": 1003,
      "end_line": 1006,
      "comment": "",
      "child_ranges": [
        "(line 1004,col 13)-(line 1005,col 61)"
      ]
    }
  ]
}