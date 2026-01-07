{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/linear/BlockFieldMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BlockFieldMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.AbstractFieldMatrix\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 70,
      "end_line": 1636,
      "comment": "\n * Cache-friendly implementation of FieldMatrix using a flat arrays to store\n * square blocks of the matrix.\n * \u003cp\u003e\n * This implementation is specially designed to be cache-friendly. Square blocks are\n * stored as small arrays and allow efficient traversal of data both in row major direction\n * and columns major direction, one block at a time. This greatly increases performances\n * for algorithms that use crossed directions loops like multiplication or transposition.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The size of square blocks is a static parameter. It may be tuned according to the cache\n * size of the target computer processor. As a rule of thumbs, it should be the largest\n * value that allows three blocks to be simultaneously cached (this is necessary for example\n * for matrix multiplication). The default value is to use 36x36 blocks.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The regular blocks represent {@link #BLOCK_SIZE} x {@link #BLOCK_SIZE} squares. Blocks\n * at right hand side and bottom side which may be smaller to fit matrix dimensions. The square\n * blocks are flattened in row major order in single dimension arrays which are therefore\n * {@link #BLOCK_SIZE}\u003csup\u003e2\u003c/sup\u003e elements long for regular blocks. The blocks are themselves\n * organized in row major order.\n * \u003c/p\u003e\n * \u003cp\u003e\n * As an example, for a block size of 36x36, a 100x60 matrix would be stored in 6 blocks.\n * Block 0 would be a Field[1296] array holding the upper left 36x36 square, block 1 would be\n * a Field[1296] array holding the upper center 36x36 square, block 2 would be a Field[1008]\n * array holding the upper right 36x28 rectangle, block 3 would be a Field[864] array holding\n * the lower left 24x36 rectangle, block 4 would be a Field[864] array holding the lower center\n * 24x36 rectangle and block 5 would be a Field[672] array holding the lower right 24x28\n * rectangle.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The layout complexity overhead versus simple mapping of matrices to java\n * arrays is negligible for small matrices (about 1%). The gain from cache efficiency leads\n * to up to 3-fold improvements for matrices of moderate to large size.\n * \u003c/p\u003e\n * @param \u003cT\u003e the type of the field elements\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "BLOCK_SIZE"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Block size. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "blocks"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Blocks of matrix entries. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Number of rows of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "columns"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Number of columns of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "blockRows"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Number of block rows of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "blockColumns"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Number of block columns of the matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.BlockFieldMatrix(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 102,
      "end_line": 116,
      "comment": "\n     * Create a new matrix with the supplied row and column dimensions.\n     *\n     * @param field field to which the elements belong\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @throws IllegalArgumentException if row or column dimension is not\n     *  positive\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 36)",
        "(line 106,col 9)-(line 106,col 28)",
        "(line 107,col 9)-(line 107,col 31)",
        "(line 110,col 9)-(line 110,col 63)",
        "(line 111,col 9)-(line 111,col 63)",
        "(line 114,col 9)-(line 114,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.BlockFieldMatrix(T[][])",
      "begin_line": 131,
      "end_line": 134,
      "comment": "\n     * Create a new dense matrix copying entries from raw layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in raw layout.\u003c/p\u003e\n     * \u003cp\u003eCalling this constructor is equivalent to call:\n     * \u003cpre\u003ematrix \u003d new BlockFieldMatrix\u003cT\u003e(getField(), rawData.length, rawData[0].length,\n     *                                   toBlocksLayout(rawData), false);\u003c/pre\u003e\n     * \u003c/p\u003e\n     * @param rawData data for new matrix, in raw layout\n     *\n     * @exception IllegalArgumentException if \u003ccode\u003eblockData\u003c/code\u003e shape is\n     * inconsistent with block layout\n     * @see #BlockFieldMatrix(int, int, FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 80)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.BlockFieldMatrix(int, int, T[][], boolean)",
      "begin_line": 151,
      "end_line": 185,
      "comment": "\n     * Create a new dense matrix copying entries from block layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in blocks layout.\u003c/p\u003e\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @param blockData data for new matrix\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     *\n     * @exception IllegalArgumentException if \u003ccode\u003eblockData\u003c/code\u003e shape is\n     * inconsistent with block layout\n     * @see #createBlocksLayout(Field, int, int)\n     * @see #toBlocksLayout(FieldElement[][])\n     * @see #BlockFieldMatrix(FieldElement[][])\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 54)",
        "(line 156,col 9)-(line 156,col 28)",
        "(line 157,col 9)-(line 157,col 31)",
        "(line 160,col 9)-(line 160,col 63)",
        "(line 161,col 9)-(line 161,col 63)",
        "(line 163,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 171,col 22)",
        "(line 172,col 9)-(line 183,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.toBlocksLayout(T[][])",
      "begin_line": 211,
      "end_line": 258,
      "comment": "\n     * Convert a data array from raw layout to blocks layout.\n     * \u003cp\u003e\n     * Raw layout is the straightforward layout where element at row i and\n     * column j is in array element \u003ccode\u003erawData[i][j]\u003c/code\u003e. Blocks layout\n     * is the layout used in {@link BlockFieldMatrix} instances, where the matrix\n     * is split in square blocks (except at right and bottom side where blocks may\n     * be rectangular to fit matrix size) and each block is stored in a flattened\n     * one-dimensional array.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method creates an array in blocks layout from an input array in raw layout.\n     * It can be used to provide the array argument of the {@link\n     * #BlockFieldMatrix(int, int, FieldElement[][], boolean)}\n     * constructor.\n     * \u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param rawData data array in raw layout\n     * @return a new data array containing the same entries but in blocks layout\n     * @exception IllegalArgumentException if \u003ccode\u003erawData\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length)\n     * @see #createBlocksLayout(Field, int, int)\n     * @see #BlockFieldMatrix(int, int, FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 48)",
        "(line 215,col 9)-(line 215,col 51)",
        "(line 216,col 9)-(line 216,col 73)",
        "(line 217,col 9)-(line 217,col 73)",
        "(line 220,col 9)-(line 225,col 9)",
        "(line 228,col 9)-(line 228,col 53)",
        "(line 229,col 9)-(line 229,col 77)",
        "(line 230,col 9)-(line 230,col 27)",
        "(line 231,col 9)-(line 254,col 9)",
        "(line 256,col 9)-(line 256,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.createBlocksLayout(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 275,
      "end_line": 298,
      "comment": "\n     * Create a data array in blocks layout.\n     * \u003cp\u003e\n     * This method can be used to create the array argument of the {@link\n     * #BlockFieldMatrix(int, int, FieldElement[][], boolean)}\n     * constructor.\n     * \u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param field field to which the elements belong\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @return a new data array in blocks layout\n     * @see #toBlocksLayout(FieldElement[][])\n     * @see #BlockFieldMatrix(int, int, FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 73)",
        "(line 279,col 9)-(line 279,col 73)",
        "(line 281,col 9)-(line 281,col 77)",
        "(line 282,col 9)-(line 282,col 27)",
        "(line 283,col 9)-(line 294,col 9)",
        "(line 296,col 9)-(line 296,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.createMatrix(int, int)",
      "begin_line": 301,
      "end_line": 305,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.copy()",
      "begin_line": 308,
      "end_line": 321,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 88)",
        "(line 315,col 9)-(line 317,col 9)",
        "(line 319,col 9)-(line 319,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.add(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 324,
      "end_line": 365,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 327,col 9)-(line 364,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.add(org.apache.commons.math.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 374,
      "end_line": 394,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 35)",
        "(line 380,col 9)-(line 380,col 91)",
        "(line 383,col 9)-(line 390,col 9)",
        "(line 392,col 9)-(line 392,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.subtract(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 397,
      "end_line": 438,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 400,col 9)-(line 437,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.subtract(org.apache.commons.math.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 447,
      "end_line": 467,
      "comment": "\n     * Compute this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this - m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 38)",
        "(line 453,col 9)-(line 453,col 91)",
        "(line 456,col 9)-(line 463,col 9)",
        "(line 465,col 9)-(line 465,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.scalarAdd(T)",
      "begin_line": 470,
      "end_line": 487,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 91)",
        "(line 477,col 9)-(line 483,col 9)",
        "(line 485,col 9)-(line 485,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.scalarMultiply(T)",
      "begin_line": 490,
      "end_line": 507,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 91)",
        "(line 497,col 9)-(line 503,col 9)",
        "(line 505,col 9)-(line 505,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.multiply(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 510,
      "end_line": 569,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 513,col 9)-(line 568,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.multiply(org.apache.commons.math.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 579,
      "end_line": 643,
      "comment": "\n     * Returns the result of postmultiplying this by m.\n     *\n     * @param m    matrix to postmultiply by\n     * @return     this * m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 41)",
        "(line 584,col 9)-(line 584,col 93)",
        "(line 585,col 9)-(line 585,col 44)",
        "(line 588,col 9)-(line 588,col 27)",
        "(line 589,col 9)-(line 639,col 9)",
        "(line 641,col 9)-(line 641,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getData()",
      "begin_line": 646,
      "end_line": 673,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 91)",
        "(line 650,col 9)-(line 650,col 74)",
        "(line 652,col 9)-(line 669,col 9)",
        "(line 671,col 9)-(line 671,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 676,
      "end_line": 773,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 682,col 9)-(line 682,col 70)",
        "(line 685,col 9)-(line 686,col 100)",
        "(line 689,col 9)-(line 689,col 62)",
        "(line 690,col 9)-(line 690,col 62)",
        "(line 691,col 9)-(line 691,col 62)",
        "(line 692,col 9)-(line 692,col 62)",
        "(line 695,col 9)-(line 695,col 35)",
        "(line 696,col 9)-(line 769,col 9)",
        "(line 771,col 9)-(line 771,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.copyBlockPart(T[], int, int, int, int, int, T[], int, int, int)",
      "begin_line": 790,
      "end_line": 803,
      "comment": "\n     * Copy a part of a block into another one\n     * \u003cp\u003eThis method can be called only when the specified part fits in both\n     * blocks, no verification is done here.\u003c/p\u003e\n     * @param srcBlock source block\n     * @param srcWidth source block width ({@link #BLOCK_SIZE} or smaller)\n     * @param srcStartRow start row in the source block\n     * @param srcEndRow end row (exclusive) in the source block\n     * @param srcStartColumn start column in the source block\n     * @param srcEndColumn end column (exclusive) in the source block\n     * @param dstBlock destination block\n     * @param dstWidth destination block width ({@link #BLOCK_SIZE} or smaller)\n     * @param dstStartRow start row in the destination block\n     * @param dstStartColumn start column in the destination block\n     ",
      "child_ranges": [
        "(line 795,col 9)-(line 795,col 57)",
        "(line 796,col 9)-(line 796,col 61)",
        "(line 797,col 9)-(line 797,col 61)",
        "(line 798,col 9)-(line 802,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setSubMatrix(T[][], int, int)",
      "begin_line": 806,
      "end_line": 854,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 811,col 9)-(line 811,col 50)",
        "(line 812,col 9)-(line 814,col 9)",
        "(line 815,col 9)-(line 815,col 57)",
        "(line 816,col 9)-(line 816,col 53)",
        "(line 817,col 9)-(line 817,col 60)",
        "(line 818,col 9)-(line 822,col 9)",
        "(line 825,col 9)-(line 825,col 54)",
        "(line 826,col 9)-(line 826,col 72)",
        "(line 827,col 9)-(line 827,col 57)",
        "(line 828,col 9)-(line 828,col 75)",
        "(line 831,col 9)-(line 853,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getRowMatrix(int)",
      "begin_line": 857,
      "end_line": 887,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 861,col 9)-(line 861,col 27)",
        "(line 862,col 9)-(line 862,col 88)",
        "(line 865,col 9)-(line 865,col 45)",
        "(line 866,col 9)-(line 866,col 54)",
        "(line 867,col 9)-(line 867,col 30)",
        "(line 868,col 9)-(line 868,col 30)",
        "(line 869,col 9)-(line 869,col 49)",
        "(line 870,col 9)-(line 883,col 9)",
        "(line 885,col 9)-(line 885,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setRowMatrix(int, org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 890,
      "end_line": 897,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 892,col 9)-(line 896,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setRowMatrix(int, org.apache.commons.math.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 910,
      "end_line": 941,
      "comment": "\n     * Sets the entries in row number \u003ccode\u003erow\u003c/code\u003e\n     * as a row matrix.  Row indices start at 0.\n     *\n     * @param row the row to be set\n     * @param matrix row matrix (must have one row and the same number of columns\n     * as the instance)\n     * @throws MatrixIndexException if the specified row index is invalid\n     * @throws MatrixDimensionMismatchException if the matrix dimensions do not match one\n     * instance row\n     ",
      "child_ranges": [
        "(line 911,col 9)-(line 911,col 27)",
        "(line 912,col 9)-(line 912,col 47)",
        "(line 913,col 9)-(line 918,col 9)",
        "(line 921,col 9)-(line 921,col 44)",
        "(line 922,col 9)-(line 922,col 53)",
        "(line 923,col 9)-(line 923,col 29)",
        "(line 924,col 9)-(line 924,col 29)",
        "(line 925,col 9)-(line 925,col 49)",
        "(line 926,col 9)-(line 939,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getColumnMatrix(int)",
      "begin_line": 944,
      "end_line": 972,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 948,col 9)-(line 948,col 33)",
        "(line 949,col 9)-(line 949,col 85)",
        "(line 952,col 9)-(line 952,col 48)",
        "(line 953,col 9)-(line 953,col 57)",
        "(line 954,col 9)-(line 954,col 47)",
        "(line 955,col 9)-(line 955,col 30)",
        "(line 956,col 9)-(line 956,col 30)",
        "(line 957,col 9)-(line 957,col 49)",
        "(line 958,col 9)-(line 968,col 9)",
        "(line 970,col 9)-(line 970,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setColumnMatrix(int, org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 975,
      "end_line": 982,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 977,col 9)-(line 981,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setColumnMatrix(int, org.apache.commons.math.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 995,
      "end_line": 1023,
      "comment": "\n     * Sets the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n     * as a column matrix.  Column indices start at 0.\n     *\n     * @param column the column to be set\n     * @param matrix column matrix (must have one column and the same number of rows\n     * as the instance)\n     * @throws MatrixIndexException if the specified column index is invalid\n     * @throws MatrixDimensionMismatchException if the matrix dimensions do not match one\n     * instance column\n     ",
      "child_ranges": [
        "(line 996,col 9)-(line 996,col 33)",
        "(line 997,col 9)-(line 997,col 44)",
        "(line 998,col 9)-(line 1003,col 9)",
        "(line 1006,col 9)-(line 1006,col 48)",
        "(line 1007,col 9)-(line 1007,col 57)",
        "(line 1008,col 9)-(line 1008,col 47)",
        "(line 1009,col 9)-(line 1009,col 28)",
        "(line 1010,col 9)-(line 1010,col 28)",
        "(line 1011,col 9)-(line 1011,col 48)",
        "(line 1012,col 9)-(line 1022,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getRowVector(int)",
      "begin_line": 1026,
      "end_line": 1046,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1030,col 9)-(line 1030,col 27)",
        "(line 1031,col 9)-(line 1031,col 60)",
        "(line 1034,col 9)-(line 1034,col 45)",
        "(line 1035,col 9)-(line 1035,col 54)",
        "(line 1036,col 9)-(line 1036,col 30)",
        "(line 1037,col 9)-(line 1042,col 9)",
        "(line 1044,col 9)-(line 1044,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setRowVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 1049,
      "end_line": 1056,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1051,col 9)-(line 1055,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getColumnVector(int)",
      "begin_line": 1059,
      "end_line": 1081,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1063,col 9)-(line 1063,col 33)",
        "(line 1064,col 9)-(line 1064,col 57)",
        "(line 1067,col 9)-(line 1067,col 48)",
        "(line 1068,col 9)-(line 1068,col 57)",
        "(line 1069,col 9)-(line 1069,col 47)",
        "(line 1070,col 9)-(line 1070,col 30)",
        "(line 1071,col 9)-(line 1077,col 9)",
        "(line 1079,col 9)-(line 1079,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setColumnVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 1084,
      "end_line": 1091,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1086,col 9)-(line 1090,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getRow(int)",
      "begin_line": 1094,
      "end_line": 1114,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1098,col 9)-(line 1098,col 27)",
        "(line 1099,col 9)-(line 1099,col 56)",
        "(line 1102,col 9)-(line 1102,col 45)",
        "(line 1103,col 9)-(line 1103,col 54)",
        "(line 1104,col 9)-(line 1104,col 30)",
        "(line 1105,col 9)-(line 1110,col 9)",
        "(line 1112,col 9)-(line 1112,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setRow(int, T[])",
      "begin_line": 1117,
      "end_line": 1135,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1119,col 9)-(line 1119,col 27)",
        "(line 1120,col 9)-(line 1120,col 47)",
        "(line 1121,col 9)-(line 1123,col 9)",
        "(line 1126,col 9)-(line 1126,col 45)",
        "(line 1127,col 9)-(line 1127,col 54)",
        "(line 1128,col 9)-(line 1128,col 30)",
        "(line 1129,col 9)-(line 1134,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getColumn(int)",
      "begin_line": 1138,
      "end_line": 1159,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1142,col 9)-(line 1142,col 33)",
        "(line 1143,col 9)-(line 1143,col 53)",
        "(line 1146,col 9)-(line 1146,col 48)",
        "(line 1147,col 9)-(line 1147,col 57)",
        "(line 1148,col 9)-(line 1148,col 47)",
        "(line 1149,col 9)-(line 1149,col 30)",
        "(line 1150,col 9)-(line 1156,col 9)",
        "(line 1158,col 9)-(line 1158,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setColumn(int, T[])",
      "begin_line": 1162,
      "end_line": 1182,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1164,col 9)-(line 1164,col 33)",
        "(line 1165,col 9)-(line 1165,col 44)",
        "(line 1166,col 9)-(line 1168,col 9)",
        "(line 1171,col 9)-(line 1171,col 48)",
        "(line 1172,col 9)-(line 1172,col 57)",
        "(line 1173,col 9)-(line 1173,col 47)",
        "(line 1174,col 9)-(line 1174,col 30)",
        "(line 1175,col 9)-(line 1181,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getEntry(int, int)",
      "begin_line": 1185,
      "end_line": 1199,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1188,col 9)-(line 1198,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setEntry(int, int, T)",
      "begin_line": 1202,
      "end_line": 1216,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1205,col 9)-(line 1215,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.addToEntry(int, int, T)",
      "begin_line": 1219,
      "end_line": 1234,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1222,col 9)-(line 1233,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.multiplyEntry(int, int, T)",
      "begin_line": 1237,
      "end_line": 1252,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1240,col 9)-(line 1251,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.transpose()",
      "begin_line": 1255,
      "end_line": 1292,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1258,col 9)-(line 1258,col 44)",
        "(line 1259,col 9)-(line 1259,col 47)",
        "(line 1260,col 9)-(line 1260,col 90)",
        "(line 1263,col 9)-(line 1263,col 27)",
        "(line 1264,col 9)-(line 1289,col 9)",
        "(line 1291,col 9)-(line 1291,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getRowDimension()",
      "begin_line": 1295,
      "end_line": 1298,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1297,col 9)-(line 1297,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getColumnDimension()",
      "begin_line": 1301,
      "end_line": 1304,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1303,col 9)-(line 1303,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.operate(T[])",
      "begin_line": 1307,
      "end_line": 1347,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1311,col 9)-(line 1313,col 9)",
        "(line 1314,col 9)-(line 1314,col 53)",
        "(line 1315,col 9)-(line 1315,col 44)",
        "(line 1318,col 9)-(line 1344,col 9)",
        "(line 1346,col 9)-(line 1346,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.preMultiply(T[])",
      "begin_line": 1350,
      "end_line": 1395,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1354,col 9)-(line 1356,col 9)",
        "(line 1357,col 9)-(line 1357,col 56)",
        "(line 1358,col 9)-(line 1358,col 44)",
        "(line 1361,col 9)-(line 1392,col 9)",
        "(line 1394,col 9)-(line 1394,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
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
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
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
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1448,
      "end_line": 1475,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1453,col 9)-(line 1453,col 70)",
        "(line 1454,col 9)-(line 1454,col 79)",
        "(line 1455,col 9)-(line 1473,col 9)",
        "(line 1474,col 9)-(line 1474,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1478,
      "end_line": 1505,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1483,col 9)-(line 1483,col 70)",
        "(line 1484,col 9)-(line 1484,col 79)",
        "(line 1485,col 9)-(line 1503,col 9)",
        "(line 1504,col 9)-(line 1504,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
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
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
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
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1560,
      "end_line": 1587,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1565,col 9)-(line 1565,col 70)",
        "(line 1566,col 9)-(line 1566,col 79)",
        "(line 1567,col 9)-(line 1585,col 9)",
        "(line 1586,col 9)-(line 1586,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1590,
      "end_line": 1617,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1595,col 9)-(line 1595,col 70)",
        "(line 1596,col 9)-(line 1596,col 79)",
        "(line 1597,col 9)-(line 1615,col 9)",
        "(line 1616,col 9)-(line 1616,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.blockHeight(int)",
      "begin_line": 1624,
      "end_line": 1626,
      "comment": "\n     * Get the height of a block.\n     * @param blockRow row index (in block sense) of the block\n     * @return height (number of rows) of the block\n     ",
      "child_ranges": [
        "(line 1625,col 9)-(line 1625,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.blockWidth(int)",
      "begin_line": 1633,
      "end_line": 1635,
      "comment": "\n     * Get the width of a block.\n     * @param blockColumn column index (in block sense) of the block\n     * @return width (number of columns) of the block\n     ",
      "child_ranges": [
        "(line 1634,col 9)-(line 1634,col 99)"
      ]
    }
  ]
}