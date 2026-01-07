{
  "filepath": "/tmp/Codec-5b/src/test/org/apache/commons/codec/language/MetaphoneTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MetaphoneTest",
      "is_interface": false,
      "parent_types": [
        "StringEncoderAbstractTest"
      ],
      "begin_line": 27,
      "end_line": 479,
      "comment": "\n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "metaphone"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.MetaphoneTest(java.lang.String)",
      "begin_line": 31,
      "end_line": 33,
      "comment": "",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.assertIsMetaphoneEqual(java.lang.String, java.lang.String[])",
      "begin_line": 35,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 37,col 9)-(line 40,col 9)",
        "(line 42,col 9)-(line 46,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.assertMetaphoneEqual(java.lang.String[][])",
      "begin_line": 49,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 36)",
        "(line 51,col 9)-(line 57,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.getMetaphone()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * @return Returns the metaphone.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.makeEncoder()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.setMetaphone(org.apache.commons.codec.language.Metaphone)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * @param metaphone\n     *                  The metaphone to set.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.setUp()",
      "begin_line": 78,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 22)",
        "(line 80,col 9)-(line 80,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.tearDown()",
      "begin_line": 83,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 25)",
        "(line 85,col 9)-(line 85,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testIsMetaphoneEqual1()",
      "begin_line": 88,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 93,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testIsMetaphoneEqual2()",
      "begin_line": 99,
      "end_line": 102,
      "comment": "\n     * Matches computed from http://www.lanw.com/java/phonetic/default.htm\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 101,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testIsMetaphoneEqualAero()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Initial AE case.\n     * \n     * Match data computed from http://www.lanw.com/java/phonetic/default.htm\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testIsMetaphoneEqualWhite()",
      "begin_line": 118,
      "end_line": 122,
      "comment": "\n     * Initial WH case.\n     * \n     * Match data computed from http://www.lanw.com/java/phonetic/default.htm\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 121,col 131)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testIsMetaphoneEqualAlbert()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Initial A, not followed by an E case.\n     * \n     * Match data computed from http://www.lanw.com/java/phonetic/default.htm\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 118)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testIsMetaphoneEqualGary()",
      "begin_line": 136,
      "end_line": 184,
      "comment": "\n     * Match data computed from http://www.lanw.com/java/phonetic/default.htm\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 183,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testIsMetaphoneEqualJohn()",
      "begin_line": 189,
      "end_line": 252,
      "comment": "\n     * Match data computed from http://www.lanw.com/java/phonetic/default.htm\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 251,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testIsMetaphoneEqualKnight()",
      "begin_line": 259,
      "end_line": 279,
      "comment": "\n     * Initial KN case.\n     * \n     * Match data computed from http://www.lanw.com/java/phonetic/default.htm\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 278,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testIsMetaphoneEqualMary()",
      "begin_line": 283,
      "end_line": 308,
      "comment": "\n     * Match data computed from http://www.lanw.com/java/phonetic/default.htm\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 307,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testIsMetaphoneEqualParis()",
      "begin_line": 313,
      "end_line": 315,
      "comment": "\n     * Match data computed from http://www.lanw.com/java/phonetic/default.htm\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testIsMetaphoneEqualPeter()",
      "begin_line": 320,
      "end_line": 324,
      "comment": "\n     * Match data computed from http://www.lanw.com/java/phonetic/default.htm\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 323,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testIsMetaphoneEqualRay()",
      "begin_line": 329,
      "end_line": 331,
      "comment": "\n     * Match data computed from http://www.lanw.com/java/phonetic/default.htm\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testIsMetaphoneEqualSusan()",
      "begin_line": 336,
      "end_line": 352,
      "comment": "\n     * Match data computed from http://www.lanw.com/java/phonetic/default.htm\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 351,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testIsMetaphoneEqualWright()",
      "begin_line": 359,
      "end_line": 361,
      "comment": "\n     * Initial WR case.\n     * \n     * Match data computed from http://www.lanw.com/java/phonetic/default.htm\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testIsMetaphoneEqualXalan()",
      "begin_line": 366,
      "end_line": 370,
      "comment": "\n     * Match data computed from http://www.lanw.com/java/phonetic/default.htm\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 369,col 120)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testMetaphone()",
      "begin_line": 372,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 66)",
        "(line 374,col 9)-(line 374,col 71)",
        "(line 375,col 9)-(line 375,col 64)",
        "(line 376,col 9)-(line 376,col 67)",
        "(line 377,col 9)-(line 377,col 68)",
        "(line 378,col 9)-(line 378,col 66)",
        "(line 379,col 9)-(line 379,col 70)",
        "(line 380,col 9)-(line 380,col 67)",
        "(line 381,col 9)-(line 381,col 64)",
        "(line 382,col 9)-(line 382,col 66)",
        "(line 383,col 9)-(line 383,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testWordEndingInMB()",
      "begin_line": 386,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 68)",
        "(line 388,col 9)-(line 388,col 68)",
        "(line 389,col 9)-(line 389,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testDiscardOfSCEOrSCIOrSCY()",
      "begin_line": 392,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 72)",
        "(line 394,col 9)-(line 394,col 69)",
        "(line 395,col 9)-(line 395,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testWhy()",
      "begin_line": 401,
      "end_line": 404,
      "comment": "\n     * Tests (CODEC-57) Metaphone.metaphone(String) returns an empty string when passed the word \"why\"\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testWordsWithCIA()",
      "begin_line": 406,
      "end_line": 408,
      "comment": "",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testTranslateOfSCHAndCH()",
      "begin_line": 410,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 74)",
        "(line 412,col 9)-(line 412,col 75)",
        "(line 414,col 9)-(line 414,col 75)",
        "(line 415,col 9)-(line 415,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testTranslateToJOfDGEOrDGIOrDGY()",
      "begin_line": 418,
      "end_line": 422,
      "comment": "",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 69)",
        "(line 420,col 9)-(line 420,col 69)",
        "(line 421,col 9)-(line 421,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testDiscardOfSilentHAfterG()",
      "begin_line": 424,
      "end_line": 427,
      "comment": "",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 70)",
        "(line 426,col 9)-(line 426,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testDiscardOfSilentGN()",
      "begin_line": 429,
      "end_line": 435,
      "comment": "",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 66)",
        "(line 434,col 9)-(line 434,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testPHTOF()",
      "begin_line": 437,
      "end_line": 439,
      "comment": "",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testSHAndSIOAndSIAToX()",
      "begin_line": 441,
      "end_line": 445,
      "comment": "",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 68)",
        "(line 443,col 9)-(line 443,col 72)",
        "(line 444,col 9)-(line 444,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testTIOAndTIAToX()",
      "begin_line": 447,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 68)",
        "(line 449,col 9)-(line 449,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testTCH()",
      "begin_line": 452,
      "end_line": 455,
      "comment": "",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 69)",
        "(line 454,col 9)-(line 454,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testExceedLength()",
      "begin_line": 457,
      "end_line": 460,
      "comment": "",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.testSetMaxLengthWithTruncation()",
      "begin_line": 462,
      "end_line": 466,
      "comment": "",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 47)",
        "(line 465,col 9)-(line 465,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.language.MetaphoneTest.validateFixture(java.lang.String[][])",
      "begin_line": 468,
      "end_line": 477,
      "comment": "",
      "child_ranges": [
        "(line 469,col 9)-(line 471,col 9)",
        "(line 472,col 9)-(line 476,col 9)"
      ]
    }
  ]
}