{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/RealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealMatrix",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math3.linear.AnyMatrix"
      ],
      "begin_line": 36,
      "end_line": 829,
      "comment": "\n * Interface defining a real-valued matrix with basic algebraic operations.\n * \u003cp\u003e\n * Matrix element indexing is 0-based -- e.g., \u003ccode\u003egetEntry(0, 0)\u003c/code\u003e\n * returns the element in the first row, first column of the matrix.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.createMatrix(int, int)",
      "begin_line": 50,
      "end_line": 51,
      "comment": "\n     * Create a new RealMatrix of the same type as the instance with the\n     * supplied\n     * row and column dimensions.\n     *\n     * @param rowDimension the number of rows in the new matrix\n     * @param columnDimension the number of columns in the new matrix\n     * @return a new matrix of the same type as the instance\n     * @throws NotStrictlyPositiveException if row or column dimension is not\n     * positive.\n     * @since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.copy()",
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Returns a (deep) copy of this.\n     *\n     * @return matrix copy\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.add(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 68,
      "end_line": 69,
      "comment": "\n     * Returns the sum of {@code this} and {@code m}.\n     *\n     * @param m matrix to be added\n     * @return {@code this + m}\n     * @throws MatrixDimensionMismatchException if {@code m} is not the same\n     * size as {@code this}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.subtract(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 79,
      "end_line": 80,
      "comment": "\n     * Returns {@code this} minus {@code m}.\n     *\n     * @param m matrix to be subtracted\n     * @return {@code this - m}\n     * @throws MatrixDimensionMismatchException if {@code m} is not the same\n     * size as {@code this}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.scalarAdd(double)",
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * Returns the result of adding {@code d} to each entry of {@code this}.\n     *\n     * @param d value to be added to each entry\n     * @return {@code d + this}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.scalarMultiply(double)",
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n     * Returns the result of multiplying each entry of {@code this} by\n     * {@code d}.\n     *\n     * @param d value to multiply all entries by\n     * @return {@code d * this}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.multiply(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 107,
      "end_line": 108,
      "comment": "\n     * Returns the result of postmultiplying {@code this} by {@code m}.\n     *\n     * @param m matrix to postmultiply by\n     * @return {@code this * m}\n     * @throws DimensionMismatchException if\n     * {@code columnDimension(this) !\u003d rowDimension(m)}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.preMultiply(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 118,
      "end_line": 119,
      "comment": "\n     * Returns the result of premultiplying {@code this} by {@code m}.\n     *\n     * @param m matrix to premultiply by\n     * @return {@code m * this}\n     * @throws DimensionMismatchException if\n     * {@code rowDimension(this) !\u003d columnDimension(m)}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.power(int)",
      "begin_line": 131,
      "end_line": 132,
      "comment": "\n     * Returns the result of multiplying {@code this} with itself {@code p}\n     * times. Depending on the underlying storage, instability for high powers\n     * might occur.\n     *\n     * @param p raise {@code this} to power {@code p}\n     * @return {@code this^p}\n     * @throws NotPositiveException if {@code p \u003c 0}\n     * @throws NonSquareMatrixException if the matrix is not square\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.getData()",
      "begin_line": 139,
      "end_line": 139,
      "comment": "\n     * Returns matrix entries as a two-dimensional array.\n     *\n     * @return 2-dimensional array of entries\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.getNorm()",
      "begin_line": 147,
      "end_line": 147,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/MaximumAbsoluteRowSumNorm.html\"\u003e\n     * maximum absolute row sum norm\u003c/a\u003e of the matrix.\n     *\n     * @return norm\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.getFrobeniusNorm()",
      "begin_line": 155,
      "end_line": 155,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/FrobeniusNorm.html\"\u003e\n     * Frobenius norm\u003c/a\u003e of the matrix.\n     *\n     * @return norm\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * Gets a submatrix. Rows and columns are indicated\n     * counting from 0 to n-1.\n     *\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index (inclusive)\n     * @return The subMatrix containing the data of the\n     * specified rows and columns.\n     * @throws OutOfRangeException if the indices are not valid.\n     * @throws NumberIsTooSmallException if {@code endRow \u003c startRow} or\n     * {@code endColumn \u003c startColumn}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.getSubMatrix(int[], int[])",
      "begin_line": 188,
      "end_line": 189,
      "comment": "\n     * Gets a submatrix. Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param selectedRows Array of row indices.\n     * @param selectedColumns Array of column indices.\n     * @return The subMatrix containing the data in the specified rows and\n     * columns\n     * @throws NullArgumentException if the row or column selections are\n     * {@code null}\n     * @throws NoDataException if the row or column selections are empty (zero\n     * length).\n     * @throws OutOfRangeException if the indices are not valid.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.copySubMatrix(int, int, int, int, double[][])",
      "begin_line": 207,
      "end_line": 210,
      "comment": "\n     * Copy a submatrix. Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index (inclusive)\n     * @param destination The arrays where the submatrix data should be copied\n     * (if larger than rows/columns counts, only the upper-left part will be\n     * used)\n     * @throws OutOfRangeException if the indices are not valid.\n     * @throws NumberIsTooSmallException if {@code endRow \u003c startRow} or\n     * {@code endColumn \u003c startColumn}.\n     * @throws MatrixDimensionMismatchException if the destination array is too\n     * small.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.copySubMatrix(int[], int[], double[][])",
      "begin_line": 228,
      "end_line": 231,
      "comment": "\n     * Copy a submatrix. Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param selectedRows Array of row indices.\n     * @param selectedColumns Array of column indices.\n     * @param destination The arrays where the submatrix data should be copied\n     * (if larger than rows/columns counts, only the upper-left part will be\n     * used)\n     * @throws NullArgumentException if the row or column selections are\n     * {@code null}\n     * @throws NoDataException if the row or column selections are empty (zero\n     * length).\n     * @throws OutOfRangeException if the indices are not valid.\n     * @throws MatrixDimensionMismatchException if the destination array is too\n     * small.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\n    * Replace the submatrix starting at {@code row, column} using data in the\n    * input {@code subMatrix} array. Indexes are 0-based.\n    * \u003cp\u003e\n    * Example:\u003cbr\u003e\n    * Starting with \u003cpre\u003e\n    * 1  2  3  4\n    * 5  6  7  8\n    * 9  0  1  2\n    * \u003c/pre\u003e\n    * and \u003ccode\u003esubMatrix \u003d {{3, 4} {5,6}}\u003c/code\u003e, invoking\n    * {@code setSubMatrix(subMatrix,1,1))} will result in \u003cpre\u003e\n    * 1  2  3  4\n    * 5  3  4  8\n    * 9  5  6  2\n    * \u003c/pre\u003e\u003c/p\u003e\n    *\n    * @param subMatrix  array containing the submatrix replacement data\n    * @param row  row coordinate of the top, left element to be replaced\n    * @param column  column coordinate of the top, left element to be replaced\n    * @throws NoDataException if {@code subMatrix} is empty.\n    * @throws OutOfRangeException if {@code subMatrix} does not fit into\n    * this matrix from element in {@code (row, column)}.\n    * @throws DimensionMismatchException if {@code subMatrix} is not rectangular\n    * (not all rows have the same length) or empty.\n    * @throws NullArgumentException if {@code subMatrix} is {@code null}.\n    * @since 2.0\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.getRowMatrix(int)",
      "begin_line": 273,
      "end_line": 273,
      "comment": "\n    * Get the entries at the given row index as a row matrix.  Row indices start\n    * at 0.\n    *\n    * @param row Row to be fetched.\n    * @return row Matrix.\n    * @throws OutOfRangeException if the specified row index is invalid.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.setRowMatrix(int, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 287,
      "end_line": 288,
      "comment": "\n     * Sets the specified {@code row} of {@code this} matrix to the entries of\n     * the specified row {@code matrix}. Row indices start at 0.\n     *\n     * @param row Row to be set.\n     * @param matrix Row matrix to be copied (must have one row and the same\n     * number of columns as the instance).\n     * @throws OutOfRangeException if the specified row index is invalid.\n     * @throws MatrixDimensionMismatchException if the row dimension of the\n     * {@code matrix} is not {@code 1}, or the column dimensions of {@code this}\n     * and {@code matrix} do not match.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.getColumnMatrix(int)",
      "begin_line": 298,
      "end_line": 299,
      "comment": "\n     * Get the entries at the given column index as a column matrix. Column\n     * indices start at 0.\n     *\n     * @param column Column to be fetched.\n     * @return column Matrix.\n     * @throws OutOfRangeException if the specified column index is invalid.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.setColumnMatrix(int, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 313,
      "end_line": 314,
      "comment": "\n     * Sets the specified {@code column} of {@code this} matrix to the entries\n     * of the specified column {@code matrix}. Column indices start at 0.\n     *\n     * @param column Column to be set.\n     * @param matrix Column matrix to be copied (must have one column and the\n     * same number of rows as the instance).\n     * @throws OutOfRangeException if the specified column index is invalid.\n     * @throws MatrixDimensionMismatchException if the column dimension of the\n     * {@code matrix} is not {@code 1}, or the row dimensions of {@code this}\n     * and {@code matrix} do not match.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.getRowVector(int)",
      "begin_line": 324,
      "end_line": 325,
      "comment": "\n     * Returns the entries in row number {@code row} as a vector. Row indices\n     * start at 0.\n     *\n     * @param row Row to be fetched.\n     * @return a row vector.\n     * @throws OutOfRangeException if the specified row index is invalid.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.setRowVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 338,
      "end_line": 339,
      "comment": "\n     * Sets the specified {@code row} of {@code this} matrix to the entries of\n     * the specified {@code vector}. Row indices start at 0.\n     *\n     * @param row Row to be set.\n     * @param vector row vector to be copied (must have the same number of\n     * column as the instance).\n     * @throws OutOfRangeException if the specified row index is invalid.\n     * @throws MatrixDimensionMismatchException if the {@code vector} dimension\n     * does not match the column dimension of {@code this} matrix.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.getColumnVector(int)",
      "begin_line": 349,
      "end_line": 350,
      "comment": "\n     * Get the entries at the given column index as a vector. Column indices\n     * start at 0.\n     *\n     * @param column Column to be fetched.\n     * @return a column vector.\n     * @throws OutOfRangeException if the specified column index is invalid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.setColumnVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 363,
      "end_line": 364,
      "comment": "\n     * Sets the specified {@code column} of {@code this} matrix to the entries\n     * of the specified {@code vector}. Column indices start at 0.\n     *\n     * @param column Column to be set.\n     * @param vector column vector to be copied (must have the same number of\n     * rows as the instance).\n     * @throws OutOfRangeException if the specified column index is invalid.\n     * @throws MatrixDimensionMismatchException if the {@code vector} dimension\n     * does not match the row dimension of {@code this} matrix.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.getRow(int)",
      "begin_line": 373,
      "end_line": 373,
      "comment": "\n     * Get the entries at the given row index. Row indices start at 0.\n     *\n     * @param row Row to be fetched.\n     * @return the array of entries in the row.\n     * @throws OutOfRangeException if the specified row index is not valid.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.setRow(int, double[])",
      "begin_line": 386,
      "end_line": 387,
      "comment": "\n     * Sets the specified {@code row} of {@code this} matrix to the entries\n     * of the specified {@code array}. Row indices start at 0.\n     *\n     * @param row Row to be set.\n     * @param array Row matrix to be copied (must have the same number of\n     * columns as the instance)\n     * @throws OutOfRangeException if the specified row index is invalid.\n     * @throws MatrixDimensionMismatchException if the {@code array} length does\n     * not match the column dimension of {@code this} matrix.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.getColumn(int)",
      "begin_line": 397,
      "end_line": 397,
      "comment": "\n     * Get the entries at the given column index as an array. Column indices\n     * start at 0.\n     *\n     * @param column Column to be fetched.\n     * @return the array of entries in the column.\n     * @throws OutOfRangeException if the specified column index is not valid.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.setColumn(int, double[])",
      "begin_line": 410,
      "end_line": 411,
      "comment": "\n     * Sets the specified {@code column} of {@code this} matrix to the entries\n     * of the specified {@code array}. Column indices start at 0.\n     *\n     * @param column Column to be set.\n     * @param array Column array to be copied (must have the same number of\n     * rows as the instance).\n     * @throws OutOfRangeException if the specified column index is invalid.\n     * @throws MatrixDimensionMismatchException if the {@code array} length does\n     * not match the row dimension of {@code this} matrix.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.getEntry(int, int)",
      "begin_line": 422,
      "end_line": 422,
      "comment": "\n     * Get the entry in the specified row and column. Row and column indices\n     * start at 0.\n     *\n     * @param row Row index of entry to be fetched.\n     * @param column Column index of entry to be fetched.\n     * @return the matrix entry at {@code (row, column)}.\n     * @throws OutOfRangeException if the row or column index is not valid.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.setEntry(int, int, double)",
      "begin_line": 434,
      "end_line": 434,
      "comment": "\n     * Set the entry in the specified row and column. Row and column indices\n     * start at 0.\n     *\n     * @param row Row index of entry to be set.\n     * @param column Column index of entry to be set.\n     * @param value the new value of the entry.\n     * @throws OutOfRangeException if the row or column index is not valid\n     * @since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.addToEntry(int, int, double)",
      "begin_line": 446,
      "end_line": 446,
      "comment": "\n     * Adds (in place) the specified value to the specified entry of\n     * {@code this} matrix. Row and column indices start at 0.\n     *\n     * @param row Row index of the entry to be modified.\n     * @param column Column index of the entry to be modified.\n     * @param increment value to add to the matrix entry.\n     * @throws OutOfRangeException if the row or column index is not valid.\n     * @since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 458,
      "end_line": 458,
      "comment": "\n     * Multiplies (in place) the specified entry of {@code this} matrix by the\n     * specified value. Row and column indices start at 0.\n     *\n     * @param row Row index of the entry to be modified.\n     * @param column Column index of the entry to be modified.\n     * @param factor Multiplication factor for the matrix entry.\n     * @throws OutOfRangeException if the row or column index is not valid.\n     * @since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.transpose()",
      "begin_line": 465,
      "end_line": 465,
      "comment": "\n     * Returns the transpose of this matrix.\n     *\n     * @return transpose matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.getTrace()",
      "begin_line": 474,
      "end_line": 474,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/MatrixTrace.html\"\u003e\n     * trace\u003c/a\u003e of the matrix (the sum of the elements on the main diagonal).\n     *\n     * @return the trace.\n     * @throws NonSquareMatrixException if the matrix is not square.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.operate(double[])",
      "begin_line": 484,
      "end_line": 484,
      "comment": "\n     * Returns the result of multiplying this by the vector {@code v}.\n     *\n     * @param v the vector to operate on\n     * @return {@code this * v}\n     * @throws DimensionMismatchException if the length of {@code v} does not\n     * match the column dimension of {@code this}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.operate(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 494,
      "end_line": 494,
      "comment": "\n     * Returns the result of multiplying this by the vector {@code v}.\n     *\n     * @param v the vector to operate on\n     * @return {@code this * v}\n     * @throws DimensionMismatchException if the dimension of {@code v} does not\n     * match the column dimension of {@code this}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.preMultiply(double[])",
      "begin_line": 504,
      "end_line": 504,
      "comment": "\n     * Returns the (row) vector result of premultiplying this by the vector {@code v}.\n     *\n     * @param v the row vector to premultiply by\n     * @return {@code v * this}\n     * @throws DimensionMismatchException if the length of {@code v} does not\n     * match the row dimension of {@code this}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.preMultiply(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 514,
      "end_line": 514,
      "comment": "\n     * Returns the (row) vector result of premultiplying this by the vector {@code v}.\n     *\n     * @param v the row vector to premultiply by\n     * @return {@code v * this}\n     * @throws DimensionMismatchException if the dimension of {@code v} does not\n     * match the row dimension of {@code this}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor)",
      "begin_line": 536,
      "end_line": 536,
      "comment": "\n     * Visit (and possibly change) all matrix entries in row order.\n     * \u003cp\u003eRow order starts at upper left and iterating through all elements\n     * of a row from left to right before going to the leftmost element\n     * of the next row.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor)",
      "begin_line": 558,
      "end_line": 558,
      "comment": "\n     * Visit (but don\u0027t change) all matrix entries in row order.\n     * \u003cp\u003eRow order starts at upper left and iterating through all elements\n     * of a row from left to right before going to the leftmost element\n     * of the next row.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 587,
      "end_line": 589,
      "comment": "\n     * Visit (and possibly change) some matrix entries in row order.\n     * \u003cp\u003eRow order starts at upper left and iterating through all elements\n     * of a row from left to right before going to the leftmost element\n     * of the next row.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @throws OutOfRangeException if the indices are not valid.\n     * @throws NumberIsTooSmallException if {@code endRow \u003c startRow} or\n     * {@code endColumn \u003c startColumn}.\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 618,
      "end_line": 620,
      "comment": "\n     * Visit (but don\u0027t change) some matrix entries in row order.\n     * \u003cp\u003eRow order starts at upper left and iterating through all elements\n     * of a row from left to right before going to the leftmost element\n     * of the next row.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @throws OutOfRangeException if the indices are not valid.\n     * @throws NumberIsTooSmallException if {@code endRow \u003c startRow} or\n     * {@code endColumn \u003c startColumn}.\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor)",
      "begin_line": 642,
      "end_line": 642,
      "comment": "\n     * Visit (and possibly change) all matrix entries in column order.\n     * \u003cp\u003eColumn order starts at upper left and iterating through all elements\n     * of a column from top to bottom before going to the topmost element\n     * of the next column.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor)",
      "begin_line": 664,
      "end_line": 664,
      "comment": "\n     * Visit (but don\u0027t change) all matrix entries in column order.\n     * \u003cp\u003eColumn order starts at upper left and iterating through all elements\n     * of a column from top to bottom before going to the topmost element\n     * of the next column.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 693,
      "end_line": 695,
      "comment": "\n     * Visit (and possibly change) some matrix entries in column order.\n     * \u003cp\u003eColumn order starts at upper left and iterating through all elements\n     * of a column from top to bottom before going to the topmost element\n     * of the next column.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @throws OutOfRangeException if the indices are not valid.\n     * @throws NumberIsTooSmallException if {@code endRow \u003c startRow} or\n     * {@code endColumn \u003c startColumn}.\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.walkInColumnOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 724,
      "end_line": 726,
      "comment": "\n     * Visit (but don\u0027t change) some matrix entries in column order.\n     * \u003cp\u003eColumn order starts at upper left and iterating through all elements\n     * of a column from top to bottom before going to the topmost element\n     * of the next column.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @throws OutOfRangeException if the indices are not valid.\n     * @throws NumberIsTooSmallException if {@code endRow \u003c startRow} or\n     * {@code endColumn \u003c startColumn}.\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor)",
      "begin_line": 747,
      "end_line": 747,
      "comment": "\n     * Visit (and possibly change) all matrix entries using the fastest possible order.\n     * \u003cp\u003eThe fastest walking order depends on the exact matrix class. It may be\n     * different from traditional row or column orders.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor)",
      "begin_line": 768,
      "end_line": 768,
      "comment": "\n     * Visit (but don\u0027t change) all matrix entries using the fastest possible order.\n     * \u003cp\u003eThe fastest walking order depends on the exact matrix class. It may be\n     * different from traditional row or column orders.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 796,
      "end_line": 798,
      "comment": "\n     * Visit (and possibly change) some matrix entries using the fastest possible order.\n     * \u003cp\u003eThe fastest walking order depends on the exact matrix class. It may be\n     * different from traditional row or column orders.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index (inclusive)\n     * @throws OutOfRangeException if the indices are not valid.\n     * @throws NumberIsTooSmallException if {@code endRow \u003c startRow} or\n     * {@code endColumn \u003c startColumn}.\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 826,
      "end_line": 828,
      "comment": "\n     * Visit (but don\u0027t change) some matrix entries using the fastest possible order.\n     * \u003cp\u003eThe fastest walking order depends on the exact matrix class. It may be\n     * different from traditional row or column orders.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index (inclusive)\n     * @throws OutOfRangeException if the indices are not valid.\n     * @throws NumberIsTooSmallException if {@code endRow \u003c startRow} or\n     * {@code endColumn \u003c startColumn}.\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    }
  ]
}