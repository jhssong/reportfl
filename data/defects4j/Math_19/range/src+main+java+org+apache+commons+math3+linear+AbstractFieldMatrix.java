{
  "filepath": "/tmp/Math-19b/src/main/java/org/apache/commons/math3/linear/AbstractFieldMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractFieldMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e"
      ],
      "begin_line": 45,
      "end_line": 1160,
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
      "end_line": 178,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.copy()",
      "begin_line": 181,
      "end_line": 181,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.add(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 184,
      "end_line": 199,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 35)",
        "(line 189,col 9)-(line 189,col 50)",
        "(line 190,col 9)-(line 190,col 53)",
        "(line 191,col 9)-(line 191,col 71)",
        "(line 192,col 9)-(line 196,col 9)",
        "(line 198,col 9)-(line 198,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.subtract(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 202,
      "end_line": 217,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 38)",
        "(line 207,col 9)-(line 207,col 50)",
        "(line 208,col 9)-(line 208,col 53)",
        "(line 209,col 9)-(line 209,col 71)",
        "(line 210,col 9)-(line 214,col 9)",
        "(line 216,col 9)-(line 216,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.scalarAdd(T)",
      "begin_line": 220,
      "end_line": 232,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 50)",
        "(line 223,col 9)-(line 223,col 53)",
        "(line 224,col 9)-(line 224,col 71)",
        "(line 225,col 9)-(line 229,col 9)",
        "(line 231,col 9)-(line 231,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.scalarMultiply(T)",
      "begin_line": 235,
      "end_line": 246,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 50)",
        "(line 237,col 9)-(line 237,col 53)",
        "(line 238,col 9)-(line 238,col 71)",
        "(line 239,col 9)-(line 243,col 9)",
        "(line 245,col 9)-(line 245,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.multiply(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 249,
      "end_line": 269,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 41)",
        "(line 254,col 9)-(line 254,col 44)",
        "(line 255,col 9)-(line 255,col 49)",
        "(line 256,col 9)-(line 256,col 47)",
        "(line 257,col 9)-(line 257,col 62)",
        "(line 258,col 9)-(line 266,col 9)",
        "(line 268,col 9)-(line 268,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.preMultiply(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 272,
      "end_line": 275,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.power(int)",
      "begin_line": 278,
      "end_line": 334,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 280,col 9)-(line 282,col 9)",
        "(line 284,col 9)-(line 286,col 9)",
        "(line 288,col 9)-(line 290,col 9)",
        "(line 292,col 9)-(line 294,col 9)",
        "(line 296,col 9)-(line 296,col 32)",
        "(line 305,col 9)-(line 306,col 31)",
        "(line 307,col 9)-(line 307,col 77)",
        "(line 309,col 9)-(line 314,col 9)",
        "(line 316,col 9)-(line 317,col 45)",
        "(line 319,col 9)-(line 319,col 36)",
        "(line 321,col 9)-(line 325,col 9)",
        "(line 327,col 9)-(line 327,col 44)",
        "(line 329,col 9)-(line 331,col 9)",
        "(line 333,col 9)-(line 333,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getData()",
      "begin_line": 337,
      "end_line": 348,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 86)",
        "(line 340,col 9)-(line 345,col 9)",
        "(line 347,col 9)-(line 347,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 351,
      "end_line": 366,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 70)",
        "(line 356,col 9)-(line 357,col 77)",
        "(line 358,col 9)-(line 362,col 9)",
        "(line 364,col 9)-(line 364,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getSubMatrix(int[], int[])",
      "begin_line": 369,
      "end_line": 391,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 59)",
        "(line 377,col 9)-(line 378,col 70)",
        "(line 379,col 9)-(line 387,col 11)",
        "(line 389,col 9)-(line 389,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.Anonymous-a33306c1-d81a-4a7e-b5b4-e4ee17de7d8c.visit(int, int, T)",
      "begin_line": 382,
      "end_line": 385,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 384,col 17)-(line 384,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.copySubMatrix(int, int, int, int, T[][])",
      "begin_line": 394,
      "end_line": 436,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 70)",
        "(line 401,col 9)-(line 401,col 55)",
        "(line 402,col 9)-(line 402,col 61)",
        "(line 403,col 9)-(line 408,col 9)",
        "(line 411,col 9)-(line 434,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "startRow"
      ],
      "begin_line": 414,
      "end_line": 414,
      "comment": " Initial row index. "
    },
    {
      "type": "field",
      "varNames": [
        "startColumn"
      ],
      "begin_line": 417,
      "end_line": 417,
      "comment": " Initial column index. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.Anonymous-252a25ad-98cb-44c4-ad02-22b4ca543949.start(int, int, int, int, int, int)",
      "begin_line": 420,
      "end_line": 426,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 424,col 17)-(line 424,col 44)",
        "(line 425,col 17)-(line 425,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.Anonymous-0fcec54f-da9b-47b0-9fa4-28d3e38ec38c.visit(int, int, T)",
      "begin_line": 429,
      "end_line": 432,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 431,col 17)-(line 431,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.copySubMatrix(int[], int[], T[][])",
      "begin_line": 439,
      "end_line": 460,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 59)",
        "(line 444,col 9)-(line 450,col 9)",
        "(line 453,col 9)-(line 458,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.setSubMatrix(T[][], int, int)",
      "begin_line": 466,
      "end_line": 498,
      "comment": "\n     * {@inheritDoc}\n     *\n     ",
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
      "end_line": 565,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 564,col 9)-(line 564,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.setRowVector(int, org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 568,
      "end_line": 580,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 27)",
        "(line 571,col 9)-(line 571,col 47)",
        "(line 572,col 9)-(line 575,col 9)",
        "(line 576,col 9)-(line 578,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getColumnVector(int)",
      "begin_line": 583,
      "end_line": 585,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.setColumnVector(int, org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 588,
      "end_line": 601,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 33)",
        "(line 592,col 9)-(line 592,col 44)",
        "(line 593,col 9)-(line 596,col 9)",
        "(line 597,col 9)-(line 599,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getRow(int)",
      "begin_line": 604,
      "end_line": 614,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 27)",
        "(line 606,col 9)-(line 606,col 47)",
        "(line 607,col 9)-(line 607,col 49)",
        "(line 608,col 9)-(line 610,col 9)",
        "(line 612,col 9)-(line 612,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.setRow(int, T[])",
      "begin_line": 617,
      "end_line": 627,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 27)",
        "(line 619,col 9)-(line 619,col 47)",
        "(line 620,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 625,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getColumn(int)",
      "begin_line": 630,
      "end_line": 640,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 631,col 9)-(line 631,col 33)",
        "(line 632,col 9)-(line 632,col 44)",
        "(line 633,col 9)-(line 633,col 49)",
        "(line 634,col 9)-(line 636,col 9)",
        "(line 638,col 9)-(line 638,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.setColumn(int, T[])",
      "begin_line": 643,
      "end_line": 653,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 645,col 9)-(line 645,col 33)",
        "(line 646,col 9)-(line 646,col 44)",
        "(line 647,col 9)-(line 649,col 9)",
        "(line 650,col 9)-(line 652,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getEntry(int, int)",
      "begin_line": 656,
      "end_line": 656,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.setEntry(int, int, T)",
      "begin_line": 659,
      "end_line": 659,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.addToEntry(int, int, T)",
      "begin_line": 662,
      "end_line": 662,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.multiplyEntry(int, int, T)",
      "begin_line": 665,
      "end_line": 665,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.transpose()",
      "begin_line": 668,
      "end_line": 681,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 669,col 9)-(line 669,col 44)",
        "(line 670,col 9)-(line 670,col 47)",
        "(line 671,col 9)-(line 671,col 62)",
        "(line 672,col 9)-(line 678,col 11)",
        "(line 680,col 9)-(line 680,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.Anonymous-eff14ccf-bd79-45cc-b1aa-de1806b18ed9.visit(int, int, T)",
      "begin_line": 674,
      "end_line": 677,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 676,col 17)-(line 676,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.isSquare()",
      "begin_line": 684,
      "end_line": 686,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 685,col 9)-(line 685,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getRowDimension()",
      "begin_line": 689,
      "end_line": 689,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getColumnDimension()",
      "begin_line": 692,
      "end_line": 692,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getTrace()",
      "begin_line": 695,
      "end_line": 706,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 696,col 9)-(line 696,col 44)",
        "(line 697,col 9)-(line 697,col 47)",
        "(line 698,col 9)-(line 700,col 8)",
        "(line 701,col 9)-(line 701,col 34)",
        "(line 702,col 9)-(line 704,col 9)",
        "(line 705,col 9)-(line 705,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.operate(T[])",
      "begin_line": 709,
      "end_line": 727,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 711,col 9)-(line 711,col 44)",
        "(line 712,col 9)-(line 712,col 47)",
        "(line 713,col 9)-(line 715,col 9)",
        "(line 717,col 9)-(line 717,col 49)",
        "(line 718,col 9)-(line 724,col 9)",
        "(line 726,col 9)-(line 726,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.operate(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 730,
      "end_line": 752,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 732,col 9)-(line 751,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.preMultiply(T[])",
      "begin_line": 755,
      "end_line": 773,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 757,col 9)-(line 757,col 44)",
        "(line 758,col 9)-(line 758,col 47)",
        "(line 759,col 9)-(line 761,col 9)",
        "(line 763,col 9)-(line 763,col 49)",
        "(line 764,col 9)-(line 770,col 9)",
        "(line 772,col 9)-(line 772,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.preMultiply(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 776,
      "end_line": 798,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 778,col 9)-(line 797,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 801,
      "end_line": 813,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 802,col 9)-(line 802,col 46)",
        "(line 803,col 9)-(line 803,col 49)",
        "(line 804,col 9)-(line 804,col 66)",
        "(line 805,col 9)-(line 811,col 9)",
        "(line 812,col 9)-(line 812,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 816,
      "end_line": 826,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 817,col 9)-(line 817,col 46)",
        "(line 818,col 9)-(line 818,col 49)",
        "(line 819,col 9)-(line 819,col 66)",
        "(line 820,col 9)-(line 824,col 9)",
        "(line 825,col 9)-(line 825,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 829,
      "end_line": 843,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 832,col 9)-(line 832,col 70)",
        "(line 833,col 9)-(line 834,col 64)",
        "(line 835,col 9)-(line 841,col 9)",
        "(line 842,col 9)-(line 842,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 846,
      "end_line": 858,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 849,col 9)-(line 849,col 70)",
        "(line 850,col 9)-(line 851,col 64)",
        "(line 852,col 9)-(line 856,col 9)",
        "(line 857,col 9)-(line 857,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 861,
      "end_line": 873,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 862,col 9)-(line 862,col 46)",
        "(line 863,col 9)-(line 863,col 49)",
        "(line 864,col 9)-(line 864,col 66)",
        "(line 865,col 9)-(line 871,col 9)",
        "(line 872,col 9)-(line 872,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 876,
      "end_line": 886,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 877,col 9)-(line 877,col 46)",
        "(line 878,col 9)-(line 878,col 49)",
        "(line 879,col 9)-(line 879,col 66)",
        "(line 880,col 9)-(line 884,col 9)",
        "(line 885,col 9)-(line 885,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 889,
      "end_line": 904,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 893,col 9)-(line 893,col 70)",
        "(line 894,col 9)-(line 895,col 64)",
        "(line 896,col 9)-(line 902,col 9)",
        "(line 903,col 9)-(line 903,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 907,
      "end_line": 920,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 911,col 9)-(line 911,col 70)",
        "(line 912,col 9)-(line 913,col 64)",
        "(line 914,col 9)-(line 918,col 9)",
        "(line 919,col 9)-(line 919,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 923,
      "end_line": 925,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 924,col 9)-(line 924,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 928,
      "end_line": 930,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 929,col 9)-(line 929,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 933,
      "end_line": 937,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 936,col 9)-(line 936,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 940,
      "end_line": 944,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 943,col 9)-(line 943,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.toString()",
      "begin_line": 950,
      "end_line": 975,
      "comment": "\n     * Get a string representation for this matrix.\n     * @return a string representation for this matrix\n     ",
      "child_ranges": [
        "(line 952,col 9)-(line 952,col 44)",
        "(line 953,col 9)-(line 953,col 47)",
        "(line 954,col 9)-(line 954,col 52)",
        "(line 955,col 9)-(line 955,col 52)",
        "(line 956,col 9)-(line 956,col 92)",
        "(line 957,col 9)-(line 957,col 47)",
        "(line 959,col 9)-(line 971,col 9)",
        "(line 973,col 9)-(line 973,col 24)",
        "(line 974,col 9)-(line 974,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.equals(java.lang.Object)",
      "begin_line": 985,
      "end_line": 1007,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eFieldMatrix\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.\n     *\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 987,col 9)-(line 989,col 9)",
        "(line 990,col 9)-(line 992,col 9)",
        "(line 993,col 9)-(line 993,col 51)",
        "(line 994,col 9)-(line 994,col 44)",
        "(line 995,col 9)-(line 995,col 47)",
        "(line 996,col 9)-(line 998,col 9)",
        "(line 999,col 9)-(line 1005,col 9)",
        "(line 1006,col 9)-(line 1006,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.hashCode()",
      "begin_line": 1014,
      "end_line": 1027,
      "comment": "\n     * Computes a hashcode for the matrix.\n     *\n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 1016,col 9)-(line 1016,col 25)",
        "(line 1017,col 9)-(line 1017,col 44)",
        "(line 1018,col 9)-(line 1018,col 47)",
        "(line 1019,col 9)-(line 1019,col 31)",
        "(line 1020,col 9)-(line 1020,col 31)",
        "(line 1021,col 9)-(line 1025,col 9)",
        "(line 1026,col 9)-(line 1026,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.checkRowIndex(int)",
      "begin_line": 1035,
      "end_line": 1040,
      "comment": "\n     * Check if a row index is valid.\n     *\n     * @param row Row index to check.\n     * @throws OutOfRangeException if {@code index} is not valid.\n     ",
      "child_ranges": [
        "(line 1036,col 9)-(line 1039,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.checkColumnIndex(int)",
      "begin_line": 1048,
      "end_line": 1054,
      "comment": "\n     * Check if a column index is valid.\n     *\n     * @param column Column index to check.\n     * @throws OutOfRangeException if {@code index} is not valid.\n     ",
      "child_ranges": [
        "(line 1050,col 9)-(line 1053,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.checkSubMatrixIndex(int, int, int, int)",
      "begin_line": 1068,
      "end_line": 1084,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param startRow Initial row index.\n     * @param endRow Final row index.\n     * @param startColumn Initial column index.\n     * @param endColumn Final column index.\n     * @throws OutOfRangeException if the indices are not valid.\n     * @throws NumberIsTooSmallException if {@code endRow \u003c startRow} or\n     * {@code endColumn \u003c startColumn}.\n     ",
      "child_ranges": [
        "(line 1071,col 9)-(line 1071,col 32)",
        "(line 1072,col 9)-(line 1072,col 30)",
        "(line 1073,col 9)-(line 1076,col 9)",
        "(line 1078,col 9)-(line 1078,col 38)",
        "(line 1079,col 9)-(line 1079,col 36)",
        "(line 1080,col 9)-(line 1083,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.checkSubMatrixIndex(int[], int[])",
      "begin_line": 1096,
      "end_line": 1113,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param selectedRows Array of row indices.\n     * @param selectedColumns Array of column indices.\n     * @throws NullArgumentException if the arrays are {@code null}.\n     * @throws NoDataException if the arrays have zero length.\n     * @throws OutOfRangeException if row or column selections are not valid.\n     ",
      "child_ranges": [
        "(line 1098,col 9)-(line 1101,col 9)",
        "(line 1102,col 9)-(line 1105,col 9)",
        "(line 1107,col 9)-(line 1109,col 9)",
        "(line 1110,col 9)-(line 1112,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.checkAdditionCompatible(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 1122,
      "end_line": 1129,
      "comment": "\n     * Check if a matrix is addition compatible with the instance.\n     *\n     * @param m Matrix to check.\n     * @throws MatrixDimensionMismatchException if the matrix is not\n     * addition-compatible with instance.\n     ",
      "child_ranges": [
        "(line 1124,col 9)-(line 1128,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.checkSubtractionCompatible(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 1138,
      "end_line": 1145,
      "comment": "\n     * Check if a matrix is subtraction compatible with the instance.\n     *\n     * @param m Matrix to check.\n     * @throws MatrixDimensionMismatchException if the matrix is not\n     * subtraction-compatible with instance.\n     ",
      "child_ranges": [
        "(line 1140,col 9)-(line 1144,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.checkMultiplicationCompatible(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 1154,
      "end_line": 1159,
      "comment": "\n     * Check if a matrix is multiplication compatible with the instance.\n     *\n     * @param m Matrix to check.\n     * @throws DimensionMismatchException if the matrix is not\n     * multiplication-compatible with instance.\n     ",
      "child_ranges": [
        "(line 1156,col 9)-(line 1158,col 9)"
      ]
    }
  ]
}