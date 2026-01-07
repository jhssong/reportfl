{
  "filepath": "/tmp/Math-57b/src/main/java/org/apache/commons/math/linear/BlockFieldMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BlockFieldMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.AbstractFieldMatrix\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 69,
      "end_line": 1547,
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
      "begin_line": 73,
      "end_line": 73,
      "comment": " Serializable version identifier. "
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
      "begin_line": 77,
      "end_line": 77,
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
      "begin_line": 81,
      "end_line": 81,
      "comment": " Number of block rows of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "blockColumns"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Number of block columns of the matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.BlockFieldMatrix(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 94,
      "end_line": 105,
      "comment": "\n     * Create a new matrix with the supplied row and column dimensions.\n     *\n     * @param field Field to which the elements belong.\n     * @param rows Number of rows in the new matrix.\n     * @param columns Number of columns in the new matrix.\n     * @throws org.apache.commons.math.exception.NotStrictlyPositiveException\n     * if row or column dimension is not positive.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 36)",
        "(line 96,col 9)-(line 96,col 28)",
        "(line 97,col 9)-(line 97,col 31)",
        "(line 100,col 9)-(line 100,col 63)",
        "(line 101,col 9)-(line 101,col 63)",
        "(line 104,col 9)-(line 104,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.BlockFieldMatrix(T[][])",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * Create a new dense matrix copying entries from raw layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in raw layout.\u003c/p\u003e\n     * \u003cp\u003eCalling this constructor is equivalent to call:\n     * \u003cpre\u003ematrix \u003d new BlockFieldMatrix\u003cT\u003e(getField(), rawData.length, rawData[0].length,\n     *                                   toBlocksLayout(rawData), false);\u003c/pre\u003e\n     * \u003c/p\u003e\n     * @param rawData Data for the new matrix, in raw layout.\n     *\n     * @exception DimensionMismatchException if the {@code blockData} shape is\n     * inconsistent with block layout.\n     * @see #BlockFieldMatrix(int, int, FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 80)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.BlockFieldMatrix(int, int, T[][], boolean)",
      "begin_line": 139,
      "end_line": 170,
      "comment": "\n     * Create a new dense matrix copying entries from block layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in blocks layout.\u003c/p\u003e\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @param blockData data for new matrix\n     * @param copyArray if true, the input array will be copied, otherwise\n     * it will be referenced\n     *\n     * @exception DimensionMismatchException if the {@code blockData} shape is\n     * inconsistent with block layout.\n     * @see #createBlocksLayout(Field, int, int)\n     * @see #toBlocksLayout(FieldElement[][])\n     * @see #BlockFieldMatrix(FieldElement[][])\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 54)",
        "(line 142,col 9)-(line 142,col 28)",
        "(line 143,col 9)-(line 143,col 31)",
        "(line 146,col 9)-(line 146,col 63)",
        "(line 147,col 9)-(line 147,col 63)",
        "(line 149,col 9)-(line 155,col 9)",
        "(line 157,col 9)-(line 157,col 22)",
        "(line 158,col 9)-(line 169,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.toBlocksLayout(T[][])",
      "begin_line": 196,
      "end_line": 240,
      "comment": "\n     * Convert a data array from raw layout to blocks layout.\n     * \u003cp\u003e\n     * Raw layout is the straightforward layout where element at row i and\n     * column j is in array element \u003ccode\u003erawData[i][j]\u003c/code\u003e. Blocks layout\n     * is the layout used in {@link BlockFieldMatrix} instances, where the matrix\n     * is split in square blocks (except at right and bottom side where blocks may\n     * be rectangular to fit matrix size) and each block is stored in a flattened\n     * one-dimensional array.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method creates an array in blocks layout from an input array in raw layout.\n     * It can be used to provide the array argument of the {@link\n     * #BlockFieldMatrix(int, int, FieldElement[][], boolean)}\n     * constructor.\n     * \u003c/p\u003e\n     * @param \u003cT\u003e Type of the field elements.\n     * @param rawData Data array in raw layout.\n     * @return a new data array containing the same entries but in blocks layout\n     * @throws DimensionMismatchException if {@code rawData} is not rectangular\n     *  (not all rows have the same length).\n     * @see #createBlocksLayout(Field, int, int)\n     * @see #BlockFieldMatrix(int, int, FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 48)",
        "(line 199,col 9)-(line 199,col 51)",
        "(line 200,col 9)-(line 200,col 73)",
        "(line 201,col 9)-(line 201,col 73)",
        "(line 204,col 9)-(line 209,col 9)",
        "(line 212,col 9)-(line 212,col 53)",
        "(line 213,col 9)-(line 213,col 77)",
        "(line 214,col 9)-(line 214,col 27)",
        "(line 215,col 9)-(line 237,col 9)",
        "(line 239,col 9)-(line 239,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.createBlocksLayout(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 257,
      "end_line": 278,
      "comment": "\n     * Create a data array in blocks layout.\n     * \u003cp\u003e\n     * This method can be used to create the array argument of the {@link\n     * #BlockFieldMatrix(int, int, FieldElement[][], boolean)}\n     * constructor.\n     * \u003c/p\u003e\n     * @param \u003cT\u003e Type of the field elements.\n     * @param field Field to which the elements belong.\n     * @param rows Number of rows in the new matrix.\n     * @param columns Number of columns in the new matrix.\n     * @return a new data array in blocks layout.\n     * @see #toBlocksLayout(FieldElement[][])\n     * @see #BlockFieldMatrix(int, int, FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 73)",
        "(line 260,col 9)-(line 260,col 73)",
        "(line 262,col 9)-(line 262,col 77)",
        "(line 263,col 9)-(line 263,col 27)",
        "(line 264,col 9)-(line 275,col 9)",
        "(line 277,col 9)-(line 277,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.createMatrix(int, int)",
      "begin_line": 281,
      "end_line": 284,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.copy()",
      "begin_line": 287,
      "end_line": 299,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 88)",
        "(line 294,col 9)-(line 296,col 9)",
        "(line 298,col 9)-(line 298,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.add(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 302,
      "end_line": 341,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 304,col 9)-(line 340,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.add(org.apache.commons.math.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 350,
      "end_line": 368,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 35)",
        "(line 355,col 9)-(line 355,col 91)",
        "(line 358,col 9)-(line 365,col 9)",
        "(line 367,col 9)-(line 367,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.subtract(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 371,
      "end_line": 410,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 373,col 9)-(line 409,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.subtract(org.apache.commons.math.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 419,
      "end_line": 436,
      "comment": "\n     * Compute this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this - m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 38)",
        "(line 423,col 9)-(line 423,col 91)",
        "(line 426,col 9)-(line 433,col 9)",
        "(line 435,col 9)-(line 435,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.scalarAdd(T)",
      "begin_line": 439,
      "end_line": 453,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 91)",
        "(line 444,col 9)-(line 450,col 9)",
        "(line 452,col 9)-(line 452,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.scalarMultiply(T)",
      "begin_line": 456,
      "end_line": 471,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 91)",
        "(line 462,col 9)-(line 468,col 9)",
        "(line 470,col 9)-(line 470,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.multiply(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 474,
      "end_line": 531,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 476,col 9)-(line 530,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.multiply(org.apache.commons.math.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 541,
      "end_line": 603,
      "comment": "\n     * Returns the result of postmultiplying this by m.\n     *\n     * @param m    matrix to postmultiply by\n     * @return     this * m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 41)",
        "(line 546,col 9)-(line 546,col 93)",
        "(line 547,col 9)-(line 547,col 44)",
        "(line 550,col 9)-(line 550,col 27)",
        "(line 551,col 9)-(line 600,col 9)",
        "(line 602,col 9)-(line 602,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getData()",
      "begin_line": 606,
      "end_line": 632,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 609,col 9)-(line 609,col 91)",
        "(line 610,col 9)-(line 610,col 74)",
        "(line 612,col 9)-(line 629,col 9)",
        "(line 631,col 9)-(line 631,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 635,
      "end_line": 726,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 639,col 9)-(line 639,col 70)",
        "(line 642,col 9)-(line 643,col 100)",
        "(line 646,col 9)-(line 646,col 62)",
        "(line 647,col 9)-(line 647,col 62)",
        "(line 648,col 9)-(line 648,col 62)",
        "(line 649,col 9)-(line 649,col 62)",
        "(line 652,col 9)-(line 652,col 35)",
        "(line 653,col 9)-(line 723,col 9)",
        "(line 725,col 9)-(line 725,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.copyBlockPart(T[], int, int, int, int, int, T[], int, int, int)",
      "begin_line": 743,
      "end_line": 756,
      "comment": "\n     * Copy a part of a block into another one\n     * \u003cp\u003eThis method can be called only when the specified part fits in both\n     * blocks, no verification is done here.\u003c/p\u003e\n     * @param srcBlock source block\n     * @param srcWidth source block width ({@link #BLOCK_SIZE} or smaller)\n     * @param srcStartRow start row in the source block\n     * @param srcEndRow end row (exclusive) in the source block\n     * @param srcStartColumn start column in the source block\n     * @param srcEndColumn end column (exclusive) in the source block\n     * @param dstBlock destination block\n     * @param dstWidth destination block width ({@link #BLOCK_SIZE} or smaller)\n     * @param dstStartRow start row in the destination block\n     * @param dstStartColumn start column in the destination block\n     ",
      "child_ranges": [
        "(line 748,col 9)-(line 748,col 57)",
        "(line 749,col 9)-(line 749,col 61)",
        "(line 750,col 9)-(line 750,col 61)",
        "(line 751,col 9)-(line 755,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setSubMatrix(T[][], int, int)",
      "begin_line": 759,
      "end_line": 805,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 762,col 9)-(line 762,col 50)",
        "(line 763,col 9)-(line 765,col 9)",
        "(line 766,col 9)-(line 766,col 57)",
        "(line 767,col 9)-(line 767,col 53)",
        "(line 768,col 9)-(line 768,col 60)",
        "(line 769,col 9)-(line 773,col 9)",
        "(line 776,col 9)-(line 776,col 54)",
        "(line 777,col 9)-(line 777,col 72)",
        "(line 778,col 9)-(line 778,col 57)",
        "(line 779,col 9)-(line 779,col 75)",
        "(line 782,col 9)-(line 804,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getRowMatrix(int)",
      "begin_line": 808,
      "end_line": 835,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 810,col 9)-(line 810,col 27)",
        "(line 811,col 9)-(line 811,col 88)",
        "(line 814,col 9)-(line 814,col 45)",
        "(line 815,col 9)-(line 815,col 54)",
        "(line 816,col 9)-(line 816,col 30)",
        "(line 817,col 9)-(line 817,col 30)",
        "(line 818,col 9)-(line 818,col 49)",
        "(line 819,col 9)-(line 832,col 9)",
        "(line 834,col 9)-(line 834,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setRowMatrix(int, org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 838,
      "end_line": 845,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 840,col 9)-(line 844,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setRowMatrix(int, org.apache.commons.math.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 859,
      "end_line": 889,
      "comment": "\n     * Sets the entries in row number \u003ccode\u003erow\u003c/code\u003e\n     * as a row matrix.  Row indices start at 0.\n     *\n     * @param row the row to be set\n     * @param matrix row matrix (must have one row and the same number of columns\n     * as the instance)\n     * @throws org.apache.commons.math.exception.OutOfRangeException if the\n     * specified row index is invalid.\n     * @throws MatrixDimensionMismatchException if the matrix dimensions do\n     * not match one instance row.\n     ",
      "child_ranges": [
        "(line 860,col 9)-(line 860,col 27)",
        "(line 861,col 9)-(line 861,col 47)",
        "(line 862,col 9)-(line 867,col 9)",
        "(line 870,col 9)-(line 870,col 44)",
        "(line 871,col 9)-(line 871,col 53)",
        "(line 872,col 9)-(line 872,col 29)",
        "(line 873,col 9)-(line 873,col 29)",
        "(line 874,col 9)-(line 874,col 49)",
        "(line 875,col 9)-(line 888,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getColumnMatrix(int)",
      "begin_line": 892,
      "end_line": 917,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 894,col 9)-(line 894,col 33)",
        "(line 895,col 9)-(line 895,col 85)",
        "(line 898,col 9)-(line 898,col 48)",
        "(line 899,col 9)-(line 899,col 57)",
        "(line 900,col 9)-(line 900,col 47)",
        "(line 901,col 9)-(line 901,col 30)",
        "(line 902,col 9)-(line 902,col 30)",
        "(line 903,col 9)-(line 903,col 49)",
        "(line 904,col 9)-(line 914,col 9)",
        "(line 916,col 9)-(line 916,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setColumnMatrix(int, org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 920,
      "end_line": 927,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 922,col 9)-(line 926,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setColumnMatrix(int, org.apache.commons.math.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 941,
      "end_line": 969,
      "comment": "\n     * Sets the entries in column number {@code column}\n     * as a column matrix.  Column indices start at 0.\n     *\n     * @param column Column to be set.\n     * @param matrix Column matrix (must have one column and the same number of rows\n     * as the instance).\n     * @throws org.apache.commons.math.exception.OutOfRangeException if\n     * the specified column index is invalid.\n     * @throws MatrixDimensionMismatchException if the matrix dimensions do\n     * not match one instance column.\n     ",
      "child_ranges": [
        "(line 942,col 9)-(line 942,col 33)",
        "(line 943,col 9)-(line 943,col 44)",
        "(line 944,col 9)-(line 949,col 9)",
        "(line 952,col 9)-(line 952,col 48)",
        "(line 953,col 9)-(line 953,col 57)",
        "(line 954,col 9)-(line 954,col 47)",
        "(line 955,col 9)-(line 955,col 28)",
        "(line 956,col 9)-(line 956,col 28)",
        "(line 957,col 9)-(line 957,col 48)",
        "(line 958,col 9)-(line 968,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getRowVector(int)",
      "begin_line": 972,
      "end_line": 989,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 974,col 9)-(line 974,col 27)",
        "(line 975,col 9)-(line 975,col 60)",
        "(line 978,col 9)-(line 978,col 45)",
        "(line 979,col 9)-(line 979,col 54)",
        "(line 980,col 9)-(line 980,col 30)",
        "(line 981,col 9)-(line 986,col 9)",
        "(line 988,col 9)-(line 988,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setRowVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 992,
      "end_line": 999,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 994,col 9)-(line 998,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getColumnVector(int)",
      "begin_line": 1002,
      "end_line": 1021,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1004,col 9)-(line 1004,col 33)",
        "(line 1005,col 9)-(line 1005,col 57)",
        "(line 1008,col 9)-(line 1008,col 48)",
        "(line 1009,col 9)-(line 1009,col 57)",
        "(line 1010,col 9)-(line 1010,col 47)",
        "(line 1011,col 9)-(line 1011,col 30)",
        "(line 1012,col 9)-(line 1018,col 9)",
        "(line 1020,col 9)-(line 1020,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setColumnVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 1024,
      "end_line": 1031,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1026,col 9)-(line 1030,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getRow(int)",
      "begin_line": 1034,
      "end_line": 1051,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1036,col 9)-(line 1036,col 27)",
        "(line 1037,col 9)-(line 1037,col 56)",
        "(line 1040,col 9)-(line 1040,col 45)",
        "(line 1041,col 9)-(line 1041,col 54)",
        "(line 1042,col 9)-(line 1042,col 30)",
        "(line 1043,col 9)-(line 1048,col 9)",
        "(line 1050,col 9)-(line 1050,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setRow(int, T[])",
      "begin_line": 1054,
      "end_line": 1072,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1056,col 9)-(line 1056,col 27)",
        "(line 1057,col 9)-(line 1057,col 47)",
        "(line 1058,col 9)-(line 1060,col 9)",
        "(line 1063,col 9)-(line 1063,col 45)",
        "(line 1064,col 9)-(line 1064,col 54)",
        "(line 1065,col 9)-(line 1065,col 30)",
        "(line 1066,col 9)-(line 1071,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getColumn(int)",
      "begin_line": 1075,
      "end_line": 1094,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1077,col 9)-(line 1077,col 33)",
        "(line 1078,col 9)-(line 1078,col 53)",
        "(line 1081,col 9)-(line 1081,col 48)",
        "(line 1082,col 9)-(line 1082,col 57)",
        "(line 1083,col 9)-(line 1083,col 47)",
        "(line 1084,col 9)-(line 1084,col 30)",
        "(line 1085,col 9)-(line 1091,col 9)",
        "(line 1093,col 9)-(line 1093,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setColumn(int, T[])",
      "begin_line": 1097,
      "end_line": 1117,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1099,col 9)-(line 1099,col 33)",
        "(line 1100,col 9)-(line 1100,col 44)",
        "(line 1101,col 9)-(line 1103,col 9)",
        "(line 1106,col 9)-(line 1106,col 48)",
        "(line 1107,col 9)-(line 1107,col 57)",
        "(line 1108,col 9)-(line 1108,col 47)",
        "(line 1109,col 9)-(line 1109,col 30)",
        "(line 1110,col 9)-(line 1116,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getEntry(int, int)",
      "begin_line": 1120,
      "end_line": 1131,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1122,col 9)-(line 1122,col 27)",
        "(line 1123,col 9)-(line 1123,col 33)",
        "(line 1125,col 9)-(line 1125,col 47)",
        "(line 1126,col 9)-(line 1126,col 47)",
        "(line 1127,col 9)-(line 1128,col 43)",
        "(line 1130,col 9)-(line 1130,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setEntry(int, int, T)",
      "begin_line": 1134,
      "end_line": 1145,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1136,col 9)-(line 1136,col 27)",
        "(line 1137,col 9)-(line 1137,col 33)",
        "(line 1139,col 9)-(line 1139,col 47)",
        "(line 1140,col 9)-(line 1140,col 47)",
        "(line 1141,col 9)-(line 1142,col 43)",
        "(line 1144,col 9)-(line 1144,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.addToEntry(int, int, T)",
      "begin_line": 1148,
      "end_line": 1160,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1150,col 9)-(line 1150,col 27)",
        "(line 1151,col 9)-(line 1151,col 33)",
        "(line 1153,col 9)-(line 1153,col 47)",
        "(line 1154,col 9)-(line 1154,col 47)",
        "(line 1155,col 9)-(line 1156,col 43)",
        "(line 1157,col 9)-(line 1157,col 67)",
        "(line 1159,col 9)-(line 1159,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.multiplyEntry(int, int, T)",
      "begin_line": 1163,
      "end_line": 1175,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1165,col 9)-(line 1165,col 27)",
        "(line 1166,col 9)-(line 1166,col 33)",
        "(line 1168,col 9)-(line 1168,col 47)",
        "(line 1169,col 9)-(line 1169,col 47)",
        "(line 1170,col 9)-(line 1171,col 43)",
        "(line 1172,col 9)-(line 1172,col 67)",
        "(line 1174,col 9)-(line 1174,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.transpose()",
      "begin_line": 1178,
      "end_line": 1214,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1180,col 9)-(line 1180,col 44)",
        "(line 1181,col 9)-(line 1181,col 47)",
        "(line 1182,col 9)-(line 1182,col 90)",
        "(line 1185,col 9)-(line 1185,col 27)",
        "(line 1186,col 9)-(line 1211,col 9)",
        "(line 1213,col 9)-(line 1213,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getRowDimension()",
      "begin_line": 1217,
      "end_line": 1220,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1219,col 9)-(line 1219,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getColumnDimension()",
      "begin_line": 1223,
      "end_line": 1226,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1225,col 9)-(line 1225,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.operate(T[])",
      "begin_line": 1229,
      "end_line": 1267,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1231,col 9)-(line 1233,col 9)",
        "(line 1234,col 9)-(line 1234,col 53)",
        "(line 1235,col 9)-(line 1235,col 44)",
        "(line 1238,col 9)-(line 1264,col 9)",
        "(line 1266,col 9)-(line 1266,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.preMultiply(T[])",
      "begin_line": 1270,
      "end_line": 1314,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1273,col 9)-(line 1275,col 9)",
        "(line 1276,col 9)-(line 1276,col 56)",
        "(line 1277,col 9)-(line 1277,col 44)",
        "(line 1280,col 9)-(line 1311,col 9)",
        "(line 1313,col 9)-(line 1313,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 1317,
      "end_line": 1338,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1319,col 9)-(line 1319,col 66)",
        "(line 1320,col 9)-(line 1336,col 9)",
        "(line 1337,col 9)-(line 1337,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 1341,
      "end_line": 1362,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1343,col 9)-(line 1343,col 66)",
        "(line 1344,col 9)-(line 1360,col 9)",
        "(line 1361,col 9)-(line 1361,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1365,
      "end_line": 1391,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1369,col 9)-(line 1369,col 70)",
        "(line 1370,col 9)-(line 1370,col 79)",
        "(line 1371,col 9)-(line 1389,col 9)",
        "(line 1390,col 9)-(line 1390,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1394,
      "end_line": 1420,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1398,col 9)-(line 1398,col 70)",
        "(line 1399,col 9)-(line 1399,col 79)",
        "(line 1400,col 9)-(line 1418,col 9)",
        "(line 1419,col 9)-(line 1419,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 1423,
      "end_line": 1445,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1425,col 9)-(line 1425,col 66)",
        "(line 1426,col 9)-(line 1426,col 27)",
        "(line 1427,col 9)-(line 1443,col 9)",
        "(line 1444,col 9)-(line 1444,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 1448,
      "end_line": 1470,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1450,col 9)-(line 1450,col 66)",
        "(line 1451,col 9)-(line 1451,col 27)",
        "(line 1452,col 9)-(line 1468,col 9)",
        "(line 1469,col 9)-(line 1469,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1473,
      "end_line": 1499,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1477,col 9)-(line 1477,col 70)",
        "(line 1478,col 9)-(line 1478,col 79)",
        "(line 1479,col 9)-(line 1497,col 9)",
        "(line 1498,col 9)-(line 1498,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1502,
      "end_line": 1528,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1506,col 9)-(line 1506,col 70)",
        "(line 1507,col 9)-(line 1507,col 79)",
        "(line 1508,col 9)-(line 1526,col 9)",
        "(line 1527,col 9)-(line 1527,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.blockHeight(int)",
      "begin_line": 1535,
      "end_line": 1537,
      "comment": "\n     * Get the height of a block.\n     * @param blockRow row index (in block sense) of the block\n     * @return height (number of rows) of the block\n     ",
      "child_ranges": [
        "(line 1536,col 9)-(line 1536,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.blockWidth(int)",
      "begin_line": 1544,
      "end_line": 1546,
      "comment": "\n     * Get the width of a block.\n     * @param blockColumn column index (in block sense) of the block\n     * @return width (number of columns) of the block\n     ",
      "child_ranges": [
        "(line 1545,col 9)-(line 1545,col 99)"
      ]
    }
  ]
}