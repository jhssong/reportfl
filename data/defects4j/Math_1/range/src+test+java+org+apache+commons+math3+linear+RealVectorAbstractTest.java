{
  "filepath": "/tmp/Math-1b/src/test/java/org/apache/commons/math3/linear/RealVectorAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealVectorAbstractTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 62,
      "end_line": 1977,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": "\n     * \u003cp\u003e\n     * This is an attempt at covering most particular cases of combining two\n     * values. Here {@code x} is the value returned by\n     * {@link #getPreferredEntryValue()}, while {@code y} and {@code z} are two\n     * \"normal\" values.\n     * \u003c/p\u003e\n     * \u003col\u003e\n     *   \u003cli\u003e\n     *     Addition: the following cases should be covered\n     *     \u003cul\u003e\n     *       \u003cli\u003e{@code (2 * x) + (-x)}\u003c/li\u003e\n     *       \u003cli\u003e{@code (-x) + 2 * x}\u003c/li\u003e\n     *       \u003cli\u003e{@code x + y}\u003c/li\u003e\n     *       \u003cli\u003e{@code y + x}\u003c/li\u003e\n     *       \u003cli\u003e{@code y + z}\u003c/li\u003e\n     *       \u003cli\u003e{@code y + (x - y)}\u003c/li\u003e\n     *       \u003cli\u003e{@code (y - x) + x}\u003c/li\u003e\n     *     \u003c/ul\u003e\n     *     The values to be considered are:\n     *     {@code x, y, z, 2 * x, -x, x - y, y - x}.\n     *   \u003c/li\u003e\n     *   \u003cli\u003e\n     *     Subtraction: the following cases should be covered\n     *     \u003cul\u003e\n     *       \u003cli\u003e{@code (2 * x) - x}\u003c/li\u003e\n     *       \u003cli\u003e{@code x - y}\u003c/li\u003e\n     *       \u003cli\u003e{@code y - x}\u003c/li\u003e\n     *       \u003cli\u003e{@code y - z}\u003c/li\u003e\n     *       \u003cli\u003e{@code y - (y - x)}\u003c/li\u003e\n     *       \u003cli\u003e{@code (y + x) - y}\u003c/li\u003e\n     *     \u003c/ul\u003e\n     *     The values to be considered are: {@code x, y, z, x + y, y - x}.\n     *   \u003c/li\u003e\n     *   \u003cli\u003e\n     *     Multiplication\n     *     \u003cul\u003e\n     *       \u003cli\u003e{@code (x * x) * (1 / x)}\u003c/li\u003e\n     *       \u003cli\u003e{@code (1 / x) * (x * x)}\u003c/li\u003e\n     *       \u003cli\u003e{@code x * y}\u003c/li\u003e\n     *       \u003cli\u003e{@code y * x}\u003c/li\u003e\n     *       \u003cli\u003e{@code y * z}\u003c/li\u003e\n     *     \u003c/ul\u003e\n     *     The values to be considered are: {@code x, y, z, 1 / x, x * x}.\n     *   \u003c/li\u003e\n     *   \u003cli\u003e\n     *     Division\n     *     \u003cul\u003e\n     *       \u003cli\u003e{@code (x * x) / x}\u003c/li\u003e\n     *       \u003cli\u003e{@code x / y}\u003c/li\u003e\n     *       \u003cli\u003e{@code y / x}\u003c/li\u003e\n     *       \u003cli\u003e{@code y / z}\u003c/li\u003e\n     *     \u003c/ul\u003e\n     *     The values to be considered are: {@code x, y, z, x * x}.\n     *   \u003c/li\u003e\n     * \u003c/ol\u003e\n     * Also to be considered {@code NaN}, {@code POSITIVE_INFINITY},\n     * {@code NEGATIVE_INFINITY}, {@code +0.0}, {@code -0.0}.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.create(double[])",
      "begin_line": 139,
      "end_line": 139,
      "comment": "\n     * Creates a new instance of {@link RealVector}, with specified entries.\n     * The returned vector must be of the type currently tested. It should be\n     * noted that some tests assume that no references to the specified\n     * {@code double[]} are kept in the returned object: if necessary, defensive\n     * copy of this array should be made.\n     *\n     * @param data the entries of the vector to be created\n     * @return a new {@link RealVector} of the type to be tested\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.createAlien(double[])",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * Creates a new instance of {@link RealVector}, with specified entries.\n     * The type of the returned vector must be different from the type currently\n     * tested. It should be noted that some tests assume that no references to\n     * the specified {@code double[]} are kept in the returned object: if\n     * necessary, defensive copy of this array should be made.\n     *\n     * @param data the entries of the vector to be created\n     * @return a new {@link RealVector} of an alien type\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.getPreferredEntryValue()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * Returns a preferred value of the entries, to be tested specifically. Some\n     * implementations of {@link RealVector} (e.g. {@link OpenMapRealVector}) do\n     * not store specific values of entries. In order to ensure that all tests\n     * take into account this specific value, some entries of the vectors to be\n     * tested are deliberately set to the value returned by the present method.\n     * The default implementation returns {@code 0.0}.\n     *\n     * @return a value which \u003cem\u003eshould\u003c/em\u003e be present in all vectors to be\n     * tested\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.RealVectorAbstractTest()",
      "begin_line": 170,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 50)",
        "(line 177,col 9)-(line 177,col 32)",
        "(line 178,col 9)-(line 178,col 32)",
        "(line 180,col 9)-(line 184,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetDimension()",
      "begin_line": 187,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 50)",
        "(line 190,col 9)-(line 190,col 44)",
        "(line 191,col 9)-(line 191,col 72)",
        "(line 192,col 9)-(line 192,col 31)",
        "(line 193,col 9)-(line 193,col 44)",
        "(line 194,col 9)-(line 194,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetEntry()",
      "begin_line": 197,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 50)",
        "(line 200,col 9)-(line 200,col 48)",
        "(line 201,col 9)-(line 201,col 42)",
        "(line 202,col 9)-(line 204,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetEntryInvalidIndex1()",
      "begin_line": 207,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetEntryInvalidIndex2()",
      "begin_line": 212,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testSetEntry()",
      "begin_line": 217,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 50)",
        "(line 220,col 9)-(line 220,col 48)",
        "(line 221,col 9)-(line 221,col 58)",
        "(line 222,col 9)-(line 222,col 47)",
        "(line 227,col 9)-(line 236,col 9)",
        "(line 241,col 9)-(line 250,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testSetEntryInvalidIndex1()",
      "begin_line": 253,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testSetEntryInvalidIndex2()",
      "begin_line": 258,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testAddToEntry()",
      "begin_line": 263,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 50)",
        "(line 266,col 9)-(line 266,col 49)",
        "(line 267,col 9)-(line 267,col 52)",
        "(line 269,col 9)-(line 269,col 59)",
        "(line 270,col 9)-(line 270,col 48)",
        "(line 275,col 9)-(line 275,col 30)",
        "(line 276,col 9)-(line 284,col 9)",
        "(line 289,col 9)-(line 298,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testAddToEntryInvalidIndex1()",
      "begin_line": 301,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testAddToEntryInvalidIndex2()",
      "begin_line": 306,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.doTestAppendVector(java.lang.String, org.apache.commons.math3.linear.RealVector, org.apache.commons.math3.linear.RealVector, double)",
      "begin_line": 311,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 41)",
        "(line 315,col 9)-(line 315,col 41)",
        "(line 316,col 9)-(line 316,col 43)",
        "(line 317,col 9)-(line 317,col 64)",
        "(line 318,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 325,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testAppendVector()",
      "begin_line": 328,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 50)",
        "(line 331,col 9)-(line 331,col 50)",
        "(line 332,col 9)-(line 332,col 53)",
        "(line 334,col 9)-(line 334,col 74)",
        "(line 335,col 9)-(line 335,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.doTestAppendScalar(java.lang.String, org.apache.commons.math3.linear.RealVector, double, double)",
      "begin_line": 338,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 39)",
        "(line 342,col 9)-(line 342,col 41)",
        "(line 343,col 9)-(line 343,col 62)",
        "(line 344,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 53)",
        "(line 349,col 9)-(line 349,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testAppendScalar()",
      "begin_line": 352,
      "end_line": 359,
      "comment": "",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 50)",
        "(line 355,col 9)-(line 355,col 61)",
        "(line 357,col 9)-(line 357,col 53)",
        "(line 358,col 9)-(line 358,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetSubVector()",
      "begin_line": 361,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 50)",
        "(line 364,col 9)-(line 364,col 83)",
        "(line 365,col 9)-(line 365,col 28)",
        "(line 366,col 9)-(line 366,col 38)",
        "(line 367,col 9)-(line 367,col 70)",
        "(line 368,col 9)-(line 368,col 48)",
        "(line 369,col 9)-(line 369,col 54)",
        "(line 370,col 9)-(line 370,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetSubVectorInvalidIndex1()",
      "begin_line": 373,
      "end_line": 377,
      "comment": "",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 25)",
        "(line 376,col 9)-(line 376,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetSubVectorInvalidIndex2()",
      "begin_line": 379,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 25)",
        "(line 382,col 9)-(line 382,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetSubVectorInvalidIndex3()",
      "begin_line": 385,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 25)",
        "(line 388,col 9)-(line 388,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetSubVectorInvalidIndex4()",
      "begin_line": 391,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 25)",
        "(line 394,col 9)-(line 394,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testSetSubVectorSameType()",
      "begin_line": 397,
      "end_line": 410,
      "comment": "",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 50)",
        "(line 400,col 9)-(line 400,col 87)",
        "(line 401,col 9)-(line 401,col 49)",
        "(line 402,col 9)-(line 402,col 51)",
        "(line 403,col 9)-(line 403,col 28)",
        "(line 404,col 9)-(line 404,col 48)",
        "(line 406,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 409,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testSetSubVectorMixedType()",
      "begin_line": 412,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 50)",
        "(line 415,col 9)-(line 415,col 87)",
        "(line 416,col 9)-(line 416,col 49)",
        "(line 417,col 9)-(line 417,col 51)",
        "(line 418,col 9)-(line 418,col 28)",
        "(line 419,col 9)-(line 419,col 53)",
        "(line 421,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 424,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testSetSubVectorInvalidIndex1()",
      "begin_line": 427,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testSetSubVectorInvalidIndex2()",
      "begin_line": 432,
      "end_line": 435,
      "comment": "",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testSetSubVectorInvalidIndex3()",
      "begin_line": 437,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testIsNaN()",
      "begin_line": 442,
      "end_line": 449,
      "comment": "",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 60)",
        "(line 446,col 9)-(line 446,col 38)",
        "(line 447,col 9)-(line 447,col 34)",
        "(line 448,col 9)-(line 448,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testIsInfinite()",
      "begin_line": 451,
      "end_line": 460,
      "comment": "",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 62)",
        "(line 455,col 9)-(line 455,col 43)",
        "(line 456,col 9)-(line 456,col 48)",
        "(line 457,col 9)-(line 457,col 42)",
        "(line 458,col 9)-(line 458,col 34)",
        "(line 459,col 9)-(line 459,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.doTestEbeBinaryOperation(org.apache.commons.math3.linear.RealVectorAbstractTest.BinaryOperation, boolean)",
      "begin_line": 462,
      "end_line": 515,
      "comment": "",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 73)",
        "(line 464,col 9)-(line 464,col 73)",
        "(line 465,col 9)-(line 465,col 18)",
        "(line 466,col 9)-(line 472,col 9)",
        "(line 473,col 9)-(line 473,col 44)",
        "(line 474,col 9)-(line 474,col 73)",
        "(line 475,col 9)-(line 475,col 32)",
        "(line 476,col 9)-(line 491,col 9)",
        "(line 492,col 9)-(line 492,col 59)",
        "(line 493,col 9)-(line 510,col 9)",
        "(line 511,col 9)-(line 514,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.doTestEbeBinaryOperationDimensionMismatch(org.apache.commons.math3.linear.RealVectorAbstractTest.BinaryOperation)",
      "begin_line": 517,
      "end_line": 535,
      "comment": "",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 25)",
        "(line 519,col 9)-(line 534,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testAddSameType()",
      "begin_line": 537,
      "end_line": 540,
      "comment": "",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testAddMixedTypes()",
      "begin_line": 542,
      "end_line": 545,
      "comment": "",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testAddDimensionMismatch()",
      "begin_line": 547,
      "end_line": 550,
      "comment": "",
      "child_ranges": [
        "(line 549,col 9)-(line 549,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testSubtractSameType()",
      "begin_line": 552,
      "end_line": 555,
      "comment": "",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testSubtractMixedTypes()",
      "begin_line": 557,
      "end_line": 560,
      "comment": "",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testSubtractDimensionMismatch()",
      "begin_line": 562,
      "end_line": 565,
      "comment": "",
      "child_ranges": [
        "(line 564,col 9)-(line 564,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testEbeMultiplySameType()",
      "begin_line": 567,
      "end_line": 571,
      "comment": "",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testEbeMultiplyMixedTypes()",
      "begin_line": 573,
      "end_line": 577,
      "comment": "",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testEbeMultiplyDimensionMismatch()",
      "begin_line": 579,
      "end_line": 583,
      "comment": "",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testEbeDivideSameType()",
      "begin_line": 585,
      "end_line": 589,
      "comment": "",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testEbeDivideMixedTypes()",
      "begin_line": 591,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testEbeDivideDimensionMismatch()",
      "begin_line": 597,
      "end_line": 601,
      "comment": "",
      "child_ranges": [
        "(line 600,col 9)-(line 600,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.doTestGetDistance(boolean)",
      "begin_line": 603,
      "end_line": 622,
      "comment": "",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 50)",
        "(line 605,col 9)-(line 605,col 77)",
        "(line 606,col 9)-(line 606,col 79)",
        "(line 607,col 9)-(line 607,col 44)",
        "(line 608,col 9)-(line 608,col 28)",
        "(line 609,col 9)-(line 613,col 9)",
        "(line 614,col 9)-(line 614,col 49)",
        "(line 615,col 9)-(line 615,col 29)",
        "(line 616,col 9)-(line 619,col 9)",
        "(line 620,col 9)-(line 620,col 43)",
        "(line 621,col 9)-(line 621,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetDistanceSameType()",
      "begin_line": 624,
      "end_line": 627,
      "comment": "",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetDistanceMixedTypes()",
      "begin_line": 629,
      "end_line": 632,
      "comment": "",
      "child_ranges": [
        "(line 631,col 9)-(line 631,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetDistanceDimensionMismatch()",
      "begin_line": 634,
      "end_line": 637,
      "comment": "",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetNorm()",
      "begin_line": 639,
      "end_line": 651,
      "comment": "",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 50)",
        "(line 642,col 9)-(line 642,col 76)",
        "(line 643,col 9)-(line 643,col 42)",
        "(line 644,col 9)-(line 644,col 42)",
        "(line 645,col 9)-(line 645,col 29)",
        "(line 646,col 9)-(line 648,col 9)",
        "(line 649,col 9)-(line 649,col 43)",
        "(line 650,col 9)-(line 650,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.doTestGetL1Distance(boolean)",
      "begin_line": 653,
      "end_line": 671,
      "comment": "",
      "child_ranges": [
        "(line 654,col 9)-(line 654,col 50)",
        "(line 655,col 9)-(line 655,col 77)",
        "(line 656,col 9)-(line 656,col 79)",
        "(line 657,col 9)-(line 657,col 44)",
        "(line 658,col 9)-(line 658,col 28)",
        "(line 659,col 9)-(line 663,col 9)",
        "(line 664,col 9)-(line 664,col 51)",
        "(line 665,col 9)-(line 665,col 29)",
        "(line 666,col 9)-(line 669,col 9)",
        "(line 670,col 9)-(line 670,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetL1DistanceSameType()",
      "begin_line": 673,
      "end_line": 676,
      "comment": "",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetL1DistanceMixedTypes()",
      "begin_line": 678,
      "end_line": 681,
      "comment": "",
      "child_ranges": [
        "(line 680,col 9)-(line 680,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetL1DistanceDimensionMismatch()",
      "begin_line": 683,
      "end_line": 686,
      "comment": "",
      "child_ranges": [
        "(line 685,col 9)-(line 685,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetL1Norm()",
      "begin_line": 688,
      "end_line": 700,
      "comment": "",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 50)",
        "(line 691,col 9)-(line 691,col 76)",
        "(line 692,col 9)-(line 692,col 42)",
        "(line 693,col 9)-(line 693,col 44)",
        "(line 694,col 9)-(line 694,col 29)",
        "(line 695,col 9)-(line 697,col 9)",
        "(line 698,col 9)-(line 698,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.doTestGetLInfDistance(boolean)",
      "begin_line": 702,
      "end_line": 720,
      "comment": "",
      "child_ranges": [
        "(line 703,col 9)-(line 703,col 50)",
        "(line 704,col 9)-(line 704,col 77)",
        "(line 705,col 9)-(line 705,col 79)",
        "(line 706,col 9)-(line 706,col 44)",
        "(line 707,col 9)-(line 707,col 28)",
        "(line 708,col 9)-(line 712,col 9)",
        "(line 713,col 9)-(line 713,col 53)",
        "(line 714,col 9)-(line 714,col 29)",
        "(line 715,col 9)-(line 718,col 9)",
        "(line 719,col 9)-(line 719,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetLInfDistanceSameType()",
      "begin_line": 722,
      "end_line": 725,
      "comment": "",
      "child_ranges": [
        "(line 724,col 9)-(line 724,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetLInfDistanceMixedTypes()",
      "begin_line": 727,
      "end_line": 730,
      "comment": "",
      "child_ranges": [
        "(line 729,col 9)-(line 729,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetLInfDistanceDimensionMismatch()",
      "begin_line": 732,
      "end_line": 735,
      "comment": "",
      "child_ranges": [
        "(line 734,col 9)-(line 734,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testGetLInfNorm()",
      "begin_line": 737,
      "end_line": 749,
      "comment": "",
      "child_ranges": [
        "(line 739,col 9)-(line 739,col 50)",
        "(line 740,col 9)-(line 740,col 76)",
        "(line 741,col 9)-(line 741,col 42)",
        "(line 742,col 9)-(line 742,col 46)",
        "(line 743,col 9)-(line 743,col 29)",
        "(line 744,col 9)-(line 746,col 9)",
        "(line 747,col 9)-(line 747,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.doTestMapBinaryOperation(org.apache.commons.math3.linear.RealVectorAbstractTest.BinaryOperation, boolean)",
      "begin_line": 751,
      "end_line": 812,
      "comment": "",
      "child_ranges": [
        "(line 752,col 9)-(line 752,col 60)",
        "(line 753,col 9)-(line 811,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testMapAdd()",
      "begin_line": 814,
      "end_line": 817,
      "comment": "",
      "child_ranges": [
        "(line 816,col 9)-(line 816,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testMapAddToSelf()",
      "begin_line": 819,
      "end_line": 822,
      "comment": "",
      "child_ranges": [
        "(line 821,col 9)-(line 821,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testMapSubtract()",
      "begin_line": 824,
      "end_line": 827,
      "comment": "",
      "child_ranges": [
        "(line 826,col 9)-(line 826,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testMapSubtractToSelf()",
      "begin_line": 829,
      "end_line": 832,
      "comment": "",
      "child_ranges": [
        "(line 831,col 9)-(line 831,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testMapMultiply()",
      "begin_line": 834,
      "end_line": 837,
      "comment": "",
      "child_ranges": [
        "(line 836,col 9)-(line 836,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testMapMultiplyToSelf()",
      "begin_line": 839,
      "end_line": 842,
      "comment": "",
      "child_ranges": [
        "(line 841,col 9)-(line 841,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testMapDivide()",
      "begin_line": 844,
      "end_line": 847,
      "comment": "",
      "child_ranges": [
        "(line 846,col 9)-(line 846,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testMapDivideToSelf()",
      "begin_line": 849,
      "end_line": 852,
      "comment": "",
      "child_ranges": [
        "(line 851,col 9)-(line 851,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.doTestMapFunction(org.apache.commons.math3.analysis.UnivariateFunction, boolean)",
      "begin_line": 854,
      "end_line": 877,
      "comment": "",
      "child_ranges": [
        "(line 856,col 9)-(line 856,col 60)",
        "(line 857,col 9)-(line 857,col 60)",
        "(line 858,col 9)-(line 858,col 52)",
        "(line 859,col 9)-(line 859,col 53)",
        "(line 860,col 9)-(line 860,col 45)",
        "(line 861,col 9)-(line 861,col 46)",
        "(line 862,col 9)-(line 862,col 38)",
        "(line 863,col 9)-(line 863,col 39)",
        "(line 864,col 9)-(line 864,col 58)",
        "(line 865,col 9)-(line 867,col 9)",
        "(line 868,col 9)-(line 868,col 42)",
        "(line 869,col 9)-(line 869,col 32)",
        "(line 870,col 9)-(line 875,col 9)",
        "(line 876,col 9)-(line 876,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.createFunctions()",
      "begin_line": 879,
      "end_line": 887,
      "comment": "",
      "child_ranges": [
        "(line 880,col 9)-(line 886,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testMap()",
      "begin_line": 889,
      "end_line": 895,
      "comment": "",
      "child_ranges": [
        "(line 891,col 9)-(line 891,col 65)",
        "(line 892,col 9)-(line 894,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testMapToSelf()",
      "begin_line": 897,
      "end_line": 903,
      "comment": "",
      "child_ranges": [
        "(line 899,col 9)-(line 899,col 65)",
        "(line 900,col 9)-(line 902,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.doTestOuterProduct(boolean)",
      "begin_line": 905,
      "end_line": 931,
      "comment": "",
      "child_ranges": [
        "(line 906,col 9)-(line 906,col 38)",
        "(line 907,col 9)-(line 907,col 43)",
        "(line 908,col 9)-(line 908,col 61)",
        "(line 909,col 9)-(line 909,col 61)",
        "(line 910,col 9)-(line 910,col 34)",
        "(line 911,col 9)-(line 911,col 35)",
        "(line 912,col 9)-(line 912,col 34)",
        "(line 913,col 9)-(line 913,col 27)",
        "(line 914,col 9)-(line 918,col 9)",
        "(line 919,col 9)-(line 919,col 48)",
        "(line 920,col 9)-(line 921,col 32)",
        "(line 922,col 9)-(line 923,col 35)",
        "(line 924,col 9)-(line 930,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testOuterProductSameType()",
      "begin_line": 933,
      "end_line": 936,
      "comment": "",
      "child_ranges": [
        "(line 935,col 9)-(line 935,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testOuterProductMixedTypes()",
      "begin_line": 938,
      "end_line": 941,
      "comment": "",
      "child_ranges": [
        "(line 940,col 9)-(line 940,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.doTestProjection(boolean)",
      "begin_line": 943,
      "end_line": 971,
      "comment": "",
      "child_ranges": [
        "(line 944,col 9)-(line 944,col 50)",
        "(line 945,col 9)-(line 947,col 10)",
        "(line 948,col 9)-(line 950,col 10)",
        "(line 951,col 9)-(line 951,col 31)",
        "(line 952,col 9)-(line 952,col 26)",
        "(line 953,col 9)-(line 956,col 9)",
        "(line 957,col 9)-(line 957,col 44)",
        "(line 958,col 9)-(line 958,col 59)",
        "(line 959,col 9)-(line 961,col 9)",
        "(line 962,col 9)-(line 962,col 44)",
        "(line 963,col 9)-(line 963,col 28)",
        "(line 964,col 9)-(line 968,col 9)",
        "(line 969,col 9)-(line 969,col 52)",
        "(line 970,col 9)-(line 970,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testProjectionSameType()",
      "begin_line": 973,
      "end_line": 976,
      "comment": "",
      "child_ranges": [
        "(line 975,col 9)-(line 975,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testProjectionMixedTypes()",
      "begin_line": 978,
      "end_line": 981,
      "comment": "",
      "child_ranges": [
        "(line 980,col 9)-(line 980,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testProjectionNullVector()",
      "begin_line": 983,
      "end_line": 986,
      "comment": "",
      "child_ranges": [
        "(line 985,col 9)-(line 985,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testProjectionDimensionMismatch()",
      "begin_line": 988,
      "end_line": 994,
      "comment": "",
      "child_ranges": [
        "(line 990,col 9)-(line 990,col 52)",
        "(line 991,col 9)-(line 991,col 52)",
        "(line 992,col 9)-(line 992,col 20)",
        "(line 993,col 9)-(line 993,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testSet()",
      "begin_line": 996,
      "end_line": 1006,
      "comment": "",
      "child_ranges": [
        "(line 998,col 9)-(line 1005,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testToArray()",
      "begin_line": 1008,
      "end_line": 1015,
      "comment": "",
      "child_ranges": [
        "(line 1010,col 9)-(line 1010,col 55)",
        "(line 1011,col 9)-(line 1011,col 43)",
        "(line 1012,col 9)-(line 1014,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.doTestUnitVector(boolean)",
      "begin_line": 1017,
      "end_line": 1041,
      "comment": "",
      "child_ranges": [
        "(line 1018,col 9)-(line 1018,col 50)",
        "(line 1019,col 9)-(line 1021,col 10)",
        "(line 1022,col 9)-(line 1022,col 25)",
        "(line 1023,col 9)-(line 1025,col 9)",
        "(line 1026,col 9)-(line 1026,col 35)",
        "(line 1027,col 9)-(line 1027,col 58)",
        "(line 1028,col 9)-(line 1030,col 9)",
        "(line 1031,col 9)-(line 1031,col 42)",
        "(line 1032,col 9)-(line 1032,col 32)",
        "(line 1033,col 9)-(line 1039,col 9)",
        "(line 1040,col 9)-(line 1040,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testUnitVector()",
      "begin_line": 1043,
      "end_line": 1046,
      "comment": "",
      "child_ranges": [
        "(line 1045,col 9)-(line 1045,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testUnitize()",
      "begin_line": 1048,
      "end_line": 1051,
      "comment": "",
      "child_ranges": [
        "(line 1050,col 9)-(line 1050,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.doTestUnitVectorNullVector(boolean)",
      "begin_line": 1053,
      "end_line": 1062,
      "comment": "",
      "child_ranges": [
        "(line 1054,col 9)-(line 1056,col 10)",
        "(line 1057,col 9)-(line 1061,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testUnitVectorNullVector()",
      "begin_line": 1064,
      "end_line": 1067,
      "comment": "",
      "child_ranges": [
        "(line 1066,col 9)-(line 1066,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testUnitizeNullVector()",
      "begin_line": 1069,
      "end_line": 1072,
      "comment": "",
      "child_ranges": [
        "(line 1071,col 9)-(line 1071,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testIterator()",
      "begin_line": 1074,
      "end_line": 1097,
      "comment": "",
      "child_ranges": [
        "(line 1076,col 9)-(line 1076,col 44)",
        "(line 1077,col 9)-(line 1077,col 59)",
        "(line 1078,col 9)-(line 1089,col 9)",
        "(line 1090,col 9)-(line 1090,col 41)",
        "(line 1091,col 9)-(line 1096,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.doTestCombine(boolean, boolean)",
      "begin_line": 1099,
      "end_line": 1132,
      "comment": "",
      "child_ranges": [
        "(line 1100,col 9)-(line 1100,col 52)",
        "(line 1101,col 9)-(line 1101,col 45)",
        "(line 1102,col 9)-(line 1102,col 45)",
        "(line 1103,col 9)-(line 1109,col 9)",
        "(line 1110,col 9)-(line 1110,col 44)",
        "(line 1111,col 9)-(line 1111,col 73)",
        "(line 1112,col 9)-(line 1112,col 48)",
        "(line 1113,col 9)-(line 1131,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.doTestCombineDimensionMismatch(boolean, boolean)",
      "begin_line": 1134,
      "end_line": 1147,
      "comment": "",
      "child_ranges": [
        "(line 1135,col 9)-(line 1135,col 53)",
        "(line 1136,col 9)-(line 1136,col 28)",
        "(line 1137,col 9)-(line 1141,col 9)",
        "(line 1142,col 9)-(line 1146,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCombineSameType()",
      "begin_line": 1149,
      "end_line": 1152,
      "comment": "",
      "child_ranges": [
        "(line 1151,col 9)-(line 1151,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCombineMixedTypes()",
      "begin_line": 1154,
      "end_line": 1157,
      "comment": "",
      "child_ranges": [
        "(line 1156,col 9)-(line 1156,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCombineDimensionMismatchSameType()",
      "begin_line": 1159,
      "end_line": 1162,
      "comment": "",
      "child_ranges": [
        "(line 1161,col 9)-(line 1161,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCombineDimensionMismatchMixedTypes()",
      "begin_line": 1164,
      "end_line": 1167,
      "comment": "",
      "child_ranges": [
        "(line 1166,col 9)-(line 1166,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCombineToSelfSameType()",
      "begin_line": 1169,
      "end_line": 1172,
      "comment": "",
      "child_ranges": [
        "(line 1171,col 9)-(line 1171,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCombineToSelfMixedTypes()",
      "begin_line": 1174,
      "end_line": 1177,
      "comment": "",
      "child_ranges": [
        "(line 1176,col 9)-(line 1176,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCombineToSelfDimensionMismatchSameType()",
      "begin_line": 1179,
      "end_line": 1182,
      "comment": "",
      "child_ranges": [
        "(line 1181,col 9)-(line 1181,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCombineToSelfDimensionMismatchMixedTypes()",
      "begin_line": 1184,
      "end_line": 1187,
      "comment": "",
      "child_ranges": [
        "(line 1186,col 9)-(line 1186,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCopy()",
      "begin_line": 1189,
      "end_line": 1195,
      "comment": "",
      "child_ranges": [
        "(line 1191,col 9)-(line 1191,col 44)",
        "(line 1192,col 9)-(line 1192,col 38)",
        "(line 1193,col 9)-(line 1193,col 35)",
        "(line 1194,col 9)-(line 1194,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.doTestDotProductRegularValues(boolean)",
      "begin_line": 1197,
      "end_line": 1218,
      "comment": "",
      "child_ranges": [
        "(line 1198,col 9)-(line 1198,col 50)",
        "(line 1199,col 9)-(line 1201,col 10)",
        "(line 1202,col 9)-(line 1204,col 10)",
        "(line 1205,col 9)-(line 1205,col 29)",
        "(line 1206,col 9)-(line 1208,col 9)",
        "(line 1209,col 9)-(line 1209,col 44)",
        "(line 1210,col 9)-(line 1210,col 28)",
        "(line 1211,col 9)-(line 1215,col 9)",
        "(line 1216,col 9)-(line 1216,col 48)",
        "(line 1217,col 9)-(line 1217,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.doTestDotProductSpecialValues(boolean)",
      "begin_line": 1220,
      "end_line": 1242,
      "comment": "",
      "child_ranges": [
        "(line 1221,col 9)-(line 1241,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.doTestDotProductDimensionMismatch(boolean)",
      "begin_line": 1244,
      "end_line": 1255,
      "comment": "",
      "child_ranges": [
        "(line 1245,col 9)-(line 1245,col 46)",
        "(line 1246,col 9)-(line 1246,col 60)",
        "(line 1247,col 9)-(line 1247,col 44)",
        "(line 1248,col 9)-(line 1248,col 28)",
        "(line 1249,col 9)-(line 1253,col 9)",
        "(line 1254,col 9)-(line 1254,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testDotProductSameType()",
      "begin_line": 1257,
      "end_line": 1261,
      "comment": "",
      "child_ranges": [
        "(line 1259,col 9)-(line 1259,col 45)",
        "(line 1260,col 9)-(line 1260,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testDotProductDimensionMismatchSameType()",
      "begin_line": 1263,
      "end_line": 1266,
      "comment": "",
      "child_ranges": [
        "(line 1265,col 9)-(line 1265,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testDotProductMixedTypes()",
      "begin_line": 1268,
      "end_line": 1272,
      "comment": "",
      "child_ranges": [
        "(line 1270,col 9)-(line 1270,col 44)",
        "(line 1271,col 9)-(line 1271,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testDotProductDimensionMismatchMixedTypes()",
      "begin_line": 1274,
      "end_line": 1277,
      "comment": "",
      "child_ranges": [
        "(line 1276,col 9)-(line 1276,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.doTestCosine(boolean)",
      "begin_line": 1279,
      "end_line": 1308,
      "comment": "",
      "child_ranges": [
        "(line 1280,col 9)-(line 1280,col 50)",
        "(line 1281,col 9)-(line 1283,col 10)",
        "(line 1284,col 9)-(line 1286,col 10)",
        "(line 1287,col 9)-(line 1287,col 26)",
        "(line 1288,col 9)-(line 1288,col 26)",
        "(line 1289,col 9)-(line 1289,col 31)",
        "(line 1290,col 9)-(line 1294,col 9)",
        "(line 1295,col 9)-(line 1295,col 37)",
        "(line 1296,col 9)-(line 1296,col 37)",
        "(line 1297,col 9)-(line 1297,col 61)",
        "(line 1298,col 9)-(line 1298,col 44)",
        "(line 1299,col 9)-(line 1299,col 28)",
        "(line 1300,col 9)-(line 1304,col 9)",
        "(line 1305,col 9)-(line 1305,col 44)",
        "(line 1306,col 9)-(line 1306,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCosineSameType()",
      "begin_line": 1310,
      "end_line": 1313,
      "comment": "",
      "child_ranges": [
        "(line 1312,col 9)-(line 1312,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCosineMixedTypes()",
      "begin_line": 1315,
      "end_line": 1318,
      "comment": "",
      "child_ranges": [
        "(line 1317,col 9)-(line 1317,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCosineLeftNullVector()",
      "begin_line": 1320,
      "end_line": 1325,
      "comment": "",
      "child_ranges": [
        "(line 1322,col 9)-(line 1322,col 60)",
        "(line 1323,col 9)-(line 1323,col 60)",
        "(line 1324,col 9)-(line 1324,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCosineRightNullVector()",
      "begin_line": 1327,
      "end_line": 1332,
      "comment": "",
      "child_ranges": [
        "(line 1329,col 9)-(line 1329,col 60)",
        "(line 1330,col 9)-(line 1330,col 60)",
        "(line 1331,col 9)-(line 1331,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testCosineDimensionMismatch()",
      "begin_line": 1334,
      "end_line": 1339,
      "comment": "",
      "child_ranges": [
        "(line 1336,col 9)-(line 1336,col 60)",
        "(line 1337,col 9)-(line 1337,col 63)",
        "(line 1338,col 9)-(line 1338,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testEquals()",
      "begin_line": 1341,
      "end_line": 1350,
      "comment": "",
      "child_ranges": [
        "(line 1343,col 9)-(line 1343,col 62)",
        "(line 1345,col 9)-(line 1345,col 39)",
        "(line 1346,col 9)-(line 1346,col 46)",
        "(line 1347,col 9)-(line 1347,col 43)",
        "(line 1348,col 9)-(line 1348,col 78)",
        "(line 1349,col 9)-(line 1349,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testSerial()",
      "begin_line": 1352,
      "end_line": 1356,
      "comment": "",
      "child_ranges": [
        "(line 1354,col 9)-(line 1354,col 56)",
        "(line 1355,col 9)-(line 1355,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testMinMax()",
      "begin_line": 1358,
      "end_line": 1380,
      "comment": "",
      "child_ranges": [
        "(line 1360,col 9)-(line 1360,col 69)",
        "(line 1361,col 9)-(line 1361,col 49)",
        "(line 1362,col 9)-(line 1362,col 59)",
        "(line 1363,col 9)-(line 1363,col 49)",
        "(line 1364,col 9)-(line 1364,col 59)",
        "(line 1365,col 9)-(line 1365,col 83)",
        "(line 1366,col 9)-(line 1366,col 49)",
        "(line 1367,col 9)-(line 1367,col 59)",
        "(line 1368,col 9)-(line 1368,col 49)",
        "(line 1369,col 9)-(line 1369,col 58)",
        "(line 1370,col 9)-(line 1370,col 76)",
        "(line 1371,col 9)-(line 1371,col 50)",
        "(line 1372,col 9)-(line 1372,col 58)",
        "(line 1373,col 9)-(line 1373,col 50)",
        "(line 1374,col 9)-(line 1374,col 58)",
        "(line 1375,col 9)-(line 1375,col 52)",
        "(line 1376,col 9)-(line 1376,col 50)",
        "(line 1377,col 9)-(line 1377,col 58)",
        "(line 1378,col 9)-(line 1378,col 50)",
        "(line 1379,col 9)-(line 1379,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInDefaultOrderPreservingVisitor1()",
      "begin_line": 1387,
      "end_line": 1418,
      "comment": " The whole vector is visited. ",
      "child_ranges": [
        "(line 1389,col 9)-(line 1391,col 10)",
        "(line 1392,col 9)-(line 1392,col 42)",
        "(line 1393,col 9)-(line 1393,col 50)",
        "(line 1394,col 9)-(line 1416,col 10)",
        "(line 1417,col 9)-(line 1417,col 38)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "expectedIndex"
      ],
      "begin_line": 1396,
      "end_line": 1396,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-47ec1a08-cc2c-426f-9292-46d9b5242a26.visit(int, double)",
      "begin_line": 1398,
      "end_line": 1403,
      "comment": "",
      "child_ranges": [
        "(line 1399,col 17)-(line 1399,col 64)",
        "(line 1400,col 17)-(line 1401,col 72)",
        "(line 1402,col 17)-(line 1402,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-47e0365b-601f-48ec-8571-751e736f78de.start(int, int, int)",
      "begin_line": 1405,
      "end_line": 1411,
      "comment": "",
      "child_ranges": [
        "(line 1407,col 17)-(line 1407,col 61)",
        "(line 1408,col 17)-(line 1408,col 52)",
        "(line 1409,col 17)-(line 1409,col 64)",
        "(line 1410,col 17)-(line 1410,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-dc00af11-bb2e-4b5c-8996-9e0b6abb4b79.end()",
      "begin_line": 1413,
      "end_line": 1415,
      "comment": "",
      "child_ranges": [
        "(line 1414,col 17)-(line 1414,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInDefaultOrderPreservingVisitor2()",
      "begin_line": 1421,
      "end_line": 1469,
      "comment": " Visiting an invalid subvector. ",
      "child_ranges": [
        "(line 1423,col 9)-(line 1423,col 51)",
        "(line 1424,col 9)-(line 1424,col 50)",
        "(line 1425,col 9)-(line 1438,col 10)",
        "(line 1439,col 9)-(line 1444,col 9)",
        "(line 1445,col 9)-(line 1450,col 9)",
        "(line 1451,col 9)-(line 1456,col 9)",
        "(line 1457,col 9)-(line 1462,col 9)",
        "(line 1463,col 9)-(line 1468,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-6fedc5bb-98ff-417a-8f56-0f21ff6ce85a.visit(int, double)",
      "begin_line": 1427,
      "end_line": 1429,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-732209d0-700d-49a8-a291-d8003e4ec012.start(int, int, int)",
      "begin_line": 1431,
      "end_line": 1433,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-a1a0c35c-2d19-49b0-877b-aac1c2ca7045.end()",
      "begin_line": 1435,
      "end_line": 1437,
      "comment": "",
      "child_ranges": [
        "(line 1436,col 17)-(line 1436,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInDefaultOrderPreservingVisitor3()",
      "begin_line": 1472,
      "end_line": 1505,
      "comment": " Visiting a valid subvector. ",
      "child_ranges": [
        "(line 1474,col 9)-(line 1476,col 10)",
        "(line 1477,col 9)-(line 1477,col 36)",
        "(line 1478,col 9)-(line 1478,col 34)",
        "(line 1479,col 9)-(line 1479,col 42)",
        "(line 1480,col 9)-(line 1480,col 50)",
        "(line 1481,col 9)-(line 1503,col 10)",
        "(line 1504,col 9)-(line 1504,col 66)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "expectedIndex"
      ],
      "begin_line": 1483,
      "end_line": 1483,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-98ce561f-1fb9-4de9-9871-071799ac5628.visit(int, double)",
      "begin_line": 1485,
      "end_line": 1490,
      "comment": "",
      "child_ranges": [
        "(line 1486,col 17)-(line 1486,col 64)",
        "(line 1487,col 17)-(line 1488,col 72)",
        "(line 1489,col 17)-(line 1489,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-6bb97a9b-c73a-4252-a871-e69382385e78.start(int, int, int)",
      "begin_line": 1492,
      "end_line": 1498,
      "comment": "",
      "child_ranges": [
        "(line 1494,col 17)-(line 1494,col 61)",
        "(line 1495,col 17)-(line 1495,col 64)",
        "(line 1496,col 17)-(line 1496,col 60)",
        "(line 1497,col 17)-(line 1497,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-bb2020db-fee0-4e99-acaf-f7711cf1e30c.end()",
      "begin_line": 1500,
      "end_line": 1502,
      "comment": "",
      "child_ranges": [
        "(line 1501,col 17)-(line 1501,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInOptimizedOrderPreservingVisitor1()",
      "begin_line": 1508,
      "end_line": 1541,
      "comment": " The whole vector is visited. ",
      "child_ranges": [
        "(line 1510,col 9)-(line 1512,col 10)",
        "(line 1513,col 9)-(line 1513,col 42)",
        "(line 1514,col 9)-(line 1514,col 50)",
        "(line 1515,col 9)-(line 1539,col 10)",
        "(line 1540,col 9)-(line 1540,col 40)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "visited"
      ],
      "begin_line": 1516,
      "end_line": 1516,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-f7578230-548e-4419-a4fd-258c4ca78ac6.visit(int, double)",
      "begin_line": 1518,
      "end_line": 1522,
      "comment": "",
      "child_ranges": [
        "(line 1519,col 17)-(line 1519,col 44)",
        "(line 1520,col 17)-(line 1521,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-20afc2fb-e1d5-45b9-bec5-068fa19bb2d5.start(int, int, int)",
      "begin_line": 1524,
      "end_line": 1530,
      "comment": "",
      "child_ranges": [
        "(line 1526,col 17)-(line 1526,col 61)",
        "(line 1527,col 17)-(line 1527,col 52)",
        "(line 1528,col 17)-(line 1528,col 64)",
        "(line 1529,col 17)-(line 1529,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-9f462721-6107-4c08-8c87-c2474e635d6e.end()",
      "begin_line": 1532,
      "end_line": 1538,
      "comment": "",
      "child_ranges": [
        "(line 1533,col 17)-(line 1536,col 17)",
        "(line 1537,col 17)-(line 1537,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInOptimizedOrderPreservingVisitor2()",
      "begin_line": 1544,
      "end_line": 1592,
      "comment": " Visiting an invalid subvector. ",
      "child_ranges": [
        "(line 1546,col 9)-(line 1546,col 51)",
        "(line 1547,col 9)-(line 1547,col 50)",
        "(line 1548,col 9)-(line 1561,col 10)",
        "(line 1562,col 9)-(line 1567,col 9)",
        "(line 1568,col 9)-(line 1573,col 9)",
        "(line 1574,col 9)-(line 1579,col 9)",
        "(line 1580,col 9)-(line 1585,col 9)",
        "(line 1586,col 9)-(line 1591,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-6bb831ae-7d69-4132-bfd2-f8024e38b253.visit(int, double)",
      "begin_line": 1550,
      "end_line": 1552,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-394aca3a-6747-4c32-a46e-ed2e4fc8d918.start(int, int, int)",
      "begin_line": 1554,
      "end_line": 1556,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-8d75e6a9-83d3-4c69-97a6-e4c13d459420.end()",
      "begin_line": 1558,
      "end_line": 1560,
      "comment": "",
      "child_ranges": [
        "(line 1559,col 17)-(line 1559,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInOptimizedOrderPreservingVisitor3()",
      "begin_line": 1595,
      "end_line": 1630,
      "comment": " Visiting a valid subvector. ",
      "child_ranges": [
        "(line 1597,col 9)-(line 1599,col 10)",
        "(line 1600,col 9)-(line 1600,col 36)",
        "(line 1601,col 9)-(line 1601,col 34)",
        "(line 1602,col 9)-(line 1602,col 42)",
        "(line 1603,col 9)-(line 1603,col 50)",
        "(line 1604,col 9)-(line 1628,col 10)",
        "(line 1629,col 9)-(line 1629,col 68)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "visited"
      ],
      "begin_line": 1605,
      "end_line": 1605,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-e33fc9bd-4fe2-461c-bb64-4db3a2d4ddd6.visit(int, double)",
      "begin_line": 1607,
      "end_line": 1611,
      "comment": "",
      "child_ranges": [
        "(line 1608,col 17)-(line 1609,col 72)",
        "(line 1610,col 17)-(line 1610,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-c294fa71-cff1-4d12-a49e-c9edc2866314.start(int, int, int)",
      "begin_line": 1613,
      "end_line": 1619,
      "comment": "",
      "child_ranges": [
        "(line 1615,col 17)-(line 1615,col 61)",
        "(line 1616,col 17)-(line 1616,col 64)",
        "(line 1617,col 17)-(line 1617,col 60)",
        "(line 1618,col 17)-(line 1618,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-56b54aff-32f0-4313-9d43-932c72484db6.end()",
      "begin_line": 1621,
      "end_line": 1627,
      "comment": "",
      "child_ranges": [
        "(line 1622,col 17)-(line 1625,col 17)",
        "(line 1626,col 17)-(line 1626,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInDefaultOrderChangingVisitor1()",
      "begin_line": 1633,
      "end_line": 1668,
      "comment": " The whole vector is visited. ",
      "child_ranges": [
        "(line 1635,col 9)-(line 1637,col 10)",
        "(line 1638,col 9)-(line 1638,col 42)",
        "(line 1639,col 9)-(line 1639,col 48)",
        "(line 1640,col 9)-(line 1663,col 10)",
        "(line 1664,col 9)-(line 1664,col 38)",
        "(line 1665,col 9)-(line 1667,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "expectedIndex"
      ],
      "begin_line": 1642,
      "end_line": 1642,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-8f6a6adc-dade-4a81-bbfc-5ccb8c943dda.visit(int, double)",
      "begin_line": 1644,
      "end_line": 1650,
      "comment": "",
      "child_ranges": [
        "(line 1645,col 17)-(line 1645,col 64)",
        "(line 1646,col 17)-(line 1647,col 72)",
        "(line 1648,col 17)-(line 1648,col 32)",
        "(line 1649,col 17)-(line 1649,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-4f8d8492-0469-4221-a524-5dc210e626c5.start(int, int, int)",
      "begin_line": 1652,
      "end_line": 1658,
      "comment": "",
      "child_ranges": [
        "(line 1654,col 17)-(line 1654,col 61)",
        "(line 1655,col 17)-(line 1655,col 52)",
        "(line 1656,col 17)-(line 1656,col 64)",
        "(line 1657,col 17)-(line 1657,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-b03cbbc6-620c-4d95-9581-0e3a2830252c.end()",
      "begin_line": 1660,
      "end_line": 1662,
      "comment": "",
      "child_ranges": [
        "(line 1661,col 17)-(line 1661,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInDefaultOrderChangingVisitor2()",
      "begin_line": 1671,
      "end_line": 1719,
      "comment": " Visiting an invalid subvector. ",
      "child_ranges": [
        "(line 1673,col 9)-(line 1673,col 51)",
        "(line 1674,col 9)-(line 1674,col 48)",
        "(line 1675,col 9)-(line 1688,col 10)",
        "(line 1689,col 9)-(line 1694,col 9)",
        "(line 1695,col 9)-(line 1700,col 9)",
        "(line 1701,col 9)-(line 1706,col 9)",
        "(line 1707,col 9)-(line 1712,col 9)",
        "(line 1713,col 9)-(line 1718,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-e3114d9a-542e-4bc6-8817-684553f18c88.visit(int, double)",
      "begin_line": 1677,
      "end_line": 1679,
      "comment": "",
      "child_ranges": [
        "(line 1678,col 17)-(line 1678,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-00bf3337-a563-4433-9d21-54a60e5973e6.start(int, int, int)",
      "begin_line": 1681,
      "end_line": 1683,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-fb01d5da-63e6-4541-bdd0-610ff291c69f.end()",
      "begin_line": 1685,
      "end_line": 1687,
      "comment": "",
      "child_ranges": [
        "(line 1686,col 17)-(line 1686,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInDefaultOrderChangingVisitor3()",
      "begin_line": 1722,
      "end_line": 1759,
      "comment": " Visiting a valid subvector. ",
      "child_ranges": [
        "(line 1724,col 9)-(line 1726,col 10)",
        "(line 1727,col 9)-(line 1727,col 36)",
        "(line 1728,col 9)-(line 1728,col 34)",
        "(line 1729,col 9)-(line 1729,col 42)",
        "(line 1730,col 9)-(line 1730,col 48)",
        "(line 1731,col 9)-(line 1754,col 10)",
        "(line 1755,col 9)-(line 1755,col 66)",
        "(line 1756,col 9)-(line 1758,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "expectedIndex"
      ],
      "begin_line": 1733,
      "end_line": 1733,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-a7a37159-eb3b-4f74-8ee0-f1da3db1f64c.visit(int, double)",
      "begin_line": 1735,
      "end_line": 1741,
      "comment": "",
      "child_ranges": [
        "(line 1736,col 17)-(line 1736,col 64)",
        "(line 1737,col 17)-(line 1738,col 72)",
        "(line 1739,col 17)-(line 1739,col 32)",
        "(line 1740,col 17)-(line 1740,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-51cc2312-2e56-4527-af66-1eb42e0be9cb.start(int, int, int)",
      "begin_line": 1743,
      "end_line": 1749,
      "comment": "",
      "child_ranges": [
        "(line 1745,col 17)-(line 1745,col 61)",
        "(line 1746,col 17)-(line 1746,col 64)",
        "(line 1747,col 17)-(line 1747,col 60)",
        "(line 1748,col 17)-(line 1748,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-29444d78-3af3-4a2f-ad06-2c814430255d.end()",
      "begin_line": 1751,
      "end_line": 1753,
      "comment": "",
      "child_ranges": [
        "(line 1752,col 17)-(line 1752,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInOptimizedOrderChangingVisitor1()",
      "begin_line": 1762,
      "end_line": 1799,
      "comment": " The whole vector is visited. ",
      "child_ranges": [
        "(line 1764,col 9)-(line 1766,col 10)",
        "(line 1767,col 9)-(line 1767,col 42)",
        "(line 1768,col 9)-(line 1768,col 48)",
        "(line 1769,col 9)-(line 1794,col 10)",
        "(line 1795,col 9)-(line 1795,col 40)",
        "(line 1796,col 9)-(line 1798,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "visited"
      ],
      "begin_line": 1770,
      "end_line": 1770,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-922b4b1f-1a83-45c9-9e24-ee2a4865abdb.visit(int, double)",
      "begin_line": 1772,
      "end_line": 1777,
      "comment": "",
      "child_ranges": [
        "(line 1773,col 17)-(line 1773,col 44)",
        "(line 1774,col 17)-(line 1775,col 72)",
        "(line 1776,col 17)-(line 1776,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-8e94ea56-0562-4819-8fc3-85e61c8e37b9.start(int, int, int)",
      "begin_line": 1779,
      "end_line": 1785,
      "comment": "",
      "child_ranges": [
        "(line 1781,col 17)-(line 1781,col 61)",
        "(line 1782,col 17)-(line 1782,col 52)",
        "(line 1783,col 17)-(line 1783,col 64)",
        "(line 1784,col 17)-(line 1784,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-4e1e6fca-1442-4391-91ca-b36190c1a752.end()",
      "begin_line": 1787,
      "end_line": 1793,
      "comment": "",
      "child_ranges": [
        "(line 1788,col 17)-(line 1791,col 17)",
        "(line 1792,col 17)-(line 1792,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInOptimizedOrderChangingVisitor2()",
      "begin_line": 1802,
      "end_line": 1850,
      "comment": " Visiting an invalid subvector. ",
      "child_ranges": [
        "(line 1804,col 9)-(line 1804,col 51)",
        "(line 1805,col 9)-(line 1805,col 48)",
        "(line 1806,col 9)-(line 1819,col 10)",
        "(line 1820,col 9)-(line 1825,col 9)",
        "(line 1826,col 9)-(line 1831,col 9)",
        "(line 1832,col 9)-(line 1837,col 9)",
        "(line 1838,col 9)-(line 1843,col 9)",
        "(line 1844,col 9)-(line 1849,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-62c4e623-cd45-4c4a-816b-8ef66199c1f7.visit(int, double)",
      "begin_line": 1808,
      "end_line": 1810,
      "comment": "",
      "child_ranges": [
        "(line 1809,col 17)-(line 1809,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-b02a56fd-92bf-4c49-81c9-4e9e1333d482.start(int, int, int)",
      "begin_line": 1812,
      "end_line": 1814,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-22f322f9-22f1-4785-b087-c775a8b7381d.end()",
      "begin_line": 1816,
      "end_line": 1818,
      "comment": "",
      "child_ranges": [
        "(line 1817,col 17)-(line 1817,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.testWalkInOptimizedOrderChangingVisitor3()",
      "begin_line": 1853,
      "end_line": 1892,
      "comment": " Visiting a valid subvector. ",
      "child_ranges": [
        "(line 1855,col 9)-(line 1857,col 10)",
        "(line 1858,col 9)-(line 1858,col 36)",
        "(line 1859,col 9)-(line 1859,col 34)",
        "(line 1860,col 9)-(line 1860,col 42)",
        "(line 1861,col 9)-(line 1861,col 48)",
        "(line 1862,col 9)-(line 1887,col 10)",
        "(line 1888,col 9)-(line 1888,col 68)",
        "(line 1889,col 9)-(line 1891,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "visited"
      ],
      "begin_line": 1863,
      "end_line": 1863,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-4b408689-da69-4685-ab8b-bd6974d0cc00.visit(int, double)",
      "begin_line": 1865,
      "end_line": 1870,
      "comment": "",
      "child_ranges": [
        "(line 1866,col 17)-(line 1867,col 72)",
        "(line 1868,col 17)-(line 1868,col 44)",
        "(line 1869,col 17)-(line 1869,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-de82db3a-8f4b-4b9c-a310-42aa13f431c6.start(int, int, int)",
      "begin_line": 1872,
      "end_line": 1878,
      "comment": "",
      "child_ranges": [
        "(line 1874,col 17)-(line 1874,col 61)",
        "(line 1875,col 17)-(line 1875,col 64)",
        "(line 1876,col 17)-(line 1876,col 60)",
        "(line 1877,col 17)-(line 1877,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.Anonymous-86d9cb94-57a2-4113-812f-7cfeb5cd761c.end()",
      "begin_line": 1880,
      "end_line": 1886,
      "comment": "",
      "child_ranges": [
        "(line 1881,col 17)-(line 1884,col 17)",
        "(line 1885,col 17)-(line 1885,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RealVectorTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.RealVector",
        "java.io.Serializable"
      ],
      "begin_line": 1898,
      "end_line": 1976,
      "comment": "\n     * Minimal implementation of the {@link RealVector} abstract class, for\n     * mixed types unit tests.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1902,
      "end_line": 1902,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 1905,
      "end_line": 1905,
      "comment": " Entries of the vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.RealVectorTestImpl.RealVectorTestImpl(double[])",
      "begin_line": 1907,
      "end_line": 1909,
      "comment": "",
      "child_ranges": [
        "(line 1908,col 13)-(line 1908,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.RealVectorTestImpl.unsupported()",
      "begin_line": 1911,
      "end_line": 1913,
      "comment": "",
      "child_ranges": [
        "(line 1912,col 13)-(line 1912,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.RealVectorTestImpl.copy()",
      "begin_line": 1915,
      "end_line": 1918,
      "comment": "",
      "child_ranges": [
        "(line 1917,col 13)-(line 1917,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.RealVectorTestImpl.ebeMultiply(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1920,
      "end_line": 1923,
      "comment": "",
      "child_ranges": [
        "(line 1922,col 13)-(line 1922,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.RealVectorTestImpl.ebeDivide(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1925,
      "end_line": 1928,
      "comment": "",
      "child_ranges": [
        "(line 1927,col 13)-(line 1927,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.RealVectorTestImpl.getEntry(int)",
      "begin_line": 1930,
      "end_line": 1934,
      "comment": "",
      "child_ranges": [
        "(line 1932,col 13)-(line 1932,col 30)",
        "(line 1933,col 13)-(line 1933,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.RealVectorTestImpl.getDimension()",
      "begin_line": 1936,
      "end_line": 1939,
      "comment": "",
      "child_ranges": [
        "(line 1938,col 13)-(line 1938,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.RealVectorTestImpl.append(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1941,
      "end_line": 1944,
      "comment": "",
      "child_ranges": [
        "(line 1943,col 13)-(line 1943,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.RealVectorTestImpl.append(double)",
      "begin_line": 1946,
      "end_line": 1949,
      "comment": "",
      "child_ranges": [
        "(line 1948,col 13)-(line 1948,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.RealVectorTestImpl.getSubVector(int, int)",
      "begin_line": 1951,
      "end_line": 1954,
      "comment": "",
      "child_ranges": [
        "(line 1953,col 13)-(line 1953,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.RealVectorTestImpl.setEntry(int, double)",
      "begin_line": 1956,
      "end_line": 1960,
      "comment": "",
      "child_ranges": [
        "(line 1958,col 13)-(line 1958,col 30)",
        "(line 1959,col 13)-(line 1959,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.RealVectorTestImpl.setSubVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1962,
      "end_line": 1965,
      "comment": "",
      "child_ranges": [
        "(line 1964,col 13)-(line 1964,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.RealVectorTestImpl.isNaN()",
      "begin_line": 1967,
      "end_line": 1970,
      "comment": "",
      "child_ranges": [
        "(line 1969,col 13)-(line 1969,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorAbstractTest.RealVectorTestImpl.isInfinite()",
      "begin_line": 1972,
      "end_line": 1975,
      "comment": "",
      "child_ranges": [
        "(line 1974,col 13)-(line 1974,col 32)"
      ]
    }
  ]
}