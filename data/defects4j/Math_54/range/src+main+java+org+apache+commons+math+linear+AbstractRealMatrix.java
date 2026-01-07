{
  "filepath": "/tmp/Math-54b/src/main/java/org/apache/commons/math/linear/AbstractRealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractRealMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealMatrix"
      ],
      "begin_line": 37,
      "end_line": 927,
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
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.power(int)",
      "begin_line": 155,
      "end_line": 211,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 156,col 9)-(line 158,col 9)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 164,col 9)-(line 166,col 9)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 172,col 9)-(line 172,col 32)",
        "(line 181,col 9)-(line 181,col 88)",
        "(line 182,col 9)-(line 182,col 77)",
        "(line 183,col 9)-(line 183,col 22)",
        "(line 185,col 9)-(line 195,col 9)",
        "(line 197,col 9)-(line 197,col 56)",
        "(line 198,col 9)-(line 198,col 33)",
        "(line 200,col 9)-(line 202,col 9)",
        "(line 204,col 9)-(line 204,col 40)",
        "(line 206,col 9)-(line 208,col 9)",
        "(line 210,col 9)-(line 210,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getData()",
      "begin_line": 214,
      "end_line": 225,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 84)",
        "(line 217,col 9)-(line 222,col 9)",
        "(line 224,col 9)-(line 224,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getNorm()",
      "begin_line": 228,
      "end_line": 263,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 229,col 9)-(line 262,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "endRow"
      ],
      "begin_line": 232,
      "end_line": 232,
      "comment": " Last row index. "
    },
    {
      "type": "field",
      "varNames": [
        "columnSum"
      ],
      "begin_line": 235,
      "end_line": 235,
      "comment": " Sum of absolute values on one column. "
    },
    {
      "type": "field",
      "varNames": [
        "maxColSum"
      ],
      "begin_line": 238,
      "end_line": 238,
      "comment": " Maximal sum across all columns. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-eff7152e-aa66-4b1a-b8a8-27907d3046b4.start(int, int, int, int, int, int)",
      "begin_line": 241,
      "end_line": 247,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 244,col 17)-(line 244,col 37)",
        "(line 245,col 17)-(line 245,col 32)",
        "(line 246,col 17)-(line 246,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-a29f407d-b060-48b6-b9d6-0f8cac2c770f.visit(int, int, double)",
      "begin_line": 250,
      "end_line": 256,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 251,col 17)-(line 251,col 49)",
        "(line 252,col 17)-(line 255,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-a08c0cd2-438c-43de-aead-932ba16ecae0.end()",
      "begin_line": 259,
      "end_line": 261,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 260,col 17)-(line 260,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getFrobeniusNorm()",
      "begin_line": 266,
      "end_line": 289,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 267,col 9)-(line 288,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 270,
      "end_line": 270,
      "comment": " Sum of squared entries. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-df22ebd4-f8c2-4970-8d90-c6bfe7d438b1.start(int, int, int, int, int, int)",
      "begin_line": 273,
      "end_line": 277,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 276,col 17)-(line 276,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-31ea0402-c8e4-4216-83bd-411c174b464d.visit(int, int, double)",
      "begin_line": 280,
      "end_line": 282,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 281,col 17)-(line 281,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-957ddbfa-ba9c-4c37-8127-61597a0a32ba.end()",
      "begin_line": 285,
      "end_line": 287,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 286,col 17)-(line 286,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 292,
      "end_line": 305,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 88)",
        "(line 296,col 9)-(line 297,col 77)",
        "(line 298,col 9)-(line 302,col 9)",
        "(line 304,col 9)-(line 304,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getSubMatrix(int[], int[])",
      "begin_line": 308,
      "end_line": 326,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 77)",
        "(line 313,col 9)-(line 314,col 70)",
        "(line 315,col 9)-(line 323,col 11)",
        "(line 325,col 9)-(line 325,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-27a9a332-f7e0-45f8-9911-0b7c369f5952.visit(int, int, double)",
      "begin_line": 318,
      "end_line": 321,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 320,col 17)-(line 320,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copySubMatrix(int, int, int, int, double[][])",
      "begin_line": 329,
      "end_line": 366,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 88)",
        "(line 334,col 9)-(line 334,col 55)",
        "(line 335,col 9)-(line 335,col 61)",
        "(line 336,col 9)-(line 339,col 9)",
        "(line 342,col 9)-(line 365,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "startRow"
      ],
      "begin_line": 345,
      "end_line": 345,
      "comment": " Initial row index. "
    },
    {
      "type": "field",
      "varNames": [
        "startColumn"
      ],
      "begin_line": 348,
      "end_line": 348,
      "comment": " Initial column index. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-c03486b4-7792-42d0-aac4-6a398b71fdbc.start(int, int, int, int, int, int)",
      "begin_line": 351,
      "end_line": 357,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 355,col 17)-(line 355,col 44)",
        "(line 356,col 17)-(line 356,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-32bf5c2f-af81-4dd4-9927-6a33b4c6c439.visit(int, int, double)",
      "begin_line": 360,
      "end_line": 363,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 362,col 17)-(line 362,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copySubMatrix(int[], int[], double[][])",
      "begin_line": 369,
      "end_line": 385,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 77)",
        "(line 372,col 9)-(line 376,col 9)",
        "(line 379,col 9)-(line 384,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 388,
      "end_line": 415,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 43)",
        "(line 390,col 9)-(line 392,col 9)",
        "(line 394,col 9)-(line 394,col 46)",
        "(line 395,col 9)-(line 397,col 9)",
        "(line 399,col 9)-(line 403,col 9)",
        "(line 405,col 9)-(line 405,col 45)",
        "(line 406,col 9)-(line 406,col 51)",
        "(line 407,col 9)-(line 407,col 57)",
        "(line 408,col 9)-(line 408,col 63)",
        "(line 410,col 9)-(line 414,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowMatrix(int)",
      "begin_line": 418,
      "end_line": 427,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 45)",
        "(line 420,col 9)-(line 420,col 47)",
        "(line 421,col 9)-(line 421,col 54)",
        "(line 422,col 9)-(line 424,col 9)",
        "(line 426,col 9)-(line 426,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRowMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 430,
      "end_line": 442,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 45)",
        "(line 432,col 9)-(line 432,col 47)",
        "(line 433,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 441,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnMatrix(int)",
      "begin_line": 445,
      "end_line": 454,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 51)",
        "(line 447,col 9)-(line 447,col 44)",
        "(line 448,col 9)-(line 448,col 54)",
        "(line 449,col 9)-(line 451,col 9)",
        "(line 453,col 9)-(line 453,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 457,
      "end_line": 469,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 51)",
        "(line 459,col 9)-(line 459,col 44)",
        "(line 460,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 468,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowVector(int)",
      "begin_line": 472,
      "end_line": 474,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRowVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 477,
      "end_line": 487,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 45)",
        "(line 479,col 9)-(line 479,col 47)",
        "(line 480,col 9)-(line 483,col 9)",
        "(line 484,col 9)-(line 486,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnVector(int)",
      "begin_line": 490,
      "end_line": 492,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumnVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 495,
      "end_line": 505,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 51)",
        "(line 497,col 9)-(line 497,col 44)",
        "(line 498,col 9)-(line 501,col 9)",
        "(line 502,col 9)-(line 504,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRow(int)",
      "begin_line": 508,
      "end_line": 517,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 45)",
        "(line 510,col 9)-(line 510,col 47)",
        "(line 511,col 9)-(line 511,col 47)",
        "(line 512,col 9)-(line 514,col 9)",
        "(line 516,col 9)-(line 516,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRow(int, double[])",
      "begin_line": 520,
      "end_line": 529,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 45)",
        "(line 522,col 9)-(line 522,col 47)",
        "(line 523,col 9)-(line 525,col 9)",
        "(line 526,col 9)-(line 528,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumn(int)",
      "begin_line": 532,
      "end_line": 541,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 533,col 9)-(line 533,col 51)",
        "(line 534,col 9)-(line 534,col 44)",
        "(line 535,col 9)-(line 535,col 47)",
        "(line 536,col 9)-(line 538,col 9)",
        "(line 540,col 9)-(line 540,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumn(int, double[])",
      "begin_line": 544,
      "end_line": 553,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 51)",
        "(line 546,col 9)-(line 546,col 44)",
        "(line 547,col 9)-(line 549,col 9)",
        "(line 550,col 9)-(line 552,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getEntry(int, int)",
      "begin_line": 556,
      "end_line": 556,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setEntry(int, int, double)",
      "begin_line": 559,
      "end_line": 559,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.addToEntry(int, int, double)",
      "begin_line": 562,
      "end_line": 562,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 565,
      "end_line": 565,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.transpose()",
      "begin_line": 568,
      "end_line": 583,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 44)",
        "(line 570,col 9)-(line 570,col 47)",
        "(line 571,col 9)-(line 571,col 58)",
        "(line 572,col 9)-(line 580,col 11)",
        "(line 582,col 9)-(line 582,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-b83d8480-1759-4374-88f3-e7c8fe4343e3.visit(int, int, double)",
      "begin_line": 575,
      "end_line": 578,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 577,col 17)-(line 577,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.isSquare()",
      "begin_line": 586,
      "end_line": 588,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowDimension()",
      "begin_line": 591,
      "end_line": 591,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnDimension()",
      "begin_line": 594,
      "end_line": 594,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getTrace()",
      "begin_line": 597,
      "end_line": 608,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 44)",
        "(line 599,col 9)-(line 599,col 47)",
        "(line 600,col 9)-(line 602,col 8)",
        "(line 603,col 9)-(line 603,col 25)",
        "(line 604,col 9)-(line 606,col 9)",
        "(line 607,col 9)-(line 607,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.operate(double[])",
      "begin_line": 611,
      "end_line": 628,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 44)",
        "(line 613,col 9)-(line 613,col 47)",
        "(line 614,col 9)-(line 616,col 9)",
        "(line 618,col 9)-(line 618,col 47)",
        "(line 619,col 9)-(line 625,col 9)",
        "(line 627,col 9)-(line 627,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.operate(org.apache.commons.math.linear.RealVector)",
      "begin_line": 631,
      "end_line": 652,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 632,col 9)-(line 651,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(double[])",
      "begin_line": 655,
      "end_line": 673,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 44)",
        "(line 658,col 9)-(line 658,col 47)",
        "(line 659,col 9)-(line 661,col 9)",
        "(line 663,col 9)-(line 663,col 47)",
        "(line 664,col 9)-(line 670,col 9)",
        "(line 672,col 9)-(line 672,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 676,
      "end_line": 698,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 677,col 9)-(line 697,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 701,
      "end_line": 713,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 702,col 9)-(line 702,col 46)",
        "(line 703,col 9)-(line 703,col 49)",
        "(line 704,col 9)-(line 704,col 66)",
        "(line 705,col 9)-(line 711,col 9)",
        "(line 712,col 9)-(line 712,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 716,
      "end_line": 726,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 717,col 9)-(line 717,col 46)",
        "(line 718,col 9)-(line 718,col 49)",
        "(line 719,col 9)-(line 719,col 66)",
        "(line 720,col 9)-(line 724,col 9)",
        "(line 725,col 9)-(line 725,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 729,
      "end_line": 743,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 732,col 9)-(line 732,col 88)",
        "(line 733,col 9)-(line 734,col 64)",
        "(line 735,col 9)-(line 741,col 9)",
        "(line 742,col 9)-(line 742,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 746,
      "end_line": 758,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 749,col 9)-(line 749,col 88)",
        "(line 750,col 9)-(line 751,col 64)",
        "(line 752,col 9)-(line 756,col 9)",
        "(line 757,col 9)-(line 757,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 761,
      "end_line": 773,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 762,col 9)-(line 762,col 46)",
        "(line 763,col 9)-(line 763,col 49)",
        "(line 764,col 9)-(line 764,col 66)",
        "(line 765,col 9)-(line 771,col 9)",
        "(line 772,col 9)-(line 772,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 776,
      "end_line": 786,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 777,col 9)-(line 777,col 46)",
        "(line 778,col 9)-(line 778,col 49)",
        "(line 779,col 9)-(line 779,col 66)",
        "(line 780,col 9)-(line 784,col 9)",
        "(line 785,col 9)-(line 785,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 789,
      "end_line": 803,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 792,col 9)-(line 792,col 88)",
        "(line 793,col 9)-(line 794,col 64)",
        "(line 795,col 9)-(line 801,col 9)",
        "(line 802,col 9)-(line 802,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 806,
      "end_line": 818,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 809,col 9)-(line 809,col 88)",
        "(line 810,col 9)-(line 811,col 64)",
        "(line 812,col 9)-(line 816,col 9)",
        "(line 817,col 9)-(line 817,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 821,
      "end_line": 823,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 822,col 9)-(line 822,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 826,
      "end_line": 828,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 827,col 9)-(line 827,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 831,
      "end_line": 835,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 834,col 9)-(line 834,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 838,
      "end_line": 842,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 841,col 9)-(line 841,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.toString()",
      "begin_line": 848,
      "end_line": 873,
      "comment": "\n     * Get a string representation for this matrix.\n     * @return a string representation for this matrix\n     ",
      "child_ranges": [
        "(line 850,col 9)-(line 850,col 44)",
        "(line 851,col 9)-(line 851,col 47)",
        "(line 852,col 9)-(line 852,col 52)",
        "(line 853,col 9)-(line 853,col 52)",
        "(line 854,col 9)-(line 854,col 92)",
        "(line 855,col 9)-(line 855,col 47)",
        "(line 857,col 9)-(line 869,col 9)",
        "(line 871,col 9)-(line 871,col 24)",
        "(line 872,col 9)-(line 872,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.equals(java.lang.Object)",
      "begin_line": 883,
      "end_line": 905,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eRealMatrix\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.\n     *\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 885,col 9)-(line 887,col 9)",
        "(line 888,col 9)-(line 890,col 9)",
        "(line 891,col 9)-(line 891,col 43)",
        "(line 892,col 9)-(line 892,col 44)",
        "(line 893,col 9)-(line 893,col 47)",
        "(line 894,col 9)-(line 896,col 9)",
        "(line 897,col 9)-(line 903,col 9)",
        "(line 904,col 9)-(line 904,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.hashCode()",
      "begin_line": 912,
      "end_line": 926,
      "comment": "\n     * Computes a hashcode for the matrix.\n     *\n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 914,col 9)-(line 914,col 20)",
        "(line 915,col 9)-(line 915,col 44)",
        "(line 916,col 9)-(line 916,col 47)",
        "(line 917,col 9)-(line 917,col 31)",
        "(line 918,col 9)-(line 918,col 31)",
        "(line 919,col 9)-(line 924,col 9)",
        "(line 925,col 9)-(line 925,col 19)"
      ]
    }
  ]
}