{
  "filepath": "/tmp/Math-50b/src/main/java/org/apache/commons/math/linear/AbstractRealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractRealMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealLinearOperator",
        "org.apache.commons.math.linear.RealMatrix"
      ],
      "begin_line": 38,
      "end_line": 946,
      "comment": "\n * Basic implementation of RealMatrix methods regardless of the underlying storage.\n * \u003cp\u003eAll the methods implemented here use {@link #getEntry(int, int)} to access\n * matrix elements. Derived class can provide faster implementations. \u003c/p\u003e\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.AbstractRealMatrix()",
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Creates a matrix with no data\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.AbstractRealMatrix(int, int)",
      "begin_line": 53,
      "end_line": 60,
      "comment": "\n     * Create a new RealMatrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension  the number of rows in the new matrix\n     * @param columnDimension  the number of columns in the new matrix\n     * @throws NotStrictlyPositiveException if row or column dimension is not positive\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 56,col 9)",
        "(line 57,col 9)-(line 59,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.createMatrix(int, int)",
      "begin_line": 63,
      "end_line": 63,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copy()",
      "begin_line": 66,
      "end_line": 66,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.add(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 69,
      "end_line": 83,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 53)",
        "(line 73,col 9)-(line 73,col 50)",
        "(line 74,col 9)-(line 74,col 53)",
        "(line 75,col 9)-(line 75,col 67)",
        "(line 76,col 9)-(line 80,col 9)",
        "(line 82,col 9)-(line 82,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 86,
      "end_line": 100,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 56)",
        "(line 90,col 9)-(line 90,col 50)",
        "(line 91,col 9)-(line 91,col 53)",
        "(line 92,col 9)-(line 92,col 67)",
        "(line 93,col 9)-(line 97,col 9)",
        "(line 99,col 9)-(line 99,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.scalarAdd(double)",
      "begin_line": 103,
      "end_line": 114,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 50)",
        "(line 105,col 9)-(line 105,col 53)",
        "(line 106,col 9)-(line 106,col 67)",
        "(line 107,col 9)-(line 111,col 9)",
        "(line 113,col 9)-(line 113,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.scalarMultiply(double)",
      "begin_line": 117,
      "end_line": 128,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 50)",
        "(line 119,col 9)-(line 119,col 53)",
        "(line 120,col 9)-(line 120,col 67)",
        "(line 121,col 9)-(line 125,col 9)",
        "(line 127,col 9)-(line 127,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 131,
      "end_line": 150,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 59)",
        "(line 135,col 9)-(line 135,col 44)",
        "(line 136,col 9)-(line 136,col 49)",
        "(line 137,col 9)-(line 137,col 47)",
        "(line 138,col 9)-(line 138,col 58)",
        "(line 139,col 9)-(line 147,col 9)",
        "(line 149,col 9)-(line 149,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 153,
      "end_line": 155,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.power(int)",
      "begin_line": 158,
      "end_line": 214,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 159,col 9)-(line 161,col 9)",
        "(line 163,col 9)-(line 165,col 9)",
        "(line 167,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 173,col 9)",
        "(line 175,col 9)-(line 175,col 32)",
        "(line 184,col 9)-(line 184,col 88)",
        "(line 185,col 9)-(line 185,col 77)",
        "(line 186,col 9)-(line 186,col 22)",
        "(line 188,col 9)-(line 198,col 9)",
        "(line 200,col 9)-(line 200,col 56)",
        "(line 201,col 9)-(line 201,col 33)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 207,col 9)-(line 207,col 40)",
        "(line 209,col 9)-(line 211,col 9)",
        "(line 213,col 9)-(line 213,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getData()",
      "begin_line": 217,
      "end_line": 228,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 84)",
        "(line 220,col 9)-(line 225,col 9)",
        "(line 227,col 9)-(line 227,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getNorm()",
      "begin_line": 231,
      "end_line": 266,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 232,col 9)-(line 265,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "endRow"
      ],
      "begin_line": 235,
      "end_line": 235,
      "comment": " Last row index. "
    },
    {
      "type": "field",
      "varNames": [
        "columnSum"
      ],
      "begin_line": 238,
      "end_line": 238,
      "comment": " Sum of absolute values on one column. "
    },
    {
      "type": "field",
      "varNames": [
        "maxColSum"
      ],
      "begin_line": 241,
      "end_line": 241,
      "comment": " Maximal sum across all columns. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-6be81bba-c7b6-481e-8771-697b1a6dc0b2.start(int, int, int, int, int, int)",
      "begin_line": 244,
      "end_line": 250,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 247,col 17)-(line 247,col 37)",
        "(line 248,col 17)-(line 248,col 32)",
        "(line 249,col 17)-(line 249,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-b9c1caf0-0f1f-41af-8637-9226b017c7bf.visit(int, int, double)",
      "begin_line": 253,
      "end_line": 259,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 254,col 17)-(line 254,col 49)",
        "(line 255,col 17)-(line 258,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-78a6743b-7fc9-4231-8dfc-b6a7d8b1a41c.end()",
      "begin_line": 262,
      "end_line": 264,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 263,col 17)-(line 263,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getFrobeniusNorm()",
      "begin_line": 269,
      "end_line": 292,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 270,col 9)-(line 291,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 273,
      "end_line": 273,
      "comment": " Sum of squared entries. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-18b0b632-1a91-4505-8c17-9035ab68f3c8.start(int, int, int, int, int, int)",
      "begin_line": 276,
      "end_line": 280,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 279,col 17)-(line 279,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-93df5d61-e21f-411b-b17f-137827673fcd.visit(int, int, double)",
      "begin_line": 283,
      "end_line": 285,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 284,col 17)-(line 284,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-82401c59-436f-4a25-bac5-5891179d4b89.end()",
      "begin_line": 288,
      "end_line": 290,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 289,col 17)-(line 289,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 295,
      "end_line": 308,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 88)",
        "(line 299,col 9)-(line 300,col 77)",
        "(line 301,col 9)-(line 305,col 9)",
        "(line 307,col 9)-(line 307,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getSubMatrix(int[], int[])",
      "begin_line": 311,
      "end_line": 329,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 77)",
        "(line 316,col 9)-(line 317,col 70)",
        "(line 318,col 9)-(line 326,col 11)",
        "(line 328,col 9)-(line 328,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-61b4bd9b-c21a-4d2d-8133-d3a801e2a106.visit(int, int, double)",
      "begin_line": 321,
      "end_line": 324,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 323,col 17)-(line 323,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copySubMatrix(int, int, int, int, double[][])",
      "begin_line": 332,
      "end_line": 369,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 88)",
        "(line 337,col 9)-(line 337,col 55)",
        "(line 338,col 9)-(line 338,col 61)",
        "(line 339,col 9)-(line 342,col 9)",
        "(line 345,col 9)-(line 368,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "startRow"
      ],
      "begin_line": 348,
      "end_line": 348,
      "comment": " Initial row index. "
    },
    {
      "type": "field",
      "varNames": [
        "startColumn"
      ],
      "begin_line": 351,
      "end_line": 351,
      "comment": " Initial column index. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-f3d57887-4164-4c46-a8fc-67121a31d840.start(int, int, int, int, int, int)",
      "begin_line": 354,
      "end_line": 360,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 358,col 17)-(line 358,col 44)",
        "(line 359,col 17)-(line 359,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-29d9319b-873f-462a-aca5-fe29e53d989d.visit(int, int, double)",
      "begin_line": 363,
      "end_line": 366,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 365,col 17)-(line 365,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copySubMatrix(int[], int[], double[][])",
      "begin_line": 372,
      "end_line": 388,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 77)",
        "(line 375,col 9)-(line 379,col 9)",
        "(line 382,col 9)-(line 387,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 391,
      "end_line": 420,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 42)",
        "(line 394,col 9)-(line 394,col 43)",
        "(line 395,col 9)-(line 397,col 9)",
        "(line 399,col 9)-(line 399,col 46)",
        "(line 400,col 9)-(line 402,col 9)",
        "(line 404,col 9)-(line 408,col 9)",
        "(line 410,col 9)-(line 410,col 45)",
        "(line 411,col 9)-(line 411,col 51)",
        "(line 412,col 9)-(line 412,col 57)",
        "(line 413,col 9)-(line 413,col 63)",
        "(line 415,col 9)-(line 419,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowMatrix(int)",
      "begin_line": 423,
      "end_line": 432,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 45)",
        "(line 425,col 9)-(line 425,col 47)",
        "(line 426,col 9)-(line 426,col 54)",
        "(line 427,col 9)-(line 429,col 9)",
        "(line 431,col 9)-(line 431,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRowMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 435,
      "end_line": 447,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 45)",
        "(line 437,col 9)-(line 437,col 47)",
        "(line 438,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 446,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnMatrix(int)",
      "begin_line": 450,
      "end_line": 459,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 51)",
        "(line 452,col 9)-(line 452,col 44)",
        "(line 453,col 9)-(line 453,col 54)",
        "(line 454,col 9)-(line 456,col 9)",
        "(line 458,col 9)-(line 458,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 462,
      "end_line": 474,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 51)",
        "(line 464,col 9)-(line 464,col 44)",
        "(line 465,col 9)-(line 470,col 9)",
        "(line 471,col 9)-(line 473,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowVector(int)",
      "begin_line": 477,
      "end_line": 479,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRowVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 482,
      "end_line": 492,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 45)",
        "(line 484,col 9)-(line 484,col 47)",
        "(line 485,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 491,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnVector(int)",
      "begin_line": 495,
      "end_line": 497,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumnVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 500,
      "end_line": 510,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 51)",
        "(line 502,col 9)-(line 502,col 44)",
        "(line 503,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 509,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRow(int)",
      "begin_line": 513,
      "end_line": 522,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 45)",
        "(line 515,col 9)-(line 515,col 47)",
        "(line 516,col 9)-(line 516,col 47)",
        "(line 517,col 9)-(line 519,col 9)",
        "(line 521,col 9)-(line 521,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRow(int, double[])",
      "begin_line": 525,
      "end_line": 534,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 45)",
        "(line 527,col 9)-(line 527,col 47)",
        "(line 528,col 9)-(line 530,col 9)",
        "(line 531,col 9)-(line 533,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumn(int)",
      "begin_line": 537,
      "end_line": 546,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 51)",
        "(line 539,col 9)-(line 539,col 44)",
        "(line 540,col 9)-(line 540,col 47)",
        "(line 541,col 9)-(line 543,col 9)",
        "(line 545,col 9)-(line 545,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumn(int, double[])",
      "begin_line": 549,
      "end_line": 558,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 550,col 9)-(line 550,col 51)",
        "(line 551,col 9)-(line 551,col 44)",
        "(line 552,col 9)-(line 554,col 9)",
        "(line 555,col 9)-(line 557,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getEntry(int, int)",
      "begin_line": 561,
      "end_line": 561,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setEntry(int, int, double)",
      "begin_line": 564,
      "end_line": 564,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.addToEntry(int, int, double)",
      "begin_line": 567,
      "end_line": 567,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 570,
      "end_line": 570,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.transpose()",
      "begin_line": 573,
      "end_line": 588,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 44)",
        "(line 575,col 9)-(line 575,col 47)",
        "(line 576,col 9)-(line 576,col 58)",
        "(line 577,col 9)-(line 585,col 11)",
        "(line 587,col 9)-(line 587,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-f0612455-658e-47b5-8106-91655c76f850.visit(int, int, double)",
      "begin_line": 580,
      "end_line": 583,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 582,col 17)-(line 582,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.isSquare()",
      "begin_line": 591,
      "end_line": 593,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowDimension()",
      "begin_line": 602,
      "end_line": 603,
      "comment": "\n     * Returns the number of rows of this matrix.\n     *\n     * @return the number of rows.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnDimension()",
      "begin_line": 610,
      "end_line": 611,
      "comment": "\n     * Returns the number of columns of this matrix.\n     *\n     * @return the number of columns.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getTrace()",
      "begin_line": 614,
      "end_line": 625,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 615,col 9)-(line 615,col 44)",
        "(line 616,col 9)-(line 616,col 47)",
        "(line 617,col 9)-(line 619,col 8)",
        "(line 620,col 9)-(line 620,col 25)",
        "(line 621,col 9)-(line 623,col 9)",
        "(line 624,col 9)-(line 624,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.operate(double[])",
      "begin_line": 628,
      "end_line": 646,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 630,col 9)-(line 630,col 44)",
        "(line 631,col 9)-(line 631,col 47)",
        "(line 632,col 9)-(line 634,col 9)",
        "(line 636,col 9)-(line 636,col 47)",
        "(line 637,col 9)-(line 643,col 9)",
        "(line 645,col 9)-(line 645,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.operate(org.apache.commons.math.linear.RealVector)",
      "begin_line": 649,
      "end_line": 671,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 651,col 9)-(line 670,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(double[])",
      "begin_line": 674,
      "end_line": 692,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 676,col 9)-(line 676,col 44)",
        "(line 677,col 9)-(line 677,col 47)",
        "(line 678,col 9)-(line 680,col 9)",
        "(line 682,col 9)-(line 682,col 47)",
        "(line 683,col 9)-(line 689,col 9)",
        "(line 691,col 9)-(line 691,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 695,
      "end_line": 717,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 696,col 9)-(line 716,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 720,
      "end_line": 732,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 721,col 9)-(line 721,col 46)",
        "(line 722,col 9)-(line 722,col 49)",
        "(line 723,col 9)-(line 723,col 66)",
        "(line 724,col 9)-(line 730,col 9)",
        "(line 731,col 9)-(line 731,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 735,
      "end_line": 745,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 736,col 9)-(line 736,col 46)",
        "(line 737,col 9)-(line 737,col 49)",
        "(line 738,col 9)-(line 738,col 66)",
        "(line 739,col 9)-(line 743,col 9)",
        "(line 744,col 9)-(line 744,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 748,
      "end_line": 762,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 751,col 9)-(line 751,col 88)",
        "(line 752,col 9)-(line 753,col 64)",
        "(line 754,col 9)-(line 760,col 9)",
        "(line 761,col 9)-(line 761,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 765,
      "end_line": 777,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 768,col 9)-(line 768,col 88)",
        "(line 769,col 9)-(line 770,col 64)",
        "(line 771,col 9)-(line 775,col 9)",
        "(line 776,col 9)-(line 776,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 780,
      "end_line": 792,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 781,col 9)-(line 781,col 46)",
        "(line 782,col 9)-(line 782,col 49)",
        "(line 783,col 9)-(line 783,col 66)",
        "(line 784,col 9)-(line 790,col 9)",
        "(line 791,col 9)-(line 791,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 795,
      "end_line": 805,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 46)",
        "(line 797,col 9)-(line 797,col 49)",
        "(line 798,col 9)-(line 798,col 66)",
        "(line 799,col 9)-(line 803,col 9)",
        "(line 804,col 9)-(line 804,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 808,
      "end_line": 822,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 811,col 9)-(line 811,col 88)",
        "(line 812,col 9)-(line 813,col 64)",
        "(line 814,col 9)-(line 820,col 9)",
        "(line 821,col 9)-(line 821,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 825,
      "end_line": 837,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 828,col 9)-(line 828,col 88)",
        "(line 829,col 9)-(line 830,col 64)",
        "(line 831,col 9)-(line 835,col 9)",
        "(line 836,col 9)-(line 836,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 840,
      "end_line": 842,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 841,col 9)-(line 841,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 845,
      "end_line": 847,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 846,col 9)-(line 846,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 850,
      "end_line": 854,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 853,col 9)-(line 853,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 857,
      "end_line": 861,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 860,col 9)-(line 860,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.toString()",
      "begin_line": 867,
      "end_line": 892,
      "comment": "\n     * Get a string representation for this matrix.\n     * @return a string representation for this matrix\n     ",
      "child_ranges": [
        "(line 869,col 9)-(line 869,col 44)",
        "(line 870,col 9)-(line 870,col 47)",
        "(line 871,col 9)-(line 871,col 52)",
        "(line 872,col 9)-(line 872,col 52)",
        "(line 873,col 9)-(line 873,col 92)",
        "(line 874,col 9)-(line 874,col 47)",
        "(line 876,col 9)-(line 888,col 9)",
        "(line 890,col 9)-(line 890,col 24)",
        "(line 891,col 9)-(line 891,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.equals(java.lang.Object)",
      "begin_line": 902,
      "end_line": 924,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eRealMatrix\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.\n     *\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 904,col 9)-(line 906,col 9)",
        "(line 907,col 9)-(line 909,col 9)",
        "(line 910,col 9)-(line 910,col 43)",
        "(line 911,col 9)-(line 911,col 44)",
        "(line 912,col 9)-(line 912,col 47)",
        "(line 913,col 9)-(line 915,col 9)",
        "(line 916,col 9)-(line 922,col 9)",
        "(line 923,col 9)-(line 923,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.hashCode()",
      "begin_line": 931,
      "end_line": 945,
      "comment": "\n     * Computes a hashcode for the matrix.\n     *\n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 933,col 9)-(line 933,col 20)",
        "(line 934,col 9)-(line 934,col 44)",
        "(line 935,col 9)-(line 935,col 47)",
        "(line 936,col 9)-(line 936,col 31)",
        "(line 937,col 9)-(line 937,col 31)",
        "(line 938,col 9)-(line 943,col 9)",
        "(line 944,col 9)-(line 944,col 19)"
      ]
    }
  ]
}