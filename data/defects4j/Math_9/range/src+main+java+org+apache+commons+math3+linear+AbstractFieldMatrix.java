{
  "filepath": "/tmp/Math-9b/src/main/java/org/apache/commons/math3/linear/AbstractFieldMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractFieldMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e"
      ],
      "begin_line": 44,
      "end_line": 1122,
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
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getField()",
      "begin_line": 128,
      "end_line": 130,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.createMatrix(int, int)",
      "begin_line": 133,
      "end_line": 135,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.copy()",
      "begin_line": 138,
      "end_line": 138,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.add(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 141,
      "end_line": 156,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 35)",
        "(line 146,col 9)-(line 146,col 50)",
        "(line 147,col 9)-(line 147,col 53)",
        "(line 148,col 9)-(line 148,col 71)",
        "(line 149,col 9)-(line 153,col 9)",
        "(line 155,col 9)-(line 155,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.subtract(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 159,
      "end_line": 174,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 38)",
        "(line 164,col 9)-(line 164,col 50)",
        "(line 165,col 9)-(line 165,col 53)",
        "(line 166,col 9)-(line 166,col 71)",
        "(line 167,col 9)-(line 171,col 9)",
        "(line 173,col 9)-(line 173,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.scalarAdd(T)",
      "begin_line": 177,
      "end_line": 189,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 50)",
        "(line 180,col 9)-(line 180,col 53)",
        "(line 181,col 9)-(line 181,col 71)",
        "(line 182,col 9)-(line 186,col 9)",
        "(line 188,col 9)-(line 188,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.scalarMultiply(T)",
      "begin_line": 192,
      "end_line": 203,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 50)",
        "(line 194,col 9)-(line 194,col 53)",
        "(line 195,col 9)-(line 195,col 71)",
        "(line 196,col 9)-(line 200,col 9)",
        "(line 202,col 9)-(line 202,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.multiply(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 206,
      "end_line": 226,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 41)",
        "(line 211,col 9)-(line 211,col 44)",
        "(line 212,col 9)-(line 212,col 49)",
        "(line 213,col 9)-(line 213,col 47)",
        "(line 214,col 9)-(line 214,col 62)",
        "(line 215,col 9)-(line 223,col 9)",
        "(line 225,col 9)-(line 225,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.preMultiply(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 229,
      "end_line": 232,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.power(int)",
      "begin_line": 235,
      "end_line": 291,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 237,col 9)-(line 239,col 9)",
        "(line 241,col 9)-(line 243,col 9)",
        "(line 245,col 9)-(line 247,col 9)",
        "(line 249,col 9)-(line 251,col 9)",
        "(line 253,col 9)-(line 253,col 32)",
        "(line 262,col 9)-(line 263,col 31)",
        "(line 264,col 9)-(line 264,col 77)",
        "(line 266,col 9)-(line 271,col 9)",
        "(line 273,col 9)-(line 274,col 45)",
        "(line 276,col 9)-(line 276,col 36)",
        "(line 278,col 9)-(line 282,col 9)",
        "(line 284,col 9)-(line 284,col 44)",
        "(line 286,col 9)-(line 288,col 9)",
        "(line 290,col 9)-(line 290,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getData()",
      "begin_line": 294,
      "end_line": 305,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 97)",
        "(line 297,col 9)-(line 302,col 9)",
        "(line 304,col 9)-(line 304,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 308,
      "end_line": 323,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 70)",
        "(line 313,col 9)-(line 314,col 77)",
        "(line 315,col 9)-(line 319,col 9)",
        "(line 321,col 9)-(line 321,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getSubMatrix(int[], int[])",
      "begin_line": 326,
      "end_line": 348,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 59)",
        "(line 334,col 9)-(line 335,col 70)",
        "(line 336,col 9)-(line 344,col 11)",
        "(line 346,col 9)-(line 346,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.Anonymous-cc0eb73a-92e3-46a5-b3dd-9505af5e596c.visit(int, int, T)",
      "begin_line": 339,
      "end_line": 342,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 341,col 17)-(line 341,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.copySubMatrix(int, int, int, int, T[][])",
      "begin_line": 351,
      "end_line": 393,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 70)",
        "(line 358,col 9)-(line 358,col 55)",
        "(line 359,col 9)-(line 359,col 61)",
        "(line 360,col 9)-(line 365,col 9)",
        "(line 368,col 9)-(line 391,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "startRow"
      ],
      "begin_line": 371,
      "end_line": 371,
      "comment": " Initial row index. "
    },
    {
      "type": "field",
      "varNames": [
        "startColumn"
      ],
      "begin_line": 374,
      "end_line": 374,
      "comment": " Initial column index. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.Anonymous-3394a980-2c75-4fe2-8e7d-66aca62fde46.start(int, int, int, int, int, int)",
      "begin_line": 377,
      "end_line": 383,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 381,col 17)-(line 381,col 44)",
        "(line 382,col 17)-(line 382,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.Anonymous-6a2960c7-825a-40ea-ad4d-2dd3dca710ea.visit(int, int, T)",
      "begin_line": 386,
      "end_line": 389,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 388,col 17)-(line 388,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.copySubMatrix(int[], int[], T[][])",
      "begin_line": 396,
      "end_line": 417,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 59)",
        "(line 401,col 9)-(line 407,col 9)",
        "(line 410,col 9)-(line 415,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.setSubMatrix(T[][], int, int)",
      "begin_line": 420,
      "end_line": 453,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 424,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 427,col 43)",
        "(line 428,col 9)-(line 430,col 9)",
        "(line 432,col 9)-(line 432,col 46)",
        "(line 433,col 9)-(line 435,col 9)",
        "(line 437,col 9)-(line 441,col 9)",
        "(line 443,col 9)-(line 443,col 27)",
        "(line 444,col 9)-(line 444,col 33)",
        "(line 445,col 9)-(line 445,col 39)",
        "(line 446,col 9)-(line 446,col 45)",
        "(line 448,col 9)-(line 452,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getRowMatrix(int)",
      "begin_line": 456,
      "end_line": 466,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 27)",
        "(line 458,col 9)-(line 458,col 47)",
        "(line 459,col 9)-(line 459,col 58)",
        "(line 460,col 9)-(line 462,col 9)",
        "(line 464,col 9)-(line 464,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.setRowMatrix(int, org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 469,
      "end_line": 483,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 27)",
        "(line 472,col 9)-(line 472,col 47)",
        "(line 473,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 481,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getColumnMatrix(int)",
      "begin_line": 486,
      "end_line": 498,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 33)",
        "(line 490,col 9)-(line 490,col 44)",
        "(line 491,col 9)-(line 491,col 58)",
        "(line 492,col 9)-(line 494,col 9)",
        "(line 496,col 9)-(line 496,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.setColumnMatrix(int, org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 501,
      "end_line": 515,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 33)",
        "(line 504,col 9)-(line 504,col 44)",
        "(line 505,col 9)-(line 510,col 9)",
        "(line 511,col 9)-(line 513,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getRowVector(int)",
      "begin_line": 518,
      "end_line": 521,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.setRowVector(int, org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 524,
      "end_line": 536,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 27)",
        "(line 527,col 9)-(line 527,col 47)",
        "(line 528,col 9)-(line 531,col 9)",
        "(line 532,col 9)-(line 534,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getColumnVector(int)",
      "begin_line": 539,
      "end_line": 542,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.setColumnVector(int, org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 545,
      "end_line": 558,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 33)",
        "(line 549,col 9)-(line 549,col 44)",
        "(line 550,col 9)-(line 553,col 9)",
        "(line 554,col 9)-(line 556,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getRow(int)",
      "begin_line": 561,
      "end_line": 571,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 27)",
        "(line 563,col 9)-(line 563,col 47)",
        "(line 564,col 9)-(line 564,col 60)",
        "(line 565,col 9)-(line 567,col 9)",
        "(line 569,col 9)-(line 569,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.setRow(int, T[])",
      "begin_line": 574,
      "end_line": 585,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 27)",
        "(line 577,col 9)-(line 577,col 47)",
        "(line 578,col 9)-(line 580,col 9)",
        "(line 581,col 9)-(line 583,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getColumn(int)",
      "begin_line": 588,
      "end_line": 598,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 589,col 9)-(line 589,col 33)",
        "(line 590,col 9)-(line 590,col 44)",
        "(line 591,col 9)-(line 591,col 60)",
        "(line 592,col 9)-(line 594,col 9)",
        "(line 596,col 9)-(line 596,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.setColumn(int, T[])",
      "begin_line": 601,
      "end_line": 611,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 33)",
        "(line 604,col 9)-(line 604,col 44)",
        "(line 605,col 9)-(line 607,col 9)",
        "(line 608,col 9)-(line 610,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getEntry(int, int)",
      "begin_line": 614,
      "end_line": 614,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.setEntry(int, int, T)",
      "begin_line": 617,
      "end_line": 617,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.addToEntry(int, int, T)",
      "begin_line": 620,
      "end_line": 620,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.multiplyEntry(int, int, T)",
      "begin_line": 623,
      "end_line": 623,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.transpose()",
      "begin_line": 626,
      "end_line": 639,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 627,col 9)-(line 627,col 44)",
        "(line 628,col 9)-(line 628,col 47)",
        "(line 629,col 9)-(line 629,col 62)",
        "(line 630,col 9)-(line 636,col 11)",
        "(line 638,col 9)-(line 638,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.Anonymous-17488be6-52a5-45bc-8e21-4abce149ae8e.visit(int, int, T)",
      "begin_line": 632,
      "end_line": 635,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 634,col 17)-(line 634,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.isSquare()",
      "begin_line": 642,
      "end_line": 644,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 643,col 9)-(line 643,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getRowDimension()",
      "begin_line": 647,
      "end_line": 647,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getColumnDimension()",
      "begin_line": 650,
      "end_line": 650,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.getTrace()",
      "begin_line": 653,
      "end_line": 664,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 654,col 9)-(line 654,col 44)",
        "(line 655,col 9)-(line 655,col 47)",
        "(line 656,col 9)-(line 658,col 8)",
        "(line 659,col 9)-(line 659,col 34)",
        "(line 660,col 9)-(line 662,col 9)",
        "(line 663,col 9)-(line 663,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.operate(T[])",
      "begin_line": 667,
      "end_line": 685,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 669,col 9)-(line 669,col 44)",
        "(line 670,col 9)-(line 670,col 47)",
        "(line 671,col 9)-(line 673,col 9)",
        "(line 675,col 9)-(line 675,col 60)",
        "(line 676,col 9)-(line 682,col 9)",
        "(line 684,col 9)-(line 684,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.operate(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 688,
      "end_line": 710,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 690,col 9)-(line 709,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.preMultiply(T[])",
      "begin_line": 713,
      "end_line": 731,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 715,col 9)-(line 715,col 44)",
        "(line 716,col 9)-(line 716,col 47)",
        "(line 717,col 9)-(line 719,col 9)",
        "(line 721,col 9)-(line 721,col 60)",
        "(line 722,col 9)-(line 728,col 9)",
        "(line 730,col 9)-(line 730,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.preMultiply(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 734,
      "end_line": 756,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 736,col 9)-(line 755,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 759,
      "end_line": 771,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 760,col 9)-(line 760,col 46)",
        "(line 761,col 9)-(line 761,col 49)",
        "(line 762,col 9)-(line 762,col 66)",
        "(line 763,col 9)-(line 769,col 9)",
        "(line 770,col 9)-(line 770,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 774,
      "end_line": 784,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 46)",
        "(line 776,col 9)-(line 776,col 49)",
        "(line 777,col 9)-(line 777,col 66)",
        "(line 778,col 9)-(line 782,col 9)",
        "(line 783,col 9)-(line 783,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 787,
      "end_line": 802,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 791,col 9)-(line 791,col 70)",
        "(line 792,col 9)-(line 793,col 64)",
        "(line 794,col 9)-(line 800,col 9)",
        "(line 801,col 9)-(line 801,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 805,
      "end_line": 818,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 809,col 9)-(line 809,col 70)",
        "(line 810,col 9)-(line 811,col 64)",
        "(line 812,col 9)-(line 816,col 9)",
        "(line 817,col 9)-(line 817,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 821,
      "end_line": 833,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 822,col 9)-(line 822,col 46)",
        "(line 823,col 9)-(line 823,col 49)",
        "(line 824,col 9)-(line 824,col 66)",
        "(line 825,col 9)-(line 831,col 9)",
        "(line 832,col 9)-(line 832,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 836,
      "end_line": 846,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 837,col 9)-(line 837,col 46)",
        "(line 838,col 9)-(line 838,col 49)",
        "(line 839,col 9)-(line 839,col 66)",
        "(line 840,col 9)-(line 844,col 9)",
        "(line 845,col 9)-(line 845,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 849,
      "end_line": 864,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 853,col 9)-(line 853,col 70)",
        "(line 854,col 9)-(line 855,col 64)",
        "(line 856,col 9)-(line 862,col 9)",
        "(line 863,col 9)-(line 863,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 867,
      "end_line": 880,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 871,col 9)-(line 871,col 70)",
        "(line 872,col 9)-(line 873,col 64)",
        "(line 874,col 9)-(line 878,col 9)",
        "(line 879,col 9)-(line 879,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 883,
      "end_line": 885,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 884,col 9)-(line 884,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 888,
      "end_line": 890,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 889,col 9)-(line 889,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 893,
      "end_line": 898,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 897,col 9)-(line 897,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 901,
      "end_line": 906,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 905,col 9)-(line 905,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.toString()",
      "begin_line": 912,
      "end_line": 937,
      "comment": "\n     * Get a string representation for this matrix.\n     * @return a string representation for this matrix\n     ",
      "child_ranges": [
        "(line 914,col 9)-(line 914,col 44)",
        "(line 915,col 9)-(line 915,col 47)",
        "(line 916,col 9)-(line 916,col 52)",
        "(line 917,col 9)-(line 917,col 52)",
        "(line 918,col 9)-(line 918,col 92)",
        "(line 919,col 9)-(line 919,col 47)",
        "(line 921,col 9)-(line 933,col 9)",
        "(line 935,col 9)-(line 935,col 24)",
        "(line 936,col 9)-(line 936,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.equals(java.lang.Object)",
      "begin_line": 947,
      "end_line": 969,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eFieldMatrix\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.\n     *\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 949,col 9)-(line 951,col 9)",
        "(line 952,col 9)-(line 954,col 9)",
        "(line 955,col 9)-(line 955,col 51)",
        "(line 956,col 9)-(line 956,col 44)",
        "(line 957,col 9)-(line 957,col 47)",
        "(line 958,col 9)-(line 960,col 9)",
        "(line 961,col 9)-(line 967,col 9)",
        "(line 968,col 9)-(line 968,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.hashCode()",
      "begin_line": 976,
      "end_line": 989,
      "comment": "\n     * Computes a hashcode for the matrix.\n     *\n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 978,col 9)-(line 978,col 25)",
        "(line 979,col 9)-(line 979,col 44)",
        "(line 980,col 9)-(line 980,col 47)",
        "(line 981,col 9)-(line 981,col 31)",
        "(line 982,col 9)-(line 982,col 31)",
        "(line 983,col 9)-(line 987,col 9)",
        "(line 988,col 9)-(line 988,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.checkRowIndex(int)",
      "begin_line": 997,
      "end_line": 1002,
      "comment": "\n     * Check if a row index is valid.\n     *\n     * @param row Row index to check.\n     * @throws OutOfRangeException if {@code index} is not valid.\n     ",
      "child_ranges": [
        "(line 998,col 9)-(line 1001,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.checkColumnIndex(int)",
      "begin_line": 1010,
      "end_line": 1016,
      "comment": "\n     * Check if a column index is valid.\n     *\n     * @param column Column index to check.\n     * @throws OutOfRangeException if {@code index} is not valid.\n     ",
      "child_ranges": [
        "(line 1012,col 9)-(line 1015,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.checkSubMatrixIndex(int, int, int, int)",
      "begin_line": 1030,
      "end_line": 1046,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param startRow Initial row index.\n     * @param endRow Final row index.\n     * @param startColumn Initial column index.\n     * @param endColumn Final column index.\n     * @throws OutOfRangeException if the indices are not valid.\n     * @throws NumberIsTooSmallException if {@code endRow \u003c startRow} or\n     * {@code endColumn \u003c startColumn}.\n     ",
      "child_ranges": [
        "(line 1033,col 9)-(line 1033,col 32)",
        "(line 1034,col 9)-(line 1034,col 30)",
        "(line 1035,col 9)-(line 1038,col 9)",
        "(line 1040,col 9)-(line 1040,col 38)",
        "(line 1041,col 9)-(line 1041,col 36)",
        "(line 1042,col 9)-(line 1045,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.checkSubMatrixIndex(int[], int[])",
      "begin_line": 1058,
      "end_line": 1075,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param selectedRows Array of row indices.\n     * @param selectedColumns Array of column indices.\n     * @throws NullArgumentException if the arrays are {@code null}.\n     * @throws NoDataException if the arrays have zero length.\n     * @throws OutOfRangeException if row or column selections are not valid.\n     ",
      "child_ranges": [
        "(line 1060,col 9)-(line 1063,col 9)",
        "(line 1064,col 9)-(line 1067,col 9)",
        "(line 1069,col 9)-(line 1071,col 9)",
        "(line 1072,col 9)-(line 1074,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.checkAdditionCompatible(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 1084,
      "end_line": 1091,
      "comment": "\n     * Check if a matrix is addition compatible with the instance.\n     *\n     * @param m Matrix to check.\n     * @throws MatrixDimensionMismatchException if the matrix is not\n     * addition-compatible with instance.\n     ",
      "child_ranges": [
        "(line 1086,col 9)-(line 1090,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.checkSubtractionCompatible(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 1100,
      "end_line": 1107,
      "comment": "\n     * Check if a matrix is subtraction compatible with the instance.\n     *\n     * @param m Matrix to check.\n     * @throws MatrixDimensionMismatchException if the matrix is not\n     * subtraction-compatible with instance.\n     ",
      "child_ranges": [
        "(line 1102,col 9)-(line 1106,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.AbstractFieldMatrix.checkMultiplicationCompatible(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 1116,
      "end_line": 1121,
      "comment": "\n     * Check if a matrix is multiplication compatible with the instance.\n     *\n     * @param m Matrix to check.\n     * @throws DimensionMismatchException if the matrix is not\n     * multiplication-compatible with instance.\n     ",
      "child_ranges": [
        "(line 1118,col 9)-(line 1120,col 9)"
      ]
    }
  ]
}