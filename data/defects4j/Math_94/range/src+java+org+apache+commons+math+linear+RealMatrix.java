{
  "filepath": "/tmp/Math-94b/src/java/org/apache/commons/math/linear/RealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealMatrix",
      "is_interface": true,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 880,
      "comment": "\n * Interface defining a real-valued matrix with basic algebraic operations.\n * \u003cp\u003e\n * Matrix element indexing is 0-based -- e.g., \u003ccode\u003egetEntry(0, 0)\u003c/code\u003e\n * returns the element in the first row, first column of the matrix.\u003c/p\u003e\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.createMatrix(int, int)",
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Create a new RealMatrix of the same type as the instance with the supplied\n     * row and column dimensions.\n     *\n     * @param rowDimension  the number of rows in the new matrix\n     * @param columnDimension  the number of columns in the new matrix\n     * @return a new matrix of the same type as the instance\n     * @throws IllegalArgumentException if row or column dimension is not positive\n     * @since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.copy()",
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Returns a (deep) copy of this.\n     *\n     * @return matrix copy\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.add(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Compute the sum of this and m.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Compute this minus m.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.scalarAdd(double)",
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * Returns the result of adding d to each entry of this.\n     *\n     * @param d    value to be added to each entry\n     * @return     d + this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.scalarMultiply(double)",
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * Returns the result multiplying each entry of this by d.\n     *\n     * @param d    value to multiply all entries by\n     * @return     d * this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n     * Returns the result of postmultiplying this by m.\n     *\n     * @param m    matrix to postmultiply by\n     * @return     this * m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.preMultiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * Returns the result premultiplying this by \u003ccode\u003em\u003c/code\u003e.\n     * @param m    matrix to premultiply by\n     * @return     m * this\n     * @throws     IllegalArgumentException\n     *             if rowDimension(this) !\u003d columnDimension(m)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.getData()",
      "begin_line": 109,
      "end_line": 109,
      "comment": "\n     * Returns matrix entries as a two-dimensional array.\n     *\n     * @return    2-dimensional array of entries\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.getNorm()",
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/MaximumAbsoluteRowSumNorm.html\"\u003e\n     * maximum absolute row sum norm\u003c/a\u003e of the matrix.\n     *\n     * @return norm\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.getFrobeniusNorm()",
      "begin_line": 125,
      "end_line": 125,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/FrobeniusNorm.html\"\u003e\n     * Frobenius norm\u003c/a\u003e of the matrix.\n     *\n     * @return norm\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 139,
      "end_line": 140,
      "comment": "\n     * Gets a submatrix. Rows and columns are indicated\n     * counting from 0 to n-1.\n     *\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index (inclusive)\n     * @return The subMatrix containing the data of the\n     *         specified rows and columns\n     * @exception MatrixIndexException  if the indices are not valid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.getSubMatrix(int[], int[])",
      "begin_line": 152,
      "end_line": 153,
      "comment": "\n    * Gets a submatrix. Rows and columns are indicated\n    * counting from 0 to n-1.\n    *\n    * @param selectedRows Array of row indices.\n    * @param selectedColumns Array of column indices.\n    * @return The subMatrix containing the data in the\n    *         specified rows and columns\n    * @exception MatrixIndexException if row or column selections are not valid\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.copySubMatrix(int, int, int, int, double[][])",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n    * Copy a submatrix. Rows and columns are indicated\n    * counting from 0 to n-1.\n    *\n    * @param startRow Initial row index\n    * @param endRow Final row index (inclusive)\n    * @param startColumn Initial column index\n    * @param endColumn Final column index (inclusive)\n    * @param destination The arrays where the submatrix data should be copied\n    * (if larger than rows/columns counts, only the upper-left part will be used)\n    * @exception MatrixIndexException if the indices are not valid\n    * @exception IllegalArgumentException if the destination array is too small\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.copySubMatrix(int[], int[], double[][])",
      "begin_line": 183,
      "end_line": 184,
      "comment": "\n   * Copy a submatrix. Rows and columns are indicated\n   * counting from 0 to n-1.\n   *\n    * @param selectedRows Array of row indices.\n    * @param selectedColumns Array of column indices.\n   * @param destination The arrays where the submatrix data should be copied\n   * (if larger than rows/columns counts, only the upper-left part will be used)\n   * @exception MatrixIndexException if the indices are not valid\n   * @exception IllegalArgumentException if the destination array is too small\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 213,
      "end_line": 214,
      "comment": "\n    * Replace the submatrix starting at \u003ccode\u003erow, column\u003c/code\u003e using data in\n    * the input \u003ccode\u003esubMatrix\u003c/code\u003e array. Indexes are 0-based.\n    * \u003cp\u003e \n    * Example:\u003cbr\u003e\n    * Starting with \u003cpre\u003e\n    * 1  2  3  4\n    * 5  6  7  8\n    * 9  0  1  2\n    * \u003c/pre\u003e\n    * and \u003ccode\u003esubMatrix \u003d {{3, 4} {5,6}}\u003c/code\u003e, invoking \n    * \u003ccode\u003esetSubMatrix(subMatrix,1,1))\u003c/code\u003e will result in \u003cpre\u003e\n    * 1  2  3  4\n    * 5  3  4  8\n    * 9  5  6  2\n    * \u003c/pre\u003e\u003c/p\u003e\n    * \n    * @param subMatrix  array containing the submatrix replacement data\n    * @param row  row coordinate of the top, left element to be replaced\n    * @param column  column coordinate of the top, left element to be replaced\n    * @throws MatrixIndexException  if subMatrix does not fit into this \n    *    matrix from element in (row, column) \n    * @throws IllegalArgumentException if \u003ccode\u003esubMatrix\u003c/code\u003e is not rectangular\n    *  (not all rows have the same length) or empty\n    * @throws NullPointerException if \u003ccode\u003esubMatrix\u003c/code\u003e is null\n    * @since 2.0\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.getRowMatrix(int)",
      "begin_line": 224,
      "end_line": 224,
      "comment": "\n    * Returns the entries in row number \u003ccode\u003erow\u003c/code\u003e\n    * as a row matrix.  Row indices start at 0.\n    *\n    * @param row the row to be fetched\n    * @return row matrix\n    * @throws MatrixIndexException if the specified row index is invalid\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.setRowMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 237,
      "end_line": 238,
      "comment": "\n    * Sets the entries in row number \u003ccode\u003erow\u003c/code\u003e\n    * as a row matrix.  Row indices start at 0.\n    *\n    * @param row the row to be set\n    * @param matrix row matrix (must have one row and the same number of columns\n    * as the instance)\n    * @throws MatrixIndexException if the specified row index is invalid\n    * @throws InvalidMatrixException if the matrix dimensions do not match one\n    * instance row\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.getColumnMatrix(int)",
      "begin_line": 248,
      "end_line": 248,
      "comment": "\n    * Returns the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n    * as a column matrix.  Column indices start at 0.\n    *\n    * @param column the column to be fetched\n    * @return column matrix\n    * @throws MatrixIndexException if the specified column index is invalid\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 261,
      "end_line": 262,
      "comment": "\n    * Sets the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n    * as a column matrix.  Column indices start at 0.\n    *\n    * @param column the column to be set\n    * @param matrix column matrix (must have one column and the same number of rows\n    * as the instance)\n    * @throws MatrixIndexException if the specified column index is invalid\n    * @throws InvalidMatrixException if the matrix dimensions do not match one\n    * instance column\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.getRowVector(int)",
      "begin_line": 272,
      "end_line": 272,
      "comment": "\n    * Returns the entries in row number \u003ccode\u003erow\u003c/code\u003e\n    * as a vector.  Row indices start at 0.\n    *\n    * @param row the row to be fetched\n    * @return row vector\n    * @throws MatrixIndexException if the specified row index is invalid\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.setRowVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 285,
      "end_line": 286,
      "comment": "\n    * Sets the entries in row number \u003ccode\u003erow\u003c/code\u003e\n    * as a vector.  Row indices start at 0.\n    *\n    * @param row the row to be set\n    * @param vector row vector (must have the same number of columns\n    * as the instance)\n    * @throws MatrixIndexException if the specified row index is invalid\n    * @throws InvalidMatrixException if the vector dimension does not match one\n    * instance row\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.getColumnVector(int)",
      "begin_line": 296,
      "end_line": 296,
      "comment": "\n    * Returns the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n    * as a vector.  Column indices start at 0.\n    *\n    * @param column the column to be fetched\n    * @return column vector\n    * @throws MatrixIndexException if the specified column index is invalid\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.setColumnVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 308,
      "end_line": 309,
      "comment": "\n    * Sets the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n    * as a vector.  Column indices start at 0.\n    *\n    * @param column the column to be set\n    * @param vector column vector (must have the same number of rows as the instance)\n    * @throws MatrixIndexException if the specified column index is invalid\n    * @throws InvalidMatrixException if the vector dimension does not match one\n    * instance column\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.getRow(int)",
      "begin_line": 321,
      "end_line": 321,
      "comment": "\n     * Returns the entries in row number \u003ccode\u003erow\u003c/code\u003e as an array.\n     * \u003cp\u003e\n     * Row indices start at 0.  A \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown\n     * unless \u003ccode\u003e0 \u003c\u003d row \u003c rowDimension.\u003c/code\u003e\u003c/p\u003e\n     *\n     * @param row the row to be fetched\n     * @return array of entries in the row\n     * @throws MatrixIndexException if the specified row index is not valid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.setRow(int, double[])",
      "begin_line": 333,
      "end_line": 334,
      "comment": "\n     * Sets the entries in row number \u003ccode\u003erow\u003c/code\u003e\n     * as a row matrix.  Row indices start at 0.\n     *\n     * @param row the row to be set\n     * @param array row matrix (must have the same number of columns as the instance)\n     * @throws MatrixIndexException if the specified row index is invalid\n     * @throws InvalidMatrixException if the array size does not match one\n     * instance row\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.getColumn(int)",
      "begin_line": 346,
      "end_line": 346,
      "comment": "\n     * Returns the entries in column number \u003ccode\u003ecol\u003c/code\u003e as an array.\n     * \u003cp\u003e\n     * Column indices start at 0.  A \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown\n     * unless \u003ccode\u003e0 \u003c\u003d column \u003c columnDimension.\u003c/code\u003e\u003c/p\u003e\n     *\n     * @param column the column to be fetched\n     * @return array of entries in the column\n     * @throws MatrixIndexException if the specified column index is not valid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.setColumn(int, double[])",
      "begin_line": 358,
      "end_line": 359,
      "comment": "\n     * Sets the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n     * as a column matrix.  Column indices start at 0.\n     *\n     * @param column the column to be set\n     * @param array column array (must have the same number of rows as the instance)\n     * @throws MatrixIndexException if the specified column index is invalid\n     * @throws InvalidMatrixException if the array size does not match one\n     * instance column\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.getEntry(int, int)",
      "begin_line": 376,
      "end_line": 376,
      "comment": "\n     * Returns the entry in the specified row and column.\n     * \u003cp\u003e\n     * Row and column indices start at 0 and must satisfy \n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e0 \u003c\u003d row \u003c rowDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e 0 \u003c\u003d column \u003c columnDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * otherwise a \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown.\u003c/p\u003e\n     * \n     * @param row  row location of entry to be fetched\n     * @param column  column location of entry to be fetched\n     * @return matrix entry in row,column\n     * @throws MatrixIndexException if the row or column index is not valid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.setEntry(int, int, double)",
      "begin_line": 394,
      "end_line": 394,
      "comment": "\n     * Set the entry in the specified row and column.\n     * \u003cp\u003e\n     * Row and column indices start at 0 and must satisfy \n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e0 \u003c\u003d row \u003c rowDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e 0 \u003c\u003d column \u003c columnDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * otherwise a \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown.\u003c/p\u003e\n     * \n     * @param row  row location of entry to be set\n     * @param column  column location of entry to be set\n     * @param value matrix entry to be set in row,column\n     * @throws MatrixIndexException if the row or column index is not valid\n     * @since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.addToEntry(int, int, double)",
      "begin_line": 412,
      "end_line": 412,
      "comment": "\n     * Change an entry in the specified row and column.\n     * \u003cp\u003e\n     * Row and column indices start at 0 and must satisfy \n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e0 \u003c\u003d row \u003c rowDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e 0 \u003c\u003d column \u003c columnDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * otherwise a \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown.\u003c/p\u003e\n     * \n     * @param row  row location of entry to be set\n     * @param column  column location of entry to be set\n     * @param increment value to add to the current matrix entry in row,column\n     * @throws MatrixIndexException if the row or column index is not valid\n     * @since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 430,
      "end_line": 430,
      "comment": "\n     * Change an entry in the specified row and column.\n     * \u003cp\u003e\n     * Row and column indices start at 0 and must satisfy \n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e0 \u003c\u003d row \u003c rowDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e 0 \u003c\u003d column \u003c columnDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * otherwise a \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown.\u003c/p\u003e\n     * \n     * @param row  row location of entry to be set\n     * @param column  column location of entry to be set\n     * @param factor multiplication factor for the current matrix entry in row,column\n     * @throws MatrixIndexException if the row or column index is not valid\n     * @since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.transpose()",
      "begin_line": 437,
      "end_line": 437,
      "comment": "\n     * Returns the transpose of this matrix.\n     *\n     * @return transpose matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.inverse()",
      "begin_line": 446,
      "end_line": 447,
      "comment": "\n     * Returns the inverse of this matrix.\n     *\n     * @return inverse matrix\n     * @throws InvalidMatrixException if  this is not invertible\n     * @deprecated as of release 2.0, replaced by {@link DecompositionSolver#getInverse()}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.getDeterminant()",
      "begin_line": 455,
      "end_line": 456,
      "comment": "\n     * Returns the determinant of this matrix.\n     *\n     * @return determinant\n     * @deprecated as of release 2.0, replaced by {@link LUDecomposition#getDeterminant()}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.isSquare()",
      "begin_line": 462,
      "end_line": 462,
      "comment": "\n     * Is this a square matrix?\n     * @return true if the matrix is square (rowDimension \u003d columnDimension)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.isSingular()",
      "begin_line": 470,
      "end_line": 471,
      "comment": "\n     * Is this a singular matrix?\n     * @return true if the matrix is singular\n     * @deprecated as of release 2.0, replaced by the boolean negation of\n     * {@link DecompositionSolver#isNonSingular()}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.getRowDimension()",
      "begin_line": 478,
      "end_line": 478,
      "comment": "\n     * Returns the number of rows in the matrix.\n     *\n     * @return rowDimension\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.getColumnDimension()",
      "begin_line": 485,
      "end_line": 485,
      "comment": "\n     * Returns the number of columns in the matrix.\n     *\n     * @return columnDimension\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.getTrace()",
      "begin_line": 494,
      "end_line": 494,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/MatrixTrace.html\"\u003e\n     * trace\u003c/a\u003e of the matrix (the sum of the elements on the main diagonal).\n     *\n     * @return trace\n     * @throws NonSquareMatrixException if the matrix is not square\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.operate(double[])",
      "begin_line": 503,
      "end_line": 503,
      "comment": "\n     * Returns the result of multiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the vector to operate on\n     * @return this*v\n     * @throws IllegalArgumentException if columnDimension !\u003d v.size()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.operate(org.apache.commons.math.linear.RealVector)",
      "begin_line": 512,
      "end_line": 512,
      "comment": "\n     * Returns the result of multiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the vector to operate on\n     * @return this*v\n     * @throws IllegalArgumentException if columnDimension !\u003d v.size()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.preMultiply(double[])",
      "begin_line": 521,
      "end_line": 521,
      "comment": "\n     * Returns the (row) vector result of premultiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the row vector to premultiply by\n     * @return v*this\n     * @throws IllegalArgumentException if rowDimension !\u003d v.size()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.preMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 530,
      "end_line": 530,
      "comment": "\n     * Returns the (row) vector result of premultiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the row vector to premultiply by\n     * @return v*this\n     * @throws IllegalArgumentException if rowDimension !\u003d v.size()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 553,
      "end_line": 554,
      "comment": "\n     * Visit (and possibly change) all matrix entries in row order.\n     * \u003cp\u003eRow order starts at upper left and iterating through all elements\n     * of a row from left to right before going to the leftmost element\n     * of the next row.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @exception  MatrixVisitorException if the visitor cannot process an entry\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 577,
      "end_line": 578,
      "comment": "\n     * Visit (but don\u0027t change) all matrix entries in row order.\n     * \u003cp\u003eRow order starts at upper left and iterating through all elements\n     * of a row from left to right before going to the leftmost element\n     * of the next row.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @exception  MatrixVisitorException if the visitor cannot process an entry\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 606,
      "end_line": 608,
      "comment": "\n     * Visit (and possibly change) some matrix entries in row order.\n     * \u003cp\u003eRow order starts at upper left and iterating through all elements\n     * of a row from left to right before going to the leftmost element\n     * of the next row.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @exception  MatrixVisitorException if the visitor cannot process an entry\n     * @exception MatrixIndexException  if the indices are not valid\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 636,
      "end_line": 638,
      "comment": "\n     * Visit (but don\u0027t change) some matrix entries in row order.\n     * \u003cp\u003eRow order starts at upper left and iterating through all elements\n     * of a row from left to right before going to the leftmost element\n     * of the next row.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @exception  MatrixVisitorException if the visitor cannot process an entry\n     * @exception MatrixIndexException  if the indices are not valid\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 661,
      "end_line": 662,
      "comment": "\n     * Visit (and possibly change) all matrix entries in column order.\n     * \u003cp\u003eColumn order starts at upper left and iterating through all elements\n     * of a column from top to bottom before going to the topmost element\n     * of the next column.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @exception  MatrixVisitorException if the visitor cannot process an entry\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 685,
      "end_line": 686,
      "comment": "\n     * Visit (but don\u0027t change) all matrix entries in column order.\n     * \u003cp\u003eColumn order starts at upper left and iterating through all elements\n     * of a column from top to bottom before going to the topmost element\n     * of the next column.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @exception  MatrixVisitorException if the visitor cannot process an entry\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 714,
      "end_line": 716,
      "comment": "\n     * Visit (and possibly change) some matrix entries in column order.\n     * \u003cp\u003eColumn order starts at upper left and iterating through all elements\n     * of a column from top to bottom before going to the topmost element\n     * of the next column.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @exception  MatrixVisitorException if the visitor cannot process an entry\n     * @exception MatrixIndexException  if the indices are not valid\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.walkInColumnOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 744,
      "end_line": 746,
      "comment": "\n     * Visit (but don\u0027t change) some matrix entries in column order.\n     * \u003cp\u003eColumn order starts at upper left and iterating through all elements\n     * of a column from top to bottom before going to the topmost element\n     * of the next column.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @exception  MatrixVisitorException if the visitor cannot process an entry\n     * @exception MatrixIndexException  if the indices are not valid\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 768,
      "end_line": 769,
      "comment": "\n     * Visit (and possibly change) all matrix entries using the fastest possible order.\n     * \u003cp\u003eThe fastest walking order depends on the exact matrix class. It may be\n     * different from traditional row or column orders.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @exception  MatrixVisitorException if the visitor cannot process an entry\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 791,
      "end_line": 792,
      "comment": "\n     * Visit (but don\u0027t change) all matrix entries using the fastest possible order.\n     * \u003cp\u003eThe fastest walking order depends on the exact matrix class. It may be\n     * different from traditional row or column orders.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @exception  MatrixVisitorException if the visitor cannot process an entry\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 819,
      "end_line": 821,
      "comment": "\n     * Visit (and possibly change) some matrix entries using the fastest possible order.\n     * \u003cp\u003eThe fastest walking order depends on the exact matrix class. It may be\n     * different from traditional row or column orders.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index (inclusive)\n     * @exception  MatrixVisitorException if the visitor cannot process an entry\n     * @exception MatrixIndexException  if the indices are not valid\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 848,
      "end_line": 850,
      "comment": "\n     * Visit (but don\u0027t change) some matrix entries using the fastest possible order.\n     * \u003cp\u003eThe fastest walking order depends on the exact matrix class. It may be\n     * different from traditional row or column orders.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index (inclusive)\n     * @exception  MatrixVisitorException if the visitor cannot process an entry\n     * @exception MatrixIndexException  if the indices are not valid\n     * @see #walkInRowOrder(RealMatrixChangingVisitor)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor)\n     * @see #walkInRowOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(RealMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(RealMatrixChangingVisitor, int, int, int, int)\n     * @return the value returned by {@link RealMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.solve(double[])",
      "begin_line": 862,
      "end_line": 863,
      "comment": "\n     * Returns the solution vector for a linear system with coefficient\n     * matrix \u003d this and constant vector \u003d \u003ccode\u003eb\u003c/code\u003e.\n     *\n     * @param b  constant vector\n     * @return vector of solution values to AX \u003d b, where A is *this\n     * @throws IllegalArgumentException if this.rowDimension !\u003d b.length\n     * @throws InvalidMatrixException if this matrix is not square or is singular\n     * @deprecated as of release 2.0, replaced by {@link DecompositionSolver#solve(double[])}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrix.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 877,
      "end_line": 878,
      "comment": "\n     * Returns a matrix of (column) solution vectors for linear systems with\n     * coefficient matrix \u003d this and constant vectors \u003d columns of\n     * \u003ccode\u003eb\u003c/code\u003e.\n     *\n     * @param b  matrix of constant vectors forming RHS of linear systems to\n     * to solve\n     * @return matrix of solution vectors\n     * @throws IllegalArgumentException if this.rowDimension !\u003d row dimension\n     * @throws InvalidMatrixException if this matrix is not square or is singular\n     * @deprecated as of release 2.0, replaced by {@link DecompositionSolver#solve(RealMatrix)}\n     ",
      "child_ranges": []
    }
  ]
}