{
  "filepath": "/tmp/Math-58b/src/main/java/org/apache/commons/math/linear/AbstractFieldMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractFieldMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.FieldMatrix\u003cT\u003e"
      ],
      "begin_line": 45,
      "end_line": 1066,
      "comment": "\n * Basic implementation of {@link FieldMatrix} methods regardless of the underlying storage.\n * \u003cp\u003eAll the methods implemented here use {@link #getEntry(int, int)} to access\n * matrix elements. Derived class can provide faster implementations. \u003c/p\u003e\n *\n * @param \u003cT\u003e Type of the field elements.\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
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
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.AbstractFieldMatrix()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Constructor for use with Serializable\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.AbstractFieldMatrix(org.apache.commons.math.Field\u003cT\u003e)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Creates a matrix with no data\n     * @param field field to which the elements belong\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.AbstractFieldMatrix(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 74,
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
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.extractField(T[][])",
      "begin_line": 97,
      "end_line": 108,
      "comment": "\n     * Get the elements type from an array.\n     *\n     * @param \u003cT\u003e Type of the field elements.\n     * @param d Data array.\n     * @return the field to which the array elements belong.\n     * @throws NullArgumentException if the array is {@code null}.\n     * @throws NoDataException if the array is empty.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.extractField(T[])",
      "begin_line": 118,
      "end_line": 123,
      "comment": "\n     * Get the elements type from an array.\n     *\n     * @param \u003cT\u003e Type of the field elements.\n     * @param d Data array.\n     * @return the field to which the array elements belong.\n     * @throws NoDataException if array is empty.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.buildArray(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 136,
      "end_line": 150,
      "comment": " Build an array of elements.\n     * \u003cp\u003e\n     * Complete arrays are filled with field.getZero()\n     * \u003c/p\u003e\n     * @param \u003cT\u003e Type of the field elements\n     * @param field field to which array elements belong\n     * @param rows number of rows\n     * @param columns number of columns (may be negative to build partial\n     * arrays in the same way \u003ccode\u003enew Field[rows][]\u003c/code\u003e works)\n     * @return a new array\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 145,col 95)",
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.buildArray(org.apache.commons.math.Field\u003cT\u003e, int)",
      "begin_line": 161,
      "end_line": 167,
      "comment": " Build an array of elements.\n     * \u003cp\u003e\n     * Arrays are filled with field.getZero()\n     * \u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param field field to which array elements belong\n     * @param length of the array\n     * @return a new array\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 164,col 80)",
        "(line 165,col 9)-(line 165,col 44)",
        "(line 166,col 9)-(line 166,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getField()",
      "begin_line": 170,
      "end_line": 172,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.createMatrix(int, int)",
      "begin_line": 175,
      "end_line": 175,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.copy()",
      "begin_line": 178,
      "end_line": 178,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.add(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 181,
      "end_line": 195,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 35)",
        "(line 185,col 9)-(line 185,col 50)",
        "(line 186,col 9)-(line 186,col 53)",
        "(line 187,col 9)-(line 187,col 71)",
        "(line 188,col 9)-(line 192,col 9)",
        "(line 194,col 9)-(line 194,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.subtract(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 198,
      "end_line": 212,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 38)",
        "(line 202,col 9)-(line 202,col 50)",
        "(line 203,col 9)-(line 203,col 53)",
        "(line 204,col 9)-(line 204,col 71)",
        "(line 205,col 9)-(line 209,col 9)",
        "(line 211,col 9)-(line 211,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.scalarAdd(T)",
      "begin_line": 215,
      "end_line": 227,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 50)",
        "(line 218,col 9)-(line 218,col 53)",
        "(line 219,col 9)-(line 219,col 71)",
        "(line 220,col 9)-(line 224,col 9)",
        "(line 226,col 9)-(line 226,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.scalarMultiply(T)",
      "begin_line": 230,
      "end_line": 241,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 50)",
        "(line 232,col 9)-(line 232,col 53)",
        "(line 233,col 9)-(line 233,col 71)",
        "(line 234,col 9)-(line 238,col 9)",
        "(line 240,col 9)-(line 240,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.multiply(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 244,
      "end_line": 263,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 41)",
        "(line 248,col 9)-(line 248,col 44)",
        "(line 249,col 9)-(line 249,col 49)",
        "(line 250,col 9)-(line 250,col 47)",
        "(line 251,col 9)-(line 251,col 62)",
        "(line 252,col 9)-(line 260,col 9)",
        "(line 262,col 9)-(line 262,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.preMultiply(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 266,
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
      "end_line": 282,
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
      "begin_line": 285,
      "end_line": 299,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 70)",
        "(line 289,col 9)-(line 290,col 77)",
        "(line 291,col 9)-(line 295,col 9)",
        "(line 297,col 9)-(line 297,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getSubMatrix(int[], int[])",
      "begin_line": 302,
      "end_line": 323,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 59)",
        "(line 309,col 9)-(line 310,col 70)",
        "(line 311,col 9)-(line 319,col 11)",
        "(line 321,col 9)-(line 321,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.Anonymous-8df60faa-8ea7-4030-bc9a-2356234a668a.visit(int, int, T)",
      "begin_line": 314,
      "end_line": 317,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 316,col 17)-(line 316,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.copySubMatrix(int, int, int, int, T[][])",
      "begin_line": 326,
      "end_line": 366,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 70)",
        "(line 331,col 9)-(line 331,col 55)",
        "(line 332,col 9)-(line 332,col 61)",
        "(line 333,col 9)-(line 338,col 9)",
        "(line 341,col 9)-(line 364,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "startRow"
      ],
      "begin_line": 344,
      "end_line": 344,
      "comment": " Initial row index. "
    },
    {
      "type": "field",
      "varNames": [
        "startColumn"
      ],
      "begin_line": 347,
      "end_line": 347,
      "comment": " Initial column index. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.Anonymous-aa626292-728c-45c7-8c58-5db9b7c98b2a.start(int, int, int, int, int, int)",
      "begin_line": 350,
      "end_line": 356,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 354,col 17)-(line 354,col 44)",
        "(line 355,col 17)-(line 355,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.Anonymous-5bf21320-cc84-4bfa-8d59-5be4337edfd2.visit(int, int, T)",
      "begin_line": 359,
      "end_line": 362,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 361,col 17)-(line 361,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.copySubMatrix(int[], int[], T[][])",
      "begin_line": 369,
      "end_line": 388,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 59)",
        "(line 372,col 9)-(line 378,col 9)",
        "(line 381,col 9)-(line 386,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setSubMatrix(T[][], int, int)",
      "begin_line": 391,
      "end_line": 421,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 392,col 9)-(line 394,col 9)",
        "(line 395,col 9)-(line 395,col 43)",
        "(line 396,col 9)-(line 398,col 9)",
        "(line 400,col 9)-(line 400,col 46)",
        "(line 401,col 9)-(line 403,col 9)",
        "(line 405,col 9)-(line 409,col 9)",
        "(line 411,col 9)-(line 411,col 27)",
        "(line 412,col 9)-(line 412,col 33)",
        "(line 413,col 9)-(line 413,col 39)",
        "(line 414,col 9)-(line 414,col 45)",
        "(line 416,col 9)-(line 420,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getRowMatrix(int)",
      "begin_line": 424,
      "end_line": 434,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 27)",
        "(line 426,col 9)-(line 426,col 47)",
        "(line 427,col 9)-(line 427,col 58)",
        "(line 428,col 9)-(line 430,col 9)",
        "(line 432,col 9)-(line 432,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setRowMatrix(int, org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 437,
      "end_line": 450,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 27)",
        "(line 439,col 9)-(line 439,col 47)",
        "(line 440,col 9)-(line 445,col 9)",
        "(line 446,col 9)-(line 448,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getColumnMatrix(int)",
      "begin_line": 453,
      "end_line": 464,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 33)",
        "(line 456,col 9)-(line 456,col 44)",
        "(line 457,col 9)-(line 457,col 58)",
        "(line 458,col 9)-(line 460,col 9)",
        "(line 462,col 9)-(line 462,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setColumnMatrix(int, org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 467,
      "end_line": 480,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 33)",
        "(line 469,col 9)-(line 469,col 44)",
        "(line 470,col 9)-(line 475,col 9)",
        "(line 476,col 9)-(line 478,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getRowVector(int)",
      "begin_line": 483,
      "end_line": 485,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setRowVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 488,
      "end_line": 499,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 27)",
        "(line 490,col 9)-(line 490,col 47)",
        "(line 491,col 9)-(line 494,col 9)",
        "(line 495,col 9)-(line 497,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getColumnVector(int)",
      "begin_line": 502,
      "end_line": 504,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setColumnVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 507,
      "end_line": 518,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 33)",
        "(line 509,col 9)-(line 509,col 44)",
        "(line 510,col 9)-(line 513,col 9)",
        "(line 514,col 9)-(line 516,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getRow(int)",
      "begin_line": 521,
      "end_line": 531,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 27)",
        "(line 523,col 9)-(line 523,col 47)",
        "(line 524,col 9)-(line 524,col 49)",
        "(line 525,col 9)-(line 527,col 9)",
        "(line 529,col 9)-(line 529,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setRow(int, T[])",
      "begin_line": 534,
      "end_line": 544,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 27)",
        "(line 536,col 9)-(line 536,col 47)",
        "(line 537,col 9)-(line 539,col 9)",
        "(line 540,col 9)-(line 542,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getColumn(int)",
      "begin_line": 547,
      "end_line": 557,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 33)",
        "(line 549,col 9)-(line 549,col 44)",
        "(line 550,col 9)-(line 550,col 49)",
        "(line 551,col 9)-(line 553,col 9)",
        "(line 555,col 9)-(line 555,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setColumn(int, T[])",
      "begin_line": 560,
      "end_line": 569,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 33)",
        "(line 562,col 9)-(line 562,col 44)",
        "(line 563,col 9)-(line 565,col 9)",
        "(line 566,col 9)-(line 568,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getEntry(int, int)",
      "begin_line": 572,
      "end_line": 572,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.setEntry(int, int, T)",
      "begin_line": 575,
      "end_line": 575,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.addToEntry(int, int, T)",
      "begin_line": 578,
      "end_line": 578,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.multiplyEntry(int, int, T)",
      "begin_line": 581,
      "end_line": 581,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.transpose()",
      "begin_line": 584,
      "end_line": 597,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 44)",
        "(line 586,col 9)-(line 586,col 47)",
        "(line 587,col 9)-(line 587,col 62)",
        "(line 588,col 9)-(line 594,col 11)",
        "(line 596,col 9)-(line 596,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.Anonymous-866913ca-e1c0-4a7a-ac3e-b82dfa8ed767.visit(int, int, T)",
      "begin_line": 590,
      "end_line": 593,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 592,col 17)-(line 592,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.isSquare()",
      "begin_line": 600,
      "end_line": 602,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 601,col 9)-(line 601,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getRowDimension()",
      "begin_line": 605,
      "end_line": 605,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getColumnDimension()",
      "begin_line": 608,
      "end_line": 608,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.getTrace()",
      "begin_line": 611,
      "end_line": 622,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 44)",
        "(line 613,col 9)-(line 613,col 47)",
        "(line 614,col 9)-(line 616,col 8)",
        "(line 617,col 9)-(line 617,col 34)",
        "(line 618,col 9)-(line 620,col 9)",
        "(line 621,col 9)-(line 621,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.operate(T[])",
      "begin_line": 625,
      "end_line": 643,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 627,col 9)-(line 627,col 44)",
        "(line 628,col 9)-(line 628,col 47)",
        "(line 629,col 9)-(line 631,col 9)",
        "(line 633,col 9)-(line 633,col 49)",
        "(line 634,col 9)-(line 640,col 9)",
        "(line 642,col 9)-(line 642,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.operate(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 646,
      "end_line": 667,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 647,col 9)-(line 666,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.preMultiply(T[])",
      "begin_line": 670,
      "end_line": 688,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 672,col 9)-(line 672,col 44)",
        "(line 673,col 9)-(line 673,col 47)",
        "(line 674,col 9)-(line 676,col 9)",
        "(line 678,col 9)-(line 678,col 49)",
        "(line 679,col 9)-(line 685,col 9)",
        "(line 687,col 9)-(line 687,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.preMultiply(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 691,
      "end_line": 712,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 692,col 9)-(line 711,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 715,
      "end_line": 727,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 46)",
        "(line 717,col 9)-(line 717,col 49)",
        "(line 718,col 9)-(line 718,col 66)",
        "(line 719,col 9)-(line 725,col 9)",
        "(line 726,col 9)-(line 726,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 730,
      "end_line": 740,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 731,col 9)-(line 731,col 46)",
        "(line 732,col 9)-(line 732,col 49)",
        "(line 733,col 9)-(line 733,col 66)",
        "(line 734,col 9)-(line 738,col 9)",
        "(line 739,col 9)-(line 739,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 743,
      "end_line": 757,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 746,col 9)-(line 746,col 70)",
        "(line 747,col 9)-(line 748,col 64)",
        "(line 749,col 9)-(line 755,col 9)",
        "(line 756,col 9)-(line 756,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 760,
      "end_line": 772,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 763,col 9)-(line 763,col 70)",
        "(line 764,col 9)-(line 765,col 64)",
        "(line 766,col 9)-(line 770,col 9)",
        "(line 771,col 9)-(line 771,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 775,
      "end_line": 787,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 776,col 9)-(line 776,col 46)",
        "(line 777,col 9)-(line 777,col 49)",
        "(line 778,col 9)-(line 778,col 66)",
        "(line 779,col 9)-(line 785,col 9)",
        "(line 786,col 9)-(line 786,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 790,
      "end_line": 800,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 791,col 9)-(line 791,col 46)",
        "(line 792,col 9)-(line 792,col 49)",
        "(line 793,col 9)-(line 793,col 66)",
        "(line 794,col 9)-(line 798,col 9)",
        "(line 799,col 9)-(line 799,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 803,
      "end_line": 817,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 806,col 9)-(line 806,col 70)",
        "(line 807,col 9)-(line 808,col 64)",
        "(line 809,col 9)-(line 815,col 9)",
        "(line 816,col 9)-(line 816,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 820,
      "end_line": 832,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 823,col 9)-(line 823,col 70)",
        "(line 824,col 9)-(line 825,col 64)",
        "(line 826,col 9)-(line 830,col 9)",
        "(line 831,col 9)-(line 831,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 835,
      "end_line": 837,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 836,col 9)-(line 836,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 840,
      "end_line": 842,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 841,col 9)-(line 841,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 845,
      "end_line": 849,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 848,col 9)-(line 848,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 852,
      "end_line": 856,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 855,col 9)-(line 855,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.toString()",
      "begin_line": 862,
      "end_line": 887,
      "comment": "\n     * Get a string representation for this matrix.\n     * @return a string representation for this matrix\n     ",
      "child_ranges": [
        "(line 864,col 9)-(line 864,col 44)",
        "(line 865,col 9)-(line 865,col 47)",
        "(line 866,col 9)-(line 866,col 52)",
        "(line 867,col 9)-(line 867,col 52)",
        "(line 868,col 9)-(line 868,col 92)",
        "(line 869,col 9)-(line 869,col 47)",
        "(line 871,col 9)-(line 883,col 9)",
        "(line 885,col 9)-(line 885,col 24)",
        "(line 886,col 9)-(line 886,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.equals(java.lang.Object)",
      "begin_line": 897,
      "end_line": 919,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eFieldMatrix\u003c/code\u003e instance with the same dimensions as this\n     * and all corresponding matrix entries are equal.\n     *\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 899,col 9)-(line 901,col 9)",
        "(line 902,col 9)-(line 904,col 9)",
        "(line 905,col 9)-(line 905,col 51)",
        "(line 906,col 9)-(line 906,col 44)",
        "(line 907,col 9)-(line 907,col 47)",
        "(line 908,col 9)-(line 910,col 9)",
        "(line 911,col 9)-(line 917,col 9)",
        "(line 918,col 9)-(line 918,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.hashCode()",
      "begin_line": 926,
      "end_line": 939,
      "comment": "\n     * Computes a hashcode for the matrix.\n     *\n     * @return hashcode for matrix\n     ",
      "child_ranges": [
        "(line 928,col 9)-(line 928,col 25)",
        "(line 929,col 9)-(line 929,col 44)",
        "(line 930,col 9)-(line 930,col 47)",
        "(line 931,col 9)-(line 931,col 31)",
        "(line 932,col 9)-(line 932,col 31)",
        "(line 933,col 9)-(line 937,col 9)",
        "(line 938,col 9)-(line 938,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkRowIndex(int)",
      "begin_line": 947,
      "end_line": 952,
      "comment": "\n     * Check if a row index is valid.\n     *\n     * @param row Row index to check.\n     * @throws OutOfRangeException if {@code index} is not valid.\n     ",
      "child_ranges": [
        "(line 948,col 9)-(line 951,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkColumnIndex(int)",
      "begin_line": 960,
      "end_line": 965,
      "comment": "\n     * Check if a column index is valid.\n     *\n     * @param column Column index to check.\n     * @throws OutOfRangeException if {@code index} is not valid.\n     ",
      "child_ranges": [
        "(line 961,col 9)-(line 964,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkSubMatrixIndex(int, int, int, int)",
      "begin_line": 979,
      "end_line": 994,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param startRow Initial row index.\n     * @param endRow Final row index.\n     * @param startColumn Initial column index.\n     * @param endColumn Final column index.\n     * @throws OutOfRangeException if the indices are not valid.\n     * @throws NumberIsTooSmallException if {@code endRow \u003c startRow} or\n     * {@code endColumn \u003c startColumn}.\n     ",
      "child_ranges": [
        "(line 981,col 9)-(line 981,col 32)",
        "(line 982,col 9)-(line 982,col 30)",
        "(line 983,col 9)-(line 986,col 9)",
        "(line 988,col 9)-(line 988,col 38)",
        "(line 989,col 9)-(line 989,col 36)",
        "(line 990,col 9)-(line 993,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkSubMatrixIndex(int[], int[])",
      "begin_line": 1006,
      "end_line": 1022,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param selectedRows Array of row indices.\n     * @param selectedColumns Array of column indices.\n     * @throws NullArgumentException if the arrays are {@code null}.\n     * @throws NoDataException if the arrays have zero length.\n     * @throws OutOfRangeException if row or column selections are not valid.\n     ",
      "child_ranges": [
        "(line 1007,col 9)-(line 1010,col 9)",
        "(line 1011,col 9)-(line 1014,col 9)",
        "(line 1016,col 9)-(line 1018,col 9)",
        "(line 1019,col 9)-(line 1021,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkAdditionCompatible(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 1031,
      "end_line": 1037,
      "comment": "\n     * Check if a matrix is addition compatible with the instance.\n     *\n     * @param m Matrix to check.\n     * @throws MatrixDimensionMismatchException if the matrix is not\n     * addition-compatible with instance.\n     ",
      "child_ranges": [
        "(line 1032,col 9)-(line 1036,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkSubtractionCompatible(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 1046,
      "end_line": 1052,
      "comment": "\n     * Check if a matrix is subtraction compatible with the instance.\n     *\n     * @param m Matrix to check.\n     * @throws MatrixDimensionMismatchException if the matrix is not\n     * subtraction-compatible with instance.\n     ",
      "child_ranges": [
        "(line 1047,col 9)-(line 1051,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.AbstractFieldMatrix.checkMultiplicationCompatible(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 1061,
      "end_line": 1065,
      "comment": "\n     * Check if a matrix is multiplication compatible with the instance.\n     *\n     * @param m Matrix to check.\n     * @throws DimensionMismatchException if the matrix is not\n     * multiplication-compatible with instance.\n     ",
      "child_ranges": [
        "(line 1062,col 9)-(line 1064,col 9)"
      ]
    }
  ]
}