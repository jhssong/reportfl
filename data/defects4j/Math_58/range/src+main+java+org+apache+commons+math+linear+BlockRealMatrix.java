{
  "filepath": "/tmp/Math-58b/src/main/java/org/apache/commons/math/linear/BlockRealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BlockRealMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.AbstractRealMatrix",
        "java.io.Serializable"
      ],
      "begin_line": 68,
      "end_line": 1533,
      "comment": "\n * Cache-friendly implementation of RealMatrix using a flat arrays to store\n * square blocks of the matrix.\n * \u003cp\u003e\n * This implementation is specially designed to be cache-friendly. Square blocks are\n * stored as small arrays and allow efficient traversal of data both in row major direction\n * and columns major direction, one block at a time. This greatly increases performances\n * for algorithms that use crossed directions loops like multiplication or transposition.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The size of square blocks is a static parameter. It may be tuned according to the cache\n * size of the target computer processor. As a rule of thumbs, it should be the largest\n * value that allows three blocks to be simultaneously cached (this is necessary for example\n * for matrix multiplication). The default value is to use 52x52 blocks which is well suited\n * for processors with 64k L1 cache (one block holds 2704 values or 21632 bytes). This value\n * could be lowered to 36x36 for processors with 32k L1 cache.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The regular blocks represent {@link #BLOCK_SIZE} x {@link #BLOCK_SIZE} squares. Blocks\n * at right hand side and bottom side which may be smaller to fit matrix dimensions. The square\n * blocks are flattened in row major order in single dimension arrays which are therefore\n * {@link #BLOCK_SIZE}\u003csup\u003e2\u003c/sup\u003e elements long for regular blocks. The blocks are themselves\n * organized in row major order.\n * \u003c/p\u003e\n * \u003cp\u003e\n * As an example, for a block size of 52x52, a 100x60 matrix would be stored in 4 blocks.\n * Block 0 would be a double[2704] array holding the upper left 52x52 square, block 1 would be\n * a double[416] array holding the upper right 52x8 rectangle, block 2 would be a double[2496]\n * array holding the lower left 48x52 rectangle and block 3 would be a double[384] array\n * holding the lower right 48x8 rectangle.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The layout complexity overhead versus simple mapping of matrices to java\n * arrays is negligible for small matrices (about 1%). The gain from cache efficiency leads\n * to up to 3-fold improvements for matrices of moderate to large size.\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
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
      "begin_line": 72,
      "end_line": 72,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "blocks"
      ],
      "begin_line": 74,
      "end_line": 74,
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
      "begin_line": 78,
      "end_line": 78,
      "comment": " Number of columns of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "blockRows"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Number of block rows of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "blockColumns"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Number of block columns of the matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.BlockRealMatrix(int, int)",
      "begin_line": 92,
      "end_line": 103,
      "comment": "\n     * Create a new matrix with the supplied row and column dimensions.\n     *\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @throws org.apache.commons.math.exception.NotStrictlyPositiveException\n     * if row or column dimension is not positive.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 29)",
        "(line 94,col 9)-(line 94,col 25)",
        "(line 95,col 9)-(line 95,col 31)",
        "(line 98,col 9)-(line 98,col 57)",
        "(line 99,col 9)-(line 99,col 63)",
        "(line 102,col 9)-(line 102,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.BlockRealMatrix(double[][])",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Create a new dense matrix copying entries from raw layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in raw layout.\u003c/p\u003e\n     * \u003cp\u003eCalling this constructor is equivalent to call:\n     * \u003cpre\u003ematrix \u003d new BlockRealMatrix(rawData.length, rawData[0].length,\n     *                                   toBlocksLayout(rawData), false);\u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param rawData data for new matrix, in raw layout\n     * @throws DimensionMismatchException if the shape of {@code blockData} is\n     * inconsistent with block layout.\n     * @see #BlockRealMatrix(int, int, double[][], boolean)\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 80)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.BlockRealMatrix(int, int, double[][], boolean)",
      "begin_line": 136,
      "end_line": 167,
      "comment": "\n     * Create a new dense matrix copying entries from block layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in blocks layout.\u003c/p\u003e\n     *\n     * @param rows Number of rows in the new matrix.\n     * @param columns Number of columns in the new matrix.\n     * @param blockData data for new matrix\n     * @param copyArray Whether the input array will be copied or referenced.\n     * @throws DimensionMismatchException if the shape of {@code blockData} is\n     * inconsistent with block layout.\n     * @see #createBlocksLayout(int, int)\n     * @see #toBlocksLayout(double[][])\n     * @see #BlockRealMatrix(double[][])\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 29)",
        "(line 139,col 9)-(line 139,col 25)",
        "(line 140,col 9)-(line 140,col 31)",
        "(line 143,col 9)-(line 143,col 57)",
        "(line 144,col 9)-(line 144,col 63)",
        "(line 146,col 9)-(line 152,col 9)",
        "(line 154,col 9)-(line 154,col 22)",
        "(line 155,col 9)-(line 166,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.toBlocksLayout(double[][])",
      "begin_line": 190,
      "end_line": 231,
      "comment": "\n     * Convert a data array from raw layout to blocks layout.\n     * \u003cp\u003e\n     * Raw layout is the straightforward layout where element at row i and\n     * column j is in array element \u003ccode\u003erawData[i][j]\u003c/code\u003e. Blocks layout\n     * is the layout used in {@link BlockRealMatrix} instances, where the matrix\n     * is split in square blocks (except at right and bottom side where blocks may\n     * be rectangular to fit matrix size) and each block is stored in a flattened\n     * one-dimensional array.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method creates an array in blocks layout from an input array in raw layout.\n     * It can be used to provide the array argument of the {@link\n     * #BlockRealMatrix(int, int, double[][], boolean)} constructor.\n     * \u003c/p\u003e\n     * @param rawData Data array in raw layout.\n     * @return a new data array containing the same entries but in blocks layout.\n     * @throws DimensionMismatchException if {@code rawData} is not rectangular.\n     * @see #createBlocksLayout(int, int)\n     * @see #BlockRealMatrix(int, int, double[][], boolean)\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 40)",
        "(line 192,col 9)-(line 192,col 46)",
        "(line 193,col 9)-(line 193,col 70)",
        "(line 194,col 9)-(line 194,col 73)",
        "(line 197,col 9)-(line 202,col 9)",
        "(line 205,col 9)-(line 205,col 73)",
        "(line 206,col 9)-(line 206,col 27)",
        "(line 207,col 9)-(line 228,col 9)",
        "(line 230,col 9)-(line 230,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.createBlocksLayout(int, int)",
      "begin_line": 245,
      "end_line": 265,
      "comment": "\n     * Create a data array in blocks layout.\n     * \u003cp\u003e\n     * This method can be used to create the array argument of the {@link\n     * #BlockRealMatrix(int, int, double[][], boolean)} constructor.\n     * \u003c/p\u003e\n     * @param rows Number of rows in the new matrix.\n     * @param columns Number of columns in the new matrix.\n     * @return a new data array in blocks layout.\n     * @see #toBlocksLayout(double[][])\n     * @see #BlockRealMatrix(int, int, double[][], boolean)\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 70)",
        "(line 247,col 9)-(line 247,col 73)",
        "(line 249,col 9)-(line 249,col 73)",
        "(line 250,col 9)-(line 250,col 27)",
        "(line 251,col 9)-(line 262,col 9)",
        "(line 264,col 9)-(line 264,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.createMatrix(int, int)",
      "begin_line": 268,
      "end_line": 271,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.copy()",
      "begin_line": 274,
      "end_line": 285,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 68)",
        "(line 280,col 9)-(line 282,col 9)",
        "(line 284,col 9)-(line 284,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.add(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 288,
      "end_line": 324,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 290,col 9)-(line 323,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.add(org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 334,
      "end_line": 351,
      "comment": "\n     * Compute the sum of this matrix and {@code m}.\n     *\n     * @param m Matrix to be added.\n     * @return {@code this} + m.\n     * @throws MatrixDimensionMismatchException if {@code m} is not the same\n     * size as this matrix.\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 53)",
        "(line 338,col 9)-(line 338,col 71)",
        "(line 341,col 9)-(line 348,col 9)",
        "(line 350,col 9)-(line 350,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 354,
      "end_line": 390,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 356,col 9)-(line 389,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.subtract(org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 400,
      "end_line": 417,
      "comment": "\n     * Subtract {@code m} from this matrix.\n     *\n     * @param m Matrix to be subtracted.\n     * @return {@code this} - m.\n     * @throws MatrixDimensionMismatchException if {@code m} is not the\n     * same size as this matrix.\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 56)",
        "(line 404,col 9)-(line 404,col 71)",
        "(line 407,col 9)-(line 414,col 9)",
        "(line 416,col 9)-(line 416,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.scalarAdd(double)",
      "begin_line": 420,
      "end_line": 435,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 71)",
        "(line 426,col 9)-(line 432,col 9)",
        "(line 434,col 9)-(line 434,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.scalarMultiply(double)",
      "begin_line": 438,
      "end_line": 452,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 71)",
        "(line 443,col 9)-(line 449,col 9)",
        "(line 451,col 9)-(line 451,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 455,
      "end_line": 506,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 457,col 9)-(line 505,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.multiply(org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 516,
      "end_line": 574,
      "comment": "\n     * Returns the result of postmultiplying this by {@code m}.\n     *\n     * @param m Matrix to postmultiply by.\n     * @return {@code this} * m.\n     * @throws MatrixDimensionMismatchException if the matrices are not\n     * compatible.\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 59)",
        "(line 520,col 9)-(line 520,col 73)",
        "(line 523,col 9)-(line 523,col 27)",
        "(line 524,col 9)-(line 571,col 9)",
        "(line 573,col 9)-(line 573,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getData()",
      "begin_line": 577,
      "end_line": 602,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 84)",
        "(line 580,col 9)-(line 580,col 74)",
        "(line 582,col 9)-(line 599,col 9)",
        "(line 601,col 9)-(line 601,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getNorm()",
      "begin_line": 605,
      "end_line": 628,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 56)",
        "(line 608,col 9)-(line 608,col 29)",
        "(line 609,col 9)-(line 626,col 9)",
        "(line 627,col 9)-(line 627,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getFrobeniusNorm()",
      "begin_line": 631,
      "end_line": 640,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 633,col 9)-(line 633,col 24)",
        "(line 634,col 9)-(line 638,col 9)",
        "(line 639,col 9)-(line 639,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 643,
      "end_line": 734,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 647,col 9)-(line 647,col 88)",
        "(line 650,col 9)-(line 651,col 84)",
        "(line 654,col 9)-(line 654,col 56)",
        "(line 655,col 9)-(line 655,col 52)",
        "(line 656,col 9)-(line 656,col 62)",
        "(line 657,col 9)-(line 657,col 58)",
        "(line 660,col 9)-(line 660,col 35)",
        "(line 661,col 9)-(line 731,col 9)",
        "(line 733,col 9)-(line 733,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.copyBlockPart(double[], int, int, int, int, int, double[], int, int, int)",
      "begin_line": 751,
      "end_line": 764,
      "comment": "\n     * Copy a part of a block into another one\n     * \u003cp\u003eThis method can be called only when the specified part fits in both\n     * blocks, no verification is done here.\u003c/p\u003e\n     * @param srcBlock source block\n     * @param srcWidth source block width ({@link #BLOCK_SIZE} or smaller)\n     * @param srcStartRow start row in the source block\n     * @param srcEndRow end row (exclusive) in the source block\n     * @param srcStartColumn start column in the source block\n     * @param srcEndColumn end column (exclusive) in the source block\n     * @param dstBlock destination block\n     * @param dstWidth destination block width ({@link #BLOCK_SIZE} or smaller)\n     * @param dstStartRow start row in the destination block\n     * @param dstStartColumn start column in the destination block\n     ",
      "child_ranges": [
        "(line 756,col 9)-(line 756,col 57)",
        "(line 757,col 9)-(line 757,col 61)",
        "(line 758,col 9)-(line 758,col 61)",
        "(line 759,col 9)-(line 763,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 767,
      "end_line": 813,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 770,col 9)-(line 770,col 50)",
        "(line 771,col 9)-(line 773,col 9)",
        "(line 774,col 9)-(line 774,col 54)",
        "(line 775,col 9)-(line 775,col 53)",
        "(line 776,col 9)-(line 776,col 78)",
        "(line 777,col 9)-(line 781,col 9)",
        "(line 784,col 9)-(line 784,col 51)",
        "(line 785,col 9)-(line 785,col 67)",
        "(line 786,col 9)-(line 786,col 57)",
        "(line 787,col 9)-(line 787,col 73)",
        "(line 790,col 9)-(line 812,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getRowMatrix(int)",
      "begin_line": 816,
      "end_line": 843,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 818,col 9)-(line 818,col 45)",
        "(line 819,col 9)-(line 819,col 68)",
        "(line 822,col 9)-(line 822,col 44)",
        "(line 823,col 9)-(line 823,col 51)",
        "(line 824,col 9)-(line 824,col 30)",
        "(line 825,col 9)-(line 825,col 25)",
        "(line 826,col 9)-(line 826,col 54)",
        "(line 827,col 9)-(line 840,col 9)",
        "(line 842,col 9)-(line 842,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setRowMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 846,
      "end_line": 853,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 848,col 9)-(line 852,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setRowMatrix(int, org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 867,
      "end_line": 897,
      "comment": "\n     * Sets the entries in row number \u003ccode\u003erow\u003c/code\u003e\n     * as a row matrix.  Row indices start at 0.\n     *\n     * @param row the row to be set\n     * @param matrix row matrix (must have one row and the same number of columns\n     * as the instance)\n     * @throws org.apache.commons.math.exception.OutOfRangeException\n     * if the specified row index is invalid.\n     * @throws MatrixDimensionMismatchException if the matrix dimensions do\n     * not match one instance row.\n     ",
      "child_ranges": [
        "(line 868,col 9)-(line 868,col 45)",
        "(line 869,col 9)-(line 869,col 47)",
        "(line 870,col 9)-(line 875,col 9)",
        "(line 878,col 9)-(line 878,col 44)",
        "(line 879,col 9)-(line 879,col 51)",
        "(line 880,col 9)-(line 880,col 28)",
        "(line 881,col 9)-(line 881,col 23)",
        "(line 882,col 9)-(line 882,col 53)",
        "(line 883,col 9)-(line 896,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getColumnMatrix(int)",
      "begin_line": 900,
      "end_line": 925,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 902,col 9)-(line 902,col 51)",
        "(line 903,col 9)-(line 903,col 65)",
        "(line 906,col 9)-(line 906,col 47)",
        "(line 907,col 9)-(line 907,col 57)",
        "(line 908,col 9)-(line 908,col 46)",
        "(line 909,col 9)-(line 909,col 30)",
        "(line 910,col 9)-(line 910,col 25)",
        "(line 911,col 9)-(line 911,col 54)",
        "(line 912,col 9)-(line 922,col 9)",
        "(line 924,col 9)-(line 924,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 928,
      "end_line": 935,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 930,col 9)-(line 934,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 949,
      "end_line": 977,
      "comment": "\n     * Sets the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n     * as a column matrix.  Column indices start at 0.\n     *\n     * @param column the column to be set\n     * @param matrix column matrix (must have one column and the same number of rows\n     * as the instance)\n     * @throws org.apache.commons.math.exception.OutOfRangeException\n     * if the specified column index is invalid.\n     * @throws MatrixDimensionMismatchException if the matrix dimensions do\n     * not match one instance column.\n     ",
      "child_ranges": [
        "(line 950,col 9)-(line 950,col 51)",
        "(line 951,col 9)-(line 951,col 44)",
        "(line 952,col 9)-(line 957,col 9)",
        "(line 960,col 9)-(line 960,col 47)",
        "(line 961,col 9)-(line 961,col 57)",
        "(line 962,col 9)-(line 962,col 46)",
        "(line 963,col 9)-(line 963,col 28)",
        "(line 964,col 9)-(line 964,col 23)",
        "(line 965,col 9)-(line 965,col 53)",
        "(line 966,col 9)-(line 976,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getRowVector(int)",
      "begin_line": 980,
      "end_line": 997,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 982,col 9)-(line 982,col 45)",
        "(line 983,col 9)-(line 983,col 53)",
        "(line 986,col 9)-(line 986,col 44)",
        "(line 987,col 9)-(line 987,col 51)",
        "(line 988,col 9)-(line 988,col 25)",
        "(line 989,col 9)-(line 994,col 9)",
        "(line 996,col 9)-(line 996,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setRowVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1000,
      "end_line": 1007,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1002,col 9)-(line 1006,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getColumnVector(int)",
      "begin_line": 1010,
      "end_line": 1029,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1012,col 9)-(line 1012,col 51)",
        "(line 1013,col 9)-(line 1013,col 50)",
        "(line 1016,col 9)-(line 1016,col 47)",
        "(line 1017,col 9)-(line 1017,col 57)",
        "(line 1018,col 9)-(line 1018,col 46)",
        "(line 1019,col 9)-(line 1019,col 25)",
        "(line 1020,col 9)-(line 1026,col 9)",
        "(line 1028,col 9)-(line 1028,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setColumnVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1032,
      "end_line": 1039,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1034,col 9)-(line 1038,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getRow(int)",
      "begin_line": 1042,
      "end_line": 1059,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1044,col 9)-(line 1044,col 45)",
        "(line 1045,col 9)-(line 1045,col 49)",
        "(line 1048,col 9)-(line 1048,col 44)",
        "(line 1049,col 9)-(line 1049,col 51)",
        "(line 1050,col 9)-(line 1050,col 25)",
        "(line 1051,col 9)-(line 1056,col 9)",
        "(line 1058,col 9)-(line 1058,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setRow(int, double[])",
      "begin_line": 1062,
      "end_line": 1080,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1064,col 9)-(line 1064,col 45)",
        "(line 1065,col 9)-(line 1065,col 47)",
        "(line 1066,col 9)-(line 1068,col 9)",
        "(line 1071,col 9)-(line 1071,col 44)",
        "(line 1072,col 9)-(line 1072,col 51)",
        "(line 1073,col 9)-(line 1073,col 25)",
        "(line 1074,col 9)-(line 1079,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getColumn(int)",
      "begin_line": 1083,
      "end_line": 1102,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1085,col 9)-(line 1085,col 51)",
        "(line 1086,col 9)-(line 1086,col 46)",
        "(line 1089,col 9)-(line 1089,col 48)",
        "(line 1090,col 9)-(line 1090,col 57)",
        "(line 1091,col 9)-(line 1091,col 47)",
        "(line 1092,col 9)-(line 1092,col 25)",
        "(line 1093,col 9)-(line 1099,col 9)",
        "(line 1101,col 9)-(line 1101,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setColumn(int, double[])",
      "begin_line": 1105,
      "end_line": 1125,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1107,col 9)-(line 1107,col 51)",
        "(line 1108,col 9)-(line 1108,col 44)",
        "(line 1109,col 9)-(line 1111,col 9)",
        "(line 1114,col 9)-(line 1114,col 48)",
        "(line 1115,col 9)-(line 1115,col 57)",
        "(line 1116,col 9)-(line 1116,col 46)",
        "(line 1117,col 9)-(line 1117,col 25)",
        "(line 1118,col 9)-(line 1124,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getEntry(int, int)",
      "begin_line": 1128,
      "end_line": 1136,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1130,col 9)-(line 1130,col 56)",
        "(line 1131,col 9)-(line 1131,col 44)",
        "(line 1132,col 9)-(line 1132,col 47)",
        "(line 1133,col 9)-(line 1134,col 43)",
        "(line 1135,col 9)-(line 1135,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setEntry(int, int, double)",
      "begin_line": 1139,
      "end_line": 1147,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1141,col 9)-(line 1141,col 56)",
        "(line 1142,col 9)-(line 1142,col 44)",
        "(line 1143,col 9)-(line 1143,col 47)",
        "(line 1144,col 9)-(line 1145,col 43)",
        "(line 1146,col 9)-(line 1146,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.addToEntry(int, int, double)",
      "begin_line": 1150,
      "end_line": 1158,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1152,col 9)-(line 1152,col 56)",
        "(line 1153,col 9)-(line 1153,col 47)",
        "(line 1154,col 9)-(line 1154,col 47)",
        "(line 1155,col 9)-(line 1156,col 43)",
        "(line 1157,col 9)-(line 1157,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 1161,
      "end_line": 1169,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1163,col 9)-(line 1163,col 56)",
        "(line 1164,col 9)-(line 1164,col 44)",
        "(line 1165,col 9)-(line 1165,col 47)",
        "(line 1166,col 9)-(line 1167,col 43)",
        "(line 1168,col 9)-(line 1168,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.transpose()",
      "begin_line": 1172,
      "end_line": 1205,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1174,col 9)-(line 1174,col 44)",
        "(line 1175,col 9)-(line 1175,col 47)",
        "(line 1176,col 9)-(line 1176,col 70)",
        "(line 1179,col 9)-(line 1179,col 27)",
        "(line 1180,col 9)-(line 1202,col 9)",
        "(line 1204,col 9)-(line 1204,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getRowDimension()",
      "begin_line": 1208,
      "end_line": 1211,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1210,col 9)-(line 1210,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getColumnDimension()",
      "begin_line": 1214,
      "end_line": 1217,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1216,col 9)-(line 1216,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.operate(double[])",
      "begin_line": 1220,
      "end_line": 1256,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1222,col 9)-(line 1224,col 9)",
        "(line 1225,col 9)-(line 1225,col 46)",
        "(line 1228,col 9)-(line 1253,col 9)",
        "(line 1255,col 9)-(line 1255,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.preMultiply(double[])",
      "begin_line": 1259,
      "end_line": 1300,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1261,col 9)-(line 1263,col 9)",
        "(line 1264,col 9)-(line 1264,col 49)",
        "(line 1267,col 9)-(line 1297,col 9)",
        "(line 1299,col 9)-(line 1299,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 1303,
      "end_line": 1324,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1305,col 9)-(line 1305,col 66)",
        "(line 1306,col 9)-(line 1322,col 9)",
        "(line 1323,col 9)-(line 1323,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 1327,
      "end_line": 1348,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1329,col 9)-(line 1329,col 66)",
        "(line 1330,col 9)-(line 1346,col 9)",
        "(line 1347,col 9)-(line 1347,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 1351,
      "end_line": 1377,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1355,col 9)-(line 1355,col 88)",
        "(line 1356,col 9)-(line 1356,col 79)",
        "(line 1357,col 9)-(line 1375,col 9)",
        "(line 1376,col 9)-(line 1376,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 1380,
      "end_line": 1406,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1384,col 9)-(line 1384,col 88)",
        "(line 1385,col 9)-(line 1385,col 79)",
        "(line 1386,col 9)-(line 1404,col 9)",
        "(line 1405,col 9)-(line 1405,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 1409,
      "end_line": 1431,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1411,col 9)-(line 1411,col 66)",
        "(line 1412,col 9)-(line 1412,col 27)",
        "(line 1413,col 9)-(line 1429,col 9)",
        "(line 1430,col 9)-(line 1430,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 1434,
      "end_line": 1456,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1436,col 9)-(line 1436,col 66)",
        "(line 1437,col 9)-(line 1437,col 27)",
        "(line 1438,col 9)-(line 1454,col 9)",
        "(line 1455,col 9)-(line 1455,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 1459,
      "end_line": 1485,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1463,col 9)-(line 1463,col 88)",
        "(line 1464,col 9)-(line 1464,col 79)",
        "(line 1465,col 9)-(line 1483,col 9)",
        "(line 1484,col 9)-(line 1484,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 1488,
      "end_line": 1514,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1492,col 9)-(line 1492,col 88)",
        "(line 1493,col 9)-(line 1493,col 79)",
        "(line 1494,col 9)-(line 1512,col 9)",
        "(line 1513,col 9)-(line 1513,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.blockHeight(int)",
      "begin_line": 1521,
      "end_line": 1523,
      "comment": "\n     * Get the height of a block.\n     * @param blockRow row index (in block sense) of the block\n     * @return height (number of rows) of the block\n     ",
      "child_ranges": [
        "(line 1522,col 9)-(line 1522,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.blockWidth(int)",
      "begin_line": 1530,
      "end_line": 1532,
      "comment": "\n     * Get the width of a block.\n     * @param blockColumn column index (in block sense) of the block\n     * @return width (number of columns) of the block\n     ",
      "child_ranges": [
        "(line 1531,col 9)-(line 1531,col 99)"
      ]
    }
  ]
}