{
  "filepath": "/tmp/Math-28b/src/main/java/org/apache/commons/math3/linear/FieldMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldMatrix",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math3.linear.AnyMatrix"
      ],
      "begin_line": 33,
      "end_line": 779,
      "comment": "\n * Interface defining field-valued matrix with basic algebraic operations.\n * \u003cp\u003e\n * Matrix element indexing is 0-based -- e.g., \u003ccode\u003egetEntry(0, 0)\u003c/code\u003e\n * returns the element in the first row, first column of the matrix.\u003c/p\u003e\n *\n * @param \u003cT\u003e the type of the field elements\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.getField()",
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Get the type of field elements of the matrix.\n     *\n     * @return the type of field elements of the matrix.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.createMatrix(int, int)",
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Create a new FieldMatrix\u003cT\u003e of the same type as the instance with\n     * the supplied row and column dimensions.\n     *\n     * @param rowDimension  the number of rows in the new matrix\n     * @param columnDimension  the number of columns in the new matrix\n     * @return a new matrix of the same type as the instance\n     * @throws org.apache.commons.math3.exception.NotStrictlyPositiveException\n     * if row or column dimension is not positive.\n     * @since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.copy()",
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Make a (deep) copy of this.\n     *\n     * @return a copy of this matrix.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.add(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * Compute the sum of this and m.\n     *\n     * @param m Matrix to be added.\n     * @return {@code this} + {@code m}.\n     * @throws MatrixDimensionMismatchException\n     * if {@code m} is not the same size as this matrix.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.subtract(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * Subtract {@code m} from this matrix.\n     *\n     * @param m Matrix to be subtracted.\n     * @return {@code this} - {@code m}.\n     * @throws MatrixDimensionMismatchException\n     * if {@code m} is not the same size as this matrix.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.scalarAdd(T)",
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n     * Increment each entry of this matrix.\n     *\n     * @param d Value to be added to each entry.\n     * @return {@code d} + {@code this}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.scalarMultiply(T)",
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * Multiply each entry by {@code d}.\n     *\n     * @param d Value to multiply all entries by.\n     * @return {@code d} * {@code this}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.multiply(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n     * Postmultiply this matrix by {@code m}.\n     *\n     * @param m  Matrix to postmultiply by.\n     * @return {@code this} * {@code m}.\n     * @throws IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.preMultiply(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 116,
      "end_line": 116,
      "comment": "\n     * Premultiply this matrix by {@code m}.\n     *\n     * @param m Matrix to premultiply by.\n     * @return {@code m} * {@code this}.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the number of columns of {@code m} differ from the number of rows\n     * of this matrix.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.power(int)",
      "begin_line": 127,
      "end_line": 127,
      "comment": "\n     * Returns the result multiplying this with itself \u003ccode\u003ep\u003c/code\u003e times.\n     * Depending on the type of the field elements, T,\n     * instability for high powers might occur.\n     * @param      p raise this to power p\n     * @return     this^p\n     * @throws     IllegalArgumentException if p \u003c 0\n     *             NonSquareMatrixException if the matrix is not square\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.getData()",
      "begin_line": 134,
      "end_line": 134,
      "comment": "\n     * Returns matrix entries as a two-dimensional array.\n     *\n     * @return a 2-dimensional array of entries.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 149,
      "end_line": 149,
      "comment": "\n     * Get a submatrix. Rows and columns are indicated\n     * counting from 0 to n - 1.\n     *\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index (inclusive)\n     * @return the matrix containing the data of the\n     * specified rows and columns.\n     * @throws org.apache.commons.math3.exception.OutOfRangeException\n     * if the indices are not valid.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.getSubMatrix(int[], int[])",
      "begin_line": 162,
      "end_line": 162,
      "comment": "\n    * Get a submatrix. Rows and columns are indicated\n    * counting from 0 to n - 1.\n    *\n    * @param selectedRows Array of row indices.\n    * @param selectedColumns Array of column indices.\n    * @return the matrix containing the data in the\n    * specified rows and columns.\n    * @throws org.apache.commons.math3.exception.OutOfRangeException\n    * if row or column selections are not valid.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.copySubMatrix(int, int, int, int, T[][])",
      "begin_line": 178,
      "end_line": 179,
      "comment": "\n    * Copy a submatrix. Rows and columns are indicated\n    * counting from 0 to n-1.\n    *\n    * @param startRow Initial row index.\n    * @param endRow Final row index (inclusive).\n    * @param startColumn Initial column index.\n    * @param endColumn Final column index (inclusive).\n    * @param destination The arrays where the submatrix data should be copied\n    * (if larger than rows/columns counts, only the upper-left part will be used).\n    * @throws org.apache.commons.math3.exception.OutOfRangeException\n    * if the indices are not valid.\n    * @exception IllegalArgumentException if the destination array is too small.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.copySubMatrix(int[], int[], T[][])",
      "begin_line": 193,
      "end_line": 193,
      "comment": "\n   * Copy a submatrix. Rows and columns are indicated\n   * counting from 0 to n - 1.\n   *\n   * @param selectedRows Array of row indices.\n   * @param selectedColumns Array of column indices.\n   * @param destination Arrays where the submatrix data should be copied\n   * (if larger than rows/columns counts, only the upper-left part will be used)\n   * @throws org.apache.commons.math3.exception.OutOfRangeException\n   * if the indices are not valid.\n   * @exception IllegalArgumentException if the destination array is too small\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.setSubMatrix(T[][], int, int)",
      "begin_line": 227,
      "end_line": 227,
      "comment": "\n    * Replace the submatrix starting at {@code (row, column)} using data in\n    * the input {@code subMatrix} array. Indexes are 0-based.\n    * \u003cp\u003e\n    * Example:\u003cbr\u003e\n    * Starting with \u003cpre\u003e\n    * 1  2  3  4\n    * 5  6  7  8\n    * 9  0  1  2\n    * \u003c/pre\u003e\n    * and \u003ccode\u003esubMatrix \u003d {{3, 4} {5,6}}\u003c/code\u003e, invoking\n    * \u003ccode\u003esetSubMatrix(subMatrix,1,1))\u003c/code\u003e will result in \u003cpre\u003e\n    * 1  2  3  4\n    * 5  3  4  8\n    * 9  5  6  2\n    * \u003c/pre\u003e\u003c/p\u003e\n    *\n    * @param subMatrix Array containing the submatrix replacement data.\n    * @param row Row coordinate of the top-left element to be replaced.\n    * @param column Column coordinate of the top-left element to be replaced.\n    * @throws MatrixDimensionMismatchException\n    * if {@code subMatrix} does not fit into this matrix from element in\n    * {@code (row, column)}.\n    * @throws org.apache.commons.math3.exception.ZeroException if a row or column\n    * of {@code subMatrix} is empty.\n    * @throws org.apache.commons.math3.exception.DimensionMismatchException\n    * if {@code subMatrix} is not rectangular (not all rows have the same\n    * length).\n    * @throws org.apache.commons.math3.exception.NullArgumentException\n    * if {@code subMatrix} is {@code null}.\n    * @since 2.0\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.getRowMatrix(int)",
      "begin_line": 238,
      "end_line": 238,
      "comment": "\n    * Get the entries in row number {@code row}\n    * as a row matrix.\n    *\n    * @param row Row to be fetched.\n    * @return a row matrix.\n    * @throws org.apache.commons.math3.exception.OutOfRangeException\n    * if the specified row index is invalid.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.setRowMatrix(int, org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 252,
      "end_line": 252,
      "comment": "\n    * Set the entries in row number {@code row}\n    * as a row matrix.\n    *\n    * @param row Row to be set.\n    * @param matrix Row matrix (must have one row and the same number\n    * of columns as the instance).\n    * @throws org.apache.commons.math3.exception.OutOfRangeException\n    * if the specified row index is invalid.\n    * @throws MatrixDimensionMismatchException\n    * if the matrix dimensions do not match one instance row.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.getColumnMatrix(int)",
      "begin_line": 263,
      "end_line": 263,
      "comment": "\n    * Get the entries in column number {@code column}\n    * as a column matrix.\n    *\n    * @param column Column to be fetched.\n    * @return a column matrix.\n    * @throws org.apache.commons.math3.exception.OutOfRangeException\n    * if the specified column index is invalid.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.setColumnMatrix(int, org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 277,
      "end_line": 277,
      "comment": "\n    * Set the entries in column number {@code column}\n    * as a column matrix.\n    *\n    * @param column Column to be set.\n    * @param matrix column matrix (must have one column and the same\n    * number of rows as the instance).\n    * @throws org.apache.commons.math3.exception.OutOfRangeException\n    * if the specified column index is invalid.\n    * @throws MatrixDimensionMismatchException\n    * if the matrix dimensions do not match one instance column.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.getRowVector(int)",
      "begin_line": 288,
      "end_line": 288,
      "comment": "\n    * Get the entries in row number {@code row}\n    * as a vector.\n    *\n    * @param row Row to be fetched\n    * @return a row vector.\n    * @throws org.apache.commons.math3.exception.OutOfRangeException\n    * if the specified row index is invalid.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.setRowVector(int, org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 302,
      "end_line": 302,
      "comment": "\n    * Set the entries in row number {@code row}\n    * as a vector.\n    *\n    * @param row Row to be set.\n    * @param vector row vector (must have the same number of columns\n    * as the instance).\n    * @throws org.apache.commons.math3.exception.OutOfRangeException\n    * if the specified row index is invalid.\n    * @throws MatrixDimensionMismatchException\n    * if the vector dimension does not match one instance row.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.getColumnVector(int)",
      "begin_line": 313,
      "end_line": 313,
      "comment": "\n    * Returns the entries in column number {@code column}\n    * as a vector.\n    *\n    * @param column Column to be fetched.\n    * @return a column vector.\n    * @throws org.apache.commons.math3.exception.OutOfRangeException\n    * if the specified column index is invalid.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.setColumnVector(int, org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 327,
      "end_line": 327,
      "comment": "\n    * Set the entries in column number {@code column}\n    * as a vector.\n    *\n    * @param column Column to be set.\n    * @param vector Column vector (must have the same number of rows\n    * as the instance).\n    * @throws org.apache.commons.math3.exception.OutOfRangeException\n    * if the specified column index is invalid.\n    * @throws MatrixDimensionMismatchException\n    * if the vector dimension does not match one instance column.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.getRow(int)",
      "begin_line": 337,
      "end_line": 337,
      "comment": "\n     * Get the entries in row number {@code row} as an array.\n     *\n     * @param row Row to be fetched.\n     * @return array of entries in the row.\n     * @throws org.apache.commons.math3.exception.OutOfRangeException\n     * if the specified row index is not valid.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.setRow(int, T[])",
      "begin_line": 351,
      "end_line": 351,
      "comment": "\n     * Set the entries in row number {@code row}\n     * as a row matrix.\n     *\n     * @param row Row to be set.\n     * @param array Row matrix (must have the same number of columns as\n     * the instance).\n     * @throws org.apache.commons.math3.exception.OutOfRangeException\n     * if the specified row index is invalid.\n     * @throws MatrixDimensionMismatchException\n     * if the array size does not match one instance row.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.getColumn(int)",
      "begin_line": 361,
      "end_line": 361,
      "comment": "\n     * Get the entries in column number {@code col} as an array.\n     *\n     * @param column the column to be fetched\n     * @return array of entries in the column\n     * @throws org.apache.commons.math3.exception.OutOfRangeException\n     * if the specified column index is not valid.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.setColumn(int, T[])",
      "begin_line": 374,
      "end_line": 374,
      "comment": "\n     * Set the entries in column number {@code column}\n     * as a column matrix.\n     *\n     * @param column the column to be set\n     * @param array column array (must have the same number of rows as the instance)\n     * @throws org.apache.commons.math3.exception.OutOfRangeException\n     * if the specified column index is invalid.\n     * @throws MatrixDimensionMismatchException\n     * if the array size does not match one instance column.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.getEntry(int, int)",
      "begin_line": 385,
      "end_line": 385,
      "comment": "\n     * Returns the entry in the specified row and column.\n     *\n     * @param row  row location of entry to be fetched\n     * @param column  column location of entry to be fetched\n     * @return matrix entry in row,column\n     * @throws org.apache.commons.math3.exception.OutOfRangeException\n     * if the row or column index is not valid.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.setEntry(int, int, T)",
      "begin_line": 397,
      "end_line": 397,
      "comment": "\n     * Set the entry in the specified row and column.\n     *\n     * @param row  row location of entry to be set\n     * @param column  column location of entry to be set\n     * @param value matrix entry to be set in row,column\n     * @throws org.apache.commons.math3.exception.OutOfRangeException\n     * if the row or column index is not valid.\n     * @since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.addToEntry(int, int, T)",
      "begin_line": 410,
      "end_line": 410,
      "comment": "\n     * Change an entry in the specified row and column.\n     *\n     * @param row Row location of entry to be set.\n     * @param column Column location of entry to be set.\n     * @param increment Value to add to the current matrix entry in\n     * {@code (row, column)}.\n     * @throws org.apache.commons.math3.exception.OutOfRangeException\n     * if the row or column index is not valid.\n     * @since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.multiplyEntry(int, int, T)",
      "begin_line": 423,
      "end_line": 423,
      "comment": "\n     * Change an entry in the specified row and column.\n     *\n     * @param row Row location of entry to be set.\n     * @param column Column location of entry to be set.\n     * @param factor Multiplication factor for the current matrix entry\n     * in {@code (row,column)}\n     * @throws org.apache.commons.math3.exception.OutOfRangeException\n     * if the row or column index is not valid.\n     * @since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.transpose()",
      "begin_line": 430,
      "end_line": 430,
      "comment": "\n     * Returns the transpose of this matrix.\n     *\n     * @return transpose matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.getTrace()",
      "begin_line": 440,
      "end_line": 440,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/MatrixTrace.html\"\u003e\n     * trace\u003c/a\u003e of the matrix (the sum of the elements on the main diagonal).\n     *\n     * @return trace\n     * @throws NonSquareMatrixException\n     * if the matrix is not square.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.operate(T[])",
      "begin_line": 449,
      "end_line": 449,
      "comment": "\n     * Returns the result of multiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the vector to operate on\n     * @return this*v\n     * @throws IllegalArgumentException if columnDimension !\u003d v.size()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.operate(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 458,
      "end_line": 458,
      "comment": "\n     * Returns the result of multiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the vector to operate on\n     * @return this*v\n     * @throws IllegalArgumentException if columnDimension !\u003d v.size()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.preMultiply(T[])",
      "begin_line": 467,
      "end_line": 467,
      "comment": "\n     * Returns the (row) vector result of premultiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the row vector to premultiply by\n     * @return v*this\n     * @throws IllegalArgumentException if rowDimension !\u003d v.size()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.preMultiply(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 476,
      "end_line": 476,
      "comment": "\n     * Returns the (row) vector result of premultiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the row vector to premultiply by\n     * @return v*this\n     * @throws IllegalArgumentException if rowDimension !\u003d v.size()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 498,
      "end_line": 498,
      "comment": "\n     * Visit (and possibly change) all matrix entries in row order.\n     * \u003cp\u003eRow order starts at upper left and iterating through all elements\n     * of a row from left to right before going to the leftmost element\n     * of the next row.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 520,
      "end_line": 520,
      "comment": "\n     * Visit (but don\u0027t change) all matrix entries in row order.\n     * \u003cp\u003eRow order starts at upper left and iterating through all elements\n     * of a row from left to right before going to the leftmost element\n     * of the next row.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 548,
      "end_line": 549,
      "comment": "\n     * Visit (and possibly change) some matrix entries in row order.\n     * \u003cp\u003eRow order starts at upper left and iterating through all elements\n     * of a row from left to right before going to the leftmost element\n     * of the next row.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @throws org.apache.commons.math3.exception.OutOfRangeException\n     * if the indices are not valid.\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 577,
      "end_line": 578,
      "comment": "\n     * Visit (but don\u0027t change) some matrix entries in row order.\n     * \u003cp\u003eRow order starts at upper left and iterating through all elements\n     * of a row from left to right before going to the leftmost element\n     * of the next row.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @throws org.apache.commons.math3.exception.OutOfRangeException\n     * if the indices are not valid.\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 600,
      "end_line": 600,
      "comment": "\n     * Visit (and possibly change) all matrix entries in column order.\n     * \u003cp\u003eColumn order starts at upper left and iterating through all elements\n     * of a column from top to bottom before going to the topmost element\n     * of the next column.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 622,
      "end_line": 622,
      "comment": "\n     * Visit (but don\u0027t change) all matrix entries in column order.\n     * \u003cp\u003eColumn order starts at upper left and iterating through all elements\n     * of a column from top to bottom before going to the topmost element\n     * of the next column.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 650,
      "end_line": 651,
      "comment": "\n     * Visit (and possibly change) some matrix entries in column order.\n     * \u003cp\u003eColumn order starts at upper left and iterating through all elements\n     * of a column from top to bottom before going to the topmost element\n     * of the next column.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @throws org.apache.commons.math3.exception.OutOfRangeException\n     * if the indices are not valid.\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.walkInColumnOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 679,
      "end_line": 680,
      "comment": "\n     * Visit (but don\u0027t change) some matrix entries in column order.\n     * \u003cp\u003eColumn order starts at upper left and iterating through all elements\n     * of a column from top to bottom before going to the topmost element\n     * of the next column.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @throws org.apache.commons.math3.exception.OutOfRangeException\n     * if the indices are not valid.\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 701,
      "end_line": 701,
      "comment": "\n     * Visit (and possibly change) all matrix entries using the fastest possible order.\n     * \u003cp\u003eThe fastest walking order depends on the exact matrix class. It may be\n     * different from traditional row or column orders.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 722,
      "end_line": 722,
      "comment": "\n     * Visit (but don\u0027t change) all matrix entries using the fastest possible order.\n     * \u003cp\u003eThe fastest walking order depends on the exact matrix class. It may be\n     * different from traditional row or column orders.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 749,
      "end_line": 750,
      "comment": "\n     * Visit (and possibly change) some matrix entries using the fastest possible order.\n     * \u003cp\u003eThe fastest walking order depends on the exact matrix class. It may be\n     * different from traditional row or column orders.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index (inclusive)\n     * @throws org.apache.commons.math3.exception.OutOfRangeException\n     * if the indices are not valid.\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 777,
      "end_line": 778,
      "comment": "\n     * Visit (but don\u0027t change) some matrix entries using the fastest possible order.\n     * \u003cp\u003eThe fastest walking order depends on the exact matrix class. It may be\n     * different from traditional row or column orders.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index (inclusive)\n     * @throws org.apache.commons.math3.exception.OutOfRangeException\n     * if the indices are not valid.\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    }
  ]
}