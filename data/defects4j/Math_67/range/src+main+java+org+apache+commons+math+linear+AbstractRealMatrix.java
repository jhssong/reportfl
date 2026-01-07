{
  "filepath": "/tmp/Math-67b/src/main/java/org/apache/commons/math/linear/AbstractRealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractRealMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealMatrix"
      ],
      "begin_line": 32,
      "end_line": 1069,
      "comment": "\n * Basic implementation of RealMatrix methods regardless of the underlying storage.\n * \u003cp\u003eAll the methods implemented here use {@link #getEntry(int, int)} to access\n * matrix elements. Derived class can provide faster implementations. \u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "lu"
      ],
      "begin_line": 38,
      "end_line": 39,
      "comment": " Cached LU solver.\n     * @deprecated as of release 2.0, since all methods using this are deprecated\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.AbstractRealMatrix()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Creates a matrix with no data\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.AbstractRealMatrix(int, int)",
      "begin_line": 55,
      "end_line": 66,
      "comment": "\n     * Create a new RealMatrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension  the number of rows in the new matrix\n     * @param columnDimension  the number of columns in the new matrix\n     * @throws IllegalArgumentException if row or column dimension is not positive\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 60,col 9)",
        "(line 61,col 9)-(line 64,col 9)",
        "(line 65,col 9)-(line 65,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.createMatrix(int, int)",
      "begin_line": 69,
      "end_line": 70,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copy()",
      "begin_line": 73,
      "end_line": 73,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.add(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 76,
      "end_line": 92,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 53)",
        "(line 81,col 9)-(line 81,col 50)",
        "(line 82,col 9)-(line 82,col 53)",
        "(line 83,col 9)-(line 83,col 67)",
        "(line 84,col 9)-(line 88,col 9)",
        "(line 90,col 9)-(line 90,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 95,
      "end_line": 111,
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
      "begin_line": 114,
      "end_line": 127,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 50)",
        "(line 117,col 9)-(line 117,col 53)",
        "(line 118,col 9)-(line 118,col 67)",
        "(line 119,col 9)-(line 123,col 9)",
        "(line 125,col 9)-(line 125,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.scalarMultiply(double)",
      "begin_line": 130,
      "end_line": 143,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 50)",
        "(line 133,col 9)-(line 133,col 53)",
        "(line 134,col 9)-(line 134,col 67)",
        "(line 135,col 9)-(line 139,col 9)",
        "(line 141,col 9)-(line 141,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 146,
      "end_line": 168,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 59)",
        "(line 152,col 9)-(line 152,col 44)",
        "(line 153,col 9)-(line 153,col 49)",
        "(line 154,col 9)-(line 154,col 47)",
        "(line 155,col 9)-(line 155,col 58)",
        "(line 156,col 9)-(line 164,col 9)",
        "(line 166,col 9)-(line 166,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 171,
      "end_line": 174,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getData()",
      "begin_line": 177,
      "end_line": 190,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 84)",
        "(line 181,col 9)-(line 186,col 9)",
        "(line 188,col 9)-(line 188,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getNorm()",
      "begin_line": 193,
      "end_line": 229,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 194,col 9)-(line 228,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "endRow"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": " Last row index. "
    },
    {
      "type": "field",
      "varNames": [
        "columnSum"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": " Sum of absolute values on one column. "
    },
    {
      "type": "field",
      "varNames": [
        "maxColSum"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": " Maximal sum across all columns. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-8ac85152-6f3a-4f8d-9130-fe5bffb2eeb9.start(int, int, int, int, int, int)",
      "begin_line": 206,
      "end_line": 212,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 209,col 17)-(line 209,col 37)",
        "(line 210,col 17)-(line 210,col 32)",
        "(line 211,col 17)-(line 211,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-aaa807f1-31df-4856-8f7b-afe0e541995d.visit(int, int, double)",
      "begin_line": 215,
      "end_line": 221,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 216,col 17)-(line 216,col 45)",
        "(line 217,col 17)-(line 220,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-c6156c88-6e6a-4804-b2ea-4875ca4d5cc2.end()",
      "begin_line": 224,
      "end_line": 226,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 225,col 17)-(line 225,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getFrobeniusNorm()",
      "begin_line": 232,
      "end_line": 256,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 233,col 9)-(line 255,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 236,
      "end_line": 236,
      "comment": " Sum of squared entries. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-8cf56e53-b437-4e5c-8e09-bc7a15541bf6.start(int, int, int, int, int, int)",
      "begin_line": 239,
      "end_line": 243,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 242,col 17)-(line 242,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-90d9e275-86e5-462d-b172-d07b258dc923.visit(int, int, double)",
      "begin_line": 246,
      "end_line": 248,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 247,col 17)-(line 247,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-867ca037-bc2d-4a02-b2bc-377aa8d2d137.end()",
      "begin_line": 251,
      "end_line": 253,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 252,col 17)-(line 252,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 259,
      "end_line": 275,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 88)",
        "(line 265,col 9)-(line 266,col 77)",
        "(line 267,col 9)-(line 271,col 9)",
        "(line 273,col 9)-(line 273,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getSubMatrix(int[], int[])",
      "begin_line": 278,
      "end_line": 299,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 77)",
        "(line 285,col 9)-(line 286,col 70)",
        "(line 287,col 9)-(line 295,col 11)",
        "(line 297,col 9)-(line 297,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-e86f864a-4e22-4ced-8ed6-abd9ce1fed9b.visit(int, int, double)",
      "begin_line": 290,
      "end_line": 293,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 292,col 17)-(line 292,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copySubMatrix(int, int, int, int, double[][])",
      "begin_line": 302,
      "end_line": 344,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 88)",
        "(line 309,col 9)-(line 309,col 55)",
        "(line 310,col 9)-(line 310,col 61)",
        "(line 311,col 9)-(line 316,col 9)",
        "(line 319,col 9)-(line 342,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "startRow"
      ],
      "begin_line": 322,
      "end_line": 322,
      "comment": " Initial row index. "
    },
    {
      "type": "field",
      "varNames": [
        "startColumn"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": " Initial column index. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-8735d1a5-429e-48da-a17e-e769b93b0a4d.start(int, int, int, int, int, int)",
      "begin_line": 328,
      "end_line": 334,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 332,col 17)-(line 332,col 44)",
        "(line 333,col 17)-(line 333,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-c0f09fc5-b027-461f-bfa9-2190fec4258e.visit(int, int, double)",
      "begin_line": 337,
      "end_line": 340,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 339,col 17)-(line 339,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copySubMatrix(int[], int[], double[][])",
      "begin_line": 347,
      "end_line": 368,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 77)",
        "(line 352,col 9)-(line 358,col 9)",
        "(line 361,col 9)-(line 366,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 371,
      "end_line": 405,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 43)",
        "(line 375,col 9)-(line 377,col 9)",
        "(line 379,col 9)-(line 379,col 46)",
        "(line 380,col 9)-(line 382,col 9)",
        "(line 384,col 9)-(line 390,col 9)",
        "(line 392,col 9)-(line 392,col 45)",
        "(line 393,col 9)-(line 393,col 51)",
        "(line 394,col 9)-(line 394,col 57)",
        "(line 395,col 9)-(line 395,col 63)",
        "(line 397,col 9)-(line 401,col 9)",
        "(line 403,col 9)-(line 403,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowMatrix(int)",
      "begin_line": 408,
      "end_line": 420,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 45)",
        "(line 412,col 9)-(line 412,col 47)",
        "(line 413,col 9)-(line 413,col 54)",
        "(line 414,col 9)-(line 416,col 9)",
        "(line 418,col 9)-(line 418,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRowMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 423,
      "end_line": 438,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 45)",
        "(line 427,col 9)-(line 427,col 47)",
        "(line 428,col 9)-(line 433,col 9)",
        "(line 434,col 9)-(line 436,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnMatrix(int)",
      "begin_line": 441,
      "end_line": 453,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 51)",
        "(line 445,col 9)-(line 445,col 44)",
        "(line 446,col 9)-(line 446,col 54)",
        "(line 447,col 9)-(line 449,col 9)",
        "(line 451,col 9)-(line 451,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 456,
      "end_line": 471,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 51)",
        "(line 460,col 9)-(line 460,col 44)",
        "(line 461,col 9)-(line 466,col 9)",
        "(line 467,col 9)-(line 469,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowVector(int)",
      "begin_line": 474,
      "end_line": 477,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRowVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 480,
      "end_line": 494,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 45)",
        "(line 484,col 9)-(line 484,col 47)",
        "(line 485,col 9)-(line 489,col 9)",
        "(line 490,col 9)-(line 492,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnVector(int)",
      "begin_line": 497,
      "end_line": 500,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumnVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 503,
      "end_line": 517,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 51)",
        "(line 507,col 9)-(line 507,col 44)",
        "(line 508,col 9)-(line 512,col 9)",
        "(line 513,col 9)-(line 515,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRow(int)",
      "begin_line": 520,
      "end_line": 532,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 523,col 9)-(line 523,col 45)",
        "(line 524,col 9)-(line 524,col 47)",
        "(line 525,col 9)-(line 525,col 47)",
        "(line 526,col 9)-(line 528,col 9)",
        "(line 530,col 9)-(line 530,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRow(int, double[])",
      "begin_line": 535,
      "end_line": 549,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 45)",
        "(line 539,col 9)-(line 539,col 47)",
        "(line 540,col 9)-(line 544,col 9)",
        "(line 545,col 9)-(line 547,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumn(int)",
      "begin_line": 552,
      "end_line": 564,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 51)",
        "(line 556,col 9)-(line 556,col 44)",
        "(line 557,col 9)-(line 557,col 47)",
        "(line 558,col 9)-(line 560,col 9)",
        "(line 562,col 9)-(line 562,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumn(int, double[])",
      "begin_line": 567,
      "end_line": 581,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 51)",
        "(line 571,col 9)-(line 571,col 44)",
        "(line 572,col 9)-(line 576,col 9)",
        "(line 577,col 9)-(line 579,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getEntry(int, int)",
      "begin_line": 584,
      "end_line": 585,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setEntry(int, int, double)",
      "begin_line": 588,
      "end_line": 589,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.addToEntry(int, int, double)",
      "begin_line": 592,
      "end_line": 593,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 596,
      "end_line": 597,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.transpose()",
      "begin_line": 600,
      "end_line": 617,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 44)",
        "(line 603,col 9)-(line 603,col 47)",
        "(line 604,col 9)-(line 604,col 58)",
        "(line 605,col 9)-(line 613,col 11)",
        "(line 615,col 9)-(line 615,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-7b4f9e06-57fc-4f18-9192-1f77ecf4c65b.visit(int, int, double)",
      "begin_line": 608,
      "end_line": 611,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 610,col 17)-(line 610,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.inverse()",
      "begin_line": 620,
      "end_line": 627,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 623,col 9)-(line 625,col 9)",
        "(line 626,col 9)-(line 626,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getDeterminant()",
      "begin_line": 630,
      "end_line": 634,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 633,col 9)-(line 633,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.isSquare()",
      "begin_line": 637,
      "end_line": 639,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 638,col 9)-(line 638,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.isSingular()",
      "begin_line": 642,
      "end_line": 648,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 644,col 9)-(line 646,col 8)",
        "(line 647,col 9)-(line 647,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowDimension()",
      "begin_line": 651,
      "end_line": 651,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnDimension()",
      "begin_line": 654,
      "end_line": 654,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getTrace()",
      "begin_line": 657,
      "end_line": 669,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 659,col 9)-(line 659,col 44)",
        "(line 660,col 9)-(line 660,col 47)",
        "(line 661,col 9)-(line 663,col 8)",
        "(line 664,col 9)-(line 664,col 25)",
        "(line 665,col 9)-(line 667,col 9)",
        "(line 668,col 9)-(line 668,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.operate(double[])",
      "begin_line": 672,
      "end_line": 694,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 44)",
        "(line 676,col 9)-(line 676,col 47)",
        "(line 677,col 9)-(line 681,col 9)",
        "(line 683,col 9)-(line 683,col 47)",
        "(line 684,col 9)-(line 690,col 9)",
        "(line 692,col 9)-(line 692,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.operate(org.apache.commons.math.linear.RealVector)",
      "begin_line": 697,
      "end_line": 721,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 699,col 9)-(line 720,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(double[])",
      "begin_line": 724,
      "end_line": 746,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 727,col 9)-(line 727,col 44)",
        "(line 728,col 9)-(line 728,col 47)",
        "(line 729,col 9)-(line 733,col 9)",
        "(line 735,col 9)-(line 735,col 47)",
        "(line 736,col 9)-(line 742,col 9)",
        "(line 744,col 9)-(line 744,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 749,
      "end_line": 775,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 751,col 9)-(line 774,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 778,
      "end_line": 792,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 780,col 9)-(line 780,col 46)",
        "(line 781,col 9)-(line 781,col 49)",
        "(line 782,col 9)-(line 782,col 66)",
        "(line 783,col 9)-(line 789,col 9)",
        "(line 790,col 9)-(line 790,col 18)",
        "(line 791,col 9)-(line 791,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 795,
      "end_line": 806,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 797,col 9)-(line 797,col 46)",
        "(line 798,col 9)-(line 798,col 49)",
        "(line 799,col 9)-(line 799,col 66)",
        "(line 800,col 9)-(line 804,col 9)",
        "(line 805,col 9)-(line 805,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 809,
      "end_line": 825,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 813,col 9)-(line 813,col 88)",
        "(line 814,col 9)-(line 815,col 64)",
        "(line 816,col 9)-(line 822,col 9)",
        "(line 823,col 9)-(line 823,col 18)",
        "(line 824,col 9)-(line 824,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 828,
      "end_line": 841,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 832,col 9)-(line 832,col 88)",
        "(line 833,col 9)-(line 834,col 64)",
        "(line 835,col 9)-(line 839,col 9)",
        "(line 840,col 9)-(line 840,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 844,
      "end_line": 858,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 846,col 9)-(line 846,col 46)",
        "(line 847,col 9)-(line 847,col 49)",
        "(line 848,col 9)-(line 848,col 66)",
        "(line 849,col 9)-(line 855,col 9)",
        "(line 856,col 9)-(line 856,col 18)",
        "(line 857,col 9)-(line 857,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 861,
      "end_line": 872,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 863,col 9)-(line 863,col 46)",
        "(line 864,col 9)-(line 864,col 49)",
        "(line 865,col 9)-(line 865,col 66)",
        "(line 866,col 9)-(line 870,col 9)",
        "(line 871,col 9)-(line 871,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 875,
      "end_line": 891,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 879,col 9)-(line 879,col 88)",
        "(line 880,col 9)-(line 881,col 64)",
        "(line 882,col 9)-(line 888,col 9)",
        "(line 889,col 9)-(line 889,col 18)",
        "(line 890,col 9)-(line 890,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 894,
      "end_line": 907,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 898,col 9)-(line 898,col 88)",
        "(line 899,col 9)-(line 900,col 64)",
        "(line 901,col 9)-(line 905,col 9)",
        "(line 906,col 9)-(line 906,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 910,
      "end_line": 913,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 912,col 9)-(line 912,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 916,
      "end_line": 919,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 918,col 9)-(line 918,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 922,
      "end_line": 927,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 926,col 9)-(line 926,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 930,
      "end_line": 935,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 934,col 9)-(line 934,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.solve(double[])",
      "begin_line": 938,
      "end_line": 945,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 941,col 9)-(line 943,col 9)",
        "(line 944,col 9)-(line 944,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 948,
      "end_line": 955,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 951,col 9)-(line 953,col 9)",
        "(line 954,col 9)-(line 954,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.luDecompose()",
      "begin_line": 976,
      "end_line": 982,
      "comment": "\n     * Computes a new\n     * \u003ca href\u003d\"http://www.math.gatech.edu/~bourbaki/math2601/Web-notes/2num.pdf\"\u003e\n     * LU decomposition\u003c/a\u003e for this matrix, storing the result for use by other methods.\n     * \u003cp\u003e\n     * \u003cstrong\u003eImplementation Note\u003c/strong\u003e:\u003cbr\u003e\n     * Uses \u003ca href\u003d\"http://www.damtp.cam.ac.uk/user/fdl/people/sd/lectures/nummeth98/linear.htm\"\u003e\n     * Crout\u0027s algorithm\u003c/a\u003e, with partial pivoting.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note\u003c/strong\u003e:\u003cbr\u003e\n     * This method should rarely be invoked directly. Its only use is\n     * to force recomputation of the LU decomposition when changes have been\n     * made to the underlying data using direct array references. Changes\n     * made using setXxx methods will trigger recomputation when needed\n     * automatically.\u003c/p\u003e\n     *\n     * @throws InvalidMatrixException if the matrix is non-square or singular.\n     * @deprecated as of release 2.0, replaced by {@link LUDecomposition}\n     ",
      "child_ranges": [
        "(line 979,col 9)-(line 981,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.toString()",
      "begin_line": 988,
      "end_line": 1014,
      "comment": "\n     * Get a string representation for this matrix.\n     * @return a string representation for this matrix\n     ",
      "child_ranges": [
        "(line 990,col 9)-(line 990,col 44)",
        "(line 991,col 9)-(line 991,col 47)",
        "(line 992,col 9)-(line 992,col 52)",
        "(line 993,col 9)-(line 993,col 52)",
        "(line 994,col 9)-(line 994,col 92)",
        "(line 995,col 9)-(line 995,col 47)",
        "(line 997,col 9)-(line 1009,col 9)",
        "(line 1011,col 9)-(line 1011,col 24)",
        "(line 1012,col 9)-(line 1012,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.equals(java.lang.Object)",
      "begin_line": 1024,
      "end_line": 1046,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eRealMatrix\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.\n     *\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 1026,col 9)-(line 1028,col 9)",
        "(line 1029,col 9)-(line 1031,col 9)",
        "(line 1032,col 9)-(line 1032,col 43)",
        "(line 1033,col 9)-(line 1033,col 44)",
        "(line 1034,col 9)-(line 1034,col 47)",
        "(line 1035,col 9)-(line 1037,col 9)",
        "(line 1038,col 9)-(line 1044,col 9)",
        "(line 1045,col 9)-(line 1045,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.hashCode()",
      "begin_line": 1053,
      "end_line": 1067,
      "comment": "\n     * Computes a hashcode for the matrix.\n     *\n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 1055,col 9)-(line 1055,col 20)",
        "(line 1056,col 9)-(line 1056,col 44)",
        "(line 1057,col 9)-(line 1057,col 47)",
        "(line 1058,col 9)-(line 1058,col 31)",
        "(line 1059,col 9)-(line 1059,col 31)",
        "(line 1060,col 9)-(line 1065,col 9)",
        "(line 1066,col 9)-(line 1066,col 19)"
      ]
    }
  ]
}