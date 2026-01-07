{
  "filepath": "/tmp/Math-30b/src/test/java/org/apache/commons/math3/linear/RealVectorAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealVectorAbstractTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 60,
      "end_line": 1710,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.create(double[])",
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * Creates a new instance of {@link RealVector}, with specified entries.\n     * The returned vector must be of the type currently tested. It should be\n     * noted that some tests assume that no references to the specified\n     * {@code double[]} are kept in the returned object: if necessary, defensive\n     * copy of this array should be made.\n     *\n     * @param data the entries of the vector to be created\n     * @return a new {@link RealVector} of the type to be tested\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.createAlien(double[])",
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * Creates a new instance of {@link RealVector}, with specified entries.\n     * The type of the returned vector must be different from the type currently\n     * tested. It should be noted that some tests assume that no references to\n     * the specified {@code double[]} are kept in the returned object: if\n     * necessary, defensive copy of this array should be made.\n     *\n     * @param data the entries of the vector to be created\n     * @return a new {@link RealVector} of an alien type\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.getPreferredEntryValue()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Returns a preferred value of the entries, to be tested specifically. Some\n     * implementations of {@link RealVector} (e.g. {@link OpenMapRealVector}) do\n     * not store specific values of entries. In order to ensure that all tests\n     * take into account this specific value, some entries of the vectors to be\n     * tested are deliberately set to the value returned by the present method.\n     * The default implementation returns {@code 0.0}.\n     *\n     * @return a value which \u003cem\u003eshould\u003c/em\u003e be present in all vectors to be\n     * tested\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.assertClose(java.lang.String, double[], double[], double)",
      "begin_line": 101,
      "end_line": 109,
      "comment": " verifies that two vectors are close (sup norm) ",
      "child_ranges": [
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 108,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ma1"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec1"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec2"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec3"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec4"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec5"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec_null"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dvec1"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mat1"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data1"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": "\n     * Data which can be used to create a specific vector. The array is\n     * interspersed with the value returned by\n     * {@link #getPreferredEntryValue()}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "data2"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": "\n     * Data which can be used to create a specific vector. The array is\n     * interspersed with the value returned by\n     * {@link #getPreferredEntryValue()}.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.RealVectorAbstractTest()",
      "begin_line": 136,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 50)",
        "(line 138,col 9)-(line 138,col 47)",
        "(line 139,col 9)-(line 139,col 50)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "entryTolerance"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": " tolerances"
    },
    {
      "type": "field",
      "varNames": [
        "normTolerance"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetDimension()",
      "begin_line": 146,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetEntry()",
      "begin_line": 151,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 43)",
        "(line 154,col 9)-(line 156,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetEntryInvalidIndex1()",
      "begin_line": 159,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetEntryInvalidIndex2()",
      "begin_line": 164,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testSetEntry()",
      "begin_line": 169,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 59)",
        "(line 172,col 9)-(line 172,col 48)",
        "(line 177,col 9)-(line 186,col 9)",
        "(line 191,col 9)-(line 191,col 50)",
        "(line 192,col 9)-(line 201,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testSetEntryInvalidIndex1()",
      "begin_line": 204,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testSetEntryInvalidIndex2()",
      "begin_line": 209,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testAddToEntry()",
      "begin_line": 214,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 59)",
        "(line 217,col 9)-(line 217,col 48)",
        "(line 222,col 9)-(line 222,col 30)",
        "(line 223,col 9)-(line 231,col 9)",
        "(line 236,col 9)-(line 236,col 50)",
        "(line 237,col 9)-(line 246,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testAddToEntryInvalidIndex1()",
      "begin_line": 249,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testAddToEntryInvalidIndex2()",
      "begin_line": 254,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.doTestAppendVector(java.lang.String, org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.RealVector, double)",
      "begin_line": 259,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 41)",
        "(line 263,col 9)-(line 263,col 41)",
        "(line 264,col 9)-(line 264,col 43)",
        "(line 265,col 9)-(line 265,col 64)",
        "(line 266,col 9)-(line 269,col 9)",
        "(line 270,col 9)-(line 273,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testAppendVector()",
      "begin_line": 276,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 74)",
        "(line 279,col 9)-(line 279,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.doTestAppendScalar(java.lang.String, org.apache.commons.math3.linear.RealVector, double, double)",
      "begin_line": 282,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 39)",
        "(line 286,col 9)-(line 286,col 41)",
        "(line 287,col 9)-(line 287,col 62)",
        "(line 288,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 292,col 53)",
        "(line 293,col 9)-(line 293,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testAppendScalar()",
      "begin_line": 296,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 54)",
        "(line 300,col 9)-(line 300,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetSubVector()",
      "begin_line": 303,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 50)",
        "(line 306,col 9)-(line 306,col 83)",
        "(line 307,col 9)-(line 307,col 28)",
        "(line 308,col 9)-(line 308,col 38)",
        "(line 309,col 9)-(line 309,col 70)",
        "(line 310,col 9)-(line 310,col 48)",
        "(line 311,col 9)-(line 311,col 54)",
        "(line 312,col 9)-(line 312,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetSubVectorInvalidIndex1()",
      "begin_line": 315,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 25)",
        "(line 318,col 9)-(line 318,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetSubVectorInvalidIndex2()",
      "begin_line": 321,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 25)",
        "(line 324,col 9)-(line 324,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetSubVectorInvalidIndex3()",
      "begin_line": 327,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 25)",
        "(line 330,col 9)-(line 330,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetSubVectorInvalidIndex4()",
      "begin_line": 333,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 25)",
        "(line 336,col 9)-(line 336,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testDataInOut()",
      "begin_line": 339,
      "end_line": 394,
      "comment": "",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 43)",
        "(line 342,col 9)-(line 342,col 43)",
        "(line 343,col 9)-(line 343,col 43)",
        "(line 344,col 9)-(line 344,col 50)",
        "(line 346,col 9)-(line 346,col 44)",
        "(line 347,col 9)-(line 347,col 33)",
        "(line 348,col 9)-(line 348,col 78)",
        "(line 349,col 9)-(line 354,col 9)",
        "(line 356,col 9)-(line 356,col 44)",
        "(line 357,col 9)-(line 357,col 35)",
        "(line 358,col 9)-(line 358,col 76)",
        "(line 359,col 9)-(line 359,col 76)",
        "(line 360,col 9)-(line 365,col 9)",
        "(line 367,col 9)-(line 367,col 44)",
        "(line 368,col 9)-(line 368,col 25)",
        "(line 369,col 9)-(line 369,col 78)",
        "(line 371,col 9)-(line 376,col 9)",
        "(line 378,col 9)-(line 378,col 44)",
        "(line 379,col 9)-(line 379,col 37)",
        "(line 380,col 9)-(line 380,col 76)",
        "(line 381,col 9)-(line 381,col 76)",
        "(line 382,col 9)-(line 387,col 9)",
        "(line 389,col 9)-(line 389,col 44)",
        "(line 390,col 9)-(line 390,col 46)",
        "(line 391,col 9)-(line 391,col 46)",
        "(line 392,col 9)-(line 392,col 34)",
        "(line 393,col 9)-(line 393,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testMapFunctions()",
      "begin_line": 396,
      "end_line": 723,
      "comment": "",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 43)",
        "(line 401,col 9)-(line 401,col 46)",
        "(line 402,col 9)-(line 402,col 46)",
        "(line 403,col 9)-(line 403,col 87)",
        "(line 406,col 9)-(line 406,col 46)",
        "(line 407,col 9)-(line 407,col 42)",
        "(line 408,col 9)-(line 408,col 52)",
        "(line 409,col 9)-(line 409,col 99)",
        "(line 412,col 9)-(line 412,col 56)",
        "(line 413,col 9)-(line 413,col 52)",
        "(line 414,col 9)-(line 414,col 97)",
        "(line 417,col 9)-(line 417,col 51)",
        "(line 418,col 9)-(line 418,col 52)",
        "(line 419,col 9)-(line 419,col 58)",
        "(line 420,col 9)-(line 420,col 109)",
        "(line 423,col 9)-(line 423,col 56)",
        "(line 424,col 9)-(line 424,col 51)",
        "(line 425,col 9)-(line 425,col 97)",
        "(line 428,col 9)-(line 428,col 51)",
        "(line 429,col 9)-(line 429,col 52)",
        "(line 430,col 9)-(line 430,col 57)",
        "(line 431,col 9)-(line 431,col 109)",
        "(line 434,col 9)-(line 434,col 52)",
        "(line 435,col 9)-(line 435,col 52)",
        "(line 436,col 9)-(line 436,col 93)",
        "(line 439,col 9)-(line 439,col 49)",
        "(line 440,col 9)-(line 440,col 48)",
        "(line 441,col 9)-(line 441,col 58)",
        "(line 442,col 9)-(line 442,col 105)",
        "(line 446,col 9)-(line 446,col 51)",
        "(line 447,col 9)-(line 447,col 46)",
        "(line 448,col 9)-(line 448,col 87)",
        "(line 451,col 9)-(line 451,col 46)",
        "(line 452,col 9)-(line 452,col 47)",
        "(line 453,col 9)-(line 453,col 52)",
        "(line 454,col 9)-(line 454,col 99)",
        "(line 457,col 9)-(line 457,col 48)",
        "(line 458,col 9)-(line 458,col 105)",
        "(line 459,col 9)-(line 459,col 87)",
        "(line 462,col 9)-(line 462,col 46)",
        "(line 463,col 9)-(line 463,col 44)",
        "(line 464,col 9)-(line 464,col 111)",
        "(line 465,col 9)-(line 465,col 99)",
        "(line 469,col 9)-(line 469,col 52)",
        "(line 470,col 9)-(line 470,col 95)",
        "(line 471,col 9)-(line 471,col 91)",
        "(line 474,col 9)-(line 474,col 48)",
        "(line 475,col 9)-(line 475,col 48)",
        "(line 476,col 9)-(line 476,col 101)",
        "(line 477,col 9)-(line 477,col 103)",
        "(line 480,col 9)-(line 480,col 48)",
        "(line 481,col 9)-(line 481,col 85)",
        "(line 482,col 9)-(line 482,col 87)",
        "(line 485,col 9)-(line 485,col 46)",
        "(line 486,col 9)-(line 486,col 44)",
        "(line 487,col 9)-(line 487,col 91)",
        "(line 488,col 9)-(line 488,col 99)",
        "(line 491,col 9)-(line 491,col 52)",
        "(line 492,col 9)-(line 492,col 87)",
        "(line 493,col 9)-(line 493,col 91)",
        "(line 496,col 9)-(line 496,col 48)",
        "(line 497,col 9)-(line 497,col 48)",
        "(line 498,col 9)-(line 498,col 93)",
        "(line 499,col 9)-(line 499,col 103)",
        "(line 502,col 9)-(line 502,col 52)",
        "(line 503,col 9)-(line 503,col 97)",
        "(line 504,col 9)-(line 504,col 91)",
        "(line 507,col 9)-(line 507,col 48)",
        "(line 508,col 9)-(line 508,col 48)",
        "(line 509,col 9)-(line 509,col 103)",
        "(line 510,col 9)-(line 510,col 103)",
        "(line 513,col 9)-(line 513,col 50)",
        "(line 514,col 9)-(line 514,col 106)",
        "(line 515,col 9)-(line 515,col 89)",
        "(line 518,col 9)-(line 518,col 47)",
        "(line 519,col 9)-(line 519,col 46)",
        "(line 520,col 9)-(line 520,col 112)",
        "(line 521,col 9)-(line 521,col 101)",
        "(line 524,col 9)-(line 524,col 50)",
        "(line 525,col 9)-(line 525,col 106)",
        "(line 526,col 9)-(line 526,col 89)",
        "(line 529,col 9)-(line 529,col 47)",
        "(line 530,col 9)-(line 530,col 46)",
        "(line 531,col 9)-(line 531,col 112)",
        "(line 532,col 9)-(line 532,col 101)",
        "(line 535,col 9)-(line 535,col 50)",
        "(line 536,col 9)-(line 536,col 105)",
        "(line 537,col 9)-(line 537,col 89)",
        "(line 540,col 9)-(line 540,col 47)",
        "(line 541,col 9)-(line 541,col 46)",
        "(line 542,col 9)-(line 542,col 111)",
        "(line 543,col 9)-(line 543,col 101)",
        "(line 546,col 9)-(line 546,col 48)",
        "(line 547,col 9)-(line 547,col 107)",
        "(line 548,col 9)-(line 548,col 87)",
        "(line 551,col 9)-(line 551,col 46)",
        "(line 552,col 9)-(line 552,col 44)",
        "(line 553,col 9)-(line 553,col 113)",
        "(line 554,col 9)-(line 554,col 99)",
        "(line 557,col 9)-(line 557,col 48)",
        "(line 558,col 9)-(line 558,col 104)",
        "(line 559,col 9)-(line 559,col 87)",
        "(line 562,col 9)-(line 562,col 46)",
        "(line 563,col 9)-(line 563,col 44)",
        "(line 564,col 9)-(line 564,col 110)",
        "(line 565,col 9)-(line 565,col 99)",
        "(line 568,col 9)-(line 568,col 48)",
        "(line 569,col 9)-(line 569,col 106)",
        "(line 570,col 9)-(line 570,col 87)",
        "(line 573,col 9)-(line 573,col 46)",
        "(line 574,col 9)-(line 574,col 44)",
        "(line 575,col 9)-(line 575,col 112)",
        "(line 576,col 9)-(line 576,col 99)",
        "(line 578,col 9)-(line 578,col 42)",
        "(line 579,col 9)-(line 579,col 45)",
        "(line 582,col 9)-(line 582,col 51)",
        "(line 583,col 9)-(line 583,col 88)",
        "(line 584,col 9)-(line 584,col 89)",
        "(line 587,col 9)-(line 587,col 48)",
        "(line 588,col 9)-(line 588,col 46)",
        "(line 589,col 9)-(line 589,col 94)",
        "(line 590,col 9)-(line 590,col 101)",
        "(line 593,col 9)-(line 593,col 51)",
        "(line 594,col 9)-(line 594,col 87)",
        "(line 595,col 9)-(line 595,col 89)",
        "(line 598,col 9)-(line 598,col 48)",
        "(line 599,col 9)-(line 599,col 46)",
        "(line 600,col 9)-(line 600,col 93)",
        "(line 601,col 9)-(line 601,col 101)",
        "(line 604,col 9)-(line 604,col 51)",
        "(line 605,col 9)-(line 605,col 87)",
        "(line 606,col 9)-(line 606,col 89)",
        "(line 609,col 9)-(line 609,col 48)",
        "(line 610,col 9)-(line 610,col 46)",
        "(line 611,col 9)-(line 611,col 93)",
        "(line 612,col 9)-(line 612,col 101)",
        "(line 615,col 9)-(line 615,col 52)",
        "(line 616,col 9)-(line 616,col 66)",
        "(line 617,col 9)-(line 617,col 87)",
        "(line 620,col 9)-(line 620,col 46)",
        "(line 621,col 9)-(line 621,col 48)",
        "(line 622,col 9)-(line 622,col 72)",
        "(line 623,col 9)-(line 623,col 99)",
        "(line 625,col 9)-(line 625,col 45)",
        "(line 626,col 9)-(line 626,col 47)",
        "(line 629,col 9)-(line 629,col 51)",
        "(line 630,col 9)-(line 630,col 44)",
        "(line 631,col 9)-(line 631,col 87)",
        "(line 634,col 9)-(line 634,col 49)",
        "(line 635,col 9)-(line 635,col 44)",
        "(line 636,col 9)-(line 636,col 50)",
        "(line 637,col 9)-(line 637,col 99)",
        "(line 640,col 9)-(line 640,col 50)",
        "(line 641,col 9)-(line 641,col 85)",
        "(line 642,col 9)-(line 642,col 89)",
        "(line 645,col 9)-(line 645,col 47)",
        "(line 646,col 9)-(line 646,col 46)",
        "(line 647,col 9)-(line 647,col 91)",
        "(line 648,col 9)-(line 648,col 101)",
        "(line 650,col 9)-(line 650,col 46)",
        "(line 651,col 9)-(line 651,col 49)",
        "(line 654,col 9)-(line 654,col 54)",
        "(line 655,col 9)-(line 655,col 80)",
        "(line 656,col 9)-(line 656,col 89)",
        "(line 659,col 9)-(line 659,col 51)",
        "(line 660,col 9)-(line 660,col 46)",
        "(line 661,col 9)-(line 661,col 87)",
        "(line 662,col 9)-(line 662,col 101)",
        "(line 664,col 9)-(line 664,col 46)",
        "(line 665,col 9)-(line 665,col 61)",
        "(line 668,col 9)-(line 668,col 54)",
        "(line 669,col 9)-(line 669,col 46)",
        "(line 670,col 9)-(line 670,col 89)",
        "(line 673,col 9)-(line 673,col 51)",
        "(line 674,col 9)-(line 674,col 46)",
        "(line 675,col 9)-(line 675,col 53)",
        "(line 676,col 9)-(line 676,col 101)",
        "(line 679,col 9)-(line 679,col 56)",
        "(line 680,col 9)-(line 680,col 47)",
        "(line 681,col 9)-(line 681,col 91)",
        "(line 684,col 9)-(line 684,col 52)",
        "(line 685,col 9)-(line 685,col 48)",
        "(line 686,col 9)-(line 686,col 54)",
        "(line 687,col 9)-(line 687,col 103)",
        "(line 690,col 9)-(line 690,col 54)",
        "(line 691,col 9)-(line 691,col 46)",
        "(line 692,col 9)-(line 692,col 89)",
        "(line 695,col 9)-(line 695,col 51)",
        "(line 696,col 9)-(line 696,col 46)",
        "(line 697,col 9)-(line 697,col 53)",
        "(line 698,col 9)-(line 698,col 101)",
        "(line 701,col 9)-(line 701,col 58)",
        "(line 702,col 9)-(line 702,col 48)",
        "(line 703,col 9)-(line 703,col 93)",
        "(line 706,col 9)-(line 706,col 53)",
        "(line 707,col 9)-(line 707,col 50)",
        "(line 708,col 9)-(line 708,col 55)",
        "(line 709,col 9)-(line 709,col 105)",
        "(line 714,col 9)-(line 714,col 52)",
        "(line 715,col 9)-(line 715,col 105)",
        "(line 716,col 9)-(line 716,col 87)",
        "(line 719,col 9)-(line 719,col 50)",
        "(line 720,col 9)-(line 720,col 44)",
        "(line 721,col 9)-(line 721,col 111)",
        "(line 722,col 9)-(line 722,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testBasicFunctions()",
      "begin_line": 725,
      "end_line": 882,
      "comment": "",
      "child_ranges": [
        "(line 727,col 9)-(line 727,col 43)",
        "(line 728,col 9)-(line 728,col 43)",
        "(line 729,col 9)-(line 729,col 43)",
        "(line 730,col 9)-(line 730,col 51)",
        "(line 732,col 9)-(line 732,col 50)",
        "(line 735,col 9)-(line 735,col 40)",
        "(line 736,col 9)-(line 737,col 54)",
        "(line 740,col 9)-(line 740,col 44)",
        "(line 741,col 9)-(line 742,col 43)",
        "(line 745,col 9)-(line 745,col 48)",
        "(line 746,col 9)-(line 747,col 43)",
        "(line 750,col 9)-(line 750,col 41)",
        "(line 751,col 9)-(line 752,col 49)",
        "(line 755,col 9)-(line 755,col 45)",
        "(line 756,col 9)-(line 757,col 51)",
        "(line 760,col 9)-(line 760,col 54)",
        "(line 761,col 9)-(line 762,col 43)",
        "(line 764,col 9)-(line 764,col 58)",
        "(line 765,col 9)-(line 766,col 43)",
        "(line 769,col 9)-(line 769,col 58)",
        "(line 770,col 9)-(line 771,col 43)",
        "(line 773,col 9)-(line 773,col 62)",
        "(line 774,col 9)-(line 775,col 43)",
        "(line 778,col 9)-(line 778,col 44)",
        "(line 779,col 9)-(line 781,col 10)",
        "(line 782,col 9)-(line 782,col 80)",
        "(line 784,col 9)-(line 784,col 49)",
        "(line 785,col 9)-(line 785,col 41)",
        "(line 786,col 9)-(line 788,col 10)",
        "(line 789,col 9)-(line 790,col 35)",
        "(line 793,col 9)-(line 793,col 54)",
        "(line 794,col 9)-(line 796,col 10)",
        "(line 797,col 9)-(line 798,col 35)",
        "(line 800,col 9)-(line 800,col 57)",
        "(line 801,col 9)-(line 803,col 10)",
        "(line 804,col 9)-(line 805,col 35)",
        "(line 808,col 9)-(line 808,col 60)",
        "(line 809,col 9)-(line 811,col 10)",
        "(line 812,col 9)-(line 813,col 55)",
        "(line 815,col 9)-(line 815,col 64)",
        "(line 816,col 9)-(line 818,col 10)",
        "(line 819,col 9)-(line 820,col 57)",
        "(line 823,col 9)-(line 823,col 56)",
        "(line 824,col 9)-(line 826,col 10)",
        "(line 827,col 9)-(line 828,col 35)",
        "(line 830,col 9)-(line 830,col 60)",
        "(line 831,col 9)-(line 833,col 10)",
        "(line 834,col 9)-(line 835,col 55)",
        "(line 838,col 9)-(line 838,col 39)",
        "(line 839,col 9)-(line 839,col 69)",
        "(line 842,col 9)-(line 842,col 43)",
        "(line 843,col 9)-(line 843,col 71)",
        "(line 845,col 9)-(line 845,col 56)",
        "(line 846,col 9)-(line 847,col 43)",
        "(line 849,col 9)-(line 849,col 60)",
        "(line 850,col 9)-(line 851,col 76)",
        "(line 853,col 9)-(line 853,col 50)",
        "(line 854,col 9)-(line 854,col 63)",
        "(line 855,col 9)-(line 856,col 61)",
        "(line 858,col 9)-(line 863,col 9)",
        "(line 865,col 9)-(line 865,col 41)",
        "(line 866,col 9)-(line 866,col 28)",
        "(line 867,col 9)-(line 867,col 96)",
        "(line 868,col 9)-(line 873,col 9)",
        "(line 875,col 9)-(line 875,col 52)",
        "(line 876,col 9)-(line 876,col 96)",
        "(line 877,col 9)-(line 877,col 94)",
        "(line 879,col 9)-(line 879,col 56)",
        "(line 880,col 9)-(line 880,col 98)",
        "(line 881,col 9)-(line 881,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testOuterProduct()",
      "begin_line": 884,
      "end_line": 898,
      "comment": "",
      "child_ranges": [
        "(line 886,col 9)-(line 886,col 61)",
        "(line 887,col 9)-(line 887,col 58)",
        "(line 889,col 9)-(line 889,col 48)",
        "(line 891,col 9)-(line 891,col 40)",
        "(line 892,col 9)-(line 892,col 55)",
        "(line 893,col 9)-(line 893,col 56)",
        "(line 894,col 9)-(line 894,col 55)",
        "(line 895,col 9)-(line 895,col 56)",
        "(line 896,col 9)-(line 896,col 57)",
        "(line 897,col 9)-(line 897,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testMisc()",
      "begin_line": 900,
      "end_line": 928,
      "comment": "",
      "child_ranges": [
        "(line 902,col 9)-(line 902,col 37)",
        "(line 903,col 9)-(line 903,col 37)",
        "(line 904,col 9)-(line 904,col 39)",
        "(line 906,col 9)-(line 906,col 36)",
        "(line 907,col 9)-(line 907,col 61)",
        "(line 908,col 9)-(line 913,col 9)",
        "(line 915,col 8)-(line 920,col 9)",
        "(line 922,col 9)-(line 927,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testPredicates()",
      "begin_line": 930,
      "end_line": 954,
      "comment": "",
      "child_ranges": [
        "(line 932,col 9)-(line 932,col 62)",
        "(line 934,col 9)-(line 934,col 38)",
        "(line 935,col 9)-(line 935,col 34)",
        "(line 936,col 9)-(line 936,col 37)",
        "(line 938,col 9)-(line 938,col 43)",
        "(line 939,col 9)-(line 939,col 48)",
        "(line 940,col 9)-(line 940,col 43)",
        "(line 941,col 9)-(line 941,col 25)",
        "(line 942,col 9)-(line 942,col 42)",
        "(line 944,col 9)-(line 944,col 25)",
        "(line 945,col 9)-(line 945,col 65)",
        "(line 946,col 9)-(line 946,col 83)",
        "(line 947,col 9)-(line 947,col 69)",
        "(line 949,col 9)-(line 949,col 39)",
        "(line 950,col 9)-(line 950,col 46)",
        "(line 951,col 9)-(line 951,col 43)",
        "(line 952,col 9)-(line 952,col 78)",
        "(line 953,col 9)-(line 953,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testSerial()",
      "begin_line": 956,
      "end_line": 960,
      "comment": "",
      "child_ranges": [
        "(line 958,col 9)-(line 958,col 56)",
        "(line 959,col 9)-(line 959,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testMinMax()",
      "begin_line": 962,
      "end_line": 984,
      "comment": "",
      "child_ranges": [
        "(line 964,col 9)-(line 964,col 69)",
        "(line 965,col 9)-(line 965,col 49)",
        "(line 966,col 9)-(line 966,col 59)",
        "(line 967,col 9)-(line 967,col 49)",
        "(line 968,col 9)-(line 968,col 59)",
        "(line 969,col 9)-(line 969,col 83)",
        "(line 970,col 9)-(line 970,col 49)",
        "(line 971,col 9)-(line 971,col 59)",
        "(line 972,col 9)-(line 972,col 49)",
        "(line 973,col 9)-(line 973,col 58)",
        "(line 974,col 9)-(line 974,col 76)",
        "(line 975,col 9)-(line 975,col 50)",
        "(line 976,col 9)-(line 976,col 58)",
        "(line 977,col 9)-(line 977,col 50)",
        "(line 978,col 9)-(line 978,col 58)",
        "(line 979,col 9)-(line 979,col 52)",
        "(line 980,col 9)-(line 980,col 50)",
        "(line 981,col 9)-(line 981,col 58)",
        "(line 982,col 9)-(line 982,col 50)",
        "(line 983,col 9)-(line 983,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCosine()",
      "begin_line": 986,
      "end_line": 1005,
      "comment": "",
      "child_ranges": [
        "(line 988,col 9)-(line 988,col 60)",
        "(line 990,col 9)-(line 990,col 48)",
        "(line 991,col 9)-(line 991,col 37)",
        "(line 992,col 9)-(line 992,col 78)",
        "(line 994,col 9)-(line 994,col 39)",
        "(line 995,col 9)-(line 995,col 26)",
        "(line 996,col 9)-(line 996,col 59)",
        "(line 998,col 9)-(line 998,col 39)",
        "(line 999,col 9)-(line 999,col 26)",
        "(line 1000,col 9)-(line 1000,col 47)",
        "(line 1002,col 9)-(line 1002,col 40)",
        "(line 1003,col 9)-(line 1003,col 26)",
        "(line 1004,col 9)-(line 1004,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCosinePrecondition1()",
      "begin_line": 1007,
      "end_line": 1012,
      "comment": "",
      "child_ranges": [
        "(line 1009,col 9)-(line 1009,col 60)",
        "(line 1010,col 9)-(line 1010,col 60)",
        "(line 1011,col 9)-(line 1011,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCosinePrecondition2()",
      "begin_line": 1014,
      "end_line": 1019,
      "comment": "",
      "child_ranges": [
        "(line 1016,col 9)-(line 1016,col 60)",
        "(line 1017,col 9)-(line 1017,col 60)",
        "(line 1018,col 9)-(line 1018,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCosinePrecondition3()",
      "begin_line": 1021,
      "end_line": 1026,
      "comment": "",
      "child_ranges": [
        "(line 1023,col 9)-(line 1023,col 60)",
        "(line 1024,col 9)-(line 1024,col 63)",
        "(line 1025,col 9)-(line 1025,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCombinePreconditionSameType()",
      "begin_line": 1028,
      "end_line": 1037,
      "comment": "",
      "child_ranges": [
        "(line 1030,col 9)-(line 1030,col 28)",
        "(line 1031,col 9)-(line 1031,col 28)",
        "(line 1032,col 9)-(line 1032,col 51)",
        "(line 1033,col 9)-(line 1033,col 41)",
        "(line 1034,col 9)-(line 1034,col 38)",
        "(line 1035,col 9)-(line 1035,col 41)",
        "(line 1036,col 9)-(line 1036,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCombineSameType()",
      "begin_line": 1039,
      "end_line": 1068,
      "comment": "",
      "child_ranges": [
        "(line 1041,col 9)-(line 1041,col 51)",
        "(line 1042,col 9)-(line 1042,col 27)",
        "(line 1043,col 9)-(line 1043,col 55)",
        "(line 1044,col 9)-(line 1044,col 55)",
        "(line 1045,col 9)-(line 1045,col 47)",
        "(line 1046,col 9)-(line 1046,col 47)",
        "(line 1047,col 9)-(line 1047,col 50)",
        "(line 1048,col 9)-(line 1052,col 9)",
        "(line 1053,col 9)-(line 1053,col 43)",
        "(line 1054,col 9)-(line 1054,col 43)",
        "(line 1055,col 9)-(line 1055,col 61)",
        "(line 1056,col 9)-(line 1067,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCombinePreconditionMixedType()",
      "begin_line": 1070,
      "end_line": 1079,
      "comment": "",
      "child_ranges": [
        "(line 1072,col 9)-(line 1072,col 28)",
        "(line 1073,col 9)-(line 1073,col 28)",
        "(line 1074,col 9)-(line 1074,col 51)",
        "(line 1075,col 9)-(line 1075,col 41)",
        "(line 1076,col 9)-(line 1076,col 38)",
        "(line 1077,col 9)-(line 1077,col 41)",
        "(line 1078,col 9)-(line 1078,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCombineMixedTypes()",
      "begin_line": 1081,
      "end_line": 1111,
      "comment": "",
      "child_ranges": [
        "(line 1083,col 9)-(line 1083,col 51)",
        "(line 1084,col 9)-(line 1084,col 27)",
        "(line 1085,col 9)-(line 1085,col 55)",
        "(line 1086,col 9)-(line 1086,col 55)",
        "(line 1087,col 9)-(line 1087,col 47)",
        "(line 1088,col 9)-(line 1088,col 47)",
        "(line 1089,col 9)-(line 1089,col 50)",
        "(line 1090,col 9)-(line 1094,col 9)",
        "(line 1095,col 9)-(line 1095,col 43)",
        "(line 1096,col 9)-(line 1096,col 48)",
        "(line 1098,col 9)-(line 1098,col 61)",
        "(line 1099,col 9)-(line 1110,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCombineToSelfPreconditionSameType()",
      "begin_line": 1113,
      "end_line": 1122,
      "comment": "",
      "child_ranges": [
        "(line 1115,col 9)-(line 1115,col 28)",
        "(line 1116,col 9)-(line 1116,col 28)",
        "(line 1117,col 9)-(line 1117,col 51)",
        "(line 1118,col 9)-(line 1118,col 41)",
        "(line 1119,col 9)-(line 1119,col 38)",
        "(line 1120,col 9)-(line 1120,col 41)",
        "(line 1121,col 9)-(line 1121,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCombineToSelfSameType()",
      "begin_line": 1124,
      "end_line": 1154,
      "comment": "",
      "child_ranges": [
        "(line 1126,col 9)-(line 1126,col 51)",
        "(line 1127,col 9)-(line 1127,col 27)",
        "(line 1128,col 9)-(line 1128,col 55)",
        "(line 1129,col 9)-(line 1129,col 55)",
        "(line 1130,col 9)-(line 1130,col 47)",
        "(line 1131,col 9)-(line 1131,col 47)",
        "(line 1132,col 9)-(line 1132,col 50)",
        "(line 1133,col 9)-(line 1137,col 9)",
        "(line 1138,col 9)-(line 1138,col 43)",
        "(line 1139,col 9)-(line 1139,col 43)",
        "(line 1140,col 9)-(line 1140,col 55)",
        "(line 1141,col 9)-(line 1141,col 44)",
        "(line 1142,col 9)-(line 1153,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCombineToSelfPreconditionMixedType()",
      "begin_line": 1156,
      "end_line": 1165,
      "comment": "",
      "child_ranges": [
        "(line 1158,col 9)-(line 1158,col 28)",
        "(line 1159,col 9)-(line 1159,col 28)",
        "(line 1160,col 9)-(line 1160,col 51)",
        "(line 1161,col 9)-(line 1161,col 41)",
        "(line 1162,col 9)-(line 1162,col 38)",
        "(line 1163,col 9)-(line 1163,col 46)",
        "(line 1164,col 9)-(line 1164,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCombineToSelfMixedTypes()",
      "begin_line": 1167,
      "end_line": 1197,
      "comment": "",
      "child_ranges": [
        "(line 1169,col 9)-(line 1169,col 51)",
        "(line 1170,col 9)-(line 1170,col 27)",
        "(line 1171,col 9)-(line 1171,col 55)",
        "(line 1172,col 9)-(line 1172,col 55)",
        "(line 1173,col 9)-(line 1173,col 47)",
        "(line 1174,col 9)-(line 1174,col 47)",
        "(line 1175,col 9)-(line 1175,col 50)",
        "(line 1176,col 9)-(line 1180,col 9)",
        "(line 1181,col 9)-(line 1181,col 43)",
        "(line 1182,col 9)-(line 1182,col 43)",
        "(line 1183,col 9)-(line 1183,col 55)",
        "(line 1184,col 9)-(line 1184,col 44)",
        "(line 1185,col 9)-(line 1196,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInDefaultOrderPreservingVisitor1()",
      "begin_line": 1204,
      "end_line": 1235,
      "comment": " The whole vector is visited. ",
      "child_ranges": [
        "(line 1206,col 9)-(line 1208,col 10)",
        "(line 1209,col 9)-(line 1209,col 42)",
        "(line 1210,col 9)-(line 1210,col 50)",
        "(line 1211,col 9)-(line 1233,col 10)",
        "(line 1234,col 9)-(line 1234,col 38)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "expectedIndex"
      ],
      "begin_line": 1213,
      "end_line": 1213,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-b6cd0ba7-8f72-4532-b5c6-505c08327b55.visit(int, double)",
      "begin_line": 1215,
      "end_line": 1220,
      "comment": "",
      "child_ranges": [
        "(line 1216,col 17)-(line 1216,col 64)",
        "(line 1217,col 17)-(line 1218,col 72)",
        "(line 1219,col 17)-(line 1219,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-0d5757d9-5d40-4c49-8756-a638ff9ccb5e.start(int, int, int)",
      "begin_line": 1222,
      "end_line": 1228,
      "comment": "",
      "child_ranges": [
        "(line 1224,col 17)-(line 1224,col 61)",
        "(line 1225,col 17)-(line 1225,col 52)",
        "(line 1226,col 17)-(line 1226,col 64)",
        "(line 1227,col 17)-(line 1227,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-d7e75e10-8ceb-425e-a9c2-a8b724fde5e4.end()",
      "begin_line": 1230,
      "end_line": 1232,
      "comment": "",
      "child_ranges": [
        "(line 1231,col 17)-(line 1231,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInDefaultOrderPreservingVisitor2()",
      "begin_line": 1238,
      "end_line": 1286,
      "comment": " Visiting an invalid subvector. ",
      "child_ranges": [
        "(line 1240,col 9)-(line 1240,col 51)",
        "(line 1241,col 9)-(line 1241,col 50)",
        "(line 1242,col 9)-(line 1255,col 10)",
        "(line 1256,col 9)-(line 1261,col 9)",
        "(line 1262,col 9)-(line 1267,col 9)",
        "(line 1268,col 9)-(line 1273,col 9)",
        "(line 1274,col 9)-(line 1279,col 9)",
        "(line 1280,col 9)-(line 1285,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-3302bac2-808a-4baa-8817-564827e8ec9e.visit(int, double)",
      "begin_line": 1244,
      "end_line": 1246,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-4fcf4ea8-e2f4-4613-98a1-a54956a1517f.start(int, int, int)",
      "begin_line": 1248,
      "end_line": 1250,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-f35adca8-5f8e-4a9e-a8a8-aebfebaf9bbd.end()",
      "begin_line": 1252,
      "end_line": 1254,
      "comment": "",
      "child_ranges": [
        "(line 1253,col 17)-(line 1253,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInDefaultOrderPreservingVisitor3()",
      "begin_line": 1289,
      "end_line": 1322,
      "comment": " Visiting a valid subvector. ",
      "child_ranges": [
        "(line 1291,col 9)-(line 1293,col 10)",
        "(line 1294,col 9)-(line 1294,col 36)",
        "(line 1295,col 9)-(line 1295,col 34)",
        "(line 1296,col 9)-(line 1296,col 42)",
        "(line 1297,col 9)-(line 1297,col 50)",
        "(line 1298,col 9)-(line 1320,col 10)",
        "(line 1321,col 9)-(line 1321,col 66)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "expectedIndex"
      ],
      "begin_line": 1300,
      "end_line": 1300,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-2492dfd9-6497-42f6-8696-b7baae406427.visit(int, double)",
      "begin_line": 1302,
      "end_line": 1307,
      "comment": "",
      "child_ranges": [
        "(line 1303,col 17)-(line 1303,col 64)",
        "(line 1304,col 17)-(line 1305,col 72)",
        "(line 1306,col 17)-(line 1306,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-4dbd1e9b-c0e5-4766-8fe0-d87b61623ce8.start(int, int, int)",
      "begin_line": 1309,
      "end_line": 1315,
      "comment": "",
      "child_ranges": [
        "(line 1311,col 17)-(line 1311,col 61)",
        "(line 1312,col 17)-(line 1312,col 64)",
        "(line 1313,col 17)-(line 1313,col 60)",
        "(line 1314,col 17)-(line 1314,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-50006f44-7389-4155-9d44-e8fd85747fbe.end()",
      "begin_line": 1317,
      "end_line": 1319,
      "comment": "",
      "child_ranges": [
        "(line 1318,col 17)-(line 1318,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInOptimizedOrderPreservingVisitor1()",
      "begin_line": 1325,
      "end_line": 1358,
      "comment": " The whole vector is visited. ",
      "child_ranges": [
        "(line 1327,col 9)-(line 1329,col 10)",
        "(line 1330,col 9)-(line 1330,col 42)",
        "(line 1331,col 9)-(line 1331,col 50)",
        "(line 1332,col 9)-(line 1356,col 10)",
        "(line 1357,col 9)-(line 1357,col 40)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "visited"
      ],
      "begin_line": 1333,
      "end_line": 1333,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-2081a68e-f76d-44fa-98d6-84055317a63b.visit(int, double)",
      "begin_line": 1335,
      "end_line": 1339,
      "comment": "",
      "child_ranges": [
        "(line 1336,col 17)-(line 1336,col 44)",
        "(line 1337,col 17)-(line 1338,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-6166927b-1a5b-482e-9f0b-e62ab14d797f.start(int, int, int)",
      "begin_line": 1341,
      "end_line": 1347,
      "comment": "",
      "child_ranges": [
        "(line 1343,col 17)-(line 1343,col 61)",
        "(line 1344,col 17)-(line 1344,col 52)",
        "(line 1345,col 17)-(line 1345,col 64)",
        "(line 1346,col 17)-(line 1346,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-cc081e03-24a3-4278-95f3-b0820e53fef4.end()",
      "begin_line": 1349,
      "end_line": 1355,
      "comment": "",
      "child_ranges": [
        "(line 1350,col 17)-(line 1353,col 17)",
        "(line 1354,col 17)-(line 1354,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInOptimizedOrderPreservingVisitor2()",
      "begin_line": 1361,
      "end_line": 1409,
      "comment": " Visiting an invalid subvector. ",
      "child_ranges": [
        "(line 1363,col 9)-(line 1363,col 51)",
        "(line 1364,col 9)-(line 1364,col 50)",
        "(line 1365,col 9)-(line 1378,col 10)",
        "(line 1379,col 9)-(line 1384,col 9)",
        "(line 1385,col 9)-(line 1390,col 9)",
        "(line 1391,col 9)-(line 1396,col 9)",
        "(line 1397,col 9)-(line 1402,col 9)",
        "(line 1403,col 9)-(line 1408,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-41cec169-2a06-40df-8741-b5ba7d2e45b5.visit(int, double)",
      "begin_line": 1367,
      "end_line": 1369,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-6d777dbd-c411-4488-a151-bb12895784c5.start(int, int, int)",
      "begin_line": 1371,
      "end_line": 1373,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-32b34b73-6877-4247-a54e-3d1546a34625.end()",
      "begin_line": 1375,
      "end_line": 1377,
      "comment": "",
      "child_ranges": [
        "(line 1376,col 17)-(line 1376,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInOptimizedOrderPreservingVisitor3()",
      "begin_line": 1412,
      "end_line": 1447,
      "comment": " Visiting a valid subvector. ",
      "child_ranges": [
        "(line 1414,col 9)-(line 1416,col 10)",
        "(line 1417,col 9)-(line 1417,col 36)",
        "(line 1418,col 9)-(line 1418,col 34)",
        "(line 1419,col 9)-(line 1419,col 42)",
        "(line 1420,col 9)-(line 1420,col 50)",
        "(line 1421,col 9)-(line 1445,col 10)",
        "(line 1446,col 9)-(line 1446,col 68)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "visited"
      ],
      "begin_line": 1422,
      "end_line": 1422,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-565b721d-515c-4691-b2dd-75fc96d7bba6.visit(int, double)",
      "begin_line": 1424,
      "end_line": 1428,
      "comment": "",
      "child_ranges": [
        "(line 1425,col 17)-(line 1426,col 72)",
        "(line 1427,col 17)-(line 1427,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-f3df3c7a-a4f0-40ad-837f-a8ba2324368a.start(int, int, int)",
      "begin_line": 1430,
      "end_line": 1436,
      "comment": "",
      "child_ranges": [
        "(line 1432,col 17)-(line 1432,col 61)",
        "(line 1433,col 17)-(line 1433,col 64)",
        "(line 1434,col 17)-(line 1434,col 60)",
        "(line 1435,col 17)-(line 1435,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-e0b4d539-db7e-4b3c-8b33-cd3a582a1598.end()",
      "begin_line": 1438,
      "end_line": 1444,
      "comment": "",
      "child_ranges": [
        "(line 1439,col 17)-(line 1442,col 17)",
        "(line 1443,col 17)-(line 1443,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInDefaultOrderChangingVisitor1()",
      "begin_line": 1450,
      "end_line": 1485,
      "comment": " The whole vector is visited. ",
      "child_ranges": [
        "(line 1452,col 9)-(line 1454,col 10)",
        "(line 1455,col 9)-(line 1455,col 42)",
        "(line 1456,col 9)-(line 1456,col 48)",
        "(line 1457,col 9)-(line 1480,col 10)",
        "(line 1481,col 9)-(line 1481,col 38)",
        "(line 1482,col 9)-(line 1484,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "expectedIndex"
      ],
      "begin_line": 1459,
      "end_line": 1459,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-93fe0c1a-e62a-4f84-bd52-79024cbafe54.visit(int, double)",
      "begin_line": 1461,
      "end_line": 1467,
      "comment": "",
      "child_ranges": [
        "(line 1462,col 17)-(line 1462,col 64)",
        "(line 1463,col 17)-(line 1464,col 72)",
        "(line 1465,col 17)-(line 1465,col 32)",
        "(line 1466,col 17)-(line 1466,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-8709b06a-e097-402b-b74c-fc95656557fa.start(int, int, int)",
      "begin_line": 1469,
      "end_line": 1475,
      "comment": "",
      "child_ranges": [
        "(line 1471,col 17)-(line 1471,col 61)",
        "(line 1472,col 17)-(line 1472,col 52)",
        "(line 1473,col 17)-(line 1473,col 64)",
        "(line 1474,col 17)-(line 1474,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-7f9ceac0-fc27-455b-8e62-e586ff52cc4e.end()",
      "begin_line": 1477,
      "end_line": 1479,
      "comment": "",
      "child_ranges": [
        "(line 1478,col 17)-(line 1478,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInDefaultOrderChangingVisitor2()",
      "begin_line": 1488,
      "end_line": 1536,
      "comment": " Visiting an invalid subvector. ",
      "child_ranges": [
        "(line 1490,col 9)-(line 1490,col 51)",
        "(line 1491,col 9)-(line 1491,col 48)",
        "(line 1492,col 9)-(line 1505,col 10)",
        "(line 1506,col 9)-(line 1511,col 9)",
        "(line 1512,col 9)-(line 1517,col 9)",
        "(line 1518,col 9)-(line 1523,col 9)",
        "(line 1524,col 9)-(line 1529,col 9)",
        "(line 1530,col 9)-(line 1535,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-433c12f6-9fae-4ed3-9f04-1cbb06e35e03.visit(int, double)",
      "begin_line": 1494,
      "end_line": 1496,
      "comment": "",
      "child_ranges": [
        "(line 1495,col 17)-(line 1495,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-b36f7bc3-f3f2-4b45-b574-04d30df13aa3.start(int, int, int)",
      "begin_line": 1498,
      "end_line": 1500,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-62e8e1de-7d9b-476b-9425-749514c0ab7a.end()",
      "begin_line": 1502,
      "end_line": 1504,
      "comment": "",
      "child_ranges": [
        "(line 1503,col 17)-(line 1503,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInDefaultOrderChangingVisitor3()",
      "begin_line": 1539,
      "end_line": 1576,
      "comment": " Visiting a valid subvector. ",
      "child_ranges": [
        "(line 1541,col 9)-(line 1543,col 10)",
        "(line 1544,col 9)-(line 1544,col 36)",
        "(line 1545,col 9)-(line 1545,col 34)",
        "(line 1546,col 9)-(line 1546,col 42)",
        "(line 1547,col 9)-(line 1547,col 48)",
        "(line 1548,col 9)-(line 1571,col 10)",
        "(line 1572,col 9)-(line 1572,col 66)",
        "(line 1573,col 9)-(line 1575,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "expectedIndex"
      ],
      "begin_line": 1550,
      "end_line": 1550,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-943c8155-0064-4fc4-a0f5-952619b3803c.visit(int, double)",
      "begin_line": 1552,
      "end_line": 1558,
      "comment": "",
      "child_ranges": [
        "(line 1553,col 17)-(line 1553,col 64)",
        "(line 1554,col 17)-(line 1555,col 72)",
        "(line 1556,col 17)-(line 1556,col 32)",
        "(line 1557,col 17)-(line 1557,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-4daa823d-bcc3-46d7-a706-e0cc6bd64e3c.start(int, int, int)",
      "begin_line": 1560,
      "end_line": 1566,
      "comment": "",
      "child_ranges": [
        "(line 1562,col 17)-(line 1562,col 61)",
        "(line 1563,col 17)-(line 1563,col 64)",
        "(line 1564,col 17)-(line 1564,col 60)",
        "(line 1565,col 17)-(line 1565,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-ea6cb7e0-eaba-4940-9179-de12a8ef0403.end()",
      "begin_line": 1568,
      "end_line": 1570,
      "comment": "",
      "child_ranges": [
        "(line 1569,col 17)-(line 1569,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInOptimizedOrderChangingVisitor1()",
      "begin_line": 1579,
      "end_line": 1616,
      "comment": " The whole vector is visited. ",
      "child_ranges": [
        "(line 1581,col 9)-(line 1583,col 10)",
        "(line 1584,col 9)-(line 1584,col 42)",
        "(line 1585,col 9)-(line 1585,col 48)",
        "(line 1586,col 9)-(line 1611,col 10)",
        "(line 1612,col 9)-(line 1612,col 40)",
        "(line 1613,col 9)-(line 1615,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "visited"
      ],
      "begin_line": 1587,
      "end_line": 1587,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-29c8aa4f-aeb9-494e-9218-ef897f6e9e81.visit(int, double)",
      "begin_line": 1589,
      "end_line": 1594,
      "comment": "",
      "child_ranges": [
        "(line 1590,col 17)-(line 1590,col 44)",
        "(line 1591,col 17)-(line 1592,col 72)",
        "(line 1593,col 17)-(line 1593,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-e1a0d4aa-9bc1-4879-9388-33585ecc3aed.start(int, int, int)",
      "begin_line": 1596,
      "end_line": 1602,
      "comment": "",
      "child_ranges": [
        "(line 1598,col 17)-(line 1598,col 61)",
        "(line 1599,col 17)-(line 1599,col 52)",
        "(line 1600,col 17)-(line 1600,col 64)",
        "(line 1601,col 17)-(line 1601,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-afc2526a-42f0-42b0-abcb-02be2b009651.end()",
      "begin_line": 1604,
      "end_line": 1610,
      "comment": "",
      "child_ranges": [
        "(line 1605,col 17)-(line 1608,col 17)",
        "(line 1609,col 17)-(line 1609,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInOptimizedOrderChangingVisitor2()",
      "begin_line": 1619,
      "end_line": 1667,
      "comment": " Visiting an invalid subvector. ",
      "child_ranges": [
        "(line 1621,col 9)-(line 1621,col 51)",
        "(line 1622,col 9)-(line 1622,col 48)",
        "(line 1623,col 9)-(line 1636,col 10)",
        "(line 1637,col 9)-(line 1642,col 9)",
        "(line 1643,col 9)-(line 1648,col 9)",
        "(line 1649,col 9)-(line 1654,col 9)",
        "(line 1655,col 9)-(line 1660,col 9)",
        "(line 1661,col 9)-(line 1666,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-4860517f-2811-469a-96f4-807bc4a5db00.visit(int, double)",
      "begin_line": 1625,
      "end_line": 1627,
      "comment": "",
      "child_ranges": [
        "(line 1626,col 17)-(line 1626,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-b74569c8-4442-48f8-8ab4-baa2d7cf59af.start(int, int, int)",
      "begin_line": 1629,
      "end_line": 1631,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-076bea74-1e5e-4263-a0f5-4434b2bac829.end()",
      "begin_line": 1633,
      "end_line": 1635,
      "comment": "",
      "child_ranges": [
        "(line 1634,col 17)-(line 1634,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInOptimizedOrderChangingVisitor3()",
      "begin_line": 1670,
      "end_line": 1709,
      "comment": " Visiting a valid subvector. ",
      "child_ranges": [
        "(line 1672,col 9)-(line 1674,col 10)",
        "(line 1675,col 9)-(line 1675,col 36)",
        "(line 1676,col 9)-(line 1676,col 34)",
        "(line 1677,col 9)-(line 1677,col 42)",
        "(line 1678,col 9)-(line 1678,col 48)",
        "(line 1679,col 9)-(line 1704,col 10)",
        "(line 1705,col 9)-(line 1705,col 68)",
        "(line 1706,col 9)-(line 1708,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "visited"
      ],
      "begin_line": 1680,
      "end_line": 1680,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-8744dc85-9c8e-4bbb-8fe6-dae202bd0e41.visit(int, double)",
      "begin_line": 1682,
      "end_line": 1687,
      "comment": "",
      "child_ranges": [
        "(line 1683,col 17)-(line 1684,col 72)",
        "(line 1685,col 17)-(line 1685,col 44)",
        "(line 1686,col 17)-(line 1686,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-2a8b1839-320e-464b-98ce-64e4f6a4f95a.start(int, int, int)",
      "begin_line": 1689,
      "end_line": 1695,
      "comment": "",
      "child_ranges": [
        "(line 1691,col 17)-(line 1691,col 61)",
        "(line 1692,col 17)-(line 1692,col 64)",
        "(line 1693,col 17)-(line 1693,col 60)",
        "(line 1694,col 17)-(line 1694,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-9ad8b3e9-17dc-428b-8362-b3bb86c8bc7d.end()",
      "begin_line": 1697,
      "end_line": 1703,
      "comment": "",
      "child_ranges": [
        "(line 1698,col 17)-(line 1701,col 17)",
        "(line 1702,col 17)-(line 1702,col 27)"
      ]
    }
  ]
}