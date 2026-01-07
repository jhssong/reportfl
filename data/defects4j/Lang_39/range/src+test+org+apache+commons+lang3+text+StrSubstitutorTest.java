{
  "filepath": "/tmp/Lang-39b/src/test/org/apache/commons/lang3/text/StrSubstitutorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrSubstitutorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 36,
      "end_line": 520,
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
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.main(java.lang.String[])",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Main method.\n     * \n     * @param args  command line arguments, ignored\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.suite()",
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
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.setUp()",
      "begin_line": 60,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 22)",
        "(line 63,col 9)-(line 63,col 47)",
        "(line 64,col 9)-(line 64,col 48)",
        "(line 65,col 9)-(line 65,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.tearDown()",
      "begin_line": 68,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 25)",
        "(line 71,col 9)-(line 71,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceSimple()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Tests simple key replace.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceSolo()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Tests simple key replace.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceNoVariables()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Tests replace with no variables.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceNull()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Tests replace with null.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceEmpty()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * Tests replace with null.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceChangedMap()",
      "begin_line": 113,
      "end_line": 117,
      "comment": "\n     * Tests key replace changing map after initialization (not recommended).\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 56)",
        "(line 115,col 9)-(line 115,col 37)",
        "(line 116,col 9)-(line 116,col 121)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceUnknownKey()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Tests unknown key replace.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceAdjacentAtStart()",
      "begin_line": 129,
      "end_line": 134,
      "comment": "\n     * Tests adjacent keys.\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 34)",
        "(line 131,col 9)-(line 131,col 38)",
        "(line 132,col 9)-(line 132,col 56)",
        "(line 133,col 9)-(line 133,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceAdjacentAtEnd()",
      "begin_line": 139,
      "end_line": 144,
      "comment": "\n     * Tests adjacent keys.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 34)",
        "(line 141,col 9)-(line 141,col 38)",
        "(line 142,col 9)-(line 142,col 56)",
        "(line 143,col 9)-(line 143,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceRecursive()",
      "begin_line": 149,
      "end_line": 159,
      "comment": "\n     * Tests simple recursive replace.\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 43)",
        "(line 151,col 9)-(line 151,col 39)",
        "(line 152,col 9)-(line 152,col 54)",
        "(line 153,col 9)-(line 153,col 48)",
        "(line 154,col 9)-(line 154,col 80)",
        "(line 155,col 9)-(line 155,col 44)",
        "(line 156,col 9)-(line 156,col 44)",
        "(line 157,col 9)-(line 157,col 41)",
        "(line 158,col 9)-(line 158,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceEscaping()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * Tests escaping.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceSoloEscaping()",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * Tests escaping.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceComplexEscaping()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * Tests complex escaping.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 126)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceNoPefixNoSuffix()",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * Tests when no prefix or suffix.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceIncompletePefix()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * Tests when no incomplete prefix.\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 111)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplacePrefixNoSuffix()",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\n     * Tests when prefix but no suffix.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 131)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceNoPrefixSuffix()",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n     * Tests when suffix but no prefix.\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceEmptyKeys()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\n     * Tests when no variable name.\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceToIdentical()",
      "begin_line": 220,
      "end_line": 224,
      "comment": "\n     * Tests replace creates output same as input.\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 45)",
        "(line 222,col 9)-(line 222,col 38)",
        "(line 223,col 9)-(line 223,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testCyclicReplacement()",
      "begin_line": 230,
      "end_line": 247,
      "comment": "\n     * Tests a cyclic replace operation.\n     * The cycle should be detected and cause an exception to be thrown.\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 64)",
        "(line 232,col 9)-(line 232,col 40)",
        "(line 233,col 9)-(line 233,col 36)",
        "(line 234,col 9)-(line 234,col 51)",
        "(line 235,col 9)-(line 235,col 45)",
        "(line 236,col 9)-(line 236,col 77)",
        "(line 237,col 9)-(line 237,col 41)",
        "(line 238,col 9)-(line 238,col 41)",
        "(line 239,col 9)-(line 239,col 44)",
        "(line 240,col 9)-(line 240,col 53)",
        "(line 241,col 9)-(line 246,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceWeirdPattens()",
      "begin_line": 252,
      "end_line": 270,
      "comment": "\n     * Tests interpolation with weird boundary patterns.\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 28)",
        "(line 254,col 9)-(line 254,col 31)",
        "(line 255,col 9)-(line 255,col 32)",
        "(line 256,col 9)-(line 256,col 33)",
        "(line 257,col 9)-(line 257,col 33)",
        "(line 258,col 9)-(line 258,col 33)",
        "(line 259,col 9)-(line 259,col 30)",
        "(line 260,col 9)-(line 260,col 30)",
        "(line 261,col 9)-(line 261,col 29)",
        "(line 262,col 9)-(line 262,col 32)",
        "(line 263,col 9)-(line 263,col 32)",
        "(line 264,col 9)-(line 264,col 34)",
        "(line 265,col 9)-(line 265,col 35)",
        "(line 266,col 9)-(line 266,col 36)",
        "(line 267,col 9)-(line 267,col 37)",
        "(line 268,col 9)-(line 268,col 34)",
        "(line 269,col 9)-(line 269,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplacePartialString_noReplace()",
      "begin_line": 275,
      "end_line": 278,
      "comment": "\n     * Tests simple key replace.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 50)",
        "(line 277,col 9)-(line 277,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testResolveVariable()",
      "begin_line": 284,
      "end_line": 300,
      "comment": "\n     * Tests protected.\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 65)",
        "(line 286,col 9)-(line 286,col 64)",
        "(line 287,col 9)-(line 287,col 35)",
        "(line 288,col 9)-(line 297,col 10)",
        "(line 298,col 9)-(line 298,col 31)",
        "(line 299,col 9)-(line 299,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.Anonymous-ac29cb43-8881-4049-8fd6-33cb73bf576f.resolveVariable(java.lang.String, org.apache.commons.lang3.text.StrBuilder, int, int)",
      "begin_line": 289,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 291,col 17)-(line 291,col 51)",
        "(line 292,col 17)-(line 292,col 41)",
        "(line 293,col 17)-(line 293,col 42)",
        "(line 294,col 17)-(line 294,col 41)",
        "(line 295,col 17)-(line 295,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testConstructorNoArgs()",
      "begin_line": 306,
      "end_line": 309,
      "comment": "\n     * Tests constructor.\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 50)",
        "(line 308,col 9)-(line 308,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testConstructorMapPrefixSuffix()",
      "begin_line": 314,
      "end_line": 319,
      "comment": "\n     * Tests constructor.\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 64)",
        "(line 316,col 9)-(line 316,col 35)",
        "(line 317,col 9)-(line 317,col 63)",
        "(line 318,col 9)-(line 318,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testConstructorMapFull()",
      "begin_line": 324,
      "end_line": 329,
      "comment": "\n     * Tests constructor.\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 64)",
        "(line 326,col 9)-(line 326,col 35)",
        "(line 327,col 9)-(line 327,col 68)",
        "(line 328,col 9)-(line 328,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testGetSetEscape()",
      "begin_line": 335,
      "end_line": 340,
      "comment": "\n     * Tests get set.\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 50)",
        "(line 337,col 9)-(line 337,col 47)",
        "(line 338,col 9)-(line 338,col 31)",
        "(line 339,col 9)-(line 339,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testGetSetPrefix()",
      "begin_line": 345,
      "end_line": 371,
      "comment": "\n     * Tests get set.\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 50)",
        "(line 347,col 9)-(line 347,col 95)",
        "(line 348,col 9)-(line 348,col 35)",
        "(line 349,col 9)-(line 349,col 93)",
        "(line 351,col 9)-(line 351,col 36)",
        "(line 352,col 9)-(line 352,col 95)",
        "(line 353,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 95)",
        "(line 361,col 9)-(line 361,col 55)",
        "(line 362,col 9)-(line 362,col 46)",
        "(line 363,col 9)-(line 363,col 60)",
        "(line 364,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 370,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testGetSetSuffix()",
      "begin_line": 376,
      "end_line": 402,
      "comment": "\n     * Tests get set.\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 50)",
        "(line 378,col 9)-(line 378,col 95)",
        "(line 379,col 9)-(line 379,col 35)",
        "(line 380,col 9)-(line 380,col 93)",
        "(line 382,col 9)-(line 382,col 36)",
        "(line 383,col 9)-(line 383,col 95)",
        "(line 384,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 390,col 95)",
        "(line 392,col 9)-(line 392,col 55)",
        "(line 393,col 9)-(line 393,col 46)",
        "(line 394,col 9)-(line 394,col 60)",
        "(line 395,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 401,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testStaticReplace()",
      "begin_line": 408,
      "end_line": 412,
      "comment": "\n     * Tests static.\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 64)",
        "(line 410,col 9)-(line 410,col 35)",
        "(line 411,col 9)-(line 411,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testStaticReplacePrefixSuffix()",
      "begin_line": 417,
      "end_line": 421,
      "comment": "\n     * Tests static.\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 64)",
        "(line 419,col 9)-(line 419,col 35)",
        "(line 420,col 9)-(line 420,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testStaticReplaceSystemProperties()",
      "begin_line": 426,
      "end_line": 436,
      "comment": "\n     * Tests interpolation with system properties.\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 42)",
        "(line 428,col 9)-(line 428,col 66)",
        "(line 429,col 9)-(line 429,col 46)",
        "(line 430,col 9)-(line 430,col 50)",
        "(line 431,col 9)-(line 431,col 48)",
        "(line 432,col 9)-(line 432,col 64)",
        "(line 433,col 9)-(line 435,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.doTestReplace(java.lang.String, java.lang.String, boolean)",
      "begin_line": 439,
      "end_line": 493,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 94)",
        "(line 441,col 9)-(line 441,col 56)",
        "(line 444,col 9)-(line 444,col 67)",
        "(line 445,col 9)-(line 447,col 9)",
        "(line 450,col 9)-(line 450,col 53)",
        "(line 451,col 9)-(line 451,col 57)",
        "(line 452,col 9)-(line 454,col 9)",
        "(line 457,col 9)-(line 457,col 61)",
        "(line 458,col 9)-(line 458,col 55)",
        "(line 459,col 9)-(line 461,col 9)",
        "(line 464,col 9)-(line 464,col 57)",
        "(line 465,col 9)-(line 465,col 55)",
        "(line 466,col 9)-(line 468,col 9)",
        "(line 471,col 9)-(line 471,col 79)",
        "(line 472,col 9)-(line 472,col 55)",
        "(line 475,col 9)-(line 475,col 48)",
        "(line 476,col 9)-(line 476,col 47)",
        "(line 477,col 9)-(line 477,col 53)",
        "(line 478,col 9)-(line 482,col 9)",
        "(line 485,col 9)-(line 485,col 46)",
        "(line 486,col 9)-(line 486,col 47)",
        "(line 487,col 9)-(line 487,col 53)",
        "(line 488,col 9)-(line 492,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.doTestNoReplace(java.lang.String)",
      "begin_line": 495,
      "end_line": 518,
      "comment": "",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 56)",
        "(line 498,col 9)-(line 517,col 9)"
      ]
    }
  ]
}