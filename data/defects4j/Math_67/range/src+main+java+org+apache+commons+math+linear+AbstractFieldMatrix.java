{
  "filepath": "/tmp/Math-67b/src/main/java/org/apache/commons/math/linear/AbstractFieldMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractFieldMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.FieldMatrix\u003cT\u003e"
      ],
      "begin_line": 37,
      "end_line": 1138,
      "comment": "\n * Basic implementation of {@link FieldMatrix} methods regardless of the underlying storage.\n * \u003cp\u003eAll the methods implemented here use {@link #getEntry(int, int)} to access\n * matrix elements. Derived class can provide faster implementations. \u003c/p\u003e\n *\n * @param \u003cT\u003e the type of the field elements\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Field to which the elements belong. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.AbstractFieldMatrix()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Constructor for use with Serializable\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.AbstractFieldMatrix(org.apache.commons.math.Field\u003cT\u003e)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Creates a matrix with no data\n     * @param field field to which the elements belong\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.AbstractFieldMatrix(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 65,
      "end_line": 77,
      "comment": "\n     * Create a new FieldMatrix\u003cT\u003e with the supplied row and column dimensions.\n     *\n     * @param field field to which the elements belong\n     * @param rowDimension  the number of rows in the new matrix\n     * @param columnDimension  the number of columns in the new matrix\n     * @throws IllegalArgumentException if row or column dimension is not positive\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 71,col 9)",
        "(line 72,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.extractField(T[][])",
      "begin_line": 86,
      "end_line": 95,
      "comment": "\n     * Get the elements type from an array.\n     * @param \u003cT\u003e the type of the field elements\n     * @param d data array\n     * @return field to which array elements belong\n     * @exception IllegalArgumentException if array is empty\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.extractField(T[])",
      "begin_line": 104,
      "end_line": 110,
      "comment": "\n     * Get the elements type from an array.\n     * @param \u003cT\u003e the type of the field elements\n     * @param d data array\n     * @return field to which array elements belong\n     * @exception IllegalArgumentException if array is empty\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.buildArray(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 123,
      "end_line": 137,
      "comment": " Build an array of elements.\n     * \u003cp\u003e\n     * Complete arrays are filled with field.getZero()\n     * \u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param field field to which array elements belong\n     * @param rows number of rows\n     * @param columns number of columns (may be negative to build partial\n     * arrays in the same way \u003ccode\u003enew Field[rows][]\u003c/code\u003e works)\n     * @return a new array\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 132,col 95)",
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.buildArray(org.apache.commons.math.Field\u003cT\u003e, int)",
      "begin_line": 148,
      "end_line": 154,
      "comment": " Build an array of elements.\n     * \u003cp\u003e\n     * Arrays are filled with field.getZero()\n     * \u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param field field to which array elements belong\n     * @param length of the array\n     * @return a new array\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 151,col 80)",
        "(line 152,col 9)-(line 152,col 44)",
        "(line 153,col 9)-(line 153,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getField()",
      "begin_line": 157,
      "end_line": 159,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.createMatrix(int, int)",
      "begin_line": 162,
      "end_line": 163,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.copy()",
      "begin_line": 166,
      "end_line": 166,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.add(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 169,
      "end_line": 185,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 35)",
        "(line 174,col 9)-(line 174,col 50)",
        "(line 175,col 9)-(line 175,col 53)",
        "(line 176,col 9)-(line 176,col 71)",
        "(line 177,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 183,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.subtract(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 188,
      "end_line": 204,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 38)",
        "(line 193,col 9)-(line 193,col 50)",
        "(line 194,col 9)-(line 194,col 53)",
        "(line 195,col 9)-(line 195,col 71)",
        "(line 196,col 9)-(line 200,col 9)",
        "(line 202,col 9)-(line 202,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.scalarAdd(T)",
      "begin_line": 207,
      "end_line": 220,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 50)",
        "(line 210,col 9)-(line 210,col 53)",
        "(line 211,col 9)-(line 211,col 71)",
        "(line 212,col 9)-(line 216,col 9)",
        "(line 218,col 9)-(line 218,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.scalarMultiply(T)",
      "begin_line": 223,
      "end_line": 236,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 50)",
        "(line 226,col 9)-(line 226,col 53)",
        "(line 227,col 9)-(line 227,col 71)",
        "(line 228,col 9)-(line 232,col 9)",
        "(line 234,col 9)-(line 234,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.multiply(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 239,
      "end_line": 261,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 41)",
        "(line 245,col 9)-(line 245,col 44)",
        "(line 246,col 9)-(line 246,col 49)",
        "(line 247,col 9)-(line 247,col 47)",
        "(line 248,col 9)-(line 248,col 62)",
        "(line 249,col 9)-(line 257,col 9)",
        "(line 259,col 9)-(line 259,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.preMultiply(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 264,
      "end_line": 267,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getData()",
      "begin_line": 270,
      "end_line": 283,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 86)",
        "(line 274,col 9)-(line 279,col 9)",
        "(line 281,col 9)-(line 281,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 286,
      "end_line": 302,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 70)",
        "(line 292,col 9)-(line 293,col 77)",
        "(line 294,col 9)-(line 298,col 9)",
        "(line 300,col 9)-(line 300,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getSubMatrix(int[], int[])",
      "begin_line": 305,
      "end_line": 326,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 59)",
        "(line 312,col 9)-(line 313,col 70)",
        "(line 314,col 9)-(line 322,col 11)",
        "(line 324,col 9)-(line 324,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.Anonymous-613f642e-7c05-4fce-a0be-ea560b5faf02.visit(int, int, T)",
      "begin_line": 317,
      "end_line": 320,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 319,col 17)-(line 319,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.copySubMatrix(int, int, int, int, T[][])",
      "begin_line": 329,
      "end_line": 371,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 70)",
        "(line 336,col 9)-(line 336,col 55)",
        "(line 337,col 9)-(line 337,col 61)",
        "(line 338,col 9)-(line 343,col 9)",
        "(line 346,col 9)-(line 369,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "startRow"
      ],
      "begin_line": 349,
      "end_line": 349,
      "comment": " Initial row index. "
    },
    {
      "type": "field",
      "varNames": [
        "startColumn"
      ],
      "begin_line": 352,
      "end_line": 352,
      "comment": " Initial column index. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.Anonymous-cad72d20-87e1-4b36-a8bb-8f83972c2149.start(int, int, int, int, int, int)",
      "begin_line": 355,
      "end_line": 361,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 359,col 17)-(line 359,col 44)",
        "(line 360,col 17)-(line 360,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.Anonymous-1f72c4ae-bf4c-46e3-a6db-b041bf4a0d9b.visit(int, int, T)",
      "begin_line": 364,
      "end_line": 367,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 366,col 17)-(line 366,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.copySubMatrix(int[], int[], T[][])",
      "begin_line": 374,
      "end_line": 395,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 59)",
        "(line 379,col 9)-(line 385,col 9)",
        "(line 388,col 9)-(line 393,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setSubMatrix(T[][], int, int)",
      "begin_line": 398,
      "end_line": 430,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 43)",
        "(line 402,col 9)-(line 404,col 9)",
        "(line 406,col 9)-(line 406,col 46)",
        "(line 407,col 9)-(line 409,col 9)",
        "(line 411,col 9)-(line 417,col 9)",
        "(line 419,col 9)-(line 419,col 27)",
        "(line 420,col 9)-(line 420,col 33)",
        "(line 421,col 9)-(line 421,col 39)",
        "(line 422,col 9)-(line 422,col 45)",
        "(line 424,col 9)-(line 428,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getRowMatrix(int)",
      "begin_line": 433,
      "end_line": 445,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 27)",
        "(line 437,col 9)-(line 437,col 47)",
        "(line 438,col 9)-(line 438,col 58)",
        "(line 439,col 9)-(line 441,col 9)",
        "(line 443,col 9)-(line 443,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setRowMatrix(int, org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 448,
      "end_line": 463,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 27)",
        "(line 452,col 9)-(line 452,col 47)",
        "(line 453,col 9)-(line 458,col 9)",
        "(line 459,col 9)-(line 461,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getColumnMatrix(int)",
      "begin_line": 466,
      "end_line": 478,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 33)",
        "(line 470,col 9)-(line 470,col 44)",
        "(line 471,col 9)-(line 471,col 58)",
        "(line 472,col 9)-(line 474,col 9)",
        "(line 476,col 9)-(line 476,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setColumnMatrix(int, org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 481,
      "end_line": 496,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 33)",
        "(line 485,col 9)-(line 485,col 44)",
        "(line 486,col 9)-(line 491,col 9)",
        "(line 492,col 9)-(line 494,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getRowVector(int)",
      "begin_line": 499,
      "end_line": 502,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setRowVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 505,
      "end_line": 519,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 27)",
        "(line 509,col 9)-(line 509,col 47)",
        "(line 510,col 9)-(line 514,col 9)",
        "(line 515,col 9)-(line 517,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getColumnVector(int)",
      "begin_line": 522,
      "end_line": 525,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setColumnVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 528,
      "end_line": 542,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 33)",
        "(line 532,col 9)-(line 532,col 44)",
        "(line 533,col 9)-(line 537,col 9)",
        "(line 538,col 9)-(line 540,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getRow(int)",
      "begin_line": 545,
      "end_line": 557,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 27)",
        "(line 549,col 9)-(line 549,col 47)",
        "(line 550,col 9)-(line 550,col 49)",
        "(line 551,col 9)-(line 553,col 9)",
        "(line 555,col 9)-(line 555,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setRow(int, T[])",
      "begin_line": 560,
      "end_line": 574,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 563,col 9)-(line 563,col 27)",
        "(line 564,col 9)-(line 564,col 47)",
        "(line 565,col 9)-(line 569,col 9)",
        "(line 570,col 9)-(line 572,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getColumn(int)",
      "begin_line": 577,
      "end_line": 589,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 33)",
        "(line 581,col 9)-(line 581,col 44)",
        "(line 582,col 9)-(line 582,col 49)",
        "(line 583,col 9)-(line 585,col 9)",
        "(line 587,col 9)-(line 587,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setColumn(int, T[])",
      "begin_line": 592,
      "end_line": 606,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 595,col 9)-(line 595,col 33)",
        "(line 596,col 9)-(line 596,col 44)",
        "(line 597,col 9)-(line 601,col 9)",
        "(line 602,col 9)-(line 604,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getEntry(int, int)",
      "begin_line": 609,
      "end_line": 610,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setEntry(int, int, T)",
      "begin_line": 613,
      "end_line": 614,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.addToEntry(int, int, T)",
      "begin_line": 617,
      "end_line": 618,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.multiplyEntry(int, int, T)",
      "begin_line": 621,
      "end_line": 622,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.transpose()",
      "begin_line": 625,
      "end_line": 642,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 627,col 9)-(line 627,col 44)",
        "(line 628,col 9)-(line 628,col 47)",
        "(line 629,col 9)-(line 629,col 62)",
        "(line 630,col 9)-(line 638,col 11)",
        "(line 640,col 9)-(line 640,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.Anonymous-27320bfb-4089-4a02-bed6-5ab2d2fae80e.visit(int, int, T)",
      "begin_line": 633,
      "end_line": 636,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 635,col 17)-(line 635,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.isSquare()",
      "begin_line": 645,
      "end_line": 647,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 646,col 9)-(line 646,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getRowDimension()",
      "begin_line": 650,
      "end_line": 650,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getColumnDimension()",
      "begin_line": 653,
      "end_line": 653,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getTrace()",
      "begin_line": 656,
      "end_line": 668,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 658,col 9)-(line 658,col 44)",
        "(line 659,col 9)-(line 659,col 47)",
        "(line 660,col 9)-(line 662,col 8)",
        "(line 663,col 9)-(line 663,col 34)",
        "(line 664,col 9)-(line 666,col 9)",
        "(line 667,col 9)-(line 667,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.operate(T[])",
      "begin_line": 671,
      "end_line": 693,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 674,col 9)-(line 674,col 44)",
        "(line 675,col 9)-(line 675,col 47)",
        "(line 676,col 9)-(line 680,col 9)",
        "(line 682,col 9)-(line 682,col 49)",
        "(line 683,col 9)-(line 689,col 9)",
        "(line 691,col 9)-(line 691,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.operate(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 696,
      "end_line": 720,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 698,col 9)-(line 719,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.preMultiply(T[])",
      "begin_line": 723,
      "end_line": 745,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 726,col 9)-(line 726,col 44)",
        "(line 727,col 9)-(line 727,col 47)",
        "(line 728,col 9)-(line 732,col 9)",
        "(line 734,col 9)-(line 734,col 49)",
        "(line 735,col 9)-(line 741,col 9)",
        "(line 743,col 9)-(line 743,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.preMultiply(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 748,
      "end_line": 774,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 750,col 9)-(line 773,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 777,
      "end_line": 790,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 779,col 9)-(line 779,col 46)",
        "(line 780,col 9)-(line 780,col 49)",
        "(line 781,col 9)-(line 781,col 66)",
        "(line 782,col 9)-(line 788,col 9)",
        "(line 789,col 9)-(line 789,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 793,
      "end_line": 804,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 795,col 9)-(line 795,col 46)",
        "(line 796,col 9)-(line 796,col 49)",
        "(line 797,col 9)-(line 797,col 66)",
        "(line 798,col 9)-(line 802,col 9)",
        "(line 803,col 9)-(line 803,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 807,
      "end_line": 822,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 811,col 9)-(line 811,col 70)",
        "(line 812,col 9)-(line 813,col 64)",
        "(line 814,col 9)-(line 820,col 9)",
        "(line 821,col 9)-(line 821,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 825,
      "end_line": 838,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 829,col 9)-(line 829,col 70)",
        "(line 830,col 9)-(line 831,col 64)",
        "(line 832,col 9)-(line 836,col 9)",
        "(line 837,col 9)-(line 837,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 841,
      "end_line": 854,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 843,col 9)-(line 843,col 46)",
        "(line 844,col 9)-(line 844,col 49)",
        "(line 845,col 9)-(line 845,col 66)",
        "(line 846,col 9)-(line 852,col 9)",
        "(line 853,col 9)-(line 853,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 857,
      "end_line": 868,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 859,col 9)-(line 859,col 46)",
        "(line 860,col 9)-(line 860,col 49)",
        "(line 861,col 9)-(line 861,col 66)",
        "(line 862,col 9)-(line 866,col 9)",
        "(line 867,col 9)-(line 867,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 871,
      "end_line": 886,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 875,col 9)-(line 875,col 70)",
        "(line 876,col 9)-(line 877,col 64)",
        "(line 878,col 9)-(line 884,col 9)",
        "(line 885,col 9)-(line 885,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 889,
      "end_line": 902,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 893,col 9)-(line 893,col 70)",
        "(line 894,col 9)-(line 895,col 64)",
        "(line 896,col 9)-(line 900,col 9)",
        "(line 901,col 9)-(line 901,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 905,
      "end_line": 908,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 907,col 9)-(line 907,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 911,
      "end_line": 914,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 913,col 9)-(line 913,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 917,
      "end_line": 922,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 921,col 9)-(line 921,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 925,
      "end_line": 930,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 929,col 9)-(line 929,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.toString()",
      "begin_line": 936,
      "end_line": 962,
      "comment": "\n     * Get a string representation for this matrix.\n     * @return a string representation for this matrix\n     ",
      "child_ranges": [
        "(line 938,col 9)-(line 938,col 44)",
        "(line 939,col 9)-(line 939,col 47)",
        "(line 940,col 9)-(line 940,col 52)",
        "(line 941,col 9)-(line 941,col 52)",
        "(line 942,col 9)-(line 942,col 92)",
        "(line 943,col 9)-(line 943,col 47)",
        "(line 945,col 9)-(line 957,col 9)",
        "(line 959,col 9)-(line 959,col 24)",
        "(line 960,col 9)-(line 960,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.equals(java.lang.Object)",
      "begin_line": 972,
      "end_line": 994,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eFieldMatrix\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.\n     *\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 974,col 9)-(line 976,col 9)",
        "(line 977,col 9)-(line 979,col 9)",
        "(line 980,col 9)-(line 980,col 51)",
        "(line 981,col 9)-(line 981,col 44)",
        "(line 982,col 9)-(line 982,col 47)",
        "(line 983,col 9)-(line 985,col 9)",
        "(line 986,col 9)-(line 992,col 9)",
        "(line 993,col 9)-(line 993,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.hashCode()",
      "begin_line": 1001,
      "end_line": 1014,
      "comment": "\n     * Computes a hashcode for the matrix.\n     *\n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 1003,col 9)-(line 1003,col 25)",
        "(line 1004,col 9)-(line 1004,col 44)",
        "(line 1005,col 9)-(line 1005,col 47)",
        "(line 1006,col 9)-(line 1006,col 31)",
        "(line 1007,col 9)-(line 1007,col 31)",
        "(line 1008,col 9)-(line 1012,col 9)",
        "(line 1013,col 9)-(line 1013,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkRowIndex(int)",
      "begin_line": 1021,
      "end_line": 1026,
      "comment": "\n     * Check if a row index is valid.\n     * @param row row index to check\n     * @exception MatrixIndexException if index is not valid\n     ",
      "child_ranges": [
        "(line 1022,col 9)-(line 1025,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkColumnIndex(int)",
      "begin_line": 1033,
      "end_line": 1039,
      "comment": "\n     * Check if a column index is valid.\n     * @param column column index to check\n     * @exception MatrixIndexException if index is not valid\n     ",
      "child_ranges": [
        "(line 1035,col 9)-(line 1038,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkSubMatrixIndex(int, int, int, int)",
      "begin_line": 1051,
      "end_line": 1068,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param startRow Initial row index\n     * @param endRow Final row index\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @exception MatrixIndexException  if the indices are not valid\n     ",
      "child_ranges": [
        "(line 1053,col 9)-(line 1053,col 32)",
        "(line 1054,col 9)-(line 1054,col 30)",
        "(line 1055,col 9)-(line 1058,col 9)",
        "(line 1060,col 9)-(line 1060,col 38)",
        "(line 1061,col 9)-(line 1061,col 36)",
        "(line 1062,col 9)-(line 1065,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkSubMatrixIndex(int[], int[])",
      "begin_line": 1078,
      "end_line": 1092,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param selectedRows Array of row indices.\n     * @param selectedColumns Array of column indices.\n     * @exception MatrixIndexException if row or column selections are not valid\n     ",
      "child_ranges": [
        "(line 1079,col 9)-(line 1084,col 9)",
        "(line 1086,col 9)-(line 1088,col 9)",
        "(line 1089,col 9)-(line 1091,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkAdditionCompatible(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 1099,
      "end_line": 1107,
      "comment": "\n     * Check if a matrix is addition compatible with the instance\n     * @param m matrix to check\n     * @exception IllegalArgumentException if matrix is not addition compatible with instance\n     ",
      "child_ranges": [
        "(line 1100,col 9)-(line 1106,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkSubtractionCompatible(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 1114,
      "end_line": 1122,
      "comment": "\n     * Check if a matrix is subtraction compatible with the instance\n     * @param m matrix to check\n     * @exception IllegalArgumentException if matrix is not subtraction compatible with instance\n     ",
      "child_ranges": [
        "(line 1115,col 9)-(line 1121,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkMultiplicationCompatible(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 1129,
      "end_line": 1136,
      "comment": "\n     * Check if a matrix is multiplication compatible with the instance\n     * @param m matrix to check\n     * @exception IllegalArgumentException if matrix is not multiplication compatible with instance\n     ",
      "child_ranges": [
        "(line 1130,col 9)-(line 1135,col 9)"
      ]
    }
  ]
}