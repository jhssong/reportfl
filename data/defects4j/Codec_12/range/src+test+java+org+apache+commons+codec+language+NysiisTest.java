{
  "filepath": "/tmp/Codec-12b/src/test/java/org/apache/commons/codec/language/NysiisTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NysiisTest",
      "is_interface": false,
      "parent_types": [
        "StringEncoderAbstractTest"
      ],
      "begin_line": 32,
      "end_line": 304,
      "comment": "\n * Tests {@link Nysiis}\n * \n * @since 1.7\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "fullNysiis"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.assertEncodings(java.lang.String[]...)",
      "begin_line": 45,
      "end_line": 49,
      "comment": "\n     * Takes an array of String pairs where each pair\u0027s first element is the input and the second element the expected\n     * encoding.\n     * \n     * @param testValues\n     *            an array of String pairs where each pair\u0027s first element is the input and the second element the\n     *            expected encoding.\n     * @throws EncoderException\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 48,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.createStringEncoder()",
      "begin_line": 51,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.encodeAll(java.lang.String[], java.lang.String)",
      "begin_line": 56,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 59,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testBran()",
      "begin_line": 62,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testCap()",
      "begin_line": 67,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testDad()",
      "begin_line": 72,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testDan()",
      "begin_line": 79,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testDropBy()",
      "begin_line": 90,
      "end_line": 146,
      "comment": "\n     * Tests data gathered from around the internet.\n     * \n     * @see \u003ca href\u003d\"http://www.dropby.com/NYSIISTextStrings.html\"\u003ehttp://www.dropby.com/NYSIISTextStrings.html\u003c/a\u003e\n     * @throws EncoderException\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 145,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testFal()",
      "begin_line": 148,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testOthers()",
      "begin_line": 158,
      "end_line": 168,
      "comment": "\n     * Tests data gathered from around the internets.\n     * \n     * @throws EncoderException\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 167,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testRule1()",
      "begin_line": 175,
      "end_line": 184,
      "comment": "\n     * Tests rule 1: Translate first characters of name: MAC → MCC, KN → N, K → C, PH, PF → FF, SCH → SSS\n     * \n     * @throws EncoderException\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 183,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testRule2()",
      "begin_line": 191,
      "end_line": 201,
      "comment": "\n     * Tests rule 2: Translate last characters of name: EE → Y, IE → Y, DT, RT, RD, NT, ND → D\n     * \n     * @throws EncoderException\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 200,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testRule4Dot1()",
      "begin_line": 208,
      "end_line": 217,
      "comment": "\n     * Tests rule 4.1: EV → AF else A, E, I, O, U → A\n     * \n     * @throws EncoderException\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 216,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testRule4Dot2()",
      "begin_line": 224,
      "end_line": 230,
      "comment": "\n     * Tests rule 4.2: Q → G, Z → S, M → N\n     * \n     * @throws EncoderException\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 229,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testRule5()",
      "begin_line": 237,
      "end_line": 242,
      "comment": "\n     * Tests rule 5: If last character is S, remove it.\n     * \n     * @throws EncoderException\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 241,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testRule6()",
      "begin_line": 249,
      "end_line": 254,
      "comment": "\n     * Tests rule 6: If last characters are AY, replace with Y.\n     * \n     * @throws EncoderException\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 253,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testRule7()",
      "begin_line": 261,
      "end_line": 266,
      "comment": "\n     * Tests rule 7: If last character is A, remove it.\n     * \n     * @throws EncoderException\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 265,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testSnad()",
      "begin_line": 267,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testSnat()",
      "begin_line": 274,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testSpecialBranches()",
      "begin_line": 279,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 61)",
        "(line 282,col 9)-(line 282,col 59)",
        "(line 283,col 9)-(line 283,col 57)",
        "(line 284,col 9)-(line 284,col 55)",
        "(line 285,col 9)-(line 285,col 54)",
        "(line 286,col 9)-(line 286,col 53)",
        "(line 287,col 9)-(line 287,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testTranan()",
      "begin_line": 290,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.NysiisTest.testTrueVariant()",
      "begin_line": 295,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 42)",
        "(line 299,col 9)-(line 299,col 54)",
        "(line 300,col 9)-(line 300,col 49)",
        "(line 301,col 9)-(line 301,col 47)"
      ]
    }
  ]
}