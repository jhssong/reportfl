{
  "filepath": "/tmp/Collections-26b/src/test/java/org/apache/commons/collections4/bidimap/AbstractBidiMapTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractBidiMapTest",
      "is_interface": false,
      "parent_types": [
        "AbstractIterableMapTest\u003cK,V\u003e"
      ],
      "begin_line": 36,
      "end_line": 610,
      "comment": "\n * Abstract test class for {@link BidiMap} methods and contracts.\n *\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.AbstractBidiMapTest(java.lang.String)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.AbstractBidiMapTest()",
      "begin_line": 42,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.makeFullMap()",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Override to create a full \u003ccode\u003eBidiMap\u003c/code\u003e other than the default.\n     *\n     * @return a full \u003ccode\u003eBidiMap\u003c/code\u003e implementation.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.makeObject()",
      "begin_line": 60,
      "end_line": 61,
      "comment": "\n     * Override to return the empty BidiMap.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.isAllowDuplicateValues()",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * Override to indicate to AbstractTestMap this is a BidiMap.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.getCompatibilityVersion()",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\n     * Override as DualHashBidiMap didn\u0027t exist until version 3.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.testBidiPut()",
      "begin_line": 81,
      "end_line": 115,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 83,col 9)-(line 85,col 9)",
        "(line 87,col 9)-(line 87,col 47)",
        "(line 88,col 9)-(line 88,col 59)",
        "(line 89,col 9)-(line 89,col 36)",
        "(line 90,col 9)-(line 90,col 49)",
        "(line 92,col 9)-(line 92,col 34)",
        "(line 93,col 9)-(line 93,col 36)",
        "(line 94,col 9)-(line 94,col 49)",
        "(line 95,col 9)-(line 95,col 40)",
        "(line 96,col 9)-(line 96,col 44)",
        "(line 98,col 9)-(line 98,col 34)",
        "(line 99,col 9)-(line 99,col 36)",
        "(line 100,col 9)-(line 100,col 49)",
        "(line 101,col 9)-(line 101,col 40)",
        "(line 102,col 9)-(line 102,col 44)",
        "(line 104,col 9)-(line 104,col 34)",
        "(line 105,col 9)-(line 105,col 36)",
        "(line 106,col 9)-(line 106,col 49)",
        "(line 107,col 9)-(line 107,col 40)",
        "(line 108,col 9)-(line 108,col 44)",
        "(line 110,col 9)-(line 110,col 34)",
        "(line 111,col 9)-(line 111,col 36)",
        "(line 112,col 9)-(line 112,col 49)",
        "(line 113,col 9)-(line 113,col 40)",
        "(line 114,col 9)-(line 114,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.verify()",
      "begin_line": 122,
      "end_line": 126,
      "comment": "\n     * Verifies that {@link #map} is still equal to {@link #confirmed}.\n     * \u003cp\u003e\n     * This implementation checks the inverse map as well.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 24)",
        "(line 125,col 9)-(line 125,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.verifyInverse()",
      "begin_line": 128,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 80)",
        "(line 130,col 9)-(line 130,col 54)",
        "(line 131,col 9)-(line 131,col 89)",
        "(line 132,col 9)-(line 132,col 43)",
        "(line 133,col 9)-(line 133,col 43)",
        "(line 134,col 9)-(line 134,col 52)",
        "(line 135,col 9)-(line 135,col 52)",
        "(line 136,col 9)-(line 136,col 55)",
        "(line 137,col 9)-(line 137,col 55)",
        "(line 138,col 9)-(line 138,col 55)",
        "(line 139,col 9)-(line 139,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.testBidiGetKey()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.testBidiGetKeyInverse()",
      "begin_line": 148,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 152,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.doTestGetKey(org.apache.commons.collections4.BidiMap\u003c?, ?\u003e, java.lang.Object, java.lang.Object)",
      "begin_line": 155,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 70)",
        "(line 157,col 9)-(line 157,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.testBidiInverse()",
      "begin_line": 162,
      "end_line": 180,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 48)",
        "(line 164,col 9)-(line 164,col 62)",
        "(line 166,col 9)-(line 169,col 41)",
        "(line 171,col 9)-(line 174,col 50)",
        "(line 176,col 9)-(line 179,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.testBidiModifyEntrySet()",
      "begin_line": 183,
      "end_line": 190,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 184,col 9)-(line 186,col 9)",
        "(line 188,col 9)-(line 188,col 38)",
        "(line 189,col 9)-(line 189,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.modifyEntrySet(org.apache.commons.collections4.BidiMap\u003c?, T\u003e)",
      "begin_line": 192,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 71)",
        "(line 198,col 9)-(line 198,col 42)",
        "(line 199,col 9)-(line 199,col 49)",
        "(line 202,col 9)-(line 202,col 43)",
        "(line 203,col 9)-(line 203,col 37)",
        "(line 205,col 9)-(line 208,col 26)",
        "(line 210,col 9)-(line 212,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.testBidiClear()",
      "begin_line": 216,
      "end_line": 236,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 217,col 9)-(line 223,col 9)",
        "(line 225,col 9)-(line 225,col 42)",
        "(line 226,col 9)-(line 226,col 20)",
        "(line 227,col 9)-(line 227,col 58)",
        "(line 228,col 9)-(line 228,col 83)",
        "(line 231,col 9)-(line 231,col 45)",
        "(line 232,col 9)-(line 232,col 20)",
        "(line 233,col 9)-(line 233,col 58)",
        "(line 234,col 9)-(line 234,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.testBidiRemove()",
      "begin_line": 239,
      "end_line": 259,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 240,col 9)-(line 250,col 9)",
        "(line 252,col 9)-(line 252,col 50)",
        "(line 253,col 9)-(line 253,col 69)",
        "(line 255,col 9)-(line 255,col 57)",
        "(line 256,col 9)-(line 256,col 72)",
        "(line 258,col 9)-(line 258,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.remove(org.apache.commons.collections4.BidiMap\u003c?, ?\u003e, java.lang.Object)",
      "begin_line": 261,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 45)",
        "(line 263,col 9)-(line 263,col 66)",
        "(line 264,col 9)-(line 264,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.removeValue(org.apache.commons.collections4.BidiMap\u003c?, ?\u003e, java.lang.Object)",
      "begin_line": 267,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 50)",
        "(line 269,col 9)-(line 269,col 66)",
        "(line 270,col 9)-(line 270,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.testBidiKeySetValuesOrder()",
      "begin_line": 274,
      "end_line": 285,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 20)",
        "(line 276,col 9)-(line 276,col 57)",
        "(line 277,col 9)-(line 277,col 59)",
        "(line 278,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 283,col 44)",
        "(line 284,col 9)-(line 284,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.testBidiRemoveByKeySet()",
      "begin_line": 288,
      "end_line": 295,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 289,col 9)-(line 291,col 9)",
        "(line 293,col 9)-(line 293,col 80)",
        "(line 294,col 9)-(line 294,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.removeByKeySet(org.apache.commons.collections4.BidiMap\u003c?, ?\u003e, java.lang.Object, java.lang.Object)",
      "begin_line": 297,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 33)",
        "(line 300,col 9)-(line 300,col 66)",
        "(line 301,col 9)-(line 301,col 72)",
        "(line 303,col 9)-(line 305,col 54)",
        "(line 306,col 9)-(line 308,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.testBidiRemoveByEntrySet()",
      "begin_line": 312,
      "end_line": 319,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 313,col 9)-(line 315,col 9)",
        "(line 317,col 9)-(line 317,col 82)",
        "(line 318,col 9)-(line 318,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.removeByEntrySet(org.apache.commons.collections4.BidiMap\u003c?, ?\u003e, java.lang.Object, java.lang.Object)",
      "begin_line": 321,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 71)",
        "(line 323,col 9)-(line 323,col 29)",
        "(line 324,col 9)-(line 324,col 65)",
        "(line 326,col 9)-(line 326,col 66)",
        "(line 327,col 9)-(line 327,col 72)",
        "(line 329,col 9)-(line 331,col 54)",
        "(line 332,col 9)-(line 334,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.getMap()",
      "begin_line": 340,
      "end_line": 343,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.bulkTestMapEntrySet()",
      "begin_line": 346,
      "end_line": 349,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestBidiMapEntrySet",
      "is_interface": false,
      "parent_types": [
        "TestMapEntrySet"
      ],
      "begin_line": 351,
      "end_line": 411,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.TestBidiMapEntrySet()",
      "begin_line": 352,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 353,col 13)-(line 353,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapEntrySet.testMapEntrySetIteratorEntrySetValueCrossCheck()",
      "begin_line": 355,
      "end_line": 410,
      "comment": "",
      "child_ranges": [
        "(line 356,col 13)-(line 356,col 46)",
        "(line 357,col 13)-(line 357,col 46)",
        "(line 358,col 13)-(line 358,col 56)",
        "(line 359,col 13)-(line 359,col 56)",
        "(line 361,col 13)-(line 361,col 24)",
        "(line 364,col 13)-(line 364,col 95)",
        "(line 365,col 13)-(line 365,col 62)",
        "(line 366,col 13)-(line 366,col 69)",
        "(line 367,col 13)-(line 367,col 62)",
        "(line 368,col 13)-(line 368,col 103)",
        "(line 369,col 13)-(line 369,col 80)",
        "(line 370,col 13)-(line 370,col 77)",
        "(line 371,col 13)-(line 371,col 80)",
        "(line 372,col 13)-(line 372,col 46)",
        "(line 374,col 13)-(line 380,col 13)",
        "(line 383,col 13)-(line 383,col 39)",
        "(line 384,col 13)-(line 384,col 48)",
        "(line 385,col 13)-(line 385,col 39)",
        "(line 386,col 13)-(line 386,col 48)",
        "(line 390,col 13)-(line 394,col 13)",
        "(line 395,col 13)-(line 395,col 48)",
        "(line 396,col 13)-(line 396,col 65)",
        "(line 397,col 13)-(line 397,col 55)",
        "(line 398,col 13)-(line 398,col 95)",
        "(line 399,col 13)-(line 399,col 91)",
        "(line 400,col 13)-(line 400,col 92)",
        "(line 401,col 13)-(line 401,col 85)",
        "(line 402,col 13)-(line 402,col 92)",
        "(line 403,col 13)-(line 403,col 46)",
        "(line 406,col 13)-(line 406,col 22)",
        "(line 407,col 13)-(line 409,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.bulkTestInverseMap()",
      "begin_line": 413,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestInverseBidiMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bidimap.AbstractBidiMapTest\u003cV, K\u003e"
      ],
      "begin_line": 417,
      "end_line": 479,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "main"
      ],
      "begin_line": 418,
      "end_line": 418,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestInverseBidiMap.TestInverseBidiMap(org.apache.commons.collections4.bidimap.AbstractBidiMapTest\u003cK, V\u003e)",
      "begin_line": 420,
      "end_line": 423,
      "comment": "",
      "child_ranges": [
        "(line 421,col 13)-(line 421,col 20)",
        "(line 422,col 13)-(line 422,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestInverseBidiMap.makeObject()",
      "begin_line": 425,
      "end_line": 428,
      "comment": "",
      "child_ranges": [
        "(line 427,col 13)-(line 427,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestInverseBidiMap.makeFullMap()",
      "begin_line": 430,
      "end_line": 433,
      "comment": "",
      "child_ranges": [
        "(line 432,col 13)-(line 432,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestInverseBidiMap.getSampleKeys()",
      "begin_line": 435,
      "end_line": 438,
      "comment": "",
      "child_ranges": [
        "(line 437,col 13)-(line 437,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestInverseBidiMap.getSampleValues()",
      "begin_line": 439,
      "end_line": 442,
      "comment": "",
      "child_ranges": [
        "(line 441,col 13)-(line 441,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestInverseBidiMap.getCompatibilityVersion()",
      "begin_line": 444,
      "end_line": 447,
      "comment": "",
      "child_ranges": [
        "(line 446,col 13)-(line 446,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestInverseBidiMap.isAllowNullKey()",
      "begin_line": 449,
      "end_line": 452,
      "comment": "",
      "child_ranges": [
        "(line 451,col 13)-(line 451,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestInverseBidiMap.isAllowNullValue()",
      "begin_line": 454,
      "end_line": 457,
      "comment": "",
      "child_ranges": [
        "(line 456,col 13)-(line 456,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestInverseBidiMap.isPutAddSupported()",
      "begin_line": 459,
      "end_line": 462,
      "comment": "",
      "child_ranges": [
        "(line 461,col 13)-(line 461,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestInverseBidiMap.isPutChangeSupported()",
      "begin_line": 464,
      "end_line": 467,
      "comment": "",
      "child_ranges": [
        "(line 466,col 13)-(line 466,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestInverseBidiMap.isSetValueSupported()",
      "begin_line": 469,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 471,col 13)-(line 471,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestInverseBidiMap.isRemoveSupported()",
      "begin_line": 474,
      "end_line": 477,
      "comment": "",
      "child_ranges": [
        "(line 476,col 13)-(line 476,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.bulkTestBidiMapIterator()",
      "begin_line": 482,
      "end_line": 484,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestBidiMapIterator",
      "is_interface": false,
      "parent_types": [
        "AbstractMapIteratorTest\u003cK,V\u003e"
      ],
      "begin_line": 486,
      "end_line": 535,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapIterator.TestBidiMapIterator()",
      "begin_line": 487,
      "end_line": 489,
      "comment": "",
      "child_ranges": [
        "(line 488,col 13)-(line 488,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapIterator.addSetValues()",
      "begin_line": 491,
      "end_line": 494,
      "comment": "",
      "child_ranges": [
        "(line 493,col 13)-(line 493,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapIterator.supportsRemove()",
      "begin_line": 496,
      "end_line": 499,
      "comment": "",
      "child_ranges": [
        "(line 498,col 13)-(line 498,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapIterator.supportsSetValue()",
      "begin_line": 501,
      "end_line": 504,
      "comment": "",
      "child_ranges": [
        "(line 503,col 13)-(line 503,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapIterator.makeEmptyIterator()",
      "begin_line": 506,
      "end_line": 510,
      "comment": "",
      "child_ranges": [
        "(line 508,col 13)-(line 508,col 25)",
        "(line 509,col 13)-(line 509,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapIterator.makeObject()",
      "begin_line": 512,
      "end_line": 516,
      "comment": "",
      "child_ranges": [
        "(line 514,col 13)-(line 514,col 24)",
        "(line 515,col 13)-(line 515,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapIterator.getMap()",
      "begin_line": 518,
      "end_line": 522,
      "comment": "",
      "child_ranges": [
        "(line 521,col 13)-(line 521,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapIterator.getConfirmedMap()",
      "begin_line": 524,
      "end_line": 528,
      "comment": "",
      "child_ranges": [
        "(line 527,col 13)-(line 527,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.TestBidiMapIterator.verify()",
      "begin_line": 530,
      "end_line": 534,
      "comment": "",
      "child_ranges": [
        "(line 532,col 13)-(line 532,col 27)",
        "(line 533,col 13)-(line 533,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bidimap.AbstractBidiMapTest.testBidiMapIteratorSet()",
      "begin_line": 538,
      "end_line": 608,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 48)",
        "(line 540,col 9)-(line 540,col 48)",
        "(line 542,col 9)-(line 542,col 20)",
        "(line 543,col 9)-(line 543,col 44)",
        "(line 544,col 9)-(line 544,col 56)",
        "(line 545,col 9)-(line 545,col 41)",
        "(line 546,col 9)-(line 546,col 33)",
        "(line 548,col 9)-(line 555,col 9)",
        "(line 557,col 9)-(line 557,col 31)",
        "(line 558,col 9)-(line 558,col 39)",
        "(line 559,col 9)-(line 559,col 38)",
        "(line 560,col 9)-(line 560,col 45)",
        "(line 561,col 9)-(line 561,col 51)",
        "(line 562,col 9)-(line 562,col 58)",
        "(line 563,col 9)-(line 563,col 48)",
        "(line 564,col 9)-(line 564,col 17)",
        "(line 566,col 9)-(line 566,col 31)",
        "(line 567,col 9)-(line 567,col 39)",
        "(line 568,col 9)-(line 568,col 38)",
        "(line 569,col 9)-(line 569,col 45)",
        "(line 570,col 9)-(line 570,col 51)",
        "(line 571,col 9)-(line 571,col 58)",
        "(line 572,col 9)-(line 572,col 48)",
        "(line 573,col 9)-(line 573,col 17)",
        "(line 575,col 9)-(line 575,col 33)",
        "(line 576,col 9)-(line 576,col 31)",
        "(line 577,col 9)-(line 577,col 39)",
        "(line 578,col 9)-(line 578,col 38)",
        "(line 579,col 9)-(line 579,col 45)",
        "(line 580,col 9)-(line 580,col 51)",
        "(line 581,col 9)-(line 581,col 58)",
        "(line 582,col 9)-(line 582,col 48)",
        "(line 583,col 9)-(line 583,col 17)",
        "(line 587,col 9)-(line 592,col 9)",
        "(line 593,col 9)-(line 593,col 39)",
        "(line 594,col 9)-(line 594,col 61)",
        "(line 595,col 9)-(line 595,col 47)",
        "(line 596,col 9)-(line 596,col 58)",
        "(line 597,col 9)-(line 597,col 58)",
        "(line 598,col 9)-(line 598,col 55)",
        "(line 599,col 9)-(line 599,col 52)",
        "(line 600,col 9)-(line 600,col 59)",
        "(line 601,col 9)-(line 601,col 17)",
        "(line 604,col 9)-(line 604,col 18)",
        "(line 605,col 9)-(line 607,col 9)"
      ]
    }
  ]
}