{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/linear/MatrixUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MatrixUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 957,
      "comment": "\n * A collection of static methods that operate on or return matrices.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.MatrixUtils.MatrixUtils()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Private constructor.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealMatrix(int, int)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Returns a {@link RealMatrix} with specified dimensions.\n     * \u003cp\u003eThe type of matrix returned depends on the dimension. Below\n     * 2\u003csup\u003e12\u003c/sup\u003e elements (i.e. 4096 elements or 64\u0026times;64 for a\n     * square matrix) which can be stored in a 32kB array, a {@link\n     * Array2DRowRealMatrix} instance is built. Above this threshold a {@link\n     * BlockRealMatrix} instance is built.\u003c/p\u003e\n     * \u003cp\u003eThe matrix elements are all set to 0.0.\u003c/p\u003e\n     * @param rows number of rows of the matrix\n     * @param columns number of columns of the matrix\n     * @return  RealMatrix with specified dimensions\n     * @see #createRealMatrix(double[][])\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 63,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createFieldMatrix(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 81,
      "end_line": 86,
      "comment": "\n     * Returns a {@link FieldMatrix} with specified dimensions.\n     * \u003cp\u003eThe type of matrix returned depends on the dimension. Below\n     * 2\u003csup\u003e12\u003c/sup\u003e elements (i.e. 4096 elements or 64\u0026times;64 for a\n     * square matrix), a {@link FieldMatrix} instance is built. Above\n     * this threshold a {@link BlockFieldMatrix} instance is built.\u003c/p\u003e\n     * \u003cp\u003eThe matrix elements are all set to field.getZero().\u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param field field to which the matrix elements belong\n     * @param rows number of rows of the matrix\n     * @param columns number of columns of the matrix\n     * @return  FieldMatrix with specified dimensions\n     * @see #createFieldMatrix(FieldElement[][])\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 85,col 115)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealMatrix(double[][])",
      "begin_line": 106,
      "end_line": 109,
      "comment": "\n     * Returns a {@link RealMatrix} whose entries are the the values in the\n     * the input array.\n     * \u003cp\u003eThe type of matrix returned depends on the dimension. Below\n     * 2\u003csup\u003e12\u003c/sup\u003e elements (i.e. 4096 elements or 64\u0026times;64 for a\n     * square matrix) which can be stored in a 32kB array, a {@link\n     * Array2DRowRealMatrix} instance is built. Above this threshold a {@link\n     * BlockRealMatrix} instance is built.\u003c/p\u003e\n     * \u003cp\u003eThe input array is copied, not referenced.\u003c/p\u003e\n     *\n     * @param data input array\n     * @return  RealMatrix containing the values of the array\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if either \u003ccode\u003edata\u003c/code\u003e or\n     * \u003ccode\u003edata[0]\u003c/code\u003e is null\n     * @see #createRealMatrix(int, int)\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 108,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createFieldMatrix(T[][])",
      "begin_line": 129,
      "end_line": 132,
      "comment": "\n     * Returns a {@link FieldMatrix} whose entries are the the values in the\n     * the input array.\n     * \u003cp\u003eThe type of matrix returned depends on the dimension. Below\n     * 2\u003csup\u003e12\u003c/sup\u003e elements (i.e. 4096 elements or 64\u0026times;64 for a\n     * square matrix), a {@link FieldMatrix} instance is built. Above\n     * this threshold a {@link BlockFieldMatrix} instance is built.\u003c/p\u003e\n     * \u003cp\u003eThe input array is copied, not referenced.\u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param data input array\n     * @return  RealMatrix containing the values of the array\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if either \u003ccode\u003edata\u003c/code\u003e or\n     * \u003ccode\u003edata[0]\u003c/code\u003e is null\n     * @see #createFieldMatrix(Field, int, int)\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 131,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix(int)",
      "begin_line": 142,
      "end_line": 148,
      "comment": "\n     * Returns \u003ccode\u003edimension x dimension\u003c/code\u003e identity matrix.\n     *\n     * @param dimension dimension of identity matrix to generate\n     * @return identity matrix\n     * @throws IllegalArgumentException if dimension is not positive\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 68)",
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createFieldIdentityMatrix(org.apache.commons.math.Field\u003cT\u003e, int)",
      "begin_line": 160,
      "end_line": 172,
      "comment": "\n     * Returns \u003ccode\u003edimension x dimension\u003c/code\u003e identity matrix.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param field field to which the elements belong\n     * @param dimension dimension of identity matrix to generate\n     * @return identity matrix\n     * @throws IllegalArgumentException if dimension is not positive\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 39)",
        "(line 163,col 9)-(line 163,col 38)",
        "(line 164,col 9)-(line 165,col 103)",
        "(line 166,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix(int)",
      "begin_line": 183,
      "end_line": 192,
      "comment": "\n     * Returns \u003ccode\u003edimension x dimension\u003c/code\u003e identity matrix.\n     *\n     * @param dimension dimension of identity matrix to generate\n     * @return identity matrix\n     * @throws IllegalArgumentException if dimension is not positive\n     * @since 1.1\n     * @deprecated since 2.0, replaced by {@link #createFieldIdentityMatrix(Field, int)}\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 70)",
        "(line 186,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 191,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealDiagonalMatrix(double[])",
      "begin_line": 202,
      "end_line": 208,
      "comment": "\n     * Returns a diagonal matrix with specified elements.\n     *\n     * @param diagonal diagonal elements of the matrix (the array elements\n     * will be copied)\n     * @return diagonal matrix\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 80)",
        "(line 204,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 207,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createFieldDiagonalMatrix(T[])",
      "begin_line": 219,
      "end_line": 227,
      "comment": "\n     * Returns a diagonal matrix with specified elements.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param diagonal diagonal elements of the matrix (the array elements\n     * will be copied)\n     * @return diagonal matrix\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 222,col 88)",
        "(line 223,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createBigMatrix(double[][])",
      "begin_line": 240,
      "end_line": 243,
      "comment": "\n     * Returns a {@link BigMatrix} whose entries are the the values in the\n     * the input array.  The input array is copied, not referenced.\n     *\n     * @param data input array\n     * @return  RealMatrix containing the values of the array\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if data is null\n     * @deprecated since 2.0 replaced by {@link #createFieldMatrix(FieldElement[][])}\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createBigMatrix(java.math.BigDecimal[][])",
      "begin_line": 256,
      "end_line": 259,
      "comment": "\n     * Returns a {@link BigMatrix} whose entries are the the values in the\n     * the input array.  The input array is copied, not referenced.\n     *\n     * @param data input array\n     * @return  RealMatrix containing the values of the array\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if data is null\n     * @deprecated since 2.0 replaced by {@link #createFieldMatrix(FieldElement[][])}\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createBigMatrix(java.math.BigDecimal[][], boolean)",
      "begin_line": 278,
      "end_line": 281,
      "comment": "\n     * Returns a {@link BigMatrix} whose entries are the the values in the\n     * the input array.\n     * \u003cp\u003eIf an array is built specially in order to be embedded in a\n     * BigMatrix and not used directly, the \u003ccode\u003ecopyArray\u003c/code\u003e may be\n     * set to \u003ccode\u003efalse\u003c/code. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\u003c/p\u003e\n     * @param data data for new matrix\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     * @return  BigMatrix containing the values of the array\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003edata\u003c/code\u003e is null\n     * @see #createRealMatrix(double[][])\n     * @deprecated since 2.0 replaced by {@link #createFieldMatrix(FieldElement[][])}\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createBigMatrix(java.lang.String[][])",
      "begin_line": 294,
      "end_line": 297,
      "comment": "\n     * Returns a {@link BigMatrix} whose entries are the the values in the\n     * the input array.  The input array is copied, not referenced.\n     *\n     * @param data input array\n     * @return  RealMatrix containing the values of the array\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if data is null\n     * @deprecated since 2.0 replaced by {@link #createFieldMatrix(FieldElement[][])}\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealVector(double[])",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\n     * Creates a {@link RealVector} using the data from the input array.\n     *\n     * @param data the input data\n     * @return a data.length RealVector\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003edata\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createFieldVector(T[])",
      "begin_line": 320,
      "end_line": 322,
      "comment": "\n     * Creates a {@link FieldVector} using the data from the input array.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param data the input data\n     * @return a data.length FieldVector\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003edata\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(double[])",
      "begin_line": 333,
      "end_line": 340,
      "comment": "\n     * Creates a row {@link RealMatrix} using the data from the input\n     * array.\n     *\n     * @param rowData the input row data\n     * @return a 1 x rowData.length RealMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003erowData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003erowData\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 41)",
        "(line 335,col 9)-(line 335,col 56)",
        "(line 336,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 339,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRowFieldMatrix(T[])",
      "begin_line": 352,
      "end_line": 363,
      "comment": "\n     * Creates a row {@link FieldMatrix} using the data from the input\n     * array.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param rowData the input row data\n     * @return a 1 x rowData.length FieldMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003erowData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003erowData\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 41)",
        "(line 355,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 84)",
        "(line 359,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 362,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(double[])",
      "begin_line": 375,
      "end_line": 383,
      "comment": "\n     * Creates a row {@link BigMatrix} using the data from the input\n     * array.\n     *\n     * @param rowData the input row data\n     * @return a 1 x rowData.length BigMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003erowData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003erowData\u003c/code\u003eis null\n     * @deprecated since 2.0 replaced by {@link #createRowFieldMatrix(FieldElement[])}\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 41)",
        "(line 378,col 9)-(line 378,col 61)",
        "(line 379,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 382,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(java.math.BigDecimal[])",
      "begin_line": 395,
      "end_line": 401,
      "comment": "\n     * Creates a row {@link BigMatrix} using the data from the input\n     * array.\n     *\n     * @param rowData the input row data\n     * @return a 1 x rowData.length BigMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003erowData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003erowData\u003c/code\u003eis null\n     * @deprecated since 2.0 replaced by {@link #createRowFieldMatrix(FieldElement[])}\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 41)",
        "(line 398,col 9)-(line 398,col 61)",
        "(line 399,col 9)-(line 399,col 56)",
        "(line 400,col 9)-(line 400,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(java.lang.String[])",
      "begin_line": 413,
      "end_line": 421,
      "comment": "\n     * Creates a row {@link BigMatrix} using the data from the input\n     * array.\n     *\n     * @param rowData the input row data\n     * @return a 1 x rowData.length BigMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003erowData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003erowData\u003c/code\u003eis null\n     * @deprecated since 2.0 replaced by {@link #createRowFieldMatrix(FieldElement[])}\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 41)",
        "(line 416,col 9)-(line 416,col 61)",
        "(line 417,col 9)-(line 419,col 9)",
        "(line 420,col 9)-(line 420,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(double[])",
      "begin_line": 432,
      "end_line": 439,
      "comment": "\n     * Creates a column {@link RealMatrix} using the data from the input\n     * array.\n     *\n     * @param columnData  the input column data\n     * @return a columnData x 1 RealMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003ecolumnData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003ecolumnData\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 44)",
        "(line 434,col 9)-(line 434,col 56)",
        "(line 435,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 438,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createColumnFieldMatrix(T[])",
      "begin_line": 451,
      "end_line": 462,
      "comment": "\n     * Creates a column {@link FieldMatrix} using the data from the input\n     * array.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param columnData  the input column data\n     * @return a columnData x 1 FieldMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003ecolumnData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003ecolumnData\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 44)",
        "(line 454,col 9)-(line 456,col 9)",
        "(line 457,col 9)-(line 457,col 87)",
        "(line 458,col 9)-(line 460,col 9)",
        "(line 461,col 9)-(line 461,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(double[])",
      "begin_line": 474,
      "end_line": 482,
      "comment": "\n     * Creates a column {@link BigMatrix} using the data from the input\n     * array.\n     *\n     * @param columnData  the input column data\n     * @return a columnData x 1 BigMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003ecolumnData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003ecolumnData\u003c/code\u003eis null\n     * @deprecated since 2.0 replaced by {@link #createColumnFieldMatrix(FieldElement[])}\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 44)",
        "(line 477,col 9)-(line 477,col 61)",
        "(line 478,col 9)-(line 480,col 9)",
        "(line 481,col 9)-(line 481,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(java.math.BigDecimal[])",
      "begin_line": 494,
      "end_line": 502,
      "comment": "\n     * Creates a column {@link BigMatrix} using the data from the input\n     * array.\n     *\n     * @param columnData  the input column data\n     * @return a columnData x 1 BigMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003ecolumnData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003ecolumnData\u003c/code\u003eis null\n     * @deprecated since 2.0 replaced by {@link #createColumnFieldMatrix(FieldElement[])}\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 44)",
        "(line 497,col 9)-(line 497,col 61)",
        "(line 498,col 9)-(line 500,col 9)",
        "(line 501,col 9)-(line 501,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(java.lang.String[])",
      "begin_line": 514,
      "end_line": 522,
      "comment": "\n     * Creates a column {@link BigMatrix} using the data from the input\n     * array.\n     *\n     * @param columnData  the input column data\n     * @return a columnData x 1 BigMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003ecolumnData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003ecolumnData\u003c/code\u003eis null\n     * @deprecated since 2.0 replaced by {@link #createColumnFieldMatrix(FieldElement[])}\n     ",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 38)",
        "(line 517,col 9)-(line 517,col 61)",
        "(line 518,col 9)-(line 520,col 9)",
        "(line 521,col 9)-(line 521,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkRowIndex(org.apache.commons.math.linear.AnyMatrix, int)",
      "begin_line": 530,
      "end_line": 535,
      "comment": "\n     * Check if a row index is valid.\n     * @param m matrix containing the submatrix\n     * @param row row index to check\n     * @exception MatrixIndexException if index is not valid\n     ",
      "child_ranges": [
        "(line 531,col 9)-(line 534,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkColumnIndex(org.apache.commons.math.linear.AnyMatrix, int)",
      "begin_line": 543,
      "end_line": 549,
      "comment": "\n     * Check if a column index is valid.\n     * @param m matrix containing the submatrix\n     * @param column column index to check\n     * @exception MatrixIndexException if index is not valid\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 548,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math.linear.AnyMatrix, int, int, int, int)",
      "begin_line": 562,
      "end_line": 580,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param m matrix containing the submatrix\n     * @param startRow Initial row index\n     * @param endRow Final row index\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @exception MatrixIndexException  if the indices are not valid\n     ",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 35)",
        "(line 566,col 9)-(line 566,col 33)",
        "(line 567,col 9)-(line 570,col 9)",
        "(line 572,col 9)-(line 572,col 41)",
        "(line 573,col 9)-(line 573,col 39)",
        "(line 574,col 9)-(line 577,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math.linear.AnyMatrix, int[], int[])",
      "begin_line": 591,
      "end_line": 607,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param m matrix containing the submatrix\n     * @param selectedRows Array of row indices.\n     * @param selectedColumns Array of column indices.\n     * @exception MatrixIndexException if row or column selections are not valid\n     ",
      "child_ranges": [
        "(line 594,col 9)-(line 599,col 9)",
        "(line 601,col 9)-(line 603,col 9)",
        "(line 604,col 9)-(line 606,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkAdditionCompatible(org.apache.commons.math.linear.AnyMatrix, org.apache.commons.math.linear.AnyMatrix)",
      "begin_line": 615,
      "end_line": 624,
      "comment": "\n     * Check if matrices are addition compatible\n     * @param left left hand side matrix\n     * @param right right hand side matrix\n     * @exception IllegalArgumentException if matrices are not addition compatible\n     ",
      "child_ranges": [
        "(line 617,col 9)-(line 623,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkSubtractionCompatible(org.apache.commons.math.linear.AnyMatrix, org.apache.commons.math.linear.AnyMatrix)",
      "begin_line": 632,
      "end_line": 641,
      "comment": "\n     * Check if matrices are subtraction compatible\n     * @param left left hand side matrix\n     * @param right right hand side matrix\n     * @exception IllegalArgumentException if matrices are not subtraction compatible\n     ",
      "child_ranges": [
        "(line 634,col 9)-(line 640,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkMultiplicationCompatible(org.apache.commons.math.linear.AnyMatrix, org.apache.commons.math.linear.AnyMatrix)",
      "begin_line": 649,
      "end_line": 657,
      "comment": "\n     * Check if matrices are multiplication compatible\n     * @param left left hand side matrix\n     * @param right right hand side matrix\n     * @exception IllegalArgumentException if matrices are not multiplication compatible\n     ",
      "child_ranges": [
        "(line 651,col 9)-(line 656,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.fractionMatrixToRealMatrix(org.apache.commons.math.linear.FieldMatrix\u003corg.apache.commons.math.fraction.Fraction\u003e)",
      "begin_line": 664,
      "end_line": 668,
      "comment": "\n     * Convert a {@link FieldMatrix}/{@link Fraction} matrix to a {@link RealMatrix}.\n     * @param m matrix to convert\n     * @return converted matrix\n     ",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 80)",
        "(line 666,col 9)-(line 666,col 42)",
        "(line 667,col 9)-(line 667,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FractionMatrixConverter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DefaultFieldMatrixPreservingVisitor\u003corg.apache.commons.math.fraction.Fraction\u003e"
      ],
      "begin_line": 671,
      "end_line": 701,
      "comment": " Converter for {@link FieldMatrix}/{@link Fraction}. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 674,
      "end_line": 674,
      "comment": " Converted array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.MatrixUtils.FractionMatrixConverter.FractionMatrixConverter()",
      "begin_line": 677,
      "end_line": 679,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 678,col 13)-(line 678,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.FractionMatrixConverter.start(int, int, int, int, int, int)",
      "begin_line": 682,
      "end_line": 686,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 685,col 13)-(line 685,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.FractionMatrixConverter.visit(int, int, org.apache.commons.math.fraction.Fraction)",
      "begin_line": 689,
      "end_line": 692,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 691,col 13)-(line 691,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.FractionMatrixConverter.getConvertedMatrix()",
      "begin_line": 697,
      "end_line": 699,
      "comment": " Get the converted matrix.\n         * @return converted matrix\n         ",
      "child_ranges": [
        "(line 698,col 13)-(line 698,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.bigFractionMatrixToRealMatrix(org.apache.commons.math.linear.FieldMatrix\u003corg.apache.commons.math.fraction.BigFraction\u003e)",
      "begin_line": 708,
      "end_line": 712,
      "comment": "\n     * Convert a {@link FieldMatrix}/{@link BigFraction} matrix to a {@link RealMatrix}.\n     * @param m matrix to convert\n     * @return converted matrix\n     ",
      "child_ranges": [
        "(line 709,col 9)-(line 709,col 86)",
        "(line 710,col 9)-(line 710,col 42)",
        "(line 711,col 9)-(line 711,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BigFractionMatrixConverter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DefaultFieldMatrixPreservingVisitor\u003corg.apache.commons.math.fraction.BigFraction\u003e"
      ],
      "begin_line": 715,
      "end_line": 745,
      "comment": " Converter for {@link FieldMatrix}/{@link BigFraction}. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 718,
      "end_line": 718,
      "comment": " Converted array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.MatrixUtils.BigFractionMatrixConverter.BigFractionMatrixConverter()",
      "begin_line": 721,
      "end_line": 723,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 722,col 13)-(line 722,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.BigFractionMatrixConverter.start(int, int, int, int, int, int)",
      "begin_line": 726,
      "end_line": 730,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 729,col 13)-(line 729,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.BigFractionMatrixConverter.visit(int, int, org.apache.commons.math.fraction.BigFraction)",
      "begin_line": 733,
      "end_line": 736,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 735,col 13)-(line 735,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.BigFractionMatrixConverter.getConvertedMatrix()",
      "begin_line": 741,
      "end_line": 743,
      "comment": " Get the converted matrix.\n         * @return converted matrix\n         ",
      "child_ranges": [
        "(line 742,col 13)-(line 742,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.serializeRealVector(org.apache.commons.math.linear.RealVector, java.io.ObjectOutputStream)",
      "begin_line": 787,
      "end_line": 795,
      "comment": " Serialize a {@link RealVector}.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ewriteObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eoos.defaultWriteObject()\u003c/code\u003e) in a class that has a\n     * {@link RealVector} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not serialize the vector (the {@link\n     * RealVector} interface is not serializable by default) but this method does\n     * serialize it specifically.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The following example shows how a simple class with a name and a real vector\n     * should be written:\n     * \u003cpre\u003e\u003ccode\u003e\n     * public class NamedVector implements Serializable {\n     *\n     *     private final String name;\n     *     private final transient RealVector coefficients;\n     *\n     *     // omitted constructors, getters ...\n     *\n     *     private void writeObject(ObjectOutputStream oos) throws IOException {\n     *         oos.defaultWriteObject();  // takes care of name field\n     *         MatrixUtils.serializeRealVector(coefficients, oos);\n     *     }\n     *\n     *     private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {\n     *         ois.defaultReadObject();  // takes care of name field\n     *         MatrixUtils.deserializeRealVector(this, \"coefficients\", ois);\n     *     }\n     *\n     * }\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param vector real vector to serialize\n     * @param oos stream where the real vector should be written\n     * @exception IOException if object cannot be written to stream\n     * @see #deserializeRealVector(Object, String, ObjectInputStream)\n     ",
      "child_ranges": [
        "(line 790,col 9)-(line 790,col 44)",
        "(line 791,col 9)-(line 791,col 24)",
        "(line 792,col 9)-(line 794,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.deserializeRealVector(java.lang.Object, java.lang.String, java.io.ObjectInputStream)",
      "begin_line": 814,
      "end_line": 846,
      "comment": " Deserialize  a {@link RealVector} field in a class.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ereadObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eois.defaultReadObject()\u003c/code\u003e) in a class that has a\n     * {@link RealVector} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not deserialize the vector (the {@link\n     * RealVector} interface is not serializable by default) but this method does\n     * deserialize it specifically.\n     * \u003c/p\u003e\n     * @param instance instance in which the field must be set up\n     * @param fieldName name of the field within the class (may be private and final)\n     * @param ois stream from which the real vector should be read\n     * @exception ClassNotFoundException if a class in the stream cannot be found\n     * @exception IOException if object cannot be read from the stream\n     * @see #serializeRealVector(RealVector, ObjectOutputStream)\n     ",
      "child_ranges": [
        "(line 818,col 9)-(line 844,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.serializeRealMatrix(org.apache.commons.math.linear.RealMatrix, java.io.ObjectOutputStream)",
      "begin_line": 888,
      "end_line": 900,
      "comment": " Serialize a {@link RealMatrix}.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ewriteObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eoos.defaultWriteObject()\u003c/code\u003e) in a class that has a\n     * {@link RealMatrix} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not serialize the matrix (the {@link\n     * RealMatrix} interface is not serializable by default) but this method does\n     * serialize it specifically.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The following example shows how a simple class with a name and a real matrix\n     * should be written:\n     * \u003cpre\u003e\u003ccode\u003e\n     * public class NamedMatrix implements Serializable {\n     *\n     *     private final String name;\n     *     private final transient RealMatrix coefficients;\n     *\n     *     // omitted constructors, getters ...\n     *\n     *     private void writeObject(ObjectOutputStream oos) throws IOException {\n     *         oos.defaultWriteObject();  // takes care of name field\n     *         MatrixUtils.serializeRealMatrix(coefficients, oos);\n     *     }\n     *\n     *     private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {\n     *         ois.defaultReadObject();  // takes care of name field\n     *         MatrixUtils.deserializeRealMatrix(this, \"coefficients\", ois);\n     *     }\n     *\n     * }\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param matrix real matrix to serialize\n     * @param oos stream where the real matrix should be written\n     * @exception IOException if object cannot be written to stream\n     * @see #deserializeRealMatrix(Object, String, ObjectInputStream)\n     ",
      "child_ranges": [
        "(line 891,col 9)-(line 891,col 47)",
        "(line 892,col 9)-(line 892,col 50)",
        "(line 893,col 9)-(line 893,col 24)",
        "(line 894,col 9)-(line 894,col 24)",
        "(line 895,col 9)-(line 899,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.deserializeRealMatrix(java.lang.Object, java.lang.String, java.io.ObjectInputStream)",
      "begin_line": 919,
      "end_line": 955,
      "comment": " Deserialize  a {@link RealMatrix} field in a class.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ereadObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eois.defaultReadObject()\u003c/code\u003e) in a class that has a\n     * {@link RealMatrix} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not deserialize the matrix (the {@link\n     * RealMatrix} interface is not serializable by default) but this method does\n     * deserialize it specifically.\n     * \u003c/p\u003e\n     * @param instance instance in which the field must be set up\n     * @param fieldName name of the field within the class (may be private and final)\n     * @param ois stream from which the real matrix should be read\n     * @exception ClassNotFoundException if a class in the stream cannot be found\n     * @exception IOException if object cannot be read from the stream\n     * @see #serializeRealMatrix(RealMatrix, ObjectOutputStream)\n     ",
      "child_ranges": [
        "(line 923,col 9)-(line 953,col 9)"
      ]
    }
  ]
}