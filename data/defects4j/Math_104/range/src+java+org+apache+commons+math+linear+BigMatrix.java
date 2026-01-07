{
  "filepath": "/tmp/Math-104b/src/java/org/apache/commons/math/linear/BigMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BigMatrix",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 353,
      "comment": "\n * Interface defining a real-valued matrix with basic algebraic operations, using\n * BigDecimal representations for the entries.\n * \u003cp\u003e\n * Matrix element indexing is 0-based -- e.g., \u003ccode\u003egetEntry(0, 0)\u003c/code\u003e\n * returns the element in the first row, first column of the matrix.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.copy()",
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Returns a (deep) copy of this.\n     *\n     * @return matrix copy\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.add(org.apache.commons.math.linear.BigMatrix)",
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Compute the sum of this and m.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @exception  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.subtract(org.apache.commons.math.linear.BigMatrix)",
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Compute this minus m.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this + m\n     * @exception  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.scalarAdd(java.math.BigDecimal)",
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * Returns the result of adding d to each entry of this.\n     *\n     * @param d    value to be added to each entry\n     * @return     d + this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.scalarMultiply(java.math.BigDecimal)",
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * Returns the result multiplying each entry of this by d.\n     *\n     * @param d    value to multiply all entries by\n     * @return     d * this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.multiply(org.apache.commons.math.linear.BigMatrix)",
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * Returns the result of postmultiplying this by m.\n     *\n     * @param m    matrix to postmultiply by\n     * @return     this * m\n     * @throws     IllegalArgumentException \n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.preMultiply(org.apache.commons.math.linear.BigMatrix)",
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * Returns the result premultiplying this by \u003ccode\u003em\u003c/code\u003e.\n     * @param m    matrix to premultiply by\n     * @return     m * this\n     * @throws     IllegalArgumentException\n     *             if rowDimension(this) !\u003d columnDimension(m)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.getData()",
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n     * Returns matrix entries as a two-dimensional array.\n     *\n     * @return    2-dimensional array of entries\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.getDataAsDoubleArray()",
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n     * Returns matrix entries as a two-dimensional array.\n     *\n     * @return    2-dimensional array of entries\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.getRoundingMode()",
      "begin_line": 111,
      "end_line": 111,
      "comment": "*\n     * Gets the rounding mode\n     * @return the rounding mode\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.getNorm()",
      "begin_line": 119,
      "end_line": 119,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/MaximumAbsoluteRowSumNorm.html\"\u003e\n     * maximum absolute row sum norm\u003c/a\u003e of the matrix.\n     *\n     * @return norm\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 133,
      "end_line": 134,
      "comment": "\n     * Gets a submatrix. Rows and columns are indicated\n     * counting from 0 to n-1.\n     *\n     * @param startRow Initial row index\n     * @param endRow Final row index\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @return The subMatrix containing the data of the\n     *         specified rows and columns\n     * @exception MatrixIndexException  if the indices are not valid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.getSubMatrix(int[], int[])",
      "begin_line": 146,
      "end_line": 147,
      "comment": "\n     * Gets a submatrix. Rows and columns are indicated\n     * counting from 0 to n-1.\n     *\n     * @param selectedRows Array of row indices.\n     * @param selectedColumns Array of column indices.\n     * @return The subMatrix containing the data in the\n     *         specified rows and columns\n     * @exception MatrixIndexException if row or column selections are not valid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.getRowMatrix(int)",
      "begin_line": 157,
      "end_line": 157,
      "comment": "\n     * Returns the entries in row number \u003ccode\u003erow\u003c/code\u003e\n     * as a row matrix.  Row indices start at 0.\n     *\n     * @param row the row to be fetched\n     * @return row matrix\n     * @throws MatrixIndexException if the specified row index is invalid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.getColumnMatrix(int)",
      "begin_line": 167,
      "end_line": 167,
      "comment": "\n     * Returns the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n     * as a column matrix.  Column indices start at 0.\n     *\n     * @param column the column to be fetched\n     * @return column matrix\n     * @throws MatrixIndexException if the specified column index is invalid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.getRow(int)",
      "begin_line": 179,
      "end_line": 179,
      "comment": "\n     * Returns the entries in row number \u003ccode\u003erow\u003c/code\u003e as an array.\n     * \u003cp\u003e\n     * Row indices start at 0.  A \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown\n     * unless \u003ccode\u003e0 \u003c\u003d row \u003c rowDimension.\u003c/code\u003e\n     *\n     * @param row the row to be fetched\n     * @return array of entries in the row\n     * @throws MatrixIndexException if the specified row index is not valid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.getRowAsDoubleArray(int)",
      "begin_line": 192,
      "end_line": 192,
      "comment": "\n     * Returns the entries in row number \u003ccode\u003erow\u003c/code\u003e as an array\n     * of double values.\n     * \u003cp\u003e\n     * Row indices start at 0.  A \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown\n     * unless \u003ccode\u003e0 \u003c\u003d row \u003c rowDimension.\u003c/code\u003e\n     *\n     * @param row the row to be fetched\n     * @return array of entries in the row\n     * @throws MatrixIndexException if the specified row index is not valid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.getColumn(int)",
      "begin_line": 204,
      "end_line": 204,
      "comment": "\n     * Returns the entries in column number \u003ccode\u003ecol\u003c/code\u003e as an array.\n     * \u003cp\u003e\n     * Column indices start at 0.  A \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown\n     * unless \u003ccode\u003e0 \u003c\u003d column \u003c columnDimension.\u003c/code\u003e\n     *\n     * @param col the column to be fetched\n     * @return array of entries in the column\n     * @throws MatrixIndexException if the specified column index is not valid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.getColumnAsDoubleArray(int)",
      "begin_line": 217,
      "end_line": 217,
      "comment": "\n     * Returns the entries in column number \u003ccode\u003ecol\u003c/code\u003e as an array\n     * of double values.\n     * \u003cp\u003e\n     * Column indices start at 0.  A \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown\n     * unless \u003ccode\u003e0 \u003c\u003d column \u003c columnDimension.\u003c/code\u003e\n     *\n     * @param col the column to be fetched\n     * @return array of entries in the column\n     * @throws MatrixIndexException if the specified column index is not valid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.getEntry(int, int)",
      "begin_line": 234,
      "end_line": 234,
      "comment": "\n     * Returns the entry in the specified row and column.\n     * \u003cp\u003e\n     * Row and column indices start at 0 and must satisfy \n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e0 \u003c\u003d row \u003c rowDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e 0 \u003c\u003d column \u003c columnDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * otherwise a \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown.\n     *\n     * @param row  row location of entry to be fetched  \n     * @param column  column location of entry to be fetched\n     * @return matrix entry in row,column\n     * @throws MatrixIndexException if the row or column index is not valid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.getEntryAsDouble(int, int)",
      "begin_line": 251,
      "end_line": 251,
      "comment": "\n     * Returns the entry in the specified row and column as a double.\n     * \u003cp\u003e\n     * Row and column indices start at 0 and must satisfy \n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e0 \u003c\u003d row \u003c rowDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e 0 \u003c\u003d column \u003c columnDimension\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * otherwise a \u003ccode\u003eMatrixIndexException\u003c/code\u003e is thrown.\n     *\n     * @param row  row location of entry to be fetched\n     * @param column  column location of entry to be fetched\n     * @return matrix entry in row,column\n     * @throws MatrixIndexException if the row or column index is not valid\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.transpose()",
      "begin_line": 258,
      "end_line": 258,
      "comment": "\n     * Returns the transpose of this matrix.\n     *\n     * @return transpose matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.inverse()",
      "begin_line": 267,
      "end_line": 267,
      "comment": "\n     * Returns the inverse of this matrix.\n     *\n     * @return inverse matrix\n     * @throws org.apache.commons.math.linear.InvalidMatrixException if \n     *     this is not invertible\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.getDeterminant()",
      "begin_line": 276,
      "end_line": 276,
      "comment": "\n     * Returns the determinant of this matrix.\n     *\n     * @return determinant\n      *@throws org.apache.commons.math.linear.InvalidMatrixException if \n      *    matrix is not square\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.isSquare()",
      "begin_line": 282,
      "end_line": 282,
      "comment": "\n     * Is this a square matrix?\n     * @return true if the matrix is square (rowDimension \u003d columnDimension)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.isSingular()",
      "begin_line": 288,
      "end_line": 288,
      "comment": "\n     * Is this a singular matrix?\n     * @return true if the matrix is singular\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.getRowDimension()",
      "begin_line": 295,
      "end_line": 295,
      "comment": "\n     * Returns the number of rows in the matrix.\n     *\n     * @return rowDimension\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.getColumnDimension()",
      "begin_line": 302,
      "end_line": 302,
      "comment": "\n     * Returns the number of columns in the matrix.\n     *\n     * @return columnDimension\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.getTrace()",
      "begin_line": 310,
      "end_line": 310,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/MatrixTrace.html\"\u003e\n     * trace\u003c/a\u003e of the matrix (the sum of the elements on the main diagonal).\n     *\n     * @return trace\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.operate(java.math.BigDecimal[])",
      "begin_line": 319,
      "end_line": 319,
      "comment": "\n     * Returns the result of multiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the vector to operate on\n     * @return this*v\n     * @throws IllegalArgumentException if columnDimension !\u003d v.size()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.preMultiply(java.math.BigDecimal[])",
      "begin_line": 328,
      "end_line": 328,
      "comment": "\n     * Returns the (row) vector result of premultiplying this by the vector \u003ccode\u003ev\u003c/code\u003e.\n     *\n     * @param v the row vector to premultiply by\n     * @return v*this\n     * @throws IllegalArgumentException if rowDimension !\u003d v.size()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.solve(java.math.BigDecimal[])",
      "begin_line": 339,
      "end_line": 339,
      "comment": "\n     * Returns the solution vector for a linear system with coefficient\n     * matrix \u003d this and constant vector \u003d \u003ccode\u003eb\u003c/code\u003e.\n     *\n     * @param b  constant vector\n     * @return vector of solution values to AX \u003d b, where A is *this\n     * @throws IllegalArgumentException if this.rowDimension !\u003d b.length \n     * @throws org.apache.commons.math.linear.InvalidMatrixException if this matrix is not square or is singular\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BigMatrix.solve(org.apache.commons.math.linear.BigMatrix)",
      "begin_line": 352,
      "end_line": 352,
      "comment": "\n     * Returns a matrix of (column) solution vectors for linear systems with\n     * coefficient matrix \u003d this and constant vectors \u003d columns of\n     * \u003ccode\u003eb\u003c/code\u003e. \n     *\n     * @param b  matrix of constant vectors forming RHS of linear systems to\n     * to solve\n     * @return matrix of solution vectors\n     * @throws IllegalArgumentException if this.rowDimension !\u003d row dimension\n     * @throws org.apache.commons.math.linear.InvalidMatrixException if this matrix is not square or is singular\n     ",
      "child_ranges": []
    }
  ]
}