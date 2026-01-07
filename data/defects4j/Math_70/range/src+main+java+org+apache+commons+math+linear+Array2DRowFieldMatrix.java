{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/linear/Array2DRowFieldMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Array2DRowFieldMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.AbstractFieldMatrix\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 37,
      "end_line": 631,
      "comment": "\n * Implementation of FieldMatrix\u003cT\u003e using a {@link FieldElement}[][] array to store entries.\n * \u003cp\u003e\n * As specified in the {@link FieldMatrix} interface, matrix element indexing\n * is 0-based -- e.g., \u003ccode\u003egetEntry(0, 0)\u003c/code\u003e\n * returns the element in the first row, first column of the matrix.\u003c/li\u003e\u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @param \u003cT\u003e the type of the field elements\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "AT_LEAST_ONE_ROW_MESSAGE"
      ],
      "begin_line": 43,
      "end_line": 44,
      "comment": " Message for at least one row. "
    },
    {
      "type": "field",
      "varNames": [
        "AT_LEAST_ONE_COLUMN_MESSAGE"
      ],
      "begin_line": 47,
      "end_line": 48,
      "comment": " Message for at least one column. "
    },
    {
      "type": "field",
      "varNames": [
        "DIFFERENT_ROWS_LENGTHS_MESSAGE"
      ],
      "begin_line": 51,
      "end_line": 52,
      "comment": " Message for different rows lengths. "
    },
    {
      "type": "field",
      "varNames": [
        "NO_ENTRY_MESSAGE"
      ],
      "begin_line": 55,
      "end_line": 56,
      "comment": " Message for no entry at selected indices. "
    },
    {
      "type": "field",
      "varNames": [
        "VECTOR_LENGTHS_MISMATCH"
      ],
      "begin_line": 59,
      "end_line": 60,
      "comment": " Message for vector lengths mismatch. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Entries of the matrix "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(org.apache.commons.math.Field\u003cT\u003e)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Creates a matrix with no data\n     * @param field field to which the elements belong\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 82,
      "end_line": 87,
      "comment": "\n     * Create a new FieldMatrix\u003cT\u003e with the supplied row and column dimensions.\n     *\n     * @param field field to which the elements belong\n     * @param rowDimension  the number of rows in the new matrix\n     * @param columnDimension  the number of columns in the new matrix\n     * @throws IllegalArgumentException if row or column dimension is not\n     *  positive\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 52)",
        "(line 86,col 9)-(line 86,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(T[][])",
      "begin_line": 102,
      "end_line": 106,
      "comment": "\n     * Create a new FieldMatrix\u003cT\u003e using the input array as the underlying\n     * data array.\n     * \u003cp\u003eThe input array is copied, not referenced. This constructor has\n     * the same effect as calling {@link #Array2DRowFieldMatrix(FieldElement[][], boolean)}\n     * with the second argument set to \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param d data for new matrix\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     * @see #Array2DRowFieldMatrix(FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 31)",
        "(line 105,col 9)-(line 105,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(T[][], boolean)",
      "begin_line": 123,
      "end_line": 150,
      "comment": "\n     * Create a new FieldMatrix\u003cT\u003e using the input array as the underlying\n     * data array.\n     * \u003cp\u003eIf an array is built specially in order to be embedded in a\n     * FieldMatrix\u003cT\u003e and not used directly, the \u003ccode\u003ecopyArray\u003c/code\u003e may be\n     * set to \u003ccode\u003efalse\u003c/code. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\u003c/p\u003e\n     * @param d data for new matrix\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     * @see #Array2DRowFieldMatrix(FieldElement[][])\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 31)",
        "(line 126,col 9)-(line 149,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(T[])",
      "begin_line": 160,
      "end_line": 167,
      "comment": "\n     * Create a new (column) FieldMatrix\u003cT\u003e using \u003ccode\u003ev\u003c/code\u003e as the\n     * data for the unique column of the \u003ccode\u003ev.length x 1\u003c/code\u003e matrix\n     * created.\n     * \u003cp\u003eThe input array is copied, not referenced.\u003c/p\u003e\n     *\n     * @param v column vector holding data for new matrix\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 31)",
        "(line 162,col 9)-(line 162,col 35)",
        "(line 163,col 9)-(line 163,col 48)",
        "(line 164,col 9)-(line 166,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.createMatrix(int, int)",
      "begin_line": 170,
      "end_line": 174,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.copy()",
      "begin_line": 177,
      "end_line": 180,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.add(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 183,
      "end_line": 191,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 186,col 9)-(line 190,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.add(org.apache.commons.math.linear.Array2DRowFieldMatrix\u003cT\u003e)",
      "begin_line": 200,
      "end_line": 220,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 35)",
        "(line 206,col 9)-(line 206,col 50)",
        "(line 207,col 9)-(line 207,col 53)",
        "(line 208,col 9)-(line 208,col 76)",
        "(line 209,col 9)-(line 216,col 9)",
        "(line 218,col 9)-(line 218,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.subtract(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 223,
      "end_line": 231,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 226,col 9)-(line 230,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.subtract(org.apache.commons.math.linear.Array2DRowFieldMatrix\u003cT\u003e)",
      "begin_line": 240,
      "end_line": 260,
      "comment": "\n     * Compute  this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 38)",
        "(line 246,col 9)-(line 246,col 50)",
        "(line 247,col 9)-(line 247,col 53)",
        "(line 248,col 9)-(line 248,col 76)",
        "(line 249,col 9)-(line 256,col 9)",
        "(line 258,col 9)-(line 258,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.multiply(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 263,
      "end_line": 271,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 266,col 9)-(line 270,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.multiply(org.apache.commons.math.linear.Array2DRowFieldMatrix\u003cT\u003e)",
      "begin_line": 280,
      "end_line": 304,
      "comment": "\n     * Returns the result of postmultiplying this by \u003ccode\u003em\u003c/code\u003e.\n     * @param m    matrix to postmultiply by\n     * @return     this*m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 41)",
        "(line 286,col 9)-(line 286,col 49)",
        "(line 287,col 9)-(line 287,col 49)",
        "(line 288,col 9)-(line 288,col 51)",
        "(line 289,col 9)-(line 289,col 67)",
        "(line 290,col 9)-(line 300,col 9)",
        "(line 302,col 9)-(line 302,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.getData()",
      "begin_line": 307,
      "end_line": 310,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.getDataRef()",
      "begin_line": 319,
      "end_line": 321,
      "comment": "\n     * Returns a reference to the underlying data array.\n     * \u003cp\u003e\n     * Does \u003cstrong\u003enot\u003c/strong\u003e make a fresh copy of the underlying data.\u003c/p\u003e\n     *\n     * @return 2-dimensional array of entries\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.setSubMatrix(T[][], int, int)",
      "begin_line": 324,
      "end_line": 359,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 327,col 9)-(line 357,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.getEntry(int, int)",
      "begin_line": 362,
      "end_line": 371,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 365,col 9)-(line 370,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.setEntry(int, int, T)",
      "begin_line": 374,
      "end_line": 383,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 377,col 9)-(line 382,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.addToEntry(int, int, T)",
      "begin_line": 386,
      "end_line": 395,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 389,col 9)-(line 394,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.multiplyEntry(int, int, T)",
      "begin_line": 398,
      "end_line": 407,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 401,col 9)-(line 406,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.getRowDimension()",
      "begin_line": 410,
      "end_line": 413,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.getColumnDimension()",
      "begin_line": 416,
      "end_line": 419,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.operate(T[])",
      "begin_line": 422,
      "end_line": 441,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 49)",
        "(line 426,col 9)-(line 426,col 52)",
        "(line 427,col 9)-(line 430,col 9)",
        "(line 431,col 9)-(line 431,col 54)",
        "(line 432,col 9)-(line 439,col 9)",
        "(line 440,col 9)-(line 440,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.preMultiply(T[])",
      "begin_line": 444,
      "end_line": 466,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 44)",
        "(line 449,col 9)-(line 449,col 47)",
        "(line 450,col 9)-(line 453,col 9)",
        "(line 455,col 9)-(line 455,col 54)",
        "(line 456,col 9)-(line 462,col 9)",
        "(line 464,col 9)-(line 464,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 469,
      "end_line": 482,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 46)",
        "(line 473,col 9)-(line 473,col 49)",
        "(line 474,col 9)-(line 474,col 66)",
        "(line 475,col 9)-(line 480,col 9)",
        "(line 481,col 9)-(line 481,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 485,
      "end_line": 498,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 46)",
        "(line 489,col 9)-(line 489,col 49)",
        "(line 490,col 9)-(line 490,col 66)",
        "(line 491,col 9)-(line 496,col 9)",
        "(line 497,col 9)-(line 497,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 501,
      "end_line": 516,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 70)",
        "(line 507,col 9)-(line 508,col 64)",
        "(line 509,col 9)-(line 514,col 9)",
        "(line 515,col 9)-(line 515,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 519,
      "end_line": 534,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 70)",
        "(line 525,col 9)-(line 526,col 64)",
        "(line 527,col 9)-(line 532,col 9)",
        "(line 533,col 9)-(line 533,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 537,
      "end_line": 550,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 46)",
        "(line 541,col 9)-(line 541,col 49)",
        "(line 542,col 9)-(line 542,col 66)",
        "(line 543,col 9)-(line 548,col 9)",
        "(line 549,col 9)-(line 549,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 553,
      "end_line": 565,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 46)",
        "(line 557,col 9)-(line 557,col 49)",
        "(line 558,col 9)-(line 558,col 66)",
        "(line 559,col 9)-(line 563,col 9)",
        "(line 564,col 9)-(line 564,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 568,
      "end_line": 583,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 70)",
        "(line 574,col 9)-(line 575,col 64)",
        "(line 576,col 9)-(line 581,col 9)",
        "(line 582,col 9)-(line 582,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 586,
      "end_line": 600,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 70)",
        "(line 592,col 9)-(line 593,col 64)",
        "(line 594,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 599,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.copyOut()",
      "begin_line": 607,
      "end_line": 615,
      "comment": "\n     * Returns a fresh copy of the underlying data array.\n     *\n     * @return a copy of the underlying data array.\n     ",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 49)",
        "(line 609,col 9)-(line 609,col 78)",
        "(line 611,col 9)-(line 613,col 9)",
        "(line 614,col 9)-(line 614,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.copyIn(T[][])",
      "begin_line": 627,
      "end_line": 629,
      "comment": "\n     * Replaces data with a fresh copy of the input array.\n     * \u003cp\u003e\n     * Verifies that the input array is rectangular and non-empty.\u003c/p\u003e\n     *\n     * @param in data to copy in\n     * @throws IllegalArgumentException if input array is empty or not\n     *    rectangular\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 31)"
      ]
    }
  ]
}