{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/transform/FastFourierTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastFourierTransformer",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 42,
      "end_line": 552,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/FastFourierTransform.html\"\u003e\n * Fast Fourier Transform\u003c/a\u003e for transformation of one-dimensional data sets.\n * For reference, see \u003cb\u003eApplied Numerical Linear Algebra\u003c/b\u003e, ISBN 0898713897,\n * chapter 6.\n * \u003cp\u003e\n * There are several conventions for the definition of FFT and inverse FFT,\n * mainly on different coefficient and exponent. Here the equations are listed\n * in the comments of the corresponding methods.\n * \u003cp\u003e\n * We require the length of data set to be power of 2, this greatly simplifies\n * and speeds up the code. Users can pad the data with zeros to meet this\n * requirement. There are other flavors of FFT, for reference, see S. Winograd,\n * \u003ci\u003eOn computing the discrete Fourier transform\u003c/i\u003e, Mathematics of Computation,\n * 32 (1978), 175 - 199.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "omega"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " array of the roots of unity "
    },
    {
      "type": "field",
      "varNames": [
        "omegaCount"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * |omegaCount| is the length of lasted computed omega[]. omegaCount\n     * is positive for forward transform and negative for inverse transform.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.FastFourierTransformer()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Construct a default transformer.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform(double[])",
      "begin_line": 73,
      "end_line": 77,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ y_n \u003d \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k $\n     *\n     * @param f the real data array to be transformed\n     * @return the complex transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 92,
      "end_line": 98,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ y_n \u003d \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k $\n     *\n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the complex transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 47)",
        "(line 97,col 9)-(line 97,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform(org.apache.commons.math.complex.Complex[])",
      "begin_line": 110,
      "end_line": 115,
      "comment": "\n     * Transform the given complex data set.\n     * \u003cp\u003e\n     * The formula is $ y_n \u003d \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k $\n     *\n     * @param f the complex data array to be transformed\n     * @return the complex transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 31)",
        "(line 114,col 9)-(line 114,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform2(double[])",
      "begin_line": 127,
      "end_line": 132,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $y_n \u003d (1/\\sqrt{N}) \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k$\n     *\n     * @param f the real data array to be transformed\n     * @return the complex transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 63)",
        "(line 131,col 9)-(line 131,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform2(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 147,
      "end_line": 154,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $y_n \u003d (1/\\sqrt{N}) \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k$\n     *\n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the complex transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 47)",
        "(line 152,col 9)-(line 152,col 56)",
        "(line 153,col 9)-(line 153,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform2(org.apache.commons.math.complex.Complex[])",
      "begin_line": 166,
      "end_line": 172,
      "comment": "\n     * Transform the given complex data set.\n     * \u003cp\u003e\n     * The formula is $y_n \u003d (1/\\sqrt{N}) \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k$\n     *\n     * @param f the complex data array to be transformed\n     * @return the complex transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 31)",
        "(line 170,col 9)-(line 170,col 63)",
        "(line 171,col 9)-(line 171,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inversetransform(double[])",
      "begin_line": 184,
      "end_line": 189,
      "comment": "\n     * Inversely transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ x_k \u003d (1/N) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n $\n     *\n     * @param f the real data array to be inversely transformed\n     * @return the complex inversely transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 52)",
        "(line 188,col 9)-(line 188,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inversetransform(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 204,
      "end_line": 211,
      "comment": "\n     * Inversely transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ x_k \u003d (1/N) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n $\n     *\n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the complex inversely transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 47)",
        "(line 209,col 9)-(line 209,col 45)",
        "(line 210,col 9)-(line 210,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inversetransform(org.apache.commons.math.complex.Complex[])",
      "begin_line": 223,
      "end_line": 229,
      "comment": "\n     * Inversely transform the given complex data set.\n     * \u003cp\u003e\n     * The formula is $ x_k \u003d (1/N) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n $\n     *\n     * @param f the complex data array to be inversely transformed\n     * @return the complex inversely transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 32)",
        "(line 227,col 9)-(line 227,col 52)",
        "(line 228,col 9)-(line 228,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inversetransform2(double[])",
      "begin_line": 241,
      "end_line": 246,
      "comment": "\n     * Inversely transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $x_k \u003d (1/\\sqrt{N}) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n$\n     *\n     * @param f the real data array to be inversely transformed\n     * @return the complex inversely transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 63)",
        "(line 245,col 9)-(line 245,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inversetransform2(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 261,
      "end_line": 268,
      "comment": "\n     * Inversely transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $x_k \u003d (1/\\sqrt{N}) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n$\n     *\n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the complex inversely transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 47)",
        "(line 266,col 9)-(line 266,col 56)",
        "(line 267,col 9)-(line 267,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inversetransform2(org.apache.commons.math.complex.Complex[])",
      "begin_line": 280,
      "end_line": 286,
      "comment": "\n     * Inversely transform the given complex data set.\n     * \u003cp\u003e\n     * The formula is $x_k \u003d (1/\\sqrt{N}) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n$\n     *\n     * @param f the complex data array to be inversely transformed\n     * @return the complex inversely transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 32)",
        "(line 284,col 9)-(line 284,col 63)",
        "(line 285,col 9)-(line 285,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.fft(double[], boolean)",
      "begin_line": 297,
      "end_line": 331,
      "comment": "\n     * Perform the base-4 Cooley-Tukey FFT algorithm (including inverse).\n     *\n     * @param f the real data array to be transformed\n     * @param isInverse the indicator of forward or inverse transform\n     * @return the complex transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 25)",
        "(line 301,col 9)-(line 301,col 44)",
        "(line 302,col 9)-(line 305,col 9)",
        "(line 309,col 9)-(line 309,col 30)",
        "(line 310,col 9)-(line 310,col 37)",
        "(line 311,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 314,col 41)",
        "(line 315,col 9)-(line 315,col 29)",
        "(line 318,col 9)-(line 318,col 45)",
        "(line 319,col 9)-(line 319,col 76)",
        "(line 320,col 9)-(line 320,col 76)",
        "(line 321,col 9)-(line 328,col 9)",
        "(line 330,col 9)-(line 330,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.fft(org.apache.commons.math.complex.Complex[])",
      "begin_line": 341,
      "end_line": 397,
      "comment": "\n     * Perform the base-4 Cooley-Tukey FFT algorithm (including inverse).\n     *\n     * @param data the complex data array to be transformed\n     * @return the complex transformed array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 40)",
        "(line 345,col 9)-(line 345,col 58)",
        "(line 348,col 9)-(line 348,col 28)",
        "(line 349,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 357,col 9)",
        "(line 360,col 9)-(line 360,col 14)",
        "(line 361,col 9)-(line 368,col 9)",
        "(line 371,col 9)-(line 383,col 9)",
        "(line 386,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 396,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.computeOmega(int)",
      "begin_line": 409,
      "end_line": 435,
      "comment": "\n     * Calculate the n-th roots of unity.\n     * \u003cp\u003e\n     * The computed omega[] \u003d { 1, w, w^2, ... w^(n-1) } where\n     * w \u003d exp(-2 \\pi i / n), i \u003d sqrt(-1). Note n is positive for\n     * forward transform and negative for inverse transform.\n     * \n     * @param n the integer passed in\n     * @throws IllegalArgumentException if n \u003d 0\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 413,col 9)",
        "(line 415,col 9)-(line 415,col 40)",
        "(line 416,col 9)-(line 422,col 9)",
        "(line 424,col 9)-(line 424,col 41)",
        "(line 425,col 9)-(line 425,col 37)",
        "(line 426,col 9)-(line 426,col 34)",
        "(line 427,col 9)-(line 427,col 34)",
        "(line 428,col 9)-(line 428,col 41)",
        "(line 429,col 9)-(line 433,col 9)",
        "(line 434,col 9)-(line 434,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.sample(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 453,
      "end_line": 468,
      "comment": "\n     * Sample the given univariate real function on the given interval.\n     * \u003cp\u003e\n     * The interval is divided equally into N sections and sample points\n     * are taken from min to max-(max-min)/N. Usually f(x) is periodic\n     * such that f(min) \u003d f(max) (note max is not sampled), but we don\u0027t\n     * require that.\n     *\n     * @param f the function to be sampled\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the samples array\n     * @throws MathException if any math-related errors occur\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 459,col 9)",
        "(line 460,col 9)-(line 460,col 33)",
        "(line 462,col 9)-(line 462,col 35)",
        "(line 463,col 9)-(line 463,col 35)",
        "(line 464,col 9)-(line 466,col 9)",
        "(line 467,col 9)-(line 467,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.scaleArray(double[], double)",
      "begin_line": 478,
      "end_line": 483,
      "comment": "\n     * Multiply every component in the given real array by the\n     * given real number. The change is made in place.\n     *\n     * @param f the real array to be scaled\n     * @param d the real scaling coefficient\n     * @return a reference to the scaled array\n     ",
      "child_ranges": [
        "(line 479,col 9)-(line 481,col 9)",
        "(line 482,col 9)-(line 482,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.scaleArray(org.apache.commons.math.complex.Complex[], double)",
      "begin_line": 493,
      "end_line": 498,
      "comment": "\n     * Multiply every component in the given complex array by the\n     * given real number. The change is made in place.\n     *\n     * @param f the complex array to be scaled\n     * @param d the real scaling coefficient\n     * @return a reference to the scaled array\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 496,col 9)",
        "(line 497,col 9)-(line 497,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.isPowerOf2(long)",
      "begin_line": 506,
      "end_line": 508,
      "comment": "\n     * Returns true if the argument is power of 2.\n     * \n     * @param n the number to test\n     * @return true if the argument is power of 2\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(double[])",
      "begin_line": 516,
      "end_line": 521,
      "comment": "\n     * Verifies that the data set has length of power of 2.\n     * \n     * @param d the data array\n     * @throws IllegalArgumentException if array length is not power of 2\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 520,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(java.lang.Object[])",
      "begin_line": 529,
      "end_line": 534,
      "comment": "\n     * Verifies that the data set has length of power of 2.\n     * \n     * @param o the data array\n     * @throws IllegalArgumentException if array length is not power of 2\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 533,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.verifyInterval(double, double)",
      "begin_line": 543,
      "end_line": 551,
      "comment": "\n     * Verifies that the endpoints specify an interval.\n     * \n     * @param lower lower endpoint\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException if not interval\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 550,col 9)"
      ]
    }
  ]
}