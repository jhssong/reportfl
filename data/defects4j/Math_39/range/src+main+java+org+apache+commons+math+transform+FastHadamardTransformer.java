{
  "filepath": "/tmp/Math-39b/src/main/java/org/apache/commons/math/transform/FastHadamardTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastHadamardTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.transform.RealTransformer"
      ],
      "begin_line": 34,
      "end_line": 316,
      "comment": "\n * Implements the \u003ca href\u003d\"http://www.archive.chipcenter.com/dsp/DSP000517F1.html\"\u003eFast Hadamard Transform\u003c/a\u003e (FHT).\n * Transformation of an input vector x to the output vector y.\n * \u003cp\u003eIn addition to transformation of real vectors, the Hadamard transform can\n * transform integer vectors into integer vectors. However, this integer transform\n * cannot be inverted directly. Due to a scaling factor it may lead to rational results.\n * As an example, the inverse transform of integer vector (0, 1, 0, 1) is rational\n * vector (1/2, -1/2, 0, 0).\u003c/p\u003e\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastHadamardTransformer.transform(double[])",
      "begin_line": 37,
      "end_line": 40,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastHadamardTransformer.transform(org.apache.commons.math.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 43,
      "end_line": 47,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastHadamardTransformer.inverseTransform(double[])",
      "begin_line": 50,
      "end_line": 53,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastHadamardTransformer.inverseTransform(org.apache.commons.math.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 56,
      "end_line": 62,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 59,col 9)-(line 60,col 63)",
        "(line 61,col 9)-(line 61,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastHadamardTransformer.transform(int[])",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003eThe integer transform cannot be inverted directly, due to a scaling\n     * factor it may lead to double results.\u003c/p\u003e\n     * @param f the integer data array to be transformed (signal)\n     * @return the integer transformed array (spectrum)\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastHadamardTransformer.fht(double[])",
      "begin_line": 219,
      "end_line": 263,
      "comment": "\n     * The FHT (Fast Hadamard Transformation) which uses only subtraction and\n     * addition. Requires {@code N * log2(N) \u003d n * 2^n} additions.\n     *\n     * \u003ch3\u003eShort Table of manual calculation for N\u003d8\u003c/h3\u003e\n     * \u003col\u003e\n     * \u003cli\u003e\u003cb\u003ex\u003c/b\u003e is the input vector to be transformed,\u003c/li\u003e\n     * \u003cli\u003e\u003cb\u003ey\u003c/b\u003e is the output vector (Fast Hadamard transform of \u003cb\u003ex\u003c/b\u003e),\u003c/li\u003e\n     * \u003cli\u003ea and b are helper rows.\u003c/li\u003e\n     * \u003c/ol\u003e\n     * \u003ctable align\u003d\"center\" border\u003d\"1\" cellpadding\u003d\"3\"\u003e\n     * \u003ctbody align\u003d\"center\"\u003e\n     * \u003ctr\u003e\n     *     \u003cth\u003ex\u003c/th\u003e\n     *     \u003cth\u003ea\u003c/th\u003e\n     *     \u003cth\u003eb\u003c/th\u003e\n     *     \u003cth\u003ey\u003c/th\u003e\n     * \u003c/tr\u003e\n     * \u003ctr\u003e\n     *     \u003cth\u003ex\u003csub\u003e0\u003c/sub\u003e\u003c/th\u003e\n     *     \u003ctd\u003ea\u003csub\u003e0\u003c/sub\u003e \u003d x\u003csub\u003e0\u003c/sub\u003e + x\u003csub\u003e1\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003eb\u003csub\u003e0\u003c/sub\u003e \u003d a\u003csub\u003e0\u003c/sub\u003e + a\u003csub\u003e1\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003ey\u003csub\u003e0\u003c/sub\u003e \u003d b\u003csub\u003e0\u003c/sub \u003e+ b\u003csub\u003e1\u003c/sub\u003e\u003c/td\u003e\n     * \u003c/tr\u003e\n     * \u003ctr\u003e\n     *     \u003cth\u003ex\u003csub\u003e1\u003c/sub\u003e\u003c/th\u003e\n     *     \u003ctd\u003ea\u003csub\u003e1\u003c/sub\u003e \u003d x\u003csub\u003e2\u003c/sub\u003e + x\u003csub\u003e3\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003eb\u003csub\u003e0\u003c/sub\u003e \u003d a\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003ey\u003csub\u003e0\u003c/sub\u003e \u003d b\u003csub\u003e2\u003c/sub\u003e + b\u003csub\u003e3\u003c/sub\u003e\u003c/td\u003e\n     * \u003c/tr\u003e\n     * \u003ctr\u003e\n     *     \u003cth\u003ex\u003csub\u003e2\u003c/sub\u003e\u003c/th\u003e\n     *     \u003ctd\u003ea\u003csub\u003e2\u003c/sub\u003e \u003d x\u003csub\u003e4\u003c/sub\u003e + x\u003csub\u003e5\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003eb\u003csub\u003e0\u003c/sub\u003e \u003d a\u003csub\u003e4\u003c/sub\u003e + a\u003csub\u003e5\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003ey\u003csub\u003e0\u003c/sub\u003e \u003d b\u003csub\u003e4\u003c/sub\u003e + b\u003csub\u003e5\u003c/sub\u003e\u003c/td\u003e\n     * \u003c/tr\u003e\n     * \u003ctr\u003e\n     *     \u003cth\u003ex\u003csub\u003e3\u003c/sub\u003e\u003c/th\u003e\n     *     \u003ctd\u003ea\u003csub\u003e3\u003c/sub\u003e \u003d x\u003csub\u003e6\u003c/sub\u003e + x\u003csub\u003e7\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003eb\u003csub\u003e0\u003c/sub\u003e \u003d a\u003csub\u003e6\u003c/sub\u003e + a\u003csub\u003e7\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003ey\u003csub\u003e0\u003c/sub\u003e \u003d b\u003csub\u003e6\u003c/sub\u003e + b\u003csub\u003e7\u003c/sub\u003e\u003c/td\u003e\n     * \u003c/tr\u003e\n     * \u003ctr\u003e\n     *     \u003cth\u003ex\u003csub\u003e4\u003c/sub\u003e\u003c/th\u003e\n     *     \u003ctd\u003ea\u003csub\u003e0\u003c/sub\u003e \u003d x\u003csub\u003e0\u003c/sub\u003e - x\u003csub\u003e1\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003eb\u003csub\u003e0\u003c/sub\u003e \u003d a\u003csub\u003e0\u003c/sub\u003e - a\u003csub\u003e1\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003ey\u003csub\u003e0\u003c/sub\u003e \u003d b\u003csub\u003e0\u003c/sub\u003e - b\u003csub\u003e1\u003c/sub\u003e\u003c/td\u003e\n     * \u003c/tr\u003e\n     * \u003ctr\u003e\n     *     \u003cth\u003ex\u003csub\u003e5\u003c/sub\u003e\u003c/th\u003e\n     *     \u003ctd\u003ea\u003csub\u003e1\u003c/sub\u003e \u003d x\u003csub\u003e2\u003c/sub\u003e - x\u003csub\u003e3\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003eb\u003csub\u003e0\u003c/sub\u003e \u003d a\u003csub\u003e2\u003c/sub\u003e - a\u003csub\u003e3\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003ey\u003csub\u003e0\u003c/sub\u003e \u003d b\u003csub\u003e2\u003c/sub\u003e - b\u003csub\u003e3\u003c/sub\u003e\u003c/td\u003e\n     * \u003c/tr\u003e\n     * \u003ctr\u003e\n     *     \u003cth\u003ex\u003csub\u003e6\u003c/sub\u003e\u003c/th\u003e\n     *     \u003ctd\u003ea\u003csub\u003e2\u003c/sub\u003e \u003d x\u003csub\u003e4\u003c/sub\u003e - x\u003csub\u003e5\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003eb\u003csub\u003e0\u003c/sub\u003e \u003d a\u003csub\u003e4\u003c/sub\u003e - a\u003csub\u003e5\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003ey\u003csub\u003e0\u003c/sub\u003e \u003d b\u003csub\u003e4\u003c/sub\u003e - b\u003csub\u003e5\u003c/sub\u003e\u003c/td\u003e\n     * \u003c/tr\u003e\n     * \u003ctr\u003e\n     *     \u003cth\u003ex\u003csub\u003e7\u003c/sub\u003e\u003c/th\u003e\n     *     \u003ctd\u003ea\u003csub\u003e3\u003c/sub\u003e \u003d x\u003csub\u003e6\u003c/sub\u003e - x\u003csub\u003e7\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003eb\u003csub\u003e0\u003c/sub\u003e \u003d a\u003csub\u003e6\u003c/sub\u003e - a\u003csub\u003e7\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003ey\u003csub\u003e0\u003c/sub\u003e \u003d b\u003csub\u003e6\u003c/sub\u003e - b\u003csub\u003e7\u003c/sub\u003e\u003c/td\u003e\n     * \u003c/tr\u003e\n     * \u003c/tbody\u003e\n     * \u003c/table\u003e\n     *\n     * \u003ch3\u003eHow it works\u003c/h3\u003e\n     * \u003col\u003e\n     * \u003cli\u003eConstruct a matrix with {@code N} rows and {@code n + 1} columns,\n     * {@code hadm[n+1][N]}.\u003cbr/\u003e\n     * \u003cem\u003e(If I use [x][y] it always means [row-offset][column-offset] of a\n     * Matrix with n rows and m columns. Its entries go from M[0][0]\n     * to M[n][N])\u003c/em\u003e\u003c/li\u003e\n     * \u003cli\u003ePlace the input vector {@code x[N]} in the first column of the\n     * matrix {@code hadm}.\u003c/li\u003e\n     * \u003cli\u003eThe entries of the submatrix {@code D_top} are calculated as follows\n     *     \u003cul\u003e\n     *         \u003cli\u003e{@code D_top} goes from entry {@code [0][1]} to\n     *         {@code [N / 2 - 1][n + 1]},\u003c/li\u003e\n     *         \u003cli\u003ethe columns of {@code D_top} are the pairwise mutually\n     *         exclusive sums of the previous column.\u003c/li\u003e\n     *     \u003c/ul\u003e\n     * \u003c/li\u003e\n     * \u003cli\u003eThe entries of the submatrix {@code D_bottom} are calculated as\n     * follows\n     *     \u003cul\u003e\n     *         \u003cli\u003e{@code D_bottom} goes from entry {@code [N / 2][1]} to\n     *         {@code [N][n + 1]},\u003c/li\u003e\n     *         \u003cli\u003ethe columns of {@code D_bottom} are the pairwise differences\n     *         of the previous column.\u003c/li\u003e\n     *     \u003c/ul\u003e\n     * \u003c/li\u003e\n     * \u003cli\u003eThe consputation of {@code D_top} and {@code D_bottom} are best\n     * understood with the above example (for {@code N \u003d 8}).\n     * \u003cli\u003eThe output vector {@code y} is now in the last column of\n     * {@code hadm}.\u003c/li\u003e\n     * \u003cli\u003e\u003cem\u003eAlgorithm from \u003ca href\u003d\"http://www.archive.chipcenter.com/dsp/DSP000517F1.html\"\u003echipcenter\u003c/a\u003e.\u003c/em\u003e\u003c/li\u003e\n     * \u003c/ol\u003e\n     * \u003ch3\u003eVisually\u003c/h3\u003e\n     * \u003ctable border\u003d\"1\" align\u003d\"center\" cellpadding\u003d\"3\"\u003e\n     * \u003ctbody align\u003d\"center\"\u003e\n     * \u003ctr\u003e\n     *     \u003ctd\u003e\u003c/td\u003e\u003cth\u003e0\u003c/th\u003e\u003cth\u003e1\u003c/th\u003e\u003cth\u003e2\u003c/th\u003e\u003cth\u003e3\u003c/th\u003e\n     *     \u003cth\u003e\u0026hellip;\u003c/th\u003e\n     *     \u003cth\u003en + 1\u003c/th\u003e\n     * \u003c/tr\u003e\n     * \u003ctr\u003e\n     *     \u003cth\u003e0\u003c/th\u003e\n     *     \u003ctd\u003ex\u003csub\u003e0\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd colspan\u003d\"5\" rowspan\u003d\"5\" align\u003d\"center\" valign\u003d\"middle\"\u003e\n     *         \u0026uarr;\u003cbr/\u003e\n     *         \u0026larr; D\u003csub\u003etop\u003c/sub\u003e \u0026rarr;\u003cbr/\u003e\n     *         \u0026darr;\n     *     \u003c/td\u003e\n     * \u003c/tr\u003e\n     * \u003ctr\u003e\u003cth\u003e1\u003c/th\u003e\u003ctd\u003ex\u003csub\u003e1\u003c/sub\u003e\u003c/td\u003e\u003c/tr\u003e\n     * \u003ctr\u003e\u003cth\u003e2\u003c/th\u003e\u003ctd\u003ex\u003csub\u003e2\u003c/sub\u003e\u003c/td\u003e\u003c/tr\u003e\n     * \u003ctr\u003e\u003cth\u003e\u0026hellip;\u003c/th\u003e\u003ctd\u003e\u0026hellip;\u003c/td\u003e\u003c/tr\u003e\n     * \u003ctr\u003e\u003cth\u003eN / 2 - 1\u003c/th\u003e\u003ctd\u003ex\u003csub\u003eN/2-1\u003c/sub\u003e\u003c/td\u003e\u003c/tr\u003e\n     * \u003ctr\u003e\n     *     \u003cth\u003eN / 2\u003c/th\u003e\n     *     \u003ctd\u003ex\u003csub\u003eN/2\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd colspan\u003d\"5\" rowspan\u003d\"5\" align\u003d\"center\" valign\u003d\"middle\"\u003e\n     *         \u0026uarr;\u003cbr/\u003e\n     *         \u0026larr; D\u003csub\u003ebottom\u003c/sub\u003e \u0026rarr;\u003cbr/\u003e\n     *         \u0026darr;\n     *     \u003c/td\u003e\n     * \u003c/tr\u003e\n     * \u003ctr\u003e\u003cth\u003eN / 2 + 1\u003c/th\u003e\u003ctd\u003ex\u003csub\u003eN/2+1\u003c/sub\u003e\u003c/td\u003e\u003c/tr\u003e\n     * \u003ctr\u003e\u003cth\u003eN / 2 + 2\u003c/th\u003e\u003ctd\u003ex\u003csub\u003eN/2+2\u003c/sub\u003e\u003c/td\u003e\u003c/tr\u003e\n     * \u003ctr\u003e\u003cth\u003e\u0026hellip;\u003c/th\u003e\u003ctd\u003e\u0026hellip;\u003c/td\u003e\u003c/tr\u003e\n     * \u003ctr\u003e\u003cth\u003eN\u003c/th\u003e\u003ctd\u003ex\u003csub\u003eN\u003c/sub\u003e\u003c/td\u003e\u003c/tr\u003e\n     * \u003c/tbody\u003e\n     * \u003c/table\u003e\n     *\n     * @param x the input vector\n     * @return the output vector, {@code y}\n     * @exception IllegalArgumentException if input array is not a power of 2\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 35)",
        "(line 223,col 9)-(line 223,col 32)",
        "(line 226,col 9)-(line 230,col 9)",
        "(line 234,col 9)-(line 234,col 43)",
        "(line 235,col 9)-(line 235,col 39)",
        "(line 238,col 9)-(line 258,col 9)",
        "(line 261,col 9)-(line 261,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastHadamardTransformer.fht(int[])",
      "begin_line": 270,
      "end_line": 314,
      "comment": "\n     * The FHT (Fast Hadamard Transformation) which uses only subtraction and addition.\n     * @param x input vector\n     * @return y output vector\n     * @exception IllegalArgumentException if input array is not a power of 2\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 35)",
        "(line 274,col 9)-(line 274,col 32)",
        "(line 277,col 9)-(line 281,col 9)",
        "(line 285,col 9)-(line 285,col 37)",
        "(line 286,col 9)-(line 286,col 36)",
        "(line 289,col 9)-(line 309,col 9)",
        "(line 312,col 9)-(line 312,col 24)"
      ]
    }
  ]
}