{
  "filepath": "/tmp/Collections-28b/src/test/java/org/apache/commons/collections4/multiset/AbstractMultiSetTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMultiSetTest",
      "is_interface": false,
      "parent_types": [
        "AbstractCollectionTest\u003cT\u003e"
      ],
      "begin_line": 59,
      "end_line": 702,
      "comment": "\n * Abstract test class for {@link org.apache.commons.collections4.MultiSet MultiSet}\n * methods and contracts.\n * \u003cp\u003e\n * To use, simply extend this class, and implement\n * the {@link #makeObject} method.\n * \u003cp\u003e\n * If your multiset fails one of these tests by design,\n * you may still use this base set of cases.  Simply override the\n * test case (method) your multiset fails.\n * \u003cp\u003e\n * This abstract test class does wrap the concrete multiset implementation\n * with such a decorator, see the overridden {@link #resetEmpty()} and\n * {@link #resetFull()} methods.\n * \u003cp\u003e\n * In addition to the generic collection tests (prefix testCollection) inherited\n * from AbstractCollectionTest, there are test methods that test the \"normal\" MultiSet\n * interface (prefix testMultiSet). For MultiSet specific tests use the {@link #makeObject()} and \n * {@link #makeFullCollection()} methods instead of {@link #resetEmpty()} and resetFull().\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.AbstractMultiSetTest(java.lang.String)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * JUnit constructor.\n     *\n     * @param testName  the test class name\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.makeConfirmedCollection()",
      "begin_line": 74,
      "end_line": 78,
      "comment": "\n     * Returns an empty {@link ArrayList}.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 53)",
        "(line 77,col 9)-(line 77,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.makeConfirmedFullCollection()",
      "begin_line": 83,
      "end_line": 88,
      "comment": "\n     * Returns a full collection.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 61)",
        "(line 86,col 9)-(line 86,col 54)",
        "(line 87,col 9)-(line 87,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.makeObject()",
      "begin_line": 95,
      "end_line": 96,
      "comment": "\n     * Return a new, empty multiset to used for testing.\n     *\n     * @return the multiset to be tested\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.makeFullCollection()",
      "begin_line": 101,
      "end_line": 106,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 50)",
        "(line 104,col 9)-(line 104,col 58)",
        "(line 105,col 9)-(line 105,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.resetEmpty()",
      "begin_line": 110,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 41)",
        "(line 113,col 9)-(line 113,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.resetFull()",
      "begin_line": 116,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 49)",
        "(line 119,col 9)-(line 119,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.getCollection()",
      "begin_line": 128,
      "end_line": 131,
      "comment": "\n     * Returns the {@link #collection} field cast to a {@link MultiSet}.\n     *\n     * @return the collection field as a MultiSet\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.testMultiSetAdd()",
      "begin_line": 134,
      "end_line": 150,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 136,col 9)-(line 138,col 9)",
        "(line 140,col 9)-(line 140,col 50)",
        "(line 141,col 9)-(line 141,col 30)",
        "(line 142,col 9)-(line 142,col 65)",
        "(line 143,col 9)-(line 143,col 74)",
        "(line 144,col 9)-(line 144,col 30)",
        "(line 145,col 9)-(line 145,col 65)",
        "(line 146,col 9)-(line 146,col 74)",
        "(line 147,col 9)-(line 147,col 30)",
        "(line 148,col 9)-(line 148,col 43)",
        "(line 149,col 9)-(line 149,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.testMultiSetEqualsSelf()",
      "begin_line": 152,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 50)",
        "(line 155,col 9)-(line 155,col 46)",
        "(line 157,col 9)-(line 159,col 9)",
        "(line 161,col 9)-(line 161,col 32)",
        "(line 162,col 9)-(line 162,col 46)",
        "(line 163,col 9)-(line 163,col 32)",
        "(line 164,col 9)-(line 164,col 46)",
        "(line 165,col 9)-(line 165,col 33)",
        "(line 166,col 9)-(line 166,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.testMultiSetRemove()",
      "begin_line": 169,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 171,col 9)-(line 173,col 9)",
        "(line 175,col 9)-(line 175,col 50)",
        "(line 176,col 9)-(line 176,col 30)",
        "(line 177,col 9)-(line 177,col 74)",
        "(line 178,col 9)-(line 178,col 29)",
        "(line 179,col 9)-(line 179,col 74)",
        "(line 180,col 9)-(line 180,col 30)",
        "(line 181,col 9)-(line 181,col 30)",
        "(line 182,col 9)-(line 182,col 30)",
        "(line 183,col 9)-(line 183,col 30)",
        "(line 184,col 9)-(line 184,col 74)",
        "(line 185,col 9)-(line 185,col 32)",
        "(line 186,col 9)-(line 186,col 74)",
        "(line 187,col 9)-(line 187,col 32)",
        "(line 188,col 9)-(line 188,col 74)",
        "(line 189,col 9)-(line 189,col 29)",
        "(line 190,col 9)-(line 190,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.testMultiSetRemoveAll()",
      "begin_line": 193,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 195,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 199,col 50)",
        "(line 200,col 9)-(line 200,col 33)",
        "(line 201,col 9)-(line 201,col 74)",
        "(line 202,col 9)-(line 202,col 30)",
        "(line 203,col 9)-(line 203,col 30)",
        "(line 204,col 9)-(line 204,col 67)",
        "(line 205,col 9)-(line 205,col 60)",
        "(line 206,col 9)-(line 206,col 24)",
        "(line 207,col 9)-(line 207,col 24)",
        "(line 208,col 9)-(line 208,col 35)",
        "(line 209,col 9)-(line 209,col 74)",
        "(line 210,col 9)-(line 210,col 74)",
        "(line 211,col 9)-(line 211,col 74)",
        "(line 212,col 9)-(line 212,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.testMultiSetContains()",
      "begin_line": 215,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 217,col 9)-(line 219,col 9)",
        "(line 221,col 9)-(line 221,col 50)",
        "(line 223,col 9)-(line 223,col 93)",
        "(line 224,col 9)-(line 224,col 93)",
        "(line 226,col 9)-(line 226,col 30)",
        "(line 227,col 9)-(line 227,col 82)",
        "(line 228,col 9)-(line 228,col 93)",
        "(line 230,col 9)-(line 230,col 30)",
        "(line 231,col 9)-(line 231,col 82)",
        "(line 232,col 9)-(line 232,col 93)",
        "(line 234,col 9)-(line 234,col 30)",
        "(line 235,col 9)-(line 235,col 82)",
        "(line 236,col 9)-(line 236,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.testMultiSetContainsAll()",
      "begin_line": 239,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 241,col 9)-(line 243,col 9)",
        "(line 245,col 9)-(line 245,col 50)",
        "(line 246,col 9)-(line 246,col 59)",
        "(line 247,col 9)-(line 247,col 61)",
        "(line 248,col 9)-(line 248,col 25)",
        "(line 249,col 9)-(line 249,col 61)",
        "(line 250,col 9)-(line 250,col 25)",
        "(line 251,col 9)-(line 251,col 25)",
        "(line 252,col 9)-(line 252,col 61)",
        "(line 253,col 9)-(line 253,col 25)",
        "(line 254,col 9)-(line 254,col 63)",
        "(line 255,col 9)-(line 255,col 27)",
        "(line 256,col 9)-(line 256,col 27)",
        "(line 258,col 9)-(line 258,col 89)",
        "(line 259,col 9)-(line 259,col 101)",
        "(line 260,col 9)-(line 260,col 101)",
        "(line 261,col 9)-(line 261,col 101)",
        "(line 262,col 9)-(line 262,col 109)",
        "(line 264,col 9)-(line 264,col 30)",
        "(line 265,col 9)-(line 265,col 89)",
        "(line 266,col 9)-(line 266,col 91)",
        "(line 267,col 9)-(line 267,col 95)",
        "(line 268,col 9)-(line 268,col 101)",
        "(line 269,col 9)-(line 269,col 109)",
        "(line 271,col 9)-(line 271,col 30)",
        "(line 272,col 9)-(line 272,col 89)",
        "(line 273,col 9)-(line 273,col 91)",
        "(line 274,col 9)-(line 274,col 91)",
        "(line 275,col 9)-(line 275,col 101)",
        "(line 276,col 9)-(line 276,col 109)",
        "(line 278,col 9)-(line 278,col 30)",
        "(line 279,col 9)-(line 279,col 89)",
        "(line 280,col 9)-(line 280,col 91)",
        "(line 281,col 9)-(line 281,col 91)",
        "(line 282,col 9)-(line 282,col 101)",
        "(line 283,col 9)-(line 283,col 109)",
        "(line 285,col 9)-(line 285,col 30)",
        "(line 286,col 9)-(line 286,col 89)",
        "(line 287,col 9)-(line 287,col 91)",
        "(line 288,col 9)-(line 288,col 91)",
        "(line 289,col 9)-(line 289,col 91)",
        "(line 290,col 9)-(line 290,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.testMultiSetSize()",
      "begin_line": 293,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 295,col 9)-(line 297,col 9)",
        "(line 299,col 9)-(line 299,col 50)",
        "(line 300,col 9)-(line 300,col 70)",
        "(line 301,col 9)-(line 301,col 30)",
        "(line 302,col 9)-(line 302,col 70)",
        "(line 303,col 9)-(line 303,col 30)",
        "(line 304,col 9)-(line 304,col 70)",
        "(line 305,col 9)-(line 305,col 30)",
        "(line 306,col 9)-(line 306,col 70)",
        "(line 307,col 9)-(line 307,col 30)",
        "(line 308,col 9)-(line 308,col 70)",
        "(line 309,col 9)-(line 309,col 30)",
        "(line 310,col 9)-(line 310,col 70)",
        "(line 311,col 9)-(line 311,col 32)",
        "(line 312,col 9)-(line 312,col 69)",
        "(line 313,col 9)-(line 313,col 70)",
        "(line 314,col 9)-(line 314,col 29)",
        "(line 315,col 9)-(line 315,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.testMultiSetRetainAll()",
      "begin_line": 318,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 320,col 9)-(line 322,col 9)",
        "(line 324,col 9)-(line 324,col 50)",
        "(line 325,col 9)-(line 325,col 30)",
        "(line 326,col 9)-(line 326,col 30)",
        "(line 327,col 9)-(line 327,col 30)",
        "(line 328,col 9)-(line 328,col 30)",
        "(line 329,col 9)-(line 329,col 30)",
        "(line 330,col 9)-(line 330,col 30)",
        "(line 331,col 9)-(line 331,col 61)",
        "(line 332,col 9)-(line 332,col 25)",
        "(line 333,col 9)-(line 333,col 25)",
        "(line 334,col 9)-(line 334,col 36)",
        "(line 335,col 9)-(line 335,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.testMultiSetIterator()",
      "begin_line": 338,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 340,col 9)-(line 342,col 9)",
        "(line 344,col 9)-(line 344,col 50)",
        "(line 345,col 9)-(line 345,col 30)",
        "(line 346,col 9)-(line 346,col 30)",
        "(line 347,col 9)-(line 347,col 30)",
        "(line 348,col 9)-(line 348,col 73)",
        "(line 349,col 9)-(line 349,col 50)",
        "(line 351,col 9)-(line 351,col 31)",
        "(line 352,col 9)-(line 362,col 9)",
        "(line 364,col 9)-(line 364,col 80)",
        "(line 365,col 9)-(line 365,col 73)",
        "(line 366,col 9)-(line 366,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.testMultiSetIteratorFail()",
      "begin_line": 369,
      "end_line": 388,
      "comment": "",
      "child_ranges": [
        "(line 371,col 9)-(line 373,col 9)",
        "(line 375,col 9)-(line 375,col 50)",
        "(line 376,col 9)-(line 376,col 30)",
        "(line 377,col 9)-(line 377,col 30)",
        "(line 378,col 9)-(line 378,col 30)",
        "(line 379,col 9)-(line 379,col 51)",
        "(line 380,col 9)-(line 380,col 18)",
        "(line 381,col 9)-(line 381,col 29)",
        "(line 382,col 9)-(line 387,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.testMultiSetIteratorFailNoMore()",
      "begin_line": 390,
      "end_line": 410,
      "comment": "",
      "child_ranges": [
        "(line 392,col 9)-(line 394,col 9)",
        "(line 396,col 9)-(line 396,col 50)",
        "(line 397,col 9)-(line 397,col 30)",
        "(line 398,col 9)-(line 398,col 30)",
        "(line 399,col 9)-(line 399,col 30)",
        "(line 400,col 9)-(line 400,col 51)",
        "(line 401,col 9)-(line 401,col 18)",
        "(line 402,col 9)-(line 402,col 18)",
        "(line 403,col 9)-(line 403,col 18)",
        "(line 404,col 9)-(line 409,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.testMultiSetIteratorFailDoubleRemove()",
      "begin_line": 412,
      "end_line": 438,
      "comment": "",
      "child_ranges": [
        "(line 414,col 9)-(line 416,col 9)",
        "(line 418,col 9)-(line 418,col 50)",
        "(line 419,col 9)-(line 419,col 30)",
        "(line 420,col 9)-(line 420,col 30)",
        "(line 421,col 9)-(line 421,col 30)",
        "(line 422,col 9)-(line 422,col 51)",
        "(line 423,col 9)-(line 423,col 18)",
        "(line 424,col 9)-(line 424,col 18)",
        "(line 425,col 9)-(line 425,col 41)",
        "(line 426,col 9)-(line 426,col 20)",
        "(line 427,col 9)-(line 427,col 41)",
        "(line 428,col 9)-(line 433,col 9)",
        "(line 434,col 9)-(line 434,col 41)",
        "(line 435,col 9)-(line 435,col 18)",
        "(line 436,col 9)-(line 436,col 20)",
        "(line 437,col 9)-(line 437,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.testMultiSetIteratorRemoveProtectsInvariants()",
      "begin_line": 440,
      "end_line": 464,
      "comment": "",
      "child_ranges": [
        "(line 442,col 9)-(line 444,col 9)",
        "(line 446,col 9)-(line 446,col 50)",
        "(line 447,col 9)-(line 447,col 30)",
        "(line 448,col 9)-(line 448,col 30)",
        "(line 449,col 9)-(line 449,col 41)",
        "(line 450,col 9)-(line 450,col 51)",
        "(line 451,col 9)-(line 451,col 37)",
        "(line 452,col 9)-(line 452,col 41)",
        "(line 453,col 9)-(line 453,col 20)",
        "(line 454,col 9)-(line 454,col 41)",
        "(line 455,col 9)-(line 455,col 41)",
        "(line 456,col 9)-(line 456,col 37)",
        "(line 457,col 9)-(line 457,col 42)",
        "(line 458,col 9)-(line 458,col 20)",
        "(line 459,col 9)-(line 459,col 41)",
        "(line 460,col 9)-(line 460,col 42)",
        "(line 462,col 9)-(line 462,col 52)",
        "(line 463,col 9)-(line 463,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.testMultiSetToArray()",
      "begin_line": 466,
      "end_line": 488,
      "comment": "",
      "child_ranges": [
        "(line 468,col 9)-(line 470,col 9)",
        "(line 472,col 9)-(line 472,col 50)",
        "(line 473,col 9)-(line 473,col 30)",
        "(line 474,col 9)-(line 474,col 30)",
        "(line 475,col 9)-(line 475,col 30)",
        "(line 476,col 9)-(line 476,col 30)",
        "(line 477,col 9)-(line 477,col 30)",
        "(line 478,col 9)-(line 478,col 50)",
        "(line 479,col 9)-(line 479,col 32)",
        "(line 480,col 9)-(line 484,col 9)",
        "(line 485,col 9)-(line 485,col 27)",
        "(line 486,col 9)-(line 486,col 27)",
        "(line 487,col 9)-(line 487,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.testMultiSetToArrayPopulate()",
      "begin_line": 490,
      "end_line": 512,
      "comment": "",
      "child_ranges": [
        "(line 492,col 9)-(line 494,col 9)",
        "(line 496,col 9)-(line 496,col 50)",
        "(line 497,col 9)-(line 497,col 30)",
        "(line 498,col 9)-(line 498,col 30)",
        "(line 499,col 9)-(line 499,col 30)",
        "(line 500,col 9)-(line 500,col 30)",
        "(line 501,col 9)-(line 501,col 30)",
        "(line 502,col 9)-(line 502,col 63)",
        "(line 503,col 9)-(line 503,col 32)",
        "(line 504,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 509,col 27)",
        "(line 510,col 9)-(line 510,col 27)",
        "(line 511,col 9)-(line 511,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.testMultiSetEquals()",
      "begin_line": 515,
      "end_line": 537,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 517,col 9)-(line 519,col 9)",
        "(line 521,col 9)-(line 521,col 50)",
        "(line 522,col 9)-(line 522,col 51)",
        "(line 523,col 9)-(line 523,col 55)",
        "(line 524,col 9)-(line 524,col 30)",
        "(line 525,col 9)-(line 525,col 56)",
        "(line 526,col 9)-(line 526,col 31)",
        "(line 527,col 9)-(line 527,col 55)",
        "(line 528,col 9)-(line 528,col 30)",
        "(line 529,col 9)-(line 529,col 30)",
        "(line 530,col 9)-(line 530,col 30)",
        "(line 531,col 9)-(line 531,col 30)",
        "(line 532,col 9)-(line 532,col 31)",
        "(line 533,col 9)-(line 533,col 31)",
        "(line 534,col 9)-(line 534,col 31)",
        "(line 535,col 9)-(line 535,col 31)",
        "(line 536,col 9)-(line 536,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.testMultiSetEqualsHashMultiSet()",
      "begin_line": 539,
      "end_line": 561,
      "comment": "",
      "child_ranges": [
        "(line 541,col 9)-(line 543,col 9)",
        "(line 545,col 9)-(line 545,col 50)",
        "(line 546,col 9)-(line 546,col 60)",
        "(line 547,col 9)-(line 547,col 55)",
        "(line 548,col 9)-(line 548,col 30)",
        "(line 549,col 9)-(line 549,col 56)",
        "(line 550,col 9)-(line 550,col 31)",
        "(line 551,col 9)-(line 551,col 55)",
        "(line 552,col 9)-(line 552,col 30)",
        "(line 553,col 9)-(line 553,col 30)",
        "(line 554,col 9)-(line 554,col 30)",
        "(line 555,col 9)-(line 555,col 30)",
        "(line 556,col 9)-(line 556,col 31)",
        "(line 557,col 9)-(line 557,col 31)",
        "(line 558,col 9)-(line 558,col 31)",
        "(line 559,col 9)-(line 559,col 31)",
        "(line 560,col 9)-(line 560,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.testMultiSetHashCode()",
      "begin_line": 563,
      "end_line": 592,
      "comment": "",
      "child_ranges": [
        "(line 565,col 9)-(line 567,col 9)",
        "(line 569,col 9)-(line 569,col 50)",
        "(line 570,col 9)-(line 570,col 51)",
        "(line 571,col 9)-(line 571,col 45)",
        "(line 572,col 9)-(line 572,col 46)",
        "(line 573,col 9)-(line 573,col 64)",
        "(line 574,col 9)-(line 574,col 30)",
        "(line 575,col 9)-(line 575,col 30)",
        "(line 576,col 9)-(line 576,col 30)",
        "(line 577,col 9)-(line 577,col 30)",
        "(line 578,col 9)-(line 578,col 30)",
        "(line 579,col 9)-(line 579,col 31)",
        "(line 580,col 9)-(line 580,col 31)",
        "(line 581,col 9)-(line 581,col 31)",
        "(line 582,col 9)-(line 582,col 31)",
        "(line 583,col 9)-(line 583,col 31)",
        "(line 584,col 9)-(line 584,col 64)",
        "(line 586,col 9)-(line 586,col 22)",
        "(line 587,col 9)-(line 587,col 36)",
        "(line 588,col 9)-(line 588,col 36)",
        "(line 589,col 9)-(line 589,col 36)",
        "(line 590,col 9)-(line 590,col 49)",
        "(line 591,col 9)-(line 591,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.bulkTestMultiSetUniqueSet()",
      "begin_line": 604,
      "end_line": 606,
      "comment": "\n     * Bulk test {@link MultiSet#uniqueSet()}.  This method runs through all of\n     * the tests in {@link AbstractSetTest}.\n     * After modification operations, {@link #verify()} is invoked to ensure\n     * that the multiset and the other collection views are still valid.\n     *\n     * @return a {@link AbstractSetTest} instance for testing the multiset\u0027s unique set\n     ",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestMultiSetUniqueSet",
      "is_interface": false,
      "parent_types": [
        "AbstractSetTest\u003cT\u003e"
      ],
      "begin_line": 608,
      "end_line": 671,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.TestMultiSetUniqueSet.TestMultiSetUniqueSet()",
      "begin_line": 609,
      "end_line": 611,
      "comment": "",
      "child_ranges": [
        "(line 610,col 13)-(line 610,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.TestMultiSetUniqueSet.getFullElements()",
      "begin_line": 613,
      "end_line": 616,
      "comment": "",
      "child_ranges": [
        "(line 615,col 13)-(line 615,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.TestMultiSetUniqueSet.getOtherElements()",
      "begin_line": 618,
      "end_line": 621,
      "comment": "",
      "child_ranges": [
        "(line 620,col 13)-(line 620,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.TestMultiSetUniqueSet.makeObject()",
      "begin_line": 623,
      "end_line": 626,
      "comment": "",
      "child_ranges": [
        "(line 625,col 13)-(line 625,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.TestMultiSetUniqueSet.makeFullCollection()",
      "begin_line": 628,
      "end_line": 631,
      "comment": "",
      "child_ranges": [
        "(line 630,col 13)-(line 630,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.TestMultiSetUniqueSet.isNullSupported()",
      "begin_line": 633,
      "end_line": 636,
      "comment": "",
      "child_ranges": [
        "(line 635,col 13)-(line 635,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.TestMultiSetUniqueSet.isAddSupported()",
      "begin_line": 638,
      "end_line": 641,
      "comment": "",
      "child_ranges": [
        "(line 640,col 13)-(line 640,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.TestMultiSetUniqueSet.isRemoveSupported()",
      "begin_line": 643,
      "end_line": 646,
      "comment": "",
      "child_ranges": [
        "(line 645,col 13)-(line 645,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.TestMultiSetUniqueSet.isTestSerialization()",
      "begin_line": 648,
      "end_line": 651,
      "comment": "",
      "child_ranges": [
        "(line 650,col 13)-(line 650,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.TestMultiSetUniqueSet.resetEmpty()",
      "begin_line": 653,
      "end_line": 658,
      "comment": "",
      "child_ranges": [
        "(line 655,col 13)-(line 655,col 51)",
        "(line 656,col 13)-(line 656,col 108)",
        "(line 657,col 13)-(line 657,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.TestMultiSetUniqueSet.resetFull()",
      "begin_line": 660,
      "end_line": 665,
      "comment": "",
      "child_ranges": [
        "(line 662,col 13)-(line 662,col 50)",
        "(line 663,col 13)-(line 663,col 108)",
        "(line 664,col 13)-(line 664,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.TestMultiSetUniqueSet.verify()",
      "begin_line": 667,
      "end_line": 670,
      "comment": "",
      "child_ranges": [
        "(line 669,col 13)-(line 669,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.testEmptyMultiSetCompatibility()",
      "begin_line": 679,
      "end_line": 687,
      "comment": "\n     * Compare the current serialized form of the MultiSet\n     * against the canonical version in SVN.\n     ",
      "child_ranges": [
        "(line 681,col 9)-(line 681,col 50)",
        "(line 682,col 9)-(line 686,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.AbstractMultiSetTest.testFullMultiSetCompatibility()",
      "begin_line": 693,
      "end_line": 701,
      "comment": "\n     * Compare the current serialized form of the MultiSet\n     * against the canonical version in SVN.\n     ",
      "child_ranges": [
        "(line 695,col 9)-(line 695,col 58)",
        "(line 696,col 9)-(line 700,col 9)"
      ]
    }
  ]
}