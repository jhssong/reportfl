{
  "filepath": "/tmp/Math-16b/src/main/java/org/apache/commons/math3/linear/AbstractFieldMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractFieldMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e"
      ],
      "begin_line": 45,
      "end_line": 1167,
      "comment": "\n * Basic implementation of {@link FieldMatrix} methods regardless of the underlying storage.\n * \u003cp\u003eAll the methods implemented here use {@link #getEntry(int, int)} to access\n * matrix elements. Derived class can provide faster implementations. \u003c/p\u003e\n *\n * @param \u003cT\u003e Type of the field elements.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Field to which the elements belong. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.AbstractFieldMatrix()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Constructor for use with Serializable\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.AbstractFieldMatrix(org.apache.commons.math3.Field\u003cT\u003e)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Creates a matrix with no data\n     * @param field field to which the elements belong\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.AbstractFieldMatrix(org.apache.commons.math3.Field\u003cT\u003e, int, int)",
      "begin_line": 74,
      "end_line": 87,
      "comment": "\n     * Create a new FieldMatrix\u003cT\u003e with the supplied row and column dimensions.\n     *\n     * @param field Field to which the elements belong.\n     * @param rowDimension Number of rows in the new matrix.\n     * @param columnDimension Number of columns in the new matrix.\n     * @throws NotStrictlyPositiveException if row or column dimension is not\n     * positive.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.extractField(T[][])",
      "begin_line": 98,
      "end_line": 110,
      "comment": "\n     * Get the elements type from an array.\n     *\n     * @param \u003cT\u003e Type of the field elements.\n     * @param d Data array.\n     * @return the field to which the array elements belong.\n     * @throws NullArgumentException if the array is {@code null}.\n     * @throws NoDataException if the array is empty.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.extractField(T[])",
      "begin_line": 120,
      "end_line": 126,
      "comment": "\n     * Get the elements type from an array.\n     *\n     * @param \u003cT\u003e Type of the field elements.\n     * @param d Data array.\n     * @return the field to which the array elements belong.\n     * @throws NoDataException if array is empty.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 125,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.buildArray(org.apache.commons.math3.Field\u003cT\u003e, int, int)",
      "begin_line": 139,
      "end_line": 153,
      "comment": " Build an array of elements.\n     * \u003cp\u003e\n     * Complete arrays are filled with field.getZero()\n     * \u003c/p\u003e\n     * @param \u003cT\u003e Type of the field elements\n     * @param field field to which array elements belong\n     * @param rows number of rows\n     * @param columns number of columns (may be negative to build partial\n     * arrays in the same way \u003ccode\u003enew Field[rows][]\u003c/code\u003e works)\n     * @return a new array\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 148,col 92)",
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.buildArray(org.apache.commons.math3.Field\u003cT\u003e, int)",
      "begin_line": 164,
      "end_line": 170,
      "comment": " Build an array of elements.\n     * \u003cp\u003e\n     * Arrays are filled with field.getZero()\n     * \u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param field field to which array elements belong\n     * @param length of the array\n     * @return a new array\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 167,col 77)",
        "(line 168,col 9)-(line 168,col 44)",
        "(line 169,col 9)-(line 169,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getField()",
      "begin_line": 173,
      "end_line": 175,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.createMatrix(int, int)",
      "begin_line": 178,
      "end_line": 180,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.copy()",
      "begin_line": 183,
      "end_line": 183,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.add(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 186,
      "end_line": 201,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 35)",
        "(line 191,col 9)-(line 191,col 50)",
        "(line 192,col 9)-(line 192,col 53)",
        "(line 193,col 9)-(line 193,col 71)",
        "(line 194,col 9)-(line 198,col 9)",
        "(line 200,col 9)-(line 200,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.subtract(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 204,
      "end_line": 219,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 38)",
        "(line 209,col 9)-(line 209,col 50)",
        "(line 210,col 9)-(line 210,col 53)",
        "(line 211,col 9)-(line 211,col 71)",
        "(line 212,col 9)-(line 216,col 9)",
        "(line 218,col 9)-(line 218,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.scalarAdd(T)",
      "begin_line": 222,
      "end_line": 234,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 50)",
        "(line 225,col 9)-(line 225,col 53)",
        "(line 226,col 9)-(line 226,col 71)",
        "(line 227,col 9)-(line 231,col 9)",
        "(line 233,col 9)-(line 233,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.scalarMultiply(T)",
      "begin_line": 237,
      "end_line": 248,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 50)",
        "(line 239,col 9)-(line 239,col 53)",
        "(line 240,col 9)-(line 240,col 71)",
        "(line 241,col 9)-(line 245,col 9)",
        "(line 247,col 9)-(line 247,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.multiply(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 251,
      "end_line": 271,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 41)",
        "(line 256,col 9)-(line 256,col 44)",
        "(line 257,col 9)-(line 257,col 49)",
        "(line 258,col 9)-(line 258,col 47)",
        "(line 259,col 9)-(line 259,col 62)",
        "(line 260,col 9)-(line 268,col 9)",
        "(line 270,col 9)-(line 270,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.preMultiply(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 274,
      "end_line": 277,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.power(int)",
      "begin_line": 280,
      "end_line": 336,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 282,col 9)-(line 284,col 9)",
        "(line 286,col 9)-(line 288,col 9)",
        "(line 290,col 9)-(line 292,col 9)",
        "(line 294,col 9)-(line 296,col 9)",
        "(line 298,col 9)-(line 298,col 32)",
        "(line 307,col 9)-(line 308,col 31)",
        "(line 309,col 9)-(line 309,col 77)",
        "(line 311,col 9)-(line 316,col 9)",
        "(line 318,col 9)-(line 319,col 45)",
        "(line 321,col 9)-(line 321,col 36)",
        "(line 323,col 9)-(line 327,col 9)",
        "(line 329,col 9)-(line 329,col 44)",
        "(line 331,col 9)-(line 333,col 9)",
        "(line 335,col 9)-(line 335,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getData()",
      "begin_line": 339,
      "end_line": 350,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 86)",
        "(line 342,col 9)-(line 347,col 9)",
        "(line 349,col 9)-(line 349,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 353,
      "end_line": 368,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 70)",
        "(line 358,col 9)-(line 359,col 77)",
        "(line 360,col 9)-(line 364,col 9)",
        "(line 366,col 9)-(line 366,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getSubMatrix(int[], int[])",
      "begin_line": 371,
      "end_line": 393,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 59)",
        "(line 379,col 9)-(line 380,col 70)",
        "(line 381,col 9)-(line 389,col 11)",
        "(line 391,col 9)-(line 391,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.Anonymous-edbaa03a-08c6-4a90-97bf-d8a874830a8e.visit(int, int, T)",
      "begin_line": 384,
      "end_line": 387,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 386,col 17)-(line 386,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.copySubMatrix(int, int, int, int, T[][])",
      "begin_line": 396,
      "end_line": 438,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 70)",
        "(line 403,col 9)-(line 403,col 55)",
        "(line 404,col 9)-(line 404,col 61)",
        "(line 405,col 9)-(line 410,col 9)",
        "(line 413,col 9)-(line 436,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "startRow"
      ],
      "begin_line": 416,
      "end_line": 416,
      "comment": " Initial row index. "
    },
    {
      "type": "field",
      "varNames": [
        "startColumn"
      ],
      "begin_line": 419,
      "end_line": 419,
      "comment": " Initial column index. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.Anonymous-ce4f7259-a1fe-4fb2-af78-083b07ea382a.start(int, int, int, int, int, int)",
      "begin_line": 422,
      "end_line": 428,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 426,col 17)-(line 426,col 44)",
        "(line 427,col 17)-(line 427,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.Anonymous-a3fe2a7b-4849-441e-a85c-9996ddaed86c.visit(int, int, T)",
      "begin_line": 431,
      "end_line": 434,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 433,col 17)-(line 433,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.copySubMatrix(int[], int[], T[][])",
      "begin_line": 441,
      "end_line": 462,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 59)",
        "(line 446,col 9)-(line 452,col 9)",
        "(line 455,col 9)-(line 460,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.setSubMatrix(T[][], int, int)",
      "begin_line": 465,
      "end_line": 498,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 469,col 9)-(line 471,col 9)",
        "(line 472,col 9)-(line 472,col 43)",
        "(line 473,col 9)-(line 475,col 9)",
        "(line 477,col 9)-(line 477,col 46)",
        "(line 478,col 9)-(line 480,col 9)",
        "(line 482,col 9)-(line 486,col 9)",
        "(line 488,col 9)-(line 488,col 27)",
        "(line 489,col 9)-(line 489,col 33)",
        "(line 490,col 9)-(line 490,col 39)",
        "(line 491,col 9)-(line 491,col 45)",
        "(line 493,col 9)-(line 497,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getRowMatrix(int)",
      "begin_line": 501,
      "end_line": 511,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 27)",
        "(line 503,col 9)-(line 503,col 47)",
        "(line 504,col 9)-(line 504,col 58)",
        "(line 505,col 9)-(line 507,col 9)",
        "(line 509,col 9)-(line 509,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.setRowMatrix(int, org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 514,
      "end_line": 528,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 27)",
        "(line 517,col 9)-(line 517,col 47)",
        "(line 518,col 9)-(line 523,col 9)",
        "(line 524,col 9)-(line 526,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getColumnMatrix(int)",
      "begin_line": 531,
      "end_line": 543,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 33)",
        "(line 535,col 9)-(line 535,col 44)",
        "(line 536,col 9)-(line 536,col 58)",
        "(line 537,col 9)-(line 539,col 9)",
        "(line 541,col 9)-(line 541,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.setColumnMatrix(int, org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 546,
      "end_line": 560,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 33)",
        "(line 549,col 9)-(line 549,col 44)",
        "(line 550,col 9)-(line 555,col 9)",
        "(line 556,col 9)-(line 558,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getRowVector(int)",
      "begin_line": 563,
      "end_line": 566,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.setRowVector(int, org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 569,
      "end_line": 581,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 571,col 9)-(line 571,col 27)",
        "(line 572,col 9)-(line 572,col 47)",
        "(line 573,col 9)-(line 576,col 9)",
        "(line 577,col 9)-(line 579,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getColumnVector(int)",
      "begin_line": 584,
      "end_line": 587,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 586,col 9)-(line 586,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.setColumnVector(int, org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 590,
      "end_line": 603,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 33)",
        "(line 594,col 9)-(line 594,col 44)",
        "(line 595,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 601,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getRow(int)",
      "begin_line": 606,
      "end_line": 616,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 27)",
        "(line 608,col 9)-(line 608,col 47)",
        "(line 609,col 9)-(line 609,col 49)",
        "(line 610,col 9)-(line 612,col 9)",
        "(line 614,col 9)-(line 614,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.setRow(int, T[])",
      "begin_line": 619,
      "end_line": 630,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 621,col 9)-(line 621,col 27)",
        "(line 622,col 9)-(line 622,col 47)",
        "(line 623,col 9)-(line 625,col 9)",
        "(line 626,col 9)-(line 628,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getColumn(int)",
      "begin_line": 633,
      "end_line": 643,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 634,col 9)-(line 634,col 33)",
        "(line 635,col 9)-(line 635,col 44)",
        "(line 636,col 9)-(line 636,col 49)",
        "(line 637,col 9)-(line 639,col 9)",
        "(line 641,col 9)-(line 641,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.setColumn(int, T[])",
      "begin_line": 646,
      "end_line": 656,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 648,col 9)-(line 648,col 33)",
        "(line 649,col 9)-(line 649,col 44)",
        "(line 650,col 9)-(line 652,col 9)",
        "(line 653,col 9)-(line 655,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getEntry(int, int)",
      "begin_line": 659,
      "end_line": 659,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.setEntry(int, int, T)",
      "begin_line": 662,
      "end_line": 662,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.addToEntry(int, int, T)",
      "begin_line": 665,
      "end_line": 665,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.multiplyEntry(int, int, T)",
      "begin_line": 668,
      "end_line": 668,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.transpose()",
      "begin_line": 671,
      "end_line": 684,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 672,col 9)-(line 672,col 44)",
        "(line 673,col 9)-(line 673,col 47)",
        "(line 674,col 9)-(line 674,col 62)",
        "(line 675,col 9)-(line 681,col 11)",
        "(line 683,col 9)-(line 683,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.Anonymous-56bcc86a-973f-4689-a0d4-cd38d8ae3c70.visit(int, int, T)",
      "begin_line": 677,
      "end_line": 680,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 679,col 17)-(line 679,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.isSquare()",
      "begin_line": 687,
      "end_line": 689,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 688,col 9)-(line 688,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getRowDimension()",
      "begin_line": 692,
      "end_line": 692,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getColumnDimension()",
      "begin_line": 695,
      "end_line": 695,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getTrace()",
      "begin_line": 698,
      "end_line": 709,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 699,col 9)-(line 699,col 44)",
        "(line 700,col 9)-(line 700,col 47)",
        "(line 701,col 9)-(line 703,col 8)",
        "(line 704,col 9)-(line 704,col 34)",
        "(line 705,col 9)-(line 707,col 9)",
        "(line 708,col 9)-(line 708,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.operate(T[])",
      "begin_line": 712,
      "end_line": 730,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 714,col 9)-(line 714,col 44)",
        "(line 715,col 9)-(line 715,col 47)",
        "(line 716,col 9)-(line 718,col 9)",
        "(line 720,col 9)-(line 720,col 49)",
        "(line 721,col 9)-(line 727,col 9)",
        "(line 729,col 9)-(line 729,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.operate(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 733,
      "end_line": 755,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 735,col 9)-(line 754,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.preMultiply(T[])",
      "begin_line": 758,
      "end_line": 776,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 760,col 9)-(line 760,col 44)",
        "(line 761,col 9)-(line 761,col 47)",
        "(line 762,col 9)-(line 764,col 9)",
        "(line 766,col 9)-(line 766,col 49)",
        "(line 767,col 9)-(line 773,col 9)",
        "(line 775,col 9)-(line 775,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.preMultiply(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 779,
      "end_line": 801,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 781,col 9)-(line 800,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 804,
      "end_line": 816,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 805,col 9)-(line 805,col 46)",
        "(line 806,col 9)-(line 806,col 49)",
        "(line 807,col 9)-(line 807,col 66)",
        "(line 808,col 9)-(line 814,col 9)",
        "(line 815,col 9)-(line 815,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 819,
      "end_line": 829,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 820,col 9)-(line 820,col 46)",
        "(line 821,col 9)-(line 821,col 49)",
        "(line 822,col 9)-(line 822,col 66)",
        "(line 823,col 9)-(line 827,col 9)",
        "(line 828,col 9)-(line 828,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 832,
      "end_line": 847,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 836,col 9)-(line 836,col 70)",
        "(line 837,col 9)-(line 838,col 64)",
        "(line 839,col 9)-(line 845,col 9)",
        "(line 846,col 9)-(line 846,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 850,
      "end_line": 863,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 854,col 9)-(line 854,col 70)",
        "(line 855,col 9)-(line 856,col 64)",
        "(line 857,col 9)-(line 861,col 9)",
        "(line 862,col 9)-(line 862,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 866,
      "end_line": 878,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 867,col 9)-(line 867,col 46)",
        "(line 868,col 9)-(line 868,col 49)",
        "(line 869,col 9)-(line 869,col 66)",
        "(line 870,col 9)-(line 876,col 9)",
        "(line 877,col 9)-(line 877,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 881,
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
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 894,
      "end_line": 909,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 898,col 9)-(line 898,col 70)",
        "(line 899,col 9)-(line 900,col 64)",
        "(line 901,col 9)-(line 907,col 9)",
        "(line 908,col 9)-(line 908,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 912,
      "end_line": 925,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 916,col 9)-(line 916,col 70)",
        "(line 917,col 9)-(line 918,col 64)",
        "(line 919,col 9)-(line 923,col 9)",
        "(line 924,col 9)-(line 924,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 928,
      "end_line": 930,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 929,col 9)-(line 929,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 933,
      "end_line": 935,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 934,col 9)-(line 934,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 938,
      "end_line": 943,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 942,col 9)-(line 942,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 946,
      "end_line": 951,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 950,col 9)-(line 950,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.toString()",
      "begin_line": 957,
      "end_line": 982,
      "comment": "\n     * Get a string representation for this matrix.\n     * @return a string representation for this matrix\n     ",
      "child_ranges": [
        "(line 959,col 9)-(line 959,col 44)",
        "(line 960,col 9)-(line 960,col 47)",
        "(line 961,col 9)-(line 961,col 52)",
        "(line 962,col 9)-(line 962,col 52)",
        "(line 963,col 9)-(line 963,col 92)",
        "(line 964,col 9)-(line 964,col 47)",
        "(line 966,col 9)-(line 978,col 9)",
        "(line 980,col 9)-(line 980,col 24)",
        "(line 981,col 9)-(line 981,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.equals(java.lang.Object)",
      "begin_line": 992,
      "end_line": 1014,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eFieldMatrix\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.\n     *\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 994,col 9)-(line 996,col 9)",
        "(line 997,col 9)-(line 999,col 9)",
        "(line 1000,col 9)-(line 1000,col 51)",
        "(line 1001,col 9)-(line 1001,col 44)",
        "(line 1002,col 9)-(line 1002,col 47)",
        "(line 1003,col 9)-(line 1005,col 9)",
        "(line 1006,col 9)-(line 1012,col 9)",
        "(line 1013,col 9)-(line 1013,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.hashCode()",
      "begin_line": 1021,
      "end_line": 1034,
      "comment": "\n     * Computes a hashcode for the matrix.\n     *\n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 1023,col 9)-(line 1023,col 25)",
        "(line 1024,col 9)-(line 1024,col 44)",
        "(line 1025,col 9)-(line 1025,col 47)",
        "(line 1026,col 9)-(line 1026,col 31)",
        "(line 1027,col 9)-(line 1027,col 31)",
        "(line 1028,col 9)-(line 1032,col 9)",
        "(line 1033,col 9)-(line 1033,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.checkRowIndex(int)",
      "begin_line": 1042,
      "end_line": 1047,
      "comment": "\n     * Check if a row index is valid.\n     *\n     * @param row Row index to check.\n     * @throws OutOfRangeException if {@code index} is not valid.\n     ",
      "child_ranges": [
        "(line 1043,col 9)-(line 1046,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.checkColumnIndex(int)",
      "begin_line": 1055,
      "end_line": 1061,
      "comment": "\n     * Check if a column index is valid.\n     *\n     * @param column Column index to check.\n     * @throws OutOfRangeException if {@code index} is not valid.\n     ",
      "child_ranges": [
        "(line 1057,col 9)-(line 1060,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.checkSubMatrixIndex(int, int, int, int)",
      "begin_line": 1075,
      "end_line": 1091,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param startRow Initial row index.\n     * @param endRow Final row index.\n     * @param startColumn Initial column index.\n     * @param endColumn Final column index.\n     * @throws OutOfRangeException if the indices are not valid.\n     * @throws NumberIsTooSmallException if {@code endRow \u003c startRow} or\n     * {@code endColumn \u003c startColumn}.\n     ",
      "child_ranges": [
        "(line 1078,col 9)-(line 1078,col 32)",
        "(line 1079,col 9)-(line 1079,col 30)",
        "(line 1080,col 9)-(line 1083,col 9)",
        "(line 1085,col 9)-(line 1085,col 38)",
        "(line 1086,col 9)-(line 1086,col 36)",
        "(line 1087,col 9)-(line 1090,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.checkSubMatrixIndex(int[], int[])",
      "begin_line": 1103,
      "end_line": 1120,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param selectedRows Array of row indices.\n     * @param selectedColumns Array of column indices.\n     * @throws NullArgumentException if the arrays are {@code null}.\n     * @throws NoDataException if the arrays have zero length.\n     * @throws OutOfRangeException if row or column selections are not valid.\n     ",
      "child_ranges": [
        "(line 1105,col 9)-(line 1108,col 9)",
        "(line 1109,col 9)-(line 1112,col 9)",
        "(line 1114,col 9)-(line 1116,col 9)",
        "(line 1117,col 9)-(line 1119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.checkAdditionCompatible(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 1129,
      "end_line": 1136,
      "comment": "\n     * Check if a matrix is addition compatible with the instance.\n     *\n     * @param m Matrix to check.\n     * @throws MatrixDimensionMismatchException if the matrix is not\n     * addition-compatible with instance.\n     ",
      "child_ranges": [
        "(line 1131,col 9)-(line 1135,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.checkSubtractionCompatible(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 1145,
      "end_line": 1152,
      "comment": "\n     * Check if a matrix is subtraction compatible with the instance.\n     *\n     * @param m Matrix to check.\n     * @throws MatrixDimensionMismatchException if the matrix is not\n     * subtraction-compatible with instance.\n     ",
      "child_ranges": [
        "(line 1147,col 9)-(line 1151,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.checkMultiplicationCompatible(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 1161,
      "end_line": 1166,
      "comment": "\n     * Check if a matrix is multiplication compatible with the instance.\n     *\n     * @param m Matrix to check.\n     * @throws DimensionMismatchException if the matrix is not\n     * multiplication-compatible with instance.\n     ",
      "child_ranges": [
        "(line 1163,col 9)-(line 1165,col 9)"
      ]
    }
  ]
}