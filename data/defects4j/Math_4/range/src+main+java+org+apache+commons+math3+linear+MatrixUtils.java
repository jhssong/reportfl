{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/MatrixUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MatrixUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 1066,
      "comment": "\n * A collection of static methods that operate on or return matrices.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FORMAT"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * The default format for {@link RealMatrix} objects.\n     * @since 3.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "OCTAVE_FORMAT"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * A format for {@link RealMatrix} objects compatible with octave.\n     * @since 3.1\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.MatrixUtils()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Private constructor.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(int, int)",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\n     * Returns a {@link RealMatrix} with specified dimensions.\n     * \u003cp\u003eThe type of matrix returned depends on the dimension. Below\n     * 2\u003csup\u003e12\u003c/sup\u003e elements (i.e. 4096 elements or 64\u0026times;64 for a\n     * square matrix) which can be stored in a 32kB array, a {@link\n     * Array2DRowRealMatrix} instance is built. Above this threshold a {@link\n     * BlockRealMatrix} instance is built.\u003c/p\u003e\n     * \u003cp\u003eThe matrix elements are all set to 0.0.\u003c/p\u003e\n     * @param rows number of rows of the matrix\n     * @param columns number of columns of the matrix\n     * @return  RealMatrix with specified dimensions\n     * @see #createRealMatrix(double[][])\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 82,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createFieldMatrix(org.apache.commons.math3.Field\u003cT\u003e, int, int)",
      "begin_line": 100,
      "end_line": 105,
      "comment": "\n     * Returns a {@link FieldMatrix} with specified dimensions.\n     * \u003cp\u003eThe type of matrix returned depends on the dimension. Below\n     * 2\u003csup\u003e12\u003c/sup\u003e elements (i.e. 4096 elements or 64\u0026times;64 for a\n     * square matrix), a {@link FieldMatrix} instance is built. Above\n     * this threshold a {@link BlockFieldMatrix} instance is built.\u003c/p\u003e\n     * \u003cp\u003eThe matrix elements are all set to field.getZero().\u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param field field to which the matrix elements belong\n     * @param rows number of rows of the matrix\n     * @param columns number of columns of the matrix\n     * @return  FieldMatrix with specified dimensions\n     * @see #createFieldMatrix(FieldElement[][])\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 104,col 115)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(double[][])",
      "begin_line": 127,
      "end_line": 136,
      "comment": "\n     * Returns a {@link RealMatrix} whose entries are the the values in the\n     * the input array.\n     * \u003cp\u003eThe type of matrix returned depends on the dimension. Below\n     * 2\u003csup\u003e12\u003c/sup\u003e elements (i.e. 4096 elements or 64\u0026times;64 for a\n     * square matrix) which can be stored in a 32kB array, a {@link\n     * Array2DRowRealMatrix} instance is built. Above this threshold a {@link\n     * BlockRealMatrix} instance is built.\u003c/p\u003e\n     * \u003cp\u003eThe input array is copied, not referenced.\u003c/p\u003e\n     *\n     * @param data input array\n     * @return  RealMatrix containing the values of the array\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code data} is not rectangular (not all rows have the same length).\n     * @throws NoDataException if a row or column is empty.\n     * @throws NullArgumentException if either {@code data} or {@code data[0]}\n     * is {@code null}.\n     * @throws DimensionMismatchException if {@code data} is not rectangular.\n     * @see #createRealMatrix(int, int)\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 135,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createFieldMatrix(T[][])",
      "begin_line": 157,
      "end_line": 165,
      "comment": "\n     * Returns a {@link FieldMatrix} whose entries are the the values in the\n     * the input array.\n     * \u003cp\u003eThe type of matrix returned depends on the dimension. Below\n     * 2\u003csup\u003e12\u003c/sup\u003e elements (i.e. 4096 elements or 64\u0026times;64 for a\n     * square matrix), a {@link FieldMatrix} instance is built. Above\n     * this threshold a {@link BlockFieldMatrix} instance is built.\u003c/p\u003e\n     * \u003cp\u003eThe input array is copied, not referenced.\u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param data input array\n     * @return a matrix containing the values of the array.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code data} is not rectangular (not all rows have the same length).\n     * @throws NoDataException if a row or column is empty.\n     * @throws NullArgumentException if either {@code data} or {@code data[0]}\n     * is {@code null}.\n     * @see #createFieldMatrix(Field, int, int)\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 164,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createRealIdentityMatrix(int)",
      "begin_line": 175,
      "end_line": 181,
      "comment": "\n     * Returns \u003ccode\u003edimension x dimension\u003c/code\u003e identity matrix.\n     *\n     * @param dimension dimension of identity matrix to generate\n     * @return identity matrix\n     * @throws IllegalArgumentException if dimension is not positive\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 68)",
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createFieldIdentityMatrix(org.apache.commons.math3.Field\u003cT\u003e, int)",
      "begin_line": 193,
      "end_line": 204,
      "comment": "\n     * Returns \u003ccode\u003edimension x dimension\u003c/code\u003e identity matrix.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param field field to which the elements belong\n     * @param dimension dimension of identity matrix to generate\n     * @return identity matrix\n     * @throws IllegalArgumentException if dimension is not positive\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 39)",
        "(line 196,col 9)-(line 196,col 38)",
        "(line 197,col 9)-(line 197,col 75)",
        "(line 198,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 203,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createRealDiagonalMatrix(double[])",
      "begin_line": 214,
      "end_line": 220,
      "comment": "\n     * Returns a diagonal matrix with specified elements.\n     *\n     * @param diagonal diagonal elements of the matrix (the array elements\n     * will be copied)\n     * @return diagonal matrix\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 80)",
        "(line 216,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 219,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createFieldDiagonalMatrix(T[])",
      "begin_line": 231,
      "end_line": 239,
      "comment": "\n     * Returns a diagonal matrix with specified elements.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param diagonal diagonal elements of the matrix (the array elements\n     * will be copied)\n     * @return diagonal matrix\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 234,col 88)",
        "(line 235,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createRealVector(double[])",
      "begin_line": 249,
      "end_line": 255,
      "comment": "\n     * Creates a {@link RealVector} using the data from the input array.\n     *\n     * @param data the input data\n     * @return a data.length RealVector\n     * @throws NoDataException if {@code data} is empty.\n     * @throws NullArgumentException if {@code data} is {@code null}.\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 254,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createFieldVector(T[])",
      "begin_line": 267,
      "end_line": 276,
      "comment": "\n     * Creates a {@link FieldVector} using the data from the input array.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param data the input data\n     * @return a data.length FieldVector\n     * @throws NoDataException if {@code data} is empty.\n     * @throws NullArgumentException if {@code data} is {@code null}.\n     * @throws ZeroException if {@code data} has 0 elements\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createRowRealMatrix(double[])",
      "begin_line": 287,
      "end_line": 298,
      "comment": "\n     * Create a row {@link RealMatrix} using the data from the input\n     * array.\n     *\n     * @param rowData the input row data\n     * @return a 1 x rowData.length RealMatrix\n     * @throws NoDataException if {@code rowData} is empty.\n     * @throws NullArgumentException if {@code rowData} is {@code null}.\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 292,col 41)",
        "(line 293,col 9)-(line 293,col 56)",
        "(line 294,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 297,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createRowFieldMatrix(T[])",
      "begin_line": 310,
      "end_line": 325,
      "comment": "\n     * Create a row {@link FieldMatrix} using the data from the input\n     * array.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param rowData the input row data\n     * @return a 1 x rowData.length FieldMatrix\n     * @throws NoDataException if {@code rowData} is empty.\n     * @throws NullArgumentException if {@code rowData} is {@code null}.\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 41)",
        "(line 317,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 320,col 84)",
        "(line 321,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 324,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createColumnRealMatrix(double[])",
      "begin_line": 336,
      "end_line": 347,
      "comment": "\n     * Creates a column {@link RealMatrix} using the data from the input\n     * array.\n     *\n     * @param columnData  the input column data\n     * @return a columnData x 1 RealMatrix\n     * @throws NoDataException if {@code columnData} is empty.\n     * @throws NullArgumentException if {@code columnData} is {@code null}.\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 340,col 9)",
        "(line 341,col 9)-(line 341,col 44)",
        "(line 342,col 9)-(line 342,col 56)",
        "(line 343,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 346,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createColumnFieldMatrix(T[])",
      "begin_line": 359,
      "end_line": 374,
      "comment": "\n     * Creates a column {@link FieldMatrix} using the data from the input\n     * array.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param columnData  the input column data\n     * @return a columnData x 1 FieldMatrix\n     * @throws NoDataException if {@code data} is empty.\n     * @throws NullArgumentException if {@code columnData} is {@code null}.\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 365,col 44)",
        "(line 366,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 369,col 87)",
        "(line 370,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 373,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.isSymmetricInternal(org.apache.commons.math3.linear.RealMatrix, double, boolean)",
      "begin_line": 387,
      "end_line": 413,
      "comment": "\n     * Checks whether a matrix is symmetric, within a given relative tolerance.\n     *\n     * @param matrix Matrix to check.\n     * @param relativeTolerance Tolerance of the symmetry check.\n     * @param raiseException If {@code true}, an exception will be raised if\n     * the matrix is not symmetric.\n     * @return {@code true} if {@code matrix} is symmetric.\n     * @throws NonSquareMatrixException if the matrix is not square.\n     * @throws NonSymmetricMatrixException if the matrix is not symmetric.\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 50)",
        "(line 391,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 412,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkSymmetric(org.apache.commons.math3.linear.RealMatrix, double)",
      "begin_line": 424,
      "end_line": 427,
      "comment": "\n     * Checks whether a matrix is symmetric.\n     *\n     * @param matrix Matrix to check.\n     * @param eps Relative tolerance.\n     * @throws NonSquareMatrixException if the matrix is not square.\n     * @throws NonSymmetricMatrixException if the matrix is not symmetric.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.isSymmetric(org.apache.commons.math3.linear.RealMatrix, double)",
      "begin_line": 437,
      "end_line": 440,
      "comment": "\n     * Checks whether a matrix is symmetric.\n     *\n     * @param matrix Matrix to check.\n     * @param eps Relative tolerance.\n     * @return {@code true} if {@code matrix} is symmetric.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkMatrixIndex(org.apache.commons.math3.linear.AnyMatrix, int, int)",
      "begin_line": 451,
      "end_line": 456,
      "comment": "\n     * Check if matrix indices are valid.\n     *\n     * @param m Matrix.\n     * @param row Row index to check.\n     * @param column Column index to check.\n     * @throws OutOfRangeException if {@code row} or {@code column} is not\n     * a valid index.\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 30)",
        "(line 455,col 9)-(line 455,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkRowIndex(org.apache.commons.math3.linear.AnyMatrix, int)",
      "begin_line": 465,
      "end_line": 472,
      "comment": "\n     * Check if a row index is valid.\n     *\n     * @param m Matrix.\n     * @param row Row index to check.\n     * @throws OutOfRangeException if {@code row} is not a valid index.\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 471,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkColumnIndex(org.apache.commons.math3.linear.AnyMatrix, int)",
      "begin_line": 481,
      "end_line": 487,
      "comment": "\n     * Check if a column index is valid.\n     *\n     * @param m Matrix.\n     * @param column Column index to check.\n     * @throws OutOfRangeException if {@code column} is not a valid index.\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 486,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math3.linear.AnyMatrix, int, int, int, int)",
      "begin_line": 502,
      "end_line": 521,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to {@code n - 1}.\n     *\n     * @param m Matrix.\n     * @param startRow Initial row index.\n     * @param endRow Final row index.\n     * @param startColumn Initial column index.\n     * @param endColumn Final column index.\n     * @throws OutOfRangeException if the indices are invalid.\n     * @throws NumberIsTooSmallException if {@code endRow \u003c startRow} or\n     * {@code endColumn \u003c startColumn}.\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 35)",
        "(line 507,col 9)-(line 507,col 33)",
        "(line 508,col 9)-(line 511,col 9)",
        "(line 513,col 9)-(line 513,col 41)",
        "(line 514,col 9)-(line 514,col 39)",
        "(line 515,col 9)-(line 518,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math3.linear.AnyMatrix, int[], int[])",
      "begin_line": 536,
      "end_line": 559,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param m Matrix.\n     * @param selectedRows Array of row indices.\n     * @param selectedColumns Array of column indices.\n     * @throws NullArgumentException if {@code selectedRows} or\n     * {@code selectedColumns} are {@code null}.\n     * @throws NoDataException if the row or column selections are empty (zero\n     * length).\n     * @throws OutOfRangeException if row or column selections are not valid.\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 542,col 9)",
        "(line 543,col 9)-(line 545,col 9)",
        "(line 546,col 9)-(line 548,col 9)",
        "(line 549,col 9)-(line 551,col 9)",
        "(line 553,col 9)-(line 555,col 9)",
        "(line 556,col 9)-(line 558,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkAdditionCompatible(org.apache.commons.math3.linear.AnyMatrix, org.apache.commons.math3.linear.AnyMatrix)",
      "begin_line": 569,
      "end_line": 576,
      "comment": "\n     * Check if matrices are addition compatible.\n     *\n     * @param left Left hand side matrix.\n     * @param right Right hand side matrix.\n     * @throws MatrixDimensionMismatchException if the matrices are not addition\n     * compatible.\n     ",
      "child_ranges": [
        "(line 571,col 9)-(line 575,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkSubtractionCompatible(org.apache.commons.math3.linear.AnyMatrix, org.apache.commons.math3.linear.AnyMatrix)",
      "begin_line": 586,
      "end_line": 593,
      "comment": "\n     * Check if matrices are subtraction compatible\n     *\n     * @param left Left hand side matrix.\n     * @param right Right hand side matrix.\n     * @throws MatrixDimensionMismatchException if the matrices are not addition\n     * compatible.\n     ",
      "child_ranges": [
        "(line 588,col 9)-(line 592,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkMultiplicationCompatible(org.apache.commons.math3.linear.AnyMatrix, org.apache.commons.math3.linear.AnyMatrix)",
      "begin_line": 603,
      "end_line": 610,
      "comment": "\n     * Check if matrices are multiplication compatible\n     *\n     * @param left Left hand side matrix.\n     * @param right Right hand side matrix.\n     * @throws DimensionMismatchException if matrices are not multiplication\n     * compatible.\n     ",
      "child_ranges": [
        "(line 606,col 9)-(line 609,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.fractionMatrixToRealMatrix(org.apache.commons.math3.linear.FieldMatrix\u003corg.apache.commons.math3.fraction.Fraction\u003e)",
      "begin_line": 617,
      "end_line": 621,
      "comment": "\n     * Convert a {@link FieldMatrix}/{@link Fraction} matrix to a {@link RealMatrix}.\n     * @param m Matrix to convert.\n     * @return the converted matrix.\n     ",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 80)",
        "(line 619,col 9)-(line 619,col 42)",
        "(line 620,col 9)-(line 620,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FractionMatrixConverter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.DefaultFieldMatrixPreservingVisitor\u003corg.apache.commons.math3.fraction.Fraction\u003e"
      ],
      "begin_line": 624,
      "end_line": 654,
      "comment": " Converter for {@link FieldMatrix}/{@link Fraction}. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 626,
      "end_line": 626,
      "comment": " Converted array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.FractionMatrixConverter.FractionMatrixConverter()",
      "begin_line": 628,
      "end_line": 630,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 629,col 13)-(line 629,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.FractionMatrixConverter.start(int, int, int, int, int, int)",
      "begin_line": 633,
      "end_line": 637,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 636,col 13)-(line 636,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.FractionMatrixConverter.visit(int, int, org.apache.commons.math3.fraction.Fraction)",
      "begin_line": 640,
      "end_line": 643,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 642,col 13)-(line 642,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.FractionMatrixConverter.getConvertedMatrix()",
      "begin_line": 650,
      "end_line": 652,
      "comment": "\n         * Get the converted matrix.\n         *\n         * @return the converted matrix.\n         ",
      "child_ranges": [
        "(line 651,col 13)-(line 651,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.bigFractionMatrixToRealMatrix(org.apache.commons.math3.linear.FieldMatrix\u003corg.apache.commons.math3.fraction.BigFraction\u003e)",
      "begin_line": 662,
      "end_line": 666,
      "comment": "\n     * Convert a {@link FieldMatrix}/{@link BigFraction} matrix to a {@link RealMatrix}.\n     *\n     * @param m Matrix to convert.\n     * @return the converted matrix.\n     ",
      "child_ranges": [
        "(line 663,col 9)-(line 663,col 86)",
        "(line 664,col 9)-(line 664,col 42)",
        "(line 665,col 9)-(line 665,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BigFractionMatrixConverter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.DefaultFieldMatrixPreservingVisitor\u003corg.apache.commons.math3.fraction.BigFraction\u003e"
      ],
      "begin_line": 669,
      "end_line": 698,
      "comment": " Converter for {@link FieldMatrix}/{@link BigFraction}. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 671,
      "end_line": 671,
      "comment": " Converted array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.BigFractionMatrixConverter.BigFractionMatrixConverter()",
      "begin_line": 673,
      "end_line": 675,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 674,col 13)-(line 674,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.BigFractionMatrixConverter.start(int, int, int, int, int, int)",
      "begin_line": 678,
      "end_line": 682,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 681,col 13)-(line 681,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.BigFractionMatrixConverter.visit(int, int, org.apache.commons.math3.fraction.BigFraction)",
      "begin_line": 685,
      "end_line": 688,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 687,col 13)-(line 687,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.BigFractionMatrixConverter.getConvertedMatrix()",
      "begin_line": 695,
      "end_line": 697,
      "comment": "\n         * Get the converted matrix.\n         *\n         * @return the converted matrix.\n         ",
      "child_ranges": [
        "(line 696,col 13)-(line 696,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.serializeRealVector(org.apache.commons.math3.linear.RealVector, java.io.ObjectOutputStream)",
      "begin_line": 740,
      "end_line": 748,
      "comment": " Serialize a {@link RealVector}.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ewriteObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eoos.defaultWriteObject()\u003c/code\u003e) in a class that has a\n     * {@link RealVector} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not serialize the vector (the {@link\n     * RealVector} interface is not serializable by default) but this method does\n     * serialize it specifically.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The following example shows how a simple class with a name and a real vector\n     * should be written:\n     * \u003cpre\u003e\u003ccode\u003e\n     * public class NamedVector implements Serializable {\n     *\n     *     private final String name;\n     *     private final transient RealVector coefficients;\n     *\n     *     // omitted constructors, getters ...\n     *\n     *     private void writeObject(ObjectOutputStream oos) throws IOException {\n     *         oos.defaultWriteObject();  // takes care of name field\n     *         MatrixUtils.serializeRealVector(coefficients, oos);\n     *     }\n     *\n     *     private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {\n     *         ois.defaultReadObject();  // takes care of name field\n     *         MatrixUtils.deserializeRealVector(this, \"coefficients\", ois);\n     *     }\n     *\n     * }\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param vector real vector to serialize\n     * @param oos stream where the real vector should be written\n     * @exception IOException if object cannot be written to stream\n     * @see #deserializeRealVector(Object, String, ObjectInputStream)\n     ",
      "child_ranges": [
        "(line 743,col 9)-(line 743,col 44)",
        "(line 744,col 9)-(line 744,col 24)",
        "(line 745,col 9)-(line 747,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.deserializeRealVector(java.lang.Object, java.lang.String, java.io.ObjectInputStream)",
      "begin_line": 767,
      "end_line": 799,
      "comment": " Deserialize  a {@link RealVector} field in a class.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ereadObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eois.defaultReadObject()\u003c/code\u003e) in a class that has a\n     * {@link RealVector} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not deserialize the vector (the {@link\n     * RealVector} interface is not serializable by default) but this method does\n     * deserialize it specifically.\n     * \u003c/p\u003e\n     * @param instance instance in which the field must be set up\n     * @param fieldName name of the field within the class (may be private and final)\n     * @param ois stream from which the real vector should be read\n     * @exception ClassNotFoundException if a class in the stream cannot be found\n     * @exception IOException if object cannot be read from the stream\n     * @see #serializeRealVector(RealVector, ObjectOutputStream)\n     ",
      "child_ranges": [
        "(line 771,col 9)-(line 797,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.serializeRealMatrix(org.apache.commons.math3.linear.RealMatrix, java.io.ObjectOutputStream)",
      "begin_line": 841,
      "end_line": 853,
      "comment": " Serialize a {@link RealMatrix}.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ewriteObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eoos.defaultWriteObject()\u003c/code\u003e) in a class that has a\n     * {@link RealMatrix} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not serialize the matrix (the {@link\n     * RealMatrix} interface is not serializable by default) but this method does\n     * serialize it specifically.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The following example shows how a simple class with a name and a real matrix\n     * should be written:\n     * \u003cpre\u003e\u003ccode\u003e\n     * public class NamedMatrix implements Serializable {\n     *\n     *     private final String name;\n     *     private final transient RealMatrix coefficients;\n     *\n     *     // omitted constructors, getters ...\n     *\n     *     private void writeObject(ObjectOutputStream oos) throws IOException {\n     *         oos.defaultWriteObject();  // takes care of name field\n     *         MatrixUtils.serializeRealMatrix(coefficients, oos);\n     *     }\n     *\n     *     private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {\n     *         ois.defaultReadObject();  // takes care of name field\n     *         MatrixUtils.deserializeRealMatrix(this, \"coefficients\", ois);\n     *     }\n     *\n     * }\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param matrix real matrix to serialize\n     * @param oos stream where the real matrix should be written\n     * @exception IOException if object cannot be written to stream\n     * @see #deserializeRealMatrix(Object, String, ObjectInputStream)\n     ",
      "child_ranges": [
        "(line 844,col 9)-(line 844,col 47)",
        "(line 845,col 9)-(line 845,col 50)",
        "(line 846,col 9)-(line 846,col 24)",
        "(line 847,col 9)-(line 847,col 24)",
        "(line 848,col 9)-(line 852,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.deserializeRealMatrix(java.lang.Object, java.lang.String, java.io.ObjectInputStream)",
      "begin_line": 872,
      "end_line": 907,
      "comment": " Deserialize  a {@link RealMatrix} field in a class.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ereadObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eois.defaultReadObject()\u003c/code\u003e) in a class that has a\n     * {@link RealMatrix} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not deserialize the matrix (the {@link\n     * RealMatrix} interface is not serializable by default) but this method does\n     * deserialize it specifically.\n     * \u003c/p\u003e\n     * @param instance instance in which the field must be set up\n     * @param fieldName name of the field within the class (may be private and final)\n     * @param ois stream from which the real matrix should be read\n     * @exception ClassNotFoundException if a class in the stream cannot be found\n     * @exception IOException if object cannot be read from the stream\n     * @see #serializeRealMatrix(RealMatrix, ObjectOutputStream)\n     ",
      "child_ranges": [
        "(line 876,col 9)-(line 906,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.solveLowerTriangularSystem(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 927,
      "end_line": 951,
      "comment": "Solve  a  system of composed of a Lower Triangular Matrix\n     * {@link RealMatrix}.\n     * \u003cp\u003e\n     * This method is called to solve systems of equations which are\n     * of the lower triangular form. The matrix {@link RealMatrix}\n     * is assumed, though not checked, to be in lower triangular form.\n     * The vector {@link RealVector} is overwritten with the solution.\n     * The matrix is checked that it is square and its dimensions match\n     * the length of the vector.\n     * \u003c/p\u003e\n     * @param rm RealMatrix which is lower triangular\n     * @param b  RealVector this is overwritten\n     * @throws DimensionMismatchException if the matrix and vector are not\n     * conformable\n     * @throws NonSquareMatrixException if the matrix {@code rm} is not square\n     * @throws MathArithmeticException if the absolute value of one of the diagonal\n     * coefficient of {@code rm} is lower than {@link Precision#SAFE_MIN}\n     ",
      "child_ranges": [
        "(line 930,col 9)-(line 934,col 9)",
        "(line 935,col 9)-(line 938,col 9)",
        "(line 939,col 9)-(line 939,col 40)",
        "(line 940,col 9)-(line 950,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.solveUpperTriangularSystem(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 972,
      "end_line": 996,
      "comment": " Solver a  system composed  of an Upper Triangular Matrix\n     * {@link RealMatrix}.\n     * \u003cp\u003e\n     * This method is called to solve systems of equations which are\n     * of the lower triangular form. The matrix {@link RealMatrix}\n     * is assumed, though not checked, to be in upper triangular form.\n     * The vector {@link RealVector} is overwritten with the solution.\n     * The matrix is checked that it is square and its dimensions match\n     * the length of the vector.\n     * \u003c/p\u003e\n     * @param rm RealMatrix which is upper triangular\n     * @param b  RealVector this is overwritten\n     * @throws DimensionMismatchException if the matrix and vector are not\n     * conformable\n     * @throws NonSquareMatrixException if the matrix {@code rm} is not\n     * square\n     * @throws MathArithmeticException if the absolute value of one of the diagonal\n     * coefficient of {@code rm} is lower than {@link Precision#SAFE_MIN}\n     ",
      "child_ranges": [
        "(line 975,col 9)-(line 979,col 9)",
        "(line 980,col 9)-(line 983,col 9)",
        "(line 984,col 9)-(line 984,col 40)",
        "(line 985,col 9)-(line 995,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.blockInverse(org.apache.commons.math3.linear.RealMatrix, int)",
      "begin_line": 1010,
      "end_line": 1065,
      "comment": "\n     * Computes the inverse of the given matrix by splitting it into\n     * 4 sub-matrices.\n     *\n     * @param m Matrix whose inverse must be computed.\n     * @param splitIndex Index that determines the \"split\" line and\n     * column.\n     * The element corresponding to this index will part of the\n     * upper-left sub-matrix.\n     * @return the inverse of {@code m}.\n     * @throws NonSquareMatrixException if {@code m} is not square.\n     ",
      "child_ranges": [
        "(line 1012,col 9)-(line 1012,col 42)",
        "(line 1013,col 9)-(line 1016,col 9)",
        "(line 1018,col 9)-(line 1018,col 47)",
        "(line 1020,col 9)-(line 1020,col 74)",
        "(line 1021,col 9)-(line 1021,col 79)",
        "(line 1022,col 9)-(line 1022,col 79)",
        "(line 1023,col 9)-(line 1023,col 84)",
        "(line 1025,col 9)-(line 1025,col 82)",
        "(line 1026,col 9)-(line 1026,col 61)",
        "(line 1027,col 9)-(line 1029,col 9)",
        "(line 1030,col 9)-(line 1030,col 53)",
        "(line 1032,col 9)-(line 1032,col 82)",
        "(line 1033,col 9)-(line 1033,col 61)",
        "(line 1034,col 9)-(line 1036,col 9)",
        "(line 1037,col 9)-(line 1037,col 53)",
        "(line 1039,col 9)-(line 1039,col 73)",
        "(line 1040,col 9)-(line 1040,col 88)",
        "(line 1041,col 9)-(line 1041,col 67)",
        "(line 1042,col 9)-(line 1044,col 9)",
        "(line 1045,col 9)-(line 1045,col 60)",
        "(line 1047,col 9)-(line 1047,col 73)",
        "(line 1048,col 9)-(line 1048,col 88)",
        "(line 1049,col 9)-(line 1049,col 67)",
        "(line 1050,col 9)-(line 1052,col 9)",
        "(line 1053,col 9)-(line 1053,col 60)",
        "(line 1055,col 9)-(line 1055,col 91)",
        "(line 1056,col 9)-(line 1056,col 91)",
        "(line 1058,col 9)-(line 1058,col 65)",
        "(line 1059,col 9)-(line 1059,col 54)",
        "(line 1060,col 9)-(line 1060,col 64)",
        "(line 1061,col 9)-(line 1061,col 64)",
        "(line 1062,col 9)-(line 1062,col 74)",
        "(line 1064,col 9)-(line 1064,col 22)"
      ]
    }
  ]
}