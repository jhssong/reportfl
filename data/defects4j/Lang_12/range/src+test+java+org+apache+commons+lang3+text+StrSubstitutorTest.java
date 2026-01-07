{
  "filepath": "/tmp/Lang-12b/src/test/java/org/apache/commons/lang3/text/StrSubstitutorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrSubstitutorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 33,
      "end_line": 570,
      "comment": "\n * Test class for StrSubstitutor.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.setUp()",
      "begin_line": 37,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 22)",
        "(line 40,col 9)-(line 40,col 47)",
        "(line 41,col 9)-(line 41,col 48)",
        "(line 42,col 9)-(line 42,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.tearDown()",
      "begin_line": 45,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 25)",
        "(line 48,col 9)-(line 48,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceSimple()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Tests simple key replace.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceSolo()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Tests simple key replace.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceNoVariables()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Tests replace with no variables.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceNull()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Tests replace with null.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceEmpty()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Tests replace with null.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceChangedMap()",
      "begin_line": 90,
      "end_line": 94,
      "comment": "\n     * Tests key replace changing map after initialization (not recommended).\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 56)",
        "(line 92,col 9)-(line 92,col 37)",
        "(line 93,col 9)-(line 93,col 121)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceUnknownKey()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Tests unknown key replace.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceAdjacentAtStart()",
      "begin_line": 106,
      "end_line": 111,
      "comment": "\n     * Tests adjacent keys.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 34)",
        "(line 108,col 9)-(line 108,col 38)",
        "(line 109,col 9)-(line 109,col 56)",
        "(line 110,col 9)-(line 110,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceAdjacentAtEnd()",
      "begin_line": 116,
      "end_line": 121,
      "comment": "\n     * Tests adjacent keys.\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 34)",
        "(line 118,col 9)-(line 118,col 38)",
        "(line 119,col 9)-(line 119,col 56)",
        "(line 120,col 9)-(line 120,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceRecursive()",
      "begin_line": 126,
      "end_line": 136,
      "comment": "\n     * Tests simple recursive replace.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 43)",
        "(line 128,col 9)-(line 128,col 39)",
        "(line 129,col 9)-(line 129,col 54)",
        "(line 130,col 9)-(line 130,col 48)",
        "(line 131,col 9)-(line 131,col 80)",
        "(line 132,col 9)-(line 132,col 44)",
        "(line 133,col 9)-(line 133,col 44)",
        "(line 134,col 9)-(line 134,col 41)",
        "(line 135,col 9)-(line 135,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceEscaping()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * Tests escaping.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceSoloEscaping()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * Tests escaping.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceComplexEscaping()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * Tests complex escaping.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 126)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceNoPrefixNoSuffix()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Tests when no prefix or suffix.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceIncompletePrefix()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Tests when no incomplete prefix.\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 111)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplacePrefixNoSuffix()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * Tests when prefix but no suffix.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 131)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceNoPrefixSuffix()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * Tests when suffix but no prefix.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceEmptyKeys()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * Tests when no variable name.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceToIdentical()",
      "begin_line": 197,
      "end_line": 201,
      "comment": "\n     * Tests replace creates output same as input.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 45)",
        "(line 199,col 9)-(line 199,col 38)",
        "(line 200,col 9)-(line 200,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testCyclicReplacement()",
      "begin_line": 207,
      "end_line": 224,
      "comment": "\n     * Tests a cyclic replace operation.\n     * The cycle should be detected and cause an exception to be thrown.\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 64)",
        "(line 209,col 9)-(line 209,col 40)",
        "(line 210,col 9)-(line 210,col 36)",
        "(line 211,col 9)-(line 211,col 51)",
        "(line 212,col 9)-(line 212,col 45)",
        "(line 213,col 9)-(line 213,col 77)",
        "(line 214,col 9)-(line 214,col 41)",
        "(line 215,col 9)-(line 215,col 41)",
        "(line 216,col 9)-(line 216,col 44)",
        "(line 217,col 9)-(line 217,col 53)",
        "(line 218,col 9)-(line 223,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceWeirdPattens()",
      "begin_line": 229,
      "end_line": 247,
      "comment": "\n     * Tests interpolation with weird boundary patterns.\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 28)",
        "(line 231,col 9)-(line 231,col 31)",
        "(line 232,col 9)-(line 232,col 32)",
        "(line 233,col 9)-(line 233,col 33)",
        "(line 234,col 9)-(line 234,col 33)",
        "(line 235,col 9)-(line 235,col 33)",
        "(line 236,col 9)-(line 236,col 30)",
        "(line 237,col 9)-(line 237,col 30)",
        "(line 238,col 9)-(line 238,col 29)",
        "(line 239,col 9)-(line 239,col 32)",
        "(line 240,col 9)-(line 240,col 32)",
        "(line 241,col 9)-(line 241,col 34)",
        "(line 242,col 9)-(line 242,col 35)",
        "(line 243,col 9)-(line 243,col 36)",
        "(line 244,col 9)-(line 244,col 37)",
        "(line 245,col 9)-(line 245,col 34)",
        "(line 246,col 9)-(line 246,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplacePartialString_noReplace()",
      "begin_line": 252,
      "end_line": 255,
      "comment": "\n     * Tests simple key replace.\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 50)",
        "(line 254,col 9)-(line 254,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceInVariable()",
      "begin_line": 260,
      "end_line": 275,
      "comment": "\n     * Tests whether a variable can be replaced in a variable name.\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 38)",
        "(line 262,col 9)-(line 262,col 40)",
        "(line 263,col 9)-(line 263,col 35)",
        "(line 264,col 9)-(line 264,col 56)",
        "(line 265,col 9)-(line 265,col 51)",
        "(line 266,col 9)-(line 269,col 83)",
        "(line 270,col 9)-(line 270,col 35)",
        "(line 271,col 9)-(line 274,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceInVariableDisabled()",
      "begin_line": 280,
      "end_line": 289,
      "comment": "\n     * Tests whether substitution in variable names is disabled per default.\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 38)",
        "(line 282,col 9)-(line 282,col 40)",
        "(line 283,col 9)-(line 283,col 35)",
        "(line 284,col 9)-(line 284,col 56)",
        "(line 285,col 9)-(line 288,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceInVariableRecursive()",
      "begin_line": 294,
      "end_line": 306,
      "comment": "\n     * Tests complex and recursive substitution in variable names.\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 44)",
        "(line 296,col 9)-(line 296,col 46)",
        "(line 297,col 9)-(line 297,col 37)",
        "(line 298,col 9)-(line 298,col 41)",
        "(line 299,col 9)-(line 299,col 41)",
        "(line 300,col 9)-(line 300,col 56)",
        "(line 301,col 9)-(line 301,col 51)",
        "(line 302,col 9)-(line 305,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testResolveVariable()",
      "begin_line": 312,
      "end_line": 328,
      "comment": "\n     * Tests protected.\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 65)",
        "(line 314,col 9)-(line 314,col 64)",
        "(line 315,col 9)-(line 315,col 35)",
        "(line 316,col 9)-(line 325,col 10)",
        "(line 326,col 9)-(line 326,col 31)",
        "(line 327,col 9)-(line 327,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.Anonymous-043e0e8e-1cd3-457d-b0db-83e89fbda5a7.resolveVariable(java.lang.String, org.apache.commons.lang3.text.StrBuilder, int, int)",
      "begin_line": 317,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 319,col 17)-(line 319,col 51)",
        "(line 320,col 17)-(line 320,col 41)",
        "(line 321,col 17)-(line 321,col 42)",
        "(line 322,col 17)-(line 322,col 41)",
        "(line 323,col 17)-(line 323,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testConstructorNoArgs()",
      "begin_line": 334,
      "end_line": 337,
      "comment": "\n     * Tests constructor.\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 50)",
        "(line 336,col 9)-(line 336,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testConstructorMapPrefixSuffix()",
      "begin_line": 342,
      "end_line": 347,
      "comment": "\n     * Tests constructor.\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 64)",
        "(line 344,col 9)-(line 344,col 35)",
        "(line 345,col 9)-(line 345,col 63)",
        "(line 346,col 9)-(line 346,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testConstructorMapFull()",
      "begin_line": 352,
      "end_line": 357,
      "comment": "\n     * Tests constructor.\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 64)",
        "(line 354,col 9)-(line 354,col 35)",
        "(line 355,col 9)-(line 355,col 68)",
        "(line 356,col 9)-(line 356,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testGetSetEscape()",
      "begin_line": 363,
      "end_line": 368,
      "comment": "\n     * Tests get set.\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 50)",
        "(line 365,col 9)-(line 365,col 47)",
        "(line 366,col 9)-(line 366,col 31)",
        "(line 367,col 9)-(line 367,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testGetSetPrefix()",
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
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testGetSetSuffix()",
      "begin_line": 404,
      "end_line": 430,
      "comment": "\n     * Tests get set.\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 50)",
        "(line 406,col 9)-(line 406,col 95)",
        "(line 407,col 9)-(line 407,col 35)",
        "(line 408,col 9)-(line 408,col 93)",
        "(line 410,col 9)-(line 410,col 36)",
        "(line 411,col 9)-(line 411,col 95)",
        "(line 412,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 418,col 95)",
        "(line 420,col 9)-(line 420,col 55)",
        "(line 421,col 9)-(line 421,col 46)",
        "(line 422,col 9)-(line 422,col 60)",
        "(line 423,col 9)-(line 428,col 9)",
        "(line 429,col 9)-(line 429,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testStaticReplace()",
      "begin_line": 436,
      "end_line": 440,
      "comment": "\n     * Tests static.\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 64)",
        "(line 438,col 9)-(line 438,col 35)",
        "(line 439,col 9)-(line 439,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testStaticReplacePrefixSuffix()",
      "begin_line": 445,
      "end_line": 449,
      "comment": "\n     * Tests static.\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 64)",
        "(line 447,col 9)-(line 447,col 35)",
        "(line 448,col 9)-(line 448,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testStaticReplaceSystemProperties()",
      "begin_line": 454,
      "end_line": 464,
      "comment": "\n     * Tests interpolation with system properties.\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 42)",
        "(line 456,col 9)-(line 456,col 66)",
        "(line 457,col 9)-(line 457,col 46)",
        "(line 458,col 9)-(line 458,col 50)",
        "(line 459,col 9)-(line 459,col 48)",
        "(line 460,col 9)-(line 460,col 64)",
        "(line 461,col 9)-(line 463,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testSubstituteDefaultProperties()",
      "begin_line": 469,
      "end_line": 477,
      "comment": "\n     * Test the replace of a properties object\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 38)",
        "(line 471,col 9)-(line 471,col 55)",
        "(line 474,col 9)-(line 474,col 66)",
        "(line 476,col 9)-(line 476,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.testSamePrefixAndSuffix()",
      "begin_line": 479,
      "end_line": 486,
      "comment": "",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 64)",
        "(line 481,col 9)-(line 481,col 37)",
        "(line 482,col 9)-(line 482,col 34)",
        "(line 483,col 9)-(line 483,col 35)",
        "(line 484,col 9)-(line 484,col 89)",
        "(line 485,col 9)-(line 485,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.doTestReplace(java.lang.String, java.lang.String, boolean)",
      "begin_line": 489,
      "end_line": 543,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 94)",
        "(line 491,col 9)-(line 491,col 56)",
        "(line 494,col 9)-(line 494,col 67)",
        "(line 495,col 9)-(line 497,col 9)",
        "(line 500,col 9)-(line 500,col 53)",
        "(line 501,col 9)-(line 501,col 57)",
        "(line 502,col 9)-(line 504,col 9)",
        "(line 507,col 9)-(line 507,col 61)",
        "(line 508,col 9)-(line 508,col 55)",
        "(line 509,col 9)-(line 511,col 9)",
        "(line 514,col 9)-(line 514,col 57)",
        "(line 515,col 9)-(line 515,col 55)",
        "(line 516,col 9)-(line 518,col 9)",
        "(line 521,col 9)-(line 521,col 79)",
        "(line 522,col 9)-(line 522,col 55)",
        "(line 525,col 9)-(line 525,col 48)",
        "(line 526,col 9)-(line 526,col 47)",
        "(line 527,col 9)-(line 527,col 53)",
        "(line 528,col 9)-(line 532,col 9)",
        "(line 535,col 9)-(line 535,col 46)",
        "(line 536,col 9)-(line 536,col 47)",
        "(line 537,col 9)-(line 537,col 53)",
        "(line 538,col 9)-(line 542,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrSubstitutorTest.doTestNoReplace(java.lang.String)",
      "begin_line": 545,
      "end_line": 568,
      "comment": "",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 56)",
        "(line 548,col 9)-(line 567,col 9)"
      ]
    }
  ]
}