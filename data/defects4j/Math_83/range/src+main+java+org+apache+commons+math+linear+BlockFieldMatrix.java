{
  "filepath": "/tmp/Math-83b/src/main/java/org/apache/commons/math/linear/BlockFieldMatrix.java",
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
      "end_line": 1621,
      "comment": "\n * Cache-friendly implementation of FieldMatrix using a flat arrays to store\n * square blocks of the matrix.\n * \u003cp\u003e\n * This implementation is specially designed to be cache-friendly. Square blocks are\n * stored as small arrays and allow efficient traversal of data both in row major direction\n * and columns major direction, one block at a time. This greatly increases performances\n * for algorithms that use crossed directions loops like multiplication or transposition.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The size of square blocks is a static parameter. It may be tuned according to the cache\n * size of the target computer processor. As a rule of thumbs, it should be the largest\n * value that allows three blocks to be simultaneously cached (this is necessary for example\n * for matrix multiplication). The default value is to use 36x36 blocks.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The regular blocks represent {@link #BLOCK_SIZE} x {@link #BLOCK_SIZE} squares. Blocks\n * at right hand side and bottom side which may be smaller to fit matrix dimensions. The square\n * blocks are flattened in row major order in single dimension arrays which are therefore\n * {@link #BLOCK_SIZE}\u003csup\u003e2\u003c/sup\u003e elements long for regular blocks. The blocks are themselves\n * organized in row major order.\n * \u003c/p\u003e\n * \u003cp\u003e\n * As an example, for a block size of 36x36, a 100x60 matrix would be stored in 6 blocks.\n * Block 0 would be a Field[1296] array holding the upper left 36x36 square, block 1 would be\n * a Field[1296] array holding the upper center 36x36 square, block 2 would be a Field[1008]\n * array holding the upper right 36x28 rectangle, block 3 would be a Field[864] array holding\n * the lower left 24x36 rectangle, block 4 would be a Field[864] array holding the lower center\n * 24x36 rectangle and block 5 would be a Field[672] array holding the lower right 24x28\n * rectangle.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The layout complexity overhead versus simple mapping of matrices to java\n * arrays is negligible for small matrices (about 1%). The gain from cache efficiency leads\n * to up to 3-fold improvements for matrices of moderate to large size.\n * \u003c/p\u003e\n * @param \u003cT\u003e the type of the field elements\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Serializable version identifier "
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
      "end_line": 252,
      "comment": "\n     * Convert a data array from raw layout to blocks layout.\n     * \u003cp\u003e\n     * Raw layout is the straightforward layout where element at row i and\n     * column j is in array element \u003ccode\u003erawData[i][j]\u003c/code\u003e. Blocks layout\n     * is the layout used in {@link BlockFieldMatrix} instances, where the matrix\n     * is split in square blocks (except at right and bottom side where blocks may\n     * be rectangular to fit matrix size) and each block is stored in a flattened\n     * one-dimensional array.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method creates an array in blocks layout from an input array in raw layout.\n     * It can be used to provide the array argument of the {@link\n     * #BlockFieldMatrix(int, int, FieldElement[][], boolean)}\n     * constructor.\n     * \u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param rawData data array in raw layout\n     * @return a new data array containing the same entries but in blocks layout\n     * @exception IllegalArgumentException if \u003ccode\u003erawData\u003c/code\u003e is not rectangular\n     *  (not all rows have the same length)\n     * @see #createBlocksLayout(Field, int, int)\n     * @see #BlockFieldMatrix(int, int, FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 48)",
        "(line 212,col 9)-(line 212,col 51)",
        "(line 213,col 9)-(line 213,col 73)",
        "(line 214,col 9)-(line 214,col 73)",
        "(line 217,col 9)-(line 224,col 9)",
        "(line 227,col 9)-(line 227,col 53)",
        "(line 228,col 9)-(line 228,col 77)",
        "(line 229,col 9)-(line 248,col 9)",
        "(line 250,col 9)-(line 250,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.createBlocksLayout(org.apache.commons.math.Field\u003cT\u003e, int, int)",
      "begin_line": 269,
      "end_line": 290,
      "comment": "\n     * Create a data array in blocks layout.\n     * \u003cp\u003e\n     * This method can be used to create the array argument of the {@link\n     * #BlockFieldMatrix(int, int, FieldElement[][], boolean)}\n     * constructor.\n     * \u003c/p\u003e\n     * @param \u003cT\u003e the type of the field elements\n     * @param field field to which the elements belong\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @return a new data array in blocks layout\n     * @see #toBlocksLayout(FieldElement[][])\n     * @see #BlockFieldMatrix(int, int, FieldElement[][], boolean)\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 73)",
        "(line 273,col 9)-(line 273,col 73)",
        "(line 275,col 9)-(line 275,col 77)",
        "(line 276,col 9)-(line 286,col 9)",
        "(line 288,col 9)-(line 288,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.createMatrix(int, int)",
      "begin_line": 293,
      "end_line": 297,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.copy()",
      "begin_line": 300,
      "end_line": 313,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 88)",
        "(line 307,col 9)-(line 309,col 9)",
        "(line 311,col 9)-(line 311,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.add(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 316,
      "end_line": 355,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 319,col 9)-(line 354,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.add(org.apache.commons.math.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 364,
      "end_line": 384,
      "comment": "\n     * Compute the sum of this and \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be added\n     * @return     this + m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 35)",
        "(line 370,col 9)-(line 370,col 91)",
        "(line 373,col 9)-(line 380,col 9)",
        "(line 382,col 9)-(line 382,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.subtract(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 387,
      "end_line": 426,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 390,col 9)-(line 425,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.subtract(org.apache.commons.math.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 435,
      "end_line": 455,
      "comment": "\n     * Compute this minus \u003ccode\u003em\u003c/code\u003e.\n     *\n     * @param m    matrix to be subtracted\n     * @return     this - m\n     * @throws  IllegalArgumentException if m is not the same size as this\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 38)",
        "(line 441,col 9)-(line 441,col 91)",
        "(line 444,col 9)-(line 451,col 9)",
        "(line 453,col 9)-(line 453,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.scalarAdd(T)",
      "begin_line": 458,
      "end_line": 475,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 91)",
        "(line 465,col 9)-(line 471,col 9)",
        "(line 473,col 9)-(line 473,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.scalarMultiply(T)",
      "begin_line": 478,
      "end_line": 495,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 91)",
        "(line 485,col 9)-(line 491,col 9)",
        "(line 493,col 9)-(line 493,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.multiply(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 498,
      "end_line": 554,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 501,col 9)-(line 553,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.multiply(org.apache.commons.math.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 564,
      "end_line": 627,
      "comment": "\n     * Returns the result of postmultiplying this by m.\n     *\n     * @param m    matrix to postmultiply by\n     * @return     this * m\n     * @throws     IllegalArgumentException\n     *             if columnDimension(this) !\u003d rowDimension(m)\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 41)",
        "(line 569,col 9)-(line 569,col 93)",
        "(line 570,col 9)-(line 570,col 44)",
        "(line 573,col 9)-(line 573,col 27)",
        "(line 574,col 9)-(line 623,col 9)",
        "(line 625,col 9)-(line 625,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getData()",
      "begin_line": 630,
      "end_line": 657,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 633,col 9)-(line 633,col 91)",
        "(line 634,col 9)-(line 634,col 74)",
        "(line 636,col 9)-(line 653,col 9)",
        "(line 655,col 9)-(line 655,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 660,
      "end_line": 751,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 666,col 9)-(line 666,col 70)",
        "(line 669,col 9)-(line 670,col 100)",
        "(line 673,col 9)-(line 673,col 62)",
        "(line 674,col 9)-(line 674,col 62)",
        "(line 675,col 9)-(line 675,col 62)",
        "(line 676,col 9)-(line 676,col 62)",
        "(line 679,col 9)-(line 747,col 9)",
        "(line 749,col 9)-(line 749,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.copyBlockPart(T[], int, int, int, int, int, T[], int, int, int)",
      "begin_line": 768,
      "end_line": 781,
      "comment": "\n     * Copy a part of a block into another one\n     * \u003cp\u003eThis method can be called only when the specified part fits in both\n     * blocks, no verification is done here.\u003c/p\u003e\n     * @param srcBlock source block\n     * @param srcWidth source block width ({@link #BLOCK_SIZE} or smaller)\n     * @param srcStartRow start row in the source block\n     * @param srcEndRow end row (exclusive) in the source block\n     * @param srcStartColumn start column in the source block\n     * @param srcEndColumn end column (exclusive) in the source block\n     * @param dstBlock destination block\n     * @param dstWidth destination block width ({@link #BLOCK_SIZE} or smaller)\n     * @param dstStartRow start row in the destination block\n     * @param dstStartColumn start column in the destination block\n     ",
      "child_ranges": [
        "(line 773,col 9)-(line 773,col 57)",
        "(line 774,col 9)-(line 774,col 61)",
        "(line 775,col 9)-(line 775,col 61)",
        "(line 776,col 9)-(line 780,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setSubMatrix(T[][], int, int)",
      "begin_line": 784,
      "end_line": 834,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 789,col 9)-(line 789,col 50)",
        "(line 790,col 9)-(line 792,col 9)",
        "(line 793,col 9)-(line 793,col 57)",
        "(line 794,col 9)-(line 794,col 53)",
        "(line 795,col 9)-(line 795,col 60)",
        "(line 796,col 9)-(line 802,col 9)",
        "(line 805,col 9)-(line 805,col 54)",
        "(line 806,col 9)-(line 806,col 72)",
        "(line 807,col 9)-(line 807,col 57)",
        "(line 808,col 9)-(line 808,col 75)",
        "(line 811,col 9)-(line 833,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getRowMatrix(int)",
      "begin_line": 837,
      "end_line": 867,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 841,col 9)-(line 841,col 27)",
        "(line 842,col 9)-(line 842,col 88)",
        "(line 845,col 9)-(line 845,col 45)",
        "(line 846,col 9)-(line 846,col 54)",
        "(line 847,col 9)-(line 847,col 30)",
        "(line 848,col 9)-(line 848,col 30)",
        "(line 849,col 9)-(line 849,col 49)",
        "(line 850,col 9)-(line 863,col 9)",
        "(line 865,col 9)-(line 865,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setRowMatrix(int, org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 870,
      "end_line": 878,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 873,col 9)-(line 877,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setRowMatrix(int, org.apache.commons.math.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 891,
      "end_line": 925,
      "comment": "\n     * Sets the entries in row number \u003ccode\u003erow\u003c/code\u003e\n     * as a row matrix.  Row indices start at 0.\n     *\n     * @param row the row to be set\n     * @param matrix row matrix (must have one row and the same number of columns\n     * as the instance)\n     * @throws MatrixIndexException if the specified row index is invalid\n     * @throws InvalidMatrixException if the matrix dimensions do not match one\n     * instance row\n     ",
      "child_ranges": [
        "(line 894,col 9)-(line 894,col 27)",
        "(line 895,col 9)-(line 895,col 47)",
        "(line 896,col 9)-(line 902,col 9)",
        "(line 905,col 9)-(line 905,col 44)",
        "(line 906,col 9)-(line 906,col 53)",
        "(line 907,col 9)-(line 907,col 29)",
        "(line 908,col 9)-(line 908,col 29)",
        "(line 909,col 9)-(line 909,col 49)",
        "(line 910,col 9)-(line 923,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getColumnMatrix(int)",
      "begin_line": 928,
      "end_line": 956,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 932,col 9)-(line 932,col 33)",
        "(line 933,col 9)-(line 933,col 85)",
        "(line 936,col 9)-(line 936,col 48)",
        "(line 937,col 9)-(line 937,col 57)",
        "(line 938,col 9)-(line 938,col 47)",
        "(line 939,col 9)-(line 939,col 30)",
        "(line 940,col 9)-(line 940,col 30)",
        "(line 941,col 9)-(line 941,col 49)",
        "(line 942,col 9)-(line 952,col 9)",
        "(line 954,col 9)-(line 954,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setColumnMatrix(int, org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 959,
      "end_line": 967,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 962,col 9)-(line 966,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setColumnMatrix(int, org.apache.commons.math.linear.BlockFieldMatrix\u003cT\u003e)",
      "begin_line": 980,
      "end_line": 1012,
      "comment": "\n     * Sets the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n     * as a column matrix.  Column indices start at 0.\n     *\n     * @param column the column to be set\n     * @param matrix column matrix (must have one column and the same number of rows\n     * as the instance)\n     * @throws MatrixIndexException if the specified column index is invalid\n     * @throws InvalidMatrixException if the matrix dimensions do not match one\n     * instance column\n     ",
      "child_ranges": [
        "(line 983,col 9)-(line 983,col 33)",
        "(line 984,col 9)-(line 984,col 44)",
        "(line 985,col 9)-(line 991,col 9)",
        "(line 994,col 9)-(line 994,col 48)",
        "(line 995,col 9)-(line 995,col 57)",
        "(line 996,col 9)-(line 996,col 47)",
        "(line 997,col 9)-(line 997,col 28)",
        "(line 998,col 9)-(line 998,col 28)",
        "(line 999,col 9)-(line 999,col 48)",
        "(line 1000,col 9)-(line 1010,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getRowVector(int)",
      "begin_line": 1015,
      "end_line": 1035,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1019,col 9)-(line 1019,col 27)",
        "(line 1020,col 9)-(line 1020,col 60)",
        "(line 1023,col 9)-(line 1023,col 45)",
        "(line 1024,col 9)-(line 1024,col 54)",
        "(line 1025,col 9)-(line 1025,col 30)",
        "(line 1026,col 9)-(line 1031,col 9)",
        "(line 1033,col 9)-(line 1033,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setRowVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 1038,
      "end_line": 1046,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1041,col 9)-(line 1045,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getColumnVector(int)",
      "begin_line": 1049,
      "end_line": 1071,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1053,col 9)-(line 1053,col 33)",
        "(line 1054,col 9)-(line 1054,col 57)",
        "(line 1057,col 9)-(line 1057,col 48)",
        "(line 1058,col 9)-(line 1058,col 57)",
        "(line 1059,col 9)-(line 1059,col 47)",
        "(line 1060,col 9)-(line 1060,col 30)",
        "(line 1061,col 9)-(line 1067,col 9)",
        "(line 1069,col 9)-(line 1069,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setColumnVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 1074,
      "end_line": 1082,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1077,col 9)-(line 1081,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getRow(int)",
      "begin_line": 1085,
      "end_line": 1105,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1089,col 9)-(line 1089,col 27)",
        "(line 1090,col 9)-(line 1090,col 56)",
        "(line 1093,col 9)-(line 1093,col 45)",
        "(line 1094,col 9)-(line 1094,col 54)",
        "(line 1095,col 9)-(line 1095,col 30)",
        "(line 1096,col 9)-(line 1101,col 9)",
        "(line 1103,col 9)-(line 1103,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setRow(int, T[])",
      "begin_line": 1108,
      "end_line": 1131,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1112,col 9)-(line 1112,col 27)",
        "(line 1113,col 9)-(line 1113,col 47)",
        "(line 1114,col 9)-(line 1118,col 9)",
        "(line 1121,col 9)-(line 1121,col 45)",
        "(line 1122,col 9)-(line 1122,col 54)",
        "(line 1123,col 9)-(line 1123,col 30)",
        "(line 1124,col 9)-(line 1129,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getColumn(int)",
      "begin_line": 1134,
      "end_line": 1156,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1138,col 9)-(line 1138,col 33)",
        "(line 1139,col 9)-(line 1139,col 53)",
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
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setColumn(int, T[])",
      "begin_line": 1159,
      "end_line": 1184,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1163,col 9)-(line 1163,col 33)",
        "(line 1164,col 9)-(line 1164,col 44)",
        "(line 1165,col 9)-(line 1169,col 9)",
        "(line 1172,col 9)-(line 1172,col 48)",
        "(line 1173,col 9)-(line 1173,col 57)",
        "(line 1174,col 9)-(line 1174,col 47)",
        "(line 1175,col 9)-(line 1175,col 30)",
        "(line 1176,col 9)-(line 1182,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getEntry(int, int)",
      "begin_line": 1187,
      "end_line": 1201,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1190,col 9)-(line 1200,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.setEntry(int, int, T)",
      "begin_line": 1204,
      "end_line": 1218,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1207,col 9)-(line 1217,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.addToEntry(int, int, T)",
      "begin_line": 1221,
      "end_line": 1236,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1224,col 9)-(line 1235,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.multiplyEntry(int, int, T)",
      "begin_line": 1239,
      "end_line": 1254,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1242,col 9)-(line 1253,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.transpose()",
      "begin_line": 1257,
      "end_line": 1291,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1260,col 9)-(line 1260,col 44)",
        "(line 1261,col 9)-(line 1261,col 47)",
        "(line 1262,col 9)-(line 1262,col 90)",
        "(line 1265,col 9)-(line 1265,col 27)",
        "(line 1266,col 9)-(line 1287,col 9)",
        "(line 1289,col 9)-(line 1289,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getRowDimension()",
      "begin_line": 1294,
      "end_line": 1297,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1296,col 9)-(line 1296,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.getColumnDimension()",
      "begin_line": 1300,
      "end_line": 1303,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1302,col 9)-(line 1302,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.operate(T[])",
      "begin_line": 1306,
      "end_line": 1348,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1310,col 9)-(line 1314,col 9)",
        "(line 1315,col 9)-(line 1315,col 53)",
        "(line 1316,col 9)-(line 1316,col 44)",
        "(line 1319,col 9)-(line 1344,col 9)",
        "(line 1346,col 9)-(line 1346,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.preMultiply(T[])",
      "begin_line": 1351,
      "end_line": 1399,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1355,col 9)-(line 1359,col 9)",
        "(line 1360,col 9)-(line 1360,col 56)",
        "(line 1361,col 9)-(line 1361,col 44)",
        "(line 1364,col 9)-(line 1395,col 9)",
        "(line 1397,col 9)-(line 1397,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 1402,
      "end_line": 1422,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1405,col 9)-(line 1405,col 66)",
        "(line 1406,col 9)-(line 1420,col 9)",
        "(line 1421,col 9)-(line 1421,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 1425,
      "end_line": 1445,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1428,col 9)-(line 1428,col 66)",
        "(line 1429,col 9)-(line 1443,col 9)",
        "(line 1444,col 9)-(line 1444,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1448,
      "end_line": 1473,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1453,col 9)-(line 1453,col 70)",
        "(line 1454,col 9)-(line 1454,col 79)",
        "(line 1455,col 9)-(line 1471,col 9)",
        "(line 1472,col 9)-(line 1472,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInRowOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1476,
      "end_line": 1501,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1481,col 9)-(line 1481,col 70)",
        "(line 1482,col 9)-(line 1482,col 79)",
        "(line 1483,col 9)-(line 1499,col 9)",
        "(line 1500,col 9)-(line 1500,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e)",
      "begin_line": 1504,
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
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e)",
      "begin_line": 1526,
      "end_line": 1545,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1529,col 9)-(line 1529,col 66)",
        "(line 1530,col 9)-(line 1543,col 9)",
        "(line 1544,col 9)-(line 1544,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixChangingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1548,
      "end_line": 1573,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1553,col 9)-(line 1553,col 70)",
        "(line 1554,col 9)-(line 1554,col 79)",
        "(line 1555,col 9)-(line 1571,col 9)",
        "(line 1572,col 9)-(line 1572,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.FieldMatrixPreservingVisitor\u003cT\u003e, int, int, int, int)",
      "begin_line": 1576,
      "end_line": 1601,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1581,col 9)-(line 1581,col 70)",
        "(line 1582,col 9)-(line 1582,col 79)",
        "(line 1583,col 9)-(line 1599,col 9)",
        "(line 1600,col 9)-(line 1600,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.blockHeight(int)",
      "begin_line": 1608,
      "end_line": 1610,
      "comment": "\n     * Get the height of a block.\n     * @param blockRow row index (in block sense) of the block\n     * @return height (number of rows) of the block\n     ",
      "child_ranges": [
        "(line 1609,col 9)-(line 1609,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockFieldMatrix.blockWidth(int)",
      "begin_line": 1617,
      "end_line": 1619,
      "comment": "\n     * Get the width of a block.\n     * @param blockColumn column index (in block sense) of the block\n     * @return width (number of columns) of the block\n     ",
      "child_ranges": [
        "(line 1618,col 9)-(line 1618,col 99)"
      ]
    }
  ]
}