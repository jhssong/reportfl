{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/transform/FastCosineTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastCosineTransformer",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 38,
      "end_line": 260,
      "comment": "\n * Implements the \u003ca href\u003d\"http://documents.wolfram.com/v5/Add-onsLinks/\n * StandardPackages/LinearAlgebra/FourierTrig.html\"\u003eFast Cosine Transform\u003c/a\u003e\n * for transformation of one-dimensional data sets. For reference, see\n * \u003cb\u003eFast Fourier Transforms\u003c/b\u003e, ISBN 0849371635, chapter 3.\n * \u003cp\u003e\n * FCT is its own inverse, up to a multiplier depending on conventions.\n * The equations are listed in the comments of the corresponding methods.\n * \u003cp\u003e\n * Different from FFT and FST, FCT requires the length of data set to be\n * power of 2 plus one. Users should especially pay attention to the\n * function transformation on how this affects the sampling.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.FastCosineTransformer()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Construct a default transformer.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.transform(double[])",
      "begin_line": 61,
      "end_line": 65,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ F_n \u003d (1/2) [f_0 + (-1)^n f_N] +\n     *                        \\Sigma_{k\u003d0}^{N-1} f_k \\cos(\\pi nk/N) $\n     *\n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.transform(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 81,
      "end_line": 87,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ F_n \u003d (1/2) [f_0 + (-1)^n f_N] +\n     *                        \\Sigma_{k\u003d0}^{N-1} f_k \\cos(\\pi nk/N) $\n     *\n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 70)",
        "(line 86,col 9)-(line 86,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.transform2(double[])",
      "begin_line": 100,
      "end_line": 105,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ F_n \u003d \\sqrt{1/2N} [f_0 + (-1)^n f_N] +\n     *                        \\sqrt{2/N} \\Sigma_{k\u003d0}^{N-1} f_k \\cos(\\pi nk/N) $\n     *\n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 67)",
        "(line 104,col 9)-(line 104,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.transform2(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 121,
      "end_line": 128,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ F_n \u003d \\sqrt{1/2N} [f_0 + (-1)^n f_N] +\n     *                        \\sqrt{2/N} \\Sigma_{k\u003d0}^{N-1} f_k \\cos(\\pi nk/N) $\n     *\n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 70)",
        "(line 126,col 9)-(line 126,col 60)",
        "(line 127,col 9)-(line 127,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.inversetransform(double[])",
      "begin_line": 141,
      "end_line": 146,
      "comment": "\n     * Inversely transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ f_k \u003d (1/N) [F_0 + (-1)^k F_N] +\n     *                        (2/N) \\Sigma_{n\u003d0}^{N-1} F_n \\cos(\\pi nk/N) $\n     *\n     * @param f the real data array to be inversely transformed\n     * @return the real inversely transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 58)",
        "(line 145,col 9)-(line 145,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.inversetransform(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 162,
      "end_line": 169,
      "comment": "\n     * Inversely transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ f_k \u003d (1/N) [F_0 + (-1)^k F_N] +\n     *                        (2/N) \\Sigma_{n\u003d0}^{N-1} F_n \\cos(\\pi nk/N) $\n     *\n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real inversely transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 70)",
        "(line 167,col 9)-(line 167,col 51)",
        "(line 168,col 9)-(line 168,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.inversetransform2(double[])",
      "begin_line": 182,
      "end_line": 186,
      "comment": "\n     * Inversely transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ f_k \u003d \\sqrt{1/2N} [F_0 + (-1)^k F_N] +\n     *                        \\sqrt{2/N} \\Sigma_{n\u003d0}^{N-1} F_n \\cos(\\pi nk/N) $\n     *\n     * @param f the real data array to be inversely transformed\n     * @return the real inversely transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.inversetransform2(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 202,
      "end_line": 207,
      "comment": "\n     * Inversely transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ f_k \u003d \\sqrt{1/2N} [F_0 + (-1)^k F_N] +\n     *                        \\sqrt{2/N} \\Sigma_{n\u003d0}^{N-1} F_n \\cos(\\pi nk/N) $\n     *\n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real inversely transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.fct(double[])",
      "begin_line": 217,
      "end_line": 259,
      "comment": "\n     * Perform the FCT algorithm (including inverse).\n     *\n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 60)",
        "(line 222,col 9)-(line 222,col 29)",
        "(line 223,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 231,col 9)",
        "(line 234,col 9)-(line 234,col 26)",
        "(line 235,col 9)-(line 235,col 35)",
        "(line 236,col 9)-(line 236,col 30)",
        "(line 237,col 9)-(line 237,col 33)",
        "(line 238,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 246,col 74)",
        "(line 247,col 9)-(line 247,col 47)",
        "(line 250,col 9)-(line 250,col 30)",
        "(line 251,col 9)-(line 251,col 18)",
        "(line 252,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 256,col 35)",
        "(line 258,col 9)-(line 258,col 17)"
      ]
    }
  ]
}