{
  "filepath": "/tmp/Collections-27b/src/test/java/org/apache/commons/collections4/CollectionUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CollectionUtilsTest",
      "is_interface": false,
      "parent_types": [
        "MockTestCase"
      ],
      "begin_line": 57,
      "end_line": 1910,
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
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 67)",
        "(line 194,col 9)-(line 194,col 67)",
        "(line 195,col 9)-(line 195,col 67)",
        "(line 196,col 9)-(line 196,col 67)",
        "(line 197,col 9)-(line 197,col 67)",
        "(line 199,col 9)-(line 199,col 68)",
        "(line 200,col 9)-(line 200,col 68)",
        "(line 201,col 9)-(line 201,col 68)",
        "(line 202,col 9)-(line 202,col 68)",
        "(line 203,col 9)-(line 203,col 68)",
        "(line 208,col 9)-(line 208,col 69)",
        "(line 209,col 9)-(line 209,col 68)",
        "(line 211,col 9)-(line 211,col 54)",
        "(line 212,col 9)-(line 212,col 21)",
        "(line 213,col 9)-(line 213,col 21)",
        "(line 214,col 9)-(line 214,col 21)",
        "(line 215,col 9)-(line 215,col 21)",
        "(line 216,col 9)-(line 216,col 63)",
        "(line 217,col 9)-(line 217,col 63)",
        "(line 218,col 9)-(line 218,col 63)",
        "(line 219,col 9)-(line 219,col 63)",
        "(line 220,col 9)-(line 220,col 63)",
        "(line 222,col 9)-(line 222,col 54)",
        "(line 223,col 9)-(line 223,col 24)",
        "(line 224,col 9)-(line 224,col 21)",
        "(line 225,col 9)-(line 225,col 21)",
        "(line 226,col 9)-(line 226,col 21)",
        "(line 227,col 9)-(line 227,col 63)",
        "(line 228,col 9)-(line 228,col 63)",
        "(line 229,col 9)-(line 229,col 63)",
        "(line 230,col 9)-(line 230,col 63)",
        "(line 231,col 9)-(line 231,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.cardinalityOfNull()",
      "begin_line": 234,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 58)",
        "(line 238,col 9)-(line 238,col 65)",
        "(line 239,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 243,col 22)",
        "(line 244,col 9)-(line 244,col 65)",
        "(line 245,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 23)",
        "(line 250,col 9)-(line 250,col 65)",
        "(line 251,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 22)",
        "(line 256,col 9)-(line 256,col 65)",
        "(line 257,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 261,col 23)",
        "(line 262,col 9)-(line 262,col 65)",
        "(line 263,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 267,col 22)",
        "(line 268,col 9)-(line 268,col 65)",
        "(line 269,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 273,col 23)",
        "(line 274,col 9)-(line 274,col 65)",
        "(line 275,col 9)-(line 278,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.containsAll()",
      "begin_line": 281,
      "end_line": 315,
      "comment": "",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 66)",
        "(line 284,col 9)-(line 284,col 64)",
        "(line 285,col 9)-(line 285,col 21)",
        "(line 286,col 9)-(line 286,col 64)",
        "(line 287,col 9)-(line 287,col 21)",
        "(line 288,col 9)-(line 288,col 66)",
        "(line 289,col 9)-(line 289,col 23)",
        "(line 290,col 9)-(line 290,col 65)",
        "(line 291,col 9)-(line 291,col 22)",
        "(line 292,col 9)-(line 292,col 22)",
        "(line 293,col 9)-(line 293,col 70)",
        "(line 294,col 9)-(line 294,col 27)",
        "(line 295,col 9)-(line 295,col 27)",
        "(line 296,col 9)-(line 296,col 27)",
        "(line 298,col 9)-(line 298,col 107)",
        "(line 299,col 9)-(line 299,col 105)",
        "(line 300,col 9)-(line 300,col 109)",
        "(line 301,col 9)-(line 301,col 107)",
        "(line 302,col 9)-(line 302,col 102)",
        "(line 303,col 9)-(line 303,col 108)",
        "(line 305,col 9)-(line 305,col 107)",
        "(line 306,col 9)-(line 306,col 107)",
        "(line 307,col 9)-(line 307,col 106)",
        "(line 308,col 9)-(line 308,col 106)",
        "(line 309,col 9)-(line 309,col 106)",
        "(line 310,col 9)-(line 310,col 108)",
        "(line 311,col 9)-(line 311,col 104)",
        "(line 313,col 9)-(line 313,col 115)",
        "(line 314,col 9)-(line 314,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.containsAny()",
      "begin_line": 317,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 66)",
        "(line 320,col 9)-(line 320,col 64)",
        "(line 321,col 9)-(line 321,col 21)",
        "(line 322,col 9)-(line 322,col 64)",
        "(line 323,col 9)-(line 323,col 21)",
        "(line 324,col 9)-(line 324,col 66)",
        "(line 325,col 9)-(line 325,col 23)",
        "(line 326,col 9)-(line 326,col 65)",
        "(line 327,col 9)-(line 327,col 22)",
        "(line 328,col 9)-(line 328,col 22)",
        "(line 330,col 9)-(line 330,col 105)",
        "(line 331,col 9)-(line 331,col 105)",
        "(line 332,col 9)-(line 332,col 107)",
        "(line 333,col 9)-(line 333,col 107)",
        "(line 334,col 9)-(line 334,col 102)",
        "(line 335,col 9)-(line 335,col 108)",
        "(line 337,col 9)-(line 337,col 107)",
        "(line 338,col 9)-(line 338,col 107)",
        "(line 339,col 9)-(line 339,col 106)",
        "(line 340,col 9)-(line 340,col 106)",
        "(line 341,col 9)-(line 341,col 108)",
        "(line 342,col 9)-(line 342,col 108)",
        "(line 343,col 9)-(line 343,col 106)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.union()",
      "begin_line": 346,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 84)",
        "(line 349,col 9)-(line 349,col 82)",
        "(line 350,col 9)-(line 350,col 54)",
        "(line 351,col 9)-(line 351,col 54)",
        "(line 352,col 9)-(line 352,col 54)",
        "(line 353,col 9)-(line 353,col 54)",
        "(line 354,col 9)-(line 354,col 54)",
        "(line 356,col 9)-(line 356,col 87)",
        "(line 357,col 9)-(line 357,col 83)",
        "(line 358,col 9)-(line 358,col 55)",
        "(line 359,col 9)-(line 359,col 55)",
        "(line 360,col 9)-(line 360,col 55)",
        "(line 361,col 9)-(line 361,col 55)",
        "(line 362,col 9)-(line 362,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.intersection()",
      "begin_line": 365,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 91)",
        "(line 368,col 9)-(line 368,col 82)",
        "(line 369,col 9)-(line 369,col 32)",
        "(line 370,col 9)-(line 370,col 54)",
        "(line 371,col 9)-(line 371,col 54)",
        "(line 372,col 9)-(line 372,col 54)",
        "(line 373,col 9)-(line 373,col 32)",
        "(line 375,col 9)-(line 375,col 96)",
        "(line 376,col 9)-(line 376,col 83)",
        "(line 377,col 9)-(line 377,col 33)",
        "(line 378,col 9)-(line 378,col 55)",
        "(line 379,col 9)-(line 379,col 55)",
        "(line 380,col 9)-(line 380,col 55)",
        "(line 381,col 9)-(line 381,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.disjunction()",
      "begin_line": 384,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 90)",
        "(line 387,col 9)-(line 387,col 82)",
        "(line 388,col 9)-(line 388,col 54)",
        "(line 389,col 9)-(line 389,col 54)",
        "(line 390,col 9)-(line 390,col 32)",
        "(line 391,col 9)-(line 391,col 54)",
        "(line 392,col 9)-(line 392,col 54)",
        "(line 394,col 9)-(line 394,col 95)",
        "(line 395,col 9)-(line 395,col 83)",
        "(line 396,col 9)-(line 396,col 55)",
        "(line 397,col 9)-(line 397,col 55)",
        "(line 398,col 9)-(line 398,col 33)",
        "(line 399,col 9)-(line 399,col 55)",
        "(line 400,col 9)-(line 400,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testDisjunctionAsUnionMinusIntersection()",
      "begin_line": 403,
      "end_line": 409,
      "comment": "",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 101)",
        "(line 406,col 9)-(line 406,col 94)",
        "(line 407,col 9)-(line 407,col 104)",
        "(line 408,col 9)-(line 408,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testDisjunctionAsSymmetricDifference()",
      "begin_line": 411,
      "end_line": 417,
      "comment": "",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 101)",
        "(line 414,col 9)-(line 414,col 98)",
        "(line 415,col 9)-(line 415,col 98)",
        "(line 416,col 9)-(line 416,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSubtract()",
      "begin_line": 419,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 87)",
        "(line 422,col 9)-(line 422,col 82)",
        "(line 423,col 9)-(line 423,col 54)",
        "(line 424,col 9)-(line 424,col 32)",
        "(line 425,col 9)-(line 425,col 32)",
        "(line 426,col 9)-(line 426,col 54)",
        "(line 427,col 9)-(line 427,col 32)",
        "(line 429,col 9)-(line 429,col 92)",
        "(line 430,col 9)-(line 430,col 83)",
        "(line 431,col 9)-(line 431,col 55)",
        "(line 432,col 9)-(line 432,col 33)",
        "(line 433,col 9)-(line 433,col 33)",
        "(line 434,col 9)-(line 434,col 55)",
        "(line 435,col 9)-(line 435,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSubtractWithPredicate()",
      "begin_line": 438,
      "end_line": 454,
      "comment": "",
      "child_ranges": [
        "(line 441,col 9)-(line 445,col 10)",
        "(line 447,col 9)-(line 447,col 99)",
        "(line 448,col 9)-(line 448,col 82)",
        "(line 449,col 9)-(line 449,col 55)",
        "(line 450,col 9)-(line 450,col 55)",
        "(line 451,col 9)-(line 451,col 55)",
        "(line 452,col 9)-(line 452,col 55)",
        "(line 453,col 9)-(line 453,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-549f5aa0-47b4-47bc-b36c-ce55d84e1fbe.evaluate(java.lang.Number)",
      "begin_line": 442,
      "end_line": 444,
      "comment": "",
      "child_ranges": [
        "(line 443,col 17)-(line 443,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsSubCollectionOfSelf()",
      "begin_line": 456,
      "end_line": 460,
      "comment": "",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 78)",
        "(line 459,col 9)-(line 459,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsSubCollection()",
      "begin_line": 462,
      "end_line": 466,
      "comment": "",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 79)",
        "(line 465,col 9)-(line 465,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsSubCollection2()",
      "begin_line": 468,
      "end_line": 506,
      "comment": "",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 63)",
        "(line 471,col 9)-(line 471,col 68)",
        "(line 472,col 9)-(line 472,col 69)",
        "(line 473,col 9)-(line 473,col 17)",
        "(line 474,col 9)-(line 474,col 68)",
        "(line 475,col 9)-(line 475,col 69)",
        "(line 476,col 9)-(line 476,col 17)",
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
        "(line 502,col 9)-(line 502,col 68)",
        "(line 503,col 9)-(line 503,col 17)",
        "(line 504,col 9)-(line 504,col 69)",
        "(line 505,col 9)-(line 505,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsEqualCollectionToSelf()",
      "begin_line": 508,
      "end_line": 512,
      "comment": "",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 80)",
        "(line 511,col 9)-(line 511,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsEqualCollection()",
      "begin_line": 514,
      "end_line": 518,
      "comment": "",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 81)",
        "(line 517,col 9)-(line 517,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsEqualCollectionReturnsFalse()",
      "begin_line": 520,
      "end_line": 528,
      "comment": "",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 68)",
        "(line 524,col 9)-(line 524,col 20)",
        "(line 525,col 9)-(line 525,col 17)",
        "(line 526,col 9)-(line 526,col 71)",
        "(line 527,col 9)-(line 527,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsEqualCollection2()",
      "begin_line": 530,
      "end_line": 554,
      "comment": "",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 61)",
        "(line 533,col 9)-(line 533,col 61)",
        "(line 534,col 9)-(line 534,col 60)",
        "(line 535,col 9)-(line 535,col 60)",
        "(line 536,col 9)-(line 536,col 19)",
        "(line 537,col 9)-(line 537,col 61)",
        "(line 538,col 9)-(line 538,col 61)",
        "(line 539,col 9)-(line 539,col 19)",
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
        "(line 553,col 9)-(line 553,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsEqualCollectionEquator()",
      "begin_line": 556,
      "end_line": 582,
      "comment": "",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 101)",
        "(line 561,col 9)-(line 573,col 10)",
        "(line 575,col 9)-(line 575,col 83)",
        "(line 576,col 9)-(line 576,col 77)",
        "(line 577,col 9)-(line 577,col 77)",
        "(line 579,col 9)-(line 579,col 79)",
        "(line 580,col 9)-(line 580,col 97)",
        "(line 581,col 9)-(line 581,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-184fe09c-4535-4835-a720-2668910a61f2.equate(java.lang.Integer, java.lang.Integer)",
      "begin_line": 562,
      "end_line": 568,
      "comment": "",
      "child_ranges": [
        "(line 563,col 17)-(line 567,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-76712a43-ba3b-4d00-87a1-446a163599b5.hash(java.lang.Integer)",
      "begin_line": 570,
      "end_line": 572,
      "comment": "",
      "child_ranges": [
        "(line 571,col 17)-(line 571,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsEqualCollectionNullEquator()",
      "begin_line": 584,
      "end_line": 587,
      "comment": "",
      "child_ranges": [
        "(line 586,col 9)-(line 586,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsProperSubCollection()",
      "begin_line": 589,
      "end_line": 609,
      "comment": "",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 61)",
        "(line 592,col 9)-(line 592,col 61)",
        "(line 593,col 9)-(line 593,col 65)",
        "(line 594,col 9)-(line 594,col 19)",
        "(line 595,col 9)-(line 595,col 64)",
        "(line 596,col 9)-(line 596,col 65)",
        "(line 597,col 9)-(line 597,col 65)",
        "(line 598,col 9)-(line 598,col 65)",
        "(line 599,col 9)-(line 599,col 19)",
        "(line 600,col 9)-(line 600,col 19)",
        "(line 601,col 9)-(line 601,col 19)",
        "(line 602,col 9)-(line 602,col 65)",
        "(line 603,col 9)-(line 603,col 65)",
        "(line 604,col 9)-(line 604,col 19)",
        "(line 605,col 9)-(line 605,col 64)",
        "(line 606,col 9)-(line 606,col 127)",
        "(line 607,col 9)-(line 607,col 93)",
        "(line 608,col 9)-(line 608,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.find()",
      "begin_line": 611,
      "end_line": 622,
      "comment": "",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 69)",
        "(line 615,col 9)-(line 615,col 72)",
        "(line 616,col 9)-(line 616,col 35)",
        "(line 617,col 9)-(line 617,col 52)",
        "(line 618,col 9)-(line 618,col 64)",
        "(line 619,col 9)-(line 619,col 33)",
        "(line 620,col 9)-(line 620,col 61)",
        "(line 621,col 9)-(line 621,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.forAllDoCollection()",
      "begin_line": 624,
      "end_line": 643,
      "comment": "",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 97)",
        "(line 629,col 9)-(line 629,col 95)",
        "(line 630,col 9)-(line 630,col 29)",
        "(line 631,col 9)-(line 631,col 29)",
        "(line 632,col 9)-(line 632,col 99)",
        "(line 633,col 9)-(line 633,col 47)",
        "(line 634,col 9)-(line 634,col 67)",
        "(line 636,col 9)-(line 636,col 94)",
        "(line 637,col 9)-(line 637,col 34)",
        "(line 638,col 9)-(line 638,col 67)",
        "(line 639,col 9)-(line 639,col 81)",
        "(line 640,col 9)-(line 640,col 22)",
        "(line 642,col 9)-(line 642,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.forAllDoIterator()",
      "begin_line": 645,
      "end_line": 664,
      "comment": "",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 97)",
        "(line 650,col 9)-(line 650,col 95)",
        "(line 651,col 9)-(line 651,col 29)",
        "(line 652,col 9)-(line 652,col 29)",
        "(line 653,col 9)-(line 653,col 110)",
        "(line 654,col 9)-(line 654,col 47)",
        "(line 655,col 9)-(line 655,col 67)",
        "(line 657,col 9)-(line 657,col 105)",
        "(line 658,col 9)-(line 658,col 34)",
        "(line 659,col 9)-(line 659,col 67)",
        "(line 660,col 9)-(line 660,col 79)",
        "(line 661,col 9)-(line 661,col 22)",
        "(line 663,col 9)-(line 663,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.forAllDoFailure()",
      "begin_line": 666,
      "end_line": 673,
      "comment": "",
      "child_ranges": [
        "(line 669,col 9)-(line 669,col 81)",
        "(line 670,col 9)-(line 670,col 63)",
        "(line 671,col 9)-(line 671,col 21)",
        "(line 672,col 9)-(line 672,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.forAllButLastDoCollection()",
      "begin_line": 675,
      "end_line": 715,
      "comment": "",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 97)",
        "(line 679,col 9)-(line 679,col 95)",
        "(line 680,col 9)-(line 680,col 29)",
        "(line 681,col 9)-(line 681,col 29)",
        "(line 682,col 9)-(line 682,col 95)",
        "(line 683,col 9)-(line 683,col 45)",
        "(line 684,col 9)-(line 684,col 68)",
        "(line 686,col 9)-(line 686,col 20)",
        "(line 687,col 9)-(line 687,col 29)",
        "(line 688,col 9)-(line 688,col 72)",
        "(line 689,col 9)-(line 689,col 45)",
        "(line 690,col 9)-(line 690,col 44)",
        "(line 692,col 9)-(line 692,col 20)",
        "(line 693,col 9)-(line 693,col 72)",
        "(line 694,col 9)-(line 694,col 32)",
        "(line 696,col 9)-(line 696,col 66)",
        "(line 697,col 9)-(line 697,col 55)",
        "(line 698,col 9)-(line 702,col 12)",
        "(line 703,col 9)-(line 703,col 49)",
        "(line 705,col 9)-(line 705,col 58)",
        "(line 706,col 9)-(line 706,col 58)",
        "(line 707,col 9)-(line 711,col 12)",
        "(line 712,col 9)-(line 712,col 48)",
        "(line 713,col 9)-(line 713,col 85)",
        "(line 714,col 9)-(line 714,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-e7cc037a-ab86-4add-b2c6-491be806714a.execute(java.lang.String)",
      "begin_line": 699,
      "end_line": 701,
      "comment": "",
      "child_ranges": [
        "(line 700,col 17)-(line 700,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-dca274fd-01c8-402d-b5da-99bab3f1b5a4.execute(java.lang.String)",
      "begin_line": 708,
      "end_line": 710,
      "comment": "",
      "child_ranges": [
        "(line 709,col 17)-(line 709,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.forAllButLastDoIterator()",
      "begin_line": 717,
      "end_line": 730,
      "comment": "",
      "child_ranges": [
        "(line 720,col 9)-(line 720,col 97)",
        "(line 721,col 9)-(line 721,col 95)",
        "(line 722,col 9)-(line 722,col 29)",
        "(line 723,col 9)-(line 723,col 29)",
        "(line 724,col 9)-(line 724,col 106)",
        "(line 725,col 9)-(line 725,col 45)",
        "(line 726,col 9)-(line 726,col 68)",
        "(line 728,col 9)-(line 728,col 108)",
        "(line 729,col 9)-(line 729,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getFromMap()",
      "begin_line": 732,
      "end_line": 770,
      "comment": "",
      "child_ranges": [
        "(line 735,col 9)-(line 735,col 75)",
        "(line 736,col 9)-(line 736,col 40)",
        "(line 737,col 9)-(line 737,col 38)",
        "(line 739,col 9)-(line 739,col 72)",
        "(line 740,col 9)-(line 740,col 75)",
        "(line 741,col 9)-(line 741,col 52)",
        "(line 742,col 9)-(line 742,col 49)",
        "(line 743,col 9)-(line 743,col 52)",
        "(line 744,col 9)-(line 744,col 38)",
        "(line 747,col 9)-(line 752,col 9)",
        "(line 753,col 9)-(line 758,col 9)",
        "(line 761,col 9)-(line 761,col 76)",
        "(line 762,col 9)-(line 762,col 35)",
        "(line 763,col 9)-(line 763,col 33)",
        "(line 764,col 9)-(line 764,col 69)",
        "(line 765,col 9)-(line 765,col 47)",
        "(line 766,col 9)-(line 766,col 46)",
        "(line 767,col 9)-(line 767,col 43)",
        "(line 768,col 9)-(line 768,col 46)",
        "(line 769,col 9)-(line 769,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getFromList()",
      "begin_line": 776,
      "end_line": 788,
      "comment": "\n     * Tests that {@link List}s are handled correctly - e.g. using\n     * {@link List#get(int)}.\n     ",
      "child_ranges": [
        "(line 779,col 9)-(line 779,col 57)",
        "(line 780,col 9)-(line 780,col 46)",
        "(line 781,col 9)-(line 781,col 45)",
        "(line 782,col 9)-(line 782,col 17)",
        "(line 783,col 9)-(line 783,col 59)",
        "(line 784,col 9)-(line 784,col 37)",
        "(line 785,col 9)-(line 785,col 58)",
        "(line 787,col 9)-(line 787,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getFromIterator()",
      "begin_line": 790,
      "end_line": 807,
      "comment": "",
      "child_ranges": [
        "(line 794,col 9)-(line 794,col 58)",
        "(line 795,col 9)-(line 795,col 64)",
        "(line 796,col 9)-(line 796,col 40)",
        "(line 797,col 9)-(line 797,col 64)",
        "(line 800,col 9)-(line 805,col 9)",
        "(line 806,col 9)-(line 806,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getFromEnumeration()",
      "begin_line": 809,
      "end_line": 829,
      "comment": "",
      "child_ranges": [
        "(line 813,col 9)-(line 813,col 59)",
        "(line 814,col 9)-(line 814,col 34)",
        "(line 815,col 9)-(line 815,col 33)",
        "(line 816,col 9)-(line 816,col 51)",
        "(line 817,col 9)-(line 817,col 57)",
        "(line 818,col 9)-(line 818,col 31)",
        "(line 819,col 9)-(line 819,col 56)",
        "(line 822,col 9)-(line 827,col 9)",
        "(line 828,col 9)-(line 828,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getFromIterable()",
      "begin_line": 831,
      "end_line": 841,
      "comment": "",
      "child_ranges": [
        "(line 835,col 9)-(line 835,col 54)",
        "(line 836,col 9)-(line 836,col 30)",
        "(line 837,col 9)-(line 837,col 61)",
        "(line 840,col 9)-(line 840,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getFromObjectArray()",
      "begin_line": 843,
      "end_line": 855,
      "comment": "",
      "child_ranges": [
        "(line 846,col 9)-(line 846,col 48)",
        "(line 847,col 9)-(line 847,col 29)",
        "(line 848,col 9)-(line 848,col 28)",
        "(line 849,col 9)-(line 849,col 63)",
        "(line 850,col 9)-(line 850,col 62)",
        "(line 854,col 9)-(line 854,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getFromPrimitiveArray()",
      "begin_line": 857,
      "end_line": 869,
      "comment": "",
      "child_ranges": [
        "(line 860,col 9)-(line 860,col 39)",
        "(line 861,col 9)-(line 861,col 22)",
        "(line 862,col 9)-(line 862,col 22)",
        "(line 863,col 9)-(line 863,col 56)",
        "(line 864,col 9)-(line 864,col 56)",
        "(line 868,col 9)-(line 868,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getFromObject()",
      "begin_line": 871,
      "end_line": 876,
      "comment": "",
      "child_ranges": [
        "(line 874,col 9)-(line 874,col 40)",
        "(line 875,col 9)-(line 875,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSize_List()",
      "begin_line": 879,
      "end_line": 889,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 881,col 9)-(line 881,col 33)",
        "(line 882,col 9)-(line 882,col 52)",
        "(line 883,col 9)-(line 883,col 39)",
        "(line 884,col 9)-(line 884,col 52)",
        "(line 885,col 9)-(line 885,col 22)",
        "(line 886,col 9)-(line 886,col 52)",
        "(line 887,col 9)-(line 887,col 22)",
        "(line 888,col 9)-(line 888,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSize_Map()",
      "begin_line": 891,
      "end_line": 899,
      "comment": "",
      "child_ranges": [
        "(line 893,col 9)-(line 893,col 70)",
        "(line 894,col 9)-(line 894,col 51)",
        "(line 895,col 9)-(line 895,col 26)",
        "(line 896,col 9)-(line 896,col 51)",
        "(line 897,col 9)-(line 897,col 26)",
        "(line 898,col 9)-(line 898,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSize_Array()",
      "begin_line": 901,
      "end_line": 912,
      "comment": "",
      "child_ranges": [
        "(line 903,col 9)-(line 903,col 51)",
        "(line 904,col 9)-(line 904,col 59)",
        "(line 906,col 9)-(line 906,col 51)",
        "(line 907,col 9)-(line 907,col 59)",
        "(line 908,col 9)-(line 908,col 29)",
        "(line 909,col 9)-(line 909,col 29)",
        "(line 910,col 9)-(line 910,col 29)",
        "(line 911,col 9)-(line 911,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSize_PrimitiveArray()",
      "begin_line": 914,
      "end_line": 925,
      "comment": "",
      "child_ranges": [
        "(line 916,col 9)-(line 916,col 42)",
        "(line 917,col 9)-(line 917,col 56)",
        "(line 919,col 9)-(line 919,col 51)",
        "(line 920,col 9)-(line 920,col 59)",
        "(line 921,col 9)-(line 921,col 30)",
        "(line 922,col 9)-(line 922,col 30)",
        "(line 923,col 9)-(line 923,col 30)",
        "(line 924,col 9)-(line 924,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSize_Enumeration()",
      "begin_line": 927,
      "end_line": 935,
      "comment": "",
      "child_ranges": [
        "(line 929,col 9)-(line 929,col 57)",
        "(line 930,col 9)-(line 930,col 63)",
        "(line 931,col 9)-(line 931,col 22)",
        "(line 932,col 9)-(line 932,col 63)",
        "(line 933,col 9)-(line 933,col 22)",
        "(line 934,col 9)-(line 934,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSize_Iterator()",
      "begin_line": 937,
      "end_line": 945,
      "comment": "",
      "child_ranges": [
        "(line 939,col 9)-(line 939,col 58)",
        "(line 940,col 9)-(line 940,col 63)",
        "(line 941,col 9)-(line 941,col 22)",
        "(line 942,col 9)-(line 942,col 63)",
        "(line 943,col 9)-(line 943,col 22)",
        "(line 944,col 9)-(line 944,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSize_Other()",
      "begin_line": 947,
      "end_line": 950,
      "comment": "",
      "child_ranges": [
        "(line 949,col 9)-(line 949,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSizeIsEmpty_Null()",
      "begin_line": 953,
      "end_line": 956,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 955,col 9)-(line 955,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSizeIsEmpty_List()",
      "begin_line": 958,
      "end_line": 964,
      "comment": "",
      "child_ranges": [
        "(line 960,col 9)-(line 960,col 58)",
        "(line 961,col 9)-(line 961,col 62)",
        "(line 962,col 9)-(line 962,col 22)",
        "(line 963,col 9)-(line 963,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSizeIsEmpty_Map()",
      "begin_line": 966,
      "end_line": 972,
      "comment": "",
      "child_ranges": [
        "(line 968,col 9)-(line 968,col 70)",
        "(line 969,col 9)-(line 969,col 61)",
        "(line 970,col 9)-(line 970,col 26)",
        "(line 971,col 9)-(line 971,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSizeIsEmpty_Array()",
      "begin_line": 974,
      "end_line": 985,
      "comment": "",
      "child_ranges": [
        "(line 976,col 9)-(line 976,col 51)",
        "(line 977,col 9)-(line 977,col 69)",
        "(line 979,col 9)-(line 979,col 51)",
        "(line 980,col 9)-(line 980,col 70)",
        "(line 981,col 9)-(line 981,col 29)",
        "(line 982,col 9)-(line 982,col 29)",
        "(line 983,col 9)-(line 983,col 29)",
        "(line 984,col 9)-(line 984,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSizeIsEmpty_PrimitiveArray()",
      "begin_line": 987,
      "end_line": 998,
      "comment": "",
      "child_ranges": [
        "(line 989,col 9)-(line 989,col 42)",
        "(line 990,col 9)-(line 990,col 66)",
        "(line 992,col 9)-(line 992,col 51)",
        "(line 993,col 9)-(line 993,col 70)",
        "(line 994,col 9)-(line 994,col 30)",
        "(line 995,col 9)-(line 995,col 30)",
        "(line 996,col 9)-(line 996,col 30)",
        "(line 997,col 9)-(line 997,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSizeIsEmpty_Enumeration()",
      "begin_line": 1000,
      "end_line": 1009,
      "comment": "",
      "child_ranges": [
        "(line 1002,col 9)-(line 1002,col 57)",
        "(line 1003,col 9)-(line 1003,col 73)",
        "(line 1004,col 9)-(line 1004,col 22)",
        "(line 1005,col 9)-(line 1005,col 74)",
        "(line 1006,col 9)-(line 1006,col 55)",
        "(line 1007,col 9)-(line 1007,col 25)",
        "(line 1008,col 9)-(line 1008,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSizeIsEmpty_Iterator()",
      "begin_line": 1011,
      "end_line": 1020,
      "comment": "",
      "child_ranges": [
        "(line 1013,col 9)-(line 1013,col 58)",
        "(line 1014,col 9)-(line 1014,col 73)",
        "(line 1015,col 9)-(line 1015,col 22)",
        "(line 1016,col 9)-(line 1016,col 74)",
        "(line 1017,col 9)-(line 1017,col 52)",
        "(line 1018,col 9)-(line 1018,col 18)",
        "(line 1019,col 9)-(line 1019,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSizeIsEmpty_Other()",
      "begin_line": 1022,
      "end_line": 1029,
      "comment": "",
      "child_ranges": [
        "(line 1024,col 9)-(line 1028,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsEmptyWithEmptyCollection()",
      "begin_line": 1032,
      "end_line": 1036,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 1034,col 9)-(line 1034,col 64)",
        "(line 1035,col 9)-(line 1035,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsEmptyWithNonEmptyCollection()",
      "begin_line": 1038,
      "end_line": 1043,
      "comment": "",
      "child_ranges": [
        "(line 1040,col 9)-(line 1040,col 64)",
        "(line 1041,col 9)-(line 1041,col 25)",
        "(line 1042,col 9)-(line 1042,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsEmptyWithNull()",
      "begin_line": 1045,
      "end_line": 1049,
      "comment": "",
      "child_ranges": [
        "(line 1047,col 9)-(line 1047,col 40)",
        "(line 1048,col 9)-(line 1048,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsNotEmptyWithEmptyCollection()",
      "begin_line": 1051,
      "end_line": 1055,
      "comment": "",
      "child_ranges": [
        "(line 1053,col 9)-(line 1053,col 64)",
        "(line 1054,col 9)-(line 1054,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsNotEmptyWithNonEmptyCollection()",
      "begin_line": 1057,
      "end_line": 1062,
      "comment": "",
      "child_ranges": [
        "(line 1059,col 9)-(line 1059,col 64)",
        "(line 1060,col 9)-(line 1060,col 25)",
        "(line 1061,col 9)-(line 1061,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testIsNotEmptyWithNull()",
      "begin_line": 1064,
      "end_line": 1068,
      "comment": "",
      "child_ranges": [
        "(line 1066,col 9)-(line 1066,col 40)",
        "(line 1067,col 9)-(line 1067,col 62)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "EQUALS_TWO"
      ],
      "begin_line": 1071,
      "end_line": 1075,
      "comment": " -----------------------------------------------------------------------"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-e4bdc5ae-3369-4faa-a409-988b3d0eab00.evaluate(java.lang.Number)",
      "begin_line": 1072,
      "end_line": 1074,
      "comment": "",
      "child_ranges": [
        "(line 1073,col 13)-(line 1073,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.filter()",
      "begin_line": 1078,
      "end_line": 1089,
      "comment": "Up to here",
      "child_ranges": [
        "(line 1080,col 9)-(line 1080,col 60)",
        "(line 1081,col 9)-(line 1081,col 20)",
        "(line 1082,col 9)-(line 1082,col 20)",
        "(line 1083,col 9)-(line 1083,col 20)",
        "(line 1084,col 9)-(line 1084,col 20)",
        "(line 1085,col 9)-(line 1085,col 48)",
        "(line 1086,col 9)-(line 1086,col 65)",
        "(line 1087,col 9)-(line 1087,col 37)",
        "(line 1088,col 9)-(line 1088,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.filterNullParameters()",
      "begin_line": 1091,
      "end_line": 1100,
      "comment": "",
      "child_ranges": [
        "(line 1093,col 9)-(line 1093,col 61)",
        "(line 1094,col 9)-(line 1094,col 57)",
        "(line 1095,col 9)-(line 1095,col 38)",
        "(line 1096,col 9)-(line 1096,col 62)",
        "(line 1097,col 9)-(line 1097,col 38)",
        "(line 1098,col 9)-(line 1098,col 56)",
        "(line 1099,col 9)-(line 1099,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.filterInverse()",
      "begin_line": 1102,
      "end_line": 1115,
      "comment": "",
      "child_ranges": [
        "(line 1104,col 9)-(line 1104,col 60)",
        "(line 1105,col 9)-(line 1105,col 20)",
        "(line 1106,col 9)-(line 1106,col 20)",
        "(line 1107,col 9)-(line 1107,col 20)",
        "(line 1108,col 9)-(line 1108,col 20)",
        "(line 1109,col 9)-(line 1109,col 48)",
        "(line 1110,col 9)-(line 1110,col 72)",
        "(line 1111,col 9)-(line 1111,col 37)",
        "(line 1112,col 9)-(line 1112,col 43)",
        "(line 1113,col 9)-(line 1113,col 43)",
        "(line 1114,col 9)-(line 1114,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.filterInverseNullParameters()",
      "begin_line": 1117,
      "end_line": 1126,
      "comment": "",
      "child_ranges": [
        "(line 1119,col 9)-(line 1119,col 61)",
        "(line 1120,col 9)-(line 1120,col 64)",
        "(line 1121,col 9)-(line 1121,col 38)",
        "(line 1122,col 9)-(line 1122,col 69)",
        "(line 1123,col 9)-(line 1123,col 38)",
        "(line 1124,col 9)-(line 1124,col 63)",
        "(line 1125,col 9)-(line 1125,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.countMatches()",
      "begin_line": 1128,
      "end_line": 1135,
      "comment": "",
      "child_ranges": [
        "(line 1131,col 9)-(line 1131,col 77)",
        "(line 1132,col 9)-(line 1132,col 71)",
        "(line 1133,col 9)-(line 1133,col 72)",
        "(line 1134,col 9)-(line 1134,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.exists()",
      "begin_line": 1137,
      "end_line": 1152,
      "comment": "",
      "child_ranges": [
        "(line 1140,col 9)-(line 1140,col 60)",
        "(line 1141,col 9)-(line 1141,col 56)",
        "(line 1142,col 9)-(line 1142,col 56)",
        "(line 1143,col 9)-(line 1143,col 62)",
        "(line 1144,col 9)-(line 1144,col 62)",
        "(line 1145,col 9)-(line 1145,col 20)",
        "(line 1146,col 9)-(line 1146,col 20)",
        "(line 1147,col 9)-(line 1147,col 20)",
        "(line 1148,col 9)-(line 1148,col 62)",
        "(line 1150,col 9)-(line 1150,col 20)",
        "(line 1151,col 9)-(line 1151,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.select()",
      "begin_line": 1154,
      "end_line": 1169,
      "comment": "",
      "child_ranges": [
        "(line 1156,col 9)-(line 1156,col 60)",
        "(line 1157,col 9)-(line 1157,col 20)",
        "(line 1158,col 9)-(line 1158,col 20)",
        "(line 1159,col 9)-(line 1159,col 20)",
        "(line 1160,col 9)-(line 1160,col 20)",
        "(line 1162,col 9)-(line 1162,col 85)",
        "(line 1163,col 9)-(line 1163,col 92)",
        "(line 1164,col 9)-(line 1164,col 104)",
        "(line 1165,col 9)-(line 1165,col 72)",
        "(line 1166,col 9)-(line 1166,col 37)",
        "(line 1167,col 9)-(line 1167,col 40)",
        "(line 1168,col 9)-(line 1168,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.selectWithOutputCollections()",
      "begin_line": 1171,
      "end_line": 1197,
      "comment": "",
      "child_ranges": [
        "(line 1173,col 9)-(line 1173,col 55)",
        "(line 1174,col 9)-(line 1174,col 21)",
        "(line 1175,col 9)-(line 1175,col 21)",
        "(line 1176,col 9)-(line 1176,col 21)",
        "(line 1177,col 9)-(line 1177,col 21)",
        "(line 1179,col 9)-(line 1179,col 56)",
        "(line 1180,col 9)-(line 1180,col 58)",
        "(line 1182,col 9)-(line 1182,col 68)",
        "(line 1185,col 9)-(line 1185,col 39)",
        "(line 1186,col 9)-(line 1186,col 77)",
        "(line 1189,col 9)-(line 1189,col 39)",
        "(line 1190,col 9)-(line 1190,col 63)",
        "(line 1192,col 9)-(line 1192,col 23)",
        "(line 1193,col 9)-(line 1193,col 25)",
        "(line 1194,col 9)-(line 1194,col 83)",
        "(line 1195,col 9)-(line 1195,col 37)",
        "(line 1196,col 9)-(line 1196,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.selectRejected()",
      "begin_line": 1199,
      "end_line": 1216,
      "comment": "",
      "child_ranges": [
        "(line 1201,col 9)-(line 1201,col 54)",
        "(line 1202,col 9)-(line 1202,col 21)",
        "(line 1203,col 9)-(line 1203,col 21)",
        "(line 1204,col 9)-(line 1204,col 21)",
        "(line 1205,col 9)-(line 1205,col 21)",
        "(line 1206,col 9)-(line 1206,col 90)",
        "(line 1207,col 9)-(line 1207,col 102)",
        "(line 1208,col 9)-(line 1208,col 112)",
        "(line 1209,col 9)-(line 1209,col 72)",
        "(line 1210,col 9)-(line 1210,col 72)",
        "(line 1211,col 9)-(line 1211,col 37)",
        "(line 1212,col 9)-(line 1212,col 40)",
        "(line 1213,col 9)-(line 1213,col 41)",
        "(line 1214,col 9)-(line 1214,col 41)",
        "(line 1215,col 9)-(line 1215,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.collect()",
      "begin_line": 1218,
      "end_line": 1251,
      "comment": "",
      "child_ranges": [
        "(line 1220,col 9)-(line 1220,col 95)",
        "(line 1221,col 9)-(line 1221,col 105)",
        "(line 1222,col 9)-(line 1222,col 60)",
        "(line 1223,col 9)-(line 1223,col 40)",
        "(line 1225,col 9)-(line 1225,col 31)",
        "(line 1226,col 9)-(line 1226,col 90)",
        "(line 1227,col 9)-(line 1227,col 54)",
        "(line 1228,col 9)-(line 1228,col 34)",
        "(line 1230,col 9)-(line 1230,col 42)",
        "(line 1231,col 9)-(line 1231,col 87)",
        "(line 1233,col 9)-(line 1233,col 40)",
        "(line 1234,col 9)-(line 1234,col 68)",
        "(line 1235,col 9)-(line 1235,col 60)",
        "(line 1236,col 9)-(line 1236,col 40)",
        "(line 1238,col 9)-(line 1238,col 42)",
        "(line 1239,col 9)-(line 1239,col 85)",
        "(line 1240,col 9)-(line 1240,col 60)",
        "(line 1241,col 9)-(line 1241,col 71)",
        "(line 1242,col 9)-(line 1242,col 108)",
        "(line 1243,col 9)-(line 1243,col 43)",
        "(line 1245,col 9)-(line 1245,col 44)",
        "(line 1246,col 9)-(line 1246,col 100)",
        "(line 1247,col 9)-(line 1247,col 74)",
        "(line 1248,col 9)-(line 1248,col 64)",
        "(line 1249,col 9)-(line 1249,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.assertCollectResult(java.util.Collection\u003cjava.lang.Number\u003e)",
      "begin_line": 1253,
      "end_line": 1256,
      "comment": "",
      "child_ranges": [
        "(line 1254,col 9)-(line 1254,col 73)",
        "(line 1255,col 9)-(line 1255,col 71)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "TRANSFORM_TO_INTEGER"
      ],
      "begin_line": 1258,
      "end_line": 1262,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-a508965c-6009-44a4-9801-fa71d17b0c5a.transform(java.lang.Object)",
      "begin_line": 1259,
      "end_line": 1261,
      "comment": "",
      "child_ranges": [
        "(line 1260,col 13)-(line 1260,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.transform1()",
      "begin_line": 1264,
      "end_line": 1286,
      "comment": "",
      "child_ranges": [
        "(line 1266,col 9)-(line 1266,col 52)",
        "(line 1267,col 9)-(line 1267,col 21)",
        "(line 1268,col 9)-(line 1268,col 21)",
        "(line 1269,col 9)-(line 1269,col 21)",
        "(line 1270,col 9)-(line 1270,col 62)",
        "(line 1271,col 9)-(line 1271,col 37)",
        "(line 1272,col 9)-(line 1272,col 37)",
        "(line 1273,col 9)-(line 1273,col 37)",
        "(line 1274,col 9)-(line 1274,col 37)",
        "(line 1276,col 9)-(line 1276,col 39)",
        "(line 1277,col 9)-(line 1277,col 21)",
        "(line 1278,col 9)-(line 1278,col 21)",
        "(line 1279,col 9)-(line 1279,col 21)",
        "(line 1280,col 9)-(line 1280,col 62)",
        "(line 1281,col 9)-(line 1281,col 37)",
        "(line 1282,col 9)-(line 1282,col 46)",
        "(line 1283,col 9)-(line 1283,col 37)",
        "(line 1284,col 9)-(line 1284,col 46)",
        "(line 1285,col 9)-(line 1285,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.transform2()",
      "begin_line": 1288,
      "end_line": 1301,
      "comment": "",
      "child_ranges": [
        "(line 1290,col 9)-(line 1290,col 54)",
        "(line 1291,col 9)-(line 1291,col 20)",
        "(line 1292,col 9)-(line 1292,col 20)",
        "(line 1293,col 9)-(line 1293,col 20)",
        "(line 1294,col 9)-(line 1298,col 11)",
        "(line 1299,col 9)-(line 1299,col 36)",
        "(line 1300,col 9)-(line 1300,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-0dbf563d-9934-49f9-8e03-ab920ab3dcd0.transform(java.lang.Object)",
      "begin_line": 1295,
      "end_line": 1297,
      "comment": "",
      "child_ranges": [
        "(line 1296,col 17)-(line 1296,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.addIgnoreNull()",
      "begin_line": 1304,
      "end_line": 1317,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 1306,col 9)-(line 1306,col 54)",
        "(line 1307,col 9)-(line 1307,col 21)",
        "(line 1308,col 9)-(line 1308,col 21)",
        "(line 1309,col 9)-(line 1309,col 21)",
        "(line 1310,col 9)-(line 1310,col 62)",
        "(line 1311,col 9)-(line 1311,col 36)",
        "(line 1312,col 9)-(line 1312,col 61)",
        "(line 1313,col 9)-(line 1313,col 36)",
        "(line 1314,col 9)-(line 1314,col 68)",
        "(line 1315,col 9)-(line 1315,col 36)",
        "(line 1316,col 9)-(line 1316,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.predicatedCollection()",
      "begin_line": 1320,
      "end_line": 1337,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 1322,col 9)-(line 1322,col 94)",
        "(line 1323,col 9)-(line 1323,col 113)",
        "(line 1324,col 9)-(line 1324,col 115)",
        "(line 1325,col 9)-(line 1330,col 9)",
        "(line 1331,col 9)-(line 1336,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.isFull()",
      "begin_line": 1339,
      "end_line": 1358,
      "comment": "",
      "child_ranges": [
        "(line 1341,col 9)-(line 1341,col 54)",
        "(line 1342,col 9)-(line 1342,col 21)",
        "(line 1343,col 9)-(line 1343,col 21)",
        "(line 1344,col 9)-(line 1344,col 21)",
        "(line 1345,col 9)-(line 1349,col 9)",
        "(line 1350,col 9)-(line 1350,col 49)",
        "(line 1352,col 9)-(line 1352,col 81)",
        "(line 1353,col 9)-(line 1353,col 57)",
        "(line 1354,col 9)-(line 1354,col 24)",
        "(line 1355,col 9)-(line 1355,col 49)",
        "(line 1356,col 9)-(line 1356,col 21)",
        "(line 1357,col 9)-(line 1357,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.isEmpty()",
      "begin_line": 1360,
      "end_line": 1364,
      "comment": "",
      "child_ranges": [
        "(line 1362,col 9)-(line 1362,col 54)",
        "(line 1363,col 9)-(line 1363,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.maxSize()",
      "begin_line": 1366,
      "end_line": 1385,
      "comment": "",
      "child_ranges": [
        "(line 1368,col 9)-(line 1368,col 54)",
        "(line 1369,col 9)-(line 1369,col 21)",
        "(line 1370,col 9)-(line 1370,col 21)",
        "(line 1371,col 9)-(line 1371,col 21)",
        "(line 1372,col 9)-(line 1376,col 9)",
        "(line 1377,col 9)-(line 1377,col 55)",
        "(line 1379,col 9)-(line 1379,col 69)",
        "(line 1380,col 9)-(line 1380,col 54)",
        "(line 1381,col 9)-(line 1381,col 24)",
        "(line 1382,col 9)-(line 1382,col 54)",
        "(line 1383,col 9)-(line 1383,col 21)",
        "(line 1384,col 9)-(line 1384,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.intersectionUsesMethodEquals()",
      "begin_line": 1387,
      "end_line": 1426,
      "comment": "",
      "child_ranges": [
        "(line 1390,col 9)-(line 1390,col 45)",
        "(line 1391,col 9)-(line 1391,col 45)",
        "(line 1394,col 9)-(line 1394,col 33)",
        "(line 1395,col 9)-(line 1395,col 33)",
        "(line 1398,col 9)-(line 1398,col 33)",
        "(line 1401,col 9)-(line 1401,col 64)",
        "(line 1402,col 9)-(line 1402,col 66)",
        "(line 1406,col 9)-(line 1406,col 23)",
        "(line 1407,col 9)-(line 1407,col 23)",
        "(line 1411,col 9)-(line 1411,col 89)",
        "(line 1412,col 9)-(line 1412,col 45)",
        "(line 1417,col 9)-(line 1417,col 59)",
        "(line 1418,col 9)-(line 1418,col 81)",
        "(line 1422,col 9)-(line 1422,col 33)",
        "(line 1423,col 9)-(line 1423,col 33)",
        "(line 1424,col 9)-(line 1424,col 33)",
        "(line 1425,col 9)-(line 1425,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testRetainAll()",
      "begin_line": 1430,
      "end_line": 1460,
      "comment": "Up to here",
      "child_ranges": [
        "(line 1432,col 9)-(line 1432,col 58)",
        "(line 1433,col 9)-(line 1433,col 22)",
        "(line 1434,col 9)-(line 1434,col 22)",
        "(line 1435,col 9)-(line 1435,col 22)",
        "(line 1436,col 9)-(line 1436,col 57)",
        "(line 1437,col 9)-(line 1437,col 21)",
        "(line 1438,col 9)-(line 1438,col 21)",
        "(line 1439,col 9)-(line 1439,col 21)",
        "(line 1441,col 9)-(line 1441,col 79)",
        "(line 1442,col 9)-(line 1442,col 39)",
        "(line 1443,col 9)-(line 1443,col 49)",
        "(line 1444,col 9)-(line 1444,col 42)",
        "(line 1445,col 9)-(line 1445,col 49)",
        "(line 1446,col 9)-(line 1446,col 37)",
        "(line 1447,col 9)-(line 1447,col 47)",
        "(line 1448,col 9)-(line 1448,col 47)",
        "(line 1449,col 9)-(line 1449,col 47)",
        "(line 1450,col 9)-(line 1450,col 36)",
        "(line 1451,col 9)-(line 1451,col 46)",
        "(line 1452,col 9)-(line 1452,col 46)",
        "(line 1453,col 9)-(line 1453,col 46)",
        "(line 1455,col 9)-(line 1459,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testRemoveAll()",
      "begin_line": 1462,
      "end_line": 1492,
      "comment": "",
      "child_ranges": [
        "(line 1464,col 9)-(line 1464,col 58)",
        "(line 1465,col 9)-(line 1465,col 22)",
        "(line 1466,col 9)-(line 1466,col 22)",
        "(line 1467,col 9)-(line 1467,col 22)",
        "(line 1468,col 9)-(line 1468,col 57)",
        "(line 1469,col 9)-(line 1469,col 21)",
        "(line 1470,col 9)-(line 1470,col 21)",
        "(line 1471,col 9)-(line 1471,col 21)",
        "(line 1473,col 9)-(line 1473,col 79)",
        "(line 1474,col 9)-(line 1474,col 39)",
        "(line 1475,col 9)-(line 1475,col 42)",
        "(line 1476,col 9)-(line 1476,col 49)",
        "(line 1477,col 9)-(line 1477,col 42)",
        "(line 1478,col 9)-(line 1478,col 37)",
        "(line 1479,col 9)-(line 1479,col 47)",
        "(line 1480,col 9)-(line 1480,col 47)",
        "(line 1481,col 9)-(line 1481,col 47)",
        "(line 1482,col 9)-(line 1482,col 36)",
        "(line 1483,col 9)-(line 1483,col 46)",
        "(line 1484,col 9)-(line 1484,col 46)",
        "(line 1485,col 9)-(line 1485,col 46)",
        "(line 1487,col 9)-(line 1491,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testTransformedCollection()",
      "begin_line": 1495,
      "end_line": 1512,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 1497,col 9)-(line 1497,col 90)",
        "(line 1498,col 9)-(line 1498,col 117)",
        "(line 1499,col 9)-(line 1499,col 117)",
        "(line 1500,col 9)-(line 1505,col 9)",
        "(line 1506,col 9)-(line 1511,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testTransformedCollection_2()",
      "begin_line": 1514,
      "end_line": 1524,
      "comment": "",
      "child_ranges": [
        "(line 1516,col 9)-(line 1516,col 58)",
        "(line 1517,col 9)-(line 1517,col 22)",
        "(line 1518,col 9)-(line 1518,col 22)",
        "(line 1519,col 9)-(line 1519,col 22)",
        "(line 1520,col 9)-(line 1520,col 109)",
        "(line 1521,col 9)-(line 1521,col 49)",
        "(line 1522,col 9)-(line 1522,col 49)",
        "(line 1523,col 9)-(line 1523,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testSynchronizedCollection()",
      "begin_line": 1526,
      "end_line": 1537,
      "comment": "",
      "child_ranges": [
        "(line 1529,col 9)-(line 1529,col 97)",
        "(line 1530,col 9)-(line 1530,col 113)",
        "(line 1531,col 9)-(line 1536,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testUnmodifiableCollection()",
      "begin_line": 1539,
      "end_line": 1550,
      "comment": "",
      "child_ranges": [
        "(line 1542,col 9)-(line 1542,col 97)",
        "(line 1543,col 9)-(line 1543,col 113)",
        "(line 1544,col 9)-(line 1549,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.emptyCollection()",
      "begin_line": 1552,
      "end_line": 1556,
      "comment": "",
      "child_ranges": [
        "(line 1554,col 9)-(line 1554,col 74)",
        "(line 1555,col 9)-(line 1555,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.emptyIfNull()",
      "begin_line": 1558,
      "end_line": 1563,
      "comment": "",
      "child_ranges": [
        "(line 1560,col 9)-(line 1560,col 64)",
        "(line 1561,col 9)-(line 1561,col 70)",
        "(line 1562,col 9)-(line 1562,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.addAllForIterable()",
      "begin_line": 1571,
      "end_line": 1605,
      "comment": "\n     * This test ensures that {@link Iterable}s are supported by {@link CollectionUtils}.\n     * Specifically, it uses mocks to ensure that if the passed in\n     * {@link Iterable} is a {@link Collection} then\n     * {@link Collection#addAll(Collection)} is called instead of iterating.\n     ",
      "child_ranges": [
        "(line 1573,col 9)-(line 1573,col 81)",
        "(line 1574,col 9)-(line 1574,col 64)",
        "(line 1575,col 9)-(line 1575,col 67)",
        "(line 1576,col 9)-(line 1576,col 67)",
        "(line 1577,col 9)-(line 1577,col 66)",
        "(line 1579,col 9)-(line 1579,col 56)",
        "(line 1580,col 9)-(line 1580,col 27)",
        "(line 1581,col 9)-(line 1581,col 27)",
        "(line 1582,col 9)-(line 1582,col 27)",
        "(line 1583,col 9)-(line 1583,col 52)",
        "(line 1584,col 9)-(line 1584,col 42)",
        "(line 1585,col 9)-(line 1585,col 42)",
        "(line 1586,col 9)-(line 1586,col 42)",
        "(line 1589,col 9)-(line 1589,col 58)",
        "(line 1592,col 9)-(line 1592,col 56)",
        "(line 1593,col 9)-(line 1593,col 27)",
        "(line 1594,col 9)-(line 1594,col 52)",
        "(line 1595,col 9)-(line 1595,col 43)",
        "(line 1596,col 9)-(line 1596,col 59)",
        "(line 1598,col 9)-(line 1598,col 17)",
        "(line 1599,col 9)-(line 1599,col 56)",
        "(line 1600,col 9)-(line 1600,col 61)",
        "(line 1602,col 9)-(line 1602,col 57)",
        "(line 1603,col 9)-(line 1603,col 62)",
        "(line 1604,col 9)-(line 1604,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.addAllForEnumeration()",
      "begin_line": 1607,
      "end_line": 1614,
      "comment": "",
      "child_ranges": [
        "(line 1609,col 9)-(line 1609,col 80)",
        "(line 1610,col 9)-(line 1610,col 20)",
        "(line 1611,col 9)-(line 1611,col 68)",
        "(line 1612,col 9)-(line 1612,col 57)",
        "(line 1613,col 9)-(line 1613,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.addAllForElements()",
      "begin_line": 1616,
      "end_line": 1620,
      "comment": "",
      "child_ranges": [
        "(line 1618,col 9)-(line 1618,col 62)",
        "(line 1619,col 9)-(line 1619,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getNegative()",
      "begin_line": 1622,
      "end_line": 1625,
      "comment": "",
      "child_ranges": [
        "(line 1624,col 9)-(line 1624,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getPositiveOutOfBounds()",
      "begin_line": 1627,
      "end_line": 1630,
      "comment": "",
      "child_ranges": [
        "(line 1629,col 9)-(line 1629,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.get1()",
      "begin_line": 1632,
      "end_line": 1635,
      "comment": "",
      "child_ranges": [
        "(line 1634,col 9)-(line 1634,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.get()",
      "begin_line": 1637,
      "end_line": 1643,
      "comment": "",
      "child_ranges": [
        "(line 1639,col 9)-(line 1639,col 69)",
        "(line 1640,col 9)-(line 1640,col 80)",
        "(line 1641,col 9)-(line 1641,col 89)",
        "(line 1642,col 9)-(line 1642,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getIterator()",
      "begin_line": 1645,
      "end_line": 1652,
      "comment": "",
      "child_ranges": [
        "(line 1647,col 9)-(line 1647,col 60)",
        "(line 1648,col 9)-(line 1648,col 78)",
        "(line 1649,col 9)-(line 1649,col 33)",
        "(line 1650,col 9)-(line 1650,col 78)",
        "(line 1651,col 9)-(line 1651,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.getEnumeration()",
      "begin_line": 1654,
      "end_line": 1662,
      "comment": "",
      "child_ranges": [
        "(line 1656,col 9)-(line 1656,col 73)",
        "(line 1657,col 9)-(line 1657,col 58)",
        "(line 1658,col 9)-(line 1658,col 68)",
        "(line 1659,col 9)-(line 1659,col 40)",
        "(line 1660,col 9)-(line 1660,col 68)",
        "(line 1661,col 9)-(line 1661,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.reverse()",
      "begin_line": 1664,
      "end_line": 1672,
      "comment": "",
      "child_ranges": [
        "(line 1666,col 9)-(line 1666,col 54)",
        "(line 1667,col 9)-(line 1667,col 81)",
        "(line 1668,col 9)-(line 1668,col 40)",
        "(line 1670,col 9)-(line 1670,col 41)",
        "(line 1671,col 9)-(line 1671,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.extractSingleton()",
      "begin_line": 1674,
      "end_line": 1696,
      "comment": "",
      "child_ranges": [
        "(line 1676,col 9)-(line 1676,col 38)",
        "(line 1677,col 9)-(line 1681,col 9)",
        "(line 1682,col 9)-(line 1682,col 39)",
        "(line 1683,col 9)-(line 1687,col 9)",
        "(line 1688,col 9)-(line 1688,col 24)",
        "(line 1689,col 9)-(line 1689,col 68)",
        "(line 1690,col 9)-(line 1690,col 24)",
        "(line 1691,col 9)-(line 1695,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.next(java.util.Iterator\u003cT\u003e, T)",
      "begin_line": 1701,
      "end_line": 1704,
      "comment": "\n     * Records the next object returned for a mock iterator\n     ",
      "child_ranges": [
        "(line 1702,col 9)-(line 1702,col 51)",
        "(line 1703,col 9)-(line 1703,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.collateException1()",
      "begin_line": 1706,
      "end_line": 1709,
      "comment": "",
      "child_ranges": [
        "(line 1708,col 9)-(line 1708,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.collateException2()",
      "begin_line": 1711,
      "end_line": 1714,
      "comment": "",
      "child_ranges": [
        "(line 1713,col 9)-(line 1713,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testCollate()",
      "begin_line": 1716,
      "end_line": 1749,
      "comment": "",
      "child_ranges": [
        "(line 1718,col 9)-(line 1718,col 89)",
        "(line 1719,col 9)-(line 1719,col 65)",
        "(line 1721,col 9)-(line 1721,col 71)",
        "(line 1722,col 9)-(line 1722,col 72)",
        "(line 1724,col 9)-(line 1724,col 82)",
        "(line 1725,col 9)-(line 1725,col 82)",
        "(line 1726,col 9)-(line 1726,col 60)",
        "(line 1728,col 9)-(line 1728,col 62)",
        "(line 1729,col 9)-(line 1729,col 41)",
        "(line 1730,col 9)-(line 1730,col 41)",
        "(line 1731,col 9)-(line 1731,col 39)",
        "(line 1733,col 9)-(line 1733,col 65)",
        "(line 1735,col 9)-(line 1736,col 97)",
        "(line 1738,col 9)-(line 1738,col 94)",
        "(line 1739,col 9)-(line 1739,col 76)",
        "(line 1741,col 9)-(line 1741,col 57)",
        "(line 1742,col 9)-(line 1742,col 57)",
        "(line 1743,col 9)-(line 1743,col 42)",
        "(line 1745,col 9)-(line 1745,col 87)",
        "(line 1746,col 9)-(line 1746,col 87)",
        "(line 1747,col 9)-(line 1747,col 71)",
        "(line 1748,col 9)-(line 1748,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testCollateIgnoreDuplicates()",
      "begin_line": 1751,
      "end_line": 1764,
      "comment": "",
      "child_ranges": [
        "(line 1753,col 9)-(line 1753,col 89)",
        "(line 1754,col 9)-(line 1754,col 89)",
        "(line 1755,col 9)-(line 1755,col 80)",
        "(line 1757,col 9)-(line 1757,col 58)",
        "(line 1758,col 9)-(line 1758,col 40)",
        "(line 1759,col 9)-(line 1759,col 40)",
        "(line 1760,col 9)-(line 1760,col 73)",
        "(line 1761,col 9)-(line 1761,col 39)",
        "(line 1763,col 9)-(line 1763,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testPermutationsWithNullCollection()",
      "begin_line": 1766,
      "end_line": 1769,
      "comment": "",
      "child_ranges": [
        "(line 1768,col 9)-(line 1768,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testPermutations()",
      "begin_line": 1771,
      "end_line": 1783,
      "comment": "",
      "child_ranges": [
        "(line 1773,col 9)-(line 1773,col 57)",
        "(line 1774,col 9)-(line 1774,col 86)",
        "(line 1777,col 9)-(line 1777,col 37)",
        "(line 1778,col 9)-(line 1778,col 26)",
        "(line 1779,col 9)-(line 1781,col 9)",
        "(line 1782,col 9)-(line 1782,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testMatchesAll()",
      "begin_line": 1785,
      "end_line": 1807,
      "comment": "",
      "child_ranges": [
        "(line 1788,col 9)-(line 1788,col 60)",
        "(line 1789,col 9)-(line 1789,col 67)",
        "(line 1791,col 9)-(line 1795,col 10)",
        "(line 1796,col 9)-(line 1796,col 74)",
        "(line 1798,col 9)-(line 1802,col 10)",
        "(line 1803,col 9)-(line 1803,col 75)",
        "(line 1805,col 9)-(line 1805,col 67)",
        "(line 1806,col 9)-(line 1806,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-9368b351-aa9f-4790-8bf3-ba712763e11f.evaluate(java.lang.Integer)",
      "begin_line": 1792,
      "end_line": 1794,
      "comment": "",
      "child_ranges": [
        "(line 1793,col 17)-(line 1793,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-67f8bdaa-9932-43d7-b7c6-9174d1748b40.evaluate(java.lang.Integer)",
      "begin_line": 1799,
      "end_line": 1801,
      "comment": "",
      "child_ranges": [
        "(line 1800,col 17)-(line 1800,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testRemoveAllWithEquator()",
      "begin_line": 1809,
      "end_line": 1857,
      "comment": "",
      "child_ranges": [
        "(line 1811,col 9)-(line 1811,col 58)",
        "(line 1812,col 9)-(line 1812,col 23)",
        "(line 1813,col 9)-(line 1813,col 23)",
        "(line 1814,col 9)-(line 1814,col 23)",
        "(line 1816,col 9)-(line 1816,col 60)",
        "(line 1817,col 9)-(line 1817,col 25)",
        "(line 1818,col 9)-(line 1818,col 25)",
        "(line 1819,col 9)-(line 1819,col 25)",
        "(line 1822,col 9)-(line 1831,col 11)",
        "(line 1833,col 9)-(line 1833,col 39)",
        "(line 1834,col 9)-(line 1834,col 42)",
        "(line 1835,col 9)-(line 1835,col 42)",
        "(line 1836,col 9)-(line 1836,col 43)",
        "(line 1837,col 9)-(line 1837,col 37)",
        "(line 1838,col 9)-(line 1838,col 48)",
        "(line 1839,col 9)-(line 1839,col 48)",
        "(line 1840,col 9)-(line 1840,col 48)",
        "(line 1841,col 9)-(line 1841,col 39)",
        "(line 1842,col 9)-(line 1842,col 50)",
        "(line 1843,col 9)-(line 1843,col 50)",
        "(line 1844,col 9)-(line 1844,col 50)",
        "(line 1846,col 9)-(line 1850,col 9)",
        "(line 1852,col 9)-(line 1856,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-14031ca8-d53b-4921-b42c-2271bf18ea58.equate(java.lang.String, java.lang.String)",
      "begin_line": 1824,
      "end_line": 1826,
      "comment": "",
      "child_ranges": [
        "(line 1825,col 17)-(line 1825,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-0a6f034e-d787-4c2b-ba31-9437757e6086.hash(java.lang.String)",
      "begin_line": 1828,
      "end_line": 1830,
      "comment": "",
      "child_ranges": [
        "(line 1829,col 17)-(line 1829,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.testRetainAllWithEquator()",
      "begin_line": 1859,
      "end_line": 1908,
      "comment": "",
      "child_ranges": [
        "(line 1861,col 9)-(line 1861,col 58)",
        "(line 1862,col 9)-(line 1862,col 23)",
        "(line 1863,col 9)-(line 1863,col 23)",
        "(line 1864,col 9)-(line 1864,col 23)",
        "(line 1866,col 9)-(line 1866,col 60)",
        "(line 1867,col 9)-(line 1867,col 25)",
        "(line 1868,col 9)-(line 1868,col 25)",
        "(line 1869,col 9)-(line 1869,col 25)",
        "(line 1872,col 9)-(line 1881,col 11)",
        "(line 1882,col 9)-(line 1882,col 39)",
        "(line 1883,col 9)-(line 1883,col 42)",
        "(line 1884,col 9)-(line 1884,col 43)",
        "(line 1885,col 9)-(line 1885,col 43)",
        "(line 1887,col 9)-(line 1887,col 37)",
        "(line 1888,col 9)-(line 1888,col 40)",
        "(line 1889,col 9)-(line 1889,col 40)",
        "(line 1890,col 9)-(line 1890,col 40)",
        "(line 1892,col 9)-(line 1892,col 39)",
        "(line 1893,col 9)-(line 1893,col 42)",
        "(line 1894,col 9)-(line 1894,col 42)",
        "(line 1895,col 9)-(line 1895,col 42)",
        "(line 1897,col 9)-(line 1901,col 9)",
        "(line 1903,col 9)-(line 1907,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-7c19c0c6-0e0f-49a3-adad-b428d370d402.equate(java.lang.String, java.lang.String)",
      "begin_line": 1874,
      "end_line": 1876,
      "comment": "",
      "child_ranges": [
        "(line 1875,col 17)-(line 1875,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtilsTest.Anonymous-2c261bac-edec-4fba-ba2d-866af3269797.hash(java.lang.String)",
      "begin_line": 1878,
      "end_line": 1880,
      "comment": "",
      "child_ranges": [
        "(line 1879,col 17)-(line 1879,col 35)"
      ]
    }
  ]
}