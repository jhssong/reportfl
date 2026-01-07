{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/linear/MatrixUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MatrixUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 265,
      "comment": "\n * A collection of static methods that operate on or return matrices.\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.MatrixUtils.MatrixUtils()",
      "begin_line": 31,
      "end_line": 33,
      "comment": "\n     * Default constructor.  Package scope to prevent unwanted instantiation. \n     ",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealMatrix(double[][])",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Returns a {@link RealMatrix} whose entries are the the values in the\n     * the input array.  The input array is copied, not referenced.\n     * \n     * @param data input array\n     * @return  RealMatrix containing the values of the array\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if data is null\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix(int)",
      "begin_line": 57,
      "end_line": 66,
      "comment": "\n     * Returns \u003ccode\u003edimension x dimension\u003c/code\u003e identity matrix.\n     *\n     * @param dimension dimension of identity matrix to generate\n     * @return identity matrix\n     * @throws IllegalArgumentException if dimension is not positive\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 70)",
        "(line 59,col 9)-(line 59,col 40)",
        "(line 60,col 9)-(line 64,col 9)",
        "(line 65,col 9)-(line 65,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createBigMatrix(double[][])",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Returns a {@link BigMatrix} whose entries are the the values in the\n     * the input array.  The input array is copied, not referenced.\n     * \n     * @param data input array\n     * @return  RealMatrix containing the values of the array\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if data is null\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createBigMatrix(java.math.BigDecimal[][])",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Returns a {@link BigMatrix} whose entries are the the values in the\n     * the input array.  The input array is copied, not referenced.\n     * \n     * @param data input array\n     * @return  RealMatrix containing the values of the array\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if data is null\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createBigMatrix(java.lang.String[][])",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * Returns a {@link BigMatrix} whose entries are the the values in the\n     * the input array.  The input array is copied, not referenced.\n     * \n     * @param data input array\n     * @return  RealMatrix containing the values of the array\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if data is null\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(double[])",
      "begin_line": 119,
      "end_line": 124,
      "comment": "\n     * Creates a row {@link RealMatrix} using the data from the input\n     * array. \n     * \n     * @param rowData the input row data\n     * @return a 1 x rowData.length RealMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003erowData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003erowData\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 35)",
        "(line 121,col 9)-(line 121,col 47)",
        "(line 122,col 9)-(line 122,col 56)",
        "(line 123,col 9)-(line 123,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(double[])",
      "begin_line": 135,
      "end_line": 140,
      "comment": "\n     * Creates a row {@link BigMatrix} using the data from the input\n     * array. \n     * \n     * @param rowData the input row data\n     * @return a 1 x rowData.length BigMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003erowData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003erowData\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 35)",
        "(line 137,col 9)-(line 137,col 47)",
        "(line 138,col 9)-(line 138,col 56)",
        "(line 139,col 9)-(line 139,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(java.math.BigDecimal[])",
      "begin_line": 151,
      "end_line": 156,
      "comment": "\n     * Creates a row {@link BigMatrix} using the data from the input\n     * array. \n     * \n     * @param rowData the input row data\n     * @return a 1 x rowData.length BigMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003erowData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003erowData\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 35)",
        "(line 153,col 9)-(line 153,col 55)",
        "(line 154,col 9)-(line 154,col 56)",
        "(line 155,col 9)-(line 155,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(java.lang.String[])",
      "begin_line": 167,
      "end_line": 172,
      "comment": "\n     * Creates a row {@link BigMatrix} using the data from the input\n     * array. \n     * \n     * @param rowData the input row data\n     * @return a 1 x rowData.length BigMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003erowData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003erowData\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 35)",
        "(line 169,col 9)-(line 169,col 47)",
        "(line 170,col 9)-(line 170,col 56)",
        "(line 171,col 9)-(line 171,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(double[])",
      "begin_line": 183,
      "end_line": 190,
      "comment": "\n     * Creates a column {@link RealMatrix} using the data from the input\n     * array.\n     * \n     * @param columnData  the input column data\n     * @return a columnData x 1 RealMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003ecolumnData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003ecolumnData\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 38)",
        "(line 185,col 9)-(line 185,col 47)",
        "(line 186,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(double[])",
      "begin_line": 201,
      "end_line": 208,
      "comment": "\n     * Creates a column {@link BigMatrix} using the data from the input\n     * array.\n     * \n     * @param columnData  the input column data\n     * @return a columnData x 1 BigMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003ecolumnData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003ecolumnData\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 38)",
        "(line 203,col 9)-(line 203,col 47)",
        "(line 204,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 207,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(java.math.BigDecimal[])",
      "begin_line": 219,
      "end_line": 226,
      "comment": "\n     * Creates a column {@link BigMatrix} using the data from the input\n     * array.\n     * \n     * @param columnData  the input column data\n     * @return a columnData x 1 BigMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003ecolumnData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003ecolumnData\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 38)",
        "(line 221,col 9)-(line 221,col 55)",
        "(line 222,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(java.lang.String[])",
      "begin_line": 237,
      "end_line": 244,
      "comment": "\n     * Creates a column {@link BigMatrix} using the data from the input\n     * array.\n     * \n     * @param columnData  the input column data\n     * @return a columnData x 1 BigMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003ecolumnData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003ecolumnData\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 38)",
        "(line 239,col 9)-(line 239,col 47)",
        "(line 240,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 243,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix(int)",
      "begin_line": 254,
      "end_line": 263,
      "comment": "\n     * Returns \u003ccode\u003edimension x dimension\u003c/code\u003e identity matrix.\n     *\n     * @param dimension dimension of identity matrix to generate\n     * @return identity matrix\n     * @throws IllegalArgumentException if dimension is not positive\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 68)",
        "(line 256,col 9)-(line 256,col 44)",
        "(line 257,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 19)"
      ]
    }
  ]
}