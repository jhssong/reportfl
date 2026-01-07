{
  "filepath": "/tmp/Math-65b/src/main/java/org/apache/commons/math/linear/BlockFieldMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BlockFieldMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.AbstractFieldMatrix\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 67,
      "end_line": 1668,
      "comment": "\n * Cache-friendly implementation of FieldMatrix using a flat arrays to store\n * square blocks of the matrix.\n * \u003cp\u003e\n * This implementation is specially designed to be cache-friendly. Square blocks are\n * stored as small arrays and allow efficient traversal of data both in row major direction\n * and columns major direction, one block at a time. This greatly increases performances\n * for algorithms that use crossed directions loops like multiplication or transposition.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The size of square blocks is a static parameter. It may be tuned according to the cache\n * size of the target computer processor. As a rule of thumbs, it should be the largest\n * value that allows three blocks to be simultaneously cached (this is necessary for example\n * for matrix multiplication). The default value is to use 36x36 blocks.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The regular blocks represent {@link #BLOCK_SIZE} x {@link #BLOCK_SIZE} squares. Blocks\n * at right hand side and bottom side which may be smaller to fit matrix dimensions. The square\n * blocks are flattened in row major order in single dimension arrays which are therefore\n * {@link #BLOCK_SIZE}\u003csup\u003e2\u003c/sup\u003e elements long for regular blocks. The blocks are themselves\n * organized in row major order.\n * \u003c/p\u003e\n * \u003cp\u003e\n * As an example, for a block size of 36x36, a 100x60 matrix would be stored in 6 blocks.\n * Block 0 would be a Field[1296] array holding the upper left 36x36 square, block 1 would be\n * a Field[1296] array holding the upper center 36x36 square, block 2 would be a Field[1008]\n * array holding the upper right 36x28 rectangle, block 3 would be a Field[864] array holding\n * the lower left 24x36 rectangle, block 4 would be a Field[864] array holding the lower center\n * 24x36 rectangle and block 5 would be a Field[672] array holding the lower right 24x28\n * rectangle.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The layout complexity overhead versus simple mapping of matrices to java\n * arrays is negligible for small matrices (about 1%). The gain from cache efficiency leads\n * to up to 3-fold improvements for matrices of moderate to large size.\n * \u003c/p\u003e\n * @param \u003cT\u003e the type of the field elements\n * @version $Revision$ $Date$\n * @since 2.0\n "
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
        "serialVersionUID"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "blocks"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Blocks of matrix entries. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Number of rows of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "columns"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Number of columns of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "blockRows"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Number of block rows of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "blockColumns"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Number of block columns of the matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.BlockFieldMatrix(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 99,
      "end_line": 113,
      "comment": "\n     * Create a new matrix with the supplied row and column dimensions.\n     *\n     * @param field field to which the elements belong\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @throws IllegalArgumentException if row or column dimension is not\n     *  positive\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 36)",
        "(line 103,col 9)-(line 103,col 28)",
        "(line 104,col 9)-(line 104,col 31)",
        "(line 107,col 9)-(line 107,col 63)",
        "(line 108,col 9)-(line 108,col 63)",
        "(line 111,col 9)-(line 111,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.BlockFieldMatrix(T[][])",
      "begin_line": 128,
      "end_line": 131,
      "comment": "\n     * Create a new dense matrix copying entries from raw layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in raw layout.\u003c/p\u003e\n     * \u003cp\u003eCalling this constructor is equivalent to call:\n     * \u003cpre\u003ematrix \u003d new BlockFieldMatrix\u003cT\u003e(getField(), rawData.length, rawData[0].length,\n     *                                   toBlocksLayout(rawData), false);\u003c/pre\u003e\n     * \u003c/p\u003e\n     * @param rawData data for new matrix, in raw layout\n     *\n     * @exception IllegalArgumentException if \u003ccode\u003eblockData\u003c/code\u003e shape is\n     * inconsistent with block layout\n     * @see #BlockFieldMatrix(int, int, FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 80)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.BlockFieldMatrix(int, int, T[][], boolean)",
      "begin_line": 148,
      "end_line": 183,
      "comment": "\n     * Create a new dense matrix copying entries from block layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in blocks layout.\u003c/p\u003e\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @param blockData data for new matrix\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     *\n     * @exception IllegalArgumentException if \u003ccode\u003eblockData\u003c/code\u003e shape is\n     * inconsistent with block layout\n     * @see #createBlocksLayout(Field, int, int)\n     * @see #toBlocksLayout(FieldElement[][])\n     * @see #BlockFieldMatrix(FieldElement[][])\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 54)",
        "(line 153,col 9)-(line 153,col 28)",
        "(line 154,col 9)-(line 154,col 31)",
        "(line 157,col 9)-(line 157,col 63)",
        "(line 158,col 9)-(line 158,col 63)",
        "(line 160,col 9)-(line 166,col 9)",
        "(line 168,col 9)-(line 168,col 22)",
        "(line 169,col 9)-(line 181,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.toBlocksLayout(T[][])",
      "begin_line": 209,
      "end_line": 258,
      "comment": "\n     * Convert a data array from raw layout to blocks layout.\n     * \u003cp\u003e\n     * Raw layout is the straightforward layout where element at row i and\n     * column j is in array element \u003ccode\u003erawData[i][j]\u003c/code\u003e. Blocks layout\n     * is the layout used in {@link BlockFieldMatrix} instances, where the matrix\n     * is split in square blocks (except at right and bottom side where blocks may\n     * be rectangular to fit matrix size) and each block is stored in a flattened\n     * one-dimensional array.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method creates an array in blocks layout from an input array in raw layout.\n     * It can be used to provide the array argument of the {@link\n     * #BlockFieldMatrix(int, int, FieldElement[][], boolean)}\n     * constructor.\n     * \u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param rawData data array in raw layout\n     * @return a new data array containing the same entries but in blocks layout\n     * @exception IllegalArgumentException if \u003ccode\u003erawData\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length)\n     * @see #createBlocksLayout(Field, int, int)\n     * @see #BlockFieldMatrix(int, int, FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 48)",
        "(line 213,col 9)-(line 213,col 51)",
        "(line 214,col 9)-(line 214,col 73)",
        "(line 215,col 9)-(line 215,col 73)",
        "(line 218,col 9)-(line 225,col 9)",
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
      "end_line": 856,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 811,col 9)-(line 811,col 50)",
        "(line 812,col 9)-(line 814,col 9)",
        "(line 815,col 9)-(line 815,col 57)",
        "(line 816,col 9)-(line 816,col 53)",
        "(line 817,col 9)-(line 817,col 60)",
        "(line 818,col 9)-(line 824,col 9)",
        "(line 827,col 9)-(line 827,col 54)",
        "(line 828,col 9)-(line 828,col 72)",
        "(line 829,col 9)-(line 829,col 57)",
        "(line 830,col 9)-(line 830,col 75)",
        "(line 833,col 9)-(line 855,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getRowMatrix(int)",
      "begin_line": 859,
      "end_line": 889,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 863,col 9)-(line 863,col 27)",
        "(line 864,col 9)-(line 864,col 88)",
        "(line 867,col 9)-(line 867,col 45)",
        "(line 868,col 9)-(line 868,col 54)",
        "(line 869,col 9)-(line 869,col 30)",
        "(line 870,col 9)-(line 870,col 30)",
        "(line 871,col 9)-(line 871,col 49)",
        "(line 872,col 9)-(line 885,col 9)",
        "(line 887,col 9)-(line 887,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setRowMatrix(int, org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 892,
      "end_line": 900,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 895,col 9)-(line 899,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setRowMatrix(int, org.apache.commons.math.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 913,
      "end_line": 947,
      "comment": "\n     * Sets the entries in row number \u003ccode\u003erow\u003c/code\u003e\n     * as a row matrix.  Row indices start at 0.\n     *\n     * @param row the row to be set\n     * @param matrix row matrix (must have one row and the same number of columns\n     * as the instance)\n     * @throws MatrixIndexException if the specified row index is invalid\n     * @throws InvalidMatrixException if the matrix dimensions do not match one\n     * instance row\n     ",
      "child_ranges": [
        "(line 916,col 9)-(line 916,col 27)",
        "(line 917,col 9)-(line 917,col 47)",
        "(line 918,col 9)-(line 924,col 9)",
        "(line 927,col 9)-(line 927,col 44)",
        "(line 928,col 9)-(line 928,col 53)",
        "(line 929,col 9)-(line 929,col 29)",
        "(line 930,col 9)-(line 930,col 29)",
        "(line 931,col 9)-(line 931,col 49)",
        "(line 932,col 9)-(line 945,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getColumnMatrix(int)",
      "begin_line": 950,
      "end_line": 978,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 954,col 9)-(line 954,col 33)",
        "(line 955,col 9)-(line 955,col 85)",
        "(line 958,col 9)-(line 958,col 48)",
        "(line 959,col 9)-(line 959,col 57)",
        "(line 960,col 9)-(line 960,col 47)",
        "(line 961,col 9)-(line 961,col 30)",
        "(line 962,col 9)-(line 962,col 30)",
        "(line 963,col 9)-(line 963,col 49)",
        "(line 964,col 9)-(line 974,col 9)",
        "(line 976,col 9)-(line 976,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setColumnMatrix(int, org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 981,
      "end_line": 989,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 984,col 9)-(line 988,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setColumnMatrix(int, org.apache.commons.math.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 1002,
      "end_line": 1034,
      "comment": "\n     * Sets the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n     * as a column matrix.  Column indices start at 0.\n     *\n     * @param column the column to be set\n     * @param matrix column matrix (must have one column and the same number of rows\n     * as the instance)\n     * @throws MatrixIndexException if the specified column index is invalid\n     * @throws InvalidMatrixException if the matrix dimensions do not match one\n     * instance column\n     ",
      "child_ranges": [
        "(line 1005,col 9)-(line 1005,col 33)",
        "(line 1006,col 9)-(line 1006,col 44)",
        "(line 1007,col 9)-(line 1013,col 9)",
        "(line 1016,col 9)-(line 1016,col 48)",
        "(line 1017,col 9)-(line 1017,col 57)",
        "(line 1018,col 9)-(line 1018,col 47)",
        "(line 1019,col 9)-(line 1019,col 28)",
        "(line 1020,col 9)-(line 1020,col 28)",
        "(line 1021,col 9)-(line 1021,col 48)",
        "(line 1022,col 9)-(line 1032,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getRowVector(int)",
      "begin_line": 1037,
      "end_line": 1057,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1041,col 9)-(line 1041,col 27)",
        "(line 1042,col 9)-(line 1042,col 60)",
        "(line 1045,col 9)-(line 1045,col 45)",
        "(line 1046,col 9)-(line 1046,col 54)",
        "(line 1047,col 9)-(line 1047,col 30)",
        "(line 1048,col 9)-(line 1053,col 9)",
        "(line 1055,col 9)-(line 1055,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setRowVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 1060,
      "end_line": 1068,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1063,col 9)-(line 1067,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getColumnVector(int)",
      "begin_line": 1071,
      "end_line": 1093,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1075,col 9)-(line 1075,col 33)",
        "(line 1076,col 9)-(line 1076,col 57)",
        "(line 1079,col 9)-(line 1079,col 48)",
        "(line 1080,col 9)-(line 1080,col 57)",
        "(line 1081,col 9)-(line 1081,col 47)",
        "(line 1082,col 9)-(line 1082,col 30)",
        "(line 1083,col 9)-(line 1089,col 9)",
        "(line 1091,col 9)-(line 1091,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setColumnVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 1096,
      "end_line": 1104,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1099,col 9)-(line 1103,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getRow(int)",
      "begin_line": 1107,
      "end_line": 1127,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1111,col 9)-(line 1111,col 27)",
        "(line 1112,col 9)-(line 1112,col 56)",
        "(line 1115,col 9)-(line 1115,col 45)",
        "(line 1116,col 9)-(line 1116,col 54)",
        "(line 1117,col 9)-(line 1117,col 30)",
        "(line 1118,col 9)-(line 1123,col 9)",
        "(line 1125,col 9)-(line 1125,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setRow(int, T[])",
      "begin_line": 1130,
      "end_line": 1153,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1134,col 9)-(line 1134,col 27)",
        "(line 1135,col 9)-(line 1135,col 47)",
        "(line 1136,col 9)-(line 1140,col 9)",
        "(line 1143,col 9)-(line 1143,col 45)",
        "(line 1144,col 9)-(line 1144,col 54)",
        "(line 1145,col 9)-(line 1145,col 30)",
        "(line 1146,col 9)-(line 1151,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getColumn(int)",
      "begin_line": 1156,
      "end_line": 1178,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1160,col 9)-(line 1160,col 33)",
        "(line 1161,col 9)-(line 1161,col 53)",
        "(line 1164,col 9)-(line 1164,col 48)",
        "(line 1165,col 9)-(line 1165,col 57)",
        "(line 1166,col 9)-(line 1166,col 47)",
        "(line 1167,col 9)-(line 1167,col 30)",
        "(line 1168,col 9)-(line 1174,col 9)",
        "(line 1176,col 9)-(line 1176,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setColumn(int, T[])",
      "begin_line": 1181,
      "end_line": 1206,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1185,col 9)-(line 1185,col 33)",
        "(line 1186,col 9)-(line 1186,col 44)",
        "(line 1187,col 9)-(line 1191,col 9)",
        "(line 1194,col 9)-(line 1194,col 48)",
        "(line 1195,col 9)-(line 1195,col 57)",
        "(line 1196,col 9)-(line 1196,col 47)",
        "(line 1197,col 9)-(line 1197,col 30)",
        "(line 1198,col 9)-(line 1204,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getEntry(int, int)",
      "begin_line": 1209,
      "end_line": 1223,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1212,col 9)-(line 1222,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setEntry(int, int, T)",
      "begin_line": 1226,
      "end_line": 1240,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1229,col 9)-(line 1239,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.addToEntry(int, int, T)",
      "begin_line": 1243,
      "end_line": 1258,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1246,col 9)-(line 1257,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.multiplyEntry(int, int, T)",
      "begin_line": 1261,
      "end_line": 1276,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1264,col 9)-(line 1275,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.transpose()",
      "begin_line": 1279,
      "end_line": 1317,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1282,col 9)-(line 1282,col 44)",
        "(line 1283,col 9)-(line 1283,col 47)",
        "(line 1284,col 9)-(line 1284,col 90)",
        "(line 1287,col 9)-(line 1287,col 27)",
        "(line 1288,col 9)-(line 1313,col 9)",
        "(line 1315,col 9)-(line 1315,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getRowDimension()",
      "begin_line": 1320,
      "end_line": 1323,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1322,col 9)-(line 1322,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getColumnDimension()",
      "begin_line": 1326,
      "end_line": 1329,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1328,col 9)-(line 1328,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.operate(T[])",
      "begin_line": 1332,
      "end_line": 1375,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1336,col 9)-(line 1340,col 9)",
        "(line 1341,col 9)-(line 1341,col 53)",
        "(line 1342,col 9)-(line 1342,col 44)",
        "(line 1345,col 9)-(line 1371,col 9)",
        "(line 1373,col 9)-(line 1373,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.preMultiply(T[])",
      "begin_line": 1378,
      "end_line": 1426,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1382,col 9)-(line 1386,col 9)",
        "(line 1387,col 9)-(line 1387,col 56)",
        "(line 1388,col 9)-(line 1388,col 44)",
        "(line 1391,col 9)-(line 1422,col 9)",
        "(line 1424,col 9)-(line 1424,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 1429,
      "end_line": 1451,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1432,col 9)-(line 1432,col 66)",
        "(line 1433,col 9)-(line 1449,col 9)",
        "(line 1450,col 9)-(line 1450,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 1454,
      "end_line": 1476,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1457,col 9)-(line 1457,col 66)",
        "(line 1458,col 9)-(line 1474,col 9)",
        "(line 1475,col 9)-(line 1475,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1479,
      "end_line": 1506,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1484,col 9)-(line 1484,col 70)",
        "(line 1485,col 9)-(line 1485,col 79)",
        "(line 1486,col 9)-(line 1504,col 9)",
        "(line 1505,col 9)-(line 1505,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1509,
      "end_line": 1536,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1514,col 9)-(line 1514,col 70)",
        "(line 1515,col 9)-(line 1515,col 79)",
        "(line 1516,col 9)-(line 1534,col 9)",
        "(line 1535,col 9)-(line 1535,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 1539,
      "end_line": 1562,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1542,col 9)-(line 1542,col 66)",
        "(line 1543,col 9)-(line 1543,col 27)",
        "(line 1544,col 9)-(line 1560,col 9)",
        "(line 1561,col 9)-(line 1561,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 1565,
      "end_line": 1588,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1568,col 9)-(line 1568,col 66)",
        "(line 1569,col 9)-(line 1569,col 27)",
        "(line 1570,col 9)-(line 1586,col 9)",
        "(line 1587,col 9)-(line 1587,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1591,
      "end_line": 1618,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1596,col 9)-(line 1596,col 70)",
        "(line 1597,col 9)-(line 1597,col 79)",
        "(line 1598,col 9)-(line 1616,col 9)",
        "(line 1617,col 9)-(line 1617,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1621,
      "end_line": 1648,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1626,col 9)-(line 1626,col 70)",
        "(line 1627,col 9)-(line 1627,col 79)",
        "(line 1628,col 9)-(line 1646,col 9)",
        "(line 1647,col 9)-(line 1647,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.blockHeight(int)",
      "begin_line": 1655,
      "end_line": 1657,
      "comment": "\n     * Get the height of a block.\n     * @param blockRow row index (in block sense) of the block\n     * @return height (number of rows) of the block\n     ",
      "child_ranges": [
        "(line 1656,col 9)-(line 1656,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.blockWidth(int)",
      "begin_line": 1664,
      "end_line": 1666,
      "comment": "\n     * Get the width of a block.\n     * @param blockColumn column index (in block sense) of the block\n     * @return width (number of columns) of the block\n     ",
      "child_ranges": [
        "(line 1665,col 9)-(line 1665,col 99)"
      ]
    }
  ]
}