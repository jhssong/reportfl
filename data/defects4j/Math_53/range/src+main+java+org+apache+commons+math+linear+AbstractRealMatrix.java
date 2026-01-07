{
  "filepath": "/tmp/Math-53b/src/main/java/org/apache/commons/math/linear/AbstractRealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractRealMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealMatrix"
      ],
      "begin_line": 38,
      "end_line": 930,
      "comment": "\n * Basic implementation of RealMatrix methods regardless of the underlying storage.\n * \u003cp\u003eAll the methods implemented here use {@link #getEntry(int, int)} to access\n * matrix elements. Derived class can provide faster implementations. \u003c/p\u003e\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.AbstractRealMatrix()",
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Creates a matrix with no data\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.AbstractRealMatrix(int, int)",
      "begin_line": 51,
      "end_line": 58,
      "comment": "\n     * Create a new RealMatrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension  the number of rows in the new matrix\n     * @param columnDimension  the number of columns in the new matrix\n     * @throws NotStrictlyPositiveException if row or column dimension is not positive\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 57,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.createMatrix(int, int)",
      "begin_line": 61,
      "end_line": 61,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copy()",
      "begin_line": 64,
      "end_line": 64,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.add(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 67,
      "end_line": 81,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 53)",
        "(line 71,col 9)-(line 71,col 50)",
        "(line 72,col 9)-(line 72,col 53)",
        "(line 73,col 9)-(line 73,col 67)",
        "(line 74,col 9)-(line 78,col 9)",
        "(line 80,col 9)-(line 80,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 84,
      "end_line": 98,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 56)",
        "(line 88,col 9)-(line 88,col 50)",
        "(line 89,col 9)-(line 89,col 53)",
        "(line 90,col 9)-(line 90,col 67)",
        "(line 91,col 9)-(line 95,col 9)",
        "(line 97,col 9)-(line 97,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.scalarAdd(double)",
      "begin_line": 101,
      "end_line": 112,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 50)",
        "(line 103,col 9)-(line 103,col 53)",
        "(line 104,col 9)-(line 104,col 67)",
        "(line 105,col 9)-(line 109,col 9)",
        "(line 111,col 9)-(line 111,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.scalarMultiply(double)",
      "begin_line": 115,
      "end_line": 126,
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
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 129,
      "end_line": 148,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 59)",
        "(line 133,col 9)-(line 133,col 44)",
        "(line 134,col 9)-(line 134,col 49)",
        "(line 135,col 9)-(line 135,col 47)",
        "(line 136,col 9)-(line 136,col 58)",
        "(line 137,col 9)-(line 145,col 9)",
        "(line 147,col 9)-(line 147,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 151,
      "end_line": 153,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.power(int)",
      "begin_line": 156,
      "end_line": 212,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 157,col 9)-(line 159,col 9)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 169,col 9)-(line 171,col 9)",
        "(line 173,col 9)-(line 173,col 32)",
        "(line 182,col 9)-(line 182,col 88)",
        "(line 183,col 9)-(line 183,col 77)",
        "(line 184,col 9)-(line 184,col 22)",
        "(line 186,col 9)-(line 196,col 9)",
        "(line 198,col 9)-(line 198,col 56)",
        "(line 199,col 9)-(line 199,col 33)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 205,col 40)",
        "(line 207,col 9)-(line 209,col 9)",
        "(line 211,col 9)-(line 211,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getData()",
      "begin_line": 215,
      "end_line": 226,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 84)",
        "(line 218,col 9)-(line 223,col 9)",
        "(line 225,col 9)-(line 225,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getNorm()",
      "begin_line": 229,
      "end_line": 264,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 230,col 9)-(line 263,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "endRow"
      ],
      "begin_line": 233,
      "end_line": 233,
      "comment": " Last row index. "
    },
    {
      "type": "field",
      "varNames": [
        "columnSum"
      ],
      "begin_line": 236,
      "end_line": 236,
      "comment": " Sum of absolute values on one column. "
    },
    {
      "type": "field",
      "varNames": [
        "maxColSum"
      ],
      "begin_line": 239,
      "end_line": 239,
      "comment": " Maximal sum across all columns. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-83763779-9501-431d-9b0b-aeb02bd116ae.start(int, int, int, int, int, int)",
      "begin_line": 242,
      "end_line": 248,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 245,col 17)-(line 245,col 37)",
        "(line 246,col 17)-(line 246,col 32)",
        "(line 247,col 17)-(line 247,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-7394f910-53d2-41ac-83da-f4157b68b01c.visit(int, int, double)",
      "begin_line": 251,
      "end_line": 257,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 252,col 17)-(line 252,col 49)",
        "(line 253,col 17)-(line 256,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-4f790daa-6ff1-4a4b-9c3a-c2531f2ea26a.end()",
      "begin_line": 260,
      "end_line": 262,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 261,col 17)-(line 261,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getFrobeniusNorm()",
      "begin_line": 267,
      "end_line": 290,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 268,col 9)-(line 289,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 271,
      "end_line": 271,
      "comment": " Sum of squared entries. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-6fbb291b-bc54-4087-a32f-e609bf9af8c9.start(int, int, int, int, int, int)",
      "begin_line": 274,
      "end_line": 278,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 277,col 17)-(line 277,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-69bb4382-d873-46fd-afeb-e88e1e76d352.visit(int, int, double)",
      "begin_line": 281,
      "end_line": 283,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 282,col 17)-(line 282,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-f64f2411-4d9f-4f5a-b008-235944f40d68.end()",
      "begin_line": 286,
      "end_line": 288,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 287,col 17)-(line 287,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 293,
      "end_line": 306,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 88)",
        "(line 297,col 9)-(line 298,col 77)",
        "(line 299,col 9)-(line 303,col 9)",
        "(line 305,col 9)-(line 305,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getSubMatrix(int[], int[])",
      "begin_line": 309,
      "end_line": 327,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 77)",
        "(line 314,col 9)-(line 315,col 70)",
        "(line 316,col 9)-(line 324,col 11)",
        "(line 326,col 9)-(line 326,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-9867f3b5-a3a8-4c8b-a0f1-4c7da87f7ade.visit(int, int, double)",
      "begin_line": 319,
      "end_line": 322,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 321,col 17)-(line 321,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copySubMatrix(int, int, int, int, double[][])",
      "begin_line": 330,
      "end_line": 367,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 88)",
        "(line 335,col 9)-(line 335,col 55)",
        "(line 336,col 9)-(line 336,col 61)",
        "(line 337,col 9)-(line 340,col 9)",
        "(line 343,col 9)-(line 366,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "startRow"
      ],
      "begin_line": 346,
      "end_line": 346,
      "comment": " Initial row index. "
    },
    {
      "type": "field",
      "varNames": [
        "startColumn"
      ],
      "begin_line": 349,
      "end_line": 349,
      "comment": " Initial column index. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-311a78a0-9fe7-4a69-9353-b7db728b6fc4.start(int, int, int, int, int, int)",
      "begin_line": 352,
      "end_line": 358,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 356,col 17)-(line 356,col 44)",
        "(line 357,col 17)-(line 357,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-a41002c4-0804-43cb-9486-3b731bef130f.visit(int, int, double)",
      "begin_line": 361,
      "end_line": 364,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 363,col 17)-(line 363,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copySubMatrix(int[], int[], double[][])",
      "begin_line": 370,
      "end_line": 386,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 77)",
        "(line 373,col 9)-(line 377,col 9)",
        "(line 380,col 9)-(line 385,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 389,
      "end_line": 418,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 42)",
        "(line 392,col 9)-(line 392,col 43)",
        "(line 393,col 9)-(line 395,col 9)",
        "(line 397,col 9)-(line 397,col 46)",
        "(line 398,col 9)-(line 400,col 9)",
        "(line 402,col 9)-(line 406,col 9)",
        "(line 408,col 9)-(line 408,col 45)",
        "(line 409,col 9)-(line 409,col 51)",
        "(line 410,col 9)-(line 410,col 57)",
        "(line 411,col 9)-(line 411,col 63)",
        "(line 413,col 9)-(line 417,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowMatrix(int)",
      "begin_line": 421,
      "end_line": 430,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 45)",
        "(line 423,col 9)-(line 423,col 47)",
        "(line 424,col 9)-(line 424,col 54)",
        "(line 425,col 9)-(line 427,col 9)",
        "(line 429,col 9)-(line 429,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRowMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 433,
      "end_line": 445,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 45)",
        "(line 435,col 9)-(line 435,col 47)",
        "(line 436,col 9)-(line 441,col 9)",
        "(line 442,col 9)-(line 444,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnMatrix(int)",
      "begin_line": 448,
      "end_line": 457,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 51)",
        "(line 450,col 9)-(line 450,col 44)",
        "(line 451,col 9)-(line 451,col 54)",
        "(line 452,col 9)-(line 454,col 9)",
        "(line 456,col 9)-(line 456,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 460,
      "end_line": 472,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 51)",
        "(line 462,col 9)-(line 462,col 44)",
        "(line 463,col 9)-(line 468,col 9)",
        "(line 469,col 9)-(line 471,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowVector(int)",
      "begin_line": 475,
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
      "end_line": 490,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 45)",
        "(line 482,col 9)-(line 482,col 47)",
        "(line 483,col 9)-(line 486,col 9)",
        "(line 487,col 9)-(line 489,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnVector(int)",
      "begin_line": 493,
      "end_line": 495,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumnVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 498,
      "end_line": 508,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 51)",
        "(line 500,col 9)-(line 500,col 44)",
        "(line 501,col 9)-(line 504,col 9)",
        "(line 505,col 9)-(line 507,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRow(int)",
      "begin_line": 511,
      "end_line": 520,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 45)",
        "(line 513,col 9)-(line 513,col 47)",
        "(line 514,col 9)-(line 514,col 47)",
        "(line 515,col 9)-(line 517,col 9)",
        "(line 519,col 9)-(line 519,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRow(int, double[])",
      "begin_line": 523,
      "end_line": 532,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 45)",
        "(line 525,col 9)-(line 525,col 47)",
        "(line 526,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 531,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumn(int)",
      "begin_line": 535,
      "end_line": 544,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 51)",
        "(line 537,col 9)-(line 537,col 44)",
        "(line 538,col 9)-(line 538,col 47)",
        "(line 539,col 9)-(line 541,col 9)",
        "(line 543,col 9)-(line 543,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumn(int, double[])",
      "begin_line": 547,
      "end_line": 556,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 51)",
        "(line 549,col 9)-(line 549,col 44)",
        "(line 550,col 9)-(line 552,col 9)",
        "(line 553,col 9)-(line 555,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getEntry(int, int)",
      "begin_line": 559,
      "end_line": 559,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setEntry(int, int, double)",
      "begin_line": 562,
      "end_line": 562,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.addToEntry(int, int, double)",
      "begin_line": 565,
      "end_line": 565,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 568,
      "end_line": 568,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.transpose()",
      "begin_line": 571,
      "end_line": 586,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 44)",
        "(line 573,col 9)-(line 573,col 47)",
        "(line 574,col 9)-(line 574,col 58)",
        "(line 575,col 9)-(line 583,col 11)",
        "(line 585,col 9)-(line 585,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-4cc11c3f-5469-44ca-b560-86e4a5f53237.visit(int, int, double)",
      "begin_line": 578,
      "end_line": 581,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 580,col 17)-(line 580,col 49)"
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
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowDimension()",
      "begin_line": 594,
      "end_line": 594,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnDimension()",
      "begin_line": 597,
      "end_line": 597,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getTrace()",
      "begin_line": 600,
      "end_line": 611,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 601,col 9)-(line 601,col 44)",
        "(line 602,col 9)-(line 602,col 47)",
        "(line 603,col 9)-(line 605,col 8)",
        "(line 606,col 9)-(line 606,col 25)",
        "(line 607,col 9)-(line 609,col 9)",
        "(line 610,col 9)-(line 610,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.operate(double[])",
      "begin_line": 614,
      "end_line": 631,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 615,col 9)-(line 615,col 44)",
        "(line 616,col 9)-(line 616,col 47)",
        "(line 617,col 9)-(line 619,col 9)",
        "(line 621,col 9)-(line 621,col 47)",
        "(line 622,col 9)-(line 628,col 9)",
        "(line 630,col 9)-(line 630,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.operate(org.apache.commons.math.linear.RealVector)",
      "begin_line": 634,
      "end_line": 655,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 635,col 9)-(line 654,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(double[])",
      "begin_line": 658,
      "end_line": 676,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 660,col 9)-(line 660,col 44)",
        "(line 661,col 9)-(line 661,col 47)",
        "(line 662,col 9)-(line 664,col 9)",
        "(line 666,col 9)-(line 666,col 47)",
        "(line 667,col 9)-(line 673,col 9)",
        "(line 675,col 9)-(line 675,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 679,
      "end_line": 701,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 680,col 9)-(line 700,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 704,
      "end_line": 716,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 705,col 9)-(line 705,col 46)",
        "(line 706,col 9)-(line 706,col 49)",
        "(line 707,col 9)-(line 707,col 66)",
        "(line 708,col 9)-(line 714,col 9)",
        "(line 715,col 9)-(line 715,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 719,
      "end_line": 729,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 720,col 9)-(line 720,col 46)",
        "(line 721,col 9)-(line 721,col 49)",
        "(line 722,col 9)-(line 722,col 66)",
        "(line 723,col 9)-(line 727,col 9)",
        "(line 728,col 9)-(line 728,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 732,
      "end_line": 746,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 735,col 9)-(line 735,col 88)",
        "(line 736,col 9)-(line 737,col 64)",
        "(line 738,col 9)-(line 744,col 9)",
        "(line 745,col 9)-(line 745,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 749,
      "end_line": 761,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 752,col 9)-(line 752,col 88)",
        "(line 753,col 9)-(line 754,col 64)",
        "(line 755,col 9)-(line 759,col 9)",
        "(line 760,col 9)-(line 760,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 764,
      "end_line": 776,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 765,col 9)-(line 765,col 46)",
        "(line 766,col 9)-(line 766,col 49)",
        "(line 767,col 9)-(line 767,col 66)",
        "(line 768,col 9)-(line 774,col 9)",
        "(line 775,col 9)-(line 775,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 779,
      "end_line": 789,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 780,col 9)-(line 780,col 46)",
        "(line 781,col 9)-(line 781,col 49)",
        "(line 782,col 9)-(line 782,col 66)",
        "(line 783,col 9)-(line 787,col 9)",
        "(line 788,col 9)-(line 788,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 792,
      "end_line": 806,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 795,col 9)-(line 795,col 88)",
        "(line 796,col 9)-(line 797,col 64)",
        "(line 798,col 9)-(line 804,col 9)",
        "(line 805,col 9)-(line 805,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 809,
      "end_line": 821,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 812,col 9)-(line 812,col 88)",
        "(line 813,col 9)-(line 814,col 64)",
        "(line 815,col 9)-(line 819,col 9)",
        "(line 820,col 9)-(line 820,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 824,
      "end_line": 826,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 825,col 9)-(line 825,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 829,
      "end_line": 831,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 830,col 9)-(line 830,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 834,
      "end_line": 838,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 837,col 9)-(line 837,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 841,
      "end_line": 845,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 844,col 9)-(line 844,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.toString()",
      "begin_line": 851,
      "end_line": 876,
      "comment": "\n     * Get a string representation for this matrix.\n     * @return a string representation for this matrix\n     ",
      "child_ranges": [
        "(line 853,col 9)-(line 853,col 44)",
        "(line 854,col 9)-(line 854,col 47)",
        "(line 855,col 9)-(line 855,col 52)",
        "(line 856,col 9)-(line 856,col 52)",
        "(line 857,col 9)-(line 857,col 92)",
        "(line 858,col 9)-(line 858,col 47)",
        "(line 860,col 9)-(line 872,col 9)",
        "(line 874,col 9)-(line 874,col 24)",
        "(line 875,col 9)-(line 875,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.equals(java.lang.Object)",
      "begin_line": 886,
      "end_line": 908,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eRealMatrix\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.\n     *\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 888,col 9)-(line 890,col 9)",
        "(line 891,col 9)-(line 893,col 9)",
        "(line 894,col 9)-(line 894,col 43)",
        "(line 895,col 9)-(line 895,col 44)",
        "(line 896,col 9)-(line 896,col 47)",
        "(line 897,col 9)-(line 899,col 9)",
        "(line 900,col 9)-(line 906,col 9)",
        "(line 907,col 9)-(line 907,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.hashCode()",
      "begin_line": 915,
      "end_line": 929,
      "comment": "\n     * Computes a hashcode for the matrix.\n     *\n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 917,col 9)-(line 917,col 20)",
        "(line 918,col 9)-(line 918,col 44)",
        "(line 919,col 9)-(line 919,col 47)",
        "(line 920,col 9)-(line 920,col 31)",
        "(line 921,col 9)-(line 921,col 31)",
        "(line 922,col 9)-(line 927,col 9)",
        "(line 928,col 9)-(line 928,col 19)"
      ]
    }
  ]
}