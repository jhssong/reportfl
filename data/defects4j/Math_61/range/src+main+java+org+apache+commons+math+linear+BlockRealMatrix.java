{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/linear/BlockRealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BlockRealMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.AbstractRealMatrix",
        "java.io.Serializable"
      ],
      "begin_line": 68,
      "end_line": 1636,
      "comment": "\n * Cache-friendly implementation of RealMatrix using a flat arrays to store\n * square blocks of the matrix.\n * \u003cp\u003e\n * This implementation is specially designed to be cache-friendly. Square blocks are\n * stored as small arrays and allow efficient traversal of data both in row major direction\n * and columns major direction, one block at a time. This greatly increases performances\n * for algorithms that use crossed directions loops like multiplication or transposition.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The size of square blocks is a static parameter. It may be tuned according to the cache\n * size of the target computer processor. As a rule of thumbs, it should be the largest\n * value that allows three blocks to be simultaneously cached (this is necessary for example\n * for matrix multiplication). The default value is to use 52x52 blocks which is well suited\n * for processors with 64k L1 cache (one block holds 2704 values or 21632 bytes). This value\n * could be lowered to 36x36 for processors with 32k L1 cache.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The regular blocks represent {@link #BLOCK_SIZE} x {@link #BLOCK_SIZE} squares. Blocks\n * at right hand side and bottom side which may be smaller to fit matrix dimensions. The square\n * blocks are flattened in row major order in single dimension arrays which are therefore\n * {@link #BLOCK_SIZE}\u003csup\u003e2\u003c/sup\u003e elements long for regular blocks. The blocks are themselves\n * organized in row major order.\n * \u003c/p\u003e\n * \u003cp\u003e\n * As an example, for a block size of 52x52, a 100x60 matrix would be stored in 4 blocks.\n * Block 0 would be a double[2704] array holding the upper left 52x52 square, block 1 would be\n * a double[416] array holding the upper right 52x8 rectangle, block 2 would be a double[2496]\n * array holding the lower left 48x52 rectangle and block 3 would be a double[384] array\n * holding the lower right 48x8 rectangle.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The layout complexity overhead versus simple mapping of matrices to java\n * arrays is negligible for small matrices (about 1%). The gain from cache efficiency leads\n * to up to 3-fold improvements for matrices of moderate to large size.\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "BLOCK_SIZE"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Block size. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "blocks"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Blocks of matrix entries. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Number of rows of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "columns"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Number of columns of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "blockRows"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Number of block rows of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "blockColumns"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " Number of block columns of the matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.BlockRealMatrix(int, int)",
      "begin_line": 99,
      "end_line": 113,
      "comment": "\n     * Create a new matrix with the supplied row and column dimensions.\n     *\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @throws IllegalArgumentException if row or column dimension is not\n     *  positive\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 29)",
        "(line 103,col 9)-(line 103,col 28)",
        "(line 104,col 9)-(line 104,col 31)",
        "(line 107,col 9)-(line 107,col 63)",
        "(line 108,col 9)-(line 108,col 63)",
        "(line 111,col 9)-(line 111,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.BlockRealMatrix(double[][])",
      "begin_line": 128,
      "end_line": 131,
      "comment": "\n     * Create a new dense matrix copying entries from raw layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in raw layout.\u003c/p\u003e\n     * \u003cp\u003eCalling this constructor is equivalent to call:\n     * \u003cpre\u003ematrix \u003d new BlockRealMatrix(rawData.length, rawData[0].length,\n     *                                   toBlocksLayout(rawData), false);\u003c/pre\u003e\n     * \u003c/p\u003e\n     * @param rawData data for new matrix, in raw layout\n     *\n     * @exception IllegalArgumentException if \u003ccode\u003eblockData\u003c/code\u003e shape is\n     * inconsistent with block layout\n     * @see #BlockRealMatrix(int, int, double[][], boolean)\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 80)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.BlockRealMatrix(int, int, double[][], boolean)",
      "begin_line": 148,
      "end_line": 181,
      "comment": "\n     * Create a new dense matrix copying entries from block layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in blocks layout.\u003c/p\u003e\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @param blockData data for new matrix\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     *\n     * @exception IllegalArgumentException if \u003ccode\u003eblockData\u003c/code\u003e shape is\n     * inconsistent with block layout\n     * @see #createBlocksLayout(int, int)\n     * @see #toBlocksLayout(double[][])\n     * @see #BlockRealMatrix(double[][])\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 29)",
        "(line 153,col 9)-(line 153,col 28)",
        "(line 154,col 9)-(line 154,col 31)",
        "(line 157,col 9)-(line 157,col 63)",
        "(line 158,col 9)-(line 158,col 63)",
        "(line 160,col 9)-(line 166,col 9)",
        "(line 168,col 9)-(line 168,col 22)",
        "(line 169,col 9)-(line 180,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.toBlocksLayout(double[][])",
      "begin_line": 205,
      "end_line": 250,
      "comment": "\n     * Convert a data array from raw layout to blocks layout.\n     * \u003cp\u003e\n     * Raw layout is the straightforward layout where element at row i and\n     * column j is in array element \u003ccode\u003erawData[i][j]\u003c/code\u003e. Blocks layout\n     * is the layout used in {@link BlockRealMatrix} instances, where the matrix\n     * is split in square blocks (except at right and bottom side where blocks may\n     * be rectangular to fit matrix size) and each block is stored in a flattened\n     * one-dimensional array.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method creates an array in blocks layout from an input array in raw layout.\n     * It can be used to provide the array argument of the {@link\n     * #BlockRealMatrix(int, int, double[][], boolean)} constructor.\n     * \u003c/p\u003e\n     * @param rawData data array in raw layout\n     * @return a new data array containing the same entries but in blocks layout\n     * @exception IllegalArgumentException if \u003ccode\u003erawData\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length)\n     * @see #createBlocksLayout(int, int)\n     * @see #BlockRealMatrix(int, int, double[][], boolean)\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 48)",
        "(line 209,col 9)-(line 209,col 51)",
        "(line 210,col 9)-(line 210,col 73)",
        "(line 211,col 9)-(line 211,col 73)",
        "(line 214,col 9)-(line 219,col 9)",
        "(line 222,col 9)-(line 222,col 73)",
        "(line 223,col 9)-(line 223,col 27)",
        "(line 224,col 9)-(line 247,col 9)",
        "(line 249,col 9)-(line 249,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.createBlocksLayout(int, int)",
      "begin_line": 264,
      "end_line": 285,
      "comment": "\n     * Create a data array in blocks layout.\n     * \u003cp\u003e\n     * This method can be used to create the array argument of the {@link\n     * #BlockRealMatrix(int, int, double[][], boolean)} constructor.\n     * \u003c/p\u003e\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @return a new data array in blocks layout\n     * @see #toBlocksLayout(double[][])\n     * @see #BlockRealMatrix(int, int, double[][], boolean)\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 73)",
        "(line 267,col 9)-(line 267,col 73)",
        "(line 269,col 9)-(line 269,col 73)",
        "(line 270,col 9)-(line 270,col 27)",
        "(line 271,col 9)-(line 282,col 9)",
        "(line 284,col 9)-(line 284,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.createMatrix(int, int)",
      "begin_line": 288,
      "end_line": 292,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.copy()",
      "begin_line": 295,
      "end_line": 307,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 68)",
        "(line 302,col 9)-(line 304,col 9)",
        "(line 306,col 9)-(line 306,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.add(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 310,
      "end_line": 350,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 313,col 9)-(line 349,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.add(org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 359,
      "end_line": 378,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 53)",
        "(line 365,col 9)-(line 365,col 71)",
        "(line 368,col 9)-(line 375,col 9)",
        "(line 377,col 9)-(line 377,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 381,
      "end_line": 421,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 384,col 9)-(line 420,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.subtract(org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 430,
      "end_line": 449,
      "comment": "\n     * Compute this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this - m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 56)",
        "(line 436,col 9)-(line 436,col 71)",
        "(line 439,col 9)-(line 446,col 9)",
        "(line 448,col 9)-(line 448,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.scalarAdd(double)",
      "begin_line": 452,
      "end_line": 468,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 71)",
        "(line 459,col 9)-(line 465,col 9)",
        "(line 467,col 9)-(line 467,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.scalarMultiply(double)",
      "begin_line": 471,
      "end_line": 487,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 71)",
        "(line 478,col 9)-(line 484,col 9)",
        "(line 486,col 9)-(line 486,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 490,
      "end_line": 547,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 493,col 9)-(line 546,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.multiply(org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 557,
      "end_line": 618,
      "comment": "\n     * Returns the result of postmultiplying this by m.\n     *\n     * @param m    matrix to postmultiply by\n     * @return     this * m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 59)",
        "(line 562,col 9)-(line 562,col 73)",
        "(line 565,col 9)-(line 565,col 27)",
        "(line 566,col 9)-(line 615,col 9)",
        "(line 617,col 9)-(line 617,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getData()",
      "begin_line": 621,
      "end_line": 647,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 624,col 9)-(line 624,col 84)",
        "(line 625,col 9)-(line 625,col 74)",
        "(line 627,col 9)-(line 644,col 9)",
        "(line 646,col 9)-(line 646,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getNorm()",
      "begin_line": 650,
      "end_line": 673,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 56)",
        "(line 653,col 9)-(line 653,col 29)",
        "(line 654,col 9)-(line 671,col 9)",
        "(line 672,col 9)-(line 672,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getFrobeniusNorm()",
      "begin_line": 676,
      "end_line": 685,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 24)",
        "(line 679,col 9)-(line 683,col 9)",
        "(line 684,col 9)-(line 684,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 688,
      "end_line": 785,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 694,col 9)-(line 694,col 88)",
        "(line 697,col 9)-(line 698,col 84)",
        "(line 701,col 9)-(line 701,col 62)",
        "(line 702,col 9)-(line 702,col 62)",
        "(line 703,col 9)-(line 703,col 62)",
        "(line 704,col 9)-(line 704,col 62)",
        "(line 707,col 9)-(line 707,col 35)",
        "(line 708,col 9)-(line 782,col 9)",
        "(line 784,col 9)-(line 784,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.copyBlockPart(double[], int, int, int, int, int, double[], int, int, int)",
      "begin_line": 802,
      "end_line": 815,
      "comment": "\n     * Copy a part of a block into another one\n     * \u003cp\u003eThis method can be called only when the specified part fits in both\n     * blocks, no verification is done here.\u003c/p\u003e\n     * @param srcBlock source block\n     * @param srcWidth source block width ({@link #BLOCK_SIZE} or smaller)\n     * @param srcStartRow start row in the source block\n     * @param srcEndRow end row (exclusive) in the source block\n     * @param srcStartColumn start column in the source block\n     * @param srcEndColumn end column (exclusive) in the source block\n     * @param dstBlock destination block\n     * @param dstWidth destination block width ({@link #BLOCK_SIZE} or smaller)\n     * @param dstStartRow start row in the destination block\n     * @param dstStartColumn start column in the destination block\n     ",
      "child_ranges": [
        "(line 807,col 9)-(line 807,col 57)",
        "(line 808,col 9)-(line 808,col 61)",
        "(line 809,col 9)-(line 809,col 61)",
        "(line 810,col 9)-(line 814,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 818,
      "end_line": 866,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 823,col 9)-(line 823,col 50)",
        "(line 824,col 9)-(line 826,col 9)",
        "(line 827,col 9)-(line 827,col 57)",
        "(line 828,col 9)-(line 828,col 53)",
        "(line 829,col 9)-(line 829,col 78)",
        "(line 830,col 9)-(line 834,col 9)",
        "(line 837,col 9)-(line 837,col 54)",
        "(line 838,col 9)-(line 838,col 72)",
        "(line 839,col 9)-(line 839,col 57)",
        "(line 840,col 9)-(line 840,col 75)",
        "(line 843,col 9)-(line 865,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getRowMatrix(int)",
      "begin_line": 869,
      "end_line": 898,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 873,col 9)-(line 873,col 45)",
        "(line 874,col 9)-(line 874,col 68)",
        "(line 877,col 9)-(line 877,col 45)",
        "(line 878,col 9)-(line 878,col 54)",
        "(line 879,col 9)-(line 879,col 30)",
        "(line 880,col 9)-(line 880,col 30)",
        "(line 881,col 9)-(line 881,col 54)",
        "(line 882,col 9)-(line 895,col 9)",
        "(line 897,col 9)-(line 897,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setRowMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 901,
      "end_line": 908,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 903,col 9)-(line 907,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setRowMatrix(int, org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 921,
      "end_line": 951,
      "comment": "\n     * Sets the entries in row number \u003ccode\u003erow\u003c/code\u003e\n     * as a row matrix.  Row indices start at 0.\n     *\n     * @param row the row to be set\n     * @param matrix row matrix (must have one row and the same number of columns\n     * as the instance)\n     * @throws MatrixIndexException if the specified row index is invalid\n     * @throws MatrixDimensionMismatchException if the matrix dimensions do not match one\n     * instance row\n     ",
      "child_ranges": [
        "(line 922,col 9)-(line 922,col 45)",
        "(line 923,col 9)-(line 923,col 47)",
        "(line 924,col 9)-(line 929,col 9)",
        "(line 932,col 9)-(line 932,col 44)",
        "(line 933,col 9)-(line 933,col 53)",
        "(line 934,col 9)-(line 934,col 29)",
        "(line 935,col 9)-(line 935,col 29)",
        "(line 936,col 9)-(line 936,col 54)",
        "(line 937,col 9)-(line 950,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getColumnMatrix(int)",
      "begin_line": 954,
      "end_line": 981,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 958,col 9)-(line 958,col 51)",
        "(line 959,col 9)-(line 959,col 65)",
        "(line 962,col 9)-(line 962,col 48)",
        "(line 963,col 9)-(line 963,col 57)",
        "(line 964,col 9)-(line 964,col 47)",
        "(line 965,col 9)-(line 965,col 30)",
        "(line 966,col 9)-(line 966,col 30)",
        "(line 967,col 9)-(line 967,col 54)",
        "(line 968,col 9)-(line 978,col 9)",
        "(line 980,col 9)-(line 980,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 984,
      "end_line": 991,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 986,col 9)-(line 990,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 1004,
      "end_line": 1032,
      "comment": "\n     * Sets the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n     * as a column matrix.  Column indices start at 0.\n     *\n     * @param column the column to be set\n     * @param matrix column matrix (must have one column and the same number of rows\n     * as the instance)\n     * @throws MatrixIndexException if the specified column index is invalid\n     * @throws MatrixDimensionMismatchException if the matrix dimensions do not match one\n     * instance column\n     ",
      "child_ranges": [
        "(line 1005,col 9)-(line 1005,col 51)",
        "(line 1006,col 9)-(line 1006,col 44)",
        "(line 1007,col 9)-(line 1012,col 9)",
        "(line 1015,col 9)-(line 1015,col 48)",
        "(line 1016,col 9)-(line 1016,col 57)",
        "(line 1017,col 9)-(line 1017,col 47)",
        "(line 1018,col 9)-(line 1018,col 28)",
        "(line 1019,col 9)-(line 1019,col 28)",
        "(line 1020,col 9)-(line 1020,col 53)",
        "(line 1021,col 9)-(line 1031,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getRowVector(int)",
      "begin_line": 1035,
      "end_line": 1054,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1039,col 9)-(line 1039,col 45)",
        "(line 1040,col 9)-(line 1040,col 53)",
        "(line 1043,col 9)-(line 1043,col 45)",
        "(line 1044,col 9)-(line 1044,col 54)",
        "(line 1045,col 9)-(line 1045,col 30)",
        "(line 1046,col 9)-(line 1051,col 9)",
        "(line 1053,col 9)-(line 1053,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setRowVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1057,
      "end_line": 1064,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1059,col 9)-(line 1063,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getColumnVector(int)",
      "begin_line": 1067,
      "end_line": 1088,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1071,col 9)-(line 1071,col 51)",
        "(line 1072,col 9)-(line 1072,col 50)",
        "(line 1075,col 9)-(line 1075,col 48)",
        "(line 1076,col 9)-(line 1076,col 57)",
        "(line 1077,col 9)-(line 1077,col 47)",
        "(line 1078,col 9)-(line 1078,col 30)",
        "(line 1079,col 9)-(line 1085,col 9)",
        "(line 1087,col 9)-(line 1087,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setColumnVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1091,
      "end_line": 1098,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1093,col 9)-(line 1097,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getRow(int)",
      "begin_line": 1101,
      "end_line": 1120,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1105,col 9)-(line 1105,col 45)",
        "(line 1106,col 9)-(line 1106,col 49)",
        "(line 1109,col 9)-(line 1109,col 45)",
        "(line 1110,col 9)-(line 1110,col 54)",
        "(line 1111,col 9)-(line 1111,col 30)",
        "(line 1112,col 9)-(line 1117,col 9)",
        "(line 1119,col 9)-(line 1119,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setRow(int, double[])",
      "begin_line": 1123,
      "end_line": 1141,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1125,col 9)-(line 1125,col 45)",
        "(line 1126,col 9)-(line 1126,col 47)",
        "(line 1127,col 9)-(line 1129,col 9)",
        "(line 1132,col 9)-(line 1132,col 45)",
        "(line 1133,col 9)-(line 1133,col 54)",
        "(line 1134,col 9)-(line 1134,col 30)",
        "(line 1135,col 9)-(line 1140,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getColumn(int)",
      "begin_line": 1144,
      "end_line": 1165,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1148,col 9)-(line 1148,col 51)",
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
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setColumn(int, double[])",
      "begin_line": 1168,
      "end_line": 1188,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1170,col 9)-(line 1170,col 51)",
        "(line 1171,col 9)-(line 1171,col 44)",
        "(line 1172,col 9)-(line 1174,col 9)",
        "(line 1177,col 9)-(line 1177,col 48)",
        "(line 1178,col 9)-(line 1178,col 57)",
        "(line 1179,col 9)-(line 1179,col 47)",
        "(line 1180,col 9)-(line 1180,col 30)",
        "(line 1181,col 9)-(line 1187,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getEntry(int, int)",
      "begin_line": 1191,
      "end_line": 1205,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1194,col 9)-(line 1204,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setEntry(int, int, double)",
      "begin_line": 1208,
      "end_line": 1222,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1211,col 9)-(line 1221,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.addToEntry(int, int, double)",
      "begin_line": 1225,
      "end_line": 1239,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1228,col 9)-(line 1238,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 1242,
      "end_line": 1256,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1245,col 9)-(line 1255,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.transpose()",
      "begin_line": 1259,
      "end_line": 1296,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1262,col 9)-(line 1262,col 44)",
        "(line 1263,col 9)-(line 1263,col 47)",
        "(line 1264,col 9)-(line 1264,col 70)",
        "(line 1267,col 9)-(line 1267,col 27)",
        "(line 1268,col 9)-(line 1293,col 9)",
        "(line 1295,col 9)-(line 1295,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getRowDimension()",
      "begin_line": 1299,
      "end_line": 1302,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1301,col 9)-(line 1301,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getColumnDimension()",
      "begin_line": 1305,
      "end_line": 1308,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1307,col 9)-(line 1307,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.operate(double[])",
      "begin_line": 1311,
      "end_line": 1349,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1315,col 9)-(line 1317,col 9)",
        "(line 1318,col 9)-(line 1318,col 46)",
        "(line 1321,col 9)-(line 1346,col 9)",
        "(line 1348,col 9)-(line 1348,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.preMultiply(double[])",
      "begin_line": 1352,
      "end_line": 1395,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1356,col 9)-(line 1358,col 9)",
        "(line 1359,col 9)-(line 1359,col 49)",
        "(line 1362,col 9)-(line 1392,col 9)",
        "(line 1394,col 9)-(line 1394,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 1398,
      "end_line": 1420,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1401,col 9)-(line 1401,col 66)",
        "(line 1402,col 9)-(line 1418,col 9)",
        "(line 1419,col 9)-(line 1419,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 1423,
      "end_line": 1445,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1426,col 9)-(line 1426,col 66)",
        "(line 1427,col 9)-(line 1443,col 9)",
        "(line 1444,col 9)-(line 1444,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 1448,
      "end_line": 1475,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1453,col 9)-(line 1453,col 88)",
        "(line 1454,col 9)-(line 1454,col 79)",
        "(line 1455,col 9)-(line 1473,col 9)",
        "(line 1474,col 9)-(line 1474,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 1478,
      "end_line": 1505,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1483,col 9)-(line 1483,col 88)",
        "(line 1484,col 9)-(line 1484,col 79)",
        "(line 1485,col 9)-(line 1503,col 9)",
        "(line 1504,col 9)-(line 1504,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 1508,
      "end_line": 1531,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1511,col 9)-(line 1511,col 66)",
        "(line 1512,col 9)-(line 1512,col 27)",
        "(line 1513,col 9)-(line 1529,col 9)",
        "(line 1530,col 9)-(line 1530,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 1534,
      "end_line": 1557,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1537,col 9)-(line 1537,col 66)",
        "(line 1538,col 9)-(line 1538,col 27)",
        "(line 1539,col 9)-(line 1555,col 9)",
        "(line 1556,col 9)-(line 1556,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 1560,
      "end_line": 1587,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1565,col 9)-(line 1565,col 88)",
        "(line 1566,col 9)-(line 1566,col 79)",
        "(line 1567,col 9)-(line 1585,col 9)",
        "(line 1586,col 9)-(line 1586,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 1590,
      "end_line": 1617,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1595,col 9)-(line 1595,col 88)",
        "(line 1596,col 9)-(line 1596,col 79)",
        "(line 1597,col 9)-(line 1615,col 9)",
        "(line 1616,col 9)-(line 1616,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.blockHeight(int)",
      "begin_line": 1624,
      "end_line": 1626,
      "comment": "\n     * Get the height of a block.\n     * @param blockRow row index (in block sense) of the block\n     * @return height (number of rows) of the block\n     ",
      "child_ranges": [
        "(line 1625,col 9)-(line 1625,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.blockWidth(int)",
      "begin_line": 1633,
      "end_line": 1635,
      "comment": "\n     * Get the width of a block.\n     * @param blockColumn column index (in block sense) of the block\n     * @return width (number of columns) of the block\n     ",
      "child_ranges": [
        "(line 1634,col 9)-(line 1634,col 99)"
      ]
    }
  ]
}