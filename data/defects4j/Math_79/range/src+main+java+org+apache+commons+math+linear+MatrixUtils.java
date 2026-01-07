{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/linear/MatrixUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MatrixUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 956,
      "comment": "\n * A collection of static methods that operate on or return matrices.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.MatrixUtils.MatrixUtils()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Private constructor.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealMatrix(int, int)",
      "begin_line": 60,
      "end_line": 63,
      "comment": "\n     * Returns a {@link RealMatrix} with specified dimensions.\n     * \u003cp\u003eThe type of matrix returned depends on the dimension. Below\n     * 2\u003csup\u003e12\u003c/sup\u003e elements (i.e. 4096 elements or 64\u0026times;64 for a\n     * square matrix) which can be stored in a 32kB array, a {@link\n     * Array2DRowRealMatrix} instance is built. Above this threshold a {@link\n     * BlockRealMatrix} instance is built.\u003c/p\u003e\n     * \u003cp\u003eThe matrix elements are all set to 0.0.\u003c/p\u003e\n     * @param rows number of rows of the matrix\n     * @param columns number of columns of the matrix\n     * @return  RealMatrix with specified dimensions\n     * @see #createRealMatrix(double[][])\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 62,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createFieldMatrix(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 80,
      "end_line": 85,
      "comment": "\n     * Returns a {@link FieldMatrix} with specified dimensions.\n     * \u003cp\u003eThe type of matrix returned depends on the dimension. Below\n     * 2\u003csup\u003e12\u003c/sup\u003e elements (i.e. 4096 elements or 64\u0026times;64 for a\n     * square matrix), a {@link FieldMatrix} instance is built. Above\n     * this threshold a {@link BlockFieldMatrix} instance is built.\u003c/p\u003e\n     * \u003cp\u003eThe matrix elements are all set to field.getZero().\u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param field field to which the matrix elements belong\n     * @param rows number of rows of the matrix\n     * @param columns number of columns of the matrix\n     * @return  FieldMatrix with specified dimensions\n     * @see #createFieldMatrix(FieldElement[][])\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 84,col 115)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealMatrix(double[][])",
      "begin_line": 105,
      "end_line": 108,
      "comment": "\n     * Returns a {@link RealMatrix} whose entries are the the values in the\n     * the input array.\n     * \u003cp\u003eThe type of matrix returned depends on the dimension. Below\n     * 2\u003csup\u003e12\u003c/sup\u003e elements (i.e. 4096 elements or 64\u0026times;64 for a\n     * square matrix) which can be stored in a 32kB array, a {@link\n     * Array2DRowRealMatrix} instance is built. Above this threshold a {@link\n     * BlockRealMatrix} instance is built.\u003c/p\u003e\n     * \u003cp\u003eThe input array is copied, not referenced.\u003c/p\u003e\n     *\n     * @param data input array\n     * @return  RealMatrix containing the values of the array\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if either \u003ccode\u003edata\u003c/code\u003e or\n     * \u003ccode\u003edata[0]\u003c/code\u003e is null\n     * @see #createRealMatrix(int, int)\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 107,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createFieldMatrix(T[][])",
      "begin_line": 128,
      "end_line": 131,
      "comment": "\n     * Returns a {@link FieldMatrix} whose entries are the the values in the\n     * the input array.\n     * \u003cp\u003eThe type of matrix returned depends on the dimension. Below\n     * 2\u003csup\u003e12\u003c/sup\u003e elements (i.e. 4096 elements or 64\u0026times;64 for a\n     * square matrix), a {@link FieldMatrix} instance is built. Above\n     * this threshold a {@link BlockFieldMatrix} instance is built.\u003c/p\u003e\n     * \u003cp\u003eThe input array is copied, not referenced.\u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param data input array\n     * @return  RealMatrix containing the values of the array\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if either \u003ccode\u003edata\u003c/code\u003e or\n     * \u003ccode\u003edata[0]\u003c/code\u003e is null\n     * @see #createFieldMatrix(Field, int, int)\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 130,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix(int)",
      "begin_line": 141,
      "end_line": 147,
      "comment": "\n     * Returns \u003ccode\u003edimension x dimension\u003c/code\u003e identity matrix.\n     *\n     * @param dimension dimension of identity matrix to generate\n     * @return identity matrix\n     * @throws IllegalArgumentException if dimension is not positive\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 68)",
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createFieldIdentityMatrix(org.apache.commons.math.Field\u003cT\u003e, int)",
      "begin_line": 159,
      "end_line": 171,
      "comment": "\n     * Returns \u003ccode\u003edimension x dimension\u003c/code\u003e identity matrix.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param field field to which the elements belong\n     * @param dimension dimension of identity matrix to generate\n     * @return identity matrix\n     * @throws IllegalArgumentException if dimension is not positive\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 39)",
        "(line 163,col 9)-(line 163,col 38)",
        "(line 164,col 9)-(line 164,col 103)",
        "(line 165,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix(int)",
      "begin_line": 182,
      "end_line": 191,
      "comment": "\n     * Returns \u003ccode\u003edimension x dimension\u003c/code\u003e identity matrix.\n     *\n     * @param dimension dimension of identity matrix to generate\n     * @return identity matrix\n     * @throws IllegalArgumentException if dimension is not positive\n     * @since 1.1\n     * @deprecated since 2.0, replaced by {@link #createFieldIdentityMatrix(Field, int)}\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 70)",
        "(line 185,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealDiagonalMatrix(double[])",
      "begin_line": 201,
      "end_line": 207,
      "comment": "\n     * Returns a diagonal matrix with specified elements.\n     *\n     * @param diagonal diagonal elements of the matrix (the array elements\n     * will be copied)\n     * @return diagonal matrix\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 80)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 206,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createFieldDiagonalMatrix(T[])",
      "begin_line": 218,
      "end_line": 226,
      "comment": "\n     * Returns a diagonal matrix with specified elements.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param diagonal diagonal elements of the matrix (the array elements\n     * will be copied)\n     * @return diagonal matrix\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 221,col 88)",
        "(line 222,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createBigMatrix(double[][])",
      "begin_line": 239,
      "end_line": 242,
      "comment": "\n     * Returns a {@link BigMatrix} whose entries are the the values in the\n     * the input array.  The input array is copied, not referenced.\n     *\n     * @param data input array\n     * @return  RealMatrix containing the values of the array\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if data is null\n     * @deprecated since 2.0 replaced by {@link #createFieldMatrix(FieldElement[][])}\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createBigMatrix(java.math.BigDecimal[][])",
      "begin_line": 255,
      "end_line": 258,
      "comment": "\n     * Returns a {@link BigMatrix} whose entries are the the values in the\n     * the input array.  The input array is copied, not referenced.\n     *\n     * @param data input array\n     * @return  RealMatrix containing the values of the array\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if data is null\n     * @deprecated since 2.0 replaced by {@link #createFieldMatrix(FieldElement[][])}\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createBigMatrix(java.math.BigDecimal[][], boolean)",
      "begin_line": 277,
      "end_line": 280,
      "comment": "\n     * Returns a {@link BigMatrix} whose entries are the the values in the\n     * the input array.\n     * \u003cp\u003eIf an array is built specially in order to be embedded in a\n     * BigMatrix and not used directly, the \u003ccode\u003ecopyArray\u003c/code\u003e may be\n     * set to \u003ccode\u003efalse\u003c/code. This will prevent the copying and improve\n     * performance as no new array will be built and no data will be copied.\u003c/p\u003e\n     * @param data data for new matrix\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     * @return  BigMatrix containing the values of the array\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if \u003ccode\u003edata\u003c/code\u003e is null\n     * @see #createRealMatrix(double[][])\n     * @deprecated since 2.0 replaced by {@link #createFieldMatrix(FieldElement[][])}\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createBigMatrix(java.lang.String[][])",
      "begin_line": 293,
      "end_line": 296,
      "comment": "\n     * Returns a {@link BigMatrix} whose entries are the the values in the\n     * the input array.  The input array is copied, not referenced.\n     *\n     * @param data input array\n     * @return  RealMatrix containing the values of the array\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length) or empty\n     * @throws NullPointerException if data is null\n     * @deprecated since 2.0 replaced by {@link #createFieldMatrix(FieldElement[][])}\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRealVector(double[])",
      "begin_line": 306,
      "end_line": 308,
      "comment": "\n     * Creates a {@link RealVector} using the data from the input array.\n     *\n     * @param data the input data\n     * @return a data.length RealVector\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003edata\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createFieldVector(T[])",
      "begin_line": 319,
      "end_line": 321,
      "comment": "\n     * Creates a {@link FieldVector} using the data from the input array.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param data the input data\n     * @return a data.length FieldVector\n     * @throws IllegalArgumentException if \u003ccode\u003edata\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003edata\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(double[])",
      "begin_line": 332,
      "end_line": 339,
      "comment": "\n     * Creates a row {@link RealMatrix} using the data from the input\n     * array.\n     *\n     * @param rowData the input row data\n     * @return a 1 x rowData.length RealMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003erowData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003erowData\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 41)",
        "(line 334,col 9)-(line 334,col 56)",
        "(line 335,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 338,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRowFieldMatrix(T[])",
      "begin_line": 351,
      "end_line": 362,
      "comment": "\n     * Creates a row {@link FieldMatrix} using the data from the input\n     * array.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param rowData the input row data\n     * @return a 1 x rowData.length FieldMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003erowData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003erowData\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 41)",
        "(line 354,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 84)",
        "(line 358,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 361,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(double[])",
      "begin_line": 374,
      "end_line": 382,
      "comment": "\n     * Creates a row {@link BigMatrix} using the data from the input\n     * array.\n     *\n     * @param rowData the input row data\n     * @return a 1 x rowData.length BigMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003erowData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003erowData\u003c/code\u003eis null\n     * @deprecated since 2.0 replaced by {@link #createRowFieldMatrix(FieldElement[])}\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 41)",
        "(line 377,col 9)-(line 377,col 61)",
        "(line 378,col 9)-(line 380,col 9)",
        "(line 381,col 9)-(line 381,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(java.math.BigDecimal[])",
      "begin_line": 394,
      "end_line": 400,
      "comment": "\n     * Creates a row {@link BigMatrix} using the data from the input\n     * array.\n     *\n     * @param rowData the input row data\n     * @return a 1 x rowData.length BigMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003erowData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003erowData\u003c/code\u003eis null\n     * @deprecated since 2.0 replaced by {@link #createRowFieldMatrix(FieldElement[])}\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 41)",
        "(line 397,col 9)-(line 397,col 61)",
        "(line 398,col 9)-(line 398,col 56)",
        "(line 399,col 9)-(line 399,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(java.lang.String[])",
      "begin_line": 412,
      "end_line": 420,
      "comment": "\n     * Creates a row {@link BigMatrix} using the data from the input\n     * array.\n     *\n     * @param rowData the input row data\n     * @return a 1 x rowData.length BigMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003erowData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003erowData\u003c/code\u003eis null\n     * @deprecated since 2.0 replaced by {@link #createRowFieldMatrix(FieldElement[])}\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 41)",
        "(line 415,col 9)-(line 415,col 61)",
        "(line 416,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 419,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(double[])",
      "begin_line": 431,
      "end_line": 438,
      "comment": "\n     * Creates a column {@link RealMatrix} using the data from the input\n     * array.\n     *\n     * @param columnData  the input column data\n     * @return a columnData x 1 RealMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003ecolumnData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003ecolumnData\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 44)",
        "(line 433,col 9)-(line 433,col 56)",
        "(line 434,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 437,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createColumnFieldMatrix(T[])",
      "begin_line": 450,
      "end_line": 461,
      "comment": "\n     * Creates a column {@link FieldMatrix} using the data from the input\n     * array.\n     *\n     * @param \u003cT\u003e the type of the field elements\n     * @param columnData  the input column data\n     * @return a columnData x 1 FieldMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003ecolumnData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003ecolumnData\u003c/code\u003eis null\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 44)",
        "(line 453,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 456,col 87)",
        "(line 457,col 9)-(line 459,col 9)",
        "(line 460,col 9)-(line 460,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(double[])",
      "begin_line": 473,
      "end_line": 481,
      "comment": "\n     * Creates a column {@link BigMatrix} using the data from the input\n     * array.\n     *\n     * @param columnData  the input column data\n     * @return a columnData x 1 BigMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003ecolumnData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003ecolumnData\u003c/code\u003eis null\n     * @deprecated since 2.0 replaced by {@link #createColumnFieldMatrix(FieldElement[])}\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 44)",
        "(line 476,col 9)-(line 476,col 61)",
        "(line 477,col 9)-(line 479,col 9)",
        "(line 480,col 9)-(line 480,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(java.math.BigDecimal[])",
      "begin_line": 493,
      "end_line": 501,
      "comment": "\n     * Creates a column {@link BigMatrix} using the data from the input\n     * array.\n     *\n     * @param columnData  the input column data\n     * @return a columnData x 1 BigMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003ecolumnData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003ecolumnData\u003c/code\u003eis null\n     * @deprecated since 2.0 replaced by {@link #createColumnFieldMatrix(FieldElement[])}\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 44)",
        "(line 496,col 9)-(line 496,col 61)",
        "(line 497,col 9)-(line 499,col 9)",
        "(line 500,col 9)-(line 500,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(java.lang.String[])",
      "begin_line": 513,
      "end_line": 521,
      "comment": "\n     * Creates a column {@link BigMatrix} using the data from the input\n     * array.\n     *\n     * @param columnData  the input column data\n     * @return a columnData x 1 BigMatrix\n     * @throws IllegalArgumentException if \u003ccode\u003ecolumnData\u003c/code\u003e is empty\n     * @throws NullPointerException if \u003ccode\u003ecolumnData\u003c/code\u003eis null\n     * @deprecated since 2.0 replaced by {@link #createColumnFieldMatrix(FieldElement[])}\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 38)",
        "(line 516,col 9)-(line 516,col 61)",
        "(line 517,col 9)-(line 519,col 9)",
        "(line 520,col 9)-(line 520,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkRowIndex(org.apache.commons.math.linear.AnyMatrix, int)",
      "begin_line": 529,
      "end_line": 534,
      "comment": "\n     * Check if a row index is valid.\n     * @param m matrix containing the submatrix\n     * @param row row index to check\n     * @exception MatrixIndexException if index is not valid\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 533,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkColumnIndex(org.apache.commons.math.linear.AnyMatrix, int)",
      "begin_line": 542,
      "end_line": 548,
      "comment": "\n     * Check if a column index is valid.\n     * @param m matrix containing the submatrix\n     * @param column column index to check\n     * @exception MatrixIndexException if index is not valid\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 547,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math.linear.AnyMatrix, int, int, int, int)",
      "begin_line": 561,
      "end_line": 579,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param m matrix containing the submatrix\n     * @param startRow Initial row index\n     * @param endRow Final row index\n     * @param startColumn Initial column index\n     * @param endColumn Final column index\n     * @exception MatrixIndexException  if the indices are not valid\n     ",
      "child_ranges": [
        "(line 564,col 9)-(line 564,col 35)",
        "(line 565,col 9)-(line 565,col 33)",
        "(line 566,col 9)-(line 569,col 9)",
        "(line 571,col 9)-(line 571,col 41)",
        "(line 572,col 9)-(line 572,col 39)",
        "(line 573,col 9)-(line 576,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkSubMatrixIndex(org.apache.commons.math.linear.AnyMatrix, int[], int[])",
      "begin_line": 590,
      "end_line": 606,
      "comment": "\n     * Check if submatrix ranges indices are valid.\n     * Rows and columns are indicated counting from 0 to n-1.\n     *\n     * @param m matrix containing the submatrix\n     * @param selectedRows Array of row indices.\n     * @param selectedColumns Array of column indices.\n     * @exception MatrixIndexException if row or column selections are not valid\n     ",
      "child_ranges": [
        "(line 593,col 9)-(line 598,col 9)",
        "(line 600,col 9)-(line 602,col 9)",
        "(line 603,col 9)-(line 605,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkAdditionCompatible(org.apache.commons.math.linear.AnyMatrix, org.apache.commons.math.linear.AnyMatrix)",
      "begin_line": 614,
      "end_line": 623,
      "comment": "\n     * Check if matrices are addition compatible\n     * @param left left hand side matrix\n     * @param right right hand side matrix\n     * @exception IllegalArgumentException if matrices are not addition compatible\n     ",
      "child_ranges": [
        "(line 616,col 9)-(line 622,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkSubtractionCompatible(org.apache.commons.math.linear.AnyMatrix, org.apache.commons.math.linear.AnyMatrix)",
      "begin_line": 631,
      "end_line": 640,
      "comment": "\n     * Check if matrices are subtraction compatible\n     * @param left left hand side matrix\n     * @param right right hand side matrix\n     * @exception IllegalArgumentException if matrices are not subtraction compatible\n     ",
      "child_ranges": [
        "(line 633,col 9)-(line 639,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.checkMultiplicationCompatible(org.apache.commons.math.linear.AnyMatrix, org.apache.commons.math.linear.AnyMatrix)",
      "begin_line": 648,
      "end_line": 656,
      "comment": "\n     * Check if matrices are multiplication compatible\n     * @param left left hand side matrix\n     * @param right right hand side matrix\n     * @exception IllegalArgumentException if matrices are not multiplication compatible\n     ",
      "child_ranges": [
        "(line 650,col 9)-(line 655,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.fractionMatrixToRealMatrix(org.apache.commons.math.linear.FieldMatrix\u003corg.apache.commons.math.fraction.Fraction\u003e)",
      "begin_line": 663,
      "end_line": 667,
      "comment": "\n     * Convert a {@link FieldMatrix}/{@link Fraction} matrix to a {@link RealMatrix}.\n     * @param m matrix to convert\n     * @return converted matrix\n     ",
      "child_ranges": [
        "(line 664,col 9)-(line 664,col 80)",
        "(line 665,col 9)-(line 665,col 42)",
        "(line 666,col 9)-(line 666,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FractionMatrixConverter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DefaultFieldMatrixPreservingVisitor\u003corg.apache.commons.math.fraction.Fraction\u003e"
      ],
      "begin_line": 670,
      "end_line": 700,
      "comment": " Converter for {@link FieldMatrix}/{@link Fraction}. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 673,
      "end_line": 673,
      "comment": " Converted array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.MatrixUtils.FractionMatrixConverter.FractionMatrixConverter()",
      "begin_line": 676,
      "end_line": 678,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 677,col 13)-(line 677,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.FractionMatrixConverter.start(int, int, int, int, int, int)",
      "begin_line": 681,
      "end_line": 685,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 684,col 13)-(line 684,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.FractionMatrixConverter.visit(int, int, org.apache.commons.math.fraction.Fraction)",
      "begin_line": 688,
      "end_line": 691,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 690,col 13)-(line 690,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.FractionMatrixConverter.getConvertedMatrix()",
      "begin_line": 696,
      "end_line": 698,
      "comment": " Get the converted matrix.\n         * @return converted matrix\n         ",
      "child_ranges": [
        "(line 697,col 13)-(line 697,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.bigFractionMatrixToRealMatrix(org.apache.commons.math.linear.FieldMatrix\u003corg.apache.commons.math.fraction.BigFraction\u003e)",
      "begin_line": 707,
      "end_line": 711,
      "comment": "\n     * Convert a {@link FieldMatrix}/{@link BigFraction} matrix to a {@link RealMatrix}.\n     * @param m matrix to convert\n     * @return converted matrix\n     ",
      "child_ranges": [
        "(line 708,col 9)-(line 708,col 86)",
        "(line 709,col 9)-(line 709,col 42)",
        "(line 710,col 9)-(line 710,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BigFractionMatrixConverter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DefaultFieldMatrixPreservingVisitor\u003corg.apache.commons.math.fraction.BigFraction\u003e"
      ],
      "begin_line": 714,
      "end_line": 744,
      "comment": " Converter for {@link FieldMatrix}/{@link BigFraction}. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 717,
      "end_line": 717,
      "comment": " Converted array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.MatrixUtils.BigFractionMatrixConverter.BigFractionMatrixConverter()",
      "begin_line": 720,
      "end_line": 722,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 721,col 13)-(line 721,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.BigFractionMatrixConverter.start(int, int, int, int, int, int)",
      "begin_line": 725,
      "end_line": 729,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 728,col 13)-(line 728,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.BigFractionMatrixConverter.visit(int, int, org.apache.commons.math.fraction.BigFraction)",
      "begin_line": 732,
      "end_line": 735,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 734,col 13)-(line 734,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.BigFractionMatrixConverter.getConvertedMatrix()",
      "begin_line": 740,
      "end_line": 742,
      "comment": " Get the converted matrix.\n         * @return converted matrix\n         ",
      "child_ranges": [
        "(line 741,col 13)-(line 741,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.serializeRealVector(org.apache.commons.math.linear.RealVector, java.io.ObjectOutputStream)",
      "begin_line": 786,
      "end_line": 794,
      "comment": " Serialize a {@link RealVector}.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ewriteObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eoos.defaultWriteObject()\u003c/code\u003e) in a class that has a\n     * {@link RealVector} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not serialize the vector (the {@link\n     * RealVector} interface is not serializable by default) but this method does\n     * serialize it specifically.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The following example shows how a simple class with a name and a real vector\n     * should be written:\n     * \u003cpre\u003e\u003ccode\u003e\n     * public class NamedVector implements Serializable {\n     *\n     *     private final String name;\n     *     private final transient RealVector coefficients;\n     *\n     *     // omitted constructors, getters ...\n     *\n     *     private void writeObject(ObjectOutputStream oos) throws IOException {\n     *         oos.defaultWriteObject();  // takes care of name field\n     *         MatrixUtils.serializeRealVector(coefficients, oos);\n     *     }\n     *\n     *     private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {\n     *         ois.defaultReadObject();  // takes care of name field\n     *         MatrixUtils.deserializeRealVector(this, \"coefficients\", ois);\n     *     }\n     *\n     * }\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param vector real vector to serialize\n     * @param oos stream where the real vector should be written\n     * @exception IOException if object cannot be written to stream\n     * @see #deserializeRealVector(Object, String, ObjectInputStream)\n     ",
      "child_ranges": [
        "(line 789,col 9)-(line 789,col 44)",
        "(line 790,col 9)-(line 790,col 24)",
        "(line 791,col 9)-(line 793,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.deserializeRealVector(java.lang.Object, java.lang.String, java.io.ObjectInputStream)",
      "begin_line": 813,
      "end_line": 845,
      "comment": " Deserialize  a {@link RealVector} field in a class.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ereadObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eois.defaultReadObject()\u003c/code\u003e) in a class that has a\n     * {@link RealVector} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not deserialize the vector (the {@link\n     * RealVector} interface is not serializable by default) but this method does\n     * deserialize it specifically.\n     * \u003c/p\u003e\n     * @param instance instance in which the field must be set up\n     * @param fieldName name of the field within the class (may be private and final)\n     * @param ois stream from which the real vector should be read\n     * @exception ClassNotFoundException if a class in the stream cannot be found\n     * @exception IOException if object cannot be read from the stream\n     * @see #serializeRealVector(RealVector, ObjectOutputStream)\n     ",
      "child_ranges": [
        "(line 817,col 9)-(line 843,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.serializeRealMatrix(org.apache.commons.math.linear.RealMatrix, java.io.ObjectOutputStream)",
      "begin_line": 887,
      "end_line": 899,
      "comment": " Serialize a {@link RealMatrix}.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ewriteObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eoos.defaultWriteObject()\u003c/code\u003e) in a class that has a\n     * {@link RealMatrix} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not serialize the matrix (the {@link\n     * RealMatrix} interface is not serializable by default) but this method does\n     * serialize it specifically.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The following example shows how a simple class with a name and a real matrix\n     * should be written:\n     * \u003cpre\u003e\u003ccode\u003e\n     * public class NamedMatrix implements Serializable {\n     *\n     *     private final String name;\n     *     private final transient RealMatrix coefficients;\n     *\n     *     // omitted constructors, getters ...\n     *\n     *     private void writeObject(ObjectOutputStream oos) throws IOException {\n     *         oos.defaultWriteObject();  // takes care of name field\n     *         MatrixUtils.serializeRealMatrix(coefficients, oos);\n     *     }\n     *\n     *     private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {\n     *         ois.defaultReadObject();  // takes care of name field\n     *         MatrixUtils.deserializeRealMatrix(this, \"coefficients\", ois);\n     *     }\n     *\n     * }\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param matrix real matrix to serialize\n     * @param oos stream where the real matrix should be written\n     * @exception IOException if object cannot be written to stream\n     * @see #deserializeRealMatrix(Object, String, ObjectInputStream)\n     ",
      "child_ranges": [
        "(line 890,col 9)-(line 890,col 47)",
        "(line 891,col 9)-(line 891,col 50)",
        "(line 892,col 9)-(line 892,col 24)",
        "(line 893,col 9)-(line 893,col 24)",
        "(line 894,col 9)-(line 898,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.MatrixUtils.deserializeRealMatrix(java.lang.Object, java.lang.String, java.io.ObjectInputStream)",
      "begin_line": 918,
      "end_line": 954,
      "comment": " Deserialize  a {@link RealMatrix} field in a class.\n     * \u003cp\u003e\n     * This method is intended to be called from within a private\n     * \u003ccode\u003ereadObject\u003c/code\u003e method (after a call to\n     * \u003ccode\u003eois.defaultReadObject()\u003c/code\u003e) in a class that has a\n     * {@link RealMatrix} field, which should be declared \u003ccode\u003etransient\u003c/code\u003e.\n     * This way, the default handling does not deserialize the matrix (the {@link\n     * RealMatrix} interface is not serializable by default) but this method does\n     * deserialize it specifically.\n     * \u003c/p\u003e\n     * @param instance instance in which the field must be set up\n     * @param fieldName name of the field within the class (may be private and final)\n     * @param ois stream from which the real matrix should be read\n     * @exception ClassNotFoundException if a class in the stream cannot be found\n     * @exception IOException if object cannot be read from the stream\n     * @see #serializeRealMatrix(RealMatrix, ObjectOutputStream)\n     ",
      "child_ranges": [
        "(line 922,col 9)-(line 952,col 9)"
      ]
    }
  ]
}