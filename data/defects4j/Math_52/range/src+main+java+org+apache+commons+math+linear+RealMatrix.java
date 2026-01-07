{
  "filepath": "/tmp/Math-52b/src/main/java/org/apache/commons/math/linear/RealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealMatrix",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math.linear.AnyMatrix"
      ],
      "begin_line": 33,
      "end_line": 808,
      "comment": "\n * Interface defining a real-valued matrix with basic algebraic operations.\n * \u003cp\u003e\n * Matrix element indexing is 0-based -- e.g., \u003ccode\u003egetEntry(0, 0)\u003c/code\u003e\n * returns the element in the first row, first column of the matrix.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.createMatrix(int, int)",
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Create a new RealMatrix of the same type as the instance with the supplied\n     * row and column dimensions.\n     *\n     * @param rowDimension  the number of rows in the new matrix\n     * @param columnDimension  the number of columns in the new matrix\n     * @return a new matrix of the same type as the instance\n     * @throws org.apache.commons.math.exception.NotStrictlyPositiveException\n     * if row or column dimension is not positive.\n     * @since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.copy()",
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Returns a (deep) copy of this.\n     *\n     * @return matrix copy\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.add(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Compute the sum of this and m.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * Compute this minus m.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this - m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.scalarAdd(double)",
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * Returns the result of adding d to each entry of this.\n     *\n     * @param d    value to be added to each entry\n     * @return     d + this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.scalarMultiply(double)",
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * Returns the result multiplying each entry of this by d.\n     *\n     * @param d    value to multiply all entries by\n     * @return     d * this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 96,
      "end_line": 96,
      "comment": "\n     * Returns the result of postmultiplying this by m.\n     *\n     * @param m    matrix to postmultiply by\n     * @return     this * m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.preMultiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n     * Returns the result premultiplying this by \u003ccode\u003em\u003c/code\u003e.\n     * @param m    matrix to premultiply by\n     * @return     m * this\n     * @throws     IllegalArgumentException\n     *             if rowDimension(this) !\u003d columnDimension(m)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.power(int)",
      "begin_line": 115,
      "end_line": 115,
      "comment": "\n     * Returns the result multiplying this with itself \u003ccode\u003ep\u003c/code\u003e times.\n     * Depending on the underlying storage, instability for high powers might occur.\n     * @param      p raise this to power p\n     * @return     this^p\n     * @throws     IllegalArgumentException if p \u003c 0\n     *             NonSquareMatrixException if the matrix is not square\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.getData()",
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n     * Returns matrix entries as a two-dimensional array.\n     *\n     * @return    2-dimensional array of entries\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.getNorm()",
      "begin_line": 130,
      "end_line": 130,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/MaximumAbsoluteRowSumNorm.html\"\u003e\n     * maximum absolute row sum norm\u003c/a\u003e of the matrix.\n     *\n     * @return norm\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.getFrobeniusNorm()",
      "begin_line": 138,
      "end_line": 138,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/FrobeniusNorm.html\"\u003e\n     * Frobenius norm\u003c/a\u003e of the matrix.\n     *\n     * @return norm\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 153,
      "end_line": 153,
      "comment": "\n     * Gets a submatrix. Rows and columns are indicated\n     * counting from 0 to n-1.\n     *\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index (inclusive)\n     * @return The subMatrix containing the data of the\n     *         specified rows and columns\n     * @throws org.apache.commons.math.exception.OutOfRangeException if\n     * the indices are not valid.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.getSubMatrix(int[], int[])",
      "begin_line": 166,
      "end_line": 166,
      "comment": "\n    * Gets a submatrix. Rows and columns are indicated\n    * counting from 0 to n-1.\n    *\n    * @param selectedRows Array of row indices.\n    * @param selectedColumns Array of column indices.\n    * @return The subMatrix containing the data in the\n    *         specified rows and columns\n    * @throws org.apache.commons.math.exception.OutOfRangeException if\n    * the indices are not valid.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.copySubMatrix(int, int, int, int, double[][])",
      "begin_line": 182,
      "end_line": 183,
      "comment": "\n    * Copy a submatrix. Rows and columns are indicated\n    * counting from 0 to n-1.\n    *\n    * @param startRow Initial row index\n    * @param endRow Final row index (inclusive)\n    * @param startColumn Initial column index\n    * @param endColumn Final column index (inclusive)\n    * @param destination The arrays where the submatrix data should be copied\n    * (if larger than rows/columns counts, only the upper-left part will be used)\n    * @throws org.apache.commons.math.exception.OutOfRangeException if the\n    * indices are not valid.\n    * @exception IllegalArgumentException if the destination array is too small\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.copySubMatrix(int[], int[], double[][])",
      "begin_line": 196,
      "end_line": 196,
      "comment": "\n     * Copy a submatrix. Rows and columns are indicated\n     * counting from 0 to n-1.\n     *\n     * @param selectedRows Array of row indices.\n     * @param selectedColumns Array of column indices.\n     * @param destination The arrays where the submatrix data should be copied\n     * (if larger than rows/columns counts, only the upper-left part will be used)\n     * @throws org.apache.commons.math.exception.OutOfRangeException if the\n     * indices are not valid.\n     * @exception IllegalArgumentException if the destination array is too small\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 226,
      "end_line": 227,
      "comment": "\n    * Replace the submatrix starting at \u003ccode\u003erow, column\u003c/code\u003e using data in\n    * the input \u003ccode\u003esubMatrix\u003c/code\u003e array. Indexes are 0-based.\n    * \u003cp\u003e\n    * Example:\u003cbr\u003e\n    * Starting with \u003cpre\u003e\n    * 1  2  3  4\n    * 5  6  7  8\n    * 9  0  1  2\n    * \u003c/pre\u003e\n    * and \u003ccode\u003esubMatrix \u003d {{3, 4} {5,6}}\u003c/code\u003e, invoking\n    * \u003ccode\u003esetSubMatrix(subMatrix,1,1))\u003c/code\u003e will result in \u003cpre\u003e\n    * 1  2  3  4\n    * 5  3  4  8\n    * 9  5  6  2\n    * \u003c/pre\u003e\u003c/p\u003e\n    *\n    * @param subMatrix  array containing the submatrix replacement data\n    * @param row  row coordinate of the top, left element to be replaced\n    * @param column  column coordinate of the top, left element to be replaced\n    * @throws ZeroException if {@code subMatrix} does not contain at least one column.\n    * @throws OutOfRangeException if {@code subMatrix} does not fit into\n    * this matrix from element in {@code (row, column)}.\n    * @throws DimensionMismatchException if {@code subMatrix} is not rectangular.\n    * (not all rows have the same length) or empty.\n    * @throws NullArgumentException if {@code subMatrix} is {@code null}.\n    * @since 2.0\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.getRowMatrix(int)",
      "begin_line": 238,
      "end_line": 238,
      "comment": "\n    * Geet the entries at the given row index\n    * as a row matrix.  Row indices start at 0.\n    *\n    * @param row Row to be fetched.\n    * @return row Matrix.\n    * @throws org.apache.commons.math.exception.OutOfRangeException if\n    * the specified row index is invalid.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.setRowMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 252,
      "end_line": 252,
      "comment": "\n    * Set the entries at the given row index\n    * as a row matrix.  Row indices start at 0.\n    *\n    * @param row Row to be set.\n    * @param matrix Row matrix (must have one row and the same number of\n    * columns as the instance).\n    * @throws org.apache.commons.math.exception.OutOfRangeException if the\n    * specified row index is invalid.\n    * @throws MatrixDimensionMismatchException\n    * if the matrix dimensions do not match one instance row.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.getColumnMatrix(int)",
      "begin_line": 263,
      "end_line": 263,
      "comment": "\n    * Get the entries at the given column index\n    * as a column matrix.  Column indices start at 0.\n    *\n    * @param column Column to be fetched.\n    * @return column Matrix.\n    * @throws org.apache.commons.math.exception.OutOfRangeException if\n    * the specified column index is invalid.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 277,
      "end_line": 277,
      "comment": "\n    * Set the entries at the given column index\n    * as a column matrix.  Column indices start at 0.\n    *\n    * @param column Column to be set.\n    * @param matrix Column matrix (must have one column and the same number\n    * of rows as the instance).\n    * @throws org.apache.commons.math.exception.OutOfRangeException if\n    * the specified column index is invalid.\n    * @throws MatrixDimensionMismatchException\n    * if the {@code matrix} dimensions do not match one instance column.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.getRowVector(int)",
      "begin_line": 288,
      "end_line": 288,
      "comment": "\n    * Returns the entries in row number \u003ccode\u003erow\u003c/code\u003e\n    * as a vector.  Row indices start at 0.\n    *\n    * @param row Row to be fetched.\n    * @return a row vector.\n    * @throws org.apache.commons.math.exception.OutOfRangeException if\n    * the specified row index is invalid.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.setRowVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 302,
      "end_line": 302,
      "comment": "\n    * Set the entries at the given row index.\n    * as a vector.  Row indices start at 0.\n    *\n    * @param row Row to be set.\n    * @param vector row vector (must have the same number of columns\n    * as the instance).\n    * @throws org.apache.commons.math.exception.OutOfRangeException if\n    * the specified row index is invalid.\n    * @throws MatrixDimensionMismatchException\n    * if the vector dimension does not match one instance row.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.getColumnVector(int)",
      "begin_line": 313,
      "end_line": 313,
      "comment": "\n    * Get the entries at the given column index\n    * as a vector.  Column indices start at 0.\n    *\n    * @param column Column to be fetched.\n    * @return a column vector.\n    * @throws org.apache.commons.math.exception.OutOfRangeException if\n    * the specified column index is invalid\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.setColumnVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 327,
      "end_line": 327,
      "comment": "\n    * Set the entries at the given column index\n    * as a vector.  Column indices start at 0.\n    *\n    * @param column Column to be set.\n    * @param vector column vector (must have the same number of rows as\n    * the instance).\n    * @throws org.apache.commons.math.exception.OutOfRangeException if the\n    * specified column index is invalid.\n    * @throws MatrixDimensionMismatchException\n    * if the vector dimension does not match one instance column.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.getRow(int)",
      "begin_line": 338,
      "end_line": 338,
      "comment": "\n     * Get the entries at the given row index.\n     * Row indices start at 0.\n     *\n     * @param row Row to be fetched.\n     * @return the array of entries in the row.\n     * @throws org.apache.commons.math.exception.OutOfRangeException if the\n     * specified row index is not valid.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.setRow(int, double[])",
      "begin_line": 352,
      "end_line": 352,
      "comment": "\n     * Set the entries at the given row index\n     * as a row matrix.  Row indices start at 0.\n     *\n     * @param row Row to be set.\n     * @param array Row matrix (must have the same number of columns as\n     * the instance)\n     * @throws org.apache.commons.math.exception.OutOfRangeException if the\n     * specified row index is invalid.\n     * @throws MatrixDimensionMismatchException\n     * if the array size does not match one instance row.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.getColumn(int)",
      "begin_line": 363,
      "end_line": 363,
      "comment": "\n     * Get the entries at the given column index as an array.\n     * Column indices start at 0.\n     *\n     * @param column Column to be fetched.\n     * @return the array of entries in the column.\n     * @throws org.apache.commons.math.exception.OutOfRangeException if the\n     * specified column index is not valid.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.setColumn(int, double[])",
      "begin_line": 377,
      "end_line": 377,
      "comment": "\n     * Set the entries at the given column index\n     * as a column matrix array.  Column indices start at 0.\n     *\n     * @param column Column to be set.\n     * @param array Column array (must have the same number of rows as\n     * the instance).\n     * @throws org.apache.commons.math.exception.OutOfRangeException if the\n     * specified column index is invalid.\n     * @throws MatrixDimensionMismatchException\n     * if the array size does not match one instance column.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.getEntry(int, int)",
      "begin_line": 389,
      "end_line": 389,
      "comment": "\n     * Get the entry in the specified row and column.\n     * Row and column indices start at 0.\n     *\n     * @param row Row location of entry to be fetched.\n     * @param column Column location of entry to be fetched.\n     * @return the matrix entry at {@code (row, column)}.\n     * @throws org.apache.commons.math.exception.OutOfRangeException if the\n     * row or column index is not valid.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.setEntry(int, int, double)",
      "begin_line": 402,
      "end_line": 402,
      "comment": "\n     * Set the entry in the specified row and column.\n     * Row and column indices start at 0.\n     *\n     * @param row Row location of entry to be set.\n     * @param column Column location of entry to be set.\n     * @param value matrix entry to be set.\n     * @throws org.apache.commons.math.exception.OutOfRangeException if\n     * the row or column index is not valid\n     * @since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.addToEntry(int, int, double)",
      "begin_line": 415,
      "end_line": 415,
      "comment": "\n     * Change an entry in the specified row and column.\n     * Row and column indices start at 0.\n     *\n     * @param row Row location of entry to be set.\n     * @param column Column location of entry to be set.\n     * @param increment value to add to the matrix entry.\n     * @throws org.apache.commons.math.exception.OutOfRangeException if\n     * the row or column index is not valid.\n     * @since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 428,
      "end_line": 428,
      "comment": "\n     * Change an entry in the specified row and column.\n     * Row and column indices start at 0.\n     *\n     * @param row Row location of entry to be set.\n     * @param column Column location of entry to be set.\n     * @param factor Multiplication factor for the matrix entry.\n     * @throws org.apache.commons.math.exception.OutOfRangeException if\n     * the row or column index is not valid.\n     * @since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.transpose()",
      "begin_line": 435,
      "end_line": 435,
      "comment": "\n     * Returns the transpose of this matrix.\n     *\n     * @return transpose matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.getTrace()",
      "begin_line": 445,
      "end_line": 445,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/MatrixTrace.html\"\u003e\n     * trace\u003c/a\u003e of the matrix (the sum of the elements on the main diagonal).\n     *\n     * @return the trace.\n     * @throws NonSquareMatrixException\n     * if the matrix is not square.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.operate(double[])",
      "begin_line": 454,
      "end_line": 454,
      "comment": "\n     * Returns the result of multiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the vector to operate on\n     * @return this*v\n     * @throws IllegalArgumentException if columnDimension !\u003d v.size()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.operate(org.apache.commons.math.linear.RealVector)",
      "begin_line": 463,
      "end_line": 463,
      "comment": "\n     * Returns the result of multiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the vector to operate on\n     * @return this*v\n     * @throws IllegalArgumentException if columnDimension !\u003d v.size()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.preMultiply(double[])",
      "begin_line": 472,
      "end_line": 472,
      "comment": "\n     * Returns the (row) vector result of premultiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the row vector to premultiply by\n     * @return v*this\n     * @throws IllegalArgumentException if rowDimension !\u003d v.size()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.preMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 481,
      "end_line": 481,
      "comment": "\n     * Returns the (row) vector result of premultiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the row vector to premultiply by\n     * @return v*this\n     * @throws IllegalArgumentException if rowDimension !\u003d v.size()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 505,
      "end_line": 505,
      "comment": "\n     * Visit (and possibly change) all matrix entries in row order.\n     * \u003cp\u003eRow order starts at upper left and iterating through all elements\n     * of a row from left to right before going to the leftmost element\n     * of the next row.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @throws org.apache.commons.math.exception.MathUserException if the visitor\n     * cannot process an entry.\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 529,
      "end_line": 529,
      "comment": "\n     * Visit (but don\u0027t change) all matrix entries in row order.\n     * \u003cp\u003eRow order starts at upper left and iterating through all elements\n     * of a row from left to right before going to the leftmost element\n     * of the next row.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @throws org.apache.commons.math.exception.MathUserException if the visitor\n     * cannot process an entry.\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 559,
      "end_line": 560,
      "comment": "\n     * Visit (and possibly change) some matrix entries in row order.\n     * \u003cp\u003eRow order starts at upper left and iterating through all elements\n     * of a row from left to right before going to the leftmost element\n     * of the next row.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @throws org.apache.commons.math.exception.MathUserException if the visitor\n     * cannot process an entry.\n     * @throws org.apache.commons.math.exception.OutOfRangeException if\n     * the indices are not valid.\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 590,
      "end_line": 591,
      "comment": "\n     * Visit (but don\u0027t change) some matrix entries in row order.\n     * \u003cp\u003eRow order starts at upper left and iterating through all elements\n     * of a row from left to right before going to the leftmost element\n     * of the next row.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @throws org.apache.commons.math.exception.MathUserException if the visitor\n     * cannot process an entry.\n     * @throws org.apache.commons.math.exception.OutOfRangeException if\n     * the indices are not valid.\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 615,
      "end_line": 615,
      "comment": "\n     * Visit (and possibly change) all matrix entries in column order.\n     * \u003cp\u003eColumn order starts at upper left and iterating through all elements\n     * of a column from top to bottom before going to the topmost element\n     * of the next column.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @throws org.apache.commons.math.exception.MathUserException if the visitor\n     * cannot process an entry.\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 639,
      "end_line": 639,
      "comment": "\n     * Visit (but don\u0027t change) all matrix entries in column order.\n     * \u003cp\u003eColumn order starts at upper left and iterating through all elements\n     * of a column from top to bottom before going to the topmost element\n     * of the next column.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @throws org.apache.commons.math.exception.MathUserException if the visitor\n     * cannot process an entry.\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 669,
      "end_line": 670,
      "comment": "\n     * Visit (and possibly change) some matrix entries in column order.\n     * \u003cp\u003eColumn order starts at upper left and iterating through all elements\n     * of a column from top to bottom before going to the topmost element\n     * of the next column.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @throws org.apache.commons.math.exception.MathUserException if the visitor\n     * cannot process an entry.\n     * @throws org.apache.commons.math.exception.OutOfRangeException if\n     * the indices are not valid.\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 700,
      "end_line": 701,
      "comment": "\n     * Visit (but don\u0027t change) some matrix entries in column order.\n     * \u003cp\u003eColumn order starts at upper left and iterating through all elements\n     * of a column from top to bottom before going to the topmost element\n     * of the next column.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @throws org.apache.commons.math.exception.MathUserException if the visitor\n     * cannot process an entry.\n     * @throws org.apache.commons.math.exception.OutOfRangeException if\n     * the indices are not valid.\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 724,
      "end_line": 724,
      "comment": "\n     * Visit (and possibly change) all matrix entries using the fastest possible order.\n     * \u003cp\u003eThe fastest walking order depends on the exact matrix class. It may be\n     * different from traditional row or column orders.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @throws org.apache.commons.math.exception.MathUserException if the visitor\n     * cannot process an entry.\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 747,
      "end_line": 747,
      "comment": "\n     * Visit (but don\u0027t change) all matrix entries using the fastest possible order.\n     * \u003cp\u003eThe fastest walking order depends on the exact matrix class. It may be\n     * different from traditional row or column orders.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @throws org.apache.commons.math.exception.MathUserException if the visitor\n     * cannot process an entry.\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 776,
      "end_line": 777,
      "comment": "\n     * Visit (and possibly change) some matrix entries using the fastest possible order.\n     * \u003cp\u003eThe fastest walking order depends on the exact matrix class. It may be\n     * different from traditional row or column orders.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index (inclusive)\n     * @throws org.apache.commons.math.exception.MathUserException if the visitor\n     * cannot process an entry.\n     * @throws org.apache.commons.math.exception.OutOfRangeException if\n     * the indices are not valid.\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 806,
      "end_line": 807,
      "comment": "\n     * Visit (but don\u0027t change) some matrix entries using the fastest possible order.\n     * \u003cp\u003eThe fastest walking order depends on the exact matrix class. It may be\n     * different from traditional row or column orders.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index (inclusive)\n     * @throws org.apache.commons.math.exception.MathUserException if the visitor\n     * cannot process an entry.\n     * @throws org.apache.commons.math.exception.OutOfRangeException if the\n     * indices are not valid.\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    }
  ]
}