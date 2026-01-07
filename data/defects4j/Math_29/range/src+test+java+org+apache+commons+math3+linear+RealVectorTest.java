{
  "filepath": "/tmp/Math-29b/src/test/java/org/apache/commons/math3/linear/RealVectorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealVectorTest",
      "is_interface": false,
      "parent_types": [
        "RealVectorAbstractTest"
      ],
      "begin_line": 36,
      "end_line": 487,
      "comment": "\n * Tests for {@link RealVector}.\n "
    },
    {
      "type": "field",
      "varNames": [
        "vec1"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vec2"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "TestVectorImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.RealVector"
      ],
      "begin_line": 40,
      "end_line": 177,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.TestVectorImpl.TestVectorImpl(double[])",
      "begin_line": 43,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 13)-(line 44,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.TestVectorImpl.toArray()",
      "begin_line": 47,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 48,col 37)-(line 48,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.TestVectorImpl.copy()",
      "begin_line": 50,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 13)-(line 52,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.TestVectorImpl.unsupported()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 13)-(line 56,col 120)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.TestVectorImpl.mapAddToSelf(double)",
      "begin_line": 59,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 61,col 13)-(line 63,col 13)",
        "(line 64,col 13)-(line 64,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.TestVectorImpl.mapSubtractToSelf(double)",
      "begin_line": 67,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 69,col 13)-(line 71,col 13)",
        "(line 72,col 13)-(line 72,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.TestVectorImpl.mapMultiplyToSelf(double)",
      "begin_line": 75,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 77,col 13)-(line 79,col 13)",
        "(line 80,col 13)-(line 80,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.TestVectorImpl.mapDivideToSelf(double)",
      "begin_line": 83,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 85,col 13)-(line 87,col 13)",
        "(line 88,col 13)-(line 88,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.TestVectorImpl.ebeMultiply(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 91,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 13)-(line 93,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.TestVectorImpl.ebeDivide(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 96,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 13)-(line 98,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.TestVectorImpl.getL1Norm()",
      "begin_line": 101,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 13)-(line 103,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.TestVectorImpl.getLInfNorm()",
      "begin_line": 106,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 13)-(line 108,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.TestVectorImpl.projection(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 111,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 13)-(line 113,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.TestVectorImpl.getEntry(int)",
      "begin_line": 116,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 118,col 13)-(line 123,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.TestVectorImpl.setEntry(int, double)",
      "begin_line": 126,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 128,col 13)-(line 133,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.TestVectorImpl.getDimension()",
      "begin_line": 136,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 13)-(line 138,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.TestVectorImpl.append(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 141,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 143,col 13)-(line 143,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.TestVectorImpl.append(double)",
      "begin_line": 146,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 148,col 13)-(line 148,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.TestVectorImpl.append(double[])",
      "begin_line": 151,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 152,col 13)-(line 152,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.TestVectorImpl.getSubVector(int, int)",
      "begin_line": 155,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 157,col 13)-(line 157,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.TestVectorImpl.setSubVector(int, double[])",
      "begin_line": 160,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 161,col 13)-(line 161,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.TestVectorImpl.setSubVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 163,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 165,col 13)-(line 165,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.TestVectorImpl.isNaN()",
      "begin_line": 168,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 170,col 13)-(line 170,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.TestVectorImpl.isInfinite()",
      "begin_line": 173,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 175,col 13)-(line 175,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.create(double[])",
      "begin_line": 179,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.createAlien(double[])",
      "begin_line": 184,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.testAppendVector()",
      "begin_line": 189,
      "end_line": 194,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.testAppendScalar()",
      "begin_line": 196,
      "end_line": 201,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.testGetSubVector()",
      "begin_line": 203,
      "end_line": 208,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.testGetSubVectorInvalidIndex1()",
      "begin_line": 210,
      "end_line": 215,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.testGetSubVectorInvalidIndex2()",
      "begin_line": 217,
      "end_line": 222,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.testGetSubVectorInvalidIndex3()",
      "begin_line": 224,
      "end_line": 229,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.testGetSubVectorInvalidIndex4()",
      "begin_line": 231,
      "end_line": 236,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.testSetSubVectorSameType()",
      "begin_line": 238,
      "end_line": 243,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.testSetSubVectorMixedType()",
      "begin_line": 245,
      "end_line": 250,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.testSetSubVectorInvalidIndex1()",
      "begin_line": 252,
      "end_line": 257,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.testSetSubVectorInvalidIndex2()",
      "begin_line": 259,
      "end_line": 264,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.testSetSubVectorInvalidIndex3()",
      "begin_line": 266,
      "end_line": 271,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.testIsNaN()",
      "begin_line": 273,
      "end_line": 278,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.testIsInfinite()",
      "begin_line": 280,
      "end_line": 285,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.testEbeMultiplySameType()",
      "begin_line": 287,
      "end_line": 292,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.testEbeMultiplyMixedTypes()",
      "begin_line": 294,
      "end_line": 299,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.testEbeMultiplyDimensionMismatch()",
      "begin_line": 301,
      "end_line": 306,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.testEbeDivideSameType()",
      "begin_line": 308,
      "end_line": 313,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.testEbeDivideMixedTypes()",
      "begin_line": 315,
      "end_line": 320,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.testEbeDivideDimensionMismatch()",
      "begin_line": 322,
      "end_line": 327,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.testBasicFunctions()",
      "begin_line": 329,
      "end_line": 342,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.testMap()",
      "begin_line": 344,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 56)",
        "(line 347,col 9)-(line 347,col 56)",
        "(line 348,col 9)-(line 348,col 107)",
        "(line 349,col 9)-(line 349,col 34)",
        "(line 350,col 9)-(line 350,col 59)",
        "(line 351,col 9)-(line 353,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.Anonymous-ff62d794-8504-4e0d-a942-39596e5b8c42.value(double)",
      "begin_line": 348,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 348,col 89)-(line 348,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.testIterator()",
      "begin_line": 356,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 56)",
        "(line 359,col 9)-(line 359,col 16)",
        "(line 360,col 9)-(line 360,col 18)",
        "(line 361,col 9)-(line 363,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.testSparseIterator()",
      "begin_line": 366,
      "end_line": 381,
      "comment": "",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 56)",
        "(line 369,col 9)-(line 369,col 16)",
        "(line 370,col 9)-(line 370,col 18)",
        "(line 371,col 9)-(line 371,col 48)",
        "(line 372,col 9)-(line 374,col 9)",
        "(line 375,col 9)-(line 375,col 42)",
        "(line 376,col 9)-(line 376,col 40)",
        "(line 377,col 9)-(line 379,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.testClone()",
      "begin_line": 383,
      "end_line": 394,
      "comment": "",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 41)",
        "(line 386,col 9)-(line 386,col 36)",
        "(line 387,col 9)-(line 387,col 59)",
        "(line 388,col 9)-(line 388,col 64)",
        "(line 389,col 9)-(line 389,col 31)",
        "(line 390,col 9)-(line 390,col 17)",
        "(line 391,col 9)-(line 391,col 41)",
        "(line 392,col 9)-(line 392,col 17)",
        "(line 393,col 9)-(line 393,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.testCombineToSelfPrecondition()",
      "begin_line": 396,
      "end_line": 405,
      "comment": "",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 28)",
        "(line 399,col 9)-(line 399,col 28)",
        "(line 400,col 9)-(line 400,col 51)",
        "(line 401,col 9)-(line 401,col 57)",
        "(line 402,col 9)-(line 402,col 38)",
        "(line 403,col 9)-(line 403,col 57)",
        "(line 404,col 9)-(line 404,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.testCombineToSelf()",
      "begin_line": 407,
      "end_line": 435,
      "comment": "",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 51)",
        "(line 410,col 9)-(line 410,col 27)",
        "(line 411,col 9)-(line 411,col 55)",
        "(line 412,col 9)-(line 412,col 55)",
        "(line 413,col 9)-(line 413,col 65)",
        "(line 414,col 9)-(line 414,col 65)",
        "(line 415,col 9)-(line 415,col 50)",
        "(line 416,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 423,col 55)",
        "(line 424,col 9)-(line 424,col 44)",
        "(line 425,col 9)-(line 434,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.testAddToEntry()",
      "begin_line": 437,
      "end_line": 449,
      "comment": "",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 52)",
        "(line 441,col 9)-(line 441,col 59)",
        "(line 442,col 9)-(line 442,col 29)",
        "(line 443,col 9)-(line 445,col 9)",
        "(line 446,col 9)-(line 448,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.testDataInOut()",
      "begin_line": 451,
      "end_line": 464,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.testPredicates()",
      "begin_line": 466,
      "end_line": 479,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorTest.testSerial()",
      "begin_line": 481,
      "end_line": 486,
      "comment": "",
      "child_ranges": []
    }
  ]
}