{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/Array2DRowFieldMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Array2DRowFieldMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.AbstractFieldMatrix\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 46,
      "end_line": 613,
      "comment": "\n * Implementation of FieldMatrix\u003cT\u003e using a {@link FieldElement}[][] array to store entries.\n * \u003cp\u003e\n * As specified in the {@link FieldMatrix} interface, matrix element indexing\n * is 0-based -- e.g., \u003ccode\u003egetEntry(0, 0)\u003c/code\u003e\n * returns the element in the first row, first column of the matrix.\u003c/li\u003e\u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @param \u003cT\u003e the type of the field elements\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Entries of the matrix "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(org.apache.commons.math3.Field\u003cT\u003e)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Creates a matrix with no data\n     * @param field field to which the elements belong\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(org.apache.commons.math3.Field\u003cT\u003e, int, int)",
      "begin_line": 70,
      "end_line": 75,
      "comment": "\n     * Create a new {@code FieldMatrix\u003cT\u003e} with the supplied row and column dimensions.\n     *\n     * @param field Field to which the elements belong.\n     * @param rowDimension Number of rows in the new matrix.\n     * @param columnDimension Number of columns in the new matrix.\n     * @throws NotStrictlyPositiveException if row or column dimension is not positive.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 52)",
        "(line 74,col 9)-(line 74,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(T[][])",
      "begin_line": 90,
      "end_line": 94,
      "comment": "\n     * Create a new {@code FieldMatrix\u003cT\u003e} using the input array as the underlying\n     * data array.\n     * \u003cp\u003eThe input array is copied, not referenced. This constructor has\n     * the same effect as calling {@link #Array2DRowFieldMatrix(FieldElement[][], boolean)}\n     * with the second argument set to {@code true}.\u003c/p\u003e\n     *\n     * @param d Data for the new matrix.\n     * @throws DimensionMismatchException if {@code d} is not rectangular.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws NoDataException if there are not at least one row and one column.\n     * @see #Array2DRowFieldMatrix(FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(org.apache.commons.math3.Field\u003cT\u003e, T[][])",
      "begin_line": 110,
      "end_line": 115,
      "comment": "\n     * Create a new {@code FieldMatrix\u003cT\u003e} using the input array as the underlying\n     * data array.\n     * \u003cp\u003eThe input array is copied, not referenced. This constructor has\n     * the same effect as calling {@link #Array2DRowFieldMatrix(FieldElement[][], boolean)}\n     * with the second argument set to {@code true}.\u003c/p\u003e\n     *\n     * @param field Field to which the elements belong.\n     * @param d Data for the new matrix.\n     * @throws DimensionMismatchException if {@code d} is not rectangular.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws NoDataException if there are not at least one row and one column.\n     * @see #Array2DRowFieldMatrix(FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 21)",
        "(line 114,col 9)-(line 114,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(T[][], boolean)",
      "begin_line": 132,
      "end_line": 136,
      "comment": "\n     * Create a new {@code FieldMatrix\u003cT\u003e} using the input array as the underlying\n     * data array.\n     * \u003cp\u003eIf an array is built specially in order to be embedded in a\n     * {@code FieldMatrix\u003cT\u003e} and not used directly, the {@code copyArray} may be\n     * set to {@code false}. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\u003c/p\u003e\n     *\n     * @param d Data for the new matrix.\n     * @param copyArray Whether to copy or reference the input array.\n     * @throws DimensionMismatchException if {@code d} is not rectangular.\n     * @throws NoDataException if there are not at least one row and one column.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @see #Array2DRowFieldMatrix(FieldElement[][])\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(org.apache.commons.math3.Field\u003cT\u003e, T[][], boolean)",
      "begin_line": 154,
      "end_line": 176,
      "comment": "\n     * Create a new {@code FieldMatrix\u003cT\u003e} using the input array as the underlying\n     * data array.\n     * \u003cp\u003eIf an array is built specially in order to be embedded in a\n     * {@code FieldMatrix\u003cT\u003e} and not used directly, the {@code copyArray} may be\n     * set to {@code false}. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\u003c/p\u003e\n     *\n     * @param field Field to which the elements belong.\n     * @param d Data for the new matrix.\n     * @param copyArray Whether to copy or reference the input array.\n     * @throws DimensionMismatchException if {@code d} is not rectangular.\n     * @throws NoDataException if there are not at least one row and one column.\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @see #Array2DRowFieldMatrix(FieldElement[][])\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 21)",
        "(line 157,col 9)-(line 175,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(T[])",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\n     * Create a new (column) {@code FieldMatrix\u003cT\u003e} using {@code v} as the\n     * data for the unique column of the created matrix.\n     * The input array is copied.\n     *\n     * @param v Column vector holding data for new matrix.\n     * @throws NoDataException if v is empty\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(org.apache.commons.math3.Field\u003cT\u003e, T[])",
      "begin_line": 198,
      "end_line": 205,
      "comment": "\n     * Create a new (column) {@code FieldMatrix\u003cT\u003e} using {@code v} as the\n     * data for the unique column of the created matrix.\n     * The input array is copied.\n     *\n     * @param field Field to which the elements belong.\n     * @param v Column vector holding data for new matrix.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 21)",
        "(line 200,col 9)-(line 200,col 35)",
        "(line 201,col 9)-(line 201,col 59)",
        "(line 202,col 9)-(line 204,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.createMatrix(int, int)",
      "begin_line": 208,
      "end_line": 213,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.copy()",
      "begin_line": 216,
      "end_line": 219,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.add(org.apache.commons.math3.linear.Array2DRowFieldMatrix\u003cT\u003e)",
      "begin_line": 229,
      "end_line": 247,
      "comment": "\n     * Add {@code m} to this matrix.\n     *\n     * @param m Matrix to be added.\n     * @return {@code this} + m.\n     * @throws MatrixDimensionMismatchException if {@code m} is not the same\n     * size as this matrix.\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 35)",
        "(line 234,col 9)-(line 234,col 50)",
        "(line 235,col 9)-(line 235,col 53)",
        "(line 236,col 9)-(line 236,col 87)",
        "(line 237,col 9)-(line 244,col 9)",
        "(line 246,col 9)-(line 246,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.subtract(org.apache.commons.math3.linear.Array2DRowFieldMatrix\u003cT\u003e)",
      "begin_line": 257,
      "end_line": 276,
      "comment": "\n     * Subtract {@code m} from this matrix.\n     *\n     * @param m Matrix to be subtracted.\n     * @return {@code this} + m.\n     * @throws MatrixDimensionMismatchException if {@code m} is not the same\n     * size as this matrix.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 38)",
        "(line 262,col 9)-(line 262,col 50)",
        "(line 263,col 9)-(line 263,col 53)",
        "(line 264,col 9)-(line 264,col 87)",
        "(line 265,col 9)-(line 272,col 9)",
        "(line 274,col 9)-(line 274,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.multiply(org.apache.commons.math3.linear.Array2DRowFieldMatrix\u003cT\u003e)",
      "begin_line": 286,
      "end_line": 309,
      "comment": "\n     * Postmultiplying this matrix by {@code m}.\n     *\n     * @param m Matrix to postmultiply by.\n     * @return {@code this} * m.\n     * @throws DimensionMismatchException if the number of columns of this\n     * matrix is not equal to the number of rows of {@code m}.\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 41)",
        "(line 291,col 9)-(line 291,col 49)",
        "(line 292,col 9)-(line 292,col 49)",
        "(line 293,col 9)-(line 293,col 51)",
        "(line 294,col 9)-(line 294,col 78)",
        "(line 295,col 9)-(line 305,col 9)",
        "(line 307,col 9)-(line 307,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.getData()",
      "begin_line": 312,
      "end_line": 315,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.getDataRef()",
      "begin_line": 323,
      "end_line": 325,
      "comment": "\n     * Get a reference to the underlying data array.\n     * This methods returns internal data, \u003cstrong\u003enot\u003c/strong\u003e fresh copy of it.\n     *\n     * @return the 2-dimensional array of entries.\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.setSubMatrix(T[][], int, int)",
      "begin_line": 328,
      "end_line": 360,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 333,col 9)-(line 358,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.getEntry(int, int)",
      "begin_line": 363,
      "end_line": 370,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 27)",
        "(line 367,col 9)-(line 367,col 33)",
        "(line 369,col 9)-(line 369,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.setEntry(int, int, T)",
      "begin_line": 373,
      "end_line": 380,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 27)",
        "(line 377,col 9)-(line 377,col 33)",
        "(line 379,col 9)-(line 379,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.addToEntry(int, int, T)",
      "begin_line": 383,
      "end_line": 390,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 27)",
        "(line 387,col 9)-(line 387,col 33)",
        "(line 389,col 9)-(line 389,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.multiplyEntry(int, int, T)",
      "begin_line": 393,
      "end_line": 400,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 27)",
        "(line 397,col 9)-(line 397,col 33)",
        "(line 399,col 9)-(line 399,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.getRowDimension()",
      "begin_line": 403,
      "end_line": 406,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.getColumnDimension()",
      "begin_line": 409,
      "end_line": 412,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.operate(T[])",
      "begin_line": 415,
      "end_line": 432,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 49)",
        "(line 418,col 9)-(line 418,col 52)",
        "(line 419,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 422,col 65)",
        "(line 423,col 9)-(line 430,col 9)",
        "(line 431,col 9)-(line 431,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.preMultiply(T[])",
      "begin_line": 435,
      "end_line": 453,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 44)",
        "(line 438,col 9)-(line 438,col 47)",
        "(line 439,col 9)-(line 441,col 9)",
        "(line 443,col 9)-(line 443,col 65)",
        "(line 444,col 9)-(line 450,col 9)",
        "(line 452,col 9)-(line 452,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 456,
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
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 471,
      "end_line": 483,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 46)",
        "(line 474,col 9)-(line 474,col 49)",
        "(line 475,col 9)-(line 475,col 66)",
        "(line 476,col 9)-(line 481,col 9)",
        "(line 482,col 9)-(line 482,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 486,
      "end_line": 501,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 70)",
        "(line 492,col 9)-(line 493,col 64)",
        "(line 494,col 9)-(line 499,col 9)",
        "(line 500,col 9)-(line 500,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 504,
      "end_line": 519,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 70)",
        "(line 510,col 9)-(line 511,col 64)",
        "(line 512,col 9)-(line 517,col 9)",
        "(line 518,col 9)-(line 518,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 522,
      "end_line": 534,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 46)",
        "(line 525,col 9)-(line 525,col 49)",
        "(line 526,col 9)-(line 526,col 66)",
        "(line 527,col 9)-(line 532,col 9)",
        "(line 533,col 9)-(line 533,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 537,
      "end_line": 548,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 46)",
        "(line 540,col 9)-(line 540,col 49)",
        "(line 541,col 9)-(line 541,col 66)",
        "(line 542,col 9)-(line 546,col 9)",
        "(line 547,col 9)-(line 547,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 551,
      "end_line": 566,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 556,col 5)-(line 556,col 66)",
        "(line 557,col 9)-(line 558,col 64)",
        "(line 559,col 9)-(line 564,col 9)",
        "(line 565,col 9)-(line 565,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 569,
      "end_line": 583,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 70)",
        "(line 575,col 9)-(line 576,col 64)",
        "(line 577,col 9)-(line 581,col 9)",
        "(line 582,col 9)-(line 582,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.copyOut()",
      "begin_line": 590,
      "end_line": 598,
      "comment": "\n     * Get a fresh copy of the underlying data array.\n     *\n     * @return a copy of the underlying data array.\n     ",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 49)",
        "(line 592,col 9)-(line 592,col 89)",
        "(line 594,col 9)-(line 596,col 9)",
        "(line 597,col 9)-(line 597,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.Array2DRowFieldMatrix.copyIn(T[][])",
      "begin_line": 608,
      "end_line": 612,
      "comment": "\n     * Replace data with a fresh copy of the input array.\n     *\n     * @param in Data to copy.\n     * @throws NoDataException if the input array is empty.\n     * @throws DimensionMismatchException if the input array is not rectangular.\n     * @throws NullArgumentException if the input array is {@code null}.\n     ",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 31)"
      ]
    }
  ]
}