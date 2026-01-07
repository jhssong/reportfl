{
  "filepath": "/tmp/Math-94b/src/java/org/apache/commons/math/transform/FastFourierTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastFourierTransformer",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 46,
      "end_line": 805,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/FastFourierTransform.html\"\u003e\n * Fast Fourier Transform\u003c/a\u003e for transformation of one-dimensional data sets.\n * For reference, see \u003cb\u003eApplied Numerical Linear Algebra\u003c/b\u003e, ISBN 0898713897,\n * chapter 6.\n * \u003cp\u003e\n * There are several conventions for the definition of FFT and inverse FFT,\n * mainly on different coefficient and exponent. Here the equations are listed\n * in the comments of the corresponding methods.\u003c/p\u003e\n * \u003cp\u003e\n * We require the length of data set to be power of 2, this greatly simplifies\n * and speeds up the code. Users can pad the data with zeros to meet this\n * requirement. There are other flavors of FFT, for reference, see S. Winograd,\n * \u003ci\u003eOn computing the discrete Fourier transform\u003c/i\u003e, Mathematics of Computation,\n * 32 (1978), 175 - 199.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "omega"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " array of the roots of unity "
    },
    {
      "type": "field",
      "varNames": [
        "omegaCount"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * |omegaCount| is the length of lasted computed omega[]. omegaCount\n     * is positive for forward transform and negative for inverse transform.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.FastFourierTransformer()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Construct a default transformer.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform(double[])",
      "begin_line": 77,
      "end_line": 80,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ y_n \u003d \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k $\n     * \u003c/p\u003e\n     * \n     * @param f the real data array to be transformed\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 97,
      "end_line": 102,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ y_n \u003d \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k $\n     * \u003c/p\u003e\n     * \n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the complex transformed array\n     * @throws FunctionEvaluationException if function cannot be evaluated\n     * at some point\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 47)",
        "(line 101,col 9)-(line 101,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform(org.apache.commons.math.complex.Complex[])",
      "begin_line": 114,
      "end_line": 118,
      "comment": "\n     * Transform the given complex data set.\n     * \u003cp\u003e\n     * The formula is $ y_n \u003d \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k $\n     * \u003c/p\u003e\n     * \n     * @param f the complex data array to be transformed\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 31)",
        "(line 117,col 9)-(line 117,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform2(double[])",
      "begin_line": 130,
      "end_line": 135,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $y_n \u003d (1/\\sqrt{N}) \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k$\n     * \u003c/p\u003e\n     * \n     * @param f the real data array to be transformed\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 63)",
        "(line 134,col 9)-(line 134,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform2(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 152,
      "end_line": 159,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $y_n \u003d (1/\\sqrt{N}) \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k$\n     * \u003c/p\u003e\n     * \n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the complex transformed array\n     * @throws FunctionEvaluationException if function cannot be evaluated\n     * at some point\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 47)",
        "(line 157,col 9)-(line 157,col 56)",
        "(line 158,col 9)-(line 158,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform2(org.apache.commons.math.complex.Complex[])",
      "begin_line": 171,
      "end_line": 177,
      "comment": "\n     * Transform the given complex data set.\n     * \u003cp\u003e\n     * The formula is $y_n \u003d (1/\\sqrt{N}) \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k$\n     * \u003c/p\u003e\n     * \n     * @param f the complex data array to be transformed\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 31)",
        "(line 175,col 9)-(line 175,col 63)",
        "(line 176,col 9)-(line 176,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inversetransform(double[])",
      "begin_line": 189,
      "end_line": 194,
      "comment": "\n     * Inversely transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ x_k \u003d (1/N) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n $\n     * \u003c/p\u003e\n     * \n     * @param f the real data array to be inversely transformed\n     * @return the complex inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 52)",
        "(line 193,col 9)-(line 193,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inversetransform(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 211,
      "end_line": 218,
      "comment": "\n     * Inversely transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ x_k \u003d (1/N) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n $\n     * \u003c/p\u003e\n     * \n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the complex inversely transformed array\n     * @throws FunctionEvaluationException if function cannot be evaluated\n     * at some point\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 47)",
        "(line 216,col 9)-(line 216,col 45)",
        "(line 217,col 9)-(line 217,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inversetransform(org.apache.commons.math.complex.Complex[])",
      "begin_line": 230,
      "end_line": 236,
      "comment": "\n     * Inversely transform the given complex data set.\n     * \u003cp\u003e\n     * The formula is $ x_k \u003d (1/N) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n $\n     * \u003c/p\u003e\n     * \n     * @param f the complex data array to be inversely transformed\n     * @return the complex inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 32)",
        "(line 234,col 9)-(line 234,col 52)",
        "(line 235,col 9)-(line 235,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inversetransform2(double[])",
      "begin_line": 248,
      "end_line": 253,
      "comment": "\n     * Inversely transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $x_k \u003d (1/\\sqrt{N}) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n$\n     * \u003c/p\u003e\n     * \n     * @param f the real data array to be inversely transformed\n     * @return the complex inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 63)",
        "(line 252,col 9)-(line 252,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inversetransform2(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 270,
      "end_line": 277,
      "comment": "\n     * Inversely transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $x_k \u003d (1/\\sqrt{N}) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n$\n     * \u003c/p\u003e\n     * \n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the complex inversely transformed array\n     * @throws FunctionEvaluationException if function cannot be evaluated\n     * at some point\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 47)",
        "(line 275,col 9)-(line 275,col 56)",
        "(line 276,col 9)-(line 276,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inversetransform2(org.apache.commons.math.complex.Complex[])",
      "begin_line": 289,
      "end_line": 295,
      "comment": "\n     * Inversely transform the given complex data set.\n     * \u003cp\u003e\n     * The formula is $x_k \u003d (1/\\sqrt{N}) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n$\n     * \u003c/p\u003e\n     * \n     * @param f the complex data array to be inversely transformed\n     * @return the complex inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 32)",
        "(line 293,col 9)-(line 293,col 63)",
        "(line 294,col 9)-(line 294,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.fft(double[], boolean)",
      "begin_line": 305,
      "end_line": 339,
      "comment": "\n     * Perform the base-4 Cooley-Tukey FFT algorithm (including inverse).\n     *\n     * @param f the real data array to be transformed\n     * @param isInverse the indicator of forward or inverse transform\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 25)",
        "(line 309,col 9)-(line 309,col 44)",
        "(line 310,col 9)-(line 313,col 9)",
        "(line 317,col 9)-(line 317,col 30)",
        "(line 318,col 9)-(line 318,col 37)",
        "(line 319,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 322,col 41)",
        "(line 323,col 9)-(line 323,col 29)",
        "(line 326,col 9)-(line 326,col 45)",
        "(line 327,col 9)-(line 327,col 76)",
        "(line 328,col 9)-(line 328,col 76)",
        "(line 329,col 9)-(line 336,col 9)",
        "(line 338,col 9)-(line 338,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.fft(org.apache.commons.math.complex.Complex[])",
      "begin_line": 348,
      "end_line": 404,
      "comment": "\n     * Perform the base-4 Cooley-Tukey FFT algorithm (including inverse).\n     *\n     * @param data the complex data array to be transformed\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 40)",
        "(line 352,col 9)-(line 352,col 58)",
        "(line 355,col 9)-(line 355,col 28)",
        "(line 356,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 364,col 9)",
        "(line 367,col 9)-(line 367,col 14)",
        "(line 368,col 9)-(line 375,col 9)",
        "(line 378,col 9)-(line 390,col 9)",
        "(line 393,col 9)-(line 402,col 9)",
        "(line 403,col 9)-(line 403,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.computeOmega(int)",
      "begin_line": 416,
      "end_line": 443,
      "comment": "\n     * Calculate the n-th roots of unity.\n     * \u003cp\u003e\n     * The computed omega[] \u003d { 1, w, w^2, ... w^(n-1) } where\n     * w \u003d exp(-2 \\pi i / n), i \u003d sqrt(-1). Note n is positive for\n     * forward transform and negative for inverse transform. \u003c/p\u003e\n     * \n     * @param n the integer passed in\n     * @throws IllegalArgumentException if n \u003d 0\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 421,col 9)",
        "(line 423,col 9)-(line 423,col 40)",
        "(line 424,col 9)-(line 430,col 9)",
        "(line 432,col 9)-(line 432,col 41)",
        "(line 433,col 9)-(line 433,col 37)",
        "(line 434,col 9)-(line 434,col 34)",
        "(line 435,col 9)-(line 435,col 34)",
        "(line 436,col 9)-(line 436,col 41)",
        "(line 437,col 9)-(line 441,col 9)",
        "(line 442,col 9)-(line 442,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.sample(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 462,
      "end_line": 478,
      "comment": "\n     * Sample the given univariate real function on the given interval.\n     * \u003cp\u003e\n     * The interval is divided equally into N sections and sample points\n     * are taken from min to max-(max-min)/N. Usually f(x) is periodic\n     * such that f(min) \u003d f(max) (note max is not sampled), but we don\u0027t\n     * require that.\u003c/p\u003e\n     *\n     * @param f the function to be sampled\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the samples array\n     * @throws FunctionEvaluationException if function cannot be evaluated\n     * at some point\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 469,col 9)",
        "(line 470,col 9)-(line 470,col 33)",
        "(line 472,col 9)-(line 472,col 35)",
        "(line 473,col 9)-(line 473,col 35)",
        "(line 474,col 9)-(line 476,col 9)",
        "(line 477,col 9)-(line 477,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.scaleArray(double[], double)",
      "begin_line": 488,
      "end_line": 493,
      "comment": "\n     * Multiply every component in the given real array by the\n     * given real number. The change is made in place.\n     *\n     * @param f the real array to be scaled\n     * @param d the real scaling coefficient\n     * @return a reference to the scaled array\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 491,col 9)",
        "(line 492,col 9)-(line 492,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.scaleArray(org.apache.commons.math.complex.Complex[], double)",
      "begin_line": 503,
      "end_line": 508,
      "comment": "\n     * Multiply every component in the given complex array by the\n     * given real number. The change is made in place.\n     *\n     * @param f the complex array to be scaled\n     * @param d the real scaling coefficient\n     * @return a reference to the scaled array\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 507,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.isPowerOf2(long)",
      "begin_line": 516,
      "end_line": 518,
      "comment": "\n     * Returns true if the argument is power of 2.\n     * \n     * @param n the number to test\n     * @return true if the argument is power of 2\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(double[])",
      "begin_line": 526,
      "end_line": 531,
      "comment": "\n     * Verifies that the data set has length of power of 2.\n     * \n     * @param d the data array\n     * @throws IllegalArgumentException if array length is not power of 2\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 530,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(java.lang.Object[])",
      "begin_line": 539,
      "end_line": 544,
      "comment": "\n     * Verifies that the data set has length of power of 2.\n     * \n     * @param o the data array\n     * @throws IllegalArgumentException if array length is not power of 2\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 543,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.verifyInterval(double, double)",
      "begin_line": 553,
      "end_line": 560,
      "comment": "\n     * Verifies that the endpoints specify an interval.\n     * \n     * @param lower lower endpoint\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException if not interval\n     ",
      "child_ranges": [
        "(line 556,col 9)-(line 559,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.mdfft(java.lang.Object, boolean)",
      "begin_line": 576,
      "end_line": 586,
      "comment": "\n     * Performs a multi-dimensional Fourier transform on a given array.\n     * Use {@link #inversetransform2(Complex[])} and\n     * {@link #transform2(Complex[])} in a row-column implementation\n     * in any number of dimensions with O(N\u0026times;log(N)) complexity with\n     * N\u003dn\u003csub\u003e1\u003c/sub\u003e\u0026times;n\u003csub\u003e2\u003c/sub\u003e\u0026times;n\u003csub\u003e3\u003c/sub\u003e\u0026times;...\u0026times;n\u003csub\u003ed\u003c/sub\u003e,\n     * n\u003csub\u003ex\u003c/sub\u003e\u003dnumber of elements in dimension x,\n     * and d\u003dtotal number of dimensions.\n     *\n     * @param mdca Multi-Dimensional Complex Array id est Complex[][][][]\n     * @param forward inverseTransform2 is preformed if this is false\n     * @return transform of mdca as a Multi-Dimensional Complex Array id est Complex[][][][]\n     * @throws IllegalArgumentException if any dimension is not a power of two\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 579,col 64)",
        "(line 580,col 9)-(line 580,col 55)",
        "(line 582,col 9)-(line 584,col 9)",
        "(line 585,col 9)-(line 585,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.mdfft(org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix, boolean, int, int[])",
      "begin_line": 597,
      "end_line": 636,
      "comment": "\n     * Performs one dimension of a multi-dimensional Fourier transform.\n     *\n     * @param mdcm input matrix\n     * @param forward inverseTransform2 is preformed if this is false\n     * @param d index of the dimension to process\n     * @param subVector recursion subvector\n     * @throws IllegalArgumentException if any dimension is not a power of two\n     ",
      "child_ranges": [
        "(line 600,col 9)-(line 600,col 55)",
        "(line 602,col 9)-(line 634,col 9)",
        "(line 635,col 9)-(line 635,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultiDimensionalComplexMatrix",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable",
        "java.lang.Cloneable"
      ],
      "begin_line": 645,
      "end_line": 804,
      "comment": "\n     * Complex matrix implementation.\n     * Not designed for synchronized access\n     * may eventually be replaced by jsr-83 of the java community process\n     * http://jcp.org/en/jsr/detail?id\u003d83\n     * may require additional exception throws for other basic requirements.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 649,
      "end_line": 649,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "dimensionSize"
      ],
      "begin_line": 652,
      "end_line": 652,
      "comment": " Size in all dimensions. "
    },
    {
      "type": "field",
      "varNames": [
        "multiDimensionalComplexArray"
      ],
      "begin_line": 655,
      "end_line": 655,
      "comment": " Storage array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.MultiDimensionalComplexMatrix(java.lang.Object)",
      "begin_line": 660,
      "end_line": 686,
      "comment": " Simple constructor.\n         * @param multiDimensionalComplexArray array containing the matrix elements\n         ",
      "child_ranges": [
        "(line 662,col 13)-(line 662,col 77)",
        "(line 663,col 13)-(line 663,col 36)",
        "(line 665,col 13)-(line 665,col 64)",
        "(line 666,col 13)-(line 679,col 13)",
        "(line 680,col 13)-(line 685,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.get(int...)",
      "begin_line": 694,
      "end_line": 714,
      "comment": "\n         * Get a matrix element.\n         * @param vector indices of the element\n         * @return matrix element\n         * @exception IllegalArgumentException if dimensions do not match\n         ",
      "child_ranges": [
        "(line 696,col 13)-(line 699,col 13)",
        "(line 700,col 13)-(line 706,col 13)",
        "(line 708,col 13)-(line 708,col 64)",
        "(line 710,col 13)-(line 712,col 13)",
        "(line 713,col 13)-(line 713,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.set(org.apache.commons.math.complex.Complex, int...)",
      "begin_line": 723,
      "end_line": 748,
      "comment": "\n         * Set a matrix element.\n         * @param magnitude magnitude of the element\n         * @param vector indices of the element\n         * @return the previous value\n         * @exception IllegalArgumentException if dimensions do not match\n         ",
      "child_ranges": [
        "(line 725,col 13)-(line 728,col 13)",
        "(line 729,col 13)-(line 735,col 13)",
        "(line 737,col 13)-(line 737,col 64)",
        "(line 739,col 13)-(line 741,col 13)",
        "(line 743,col 13)-(line 744,col 69)",
        "(line 745,col 13)-(line 746,col 30)",
        "(line 747,col 13)-(line 747,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.getDimensionSizes()",
      "begin_line": 754,
      "end_line": 756,
      "comment": "\n         * Get the size in all dimensions.\n         * @return size in all dimensions\n         ",
      "child_ranges": [
        "(line 755,col 13)-(line 755,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.getArray()",
      "begin_line": 762,
      "end_line": 764,
      "comment": "\n         * Get the underlying storage array\n         * @return underlying storage array\n         ",
      "child_ranges": [
        "(line 763,col 13)-(line 763,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.clone()",
      "begin_line": 767,
      "end_line": 774,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 769,col 13)-(line 771,col 51)",
        "(line 772,col 13)-(line 772,col 24)",
        "(line 773,col 13)-(line 773,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.clone(org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix)",
      "begin_line": 780,
      "end_line": 803,
      "comment": "\n         * Copy contents of current array into mdcm.\n         * @param mdcm array where to copy data\n         ",
      "child_ranges": [
        "(line 781,col 13)-(line 781,col 57)",
        "(line 782,col 13)-(line 782,col 25)",
        "(line 783,col 13)-(line 785,col 13)",
        "(line 786,col 13)-(line 786,col 69)",
        "(line 787,col 13)-(line 798,col 13)",
        "(line 800,col 13)-(line 802,col 13)"
      ]
    }
  ]
}