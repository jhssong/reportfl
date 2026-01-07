{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/linear/AbstractFieldMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractFieldMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e"
      ],
      "begin_line": 44,
      "end_line": 1157,
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
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.AbstractFieldMatrix()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Constructor for use with Serializable\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.AbstractFieldMatrix(org.apache.commons.math3.Field\u003cT\u003e)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Creates a matrix with no data\n     * @param field field to which the elements belong\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.AbstractFieldMatrix(org.apache.commons.math3.Field\u003cT\u003e, int, int)",
      "begin_line": 73,
      "end_line": 86,
      "comment": "\n     * Create a new FieldMatrix\u003cT\u003e with the supplied row and column dimensions.\n     *\n     * @param field Field to which the elements belong.\n     * @param rowDimension Number of rows in the new matrix.\n     * @param columnDimension Number of columns in the new matrix.\n     * @throws NotStrictlyPositiveException if row or column dimension is not\n     * positive.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 85,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.extractField(T[][])",
      "begin_line": 97,
      "end_line": 109,
      "comment": "\n     * Get the elements type from an array.\n     *\n     * @param \u003cT\u003e Type of the field elements.\n     * @param d Data array.\n     * @return the field to which the array elements belong.\n     * @throws NullArgumentException if the array is {@code null}.\n     * @throws NoDataException if the array is empty.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.extractField(T[])",
      "begin_line": 119,
      "end_line": 125,
      "comment": "\n     * Get the elements type from an array.\n     *\n     * @param \u003cT\u003e Type of the field elements.\n     * @param d Data array.\n     * @return the field to which the array elements belong.\n     * @throws NoDataException if array is empty.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.buildArray(org.apache.commons.math3.Field\u003cT\u003e, int, int)",
      "begin_line": 139,
      "end_line": 144,
      "comment": " Build an array of elements.\n     * \u003cp\u003e\n     * Complete arrays are filled with field.getZero()\n     * \u003c/p\u003e\n     * @param \u003cT\u003e Type of the field elements\n     * @param field field to which array elements belong\n     * @param rows number of rows\n     * @param columns number of columns (may be negative to build partial\n     * arrays in the same way \u003ccode\u003enew Field[rows][]\u003c/code\u003e works)\n     * @return a new array\n     * @deprecated as of 3.2, replaced by {@link MathArrays#buildArray(Field, int, int)}\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.buildArray(org.apache.commons.math3.Field\u003cT\u003e, int)",
      "begin_line": 156,
      "end_line": 160,
      "comment": " Build an array of elements.\n     * \u003cp\u003e\n     * Arrays are filled with field.getZero()\n     * \u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param field field to which array elements belong\n     * @param length of the array\n     * @return a new array\n     * @deprecated as of 3.2, replaced by {@link MathArrays#buildArray(Field, int)}\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getField()",
      "begin_line": 163,
      "end_line": 165,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.createMatrix(int, int)",
      "begin_line": 168,
      "end_line": 170,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.copy()",
      "begin_line": 173,
      "end_line": 173,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.add(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 176,
      "end_line": 191,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 35)",
        "(line 181,col 9)-(line 181,col 50)",
        "(line 182,col 9)-(line 182,col 53)",
        "(line 183,col 9)-(line 183,col 71)",
        "(line 184,col 9)-(line 188,col 9)",
        "(line 190,col 9)-(line 190,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.subtract(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 194,
      "end_line": 209,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 38)",
        "(line 199,col 9)-(line 199,col 50)",
        "(line 200,col 9)-(line 200,col 53)",
        "(line 201,col 9)-(line 201,col 71)",
        "(line 202,col 9)-(line 206,col 9)",
        "(line 208,col 9)-(line 208,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.scalarAdd(T)",
      "begin_line": 212,
      "end_line": 224,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 50)",
        "(line 215,col 9)-(line 215,col 53)",
        "(line 216,col 9)-(line 216,col 71)",
        "(line 217,col 9)-(line 221,col 9)",
        "(line 223,col 9)-(line 223,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.scalarMultiply(T)",
      "begin_line": 227,
      "end_line": 238,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 50)",
        "(line 229,col 9)-(line 229,col 53)",
        "(line 230,col 9)-(line 230,col 71)",
        "(line 231,col 9)-(line 235,col 9)",
        "(line 237,col 9)-(line 237,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.multiply(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 241,
      "end_line": 261,
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
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.preMultiply(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 264,
      "end_line": 267,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.power(int)",
      "begin_line": 270,
      "end_line": 326,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 272,col 9)-(line 274,col 9)",
        "(line 276,col 9)-(line 278,col 9)",
        "(line 280,col 9)-(line 282,col 9)",
        "(line 284,col 9)-(line 286,col 9)",
        "(line 288,col 9)-(line 288,col 32)",
        "(line 297,col 9)-(line 298,col 31)",
        "(line 299,col 9)-(line 299,col 77)",
        "(line 301,col 9)-(line 306,col 9)",
        "(line 308,col 9)-(line 309,col 45)",
        "(line 311,col 9)-(line 311,col 36)",
        "(line 313,col 9)-(line 317,col 9)",
        "(line 319,col 9)-(line 319,col 44)",
        "(line 321,col 9)-(line 323,col 9)",
        "(line 325,col 9)-(line 325,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getData()",
      "begin_line": 329,
      "end_line": 340,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 97)",
        "(line 332,col 9)-(line 337,col 9)",
        "(line 339,col 9)-(line 339,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 343,
      "end_line": 358,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 70)",
        "(line 348,col 9)-(line 349,col 77)",
        "(line 350,col 9)-(line 354,col 9)",
        "(line 356,col 9)-(line 356,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getSubMatrix(int[], int[])",
      "begin_line": 361,
      "end_line": 383,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 59)",
        "(line 369,col 9)-(line 370,col 70)",
        "(line 371,col 9)-(line 379,col 11)",
        "(line 381,col 9)-(line 381,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.Anonymous-fb4bd940-fc9c-45f6-a876-5bf0a9d3a204.visit(int, int, T)",
      "begin_line": 374,
      "end_line": 377,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 376,col 17)-(line 376,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.copySubMatrix(int, int, int, int, T[][])",
      "begin_line": 386,
      "end_line": 428,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 70)",
        "(line 393,col 9)-(line 393,col 55)",
        "(line 394,col 9)-(line 394,col 61)",
        "(line 395,col 9)-(line 400,col 9)",
        "(line 403,col 9)-(line 426,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "startRow"
      ],
      "begin_line": 406,
      "end_line": 406,
      "comment": " Initial row index. "
    },
    {
      "type": "field",
      "varNames": [
        "startColumn"
      ],
      "begin_line": 409,
      "end_line": 409,
      "comment": " Initial column index. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.Anonymous-21be76b1-9c6c-49ad-9ed7-20d15609c3d0.start(int, int, int, int, int, int)",
      "begin_line": 412,
      "end_line": 418,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 416,col 17)-(line 416,col 44)",
        "(line 417,col 17)-(line 417,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.Anonymous-a2de05a3-37ba-46cd-82bd-e3a000a87abd.visit(int, int, T)",
      "begin_line": 421,
      "end_line": 424,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 423,col 17)-(line 423,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.copySubMatrix(int[], int[], T[][])",
      "begin_line": 431,
      "end_line": 452,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 59)",
        "(line 436,col 9)-(line 442,col 9)",
        "(line 445,col 9)-(line 450,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.setSubMatrix(T[][], int, int)",
      "begin_line": 455,
      "end_line": 488,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 459,col 9)-(line 461,col 9)",
        "(line 462,col 9)-(line 462,col 43)",
        "(line 463,col 9)-(line 465,col 9)",
        "(line 467,col 9)-(line 467,col 46)",
        "(line 468,col 9)-(line 470,col 9)",
        "(line 472,col 9)-(line 476,col 9)",
        "(line 478,col 9)-(line 478,col 27)",
        "(line 479,col 9)-(line 479,col 33)",
        "(line 480,col 9)-(line 480,col 39)",
        "(line 481,col 9)-(line 481,col 45)",
        "(line 483,col 9)-(line 487,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getRowMatrix(int)",
      "begin_line": 491,
      "end_line": 501,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 27)",
        "(line 493,col 9)-(line 493,col 47)",
        "(line 494,col 9)-(line 494,col 58)",
        "(line 495,col 9)-(line 497,col 9)",
        "(line 499,col 9)-(line 499,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.setRowMatrix(int, org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 504,
      "end_line": 518,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 27)",
        "(line 507,col 9)-(line 507,col 47)",
        "(line 508,col 9)-(line 513,col 9)",
        "(line 514,col 9)-(line 516,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getColumnMatrix(int)",
      "begin_line": 521,
      "end_line": 533,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 33)",
        "(line 525,col 9)-(line 525,col 44)",
        "(line 526,col 9)-(line 526,col 58)",
        "(line 527,col 9)-(line 529,col 9)",
        "(line 531,col 9)-(line 531,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.setColumnMatrix(int, org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 536,
      "end_line": 550,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 33)",
        "(line 539,col 9)-(line 539,col 44)",
        "(line 540,col 9)-(line 545,col 9)",
        "(line 546,col 9)-(line 548,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getRowVector(int)",
      "begin_line": 553,
      "end_line": 556,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.setRowVector(int, org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 559,
      "end_line": 571,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 27)",
        "(line 562,col 9)-(line 562,col 47)",
        "(line 563,col 9)-(line 566,col 9)",
        "(line 567,col 9)-(line 569,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getColumnVector(int)",
      "begin_line": 574,
      "end_line": 577,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.setColumnVector(int, org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 580,
      "end_line": 593,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 583,col 9)-(line 583,col 33)",
        "(line 584,col 9)-(line 584,col 44)",
        "(line 585,col 9)-(line 588,col 9)",
        "(line 589,col 9)-(line 591,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getRow(int)",
      "begin_line": 596,
      "end_line": 606,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 27)",
        "(line 598,col 9)-(line 598,col 47)",
        "(line 599,col 9)-(line 599,col 60)",
        "(line 600,col 9)-(line 602,col 9)",
        "(line 604,col 9)-(line 604,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.setRow(int, T[])",
      "begin_line": 609,
      "end_line": 620,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 27)",
        "(line 612,col 9)-(line 612,col 47)",
        "(line 613,col 9)-(line 615,col 9)",
        "(line 616,col 9)-(line 618,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getColumn(int)",
      "begin_line": 623,
      "end_line": 633,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 624,col 9)-(line 624,col 33)",
        "(line 625,col 9)-(line 625,col 44)",
        "(line 626,col 9)-(line 626,col 60)",
        "(line 627,col 9)-(line 629,col 9)",
        "(line 631,col 9)-(line 631,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.setColumn(int, T[])",
      "begin_line": 636,
      "end_line": 646,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 638,col 9)-(line 638,col 33)",
        "(line 639,col 9)-(line 639,col 44)",
        "(line 640,col 9)-(line 642,col 9)",
        "(line 643,col 9)-(line 645,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getEntry(int, int)",
      "begin_line": 649,
      "end_line": 649,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.setEntry(int, int, T)",
      "begin_line": 652,
      "end_line": 652,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.addToEntry(int, int, T)",
      "begin_line": 655,
      "end_line": 655,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.multiplyEntry(int, int, T)",
      "begin_line": 658,
      "end_line": 658,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.transpose()",
      "begin_line": 661,
      "end_line": 674,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 662,col 9)-(line 662,col 44)",
        "(line 663,col 9)-(line 663,col 47)",
        "(line 664,col 9)-(line 664,col 62)",
        "(line 665,col 9)-(line 671,col 11)",
        "(line 673,col 9)-(line 673,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.Anonymous-a9b73e2d-2225-4c9f-b035-9ba5588cb1bc.visit(int, int, T)",
      "begin_line": 667,
      "end_line": 670,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 669,col 17)-(line 669,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.isSquare()",
      "begin_line": 677,
      "end_line": 679,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getRowDimension()",
      "begin_line": 682,
      "end_line": 682,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getColumnDimension()",
      "begin_line": 685,
      "end_line": 685,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getTrace()",
      "begin_line": 688,
      "end_line": 699,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 689,col 9)-(line 689,col 44)",
        "(line 690,col 9)-(line 690,col 47)",
        "(line 691,col 9)-(line 693,col 8)",
        "(line 694,col 9)-(line 694,col 34)",
        "(line 695,col 9)-(line 697,col 9)",
        "(line 698,col 9)-(line 698,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.operate(T[])",
      "begin_line": 702,
      "end_line": 720,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 704,col 9)-(line 704,col 44)",
        "(line 705,col 9)-(line 705,col 47)",
        "(line 706,col 9)-(line 708,col 9)",
        "(line 710,col 9)-(line 710,col 60)",
        "(line 711,col 9)-(line 717,col 9)",
        "(line 719,col 9)-(line 719,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.operate(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 723,
      "end_line": 745,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 725,col 9)-(line 744,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.preMultiply(T[])",
      "begin_line": 748,
      "end_line": 766,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 750,col 9)-(line 750,col 44)",
        "(line 751,col 9)-(line 751,col 47)",
        "(line 752,col 9)-(line 754,col 9)",
        "(line 756,col 9)-(line 756,col 60)",
        "(line 757,col 9)-(line 763,col 9)",
        "(line 765,col 9)-(line 765,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.preMultiply(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 769,
      "end_line": 791,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 771,col 9)-(line 790,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 794,
      "end_line": 806,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 795,col 9)-(line 795,col 46)",
        "(line 796,col 9)-(line 796,col 49)",
        "(line 797,col 9)-(line 797,col 66)",
        "(line 798,col 9)-(line 804,col 9)",
        "(line 805,col 9)-(line 805,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 809,
      "end_line": 819,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 810,col 9)-(line 810,col 46)",
        "(line 811,col 9)-(line 811,col 49)",
        "(line 812,col 9)-(line 812,col 66)",
        "(line 813,col 9)-(line 817,col 9)",
        "(line 818,col 9)-(line 818,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 822,
      "end_line": 837,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 826,col 9)-(line 826,col 70)",
        "(line 827,col 9)-(line 828,col 64)",
        "(line 829,col 9)-(line 835,col 9)",
        "(line 836,col 9)-(line 836,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 840,
      "end_line": 853,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 844,col 9)-(line 844,col 70)",
        "(line 845,col 9)-(line 846,col 64)",
        "(line 847,col 9)-(line 851,col 9)",
        "(line 852,col 9)-(line 852,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 856,
      "end_line": 868,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 857,col 9)-(line 857,col 46)",
        "(line 858,col 9)-(line 858,col 49)",
        "(line 859,col 9)-(line 859,col 66)",
        "(line 860,col 9)-(line 866,col 9)",
        "(line 867,col 9)-(line 867,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 871,
      "end_line": 881,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 872,col 9)-(line 872,col 46)",
        "(line 873,col 9)-(line 873,col 49)",
        "(line 874,col 9)-(line 874,col 66)",
        "(line 875,col 9)-(line 879,col 9)",
        "(line 880,col 9)-(line 880,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 884,
      "end_line": 899,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 888,col 9)-(line 888,col 70)",
        "(line 889,col 9)-(line 890,col 64)",
        "(line 891,col 9)-(line 897,col 9)",
        "(line 898,col 9)-(line 898,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 902,
      "end_line": 915,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 906,col 9)-(line 906,col 70)",
        "(line 907,col 9)-(line 908,col 64)",
        "(line 909,col 9)-(line 913,col 9)",
        "(line 914,col 9)-(line 914,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 918,
      "end_line": 920,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 919,col 9)-(line 919,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 923,
      "end_line": 925,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 924,col 9)-(line 924,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 928,
      "end_line": 933,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 932,col 9)-(line 932,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 936,
      "end_line": 941,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 940,col 9)-(line 940,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.toString()",
      "begin_line": 947,
      "end_line": 972,
      "comment": "\n     * Get a string representation for this matrix.\n     * @return a string representation for this matrix\n     ",
      "child_ranges": [
        "(line 949,col 9)-(line 949,col 44)",
        "(line 950,col 9)-(line 950,col 47)",
        "(line 951,col 9)-(line 951,col 52)",
        "(line 952,col 9)-(line 952,col 52)",
        "(line 953,col 9)-(line 953,col 92)",
        "(line 954,col 9)-(line 954,col 47)",
        "(line 956,col 9)-(line 968,col 9)",
        "(line 970,col 9)-(line 970,col 24)",
        "(line 971,col 9)-(line 971,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.equals(java.lang.Object)",
      "begin_line": 982,
      "end_line": 1004,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eFieldMatrix\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.\n     *\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 984,col 9)-(line 986,col 9)",
        "(line 987,col 9)-(line 989,col 9)",
        "(line 990,col 9)-(line 990,col 51)",
        "(line 991,col 9)-(line 991,col 44)",
        "(line 992,col 9)-(line 992,col 47)",
        "(line 993,col 9)-(line 995,col 9)",
        "(line 996,col 9)-(line 1002,col 9)",
        "(line 1003,col 9)-(line 1003,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.hashCode()",
      "begin_line": 1011,
      "end_line": 1024,
      "comment": "\n     * Computes a hashcode for the matrix.\n     *\n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 1013,col 9)-(line 1013,col 25)",
        "(line 1014,col 9)-(line 1014,col 44)",
        "(line 1015,col 9)-(line 1015,col 47)",
        "(line 1016,col 9)-(line 1016,col 31)",
        "(line 1017,col 9)-(line 1017,col 31)",
        "(line 1018,col 9)-(line 1022,col 9)",
        "(line 1023,col 9)-(line 1023,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.checkRowIndex(int)",
      "begin_line": 1032,
      "end_line": 1037,
      "comment": "\n     * Check if a row index is valid.\n     *\n     * @param row Row index to check.\n     * @throws OutOfRangeException if {@code index} is not valid.\n     ",
      "child_ranges": [
        "(line 1033,col 9)-(line 1036,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.checkColumnIndex(int)",
      "begin_line": 1045,
      "end_line": 1051,
      "comment": "\n     * Check if a column index is valid.\n     *\n     * @param column Column index to check.\n     * @throws OutOfRangeException if {@code index} is not valid.\n     ",
      "child_ranges": [
        "(line 1047,col 9)-(line 1050,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.checkSubMatrixIndex(int, int, int, int)",
      "begin_line": 1065,
      "end_line": 1081,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param startRow Initial row index.\n     * @param endRow Final row index.\n     * @param startColumn Initial column index.\n     * @param endColumn Final column index.\n     * @throws OutOfRangeException if the indices are not valid.\n     * @throws NumberIsTooSmallException if {@code endRow \u003c startRow} or\n     * {@code endColumn \u003c startColumn}.\n     ",
      "child_ranges": [
        "(line 1068,col 9)-(line 1068,col 32)",
        "(line 1069,col 9)-(line 1069,col 30)",
        "(line 1070,col 9)-(line 1073,col 9)",
        "(line 1075,col 9)-(line 1075,col 38)",
        "(line 1076,col 9)-(line 1076,col 36)",
        "(line 1077,col 9)-(line 1080,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.checkSubMatrixIndex(int[], int[])",
      "begin_line": 1093,
      "end_line": 1110,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param selectedRows Array of row indices.\n     * @param selectedColumns Array of column indices.\n     * @throws NullArgumentException if the arrays are {@code null}.\n     * @throws NoDataException if the arrays have zero length.\n     * @throws OutOfRangeException if row or column selections are not valid.\n     ",
      "child_ranges": [
        "(line 1095,col 9)-(line 1098,col 9)",
        "(line 1099,col 9)-(line 1102,col 9)",
        "(line 1104,col 9)-(line 1106,col 9)",
        "(line 1107,col 9)-(line 1109,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.checkAdditionCompatible(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 1119,
      "end_line": 1126,
      "comment": "\n     * Check if a matrix is addition compatible with the instance.\n     *\n     * @param m Matrix to check.\n     * @throws MatrixDimensionMismatchException if the matrix is not\n     * addition-compatible with instance.\n     ",
      "child_ranges": [
        "(line 1121,col 9)-(line 1125,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.checkSubtractionCompatible(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 1135,
      "end_line": 1142,
      "comment": "\n     * Check if a matrix is subtraction compatible with the instance.\n     *\n     * @param m Matrix to check.\n     * @throws MatrixDimensionMismatchException if the matrix is not\n     * subtraction-compatible with instance.\n     ",
      "child_ranges": [
        "(line 1137,col 9)-(line 1141,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.checkMultiplicationCompatible(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 1151,
      "end_line": 1156,
      "comment": "\n     * Check if a matrix is multiplication compatible with the instance.\n     *\n     * @param m Matrix to check.\n     * @throws DimensionMismatchException if the matrix is not\n     * multiplication-compatible with instance.\n     ",
      "child_ranges": [
        "(line 1153,col 9)-(line 1155,col 9)"
      ]
    }
  ]
}