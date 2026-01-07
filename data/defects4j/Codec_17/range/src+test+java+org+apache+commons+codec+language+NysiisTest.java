{
  "filepath": "/tmp/Codec-17b/src/test/java/org/apache/commons/codec/language/NysiisTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NysiisTest",
      "is_interface": false,
      "parent_types": [
        "StringEncoderAbstractTest\u003cNysiis\u003e"
      ],
      "begin_line": 31,
      "end_line": 303,
      "comment": "\n * Tests {@link Nysiis}\n *\n * @since 1.7\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "fullNysiis"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.assertEncodings(java.lang.String[]...)",
      "begin_line": 44,
      "end_line": 48,
      "comment": "\n     * Takes an array of String pairs where each pair\u0027s first element is the input and the second element the expected\n     * encoding.\n     *\n     * @param testValues\n     *            an array of String pairs where each pair\u0027s first element is the input and the second element the\n     *            expected encoding.\n     * @throws EncoderException\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 47,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.createStringEncoder()",
      "begin_line": 50,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.encodeAll(java.lang.String[], java.lang.String)",
      "begin_line": 55,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 58,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testBran()",
      "begin_line": 61,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testCap()",
      "begin_line": 66,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testDad()",
      "begin_line": 71,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testDan()",
      "begin_line": 78,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testDropBy()",
      "begin_line": 89,
      "end_line": 145,
      "comment": "\n     * Tests data gathered from around the internet.\n     *\n     * @see \u003ca href\u003d\"http://www.dropby.com/NYSIISTextStrings.html\"\u003ehttp://www.dropby.com/NYSIISTextStrings.html\u003c/a\u003e\n     * @throws EncoderException\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 144,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testFal()",
      "begin_line": 147,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testOthers()",
      "begin_line": 157,
      "end_line": 167,
      "comment": "\n     * Tests data gathered from around the internets.\n     *\n     * @throws EncoderException\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 166,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testRule1()",
      "begin_line": 174,
      "end_line": 183,
      "comment": "\n     * Tests rule 1: Translate first characters of name: MAC → MCC, KN → N, K → C, PH, PF → FF, SCH → SSS\n     *\n     * @throws EncoderException\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 182,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testRule2()",
      "begin_line": 190,
      "end_line": 200,
      "comment": "\n     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D\n     *\n     * @throws EncoderException\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 199,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testRule4Dot1()",
      "begin_line": 207,
      "end_line": 216,
      "comment": "\n     * Tests rule 4.1: EV → AF else A, E, I, O, U → A\n     *\n     * @throws EncoderException\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 215,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testRule4Dot2()",
      "begin_line": 223,
      "end_line": 229,
      "comment": "\n     * Tests rule 4.2: Q → G, Z → S, M → N\n     *\n     * @throws EncoderException\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 228,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testRule5()",
      "begin_line": 236,
      "end_line": 241,
      "comment": "\n     * Tests rule 5: If last character is S, remove it.\n     *\n     * @throws EncoderException\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 240,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testRule6()",
      "begin_line": 248,
      "end_line": 253,
      "comment": "\n     * Tests rule 6: If last characters are AY, replace with Y.\n     *\n     * @throws EncoderException\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 252,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testRule7()",
      "begin_line": 260,
      "end_line": 265,
      "comment": "\n     * Tests rule 7: If last character is A, remove it.\n     *\n     * @throws EncoderException\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 264,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testSnad()",
      "begin_line": 266,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testSnat()",
      "begin_line": 273,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testSpecialBranches()",
      "begin_line": 278,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 61)",
        "(line 281,col 9)-(line 281,col 59)",
        "(line 282,col 9)-(line 282,col 57)",
        "(line 283,col 9)-(line 283,col 55)",
        "(line 284,col 9)-(line 284,col 54)",
        "(line 285,col 9)-(line 285,col 53)",
        "(line 286,col 9)-(line 286,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testTranan()",
      "begin_line": 289,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testTrueVariant()",
      "begin_line": 294,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 48)",
        "(line 298,col 9)-(line 298,col 60)",
        "(line 299,col 9)-(line 299,col 49)",
        "(line 300,col 9)-(line 300,col 47)"
      ]
    }
  ]
}