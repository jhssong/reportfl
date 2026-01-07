{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/linear/AbstractFieldMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractFieldMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.FieldMatrix\u003cT\u003e"
      ],
      "begin_line": 38,
      "end_line": 1109,
      "comment": "\n * Basic implementation of {@link FieldMatrix} methods regardless of the underlying storage.\n * \u003cp\u003eAll the methods implemented here use {@link #getEntry(int, int)} to access\n * matrix elements. Derived class can provide faster implementations. \u003c/p\u003e\n *\n * @param \u003cT\u003e the type of the field elements\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Field to which the elements belong. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.AbstractFieldMatrix()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Constructor for use with Serializable\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.AbstractFieldMatrix(org.apache.commons.math.Field\u003cT\u003e)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Creates a matrix with no data\n     * @param field field to which the elements belong\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.AbstractFieldMatrix(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 66,
      "end_line": 78,
      "comment": "\n     * Create a new FieldMatrix\u003cT\u003e with the supplied row and column dimensions.\n     *\n     * @param field field to which the elements belong\n     * @param rowDimension  the number of rows in the new matrix\n     * @param columnDimension  the number of columns in the new matrix\n     * @throws IllegalArgumentException if row or column dimension is not positive\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 76,col 9)",
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
        "(line 151,col 9)-(line 152,col 80)",
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
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.Anonymous-1ec12e95-ade3-4d66-857a-9476ae73b977.visit(int, int, T)",
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
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.Anonymous-3690f292-f380-4af6-a905-d9069cf16746.start(int, int, int, int, int, int)",
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
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.Anonymous-d8dfb1b9-ce6b-449b-b96e-ecef1817323a.visit(int, int, T)",
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
      "end_line": 462,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 27)",
        "(line 451,col 9)-(line 451,col 47)",
        "(line 452,col 9)-(line 457,col 9)",
        "(line 458,col 9)-(line 460,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getColumnMatrix(int)",
      "begin_line": 465,
      "end_line": 477,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 33)",
        "(line 469,col 9)-(line 469,col 44)",
        "(line 470,col 9)-(line 470,col 58)",
        "(line 471,col 9)-(line 473,col 9)",
        "(line 475,col 9)-(line 475,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setColumnMatrix(int, org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 480,
      "end_line": 493,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 33)",
        "(line 482,col 9)-(line 482,col 44)",
        "(line 483,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 491,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getRowVector(int)",
      "begin_line": 496,
      "end_line": 499,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setRowVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 502,
      "end_line": 513,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 27)",
        "(line 504,col 9)-(line 504,col 47)",
        "(line 505,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 511,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getColumnVector(int)",
      "begin_line": 516,
      "end_line": 519,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setColumnVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 522,
      "end_line": 533,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 523,col 9)-(line 523,col 33)",
        "(line 524,col 9)-(line 524,col 44)",
        "(line 525,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 531,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getRow(int)",
      "begin_line": 536,
      "end_line": 548,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 27)",
        "(line 540,col 9)-(line 540,col 47)",
        "(line 541,col 9)-(line 541,col 49)",
        "(line 542,col 9)-(line 544,col 9)",
        "(line 546,col 9)-(line 546,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setRow(int, T[])",
      "begin_line": 551,
      "end_line": 561,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 27)",
        "(line 553,col 9)-(line 553,col 47)",
        "(line 554,col 9)-(line 556,col 9)",
        "(line 557,col 9)-(line 559,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getColumn(int)",
      "begin_line": 564,
      "end_line": 576,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 33)",
        "(line 568,col 9)-(line 568,col 44)",
        "(line 569,col 9)-(line 569,col 49)",
        "(line 570,col 9)-(line 572,col 9)",
        "(line 574,col 9)-(line 574,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setColumn(int, T[])",
      "begin_line": 579,
      "end_line": 588,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 33)",
        "(line 581,col 9)-(line 581,col 44)",
        "(line 582,col 9)-(line 584,col 9)",
        "(line 585,col 9)-(line 587,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getEntry(int, int)",
      "begin_line": 591,
      "end_line": 592,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setEntry(int, int, T)",
      "begin_line": 595,
      "end_line": 596,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.addToEntry(int, int, T)",
      "begin_line": 599,
      "end_line": 600,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.multiplyEntry(int, int, T)",
      "begin_line": 603,
      "end_line": 604,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.transpose()",
      "begin_line": 607,
      "end_line": 620,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 44)",
        "(line 609,col 9)-(line 609,col 47)",
        "(line 610,col 9)-(line 610,col 62)",
        "(line 611,col 9)-(line 617,col 11)",
        "(line 619,col 9)-(line 619,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.Anonymous-434f0510-3486-4d87-9ffb-fc9a026e0f56.visit(int, int, T)",
      "begin_line": 613,
      "end_line": 616,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 615,col 17)-(line 615,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.isSquare()",
      "begin_line": 623,
      "end_line": 625,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 624,col 9)-(line 624,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getRowDimension()",
      "begin_line": 628,
      "end_line": 628,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getColumnDimension()",
      "begin_line": 631,
      "end_line": 631,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getTrace()",
      "begin_line": 634,
      "end_line": 646,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 44)",
        "(line 637,col 9)-(line 637,col 47)",
        "(line 638,col 9)-(line 640,col 8)",
        "(line 641,col 9)-(line 641,col 34)",
        "(line 642,col 9)-(line 644,col 9)",
        "(line 645,col 9)-(line 645,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.operate(T[])",
      "begin_line": 649,
      "end_line": 670,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 44)",
        "(line 653,col 9)-(line 653,col 47)",
        "(line 654,col 9)-(line 658,col 9)",
        "(line 660,col 9)-(line 660,col 49)",
        "(line 661,col 9)-(line 667,col 9)",
        "(line 669,col 9)-(line 669,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.operate(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 673,
      "end_line": 697,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 675,col 9)-(line 696,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.preMultiply(T[])",
      "begin_line": 700,
      "end_line": 721,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 703,col 9)-(line 703,col 44)",
        "(line 704,col 9)-(line 704,col 47)",
        "(line 705,col 9)-(line 709,col 9)",
        "(line 711,col 9)-(line 711,col 49)",
        "(line 712,col 9)-(line 718,col 9)",
        "(line 720,col 9)-(line 720,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.preMultiply(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 724,
      "end_line": 749,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 726,col 9)-(line 748,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 752,
      "end_line": 765,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 754,col 9)-(line 754,col 46)",
        "(line 755,col 9)-(line 755,col 49)",
        "(line 756,col 9)-(line 756,col 66)",
        "(line 757,col 9)-(line 763,col 9)",
        "(line 764,col 9)-(line 764,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 768,
      "end_line": 779,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 770,col 9)-(line 770,col 46)",
        "(line 771,col 9)-(line 771,col 49)",
        "(line 772,col 9)-(line 772,col 66)",
        "(line 773,col 9)-(line 777,col 9)",
        "(line 778,col 9)-(line 778,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 782,
      "end_line": 797,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 786,col 9)-(line 786,col 70)",
        "(line 787,col 9)-(line 788,col 64)",
        "(line 789,col 9)-(line 795,col 9)",
        "(line 796,col 9)-(line 796,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 800,
      "end_line": 813,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 804,col 9)-(line 804,col 70)",
        "(line 805,col 9)-(line 806,col 64)",
        "(line 807,col 9)-(line 811,col 9)",
        "(line 812,col 9)-(line 812,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 816,
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
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 832,
      "end_line": 843,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 834,col 9)-(line 834,col 46)",
        "(line 835,col 9)-(line 835,col 49)",
        "(line 836,col 9)-(line 836,col 66)",
        "(line 837,col 9)-(line 841,col 9)",
        "(line 842,col 9)-(line 842,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 846,
      "end_line": 861,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 850,col 9)-(line 850,col 70)",
        "(line 851,col 9)-(line 852,col 64)",
        "(line 853,col 9)-(line 859,col 9)",
        "(line 860,col 9)-(line 860,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 864,
      "end_line": 877,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 868,col 9)-(line 868,col 70)",
        "(line 869,col 9)-(line 870,col 64)",
        "(line 871,col 9)-(line 875,col 9)",
        "(line 876,col 9)-(line 876,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 880,
      "end_line": 883,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 882,col 9)-(line 882,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 886,
      "end_line": 889,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 888,col 9)-(line 888,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 892,
      "end_line": 897,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 896,col 9)-(line 896,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 900,
      "end_line": 905,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 904,col 9)-(line 904,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.toString()",
      "begin_line": 911,
      "end_line": 936,
      "comment": "\n     * Get a string representation for this matrix.\n     * @return a string representation for this matrix\n     ",
      "child_ranges": [
        "(line 913,col 9)-(line 913,col 44)",
        "(line 914,col 9)-(line 914,col 47)",
        "(line 915,col 9)-(line 915,col 52)",
        "(line 916,col 9)-(line 916,col 52)",
        "(line 917,col 9)-(line 917,col 92)",
        "(line 918,col 9)-(line 918,col 47)",
        "(line 920,col 9)-(line 932,col 9)",
        "(line 934,col 9)-(line 934,col 24)",
        "(line 935,col 9)-(line 935,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.equals(java.lang.Object)",
      "begin_line": 946,
      "end_line": 968,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eFieldMatrix\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.\n     *\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 948,col 9)-(line 950,col 9)",
        "(line 951,col 9)-(line 953,col 9)",
        "(line 954,col 9)-(line 954,col 51)",
        "(line 955,col 9)-(line 955,col 44)",
        "(line 956,col 9)-(line 956,col 47)",
        "(line 957,col 9)-(line 959,col 9)",
        "(line 960,col 9)-(line 966,col 9)",
        "(line 967,col 9)-(line 967,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.hashCode()",
      "begin_line": 975,
      "end_line": 988,
      "comment": "\n     * Computes a hashcode for the matrix.\n     *\n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 977,col 9)-(line 977,col 25)",
        "(line 978,col 9)-(line 978,col 44)",
        "(line 979,col 9)-(line 979,col 47)",
        "(line 980,col 9)-(line 980,col 31)",
        "(line 981,col 9)-(line 981,col 31)",
        "(line 982,col 9)-(line 986,col 9)",
        "(line 987,col 9)-(line 987,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkRowIndex(int)",
      "begin_line": 995,
      "end_line": 1000,
      "comment": "\n     * Check if a row index is valid.\n     * @param row row index to check\n     * @exception MatrixIndexException if index is not valid\n     ",
      "child_ranges": [
        "(line 996,col 9)-(line 999,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkColumnIndex(int)",
      "begin_line": 1007,
      "end_line": 1013,
      "comment": "\n     * Check if a column index is valid.\n     * @param column column index to check\n     * @exception MatrixIndexException if index is not valid\n     ",
      "child_ranges": [
        "(line 1009,col 9)-(line 1012,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkSubMatrixIndex(int, int, int, int)",
      "begin_line": 1025,
      "end_line": 1040,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param startRow Initial row index\n     * @param endRow Final row index\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @exception MatrixIndexException  if the indices are not valid\n     ",
      "child_ranges": [
        "(line 1027,col 9)-(line 1027,col 32)",
        "(line 1028,col 9)-(line 1028,col 30)",
        "(line 1029,col 9)-(line 1032,col 9)",
        "(line 1034,col 9)-(line 1034,col 38)",
        "(line 1035,col 9)-(line 1035,col 36)",
        "(line 1036,col 9)-(line 1039,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkSubMatrixIndex(int[], int[])",
      "begin_line": 1050,
      "end_line": 1064,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param selectedRows Array of row indices.\n     * @param selectedColumns Array of column indices.\n     * @exception MatrixIndexException if row or column selections are not valid\n     ",
      "child_ranges": [
        "(line 1051,col 9)-(line 1056,col 9)",
        "(line 1058,col 9)-(line 1060,col 9)",
        "(line 1061,col 9)-(line 1063,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkAdditionCompatible(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 1071,
      "end_line": 1079,
      "comment": "\n     * Check if a matrix is addition compatible with the instance\n     * @param m matrix to check\n     * @exception IllegalArgumentException if matrix is not addition compatible with instance\n     ",
      "child_ranges": [
        "(line 1072,col 9)-(line 1078,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkSubtractionCompatible(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 1086,
      "end_line": 1094,
      "comment": "\n     * Check if a matrix is subtraction compatible with the instance\n     * @param m matrix to check\n     * @exception IllegalArgumentException if matrix is not subtraction compatible with instance\n     ",
      "child_ranges": [
        "(line 1087,col 9)-(line 1093,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkMultiplicationCompatible(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 1101,
      "end_line": 1108,
      "comment": "\n     * Check if a matrix is multiplication compatible with the instance\n     * @param m matrix to check\n     * @exception IllegalArgumentException if matrix is not multiplication compatible with instance\n     ",
      "child_ranges": [
        "(line 1102,col 9)-(line 1107,col 9)"
      ]
    }
  ]
}