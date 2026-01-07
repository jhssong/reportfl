{
  "filepath": "/tmp/Math-95b/src/java/org/apache/commons/math/transform/FastCosineTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastCosineTransformer",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 40,
      "end_line": 271,
      "comment": "\n * Implements the \u003ca href\u003d\"http://documents.wolfram.com/v5/Add-onsLinks/\n * StandardPackages/LinearAlgebra/FourierTrig.html\"\u003eFast Cosine Transform\u003c/a\u003e\n * for transformation of one-dimensional data sets. For reference, see\n * \u003cb\u003eFast Fourier Transforms\u003c/b\u003e, ISBN 0849371635, chapter 3.\n * \u003cp\u003e\n * FCT is its own inverse, up to a multiplier depending on conventions.\n * The equations are listed in the comments of the corresponding methods.\u003c/p\u003e\n * \u003cp\u003e\n * Different from FFT and FST, FCT requires the length of data set to be\n * power of 2 plus one. Users should especially pay attention to the\n * function transformation on how this affects the sampling.\u003c/p\u003e\n *\n * @version $Revision:670469 $ $Date:2008-06-23 10:01:38 +0200 (lun., 23 juin 2008) $\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.FastCosineTransformer()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Construct a default transformer.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.transform(double[])",
      "begin_line": 64,
      "end_line": 68,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ F_n \u003d (1/2) [f_0 + (-1)^n f_N] +\n     *                        \\Sigma_{k\u003d1}^{N-1} f_k \\cos(\\pi nk/N) $\n     * \u003c/p\u003e\n     * \n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.transform(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 85,
      "end_line": 91,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ F_n \u003d (1/2) [f_0 + (-1)^n f_N] +\n     *                        \\Sigma_{k\u003d1}^{N-1} f_k \\cos(\\pi nk/N) $\n     * \u003c/p\u003e\n     * \n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 70)",
        "(line 90,col 9)-(line 90,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.transform2(double[])",
      "begin_line": 105,
      "end_line": 110,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ F_n \u003d \\sqrt{1/2N} [f_0 + (-1)^n f_N] +\n     *                        \\sqrt{2/N} \\Sigma_{k\u003d1}^{N-1} f_k \\cos(\\pi nk/N) $\n     * \u003c/p\u003e\n     * \n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 67)",
        "(line 109,col 9)-(line 109,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.transform2(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 128,
      "end_line": 135,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ F_n \u003d \\sqrt{1/2N} [f_0 + (-1)^n f_N] +\n     *                        \\sqrt{2/N} \\Sigma_{k\u003d1}^{N-1} f_k \\cos(\\pi nk/N) $\n     *\n     * \u003c/p\u003e\n     * \n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 70)",
        "(line 133,col 9)-(line 133,col 60)",
        "(line 134,col 9)-(line 134,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.inversetransform(double[])",
      "begin_line": 149,
      "end_line": 154,
      "comment": "\n     * Inversely transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ f_k \u003d (1/N) [F_0 + (-1)^k F_N] +\n     *                        (2/N) \\Sigma_{n\u003d1}^{N-1} F_n \\cos(\\pi nk/N) $\n     * \u003c/p\u003e\n     * \n     * @param f the real data array to be inversely transformed\n     * @return the real inversely transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 58)",
        "(line 153,col 9)-(line 153,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.inversetransform(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 171,
      "end_line": 178,
      "comment": "\n     * Inversely transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ f_k \u003d (1/N) [F_0 + (-1)^k F_N] +\n     *                        (2/N) \\Sigma_{n\u003d1}^{N-1} F_n \\cos(\\pi nk/N) $\n     * \u003c/p\u003e\n     * \n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real inversely transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 70)",
        "(line 176,col 9)-(line 176,col 51)",
        "(line 177,col 9)-(line 177,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.inversetransform2(double[])",
      "begin_line": 192,
      "end_line": 196,
      "comment": "\n     * Inversely transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ f_k \u003d \\sqrt{1/2N} [F_0 + (-1)^k F_N] +\n     *                        \\sqrt{2/N} \\Sigma_{n\u003d1}^{N-1} F_n \\cos(\\pi nk/N) $\n     * \u003c/p\u003e\n     * \n     * @param f the real data array to be inversely transformed\n     * @return the real inversely transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.inversetransform2(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 213,
      "end_line": 218,
      "comment": "\n     * Inversely transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ f_k \u003d \\sqrt{1/2N} [F_0 + (-1)^k F_N] +\n     *                        \\sqrt{2/N} \\Sigma_{n\u003d1}^{N-1} F_n \\cos(\\pi nk/N) $\n     * \u003c/p\u003e\n     * \n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real inversely transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.fct(double[])",
      "begin_line": 228,
      "end_line": 270,
      "comment": "\n     * Perform the FCT algorithm (including inverse).\n     *\n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 60)",
        "(line 233,col 9)-(line 233,col 29)",
        "(line 234,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 242,col 9)",
        "(line 245,col 9)-(line 245,col 26)",
        "(line 246,col 9)-(line 246,col 35)",
        "(line 247,col 9)-(line 247,col 30)",
        "(line 248,col 9)-(line 248,col 33)",
        "(line 249,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 74)",
        "(line 258,col 9)-(line 258,col 47)",
        "(line 261,col 9)-(line 261,col 30)",
        "(line 262,col 9)-(line 262,col 18)",
        "(line 263,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 267,col 35)",
        "(line 269,col 9)-(line 269,col 17)"
      ]
    }
  ]
}