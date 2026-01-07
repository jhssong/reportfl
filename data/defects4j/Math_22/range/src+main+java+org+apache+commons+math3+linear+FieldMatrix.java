{
  "filepath": "/tmp/Math-22b/src/main/java/org/apache/commons/math3/linear/FieldMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldMatrix",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math3.linear.AnyMatrix"
      ],
      "begin_line": 41,
      "end_line": 811,
      "comment": "\n * Interface defining field-valued matrix with basic algebraic operations.\n * \u003cp\u003e\n * Matrix element indexing is 0-based -- e.g., \u003ccode\u003egetEntry(0, 0)\u003c/code\u003e\n * returns the element in the first row, first column of the matrix.\u003c/p\u003e\n *\n * @param \u003cT\u003e the type of the field elements\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.getField()",
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Get the type of field elements of the matrix.\n     *\n     * @return the type of field elements of the matrix.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.createMatrix(int, int)",
      "begin_line": 60,
      "end_line": 61,
      "comment": "\n     * Create a new FieldMatrix\u003cT\u003e of the same type as the instance with\n     * the supplied row and column dimensions.\n     *\n     * @param rowDimension  the number of rows in the new matrix\n     * @param columnDimension  the number of columns in the new matrix\n     * @return a new matrix of the same type as the instance\n     * @throws NotStrictlyPositiveException if row or column dimension is not\n     * positive.\n     * @since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.copy()",
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * Make a (deep) copy of this.\n     *\n     * @return a copy of this matrix.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.add(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * Compute the sum of this and m.\n     *\n     * @param m Matrix to be added.\n     * @return {@code this} + {@code m}.\n     * @throws MatrixDimensionMismatchException if {@code m} is not the same\n     * size as {@code this} matrix.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.subtract(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * Subtract {@code m} from this matrix.\n     *\n     * @param m Matrix to be subtracted.\n     * @return {@code this} - {@code m}.\n     * @throws MatrixDimensionMismatchException if {@code m} is not the same\n     * size as {@code this} matrix.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.scalarAdd(T)",
      "begin_line": 96,
      "end_line": 96,
      "comment": "\n     * Increment each entry of this matrix.\n     *\n     * @param d Value to be added to each entry.\n     * @return {@code d} + {@code this}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.scalarMultiply(T)",
      "begin_line": 104,
      "end_line": 104,
      "comment": "\n     * Multiply each entry by {@code d}.\n     *\n     * @param d Value to multiply all entries by.\n     * @return {@code d} * {@code this}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.multiply(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 115,
      "end_line": 115,
      "comment": "\n     * Postmultiply this matrix by {@code m}.\n     *\n     * @param m  Matrix to postmultiply by.\n     * @return {@code this} * {@code m}.\n     * @throws DimensionMismatchException if the number of columns of\n     * {@code this} matrix is not equal to the number of rows of matrix\n     * {@code m}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.preMultiply(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 125,
      "end_line": 125,
      "comment": "\n     * Premultiply this matrix by {@code m}.\n     *\n     * @param m Matrix to premultiply by.\n     * @return {@code m} * {@code this}.\n     * @throws DimensionMismatchException if the number of columns of {@code m}\n     * differs from the number of rows of {@code this} matrix.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.power(int)",
      "begin_line": 137,
      "end_line": 138,
      "comment": "\n     * Returns the result multiplying this with itself \u003ccode\u003ep\u003c/code\u003e times.\n     * Depending on the type of the field elements, T, instability for high\n     * powers might occur.\n     *\n     * @param p raise this to power p\n     * @return this^p\n     * @throws NotPositiveException if {@code p \u003c 0}\n     * @throws NonSquareMatrixException if {@code this matrix} is not square\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.getData()",
      "begin_line": 145,
      "end_line": 145,
      "comment": "\n     * Returns matrix entries as a two-dimensional array.\n     *\n     * @return a 2-dimensional array of entries.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 160,
      "end_line": 161,
      "comment": "\n     * Get a submatrix. Rows and columns are indicated\n     * counting from 0 to n - 1.\n     *\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index (inclusive)\n     * @return the matrix containing the data of the specified rows and columns.\n     * @throws NumberIsTooSmallException is {@code endRow \u003c startRow} of\n     * {@code endColumn \u003c startColumn}.\n     * @throws OutOfRangeException if the indices are not valid.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.getSubMatrix(int[], int[])",
      "begin_line": 177,
      "end_line": 178,
      "comment": "\n    * Get a submatrix. Rows and columns are indicated\n    * counting from 0 to n - 1.\n    *\n    * @param selectedRows Array of row indices.\n    * @param selectedColumns Array of column indices.\n    * @return the matrix containing the data in the\n    * specified rows and columns.\n    * @throws NoDataException if {@code selectedRows} or\n    * {@code selectedColumns} is empty\n    * @throws NullArgumentException if {@code selectedRows} or\n    * {@code selectedColumns} is {@code null}.\n    * @throws OutOfRangeException if row or column selections are not valid.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.copySubMatrix(int, int, int, int, T[][])",
      "begin_line": 197,
      "end_line": 200,
      "comment": "\n    * Copy a submatrix. Rows and columns are indicated\n    * counting from 0 to n-1.\n    *\n    * @param startRow Initial row index.\n    * @param endRow Final row index (inclusive).\n    * @param startColumn Initial column index.\n    * @param endColumn Final column index (inclusive).\n    * @param destination The arrays where the submatrix data should be copied\n    * (if larger than rows/columns counts, only the upper-left part will be used).\n    * @throws MatrixDimensionMismatchException if the dimensions of\n    * {@code destination} do not match those of {@code this}.\n    * @throws NumberIsTooSmallException is {@code endRow \u003c startRow} of\n    * {@code endColumn \u003c startColumn}.\n    * @throws OutOfRangeException if the indices are not valid.\n    * @exception IllegalArgumentException if the destination array is too small.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.copySubMatrix(int[], int[], T[][])",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\n   * Copy a submatrix. Rows and columns are indicated\n   * counting from 0 to n - 1.\n   *\n   * @param selectedRows Array of row indices.\n   * @param selectedColumns Array of column indices.\n   * @param destination Arrays where the submatrix data should be copied\n   * (if larger than rows/columns counts, only the upper-left part will be used)\n   * @throws MatrixDimensionMismatchException if the dimensions of\n   * {@code destination} do not match those of {@code this}.\n   * @throws NoDataException if {@code selectedRows} or\n   * {@code selectedColumns} is empty\n   * @throws NullArgumentException if {@code selectedRows} or\n   * {@code selectedColumns} is {@code null}.\n   * @throws OutOfRangeException if the indices are not valid.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.setSubMatrix(T[][], int, int)",
      "begin_line": 254,
      "end_line": 256,
      "comment": "\n    * Replace the submatrix starting at {@code (row, column)} using data in\n    * the input {@code subMatrix} array. Indexes are 0-based.\n    * \u003cp\u003e\n    * Example:\u003cbr\u003e\n    * Starting with \u003cpre\u003e\n    * 1  2  3  4\n    * 5  6  7  8\n    * 9  0  1  2\n    * \u003c/pre\u003e\n    * and \u003ccode\u003esubMatrix \u003d {{3, 4} {5,6}}\u003c/code\u003e, invoking\n    * \u003ccode\u003esetSubMatrix(subMatrix,1,1))\u003c/code\u003e will result in \u003cpre\u003e\n    * 1  2  3  4\n    * 5  3  4  8\n    * 9  5  6  2\n    * \u003c/pre\u003e\u003c/p\u003e\n    *\n    * @param subMatrix Array containing the submatrix replacement data.\n    * @param row Row coordinate of the top-left element to be replaced.\n    * @param column Column coordinate of the top-left element to be replaced.\n    * @throws MatrixDimensionMismatchException\n    * if {@code subMatrix} does not fit into this matrix from element in\n    * {@code (row, column)}.\n    * @throws org.apache.commons.math3.exception.ZeroException if a row or column\n    * of {@code subMatrix} is empty.\n    * @throws org.apache.commons.math3.exception.DimensionMismatchException\n    * if {@code subMatrix} is not rectangular (not all rows have the same\n    * length).\n    * @throws org.apache.commons.math3.exception.NullArgumentException\n    * if {@code subMatrix} is {@code null}.\n    * @since 2.0\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.getRowMatrix(int)",
      "begin_line": 266,
      "end_line": 266,
      "comment": "\n    * Get the entries in row number {@code row}\n    * as a row matrix.\n    *\n    * @param row Row to be fetched.\n    * @return a row matrix.\n    * @throws OutOfRangeException if the specified row index is invalid.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.setRowMatrix(int, org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 279,
      "end_line": 280,
      "comment": "\n    * Set the entries in row number {@code row}\n    * as a row matrix.\n    *\n    * @param row Row to be set.\n    * @param matrix Row matrix (must have one row and the same number\n    * of columns as the instance).\n    * @throws OutOfRangeException if the specified row index is invalid.\n    * @throws MatrixDimensionMismatchException\n    * if the matrix dimensions do not match one instance row.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.getColumnMatrix(int)",
      "begin_line": 290,
      "end_line": 290,
      "comment": "\n    * Get the entries in column number {@code column}\n    * as a column matrix.\n    *\n    * @param column Column to be fetched.\n    * @return a column matrix.\n    * @throws OutOfRangeException if the specified column index is invalid.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.setColumnMatrix(int, org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 303,
      "end_line": 304,
      "comment": "\n    * Set the entries in column number {@code column}\n    * as a column matrix.\n    *\n    * @param column Column to be set.\n    * @param matrix column matrix (must have one column and the same\n    * number of rows as the instance).\n    * @throws OutOfRangeException if the specified column index is invalid.\n    * @throws MatrixDimensionMismatchException if the matrix dimensions do\n    * not match one instance column.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.getRowVector(int)",
      "begin_line": 314,
      "end_line": 314,
      "comment": "\n    * Get the entries in row number {@code row}\n    * as a vector.\n    *\n    * @param row Row to be fetched\n    * @return a row vector.\n    * @throws OutOfRangeException if the specified row index is invalid.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.setRowVector(int, org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 327,
      "end_line": 328,
      "comment": "\n    * Set the entries in row number {@code row}\n    * as a vector.\n    *\n    * @param row Row to be set.\n    * @param vector row vector (must have the same number of columns\n    * as the instance).\n    * @throws OutOfRangeException if the specified row index is invalid.\n    * @throws MatrixDimensionMismatchException if the vector dimension does not\n    * match one instance row.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.getColumnVector(int)",
      "begin_line": 338,
      "end_line": 338,
      "comment": "\n    * Returns the entries in column number {@code column}\n    * as a vector.\n    *\n    * @param column Column to be fetched.\n    * @return a column vector.\n    * @throws OutOfRangeException if the specified column index is invalid.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.setColumnVector(int, org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 351,
      "end_line": 352,
      "comment": "\n    * Set the entries in column number {@code column}\n    * as a vector.\n    *\n    * @param column Column to be set.\n    * @param vector Column vector (must have the same number of rows\n    * as the instance).\n    * @throws OutOfRangeException if the specified column index is invalid.\n    * @throws MatrixDimensionMismatchException if the vector dimension does not\n    * match one instance column.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.getRow(int)",
      "begin_line": 361,
      "end_line": 361,
      "comment": "\n     * Get the entries in row number {@code row} as an array.\n     *\n     * @param row Row to be fetched.\n     * @return array of entries in the row.\n     * @throws OutOfRangeException if the specified row index is not valid.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.setRow(int, T[])",
      "begin_line": 374,
      "end_line": 375,
      "comment": "\n     * Set the entries in row number {@code row}\n     * as a row matrix.\n     *\n     * @param row Row to be set.\n     * @param array Row matrix (must have the same number of columns as\n     * the instance).\n     * @throws OutOfRangeException if the specified row index is invalid.\n     * @throws MatrixDimensionMismatchException if the array size does not match\n     * one instance row.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.getColumn(int)",
      "begin_line": 384,
      "end_line": 384,
      "comment": "\n     * Get the entries in column number {@code col} as an array.\n     *\n     * @param column the column to be fetched\n     * @return array of entries in the column\n     * @throws OutOfRangeException if the specified column index is not valid.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.setColumn(int, T[])",
      "begin_line": 396,
      "end_line": 397,
      "comment": "\n     * Set the entries in column number {@code column}\n     * as a column matrix.\n     *\n     * @param column the column to be set\n     * @param array column array (must have the same number of rows as the instance)\n     * @throws OutOfRangeException if the specified column index is invalid.\n     * @throws MatrixDimensionMismatchException if the array size does not match\n     * one instance column.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.getEntry(int, int)",
      "begin_line": 407,
      "end_line": 407,
      "comment": "\n     * Returns the entry in the specified row and column.\n     *\n     * @param row  row location of entry to be fetched\n     * @param column  column location of entry to be fetched\n     * @return matrix entry in row,column\n     * @throws OutOfRangeException if the row or column index is not valid.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.setEntry(int, int, T)",
      "begin_line": 418,
      "end_line": 418,
      "comment": "\n     * Set the entry in the specified row and column.\n     *\n     * @param row  row location of entry to be set\n     * @param column  column location of entry to be set\n     * @param value matrix entry to be set in row,column\n     * @throws OutOfRangeException if the row or column index is not valid.\n     * @since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.addToEntry(int, int, T)",
      "begin_line": 430,
      "end_line": 430,
      "comment": "\n     * Change an entry in the specified row and column.\n     *\n     * @param row Row location of entry to be set.\n     * @param column Column location of entry to be set.\n     * @param increment Value to add to the current matrix entry in\n     * {@code (row, column)}.\n     * @throws OutOfRangeException if the row or column index is not valid.\n     * @since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.multiplyEntry(int, int, T)",
      "begin_line": 442,
      "end_line": 442,
      "comment": "\n     * Change an entry in the specified row and column.\n     *\n     * @param row Row location of entry to be set.\n     * @param column Column location of entry to be set.\n     * @param factor Multiplication factor for the current matrix entry\n     * in {@code (row,column)}\n     * @throws OutOfRangeException if the row or column index is not valid.\n     * @since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.transpose()",
      "begin_line": 449,
      "end_line": 449,
      "comment": "\n     * Returns the transpose of this matrix.\n     *\n     * @return transpose matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.getTrace()",
      "begin_line": 458,
      "end_line": 458,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/MatrixTrace.html\"\u003e\n     * trace\u003c/a\u003e of the matrix (the sum of the elements on the main diagonal).\n     *\n     * @return trace\n     * @throws NonSquareMatrixException if the matrix is not square.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.operate(T[])",
      "begin_line": 468,
      "end_line": 468,
      "comment": "\n     * Returns the result of multiplying this by the vector {@code v}.\n     *\n     * @param v the vector to operate on\n     * @return {@code this * v}\n     * @throws DimensionMismatchException if the number of columns of\n     * {@code this} matrix is not equal to the size of the vector {@code v}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.operate(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 478,
      "end_line": 478,
      "comment": "\n     * Returns the result of multiplying this by the vector {@code v}.\n     *\n     * @param v the vector to operate on\n     * @return {@code this * v}\n     * @throws DimensionMismatchException if the number of columns of\n     * {@code this} matrix is not equal to the size of the vector {@code v}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.preMultiply(T[])",
      "begin_line": 489,
      "end_line": 489,
      "comment": "\n     * Returns the (row) vector result of premultiplying this by the vector\n     * {@code v}.\n     *\n     * @param v the row vector to premultiply by\n     * @return {@code v * this}\n     * @throws DimensionMismatchException if the number of rows of {@code this}\n     * matrix is not equal to the size of the vector {@code v}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.preMultiply(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 500,
      "end_line": 500,
      "comment": "\n     * Returns the (row) vector result of premultiplying this by the vector\n     * {@code v}.\n     *\n     * @param v the row vector to premultiply by\n     * @return {@code v * this}\n     * @throws DimensionMismatchException if the number of rows of {@code this}\n     * matrix is not equal to the size of the vector {@code v}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 522,
      "end_line": 522,
      "comment": "\n     * Visit (and possibly change) all matrix entries in row order.\n     * \u003cp\u003eRow order starts at upper left and iterating through all elements\n     * of a row from left to right before going to the leftmost element\n     * of the next row.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 544,
      "end_line": 544,
      "comment": "\n     * Visit (but don\u0027t change) all matrix entries in row order.\n     * \u003cp\u003eRow order starts at upper left and iterating through all elements\n     * of a row from left to right before going to the leftmost element\n     * of the next row.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 571,
      "end_line": 573,
      "comment": "\n     * Visit (and possibly change) some matrix entries in row order.\n     * \u003cp\u003eRow order starts at upper left and iterating through all elements\n     * of a row from left to right before going to the leftmost element\n     * of the next row.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @throws OutOfRangeException if the indices are not valid.\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 600,
      "end_line": 602,
      "comment": "\n     * Visit (but don\u0027t change) some matrix entries in row order.\n     * \u003cp\u003eRow order starts at upper left and iterating through all elements\n     * of a row from left to right before going to the leftmost element\n     * of the next row.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @throws OutOfRangeException if the indices are not valid.\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 624,
      "end_line": 624,
      "comment": "\n     * Visit (and possibly change) all matrix entries in column order.\n     * \u003cp\u003eColumn order starts at upper left and iterating through all elements\n     * of a column from top to bottom before going to the topmost element\n     * of the next column.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 646,
      "end_line": 646,
      "comment": "\n     * Visit (but don\u0027t change) all matrix entries in column order.\n     * \u003cp\u003eColumn order starts at upper left and iterating through all elements\n     * of a column from top to bottom before going to the topmost element\n     * of the next column.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 675,
      "end_line": 677,
      "comment": "\n     * Visit (and possibly change) some matrix entries in column order.\n     * \u003cp\u003eColumn order starts at upper left and iterating through all elements\n     * of a column from top to bottom before going to the topmost element\n     * of the next column.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @throws NumberIsTooSmallException if {@code endRow \u003c startRow} or\n     * {@code endColumn \u003c startColumn}.\n     * @throws OutOfRangeException if the indices are not valid.\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 706,
      "end_line": 708,
      "comment": "\n     * Visit (but don\u0027t change) some matrix entries in column order.\n     * \u003cp\u003eColumn order starts at upper left and iterating through all elements\n     * of a column from top to bottom before going to the topmost element\n     * of the next column.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @throws NumberIsTooSmallException if {@code endRow \u003c startRow} or\n     * {@code endColumn \u003c startColumn}.\n     * @throws OutOfRangeException if the indices are not valid.\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 729,
      "end_line": 729,
      "comment": "\n     * Visit (and possibly change) all matrix entries using the fastest possible order.\n     * \u003cp\u003eThe fastest walking order depends on the exact matrix class. It may be\n     * different from traditional row or column orders.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 750,
      "end_line": 750,
      "comment": "\n     * Visit (but don\u0027t change) all matrix entries using the fastest possible order.\n     * \u003cp\u003eThe fastest walking order depends on the exact matrix class. It may be\n     * different from traditional row or column orders.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 778,
      "end_line": 780,
      "comment": "\n     * Visit (and possibly change) some matrix entries using the fastest possible order.\n     * \u003cp\u003eThe fastest walking order depends on the exact matrix class. It may be\n     * different from traditional row or column orders.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index (inclusive)\n     * @throws NumberIsTooSmallException if {@code endRow \u003c startRow} or\n     * {@code endColumn \u003c startColumn}.\n     * @throws OutOfRangeException if the indices are not valid.\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 808,
      "end_line": 810,
      "comment": "\n     * Visit (but don\u0027t change) some matrix entries using the fastest possible order.\n     * \u003cp\u003eThe fastest walking order depends on the exact matrix class. It may be\n     * different from traditional row or column orders.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index (inclusive)\n     * @throws NumberIsTooSmallException if {@code endRow \u003c startRow} or\n     * {@code endColumn \u003c startColumn}.\n     * @throws OutOfRangeException if the indices are not valid.\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    }
  ]
}