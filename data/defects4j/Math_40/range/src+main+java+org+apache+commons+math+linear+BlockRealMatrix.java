{
  "filepath": "/tmp/Math-40b/src/main/java/org/apache/commons/math/linear/BlockRealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BlockRealMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.AbstractRealMatrix",
        "java.io.Serializable"
      ],
      "begin_line": 69,
      "end_line": 1536,
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
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.BlockRealMatrix(int, int)",
      "begin_line": 93,
      "end_line": 104,
      "comment": "\n     * Create a new matrix with the supplied row and column dimensions.\n     *\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @throws org.apache.commons.math.exception.NotStrictlyPositiveException\n     * if row or column dimension is not positive.\n     ",
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
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.BlockRealMatrix(double[][])",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * Create a new dense matrix copying entries from raw layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in raw layout.\u003c/p\u003e\n     * \u003cp\u003eCalling this constructor is equivalent to call:\n     * \u003cpre\u003ematrix \u003d new BlockRealMatrix(rawData.length, rawData[0].length,\n     *                                   toBlocksLayout(rawData), false);\u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param rawData data for new matrix, in raw layout\n     * @throws DimensionMismatchException if the shape of {@code blockData} is\n     * inconsistent with block layout.\n     * @see #BlockRealMatrix(int, int, double[][], boolean)\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 80)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.BlockRealMatrix(int, int, double[][], boolean)",
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
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.toBlocksLayout(double[][])",
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
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.createBlocksLayout(int, int)",
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
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.createMatrix(int, int)",
      "begin_line": 269,
      "end_line": 272,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.copy()",
      "begin_line": 275,
      "end_line": 286,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 68)",
        "(line 281,col 9)-(line 283,col 9)",
        "(line 285,col 9)-(line 285,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.add(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 289,
      "end_line": 325,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 291,col 9)-(line 324,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.add(org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 335,
      "end_line": 352,
      "comment": "\n     * Compute the sum of this matrix and {@code m}.\n     *\n     * @param m Matrix to be added.\n     * @return {@code this} + m.\n     * @throws MatrixDimensionMismatchException if {@code m} is not the same\n     * size as this matrix.\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 53)",
        "(line 339,col 9)-(line 339,col 71)",
        "(line 342,col 9)-(line 349,col 9)",
        "(line 351,col 9)-(line 351,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.subtract(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 355,
      "end_line": 391,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 357,col 9)-(line 390,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.subtract(org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 401,
      "end_line": 418,
      "comment": "\n     * Subtract {@code m} from this matrix.\n     *\n     * @param m Matrix to be subtracted.\n     * @return {@code this} - m.\n     * @throws MatrixDimensionMismatchException if {@code m} is not the\n     * same size as this matrix.\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 56)",
        "(line 405,col 9)-(line 405,col 71)",
        "(line 408,col 9)-(line 415,col 9)",
        "(line 417,col 9)-(line 417,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.scalarAdd(double)",
      "begin_line": 421,
      "end_line": 436,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 71)",
        "(line 427,col 9)-(line 433,col 9)",
        "(line 435,col 9)-(line 435,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.scalarMultiply(double)",
      "begin_line": 439,
      "end_line": 453,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 71)",
        "(line 444,col 9)-(line 450,col 9)",
        "(line 452,col 9)-(line 452,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.multiply(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 456,
      "end_line": 507,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 458,col 9)-(line 506,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.multiply(org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 517,
      "end_line": 575,
      "comment": "\n     * Returns the result of postmultiplying this by {@code m}.\n     *\n     * @param m Matrix to postmultiply by.\n     * @return {@code this} * m.\n     * @throws MatrixDimensionMismatchException if the matrices are not\n     * compatible.\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 519,col 59)",
        "(line 521,col 9)-(line 521,col 73)",
        "(line 524,col 9)-(line 524,col 27)",
        "(line 525,col 9)-(line 572,col 9)",
        "(line 574,col 9)-(line 574,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getData()",
      "begin_line": 578,
      "end_line": 603,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 84)",
        "(line 581,col 9)-(line 581,col 74)",
        "(line 583,col 9)-(line 600,col 9)",
        "(line 602,col 9)-(line 602,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getNorm()",
      "begin_line": 606,
      "end_line": 629,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 56)",
        "(line 609,col 9)-(line 609,col 29)",
        "(line 610,col 9)-(line 627,col 9)",
        "(line 628,col 9)-(line 628,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getFrobeniusNorm()",
      "begin_line": 632,
      "end_line": 641,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 634,col 9)-(line 634,col 24)",
        "(line 635,col 9)-(line 639,col 9)",
        "(line 640,col 9)-(line 640,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 644,
      "end_line": 735,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 648,col 9)-(line 648,col 88)",
        "(line 651,col 9)-(line 652,col 84)",
        "(line 655,col 9)-(line 655,col 56)",
        "(line 656,col 9)-(line 656,col 52)",
        "(line 657,col 9)-(line 657,col 62)",
        "(line 658,col 9)-(line 658,col 58)",
        "(line 661,col 9)-(line 661,col 35)",
        "(line 662,col 9)-(line 732,col 9)",
        "(line 734,col 9)-(line 734,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.copyBlockPart(double[], int, int, int, int, int, double[], int, int, int)",
      "begin_line": 752,
      "end_line": 765,
      "comment": "\n     * Copy a part of a block into another one\n     * \u003cp\u003eThis method can be called only when the specified part fits in both\n     * blocks, no verification is done here.\u003c/p\u003e\n     * @param srcBlock source block\n     * @param srcWidth source block width ({@link #BLOCK_SIZE} or smaller)\n     * @param srcStartRow start row in the source block\n     * @param srcEndRow end row (exclusive) in the source block\n     * @param srcStartColumn start column in the source block\n     * @param srcEndColumn end column (exclusive) in the source block\n     * @param dstBlock destination block\n     * @param dstWidth destination block width ({@link #BLOCK_SIZE} or smaller)\n     * @param dstStartRow start row in the destination block\n     * @param dstStartColumn start column in the destination block\n     ",
      "child_ranges": [
        "(line 757,col 9)-(line 757,col 57)",
        "(line 758,col 9)-(line 758,col 61)",
        "(line 759,col 9)-(line 759,col 61)",
        "(line 760,col 9)-(line 764,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 768,
      "end_line": 816,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 772,col 9)-(line 772,col 42)",
        "(line 773,col 9)-(line 773,col 50)",
        "(line 774,col 9)-(line 776,col 9)",
        "(line 777,col 9)-(line 777,col 54)",
        "(line 778,col 9)-(line 778,col 53)",
        "(line 779,col 9)-(line 779,col 78)",
        "(line 780,col 9)-(line 784,col 9)",
        "(line 787,col 9)-(line 787,col 51)",
        "(line 788,col 9)-(line 788,col 67)",
        "(line 789,col 9)-(line 789,col 57)",
        "(line 790,col 9)-(line 790,col 73)",
        "(line 793,col 9)-(line 815,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getRowMatrix(int)",
      "begin_line": 819,
      "end_line": 846,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 821,col 9)-(line 821,col 45)",
        "(line 822,col 9)-(line 822,col 68)",
        "(line 825,col 9)-(line 825,col 44)",
        "(line 826,col 9)-(line 826,col 51)",
        "(line 827,col 9)-(line 827,col 30)",
        "(line 828,col 9)-(line 828,col 25)",
        "(line 829,col 9)-(line 829,col 54)",
        "(line 830,col 9)-(line 843,col 9)",
        "(line 845,col 9)-(line 845,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setRowMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 849,
      "end_line": 856,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 851,col 9)-(line 855,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setRowMatrix(int, org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 870,
      "end_line": 900,
      "comment": "\n     * Sets the entries in row number \u003ccode\u003erow\u003c/code\u003e\n     * as a row matrix.  Row indices start at 0.\n     *\n     * @param row the row to be set\n     * @param matrix row matrix (must have one row and the same number of columns\n     * as the instance)\n     * @throws org.apache.commons.math.exception.OutOfRangeException\n     * if the specified row index is invalid.\n     * @throws MatrixDimensionMismatchException if the matrix dimensions do\n     * not match one instance row.\n     ",
      "child_ranges": [
        "(line 871,col 9)-(line 871,col 45)",
        "(line 872,col 9)-(line 872,col 47)",
        "(line 873,col 9)-(line 878,col 9)",
        "(line 881,col 9)-(line 881,col 44)",
        "(line 882,col 9)-(line 882,col 51)",
        "(line 883,col 9)-(line 883,col 28)",
        "(line 884,col 9)-(line 884,col 23)",
        "(line 885,col 9)-(line 885,col 53)",
        "(line 886,col 9)-(line 899,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getColumnMatrix(int)",
      "begin_line": 903,
      "end_line": 928,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 905,col 9)-(line 905,col 51)",
        "(line 906,col 9)-(line 906,col 65)",
        "(line 909,col 9)-(line 909,col 47)",
        "(line 910,col 9)-(line 910,col 57)",
        "(line 911,col 9)-(line 911,col 46)",
        "(line 912,col 9)-(line 912,col 30)",
        "(line 913,col 9)-(line 913,col 25)",
        "(line 914,col 9)-(line 914,col 54)",
        "(line 915,col 9)-(line 925,col 9)",
        "(line 927,col 9)-(line 927,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 931,
      "end_line": 938,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 933,col 9)-(line 937,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setColumnMatrix(int, org.apache.commons.math.linear.BlockRealMatrix)",
      "begin_line": 952,
      "end_line": 980,
      "comment": "\n     * Sets the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n     * as a column matrix.  Column indices start at 0.\n     *\n     * @param column the column to be set\n     * @param matrix column matrix (must have one column and the same number of rows\n     * as the instance)\n     * @throws org.apache.commons.math.exception.OutOfRangeException\n     * if the specified column index is invalid.\n     * @throws MatrixDimensionMismatchException if the matrix dimensions do\n     * not match one instance column.\n     ",
      "child_ranges": [
        "(line 953,col 9)-(line 953,col 51)",
        "(line 954,col 9)-(line 954,col 44)",
        "(line 955,col 9)-(line 960,col 9)",
        "(line 963,col 9)-(line 963,col 47)",
        "(line 964,col 9)-(line 964,col 57)",
        "(line 965,col 9)-(line 965,col 46)",
        "(line 966,col 9)-(line 966,col 28)",
        "(line 967,col 9)-(line 967,col 23)",
        "(line 968,col 9)-(line 968,col 53)",
        "(line 969,col 9)-(line 979,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getRowVector(int)",
      "begin_line": 983,
      "end_line": 1000,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 985,col 9)-(line 985,col 45)",
        "(line 986,col 9)-(line 986,col 53)",
        "(line 989,col 9)-(line 989,col 44)",
        "(line 990,col 9)-(line 990,col 51)",
        "(line 991,col 9)-(line 991,col 25)",
        "(line 992,col 9)-(line 997,col 9)",
        "(line 999,col 9)-(line 999,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setRowVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1003,
      "end_line": 1010,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1005,col 9)-(line 1009,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getColumnVector(int)",
      "begin_line": 1013,
      "end_line": 1032,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1015,col 9)-(line 1015,col 51)",
        "(line 1016,col 9)-(line 1016,col 50)",
        "(line 1019,col 9)-(line 1019,col 47)",
        "(line 1020,col 9)-(line 1020,col 57)",
        "(line 1021,col 9)-(line 1021,col 46)",
        "(line 1022,col 9)-(line 1022,col 25)",
        "(line 1023,col 9)-(line 1029,col 9)",
        "(line 1031,col 9)-(line 1031,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setColumnVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 1035,
      "end_line": 1042,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1037,col 9)-(line 1041,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getRow(int)",
      "begin_line": 1045,
      "end_line": 1062,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1047,col 9)-(line 1047,col 45)",
        "(line 1048,col 9)-(line 1048,col 49)",
        "(line 1051,col 9)-(line 1051,col 44)",
        "(line 1052,col 9)-(line 1052,col 51)",
        "(line 1053,col 9)-(line 1053,col 25)",
        "(line 1054,col 9)-(line 1059,col 9)",
        "(line 1061,col 9)-(line 1061,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setRow(int, double[])",
      "begin_line": 1065,
      "end_line": 1083,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1067,col 9)-(line 1067,col 45)",
        "(line 1068,col 9)-(line 1068,col 47)",
        "(line 1069,col 9)-(line 1071,col 9)",
        "(line 1074,col 9)-(line 1074,col 44)",
        "(line 1075,col 9)-(line 1075,col 51)",
        "(line 1076,col 9)-(line 1076,col 25)",
        "(line 1077,col 9)-(line 1082,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getColumn(int)",
      "begin_line": 1086,
      "end_line": 1105,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1088,col 9)-(line 1088,col 51)",
        "(line 1089,col 9)-(line 1089,col 46)",
        "(line 1092,col 9)-(line 1092,col 48)",
        "(line 1093,col 9)-(line 1093,col 57)",
        "(line 1094,col 9)-(line 1094,col 47)",
        "(line 1095,col 9)-(line 1095,col 25)",
        "(line 1096,col 9)-(line 1102,col 9)",
        "(line 1104,col 9)-(line 1104,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setColumn(int, double[])",
      "begin_line": 1108,
      "end_line": 1128,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1110,col 9)-(line 1110,col 51)",
        "(line 1111,col 9)-(line 1111,col 44)",
        "(line 1112,col 9)-(line 1114,col 9)",
        "(line 1117,col 9)-(line 1117,col 48)",
        "(line 1118,col 9)-(line 1118,col 57)",
        "(line 1119,col 9)-(line 1119,col 46)",
        "(line 1120,col 9)-(line 1120,col 25)",
        "(line 1121,col 9)-(line 1127,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getEntry(int, int)",
      "begin_line": 1131,
      "end_line": 1139,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1133,col 9)-(line 1133,col 56)",
        "(line 1134,col 9)-(line 1134,col 44)",
        "(line 1135,col 9)-(line 1135,col 47)",
        "(line 1136,col 9)-(line 1137,col 43)",
        "(line 1138,col 9)-(line 1138,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.setEntry(int, int, double)",
      "begin_line": 1142,
      "end_line": 1150,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1144,col 9)-(line 1144,col 56)",
        "(line 1145,col 9)-(line 1145,col 44)",
        "(line 1146,col 9)-(line 1146,col 47)",
        "(line 1147,col 9)-(line 1148,col 43)",
        "(line 1149,col 9)-(line 1149,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.addToEntry(int, int, double)",
      "begin_line": 1153,
      "end_line": 1161,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1155,col 9)-(line 1155,col 56)",
        "(line 1156,col 9)-(line 1156,col 47)",
        "(line 1157,col 9)-(line 1157,col 47)",
        "(line 1158,col 9)-(line 1159,col 43)",
        "(line 1160,col 9)-(line 1160,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 1164,
      "end_line": 1172,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1166,col 9)-(line 1166,col 56)",
        "(line 1167,col 9)-(line 1167,col 44)",
        "(line 1168,col 9)-(line 1168,col 47)",
        "(line 1169,col 9)-(line 1170,col 43)",
        "(line 1171,col 9)-(line 1171,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.transpose()",
      "begin_line": 1175,
      "end_line": 1208,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1177,col 9)-(line 1177,col 44)",
        "(line 1178,col 9)-(line 1178,col 47)",
        "(line 1179,col 9)-(line 1179,col 70)",
        "(line 1182,col 9)-(line 1182,col 27)",
        "(line 1183,col 9)-(line 1205,col 9)",
        "(line 1207,col 9)-(line 1207,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getRowDimension()",
      "begin_line": 1211,
      "end_line": 1214,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1213,col 9)-(line 1213,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.getColumnDimension()",
      "begin_line": 1217,
      "end_line": 1220,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1219,col 9)-(line 1219,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.operate(double[])",
      "begin_line": 1223,
      "end_line": 1259,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1225,col 9)-(line 1227,col 9)",
        "(line 1228,col 9)-(line 1228,col 46)",
        "(line 1231,col 9)-(line 1256,col 9)",
        "(line 1258,col 9)-(line 1258,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.preMultiply(double[])",
      "begin_line": 1262,
      "end_line": 1303,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1264,col 9)-(line 1266,col 9)",
        "(line 1267,col 9)-(line 1267,col 49)",
        "(line 1270,col 9)-(line 1300,col 9)",
        "(line 1302,col 9)-(line 1302,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 1306,
      "end_line": 1327,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1308,col 9)-(line 1308,col 66)",
        "(line 1309,col 9)-(line 1325,col 9)",
        "(line 1326,col 9)-(line 1326,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 1330,
      "end_line": 1351,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1332,col 9)-(line 1332,col 66)",
        "(line 1333,col 9)-(line 1349,col 9)",
        "(line 1350,col 9)-(line 1350,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 1354,
      "end_line": 1380,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1358,col 9)-(line 1358,col 88)",
        "(line 1359,col 9)-(line 1359,col 79)",
        "(line 1360,col 9)-(line 1378,col 9)",
        "(line 1379,col 9)-(line 1379,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 1383,
      "end_line": 1409,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1387,col 9)-(line 1387,col 88)",
        "(line 1388,col 9)-(line 1388,col 79)",
        "(line 1389,col 9)-(line 1407,col 9)",
        "(line 1408,col 9)-(line 1408,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor)",
      "begin_line": 1412,
      "end_line": 1434,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1414,col 9)-(line 1414,col 66)",
        "(line 1415,col 9)-(line 1415,col 27)",
        "(line 1416,col 9)-(line 1432,col 9)",
        "(line 1433,col 9)-(line 1433,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor)",
      "begin_line": 1437,
      "end_line": 1459,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1439,col 9)-(line 1439,col 66)",
        "(line 1440,col 9)-(line 1440,col 27)",
        "(line 1441,col 9)-(line 1457,col 9)",
        "(line 1458,col 9)-(line 1458,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 1462,
      "end_line": 1488,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1466,col 9)-(line 1466,col 88)",
        "(line 1467,col 9)-(line 1467,col 79)",
        "(line 1468,col 9)-(line 1486,col 9)",
        "(line 1487,col 9)-(line 1487,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 1491,
      "end_line": 1517,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1495,col 9)-(line 1495,col 88)",
        "(line 1496,col 9)-(line 1496,col 79)",
        "(line 1497,col 9)-(line 1515,col 9)",
        "(line 1516,col 9)-(line 1516,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.blockHeight(int)",
      "begin_line": 1524,
      "end_line": 1526,
      "comment": "\n     * Get the height of a block.\n     * @param blockRow row index (in block sense) of the block\n     * @return height (number of rows) of the block\n     ",
      "child_ranges": [
        "(line 1525,col 9)-(line 1525,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.BlockRealMatrix.blockWidth(int)",
      "begin_line": 1533,
      "end_line": 1535,
      "comment": "\n     * Get the width of a block.\n     * @param blockColumn column index (in block sense) of the block\n     * @return width (number of columns) of the block\n     ",
      "child_ranges": [
        "(line 1534,col 9)-(line 1534,col 99)"
      ]
    }
  ]
}