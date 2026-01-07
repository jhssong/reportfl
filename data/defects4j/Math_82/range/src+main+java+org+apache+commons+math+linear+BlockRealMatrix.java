{
  "filepath": "/tmp/Math-82b/src/main/java/org/apache/commons/math/linear/BlockRealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BlockRealMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.AbstractRealMatrix",
        "java.io.Serializable"
      ],
      "begin_line": 64,
      "end_line": 1638,
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
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.BlockRealMatrix(int, int)",
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
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.BlockRealMatrix(double[][])",
      "begin_line": 124,
      "end_line": 127,
      "comment": "\n     * Create a new dense matrix copying entries from raw layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in raw layout.\u003c/p\u003e\n     * \u003cp\u003eCalling this constructor is equivalent to call:\n     * \u003cpre\u003ematrix \u003d new BlockRealMatrix(rawData.length, rawData[0].length,\n     *                                   toBlocksLayout(rawData), false);\u003c/pre\u003e\n     * \u003c/p\u003e\n     * @param rawData data for new matrix, in raw layout\n     *\n     * @exception IllegalArgumentException if \u003ccode\u003eblockData\u003c/code\u003e shape is\n     * inconsistent with block layout\n     * @see #BlockRealMatrix(int, int, double[][], boolean)\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 80)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.BlockRealMatrix(int, int, double[][], boolean)",
      "begin_line": 144,
      "end_line": 179,
      "comment": "\n     * Create a new dense matrix copying entries from block layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in blocks layout.\u003c/p\u003e\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @param blockData data for new matrix\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     *\n     * @exception IllegalArgumentException if \u003ccode\u003eblockData\u003c/code\u003e shape is\n     * inconsistent with block layout\n     * @see #createBlocksLayout(int, int)\n     * @see #toBlocksLayout(double[][])\n     * @see #BlockRealMatrix(double[][])\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 29)",
        "(line 149,col 9)-(line 149,col 28)",
        "(line 150,col 9)-(line 150,col 31)",
        "(line 153,col 9)-(line 153,col 63)",
        "(line 154,col 9)-(line 154,col 63)",
        "(line 156,col 9)-(line 162,col 9)",
        "(line 164,col 9)-(line 164,col 22)",
        "(line 165,col 9)-(line 177,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.toBlocksLayout(double[][])",
      "begin_line": 203,
      "end_line": 246,
      "comment": "\n     * Convert a data array from raw layout to blocks layout.\n     * \u003cp\u003e\n     * Raw layout is the straightforward layout where element at row i and\n     * column j is in array element \u003ccode\u003erawData[i][j]\u003c/code\u003e. Blocks layout\n     * is the layout used in {@link BlockRealMatrix} instances, where the matrix\n     * is split in square blocks (except at right and bottom side where blocks may\n     * be rectangular to fit matrix size) and each block is stored in a flattened\n     * one-dimensional array.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method creates an array in blocks layout from an input array in raw layout.\n     * It can be used to provide the array argument of the {@link\n     * #BlockRealMatrix(int, int, double[][], boolean)} constructor.\n     * \u003c/p\u003e\n     * @param rawData data array in raw layout\n     * @return a new data array containing the same entries but in blocks layout\n     * @exception IllegalArgumentException if \u003ccode\u003erawData\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length)\n     * @see #createBlocksLayout(int, int)\n     * @see #BlockRealMatrix(int, int, double[][], boolean)\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 48)",
        "(line 207,col 9)-(line 207,col 51)",
        "(line 208,col 9)-(line 208,col 73)",
        "(line 209,col 9)-(line 209,col 73)",
        "(line 212,col 9)-(line 219,col 9)",
        "(line 222,col 9)-(line 222,col 73)",
        "(line 223,col 9)-(line 242,col 9)",
        "(line 244,col 9)-(line 244,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.createBlocksLayout(int, int)",
      "begin_line": 260,
      "end_line": 280,
      "comment": "\n     * Create a data array in blocks layout.\n     * \u003cp\u003e\n     * This method can be used to create the array argument of the {@link\n     * #BlockRealMatrix(int, int, double[][], boolean)} constructor.\n     * \u003c/p\u003e\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @return a new data array in blocks layout\n     * @see #toBlocksLayout(double[][])\n     * @see #BlockRealMatrix(int, int, double[][], boolean)\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 73)",
        "(line 263,col 9)-(line 263,col 73)",
        "(line 265,col 9)-(line 265,col 73)",
        "(line 266,col 9)-(line 276,col 9)",
        "(line 278,col 9)-(line 278,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.createMatrix(int, int)",
      "begin_line": 283,
      "end_line": 287,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.copy()",
      "begin_line": 290,
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
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.add(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 306,
      "end_line": 345,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 309,col 9)-(line 344,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.add(org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 354,
      "end_line": 374,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 53)",
        "(line 360,col 9)-(line 360,col 71)",
        "(line 363,col 9)-(line 370,col 9)",
        "(line 372,col 9)-(line 372,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 377,
      "end_line": 416,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 380,col 9)-(line 415,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.subtract(org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 425,
      "end_line": 445,
      "comment": "\n     * Compute this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this - m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 56)",
        "(line 431,col 9)-(line 431,col 71)",
        "(line 434,col 9)-(line 441,col 9)",
        "(line 443,col 9)-(line 443,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.scalarAdd(double)",
      "begin_line": 448,
      "end_line": 465,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 71)",
        "(line 455,col 9)-(line 461,col 9)",
        "(line 463,col 9)-(line 463,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.scalarMultiply(double)",
      "begin_line": 468,
      "end_line": 485,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 71)",
        "(line 475,col 9)-(line 481,col 9)",
        "(line 483,col 9)-(line 483,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 488,
      "end_line": 542,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 491,col 9)-(line 541,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.multiply(org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 552,
      "end_line": 612,
      "comment": "\n     * Returns the result of postmultiplying this by m.\n     *\n     * @param m    matrix to postmultiply by\n     * @return     this * m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 59)",
        "(line 557,col 9)-(line 557,col 73)",
        "(line 560,col 9)-(line 560,col 27)",
        "(line 561,col 9)-(line 608,col 9)",
        "(line 610,col 9)-(line 610,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getData()",
      "begin_line": 615,
      "end_line": 642,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 84)",
        "(line 619,col 9)-(line 619,col 74)",
        "(line 621,col 9)-(line 638,col 9)",
        "(line 640,col 9)-(line 640,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getNorm()",
      "begin_line": 645,
      "end_line": 668,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 647,col 9)-(line 647,col 56)",
        "(line 648,col 9)-(line 648,col 29)",
        "(line 649,col 9)-(line 666,col 9)",
        "(line 667,col 9)-(line 667,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getFrobeniusNorm()",
      "begin_line": 671,
      "end_line": 680,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 24)",
        "(line 674,col 9)-(line 678,col 9)",
        "(line 679,col 9)-(line 679,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 683,
      "end_line": 774,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 689,col 9)-(line 689,col 88)",
        "(line 692,col 9)-(line 693,col 84)",
        "(line 696,col 9)-(line 696,col 62)",
        "(line 697,col 9)-(line 697,col 62)",
        "(line 698,col 9)-(line 698,col 62)",
        "(line 699,col 9)-(line 699,col 62)",
        "(line 702,col 9)-(line 770,col 9)",
        "(line 772,col 9)-(line 772,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.copyBlockPart(double[], int, int, int, int, int, double[], int, int, int)",
      "begin_line": 791,
      "end_line": 804,
      "comment": "\n     * Copy a part of a block into another one\n     * \u003cp\u003eThis method can be called only when the specified part fits in both\n     * blocks, no verification is done here.\u003c/p\u003e\n     * @param srcBlock source block\n     * @param srcWidth source block width ({@link #BLOCK_SIZE} or smaller)\n     * @param srcStartRow start row in the source block\n     * @param srcEndRow end row (exclusive) in the source block\n     * @param srcStartColumn start column in the source block\n     * @param srcEndColumn end column (exclusive) in the source block\n     * @param dstBlock destination block\n     * @param dstWidth destination block width ({@link #BLOCK_SIZE} or smaller)\n     * @param dstStartRow start row in the destination block\n     * @param dstStartColumn start column in the destination block\n     ",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 57)",
        "(line 797,col 9)-(line 797,col 61)",
        "(line 798,col 9)-(line 798,col 61)",
        "(line 799,col 9)-(line 803,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 807,
      "end_line": 857,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 812,col 9)-(line 812,col 50)",
        "(line 813,col 9)-(line 815,col 9)",
        "(line 816,col 9)-(line 816,col 57)",
        "(line 817,col 9)-(line 817,col 53)",
        "(line 818,col 9)-(line 818,col 78)",
        "(line 819,col 9)-(line 825,col 9)",
        "(line 828,col 9)-(line 828,col 54)",
        "(line 829,col 9)-(line 829,col 72)",
        "(line 830,col 9)-(line 830,col 57)",
        "(line 831,col 9)-(line 831,col 75)",
        "(line 834,col 9)-(line 856,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getRowMatrix(int)",
      "begin_line": 860,
      "end_line": 890,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 864,col 9)-(line 864,col 45)",
        "(line 865,col 9)-(line 865,col 68)",
        "(line 868,col 9)-(line 868,col 45)",
        "(line 869,col 9)-(line 869,col 54)",
        "(line 870,col 9)-(line 870,col 30)",
        "(line 871,col 9)-(line 871,col 30)",
        "(line 872,col 9)-(line 872,col 54)",
        "(line 873,col 9)-(line 886,col 9)",
        "(line 888,col 9)-(line 888,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setRowMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 893,
      "end_line": 901,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 896,col 9)-(line 900,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setRowMatrix(int, org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 914,
      "end_line": 948,
      "comment": "\n     * Sets the entries in row number \u003ccode\u003erow\u003c/code\u003e\n     * as a row matrix.  Row indices start at 0.\n     *\n     * @param row the row to be set\n     * @param matrix row matrix (must have one row and the same number of columns\n     * as the instance)\n     * @throws MatrixIndexException if the specified row index is invalid\n     * @throws InvalidMatrixException if the matrix dimensions do not match one\n     * instance row\n     ",
      "child_ranges": [
        "(line 917,col 9)-(line 917,col 45)",
        "(line 918,col 9)-(line 918,col 47)",
        "(line 919,col 9)-(line 925,col 9)",
        "(line 928,col 9)-(line 928,col 44)",
        "(line 929,col 9)-(line 929,col 53)",
        "(line 930,col 9)-(line 930,col 29)",
        "(line 931,col 9)-(line 931,col 29)",
        "(line 932,col 9)-(line 932,col 54)",
        "(line 933,col 9)-(line 946,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getColumnMatrix(int)",
      "begin_line": 951,
      "end_line": 979,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 955,col 9)-(line 955,col 51)",
        "(line 956,col 9)-(line 956,col 65)",
        "(line 959,col 9)-(line 959,col 48)",
        "(line 960,col 9)-(line 960,col 57)",
        "(line 961,col 9)-(line 961,col 47)",
        "(line 962,col 9)-(line 962,col 30)",
        "(line 963,col 9)-(line 963,col 30)",
        "(line 964,col 9)-(line 964,col 54)",
        "(line 965,col 9)-(line 975,col 9)",
        "(line 977,col 9)-(line 977,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 982,
      "end_line": 990,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 985,col 9)-(line 989,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 1003,
      "end_line": 1035,
      "comment": "\n     * Sets the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n     * as a column matrix.  Column indices start at 0.\n     *\n     * @param column the column to be set\n     * @param matrix column matrix (must have one column and the same number of rows\n     * as the instance)\n     * @throws MatrixIndexException if the specified column index is invalid\n     * @throws InvalidMatrixException if the matrix dimensions do not match one\n     * instance column\n     ",
      "child_ranges": [
        "(line 1006,col 9)-(line 1006,col 51)",
        "(line 1007,col 9)-(line 1007,col 44)",
        "(line 1008,col 9)-(line 1014,col 9)",
        "(line 1017,col 9)-(line 1017,col 48)",
        "(line 1018,col 9)-(line 1018,col 57)",
        "(line 1019,col 9)-(line 1019,col 47)",
        "(line 1020,col 9)-(line 1020,col 28)",
        "(line 1021,col 9)-(line 1021,col 28)",
        "(line 1022,col 9)-(line 1022,col 53)",
        "(line 1023,col 9)-(line 1033,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getRowVector(int)",
      "begin_line": 1038,
      "end_line": 1058,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1042,col 9)-(line 1042,col 45)",
        "(line 1043,col 9)-(line 1043,col 53)",
        "(line 1046,col 9)-(line 1046,col 45)",
        "(line 1047,col 9)-(line 1047,col 54)",
        "(line 1048,col 9)-(line 1048,col 30)",
        "(line 1049,col 9)-(line 1054,col 9)",
        "(line 1056,col 9)-(line 1056,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setRowVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1061,
      "end_line": 1069,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1064,col 9)-(line 1068,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getColumnVector(int)",
      "begin_line": 1072,
      "end_line": 1094,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1076,col 9)-(line 1076,col 51)",
        "(line 1077,col 9)-(line 1077,col 50)",
        "(line 1080,col 9)-(line 1080,col 48)",
        "(line 1081,col 9)-(line 1081,col 57)",
        "(line 1082,col 9)-(line 1082,col 47)",
        "(line 1083,col 9)-(line 1083,col 30)",
        "(line 1084,col 9)-(line 1090,col 9)",
        "(line 1092,col 9)-(line 1092,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setColumnVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1097,
      "end_line": 1105,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1100,col 9)-(line 1104,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getRow(int)",
      "begin_line": 1108,
      "end_line": 1128,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1112,col 9)-(line 1112,col 45)",
        "(line 1113,col 9)-(line 1113,col 49)",
        "(line 1116,col 9)-(line 1116,col 45)",
        "(line 1117,col 9)-(line 1117,col 54)",
        "(line 1118,col 9)-(line 1118,col 30)",
        "(line 1119,col 9)-(line 1124,col 9)",
        "(line 1126,col 9)-(line 1126,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setRow(int, double[])",
      "begin_line": 1131,
      "end_line": 1154,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1135,col 9)-(line 1135,col 45)",
        "(line 1136,col 9)-(line 1136,col 47)",
        "(line 1137,col 9)-(line 1141,col 9)",
        "(line 1144,col 9)-(line 1144,col 45)",
        "(line 1145,col 9)-(line 1145,col 54)",
        "(line 1146,col 9)-(line 1146,col 30)",
        "(line 1147,col 9)-(line 1152,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getColumn(int)",
      "begin_line": 1157,
      "end_line": 1179,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1161,col 9)-(line 1161,col 51)",
        "(line 1162,col 9)-(line 1162,col 46)",
        "(line 1165,col 9)-(line 1165,col 48)",
        "(line 1166,col 9)-(line 1166,col 57)",
        "(line 1167,col 9)-(line 1167,col 47)",
        "(line 1168,col 9)-(line 1168,col 30)",
        "(line 1169,col 9)-(line 1175,col 9)",
        "(line 1177,col 9)-(line 1177,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setColumn(int, double[])",
      "begin_line": 1182,
      "end_line": 1207,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1186,col 9)-(line 1186,col 51)",
        "(line 1187,col 9)-(line 1187,col 44)",
        "(line 1188,col 9)-(line 1192,col 9)",
        "(line 1195,col 9)-(line 1195,col 48)",
        "(line 1196,col 9)-(line 1196,col 57)",
        "(line 1197,col 9)-(line 1197,col 47)",
        "(line 1198,col 9)-(line 1198,col 30)",
        "(line 1199,col 9)-(line 1205,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getEntry(int, int)",
      "begin_line": 1210,
      "end_line": 1224,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1213,col 9)-(line 1223,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setEntry(int, int, double)",
      "begin_line": 1227,
      "end_line": 1241,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1230,col 9)-(line 1240,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.addToEntry(int, int, double)",
      "begin_line": 1244,
      "end_line": 1258,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1247,col 9)-(line 1257,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 1261,
      "end_line": 1275,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1264,col 9)-(line 1274,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.transpose()",
      "begin_line": 1278,
      "end_line": 1312,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1281,col 9)-(line 1281,col 44)",
        "(line 1282,col 9)-(line 1282,col 47)",
        "(line 1283,col 9)-(line 1283,col 70)",
        "(line 1286,col 9)-(line 1286,col 27)",
        "(line 1287,col 9)-(line 1308,col 9)",
        "(line 1310,col 9)-(line 1310,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getRowDimension()",
      "begin_line": 1315,
      "end_line": 1318,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1317,col 9)-(line 1317,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getColumnDimension()",
      "begin_line": 1321,
      "end_line": 1324,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1323,col 9)-(line 1323,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.operate(double[])",
      "begin_line": 1327,
      "end_line": 1367,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1331,col 9)-(line 1335,col 9)",
        "(line 1336,col 9)-(line 1336,col 46)",
        "(line 1339,col 9)-(line 1363,col 9)",
        "(line 1365,col 9)-(line 1365,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.preMultiply(double[])",
      "begin_line": 1370,
      "end_line": 1416,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1374,col 9)-(line 1378,col 9)",
        "(line 1379,col 9)-(line 1379,col 49)",
        "(line 1382,col 9)-(line 1412,col 9)",
        "(line 1414,col 9)-(line 1414,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 1419,
      "end_line": 1439,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1422,col 9)-(line 1422,col 66)",
        "(line 1423,col 9)-(line 1437,col 9)",
        "(line 1438,col 9)-(line 1438,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 1442,
      "end_line": 1462,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1445,col 9)-(line 1445,col 66)",
        "(line 1446,col 9)-(line 1460,col 9)",
        "(line 1461,col 9)-(line 1461,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 1465,
      "end_line": 1490,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1470,col 9)-(line 1470,col 88)",
        "(line 1471,col 9)-(line 1471,col 79)",
        "(line 1472,col 9)-(line 1488,col 9)",
        "(line 1489,col 9)-(line 1489,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 1493,
      "end_line": 1518,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1498,col 9)-(line 1498,col 88)",
        "(line 1499,col 9)-(line 1499,col 79)",
        "(line 1500,col 9)-(line 1516,col 9)",
        "(line 1517,col 9)-(line 1517,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 1521,
      "end_line": 1540,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1524,col 9)-(line 1524,col 66)",
        "(line 1525,col 9)-(line 1538,col 9)",
        "(line 1539,col 9)-(line 1539,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 1543,
      "end_line": 1562,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1546,col 9)-(line 1546,col 66)",
        "(line 1547,col 9)-(line 1560,col 9)",
        "(line 1561,col 9)-(line 1561,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 1565,
      "end_line": 1590,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1570,col 9)-(line 1570,col 88)",
        "(line 1571,col 9)-(line 1571,col 79)",
        "(line 1572,col 9)-(line 1588,col 9)",
        "(line 1589,col 9)-(line 1589,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 1593,
      "end_line": 1618,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1598,col 9)-(line 1598,col 88)",
        "(line 1599,col 9)-(line 1599,col 79)",
        "(line 1600,col 9)-(line 1616,col 9)",
        "(line 1617,col 9)-(line 1617,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.blockHeight(int)",
      "begin_line": 1625,
      "end_line": 1627,
      "comment": "\n     * Get the height of a block.\n     * @param blockRow row index (in block sense) of the block\n     * @return height (number of rows) of the block\n     ",
      "child_ranges": [
        "(line 1626,col 9)-(line 1626,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.blockWidth(int)",
      "begin_line": 1634,
      "end_line": 1636,
      "comment": "\n     * Get the width of a block.\n     * @param blockColumn column index (in block sense) of the block\n     * @return width (number of columns) of the block\n     ",
      "child_ranges": [
        "(line 1635,col 9)-(line 1635,col 99)"
      ]
    }
  ]
}