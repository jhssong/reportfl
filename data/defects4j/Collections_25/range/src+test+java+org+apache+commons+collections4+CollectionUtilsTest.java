{
  "filepath": "/tmp/Collections-25b/src/test/java/org/apache/commons/collections4/CollectionUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CollectionUtilsTest",
      "is_interface": false,
      "parent_types": [
        "MockTestCase"
      ],
      "begin_line": 57,
      "end_line": 1965,
      "comment": "\n * Tests for CollectionUtils.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "collectionA"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * Collection of {@link Integer}s\n     "
    },
    {
      "type": "field",
      "varNames": [
        "collectionB"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * Collection of {@link Long}s\n     "
    },
    {
      "type": "field",
      "varNames": [
        "collectionC"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * Collection of {@link Integer}s that are equivalent to the Longs in\n     * collectionB.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "collectionD"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * Sorted Collection of {@link Integer}s\n     "
    },
    {
      "type": "field",
      "varNames": [
        "collectionE"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * Sorted Collection of {@link Integer}s\n     "
    },
    {
      "type": "field",
      "varNames": [
        "collectionA2"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * Collection of {@link Integer}s, bound as {@link Number}s\n     "
    },
    {
      "type": "field",
      "varNames": [
        "collectionB2"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * Collection of {@link Long}s, bound as {@link Number}s\n     "
    },
    {
      "type": "field",
      "varNames": [
        "collectionC2"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": "\n     * Collection of {@link Integer}s (cast as {@link Number}s) that are\n     * equivalent to the Longs in collectionB.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iterableA"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iterableB"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iterableC"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iterableA2"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iterableB2"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "emptyCollection"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.setUp()",
      "begin_line": 114,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 47)",
        "(line 117,col 9)-(line 117,col 27)",
        "(line 118,col 9)-(line 118,col 27)",
        "(line 119,col 9)-(line 119,col 27)",
        "(line 120,col 9)-(line 120,col 27)",
        "(line 121,col 9)-(line 121,col 27)",
        "(line 122,col 9)-(line 122,col 27)",
        "(line 123,col 9)-(line 123,col 27)",
        "(line 124,col 9)-(line 124,col 27)",
        "(line 125,col 9)-(line 125,col 27)",
        "(line 126,col 9)-(line 126,col 27)",
        "(line 127,col 9)-(line 127,col 45)",
        "(line 128,col 9)-(line 128,col 28)",
        "(line 129,col 9)-(line 129,col 28)",
        "(line 130,col 9)-(line 130,col 28)",
        "(line 131,col 9)-(line 131,col 28)",
        "(line 132,col 9)-(line 132,col 28)",
        "(line 133,col 9)-(line 133,col 28)",
        "(line 134,col 9)-(line 134,col 28)",
        "(line 135,col 9)-(line 135,col 28)",
        "(line 136,col 9)-(line 136,col 28)",
        "(line 137,col 9)-(line 137,col 28)",
        "(line 139,col 9)-(line 139,col 47)",
        "(line 140,col 9)-(line 142,col 9)",
        "(line 144,col 9)-(line 144,col 32)",
        "(line 145,col 9)-(line 145,col 32)",
        "(line 146,col 9)-(line 146,col 32)",
        "(line 147,col 9)-(line 147,col 58)",
        "(line 148,col 9)-(line 148,col 59)",
        "(line 149,col 9)-(line 149,col 59)",
        "(line 150,col 9)-(line 150,col 34)",
        "(line 151,col 9)-(line 151,col 34)",
        "(line 153,col 9)-(line 153,col 47)",
        "(line 154,col 9)-(line 154,col 27)",
        "(line 155,col 9)-(line 155,col 27)",
        "(line 156,col 9)-(line 156,col 27)",
        "(line 157,col 9)-(line 157,col 27)",
        "(line 158,col 9)-(line 158,col 27)",
        "(line 159,col 9)-(line 159,col 27)",
        "(line 160,col 9)-(line 160,col 27)",
        "(line 161,col 9)-(line 161,col 28)",
        "(line 163,col 9)-(line 163,col 47)",
        "(line 164,col 9)-(line 164,col 27)",
        "(line 165,col 9)-(line 165,col 27)",
        "(line 166,col 9)-(line 166,col 27)",
        "(line 167,col 9)-(line 167,col 27)",
        "(line 168,col 9)-(line 168,col 27)",
        "(line 169,col 9)-(line 169,col 27)",
        "(line 170,col 9)-(line 170,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getCardinalityMap()",
      "begin_line": 173,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 96)",
        "(line 176,col 9)-(line 176,col 44)",
        "(line 177,col 9)-(line 177,col 44)",
        "(line 178,col 9)-(line 178,col 44)",
        "(line 179,col 9)-(line 179,col 44)",
        "(line 180,col 9)-(line 180,col 33)",
        "(line 182,col 9)-(line 182,col 86)",
        "(line 183,col 9)-(line 183,col 34)",
        "(line 184,col 9)-(line 184,col 45)",
        "(line 185,col 9)-(line 185,col 45)",
        "(line 186,col 9)-(line 186,col 45)",
        "(line 187,col 9)-(line 187,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.cardinality()",
      "begin_line": 190,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 67)",
        "(line 193,col 9)-(line 193,col 67)",
        "(line 194,col 9)-(line 194,col 67)",
        "(line 195,col 9)-(line 195,col 67)",
        "(line 196,col 9)-(line 196,col 67)",
        "(line 198,col 9)-(line 198,col 68)",
        "(line 199,col 9)-(line 199,col 68)",
        "(line 200,col 9)-(line 200,col 68)",
        "(line 201,col 9)-(line 201,col 68)",
        "(line 202,col 9)-(line 202,col 68)",
        "(line 207,col 9)-(line 207,col 69)",
        "(line 208,col 9)-(line 208,col 68)",
        "(line 210,col 9)-(line 210,col 54)",
        "(line 211,col 9)-(line 211,col 21)",
        "(line 212,col 9)-(line 212,col 21)",
        "(line 213,col 9)-(line 213,col 21)",
        "(line 214,col 9)-(line 214,col 21)",
        "(line 215,col 9)-(line 215,col 63)",
        "(line 216,col 9)-(line 216,col 63)",
        "(line 217,col 9)-(line 217,col 63)",
        "(line 218,col 9)-(line 218,col 63)",
        "(line 219,col 9)-(line 219,col 63)",
        "(line 221,col 9)-(line 221,col 54)",
        "(line 222,col 9)-(line 222,col 24)",
        "(line 223,col 9)-(line 223,col 21)",
        "(line 224,col 9)-(line 224,col 21)",
        "(line 225,col 9)-(line 225,col 21)",
        "(line 226,col 9)-(line 226,col 63)",
        "(line 227,col 9)-(line 227,col 63)",
        "(line 228,col 9)-(line 228,col 63)",
        "(line 229,col 9)-(line 229,col 63)",
        "(line 230,col 9)-(line 230,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.cardinalityOfNull()",
      "begin_line": 233,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 58)",
        "(line 236,col 9)-(line 236,col 65)",
        "(line 237,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 22)",
        "(line 242,col 9)-(line 242,col 65)",
        "(line 243,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 247,col 23)",
        "(line 248,col 9)-(line 248,col 65)",
        "(line 249,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 253,col 22)",
        "(line 254,col 9)-(line 254,col 65)",
        "(line 255,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 23)",
        "(line 260,col 9)-(line 260,col 65)",
        "(line 261,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 265,col 22)",
        "(line 266,col 9)-(line 266,col 65)",
        "(line 267,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 23)",
        "(line 272,col 9)-(line 272,col 65)",
        "(line 273,col 9)-(line 276,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.containsAll()",
      "begin_line": 279,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 66)",
        "(line 282,col 9)-(line 282,col 64)",
        "(line 283,col 9)-(line 283,col 21)",
        "(line 284,col 9)-(line 284,col 64)",
        "(line 285,col 9)-(line 285,col 21)",
        "(line 286,col 9)-(line 286,col 66)",
        "(line 287,col 9)-(line 287,col 23)",
        "(line 288,col 9)-(line 288,col 65)",
        "(line 289,col 9)-(line 289,col 22)",
        "(line 290,col 9)-(line 290,col 22)",
        "(line 291,col 9)-(line 291,col 70)",
        "(line 292,col 9)-(line 292,col 27)",
        "(line 293,col 9)-(line 293,col 27)",
        "(line 294,col 9)-(line 294,col 27)",
        "(line 296,col 9)-(line 296,col 107)",
        "(line 297,col 9)-(line 297,col 105)",
        "(line 298,col 9)-(line 298,col 109)",
        "(line 299,col 9)-(line 299,col 107)",
        "(line 300,col 9)-(line 300,col 102)",
        "(line 301,col 9)-(line 301,col 108)",
        "(line 303,col 9)-(line 303,col 107)",
        "(line 304,col 9)-(line 304,col 107)",
        "(line 305,col 9)-(line 305,col 106)",
        "(line 306,col 9)-(line 306,col 106)",
        "(line 307,col 9)-(line 307,col 106)",
        "(line 308,col 9)-(line 308,col 108)",
        "(line 309,col 9)-(line 309,col 104)",
        "(line 311,col 9)-(line 311,col 115)",
        "(line 312,col 9)-(line 312,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.containsAny()",
      "begin_line": 315,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 66)",
        "(line 318,col 9)-(line 318,col 64)",
        "(line 319,col 9)-(line 319,col 21)",
        "(line 320,col 9)-(line 320,col 64)",
        "(line 321,col 9)-(line 321,col 21)",
        "(line 322,col 9)-(line 322,col 66)",
        "(line 323,col 9)-(line 323,col 23)",
        "(line 324,col 9)-(line 324,col 65)",
        "(line 325,col 9)-(line 325,col 22)",
        "(line 326,col 9)-(line 326,col 22)",
        "(line 328,col 9)-(line 328,col 105)",
        "(line 329,col 9)-(line 329,col 105)",
        "(line 330,col 9)-(line 330,col 107)",
        "(line 331,col 9)-(line 331,col 107)",
        "(line 332,col 9)-(line 332,col 102)",
        "(line 333,col 9)-(line 333,col 108)",
        "(line 335,col 9)-(line 335,col 107)",
        "(line 336,col 9)-(line 336,col 107)",
        "(line 337,col 9)-(line 337,col 106)",
        "(line 338,col 9)-(line 338,col 106)",
        "(line 339,col 9)-(line 339,col 108)",
        "(line 340,col 9)-(line 340,col 108)",
        "(line 341,col 9)-(line 341,col 106)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.union()",
      "begin_line": 344,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 84)",
        "(line 347,col 9)-(line 347,col 82)",
        "(line 348,col 9)-(line 348,col 54)",
        "(line 349,col 9)-(line 349,col 54)",
        "(line 350,col 9)-(line 350,col 54)",
        "(line 351,col 9)-(line 351,col 54)",
        "(line 352,col 9)-(line 352,col 54)",
        "(line 354,col 9)-(line 354,col 87)",
        "(line 355,col 9)-(line 355,col 83)",
        "(line 356,col 9)-(line 356,col 55)",
        "(line 357,col 9)-(line 357,col 55)",
        "(line 358,col 9)-(line 358,col 55)",
        "(line 359,col 9)-(line 359,col 55)",
        "(line 360,col 9)-(line 360,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.intersection()",
      "begin_line": 363,
      "end_line": 380,
      "comment": "",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 91)",
        "(line 366,col 9)-(line 366,col 82)",
        "(line 367,col 9)-(line 367,col 32)",
        "(line 368,col 9)-(line 368,col 54)",
        "(line 369,col 9)-(line 369,col 54)",
        "(line 370,col 9)-(line 370,col 54)",
        "(line 371,col 9)-(line 371,col 32)",
        "(line 373,col 9)-(line 373,col 96)",
        "(line 374,col 9)-(line 374,col 83)",
        "(line 375,col 9)-(line 375,col 33)",
        "(line 376,col 9)-(line 376,col 55)",
        "(line 377,col 9)-(line 377,col 55)",
        "(line 378,col 9)-(line 378,col 55)",
        "(line 379,col 9)-(line 379,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.disjunction()",
      "begin_line": 382,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 90)",
        "(line 385,col 9)-(line 385,col 82)",
        "(line 386,col 9)-(line 386,col 54)",
        "(line 387,col 9)-(line 387,col 54)",
        "(line 388,col 9)-(line 388,col 32)",
        "(line 389,col 9)-(line 389,col 54)",
        "(line 390,col 9)-(line 390,col 54)",
        "(line 392,col 9)-(line 392,col 95)",
        "(line 393,col 9)-(line 393,col 83)",
        "(line 394,col 9)-(line 394,col 55)",
        "(line 395,col 9)-(line 395,col 55)",
        "(line 396,col 9)-(line 396,col 33)",
        "(line 397,col 9)-(line 397,col 55)",
        "(line 398,col 9)-(line 398,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testDisjunctionAsUnionMinusIntersection()",
      "begin_line": 401,
      "end_line": 407,
      "comment": "",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 101)",
        "(line 404,col 9)-(line 404,col 94)",
        "(line 405,col 9)-(line 405,col 104)",
        "(line 406,col 9)-(line 406,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testDisjunctionAsSymmetricDifference()",
      "begin_line": 409,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 101)",
        "(line 412,col 9)-(line 412,col 98)",
        "(line 413,col 9)-(line 413,col 98)",
        "(line 414,col 9)-(line 414,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSubtract()",
      "begin_line": 417,
      "end_line": 434,
      "comment": "",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 87)",
        "(line 420,col 9)-(line 420,col 82)",
        "(line 421,col 9)-(line 421,col 54)",
        "(line 422,col 9)-(line 422,col 32)",
        "(line 423,col 9)-(line 423,col 32)",
        "(line 424,col 9)-(line 424,col 54)",
        "(line 425,col 9)-(line 425,col 32)",
        "(line 427,col 9)-(line 427,col 92)",
        "(line 428,col 9)-(line 428,col 83)",
        "(line 429,col 9)-(line 429,col 55)",
        "(line 430,col 9)-(line 430,col 33)",
        "(line 431,col 9)-(line 431,col 33)",
        "(line 432,col 9)-(line 432,col 55)",
        "(line 433,col 9)-(line 433,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSubtractWithPredicate()",
      "begin_line": 436,
      "end_line": 452,
      "comment": "",
      "child_ranges": [
        "(line 439,col 9)-(line 443,col 10)",
        "(line 445,col 9)-(line 445,col 99)",
        "(line 446,col 9)-(line 446,col 82)",
        "(line 447,col 9)-(line 447,col 55)",
        "(line 448,col 9)-(line 448,col 55)",
        "(line 449,col 9)-(line 449,col 55)",
        "(line 450,col 9)-(line 450,col 55)",
        "(line 451,col 9)-(line 451,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-434cd1c0-420c-419c-930b-34b1811b60fd.evaluate(java.lang.Number)",
      "begin_line": 440,
      "end_line": 442,
      "comment": "",
      "child_ranges": [
        "(line 441,col 17)-(line 441,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsSubCollectionOfSelf()",
      "begin_line": 454,
      "end_line": 458,
      "comment": "",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 78)",
        "(line 457,col 9)-(line 457,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsSubCollection()",
      "begin_line": 460,
      "end_line": 464,
      "comment": "",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 79)",
        "(line 463,col 9)-(line 463,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsSubCollection2()",
      "begin_line": 466,
      "end_line": 504,
      "comment": "",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 63)",
        "(line 469,col 9)-(line 469,col 68)",
        "(line 470,col 9)-(line 470,col 69)",
        "(line 471,col 9)-(line 471,col 17)",
        "(line 472,col 9)-(line 472,col 68)",
        "(line 473,col 9)-(line 473,col 69)",
        "(line 474,col 9)-(line 474,col 17)",
        "(line 475,col 9)-(line 475,col 68)",
        "(line 476,col 9)-(line 476,col 69)",
        "(line 477,col 9)-(line 477,col 17)",
        "(line 478,col 9)-(line 478,col 68)",
        "(line 479,col 9)-(line 479,col 69)",
        "(line 480,col 9)-(line 480,col 17)",
        "(line 481,col 9)-(line 481,col 68)",
        "(line 482,col 9)-(line 482,col 69)",
        "(line 483,col 9)-(line 483,col 17)",
        "(line 484,col 9)-(line 484,col 68)",
        "(line 485,col 9)-(line 485,col 69)",
        "(line 486,col 9)-(line 486,col 17)",
        "(line 487,col 9)-(line 487,col 68)",
        "(line 488,col 9)-(line 488,col 69)",
        "(line 489,col 9)-(line 489,col 17)",
        "(line 490,col 9)-(line 490,col 68)",
        "(line 491,col 9)-(line 491,col 69)",
        "(line 492,col 9)-(line 492,col 17)",
        "(line 493,col 9)-(line 493,col 68)",
        "(line 494,col 9)-(line 494,col 69)",
        "(line 495,col 9)-(line 495,col 17)",
        "(line 496,col 9)-(line 496,col 68)",
        "(line 497,col 9)-(line 497,col 69)",
        "(line 498,col 9)-(line 498,col 17)",
        "(line 499,col 9)-(line 499,col 68)",
        "(line 500,col 9)-(line 500,col 68)",
        "(line 501,col 9)-(line 501,col 17)",
        "(line 502,col 9)-(line 502,col 69)",
        "(line 503,col 9)-(line 503,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsEqualCollectionToSelf()",
      "begin_line": 506,
      "end_line": 510,
      "comment": "",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 80)",
        "(line 509,col 9)-(line 509,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsEqualCollection()",
      "begin_line": 512,
      "end_line": 516,
      "comment": "",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 81)",
        "(line 515,col 9)-(line 515,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsEqualCollectionReturnsFalse()",
      "begin_line": 518,
      "end_line": 526,
      "comment": "",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 68)",
        "(line 522,col 9)-(line 522,col 20)",
        "(line 523,col 9)-(line 523,col 17)",
        "(line 524,col 9)-(line 524,col 71)",
        "(line 525,col 9)-(line 525,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsEqualCollection2()",
      "begin_line": 528,
      "end_line": 552,
      "comment": "",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 61)",
        "(line 531,col 9)-(line 531,col 61)",
        "(line 532,col 9)-(line 532,col 60)",
        "(line 533,col 9)-(line 533,col 60)",
        "(line 534,col 9)-(line 534,col 19)",
        "(line 535,col 9)-(line 535,col 61)",
        "(line 536,col 9)-(line 536,col 61)",
        "(line 537,col 9)-(line 537,col 19)",
        "(line 538,col 9)-(line 538,col 60)",
        "(line 539,col 9)-(line 539,col 60)",
        "(line 540,col 9)-(line 540,col 19)",
        "(line 541,col 9)-(line 541,col 61)",
        "(line 542,col 9)-(line 542,col 61)",
        "(line 543,col 9)-(line 543,col 19)",
        "(line 544,col 9)-(line 544,col 60)",
        "(line 545,col 9)-(line 545,col 60)",
        "(line 546,col 9)-(line 546,col 19)",
        "(line 547,col 9)-(line 547,col 61)",
        "(line 548,col 9)-(line 548,col 61)",
        "(line 549,col 9)-(line 549,col 19)",
        "(line 550,col 9)-(line 550,col 60)",
        "(line 551,col 9)-(line 551,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsEqualCollectionEquator()",
      "begin_line": 554,
      "end_line": 580,
      "comment": "",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 101)",
        "(line 559,col 9)-(line 571,col 10)",
        "(line 573,col 9)-(line 573,col 83)",
        "(line 574,col 9)-(line 574,col 77)",
        "(line 575,col 9)-(line 575,col 77)",
        "(line 577,col 9)-(line 577,col 79)",
        "(line 578,col 9)-(line 578,col 97)",
        "(line 579,col 9)-(line 579,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-6f442110-6f8a-4bfd-a331-1fe6949810f9.equate(java.lang.Integer, java.lang.Integer)",
      "begin_line": 560,
      "end_line": 566,
      "comment": "",
      "child_ranges": [
        "(line 561,col 17)-(line 565,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-1dbd3b5f-c7da-4264-8346-b20f330948b7.hash(java.lang.Integer)",
      "begin_line": 568,
      "end_line": 570,
      "comment": "",
      "child_ranges": [
        "(line 569,col 17)-(line 569,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsEqualCollectionNullEquator()",
      "begin_line": 582,
      "end_line": 585,
      "comment": "",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsProperSubCollection()",
      "begin_line": 587,
      "end_line": 607,
      "comment": "",
      "child_ranges": [
        "(line 589,col 9)-(line 589,col 61)",
        "(line 590,col 9)-(line 590,col 61)",
        "(line 591,col 9)-(line 591,col 65)",
        "(line 592,col 9)-(line 592,col 19)",
        "(line 593,col 9)-(line 593,col 64)",
        "(line 594,col 9)-(line 594,col 65)",
        "(line 595,col 9)-(line 595,col 65)",
        "(line 596,col 9)-(line 596,col 65)",
        "(line 597,col 9)-(line 597,col 19)",
        "(line 598,col 9)-(line 598,col 19)",
        "(line 599,col 9)-(line 599,col 19)",
        "(line 600,col 9)-(line 600,col 65)",
        "(line 601,col 9)-(line 601,col 65)",
        "(line 602,col 9)-(line 602,col 19)",
        "(line 603,col 9)-(line 603,col 64)",
        "(line 604,col 9)-(line 604,col 127)",
        "(line 605,col 9)-(line 605,col 93)",
        "(line 606,col 9)-(line 606,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.find()",
      "begin_line": 609,
      "end_line": 620,
      "comment": "",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 69)",
        "(line 613,col 9)-(line 613,col 72)",
        "(line 614,col 9)-(line 614,col 35)",
        "(line 615,col 9)-(line 615,col 52)",
        "(line 616,col 9)-(line 616,col 64)",
        "(line 617,col 9)-(line 617,col 33)",
        "(line 618,col 9)-(line 618,col 61)",
        "(line 619,col 9)-(line 619,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.forAllDoCollection()",
      "begin_line": 622,
      "end_line": 641,
      "comment": "",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 97)",
        "(line 627,col 9)-(line 627,col 95)",
        "(line 628,col 9)-(line 628,col 29)",
        "(line 629,col 9)-(line 629,col 29)",
        "(line 630,col 9)-(line 630,col 99)",
        "(line 631,col 9)-(line 631,col 47)",
        "(line 632,col 9)-(line 632,col 67)",
        "(line 634,col 9)-(line 634,col 94)",
        "(line 635,col 9)-(line 635,col 34)",
        "(line 636,col 9)-(line 636,col 67)",
        "(line 637,col 9)-(line 637,col 81)",
        "(line 638,col 9)-(line 638,col 22)",
        "(line 640,col 9)-(line 640,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.forAllDoIterator()",
      "begin_line": 643,
      "end_line": 662,
      "comment": "",
      "child_ranges": [
        "(line 647,col 9)-(line 647,col 97)",
        "(line 648,col 9)-(line 648,col 95)",
        "(line 649,col 9)-(line 649,col 29)",
        "(line 650,col 9)-(line 650,col 29)",
        "(line 651,col 9)-(line 651,col 110)",
        "(line 652,col 9)-(line 652,col 47)",
        "(line 653,col 9)-(line 653,col 67)",
        "(line 655,col 9)-(line 655,col 105)",
        "(line 656,col 9)-(line 656,col 34)",
        "(line 657,col 9)-(line 657,col 67)",
        "(line 658,col 9)-(line 658,col 79)",
        "(line 659,col 9)-(line 659,col 22)",
        "(line 661,col 9)-(line 661,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.forAllDoFailure()",
      "begin_line": 664,
      "end_line": 671,
      "comment": "",
      "child_ranges": [
        "(line 667,col 9)-(line 667,col 81)",
        "(line 668,col 9)-(line 668,col 63)",
        "(line 669,col 9)-(line 669,col 21)",
        "(line 670,col 9)-(line 670,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.forAllButLastDoCollection()",
      "begin_line": 673,
      "end_line": 712,
      "comment": "",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 97)",
        "(line 676,col 9)-(line 676,col 95)",
        "(line 677,col 9)-(line 677,col 29)",
        "(line 678,col 9)-(line 678,col 29)",
        "(line 679,col 9)-(line 679,col 95)",
        "(line 680,col 9)-(line 680,col 45)",
        "(line 681,col 9)-(line 681,col 68)",
        "(line 683,col 9)-(line 683,col 20)",
        "(line 684,col 9)-(line 684,col 29)",
        "(line 685,col 9)-(line 685,col 72)",
        "(line 686,col 9)-(line 686,col 45)",
        "(line 687,col 9)-(line 687,col 44)",
        "(line 689,col 9)-(line 689,col 20)",
        "(line 690,col 9)-(line 690,col 72)",
        "(line 691,col 9)-(line 691,col 32)",
        "(line 693,col 9)-(line 693,col 66)",
        "(line 694,col 9)-(line 694,col 55)",
        "(line 695,col 9)-(line 699,col 12)",
        "(line 700,col 9)-(line 700,col 49)",
        "(line 702,col 9)-(line 702,col 58)",
        "(line 703,col 9)-(line 703,col 58)",
        "(line 704,col 9)-(line 708,col 12)",
        "(line 709,col 9)-(line 709,col 48)",
        "(line 710,col 9)-(line 710,col 85)",
        "(line 711,col 9)-(line 711,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-f03ca3f1-17a3-4d22-8858-0756ae6f5f1a.execute(java.lang.String)",
      "begin_line": 696,
      "end_line": 698,
      "comment": "",
      "child_ranges": [
        "(line 697,col 17)-(line 697,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-072011da-b3dc-442e-aad9-29b30d988fbc.execute(java.lang.String)",
      "begin_line": 705,
      "end_line": 707,
      "comment": "",
      "child_ranges": [
        "(line 706,col 17)-(line 706,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.forAllButLastDoIterator()",
      "begin_line": 714,
      "end_line": 726,
      "comment": "",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 97)",
        "(line 717,col 9)-(line 717,col 95)",
        "(line 718,col 9)-(line 718,col 29)",
        "(line 719,col 9)-(line 719,col 29)",
        "(line 720,col 9)-(line 720,col 106)",
        "(line 721,col 9)-(line 721,col 45)",
        "(line 722,col 9)-(line 722,col 68)",
        "(line 724,col 9)-(line 724,col 108)",
        "(line 725,col 9)-(line 725,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getFromMap()",
      "begin_line": 728,
      "end_line": 766,
      "comment": "",
      "child_ranges": [
        "(line 731,col 9)-(line 731,col 75)",
        "(line 732,col 9)-(line 732,col 40)",
        "(line 733,col 9)-(line 733,col 38)",
        "(line 735,col 9)-(line 735,col 72)",
        "(line 736,col 9)-(line 736,col 75)",
        "(line 737,col 9)-(line 737,col 52)",
        "(line 738,col 9)-(line 738,col 49)",
        "(line 739,col 9)-(line 739,col 52)",
        "(line 740,col 9)-(line 740,col 38)",
        "(line 743,col 9)-(line 748,col 9)",
        "(line 749,col 9)-(line 754,col 9)",
        "(line 757,col 9)-(line 757,col 76)",
        "(line 758,col 9)-(line 758,col 35)",
        "(line 759,col 9)-(line 759,col 33)",
        "(line 760,col 9)-(line 760,col 69)",
        "(line 761,col 9)-(line 761,col 47)",
        "(line 762,col 9)-(line 762,col 46)",
        "(line 763,col 9)-(line 763,col 43)",
        "(line 764,col 9)-(line 764,col 46)",
        "(line 765,col 9)-(line 765,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getFromList()",
      "begin_line": 772,
      "end_line": 784,
      "comment": "\n     * Tests that {@link List}s are handled correctly - e.g. using\n     * {@link List#get(int)}.\n     ",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 57)",
        "(line 776,col 9)-(line 776,col 46)",
        "(line 777,col 9)-(line 777,col 45)",
        "(line 778,col 9)-(line 778,col 17)",
        "(line 779,col 9)-(line 779,col 59)",
        "(line 780,col 9)-(line 780,col 37)",
        "(line 781,col 9)-(line 781,col 58)",
        "(line 783,col 9)-(line 783,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getFromIterator()",
      "begin_line": 786,
      "end_line": 803,
      "comment": "",
      "child_ranges": [
        "(line 790,col 9)-(line 790,col 58)",
        "(line 791,col 9)-(line 791,col 64)",
        "(line 792,col 9)-(line 792,col 40)",
        "(line 793,col 9)-(line 793,col 64)",
        "(line 796,col 9)-(line 801,col 9)",
        "(line 802,col 9)-(line 802,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getFromEnumeration()",
      "begin_line": 805,
      "end_line": 825,
      "comment": "",
      "child_ranges": [
        "(line 809,col 9)-(line 809,col 59)",
        "(line 810,col 9)-(line 810,col 34)",
        "(line 811,col 9)-(line 811,col 33)",
        "(line 812,col 9)-(line 812,col 51)",
        "(line 813,col 9)-(line 813,col 57)",
        "(line 814,col 9)-(line 814,col 31)",
        "(line 815,col 9)-(line 815,col 56)",
        "(line 818,col 9)-(line 823,col 9)",
        "(line 824,col 9)-(line 824,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getFromIterable()",
      "begin_line": 827,
      "end_line": 837,
      "comment": "",
      "child_ranges": [
        "(line 831,col 9)-(line 831,col 54)",
        "(line 832,col 9)-(line 832,col 30)",
        "(line 833,col 9)-(line 833,col 61)",
        "(line 836,col 9)-(line 836,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getFromObjectArray()",
      "begin_line": 839,
      "end_line": 851,
      "comment": "",
      "child_ranges": [
        "(line 842,col 9)-(line 842,col 48)",
        "(line 843,col 9)-(line 843,col 29)",
        "(line 844,col 9)-(line 844,col 28)",
        "(line 845,col 9)-(line 845,col 63)",
        "(line 846,col 9)-(line 846,col 62)",
        "(line 850,col 9)-(line 850,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getFromPrimitiveArray()",
      "begin_line": 853,
      "end_line": 865,
      "comment": "",
      "child_ranges": [
        "(line 856,col 9)-(line 856,col 39)",
        "(line 857,col 9)-(line 857,col 22)",
        "(line 858,col 9)-(line 858,col 22)",
        "(line 859,col 9)-(line 859,col 56)",
        "(line 860,col 9)-(line 860,col 56)",
        "(line 864,col 9)-(line 864,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getFromObject()",
      "begin_line": 867,
      "end_line": 872,
      "comment": "",
      "child_ranges": [
        "(line 870,col 9)-(line 870,col 40)",
        "(line 871,col 9)-(line 871,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSize_List()",
      "begin_line": 875,
      "end_line": 885,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 877,col 9)-(line 877,col 33)",
        "(line 878,col 9)-(line 878,col 52)",
        "(line 879,col 9)-(line 879,col 39)",
        "(line 880,col 9)-(line 880,col 52)",
        "(line 881,col 9)-(line 881,col 22)",
        "(line 882,col 9)-(line 882,col 52)",
        "(line 883,col 9)-(line 883,col 22)",
        "(line 884,col 9)-(line 884,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSize_Map()",
      "begin_line": 887,
      "end_line": 895,
      "comment": "",
      "child_ranges": [
        "(line 889,col 9)-(line 889,col 70)",
        "(line 890,col 9)-(line 890,col 51)",
        "(line 891,col 9)-(line 891,col 26)",
        "(line 892,col 9)-(line 892,col 51)",
        "(line 893,col 9)-(line 893,col 26)",
        "(line 894,col 9)-(line 894,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSize_Array()",
      "begin_line": 897,
      "end_line": 908,
      "comment": "",
      "child_ranges": [
        "(line 899,col 9)-(line 899,col 51)",
        "(line 900,col 9)-(line 900,col 59)",
        "(line 902,col 9)-(line 902,col 51)",
        "(line 903,col 9)-(line 903,col 59)",
        "(line 904,col 9)-(line 904,col 29)",
        "(line 905,col 9)-(line 905,col 29)",
        "(line 906,col 9)-(line 906,col 29)",
        "(line 907,col 9)-(line 907,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSize_PrimitiveArray()",
      "begin_line": 910,
      "end_line": 921,
      "comment": "",
      "child_ranges": [
        "(line 912,col 9)-(line 912,col 42)",
        "(line 913,col 9)-(line 913,col 56)",
        "(line 915,col 9)-(line 915,col 51)",
        "(line 916,col 9)-(line 916,col 59)",
        "(line 917,col 9)-(line 917,col 30)",
        "(line 918,col 9)-(line 918,col 30)",
        "(line 919,col 9)-(line 919,col 30)",
        "(line 920,col 9)-(line 920,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSize_Enumeration()",
      "begin_line": 923,
      "end_line": 931,
      "comment": "",
      "child_ranges": [
        "(line 925,col 9)-(line 925,col 57)",
        "(line 926,col 9)-(line 926,col 63)",
        "(line 927,col 9)-(line 927,col 22)",
        "(line 928,col 9)-(line 928,col 63)",
        "(line 929,col 9)-(line 929,col 22)",
        "(line 930,col 9)-(line 930,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSize_Iterator()",
      "begin_line": 933,
      "end_line": 941,
      "comment": "",
      "child_ranges": [
        "(line 935,col 9)-(line 935,col 58)",
        "(line 936,col 9)-(line 936,col 63)",
        "(line 937,col 9)-(line 937,col 22)",
        "(line 938,col 9)-(line 938,col 63)",
        "(line 939,col 9)-(line 939,col 22)",
        "(line 940,col 9)-(line 940,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSize_Other()",
      "begin_line": 943,
      "end_line": 946,
      "comment": "",
      "child_ranges": [
        "(line 945,col 9)-(line 945,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSizeIsEmpty_Null()",
      "begin_line": 949,
      "end_line": 952,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 951,col 9)-(line 951,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSizeIsEmpty_List()",
      "begin_line": 954,
      "end_line": 960,
      "comment": "",
      "child_ranges": [
        "(line 956,col 9)-(line 956,col 58)",
        "(line 957,col 9)-(line 957,col 62)",
        "(line 958,col 9)-(line 958,col 22)",
        "(line 959,col 9)-(line 959,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSizeIsEmpty_Map()",
      "begin_line": 962,
      "end_line": 968,
      "comment": "",
      "child_ranges": [
        "(line 964,col 9)-(line 964,col 70)",
        "(line 965,col 9)-(line 965,col 61)",
        "(line 966,col 9)-(line 966,col 26)",
        "(line 967,col 9)-(line 967,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSizeIsEmpty_Array()",
      "begin_line": 970,
      "end_line": 981,
      "comment": "",
      "child_ranges": [
        "(line 972,col 9)-(line 972,col 51)",
        "(line 973,col 9)-(line 973,col 69)",
        "(line 975,col 9)-(line 975,col 51)",
        "(line 976,col 9)-(line 976,col 70)",
        "(line 977,col 9)-(line 977,col 29)",
        "(line 978,col 9)-(line 978,col 29)",
        "(line 979,col 9)-(line 979,col 29)",
        "(line 980,col 9)-(line 980,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSizeIsEmpty_PrimitiveArray()",
      "begin_line": 983,
      "end_line": 994,
      "comment": "",
      "child_ranges": [
        "(line 985,col 9)-(line 985,col 42)",
        "(line 986,col 9)-(line 986,col 66)",
        "(line 988,col 9)-(line 988,col 51)",
        "(line 989,col 9)-(line 989,col 70)",
        "(line 990,col 9)-(line 990,col 30)",
        "(line 991,col 9)-(line 991,col 30)",
        "(line 992,col 9)-(line 992,col 30)",
        "(line 993,col 9)-(line 993,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSizeIsEmpty_Enumeration()",
      "begin_line": 996,
      "end_line": 1005,
      "comment": "",
      "child_ranges": [
        "(line 998,col 9)-(line 998,col 57)",
        "(line 999,col 9)-(line 999,col 73)",
        "(line 1000,col 9)-(line 1000,col 22)",
        "(line 1001,col 9)-(line 1001,col 74)",
        "(line 1002,col 9)-(line 1002,col 55)",
        "(line 1003,col 9)-(line 1003,col 25)",
        "(line 1004,col 9)-(line 1004,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSizeIsEmpty_Iterator()",
      "begin_line": 1007,
      "end_line": 1016,
      "comment": "",
      "child_ranges": [
        "(line 1009,col 9)-(line 1009,col 58)",
        "(line 1010,col 9)-(line 1010,col 73)",
        "(line 1011,col 9)-(line 1011,col 22)",
        "(line 1012,col 9)-(line 1012,col 74)",
        "(line 1013,col 9)-(line 1013,col 52)",
        "(line 1014,col 9)-(line 1014,col 18)",
        "(line 1015,col 9)-(line 1015,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSizeIsEmpty_Other()",
      "begin_line": 1018,
      "end_line": 1025,
      "comment": "",
      "child_ranges": [
        "(line 1020,col 9)-(line 1024,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsEmptyWithEmptyCollection()",
      "begin_line": 1028,
      "end_line": 1032,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 1030,col 9)-(line 1030,col 64)",
        "(line 1031,col 9)-(line 1031,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsEmptyWithNonEmptyCollection()",
      "begin_line": 1034,
      "end_line": 1039,
      "comment": "",
      "child_ranges": [
        "(line 1036,col 9)-(line 1036,col 64)",
        "(line 1037,col 9)-(line 1037,col 25)",
        "(line 1038,col 9)-(line 1038,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsEmptyWithNull()",
      "begin_line": 1041,
      "end_line": 1045,
      "comment": "",
      "child_ranges": [
        "(line 1043,col 9)-(line 1043,col 40)",
        "(line 1044,col 9)-(line 1044,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsNotEmptyWithEmptyCollection()",
      "begin_line": 1047,
      "end_line": 1051,
      "comment": "",
      "child_ranges": [
        "(line 1049,col 9)-(line 1049,col 64)",
        "(line 1050,col 9)-(line 1050,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsNotEmptyWithNonEmptyCollection()",
      "begin_line": 1053,
      "end_line": 1058,
      "comment": "",
      "child_ranges": [
        "(line 1055,col 9)-(line 1055,col 64)",
        "(line 1056,col 9)-(line 1056,col 25)",
        "(line 1057,col 9)-(line 1057,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsNotEmptyWithNull()",
      "begin_line": 1060,
      "end_line": 1064,
      "comment": "",
      "child_ranges": [
        "(line 1062,col 9)-(line 1062,col 40)",
        "(line 1063,col 9)-(line 1063,col 62)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "EQUALS_TWO"
      ],
      "begin_line": 1067,
      "end_line": 1071,
      "comment": " -----------------------------------------------------------------------"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-aedf89f2-830f-4869-848c-b0b7f72b3a47.evaluate(java.lang.Number)",
      "begin_line": 1068,
      "end_line": 1070,
      "comment": "",
      "child_ranges": [
        "(line 1069,col 13)-(line 1069,col 41)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "EVEN"
      ],
      "begin_line": 1073,
      "end_line": 1077,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-3a7a4667-4c08-4d75-b83b-0c44991d9835.evaluate(java.lang.Number)",
      "begin_line": 1074,
      "end_line": 1076,
      "comment": "",
      "child_ranges": [
        "(line 1075,col 13)-(line 1075,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.filter()",
      "begin_line": 1080,
      "end_line": 1091,
      "comment": "Up to here",
      "child_ranges": [
        "(line 1082,col 9)-(line 1082,col 60)",
        "(line 1083,col 9)-(line 1083,col 20)",
        "(line 1084,col 9)-(line 1084,col 20)",
        "(line 1085,col 9)-(line 1085,col 20)",
        "(line 1086,col 9)-(line 1086,col 20)",
        "(line 1087,col 9)-(line 1087,col 48)",
        "(line 1088,col 9)-(line 1088,col 65)",
        "(line 1089,col 9)-(line 1089,col 37)",
        "(line 1090,col 9)-(line 1090,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.filterNullParameters()",
      "begin_line": 1093,
      "end_line": 1102,
      "comment": "",
      "child_ranges": [
        "(line 1095,col 9)-(line 1095,col 61)",
        "(line 1096,col 9)-(line 1096,col 57)",
        "(line 1097,col 9)-(line 1097,col 38)",
        "(line 1098,col 9)-(line 1098,col 62)",
        "(line 1099,col 9)-(line 1099,col 38)",
        "(line 1100,col 9)-(line 1100,col 56)",
        "(line 1101,col 9)-(line 1101,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.filterInverse()",
      "begin_line": 1104,
      "end_line": 1117,
      "comment": "",
      "child_ranges": [
        "(line 1106,col 9)-(line 1106,col 60)",
        "(line 1107,col 9)-(line 1107,col 20)",
        "(line 1108,col 9)-(line 1108,col 20)",
        "(line 1109,col 9)-(line 1109,col 20)",
        "(line 1110,col 9)-(line 1110,col 20)",
        "(line 1111,col 9)-(line 1111,col 48)",
        "(line 1112,col 9)-(line 1112,col 72)",
        "(line 1113,col 9)-(line 1113,col 37)",
        "(line 1114,col 9)-(line 1114,col 43)",
        "(line 1115,col 9)-(line 1115,col 43)",
        "(line 1116,col 9)-(line 1116,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.filterInverseNullParameters()",
      "begin_line": 1119,
      "end_line": 1128,
      "comment": "",
      "child_ranges": [
        "(line 1121,col 9)-(line 1121,col 61)",
        "(line 1122,col 9)-(line 1122,col 64)",
        "(line 1123,col 9)-(line 1123,col 38)",
        "(line 1124,col 9)-(line 1124,col 69)",
        "(line 1125,col 9)-(line 1125,col 38)",
        "(line 1126,col 9)-(line 1126,col 63)",
        "(line 1127,col 9)-(line 1127,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.countMatches()",
      "begin_line": 1130,
      "end_line": 1137,
      "comment": "",
      "child_ranges": [
        "(line 1133,col 9)-(line 1133,col 77)",
        "(line 1134,col 9)-(line 1134,col 71)",
        "(line 1135,col 9)-(line 1135,col 72)",
        "(line 1136,col 9)-(line 1136,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.exists()",
      "begin_line": 1139,
      "end_line": 1154,
      "comment": "",
      "child_ranges": [
        "(line 1142,col 9)-(line 1142,col 60)",
        "(line 1143,col 9)-(line 1143,col 56)",
        "(line 1144,col 9)-(line 1144,col 56)",
        "(line 1145,col 9)-(line 1145,col 62)",
        "(line 1146,col 9)-(line 1146,col 62)",
        "(line 1147,col 9)-(line 1147,col 20)",
        "(line 1148,col 9)-(line 1148,col 20)",
        "(line 1149,col 9)-(line 1149,col 20)",
        "(line 1150,col 9)-(line 1150,col 62)",
        "(line 1152,col 9)-(line 1152,col 20)",
        "(line 1153,col 9)-(line 1153,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.select()",
      "begin_line": 1156,
      "end_line": 1171,
      "comment": "",
      "child_ranges": [
        "(line 1158,col 9)-(line 1158,col 60)",
        "(line 1159,col 9)-(line 1159,col 20)",
        "(line 1160,col 9)-(line 1160,col 20)",
        "(line 1161,col 9)-(line 1161,col 20)",
        "(line 1162,col 9)-(line 1162,col 20)",
        "(line 1164,col 9)-(line 1164,col 85)",
        "(line 1165,col 9)-(line 1165,col 92)",
        "(line 1166,col 9)-(line 1166,col 104)",
        "(line 1167,col 9)-(line 1167,col 72)",
        "(line 1168,col 9)-(line 1168,col 37)",
        "(line 1169,col 9)-(line 1169,col 40)",
        "(line 1170,col 9)-(line 1170,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.selectRejected()",
      "begin_line": 1173,
      "end_line": 1190,
      "comment": "",
      "child_ranges": [
        "(line 1175,col 9)-(line 1175,col 54)",
        "(line 1176,col 9)-(line 1176,col 21)",
        "(line 1177,col 9)-(line 1177,col 21)",
        "(line 1178,col 9)-(line 1178,col 21)",
        "(line 1179,col 9)-(line 1179,col 21)",
        "(line 1180,col 9)-(line 1180,col 90)",
        "(line 1181,col 9)-(line 1181,col 102)",
        "(line 1182,col 9)-(line 1182,col 112)",
        "(line 1183,col 9)-(line 1183,col 72)",
        "(line 1184,col 9)-(line 1184,col 72)",
        "(line 1185,col 9)-(line 1185,col 37)",
        "(line 1186,col 9)-(line 1186,col 40)",
        "(line 1187,col 9)-(line 1187,col 41)",
        "(line 1188,col 9)-(line 1188,col 41)",
        "(line 1189,col 9)-(line 1189,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.partition()",
      "begin_line": 1192,
      "end_line": 1219,
      "comment": "",
      "child_ranges": [
        "(line 1195,col 9)-(line 1195,col 55)",
        "(line 1196,col 9)-(line 1196,col 21)",
        "(line 1197,col 9)-(line 1197,col 21)",
        "(line 1198,col 9)-(line 1198,col 21)",
        "(line 1199,col 9)-(line 1199,col 21)",
        "(line 1200,col 9)-(line 1200,col 86)",
        "(line 1201,col 9)-(line 1201,col 43)",
        "(line 1204,col 9)-(line 1204,col 58)",
        "(line 1205,col 9)-(line 1205,col 42)",
        "(line 1206,col 9)-(line 1206,col 80)",
        "(line 1209,col 9)-(line 1209,col 39)",
        "(line 1210,col 9)-(line 1210,col 38)",
        "(line 1211,col 9)-(line 1211,col 64)",
        "(line 1213,col 9)-(line 1213,col 81)",
        "(line 1214,col 9)-(line 1214,col 41)",
        "(line 1216,col 9)-(line 1216,col 54)",
        "(line 1217,col 9)-(line 1217,col 43)",
        "(line 1218,col 9)-(line 1218,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.partitionWithOutputCollections()",
      "begin_line": 1221,
      "end_line": 1247,
      "comment": "",
      "child_ranges": [
        "(line 1223,col 9)-(line 1223,col 55)",
        "(line 1224,col 9)-(line 1224,col 21)",
        "(line 1225,col 9)-(line 1225,col 21)",
        "(line 1226,col 9)-(line 1226,col 21)",
        "(line 1227,col 9)-(line 1227,col 21)",
        "(line 1229,col 9)-(line 1229,col 56)",
        "(line 1230,col 9)-(line 1230,col 58)",
        "(line 1232,col 9)-(line 1232,col 71)",
        "(line 1235,col 9)-(line 1235,col 39)",
        "(line 1236,col 9)-(line 1236,col 77)",
        "(line 1239,col 9)-(line 1239,col 39)",
        "(line 1240,col 9)-(line 1240,col 63)",
        "(line 1242,col 9)-(line 1242,col 23)",
        "(line 1243,col 9)-(line 1243,col 25)",
        "(line 1244,col 9)-(line 1244,col 86)",
        "(line 1245,col 9)-(line 1245,col 37)",
        "(line 1246,col 9)-(line 1246,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.partitionMultiplePredicates()",
      "begin_line": 1249,
      "end_line": 1273,
      "comment": "",
      "child_ranges": [
        "(line 1251,col 9)-(line 1251,col 55)",
        "(line 1252,col 9)-(line 1252,col 21)",
        "(line 1253,col 9)-(line 1253,col 21)",
        "(line 1254,col 9)-(line 1254,col 21)",
        "(line 1255,col 9)-(line 1255,col 21)",
        "(line 1256,col 9)-(line 1257,col 92)",
        "(line 1260,col 9)-(line 1260,col 58)",
        "(line 1261,col 9)-(line 1261,col 42)",
        "(line 1262,col 9)-(line 1262,col 64)",
        "(line 1265,col 9)-(line 1265,col 38)",
        "(line 1266,col 9)-(line 1266,col 42)",
        "(line 1267,col 9)-(line 1267,col 64)",
        "(line 1270,col 9)-(line 1270,col 36)",
        "(line 1271,col 9)-(line 1271,col 38)",
        "(line 1272,col 9)-(line 1272,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.collect()",
      "begin_line": 1275,
      "end_line": 1308,
      "comment": "",
      "child_ranges": [
        "(line 1277,col 9)-(line 1277,col 95)",
        "(line 1278,col 9)-(line 1278,col 105)",
        "(line 1279,col 9)-(line 1279,col 60)",
        "(line 1280,col 9)-(line 1280,col 40)",
        "(line 1282,col 9)-(line 1282,col 31)",
        "(line 1283,col 9)-(line 1283,col 90)",
        "(line 1284,col 9)-(line 1284,col 54)",
        "(line 1285,col 9)-(line 1285,col 34)",
        "(line 1287,col 9)-(line 1287,col 42)",
        "(line 1288,col 9)-(line 1288,col 87)",
        "(line 1290,col 9)-(line 1290,col 40)",
        "(line 1291,col 9)-(line 1291,col 68)",
        "(line 1292,col 9)-(line 1292,col 60)",
        "(line 1293,col 9)-(line 1293,col 40)",
        "(line 1295,col 9)-(line 1295,col 42)",
        "(line 1296,col 9)-(line 1296,col 85)",
        "(line 1297,col 9)-(line 1297,col 60)",
        "(line 1298,col 9)-(line 1298,col 71)",
        "(line 1299,col 9)-(line 1299,col 108)",
        "(line 1300,col 9)-(line 1300,col 43)",
        "(line 1302,col 9)-(line 1302,col 44)",
        "(line 1303,col 9)-(line 1303,col 100)",
        "(line 1304,col 9)-(line 1304,col 74)",
        "(line 1305,col 9)-(line 1305,col 64)",
        "(line 1306,col 9)-(line 1306,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.assertCollectResult(java.util.Collection\u003cjava.lang.Number\u003e)",
      "begin_line": 1310,
      "end_line": 1313,
      "comment": "",
      "child_ranges": [
        "(line 1311,col 9)-(line 1311,col 73)",
        "(line 1312,col 9)-(line 1312,col 71)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "TRANSFORM_TO_INTEGER"
      ],
      "begin_line": 1315,
      "end_line": 1319,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-5bdfbc7b-a6e6-4750-939e-bc74c8a5a11f.transform(java.lang.Object)",
      "begin_line": 1316,
      "end_line": 1318,
      "comment": "",
      "child_ranges": [
        "(line 1317,col 13)-(line 1317,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.transform1()",
      "begin_line": 1321,
      "end_line": 1343,
      "comment": "",
      "child_ranges": [
        "(line 1323,col 9)-(line 1323,col 52)",
        "(line 1324,col 9)-(line 1324,col 21)",
        "(line 1325,col 9)-(line 1325,col 21)",
        "(line 1326,col 9)-(line 1326,col 21)",
        "(line 1327,col 9)-(line 1327,col 62)",
        "(line 1328,col 9)-(line 1328,col 37)",
        "(line 1329,col 9)-(line 1329,col 37)",
        "(line 1330,col 9)-(line 1330,col 37)",
        "(line 1331,col 9)-(line 1331,col 37)",
        "(line 1333,col 9)-(line 1333,col 39)",
        "(line 1334,col 9)-(line 1334,col 21)",
        "(line 1335,col 9)-(line 1335,col 21)",
        "(line 1336,col 9)-(line 1336,col 21)",
        "(line 1337,col 9)-(line 1337,col 62)",
        "(line 1338,col 9)-(line 1338,col 37)",
        "(line 1339,col 9)-(line 1339,col 46)",
        "(line 1340,col 9)-(line 1340,col 37)",
        "(line 1341,col 9)-(line 1341,col 46)",
        "(line 1342,col 9)-(line 1342,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.transform2()",
      "begin_line": 1345,
      "end_line": 1358,
      "comment": "",
      "child_ranges": [
        "(line 1347,col 9)-(line 1347,col 54)",
        "(line 1348,col 9)-(line 1348,col 20)",
        "(line 1349,col 9)-(line 1349,col 20)",
        "(line 1350,col 9)-(line 1350,col 20)",
        "(line 1351,col 9)-(line 1355,col 11)",
        "(line 1356,col 9)-(line 1356,col 36)",
        "(line 1357,col 9)-(line 1357,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-e0c162e7-d0bb-482d-8a4e-73be8ece049a.transform(java.lang.Object)",
      "begin_line": 1352,
      "end_line": 1354,
      "comment": "",
      "child_ranges": [
        "(line 1353,col 17)-(line 1353,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.addIgnoreNull()",
      "begin_line": 1361,
      "end_line": 1374,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 1363,col 9)-(line 1363,col 54)",
        "(line 1364,col 9)-(line 1364,col 21)",
        "(line 1365,col 9)-(line 1365,col 21)",
        "(line 1366,col 9)-(line 1366,col 21)",
        "(line 1367,col 9)-(line 1367,col 62)",
        "(line 1368,col 9)-(line 1368,col 36)",
        "(line 1369,col 9)-(line 1369,col 61)",
        "(line 1370,col 9)-(line 1370,col 36)",
        "(line 1371,col 9)-(line 1371,col 68)",
        "(line 1372,col 9)-(line 1372,col 36)",
        "(line 1373,col 9)-(line 1373,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.predicatedCollection()",
      "begin_line": 1377,
      "end_line": 1394,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 1379,col 9)-(line 1379,col 94)",
        "(line 1380,col 9)-(line 1380,col 113)",
        "(line 1381,col 9)-(line 1381,col 115)",
        "(line 1382,col 9)-(line 1387,col 9)",
        "(line 1388,col 9)-(line 1393,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.isFull()",
      "begin_line": 1396,
      "end_line": 1415,
      "comment": "",
      "child_ranges": [
        "(line 1398,col 9)-(line 1398,col 54)",
        "(line 1399,col 9)-(line 1399,col 21)",
        "(line 1400,col 9)-(line 1400,col 21)",
        "(line 1401,col 9)-(line 1401,col 21)",
        "(line 1402,col 9)-(line 1406,col 9)",
        "(line 1407,col 9)-(line 1407,col 49)",
        "(line 1409,col 9)-(line 1409,col 81)",
        "(line 1410,col 9)-(line 1410,col 57)",
        "(line 1411,col 9)-(line 1411,col 24)",
        "(line 1412,col 9)-(line 1412,col 49)",
        "(line 1413,col 9)-(line 1413,col 21)",
        "(line 1414,col 9)-(line 1414,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.isEmpty()",
      "begin_line": 1417,
      "end_line": 1421,
      "comment": "",
      "child_ranges": [
        "(line 1419,col 9)-(line 1419,col 54)",
        "(line 1420,col 9)-(line 1420,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.maxSize()",
      "begin_line": 1423,
      "end_line": 1442,
      "comment": "",
      "child_ranges": [
        "(line 1425,col 9)-(line 1425,col 54)",
        "(line 1426,col 9)-(line 1426,col 21)",
        "(line 1427,col 9)-(line 1427,col 21)",
        "(line 1428,col 9)-(line 1428,col 21)",
        "(line 1429,col 9)-(line 1433,col 9)",
        "(line 1434,col 9)-(line 1434,col 55)",
        "(line 1436,col 9)-(line 1436,col 69)",
        "(line 1437,col 9)-(line 1437,col 54)",
        "(line 1438,col 9)-(line 1438,col 24)",
        "(line 1439,col 9)-(line 1439,col 54)",
        "(line 1440,col 9)-(line 1440,col 21)",
        "(line 1441,col 9)-(line 1441,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.intersectionUsesMethodEquals()",
      "begin_line": 1444,
      "end_line": 1483,
      "comment": "",
      "child_ranges": [
        "(line 1447,col 9)-(line 1447,col 45)",
        "(line 1448,col 9)-(line 1448,col 45)",
        "(line 1451,col 9)-(line 1451,col 33)",
        "(line 1452,col 9)-(line 1452,col 33)",
        "(line 1455,col 9)-(line 1455,col 33)",
        "(line 1458,col 9)-(line 1458,col 64)",
        "(line 1459,col 9)-(line 1459,col 66)",
        "(line 1463,col 9)-(line 1463,col 23)",
        "(line 1464,col 9)-(line 1464,col 23)",
        "(line 1468,col 9)-(line 1468,col 89)",
        "(line 1469,col 9)-(line 1469,col 45)",
        "(line 1474,col 9)-(line 1474,col 59)",
        "(line 1475,col 9)-(line 1475,col 81)",
        "(line 1479,col 9)-(line 1479,col 33)",
        "(line 1480,col 9)-(line 1480,col 33)",
        "(line 1481,col 9)-(line 1481,col 33)",
        "(line 1482,col 9)-(line 1482,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testRetainAll()",
      "begin_line": 1487,
      "end_line": 1517,
      "comment": "Up to here",
      "child_ranges": [
        "(line 1489,col 9)-(line 1489,col 58)",
        "(line 1490,col 9)-(line 1490,col 22)",
        "(line 1491,col 9)-(line 1491,col 22)",
        "(line 1492,col 9)-(line 1492,col 22)",
        "(line 1493,col 9)-(line 1493,col 57)",
        "(line 1494,col 9)-(line 1494,col 21)",
        "(line 1495,col 9)-(line 1495,col 21)",
        "(line 1496,col 9)-(line 1496,col 21)",
        "(line 1498,col 9)-(line 1498,col 79)",
        "(line 1499,col 9)-(line 1499,col 39)",
        "(line 1500,col 9)-(line 1500,col 49)",
        "(line 1501,col 9)-(line 1501,col 42)",
        "(line 1502,col 9)-(line 1502,col 49)",
        "(line 1503,col 9)-(line 1503,col 37)",
        "(line 1504,col 9)-(line 1504,col 47)",
        "(line 1505,col 9)-(line 1505,col 47)",
        "(line 1506,col 9)-(line 1506,col 47)",
        "(line 1507,col 9)-(line 1507,col 36)",
        "(line 1508,col 9)-(line 1508,col 46)",
        "(line 1509,col 9)-(line 1509,col 46)",
        "(line 1510,col 9)-(line 1510,col 46)",
        "(line 1512,col 9)-(line 1516,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testRemoveAll()",
      "begin_line": 1519,
      "end_line": 1549,
      "comment": "",
      "child_ranges": [
        "(line 1521,col 9)-(line 1521,col 58)",
        "(line 1522,col 9)-(line 1522,col 22)",
        "(line 1523,col 9)-(line 1523,col 22)",
        "(line 1524,col 9)-(line 1524,col 22)",
        "(line 1525,col 9)-(line 1525,col 57)",
        "(line 1526,col 9)-(line 1526,col 21)",
        "(line 1527,col 9)-(line 1527,col 21)",
        "(line 1528,col 9)-(line 1528,col 21)",
        "(line 1530,col 9)-(line 1530,col 79)",
        "(line 1531,col 9)-(line 1531,col 39)",
        "(line 1532,col 9)-(line 1532,col 42)",
        "(line 1533,col 9)-(line 1533,col 49)",
        "(line 1534,col 9)-(line 1534,col 42)",
        "(line 1535,col 9)-(line 1535,col 37)",
        "(line 1536,col 9)-(line 1536,col 47)",
        "(line 1537,col 9)-(line 1537,col 47)",
        "(line 1538,col 9)-(line 1538,col 47)",
        "(line 1539,col 9)-(line 1539,col 36)",
        "(line 1540,col 9)-(line 1540,col 46)",
        "(line 1541,col 9)-(line 1541,col 46)",
        "(line 1542,col 9)-(line 1542,col 46)",
        "(line 1544,col 9)-(line 1548,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testTransformedCollection()",
      "begin_line": 1552,
      "end_line": 1569,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 1554,col 9)-(line 1554,col 90)",
        "(line 1555,col 9)-(line 1555,col 117)",
        "(line 1556,col 9)-(line 1556,col 117)",
        "(line 1557,col 9)-(line 1562,col 9)",
        "(line 1563,col 9)-(line 1568,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testTransformedCollection_2()",
      "begin_line": 1571,
      "end_line": 1581,
      "comment": "",
      "child_ranges": [
        "(line 1573,col 9)-(line 1573,col 58)",
        "(line 1574,col 9)-(line 1574,col 22)",
        "(line 1575,col 9)-(line 1575,col 22)",
        "(line 1576,col 9)-(line 1576,col 22)",
        "(line 1577,col 9)-(line 1577,col 109)",
        "(line 1578,col 9)-(line 1578,col 49)",
        "(line 1579,col 9)-(line 1579,col 49)",
        "(line 1580,col 9)-(line 1580,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSynchronizedCollection()",
      "begin_line": 1583,
      "end_line": 1593,
      "comment": "",
      "child_ranges": [
        "(line 1585,col 9)-(line 1585,col 97)",
        "(line 1586,col 9)-(line 1586,col 113)",
        "(line 1587,col 9)-(line 1592,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testUnmodifiableCollection()",
      "begin_line": 1595,
      "end_line": 1605,
      "comment": "",
      "child_ranges": [
        "(line 1597,col 9)-(line 1597,col 97)",
        "(line 1598,col 9)-(line 1598,col 113)",
        "(line 1599,col 9)-(line 1604,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.emptyCollection()",
      "begin_line": 1607,
      "end_line": 1611,
      "comment": "",
      "child_ranges": [
        "(line 1609,col 9)-(line 1609,col 74)",
        "(line 1610,col 9)-(line 1610,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.emptyIfNull()",
      "begin_line": 1613,
      "end_line": 1618,
      "comment": "",
      "child_ranges": [
        "(line 1615,col 9)-(line 1615,col 64)",
        "(line 1616,col 9)-(line 1616,col 70)",
        "(line 1617,col 9)-(line 1617,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.addAllForIterable()",
      "begin_line": 1626,
      "end_line": 1660,
      "comment": "\n     * This test ensures that {@link Iterable}s are supported by {@link CollectionUtils}.\n     * Specifically, it uses mocks to ensure that if the passed in\n     * {@link Iterable} is a {@link Collection} then\n     * {@link Collection#addAll(Collection)} is called instead of iterating.\n     ",
      "child_ranges": [
        "(line 1628,col 9)-(line 1628,col 81)",
        "(line 1629,col 9)-(line 1629,col 64)",
        "(line 1630,col 9)-(line 1630,col 67)",
        "(line 1631,col 9)-(line 1631,col 67)",
        "(line 1632,col 9)-(line 1632,col 66)",
        "(line 1634,col 9)-(line 1634,col 56)",
        "(line 1635,col 9)-(line 1635,col 27)",
        "(line 1636,col 9)-(line 1636,col 27)",
        "(line 1637,col 9)-(line 1637,col 27)",
        "(line 1638,col 9)-(line 1638,col 52)",
        "(line 1639,col 9)-(line 1639,col 42)",
        "(line 1640,col 9)-(line 1640,col 42)",
        "(line 1641,col 9)-(line 1641,col 42)",
        "(line 1644,col 9)-(line 1644,col 58)",
        "(line 1647,col 9)-(line 1647,col 56)",
        "(line 1648,col 9)-(line 1648,col 27)",
        "(line 1649,col 9)-(line 1649,col 52)",
        "(line 1650,col 9)-(line 1650,col 43)",
        "(line 1651,col 9)-(line 1651,col 59)",
        "(line 1653,col 9)-(line 1653,col 17)",
        "(line 1654,col 9)-(line 1654,col 56)",
        "(line 1655,col 9)-(line 1655,col 61)",
        "(line 1657,col 9)-(line 1657,col 57)",
        "(line 1658,col 9)-(line 1658,col 62)",
        "(line 1659,col 9)-(line 1659,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.addAllForEnumeration()",
      "begin_line": 1662,
      "end_line": 1669,
      "comment": "",
      "child_ranges": [
        "(line 1664,col 9)-(line 1664,col 80)",
        "(line 1665,col 9)-(line 1665,col 20)",
        "(line 1666,col 9)-(line 1666,col 68)",
        "(line 1667,col 9)-(line 1667,col 57)",
        "(line 1668,col 9)-(line 1668,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.addAllForElements()",
      "begin_line": 1671,
      "end_line": 1675,
      "comment": "",
      "child_ranges": [
        "(line 1673,col 9)-(line 1673,col 62)",
        "(line 1674,col 9)-(line 1674,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getNegative()",
      "begin_line": 1677,
      "end_line": 1680,
      "comment": "",
      "child_ranges": [
        "(line 1679,col 9)-(line 1679,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getPositiveOutOfBounds()",
      "begin_line": 1682,
      "end_line": 1685,
      "comment": "",
      "child_ranges": [
        "(line 1684,col 9)-(line 1684,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.get1()",
      "begin_line": 1687,
      "end_line": 1690,
      "comment": "",
      "child_ranges": [
        "(line 1689,col 9)-(line 1689,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.get()",
      "begin_line": 1692,
      "end_line": 1698,
      "comment": "",
      "child_ranges": [
        "(line 1694,col 9)-(line 1694,col 69)",
        "(line 1695,col 9)-(line 1695,col 80)",
        "(line 1696,col 9)-(line 1696,col 89)",
        "(line 1697,col 9)-(line 1697,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getIterator()",
      "begin_line": 1700,
      "end_line": 1707,
      "comment": "",
      "child_ranges": [
        "(line 1702,col 9)-(line 1702,col 60)",
        "(line 1703,col 9)-(line 1703,col 78)",
        "(line 1704,col 9)-(line 1704,col 33)",
        "(line 1705,col 9)-(line 1705,col 78)",
        "(line 1706,col 9)-(line 1706,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getEnumeration()",
      "begin_line": 1709,
      "end_line": 1717,
      "comment": "",
      "child_ranges": [
        "(line 1711,col 9)-(line 1711,col 73)",
        "(line 1712,col 9)-(line 1712,col 58)",
        "(line 1713,col 9)-(line 1713,col 68)",
        "(line 1714,col 9)-(line 1714,col 40)",
        "(line 1715,col 9)-(line 1715,col 68)",
        "(line 1716,col 9)-(line 1716,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.reverse()",
      "begin_line": 1719,
      "end_line": 1727,
      "comment": "",
      "child_ranges": [
        "(line 1721,col 9)-(line 1721,col 54)",
        "(line 1722,col 9)-(line 1722,col 81)",
        "(line 1723,col 9)-(line 1723,col 40)",
        "(line 1725,col 9)-(line 1725,col 41)",
        "(line 1726,col 9)-(line 1726,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.extractSingleton()",
      "begin_line": 1729,
      "end_line": 1751,
      "comment": "",
      "child_ranges": [
        "(line 1731,col 9)-(line 1731,col 38)",
        "(line 1732,col 9)-(line 1736,col 9)",
        "(line 1737,col 9)-(line 1737,col 39)",
        "(line 1738,col 9)-(line 1742,col 9)",
        "(line 1743,col 9)-(line 1743,col 24)",
        "(line 1744,col 9)-(line 1744,col 68)",
        "(line 1745,col 9)-(line 1745,col 24)",
        "(line 1746,col 9)-(line 1750,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.next(java.util.Iterator\u003cT\u003e, T)",
      "begin_line": 1756,
      "end_line": 1759,
      "comment": "\n     * Records the next object returned for a mock iterator\n     ",
      "child_ranges": [
        "(line 1757,col 9)-(line 1757,col 51)",
        "(line 1758,col 9)-(line 1758,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.collateException1()",
      "begin_line": 1761,
      "end_line": 1764,
      "comment": "",
      "child_ranges": [
        "(line 1763,col 9)-(line 1763,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.collateException2()",
      "begin_line": 1766,
      "end_line": 1769,
      "comment": "",
      "child_ranges": [
        "(line 1768,col 9)-(line 1768,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testCollate()",
      "begin_line": 1771,
      "end_line": 1804,
      "comment": "",
      "child_ranges": [
        "(line 1773,col 9)-(line 1773,col 89)",
        "(line 1774,col 9)-(line 1774,col 65)",
        "(line 1776,col 9)-(line 1776,col 71)",
        "(line 1777,col 9)-(line 1777,col 72)",
        "(line 1779,col 9)-(line 1779,col 82)",
        "(line 1780,col 9)-(line 1780,col 82)",
        "(line 1781,col 9)-(line 1781,col 60)",
        "(line 1783,col 9)-(line 1783,col 62)",
        "(line 1784,col 9)-(line 1784,col 41)",
        "(line 1785,col 9)-(line 1785,col 41)",
        "(line 1786,col 9)-(line 1786,col 39)",
        "(line 1788,col 9)-(line 1788,col 65)",
        "(line 1790,col 9)-(line 1791,col 97)",
        "(line 1793,col 9)-(line 1793,col 94)",
        "(line 1794,col 9)-(line 1794,col 76)",
        "(line 1796,col 9)-(line 1796,col 57)",
        "(line 1797,col 9)-(line 1797,col 57)",
        "(line 1798,col 9)-(line 1798,col 42)",
        "(line 1800,col 9)-(line 1800,col 87)",
        "(line 1801,col 9)-(line 1801,col 87)",
        "(line 1802,col 9)-(line 1802,col 71)",
        "(line 1803,col 9)-(line 1803,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testCollateIgnoreDuplicates()",
      "begin_line": 1806,
      "end_line": 1819,
      "comment": "",
      "child_ranges": [
        "(line 1808,col 9)-(line 1808,col 89)",
        "(line 1809,col 9)-(line 1809,col 89)",
        "(line 1810,col 9)-(line 1810,col 80)",
        "(line 1812,col 9)-(line 1812,col 58)",
        "(line 1813,col 9)-(line 1813,col 40)",
        "(line 1814,col 9)-(line 1814,col 40)",
        "(line 1815,col 9)-(line 1815,col 73)",
        "(line 1816,col 9)-(line 1816,col 39)",
        "(line 1818,col 9)-(line 1818,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testPermutationsWithNullCollection()",
      "begin_line": 1821,
      "end_line": 1824,
      "comment": "",
      "child_ranges": [
        "(line 1823,col 9)-(line 1823,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testPermutations()",
      "begin_line": 1826,
      "end_line": 1838,
      "comment": "",
      "child_ranges": [
        "(line 1828,col 9)-(line 1828,col 57)",
        "(line 1829,col 9)-(line 1829,col 86)",
        "(line 1832,col 9)-(line 1832,col 37)",
        "(line 1833,col 9)-(line 1833,col 26)",
        "(line 1834,col 9)-(line 1836,col 9)",
        "(line 1837,col 9)-(line 1837,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testMatchesAll()",
      "begin_line": 1840,
      "end_line": 1862,
      "comment": "",
      "child_ranges": [
        "(line 1843,col 9)-(line 1843,col 60)",
        "(line 1844,col 9)-(line 1844,col 67)",
        "(line 1846,col 9)-(line 1850,col 10)",
        "(line 1851,col 9)-(line 1851,col 74)",
        "(line 1853,col 9)-(line 1857,col 10)",
        "(line 1858,col 9)-(line 1858,col 75)",
        "(line 1860,col 9)-(line 1860,col 67)",
        "(line 1861,col 9)-(line 1861,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-bb42f1a1-3b32-4b00-b82c-21a616060cce.evaluate(java.lang.Integer)",
      "begin_line": 1847,
      "end_line": 1849,
      "comment": "",
      "child_ranges": [
        "(line 1848,col 17)-(line 1848,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-c167c8f7-c955-4720-9864-63e8ad96950f.evaluate(java.lang.Integer)",
      "begin_line": 1854,
      "end_line": 1856,
      "comment": "",
      "child_ranges": [
        "(line 1855,col 17)-(line 1855,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testRemoveAllWithEquator()",
      "begin_line": 1864,
      "end_line": 1912,
      "comment": "",
      "child_ranges": [
        "(line 1866,col 9)-(line 1866,col 58)",
        "(line 1867,col 9)-(line 1867,col 23)",
        "(line 1868,col 9)-(line 1868,col 23)",
        "(line 1869,col 9)-(line 1869,col 23)",
        "(line 1871,col 9)-(line 1871,col 60)",
        "(line 1872,col 9)-(line 1872,col 25)",
        "(line 1873,col 9)-(line 1873,col 25)",
        "(line 1874,col 9)-(line 1874,col 25)",
        "(line 1877,col 9)-(line 1886,col 11)",
        "(line 1888,col 9)-(line 1888,col 39)",
        "(line 1889,col 9)-(line 1889,col 42)",
        "(line 1890,col 9)-(line 1890,col 42)",
        "(line 1891,col 9)-(line 1891,col 43)",
        "(line 1892,col 9)-(line 1892,col 37)",
        "(line 1893,col 9)-(line 1893,col 48)",
        "(line 1894,col 9)-(line 1894,col 48)",
        "(line 1895,col 9)-(line 1895,col 48)",
        "(line 1896,col 9)-(line 1896,col 39)",
        "(line 1897,col 9)-(line 1897,col 50)",
        "(line 1898,col 9)-(line 1898,col 50)",
        "(line 1899,col 9)-(line 1899,col 50)",
        "(line 1901,col 9)-(line 1905,col 9)",
        "(line 1907,col 9)-(line 1911,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-a0efd094-d0a1-4b6c-a3f6-7b38d08ff66a.equate(java.lang.String, java.lang.String)",
      "begin_line": 1879,
      "end_line": 1881,
      "comment": "",
      "child_ranges": [
        "(line 1880,col 17)-(line 1880,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-8cf8f190-b187-4d95-a1ba-7ab8ffe8f917.hash(java.lang.String)",
      "begin_line": 1883,
      "end_line": 1885,
      "comment": "",
      "child_ranges": [
        "(line 1884,col 17)-(line 1884,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testRetainAllWithEquator()",
      "begin_line": 1914,
      "end_line": 1963,
      "comment": "",
      "child_ranges": [
        "(line 1916,col 9)-(line 1916,col 58)",
        "(line 1917,col 9)-(line 1917,col 23)",
        "(line 1918,col 9)-(line 1918,col 23)",
        "(line 1919,col 9)-(line 1919,col 23)",
        "(line 1921,col 9)-(line 1921,col 60)",
        "(line 1922,col 9)-(line 1922,col 25)",
        "(line 1923,col 9)-(line 1923,col 25)",
        "(line 1924,col 9)-(line 1924,col 25)",
        "(line 1927,col 9)-(line 1936,col 11)",
        "(line 1937,col 9)-(line 1937,col 39)",
        "(line 1938,col 9)-(line 1938,col 42)",
        "(line 1939,col 9)-(line 1939,col 43)",
        "(line 1940,col 9)-(line 1940,col 43)",
        "(line 1942,col 9)-(line 1942,col 37)",
        "(line 1943,col 9)-(line 1943,col 40)",
        "(line 1944,col 9)-(line 1944,col 40)",
        "(line 1945,col 9)-(line 1945,col 40)",
        "(line 1947,col 9)-(line 1947,col 39)",
        "(line 1948,col 9)-(line 1948,col 42)",
        "(line 1949,col 9)-(line 1949,col 42)",
        "(line 1950,col 9)-(line 1950,col 42)",
        "(line 1952,col 9)-(line 1956,col 9)",
        "(line 1958,col 9)-(line 1962,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-c01a6798-93b3-4cf8-b691-416dd06d49b8.equate(java.lang.String, java.lang.String)",
      "begin_line": 1929,
      "end_line": 1931,
      "comment": "",
      "child_ranges": [
        "(line 1930,col 17)-(line 1930,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-4fa71cd2-89e2-4d53-8d57-c04fc2f289ff.hash(java.lang.String)",
      "begin_line": 1933,
      "end_line": 1935,
      "comment": "",
      "child_ranges": [
        "(line 1934,col 17)-(line 1934,col 35)"
      ]
    }
  ]
}