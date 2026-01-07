{
  "filepath": "/tmp/Math-59b/src/main/java/org/apache/commons/math/linear/MatrixUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MatrixUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 802,
      "comment": "\n * A collection of static methods that operate on or return matrices.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.MatrixUtils.MatrixUtils()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Private constructor.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealMatrix(int, int)",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * Returns a {@link RealMatrix} with specified dimensions.\n     * \u003cp\u003eThe type of matrix returned depends on the dimension. Below\n     * 2\u003csup\u003e12\u003c/sup\u003e elements (i.e. 4096 elements or 64\u0026times;64 for a\n     * square matrix) which can be stored in a 32kB array, a {@link\n     * Array2DRowRealMatrix} instance is built. Above this threshold a {@link\n     * BlockRealMatrix} instance is built.\u003c/p\u003e\n     * \u003cp\u003eThe matrix elements are all set to 0.0.\u003c/p\u003e\n     * @param rows number of rows of the matrix\n     * @param columns number of columns of the matrix\n     * @return  RealMatrix with specified dimensions\n     * @see #createRealMatrix(double[][])\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 67,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createFieldMatrix(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 85,
      "end_line": 90,
      "comment": "\n     * Returns a {@link FieldMatrix} with specified dimensions.\n     * \u003cp\u003eThe type of matrix returned depends on the dimension. Below\n     * 2\u003csup\u003e12\u003c/sup\u003e elements (i.e. 4096 elements or 64\u0026times;64 for a\n     * square matrix), a {@link FieldMatrix} instance is built. Above\n     * this threshold a {@link BlockFieldMatrix} instance is built.\u003c/p\u003e\n     * \u003cp\u003eThe matrix elements are all set to field.getZero().\u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param field field to which the matrix elements belong\n     * @param rows number of rows of the matrix\n     * @param columns number of columns of the matrix\n     * @return  FieldMatrix with specified dimensions\n     * @see #createFieldMatrix(FieldElement[][])\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 89,col 115)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealMatrix(double[][])",
      "begin_line": 111,
      "end_line": 118,
      "comment": "\n     * Returns a {@link RealMatrix} whose entries are the the values in the\n     * the input array.\n     * \u003cp\u003eThe type of matrix returned depends on the dimension. Below\n     * 2\u003csup\u003e12\u003c/sup\u003e elements (i.e. 4096 elements or 64\u0026times;64 for a\n     * square matrix) which can be stored in a 32kB array, a {@link\n     * Array2DRowRealMatrix} instance is built. Above this threshold a {@link\n     * BlockRealMatrix} instance is built.\u003c/p\u003e\n     * \u003cp\u003eThe input array is copied, not referenced.\u003c/p\u003e\n     *\n     * @param data input array\n     * @return  RealMatrix containing the values of the array\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code data} is not rectangular (not all rows have the same length).\n     * @throws NoDataException if a row or column is empty.\n     * @throws NullArgumentException if either {@code data} or {@code data[0]}\n     * is {@code null}.\n     * @see #createRealMatrix(int, int)\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 117,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createFieldMatrix(T[][])",
      "begin_line": 139,
      "end_line": 146,
      "comment": "\n     * Returns a {@link FieldMatrix} whose entries are the the values in the\n     * the input array.\n     * \u003cp\u003eThe type of matrix returned depends on the dimension. Below\n     * 2\u003csup\u003e12\u003c/sup\u003e elements (i.e. 4096 elements or 64\u0026times;64 for a\n     * square matrix), a {@link FieldMatrix} instance is built. Above\n     * this threshold a {@link BlockFieldMatrix} instance is built.\u003c/p\u003e\n     * \u003cp\u003eThe input array is copied, not referenced.\u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param data input array\n     * @return a matrix containing the values of the array.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code data} is not rectangular (not all rows have the same length).\n     * @throws NoDataException if a row or column is empty.\n     * @throws NullArgumentException if either {@code data} or {@code data[0]}\n     * is {@code null}.\n     * @see #createFieldMatrix(Field, int, int)\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 145,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix(int)",
      "begin_line": 156,
      "end_line": 162,
      "comment": "\n     * Returns \u003ccode\u003edimension x dimension\u003c/code\u003e identity matrix.\n     *\n     * @param dimension dimension of identity matrix to generate\n     * @return identity matrix\n     * @throws IllegalArgumentException if dimension is not positive\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 68)",
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createFieldIdentityMatrix(org.apache.commons.math.Field\u003cT\u003e, int)",
      "begin_line": 174,
      "end_line": 186,
      "comment": "\n     * Returns \u003ccode\u003edimension x dimension\u003c/code\u003e identity matrix.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param field field to which the elements belong\n     * @param dimension dimension of identity matrix to generate\n     * @return identity matrix\n     * @throws IllegalArgumentException if dimension is not positive\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 39)",
        "(line 177,col 9)-(line 177,col 38)",
        "(line 178,col 9)-(line 179,col 103)",
        "(line 180,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealDiagonalMatrix(double[])",
      "begin_line": 196,
      "end_line": 202,
      "comment": "\n     * Returns a diagonal matrix with specified elements.\n     *\n     * @param diagonal diagonal elements of the matrix (the array elements\n     * will be copied)\n     * @return diagonal matrix\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 80)",
        "(line 198,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 201,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createFieldDiagonalMatrix(T[])",
      "begin_line": 213,
      "end_line": 221,
      "comment": "\n     * Returns a diagonal matrix with specified elements.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param diagonal diagonal elements of the matrix (the array elements\n     * will be copied)\n     * @return diagonal matrix\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 216,col 88)",
        "(line 217,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealVector(double[])",
      "begin_line": 231,
      "end_line": 236,
      "comment": "\n     * Creates a {@link RealVector} using the data from the input array.\n     *\n     * @param data the input data\n     * @return a data.length RealVector\n     * @throws NoDataException if {@code data} is empty.\n     * @throws NullArgumentException if {@code data} is {@code null}.\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createFieldVector(T[])",
      "begin_line": 247,
      "end_line": 252,
      "comment": "\n     * Creates a {@link FieldVector} using the data from the input array.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param data the input data\n     * @return a data.length FieldVector\n     * @throws NoDataException if {@code data} is empty.\n     * @throws NullArgumentException if {@code data} is {@code null}.\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(double[])",
      "begin_line": 263,
      "end_line": 273,
      "comment": "\n     * Create a row {@link RealMatrix} using the data from the input\n     * array.\n     *\n     * @param rowData the input row data\n     * @return a 1 x rowData.length RealMatrix\n     * @throws NoDataException if {@code rowData} is empty.\n     * @throws NullArgumentException if {@code rowData} is {@code null}.\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 267,col 41)",
        "(line 268,col 9)-(line 268,col 56)",
        "(line 269,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 272,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRowFieldMatrix(T[])",
      "begin_line": 285,
      "end_line": 299,
      "comment": "\n     * Create a row {@link FieldMatrix} using the data from the input\n     * array.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param rowData the input row data\n     * @return a 1 x rowData.length FieldMatrix\n     * @throws NoDataException if {@code rowData} is empty.\n     * @throws NullArgumentException if {@code rowData} is {@code null}.\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 290,col 41)",
        "(line 291,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 294,col 84)",
        "(line 295,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 298,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(double[])",
      "begin_line": 310,
      "end_line": 320,
      "comment": "\n     * Creates a column {@link RealMatrix} using the data from the input\n     * array.\n     *\n     * @param columnData  the input column data\n     * @return a columnData x 1 RealMatrix\n     * @throws NoDataException if {@code columnData} is empty.\n     * @throws NullArgumentException if {@code columnData} is {@code null}.\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 314,col 44)",
        "(line 315,col 9)-(line 315,col 56)",
        "(line 316,col 9)-(line 318,col 9)",
        "(line 319,col 9)-(line 319,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createColumnFieldMatrix(T[])",
      "begin_line": 332,
      "end_line": 346,
      "comment": "\n     * Creates a column {@link FieldMatrix} using the data from the input\n     * array.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param columnData  the input column data\n     * @return a columnData x 1 FieldMatrix\n     * @throws NoDataException if {@code data} is empty.\n     * @throws NullArgumentException if {@code columnData} is {@code null}.\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 337,col 44)",
        "(line 338,col 9)-(line 340,col 9)",
        "(line 341,col 9)-(line 341,col 87)",
        "(line 342,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkMatrixIndex(org.apache.commons.math.linear.AnyMatrix, int, int)",
      "begin_line": 357,
      "end_line": 361,
      "comment": "\n     * Check if matrix indices are valid.\n     *\n     * @param m Matrix.\n     * @param row Row index to check.\n     * @param column Column index to check.\n     * @throws OutOfRangeException if {@code row} or {@code column} is not\n     * a valid index.\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 30)",
        "(line 360,col 9)-(line 360,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkRowIndex(org.apache.commons.math.linear.AnyMatrix, int)",
      "begin_line": 370,
      "end_line": 376,
      "comment": "\n     * Check if a row index is valid.\n     *\n     * @param m Matrix.\n     * @param row Row index to check.\n     * @throws OutOfRangeException if {@code row} is not a valid index.\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 375,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkColumnIndex(org.apache.commons.math.linear.AnyMatrix, int)",
      "begin_line": 385,
      "end_line": 390,
      "comment": "\n     * Check if a column index is valid.\n     *\n     * @param m Matrix.\n     * @param column Column index to check.\n     * @throws OutOfRangeException if {@code column} is not a valid index.\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 389,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math.linear.AnyMatrix, int, int, int, int)",
      "begin_line": 405,
      "end_line": 423,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to {@code n - 1}.\n     *\n     * @param m Matrix.\n     * @param startRow Initial row index.\n     * @param endRow Final row index.\n     * @param startColumn Initial column index.\n     * @param endColumn Final column index.\n     * @throws OutOfRangeException if the indices are invalid.\n     * @throws NumberIsTooSmallException if {@code endRow \u003c startRow} or\n     * {@code endColumn \u003c startColumn}.\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 35)",
        "(line 409,col 9)-(line 409,col 33)",
        "(line 410,col 9)-(line 413,col 9)",
        "(line 415,col 9)-(line 415,col 41)",
        "(line 416,col 9)-(line 416,col 39)",
        "(line 417,col 9)-(line 420,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math.linear.AnyMatrix, int[], int[])",
      "begin_line": 438,
      "end_line": 460,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param m Matrix.\n     * @param selectedRows Array of row indices.\n     * @param selectedColumns Array of column indices.\n     * @throws NullArgumentException if {@code selectedRows} or\n     * {@code selectedColumns} are {@code null}.\n     * @throws NoDataException if the row or column selections are empty (zero\n     * length).\n     * @throws OutOfRangeException if row or column selections are not valid.\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 446,col 9)",
        "(line 447,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 452,col 9)",
        "(line 454,col 9)-(line 456,col 9)",
        "(line 457,col 9)-(line 459,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkAdditionCompatible(org.apache.commons.math.linear.AnyMatrix, org.apache.commons.math.linear.AnyMatrix)",
      "begin_line": 469,
      "end_line": 475,
      "comment": "\n     * Check if matrices are addition compatible.\n     *\n     * @param left Left hand side matrix.\n     * @param right Right hand side matrix.\n     * @throws MatrixDimensionMismatchException if the matrices are not addition compatible.\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 474,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkSubtractionCompatible(org.apache.commons.math.linear.AnyMatrix, org.apache.commons.math.linear.AnyMatrix)",
      "begin_line": 484,
      "end_line": 490,
      "comment": "\n     * Check if matrices are subtraction compatible\n     *\n     * @param left Left hand side matrix.\n     * @param right Right hand side matrix.\n     * @throws MatrixDimensionMismatchException if the matrices are not addition compatible.\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 489,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkMultiplicationCompatible(org.apache.commons.math.linear.AnyMatrix, org.apache.commons.math.linear.AnyMatrix)",
      "begin_line": 499,
      "end_line": 504,
      "comment": "\n     * Check if matrices are multiplication compatible\n     *\n     * @param left Left hand side matrix.\n     * @param right Right hand side matrix.\n     * @throws DimensionMismatchException if matrices are not multiplication compatible.\n     ",
      "child_ranges": [
        "(line 500,col 9)-(line 503,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.fractionMatrixToRealMatrix(org.apache.commons.math.linear.FieldMatrix\u003corg.apache.commons.math.fraction.Fraction\u003e)",
      "begin_line": 511,
      "end_line": 515,
      "comment": "\n     * Convert a {@link FieldMatrix}/{@link Fraction} matrix to a {@link RealMatrix}.\n     * @param m Matrix to convert.\n     * @return the converted matrix.\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 80)",
        "(line 513,col 9)-(line 513,col 42)",
        "(line 514,col 9)-(line 514,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FractionMatrixConverter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DefaultFieldMatrixPreservingVisitor\u003corg.apache.commons.math.fraction.Fraction\u003e"
      ],
      "begin_line": 518,
      "end_line": 548,
      "comment": " Converter for {@link FieldMatrix}/{@link Fraction}. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 520,
      "end_line": 520,
      "comment": " Converted array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.MatrixUtils.FractionMatrixConverter.FractionMatrixConverter()",
      "begin_line": 522,
      "end_line": 524,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 523,col 13)-(line 523,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.FractionMatrixConverter.start(int, int, int, int, int, int)",
      "begin_line": 527,
      "end_line": 531,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 530,col 13)-(line 530,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.FractionMatrixConverter.visit(int, int, org.apache.commons.math.fraction.Fraction)",
      "begin_line": 534,
      "end_line": 537,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 536,col 13)-(line 536,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.FractionMatrixConverter.getConvertedMatrix()",
      "begin_line": 544,
      "end_line": 546,
      "comment": "\n         * Get the converted matrix.\n         *\n         * @return the converted matrix.\n         ",
      "child_ranges": [
        "(line 545,col 13)-(line 545,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.bigFractionMatrixToRealMatrix(org.apache.commons.math.linear.FieldMatrix\u003corg.apache.commons.math.fraction.BigFraction\u003e)",
      "begin_line": 556,
      "end_line": 560,
      "comment": "\n     * Convert a {@link FieldMatrix}/{@link BigFraction} matrix to a {@link RealMatrix}.\n     *\n     * @param m Matrix to convert.\n     * @return the converted matrix.\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 86)",
        "(line 558,col 9)-(line 558,col 42)",
        "(line 559,col 9)-(line 559,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BigFractionMatrixConverter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DefaultFieldMatrixPreservingVisitor\u003corg.apache.commons.math.fraction.BigFraction\u003e"
      ],
      "begin_line": 563,
      "end_line": 592,
      "comment": " Converter for {@link FieldMatrix}/{@link BigFraction}. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 565,
      "end_line": 565,
      "comment": " Converted array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.MatrixUtils.BigFractionMatrixConverter.BigFractionMatrixConverter()",
      "begin_line": 567,
      "end_line": 569,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 568,col 13)-(line 568,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.BigFractionMatrixConverter.start(int, int, int, int, int, int)",
      "begin_line": 572,
      "end_line": 576,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 575,col 13)-(line 575,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.BigFractionMatrixConverter.visit(int, int, org.apache.commons.math.fraction.BigFraction)",
      "begin_line": 579,
      "end_line": 582,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 581,col 13)-(line 581,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.BigFractionMatrixConverter.getConvertedMatrix()",
      "begin_line": 589,
      "end_line": 591,
      "comment": "\n         * Get the converted matrix.\n         *\n         * @return the converted matrix.\n         ",
      "child_ranges": [
        "(line 590,col 13)-(line 590,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.serializeRealVector(org.apache.commons.math.linear.RealVector, java.io.ObjectOutputStream)",
      "begin_line": 634,
      "end_line": 642,
      "comment": " Serialize a {@link RealVector}.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ewriteObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eoos.defaultWriteObject()\u003c/code\u003e) in a class that has a\n     * {@link RealVector} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not serialize the vector (the {@link\n     * RealVector} interface is not serializable by default) but this method does\n     * serialize it specifically.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The following example shows how a simple class with a name and a real vector\n     * should be written:\n     * \u003cpre\u003e\u003ccode\u003e\n     * public class NamedVector implements Serializable {\n     *\n     *     private final String name;\n     *     private final transient RealVector coefficients;\n     *\n     *     // omitted constructors, getters ...\n     *\n     *     private void writeObject(ObjectOutputStream oos) throws IOException {\n     *         oos.defaultWriteObject();  // takes care of name field\n     *         MatrixUtils.serializeRealVector(coefficients, oos);\n     *     }\n     *\n     *     private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {\n     *         ois.defaultReadObject();  // takes care of name field\n     *         MatrixUtils.deserializeRealVector(this, \"coefficients\", ois);\n     *     }\n     *\n     * }\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param vector real vector to serialize\n     * @param oos stream where the real vector should be written\n     * @exception IOException if object cannot be written to stream\n     * @see #deserializeRealVector(Object, String, ObjectInputStream)\n     ",
      "child_ranges": [
        "(line 637,col 9)-(line 637,col 44)",
        "(line 638,col 9)-(line 638,col 24)",
        "(line 639,col 9)-(line 641,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.deserializeRealVector(java.lang.Object, java.lang.String, java.io.ObjectInputStream)",
      "begin_line": 661,
      "end_line": 693,
      "comment": " Deserialize  a {@link RealVector} field in a class.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ereadObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eois.defaultReadObject()\u003c/code\u003e) in a class that has a\n     * {@link RealVector} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not deserialize the vector (the {@link\n     * RealVector} interface is not serializable by default) but this method does\n     * deserialize it specifically.\n     * \u003c/p\u003e\n     * @param instance instance in which the field must be set up\n     * @param fieldName name of the field within the class (may be private and final)\n     * @param ois stream from which the real vector should be read\n     * @exception ClassNotFoundException if a class in the stream cannot be found\n     * @exception IOException if object cannot be read from the stream\n     * @see #serializeRealVector(RealVector, ObjectOutputStream)\n     ",
      "child_ranges": [
        "(line 665,col 9)-(line 691,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.serializeRealMatrix(org.apache.commons.math.linear.RealMatrix, java.io.ObjectOutputStream)",
      "begin_line": 735,
      "end_line": 747,
      "comment": " Serialize a {@link RealMatrix}.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ewriteObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eoos.defaultWriteObject()\u003c/code\u003e) in a class that has a\n     * {@link RealMatrix} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not serialize the matrix (the {@link\n     * RealMatrix} interface is not serializable by default) but this method does\n     * serialize it specifically.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The following example shows how a simple class with a name and a real matrix\n     * should be written:\n     * \u003cpre\u003e\u003ccode\u003e\n     * public class NamedMatrix implements Serializable {\n     *\n     *     private final String name;\n     *     private final transient RealMatrix coefficients;\n     *\n     *     // omitted constructors, getters ...\n     *\n     *     private void writeObject(ObjectOutputStream oos) throws IOException {\n     *         oos.defaultWriteObject();  // takes care of name field\n     *         MatrixUtils.serializeRealMatrix(coefficients, oos);\n     *     }\n     *\n     *     private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {\n     *         ois.defaultReadObject();  // takes care of name field\n     *         MatrixUtils.deserializeRealMatrix(this, \"coefficients\", ois);\n     *     }\n     *\n     * }\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param matrix real matrix to serialize\n     * @param oos stream where the real matrix should be written\n     * @exception IOException if object cannot be written to stream\n     * @see #deserializeRealMatrix(Object, String, ObjectInputStream)\n     ",
      "child_ranges": [
        "(line 738,col 9)-(line 738,col 47)",
        "(line 739,col 9)-(line 739,col 50)",
        "(line 740,col 9)-(line 740,col 24)",
        "(line 741,col 9)-(line 741,col 24)",
        "(line 742,col 9)-(line 746,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.deserializeRealMatrix(java.lang.Object, java.lang.String, java.io.ObjectInputStream)",
      "begin_line": 766,
      "end_line": 801,
      "comment": " Deserialize  a {@link RealMatrix} field in a class.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ereadObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eois.defaultReadObject()\u003c/code\u003e) in a class that has a\n     * {@link RealMatrix} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not deserialize the matrix (the {@link\n     * RealMatrix} interface is not serializable by default) but this method does\n     * deserialize it specifically.\n     * \u003c/p\u003e\n     * @param instance instance in which the field must be set up\n     * @param fieldName name of the field within the class (may be private and final)\n     * @param ois stream from which the real matrix should be read\n     * @exception ClassNotFoundException if a class in the stream cannot be found\n     * @exception IOException if object cannot be read from the stream\n     * @see #serializeRealMatrix(RealMatrix, ObjectOutputStream)\n     ",
      "child_ranges": [
        "(line 770,col 9)-(line 800,col 9)"
      ]
    }
  ]
}