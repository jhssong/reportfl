{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/BlockRealMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BlockRealMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.AbstractRealMatrix",
        "java.io.Serializable"
      ],
      "begin_line": 72,
      "end_line": 1582,
      "comment": "\n * Cache-friendly implementation of RealMatrix using a flat arrays to store\n * square blocks of the matrix.\n * \u003cp\u003e\n * This implementation is specially designed to be cache-friendly. Square blocks are\n * stored as small arrays and allow efficient traversal of data both in row major direction\n * and columns major direction, one block at a time. This greatly increases performances\n * for algorithms that use crossed directions loops like multiplication or transposition.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The size of square blocks is a static parameter. It may be tuned according to the cache\n * size of the target computer processor. As a rule of thumbs, it should be the largest\n * value that allows three blocks to be simultaneously cached (this is necessary for example\n * for matrix multiplication). The default value is to use 52x52 blocks which is well suited\n * for processors with 64k L1 cache (one block holds 2704 values or 21632 bytes). This value\n * could be lowered to 36x36 for processors with 32k L1 cache.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The regular blocks represent {@link #BLOCK_SIZE} x {@link #BLOCK_SIZE} squares. Blocks\n * at right hand side and bottom side which may be smaller to fit matrix dimensions. The square\n * blocks are flattened in row major order in single dimension arrays which are therefore\n * {@link #BLOCK_SIZE}\u003csup\u003e2\u003c/sup\u003e elements long for regular blocks. The blocks are themselves\n * organized in row major order.\n * \u003c/p\u003e\n * \u003cp\u003e\n * As an example, for a block size of 52x52, a 100x60 matrix would be stored in 4 blocks.\n * Block 0 would be a double[2704] array holding the upper left 52x52 square, block 1 would be\n * a double[416] array holding the upper right 52x8 rectangle, block 2 would be a double[2496]\n * array holding the lower left 48x52 rectangle and block 3 would be a double[384] array\n * holding the lower right 48x8 rectangle.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The layout complexity overhead versus simple mapping of matrices to java\n * arrays is negligible for small matrices (about 1%). The gain from cache efficiency leads\n * to up to 3-fold improvements for matrices of moderate to large size.\n * \u003c/p\u003e\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "BLOCK_SIZE"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Block size. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "blocks"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Blocks of matrix entries. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 80,
      "end_line": 80,
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
      "begin_line": 84,
      "end_line": 84,
      "comment": " Number of block rows of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "blockColumns"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Number of block columns of the matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.BlockRealMatrix(int, int)",
      "begin_line": 96,
      "end_line": 108,
      "comment": "\n     * Create a new matrix with the supplied row and column dimensions.\n     *\n     * @param rows  the number of rows in the new matrix\n     * @param columns  the number of columns in the new matrix\n     * @throws NotStrictlyPositiveException if row or column dimension is not\n     * positive.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 29)",
        "(line 99,col 9)-(line 99,col 25)",
        "(line 100,col 9)-(line 100,col 31)",
        "(line 103,col 9)-(line 103,col 57)",
        "(line 104,col 9)-(line 104,col 63)",
        "(line 107,col 9)-(line 107,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.BlockRealMatrix(double[][])",
      "begin_line": 125,
      "end_line": 128,
      "comment": "\n     * Create a new dense matrix copying entries from raw layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in raw layout.\u003c/p\u003e\n     * \u003cp\u003eCalling this constructor is equivalent to call:\n     * \u003cpre\u003ematrix \u003d new BlockRealMatrix(rawData.length, rawData[0].length,\n     *                                   toBlocksLayout(rawData), false);\u003c/pre\u003e\n     * \u003c/p\u003e\n     *\n     * @param rawData data for new matrix, in raw layout\n     * @throws DimensionMismatchException if the shape of {@code blockData} is\n     * inconsistent with block layout.\n     * @throws NotStrictlyPositiveException if row or column dimension is not\n     * positive.\n     * @see #BlockRealMatrix(int, int, double[][], boolean)\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 80)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.BlockRealMatrix(int, int, double[][], boolean)",
      "begin_line": 146,
      "end_line": 178,
      "comment": "\n     * Create a new dense matrix copying entries from block layout data.\n     * \u003cp\u003eThe input array \u003cem\u003emust\u003c/em\u003e already be in blocks layout.\u003c/p\u003e\n     *\n     * @param rows Number of rows in the new matrix.\n     * @param columns Number of columns in the new matrix.\n     * @param blockData data for new matrix\n     * @param copyArray Whether the input array will be copied or referenced.\n     * @throws DimensionMismatchException if the shape of {@code blockData} is\n     * inconsistent with block layout.\n     * @throws NotStrictlyPositiveException if row or column dimension is not\n     * positive.\n     * @see #createBlocksLayout(int, int)\n     * @see #toBlocksLayout(double[][])\n     * @see #BlockRealMatrix(double[][])\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 29)",
        "(line 150,col 9)-(line 150,col 25)",
        "(line 151,col 9)-(line 151,col 31)",
        "(line 154,col 9)-(line 154,col 57)",
        "(line 155,col 9)-(line 155,col 63)",
        "(line 157,col 9)-(line 163,col 9)",
        "(line 165,col 9)-(line 165,col 22)",
        "(line 166,col 9)-(line 177,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.toBlocksLayout(double[][])",
      "begin_line": 201,
      "end_line": 243,
      "comment": "\n     * Convert a data array from raw layout to blocks layout.\n     * \u003cp\u003e\n     * Raw layout is the straightforward layout where element at row i and\n     * column j is in array element \u003ccode\u003erawData[i][j]\u003c/code\u003e. Blocks layout\n     * is the layout used in {@link BlockRealMatrix} instances, where the matrix\n     * is split in square blocks (except at right and bottom side where blocks may\n     * be rectangular to fit matrix size) and each block is stored in a flattened\n     * one-dimensional array.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method creates an array in blocks layout from an input array in raw layout.\n     * It can be used to provide the array argument of the {@link\n     * #BlockRealMatrix(int, int, double[][], boolean)} constructor.\n     * \u003c/p\u003e\n     * @param rawData Data array in raw layout.\n     * @return a new data array containing the same entries but in blocks layout.\n     * @throws DimensionMismatchException if {@code rawData} is not rectangular.\n     * @see #createBlocksLayout(int, int)\n     * @see #BlockRealMatrix(int, int, double[][], boolean)\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 40)",
        "(line 204,col 9)-(line 204,col 46)",
        "(line 205,col 9)-(line 205,col 70)",
        "(line 206,col 9)-(line 206,col 73)",
        "(line 209,col 9)-(line 214,col 9)",
        "(line 217,col 9)-(line 217,col 73)",
        "(line 218,col 9)-(line 218,col 27)",
        "(line 219,col 9)-(line 240,col 9)",
        "(line 242,col 9)-(line 242,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.createBlocksLayout(int, int)",
      "begin_line": 257,
      "end_line": 277,
      "comment": "\n     * Create a data array in blocks layout.\n     * \u003cp\u003e\n     * This method can be used to create the array argument of the {@link\n     * #BlockRealMatrix(int, int, double[][], boolean)} constructor.\n     * \u003c/p\u003e\n     * @param rows Number of rows in the new matrix.\n     * @param columns Number of columns in the new matrix.\n     * @return a new data array in blocks layout.\n     * @see #toBlocksLayout(double[][])\n     * @see #BlockRealMatrix(int, int, double[][], boolean)\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 70)",
        "(line 259,col 9)-(line 259,col 73)",
        "(line 261,col 9)-(line 261,col 73)",
        "(line 262,col 9)-(line 262,col 27)",
        "(line 263,col 9)-(line 274,col 9)",
        "(line 276,col 9)-(line 276,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.createMatrix(int, int)",
      "begin_line": 280,
      "end_line": 285,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.copy()",
      "begin_line": 288,
      "end_line": 299,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 68)",
        "(line 294,col 9)-(line 296,col 9)",
        "(line 298,col 9)-(line 298,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.add(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 302,
      "end_line": 339,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 305,col 9)-(line 338,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.add(org.apache.commons.math3.linear.BlockRealMatrix)",
      "begin_line": 349,
      "end_line": 367,
      "comment": "\n     * Compute the sum of this matrix and {@code m}.\n     *\n     * @param m Matrix to be added.\n     * @return {@code this} + m.\n     * @throws MatrixDimensionMismatchException if {@code m} is not the same\n     * size as this matrix.\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 53)",
        "(line 354,col 9)-(line 354,col 71)",
        "(line 357,col 9)-(line 364,col 9)",
        "(line 366,col 9)-(line 366,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.subtract(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 370,
      "end_line": 407,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 373,col 9)-(line 406,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.subtract(org.apache.commons.math3.linear.BlockRealMatrix)",
      "begin_line": 417,
      "end_line": 435,
      "comment": "\n     * Subtract {@code m} from this matrix.\n     *\n     * @param m Matrix to be subtracted.\n     * @return {@code this} - m.\n     * @throws MatrixDimensionMismatchException if {@code m} is not the\n     * same size as this matrix.\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 56)",
        "(line 422,col 9)-(line 422,col 71)",
        "(line 425,col 9)-(line 432,col 9)",
        "(line 434,col 9)-(line 434,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.scalarAdd(double)",
      "begin_line": 438,
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
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.scalarMultiply(double)",
      "begin_line": 456,
      "end_line": 470,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 71)",
        "(line 461,col 9)-(line 467,col 9)",
        "(line 469,col 9)-(line 469,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.multiply(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 473,
      "end_line": 525,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 476,col 9)-(line 524,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.multiply(org.apache.commons.math3.linear.BlockRealMatrix)",
      "begin_line": 534,
      "end_line": 593,
      "comment": "\n     * Returns the result of postmultiplying this by {@code m}.\n     *\n     * @param m Matrix to postmultiply by.\n     * @return {@code this} * m.\n     * @throws DimensionMismatchException if the matrices are not compatible.\n     ",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 59)",
        "(line 539,col 9)-(line 539,col 73)",
        "(line 542,col 9)-(line 542,col 27)",
        "(line 543,col 9)-(line 590,col 9)",
        "(line 592,col 9)-(line 592,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.getData()",
      "begin_line": 596,
      "end_line": 621,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 84)",
        "(line 599,col 9)-(line 599,col 74)",
        "(line 601,col 9)-(line 618,col 9)",
        "(line 620,col 9)-(line 620,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.getNorm()",
      "begin_line": 624,
      "end_line": 647,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 56)",
        "(line 627,col 9)-(line 627,col 29)",
        "(line 628,col 9)-(line 645,col 9)",
        "(line 646,col 9)-(line 646,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.getFrobeniusNorm()",
      "begin_line": 650,
      "end_line": 659,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 24)",
        "(line 653,col 9)-(line 657,col 9)",
        "(line 658,col 9)-(line 658,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.getSubMatrix(int, int, int, int)",
      "begin_line": 662,
      "end_line": 755,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 668,col 9)-(line 668,col 88)",
        "(line 671,col 9)-(line 672,col 84)",
        "(line 675,col 9)-(line 675,col 56)",
        "(line 676,col 9)-(line 676,col 52)",
        "(line 677,col 9)-(line 677,col 62)",
        "(line 678,col 9)-(line 678,col 58)",
        "(line 681,col 9)-(line 681,col 35)",
        "(line 682,col 9)-(line 752,col 9)",
        "(line 754,col 9)-(line 754,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.copyBlockPart(double[], int, int, int, int, int, double[], int, int, int)",
      "begin_line": 772,
      "end_line": 785,
      "comment": "\n     * Copy a part of a block into another one\n     * \u003cp\u003eThis method can be called only when the specified part fits in both\n     * blocks, no verification is done here.\u003c/p\u003e\n     * @param srcBlock source block\n     * @param srcWidth source block width ({@link #BLOCK_SIZE} or smaller)\n     * @param srcStartRow start row in the source block\n     * @param srcEndRow end row (exclusive) in the source block\n     * @param srcStartColumn start column in the source block\n     * @param srcEndColumn end column (exclusive) in the source block\n     * @param dstBlock destination block\n     * @param dstWidth destination block width ({@link #BLOCK_SIZE} or smaller)\n     * @param dstStartRow start row in the destination block\n     * @param dstStartColumn start column in the destination block\n     ",
      "child_ranges": [
        "(line 777,col 9)-(line 777,col 57)",
        "(line 778,col 9)-(line 778,col 61)",
        "(line 779,col 9)-(line 779,col 61)",
        "(line 780,col 9)-(line 784,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.setSubMatrix(double[][], int, int)",
      "begin_line": 788,
      "end_line": 838,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 794,col 9)-(line 794,col 42)",
        "(line 795,col 9)-(line 795,col 50)",
        "(line 796,col 9)-(line 798,col 9)",
        "(line 799,col 9)-(line 799,col 54)",
        "(line 800,col 9)-(line 800,col 53)",
        "(line 801,col 9)-(line 801,col 78)",
        "(line 802,col 9)-(line 806,col 9)",
        "(line 809,col 9)-(line 809,col 51)",
        "(line 810,col 9)-(line 810,col 67)",
        "(line 811,col 9)-(line 811,col 57)",
        "(line 812,col 9)-(line 812,col 73)",
        "(line 815,col 9)-(line 837,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.getRowMatrix(int)",
      "begin_line": 841,
      "end_line": 869,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 844,col 9)-(line 844,col 45)",
        "(line 845,col 9)-(line 845,col 68)",
        "(line 848,col 9)-(line 848,col 44)",
        "(line 849,col 9)-(line 849,col 51)",
        "(line 850,col 9)-(line 850,col 30)",
        "(line 851,col 9)-(line 851,col 25)",
        "(line 852,col 9)-(line 852,col 54)",
        "(line 853,col 9)-(line 866,col 9)",
        "(line 868,col 9)-(line 868,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.setRowMatrix(int, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 872,
      "end_line": 880,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 875,col 9)-(line 879,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.setRowMatrix(int, org.apache.commons.math3.linear.BlockRealMatrix)",
      "begin_line": 893,
      "end_line": 924,
      "comment": "\n     * Sets the entries in row number \u003ccode\u003erow\u003c/code\u003e\n     * as a row matrix.  Row indices start at 0.\n     *\n     * @param row the row to be set\n     * @param matrix row matrix (must have one row and the same number of columns\n     * as the instance)\n     * @throws OutOfRangeException if the specified row index is invalid.\n     * @throws MatrixDimensionMismatchException if the matrix dimensions do\n     * not match one instance row.\n     ",
      "child_ranges": [
        "(line 895,col 9)-(line 895,col 45)",
        "(line 896,col 9)-(line 896,col 47)",
        "(line 897,col 9)-(line 902,col 9)",
        "(line 905,col 9)-(line 905,col 44)",
        "(line 906,col 9)-(line 906,col 51)",
        "(line 907,col 9)-(line 907,col 28)",
        "(line 908,col 9)-(line 908,col 23)",
        "(line 909,col 9)-(line 909,col 53)",
        "(line 910,col 9)-(line 923,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.getColumnMatrix(int)",
      "begin_line": 927,
      "end_line": 953,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 930,col 9)-(line 930,col 51)",
        "(line 931,col 9)-(line 931,col 65)",
        "(line 934,col 9)-(line 934,col 47)",
        "(line 935,col 9)-(line 935,col 57)",
        "(line 936,col 9)-(line 936,col 46)",
        "(line 937,col 9)-(line 937,col 30)",
        "(line 938,col 9)-(line 938,col 25)",
        "(line 939,col 9)-(line 939,col 54)",
        "(line 940,col 9)-(line 950,col 9)",
        "(line 952,col 9)-(line 952,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.setColumnMatrix(int, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 956,
      "end_line": 964,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 959,col 9)-(line 963,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.setColumnMatrix(int, org.apache.commons.math3.linear.BlockRealMatrix)",
      "begin_line": 977,
      "end_line": 1006,
      "comment": "\n     * Sets the entries in column number \u003ccode\u003ecolumn\u003c/code\u003e\n     * as a column matrix.  Column indices start at 0.\n     *\n     * @param column the column to be set\n     * @param matrix column matrix (must have one column and the same number of rows\n     * as the instance)\n     * @throws OutOfRangeException if the specified column index is invalid.\n     * @throws MatrixDimensionMismatchException if the matrix dimensions do\n     * not match one instance column.\n     ",
      "child_ranges": [
        "(line 979,col 9)-(line 979,col 51)",
        "(line 980,col 9)-(line 980,col 44)",
        "(line 981,col 9)-(line 986,col 9)",
        "(line 989,col 9)-(line 989,col 47)",
        "(line 990,col 9)-(line 990,col 57)",
        "(line 991,col 9)-(line 991,col 46)",
        "(line 992,col 9)-(line 992,col 28)",
        "(line 993,col 9)-(line 993,col 23)",
        "(line 994,col 9)-(line 994,col 53)",
        "(line 995,col 9)-(line 1005,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.getRowVector(int)",
      "begin_line": 1009,
      "end_line": 1027,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1012,col 9)-(line 1012,col 45)",
        "(line 1013,col 9)-(line 1013,col 53)",
        "(line 1016,col 9)-(line 1016,col 44)",
        "(line 1017,col 9)-(line 1017,col 51)",
        "(line 1018,col 9)-(line 1018,col 25)",
        "(line 1019,col 9)-(line 1024,col 9)",
        "(line 1026,col 9)-(line 1026,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.setRowVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1030,
      "end_line": 1038,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1033,col 9)-(line 1037,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.getColumnVector(int)",
      "begin_line": 1041,
      "end_line": 1061,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1044,col 9)-(line 1044,col 51)",
        "(line 1045,col 9)-(line 1045,col 50)",
        "(line 1048,col 9)-(line 1048,col 47)",
        "(line 1049,col 9)-(line 1049,col 57)",
        "(line 1050,col 9)-(line 1050,col 46)",
        "(line 1051,col 9)-(line 1051,col 25)",
        "(line 1052,col 9)-(line 1058,col 9)",
        "(line 1060,col 9)-(line 1060,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.setColumnVector(int, org.apache.commons.math3.linear.RealVector)",
      "begin_line": 1064,
      "end_line": 1072,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1067,col 9)-(line 1071,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.getRow(int)",
      "begin_line": 1075,
      "end_line": 1092,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1077,col 9)-(line 1077,col 45)",
        "(line 1078,col 9)-(line 1078,col 49)",
        "(line 1081,col 9)-(line 1081,col 44)",
        "(line 1082,col 9)-(line 1082,col 51)",
        "(line 1083,col 9)-(line 1083,col 25)",
        "(line 1084,col 9)-(line 1089,col 9)",
        "(line 1091,col 9)-(line 1091,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.setRow(int, double[])",
      "begin_line": 1095,
      "end_line": 1114,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1098,col 9)-(line 1098,col 45)",
        "(line 1099,col 9)-(line 1099,col 47)",
        "(line 1100,col 9)-(line 1102,col 9)",
        "(line 1105,col 9)-(line 1105,col 44)",
        "(line 1106,col 9)-(line 1106,col 51)",
        "(line 1107,col 9)-(line 1107,col 25)",
        "(line 1108,col 9)-(line 1113,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.getColumn(int)",
      "begin_line": 1117,
      "end_line": 1136,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1119,col 9)-(line 1119,col 51)",
        "(line 1120,col 9)-(line 1120,col 46)",
        "(line 1123,col 9)-(line 1123,col 48)",
        "(line 1124,col 9)-(line 1124,col 57)",
        "(line 1125,col 9)-(line 1125,col 47)",
        "(line 1126,col 9)-(line 1126,col 25)",
        "(line 1127,col 9)-(line 1133,col 9)",
        "(line 1135,col 9)-(line 1135,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.setColumn(int, double[])",
      "begin_line": 1139,
      "end_line": 1160,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1142,col 9)-(line 1142,col 51)",
        "(line 1143,col 9)-(line 1143,col 44)",
        "(line 1144,col 9)-(line 1146,col 9)",
        "(line 1149,col 9)-(line 1149,col 48)",
        "(line 1150,col 9)-(line 1150,col 57)",
        "(line 1151,col 9)-(line 1151,col 46)",
        "(line 1152,col 9)-(line 1152,col 25)",
        "(line 1153,col 9)-(line 1159,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.getEntry(int, int)",
      "begin_line": 1163,
      "end_line": 1172,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1166,col 9)-(line 1166,col 56)",
        "(line 1167,col 9)-(line 1167,col 44)",
        "(line 1168,col 9)-(line 1168,col 47)",
        "(line 1169,col 9)-(line 1170,col 43)",
        "(line 1171,col 9)-(line 1171,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.setEntry(int, int, double)",
      "begin_line": 1175,
      "end_line": 1184,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1178,col 9)-(line 1178,col 56)",
        "(line 1179,col 9)-(line 1179,col 44)",
        "(line 1180,col 9)-(line 1180,col 47)",
        "(line 1181,col 9)-(line 1182,col 43)",
        "(line 1183,col 9)-(line 1183,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.addToEntry(int, int, double)",
      "begin_line": 1187,
      "end_line": 1197,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1191,col 9)-(line 1191,col 56)",
        "(line 1192,col 9)-(line 1192,col 47)",
        "(line 1193,col 9)-(line 1193,col 47)",
        "(line 1194,col 9)-(line 1195,col 43)",
        "(line 1196,col 9)-(line 1196,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.multiplyEntry(int, int, double)",
      "begin_line": 1200,
      "end_line": 1210,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1204,col 9)-(line 1204,col 56)",
        "(line 1205,col 9)-(line 1205,col 44)",
        "(line 1206,col 9)-(line 1206,col 47)",
        "(line 1207,col 9)-(line 1208,col 43)",
        "(line 1209,col 9)-(line 1209,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.transpose()",
      "begin_line": 1213,
      "end_line": 1246,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1215,col 9)-(line 1215,col 44)",
        "(line 1216,col 9)-(line 1216,col 47)",
        "(line 1217,col 9)-(line 1217,col 70)",
        "(line 1220,col 9)-(line 1220,col 27)",
        "(line 1221,col 9)-(line 1243,col 9)",
        "(line 1245,col 9)-(line 1245,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.getRowDimension()",
      "begin_line": 1249,
      "end_line": 1252,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1251,col 9)-(line 1251,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.getColumnDimension()",
      "begin_line": 1255,
      "end_line": 1258,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1257,col 9)-(line 1257,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.operate(double[])",
      "begin_line": 1261,
      "end_line": 1298,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1264,col 9)-(line 1266,col 9)",
        "(line 1267,col 9)-(line 1267,col 46)",
        "(line 1270,col 9)-(line 1295,col 9)",
        "(line 1297,col 9)-(line 1297,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.preMultiply(double[])",
      "begin_line": 1301,
      "end_line": 1343,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1304,col 9)-(line 1306,col 9)",
        "(line 1307,col 9)-(line 1307,col 49)",
        "(line 1310,col 9)-(line 1340,col 9)",
        "(line 1342,col 9)-(line 1342,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor)",
      "begin_line": 1346,
      "end_line": 1367,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1348,col 9)-(line 1348,col 66)",
        "(line 1349,col 9)-(line 1365,col 9)",
        "(line 1366,col 9)-(line 1366,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor)",
      "begin_line": 1370,
      "end_line": 1391,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1372,col 9)-(line 1372,col 66)",
        "(line 1373,col 9)-(line 1389,col 9)",
        "(line 1390,col 9)-(line 1390,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 1394,
      "end_line": 1421,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1399,col 9)-(line 1399,col 88)",
        "(line 1400,col 9)-(line 1400,col 79)",
        "(line 1401,col 9)-(line 1419,col 9)",
        "(line 1420,col 9)-(line 1420,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.walkInRowOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 1424,
      "end_line": 1451,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1429,col 9)-(line 1429,col 88)",
        "(line 1430,col 9)-(line 1430,col 79)",
        "(line 1431,col 9)-(line 1449,col 9)",
        "(line 1450,col 9)-(line 1450,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor)",
      "begin_line": 1454,
      "end_line": 1476,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1456,col 9)-(line 1456,col 66)",
        "(line 1457,col 9)-(line 1457,col 27)",
        "(line 1458,col 9)-(line 1474,col 9)",
        "(line 1475,col 9)-(line 1475,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor)",
      "begin_line": 1479,
      "end_line": 1501,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1481,col 9)-(line 1481,col 66)",
        "(line 1482,col 9)-(line 1482,col 27)",
        "(line 1483,col 9)-(line 1499,col 9)",
        "(line 1500,col 9)-(line 1500,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixChangingVisitor, int, int, int, int)",
      "begin_line": 1504,
      "end_line": 1532,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1510,col 9)-(line 1510,col 88)",
        "(line 1511,col 9)-(line 1511,col 79)",
        "(line 1512,col 9)-(line 1530,col 9)",
        "(line 1531,col 9)-(line 1531,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.walkInOptimizedOrder(org.apache.commons.math3.linear.RealMatrixPreservingVisitor, int, int, int, int)",
      "begin_line": 1535,
      "end_line": 1563,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1541,col 9)-(line 1541,col 88)",
        "(line 1542,col 9)-(line 1542,col 79)",
        "(line 1543,col 9)-(line 1561,col 9)",
        "(line 1562,col 9)-(line 1562,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.blockHeight(int)",
      "begin_line": 1570,
      "end_line": 1572,
      "comment": "\n     * Get the height of a block.\n     * @param blockRow row index (in block sense) of the block\n     * @return height (number of rows) of the block\n     ",
      "child_ranges": [
        "(line 1571,col 9)-(line 1571,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.BlockRealMatrix.blockWidth(int)",
      "begin_line": 1579,
      "end_line": 1581,
      "comment": "\n     * Get the width of a block.\n     * @param blockColumn column index (in block sense) of the block\n     * @return width (number of columns) of the block\n     ",
      "child_ranges": [
        "(line 1580,col 9)-(line 1580,col 99)"
      ]
    }
  ]
}