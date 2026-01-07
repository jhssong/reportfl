{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/linear/BlockFieldMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BlockFieldMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.AbstractFieldMatrix\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 66,
      "end_line": 1667,
      "comment": "\n * Cache-friendly implementation of FieldMatrix using a flat arrays to store\n * square blocks of the matrix.\n * \u003cp\u003e\n * This implementation is specially designed to be cache-friendly. Square blocks are\n * stored as small arrays and allow efficient traversal of data both in row major direction\n * and columns major direction, one block at a time. This greatly increases performances\n * for algorithms that use crossed directions loops like multiplication or transposition.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The size of square blocks is a static parameter. It may be tuned according to the cache\n * size of the target computer processor. As a rule of thumbs, it should be the largest\n * value that allows three blocks to be simultaneously cached (this is necessary for example\n * for matrix multiplication). The default value is to use 36x36 blocks.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The regular blocks represent {@link #BLOCK_SIZE} x {@link #BLOCK_SIZE} squares. Blocks\n * at right hand side and bottom side which may be smaller to fit matrix dimensions. The square\n * blocks are flattened in row major order in single dimension arrays which are therefore\n * {@link #BLOCK_SIZE}\u003csup\u003e2\u003c/sup\u003e elements long for regular blocks. The blocks are themselves\n * organized in row major order.\n * \u003c/p\u003e\n * \u003cp\u003e\n * As an example, for a block size of 36x36, a 100x60 matrix would be stored in 6 blocks.\n * Block 0 would be a Field[1296] array holding the upper left 36x36 square, block 1 would be\n * a Field[1296] array holding the upper center 36x36 square, block 2 would be a Field[1008]\n * array holding the upper right 36x28 rectangle, block 3 would be a Field[864] array holding\n * the lower left 24x36 rectangle, block 4 would be a Field[864] array holding the lower center\n * 24x36 rectangle and block 5 would be a Field[672] array holding the lower right 24x28\n * rectangle.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The layout complexity overhead versus simple mapping of matrices to java\n * arrays is negligible for small matrices (about 1%). The gain from cache efficiency leads\n * to up to 3-fold improvements for matrices of moderate to large size.\n * \u003c/p\u003e\n * @param \u003cT\u003e the type of the field elements\n * @version $Revision$ $Date$\n * @since 2.0\n "
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
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.BlockFieldMatrix(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 98,
      "end_line": 112,
      "comment": "\n     * Create a new matrix with the supplied row and column dimensions.\n     *\n     * @param field field to which the elements belong\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @throws IllegalArgumentException if row or column dimension is not\n     *  positive\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 36)",
        "(line 102,col 9)-(line 102,col 28)",
        "(line 103,col 9)-(line 103,col 31)",
        "(line 106,col 9)-(line 106,col 63)",
        "(line 107,col 9)-(line 107,col 63)",
        "(line 110,col 9)-(line 110,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.BlockFieldMatrix(T[][])",
      "begin_line": 127,
      "end_line": 130,
      "comment": "\n     * Create a new dense matrix copying entries from raw layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in raw layout.\u003c/p\u003e\n     * \u003cp\u003eCalling this constructor is equivalent to call:\n     * \u003cpre\u003ematrix \u003d new BlockFieldMatrix\u003cT\u003e(getField(), rawData.length, rawData[0].length,\n     *                                   toBlocksLayout(rawData), false);\u003c/pre\u003e\n     * \u003c/p\u003e\n     * @param rawData data for new matrix, in raw layout\n     *\n     * @exception IllegalArgumentException if \u003ccode\u003eblockData\u003c/code\u003e shape is\n     * inconsistent with block layout\n     * @see #BlockFieldMatrix(int, int, FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 80)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.BlockFieldMatrix(int, int, T[][], boolean)",
      "begin_line": 147,
      "end_line": 182,
      "comment": "\n     * Create a new dense matrix copying entries from block layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in blocks layout.\u003c/p\u003e\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @param blockData data for new matrix\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     *\n     * @exception IllegalArgumentException if \u003ccode\u003eblockData\u003c/code\u003e shape is\n     * inconsistent with block layout\n     * @see #createBlocksLayout(Field, int, int)\n     * @see #toBlocksLayout(FieldElement[][])\n     * @see #BlockFieldMatrix(FieldElement[][])\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 54)",
        "(line 152,col 9)-(line 152,col 28)",
        "(line 153,col 9)-(line 153,col 31)",
        "(line 156,col 9)-(line 156,col 63)",
        "(line 157,col 9)-(line 157,col 63)",
        "(line 159,col 9)-(line 165,col 9)",
        "(line 167,col 9)-(line 167,col 22)",
        "(line 168,col 9)-(line 180,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.toBlocksLayout(T[][])",
      "begin_line": 208,
      "end_line": 257,
      "comment": "\n     * Convert a data array from raw layout to blocks layout.\n     * \u003cp\u003e\n     * Raw layout is the straightforward layout where element at row i and\n     * column j is in array element \u003ccode\u003erawData[i][j]\u003c/code\u003e. Blocks layout\n     * is the layout used in {@link BlockFieldMatrix} instances, where the matrix\n     * is split in square blocks (except at right and bottom side where blocks may\n     * be rectangular to fit matrix size) and each block is stored in a flattened\n     * one-dimensional array.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method creates an array in blocks layout from an input array in raw layout.\n     * It can be used to provide the array argument of the {@link\n     * #BlockFieldMatrix(int, int, FieldElement[][], boolean)}\n     * constructor.\n     * \u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param rawData data array in raw layout\n     * @return a new data array containing the same entries but in blocks layout\n     * @exception IllegalArgumentException if \u003ccode\u003erawData\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length)\n     * @see #createBlocksLayout(Field, int, int)\n     * @see #BlockFieldMatrix(int, int, FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 48)",
        "(line 212,col 9)-(line 212,col 51)",
        "(line 213,col 9)-(line 213,col 73)",
        "(line 214,col 9)-(line 214,col 73)",
        "(line 217,col 9)-(line 224,col 9)",
        "(line 227,col 9)-(line 227,col 53)",
        "(line 228,col 9)-(line 228,col 77)",
        "(line 229,col 9)-(line 229,col 27)",
        "(line 230,col 9)-(line 253,col 9)",
        "(line 255,col 9)-(line 255,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.createBlocksLayout(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 274,
      "end_line": 297,
      "comment": "\n     * Create a data array in blocks layout.\n     * \u003cp\u003e\n     * This method can be used to create the array argument of the {@link\n     * #BlockFieldMatrix(int, int, FieldElement[][], boolean)}\n     * constructor.\n     * \u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param field field to which the elements belong\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @return a new data array in blocks layout\n     * @see #toBlocksLayout(FieldElement[][])\n     * @see #BlockFieldMatrix(int, int, FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 73)",
        "(line 278,col 9)-(line 278,col 73)",
        "(line 280,col 9)-(line 280,col 77)",
        "(line 281,col 9)-(line 281,col 27)",
        "(line 282,col 9)-(line 293,col 9)",
        "(line 295,col 9)-(line 295,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.createMatrix(int, int)",
      "begin_line": 300,
      "end_line": 304,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.copy()",
      "begin_line": 307,
      "end_line": 320,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 88)",
        "(line 314,col 9)-(line 316,col 9)",
        "(line 318,col 9)-(line 318,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.add(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 323,
      "end_line": 364,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 326,col 9)-(line 363,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.add(org.apache.commons.math.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 373,
      "end_line": 393,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 35)",
        "(line 379,col 9)-(line 379,col 91)",
        "(line 382,col 9)-(line 389,col 9)",
        "(line 391,col 9)-(line 391,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.subtract(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 396,
      "end_line": 437,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 399,col 9)-(line 436,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.subtract(org.apache.commons.math.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 446,
      "end_line": 466,
      "comment": "\n     * Compute this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this - m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 38)",
        "(line 452,col 9)-(line 452,col 91)",
        "(line 455,col 9)-(line 462,col 9)",
        "(line 464,col 9)-(line 464,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.scalarAdd(T)",
      "begin_line": 469,
      "end_line": 486,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 91)",
        "(line 476,col 9)-(line 482,col 9)",
        "(line 484,col 9)-(line 484,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.scalarMultiply(T)",
      "begin_line": 489,
      "end_line": 506,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 91)",
        "(line 496,col 9)-(line 502,col 9)",
        "(line 504,col 9)-(line 504,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.multiply(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 509,
      "end_line": 568,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 512,col 9)-(line 567,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.multiply(org.apache.commons.math.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 578,
      "end_line": 642,
      "comment": "\n     * Returns the result of postmultiplying this by m.\n     *\n     * @param m    matrix to postmultiply by\n     * @return     this * m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 41)",
        "(line 583,col 9)-(line 583,col 93)",
        "(line 584,col 9)-(line 584,col 44)",
        "(line 587,col 9)-(line 587,col 27)",
        "(line 588,col 9)-(line 638,col 9)",
        "(line 640,col 9)-(line 640,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getData()",
      "begin_line": 645,
      "end_line": 672,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 648,col 9)-(line 648,col 91)",
        "(line 649,col 9)-(line 649,col 74)",
        "(line 651,col 9)-(line 668,col 9)",
        "(line 670,col 9)-(line 670,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 675,
      "end_line": 772,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 681,col 9)-(line 681,col 70)",
        "(line 684,col 9)-(line 685,col 100)",
        "(line 688,col 9)-(line 688,col 62)",
        "(line 689,col 9)-(line 689,col 62)",
        "(line 690,col 9)-(line 690,col 62)",
        "(line 691,col 9)-(line 691,col 62)",
        "(line 694,col 9)-(line 694,col 35)",
        "(line 695,col 9)-(line 768,col 9)",
        "(line 770,col 9)-(line 770,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.copyBlockPart(T[], int, int, int, int, int, T[], int, int, int)",
      "begin_line": 789,
      "end_line": 802,
      "comment": "\n     * Copy a part of a block into another one\n     * \u003cp\u003eThis method can be called only when the specified part fits in both\n     * blocks, no verification is done here.\u003c/p\u003e\n     * @param srcBlock source block\n     * @param srcWidth source block width ({@link #BLOCK_SIZE} or smaller)\n     * @param srcStartRow start row in the source block\n     * @param srcEndRow end row (exclusive) in the source block\n     * @param srcStartColumn start column in the source block\n     * @param srcEndColumn end column (exclusive) in the source block\n     * @param dstBlock destination block\n     * @param dstWidth destination block width ({@link #BLOCK_SIZE} or smaller)\n     * @param dstStartRow start row in the destination block\n     * @param dstStartColumn start column in the destination block\n     ",
      "child_ranges": [
        "(line 794,col 9)-(line 794,col 57)",
        "(line 795,col 9)-(line 795,col 61)",
        "(line 796,col 9)-(line 796,col 61)",
        "(line 797,col 9)-(line 801,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setSubMatrix(T[][], int, int)",
      "begin_line": 805,
      "end_line": 855,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 810,col 9)-(line 810,col 50)",
        "(line 811,col 9)-(line 813,col 9)",
        "(line 814,col 9)-(line 814,col 57)",
        "(line 815,col 9)-(line 815,col 53)",
        "(line 816,col 9)-(line 816,col 60)",
        "(line 817,col 9)-(line 823,col 9)",
        "(line 826,col 9)-(line 826,col 54)",
        "(line 827,col 9)-(line 827,col 72)",
        "(line 828,col 9)-(line 828,col 57)",
        "(line 829,col 9)-(line 829,col 75)",
        "(line 832,col 9)-(line 854,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getRowMatrix(int)",
      "begin_line": 858,
      "end_line": 888,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 862,col 9)-(line 862,col 27)",
        "(line 863,col 9)-(line 863,col 88)",
        "(line 866,col 9)-(line 866,col 45)",
        "(line 867,col 9)-(line 867,col 54)",
        "(line 868,col 9)-(line 868,col 30)",
        "(line 869,col 9)-(line 869,col 30)",
        "(line 870,col 9)-(line 870,col 49)",
        "(line 871,col 9)-(line 884,col 9)",
        "(line 886,col 9)-(line 886,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setRowMatrix(int, org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 891,
      "end_line": 899,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 894,col 9)-(line 898,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setRowMatrix(int, org.apache.commons.math.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 912,
      "end_line": 946,
      "comment": "\n     * Sets the entries in row number \u003ccode\u003erow\u003c/code\u003e\n     * as a row matrix.  Row indices start at 0.\n     *\n     * @param row the row to be set\n     * @param matrix row matrix (must have one row and the same number of columns\n     * as the instance)\n     * @throws MatrixIndexException if the specified row index is invalid\n     * @throws InvalidMatrixException if the matrix dimensions do not match one\n     * instance row\n     ",
      "child_ranges": [
        "(line 915,col 9)-(line 915,col 27)",
        "(line 916,col 9)-(line 916,col 47)",
        "(line 917,col 9)-(line 923,col 9)",
        "(line 926,col 9)-(line 926,col 44)",
        "(line 927,col 9)-(line 927,col 53)",
        "(line 928,col 9)-(line 928,col 29)",
        "(line 929,col 9)-(line 929,col 29)",
        "(line 930,col 9)-(line 930,col 49)",
        "(line 931,col 9)-(line 944,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getColumnMatrix(int)",
      "begin_line": 949,
      "end_line": 977,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 953,col 9)-(line 953,col 33)",
        "(line 954,col 9)-(line 954,col 85)",
        "(line 957,col 9)-(line 957,col 48)",
        "(line 958,col 9)-(line 958,col 57)",
        "(line 959,col 9)-(line 959,col 47)",
        "(line 960,col 9)-(line 960,col 30)",
        "(line 961,col 9)-(line 961,col 30)",
        "(line 962,col 9)-(line 962,col 49)",
        "(line 963,col 9)-(line 973,col 9)",
        "(line 975,col 9)-(line 975,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setColumnMatrix(int, org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 980,
      "end_line": 988,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 983,col 9)-(line 987,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setColumnMatrix(int, org.apache.commons.math.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 1001,
      "end_line": 1033,
      "comment": "\n     * Sets the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n     * as a column matrix.  Column indices start at 0.\n     *\n     * @param column the column to be set\n     * @param matrix column matrix (must have one column and the same number of rows\n     * as the instance)\n     * @throws MatrixIndexException if the specified column index is invalid\n     * @throws InvalidMatrixException if the matrix dimensions do not match one\n     * instance column\n     ",
      "child_ranges": [
        "(line 1004,col 9)-(line 1004,col 33)",
        "(line 1005,col 9)-(line 1005,col 44)",
        "(line 1006,col 9)-(line 1012,col 9)",
        "(line 1015,col 9)-(line 1015,col 48)",
        "(line 1016,col 9)-(line 1016,col 57)",
        "(line 1017,col 9)-(line 1017,col 47)",
        "(line 1018,col 9)-(line 1018,col 28)",
        "(line 1019,col 9)-(line 1019,col 28)",
        "(line 1020,col 9)-(line 1020,col 48)",
        "(line 1021,col 9)-(line 1031,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getRowVector(int)",
      "begin_line": 1036,
      "end_line": 1056,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1040,col 9)-(line 1040,col 27)",
        "(line 1041,col 9)-(line 1041,col 60)",
        "(line 1044,col 9)-(line 1044,col 45)",
        "(line 1045,col 9)-(line 1045,col 54)",
        "(line 1046,col 9)-(line 1046,col 30)",
        "(line 1047,col 9)-(line 1052,col 9)",
        "(line 1054,col 9)-(line 1054,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setRowVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 1059,
      "end_line": 1067,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1062,col 9)-(line 1066,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getColumnVector(int)",
      "begin_line": 1070,
      "end_line": 1092,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1074,col 9)-(line 1074,col 33)",
        "(line 1075,col 9)-(line 1075,col 57)",
        "(line 1078,col 9)-(line 1078,col 48)",
        "(line 1079,col 9)-(line 1079,col 57)",
        "(line 1080,col 9)-(line 1080,col 47)",
        "(line 1081,col 9)-(line 1081,col 30)",
        "(line 1082,col 9)-(line 1088,col 9)",
        "(line 1090,col 9)-(line 1090,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setColumnVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 1095,
      "end_line": 1103,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1098,col 9)-(line 1102,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getRow(int)",
      "begin_line": 1106,
      "end_line": 1126,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1110,col 9)-(line 1110,col 27)",
        "(line 1111,col 9)-(line 1111,col 56)",
        "(line 1114,col 9)-(line 1114,col 45)",
        "(line 1115,col 9)-(line 1115,col 54)",
        "(line 1116,col 9)-(line 1116,col 30)",
        "(line 1117,col 9)-(line 1122,col 9)",
        "(line 1124,col 9)-(line 1124,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setRow(int, T[])",
      "begin_line": 1129,
      "end_line": 1152,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1133,col 9)-(line 1133,col 27)",
        "(line 1134,col 9)-(line 1134,col 47)",
        "(line 1135,col 9)-(line 1139,col 9)",
        "(line 1142,col 9)-(line 1142,col 45)",
        "(line 1143,col 9)-(line 1143,col 54)",
        "(line 1144,col 9)-(line 1144,col 30)",
        "(line 1145,col 9)-(line 1150,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getColumn(int)",
      "begin_line": 1155,
      "end_line": 1177,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1159,col 9)-(line 1159,col 33)",
        "(line 1160,col 9)-(line 1160,col 53)",
        "(line 1163,col 9)-(line 1163,col 48)",
        "(line 1164,col 9)-(line 1164,col 57)",
        "(line 1165,col 9)-(line 1165,col 47)",
        "(line 1166,col 9)-(line 1166,col 30)",
        "(line 1167,col 9)-(line 1173,col 9)",
        "(line 1175,col 9)-(line 1175,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setColumn(int, T[])",
      "begin_line": 1180,
      "end_line": 1205,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1184,col 9)-(line 1184,col 33)",
        "(line 1185,col 9)-(line 1185,col 44)",
        "(line 1186,col 9)-(line 1190,col 9)",
        "(line 1193,col 9)-(line 1193,col 48)",
        "(line 1194,col 9)-(line 1194,col 57)",
        "(line 1195,col 9)-(line 1195,col 47)",
        "(line 1196,col 9)-(line 1196,col 30)",
        "(line 1197,col 9)-(line 1203,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getEntry(int, int)",
      "begin_line": 1208,
      "end_line": 1222,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1211,col 9)-(line 1221,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setEntry(int, int, T)",
      "begin_line": 1225,
      "end_line": 1239,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1228,col 9)-(line 1238,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.addToEntry(int, int, T)",
      "begin_line": 1242,
      "end_line": 1257,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1245,col 9)-(line 1256,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.multiplyEntry(int, int, T)",
      "begin_line": 1260,
      "end_line": 1275,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1263,col 9)-(line 1274,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.transpose()",
      "begin_line": 1278,
      "end_line": 1316,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1281,col 9)-(line 1281,col 44)",
        "(line 1282,col 9)-(line 1282,col 47)",
        "(line 1283,col 9)-(line 1283,col 90)",
        "(line 1286,col 9)-(line 1286,col 27)",
        "(line 1287,col 9)-(line 1312,col 9)",
        "(line 1314,col 9)-(line 1314,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getRowDimension()",
      "begin_line": 1319,
      "end_line": 1322,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1321,col 9)-(line 1321,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getColumnDimension()",
      "begin_line": 1325,
      "end_line": 1328,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1327,col 9)-(line 1327,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.operate(T[])",
      "begin_line": 1331,
      "end_line": 1374,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1335,col 9)-(line 1339,col 9)",
        "(line 1340,col 9)-(line 1340,col 53)",
        "(line 1341,col 9)-(line 1341,col 44)",
        "(line 1344,col 9)-(line 1370,col 9)",
        "(line 1372,col 9)-(line 1372,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.preMultiply(T[])",
      "begin_line": 1377,
      "end_line": 1425,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1381,col 9)-(line 1385,col 9)",
        "(line 1386,col 9)-(line 1386,col 56)",
        "(line 1387,col 9)-(line 1387,col 44)",
        "(line 1390,col 9)-(line 1421,col 9)",
        "(line 1423,col 9)-(line 1423,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 1428,
      "end_line": 1450,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1431,col 9)-(line 1431,col 66)",
        "(line 1432,col 9)-(line 1448,col 9)",
        "(line 1449,col 9)-(line 1449,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 1453,
      "end_line": 1475,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1456,col 9)-(line 1456,col 66)",
        "(line 1457,col 9)-(line 1473,col 9)",
        "(line 1474,col 9)-(line 1474,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
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
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1508,
      "end_line": 1535,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1513,col 9)-(line 1513,col 70)",
        "(line 1514,col 9)-(line 1514,col 79)",
        "(line 1515,col 9)-(line 1533,col 9)",
        "(line 1534,col 9)-(line 1534,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 1538,
      "end_line": 1561,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1541,col 9)-(line 1541,col 66)",
        "(line 1542,col 9)-(line 1542,col 27)",
        "(line 1543,col 9)-(line 1559,col 9)",
        "(line 1560,col 9)-(line 1560,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 1564,
      "end_line": 1587,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1567,col 9)-(line 1567,col 66)",
        "(line 1568,col 9)-(line 1568,col 27)",
        "(line 1569,col 9)-(line 1585,col 9)",
        "(line 1586,col 9)-(line 1586,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
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
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1620,
      "end_line": 1647,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1625,col 9)-(line 1625,col 70)",
        "(line 1626,col 9)-(line 1626,col 79)",
        "(line 1627,col 9)-(line 1645,col 9)",
        "(line 1646,col 9)-(line 1646,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.blockHeight(int)",
      "begin_line": 1654,
      "end_line": 1656,
      "comment": "\n     * Get the height of a block.\n     * @param blockRow row index (in block sense) of the block\n     * @return height (number of rows) of the block\n     ",
      "child_ranges": [
        "(line 1655,col 9)-(line 1655,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.blockWidth(int)",
      "begin_line": 1663,
      "end_line": 1665,
      "comment": "\n     * Get the width of a block.\n     * @param blockColumn column index (in block sense) of the block\n     * @return width (number of columns) of the block\n     ",
      "child_ranges": [
        "(line 1664,col 9)-(line 1664,col 99)"
      ]
    }
  ]
}