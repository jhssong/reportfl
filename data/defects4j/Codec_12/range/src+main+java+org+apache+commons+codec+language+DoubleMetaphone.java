{
  "filepath": "/tmp/Codec-12b/src/main/java/org/apache/commons/codec/language/DoubleMetaphone.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DoubleMetaphone",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.codec.StringEncoder"
      ],
      "begin_line": 33,
      "end_line": 1101,
      "comment": "\n * Encodes a string into a double metaphone value.\n * This Implementation is based on the algorithm by \u003cCITE\u003eLawrence Philips\u003c/CITE\u003e.\n *\n * @see \u003ca href\u003d\"http://drdobbs.com/184401251?pgno\u003d2\"\u003eOriginal Article\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Metaphone\"\u003ehttp://en.wikipedia.org/wiki/Metaphone\u003c/a\u003e\n *\n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "VOWELS"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * \"Vowels\" to test for\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SILENT_START"
      ],
      "begin_line": 43,
      "end_line": 44,
      "comment": "\n     * Prefixes when present which are not pronounced\n     "
    },
    {
      "type": "field",
      "varNames": [
        "L_R_N_M_B_H_F_V_W_SPACE"
      ],
      "begin_line": 45,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER"
      ],
      "begin_line": 47,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "L_T_K_S_N_M_B_Z"
      ],
      "begin_line": 49,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxCodeLen"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * Maximum length of an encoding, default is 4\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphone()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Creates an instance of this DoubleMetaphone encoder\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.doubleMetaphone(java.lang.String)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Encode a value with Double Metaphone\n     *\n     * @param value String to encode\n     * @return an encoded string\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.doubleMetaphone(java.lang.String, boolean)",
      "begin_line": 82,
      "end_line": 187,
      "comment": "\n     * Encode a value with Double Metaphone, optionally using the alternate\n     * encoding.\n     *\n     * @param value String to encode\n     * @param alternate use alternate encode\n     * @return an encoded string\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 34)",
        "(line 84,col 9)-(line 86,col 9)",
        "(line 88,col 9)-(line 88,col 55)",
        "(line 89,col 9)-(line 89,col 49)",
        "(line 91,col 9)-(line 91,col 87)",
        "(line 93,col 9)-(line 184,col 9)",
        "(line 186,col 9)-(line 186,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.encode(java.lang.Object)",
      "begin_line": 197,
      "end_line": 202,
      "comment": "\n     * Encode the value using DoubleMetaphone.  It will only work if \n     * \u003ccode\u003eobj\u003c/code\u003e is a \u003ccode\u003eString\u003c/code\u003e (like \u003ccode\u003eMetaphone\u003c/code\u003e).\n     *\n     * @param obj Object to encode (should be of type String)\n     * @return An encoded Object (will be of type String)\n     * @throws EncoderException encode parameter is not of type String\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 201,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.encode(java.lang.String)",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\n     * Encode the value using DoubleMetaphone.\n     *\n     * @param value String to encode\n     * @return An encoded String\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual(java.lang.String, java.lang.String)",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n     * Check if the Double Metaphone values of two \u003ccode\u003eString\u003c/code\u003e values\n     * are equal.\n     * \n     * @param value1 The left-hand side of the encoded {@link String#equals(Object)}.\n     * @param value2 The right-hand side of the encoded {@link String#equals(Object)}.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the encoded \u003ccode\u003eString\u003c/code\u003es are equal;\n     *          \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     * @see #isDoubleMetaphoneEqual(String,String,boolean)\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.isDoubleMetaphoneEqual(java.lang.String, java.lang.String, boolean)",
      "begin_line": 238,
      "end_line": 243,
      "comment": "\n     * Check if the Double Metaphone values of two \u003ccode\u003eString\u003c/code\u003e values\n     * are equal, optionally using the alternate value.\n     * \n     * @param value1 The left-hand side of the encoded {@link String#equals(Object)}.\n     * @param value2 The right-hand side of the encoded {@link String#equals(Object)}.\n     * @param alternate use the alternate value if \u003ccode\u003etrue\u003c/code\u003e.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the encoded \u003ccode\u003eString\u003c/code\u003es are equal;\n     *          \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 242,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.getMaxCodeLen()",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n     * Returns the maxCodeLen.\n     * @return int\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.setMaxCodeLen(int)",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\n     * Sets the maxCodeLen.\n     * @param maxCodeLen The maxCodeLen to set\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleAEIOUY(org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 266,
      "end_line": 272,
      "comment": "\n     * Handles \u0027A\u0027, \u0027E\u0027, \u0027I\u0027, \u0027O\u0027, \u0027U\u0027, and \u0027Y\u0027 cases\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 277,
      "end_line": 326,
      "comment": "\n     * Handles \u0027C\u0027 cases\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 323,col 9)",
        "(line 325,col 9)-(line 325,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleCC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 331,
      "end_line": 352,
      "comment": "\n     * Handles \u0027CC\u0027 cases\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 349,col 9)",
        "(line 351,col 9)-(line 351,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleCH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 357,
      "end_line": 383,
      "comment": "\n     * Handles \u0027CH\u0027 cases\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 382,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleD(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 388,
      "end_line": 409,
      "comment": "\n     * Handles \u0027D\u0027 cases\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 408,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleG(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int, boolean)",
      "begin_line": 414,
      "end_line": 465,
      "comment": "\n     * Handles \u0027G\u0027 cases\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 463,col 9)",
        "(line 464,col 9)-(line 464,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleGH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 470,
      "end_line": 499,
      "comment": "\n     * Handles \u0027GH\u0027 cases\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 498,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleH(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 504,
      "end_line": 517,
      "comment": "\n     * Handles \u0027H\u0027 cases\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 515,col 9)",
        "(line 516,col 9)-(line 516,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleJ(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int, boolean)",
      "begin_line": 522,
      "end_line": 552,
      "comment": "\n     * Handles \u0027J\u0027 cases\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 550,col 13)",
        "(line 551,col 9)-(line 551,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleL(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 557,
      "end_line": 572,
      "comment": "\n     * Handles \u0027L\u0027 cases\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 570,col 9)",
        "(line 571,col 9)-(line 571,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleP(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 577,
      "end_line": 588,
      "comment": "\n     * Handles \u0027P\u0027 cases\n     ",
      "child_ranges": [
        "(line 580,col 9)-(line 586,col 9)",
        "(line 587,col 9)-(line 587,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleR(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int, boolean)",
      "begin_line": 593,
      "end_line": 605,
      "comment": "\n     * Handles \u0027R\u0027 cases\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 603,col 9)",
        "(line 604,col 9)-(line 604,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleS(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int, boolean)",
      "begin_line": 610,
      "end_line": 658,
      "comment": "\n     * Handles \u0027S\u0027 cases\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 656,col 9)",
        "(line 657,col 9)-(line 657,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleSC(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 663,
      "end_line": 690,
      "comment": "\n     * Handles \u0027SC\u0027 cases\n     ",
      "child_ranges": [
        "(line 666,col 9)-(line 688,col 9)",
        "(line 689,col 9)-(line 689,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleT(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 695,
      "end_line": 720,
      "comment": "\n     * Handles \u0027T\u0027 cases\n     ",
      "child_ranges": [
        "(line 698,col 9)-(line 718,col 9)",
        "(line 719,col 9)-(line 719,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleW(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 725,
      "end_line": 759,
      "comment": "\n     * Handles \u0027W\u0027 cases\n     ",
      "child_ranges": [
        "(line 728,col 9)-(line 757,col 9)",
        "(line 758,col 9)-(line 758,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleX(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int)",
      "begin_line": 764,
      "end_line": 780,
      "comment": "\n     * Handles \u0027X\u0027 cases\n     ",
      "child_ranges": [
        "(line 767,col 9)-(line 778,col 9)",
        "(line 779,col 9)-(line 779,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.handleZ(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult, int, boolean)",
      "begin_line": 785,
      "end_line": 800,
      "comment": "\n     * Handles \u0027Z\u0027 cases\n     ",
      "child_ranges": [
        "(line 787,col 9)-(line 798,col 9)",
        "(line 799,col 9)-(line 799,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.conditionC0(java.lang.String, int)",
      "begin_line": 807,
      "end_line": 821,
      "comment": "\n     * Complex condition 0 for \u0027C\u0027\n     ",
      "child_ranges": [
        "(line 808,col 9)-(line 820,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.conditionCH0(java.lang.String, int)",
      "begin_line": 826,
      "end_line": 837,
      "comment": "\n     * Complex condition 0 for \u0027CH\u0027\n     ",
      "child_ranges": [
        "(line 827,col 9)-(line 836,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.conditionCH1(java.lang.String, int)",
      "begin_line": 842,
      "end_line": 849,
      "comment": "\n     * Complex condition 1 for \u0027CH\u0027\n     ",
      "child_ranges": [
        "(line 843,col 9)-(line 848,col 111)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.conditionL0(java.lang.String, int)",
      "begin_line": 854,
      "end_line": 865,
      "comment": "\n     * Complex condition 0 for \u0027L\u0027\n     ",
      "child_ranges": [
        "(line 855,col 9)-(line 864,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.conditionM0(java.lang.String, int)",
      "begin_line": 870,
      "end_line": 877,
      "comment": "\n     * Complex condition 0 for \u0027M\u0027\n     ",
      "child_ranges": [
        "(line 871,col 9)-(line 873,col 9)",
        "(line 874,col 9)-(line 876,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.isSlavoGermanic(java.lang.String)",
      "begin_line": 885,
      "end_line": 888,
      "comment": "\n     * Determines whether or not a value is of slavo-germanic orgin. A value is\n     * of slavo-germanic origin if it contians any of \u0027W\u0027, \u0027K\u0027, \u0027CZ\u0027, or \u0027WITZ\u0027.\n     ",
      "child_ranges": [
        "(line 886,col 9)-(line 887,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.isVowel(char)",
      "begin_line": 893,
      "end_line": 895,
      "comment": "\n     * Determines whether or not a character is a vowel or not\n     ",
      "child_ranges": [
        "(line 894,col 9)-(line 894,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.isSilentStart(java.lang.String)",
      "begin_line": 902,
      "end_line": 911,
      "comment": "\n     * Determines whether or not the value starts with a silent letter.  It will\n     * return \u003ccode\u003etrue\u003c/code\u003e if the value starts with any of \u0027GN\u0027, \u0027KN\u0027,\n     * \u0027PN\u0027, \u0027WR\u0027 or \u0027PS\u0027.\n     ",
      "child_ranges": [
        "(line 903,col 9)-(line 903,col 31)",
        "(line 904,col 9)-(line 909,col 9)",
        "(line 910,col 9)-(line 910,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.cleanInput(java.lang.String)",
      "begin_line": 916,
      "end_line": 925,
      "comment": "\n     * Cleans the input\n     ",
      "child_ranges": [
        "(line 917,col 9)-(line 919,col 9)",
        "(line 920,col 9)-(line 920,col 29)",
        "(line 921,col 9)-(line 923,col 9)",
        "(line 924,col 9)-(line 924,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.charAt(java.lang.String, int)",
      "begin_line": 932,
      "end_line": 937,
      "comment": "\n     * Gets the character at index \u003ccode\u003eindex\u003c/code\u003e if available, otherwise\n     * it returns \u003ccode\u003eCharacter.MIN_VALUE\u003c/code\u003e so that there is some sort\n     * of a default\n     ",
      "child_ranges": [
        "(line 933,col 9)-(line 935,col 9)",
        "(line 936,col 9)-(line 936,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.contains(java.lang.String, int, int, java.lang.String)",
      "begin_line": 942,
      "end_line": 946,
      "comment": "\n     * Shortcut method with 1 criteria\n     ",
      "child_ranges": [
        "(line 944,col 9)-(line 945,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.contains(java.lang.String, int, int, java.lang.String, java.lang.String)",
      "begin_line": 951,
      "end_line": 955,
      "comment": "\n     * Shortcut method with 2 criteria\n     ",
      "child_ranges": [
        "(line 953,col 9)-(line 954,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.contains(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 960,
      "end_line": 965,
      "comment": "\n     * Shortcut method with 3 criteria\n     ",
      "child_ranges": [
        "(line 963,col 9)-(line 964,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.contains(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 970,
      "end_line": 976,
      "comment": "\n     * Shortcut method with 4 criteria\n     ",
      "child_ranges": [
        "(line 973,col 9)-(line 975,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.contains(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 981,
      "end_line": 988,
      "comment": "\n     * Shortcut method with 5 criteria\n     ",
      "child_ranges": [
        "(line 985,col 9)-(line 987,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.contains(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 993,
      "end_line": 1000,
      "comment": "\n     * Shortcut method with 6 criteria\n     ",
      "child_ranges": [
        "(line 997,col 9)-(line 999,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.contains(java.lang.String, int, int, java.lang.String[])",
      "begin_line": 1006,
      "end_line": 1020,
      "comment": "\n     * Determines whether \u003ccode\u003evalue\u003c/code\u003e contains any of the criteria starting at index \u003ccode\u003estart\u003c/code\u003e and\n     * matching up to length \u003ccode\u003elength\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1008,col 9)-(line 1008,col 31)",
        "(line 1009,col 9)-(line 1018,col 9)",
        "(line 1019,col 9)-(line 1019,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DoubleMetaphoneResult",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1028,
      "end_line": 1100,
      "comment": "\n     * Inner class for storing results, since there is the optional alternate\n     * encoding.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "primary"
      ],
      "begin_line": 1030,
      "end_line": 1030,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "alternate"
      ],
      "begin_line": 1031,
      "end_line": 1031,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxLength"
      ],
      "begin_line": 1032,
      "end_line": 1032,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.DoubleMetaphoneResult(int)",
      "begin_line": 1034,
      "end_line": 1036,
      "comment": "",
      "child_ranges": [
        "(line 1035,col 13)-(line 1035,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.append(char)",
      "begin_line": 1038,
      "end_line": 1041,
      "comment": "",
      "child_ranges": [
        "(line 1039,col 13)-(line 1039,col 33)",
        "(line 1040,col 13)-(line 1040,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.append(char, char)",
      "begin_line": 1043,
      "end_line": 1046,
      "comment": "",
      "child_ranges": [
        "(line 1044,col 13)-(line 1044,col 35)",
        "(line 1045,col 13)-(line 1045,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.appendPrimary(char)",
      "begin_line": 1048,
      "end_line": 1052,
      "comment": "",
      "child_ranges": [
        "(line 1049,col 13)-(line 1051,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.appendAlternate(char)",
      "begin_line": 1054,
      "end_line": 1058,
      "comment": "",
      "child_ranges": [
        "(line 1055,col 13)-(line 1057,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.append(java.lang.String)",
      "begin_line": 1060,
      "end_line": 1063,
      "comment": "",
      "child_ranges": [
        "(line 1061,col 13)-(line 1061,col 33)",
        "(line 1062,col 13)-(line 1062,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.append(java.lang.String, java.lang.String)",
      "begin_line": 1065,
      "end_line": 1068,
      "comment": "",
      "child_ranges": [
        "(line 1066,col 13)-(line 1066,col 35)",
        "(line 1067,col 13)-(line 1067,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.appendPrimary(java.lang.String)",
      "begin_line": 1070,
      "end_line": 1077,
      "comment": "",
      "child_ranges": [
        "(line 1071,col 13)-(line 1071,col 66)",
        "(line 1072,col 13)-(line 1076,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.appendAlternate(java.lang.String)",
      "begin_line": 1079,
      "end_line": 1086,
      "comment": "",
      "child_ranges": [
        "(line 1080,col 13)-(line 1080,col 68)",
        "(line 1081,col 13)-(line 1085,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.getPrimary()",
      "begin_line": 1088,
      "end_line": 1090,
      "comment": "",
      "child_ranges": [
        "(line 1089,col 13)-(line 1089,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.getAlternate()",
      "begin_line": 1092,
      "end_line": 1094,
      "comment": "",
      "child_ranges": [
        "(line 1093,col 13)-(line 1093,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult.isComplete()",
      "begin_line": 1096,
      "end_line": 1099,
      "comment": "",
      "child_ranges": [
        "(line 1097,col 13)-(line 1098,col 58)"
      ]
    }
  ]
}