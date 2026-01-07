{
  "filepath": "/tmp/Math-91b/src/java/org/apache/commons/math/linear/AbstractRealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractRealMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealMatrix",
        "java.io.Serializable"
      ],
      "begin_line": 37,
      "end_line": 1207,
      "comment": "\n * Basic implementation of RealMatrix methods regardless of the underlying storage.\n * \u003cp\u003eAll the methods implemented here use {@link #getEntry(int, int)} to access\n * matrix elements. Derived class can provide faster implementations. \u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "lu"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Cached LU solver.\n     * @deprecated as of release 2.0, since all methods using this are deprecated\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.AbstractRealMatrix()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Creates a matrix with no data\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.AbstractRealMatrix(int, int)",
      "begin_line": 61,
      "end_line": 74,
      "comment": "\n     * Create a new RealMatrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension  the number of rows in the new matrix\n     * @param columnDimension  the number of columns in the new matrix\n     * @throws IllegalArgumentException if row or column dimension is not positive\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 73,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.createMatrix(int, int)",
      "begin_line": 77,
      "end_line": 78,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copy()",
      "begin_line": 81,
      "end_line": 81,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.add(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 84,
      "end_line": 100,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 35)",
        "(line 89,col 9)-(line 89,col 50)",
        "(line 90,col 9)-(line 90,col 53)",
        "(line 91,col 9)-(line 91,col 67)",
        "(line 92,col 9)-(line 96,col 9)",
        "(line 98,col 9)-(line 98,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 103,
      "end_line": 119,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 38)",
        "(line 108,col 9)-(line 108,col 50)",
        "(line 109,col 9)-(line 109,col 53)",
        "(line 110,col 9)-(line 110,col 67)",
        "(line 111,col 9)-(line 115,col 9)",
        "(line 117,col 9)-(line 117,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.scalarAdd(double)",
      "begin_line": 122,
      "end_line": 135,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 50)",
        "(line 125,col 9)-(line 125,col 53)",
        "(line 126,col 9)-(line 126,col 67)",
        "(line 127,col 9)-(line 131,col 9)",
        "(line 133,col 9)-(line 133,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.scalarMultiply(double)",
      "begin_line": 138,
      "end_line": 151,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 50)",
        "(line 141,col 9)-(line 141,col 53)",
        "(line 142,col 9)-(line 142,col 67)",
        "(line 143,col 9)-(line 147,col 9)",
        "(line 149,col 9)-(line 149,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 154,
      "end_line": 176,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 41)",
        "(line 160,col 9)-(line 160,col 44)",
        "(line 161,col 9)-(line 161,col 49)",
        "(line 162,col 9)-(line 162,col 47)",
        "(line 163,col 9)-(line 163,col 58)",
        "(line 164,col 9)-(line 172,col 9)",
        "(line 174,col 9)-(line 174,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 179,
      "end_line": 182,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getData()",
      "begin_line": 185,
      "end_line": 198,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 84)",
        "(line 189,col 9)-(line 194,col 9)",
        "(line 196,col 9)-(line 196,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getNorm()",
      "begin_line": 201,
      "end_line": 240,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 202,col 9)-(line 239,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "endRow"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": " Last row index. "
    },
    {
      "type": "field",
      "varNames": [
        "columnSum"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": " Sum of absolute values on one column. "
    },
    {
      "type": "field",
      "varNames": [
        "maxColSum"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": " Maximal sum across all columns. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-7c434030-c761-4fa7-b2f5-b636371eb21e.start(int, int, int, int, int, int)",
      "begin_line": 217,
      "end_line": 223,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 220,col 17)-(line 220,col 37)",
        "(line 221,col 17)-(line 221,col 32)",
        "(line 222,col 17)-(line 222,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-05171933-95d8-4922-9af5-2b66f057e6c2.visit(int, int, double)",
      "begin_line": 226,
      "end_line": 232,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 227,col 17)-(line 227,col 45)",
        "(line 228,col 17)-(line 231,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-55529972-0d39-4739-a911-ec9c4a51e818.end()",
      "begin_line": 235,
      "end_line": 237,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 236,col 17)-(line 236,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getFrobeniusNorm()",
      "begin_line": 243,
      "end_line": 270,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 244,col 9)-(line 269,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 247,
      "end_line": 247,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 250,
      "end_line": 250,
      "comment": " Sum of squared entries. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-d3ea7941-c88c-458a-abda-4563021fbcc4.start(int, int, int, int, int, int)",
      "begin_line": 253,
      "end_line": 257,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 256,col 17)-(line 256,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-463ed630-fd65-40a5-8cef-3e47615cd4ab.visit(int, int, double)",
      "begin_line": 260,
      "end_line": 262,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 261,col 17)-(line 261,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-3113dfcd-17c1-4643-a29d-7fcab2e98969.end()",
      "begin_line": 265,
      "end_line": 267,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 266,col 17)-(line 266,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 273,
      "end_line": 289,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 70)",
        "(line 279,col 9)-(line 280,col 77)",
        "(line 281,col 9)-(line 285,col 9)",
        "(line 287,col 9)-(line 287,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getSubMatrix(int[], int[])",
      "begin_line": 292,
      "end_line": 315,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 59)",
        "(line 299,col 9)-(line 300,col 70)",
        "(line 301,col 9)-(line 311,col 11)",
        "(line 313,col 9)-(line 313,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 304,
      "end_line": 304,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-1582d30a-d9cc-4551-ae0f-efe2b8f28b29.visit(int, int, double)",
      "begin_line": 307,
      "end_line": 309,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 308,col 17)-(line 308,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copySubMatrix(int, int, int, int, double[][])",
      "begin_line": 318,
      "end_line": 361,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 70)",
        "(line 325,col 9)-(line 325,col 55)",
        "(line 326,col 9)-(line 326,col 61)",
        "(line 327,col 9)-(line 332,col 9)",
        "(line 335,col 9)-(line 359,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 338,
      "end_line": 338,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "startRow"
      ],
      "begin_line": 341,
      "end_line": 341,
      "comment": " Initial row index. "
    },
    {
      "type": "field",
      "varNames": [
        "startColumn"
      ],
      "begin_line": 344,
      "end_line": 344,
      "comment": " Initial column index. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-175905a2-a12d-4624-a7bd-1a8d12c8c61e.start(int, int, int, int, int, int)",
      "begin_line": 347,
      "end_line": 352,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 350,col 17)-(line 350,col 44)",
        "(line 351,col 17)-(line 351,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-b704a025-3545-467e-8114-29f338694cde.visit(int, int, double)",
      "begin_line": 355,
      "end_line": 357,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 356,col 17)-(line 356,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copySubMatrix(int[], int[], double[][])",
      "begin_line": 364,
      "end_line": 385,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 59)",
        "(line 369,col 9)-(line 375,col 9)",
        "(line 378,col 9)-(line 383,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 388,
      "end_line": 422,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 43)",
        "(line 392,col 9)-(line 394,col 9)",
        "(line 396,col 9)-(line 396,col 46)",
        "(line 397,col 9)-(line 399,col 9)",
        "(line 401,col 9)-(line 407,col 9)",
        "(line 409,col 9)-(line 409,col 27)",
        "(line 410,col 9)-(line 410,col 33)",
        "(line 411,col 9)-(line 411,col 39)",
        "(line 412,col 9)-(line 412,col 45)",
        "(line 414,col 9)-(line 418,col 9)",
        "(line 420,col 9)-(line 420,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowMatrix(int)",
      "begin_line": 425,
      "end_line": 437,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 27)",
        "(line 429,col 9)-(line 429,col 47)",
        "(line 430,col 9)-(line 430,col 54)",
        "(line 431,col 9)-(line 433,col 9)",
        "(line 435,col 9)-(line 435,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRowMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 440,
      "end_line": 455,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 27)",
        "(line 444,col 9)-(line 444,col 47)",
        "(line 445,col 9)-(line 450,col 9)",
        "(line 451,col 9)-(line 453,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnMatrix(int)",
      "begin_line": 458,
      "end_line": 470,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 33)",
        "(line 462,col 9)-(line 462,col 44)",
        "(line 463,col 9)-(line 463,col 54)",
        "(line 464,col 9)-(line 466,col 9)",
        "(line 468,col 9)-(line 468,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 473,
      "end_line": 488,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 33)",
        "(line 477,col 9)-(line 477,col 44)",
        "(line 478,col 9)-(line 483,col 9)",
        "(line 484,col 9)-(line 486,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowVector(int)",
      "begin_line": 491,
      "end_line": 494,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRowVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 497,
      "end_line": 511,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 27)",
        "(line 501,col 9)-(line 501,col 47)",
        "(line 502,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 509,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnVector(int)",
      "begin_line": 514,
      "end_line": 517,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumnVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 520,
      "end_line": 534,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 523,col 9)-(line 523,col 33)",
        "(line 524,col 9)-(line 524,col 44)",
        "(line 525,col 9)-(line 529,col 9)",
        "(line 530,col 9)-(line 532,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRow(int)",
      "begin_line": 537,
      "end_line": 549,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 27)",
        "(line 541,col 9)-(line 541,col 47)",
        "(line 542,col 9)-(line 542,col 47)",
        "(line 543,col 9)-(line 545,col 9)",
        "(line 547,col 9)-(line 547,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRow(int, double[])",
      "begin_line": 552,
      "end_line": 566,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 27)",
        "(line 556,col 9)-(line 556,col 47)",
        "(line 557,col 9)-(line 561,col 9)",
        "(line 562,col 9)-(line 564,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumn(int)",
      "begin_line": 569,
      "end_line": 581,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 33)",
        "(line 573,col 9)-(line 573,col 44)",
        "(line 574,col 9)-(line 574,col 47)",
        "(line 575,col 9)-(line 577,col 9)",
        "(line 579,col 9)-(line 579,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumn(int, double[])",
      "begin_line": 584,
      "end_line": 598,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 33)",
        "(line 588,col 9)-(line 588,col 44)",
        "(line 589,col 9)-(line 593,col 9)",
        "(line 594,col 9)-(line 596,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getEntry(int, int)",
      "begin_line": 601,
      "end_line": 602,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setEntry(int, int, double)",
      "begin_line": 605,
      "end_line": 606,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.addToEntry(int, int, double)",
      "begin_line": 609,
      "end_line": 610,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 613,
      "end_line": 614,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.transpose()",
      "begin_line": 617,
      "end_line": 636,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 619,col 9)-(line 619,col 44)",
        "(line 620,col 9)-(line 620,col 47)",
        "(line 621,col 9)-(line 621,col 58)",
        "(line 622,col 9)-(line 632,col 11)",
        "(line 634,col 9)-(line 634,col 19)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 625,
      "end_line": 625,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-a42db5db-2e6a-449f-8c4b-72953ed8452c.visit(int, int, double)",
      "begin_line": 628,
      "end_line": 630,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 629,col 17)-(line 629,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.inverse()",
      "begin_line": 639,
      "end_line": 646,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 642,col 9)-(line 644,col 9)",
        "(line 645,col 9)-(line 645,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getDeterminant()",
      "begin_line": 649,
      "end_line": 653,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.isSquare()",
      "begin_line": 656,
      "end_line": 658,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.isSingular()",
      "begin_line": 661,
      "end_line": 667,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 663,col 9)-(line 665,col 8)",
        "(line 666,col 9)-(line 666,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowDimension()",
      "begin_line": 670,
      "end_line": 670,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnDimension()",
      "begin_line": 673,
      "end_line": 673,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getTrace()",
      "begin_line": 676,
      "end_line": 688,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 44)",
        "(line 679,col 9)-(line 679,col 47)",
        "(line 680,col 9)-(line 682,col 8)",
        "(line 683,col 9)-(line 683,col 25)",
        "(line 684,col 9)-(line 686,col 9)",
        "(line 687,col 9)-(line 687,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.operate(double[])",
      "begin_line": 691,
      "end_line": 713,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 694,col 9)-(line 694,col 44)",
        "(line 695,col 9)-(line 695,col 47)",
        "(line 696,col 9)-(line 700,col 9)",
        "(line 702,col 9)-(line 702,col 47)",
        "(line 703,col 9)-(line 709,col 9)",
        "(line 711,col 9)-(line 711,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.operate(org.apache.commons.math.linear.RealVector)",
      "begin_line": 716,
      "end_line": 740,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 718,col 9)-(line 739,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(double[])",
      "begin_line": 743,
      "end_line": 765,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 746,col 9)-(line 746,col 44)",
        "(line 747,col 9)-(line 747,col 47)",
        "(line 748,col 9)-(line 752,col 9)",
        "(line 754,col 9)-(line 754,col 47)",
        "(line 755,col 9)-(line 761,col 9)",
        "(line 763,col 9)-(line 763,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 768,
      "end_line": 794,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 770,col 9)-(line 793,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 797,
      "end_line": 811,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 799,col 9)-(line 799,col 46)",
        "(line 800,col 9)-(line 800,col 49)",
        "(line 801,col 9)-(line 801,col 66)",
        "(line 802,col 9)-(line 808,col 9)",
        "(line 809,col 9)-(line 809,col 18)",
        "(line 810,col 9)-(line 810,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 814,
      "end_line": 825,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 816,col 9)-(line 816,col 46)",
        "(line 817,col 9)-(line 817,col 49)",
        "(line 818,col 9)-(line 818,col 66)",
        "(line 819,col 9)-(line 823,col 9)",
        "(line 824,col 9)-(line 824,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 828,
      "end_line": 844,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 832,col 9)-(line 832,col 70)",
        "(line 833,col 9)-(line 834,col 64)",
        "(line 835,col 9)-(line 841,col 9)",
        "(line 842,col 9)-(line 842,col 18)",
        "(line 843,col 9)-(line 843,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 847,
      "end_line": 860,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 851,col 9)-(line 851,col 70)",
        "(line 852,col 9)-(line 853,col 64)",
        "(line 854,col 9)-(line 858,col 9)",
        "(line 859,col 9)-(line 859,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 863,
      "end_line": 877,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 865,col 9)-(line 865,col 46)",
        "(line 866,col 9)-(line 866,col 49)",
        "(line 867,col 9)-(line 867,col 66)",
        "(line 868,col 9)-(line 874,col 9)",
        "(line 875,col 9)-(line 875,col 18)",
        "(line 876,col 9)-(line 876,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 880,
      "end_line": 891,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 882,col 9)-(line 882,col 46)",
        "(line 883,col 9)-(line 883,col 49)",
        "(line 884,col 9)-(line 884,col 66)",
        "(line 885,col 9)-(line 889,col 9)",
        "(line 890,col 9)-(line 890,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 894,
      "end_line": 910,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 898,col 9)-(line 898,col 70)",
        "(line 899,col 9)-(line 900,col 64)",
        "(line 901,col 9)-(line 907,col 9)",
        "(line 908,col 9)-(line 908,col 18)",
        "(line 909,col 9)-(line 909,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 913,
      "end_line": 926,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 917,col 9)-(line 917,col 70)",
        "(line 918,col 9)-(line 919,col 64)",
        "(line 920,col 9)-(line 924,col 9)",
        "(line 925,col 9)-(line 925,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 929,
      "end_line": 932,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 931,col 9)-(line 931,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 935,
      "end_line": 938,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 937,col 9)-(line 937,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 941,
      "end_line": 946,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 945,col 9)-(line 945,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 949,
      "end_line": 954,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 953,col 9)-(line 953,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.solve(double[])",
      "begin_line": 957,
      "end_line": 964,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 960,col 9)-(line 962,col 9)",
        "(line 963,col 9)-(line 963,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 967,
      "end_line": 974,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 970,col 9)-(line 972,col 9)",
        "(line 973,col 9)-(line 973,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.luDecompose()",
      "begin_line": 995,
      "end_line": 1001,
      "comment": "\n     * Computes a new\n     * \u003ca href\u003d\"http://www.math.gatech.edu/~bourbaki/math2601/Web-notes/2num.pdf\"\u003e\n     * LU decomposition\u003c/a\u003e for this matrix, storing the result for use by other methods.\n     * \u003cp\u003e\n     * \u003cstrong\u003eImplementation Note\u003c/strong\u003e:\u003cbr\u003e\n     * Uses \u003ca href\u003d\"http://www.damtp.cam.ac.uk/user/fdl/people/sd/lectures/nummeth98/linear.htm\"\u003e\n     * Crout\u0027s algorithm\u003c/a\u003e, with partial pivoting.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note\u003c/strong\u003e:\u003cbr\u003e\n     * This method should rarely be invoked directly. Its only use is\n     * to force recomputation of the LU decomposition when changes have been\n     * made to the underlying data using direct array references. Changes\n     * made using setXxx methods will trigger recomputation when needed\n     * automatically.\u003c/p\u003e\n     *\n     * @throws InvalidMatrixException if the matrix is non-square or singular.\n     * @deprecated as of release 2.0, replaced by {@link LUDecomposition}\n     ",
      "child_ranges": [
        "(line 998,col 9)-(line 1000,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.toString()",
      "begin_line": 1007,
      "end_line": 1032,
      "comment": "\n     * Get a string representation for this matrix.\n     * @return a string representation for this matrix\n     ",
      "child_ranges": [
        "(line 1008,col 9)-(line 1008,col 44)",
        "(line 1009,col 9)-(line 1009,col 47)",
        "(line 1010,col 9)-(line 1010,col 52)",
        "(line 1011,col 9)-(line 1011,col 52)",
        "(line 1012,col 9)-(line 1012,col 92)",
        "(line 1013,col 9)-(line 1013,col 47)",
        "(line 1015,col 9)-(line 1027,col 9)",
        "(line 1029,col 9)-(line 1029,col 24)",
        "(line 1030,col 9)-(line 1030,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.equals(java.lang.Object)",
      "begin_line": 1042,
      "end_line": 1063,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eRealMatrix\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.\n     * \n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 1043,col 9)-(line 1045,col 9)",
        "(line 1046,col 9)-(line 1048,col 9)",
        "(line 1049,col 9)-(line 1049,col 43)",
        "(line 1050,col 9)-(line 1050,col 44)",
        "(line 1051,col 9)-(line 1051,col 47)",
        "(line 1052,col 9)-(line 1054,col 9)",
        "(line 1055,col 9)-(line 1061,col 9)",
        "(line 1062,col 9)-(line 1062,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.hashCode()",
      "begin_line": 1070,
      "end_line": 1083,
      "comment": "\n     * Computes a hashcode for the matrix.\n     * \n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 1071,col 9)-(line 1071,col 20)",
        "(line 1072,col 9)-(line 1072,col 44)",
        "(line 1073,col 9)-(line 1073,col 47)",
        "(line 1074,col 9)-(line 1074,col 31)",
        "(line 1075,col 9)-(line 1075,col 31)",
        "(line 1076,col 9)-(line 1081,col 9)",
        "(line 1082,col 9)-(line 1082,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.checkRowIndex(int)",
      "begin_line": 1090,
      "end_line": 1095,
      "comment": "\n     * Check if a row index is valid.\n     * @param row row index to check\n     * @exception MatrixIndexException if index is not valid\n     ",
      "child_ranges": [
        "(line 1091,col 9)-(line 1094,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.checkColumnIndex(int)",
      "begin_line": 1102,
      "end_line": 1108,
      "comment": "\n     * Check if a column index is valid.\n     * @param column column index to check\n     * @exception MatrixIndexException if index is not valid\n     ",
      "child_ranges": [
        "(line 1104,col 9)-(line 1107,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.checkSubMatrixIndex(int, int, int, int)",
      "begin_line": 1120,
      "end_line": 1137,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param startRow Initial row index\n     * @param endRow Final row index\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @exception MatrixIndexException  if the indices are not valid\n     ",
      "child_ranges": [
        "(line 1122,col 9)-(line 1122,col 32)",
        "(line 1123,col 9)-(line 1123,col 30)",
        "(line 1124,col 9)-(line 1127,col 9)",
        "(line 1129,col 9)-(line 1129,col 38)",
        "(line 1130,col 9)-(line 1130,col 36)",
        "(line 1131,col 9)-(line 1134,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.checkSubMatrixIndex(int[], int[])",
      "begin_line": 1147,
      "end_line": 1161,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param selectedRows Array of row indices.\n     * @param selectedColumns Array of column indices.\n     * @exception MatrixIndexException if row or column selections are not valid\n     ",
      "child_ranges": [
        "(line 1148,col 9)-(line 1153,col 9)",
        "(line 1155,col 9)-(line 1157,col 9)",
        "(line 1158,col 9)-(line 1160,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.checkAdditionCompatible(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1168,
      "end_line": 1176,
      "comment": "\n     * Check if a matrix is addition compatible with the instance\n     * @param m matrix to check\n     * @exception IllegalArgumentException if matrix is not addition compatible with instance\n     ",
      "child_ranges": [
        "(line 1169,col 9)-(line 1175,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.checkSubtractionCompatible(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1183,
      "end_line": 1191,
      "comment": "\n     * Check if a matrix is subtraction compatible with the instance\n     * @param m matrix to check\n     * @exception IllegalArgumentException if matrix is not subtraction compatible with instance\n     ",
      "child_ranges": [
        "(line 1184,col 9)-(line 1190,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.checkMultiplicationCompatible(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1198,
      "end_line": 1205,
      "comment": "\n     * Check if a matrix is multiplication compatible with the instance\n     * @param m matrix to check\n     * @exception IllegalArgumentException if matrix is not multiplication compatible with instance\n     ",
      "child_ranges": [
        "(line 1199,col 9)-(line 1204,col 9)"
      ]
    }
  ]
}