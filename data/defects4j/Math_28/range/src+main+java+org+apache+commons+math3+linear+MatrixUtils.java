{
  "filepath": "/tmp/Math-28b/src/main/java/org/apache/commons/math3/linear/MatrixUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MatrixUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 47,
      "end_line": 902,
      "comment": "\n * A collection of static methods that operate on or return matrices.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FORMAT"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * The default format for {@link RealMatrix} objects.\n     * @since 3.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "OCTAVE_FORMAT"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * A format for {@link RealMatrix} objects compatible with octave.\n     * @since 3.1\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.MatrixUtils()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Private constructor.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(int, int)",
      "begin_line": 81,
      "end_line": 84,
      "comment": "\n     * Returns a {@link RealMatrix} with specified dimensions.\n     * \u003cp\u003eThe type of matrix returned depends on the dimension. Below\n     * 2\u003csup\u003e12\u003c/sup\u003e elements (i.e. 4096 elements or 64\u0026times;64 for a\n     * square matrix) which can be stored in a 32kB array, a {@link\n     * Array2DRowRealMatrix} instance is built. Above this threshold a {@link\n     * BlockRealMatrix} instance is built.\u003c/p\u003e\n     * \u003cp\u003eThe matrix elements are all set to 0.0.\u003c/p\u003e\n     * @param rows number of rows of the matrix\n     * @param columns number of columns of the matrix\n     * @return  RealMatrix with specified dimensions\n     * @see #createRealMatrix(double[][])\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 83,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createFieldMatrix(org.apache.commons.math3.Field\u003cT\u003e, int, int)",
      "begin_line": 101,
      "end_line": 106,
      "comment": "\n     * Returns a {@link FieldMatrix} with specified dimensions.\n     * \u003cp\u003eThe type of matrix returned depends on the dimension. Below\n     * 2\u003csup\u003e12\u003c/sup\u003e elements (i.e. 4096 elements or 64\u0026times;64 for a\n     * square matrix), a {@link FieldMatrix} instance is built. Above\n     * this threshold a {@link BlockFieldMatrix} instance is built.\u003c/p\u003e\n     * \u003cp\u003eThe matrix elements are all set to field.getZero().\u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param field field to which the matrix elements belong\n     * @param rows number of rows of the matrix\n     * @param columns number of columns of the matrix\n     * @return  FieldMatrix with specified dimensions\n     * @see #createFieldMatrix(FieldElement[][])\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 105,col 115)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(double[][])",
      "begin_line": 127,
      "end_line": 134,
      "comment": "\n     * Returns a {@link RealMatrix} whose entries are the the values in the\n     * the input array.\n     * \u003cp\u003eThe type of matrix returned depends on the dimension. Below\n     * 2\u003csup\u003e12\u003c/sup\u003e elements (i.e. 4096 elements or 64\u0026times;64 for a\n     * square matrix) which can be stored in a 32kB array, a {@link\n     * Array2DRowRealMatrix} instance is built. Above this threshold a {@link\n     * BlockRealMatrix} instance is built.\u003c/p\u003e\n     * \u003cp\u003eThe input array is copied, not referenced.\u003c/p\u003e\n     *\n     * @param data input array\n     * @return  RealMatrix containing the values of the array\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code data} is not rectangular (not all rows have the same length).\n     * @throws NoDataException if a row or column is empty.\n     * @throws NullArgumentException if either {@code data} or {@code data[0]}\n     * is {@code null}.\n     * @see #createRealMatrix(int, int)\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 133,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createFieldMatrix(T[][])",
      "begin_line": 155,
      "end_line": 162,
      "comment": "\n     * Returns a {@link FieldMatrix} whose entries are the the values in the\n     * the input array.\n     * \u003cp\u003eThe type of matrix returned depends on the dimension. Below\n     * 2\u003csup\u003e12\u003c/sup\u003e elements (i.e. 4096 elements or 64\u0026times;64 for a\n     * square matrix), a {@link FieldMatrix} instance is built. Above\n     * this threshold a {@link BlockFieldMatrix} instance is built.\u003c/p\u003e\n     * \u003cp\u003eThe input array is copied, not referenced.\u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param data input array\n     * @return a matrix containing the values of the array.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code data} is not rectangular (not all rows have the same length).\n     * @throws NoDataException if a row or column is empty.\n     * @throws NullArgumentException if either {@code data} or {@code data[0]}\n     * is {@code null}.\n     * @see #createFieldMatrix(Field, int, int)\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 161,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createRealIdentityMatrix(int)",
      "begin_line": 172,
      "end_line": 178,
      "comment": "\n     * Returns \u003ccode\u003edimension x dimension\u003c/code\u003e identity matrix.\n     *\n     * @param dimension dimension of identity matrix to generate\n     * @return identity matrix\n     * @throws IllegalArgumentException if dimension is not positive\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 68)",
        "(line 174,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createFieldIdentityMatrix(org.apache.commons.math3.Field\u003cT\u003e, int)",
      "begin_line": 190,
      "end_line": 202,
      "comment": "\n     * Returns \u003ccode\u003edimension x dimension\u003c/code\u003e identity matrix.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param field field to which the elements belong\n     * @param dimension dimension of identity matrix to generate\n     * @return identity matrix\n     * @throws IllegalArgumentException if dimension is not positive\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 39)",
        "(line 193,col 9)-(line 193,col 38)",
        "(line 194,col 9)-(line 195,col 111)",
        "(line 196,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 201,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createRealDiagonalMatrix(double[])",
      "begin_line": 212,
      "end_line": 218,
      "comment": "\n     * Returns a diagonal matrix with specified elements.\n     *\n     * @param diagonal diagonal elements of the matrix (the array elements\n     * will be copied)\n     * @return diagonal matrix\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 80)",
        "(line 214,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 217,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createFieldDiagonalMatrix(T[])",
      "begin_line": 229,
      "end_line": 237,
      "comment": "\n     * Returns a diagonal matrix with specified elements.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param diagonal diagonal elements of the matrix (the array elements\n     * will be copied)\n     * @return diagonal matrix\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 232,col 88)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createRealVector(double[])",
      "begin_line": 247,
      "end_line": 252,
      "comment": "\n     * Creates a {@link RealVector} using the data from the input array.\n     *\n     * @param data the input data\n     * @return a data.length RealVector\n     * @throws NoDataException if {@code data} is empty.\n     * @throws NullArgumentException if {@code data} is {@code null}.\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createFieldVector(T[])",
      "begin_line": 264,
      "end_line": 272,
      "comment": "\n     * Creates a {@link FieldVector} using the data from the input array.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param data the input data\n     * @return a data.length FieldVector\n     * @throws NoDataException if {@code data} is empty.\n     * @throws NullArgumentException if {@code data} is {@code null}.\n     * @throws ZeroException if {@code data} has 0 elements\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createRowRealMatrix(double[])",
      "begin_line": 283,
      "end_line": 293,
      "comment": "\n     * Create a row {@link RealMatrix} using the data from the input\n     * array.\n     *\n     * @param rowData the input row data\n     * @return a 1 x rowData.length RealMatrix\n     * @throws NoDataException if {@code rowData} is empty.\n     * @throws NullArgumentException if {@code rowData} is {@code null}.\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 287,col 41)",
        "(line 288,col 9)-(line 288,col 56)",
        "(line 289,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 292,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createRowFieldMatrix(T[])",
      "begin_line": 305,
      "end_line": 319,
      "comment": "\n     * Create a row {@link FieldMatrix} using the data from the input\n     * array.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param rowData the input row data\n     * @return a 1 x rowData.length FieldMatrix\n     * @throws NoDataException if {@code rowData} is empty.\n     * @throws NullArgumentException if {@code rowData} is {@code null}.\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 310,col 41)",
        "(line 311,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 314,col 84)",
        "(line 315,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 318,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createColumnRealMatrix(double[])",
      "begin_line": 330,
      "end_line": 340,
      "comment": "\n     * Creates a column {@link RealMatrix} using the data from the input\n     * array.\n     *\n     * @param columnData  the input column data\n     * @return a columnData x 1 RealMatrix\n     * @throws NoDataException if {@code columnData} is empty.\n     * @throws NullArgumentException if {@code columnData} is {@code null}.\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 334,col 44)",
        "(line 335,col 9)-(line 335,col 56)",
        "(line 336,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 339,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createColumnFieldMatrix(T[])",
      "begin_line": 352,
      "end_line": 366,
      "comment": "\n     * Creates a column {@link FieldMatrix} using the data from the input\n     * array.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param columnData  the input column data\n     * @return a columnData x 1 FieldMatrix\n     * @throws NoDataException if {@code data} is empty.\n     * @throws NullArgumentException if {@code columnData} is {@code null}.\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 44)",
        "(line 358,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 361,col 87)",
        "(line 362,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 365,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkMatrixIndex(org.apache.commons.math3.linear.AnyMatrix, int, int)",
      "begin_line": 377,
      "end_line": 381,
      "comment": "\n     * Check if matrix indices are valid.\n     *\n     * @param m Matrix.\n     * @param row Row index to check.\n     * @param column Column index to check.\n     * @throws OutOfRangeException if {@code row} or {@code column} is not\n     * a valid index.\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 30)",
        "(line 380,col 9)-(line 380,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkRowIndex(org.apache.commons.math3.linear.AnyMatrix, int)",
      "begin_line": 390,
      "end_line": 396,
      "comment": "\n     * Check if a row index is valid.\n     *\n     * @param m Matrix.\n     * @param row Row index to check.\n     * @throws OutOfRangeException if {@code row} is not a valid index.\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 395,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkColumnIndex(org.apache.commons.math3.linear.AnyMatrix, int)",
      "begin_line": 405,
      "end_line": 410,
      "comment": "\n     * Check if a column index is valid.\n     *\n     * @param m Matrix.\n     * @param column Column index to check.\n     * @throws OutOfRangeException if {@code column} is not a valid index.\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 409,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math3.linear.AnyMatrix, int, int, int, int)",
      "begin_line": 425,
      "end_line": 443,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to {@code n - 1}.\n     *\n     * @param m Matrix.\n     * @param startRow Initial row index.\n     * @param endRow Final row index.\n     * @param startColumn Initial column index.\n     * @param endColumn Final column index.\n     * @throws OutOfRangeException if the indices are invalid.\n     * @throws NumberIsTooSmallException if {@code endRow \u003c startRow} or\n     * {@code endColumn \u003c startColumn}.\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 35)",
        "(line 429,col 9)-(line 429,col 33)",
        "(line 430,col 9)-(line 433,col 9)",
        "(line 435,col 9)-(line 435,col 41)",
        "(line 436,col 9)-(line 436,col 39)",
        "(line 437,col 9)-(line 440,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math3.linear.AnyMatrix, int[], int[])",
      "begin_line": 458,
      "end_line": 480,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param m Matrix.\n     * @param selectedRows Array of row indices.\n     * @param selectedColumns Array of column indices.\n     * @throws NullArgumentException if {@code selectedRows} or\n     * {@code selectedColumns} are {@code null}.\n     * @throws NoDataException if the row or column selections are empty (zero\n     * length).\n     * @throws OutOfRangeException if row or column selections are not valid.\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 463,col 9)",
        "(line 464,col 9)-(line 466,col 9)",
        "(line 467,col 9)-(line 469,col 9)",
        "(line 470,col 9)-(line 472,col 9)",
        "(line 474,col 9)-(line 476,col 9)",
        "(line 477,col 9)-(line 479,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkAdditionCompatible(org.apache.commons.math3.linear.AnyMatrix, org.apache.commons.math3.linear.AnyMatrix)",
      "begin_line": 489,
      "end_line": 495,
      "comment": "\n     * Check if matrices are addition compatible.\n     *\n     * @param left Left hand side matrix.\n     * @param right Right hand side matrix.\n     * @throws MatrixDimensionMismatchException if the matrices are not addition compatible.\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 494,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkSubtractionCompatible(org.apache.commons.math3.linear.AnyMatrix, org.apache.commons.math3.linear.AnyMatrix)",
      "begin_line": 504,
      "end_line": 510,
      "comment": "\n     * Check if matrices are subtraction compatible\n     *\n     * @param left Left hand side matrix.\n     * @param right Right hand side matrix.\n     * @throws MatrixDimensionMismatchException if the matrices are not addition compatible.\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 509,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkMultiplicationCompatible(org.apache.commons.math3.linear.AnyMatrix, org.apache.commons.math3.linear.AnyMatrix)",
      "begin_line": 519,
      "end_line": 524,
      "comment": "\n     * Check if matrices are multiplication compatible\n     *\n     * @param left Left hand side matrix.\n     * @param right Right hand side matrix.\n     * @throws DimensionMismatchException if matrices are not multiplication compatible.\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 523,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.fractionMatrixToRealMatrix(org.apache.commons.math3.linear.FieldMatrix\u003corg.apache.commons.math3.fraction.Fraction\u003e)",
      "begin_line": 531,
      "end_line": 535,
      "comment": "\n     * Convert a {@link FieldMatrix}/{@link Fraction} matrix to a {@link RealMatrix}.\n     * @param m Matrix to convert.\n     * @return the converted matrix.\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 80)",
        "(line 533,col 9)-(line 533,col 42)",
        "(line 534,col 9)-(line 534,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FractionMatrixConverter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.DefaultFieldMatrixPreservingVisitor\u003corg.apache.commons.math3.fraction.Fraction\u003e"
      ],
      "begin_line": 538,
      "end_line": 568,
      "comment": " Converter for {@link FieldMatrix}/{@link Fraction}. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 540,
      "end_line": 540,
      "comment": " Converted array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.FractionMatrixConverter.FractionMatrixConverter()",
      "begin_line": 542,
      "end_line": 544,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 543,col 13)-(line 543,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.FractionMatrixConverter.start(int, int, int, int, int, int)",
      "begin_line": 547,
      "end_line": 551,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 550,col 13)-(line 550,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.FractionMatrixConverter.visit(int, int, org.apache.commons.math3.fraction.Fraction)",
      "begin_line": 554,
      "end_line": 557,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 556,col 13)-(line 556,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.FractionMatrixConverter.getConvertedMatrix()",
      "begin_line": 564,
      "end_line": 566,
      "comment": "\n         * Get the converted matrix.\n         *\n         * @return the converted matrix.\n         ",
      "child_ranges": [
        "(line 565,col 13)-(line 565,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.bigFractionMatrixToRealMatrix(org.apache.commons.math3.linear.FieldMatrix\u003corg.apache.commons.math3.fraction.BigFraction\u003e)",
      "begin_line": 576,
      "end_line": 580,
      "comment": "\n     * Convert a {@link FieldMatrix}/{@link BigFraction} matrix to a {@link RealMatrix}.\n     *\n     * @param m Matrix to convert.\n     * @return the converted matrix.\n     ",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 86)",
        "(line 578,col 9)-(line 578,col 42)",
        "(line 579,col 9)-(line 579,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BigFractionMatrixConverter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.DefaultFieldMatrixPreservingVisitor\u003corg.apache.commons.math3.fraction.BigFraction\u003e"
      ],
      "begin_line": 583,
      "end_line": 612,
      "comment": " Converter for {@link FieldMatrix}/{@link BigFraction}. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 585,
      "end_line": 585,
      "comment": " Converted array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.BigFractionMatrixConverter.BigFractionMatrixConverter()",
      "begin_line": 587,
      "end_line": 589,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 588,col 13)-(line 588,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.BigFractionMatrixConverter.start(int, int, int, int, int, int)",
      "begin_line": 592,
      "end_line": 596,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 595,col 13)-(line 595,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.BigFractionMatrixConverter.visit(int, int, org.apache.commons.math3.fraction.BigFraction)",
      "begin_line": 599,
      "end_line": 602,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 601,col 13)-(line 601,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.BigFractionMatrixConverter.getConvertedMatrix()",
      "begin_line": 609,
      "end_line": 611,
      "comment": "\n         * Get the converted matrix.\n         *\n         * @return the converted matrix.\n         ",
      "child_ranges": [
        "(line 610,col 13)-(line 610,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.serializeRealVector(org.apache.commons.math3.linear.RealVector, java.io.ObjectOutputStream)",
      "begin_line": 654,
      "end_line": 662,
      "comment": " Serialize a {@link RealVector}.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ewriteObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eoos.defaultWriteObject()\u003c/code\u003e) in a class that has a\n     * {@link RealVector} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not serialize the vector (the {@link\n     * RealVector} interface is not serializable by default) but this method does\n     * serialize it specifically.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The following example shows how a simple class with a name and a real vector\n     * should be written:\n     * \u003cpre\u003e\u003ccode\u003e\n     * public class NamedVector implements Serializable {\n     *\n     *     private final String name;\n     *     private final transient RealVector coefficients;\n     *\n     *     // omitted constructors, getters ...\n     *\n     *     private void writeObject(ObjectOutputStream oos) throws IOException {\n     *         oos.defaultWriteObject();  // takes care of name field\n     *         MatrixUtils.serializeRealVector(coefficients, oos);\n     *     }\n     *\n     *     private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {\n     *         ois.defaultReadObject();  // takes care of name field\n     *         MatrixUtils.deserializeRealVector(this, \"coefficients\", ois);\n     *     }\n     *\n     * }\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param vector real vector to serialize\n     * @param oos stream where the real vector should be written\n     * @exception IOException if object cannot be written to stream\n     * @see #deserializeRealVector(Object, String, ObjectInputStream)\n     ",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 44)",
        "(line 658,col 9)-(line 658,col 24)",
        "(line 659,col 9)-(line 661,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.deserializeRealVector(java.lang.Object, java.lang.String, java.io.ObjectInputStream)",
      "begin_line": 681,
      "end_line": 713,
      "comment": " Deserialize  a {@link RealVector} field in a class.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ereadObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eois.defaultReadObject()\u003c/code\u003e) in a class that has a\n     * {@link RealVector} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not deserialize the vector (the {@link\n     * RealVector} interface is not serializable by default) but this method does\n     * deserialize it specifically.\n     * \u003c/p\u003e\n     * @param instance instance in which the field must be set up\n     * @param fieldName name of the field within the class (may be private and final)\n     * @param ois stream from which the real vector should be read\n     * @exception ClassNotFoundException if a class in the stream cannot be found\n     * @exception IOException if object cannot be read from the stream\n     * @see #serializeRealVector(RealVector, ObjectOutputStream)\n     ",
      "child_ranges": [
        "(line 685,col 9)-(line 711,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.serializeRealMatrix(org.apache.commons.math3.linear.RealMatrix, java.io.ObjectOutputStream)",
      "begin_line": 755,
      "end_line": 767,
      "comment": " Serialize a {@link RealMatrix}.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ewriteObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eoos.defaultWriteObject()\u003c/code\u003e) in a class that has a\n     * {@link RealMatrix} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not serialize the matrix (the {@link\n     * RealMatrix} interface is not serializable by default) but this method does\n     * serialize it specifically.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The following example shows how a simple class with a name and a real matrix\n     * should be written:\n     * \u003cpre\u003e\u003ccode\u003e\n     * public class NamedMatrix implements Serializable {\n     *\n     *     private final String name;\n     *     private final transient RealMatrix coefficients;\n     *\n     *     // omitted constructors, getters ...\n     *\n     *     private void writeObject(ObjectOutputStream oos) throws IOException {\n     *         oos.defaultWriteObject();  // takes care of name field\n     *         MatrixUtils.serializeRealMatrix(coefficients, oos);\n     *     }\n     *\n     *     private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {\n     *         ois.defaultReadObject();  // takes care of name field\n     *         MatrixUtils.deserializeRealMatrix(this, \"coefficients\", ois);\n     *     }\n     *\n     * }\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param matrix real matrix to serialize\n     * @param oos stream where the real matrix should be written\n     * @exception IOException if object cannot be written to stream\n     * @see #deserializeRealMatrix(Object, String, ObjectInputStream)\n     ",
      "child_ranges": [
        "(line 758,col 9)-(line 758,col 47)",
        "(line 759,col 9)-(line 759,col 50)",
        "(line 760,col 9)-(line 760,col 24)",
        "(line 761,col 9)-(line 761,col 24)",
        "(line 762,col 9)-(line 766,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.deserializeRealMatrix(java.lang.Object, java.lang.String, java.io.ObjectInputStream)",
      "begin_line": 786,
      "end_line": 821,
      "comment": " Deserialize  a {@link RealMatrix} field in a class.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ereadObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eois.defaultReadObject()\u003c/code\u003e) in a class that has a\n     * {@link RealMatrix} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not deserialize the matrix (the {@link\n     * RealMatrix} interface is not serializable by default) but this method does\n     * deserialize it specifically.\n     * \u003c/p\u003e\n     * @param instance instance in which the field must be set up\n     * @param fieldName name of the field within the class (may be private and final)\n     * @param ois stream from which the real matrix should be read\n     * @exception ClassNotFoundException if a class in the stream cannot be found\n     * @exception IOException if object cannot be read from the stream\n     * @see #serializeRealMatrix(RealMatrix, ObjectOutputStream)\n     ",
      "child_ranges": [
        "(line 790,col 9)-(line 820,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.solveLowerTriangularSystem(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 838,
      "end_line": 861,
      "comment": "Solve  a  system of composed of a Lower Triangular Matrix\n     * {@link RealMatrix}.\n     * \u003cp\u003e\n     * This method is called to solve systems of equations which are\n     * of the lower triangular form. The matrix {@link RealMatrix}\n     * is assumed, though not checked, to be in lower triangular form.\n     * The vector {@link RealVector} is overwritten with the solution.\n     * The matrix is checked that it is square and its dimensions match\n     * the length of the vector.\n     * \u003c/p\u003e\n     * @param rm RealMatrix which is lower triangular\n     * @param b  RealVector this is overwritten\n     * @exception IllegalArgumentException if the matrix and vector are not conformable\n     * @exception ArithmeticException there is a zero or near zero on the diagonal of rm\n     ",
      "child_ranges": [
        "(line 839,col 9)-(line 843,col 9)",
        "(line 844,col 9)-(line 848,col 9)",
        "(line 849,col 9)-(line 849,col 40)",
        "(line 850,col 9)-(line 860,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.solveUpperTriangularSystem(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 878,
      "end_line": 901,
      "comment": " Solver a  system composed  of an Upper Triangular Matrix\n     * {@link RealMatrix}.\n     * \u003cp\u003e\n     * This method is called to solve systems of equations which are\n     * of the lower triangular form. The matrix {@link RealMatrix}\n     * is assumed, though not checked, to be in upper triangular form.\n     * The vector {@link RealVector} is overwritten with the solution.\n     * The matrix is checked that it is square and its dimensions match\n     * the length of the vector.\n     * \u003c/p\u003e\n     * @param rm RealMatrix which is upper triangular\n     * @param b  RealVector this is overwritten\n     * @exception IllegalArgumentException if the matrix and vector are not conformable\n     * @exception ArithmeticException there is a zero or near zero on the diagonal of rm\n     ",
      "child_ranges": [
        "(line 879,col 9)-(line 883,col 9)",
        "(line 884,col 9)-(line 888,col 9)",
        "(line 889,col 9)-(line 889,col 40)",
        "(line 890,col 9)-(line 900,col 9)"
      ]
    }
  ]
}