{
  "filepath": "/tmp/Math-8b/src/main/java/org/apache/commons/math3/linear/AbstractRealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractRealMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.RealLinearOperator",
        "org.apache.commons.math3.linear.RealMatrix"
      ],
      "begin_line": 42,
      "end_line": 981,
      "comment": "\n * Basic implementation of RealMatrix methods regardless of the underlying storage.\n * \u003cp\u003eAll the methods implemented here use {@link #getEntry(int, int)} to access\n * matrix elements. Derived class can provide faster implementations.\u003c/p\u003e\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FORMAT"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Default format. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.AbstractRealMatrix()",
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Creates a matrix with no data\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.AbstractRealMatrix(int, int)",
      "begin_line": 65,
      "end_line": 74,
      "comment": "\n     * Create a new RealMatrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension  the number of rows in the new matrix\n     * @param columnDimension  the number of columns in the new matrix\n     * @throws NotStrictlyPositiveException if row or column dimension is not positive\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 73,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.add(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 77,
      "end_line": 91,
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
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.subtract(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 94,
      "end_line": 108,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 56)",
        "(line 98,col 9)-(line 98,col 50)",
        "(line 99,col 9)-(line 99,col 53)",
        "(line 100,col 9)-(line 100,col 67)",
        "(line 101,col 9)-(line 105,col 9)",
        "(line 107,col 9)-(line 107,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.scalarAdd(double)",
      "begin_line": 111,
      "end_line": 122,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 50)",
        "(line 113,col 9)-(line 113,col 53)",
        "(line 114,col 9)-(line 114,col 67)",
        "(line 115,col 9)-(line 119,col 9)",
        "(line 121,col 9)-(line 121,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.scalarMultiply(double)",
      "begin_line": 125,
      "end_line": 136,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 50)",
        "(line 127,col 9)-(line 127,col 53)",
        "(line 128,col 9)-(line 128,col 67)",
        "(line 129,col 9)-(line 133,col 9)",
        "(line 135,col 9)-(line 135,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.multiply(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 139,
      "end_line": 158,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 59)",
        "(line 143,col 9)-(line 143,col 44)",
        "(line 144,col 9)-(line 144,col 49)",
        "(line 145,col 9)-(line 145,col 47)",
        "(line 146,col 9)-(line 146,col 58)",
        "(line 147,col 9)-(line 155,col 9)",
        "(line 157,col 9)-(line 157,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.preMultiply(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 161,
      "end_line": 164,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.power(int)",
      "begin_line": 167,
      "end_line": 224,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 169,col 9)-(line 171,col 9)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 177,col 9)-(line 179,col 9)",
        "(line 181,col 9)-(line 183,col 9)",
        "(line 185,col 9)-(line 185,col 32)",
        "(line 194,col 9)-(line 194,col 88)",
        "(line 195,col 9)-(line 195,col 77)",
        "(line 196,col 9)-(line 196,col 22)",
        "(line 198,col 9)-(line 208,col 9)",
        "(line 210,col 9)-(line 210,col 56)",
        "(line 211,col 9)-(line 211,col 33)",
        "(line 213,col 9)-(line 215,col 9)",
        "(line 217,col 9)-(line 217,col 40)",
        "(line 219,col 9)-(line 221,col 9)",
        "(line 223,col 9)-(line 223,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getData()",
      "begin_line": 227,
      "end_line": 238,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 84)",
        "(line 230,col 9)-(line 235,col 9)",
        "(line 237,col 9)-(line 237,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getNorm()",
      "begin_line": 241,
      "end_line": 276,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 242,col 9)-(line 275,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "endRow"
      ],
      "begin_line": 245,
      "end_line": 245,
      "comment": " Last row index. "
    },
    {
      "type": "field",
      "varNames": [
        "columnSum"
      ],
      "begin_line": 248,
      "end_line": 248,
      "comment": " Sum of absolute values on one column. "
    },
    {
      "type": "field",
      "varNames": [
        "maxColSum"
      ],
      "begin_line": 251,
      "end_line": 251,
      "comment": " Maximal sum across all columns. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-6a10b3cc-09ef-486d-a308-f1d11f490e93.start(int, int, int, int, int, int)",
      "begin_line": 254,
      "end_line": 260,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 257,col 17)-(line 257,col 37)",
        "(line 258,col 17)-(line 258,col 32)",
        "(line 259,col 17)-(line 259,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-f571870e-7760-4fc9-b12a-06ec3598c38b.visit(int, int, double)",
      "begin_line": 263,
      "end_line": 269,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 264,col 17)-(line 264,col 49)",
        "(line 265,col 17)-(line 268,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-d22692c8-5e60-46c2-b9bc-f047ed200a4e.end()",
      "begin_line": 272,
      "end_line": 274,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 273,col 17)-(line 273,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getFrobeniusNorm()",
      "begin_line": 279,
      "end_line": 302,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 280,col 9)-(line 301,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 283,
      "end_line": 283,
      "comment": " Sum of squared entries. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-1f97fa25-b8d0-441b-9883-6b4d70629774.start(int, int, int, int, int, int)",
      "begin_line": 286,
      "end_line": 290,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 289,col 17)-(line 289,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-69e71a1a-01d8-47e3-aa7e-9ca3ac041a97.visit(int, int, double)",
      "begin_line": 293,
      "end_line": 295,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 294,col 17)-(line 294,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-6d116ef4-fbf5-46e4-8547-154d43d997fa.end()",
      "begin_line": 298,
      "end_line": 300,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 299,col 17)-(line 299,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 305,
      "end_line": 319,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 88)",
        "(line 310,col 9)-(line 311,col 77)",
        "(line 312,col 9)-(line 316,col 9)",
        "(line 318,col 9)-(line 318,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getSubMatrix(int[], int[])",
      "begin_line": 322,
      "end_line": 340,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 77)",
        "(line 327,col 9)-(line 328,col 70)",
        "(line 329,col 9)-(line 337,col 11)",
        "(line 339,col 9)-(line 339,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-9ddad0c2-3aa9-4f2b-9843-b8b4d6c0e95b.visit(int, int, double)",
      "begin_line": 332,
      "end_line": 335,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 334,col 17)-(line 334,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.copySubMatrix(int, int, int, int, double[][])",
      "begin_line": 343,
      "end_line": 380,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 88)",
        "(line 349,col 9)-(line 349,col 55)",
        "(line 350,col 9)-(line 350,col 61)",
        "(line 351,col 9)-(line 354,col 9)",
        "(line 356,col 9)-(line 379,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "startRow"
      ],
      "begin_line": 359,
      "end_line": 359,
      "comment": " Initial row index. "
    },
    {
      "type": "field",
      "varNames": [
        "startColumn"
      ],
      "begin_line": 362,
      "end_line": 362,
      "comment": " Initial column index. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-22c16d01-42a3-4b7d-8439-b729416df2e2.start(int, int, int, int, int, int)",
      "begin_line": 365,
      "end_line": 371,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 369,col 17)-(line 369,col 44)",
        "(line 370,col 17)-(line 370,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-4869f8d0-6ab8-4c3a-8b2e-754a362802fb.visit(int, int, double)",
      "begin_line": 374,
      "end_line": 377,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 376,col 17)-(line 376,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.copySubMatrix(int[], int[], double[][])",
      "begin_line": 383,
      "end_line": 400,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 77)",
        "(line 388,col 9)-(line 392,col 9)",
        "(line 394,col 9)-(line 399,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 403,
      "end_line": 433,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 42)",
        "(line 407,col 9)-(line 407,col 43)",
        "(line 408,col 9)-(line 410,col 9)",
        "(line 412,col 9)-(line 412,col 46)",
        "(line 413,col 9)-(line 415,col 9)",
        "(line 417,col 9)-(line 421,col 9)",
        "(line 423,col 9)-(line 423,col 45)",
        "(line 424,col 9)-(line 424,col 51)",
        "(line 425,col 9)-(line 425,col 57)",
        "(line 426,col 9)-(line 426,col 63)",
        "(line 428,col 9)-(line 432,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getRowMatrix(int)",
      "begin_line": 436,
      "end_line": 445,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 45)",
        "(line 438,col 9)-(line 438,col 47)",
        "(line 439,col 9)-(line 439,col 54)",
        "(line 440,col 9)-(line 442,col 9)",
        "(line 444,col 9)-(line 444,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setRowMatrix(int, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 448,
      "end_line": 461,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 45)",
        "(line 451,col 9)-(line 451,col 47)",
        "(line 452,col 9)-(line 457,col 9)",
        "(line 458,col 9)-(line 460,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getColumnMatrix(int)",
      "begin_line": 464,
      "end_line": 474,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 51)",
        "(line 467,col 9)-(line 467,col 44)",
        "(line 468,col 9)-(line 468,col 54)",
        "(line 469,col 9)-(line 471,col 9)",
        "(line 473,col 9)-(line 473,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setColumnMatrix(int, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 477,
      "end_line": 490,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 479,col 9)-(line 479,col 51)",
        "(line 480,col 9)-(line 480,col 44)",
        "(line 481,col 9)-(line 486,col 9)",
        "(line 487,col 9)-(line 489,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getRowVector(int)",
      "begin_line": 493,
      "end_line": 496,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setRowVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 499,
      "end_line": 510,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 45)",
        "(line 502,col 9)-(line 502,col 47)",
        "(line 503,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 509,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getColumnVector(int)",
      "begin_line": 513,
      "end_line": 516,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setColumnVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 519,
      "end_line": 530,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 51)",
        "(line 522,col 9)-(line 522,col 44)",
        "(line 523,col 9)-(line 526,col 9)",
        "(line 527,col 9)-(line 529,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getRow(int)",
      "begin_line": 533,
      "end_line": 542,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 45)",
        "(line 535,col 9)-(line 535,col 47)",
        "(line 536,col 9)-(line 536,col 47)",
        "(line 537,col 9)-(line 539,col 9)",
        "(line 541,col 9)-(line 541,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setRow(int, double[])",
      "begin_line": 545,
      "end_line": 555,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 45)",
        "(line 548,col 9)-(line 548,col 47)",
        "(line 549,col 9)-(line 551,col 9)",
        "(line 552,col 9)-(line 554,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getColumn(int)",
      "begin_line": 558,
      "end_line": 567,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 51)",
        "(line 560,col 9)-(line 560,col 44)",
        "(line 561,col 9)-(line 561,col 47)",
        "(line 562,col 9)-(line 564,col 9)",
        "(line 566,col 9)-(line 566,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setColumn(int, double[])",
      "begin_line": 570,
      "end_line": 580,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 51)",
        "(line 573,col 9)-(line 573,col 44)",
        "(line 574,col 9)-(line 576,col 9)",
        "(line 577,col 9)-(line 579,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.addToEntry(int, int, double)",
      "begin_line": 583,
      "end_line": 587,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 56)",
        "(line 586,col 9)-(line 586,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 590,
      "end_line": 594,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 56)",
        "(line 593,col 9)-(line 593,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.transpose()",
      "begin_line": 597,
      "end_line": 612,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 44)",
        "(line 599,col 9)-(line 599,col 47)",
        "(line 600,col 9)-(line 600,col 58)",
        "(line 601,col 9)-(line 609,col 11)",
        "(line 611,col 9)-(line 611,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-5b69f6de-43fb-4609-b195-6020757cb6b2.visit(int, int, double)",
      "begin_line": 604,
      "end_line": 607,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 606,col 17)-(line 606,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.isSquare()",
      "begin_line": 615,
      "end_line": 617,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 616,col 9)-(line 616,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getRowDimension()",
      "begin_line": 624,
      "end_line": 625,
      "comment": "\n     * Returns the number of rows of this matrix.\n     *\n     * @return the number of rows.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getColumnDimension()",
      "begin_line": 632,
      "end_line": 633,
      "comment": "\n     * Returns the number of columns of this matrix.\n     *\n     * @return the number of columns.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getTrace()",
      "begin_line": 636,
      "end_line": 647,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 637,col 9)-(line 637,col 44)",
        "(line 638,col 9)-(line 638,col 47)",
        "(line 639,col 9)-(line 641,col 8)",
        "(line 642,col 9)-(line 642,col 25)",
        "(line 643,col 9)-(line 645,col 9)",
        "(line 646,col 9)-(line 646,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.operate(double[])",
      "begin_line": 650,
      "end_line": 668,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 44)",
        "(line 653,col 9)-(line 653,col 47)",
        "(line 654,col 9)-(line 656,col 9)",
        "(line 658,col 9)-(line 658,col 47)",
        "(line 659,col 9)-(line 665,col 9)",
        "(line 667,col 9)-(line 667,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.operate(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 671,
      "end_line": 694,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 674,col 9)-(line 693,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.preMultiply(double[])",
      "begin_line": 697,
      "end_line": 715,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 699,col 9)-(line 699,col 44)",
        "(line 700,col 9)-(line 700,col 47)",
        "(line 701,col 9)-(line 703,col 9)",
        "(line 705,col 9)-(line 705,col 47)",
        "(line 706,col 9)-(line 712,col 9)",
        "(line 714,col 9)-(line 714,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.preMultiply(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 718,
      "end_line": 740,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 719,col 9)-(line 739,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor)",
      "begin_line": 743,
      "end_line": 755,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 744,col 9)-(line 744,col 46)",
        "(line 745,col 9)-(line 745,col 49)",
        "(line 746,col 9)-(line 746,col 66)",
        "(line 747,col 9)-(line 753,col 9)",
        "(line 754,col 9)-(line 754,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor)",
      "begin_line": 758,
      "end_line": 768,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 759,col 9)-(line 759,col 46)",
        "(line 760,col 9)-(line 760,col 49)",
        "(line 761,col 9)-(line 761,col 66)",
        "(line 762,col 9)-(line 766,col 9)",
        "(line 767,col 9)-(line 767,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 771,
      "end_line": 786,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 88)",
        "(line 776,col 9)-(line 777,col 64)",
        "(line 778,col 9)-(line 784,col 9)",
        "(line 785,col 9)-(line 785,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 789,
      "end_line": 802,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 793,col 9)-(line 793,col 88)",
        "(line 794,col 9)-(line 795,col 64)",
        "(line 796,col 9)-(line 800,col 9)",
        "(line 801,col 9)-(line 801,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor)",
      "begin_line": 805,
      "end_line": 817,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 806,col 9)-(line 806,col 46)",
        "(line 807,col 9)-(line 807,col 49)",
        "(line 808,col 9)-(line 808,col 66)",
        "(line 809,col 9)-(line 815,col 9)",
        "(line 816,col 9)-(line 816,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor)",
      "begin_line": 820,
      "end_line": 830,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 821,col 9)-(line 821,col 46)",
        "(line 822,col 9)-(line 822,col 49)",
        "(line 823,col 9)-(line 823,col 66)",
        "(line 824,col 9)-(line 828,col 9)",
        "(line 829,col 9)-(line 829,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 833,
      "end_line": 848,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 837,col 9)-(line 837,col 88)",
        "(line 838,col 9)-(line 839,col 64)",
        "(line 840,col 9)-(line 846,col 9)",
        "(line 847,col 9)-(line 847,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 851,
      "end_line": 864,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 855,col 9)-(line 855,col 88)",
        "(line 856,col 9)-(line 857,col 64)",
        "(line 858,col 9)-(line 862,col 9)",
        "(line 863,col 9)-(line 863,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor)",
      "begin_line": 867,
      "end_line": 869,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 868,col 9)-(line 868,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor)",
      "begin_line": 872,
      "end_line": 874,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 873,col 9)-(line 873,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 877,
      "end_line": 883,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 882,col 9)-(line 882,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 886,
      "end_line": 892,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 891,col 9)-(line 891,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.toString()",
      "begin_line": 898,
      "end_line": 906,
      "comment": "\n     * Get a string representation for this matrix.\n     * @return a string representation for this matrix\n     ",
      "child_ranges": [
        "(line 900,col 9)-(line 900,col 54)",
        "(line 901,col 9)-(line 901,col 52)",
        "(line 902,col 9)-(line 902,col 92)",
        "(line 903,col 9)-(line 903,col 35)",
        "(line 904,col 9)-(line 904,col 48)",
        "(line 905,col 9)-(line 905,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.equals(java.lang.Object)",
      "begin_line": 916,
      "end_line": 938,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eRealMatrix\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.\n     *\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 918,col 9)-(line 920,col 9)",
        "(line 921,col 9)-(line 923,col 9)",
        "(line 924,col 9)-(line 924,col 43)",
        "(line 925,col 9)-(line 925,col 44)",
        "(line 926,col 9)-(line 926,col 47)",
        "(line 927,col 9)-(line 929,col 9)",
        "(line 930,col 9)-(line 936,col 9)",
        "(line 937,col 9)-(line 937,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.hashCode()",
      "begin_line": 945,
      "end_line": 959,
      "comment": "\n     * Computes a hashcode for the matrix.\n     *\n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 947,col 9)-(line 947,col 20)",
        "(line 948,col 9)-(line 948,col 44)",
        "(line 949,col 9)-(line 949,col 47)",
        "(line 950,col 9)-(line 950,col 31)",
        "(line 951,col 9)-(line 951,col 31)",
        "(line 952,col 9)-(line 957,col 9)",
        "(line 958,col 9)-(line 958,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.createMatrix(int, int)",
      "begin_line": 968,
      "end_line": 969,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.copy()",
      "begin_line": 972,
      "end_line": 972,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getEntry(int, int)",
      "begin_line": 975,
      "end_line": 976,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setEntry(int, int, double)",
      "begin_line": 979,
      "end_line": 980,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    }
  ]
}