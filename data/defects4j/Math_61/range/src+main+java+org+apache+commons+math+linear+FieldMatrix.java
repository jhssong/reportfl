{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/linear/FieldMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldMatrix",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math.linear.AnyMatrix"
      ],
      "begin_line": 33,
      "end_line": 773,
      "comment": "\n * Interface defining field-valued matrix with basic algebraic operations.\n * \u003cp\u003e\n * Matrix element indexing is 0-based -- e.g., \u003ccode\u003egetEntry(0, 0)\u003c/code\u003e\n * returns the element in the first row, first column of the matrix.\u003c/p\u003e\n *\n * @param \u003cT\u003e the type of the field elements\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.getField()",
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Get the type of field elements of the matrix.\n     * @return type of field elements of the matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.createMatrix(int, int)",
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Create a new FieldMatrix\u003cT\u003e of the same type as the instance with the supplied\n     * row and column dimensions.\n     *\n     * @param rowDimension  the number of rows in the new matrix\n     * @param columnDimension  the number of columns in the new matrix\n     * @return a new matrix of the same type as the instance\n     * @throws IllegalArgumentException if row or column dimension is not positive\n     * @since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.copy()",
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Returns a (deep) copy of this.\n     *\n     * @return matrix copy\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.add(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Compute the sum of this and m.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.subtract(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n     * Compute this minus m.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.scalarAdd(T)",
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * Returns the result of adding d to each entry of this.\n     *\n     * @param d    value to be added to each entry\n     * @return     d + this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.scalarMultiply(T)",
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n     * Returns the result multiplying each entry of this by d.\n     *\n     * @param d    value to multiply all entries by\n     * @return     d * this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.multiply(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * Returns the result of postmultiplying this by m.\n     *\n     * @param m    matrix to postmultiply by\n     * @return     this * m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.preMultiply(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 111,
      "end_line": 111,
      "comment": "\n     * Returns the result premultiplying this by \u003ccode\u003em\u003c/code\u003e.\n     * @param m    matrix to premultiply by\n     * @return     m * this\n     * @throws     IllegalArgumentException\n     *             if rowDimension(this) !\u003d columnDimension(m)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.getData()",
      "begin_line": 118,
      "end_line": 118,
      "comment": "\n     * Returns matrix entries as a two-dimensional array.\n     *\n     * @return    2-dimensional array of entries\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 132,
      "end_line": 132,
      "comment": "\n     * Gets a submatrix. Rows and columns are indicated\n     * counting from 0 to n-1.\n     *\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index (inclusive)\n     * @return The subMatrix containing the data of the\n     *         specified rows and columns\n     * @exception MatrixIndexException  if the indices are not valid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.getSubMatrix(int[], int[])",
      "begin_line": 144,
      "end_line": 144,
      "comment": "\n    * Gets a submatrix. Rows and columns are indicated\n    * counting from 0 to n-1.\n    *\n    * @param selectedRows Array of row indices.\n    * @param selectedColumns Array of column indices.\n    * @return The subMatrix containing the data in the\n    *         specified rows and columns\n    * @exception MatrixIndexException if row or column selections are not valid\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.copySubMatrix(int, int, int, int, T[][])",
      "begin_line": 159,
      "end_line": 160,
      "comment": "\n    * Copy a submatrix. Rows and columns are indicated\n    * counting from 0 to n-1.\n    *\n    * @param startRow Initial row index\n    * @param endRow Final row index (inclusive)\n    * @param startColumn Initial column index\n    * @param endColumn Final column index (inclusive)\n    * @param destination The arrays where the submatrix data should be copied\n    * (if larger than rows/columns counts, only the upper-left part will be used)\n    * @exception MatrixIndexException if the indices are not valid\n    * @exception IllegalArgumentException if the destination array is too small\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.copySubMatrix(int[], int[], T[][])",
      "begin_line": 173,
      "end_line": 173,
      "comment": "\n   * Copy a submatrix. Rows and columns are indicated\n   * counting from 0 to n-1.\n   *\n    * @param selectedRows Array of row indices.\n    * @param selectedColumns Array of column indices.\n   * @param destination The arrays where the submatrix data should be copied\n   * (if larger than rows/columns counts, only the upper-left part will be used)\n   * @exception MatrixIndexException if the indices are not valid\n   * @exception IllegalArgumentException if the destination array is too small\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.setSubMatrix(T[][], int, int)",
      "begin_line": 202,
      "end_line": 202,
      "comment": "\n    * Replace the submatrix starting at \u003ccode\u003erow, column\u003c/code\u003e using data in\n    * the input \u003ccode\u003esubMatrix\u003c/code\u003e array. Indexes are 0-based.\n    * \u003cp\u003e\n    * Example:\u003cbr\u003e\n    * Starting with \u003cpre\u003e\n    * 1  2  3  4\n    * 5  6  7  8\n    * 9  0  1  2\n    * \u003c/pre\u003e\n    * and \u003ccode\u003esubMatrix \u003d {{3, 4} {5,6}}\u003c/code\u003e, invoking\n    * \u003ccode\u003esetSubMatrix(subMatrix,1,1))\u003c/code\u003e will result in \u003cpre\u003e\n    * 1  2  3  4\n    * 5  3  4  8\n    * 9  5  6  2\n    * \u003c/pre\u003e\u003c/p\u003e\n    *\n    * @param subMatrix  array containing the submatrix replacement data\n    * @param row  row coordinate of the top, left element to be replaced\n    * @param column  column coordinate of the top, left element to be replaced\n    * @throws MatrixIndexException  if subMatrix does not fit into this\n    *    matrix from element in (row, column)\n    * @throws IllegalArgumentException if \u003ccode\u003esubMatrix\u003c/code\u003e is not rectangular\n    *  (not all rows have the same length) or empty\n    * @throws NullPointerException if \u003ccode\u003esubMatrix\u003c/code\u003e is null\n    * @since 2.0\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.getRowMatrix(int)",
      "begin_line": 212,
      "end_line": 212,
      "comment": "\n    * Returns the entries in row number \u003ccode\u003erow\u003c/code\u003e\n    * as a row matrix.  Row indices start at 0.\n    *\n    * @param row the row to be fetched\n    * @return row matrix\n    * @throws MatrixIndexException if the specified row index is invalid\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.setRowMatrix(int, org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 225,
      "end_line": 225,
      "comment": "\n    * Sets the entries in row number \u003ccode\u003erow\u003c/code\u003e\n    * as a row matrix.  Row indices start at 0.\n    *\n    * @param row the row to be set\n    * @param matrix row matrix (must have one row and the same number of columns\n    * as the instance)\n    * @throws MatrixIndexException if the specified row index is invalid\n    * @throws org.apache.commons.math.exception.MatrixDimensionMismatchException\n    * if the matrix dimensions do not match one instance row.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.getColumnMatrix(int)",
      "begin_line": 235,
      "end_line": 235,
      "comment": "\n    * Returns the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n    * as a column matrix.  Column indices start at 0.\n    *\n    * @param column the column to be fetched\n    * @return column matrix\n    * @throws MatrixIndexException if the specified column index is invalid\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.setColumnMatrix(int, org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 248,
      "end_line": 248,
      "comment": "\n    * Sets the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n    * as a column matrix.  Column indices start at 0.\n    *\n    * @param column the column to be set\n    * @param matrix column matrix (must have one column and the same number of rows\n    * as the instance)\n    * @throws MatrixIndexException if the specified column index is invalid\n    * @throws org.apache.commons.math.exception.MatrixDimensionMismatchException\n    * if the matrix dimensions do not match one instance column.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.getRowVector(int)",
      "begin_line": 258,
      "end_line": 258,
      "comment": "\n    * Returns the entries in row number \u003ccode\u003erow\u003c/code\u003e\n    * as a vector.  Row indices start at 0.\n    *\n    * @param row the row to be fetched\n    * @return row vector\n    * @throws MatrixIndexException if the specified row index is invalid\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.setRowVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 271,
      "end_line": 271,
      "comment": "\n    * Sets the entries in row number \u003ccode\u003erow\u003c/code\u003e\n    * as a vector.  Row indices start at 0.\n    *\n    * @param row the row to be set\n    * @param vector row vector (must have the same number of columns\n    * as the instance)\n    * @throws MatrixIndexException if the specified row index is invalid\n    * @throws org.apache.commons.math.exception.MatrixDimensionMismatchException\n    * if the vector dimension does not match one instance row.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.getColumnVector(int)",
      "begin_line": 281,
      "end_line": 281,
      "comment": "\n    * Returns the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n    * as a vector.  Column indices start at 0.\n    *\n    * @param column the column to be fetched\n    * @return column vector\n    * @throws MatrixIndexException if the specified column index is invalid\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.setColumnVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 293,
      "end_line": 293,
      "comment": "\n    * Sets the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n    * as a vector.  Column indices start at 0.\n    *\n    * @param column the column to be set\n    * @param vector column vector (must have the same number of rows as the instance)\n    * @throws MatrixIndexException if the specified column index is invalid\n    * @throws org.apache.commons.math.exception.MatrixDimensionMismatchException\n    * if the vector dimension does not match one instance column.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.getRow(int)",
      "begin_line": 305,
      "end_line": 305,
      "comment": "\n     * Returns the entries in row number \u003ccode\u003erow\u003c/code\u003e as an array.\n     * \u003cp\u003e\n     * Row indices start at 0.  A \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown\n     * unless {@code 0 \u003c\u003d row \u003c rowDimension}.\u003c/p\u003e\n     *\n     * @param row the row to be fetched\n     * @return array of entries in the row\n     * @throws MatrixIndexException if the specified row index is not valid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.setRow(int, T[])",
      "begin_line": 317,
      "end_line": 317,
      "comment": "\n     * Sets the entries in row number \u003ccode\u003erow\u003c/code\u003e\n     * as a row matrix.  Row indices start at 0.\n     *\n     * @param row the row to be set\n     * @param array row matrix (must have the same number of columns as the instance)\n     * @throws MatrixIndexException if the specified row index is invalid\n     * @throws org.apache.commons.math.exception.MatrixDimensionMismatchException\n     * if the array size does not match one instance row.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.getColumn(int)",
      "begin_line": 329,
      "end_line": 329,
      "comment": "\n     * Returns the entries in column number \u003ccode\u003ecol\u003c/code\u003e as an array.\n     * \u003cp\u003e\n     * Column indices start at 0.  A \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown\n     * unless {@code 0 \u003c\u003d column \u003c columnDimension}.\u003c/p\u003e\n     *\n     * @param column the column to be fetched\n     * @return array of entries in the column\n     * @throws MatrixIndexException if the specified column index is not valid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.setColumn(int, T[])",
      "begin_line": 341,
      "end_line": 341,
      "comment": "\n     * Sets the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n     * as a column matrix.  Column indices start at 0.\n     *\n     * @param column the column to be set\n     * @param array column array (must have the same number of rows as the instance)\n     * @throws MatrixIndexException if the specified column index is invalid\n     * @throws org.apache.commons.math.exception.MatrixDimensionMismatchException\n     * if the array size does not match one instance column.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.getEntry(int, int)",
      "begin_line": 358,
      "end_line": 358,
      "comment": "\n     * Returns the entry in the specified row and column.\n     * \u003cp\u003e\n     * Row and column indices start at 0 and must satisfy\n     * \u003cul\u003e\n     * \u003cli\u003e{@code 0 \u003c\u003d row \u003c rowDimension}\u003c/li\u003e\n     * \u003cli\u003e{@code 0 \u003c\u003d column \u003c columnDimension}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * otherwise a \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown.\u003c/p\u003e\n     *\n     * @param row  row location of entry to be fetched\n     * @param column  column location of entry to be fetched\n     * @return matrix entry in row,column\n     * @throws MatrixIndexException if the row or column index is not valid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.setEntry(int, int, T)",
      "begin_line": 376,
      "end_line": 376,
      "comment": "\n     * Set the entry in the specified row and column.\n     * \u003cp\u003e\n     * Row and column indices start at 0 and must satisfy\n     * \u003cul\u003e\n     * \u003cli\u003e{@code 0 \u003c\u003d row \u003c rowDimension}\u003c/li\u003e\n     * \u003cli\u003e{@code 0 \u003c\u003d column \u003c columnDimension}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * otherwise a \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown.\u003c/p\u003e\n     *\n     * @param row  row location of entry to be set\n     * @param column  column location of entry to be set\n     * @param value matrix entry to be set in row,column\n     * @throws MatrixIndexException if the row or column index is not valid\n     * @since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.addToEntry(int, int, T)",
      "begin_line": 394,
      "end_line": 394,
      "comment": "\n     * Change an entry in the specified row and column.\n     * \u003cp\u003e\n     * Row and column indices start at 0 and must satisfy\n     * \u003cul\u003e\n     * \u003cli\u003e{@code 0 \u003c\u003d row \u003c rowDimension}\u003c/li\u003e\n     * \u003cli\u003e{@code 0 \u003c\u003d column \u003c columnDimension}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * otherwise a \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown.\u003c/p\u003e\n     *\n     * @param row  row location of entry to be set\n     * @param column  column location of entry to be set\n     * @param increment value to add to the current matrix entry in row,column\n     * @throws MatrixIndexException if the row or column index is not valid\n     * @since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.multiplyEntry(int, int, T)",
      "begin_line": 412,
      "end_line": 412,
      "comment": "\n     * Change an entry in the specified row and column.\n     * \u003cp\u003e\n     * Row and column indices start at 0 and must satisfy\n     * \u003cul\u003e\n     * \u003cli\u003e{@code 0 \u003c\u003d row \u003c rowDimension}\u003c/li\u003e\n     * \u003cli\u003e{@code 0 \u003c\u003d column \u003c columnDimension}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * otherwise a \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown.\u003c/p\u003e\n     *\n     * @param row  row location of entry to be set\n     * @param column  column location of entry to be set\n     * @param factor multiplication factor for the current matrix entry in row,column\n     * @throws MatrixIndexException if the row or column index is not valid\n     * @since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.transpose()",
      "begin_line": 419,
      "end_line": 419,
      "comment": "\n     * Returns the transpose of this matrix.\n     *\n     * @return transpose matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.getTrace()",
      "begin_line": 428,
      "end_line": 428,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/MatrixTrace.html\"\u003e\n     * trace\u003c/a\u003e of the matrix (the sum of the elements on the main diagonal).\n     *\n     * @return trace\n     * @throws NonSquareMatrixException if the matrix is not square\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.operate(T[])",
      "begin_line": 437,
      "end_line": 437,
      "comment": "\n     * Returns the result of multiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the vector to operate on\n     * @return this*v\n     * @throws IllegalArgumentException if columnDimension !\u003d v.size()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.operate(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 446,
      "end_line": 446,
      "comment": "\n     * Returns the result of multiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the vector to operate on\n     * @return this*v\n     * @throws IllegalArgumentException if columnDimension !\u003d v.size()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.preMultiply(T[])",
      "begin_line": 455,
      "end_line": 455,
      "comment": "\n     * Returns the (row) vector result of premultiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the row vector to premultiply by\n     * @return v*this\n     * @throws IllegalArgumentException if rowDimension !\u003d v.size()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.preMultiply(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 464,
      "end_line": 464,
      "comment": "\n     * Returns the (row) vector result of premultiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the row vector to premultiply by\n     * @return v*this\n     * @throws IllegalArgumentException if rowDimension !\u003d v.size()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 487,
      "end_line": 487,
      "comment": "\n     * Visit (and possibly change) all matrix entries in row order.\n     * \u003cp\u003eRow order starts at upper left and iterating through all elements\n     * of a row from left to right before going to the leftmost element\n     * of the next row.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @exception  MatrixVisitorException if the visitor cannot process an entry\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 510,
      "end_line": 510,
      "comment": "\n     * Visit (but don\u0027t change) all matrix entries in row order.\n     * \u003cp\u003eRow order starts at upper left and iterating through all elements\n     * of a row from left to right before going to the leftmost element\n     * of the next row.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @exception  MatrixVisitorException if the visitor cannot process an entry\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 538,
      "end_line": 539,
      "comment": "\n     * Visit (and possibly change) some matrix entries in row order.\n     * \u003cp\u003eRow order starts at upper left and iterating through all elements\n     * of a row from left to right before going to the leftmost element\n     * of the next row.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @exception  MatrixVisitorException if the visitor cannot process an entry\n     * @exception MatrixIndexException  if the indices are not valid\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 567,
      "end_line": 568,
      "comment": "\n     * Visit (but don\u0027t change) some matrix entries in row order.\n     * \u003cp\u003eRow order starts at upper left and iterating through all elements\n     * of a row from left to right before going to the leftmost element\n     * of the next row.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @exception  MatrixVisitorException if the visitor cannot process an entry\n     * @exception MatrixIndexException  if the indices are not valid\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 591,
      "end_line": 591,
      "comment": "\n     * Visit (and possibly change) all matrix entries in column order.\n     * \u003cp\u003eColumn order starts at upper left and iterating through all elements\n     * of a column from top to bottom before going to the topmost element\n     * of the next column.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @exception  MatrixVisitorException if the visitor cannot process an entry\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 614,
      "end_line": 614,
      "comment": "\n     * Visit (but don\u0027t change) all matrix entries in column order.\n     * \u003cp\u003eColumn order starts at upper left and iterating through all elements\n     * of a column from top to bottom before going to the topmost element\n     * of the next column.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @exception  MatrixVisitorException if the visitor cannot process an entry\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 642,
      "end_line": 643,
      "comment": "\n     * Visit (and possibly change) some matrix entries in column order.\n     * \u003cp\u003eColumn order starts at upper left and iterating through all elements\n     * of a column from top to bottom before going to the topmost element\n     * of the next column.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @exception  MatrixVisitorException if the visitor cannot process an entry\n     * @exception MatrixIndexException  if the indices are not valid\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.walkInColumnOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 671,
      "end_line": 672,
      "comment": "\n     * Visit (but don\u0027t change) some matrix entries in column order.\n     * \u003cp\u003eColumn order starts at upper left and iterating through all elements\n     * of a column from top to bottom before going to the topmost element\n     * of the next column.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @exception  MatrixVisitorException if the visitor cannot process an entry\n     * @exception MatrixIndexException  if the indices are not valid\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 694,
      "end_line": 694,
      "comment": "\n     * Visit (and possibly change) all matrix entries using the fastest possible order.\n     * \u003cp\u003eThe fastest walking order depends on the exact matrix class. It may be\n     * different from traditional row or column orders.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @exception  MatrixVisitorException if the visitor cannot process an entry\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 716,
      "end_line": 716,
      "comment": "\n     * Visit (but don\u0027t change) all matrix entries using the fastest possible order.\n     * \u003cp\u003eThe fastest walking order depends on the exact matrix class. It may be\n     * different from traditional row or column orders.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @exception  MatrixVisitorException if the visitor cannot process an entry\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 743,
      "end_line": 744,
      "comment": "\n     * Visit (and possibly change) some matrix entries using the fastest possible order.\n     * \u003cp\u003eThe fastest walking order depends on the exact matrix class. It may be\n     * different from traditional row or column orders.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index (inclusive)\n     * @exception  MatrixVisitorException if the visitor cannot process an entry\n     * @exception MatrixIndexException  if the indices are not valid\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixChangingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 771,
      "end_line": 772,
      "comment": "\n     * Visit (but don\u0027t change) some matrix entries using the fastest possible order.\n     * \u003cp\u003eThe fastest walking order depends on the exact matrix class. It may be\n     * different from traditional row or column orders.\u003c/p\u003e\n     * @param visitor visitor used to process all matrix entries\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index (inclusive)\n     * @exception  MatrixVisitorException if the visitor cannot process an entry\n     * @exception MatrixIndexException  if the indices are not valid\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInRowOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInRowOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInColumnOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @see #walkInColumnOrder(FieldMatrixPreservingVisitor, int, int, int, int)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixPreservingVisitor)\n     * @see #walkInOptimizedOrder(FieldMatrixChangingVisitor, int, int, int, int)\n     * @return the value returned by {@link FieldMatrixPreservingVisitor#end()} at the end\n     * of the walk\n     ",
      "child_ranges": []
    }
  ]
}