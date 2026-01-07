{
  "filepath": "/tmp/Math-23b/src/main/java/org/apache/commons/math3/linear/Array2DRowFieldMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Array2DRowFieldMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.AbstractFieldMatrix\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 42,
      "end_line": 589,
      "comment": "\n * Implementation of FieldMatrix\u003cT\u003e using a {@link FieldElement}[][] array to store entries.\n * \u003cp\u003e\n * As specified in the {@link FieldMatrix} interface, matrix element indexing\n * is 0-based -- e.g., \u003ccode\u003egetEntry(0, 0)\u003c/code\u003e\n * returns the element in the first row, first column of the matrix.\u003c/li\u003e\u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @param \u003cT\u003e the type of the field elements\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Entries of the matrix "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(org.apache.commons.math3.Field\u003cT\u003e)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Creates a matrix with no data\n     * @param field field to which the elements belong\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(org.apache.commons.math3.Field\u003cT\u003e, int, int)",
      "begin_line": 67,
      "end_line": 72,
      "comment": "\n     * Create a new {@code FieldMatrix\u003cT\u003e} with the supplied row and column dimensions.\n     *\n     * @param field Field to which the elements belong.\n     * @param rowDimension Number of rows in the new matrix.\n     * @param columnDimension Number of columns in the new matrix.\n     * @throws org.apache.commons.math3.exception.NotStrictlyPositiveException\n     * if row or column dimension is not positive.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 52)",
        "(line 71,col 9)-(line 71,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(T[][])",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Create a new {@code FieldMatrix\u003cT\u003e} using the input array as the underlying\n     * data array.\n     * \u003cp\u003eThe input array is copied, not referenced. This constructor has\n     * the same effect as calling {@link #Array2DRowFieldMatrix(FieldElement[][], boolean)}\n     * with the second argument set to {@code true}.\u003c/p\u003e\n     *\n     * @param d Data for the new matrix.\n     * @throws DimensionMismatchException if {@code d} is not rectangular.\n     * @throws org.apache.commons.math3.exception.NullArgumentException if\n     * {@code d} is {@code null}.\n     * @throws NoDataException if there are not at least one row and one column.\n     * @see #Array2DRowFieldMatrix(FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(org.apache.commons.math3.Field\u003cT\u003e, T[][])",
      "begin_line": 107,
      "end_line": 110,
      "comment": "\n     * Create a new {@code FieldMatrix\u003cT\u003e} using the input array as the underlying\n     * data array.\n     * \u003cp\u003eThe input array is copied, not referenced. This constructor has\n     * the same effect as calling {@link #Array2DRowFieldMatrix(FieldElement[][], boolean)}\n     * with the second argument set to {@code true}.\u003c/p\u003e\n     *\n     * @param field Field to which the elements belong.\n     * @param d Data for the new matrix.\n     * @throws DimensionMismatchException if {@code d} is not rectangular.\n     * @throws org.apache.commons.math3.exception.NullArgumentException if\n     * {@code d} is {@code null}.\n     * @throws NoDataException if there are not at least one row and one column.\n     * @see #Array2DRowFieldMatrix(FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 21)",
        "(line 109,col 9)-(line 109,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(T[][], boolean)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * Create a new {@code FieldMatrix\u003cT\u003e} using the input array as the underlying\n     * data array.\n     * \u003cp\u003eIf an array is built specially in order to be embedded in a\n     * {@code FieldMatrix\u003cT\u003e} and not used directly, the {@code copyArray} may be\n     * set to {@code false}. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\u003c/p\u003e\n     *\n     * @param d Data for the new matrix.\n     * @param copyArray Whether to copy or reference the input array.\n     * @throws DimensionMismatchException if {@code d} is not rectangular.\n     * @throws NoDataException if there are not at least one row and one column.\n     * @throws org.apache.commons.math3.exception.NullArgumentException\n     * if {@code d} is {@code null}.\n     * @see #Array2DRowFieldMatrix(FieldElement[][])\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(org.apache.commons.math3.Field\u003cT\u003e, T[][], boolean)",
      "begin_line": 148,
      "end_line": 170,
      "comment": "\n     * Create a new {@code FieldMatrix\u003cT\u003e} using the input array as the underlying\n     * data array.\n     * \u003cp\u003eIf an array is built specially in order to be embedded in a\n     * {@code FieldMatrix\u003cT\u003e} and not used directly, the {@code copyArray} may be\n     * set to {@code false}. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\u003c/p\u003e\n     *\n     * @param field Field to which the elements belong.\n     * @param d Data for the new matrix.\n     * @param copyArray Whether to copy or reference the input array.\n     * @throws DimensionMismatchException if {@code d} is not rectangular.\n     * @throws NoDataException if there are not at least one row and one column.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @see #Array2DRowFieldMatrix(FieldElement[][])\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 21)",
        "(line 151,col 9)-(line 169,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(T[])",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\n     * Create a new (column) {@code FieldMatrix\u003cT\u003e} using {@code v} as the\n     * data for the unique column of the created matrix.\n     * The input array is copied.\n     *\n     * @param v Column vector holding data for new matrix.\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(org.apache.commons.math3.Field\u003cT\u003e, T[])",
      "begin_line": 191,
      "end_line": 198,
      "comment": "\n     * Create a new (column) {@code FieldMatrix\u003cT\u003e} using {@code v} as the\n     * data for the unique column of the created matrix.\n     * The input array is copied.\n     *\n     * @param field Field to which the elements belong.\n     * @param v Column vector holding data for new matrix.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 21)",
        "(line 193,col 9)-(line 193,col 35)",
        "(line 194,col 9)-(line 194,col 48)",
        "(line 195,col 9)-(line 197,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.createMatrix(int, int)",
      "begin_line": 201,
      "end_line": 204,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.copy()",
      "begin_line": 207,
      "end_line": 210,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.add(org.apache.commons.math3.linear.Array2DRowFieldMatrix\u003cT\u003e)",
      "begin_line": 220,
      "end_line": 237,
      "comment": "\n     * Add {@code m} to this matrix.\n     *\n     * @param m Matrix to be added.\n     * @return {@code this} + m.\n     * @throws MatrixDimensionMismatchException\n     * if {@code m} is not the same size as this matrix.\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 35)",
        "(line 224,col 9)-(line 224,col 50)",
        "(line 225,col 9)-(line 225,col 53)",
        "(line 226,col 9)-(line 226,col 76)",
        "(line 227,col 9)-(line 234,col 9)",
        "(line 236,col 9)-(line 236,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.subtract(org.apache.commons.math3.linear.Array2DRowFieldMatrix\u003cT\u003e)",
      "begin_line": 247,
      "end_line": 265,
      "comment": "\n     * Subtract {@code m} from this matrix.\n     *\n     * @param m Matrix to be subtracted.\n     * @return {@code this} + m.\n     * @throws MatrixDimensionMismatchException\n     * if {@code m} is not the same size as this matrix.\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 38)",
        "(line 251,col 9)-(line 251,col 50)",
        "(line 252,col 9)-(line 252,col 53)",
        "(line 253,col 9)-(line 253,col 76)",
        "(line 254,col 9)-(line 261,col 9)",
        "(line 263,col 9)-(line 263,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.multiply(org.apache.commons.math3.linear.Array2DRowFieldMatrix\u003cT\u003e)",
      "begin_line": 275,
      "end_line": 297,
      "comment": "\n     * Postmultiplying this matrix by {@code m}.\n     *\n     * @param m Matrix to postmultiply by.\n     * @return {@code this} * m.\n     * @throws DimensionMismatchException if the number of columns of this\n     * matrix is not equal to the number of rows of {@code m}.\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 41)",
        "(line 279,col 9)-(line 279,col 49)",
        "(line 280,col 9)-(line 280,col 49)",
        "(line 281,col 9)-(line 281,col 51)",
        "(line 282,col 9)-(line 282,col 67)",
        "(line 283,col 9)-(line 293,col 9)",
        "(line 295,col 9)-(line 295,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.getData()",
      "begin_line": 300,
      "end_line": 303,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.getDataRef()",
      "begin_line": 311,
      "end_line": 313,
      "comment": "\n     * Get a reference to the underlying data array.\n     * This methods returns internal data, \u003cstrong\u003enot\u003c/strong\u003e fresh copy of it.\n     *\n     * @return the 2-dimensional array of entries.\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.setSubMatrix(T[][], int, int)",
      "begin_line": 316,
      "end_line": 345,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 318,col 9)-(line 343,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.getEntry(int, int)",
      "begin_line": 348,
      "end_line": 354,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 27)",
        "(line 351,col 9)-(line 351,col 33)",
        "(line 353,col 9)-(line 353,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.setEntry(int, int, T)",
      "begin_line": 357,
      "end_line": 363,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 27)",
        "(line 360,col 9)-(line 360,col 33)",
        "(line 362,col 9)-(line 362,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.addToEntry(int, int, T)",
      "begin_line": 366,
      "end_line": 372,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 27)",
        "(line 369,col 9)-(line 369,col 33)",
        "(line 371,col 9)-(line 371,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.multiplyEntry(int, int, T)",
      "begin_line": 375,
      "end_line": 381,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 27)",
        "(line 378,col 9)-(line 378,col 33)",
        "(line 380,col 9)-(line 380,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.getRowDimension()",
      "begin_line": 384,
      "end_line": 387,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.getColumnDimension()",
      "begin_line": 390,
      "end_line": 393,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.operate(T[])",
      "begin_line": 396,
      "end_line": 413,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 49)",
        "(line 399,col 9)-(line 399,col 52)",
        "(line 400,col 9)-(line 402,col 9)",
        "(line 403,col 9)-(line 403,col 54)",
        "(line 404,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 412,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.preMultiply(T[])",
      "begin_line": 416,
      "end_line": 434,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 44)",
        "(line 419,col 9)-(line 419,col 47)",
        "(line 420,col 9)-(line 422,col 9)",
        "(line 424,col 9)-(line 424,col 54)",
        "(line 425,col 9)-(line 431,col 9)",
        "(line 433,col 9)-(line 433,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 437,
      "end_line": 449,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 46)",
        "(line 440,col 9)-(line 440,col 49)",
        "(line 441,col 9)-(line 441,col 66)",
        "(line 442,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 448,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 452,
      "end_line": 464,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 46)",
        "(line 455,col 9)-(line 455,col 49)",
        "(line 456,col 9)-(line 456,col 66)",
        "(line 457,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 463,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 467,
      "end_line": 481,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 70)",
        "(line 472,col 9)-(line 473,col 64)",
        "(line 474,col 9)-(line 479,col 9)",
        "(line 480,col 9)-(line 480,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 484,
      "end_line": 498,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 70)",
        "(line 489,col 9)-(line 490,col 64)",
        "(line 491,col 9)-(line 496,col 9)",
        "(line 497,col 9)-(line 497,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 501,
      "end_line": 513,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 46)",
        "(line 504,col 9)-(line 504,col 49)",
        "(line 505,col 9)-(line 505,col 66)",
        "(line 506,col 9)-(line 511,col 9)",
        "(line 512,col 9)-(line 512,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 516,
      "end_line": 527,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 46)",
        "(line 519,col 9)-(line 519,col 49)",
        "(line 520,col 9)-(line 520,col 66)",
        "(line 521,col 9)-(line 525,col 9)",
        "(line 526,col 9)-(line 526,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 530,
      "end_line": 544,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 70)",
        "(line 535,col 9)-(line 536,col 64)",
        "(line 537,col 9)-(line 542,col 9)",
        "(line 543,col 9)-(line 543,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 547,
      "end_line": 560,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 551,col 9)-(line 551,col 70)",
        "(line 552,col 9)-(line 553,col 64)",
        "(line 554,col 9)-(line 558,col 9)",
        "(line 559,col 9)-(line 559,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.copyOut()",
      "begin_line": 567,
      "end_line": 575,
      "comment": "\n     * Get a fresh copy of the underlying data array.\n     *\n     * @return a copy of the underlying data array.\n     ",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 49)",
        "(line 569,col 9)-(line 569,col 78)",
        "(line 571,col 9)-(line 573,col 9)",
        "(line 574,col 9)-(line 574,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.copyIn(T[][])",
      "begin_line": 586,
      "end_line": 588,
      "comment": "\n     * Replace data with a fresh copy of the input array.\n     *\n     * @param in Data to copy.\n     * @throws NoDataException if the input array is empty.\n     * @throws DimensionMismatchException if the input array is not rectangular.\n     * @throws org.apache.commons.math3.exception.NullArgumentException if\n     * the input array is {@code null}.\n     ",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 31)"
      ]
    }
  ]
}