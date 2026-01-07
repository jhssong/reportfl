{
  "filepath": "/tmp/Codec-2b/src/test/org/apache/commons/codec/language/MetaphoneTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MetaphoneTest",
      "is_interface": false,
      "parent_types": [
        "StringEncoderAbstractTest"
      ],
      "begin_line": 30,
      "end_line": 483,
      "comment": "\n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.suite()",
      "begin_line": 32,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 50)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "metaphone"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.MetaphoneTest(java.lang.String)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.assertIsMetaphoneEqual(java.lang.String, java.lang.String[])",
      "begin_line": 42,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 47,col 9)",
        "(line 49,col 9)-(line 53,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.assertMetaphoneEqual(java.lang.String[][])",
      "begin_line": 56,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 36)",
        "(line 58,col 9)-(line 64,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.getMetaphone()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * @return Returns the metaphone.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.makeEncoder()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.setMetaphone(org.apache.commons.codec.language.Metaphone)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * @param metaphone\n     *                  The metaphone to set.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.setUp()",
      "begin_line": 85,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 22)",
        "(line 87,col 9)-(line 87,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.tearDown()",
      "begin_line": 90,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 25)",
        "(line 92,col 9)-(line 92,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testIsMetaphoneEqual1()",
      "begin_line": 95,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 100,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testIsMetaphoneEqual2()",
      "begin_line": 106,
      "end_line": 109,
      "comment": "\n     * Matches computed from http://www.lanw.com/java/phonetic/default.htm\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 108,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testIsMetaphoneEqualAero()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * Initial AE case.\n     * \n     * Match data computed from http://www.lanw.com/java/phonetic/default.htm\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testIsMetaphoneEqualWhite()",
      "begin_line": 125,
      "end_line": 129,
      "comment": "\n     * Initial WH case.\n     * \n     * Match data computed from http://www.lanw.com/java/phonetic/default.htm\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 128,col 131)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testIsMetaphoneEqualAlbert()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Initial A, not followed by an E case.\n     * \n     * Match data computed from http://www.lanw.com/java/phonetic/default.htm\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 118)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testIsMetaphoneEqualGary()",
      "begin_line": 143,
      "end_line": 191,
      "comment": "\n     * Match data computed from http://www.lanw.com/java/phonetic/default.htm\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 190,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testIsMetaphoneEqualJohn()",
      "begin_line": 196,
      "end_line": 259,
      "comment": "\n     * Match data computed from http://www.lanw.com/java/phonetic/default.htm\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 258,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testIsMetaphoneEqualKnight()",
      "begin_line": 266,
      "end_line": 286,
      "comment": "\n     * Initial KN case.\n     * \n     * Match data computed from http://www.lanw.com/java/phonetic/default.htm\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 285,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testIsMetaphoneEqualMary()",
      "begin_line": 290,
      "end_line": 315,
      "comment": "\n     * Match data computed from http://www.lanw.com/java/phonetic/default.htm\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 314,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testIsMetaphoneEqualParis()",
      "begin_line": 320,
      "end_line": 322,
      "comment": "\n     * Match data computed from http://www.lanw.com/java/phonetic/default.htm\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testIsMetaphoneEqualPeter()",
      "begin_line": 327,
      "end_line": 331,
      "comment": "\n     * Match data computed from http://www.lanw.com/java/phonetic/default.htm\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 330,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testIsMetaphoneEqualRay()",
      "begin_line": 336,
      "end_line": 338,
      "comment": "\n     * Match data computed from http://www.lanw.com/java/phonetic/default.htm\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testIsMetaphoneEqualSusan()",
      "begin_line": 343,
      "end_line": 359,
      "comment": "\n     * Match data computed from http://www.lanw.com/java/phonetic/default.htm\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 358,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testIsMetaphoneEqualWright()",
      "begin_line": 366,
      "end_line": 368,
      "comment": "\n     * Initial WR case.\n     * \n     * Match data computed from http://www.lanw.com/java/phonetic/default.htm\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testIsMetaphoneEqualXalan()",
      "begin_line": 373,
      "end_line": 377,
      "comment": "\n     * Match data computed from http://www.lanw.com/java/phonetic/default.htm\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 376,col 120)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testMetaphone()",
      "begin_line": 379,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 66)",
        "(line 381,col 9)-(line 381,col 71)",
        "(line 382,col 9)-(line 382,col 64)",
        "(line 383,col 9)-(line 383,col 67)",
        "(line 384,col 9)-(line 384,col 68)",
        "(line 385,col 9)-(line 385,col 66)",
        "(line 386,col 9)-(line 386,col 70)",
        "(line 387,col 9)-(line 387,col 67)",
        "(line 388,col 9)-(line 388,col 64)",
        "(line 389,col 9)-(line 389,col 66)",
        "(line 390,col 9)-(line 390,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testWordEndingInMB()",
      "begin_line": 393,
      "end_line": 397,
      "comment": "",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 68)",
        "(line 395,col 9)-(line 395,col 68)",
        "(line 396,col 9)-(line 396,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testDiscardOfSCEOrSCIOrSCY()",
      "begin_line": 399,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 72)",
        "(line 401,col 9)-(line 401,col 69)",
        "(line 402,col 9)-(line 402,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testWhy()",
      "begin_line": 408,
      "end_line": 411,
      "comment": "\n     * Tests (CODEC-57) Metaphone.metaphone(String) returns an empty string when passed the word \"why\"\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testWordsWithCIA()",
      "begin_line": 413,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testTranslateOfSCHAndCH()",
      "begin_line": 417,
      "end_line": 423,
      "comment": "",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 74)",
        "(line 419,col 9)-(line 419,col 75)",
        "(line 421,col 9)-(line 421,col 75)",
        "(line 422,col 9)-(line 422,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testTranslateToJOfDGEOrDGIOrDGY()",
      "begin_line": 425,
      "end_line": 429,
      "comment": "",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 69)",
        "(line 427,col 9)-(line 427,col 69)",
        "(line 428,col 9)-(line 428,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testDiscardOfSilentHAfterG()",
      "begin_line": 431,
      "end_line": 434,
      "comment": "",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 70)",
        "(line 433,col 9)-(line 433,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testDiscardOfSilentGN()",
      "begin_line": 436,
      "end_line": 439,
      "comment": "",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 66)",
        "(line 438,col 9)-(line 438,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testPHTOF()",
      "begin_line": 441,
      "end_line": 443,
      "comment": "",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testSHAndSIOAndSIAToX()",
      "begin_line": 445,
      "end_line": 449,
      "comment": "",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 68)",
        "(line 447,col 9)-(line 447,col 72)",
        "(line 448,col 9)-(line 448,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testTIOAndTIAToX()",
      "begin_line": 451,
      "end_line": 454,
      "comment": "",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 68)",
        "(line 453,col 9)-(line 453,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testTCH()",
      "begin_line": 456,
      "end_line": 459,
      "comment": "",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 69)",
        "(line 458,col 9)-(line 458,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testExceedLength()",
      "begin_line": 461,
      "end_line": 464,
      "comment": "",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testSetMaxLengthWithTruncation()",
      "begin_line": 466,
      "end_line": 470,
      "comment": "",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 47)",
        "(line 469,col 9)-(line 469,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.validateFixture(java.lang.String[][])",
      "begin_line": 472,
      "end_line": 481,
      "comment": "",
      "child_ranges": [
        "(line 473,col 9)-(line 475,col 9)",
        "(line 476,col 9)-(line 480,col 9)"
      ]
    }
  ]
}