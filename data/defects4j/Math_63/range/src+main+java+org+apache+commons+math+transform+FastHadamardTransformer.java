{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/transform/FastHadamardTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastHadamardTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.transform.RealTransformer"
      ],
      "begin_line": 35,
      "end_line": 252,
      "comment": "\n * Implements the \u003ca href\u003d\"http://www.archive.chipcenter.com/dsp/DSP000517F1.html\"\u003eFast Hadamard Transform\u003c/a\u003e (FHT).\n * Transformation of an input vector x to the output vector y.\n * \u003cp\u003eIn addition to transformation of real vectors, the Hadamard transform can\n * transform integer vectors into integer vectors. However, this integer transform\n * cannot be inverted directly. Due to a scaling factor it may lead to rational results.\n * As an example, the inverse transform of integer vector (0, 1, 0, 1) is rational\n * vector (1/2, -1/2, 0, 0).\u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastHadamardTransformer.transform(double[])",
      "begin_line": 38,
      "end_line": 41,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastHadamardTransformer.transform(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 44,
      "end_line": 48,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastHadamardTransformer.inversetransform(double[])",
      "begin_line": 51,
      "end_line": 54,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastHadamardTransformer.inversetransform(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 57,
      "end_line": 63,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 60,col 9)-(line 61,col 63)",
        "(line 62,col 9)-(line 62,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastHadamardTransformer.transform(int[])",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003eThe integer transform cannot be inverted directly, due to a scaling\n     * factor it may lead to double results.\u003c/p\u003e\n     * @param f the integer data array to be transformed (signal)\n     * @return the integer transformed array (spectrum)\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastHadamardTransformer.fht(double[])",
      "begin_line": 155,
      "end_line": 199,
      "comment": "\n     * The FHT (Fast Hadamard Transformation) which uses only subtraction and addition.\n     * \u003cbr\u003e\n     * Requires \u003cb\u003eNlog2N \u003d n2\u003c/b\u003e\u003csup\u003en\u003c/sup\u003e additions.\n     * \u003cbr\u003e\n     * \u003cbr\u003e\n     * \u003cb\u003e\u003cu\u003eShort Table of manual calculation for N\u003d8:\u003c/u\u003e\u003c/b\u003e\n     * \u003col\u003e\n     * \u003cli\u003e\u003cb\u003ex\u003c/b\u003e is the input vector we want to transform\u003c/li\u003e\n     * \u003cli\u003e\u003cb\u003ey\u003c/b\u003e is the output vector which is our desired result\u003c/li\u003e\n     * \u003cli\u003ea and b are just helper rows\u003c/li\u003e\n     * \u003c/ol\u003e\n     * \u003cpre\u003e\n     * \u003ccode\u003e\n     * +----+----------+---------+----------+\n     * | \u003cb\u003ex\u003c/b\u003e  |    \u003cb\u003ea\u003c/b\u003e     |    \u003cb\u003eb\u003c/b\u003e    |    \u003cb\u003ey\u003c/b\u003e     |\n     * +----+----------+---------+----------+\n     * | x\u003csub\u003e0\u003c/sub\u003e | a\u003csub\u003e0\u003c/sub\u003e\u003dx\u003csub\u003e0\u003c/sub\u003e+x\u003csub\u003e1\u003c/sub\u003e | b\u003csub\u003e0\u003c/sub\u003e\u003da\u003csub\u003e0\u003c/sub\u003e+a\u003csub\u003e1\u003c/sub\u003e | y\u003csub\u003e0\u003c/sub\u003e\u003db\u003csub\u003e0\u003c/sub\u003e+b\u003csub\u003e1\u003c/sub\u003e |\n     * +----+----------+---------+----------+\n     * | x\u003csub\u003e1\u003c/sub\u003e | a\u003csub\u003e1\u003c/sub\u003e\u003dx\u003csub\u003e2\u003c/sub\u003e+x\u003csub\u003e3\u003c/sub\u003e | b\u003csub\u003e0\u003c/sub\u003e\u003da\u003csub\u003e2\u003c/sub\u003e+a\u003csub\u003e3\u003c/sub\u003e | y\u003csub\u003e0\u003c/sub\u003e\u003db\u003csub\u003e2\u003c/sub\u003e+b\u003csub\u003e3\u003c/sub\u003e |\n     * +----+----------+---------+----------+\n     * | x\u003csub\u003e2\u003c/sub\u003e | a\u003csub\u003e2\u003c/sub\u003e\u003dx\u003csub\u003e4\u003c/sub\u003e+x\u003csub\u003e5\u003c/sub\u003e | b\u003csub\u003e0\u003c/sub\u003e\u003da\u003csub\u003e4\u003c/sub\u003e+a\u003csub\u003e5\u003c/sub\u003e | y\u003csub\u003e0\u003c/sub\u003e\u003db\u003csub\u003e4\u003c/sub\u003e+b\u003csub\u003e5\u003c/sub\u003e |\n     * +----+----------+---------+----------+\n     * | x\u003csub\u003e3\u003c/sub\u003e | a\u003csub\u003e3\u003c/sub\u003e\u003dx\u003csub\u003e6\u003c/sub\u003e+x\u003csub\u003e7\u003c/sub\u003e | b\u003csub\u003e0\u003c/sub\u003e\u003da\u003csub\u003e6\u003c/sub\u003e+a\u003csub\u003e7\u003c/sub\u003e | y\u003csub\u003e0\u003c/sub\u003e\u003db\u003csub\u003e6\u003c/sub\u003e+b\u003csub\u003e7\u003c/sub\u003e |\n     * +----+----------+---------+----------+\n     * | x\u003csub\u003e4\u003c/sub\u003e | a\u003csub\u003e0\u003c/sub\u003e\u003dx\u003csub\u003e0\u003c/sub\u003e-x\u003csub\u003e1\u003c/sub\u003e | b\u003csub\u003e0\u003c/sub\u003e\u003da\u003csub\u003e0\u003c/sub\u003e-a\u003csub\u003e1\u003c/sub\u003e | y\u003csub\u003e0\u003c/sub\u003e\u003db\u003csub\u003e0\u003c/sub\u003e-b\u003csub\u003e1\u003c/sub\u003e |\n     * +----+----------+---------+----------+\n     * | x\u003csub\u003e5\u003c/sub\u003e | a\u003csub\u003e1\u003c/sub\u003e\u003dx\u003csub\u003e2\u003c/sub\u003e-x\u003csub\u003e3\u003c/sub\u003e | b\u003csub\u003e0\u003c/sub\u003e\u003da\u003csub\u003e2\u003c/sub\u003e-a\u003csub\u003e3\u003c/sub\u003e | y\u003csub\u003e0\u003c/sub\u003e\u003db\u003csub\u003e2\u003c/sub\u003e-b\u003csub\u003e3\u003c/sub\u003e |\n     * +----+----------+---------+----------+\n     * | x\u003csub\u003e6\u003c/sub\u003e | a\u003csub\u003e2\u003c/sub\u003e\u003dx\u003csub\u003e4\u003c/sub\u003e-x\u003csub\u003e5\u003c/sub\u003e | b\u003csub\u003e0\u003c/sub\u003e\u003da\u003csub\u003e4\u003c/sub\u003e-a\u003csub\u003e5\u003c/sub\u003e | y\u003csub\u003e0\u003c/sub\u003e\u003db\u003csub\u003e4\u003c/sub\u003e-b\u003csub\u003e5\u003c/sub\u003e |\n     * +----+----------+---------+----------+\n     * | x\u003csub\u003e7\u003c/sub\u003e | a\u003csub\u003e3\u003c/sub\u003e\u003dx\u003csub\u003e6\u003c/sub\u003e-x\u003csub\u003e7\u003c/sub\u003e | b\u003csub\u003e0\u003c/sub\u003e\u003da\u003csub\u003e6\u003c/sub\u003e-a\u003csub\u003e7\u003c/sub\u003e | y\u003csub\u003e0\u003c/sub\u003e\u003db\u003csub\u003e6\u003c/sub\u003e-b\u003csub\u003e7\u003c/sub\u003e |\n     * +----+----------+---------+----------+\n     * \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * \u003cb\u003e\u003cu\u003eHow it works\u003c/u\u003e\u003c/b\u003e\n     * \u003col\u003e\n     * \u003cli\u003eConstruct a matrix with N rows and n+1 columns\u003cbr\u003e   \u003cb\u003ehadm[n+1][N]\u003c/b\u003e\n     * \u003cbr\u003e\u003ci\u003e(If I use [x][y] it always means [row-offset][column-offset] of a Matrix with n rows and m columns. Its entries go from M[0][0] to M[n][m])\u003c/i\u003e\u003c/li\u003e\n     * \u003cli\u003ePlace the input vector \u003cb\u003ex[N]\u003c/b\u003e in the first column of the matrix \u003cb\u003ehadm\u003c/b\u003e\u003c/li\u003e\n     * \u003cli\u003eThe entries of the submatrix D\u003csub\u003etop\u003c/sub\u003e are calculated as follows.\n     * \u003cbr\u003eD\u003csub\u003etop\u003c/sub\u003e goes from entry [0][1] to [N/2-1][n+1].\n     * \u003cbr\u003eThe columns of D\u003csub\u003etop\u003c/sub\u003e are the pairwise mutually exclusive sums of the previous column\n     * \u003c/li\u003e\n     * \u003cli\u003eThe entries of the submatrix D\u003csub\u003ebottom\u003c/sub\u003e are calculated as follows.\n     * \u003cbr\u003eD\u003csub\u003ebottom\u003c/sub\u003e goes from entry [N/2][1] to [N][n+1].\n     * \u003cbr\u003eThe columns of D\u003csub\u003ebottom\u003c/sub\u003e are the pairwise differences of the previous column\n     * \u003c/li\u003e\n     * \u003cli\u003eHow D\u003csub\u003etop\u003c/sub\u003e and D\u003csub\u003ebottom\u003c/sub\u003e you can understand best with the example for N\u003d8 above.\n     * \u003cli\u003eThe output vector y is now in the last column of \u003cb\u003ehadm\u003c/b\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ci\u003eAlgorithm from: http://www.archive.chipcenter.com/dsp/DSP000517F1.html\u003c/i\u003e\u003c/li\u003e\n     * \u003c/ol\u003e\n     * \u003cbr\u003e\n     * \u003cb\u003e\u003cu\u003eVisually\u003c/u\u003e\u003c/b\u003e\n     * \u003cpre\u003e\n     *        +--------+---+---+---+-----+---+\n     *        |   0    | 1 | 2 | 3 | ... |n+1|\n     * +------+--------+---+---+---+-----+---+\n     * |0     | x\u003csub\u003e0\u003c/sub\u003e     |       /\\            |\n     * |1     | x\u003csub\u003e1\u003c/sub\u003e     |       ||            |\n     * |2     | x\u003csub\u003e2\u003c/sub\u003e     |   \u003c\u003d D\u003csub\u003etop\u003c/sub\u003e  \u003d\u003e       |\n     * |...   | ...    |       ||            |\n     * |N/2-1 | x\u003csub\u003eN/2-1\u003c/sub\u003e  |       \\/            |\n     * +------+--------+---+---+---+-----+---+\n     * |N/2   | x\u003csub\u003eN/2\u003c/sub\u003e   |       /\\            |\n     * |N/2+1 | x\u003csub\u003eN/2+1\u003c/sub\u003e  |       ||            |\n     * |N/2+2 | x\u003csub\u003eN/2+2\u003c/sub\u003e  |  \u003c\u003d D\u003csub\u003ebottom\u003c/sub\u003e  \u003d\u003e      | which is in the last column of the matrix\n     * |...   | ...    |       ||            |\n     * |N     | x\u003csub\u003eN/2\u003c/sub\u003e   |        \\/           |\n     * +------+--------+---+---+---+-----+---+\n     * \u003c/pre\u003e\n     *\n     * @param x input vector\n     * @return y output vector\n     * @exception IllegalArgumentException if input array is not a power of 2\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 35)",
        "(line 159,col 9)-(line 159,col 32)",
        "(line 162,col 9)-(line 166,col 9)",
        "(line 170,col 9)-(line 170,col 43)",
        "(line 171,col 9)-(line 171,col 39)",
        "(line 174,col 9)-(line 194,col 9)",
        "(line 197,col 9)-(line 197,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastHadamardTransformer.fht(int[])",
      "begin_line": 206,
      "end_line": 250,
      "comment": "\n     * The FHT (Fast Hadamard Transformation) which uses only subtraction and addition.\n     * @param x input vector\n     * @return y output vector\n     * @exception IllegalArgumentException if input array is not a power of 2\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 35)",
        "(line 210,col 9)-(line 210,col 32)",
        "(line 213,col 9)-(line 217,col 9)",
        "(line 221,col 9)-(line 221,col 37)",
        "(line 222,col 9)-(line 222,col 36)",
        "(line 225,col 9)-(line 245,col 9)",
        "(line 248,col 9)-(line 248,col 24)"
      ]
    }
  ]
}