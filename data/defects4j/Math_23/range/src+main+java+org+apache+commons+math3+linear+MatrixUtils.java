{
  "filepath": "/tmp/Math-23b/src/main/java/org/apache/commons/math3/linear/MatrixUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MatrixUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 932,
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
      "end_line": 205,
      "comment": "\n     * Returns \u003ccode\u003edimension x dimension\u003c/code\u003e identity matrix.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param field field to which the elements belong\n     * @param dimension dimension of identity matrix to generate\n     * @return identity matrix\n     * @throws IllegalArgumentException if dimension is not positive\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 39)",
        "(line 196,col 9)-(line 196,col 38)",
        "(line 197,col 9)-(line 198,col 111)",
        "(line 199,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createRealDiagonalMatrix(double[])",
      "begin_line": 215,
      "end_line": 221,
      "comment": "\n     * Returns a diagonal matrix with specified elements.\n     *\n     * @param diagonal diagonal elements of the matrix (the array elements\n     * will be copied)\n     * @return diagonal matrix\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 80)",
        "(line 217,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createFieldDiagonalMatrix(T[])",
      "begin_line": 232,
      "end_line": 240,
      "comment": "\n     * Returns a diagonal matrix with specified elements.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param diagonal diagonal elements of the matrix (the array elements\n     * will be copied)\n     * @return diagonal matrix\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 235,col 88)",
        "(line 236,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createRealVector(double[])",
      "begin_line": 250,
      "end_line": 256,
      "comment": "\n     * Creates a {@link RealVector} using the data from the input array.\n     *\n     * @param data the input data\n     * @return a data.length RealVector\n     * @throws NoDataException if {@code data} is empty.\n     * @throws NullArgumentException if {@code data} is {@code null}.\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createFieldVector(T[])",
      "begin_line": 268,
      "end_line": 277,
      "comment": "\n     * Creates a {@link FieldVector} using the data from the input array.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param data the input data\n     * @return a data.length FieldVector\n     * @throws NoDataException if {@code data} is empty.\n     * @throws NullArgumentException if {@code data} is {@code null}.\n     * @throws ZeroException if {@code data} has 0 elements\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 276,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createRowRealMatrix(double[])",
      "begin_line": 288,
      "end_line": 299,
      "comment": "\n     * Create a row {@link RealMatrix} using the data from the input\n     * array.\n     *\n     * @param rowData the input row data\n     * @return a 1 x rowData.length RealMatrix\n     * @throws NoDataException if {@code rowData} is empty.\n     * @throws NullArgumentException if {@code rowData} is {@code null}.\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 293,col 41)",
        "(line 294,col 9)-(line 294,col 56)",
        "(line 295,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 298,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createRowFieldMatrix(T[])",
      "begin_line": 311,
      "end_line": 326,
      "comment": "\n     * Create a row {@link FieldMatrix} using the data from the input\n     * array.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param rowData the input row data\n     * @return a 1 x rowData.length FieldMatrix\n     * @throws NoDataException if {@code rowData} is empty.\n     * @throws NullArgumentException if {@code rowData} is {@code null}.\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 317,col 41)",
        "(line 318,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 321,col 84)",
        "(line 322,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 325,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createColumnRealMatrix(double[])",
      "begin_line": 337,
      "end_line": 348,
      "comment": "\n     * Creates a column {@link RealMatrix} using the data from the input\n     * array.\n     *\n     * @param columnData  the input column data\n     * @return a columnData x 1 RealMatrix\n     * @throws NoDataException if {@code columnData} is empty.\n     * @throws NullArgumentException if {@code columnData} is {@code null}.\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 342,col 44)",
        "(line 343,col 9)-(line 343,col 56)",
        "(line 344,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 347,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createColumnFieldMatrix(T[])",
      "begin_line": 360,
      "end_line": 375,
      "comment": "\n     * Creates a column {@link FieldMatrix} using the data from the input\n     * array.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param columnData  the input column data\n     * @return a columnData x 1 FieldMatrix\n     * @throws NoDataException if {@code data} is empty.\n     * @throws NullArgumentException if {@code columnData} is {@code null}.\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 366,col 44)",
        "(line 367,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 370,col 87)",
        "(line 371,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 374,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkMatrixIndex(org.apache.commons.math3.linear.AnyMatrix, int, int)",
      "begin_line": 386,
      "end_line": 391,
      "comment": "\n     * Check if matrix indices are valid.\n     *\n     * @param m Matrix.\n     * @param row Row index to check.\n     * @param column Column index to check.\n     * @throws OutOfRangeException if {@code row} or {@code column} is not\n     * a valid index.\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 30)",
        "(line 390,col 9)-(line 390,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkRowIndex(org.apache.commons.math3.linear.AnyMatrix, int)",
      "begin_line": 400,
      "end_line": 407,
      "comment": "\n     * Check if a row index is valid.\n     *\n     * @param m Matrix.\n     * @param row Row index to check.\n     * @throws OutOfRangeException if {@code row} is not a valid index.\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 406,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkColumnIndex(org.apache.commons.math3.linear.AnyMatrix, int)",
      "begin_line": 416,
      "end_line": 422,
      "comment": "\n     * Check if a column index is valid.\n     *\n     * @param m Matrix.\n     * @param column Column index to check.\n     * @throws OutOfRangeException if {@code column} is not a valid index.\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 421,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math3.linear.AnyMatrix, int, int, int, int)",
      "begin_line": 437,
      "end_line": 456,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to {@code n - 1}.\n     *\n     * @param m Matrix.\n     * @param startRow Initial row index.\n     * @param endRow Final row index.\n     * @param startColumn Initial column index.\n     * @param endColumn Final column index.\n     * @throws OutOfRangeException if the indices are invalid.\n     * @throws NumberIsTooSmallException if {@code endRow \u003c startRow} or\n     * {@code endColumn \u003c startColumn}.\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 35)",
        "(line 442,col 9)-(line 442,col 33)",
        "(line 443,col 9)-(line 446,col 9)",
        "(line 448,col 9)-(line 448,col 41)",
        "(line 449,col 9)-(line 449,col 39)",
        "(line 450,col 9)-(line 453,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math3.linear.AnyMatrix, int[], int[])",
      "begin_line": 471,
      "end_line": 494,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param m Matrix.\n     * @param selectedRows Array of row indices.\n     * @param selectedColumns Array of column indices.\n     * @throws NullArgumentException if {@code selectedRows} or\n     * {@code selectedColumns} are {@code null}.\n     * @throws NoDataException if the row or column selections are empty (zero\n     * length).\n     * @throws OutOfRangeException if row or column selections are not valid.\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 480,col 9)",
        "(line 481,col 9)-(line 483,col 9)",
        "(line 484,col 9)-(line 486,col 9)",
        "(line 488,col 9)-(line 490,col 9)",
        "(line 491,col 9)-(line 493,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkAdditionCompatible(org.apache.commons.math3.linear.AnyMatrix, org.apache.commons.math3.linear.AnyMatrix)",
      "begin_line": 504,
      "end_line": 511,
      "comment": "\n     * Check if matrices are addition compatible.\n     *\n     * @param left Left hand side matrix.\n     * @param right Right hand side matrix.\n     * @throws MatrixDimensionMismatchException if the matrices are not addition\n     * compatible.\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 510,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkSubtractionCompatible(org.apache.commons.math3.linear.AnyMatrix, org.apache.commons.math3.linear.AnyMatrix)",
      "begin_line": 521,
      "end_line": 528,
      "comment": "\n     * Check if matrices are subtraction compatible\n     *\n     * @param left Left hand side matrix.\n     * @param right Right hand side matrix.\n     * @throws MatrixDimensionMismatchException if the matrices are not addition\n     * compatible.\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 527,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkMultiplicationCompatible(org.apache.commons.math3.linear.AnyMatrix, org.apache.commons.math3.linear.AnyMatrix)",
      "begin_line": 538,
      "end_line": 545,
      "comment": "\n     * Check if matrices are multiplication compatible\n     *\n     * @param left Left hand side matrix.\n     * @param right Right hand side matrix.\n     * @throws DimensionMismatchException if matrices are not multiplication\n     * compatible.\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 544,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.fractionMatrixToRealMatrix(org.apache.commons.math3.linear.FieldMatrix\u003corg.apache.commons.math3.fraction.Fraction\u003e)",
      "begin_line": 552,
      "end_line": 556,
      "comment": "\n     * Convert a {@link FieldMatrix}/{@link Fraction} matrix to a {@link RealMatrix}.\n     * @param m Matrix to convert.\n     * @return the converted matrix.\n     ",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 80)",
        "(line 554,col 9)-(line 554,col 42)",
        "(line 555,col 9)-(line 555,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FractionMatrixConverter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.DefaultFieldMatrixPreservingVisitor\u003corg.apache.commons.math3.fraction.Fraction\u003e"
      ],
      "begin_line": 559,
      "end_line": 589,
      "comment": " Converter for {@link FieldMatrix}/{@link Fraction}. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 561,
      "end_line": 561,
      "comment": " Converted array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.FractionMatrixConverter.FractionMatrixConverter()",
      "begin_line": 563,
      "end_line": 565,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 564,col 13)-(line 564,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.FractionMatrixConverter.start(int, int, int, int, int, int)",
      "begin_line": 568,
      "end_line": 572,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 571,col 13)-(line 571,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.FractionMatrixConverter.visit(int, int, org.apache.commons.math3.fraction.Fraction)",
      "begin_line": 575,
      "end_line": 578,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 577,col 13)-(line 577,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.FractionMatrixConverter.getConvertedMatrix()",
      "begin_line": 585,
      "end_line": 587,
      "comment": "\n         * Get the converted matrix.\n         *\n         * @return the converted matrix.\n         ",
      "child_ranges": [
        "(line 586,col 13)-(line 586,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.bigFractionMatrixToRealMatrix(org.apache.commons.math3.linear.FieldMatrix\u003corg.apache.commons.math3.fraction.BigFraction\u003e)",
      "begin_line": 597,
      "end_line": 601,
      "comment": "\n     * Convert a {@link FieldMatrix}/{@link BigFraction} matrix to a {@link RealMatrix}.\n     *\n     * @param m Matrix to convert.\n     * @return the converted matrix.\n     ",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 86)",
        "(line 599,col 9)-(line 599,col 42)",
        "(line 600,col 9)-(line 600,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BigFractionMatrixConverter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.DefaultFieldMatrixPreservingVisitor\u003corg.apache.commons.math3.fraction.BigFraction\u003e"
      ],
      "begin_line": 604,
      "end_line": 633,
      "comment": " Converter for {@link FieldMatrix}/{@link BigFraction}. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 606,
      "end_line": 606,
      "comment": " Converted array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.BigFractionMatrixConverter.BigFractionMatrixConverter()",
      "begin_line": 608,
      "end_line": 610,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 609,col 13)-(line 609,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.BigFractionMatrixConverter.start(int, int, int, int, int, int)",
      "begin_line": 613,
      "end_line": 617,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 616,col 13)-(line 616,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.BigFractionMatrixConverter.visit(int, int, org.apache.commons.math3.fraction.BigFraction)",
      "begin_line": 620,
      "end_line": 623,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 622,col 13)-(line 622,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.BigFractionMatrixConverter.getConvertedMatrix()",
      "begin_line": 630,
      "end_line": 632,
      "comment": "\n         * Get the converted matrix.\n         *\n         * @return the converted matrix.\n         ",
      "child_ranges": [
        "(line 631,col 13)-(line 631,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.serializeRealVector(org.apache.commons.math3.linear.RealVector, java.io.ObjectOutputStream)",
      "begin_line": 675,
      "end_line": 683,
      "comment": " Serialize a {@link RealVector}.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ewriteObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eoos.defaultWriteObject()\u003c/code\u003e) in a class that has a\n     * {@link RealVector} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not serialize the vector (the {@link\n     * RealVector} interface is not serializable by default) but this method does\n     * serialize it specifically.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The following example shows how a simple class with a name and a real vector\n     * should be written:\n     * \u003cpre\u003e\u003ccode\u003e\n     * public class NamedVector implements Serializable {\n     *\n     *     private final String name;\n     *     private final transient RealVector coefficients;\n     *\n     *     // omitted constructors, getters ...\n     *\n     *     private void writeObject(ObjectOutputStream oos) throws IOException {\n     *         oos.defaultWriteObject();  // takes care of name field\n     *         MatrixUtils.serializeRealVector(coefficients, oos);\n     *     }\n     *\n     *     private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {\n     *         ois.defaultReadObject();  // takes care of name field\n     *         MatrixUtils.deserializeRealVector(this, \"coefficients\", ois);\n     *     }\n     *\n     * }\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param vector real vector to serialize\n     * @param oos stream where the real vector should be written\n     * @exception IOException if object cannot be written to stream\n     * @see #deserializeRealVector(Object, String, ObjectInputStream)\n     ",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 44)",
        "(line 679,col 9)-(line 679,col 24)",
        "(line 680,col 9)-(line 682,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.deserializeRealVector(java.lang.Object, java.lang.String, java.io.ObjectInputStream)",
      "begin_line": 702,
      "end_line": 734,
      "comment": " Deserialize  a {@link RealVector} field in a class.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ereadObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eois.defaultReadObject()\u003c/code\u003e) in a class that has a\n     * {@link RealVector} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not deserialize the vector (the {@link\n     * RealVector} interface is not serializable by default) but this method does\n     * deserialize it specifically.\n     * \u003c/p\u003e\n     * @param instance instance in which the field must be set up\n     * @param fieldName name of the field within the class (may be private and final)\n     * @param ois stream from which the real vector should be read\n     * @exception ClassNotFoundException if a class in the stream cannot be found\n     * @exception IOException if object cannot be read from the stream\n     * @see #serializeRealVector(RealVector, ObjectOutputStream)\n     ",
      "child_ranges": [
        "(line 706,col 9)-(line 732,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.serializeRealMatrix(org.apache.commons.math3.linear.RealMatrix, java.io.ObjectOutputStream)",
      "begin_line": 776,
      "end_line": 788,
      "comment": " Serialize a {@link RealMatrix}.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ewriteObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eoos.defaultWriteObject()\u003c/code\u003e) in a class that has a\n     * {@link RealMatrix} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not serialize the matrix (the {@link\n     * RealMatrix} interface is not serializable by default) but this method does\n     * serialize it specifically.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The following example shows how a simple class with a name and a real matrix\n     * should be written:\n     * \u003cpre\u003e\u003ccode\u003e\n     * public class NamedMatrix implements Serializable {\n     *\n     *     private final String name;\n     *     private final transient RealMatrix coefficients;\n     *\n     *     // omitted constructors, getters ...\n     *\n     *     private void writeObject(ObjectOutputStream oos) throws IOException {\n     *         oos.defaultWriteObject();  // takes care of name field\n     *         MatrixUtils.serializeRealMatrix(coefficients, oos);\n     *     }\n     *\n     *     private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {\n     *         ois.defaultReadObject();  // takes care of name field\n     *         MatrixUtils.deserializeRealMatrix(this, \"coefficients\", ois);\n     *     }\n     *\n     * }\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param matrix real matrix to serialize\n     * @param oos stream where the real matrix should be written\n     * @exception IOException if object cannot be written to stream\n     * @see #deserializeRealMatrix(Object, String, ObjectInputStream)\n     ",
      "child_ranges": [
        "(line 779,col 9)-(line 779,col 47)",
        "(line 780,col 9)-(line 780,col 50)",
        "(line 781,col 9)-(line 781,col 24)",
        "(line 782,col 9)-(line 782,col 24)",
        "(line 783,col 9)-(line 787,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.deserializeRealMatrix(java.lang.Object, java.lang.String, java.io.ObjectInputStream)",
      "begin_line": 807,
      "end_line": 842,
      "comment": " Deserialize  a {@link RealMatrix} field in a class.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ereadObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eois.defaultReadObject()\u003c/code\u003e) in a class that has a\n     * {@link RealMatrix} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not deserialize the matrix (the {@link\n     * RealMatrix} interface is not serializable by default) but this method does\n     * deserialize it specifically.\n     * \u003c/p\u003e\n     * @param instance instance in which the field must be set up\n     * @param fieldName name of the field within the class (may be private and final)\n     * @param ois stream from which the real matrix should be read\n     * @exception ClassNotFoundException if a class in the stream cannot be found\n     * @exception IOException if object cannot be read from the stream\n     * @see #serializeRealMatrix(RealMatrix, ObjectOutputStream)\n     ",
      "child_ranges": [
        "(line 811,col 9)-(line 841,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.solveLowerTriangularSystem(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 862,
      "end_line": 886,
      "comment": "Solve  a  system of composed of a Lower Triangular Matrix\n     * {@link RealMatrix}.\n     * \u003cp\u003e\n     * This method is called to solve systems of equations which are\n     * of the lower triangular form. The matrix {@link RealMatrix}\n     * is assumed, though not checked, to be in lower triangular form.\n     * The vector {@link RealVector} is overwritten with the solution.\n     * The matrix is checked that it is square and its dimensions match\n     * the length of the vector.\n     * \u003c/p\u003e\n     * @param rm RealMatrix which is lower triangular\n     * @param b  RealVector this is overwritten\n     * @throws DimensionMismatchException if the matrix and vector are not\n     * conformable\n     * @throws NonSquareMatrixException if the matrix {@code rm} is not square\n     * @throws MathArithmeticException if the absolute value of one of the diagonal\n     * coefficient of {@code rm} is lower than {@link Precision#SAFE_MIN}\n     ",
      "child_ranges": [
        "(line 865,col 9)-(line 869,col 9)",
        "(line 870,col 9)-(line 873,col 9)",
        "(line 874,col 9)-(line 874,col 40)",
        "(line 875,col 9)-(line 885,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.solveUpperTriangularSystem(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 907,
      "end_line": 931,
      "comment": " Solver a  system composed  of an Upper Triangular Matrix\n     * {@link RealMatrix}.\n     * \u003cp\u003e\n     * This method is called to solve systems of equations which are\n     * of the lower triangular form. The matrix {@link RealMatrix}\n     * is assumed, though not checked, to be in upper triangular form.\n     * The vector {@link RealVector} is overwritten with the solution.\n     * The matrix is checked that it is square and its dimensions match\n     * the length of the vector.\n     * \u003c/p\u003e\n     * @param rm RealMatrix which is upper triangular\n     * @param b  RealVector this is overwritten\n     * @throws DimensionMismatchException if the matrix and vector are not\n     * conformable\n     * @throws NonSquareMatrixException if the matrix {@code rm} is not\n     * square\n     * @throws MathArithmeticException if the absolute value of one of the diagonal\n     * coefficient of {@code rm} is lower than {@link Precision#SAFE_MIN}\n     ",
      "child_ranges": [
        "(line 910,col 9)-(line 914,col 9)",
        "(line 915,col 9)-(line 918,col 9)",
        "(line 919,col 9)-(line 919,col 40)",
        "(line 920,col 9)-(line 930,col 9)"
      ]
    }
  ]
}