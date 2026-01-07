{
  "filepath": "/tmp/Math-33b/src/main/java/org/apache/commons/math3/linear/MatrixUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MatrixUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 47,
      "end_line": 890,
      "comment": "\n * A collection of static methods that operate on or return matrices.\n *\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.MatrixUtils()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Private constructor.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(int, int)",
      "begin_line": 69,
      "end_line": 72,
      "comment": "\n     * Returns a {@link RealMatrix} with specified dimensions.\n     * \u003cp\u003eThe type of matrix returned depends on the dimension. Below\n     * 2\u003csup\u003e12\u003c/sup\u003e elements (i.e. 4096 elements or 64\u0026times;64 for a\n     * square matrix) which can be stored in a 32kB array, a {@link\n     * Array2DRowRealMatrix} instance is built. Above this threshold a {@link\n     * BlockRealMatrix} instance is built.\u003c/p\u003e\n     * \u003cp\u003eThe matrix elements are all set to 0.0.\u003c/p\u003e\n     * @param rows number of rows of the matrix\n     * @param columns number of columns of the matrix\n     * @return  RealMatrix with specified dimensions\n     * @see #createRealMatrix(double[][])\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 71,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createFieldMatrix(org.apache.commons.math3.Field\u003cT\u003e, int, int)",
      "begin_line": 89,
      "end_line": 94,
      "comment": "\n     * Returns a {@link FieldMatrix} with specified dimensions.\n     * \u003cp\u003eThe type of matrix returned depends on the dimension. Below\n     * 2\u003csup\u003e12\u003c/sup\u003e elements (i.e. 4096 elements or 64\u0026times;64 for a\n     * square matrix), a {@link FieldMatrix} instance is built. Above\n     * this threshold a {@link BlockFieldMatrix} instance is built.\u003c/p\u003e\n     * \u003cp\u003eThe matrix elements are all set to field.getZero().\u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param field field to which the matrix elements belong\n     * @param rows number of rows of the matrix\n     * @param columns number of columns of the matrix\n     * @return  FieldMatrix with specified dimensions\n     * @see #createFieldMatrix(FieldElement[][])\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 93,col 115)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(double[][])",
      "begin_line": 115,
      "end_line": 122,
      "comment": "\n     * Returns a {@link RealMatrix} whose entries are the the values in the\n     * the input array.\n     * \u003cp\u003eThe type of matrix returned depends on the dimension. Below\n     * 2\u003csup\u003e12\u003c/sup\u003e elements (i.e. 4096 elements or 64\u0026times;64 for a\n     * square matrix) which can be stored in a 32kB array, a {@link\n     * Array2DRowRealMatrix} instance is built. Above this threshold a {@link\n     * BlockRealMatrix} instance is built.\u003c/p\u003e\n     * \u003cp\u003eThe input array is copied, not referenced.\u003c/p\u003e\n     *\n     * @param data input array\n     * @return  RealMatrix containing the values of the array\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code data} is not rectangular (not all rows have the same length).\n     * @throws NoDataException if a row or column is empty.\n     * @throws NullArgumentException if either {@code data} or {@code data[0]}\n     * is {@code null}.\n     * @see #createRealMatrix(int, int)\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 121,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createFieldMatrix(T[][])",
      "begin_line": 143,
      "end_line": 150,
      "comment": "\n     * Returns a {@link FieldMatrix} whose entries are the the values in the\n     * the input array.\n     * \u003cp\u003eThe type of matrix returned depends on the dimension. Below\n     * 2\u003csup\u003e12\u003c/sup\u003e elements (i.e. 4096 elements or 64\u0026times;64 for a\n     * square matrix), a {@link FieldMatrix} instance is built. Above\n     * this threshold a {@link BlockFieldMatrix} instance is built.\u003c/p\u003e\n     * \u003cp\u003eThe input array is copied, not referenced.\u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param data input array\n     * @return a matrix containing the values of the array.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if {@code data} is not rectangular (not all rows have the same length).\n     * @throws NoDataException if a row or column is empty.\n     * @throws NullArgumentException if either {@code data} or {@code data[0]}\n     * is {@code null}.\n     * @see #createFieldMatrix(Field, int, int)\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 149,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createRealIdentityMatrix(int)",
      "begin_line": 160,
      "end_line": 166,
      "comment": "\n     * Returns \u003ccode\u003edimension x dimension\u003c/code\u003e identity matrix.\n     *\n     * @param dimension dimension of identity matrix to generate\n     * @return identity matrix\n     * @throws IllegalArgumentException if dimension is not positive\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 68)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createFieldIdentityMatrix(org.apache.commons.math3.Field\u003cT\u003e, int)",
      "begin_line": 178,
      "end_line": 190,
      "comment": "\n     * Returns \u003ccode\u003edimension x dimension\u003c/code\u003e identity matrix.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param field field to which the elements belong\n     * @param dimension dimension of identity matrix to generate\n     * @return identity matrix\n     * @throws IllegalArgumentException if dimension is not positive\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 39)",
        "(line 181,col 9)-(line 181,col 38)",
        "(line 182,col 9)-(line 183,col 111)",
        "(line 184,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createRealDiagonalMatrix(double[])",
      "begin_line": 200,
      "end_line": 206,
      "comment": "\n     * Returns a diagonal matrix with specified elements.\n     *\n     * @param diagonal diagonal elements of the matrix (the array elements\n     * will be copied)\n     * @return diagonal matrix\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 80)",
        "(line 202,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 205,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createFieldDiagonalMatrix(T[])",
      "begin_line": 217,
      "end_line": 225,
      "comment": "\n     * Returns a diagonal matrix with specified elements.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param diagonal diagonal elements of the matrix (the array elements\n     * will be copied)\n     * @return diagonal matrix\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 220,col 88)",
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createRealVector(double[])",
      "begin_line": 235,
      "end_line": 240,
      "comment": "\n     * Creates a {@link RealVector} using the data from the input array.\n     *\n     * @param data the input data\n     * @return a data.length RealVector\n     * @throws NoDataException if {@code data} is empty.\n     * @throws NullArgumentException if {@code data} is {@code null}.\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createFieldVector(T[])",
      "begin_line": 252,
      "end_line": 260,
      "comment": "\n     * Creates a {@link FieldVector} using the data from the input array.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param data the input data\n     * @return a data.length FieldVector\n     * @throws NoDataException if {@code data} is empty.\n     * @throws NullArgumentException if {@code data} is {@code null}.\n     * @throws ZeroException if {@code data} has 0 elements\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createRowRealMatrix(double[])",
      "begin_line": 271,
      "end_line": 281,
      "comment": "\n     * Create a row {@link RealMatrix} using the data from the input\n     * array.\n     *\n     * @param rowData the input row data\n     * @return a 1 x rowData.length RealMatrix\n     * @throws NoDataException if {@code rowData} is empty.\n     * @throws NullArgumentException if {@code rowData} is {@code null}.\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 41)",
        "(line 276,col 9)-(line 276,col 56)",
        "(line 277,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createRowFieldMatrix(T[])",
      "begin_line": 293,
      "end_line": 307,
      "comment": "\n     * Create a row {@link FieldMatrix} using the data from the input\n     * array.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param rowData the input row data\n     * @return a 1 x rowData.length FieldMatrix\n     * @throws NoDataException if {@code rowData} is empty.\n     * @throws NullArgumentException if {@code rowData} is {@code null}.\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 298,col 41)",
        "(line 299,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 84)",
        "(line 303,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 306,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createColumnRealMatrix(double[])",
      "begin_line": 318,
      "end_line": 328,
      "comment": "\n     * Creates a column {@link RealMatrix} using the data from the input\n     * array.\n     *\n     * @param columnData  the input column data\n     * @return a columnData x 1 RealMatrix\n     * @throws NoDataException if {@code columnData} is empty.\n     * @throws NullArgumentException if {@code columnData} is {@code null}.\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 322,col 44)",
        "(line 323,col 9)-(line 323,col 56)",
        "(line 324,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 327,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.createColumnFieldMatrix(T[])",
      "begin_line": 340,
      "end_line": 354,
      "comment": "\n     * Creates a column {@link FieldMatrix} using the data from the input\n     * array.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param columnData  the input column data\n     * @return a columnData x 1 FieldMatrix\n     * @throws NoDataException if {@code data} is empty.\n     * @throws NullArgumentException if {@code columnData} is {@code null}.\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 44)",
        "(line 346,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 349,col 87)",
        "(line 350,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 353,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkMatrixIndex(org.apache.commons.math3.linear.AnyMatrix, int, int)",
      "begin_line": 365,
      "end_line": 369,
      "comment": "\n     * Check if matrix indices are valid.\n     *\n     * @param m Matrix.\n     * @param row Row index to check.\n     * @param column Column index to check.\n     * @throws OutOfRangeException if {@code row} or {@code column} is not\n     * a valid index.\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 30)",
        "(line 368,col 9)-(line 368,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkRowIndex(org.apache.commons.math3.linear.AnyMatrix, int)",
      "begin_line": 378,
      "end_line": 384,
      "comment": "\n     * Check if a row index is valid.\n     *\n     * @param m Matrix.\n     * @param row Row index to check.\n     * @throws OutOfRangeException if {@code row} is not a valid index.\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 383,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkColumnIndex(org.apache.commons.math3.linear.AnyMatrix, int)",
      "begin_line": 393,
      "end_line": 398,
      "comment": "\n     * Check if a column index is valid.\n     *\n     * @param m Matrix.\n     * @param column Column index to check.\n     * @throws OutOfRangeException if {@code column} is not a valid index.\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 397,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math3.linear.AnyMatrix, int, int, int, int)",
      "begin_line": 413,
      "end_line": 431,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to {@code n - 1}.\n     *\n     * @param m Matrix.\n     * @param startRow Initial row index.\n     * @param endRow Final row index.\n     * @param startColumn Initial column index.\n     * @param endColumn Final column index.\n     * @throws OutOfRangeException if the indices are invalid.\n     * @throws NumberIsTooSmallException if {@code endRow \u003c startRow} or\n     * {@code endColumn \u003c startColumn}.\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 35)",
        "(line 417,col 9)-(line 417,col 33)",
        "(line 418,col 9)-(line 421,col 9)",
        "(line 423,col 9)-(line 423,col 41)",
        "(line 424,col 9)-(line 424,col 39)",
        "(line 425,col 9)-(line 428,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math3.linear.AnyMatrix, int[], int[])",
      "begin_line": 446,
      "end_line": 468,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param m Matrix.\n     * @param selectedRows Array of row indices.\n     * @param selectedColumns Array of column indices.\n     * @throws NullArgumentException if {@code selectedRows} or\n     * {@code selectedColumns} are {@code null}.\n     * @throws NoDataException if the row or column selections are empty (zero\n     * length).\n     * @throws OutOfRangeException if row or column selections are not valid.\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 454,col 9)",
        "(line 455,col 9)-(line 457,col 9)",
        "(line 458,col 9)-(line 460,col 9)",
        "(line 462,col 9)-(line 464,col 9)",
        "(line 465,col 9)-(line 467,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkAdditionCompatible(org.apache.commons.math3.linear.AnyMatrix, org.apache.commons.math3.linear.AnyMatrix)",
      "begin_line": 477,
      "end_line": 483,
      "comment": "\n     * Check if matrices are addition compatible.\n     *\n     * @param left Left hand side matrix.\n     * @param right Right hand side matrix.\n     * @throws MatrixDimensionMismatchException if the matrices are not addition compatible.\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 482,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkSubtractionCompatible(org.apache.commons.math3.linear.AnyMatrix, org.apache.commons.math3.linear.AnyMatrix)",
      "begin_line": 492,
      "end_line": 498,
      "comment": "\n     * Check if matrices are subtraction compatible\n     *\n     * @param left Left hand side matrix.\n     * @param right Right hand side matrix.\n     * @throws MatrixDimensionMismatchException if the matrices are not addition compatible.\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 497,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.checkMultiplicationCompatible(org.apache.commons.math3.linear.AnyMatrix, org.apache.commons.math3.linear.AnyMatrix)",
      "begin_line": 507,
      "end_line": 512,
      "comment": "\n     * Check if matrices are multiplication compatible\n     *\n     * @param left Left hand side matrix.\n     * @param right Right hand side matrix.\n     * @throws DimensionMismatchException if matrices are not multiplication compatible.\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 511,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.fractionMatrixToRealMatrix(org.apache.commons.math3.linear.FieldMatrix\u003corg.apache.commons.math3.fraction.Fraction\u003e)",
      "begin_line": 519,
      "end_line": 523,
      "comment": "\n     * Convert a {@link FieldMatrix}/{@link Fraction} matrix to a {@link RealMatrix}.\n     * @param m Matrix to convert.\n     * @return the converted matrix.\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 80)",
        "(line 521,col 9)-(line 521,col 42)",
        "(line 522,col 9)-(line 522,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FractionMatrixConverter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.DefaultFieldMatrixPreservingVisitor\u003corg.apache.commons.math3.fraction.Fraction\u003e"
      ],
      "begin_line": 526,
      "end_line": 556,
      "comment": " Converter for {@link FieldMatrix}/{@link Fraction}. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 528,
      "end_line": 528,
      "comment": " Converted array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.FractionMatrixConverter.FractionMatrixConverter()",
      "begin_line": 530,
      "end_line": 532,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 531,col 13)-(line 531,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.FractionMatrixConverter.start(int, int, int, int, int, int)",
      "begin_line": 535,
      "end_line": 539,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 538,col 13)-(line 538,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.FractionMatrixConverter.visit(int, int, org.apache.commons.math3.fraction.Fraction)",
      "begin_line": 542,
      "end_line": 545,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 544,col 13)-(line 544,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.FractionMatrixConverter.getConvertedMatrix()",
      "begin_line": 552,
      "end_line": 554,
      "comment": "\n         * Get the converted matrix.\n         *\n         * @return the converted matrix.\n         ",
      "child_ranges": [
        "(line 553,col 13)-(line 553,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.bigFractionMatrixToRealMatrix(org.apache.commons.math3.linear.FieldMatrix\u003corg.apache.commons.math3.fraction.BigFraction\u003e)",
      "begin_line": 564,
      "end_line": 568,
      "comment": "\n     * Convert a {@link FieldMatrix}/{@link BigFraction} matrix to a {@link RealMatrix}.\n     *\n     * @param m Matrix to convert.\n     * @return the converted matrix.\n     ",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 86)",
        "(line 566,col 9)-(line 566,col 42)",
        "(line 567,col 9)-(line 567,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BigFractionMatrixConverter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.DefaultFieldMatrixPreservingVisitor\u003corg.apache.commons.math3.fraction.BigFraction\u003e"
      ],
      "begin_line": 571,
      "end_line": 600,
      "comment": " Converter for {@link FieldMatrix}/{@link BigFraction}. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 573,
      "end_line": 573,
      "comment": " Converted array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.BigFractionMatrixConverter.BigFractionMatrixConverter()",
      "begin_line": 575,
      "end_line": 577,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 576,col 13)-(line 576,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.BigFractionMatrixConverter.start(int, int, int, int, int, int)",
      "begin_line": 580,
      "end_line": 584,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 583,col 13)-(line 583,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.BigFractionMatrixConverter.visit(int, int, org.apache.commons.math3.fraction.BigFraction)",
      "begin_line": 587,
      "end_line": 590,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 589,col 13)-(line 589,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.BigFractionMatrixConverter.getConvertedMatrix()",
      "begin_line": 597,
      "end_line": 599,
      "comment": "\n         * Get the converted matrix.\n         *\n         * @return the converted matrix.\n         ",
      "child_ranges": [
        "(line 598,col 13)-(line 598,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.serializeRealVector(org.apache.commons.math3.linear.RealVector, java.io.ObjectOutputStream)",
      "begin_line": 642,
      "end_line": 650,
      "comment": " Serialize a {@link RealVector}.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ewriteObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eoos.defaultWriteObject()\u003c/code\u003e) in a class that has a\n     * {@link RealVector} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not serialize the vector (the {@link\n     * RealVector} interface is not serializable by default) but this method does\n     * serialize it specifically.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The following example shows how a simple class with a name and a real vector\n     * should be written:\n     * \u003cpre\u003e\u003ccode\u003e\n     * public class NamedVector implements Serializable {\n     *\n     *     private final String name;\n     *     private final transient RealVector coefficients;\n     *\n     *     // omitted constructors, getters ...\n     *\n     *     private void writeObject(ObjectOutputStream oos) throws IOException {\n     *         oos.defaultWriteObject();  // takes care of name field\n     *         MatrixUtils.serializeRealVector(coefficients, oos);\n     *     }\n     *\n     *     private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {\n     *         ois.defaultReadObject();  // takes care of name field\n     *         MatrixUtils.deserializeRealVector(this, \"coefficients\", ois);\n     *     }\n     *\n     * }\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param vector real vector to serialize\n     * @param oos stream where the real vector should be written\n     * @exception IOException if object cannot be written to stream\n     * @see #deserializeRealVector(Object, String, ObjectInputStream)\n     ",
      "child_ranges": [
        "(line 645,col 9)-(line 645,col 44)",
        "(line 646,col 9)-(line 646,col 24)",
        "(line 647,col 9)-(line 649,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.deserializeRealVector(java.lang.Object, java.lang.String, java.io.ObjectInputStream)",
      "begin_line": 669,
      "end_line": 701,
      "comment": " Deserialize  a {@link RealVector} field in a class.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ereadObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eois.defaultReadObject()\u003c/code\u003e) in a class that has a\n     * {@link RealVector} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not deserialize the vector (the {@link\n     * RealVector} interface is not serializable by default) but this method does\n     * deserialize it specifically.\n     * \u003c/p\u003e\n     * @param instance instance in which the field must be set up\n     * @param fieldName name of the field within the class (may be private and final)\n     * @param ois stream from which the real vector should be read\n     * @exception ClassNotFoundException if a class in the stream cannot be found\n     * @exception IOException if object cannot be read from the stream\n     * @see #serializeRealVector(RealVector, ObjectOutputStream)\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 699,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.serializeRealMatrix(org.apache.commons.math3.linear.RealMatrix, java.io.ObjectOutputStream)",
      "begin_line": 743,
      "end_line": 755,
      "comment": " Serialize a {@link RealMatrix}.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ewriteObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eoos.defaultWriteObject()\u003c/code\u003e) in a class that has a\n     * {@link RealMatrix} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not serialize the matrix (the {@link\n     * RealMatrix} interface is not serializable by default) but this method does\n     * serialize it specifically.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The following example shows how a simple class with a name and a real matrix\n     * should be written:\n     * \u003cpre\u003e\u003ccode\u003e\n     * public class NamedMatrix implements Serializable {\n     *\n     *     private final String name;\n     *     private final transient RealMatrix coefficients;\n     *\n     *     // omitted constructors, getters ...\n     *\n     *     private void writeObject(ObjectOutputStream oos) throws IOException {\n     *         oos.defaultWriteObject();  // takes care of name field\n     *         MatrixUtils.serializeRealMatrix(coefficients, oos);\n     *     }\n     *\n     *     private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {\n     *         ois.defaultReadObject();  // takes care of name field\n     *         MatrixUtils.deserializeRealMatrix(this, \"coefficients\", ois);\n     *     }\n     *\n     * }\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param matrix real matrix to serialize\n     * @param oos stream where the real matrix should be written\n     * @exception IOException if object cannot be written to stream\n     * @see #deserializeRealMatrix(Object, String, ObjectInputStream)\n     ",
      "child_ranges": [
        "(line 746,col 9)-(line 746,col 47)",
        "(line 747,col 9)-(line 747,col 50)",
        "(line 748,col 9)-(line 748,col 24)",
        "(line 749,col 9)-(line 749,col 24)",
        "(line 750,col 9)-(line 754,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.deserializeRealMatrix(java.lang.Object, java.lang.String, java.io.ObjectInputStream)",
      "begin_line": 774,
      "end_line": 809,
      "comment": " Deserialize  a {@link RealMatrix} field in a class.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ereadObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eois.defaultReadObject()\u003c/code\u003e) in a class that has a\n     * {@link RealMatrix} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not deserialize the matrix (the {@link\n     * RealMatrix} interface is not serializable by default) but this method does\n     * deserialize it specifically.\n     * \u003c/p\u003e\n     * @param instance instance in which the field must be set up\n     * @param fieldName name of the field within the class (may be private and final)\n     * @param ois stream from which the real matrix should be read\n     * @exception ClassNotFoundException if a class in the stream cannot be found\n     * @exception IOException if object cannot be read from the stream\n     * @see #serializeRealMatrix(RealMatrix, ObjectOutputStream)\n     ",
      "child_ranges": [
        "(line 778,col 9)-(line 808,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.solveLowerTriangularSystem(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 826,
      "end_line": 849,
      "comment": "Solve  a  system of composed of a Lower Triangular Matrix\n     * {@link RealMatrix}.\n     * \u003cp\u003e\n     * This method is called to solve systems of equations which are\n     * of the lower triangular form. The matrix {@link RealMatrix}\n     * is assumed, though not checked, to be in lower triangular form.\n     * The vector {@link RealVector} is overwritten with the solution.\n     * The matrix is checked that it is square and its dimensions match\n     * the length of the vector.\n     * \u003c/p\u003e\n     * @param rm RealMatrix which is lower triangular\n     * @param b  RealVector this is overwritten\n     * @exception IllegalArgumentException if the matrix and vector are not conformable\n     * @exception ArithmeticException there is a zero or near zero on the diagonal of rm\n     ",
      "child_ranges": [
        "(line 827,col 9)-(line 831,col 9)",
        "(line 832,col 9)-(line 836,col 9)",
        "(line 837,col 9)-(line 837,col 40)",
        "(line 838,col 9)-(line 848,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.MatrixUtils.solveUpperTriangularSystem(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 866,
      "end_line": 889,
      "comment": " Solver a  system composed  of an Upper Triangular Matrix\n     * {@link RealMatrix}.\n     * \u003cp\u003e\n     * This method is called to solve systems of equations which are\n     * of the lower triangular form. The matrix {@link RealMatrix}\n     * is assumed, though not checked, to be in upper triangular form.\n     * The vector {@link RealVector} is overwritten with the solution.\n     * The matrix is checked that it is square and its dimensions match\n     * the length of the vector.\n     * \u003c/p\u003e\n     * @param rm RealMatrix which is upper triangular\n     * @param b  RealVector this is overwritten\n     * @exception IllegalArgumentException if the matrix and vector are not conformable\n     * @exception ArithmeticException there is a zero or near zero on the diagonal of rm\n     ",
      "child_ranges": [
        "(line 867,col 9)-(line 871,col 9)",
        "(line 872,col 9)-(line 876,col 9)",
        "(line 877,col 9)-(line 877,col 40)",
        "(line 878,col 9)-(line 888,col 9)"
      ]
    }
  ]
}