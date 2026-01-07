{
  "filepath": "/tmp/Math-29b/src/test/java/org/apache/commons/math3/linear/RealVectorAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealVectorAbstractTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 59,
      "end_line": 1904,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.create(double[])",
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * Creates a new instance of {@link RealVector}, with specified entries.\n     * The returned vector must be of the type currently tested. It should be\n     * noted that some tests assume that no references to the specified\n     * {@code double[]} are kept in the returned object: if necessary, defensive\n     * copy of this array should be made.\n     *\n     * @param data the entries of the vector to be created\n     * @return a new {@link RealVector} of the type to be tested\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.createAlien(double[])",
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n     * Creates a new instance of {@link RealVector}, with specified entries.\n     * The type of the returned vector must be different from the type currently\n     * tested. It should be noted that some tests assume that no references to\n     * the specified {@code double[]} are kept in the returned object: if\n     * necessary, defensive copy of this array should be made.\n     *\n     * @param data the entries of the vector to be created\n     * @return a new {@link RealVector} of an alien type\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.getPreferredEntryValue()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Returns a preferred value of the entries, to be tested specifically. Some\n     * implementations of {@link RealVector} (e.g. {@link OpenMapRealVector}) do\n     * not store specific values of entries. In order to ensure that all tests\n     * take into account this specific value, some entries of the vectors to be\n     * tested are deliberately set to the value returned by the present method.\n     * The default implementation returns {@code 0.0}.\n     *\n     * @return a value which \u003cem\u003eshould\u003c/em\u003e be present in all vectors to be\n     * tested\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.assertClose(java.lang.String, double[], double[], double)",
      "begin_line": 105,
      "end_line": 113,
      "comment": " verifies that two vectors are close (sup norm) ",
      "child_ranges": [
        "(line 107,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 112,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ma1"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec1"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec2"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec3"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec4"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec5"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec_null"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dvec1"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mat1"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data1"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": "\n     * Data which can be used to create a specific vector. The array is\n     * interspersed with the value returned by\n     * {@link #getPreferredEntryValue()}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "data2"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": "\n     * Data which can be used to create a specific vector. The array is\n     * interspersed with the value returned by\n     * {@link #getPreferredEntryValue()}.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.RealVectorAbstractTest()",
      "begin_line": 140,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 50)",
        "(line 142,col 9)-(line 142,col 47)",
        "(line 143,col 9)-(line 143,col 50)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "entryTolerance"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": " tolerances"
    },
    {
      "type": "field",
      "varNames": [
        "normTolerance"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetDimension()",
      "begin_line": 150,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetEntry()",
      "begin_line": 155,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 43)",
        "(line 158,col 9)-(line 160,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetEntryInvalidIndex1()",
      "begin_line": 163,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetEntryInvalidIndex2()",
      "begin_line": 168,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testSetEntry()",
      "begin_line": 173,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 59)",
        "(line 176,col 9)-(line 176,col 48)",
        "(line 181,col 9)-(line 190,col 9)",
        "(line 195,col 9)-(line 195,col 50)",
        "(line 196,col 9)-(line 205,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testSetEntryInvalidIndex1()",
      "begin_line": 208,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testSetEntryInvalidIndex2()",
      "begin_line": 213,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testAddToEntry()",
      "begin_line": 218,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 59)",
        "(line 221,col 9)-(line 221,col 48)",
        "(line 226,col 9)-(line 226,col 30)",
        "(line 227,col 9)-(line 235,col 9)",
        "(line 240,col 9)-(line 240,col 50)",
        "(line 241,col 9)-(line 250,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testAddToEntryInvalidIndex1()",
      "begin_line": 253,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testAddToEntryInvalidIndex2()",
      "begin_line": 258,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.doTestAppendVector(java.lang.String, org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.RealVector, double)",
      "begin_line": 263,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 41)",
        "(line 267,col 9)-(line 267,col 41)",
        "(line 268,col 9)-(line 268,col 43)",
        "(line 269,col 9)-(line 269,col 64)",
        "(line 270,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 277,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testAppendVector()",
      "begin_line": 280,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 74)",
        "(line 283,col 9)-(line 283,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.doTestAppendScalar(java.lang.String, org.apache.commons.math3.linear.RealVector, double, double)",
      "begin_line": 286,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 39)",
        "(line 290,col 9)-(line 290,col 41)",
        "(line 291,col 9)-(line 291,col 62)",
        "(line 292,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 53)",
        "(line 297,col 9)-(line 297,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testAppendScalar()",
      "begin_line": 300,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 54)",
        "(line 304,col 9)-(line 304,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetSubVector()",
      "begin_line": 307,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 50)",
        "(line 310,col 9)-(line 310,col 83)",
        "(line 311,col 9)-(line 311,col 28)",
        "(line 312,col 9)-(line 312,col 38)",
        "(line 313,col 9)-(line 313,col 70)",
        "(line 314,col 9)-(line 314,col 48)",
        "(line 315,col 9)-(line 315,col 54)",
        "(line 316,col 9)-(line 316,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetSubVectorInvalidIndex1()",
      "begin_line": 319,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 25)",
        "(line 322,col 9)-(line 322,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetSubVectorInvalidIndex2()",
      "begin_line": 325,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 25)",
        "(line 328,col 9)-(line 328,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetSubVectorInvalidIndex3()",
      "begin_line": 331,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 25)",
        "(line 334,col 9)-(line 334,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetSubVectorInvalidIndex4()",
      "begin_line": 337,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 25)",
        "(line 340,col 9)-(line 340,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testSetSubVectorSameType()",
      "begin_line": 343,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 50)",
        "(line 346,col 9)-(line 346,col 87)",
        "(line 347,col 9)-(line 347,col 49)",
        "(line 348,col 9)-(line 348,col 51)",
        "(line 349,col 9)-(line 349,col 28)",
        "(line 350,col 9)-(line 350,col 48)",
        "(line 352,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 355,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testSetSubVectorMixedType()",
      "begin_line": 358,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 50)",
        "(line 361,col 9)-(line 361,col 87)",
        "(line 362,col 9)-(line 362,col 49)",
        "(line 363,col 9)-(line 363,col 51)",
        "(line 364,col 9)-(line 364,col 28)",
        "(line 365,col 9)-(line 365,col 53)",
        "(line 367,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 370,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testSetSubVectorInvalidIndex1()",
      "begin_line": 373,
      "end_line": 376,
      "comment": "",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testSetSubVectorInvalidIndex2()",
      "begin_line": 378,
      "end_line": 381,
      "comment": "",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testSetSubVectorInvalidIndex3()",
      "begin_line": 383,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testIsNaN()",
      "begin_line": 388,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 60)",
        "(line 392,col 9)-(line 392,col 38)",
        "(line 393,col 9)-(line 393,col 34)",
        "(line 394,col 9)-(line 394,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testIsInfinite()",
      "begin_line": 397,
      "end_line": 406,
      "comment": "",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 62)",
        "(line 401,col 9)-(line 401,col 43)",
        "(line 402,col 9)-(line 402,col 48)",
        "(line 403,col 9)-(line 403,col 42)",
        "(line 404,col 9)-(line 404,col 34)",
        "(line 405,col 9)-(line 405,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.doTestEbeBinaryOperation(org.apache.commons.math3.linear.RealVectorAbstractTest.BinaryOperation, boolean)",
      "begin_line": 408,
      "end_line": 521,
      "comment": "",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 50)",
        "(line 415,col 9)-(line 415,col 32)",
        "(line 416,col 9)-(line 416,col 32)",
        "(line 468,col 9)-(line 468,col 88)",
        "(line 469,col 9)-(line 469,col 73)",
        "(line 470,col 9)-(line 470,col 73)",
        "(line 471,col 9)-(line 471,col 18)",
        "(line 472,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 479,col 44)",
        "(line 480,col 9)-(line 480,col 73)",
        "(line 481,col 9)-(line 481,col 32)",
        "(line 482,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 498,col 59)",
        "(line 499,col 9)-(line 516,col 9)",
        "(line 517,col 9)-(line 520,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.doTestEbeBinaryOperationDimensionMismatch(org.apache.commons.math3.linear.RealVectorAbstractTest.BinaryOperation)",
      "begin_line": 523,
      "end_line": 541,
      "comment": "",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 25)",
        "(line 525,col 9)-(line 540,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testAddSameType()",
      "begin_line": 543,
      "end_line": 546,
      "comment": "",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testAddMixedTypes()",
      "begin_line": 548,
      "end_line": 551,
      "comment": "",
      "child_ranges": [
        "(line 550,col 9)-(line 550,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testAddDimensionMismatch()",
      "begin_line": 553,
      "end_line": 556,
      "comment": "",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testSubtractSameType()",
      "begin_line": 558,
      "end_line": 561,
      "comment": "",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testSubtractMixedTypes()",
      "begin_line": 563,
      "end_line": 566,
      "comment": "",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testSubtractDimensionMismatch()",
      "begin_line": 568,
      "end_line": 571,
      "comment": "",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testEbeMultiplySameType()",
      "begin_line": 573,
      "end_line": 576,
      "comment": "",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testEbeMultiplyMixedTypes()",
      "begin_line": 578,
      "end_line": 581,
      "comment": "",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testEbeMultiplyDimensionMismatch()",
      "begin_line": 583,
      "end_line": 586,
      "comment": "",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testEbeDivideSameType()",
      "begin_line": 588,
      "end_line": 591,
      "comment": "",
      "child_ranges": [
        "(line 590,col 9)-(line 590,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testEbeDivideMixedTypes()",
      "begin_line": 593,
      "end_line": 596,
      "comment": "",
      "child_ranges": [
        "(line 595,col 9)-(line 595,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testEbeDivideDimensionMismatch()",
      "begin_line": 598,
      "end_line": 601,
      "comment": "",
      "child_ranges": [
        "(line 600,col 9)-(line 600,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testDataInOut()",
      "begin_line": 603,
      "end_line": 658,
      "comment": "",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 43)",
        "(line 606,col 9)-(line 606,col 43)",
        "(line 607,col 9)-(line 607,col 43)",
        "(line 608,col 9)-(line 608,col 50)",
        "(line 610,col 9)-(line 610,col 44)",
        "(line 611,col 9)-(line 611,col 33)",
        "(line 612,col 9)-(line 612,col 78)",
        "(line 613,col 9)-(line 618,col 9)",
        "(line 620,col 9)-(line 620,col 44)",
        "(line 621,col 9)-(line 621,col 35)",
        "(line 622,col 9)-(line 622,col 76)",
        "(line 623,col 9)-(line 623,col 76)",
        "(line 624,col 9)-(line 629,col 9)",
        "(line 631,col 9)-(line 631,col 44)",
        "(line 632,col 9)-(line 632,col 25)",
        "(line 633,col 9)-(line 633,col 78)",
        "(line 635,col 9)-(line 640,col 9)",
        "(line 642,col 9)-(line 642,col 44)",
        "(line 643,col 9)-(line 643,col 37)",
        "(line 644,col 9)-(line 644,col 76)",
        "(line 645,col 9)-(line 645,col 76)",
        "(line 646,col 9)-(line 651,col 9)",
        "(line 653,col 9)-(line 653,col 44)",
        "(line 654,col 9)-(line 654,col 46)",
        "(line 655,col 9)-(line 655,col 46)",
        "(line 656,col 9)-(line 656,col 34)",
        "(line 657,col 9)-(line 657,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testMapFunctions()",
      "begin_line": 660,
      "end_line": 987,
      "comment": "",
      "child_ranges": [
        "(line 662,col 9)-(line 662,col 43)",
        "(line 665,col 9)-(line 665,col 46)",
        "(line 666,col 9)-(line 666,col 46)",
        "(line 667,col 9)-(line 667,col 87)",
        "(line 670,col 9)-(line 670,col 46)",
        "(line 671,col 9)-(line 671,col 42)",
        "(line 672,col 9)-(line 672,col 52)",
        "(line 673,col 9)-(line 673,col 99)",
        "(line 676,col 9)-(line 676,col 56)",
        "(line 677,col 9)-(line 677,col 52)",
        "(line 678,col 9)-(line 678,col 97)",
        "(line 681,col 9)-(line 681,col 51)",
        "(line 682,col 9)-(line 682,col 52)",
        "(line 683,col 9)-(line 683,col 58)",
        "(line 684,col 9)-(line 684,col 109)",
        "(line 687,col 9)-(line 687,col 56)",
        "(line 688,col 9)-(line 688,col 51)",
        "(line 689,col 9)-(line 689,col 97)",
        "(line 692,col 9)-(line 692,col 51)",
        "(line 693,col 9)-(line 693,col 52)",
        "(line 694,col 9)-(line 694,col 57)",
        "(line 695,col 9)-(line 695,col 109)",
        "(line 698,col 9)-(line 698,col 52)",
        "(line 699,col 9)-(line 699,col 52)",
        "(line 700,col 9)-(line 700,col 93)",
        "(line 703,col 9)-(line 703,col 49)",
        "(line 704,col 9)-(line 704,col 48)",
        "(line 705,col 9)-(line 705,col 58)",
        "(line 706,col 9)-(line 706,col 105)",
        "(line 710,col 9)-(line 710,col 51)",
        "(line 711,col 9)-(line 711,col 46)",
        "(line 712,col 9)-(line 712,col 87)",
        "(line 715,col 9)-(line 715,col 46)",
        "(line 716,col 9)-(line 716,col 47)",
        "(line 717,col 9)-(line 717,col 52)",
        "(line 718,col 9)-(line 718,col 99)",
        "(line 721,col 9)-(line 721,col 48)",
        "(line 722,col 9)-(line 722,col 105)",
        "(line 723,col 9)-(line 723,col 87)",
        "(line 726,col 9)-(line 726,col 46)",
        "(line 727,col 9)-(line 727,col 44)",
        "(line 728,col 9)-(line 728,col 111)",
        "(line 729,col 9)-(line 729,col 99)",
        "(line 733,col 9)-(line 733,col 52)",
        "(line 734,col 9)-(line 734,col 95)",
        "(line 735,col 9)-(line 735,col 91)",
        "(line 738,col 9)-(line 738,col 48)",
        "(line 739,col 9)-(line 739,col 48)",
        "(line 740,col 9)-(line 740,col 101)",
        "(line 741,col 9)-(line 741,col 103)",
        "(line 744,col 9)-(line 744,col 48)",
        "(line 745,col 9)-(line 745,col 85)",
        "(line 746,col 9)-(line 746,col 87)",
        "(line 749,col 9)-(line 749,col 46)",
        "(line 750,col 9)-(line 750,col 44)",
        "(line 751,col 9)-(line 751,col 91)",
        "(line 752,col 9)-(line 752,col 99)",
        "(line 755,col 9)-(line 755,col 52)",
        "(line 756,col 9)-(line 756,col 87)",
        "(line 757,col 9)-(line 757,col 91)",
        "(line 760,col 9)-(line 760,col 48)",
        "(line 761,col 9)-(line 761,col 48)",
        "(line 762,col 9)-(line 762,col 93)",
        "(line 763,col 9)-(line 763,col 103)",
        "(line 766,col 9)-(line 766,col 52)",
        "(line 767,col 9)-(line 767,col 97)",
        "(line 768,col 9)-(line 768,col 91)",
        "(line 771,col 9)-(line 771,col 48)",
        "(line 772,col 9)-(line 772,col 48)",
        "(line 773,col 9)-(line 773,col 103)",
        "(line 774,col 9)-(line 774,col 103)",
        "(line 777,col 9)-(line 777,col 50)",
        "(line 778,col 9)-(line 778,col 106)",
        "(line 779,col 9)-(line 779,col 89)",
        "(line 782,col 9)-(line 782,col 47)",
        "(line 783,col 9)-(line 783,col 46)",
        "(line 784,col 9)-(line 784,col 112)",
        "(line 785,col 9)-(line 785,col 101)",
        "(line 788,col 9)-(line 788,col 50)",
        "(line 789,col 9)-(line 789,col 106)",
        "(line 790,col 9)-(line 790,col 89)",
        "(line 793,col 9)-(line 793,col 47)",
        "(line 794,col 9)-(line 794,col 46)",
        "(line 795,col 9)-(line 795,col 112)",
        "(line 796,col 9)-(line 796,col 101)",
        "(line 799,col 9)-(line 799,col 50)",
        "(line 800,col 9)-(line 800,col 105)",
        "(line 801,col 9)-(line 801,col 89)",
        "(line 804,col 9)-(line 804,col 47)",
        "(line 805,col 9)-(line 805,col 46)",
        "(line 806,col 9)-(line 806,col 111)",
        "(line 807,col 9)-(line 807,col 101)",
        "(line 810,col 9)-(line 810,col 48)",
        "(line 811,col 9)-(line 811,col 107)",
        "(line 812,col 9)-(line 812,col 87)",
        "(line 815,col 9)-(line 815,col 46)",
        "(line 816,col 9)-(line 816,col 44)",
        "(line 817,col 9)-(line 817,col 113)",
        "(line 818,col 9)-(line 818,col 99)",
        "(line 821,col 9)-(line 821,col 48)",
        "(line 822,col 9)-(line 822,col 104)",
        "(line 823,col 9)-(line 823,col 87)",
        "(line 826,col 9)-(line 826,col 46)",
        "(line 827,col 9)-(line 827,col 44)",
        "(line 828,col 9)-(line 828,col 110)",
        "(line 829,col 9)-(line 829,col 99)",
        "(line 832,col 9)-(line 832,col 48)",
        "(line 833,col 9)-(line 833,col 106)",
        "(line 834,col 9)-(line 834,col 87)",
        "(line 837,col 9)-(line 837,col 46)",
        "(line 838,col 9)-(line 838,col 44)",
        "(line 839,col 9)-(line 839,col 112)",
        "(line 840,col 9)-(line 840,col 99)",
        "(line 842,col 9)-(line 842,col 42)",
        "(line 843,col 9)-(line 843,col 45)",
        "(line 846,col 9)-(line 846,col 51)",
        "(line 847,col 9)-(line 847,col 88)",
        "(line 848,col 9)-(line 848,col 89)",
        "(line 851,col 9)-(line 851,col 48)",
        "(line 852,col 9)-(line 852,col 46)",
        "(line 853,col 9)-(line 853,col 94)",
        "(line 854,col 9)-(line 854,col 101)",
        "(line 857,col 9)-(line 857,col 51)",
        "(line 858,col 9)-(line 858,col 87)",
        "(line 859,col 9)-(line 859,col 89)",
        "(line 862,col 9)-(line 862,col 48)",
        "(line 863,col 9)-(line 863,col 46)",
        "(line 864,col 9)-(line 864,col 93)",
        "(line 865,col 9)-(line 865,col 101)",
        "(line 868,col 9)-(line 868,col 51)",
        "(line 869,col 9)-(line 869,col 87)",
        "(line 870,col 9)-(line 870,col 89)",
        "(line 873,col 9)-(line 873,col 48)",
        "(line 874,col 9)-(line 874,col 46)",
        "(line 875,col 9)-(line 875,col 93)",
        "(line 876,col 9)-(line 876,col 101)",
        "(line 879,col 9)-(line 879,col 52)",
        "(line 880,col 9)-(line 880,col 66)",
        "(line 881,col 9)-(line 881,col 87)",
        "(line 884,col 9)-(line 884,col 46)",
        "(line 885,col 9)-(line 885,col 48)",
        "(line 886,col 9)-(line 886,col 72)",
        "(line 887,col 9)-(line 887,col 99)",
        "(line 889,col 9)-(line 889,col 45)",
        "(line 890,col 9)-(line 890,col 47)",
        "(line 893,col 9)-(line 893,col 51)",
        "(line 894,col 9)-(line 894,col 44)",
        "(line 895,col 9)-(line 895,col 87)",
        "(line 898,col 9)-(line 898,col 49)",
        "(line 899,col 9)-(line 899,col 44)",
        "(line 900,col 9)-(line 900,col 50)",
        "(line 901,col 9)-(line 901,col 99)",
        "(line 904,col 9)-(line 904,col 50)",
        "(line 905,col 9)-(line 905,col 85)",
        "(line 906,col 9)-(line 906,col 89)",
        "(line 909,col 9)-(line 909,col 47)",
        "(line 910,col 9)-(line 910,col 46)",
        "(line 911,col 9)-(line 911,col 91)",
        "(line 912,col 9)-(line 912,col 101)",
        "(line 914,col 9)-(line 914,col 46)",
        "(line 915,col 9)-(line 915,col 49)",
        "(line 918,col 9)-(line 918,col 54)",
        "(line 919,col 9)-(line 919,col 80)",
        "(line 920,col 9)-(line 920,col 89)",
        "(line 923,col 9)-(line 923,col 51)",
        "(line 924,col 9)-(line 924,col 46)",
        "(line 925,col 9)-(line 925,col 87)",
        "(line 926,col 9)-(line 926,col 101)",
        "(line 928,col 9)-(line 928,col 46)",
        "(line 929,col 9)-(line 929,col 61)",
        "(line 932,col 9)-(line 932,col 54)",
        "(line 933,col 9)-(line 933,col 46)",
        "(line 934,col 9)-(line 934,col 89)",
        "(line 937,col 9)-(line 937,col 51)",
        "(line 938,col 9)-(line 938,col 46)",
        "(line 939,col 9)-(line 939,col 53)",
        "(line 940,col 9)-(line 940,col 101)",
        "(line 943,col 9)-(line 943,col 56)",
        "(line 944,col 9)-(line 944,col 47)",
        "(line 945,col 9)-(line 945,col 91)",
        "(line 948,col 9)-(line 948,col 52)",
        "(line 949,col 9)-(line 949,col 48)",
        "(line 950,col 9)-(line 950,col 54)",
        "(line 951,col 9)-(line 951,col 103)",
        "(line 954,col 9)-(line 954,col 54)",
        "(line 955,col 9)-(line 955,col 46)",
        "(line 956,col 9)-(line 956,col 89)",
        "(line 959,col 9)-(line 959,col 51)",
        "(line 960,col 9)-(line 960,col 46)",
        "(line 961,col 9)-(line 961,col 53)",
        "(line 962,col 9)-(line 962,col 101)",
        "(line 965,col 9)-(line 965,col 58)",
        "(line 966,col 9)-(line 966,col 48)",
        "(line 967,col 9)-(line 967,col 93)",
        "(line 970,col 9)-(line 970,col 53)",
        "(line 971,col 9)-(line 971,col 50)",
        "(line 972,col 9)-(line 972,col 55)",
        "(line 973,col 9)-(line 973,col 105)",
        "(line 978,col 9)-(line 978,col 52)",
        "(line 979,col 9)-(line 979,col 105)",
        "(line 980,col 9)-(line 980,col 87)",
        "(line 983,col 9)-(line 983,col 50)",
        "(line 984,col 9)-(line 984,col 44)",
        "(line 985,col 9)-(line 985,col 111)",
        "(line 986,col 9)-(line 986,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testBasicFunctions()",
      "begin_line": 989,
      "end_line": 1086,
      "comment": "",
      "child_ranges": [
        "(line 991,col 9)-(line 991,col 43)",
        "(line 992,col 9)-(line 992,col 43)",
        "(line 993,col 9)-(line 993,col 43)",
        "(line 994,col 9)-(line 994,col 51)",
        "(line 996,col 9)-(line 996,col 50)",
        "(line 999,col 9)-(line 999,col 40)",
        "(line 1000,col 9)-(line 1001,col 54)",
        "(line 1004,col 9)-(line 1004,col 44)",
        "(line 1005,col 9)-(line 1006,col 43)",
        "(line 1009,col 9)-(line 1009,col 48)",
        "(line 1010,col 9)-(line 1011,col 43)",
        "(line 1014,col 9)-(line 1014,col 41)",
        "(line 1015,col 9)-(line 1016,col 49)",
        "(line 1019,col 9)-(line 1019,col 45)",
        "(line 1020,col 9)-(line 1021,col 51)",
        "(line 1024,col 9)-(line 1024,col 54)",
        "(line 1025,col 9)-(line 1026,col 43)",
        "(line 1028,col 9)-(line 1028,col 58)",
        "(line 1029,col 9)-(line 1030,col 43)",
        "(line 1033,col 9)-(line 1033,col 58)",
        "(line 1034,col 9)-(line 1035,col 43)",
        "(line 1037,col 9)-(line 1037,col 62)",
        "(line 1038,col 9)-(line 1039,col 43)",
        "(line 1042,col 9)-(line 1042,col 39)",
        "(line 1043,col 9)-(line 1043,col 69)",
        "(line 1046,col 9)-(line 1046,col 43)",
        "(line 1047,col 9)-(line 1047,col 71)",
        "(line 1049,col 9)-(line 1049,col 56)",
        "(line 1050,col 9)-(line 1051,col 43)",
        "(line 1053,col 9)-(line 1053,col 60)",
        "(line 1054,col 9)-(line 1055,col 76)",
        "(line 1057,col 9)-(line 1057,col 50)",
        "(line 1058,col 9)-(line 1058,col 63)",
        "(line 1059,col 9)-(line 1060,col 61)",
        "(line 1062,col 9)-(line 1067,col 9)",
        "(line 1069,col 9)-(line 1069,col 41)",
        "(line 1070,col 9)-(line 1070,col 28)",
        "(line 1071,col 9)-(line 1071,col 96)",
        "(line 1072,col 9)-(line 1077,col 9)",
        "(line 1079,col 9)-(line 1079,col 52)",
        "(line 1080,col 9)-(line 1080,col 96)",
        "(line 1081,col 9)-(line 1081,col 94)",
        "(line 1083,col 9)-(line 1083,col 56)",
        "(line 1084,col 9)-(line 1084,col 98)",
        "(line 1085,col 9)-(line 1085,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testOuterProduct()",
      "begin_line": 1088,
      "end_line": 1102,
      "comment": "",
      "child_ranges": [
        "(line 1090,col 9)-(line 1090,col 61)",
        "(line 1091,col 9)-(line 1091,col 58)",
        "(line 1093,col 9)-(line 1093,col 48)",
        "(line 1095,col 9)-(line 1095,col 40)",
        "(line 1096,col 9)-(line 1096,col 55)",
        "(line 1097,col 9)-(line 1097,col 56)",
        "(line 1098,col 9)-(line 1098,col 55)",
        "(line 1099,col 9)-(line 1099,col 56)",
        "(line 1100,col 9)-(line 1100,col 57)",
        "(line 1101,col 9)-(line 1101,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testMisc()",
      "begin_line": 1104,
      "end_line": 1132,
      "comment": "",
      "child_ranges": [
        "(line 1106,col 9)-(line 1106,col 37)",
        "(line 1107,col 9)-(line 1107,col 37)",
        "(line 1108,col 9)-(line 1108,col 39)",
        "(line 1110,col 9)-(line 1110,col 36)",
        "(line 1111,col 9)-(line 1111,col 61)",
        "(line 1112,col 9)-(line 1117,col 9)",
        "(line 1119,col 8)-(line 1124,col 9)",
        "(line 1126,col 9)-(line 1131,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testPredicates()",
      "begin_line": 1134,
      "end_line": 1148,
      "comment": "",
      "child_ranges": [
        "(line 1136,col 9)-(line 1136,col 62)",
        "(line 1138,col 9)-(line 1138,col 25)",
        "(line 1139,col 9)-(line 1139,col 65)",
        "(line 1140,col 9)-(line 1140,col 83)",
        "(line 1141,col 9)-(line 1141,col 69)",
        "(line 1143,col 9)-(line 1143,col 39)",
        "(line 1144,col 9)-(line 1144,col 46)",
        "(line 1145,col 9)-(line 1145,col 43)",
        "(line 1146,col 9)-(line 1146,col 78)",
        "(line 1147,col 9)-(line 1147,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testSerial()",
      "begin_line": 1150,
      "end_line": 1154,
      "comment": "",
      "child_ranges": [
        "(line 1152,col 9)-(line 1152,col 56)",
        "(line 1153,col 9)-(line 1153,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testMinMax()",
      "begin_line": 1156,
      "end_line": 1178,
      "comment": "",
      "child_ranges": [
        "(line 1158,col 9)-(line 1158,col 69)",
        "(line 1159,col 9)-(line 1159,col 49)",
        "(line 1160,col 9)-(line 1160,col 59)",
        "(line 1161,col 9)-(line 1161,col 49)",
        "(line 1162,col 9)-(line 1162,col 59)",
        "(line 1163,col 9)-(line 1163,col 83)",
        "(line 1164,col 9)-(line 1164,col 49)",
        "(line 1165,col 9)-(line 1165,col 59)",
        "(line 1166,col 9)-(line 1166,col 49)",
        "(line 1167,col 9)-(line 1167,col 58)",
        "(line 1168,col 9)-(line 1168,col 76)",
        "(line 1169,col 9)-(line 1169,col 50)",
        "(line 1170,col 9)-(line 1170,col 58)",
        "(line 1171,col 9)-(line 1171,col 50)",
        "(line 1172,col 9)-(line 1172,col 58)",
        "(line 1173,col 9)-(line 1173,col 52)",
        "(line 1174,col 9)-(line 1174,col 50)",
        "(line 1175,col 9)-(line 1175,col 58)",
        "(line 1176,col 9)-(line 1176,col 50)",
        "(line 1177,col 9)-(line 1177,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCosine()",
      "begin_line": 1180,
      "end_line": 1199,
      "comment": "",
      "child_ranges": [
        "(line 1182,col 9)-(line 1182,col 60)",
        "(line 1184,col 9)-(line 1184,col 48)",
        "(line 1185,col 9)-(line 1185,col 37)",
        "(line 1186,col 9)-(line 1186,col 78)",
        "(line 1188,col 9)-(line 1188,col 39)",
        "(line 1189,col 9)-(line 1189,col 26)",
        "(line 1190,col 9)-(line 1190,col 59)",
        "(line 1192,col 9)-(line 1192,col 39)",
        "(line 1193,col 9)-(line 1193,col 26)",
        "(line 1194,col 9)-(line 1194,col 47)",
        "(line 1196,col 9)-(line 1196,col 40)",
        "(line 1197,col 9)-(line 1197,col 26)",
        "(line 1198,col 9)-(line 1198,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCosinePrecondition1()",
      "begin_line": 1201,
      "end_line": 1206,
      "comment": "",
      "child_ranges": [
        "(line 1203,col 9)-(line 1203,col 60)",
        "(line 1204,col 9)-(line 1204,col 60)",
        "(line 1205,col 9)-(line 1205,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCosinePrecondition2()",
      "begin_line": 1208,
      "end_line": 1213,
      "comment": "",
      "child_ranges": [
        "(line 1210,col 9)-(line 1210,col 60)",
        "(line 1211,col 9)-(line 1211,col 60)",
        "(line 1212,col 9)-(line 1212,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCosinePrecondition3()",
      "begin_line": 1215,
      "end_line": 1220,
      "comment": "",
      "child_ranges": [
        "(line 1217,col 9)-(line 1217,col 60)",
        "(line 1218,col 9)-(line 1218,col 63)",
        "(line 1219,col 9)-(line 1219,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCombinePreconditionSameType()",
      "begin_line": 1222,
      "end_line": 1231,
      "comment": "",
      "child_ranges": [
        "(line 1224,col 9)-(line 1224,col 28)",
        "(line 1225,col 9)-(line 1225,col 28)",
        "(line 1226,col 9)-(line 1226,col 51)",
        "(line 1227,col 9)-(line 1227,col 41)",
        "(line 1228,col 9)-(line 1228,col 38)",
        "(line 1229,col 9)-(line 1229,col 41)",
        "(line 1230,col 9)-(line 1230,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCombineSameType()",
      "begin_line": 1233,
      "end_line": 1262,
      "comment": "",
      "child_ranges": [
        "(line 1235,col 9)-(line 1235,col 51)",
        "(line 1236,col 9)-(line 1236,col 27)",
        "(line 1237,col 9)-(line 1237,col 55)",
        "(line 1238,col 9)-(line 1238,col 55)",
        "(line 1239,col 9)-(line 1239,col 47)",
        "(line 1240,col 9)-(line 1240,col 47)",
        "(line 1241,col 9)-(line 1241,col 50)",
        "(line 1242,col 9)-(line 1246,col 9)",
        "(line 1247,col 9)-(line 1247,col 43)",
        "(line 1248,col 9)-(line 1248,col 43)",
        "(line 1249,col 9)-(line 1249,col 61)",
        "(line 1250,col 9)-(line 1261,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCombinePreconditionMixedType()",
      "begin_line": 1264,
      "end_line": 1273,
      "comment": "",
      "child_ranges": [
        "(line 1266,col 9)-(line 1266,col 28)",
        "(line 1267,col 9)-(line 1267,col 28)",
        "(line 1268,col 9)-(line 1268,col 51)",
        "(line 1269,col 9)-(line 1269,col 41)",
        "(line 1270,col 9)-(line 1270,col 38)",
        "(line 1271,col 9)-(line 1271,col 41)",
        "(line 1272,col 9)-(line 1272,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCombineMixedTypes()",
      "begin_line": 1275,
      "end_line": 1305,
      "comment": "",
      "child_ranges": [
        "(line 1277,col 9)-(line 1277,col 51)",
        "(line 1278,col 9)-(line 1278,col 27)",
        "(line 1279,col 9)-(line 1279,col 55)",
        "(line 1280,col 9)-(line 1280,col 55)",
        "(line 1281,col 9)-(line 1281,col 47)",
        "(line 1282,col 9)-(line 1282,col 47)",
        "(line 1283,col 9)-(line 1283,col 50)",
        "(line 1284,col 9)-(line 1288,col 9)",
        "(line 1289,col 9)-(line 1289,col 43)",
        "(line 1290,col 9)-(line 1290,col 48)",
        "(line 1292,col 9)-(line 1292,col 61)",
        "(line 1293,col 9)-(line 1304,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCombineToSelfPreconditionSameType()",
      "begin_line": 1307,
      "end_line": 1316,
      "comment": "",
      "child_ranges": [
        "(line 1309,col 9)-(line 1309,col 28)",
        "(line 1310,col 9)-(line 1310,col 28)",
        "(line 1311,col 9)-(line 1311,col 51)",
        "(line 1312,col 9)-(line 1312,col 41)",
        "(line 1313,col 9)-(line 1313,col 38)",
        "(line 1314,col 9)-(line 1314,col 41)",
        "(line 1315,col 9)-(line 1315,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCombineToSelfSameType()",
      "begin_line": 1318,
      "end_line": 1348,
      "comment": "",
      "child_ranges": [
        "(line 1320,col 9)-(line 1320,col 51)",
        "(line 1321,col 9)-(line 1321,col 27)",
        "(line 1322,col 9)-(line 1322,col 55)",
        "(line 1323,col 9)-(line 1323,col 55)",
        "(line 1324,col 9)-(line 1324,col 47)",
        "(line 1325,col 9)-(line 1325,col 47)",
        "(line 1326,col 9)-(line 1326,col 50)",
        "(line 1327,col 9)-(line 1331,col 9)",
        "(line 1332,col 9)-(line 1332,col 43)",
        "(line 1333,col 9)-(line 1333,col 43)",
        "(line 1334,col 9)-(line 1334,col 55)",
        "(line 1335,col 9)-(line 1335,col 44)",
        "(line 1336,col 9)-(line 1347,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCombineToSelfPreconditionMixedType()",
      "begin_line": 1350,
      "end_line": 1359,
      "comment": "",
      "child_ranges": [
        "(line 1352,col 9)-(line 1352,col 28)",
        "(line 1353,col 9)-(line 1353,col 28)",
        "(line 1354,col 9)-(line 1354,col 51)",
        "(line 1355,col 9)-(line 1355,col 41)",
        "(line 1356,col 9)-(line 1356,col 38)",
        "(line 1357,col 9)-(line 1357,col 46)",
        "(line 1358,col 9)-(line 1358,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCombineToSelfMixedTypes()",
      "begin_line": 1361,
      "end_line": 1391,
      "comment": "",
      "child_ranges": [
        "(line 1363,col 9)-(line 1363,col 51)",
        "(line 1364,col 9)-(line 1364,col 27)",
        "(line 1365,col 9)-(line 1365,col 55)",
        "(line 1366,col 9)-(line 1366,col 55)",
        "(line 1367,col 9)-(line 1367,col 47)",
        "(line 1368,col 9)-(line 1368,col 47)",
        "(line 1369,col 9)-(line 1369,col 50)",
        "(line 1370,col 9)-(line 1374,col 9)",
        "(line 1375,col 9)-(line 1375,col 43)",
        "(line 1376,col 9)-(line 1376,col 43)",
        "(line 1377,col 9)-(line 1377,col 55)",
        "(line 1378,col 9)-(line 1378,col 44)",
        "(line 1379,col 9)-(line 1390,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInDefaultOrderPreservingVisitor1()",
      "begin_line": 1398,
      "end_line": 1429,
      "comment": " The whole vector is visited. ",
      "child_ranges": [
        "(line 1400,col 9)-(line 1402,col 10)",
        "(line 1403,col 9)-(line 1403,col 42)",
        "(line 1404,col 9)-(line 1404,col 50)",
        "(line 1405,col 9)-(line 1427,col 10)",
        "(line 1428,col 9)-(line 1428,col 38)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "expectedIndex"
      ],
      "begin_line": 1407,
      "end_line": 1407,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-eda9d4aa-8216-477f-aa56-921992046511.visit(int, double)",
      "begin_line": 1409,
      "end_line": 1414,
      "comment": "",
      "child_ranges": [
        "(line 1410,col 17)-(line 1410,col 64)",
        "(line 1411,col 17)-(line 1412,col 72)",
        "(line 1413,col 17)-(line 1413,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-16a2a17d-2ac3-444e-a8f5-3b706c9fdb5c.start(int, int, int)",
      "begin_line": 1416,
      "end_line": 1422,
      "comment": "",
      "child_ranges": [
        "(line 1418,col 17)-(line 1418,col 61)",
        "(line 1419,col 17)-(line 1419,col 52)",
        "(line 1420,col 17)-(line 1420,col 64)",
        "(line 1421,col 17)-(line 1421,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-ca1e5620-c603-49a7-9390-8e7c4dea1294.end()",
      "begin_line": 1424,
      "end_line": 1426,
      "comment": "",
      "child_ranges": [
        "(line 1425,col 17)-(line 1425,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInDefaultOrderPreservingVisitor2()",
      "begin_line": 1432,
      "end_line": 1480,
      "comment": " Visiting an invalid subvector. ",
      "child_ranges": [
        "(line 1434,col 9)-(line 1434,col 51)",
        "(line 1435,col 9)-(line 1435,col 50)",
        "(line 1436,col 9)-(line 1449,col 10)",
        "(line 1450,col 9)-(line 1455,col 9)",
        "(line 1456,col 9)-(line 1461,col 9)",
        "(line 1462,col 9)-(line 1467,col 9)",
        "(line 1468,col 9)-(line 1473,col 9)",
        "(line 1474,col 9)-(line 1479,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-9ca3e124-e4c9-42fc-b80b-bec8c167b745.visit(int, double)",
      "begin_line": 1438,
      "end_line": 1440,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-2fac2a99-2a39-466f-9e8f-d97978a24dc9.start(int, int, int)",
      "begin_line": 1442,
      "end_line": 1444,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-4d28a7a1-8345-4c30-a906-96413bdaf49d.end()",
      "begin_line": 1446,
      "end_line": 1448,
      "comment": "",
      "child_ranges": [
        "(line 1447,col 17)-(line 1447,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInDefaultOrderPreservingVisitor3()",
      "begin_line": 1483,
      "end_line": 1516,
      "comment": " Visiting a valid subvector. ",
      "child_ranges": [
        "(line 1485,col 9)-(line 1487,col 10)",
        "(line 1488,col 9)-(line 1488,col 36)",
        "(line 1489,col 9)-(line 1489,col 34)",
        "(line 1490,col 9)-(line 1490,col 42)",
        "(line 1491,col 9)-(line 1491,col 50)",
        "(line 1492,col 9)-(line 1514,col 10)",
        "(line 1515,col 9)-(line 1515,col 66)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "expectedIndex"
      ],
      "begin_line": 1494,
      "end_line": 1494,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-ad69ac1a-1c24-4d46-9358-94b37435d05c.visit(int, double)",
      "begin_line": 1496,
      "end_line": 1501,
      "comment": "",
      "child_ranges": [
        "(line 1497,col 17)-(line 1497,col 64)",
        "(line 1498,col 17)-(line 1499,col 72)",
        "(line 1500,col 17)-(line 1500,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-33e0d9bb-645d-499b-b649-314fd452f05d.start(int, int, int)",
      "begin_line": 1503,
      "end_line": 1509,
      "comment": "",
      "child_ranges": [
        "(line 1505,col 17)-(line 1505,col 61)",
        "(line 1506,col 17)-(line 1506,col 64)",
        "(line 1507,col 17)-(line 1507,col 60)",
        "(line 1508,col 17)-(line 1508,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-fbdc7ffd-940a-4f2b-bd79-dfd865311288.end()",
      "begin_line": 1511,
      "end_line": 1513,
      "comment": "",
      "child_ranges": [
        "(line 1512,col 17)-(line 1512,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInOptimizedOrderPreservingVisitor1()",
      "begin_line": 1519,
      "end_line": 1552,
      "comment": " The whole vector is visited. ",
      "child_ranges": [
        "(line 1521,col 9)-(line 1523,col 10)",
        "(line 1524,col 9)-(line 1524,col 42)",
        "(line 1525,col 9)-(line 1525,col 50)",
        "(line 1526,col 9)-(line 1550,col 10)",
        "(line 1551,col 9)-(line 1551,col 40)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "visited"
      ],
      "begin_line": 1527,
      "end_line": 1527,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-1d3cd302-aeab-42af-886a-07724b1fa821.visit(int, double)",
      "begin_line": 1529,
      "end_line": 1533,
      "comment": "",
      "child_ranges": [
        "(line 1530,col 17)-(line 1530,col 44)",
        "(line 1531,col 17)-(line 1532,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-60ac29df-e854-4868-8861-271112a841f3.start(int, int, int)",
      "begin_line": 1535,
      "end_line": 1541,
      "comment": "",
      "child_ranges": [
        "(line 1537,col 17)-(line 1537,col 61)",
        "(line 1538,col 17)-(line 1538,col 52)",
        "(line 1539,col 17)-(line 1539,col 64)",
        "(line 1540,col 17)-(line 1540,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-80ac9d18-8307-4c60-8d1f-d1cb9cb18ef5.end()",
      "begin_line": 1543,
      "end_line": 1549,
      "comment": "",
      "child_ranges": [
        "(line 1544,col 17)-(line 1547,col 17)",
        "(line 1548,col 17)-(line 1548,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInOptimizedOrderPreservingVisitor2()",
      "begin_line": 1555,
      "end_line": 1603,
      "comment": " Visiting an invalid subvector. ",
      "child_ranges": [
        "(line 1557,col 9)-(line 1557,col 51)",
        "(line 1558,col 9)-(line 1558,col 50)",
        "(line 1559,col 9)-(line 1572,col 10)",
        "(line 1573,col 9)-(line 1578,col 9)",
        "(line 1579,col 9)-(line 1584,col 9)",
        "(line 1585,col 9)-(line 1590,col 9)",
        "(line 1591,col 9)-(line 1596,col 9)",
        "(line 1597,col 9)-(line 1602,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-e61eb208-4778-4771-8093-c5145f55a4f8.visit(int, double)",
      "begin_line": 1561,
      "end_line": 1563,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-e8603a7c-40b4-45bc-880f-bfcde7e39877.start(int, int, int)",
      "begin_line": 1565,
      "end_line": 1567,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-5a027fd9-7a96-4f9f-aef7-cfee938a6d19.end()",
      "begin_line": 1569,
      "end_line": 1571,
      "comment": "",
      "child_ranges": [
        "(line 1570,col 17)-(line 1570,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInOptimizedOrderPreservingVisitor3()",
      "begin_line": 1606,
      "end_line": 1641,
      "comment": " Visiting a valid subvector. ",
      "child_ranges": [
        "(line 1608,col 9)-(line 1610,col 10)",
        "(line 1611,col 9)-(line 1611,col 36)",
        "(line 1612,col 9)-(line 1612,col 34)",
        "(line 1613,col 9)-(line 1613,col 42)",
        "(line 1614,col 9)-(line 1614,col 50)",
        "(line 1615,col 9)-(line 1639,col 10)",
        "(line 1640,col 9)-(line 1640,col 68)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "visited"
      ],
      "begin_line": 1616,
      "end_line": 1616,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-f8773c7b-6ee4-4a7d-8e22-aef9166cb9e5.visit(int, double)",
      "begin_line": 1618,
      "end_line": 1622,
      "comment": "",
      "child_ranges": [
        "(line 1619,col 17)-(line 1620,col 72)",
        "(line 1621,col 17)-(line 1621,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-d9ee3fee-a5be-4837-94d3-8f4e62842ad3.start(int, int, int)",
      "begin_line": 1624,
      "end_line": 1630,
      "comment": "",
      "child_ranges": [
        "(line 1626,col 17)-(line 1626,col 61)",
        "(line 1627,col 17)-(line 1627,col 64)",
        "(line 1628,col 17)-(line 1628,col 60)",
        "(line 1629,col 17)-(line 1629,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-09dc0b41-f4c4-43a6-8f1a-24527cfcd7af.end()",
      "begin_line": 1632,
      "end_line": 1638,
      "comment": "",
      "child_ranges": [
        "(line 1633,col 17)-(line 1636,col 17)",
        "(line 1637,col 17)-(line 1637,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInDefaultOrderChangingVisitor1()",
      "begin_line": 1644,
      "end_line": 1679,
      "comment": " The whole vector is visited. ",
      "child_ranges": [
        "(line 1646,col 9)-(line 1648,col 10)",
        "(line 1649,col 9)-(line 1649,col 42)",
        "(line 1650,col 9)-(line 1650,col 48)",
        "(line 1651,col 9)-(line 1674,col 10)",
        "(line 1675,col 9)-(line 1675,col 38)",
        "(line 1676,col 9)-(line 1678,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "expectedIndex"
      ],
      "begin_line": 1653,
      "end_line": 1653,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-d246f460-ec48-41e0-89c3-c77500f70707.visit(int, double)",
      "begin_line": 1655,
      "end_line": 1661,
      "comment": "",
      "child_ranges": [
        "(line 1656,col 17)-(line 1656,col 64)",
        "(line 1657,col 17)-(line 1658,col 72)",
        "(line 1659,col 17)-(line 1659,col 32)",
        "(line 1660,col 17)-(line 1660,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-5c89d96f-812c-4ad0-8de9-7f76a91e175b.start(int, int, int)",
      "begin_line": 1663,
      "end_line": 1669,
      "comment": "",
      "child_ranges": [
        "(line 1665,col 17)-(line 1665,col 61)",
        "(line 1666,col 17)-(line 1666,col 52)",
        "(line 1667,col 17)-(line 1667,col 64)",
        "(line 1668,col 17)-(line 1668,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-994169e2-abc7-44e1-9114-525a0b85201a.end()",
      "begin_line": 1671,
      "end_line": 1673,
      "comment": "",
      "child_ranges": [
        "(line 1672,col 17)-(line 1672,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInDefaultOrderChangingVisitor2()",
      "begin_line": 1682,
      "end_line": 1730,
      "comment": " Visiting an invalid subvector. ",
      "child_ranges": [
        "(line 1684,col 9)-(line 1684,col 51)",
        "(line 1685,col 9)-(line 1685,col 48)",
        "(line 1686,col 9)-(line 1699,col 10)",
        "(line 1700,col 9)-(line 1705,col 9)",
        "(line 1706,col 9)-(line 1711,col 9)",
        "(line 1712,col 9)-(line 1717,col 9)",
        "(line 1718,col 9)-(line 1723,col 9)",
        "(line 1724,col 9)-(line 1729,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-64116efd-f360-42c8-8370-6cba0667e323.visit(int, double)",
      "begin_line": 1688,
      "end_line": 1690,
      "comment": "",
      "child_ranges": [
        "(line 1689,col 17)-(line 1689,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-e3364575-e8de-481f-b8f2-112d1d8a6c0f.start(int, int, int)",
      "begin_line": 1692,
      "end_line": 1694,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-060fc451-1cca-471d-8f14-4f9473d8e57e.end()",
      "begin_line": 1696,
      "end_line": 1698,
      "comment": "",
      "child_ranges": [
        "(line 1697,col 17)-(line 1697,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInDefaultOrderChangingVisitor3()",
      "begin_line": 1733,
      "end_line": 1770,
      "comment": " Visiting a valid subvector. ",
      "child_ranges": [
        "(line 1735,col 9)-(line 1737,col 10)",
        "(line 1738,col 9)-(line 1738,col 36)",
        "(line 1739,col 9)-(line 1739,col 34)",
        "(line 1740,col 9)-(line 1740,col 42)",
        "(line 1741,col 9)-(line 1741,col 48)",
        "(line 1742,col 9)-(line 1765,col 10)",
        "(line 1766,col 9)-(line 1766,col 66)",
        "(line 1767,col 9)-(line 1769,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "expectedIndex"
      ],
      "begin_line": 1744,
      "end_line": 1744,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-ce56ca27-4968-422c-895c-227245ab2c42.visit(int, double)",
      "begin_line": 1746,
      "end_line": 1752,
      "comment": "",
      "child_ranges": [
        "(line 1747,col 17)-(line 1747,col 64)",
        "(line 1748,col 17)-(line 1749,col 72)",
        "(line 1750,col 17)-(line 1750,col 32)",
        "(line 1751,col 17)-(line 1751,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-ccf282ff-1e63-464b-a0be-de7f96d5a8f6.start(int, int, int)",
      "begin_line": 1754,
      "end_line": 1760,
      "comment": "",
      "child_ranges": [
        "(line 1756,col 17)-(line 1756,col 61)",
        "(line 1757,col 17)-(line 1757,col 64)",
        "(line 1758,col 17)-(line 1758,col 60)",
        "(line 1759,col 17)-(line 1759,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-f381bb8c-d1f0-4e26-921d-41c98addec8c.end()",
      "begin_line": 1762,
      "end_line": 1764,
      "comment": "",
      "child_ranges": [
        "(line 1763,col 17)-(line 1763,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInOptimizedOrderChangingVisitor1()",
      "begin_line": 1773,
      "end_line": 1810,
      "comment": " The whole vector is visited. ",
      "child_ranges": [
        "(line 1775,col 9)-(line 1777,col 10)",
        "(line 1778,col 9)-(line 1778,col 42)",
        "(line 1779,col 9)-(line 1779,col 48)",
        "(line 1780,col 9)-(line 1805,col 10)",
        "(line 1806,col 9)-(line 1806,col 40)",
        "(line 1807,col 9)-(line 1809,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "visited"
      ],
      "begin_line": 1781,
      "end_line": 1781,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-09a7a08f-7d6a-4439-9312-2dc73ca2a5ba.visit(int, double)",
      "begin_line": 1783,
      "end_line": 1788,
      "comment": "",
      "child_ranges": [
        "(line 1784,col 17)-(line 1784,col 44)",
        "(line 1785,col 17)-(line 1786,col 72)",
        "(line 1787,col 17)-(line 1787,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-eb748dcf-4e2a-4437-a7e2-7eff69ca3d50.start(int, int, int)",
      "begin_line": 1790,
      "end_line": 1796,
      "comment": "",
      "child_ranges": [
        "(line 1792,col 17)-(line 1792,col 61)",
        "(line 1793,col 17)-(line 1793,col 52)",
        "(line 1794,col 17)-(line 1794,col 64)",
        "(line 1795,col 17)-(line 1795,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-67897446-b34d-4e15-b1f6-b186f13ae071.end()",
      "begin_line": 1798,
      "end_line": 1804,
      "comment": "",
      "child_ranges": [
        "(line 1799,col 17)-(line 1802,col 17)",
        "(line 1803,col 17)-(line 1803,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInOptimizedOrderChangingVisitor2()",
      "begin_line": 1813,
      "end_line": 1861,
      "comment": " Visiting an invalid subvector. ",
      "child_ranges": [
        "(line 1815,col 9)-(line 1815,col 51)",
        "(line 1816,col 9)-(line 1816,col 48)",
        "(line 1817,col 9)-(line 1830,col 10)",
        "(line 1831,col 9)-(line 1836,col 9)",
        "(line 1837,col 9)-(line 1842,col 9)",
        "(line 1843,col 9)-(line 1848,col 9)",
        "(line 1849,col 9)-(line 1854,col 9)",
        "(line 1855,col 9)-(line 1860,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-3cc673a7-e90f-4248-997d-7d0408edfdf9.visit(int, double)",
      "begin_line": 1819,
      "end_line": 1821,
      "comment": "",
      "child_ranges": [
        "(line 1820,col 17)-(line 1820,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-ff1061e6-101c-4b07-affc-e6ba31d25cc6.start(int, int, int)",
      "begin_line": 1823,
      "end_line": 1825,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-2ad53aeb-011e-48cf-a3af-a3bcada690c7.end()",
      "begin_line": 1827,
      "end_line": 1829,
      "comment": "",
      "child_ranges": [
        "(line 1828,col 17)-(line 1828,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInOptimizedOrderChangingVisitor3()",
      "begin_line": 1864,
      "end_line": 1903,
      "comment": " Visiting a valid subvector. ",
      "child_ranges": [
        "(line 1866,col 9)-(line 1868,col 10)",
        "(line 1869,col 9)-(line 1869,col 36)",
        "(line 1870,col 9)-(line 1870,col 34)",
        "(line 1871,col 9)-(line 1871,col 42)",
        "(line 1872,col 9)-(line 1872,col 48)",
        "(line 1873,col 9)-(line 1898,col 10)",
        "(line 1899,col 9)-(line 1899,col 68)",
        "(line 1900,col 9)-(line 1902,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "visited"
      ],
      "begin_line": 1874,
      "end_line": 1874,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-b7a35d5e-1cd0-45d8-a8e1-ffa328f8074e.visit(int, double)",
      "begin_line": 1876,
      "end_line": 1881,
      "comment": "",
      "child_ranges": [
        "(line 1877,col 17)-(line 1878,col 72)",
        "(line 1879,col 17)-(line 1879,col 44)",
        "(line 1880,col 17)-(line 1880,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-cd71a086-79c1-487e-a0a3-8d478806106e.start(int, int, int)",
      "begin_line": 1883,
      "end_line": 1889,
      "comment": "",
      "child_ranges": [
        "(line 1885,col 17)-(line 1885,col 61)",
        "(line 1886,col 17)-(line 1886,col 64)",
        "(line 1887,col 17)-(line 1887,col 60)",
        "(line 1888,col 17)-(line 1888,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-89c945b2-c6b1-41c2-b9db-55b03c2402f0.end()",
      "begin_line": 1891,
      "end_line": 1897,
      "comment": "",
      "child_ranges": [
        "(line 1892,col 17)-(line 1895,col 17)",
        "(line 1896,col 17)-(line 1896,col 27)"
      ]
    }
  ]
}