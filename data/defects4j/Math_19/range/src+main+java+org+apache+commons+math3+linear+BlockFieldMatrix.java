{
  "filepath": "/tmp/Math-19b/src/main/java/org/apache/commons/math3/linear/BlockFieldMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BlockFieldMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.AbstractFieldMatrix\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 70,
      "end_line": 1549,
      "comment": "\n * Cache-friendly implementation of FieldMatrix using a flat arrays to store\n * square blocks of the matrix.\n * \u003cp\u003e\n * This implementation is specially designed to be cache-friendly. Square blocks are\n * stored as small arrays and allow efficient traversal of data both in row major direction\n * and columns major direction, one block at a time. This greatly increases performances\n * for algorithms that use crossed directions loops like multiplication or transposition.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The size of square blocks is a static parameter. It may be tuned according to the cache\n * size of the target computer processor. As a rule of thumbs, it should be the largest\n * value that allows three blocks to be simultaneously cached (this is necessary for example\n * for matrix multiplication). The default value is to use 36x36 blocks.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The regular blocks represent {@link #BLOCK_SIZE} x {@link #BLOCK_SIZE} squares. Blocks\n * at right hand side and bottom side which may be smaller to fit matrix dimensions. The square\n * blocks are flattened in row major order in single dimension arrays which are therefore\n * {@link #BLOCK_SIZE}\u003csup\u003e2\u003c/sup\u003e elements long for regular blocks. The blocks are themselves\n * organized in row major order.\n * \u003c/p\u003e\n * \u003cp\u003e\n * As an example, for a block size of 36x36, a 100x60 matrix would be stored in 6 blocks.\n * Block 0 would be a Field[1296] array holding the upper left 36x36 square, block 1 would be\n * a Field[1296] array holding the upper center 36x36 square, block 2 would be a Field[1008]\n * array holding the upper right 36x28 rectangle, block 3 would be a Field[864] array holding\n * the lower left 24x36 rectangle, block 4 would be a Field[864] array holding the lower center\n * 24x36 rectangle and block 5 would be a Field[672] array holding the lower right 24x28\n * rectangle.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The layout complexity overhead versus simple mapping of matrices to java\n * arrays is negligible for small matrices (about 1%). The gain from cache efficiency leads\n * to up to 3-fold improvements for matrices of moderate to large size.\n * \u003c/p\u003e\n * @param \u003cT\u003e the type of the field elements\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "BLOCK_SIZE"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Block size. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Serializable version identifier. "
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
      "begin_line": 78,
      "end_line": 78,
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
      "begin_line": 82,
      "end_line": 82,
      "comment": " Number of block rows of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "blockColumns"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Number of block columns of the matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.BlockFieldMatrix(org.apache.commons.math3.Field\u003cT\u003e, int, int)",
      "begin_line": 95,
      "end_line": 106,
      "comment": "\n     * Create a new matrix with the supplied row and column dimensions.\n     *\n     * @param field Field to which the elements belong.\n     * @param rows Number of rows in the new matrix.\n     * @param columns Number of columns in the new matrix.\n     * @throws org.apache.commons.math3.exception.NotStrictlyPositiveException\n     * if row or column dimension is not positive.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 36)",
        "(line 97,col 9)-(line 97,col 28)",
        "(line 98,col 9)-(line 98,col 31)",
        "(line 101,col 9)-(line 101,col 63)",
        "(line 102,col 9)-(line 102,col 63)",
        "(line 105,col 9)-(line 105,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.BlockFieldMatrix(T[][])",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Create a new dense matrix copying entries from raw layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in raw layout.\u003c/p\u003e\n     * \u003cp\u003eCalling this constructor is equivalent to call:\n     * \u003cpre\u003ematrix \u003d new BlockFieldMatrix\u003cT\u003e(getField(), rawData.length, rawData[0].length,\n     *                                   toBlocksLayout(rawData), false);\u003c/pre\u003e\n     * \u003c/p\u003e\n     * @param rawData Data for the new matrix, in raw layout.\n     *\n     * @exception DimensionMismatchException if the {@code blockData} shape is\n     * inconsistent with block layout.\n     * @see #BlockFieldMatrix(int, int, FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 80)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.BlockFieldMatrix(int, int, T[][], boolean)",
      "begin_line": 140,
      "end_line": 171,
      "comment": "\n     * Create a new dense matrix copying entries from block layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in blocks layout.\u003c/p\u003e\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @param blockData data for new matrix\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     *\n     * @exception DimensionMismatchException if the {@code blockData} shape is\n     * inconsistent with block layout.\n     * @see #createBlocksLayout(Field, int, int)\n     * @see #toBlocksLayout(FieldElement[][])\n     * @see #BlockFieldMatrix(FieldElement[][])\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 54)",
        "(line 143,col 9)-(line 143,col 28)",
        "(line 144,col 9)-(line 144,col 31)",
        "(line 147,col 9)-(line 147,col 63)",
        "(line 148,col 9)-(line 148,col 63)",
        "(line 150,col 9)-(line 156,col 9)",
        "(line 158,col 9)-(line 158,col 22)",
        "(line 159,col 9)-(line 170,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.toBlocksLayout(T[][])",
      "begin_line": 197,
      "end_line": 241,
      "comment": "\n     * Convert a data array from raw layout to blocks layout.\n     * \u003cp\u003e\n     * Raw layout is the straightforward layout where element at row i and\n     * column j is in array element \u003ccode\u003erawData[i][j]\u003c/code\u003e. Blocks layout\n     * is the layout used in {@link BlockFieldMatrix} instances, where the matrix\n     * is split in square blocks (except at right and bottom side where blocks may\n     * be rectangular to fit matrix size) and each block is stored in a flattened\n     * one-dimensional array.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method creates an array in blocks layout from an input array in raw layout.\n     * It can be used to provide the array argument of the {@link\n     * #BlockFieldMatrix(int, int, FieldElement[][], boolean)}\n     * constructor.\n     * \u003c/p\u003e\n     * @param \u003cT\u003e Type of the field elements.\n     * @param rawData Data array in raw layout.\n     * @return a new data array containing the same entries but in blocks layout\n     * @throws DimensionMismatchException if {@code rawData} is not rectangular\n     *  (not all rows have the same length).\n     * @see #createBlocksLayout(Field, int, int)\n     * @see #BlockFieldMatrix(int, int, FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 48)",
        "(line 200,col 9)-(line 200,col 51)",
        "(line 201,col 9)-(line 201,col 73)",
        "(line 202,col 9)-(line 202,col 73)",
        "(line 205,col 9)-(line 210,col 9)",
        "(line 213,col 9)-(line 213,col 53)",
        "(line 214,col 9)-(line 214,col 77)",
        "(line 215,col 9)-(line 215,col 27)",
        "(line 216,col 9)-(line 238,col 9)",
        "(line 240,col 9)-(line 240,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.createBlocksLayout(org.apache.commons.math3.Field\u003cT\u003e, int, int)",
      "begin_line": 258,
      "end_line": 279,
      "comment": "\n     * Create a data array in blocks layout.\n     * \u003cp\u003e\n     * This method can be used to create the array argument of the {@link\n     * #BlockFieldMatrix(int, int, FieldElement[][], boolean)}\n     * constructor.\n     * \u003c/p\u003e\n     * @param \u003cT\u003e Type of the field elements.\n     * @param field Field to which the elements belong.\n     * @param rows Number of rows in the new matrix.\n     * @param columns Number of columns in the new matrix.\n     * @return a new data array in blocks layout.\n     * @see #toBlocksLayout(FieldElement[][])\n     * @see #BlockFieldMatrix(int, int, FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 73)",
        "(line 261,col 9)-(line 261,col 73)",
        "(line 263,col 9)-(line 263,col 77)",
        "(line 264,col 9)-(line 264,col 27)",
        "(line 265,col 9)-(line 276,col 9)",
        "(line 278,col 9)-(line 278,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.createMatrix(int, int)",
      "begin_line": 282,
      "end_line": 285,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.copy()",
      "begin_line": 288,
      "end_line": 300,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 88)",
        "(line 295,col 9)-(line 297,col 9)",
        "(line 299,col 9)-(line 299,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.add(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 303,
      "end_line": 342,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 305,col 9)-(line 341,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.add(org.apache.commons.math3.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 351,
      "end_line": 369,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 35)",
        "(line 356,col 9)-(line 356,col 91)",
        "(line 359,col 9)-(line 366,col 9)",
        "(line 368,col 9)-(line 368,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.subtract(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 372,
      "end_line": 411,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 374,col 9)-(line 410,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.subtract(org.apache.commons.math3.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 420,
      "end_line": 437,
      "comment": "\n     * Compute this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this - m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 38)",
        "(line 424,col 9)-(line 424,col 91)",
        "(line 427,col 9)-(line 434,col 9)",
        "(line 436,col 9)-(line 436,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.scalarAdd(T)",
      "begin_line": 440,
      "end_line": 454,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 91)",
        "(line 445,col 9)-(line 451,col 9)",
        "(line 453,col 9)-(line 453,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.scalarMultiply(T)",
      "begin_line": 457,
      "end_line": 472,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 91)",
        "(line 463,col 9)-(line 469,col 9)",
        "(line 471,col 9)-(line 471,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.multiply(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 475,
      "end_line": 532,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 477,col 9)-(line 531,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.multiply(org.apache.commons.math3.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 542,
      "end_line": 604,
      "comment": "\n     * Returns the result of postmultiplying this by m.\n     *\n     * @param m    matrix to postmultiply by\n     * @return     this * m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 41)",
        "(line 547,col 9)-(line 547,col 93)",
        "(line 548,col 9)-(line 548,col 44)",
        "(line 551,col 9)-(line 551,col 27)",
        "(line 552,col 9)-(line 601,col 9)",
        "(line 603,col 9)-(line 603,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getData()",
      "begin_line": 607,
      "end_line": 633,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 91)",
        "(line 611,col 9)-(line 611,col 74)",
        "(line 613,col 9)-(line 630,col 9)",
        "(line 632,col 9)-(line 632,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 636,
      "end_line": 727,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 640,col 9)-(line 640,col 70)",
        "(line 643,col 9)-(line 644,col 100)",
        "(line 647,col 9)-(line 647,col 62)",
        "(line 648,col 9)-(line 648,col 62)",
        "(line 649,col 9)-(line 649,col 62)",
        "(line 650,col 9)-(line 650,col 62)",
        "(line 653,col 9)-(line 653,col 35)",
        "(line 654,col 9)-(line 724,col 9)",
        "(line 726,col 9)-(line 726,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.copyBlockPart(T[], int, int, int, int, int, T[], int, int, int)",
      "begin_line": 744,
      "end_line": 757,
      "comment": "\n     * Copy a part of a block into another one\n     * \u003cp\u003eThis method can be called only when the specified part fits in both\n     * blocks, no verification is done here.\u003c/p\u003e\n     * @param srcBlock source block\n     * @param srcWidth source block width ({@link #BLOCK_SIZE} or smaller)\n     * @param srcStartRow start row in the source block\n     * @param srcEndRow end row (exclusive) in the source block\n     * @param srcStartColumn start column in the source block\n     * @param srcEndColumn end column (exclusive) in the source block\n     * @param dstBlock destination block\n     * @param dstWidth destination block width ({@link #BLOCK_SIZE} or smaller)\n     * @param dstStartRow start row in the destination block\n     * @param dstStartColumn start column in the destination block\n     ",
      "child_ranges": [
        "(line 749,col 9)-(line 749,col 57)",
        "(line 750,col 9)-(line 750,col 61)",
        "(line 751,col 9)-(line 751,col 61)",
        "(line 752,col 9)-(line 756,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.setSubMatrix(T[][], int, int)",
      "begin_line": 760,
      "end_line": 807,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 763,col 9)-(line 763,col 42)",
        "(line 764,col 9)-(line 764,col 50)",
        "(line 765,col 9)-(line 767,col 9)",
        "(line 768,col 9)-(line 768,col 57)",
        "(line 769,col 9)-(line 769,col 53)",
        "(line 770,col 9)-(line 770,col 60)",
        "(line 771,col 9)-(line 775,col 9)",
        "(line 778,col 9)-(line 778,col 54)",
        "(line 779,col 9)-(line 779,col 72)",
        "(line 780,col 9)-(line 780,col 57)",
        "(line 781,col 9)-(line 781,col 75)",
        "(line 784,col 9)-(line 806,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getRowMatrix(int)",
      "begin_line": 810,
      "end_line": 837,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 812,col 9)-(line 812,col 27)",
        "(line 813,col 9)-(line 813,col 88)",
        "(line 816,col 9)-(line 816,col 45)",
        "(line 817,col 9)-(line 817,col 54)",
        "(line 818,col 9)-(line 818,col 30)",
        "(line 819,col 9)-(line 819,col 30)",
        "(line 820,col 9)-(line 820,col 49)",
        "(line 821,col 9)-(line 834,col 9)",
        "(line 836,col 9)-(line 836,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.setRowMatrix(int, org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 840,
      "end_line": 847,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 842,col 9)-(line 846,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.setRowMatrix(int, org.apache.commons.math3.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 861,
      "end_line": 891,
      "comment": "\n     * Sets the entries in row number \u003ccode\u003erow\u003c/code\u003e\n     * as a row matrix.  Row indices start at 0.\n     *\n     * @param row the row to be set\n     * @param matrix row matrix (must have one row and the same number of columns\n     * as the instance)\n     * @throws org.apache.commons.math3.exception.OutOfRangeException if the\n     * specified row index is invalid.\n     * @throws MatrixDimensionMismatchException if the matrix dimensions do\n     * not match one instance row.\n     ",
      "child_ranges": [
        "(line 862,col 9)-(line 862,col 27)",
        "(line 863,col 9)-(line 863,col 47)",
        "(line 864,col 9)-(line 869,col 9)",
        "(line 872,col 9)-(line 872,col 44)",
        "(line 873,col 9)-(line 873,col 53)",
        "(line 874,col 9)-(line 874,col 29)",
        "(line 875,col 9)-(line 875,col 29)",
        "(line 876,col 9)-(line 876,col 49)",
        "(line 877,col 9)-(line 890,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getColumnMatrix(int)",
      "begin_line": 894,
      "end_line": 919,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 896,col 9)-(line 896,col 33)",
        "(line 897,col 9)-(line 897,col 85)",
        "(line 900,col 9)-(line 900,col 48)",
        "(line 901,col 9)-(line 901,col 57)",
        "(line 902,col 9)-(line 902,col 47)",
        "(line 903,col 9)-(line 903,col 30)",
        "(line 904,col 9)-(line 904,col 30)",
        "(line 905,col 9)-(line 905,col 49)",
        "(line 906,col 9)-(line 916,col 9)",
        "(line 918,col 9)-(line 918,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.setColumnMatrix(int, org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 922,
      "end_line": 929,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 924,col 9)-(line 928,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.setColumnMatrix(int, org.apache.commons.math3.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 943,
      "end_line": 971,
      "comment": "\n     * Sets the entries in column number {@code column}\n     * as a column matrix.  Column indices start at 0.\n     *\n     * @param column Column to be set.\n     * @param matrix Column matrix (must have one column and the same number of rows\n     * as the instance).\n     * @throws org.apache.commons.math3.exception.OutOfRangeException if\n     * the specified column index is invalid.\n     * @throws MatrixDimensionMismatchException if the matrix dimensions do\n     * not match one instance column.\n     ",
      "child_ranges": [
        "(line 944,col 9)-(line 944,col 33)",
        "(line 945,col 9)-(line 945,col 44)",
        "(line 946,col 9)-(line 951,col 9)",
        "(line 954,col 9)-(line 954,col 48)",
        "(line 955,col 9)-(line 955,col 57)",
        "(line 956,col 9)-(line 956,col 47)",
        "(line 957,col 9)-(line 957,col 28)",
        "(line 958,col 9)-(line 958,col 28)",
        "(line 959,col 9)-(line 959,col 48)",
        "(line 960,col 9)-(line 970,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getRowVector(int)",
      "begin_line": 974,
      "end_line": 991,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 976,col 9)-(line 976,col 27)",
        "(line 977,col 9)-(line 977,col 60)",
        "(line 980,col 9)-(line 980,col 45)",
        "(line 981,col 9)-(line 981,col 54)",
        "(line 982,col 9)-(line 982,col 30)",
        "(line 983,col 9)-(line 988,col 9)",
        "(line 990,col 9)-(line 990,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.setRowVector(int, org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 994,
      "end_line": 1001,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 996,col 9)-(line 1000,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getColumnVector(int)",
      "begin_line": 1004,
      "end_line": 1023,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1006,col 9)-(line 1006,col 33)",
        "(line 1007,col 9)-(line 1007,col 57)",
        "(line 1010,col 9)-(line 1010,col 48)",
        "(line 1011,col 9)-(line 1011,col 57)",
        "(line 1012,col 9)-(line 1012,col 47)",
        "(line 1013,col 9)-(line 1013,col 30)",
        "(line 1014,col 9)-(line 1020,col 9)",
        "(line 1022,col 9)-(line 1022,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.setColumnVector(int, org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 1026,
      "end_line": 1033,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1028,col 9)-(line 1032,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getRow(int)",
      "begin_line": 1036,
      "end_line": 1053,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1038,col 9)-(line 1038,col 27)",
        "(line 1039,col 9)-(line 1039,col 56)",
        "(line 1042,col 9)-(line 1042,col 45)",
        "(line 1043,col 9)-(line 1043,col 54)",
        "(line 1044,col 9)-(line 1044,col 30)",
        "(line 1045,col 9)-(line 1050,col 9)",
        "(line 1052,col 9)-(line 1052,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.setRow(int, T[])",
      "begin_line": 1056,
      "end_line": 1074,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1058,col 9)-(line 1058,col 27)",
        "(line 1059,col 9)-(line 1059,col 47)",
        "(line 1060,col 9)-(line 1062,col 9)",
        "(line 1065,col 9)-(line 1065,col 45)",
        "(line 1066,col 9)-(line 1066,col 54)",
        "(line 1067,col 9)-(line 1067,col 30)",
        "(line 1068,col 9)-(line 1073,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getColumn(int)",
      "begin_line": 1077,
      "end_line": 1096,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1079,col 9)-(line 1079,col 33)",
        "(line 1080,col 9)-(line 1080,col 53)",
        "(line 1083,col 9)-(line 1083,col 48)",
        "(line 1084,col 9)-(line 1084,col 57)",
        "(line 1085,col 9)-(line 1085,col 47)",
        "(line 1086,col 9)-(line 1086,col 30)",
        "(line 1087,col 9)-(line 1093,col 9)",
        "(line 1095,col 9)-(line 1095,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.setColumn(int, T[])",
      "begin_line": 1099,
      "end_line": 1119,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1101,col 9)-(line 1101,col 33)",
        "(line 1102,col 9)-(line 1102,col 44)",
        "(line 1103,col 9)-(line 1105,col 9)",
        "(line 1108,col 9)-(line 1108,col 48)",
        "(line 1109,col 9)-(line 1109,col 57)",
        "(line 1110,col 9)-(line 1110,col 47)",
        "(line 1111,col 9)-(line 1111,col 30)",
        "(line 1112,col 9)-(line 1118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getEntry(int, int)",
      "begin_line": 1122,
      "end_line": 1133,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1124,col 9)-(line 1124,col 27)",
        "(line 1125,col 9)-(line 1125,col 33)",
        "(line 1127,col 9)-(line 1127,col 47)",
        "(line 1128,col 9)-(line 1128,col 47)",
        "(line 1129,col 9)-(line 1130,col 43)",
        "(line 1132,col 9)-(line 1132,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.setEntry(int, int, T)",
      "begin_line": 1136,
      "end_line": 1147,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1138,col 9)-(line 1138,col 27)",
        "(line 1139,col 9)-(line 1139,col 33)",
        "(line 1141,col 9)-(line 1141,col 47)",
        "(line 1142,col 9)-(line 1142,col 47)",
        "(line 1143,col 9)-(line 1144,col 43)",
        "(line 1146,col 9)-(line 1146,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.addToEntry(int, int, T)",
      "begin_line": 1150,
      "end_line": 1162,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1152,col 9)-(line 1152,col 27)",
        "(line 1153,col 9)-(line 1153,col 33)",
        "(line 1155,col 9)-(line 1155,col 47)",
        "(line 1156,col 9)-(line 1156,col 47)",
        "(line 1157,col 9)-(line 1158,col 43)",
        "(line 1159,col 9)-(line 1159,col 67)",
        "(line 1161,col 9)-(line 1161,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.multiplyEntry(int, int, T)",
      "begin_line": 1165,
      "end_line": 1177,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1167,col 9)-(line 1167,col 27)",
        "(line 1168,col 9)-(line 1168,col 33)",
        "(line 1170,col 9)-(line 1170,col 47)",
        "(line 1171,col 9)-(line 1171,col 47)",
        "(line 1172,col 9)-(line 1173,col 43)",
        "(line 1174,col 9)-(line 1174,col 67)",
        "(line 1176,col 9)-(line 1176,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.transpose()",
      "begin_line": 1180,
      "end_line": 1216,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1182,col 9)-(line 1182,col 44)",
        "(line 1183,col 9)-(line 1183,col 47)",
        "(line 1184,col 9)-(line 1184,col 90)",
        "(line 1187,col 9)-(line 1187,col 27)",
        "(line 1188,col 9)-(line 1213,col 9)",
        "(line 1215,col 9)-(line 1215,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getRowDimension()",
      "begin_line": 1219,
      "end_line": 1222,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1221,col 9)-(line 1221,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.getColumnDimension()",
      "begin_line": 1225,
      "end_line": 1228,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1227,col 9)-(line 1227,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.operate(T[])",
      "begin_line": 1231,
      "end_line": 1269,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1233,col 9)-(line 1235,col 9)",
        "(line 1236,col 9)-(line 1236,col 53)",
        "(line 1237,col 9)-(line 1237,col 44)",
        "(line 1240,col 9)-(line 1266,col 9)",
        "(line 1268,col 9)-(line 1268,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.preMultiply(T[])",
      "begin_line": 1272,
      "end_line": 1316,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1275,col 9)-(line 1277,col 9)",
        "(line 1278,col 9)-(line 1278,col 56)",
        "(line 1279,col 9)-(line 1279,col 44)",
        "(line 1282,col 9)-(line 1313,col 9)",
        "(line 1315,col 9)-(line 1315,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 1319,
      "end_line": 1340,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1321,col 9)-(line 1321,col 66)",
        "(line 1322,col 9)-(line 1338,col 9)",
        "(line 1339,col 9)-(line 1339,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 1343,
      "end_line": 1364,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1345,col 9)-(line 1345,col 66)",
        "(line 1346,col 9)-(line 1362,col 9)",
        "(line 1363,col 9)-(line 1363,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1367,
      "end_line": 1393,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1371,col 9)-(line 1371,col 70)",
        "(line 1372,col 9)-(line 1372,col 79)",
        "(line 1373,col 9)-(line 1391,col 9)",
        "(line 1392,col 9)-(line 1392,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1396,
      "end_line": 1422,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1400,col 9)-(line 1400,col 70)",
        "(line 1401,col 9)-(line 1401,col 79)",
        "(line 1402,col 9)-(line 1420,col 9)",
        "(line 1421,col 9)-(line 1421,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 1425,
      "end_line": 1447,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1427,col 9)-(line 1427,col 66)",
        "(line 1428,col 9)-(line 1428,col 27)",
        "(line 1429,col 9)-(line 1445,col 9)",
        "(line 1446,col 9)-(line 1446,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 1450,
      "end_line": 1472,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1452,col 9)-(line 1452,col 66)",
        "(line 1453,col 9)-(line 1453,col 27)",
        "(line 1454,col 9)-(line 1470,col 9)",
        "(line 1471,col 9)-(line 1471,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1475,
      "end_line": 1501,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1479,col 9)-(line 1479,col 70)",
        "(line 1480,col 9)-(line 1480,col 79)",
        "(line 1481,col 9)-(line 1499,col 9)",
        "(line 1500,col 9)-(line 1500,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1504,
      "end_line": 1530,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1508,col 9)-(line 1508,col 70)",
        "(line 1509,col 9)-(line 1509,col 79)",
        "(line 1510,col 9)-(line 1528,col 9)",
        "(line 1529,col 9)-(line 1529,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.blockHeight(int)",
      "begin_line": 1537,
      "end_line": 1539,
      "comment": "\n     * Get the height of a block.\n     * @param blockRow row index (in block sense) of the block\n     * @return height (number of rows) of the block\n     ",
      "child_ranges": [
        "(line 1538,col 9)-(line 1538,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockFieldMatrix.blockWidth(int)",
      "begin_line": 1546,
      "end_line": 1548,
      "comment": "\n     * Get the width of a block.\n     * @param blockColumn column index (in block sense) of the block\n     * @return width (number of columns) of the block\n     ",
      "child_ranges": [
        "(line 1547,col 9)-(line 1547,col 99)"
      ]
    }
  ]
}