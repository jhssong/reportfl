{
  "filepath": "/tmp/Math-88b/src/java/org/apache/commons/math/linear/MatrixUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MatrixUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 933,
      "comment": "\n * A collection of static methods that operate on or return matrices.\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.MatrixUtils.MatrixUtils()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealMatrix(int, int)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Returns a {@link RealMatrix} with specified dimensions.\n     * \u003cp\u003eThe matrix elements are all set to 0.0.\u003c/p\u003e\n     * @param rows number of rows of the matrix\n     * @param columns number of columns of the matrix\n     * @return  RealMatrix with specified dimensions\n     * @see #createRealMatrix(double[][])\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createFieldMatrix(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 70,
      "end_line": 74,
      "comment": "\n     * Returns a {@link FieldMatrix} with specified dimensions.\n     * \u003cp\u003eThe matrix elements are all set to field.getZero().\u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param field field to which the matrix elements belong\n     * @param rows number of rows of the matrix\n     * @param columns number of columns of the matrix\n     * @return  FieldMatrix with specified dimensions\n     * @see #createFieldMatrix(FieldElement[][])\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealMatrix(double[][])",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Returns a {@link RealMatrix} whose entries are the the values in the\n     * the input array.  The input array is copied, not referenced.\n     * \n     * @param data input array\n     * @return  RealMatrix containing the values of the array\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003edata\u003c/code\u003e is null\n     * @see #createRealMatrix(int, int)\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createFieldMatrix(T[][])",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * Returns a {@link FieldMatrix} whose entries are the the values in the\n     * the input array.\n     * \u003cp\u003e\n     * The input array is copied, not referenced.\n     * \u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param data input array\n     * @return  RealMatrix containing the values of the array\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003edata\u003c/code\u003e is null\n     * @see #createFieldMatrix(Field, int, int)\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix(int)",
      "begin_line": 118,
      "end_line": 124,
      "comment": "\n     * Returns \u003ccode\u003edimension x dimension\u003c/code\u003e identity matrix.\n     *\n     * @param dimension dimension of identity matrix to generate\n     * @return identity matrix\n     * @throws IllegalArgumentException if dimension is not positive\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 68)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createFieldIdentityMatrix(org.apache.commons.math.Field\u003cT\u003e, int)",
      "begin_line": 136,
      "end_line": 148,
      "comment": "\n     * Returns \u003ccode\u003edimension x dimension\u003c/code\u003e identity matrix.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param field field to which the elements belong\n     * @param dimension dimension of identity matrix to generate\n     * @return identity matrix\n     * @throws IllegalArgumentException if dimension is not positive\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 39)",
        "(line 140,col 9)-(line 140,col 38)",
        "(line 141,col 9)-(line 141,col 103)",
        "(line 142,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix(int)",
      "begin_line": 159,
      "end_line": 168,
      "comment": "\n     * Returns \u003ccode\u003edimension x dimension\u003c/code\u003e identity matrix.\n     *\n     * @param dimension dimension of identity matrix to generate\n     * @return identity matrix\n     * @throws IllegalArgumentException if dimension is not positive\n     * @since 1.1\n     * @deprecated since 2.0, replaced by {@link #createFieldIdentityMatrix(Field, int)}\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 70)",
        "(line 162,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealDiagonalMatrix(double[])",
      "begin_line": 178,
      "end_line": 184,
      "comment": "\n     * Returns a diagonal matrix with specified elements.\n     *\n     * @param diagonal diagonal elements of the matrix (the array elements\n     * will be copied)\n     * @return diagonal matrix\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 80)",
        "(line 180,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createFieldDiagonalMatrix(T[])",
      "begin_line": 195,
      "end_line": 203,
      "comment": "\n     * Returns a diagonal matrix with specified elements.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param diagonal diagonal elements of the matrix (the array elements\n     * will be copied)\n     * @return diagonal matrix\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 198,col 88)",
        "(line 199,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createBigMatrix(double[][])",
      "begin_line": 216,
      "end_line": 219,
      "comment": "\n     * Returns a {@link BigMatrix} whose entries are the the values in the\n     * the input array.  The input array is copied, not referenced.\n     * \n     * @param data input array\n     * @return  RealMatrix containing the values of the array\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if data is null\n     * @deprecated since 2.0 replaced by {@link #createFieldMatrix(FieldElement[][])}\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createBigMatrix(java.math.BigDecimal[][])",
      "begin_line": 232,
      "end_line": 235,
      "comment": "\n     * Returns a {@link BigMatrix} whose entries are the the values in the\n     * the input array.  The input array is copied, not referenced.\n     * \n     * @param data input array\n     * @return  RealMatrix containing the values of the array\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if data is null\n     * @deprecated since 2.0 replaced by {@link #createFieldMatrix(FieldElement[][])}\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createBigMatrix(java.math.BigDecimal[][], boolean)",
      "begin_line": 254,
      "end_line": 257,
      "comment": "\n     * Returns a {@link BigMatrix} whose entries are the the values in the\n     * the input array.\n     * \u003cp\u003eIf an array is built specially in order to be embedded in a\n     * BigMatrix and not used directly, the \u003ccode\u003ecopyArray\u003c/code\u003e may be\n     * set to \u003ccode\u003efalse\u003c/code. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\u003c/p\u003e\n     * @param data data for new matrix\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     * @return  BigMatrix containing the values of the array\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003edata\u003c/code\u003e is null\n     * @see #createRealMatrix(double[][])\n     * @deprecated since 2.0 replaced by {@link #createFieldMatrix(FieldElement[][])}\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createBigMatrix(java.lang.String[][])",
      "begin_line": 270,
      "end_line": 273,
      "comment": "\n     * Returns a {@link BigMatrix} whose entries are the the values in the\n     * the input array.  The input array is copied, not referenced.\n     * \n     * @param data input array\n     * @return  RealMatrix containing the values of the array\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if data is null\n     * @deprecated since 2.0 replaced by {@link #createFieldMatrix(FieldElement[][])}\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealVector(double[])",
      "begin_line": 283,
      "end_line": 285,
      "comment": "\n     * Creates a {@link RealVector} using the data from the input array. \n     * \n     * @param data the input data\n     * @return a data.length RealVector\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003edata\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createFieldVector(T[])",
      "begin_line": 296,
      "end_line": 298,
      "comment": "\n     * Creates a {@link FieldVector} using the data from the input array. \n     * \n     * @param \u003cT\u003e the type of the field elements\n     * @param data the input data\n     * @return a data.length FieldVector\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003edata\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(double[])",
      "begin_line": 309,
      "end_line": 316,
      "comment": "\n     * Creates a row {@link RealMatrix} using the data from the input\n     * array. \n     * \n     * @param rowData the input row data\n     * @return a 1 x rowData.length RealMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003erowData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003erowData\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 41)",
        "(line 311,col 9)-(line 311,col 56)",
        "(line 312,col 9)-(line 314,col 9)",
        "(line 315,col 9)-(line 315,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRowFieldMatrix(T[])",
      "begin_line": 328,
      "end_line": 339,
      "comment": "\n     * Creates a row {@link FieldMatrix} using the data from the input\n     * array. \n     * \n     * @param \u003cT\u003e the type of the field elements\n     * @param rowData the input row data\n     * @return a 1 x rowData.length FieldMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003erowData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003erowData\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 41)",
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 334,col 84)",
        "(line 335,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 338,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(double[])",
      "begin_line": 351,
      "end_line": 359,
      "comment": "\n     * Creates a row {@link BigMatrix} using the data from the input\n     * array. \n     * \n     * @param rowData the input row data\n     * @return a 1 x rowData.length BigMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003erowData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003erowData\u003c/code\u003eis null\n     * @deprecated since 2.0 replaced by {@link #createRowFieldMatrix(FieldElement[])}\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 41)",
        "(line 354,col 9)-(line 354,col 61)",
        "(line 355,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(java.math.BigDecimal[])",
      "begin_line": 371,
      "end_line": 377,
      "comment": "\n     * Creates a row {@link BigMatrix} using the data from the input\n     * array. \n     * \n     * @param rowData the input row data\n     * @return a 1 x rowData.length BigMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003erowData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003erowData\u003c/code\u003eis null\n     * @deprecated since 2.0 replaced by {@link #createRowFieldMatrix(FieldElement[])}\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 41)",
        "(line 374,col 9)-(line 374,col 61)",
        "(line 375,col 9)-(line 375,col 56)",
        "(line 376,col 9)-(line 376,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(java.lang.String[])",
      "begin_line": 389,
      "end_line": 397,
      "comment": "\n     * Creates a row {@link BigMatrix} using the data from the input\n     * array. \n     * \n     * @param rowData the input row data\n     * @return a 1 x rowData.length BigMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003erowData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003erowData\u003c/code\u003eis null\n     * @deprecated since 2.0 replaced by {@link #createRowFieldMatrix(FieldElement[])}\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 41)",
        "(line 392,col 9)-(line 392,col 61)",
        "(line 393,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 396,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(double[])",
      "begin_line": 408,
      "end_line": 415,
      "comment": "\n     * Creates a column {@link RealMatrix} using the data from the input\n     * array.\n     * \n     * @param columnData  the input column data\n     * @return a columnData x 1 RealMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003ecolumnData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003ecolumnData\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 44)",
        "(line 410,col 9)-(line 410,col 56)",
        "(line 411,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 414,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createColumnFieldMatrix(T[])",
      "begin_line": 427,
      "end_line": 438,
      "comment": "\n     * Creates a column {@link FieldMatrix} using the data from the input\n     * array.\n     * \n     * @param \u003cT\u003e the type of the field elements\n     * @param columnData  the input column data\n     * @return a columnData x 1 FieldMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003ecolumnData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003ecolumnData\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 44)",
        "(line 430,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 433,col 87)",
        "(line 434,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 437,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(double[])",
      "begin_line": 450,
      "end_line": 458,
      "comment": "\n     * Creates a column {@link BigMatrix} using the data from the input\n     * array.\n     * \n     * @param columnData  the input column data\n     * @return a columnData x 1 BigMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003ecolumnData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003ecolumnData\u003c/code\u003eis null\n     * @deprecated since 2.0 replaced by {@link #createColumnFieldMatrix(FieldElement[])}\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 44)",
        "(line 453,col 9)-(line 453,col 61)",
        "(line 454,col 9)-(line 456,col 9)",
        "(line 457,col 9)-(line 457,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(java.math.BigDecimal[])",
      "begin_line": 470,
      "end_line": 478,
      "comment": "\n     * Creates a column {@link BigMatrix} using the data from the input\n     * array.\n     * \n     * @param columnData  the input column data\n     * @return a columnData x 1 BigMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003ecolumnData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003ecolumnData\u003c/code\u003eis null\n     * @deprecated since 2.0 replaced by {@link #createColumnFieldMatrix(FieldElement[])}\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 44)",
        "(line 473,col 9)-(line 473,col 61)",
        "(line 474,col 9)-(line 476,col 9)",
        "(line 477,col 9)-(line 477,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(java.lang.String[])",
      "begin_line": 490,
      "end_line": 498,
      "comment": "\n     * Creates a column {@link BigMatrix} using the data from the input\n     * array.\n     * \n     * @param columnData  the input column data\n     * @return a columnData x 1 BigMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003ecolumnData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003ecolumnData\u003c/code\u003eis null\n     * @deprecated since 2.0 replaced by {@link #createColumnFieldMatrix(FieldElement[])}\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 38)",
        "(line 493,col 9)-(line 493,col 61)",
        "(line 494,col 9)-(line 496,col 9)",
        "(line 497,col 9)-(line 497,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkRowIndex(org.apache.commons.math.linear.AnyMatrix, int)",
      "begin_line": 506,
      "end_line": 511,
      "comment": "\n     * Check if a row index is valid.\n     * @param m matrix containing the submatrix\n     * @param row row index to check\n     * @exception MatrixIndexException if index is not valid\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 510,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkColumnIndex(org.apache.commons.math.linear.AnyMatrix, int)",
      "begin_line": 519,
      "end_line": 525,
      "comment": "\n     * Check if a column index is valid.\n     * @param m matrix containing the submatrix\n     * @param column column index to check\n     * @exception MatrixIndexException if index is not valid\n     ",
      "child_ranges": [
        "(line 521,col 9)-(line 524,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math.linear.AnyMatrix, int, int, int, int)",
      "begin_line": 538,
      "end_line": 556,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param m matrix containing the submatrix\n     * @param startRow Initial row index\n     * @param endRow Final row index\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @exception MatrixIndexException  if the indices are not valid\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 35)",
        "(line 542,col 9)-(line 542,col 33)",
        "(line 543,col 9)-(line 546,col 9)",
        "(line 548,col 9)-(line 548,col 41)",
        "(line 549,col 9)-(line 549,col 39)",
        "(line 550,col 9)-(line 553,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math.linear.AnyMatrix, int[], int[])",
      "begin_line": 567,
      "end_line": 583,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param m matrix containing the submatrix\n     * @param selectedRows Array of row indices.\n     * @param selectedColumns Array of column indices.\n     * @exception MatrixIndexException if row or column selections are not valid\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 575,col 9)",
        "(line 577,col 9)-(line 579,col 9)",
        "(line 580,col 9)-(line 582,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkAdditionCompatible(org.apache.commons.math.linear.AnyMatrix, org.apache.commons.math.linear.AnyMatrix)",
      "begin_line": 591,
      "end_line": 600,
      "comment": "\n     * Check if matrices are addition compatible\n     * @param left left hand side matrix\n     * @param right right hand side matrix\n     * @exception IllegalArgumentException if matrices are not addition compatible\n     ",
      "child_ranges": [
        "(line 593,col 9)-(line 599,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkSubtractionCompatible(org.apache.commons.math.linear.AnyMatrix, org.apache.commons.math.linear.AnyMatrix)",
      "begin_line": 608,
      "end_line": 617,
      "comment": "\n     * Check if matrices are subtraction compatible\n     * @param left left hand side matrix\n     * @param right right hand side matrix\n     * @exception IllegalArgumentException if matrices are not subtraction compatible\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 616,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkMultiplicationCompatible(org.apache.commons.math.linear.AnyMatrix, org.apache.commons.math.linear.AnyMatrix)",
      "begin_line": 625,
      "end_line": 633,
      "comment": "\n     * Check if matrices are multiplication compatible\n     * @param left left hand side matrix\n     * @param right right hand side matrix\n     * @exception IllegalArgumentException if matrices are not multiplication compatible\n     ",
      "child_ranges": [
        "(line 627,col 9)-(line 632,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.fractionMatrixToRealMatrix(org.apache.commons.math.linear.FieldMatrix\u003corg.apache.commons.math.fraction.Fraction\u003e)",
      "begin_line": 640,
      "end_line": 644,
      "comment": "\n     * Convert a {@link FieldMatrix}/{@link Fraction} matrix to a {@link RealMatrix}.\n     * @param m matrix to convert\n     * @return converted matrix\n     ",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 80)",
        "(line 642,col 9)-(line 642,col 42)",
        "(line 643,col 9)-(line 643,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FractionMatrixConverter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DefaultFieldMatrixPreservingVisitor\u003corg.apache.commons.math.fraction.Fraction\u003e"
      ],
      "begin_line": 647,
      "end_line": 677,
      "comment": " Converter for {@link FieldMatrix}/{@link Fraction}. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 650,
      "end_line": 650,
      "comment": " Converted array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.MatrixUtils.FractionMatrixConverter.FractionMatrixConverter()",
      "begin_line": 653,
      "end_line": 655,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 654,col 13)-(line 654,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.FractionMatrixConverter.start(int, int, int, int, int, int)",
      "begin_line": 658,
      "end_line": 662,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 661,col 13)-(line 661,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.FractionMatrixConverter.visit(int, int, org.apache.commons.math.fraction.Fraction)",
      "begin_line": 665,
      "end_line": 668,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 667,col 13)-(line 667,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.FractionMatrixConverter.getConvertedMatrix()",
      "begin_line": 673,
      "end_line": 675,
      "comment": " Get the converted matrix.\n         * @return converted matrix\n         ",
      "child_ranges": [
        "(line 674,col 13)-(line 674,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.bigFractionMatrixToRealMatrix(org.apache.commons.math.linear.FieldMatrix\u003corg.apache.commons.math.fraction.BigFraction\u003e)",
      "begin_line": 684,
      "end_line": 688,
      "comment": "\n     * Convert a {@link FieldMatrix}/{@link BigFraction} matrix to a {@link RealMatrix}.\n     * @param m matrix to convert\n     * @return converted matrix\n     ",
      "child_ranges": [
        "(line 685,col 9)-(line 685,col 86)",
        "(line 686,col 9)-(line 686,col 42)",
        "(line 687,col 9)-(line 687,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BigFractionMatrixConverter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DefaultFieldMatrixPreservingVisitor\u003corg.apache.commons.math.fraction.BigFraction\u003e"
      ],
      "begin_line": 691,
      "end_line": 721,
      "comment": " Converter for {@link FieldMatrix}/{@link BigFraction}. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 694,
      "end_line": 694,
      "comment": " Converted array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.MatrixUtils.BigFractionMatrixConverter.BigFractionMatrixConverter()",
      "begin_line": 697,
      "end_line": 699,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 698,col 13)-(line 698,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.BigFractionMatrixConverter.start(int, int, int, int, int, int)",
      "begin_line": 702,
      "end_line": 706,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 705,col 13)-(line 705,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.BigFractionMatrixConverter.visit(int, int, org.apache.commons.math.fraction.BigFraction)",
      "begin_line": 709,
      "end_line": 712,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 711,col 13)-(line 711,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.BigFractionMatrixConverter.getConvertedMatrix()",
      "begin_line": 717,
      "end_line": 719,
      "comment": " Get the converted matrix.\n         * @return converted matrix\n         ",
      "child_ranges": [
        "(line 718,col 13)-(line 718,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.serializeRealVector(org.apache.commons.math.linear.RealVector, java.io.ObjectOutputStream)",
      "begin_line": 763,
      "end_line": 771,
      "comment": " Serialize a {@link RealVector}.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ewriteObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eoos.defaultWriteObject()\u003c/code\u003e) in a class that has a\n     * {@link RealVector} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not serialize the vector (the {@link\n     * RealVector} interface is not serializable by default) but this method does\n     * serialize it specifically.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The following example shows how a simple class with a name and a real vector\n     * should be written:\n     * \u003cpre\u003e\u003ccode\u003e\n     * public class NamedVector implements Serializable {\n     *\n     *     private final String name;\n     *     private final transient RealVector coefficients;\n     *\n     *     // omitted constructors, getters ...\n     *\n     *     private void writeObject(ObjectOutputStream oos) throws IOException {\n     *         oos.defaultWriteObject();  // takes care of name field\n     *         MatrixUtils.serializeRealVector(coefficients, oos);\n     *     }\n     *\n     *     private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {\n     *         ois.defaultReadObject();  // takes care of name field\n     *         MatrixUtils.deserializeRealVector(this, \"coefficients\", ois);\n     *     }\n     *\n     * }\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \u003c/p\u003e\n     * \n     * @param vector real vector to serialize\n     * @param oos stream where the real vector should be written\n     * @exception IOException if object cannot be written to stream\n     * @see #deserializeRealVector(Object, String, ObjectInputStream)\n     ",
      "child_ranges": [
        "(line 766,col 9)-(line 766,col 44)",
        "(line 767,col 9)-(line 767,col 24)",
        "(line 768,col 9)-(line 770,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.deserializeRealVector(java.lang.Object, java.lang.String, java.io.ObjectInputStream)",
      "begin_line": 790,
      "end_line": 822,
      "comment": " Deserialize  a {@link RealVector} field in a class.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ereadObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eois.defaultReadObject()\u003c/code\u003e) in a class that has a\n     * {@link RealVector} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not deserialize the vector (the {@link\n     * RealVector} interface is not serializable by default) but this method does\n     * deserialize it specifically.\n     * \u003c/p\u003e\n     * @param instance instance in which the field must be set up\n     * @param fieldName name of the field within the class (may be private and final)\n     * @param ois stream from which the real vector should be read\n     * @exception ClassNotFoundException if a class in the stream cannot be found\n     * @exception IOException if object cannot be read from the stream\n     * @see #serializeRealVector(RealVector, ObjectOutputStream)\n     ",
      "child_ranges": [
        "(line 794,col 9)-(line 820,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.serializeRealMatrix(org.apache.commons.math.linear.RealMatrix, java.io.ObjectOutputStream)",
      "begin_line": 864,
      "end_line": 876,
      "comment": " Serialize a {@link RealMatrix}.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ewriteObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eoos.defaultWriteObject()\u003c/code\u003e) in a class that has a\n     * {@link RealMatrix} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not serialize the matrix (the {@link\n     * RealMatrix} interface is not serializable by default) but this method does\n     * serialize it specifically.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The following example shows how a simple class with a name and a real matrix\n     * should be written:\n     * \u003cpre\u003e\u003ccode\u003e\n     * public class NamedMatrix implements Serializable {\n     *\n     *     private final String name;\n     *     private final transient RealMatrix coefficients;\n     *\n     *     // omitted constructors, getters ...\n     *\n     *     private void writeObject(ObjectOutputStream oos) throws IOException {\n     *         oos.defaultWriteObject();  // takes care of name field\n     *         MatrixUtils.serializeRealMatrix(coefficients, oos);\n     *     }\n     *\n     *     private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {\n     *         ois.defaultReadObject();  // takes care of name field\n     *         MatrixUtils.deserializeRealMatrix(this, \"coefficients\", ois);\n     *     }\n     *\n     * }\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \u003c/p\u003e\n     * \n     * @param matrix real matrix to serialize\n     * @param oos stream where the real matrix should be written\n     * @exception IOException if object cannot be written to stream\n     * @see #deserializeRealMatrix(Object, String, ObjectInputStream)\n     ",
      "child_ranges": [
        "(line 867,col 9)-(line 867,col 47)",
        "(line 868,col 9)-(line 868,col 50)",
        "(line 869,col 9)-(line 869,col 24)",
        "(line 870,col 9)-(line 870,col 24)",
        "(line 871,col 9)-(line 875,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.deserializeRealMatrix(java.lang.Object, java.lang.String, java.io.ObjectInputStream)",
      "begin_line": 895,
      "end_line": 931,
      "comment": " Deserialize  a {@link RealMatrix} field in a class.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ereadObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eois.defaultReadObject()\u003c/code\u003e) in a class that has a\n     * {@link RealMatrix} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not deserialize the matrix (the {@link\n     * RealMatrix} interface is not serializable by default) but this method does\n     * deserialize it specifically.\n     * \u003c/p\u003e\n     * @param instance instance in which the field must be set up\n     * @param fieldName name of the field within the class (may be private and final)\n     * @param ois stream from which the real matrix should be read\n     * @exception ClassNotFoundException if a class in the stream cannot be found\n     * @exception IOException if object cannot be read from the stream\n     * @see #serializeVector(RealVector, ObjectOutputStream)\n     ",
      "child_ranges": [
        "(line 899,col 9)-(line 929,col 9)"
      ]
    }
  ]
}