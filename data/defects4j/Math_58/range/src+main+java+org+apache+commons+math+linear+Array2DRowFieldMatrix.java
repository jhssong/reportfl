{
  "filepath": "/tmp/Math-58b/src/main/java/org/apache/commons/math/linear/Array2DRowFieldMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Array2DRowFieldMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.AbstractFieldMatrix\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 40,
      "end_line": 537,
      "comment": "\n * Implementation of FieldMatrix\u003cT\u003e using a {@link FieldElement}[][] array to store entries.\n * \u003cp\u003e\n * As specified in the {@link FieldMatrix} interface, matrix element indexing\n * is 0-based -- e.g., \u003ccode\u003egetEntry(0, 0)\u003c/code\u003e\n * returns the element in the first row, first column of the matrix.\u003c/li\u003e\u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @param \u003cT\u003e the type of the field elements\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Entries of the matrix "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(org.apache.commons.math.Field\u003cT\u003e)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Creates a matrix with no data\n     * @param field field to which the elements belong\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 65,
      "end_line": 70,
      "comment": "\n     * Create a new {@code FieldMatrix\u003cT\u003e} with the supplied row and column dimensions.\n     *\n     * @param field Field to which the elements belong.\n     * @param rowDimension Number of rows in the new matrix.\n     * @param columnDimension Number of columns in the new matrix.\n     * @throws org.apache.commons.math.exception.NotStrictlyPositiveException\n     * if row or column dimension is not positive.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 52)",
        "(line 69,col 9)-(line 69,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(T[][])",
      "begin_line": 86,
      "end_line": 89,
      "comment": "\n     * Create a new {@code FieldMatrix\u003cT\u003e} using the input array as the underlying\n     * data array.\n     * \u003cp\u003eThe input array is copied, not referenced. This constructor has\n     * the same effect as calling {@link #Array2DRowFieldMatrix(FieldElement[][], boolean)}\n     * with the second argument set to {@code true}.\u003c/p\u003e\n     *\n     * @param d Data for the new matrix.\n     * @throws DimensionMismatchException if {@code d} is not rectangular.\n     * @throws org.apache.commons.math.exception.NullArgumentException if\n     * {@code d} is {@code null}.\n     * @throws NoDataException if there are not at least one row and one column.\n     * @see #Array2DRowFieldMatrix(FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 31)",
        "(line 88,col 9)-(line 88,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(T[][], boolean)",
      "begin_line": 107,
      "end_line": 130,
      "comment": "\n     * Create a new {@code FieldMatrix\u003cT\u003e} using the input array as the underlying\n     * data array.\n     * \u003cp\u003eIf an array is built specially in order to be embedded in a\n     * {@code FieldMatrix\u003cT\u003e} and not used directly, the {@code copyArray} may be\n     * set to {@code false}. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\u003c/p\u003e\n     *\n     * @param d Data for the new matrix.\n     * @param copyArray Whether to copy or reference the input array.\n     * @throws DimensionMismatchException if {@code d} is not rectangular.\n     * @throws NoDataException if there are not at least one row and one column.\n     * @throws org.apache.commons.math.exception.NullArgumentException\n     * if {@code d} is {@code null}.\n     * @see #Array2DRowFieldMatrix(FieldElement[][])\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 31)",
        "(line 109,col 9)-(line 129,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.Array2DRowFieldMatrix(T[])",
      "begin_line": 139,
      "end_line": 146,
      "comment": "\n     * Create a new (column) {@code FieldMatrix\u003cT\u003e} using {@code v} as the\n     * data for the unique column of the created matrix.\n     * The input array is copied.\n     *\n     * @param v Column vector holding data for new matrix.\n     ",
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
      "end_line": 152,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.copy()",
      "begin_line": 155,
      "end_line": 158,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.add(org.apache.commons.math.linear.Array2DRowFieldMatrix\u003cT\u003e)",
      "begin_line": 168,
      "end_line": 185,
      "comment": "\n     * Add {@code m} to this matrix.\n     *\n     * @param m Matrix to be added.\n     * @return {@code this} + m.\n     * @throws org.apache.commons.math.exception.MatrixDimensionMismatchException\n     * if {@code m} is not the same size as this matrix.\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 35)",
        "(line 172,col 9)-(line 172,col 50)",
        "(line 173,col 9)-(line 173,col 53)",
        "(line 174,col 9)-(line 174,col 76)",
        "(line 175,col 9)-(line 182,col 9)",
        "(line 184,col 9)-(line 184,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.subtract(org.apache.commons.math.linear.Array2DRowFieldMatrix\u003cT\u003e)",
      "begin_line": 195,
      "end_line": 213,
      "comment": "\n     * Subtract {@code m} from this matrix.\n     *\n     * @param m Matrix to be subtracted.\n     * @return {@code this} + m.\n     * @throws org.apache.commons.math.exception.MatrixDimensionMismatchException\n     * if {@code m} is not the same size as this matrix.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 38)",
        "(line 199,col 9)-(line 199,col 50)",
        "(line 200,col 9)-(line 200,col 53)",
        "(line 201,col 9)-(line 201,col 76)",
        "(line 202,col 9)-(line 209,col 9)",
        "(line 211,col 9)-(line 211,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.multiply(org.apache.commons.math.linear.Array2DRowFieldMatrix\u003cT\u003e)",
      "begin_line": 223,
      "end_line": 245,
      "comment": "\n     * Postmultiplying this matrix by {@code m}.\n     *\n     * @param m Matrix to postmultiply by.\n     * @return {@code this} * m.\n     * @throws DimensionMismatchException if the number of columns of this\n     * matrix is not equal to the number of rows of {@code m}.\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 41)",
        "(line 227,col 9)-(line 227,col 49)",
        "(line 228,col 9)-(line 228,col 49)",
        "(line 229,col 9)-(line 229,col 51)",
        "(line 230,col 9)-(line 230,col 67)",
        "(line 231,col 9)-(line 241,col 9)",
        "(line 243,col 9)-(line 243,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.getData()",
      "begin_line": 248,
      "end_line": 251,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.getDataRef()",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\n     * Get a reference to the underlying data array.\n     * This methods returns internal data, \u003cstrong\u003enot\u003c/strong\u003e fresh copy of it.\n     *\n     * @return the 2-dimensional array of entries.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.setSubMatrix(T[][], int, int)",
      "begin_line": 264,
      "end_line": 293,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 266,col 9)-(line 291,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.getEntry(int, int)",
      "begin_line": 296,
      "end_line": 302,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 27)",
        "(line 299,col 9)-(line 299,col 33)",
        "(line 301,col 9)-(line 301,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.setEntry(int, int, T)",
      "begin_line": 305,
      "end_line": 311,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 27)",
        "(line 308,col 9)-(line 308,col 33)",
        "(line 310,col 9)-(line 310,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.addToEntry(int, int, T)",
      "begin_line": 314,
      "end_line": 320,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 27)",
        "(line 317,col 9)-(line 317,col 33)",
        "(line 319,col 9)-(line 319,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.multiplyEntry(int, int, T)",
      "begin_line": 323,
      "end_line": 329,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 27)",
        "(line 326,col 9)-(line 326,col 33)",
        "(line 328,col 9)-(line 328,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.getRowDimension()",
      "begin_line": 332,
      "end_line": 335,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.getColumnDimension()",
      "begin_line": 338,
      "end_line": 341,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.operate(T[])",
      "begin_line": 344,
      "end_line": 361,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 49)",
        "(line 347,col 9)-(line 347,col 52)",
        "(line 348,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 351,col 54)",
        "(line 352,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 360,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.preMultiply(T[])",
      "begin_line": 364,
      "end_line": 382,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 44)",
        "(line 367,col 9)-(line 367,col 47)",
        "(line 368,col 9)-(line 370,col 9)",
        "(line 372,col 9)-(line 372,col 54)",
        "(line 373,col 9)-(line 379,col 9)",
        "(line 381,col 9)-(line 381,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 385,
      "end_line": 397,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 46)",
        "(line 388,col 9)-(line 388,col 49)",
        "(line 389,col 9)-(line 389,col 66)",
        "(line 390,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 396,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 400,
      "end_line": 412,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 46)",
        "(line 403,col 9)-(line 403,col 49)",
        "(line 404,col 9)-(line 404,col 66)",
        "(line 405,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 411,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 415,
      "end_line": 429,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 70)",
        "(line 420,col 9)-(line 421,col 64)",
        "(line 422,col 9)-(line 427,col 9)",
        "(line 428,col 9)-(line 428,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 432,
      "end_line": 446,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 70)",
        "(line 437,col 9)-(line 438,col 64)",
        "(line 439,col 9)-(line 444,col 9)",
        "(line 445,col 9)-(line 445,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 449,
      "end_line": 461,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 46)",
        "(line 452,col 9)-(line 452,col 49)",
        "(line 453,col 9)-(line 453,col 66)",
        "(line 454,col 9)-(line 459,col 9)",
        "(line 460,col 9)-(line 460,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 464,
      "end_line": 475,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 46)",
        "(line 467,col 9)-(line 467,col 49)",
        "(line 468,col 9)-(line 468,col 66)",
        "(line 469,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 474,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 478,
      "end_line": 492,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 70)",
        "(line 483,col 9)-(line 484,col 64)",
        "(line 485,col 9)-(line 490,col 9)",
        "(line 491,col 9)-(line 491,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 495,
      "end_line": 508,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 70)",
        "(line 500,col 9)-(line 501,col 64)",
        "(line 502,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 507,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.copyOut()",
      "begin_line": 515,
      "end_line": 523,
      "comment": "\n     * Get a fresh copy of the underlying data array.\n     *\n     * @return a copy of the underlying data array.\n     ",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 49)",
        "(line 517,col 9)-(line 517,col 78)",
        "(line 519,col 9)-(line 521,col 9)",
        "(line 522,col 9)-(line 522,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.Array2DRowFieldMatrix.copyIn(T[][])",
      "begin_line": 534,
      "end_line": 536,
      "comment": "\n     * Replace data with a fresh copy of the input array.\n     *\n     * @param in Data to copy.\n     * @throws NoDataException if the input array is empty.\n     * @throws DimensionMismatchException if the input array is not rectangular.\n     * @throws org.apache.commons.math.exception.NullArgumentException if\n     * the input array is {@code null}.\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 31)"
      ]
    }
  ]
}