{
  "filepath": "/tmp/Math-64b/src/main/java/org/apache/commons/math/linear/BlockRealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BlockRealMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.AbstractRealMatrix",
        "java.io.Serializable"
      ],
      "begin_line": 65,
      "end_line": 1688,
      "comment": "\n * Cache-friendly implementation of RealMatrix using a flat arrays to store\n * square blocks of the matrix.\n * \u003cp\u003e\n * This implementation is specially designed to be cache-friendly. Square blocks are\n * stored as small arrays and allow efficient traversal of data both in row major direction\n * and columns major direction, one block at a time. This greatly increases performances\n * for algorithms that use crossed directions loops like multiplication or transposition.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The size of square blocks is a static parameter. It may be tuned according to the cache\n * size of the target computer processor. As a rule of thumbs, it should be the largest\n * value that allows three blocks to be simultaneously cached (this is necessary for example\n * for matrix multiplication). The default value is to use 52x52 blocks which is well suited\n * for processors with 64k L1 cache (one block holds 2704 values or 21632 bytes). This value\n * could be lowered to 36x36 for processors with 32k L1 cache.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The regular blocks represent {@link #BLOCK_SIZE} x {@link #BLOCK_SIZE} squares. Blocks\n * at right hand side and bottom side which may be smaller to fit matrix dimensions. The square\n * blocks are flattened in row major order in single dimension arrays which are therefore\n * {@link #BLOCK_SIZE}\u003csup\u003e2\u003c/sup\u003e elements long for regular blocks. The blocks are themselves\n * organized in row major order.\n * \u003c/p\u003e\n * \u003cp\u003e\n * As an example, for a block size of 52x52, a 100x60 matrix would be stored in 4 blocks.\n * Block 0 would be a double[2704] array holding the upper left 52x52 square, block 1 would be\n * a double[416] array holding the upper right 52x8 rectangle, block 2 would be a double[2496]\n * array holding the lower left 48x52 rectangle and block 3 would be a double[384] array\n * holding the lower right 48x8 rectangle.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The layout complexity overhead versus simple mapping of matrices to java\n * arrays is negligible for small matrices (about 1%). The gain from cache efficiency leads\n * to up to 3-fold improvements for matrices of moderate to large size.\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "BLOCK_SIZE"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Block size. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "blocks"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Blocks of matrix entries. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Number of rows of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "columns"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Number of columns of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "blockRows"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Number of block rows of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "blockColumns"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Number of block columns of the matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.BlockRealMatrix(int, int)",
      "begin_line": 96,
      "end_line": 110,
      "comment": "\n     * Create a new matrix with the supplied row and column dimensions.\n     *\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @throws IllegalArgumentException if row or column dimension is not\n     *  positive\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 29)",
        "(line 100,col 9)-(line 100,col 28)",
        "(line 101,col 9)-(line 101,col 31)",
        "(line 104,col 9)-(line 104,col 63)",
        "(line 105,col 9)-(line 105,col 63)",
        "(line 108,col 9)-(line 108,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.BlockRealMatrix(double[][])",
      "begin_line": 125,
      "end_line": 128,
      "comment": "\n     * Create a new dense matrix copying entries from raw layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in raw layout.\u003c/p\u003e\n     * \u003cp\u003eCalling this constructor is equivalent to call:\n     * \u003cpre\u003ematrix \u003d new BlockRealMatrix(rawData.length, rawData[0].length,\n     *                                   toBlocksLayout(rawData), false);\u003c/pre\u003e\n     * \u003c/p\u003e\n     * @param rawData data for new matrix, in raw layout\n     *\n     * @exception IllegalArgumentException if \u003ccode\u003eblockData\u003c/code\u003e shape is\n     * inconsistent with block layout\n     * @see #BlockRealMatrix(int, int, double[][], boolean)\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 80)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.BlockRealMatrix(int, int, double[][], boolean)",
      "begin_line": 145,
      "end_line": 180,
      "comment": "\n     * Create a new dense matrix copying entries from block layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in blocks layout.\u003c/p\u003e\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @param blockData data for new matrix\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     *\n     * @exception IllegalArgumentException if \u003ccode\u003eblockData\u003c/code\u003e shape is\n     * inconsistent with block layout\n     * @see #createBlocksLayout(int, int)\n     * @see #toBlocksLayout(double[][])\n     * @see #BlockRealMatrix(double[][])\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 29)",
        "(line 150,col 9)-(line 150,col 28)",
        "(line 151,col 9)-(line 151,col 31)",
        "(line 154,col 9)-(line 154,col 63)",
        "(line 155,col 9)-(line 155,col 63)",
        "(line 157,col 9)-(line 163,col 9)",
        "(line 165,col 9)-(line 165,col 22)",
        "(line 166,col 9)-(line 178,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.toBlocksLayout(double[][])",
      "begin_line": 204,
      "end_line": 252,
      "comment": "\n     * Convert a data array from raw layout to blocks layout.\n     * \u003cp\u003e\n     * Raw layout is the straightforward layout where element at row i and\n     * column j is in array element \u003ccode\u003erawData[i][j]\u003c/code\u003e. Blocks layout\n     * is the layout used in {@link BlockRealMatrix} instances, where the matrix\n     * is split in square blocks (except at right and bottom side where blocks may\n     * be rectangular to fit matrix size) and each block is stored in a flattened\n     * one-dimensional array.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method creates an array in blocks layout from an input array in raw layout.\n     * It can be used to provide the array argument of the {@link\n     * #BlockRealMatrix(int, int, double[][], boolean)} constructor.\n     * \u003c/p\u003e\n     * @param rawData data array in raw layout\n     * @return a new data array containing the same entries but in blocks layout\n     * @exception IllegalArgumentException if \u003ccode\u003erawData\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length)\n     * @see #createBlocksLayout(int, int)\n     * @see #BlockRealMatrix(int, int, double[][], boolean)\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 48)",
        "(line 208,col 9)-(line 208,col 51)",
        "(line 209,col 9)-(line 209,col 73)",
        "(line 210,col 9)-(line 210,col 73)",
        "(line 213,col 9)-(line 220,col 9)",
        "(line 223,col 9)-(line 223,col 73)",
        "(line 224,col 9)-(line 224,col 27)",
        "(line 225,col 9)-(line 248,col 9)",
        "(line 250,col 9)-(line 250,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.createBlocksLayout(int, int)",
      "begin_line": 266,
      "end_line": 288,
      "comment": "\n     * Create a data array in blocks layout.\n     * \u003cp\u003e\n     * This method can be used to create the array argument of the {@link\n     * #BlockRealMatrix(int, int, double[][], boolean)} constructor.\n     * \u003c/p\u003e\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @return a new data array in blocks layout\n     * @see #toBlocksLayout(double[][])\n     * @see #BlockRealMatrix(int, int, double[][], boolean)\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 73)",
        "(line 269,col 9)-(line 269,col 73)",
        "(line 271,col 9)-(line 271,col 73)",
        "(line 272,col 9)-(line 272,col 27)",
        "(line 273,col 9)-(line 284,col 9)",
        "(line 286,col 9)-(line 286,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.createMatrix(int, int)",
      "begin_line": 291,
      "end_line": 295,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.copy()",
      "begin_line": 298,
      "end_line": 311,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 68)",
        "(line 305,col 9)-(line 307,col 9)",
        "(line 309,col 9)-(line 309,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.add(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 314,
      "end_line": 355,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 317,col 9)-(line 354,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.add(org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 364,
      "end_line": 384,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 53)",
        "(line 370,col 9)-(line 370,col 71)",
        "(line 373,col 9)-(line 380,col 9)",
        "(line 382,col 9)-(line 382,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 387,
      "end_line": 428,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 390,col 9)-(line 427,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.subtract(org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 437,
      "end_line": 457,
      "comment": "\n     * Compute this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this - m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 56)",
        "(line 443,col 9)-(line 443,col 71)",
        "(line 446,col 9)-(line 453,col 9)",
        "(line 455,col 9)-(line 455,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.scalarAdd(double)",
      "begin_line": 460,
      "end_line": 477,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 71)",
        "(line 467,col 9)-(line 473,col 9)",
        "(line 475,col 9)-(line 475,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.scalarMultiply(double)",
      "begin_line": 480,
      "end_line": 497,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 71)",
        "(line 487,col 9)-(line 493,col 9)",
        "(line 495,col 9)-(line 495,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 500,
      "end_line": 558,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 503,col 9)-(line 557,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.multiply(org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 568,
      "end_line": 630,
      "comment": "\n     * Returns the result of postmultiplying this by m.\n     *\n     * @param m    matrix to postmultiply by\n     * @return     this * m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 571,col 9)-(line 571,col 59)",
        "(line 573,col 9)-(line 573,col 73)",
        "(line 576,col 9)-(line 576,col 27)",
        "(line 577,col 9)-(line 626,col 9)",
        "(line 628,col 9)-(line 628,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getData()",
      "begin_line": 633,
      "end_line": 660,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 84)",
        "(line 637,col 9)-(line 637,col 74)",
        "(line 639,col 9)-(line 656,col 9)",
        "(line 658,col 9)-(line 658,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getNorm()",
      "begin_line": 663,
      "end_line": 686,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 56)",
        "(line 666,col 9)-(line 666,col 29)",
        "(line 667,col 9)-(line 684,col 9)",
        "(line 685,col 9)-(line 685,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getFrobeniusNorm()",
      "begin_line": 689,
      "end_line": 698,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 691,col 9)-(line 691,col 24)",
        "(line 692,col 9)-(line 696,col 9)",
        "(line 697,col 9)-(line 697,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 701,
      "end_line": 799,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 707,col 9)-(line 707,col 88)",
        "(line 710,col 9)-(line 711,col 84)",
        "(line 714,col 9)-(line 714,col 62)",
        "(line 715,col 9)-(line 715,col 62)",
        "(line 716,col 9)-(line 716,col 62)",
        "(line 717,col 9)-(line 717,col 62)",
        "(line 720,col 9)-(line 720,col 35)",
        "(line 721,col 9)-(line 795,col 9)",
        "(line 797,col 9)-(line 797,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.copyBlockPart(double[], int, int, int, int, int, double[], int, int, int)",
      "begin_line": 816,
      "end_line": 829,
      "comment": "\n     * Copy a part of a block into another one\n     * \u003cp\u003eThis method can be called only when the specified part fits in both\n     * blocks, no verification is done here.\u003c/p\u003e\n     * @param srcBlock source block\n     * @param srcWidth source block width ({@link #BLOCK_SIZE} or smaller)\n     * @param srcStartRow start row in the source block\n     * @param srcEndRow end row (exclusive) in the source block\n     * @param srcStartColumn start column in the source block\n     * @param srcEndColumn end column (exclusive) in the source block\n     * @param dstBlock destination block\n     * @param dstWidth destination block width ({@link #BLOCK_SIZE} or smaller)\n     * @param dstStartRow start row in the destination block\n     * @param dstStartColumn start column in the destination block\n     ",
      "child_ranges": [
        "(line 821,col 9)-(line 821,col 57)",
        "(line 822,col 9)-(line 822,col 61)",
        "(line 823,col 9)-(line 823,col 61)",
        "(line 824,col 9)-(line 828,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 832,
      "end_line": 882,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 837,col 9)-(line 837,col 50)",
        "(line 838,col 9)-(line 840,col 9)",
        "(line 841,col 9)-(line 841,col 57)",
        "(line 842,col 9)-(line 842,col 53)",
        "(line 843,col 9)-(line 843,col 78)",
        "(line 844,col 9)-(line 850,col 9)",
        "(line 853,col 9)-(line 853,col 54)",
        "(line 854,col 9)-(line 854,col 72)",
        "(line 855,col 9)-(line 855,col 57)",
        "(line 856,col 9)-(line 856,col 75)",
        "(line 859,col 9)-(line 881,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getRowMatrix(int)",
      "begin_line": 885,
      "end_line": 915,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 889,col 9)-(line 889,col 45)",
        "(line 890,col 9)-(line 890,col 68)",
        "(line 893,col 9)-(line 893,col 45)",
        "(line 894,col 9)-(line 894,col 54)",
        "(line 895,col 9)-(line 895,col 30)",
        "(line 896,col 9)-(line 896,col 30)",
        "(line 897,col 9)-(line 897,col 54)",
        "(line 898,col 9)-(line 911,col 9)",
        "(line 913,col 9)-(line 913,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setRowMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 918,
      "end_line": 926,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 921,col 9)-(line 925,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setRowMatrix(int, org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 939,
      "end_line": 973,
      "comment": "\n     * Sets the entries in row number \u003ccode\u003erow\u003c/code\u003e\n     * as a row matrix.  Row indices start at 0.\n     *\n     * @param row the row to be set\n     * @param matrix row matrix (must have one row and the same number of columns\n     * as the instance)\n     * @throws MatrixIndexException if the specified row index is invalid\n     * @throws InvalidMatrixException if the matrix dimensions do not match one\n     * instance row\n     ",
      "child_ranges": [
        "(line 942,col 9)-(line 942,col 45)",
        "(line 943,col 9)-(line 943,col 47)",
        "(line 944,col 9)-(line 950,col 9)",
        "(line 953,col 9)-(line 953,col 44)",
        "(line 954,col 9)-(line 954,col 53)",
        "(line 955,col 9)-(line 955,col 29)",
        "(line 956,col 9)-(line 956,col 29)",
        "(line 957,col 9)-(line 957,col 54)",
        "(line 958,col 9)-(line 971,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getColumnMatrix(int)",
      "begin_line": 976,
      "end_line": 1004,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 980,col 9)-(line 980,col 51)",
        "(line 981,col 9)-(line 981,col 65)",
        "(line 984,col 9)-(line 984,col 48)",
        "(line 985,col 9)-(line 985,col 57)",
        "(line 986,col 9)-(line 986,col 47)",
        "(line 987,col 9)-(line 987,col 30)",
        "(line 988,col 9)-(line 988,col 30)",
        "(line 989,col 9)-(line 989,col 54)",
        "(line 990,col 9)-(line 1000,col 9)",
        "(line 1002,col 9)-(line 1002,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1007,
      "end_line": 1015,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1010,col 9)-(line 1014,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 1028,
      "end_line": 1060,
      "comment": "\n     * Sets the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n     * as a column matrix.  Column indices start at 0.\n     *\n     * @param column the column to be set\n     * @param matrix column matrix (must have one column and the same number of rows\n     * as the instance)\n     * @throws MatrixIndexException if the specified column index is invalid\n     * @throws InvalidMatrixException if the matrix dimensions do not match one\n     * instance column\n     ",
      "child_ranges": [
        "(line 1031,col 9)-(line 1031,col 51)",
        "(line 1032,col 9)-(line 1032,col 44)",
        "(line 1033,col 9)-(line 1039,col 9)",
        "(line 1042,col 9)-(line 1042,col 48)",
        "(line 1043,col 9)-(line 1043,col 57)",
        "(line 1044,col 9)-(line 1044,col 47)",
        "(line 1045,col 9)-(line 1045,col 28)",
        "(line 1046,col 9)-(line 1046,col 28)",
        "(line 1047,col 9)-(line 1047,col 53)",
        "(line 1048,col 9)-(line 1058,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getRowVector(int)",
      "begin_line": 1063,
      "end_line": 1083,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1067,col 9)-(line 1067,col 45)",
        "(line 1068,col 9)-(line 1068,col 53)",
        "(line 1071,col 9)-(line 1071,col 45)",
        "(line 1072,col 9)-(line 1072,col 54)",
        "(line 1073,col 9)-(line 1073,col 30)",
        "(line 1074,col 9)-(line 1079,col 9)",
        "(line 1081,col 9)-(line 1081,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setRowVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1086,
      "end_line": 1094,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1089,col 9)-(line 1093,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getColumnVector(int)",
      "begin_line": 1097,
      "end_line": 1119,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1101,col 9)-(line 1101,col 51)",
        "(line 1102,col 9)-(line 1102,col 50)",
        "(line 1105,col 9)-(line 1105,col 48)",
        "(line 1106,col 9)-(line 1106,col 57)",
        "(line 1107,col 9)-(line 1107,col 47)",
        "(line 1108,col 9)-(line 1108,col 30)",
        "(line 1109,col 9)-(line 1115,col 9)",
        "(line 1117,col 9)-(line 1117,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setColumnVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1122,
      "end_line": 1130,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1125,col 9)-(line 1129,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getRow(int)",
      "begin_line": 1133,
      "end_line": 1153,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1137,col 9)-(line 1137,col 45)",
        "(line 1138,col 9)-(line 1138,col 49)",
        "(line 1141,col 9)-(line 1141,col 45)",
        "(line 1142,col 9)-(line 1142,col 54)",
        "(line 1143,col 9)-(line 1143,col 30)",
        "(line 1144,col 9)-(line 1149,col 9)",
        "(line 1151,col 9)-(line 1151,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setRow(int, double[])",
      "begin_line": 1156,
      "end_line": 1179,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1160,col 9)-(line 1160,col 45)",
        "(line 1161,col 9)-(line 1161,col 47)",
        "(line 1162,col 9)-(line 1166,col 9)",
        "(line 1169,col 9)-(line 1169,col 45)",
        "(line 1170,col 9)-(line 1170,col 54)",
        "(line 1171,col 9)-(line 1171,col 30)",
        "(line 1172,col 9)-(line 1177,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getColumn(int)",
      "begin_line": 1182,
      "end_line": 1204,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1186,col 9)-(line 1186,col 51)",
        "(line 1187,col 9)-(line 1187,col 46)",
        "(line 1190,col 9)-(line 1190,col 48)",
        "(line 1191,col 9)-(line 1191,col 57)",
        "(line 1192,col 9)-(line 1192,col 47)",
        "(line 1193,col 9)-(line 1193,col 30)",
        "(line 1194,col 9)-(line 1200,col 9)",
        "(line 1202,col 9)-(line 1202,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setColumn(int, double[])",
      "begin_line": 1207,
      "end_line": 1232,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1211,col 9)-(line 1211,col 51)",
        "(line 1212,col 9)-(line 1212,col 44)",
        "(line 1213,col 9)-(line 1217,col 9)",
        "(line 1220,col 9)-(line 1220,col 48)",
        "(line 1221,col 9)-(line 1221,col 57)",
        "(line 1222,col 9)-(line 1222,col 47)",
        "(line 1223,col 9)-(line 1223,col 30)",
        "(line 1224,col 9)-(line 1230,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getEntry(int, int)",
      "begin_line": 1235,
      "end_line": 1249,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1238,col 9)-(line 1248,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setEntry(int, int, double)",
      "begin_line": 1252,
      "end_line": 1266,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1255,col 9)-(line 1265,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.addToEntry(int, int, double)",
      "begin_line": 1269,
      "end_line": 1283,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1272,col 9)-(line 1282,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 1286,
      "end_line": 1300,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1289,col 9)-(line 1299,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.transpose()",
      "begin_line": 1303,
      "end_line": 1341,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1306,col 9)-(line 1306,col 44)",
        "(line 1307,col 9)-(line 1307,col 47)",
        "(line 1308,col 9)-(line 1308,col 70)",
        "(line 1311,col 9)-(line 1311,col 27)",
        "(line 1312,col 9)-(line 1337,col 9)",
        "(line 1339,col 9)-(line 1339,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getRowDimension()",
      "begin_line": 1344,
      "end_line": 1347,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1346,col 9)-(line 1346,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getColumnDimension()",
      "begin_line": 1350,
      "end_line": 1353,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1352,col 9)-(line 1352,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.operate(double[])",
      "begin_line": 1356,
      "end_line": 1397,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1360,col 9)-(line 1364,col 9)",
        "(line 1365,col 9)-(line 1365,col 46)",
        "(line 1368,col 9)-(line 1393,col 9)",
        "(line 1395,col 9)-(line 1395,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.preMultiply(double[])",
      "begin_line": 1400,
      "end_line": 1446,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1404,col 9)-(line 1408,col 9)",
        "(line 1409,col 9)-(line 1409,col 49)",
        "(line 1412,col 9)-(line 1442,col 9)",
        "(line 1444,col 9)-(line 1444,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 1449,
      "end_line": 1471,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1452,col 9)-(line 1452,col 66)",
        "(line 1453,col 9)-(line 1469,col 9)",
        "(line 1470,col 9)-(line 1470,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 1474,
      "end_line": 1496,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1477,col 9)-(line 1477,col 66)",
        "(line 1478,col 9)-(line 1494,col 9)",
        "(line 1495,col 9)-(line 1495,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 1499,
      "end_line": 1526,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1504,col 9)-(line 1504,col 88)",
        "(line 1505,col 9)-(line 1505,col 79)",
        "(line 1506,col 9)-(line 1524,col 9)",
        "(line 1525,col 9)-(line 1525,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 1529,
      "end_line": 1556,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1534,col 9)-(line 1534,col 88)",
        "(line 1535,col 9)-(line 1535,col 79)",
        "(line 1536,col 9)-(line 1554,col 9)",
        "(line 1555,col 9)-(line 1555,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 1559,
      "end_line": 1582,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1562,col 9)-(line 1562,col 66)",
        "(line 1563,col 9)-(line 1563,col 27)",
        "(line 1564,col 9)-(line 1580,col 9)",
        "(line 1581,col 9)-(line 1581,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 1585,
      "end_line": 1608,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1588,col 9)-(line 1588,col 66)",
        "(line 1589,col 9)-(line 1589,col 27)",
        "(line 1590,col 9)-(line 1606,col 9)",
        "(line 1607,col 9)-(line 1607,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 1611,
      "end_line": 1638,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1616,col 9)-(line 1616,col 88)",
        "(line 1617,col 9)-(line 1617,col 79)",
        "(line 1618,col 9)-(line 1636,col 9)",
        "(line 1637,col 9)-(line 1637,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 1641,
      "end_line": 1668,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1646,col 9)-(line 1646,col 88)",
        "(line 1647,col 9)-(line 1647,col 79)",
        "(line 1648,col 9)-(line 1666,col 9)",
        "(line 1667,col 9)-(line 1667,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.blockHeight(int)",
      "begin_line": 1675,
      "end_line": 1677,
      "comment": "\n     * Get the height of a block.\n     * @param blockRow row index (in block sense) of the block\n     * @return height (number of rows) of the block\n     ",
      "child_ranges": [
        "(line 1676,col 9)-(line 1676,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.blockWidth(int)",
      "begin_line": 1684,
      "end_line": 1686,
      "comment": "\n     * Get the width of a block.\n     * @param blockColumn column index (in block sense) of the block\n     * @return width (number of columns) of the block\n     ",
      "child_ranges": [
        "(line 1685,col 9)-(line 1685,col 99)"
      ]
    }
  ]
}