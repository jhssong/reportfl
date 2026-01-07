{
  "filepath": "/tmp/Math-54b/src/main/java/org/apache/commons/math/linear/MatrixUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MatrixUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 801,
      "comment": "\n * A collection of static methods that operate on or return matrices.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.MatrixUtils.MatrixUtils()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Private constructor.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealMatrix(int, int)",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * Returns a {@link RealMatrix} with specified dimensions.\n     * \u003cp\u003eThe type of matrix returned depends on the dimension. Below\n     * 2\u003csup\u003e12\u003c/sup\u003e elements (i.e. 4096 elements or 64\u0026times;64 for a\n     * square matrix) which can be stored in a 32kB array, a {@link\n     * Array2DRowRealMatrix} instance is built. Above this threshold a {@link\n     * BlockRealMatrix} instance is built.\u003c/p\u003e\n     * \u003cp\u003eThe matrix elements are all set to 0.0.\u003c/p\u003e\n     * @param rows number of rows of the matrix\n     * @param columns number of columns of the matrix\n     * @return  RealMatrix with specified dimensions\n     * @see #createRealMatrix(double[][])\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 66,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createFieldMatrix(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 84,
      "end_line": 89,
      "comment": "\n     * Returns a {@link FieldMatrix} with specified dimensions.\n     * \u003cp\u003eThe type of matrix returned depends on the dimension. Below\n     * 2\u003csup\u003e12\u003c/sup\u003e elements (i.e. 4096 elements or 64\u0026times;64 for a\n     * square matrix), a {@link FieldMatrix} instance is built. Above\n     * this threshold a {@link BlockFieldMatrix} instance is built.\u003c/p\u003e\n     * \u003cp\u003eThe matrix elements are all set to field.getZero().\u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param field field to which the matrix elements belong\n     * @param rows number of rows of the matrix\n     * @param columns number of columns of the matrix\n     * @return  FieldMatrix with specified dimensions\n     * @see #createFieldMatrix(FieldElement[][])\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 88,col 115)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealMatrix(double[][])",
      "begin_line": 110,
      "end_line": 117,
      "comment": "\n     * Returns a {@link RealMatrix} whose entries are the the values in the\n     * the input array.\n     * \u003cp\u003eThe type of matrix returned depends on the dimension. Below\n     * 2\u003csup\u003e12\u003c/sup\u003e elements (i.e. 4096 elements or 64\u0026times;64 for a\n     * square matrix) which can be stored in a 32kB array, a {@link\n     * Array2DRowRealMatrix} instance is built. Above this threshold a {@link\n     * BlockRealMatrix} instance is built.\u003c/p\u003e\n     * \u003cp\u003eThe input array is copied, not referenced.\u003c/p\u003e\n     *\n     * @param data input array\n     * @return  RealMatrix containing the values of the array\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code data} is not rectangular (not all rows have the same length).\n     * @throws NoDataException if a row or column is empty.\n     * @throws NullArgumentException if either {@code data} or {@code data[0]}\n     * is {@code null}.\n     * @see #createRealMatrix(int, int)\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 116,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createFieldMatrix(T[][])",
      "begin_line": 138,
      "end_line": 145,
      "comment": "\n     * Returns a {@link FieldMatrix} whose entries are the the values in the\n     * the input array.\n     * \u003cp\u003eThe type of matrix returned depends on the dimension. Below\n     * 2\u003csup\u003e12\u003c/sup\u003e elements (i.e. 4096 elements or 64\u0026times;64 for a\n     * square matrix), a {@link FieldMatrix} instance is built. Above\n     * this threshold a {@link BlockFieldMatrix} instance is built.\u003c/p\u003e\n     * \u003cp\u003eThe input array is copied, not referenced.\u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param data input array\n     * @return a matrix containing the values of the array.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code data} is not rectangular (not all rows have the same length).\n     * @throws NoDataException if a row or column is empty.\n     * @throws NullArgumentException if either {@code data} or {@code data[0]}\n     * is {@code null}.\n     * @see #createFieldMatrix(Field, int, int)\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 144,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix(int)",
      "begin_line": 155,
      "end_line": 161,
      "comment": "\n     * Returns \u003ccode\u003edimension x dimension\u003c/code\u003e identity matrix.\n     *\n     * @param dimension dimension of identity matrix to generate\n     * @return identity matrix\n     * @throws IllegalArgumentException if dimension is not positive\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 68)",
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createFieldIdentityMatrix(org.apache.commons.math.Field\u003cT\u003e, int)",
      "begin_line": 173,
      "end_line": 185,
      "comment": "\n     * Returns \u003ccode\u003edimension x dimension\u003c/code\u003e identity matrix.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param field field to which the elements belong\n     * @param dimension dimension of identity matrix to generate\n     * @return identity matrix\n     * @throws IllegalArgumentException if dimension is not positive\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 39)",
        "(line 176,col 9)-(line 176,col 38)",
        "(line 177,col 9)-(line 178,col 103)",
        "(line 179,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealDiagonalMatrix(double[])",
      "begin_line": 195,
      "end_line": 201,
      "comment": "\n     * Returns a diagonal matrix with specified elements.\n     *\n     * @param diagonal diagonal elements of the matrix (the array elements\n     * will be copied)\n     * @return diagonal matrix\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 80)",
        "(line 197,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 200,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createFieldDiagonalMatrix(T[])",
      "begin_line": 212,
      "end_line": 220,
      "comment": "\n     * Returns a diagonal matrix with specified elements.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param diagonal diagonal elements of the matrix (the array elements\n     * will be copied)\n     * @return diagonal matrix\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 215,col 88)",
        "(line 216,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 219,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealVector(double[])",
      "begin_line": 230,
      "end_line": 235,
      "comment": "\n     * Creates a {@link RealVector} using the data from the input array.\n     *\n     * @param data the input data\n     * @return a data.length RealVector\n     * @throws NoDataException if {@code data} is empty.\n     * @throws NullArgumentException if {@code data} is {@code null}.\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 234,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createFieldVector(T[])",
      "begin_line": 246,
      "end_line": 251,
      "comment": "\n     * Creates a {@link FieldVector} using the data from the input array.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param data the input data\n     * @return a data.length FieldVector\n     * @throws NoDataException if {@code data} is empty.\n     * @throws NullArgumentException if {@code data} is {@code null}.\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(double[])",
      "begin_line": 262,
      "end_line": 272,
      "comment": "\n     * Create a row {@link RealMatrix} using the data from the input\n     * array.\n     *\n     * @param rowData the input row data\n     * @return a 1 x rowData.length RealMatrix\n     * @throws NoDataException if {@code rowData} is empty.\n     * @throws NullArgumentException if {@code rowData} is {@code null}.\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 266,col 41)",
        "(line 267,col 9)-(line 267,col 56)",
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRowFieldMatrix(T[])",
      "begin_line": 284,
      "end_line": 298,
      "comment": "\n     * Create a row {@link FieldMatrix} using the data from the input\n     * array.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param rowData the input row data\n     * @return a 1 x rowData.length FieldMatrix\n     * @throws NoDataException if {@code rowData} is empty.\n     * @throws NullArgumentException if {@code rowData} is {@code null}.\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 289,col 41)",
        "(line 290,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 293,col 84)",
        "(line 294,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 297,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(double[])",
      "begin_line": 309,
      "end_line": 319,
      "comment": "\n     * Creates a column {@link RealMatrix} using the data from the input\n     * array.\n     *\n     * @param columnData  the input column data\n     * @return a columnData x 1 RealMatrix\n     * @throws NoDataException if {@code columnData} is empty.\n     * @throws NullArgumentException if {@code columnData} is {@code null}.\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 44)",
        "(line 314,col 9)-(line 314,col 56)",
        "(line 315,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 318,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createColumnFieldMatrix(T[])",
      "begin_line": 331,
      "end_line": 345,
      "comment": "\n     * Creates a column {@link FieldMatrix} using the data from the input\n     * array.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param columnData  the input column data\n     * @return a columnData x 1 FieldMatrix\n     * @throws NoDataException if {@code data} is empty.\n     * @throws NullArgumentException if {@code columnData} is {@code null}.\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 336,col 44)",
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 340,col 87)",
        "(line 341,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 344,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkMatrixIndex(org.apache.commons.math.linear.AnyMatrix, int, int)",
      "begin_line": 356,
      "end_line": 360,
      "comment": "\n     * Check if matrix indices are valid.\n     *\n     * @param m Matrix.\n     * @param row Row index to check.\n     * @param column Column index to check.\n     * @throws OutOfRangeException if {@code row} or {@code column} is not\n     * a valid index.\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 30)",
        "(line 359,col 9)-(line 359,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkRowIndex(org.apache.commons.math.linear.AnyMatrix, int)",
      "begin_line": 369,
      "end_line": 375,
      "comment": "\n     * Check if a row index is valid.\n     *\n     * @param m Matrix.\n     * @param row Row index to check.\n     * @throws OutOfRangeException if {@code row} is not a valid index.\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 374,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkColumnIndex(org.apache.commons.math.linear.AnyMatrix, int)",
      "begin_line": 384,
      "end_line": 389,
      "comment": "\n     * Check if a column index is valid.\n     *\n     * @param m Matrix.\n     * @param column Column index to check.\n     * @throws OutOfRangeException if {@code column} is not a valid index.\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 388,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math.linear.AnyMatrix, int, int, int, int)",
      "begin_line": 404,
      "end_line": 422,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to {@code n - 1}.\n     *\n     * @param m Matrix.\n     * @param startRow Initial row index.\n     * @param endRow Final row index.\n     * @param startColumn Initial column index.\n     * @param endColumn Final column index.\n     * @throws OutOfRangeException if the indices are invalid.\n     * @throws NumberIsTooSmallException if {@code endRow \u003c startRow} or\n     * {@code endColumn \u003c startColumn}.\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 35)",
        "(line 408,col 9)-(line 408,col 33)",
        "(line 409,col 9)-(line 412,col 9)",
        "(line 414,col 9)-(line 414,col 41)",
        "(line 415,col 9)-(line 415,col 39)",
        "(line 416,col 9)-(line 419,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math.linear.AnyMatrix, int[], int[])",
      "begin_line": 437,
      "end_line": 459,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param m Matrix.\n     * @param selectedRows Array of row indices.\n     * @param selectedColumns Array of column indices.\n     * @throws NullArgumentException if {@code selectedRows} or\n     * {@code selectedColumns} are {@code null}.\n     * @throws NoDataException if the row or column selections are empty (zero\n     * length).\n     * @throws OutOfRangeException if row or column selections are not valid.\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 442,col 9)",
        "(line 443,col 9)-(line 445,col 9)",
        "(line 446,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 451,col 9)",
        "(line 453,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 458,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkAdditionCompatible(org.apache.commons.math.linear.AnyMatrix, org.apache.commons.math.linear.AnyMatrix)",
      "begin_line": 468,
      "end_line": 474,
      "comment": "\n     * Check if matrices are addition compatible.\n     *\n     * @param left Left hand side matrix.\n     * @param right Right hand side matrix.\n     * @throws MatrixDimensionMismatchException if the matrices are not addition compatible.\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 473,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkSubtractionCompatible(org.apache.commons.math.linear.AnyMatrix, org.apache.commons.math.linear.AnyMatrix)",
      "begin_line": 483,
      "end_line": 489,
      "comment": "\n     * Check if matrices are subtraction compatible\n     *\n     * @param left Left hand side matrix.\n     * @param right Right hand side matrix.\n     * @throws MatrixDimensionMismatchException if the matrices are not addition compatible.\n     ",
      "child_ranges": [
        "(line 484,col 9)-(line 488,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkMultiplicationCompatible(org.apache.commons.math.linear.AnyMatrix, org.apache.commons.math.linear.AnyMatrix)",
      "begin_line": 498,
      "end_line": 503,
      "comment": "\n     * Check if matrices are multiplication compatible\n     *\n     * @param left Left hand side matrix.\n     * @param right Right hand side matrix.\n     * @throws DimensionMismatchException if matrices are not multiplication compatible.\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 502,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.fractionMatrixToRealMatrix(org.apache.commons.math.linear.FieldMatrix\u003corg.apache.commons.math.fraction.Fraction\u003e)",
      "begin_line": 510,
      "end_line": 514,
      "comment": "\n     * Convert a {@link FieldMatrix}/{@link Fraction} matrix to a {@link RealMatrix}.\n     * @param m Matrix to convert.\n     * @return the converted matrix.\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 80)",
        "(line 512,col 9)-(line 512,col 42)",
        "(line 513,col 9)-(line 513,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FractionMatrixConverter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DefaultFieldMatrixPreservingVisitor\u003corg.apache.commons.math.fraction.Fraction\u003e"
      ],
      "begin_line": 517,
      "end_line": 547,
      "comment": " Converter for {@link FieldMatrix}/{@link Fraction}. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 519,
      "end_line": 519,
      "comment": " Converted array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.MatrixUtils.FractionMatrixConverter.FractionMatrixConverter()",
      "begin_line": 521,
      "end_line": 523,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 522,col 13)-(line 522,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.FractionMatrixConverter.start(int, int, int, int, int, int)",
      "begin_line": 526,
      "end_line": 530,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 529,col 13)-(line 529,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.FractionMatrixConverter.visit(int, int, org.apache.commons.math.fraction.Fraction)",
      "begin_line": 533,
      "end_line": 536,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 535,col 13)-(line 535,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.FractionMatrixConverter.getConvertedMatrix()",
      "begin_line": 543,
      "end_line": 545,
      "comment": "\n         * Get the converted matrix.\n         *\n         * @return the converted matrix.\n         ",
      "child_ranges": [
        "(line 544,col 13)-(line 544,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.bigFractionMatrixToRealMatrix(org.apache.commons.math.linear.FieldMatrix\u003corg.apache.commons.math.fraction.BigFraction\u003e)",
      "begin_line": 555,
      "end_line": 559,
      "comment": "\n     * Convert a {@link FieldMatrix}/{@link BigFraction} matrix to a {@link RealMatrix}.\n     *\n     * @param m Matrix to convert.\n     * @return the converted matrix.\n     ",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 86)",
        "(line 557,col 9)-(line 557,col 42)",
        "(line 558,col 9)-(line 558,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BigFractionMatrixConverter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DefaultFieldMatrixPreservingVisitor\u003corg.apache.commons.math.fraction.BigFraction\u003e"
      ],
      "begin_line": 562,
      "end_line": 591,
      "comment": " Converter for {@link FieldMatrix}/{@link BigFraction}. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 564,
      "end_line": 564,
      "comment": " Converted array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.MatrixUtils.BigFractionMatrixConverter.BigFractionMatrixConverter()",
      "begin_line": 566,
      "end_line": 568,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 567,col 13)-(line 567,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.BigFractionMatrixConverter.start(int, int, int, int, int, int)",
      "begin_line": 571,
      "end_line": 575,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 574,col 13)-(line 574,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.BigFractionMatrixConverter.visit(int, int, org.apache.commons.math.fraction.BigFraction)",
      "begin_line": 578,
      "end_line": 581,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 580,col 13)-(line 580,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.BigFractionMatrixConverter.getConvertedMatrix()",
      "begin_line": 588,
      "end_line": 590,
      "comment": "\n         * Get the converted matrix.\n         *\n         * @return the converted matrix.\n         ",
      "child_ranges": [
        "(line 589,col 13)-(line 589,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.serializeRealVector(org.apache.commons.math.linear.RealVector, java.io.ObjectOutputStream)",
      "begin_line": 633,
      "end_line": 641,
      "comment": " Serialize a {@link RealVector}.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ewriteObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eoos.defaultWriteObject()\u003c/code\u003e) in a class that has a\n     * {@link RealVector} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not serialize the vector (the {@link\n     * RealVector} interface is not serializable by default) but this method does\n     * serialize it specifically.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The following example shows how a simple class with a name and a real vector\n     * should be written:\n     * \u003cpre\u003e\u003ccode\u003e\n     * public class NamedVector implements Serializable {\n     *\n     *     private final String name;\n     *     private final transient RealVector coefficients;\n     *\n     *     // omitted constructors, getters ...\n     *\n     *     private void writeObject(ObjectOutputStream oos) throws IOException {\n     *         oos.defaultWriteObject();  // takes care of name field\n     *         MatrixUtils.serializeRealVector(coefficients, oos);\n     *     }\n     *\n     *     private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {\n     *         ois.defaultReadObject();  // takes care of name field\n     *         MatrixUtils.deserializeRealVector(this, \"coefficients\", ois);\n     *     }\n     *\n     * }\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param vector real vector to serialize\n     * @param oos stream where the real vector should be written\n     * @exception IOException if object cannot be written to stream\n     * @see #deserializeRealVector(Object, String, ObjectInputStream)\n     ",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 44)",
        "(line 637,col 9)-(line 637,col 24)",
        "(line 638,col 9)-(line 640,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.deserializeRealVector(java.lang.Object, java.lang.String, java.io.ObjectInputStream)",
      "begin_line": 660,
      "end_line": 692,
      "comment": " Deserialize  a {@link RealVector} field in a class.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ereadObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eois.defaultReadObject()\u003c/code\u003e) in a class that has a\n     * {@link RealVector} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not deserialize the vector (the {@link\n     * RealVector} interface is not serializable by default) but this method does\n     * deserialize it specifically.\n     * \u003c/p\u003e\n     * @param instance instance in which the field must be set up\n     * @param fieldName name of the field within the class (may be private and final)\n     * @param ois stream from which the real vector should be read\n     * @exception ClassNotFoundException if a class in the stream cannot be found\n     * @exception IOException if object cannot be read from the stream\n     * @see #serializeRealVector(RealVector, ObjectOutputStream)\n     ",
      "child_ranges": [
        "(line 664,col 9)-(line 690,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.serializeRealMatrix(org.apache.commons.math.linear.RealMatrix, java.io.ObjectOutputStream)",
      "begin_line": 734,
      "end_line": 746,
      "comment": " Serialize a {@link RealMatrix}.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ewriteObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eoos.defaultWriteObject()\u003c/code\u003e) in a class that has a\n     * {@link RealMatrix} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not serialize the matrix (the {@link\n     * RealMatrix} interface is not serializable by default) but this method does\n     * serialize it specifically.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The following example shows how a simple class with a name and a real matrix\n     * should be written:\n     * \u003cpre\u003e\u003ccode\u003e\n     * public class NamedMatrix implements Serializable {\n     *\n     *     private final String name;\n     *     private final transient RealMatrix coefficients;\n     *\n     *     // omitted constructors, getters ...\n     *\n     *     private void writeObject(ObjectOutputStream oos) throws IOException {\n     *         oos.defaultWriteObject();  // takes care of name field\n     *         MatrixUtils.serializeRealMatrix(coefficients, oos);\n     *     }\n     *\n     *     private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {\n     *         ois.defaultReadObject();  // takes care of name field\n     *         MatrixUtils.deserializeRealMatrix(this, \"coefficients\", ois);\n     *     }\n     *\n     * }\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param matrix real matrix to serialize\n     * @param oos stream where the real matrix should be written\n     * @exception IOException if object cannot be written to stream\n     * @see #deserializeRealMatrix(Object, String, ObjectInputStream)\n     ",
      "child_ranges": [
        "(line 737,col 9)-(line 737,col 47)",
        "(line 738,col 9)-(line 738,col 50)",
        "(line 739,col 9)-(line 739,col 24)",
        "(line 740,col 9)-(line 740,col 24)",
        "(line 741,col 9)-(line 745,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.deserializeRealMatrix(java.lang.Object, java.lang.String, java.io.ObjectInputStream)",
      "begin_line": 765,
      "end_line": 800,
      "comment": " Deserialize  a {@link RealMatrix} field in a class.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ereadObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eois.defaultReadObject()\u003c/code\u003e) in a class that has a\n     * {@link RealMatrix} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not deserialize the matrix (the {@link\n     * RealMatrix} interface is not serializable by default) but this method does\n     * deserialize it specifically.\n     * \u003c/p\u003e\n     * @param instance instance in which the field must be set up\n     * @param fieldName name of the field within the class (may be private and final)\n     * @param ois stream from which the real matrix should be read\n     * @exception ClassNotFoundException if a class in the stream cannot be found\n     * @exception IOException if object cannot be read from the stream\n     * @see #serializeRealMatrix(RealMatrix, ObjectOutputStream)\n     ",
      "child_ranges": [
        "(line 769,col 9)-(line 799,col 9)"
      ]
    }
  ]
}