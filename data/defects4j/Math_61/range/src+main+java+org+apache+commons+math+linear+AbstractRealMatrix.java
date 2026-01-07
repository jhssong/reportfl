{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/linear/AbstractRealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractRealMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealMatrix"
      ],
      "begin_line": 36,
      "end_line": 1008,
      "comment": "\n * Basic implementation of RealMatrix methods regardless of the underlying storage.\n * \u003cp\u003eAll the methods implemented here use {@link #getEntry(int, int)} to access\n * matrix elements. Derived class can provide faster implementations. \u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "lu"
      ],
      "begin_line": 42,
      "end_line": 43,
      "comment": " Cached LU solver.\n     * @deprecated as of release 2.0, since all methods using this are deprecated\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.AbstractRealMatrix()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Creates a matrix with no data\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.AbstractRealMatrix(int, int)",
      "begin_line": 59,
      "end_line": 67,
      "comment": "\n     * Create a new RealMatrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension  the number of rows in the new matrix\n     * @param columnDimension  the number of columns in the new matrix\n     * @throws NotStrictlyPositiveException if row or column dimension is not positive\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 62,col 9)",
        "(line 63,col 9)-(line 65,col 9)",
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
      "end_line": 92,
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
      "begin_line": 95,
      "end_line": 110,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 56)",
        "(line 100,col 9)-(line 100,col 50)",
        "(line 101,col 9)-(line 101,col 53)",
        "(line 102,col 9)-(line 102,col 67)",
        "(line 103,col 9)-(line 107,col 9)",
        "(line 109,col 9)-(line 109,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.scalarAdd(double)",
      "begin_line": 113,
      "end_line": 125,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 50)",
        "(line 116,col 9)-(line 116,col 53)",
        "(line 117,col 9)-(line 117,col 67)",
        "(line 118,col 9)-(line 122,col 9)",
        "(line 124,col 9)-(line 124,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.scalarMultiply(double)",
      "begin_line": 128,
      "end_line": 140,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 50)",
        "(line 131,col 9)-(line 131,col 53)",
        "(line 132,col 9)-(line 132,col 67)",
        "(line 133,col 9)-(line 137,col 9)",
        "(line 139,col 9)-(line 139,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 143,
      "end_line": 164,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 59)",
        "(line 149,col 9)-(line 149,col 44)",
        "(line 150,col 9)-(line 150,col 49)",
        "(line 151,col 9)-(line 151,col 47)",
        "(line 152,col 9)-(line 152,col 58)",
        "(line 153,col 9)-(line 161,col 9)",
        "(line 163,col 9)-(line 163,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 167,
      "end_line": 170,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getData()",
      "begin_line": 173,
      "end_line": 185,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 84)",
        "(line 177,col 9)-(line 182,col 9)",
        "(line 184,col 9)-(line 184,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getNorm()",
      "begin_line": 188,
      "end_line": 223,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 189,col 9)-(line 222,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "endRow"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": " Last row index. "
    },
    {
      "type": "field",
      "varNames": [
        "columnSum"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": " Sum of absolute values on one column. "
    },
    {
      "type": "field",
      "varNames": [
        "maxColSum"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": " Maximal sum across all columns. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-0c444faa-0e6e-4132-bb69-72ba312ab4e4.start(int, int, int, int, int, int)",
      "begin_line": 201,
      "end_line": 207,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 204,col 17)-(line 204,col 37)",
        "(line 205,col 17)-(line 205,col 32)",
        "(line 206,col 17)-(line 206,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-1d07c31d-3877-4c27-9096-d23452d60087.visit(int, int, double)",
      "begin_line": 210,
      "end_line": 216,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 211,col 17)-(line 211,col 49)",
        "(line 212,col 17)-(line 215,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-8436a3df-c7a2-4685-9c8a-0494b28a4b66.end()",
      "begin_line": 219,
      "end_line": 221,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 220,col 17)-(line 220,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getFrobeniusNorm()",
      "begin_line": 226,
      "end_line": 249,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 227,col 9)-(line 248,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 230,
      "end_line": 230,
      "comment": " Sum of squared entries. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-876627a8-992d-4994-b970-b44aa98bb5f7.start(int, int, int, int, int, int)",
      "begin_line": 233,
      "end_line": 237,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 236,col 17)-(line 236,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-cbbb1f01-0a83-4f76-91a6-894cffd3c87b.visit(int, int, double)",
      "begin_line": 240,
      "end_line": 242,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 241,col 17)-(line 241,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-aece1f20-52a1-4702-8f62-8521a2cca151.end()",
      "begin_line": 245,
      "end_line": 247,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 246,col 17)-(line 246,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 252,
      "end_line": 267,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 88)",
        "(line 258,col 9)-(line 259,col 77)",
        "(line 260,col 9)-(line 264,col 9)",
        "(line 266,col 9)-(line 266,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getSubMatrix(int[], int[])",
      "begin_line": 270,
      "end_line": 290,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 77)",
        "(line 277,col 9)-(line 278,col 70)",
        "(line 279,col 9)-(line 287,col 11)",
        "(line 289,col 9)-(line 289,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-cca8454e-2d8a-4591-b7ea-978bafa39fe0.visit(int, int, double)",
      "begin_line": 282,
      "end_line": 285,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 284,col 17)-(line 284,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copySubMatrix(int, int, int, int, double[][])",
      "begin_line": 293,
      "end_line": 332,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 88)",
        "(line 300,col 9)-(line 300,col 55)",
        "(line 301,col 9)-(line 301,col 61)",
        "(line 302,col 9)-(line 305,col 9)",
        "(line 308,col 9)-(line 331,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "startRow"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": " Initial row index. "
    },
    {
      "type": "field",
      "varNames": [
        "startColumn"
      ],
      "begin_line": 314,
      "end_line": 314,
      "comment": " Initial column index. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-8302a2f3-da1a-4508-9232-39bd38782eeb.start(int, int, int, int, int, int)",
      "begin_line": 317,
      "end_line": 323,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 321,col 17)-(line 321,col 44)",
        "(line 322,col 17)-(line 322,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-97f0fa4b-2d83-4604-a1a4-101ef5ac15fb.visit(int, int, double)",
      "begin_line": 326,
      "end_line": 329,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 328,col 17)-(line 328,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copySubMatrix(int[], int[], double[][])",
      "begin_line": 335,
      "end_line": 352,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 77)",
        "(line 339,col 9)-(line 343,col 9)",
        "(line 346,col 9)-(line 351,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 355,
      "end_line": 386,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 43)",
        "(line 359,col 9)-(line 361,col 9)",
        "(line 363,col 9)-(line 363,col 46)",
        "(line 364,col 9)-(line 366,col 9)",
        "(line 368,col 9)-(line 372,col 9)",
        "(line 374,col 9)-(line 374,col 45)",
        "(line 375,col 9)-(line 375,col 51)",
        "(line 376,col 9)-(line 376,col 57)",
        "(line 377,col 9)-(line 377,col 63)",
        "(line 379,col 9)-(line 383,col 9)",
        "(line 385,col 9)-(line 385,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowMatrix(int)",
      "begin_line": 389,
      "end_line": 400,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 45)",
        "(line 393,col 9)-(line 393,col 47)",
        "(line 394,col 9)-(line 394,col 54)",
        "(line 395,col 9)-(line 397,col 9)",
        "(line 399,col 9)-(line 399,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRowMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 403,
      "end_line": 415,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 45)",
        "(line 405,col 9)-(line 405,col 47)",
        "(line 406,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 414,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnMatrix(int)",
      "begin_line": 418,
      "end_line": 429,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 51)",
        "(line 422,col 9)-(line 422,col 44)",
        "(line 423,col 9)-(line 423,col 54)",
        "(line 424,col 9)-(line 426,col 9)",
        "(line 428,col 9)-(line 428,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 432,
      "end_line": 444,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 51)",
        "(line 434,col 9)-(line 434,col 44)",
        "(line 435,col 9)-(line 440,col 9)",
        "(line 441,col 9)-(line 443,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowVector(int)",
      "begin_line": 447,
      "end_line": 450,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRowVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 453,
      "end_line": 463,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 45)",
        "(line 455,col 9)-(line 455,col 47)",
        "(line 456,col 9)-(line 459,col 9)",
        "(line 460,col 9)-(line 462,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnVector(int)",
      "begin_line": 466,
      "end_line": 469,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumnVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 472,
      "end_line": 482,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 51)",
        "(line 474,col 9)-(line 474,col 44)",
        "(line 475,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 481,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRow(int)",
      "begin_line": 485,
      "end_line": 496,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 45)",
        "(line 489,col 9)-(line 489,col 47)",
        "(line 490,col 9)-(line 490,col 47)",
        "(line 491,col 9)-(line 493,col 9)",
        "(line 495,col 9)-(line 495,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRow(int, double[])",
      "begin_line": 499,
      "end_line": 508,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 45)",
        "(line 501,col 9)-(line 501,col 47)",
        "(line 502,col 9)-(line 504,col 9)",
        "(line 505,col 9)-(line 507,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumn(int)",
      "begin_line": 511,
      "end_line": 522,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 51)",
        "(line 515,col 9)-(line 515,col 44)",
        "(line 516,col 9)-(line 516,col 47)",
        "(line 517,col 9)-(line 519,col 9)",
        "(line 521,col 9)-(line 521,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumn(int, double[])",
      "begin_line": 525,
      "end_line": 534,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 51)",
        "(line 527,col 9)-(line 527,col 44)",
        "(line 528,col 9)-(line 530,col 9)",
        "(line 531,col 9)-(line 533,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getEntry(int, int)",
      "begin_line": 537,
      "end_line": 538,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setEntry(int, int, double)",
      "begin_line": 541,
      "end_line": 542,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.addToEntry(int, int, double)",
      "begin_line": 545,
      "end_line": 546,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 549,
      "end_line": 550,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.transpose()",
      "begin_line": 553,
      "end_line": 569,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 44)",
        "(line 556,col 9)-(line 556,col 47)",
        "(line 557,col 9)-(line 557,col 58)",
        "(line 558,col 9)-(line 566,col 11)",
        "(line 568,col 9)-(line 568,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-9dc06f45-03c9-451d-a0e4-ea4b04cae3c7.visit(int, int, double)",
      "begin_line": 561,
      "end_line": 564,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 563,col 17)-(line 563,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.inverse()",
      "begin_line": 572,
      "end_line": 579,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 575,col 9)-(line 577,col 9)",
        "(line 578,col 9)-(line 578,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getDeterminant()",
      "begin_line": 582,
      "end_line": 586,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.isSquare()",
      "begin_line": 589,
      "end_line": 591,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 590,col 9)-(line 590,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.isSingular()",
      "begin_line": 594,
      "end_line": 600,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 596,col 9)-(line 598,col 8)",
        "(line 599,col 9)-(line 599,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowDimension()",
      "begin_line": 603,
      "end_line": 603,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnDimension()",
      "begin_line": 606,
      "end_line": 606,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getTrace()",
      "begin_line": 609,
      "end_line": 621,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 44)",
        "(line 612,col 9)-(line 612,col 47)",
        "(line 613,col 9)-(line 615,col 8)",
        "(line 616,col 9)-(line 616,col 25)",
        "(line 617,col 9)-(line 619,col 9)",
        "(line 620,col 9)-(line 620,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.operate(double[])",
      "begin_line": 624,
      "end_line": 643,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 627,col 9)-(line 627,col 44)",
        "(line 628,col 9)-(line 628,col 47)",
        "(line 629,col 9)-(line 631,col 9)",
        "(line 633,col 9)-(line 633,col 47)",
        "(line 634,col 9)-(line 640,col 9)",
        "(line 642,col 9)-(line 642,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.operate(org.apache.commons.math.linear.RealVector)",
      "begin_line": 646,
      "end_line": 668,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 648,col 9)-(line 667,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(double[])",
      "begin_line": 671,
      "end_line": 690,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 674,col 9)-(line 674,col 44)",
        "(line 675,col 9)-(line 675,col 47)",
        "(line 676,col 9)-(line 678,col 9)",
        "(line 680,col 9)-(line 680,col 47)",
        "(line 681,col 9)-(line 687,col 9)",
        "(line 689,col 9)-(line 689,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 693,
      "end_line": 716,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 695,col 9)-(line 715,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 719,
      "end_line": 733,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 721,col 9)-(line 721,col 46)",
        "(line 722,col 9)-(line 722,col 49)",
        "(line 723,col 9)-(line 723,col 66)",
        "(line 724,col 9)-(line 730,col 9)",
        "(line 731,col 9)-(line 731,col 18)",
        "(line 732,col 9)-(line 732,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 736,
      "end_line": 747,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 738,col 9)-(line 738,col 46)",
        "(line 739,col 9)-(line 739,col 49)",
        "(line 740,col 9)-(line 740,col 66)",
        "(line 741,col 9)-(line 745,col 9)",
        "(line 746,col 9)-(line 746,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 750,
      "end_line": 766,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 754,col 9)-(line 754,col 88)",
        "(line 755,col 9)-(line 756,col 64)",
        "(line 757,col 9)-(line 763,col 9)",
        "(line 764,col 9)-(line 764,col 18)",
        "(line 765,col 9)-(line 765,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 769,
      "end_line": 782,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 773,col 9)-(line 773,col 88)",
        "(line 774,col 9)-(line 775,col 64)",
        "(line 776,col 9)-(line 780,col 9)",
        "(line 781,col 9)-(line 781,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 785,
      "end_line": 799,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 787,col 9)-(line 787,col 46)",
        "(line 788,col 9)-(line 788,col 49)",
        "(line 789,col 9)-(line 789,col 66)",
        "(line 790,col 9)-(line 796,col 9)",
        "(line 797,col 9)-(line 797,col 18)",
        "(line 798,col 9)-(line 798,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 802,
      "end_line": 813,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 804,col 9)-(line 804,col 46)",
        "(line 805,col 9)-(line 805,col 49)",
        "(line 806,col 9)-(line 806,col 66)",
        "(line 807,col 9)-(line 811,col 9)",
        "(line 812,col 9)-(line 812,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 816,
      "end_line": 832,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 820,col 9)-(line 820,col 88)",
        "(line 821,col 9)-(line 822,col 64)",
        "(line 823,col 9)-(line 829,col 9)",
        "(line 830,col 9)-(line 830,col 18)",
        "(line 831,col 9)-(line 831,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 835,
      "end_line": 848,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 839,col 9)-(line 839,col 88)",
        "(line 840,col 9)-(line 841,col 64)",
        "(line 842,col 9)-(line 846,col 9)",
        "(line 847,col 9)-(line 847,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 851,
      "end_line": 854,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 853,col 9)-(line 853,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 857,
      "end_line": 860,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 859,col 9)-(line 859,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 863,
      "end_line": 868,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 867,col 9)-(line 867,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 871,
      "end_line": 876,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 875,col 9)-(line 875,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.solve(double[])",
      "begin_line": 879,
      "end_line": 886,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 882,col 9)-(line 884,col 9)",
        "(line 885,col 9)-(line 885,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 889,
      "end_line": 896,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 892,col 9)-(line 894,col 9)",
        "(line 895,col 9)-(line 895,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.luDecompose()",
      "begin_line": 917,
      "end_line": 923,
      "comment": "\n     * Computes a new\n     * \u003ca href\u003d\"http://www.math.gatech.edu/~bourbaki/math2601/Web-notes/2num.pdf\"\u003e\n     * LU decomposition\u003c/a\u003e for this matrix, storing the result for use by other methods.\n     * \u003cp\u003e\n     * \u003cstrong\u003eImplementation Note\u003c/strong\u003e:\u003cbr\u003e\n     * Uses \u003ca href\u003d\"http://www.damtp.cam.ac.uk/user/fdl/people/sd/lectures/nummeth98/linear.htm\"\u003e\n     * Crout\u0027s algorithm\u003c/a\u003e, with partial pivoting.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note\u003c/strong\u003e:\u003cbr\u003e\n     * This method should rarely be invoked directly. Its only use is\n     * to force recomputation of the LU decomposition when changes have been\n     * made to the underlying data using direct array references. Changes\n     * made using setXxx methods will trigger recomputation when needed\n     * automatically.\u003c/p\u003e\n     *\n     * @throws InvalidMatrixException if the matrix is non-square or singular.\n     * @deprecated as of release 2.0, replaced by {@link LUDecomposition}\n     ",
      "child_ranges": [
        "(line 920,col 9)-(line 922,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.toString()",
      "begin_line": 929,
      "end_line": 954,
      "comment": "\n     * Get a string representation for this matrix.\n     * @return a string representation for this matrix\n     ",
      "child_ranges": [
        "(line 931,col 9)-(line 931,col 44)",
        "(line 932,col 9)-(line 932,col 47)",
        "(line 933,col 9)-(line 933,col 52)",
        "(line 934,col 9)-(line 934,col 52)",
        "(line 935,col 9)-(line 935,col 92)",
        "(line 936,col 9)-(line 936,col 47)",
        "(line 938,col 9)-(line 950,col 9)",
        "(line 952,col 9)-(line 952,col 24)",
        "(line 953,col 9)-(line 953,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.equals(java.lang.Object)",
      "begin_line": 964,
      "end_line": 986,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eRealMatrix\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.\n     *\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 966,col 9)-(line 968,col 9)",
        "(line 969,col 9)-(line 971,col 9)",
        "(line 972,col 9)-(line 972,col 43)",
        "(line 973,col 9)-(line 973,col 44)",
        "(line 974,col 9)-(line 974,col 47)",
        "(line 975,col 9)-(line 977,col 9)",
        "(line 978,col 9)-(line 984,col 9)",
        "(line 985,col 9)-(line 985,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.hashCode()",
      "begin_line": 993,
      "end_line": 1007,
      "comment": "\n     * Computes a hashcode for the matrix.\n     *\n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 995,col 9)-(line 995,col 20)",
        "(line 996,col 9)-(line 996,col 44)",
        "(line 997,col 9)-(line 997,col 47)",
        "(line 998,col 9)-(line 998,col 31)",
        "(line 999,col 9)-(line 999,col 31)",
        "(line 1000,col 9)-(line 1005,col 9)",
        "(line 1006,col 9)-(line 1006,col 19)"
      ]
    }
  ]
}