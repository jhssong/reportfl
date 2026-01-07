{
  "filepath": "/tmp/Collections-25b/src/test/java/org/apache/commons/collections4/bag/AbstractBagTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractBagTest",
      "is_interface": false,
      "parent_types": [
        "AbstractCollectionTest\u003cT\u003e"
      ],
      "begin_line": 63,
      "end_line": 706,
      "comment": "\n * Abstract test class for {@link org.apache.commons.collections4.Bag Bag} methods and contracts.\n * \u003cp\u003e\n * To use, simply extend this class, and implement\n * the {@link #makeObject} method.\n * \u003cp\u003e\n * If your bag fails one of these tests by design,\n * you may still use this base set of cases.  Simply override the\n * test case (method) your bag fails.\n * \u003cp\u003e\n * \u003cb\u003eNote:\u003c/b\u003e The Bag interface does not conform to the Collection interface\n * so the generic collection tests from AbstractCollectionTest would normally fail.\n * As a work-around since 4.0, a CollectionBag decorator can be used\n * to make any Bag implementation comply to the Collection contract.\n * \u003cp\u003e\n * This abstract test class does wrap the concrete bag implementation\n * with such a decorator, see the overridden {@link #resetEmpty()} and\n * {@link #resetFull()} methods.\n * \u003cp\u003e\n * In addition to the generic collection tests (prefix testCollection) inherited\n * from AbstractCollectionTest, there are test methods that test the \"normal\" Bag\n * interface (prefix testBag). For Bag specific tests use the {@link #makeObject()} and \n * {@link #makeFullCollection()} methods instead of {@link #resetEmpty()} and resetFull(),\n * otherwise the collection will be wrapped by a {@link CollectionBag} decorator.\n *\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.AbstractBagTest(java.lang.String)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * JUnit constructor.\n     *\n     * @param testName  the test class name\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.makeConfirmedCollection()",
      "begin_line": 78,
      "end_line": 82,
      "comment": "\n     * Returns an empty {@link ArrayList}.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 53)",
        "(line 81,col 9)-(line 81,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.makeConfirmedFullCollection()",
      "begin_line": 87,
      "end_line": 92,
      "comment": "\n     * Returns a full collection.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 61)",
        "(line 90,col 9)-(line 90,col 54)",
        "(line 91,col 9)-(line 91,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.makeObject()",
      "begin_line": 99,
      "end_line": 100,
      "comment": "\n     * Return a new, empty bag to used for testing.\n     *\n     * @return the bag to be tested\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.makeFullCollection()",
      "begin_line": 105,
      "end_line": 110,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 40)",
        "(line 108,col 9)-(line 108,col 53)",
        "(line 109,col 9)-(line 109,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.resetEmpty()",
      "begin_line": 114,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 70)",
        "(line 117,col 9)-(line 117,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.resetFull()",
      "begin_line": 120,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 78)",
        "(line 123,col 9)-(line 123,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.getCollection()",
      "begin_line": 132,
      "end_line": 135,
      "comment": "\n     * Returns the {@link #collection} field cast to a {@link Bag}.\n     *\n     * @return the collection field as a Bag\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.testBagAdd()",
      "begin_line": 138,
      "end_line": 154,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 140,col 9)-(line 142,col 9)",
        "(line 144,col 9)-(line 144,col 40)",
        "(line 145,col 9)-(line 145,col 25)",
        "(line 146,col 9)-(line 146,col 60)",
        "(line 147,col 9)-(line 147,col 69)",
        "(line 148,col 9)-(line 148,col 25)",
        "(line 149,col 9)-(line 149,col 60)",
        "(line 150,col 9)-(line 150,col 69)",
        "(line 151,col 9)-(line 151,col 25)",
        "(line 152,col 9)-(line 152,col 38)",
        "(line 153,col 9)-(line 153,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.testBagEqualsSelf()",
      "begin_line": 156,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 40)",
        "(line 159,col 9)-(line 159,col 36)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 165,col 9)-(line 165,col 27)",
        "(line 166,col 9)-(line 166,col 36)",
        "(line 167,col 9)-(line 167,col 27)",
        "(line 168,col 9)-(line 168,col 36)",
        "(line 169,col 9)-(line 169,col 28)",
        "(line 170,col 9)-(line 170,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.testBagRemove()",
      "begin_line": 173,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 177,col 9)",
        "(line 179,col 9)-(line 179,col 40)",
        "(line 180,col 9)-(line 180,col 25)",
        "(line 181,col 9)-(line 181,col 69)",
        "(line 182,col 9)-(line 182,col 24)",
        "(line 183,col 9)-(line 183,col 69)",
        "(line 184,col 9)-(line 184,col 25)",
        "(line 185,col 9)-(line 185,col 25)",
        "(line 186,col 9)-(line 186,col 25)",
        "(line 187,col 9)-(line 187,col 25)",
        "(line 188,col 9)-(line 188,col 69)",
        "(line 189,col 9)-(line 189,col 27)",
        "(line 190,col 9)-(line 190,col 69)",
        "(line 191,col 9)-(line 191,col 27)",
        "(line 192,col 9)-(line 192,col 69)",
        "(line 193,col 9)-(line 193,col 24)",
        "(line 194,col 9)-(line 194,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.testBagRemoveAll()",
      "begin_line": 197,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 199,col 9)-(line 201,col 9)",
        "(line 203,col 9)-(line 203,col 40)",
        "(line 204,col 9)-(line 204,col 28)",
        "(line 205,col 9)-(line 205,col 69)",
        "(line 206,col 9)-(line 206,col 25)",
        "(line 207,col 9)-(line 207,col 25)",
        "(line 208,col 9)-(line 208,col 62)",
        "(line 209,col 9)-(line 209,col 60)",
        "(line 210,col 9)-(line 210,col 24)",
        "(line 211,col 9)-(line 211,col 24)",
        "(line 212,col 9)-(line 212,col 30)",
        "(line 213,col 9)-(line 213,col 69)",
        "(line 214,col 9)-(line 214,col 69)",
        "(line 215,col 9)-(line 215,col 69)",
        "(line 216,col 9)-(line 216,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.testBagContains()",
      "begin_line": 219,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 221,col 9)-(line 223,col 9)",
        "(line 225,col 9)-(line 225,col 40)",
        "(line 227,col 9)-(line 227,col 83)",
        "(line 228,col 9)-(line 228,col 83)",
        "(line 230,col 9)-(line 230,col 25)",
        "(line 231,col 9)-(line 231,col 72)",
        "(line 232,col 9)-(line 232,col 83)",
        "(line 234,col 9)-(line 234,col 25)",
        "(line 235,col 9)-(line 235,col 72)",
        "(line 236,col 9)-(line 236,col 83)",
        "(line 238,col 9)-(line 238,col 25)",
        "(line 239,col 9)-(line 239,col 72)",
        "(line 240,col 9)-(line 240,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.testBagContainsAll()",
      "begin_line": 243,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 245,col 9)-(line 247,col 9)",
        "(line 249,col 9)-(line 249,col 40)",
        "(line 250,col 9)-(line 250,col 59)",
        "(line 251,col 9)-(line 251,col 61)",
        "(line 252,col 9)-(line 252,col 25)",
        "(line 253,col 9)-(line 253,col 61)",
        "(line 254,col 9)-(line 254,col 25)",
        "(line 255,col 9)-(line 255,col 25)",
        "(line 256,col 9)-(line 256,col 61)",
        "(line 257,col 9)-(line 257,col 25)",
        "(line 258,col 9)-(line 258,col 63)",
        "(line 259,col 9)-(line 259,col 27)",
        "(line 260,col 9)-(line 260,col 27)",
        "(line 262,col 9)-(line 262,col 79)",
        "(line 263,col 9)-(line 263,col 91)",
        "(line 264,col 9)-(line 264,col 91)",
        "(line 265,col 9)-(line 265,col 91)",
        "(line 266,col 9)-(line 266,col 99)",
        "(line 268,col 9)-(line 268,col 25)",
        "(line 269,col 9)-(line 269,col 79)",
        "(line 270,col 9)-(line 270,col 81)",
        "(line 271,col 9)-(line 271,col 91)",
        "(line 272,col 9)-(line 272,col 91)",
        "(line 273,col 9)-(line 273,col 99)",
        "(line 275,col 9)-(line 275,col 25)",
        "(line 276,col 9)-(line 276,col 79)",
        "(line 277,col 9)-(line 277,col 81)",
        "(line 278,col 9)-(line 278,col 81)",
        "(line 279,col 9)-(line 279,col 91)",
        "(line 280,col 9)-(line 280,col 99)",
        "(line 282,col 9)-(line 282,col 25)",
        "(line 283,col 9)-(line 283,col 79)",
        "(line 284,col 9)-(line 284,col 81)",
        "(line 285,col 9)-(line 285,col 81)",
        "(line 286,col 9)-(line 286,col 91)",
        "(line 287,col 9)-(line 287,col 99)",
        "(line 289,col 9)-(line 289,col 25)",
        "(line 290,col 9)-(line 290,col 79)",
        "(line 291,col 9)-(line 291,col 81)",
        "(line 292,col 9)-(line 292,col 81)",
        "(line 293,col 9)-(line 293,col 81)",
        "(line 294,col 9)-(line 294,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.testBagSize()",
      "begin_line": 297,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 299,col 9)-(line 301,col 9)",
        "(line 303,col 9)-(line 303,col 40)",
        "(line 304,col 9)-(line 304,col 65)",
        "(line 305,col 9)-(line 305,col 25)",
        "(line 306,col 9)-(line 306,col 65)",
        "(line 307,col 9)-(line 307,col 25)",
        "(line 308,col 9)-(line 308,col 65)",
        "(line 309,col 9)-(line 309,col 25)",
        "(line 310,col 9)-(line 310,col 65)",
        "(line 311,col 9)-(line 311,col 25)",
        "(line 312,col 9)-(line 312,col 65)",
        "(line 313,col 9)-(line 313,col 25)",
        "(line 314,col 9)-(line 314,col 65)",
        "(line 315,col 9)-(line 315,col 27)",
        "(line 316,col 9)-(line 316,col 64)",
        "(line 317,col 9)-(line 317,col 65)",
        "(line 318,col 9)-(line 318,col 24)",
        "(line 319,col 9)-(line 319,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.testBagRetainAll()",
      "begin_line": 322,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 324,col 9)-(line 326,col 9)",
        "(line 328,col 9)-(line 328,col 40)",
        "(line 329,col 9)-(line 329,col 25)",
        "(line 330,col 9)-(line 330,col 25)",
        "(line 331,col 9)-(line 331,col 25)",
        "(line 332,col 9)-(line 332,col 25)",
        "(line 333,col 9)-(line 333,col 25)",
        "(line 334,col 9)-(line 334,col 25)",
        "(line 335,col 9)-(line 335,col 61)",
        "(line 336,col 9)-(line 336,col 25)",
        "(line 337,col 9)-(line 337,col 25)",
        "(line 338,col 9)-(line 338,col 31)",
        "(line 339,col 9)-(line 339,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.testBagIterator()",
      "begin_line": 342,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 344,col 9)-(line 346,col 9)",
        "(line 348,col 9)-(line 348,col 40)",
        "(line 349,col 9)-(line 349,col 25)",
        "(line 350,col 9)-(line 350,col 25)",
        "(line 351,col 9)-(line 351,col 25)",
        "(line 352,col 9)-(line 352,col 63)",
        "(line 353,col 9)-(line 353,col 45)",
        "(line 355,col 9)-(line 355,col 31)",
        "(line 356,col 9)-(line 366,col 9)",
        "(line 368,col 9)-(line 368,col 70)",
        "(line 369,col 9)-(line 369,col 63)",
        "(line 370,col 9)-(line 370,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.testBagIteratorFail()",
      "begin_line": 373,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 375,col 9)-(line 377,col 9)",
        "(line 379,col 9)-(line 379,col 40)",
        "(line 380,col 9)-(line 380,col 25)",
        "(line 381,col 9)-(line 381,col 25)",
        "(line 382,col 9)-(line 382,col 25)",
        "(line 383,col 9)-(line 383,col 46)",
        "(line 384,col 9)-(line 384,col 18)",
        "(line 385,col 9)-(line 385,col 24)",
        "(line 386,col 9)-(line 391,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.testBagIteratorFailNoMore()",
      "begin_line": 394,
      "end_line": 414,
      "comment": "",
      "child_ranges": [
        "(line 396,col 9)-(line 398,col 9)",
        "(line 400,col 9)-(line 400,col 40)",
        "(line 401,col 9)-(line 401,col 25)",
        "(line 402,col 9)-(line 402,col 25)",
        "(line 403,col 9)-(line 403,col 25)",
        "(line 404,col 9)-(line 404,col 46)",
        "(line 405,col 9)-(line 405,col 18)",
        "(line 406,col 9)-(line 406,col 18)",
        "(line 407,col 9)-(line 407,col 18)",
        "(line 408,col 9)-(line 413,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.testBagIteratorFailDoubleRemove()",
      "begin_line": 416,
      "end_line": 442,
      "comment": "",
      "child_ranges": [
        "(line 418,col 9)-(line 420,col 9)",
        "(line 422,col 9)-(line 422,col 40)",
        "(line 423,col 9)-(line 423,col 25)",
        "(line 424,col 9)-(line 424,col 25)",
        "(line 425,col 9)-(line 425,col 25)",
        "(line 426,col 9)-(line 426,col 46)",
        "(line 427,col 9)-(line 427,col 18)",
        "(line 428,col 9)-(line 428,col 18)",
        "(line 429,col 9)-(line 429,col 36)",
        "(line 430,col 9)-(line 430,col 20)",
        "(line 431,col 9)-(line 431,col 36)",
        "(line 432,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 438,col 36)",
        "(line 439,col 9)-(line 439,col 18)",
        "(line 440,col 9)-(line 440,col 20)",
        "(line 441,col 9)-(line 441,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.testBagIteratorRemoveProtectsInvariants()",
      "begin_line": 444,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 446,col 9)-(line 448,col 9)",
        "(line 450,col 9)-(line 450,col 40)",
        "(line 451,col 9)-(line 451,col 25)",
        "(line 452,col 9)-(line 452,col 25)",
        "(line 453,col 9)-(line 453,col 36)",
        "(line 454,col 9)-(line 454,col 46)",
        "(line 455,col 9)-(line 455,col 37)",
        "(line 456,col 9)-(line 456,col 41)",
        "(line 457,col 9)-(line 457,col 20)",
        "(line 458,col 9)-(line 458,col 36)",
        "(line 459,col 9)-(line 459,col 41)",
        "(line 460,col 9)-(line 460,col 37)",
        "(line 461,col 9)-(line 461,col 42)",
        "(line 462,col 9)-(line 462,col 20)",
        "(line 463,col 9)-(line 463,col 36)",
        "(line 464,col 9)-(line 464,col 42)",
        "(line 466,col 9)-(line 466,col 47)",
        "(line 467,col 9)-(line 467,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.testBagToArray()",
      "begin_line": 470,
      "end_line": 492,
      "comment": "",
      "child_ranges": [
        "(line 472,col 9)-(line 474,col 9)",
        "(line 476,col 9)-(line 476,col 40)",
        "(line 477,col 9)-(line 477,col 25)",
        "(line 478,col 9)-(line 478,col 25)",
        "(line 479,col 9)-(line 479,col 25)",
        "(line 480,col 9)-(line 480,col 25)",
        "(line 481,col 9)-(line 481,col 25)",
        "(line 482,col 9)-(line 482,col 45)",
        "(line 483,col 9)-(line 483,col 32)",
        "(line 484,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 489,col 27)",
        "(line 490,col 9)-(line 490,col 27)",
        "(line 491,col 9)-(line 491,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.testBagToArrayPopulate()",
      "begin_line": 494,
      "end_line": 516,
      "comment": "",
      "child_ranges": [
        "(line 496,col 9)-(line 498,col 9)",
        "(line 500,col 9)-(line 500,col 40)",
        "(line 501,col 9)-(line 501,col 25)",
        "(line 502,col 9)-(line 502,col 25)",
        "(line 503,col 9)-(line 503,col 25)",
        "(line 504,col 9)-(line 504,col 25)",
        "(line 505,col 9)-(line 505,col 25)",
        "(line 506,col 9)-(line 506,col 58)",
        "(line 507,col 9)-(line 507,col 32)",
        "(line 508,col 9)-(line 512,col 9)",
        "(line 513,col 9)-(line 513,col 27)",
        "(line 514,col 9)-(line 514,col 27)",
        "(line 515,col 9)-(line 515,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.testBagEquals()",
      "begin_line": 519,
      "end_line": 541,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 521,col 9)-(line 523,col 9)",
        "(line 525,col 9)-(line 525,col 40)",
        "(line 526,col 9)-(line 526,col 41)",
        "(line 527,col 9)-(line 527,col 45)",
        "(line 528,col 9)-(line 528,col 25)",
        "(line 529,col 9)-(line 529,col 46)",
        "(line 530,col 9)-(line 530,col 26)",
        "(line 531,col 9)-(line 531,col 45)",
        "(line 532,col 9)-(line 532,col 25)",
        "(line 533,col 9)-(line 533,col 25)",
        "(line 534,col 9)-(line 534,col 25)",
        "(line 535,col 9)-(line 535,col 25)",
        "(line 536,col 9)-(line 536,col 26)",
        "(line 537,col 9)-(line 537,col 26)",
        "(line 538,col 9)-(line 538,col 26)",
        "(line 539,col 9)-(line 539,col 26)",
        "(line 540,col 9)-(line 540,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.testBagEqualsHashBag()",
      "begin_line": 543,
      "end_line": 565,
      "comment": "",
      "child_ranges": [
        "(line 545,col 9)-(line 547,col 9)",
        "(line 549,col 9)-(line 549,col 40)",
        "(line 550,col 9)-(line 550,col 45)",
        "(line 551,col 9)-(line 551,col 45)",
        "(line 552,col 9)-(line 552,col 25)",
        "(line 553,col 9)-(line 553,col 46)",
        "(line 554,col 9)-(line 554,col 26)",
        "(line 555,col 9)-(line 555,col 45)",
        "(line 556,col 9)-(line 556,col 25)",
        "(line 557,col 9)-(line 557,col 25)",
        "(line 558,col 9)-(line 558,col 25)",
        "(line 559,col 9)-(line 559,col 25)",
        "(line 560,col 9)-(line 560,col 26)",
        "(line 561,col 9)-(line 561,col 26)",
        "(line 562,col 9)-(line 562,col 26)",
        "(line 563,col 9)-(line 563,col 26)",
        "(line 564,col 9)-(line 564,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.testBagHashCode()",
      "begin_line": 567,
      "end_line": 596,
      "comment": "",
      "child_ranges": [
        "(line 569,col 9)-(line 571,col 9)",
        "(line 573,col 9)-(line 573,col 40)",
        "(line 574,col 9)-(line 574,col 41)",
        "(line 575,col 9)-(line 575,col 40)",
        "(line 576,col 9)-(line 576,col 41)",
        "(line 577,col 9)-(line 577,col 54)",
        "(line 578,col 9)-(line 578,col 25)",
        "(line 579,col 9)-(line 579,col 25)",
        "(line 580,col 9)-(line 580,col 25)",
        "(line 581,col 9)-(line 581,col 25)",
        "(line 582,col 9)-(line 582,col 25)",
        "(line 583,col 9)-(line 583,col 26)",
        "(line 584,col 9)-(line 584,col 26)",
        "(line 585,col 9)-(line 585,col 26)",
        "(line 586,col 9)-(line 586,col 26)",
        "(line 587,col 9)-(line 587,col 26)",
        "(line 588,col 9)-(line 588,col 54)",
        "(line 590,col 9)-(line 590,col 22)",
        "(line 591,col 9)-(line 591,col 36)",
        "(line 592,col 9)-(line 592,col 36)",
        "(line 593,col 9)-(line 593,col 36)",
        "(line 594,col 9)-(line 594,col 44)",
        "(line 595,col 9)-(line 595,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.bulkTestBagUniqueSet()",
      "begin_line": 608,
      "end_line": 610,
      "comment": "\n     * Bulk test {@link Bag#uniqueSet()}.  This method runs through all of\n     * the tests in {@link AbstractSetTest}.\n     * After modification operations, {@link #verify()} is invoked to ensure\n     * that the bag and the other collection views are still valid.\n     *\n     * @return a {@link AbstractSetTest} instance for testing the bag\u0027s unique set\n     ",
      "child_ranges": [
        "(line 609,col 9)-(line 609,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestBagUniqueSet",
      "is_interface": false,
      "parent_types": [
        "AbstractSetTest\u003cT\u003e"
      ],
      "begin_line": 612,
      "end_line": 675,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.TestBagUniqueSet.TestBagUniqueSet()",
      "begin_line": 613,
      "end_line": 615,
      "comment": "",
      "child_ranges": [
        "(line 614,col 13)-(line 614,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.TestBagUniqueSet.getFullElements()",
      "begin_line": 617,
      "end_line": 620,
      "comment": "",
      "child_ranges": [
        "(line 619,col 13)-(line 619,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.TestBagUniqueSet.getOtherElements()",
      "begin_line": 622,
      "end_line": 625,
      "comment": "",
      "child_ranges": [
        "(line 624,col 13)-(line 624,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.TestBagUniqueSet.makeObject()",
      "begin_line": 627,
      "end_line": 630,
      "comment": "",
      "child_ranges": [
        "(line 629,col 13)-(line 629,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.TestBagUniqueSet.makeFullCollection()",
      "begin_line": 632,
      "end_line": 635,
      "comment": "",
      "child_ranges": [
        "(line 634,col 13)-(line 634,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.TestBagUniqueSet.isNullSupported()",
      "begin_line": 637,
      "end_line": 640,
      "comment": "",
      "child_ranges": [
        "(line 639,col 13)-(line 639,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.TestBagUniqueSet.isAddSupported()",
      "begin_line": 642,
      "end_line": 645,
      "comment": "",
      "child_ranges": [
        "(line 644,col 13)-(line 644,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.TestBagUniqueSet.isRemoveSupported()",
      "begin_line": 647,
      "end_line": 650,
      "comment": "",
      "child_ranges": [
        "(line 649,col 13)-(line 649,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.TestBagUniqueSet.isTestSerialization()",
      "begin_line": 652,
      "end_line": 655,
      "comment": "",
      "child_ranges": [
        "(line 654,col 13)-(line 654,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.TestBagUniqueSet.resetEmpty()",
      "begin_line": 657,
      "end_line": 662,
      "comment": "",
      "child_ranges": [
        "(line 659,col 13)-(line 659,col 46)",
        "(line 660,col 13)-(line 660,col 98)",
        "(line 661,col 13)-(line 661,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.TestBagUniqueSet.resetFull()",
      "begin_line": 664,
      "end_line": 669,
      "comment": "",
      "child_ranges": [
        "(line 666,col 13)-(line 666,col 45)",
        "(line 667,col 13)-(line 667,col 98)",
        "(line 668,col 13)-(line 668,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.TestBagUniqueSet.verify()",
      "begin_line": 671,
      "end_line": 674,
      "comment": "",
      "child_ranges": [
        "(line 673,col 13)-(line 673,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.testEmptyBagCompatibility()",
      "begin_line": 683,
      "end_line": 691,
      "comment": "\n     * Compare the current serialized form of the Bag\n     * against the canonical version in SVN.\n     ",
      "child_ranges": [
        "(line 685,col 9)-(line 685,col 40)",
        "(line 686,col 9)-(line 690,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.AbstractBagTest.testFullBagCompatibility()",
      "begin_line": 697,
      "end_line": 705,
      "comment": "\n     * Compare the current serialized form of the Bag\n     * against the canonical version in SVN.\n     ",
      "child_ranges": [
        "(line 699,col 9)-(line 699,col 48)",
        "(line 700,col 9)-(line 704,col 9)"
      ]
    }
  ]
}