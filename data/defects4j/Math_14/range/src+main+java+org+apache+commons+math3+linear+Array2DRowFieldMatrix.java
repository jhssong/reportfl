{
  "filepath": "/tmp/Math-14b/src/main/java/org/apache/commons/math3/linear/Array2DRowFieldMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Array2DRowFieldMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.AbstractFieldMatrix\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 45,
      "end_line": 612,
      "comment": "\n * Implementation of FieldMatrix\u003cT\u003e using a {@link FieldElement}[][] array to store entries.\n * \u003cp\u003e\n * As specified in the {@link FieldMatrix} interface, matrix element indexing\n * is 0-based -- e.g., \u003ccode\u003egetEntry(0, 0)\u003c/code\u003e\n * returns the element in the first row, first column of the matrix.\u003c/li\u003e\u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @param \u003cT\u003e the type of the field elements\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Entries of the matrix "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(org.apache.commons.math3.Field\u003cT\u003e)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Creates a matrix with no data\n     * @param field field to which the elements belong\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(org.apache.commons.math3.Field\u003cT\u003e, int, int)",
      "begin_line": 69,
      "end_line": 74,
      "comment": "\n     * Create a new {@code FieldMatrix\u003cT\u003e} with the supplied row and column dimensions.\n     *\n     * @param field Field to which the elements belong.\n     * @param rowDimension Number of rows in the new matrix.\n     * @param columnDimension Number of columns in the new matrix.\n     * @throws NotStrictlyPositiveException if row or column dimension is not positive.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 52)",
        "(line 73,col 9)-(line 73,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(T[][])",
      "begin_line": 89,
      "end_line": 93,
      "comment": "\n     * Create a new {@code FieldMatrix\u003cT\u003e} using the input array as the underlying\n     * data array.\n     * \u003cp\u003eThe input array is copied, not referenced. This constructor has\n     * the same effect as calling {@link #Array2DRowFieldMatrix(FieldElement[][], boolean)}\n     * with the second argument set to {@code true}.\u003c/p\u003e\n     *\n     * @param d Data for the new matrix.\n     * @throws DimensionMismatchException if {@code d} is not rectangular.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws NoDataException if there are not at least one row and one column.\n     * @see #Array2DRowFieldMatrix(FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(org.apache.commons.math3.Field\u003cT\u003e, T[][])",
      "begin_line": 109,
      "end_line": 114,
      "comment": "\n     * Create a new {@code FieldMatrix\u003cT\u003e} using the input array as the underlying\n     * data array.\n     * \u003cp\u003eThe input array is copied, not referenced. This constructor has\n     * the same effect as calling {@link #Array2DRowFieldMatrix(FieldElement[][], boolean)}\n     * with the second argument set to {@code true}.\u003c/p\u003e\n     *\n     * @param field Field to which the elements belong.\n     * @param d Data for the new matrix.\n     * @throws DimensionMismatchException if {@code d} is not rectangular.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws NoDataException if there are not at least one row and one column.\n     * @see #Array2DRowFieldMatrix(FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 21)",
        "(line 113,col 9)-(line 113,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(T[][], boolean)",
      "begin_line": 131,
      "end_line": 135,
      "comment": "\n     * Create a new {@code FieldMatrix\u003cT\u003e} using the input array as the underlying\n     * data array.\n     * \u003cp\u003eIf an array is built specially in order to be embedded in a\n     * {@code FieldMatrix\u003cT\u003e} and not used directly, the {@code copyArray} may be\n     * set to {@code false}. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\u003c/p\u003e\n     *\n     * @param d Data for the new matrix.\n     * @param copyArray Whether to copy or reference the input array.\n     * @throws DimensionMismatchException if {@code d} is not rectangular.\n     * @throws NoDataException if there are not at least one row and one column.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @see #Array2DRowFieldMatrix(FieldElement[][])\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(org.apache.commons.math3.Field\u003cT\u003e, T[][], boolean)",
      "begin_line": 153,
      "end_line": 175,
      "comment": "\n     * Create a new {@code FieldMatrix\u003cT\u003e} using the input array as the underlying\n     * data array.\n     * \u003cp\u003eIf an array is built specially in order to be embedded in a\n     * {@code FieldMatrix\u003cT\u003e} and not used directly, the {@code copyArray} may be\n     * set to {@code false}. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\u003c/p\u003e\n     *\n     * @param field Field to which the elements belong.\n     * @param d Data for the new matrix.\n     * @param copyArray Whether to copy or reference the input array.\n     * @throws DimensionMismatchException if {@code d} is not rectangular.\n     * @throws NoDataException if there are not at least one row and one column.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @see #Array2DRowFieldMatrix(FieldElement[][])\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 21)",
        "(line 156,col 9)-(line 174,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(T[])",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * Create a new (column) {@code FieldMatrix\u003cT\u003e} using {@code v} as the\n     * data for the unique column of the created matrix.\n     * The input array is copied.\n     *\n     * @param v Column vector holding data for new matrix.\n     * @throws NoDataException if v is empty\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(org.apache.commons.math3.Field\u003cT\u003e, T[])",
      "begin_line": 197,
      "end_line": 204,
      "comment": "\n     * Create a new (column) {@code FieldMatrix\u003cT\u003e} using {@code v} as the\n     * data for the unique column of the created matrix.\n     * The input array is copied.\n     *\n     * @param field Field to which the elements belong.\n     * @param v Column vector holding data for new matrix.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 21)",
        "(line 199,col 9)-(line 199,col 35)",
        "(line 200,col 9)-(line 200,col 48)",
        "(line 201,col 9)-(line 203,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.createMatrix(int, int)",
      "begin_line": 207,
      "end_line": 212,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.copy()",
      "begin_line": 215,
      "end_line": 218,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.add(org.apache.commons.math3.linear.Array2DRowFieldMatrix\u003cT\u003e)",
      "begin_line": 228,
      "end_line": 246,
      "comment": "\n     * Add {@code m} to this matrix.\n     *\n     * @param m Matrix to be added.\n     * @return {@code this} + m.\n     * @throws MatrixDimensionMismatchException if {@code m} is not the same\n     * size as this matrix.\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 35)",
        "(line 233,col 9)-(line 233,col 50)",
        "(line 234,col 9)-(line 234,col 53)",
        "(line 235,col 9)-(line 235,col 76)",
        "(line 236,col 9)-(line 243,col 9)",
        "(line 245,col 9)-(line 245,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.subtract(org.apache.commons.math3.linear.Array2DRowFieldMatrix\u003cT\u003e)",
      "begin_line": 256,
      "end_line": 275,
      "comment": "\n     * Subtract {@code m} from this matrix.\n     *\n     * @param m Matrix to be subtracted.\n     * @return {@code this} + m.\n     * @throws MatrixDimensionMismatchException if {@code m} is not the same\n     * size as this matrix.\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 38)",
        "(line 261,col 9)-(line 261,col 50)",
        "(line 262,col 9)-(line 262,col 53)",
        "(line 263,col 9)-(line 263,col 76)",
        "(line 264,col 9)-(line 271,col 9)",
        "(line 273,col 9)-(line 273,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.multiply(org.apache.commons.math3.linear.Array2DRowFieldMatrix\u003cT\u003e)",
      "begin_line": 285,
      "end_line": 308,
      "comment": "\n     * Postmultiplying this matrix by {@code m}.\n     *\n     * @param m Matrix to postmultiply by.\n     * @return {@code this} * m.\n     * @throws DimensionMismatchException if the number of columns of this\n     * matrix is not equal to the number of rows of {@code m}.\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 41)",
        "(line 290,col 9)-(line 290,col 49)",
        "(line 291,col 9)-(line 291,col 49)",
        "(line 292,col 9)-(line 292,col 51)",
        "(line 293,col 9)-(line 293,col 67)",
        "(line 294,col 9)-(line 304,col 9)",
        "(line 306,col 9)-(line 306,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.getData()",
      "begin_line": 311,
      "end_line": 314,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.getDataRef()",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\n     * Get a reference to the underlying data array.\n     * This methods returns internal data, \u003cstrong\u003enot\u003c/strong\u003e fresh copy of it.\n     *\n     * @return the 2-dimensional array of entries.\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.setSubMatrix(T[][], int, int)",
      "begin_line": 327,
      "end_line": 359,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 332,col 9)-(line 357,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.getEntry(int, int)",
      "begin_line": 362,
      "end_line": 369,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 27)",
        "(line 366,col 9)-(line 366,col 33)",
        "(line 368,col 9)-(line 368,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.setEntry(int, int, T)",
      "begin_line": 372,
      "end_line": 379,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 27)",
        "(line 376,col 9)-(line 376,col 33)",
        "(line 378,col 9)-(line 378,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.addToEntry(int, int, T)",
      "begin_line": 382,
      "end_line": 389,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 27)",
        "(line 386,col 9)-(line 386,col 33)",
        "(line 388,col 9)-(line 388,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.multiplyEntry(int, int, T)",
      "begin_line": 392,
      "end_line": 399,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 27)",
        "(line 396,col 9)-(line 396,col 33)",
        "(line 398,col 9)-(line 398,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.getRowDimension()",
      "begin_line": 402,
      "end_line": 405,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.getColumnDimension()",
      "begin_line": 408,
      "end_line": 411,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.operate(T[])",
      "begin_line": 414,
      "end_line": 431,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 49)",
        "(line 417,col 9)-(line 417,col 52)",
        "(line 418,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 421,col 54)",
        "(line 422,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 430,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.preMultiply(T[])",
      "begin_line": 434,
      "end_line": 452,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 44)",
        "(line 437,col 9)-(line 437,col 47)",
        "(line 438,col 9)-(line 440,col 9)",
        "(line 442,col 9)-(line 442,col 54)",
        "(line 443,col 9)-(line 449,col 9)",
        "(line 451,col 9)-(line 451,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 455,
      "end_line": 467,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 46)",
        "(line 458,col 9)-(line 458,col 49)",
        "(line 459,col 9)-(line 459,col 66)",
        "(line 460,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 466,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 470,
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
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 485,
      "end_line": 500,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 70)",
        "(line 491,col 9)-(line 492,col 64)",
        "(line 493,col 9)-(line 498,col 9)",
        "(line 499,col 9)-(line 499,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 503,
      "end_line": 518,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 70)",
        "(line 509,col 9)-(line 510,col 64)",
        "(line 511,col 9)-(line 516,col 9)",
        "(line 517,col 9)-(line 517,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 521,
      "end_line": 533,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 523,col 9)-(line 523,col 46)",
        "(line 524,col 9)-(line 524,col 49)",
        "(line 525,col 9)-(line 525,col 66)",
        "(line 526,col 9)-(line 531,col 9)",
        "(line 532,col 9)-(line 532,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 536,
      "end_line": 547,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 46)",
        "(line 539,col 9)-(line 539,col 49)",
        "(line 540,col 9)-(line 540,col 66)",
        "(line 541,col 9)-(line 545,col 9)",
        "(line 546,col 9)-(line 546,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 550,
      "end_line": 565,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 555,col 5)-(line 555,col 66)",
        "(line 556,col 9)-(line 557,col 64)",
        "(line 558,col 9)-(line 563,col 9)",
        "(line 564,col 9)-(line 564,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 568,
      "end_line": 582,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 70)",
        "(line 574,col 9)-(line 575,col 64)",
        "(line 576,col 9)-(line 580,col 9)",
        "(line 581,col 9)-(line 581,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.copyOut()",
      "begin_line": 589,
      "end_line": 597,
      "comment": "\n     * Get a fresh copy of the underlying data array.\n     *\n     * @return a copy of the underlying data array.\n     ",
      "child_ranges": [
        "(line 590,col 9)-(line 590,col 49)",
        "(line 591,col 9)-(line 591,col 78)",
        "(line 593,col 9)-(line 595,col 9)",
        "(line 596,col 9)-(line 596,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.copyIn(T[][])",
      "begin_line": 607,
      "end_line": 611,
      "comment": "\n     * Replace data with a fresh copy of the input array.\n     *\n     * @param in Data to copy.\n     * @throws NoDataException if the input array is empty.\n     * @throws DimensionMismatchException if the input array is not rectangular.\n     * @throws NullArgumentException if the input array is {@code null}.\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 31)"
      ]
    }
  ]
}