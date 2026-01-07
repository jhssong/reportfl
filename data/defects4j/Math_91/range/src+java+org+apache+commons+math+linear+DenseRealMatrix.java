{
  "filepath": "/tmp/Math-91b/src/java/org/apache/commons/math/linear/DenseRealMatrix.java",
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
      "end_line": 1597,
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
      "end_line": 179,
      "comment": "\n     * Create a new dense matrix copying entries from block layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in blocks layout.\u003c/p\u003e\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @param blockData data for new matrix\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     *\n     * @exception IllegalArgumentException if \u003ccode\u003eblockData\u003c/code\u003e shape is\n     * inconsistent with block layout\n     * @see #createBlocksLayout(int, int)\n     * @see #toBlocksLayout(double[][])\n     * @see #DenseRealMatrix(double[][])\n     ",
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
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.toBlocksLayout(double[][])",
      "begin_line": 203,
      "end_line": 246,
      "comment": "\n     * Convert a data array from raw layout to blocks layout.\n     * \u003cp\u003e\n     * Raw layout is the straightforward layout where element at row i and\n     * column j is in array element \u003ccode\u003erawData[i][j]\u003c/code\u003e. Blocks layout\n     * is the layout used in {@link DenseRealMatrix} instances, where the matrix\n     * is split in square blocks (except at right and bottom side where blocks may\n     * be rectangular to fit matrix size) and each block is stored in a flattened\n     * one-dimensional array.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method creates an array in blocks layout from an input array in raw layout.\n     * It can be used to provide the array argument of the {@link\n     * DenseRealMatrix#DenseRealMatrix(int, int, double[][], boolean)} constructor.\n     * \u003c/p\u003e\n     * @param rawData data array in raw layout\n     * @return a new data array containing the same entries but in blocks layout\n     * @exception IllegalArgumentException if \u003ccode\u003erawData\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length)\n     * @see #createBlocksLayout(int, int)\n     * @see #DenseRealMatrix(int, int, double[][], boolean)\n     ",
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
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.createBlocksLayout(int, int)",
      "begin_line": 260,
      "end_line": 280,
      "comment": "\n     * Create a data array in blocks layout.\n     * \u003cp\u003e\n     * This method can be used to create the array argument of the {@link\n     * DenseRealMatrix#DenseRealMatrix(int, int, double[][], boolean)} constructor.\n     * \u003c/p\u003e\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @return a new data array in blocks layout\n     * @see #toBlocksLayout(double[][])\n     * @see #DenseRealMatrix(int, int, double[][], boolean)\n     ",
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
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.createMatrix(int, int)",
      "begin_line": 283,
      "end_line": 286,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.copy()",
      "begin_line": 289,
      "end_line": 301,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 68)",
        "(line 295,col 9)-(line 297,col 9)",
        "(line 299,col 9)-(line 299,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.add(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 304,
      "end_line": 342,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 306,col 9)-(line 341,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.add(org.apache.commons.math.linear.DenseRealMatrix)",
      "begin_line": 351,
      "end_line": 371,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 35)",
        "(line 357,col 9)-(line 357,col 71)",
        "(line 360,col 9)-(line 367,col 9)",
        "(line 369,col 9)-(line 369,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 374,
      "end_line": 412,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 376,col 9)-(line 411,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.subtract(org.apache.commons.math.linear.DenseRealMatrix)",
      "begin_line": 421,
      "end_line": 441,
      "comment": "\n     * Compute this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this - m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 38)",
        "(line 427,col 9)-(line 427,col 71)",
        "(line 430,col 9)-(line 437,col 9)",
        "(line 439,col 9)-(line 439,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.scalarAdd(double)",
      "begin_line": 444,
      "end_line": 460,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 71)",
        "(line 450,col 9)-(line 456,col 9)",
        "(line 458,col 9)-(line 458,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.scalarMultiply(double)",
      "begin_line": 463,
      "end_line": 479,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 71)",
        "(line 469,col 9)-(line 475,col 9)",
        "(line 477,col 9)-(line 477,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 482,
      "end_line": 535,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 484,col 9)-(line 534,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.multiply(org.apache.commons.math.linear.DenseRealMatrix)",
      "begin_line": 545,
      "end_line": 605,
      "comment": "\n     * Returns the result of postmultiplying this by m.\n     *\n     * @param m    matrix to postmultiply by\n     * @return     this * m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 41)",
        "(line 550,col 9)-(line 550,col 73)",
        "(line 553,col 9)-(line 553,col 27)",
        "(line 554,col 9)-(line 601,col 9)",
        "(line 603,col 9)-(line 603,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.getData()",
      "begin_line": 608,
      "end_line": 634,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 84)",
        "(line 611,col 9)-(line 611,col 74)",
        "(line 613,col 9)-(line 630,col 9)",
        "(line 632,col 9)-(line 632,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.getNorm()",
      "begin_line": 637,
      "end_line": 659,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 638,col 9)-(line 638,col 56)",
        "(line 639,col 9)-(line 639,col 29)",
        "(line 640,col 9)-(line 657,col 9)",
        "(line 658,col 9)-(line 658,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.getFrobeniusNorm()",
      "begin_line": 662,
      "end_line": 670,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 663,col 9)-(line 663,col 24)",
        "(line 664,col 9)-(line 668,col 9)",
        "(line 669,col 9)-(line 669,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 673,
      "end_line": 763,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 70)",
        "(line 681,col 9)-(line 682,col 84)",
        "(line 685,col 9)-(line 685,col 62)",
        "(line 686,col 9)-(line 686,col 62)",
        "(line 687,col 9)-(line 687,col 62)",
        "(line 688,col 9)-(line 688,col 62)",
        "(line 691,col 9)-(line 759,col 9)",
        "(line 761,col 9)-(line 761,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.copyBlockPart(double[], int, int, int, int, int, double[], int, int, int)",
      "begin_line": 780,
      "end_line": 793,
      "comment": "\n     * Copy a part of a block into another one\n     * \u003cp\u003eThis method can be called only when the specified part fits in both\n     * blocks, no verification is done here.\u003c/p\u003e\n     * @param srcBlock source block\n     * @param srcWidth source block width ({@link #BLOCK_SIZE} or smaller)\n     * @param srcStartRow start row in the source block\n     * @param srcEndRow end row (exclusive) in the source block\n     * @param srcStartColumn start column in the source block\n     * @param srcEndColumn end column (exclusive) in the source block\n     * @param dstBlock destination block\n     * @param dstWidth destination block width ({@link #BLOCK_SIZE} or smaller)\n     * @param dstStartRow start row in the destination block\n     * @param dstStartColumn start column in the destination block\n     ",
      "child_ranges": [
        "(line 785,col 9)-(line 785,col 57)",
        "(line 786,col 9)-(line 786,col 61)",
        "(line 787,col 9)-(line 787,col 61)",
        "(line 788,col 9)-(line 792,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 796,
      "end_line": 845,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 800,col 9)-(line 800,col 50)",
        "(line 801,col 9)-(line 803,col 9)",
        "(line 804,col 9)-(line 804,col 57)",
        "(line 805,col 9)-(line 805,col 53)",
        "(line 806,col 9)-(line 806,col 60)",
        "(line 807,col 9)-(line 813,col 9)",
        "(line 816,col 9)-(line 816,col 54)",
        "(line 817,col 9)-(line 817,col 72)",
        "(line 818,col 9)-(line 818,col 57)",
        "(line 819,col 9)-(line 819,col 75)",
        "(line 822,col 9)-(line 844,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.getRowMatrix(int)",
      "begin_line": 848,
      "end_line": 877,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 851,col 9)-(line 851,col 27)",
        "(line 852,col 9)-(line 852,col 68)",
        "(line 855,col 9)-(line 855,col 45)",
        "(line 856,col 9)-(line 856,col 54)",
        "(line 857,col 9)-(line 857,col 30)",
        "(line 858,col 9)-(line 858,col 30)",
        "(line 859,col 9)-(line 859,col 54)",
        "(line 860,col 9)-(line 873,col 9)",
        "(line 875,col 9)-(line 875,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.setRowMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 880,
      "end_line": 887,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 882,col 9)-(line 886,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.setRowMatrix(int, org.apache.commons.math.linear.DenseRealMatrix)",
      "begin_line": 900,
      "end_line": 934,
      "comment": "\n     * Sets the entries in row number \u003ccode\u003erow\u003c/code\u003e\n     * as a row matrix.  Row indices start at 0.\n     *\n     * @param row the row to be set\n     * @param matrix row matrix (must have one row and the same number of columns\n     * as the instance)\n     * @throws MatrixIndexException if the specified row index is invalid\n     * @throws InvalidMatrixException if the matrix dimensions do not match one\n     * instance row\n     ",
      "child_ranges": [
        "(line 903,col 9)-(line 903,col 27)",
        "(line 904,col 9)-(line 904,col 47)",
        "(line 905,col 9)-(line 911,col 9)",
        "(line 914,col 9)-(line 914,col 44)",
        "(line 915,col 9)-(line 915,col 53)",
        "(line 916,col 9)-(line 916,col 29)",
        "(line 917,col 9)-(line 917,col 29)",
        "(line 918,col 9)-(line 918,col 54)",
        "(line 919,col 9)-(line 932,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.getColumnMatrix(int)",
      "begin_line": 937,
      "end_line": 964,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 940,col 9)-(line 940,col 33)",
        "(line 941,col 9)-(line 941,col 65)",
        "(line 944,col 9)-(line 944,col 48)",
        "(line 945,col 9)-(line 945,col 57)",
        "(line 946,col 9)-(line 946,col 47)",
        "(line 947,col 9)-(line 947,col 30)",
        "(line 948,col 9)-(line 948,col 30)",
        "(line 949,col 9)-(line 949,col 54)",
        "(line 950,col 9)-(line 960,col 9)",
        "(line 962,col 9)-(line 962,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 967,
      "end_line": 974,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 969,col 9)-(line 973,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.DenseRealMatrix)",
      "begin_line": 987,
      "end_line": 1019,
      "comment": "\n     * Sets the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n     * as a column matrix.  Column indices start at 0.\n     *\n     * @param column the column to be set\n     * @param matrix column matrix (must have one column and the same number of rows\n     * as the instance)\n     * @throws MatrixIndexException if the specified column index is invalid\n     * @throws InvalidMatrixException if the matrix dimensions do not match one\n     * instance column\n     ",
      "child_ranges": [
        "(line 990,col 9)-(line 990,col 33)",
        "(line 991,col 9)-(line 991,col 44)",
        "(line 992,col 9)-(line 998,col 9)",
        "(line 1001,col 9)-(line 1001,col 48)",
        "(line 1002,col 9)-(line 1002,col 57)",
        "(line 1003,col 9)-(line 1003,col 47)",
        "(line 1004,col 9)-(line 1004,col 28)",
        "(line 1005,col 9)-(line 1005,col 28)",
        "(line 1006,col 9)-(line 1006,col 53)",
        "(line 1007,col 9)-(line 1017,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.getRowVector(int)",
      "begin_line": 1022,
      "end_line": 1041,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1025,col 9)-(line 1025,col 27)",
        "(line 1026,col 9)-(line 1026,col 53)",
        "(line 1029,col 9)-(line 1029,col 45)",
        "(line 1030,col 9)-(line 1030,col 54)",
        "(line 1031,col 9)-(line 1031,col 30)",
        "(line 1032,col 9)-(line 1037,col 9)",
        "(line 1039,col 9)-(line 1039,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.setRowVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1044,
      "end_line": 1051,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1046,col 9)-(line 1050,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.getColumnVector(int)",
      "begin_line": 1054,
      "end_line": 1075,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1057,col 9)-(line 1057,col 33)",
        "(line 1058,col 9)-(line 1058,col 50)",
        "(line 1061,col 9)-(line 1061,col 48)",
        "(line 1062,col 9)-(line 1062,col 57)",
        "(line 1063,col 9)-(line 1063,col 47)",
        "(line 1064,col 9)-(line 1064,col 30)",
        "(line 1065,col 9)-(line 1071,col 9)",
        "(line 1073,col 9)-(line 1073,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.setColumnVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1078,
      "end_line": 1085,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1080,col 9)-(line 1084,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.getRow(int)",
      "begin_line": 1088,
      "end_line": 1107,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1091,col 9)-(line 1091,col 27)",
        "(line 1092,col 9)-(line 1092,col 49)",
        "(line 1095,col 9)-(line 1095,col 45)",
        "(line 1096,col 9)-(line 1096,col 54)",
        "(line 1097,col 9)-(line 1097,col 30)",
        "(line 1098,col 9)-(line 1103,col 9)",
        "(line 1105,col 9)-(line 1105,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.setRow(int, double[])",
      "begin_line": 1110,
      "end_line": 1132,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1113,col 9)-(line 1113,col 27)",
        "(line 1114,col 9)-(line 1114,col 47)",
        "(line 1115,col 9)-(line 1119,col 9)",
        "(line 1122,col 9)-(line 1122,col 45)",
        "(line 1123,col 9)-(line 1123,col 54)",
        "(line 1124,col 9)-(line 1124,col 30)",
        "(line 1125,col 9)-(line 1130,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.getColumn(int)",
      "begin_line": 1135,
      "end_line": 1156,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1138,col 9)-(line 1138,col 33)",
        "(line 1139,col 9)-(line 1139,col 46)",
        "(line 1142,col 9)-(line 1142,col 48)",
        "(line 1143,col 9)-(line 1143,col 57)",
        "(line 1144,col 9)-(line 1144,col 47)",
        "(line 1145,col 9)-(line 1145,col 30)",
        "(line 1146,col 9)-(line 1152,col 9)",
        "(line 1154,col 9)-(line 1154,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.setColumn(int, double[])",
      "begin_line": 1159,
      "end_line": 1183,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1162,col 9)-(line 1162,col 33)",
        "(line 1163,col 9)-(line 1163,col 44)",
        "(line 1164,col 9)-(line 1168,col 9)",
        "(line 1171,col 9)-(line 1171,col 48)",
        "(line 1172,col 9)-(line 1172,col 57)",
        "(line 1173,col 9)-(line 1173,col 47)",
        "(line 1174,col 9)-(line 1174,col 30)",
        "(line 1175,col 9)-(line 1181,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.getEntry(int, int)",
      "begin_line": 1186,
      "end_line": 1199,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1188,col 9)-(line 1198,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.setEntry(int, int, double)",
      "begin_line": 1202,
      "end_line": 1215,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1204,col 9)-(line 1214,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.addToEntry(int, int, double)",
      "begin_line": 1218,
      "end_line": 1231,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1220,col 9)-(line 1230,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 1234,
      "end_line": 1247,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1236,col 9)-(line 1246,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.transpose()",
      "begin_line": 1250,
      "end_line": 1283,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1252,col 9)-(line 1252,col 44)",
        "(line 1253,col 9)-(line 1253,col 47)",
        "(line 1254,col 9)-(line 1254,col 70)",
        "(line 1257,col 9)-(line 1257,col 27)",
        "(line 1258,col 9)-(line 1279,col 9)",
        "(line 1281,col 9)-(line 1281,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.getRowDimension()",
      "begin_line": 1286,
      "end_line": 1288,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1287,col 9)-(line 1287,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.getColumnDimension()",
      "begin_line": 1291,
      "end_line": 1293,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1292,col 9)-(line 1292,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.operate(double[])",
      "begin_line": 1296,
      "end_line": 1335,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1299,col 9)-(line 1303,col 9)",
        "(line 1304,col 9)-(line 1304,col 46)",
        "(line 1307,col 9)-(line 1331,col 9)",
        "(line 1333,col 9)-(line 1333,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.preMultiply(double[])",
      "begin_line": 1338,
      "end_line": 1383,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1341,col 9)-(line 1345,col 9)",
        "(line 1346,col 9)-(line 1346,col 49)",
        "(line 1349,col 9)-(line 1379,col 9)",
        "(line 1381,col 9)-(line 1381,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 1386,
      "end_line": 1405,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1388,col 9)-(line 1388,col 66)",
        "(line 1389,col 9)-(line 1403,col 9)",
        "(line 1404,col 9)-(line 1404,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 1408,
      "end_line": 1427,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1410,col 9)-(line 1410,col 66)",
        "(line 1411,col 9)-(line 1425,col 9)",
        "(line 1426,col 9)-(line 1426,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 1430,
      "end_line": 1454,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1434,col 9)-(line 1434,col 70)",
        "(line 1435,col 9)-(line 1435,col 79)",
        "(line 1436,col 9)-(line 1452,col 9)",
        "(line 1453,col 9)-(line 1453,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 1457,
      "end_line": 1481,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1461,col 9)-(line 1461,col 70)",
        "(line 1462,col 9)-(line 1462,col 79)",
        "(line 1463,col 9)-(line 1479,col 9)",
        "(line 1480,col 9)-(line 1480,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 1484,
      "end_line": 1502,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1486,col 9)-(line 1486,col 66)",
        "(line 1487,col 9)-(line 1500,col 9)",
        "(line 1501,col 9)-(line 1501,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 1505,
      "end_line": 1523,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1507,col 9)-(line 1507,col 66)",
        "(line 1508,col 9)-(line 1521,col 9)",
        "(line 1522,col 9)-(line 1522,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 1526,
      "end_line": 1550,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1530,col 9)-(line 1530,col 70)",
        "(line 1531,col 9)-(line 1531,col 79)",
        "(line 1532,col 9)-(line 1548,col 9)",
        "(line 1549,col 9)-(line 1549,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 1553,
      "end_line": 1577,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1557,col 9)-(line 1557,col 70)",
        "(line 1558,col 9)-(line 1558,col 79)",
        "(line 1559,col 9)-(line 1575,col 9)",
        "(line 1576,col 9)-(line 1576,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.blockHeight(int)",
      "begin_line": 1584,
      "end_line": 1586,
      "comment": "\n     * Get the height of a block.\n     * @param blockRow row index (in block sense) of the block\n     * @return height (number of rows) of the block\n     ",
      "child_ranges": [
        "(line 1585,col 9)-(line 1585,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.DenseRealMatrix.blockWidth(int)",
      "begin_line": 1593,
      "end_line": 1595,
      "comment": "\n     * Get the width of a block.\n     * @param blockColumn column index (in block sense) of the block\n     * @return width (number of columns) of the block\n     ",
      "child_ranges": [
        "(line 1594,col 9)-(line 1594,col 99)"
      ]
    }
  ]
}