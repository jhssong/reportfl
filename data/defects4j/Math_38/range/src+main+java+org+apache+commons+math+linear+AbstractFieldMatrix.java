{
  "filepath": "/tmp/Math-38b/src/main/java/org/apache/commons/math/linear/AbstractFieldMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractFieldMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.FieldMatrix\u003cT\u003e"
      ],
      "begin_line": 44,
      "end_line": 1123,
      "comment": "\n * Basic implementation of {@link FieldMatrix} methods regardless of the underlying storage.\n * \u003cp\u003eAll the methods implemented here use {@link #getEntry(int, int)} to access\n * matrix elements. Derived class can provide faster implementations. \u003c/p\u003e\n *\n * @param \u003cT\u003e Type of the field elements.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Field to which the elements belong. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.AbstractFieldMatrix()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Constructor for use with Serializable\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.AbstractFieldMatrix(org.apache.commons.math.Field\u003cT\u003e)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Creates a matrix with no data\n     * @param field field to which the elements belong\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.AbstractFieldMatrix(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 73,
      "end_line": 85,
      "comment": "\n     * Create a new FieldMatrix\u003cT\u003e with the supplied row and column dimensions.\n     *\n     * @param field Field to which the elements belong.\n     * @param rowDimension Number of rows in the new matrix.\n     * @param columnDimension Number of columns in the new matrix.\n     * @throws NotStrictlyPositiveException if row or column dimension is not\n     * positive.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.extractField(T[][])",
      "begin_line": 96,
      "end_line": 107,
      "comment": "\n     * Get the elements type from an array.\n     *\n     * @param \u003cT\u003e Type of the field elements.\n     * @param d Data array.\n     * @return the field to which the array elements belong.\n     * @throws NullArgumentException if the array is {@code null}.\n     * @throws NoDataException if the array is empty.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.extractField(T[])",
      "begin_line": 117,
      "end_line": 122,
      "comment": "\n     * Get the elements type from an array.\n     *\n     * @param \u003cT\u003e Type of the field elements.\n     * @param d Data array.\n     * @return the field to which the array elements belong.\n     * @throws NoDataException if array is empty.\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.buildArray(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 135,
      "end_line": 149,
      "comment": " Build an array of elements.\n     * \u003cp\u003e\n     * Complete arrays are filled with field.getZero()\n     * \u003c/p\u003e\n     * @param \u003cT\u003e Type of the field elements\n     * @param field field to which array elements belong\n     * @param rows number of rows\n     * @param columns number of columns (may be negative to build partial\n     * arrays in the same way \u003ccode\u003enew Field[rows][]\u003c/code\u003e works)\n     * @return a new array\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 144,col 92)",
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.buildArray(org.apache.commons.math.Field\u003cT\u003e, int)",
      "begin_line": 160,
      "end_line": 166,
      "comment": " Build an array of elements.\n     * \u003cp\u003e\n     * Arrays are filled with field.getZero()\n     * \u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param field field to which array elements belong\n     * @param length of the array\n     * @return a new array\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 163,col 77)",
        "(line 164,col 9)-(line 164,col 44)",
        "(line 165,col 9)-(line 165,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getField()",
      "begin_line": 169,
      "end_line": 171,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.createMatrix(int, int)",
      "begin_line": 174,
      "end_line": 174,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.copy()",
      "begin_line": 177,
      "end_line": 177,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.add(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 180,
      "end_line": 194,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 35)",
        "(line 184,col 9)-(line 184,col 50)",
        "(line 185,col 9)-(line 185,col 53)",
        "(line 186,col 9)-(line 186,col 71)",
        "(line 187,col 9)-(line 191,col 9)",
        "(line 193,col 9)-(line 193,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.subtract(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 197,
      "end_line": 211,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 38)",
        "(line 201,col 9)-(line 201,col 50)",
        "(line 202,col 9)-(line 202,col 53)",
        "(line 203,col 9)-(line 203,col 71)",
        "(line 204,col 9)-(line 208,col 9)",
        "(line 210,col 9)-(line 210,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.scalarAdd(T)",
      "begin_line": 214,
      "end_line": 226,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 50)",
        "(line 217,col 9)-(line 217,col 53)",
        "(line 218,col 9)-(line 218,col 71)",
        "(line 219,col 9)-(line 223,col 9)",
        "(line 225,col 9)-(line 225,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.scalarMultiply(T)",
      "begin_line": 229,
      "end_line": 240,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 50)",
        "(line 231,col 9)-(line 231,col 53)",
        "(line 232,col 9)-(line 232,col 71)",
        "(line 233,col 9)-(line 237,col 9)",
        "(line 239,col 9)-(line 239,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.multiply(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 243,
      "end_line": 262,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 41)",
        "(line 247,col 9)-(line 247,col 44)",
        "(line 248,col 9)-(line 248,col 49)",
        "(line 249,col 9)-(line 249,col 47)",
        "(line 250,col 9)-(line 250,col 62)",
        "(line 251,col 9)-(line 259,col 9)",
        "(line 261,col 9)-(line 261,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.preMultiply(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 265,
      "end_line": 267,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.power(int)",
      "begin_line": 270,
      "end_line": 325,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 271,col 9)-(line 273,col 9)",
        "(line 275,col 9)-(line 277,col 9)",
        "(line 279,col 9)-(line 281,col 9)",
        "(line 283,col 9)-(line 285,col 9)",
        "(line 287,col 9)-(line 287,col 32)",
        "(line 296,col 9)-(line 297,col 31)",
        "(line 298,col 9)-(line 298,col 77)",
        "(line 300,col 9)-(line 305,col 9)",
        "(line 307,col 9)-(line 308,col 45)",
        "(line 310,col 9)-(line 310,col 36)",
        "(line 312,col 9)-(line 316,col 9)",
        "(line 318,col 9)-(line 318,col 44)",
        "(line 320,col 9)-(line 322,col 9)",
        "(line 324,col 9)-(line 324,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getData()",
      "begin_line": 328,
      "end_line": 339,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 86)",
        "(line 331,col 9)-(line 336,col 9)",
        "(line 338,col 9)-(line 338,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 342,
      "end_line": 356,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 70)",
        "(line 346,col 9)-(line 347,col 77)",
        "(line 348,col 9)-(line 352,col 9)",
        "(line 354,col 9)-(line 354,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getSubMatrix(int[], int[])",
      "begin_line": 359,
      "end_line": 380,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 59)",
        "(line 366,col 9)-(line 367,col 70)",
        "(line 368,col 9)-(line 376,col 11)",
        "(line 378,col 9)-(line 378,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.Anonymous-a6ac148d-42d3-405b-ac20-57b9d377ea48.visit(int, int, T)",
      "begin_line": 371,
      "end_line": 374,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 373,col 17)-(line 373,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.copySubMatrix(int, int, int, int, T[][])",
      "begin_line": 383,
      "end_line": 423,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 70)",
        "(line 388,col 9)-(line 388,col 55)",
        "(line 389,col 9)-(line 389,col 61)",
        "(line 390,col 9)-(line 395,col 9)",
        "(line 398,col 9)-(line 421,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "startRow"
      ],
      "begin_line": 401,
      "end_line": 401,
      "comment": " Initial row index. "
    },
    {
      "type": "field",
      "varNames": [
        "startColumn"
      ],
      "begin_line": 404,
      "end_line": 404,
      "comment": " Initial column index. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.Anonymous-4648d492-bcc4-4480-b478-89f876a65ac6.start(int, int, int, int, int, int)",
      "begin_line": 407,
      "end_line": 413,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 411,col 17)-(line 411,col 44)",
        "(line 412,col 17)-(line 412,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.Anonymous-db4b37af-6496-4d71-8285-aeb47e199755.visit(int, int, T)",
      "begin_line": 416,
      "end_line": 419,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 418,col 17)-(line 418,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.copySubMatrix(int[], int[], T[][])",
      "begin_line": 426,
      "end_line": 445,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 59)",
        "(line 429,col 9)-(line 435,col 9)",
        "(line 438,col 9)-(line 443,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setSubMatrix(T[][], int, int)",
      "begin_line": 448,
      "end_line": 478,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 449,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 452,col 43)",
        "(line 453,col 9)-(line 455,col 9)",
        "(line 457,col 9)-(line 457,col 46)",
        "(line 458,col 9)-(line 460,col 9)",
        "(line 462,col 9)-(line 466,col 9)",
        "(line 468,col 9)-(line 468,col 27)",
        "(line 469,col 9)-(line 469,col 33)",
        "(line 470,col 9)-(line 470,col 39)",
        "(line 471,col 9)-(line 471,col 45)",
        "(line 473,col 9)-(line 477,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getRowMatrix(int)",
      "begin_line": 481,
      "end_line": 491,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 27)",
        "(line 483,col 9)-(line 483,col 47)",
        "(line 484,col 9)-(line 484,col 58)",
        "(line 485,col 9)-(line 487,col 9)",
        "(line 489,col 9)-(line 489,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setRowMatrix(int, org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 494,
      "end_line": 507,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 27)",
        "(line 496,col 9)-(line 496,col 47)",
        "(line 497,col 9)-(line 502,col 9)",
        "(line 503,col 9)-(line 505,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getColumnMatrix(int)",
      "begin_line": 510,
      "end_line": 521,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 33)",
        "(line 513,col 9)-(line 513,col 44)",
        "(line 514,col 9)-(line 514,col 58)",
        "(line 515,col 9)-(line 517,col 9)",
        "(line 519,col 9)-(line 519,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setColumnMatrix(int, org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 524,
      "end_line": 537,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 525,col 9)-(line 525,col 33)",
        "(line 526,col 9)-(line 526,col 44)",
        "(line 527,col 9)-(line 532,col 9)",
        "(line 533,col 9)-(line 535,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getRowVector(int)",
      "begin_line": 540,
      "end_line": 542,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setRowVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 545,
      "end_line": 556,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 27)",
        "(line 547,col 9)-(line 547,col 47)",
        "(line 548,col 9)-(line 551,col 9)",
        "(line 552,col 9)-(line 554,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getColumnVector(int)",
      "begin_line": 559,
      "end_line": 561,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setColumnVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 564,
      "end_line": 575,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 33)",
        "(line 566,col 9)-(line 566,col 44)",
        "(line 567,col 9)-(line 570,col 9)",
        "(line 571,col 9)-(line 573,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getRow(int)",
      "begin_line": 578,
      "end_line": 588,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 27)",
        "(line 580,col 9)-(line 580,col 47)",
        "(line 581,col 9)-(line 581,col 49)",
        "(line 582,col 9)-(line 584,col 9)",
        "(line 586,col 9)-(line 586,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setRow(int, T[])",
      "begin_line": 591,
      "end_line": 601,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 27)",
        "(line 593,col 9)-(line 593,col 47)",
        "(line 594,col 9)-(line 596,col 9)",
        "(line 597,col 9)-(line 599,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getColumn(int)",
      "begin_line": 604,
      "end_line": 614,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 33)",
        "(line 606,col 9)-(line 606,col 44)",
        "(line 607,col 9)-(line 607,col 49)",
        "(line 608,col 9)-(line 610,col 9)",
        "(line 612,col 9)-(line 612,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setColumn(int, T[])",
      "begin_line": 617,
      "end_line": 626,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 33)",
        "(line 619,col 9)-(line 619,col 44)",
        "(line 620,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 625,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getEntry(int, int)",
      "begin_line": 629,
      "end_line": 629,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setEntry(int, int, T)",
      "begin_line": 632,
      "end_line": 632,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.addToEntry(int, int, T)",
      "begin_line": 635,
      "end_line": 635,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.multiplyEntry(int, int, T)",
      "begin_line": 638,
      "end_line": 638,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.transpose()",
      "begin_line": 641,
      "end_line": 654,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 642,col 9)-(line 642,col 44)",
        "(line 643,col 9)-(line 643,col 47)",
        "(line 644,col 9)-(line 644,col 62)",
        "(line 645,col 9)-(line 651,col 11)",
        "(line 653,col 9)-(line 653,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.Anonymous-2f0f2005-0093-4e44-bb55-380f51ae2788.visit(int, int, T)",
      "begin_line": 647,
      "end_line": 650,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 649,col 17)-(line 649,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.isSquare()",
      "begin_line": 657,
      "end_line": 659,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 658,col 9)-(line 658,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getRowDimension()",
      "begin_line": 662,
      "end_line": 662,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getColumnDimension()",
      "begin_line": 665,
      "end_line": 665,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getTrace()",
      "begin_line": 668,
      "end_line": 679,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 669,col 9)-(line 669,col 44)",
        "(line 670,col 9)-(line 670,col 47)",
        "(line 671,col 9)-(line 673,col 8)",
        "(line 674,col 9)-(line 674,col 34)",
        "(line 675,col 9)-(line 677,col 9)",
        "(line 678,col 9)-(line 678,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.operate(T[])",
      "begin_line": 682,
      "end_line": 700,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 684,col 9)-(line 684,col 44)",
        "(line 685,col 9)-(line 685,col 47)",
        "(line 686,col 9)-(line 688,col 9)",
        "(line 690,col 9)-(line 690,col 49)",
        "(line 691,col 9)-(line 697,col 9)",
        "(line 699,col 9)-(line 699,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.operate(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 703,
      "end_line": 724,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 704,col 9)-(line 723,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.preMultiply(T[])",
      "begin_line": 727,
      "end_line": 745,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 729,col 9)-(line 729,col 44)",
        "(line 730,col 9)-(line 730,col 47)",
        "(line 731,col 9)-(line 733,col 9)",
        "(line 735,col 9)-(line 735,col 49)",
        "(line 736,col 9)-(line 742,col 9)",
        "(line 744,col 9)-(line 744,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.preMultiply(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 748,
      "end_line": 769,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 749,col 9)-(line 768,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 772,
      "end_line": 784,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 773,col 9)-(line 773,col 46)",
        "(line 774,col 9)-(line 774,col 49)",
        "(line 775,col 9)-(line 775,col 66)",
        "(line 776,col 9)-(line 782,col 9)",
        "(line 783,col 9)-(line 783,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 787,
      "end_line": 797,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 788,col 9)-(line 788,col 46)",
        "(line 789,col 9)-(line 789,col 49)",
        "(line 790,col 9)-(line 790,col 66)",
        "(line 791,col 9)-(line 795,col 9)",
        "(line 796,col 9)-(line 796,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 800,
      "end_line": 814,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 803,col 9)-(line 803,col 70)",
        "(line 804,col 9)-(line 805,col 64)",
        "(line 806,col 9)-(line 812,col 9)",
        "(line 813,col 9)-(line 813,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 817,
      "end_line": 829,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 820,col 9)-(line 820,col 70)",
        "(line 821,col 9)-(line 822,col 64)",
        "(line 823,col 9)-(line 827,col 9)",
        "(line 828,col 9)-(line 828,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 832,
      "end_line": 844,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 833,col 9)-(line 833,col 46)",
        "(line 834,col 9)-(line 834,col 49)",
        "(line 835,col 9)-(line 835,col 66)",
        "(line 836,col 9)-(line 842,col 9)",
        "(line 843,col 9)-(line 843,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 847,
      "end_line": 857,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 848,col 9)-(line 848,col 46)",
        "(line 849,col 9)-(line 849,col 49)",
        "(line 850,col 9)-(line 850,col 66)",
        "(line 851,col 9)-(line 855,col 9)",
        "(line 856,col 9)-(line 856,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 860,
      "end_line": 874,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 863,col 9)-(line 863,col 70)",
        "(line 864,col 9)-(line 865,col 64)",
        "(line 866,col 9)-(line 872,col 9)",
        "(line 873,col 9)-(line 873,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 877,
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
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 892,
      "end_line": 894,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 893,col 9)-(line 893,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 897,
      "end_line": 899,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 898,col 9)-(line 898,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 902,
      "end_line": 906,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 905,col 9)-(line 905,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 909,
      "end_line": 913,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 912,col 9)-(line 912,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.toString()",
      "begin_line": 919,
      "end_line": 944,
      "comment": "\n     * Get a string representation for this matrix.\n     * @return a string representation for this matrix\n     ",
      "child_ranges": [
        "(line 921,col 9)-(line 921,col 44)",
        "(line 922,col 9)-(line 922,col 47)",
        "(line 923,col 9)-(line 923,col 52)",
        "(line 924,col 9)-(line 924,col 52)",
        "(line 925,col 9)-(line 925,col 92)",
        "(line 926,col 9)-(line 926,col 47)",
        "(line 928,col 9)-(line 940,col 9)",
        "(line 942,col 9)-(line 942,col 24)",
        "(line 943,col 9)-(line 943,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.equals(java.lang.Object)",
      "begin_line": 954,
      "end_line": 976,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eFieldMatrix\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.\n     *\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 956,col 9)-(line 958,col 9)",
        "(line 959,col 9)-(line 961,col 9)",
        "(line 962,col 9)-(line 962,col 51)",
        "(line 963,col 9)-(line 963,col 44)",
        "(line 964,col 9)-(line 964,col 47)",
        "(line 965,col 9)-(line 967,col 9)",
        "(line 968,col 9)-(line 974,col 9)",
        "(line 975,col 9)-(line 975,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.hashCode()",
      "begin_line": 983,
      "end_line": 996,
      "comment": "\n     * Computes a hashcode for the matrix.\n     *\n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 985,col 9)-(line 985,col 25)",
        "(line 986,col 9)-(line 986,col 44)",
        "(line 987,col 9)-(line 987,col 47)",
        "(line 988,col 9)-(line 988,col 31)",
        "(line 989,col 9)-(line 989,col 31)",
        "(line 990,col 9)-(line 994,col 9)",
        "(line 995,col 9)-(line 995,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkRowIndex(int)",
      "begin_line": 1004,
      "end_line": 1009,
      "comment": "\n     * Check if a row index is valid.\n     *\n     * @param row Row index to check.\n     * @throws OutOfRangeException if {@code index} is not valid.\n     ",
      "child_ranges": [
        "(line 1005,col 9)-(line 1008,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkColumnIndex(int)",
      "begin_line": 1017,
      "end_line": 1022,
      "comment": "\n     * Check if a column index is valid.\n     *\n     * @param column Column index to check.\n     * @throws OutOfRangeException if {@code index} is not valid.\n     ",
      "child_ranges": [
        "(line 1018,col 9)-(line 1021,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkSubMatrixIndex(int, int, int, int)",
      "begin_line": 1036,
      "end_line": 1051,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param startRow Initial row index.\n     * @param endRow Final row index.\n     * @param startColumn Initial column index.\n     * @param endColumn Final column index.\n     * @throws OutOfRangeException if the indices are not valid.\n     * @throws NumberIsTooSmallException if {@code endRow \u003c startRow} or\n     * {@code endColumn \u003c startColumn}.\n     ",
      "child_ranges": [
        "(line 1038,col 9)-(line 1038,col 32)",
        "(line 1039,col 9)-(line 1039,col 30)",
        "(line 1040,col 9)-(line 1043,col 9)",
        "(line 1045,col 9)-(line 1045,col 38)",
        "(line 1046,col 9)-(line 1046,col 36)",
        "(line 1047,col 9)-(line 1050,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkSubMatrixIndex(int[], int[])",
      "begin_line": 1063,
      "end_line": 1079,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param selectedRows Array of row indices.\n     * @param selectedColumns Array of column indices.\n     * @throws NullArgumentException if the arrays are {@code null}.\n     * @throws NoDataException if the arrays have zero length.\n     * @throws OutOfRangeException if row or column selections are not valid.\n     ",
      "child_ranges": [
        "(line 1064,col 9)-(line 1067,col 9)",
        "(line 1068,col 9)-(line 1071,col 9)",
        "(line 1073,col 9)-(line 1075,col 9)",
        "(line 1076,col 9)-(line 1078,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkAdditionCompatible(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 1088,
      "end_line": 1094,
      "comment": "\n     * Check if a matrix is addition compatible with the instance.\n     *\n     * @param m Matrix to check.\n     * @throws MatrixDimensionMismatchException if the matrix is not\n     * addition-compatible with instance.\n     ",
      "child_ranges": [
        "(line 1089,col 9)-(line 1093,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkSubtractionCompatible(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 1103,
      "end_line": 1109,
      "comment": "\n     * Check if a matrix is subtraction compatible with the instance.\n     *\n     * @param m Matrix to check.\n     * @throws MatrixDimensionMismatchException if the matrix is not\n     * subtraction-compatible with instance.\n     ",
      "child_ranges": [
        "(line 1104,col 9)-(line 1108,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkMultiplicationCompatible(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 1118,
      "end_line": 1122,
      "comment": "\n     * Check if a matrix is multiplication compatible with the instance.\n     *\n     * @param m Matrix to check.\n     * @throws DimensionMismatchException if the matrix is not\n     * multiplication-compatible with instance.\n     ",
      "child_ranges": [
        "(line 1119,col 9)-(line 1121,col 9)"
      ]
    }
  ]
}