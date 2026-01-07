{
  "filepath": "/tmp/Math-58b/src/main/java/org/apache/commons/math/linear/AbstractRealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractRealMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealMatrix"
      ],
      "begin_line": 37,
      "end_line": 868,
      "comment": "\n * Basic implementation of RealMatrix methods regardless of the underlying storage.\n * \u003cp\u003eAll the methods implemented here use {@link #getEntry(int, int)} to access\n * matrix elements. Derived class can provide faster implementations. \u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.AbstractRealMatrix()",
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Creates a matrix with no data\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.AbstractRealMatrix(int, int)",
      "begin_line": 50,
      "end_line": 57,
      "comment": "\n     * Create a new RealMatrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension  the number of rows in the new matrix\n     * @param columnDimension  the number of columns in the new matrix\n     * @throws NotStrictlyPositiveException if row or column dimension is not positive\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 53,col 9)",
        "(line 54,col 9)-(line 56,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.createMatrix(int, int)",
      "begin_line": 60,
      "end_line": 60,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copy()",
      "begin_line": 63,
      "end_line": 63,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.add(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 66,
      "end_line": 80,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 53)",
        "(line 70,col 9)-(line 70,col 50)",
        "(line 71,col 9)-(line 71,col 53)",
        "(line 72,col 9)-(line 72,col 67)",
        "(line 73,col 9)-(line 77,col 9)",
        "(line 79,col 9)-(line 79,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 83,
      "end_line": 97,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 56)",
        "(line 87,col 9)-(line 87,col 50)",
        "(line 88,col 9)-(line 88,col 53)",
        "(line 89,col 9)-(line 89,col 67)",
        "(line 90,col 9)-(line 94,col 9)",
        "(line 96,col 9)-(line 96,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.scalarAdd(double)",
      "begin_line": 100,
      "end_line": 111,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 50)",
        "(line 102,col 9)-(line 102,col 53)",
        "(line 103,col 9)-(line 103,col 67)",
        "(line 104,col 9)-(line 108,col 9)",
        "(line 110,col 9)-(line 110,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.scalarMultiply(double)",
      "begin_line": 114,
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
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 128,
      "end_line": 147,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 59)",
        "(line 132,col 9)-(line 132,col 44)",
        "(line 133,col 9)-(line 133,col 49)",
        "(line 134,col 9)-(line 134,col 47)",
        "(line 135,col 9)-(line 135,col 58)",
        "(line 136,col 9)-(line 144,col 9)",
        "(line 146,col 9)-(line 146,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 150,
      "end_line": 152,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getData()",
      "begin_line": 155,
      "end_line": 166,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 84)",
        "(line 158,col 9)-(line 163,col 9)",
        "(line 165,col 9)-(line 165,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getNorm()",
      "begin_line": 169,
      "end_line": 204,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 170,col 9)-(line 203,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "endRow"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": " Last row index. "
    },
    {
      "type": "field",
      "varNames": [
        "columnSum"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": " Sum of absolute values on one column. "
    },
    {
      "type": "field",
      "varNames": [
        "maxColSum"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": " Maximal sum across all columns. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-8993d1f2-b66b-42ca-8a32-602c71cbb894.start(int, int, int, int, int, int)",
      "begin_line": 182,
      "end_line": 188,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 185,col 17)-(line 185,col 37)",
        "(line 186,col 17)-(line 186,col 32)",
        "(line 187,col 17)-(line 187,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-7e04f8c4-42ff-4ca1-80b1-9ab517db0016.visit(int, int, double)",
      "begin_line": 191,
      "end_line": 197,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 192,col 17)-(line 192,col 49)",
        "(line 193,col 17)-(line 196,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-b1a19d6c-d128-45d6-ab65-78a480538ebf.end()",
      "begin_line": 200,
      "end_line": 202,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 201,col 17)-(line 201,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getFrobeniusNorm()",
      "begin_line": 207,
      "end_line": 230,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 208,col 9)-(line 229,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": " Sum of squared entries. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-9e0b1d9d-dadc-4d24-a099-a80fb8ed26aa.start(int, int, int, int, int, int)",
      "begin_line": 214,
      "end_line": 218,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 217,col 17)-(line 217,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-05b46339-fb12-4815-a6e7-29c309fc795e.visit(int, int, double)",
      "begin_line": 221,
      "end_line": 223,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 222,col 17)-(line 222,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-404df53c-245d-4643-bedb-614d1cf77fa2.end()",
      "begin_line": 226,
      "end_line": 228,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 227,col 17)-(line 227,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 233,
      "end_line": 246,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 88)",
        "(line 237,col 9)-(line 238,col 77)",
        "(line 239,col 9)-(line 243,col 9)",
        "(line 245,col 9)-(line 245,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getSubMatrix(int[], int[])",
      "begin_line": 249,
      "end_line": 267,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 77)",
        "(line 254,col 9)-(line 255,col 70)",
        "(line 256,col 9)-(line 264,col 11)",
        "(line 266,col 9)-(line 266,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-a057d864-2c9a-4f97-bc8d-08f68798b5da.visit(int, int, double)",
      "begin_line": 259,
      "end_line": 262,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 261,col 17)-(line 261,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copySubMatrix(int, int, int, int, double[][])",
      "begin_line": 270,
      "end_line": 307,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 88)",
        "(line 275,col 9)-(line 275,col 55)",
        "(line 276,col 9)-(line 276,col 61)",
        "(line 277,col 9)-(line 280,col 9)",
        "(line 283,col 9)-(line 306,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "startRow"
      ],
      "begin_line": 286,
      "end_line": 286,
      "comment": " Initial row index. "
    },
    {
      "type": "field",
      "varNames": [
        "startColumn"
      ],
      "begin_line": 289,
      "end_line": 289,
      "comment": " Initial column index. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-814be874-7526-4bf0-bac8-be8596c5667b.start(int, int, int, int, int, int)",
      "begin_line": 292,
      "end_line": 298,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 296,col 17)-(line 296,col 44)",
        "(line 297,col 17)-(line 297,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-494d890f-0692-4ad2-8971-cfa4451573fa.visit(int, int, double)",
      "begin_line": 301,
      "end_line": 304,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 303,col 17)-(line 303,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copySubMatrix(int[], int[], double[][])",
      "begin_line": 310,
      "end_line": 326,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 77)",
        "(line 313,col 9)-(line 317,col 9)",
        "(line 320,col 9)-(line 325,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 329,
      "end_line": 356,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 43)",
        "(line 331,col 9)-(line 333,col 9)",
        "(line 335,col 9)-(line 335,col 46)",
        "(line 336,col 9)-(line 338,col 9)",
        "(line 340,col 9)-(line 344,col 9)",
        "(line 346,col 9)-(line 346,col 45)",
        "(line 347,col 9)-(line 347,col 51)",
        "(line 348,col 9)-(line 348,col 57)",
        "(line 349,col 9)-(line 349,col 63)",
        "(line 351,col 9)-(line 355,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowMatrix(int)",
      "begin_line": 359,
      "end_line": 368,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 45)",
        "(line 361,col 9)-(line 361,col 47)",
        "(line 362,col 9)-(line 362,col 54)",
        "(line 363,col 9)-(line 365,col 9)",
        "(line 367,col 9)-(line 367,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRowMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 371,
      "end_line": 383,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 45)",
        "(line 373,col 9)-(line 373,col 47)",
        "(line 374,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 382,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnMatrix(int)",
      "begin_line": 386,
      "end_line": 395,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 51)",
        "(line 388,col 9)-(line 388,col 44)",
        "(line 389,col 9)-(line 389,col 54)",
        "(line 390,col 9)-(line 392,col 9)",
        "(line 394,col 9)-(line 394,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 398,
      "end_line": 410,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 51)",
        "(line 400,col 9)-(line 400,col 44)",
        "(line 401,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 409,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowVector(int)",
      "begin_line": 413,
      "end_line": 415,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRowVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 418,
      "end_line": 428,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 45)",
        "(line 420,col 9)-(line 420,col 47)",
        "(line 421,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 427,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnVector(int)",
      "begin_line": 431,
      "end_line": 433,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumnVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 436,
      "end_line": 446,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 51)",
        "(line 438,col 9)-(line 438,col 44)",
        "(line 439,col 9)-(line 442,col 9)",
        "(line 443,col 9)-(line 445,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRow(int)",
      "begin_line": 449,
      "end_line": 458,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 45)",
        "(line 451,col 9)-(line 451,col 47)",
        "(line 452,col 9)-(line 452,col 47)",
        "(line 453,col 9)-(line 455,col 9)",
        "(line 457,col 9)-(line 457,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRow(int, double[])",
      "begin_line": 461,
      "end_line": 470,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 45)",
        "(line 463,col 9)-(line 463,col 47)",
        "(line 464,col 9)-(line 466,col 9)",
        "(line 467,col 9)-(line 469,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumn(int)",
      "begin_line": 473,
      "end_line": 482,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 51)",
        "(line 475,col 9)-(line 475,col 44)",
        "(line 476,col 9)-(line 476,col 47)",
        "(line 477,col 9)-(line 479,col 9)",
        "(line 481,col 9)-(line 481,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumn(int, double[])",
      "begin_line": 485,
      "end_line": 494,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 51)",
        "(line 487,col 9)-(line 487,col 44)",
        "(line 488,col 9)-(line 490,col 9)",
        "(line 491,col 9)-(line 493,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getEntry(int, int)",
      "begin_line": 497,
      "end_line": 497,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setEntry(int, int, double)",
      "begin_line": 500,
      "end_line": 500,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.addToEntry(int, int, double)",
      "begin_line": 503,
      "end_line": 503,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 506,
      "end_line": 506,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.transpose()",
      "begin_line": 509,
      "end_line": 524,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 44)",
        "(line 511,col 9)-(line 511,col 47)",
        "(line 512,col 9)-(line 512,col 58)",
        "(line 513,col 9)-(line 521,col 11)",
        "(line 523,col 9)-(line 523,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-12a7f9b1-7f81-4e70-a783-74ef52b8b18a.visit(int, int, double)",
      "begin_line": 516,
      "end_line": 519,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 518,col 17)-(line 518,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.isSquare()",
      "begin_line": 527,
      "end_line": 529,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowDimension()",
      "begin_line": 532,
      "end_line": 532,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnDimension()",
      "begin_line": 535,
      "end_line": 535,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getTrace()",
      "begin_line": 538,
      "end_line": 549,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 44)",
        "(line 540,col 9)-(line 540,col 47)",
        "(line 541,col 9)-(line 543,col 8)",
        "(line 544,col 9)-(line 544,col 25)",
        "(line 545,col 9)-(line 547,col 9)",
        "(line 548,col 9)-(line 548,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.operate(double[])",
      "begin_line": 552,
      "end_line": 569,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 44)",
        "(line 554,col 9)-(line 554,col 47)",
        "(line 555,col 9)-(line 557,col 9)",
        "(line 559,col 9)-(line 559,col 47)",
        "(line 560,col 9)-(line 566,col 9)",
        "(line 568,col 9)-(line 568,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.operate(org.apache.commons.math.linear.RealVector)",
      "begin_line": 572,
      "end_line": 593,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 573,col 9)-(line 592,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(double[])",
      "begin_line": 596,
      "end_line": 614,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 44)",
        "(line 599,col 9)-(line 599,col 47)",
        "(line 600,col 9)-(line 602,col 9)",
        "(line 604,col 9)-(line 604,col 47)",
        "(line 605,col 9)-(line 611,col 9)",
        "(line 613,col 9)-(line 613,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 617,
      "end_line": 639,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 618,col 9)-(line 638,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 642,
      "end_line": 654,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 643,col 9)-(line 643,col 46)",
        "(line 644,col 9)-(line 644,col 49)",
        "(line 645,col 9)-(line 645,col 66)",
        "(line 646,col 9)-(line 652,col 9)",
        "(line 653,col 9)-(line 653,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 657,
      "end_line": 667,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 658,col 9)-(line 658,col 46)",
        "(line 659,col 9)-(line 659,col 49)",
        "(line 660,col 9)-(line 660,col 66)",
        "(line 661,col 9)-(line 665,col 9)",
        "(line 666,col 9)-(line 666,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 670,
      "end_line": 684,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 88)",
        "(line 674,col 9)-(line 675,col 64)",
        "(line 676,col 9)-(line 682,col 9)",
        "(line 683,col 9)-(line 683,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 687,
      "end_line": 699,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 88)",
        "(line 691,col 9)-(line 692,col 64)",
        "(line 693,col 9)-(line 697,col 9)",
        "(line 698,col 9)-(line 698,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 702,
      "end_line": 714,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 703,col 9)-(line 703,col 46)",
        "(line 704,col 9)-(line 704,col 49)",
        "(line 705,col 9)-(line 705,col 66)",
        "(line 706,col 9)-(line 712,col 9)",
        "(line 713,col 9)-(line 713,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 717,
      "end_line": 727,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 718,col 9)-(line 718,col 46)",
        "(line 719,col 9)-(line 719,col 49)",
        "(line 720,col 9)-(line 720,col 66)",
        "(line 721,col 9)-(line 725,col 9)",
        "(line 726,col 9)-(line 726,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 730,
      "end_line": 744,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 733,col 9)-(line 733,col 88)",
        "(line 734,col 9)-(line 735,col 64)",
        "(line 736,col 9)-(line 742,col 9)",
        "(line 743,col 9)-(line 743,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 747,
      "end_line": 759,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 750,col 9)-(line 750,col 88)",
        "(line 751,col 9)-(line 752,col 64)",
        "(line 753,col 9)-(line 757,col 9)",
        "(line 758,col 9)-(line 758,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 762,
      "end_line": 764,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 763,col 9)-(line 763,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 767,
      "end_line": 769,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 768,col 9)-(line 768,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 772,
      "end_line": 776,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 779,
      "end_line": 783,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 782,col 9)-(line 782,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.toString()",
      "begin_line": 789,
      "end_line": 814,
      "comment": "\n     * Get a string representation for this matrix.\n     * @return a string representation for this matrix\n     ",
      "child_ranges": [
        "(line 791,col 9)-(line 791,col 44)",
        "(line 792,col 9)-(line 792,col 47)",
        "(line 793,col 9)-(line 793,col 52)",
        "(line 794,col 9)-(line 794,col 52)",
        "(line 795,col 9)-(line 795,col 92)",
        "(line 796,col 9)-(line 796,col 47)",
        "(line 798,col 9)-(line 810,col 9)",
        "(line 812,col 9)-(line 812,col 24)",
        "(line 813,col 9)-(line 813,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.equals(java.lang.Object)",
      "begin_line": 824,
      "end_line": 846,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eRealMatrix\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.\n     *\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 826,col 9)-(line 828,col 9)",
        "(line 829,col 9)-(line 831,col 9)",
        "(line 832,col 9)-(line 832,col 43)",
        "(line 833,col 9)-(line 833,col 44)",
        "(line 834,col 9)-(line 834,col 47)",
        "(line 835,col 9)-(line 837,col 9)",
        "(line 838,col 9)-(line 844,col 9)",
        "(line 845,col 9)-(line 845,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.hashCode()",
      "begin_line": 853,
      "end_line": 867,
      "comment": "\n     * Computes a hashcode for the matrix.\n     *\n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 855,col 9)-(line 855,col 20)",
        "(line 856,col 9)-(line 856,col 44)",
        "(line 857,col 9)-(line 857,col 47)",
        "(line 858,col 9)-(line 858,col 31)",
        "(line 859,col 9)-(line 859,col 31)",
        "(line 860,col 9)-(line 865,col 9)",
        "(line 866,col 9)-(line 866,col 19)"
      ]
    }
  ]
}