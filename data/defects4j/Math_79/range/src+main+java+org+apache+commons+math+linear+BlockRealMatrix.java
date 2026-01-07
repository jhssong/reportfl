{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/linear/BlockRealMatrix.java",
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
      "end_line": 1687,
      "comment": "\n * Cache-friendly implementation of RealMatrix using a flat arrays to store\n * square blocks of the matrix.\n * \u003cp\u003e\n * This implementation is specially designed to be cache-friendly. Square blocks are\n * stored as small arrays and allow efficient traversal of data both in row major direction\n * and columns major direction, one block at a time. This greatly increases performances\n * for algorithms that use crossed directions loops like multiplication or transposition.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The size of square blocks is a static parameter. It may be tuned according to the cache\n * size of the target computer processor. As a rule of thumbs, it should be the largest\n * value that allows three blocks to be simultaneously cached (this is necessary for example\n * for matrix multiplication). The default value is to use 52x52 blocks which is well suited\n * for processors with 64k L1 cache (one block holds 2704 values or 21632 bytes). This value\n * could be lowered to 36x36 for processors with 32k L1 cache.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The regular blocks represent {@link #BLOCK_SIZE} x {@link #BLOCK_SIZE} squares. Blocks\n * at right hand side and bottom side which may be smaller to fit matrix dimensions. The square\n * blocks are flattened in row major order in single dimension arrays which are therefore\n * {@link #BLOCK_SIZE}\u003csup\u003e2\u003c/sup\u003e elements long for regular blocks. The blocks are themselves\n * organized in row major order.\n * \u003c/p\u003e\n * \u003cp\u003e\n * As an example, for a block size of 52x52, a 100x60 matrix would be stored in 4 blocks.\n * Block 0 would be a double[2704] array holding the upper left 52x52 square, block 1 would be\n * a double[416] array holding the upper right 52x8 rectangle, block 2 would be a double[2496]\n * array holding the lower left 48x52 rectangle and block 3 would be a double[384] array\n * holding the lower right 48x8 rectangle.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The layout complexity overhead versus simple mapping of matrices to java\n * arrays is negligible for small matrices (about 1%). The gain from cache efficiency leads\n * to up to 3-fold improvements for matrices of moderate to large size.\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "BLOCK_SIZE"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Block size. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Serializable version identifier "
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
      "end_line": 251,
      "comment": "\n     * Convert a data array from raw layout to blocks layout.\n     * \u003cp\u003e\n     * Raw layout is the straightforward layout where element at row i and\n     * column j is in array element \u003ccode\u003erawData[i][j]\u003c/code\u003e. Blocks layout\n     * is the layout used in {@link BlockRealMatrix} instances, where the matrix\n     * is split in square blocks (except at right and bottom side where blocks may\n     * be rectangular to fit matrix size) and each block is stored in a flattened\n     * one-dimensional array.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method creates an array in blocks layout from an input array in raw layout.\n     * It can be used to provide the array argument of the {@link\n     * #BlockRealMatrix(int, int, double[][], boolean)} constructor.\n     * \u003c/p\u003e\n     * @param rawData data array in raw layout\n     * @return a new data array containing the same entries but in blocks layout\n     * @exception IllegalArgumentException if \u003ccode\u003erawData\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length)\n     * @see #createBlocksLayout(int, int)\n     * @see #BlockRealMatrix(int, int, double[][], boolean)\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 48)",
        "(line 207,col 9)-(line 207,col 51)",
        "(line 208,col 9)-(line 208,col 73)",
        "(line 209,col 9)-(line 209,col 73)",
        "(line 212,col 9)-(line 219,col 9)",
        "(line 222,col 9)-(line 222,col 73)",
        "(line 223,col 9)-(line 223,col 27)",
        "(line 224,col 9)-(line 247,col 9)",
        "(line 249,col 9)-(line 249,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.createBlocksLayout(int, int)",
      "begin_line": 265,
      "end_line": 287,
      "comment": "\n     * Create a data array in blocks layout.\n     * \u003cp\u003e\n     * This method can be used to create the array argument of the {@link\n     * #BlockRealMatrix(int, int, double[][], boolean)} constructor.\n     * \u003c/p\u003e\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @return a new data array in blocks layout\n     * @see #toBlocksLayout(double[][])\n     * @see #BlockRealMatrix(int, int, double[][], boolean)\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 73)",
        "(line 268,col 9)-(line 268,col 73)",
        "(line 270,col 9)-(line 270,col 73)",
        "(line 271,col 9)-(line 271,col 27)",
        "(line 272,col 9)-(line 283,col 9)",
        "(line 285,col 9)-(line 285,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.createMatrix(int, int)",
      "begin_line": 290,
      "end_line": 294,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.copy()",
      "begin_line": 297,
      "end_line": 310,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 68)",
        "(line 304,col 9)-(line 306,col 9)",
        "(line 308,col 9)-(line 308,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.add(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 313,
      "end_line": 354,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 316,col 9)-(line 353,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.add(org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 363,
      "end_line": 383,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 53)",
        "(line 369,col 9)-(line 369,col 71)",
        "(line 372,col 9)-(line 379,col 9)",
        "(line 381,col 9)-(line 381,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 386,
      "end_line": 427,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 389,col 9)-(line 426,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.subtract(org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 436,
      "end_line": 456,
      "comment": "\n     * Compute this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this - m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 56)",
        "(line 442,col 9)-(line 442,col 71)",
        "(line 445,col 9)-(line 452,col 9)",
        "(line 454,col 9)-(line 454,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.scalarAdd(double)",
      "begin_line": 459,
      "end_line": 476,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 71)",
        "(line 466,col 9)-(line 472,col 9)",
        "(line 474,col 9)-(line 474,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.scalarMultiply(double)",
      "begin_line": 479,
      "end_line": 496,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 71)",
        "(line 486,col 9)-(line 492,col 9)",
        "(line 494,col 9)-(line 494,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 499,
      "end_line": 557,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 502,col 9)-(line 556,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.multiply(org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 567,
      "end_line": 629,
      "comment": "\n     * Returns the result of postmultiplying this by m.\n     *\n     * @param m    matrix to postmultiply by\n     * @return     this * m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 59)",
        "(line 572,col 9)-(line 572,col 73)",
        "(line 575,col 9)-(line 575,col 27)",
        "(line 576,col 9)-(line 625,col 9)",
        "(line 627,col 9)-(line 627,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getData()",
      "begin_line": 632,
      "end_line": 659,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 84)",
        "(line 636,col 9)-(line 636,col 74)",
        "(line 638,col 9)-(line 655,col 9)",
        "(line 657,col 9)-(line 657,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getNorm()",
      "begin_line": 662,
      "end_line": 685,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 664,col 9)-(line 664,col 56)",
        "(line 665,col 9)-(line 665,col 29)",
        "(line 666,col 9)-(line 683,col 9)",
        "(line 684,col 9)-(line 684,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getFrobeniusNorm()",
      "begin_line": 688,
      "end_line": 697,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 24)",
        "(line 691,col 9)-(line 695,col 9)",
        "(line 696,col 9)-(line 696,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 700,
      "end_line": 798,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 706,col 9)-(line 706,col 88)",
        "(line 709,col 9)-(line 710,col 84)",
        "(line 713,col 9)-(line 713,col 62)",
        "(line 714,col 9)-(line 714,col 62)",
        "(line 715,col 9)-(line 715,col 62)",
        "(line 716,col 9)-(line 716,col 62)",
        "(line 719,col 9)-(line 719,col 35)",
        "(line 720,col 9)-(line 794,col 9)",
        "(line 796,col 9)-(line 796,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.copyBlockPart(double[], int, int, int, int, int, double[], int, int, int)",
      "begin_line": 815,
      "end_line": 828,
      "comment": "\n     * Copy a part of a block into another one\n     * \u003cp\u003eThis method can be called only when the specified part fits in both\n     * blocks, no verification is done here.\u003c/p\u003e\n     * @param srcBlock source block\n     * @param srcWidth source block width ({@link #BLOCK_SIZE} or smaller)\n     * @param srcStartRow start row in the source block\n     * @param srcEndRow end row (exclusive) in the source block\n     * @param srcStartColumn start column in the source block\n     * @param srcEndColumn end column (exclusive) in the source block\n     * @param dstBlock destination block\n     * @param dstWidth destination block width ({@link #BLOCK_SIZE} or smaller)\n     * @param dstStartRow start row in the destination block\n     * @param dstStartColumn start column in the destination block\n     ",
      "child_ranges": [
        "(line 820,col 9)-(line 820,col 57)",
        "(line 821,col 9)-(line 821,col 61)",
        "(line 822,col 9)-(line 822,col 61)",
        "(line 823,col 9)-(line 827,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 831,
      "end_line": 881,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 836,col 9)-(line 836,col 50)",
        "(line 837,col 9)-(line 839,col 9)",
        "(line 840,col 9)-(line 840,col 57)",
        "(line 841,col 9)-(line 841,col 53)",
        "(line 842,col 9)-(line 842,col 78)",
        "(line 843,col 9)-(line 849,col 9)",
        "(line 852,col 9)-(line 852,col 54)",
        "(line 853,col 9)-(line 853,col 72)",
        "(line 854,col 9)-(line 854,col 57)",
        "(line 855,col 9)-(line 855,col 75)",
        "(line 858,col 9)-(line 880,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getRowMatrix(int)",
      "begin_line": 884,
      "end_line": 914,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 888,col 9)-(line 888,col 45)",
        "(line 889,col 9)-(line 889,col 68)",
        "(line 892,col 9)-(line 892,col 45)",
        "(line 893,col 9)-(line 893,col 54)",
        "(line 894,col 9)-(line 894,col 30)",
        "(line 895,col 9)-(line 895,col 30)",
        "(line 896,col 9)-(line 896,col 54)",
        "(line 897,col 9)-(line 910,col 9)",
        "(line 912,col 9)-(line 912,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setRowMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 917,
      "end_line": 925,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 920,col 9)-(line 924,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setRowMatrix(int, org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 938,
      "end_line": 972,
      "comment": "\n     * Sets the entries in row number \u003ccode\u003erow\u003c/code\u003e\n     * as a row matrix.  Row indices start at 0.\n     *\n     * @param row the row to be set\n     * @param matrix row matrix (must have one row and the same number of columns\n     * as the instance)\n     * @throws MatrixIndexException if the specified row index is invalid\n     * @throws InvalidMatrixException if the matrix dimensions do not match one\n     * instance row\n     ",
      "child_ranges": [
        "(line 941,col 9)-(line 941,col 45)",
        "(line 942,col 9)-(line 942,col 47)",
        "(line 943,col 9)-(line 949,col 9)",
        "(line 952,col 9)-(line 952,col 44)",
        "(line 953,col 9)-(line 953,col 53)",
        "(line 954,col 9)-(line 954,col 29)",
        "(line 955,col 9)-(line 955,col 29)",
        "(line 956,col 9)-(line 956,col 54)",
        "(line 957,col 9)-(line 970,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getColumnMatrix(int)",
      "begin_line": 975,
      "end_line": 1003,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 979,col 9)-(line 979,col 51)",
        "(line 980,col 9)-(line 980,col 65)",
        "(line 983,col 9)-(line 983,col 48)",
        "(line 984,col 9)-(line 984,col 57)",
        "(line 985,col 9)-(line 985,col 47)",
        "(line 986,col 9)-(line 986,col 30)",
        "(line 987,col 9)-(line 987,col 30)",
        "(line 988,col 9)-(line 988,col 54)",
        "(line 989,col 9)-(line 999,col 9)",
        "(line 1001,col 9)-(line 1001,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1006,
      "end_line": 1014,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1009,col 9)-(line 1013,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 1027,
      "end_line": 1059,
      "comment": "\n     * Sets the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n     * as a column matrix.  Column indices start at 0.\n     *\n     * @param column the column to be set\n     * @param matrix column matrix (must have one column and the same number of rows\n     * as the instance)\n     * @throws MatrixIndexException if the specified column index is invalid\n     * @throws InvalidMatrixException if the matrix dimensions do not match one\n     * instance column\n     ",
      "child_ranges": [
        "(line 1030,col 9)-(line 1030,col 51)",
        "(line 1031,col 9)-(line 1031,col 44)",
        "(line 1032,col 9)-(line 1038,col 9)",
        "(line 1041,col 9)-(line 1041,col 48)",
        "(line 1042,col 9)-(line 1042,col 57)",
        "(line 1043,col 9)-(line 1043,col 47)",
        "(line 1044,col 9)-(line 1044,col 28)",
        "(line 1045,col 9)-(line 1045,col 28)",
        "(line 1046,col 9)-(line 1046,col 53)",
        "(line 1047,col 9)-(line 1057,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getRowVector(int)",
      "begin_line": 1062,
      "end_line": 1082,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1066,col 9)-(line 1066,col 45)",
        "(line 1067,col 9)-(line 1067,col 53)",
        "(line 1070,col 9)-(line 1070,col 45)",
        "(line 1071,col 9)-(line 1071,col 54)",
        "(line 1072,col 9)-(line 1072,col 30)",
        "(line 1073,col 9)-(line 1078,col 9)",
        "(line 1080,col 9)-(line 1080,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setRowVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1085,
      "end_line": 1093,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1088,col 9)-(line 1092,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getColumnVector(int)",
      "begin_line": 1096,
      "end_line": 1118,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1100,col 9)-(line 1100,col 51)",
        "(line 1101,col 9)-(line 1101,col 50)",
        "(line 1104,col 9)-(line 1104,col 48)",
        "(line 1105,col 9)-(line 1105,col 57)",
        "(line 1106,col 9)-(line 1106,col 47)",
        "(line 1107,col 9)-(line 1107,col 30)",
        "(line 1108,col 9)-(line 1114,col 9)",
        "(line 1116,col 9)-(line 1116,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setColumnVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1121,
      "end_line": 1129,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1124,col 9)-(line 1128,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getRow(int)",
      "begin_line": 1132,
      "end_line": 1152,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1136,col 9)-(line 1136,col 45)",
        "(line 1137,col 9)-(line 1137,col 49)",
        "(line 1140,col 9)-(line 1140,col 45)",
        "(line 1141,col 9)-(line 1141,col 54)",
        "(line 1142,col 9)-(line 1142,col 30)",
        "(line 1143,col 9)-(line 1148,col 9)",
        "(line 1150,col 9)-(line 1150,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setRow(int, double[])",
      "begin_line": 1155,
      "end_line": 1178,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1159,col 9)-(line 1159,col 45)",
        "(line 1160,col 9)-(line 1160,col 47)",
        "(line 1161,col 9)-(line 1165,col 9)",
        "(line 1168,col 9)-(line 1168,col 45)",
        "(line 1169,col 9)-(line 1169,col 54)",
        "(line 1170,col 9)-(line 1170,col 30)",
        "(line 1171,col 9)-(line 1176,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getColumn(int)",
      "begin_line": 1181,
      "end_line": 1203,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1185,col 9)-(line 1185,col 51)",
        "(line 1186,col 9)-(line 1186,col 46)",
        "(line 1189,col 9)-(line 1189,col 48)",
        "(line 1190,col 9)-(line 1190,col 57)",
        "(line 1191,col 9)-(line 1191,col 47)",
        "(line 1192,col 9)-(line 1192,col 30)",
        "(line 1193,col 9)-(line 1199,col 9)",
        "(line 1201,col 9)-(line 1201,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setColumn(int, double[])",
      "begin_line": 1206,
      "end_line": 1231,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1210,col 9)-(line 1210,col 51)",
        "(line 1211,col 9)-(line 1211,col 44)",
        "(line 1212,col 9)-(line 1216,col 9)",
        "(line 1219,col 9)-(line 1219,col 48)",
        "(line 1220,col 9)-(line 1220,col 57)",
        "(line 1221,col 9)-(line 1221,col 47)",
        "(line 1222,col 9)-(line 1222,col 30)",
        "(line 1223,col 9)-(line 1229,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getEntry(int, int)",
      "begin_line": 1234,
      "end_line": 1248,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1237,col 9)-(line 1247,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setEntry(int, int, double)",
      "begin_line": 1251,
      "end_line": 1265,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1254,col 9)-(line 1264,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.addToEntry(int, int, double)",
      "begin_line": 1268,
      "end_line": 1282,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1271,col 9)-(line 1281,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 1285,
      "end_line": 1299,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1288,col 9)-(line 1298,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.transpose()",
      "begin_line": 1302,
      "end_line": 1340,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1305,col 9)-(line 1305,col 44)",
        "(line 1306,col 9)-(line 1306,col 47)",
        "(line 1307,col 9)-(line 1307,col 70)",
        "(line 1310,col 9)-(line 1310,col 27)",
        "(line 1311,col 9)-(line 1336,col 9)",
        "(line 1338,col 9)-(line 1338,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getRowDimension()",
      "begin_line": 1343,
      "end_line": 1346,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1345,col 9)-(line 1345,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getColumnDimension()",
      "begin_line": 1349,
      "end_line": 1352,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1351,col 9)-(line 1351,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.operate(double[])",
      "begin_line": 1355,
      "end_line": 1396,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1359,col 9)-(line 1363,col 9)",
        "(line 1364,col 9)-(line 1364,col 46)",
        "(line 1367,col 9)-(line 1392,col 9)",
        "(line 1394,col 9)-(line 1394,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.preMultiply(double[])",
      "begin_line": 1399,
      "end_line": 1445,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1403,col 9)-(line 1407,col 9)",
        "(line 1408,col 9)-(line 1408,col 49)",
        "(line 1411,col 9)-(line 1441,col 9)",
        "(line 1443,col 9)-(line 1443,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 1448,
      "end_line": 1470,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1451,col 9)-(line 1451,col 66)",
        "(line 1452,col 9)-(line 1468,col 9)",
        "(line 1469,col 9)-(line 1469,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 1473,
      "end_line": 1495,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1476,col 9)-(line 1476,col 66)",
        "(line 1477,col 9)-(line 1493,col 9)",
        "(line 1494,col 9)-(line 1494,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 1498,
      "end_line": 1525,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1503,col 9)-(line 1503,col 88)",
        "(line 1504,col 9)-(line 1504,col 79)",
        "(line 1505,col 9)-(line 1523,col 9)",
        "(line 1524,col 9)-(line 1524,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 1528,
      "end_line": 1555,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1533,col 9)-(line 1533,col 88)",
        "(line 1534,col 9)-(line 1534,col 79)",
        "(line 1535,col 9)-(line 1553,col 9)",
        "(line 1554,col 9)-(line 1554,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 1558,
      "end_line": 1581,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1561,col 9)-(line 1561,col 66)",
        "(line 1562,col 9)-(line 1562,col 27)",
        "(line 1563,col 9)-(line 1579,col 9)",
        "(line 1580,col 9)-(line 1580,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 1584,
      "end_line": 1607,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1587,col 9)-(line 1587,col 66)",
        "(line 1588,col 9)-(line 1588,col 27)",
        "(line 1589,col 9)-(line 1605,col 9)",
        "(line 1606,col 9)-(line 1606,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 1610,
      "end_line": 1637,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1615,col 9)-(line 1615,col 88)",
        "(line 1616,col 9)-(line 1616,col 79)",
        "(line 1617,col 9)-(line 1635,col 9)",
        "(line 1636,col 9)-(line 1636,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 1640,
      "end_line": 1667,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1645,col 9)-(line 1645,col 88)",
        "(line 1646,col 9)-(line 1646,col 79)",
        "(line 1647,col 9)-(line 1665,col 9)",
        "(line 1666,col 9)-(line 1666,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.blockHeight(int)",
      "begin_line": 1674,
      "end_line": 1676,
      "comment": "\n     * Get the height of a block.\n     * @param blockRow row index (in block sense) of the block\n     * @return height (number of rows) of the block\n     ",
      "child_ranges": [
        "(line 1675,col 9)-(line 1675,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.blockWidth(int)",
      "begin_line": 1683,
      "end_line": 1685,
      "comment": "\n     * Get the width of a block.\n     * @param blockColumn column index (in block sense) of the block\n     * @return width (number of columns) of the block\n     ",
      "child_ranges": [
        "(line 1684,col 9)-(line 1684,col 99)"
      ]
    }
  ]
}