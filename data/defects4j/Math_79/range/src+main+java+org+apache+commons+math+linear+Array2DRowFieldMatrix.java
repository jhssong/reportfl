{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/linear/Array2DRowFieldMatrix.java",
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
      "end_line": 617,
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
        "data"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Entries of the matrix "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(org.apache.commons.math.Field\u003cT\u003e)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Creates a matrix with no data\n     * @param field field to which the elements belong\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 62,
      "end_line": 67,
      "comment": "\n     * Create a new FieldMatrix\u003cT\u003e with the supplied row and column dimensions.\n     *\n     * @param field field to which the elements belong\n     * @param rowDimension  the number of rows in the new matrix\n     * @param columnDimension  the number of columns in the new matrix\n     * @throws IllegalArgumentException if row or column dimension is not\n     *  positive\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 52)",
        "(line 66,col 9)-(line 66,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(T[][])",
      "begin_line": 82,
      "end_line": 86,
      "comment": "\n     * Create a new FieldMatrix\u003cT\u003e using the input array as the underlying\n     * data array.\n     * \u003cp\u003eThe input array is copied, not referenced. This constructor has\n     * the same effect as calling {@link #Array2DRowFieldMatrix(FieldElement[][], boolean)}\n     * with the second argument set to \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param d data for new matrix\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     * @see #Array2DRowFieldMatrix(FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 31)",
        "(line 85,col 9)-(line 85,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(T[][], boolean)",
      "begin_line": 103,
      "end_line": 129,
      "comment": "\n     * Create a new FieldMatrix\u003cT\u003e using the input array as the underlying\n     * data array.\n     * \u003cp\u003eIf an array is built specially in order to be embedded in a\n     * FieldMatrix\u003cT\u003e and not used directly, the \u003ccode\u003ecopyArray\u003c/code\u003e may be\n     * set to \u003ccode\u003efalse\u003c/code. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\u003c/p\u003e\n     * @param d data for new matrix\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     * @throws IllegalArgumentException if \u003ccode\u003ed\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003ed\u003c/code\u003e is null\n     * @see #Array2DRowFieldMatrix(FieldElement[][])\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 31)",
        "(line 106,col 9)-(line 128,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(T[])",
      "begin_line": 139,
      "end_line": 146,
      "comment": "\n     * Create a new (column) FieldMatrix\u003cT\u003e using \u003ccode\u003ev\u003c/code\u003e as the\n     * data for the unique column of the \u003ccode\u003ev.length x 1\u003c/code\u003e matrix\n     * created.\n     * \u003cp\u003eThe input array is copied, not referenced.\u003c/p\u003e\n     *\n     * @param v column vector holding data for new matrix\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 31)",
        "(line 141,col 9)-(line 141,col 35)",
        "(line 142,col 9)-(line 142,col 48)",
        "(line 143,col 9)-(line 145,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.createMatrix(int, int)",
      "begin_line": 149,
      "end_line": 153,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.copy()",
      "begin_line": 156,
      "end_line": 159,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.add(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 162,
      "end_line": 170,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 165,col 9)-(line 169,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.add(org.apache.commons.math.linear.Array2DRowFieldMatrix\u003cT\u003e)",
      "begin_line": 179,
      "end_line": 199,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 35)",
        "(line 185,col 9)-(line 185,col 50)",
        "(line 186,col 9)-(line 186,col 53)",
        "(line 187,col 9)-(line 187,col 76)",
        "(line 188,col 9)-(line 195,col 9)",
        "(line 197,col 9)-(line 197,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.subtract(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 202,
      "end_line": 210,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 205,col 9)-(line 209,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.subtract(org.apache.commons.math.linear.Array2DRowFieldMatrix\u003cT\u003e)",
      "begin_line": 219,
      "end_line": 239,
      "comment": "\n     * Compute  this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 38)",
        "(line 225,col 9)-(line 225,col 50)",
        "(line 226,col 9)-(line 226,col 53)",
        "(line 227,col 9)-(line 227,col 76)",
        "(line 228,col 9)-(line 235,col 9)",
        "(line 237,col 9)-(line 237,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.multiply(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 242,
      "end_line": 250,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 245,col 9)-(line 249,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.multiply(org.apache.commons.math.linear.Array2DRowFieldMatrix\u003cT\u003e)",
      "begin_line": 259,
      "end_line": 283,
      "comment": "\n     * Returns the result of postmultiplying this by \u003ccode\u003em\u003c/code\u003e.\n     * @param m    matrix to postmultiply by\n     * @return     this*m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 41)",
        "(line 265,col 9)-(line 265,col 49)",
        "(line 266,col 9)-(line 266,col 49)",
        "(line 267,col 9)-(line 267,col 51)",
        "(line 268,col 9)-(line 268,col 67)",
        "(line 269,col 9)-(line 279,col 9)",
        "(line 281,col 9)-(line 281,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.getData()",
      "begin_line": 286,
      "end_line": 289,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.getDataRef()",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n     * Returns a reference to the underlying data array.\n     * \u003cp\u003e\n     * Does \u003cstrong\u003enot\u003c/strong\u003e make a fresh copy of the underlying data.\u003c/p\u003e\n     *\n     * @return 2-dimensional array of entries\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.setSubMatrix(T[][], int, int)",
      "begin_line": 303,
      "end_line": 339,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 306,col 9)-(line 337,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.getEntry(int, int)",
      "begin_line": 342,
      "end_line": 352,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 345,col 9)-(line 351,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.setEntry(int, int, T)",
      "begin_line": 355,
      "end_line": 365,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 358,col 9)-(line 364,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.addToEntry(int, int, T)",
      "begin_line": 368,
      "end_line": 378,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 371,col 9)-(line 377,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.multiplyEntry(int, int, T)",
      "begin_line": 381,
      "end_line": 391,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 384,col 9)-(line 390,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.getRowDimension()",
      "begin_line": 394,
      "end_line": 397,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.getColumnDimension()",
      "begin_line": 400,
      "end_line": 403,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.operate(T[])",
      "begin_line": 406,
      "end_line": 426,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 49)",
        "(line 410,col 9)-(line 410,col 52)",
        "(line 411,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 416,col 54)",
        "(line 417,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 425,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.preMultiply(T[])",
      "begin_line": 429,
      "end_line": 452,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 44)",
        "(line 434,col 9)-(line 434,col 47)",
        "(line 435,col 9)-(line 439,col 9)",
        "(line 441,col 9)-(line 441,col 54)",
        "(line 442,col 9)-(line 448,col 9)",
        "(line 450,col 9)-(line 450,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 455,
      "end_line": 468,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 46)",
        "(line 459,col 9)-(line 459,col 49)",
        "(line 460,col 9)-(line 460,col 66)",
        "(line 461,col 9)-(line 466,col 9)",
        "(line 467,col 9)-(line 467,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 471,
      "end_line": 484,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 46)",
        "(line 475,col 9)-(line 475,col 49)",
        "(line 476,col 9)-(line 476,col 66)",
        "(line 477,col 9)-(line 482,col 9)",
        "(line 483,col 9)-(line 483,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 487,
      "end_line": 502,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 70)",
        "(line 493,col 9)-(line 494,col 64)",
        "(line 495,col 9)-(line 500,col 9)",
        "(line 501,col 9)-(line 501,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 505,
      "end_line": 520,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 70)",
        "(line 511,col 9)-(line 512,col 64)",
        "(line 513,col 9)-(line 518,col 9)",
        "(line 519,col 9)-(line 519,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 523,
      "end_line": 536,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 46)",
        "(line 527,col 9)-(line 527,col 49)",
        "(line 528,col 9)-(line 528,col 66)",
        "(line 529,col 9)-(line 534,col 9)",
        "(line 535,col 9)-(line 535,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 539,
      "end_line": 551,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 46)",
        "(line 543,col 9)-(line 543,col 49)",
        "(line 544,col 9)-(line 544,col 66)",
        "(line 545,col 9)-(line 549,col 9)",
        "(line 550,col 9)-(line 550,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 554,
      "end_line": 569,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 70)",
        "(line 560,col 9)-(line 561,col 64)",
        "(line 562,col 9)-(line 567,col 9)",
        "(line 568,col 9)-(line 568,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 572,
      "end_line": 586,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 70)",
        "(line 578,col 9)-(line 579,col 64)",
        "(line 580,col 9)-(line 584,col 9)",
        "(line 585,col 9)-(line 585,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.copyOut()",
      "begin_line": 593,
      "end_line": 601,
      "comment": "\n     * Returns a fresh copy of the underlying data array.\n     *\n     * @return a copy of the underlying data array.\n     ",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 49)",
        "(line 595,col 9)-(line 595,col 78)",
        "(line 597,col 9)-(line 599,col 9)",
        "(line 600,col 9)-(line 600,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.copyIn(T[][])",
      "begin_line": 613,
      "end_line": 615,
      "comment": "\n     * Replaces data with a fresh copy of the input array.\n     * \u003cp\u003e\n     * Verifies that the input array is rectangular and non-empty.\u003c/p\u003e\n     *\n     * @param in data to copy in\n     * @throws IllegalArgumentException if input array is empty or not\n     *    rectangular\n     * @throws NullPointerException if input array is null\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 31)"
      ]
    }
  ]
}