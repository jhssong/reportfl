{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/AbstractRealMatrix.java",
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
      "end_line": 993,
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
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-0e39e81f-ffbe-4286-96d6-8ed5a4d4989e.start(int, int, int, int, int, int)",
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
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-b0d5021f-8a2f-4b73-8263-d5ff9fac00ad.visit(int, int, double)",
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
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-9dd86100-0550-4074-92e4-eb3338efe85a.end()",
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
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-db256e5d-219a-4eaa-ba9d-6410a5fb1bf1.start(int, int, int, int, int, int)",
      "begin_line": 286,
      "end_line": 290,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 289,col 17)-(line 289,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-d15f01b8-31fd-40d2-be37-24d1aa3f465d.visit(int, int, double)",
      "begin_line": 293,
      "end_line": 295,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 294,col 17)-(line 294,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-d2804ca8-d949-4586-a3c5-21fab08413b0.end()",
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
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-191ace52-2dea-49f9-8245-43abbb37e6ea.visit(int, int, double)",
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
      "end_line": 387,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 88)",
        "(line 349,col 9)-(line 349,col 55)",
        "(line 350,col 9)-(line 350,col 61)",
        "(line 351,col 9)-(line 354,col 9)",
        "(line 356,col 9)-(line 361,col 9)",
        "(line 363,col 9)-(line 386,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "startRow"
      ],
      "begin_line": 366,
      "end_line": 366,
      "comment": " Initial row index. "
    },
    {
      "type": "field",
      "varNames": [
        "startColumn"
      ],
      "begin_line": 369,
      "end_line": 369,
      "comment": " Initial column index. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-4595c3b4-d8a8-49a5-8e46-ff7b4b015609.start(int, int, int, int, int, int)",
      "begin_line": 372,
      "end_line": 378,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 376,col 17)-(line 376,col 44)",
        "(line 377,col 17)-(line 377,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-eeb8ce27-2a78-442b-b821-4b17c605bc52.visit(int, int, double)",
      "begin_line": 381,
      "end_line": 384,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 383,col 17)-(line 383,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.copySubMatrix(int[], int[], double[][])",
      "begin_line": 390,
      "end_line": 412,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 77)",
        "(line 395,col 9)-(line 395,col 49)",
        "(line 396,col 9)-(line 400,col 9)",
        "(line 402,col 9)-(line 411,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 415,
      "end_line": 445,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 42)",
        "(line 419,col 9)-(line 419,col 43)",
        "(line 420,col 9)-(line 422,col 9)",
        "(line 424,col 9)-(line 424,col 46)",
        "(line 425,col 9)-(line 427,col 9)",
        "(line 429,col 9)-(line 433,col 9)",
        "(line 435,col 9)-(line 435,col 45)",
        "(line 436,col 9)-(line 436,col 51)",
        "(line 437,col 9)-(line 437,col 57)",
        "(line 438,col 9)-(line 438,col 63)",
        "(line 440,col 9)-(line 444,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getRowMatrix(int)",
      "begin_line": 448,
      "end_line": 457,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 45)",
        "(line 450,col 9)-(line 450,col 47)",
        "(line 451,col 9)-(line 451,col 54)",
        "(line 452,col 9)-(line 454,col 9)",
        "(line 456,col 9)-(line 456,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setRowMatrix(int, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 460,
      "end_line": 473,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 45)",
        "(line 463,col 9)-(line 463,col 47)",
        "(line 464,col 9)-(line 469,col 9)",
        "(line 470,col 9)-(line 472,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getColumnMatrix(int)",
      "begin_line": 476,
      "end_line": 486,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 51)",
        "(line 479,col 9)-(line 479,col 44)",
        "(line 480,col 9)-(line 480,col 54)",
        "(line 481,col 9)-(line 483,col 9)",
        "(line 485,col 9)-(line 485,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setColumnMatrix(int, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 489,
      "end_line": 502,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 51)",
        "(line 492,col 9)-(line 492,col 44)",
        "(line 493,col 9)-(line 498,col 9)",
        "(line 499,col 9)-(line 501,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getRowVector(int)",
      "begin_line": 505,
      "end_line": 508,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setRowVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 511,
      "end_line": 522,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 513,col 9)-(line 513,col 45)",
        "(line 514,col 9)-(line 514,col 47)",
        "(line 515,col 9)-(line 518,col 9)",
        "(line 519,col 9)-(line 521,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getColumnVector(int)",
      "begin_line": 525,
      "end_line": 528,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setColumnVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 531,
      "end_line": 542,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 533,col 9)-(line 533,col 51)",
        "(line 534,col 9)-(line 534,col 44)",
        "(line 535,col 9)-(line 538,col 9)",
        "(line 539,col 9)-(line 541,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getRow(int)",
      "begin_line": 545,
      "end_line": 554,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 45)",
        "(line 547,col 9)-(line 547,col 47)",
        "(line 548,col 9)-(line 548,col 47)",
        "(line 549,col 9)-(line 551,col 9)",
        "(line 553,col 9)-(line 553,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setRow(int, double[])",
      "begin_line": 557,
      "end_line": 567,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 45)",
        "(line 560,col 9)-(line 560,col 47)",
        "(line 561,col 9)-(line 563,col 9)",
        "(line 564,col 9)-(line 566,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getColumn(int)",
      "begin_line": 570,
      "end_line": 579,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 571,col 9)-(line 571,col 51)",
        "(line 572,col 9)-(line 572,col 44)",
        "(line 573,col 9)-(line 573,col 47)",
        "(line 574,col 9)-(line 576,col 9)",
        "(line 578,col 9)-(line 578,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setColumn(int, double[])",
      "begin_line": 582,
      "end_line": 592,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 51)",
        "(line 585,col 9)-(line 585,col 44)",
        "(line 586,col 9)-(line 588,col 9)",
        "(line 589,col 9)-(line 591,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.addToEntry(int, int, double)",
      "begin_line": 595,
      "end_line": 599,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 56)",
        "(line 598,col 9)-(line 598,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 602,
      "end_line": 606,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 56)",
        "(line 605,col 9)-(line 605,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.transpose()",
      "begin_line": 609,
      "end_line": 624,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 44)",
        "(line 611,col 9)-(line 611,col 47)",
        "(line 612,col 9)-(line 612,col 58)",
        "(line 613,col 9)-(line 621,col 11)",
        "(line 623,col 9)-(line 623,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.Anonymous-23c3c205-3925-4759-a404-4bcd7237aeac.visit(int, int, double)",
      "begin_line": 616,
      "end_line": 619,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 618,col 17)-(line 618,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.isSquare()",
      "begin_line": 627,
      "end_line": 629,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getRowDimension()",
      "begin_line": 636,
      "end_line": 637,
      "comment": "\n     * Returns the number of rows of this matrix.\n     *\n     * @return the number of rows.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getColumnDimension()",
      "begin_line": 644,
      "end_line": 645,
      "comment": "\n     * Returns the number of columns of this matrix.\n     *\n     * @return the number of columns.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getTrace()",
      "begin_line": 648,
      "end_line": 659,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 44)",
        "(line 650,col 9)-(line 650,col 47)",
        "(line 651,col 9)-(line 653,col 8)",
        "(line 654,col 9)-(line 654,col 25)",
        "(line 655,col 9)-(line 657,col 9)",
        "(line 658,col 9)-(line 658,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.operate(double[])",
      "begin_line": 662,
      "end_line": 680,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 664,col 9)-(line 664,col 44)",
        "(line 665,col 9)-(line 665,col 47)",
        "(line 666,col 9)-(line 668,col 9)",
        "(line 670,col 9)-(line 670,col 47)",
        "(line 671,col 9)-(line 677,col 9)",
        "(line 679,col 9)-(line 679,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.operate(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 683,
      "end_line": 706,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 686,col 9)-(line 705,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.preMultiply(double[])",
      "begin_line": 709,
      "end_line": 727,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 711,col 9)-(line 711,col 44)",
        "(line 712,col 9)-(line 712,col 47)",
        "(line 713,col 9)-(line 715,col 9)",
        "(line 717,col 9)-(line 717,col 47)",
        "(line 718,col 9)-(line 724,col 9)",
        "(line 726,col 9)-(line 726,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.preMultiply(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 730,
      "end_line": 752,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 731,col 9)-(line 751,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor)",
      "begin_line": 755,
      "end_line": 767,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 756,col 9)-(line 756,col 46)",
        "(line 757,col 9)-(line 757,col 49)",
        "(line 758,col 9)-(line 758,col 66)",
        "(line 759,col 9)-(line 765,col 9)",
        "(line 766,col 9)-(line 766,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor)",
      "begin_line": 770,
      "end_line": 780,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 771,col 9)-(line 771,col 46)",
        "(line 772,col 9)-(line 772,col 49)",
        "(line 773,col 9)-(line 773,col 66)",
        "(line 774,col 9)-(line 778,col 9)",
        "(line 779,col 9)-(line 779,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 783,
      "end_line": 798,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 787,col 9)-(line 787,col 88)",
        "(line 788,col 9)-(line 789,col 64)",
        "(line 790,col 9)-(line 796,col 9)",
        "(line 797,col 9)-(line 797,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 801,
      "end_line": 814,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 805,col 9)-(line 805,col 88)",
        "(line 806,col 9)-(line 807,col 64)",
        "(line 808,col 9)-(line 812,col 9)",
        "(line 813,col 9)-(line 813,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor)",
      "begin_line": 817,
      "end_line": 829,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 818,col 9)-(line 818,col 46)",
        "(line 819,col 9)-(line 819,col 49)",
        "(line 820,col 9)-(line 820,col 66)",
        "(line 821,col 9)-(line 827,col 9)",
        "(line 828,col 9)-(line 828,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor)",
      "begin_line": 832,
      "end_line": 842,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 833,col 9)-(line 833,col 46)",
        "(line 834,col 9)-(line 834,col 49)",
        "(line 835,col 9)-(line 835,col 66)",
        "(line 836,col 9)-(line 840,col 9)",
        "(line 841,col 9)-(line 841,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 845,
      "end_line": 860,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 849,col 9)-(line 849,col 88)",
        "(line 850,col 9)-(line 851,col 64)",
        "(line 852,col 9)-(line 858,col 9)",
        "(line 859,col 9)-(line 859,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 863,
      "end_line": 876,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 867,col 9)-(line 867,col 88)",
        "(line 868,col 9)-(line 869,col 64)",
        "(line 870,col 9)-(line 874,col 9)",
        "(line 875,col 9)-(line 875,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor)",
      "begin_line": 879,
      "end_line": 881,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 880,col 9)-(line 880,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor)",
      "begin_line": 884,
      "end_line": 886,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 885,col 9)-(line 885,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 889,
      "end_line": 895,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 894,col 9)-(line 894,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 898,
      "end_line": 904,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 903,col 9)-(line 903,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.toString()",
      "begin_line": 910,
      "end_line": 918,
      "comment": "\n     * Get a string representation for this matrix.\n     * @return a string representation for this matrix\n     ",
      "child_ranges": [
        "(line 912,col 9)-(line 912,col 54)",
        "(line 913,col 9)-(line 913,col 52)",
        "(line 914,col 9)-(line 914,col 92)",
        "(line 915,col 9)-(line 915,col 35)",
        "(line 916,col 9)-(line 916,col 48)",
        "(line 917,col 9)-(line 917,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.equals(java.lang.Object)",
      "begin_line": 928,
      "end_line": 950,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eRealMatrix\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.\n     *\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 930,col 9)-(line 932,col 9)",
        "(line 933,col 9)-(line 935,col 9)",
        "(line 936,col 9)-(line 936,col 43)",
        "(line 937,col 9)-(line 937,col 44)",
        "(line 938,col 9)-(line 938,col 47)",
        "(line 939,col 9)-(line 941,col 9)",
        "(line 942,col 9)-(line 948,col 9)",
        "(line 949,col 9)-(line 949,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.hashCode()",
      "begin_line": 957,
      "end_line": 971,
      "comment": "\n     * Computes a hashcode for the matrix.\n     *\n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 959,col 9)-(line 959,col 20)",
        "(line 960,col 9)-(line 960,col 44)",
        "(line 961,col 9)-(line 961,col 47)",
        "(line 962,col 9)-(line 962,col 31)",
        "(line 963,col 9)-(line 963,col 31)",
        "(line 964,col 9)-(line 969,col 9)",
        "(line 970,col 9)-(line 970,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.createMatrix(int, int)",
      "begin_line": 980,
      "end_line": 981,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.copy()",
      "begin_line": 984,
      "end_line": 984,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.getEntry(int, int)",
      "begin_line": 987,
      "end_line": 988,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractRealMatrix.setEntry(int, int, double)",
      "begin_line": 991,
      "end_line": 992,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    }
  ]
}