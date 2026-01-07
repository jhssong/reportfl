{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/transform/FastHadamardTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastHadamardTransformer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.transform.RealTransformer",
        "java.io.Serializable"
      ],
      "begin_line": 40,
      "end_line": 324,
      "comment": "\n * Implements the \u003ca href\u003d\"http://www.archive.chipcenter.com/dsp/DSP000517F1.html\"\u003eFast Hadamard Transform\u003c/a\u003e (FHT).\n * Transformation of an input vector x to the output vector y.\n * \u003cp\u003e\n * In addition to transformation of real vectors, the Hadamard transform can\n * transform integer vectors into integer vectors. However, this integer transform\n * cannot be inverted directly. Due to a scaling factor it may lead to rational results.\n * As an example, the inverse transform of integer vector (0, 1, 0, 1) is rational\n * vector (1/2, -1/2, 0, 0).\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastHadamardTransformer.transform(double[], org.apache.commons.math3.transform.TransformType)",
      "begin_line": 51,
      "end_line": 56,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws MathIllegalArgumentException if the length of the data array is\n     * not a power of two\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 55,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastHadamardTransformer.transform(org.apache.commons.math3.analysis.UnivariateFunction, double, double, int, org.apache.commons.math3.transform.TransformType)",
      "begin_line": 67,
      "end_line": 72,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws org.apache.commons.math3.exception.NonMonotonicSequenceException\n     *   if the lower bound is greater than, or equal to the upper bound\n     * @throws org.apache.commons.math3.exception.NotStrictlyPositiveException\n     *   if the number of sample points is negative\n     * @throws MathIllegalArgumentException if the number of sample points is not a power of two\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastHadamardTransformer.transform(int[])",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Returns the forward transform of the specified integer data set.The\n     * integer transform cannot be inverted directly, due to a scaling factor\n     * which may lead to double results.\n     *\n     * @param f the integer data array to be transformed (signal)\n     * @return the integer transformed array (spectrum)\n     * @throws MathIllegalArgumentException if the length of the data array is not a power of two\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastHadamardTransformer.fht(double[])",
      "begin_line": 229,
      "end_line": 270,
      "comment": "\n     * The FHT (Fast Hadamard Transformation) which uses only subtraction and\n     * addition. Requires {@code N * log2(N) \u003d n * 2^n} additions.\n     *\n     * \u003ch3\u003eShort Table of manual calculation for N\u003d8\u003c/h3\u003e\n     * \u003col\u003e\n     * \u003cli\u003e\u003cb\u003ex\u003c/b\u003e is the input vector to be transformed,\u003c/li\u003e\n     * \u003cli\u003e\u003cb\u003ey\u003c/b\u003e is the output vector (Fast Hadamard transform of \u003cb\u003ex\u003c/b\u003e),\u003c/li\u003e\n     * \u003cli\u003ea and b are helper rows.\u003c/li\u003e\n     * \u003c/ol\u003e\n     * \u003ctable align\u003d\"center\" border\u003d\"1\" cellpadding\u003d\"3\"\u003e\n     * \u003ctbody align\u003d\"center\"\u003e\n     * \u003ctr\u003e\n     *     \u003cth\u003ex\u003c/th\u003e\n     *     \u003cth\u003ea\u003c/th\u003e\n     *     \u003cth\u003eb\u003c/th\u003e\n     *     \u003cth\u003ey\u003c/th\u003e\n     * \u003c/tr\u003e\n     * \u003ctr\u003e\n     *     \u003cth\u003ex\u003csub\u003e0\u003c/sub\u003e\u003c/th\u003e\n     *     \u003ctd\u003ea\u003csub\u003e0\u003c/sub\u003e \u003d x\u003csub\u003e0\u003c/sub\u003e + x\u003csub\u003e1\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003eb\u003csub\u003e0\u003c/sub\u003e \u003d a\u003csub\u003e0\u003c/sub\u003e + a\u003csub\u003e1\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003ey\u003csub\u003e0\u003c/sub\u003e \u003d b\u003csub\u003e0\u003c/sub \u003e+ b\u003csub\u003e1\u003c/sub\u003e\u003c/td\u003e\n     * \u003c/tr\u003e\n     * \u003ctr\u003e\n     *     \u003cth\u003ex\u003csub\u003e1\u003c/sub\u003e\u003c/th\u003e\n     *     \u003ctd\u003ea\u003csub\u003e1\u003c/sub\u003e \u003d x\u003csub\u003e2\u003c/sub\u003e + x\u003csub\u003e3\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003eb\u003csub\u003e0\u003c/sub\u003e \u003d a\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003ey\u003csub\u003e0\u003c/sub\u003e \u003d b\u003csub\u003e2\u003c/sub\u003e + b\u003csub\u003e3\u003c/sub\u003e\u003c/td\u003e\n     * \u003c/tr\u003e\n     * \u003ctr\u003e\n     *     \u003cth\u003ex\u003csub\u003e2\u003c/sub\u003e\u003c/th\u003e\n     *     \u003ctd\u003ea\u003csub\u003e2\u003c/sub\u003e \u003d x\u003csub\u003e4\u003c/sub\u003e + x\u003csub\u003e5\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003eb\u003csub\u003e0\u003c/sub\u003e \u003d a\u003csub\u003e4\u003c/sub\u003e + a\u003csub\u003e5\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003ey\u003csub\u003e0\u003c/sub\u003e \u003d b\u003csub\u003e4\u003c/sub\u003e + b\u003csub\u003e5\u003c/sub\u003e\u003c/td\u003e\n     * \u003c/tr\u003e\n     * \u003ctr\u003e\n     *     \u003cth\u003ex\u003csub\u003e3\u003c/sub\u003e\u003c/th\u003e\n     *     \u003ctd\u003ea\u003csub\u003e3\u003c/sub\u003e \u003d x\u003csub\u003e6\u003c/sub\u003e + x\u003csub\u003e7\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003eb\u003csub\u003e0\u003c/sub\u003e \u003d a\u003csub\u003e6\u003c/sub\u003e + a\u003csub\u003e7\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003ey\u003csub\u003e0\u003c/sub\u003e \u003d b\u003csub\u003e6\u003c/sub\u003e + b\u003csub\u003e7\u003c/sub\u003e\u003c/td\u003e\n     * \u003c/tr\u003e\n     * \u003ctr\u003e\n     *     \u003cth\u003ex\u003csub\u003e4\u003c/sub\u003e\u003c/th\u003e\n     *     \u003ctd\u003ea\u003csub\u003e0\u003c/sub\u003e \u003d x\u003csub\u003e0\u003c/sub\u003e - x\u003csub\u003e1\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003eb\u003csub\u003e0\u003c/sub\u003e \u003d a\u003csub\u003e0\u003c/sub\u003e - a\u003csub\u003e1\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003ey\u003csub\u003e0\u003c/sub\u003e \u003d b\u003csub\u003e0\u003c/sub\u003e - b\u003csub\u003e1\u003c/sub\u003e\u003c/td\u003e\n     * \u003c/tr\u003e\n     * \u003ctr\u003e\n     *     \u003cth\u003ex\u003csub\u003e5\u003c/sub\u003e\u003c/th\u003e\n     *     \u003ctd\u003ea\u003csub\u003e1\u003c/sub\u003e \u003d x\u003csub\u003e2\u003c/sub\u003e - x\u003csub\u003e3\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003eb\u003csub\u003e0\u003c/sub\u003e \u003d a\u003csub\u003e2\u003c/sub\u003e - a\u003csub\u003e3\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003ey\u003csub\u003e0\u003c/sub\u003e \u003d b\u003csub\u003e2\u003c/sub\u003e - b\u003csub\u003e3\u003c/sub\u003e\u003c/td\u003e\n     * \u003c/tr\u003e\n     * \u003ctr\u003e\n     *     \u003cth\u003ex\u003csub\u003e6\u003c/sub\u003e\u003c/th\u003e\n     *     \u003ctd\u003ea\u003csub\u003e2\u003c/sub\u003e \u003d x\u003csub\u003e4\u003c/sub\u003e - x\u003csub\u003e5\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003eb\u003csub\u003e0\u003c/sub\u003e \u003d a\u003csub\u003e4\u003c/sub\u003e - a\u003csub\u003e5\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003ey\u003csub\u003e0\u003c/sub\u003e \u003d b\u003csub\u003e4\u003c/sub\u003e - b\u003csub\u003e5\u003c/sub\u003e\u003c/td\u003e\n     * \u003c/tr\u003e\n     * \u003ctr\u003e\n     *     \u003cth\u003ex\u003csub\u003e7\u003c/sub\u003e\u003c/th\u003e\n     *     \u003ctd\u003ea\u003csub\u003e3\u003c/sub\u003e \u003d x\u003csub\u003e6\u003c/sub\u003e - x\u003csub\u003e7\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003eb\u003csub\u003e0\u003c/sub\u003e \u003d a\u003csub\u003e6\u003c/sub\u003e - a\u003csub\u003e7\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd\u003ey\u003csub\u003e0\u003c/sub\u003e \u003d b\u003csub\u003e6\u003c/sub\u003e - b\u003csub\u003e7\u003c/sub\u003e\u003c/td\u003e\n     * \u003c/tr\u003e\n     * \u003c/tbody\u003e\n     * \u003c/table\u003e\n     *\n     * \u003ch3\u003eHow it works\u003c/h3\u003e\n     * \u003col\u003e\n     * \u003cli\u003eConstruct a matrix with {@code N} rows and {@code n + 1} columns,\n     * {@code hadm[n+1][N]}.\u003cbr/\u003e\n     * \u003cem\u003e(If I use [x][y] it always means [row-offset][column-offset] of a\n     * Matrix with n rows and m columns. Its entries go from M[0][0]\n     * to M[n][N])\u003c/em\u003e\u003c/li\u003e\n     * \u003cli\u003ePlace the input vector {@code x[N]} in the first column of the\n     * matrix {@code hadm}.\u003c/li\u003e\n     * \u003cli\u003eThe entries of the submatrix {@code D_top} are calculated as follows\n     *     \u003cul\u003e\n     *         \u003cli\u003e{@code D_top} goes from entry {@code [0][1]} to\n     *         {@code [N / 2 - 1][n + 1]},\u003c/li\u003e\n     *         \u003cli\u003ethe columns of {@code D_top} are the pairwise mutually\n     *         exclusive sums of the previous column.\u003c/li\u003e\n     *     \u003c/ul\u003e\n     * \u003c/li\u003e\n     * \u003cli\u003eThe entries of the submatrix {@code D_bottom} are calculated as\n     * follows\n     *     \u003cul\u003e\n     *         \u003cli\u003e{@code D_bottom} goes from entry {@code [N / 2][1]} to\n     *         {@code [N][n + 1]},\u003c/li\u003e\n     *         \u003cli\u003ethe columns of {@code D_bottom} are the pairwise differences\n     *         of the previous column.\u003c/li\u003e\n     *     \u003c/ul\u003e\n     * \u003c/li\u003e\n     * \u003cli\u003eThe consputation of {@code D_top} and {@code D_bottom} are best\n     * understood with the above example (for {@code N \u003d 8}).\n     * \u003cli\u003eThe output vector {@code y} is now in the last column of\n     * {@code hadm}.\u003c/li\u003e\n     * \u003cli\u003e\u003cem\u003eAlgorithm from \u003ca href\u003d\"http://www.archive.chipcenter.com/dsp/DSP000517F1.html\"\u003echipcenter\u003c/a\u003e.\u003c/em\u003e\u003c/li\u003e\n     * \u003c/ol\u003e\n     * \u003ch3\u003eVisually\u003c/h3\u003e\n     * \u003ctable border\u003d\"1\" align\u003d\"center\" cellpadding\u003d\"3\"\u003e\n     * \u003ctbody align\u003d\"center\"\u003e\n     * \u003ctr\u003e\n     *     \u003ctd\u003e\u003c/td\u003e\u003cth\u003e0\u003c/th\u003e\u003cth\u003e1\u003c/th\u003e\u003cth\u003e2\u003c/th\u003e\u003cth\u003e3\u003c/th\u003e\n     *     \u003cth\u003e\u0026hellip;\u003c/th\u003e\n     *     \u003cth\u003en + 1\u003c/th\u003e\n     * \u003c/tr\u003e\n     * \u003ctr\u003e\n     *     \u003cth\u003e0\u003c/th\u003e\n     *     \u003ctd\u003ex\u003csub\u003e0\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd colspan\u003d\"5\" rowspan\u003d\"5\" align\u003d\"center\" valign\u003d\"middle\"\u003e\n     *         \u0026uarr;\u003cbr/\u003e\n     *         \u0026larr; D\u003csub\u003etop\u003c/sub\u003e \u0026rarr;\u003cbr/\u003e\n     *         \u0026darr;\n     *     \u003c/td\u003e\n     * \u003c/tr\u003e\n     * \u003ctr\u003e\u003cth\u003e1\u003c/th\u003e\u003ctd\u003ex\u003csub\u003e1\u003c/sub\u003e\u003c/td\u003e\u003c/tr\u003e\n     * \u003ctr\u003e\u003cth\u003e2\u003c/th\u003e\u003ctd\u003ex\u003csub\u003e2\u003c/sub\u003e\u003c/td\u003e\u003c/tr\u003e\n     * \u003ctr\u003e\u003cth\u003e\u0026hellip;\u003c/th\u003e\u003ctd\u003e\u0026hellip;\u003c/td\u003e\u003c/tr\u003e\n     * \u003ctr\u003e\u003cth\u003eN / 2 - 1\u003c/th\u003e\u003ctd\u003ex\u003csub\u003eN/2-1\u003c/sub\u003e\u003c/td\u003e\u003c/tr\u003e\n     * \u003ctr\u003e\n     *     \u003cth\u003eN / 2\u003c/th\u003e\n     *     \u003ctd\u003ex\u003csub\u003eN/2\u003c/sub\u003e\u003c/td\u003e\n     *     \u003ctd colspan\u003d\"5\" rowspan\u003d\"5\" align\u003d\"center\" valign\u003d\"middle\"\u003e\n     *         \u0026uarr;\u003cbr/\u003e\n     *         \u0026larr; D\u003csub\u003ebottom\u003c/sub\u003e \u0026rarr;\u003cbr/\u003e\n     *         \u0026darr;\n     *     \u003c/td\u003e\n     * \u003c/tr\u003e\n     * \u003ctr\u003e\u003cth\u003eN / 2 + 1\u003c/th\u003e\u003ctd\u003ex\u003csub\u003eN/2+1\u003c/sub\u003e\u003c/td\u003e\u003c/tr\u003e\n     * \u003ctr\u003e\u003cth\u003eN / 2 + 2\u003c/th\u003e\u003ctd\u003ex\u003csub\u003eN/2+2\u003c/sub\u003e\u003c/td\u003e\u003c/tr\u003e\n     * \u003ctr\u003e\u003cth\u003e\u0026hellip;\u003c/th\u003e\u003ctd\u003e\u0026hellip;\u003c/td\u003e\u003c/tr\u003e\n     * \u003ctr\u003e\u003cth\u003eN\u003c/th\u003e\u003ctd\u003ex\u003csub\u003eN\u003c/sub\u003e\u003c/td\u003e\u003c/tr\u003e\n     * \u003c/tbody\u003e\n     * \u003c/table\u003e\n     *\n     * @param x the real data array to be transformed\n     * @return the real transformed array, {@code y}\n     * @throws MathIllegalArgumentException if the length of the data array is not a power of two\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 35)",
        "(line 232,col 9)-(line 232,col 32)",
        "(line 234,col 9)-(line 238,col 9)",
        "(line 244,col 9)-(line 244,col 43)",
        "(line 245,col 9)-(line 245,col 39)",
        "(line 248,col 9)-(line 266,col 9)",
        "(line 268,col 9)-(line 268,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastHadamardTransformer.fht(int[])",
      "begin_line": 280,
      "end_line": 322,
      "comment": "\n     * Returns the forward transform of the specified integer data set. The FHT\n     * (Fast Hadamard Transform) uses only subtraction and addition.\n     *\n     * @param x the integer data array to be transformed\n     * @return the integer transformed array, {@code y}\n     * @throws MathIllegalArgumentException if the length of the data array is not a power of two\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 35)",
        "(line 283,col 9)-(line 283,col 32)",
        "(line 285,col 9)-(line 289,col 9)",
        "(line 295,col 9)-(line 295,col 37)",
        "(line 296,col 9)-(line 296,col 36)",
        "(line 299,col 9)-(line 317,col 9)",
        "(line 320,col 9)-(line 320,col 24)"
      ]
    }
  ]
}