{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/linear/BlockFieldMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BlockFieldMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.AbstractFieldMatrix\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 68,
      "end_line": 1669,
      "comment": "\n * Cache-friendly implementation of FieldMatrix using a flat arrays to store\n * square blocks of the matrix.\n * \u003cp\u003e\n * This implementation is specially designed to be cache-friendly. Square blocks are\n * stored as small arrays and allow efficient traversal of data both in row major direction\n * and columns major direction, one block at a time. This greatly increases performances\n * for algorithms that use crossed directions loops like multiplication or transposition.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The size of square blocks is a static parameter. It may be tuned according to the cache\n * size of the target computer processor. As a rule of thumbs, it should be the largest\n * value that allows three blocks to be simultaneously cached (this is necessary for example\n * for matrix multiplication). The default value is to use 36x36 blocks.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The regular blocks represent {@link #BLOCK_SIZE} x {@link #BLOCK_SIZE} squares. Blocks\n * at right hand side and bottom side which may be smaller to fit matrix dimensions. The square\n * blocks are flattened in row major order in single dimension arrays which are therefore\n * {@link #BLOCK_SIZE}\u003csup\u003e2\u003c/sup\u003e elements long for regular blocks. The blocks are themselves\n * organized in row major order.\n * \u003c/p\u003e\n * \u003cp\u003e\n * As an example, for a block size of 36x36, a 100x60 matrix would be stored in 6 blocks.\n * Block 0 would be a Field[1296] array holding the upper left 36x36 square, block 1 would be\n * a Field[1296] array holding the upper center 36x36 square, block 2 would be a Field[1008]\n * array holding the upper right 36x28 rectangle, block 3 would be a Field[864] array holding\n * the lower left 24x36 rectangle, block 4 would be a Field[864] array holding the lower center\n * 24x36 rectangle and block 5 would be a Field[672] array holding the lower right 24x28\n * rectangle.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The layout complexity overhead versus simple mapping of matrices to java\n * arrays is negligible for small matrices (about 1%). The gain from cache efficiency leads\n * to up to 3-fold improvements for matrices of moderate to large size.\n * \u003c/p\u003e\n * @param \u003cT\u003e the type of the field elements\n * @version $Revision$ $Date$\n * @since 2.0\n "
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
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.BlockFieldMatrix(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 100,
      "end_line": 114,
      "comment": "\n     * Create a new matrix with the supplied row and column dimensions.\n     *\n     * @param field field to which the elements belong\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @throws IllegalArgumentException if row or column dimension is not\n     *  positive\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 36)",
        "(line 104,col 9)-(line 104,col 28)",
        "(line 105,col 9)-(line 105,col 31)",
        "(line 108,col 9)-(line 108,col 63)",
        "(line 109,col 9)-(line 109,col 63)",
        "(line 112,col 9)-(line 112,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.BlockFieldMatrix(T[][])",
      "begin_line": 129,
      "end_line": 132,
      "comment": "\n     * Create a new dense matrix copying entries from raw layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in raw layout.\u003c/p\u003e\n     * \u003cp\u003eCalling this constructor is equivalent to call:\n     * \u003cpre\u003ematrix \u003d new BlockFieldMatrix\u003cT\u003e(getField(), rawData.length, rawData[0].length,\n     *                                   toBlocksLayout(rawData), false);\u003c/pre\u003e\n     * \u003c/p\u003e\n     * @param rawData data for new matrix, in raw layout\n     *\n     * @exception IllegalArgumentException if \u003ccode\u003eblockData\u003c/code\u003e shape is\n     * inconsistent with block layout\n     * @see #BlockFieldMatrix(int, int, FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 80)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.BlockFieldMatrix(int, int, T[][], boolean)",
      "begin_line": 149,
      "end_line": 184,
      "comment": "\n     * Create a new dense matrix copying entries from block layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in blocks layout.\u003c/p\u003e\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @param blockData data for new matrix\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     *\n     * @exception IllegalArgumentException if \u003ccode\u003eblockData\u003c/code\u003e shape is\n     * inconsistent with block layout\n     * @see #createBlocksLayout(Field, int, int)\n     * @see #toBlocksLayout(FieldElement[][])\n     * @see #BlockFieldMatrix(FieldElement[][])\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 54)",
        "(line 154,col 9)-(line 154,col 28)",
        "(line 155,col 9)-(line 155,col 31)",
        "(line 158,col 9)-(line 158,col 63)",
        "(line 159,col 9)-(line 159,col 63)",
        "(line 161,col 9)-(line 167,col 9)",
        "(line 169,col 9)-(line 169,col 22)",
        "(line 170,col 9)-(line 182,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.toBlocksLayout(T[][])",
      "begin_line": 210,
      "end_line": 259,
      "comment": "\n     * Convert a data array from raw layout to blocks layout.\n     * \u003cp\u003e\n     * Raw layout is the straightforward layout where element at row i and\n     * column j is in array element \u003ccode\u003erawData[i][j]\u003c/code\u003e. Blocks layout\n     * is the layout used in {@link BlockFieldMatrix} instances, where the matrix\n     * is split in square blocks (except at right and bottom side where blocks may\n     * be rectangular to fit matrix size) and each block is stored in a flattened\n     * one-dimensional array.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method creates an array in blocks layout from an input array in raw layout.\n     * It can be used to provide the array argument of the {@link\n     * #BlockFieldMatrix(int, int, FieldElement[][], boolean)}\n     * constructor.\n     * \u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param rawData data array in raw layout\n     * @return a new data array containing the same entries but in blocks layout\n     * @exception IllegalArgumentException if \u003ccode\u003erawData\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length)\n     * @see #createBlocksLayout(Field, int, int)\n     * @see #BlockFieldMatrix(int, int, FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 48)",
        "(line 214,col 9)-(line 214,col 51)",
        "(line 215,col 9)-(line 215,col 73)",
        "(line 216,col 9)-(line 216,col 73)",
        "(line 219,col 9)-(line 226,col 9)",
        "(line 229,col 9)-(line 229,col 53)",
        "(line 230,col 9)-(line 230,col 77)",
        "(line 231,col 9)-(line 231,col 27)",
        "(line 232,col 9)-(line 255,col 9)",
        "(line 257,col 9)-(line 257,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.createBlocksLayout(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 276,
      "end_line": 299,
      "comment": "\n     * Create a data array in blocks layout.\n     * \u003cp\u003e\n     * This method can be used to create the array argument of the {@link\n     * #BlockFieldMatrix(int, int, FieldElement[][], boolean)}\n     * constructor.\n     * \u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param field field to which the elements belong\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @return a new data array in blocks layout\n     * @see #toBlocksLayout(FieldElement[][])\n     * @see #BlockFieldMatrix(int, int, FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 73)",
        "(line 280,col 9)-(line 280,col 73)",
        "(line 282,col 9)-(line 282,col 77)",
        "(line 283,col 9)-(line 283,col 27)",
        "(line 284,col 9)-(line 295,col 9)",
        "(line 297,col 9)-(line 297,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.createMatrix(int, int)",
      "begin_line": 302,
      "end_line": 306,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.copy()",
      "begin_line": 309,
      "end_line": 322,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 88)",
        "(line 316,col 9)-(line 318,col 9)",
        "(line 320,col 9)-(line 320,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.add(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 325,
      "end_line": 366,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 328,col 9)-(line 365,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.add(org.apache.commons.math.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 375,
      "end_line": 395,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 35)",
        "(line 381,col 9)-(line 381,col 91)",
        "(line 384,col 9)-(line 391,col 9)",
        "(line 393,col 9)-(line 393,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.subtract(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 398,
      "end_line": 439,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 401,col 9)-(line 438,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.subtract(org.apache.commons.math.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 448,
      "end_line": 468,
      "comment": "\n     * Compute this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this - m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 38)",
        "(line 454,col 9)-(line 454,col 91)",
        "(line 457,col 9)-(line 464,col 9)",
        "(line 466,col 9)-(line 466,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.scalarAdd(T)",
      "begin_line": 471,
      "end_line": 488,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 91)",
        "(line 478,col 9)-(line 484,col 9)",
        "(line 486,col 9)-(line 486,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.scalarMultiply(T)",
      "begin_line": 491,
      "end_line": 508,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 91)",
        "(line 498,col 9)-(line 504,col 9)",
        "(line 506,col 9)-(line 506,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.multiply(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 511,
      "end_line": 570,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 514,col 9)-(line 569,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.multiply(org.apache.commons.math.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 580,
      "end_line": 644,
      "comment": "\n     * Returns the result of postmultiplying this by m.\n     *\n     * @param m    matrix to postmultiply by\n     * @return     this * m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 583,col 9)-(line 583,col 41)",
        "(line 585,col 9)-(line 585,col 93)",
        "(line 586,col 9)-(line 586,col 44)",
        "(line 589,col 9)-(line 589,col 27)",
        "(line 590,col 9)-(line 640,col 9)",
        "(line 642,col 9)-(line 642,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getData()",
      "begin_line": 647,
      "end_line": 674,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 650,col 9)-(line 650,col 91)",
        "(line 651,col 9)-(line 651,col 74)",
        "(line 653,col 9)-(line 670,col 9)",
        "(line 672,col 9)-(line 672,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 677,
      "end_line": 774,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 683,col 9)-(line 683,col 70)",
        "(line 686,col 9)-(line 687,col 100)",
        "(line 690,col 9)-(line 690,col 62)",
        "(line 691,col 9)-(line 691,col 62)",
        "(line 692,col 9)-(line 692,col 62)",
        "(line 693,col 9)-(line 693,col 62)",
        "(line 696,col 9)-(line 696,col 35)",
        "(line 697,col 9)-(line 770,col 9)",
        "(line 772,col 9)-(line 772,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.copyBlockPart(T[], int, int, int, int, int, T[], int, int, int)",
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
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setSubMatrix(T[][], int, int)",
      "begin_line": 807,
      "end_line": 857,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 812,col 9)-(line 812,col 50)",
        "(line 813,col 9)-(line 815,col 9)",
        "(line 816,col 9)-(line 816,col 57)",
        "(line 817,col 9)-(line 817,col 53)",
        "(line 818,col 9)-(line 818,col 60)",
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
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getRowMatrix(int)",
      "begin_line": 860,
      "end_line": 890,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 864,col 9)-(line 864,col 27)",
        "(line 865,col 9)-(line 865,col 88)",
        "(line 868,col 9)-(line 868,col 45)",
        "(line 869,col 9)-(line 869,col 54)",
        "(line 870,col 9)-(line 870,col 30)",
        "(line 871,col 9)-(line 871,col 30)",
        "(line 872,col 9)-(line 872,col 49)",
        "(line 873,col 9)-(line 886,col 9)",
        "(line 888,col 9)-(line 888,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setRowMatrix(int, org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 893,
      "end_line": 901,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 896,col 9)-(line 900,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setRowMatrix(int, org.apache.commons.math.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 914,
      "end_line": 948,
      "comment": "\n     * Sets the entries in row number \u003ccode\u003erow\u003c/code\u003e\n     * as a row matrix.  Row indices start at 0.\n     *\n     * @param row the row to be set\n     * @param matrix row matrix (must have one row and the same number of columns\n     * as the instance)\n     * @throws MatrixIndexException if the specified row index is invalid\n     * @throws InvalidMatrixException if the matrix dimensions do not match one\n     * instance row\n     ",
      "child_ranges": [
        "(line 917,col 9)-(line 917,col 27)",
        "(line 918,col 9)-(line 918,col 47)",
        "(line 919,col 9)-(line 925,col 9)",
        "(line 928,col 9)-(line 928,col 44)",
        "(line 929,col 9)-(line 929,col 53)",
        "(line 930,col 9)-(line 930,col 29)",
        "(line 931,col 9)-(line 931,col 29)",
        "(line 932,col 9)-(line 932,col 49)",
        "(line 933,col 9)-(line 946,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getColumnMatrix(int)",
      "begin_line": 951,
      "end_line": 979,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 955,col 9)-(line 955,col 33)",
        "(line 956,col 9)-(line 956,col 85)",
        "(line 959,col 9)-(line 959,col 48)",
        "(line 960,col 9)-(line 960,col 57)",
        "(line 961,col 9)-(line 961,col 47)",
        "(line 962,col 9)-(line 962,col 30)",
        "(line 963,col 9)-(line 963,col 30)",
        "(line 964,col 9)-(line 964,col 49)",
        "(line 965,col 9)-(line 975,col 9)",
        "(line 977,col 9)-(line 977,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setColumnMatrix(int, org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 982,
      "end_line": 990,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 985,col 9)-(line 989,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setColumnMatrix(int, org.apache.commons.math.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 1003,
      "end_line": 1035,
      "comment": "\n     * Sets the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n     * as a column matrix.  Column indices start at 0.\n     *\n     * @param column the column to be set\n     * @param matrix column matrix (must have one column and the same number of rows\n     * as the instance)\n     * @throws MatrixIndexException if the specified column index is invalid\n     * @throws InvalidMatrixException if the matrix dimensions do not match one\n     * instance column\n     ",
      "child_ranges": [
        "(line 1006,col 9)-(line 1006,col 33)",
        "(line 1007,col 9)-(line 1007,col 44)",
        "(line 1008,col 9)-(line 1014,col 9)",
        "(line 1017,col 9)-(line 1017,col 48)",
        "(line 1018,col 9)-(line 1018,col 57)",
        "(line 1019,col 9)-(line 1019,col 47)",
        "(line 1020,col 9)-(line 1020,col 28)",
        "(line 1021,col 9)-(line 1021,col 28)",
        "(line 1022,col 9)-(line 1022,col 48)",
        "(line 1023,col 9)-(line 1033,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getRowVector(int)",
      "begin_line": 1038,
      "end_line": 1058,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1042,col 9)-(line 1042,col 27)",
        "(line 1043,col 9)-(line 1043,col 60)",
        "(line 1046,col 9)-(line 1046,col 45)",
        "(line 1047,col 9)-(line 1047,col 54)",
        "(line 1048,col 9)-(line 1048,col 30)",
        "(line 1049,col 9)-(line 1054,col 9)",
        "(line 1056,col 9)-(line 1056,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setRowVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 1061,
      "end_line": 1069,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1064,col 9)-(line 1068,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getColumnVector(int)",
      "begin_line": 1072,
      "end_line": 1094,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1076,col 9)-(line 1076,col 33)",
        "(line 1077,col 9)-(line 1077,col 57)",
        "(line 1080,col 9)-(line 1080,col 48)",
        "(line 1081,col 9)-(line 1081,col 57)",
        "(line 1082,col 9)-(line 1082,col 47)",
        "(line 1083,col 9)-(line 1083,col 30)",
        "(line 1084,col 9)-(line 1090,col 9)",
        "(line 1092,col 9)-(line 1092,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setColumnVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 1097,
      "end_line": 1105,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1100,col 9)-(line 1104,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getRow(int)",
      "begin_line": 1108,
      "end_line": 1128,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1112,col 9)-(line 1112,col 27)",
        "(line 1113,col 9)-(line 1113,col 56)",
        "(line 1116,col 9)-(line 1116,col 45)",
        "(line 1117,col 9)-(line 1117,col 54)",
        "(line 1118,col 9)-(line 1118,col 30)",
        "(line 1119,col 9)-(line 1124,col 9)",
        "(line 1126,col 9)-(line 1126,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setRow(int, T[])",
      "begin_line": 1131,
      "end_line": 1154,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1135,col 9)-(line 1135,col 27)",
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
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getColumn(int)",
      "begin_line": 1157,
      "end_line": 1179,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1161,col 9)-(line 1161,col 33)",
        "(line 1162,col 9)-(line 1162,col 53)",
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
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setColumn(int, T[])",
      "begin_line": 1182,
      "end_line": 1207,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1186,col 9)-(line 1186,col 33)",
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
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getEntry(int, int)",
      "begin_line": 1210,
      "end_line": 1224,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1213,col 9)-(line 1223,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setEntry(int, int, T)",
      "begin_line": 1227,
      "end_line": 1241,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1230,col 9)-(line 1240,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.addToEntry(int, int, T)",
      "begin_line": 1244,
      "end_line": 1259,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1247,col 9)-(line 1258,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.multiplyEntry(int, int, T)",
      "begin_line": 1262,
      "end_line": 1277,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1265,col 9)-(line 1276,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.transpose()",
      "begin_line": 1280,
      "end_line": 1318,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1283,col 9)-(line 1283,col 44)",
        "(line 1284,col 9)-(line 1284,col 47)",
        "(line 1285,col 9)-(line 1285,col 90)",
        "(line 1288,col 9)-(line 1288,col 27)",
        "(line 1289,col 9)-(line 1314,col 9)",
        "(line 1316,col 9)-(line 1316,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getRowDimension()",
      "begin_line": 1321,
      "end_line": 1324,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1323,col 9)-(line 1323,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getColumnDimension()",
      "begin_line": 1327,
      "end_line": 1330,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1329,col 9)-(line 1329,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.operate(T[])",
      "begin_line": 1333,
      "end_line": 1376,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1337,col 9)-(line 1341,col 9)",
        "(line 1342,col 9)-(line 1342,col 53)",
        "(line 1343,col 9)-(line 1343,col 44)",
        "(line 1346,col 9)-(line 1372,col 9)",
        "(line 1374,col 9)-(line 1374,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.preMultiply(T[])",
      "begin_line": 1379,
      "end_line": 1427,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1383,col 9)-(line 1387,col 9)",
        "(line 1388,col 9)-(line 1388,col 56)",
        "(line 1389,col 9)-(line 1389,col 44)",
        "(line 1392,col 9)-(line 1423,col 9)",
        "(line 1425,col 9)-(line 1425,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 1430,
      "end_line": 1452,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1433,col 9)-(line 1433,col 66)",
        "(line 1434,col 9)-(line 1450,col 9)",
        "(line 1451,col 9)-(line 1451,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 1455,
      "end_line": 1477,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1458,col 9)-(line 1458,col 66)",
        "(line 1459,col 9)-(line 1475,col 9)",
        "(line 1476,col 9)-(line 1476,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1480,
      "end_line": 1507,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1485,col 9)-(line 1485,col 70)",
        "(line 1486,col 9)-(line 1486,col 79)",
        "(line 1487,col 9)-(line 1505,col 9)",
        "(line 1506,col 9)-(line 1506,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1510,
      "end_line": 1537,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1515,col 9)-(line 1515,col 70)",
        "(line 1516,col 9)-(line 1516,col 79)",
        "(line 1517,col 9)-(line 1535,col 9)",
        "(line 1536,col 9)-(line 1536,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 1540,
      "end_line": 1563,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1543,col 9)-(line 1543,col 66)",
        "(line 1544,col 9)-(line 1544,col 27)",
        "(line 1545,col 9)-(line 1561,col 9)",
        "(line 1562,col 9)-(line 1562,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 1566,
      "end_line": 1589,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1569,col 9)-(line 1569,col 66)",
        "(line 1570,col 9)-(line 1570,col 27)",
        "(line 1571,col 9)-(line 1587,col 9)",
        "(line 1588,col 9)-(line 1588,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1592,
      "end_line": 1619,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1597,col 9)-(line 1597,col 70)",
        "(line 1598,col 9)-(line 1598,col 79)",
        "(line 1599,col 9)-(line 1617,col 9)",
        "(line 1618,col 9)-(line 1618,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1622,
      "end_line": 1649,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1627,col 9)-(line 1627,col 70)",
        "(line 1628,col 9)-(line 1628,col 79)",
        "(line 1629,col 9)-(line 1647,col 9)",
        "(line 1648,col 9)-(line 1648,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.blockHeight(int)",
      "begin_line": 1656,
      "end_line": 1658,
      "comment": "\n     * Get the height of a block.\n     * @param blockRow row index (in block sense) of the block\n     * @return height (number of rows) of the block\n     ",
      "child_ranges": [
        "(line 1657,col 9)-(line 1657,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.blockWidth(int)",
      "begin_line": 1665,
      "end_line": 1667,
      "comment": "\n     * Get the width of a block.\n     * @param blockColumn column index (in block sense) of the block\n     * @return width (number of columns) of the block\n     ",
      "child_ranges": [
        "(line 1666,col 9)-(line 1666,col 99)"
      ]
    }
  ]
}