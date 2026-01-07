{
  "filepath": "/tmp/Collections-25b/src/test/java/org/apache/commons/collections4/list/AbstractListTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractListTest",
      "is_interface": false,
      "parent_types": [
        "AbstractCollectionTest\u003cE\u003e"
      ],
      "begin_line": 51,
      "end_line": 1390,
      "comment": "\n * Abstract test class for {@link java.util.List} methods and contracts.\n * \u003cp\u003e\n * To use, simply extend this class, and implement\n * the {@link #makeObject} method.\n * \u003cp\u003e\n * If your {@link List} fails one of these tests by design,\n * you may still use this base set of cases.  Simply override the\n * test case (method) your {@link List} fails or override one of the\n * protected methods from AbstractCollectionTest.\n *\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.AbstractListTest(java.lang.String)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * JUnit constructor.\n     *\n     * @param testName  the test class name\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.isSetSupported()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     *  Returns true if the collections produced by\n     *  {@link #makeObject()} and {@link #makeFullCollection()}\n     *  support the \u003ccode\u003eset operation.\u003cp\u003e\n     *  Default implementation returns true.  Override if your collection\n     *  class does not support set.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.verify()",
      "begin_line": 79,
      "end_line": 107,
      "comment": "\n     *  Verifies that the test list implementation matches the confirmed list\n     *  implementation.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 23)",
        "(line 84,col 9)-(line 84,col 46)",
        "(line 85,col 9)-(line 85,col 45)",
        "(line 87,col 9)-(line 87,col 66)",
        "(line 88,col 9)-(line 88,col 66)",
        "(line 90,col 9)-(line 90,col 87)",
        "(line 92,col 9)-(line 92,col 18)",
        "(line 93,col 9)-(line 93,col 55)",
        "(line 94,col 9)-(line 94,col 55)",
        "(line 95,col 9)-(line 95,col 48)",
        "(line 96,col 9)-(line 106,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.isEqualsCheckable()",
      "begin_line": 113,
      "end_line": 116,
      "comment": "\n     * List equals method is defined.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.makeConfirmedCollection()",
      "begin_line": 121,
      "end_line": 125,
      "comment": "\n     * Returns an empty {@link ArrayList}.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 53)",
        "(line 124,col 9)-(line 124,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.makeConfirmedFullCollection()",
      "begin_line": 130,
      "end_line": 135,
      "comment": "\n     * Returns a full {@link ArrayList}.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 53)",
        "(line 133,col 9)-(line 133,col 54)",
        "(line 134,col 9)-(line 134,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.makeObject()",
      "begin_line": 142,
      "end_line": 143,
      "comment": "\n     * Returns {@link #makeObject()}.\n     *\n     * @return an empty list to be used for testing\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.makeFullCollection()",
      "begin_line": 148,
      "end_line": 154,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 42)",
        "(line 152,col 9)-(line 152,col 54)",
        "(line 153,col 9)-(line 153,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.getCollection()",
      "begin_line": 162,
      "end_line": 165,
      "comment": "\n     * Returns the {@link #collection} field cast to a {@link List}.\n     *\n     * @return the collection field as a List\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.getConfirmed()",
      "begin_line": 172,
      "end_line": 175,
      "comment": "\n     * Returns the {@link #confirmed} field cast to a {@link List}.\n     *\n     * @return the confirmed field as a List\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.testListAddByIndexBoundsChecking()",
      "begin_line": 182,
      "end_line": 221,
      "comment": "\n     *  Tests bounds checking for {@link List#add(int, Object)} on an\n     *  empty list.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 185,col 9)",
        "(line 187,col 9)-(line 187,col 21)",
        "(line 188,col 9)-(line 188,col 48)",
        "(line 190,col 9)-(line 196,col 9)",
        "(line 198,col 9)-(line 204,col 9)",
        "(line 206,col 9)-(line 212,col 9)",
        "(line 214,col 9)-(line 220,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.testListAddByIndexBoundsChecking2()",
      "begin_line": 227,
      "end_line": 266,
      "comment": "\n     *  Tests bounds checking for {@link List#add(int, Object)} on a\n     *  full list.\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 230,col 9)",
        "(line 232,col 9)-(line 232,col 21)",
        "(line 233,col 9)-(line 233,col 48)",
        "(line 235,col 9)-(line 241,col 9)",
        "(line 243,col 9)-(line 249,col 9)",
        "(line 251,col 9)-(line 257,col 9)",
        "(line 259,col 9)-(line 265,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.testListAddByIndex()",
      "begin_line": 271,
      "end_line": 285,
      "comment": "\n     *  Tests {@link List#add(int,Object)}.\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 274,col 9)",
        "(line 276,col 9)-(line 276,col 48)",
        "(line 277,col 9)-(line 277,col 49)",
        "(line 279,col 9)-(line 284,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.testListEquals()",
      "begin_line": 290,
      "end_line": 357,
      "comment": "\n     *  Tests {@link List#equals(Object)}.\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 21)",
        "(line 292,col 9)-(line 292,col 39)",
        "(line 293,col 9)-(line 293,col 87)",
        "(line 294,col 9)-(line 294,col 17)",
        "(line 295,col 9)-(line 295,col 78)",
        "(line 296,col 9)-(line 296,col 17)",
        "(line 298,col 9)-(line 298,col 57)",
        "(line 299,col 9)-(line 299,col 83)",
        "(line 300,col 9)-(line 300,col 17)",
        "(line 302,col 9)-(line 302,col 50)",
        "(line 303,col 9)-(line 303,col 84)",
        "(line 304,col 9)-(line 304,col 17)",
        "(line 306,col 9)-(line 306,col 20)",
        "(line 307,col 9)-(line 307,col 31)",
        "(line 308,col 9)-(line 308,col 86)",
        "(line 309,col 9)-(line 309,col 17)",
        "(line 310,col 9)-(line 310,col 77)",
        "(line 311,col 9)-(line 311,col 17)",
        "(line 313,col 9)-(line 313,col 29)",
        "(line 314,col 9)-(line 314,col 83)",
        "(line 315,col 9)-(line 315,col 17)",
        "(line 317,col 9)-(line 317,col 50)",
        "(line 318,col 9)-(line 318,col 83)",
        "(line 319,col 9)-(line 319,col 17)",
        "(line 321,col 9)-(line 321,col 49)",
        "(line 322,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 335,col 9)",
        "(line 337,col 9)-(line 337,col 20)",
        "(line 338,col 9)-(line 338,col 31)",
        "(line 339,col 9)-(line 339,col 76)",
        "(line 340,col 9)-(line 340,col 17)",
        "(line 342,col 9)-(line 342,col 66)",
        "(line 343,col 9)-(line 353,col 10)",
        "(line 355,col 9)-(line 355,col 109)",
        "(line 356,col 9)-(line 356,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.Anonymous-2eb799bc-c6d1-4bc2-9261-f97ec9183c3f.size()",
      "begin_line": 344,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 346,col 17)-(line 346,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.Anonymous-37bc37d9-93b9-47d6-93ae-6a65f66379bd.iterator()",
      "begin_line": 349,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 351,col 17)-(line 351,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.testListHashCode()",
      "begin_line": 362,
      "end_line": 374,
      "comment": "\n     *  Tests {@link List#hashCode()}.\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 21)",
        "(line 364,col 9)-(line 364,col 47)",
        "(line 365,col 9)-(line 365,col 46)",
        "(line 366,col 9)-(line 366,col 78)",
        "(line 367,col 9)-(line 367,col 17)",
        "(line 369,col 9)-(line 369,col 20)",
        "(line 370,col 9)-(line 370,col 43)",
        "(line 371,col 9)-(line 371,col 42)",
        "(line 372,col 9)-(line 372,col 77)",
        "(line 373,col 9)-(line 373,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.testListGetByIndex()",
      "begin_line": 379,
      "end_line": 387,
      "comment": "\n     *  Tests {@link List#get(int)}.\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 20)",
        "(line 381,col 9)-(line 381,col 45)",
        "(line 382,col 9)-(line 382,col 47)",
        "(line 383,col 9)-(line 386,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.testListGetByIndexBoundsChecking()",
      "begin_line": 393,
      "end_line": 430,
      "comment": "\n     *  Tests bounds checking for {@link List#get(int)} on an\n     *  empty list.\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 42)",
        "(line 396,col 9)-(line 401,col 9)",
        "(line 403,col 9)-(line 408,col 9)",
        "(line 410,col 9)-(line 415,col 9)",
        "(line 417,col 9)-(line 422,col 9)",
        "(line 424,col 9)-(line 429,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.testListGetByIndexBoundsChecking2()",
      "begin_line": 436,
      "end_line": 466,
      "comment": "\n     *  Tests bounds checking for {@link List#get(int)} on a\n     *  full list.\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 50)",
        "(line 439,col 9)-(line 444,col 9)",
        "(line 446,col 9)-(line 451,col 9)",
        "(line 453,col 9)-(line 458,col 9)",
        "(line 460,col 9)-(line 465,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.testListIndexOf()",
      "begin_line": 471,
      "end_line": 488,
      "comment": "\n     *  Tests {@link List#indexOf}.\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 20)",
        "(line 473,col 9)-(line 473,col 46)",
        "(line 474,col 9)-(line 474,col 45)",
        "(line 476,col 9)-(line 480,col 9)",
        "(line 482,col 9)-(line 482,col 45)",
        "(line 483,col 9)-(line 487,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.testListLastIndexOf()",
      "begin_line": 493,
      "end_line": 512,
      "comment": "\n     *  Tests {@link List#lastIndexOf}.\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 20)",
        "(line 495,col 9)-(line 495,col 46)",
        "(line 496,col 9)-(line 496,col 45)",
        "(line 498,col 9)-(line 498,col 54)",
        "(line 499,col 9)-(line 504,col 9)",
        "(line 506,col 9)-(line 506,col 45)",
        "(line 507,col 9)-(line 511,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.testListSetByIndexBoundsChecking()",
      "begin_line": 518,
      "end_line": 560,
      "comment": "\n     *  Tests bounds checking for {@link List#set(int,Object)} on an\n     *  empty list.\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 521,col 9)",
        "(line 523,col 9)-(line 523,col 42)",
        "(line 524,col 9)-(line 524,col 48)",
        "(line 526,col 9)-(line 531,col 9)",
        "(line 533,col 9)-(line 538,col 9)",
        "(line 540,col 9)-(line 545,col 9)",
        "(line 547,col 9)-(line 552,col 9)",
        "(line 554,col 9)-(line 559,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.testListSetByIndexBoundsChecking2()",
      "begin_line": 567,
      "end_line": 604,
      "comment": "\n     *  Tests bounds checking for {@link List#set(int,Object)} on a\n     *  full list.\n     ",
      "child_ranges": [
        "(line 568,col 9)-(line 570,col 9)",
        "(line 572,col 9)-(line 572,col 50)",
        "(line 573,col 9)-(line 573,col 48)",
        "(line 575,col 9)-(line 581,col 9)",
        "(line 583,col 9)-(line 588,col 9)",
        "(line 590,col 9)-(line 595,col 9)",
        "(line 597,col 9)-(line 603,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.testListSetByIndex()",
      "begin_line": 610,
      "end_line": 626,
      "comment": "\n     *  Test {@link List#set(int,Object)}.\n     ",
      "child_ranges": [
        "(line 611,col 9)-(line 613,col 9)",
        "(line 615,col 9)-(line 615,col 20)",
        "(line 616,col 9)-(line 616,col 47)",
        "(line 617,col 9)-(line 617,col 45)",
        "(line 619,col 9)-(line 625,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.testUnsupportedSet()",
      "begin_line": 632,
      "end_line": 647,
      "comment": "\n     *  If {@link #isSetSupported()} returns false, tests that set operation\n     *  raises \u003cCode\u003eUnsupportedOperationException.\n     ",
      "child_ranges": [
        "(line 633,col 9)-(line 635,col 9)",
        "(line 637,col 9)-(line 637,col 20)",
        "(line 638,col 9)-(line 643,col 9)",
        "(line 646,col 9)-(line 646,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.testListRemoveByIndexBoundsChecking()",
      "begin_line": 653,
      "end_line": 694,
      "comment": "\n     *  Tests bounds checking for {@link List#remove(int)} on an\n     *  empty list.\n     ",
      "child_ranges": [
        "(line 654,col 9)-(line 656,col 9)",
        "(line 658,col 9)-(line 658,col 42)",
        "(line 660,col 9)-(line 665,col 9)",
        "(line 667,col 9)-(line 672,col 9)",
        "(line 674,col 9)-(line 679,col 9)",
        "(line 681,col 9)-(line 686,col 9)",
        "(line 688,col 9)-(line 693,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.testListRemoveByIndexBoundsChecking2()",
      "begin_line": 700,
      "end_line": 736,
      "comment": "\n     *  Tests bounds checking for {@link List#remove(int)} on a\n     *  full list.\n     ",
      "child_ranges": [
        "(line 701,col 9)-(line 703,col 9)",
        "(line 705,col 9)-(line 705,col 50)",
        "(line 707,col 9)-(line 713,col 9)",
        "(line 715,col 9)-(line 720,col 9)",
        "(line 722,col 9)-(line 727,col 9)",
        "(line 729,col 9)-(line 735,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.testListRemoveByIndex()",
      "begin_line": 742,
      "end_line": 755,
      "comment": "\n     *  Tests {@link List#remove(int)}.\n     ",
      "child_ranges": [
        "(line 743,col 9)-(line 745,col 9)",
        "(line 747,col 9)-(line 747,col 49)",
        "(line 748,col 9)-(line 754,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.testListListIterator()",
      "begin_line": 760,
      "end_line": 764,
      "comment": "\n     *  Tests the read-only bits of {@link List#listIterator()}.\n     ",
      "child_ranges": [
        "(line 761,col 9)-(line 761,col 20)",
        "(line 762,col 9)-(line 762,col 55)",
        "(line 763,col 9)-(line 763,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.testListListIteratorByIndex()",
      "begin_line": 769,
      "end_line": 787,
      "comment": "\n     *  Tests the read-only bits of {@link List#listIterator(int)}.\n     ",
      "child_ranges": [
        "(line 770,col 9)-(line 770,col 20)",
        "(line 771,col 9)-(line 773,col 55)",
        "(line 774,col 9)-(line 774,col 20)",
        "(line 775,col 9)-(line 777,col 55)",
        "(line 778,col 9)-(line 778,col 20)",
        "(line 779,col 9)-(line 782,col 9)",
        "(line 783,col 9)-(line 783,col 20)",
        "(line 784,col 9)-(line 786,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.testListListIteratorPreviousRemoveNext()",
      "begin_line": 793,
      "end_line": 820,
      "comment": "\n     * Tests remove on list iterator is correct.\n     ",
      "child_ranges": [
        "(line 794,col 9)-(line 796,col 9)",
        "(line 797,col 9)-(line 797,col 20)",
        "(line 798,col 9)-(line 800,col 9)",
        "(line 801,col 9)-(line 801,col 66)",
        "(line 802,col 9)-(line 802,col 33)",
        "(line 803,col 9)-(line 803,col 32)",
        "(line 804,col 9)-(line 804,col 32)",
        "(line 805,col 9)-(line 805,col 37)",
        "(line 806,col 9)-(line 806,col 37)",
        "(line 807,col 9)-(line 807,col 32)",
        "(line 808,col 9)-(line 808,col 32)",
        "(line 809,col 9)-(line 809,col 51)",
        "(line 810,col 9)-(line 810,col 50)",
        "(line 811,col 9)-(line 811,col 50)",
        "(line 813,col 9)-(line 813,col 20)",
        "(line 814,col 9)-(line 814,col 51)",
        "(line 815,col 9)-(line 815,col 50)",
        "(line 816,col 9)-(line 816,col 33)",
        "(line 817,col 9)-(line 817,col 32)",
        "(line 818,col 9)-(line 818,col 63)",
        "(line 819,col 9)-(line 819,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.testListListIteratorPreviousRemovePrevious()",
      "begin_line": 825,
      "end_line": 852,
      "comment": "\n     * Tests remove on list iterator is correct.\n     ",
      "child_ranges": [
        "(line 826,col 9)-(line 828,col 9)",
        "(line 829,col 9)-(line 829,col 20)",
        "(line 830,col 9)-(line 832,col 9)",
        "(line 833,col 9)-(line 833,col 66)",
        "(line 834,col 9)-(line 834,col 33)",
        "(line 835,col 9)-(line 835,col 32)",
        "(line 836,col 9)-(line 836,col 32)",
        "(line 837,col 9)-(line 837,col 37)",
        "(line 838,col 9)-(line 838,col 37)",
        "(line 839,col 9)-(line 839,col 32)",
        "(line 840,col 9)-(line 840,col 32)",
        "(line 841,col 9)-(line 841,col 51)",
        "(line 842,col 9)-(line 842,col 50)",
        "(line 843,col 9)-(line 843,col 50)",
        "(line 845,col 9)-(line 845,col 20)",
        "(line 846,col 9)-(line 846,col 51)",
        "(line 847,col 9)-(line 847,col 50)",
        "(line 848,col 9)-(line 848,col 38)",
        "(line 849,col 9)-(line 849,col 34)",
        "(line 850,col 9)-(line 850,col 46)",
        "(line 851,col 9)-(line 851,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.testListListIteratorNextRemoveNext()",
      "begin_line": 857,
      "end_line": 881,
      "comment": "\n     * Tests remove on list iterator is correct.\n     ",
      "child_ranges": [
        "(line 858,col 9)-(line 860,col 9)",
        "(line 861,col 9)-(line 861,col 20)",
        "(line 862,col 9)-(line 864,col 9)",
        "(line 865,col 9)-(line 865,col 66)",
        "(line 866,col 9)-(line 866,col 33)",
        "(line 867,col 9)-(line 867,col 32)",
        "(line 868,col 9)-(line 868,col 32)",
        "(line 869,col 9)-(line 869,col 51)",
        "(line 870,col 9)-(line 870,col 50)",
        "(line 871,col 9)-(line 871,col 50)",
        "(line 872,col 9)-(line 872,col 47)",
        "(line 874,col 9)-(line 874,col 20)",
        "(line 875,col 9)-(line 875,col 51)",
        "(line 876,col 9)-(line 876,col 50)",
        "(line 877,col 9)-(line 877,col 35)",
        "(line 878,col 9)-(line 878,col 36)",
        "(line 879,col 9)-(line 879,col 63)",
        "(line 880,col 9)-(line 880,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.testListListIteratorNextRemovePrevious()",
      "begin_line": 886,
      "end_line": 909,
      "comment": "\n     * Tests remove on list iterator is correct.\n     ",
      "child_ranges": [
        "(line 887,col 9)-(line 889,col 9)",
        "(line 890,col 9)-(line 890,col 20)",
        "(line 891,col 9)-(line 893,col 9)",
        "(line 894,col 9)-(line 894,col 66)",
        "(line 895,col 9)-(line 895,col 33)",
        "(line 896,col 9)-(line 896,col 32)",
        "(line 897,col 9)-(line 897,col 32)",
        "(line 898,col 9)-(line 898,col 51)",
        "(line 899,col 9)-(line 899,col 50)",
        "(line 900,col 9)-(line 900,col 50)",
        "(line 902,col 9)-(line 902,col 20)",
        "(line 903,col 9)-(line 903,col 51)",
        "(line 904,col 9)-(line 904,col 50)",
        "(line 905,col 9)-(line 905,col 37)",
        "(line 906,col 9)-(line 906,col 32)",
        "(line 907,col 9)-(line 907,col 41)",
        "(line 908,col 9)-(line 908,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.forwardTest(java.util.ListIterator\u003cE\u003e, int)",
      "begin_line": 918,
      "end_line": 943,
      "comment": "\n     *  Traverses to the end of the given iterator.\n     *\n     *  @param iter  the iterator to traverse\n     *  @param i     the starting index\n     ",
      "child_ranges": [
        "(line 919,col 9)-(line 919,col 45)",
        "(line 920,col 9)-(line 920,col 49)",
        "(line 922,col 9)-(line 931,col 9)",
        "(line 933,col 9)-(line 933,col 68)",
        "(line 934,col 9)-(line 934,col 72)",
        "(line 935,col 9)-(line 935,col 88)",
        "(line 937,col 9)-(line 942,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.backwardTest(java.util.ListIterator\u003cE\u003e, int)",
      "begin_line": 951,
      "end_line": 980,
      "comment": "\n     *  Traverses to the beginning of the given iterator.\n     *\n     *  @param iter  the iterator to traverse\n     *  @param i     the starting index\n     ",
      "child_ranges": [
        "(line 952,col 9)-(line 952,col 45)",
        "(line 954,col 9)-(line 965,col 9)",
        "(line 967,col 9)-(line 967,col 76)",
        "(line 968,col 9)-(line 968,col 47)",
        "(line 969,col 9)-(line 969,col 60)",
        "(line 970,col 9)-(line 970,col 51)",
        "(line 971,col 9)-(line 971,col 66)",
        "(line 973,col 9)-(line 978,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.testListIteratorAdd()",
      "begin_line": 987,
      "end_line": 1016,
      "comment": "\n     *  Tests the {@link ListIterator#add(Object)} method of the list\n     *  iterator.\n     ",
      "child_ranges": [
        "(line 988,col 9)-(line 990,col 9)",
        "(line 992,col 9)-(line 992,col 21)",
        "(line 993,col 9)-(line 993,col 46)",
        "(line 994,col 9)-(line 994,col 45)",
        "(line 996,col 9)-(line 996,col 47)",
        "(line 997,col 9)-(line 997,col 53)",
        "(line 998,col 9)-(line 998,col 53)",
        "(line 1000,col 9)-(line 1004,col 9)",
        "(line 1006,col 9)-(line 1006,col 20)",
        "(line 1007,col 9)-(line 1007,col 47)",
        "(line 1008,col 9)-(line 1008,col 46)",
        "(line 1009,col 9)-(line 1015,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.testListIteratorSet()",
      "begin_line": 1022,
      "end_line": 1039,
      "comment": "\n     *  Tests the {@link ListIterator#set(Object)} method of the list\n     *  iterator.\n     ",
      "child_ranges": [
        "(line 1023,col 9)-(line 1025,col 9)",
        "(line 1027,col 9)-(line 1027,col 47)",
        "(line 1029,col 9)-(line 1029,col 20)",
        "(line 1030,col 9)-(line 1030,col 69)",
        "(line 1031,col 9)-(line 1031,col 68)",
        "(line 1032,col 9)-(line 1038,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.testEmptyListSerialization()",
      "begin_line": 1041,
      "end_line": 1053,
      "comment": "",
      "child_ranges": [
        "(line 1043,col 9)-(line 1043,col 42)",
        "(line 1044,col 9)-(line 1046,col 9)",
        "(line 1048,col 9)-(line 1048,col 76)",
        "(line 1049,col 9)-(line 1049,col 74)",
        "(line 1051,col 9)-(line 1051,col 61)",
        "(line 1052,col 9)-(line 1052,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.testFullListSerialization()",
      "begin_line": 1055,
      "end_line": 1068,
      "comment": "",
      "child_ranges": [
        "(line 1057,col 9)-(line 1057,col 50)",
        "(line 1058,col 9)-(line 1058,col 50)",
        "(line 1059,col 9)-(line 1061,col 9)",
        "(line 1063,col 9)-(line 1063,col 76)",
        "(line 1064,col 9)-(line 1064,col 74)",
        "(line 1066,col 9)-(line 1066,col 68)",
        "(line 1067,col 9)-(line 1067,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.testEmptyListCompatibility()",
      "begin_line": 1074,
      "end_line": 1092,
      "comment": "\n     * Compare the current serialized form of the List\n     * against the canonical version in SVN.\n     ",
      "child_ranges": [
        "(line 1085,col 9)-(line 1085,col 42)",
        "(line 1086,col 9)-(line 1091,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.testFullListCompatibility()",
      "begin_line": 1098,
      "end_line": 1119,
      "comment": "\n     * Compare the current serialized form of the List\n     * against the canonical version in SVN.\n     ",
      "child_ranges": [
        "(line 1109,col 9)-(line 1109,col 50)",
        "(line 1110,col 9)-(line 1118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.bulkTestSubList()",
      "begin_line": 1132,
      "end_line": 1137,
      "comment": "\n     *  Returns a {@link BulkTest} for testing {@link List#subList(int,int)}.\n     *  The returned bulk test will run through every \u003ccode\u003eTestList\u003c/code\u003e\n     *  method, \u003ci\u003eincluding\u003c/i\u003e another \u003ccode\u003ebulkTestSubList\u003c/code\u003e.\n     *  Sublists are tested until the size of the sublist is less than 10.\n     *  Each sublist is 6 elements smaller than its parent list.\n     *  (By default this means that two rounds of sublists will be tested).\n     *  The verify() method is overloaded to test that the original list is\n     *  modified when the sublist is.\n     ",
      "child_ranges": [
        "(line 1133,col 9)-(line 1135,col 9)",
        "(line 1136,col 9)-(line 1136,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BulkTestSubList",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.list.AbstractListTest\u003cE\u003e"
      ],
      "begin_line": 1139,
      "end_line": 1211,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outer"
      ],
      "begin_line": 1141,
      "end_line": 1141,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.BulkTestSubList.BulkTestSubList(org.apache.commons.collections4.list.AbstractListTest\u003cE\u003e)",
      "begin_line": 1143,
      "end_line": 1146,
      "comment": "",
      "child_ranges": [
        "(line 1144,col 12)-(line 1144,col 21)",
        "(line 1145,col 12)-(line 1145,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.BulkTestSubList.getFullElements()",
      "begin_line": 1148,
      "end_line": 1153,
      "comment": "",
      "child_ranges": [
        "(line 1151,col 12)-(line 1151,col 68)",
        "(line 1152,col 12)-(line 1152,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.BulkTestSubList.getOtherElements()",
      "begin_line": 1155,
      "end_line": 1158,
      "comment": "",
      "child_ranges": [
        "(line 1157,col 12)-(line 1157,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.BulkTestSubList.isAddSupported()",
      "begin_line": 1160,
      "end_line": 1163,
      "comment": "",
      "child_ranges": [
        "(line 1162,col 12)-(line 1162,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.BulkTestSubList.isSetSupported()",
      "begin_line": 1165,
      "end_line": 1168,
      "comment": "",
      "child_ranges": [
        "(line 1167,col 12)-(line 1167,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.BulkTestSubList.isRemoveSupported()",
      "begin_line": 1170,
      "end_line": 1173,
      "comment": "",
      "child_ranges": [
        "(line 1172,col 12)-(line 1172,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.BulkTestSubList.makeObject()",
      "begin_line": 1175,
      "end_line": 1178,
      "comment": "",
      "child_ranges": [
        "(line 1177,col 12)-(line 1177,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.BulkTestSubList.makeFullCollection()",
      "begin_line": 1180,
      "end_line": 1184,
      "comment": "",
      "child_ranges": [
        "(line 1182,col 12)-(line 1182,col 53)",
        "(line 1183,col 12)-(line 1183,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.BulkTestSubList.resetEmpty()",
      "begin_line": 1186,
      "end_line": 1191,
      "comment": "",
      "child_ranges": [
        "(line 1188,col 12)-(line 1188,col 29)",
        "(line 1189,col 12)-(line 1189,col 67)",
        "(line 1190,col 12)-(line 1190,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.BulkTestSubList.resetFull()",
      "begin_line": 1193,
      "end_line": 1199,
      "comment": "",
      "child_ranges": [
        "(line 1195,col 12)-(line 1195,col 29)",
        "(line 1196,col 12)-(line 1196,col 56)",
        "(line 1197,col 12)-(line 1197,col 74)",
        "(line 1198,col 12)-(line 1198,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.BulkTestSubList.verify()",
      "begin_line": 1201,
      "end_line": 1205,
      "comment": "",
      "child_ranges": [
        "(line 1203,col 12)-(line 1203,col 26)",
        "(line 1204,col 12)-(line 1204,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.BulkTestSubList.isTestSerialization()",
      "begin_line": 1207,
      "end_line": 1210,
      "comment": "",
      "child_ranges": [
        "(line 1209,col 12)-(line 1209,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.testListSubListFailFastOnAdd()",
      "begin_line": 1217,
      "end_line": 1245,
      "comment": "\n    *  Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}\n    *  if elements are added to the original list.\n    ",
      "child_ranges": [
        "(line 1218,col 8)-(line 1220,col 5)",
        "(line 1221,col 8)-(line 1223,col 5)",
        "(line 1225,col 8)-(line 1225,col 19)",
        "(line 1226,col 8)-(line 1226,col 47)",
        "(line 1227,col 8)-(line 1227,col 54)",
        "(line 1228,col 8)-(line 1228,col 50)",
        "(line 1229,col 8)-(line 1229,col 24)",
        "(line 1231,col 8)-(line 1231,col 19)",
        "(line 1232,col 8)-(line 1232,col 46)",
        "(line 1233,col 8)-(line 1233,col 53)",
        "(line 1234,col 8)-(line 1234,col 24)",
        "(line 1236,col 8)-(line 1236,col 19)",
        "(line 1237,col 8)-(line 1237,col 46)",
        "(line 1238,col 8)-(line 1238,col 65)",
        "(line 1239,col 8)-(line 1239,col 24)",
        "(line 1241,col 8)-(line 1241,col 19)",
        "(line 1242,col 8)-(line 1242,col 46)",
        "(line 1243,col 8)-(line 1243,col 68)",
        "(line 1244,col 8)-(line 1244,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.testListSubListFailFastOnRemove()",
      "begin_line": 1251,
      "end_line": 1284,
      "comment": "\n    *  Tests that a sublist raises a {@link java.util.ConcurrentModificationException ConcurrentModificationException}\n    *  if elements are removed from the original list.\n    ",
      "child_ranges": [
        "(line 1252,col 8)-(line 1254,col 5)",
        "(line 1255,col 8)-(line 1257,col 5)",
        "(line 1259,col 8)-(line 1259,col 19)",
        "(line 1260,col 8)-(line 1260,col 47)",
        "(line 1261,col 8)-(line 1261,col 54)",
        "(line 1262,col 8)-(line 1262,col 33)",
        "(line 1263,col 8)-(line 1263,col 24)",
        "(line 1265,col 8)-(line 1265,col 19)",
        "(line 1266,col 8)-(line 1266,col 46)",
        "(line 1267,col 8)-(line 1267,col 52)",
        "(line 1268,col 8)-(line 1268,col 24)",
        "(line 1270,col 8)-(line 1270,col 19)",
        "(line 1271,col 8)-(line 1271,col 46)",
        "(line 1272,col 8)-(line 1272,col 67)",
        "(line 1273,col 8)-(line 1273,col 24)",
        "(line 1275,col 8)-(line 1275,col 19)",
        "(line 1276,col 8)-(line 1276,col 46)",
        "(line 1277,col 8)-(line 1277,col 68)",
        "(line 1278,col 8)-(line 1278,col 24)",
        "(line 1280,col 8)-(line 1280,col 19)",
        "(line 1281,col 8)-(line 1281,col 46)",
        "(line 1282,col 8)-(line 1282,col 31)",
        "(line 1283,col 8)-(line 1283,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.failFastAll(java.util.List\u003cE\u003e)",
      "begin_line": 1290,
      "end_line": 1295,
      "comment": "\n    *  Invokes all the methods on the given sublist to make sure they raise\n    *  a {@link java.util.ConcurrentModificationException ConcurrentModificationException}.\n    ",
      "child_ranges": [
        "(line 1291,col 8)-(line 1291,col 56)",
        "(line 1292,col 8)-(line 1294,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.failFastMethod(java.util.List\u003cE\u003e, java.lang.reflect.Method)",
      "begin_line": 1309,
      "end_line": 1345,
      "comment": "\n    *  Invokes the given method on the given sublist to make sure it raises\n    *  a {@link java.util.ConcurrentModificationException ConcurrentModificationException}.\n    *\n    *  Unless the method happens to be the equals() method, in which case\n    *  the test is skipped.  There seems to be a bug in\n    *  java.util.AbstractList.subList(int,int).equals(Object) -- it never\n    *  raises a ConcurrentModificationException.\n    *\n    *  @param list  the sublist to test\n    *  @param m     the method to invoke\n    ",
      "child_ranges": [
        "(line 1310,col 8)-(line 1312,col 5)",
        "(line 1314,col 8)-(line 1314,col 47)",
        "(line 1315,col 8)-(line 1315,col 62)",
        "(line 1317,col 8)-(line 1317,col 54)",
        "(line 1318,col 8)-(line 1318,col 56)",
        "(line 1319,col 8)-(line 1329,col 8)",
        "(line 1331,col 8)-(line 1344,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.bulkTestListIterator()",
      "begin_line": 1348,
      "end_line": 1350,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 1349,col 8)-(line 1349,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestListIterator",
      "is_interface": false,
      "parent_types": [
        "AbstractListIteratorTest\u003cE\u003e"
      ],
      "begin_line": 1352,
      "end_line": 1388,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.TestListIterator.TestListIterator()",
      "begin_line": 1353,
      "end_line": 1355,
      "comment": "",
      "child_ranges": [
        "(line 1354,col 12)-(line 1354,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.TestListIterator.addSetValue()",
      "begin_line": 1357,
      "end_line": 1360,
      "comment": "",
      "child_ranges": [
        "(line 1359,col 12)-(line 1359,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.TestListIterator.supportsRemove()",
      "begin_line": 1362,
      "end_line": 1365,
      "comment": "",
      "child_ranges": [
        "(line 1364,col 12)-(line 1364,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.TestListIterator.supportsAdd()",
      "begin_line": 1367,
      "end_line": 1370,
      "comment": "",
      "child_ranges": [
        "(line 1369,col 12)-(line 1369,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.TestListIterator.supportsSet()",
      "begin_line": 1372,
      "end_line": 1375,
      "comment": "",
      "child_ranges": [
        "(line 1374,col 12)-(line 1374,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.TestListIterator.makeEmptyIterator()",
      "begin_line": 1377,
      "end_line": 1381,
      "comment": "",
      "child_ranges": [
        "(line 1379,col 12)-(line 1379,col 24)",
        "(line 1380,col 12)-(line 1380,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.list.AbstractListTest.TestListIterator.makeObject()",
      "begin_line": 1383,
      "end_line": 1387,
      "comment": "",
      "child_ranges": [
        "(line 1385,col 12)-(line 1385,col 23)",
        "(line 1386,col 12)-(line 1386,col 71)"
      ]
    }
  ]
}