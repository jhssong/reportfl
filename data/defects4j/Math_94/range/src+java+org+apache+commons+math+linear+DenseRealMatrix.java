{
  "filepath": "/tmp/Math-94b/src/java/org/apache/commons/math/linear/DenseRealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DenseRealMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.AbstractRealMatrix",
        "java.io.Serializable"
      ],
      "begin_line": 64,
      "end_line": 1621,
      "comment": "\n * Cache-friendly implementation of RealMatrix using a flat arrays to store\n * square blocks of the matrix.\n * \u003cp\u003e\n * This implementation is specially designed to be cache-friendly. Square blocks are\n * stored as small arrays and allow efficient traversal of data both in row major direction\n * and columns major direction, one block at a time. This greatly increases performances\n * for algorithms that use crossed directions loops like multiplication or transposition.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The size of square blocks is a static parameter. It may be tuned according to the cache\n * size of the target computer processor. As a rule of thumbs, it should be the largest\n * value that allows three blocks to be simultaneously cached (this is necessary for example\n * for matrix multiplication). The default value is to use 52x52 blocks which is well suited\n * for processors with 64k L1 cache (one block holds 2704 values or 21632 bytes). This value\n * could be lowered to 36x36 for processors with 32k L1 cache.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The regular blocks represent {@link #BLOCK_SIZE} x {@link #BLOCK_SIZE} squares. Blocks\n * at right hand side and bottom side which may be smaller to fit matrix dimensions. The square\n * blocks are flattened in row major order in single dimension arrays which are therefore\n * {@link #BLOCK_SIZE}\u003csup\u003e2\u003c/sup\u003e elements long for regular blocks. The blocks are themselves\n * organized in row major order.\n * \u003c/p\u003e\n * \u003cp\u003e\n * As an example, for a block size of 52x52, a 100x60 matrix would be stored in 4 blocks.\n * Block 0 would be a double[2704] array holding the upper left 52x52 square, block 1 would be\n * a double[416] array holding the upper right 52x8 rectangle, block 2 would be a double[2496]\n * array holding the lower left 48x52 rectangle and block 3 would be a double[384] array\n * holding the lower right 48x8 rectangle.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The layout complexity overhead versus simple mapping of matrices to java\n * arrays is negligible for small matrices (about 1%). The gain from cache efficiency leads\n * to up to 3-fold improvements for matrices of moderate to large size.\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "BLOCK_SIZE"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Block size. "
    },
    {
      "type": "field",
      "varNames": [
        "blocks"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Blocks of matrix entries. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Number of rows of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "columns"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Number of columns of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "blockRows"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Number of block rows of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "blockColumns"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Number of block columns of the matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.DenseRealMatrix(int, int)",
      "begin_line": 95,
      "end_line": 109,
      "comment": "\n     * Create a new matrix with the supplied row and column dimensions.\n     *\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @throws IllegalArgumentException if row or column dimension is not\n     *  positive\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 29)",
        "(line 99,col 9)-(line 99,col 28)",
        "(line 100,col 9)-(line 100,col 31)",
        "(line 103,col 9)-(line 103,col 63)",
        "(line 104,col 9)-(line 104,col 63)",
        "(line 107,col 9)-(line 107,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.DenseRealMatrix(double[][])",
      "begin_line": 124,
      "end_line": 127,
      "comment": "\n     * Create a new dense matrix copying entries from raw layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in raw layout.\u003c/p\u003e\n     * \u003cp\u003eCalling this constructor is equivalent to call:\n     * \u003cpre\u003ematrix \u003d new DenseRealMatrix(rawData.length, rawData[0].length,\n     *                                   toBlocksLayout(rawData), false);\u003c/pre\u003e\n     * \u003c/p\u003e\n     * @param rawData data for new matrix, in raw layout\n     *\n     * @exception IllegalArgumentException if \u003ccode\u003eblockData\u003c/code\u003e shape is\n     * inconsistent with block layout\n     * @see #DenseRealMatrix(int, int, double[][], boolean)\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 80)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.DenseRealMatrix(int, int, double[][], boolean)",
      "begin_line": 144,
      "end_line": 181,
      "comment": "\n     * Create a new dense matrix copying entries from block layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in blocks layout.\u003c/p\u003e\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @param blockData data for new matrix\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     *\n     * @exception IllegalArgumentException if \u003ccode\u003eblockData\u003c/code\u003e shape is\n     * inconsistent with block layout\n     * @see #createBlocksLayout(int, int)\n     * @see #toBlocksLayout(double[][])\n     * @see #DenseRealMatrix(double[][])\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 29)",
        "(line 149,col 9)-(line 149,col 28)",
        "(line 150,col 9)-(line 150,col 31)",
        "(line 153,col 9)-(line 153,col 63)",
        "(line 154,col 9)-(line 154,col 63)",
        "(line 156,col 9)-(line 162,col 9)",
        "(line 164,col 9)-(line 164,col 22)",
        "(line 165,col 9)-(line 179,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.toBlocksLayout(double[][])",
      "begin_line": 205,
      "end_line": 248,
      "comment": "\n     * Convert a data array from raw layout to blocks layout.\n     * \u003cp\u003e\n     * Raw layout is the straightforward layout where element at row i and\n     * column j is in array element \u003ccode\u003erawData[i][j]\u003c/code\u003e. Blocks layout\n     * is the layout used in {@link DenseRealMatrix} instances, where the matrix\n     * is split in square blocks (except at right and bottom side where blocks may\n     * be rectangular to fit matrix size) and each block is stored in a flattened\n     * one-dimensional array.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method creates an array in blocks layout from an input array in raw layout.\n     * It can be used to provide the array argument of the {@link\n     * DenseRealMatrix#DenseRealMatrix(int, int, double[][], boolean)} constructor.\n     * \u003c/p\u003e\n     * @param rawData data array in raw layout\n     * @return a new data array containing the same entries but in blocks layout\n     * @exception IllegalArgumentException if \u003ccode\u003erawData\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length)\n     * @see #createBlocksLayout(int, int)\n     * @see #DenseRealMatrix(int, int, double[][], boolean)\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 48)",
        "(line 209,col 9)-(line 209,col 51)",
        "(line 210,col 9)-(line 210,col 73)",
        "(line 211,col 9)-(line 211,col 73)",
        "(line 214,col 9)-(line 221,col 9)",
        "(line 224,col 9)-(line 224,col 73)",
        "(line 225,col 9)-(line 244,col 9)",
        "(line 246,col 9)-(line 246,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.createBlocksLayout(int, int)",
      "begin_line": 262,
      "end_line": 282,
      "comment": "\n     * Create a data array in blocks layout.\n     * \u003cp\u003e\n     * This method can be used to create the array argument of the {@link\n     * DenseRealMatrix#DenseRealMatrix(int, int, double[][], boolean)} constructor.\n     * \u003c/p\u003e\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @return a new data array in blocks layout\n     * @see #toBlocksLayout(double[][])\n     * @see #DenseRealMatrix(int, int, double[][], boolean)\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 73)",
        "(line 265,col 9)-(line 265,col 73)",
        "(line 267,col 9)-(line 267,col 73)",
        "(line 268,col 9)-(line 278,col 9)",
        "(line 280,col 9)-(line 280,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.createMatrix(int, int)",
      "begin_line": 285,
      "end_line": 288,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.copy()",
      "begin_line": 291,
      "end_line": 303,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 68)",
        "(line 297,col 9)-(line 299,col 9)",
        "(line 301,col 9)-(line 301,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.add(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 306,
      "end_line": 344,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 308,col 9)-(line 343,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.add(org.apache.commons.math.linear.DenseRealMatrix)",
      "begin_line": 353,
      "end_line": 373,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 35)",
        "(line 359,col 9)-(line 359,col 71)",
        "(line 362,col 9)-(line 369,col 9)",
        "(line 371,col 9)-(line 371,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 376,
      "end_line": 414,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 378,col 9)-(line 413,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.subtract(org.apache.commons.math.linear.DenseRealMatrix)",
      "begin_line": 423,
      "end_line": 443,
      "comment": "\n     * Compute this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this - m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 38)",
        "(line 429,col 9)-(line 429,col 71)",
        "(line 432,col 9)-(line 439,col 9)",
        "(line 441,col 9)-(line 441,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.scalarAdd(double)",
      "begin_line": 446,
      "end_line": 462,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 71)",
        "(line 452,col 9)-(line 458,col 9)",
        "(line 460,col 9)-(line 460,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.scalarMultiply(double)",
      "begin_line": 465,
      "end_line": 481,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 71)",
        "(line 471,col 9)-(line 477,col 9)",
        "(line 479,col 9)-(line 479,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 484,
      "end_line": 537,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 486,col 9)-(line 536,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.multiply(org.apache.commons.math.linear.DenseRealMatrix)",
      "begin_line": 547,
      "end_line": 607,
      "comment": "\n     * Returns the result of postmultiplying this by m.\n     *\n     * @param m    matrix to postmultiply by\n     * @return     this * m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 550,col 9)-(line 550,col 41)",
        "(line 552,col 9)-(line 552,col 73)",
        "(line 555,col 9)-(line 555,col 27)",
        "(line 556,col 9)-(line 603,col 9)",
        "(line 605,col 9)-(line 605,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.getData()",
      "begin_line": 610,
      "end_line": 636,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 84)",
        "(line 613,col 9)-(line 613,col 74)",
        "(line 615,col 9)-(line 632,col 9)",
        "(line 634,col 9)-(line 634,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.getNorm()",
      "begin_line": 639,
      "end_line": 661,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 640,col 9)-(line 640,col 56)",
        "(line 641,col 9)-(line 641,col 29)",
        "(line 642,col 9)-(line 659,col 9)",
        "(line 660,col 9)-(line 660,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.getFrobeniusNorm()",
      "begin_line": 664,
      "end_line": 672,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 24)",
        "(line 666,col 9)-(line 670,col 9)",
        "(line 671,col 9)-(line 671,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 675,
      "end_line": 765,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 680,col 9)-(line 680,col 70)",
        "(line 683,col 9)-(line 684,col 84)",
        "(line 687,col 9)-(line 687,col 62)",
        "(line 688,col 9)-(line 688,col 62)",
        "(line 689,col 9)-(line 689,col 62)",
        "(line 690,col 9)-(line 690,col 62)",
        "(line 693,col 9)-(line 761,col 9)",
        "(line 763,col 9)-(line 763,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.copyBlockPart(double[], int, int, int, int, int, double[], int, int, int)",
      "begin_line": 782,
      "end_line": 795,
      "comment": "\n     * Copy a part of a block into another one\n     * \u003cp\u003eThis method can be called only when the specified part fits in both\n     * blocks, no verification is done here.\u003c/p\u003e\n     * @param srcBlock source block\n     * @param srcWidth source block width ({@link #BLOCK_SIZE} or smaller)\n     * @param srcStartRow start row in the source block\n     * @param srcEndRow end row (exclusive) in the source block\n     * @param srcStartColumn start column in the source block\n     * @param srcEndColumn end column (exclusive) in the source block\n     * @param dstBlock destination block\n     * @param dstWidth destination block width ({@link #BLOCK_SIZE} or smaller)\n     * @param dstStartRow start row in the destination block\n     * @param dstStartColumn start column in the destination block\n     ",
      "child_ranges": [
        "(line 787,col 9)-(line 787,col 57)",
        "(line 788,col 9)-(line 788,col 61)",
        "(line 789,col 9)-(line 789,col 61)",
        "(line 790,col 9)-(line 794,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 798,
      "end_line": 849,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 802,col 9)-(line 802,col 50)",
        "(line 803,col 9)-(line 806,col 9)",
        "(line 807,col 9)-(line 807,col 57)",
        "(line 808,col 9)-(line 808,col 53)",
        "(line 809,col 9)-(line 809,col 60)",
        "(line 810,col 9)-(line 817,col 9)",
        "(line 820,col 9)-(line 820,col 54)",
        "(line 821,col 9)-(line 821,col 72)",
        "(line 822,col 9)-(line 822,col 57)",
        "(line 823,col 9)-(line 823,col 75)",
        "(line 826,col 9)-(line 848,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.getRowMatrix(int)",
      "begin_line": 852,
      "end_line": 881,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 855,col 9)-(line 855,col 27)",
        "(line 856,col 9)-(line 856,col 68)",
        "(line 859,col 9)-(line 859,col 45)",
        "(line 860,col 9)-(line 860,col 54)",
        "(line 861,col 9)-(line 861,col 30)",
        "(line 862,col 9)-(line 862,col 30)",
        "(line 863,col 9)-(line 863,col 54)",
        "(line 864,col 9)-(line 877,col 9)",
        "(line 879,col 9)-(line 879,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.setRowMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 884,
      "end_line": 891,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 886,col 9)-(line 890,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.setRowMatrix(int, org.apache.commons.math.linear.DenseRealMatrix)",
      "begin_line": 904,
      "end_line": 940,
      "comment": "\n     * Sets the entries in row number \u003ccode\u003erow\u003c/code\u003e\n     * as a row matrix.  Row indices start at 0.\n     *\n     * @param row the row to be set\n     * @param matrix row matrix (must have one row and the same number of columns\n     * as the instance)\n     * @throws MatrixIndexException if the specified row index is invalid\n     * @throws InvalidMatrixException if the matrix dimensions do not match one\n     * instance row\n     ",
      "child_ranges": [
        "(line 907,col 9)-(line 907,col 27)",
        "(line 908,col 9)-(line 908,col 47)",
        "(line 909,col 9)-(line 917,col 9)",
        "(line 920,col 9)-(line 920,col 44)",
        "(line 921,col 9)-(line 921,col 53)",
        "(line 922,col 9)-(line 922,col 29)",
        "(line 923,col 9)-(line 923,col 29)",
        "(line 924,col 9)-(line 924,col 54)",
        "(line 925,col 9)-(line 938,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.getColumnMatrix(int)",
      "begin_line": 943,
      "end_line": 970,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 946,col 9)-(line 946,col 33)",
        "(line 947,col 9)-(line 947,col 65)",
        "(line 950,col 9)-(line 950,col 48)",
        "(line 951,col 9)-(line 951,col 57)",
        "(line 952,col 9)-(line 952,col 47)",
        "(line 953,col 9)-(line 953,col 30)",
        "(line 954,col 9)-(line 954,col 30)",
        "(line 955,col 9)-(line 955,col 54)",
        "(line 956,col 9)-(line 966,col 9)",
        "(line 968,col 9)-(line 968,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 973,
      "end_line": 980,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 975,col 9)-(line 979,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.DenseRealMatrix)",
      "begin_line": 993,
      "end_line": 1027,
      "comment": "\n     * Sets the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n     * as a column matrix.  Column indices start at 0.\n     *\n     * @param column the column to be set\n     * @param matrix column matrix (must have one column and the same number of rows\n     * as the instance)\n     * @throws MatrixIndexException if the specified column index is invalid\n     * @throws InvalidMatrixException if the matrix dimensions do not match one\n     * instance column\n     ",
      "child_ranges": [
        "(line 996,col 9)-(line 996,col 33)",
        "(line 997,col 9)-(line 997,col 44)",
        "(line 998,col 9)-(line 1006,col 9)",
        "(line 1009,col 9)-(line 1009,col 48)",
        "(line 1010,col 9)-(line 1010,col 57)",
        "(line 1011,col 9)-(line 1011,col 47)",
        "(line 1012,col 9)-(line 1012,col 28)",
        "(line 1013,col 9)-(line 1013,col 28)",
        "(line 1014,col 9)-(line 1014,col 53)",
        "(line 1015,col 9)-(line 1025,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.getRowVector(int)",
      "begin_line": 1030,
      "end_line": 1049,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1033,col 9)-(line 1033,col 27)",
        "(line 1034,col 9)-(line 1034,col 53)",
        "(line 1037,col 9)-(line 1037,col 45)",
        "(line 1038,col 9)-(line 1038,col 54)",
        "(line 1039,col 9)-(line 1039,col 30)",
        "(line 1040,col 9)-(line 1045,col 9)",
        "(line 1047,col 9)-(line 1047,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.setRowVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1052,
      "end_line": 1059,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1054,col 9)-(line 1058,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.getColumnVector(int)",
      "begin_line": 1062,
      "end_line": 1083,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1065,col 9)-(line 1065,col 33)",
        "(line 1066,col 9)-(line 1066,col 50)",
        "(line 1069,col 9)-(line 1069,col 48)",
        "(line 1070,col 9)-(line 1070,col 57)",
        "(line 1071,col 9)-(line 1071,col 47)",
        "(line 1072,col 9)-(line 1072,col 30)",
        "(line 1073,col 9)-(line 1079,col 9)",
        "(line 1081,col 9)-(line 1081,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.setColumnVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1086,
      "end_line": 1093,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1088,col 9)-(line 1092,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.getRow(int)",
      "begin_line": 1096,
      "end_line": 1115,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1099,col 9)-(line 1099,col 27)",
        "(line 1100,col 9)-(line 1100,col 49)",
        "(line 1103,col 9)-(line 1103,col 45)",
        "(line 1104,col 9)-(line 1104,col 54)",
        "(line 1105,col 9)-(line 1105,col 30)",
        "(line 1106,col 9)-(line 1111,col 9)",
        "(line 1113,col 9)-(line 1113,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.setRow(int, double[])",
      "begin_line": 1118,
      "end_line": 1142,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1121,col 9)-(line 1121,col 27)",
        "(line 1122,col 9)-(line 1122,col 47)",
        "(line 1123,col 9)-(line 1129,col 9)",
        "(line 1132,col 9)-(line 1132,col 45)",
        "(line 1133,col 9)-(line 1133,col 54)",
        "(line 1134,col 9)-(line 1134,col 30)",
        "(line 1135,col 9)-(line 1140,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.getColumn(int)",
      "begin_line": 1145,
      "end_line": 1166,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1148,col 9)-(line 1148,col 33)",
        "(line 1149,col 9)-(line 1149,col 46)",
        "(line 1152,col 9)-(line 1152,col 48)",
        "(line 1153,col 9)-(line 1153,col 57)",
        "(line 1154,col 9)-(line 1154,col 47)",
        "(line 1155,col 9)-(line 1155,col 30)",
        "(line 1156,col 9)-(line 1162,col 9)",
        "(line 1164,col 9)-(line 1164,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.setColumn(int, double[])",
      "begin_line": 1169,
      "end_line": 1195,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1172,col 9)-(line 1172,col 33)",
        "(line 1173,col 9)-(line 1173,col 44)",
        "(line 1174,col 9)-(line 1180,col 9)",
        "(line 1183,col 9)-(line 1183,col 48)",
        "(line 1184,col 9)-(line 1184,col 57)",
        "(line 1185,col 9)-(line 1185,col 47)",
        "(line 1186,col 9)-(line 1186,col 30)",
        "(line 1187,col 9)-(line 1193,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.getEntry(int, int)",
      "begin_line": 1198,
      "end_line": 1213,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1200,col 9)-(line 1212,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.setEntry(int, int, double)",
      "begin_line": 1216,
      "end_line": 1231,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1218,col 9)-(line 1230,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.addToEntry(int, int, double)",
      "begin_line": 1234,
      "end_line": 1249,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1236,col 9)-(line 1248,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 1252,
      "end_line": 1267,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1254,col 9)-(line 1266,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.transpose()",
      "begin_line": 1270,
      "end_line": 1303,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1272,col 9)-(line 1272,col 44)",
        "(line 1273,col 9)-(line 1273,col 47)",
        "(line 1274,col 9)-(line 1274,col 70)",
        "(line 1277,col 9)-(line 1277,col 27)",
        "(line 1278,col 9)-(line 1299,col 9)",
        "(line 1301,col 9)-(line 1301,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.getRowDimension()",
      "begin_line": 1306,
      "end_line": 1308,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1307,col 9)-(line 1307,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.getColumnDimension()",
      "begin_line": 1311,
      "end_line": 1313,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1312,col 9)-(line 1312,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.operate(double[])",
      "begin_line": 1316,
      "end_line": 1357,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1319,col 9)-(line 1325,col 9)",
        "(line 1326,col 9)-(line 1326,col 46)",
        "(line 1329,col 9)-(line 1353,col 9)",
        "(line 1355,col 9)-(line 1355,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.preMultiply(double[])",
      "begin_line": 1360,
      "end_line": 1407,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1363,col 9)-(line 1369,col 9)",
        "(line 1370,col 9)-(line 1370,col 49)",
        "(line 1373,col 9)-(line 1403,col 9)",
        "(line 1405,col 9)-(line 1405,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 1410,
      "end_line": 1429,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1412,col 9)-(line 1412,col 66)",
        "(line 1413,col 9)-(line 1427,col 9)",
        "(line 1428,col 9)-(line 1428,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 1432,
      "end_line": 1451,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1434,col 9)-(line 1434,col 66)",
        "(line 1435,col 9)-(line 1449,col 9)",
        "(line 1450,col 9)-(line 1450,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 1454,
      "end_line": 1478,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1458,col 9)-(line 1458,col 70)",
        "(line 1459,col 9)-(line 1459,col 79)",
        "(line 1460,col 9)-(line 1476,col 9)",
        "(line 1477,col 9)-(line 1477,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 1481,
      "end_line": 1505,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1485,col 9)-(line 1485,col 70)",
        "(line 1486,col 9)-(line 1486,col 79)",
        "(line 1487,col 9)-(line 1503,col 9)",
        "(line 1504,col 9)-(line 1504,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 1508,
      "end_line": 1526,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1510,col 9)-(line 1510,col 66)",
        "(line 1511,col 9)-(line 1524,col 9)",
        "(line 1525,col 9)-(line 1525,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 1529,
      "end_line": 1547,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1531,col 9)-(line 1531,col 66)",
        "(line 1532,col 9)-(line 1545,col 9)",
        "(line 1546,col 9)-(line 1546,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 1550,
      "end_line": 1574,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1554,col 9)-(line 1554,col 70)",
        "(line 1555,col 9)-(line 1555,col 79)",
        "(line 1556,col 9)-(line 1572,col 9)",
        "(line 1573,col 9)-(line 1573,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 1577,
      "end_line": 1601,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1581,col 9)-(line 1581,col 70)",
        "(line 1582,col 9)-(line 1582,col 79)",
        "(line 1583,col 9)-(line 1599,col 9)",
        "(line 1600,col 9)-(line 1600,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.blockHeight(int)",
      "begin_line": 1608,
      "end_line": 1610,
      "comment": "\n     * Get the height of a block.\n     * @param blockRow row index (in block sense) of the block\n     * @return height (number of rows) of the block\n     ",
      "child_ranges": [
        "(line 1609,col 9)-(line 1609,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.blockWidth(int)",
      "begin_line": 1617,
      "end_line": 1619,
      "comment": "\n     * Get the width of a block.\n     * @param blockColumn column index (in block sense) of the block\n     * @return width (number of columns) of the block\n     ",
      "child_ranges": [
        "(line 1618,col 9)-(line 1618,col 99)"
      ]
    }
  ]
}