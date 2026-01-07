{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/BlockFieldMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BlockFieldMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.AbstractFieldMatrix\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 75,
      "end_line": 1593,
      "comment": "\n * Cache-friendly implementation of FieldMatrix using a flat arrays to store\n * square blocks of the matrix.\n * \u003cp\u003e\n * This implementation is specially designed to be cache-friendly. Square blocks are\n * stored as small arrays and allow efficient traversal of data both in row major direction\n * and columns major direction, one block at a time. This greatly increases performances\n * for algorithms that use crossed directions loops like multiplication or transposition.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The size of square blocks is a static parameter. It may be tuned according to the cache\n * size of the target computer processor. As a rule of thumbs, it should be the largest\n * value that allows three blocks to be simultaneously cached (this is necessary for example\n * for matrix multiplication). The default value is to use 36x36 blocks.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The regular blocks represent {@link #BLOCK_SIZE} x {@link #BLOCK_SIZE} squares. Blocks\n * at right hand side and bottom side which may be smaller to fit matrix dimensions. The square\n * blocks are flattened in row major order in single dimension arrays which are therefore\n * {@link #BLOCK_SIZE}\u003csup\u003e2\u003c/sup\u003e elements long for regular blocks. The blocks are themselves\n * organized in row major order.\n * \u003c/p\u003e\n * \u003cp\u003e\n * As an example, for a block size of 36x36, a 100x60 matrix would be stored in 6 blocks.\n * Block 0 would be a Field[1296] array holding the upper left 36x36 square, block 1 would be\n * a Field[1296] array holding the upper center 36x36 square, block 2 would be a Field[1008]\n * array holding the upper right 36x28 rectangle, block 3 would be a Field[864] array holding\n * the lower left 24x36 rectangle, block 4 would be a Field[864] array holding the lower center\n * 24x36 rectangle and block 5 would be a Field[672] array holding the lower right 24x28\n * rectangle.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The layout complexity overhead versus simple mapping of matrices to java\n * arrays is negligible for small matrices (about 1%). The gain from cache efficiency leads\n * to up to 3-fold improvements for matrices of moderate to large size.\n * \u003c/p\u003e\n * @param \u003cT\u003e the type of the field elements\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "BLOCK_SIZE"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Block size. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "blocks"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Blocks of matrix entries. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 83,
      "end_line": 83,
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
      "begin_line": 87,
      "end_line": 87,
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
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.BlockFieldMatrix(org.apache.commons.math3.Field\u003cT\u003e, int, int)",
      "begin_line": 100,
      "end_line": 113,
      "comment": "\n     * Create a new matrix with the supplied row and column dimensions.\n     *\n     * @param field Field to which the elements belong.\n     * @param rows Number of rows in the new matrix.\n     * @param columns Number of columns in the new matrix.\n     * @throws NotStrictlyPositiveException if row or column dimension is not\n     * positive.\n     ",
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
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.BlockFieldMatrix(T[][])",
      "begin_line": 128,
      "end_line": 131,
      "comment": "\n     * Create a new dense matrix copying entries from raw layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in raw layout.\u003c/p\u003e\n     * \u003cp\u003eCalling this constructor is equivalent to call:\n     * \u003cpre\u003ematrix \u003d new BlockFieldMatrix\u003cT\u003e(getField(), rawData.length, rawData[0].length,\n     *                                   toBlocksLayout(rawData), false);\u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param rawData Data for the new matrix, in raw layout.\n     * @throws DimensionMismatchException if the {@code blockData} shape is\n     * inconsistent with block layout.\n     * @see #BlockFieldMatrix(int, int, FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 80)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.BlockFieldMatrix(int, int, T[][], boolean)",
      "begin_line": 150,
      "end_line": 182,
      "comment": "\n     * Create a new dense matrix copying entries from block layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in blocks layout.\u003c/p\u003e\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @param blockData data for new matrix\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     *\n     * @throws DimensionMismatchException if the {@code blockData} shape is\n     * inconsistent with block layout.\n     * @throws NotStrictlyPositiveException if row or column dimension is not\n     * positive.\n     * @see #createBlocksLayout(Field, int, int)\n     * @see #toBlocksLayout(FieldElement[][])\n     * @see #BlockFieldMatrix(FieldElement[][])\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 54)",
        "(line 154,col 9)-(line 154,col 28)",
        "(line 155,col 9)-(line 155,col 31)",
        "(line 158,col 9)-(line 158,col 63)",
        "(line 159,col 9)-(line 159,col 63)",
        "(line 161,col 9)-(line 167,col 9)",
        "(line 169,col 9)-(line 169,col 22)",
        "(line 170,col 9)-(line 181,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.toBlocksLayout(T[][])",
      "begin_line": 208,
      "end_line": 253,
      "comment": "\n     * Convert a data array from raw layout to blocks layout.\n     * \u003cp\u003e\n     * Raw layout is the straightforward layout where element at row i and\n     * column j is in array element \u003ccode\u003erawData[i][j]\u003c/code\u003e. Blocks layout\n     * is the layout used in {@link BlockFieldMatrix} instances, where the matrix\n     * is split in square blocks (except at right and bottom side where blocks may\n     * be rectangular to fit matrix size) and each block is stored in a flattened\n     * one-dimensional array.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method creates an array in blocks layout from an input array in raw layout.\n     * It can be used to provide the array argument of the {@link\n     * #BlockFieldMatrix(int, int, FieldElement[][], boolean)}\n     * constructor.\n     * \u003c/p\u003e\n     * @param \u003cT\u003e Type of the field elements.\n     * @param rawData Data array in raw layout.\n     * @return a new data array containing the same entries but in blocks layout\n     * @throws DimensionMismatchException if {@code rawData} is not rectangular\n     *  (not all rows have the same length).\n     * @see #createBlocksLayout(Field, int, int)\n     * @see #BlockFieldMatrix(int, int, FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 48)",
        "(line 212,col 9)-(line 212,col 51)",
        "(line 213,col 9)-(line 213,col 73)",
        "(line 214,col 9)-(line 214,col 73)",
        "(line 217,col 9)-(line 222,col 9)",
        "(line 225,col 9)-(line 225,col 53)",
        "(line 226,col 9)-(line 226,col 88)",
        "(line 227,col 9)-(line 227,col 27)",
        "(line 228,col 9)-(line 250,col 9)",
        "(line 252,col 9)-(line 252,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.createBlocksLayout(org.apache.commons.math3.Field\u003cT\u003e, int, int)",
      "begin_line": 270,
      "end_line": 291,
      "comment": "\n     * Create a data array in blocks layout.\n     * \u003cp\u003e\n     * This method can be used to create the array argument of the {@link\n     * #BlockFieldMatrix(int, int, FieldElement[][], boolean)}\n     * constructor.\n     * \u003c/p\u003e\n     * @param \u003cT\u003e Type of the field elements.\n     * @param field Field to which the elements belong.\n     * @param rows Number of rows in the new matrix.\n     * @param columns Number of columns in the new matrix.\n     * @return a new data array in blocks layout.\n     * @see #toBlocksLayout(FieldElement[][])\n     * @see #BlockFieldMatrix(int, int, FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 73)",
        "(line 273,col 9)-(line 273,col 73)",
        "(line 275,col 9)-(line 275,col 88)",
        "(line 276,col 9)-(line 276,col 27)",
        "(line 277,col 9)-(line 288,col 9)",
        "(line 290,col 9)-(line 290,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.createMatrix(int, int)",
      "begin_line": 294,
      "end_line": 300,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 298,col 9)-(line 299,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.copy()",
      "begin_line": 303,
      "end_line": 315,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 88)",
        "(line 310,col 9)-(line 312,col 9)",
        "(line 314,col 9)-(line 314,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.add(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 318,
      "end_line": 358,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 321,col 9)-(line 357,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.add(org.apache.commons.math3.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 368,
      "end_line": 387,
      "comment": "\n     * Compute the sum of {@code this} and {@code m}.\n     *\n     * @param m matrix to be added\n     * @return {@code this + m}\n     * @throws MatrixDimensionMismatchException if {@code m} is not the same\n     * size as {@code this}\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 35)",
        "(line 374,col 9)-(line 374,col 91)",
        "(line 377,col 9)-(line 384,col 9)",
        "(line 386,col 9)-(line 386,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.subtract(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 390,
      "end_line": 430,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 393,col 9)-(line 429,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.subtract(org.apache.commons.math3.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 440,
      "end_line": 457,
      "comment": "\n     * Compute {@code this - m}.\n     *\n     * @param m matrix to be subtracted\n     * @return {@code this - m}\n     * @throws MatrixDimensionMismatchException if {@code m} is not the same\n     * size as {@code this}\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 38)",
        "(line 444,col 9)-(line 444,col 91)",
        "(line 447,col 9)-(line 454,col 9)",
        "(line 456,col 9)-(line 456,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.scalarAdd(T)",
      "begin_line": 460,
      "end_line": 474,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 91)",
        "(line 465,col 9)-(line 471,col 9)",
        "(line 473,col 9)-(line 473,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.scalarMultiply(T)",
      "begin_line": 477,
      "end_line": 492,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 91)",
        "(line 483,col 9)-(line 489,col 9)",
        "(line 491,col 9)-(line 491,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.multiply(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 495,
      "end_line": 553,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 498,col 9)-(line 552,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.multiply(org.apache.commons.math3.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 562,
      "end_line": 625,
      "comment": "\n     * Returns the result of postmultiplying {@code this} by {@code m}.\n     *\n     * @param m matrix to postmultiply by\n     * @return {@code this * m}\n     * @throws DimensionMismatchException if the matrices are not compatible.\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 41)",
        "(line 568,col 9)-(line 568,col 93)",
        "(line 569,col 9)-(line 569,col 44)",
        "(line 572,col 9)-(line 572,col 27)",
        "(line 573,col 9)-(line 622,col 9)",
        "(line 624,col 9)-(line 624,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getData()",
      "begin_line": 628,
      "end_line": 654,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 631,col 9)-(line 631,col 102)",
        "(line 632,col 9)-(line 632,col 74)",
        "(line 634,col 9)-(line 651,col 9)",
        "(line 653,col 9)-(line 653,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 657,
      "end_line": 750,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 663,col 9)-(line 663,col 70)",
        "(line 666,col 9)-(line 667,col 100)",
        "(line 670,col 9)-(line 670,col 62)",
        "(line 671,col 9)-(line 671,col 62)",
        "(line 672,col 9)-(line 672,col 62)",
        "(line 673,col 9)-(line 673,col 62)",
        "(line 676,col 9)-(line 676,col 35)",
        "(line 677,col 9)-(line 747,col 9)",
        "(line 749,col 9)-(line 749,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.copyBlockPart(T[], int, int, int, int, int, T[], int, int, int)",
      "begin_line": 767,
      "end_line": 780,
      "comment": "\n     * Copy a part of a block into another one\n     * \u003cp\u003eThis method can be called only when the specified part fits in both\n     * blocks, no verification is done here.\u003c/p\u003e\n     * @param srcBlock source block\n     * @param srcWidth source block width ({@link #BLOCK_SIZE} or smaller)\n     * @param srcStartRow start row in the source block\n     * @param srcEndRow end row (exclusive) in the source block\n     * @param srcStartColumn start column in the source block\n     * @param srcEndColumn end column (exclusive) in the source block\n     * @param dstBlock destination block\n     * @param dstWidth destination block width ({@link #BLOCK_SIZE} or smaller)\n     * @param dstStartRow start row in the destination block\n     * @param dstStartColumn start column in the destination block\n     ",
      "child_ranges": [
        "(line 772,col 9)-(line 772,col 57)",
        "(line 773,col 9)-(line 773,col 61)",
        "(line 774,col 9)-(line 774,col 61)",
        "(line 775,col 9)-(line 779,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.setSubMatrix(T[][], int, int)",
      "begin_line": 783,
      "end_line": 833,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 789,col 9)-(line 789,col 42)",
        "(line 790,col 9)-(line 790,col 50)",
        "(line 791,col 9)-(line 793,col 9)",
        "(line 794,col 9)-(line 794,col 57)",
        "(line 795,col 9)-(line 795,col 53)",
        "(line 796,col 9)-(line 796,col 60)",
        "(line 797,col 9)-(line 801,col 9)",
        "(line 804,col 9)-(line 804,col 54)",
        "(line 805,col 9)-(line 805,col 72)",
        "(line 806,col 9)-(line 806,col 57)",
        "(line 807,col 9)-(line 807,col 75)",
        "(line 810,col 9)-(line 832,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getRowMatrix(int)",
      "begin_line": 836,
      "end_line": 864,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 839,col 9)-(line 839,col 27)",
        "(line 840,col 9)-(line 840,col 88)",
        "(line 843,col 9)-(line 843,col 45)",
        "(line 844,col 9)-(line 844,col 54)",
        "(line 845,col 9)-(line 845,col 30)",
        "(line 846,col 9)-(line 846,col 30)",
        "(line 847,col 9)-(line 847,col 49)",
        "(line 848,col 9)-(line 861,col 9)",
        "(line 863,col 9)-(line 863,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.setRowMatrix(int, org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 867,
      "end_line": 875,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 870,col 9)-(line 874,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.setRowMatrix(int, org.apache.commons.math3.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 888,
      "end_line": 919,
      "comment": "\n     * Sets the entries in row number \u003ccode\u003erow\u003c/code\u003e\n     * as a row matrix.  Row indices start at 0.\n     *\n     * @param row the row to be set\n     * @param matrix row matrix (must have one row and the same number of columns\n     * as the instance)\n     * @throws MatrixDimensionMismatchException if the matrix dimensions do\n     * not match one instance row.\n     * @throws OutOfRangeException if the specified row index is invalid.\n     ",
      "child_ranges": [
        "(line 890,col 9)-(line 890,col 27)",
        "(line 891,col 9)-(line 891,col 47)",
        "(line 892,col 9)-(line 897,col 9)",
        "(line 900,col 9)-(line 900,col 44)",
        "(line 901,col 9)-(line 901,col 53)",
        "(line 902,col 9)-(line 902,col 29)",
        "(line 903,col 9)-(line 903,col 29)",
        "(line 904,col 9)-(line 904,col 49)",
        "(line 905,col 9)-(line 918,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getColumnMatrix(int)",
      "begin_line": 922,
      "end_line": 948,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 925,col 9)-(line 925,col 33)",
        "(line 926,col 9)-(line 926,col 85)",
        "(line 929,col 9)-(line 929,col 48)",
        "(line 930,col 9)-(line 930,col 57)",
        "(line 931,col 9)-(line 931,col 47)",
        "(line 932,col 9)-(line 932,col 30)",
        "(line 933,col 9)-(line 933,col 30)",
        "(line 934,col 9)-(line 934,col 49)",
        "(line 935,col 9)-(line 945,col 9)",
        "(line 947,col 9)-(line 947,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.setColumnMatrix(int, org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 951,
      "end_line": 959,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 954,col 9)-(line 958,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.setColumnMatrix(int, org.apache.commons.math3.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 972,
      "end_line": 1001,
      "comment": "\n     * Sets the entries in column number {@code column}\n     * as a column matrix.  Column indices start at 0.\n     *\n     * @param column Column to be set.\n     * @param matrix Column matrix (must have one column and the same number of rows\n     * as the instance).\n     * @throws MatrixDimensionMismatchException if the matrix dimensions do\n     * not match one instance column.\n     * @throws OutOfRangeException if the specified column index is invalid.\n     ",
      "child_ranges": [
        "(line 974,col 9)-(line 974,col 33)",
        "(line 975,col 9)-(line 975,col 44)",
        "(line 976,col 9)-(line 981,col 9)",
        "(line 984,col 9)-(line 984,col 48)",
        "(line 985,col 9)-(line 985,col 57)",
        "(line 986,col 9)-(line 986,col 47)",
        "(line 987,col 9)-(line 987,col 28)",
        "(line 988,col 9)-(line 988,col 28)",
        "(line 989,col 9)-(line 989,col 48)",
        "(line 990,col 9)-(line 1000,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getRowVector(int)",
      "begin_line": 1004,
      "end_line": 1022,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1007,col 9)-(line 1007,col 27)",
        "(line 1008,col 9)-(line 1008,col 71)",
        "(line 1011,col 9)-(line 1011,col 45)",
        "(line 1012,col 9)-(line 1012,col 54)",
        "(line 1013,col 9)-(line 1013,col 30)",
        "(line 1014,col 9)-(line 1019,col 9)",
        "(line 1021,col 9)-(line 1021,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.setRowVector(int, org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 1025,
      "end_line": 1033,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1028,col 9)-(line 1032,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getColumnVector(int)",
      "begin_line": 1036,
      "end_line": 1056,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1039,col 9)-(line 1039,col 33)",
        "(line 1040,col 9)-(line 1040,col 68)",
        "(line 1043,col 9)-(line 1043,col 48)",
        "(line 1044,col 9)-(line 1044,col 57)",
        "(line 1045,col 9)-(line 1045,col 47)",
        "(line 1046,col 9)-(line 1046,col 30)",
        "(line 1047,col 9)-(line 1053,col 9)",
        "(line 1055,col 9)-(line 1055,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.setColumnVector(int, org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 1059,
      "end_line": 1067,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1062,col 9)-(line 1066,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getRow(int)",
      "begin_line": 1070,
      "end_line": 1087,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1072,col 9)-(line 1072,col 27)",
        "(line 1073,col 9)-(line 1073,col 67)",
        "(line 1076,col 9)-(line 1076,col 45)",
        "(line 1077,col 9)-(line 1077,col 54)",
        "(line 1078,col 9)-(line 1078,col 30)",
        "(line 1079,col 9)-(line 1084,col 9)",
        "(line 1086,col 9)-(line 1086,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.setRow(int, T[])",
      "begin_line": 1090,
      "end_line": 1109,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1093,col 9)-(line 1093,col 27)",
        "(line 1094,col 9)-(line 1094,col 47)",
        "(line 1095,col 9)-(line 1097,col 9)",
        "(line 1100,col 9)-(line 1100,col 45)",
        "(line 1101,col 9)-(line 1101,col 54)",
        "(line 1102,col 9)-(line 1102,col 30)",
        "(line 1103,col 9)-(line 1108,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getColumn(int)",
      "begin_line": 1112,
      "end_line": 1131,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1114,col 9)-(line 1114,col 33)",
        "(line 1115,col 9)-(line 1115,col 64)",
        "(line 1118,col 9)-(line 1118,col 48)",
        "(line 1119,col 9)-(line 1119,col 57)",
        "(line 1120,col 9)-(line 1120,col 47)",
        "(line 1121,col 9)-(line 1121,col 30)",
        "(line 1122,col 9)-(line 1128,col 9)",
        "(line 1130,col 9)-(line 1130,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.setColumn(int, T[])",
      "begin_line": 1134,
      "end_line": 1155,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1137,col 9)-(line 1137,col 33)",
        "(line 1138,col 9)-(line 1138,col 44)",
        "(line 1139,col 9)-(line 1141,col 9)",
        "(line 1144,col 9)-(line 1144,col 48)",
        "(line 1145,col 9)-(line 1145,col 57)",
        "(line 1146,col 9)-(line 1146,col 47)",
        "(line 1147,col 9)-(line 1147,col 30)",
        "(line 1148,col 9)-(line 1154,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getEntry(int, int)",
      "begin_line": 1158,
      "end_line": 1170,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1161,col 9)-(line 1161,col 27)",
        "(line 1162,col 9)-(line 1162,col 33)",
        "(line 1164,col 9)-(line 1164,col 47)",
        "(line 1165,col 9)-(line 1165,col 47)",
        "(line 1166,col 9)-(line 1167,col 43)",
        "(line 1169,col 9)-(line 1169,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.setEntry(int, int, T)",
      "begin_line": 1173,
      "end_line": 1185,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1176,col 9)-(line 1176,col 27)",
        "(line 1177,col 9)-(line 1177,col 33)",
        "(line 1179,col 9)-(line 1179,col 47)",
        "(line 1180,col 9)-(line 1180,col 47)",
        "(line 1181,col 9)-(line 1182,col 43)",
        "(line 1184,col 9)-(line 1184,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.addToEntry(int, int, T)",
      "begin_line": 1188,
      "end_line": 1201,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1191,col 9)-(line 1191,col 27)",
        "(line 1192,col 9)-(line 1192,col 33)",
        "(line 1194,col 9)-(line 1194,col 47)",
        "(line 1195,col 9)-(line 1195,col 47)",
        "(line 1196,col 9)-(line 1197,col 43)",
        "(line 1198,col 9)-(line 1198,col 67)",
        "(line 1200,col 9)-(line 1200,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.multiplyEntry(int, int, T)",
      "begin_line": 1204,
      "end_line": 1217,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1207,col 9)-(line 1207,col 27)",
        "(line 1208,col 9)-(line 1208,col 33)",
        "(line 1210,col 9)-(line 1210,col 47)",
        "(line 1211,col 9)-(line 1211,col 47)",
        "(line 1212,col 9)-(line 1213,col 43)",
        "(line 1214,col 9)-(line 1214,col 67)",
        "(line 1216,col 9)-(line 1216,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.transpose()",
      "begin_line": 1220,
      "end_line": 1256,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1222,col 9)-(line 1222,col 44)",
        "(line 1223,col 9)-(line 1223,col 47)",
        "(line 1224,col 9)-(line 1224,col 90)",
        "(line 1227,col 9)-(line 1227,col 27)",
        "(line 1228,col 9)-(line 1253,col 9)",
        "(line 1255,col 9)-(line 1255,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getRowDimension()",
      "begin_line": 1259,
      "end_line": 1262,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1261,col 9)-(line 1261,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getColumnDimension()",
      "begin_line": 1265,
      "end_line": 1268,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1267,col 9)-(line 1267,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.operate(T[])",
      "begin_line": 1271,
      "end_line": 1309,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1273,col 9)-(line 1275,col 9)",
        "(line 1276,col 9)-(line 1276,col 64)",
        "(line 1277,col 9)-(line 1277,col 44)",
        "(line 1280,col 9)-(line 1306,col 9)",
        "(line 1308,col 9)-(line 1308,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.preMultiply(T[])",
      "begin_line": 1312,
      "end_line": 1356,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1315,col 9)-(line 1317,col 9)",
        "(line 1318,col 9)-(line 1318,col 67)",
        "(line 1319,col 9)-(line 1319,col 44)",
        "(line 1322,col 9)-(line 1353,col 9)",
        "(line 1355,col 9)-(line 1355,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 1359,
      "end_line": 1380,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1361,col 9)-(line 1361,col 66)",
        "(line 1362,col 9)-(line 1378,col 9)",
        "(line 1379,col 9)-(line 1379,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 1383,
      "end_line": 1404,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1385,col 9)-(line 1385,col 66)",
        "(line 1386,col 9)-(line 1402,col 9)",
        "(line 1403,col 9)-(line 1403,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1407,
      "end_line": 1434,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1412,col 9)-(line 1412,col 70)",
        "(line 1413,col 9)-(line 1413,col 79)",
        "(line 1414,col 9)-(line 1432,col 9)",
        "(line 1433,col 9)-(line 1433,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1437,
      "end_line": 1464,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1442,col 9)-(line 1442,col 70)",
        "(line 1443,col 9)-(line 1443,col 79)",
        "(line 1444,col 9)-(line 1462,col 9)",
        "(line 1463,col 9)-(line 1463,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 1467,
      "end_line": 1489,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1469,col 9)-(line 1469,col 66)",
        "(line 1470,col 9)-(line 1470,col 27)",
        "(line 1471,col 9)-(line 1487,col 9)",
        "(line 1488,col 9)-(line 1488,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 1492,
      "end_line": 1514,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1494,col 9)-(line 1494,col 66)",
        "(line 1495,col 9)-(line 1495,col 27)",
        "(line 1496,col 9)-(line 1512,col 9)",
        "(line 1513,col 9)-(line 1513,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1517,
      "end_line": 1544,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1522,col 9)-(line 1522,col 70)",
        "(line 1523,col 9)-(line 1523,col 79)",
        "(line 1524,col 9)-(line 1542,col 9)",
        "(line 1543,col 9)-(line 1543,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1547,
      "end_line": 1574,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1552,col 9)-(line 1552,col 70)",
        "(line 1553,col 9)-(line 1553,col 79)",
        "(line 1554,col 9)-(line 1572,col 9)",
        "(line 1573,col 9)-(line 1573,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.blockHeight(int)",
      "begin_line": 1581,
      "end_line": 1583,
      "comment": "\n     * Get the height of a block.\n     * @param blockRow row index (in block sense) of the block\n     * @return height (number of rows) of the block\n     ",
      "child_ranges": [
        "(line 1582,col 9)-(line 1582,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.blockWidth(int)",
      "begin_line": 1590,
      "end_line": 1592,
      "comment": "\n     * Get the width of a block.\n     * @param blockColumn column index (in block sense) of the block\n     * @return width (number of columns) of the block\n     ",
      "child_ranges": [
        "(line 1591,col 9)-(line 1591,col 99)"
      ]
    }
  ]
}