{
  "filepath": "/tmp/Math-89b/src/java/org/apache/commons/math/linear/MatrixUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MatrixUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 330,
      "comment": "\n * A collection of static methods that operate on or return matrices.\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.MatrixUtils.MatrixUtils()",
      "begin_line": 33,
      "end_line": 35,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealMatrix(int, int)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Returns a {@link RealMatrix} with specified dimensions.\n     * \u003cp\u003eThe matrix elements are all set to 0.0.\u003c/p\u003e\n     * @param rows number of rows of the matrix\n     * @param columns number of columns of the matrix\n     * @return  RealMatrix with specified dimensions\n     * @see #createRealMatrix(double[][])\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealMatrix(double[][])",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Returns a {@link RealMatrix} whose entries are the the values in the\n     * the input array.  The input array is copied, not referenced.\n     * \n     * @param data input array\n     * @return  RealMatrix containing the values of the array\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003edata\u003c/code\u003e is null\n     * @see #createRealMatrix(int, int)\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix(int)",
      "begin_line": 72,
      "end_line": 78,
      "comment": "\n     * Returns \u003ccode\u003edimension x dimension\u003c/code\u003e identity matrix.\n     *\n     * @param dimension dimension of identity matrix to generate\n     * @return identity matrix\n     * @throws IllegalArgumentException if dimension is not positive\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 68)",
        "(line 74,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealDiagonalMatrix(double[])",
      "begin_line": 88,
      "end_line": 94,
      "comment": "\n     * Returns a diagonal matrix with specified elements.\n     *\n     * @param diagonal diagonal elements of the matrix (the array elements\n     * will be copied)\n     * @return diagonal matrix\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 80)",
        "(line 90,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createBigMatrix(double[][])",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * Returns a {@link BigMatrix} whose entries are the the values in the\n     * the input array.  The input array is copied, not referenced.\n     * \n     * @param data input array\n     * @return  RealMatrix containing the values of the array\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if data is null\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createBigMatrix(java.math.BigDecimal[][])",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * Returns a {@link BigMatrix} whose entries are the the values in the\n     * the input array.  The input array is copied, not referenced.\n     * \n     * @param data input array\n     * @return  RealMatrix containing the values of the array\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if data is null\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createBigMatrix(java.math.BigDecimal[][], boolean)",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * Returns a {@link BigMatrix} whose entries are the the values in the\n     * the input array.\n     * \u003cp\u003eIf an array is built specially in order to be embedded in a\n     * BigMatrix and not used directly, the \u003ccode\u003ecopyArray\u003c/code\u003e may be\n     * set to \u003ccode\u003efalse\u003c/code. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\u003c/p\u003e\n     * @param data data for new matrix\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     * @return  BigMatrix containing the values of the array\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003edata\u003c/code\u003e is null\n     * @see #createRealMatrix(double[][])\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createBigMatrix(java.lang.String[][])",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Returns a {@link BigMatrix} whose entries are the the values in the\n     * the input array.  The input array is copied, not referenced.\n     * \n     * @param data input array\n     * @return  RealMatrix containing the values of the array\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if data is null\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealVector(double[])",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * Creates a {@link RealVector} using the data from the input array. \n     * \n     * @param data the input data\n     * @return a data.length RealVector\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003edata\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(double[])",
      "begin_line": 179,
      "end_line": 186,
      "comment": "\n     * Creates a row {@link RealMatrix} using the data from the input\n     * array. \n     * \n     * @param rowData the input row data\n     * @return a 1 x rowData.length RealMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003erowData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003erowData\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 41)",
        "(line 181,col 9)-(line 181,col 56)",
        "(line 182,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(double[])",
      "begin_line": 197,
      "end_line": 204,
      "comment": "\n     * Creates a row {@link BigMatrix} using the data from the input\n     * array. \n     * \n     * @param rowData the input row data\n     * @return a 1 x rowData.length BigMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003erowData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003erowData\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 41)",
        "(line 199,col 9)-(line 199,col 61)",
        "(line 200,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 203,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(java.math.BigDecimal[])",
      "begin_line": 215,
      "end_line": 220,
      "comment": "\n     * Creates a row {@link BigMatrix} using the data from the input\n     * array. \n     * \n     * @param rowData the input row data\n     * @return a 1 x rowData.length BigMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003erowData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003erowData\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 41)",
        "(line 217,col 9)-(line 217,col 61)",
        "(line 218,col 9)-(line 218,col 56)",
        "(line 219,col 9)-(line 219,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(java.lang.String[])",
      "begin_line": 231,
      "end_line": 238,
      "comment": "\n     * Creates a row {@link BigMatrix} using the data from the input\n     * array. \n     * \n     * @param rowData the input row data\n     * @return a 1 x rowData.length BigMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003erowData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003erowData\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 41)",
        "(line 233,col 9)-(line 233,col 61)",
        "(line 234,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 237,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(double[])",
      "begin_line": 249,
      "end_line": 256,
      "comment": "\n     * Creates a column {@link RealMatrix} using the data from the input\n     * array.\n     * \n     * @param columnData  the input column data\n     * @return a columnData x 1 RealMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003ecolumnData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003ecolumnData\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 44)",
        "(line 251,col 9)-(line 251,col 56)",
        "(line 252,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(double[])",
      "begin_line": 267,
      "end_line": 274,
      "comment": "\n     * Creates a column {@link BigMatrix} using the data from the input\n     * array.\n     * \n     * @param columnData  the input column data\n     * @return a columnData x 1 BigMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003ecolumnData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003ecolumnData\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 44)",
        "(line 269,col 9)-(line 269,col 61)",
        "(line 270,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 273,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(java.math.BigDecimal[])",
      "begin_line": 285,
      "end_line": 292,
      "comment": "\n     * Creates a column {@link BigMatrix} using the data from the input\n     * array.\n     * \n     * @param columnData  the input column data\n     * @return a columnData x 1 BigMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003ecolumnData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003ecolumnData\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 44)",
        "(line 287,col 9)-(line 287,col 61)",
        "(line 288,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 291,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(java.lang.String[])",
      "begin_line": 303,
      "end_line": 310,
      "comment": "\n     * Creates a column {@link BigMatrix} using the data from the input\n     * array.\n     * \n     * @param columnData  the input column data\n     * @return a columnData x 1 BigMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003ecolumnData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003ecolumnData\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 38)",
        "(line 305,col 9)-(line 305,col 61)",
        "(line 306,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 309,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix(int)",
      "begin_line": 320,
      "end_line": 328,
      "comment": "\n     * Returns \u003ccode\u003edimension x dimension\u003c/code\u003e identity matrix.\n     *\n     * @param dimension dimension of identity matrix to generate\n     * @return identity matrix\n     * @throws IllegalArgumentException if dimension is not positive\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 70)",
        "(line 322,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 327,col 43)"
      ]
    }
  ]
}