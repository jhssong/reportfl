{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/transform/FastSineTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastSineTransformer",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 38,
      "end_line": 251,
      "comment": "\n * Implements the \u003ca href\u003d\"http://documents.wolfram.com/v5/Add-onsLinks/\n * StandardPackages/LinearAlgebra/FourierTrig.html\"\u003eFast Sine Transform\u003c/a\u003e\n * for transformation of one-dimensional data sets. For reference, see\n * \u003cb\u003eFast Fourier Transforms\u003c/b\u003e, ISBN 0849371635, chapter 3.\n * \u003cp\u003e\n * FST is its own inverse, up to a multiplier depending on conventions.\n * The equations are listed in the comments of the corresponding methods.\n * \u003cp\u003e\n * Similar to FFT, we also require the length of data set to be power of 2.\n * In addition, the first element must be 0 and it\u0027s enforced in function\n * transformation after sampling.\n *\n * @version $Revision$ $Date$\n "
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
      "signature": "org.apache.commons.math.transform.FastSineTransformer.FastSineTransformer()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Construct a default transformer.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.transform(double[])",
      "begin_line": 60,
      "end_line": 64,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ F_n \u003d \\Sigma_{k\u003d0}^{N-1} f_k \\sin(\\pi nk/N) $\n     *\n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.transform(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 79,
      "end_line": 86,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ F_n \u003d \\Sigma_{k\u003d0}^{N-1} f_k \\sin(\\pi nk/N) $\n     *\n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 70)",
        "(line 84,col 9)-(line 84,col 22)",
        "(line 85,col 9)-(line 85,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.transform2(double[])",
      "begin_line": 98,
      "end_line": 103,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ F_n \u003d \\sqrt{2/N} \\Sigma_{k\u003d0}^{N-1} f_k \\sin(\\pi nk/N) $\n     *\n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 63)",
        "(line 102,col 9)-(line 102,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.transform2(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 118,
      "end_line": 126,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ F_n \u003d \\sqrt{2/N} \\Sigma_{k\u003d0}^{N-1} f_k \\sin(\\pi nk/N) $\n     *\n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 70)",
        "(line 123,col 9)-(line 123,col 22)",
        "(line 124,col 9)-(line 124,col 56)",
        "(line 125,col 9)-(line 125,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.inversetransform(double[])",
      "begin_line": 138,
      "end_line": 143,
      "comment": "\n     * Inversely transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ f_k \u003d (2/N) \\Sigma_{n\u003d0}^{N-1} F_n \\sin(\\pi nk/N) $\n     *\n     * @param f the real data array to be inversely transformed\n     * @return the real inversely transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 52)",
        "(line 142,col 9)-(line 142,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.inversetransform(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 158,
      "end_line": 166,
      "comment": "\n     * Inversely transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ f_k \u003d (2/N) \\Sigma_{n\u003d0}^{N-1} F_n \\sin(\\pi nk/N) $\n     *\n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real inversely transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 70)",
        "(line 163,col 9)-(line 163,col 22)",
        "(line 164,col 9)-(line 164,col 45)",
        "(line 165,col 9)-(line 165,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.inversetransform2(double[])",
      "begin_line": 178,
      "end_line": 182,
      "comment": "\n     * Inversely transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ f_k \u003d \\sqrt{2/N} \\Sigma_{n\u003d0}^{N-1} F_n \\sin(\\pi nk/N) $\n     *\n     * @param f the real data array to be inversely transformed\n     * @return the real inversely transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.inversetransform2(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 197,
      "end_line": 202,
      "comment": "\n     * Inversely transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ f_k \u003d \\sqrt{2/N} \\Sigma_{n\u003d0}^{N-1} F_n \\sin(\\pi nk/N) $\n     *\n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real inversely transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.fst(double[])",
      "begin_line": 212,
      "end_line": 250,
      "comment": "\n     * Perform the FST algorithm (including inverse).\n     *\n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 53)",
        "(line 217,col 9)-(line 217,col 48)",
        "(line 218,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 25)",
        "(line 223,col 9)-(line 226,col 9)",
        "(line 229,col 9)-(line 229,col 26)",
        "(line 230,col 9)-(line 230,col 19)",
        "(line 231,col 9)-(line 231,col 36)",
        "(line 232,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 74)",
        "(line 239,col 9)-(line 239,col 47)",
        "(line 242,col 9)-(line 242,col 19)",
        "(line 243,col 9)-(line 243,col 36)",
        "(line 244,col 9)-(line 247,col 9)",
        "(line 249,col 9)-(line 249,col 17)"
      ]
    }
  ]
}