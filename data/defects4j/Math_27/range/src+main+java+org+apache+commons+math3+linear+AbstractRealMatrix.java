{
  "filepath": "/tmp/Math-27b/src/main/java/org/apache/commons/math3/linear/AbstractRealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractRealMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.RealLinearOperator",
        "org.apache.commons.math3.linear.RealMatrix"
      ],
      "begin_line": 38,
      "end_line": 942,
      "comment": "\n * Basic implementation of RealMatrix methods regardless of the underlying storage.\n * \u003cp\u003eAll the methods implemented here use {@link #getEntry(int, int)} to access\n * matrix elements. Derived class can provide faster implementations. \u003c/p\u003e\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FORMAT"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Default format. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.AbstractRealMatrix()",
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Creates a matrix with no data\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.AbstractRealMatrix(int, int)",
      "begin_line": 61,
      "end_line": 68,
      "comment": "\n     * Create a new RealMatrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension  the number of rows in the new matrix\n     * @param columnDimension  the number of columns in the new matrix\n     * @throws NotStrictlyPositiveException if row or column dimension is not positive\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 64,col 9)",
        "(line 65,col 9)-(line 67,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.createMatrix(int, int)",
      "begin_line": 71,
      "end_line": 71,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.copy()",
      "begin_line": 74,
      "end_line": 74,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
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
      "end_line": 163,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.power(int)",
      "begin_line": 166,
      "end_line": 222,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 167,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 173,col 9)",
        "(line 175,col 9)-(line 177,col 9)",
        "(line 179,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 183,col 32)",
        "(line 192,col 9)-(line 192,col 88)",
        "(line 193,col 9)-(line 193,col 77)",
        "(line 194,col 9)-(line 194,col 22)",
        "(line 196,col 9)-(line 206,col 9)",
        "(line 208,col 9)-(line 208,col 56)",
        "(line 209,col 9)-(line 209,col 33)",
        "(line 211,col 9)-(line 213,col 9)",
        "(line 215,col 9)-(line 215,col 40)",
        "(line 217,col 9)-(line 219,col 9)",
        "(line 221,col 9)-(line 221,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getData()",
      "begin_line": 225,
      "end_line": 236,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 84)",
        "(line 228,col 9)-(line 233,col 9)",
        "(line 235,col 9)-(line 235,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getNorm()",
      "begin_line": 239,
      "end_line": 274,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 240,col 9)-(line 273,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "endRow"
      ],
      "begin_line": 243,
      "end_line": 243,
      "comment": " Last row index. "
    },
    {
      "type": "field",
      "varNames": [
        "columnSum"
      ],
      "begin_line": 246,
      "end_line": 246,
      "comment": " Sum of absolute values on one column. "
    },
    {
      "type": "field",
      "varNames": [
        "maxColSum"
      ],
      "begin_line": 249,
      "end_line": 249,
      "comment": " Maximal sum across all columns. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-c68b3613-3571-4c8d-80ab-ded7019b075e.start(int, int, int, int, int, int)",
      "begin_line": 252,
      "end_line": 258,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 255,col 17)-(line 255,col 37)",
        "(line 256,col 17)-(line 256,col 32)",
        "(line 257,col 17)-(line 257,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-905a3408-5f9a-498b-979c-ac5cac4fa5df.visit(int, int, double)",
      "begin_line": 261,
      "end_line": 267,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 262,col 17)-(line 262,col 49)",
        "(line 263,col 17)-(line 266,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-f278fd8a-5634-4e33-9451-e898123bf7b6.end()",
      "begin_line": 270,
      "end_line": 272,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 271,col 17)-(line 271,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getFrobeniusNorm()",
      "begin_line": 277,
      "end_line": 300,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 278,col 9)-(line 299,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 281,
      "end_line": 281,
      "comment": " Sum of squared entries. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-24b18b2d-50c0-47f7-b682-59691847c3be.start(int, int, int, int, int, int)",
      "begin_line": 284,
      "end_line": 288,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 287,col 17)-(line 287,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-c7118e8c-ba6b-46de-83e3-08601a893b55.visit(int, int, double)",
      "begin_line": 291,
      "end_line": 293,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 292,col 17)-(line 292,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-cb7fbed6-b4ee-4151-85ea-cdd246a3c17d.end()",
      "begin_line": 296,
      "end_line": 298,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 297,col 17)-(line 297,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 303,
      "end_line": 316,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 88)",
        "(line 307,col 9)-(line 308,col 77)",
        "(line 309,col 9)-(line 313,col 9)",
        "(line 315,col 9)-(line 315,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getSubMatrix(int[], int[])",
      "begin_line": 319,
      "end_line": 337,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 77)",
        "(line 324,col 9)-(line 325,col 70)",
        "(line 326,col 9)-(line 334,col 11)",
        "(line 336,col 9)-(line 336,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-88503960-c66a-480e-96b7-412910c4bf8f.visit(int, int, double)",
      "begin_line": 329,
      "end_line": 332,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 331,col 17)-(line 331,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.copySubMatrix(int, int, int, int, double[][])",
      "begin_line": 340,
      "end_line": 377,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 88)",
        "(line 345,col 9)-(line 345,col 55)",
        "(line 346,col 9)-(line 346,col 61)",
        "(line 347,col 9)-(line 350,col 9)",
        "(line 353,col 9)-(line 376,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "startRow"
      ],
      "begin_line": 356,
      "end_line": 356,
      "comment": " Initial row index. "
    },
    {
      "type": "field",
      "varNames": [
        "startColumn"
      ],
      "begin_line": 359,
      "end_line": 359,
      "comment": " Initial column index. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-1473aea2-139f-4068-b199-5a0f3a858331.start(int, int, int, int, int, int)",
      "begin_line": 362,
      "end_line": 368,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 366,col 17)-(line 366,col 44)",
        "(line 367,col 17)-(line 367,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-0d2501ec-b42b-4fbb-8c3b-f175f4f9bc86.visit(int, int, double)",
      "begin_line": 371,
      "end_line": 374,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 373,col 17)-(line 373,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.copySubMatrix(int[], int[], double[][])",
      "begin_line": 380,
      "end_line": 396,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 77)",
        "(line 383,col 9)-(line 387,col 9)",
        "(line 390,col 9)-(line 395,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 399,
      "end_line": 428,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 42)",
        "(line 402,col 9)-(line 402,col 43)",
        "(line 403,col 9)-(line 405,col 9)",
        "(line 407,col 9)-(line 407,col 46)",
        "(line 408,col 9)-(line 410,col 9)",
        "(line 412,col 9)-(line 416,col 9)",
        "(line 418,col 9)-(line 418,col 45)",
        "(line 419,col 9)-(line 419,col 51)",
        "(line 420,col 9)-(line 420,col 57)",
        "(line 421,col 9)-(line 421,col 63)",
        "(line 423,col 9)-(line 427,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getRowMatrix(int)",
      "begin_line": 431,
      "end_line": 440,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 45)",
        "(line 433,col 9)-(line 433,col 47)",
        "(line 434,col 9)-(line 434,col 54)",
        "(line 435,col 9)-(line 437,col 9)",
        "(line 439,col 9)-(line 439,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setRowMatrix(int, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 443,
      "end_line": 455,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 45)",
        "(line 445,col 9)-(line 445,col 47)",
        "(line 446,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 454,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getColumnMatrix(int)",
      "begin_line": 458,
      "end_line": 467,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 51)",
        "(line 460,col 9)-(line 460,col 44)",
        "(line 461,col 9)-(line 461,col 54)",
        "(line 462,col 9)-(line 464,col 9)",
        "(line 466,col 9)-(line 466,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setColumnMatrix(int, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 470,
      "end_line": 482,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 51)",
        "(line 472,col 9)-(line 472,col 44)",
        "(line 473,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 481,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getRowVector(int)",
      "begin_line": 485,
      "end_line": 487,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setRowVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 490,
      "end_line": 500,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 45)",
        "(line 492,col 9)-(line 492,col 47)",
        "(line 493,col 9)-(line 496,col 9)",
        "(line 497,col 9)-(line 499,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getColumnVector(int)",
      "begin_line": 503,
      "end_line": 505,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setColumnVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 508,
      "end_line": 518,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 51)",
        "(line 510,col 9)-(line 510,col 44)",
        "(line 511,col 9)-(line 514,col 9)",
        "(line 515,col 9)-(line 517,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getRow(int)",
      "begin_line": 521,
      "end_line": 530,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 45)",
        "(line 523,col 9)-(line 523,col 47)",
        "(line 524,col 9)-(line 524,col 47)",
        "(line 525,col 9)-(line 527,col 9)",
        "(line 529,col 9)-(line 529,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setRow(int, double[])",
      "begin_line": 533,
      "end_line": 542,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 45)",
        "(line 535,col 9)-(line 535,col 47)",
        "(line 536,col 9)-(line 538,col 9)",
        "(line 539,col 9)-(line 541,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getColumn(int)",
      "begin_line": 545,
      "end_line": 554,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 51)",
        "(line 547,col 9)-(line 547,col 44)",
        "(line 548,col 9)-(line 548,col 47)",
        "(line 549,col 9)-(line 551,col 9)",
        "(line 553,col 9)-(line 553,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setColumn(int, double[])",
      "begin_line": 557,
      "end_line": 566,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 51)",
        "(line 559,col 9)-(line 559,col 44)",
        "(line 560,col 9)-(line 562,col 9)",
        "(line 563,col 9)-(line 565,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getEntry(int, int)",
      "begin_line": 569,
      "end_line": 569,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setEntry(int, int, double)",
      "begin_line": 572,
      "end_line": 572,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.addToEntry(int, int, double)",
      "begin_line": 575,
      "end_line": 578,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 56)",
        "(line 577,col 9)-(line 577,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 581,
      "end_line": 584,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 56)",
        "(line 583,col 9)-(line 583,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.transpose()",
      "begin_line": 587,
      "end_line": 602,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 44)",
        "(line 589,col 9)-(line 589,col 47)",
        "(line 590,col 9)-(line 590,col 58)",
        "(line 591,col 9)-(line 599,col 11)",
        "(line 601,col 9)-(line 601,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-58d95029-7109-42b2-a6c9-99bfcfb7f408.visit(int, int, double)",
      "begin_line": 594,
      "end_line": 597,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 596,col 17)-(line 596,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.isSquare()",
      "begin_line": 605,
      "end_line": 607,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 606,col 9)-(line 606,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getRowDimension()",
      "begin_line": 616,
      "end_line": 617,
      "comment": "\n     * Returns the number of rows of this matrix.\n     *\n     * @return the number of rows.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getColumnDimension()",
      "begin_line": 624,
      "end_line": 625,
      "comment": "\n     * Returns the number of columns of this matrix.\n     *\n     * @return the number of columns.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getTrace()",
      "begin_line": 628,
      "end_line": 639,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 44)",
        "(line 630,col 9)-(line 630,col 47)",
        "(line 631,col 9)-(line 633,col 8)",
        "(line 634,col 9)-(line 634,col 25)",
        "(line 635,col 9)-(line 637,col 9)",
        "(line 638,col 9)-(line 638,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.operate(double[])",
      "begin_line": 642,
      "end_line": 659,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 643,col 9)-(line 643,col 44)",
        "(line 644,col 9)-(line 644,col 47)",
        "(line 645,col 9)-(line 647,col 9)",
        "(line 649,col 9)-(line 649,col 47)",
        "(line 650,col 9)-(line 656,col 9)",
        "(line 658,col 9)-(line 658,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.operate(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 662,
      "end_line": 684,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 664,col 9)-(line 683,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.preMultiply(double[])",
      "begin_line": 687,
      "end_line": 705,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 689,col 9)-(line 689,col 44)",
        "(line 690,col 9)-(line 690,col 47)",
        "(line 691,col 9)-(line 693,col 9)",
        "(line 695,col 9)-(line 695,col 47)",
        "(line 696,col 9)-(line 702,col 9)",
        "(line 704,col 9)-(line 704,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.preMultiply(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 708,
      "end_line": 730,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 709,col 9)-(line 729,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor)",
      "begin_line": 733,
      "end_line": 745,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 734,col 9)-(line 734,col 46)",
        "(line 735,col 9)-(line 735,col 49)",
        "(line 736,col 9)-(line 736,col 66)",
        "(line 737,col 9)-(line 743,col 9)",
        "(line 744,col 9)-(line 744,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor)",
      "begin_line": 748,
      "end_line": 758,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 749,col 9)-(line 749,col 46)",
        "(line 750,col 9)-(line 750,col 49)",
        "(line 751,col 9)-(line 751,col 66)",
        "(line 752,col 9)-(line 756,col 9)",
        "(line 757,col 9)-(line 757,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 761,
      "end_line": 775,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 764,col 9)-(line 764,col 88)",
        "(line 765,col 9)-(line 766,col 64)",
        "(line 767,col 9)-(line 773,col 9)",
        "(line 774,col 9)-(line 774,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 778,
      "end_line": 790,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 781,col 9)-(line 781,col 88)",
        "(line 782,col 9)-(line 783,col 64)",
        "(line 784,col 9)-(line 788,col 9)",
        "(line 789,col 9)-(line 789,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor)",
      "begin_line": 793,
      "end_line": 805,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 794,col 9)-(line 794,col 46)",
        "(line 795,col 9)-(line 795,col 49)",
        "(line 796,col 9)-(line 796,col 66)",
        "(line 797,col 9)-(line 803,col 9)",
        "(line 804,col 9)-(line 804,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor)",
      "begin_line": 808,
      "end_line": 818,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 809,col 9)-(line 809,col 46)",
        "(line 810,col 9)-(line 810,col 49)",
        "(line 811,col 9)-(line 811,col 66)",
        "(line 812,col 9)-(line 816,col 9)",
        "(line 817,col 9)-(line 817,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 821,
      "end_line": 835,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 824,col 9)-(line 824,col 88)",
        "(line 825,col 9)-(line 826,col 64)",
        "(line 827,col 9)-(line 833,col 9)",
        "(line 834,col 9)-(line 834,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 838,
      "end_line": 850,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 841,col 9)-(line 841,col 88)",
        "(line 842,col 9)-(line 843,col 64)",
        "(line 844,col 9)-(line 848,col 9)",
        "(line 849,col 9)-(line 849,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor)",
      "begin_line": 853,
      "end_line": 855,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 854,col 9)-(line 854,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor)",
      "begin_line": 858,
      "end_line": 860,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 859,col 9)-(line 859,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 863,
      "end_line": 867,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 866,col 9)-(line 866,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 870,
      "end_line": 874,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 873,col 9)-(line 873,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.toString()",
      "begin_line": 880,
      "end_line": 888,
      "comment": "\n     * Get a string representation for this matrix.\n     * @return a string representation for this matrix\n     ",
      "child_ranges": [
        "(line 882,col 9)-(line 882,col 54)",
        "(line 883,col 9)-(line 883,col 52)",
        "(line 884,col 9)-(line 884,col 92)",
        "(line 885,col 9)-(line 885,col 35)",
        "(line 886,col 9)-(line 886,col 48)",
        "(line 887,col 9)-(line 887,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.equals(java.lang.Object)",
      "begin_line": 898,
      "end_line": 920,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eRealMatrix\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.\n     *\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 900,col 9)-(line 902,col 9)",
        "(line 903,col 9)-(line 905,col 9)",
        "(line 906,col 9)-(line 906,col 43)",
        "(line 907,col 9)-(line 907,col 44)",
        "(line 908,col 9)-(line 908,col 47)",
        "(line 909,col 9)-(line 911,col 9)",
        "(line 912,col 9)-(line 918,col 9)",
        "(line 919,col 9)-(line 919,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.hashCode()",
      "begin_line": 927,
      "end_line": 941,
      "comment": "\n     * Computes a hashcode for the matrix.\n     *\n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 929,col 9)-(line 929,col 20)",
        "(line 930,col 9)-(line 930,col 44)",
        "(line 931,col 9)-(line 931,col 47)",
        "(line 932,col 9)-(line 932,col 31)",
        "(line 933,col 9)-(line 933,col 31)",
        "(line 934,col 9)-(line 939,col 9)",
        "(line 940,col 9)-(line 940,col 19)"
      ]
    }
  ]
}