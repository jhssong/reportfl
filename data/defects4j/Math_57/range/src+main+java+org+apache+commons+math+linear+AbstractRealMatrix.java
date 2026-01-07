{
  "filepath": "/tmp/Math-57b/src/main/java/org/apache/commons/math/linear/AbstractRealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractRealMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealMatrix"
      ],
      "begin_line": 35,
      "end_line": 866,
      "comment": "\n * Basic implementation of RealMatrix methods regardless of the underlying storage.\n * \u003cp\u003eAll the methods implemented here use {@link #getEntry(int, int)} to access\n * matrix elements. Derived class can provide faster implementations. \u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.AbstractRealMatrix()",
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Creates a matrix with no data\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.AbstractRealMatrix(int, int)",
      "begin_line": 48,
      "end_line": 55,
      "comment": "\n     * Create a new RealMatrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension  the number of rows in the new matrix\n     * @param columnDimension  the number of columns in the new matrix\n     * @throws NotStrictlyPositiveException if row or column dimension is not positive\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 51,col 9)",
        "(line 52,col 9)-(line 54,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.createMatrix(int, int)",
      "begin_line": 58,
      "end_line": 58,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copy()",
      "begin_line": 61,
      "end_line": 61,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.add(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 64,
      "end_line": 78,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 53)",
        "(line 68,col 9)-(line 68,col 50)",
        "(line 69,col 9)-(line 69,col 53)",
        "(line 70,col 9)-(line 70,col 67)",
        "(line 71,col 9)-(line 75,col 9)",
        "(line 77,col 9)-(line 77,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 81,
      "end_line": 95,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 56)",
        "(line 85,col 9)-(line 85,col 50)",
        "(line 86,col 9)-(line 86,col 53)",
        "(line 87,col 9)-(line 87,col 67)",
        "(line 88,col 9)-(line 92,col 9)",
        "(line 94,col 9)-(line 94,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.scalarAdd(double)",
      "begin_line": 98,
      "end_line": 109,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 50)",
        "(line 100,col 9)-(line 100,col 53)",
        "(line 101,col 9)-(line 101,col 67)",
        "(line 102,col 9)-(line 106,col 9)",
        "(line 108,col 9)-(line 108,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.scalarMultiply(double)",
      "begin_line": 112,
      "end_line": 123,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 50)",
        "(line 114,col 9)-(line 114,col 53)",
        "(line 115,col 9)-(line 115,col 67)",
        "(line 116,col 9)-(line 120,col 9)",
        "(line 122,col 9)-(line 122,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 126,
      "end_line": 145,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 59)",
        "(line 130,col 9)-(line 130,col 44)",
        "(line 131,col 9)-(line 131,col 49)",
        "(line 132,col 9)-(line 132,col 47)",
        "(line 133,col 9)-(line 133,col 58)",
        "(line 134,col 9)-(line 142,col 9)",
        "(line 144,col 9)-(line 144,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 148,
      "end_line": 150,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getData()",
      "begin_line": 153,
      "end_line": 164,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 84)",
        "(line 156,col 9)-(line 161,col 9)",
        "(line 163,col 9)-(line 163,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getNorm()",
      "begin_line": 167,
      "end_line": 202,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 168,col 9)-(line 201,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "endRow"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": " Last row index. "
    },
    {
      "type": "field",
      "varNames": [
        "columnSum"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": " Sum of absolute values on one column. "
    },
    {
      "type": "field",
      "varNames": [
        "maxColSum"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": " Maximal sum across all columns. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-3d4d12c8-da2c-407a-bdd0-d20a6ad87291.start(int, int, int, int, int, int)",
      "begin_line": 180,
      "end_line": 186,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 183,col 17)-(line 183,col 37)",
        "(line 184,col 17)-(line 184,col 32)",
        "(line 185,col 17)-(line 185,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-2d3ae1fc-0fd4-41a1-8264-fe1c92477153.visit(int, int, double)",
      "begin_line": 189,
      "end_line": 195,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 190,col 17)-(line 190,col 49)",
        "(line 191,col 17)-(line 194,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-199b1649-a00d-438e-92e8-0b4c6a9236f0.end()",
      "begin_line": 198,
      "end_line": 200,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 199,col 17)-(line 199,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getFrobeniusNorm()",
      "begin_line": 205,
      "end_line": 228,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 206,col 9)-(line 227,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": " Sum of squared entries. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-278cc3a5-9525-4823-a374-2b5dd8181a3e.start(int, int, int, int, int, int)",
      "begin_line": 212,
      "end_line": 216,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 215,col 17)-(line 215,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-4a6e9c61-48b8-4068-b52d-e634f3666970.visit(int, int, double)",
      "begin_line": 219,
      "end_line": 221,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 220,col 17)-(line 220,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-1bfcbe38-6233-40e1-9594-69de3df204ef.end()",
      "begin_line": 224,
      "end_line": 226,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 225,col 17)-(line 225,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 231,
      "end_line": 244,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 88)",
        "(line 235,col 9)-(line 236,col 77)",
        "(line 237,col 9)-(line 241,col 9)",
        "(line 243,col 9)-(line 243,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getSubMatrix(int[], int[])",
      "begin_line": 247,
      "end_line": 265,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 77)",
        "(line 252,col 9)-(line 253,col 70)",
        "(line 254,col 9)-(line 262,col 11)",
        "(line 264,col 9)-(line 264,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-6a1e0779-5688-44fb-b85e-a2c00ceeea13.visit(int, int, double)",
      "begin_line": 257,
      "end_line": 260,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 259,col 17)-(line 259,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copySubMatrix(int, int, int, int, double[][])",
      "begin_line": 268,
      "end_line": 305,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 88)",
        "(line 273,col 9)-(line 273,col 55)",
        "(line 274,col 9)-(line 274,col 61)",
        "(line 275,col 9)-(line 278,col 9)",
        "(line 281,col 9)-(line 304,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "startRow"
      ],
      "begin_line": 284,
      "end_line": 284,
      "comment": " Initial row index. "
    },
    {
      "type": "field",
      "varNames": [
        "startColumn"
      ],
      "begin_line": 287,
      "end_line": 287,
      "comment": " Initial column index. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-48d1f08c-e910-42dc-a061-a0a0fa74812c.start(int, int, int, int, int, int)",
      "begin_line": 290,
      "end_line": 296,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 294,col 17)-(line 294,col 44)",
        "(line 295,col 17)-(line 295,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-dc3a6dc9-5977-427d-84d3-9a8475f3eee3.visit(int, int, double)",
      "begin_line": 299,
      "end_line": 302,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 301,col 17)-(line 301,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copySubMatrix(int[], int[], double[][])",
      "begin_line": 308,
      "end_line": 324,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 77)",
        "(line 311,col 9)-(line 315,col 9)",
        "(line 318,col 9)-(line 323,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 327,
      "end_line": 354,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 43)",
        "(line 329,col 9)-(line 331,col 9)",
        "(line 333,col 9)-(line 333,col 46)",
        "(line 334,col 9)-(line 336,col 9)",
        "(line 338,col 9)-(line 342,col 9)",
        "(line 344,col 9)-(line 344,col 45)",
        "(line 345,col 9)-(line 345,col 51)",
        "(line 346,col 9)-(line 346,col 57)",
        "(line 347,col 9)-(line 347,col 63)",
        "(line 349,col 9)-(line 353,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowMatrix(int)",
      "begin_line": 357,
      "end_line": 366,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 45)",
        "(line 359,col 9)-(line 359,col 47)",
        "(line 360,col 9)-(line 360,col 54)",
        "(line 361,col 9)-(line 363,col 9)",
        "(line 365,col 9)-(line 365,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRowMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 369,
      "end_line": 381,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 45)",
        "(line 371,col 9)-(line 371,col 47)",
        "(line 372,col 9)-(line 377,col 9)",
        "(line 378,col 9)-(line 380,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnMatrix(int)",
      "begin_line": 384,
      "end_line": 393,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 51)",
        "(line 386,col 9)-(line 386,col 44)",
        "(line 387,col 9)-(line 387,col 54)",
        "(line 388,col 9)-(line 390,col 9)",
        "(line 392,col 9)-(line 392,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 396,
      "end_line": 408,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 51)",
        "(line 398,col 9)-(line 398,col 44)",
        "(line 399,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 407,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowVector(int)",
      "begin_line": 411,
      "end_line": 413,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRowVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 416,
      "end_line": 426,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 45)",
        "(line 418,col 9)-(line 418,col 47)",
        "(line 419,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 425,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnVector(int)",
      "begin_line": 429,
      "end_line": 431,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumnVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 434,
      "end_line": 444,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 51)",
        "(line 436,col 9)-(line 436,col 44)",
        "(line 437,col 9)-(line 440,col 9)",
        "(line 441,col 9)-(line 443,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRow(int)",
      "begin_line": 447,
      "end_line": 456,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 45)",
        "(line 449,col 9)-(line 449,col 47)",
        "(line 450,col 9)-(line 450,col 47)",
        "(line 451,col 9)-(line 453,col 9)",
        "(line 455,col 9)-(line 455,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRow(int, double[])",
      "begin_line": 459,
      "end_line": 468,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 45)",
        "(line 461,col 9)-(line 461,col 47)",
        "(line 462,col 9)-(line 464,col 9)",
        "(line 465,col 9)-(line 467,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumn(int)",
      "begin_line": 471,
      "end_line": 480,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 51)",
        "(line 473,col 9)-(line 473,col 44)",
        "(line 474,col 9)-(line 474,col 47)",
        "(line 475,col 9)-(line 477,col 9)",
        "(line 479,col 9)-(line 479,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumn(int, double[])",
      "begin_line": 483,
      "end_line": 492,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 51)",
        "(line 485,col 9)-(line 485,col 44)",
        "(line 486,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 491,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getEntry(int, int)",
      "begin_line": 495,
      "end_line": 495,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setEntry(int, int, double)",
      "begin_line": 498,
      "end_line": 498,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.addToEntry(int, int, double)",
      "begin_line": 501,
      "end_line": 501,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 504,
      "end_line": 504,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.transpose()",
      "begin_line": 507,
      "end_line": 522,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 44)",
        "(line 509,col 9)-(line 509,col 47)",
        "(line 510,col 9)-(line 510,col 58)",
        "(line 511,col 9)-(line 519,col 11)",
        "(line 521,col 9)-(line 521,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-aecfb6a4-5b08-48af-9023-4c76d3141452.visit(int, int, double)",
      "begin_line": 514,
      "end_line": 517,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 516,col 17)-(line 516,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.isSquare()",
      "begin_line": 525,
      "end_line": 527,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowDimension()",
      "begin_line": 530,
      "end_line": 530,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnDimension()",
      "begin_line": 533,
      "end_line": 533,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getTrace()",
      "begin_line": 536,
      "end_line": 547,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 44)",
        "(line 538,col 9)-(line 538,col 47)",
        "(line 539,col 9)-(line 541,col 8)",
        "(line 542,col 9)-(line 542,col 25)",
        "(line 543,col 9)-(line 545,col 9)",
        "(line 546,col 9)-(line 546,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.operate(double[])",
      "begin_line": 550,
      "end_line": 567,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 551,col 9)-(line 551,col 44)",
        "(line 552,col 9)-(line 552,col 47)",
        "(line 553,col 9)-(line 555,col 9)",
        "(line 557,col 9)-(line 557,col 47)",
        "(line 558,col 9)-(line 564,col 9)",
        "(line 566,col 9)-(line 566,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.operate(org.apache.commons.math.linear.RealVector)",
      "begin_line": 570,
      "end_line": 591,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 571,col 9)-(line 590,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(double[])",
      "begin_line": 594,
      "end_line": 612,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 44)",
        "(line 597,col 9)-(line 597,col 47)",
        "(line 598,col 9)-(line 600,col 9)",
        "(line 602,col 9)-(line 602,col 47)",
        "(line 603,col 9)-(line 609,col 9)",
        "(line 611,col 9)-(line 611,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 615,
      "end_line": 637,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 616,col 9)-(line 636,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 640,
      "end_line": 652,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 46)",
        "(line 642,col 9)-(line 642,col 49)",
        "(line 643,col 9)-(line 643,col 66)",
        "(line 644,col 9)-(line 650,col 9)",
        "(line 651,col 9)-(line 651,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 655,
      "end_line": 665,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 656,col 9)-(line 656,col 46)",
        "(line 657,col 9)-(line 657,col 49)",
        "(line 658,col 9)-(line 658,col 66)",
        "(line 659,col 9)-(line 663,col 9)",
        "(line 664,col 9)-(line 664,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 668,
      "end_line": 682,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 671,col 9)-(line 671,col 88)",
        "(line 672,col 9)-(line 673,col 64)",
        "(line 674,col 9)-(line 680,col 9)",
        "(line 681,col 9)-(line 681,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 685,
      "end_line": 697,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 688,col 9)-(line 688,col 88)",
        "(line 689,col 9)-(line 690,col 64)",
        "(line 691,col 9)-(line 695,col 9)",
        "(line 696,col 9)-(line 696,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 700,
      "end_line": 712,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 701,col 9)-(line 701,col 46)",
        "(line 702,col 9)-(line 702,col 49)",
        "(line 703,col 9)-(line 703,col 66)",
        "(line 704,col 9)-(line 710,col 9)",
        "(line 711,col 9)-(line 711,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 715,
      "end_line": 725,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 46)",
        "(line 717,col 9)-(line 717,col 49)",
        "(line 718,col 9)-(line 718,col 66)",
        "(line 719,col 9)-(line 723,col 9)",
        "(line 724,col 9)-(line 724,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 728,
      "end_line": 742,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 731,col 9)-(line 731,col 88)",
        "(line 732,col 9)-(line 733,col 64)",
        "(line 734,col 9)-(line 740,col 9)",
        "(line 741,col 9)-(line 741,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 745,
      "end_line": 757,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 748,col 9)-(line 748,col 88)",
        "(line 749,col 9)-(line 750,col 64)",
        "(line 751,col 9)-(line 755,col 9)",
        "(line 756,col 9)-(line 756,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 760,
      "end_line": 762,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 761,col 9)-(line 761,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 765,
      "end_line": 767,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 766,col 9)-(line 766,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 770,
      "end_line": 774,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 773,col 9)-(line 773,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 777,
      "end_line": 781,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 780,col 9)-(line 780,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.toString()",
      "begin_line": 787,
      "end_line": 812,
      "comment": "\n     * Get a string representation for this matrix.\n     * @return a string representation for this matrix\n     ",
      "child_ranges": [
        "(line 789,col 9)-(line 789,col 44)",
        "(line 790,col 9)-(line 790,col 47)",
        "(line 791,col 9)-(line 791,col 52)",
        "(line 792,col 9)-(line 792,col 52)",
        "(line 793,col 9)-(line 793,col 92)",
        "(line 794,col 9)-(line 794,col 47)",
        "(line 796,col 9)-(line 808,col 9)",
        "(line 810,col 9)-(line 810,col 24)",
        "(line 811,col 9)-(line 811,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.equals(java.lang.Object)",
      "begin_line": 822,
      "end_line": 844,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eRealMatrix\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.\n     *\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 824,col 9)-(line 826,col 9)",
        "(line 827,col 9)-(line 829,col 9)",
        "(line 830,col 9)-(line 830,col 43)",
        "(line 831,col 9)-(line 831,col 44)",
        "(line 832,col 9)-(line 832,col 47)",
        "(line 833,col 9)-(line 835,col 9)",
        "(line 836,col 9)-(line 842,col 9)",
        "(line 843,col 9)-(line 843,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.hashCode()",
      "begin_line": 851,
      "end_line": 865,
      "comment": "\n     * Computes a hashcode for the matrix.\n     *\n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 853,col 9)-(line 853,col 20)",
        "(line 854,col 9)-(line 854,col 44)",
        "(line 855,col 9)-(line 855,col 47)",
        "(line 856,col 9)-(line 856,col 31)",
        "(line 857,col 9)-(line 857,col 31)",
        "(line 858,col 9)-(line 863,col 9)",
        "(line 864,col 9)-(line 864,col 19)"
      ]
    }
  ]
}