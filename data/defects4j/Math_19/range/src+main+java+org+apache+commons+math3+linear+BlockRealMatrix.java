{
  "filepath": "/tmp/Math-19b/src/main/java/org/apache/commons/math3/linear/BlockRealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BlockRealMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.AbstractRealMatrix",
        "java.io.Serializable"
      ],
      "begin_line": 69,
      "end_line": 1532,
      "comment": "\n * Cache-friendly implementation of RealMatrix using a flat arrays to store\n * square blocks of the matrix.\n * \u003cp\u003e\n * This implementation is specially designed to be cache-friendly. Square blocks are\n * stored as small arrays and allow efficient traversal of data both in row major direction\n * and columns major direction, one block at a time. This greatly increases performances\n * for algorithms that use crossed directions loops like multiplication or transposition.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The size of square blocks is a static parameter. It may be tuned according to the cache\n * size of the target computer processor. As a rule of thumbs, it should be the largest\n * value that allows three blocks to be simultaneously cached (this is necessary for example\n * for matrix multiplication). The default value is to use 52x52 blocks which is well suited\n * for processors with 64k L1 cache (one block holds 2704 values or 21632 bytes). This value\n * could be lowered to 36x36 for processors with 32k L1 cache.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The regular blocks represent {@link #BLOCK_SIZE} x {@link #BLOCK_SIZE} squares. Blocks\n * at right hand side and bottom side which may be smaller to fit matrix dimensions. The square\n * blocks are flattened in row major order in single dimension arrays which are therefore\n * {@link #BLOCK_SIZE}\u003csup\u003e2\u003c/sup\u003e elements long for regular blocks. The blocks are themselves\n * organized in row major order.\n * \u003c/p\u003e\n * \u003cp\u003e\n * As an example, for a block size of 52x52, a 100x60 matrix would be stored in 4 blocks.\n * Block 0 would be a double[2704] array holding the upper left 52x52 square, block 1 would be\n * a double[416] array holding the upper right 52x8 rectangle, block 2 would be a double[2496]\n * array holding the lower left 48x52 rectangle and block 3 would be a double[384] array\n * holding the lower right 48x8 rectangle.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The layout complexity overhead versus simple mapping of matrices to java\n * arrays is negligible for small matrices (about 1%). The gain from cache efficiency leads\n * to up to 3-fold improvements for matrices of moderate to large size.\n * \u003c/p\u003e\n * @version $Id$\n * @since 2.0\n "
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
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.BlockRealMatrix(int, int)",
      "begin_line": 93,
      "end_line": 104,
      "comment": "\n     * Create a new matrix with the supplied row and column dimensions.\n     *\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @throws org.apache.commons.math3.exception.NotStrictlyPositiveException\n     * if row or column dimension is not positive.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 29)",
        "(line 95,col 9)-(line 95,col 25)",
        "(line 96,col 9)-(line 96,col 31)",
        "(line 99,col 9)-(line 99,col 57)",
        "(line 100,col 9)-(line 100,col 63)",
        "(line 103,col 9)-(line 103,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.BlockRealMatrix(double[][])",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * Create a new dense matrix copying entries from raw layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in raw layout.\u003c/p\u003e\n     * \u003cp\u003eCalling this constructor is equivalent to call:\n     * \u003cpre\u003ematrix \u003d new BlockRealMatrix(rawData.length, rawData[0].length,\n     *                                   toBlocksLayout(rawData), false);\u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param rawData data for new matrix, in raw layout\n     * @throws DimensionMismatchException if the shape of {@code blockData} is\n     * inconsistent with block layout.\n     * @see #BlockRealMatrix(int, int, double[][], boolean)\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 80)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.BlockRealMatrix(int, int, double[][], boolean)",
      "begin_line": 137,
      "end_line": 168,
      "comment": "\n     * Create a new dense matrix copying entries from block layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in blocks layout.\u003c/p\u003e\n     *\n     * @param rows Number of rows in the new matrix.\n     * @param columns Number of columns in the new matrix.\n     * @param blockData data for new matrix\n     * @param copyArray Whether the input array will be copied or referenced.\n     * @throws DimensionMismatchException if the shape of {@code blockData} is\n     * inconsistent with block layout.\n     * @see #createBlocksLayout(int, int)\n     * @see #toBlocksLayout(double[][])\n     * @see #BlockRealMatrix(double[][])\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 29)",
        "(line 140,col 9)-(line 140,col 25)",
        "(line 141,col 9)-(line 141,col 31)",
        "(line 144,col 9)-(line 144,col 57)",
        "(line 145,col 9)-(line 145,col 63)",
        "(line 147,col 9)-(line 153,col 9)",
        "(line 155,col 9)-(line 155,col 22)",
        "(line 156,col 9)-(line 167,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.toBlocksLayout(double[][])",
      "begin_line": 191,
      "end_line": 232,
      "comment": "\n     * Convert a data array from raw layout to blocks layout.\n     * \u003cp\u003e\n     * Raw layout is the straightforward layout where element at row i and\n     * column j is in array element \u003ccode\u003erawData[i][j]\u003c/code\u003e. Blocks layout\n     * is the layout used in {@link BlockRealMatrix} instances, where the matrix\n     * is split in square blocks (except at right and bottom side where blocks may\n     * be rectangular to fit matrix size) and each block is stored in a flattened\n     * one-dimensional array.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method creates an array in blocks layout from an input array in raw layout.\n     * It can be used to provide the array argument of the {@link\n     * #BlockRealMatrix(int, int, double[][], boolean)} constructor.\n     * \u003c/p\u003e\n     * @param rawData Data array in raw layout.\n     * @return a new data array containing the same entries but in blocks layout.\n     * @throws DimensionMismatchException if {@code rawData} is not rectangular.\n     * @see #createBlocksLayout(int, int)\n     * @see #BlockRealMatrix(int, int, double[][], boolean)\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 40)",
        "(line 193,col 9)-(line 193,col 46)",
        "(line 194,col 9)-(line 194,col 70)",
        "(line 195,col 9)-(line 195,col 73)",
        "(line 198,col 9)-(line 203,col 9)",
        "(line 206,col 9)-(line 206,col 73)",
        "(line 207,col 9)-(line 207,col 27)",
        "(line 208,col 9)-(line 229,col 9)",
        "(line 231,col 9)-(line 231,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.createBlocksLayout(int, int)",
      "begin_line": 246,
      "end_line": 266,
      "comment": "\n     * Create a data array in blocks layout.\n     * \u003cp\u003e\n     * This method can be used to create the array argument of the {@link\n     * #BlockRealMatrix(int, int, double[][], boolean)} constructor.\n     * \u003c/p\u003e\n     * @param rows Number of rows in the new matrix.\n     * @param columns Number of columns in the new matrix.\n     * @return a new data array in blocks layout.\n     * @see #toBlocksLayout(double[][])\n     * @see #BlockRealMatrix(int, int, double[][], boolean)\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 70)",
        "(line 248,col 9)-(line 248,col 73)",
        "(line 250,col 9)-(line 250,col 73)",
        "(line 251,col 9)-(line 251,col 27)",
        "(line 252,col 9)-(line 263,col 9)",
        "(line 265,col 9)-(line 265,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.createMatrix(int, int)",
      "begin_line": 269,
      "end_line": 271,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.copy()",
      "begin_line": 274,
      "end_line": 284,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 68)",
        "(line 279,col 9)-(line 281,col 9)",
        "(line 283,col 9)-(line 283,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.add(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 287,
      "end_line": 323,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 289,col 9)-(line 322,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.add(org.apache.commons.math3.linear.BlockRealMatrix)",
      "begin_line": 333,
      "end_line": 350,
      "comment": "\n     * Compute the sum of this matrix and {@code m}.\n     *\n     * @param m Matrix to be added.\n     * @return {@code this} + m.\n     * @throws MatrixDimensionMismatchException if {@code m} is not the same\n     * size as this matrix.\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 53)",
        "(line 337,col 9)-(line 337,col 71)",
        "(line 340,col 9)-(line 347,col 9)",
        "(line 349,col 9)-(line 349,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.subtract(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 353,
      "end_line": 389,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 355,col 9)-(line 388,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.subtract(org.apache.commons.math3.linear.BlockRealMatrix)",
      "begin_line": 399,
      "end_line": 416,
      "comment": "\n     * Subtract {@code m} from this matrix.\n     *\n     * @param m Matrix to be subtracted.\n     * @return {@code this} - m.\n     * @throws MatrixDimensionMismatchException if {@code m} is not the\n     * same size as this matrix.\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 56)",
        "(line 403,col 9)-(line 403,col 71)",
        "(line 406,col 9)-(line 413,col 9)",
        "(line 415,col 9)-(line 415,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.scalarAdd(double)",
      "begin_line": 419,
      "end_line": 434,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 71)",
        "(line 425,col 9)-(line 431,col 9)",
        "(line 433,col 9)-(line 433,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.scalarMultiply(double)",
      "begin_line": 437,
      "end_line": 451,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 71)",
        "(line 442,col 9)-(line 448,col 9)",
        "(line 450,col 9)-(line 450,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.multiply(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 454,
      "end_line": 505,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 456,col 9)-(line 504,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.multiply(org.apache.commons.math3.linear.BlockRealMatrix)",
      "begin_line": 515,
      "end_line": 573,
      "comment": "\n     * Returns the result of postmultiplying this by {@code m}.\n     *\n     * @param m Matrix to postmultiply by.\n     * @return {@code this} * m.\n     * @throws MatrixDimensionMismatchException if the matrices are not\n     * compatible.\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 59)",
        "(line 519,col 9)-(line 519,col 73)",
        "(line 522,col 9)-(line 522,col 27)",
        "(line 523,col 9)-(line 570,col 9)",
        "(line 572,col 9)-(line 572,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.getData()",
      "begin_line": 576,
      "end_line": 601,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 84)",
        "(line 579,col 9)-(line 579,col 74)",
        "(line 581,col 9)-(line 598,col 9)",
        "(line 600,col 9)-(line 600,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.getNorm()",
      "begin_line": 604,
      "end_line": 627,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 606,col 9)-(line 606,col 56)",
        "(line 607,col 9)-(line 607,col 29)",
        "(line 608,col 9)-(line 625,col 9)",
        "(line 626,col 9)-(line 626,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.getFrobeniusNorm()",
      "begin_line": 630,
      "end_line": 639,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 632,col 9)-(line 632,col 24)",
        "(line 633,col 9)-(line 637,col 9)",
        "(line 638,col 9)-(line 638,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 642,
      "end_line": 733,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 646,col 9)-(line 646,col 88)",
        "(line 649,col 9)-(line 650,col 84)",
        "(line 653,col 9)-(line 653,col 56)",
        "(line 654,col 9)-(line 654,col 52)",
        "(line 655,col 9)-(line 655,col 62)",
        "(line 656,col 9)-(line 656,col 58)",
        "(line 659,col 9)-(line 659,col 35)",
        "(line 660,col 9)-(line 730,col 9)",
        "(line 732,col 9)-(line 732,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.copyBlockPart(double[], int, int, int, int, int, double[], int, int, int)",
      "begin_line": 750,
      "end_line": 763,
      "comment": "\n     * Copy a part of a block into another one\n     * \u003cp\u003eThis method can be called only when the specified part fits in both\n     * blocks, no verification is done here.\u003c/p\u003e\n     * @param srcBlock source block\n     * @param srcWidth source block width ({@link #BLOCK_SIZE} or smaller)\n     * @param srcStartRow start row in the source block\n     * @param srcEndRow end row (exclusive) in the source block\n     * @param srcStartColumn start column in the source block\n     * @param srcEndColumn end column (exclusive) in the source block\n     * @param dstBlock destination block\n     * @param dstWidth destination block width ({@link #BLOCK_SIZE} or smaller)\n     * @param dstStartRow start row in the destination block\n     * @param dstStartColumn start column in the destination block\n     ",
      "child_ranges": [
        "(line 755,col 9)-(line 755,col 57)",
        "(line 756,col 9)-(line 756,col 61)",
        "(line 757,col 9)-(line 757,col 61)",
        "(line 758,col 9)-(line 762,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 766,
      "end_line": 814,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 770,col 9)-(line 770,col 42)",
        "(line 771,col 9)-(line 771,col 50)",
        "(line 772,col 9)-(line 774,col 9)",
        "(line 775,col 9)-(line 775,col 54)",
        "(line 776,col 9)-(line 776,col 53)",
        "(line 777,col 9)-(line 777,col 78)",
        "(line 778,col 9)-(line 782,col 9)",
        "(line 785,col 9)-(line 785,col 51)",
        "(line 786,col 9)-(line 786,col 67)",
        "(line 787,col 9)-(line 787,col 57)",
        "(line 788,col 9)-(line 788,col 73)",
        "(line 791,col 9)-(line 813,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.getRowMatrix(int)",
      "begin_line": 817,
      "end_line": 844,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 819,col 9)-(line 819,col 45)",
        "(line 820,col 9)-(line 820,col 68)",
        "(line 823,col 9)-(line 823,col 44)",
        "(line 824,col 9)-(line 824,col 51)",
        "(line 825,col 9)-(line 825,col 30)",
        "(line 826,col 9)-(line 826,col 25)",
        "(line 827,col 9)-(line 827,col 54)",
        "(line 828,col 9)-(line 841,col 9)",
        "(line 843,col 9)-(line 843,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.setRowMatrix(int, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 847,
      "end_line": 854,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 849,col 9)-(line 853,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.setRowMatrix(int, org.apache.commons.math3.linear.BlockRealMatrix)",
      "begin_line": 868,
      "end_line": 898,
      "comment": "\n     * Sets the entries in row number \u003ccode\u003erow\u003c/code\u003e\n     * as a row matrix.  Row indices start at 0.\n     *\n     * @param row the row to be set\n     * @param matrix row matrix (must have one row and the same number of columns\n     * as the instance)\n     * @throws org.apache.commons.math3.exception.OutOfRangeException\n     * if the specified row index is invalid.\n     * @throws MatrixDimensionMismatchException if the matrix dimensions do\n     * not match one instance row.\n     ",
      "child_ranges": [
        "(line 869,col 9)-(line 869,col 45)",
        "(line 870,col 9)-(line 870,col 47)",
        "(line 871,col 9)-(line 876,col 9)",
        "(line 879,col 9)-(line 879,col 44)",
        "(line 880,col 9)-(line 880,col 51)",
        "(line 881,col 9)-(line 881,col 28)",
        "(line 882,col 9)-(line 882,col 23)",
        "(line 883,col 9)-(line 883,col 53)",
        "(line 884,col 9)-(line 897,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.getColumnMatrix(int)",
      "begin_line": 901,
      "end_line": 926,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 903,col 9)-(line 903,col 51)",
        "(line 904,col 9)-(line 904,col 65)",
        "(line 907,col 9)-(line 907,col 47)",
        "(line 908,col 9)-(line 908,col 57)",
        "(line 909,col 9)-(line 909,col 46)",
        "(line 910,col 9)-(line 910,col 30)",
        "(line 911,col 9)-(line 911,col 25)",
        "(line 912,col 9)-(line 912,col 54)",
        "(line 913,col 9)-(line 923,col 9)",
        "(line 925,col 9)-(line 925,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.setColumnMatrix(int, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 929,
      "end_line": 936,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 931,col 9)-(line 935,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.setColumnMatrix(int, org.apache.commons.math3.linear.BlockRealMatrix)",
      "begin_line": 950,
      "end_line": 978,
      "comment": "\n     * Sets the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n     * as a column matrix.  Column indices start at 0.\n     *\n     * @param column the column to be set\n     * @param matrix column matrix (must have one column and the same number of rows\n     * as the instance)\n     * @throws org.apache.commons.math3.exception.OutOfRangeException\n     * if the specified column index is invalid.\n     * @throws MatrixDimensionMismatchException if the matrix dimensions do\n     * not match one instance column.\n     ",
      "child_ranges": [
        "(line 951,col 9)-(line 951,col 51)",
        "(line 952,col 9)-(line 952,col 44)",
        "(line 953,col 9)-(line 958,col 9)",
        "(line 961,col 9)-(line 961,col 47)",
        "(line 962,col 9)-(line 962,col 57)",
        "(line 963,col 9)-(line 963,col 46)",
        "(line 964,col 9)-(line 964,col 28)",
        "(line 965,col 9)-(line 965,col 23)",
        "(line 966,col 9)-(line 966,col 53)",
        "(line 967,col 9)-(line 977,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.getRowVector(int)",
      "begin_line": 981,
      "end_line": 998,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 983,col 9)-(line 983,col 45)",
        "(line 984,col 9)-(line 984,col 53)",
        "(line 987,col 9)-(line 987,col 44)",
        "(line 988,col 9)-(line 988,col 51)",
        "(line 989,col 9)-(line 989,col 25)",
        "(line 990,col 9)-(line 995,col 9)",
        "(line 997,col 9)-(line 997,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.setRowVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1001,
      "end_line": 1008,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1003,col 9)-(line 1007,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.getColumnVector(int)",
      "begin_line": 1011,
      "end_line": 1030,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1013,col 9)-(line 1013,col 51)",
        "(line 1014,col 9)-(line 1014,col 50)",
        "(line 1017,col 9)-(line 1017,col 47)",
        "(line 1018,col 9)-(line 1018,col 57)",
        "(line 1019,col 9)-(line 1019,col 46)",
        "(line 1020,col 9)-(line 1020,col 25)",
        "(line 1021,col 9)-(line 1027,col 9)",
        "(line 1029,col 9)-(line 1029,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.setColumnVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1033,
      "end_line": 1040,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1035,col 9)-(line 1039,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.getRow(int)",
      "begin_line": 1043,
      "end_line": 1060,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1045,col 9)-(line 1045,col 45)",
        "(line 1046,col 9)-(line 1046,col 49)",
        "(line 1049,col 9)-(line 1049,col 44)",
        "(line 1050,col 9)-(line 1050,col 51)",
        "(line 1051,col 9)-(line 1051,col 25)",
        "(line 1052,col 9)-(line 1057,col 9)",
        "(line 1059,col 9)-(line 1059,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.setRow(int, double[])",
      "begin_line": 1063,
      "end_line": 1081,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1065,col 9)-(line 1065,col 45)",
        "(line 1066,col 9)-(line 1066,col 47)",
        "(line 1067,col 9)-(line 1069,col 9)",
        "(line 1072,col 9)-(line 1072,col 44)",
        "(line 1073,col 9)-(line 1073,col 51)",
        "(line 1074,col 9)-(line 1074,col 25)",
        "(line 1075,col 9)-(line 1080,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.getColumn(int)",
      "begin_line": 1084,
      "end_line": 1103,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1086,col 9)-(line 1086,col 51)",
        "(line 1087,col 9)-(line 1087,col 46)",
        "(line 1090,col 9)-(line 1090,col 48)",
        "(line 1091,col 9)-(line 1091,col 57)",
        "(line 1092,col 9)-(line 1092,col 47)",
        "(line 1093,col 9)-(line 1093,col 25)",
        "(line 1094,col 9)-(line 1100,col 9)",
        "(line 1102,col 9)-(line 1102,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.setColumn(int, double[])",
      "begin_line": 1106,
      "end_line": 1126,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1108,col 9)-(line 1108,col 51)",
        "(line 1109,col 9)-(line 1109,col 44)",
        "(line 1110,col 9)-(line 1112,col 9)",
        "(line 1115,col 9)-(line 1115,col 48)",
        "(line 1116,col 9)-(line 1116,col 57)",
        "(line 1117,col 9)-(line 1117,col 46)",
        "(line 1118,col 9)-(line 1118,col 25)",
        "(line 1119,col 9)-(line 1125,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.getEntry(int, int)",
      "begin_line": 1129,
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
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.setEntry(int, int, double)",
      "begin_line": 1139,
      "end_line": 1146,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1140,col 9)-(line 1140,col 56)",
        "(line 1141,col 9)-(line 1141,col 44)",
        "(line 1142,col 9)-(line 1142,col 47)",
        "(line 1143,col 9)-(line 1144,col 43)",
        "(line 1145,col 9)-(line 1145,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.addToEntry(int, int, double)",
      "begin_line": 1149,
      "end_line": 1157,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1151,col 9)-(line 1151,col 56)",
        "(line 1152,col 9)-(line 1152,col 47)",
        "(line 1153,col 9)-(line 1153,col 47)",
        "(line 1154,col 9)-(line 1155,col 43)",
        "(line 1156,col 9)-(line 1156,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 1160,
      "end_line": 1168,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1162,col 9)-(line 1162,col 56)",
        "(line 1163,col 9)-(line 1163,col 44)",
        "(line 1164,col 9)-(line 1164,col 47)",
        "(line 1165,col 9)-(line 1166,col 43)",
        "(line 1167,col 9)-(line 1167,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.transpose()",
      "begin_line": 1171,
      "end_line": 1204,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1173,col 9)-(line 1173,col 44)",
        "(line 1174,col 9)-(line 1174,col 47)",
        "(line 1175,col 9)-(line 1175,col 70)",
        "(line 1178,col 9)-(line 1178,col 27)",
        "(line 1179,col 9)-(line 1201,col 9)",
        "(line 1203,col 9)-(line 1203,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.getRowDimension()",
      "begin_line": 1207,
      "end_line": 1210,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1209,col 9)-(line 1209,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.getColumnDimension()",
      "begin_line": 1213,
      "end_line": 1216,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1215,col 9)-(line 1215,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.operate(double[])",
      "begin_line": 1219,
      "end_line": 1255,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1221,col 9)-(line 1223,col 9)",
        "(line 1224,col 9)-(line 1224,col 46)",
        "(line 1227,col 9)-(line 1252,col 9)",
        "(line 1254,col 9)-(line 1254,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.preMultiply(double[])",
      "begin_line": 1258,
      "end_line": 1299,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1260,col 9)-(line 1262,col 9)",
        "(line 1263,col 9)-(line 1263,col 49)",
        "(line 1266,col 9)-(line 1296,col 9)",
        "(line 1298,col 9)-(line 1298,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor)",
      "begin_line": 1302,
      "end_line": 1323,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1304,col 9)-(line 1304,col 66)",
        "(line 1305,col 9)-(line 1321,col 9)",
        "(line 1322,col 9)-(line 1322,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor)",
      "begin_line": 1326,
      "end_line": 1347,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1328,col 9)-(line 1328,col 66)",
        "(line 1329,col 9)-(line 1345,col 9)",
        "(line 1346,col 9)-(line 1346,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 1350,
      "end_line": 1376,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1354,col 9)-(line 1354,col 88)",
        "(line 1355,col 9)-(line 1355,col 79)",
        "(line 1356,col 9)-(line 1374,col 9)",
        "(line 1375,col 9)-(line 1375,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 1379,
      "end_line": 1405,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1383,col 9)-(line 1383,col 88)",
        "(line 1384,col 9)-(line 1384,col 79)",
        "(line 1385,col 9)-(line 1403,col 9)",
        "(line 1404,col 9)-(line 1404,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor)",
      "begin_line": 1408,
      "end_line": 1430,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1410,col 9)-(line 1410,col 66)",
        "(line 1411,col 9)-(line 1411,col 27)",
        "(line 1412,col 9)-(line 1428,col 9)",
        "(line 1429,col 9)-(line 1429,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor)",
      "begin_line": 1433,
      "end_line": 1455,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1435,col 9)-(line 1435,col 66)",
        "(line 1436,col 9)-(line 1436,col 27)",
        "(line 1437,col 9)-(line 1453,col 9)",
        "(line 1454,col 9)-(line 1454,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 1458,
      "end_line": 1484,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1462,col 9)-(line 1462,col 88)",
        "(line 1463,col 9)-(line 1463,col 79)",
        "(line 1464,col 9)-(line 1482,col 9)",
        "(line 1483,col 9)-(line 1483,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 1487,
      "end_line": 1513,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1491,col 9)-(line 1491,col 88)",
        "(line 1492,col 9)-(line 1492,col 79)",
        "(line 1493,col 9)-(line 1511,col 9)",
        "(line 1512,col 9)-(line 1512,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.blockHeight(int)",
      "begin_line": 1520,
      "end_line": 1522,
      "comment": "\n     * Get the height of a block.\n     * @param blockRow row index (in block sense) of the block\n     * @return height (number of rows) of the block\n     ",
      "child_ranges": [
        "(line 1521,col 9)-(line 1521,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.blockWidth(int)",
      "begin_line": 1529,
      "end_line": 1531,
      "comment": "\n     * Get the width of a block.\n     * @param blockColumn column index (in block sense) of the block\n     * @return width (number of columns) of the block\n     ",
      "child_ranges": [
        "(line 1530,col 9)-(line 1530,col 99)"
      ]
    }
  ]
}