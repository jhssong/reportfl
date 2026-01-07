{
  "filepath": "/tmp/Math-89b/src/java/org/apache/commons/math/linear/AbstractRealMatrix.java",
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
      "end_line": 1215,
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
      "end_line": 46,
      "comment": " Cached LU solver.\n     * @deprecated as of release 2.0, since all methods using this are deprecated\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.AbstractRealMatrix()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Creates a matrix with no data\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.AbstractRealMatrix(int, int)",
      "begin_line": 62,
      "end_line": 75,
      "comment": "\n     * Create a new RealMatrix with the supplied row and column dimensions.\n     *\n     * @param rowDimension  the number of rows in the new matrix\n     * @param columnDimension  the number of columns in the new matrix\n     * @throws IllegalArgumentException if row or column dimension is not positive\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 74,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.createMatrix(int, int)",
      "begin_line": 78,
      "end_line": 79,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copy()",
      "begin_line": 82,
      "end_line": 82,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.add(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 85,
      "end_line": 101,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 35)",
        "(line 90,col 9)-(line 90,col 50)",
        "(line 91,col 9)-(line 91,col 53)",
        "(line 92,col 9)-(line 92,col 67)",
        "(line 93,col 9)-(line 97,col 9)",
        "(line 99,col 9)-(line 99,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 104,
      "end_line": 120,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 38)",
        "(line 109,col 9)-(line 109,col 50)",
        "(line 110,col 9)-(line 110,col 53)",
        "(line 111,col 9)-(line 111,col 67)",
        "(line 112,col 9)-(line 116,col 9)",
        "(line 118,col 9)-(line 118,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.scalarAdd(double)",
      "begin_line": 123,
      "end_line": 136,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 50)",
        "(line 126,col 9)-(line 126,col 53)",
        "(line 127,col 9)-(line 127,col 67)",
        "(line 128,col 9)-(line 132,col 9)",
        "(line 134,col 9)-(line 134,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.scalarMultiply(double)",
      "begin_line": 139,
      "end_line": 152,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 50)",
        "(line 142,col 9)-(line 142,col 53)",
        "(line 143,col 9)-(line 143,col 67)",
        "(line 144,col 9)-(line 148,col 9)",
        "(line 150,col 9)-(line 150,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 155,
      "end_line": 177,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 41)",
        "(line 161,col 9)-(line 161,col 44)",
        "(line 162,col 9)-(line 162,col 49)",
        "(line 163,col 9)-(line 163,col 47)",
        "(line 164,col 9)-(line 164,col 58)",
        "(line 165,col 9)-(line 173,col 9)",
        "(line 175,col 9)-(line 175,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 180,
      "end_line": 183,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getData()",
      "begin_line": 186,
      "end_line": 199,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 84)",
        "(line 190,col 9)-(line 195,col 9)",
        "(line 197,col 9)-(line 197,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getNorm()",
      "begin_line": 202,
      "end_line": 241,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 203,col 9)-(line 240,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "endRow"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": " Last row index. "
    },
    {
      "type": "field",
      "varNames": [
        "columnSum"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": " Sum of absolute values on one column. "
    },
    {
      "type": "field",
      "varNames": [
        "maxColSum"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": " Maximal sum across all columns. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-41a92ed3-394c-49d9-92ee-af0921b1a1ed.start(int, int, int, int, int, int)",
      "begin_line": 218,
      "end_line": 224,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 221,col 17)-(line 221,col 37)",
        "(line 222,col 17)-(line 222,col 32)",
        "(line 223,col 17)-(line 223,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-e5151a93-a9b7-400e-9c83-4a1a034328cf.visit(int, int, double)",
      "begin_line": 227,
      "end_line": 233,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 228,col 17)-(line 228,col 45)",
        "(line 229,col 17)-(line 232,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-17ec985d-a038-48e3-aa19-916a4ec960ef.end()",
      "begin_line": 236,
      "end_line": 238,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 237,col 17)-(line 237,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getFrobeniusNorm()",
      "begin_line": 244,
      "end_line": 271,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 245,col 9)-(line 270,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 248,
      "end_line": 248,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 251,
      "end_line": 251,
      "comment": " Sum of squared entries. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-e7ad7e4b-9b63-4200-a808-00eb602417e8.start(int, int, int, int, int, int)",
      "begin_line": 254,
      "end_line": 258,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 257,col 17)-(line 257,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-338d04eb-b3d6-4600-b7b4-3d62610072b9.visit(int, int, double)",
      "begin_line": 261,
      "end_line": 263,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 262,col 17)-(line 262,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-736d5316-5312-4297-b844-17a6cc2647c1.end()",
      "begin_line": 266,
      "end_line": 268,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 267,col 17)-(line 267,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 274,
      "end_line": 290,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 70)",
        "(line 280,col 9)-(line 281,col 77)",
        "(line 282,col 9)-(line 286,col 9)",
        "(line 288,col 9)-(line 288,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getSubMatrix(int[], int[])",
      "begin_line": 293,
      "end_line": 317,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 59)",
        "(line 300,col 9)-(line 301,col 70)",
        "(line 302,col 9)-(line 313,col 11)",
        "(line 315,col 9)-(line 315,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 305,
      "end_line": 305,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-acaff648-0d37-4f58-8a98-8b509863acd5.visit(int, int, double)",
      "begin_line": 308,
      "end_line": 311,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 310,col 17)-(line 310,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copySubMatrix(int, int, int, int, double[][])",
      "begin_line": 320,
      "end_line": 365,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 70)",
        "(line 327,col 9)-(line 327,col 55)",
        "(line 328,col 9)-(line 328,col 61)",
        "(line 329,col 9)-(line 334,col 9)",
        "(line 337,col 9)-(line 363,col 53)"
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
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-86967f7c-6944-43a6-a689-04aa4f7dc158.start(int, int, int, int, int, int)",
      "begin_line": 349,
      "end_line": 355,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 353,col 17)-(line 353,col 44)",
        "(line 354,col 17)-(line 354,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-42976b2b-5fa7-4e49-b50b-88d8f0b4a45c.visit(int, int, double)",
      "begin_line": 358,
      "end_line": 361,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 360,col 17)-(line 360,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.copySubMatrix(int[], int[], double[][])",
      "begin_line": 368,
      "end_line": 389,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 59)",
        "(line 373,col 9)-(line 379,col 9)",
        "(line 382,col 9)-(line 387,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 392,
      "end_line": 426,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 43)",
        "(line 396,col 9)-(line 398,col 9)",
        "(line 400,col 9)-(line 400,col 46)",
        "(line 401,col 9)-(line 403,col 9)",
        "(line 405,col 9)-(line 411,col 9)",
        "(line 413,col 9)-(line 413,col 27)",
        "(line 414,col 9)-(line 414,col 33)",
        "(line 415,col 9)-(line 415,col 39)",
        "(line 416,col 9)-(line 416,col 45)",
        "(line 418,col 9)-(line 422,col 9)",
        "(line 424,col 9)-(line 424,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowMatrix(int)",
      "begin_line": 429,
      "end_line": 441,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 27)",
        "(line 433,col 9)-(line 433,col 47)",
        "(line 434,col 9)-(line 434,col 54)",
        "(line 435,col 9)-(line 437,col 9)",
        "(line 439,col 9)-(line 439,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRowMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 444,
      "end_line": 459,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 27)",
        "(line 448,col 9)-(line 448,col 47)",
        "(line 449,col 9)-(line 454,col 9)",
        "(line 455,col 9)-(line 457,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnMatrix(int)",
      "begin_line": 462,
      "end_line": 474,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 33)",
        "(line 466,col 9)-(line 466,col 44)",
        "(line 467,col 9)-(line 467,col 54)",
        "(line 468,col 9)-(line 470,col 9)",
        "(line 472,col 9)-(line 472,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 477,
      "end_line": 492,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 33)",
        "(line 481,col 9)-(line 481,col 44)",
        "(line 482,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 490,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowVector(int)",
      "begin_line": 495,
      "end_line": 498,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRowVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 501,
      "end_line": 515,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 27)",
        "(line 505,col 9)-(line 505,col 47)",
        "(line 506,col 9)-(line 510,col 9)",
        "(line 511,col 9)-(line 513,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnVector(int)",
      "begin_line": 518,
      "end_line": 521,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumnVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 524,
      "end_line": 538,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 33)",
        "(line 528,col 9)-(line 528,col 44)",
        "(line 529,col 9)-(line 533,col 9)",
        "(line 534,col 9)-(line 536,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRow(int)",
      "begin_line": 541,
      "end_line": 553,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 27)",
        "(line 545,col 9)-(line 545,col 47)",
        "(line 546,col 9)-(line 546,col 47)",
        "(line 547,col 9)-(line 549,col 9)",
        "(line 551,col 9)-(line 551,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setRow(int, double[])",
      "begin_line": 556,
      "end_line": 570,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 27)",
        "(line 560,col 9)-(line 560,col 47)",
        "(line 561,col 9)-(line 565,col 9)",
        "(line 566,col 9)-(line 568,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumn(int)",
      "begin_line": 573,
      "end_line": 585,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 33)",
        "(line 577,col 9)-(line 577,col 44)",
        "(line 578,col 9)-(line 578,col 47)",
        "(line 579,col 9)-(line 581,col 9)",
        "(line 583,col 9)-(line 583,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setColumn(int, double[])",
      "begin_line": 588,
      "end_line": 602,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 33)",
        "(line 592,col 9)-(line 592,col 44)",
        "(line 593,col 9)-(line 597,col 9)",
        "(line 598,col 9)-(line 600,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getEntry(int, int)",
      "begin_line": 605,
      "end_line": 606,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.setEntry(int, int, double)",
      "begin_line": 609,
      "end_line": 610,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.addToEntry(int, int, double)",
      "begin_line": 613,
      "end_line": 614,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 617,
      "end_line": 618,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.transpose()",
      "begin_line": 621,
      "end_line": 641,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 623,col 9)-(line 623,col 44)",
        "(line 624,col 9)-(line 624,col 47)",
        "(line 625,col 9)-(line 625,col 58)",
        "(line 626,col 9)-(line 637,col 11)",
        "(line 639,col 9)-(line 639,col 19)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 629,
      "end_line": 629,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.Anonymous-fcd42038-26cc-4bce-a729-96c421a0d72d.visit(int, int, double)",
      "begin_line": 632,
      "end_line": 635,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 634,col 17)-(line 634,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.inverse()",
      "begin_line": 644,
      "end_line": 651,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 647,col 9)-(line 649,col 9)",
        "(line 650,col 9)-(line 650,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getDeterminant()",
      "begin_line": 654,
      "end_line": 658,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.isSquare()",
      "begin_line": 661,
      "end_line": 663,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 662,col 9)-(line 662,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.isSingular()",
      "begin_line": 666,
      "end_line": 672,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 668,col 9)-(line 670,col 8)",
        "(line 671,col 9)-(line 671,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getRowDimension()",
      "begin_line": 675,
      "end_line": 675,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getColumnDimension()",
      "begin_line": 678,
      "end_line": 678,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.getTrace()",
      "begin_line": 681,
      "end_line": 693,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 683,col 9)-(line 683,col 44)",
        "(line 684,col 9)-(line 684,col 47)",
        "(line 685,col 9)-(line 687,col 8)",
        "(line 688,col 9)-(line 688,col 25)",
        "(line 689,col 9)-(line 691,col 9)",
        "(line 692,col 9)-(line 692,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.operate(double[])",
      "begin_line": 696,
      "end_line": 718,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 699,col 9)-(line 699,col 44)",
        "(line 700,col 9)-(line 700,col 47)",
        "(line 701,col 9)-(line 705,col 9)",
        "(line 707,col 9)-(line 707,col 47)",
        "(line 708,col 9)-(line 714,col 9)",
        "(line 716,col 9)-(line 716,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.operate(org.apache.commons.math.linear.RealVector)",
      "begin_line": 721,
      "end_line": 745,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 723,col 9)-(line 744,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(double[])",
      "begin_line": 748,
      "end_line": 770,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 751,col 9)-(line 751,col 44)",
        "(line 752,col 9)-(line 752,col 47)",
        "(line 753,col 9)-(line 757,col 9)",
        "(line 759,col 9)-(line 759,col 47)",
        "(line 760,col 9)-(line 766,col 9)",
        "(line 768,col 9)-(line 768,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.preMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 773,
      "end_line": 799,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 775,col 9)-(line 798,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 802,
      "end_line": 816,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 804,col 9)-(line 804,col 46)",
        "(line 805,col 9)-(line 805,col 49)",
        "(line 806,col 9)-(line 806,col 66)",
        "(line 807,col 9)-(line 813,col 9)",
        "(line 814,col 9)-(line 814,col 18)",
        "(line 815,col 9)-(line 815,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 819,
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
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 833,
      "end_line": 849,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 837,col 9)-(line 837,col 70)",
        "(line 838,col 9)-(line 839,col 64)",
        "(line 840,col 9)-(line 846,col 9)",
        "(line 847,col 9)-(line 847,col 18)",
        "(line 848,col 9)-(line 848,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 852,
      "end_line": 865,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 856,col 9)-(line 856,col 70)",
        "(line 857,col 9)-(line 858,col 64)",
        "(line 859,col 9)-(line 863,col 9)",
        "(line 864,col 9)-(line 864,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 868,
      "end_line": 882,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 870,col 9)-(line 870,col 46)",
        "(line 871,col 9)-(line 871,col 49)",
        "(line 872,col 9)-(line 872,col 66)",
        "(line 873,col 9)-(line 879,col 9)",
        "(line 880,col 9)-(line 880,col 18)",
        "(line 881,col 9)-(line 881,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 885,
      "end_line": 896,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 887,col 9)-(line 887,col 46)",
        "(line 888,col 9)-(line 888,col 49)",
        "(line 889,col 9)-(line 889,col 66)",
        "(line 890,col 9)-(line 894,col 9)",
        "(line 895,col 9)-(line 895,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 899,
      "end_line": 915,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 903,col 9)-(line 903,col 70)",
        "(line 904,col 9)-(line 905,col 64)",
        "(line 906,col 9)-(line 912,col 9)",
        "(line 913,col 9)-(line 913,col 18)",
        "(line 914,col 9)-(line 914,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 918,
      "end_line": 931,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 922,col 9)-(line 922,col 70)",
        "(line 923,col 9)-(line 924,col 64)",
        "(line 925,col 9)-(line 929,col 9)",
        "(line 930,col 9)-(line 930,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 934,
      "end_line": 937,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 936,col 9)-(line 936,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 940,
      "end_line": 943,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 942,col 9)-(line 942,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 946,
      "end_line": 951,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 950,col 9)-(line 950,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 954,
      "end_line": 959,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 958,col 9)-(line 958,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.solve(double[])",
      "begin_line": 962,
      "end_line": 969,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 965,col 9)-(line 967,col 9)",
        "(line 968,col 9)-(line 968,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 972,
      "end_line": 979,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 975,col 9)-(line 977,col 9)",
        "(line 978,col 9)-(line 978,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.luDecompose()",
      "begin_line": 1000,
      "end_line": 1006,
      "comment": "\n     * Computes a new\n     * \u003ca href\u003d\"http://www.math.gatech.edu/~bourbaki/math2601/Web-notes/2num.pdf\"\u003e\n     * LU decomposition\u003c/a\u003e for this matrix, storing the result for use by other methods.\n     * \u003cp\u003e\n     * \u003cstrong\u003eImplementation Note\u003c/strong\u003e:\u003cbr\u003e\n     * Uses \u003ca href\u003d\"http://www.damtp.cam.ac.uk/user/fdl/people/sd/lectures/nummeth98/linear.htm\"\u003e\n     * Crout\u0027s algorithm\u003c/a\u003e, with partial pivoting.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note\u003c/strong\u003e:\u003cbr\u003e\n     * This method should rarely be invoked directly. Its only use is\n     * to force recomputation of the LU decomposition when changes have been\n     * made to the underlying data using direct array references. Changes\n     * made using setXxx methods will trigger recomputation when needed\n     * automatically.\u003c/p\u003e\n     *\n     * @throws InvalidMatrixException if the matrix is non-square or singular.\n     * @deprecated as of release 2.0, replaced by {@link LUDecomposition}\n     ",
      "child_ranges": [
        "(line 1003,col 9)-(line 1005,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.toString()",
      "begin_line": 1012,
      "end_line": 1038,
      "comment": "\n     * Get a string representation for this matrix.\n     * @return a string representation for this matrix\n     ",
      "child_ranges": [
        "(line 1014,col 9)-(line 1014,col 44)",
        "(line 1015,col 9)-(line 1015,col 47)",
        "(line 1016,col 9)-(line 1016,col 52)",
        "(line 1017,col 9)-(line 1017,col 52)",
        "(line 1018,col 9)-(line 1018,col 92)",
        "(line 1019,col 9)-(line 1019,col 47)",
        "(line 1021,col 9)-(line 1033,col 9)",
        "(line 1035,col 9)-(line 1035,col 24)",
        "(line 1036,col 9)-(line 1036,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.equals(java.lang.Object)",
      "begin_line": 1048,
      "end_line": 1070,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eRealMatrix\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.\n     * \n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 1050,col 9)-(line 1052,col 9)",
        "(line 1053,col 9)-(line 1055,col 9)",
        "(line 1056,col 9)-(line 1056,col 43)",
        "(line 1057,col 9)-(line 1057,col 44)",
        "(line 1058,col 9)-(line 1058,col 47)",
        "(line 1059,col 9)-(line 1061,col 9)",
        "(line 1062,col 9)-(line 1068,col 9)",
        "(line 1069,col 9)-(line 1069,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.hashCode()",
      "begin_line": 1077,
      "end_line": 1091,
      "comment": "\n     * Computes a hashcode for the matrix.\n     * \n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 1079,col 9)-(line 1079,col 20)",
        "(line 1080,col 9)-(line 1080,col 44)",
        "(line 1081,col 9)-(line 1081,col 47)",
        "(line 1082,col 9)-(line 1082,col 31)",
        "(line 1083,col 9)-(line 1083,col 31)",
        "(line 1084,col 9)-(line 1089,col 9)",
        "(line 1090,col 9)-(line 1090,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.checkRowIndex(int)",
      "begin_line": 1098,
      "end_line": 1103,
      "comment": "\n     * Check if a row index is valid.\n     * @param row row index to check\n     * @exception MatrixIndexException if index is not valid\n     ",
      "child_ranges": [
        "(line 1099,col 9)-(line 1102,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.checkColumnIndex(int)",
      "begin_line": 1110,
      "end_line": 1116,
      "comment": "\n     * Check if a column index is valid.\n     * @param column column index to check\n     * @exception MatrixIndexException if index is not valid\n     ",
      "child_ranges": [
        "(line 1112,col 9)-(line 1115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.checkSubMatrixIndex(int, int, int, int)",
      "begin_line": 1128,
      "end_line": 1145,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param startRow Initial row index\n     * @param endRow Final row index\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @exception MatrixIndexException  if the indices are not valid\n     ",
      "child_ranges": [
        "(line 1130,col 9)-(line 1130,col 32)",
        "(line 1131,col 9)-(line 1131,col 30)",
        "(line 1132,col 9)-(line 1135,col 9)",
        "(line 1137,col 9)-(line 1137,col 38)",
        "(line 1138,col 9)-(line 1138,col 36)",
        "(line 1139,col 9)-(line 1142,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.checkSubMatrixIndex(int[], int[])",
      "begin_line": 1155,
      "end_line": 1169,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param selectedRows Array of row indices.\n     * @param selectedColumns Array of column indices.\n     * @exception MatrixIndexException if row or column selections are not valid\n     ",
      "child_ranges": [
        "(line 1156,col 9)-(line 1161,col 9)",
        "(line 1163,col 9)-(line 1165,col 9)",
        "(line 1166,col 9)-(line 1168,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.checkAdditionCompatible(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1176,
      "end_line": 1184,
      "comment": "\n     * Check if a matrix is addition compatible with the instance\n     * @param m matrix to check\n     * @exception IllegalArgumentException if matrix is not addition compatible with instance\n     ",
      "child_ranges": [
        "(line 1177,col 9)-(line 1183,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.checkSubtractionCompatible(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1191,
      "end_line": 1199,
      "comment": "\n     * Check if a matrix is subtraction compatible with the instance\n     * @param m matrix to check\n     * @exception IllegalArgumentException if matrix is not subtraction compatible with instance\n     ",
      "child_ranges": [
        "(line 1192,col 9)-(line 1198,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractRealMatrix.checkMultiplicationCompatible(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1206,
      "end_line": 1213,
      "comment": "\n     * Check if a matrix is multiplication compatible with the instance\n     * @param m matrix to check\n     * @exception IllegalArgumentException if matrix is not multiplication compatible with instance\n     ",
      "child_ranges": [
        "(line 1207,col 9)-(line 1212,col 9)"
      ]
    }
  ]
}