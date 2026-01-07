{
  "filepath": "/tmp/Lang-48b/src/test/org/apache/commons/lang/text/StrSubstitutorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrSubstitutorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 36,
      "end_line": 517,
      "comment": "\n * Test class for StrSubstitutor.\n * \n * @author Oliver Heger\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.main(java.lang.String[])",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Main method.\n     * \n     * @param args  command line arguments, ignored\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.suite()",
      "begin_line": 54,
      "end_line": 58,
      "comment": "\n     * Return a new test suite containing this test case.\n     * \n     * @return a new test suite containing this test case\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 66)",
        "(line 56,col 9)-(line 56,col 46)",
        "(line 57,col 9)-(line 57,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.setUp()",
      "begin_line": 60,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 22)",
        "(line 62,col 9)-(line 62,col 31)",
        "(line 63,col 9)-(line 63,col 48)",
        "(line 64,col 9)-(line 64,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.tearDown()",
      "begin_line": 67,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 25)",
        "(line 69,col 9)-(line 69,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testReplaceSimple()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Tests simple key replace.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testReplaceSolo()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Tests simple key replace.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testReplaceNoVariables()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Tests replace with no variables.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testReplaceNull()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Tests replace with null.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testReplaceEmpty()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Tests replace with null.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testReplaceChangedMap()",
      "begin_line": 111,
      "end_line": 115,
      "comment": "\n     * Tests key replace changing map after initialization (not recommended).\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 56)",
        "(line 113,col 9)-(line 113,col 37)",
        "(line 114,col 9)-(line 114,col 121)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testReplaceUnknownKey()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * Tests unknown key replace.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testReplaceAdjacentAtStart()",
      "begin_line": 127,
      "end_line": 132,
      "comment": "\n     * Tests adjacent keys.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 34)",
        "(line 129,col 9)-(line 129,col 38)",
        "(line 130,col 9)-(line 130,col 56)",
        "(line 131,col 9)-(line 131,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testReplaceAdjacentAtEnd()",
      "begin_line": 137,
      "end_line": 142,
      "comment": "\n     * Tests adjacent keys.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 34)",
        "(line 139,col 9)-(line 139,col 38)",
        "(line 140,col 9)-(line 140,col 56)",
        "(line 141,col 9)-(line 141,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testReplaceRecursive()",
      "begin_line": 147,
      "end_line": 157,
      "comment": "\n     * Tests simple recursive replace.\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 43)",
        "(line 149,col 9)-(line 149,col 39)",
        "(line 150,col 9)-(line 150,col 54)",
        "(line 151,col 9)-(line 151,col 48)",
        "(line 152,col 9)-(line 152,col 80)",
        "(line 153,col 9)-(line 153,col 44)",
        "(line 154,col 9)-(line 154,col 44)",
        "(line 155,col 9)-(line 155,col 41)",
        "(line 156,col 9)-(line 156,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testReplaceEscaping()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Tests escaping.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testReplaceSoloEscaping()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Tests escaping.\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testReplaceComplexEscaping()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * Tests complex escaping.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 126)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testReplaceNoPefixNoSuffix()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * Tests when no prefix or suffix.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testReplaceIncompletePefix()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * Tests when no incomplete prefix.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 111)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testReplacePrefixNoSuffix()",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\n     * Tests when prefix but no suffix.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 131)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testReplaceNoPrefixSuffix()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * Tests when suffix but no prefix.\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testReplaceEmptyKeys()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\n     * Tests when no variable name.\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testReplaceToIdentical()",
      "begin_line": 218,
      "end_line": 222,
      "comment": "\n     * Tests replace creates output same as input.\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 45)",
        "(line 220,col 9)-(line 220,col 38)",
        "(line 221,col 9)-(line 221,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testCyclicReplacement()",
      "begin_line": 228,
      "end_line": 245,
      "comment": "\n     * Tests a cyclic replace operation.\n     * The cycle should be detected and cause an exception to be thrown.\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 32)",
        "(line 230,col 9)-(line 230,col 40)",
        "(line 231,col 9)-(line 231,col 36)",
        "(line 232,col 9)-(line 232,col 51)",
        "(line 233,col 9)-(line 233,col 45)",
        "(line 234,col 9)-(line 234,col 77)",
        "(line 235,col 9)-(line 235,col 41)",
        "(line 236,col 9)-(line 236,col 41)",
        "(line 237,col 9)-(line 237,col 44)",
        "(line 238,col 9)-(line 238,col 53)",
        "(line 239,col 9)-(line 244,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testReplaceWeirdPattens()",
      "begin_line": 250,
      "end_line": 268,
      "comment": "\n     * Tests interpolation with weird boundary patterns.\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 28)",
        "(line 252,col 9)-(line 252,col 31)",
        "(line 253,col 9)-(line 253,col 32)",
        "(line 254,col 9)-(line 254,col 33)",
        "(line 255,col 9)-(line 255,col 33)",
        "(line 256,col 9)-(line 256,col 33)",
        "(line 257,col 9)-(line 257,col 30)",
        "(line 258,col 9)-(line 258,col 30)",
        "(line 259,col 9)-(line 259,col 29)",
        "(line 260,col 9)-(line 260,col 32)",
        "(line 261,col 9)-(line 261,col 32)",
        "(line 262,col 9)-(line 262,col 34)",
        "(line 263,col 9)-(line 263,col 35)",
        "(line 264,col 9)-(line 264,col 36)",
        "(line 265,col 9)-(line 265,col 37)",
        "(line 266,col 9)-(line 266,col 34)",
        "(line 267,col 9)-(line 267,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testReplacePartialString_noReplace()",
      "begin_line": 273,
      "end_line": 276,
      "comment": "\n     * Tests simple key replace.\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 50)",
        "(line 275,col 9)-(line 275,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testResolveVariable()",
      "begin_line": 282,
      "end_line": 297,
      "comment": "\n     * Tests protected.\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 65)",
        "(line 284,col 9)-(line 284,col 32)",
        "(line 285,col 9)-(line 285,col 35)",
        "(line 286,col 9)-(line 294,col 10)",
        "(line 295,col 9)-(line 295,col 31)",
        "(line 296,col 9)-(line 296,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.Anonymous-abcffa9c-44db-4013-9bba-d68e362c074b.resolveVariable(java.lang.String, org.apache.commons.lang.text.StrBuilder, int, int)",
      "begin_line": 287,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 288,col 17)-(line 288,col 51)",
        "(line 289,col 17)-(line 289,col 41)",
        "(line 290,col 17)-(line 290,col 42)",
        "(line 291,col 17)-(line 291,col 41)",
        "(line 292,col 17)-(line 292,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testConstructorNoArgs()",
      "begin_line": 303,
      "end_line": 306,
      "comment": "\n     * Tests constructor.\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 50)",
        "(line 305,col 9)-(line 305,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testConstructorMapPrefixSuffix()",
      "begin_line": 311,
      "end_line": 316,
      "comment": "\n     * Tests constructor.\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 32)",
        "(line 313,col 9)-(line 313,col 35)",
        "(line 314,col 9)-(line 314,col 63)",
        "(line 315,col 9)-(line 315,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testConstructorMapFull()",
      "begin_line": 321,
      "end_line": 326,
      "comment": "\n     * Tests constructor.\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 32)",
        "(line 323,col 9)-(line 323,col 35)",
        "(line 324,col 9)-(line 324,col 68)",
        "(line 325,col 9)-(line 325,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testGetSetEscape()",
      "begin_line": 332,
      "end_line": 337,
      "comment": "\n     * Tests get set.\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 50)",
        "(line 334,col 9)-(line 334,col 47)",
        "(line 335,col 9)-(line 335,col 31)",
        "(line 336,col 9)-(line 336,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testGetSetPrefix()",
      "begin_line": 342,
      "end_line": 368,
      "comment": "\n     * Tests get set.\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 50)",
        "(line 344,col 9)-(line 344,col 95)",
        "(line 345,col 9)-(line 345,col 35)",
        "(line 346,col 9)-(line 346,col 93)",
        "(line 348,col 9)-(line 348,col 36)",
        "(line 349,col 9)-(line 349,col 95)",
        "(line 350,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 356,col 95)",
        "(line 358,col 9)-(line 358,col 55)",
        "(line 359,col 9)-(line 359,col 46)",
        "(line 360,col 9)-(line 360,col 60)",
        "(line 361,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 367,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testGetSetSuffix()",
      "begin_line": 373,
      "end_line": 399,
      "comment": "\n     * Tests get set.\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 50)",
        "(line 375,col 9)-(line 375,col 95)",
        "(line 376,col 9)-(line 376,col 35)",
        "(line 377,col 9)-(line 377,col 93)",
        "(line 379,col 9)-(line 379,col 36)",
        "(line 380,col 9)-(line 380,col 95)",
        "(line 381,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 387,col 95)",
        "(line 389,col 9)-(line 389,col 55)",
        "(line 390,col 9)-(line 390,col 46)",
        "(line 391,col 9)-(line 391,col 60)",
        "(line 392,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 398,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testStaticReplace()",
      "begin_line": 405,
      "end_line": 409,
      "comment": "\n     * Tests static.\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 32)",
        "(line 407,col 9)-(line 407,col 35)",
        "(line 408,col 9)-(line 408,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testStaticReplacePrefixSuffix()",
      "begin_line": 414,
      "end_line": 418,
      "comment": "\n     * Tests static.\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 32)",
        "(line 416,col 9)-(line 416,col 35)",
        "(line 417,col 9)-(line 417,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.testStaticReplaceSystemProperties()",
      "begin_line": 423,
      "end_line": 433,
      "comment": "\n     * Tests interpolation with system properties.\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 42)",
        "(line 425,col 9)-(line 425,col 66)",
        "(line 426,col 9)-(line 426,col 46)",
        "(line 427,col 9)-(line 427,col 50)",
        "(line 428,col 9)-(line 428,col 48)",
        "(line 429,col 9)-(line 429,col 64)",
        "(line 430,col 9)-(line 432,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.doTestReplace(java.lang.String, java.lang.String, boolean)",
      "begin_line": 436,
      "end_line": 490,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 94)",
        "(line 438,col 9)-(line 438,col 56)",
        "(line 441,col 9)-(line 441,col 67)",
        "(line 442,col 9)-(line 444,col 9)",
        "(line 447,col 9)-(line 447,col 53)",
        "(line 448,col 9)-(line 448,col 57)",
        "(line 449,col 9)-(line 451,col 9)",
        "(line 454,col 9)-(line 454,col 61)",
        "(line 455,col 9)-(line 455,col 55)",
        "(line 456,col 9)-(line 458,col 9)",
        "(line 461,col 9)-(line 461,col 57)",
        "(line 462,col 9)-(line 462,col 55)",
        "(line 463,col 9)-(line 465,col 9)",
        "(line 468,col 9)-(line 468,col 63)",
        "(line 469,col 9)-(line 469,col 55)",
        "(line 472,col 9)-(line 472,col 48)",
        "(line 473,col 9)-(line 473,col 47)",
        "(line 474,col 9)-(line 474,col 53)",
        "(line 475,col 9)-(line 479,col 9)",
        "(line 482,col 9)-(line 482,col 46)",
        "(line 483,col 9)-(line 483,col 47)",
        "(line 484,col 9)-(line 484,col 53)",
        "(line 485,col 9)-(line 489,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrSubstitutorTest.doTestNoReplace(java.lang.String)",
      "begin_line": 492,
      "end_line": 515,
      "comment": "",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 56)",
        "(line 495,col 9)-(line 514,col 9)"
      ]
    }
  ]
}