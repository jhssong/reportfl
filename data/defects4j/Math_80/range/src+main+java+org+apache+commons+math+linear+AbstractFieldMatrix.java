{
  "filepath": "/tmp/Math-80b/src/main/java/org/apache/commons/math/linear/AbstractFieldMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractFieldMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.FieldMatrix\u003cT\u003e"
      ],
      "begin_line": 36,
      "end_line": 1140,
      "comment": "\n * Basic implementation of {@link FieldMatrix} methods regardless of the underlying storage.\n * \u003cp\u003eAll the methods implemented here use {@link #getEntry(int, int)} to access\n * matrix elements. Derived class can provide faster implementations. \u003c/p\u003e\n *\n * @param \u003cT\u003e the type of the field elements\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Field to which the elements belong. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.AbstractFieldMatrix()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Constructor for use with Serializable\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.AbstractFieldMatrix(org.apache.commons.math.Field\u003cT\u003e)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Creates a matrix with no data\n     * @param field field to which the elements belong\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.AbstractFieldMatrix(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 64,
      "end_line": 78,
      "comment": "\n     * Create a new FieldMatrix\u003cT\u003e with the supplied row and column dimensions.\n     *\n     * @param field field to which the elements belong\n     * @param rowDimension  the number of rows in the new matrix\n     * @param columnDimension  the number of columns in the new matrix\n     * @throws IllegalArgumentException if row or column dimension is not positive\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 71,col 9)",
        "(line 72,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.extractField(T[][])",
      "begin_line": 87,
      "end_line": 96,
      "comment": "\n     * Get the elements type from an array.\n     * @param \u003cT\u003e the type of the field elements\n     * @param d data array\n     * @return field to which array elements belong\n     * @exception IllegalArgumentException if array is empty\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.extractField(T[])",
      "begin_line": 105,
      "end_line": 111,
      "comment": "\n     * Get the elements type from an array.\n     * @param \u003cT\u003e the type of the field elements\n     * @param d data array\n     * @return field to which array elements belong\n     * @exception IllegalArgumentException if array is empty\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.buildArray(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 124,
      "end_line": 138,
      "comment": " Build an array of elements.\n     * \u003cp\u003e\n     * Complete arrays are filled with field.getZero()\n     * \u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param field field to which array elements belong\n     * @param rows number of rows\n     * @param columns number of columns (may be negative to build partial\n     * arrays in the same way \u003ccode\u003enew Field[rows][]\u003c/code\u003e works)\n     * @return a new array\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 133,col 95)",
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.buildArray(org.apache.commons.math.Field\u003cT\u003e, int)",
      "begin_line": 149,
      "end_line": 155,
      "comment": " Build an array of elements.\n     * \u003cp\u003e\n     * Arrays are filled with field.getZero()\n     * \u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param field field to which array elements belong\n     * @param length of the array\n     * @return a new array\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 80)",
        "(line 153,col 9)-(line 153,col 44)",
        "(line 154,col 9)-(line 154,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getField()",
      "begin_line": 158,
      "end_line": 160,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.createMatrix(int, int)",
      "begin_line": 163,
      "end_line": 164,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.copy()",
      "begin_line": 167,
      "end_line": 167,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.add(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 170,
      "end_line": 186,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 35)",
        "(line 175,col 9)-(line 175,col 50)",
        "(line 176,col 9)-(line 176,col 53)",
        "(line 177,col 9)-(line 177,col 71)",
        "(line 178,col 9)-(line 182,col 9)",
        "(line 184,col 9)-(line 184,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.subtract(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 189,
      "end_line": 205,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 38)",
        "(line 194,col 9)-(line 194,col 50)",
        "(line 195,col 9)-(line 195,col 53)",
        "(line 196,col 9)-(line 196,col 71)",
        "(line 197,col 9)-(line 201,col 9)",
        "(line 203,col 9)-(line 203,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.scalarAdd(T)",
      "begin_line": 208,
      "end_line": 221,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 50)",
        "(line 211,col 9)-(line 211,col 53)",
        "(line 212,col 9)-(line 212,col 71)",
        "(line 213,col 9)-(line 217,col 9)",
        "(line 219,col 9)-(line 219,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.scalarMultiply(T)",
      "begin_line": 224,
      "end_line": 237,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 50)",
        "(line 227,col 9)-(line 227,col 53)",
        "(line 228,col 9)-(line 228,col 71)",
        "(line 229,col 9)-(line 233,col 9)",
        "(line 235,col 9)-(line 235,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.multiply(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 240,
      "end_line": 262,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 41)",
        "(line 246,col 9)-(line 246,col 44)",
        "(line 247,col 9)-(line 247,col 49)",
        "(line 248,col 9)-(line 248,col 47)",
        "(line 249,col 9)-(line 249,col 62)",
        "(line 250,col 9)-(line 258,col 9)",
        "(line 260,col 9)-(line 260,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.preMultiply(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 265,
      "end_line": 268,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getData()",
      "begin_line": 271,
      "end_line": 284,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 86)",
        "(line 275,col 9)-(line 280,col 9)",
        "(line 282,col 9)-(line 282,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 287,
      "end_line": 303,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 70)",
        "(line 293,col 9)-(line 294,col 77)",
        "(line 295,col 9)-(line 299,col 9)",
        "(line 301,col 9)-(line 301,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getSubMatrix(int[], int[])",
      "begin_line": 306,
      "end_line": 327,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 59)",
        "(line 313,col 9)-(line 314,col 70)",
        "(line 315,col 9)-(line 323,col 11)",
        "(line 325,col 9)-(line 325,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.Anonymous-a2254bf5-fa04-498e-a2f5-c6cb0542db55.visit(int, int, T)",
      "begin_line": 318,
      "end_line": 321,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 320,col 17)-(line 320,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.copySubMatrix(int, int, int, int, T[][])",
      "begin_line": 330,
      "end_line": 372,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 70)",
        "(line 337,col 9)-(line 337,col 55)",
        "(line 338,col 9)-(line 338,col 61)",
        "(line 339,col 9)-(line 344,col 9)",
        "(line 347,col 9)-(line 370,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "startRow"
      ],
      "begin_line": 350,
      "end_line": 350,
      "comment": " Initial row index. "
    },
    {
      "type": "field",
      "varNames": [
        "startColumn"
      ],
      "begin_line": 353,
      "end_line": 353,
      "comment": " Initial column index. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.Anonymous-f2237a02-6f6f-434f-a11f-0985d88efa2e.start(int, int, int, int, int, int)",
      "begin_line": 356,
      "end_line": 362,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 360,col 17)-(line 360,col 44)",
        "(line 361,col 17)-(line 361,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.Anonymous-e3fdebd0-ce12-45fc-80ae-276a3adfe872.visit(int, int, T)",
      "begin_line": 365,
      "end_line": 368,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 367,col 17)-(line 367,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.copySubMatrix(int[], int[], T[][])",
      "begin_line": 375,
      "end_line": 396,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 59)",
        "(line 380,col 9)-(line 386,col 9)",
        "(line 389,col 9)-(line 394,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setSubMatrix(T[][], int, int)",
      "begin_line": 399,
      "end_line": 431,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 43)",
        "(line 403,col 9)-(line 405,col 9)",
        "(line 407,col 9)-(line 407,col 46)",
        "(line 408,col 9)-(line 410,col 9)",
        "(line 412,col 9)-(line 418,col 9)",
        "(line 420,col 9)-(line 420,col 27)",
        "(line 421,col 9)-(line 421,col 33)",
        "(line 422,col 9)-(line 422,col 39)",
        "(line 423,col 9)-(line 423,col 45)",
        "(line 425,col 9)-(line 429,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getRowMatrix(int)",
      "begin_line": 434,
      "end_line": 446,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 27)",
        "(line 438,col 9)-(line 438,col 47)",
        "(line 439,col 9)-(line 439,col 58)",
        "(line 440,col 9)-(line 442,col 9)",
        "(line 444,col 9)-(line 444,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setRowMatrix(int, org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 449,
      "end_line": 464,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 27)",
        "(line 453,col 9)-(line 453,col 47)",
        "(line 454,col 9)-(line 459,col 9)",
        "(line 460,col 9)-(line 462,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getColumnMatrix(int)",
      "begin_line": 467,
      "end_line": 479,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 33)",
        "(line 471,col 9)-(line 471,col 44)",
        "(line 472,col 9)-(line 472,col 58)",
        "(line 473,col 9)-(line 475,col 9)",
        "(line 477,col 9)-(line 477,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setColumnMatrix(int, org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 482,
      "end_line": 497,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 33)",
        "(line 486,col 9)-(line 486,col 44)",
        "(line 487,col 9)-(line 492,col 9)",
        "(line 493,col 9)-(line 495,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getRowVector(int)",
      "begin_line": 500,
      "end_line": 503,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setRowVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 506,
      "end_line": 520,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 27)",
        "(line 510,col 9)-(line 510,col 47)",
        "(line 511,col 9)-(line 515,col 9)",
        "(line 516,col 9)-(line 518,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getColumnVector(int)",
      "begin_line": 523,
      "end_line": 526,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 525,col 9)-(line 525,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setColumnVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 529,
      "end_line": 543,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 33)",
        "(line 533,col 9)-(line 533,col 44)",
        "(line 534,col 9)-(line 538,col 9)",
        "(line 539,col 9)-(line 541,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getRow(int)",
      "begin_line": 546,
      "end_line": 558,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 549,col 9)-(line 549,col 27)",
        "(line 550,col 9)-(line 550,col 47)",
        "(line 551,col 9)-(line 551,col 49)",
        "(line 552,col 9)-(line 554,col 9)",
        "(line 556,col 9)-(line 556,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setRow(int, T[])",
      "begin_line": 561,
      "end_line": 575,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 564,col 9)-(line 564,col 27)",
        "(line 565,col 9)-(line 565,col 47)",
        "(line 566,col 9)-(line 570,col 9)",
        "(line 571,col 9)-(line 573,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getColumn(int)",
      "begin_line": 578,
      "end_line": 590,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 33)",
        "(line 582,col 9)-(line 582,col 44)",
        "(line 583,col 9)-(line 583,col 49)",
        "(line 584,col 9)-(line 586,col 9)",
        "(line 588,col 9)-(line 588,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setColumn(int, T[])",
      "begin_line": 593,
      "end_line": 607,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 33)",
        "(line 597,col 9)-(line 597,col 44)",
        "(line 598,col 9)-(line 602,col 9)",
        "(line 603,col 9)-(line 605,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getEntry(int, int)",
      "begin_line": 610,
      "end_line": 611,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setEntry(int, int, T)",
      "begin_line": 614,
      "end_line": 615,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.addToEntry(int, int, T)",
      "begin_line": 618,
      "end_line": 619,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.multiplyEntry(int, int, T)",
      "begin_line": 622,
      "end_line": 623,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.transpose()",
      "begin_line": 626,
      "end_line": 643,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 44)",
        "(line 629,col 9)-(line 629,col 47)",
        "(line 630,col 9)-(line 630,col 62)",
        "(line 631,col 9)-(line 639,col 11)",
        "(line 641,col 9)-(line 641,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.Anonymous-bb4cfc39-28b6-4abf-802b-d1f63ea5f66c.visit(int, int, T)",
      "begin_line": 634,
      "end_line": 637,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 636,col 17)-(line 636,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.isSquare()",
      "begin_line": 646,
      "end_line": 648,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 647,col 9)-(line 647,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getRowDimension()",
      "begin_line": 651,
      "end_line": 651,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getColumnDimension()",
      "begin_line": 654,
      "end_line": 654,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getTrace()",
      "begin_line": 657,
      "end_line": 669,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 659,col 9)-(line 659,col 44)",
        "(line 660,col 9)-(line 660,col 47)",
        "(line 661,col 9)-(line 663,col 8)",
        "(line 664,col 9)-(line 664,col 34)",
        "(line 665,col 9)-(line 667,col 9)",
        "(line 668,col 9)-(line 668,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.operate(T[])",
      "begin_line": 672,
      "end_line": 694,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 44)",
        "(line 676,col 9)-(line 676,col 47)",
        "(line 677,col 9)-(line 681,col 9)",
        "(line 683,col 9)-(line 683,col 49)",
        "(line 684,col 9)-(line 690,col 9)",
        "(line 692,col 9)-(line 692,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.operate(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 697,
      "end_line": 721,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 699,col 9)-(line 720,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.preMultiply(T[])",
      "begin_line": 724,
      "end_line": 746,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 727,col 9)-(line 727,col 44)",
        "(line 728,col 9)-(line 728,col 47)",
        "(line 729,col 9)-(line 733,col 9)",
        "(line 735,col 9)-(line 735,col 49)",
        "(line 736,col 9)-(line 742,col 9)",
        "(line 744,col 9)-(line 744,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.preMultiply(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 749,
      "end_line": 775,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 751,col 9)-(line 774,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 778,
      "end_line": 791,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 780,col 9)-(line 780,col 46)",
        "(line 781,col 9)-(line 781,col 49)",
        "(line 782,col 9)-(line 782,col 66)",
        "(line 783,col 9)-(line 789,col 9)",
        "(line 790,col 9)-(line 790,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 794,
      "end_line": 805,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 46)",
        "(line 797,col 9)-(line 797,col 49)",
        "(line 798,col 9)-(line 798,col 66)",
        "(line 799,col 9)-(line 803,col 9)",
        "(line 804,col 9)-(line 804,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 808,
      "end_line": 823,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 812,col 9)-(line 812,col 70)",
        "(line 813,col 9)-(line 814,col 64)",
        "(line 815,col 9)-(line 821,col 9)",
        "(line 822,col 9)-(line 822,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 826,
      "end_line": 839,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 830,col 9)-(line 830,col 70)",
        "(line 831,col 9)-(line 832,col 64)",
        "(line 833,col 9)-(line 837,col 9)",
        "(line 838,col 9)-(line 838,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 842,
      "end_line": 855,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 844,col 9)-(line 844,col 46)",
        "(line 845,col 9)-(line 845,col 49)",
        "(line 846,col 9)-(line 846,col 66)",
        "(line 847,col 9)-(line 853,col 9)",
        "(line 854,col 9)-(line 854,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 858,
      "end_line": 869,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 860,col 9)-(line 860,col 46)",
        "(line 861,col 9)-(line 861,col 49)",
        "(line 862,col 9)-(line 862,col 66)",
        "(line 863,col 9)-(line 867,col 9)",
        "(line 868,col 9)-(line 868,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 872,
      "end_line": 887,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 876,col 9)-(line 876,col 70)",
        "(line 877,col 9)-(line 878,col 64)",
        "(line 879,col 9)-(line 885,col 9)",
        "(line 886,col 9)-(line 886,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 890,
      "end_line": 903,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 894,col 9)-(line 894,col 70)",
        "(line 895,col 9)-(line 896,col 64)",
        "(line 897,col 9)-(line 901,col 9)",
        "(line 902,col 9)-(line 902,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 906,
      "end_line": 909,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 908,col 9)-(line 908,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 912,
      "end_line": 915,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 914,col 9)-(line 914,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 918,
      "end_line": 923,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 922,col 9)-(line 922,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 926,
      "end_line": 931,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 930,col 9)-(line 930,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.toString()",
      "begin_line": 937,
      "end_line": 963,
      "comment": "\n     * Get a string representation for this matrix.\n     * @return a string representation for this matrix\n     ",
      "child_ranges": [
        "(line 939,col 9)-(line 939,col 44)",
        "(line 940,col 9)-(line 940,col 47)",
        "(line 941,col 9)-(line 941,col 52)",
        "(line 942,col 9)-(line 942,col 52)",
        "(line 943,col 9)-(line 943,col 92)",
        "(line 944,col 9)-(line 944,col 47)",
        "(line 946,col 9)-(line 958,col 9)",
        "(line 960,col 9)-(line 960,col 24)",
        "(line 961,col 9)-(line 961,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.equals(java.lang.Object)",
      "begin_line": 973,
      "end_line": 996,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eFieldMatrix\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.\n     *\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 976,col 9)-(line 978,col 9)",
        "(line 979,col 9)-(line 981,col 9)",
        "(line 982,col 9)-(line 982,col 51)",
        "(line 983,col 9)-(line 983,col 44)",
        "(line 984,col 9)-(line 984,col 47)",
        "(line 985,col 9)-(line 987,col 9)",
        "(line 988,col 9)-(line 994,col 9)",
        "(line 995,col 9)-(line 995,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.hashCode()",
      "begin_line": 1003,
      "end_line": 1016,
      "comment": "\n     * Computes a hashcode for the matrix.\n     *\n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 1005,col 9)-(line 1005,col 25)",
        "(line 1006,col 9)-(line 1006,col 44)",
        "(line 1007,col 9)-(line 1007,col 47)",
        "(line 1008,col 9)-(line 1008,col 31)",
        "(line 1009,col 9)-(line 1009,col 31)",
        "(line 1010,col 9)-(line 1014,col 9)",
        "(line 1015,col 9)-(line 1015,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkRowIndex(int)",
      "begin_line": 1023,
      "end_line": 1028,
      "comment": "\n     * Check if a row index is valid.\n     * @param row row index to check\n     * @exception MatrixIndexException if index is not valid\n     ",
      "child_ranges": [
        "(line 1024,col 9)-(line 1027,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkColumnIndex(int)",
      "begin_line": 1035,
      "end_line": 1041,
      "comment": "\n     * Check if a column index is valid.\n     * @param column column index to check\n     * @exception MatrixIndexException if index is not valid\n     ",
      "child_ranges": [
        "(line 1037,col 9)-(line 1040,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkSubMatrixIndex(int, int, int, int)",
      "begin_line": 1053,
      "end_line": 1070,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param startRow Initial row index\n     * @param endRow Final row index\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @exception MatrixIndexException  if the indices are not valid\n     ",
      "child_ranges": [
        "(line 1055,col 9)-(line 1055,col 32)",
        "(line 1056,col 9)-(line 1056,col 30)",
        "(line 1057,col 9)-(line 1060,col 9)",
        "(line 1062,col 9)-(line 1062,col 38)",
        "(line 1063,col 9)-(line 1063,col 36)",
        "(line 1064,col 9)-(line 1067,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkSubMatrixIndex(int[], int[])",
      "begin_line": 1080,
      "end_line": 1094,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param selectedRows Array of row indices.\n     * @param selectedColumns Array of column indices.\n     * @exception MatrixIndexException if row or column selections are not valid\n     ",
      "child_ranges": [
        "(line 1081,col 9)-(line 1086,col 9)",
        "(line 1088,col 9)-(line 1090,col 9)",
        "(line 1091,col 9)-(line 1093,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkAdditionCompatible(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 1101,
      "end_line": 1109,
      "comment": "\n     * Check if a matrix is addition compatible with the instance\n     * @param m matrix to check\n     * @exception IllegalArgumentException if matrix is not addition compatible with instance\n     ",
      "child_ranges": [
        "(line 1102,col 9)-(line 1108,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkSubtractionCompatible(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 1116,
      "end_line": 1124,
      "comment": "\n     * Check if a matrix is subtraction compatible with the instance\n     * @param m matrix to check\n     * @exception IllegalArgumentException if matrix is not subtraction compatible with instance\n     ",
      "child_ranges": [
        "(line 1117,col 9)-(line 1123,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkMultiplicationCompatible(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 1131,
      "end_line": 1138,
      "comment": "\n     * Check if a matrix is multiplication compatible with the instance\n     * @param m matrix to check\n     * @exception IllegalArgumentException if matrix is not multiplication compatible with instance\n     ",
      "child_ranges": [
        "(line 1132,col 9)-(line 1137,col 9)"
      ]
    }
  ]
}