{
  "filepath": "/tmp/Math-82b/src/main/java/org/apache/commons/math/linear/AbstractRealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractRealMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealMatrix"
      ],
      "begin_line": 31,
      "end_line": 1070,
      "comment": "\n * Basic implementation of RealMatrix methods regardless of the underlying storage.\n * \u003cp\u003eAll the methods implemented here use {@link #getEntry(int, int)} to access\n * matrix elements. Derived class can provide faster implementations. \u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "lu"
      ],
      "begin_line": 37,
      "end_line": 38,
      "comment": " Cached LU solver.\n     * @deprecated as of release 2.0, since all methods using this are deprecated\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.AbstractRealMatrix()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Creates a matrix with no data\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.AbstractRealMatrix(int, int)",
      "begin_line": 54,
      "end_line": 67,
      "comment": "\n     * Create a new RealMatrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension  the number of rows in the new matrix\n     * @param columnDimension  the number of columns in the new matrix\n     * @throws IllegalArgumentException if row or column dimension is not positive\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 60,col 9)",
        "(line 61,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 66,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.createMatrix(int, int)",
      "begin_line": 70,
      "end_line": 71,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copy()",
      "begin_line": 74,
      "end_line": 74,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.add(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 77,
      "end_line": 93,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 53)",
        "(line 82,col 9)-(line 82,col 50)",
        "(line 83,col 9)-(line 83,col 53)",
        "(line 84,col 9)-(line 84,col 67)",
        "(line 85,col 9)-(line 89,col 9)",
        "(line 91,col 9)-(line 91,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 96,
      "end_line": 112,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 56)",
        "(line 101,col 9)-(line 101,col 50)",
        "(line 102,col 9)-(line 102,col 53)",
        "(line 103,col 9)-(line 103,col 67)",
        "(line 104,col 9)-(line 108,col 9)",
        "(line 110,col 9)-(line 110,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.scalarAdd(double)",
      "begin_line": 115,
      "end_line": 128,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 50)",
        "(line 118,col 9)-(line 118,col 53)",
        "(line 119,col 9)-(line 119,col 67)",
        "(line 120,col 9)-(line 124,col 9)",
        "(line 126,col 9)-(line 126,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.scalarMultiply(double)",
      "begin_line": 131,
      "end_line": 144,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 50)",
        "(line 134,col 9)-(line 134,col 53)",
        "(line 135,col 9)-(line 135,col 67)",
        "(line 136,col 9)-(line 140,col 9)",
        "(line 142,col 9)-(line 142,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 147,
      "end_line": 169,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 59)",
        "(line 153,col 9)-(line 153,col 44)",
        "(line 154,col 9)-(line 154,col 49)",
        "(line 155,col 9)-(line 155,col 47)",
        "(line 156,col 9)-(line 156,col 58)",
        "(line 157,col 9)-(line 165,col 9)",
        "(line 167,col 9)-(line 167,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 172,
      "end_line": 175,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getData()",
      "begin_line": 178,
      "end_line": 191,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 84)",
        "(line 182,col 9)-(line 187,col 9)",
        "(line 189,col 9)-(line 189,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getNorm()",
      "begin_line": 194,
      "end_line": 230,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 195,col 9)-(line 229,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "endRow"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": " Last row index. "
    },
    {
      "type": "field",
      "varNames": [
        "columnSum"
      ],
      "begin_line": 201,
      "end_line": 201,
      "comment": " Sum of absolute values on one column. "
    },
    {
      "type": "field",
      "varNames": [
        "maxColSum"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": " Maximal sum across all columns. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-d3336d3c-1701-467e-a01b-603d2cfe51b1.start(int, int, int, int, int, int)",
      "begin_line": 207,
      "end_line": 213,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 210,col 17)-(line 210,col 37)",
        "(line 211,col 17)-(line 211,col 32)",
        "(line 212,col 17)-(line 212,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-75e310c6-6d9f-488a-ad5b-bb9d1ed2f0ed.visit(int, int, double)",
      "begin_line": 216,
      "end_line": 222,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 217,col 17)-(line 217,col 45)",
        "(line 218,col 17)-(line 221,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-3e2b30a1-3cfd-48ad-b1ff-889777952876.end()",
      "begin_line": 225,
      "end_line": 227,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 226,col 17)-(line 226,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getFrobeniusNorm()",
      "begin_line": 233,
      "end_line": 257,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 234,col 9)-(line 256,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 237,
      "end_line": 237,
      "comment": " Sum of squared entries. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-5ca54918-d125-4847-9d31-3830cb67caf8.start(int, int, int, int, int, int)",
      "begin_line": 240,
      "end_line": 244,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 243,col 17)-(line 243,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-1b723daf-7cc1-40e7-bb81-4aa26adc7c44.visit(int, int, double)",
      "begin_line": 247,
      "end_line": 249,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 248,col 17)-(line 248,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-a86a12e7-f851-44a9-bb87-d0fa88274107.end()",
      "begin_line": 252,
      "end_line": 254,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 253,col 17)-(line 253,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 260,
      "end_line": 276,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 88)",
        "(line 266,col 9)-(line 267,col 77)",
        "(line 268,col 9)-(line 272,col 9)",
        "(line 274,col 9)-(line 274,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getSubMatrix(int[], int[])",
      "begin_line": 279,
      "end_line": 300,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 77)",
        "(line 286,col 9)-(line 287,col 70)",
        "(line 288,col 9)-(line 296,col 11)",
        "(line 298,col 9)-(line 298,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-a0c6a870-39ce-4fab-a882-caa266e32a43.visit(int, int, double)",
      "begin_line": 291,
      "end_line": 294,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 293,col 17)-(line 293,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copySubMatrix(int, int, int, int, double[][])",
      "begin_line": 303,
      "end_line": 345,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 88)",
        "(line 310,col 9)-(line 310,col 55)",
        "(line 311,col 9)-(line 311,col 61)",
        "(line 312,col 9)-(line 317,col 9)",
        "(line 320,col 9)-(line 343,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "startRow"
      ],
      "begin_line": 323,
      "end_line": 323,
      "comment": " Initial row index. "
    },
    {
      "type": "field",
      "varNames": [
        "startColumn"
      ],
      "begin_line": 326,
      "end_line": 326,
      "comment": " Initial column index. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-b61f450a-a04d-4f0c-80cd-c98c691f891e.start(int, int, int, int, int, int)",
      "begin_line": 329,
      "end_line": 335,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 333,col 17)-(line 333,col 44)",
        "(line 334,col 17)-(line 334,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-3979b93f-23cd-4ac9-9e8d-367de0e1fe62.visit(int, int, double)",
      "begin_line": 338,
      "end_line": 341,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 340,col 17)-(line 340,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copySubMatrix(int[], int[], double[][])",
      "begin_line": 348,
      "end_line": 369,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 77)",
        "(line 353,col 9)-(line 359,col 9)",
        "(line 362,col 9)-(line 367,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 372,
      "end_line": 406,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 43)",
        "(line 376,col 9)-(line 378,col 9)",
        "(line 380,col 9)-(line 380,col 46)",
        "(line 381,col 9)-(line 383,col 9)",
        "(line 385,col 9)-(line 391,col 9)",
        "(line 393,col 9)-(line 393,col 45)",
        "(line 394,col 9)-(line 394,col 51)",
        "(line 395,col 9)-(line 395,col 57)",
        "(line 396,col 9)-(line 396,col 63)",
        "(line 398,col 9)-(line 402,col 9)",
        "(line 404,col 9)-(line 404,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowMatrix(int)",
      "begin_line": 409,
      "end_line": 421,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 45)",
        "(line 413,col 9)-(line 413,col 47)",
        "(line 414,col 9)-(line 414,col 54)",
        "(line 415,col 9)-(line 417,col 9)",
        "(line 419,col 9)-(line 419,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRowMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 424,
      "end_line": 439,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 45)",
        "(line 428,col 9)-(line 428,col 47)",
        "(line 429,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 437,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnMatrix(int)",
      "begin_line": 442,
      "end_line": 454,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 51)",
        "(line 446,col 9)-(line 446,col 44)",
        "(line 447,col 9)-(line 447,col 54)",
        "(line 448,col 9)-(line 450,col 9)",
        "(line 452,col 9)-(line 452,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 457,
      "end_line": 472,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 51)",
        "(line 461,col 9)-(line 461,col 44)",
        "(line 462,col 9)-(line 467,col 9)",
        "(line 468,col 9)-(line 470,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowVector(int)",
      "begin_line": 475,
      "end_line": 478,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRowVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 481,
      "end_line": 495,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 45)",
        "(line 485,col 9)-(line 485,col 47)",
        "(line 486,col 9)-(line 490,col 9)",
        "(line 491,col 9)-(line 493,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnVector(int)",
      "begin_line": 498,
      "end_line": 501,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumnVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 504,
      "end_line": 518,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 51)",
        "(line 508,col 9)-(line 508,col 44)",
        "(line 509,col 9)-(line 513,col 9)",
        "(line 514,col 9)-(line 516,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRow(int)",
      "begin_line": 521,
      "end_line": 533,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 45)",
        "(line 525,col 9)-(line 525,col 47)",
        "(line 526,col 9)-(line 526,col 47)",
        "(line 527,col 9)-(line 529,col 9)",
        "(line 531,col 9)-(line 531,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRow(int, double[])",
      "begin_line": 536,
      "end_line": 550,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 45)",
        "(line 540,col 9)-(line 540,col 47)",
        "(line 541,col 9)-(line 545,col 9)",
        "(line 546,col 9)-(line 548,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumn(int)",
      "begin_line": 553,
      "end_line": 565,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 51)",
        "(line 557,col 9)-(line 557,col 44)",
        "(line 558,col 9)-(line 558,col 47)",
        "(line 559,col 9)-(line 561,col 9)",
        "(line 563,col 9)-(line 563,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumn(int, double[])",
      "begin_line": 568,
      "end_line": 582,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 571,col 9)-(line 571,col 51)",
        "(line 572,col 9)-(line 572,col 44)",
        "(line 573,col 9)-(line 577,col 9)",
        "(line 578,col 9)-(line 580,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getEntry(int, int)",
      "begin_line": 585,
      "end_line": 586,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setEntry(int, int, double)",
      "begin_line": 589,
      "end_line": 590,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.addToEntry(int, int, double)",
      "begin_line": 593,
      "end_line": 594,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 597,
      "end_line": 598,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.transpose()",
      "begin_line": 601,
      "end_line": 618,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 44)",
        "(line 604,col 9)-(line 604,col 47)",
        "(line 605,col 9)-(line 605,col 58)",
        "(line 606,col 9)-(line 614,col 11)",
        "(line 616,col 9)-(line 616,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-955bf616-430c-4c6f-adb3-61206ab468dd.visit(int, int, double)",
      "begin_line": 609,
      "end_line": 612,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 611,col 17)-(line 611,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.inverse()",
      "begin_line": 621,
      "end_line": 628,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 624,col 9)-(line 626,col 9)",
        "(line 627,col 9)-(line 627,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getDeterminant()",
      "begin_line": 631,
      "end_line": 635,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 634,col 9)-(line 634,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.isSquare()",
      "begin_line": 638,
      "end_line": 640,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 639,col 9)-(line 639,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.isSingular()",
      "begin_line": 643,
      "end_line": 649,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 645,col 9)-(line 647,col 8)",
        "(line 648,col 9)-(line 648,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowDimension()",
      "begin_line": 652,
      "end_line": 652,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnDimension()",
      "begin_line": 655,
      "end_line": 655,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getTrace()",
      "begin_line": 658,
      "end_line": 670,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 660,col 9)-(line 660,col 44)",
        "(line 661,col 9)-(line 661,col 47)",
        "(line 662,col 9)-(line 664,col 8)",
        "(line 665,col 9)-(line 665,col 25)",
        "(line 666,col 9)-(line 668,col 9)",
        "(line 669,col 9)-(line 669,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.operate(double[])",
      "begin_line": 673,
      "end_line": 695,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 676,col 9)-(line 676,col 44)",
        "(line 677,col 9)-(line 677,col 47)",
        "(line 678,col 9)-(line 682,col 9)",
        "(line 684,col 9)-(line 684,col 47)",
        "(line 685,col 9)-(line 691,col 9)",
        "(line 693,col 9)-(line 693,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.operate(org.apache.commons.math.linear.RealVector)",
      "begin_line": 698,
      "end_line": 722,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 700,col 9)-(line 721,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(double[])",
      "begin_line": 725,
      "end_line": 747,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 728,col 9)-(line 728,col 44)",
        "(line 729,col 9)-(line 729,col 47)",
        "(line 730,col 9)-(line 734,col 9)",
        "(line 736,col 9)-(line 736,col 47)",
        "(line 737,col 9)-(line 743,col 9)",
        "(line 745,col 9)-(line 745,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 750,
      "end_line": 776,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 752,col 9)-(line 775,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 779,
      "end_line": 793,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 781,col 9)-(line 781,col 46)",
        "(line 782,col 9)-(line 782,col 49)",
        "(line 783,col 9)-(line 783,col 66)",
        "(line 784,col 9)-(line 790,col 9)",
        "(line 791,col 9)-(line 791,col 18)",
        "(line 792,col 9)-(line 792,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 796,
      "end_line": 807,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 798,col 9)-(line 798,col 46)",
        "(line 799,col 9)-(line 799,col 49)",
        "(line 800,col 9)-(line 800,col 66)",
        "(line 801,col 9)-(line 805,col 9)",
        "(line 806,col 9)-(line 806,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 810,
      "end_line": 826,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 814,col 9)-(line 814,col 88)",
        "(line 815,col 9)-(line 816,col 64)",
        "(line 817,col 9)-(line 823,col 9)",
        "(line 824,col 9)-(line 824,col 18)",
        "(line 825,col 9)-(line 825,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 829,
      "end_line": 842,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 833,col 9)-(line 833,col 88)",
        "(line 834,col 9)-(line 835,col 64)",
        "(line 836,col 9)-(line 840,col 9)",
        "(line 841,col 9)-(line 841,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 845,
      "end_line": 859,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 847,col 9)-(line 847,col 46)",
        "(line 848,col 9)-(line 848,col 49)",
        "(line 849,col 9)-(line 849,col 66)",
        "(line 850,col 9)-(line 856,col 9)",
        "(line 857,col 9)-(line 857,col 18)",
        "(line 858,col 9)-(line 858,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 862,
      "end_line": 873,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 864,col 9)-(line 864,col 46)",
        "(line 865,col 9)-(line 865,col 49)",
        "(line 866,col 9)-(line 866,col 66)",
        "(line 867,col 9)-(line 871,col 9)",
        "(line 872,col 9)-(line 872,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 876,
      "end_line": 892,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 880,col 9)-(line 880,col 88)",
        "(line 881,col 9)-(line 882,col 64)",
        "(line 883,col 9)-(line 889,col 9)",
        "(line 890,col 9)-(line 890,col 18)",
        "(line 891,col 9)-(line 891,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 895,
      "end_line": 908,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 899,col 9)-(line 899,col 88)",
        "(line 900,col 9)-(line 901,col 64)",
        "(line 902,col 9)-(line 906,col 9)",
        "(line 907,col 9)-(line 907,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 911,
      "end_line": 914,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 913,col 9)-(line 913,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 917,
      "end_line": 920,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 919,col 9)-(line 919,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 923,
      "end_line": 928,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 927,col 9)-(line 927,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 931,
      "end_line": 936,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 935,col 9)-(line 935,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.solve(double[])",
      "begin_line": 939,
      "end_line": 946,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 942,col 9)-(line 944,col 9)",
        "(line 945,col 9)-(line 945,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 949,
      "end_line": 956,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 952,col 9)-(line 954,col 9)",
        "(line 955,col 9)-(line 955,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.luDecompose()",
      "begin_line": 977,
      "end_line": 983,
      "comment": "\n     * Computes a new\n     * \u003ca href\u003d\"http://www.math.gatech.edu/~bourbaki/math2601/Web-notes/2num.pdf\"\u003e\n     * LU decomposition\u003c/a\u003e for this matrix, storing the result for use by other methods.\n     * \u003cp\u003e\n     * \u003cstrong\u003eImplementation Note\u003c/strong\u003e:\u003cbr\u003e\n     * Uses \u003ca href\u003d\"http://www.damtp.cam.ac.uk/user/fdl/people/sd/lectures/nummeth98/linear.htm\"\u003e\n     * Crout\u0027s algorithm\u003c/a\u003e, with partial pivoting.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note\u003c/strong\u003e:\u003cbr\u003e\n     * This method should rarely be invoked directly. Its only use is\n     * to force recomputation of the LU decomposition when changes have been\n     * made to the underlying data using direct array references. Changes\n     * made using setXxx methods will trigger recomputation when needed\n     * automatically.\u003c/p\u003e\n     *\n     * @throws InvalidMatrixException if the matrix is non-square or singular.\n     * @deprecated as of release 2.0, replaced by {@link LUDecomposition}\n     ",
      "child_ranges": [
        "(line 980,col 9)-(line 982,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.toString()",
      "begin_line": 989,
      "end_line": 1015,
      "comment": "\n     * Get a string representation for this matrix.\n     * @return a string representation for this matrix\n     ",
      "child_ranges": [
        "(line 991,col 9)-(line 991,col 44)",
        "(line 992,col 9)-(line 992,col 47)",
        "(line 993,col 9)-(line 993,col 52)",
        "(line 994,col 9)-(line 994,col 52)",
        "(line 995,col 9)-(line 995,col 92)",
        "(line 996,col 9)-(line 996,col 47)",
        "(line 998,col 9)-(line 1010,col 9)",
        "(line 1012,col 9)-(line 1012,col 24)",
        "(line 1013,col 9)-(line 1013,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.equals(java.lang.Object)",
      "begin_line": 1025,
      "end_line": 1047,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eRealMatrix\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.\n     * \n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 1027,col 9)-(line 1029,col 9)",
        "(line 1030,col 9)-(line 1032,col 9)",
        "(line 1033,col 9)-(line 1033,col 43)",
        "(line 1034,col 9)-(line 1034,col 44)",
        "(line 1035,col 9)-(line 1035,col 47)",
        "(line 1036,col 9)-(line 1038,col 9)",
        "(line 1039,col 9)-(line 1045,col 9)",
        "(line 1046,col 9)-(line 1046,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.hashCode()",
      "begin_line": 1054,
      "end_line": 1068,
      "comment": "\n     * Computes a hashcode for the matrix.\n     * \n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 1056,col 9)-(line 1056,col 20)",
        "(line 1057,col 9)-(line 1057,col 44)",
        "(line 1058,col 9)-(line 1058,col 47)",
        "(line 1059,col 9)-(line 1059,col 31)",
        "(line 1060,col 9)-(line 1060,col 31)",
        "(line 1061,col 9)-(line 1066,col 9)",
        "(line 1067,col 9)-(line 1067,col 19)"
      ]
    }
  ]
}