{
  "filepath": "/tmp/Math-94b/src/java/org/apache/commons/math/linear/AbstractRealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractRealMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealMatrix",
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 1244,
      "comment": "\n * Basic implementation of RealMatrix methods regardless of the underlying storage.\n * \u003cp\u003eAll the methods implemented here use {@link #getEntry(int, int)} to access\n * matrix elements. Derived class can provide faster implementations. \u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "lu"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Cached LU solver.\n     * @deprecated as of release 2.0, since all methods using this are deprecated\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.AbstractRealMatrix()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Creates a matrix with no data\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.AbstractRealMatrix(int, int)",
      "begin_line": 57,
      "end_line": 70,
      "comment": "\n     * Create a new RealMatrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension  the number of rows in the new matrix\n     * @param columnDimension  the number of columns in the new matrix\n     * @throws IllegalArgumentException if row or column dimension is not positive\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 69,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.createMatrix(int, int)",
      "begin_line": 73,
      "end_line": 74,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copy()",
      "begin_line": 77,
      "end_line": 77,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.add(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 80,
      "end_line": 96,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 35)",
        "(line 85,col 9)-(line 85,col 50)",
        "(line 86,col 9)-(line 86,col 53)",
        "(line 87,col 9)-(line 87,col 67)",
        "(line 88,col 9)-(line 92,col 9)",
        "(line 94,col 9)-(line 94,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 99,
      "end_line": 115,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 38)",
        "(line 104,col 9)-(line 104,col 50)",
        "(line 105,col 9)-(line 105,col 53)",
        "(line 106,col 9)-(line 106,col 67)",
        "(line 107,col 9)-(line 111,col 9)",
        "(line 113,col 9)-(line 113,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.scalarAdd(double)",
      "begin_line": 118,
      "end_line": 131,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 50)",
        "(line 121,col 9)-(line 121,col 53)",
        "(line 122,col 9)-(line 122,col 67)",
        "(line 123,col 9)-(line 127,col 9)",
        "(line 129,col 9)-(line 129,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.scalarMultiply(double)",
      "begin_line": 134,
      "end_line": 147,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 50)",
        "(line 137,col 9)-(line 137,col 53)",
        "(line 138,col 9)-(line 138,col 67)",
        "(line 139,col 9)-(line 143,col 9)",
        "(line 145,col 9)-(line 145,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 150,
      "end_line": 172,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 41)",
        "(line 156,col 9)-(line 156,col 44)",
        "(line 157,col 9)-(line 157,col 49)",
        "(line 158,col 9)-(line 158,col 47)",
        "(line 159,col 9)-(line 159,col 58)",
        "(line 160,col 9)-(line 168,col 9)",
        "(line 170,col 9)-(line 170,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 175,
      "end_line": 178,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getData()",
      "begin_line": 181,
      "end_line": 194,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 84)",
        "(line 185,col 9)-(line 190,col 9)",
        "(line 192,col 9)-(line 192,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getNorm()",
      "begin_line": 197,
      "end_line": 236,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 198,col 9)-(line 235,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 201,
      "end_line": 201,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "endRow"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": " Last row index. "
    },
    {
      "type": "field",
      "varNames": [
        "columnSum"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": " Sum of absolute values on one column. "
    },
    {
      "type": "field",
      "varNames": [
        "maxColSum"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": " Maximal sum across all columns. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-03772fef-f4a0-44fc-a393-3dff5d8837b2.start(int, int, int, int, int, int)",
      "begin_line": 213,
      "end_line": 219,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 216,col 17)-(line 216,col 37)",
        "(line 217,col 17)-(line 217,col 32)",
        "(line 218,col 17)-(line 218,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-f5dfc55b-0fa3-49ed-8ae8-a2a974277306.visit(int, int, double)",
      "begin_line": 222,
      "end_line": 228,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 223,col 17)-(line 223,col 45)",
        "(line 224,col 17)-(line 227,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-d58b0088-eb2d-4f54-903c-374d464727c5.end()",
      "begin_line": 231,
      "end_line": 233,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 232,col 17)-(line 232,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getFrobeniusNorm()",
      "begin_line": 239,
      "end_line": 266,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 240,col 9)-(line 265,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 243,
      "end_line": 243,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 246,
      "end_line": 246,
      "comment": " Sum of squared entries. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-5680744a-16b5-45e8-8c6b-3333162987e0.start(int, int, int, int, int, int)",
      "begin_line": 249,
      "end_line": 253,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 252,col 17)-(line 252,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-fd2185de-e438-4ea6-bb37-cfb7ead95f28.visit(int, int, double)",
      "begin_line": 256,
      "end_line": 258,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 257,col 17)-(line 257,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-36b403b7-cbfd-43e4-82cc-c65688ea177c.end()",
      "begin_line": 261,
      "end_line": 263,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 262,col 17)-(line 262,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 269,
      "end_line": 285,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 70)",
        "(line 275,col 9)-(line 276,col 77)",
        "(line 277,col 9)-(line 281,col 9)",
        "(line 283,col 9)-(line 283,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getSubMatrix(int[], int[])",
      "begin_line": 288,
      "end_line": 311,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 59)",
        "(line 295,col 9)-(line 296,col 70)",
        "(line 297,col 9)-(line 307,col 11)",
        "(line 309,col 9)-(line 309,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 300,
      "end_line": 300,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-745bb84d-4f99-466e-ad7e-cca4233148a3.visit(int, int, double)",
      "begin_line": 303,
      "end_line": 305,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 304,col 17)-(line 304,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copySubMatrix(int, int, int, int, double[][])",
      "begin_line": 314,
      "end_line": 359,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 70)",
        "(line 321,col 9)-(line 321,col 55)",
        "(line 322,col 9)-(line 322,col 61)",
        "(line 323,col 9)-(line 330,col 9)",
        "(line 333,col 9)-(line 357,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 336,
      "end_line": 336,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "startRow"
      ],
      "begin_line": 339,
      "end_line": 339,
      "comment": " Initial row index. "
    },
    {
      "type": "field",
      "varNames": [
        "startColumn"
      ],
      "begin_line": 342,
      "end_line": 342,
      "comment": " Initial column index. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-77b405b6-9be3-4c30-9746-09f127875531.start(int, int, int, int, int, int)",
      "begin_line": 345,
      "end_line": 350,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 348,col 17)-(line 348,col 44)",
        "(line 349,col 17)-(line 349,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-ad13b68e-8d84-4d72-9339-a7abbe9bb559.visit(int, int, double)",
      "begin_line": 353,
      "end_line": 355,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 354,col 17)-(line 354,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copySubMatrix(int[], int[], double[][])",
      "begin_line": 362,
      "end_line": 385,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 59)",
        "(line 367,col 9)-(line 375,col 9)",
        "(line 378,col 9)-(line 383,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 388,
      "end_line": 425,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 43)",
        "(line 392,col 9)-(line 395,col 9)",
        "(line 397,col 9)-(line 397,col 46)",
        "(line 398,col 9)-(line 401,col 9)",
        "(line 403,col 9)-(line 410,col 9)",
        "(line 412,col 9)-(line 412,col 27)",
        "(line 413,col 9)-(line 413,col 33)",
        "(line 414,col 9)-(line 414,col 39)",
        "(line 415,col 9)-(line 415,col 45)",
        "(line 417,col 9)-(line 421,col 9)",
        "(line 423,col 9)-(line 423,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowMatrix(int)",
      "begin_line": 428,
      "end_line": 440,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 27)",
        "(line 432,col 9)-(line 432,col 47)",
        "(line 433,col 9)-(line 433,col 54)",
        "(line 434,col 9)-(line 436,col 9)",
        "(line 438,col 9)-(line 438,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRowMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 443,
      "end_line": 461,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 27)",
        "(line 447,col 9)-(line 447,col 47)",
        "(line 448,col 9)-(line 456,col 9)",
        "(line 457,col 9)-(line 459,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnMatrix(int)",
      "begin_line": 464,
      "end_line": 476,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 33)",
        "(line 468,col 9)-(line 468,col 44)",
        "(line 469,col 9)-(line 469,col 54)",
        "(line 470,col 9)-(line 472,col 9)",
        "(line 474,col 9)-(line 474,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 479,
      "end_line": 497,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 33)",
        "(line 483,col 9)-(line 483,col 44)",
        "(line 484,col 9)-(line 492,col 9)",
        "(line 493,col 9)-(line 495,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowVector(int)",
      "begin_line": 500,
      "end_line": 503,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRowVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 506,
      "end_line": 522,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 27)",
        "(line 510,col 9)-(line 510,col 47)",
        "(line 511,col 9)-(line 517,col 9)",
        "(line 518,col 9)-(line 520,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnVector(int)",
      "begin_line": 525,
      "end_line": 528,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumnVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 531,
      "end_line": 547,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 33)",
        "(line 535,col 9)-(line 535,col 44)",
        "(line 536,col 9)-(line 542,col 9)",
        "(line 543,col 9)-(line 545,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRow(int)",
      "begin_line": 550,
      "end_line": 562,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 27)",
        "(line 554,col 9)-(line 554,col 47)",
        "(line 555,col 9)-(line 555,col 47)",
        "(line 556,col 9)-(line 558,col 9)",
        "(line 560,col 9)-(line 560,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRow(int, double[])",
      "begin_line": 565,
      "end_line": 581,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 27)",
        "(line 569,col 9)-(line 569,col 47)",
        "(line 570,col 9)-(line 576,col 9)",
        "(line 577,col 9)-(line 579,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumn(int)",
      "begin_line": 584,
      "end_line": 596,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 33)",
        "(line 588,col 9)-(line 588,col 44)",
        "(line 589,col 9)-(line 589,col 47)",
        "(line 590,col 9)-(line 592,col 9)",
        "(line 594,col 9)-(line 594,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumn(int, double[])",
      "begin_line": 599,
      "end_line": 615,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 33)",
        "(line 603,col 9)-(line 603,col 44)",
        "(line 604,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 613,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getEntry(int, int)",
      "begin_line": 618,
      "end_line": 619,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setEntry(int, int, double)",
      "begin_line": 622,
      "end_line": 623,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.addToEntry(int, int, double)",
      "begin_line": 626,
      "end_line": 627,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 630,
      "end_line": 631,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.transpose()",
      "begin_line": 634,
      "end_line": 653,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 44)",
        "(line 637,col 9)-(line 637,col 47)",
        "(line 638,col 9)-(line 638,col 58)",
        "(line 639,col 9)-(line 649,col 11)",
        "(line 651,col 9)-(line 651,col 19)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 642,
      "end_line": 642,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-f113e89d-c3a2-4ad9-98c6-356f2446b6f4.visit(int, int, double)",
      "begin_line": 645,
      "end_line": 647,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 646,col 17)-(line 646,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.inverse()",
      "begin_line": 656,
      "end_line": 663,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 659,col 9)-(line 661,col 9)",
        "(line 662,col 9)-(line 662,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getDeterminant()",
      "begin_line": 666,
      "end_line": 670,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 669,col 9)-(line 669,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.isSquare()",
      "begin_line": 673,
      "end_line": 675,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 674,col 9)-(line 674,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.isSingular()",
      "begin_line": 678,
      "end_line": 684,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 680,col 9)-(line 682,col 8)",
        "(line 683,col 9)-(line 683,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowDimension()",
      "begin_line": 687,
      "end_line": 687,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnDimension()",
      "begin_line": 690,
      "end_line": 690,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getTrace()",
      "begin_line": 693,
      "end_line": 705,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 695,col 9)-(line 695,col 44)",
        "(line 696,col 9)-(line 696,col 47)",
        "(line 697,col 9)-(line 699,col 8)",
        "(line 700,col 9)-(line 700,col 25)",
        "(line 701,col 9)-(line 703,col 9)",
        "(line 704,col 9)-(line 704,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.operate(double[])",
      "begin_line": 708,
      "end_line": 732,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 711,col 9)-(line 711,col 44)",
        "(line 712,col 9)-(line 712,col 47)",
        "(line 713,col 9)-(line 719,col 9)",
        "(line 721,col 9)-(line 721,col 47)",
        "(line 722,col 9)-(line 728,col 9)",
        "(line 730,col 9)-(line 730,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.operate(org.apache.commons.math.linear.RealVector)",
      "begin_line": 735,
      "end_line": 761,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 737,col 9)-(line 760,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(double[])",
      "begin_line": 764,
      "end_line": 788,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 767,col 9)-(line 767,col 44)",
        "(line 768,col 9)-(line 768,col 47)",
        "(line 769,col 9)-(line 775,col 9)",
        "(line 777,col 9)-(line 777,col 47)",
        "(line 778,col 9)-(line 784,col 9)",
        "(line 786,col 9)-(line 786,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 791,
      "end_line": 819,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 793,col 9)-(line 818,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 822,
      "end_line": 836,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 824,col 9)-(line 824,col 46)",
        "(line 825,col 9)-(line 825,col 49)",
        "(line 826,col 9)-(line 826,col 66)",
        "(line 827,col 9)-(line 833,col 9)",
        "(line 834,col 9)-(line 834,col 18)",
        "(line 835,col 9)-(line 835,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 839,
      "end_line": 850,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 841,col 9)-(line 841,col 46)",
        "(line 842,col 9)-(line 842,col 49)",
        "(line 843,col 9)-(line 843,col 66)",
        "(line 844,col 9)-(line 848,col 9)",
        "(line 849,col 9)-(line 849,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 853,
      "end_line": 869,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 857,col 9)-(line 857,col 70)",
        "(line 858,col 9)-(line 859,col 64)",
        "(line 860,col 9)-(line 866,col 9)",
        "(line 867,col 9)-(line 867,col 18)",
        "(line 868,col 9)-(line 868,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 872,
      "end_line": 885,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 876,col 9)-(line 876,col 70)",
        "(line 877,col 9)-(line 878,col 64)",
        "(line 879,col 9)-(line 883,col 9)",
        "(line 884,col 9)-(line 884,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 888,
      "end_line": 902,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 890,col 9)-(line 890,col 46)",
        "(line 891,col 9)-(line 891,col 49)",
        "(line 892,col 9)-(line 892,col 66)",
        "(line 893,col 9)-(line 899,col 9)",
        "(line 900,col 9)-(line 900,col 18)",
        "(line 901,col 9)-(line 901,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 905,
      "end_line": 916,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 907,col 9)-(line 907,col 46)",
        "(line 908,col 9)-(line 908,col 49)",
        "(line 909,col 9)-(line 909,col 66)",
        "(line 910,col 9)-(line 914,col 9)",
        "(line 915,col 9)-(line 915,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 919,
      "end_line": 935,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 923,col 9)-(line 923,col 70)",
        "(line 924,col 9)-(line 925,col 64)",
        "(line 926,col 9)-(line 932,col 9)",
        "(line 933,col 9)-(line 933,col 18)",
        "(line 934,col 9)-(line 934,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 938,
      "end_line": 951,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 942,col 9)-(line 942,col 70)",
        "(line 943,col 9)-(line 944,col 64)",
        "(line 945,col 9)-(line 949,col 9)",
        "(line 950,col 9)-(line 950,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 954,
      "end_line": 957,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 956,col 9)-(line 956,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 960,
      "end_line": 963,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 962,col 9)-(line 962,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 966,
      "end_line": 971,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 970,col 9)-(line 970,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 974,
      "end_line": 979,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 978,col 9)-(line 978,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.solve(double[])",
      "begin_line": 982,
      "end_line": 989,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 985,col 9)-(line 987,col 9)",
        "(line 988,col 9)-(line 988,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 992,
      "end_line": 999,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 995,col 9)-(line 997,col 9)",
        "(line 998,col 9)-(line 998,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.luDecompose()",
      "begin_line": 1020,
      "end_line": 1026,
      "comment": "\n     * Computes a new\n     * \u003ca href\u003d\"http://www.math.gatech.edu/~bourbaki/math2601/Web-notes/2num.pdf\"\u003e\n     * LU decomposition\u003c/a\u003e for this matrix, storing the result for use by other methods.\n     * \u003cp\u003e\n     * \u003cstrong\u003eImplementation Note\u003c/strong\u003e:\u003cbr\u003e\n     * Uses \u003ca href\u003d\"http://www.damtp.cam.ac.uk/user/fdl/people/sd/lectures/nummeth98/linear.htm\"\u003e\n     * Crout\u0027s algorithm\u003c/a\u003e, with partial pivoting.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note\u003c/strong\u003e:\u003cbr\u003e\n     * This method should rarely be invoked directly. Its only use is\n     * to force recomputation of the LU decomposition when changes have been\n     * made to the underlying data using direct array references. Changes\n     * made using setXxx methods will trigger recomputation when needed\n     * automatically.\u003c/p\u003e\n     *\n     * @throws InvalidMatrixException if the matrix is non-square or singular.\n     * @deprecated as of release 2.0, replaced by {@link LUDecomposition}\n     ",
      "child_ranges": [
        "(line 1023,col 9)-(line 1025,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.toString()",
      "begin_line": 1032,
      "end_line": 1057,
      "comment": "\n     * Get a string representation for this matrix.\n     * @return a string representation for this matrix\n     ",
      "child_ranges": [
        "(line 1033,col 9)-(line 1033,col 44)",
        "(line 1034,col 9)-(line 1034,col 47)",
        "(line 1035,col 9)-(line 1035,col 52)",
        "(line 1036,col 9)-(line 1036,col 52)",
        "(line 1037,col 9)-(line 1037,col 92)",
        "(line 1038,col 9)-(line 1038,col 47)",
        "(line 1040,col 9)-(line 1052,col 9)",
        "(line 1054,col 9)-(line 1054,col 24)",
        "(line 1055,col 9)-(line 1055,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.equals(java.lang.Object)",
      "begin_line": 1067,
      "end_line": 1088,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eRealMatrix\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.\n     * \n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 1068,col 9)-(line 1070,col 9)",
        "(line 1071,col 9)-(line 1073,col 9)",
        "(line 1074,col 9)-(line 1074,col 43)",
        "(line 1075,col 9)-(line 1075,col 44)",
        "(line 1076,col 9)-(line 1076,col 47)",
        "(line 1077,col 9)-(line 1079,col 9)",
        "(line 1080,col 9)-(line 1086,col 9)",
        "(line 1087,col 9)-(line 1087,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.hashCode()",
      "begin_line": 1095,
      "end_line": 1108,
      "comment": "\n     * Computes a hashcode for the matrix.\n     * \n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 1096,col 9)-(line 1096,col 20)",
        "(line 1097,col 9)-(line 1097,col 44)",
        "(line 1098,col 9)-(line 1098,col 47)",
        "(line 1099,col 9)-(line 1099,col 31)",
        "(line 1100,col 9)-(line 1100,col 31)",
        "(line 1101,col 9)-(line 1106,col 9)",
        "(line 1107,col 9)-(line 1107,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.checkRowIndex(int)",
      "begin_line": 1115,
      "end_line": 1120,
      "comment": "\n     * Check if a row index is valid.\n     * @param row row index to check\n     * @exception MatrixIndexException if index is not valid\n     ",
      "child_ranges": [
        "(line 1116,col 9)-(line 1119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.checkColumnIndex(int)",
      "begin_line": 1127,
      "end_line": 1133,
      "comment": "\n     * Check if a column index is valid.\n     * @param column column index to check\n     * @exception MatrixIndexException if index is not valid\n     ",
      "child_ranges": [
        "(line 1129,col 9)-(line 1132,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.checkSubMatrixIndex(int, int, int, int)",
      "begin_line": 1145,
      "end_line": 1162,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param startRow Initial row index\n     * @param endRow Final row index\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @exception MatrixIndexException  if the indices are not valid\n     ",
      "child_ranges": [
        "(line 1147,col 9)-(line 1147,col 32)",
        "(line 1148,col 9)-(line 1148,col 30)",
        "(line 1149,col 9)-(line 1152,col 9)",
        "(line 1154,col 9)-(line 1154,col 38)",
        "(line 1155,col 9)-(line 1155,col 36)",
        "(line 1156,col 9)-(line 1159,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.checkSubMatrixIndex(int[], int[])",
      "begin_line": 1172,
      "end_line": 1186,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param selectedRows Array of row indices.\n     * @param selectedColumns Array of column indices.\n     * @exception MatrixIndexException if row or column selections are not valid\n     ",
      "child_ranges": [
        "(line 1173,col 9)-(line 1178,col 9)",
        "(line 1180,col 9)-(line 1182,col 9)",
        "(line 1183,col 9)-(line 1185,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.checkAdditionCompatible(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1193,
      "end_line": 1205,
      "comment": "\n     * Check if a matrix is addition compatible with the instance\n     * @param m matrix to check\n     * @exception IllegalArgumentException if matrix is not addition compatible with instance\n     ",
      "child_ranges": [
        "(line 1194,col 9)-(line 1204,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.checkSubtractionCompatible(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1212,
      "end_line": 1224,
      "comment": "\n     * Check if a matrix is subtraction compatible with the instance\n     * @param m matrix to check\n     * @exception IllegalArgumentException if matrix is not subtraction compatible with instance\n     ",
      "child_ranges": [
        "(line 1213,col 9)-(line 1223,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.checkMultiplicationCompatible(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1231,
      "end_line": 1242,
      "comment": "\n     * Check if a matrix is multiplication compatible with the instance\n     * @param m matrix to check\n     * @exception IllegalArgumentException if matrix is not multiplication compatible with instance\n     ",
      "child_ranges": [
        "(line 1232,col 9)-(line 1241,col 9)"
      ]
    }
  ]
}