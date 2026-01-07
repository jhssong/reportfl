{
  "filepath": "/tmp/Math-99b/src/java/org/apache/commons/math/linear/AbstractRealMatrix.java",
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
      "end_line": 1248,
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
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-893f9f7c-6524-4ec4-b3b4-a3865b0a11a2.start(int, int, int, int, int, int)",
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
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-7715abdb-b90f-4cd5-ab15-15bb466d2aba.visit(int, int, double)",
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
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-94b8d0df-9775-4736-afed-e84edd54dab3.end()",
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
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-85155613-5963-458c-95c4-98aa3da901bc.start(int, int, int, int, int, int)",
      "begin_line": 253,
      "end_line": 257,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 256,col 17)-(line 256,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-ed3edb5f-0f97-4fbf-a3a8-5b50ed5ebe28.visit(int, int, double)",
      "begin_line": 260,
      "end_line": 262,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 261,col 17)-(line 261,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-3c2117e6-5e9d-4439-8718-1695dd5f620a.end()",
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
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-b070f34f-aa74-4151-8abd-29dca7ef1396.visit(int, int, double)",
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
      "end_line": 363,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 70)",
        "(line 325,col 9)-(line 325,col 55)",
        "(line 326,col 9)-(line 326,col 61)",
        "(line 327,col 9)-(line 334,col 9)",
        "(line 337,col 9)-(line 361,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 340,
      "end_line": 340,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "startRow"
      ],
      "begin_line": 343,
      "end_line": 343,
      "comment": " Initial row index. "
    },
    {
      "type": "field",
      "varNames": [
        "startColumn"
      ],
      "begin_line": 346,
      "end_line": 346,
      "comment": " Initial column index. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-91ebb341-e25c-4742-b383-9cbe46251566.start(int, int, int, int, int, int)",
      "begin_line": 349,
      "end_line": 354,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 352,col 17)-(line 352,col 44)",
        "(line 353,col 17)-(line 353,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-f68b6ac8-a977-4492-ac38-241cd0f4f7c3.visit(int, int, double)",
      "begin_line": 357,
      "end_line": 359,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 358,col 17)-(line 358,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copySubMatrix(int[], int[], double[][])",
      "begin_line": 366,
      "end_line": 389,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 59)",
        "(line 371,col 9)-(line 379,col 9)",
        "(line 382,col 9)-(line 387,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 392,
      "end_line": 429,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 43)",
        "(line 396,col 9)-(line 399,col 9)",
        "(line 401,col 9)-(line 401,col 46)",
        "(line 402,col 9)-(line 405,col 9)",
        "(line 407,col 9)-(line 414,col 9)",
        "(line 416,col 9)-(line 416,col 27)",
        "(line 417,col 9)-(line 417,col 33)",
        "(line 418,col 9)-(line 418,col 39)",
        "(line 419,col 9)-(line 419,col 45)",
        "(line 421,col 9)-(line 425,col 9)",
        "(line 427,col 9)-(line 427,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowMatrix(int)",
      "begin_line": 432,
      "end_line": 444,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 27)",
        "(line 436,col 9)-(line 436,col 47)",
        "(line 437,col 9)-(line 437,col 54)",
        "(line 438,col 9)-(line 440,col 9)",
        "(line 442,col 9)-(line 442,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRowMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 447,
      "end_line": 465,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 27)",
        "(line 451,col 9)-(line 451,col 47)",
        "(line 452,col 9)-(line 460,col 9)",
        "(line 461,col 9)-(line 463,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnMatrix(int)",
      "begin_line": 468,
      "end_line": 480,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 33)",
        "(line 472,col 9)-(line 472,col 44)",
        "(line 473,col 9)-(line 473,col 54)",
        "(line 474,col 9)-(line 476,col 9)",
        "(line 478,col 9)-(line 478,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 483,
      "end_line": 501,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 33)",
        "(line 487,col 9)-(line 487,col 44)",
        "(line 488,col 9)-(line 496,col 9)",
        "(line 497,col 9)-(line 499,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowVector(int)",
      "begin_line": 504,
      "end_line": 507,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRowVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 510,
      "end_line": 526,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 513,col 9)-(line 513,col 27)",
        "(line 514,col 9)-(line 514,col 47)",
        "(line 515,col 9)-(line 521,col 9)",
        "(line 522,col 9)-(line 524,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnVector(int)",
      "begin_line": 529,
      "end_line": 532,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumnVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 535,
      "end_line": 551,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 33)",
        "(line 539,col 9)-(line 539,col 44)",
        "(line 540,col 9)-(line 546,col 9)",
        "(line 547,col 9)-(line 549,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRow(int)",
      "begin_line": 554,
      "end_line": 566,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 27)",
        "(line 558,col 9)-(line 558,col 47)",
        "(line 559,col 9)-(line 559,col 47)",
        "(line 560,col 9)-(line 562,col 9)",
        "(line 564,col 9)-(line 564,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRow(int, double[])",
      "begin_line": 569,
      "end_line": 585,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 27)",
        "(line 573,col 9)-(line 573,col 47)",
        "(line 574,col 9)-(line 580,col 9)",
        "(line 581,col 9)-(line 583,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumn(int)",
      "begin_line": 588,
      "end_line": 600,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 33)",
        "(line 592,col 9)-(line 592,col 44)",
        "(line 593,col 9)-(line 593,col 47)",
        "(line 594,col 9)-(line 596,col 9)",
        "(line 598,col 9)-(line 598,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumn(int, double[])",
      "begin_line": 603,
      "end_line": 619,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 606,col 9)-(line 606,col 33)",
        "(line 607,col 9)-(line 607,col 44)",
        "(line 608,col 9)-(line 614,col 9)",
        "(line 615,col 9)-(line 617,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getEntry(int, int)",
      "begin_line": 622,
      "end_line": 623,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setEntry(int, int, double)",
      "begin_line": 626,
      "end_line": 627,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.addToEntry(int, int, double)",
      "begin_line": 630,
      "end_line": 631,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 634,
      "end_line": 635,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.transpose()",
      "begin_line": 638,
      "end_line": 657,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 640,col 9)-(line 640,col 44)",
        "(line 641,col 9)-(line 641,col 47)",
        "(line 642,col 9)-(line 642,col 58)",
        "(line 643,col 9)-(line 653,col 11)",
        "(line 655,col 9)-(line 655,col 19)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 646,
      "end_line": 646,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-d5ab68e3-7d47-417a-aa0b-256a2a1b7565.visit(int, int, double)",
      "begin_line": 649,
      "end_line": 651,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 650,col 17)-(line 650,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.inverse()",
      "begin_line": 660,
      "end_line": 667,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 663,col 9)-(line 665,col 9)",
        "(line 666,col 9)-(line 666,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getDeterminant()",
      "begin_line": 670,
      "end_line": 674,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.isSquare()",
      "begin_line": 677,
      "end_line": 679,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.isSingular()",
      "begin_line": 682,
      "end_line": 688,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 684,col 9)-(line 686,col 8)",
        "(line 687,col 9)-(line 687,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowDimension()",
      "begin_line": 691,
      "end_line": 691,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnDimension()",
      "begin_line": 694,
      "end_line": 694,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getTrace()",
      "begin_line": 697,
      "end_line": 709,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 699,col 9)-(line 699,col 44)",
        "(line 700,col 9)-(line 700,col 47)",
        "(line 701,col 9)-(line 703,col 8)",
        "(line 704,col 9)-(line 704,col 25)",
        "(line 705,col 9)-(line 707,col 9)",
        "(line 708,col 9)-(line 708,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.operate(double[])",
      "begin_line": 712,
      "end_line": 736,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 715,col 9)-(line 715,col 44)",
        "(line 716,col 9)-(line 716,col 47)",
        "(line 717,col 9)-(line 723,col 9)",
        "(line 725,col 9)-(line 725,col 47)",
        "(line 726,col 9)-(line 732,col 9)",
        "(line 734,col 9)-(line 734,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.operate(org.apache.commons.math.linear.RealVector)",
      "begin_line": 739,
      "end_line": 765,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 741,col 9)-(line 764,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(double[])",
      "begin_line": 768,
      "end_line": 792,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 771,col 9)-(line 771,col 44)",
        "(line 772,col 9)-(line 772,col 47)",
        "(line 773,col 9)-(line 779,col 9)",
        "(line 781,col 9)-(line 781,col 47)",
        "(line 782,col 9)-(line 788,col 9)",
        "(line 790,col 9)-(line 790,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 795,
      "end_line": 823,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 797,col 9)-(line 822,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 826,
      "end_line": 840,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 828,col 9)-(line 828,col 46)",
        "(line 829,col 9)-(line 829,col 49)",
        "(line 830,col 9)-(line 830,col 66)",
        "(line 831,col 9)-(line 837,col 9)",
        "(line 838,col 9)-(line 838,col 18)",
        "(line 839,col 9)-(line 839,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 843,
      "end_line": 854,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 845,col 9)-(line 845,col 46)",
        "(line 846,col 9)-(line 846,col 49)",
        "(line 847,col 9)-(line 847,col 66)",
        "(line 848,col 9)-(line 852,col 9)",
        "(line 853,col 9)-(line 853,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 857,
      "end_line": 873,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 861,col 9)-(line 861,col 70)",
        "(line 862,col 9)-(line 863,col 64)",
        "(line 864,col 9)-(line 870,col 9)",
        "(line 871,col 9)-(line 871,col 18)",
        "(line 872,col 9)-(line 872,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 876,
      "end_line": 889,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 880,col 9)-(line 880,col 70)",
        "(line 881,col 9)-(line 882,col 64)",
        "(line 883,col 9)-(line 887,col 9)",
        "(line 888,col 9)-(line 888,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 892,
      "end_line": 906,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 894,col 9)-(line 894,col 46)",
        "(line 895,col 9)-(line 895,col 49)",
        "(line 896,col 9)-(line 896,col 66)",
        "(line 897,col 9)-(line 903,col 9)",
        "(line 904,col 9)-(line 904,col 18)",
        "(line 905,col 9)-(line 905,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 909,
      "end_line": 920,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 911,col 9)-(line 911,col 46)",
        "(line 912,col 9)-(line 912,col 49)",
        "(line 913,col 9)-(line 913,col 66)",
        "(line 914,col 9)-(line 918,col 9)",
        "(line 919,col 9)-(line 919,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 923,
      "end_line": 939,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 927,col 9)-(line 927,col 70)",
        "(line 928,col 9)-(line 929,col 64)",
        "(line 930,col 9)-(line 936,col 9)",
        "(line 937,col 9)-(line 937,col 18)",
        "(line 938,col 9)-(line 938,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 942,
      "end_line": 955,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 946,col 9)-(line 946,col 70)",
        "(line 947,col 9)-(line 948,col 64)",
        "(line 949,col 9)-(line 953,col 9)",
        "(line 954,col 9)-(line 954,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 958,
      "end_line": 961,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 960,col 9)-(line 960,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 964,
      "end_line": 967,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 966,col 9)-(line 966,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 970,
      "end_line": 975,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 974,col 9)-(line 974,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 978,
      "end_line": 983,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 982,col 9)-(line 982,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.solve(double[])",
      "begin_line": 986,
      "end_line": 993,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 989,col 9)-(line 991,col 9)",
        "(line 992,col 9)-(line 992,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 996,
      "end_line": 1003,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 999,col 9)-(line 1001,col 9)",
        "(line 1002,col 9)-(line 1002,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.luDecompose()",
      "begin_line": 1024,
      "end_line": 1030,
      "comment": "\n     * Computes a new\n     * \u003ca href\u003d\"http://www.math.gatech.edu/~bourbaki/math2601/Web-notes/2num.pdf\"\u003e\n     * LU decomposition\u003c/a\u003e for this matrix, storing the result for use by other methods.\n     * \u003cp\u003e\n     * \u003cstrong\u003eImplementation Note\u003c/strong\u003e:\u003cbr\u003e\n     * Uses \u003ca href\u003d\"http://www.damtp.cam.ac.uk/user/fdl/people/sd/lectures/nummeth98/linear.htm\"\u003e\n     * Crout\u0027s algorithm\u003c/a\u003e, with partial pivoting.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note\u003c/strong\u003e:\u003cbr\u003e\n     * This method should rarely be invoked directly. Its only use is\n     * to force recomputation of the LU decomposition when changes have been\n     * made to the underlying data using direct array references. Changes\n     * made using setXxx methods will trigger recomputation when needed\n     * automatically.\u003c/p\u003e\n     *\n     * @throws InvalidMatrixException if the matrix is non-square or singular.\n     * @deprecated as of release 2.0, replaced by {@link LUDecomposition}\n     ",
      "child_ranges": [
        "(line 1027,col 9)-(line 1029,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.toString()",
      "begin_line": 1036,
      "end_line": 1061,
      "comment": "\n     * Get a string representation for this matrix.\n     * @return a string representation for this matrix\n     ",
      "child_ranges": [
        "(line 1037,col 9)-(line 1037,col 44)",
        "(line 1038,col 9)-(line 1038,col 47)",
        "(line 1039,col 9)-(line 1039,col 52)",
        "(line 1040,col 9)-(line 1040,col 52)",
        "(line 1041,col 9)-(line 1041,col 92)",
        "(line 1042,col 9)-(line 1042,col 47)",
        "(line 1044,col 9)-(line 1056,col 9)",
        "(line 1058,col 9)-(line 1058,col 24)",
        "(line 1059,col 9)-(line 1059,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.equals(java.lang.Object)",
      "begin_line": 1071,
      "end_line": 1092,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eRealMatrix\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.\n     * \n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 1072,col 9)-(line 1074,col 9)",
        "(line 1075,col 9)-(line 1077,col 9)",
        "(line 1078,col 9)-(line 1078,col 43)",
        "(line 1079,col 9)-(line 1079,col 44)",
        "(line 1080,col 9)-(line 1080,col 47)",
        "(line 1081,col 9)-(line 1083,col 9)",
        "(line 1084,col 9)-(line 1090,col 9)",
        "(line 1091,col 9)-(line 1091,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.hashCode()",
      "begin_line": 1099,
      "end_line": 1112,
      "comment": "\n     * Computes a hashcode for the matrix.\n     * \n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 1100,col 9)-(line 1100,col 20)",
        "(line 1101,col 9)-(line 1101,col 44)",
        "(line 1102,col 9)-(line 1102,col 47)",
        "(line 1103,col 9)-(line 1103,col 31)",
        "(line 1104,col 9)-(line 1104,col 31)",
        "(line 1105,col 9)-(line 1110,col 9)",
        "(line 1111,col 9)-(line 1111,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.checkRowIndex(int)",
      "begin_line": 1119,
      "end_line": 1124,
      "comment": "\n     * Check if a row index is valid.\n     * @param row row index to check\n     * @exception MatrixIndexException if index is not valid\n     ",
      "child_ranges": [
        "(line 1120,col 9)-(line 1123,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.checkColumnIndex(int)",
      "begin_line": 1131,
      "end_line": 1137,
      "comment": "\n     * Check if a column index is valid.\n     * @param column column index to check\n     * @exception MatrixIndexException if index is not valid\n     ",
      "child_ranges": [
        "(line 1133,col 9)-(line 1136,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.checkSubMatrixIndex(int, int, int, int)",
      "begin_line": 1149,
      "end_line": 1166,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param startRow Initial row index\n     * @param endRow Final row index\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @exception MatrixIndexException  if the indices are not valid\n     ",
      "child_ranges": [
        "(line 1151,col 9)-(line 1151,col 32)",
        "(line 1152,col 9)-(line 1152,col 30)",
        "(line 1153,col 9)-(line 1156,col 9)",
        "(line 1158,col 9)-(line 1158,col 38)",
        "(line 1159,col 9)-(line 1159,col 36)",
        "(line 1160,col 9)-(line 1163,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.checkSubMatrixIndex(int[], int[])",
      "begin_line": 1176,
      "end_line": 1190,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param selectedRows Array of row indices.\n     * @param selectedColumns Array of column indices.\n     * @exception MatrixIndexException if row or column selections are not valid\n     ",
      "child_ranges": [
        "(line 1177,col 9)-(line 1182,col 9)",
        "(line 1184,col 9)-(line 1186,col 9)",
        "(line 1187,col 9)-(line 1189,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.checkAdditionCompatible(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1197,
      "end_line": 1209,
      "comment": "\n     * Check if a matrix is addition compatible with the instance\n     * @param m matrix to check\n     * @exception IllegalArgumentException if matrix is not addition compatible with instance\n     ",
      "child_ranges": [
        "(line 1198,col 9)-(line 1208,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.checkSubtractionCompatible(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1216,
      "end_line": 1228,
      "comment": "\n     * Check if a matrix is subtraction compatible with the instance\n     * @param m matrix to check\n     * @exception IllegalArgumentException if matrix is not subtraction compatible with instance\n     ",
      "child_ranges": [
        "(line 1217,col 9)-(line 1227,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.checkMultiplicationCompatible(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1235,
      "end_line": 1246,
      "comment": "\n     * Check if a matrix is multiplication compatible with the instance\n     * @param m matrix to check\n     * @exception IllegalArgumentException if matrix is not multiplication compatible with instance\n     ",
      "child_ranges": [
        "(line 1236,col 9)-(line 1245,col 9)"
      ]
    }
  ]
}