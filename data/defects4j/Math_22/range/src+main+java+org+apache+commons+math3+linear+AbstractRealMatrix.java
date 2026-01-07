{
  "filepath": "/tmp/Math-22b/src/main/java/org/apache/commons/math3/linear/AbstractRealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractRealMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.RealLinearOperator",
        "org.apache.commons.math3.linear.RealMatrix"
      ],
      "begin_line": 39,
      "end_line": 943,
      "comment": "\n * Basic implementation of RealMatrix methods regardless of the underlying storage.\n * \u003cp\u003eAll the methods implemented here use {@link #getEntry(int, int)} to access\n * matrix elements. Derived class can provide faster implementations.\u003c/p\u003e\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FORMAT"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Default format. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.AbstractRealMatrix()",
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Creates a matrix with no data\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.AbstractRealMatrix(int, int)",
      "begin_line": 62,
      "end_line": 69,
      "comment": "\n     * Create a new RealMatrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension  the number of rows in the new matrix\n     * @param columnDimension  the number of columns in the new matrix\n     * @throws NotStrictlyPositiveException if row or column dimension is not positive\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 68,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.createMatrix(int, int)",
      "begin_line": 72,
      "end_line": 72,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.copy()",
      "begin_line": 75,
      "end_line": 75,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.add(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 78,
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
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.subtract(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 95,
      "end_line": 109,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 56)",
        "(line 99,col 9)-(line 99,col 50)",
        "(line 100,col 9)-(line 100,col 53)",
        "(line 101,col 9)-(line 101,col 67)",
        "(line 102,col 9)-(line 106,col 9)",
        "(line 108,col 9)-(line 108,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.scalarAdd(double)",
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
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.scalarMultiply(double)",
      "begin_line": 126,
      "end_line": 137,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 50)",
        "(line 128,col 9)-(line 128,col 53)",
        "(line 129,col 9)-(line 129,col 67)",
        "(line 130,col 9)-(line 134,col 9)",
        "(line 136,col 9)-(line 136,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.multiply(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 140,
      "end_line": 159,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 59)",
        "(line 144,col 9)-(line 144,col 44)",
        "(line 145,col 9)-(line 145,col 49)",
        "(line 146,col 9)-(line 146,col 47)",
        "(line 147,col 9)-(line 147,col 58)",
        "(line 148,col 9)-(line 156,col 9)",
        "(line 158,col 9)-(line 158,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.preMultiply(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 162,
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
      "end_line": 223,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 168,col 9)-(line 170,col 9)",
        "(line 172,col 9)-(line 174,col 9)",
        "(line 176,col 9)-(line 178,col 9)",
        "(line 180,col 9)-(line 182,col 9)",
        "(line 184,col 9)-(line 184,col 32)",
        "(line 193,col 9)-(line 193,col 88)",
        "(line 194,col 9)-(line 194,col 77)",
        "(line 195,col 9)-(line 195,col 22)",
        "(line 197,col 9)-(line 207,col 9)",
        "(line 209,col 9)-(line 209,col 56)",
        "(line 210,col 9)-(line 210,col 33)",
        "(line 212,col 9)-(line 214,col 9)",
        "(line 216,col 9)-(line 216,col 40)",
        "(line 218,col 9)-(line 220,col 9)",
        "(line 222,col 9)-(line 222,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getData()",
      "begin_line": 226,
      "end_line": 237,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 84)",
        "(line 229,col 9)-(line 234,col 9)",
        "(line 236,col 9)-(line 236,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getNorm()",
      "begin_line": 240,
      "end_line": 275,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 241,col 9)-(line 274,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "endRow"
      ],
      "begin_line": 244,
      "end_line": 244,
      "comment": " Last row index. "
    },
    {
      "type": "field",
      "varNames": [
        "columnSum"
      ],
      "begin_line": 247,
      "end_line": 247,
      "comment": " Sum of absolute values on one column. "
    },
    {
      "type": "field",
      "varNames": [
        "maxColSum"
      ],
      "begin_line": 250,
      "end_line": 250,
      "comment": " Maximal sum across all columns. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-d196b9cb-4c5b-43cb-99d2-7dfe070a71a1.start(int, int, int, int, int, int)",
      "begin_line": 253,
      "end_line": 259,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 256,col 17)-(line 256,col 37)",
        "(line 257,col 17)-(line 257,col 32)",
        "(line 258,col 17)-(line 258,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-d1d9eb7a-c129-4a0e-b2bb-bb9938204f0d.visit(int, int, double)",
      "begin_line": 262,
      "end_line": 268,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 263,col 17)-(line 263,col 49)",
        "(line 264,col 17)-(line 267,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-cb6e22b5-abff-4895-b9bf-4d0b332ce9ea.end()",
      "begin_line": 271,
      "end_line": 273,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 272,col 17)-(line 272,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getFrobeniusNorm()",
      "begin_line": 278,
      "end_line": 301,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 279,col 9)-(line 300,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 282,
      "end_line": 282,
      "comment": " Sum of squared entries. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-d19eb0f0-4977-4279-98a6-9435d7adfc42.start(int, int, int, int, int, int)",
      "begin_line": 285,
      "end_line": 289,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 288,col 17)-(line 288,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-4a1c4459-13db-4698-8bae-42a19a3947e5.visit(int, int, double)",
      "begin_line": 292,
      "end_line": 294,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 293,col 17)-(line 293,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-5cec9a93-5ade-4514-80f4-9b696557ac4c.end()",
      "begin_line": 297,
      "end_line": 299,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 298,col 17)-(line 298,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 304,
      "end_line": 317,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 88)",
        "(line 308,col 9)-(line 309,col 77)",
        "(line 310,col 9)-(line 314,col 9)",
        "(line 316,col 9)-(line 316,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getSubMatrix(int[], int[])",
      "begin_line": 320,
      "end_line": 338,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 77)",
        "(line 325,col 9)-(line 326,col 70)",
        "(line 327,col 9)-(line 335,col 11)",
        "(line 337,col 9)-(line 337,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-78f2548c-0cc4-46fa-b419-30d169afc274.visit(int, int, double)",
      "begin_line": 330,
      "end_line": 333,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 332,col 17)-(line 332,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.copySubMatrix(int, int, int, int, double[][])",
      "begin_line": 341,
      "end_line": 378,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 88)",
        "(line 346,col 9)-(line 346,col 55)",
        "(line 347,col 9)-(line 347,col 61)",
        "(line 348,col 9)-(line 351,col 9)",
        "(line 354,col 9)-(line 377,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "startRow"
      ],
      "begin_line": 357,
      "end_line": 357,
      "comment": " Initial row index. "
    },
    {
      "type": "field",
      "varNames": [
        "startColumn"
      ],
      "begin_line": 360,
      "end_line": 360,
      "comment": " Initial column index. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-419023c5-d09e-4b76-a344-6f3ceb232f78.start(int, int, int, int, int, int)",
      "begin_line": 363,
      "end_line": 369,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 367,col 17)-(line 367,col 44)",
        "(line 368,col 17)-(line 368,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-6a8b6498-8c65-4cc6-b5f2-ff4847e65f44.visit(int, int, double)",
      "begin_line": 372,
      "end_line": 375,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 374,col 17)-(line 374,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.copySubMatrix(int[], int[], double[][])",
      "begin_line": 381,
      "end_line": 397,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 77)",
        "(line 384,col 9)-(line 388,col 9)",
        "(line 391,col 9)-(line 396,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 400,
      "end_line": 429,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 42)",
        "(line 403,col 9)-(line 403,col 43)",
        "(line 404,col 9)-(line 406,col 9)",
        "(line 408,col 9)-(line 408,col 46)",
        "(line 409,col 9)-(line 411,col 9)",
        "(line 413,col 9)-(line 417,col 9)",
        "(line 419,col 9)-(line 419,col 45)",
        "(line 420,col 9)-(line 420,col 51)",
        "(line 421,col 9)-(line 421,col 57)",
        "(line 422,col 9)-(line 422,col 63)",
        "(line 424,col 9)-(line 428,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getRowMatrix(int)",
      "begin_line": 432,
      "end_line": 441,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 45)",
        "(line 434,col 9)-(line 434,col 47)",
        "(line 435,col 9)-(line 435,col 54)",
        "(line 436,col 9)-(line 438,col 9)",
        "(line 440,col 9)-(line 440,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setRowMatrix(int, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 444,
      "end_line": 456,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 45)",
        "(line 446,col 9)-(line 446,col 47)",
        "(line 447,col 9)-(line 452,col 9)",
        "(line 453,col 9)-(line 455,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getColumnMatrix(int)",
      "begin_line": 459,
      "end_line": 468,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 51)",
        "(line 461,col 9)-(line 461,col 44)",
        "(line 462,col 9)-(line 462,col 54)",
        "(line 463,col 9)-(line 465,col 9)",
        "(line 467,col 9)-(line 467,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setColumnMatrix(int, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 471,
      "end_line": 483,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 51)",
        "(line 473,col 9)-(line 473,col 44)",
        "(line 474,col 9)-(line 479,col 9)",
        "(line 480,col 9)-(line 482,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getRowVector(int)",
      "begin_line": 486,
      "end_line": 488,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 487,col 9)-(line 487,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setRowVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 491,
      "end_line": 501,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 45)",
        "(line 493,col 9)-(line 493,col 47)",
        "(line 494,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 500,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getColumnVector(int)",
      "begin_line": 504,
      "end_line": 506,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setColumnVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 509,
      "end_line": 519,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 51)",
        "(line 511,col 9)-(line 511,col 44)",
        "(line 512,col 9)-(line 515,col 9)",
        "(line 516,col 9)-(line 518,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getRow(int)",
      "begin_line": 522,
      "end_line": 531,
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
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setRow(int, double[])",
      "begin_line": 534,
      "end_line": 543,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 45)",
        "(line 536,col 9)-(line 536,col 47)",
        "(line 537,col 9)-(line 539,col 9)",
        "(line 540,col 9)-(line 542,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getColumn(int)",
      "begin_line": 546,
      "end_line": 555,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 51)",
        "(line 548,col 9)-(line 548,col 44)",
        "(line 549,col 9)-(line 549,col 47)",
        "(line 550,col 9)-(line 552,col 9)",
        "(line 554,col 9)-(line 554,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setColumn(int, double[])",
      "begin_line": 558,
      "end_line": 567,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 51)",
        "(line 560,col 9)-(line 560,col 44)",
        "(line 561,col 9)-(line 563,col 9)",
        "(line 564,col 9)-(line 566,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getEntry(int, int)",
      "begin_line": 570,
      "end_line": 570,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setEntry(int, int, double)",
      "begin_line": 573,
      "end_line": 573,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.addToEntry(int, int, double)",
      "begin_line": 576,
      "end_line": 579,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 56)",
        "(line 578,col 9)-(line 578,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 582,
      "end_line": 585,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 583,col 9)-(line 583,col 56)",
        "(line 584,col 9)-(line 584,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.transpose()",
      "begin_line": 588,
      "end_line": 603,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 589,col 9)-(line 589,col 44)",
        "(line 590,col 9)-(line 590,col 47)",
        "(line 591,col 9)-(line 591,col 58)",
        "(line 592,col 9)-(line 600,col 11)",
        "(line 602,col 9)-(line 602,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-a2cf457a-6296-4a4b-86a5-34e841f5b92e.visit(int, int, double)",
      "begin_line": 595,
      "end_line": 598,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 597,col 17)-(line 597,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.isSquare()",
      "begin_line": 606,
      "end_line": 608,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getRowDimension()",
      "begin_line": 617,
      "end_line": 618,
      "comment": "\n     * Returns the number of rows of this matrix.\n     *\n     * @return the number of rows.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getColumnDimension()",
      "begin_line": 625,
      "end_line": 626,
      "comment": "\n     * Returns the number of columns of this matrix.\n     *\n     * @return the number of columns.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getTrace()",
      "begin_line": 629,
      "end_line": 640,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 630,col 9)-(line 630,col 44)",
        "(line 631,col 9)-(line 631,col 47)",
        "(line 632,col 9)-(line 634,col 8)",
        "(line 635,col 9)-(line 635,col 25)",
        "(line 636,col 9)-(line 638,col 9)",
        "(line 639,col 9)-(line 639,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.operate(double[])",
      "begin_line": 643,
      "end_line": 660,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 44)",
        "(line 645,col 9)-(line 645,col 47)",
        "(line 646,col 9)-(line 648,col 9)",
        "(line 650,col 9)-(line 650,col 47)",
        "(line 651,col 9)-(line 657,col 9)",
        "(line 659,col 9)-(line 659,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.operate(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 663,
      "end_line": 685,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 665,col 9)-(line 684,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.preMultiply(double[])",
      "begin_line": 688,
      "end_line": 706,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 44)",
        "(line 691,col 9)-(line 691,col 47)",
        "(line 692,col 9)-(line 694,col 9)",
        "(line 696,col 9)-(line 696,col 47)",
        "(line 697,col 9)-(line 703,col 9)",
        "(line 705,col 9)-(line 705,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.preMultiply(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 709,
      "end_line": 731,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 710,col 9)-(line 730,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor)",
      "begin_line": 734,
      "end_line": 746,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 735,col 9)-(line 735,col 46)",
        "(line 736,col 9)-(line 736,col 49)",
        "(line 737,col 9)-(line 737,col 66)",
        "(line 738,col 9)-(line 744,col 9)",
        "(line 745,col 9)-(line 745,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor)",
      "begin_line": 749,
      "end_line": 759,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 750,col 9)-(line 750,col 46)",
        "(line 751,col 9)-(line 751,col 49)",
        "(line 752,col 9)-(line 752,col 66)",
        "(line 753,col 9)-(line 757,col 9)",
        "(line 758,col 9)-(line 758,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 762,
      "end_line": 776,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 765,col 9)-(line 765,col 88)",
        "(line 766,col 9)-(line 767,col 64)",
        "(line 768,col 9)-(line 774,col 9)",
        "(line 775,col 9)-(line 775,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 779,
      "end_line": 791,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 782,col 9)-(line 782,col 88)",
        "(line 783,col 9)-(line 784,col 64)",
        "(line 785,col 9)-(line 789,col 9)",
        "(line 790,col 9)-(line 790,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor)",
      "begin_line": 794,
      "end_line": 806,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 795,col 9)-(line 795,col 46)",
        "(line 796,col 9)-(line 796,col 49)",
        "(line 797,col 9)-(line 797,col 66)",
        "(line 798,col 9)-(line 804,col 9)",
        "(line 805,col 9)-(line 805,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor)",
      "begin_line": 809,
      "end_line": 819,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 810,col 9)-(line 810,col 46)",
        "(line 811,col 9)-(line 811,col 49)",
        "(line 812,col 9)-(line 812,col 66)",
        "(line 813,col 9)-(line 817,col 9)",
        "(line 818,col 9)-(line 818,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 822,
      "end_line": 836,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 825,col 9)-(line 825,col 88)",
        "(line 826,col 9)-(line 827,col 64)",
        "(line 828,col 9)-(line 834,col 9)",
        "(line 835,col 9)-(line 835,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 839,
      "end_line": 851,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 842,col 9)-(line 842,col 88)",
        "(line 843,col 9)-(line 844,col 64)",
        "(line 845,col 9)-(line 849,col 9)",
        "(line 850,col 9)-(line 850,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor)",
      "begin_line": 854,
      "end_line": 856,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 855,col 9)-(line 855,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor)",
      "begin_line": 859,
      "end_line": 861,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 860,col 9)-(line 860,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 864,
      "end_line": 868,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 867,col 9)-(line 867,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 871,
      "end_line": 875,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 874,col 9)-(line 874,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.toString()",
      "begin_line": 881,
      "end_line": 889,
      "comment": "\n     * Get a string representation for this matrix.\n     * @return a string representation for this matrix\n     ",
      "child_ranges": [
        "(line 883,col 9)-(line 883,col 54)",
        "(line 884,col 9)-(line 884,col 52)",
        "(line 885,col 9)-(line 885,col 92)",
        "(line 886,col 9)-(line 886,col 35)",
        "(line 887,col 9)-(line 887,col 48)",
        "(line 888,col 9)-(line 888,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.equals(java.lang.Object)",
      "begin_line": 899,
      "end_line": 921,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eRealMatrix\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.\n     *\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 901,col 9)-(line 903,col 9)",
        "(line 904,col 9)-(line 906,col 9)",
        "(line 907,col 9)-(line 907,col 43)",
        "(line 908,col 9)-(line 908,col 44)",
        "(line 909,col 9)-(line 909,col 47)",
        "(line 910,col 9)-(line 912,col 9)",
        "(line 913,col 9)-(line 919,col 9)",
        "(line 920,col 9)-(line 920,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.hashCode()",
      "begin_line": 928,
      "end_line": 942,
      "comment": "\n     * Computes a hashcode for the matrix.\n     *\n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 930,col 9)-(line 930,col 20)",
        "(line 931,col 9)-(line 931,col 44)",
        "(line 932,col 9)-(line 932,col 47)",
        "(line 933,col 9)-(line 933,col 31)",
        "(line 934,col 9)-(line 934,col 31)",
        "(line 935,col 9)-(line 940,col 9)",
        "(line 941,col 9)-(line 941,col 19)"
      ]
    }
  ]
}