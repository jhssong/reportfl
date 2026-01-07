{
  "filepath": "/tmp/Math-104b/src/java/org/apache/commons/math/transform/FastCosineTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastCosineTransformer",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 39,
      "end_line": 261,
      "comment": "\n * Implements the \u003ca href\u003d\"http://documents.wolfram.com/v5/Add-onsLinks/\n * StandardPackages/LinearAlgebra/FourierTrig.html\"\u003eFast Cosine Transform\u003c/a\u003e\n * for transformation of one-dimensional data sets. For reference, see\n * \u003cb\u003eFast Fourier Transforms\u003c/b\u003e, ISBN 0849371635, chapter 3.\n * \u003cp\u003e\n * FCT is its own inverse, up to a multiplier depending on conventions.\n * The equations are listed in the comments of the corresponding methods.\n * \u003cp\u003e\n * Different from FFT and FST, FCT requires the length of data set to be\n * power of 2 plus one. Users should especially pay attention to the\n * function transformation on how this affects the sampling.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.FastCosineTransformer()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Construct a default transformer.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.transform(double[])",
      "begin_line": 62,
      "end_line": 66,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ F_n \u003d (1/2) [f_0 + (-1)^n f_N] +\n     *                        \\Sigma_{k\u003d0}^{N-1} f_k \\cos(\\pi nk/N) $\n     *\n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.transform(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 82,
      "end_line": 88,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ F_n \u003d (1/2) [f_0 + (-1)^n f_N] +\n     *                        \\Sigma_{k\u003d0}^{N-1} f_k \\cos(\\pi nk/N) $\n     *\n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 70)",
        "(line 87,col 9)-(line 87,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.transform2(double[])",
      "begin_line": 101,
      "end_line": 106,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ F_n \u003d \\sqrt{1/2N} [f_0 + (-1)^n f_N] +\n     *                        \\sqrt{2/N} \\Sigma_{k\u003d0}^{N-1} f_k \\cos(\\pi nk/N) $\n     *\n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 67)",
        "(line 105,col 9)-(line 105,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.transform2(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 122,
      "end_line": 129,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ F_n \u003d \\sqrt{1/2N} [f_0 + (-1)^n f_N] +\n     *                        \\sqrt{2/N} \\Sigma_{k\u003d0}^{N-1} f_k \\cos(\\pi nk/N) $\n     *\n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 70)",
        "(line 127,col 9)-(line 127,col 60)",
        "(line 128,col 9)-(line 128,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.inversetransform(double[])",
      "begin_line": 142,
      "end_line": 147,
      "comment": "\n     * Inversely transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ f_k \u003d (1/N) [F_0 + (-1)^k F_N] +\n     *                        (2/N) \\Sigma_{n\u003d0}^{N-1} F_n \\cos(\\pi nk/N) $\n     *\n     * @param f the real data array to be inversely transformed\n     * @return the real inversely transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 58)",
        "(line 146,col 9)-(line 146,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.inversetransform(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 163,
      "end_line": 170,
      "comment": "\n     * Inversely transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ f_k \u003d (1/N) [F_0 + (-1)^k F_N] +\n     *                        (2/N) \\Sigma_{n\u003d0}^{N-1} F_n \\cos(\\pi nk/N) $\n     *\n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real inversely transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 70)",
        "(line 168,col 9)-(line 168,col 51)",
        "(line 169,col 9)-(line 169,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.inversetransform2(double[])",
      "begin_line": 183,
      "end_line": 187,
      "comment": "\n     * Inversely transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ f_k \u003d \\sqrt{1/2N} [F_0 + (-1)^k F_N] +\n     *                        \\sqrt{2/N} \\Sigma_{n\u003d0}^{N-1} F_n \\cos(\\pi nk/N) $\n     *\n     * @param f the real data array to be inversely transformed\n     * @return the real inversely transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.inversetransform2(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 203,
      "end_line": 208,
      "comment": "\n     * Inversely transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ f_k \u003d \\sqrt{1/2N} [F_0 + (-1)^k F_N] +\n     *                        \\sqrt{2/N} \\Sigma_{n\u003d0}^{N-1} F_n \\cos(\\pi nk/N) $\n     *\n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real inversely transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastCosineTransformer.fct(double[])",
      "begin_line": 218,
      "end_line": 260,
      "comment": "\n     * Perform the FCT algorithm (including inverse).\n     *\n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 60)",
        "(line 223,col 9)-(line 223,col 29)",
        "(line 224,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 232,col 9)",
        "(line 235,col 9)-(line 235,col 26)",
        "(line 236,col 9)-(line 236,col 35)",
        "(line 237,col 9)-(line 237,col 30)",
        "(line 238,col 9)-(line 238,col 33)",
        "(line 239,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 247,col 74)",
        "(line 248,col 9)-(line 248,col 47)",
        "(line 251,col 9)-(line 251,col 30)",
        "(line 252,col 9)-(line 252,col 18)",
        "(line 253,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 35)",
        "(line 259,col 9)-(line 259,col 17)"
      ]
    }
  ]
}