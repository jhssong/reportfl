{
  "filepath": "/tmp/Math-95b/src/java/org/apache/commons/math/transform/FastSineTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastSineTransformer",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 40,
      "end_line": 261,
      "comment": "\n * Implements the \u003ca href\u003d\"http://documents.wolfram.com/v5/Add-onsLinks/\n * StandardPackages/LinearAlgebra/FourierTrig.html\"\u003eFast Sine Transform\u003c/a\u003e\n * for transformation of one-dimensional data sets. For reference, see\n * \u003cb\u003eFast Fourier Transforms\u003c/b\u003e, ISBN 0849371635, chapter 3.\n * \u003cp\u003e\n * FST is its own inverse, up to a multiplier depending on conventions.\n * The equations are listed in the comments of the corresponding methods.\u003c/p\u003e\n * \u003cp\u003e\n * Similar to FFT, we also require the length of data set to be power of 2.\n * In addition, the first element must be 0 and it\u0027s enforced in function\n * transformation after sampling.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
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
      "signature": "org.apache.commons.math.transform.FastSineTransformer.FastSineTransformer()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Construct a default transformer.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.transform(double[])",
      "begin_line": 63,
      "end_line": 67,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ F_n \u003d \\Sigma_{k\u003d0}^{N-1} f_k \\sin(\\pi nk/N) $\n     * \u003c/p\u003e\n     * \n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.transform(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 83,
      "end_line": 90,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ F_n \u003d \\Sigma_{k\u003d0}^{N-1} f_k \\sin(\\pi nk/N) $\n     * \u003c/p\u003e\n     * \n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 70)",
        "(line 88,col 9)-(line 88,col 22)",
        "(line 89,col 9)-(line 89,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.transform2(double[])",
      "begin_line": 103,
      "end_line": 108,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ F_n \u003d \\sqrt{2/N} \\Sigma_{k\u003d0}^{N-1} f_k \\sin(\\pi nk/N) $\n     * \u003c/p\u003e\n     * \n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 63)",
        "(line 107,col 9)-(line 107,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.transform2(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 124,
      "end_line": 132,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ F_n \u003d \\sqrt{2/N} \\Sigma_{k\u003d0}^{N-1} f_k \\sin(\\pi nk/N) $\n     * \u003c/p\u003e\n     * \n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 70)",
        "(line 129,col 9)-(line 129,col 22)",
        "(line 130,col 9)-(line 130,col 56)",
        "(line 131,col 9)-(line 131,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.inversetransform(double[])",
      "begin_line": 145,
      "end_line": 150,
      "comment": "\n     * Inversely transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ f_k \u003d (2/N) \\Sigma_{n\u003d0}^{N-1} F_n \\sin(\\pi nk/N) $\n     * \u003c/p\u003e\n     * \n     * @param f the real data array to be inversely transformed\n     * @return the real inversely transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 52)",
        "(line 149,col 9)-(line 149,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.inversetransform(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 166,
      "end_line": 174,
      "comment": "\n     * Inversely transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ f_k \u003d (2/N) \\Sigma_{n\u003d0}^{N-1} F_n \\sin(\\pi nk/N) $\n     * \u003c/p\u003e\n     * \n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real inversely transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 70)",
        "(line 171,col 9)-(line 171,col 22)",
        "(line 172,col 9)-(line 172,col 45)",
        "(line 173,col 9)-(line 173,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.inversetransform2(double[])",
      "begin_line": 187,
      "end_line": 191,
      "comment": "\n     * Inversely transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ f_k \u003d \\sqrt{2/N} \\Sigma_{n\u003d0}^{N-1} F_n \\sin(\\pi nk/N) $\n     * \u003c/p\u003e\n     * \n     * @param f the real data array to be inversely transformed\n     * @return the real inversely transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.inversetransform2(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 207,
      "end_line": 212,
      "comment": "\n     * Inversely transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ f_k \u003d \\sqrt{2/N} \\Sigma_{n\u003d0}^{N-1} F_n \\sin(\\pi nk/N) $\n     * \u003c/p\u003e\n     * \n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the real inversely transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastSineTransformer.fst(double[])",
      "begin_line": 222,
      "end_line": 260,
      "comment": "\n     * Perform the FST algorithm (including inverse).\n     *\n     * @param f the real data array to be transformed\n     * @return the real transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 53)",
        "(line 227,col 9)-(line 227,col 48)",
        "(line 228,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 25)",
        "(line 233,col 9)-(line 236,col 9)",
        "(line 239,col 9)-(line 239,col 26)",
        "(line 240,col 9)-(line 240,col 19)",
        "(line 241,col 9)-(line 241,col 36)",
        "(line 242,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 248,col 74)",
        "(line 249,col 9)-(line 249,col 47)",
        "(line 252,col 9)-(line 252,col 19)",
        "(line 253,col 9)-(line 253,col 36)",
        "(line 254,col 9)-(line 257,col 9)",
        "(line 259,col 9)-(line 259,col 17)"
      ]
    }
  ]
}