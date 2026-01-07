{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/linear/BlockRealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BlockRealMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.AbstractRealMatrix",
        "java.io.Serializable"
      ],
      "begin_line": 66,
      "end_line": 1689,
      "comment": "\n * Cache-friendly implementation of RealMatrix using a flat arrays to store\n * square blocks of the matrix.\n * \u003cp\u003e\n * This implementation is specially designed to be cache-friendly. Square blocks are\n * stored as small arrays and allow efficient traversal of data both in row major direction\n * and columns major direction, one block at a time. This greatly increases performances\n * for algorithms that use crossed directions loops like multiplication or transposition.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The size of square blocks is a static parameter. It may be tuned according to the cache\n * size of the target computer processor. As a rule of thumbs, it should be the largest\n * value that allows three blocks to be simultaneously cached (this is necessary for example\n * for matrix multiplication). The default value is to use 52x52 blocks which is well suited\n * for processors with 64k L1 cache (one block holds 2704 values or 21632 bytes). This value\n * could be lowered to 36x36 for processors with 32k L1 cache.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The regular blocks represent {@link #BLOCK_SIZE} x {@link #BLOCK_SIZE} squares. Blocks\n * at right hand side and bottom side which may be smaller to fit matrix dimensions. The square\n * blocks are flattened in row major order in single dimension arrays which are therefore\n * {@link #BLOCK_SIZE}\u003csup\u003e2\u003c/sup\u003e elements long for regular blocks. The blocks are themselves\n * organized in row major order.\n * \u003c/p\u003e\n * \u003cp\u003e\n * As an example, for a block size of 52x52, a 100x60 matrix would be stored in 4 blocks.\n * Block 0 would be a double[2704] array holding the upper left 52x52 square, block 1 would be\n * a double[416] array holding the upper right 52x8 rectangle, block 2 would be a double[2496]\n * array holding the lower left 48x52 rectangle and block 3 would be a double[384] array\n * holding the lower right 48x8 rectangle.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The layout complexity overhead versus simple mapping of matrices to java\n * arrays is negligible for small matrices (about 1%). The gain from cache efficiency leads\n * to up to 3-fold improvements for matrices of moderate to large size.\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "BLOCK_SIZE"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Block size. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "blocks"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Blocks of matrix entries. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Number of rows of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "columns"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Number of columns of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "blockRows"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Number of block rows of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "blockColumns"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Number of block columns of the matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.BlockRealMatrix(int, int)",
      "begin_line": 97,
      "end_line": 111,
      "comment": "\n     * Create a new matrix with the supplied row and column dimensions.\n     *\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @throws IllegalArgumentException if row or column dimension is not\n     *  positive\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 29)",
        "(line 101,col 9)-(line 101,col 28)",
        "(line 102,col 9)-(line 102,col 31)",
        "(line 105,col 9)-(line 105,col 63)",
        "(line 106,col 9)-(line 106,col 63)",
        "(line 109,col 9)-(line 109,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.BlockRealMatrix(double[][])",
      "begin_line": 126,
      "end_line": 129,
      "comment": "\n     * Create a new dense matrix copying entries from raw layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in raw layout.\u003c/p\u003e\n     * \u003cp\u003eCalling this constructor is equivalent to call:\n     * \u003cpre\u003ematrix \u003d new BlockRealMatrix(rawData.length, rawData[0].length,\n     *                                   toBlocksLayout(rawData), false);\u003c/pre\u003e\n     * \u003c/p\u003e\n     * @param rawData data for new matrix, in raw layout\n     *\n     * @exception IllegalArgumentException if \u003ccode\u003eblockData\u003c/code\u003e shape is\n     * inconsistent with block layout\n     * @see #BlockRealMatrix(int, int, double[][], boolean)\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 80)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.BlockRealMatrix(int, int, double[][], boolean)",
      "begin_line": 146,
      "end_line": 181,
      "comment": "\n     * Create a new dense matrix copying entries from block layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in blocks layout.\u003c/p\u003e\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @param blockData data for new matrix\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     *\n     * @exception IllegalArgumentException if \u003ccode\u003eblockData\u003c/code\u003e shape is\n     * inconsistent with block layout\n     * @see #createBlocksLayout(int, int)\n     * @see #toBlocksLayout(double[][])\n     * @see #BlockRealMatrix(double[][])\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 29)",
        "(line 151,col 9)-(line 151,col 28)",
        "(line 152,col 9)-(line 152,col 31)",
        "(line 155,col 9)-(line 155,col 63)",
        "(line 156,col 9)-(line 156,col 63)",
        "(line 158,col 9)-(line 164,col 9)",
        "(line 166,col 9)-(line 166,col 22)",
        "(line 167,col 9)-(line 179,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.toBlocksLayout(double[][])",
      "begin_line": 205,
      "end_line": 253,
      "comment": "\n     * Convert a data array from raw layout to blocks layout.\n     * \u003cp\u003e\n     * Raw layout is the straightforward layout where element at row i and\n     * column j is in array element \u003ccode\u003erawData[i][j]\u003c/code\u003e. Blocks layout\n     * is the layout used in {@link BlockRealMatrix} instances, where the matrix\n     * is split in square blocks (except at right and bottom side where blocks may\n     * be rectangular to fit matrix size) and each block is stored in a flattened\n     * one-dimensional array.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method creates an array in blocks layout from an input array in raw layout.\n     * It can be used to provide the array argument of the {@link\n     * #BlockRealMatrix(int, int, double[][], boolean)} constructor.\n     * \u003c/p\u003e\n     * @param rawData data array in raw layout\n     * @return a new data array containing the same entries but in blocks layout\n     * @exception IllegalArgumentException if \u003ccode\u003erawData\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length)\n     * @see #createBlocksLayout(int, int)\n     * @see #BlockRealMatrix(int, int, double[][], boolean)\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 48)",
        "(line 209,col 9)-(line 209,col 51)",
        "(line 210,col 9)-(line 210,col 73)",
        "(line 211,col 9)-(line 211,col 73)",
        "(line 214,col 9)-(line 221,col 9)",
        "(line 224,col 9)-(line 224,col 73)",
        "(line 225,col 9)-(line 225,col 27)",
        "(line 226,col 9)-(line 249,col 9)",
        "(line 251,col 9)-(line 251,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.createBlocksLayout(int, int)",
      "begin_line": 267,
      "end_line": 289,
      "comment": "\n     * Create a data array in blocks layout.\n     * \u003cp\u003e\n     * This method can be used to create the array argument of the {@link\n     * #BlockRealMatrix(int, int, double[][], boolean)} constructor.\n     * \u003c/p\u003e\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @return a new data array in blocks layout\n     * @see #toBlocksLayout(double[][])\n     * @see #BlockRealMatrix(int, int, double[][], boolean)\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 73)",
        "(line 270,col 9)-(line 270,col 73)",
        "(line 272,col 9)-(line 272,col 73)",
        "(line 273,col 9)-(line 273,col 27)",
        "(line 274,col 9)-(line 285,col 9)",
        "(line 287,col 9)-(line 287,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.createMatrix(int, int)",
      "begin_line": 292,
      "end_line": 296,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.copy()",
      "begin_line": 299,
      "end_line": 312,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 68)",
        "(line 306,col 9)-(line 308,col 9)",
        "(line 310,col 9)-(line 310,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.add(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 315,
      "end_line": 356,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 318,col 9)-(line 355,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.add(org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 365,
      "end_line": 385,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 53)",
        "(line 371,col 9)-(line 371,col 71)",
        "(line 374,col 9)-(line 381,col 9)",
        "(line 383,col 9)-(line 383,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 388,
      "end_line": 429,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 391,col 9)-(line 428,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.subtract(org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 438,
      "end_line": 458,
      "comment": "\n     * Compute this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this - m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 56)",
        "(line 444,col 9)-(line 444,col 71)",
        "(line 447,col 9)-(line 454,col 9)",
        "(line 456,col 9)-(line 456,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.scalarAdd(double)",
      "begin_line": 461,
      "end_line": 478,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 71)",
        "(line 468,col 9)-(line 474,col 9)",
        "(line 476,col 9)-(line 476,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.scalarMultiply(double)",
      "begin_line": 481,
      "end_line": 498,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 71)",
        "(line 488,col 9)-(line 494,col 9)",
        "(line 496,col 9)-(line 496,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 501,
      "end_line": 559,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 504,col 9)-(line 558,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.multiply(org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 569,
      "end_line": 631,
      "comment": "\n     * Returns the result of postmultiplying this by m.\n     *\n     * @param m    matrix to postmultiply by\n     * @return     this * m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 59)",
        "(line 574,col 9)-(line 574,col 73)",
        "(line 577,col 9)-(line 577,col 27)",
        "(line 578,col 9)-(line 627,col 9)",
        "(line 629,col 9)-(line 629,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getData()",
      "begin_line": 634,
      "end_line": 661,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 637,col 9)-(line 637,col 84)",
        "(line 638,col 9)-(line 638,col 74)",
        "(line 640,col 9)-(line 657,col 9)",
        "(line 659,col 9)-(line 659,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getNorm()",
      "begin_line": 664,
      "end_line": 687,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 666,col 9)-(line 666,col 56)",
        "(line 667,col 9)-(line 667,col 29)",
        "(line 668,col 9)-(line 685,col 9)",
        "(line 686,col 9)-(line 686,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getFrobeniusNorm()",
      "begin_line": 690,
      "end_line": 699,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 692,col 9)-(line 692,col 24)",
        "(line 693,col 9)-(line 697,col 9)",
        "(line 698,col 9)-(line 698,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 702,
      "end_line": 800,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 708,col 9)-(line 708,col 88)",
        "(line 711,col 9)-(line 712,col 84)",
        "(line 715,col 9)-(line 715,col 62)",
        "(line 716,col 9)-(line 716,col 62)",
        "(line 717,col 9)-(line 717,col 62)",
        "(line 718,col 9)-(line 718,col 62)",
        "(line 721,col 9)-(line 721,col 35)",
        "(line 722,col 9)-(line 796,col 9)",
        "(line 798,col 9)-(line 798,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.copyBlockPart(double[], int, int, int, int, int, double[], int, int, int)",
      "begin_line": 817,
      "end_line": 830,
      "comment": "\n     * Copy a part of a block into another one\n     * \u003cp\u003eThis method can be called only when the specified part fits in both\n     * blocks, no verification is done here.\u003c/p\u003e\n     * @param srcBlock source block\n     * @param srcWidth source block width ({@link #BLOCK_SIZE} or smaller)\n     * @param srcStartRow start row in the source block\n     * @param srcEndRow end row (exclusive) in the source block\n     * @param srcStartColumn start column in the source block\n     * @param srcEndColumn end column (exclusive) in the source block\n     * @param dstBlock destination block\n     * @param dstWidth destination block width ({@link #BLOCK_SIZE} or smaller)\n     * @param dstStartRow start row in the destination block\n     * @param dstStartColumn start column in the destination block\n     ",
      "child_ranges": [
        "(line 822,col 9)-(line 822,col 57)",
        "(line 823,col 9)-(line 823,col 61)",
        "(line 824,col 9)-(line 824,col 61)",
        "(line 825,col 9)-(line 829,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 833,
      "end_line": 883,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 838,col 9)-(line 838,col 50)",
        "(line 839,col 9)-(line 841,col 9)",
        "(line 842,col 9)-(line 842,col 57)",
        "(line 843,col 9)-(line 843,col 53)",
        "(line 844,col 9)-(line 844,col 78)",
        "(line 845,col 9)-(line 851,col 9)",
        "(line 854,col 9)-(line 854,col 54)",
        "(line 855,col 9)-(line 855,col 72)",
        "(line 856,col 9)-(line 856,col 57)",
        "(line 857,col 9)-(line 857,col 75)",
        "(line 860,col 9)-(line 882,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getRowMatrix(int)",
      "begin_line": 886,
      "end_line": 916,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 890,col 9)-(line 890,col 45)",
        "(line 891,col 9)-(line 891,col 68)",
        "(line 894,col 9)-(line 894,col 45)",
        "(line 895,col 9)-(line 895,col 54)",
        "(line 896,col 9)-(line 896,col 30)",
        "(line 897,col 9)-(line 897,col 30)",
        "(line 898,col 9)-(line 898,col 54)",
        "(line 899,col 9)-(line 912,col 9)",
        "(line 914,col 9)-(line 914,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setRowMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 919,
      "end_line": 927,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 922,col 9)-(line 926,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setRowMatrix(int, org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 940,
      "end_line": 974,
      "comment": "\n     * Sets the entries in row number \u003ccode\u003erow\u003c/code\u003e\n     * as a row matrix.  Row indices start at 0.\n     *\n     * @param row the row to be set\n     * @param matrix row matrix (must have one row and the same number of columns\n     * as the instance)\n     * @throws MatrixIndexException if the specified row index is invalid\n     * @throws InvalidMatrixException if the matrix dimensions do not match one\n     * instance row\n     ",
      "child_ranges": [
        "(line 943,col 9)-(line 943,col 45)",
        "(line 944,col 9)-(line 944,col 47)",
        "(line 945,col 9)-(line 951,col 9)",
        "(line 954,col 9)-(line 954,col 44)",
        "(line 955,col 9)-(line 955,col 53)",
        "(line 956,col 9)-(line 956,col 29)",
        "(line 957,col 9)-(line 957,col 29)",
        "(line 958,col 9)-(line 958,col 54)",
        "(line 959,col 9)-(line 972,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getColumnMatrix(int)",
      "begin_line": 977,
      "end_line": 1005,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 981,col 9)-(line 981,col 51)",
        "(line 982,col 9)-(line 982,col 65)",
        "(line 985,col 9)-(line 985,col 48)",
        "(line 986,col 9)-(line 986,col 57)",
        "(line 987,col 9)-(line 987,col 47)",
        "(line 988,col 9)-(line 988,col 30)",
        "(line 989,col 9)-(line 989,col 30)",
        "(line 990,col 9)-(line 990,col 54)",
        "(line 991,col 9)-(line 1001,col 9)",
        "(line 1003,col 9)-(line 1003,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1008,
      "end_line": 1016,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1011,col 9)-(line 1015,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 1029,
      "end_line": 1061,
      "comment": "\n     * Sets the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n     * as a column matrix.  Column indices start at 0.\n     *\n     * @param column the column to be set\n     * @param matrix column matrix (must have one column and the same number of rows\n     * as the instance)\n     * @throws MatrixIndexException if the specified column index is invalid\n     * @throws InvalidMatrixException if the matrix dimensions do not match one\n     * instance column\n     ",
      "child_ranges": [
        "(line 1032,col 9)-(line 1032,col 51)",
        "(line 1033,col 9)-(line 1033,col 44)",
        "(line 1034,col 9)-(line 1040,col 9)",
        "(line 1043,col 9)-(line 1043,col 48)",
        "(line 1044,col 9)-(line 1044,col 57)",
        "(line 1045,col 9)-(line 1045,col 47)",
        "(line 1046,col 9)-(line 1046,col 28)",
        "(line 1047,col 9)-(line 1047,col 28)",
        "(line 1048,col 9)-(line 1048,col 53)",
        "(line 1049,col 9)-(line 1059,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getRowVector(int)",
      "begin_line": 1064,
      "end_line": 1084,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1068,col 9)-(line 1068,col 45)",
        "(line 1069,col 9)-(line 1069,col 53)",
        "(line 1072,col 9)-(line 1072,col 45)",
        "(line 1073,col 9)-(line 1073,col 54)",
        "(line 1074,col 9)-(line 1074,col 30)",
        "(line 1075,col 9)-(line 1080,col 9)",
        "(line 1082,col 9)-(line 1082,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setRowVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1087,
      "end_line": 1095,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1090,col 9)-(line 1094,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getColumnVector(int)",
      "begin_line": 1098,
      "end_line": 1120,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1102,col 9)-(line 1102,col 51)",
        "(line 1103,col 9)-(line 1103,col 50)",
        "(line 1106,col 9)-(line 1106,col 48)",
        "(line 1107,col 9)-(line 1107,col 57)",
        "(line 1108,col 9)-(line 1108,col 47)",
        "(line 1109,col 9)-(line 1109,col 30)",
        "(line 1110,col 9)-(line 1116,col 9)",
        "(line 1118,col 9)-(line 1118,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setColumnVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1123,
      "end_line": 1131,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1126,col 9)-(line 1130,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getRow(int)",
      "begin_line": 1134,
      "end_line": 1154,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1138,col 9)-(line 1138,col 45)",
        "(line 1139,col 9)-(line 1139,col 49)",
        "(line 1142,col 9)-(line 1142,col 45)",
        "(line 1143,col 9)-(line 1143,col 54)",
        "(line 1144,col 9)-(line 1144,col 30)",
        "(line 1145,col 9)-(line 1150,col 9)",
        "(line 1152,col 9)-(line 1152,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setRow(int, double[])",
      "begin_line": 1157,
      "end_line": 1180,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1161,col 9)-(line 1161,col 45)",
        "(line 1162,col 9)-(line 1162,col 47)",
        "(line 1163,col 9)-(line 1167,col 9)",
        "(line 1170,col 9)-(line 1170,col 45)",
        "(line 1171,col 9)-(line 1171,col 54)",
        "(line 1172,col 9)-(line 1172,col 30)",
        "(line 1173,col 9)-(line 1178,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getColumn(int)",
      "begin_line": 1183,
      "end_line": 1205,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1187,col 9)-(line 1187,col 51)",
        "(line 1188,col 9)-(line 1188,col 46)",
        "(line 1191,col 9)-(line 1191,col 48)",
        "(line 1192,col 9)-(line 1192,col 57)",
        "(line 1193,col 9)-(line 1193,col 47)",
        "(line 1194,col 9)-(line 1194,col 30)",
        "(line 1195,col 9)-(line 1201,col 9)",
        "(line 1203,col 9)-(line 1203,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setColumn(int, double[])",
      "begin_line": 1208,
      "end_line": 1233,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1212,col 9)-(line 1212,col 51)",
        "(line 1213,col 9)-(line 1213,col 44)",
        "(line 1214,col 9)-(line 1218,col 9)",
        "(line 1221,col 9)-(line 1221,col 48)",
        "(line 1222,col 9)-(line 1222,col 57)",
        "(line 1223,col 9)-(line 1223,col 47)",
        "(line 1224,col 9)-(line 1224,col 30)",
        "(line 1225,col 9)-(line 1231,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getEntry(int, int)",
      "begin_line": 1236,
      "end_line": 1250,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1239,col 9)-(line 1249,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setEntry(int, int, double)",
      "begin_line": 1253,
      "end_line": 1267,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1256,col 9)-(line 1266,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.addToEntry(int, int, double)",
      "begin_line": 1270,
      "end_line": 1284,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1273,col 9)-(line 1283,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 1287,
      "end_line": 1301,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1290,col 9)-(line 1300,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.transpose()",
      "begin_line": 1304,
      "end_line": 1342,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1307,col 9)-(line 1307,col 44)",
        "(line 1308,col 9)-(line 1308,col 47)",
        "(line 1309,col 9)-(line 1309,col 70)",
        "(line 1312,col 9)-(line 1312,col 27)",
        "(line 1313,col 9)-(line 1338,col 9)",
        "(line 1340,col 9)-(line 1340,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getRowDimension()",
      "begin_line": 1345,
      "end_line": 1348,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1347,col 9)-(line 1347,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getColumnDimension()",
      "begin_line": 1351,
      "end_line": 1354,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1353,col 9)-(line 1353,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.operate(double[])",
      "begin_line": 1357,
      "end_line": 1398,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1361,col 9)-(line 1365,col 9)",
        "(line 1366,col 9)-(line 1366,col 46)",
        "(line 1369,col 9)-(line 1394,col 9)",
        "(line 1396,col 9)-(line 1396,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.preMultiply(double[])",
      "begin_line": 1401,
      "end_line": 1447,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1405,col 9)-(line 1409,col 9)",
        "(line 1410,col 9)-(line 1410,col 49)",
        "(line 1413,col 9)-(line 1443,col 9)",
        "(line 1445,col 9)-(line 1445,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 1450,
      "end_line": 1472,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1453,col 9)-(line 1453,col 66)",
        "(line 1454,col 9)-(line 1470,col 9)",
        "(line 1471,col 9)-(line 1471,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 1475,
      "end_line": 1497,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1478,col 9)-(line 1478,col 66)",
        "(line 1479,col 9)-(line 1495,col 9)",
        "(line 1496,col 9)-(line 1496,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 1500,
      "end_line": 1527,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1505,col 9)-(line 1505,col 88)",
        "(line 1506,col 9)-(line 1506,col 79)",
        "(line 1507,col 9)-(line 1525,col 9)",
        "(line 1526,col 9)-(line 1526,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 1530,
      "end_line": 1557,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1535,col 9)-(line 1535,col 88)",
        "(line 1536,col 9)-(line 1536,col 79)",
        "(line 1537,col 9)-(line 1555,col 9)",
        "(line 1556,col 9)-(line 1556,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 1560,
      "end_line": 1583,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1563,col 9)-(line 1563,col 66)",
        "(line 1564,col 9)-(line 1564,col 27)",
        "(line 1565,col 9)-(line 1581,col 9)",
        "(line 1582,col 9)-(line 1582,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 1586,
      "end_line": 1609,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1589,col 9)-(line 1589,col 66)",
        "(line 1590,col 9)-(line 1590,col 27)",
        "(line 1591,col 9)-(line 1607,col 9)",
        "(line 1608,col 9)-(line 1608,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 1612,
      "end_line": 1639,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1617,col 9)-(line 1617,col 88)",
        "(line 1618,col 9)-(line 1618,col 79)",
        "(line 1619,col 9)-(line 1637,col 9)",
        "(line 1638,col 9)-(line 1638,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 1642,
      "end_line": 1669,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1647,col 9)-(line 1647,col 88)",
        "(line 1648,col 9)-(line 1648,col 79)",
        "(line 1649,col 9)-(line 1667,col 9)",
        "(line 1668,col 9)-(line 1668,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.blockHeight(int)",
      "begin_line": 1676,
      "end_line": 1678,
      "comment": "\n     * Get the height of a block.\n     * @param blockRow row index (in block sense) of the block\n     * @return height (number of rows) of the block\n     ",
      "child_ranges": [
        "(line 1677,col 9)-(line 1677,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.blockWidth(int)",
      "begin_line": 1685,
      "end_line": 1687,
      "comment": "\n     * Get the width of a block.\n     * @param blockColumn column index (in block sense) of the block\n     * @return width (number of columns) of the block\n     ",
      "child_ranges": [
        "(line 1686,col 9)-(line 1686,col 99)"
      ]
    }
  ]
}