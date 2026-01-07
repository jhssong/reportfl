{
  "filepath": "/tmp/Math-13b/src/main/java/org/apache/commons/math3/linear/BlockFieldMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BlockFieldMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.AbstractFieldMatrix\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 74,
      "end_line": 1592,
      "comment": "\n * Cache-friendly implementation of FieldMatrix using a flat arrays to store\n * square blocks of the matrix.\n * \u003cp\u003e\n * This implementation is specially designed to be cache-friendly. Square blocks are\n * stored as small arrays and allow efficient traversal of data both in row major direction\n * and columns major direction, one block at a time. This greatly increases performances\n * for algorithms that use crossed directions loops like multiplication or transposition.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The size of square blocks is a static parameter. It may be tuned according to the cache\n * size of the target computer processor. As a rule of thumbs, it should be the largest\n * value that allows three blocks to be simultaneously cached (this is necessary for example\n * for matrix multiplication). The default value is to use 36x36 blocks.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The regular blocks represent {@link #BLOCK_SIZE} x {@link #BLOCK_SIZE} squares. Blocks\n * at right hand side and bottom side which may be smaller to fit matrix dimensions. The square\n * blocks are flattened in row major order in single dimension arrays which are therefore\n * {@link #BLOCK_SIZE}\u003csup\u003e2\u003c/sup\u003e elements long for regular blocks. The blocks are themselves\n * organized in row major order.\n * \u003c/p\u003e\n * \u003cp\u003e\n * As an example, for a block size of 36x36, a 100x60 matrix would be stored in 6 blocks.\n * Block 0 would be a Field[1296] array holding the upper left 36x36 square, block 1 would be\n * a Field[1296] array holding the upper center 36x36 square, block 2 would be a Field[1008]\n * array holding the upper right 36x28 rectangle, block 3 would be a Field[864] array holding\n * the lower left 24x36 rectangle, block 4 would be a Field[864] array holding the lower center\n * 24x36 rectangle and block 5 would be a Field[672] array holding the lower right 24x28\n * rectangle.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The layout complexity overhead versus simple mapping of matrices to java\n * arrays is negligible for small matrices (about 1%). The gain from cache efficiency leads\n * to up to 3-fold improvements for matrices of moderate to large size.\n * \u003c/p\u003e\n * @param \u003cT\u003e the type of the field elements\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "BLOCK_SIZE"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Block size. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "blocks"
      ],
      "begin_line": 80,
      "end_line": 80,
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
      "begin_line": 84,
      "end_line": 84,
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
      "begin_line": 88,
      "end_line": 88,
      "comment": " Number of block columns of the matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.BlockFieldMatrix(org.apache.commons.math3.Field\u003cT\u003e, int, int)",
      "begin_line": 99,
      "end_line": 112,
      "comment": "\n     * Create a new matrix with the supplied row and column dimensions.\n     *\n     * @param field Field to which the elements belong.\n     * @param rows Number of rows in the new matrix.\n     * @param columns Number of columns in the new matrix.\n     * @throws NotStrictlyPositiveException if row or column dimension is not\n     * positive.\n     ",
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
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.BlockFieldMatrix(T[][])",
      "begin_line": 127,
      "end_line": 130,
      "comment": "\n     * Create a new dense matrix copying entries from raw layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in raw layout.\u003c/p\u003e\n     * \u003cp\u003eCalling this constructor is equivalent to call:\n     * \u003cpre\u003ematrix \u003d new BlockFieldMatrix\u003cT\u003e(getField(), rawData.length, rawData[0].length,\n     *                                   toBlocksLayout(rawData), false);\u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param rawData Data for the new matrix, in raw layout.\n     * @throws DimensionMismatchException if the {@code blockData} shape is\n     * inconsistent with block layout.\n     * @see #BlockFieldMatrix(int, int, FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 80)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.BlockFieldMatrix(int, int, T[][], boolean)",
      "begin_line": 149,
      "end_line": 181,
      "comment": "\n     * Create a new dense matrix copying entries from block layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in blocks layout.\u003c/p\u003e\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @param blockData data for new matrix\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     *\n     * @throws DimensionMismatchException if the {@code blockData} shape is\n     * inconsistent with block layout.\n     * @throws NotStrictlyPositiveException if row or column dimension is not\n     * positive.\n     * @see #createBlocksLayout(Field, int, int)\n     * @see #toBlocksLayout(FieldElement[][])\n     * @see #BlockFieldMatrix(FieldElement[][])\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 54)",
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
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.toBlocksLayout(T[][])",
      "begin_line": 207,
      "end_line": 252,
      "comment": "\n     * Convert a data array from raw layout to blocks layout.\n     * \u003cp\u003e\n     * Raw layout is the straightforward layout where element at row i and\n     * column j is in array element \u003ccode\u003erawData[i][j]\u003c/code\u003e. Blocks layout\n     * is the layout used in {@link BlockFieldMatrix} instances, where the matrix\n     * is split in square blocks (except at right and bottom side where blocks may\n     * be rectangular to fit matrix size) and each block is stored in a flattened\n     * one-dimensional array.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method creates an array in blocks layout from an input array in raw layout.\n     * It can be used to provide the array argument of the {@link\n     * #BlockFieldMatrix(int, int, FieldElement[][], boolean)}\n     * constructor.\n     * \u003c/p\u003e\n     * @param \u003cT\u003e Type of the field elements.\n     * @param rawData Data array in raw layout.\n     * @return a new data array containing the same entries but in blocks layout\n     * @throws DimensionMismatchException if {@code rawData} is not rectangular\n     *  (not all rows have the same length).\n     * @see #createBlocksLayout(Field, int, int)\n     * @see #BlockFieldMatrix(int, int, FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 48)",
        "(line 211,col 9)-(line 211,col 51)",
        "(line 212,col 9)-(line 212,col 73)",
        "(line 213,col 9)-(line 213,col 73)",
        "(line 216,col 9)-(line 221,col 9)",
        "(line 224,col 9)-(line 224,col 53)",
        "(line 225,col 9)-(line 225,col 77)",
        "(line 226,col 9)-(line 226,col 27)",
        "(line 227,col 9)-(line 249,col 9)",
        "(line 251,col 9)-(line 251,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.createBlocksLayout(org.apache.commons.math3.Field\u003cT\u003e, int, int)",
      "begin_line": 269,
      "end_line": 290,
      "comment": "\n     * Create a data array in blocks layout.\n     * \u003cp\u003e\n     * This method can be used to create the array argument of the {@link\n     * #BlockFieldMatrix(int, int, FieldElement[][], boolean)}\n     * constructor.\n     * \u003c/p\u003e\n     * @param \u003cT\u003e Type of the field elements.\n     * @param field Field to which the elements belong.\n     * @param rows Number of rows in the new matrix.\n     * @param columns Number of columns in the new matrix.\n     * @return a new data array in blocks layout.\n     * @see #toBlocksLayout(FieldElement[][])\n     * @see #BlockFieldMatrix(int, int, FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 73)",
        "(line 272,col 9)-(line 272,col 73)",
        "(line 274,col 9)-(line 274,col 77)",
        "(line 275,col 9)-(line 275,col 27)",
        "(line 276,col 9)-(line 287,col 9)",
        "(line 289,col 9)-(line 289,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.createMatrix(int, int)",
      "begin_line": 293,
      "end_line": 299,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 297,col 9)-(line 298,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.copy()",
      "begin_line": 302,
      "end_line": 314,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 88)",
        "(line 309,col 9)-(line 311,col 9)",
        "(line 313,col 9)-(line 313,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.add(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 317,
      "end_line": 357,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 320,col 9)-(line 356,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.add(org.apache.commons.math3.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 367,
      "end_line": 386,
      "comment": "\n     * Compute the sum of {@code this} and {@code m}.\n     *\n     * @param m matrix to be added\n     * @return {@code this + m}\n     * @throws MatrixDimensionMismatchException if {@code m} is not the same\n     * size as {@code this}\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 35)",
        "(line 373,col 9)-(line 373,col 91)",
        "(line 376,col 9)-(line 383,col 9)",
        "(line 385,col 9)-(line 385,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.subtract(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 389,
      "end_line": 429,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 392,col 9)-(line 428,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.subtract(org.apache.commons.math3.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 439,
      "end_line": 456,
      "comment": "\n     * Compute {@code this - m}.\n     *\n     * @param m matrix to be subtracted\n     * @return {@code this - m}\n     * @throws MatrixDimensionMismatchException if {@code m} is not the same\n     * size as {@code this}\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 38)",
        "(line 443,col 9)-(line 443,col 91)",
        "(line 446,col 9)-(line 453,col 9)",
        "(line 455,col 9)-(line 455,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.scalarAdd(T)",
      "begin_line": 459,
      "end_line": 473,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 91)",
        "(line 464,col 9)-(line 470,col 9)",
        "(line 472,col 9)-(line 472,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.scalarMultiply(T)",
      "begin_line": 476,
      "end_line": 491,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 479,col 9)-(line 479,col 91)",
        "(line 482,col 9)-(line 488,col 9)",
        "(line 490,col 9)-(line 490,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.multiply(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 494,
      "end_line": 552,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 497,col 9)-(line 551,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.multiply(org.apache.commons.math3.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 561,
      "end_line": 624,
      "comment": "\n     * Returns the result of postmultiplying {@code this} by {@code m}.\n     *\n     * @param m matrix to postmultiply by\n     * @return {@code this * m}\n     * @throws DimensionMismatchException if the matrices are not compatible.\n     ",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 41)",
        "(line 567,col 9)-(line 567,col 93)",
        "(line 568,col 9)-(line 568,col 44)",
        "(line 571,col 9)-(line 571,col 27)",
        "(line 572,col 9)-(line 621,col 9)",
        "(line 623,col 9)-(line 623,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getData()",
      "begin_line": 627,
      "end_line": 653,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 630,col 9)-(line 630,col 91)",
        "(line 631,col 9)-(line 631,col 74)",
        "(line 633,col 9)-(line 650,col 9)",
        "(line 652,col 9)-(line 652,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 656,
      "end_line": 749,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 662,col 9)-(line 662,col 70)",
        "(line 665,col 9)-(line 666,col 100)",
        "(line 669,col 9)-(line 669,col 62)",
        "(line 670,col 9)-(line 670,col 62)",
        "(line 671,col 9)-(line 671,col 62)",
        "(line 672,col 9)-(line 672,col 62)",
        "(line 675,col 9)-(line 675,col 35)",
        "(line 676,col 9)-(line 746,col 9)",
        "(line 748,col 9)-(line 748,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.copyBlockPart(T[], int, int, int, int, int, T[], int, int, int)",
      "begin_line": 766,
      "end_line": 779,
      "comment": "\n     * Copy a part of a block into another one\n     * \u003cp\u003eThis method can be called only when the specified part fits in both\n     * blocks, no verification is done here.\u003c/p\u003e\n     * @param srcBlock source block\n     * @param srcWidth source block width ({@link #BLOCK_SIZE} or smaller)\n     * @param srcStartRow start row in the source block\n     * @param srcEndRow end row (exclusive) in the source block\n     * @param srcStartColumn start column in the source block\n     * @param srcEndColumn end column (exclusive) in the source block\n     * @param dstBlock destination block\n     * @param dstWidth destination block width ({@link #BLOCK_SIZE} or smaller)\n     * @param dstStartRow start row in the destination block\n     * @param dstStartColumn start column in the destination block\n     ",
      "child_ranges": [
        "(line 771,col 9)-(line 771,col 57)",
        "(line 772,col 9)-(line 772,col 61)",
        "(line 773,col 9)-(line 773,col 61)",
        "(line 774,col 9)-(line 778,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.setSubMatrix(T[][], int, int)",
      "begin_line": 782,
      "end_line": 832,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 788,col 9)-(line 788,col 42)",
        "(line 789,col 9)-(line 789,col 50)",
        "(line 790,col 9)-(line 792,col 9)",
        "(line 793,col 9)-(line 793,col 57)",
        "(line 794,col 9)-(line 794,col 53)",
        "(line 795,col 9)-(line 795,col 60)",
        "(line 796,col 9)-(line 800,col 9)",
        "(line 803,col 9)-(line 803,col 54)",
        "(line 804,col 9)-(line 804,col 72)",
        "(line 805,col 9)-(line 805,col 57)",
        "(line 806,col 9)-(line 806,col 75)",
        "(line 809,col 9)-(line 831,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getRowMatrix(int)",
      "begin_line": 835,
      "end_line": 863,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 838,col 9)-(line 838,col 27)",
        "(line 839,col 9)-(line 839,col 88)",
        "(line 842,col 9)-(line 842,col 45)",
        "(line 843,col 9)-(line 843,col 54)",
        "(line 844,col 9)-(line 844,col 30)",
        "(line 845,col 9)-(line 845,col 30)",
        "(line 846,col 9)-(line 846,col 49)",
        "(line 847,col 9)-(line 860,col 9)",
        "(line 862,col 9)-(line 862,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.setRowMatrix(int, org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 866,
      "end_line": 874,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 869,col 9)-(line 873,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.setRowMatrix(int, org.apache.commons.math3.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 887,
      "end_line": 918,
      "comment": "\n     * Sets the entries in row number \u003ccode\u003erow\u003c/code\u003e\n     * as a row matrix.  Row indices start at 0.\n     *\n     * @param row the row to be set\n     * @param matrix row matrix (must have one row and the same number of columns\n     * as the instance)\n     * @throws MatrixDimensionMismatchException if the matrix dimensions do\n     * not match one instance row.\n     * @throws OutOfRangeException if the specified row index is invalid.\n     ",
      "child_ranges": [
        "(line 889,col 9)-(line 889,col 27)",
        "(line 890,col 9)-(line 890,col 47)",
        "(line 891,col 9)-(line 896,col 9)",
        "(line 899,col 9)-(line 899,col 44)",
        "(line 900,col 9)-(line 900,col 53)",
        "(line 901,col 9)-(line 901,col 29)",
        "(line 902,col 9)-(line 902,col 29)",
        "(line 903,col 9)-(line 903,col 49)",
        "(line 904,col 9)-(line 917,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getColumnMatrix(int)",
      "begin_line": 921,
      "end_line": 947,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 924,col 9)-(line 924,col 33)",
        "(line 925,col 9)-(line 925,col 85)",
        "(line 928,col 9)-(line 928,col 48)",
        "(line 929,col 9)-(line 929,col 57)",
        "(line 930,col 9)-(line 930,col 47)",
        "(line 931,col 9)-(line 931,col 30)",
        "(line 932,col 9)-(line 932,col 30)",
        "(line 933,col 9)-(line 933,col 49)",
        "(line 934,col 9)-(line 944,col 9)",
        "(line 946,col 9)-(line 946,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.setColumnMatrix(int, org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 950,
      "end_line": 958,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 953,col 9)-(line 957,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.setColumnMatrix(int, org.apache.commons.math3.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 971,
      "end_line": 1000,
      "comment": "\n     * Sets the entries in column number {@code column}\n     * as a column matrix.  Column indices start at 0.\n     *\n     * @param column Column to be set.\n     * @param matrix Column matrix (must have one column and the same number of rows\n     * as the instance).\n     * @throws MatrixDimensionMismatchException if the matrix dimensions do\n     * not match one instance column.\n     * @throws OutOfRangeException if the specified column index is invalid.\n     ",
      "child_ranges": [
        "(line 973,col 9)-(line 973,col 33)",
        "(line 974,col 9)-(line 974,col 44)",
        "(line 975,col 9)-(line 980,col 9)",
        "(line 983,col 9)-(line 983,col 48)",
        "(line 984,col 9)-(line 984,col 57)",
        "(line 985,col 9)-(line 985,col 47)",
        "(line 986,col 9)-(line 986,col 28)",
        "(line 987,col 9)-(line 987,col 28)",
        "(line 988,col 9)-(line 988,col 48)",
        "(line 989,col 9)-(line 999,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getRowVector(int)",
      "begin_line": 1003,
      "end_line": 1021,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1006,col 9)-(line 1006,col 27)",
        "(line 1007,col 9)-(line 1007,col 60)",
        "(line 1010,col 9)-(line 1010,col 45)",
        "(line 1011,col 9)-(line 1011,col 54)",
        "(line 1012,col 9)-(line 1012,col 30)",
        "(line 1013,col 9)-(line 1018,col 9)",
        "(line 1020,col 9)-(line 1020,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.setRowVector(int, org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 1024,
      "end_line": 1032,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1027,col 9)-(line 1031,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getColumnVector(int)",
      "begin_line": 1035,
      "end_line": 1055,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1038,col 9)-(line 1038,col 33)",
        "(line 1039,col 9)-(line 1039,col 57)",
        "(line 1042,col 9)-(line 1042,col 48)",
        "(line 1043,col 9)-(line 1043,col 57)",
        "(line 1044,col 9)-(line 1044,col 47)",
        "(line 1045,col 9)-(line 1045,col 30)",
        "(line 1046,col 9)-(line 1052,col 9)",
        "(line 1054,col 9)-(line 1054,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.setColumnVector(int, org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 1058,
      "end_line": 1066,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1061,col 9)-(line 1065,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getRow(int)",
      "begin_line": 1069,
      "end_line": 1086,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1071,col 9)-(line 1071,col 27)",
        "(line 1072,col 9)-(line 1072,col 56)",
        "(line 1075,col 9)-(line 1075,col 45)",
        "(line 1076,col 9)-(line 1076,col 54)",
        "(line 1077,col 9)-(line 1077,col 30)",
        "(line 1078,col 9)-(line 1083,col 9)",
        "(line 1085,col 9)-(line 1085,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.setRow(int, T[])",
      "begin_line": 1089,
      "end_line": 1108,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1092,col 9)-(line 1092,col 27)",
        "(line 1093,col 9)-(line 1093,col 47)",
        "(line 1094,col 9)-(line 1096,col 9)",
        "(line 1099,col 9)-(line 1099,col 45)",
        "(line 1100,col 9)-(line 1100,col 54)",
        "(line 1101,col 9)-(line 1101,col 30)",
        "(line 1102,col 9)-(line 1107,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getColumn(int)",
      "begin_line": 1111,
      "end_line": 1130,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1113,col 9)-(line 1113,col 33)",
        "(line 1114,col 9)-(line 1114,col 53)",
        "(line 1117,col 9)-(line 1117,col 48)",
        "(line 1118,col 9)-(line 1118,col 57)",
        "(line 1119,col 9)-(line 1119,col 47)",
        "(line 1120,col 9)-(line 1120,col 30)",
        "(line 1121,col 9)-(line 1127,col 9)",
        "(line 1129,col 9)-(line 1129,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.setColumn(int, T[])",
      "begin_line": 1133,
      "end_line": 1154,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1136,col 9)-(line 1136,col 33)",
        "(line 1137,col 9)-(line 1137,col 44)",
        "(line 1138,col 9)-(line 1140,col 9)",
        "(line 1143,col 9)-(line 1143,col 48)",
        "(line 1144,col 9)-(line 1144,col 57)",
        "(line 1145,col 9)-(line 1145,col 47)",
        "(line 1146,col 9)-(line 1146,col 30)",
        "(line 1147,col 9)-(line 1153,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getEntry(int, int)",
      "begin_line": 1157,
      "end_line": 1169,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1160,col 9)-(line 1160,col 27)",
        "(line 1161,col 9)-(line 1161,col 33)",
        "(line 1163,col 9)-(line 1163,col 47)",
        "(line 1164,col 9)-(line 1164,col 47)",
        "(line 1165,col 9)-(line 1166,col 43)",
        "(line 1168,col 9)-(line 1168,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.setEntry(int, int, T)",
      "begin_line": 1172,
      "end_line": 1184,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1175,col 9)-(line 1175,col 27)",
        "(line 1176,col 9)-(line 1176,col 33)",
        "(line 1178,col 9)-(line 1178,col 47)",
        "(line 1179,col 9)-(line 1179,col 47)",
        "(line 1180,col 9)-(line 1181,col 43)",
        "(line 1183,col 9)-(line 1183,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.addToEntry(int, int, T)",
      "begin_line": 1187,
      "end_line": 1200,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1190,col 9)-(line 1190,col 27)",
        "(line 1191,col 9)-(line 1191,col 33)",
        "(line 1193,col 9)-(line 1193,col 47)",
        "(line 1194,col 9)-(line 1194,col 47)",
        "(line 1195,col 9)-(line 1196,col 43)",
        "(line 1197,col 9)-(line 1197,col 67)",
        "(line 1199,col 9)-(line 1199,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.multiplyEntry(int, int, T)",
      "begin_line": 1203,
      "end_line": 1216,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1206,col 9)-(line 1206,col 27)",
        "(line 1207,col 9)-(line 1207,col 33)",
        "(line 1209,col 9)-(line 1209,col 47)",
        "(line 1210,col 9)-(line 1210,col 47)",
        "(line 1211,col 9)-(line 1212,col 43)",
        "(line 1213,col 9)-(line 1213,col 67)",
        "(line 1215,col 9)-(line 1215,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.transpose()",
      "begin_line": 1219,
      "end_line": 1255,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1221,col 9)-(line 1221,col 44)",
        "(line 1222,col 9)-(line 1222,col 47)",
        "(line 1223,col 9)-(line 1223,col 90)",
        "(line 1226,col 9)-(line 1226,col 27)",
        "(line 1227,col 9)-(line 1252,col 9)",
        "(line 1254,col 9)-(line 1254,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getRowDimension()",
      "begin_line": 1258,
      "end_line": 1261,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1260,col 9)-(line 1260,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getColumnDimension()",
      "begin_line": 1264,
      "end_line": 1267,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1266,col 9)-(line 1266,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.operate(T[])",
      "begin_line": 1270,
      "end_line": 1308,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1272,col 9)-(line 1274,col 9)",
        "(line 1275,col 9)-(line 1275,col 53)",
        "(line 1276,col 9)-(line 1276,col 44)",
        "(line 1279,col 9)-(line 1305,col 9)",
        "(line 1307,col 9)-(line 1307,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.preMultiply(T[])",
      "begin_line": 1311,
      "end_line": 1355,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1314,col 9)-(line 1316,col 9)",
        "(line 1317,col 9)-(line 1317,col 56)",
        "(line 1318,col 9)-(line 1318,col 44)",
        "(line 1321,col 9)-(line 1352,col 9)",
        "(line 1354,col 9)-(line 1354,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 1358,
      "end_line": 1379,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1360,col 9)-(line 1360,col 66)",
        "(line 1361,col 9)-(line 1377,col 9)",
        "(line 1378,col 9)-(line 1378,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 1382,
      "end_line": 1403,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1384,col 9)-(line 1384,col 66)",
        "(line 1385,col 9)-(line 1401,col 9)",
        "(line 1402,col 9)-(line 1402,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1406,
      "end_line": 1433,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1411,col 9)-(line 1411,col 70)",
        "(line 1412,col 9)-(line 1412,col 79)",
        "(line 1413,col 9)-(line 1431,col 9)",
        "(line 1432,col 9)-(line 1432,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1436,
      "end_line": 1463,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1441,col 9)-(line 1441,col 70)",
        "(line 1442,col 9)-(line 1442,col 79)",
        "(line 1443,col 9)-(line 1461,col 9)",
        "(line 1462,col 9)-(line 1462,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 1466,
      "end_line": 1488,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1468,col 9)-(line 1468,col 66)",
        "(line 1469,col 9)-(line 1469,col 27)",
        "(line 1470,col 9)-(line 1486,col 9)",
        "(line 1487,col 9)-(line 1487,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 1491,
      "end_line": 1513,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1493,col 9)-(line 1493,col 66)",
        "(line 1494,col 9)-(line 1494,col 27)",
        "(line 1495,col 9)-(line 1511,col 9)",
        "(line 1512,col 9)-(line 1512,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1516,
      "end_line": 1543,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1521,col 9)-(line 1521,col 70)",
        "(line 1522,col 9)-(line 1522,col 79)",
        "(line 1523,col 9)-(line 1541,col 9)",
        "(line 1542,col 9)-(line 1542,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1546,
      "end_line": 1573,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1551,col 9)-(line 1551,col 70)",
        "(line 1552,col 9)-(line 1552,col 79)",
        "(line 1553,col 9)-(line 1571,col 9)",
        "(line 1572,col 9)-(line 1572,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.blockHeight(int)",
      "begin_line": 1580,
      "end_line": 1582,
      "comment": "\n     * Get the height of a block.\n     * @param blockRow row index (in block sense) of the block\n     * @return height (number of rows) of the block\n     ",
      "child_ranges": [
        "(line 1581,col 9)-(line 1581,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.blockWidth(int)",
      "begin_line": 1589,
      "end_line": 1591,
      "comment": "\n     * Get the width of a block.\n     * @param blockColumn column index (in block sense) of the block\n     * @return width (number of columns) of the block\n     ",
      "child_ranges": [
        "(line 1590,col 9)-(line 1590,col 99)"
      ]
    }
  ]
}