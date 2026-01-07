{
  "filepath": "/tmp/Collections-28b/src/test/java/org/apache/commons/collections4/CollectionUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CollectionUtilsTest",
      "is_interface": false,
      "parent_types": [
        "MockTestCase"
      ],
      "begin_line": 62,
      "end_line": 1927,
      "comment": "\n * Tests for CollectionUtils.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "collectionA"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * Collection of {@link Integer}s\n     "
    },
    {
      "type": "field",
      "varNames": [
        "collectionB"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * Collection of {@link Long}s\n     "
    },
    {
      "type": "field",
      "varNames": [
        "collectionC"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * Collection of {@link Integer}s that are equivalent to the Longs in\n     * collectionB.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "collectionD"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * Sorted Collection of {@link Integer}s\n     "
    },
    {
      "type": "field",
      "varNames": [
        "collectionE"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * Sorted Collection of {@link Integer}s\n     "
    },
    {
      "type": "field",
      "varNames": [
        "collectionA2"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * Collection of {@link Integer}s, bound as {@link Number}s\n     "
    },
    {
      "type": "field",
      "varNames": [
        "collectionB2"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * Collection of {@link Long}s, bound as {@link Number}s\n     "
    },
    {
      "type": "field",
      "varNames": [
        "collectionC2"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n     * Collection of {@link Integer}s (cast as {@link Number}s) that are\n     * equivalent to the Longs in collectionB.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iterableA"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iterableB"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iterableC"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iterableA2"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iterableB2"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "emptyCollection"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.setUp()",
      "begin_line": 119,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 47)",
        "(line 122,col 9)-(line 122,col 27)",
        "(line 123,col 9)-(line 123,col 27)",
        "(line 124,col 9)-(line 124,col 27)",
        "(line 125,col 9)-(line 125,col 27)",
        "(line 126,col 9)-(line 126,col 27)",
        "(line 127,col 9)-(line 127,col 27)",
        "(line 128,col 9)-(line 128,col 27)",
        "(line 129,col 9)-(line 129,col 27)",
        "(line 130,col 9)-(line 130,col 27)",
        "(line 131,col 9)-(line 131,col 27)",
        "(line 132,col 9)-(line 132,col 45)",
        "(line 133,col 9)-(line 133,col 28)",
        "(line 134,col 9)-(line 134,col 28)",
        "(line 135,col 9)-(line 135,col 28)",
        "(line 136,col 9)-(line 136,col 28)",
        "(line 137,col 9)-(line 137,col 28)",
        "(line 138,col 9)-(line 138,col 28)",
        "(line 139,col 9)-(line 139,col 28)",
        "(line 140,col 9)-(line 140,col 28)",
        "(line 141,col 9)-(line 141,col 28)",
        "(line 142,col 9)-(line 142,col 28)",
        "(line 144,col 9)-(line 144,col 47)",
        "(line 145,col 9)-(line 147,col 9)",
        "(line 149,col 9)-(line 149,col 32)",
        "(line 150,col 9)-(line 150,col 32)",
        "(line 151,col 9)-(line 151,col 32)",
        "(line 152,col 9)-(line 152,col 58)",
        "(line 153,col 9)-(line 153,col 59)",
        "(line 154,col 9)-(line 154,col 59)",
        "(line 155,col 9)-(line 155,col 34)",
        "(line 156,col 9)-(line 156,col 34)",
        "(line 158,col 9)-(line 158,col 47)",
        "(line 159,col 9)-(line 159,col 27)",
        "(line 160,col 9)-(line 160,col 27)",
        "(line 161,col 9)-(line 161,col 27)",
        "(line 162,col 9)-(line 162,col 27)",
        "(line 163,col 9)-(line 163,col 27)",
        "(line 164,col 9)-(line 164,col 27)",
        "(line 165,col 9)-(line 165,col 27)",
        "(line 166,col 9)-(line 166,col 28)",
        "(line 168,col 9)-(line 168,col 47)",
        "(line 169,col 9)-(line 169,col 27)",
        "(line 170,col 9)-(line 170,col 27)",
        "(line 171,col 9)-(line 171,col 27)",
        "(line 172,col 9)-(line 172,col 27)",
        "(line 173,col 9)-(line 173,col 27)",
        "(line 174,col 9)-(line 174,col 27)",
        "(line 175,col 9)-(line 175,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getCardinalityMap()",
      "begin_line": 178,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 96)",
        "(line 181,col 9)-(line 181,col 44)",
        "(line 182,col 9)-(line 182,col 44)",
        "(line 183,col 9)-(line 183,col 44)",
        "(line 184,col 9)-(line 184,col 44)",
        "(line 185,col 9)-(line 185,col 33)",
        "(line 187,col 9)-(line 187,col 86)",
        "(line 188,col 9)-(line 188,col 34)",
        "(line 189,col 9)-(line 189,col 45)",
        "(line 190,col 9)-(line 190,col 45)",
        "(line 191,col 9)-(line 191,col 45)",
        "(line 192,col 9)-(line 192,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.cardinality()",
      "begin_line": 195,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 67)",
        "(line 199,col 9)-(line 199,col 67)",
        "(line 200,col 9)-(line 200,col 67)",
        "(line 201,col 9)-(line 201,col 67)",
        "(line 202,col 9)-(line 202,col 67)",
        "(line 204,col 9)-(line 204,col 68)",
        "(line 205,col 9)-(line 205,col 68)",
        "(line 206,col 9)-(line 206,col 68)",
        "(line 207,col 9)-(line 207,col 68)",
        "(line 208,col 9)-(line 208,col 68)",
        "(line 213,col 9)-(line 213,col 69)",
        "(line 214,col 9)-(line 214,col 68)",
        "(line 216,col 9)-(line 216,col 54)",
        "(line 217,col 9)-(line 217,col 21)",
        "(line 218,col 9)-(line 218,col 21)",
        "(line 219,col 9)-(line 219,col 21)",
        "(line 220,col 9)-(line 220,col 21)",
        "(line 221,col 9)-(line 221,col 63)",
        "(line 222,col 9)-(line 222,col 63)",
        "(line 223,col 9)-(line 223,col 63)",
        "(line 224,col 9)-(line 224,col 63)",
        "(line 225,col 9)-(line 225,col 63)",
        "(line 227,col 9)-(line 227,col 54)",
        "(line 228,col 9)-(line 228,col 24)",
        "(line 229,col 9)-(line 229,col 21)",
        "(line 230,col 9)-(line 230,col 21)",
        "(line 231,col 9)-(line 231,col 21)",
        "(line 232,col 9)-(line 232,col 63)",
        "(line 233,col 9)-(line 233,col 63)",
        "(line 234,col 9)-(line 234,col 63)",
        "(line 235,col 9)-(line 235,col 63)",
        "(line 236,col 9)-(line 236,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.cardinalityOfNull()",
      "begin_line": 239,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 58)",
        "(line 243,col 9)-(line 243,col 65)",
        "(line 244,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 248,col 22)",
        "(line 249,col 9)-(line 249,col 65)",
        "(line 250,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 254,col 23)",
        "(line 255,col 9)-(line 255,col 65)",
        "(line 256,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 22)",
        "(line 261,col 9)-(line 261,col 65)",
        "(line 262,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 266,col 23)",
        "(line 267,col 9)-(line 267,col 65)",
        "(line 268,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 272,col 22)",
        "(line 273,col 9)-(line 273,col 65)",
        "(line 274,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 278,col 23)",
        "(line 279,col 9)-(line 279,col 65)",
        "(line 280,col 9)-(line 283,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.containsAll()",
      "begin_line": 286,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 66)",
        "(line 289,col 9)-(line 289,col 64)",
        "(line 290,col 9)-(line 290,col 21)",
        "(line 291,col 9)-(line 291,col 64)",
        "(line 292,col 9)-(line 292,col 21)",
        "(line 293,col 9)-(line 293,col 66)",
        "(line 294,col 9)-(line 294,col 23)",
        "(line 295,col 9)-(line 295,col 65)",
        "(line 296,col 9)-(line 296,col 22)",
        "(line 297,col 9)-(line 297,col 22)",
        "(line 298,col 9)-(line 298,col 70)",
        "(line 299,col 9)-(line 299,col 27)",
        "(line 300,col 9)-(line 300,col 27)",
        "(line 301,col 9)-(line 301,col 27)",
        "(line 303,col 9)-(line 303,col 107)",
        "(line 304,col 9)-(line 304,col 105)",
        "(line 305,col 9)-(line 305,col 109)",
        "(line 306,col 9)-(line 306,col 107)",
        "(line 307,col 9)-(line 307,col 102)",
        "(line 308,col 9)-(line 308,col 108)",
        "(line 310,col 9)-(line 310,col 107)",
        "(line 311,col 9)-(line 311,col 107)",
        "(line 312,col 9)-(line 312,col 106)",
        "(line 313,col 9)-(line 313,col 106)",
        "(line 314,col 9)-(line 314,col 106)",
        "(line 315,col 9)-(line 315,col 108)",
        "(line 316,col 9)-(line 316,col 104)",
        "(line 318,col 9)-(line 318,col 115)",
        "(line 319,col 9)-(line 319,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.containsAny()",
      "begin_line": 322,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 66)",
        "(line 325,col 9)-(line 325,col 64)",
        "(line 326,col 9)-(line 326,col 21)",
        "(line 327,col 9)-(line 327,col 64)",
        "(line 328,col 9)-(line 328,col 21)",
        "(line 329,col 9)-(line 329,col 66)",
        "(line 330,col 9)-(line 330,col 23)",
        "(line 331,col 9)-(line 331,col 65)",
        "(line 332,col 9)-(line 332,col 22)",
        "(line 333,col 9)-(line 333,col 22)",
        "(line 335,col 9)-(line 335,col 105)",
        "(line 336,col 9)-(line 336,col 105)",
        "(line 337,col 9)-(line 337,col 107)",
        "(line 338,col 9)-(line 338,col 107)",
        "(line 339,col 9)-(line 339,col 102)",
        "(line 340,col 9)-(line 340,col 108)",
        "(line 342,col 9)-(line 342,col 107)",
        "(line 343,col 9)-(line 343,col 107)",
        "(line 344,col 9)-(line 344,col 106)",
        "(line 345,col 9)-(line 345,col 106)",
        "(line 346,col 9)-(line 346,col 108)",
        "(line 347,col 9)-(line 347,col 108)",
        "(line 348,col 9)-(line 348,col 106)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.union()",
      "begin_line": 351,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 84)",
        "(line 354,col 9)-(line 354,col 82)",
        "(line 355,col 9)-(line 355,col 54)",
        "(line 356,col 9)-(line 356,col 54)",
        "(line 357,col 9)-(line 357,col 54)",
        "(line 358,col 9)-(line 358,col 54)",
        "(line 359,col 9)-(line 359,col 54)",
        "(line 361,col 9)-(line 361,col 87)",
        "(line 362,col 9)-(line 362,col 83)",
        "(line 363,col 9)-(line 363,col 55)",
        "(line 364,col 9)-(line 364,col 55)",
        "(line 365,col 9)-(line 365,col 55)",
        "(line 366,col 9)-(line 366,col 55)",
        "(line 367,col 9)-(line 367,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.intersection()",
      "begin_line": 370,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 91)",
        "(line 373,col 9)-(line 373,col 82)",
        "(line 374,col 9)-(line 374,col 32)",
        "(line 375,col 9)-(line 375,col 54)",
        "(line 376,col 9)-(line 376,col 54)",
        "(line 377,col 9)-(line 377,col 54)",
        "(line 378,col 9)-(line 378,col 32)",
        "(line 380,col 9)-(line 380,col 96)",
        "(line 381,col 9)-(line 381,col 83)",
        "(line 382,col 9)-(line 382,col 33)",
        "(line 383,col 9)-(line 383,col 55)",
        "(line 384,col 9)-(line 384,col 55)",
        "(line 385,col 9)-(line 385,col 55)",
        "(line 386,col 9)-(line 386,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.disjunction()",
      "begin_line": 389,
      "end_line": 406,
      "comment": "",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 90)",
        "(line 392,col 9)-(line 392,col 82)",
        "(line 393,col 9)-(line 393,col 54)",
        "(line 394,col 9)-(line 394,col 54)",
        "(line 395,col 9)-(line 395,col 32)",
        "(line 396,col 9)-(line 396,col 54)",
        "(line 397,col 9)-(line 397,col 54)",
        "(line 399,col 9)-(line 399,col 95)",
        "(line 400,col 9)-(line 400,col 83)",
        "(line 401,col 9)-(line 401,col 55)",
        "(line 402,col 9)-(line 402,col 55)",
        "(line 403,col 9)-(line 403,col 33)",
        "(line 404,col 9)-(line 404,col 55)",
        "(line 405,col 9)-(line 405,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testDisjunctionAsUnionMinusIntersection()",
      "begin_line": 408,
      "end_line": 414,
      "comment": "",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 101)",
        "(line 411,col 9)-(line 411,col 94)",
        "(line 412,col 9)-(line 412,col 104)",
        "(line 413,col 9)-(line 413,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testDisjunctionAsSymmetricDifference()",
      "begin_line": 416,
      "end_line": 422,
      "comment": "",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 101)",
        "(line 419,col 9)-(line 419,col 98)",
        "(line 420,col 9)-(line 420,col 98)",
        "(line 421,col 9)-(line 421,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSubtract()",
      "begin_line": 424,
      "end_line": 441,
      "comment": "",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 87)",
        "(line 427,col 9)-(line 427,col 82)",
        "(line 428,col 9)-(line 428,col 54)",
        "(line 429,col 9)-(line 429,col 32)",
        "(line 430,col 9)-(line 430,col 32)",
        "(line 431,col 9)-(line 431,col 54)",
        "(line 432,col 9)-(line 432,col 32)",
        "(line 434,col 9)-(line 434,col 92)",
        "(line 435,col 9)-(line 435,col 83)",
        "(line 436,col 9)-(line 436,col 55)",
        "(line 437,col 9)-(line 437,col 33)",
        "(line 438,col 9)-(line 438,col 33)",
        "(line 439,col 9)-(line 439,col 55)",
        "(line 440,col 9)-(line 440,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSubtractWithPredicate()",
      "begin_line": 443,
      "end_line": 460,
      "comment": "",
      "child_ranges": [
        "(line 446,col 9)-(line 451,col 10)",
        "(line 453,col 9)-(line 453,col 99)",
        "(line 454,col 9)-(line 454,col 82)",
        "(line 455,col 9)-(line 455,col 55)",
        "(line 456,col 9)-(line 456,col 55)",
        "(line 457,col 9)-(line 457,col 55)",
        "(line 458,col 9)-(line 458,col 55)",
        "(line 459,col 9)-(line 459,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-8ccd2902-f101-4d0f-925a-ad916c444fc4.evaluate(java.lang.Number)",
      "begin_line": 447,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 449,col 17)-(line 449,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsSubCollectionOfSelf()",
      "begin_line": 462,
      "end_line": 466,
      "comment": "",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 78)",
        "(line 465,col 9)-(line 465,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsSubCollection()",
      "begin_line": 468,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 79)",
        "(line 471,col 9)-(line 471,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsSubCollection2()",
      "begin_line": 474,
      "end_line": 512,
      "comment": "",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 63)",
        "(line 477,col 9)-(line 477,col 68)",
        "(line 478,col 9)-(line 478,col 69)",
        "(line 479,col 9)-(line 479,col 17)",
        "(line 480,col 9)-(line 480,col 68)",
        "(line 481,col 9)-(line 481,col 69)",
        "(line 482,col 9)-(line 482,col 17)",
        "(line 483,col 9)-(line 483,col 68)",
        "(line 484,col 9)-(line 484,col 69)",
        "(line 485,col 9)-(line 485,col 17)",
        "(line 486,col 9)-(line 486,col 68)",
        "(line 487,col 9)-(line 487,col 69)",
        "(line 488,col 9)-(line 488,col 17)",
        "(line 489,col 9)-(line 489,col 68)",
        "(line 490,col 9)-(line 490,col 69)",
        "(line 491,col 9)-(line 491,col 17)",
        "(line 492,col 9)-(line 492,col 68)",
        "(line 493,col 9)-(line 493,col 69)",
        "(line 494,col 9)-(line 494,col 17)",
        "(line 495,col 9)-(line 495,col 68)",
        "(line 496,col 9)-(line 496,col 69)",
        "(line 497,col 9)-(line 497,col 17)",
        "(line 498,col 9)-(line 498,col 68)",
        "(line 499,col 9)-(line 499,col 69)",
        "(line 500,col 9)-(line 500,col 17)",
        "(line 501,col 9)-(line 501,col 68)",
        "(line 502,col 9)-(line 502,col 69)",
        "(line 503,col 9)-(line 503,col 17)",
        "(line 504,col 9)-(line 504,col 68)",
        "(line 505,col 9)-(line 505,col 69)",
        "(line 506,col 9)-(line 506,col 17)",
        "(line 507,col 9)-(line 507,col 68)",
        "(line 508,col 9)-(line 508,col 68)",
        "(line 509,col 9)-(line 509,col 17)",
        "(line 510,col 9)-(line 510,col 69)",
        "(line 511,col 9)-(line 511,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsEqualCollectionToSelf()",
      "begin_line": 514,
      "end_line": 518,
      "comment": "",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 80)",
        "(line 517,col 9)-(line 517,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsEqualCollection()",
      "begin_line": 520,
      "end_line": 524,
      "comment": "",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 81)",
        "(line 523,col 9)-(line 523,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsEqualCollectionReturnsFalse()",
      "begin_line": 526,
      "end_line": 534,
      "comment": "",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 68)",
        "(line 530,col 9)-(line 530,col 20)",
        "(line 531,col 9)-(line 531,col 17)",
        "(line 532,col 9)-(line 532,col 71)",
        "(line 533,col 9)-(line 533,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsEqualCollection2()",
      "begin_line": 536,
      "end_line": 560,
      "comment": "",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 61)",
        "(line 539,col 9)-(line 539,col 61)",
        "(line 540,col 9)-(line 540,col 60)",
        "(line 541,col 9)-(line 541,col 60)",
        "(line 542,col 9)-(line 542,col 19)",
        "(line 543,col 9)-(line 543,col 61)",
        "(line 544,col 9)-(line 544,col 61)",
        "(line 545,col 9)-(line 545,col 19)",
        "(line 546,col 9)-(line 546,col 60)",
        "(line 547,col 9)-(line 547,col 60)",
        "(line 548,col 9)-(line 548,col 19)",
        "(line 549,col 9)-(line 549,col 61)",
        "(line 550,col 9)-(line 550,col 61)",
        "(line 551,col 9)-(line 551,col 19)",
        "(line 552,col 9)-(line 552,col 60)",
        "(line 553,col 9)-(line 553,col 60)",
        "(line 554,col 9)-(line 554,col 19)",
        "(line 555,col 9)-(line 555,col 61)",
        "(line 556,col 9)-(line 556,col 61)",
        "(line 557,col 9)-(line 557,col 19)",
        "(line 558,col 9)-(line 558,col 60)",
        "(line 559,col 9)-(line 559,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsEqualCollectionEquator()",
      "begin_line": 562,
      "end_line": 590,
      "comment": "",
      "child_ranges": [
        "(line 564,col 9)-(line 564,col 101)",
        "(line 567,col 9)-(line 581,col 10)",
        "(line 583,col 9)-(line 583,col 83)",
        "(line 584,col 9)-(line 584,col 77)",
        "(line 585,col 9)-(line 585,col 77)",
        "(line 587,col 9)-(line 587,col 79)",
        "(line 588,col 9)-(line 588,col 97)",
        "(line 589,col 9)-(line 589,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-6eec87de-baf0-4de7-9c49-b2defd74af87.equate(java.lang.Integer, java.lang.Integer)",
      "begin_line": 568,
      "end_line": 575,
      "comment": "",
      "child_ranges": [
        "(line 570,col 17)-(line 574,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-ad43c662-f8fe-4d57-a97d-f950aeb3c0f0.hash(java.lang.Integer)",
      "begin_line": 577,
      "end_line": 580,
      "comment": "",
      "child_ranges": [
        "(line 579,col 17)-(line 579,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsEqualCollectionNullEquator()",
      "begin_line": 592,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsProperSubCollection()",
      "begin_line": 597,
      "end_line": 617,
      "comment": "",
      "child_ranges": [
        "(line 599,col 9)-(line 599,col 61)",
        "(line 600,col 9)-(line 600,col 61)",
        "(line 601,col 9)-(line 601,col 65)",
        "(line 602,col 9)-(line 602,col 19)",
        "(line 603,col 9)-(line 603,col 64)",
        "(line 604,col 9)-(line 604,col 65)",
        "(line 605,col 9)-(line 605,col 65)",
        "(line 606,col 9)-(line 606,col 65)",
        "(line 607,col 9)-(line 607,col 19)",
        "(line 608,col 9)-(line 608,col 19)",
        "(line 609,col 9)-(line 609,col 19)",
        "(line 610,col 9)-(line 610,col 65)",
        "(line 611,col 9)-(line 611,col 65)",
        "(line 612,col 9)-(line 612,col 19)",
        "(line 613,col 9)-(line 613,col 64)",
        "(line 614,col 9)-(line 614,col 127)",
        "(line 615,col 9)-(line 615,col 93)",
        "(line 616,col 9)-(line 616,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.find()",
      "begin_line": 619,
      "end_line": 630,
      "comment": "",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 69)",
        "(line 623,col 9)-(line 623,col 72)",
        "(line 624,col 9)-(line 624,col 35)",
        "(line 625,col 9)-(line 625,col 52)",
        "(line 626,col 9)-(line 626,col 64)",
        "(line 627,col 9)-(line 627,col 33)",
        "(line 628,col 9)-(line 628,col 61)",
        "(line 629,col 9)-(line 629,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.forAllDoCollection()",
      "begin_line": 632,
      "end_line": 650,
      "comment": "",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 94)",
        "(line 636,col 9)-(line 636,col 89)",
        "(line 637,col 9)-(line 637,col 29)",
        "(line 638,col 9)-(line 638,col 29)",
        "(line 639,col 9)-(line 639,col 96)",
        "(line 640,col 9)-(line 640,col 47)",
        "(line 641,col 9)-(line 641,col 67)",
        "(line 643,col 9)-(line 643,col 91)",
        "(line 644,col 9)-(line 644,col 34)",
        "(line 645,col 9)-(line 645,col 67)",
        "(line 646,col 9)-(line 646,col 102)",
        "(line 647,col 9)-(line 647,col 22)",
        "(line 649,col 9)-(line 649,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.forAllDoIterator()",
      "begin_line": 652,
      "end_line": 670,
      "comment": "",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 94)",
        "(line 656,col 9)-(line 656,col 89)",
        "(line 657,col 9)-(line 657,col 29)",
        "(line 658,col 9)-(line 658,col 29)",
        "(line 659,col 9)-(line 659,col 107)",
        "(line 660,col 9)-(line 660,col 47)",
        "(line 661,col 9)-(line 661,col 67)",
        "(line 663,col 9)-(line 663,col 102)",
        "(line 664,col 9)-(line 664,col 34)",
        "(line 665,col 9)-(line 665,col 67)",
        "(line 666,col 9)-(line 666,col 100)",
        "(line 667,col 9)-(line 667,col 22)",
        "(line 669,col 9)-(line 669,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.forAllDoFailure()",
      "begin_line": 672,
      "end_line": 679,
      "comment": "",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 81)",
        "(line 676,col 9)-(line 676,col 63)",
        "(line 677,col 9)-(line 677,col 21)",
        "(line 678,col 9)-(line 678,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.forAllButLastDoCollection()",
      "begin_line": 681,
      "end_line": 723,
      "comment": "",
      "child_ranges": [
        "(line 684,col 9)-(line 684,col 97)",
        "(line 685,col 9)-(line 685,col 95)",
        "(line 686,col 9)-(line 686,col 29)",
        "(line 687,col 9)-(line 687,col 29)",
        "(line 688,col 9)-(line 688,col 95)",
        "(line 689,col 9)-(line 689,col 45)",
        "(line 690,col 9)-(line 690,col 68)",
        "(line 692,col 9)-(line 692,col 20)",
        "(line 693,col 9)-(line 693,col 29)",
        "(line 694,col 9)-(line 694,col 72)",
        "(line 695,col 9)-(line 695,col 45)",
        "(line 696,col 9)-(line 696,col 44)",
        "(line 698,col 9)-(line 698,col 20)",
        "(line 699,col 9)-(line 699,col 72)",
        "(line 700,col 9)-(line 700,col 32)",
        "(line 702,col 9)-(line 702,col 66)",
        "(line 703,col 9)-(line 703,col 55)",
        "(line 704,col 9)-(line 709,col 12)",
        "(line 710,col 9)-(line 710,col 49)",
        "(line 712,col 9)-(line 712,col 58)",
        "(line 713,col 9)-(line 713,col 58)",
        "(line 714,col 9)-(line 719,col 12)",
        "(line 720,col 9)-(line 720,col 48)",
        "(line 721,col 9)-(line 721,col 85)",
        "(line 722,col 9)-(line 722,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-5819a61a-b788-4426-8629-25684b45721e.execute(java.lang.String)",
      "begin_line": 705,
      "end_line": 708,
      "comment": "",
      "child_ranges": [
        "(line 707,col 17)-(line 707,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-8833d11f-5022-4db8-bfea-476799625c1d.execute(java.lang.String)",
      "begin_line": 715,
      "end_line": 718,
      "comment": "",
      "child_ranges": [
        "(line 717,col 17)-(line 717,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.forAllButLastDoIterator()",
      "begin_line": 725,
      "end_line": 738,
      "comment": "",
      "child_ranges": [
        "(line 728,col 9)-(line 728,col 97)",
        "(line 729,col 9)-(line 729,col 95)",
        "(line 730,col 9)-(line 730,col 29)",
        "(line 731,col 9)-(line 731,col 29)",
        "(line 732,col 9)-(line 732,col 106)",
        "(line 733,col 9)-(line 733,col 45)",
        "(line 734,col 9)-(line 734,col 68)",
        "(line 736,col 9)-(line 736,col 108)",
        "(line 737,col 9)-(line 737,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getFromMap()",
      "begin_line": 740,
      "end_line": 778,
      "comment": "",
      "child_ranges": [
        "(line 743,col 9)-(line 743,col 75)",
        "(line 744,col 9)-(line 744,col 40)",
        "(line 745,col 9)-(line 745,col 38)",
        "(line 747,col 9)-(line 747,col 72)",
        "(line 748,col 9)-(line 748,col 75)",
        "(line 749,col 9)-(line 749,col 52)",
        "(line 750,col 9)-(line 750,col 49)",
        "(line 751,col 9)-(line 751,col 52)",
        "(line 752,col 9)-(line 752,col 38)",
        "(line 755,col 9)-(line 760,col 9)",
        "(line 761,col 9)-(line 766,col 9)",
        "(line 769,col 9)-(line 769,col 76)",
        "(line 770,col 9)-(line 770,col 35)",
        "(line 771,col 9)-(line 771,col 33)",
        "(line 772,col 9)-(line 772,col 69)",
        "(line 773,col 9)-(line 773,col 47)",
        "(line 774,col 9)-(line 774,col 46)",
        "(line 775,col 9)-(line 775,col 43)",
        "(line 776,col 9)-(line 776,col 46)",
        "(line 777,col 9)-(line 777,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getFromList()",
      "begin_line": 784,
      "end_line": 796,
      "comment": "\n     * Tests that {@link List}s are handled correctly - e.g. using\n     * {@link List#get(int)}.\n     ",
      "child_ranges": [
        "(line 787,col 9)-(line 787,col 57)",
        "(line 788,col 9)-(line 788,col 46)",
        "(line 789,col 9)-(line 789,col 45)",
        "(line 790,col 9)-(line 790,col 17)",
        "(line 791,col 9)-(line 791,col 59)",
        "(line 792,col 9)-(line 792,col 37)",
        "(line 793,col 9)-(line 793,col 58)",
        "(line 795,col 9)-(line 795,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getFromIterator()",
      "begin_line": 798,
      "end_line": 815,
      "comment": "",
      "child_ranges": [
        "(line 802,col 9)-(line 802,col 58)",
        "(line 803,col 9)-(line 803,col 64)",
        "(line 804,col 9)-(line 804,col 40)",
        "(line 805,col 9)-(line 805,col 64)",
        "(line 808,col 9)-(line 813,col 9)",
        "(line 814,col 9)-(line 814,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getFromEnumeration()",
      "begin_line": 817,
      "end_line": 837,
      "comment": "",
      "child_ranges": [
        "(line 821,col 9)-(line 821,col 59)",
        "(line 822,col 9)-(line 822,col 34)",
        "(line 823,col 9)-(line 823,col 33)",
        "(line 824,col 9)-(line 824,col 51)",
        "(line 825,col 9)-(line 825,col 57)",
        "(line 826,col 9)-(line 826,col 31)",
        "(line 827,col 9)-(line 827,col 56)",
        "(line 830,col 9)-(line 835,col 9)",
        "(line 836,col 9)-(line 836,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getFromIterable()",
      "begin_line": 839,
      "end_line": 849,
      "comment": "",
      "child_ranges": [
        "(line 843,col 9)-(line 843,col 54)",
        "(line 844,col 9)-(line 844,col 30)",
        "(line 845,col 9)-(line 845,col 61)",
        "(line 848,col 9)-(line 848,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getFromObjectArray()",
      "begin_line": 851,
      "end_line": 863,
      "comment": "",
      "child_ranges": [
        "(line 854,col 9)-(line 854,col 48)",
        "(line 855,col 9)-(line 855,col 29)",
        "(line 856,col 9)-(line 856,col 28)",
        "(line 857,col 9)-(line 857,col 63)",
        "(line 858,col 9)-(line 858,col 62)",
        "(line 862,col 9)-(line 862,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getFromPrimitiveArray()",
      "begin_line": 865,
      "end_line": 877,
      "comment": "",
      "child_ranges": [
        "(line 868,col 9)-(line 868,col 39)",
        "(line 869,col 9)-(line 869,col 22)",
        "(line 870,col 9)-(line 870,col 22)",
        "(line 871,col 9)-(line 871,col 56)",
        "(line 872,col 9)-(line 872,col 56)",
        "(line 876,col 9)-(line 876,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getFromObject()",
      "begin_line": 879,
      "end_line": 884,
      "comment": "",
      "child_ranges": [
        "(line 882,col 9)-(line 882,col 40)",
        "(line 883,col 9)-(line 883,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSize_List()",
      "begin_line": 887,
      "end_line": 897,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 889,col 9)-(line 889,col 33)",
        "(line 890,col 9)-(line 890,col 52)",
        "(line 891,col 9)-(line 891,col 39)",
        "(line 892,col 9)-(line 892,col 52)",
        "(line 893,col 9)-(line 893,col 22)",
        "(line 894,col 9)-(line 894,col 52)",
        "(line 895,col 9)-(line 895,col 22)",
        "(line 896,col 9)-(line 896,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSize_Map()",
      "begin_line": 899,
      "end_line": 907,
      "comment": "",
      "child_ranges": [
        "(line 901,col 9)-(line 901,col 70)",
        "(line 902,col 9)-(line 902,col 51)",
        "(line 903,col 9)-(line 903,col 26)",
        "(line 904,col 9)-(line 904,col 51)",
        "(line 905,col 9)-(line 905,col 26)",
        "(line 906,col 9)-(line 906,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSize_Array()",
      "begin_line": 909,
      "end_line": 920,
      "comment": "",
      "child_ranges": [
        "(line 911,col 9)-(line 911,col 51)",
        "(line 912,col 9)-(line 912,col 59)",
        "(line 914,col 9)-(line 914,col 51)",
        "(line 915,col 9)-(line 915,col 59)",
        "(line 916,col 9)-(line 916,col 29)",
        "(line 917,col 9)-(line 917,col 29)",
        "(line 918,col 9)-(line 918,col 29)",
        "(line 919,col 9)-(line 919,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSize_PrimitiveArray()",
      "begin_line": 922,
      "end_line": 933,
      "comment": "",
      "child_ranges": [
        "(line 924,col 9)-(line 924,col 42)",
        "(line 925,col 9)-(line 925,col 56)",
        "(line 927,col 9)-(line 927,col 51)",
        "(line 928,col 9)-(line 928,col 59)",
        "(line 929,col 9)-(line 929,col 30)",
        "(line 930,col 9)-(line 930,col 30)",
        "(line 931,col 9)-(line 931,col 30)",
        "(line 932,col 9)-(line 932,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSize_Enumeration()",
      "begin_line": 935,
      "end_line": 943,
      "comment": "",
      "child_ranges": [
        "(line 937,col 9)-(line 937,col 57)",
        "(line 938,col 9)-(line 938,col 63)",
        "(line 939,col 9)-(line 939,col 22)",
        "(line 940,col 9)-(line 940,col 63)",
        "(line 941,col 9)-(line 941,col 22)",
        "(line 942,col 9)-(line 942,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSize_Iterator()",
      "begin_line": 945,
      "end_line": 953,
      "comment": "",
      "child_ranges": [
        "(line 947,col 9)-(line 947,col 58)",
        "(line 948,col 9)-(line 948,col 63)",
        "(line 949,col 9)-(line 949,col 22)",
        "(line 950,col 9)-(line 950,col 63)",
        "(line 951,col 9)-(line 951,col 22)",
        "(line 952,col 9)-(line 952,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSize_Other()",
      "begin_line": 955,
      "end_line": 958,
      "comment": "",
      "child_ranges": [
        "(line 957,col 9)-(line 957,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSizeIsEmpty_Null()",
      "begin_line": 961,
      "end_line": 964,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 963,col 9)-(line 963,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSizeIsEmpty_List()",
      "begin_line": 966,
      "end_line": 972,
      "comment": "",
      "child_ranges": [
        "(line 968,col 9)-(line 968,col 58)",
        "(line 969,col 9)-(line 969,col 62)",
        "(line 970,col 9)-(line 970,col 22)",
        "(line 971,col 9)-(line 971,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSizeIsEmpty_Map()",
      "begin_line": 974,
      "end_line": 980,
      "comment": "",
      "child_ranges": [
        "(line 976,col 9)-(line 976,col 70)",
        "(line 977,col 9)-(line 977,col 61)",
        "(line 978,col 9)-(line 978,col 26)",
        "(line 979,col 9)-(line 979,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSizeIsEmpty_Array()",
      "begin_line": 982,
      "end_line": 993,
      "comment": "",
      "child_ranges": [
        "(line 984,col 9)-(line 984,col 51)",
        "(line 985,col 9)-(line 985,col 69)",
        "(line 987,col 9)-(line 987,col 51)",
        "(line 988,col 9)-(line 988,col 70)",
        "(line 989,col 9)-(line 989,col 29)",
        "(line 990,col 9)-(line 990,col 29)",
        "(line 991,col 9)-(line 991,col 29)",
        "(line 992,col 9)-(line 992,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSizeIsEmpty_PrimitiveArray()",
      "begin_line": 995,
      "end_line": 1006,
      "comment": "",
      "child_ranges": [
        "(line 997,col 9)-(line 997,col 42)",
        "(line 998,col 9)-(line 998,col 66)",
        "(line 1000,col 9)-(line 1000,col 51)",
        "(line 1001,col 9)-(line 1001,col 70)",
        "(line 1002,col 9)-(line 1002,col 30)",
        "(line 1003,col 9)-(line 1003,col 30)",
        "(line 1004,col 9)-(line 1004,col 30)",
        "(line 1005,col 9)-(line 1005,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSizeIsEmpty_Enumeration()",
      "begin_line": 1008,
      "end_line": 1017,
      "comment": "",
      "child_ranges": [
        "(line 1010,col 9)-(line 1010,col 57)",
        "(line 1011,col 9)-(line 1011,col 73)",
        "(line 1012,col 9)-(line 1012,col 22)",
        "(line 1013,col 9)-(line 1013,col 74)",
        "(line 1014,col 9)-(line 1014,col 55)",
        "(line 1015,col 9)-(line 1015,col 25)",
        "(line 1016,col 9)-(line 1016,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSizeIsEmpty_Iterator()",
      "begin_line": 1019,
      "end_line": 1028,
      "comment": "",
      "child_ranges": [
        "(line 1021,col 9)-(line 1021,col 58)",
        "(line 1022,col 9)-(line 1022,col 73)",
        "(line 1023,col 9)-(line 1023,col 22)",
        "(line 1024,col 9)-(line 1024,col 74)",
        "(line 1025,col 9)-(line 1025,col 52)",
        "(line 1026,col 9)-(line 1026,col 18)",
        "(line 1027,col 9)-(line 1027,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSizeIsEmpty_Other()",
      "begin_line": 1030,
      "end_line": 1037,
      "comment": "",
      "child_ranges": [
        "(line 1032,col 9)-(line 1036,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsEmptyWithEmptyCollection()",
      "begin_line": 1040,
      "end_line": 1044,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 1042,col 9)-(line 1042,col 64)",
        "(line 1043,col 9)-(line 1043,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsEmptyWithNonEmptyCollection()",
      "begin_line": 1046,
      "end_line": 1051,
      "comment": "",
      "child_ranges": [
        "(line 1048,col 9)-(line 1048,col 64)",
        "(line 1049,col 9)-(line 1049,col 25)",
        "(line 1050,col 9)-(line 1050,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsEmptyWithNull()",
      "begin_line": 1053,
      "end_line": 1057,
      "comment": "",
      "child_ranges": [
        "(line 1055,col 9)-(line 1055,col 40)",
        "(line 1056,col 9)-(line 1056,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsNotEmptyWithEmptyCollection()",
      "begin_line": 1059,
      "end_line": 1063,
      "comment": "",
      "child_ranges": [
        "(line 1061,col 9)-(line 1061,col 64)",
        "(line 1062,col 9)-(line 1062,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsNotEmptyWithNonEmptyCollection()",
      "begin_line": 1065,
      "end_line": 1070,
      "comment": "",
      "child_ranges": [
        "(line 1067,col 9)-(line 1067,col 64)",
        "(line 1068,col 9)-(line 1068,col 25)",
        "(line 1069,col 9)-(line 1069,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsNotEmptyWithNull()",
      "begin_line": 1072,
      "end_line": 1076,
      "comment": "",
      "child_ranges": [
        "(line 1074,col 9)-(line 1074,col 40)",
        "(line 1075,col 9)-(line 1075,col 62)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "EQUALS_TWO"
      ],
      "begin_line": 1079,
      "end_line": 1084,
      "comment": " -----------------------------------------------------------------------"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-7d1be832-8e1f-414b-85e1-f6a99631ca0a.evaluate(java.lang.Number)",
      "begin_line": 1080,
      "end_line": 1083,
      "comment": "",
      "child_ranges": [
        "(line 1082,col 13)-(line 1082,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.filter()",
      "begin_line": 1087,
      "end_line": 1098,
      "comment": "Up to here",
      "child_ranges": [
        "(line 1089,col 9)-(line 1089,col 60)",
        "(line 1090,col 9)-(line 1090,col 20)",
        "(line 1091,col 9)-(line 1091,col 20)",
        "(line 1092,col 9)-(line 1092,col 20)",
        "(line 1093,col 9)-(line 1093,col 20)",
        "(line 1094,col 9)-(line 1094,col 48)",
        "(line 1095,col 9)-(line 1095,col 65)",
        "(line 1096,col 9)-(line 1096,col 37)",
        "(line 1097,col 9)-(line 1097,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.filterNullParameters()",
      "begin_line": 1100,
      "end_line": 1109,
      "comment": "",
      "child_ranges": [
        "(line 1102,col 9)-(line 1102,col 61)",
        "(line 1103,col 9)-(line 1103,col 57)",
        "(line 1104,col 9)-(line 1104,col 38)",
        "(line 1105,col 9)-(line 1105,col 62)",
        "(line 1106,col 9)-(line 1106,col 38)",
        "(line 1107,col 9)-(line 1107,col 56)",
        "(line 1108,col 9)-(line 1108,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.filterInverse()",
      "begin_line": 1111,
      "end_line": 1124,
      "comment": "",
      "child_ranges": [
        "(line 1113,col 9)-(line 1113,col 60)",
        "(line 1114,col 9)-(line 1114,col 20)",
        "(line 1115,col 9)-(line 1115,col 20)",
        "(line 1116,col 9)-(line 1116,col 20)",
        "(line 1117,col 9)-(line 1117,col 20)",
        "(line 1118,col 9)-(line 1118,col 48)",
        "(line 1119,col 9)-(line 1119,col 72)",
        "(line 1120,col 9)-(line 1120,col 37)",
        "(line 1121,col 9)-(line 1121,col 43)",
        "(line 1122,col 9)-(line 1122,col 43)",
        "(line 1123,col 9)-(line 1123,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.filterInverseNullParameters()",
      "begin_line": 1126,
      "end_line": 1135,
      "comment": "",
      "child_ranges": [
        "(line 1128,col 9)-(line 1128,col 61)",
        "(line 1129,col 9)-(line 1129,col 64)",
        "(line 1130,col 9)-(line 1130,col 38)",
        "(line 1131,col 9)-(line 1131,col 69)",
        "(line 1132,col 9)-(line 1132,col 38)",
        "(line 1133,col 9)-(line 1133,col 63)",
        "(line 1134,col 9)-(line 1134,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.countMatches()",
      "begin_line": 1137,
      "end_line": 1144,
      "comment": "",
      "child_ranges": [
        "(line 1140,col 9)-(line 1140,col 77)",
        "(line 1141,col 9)-(line 1141,col 71)",
        "(line 1142,col 9)-(line 1142,col 72)",
        "(line 1143,col 9)-(line 1143,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.exists()",
      "begin_line": 1146,
      "end_line": 1161,
      "comment": "",
      "child_ranges": [
        "(line 1149,col 9)-(line 1149,col 60)",
        "(line 1150,col 9)-(line 1150,col 56)",
        "(line 1151,col 9)-(line 1151,col 56)",
        "(line 1152,col 9)-(line 1152,col 62)",
        "(line 1153,col 9)-(line 1153,col 62)",
        "(line 1154,col 9)-(line 1154,col 20)",
        "(line 1155,col 9)-(line 1155,col 20)",
        "(line 1156,col 9)-(line 1156,col 20)",
        "(line 1157,col 9)-(line 1157,col 62)",
        "(line 1159,col 9)-(line 1159,col 20)",
        "(line 1160,col 9)-(line 1160,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.select()",
      "begin_line": 1163,
      "end_line": 1178,
      "comment": "",
      "child_ranges": [
        "(line 1165,col 9)-(line 1165,col 60)",
        "(line 1166,col 9)-(line 1166,col 20)",
        "(line 1167,col 9)-(line 1167,col 20)",
        "(line 1168,col 9)-(line 1168,col 20)",
        "(line 1169,col 9)-(line 1169,col 20)",
        "(line 1171,col 9)-(line 1171,col 85)",
        "(line 1172,col 9)-(line 1172,col 92)",
        "(line 1173,col 9)-(line 1173,col 104)",
        "(line 1174,col 9)-(line 1174,col 72)",
        "(line 1175,col 9)-(line 1175,col 37)",
        "(line 1176,col 9)-(line 1176,col 40)",
        "(line 1177,col 9)-(line 1177,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.selectWithOutputCollections()",
      "begin_line": 1180,
      "end_line": 1206,
      "comment": "",
      "child_ranges": [
        "(line 1182,col 9)-(line 1182,col 55)",
        "(line 1183,col 9)-(line 1183,col 21)",
        "(line 1184,col 9)-(line 1184,col 21)",
        "(line 1185,col 9)-(line 1185,col 21)",
        "(line 1186,col 9)-(line 1186,col 21)",
        "(line 1188,col 9)-(line 1188,col 56)",
        "(line 1189,col 9)-(line 1189,col 58)",
        "(line 1191,col 9)-(line 1191,col 68)",
        "(line 1194,col 9)-(line 1194,col 39)",
        "(line 1195,col 9)-(line 1195,col 77)",
        "(line 1198,col 9)-(line 1198,col 39)",
        "(line 1199,col 9)-(line 1199,col 63)",
        "(line 1201,col 9)-(line 1201,col 23)",
        "(line 1202,col 9)-(line 1202,col 25)",
        "(line 1203,col 9)-(line 1203,col 83)",
        "(line 1204,col 9)-(line 1204,col 37)",
        "(line 1205,col 9)-(line 1205,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.selectRejected()",
      "begin_line": 1208,
      "end_line": 1225,
      "comment": "",
      "child_ranges": [
        "(line 1210,col 9)-(line 1210,col 54)",
        "(line 1211,col 9)-(line 1211,col 21)",
        "(line 1212,col 9)-(line 1212,col 21)",
        "(line 1213,col 9)-(line 1213,col 21)",
        "(line 1214,col 9)-(line 1214,col 21)",
        "(line 1215,col 9)-(line 1215,col 90)",
        "(line 1216,col 9)-(line 1216,col 102)",
        "(line 1217,col 9)-(line 1217,col 112)",
        "(line 1218,col 9)-(line 1218,col 72)",
        "(line 1219,col 9)-(line 1219,col 72)",
        "(line 1220,col 9)-(line 1220,col 37)",
        "(line 1221,col 9)-(line 1221,col 40)",
        "(line 1222,col 9)-(line 1222,col 41)",
        "(line 1223,col 9)-(line 1223,col 41)",
        "(line 1224,col 9)-(line 1224,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.collect()",
      "begin_line": 1227,
      "end_line": 1260,
      "comment": "",
      "child_ranges": [
        "(line 1229,col 9)-(line 1229,col 95)",
        "(line 1230,col 9)-(line 1230,col 105)",
        "(line 1231,col 9)-(line 1231,col 60)",
        "(line 1232,col 9)-(line 1232,col 40)",
        "(line 1234,col 9)-(line 1234,col 31)",
        "(line 1235,col 9)-(line 1235,col 90)",
        "(line 1236,col 9)-(line 1236,col 54)",
        "(line 1237,col 9)-(line 1237,col 34)",
        "(line 1239,col 9)-(line 1239,col 42)",
        "(line 1240,col 9)-(line 1240,col 87)",
        "(line 1242,col 9)-(line 1242,col 40)",
        "(line 1243,col 9)-(line 1243,col 68)",
        "(line 1244,col 9)-(line 1244,col 60)",
        "(line 1245,col 9)-(line 1245,col 40)",
        "(line 1247,col 9)-(line 1247,col 42)",
        "(line 1248,col 9)-(line 1248,col 85)",
        "(line 1249,col 9)-(line 1249,col 60)",
        "(line 1250,col 9)-(line 1250,col 71)",
        "(line 1251,col 9)-(line 1251,col 108)",
        "(line 1252,col 9)-(line 1252,col 43)",
        "(line 1254,col 9)-(line 1254,col 44)",
        "(line 1255,col 9)-(line 1255,col 100)",
        "(line 1256,col 9)-(line 1256,col 74)",
        "(line 1257,col 9)-(line 1257,col 64)",
        "(line 1258,col 9)-(line 1258,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.assertCollectResult(java.util.Collection\u003cjava.lang.Number\u003e)",
      "begin_line": 1262,
      "end_line": 1265,
      "comment": "",
      "child_ranges": [
        "(line 1263,col 9)-(line 1263,col 73)",
        "(line 1264,col 9)-(line 1264,col 71)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "TRANSFORM_TO_INTEGER"
      ],
      "begin_line": 1267,
      "end_line": 1272,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-90c9afed-d59f-4368-bf30-00519758ebf0.transform(java.lang.Object)",
      "begin_line": 1268,
      "end_line": 1271,
      "comment": "",
      "child_ranges": [
        "(line 1270,col 13)-(line 1270,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.transform1()",
      "begin_line": 1274,
      "end_line": 1296,
      "comment": "",
      "child_ranges": [
        "(line 1276,col 9)-(line 1276,col 52)",
        "(line 1277,col 9)-(line 1277,col 21)",
        "(line 1278,col 9)-(line 1278,col 21)",
        "(line 1279,col 9)-(line 1279,col 21)",
        "(line 1280,col 9)-(line 1280,col 62)",
        "(line 1281,col 9)-(line 1281,col 37)",
        "(line 1282,col 9)-(line 1282,col 37)",
        "(line 1283,col 9)-(line 1283,col 37)",
        "(line 1284,col 9)-(line 1284,col 37)",
        "(line 1286,col 9)-(line 1286,col 39)",
        "(line 1287,col 9)-(line 1287,col 21)",
        "(line 1288,col 9)-(line 1288,col 21)",
        "(line 1289,col 9)-(line 1289,col 21)",
        "(line 1290,col 9)-(line 1290,col 62)",
        "(line 1291,col 9)-(line 1291,col 37)",
        "(line 1292,col 9)-(line 1292,col 46)",
        "(line 1293,col 9)-(line 1293,col 37)",
        "(line 1294,col 9)-(line 1294,col 46)",
        "(line 1295,col 9)-(line 1295,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.transform2()",
      "begin_line": 1298,
      "end_line": 1312,
      "comment": "",
      "child_ranges": [
        "(line 1300,col 9)-(line 1300,col 54)",
        "(line 1301,col 9)-(line 1301,col 20)",
        "(line 1302,col 9)-(line 1302,col 20)",
        "(line 1303,col 9)-(line 1303,col 20)",
        "(line 1304,col 9)-(line 1309,col 11)",
        "(line 1310,col 9)-(line 1310,col 36)",
        "(line 1311,col 9)-(line 1311,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-913f54f2-1eb3-4fb0-9754-773ce1351460.transform(java.lang.Object)",
      "begin_line": 1305,
      "end_line": 1308,
      "comment": "",
      "child_ranges": [
        "(line 1307,col 17)-(line 1307,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.addIgnoreNull()",
      "begin_line": 1315,
      "end_line": 1328,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 1317,col 9)-(line 1317,col 54)",
        "(line 1318,col 9)-(line 1318,col 21)",
        "(line 1319,col 9)-(line 1319,col 21)",
        "(line 1320,col 9)-(line 1320,col 21)",
        "(line 1321,col 9)-(line 1321,col 62)",
        "(line 1322,col 9)-(line 1322,col 36)",
        "(line 1323,col 9)-(line 1323,col 61)",
        "(line 1324,col 9)-(line 1324,col 36)",
        "(line 1325,col 9)-(line 1325,col 68)",
        "(line 1326,col 9)-(line 1326,col 36)",
        "(line 1327,col 9)-(line 1327,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.predicatedCollection()",
      "begin_line": 1331,
      "end_line": 1348,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 1333,col 9)-(line 1333,col 94)",
        "(line 1334,col 9)-(line 1334,col 113)",
        "(line 1335,col 9)-(line 1335,col 115)",
        "(line 1336,col 9)-(line 1341,col 9)",
        "(line 1342,col 9)-(line 1347,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.isFull()",
      "begin_line": 1350,
      "end_line": 1369,
      "comment": "",
      "child_ranges": [
        "(line 1352,col 9)-(line 1352,col 54)",
        "(line 1353,col 9)-(line 1353,col 21)",
        "(line 1354,col 9)-(line 1354,col 21)",
        "(line 1355,col 9)-(line 1355,col 21)",
        "(line 1356,col 9)-(line 1360,col 9)",
        "(line 1361,col 9)-(line 1361,col 49)",
        "(line 1363,col 9)-(line 1363,col 81)",
        "(line 1364,col 9)-(line 1364,col 57)",
        "(line 1365,col 9)-(line 1365,col 24)",
        "(line 1366,col 9)-(line 1366,col 49)",
        "(line 1367,col 9)-(line 1367,col 21)",
        "(line 1368,col 9)-(line 1368,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.isEmpty()",
      "begin_line": 1371,
      "end_line": 1375,
      "comment": "",
      "child_ranges": [
        "(line 1373,col 9)-(line 1373,col 54)",
        "(line 1374,col 9)-(line 1374,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.maxSize()",
      "begin_line": 1377,
      "end_line": 1396,
      "comment": "",
      "child_ranges": [
        "(line 1379,col 9)-(line 1379,col 54)",
        "(line 1380,col 9)-(line 1380,col 21)",
        "(line 1381,col 9)-(line 1381,col 21)",
        "(line 1382,col 9)-(line 1382,col 21)",
        "(line 1383,col 9)-(line 1387,col 9)",
        "(line 1388,col 9)-(line 1388,col 55)",
        "(line 1390,col 9)-(line 1390,col 69)",
        "(line 1391,col 9)-(line 1391,col 54)",
        "(line 1392,col 9)-(line 1392,col 24)",
        "(line 1393,col 9)-(line 1393,col 54)",
        "(line 1394,col 9)-(line 1394,col 21)",
        "(line 1395,col 9)-(line 1395,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.intersectionUsesMethodEquals()",
      "begin_line": 1398,
      "end_line": 1437,
      "comment": "",
      "child_ranges": [
        "(line 1401,col 9)-(line 1401,col 45)",
        "(line 1402,col 9)-(line 1402,col 45)",
        "(line 1405,col 9)-(line 1405,col 33)",
        "(line 1406,col 9)-(line 1406,col 33)",
        "(line 1409,col 9)-(line 1409,col 33)",
        "(line 1412,col 9)-(line 1412,col 64)",
        "(line 1413,col 9)-(line 1413,col 66)",
        "(line 1417,col 9)-(line 1417,col 23)",
        "(line 1418,col 9)-(line 1418,col 23)",
        "(line 1422,col 9)-(line 1422,col 89)",
        "(line 1423,col 9)-(line 1423,col 45)",
        "(line 1428,col 9)-(line 1428,col 59)",
        "(line 1429,col 9)-(line 1429,col 81)",
        "(line 1433,col 9)-(line 1433,col 33)",
        "(line 1434,col 9)-(line 1434,col 33)",
        "(line 1435,col 9)-(line 1435,col 33)",
        "(line 1436,col 9)-(line 1436,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testRetainAll()",
      "begin_line": 1441,
      "end_line": 1471,
      "comment": "Up to here",
      "child_ranges": [
        "(line 1443,col 9)-(line 1443,col 58)",
        "(line 1444,col 9)-(line 1444,col 22)",
        "(line 1445,col 9)-(line 1445,col 22)",
        "(line 1446,col 9)-(line 1446,col 22)",
        "(line 1447,col 9)-(line 1447,col 57)",
        "(line 1448,col 9)-(line 1448,col 21)",
        "(line 1449,col 9)-(line 1449,col 21)",
        "(line 1450,col 9)-(line 1450,col 21)",
        "(line 1452,col 9)-(line 1452,col 79)",
        "(line 1453,col 9)-(line 1453,col 39)",
        "(line 1454,col 9)-(line 1454,col 49)",
        "(line 1455,col 9)-(line 1455,col 42)",
        "(line 1456,col 9)-(line 1456,col 49)",
        "(line 1457,col 9)-(line 1457,col 37)",
        "(line 1458,col 9)-(line 1458,col 47)",
        "(line 1459,col 9)-(line 1459,col 47)",
        "(line 1460,col 9)-(line 1460,col 47)",
        "(line 1461,col 9)-(line 1461,col 36)",
        "(line 1462,col 9)-(line 1462,col 46)",
        "(line 1463,col 9)-(line 1463,col 46)",
        "(line 1464,col 9)-(line 1464,col 46)",
        "(line 1466,col 9)-(line 1470,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testRemoveAll()",
      "begin_line": 1473,
      "end_line": 1503,
      "comment": "",
      "child_ranges": [
        "(line 1475,col 9)-(line 1475,col 58)",
        "(line 1476,col 9)-(line 1476,col 22)",
        "(line 1477,col 9)-(line 1477,col 22)",
        "(line 1478,col 9)-(line 1478,col 22)",
        "(line 1479,col 9)-(line 1479,col 57)",
        "(line 1480,col 9)-(line 1480,col 21)",
        "(line 1481,col 9)-(line 1481,col 21)",
        "(line 1482,col 9)-(line 1482,col 21)",
        "(line 1484,col 9)-(line 1484,col 79)",
        "(line 1485,col 9)-(line 1485,col 39)",
        "(line 1486,col 9)-(line 1486,col 42)",
        "(line 1487,col 9)-(line 1487,col 49)",
        "(line 1488,col 9)-(line 1488,col 42)",
        "(line 1489,col 9)-(line 1489,col 37)",
        "(line 1490,col 9)-(line 1490,col 47)",
        "(line 1491,col 9)-(line 1491,col 47)",
        "(line 1492,col 9)-(line 1492,col 47)",
        "(line 1493,col 9)-(line 1493,col 36)",
        "(line 1494,col 9)-(line 1494,col 46)",
        "(line 1495,col 9)-(line 1495,col 46)",
        "(line 1496,col 9)-(line 1496,col 46)",
        "(line 1498,col 9)-(line 1502,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testTransformedCollection()",
      "begin_line": 1506,
      "end_line": 1523,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 1508,col 9)-(line 1508,col 90)",
        "(line 1509,col 9)-(line 1509,col 117)",
        "(line 1510,col 9)-(line 1510,col 117)",
        "(line 1511,col 9)-(line 1516,col 9)",
        "(line 1517,col 9)-(line 1522,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testTransformedCollection_2()",
      "begin_line": 1525,
      "end_line": 1535,
      "comment": "",
      "child_ranges": [
        "(line 1527,col 9)-(line 1527,col 58)",
        "(line 1528,col 9)-(line 1528,col 22)",
        "(line 1529,col 9)-(line 1529,col 22)",
        "(line 1530,col 9)-(line 1530,col 22)",
        "(line 1531,col 9)-(line 1531,col 109)",
        "(line 1532,col 9)-(line 1532,col 49)",
        "(line 1533,col 9)-(line 1533,col 49)",
        "(line 1534,col 9)-(line 1534,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSynchronizedCollection()",
      "begin_line": 1537,
      "end_line": 1548,
      "comment": "",
      "child_ranges": [
        "(line 1540,col 9)-(line 1540,col 97)",
        "(line 1541,col 9)-(line 1541,col 113)",
        "(line 1542,col 9)-(line 1547,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testUnmodifiableCollection()",
      "begin_line": 1550,
      "end_line": 1561,
      "comment": "",
      "child_ranges": [
        "(line 1553,col 9)-(line 1553,col 97)",
        "(line 1554,col 9)-(line 1554,col 113)",
        "(line 1555,col 9)-(line 1560,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.emptyCollection()",
      "begin_line": 1563,
      "end_line": 1567,
      "comment": "",
      "child_ranges": [
        "(line 1565,col 9)-(line 1565,col 74)",
        "(line 1566,col 9)-(line 1566,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.emptyIfNull()",
      "begin_line": 1569,
      "end_line": 1574,
      "comment": "",
      "child_ranges": [
        "(line 1571,col 9)-(line 1571,col 64)",
        "(line 1572,col 9)-(line 1572,col 70)",
        "(line 1573,col 9)-(line 1573,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.addAllForIterable()",
      "begin_line": 1582,
      "end_line": 1616,
      "comment": "\n     * This test ensures that {@link Iterable}s are supported by {@link CollectionUtils}.\n     * Specifically, it uses mocks to ensure that if the passed in\n     * {@link Iterable} is a {@link Collection} then\n     * {@link Collection#addAll(Collection)} is called instead of iterating.\n     ",
      "child_ranges": [
        "(line 1584,col 9)-(line 1584,col 81)",
        "(line 1585,col 9)-(line 1585,col 64)",
        "(line 1586,col 9)-(line 1586,col 67)",
        "(line 1587,col 9)-(line 1587,col 67)",
        "(line 1588,col 9)-(line 1588,col 66)",
        "(line 1590,col 9)-(line 1590,col 56)",
        "(line 1591,col 9)-(line 1591,col 27)",
        "(line 1592,col 9)-(line 1592,col 27)",
        "(line 1593,col 9)-(line 1593,col 27)",
        "(line 1594,col 9)-(line 1594,col 52)",
        "(line 1595,col 9)-(line 1595,col 42)",
        "(line 1596,col 9)-(line 1596,col 42)",
        "(line 1597,col 9)-(line 1597,col 42)",
        "(line 1600,col 9)-(line 1600,col 58)",
        "(line 1603,col 9)-(line 1603,col 56)",
        "(line 1604,col 9)-(line 1604,col 27)",
        "(line 1605,col 9)-(line 1605,col 52)",
        "(line 1606,col 9)-(line 1606,col 43)",
        "(line 1607,col 9)-(line 1607,col 59)",
        "(line 1609,col 9)-(line 1609,col 17)",
        "(line 1610,col 9)-(line 1610,col 56)",
        "(line 1611,col 9)-(line 1611,col 61)",
        "(line 1613,col 9)-(line 1613,col 57)",
        "(line 1614,col 9)-(line 1614,col 62)",
        "(line 1615,col 9)-(line 1615,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.addAllForEnumeration()",
      "begin_line": 1618,
      "end_line": 1625,
      "comment": "",
      "child_ranges": [
        "(line 1620,col 9)-(line 1620,col 80)",
        "(line 1621,col 9)-(line 1621,col 20)",
        "(line 1622,col 9)-(line 1622,col 68)",
        "(line 1623,col 9)-(line 1623,col 57)",
        "(line 1624,col 9)-(line 1624,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.addAllForElements()",
      "begin_line": 1627,
      "end_line": 1631,
      "comment": "",
      "child_ranges": [
        "(line 1629,col 9)-(line 1629,col 62)",
        "(line 1630,col 9)-(line 1630,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getNegative()",
      "begin_line": 1633,
      "end_line": 1636,
      "comment": "",
      "child_ranges": [
        "(line 1635,col 9)-(line 1635,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getPositiveOutOfBounds()",
      "begin_line": 1638,
      "end_line": 1641,
      "comment": "",
      "child_ranges": [
        "(line 1640,col 9)-(line 1640,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.get1()",
      "begin_line": 1643,
      "end_line": 1646,
      "comment": "",
      "child_ranges": [
        "(line 1645,col 9)-(line 1645,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.get()",
      "begin_line": 1648,
      "end_line": 1654,
      "comment": "",
      "child_ranges": [
        "(line 1650,col 9)-(line 1650,col 69)",
        "(line 1651,col 9)-(line 1651,col 80)",
        "(line 1652,col 9)-(line 1652,col 89)",
        "(line 1653,col 9)-(line 1653,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getIterator()",
      "begin_line": 1656,
      "end_line": 1663,
      "comment": "",
      "child_ranges": [
        "(line 1658,col 9)-(line 1658,col 60)",
        "(line 1659,col 9)-(line 1659,col 78)",
        "(line 1660,col 9)-(line 1660,col 33)",
        "(line 1661,col 9)-(line 1661,col 78)",
        "(line 1662,col 9)-(line 1662,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getEnumeration()",
      "begin_line": 1665,
      "end_line": 1673,
      "comment": "",
      "child_ranges": [
        "(line 1667,col 9)-(line 1667,col 73)",
        "(line 1668,col 9)-(line 1668,col 58)",
        "(line 1669,col 9)-(line 1669,col 68)",
        "(line 1670,col 9)-(line 1670,col 40)",
        "(line 1671,col 9)-(line 1671,col 68)",
        "(line 1672,col 9)-(line 1672,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.reverse()",
      "begin_line": 1675,
      "end_line": 1683,
      "comment": "",
      "child_ranges": [
        "(line 1677,col 9)-(line 1677,col 54)",
        "(line 1678,col 9)-(line 1678,col 81)",
        "(line 1679,col 9)-(line 1679,col 40)",
        "(line 1681,col 9)-(line 1681,col 41)",
        "(line 1682,col 9)-(line 1682,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.extractSingleton()",
      "begin_line": 1685,
      "end_line": 1707,
      "comment": "",
      "child_ranges": [
        "(line 1687,col 9)-(line 1687,col 38)",
        "(line 1688,col 9)-(line 1692,col 9)",
        "(line 1693,col 9)-(line 1693,col 39)",
        "(line 1694,col 9)-(line 1698,col 9)",
        "(line 1699,col 9)-(line 1699,col 24)",
        "(line 1700,col 9)-(line 1700,col 68)",
        "(line 1701,col 9)-(line 1701,col 24)",
        "(line 1702,col 9)-(line 1706,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.next(java.util.Iterator\u003cT\u003e, T)",
      "begin_line": 1712,
      "end_line": 1715,
      "comment": "\n     * Records the next object returned for a mock iterator\n     ",
      "child_ranges": [
        "(line 1713,col 9)-(line 1713,col 51)",
        "(line 1714,col 9)-(line 1714,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.collateException1()",
      "begin_line": 1717,
      "end_line": 1720,
      "comment": "",
      "child_ranges": [
        "(line 1719,col 9)-(line 1719,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.collateException2()",
      "begin_line": 1722,
      "end_line": 1725,
      "comment": "",
      "child_ranges": [
        "(line 1724,col 9)-(line 1724,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testCollate()",
      "begin_line": 1727,
      "end_line": 1760,
      "comment": "",
      "child_ranges": [
        "(line 1729,col 9)-(line 1729,col 89)",
        "(line 1730,col 9)-(line 1730,col 65)",
        "(line 1732,col 9)-(line 1732,col 71)",
        "(line 1733,col 9)-(line 1733,col 72)",
        "(line 1735,col 9)-(line 1735,col 82)",
        "(line 1736,col 9)-(line 1736,col 82)",
        "(line 1737,col 9)-(line 1737,col 60)",
        "(line 1739,col 9)-(line 1739,col 62)",
        "(line 1740,col 9)-(line 1740,col 41)",
        "(line 1741,col 9)-(line 1741,col 41)",
        "(line 1742,col 9)-(line 1742,col 39)",
        "(line 1744,col 9)-(line 1744,col 65)",
        "(line 1746,col 9)-(line 1747,col 97)",
        "(line 1749,col 9)-(line 1749,col 94)",
        "(line 1750,col 9)-(line 1750,col 76)",
        "(line 1752,col 9)-(line 1752,col 57)",
        "(line 1753,col 9)-(line 1753,col 57)",
        "(line 1754,col 9)-(line 1754,col 42)",
        "(line 1756,col 9)-(line 1756,col 87)",
        "(line 1757,col 9)-(line 1757,col 87)",
        "(line 1758,col 9)-(line 1758,col 71)",
        "(line 1759,col 9)-(line 1759,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testCollateIgnoreDuplicates()",
      "begin_line": 1762,
      "end_line": 1775,
      "comment": "",
      "child_ranges": [
        "(line 1764,col 9)-(line 1764,col 89)",
        "(line 1765,col 9)-(line 1765,col 89)",
        "(line 1766,col 9)-(line 1766,col 80)",
        "(line 1768,col 9)-(line 1768,col 58)",
        "(line 1769,col 9)-(line 1769,col 40)",
        "(line 1770,col 9)-(line 1770,col 40)",
        "(line 1771,col 9)-(line 1771,col 73)",
        "(line 1772,col 9)-(line 1772,col 39)",
        "(line 1774,col 9)-(line 1774,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testPermutationsWithNullCollection()",
      "begin_line": 1777,
      "end_line": 1780,
      "comment": "",
      "child_ranges": [
        "(line 1779,col 9)-(line 1779,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testPermutations()",
      "begin_line": 1782,
      "end_line": 1794,
      "comment": "",
      "child_ranges": [
        "(line 1784,col 9)-(line 1784,col 57)",
        "(line 1785,col 9)-(line 1785,col 86)",
        "(line 1788,col 9)-(line 1788,col 37)",
        "(line 1789,col 9)-(line 1789,col 26)",
        "(line 1790,col 9)-(line 1792,col 9)",
        "(line 1793,col 9)-(line 1793,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testMatchesAll()",
      "begin_line": 1796,
      "end_line": 1820,
      "comment": "",
      "child_ranges": [
        "(line 1799,col 9)-(line 1799,col 60)",
        "(line 1800,col 9)-(line 1800,col 67)",
        "(line 1802,col 9)-(line 1807,col 10)",
        "(line 1808,col 9)-(line 1808,col 74)",
        "(line 1810,col 9)-(line 1815,col 10)",
        "(line 1816,col 9)-(line 1816,col 75)",
        "(line 1818,col 9)-(line 1818,col 67)",
        "(line 1819,col 9)-(line 1819,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-1d61f8fe-6e21-4208-8a06-57225f0654ea.evaluate(java.lang.Integer)",
      "begin_line": 1803,
      "end_line": 1806,
      "comment": "",
      "child_ranges": [
        "(line 1805,col 17)-(line 1805,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-d35ad05d-2c4e-463f-93a7-6fbe77577fbd.evaluate(java.lang.Integer)",
      "begin_line": 1811,
      "end_line": 1814,
      "comment": "",
      "child_ranges": [
        "(line 1813,col 17)-(line 1813,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testRemoveAllWithEquator()",
      "begin_line": 1822,
      "end_line": 1872,
      "comment": "",
      "child_ranges": [
        "(line 1824,col 9)-(line 1824,col 58)",
        "(line 1825,col 9)-(line 1825,col 23)",
        "(line 1826,col 9)-(line 1826,col 23)",
        "(line 1827,col 9)-(line 1827,col 23)",
        "(line 1829,col 9)-(line 1829,col 60)",
        "(line 1830,col 9)-(line 1830,col 25)",
        "(line 1831,col 9)-(line 1831,col 25)",
        "(line 1832,col 9)-(line 1832,col 25)",
        "(line 1835,col 9)-(line 1846,col 11)",
        "(line 1848,col 9)-(line 1848,col 39)",
        "(line 1849,col 9)-(line 1849,col 42)",
        "(line 1850,col 9)-(line 1850,col 42)",
        "(line 1851,col 9)-(line 1851,col 43)",
        "(line 1852,col 9)-(line 1852,col 37)",
        "(line 1853,col 9)-(line 1853,col 48)",
        "(line 1854,col 9)-(line 1854,col 48)",
        "(line 1855,col 9)-(line 1855,col 48)",
        "(line 1856,col 9)-(line 1856,col 39)",
        "(line 1857,col 9)-(line 1857,col 50)",
        "(line 1858,col 9)-(line 1858,col 50)",
        "(line 1859,col 9)-(line 1859,col 50)",
        "(line 1861,col 9)-(line 1865,col 9)",
        "(line 1867,col 9)-(line 1871,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-de921c84-37da-4bf5-8798-44fa35a79401.equate(java.lang.String, java.lang.String)",
      "begin_line": 1837,
      "end_line": 1840,
      "comment": "",
      "child_ranges": [
        "(line 1839,col 17)-(line 1839,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-b7a35715-c17c-411a-981e-12a8ff050694.hash(java.lang.String)",
      "begin_line": 1842,
      "end_line": 1845,
      "comment": "",
      "child_ranges": [
        "(line 1844,col 17)-(line 1844,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testRetainAllWithEquator()",
      "begin_line": 1874,
      "end_line": 1925,
      "comment": "",
      "child_ranges": [
        "(line 1876,col 9)-(line 1876,col 58)",
        "(line 1877,col 9)-(line 1877,col 23)",
        "(line 1878,col 9)-(line 1878,col 23)",
        "(line 1879,col 9)-(line 1879,col 23)",
        "(line 1881,col 9)-(line 1881,col 60)",
        "(line 1882,col 9)-(line 1882,col 25)",
        "(line 1883,col 9)-(line 1883,col 25)",
        "(line 1884,col 9)-(line 1884,col 25)",
        "(line 1887,col 9)-(line 1898,col 11)",
        "(line 1899,col 9)-(line 1899,col 39)",
        "(line 1900,col 9)-(line 1900,col 42)",
        "(line 1901,col 9)-(line 1901,col 43)",
        "(line 1902,col 9)-(line 1902,col 43)",
        "(line 1904,col 9)-(line 1904,col 37)",
        "(line 1905,col 9)-(line 1905,col 40)",
        "(line 1906,col 9)-(line 1906,col 40)",
        "(line 1907,col 9)-(line 1907,col 40)",
        "(line 1909,col 9)-(line 1909,col 39)",
        "(line 1910,col 9)-(line 1910,col 42)",
        "(line 1911,col 9)-(line 1911,col 42)",
        "(line 1912,col 9)-(line 1912,col 42)",
        "(line 1914,col 9)-(line 1918,col 9)",
        "(line 1920,col 9)-(line 1924,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-715f6f32-5df0-4f52-9f80-54764fdcb588.equate(java.lang.String, java.lang.String)",
      "begin_line": 1889,
      "end_line": 1892,
      "comment": "",
      "child_ranges": [
        "(line 1891,col 17)-(line 1891,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-e54ac48c-71ae-4683-b047-d5ea1ceea46e.hash(java.lang.String)",
      "begin_line": 1894,
      "end_line": 1897,
      "comment": "",
      "child_ranges": [
        "(line 1896,col 17)-(line 1896,col 35)"
      ]
    }
  ]
}