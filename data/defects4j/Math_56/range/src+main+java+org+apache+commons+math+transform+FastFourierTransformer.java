{
  "filepath": "/tmp/Math-56b/src/main/java/org/apache/commons/math/transform/FastFourierTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastFourierTransformer",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 48,
      "end_line": 912,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/FastFourierTransform.html\"\u003e\n * Fast Fourier Transform\u003c/a\u003e for transformation of one-dimensional data sets.\n * For reference, see \u003cb\u003eApplied Numerical Linear Algebra\u003c/b\u003e, ISBN 0898713897,\n * chapter 6.\n * \u003cp\u003e\n * There are several conventions for the definition of FFT and inverse FFT,\n * mainly on different coefficient and exponent. Here the equations are listed\n * in the comments of the corresponding methods.\u003c/p\u003e\n * \u003cp\u003e\n * We require the length of data set to be power of 2, this greatly simplifies\n * and speeds up the code. Users can pad the data with zeros to meet this\n * requirement. There are other flavors of FFT, for reference, see S. Winograd,\n * \u003ci\u003eOn computing the discrete Fourier transform\u003c/i\u003e, Mathematics of Computation,\n * 32 (1978), 175 - 199.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "roots"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " roots of unity "
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
      "end_line": 76,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ y_n \u003d \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k $\n     * \u003c/p\u003e\n     *\n     * @param f the real data array to be transformed\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 93,
      "end_line": 98,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ y_n \u003d \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k $\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the complex transformed array\n     * @throws MathUserException if function cannot be evaluated\n     * at some point\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 47)",
        "(line 97,col 9)-(line 97,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform(org.apache.commons.math.complex.Complex[])",
      "begin_line": 110,
      "end_line": 114,
      "comment": "\n     * Transform the given complex data set.\n     * \u003cp\u003e\n     * The formula is $ y_n \u003d \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k $\n     * \u003c/p\u003e\n     *\n     * @param f the complex data array to be transformed\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 37)",
        "(line 113,col 9)-(line 113,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform2(double[])",
      "begin_line": 126,
      "end_line": 131,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $y_n \u003d (1/\\sqrt{N}) \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k$\n     * \u003c/p\u003e\n     *\n     * @param f the real data array to be transformed\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 67)",
        "(line 130,col 9)-(line 130,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform2(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 148,
      "end_line": 155,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $y_n \u003d (1/\\sqrt{N}) \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k$\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the complex transformed array\n     * @throws MathUserException if function cannot be evaluated\n     * at some point\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 47)",
        "(line 153,col 9)-(line 153,col 60)",
        "(line 154,col 9)-(line 154,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform2(org.apache.commons.math.complex.Complex[])",
      "begin_line": 167,
      "end_line": 173,
      "comment": "\n     * Transform the given complex data set.\n     * \u003cp\u003e\n     * The formula is $y_n \u003d (1/\\sqrt{N}) \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k$\n     * \u003c/p\u003e\n     *\n     * @param f the complex data array to be transformed\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 37)",
        "(line 171,col 9)-(line 171,col 67)",
        "(line 172,col 9)-(line 172,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inversetransform(double[])",
      "begin_line": 185,
      "end_line": 190,
      "comment": "\n     * Inversely transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ x_k \u003d (1/N) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n $\n     * \u003c/p\u003e\n     *\n     * @param f the real data array to be inversely transformed\n     * @return the complex inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 52)",
        "(line 189,col 9)-(line 189,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inversetransform(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 207,
      "end_line": 214,
      "comment": "\n     * Inversely transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ x_k \u003d (1/N) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n $\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the complex inversely transformed array\n     * @throws MathUserException if function cannot be evaluated\n     * at some point\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 47)",
        "(line 212,col 9)-(line 212,col 45)",
        "(line 213,col 9)-(line 213,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inversetransform(org.apache.commons.math.complex.Complex[])",
      "begin_line": 226,
      "end_line": 232,
      "comment": "\n     * Inversely transform the given complex data set.\n     * \u003cp\u003e\n     * The formula is $ x_k \u003d (1/N) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n $\n     * \u003c/p\u003e\n     *\n     * @param f the complex data array to be inversely transformed\n     * @return the complex inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 38)",
        "(line 230,col 9)-(line 230,col 52)",
        "(line 231,col 9)-(line 231,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inversetransform2(double[])",
      "begin_line": 244,
      "end_line": 249,
      "comment": "\n     * Inversely transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $x_k \u003d (1/\\sqrt{N}) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n$\n     * \u003c/p\u003e\n     *\n     * @param f the real data array to be inversely transformed\n     * @return the complex inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 67)",
        "(line 248,col 9)-(line 248,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inversetransform2(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 266,
      "end_line": 273,
      "comment": "\n     * Inversely transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $x_k \u003d (1/\\sqrt{N}) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n$\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the complex inversely transformed array\n     * @throws MathUserException if function cannot be evaluated\n     * at some point\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 47)",
        "(line 271,col 9)-(line 271,col 60)",
        "(line 272,col 9)-(line 272,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inversetransform2(org.apache.commons.math.complex.Complex[])",
      "begin_line": 285,
      "end_line": 291,
      "comment": "\n     * Inversely transform the given complex data set.\n     * \u003cp\u003e\n     * The formula is $x_k \u003d (1/\\sqrt{N}) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n$\n     * \u003c/p\u003e\n     *\n     * @param f the complex data array to be inversely transformed\n     * @return the complex inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 38)",
        "(line 289,col 9)-(line 289,col 67)",
        "(line 290,col 9)-(line 290,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.fft(double[], boolean)",
      "begin_line": 301,
      "end_line": 337,
      "comment": "\n     * Perform the base-4 Cooley-Tukey FFT algorithm (including inverse).\n     *\n     * @param f the real data array to be transformed\n     * @param isInverse the indicator of forward or inverse transform\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 25)",
        "(line 305,col 9)-(line 305,col 44)",
        "(line 306,col 9)-(line 309,col 9)",
        "(line 313,col 9)-(line 313,col 30)",
        "(line 314,col 9)-(line 314,col 37)",
        "(line 315,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 318,col 47)",
        "(line 319,col 9)-(line 319,col 29)",
        "(line 322,col 9)-(line 322,col 51)",
        "(line 323,col 9)-(line 323,col 76)",
        "(line 324,col 9)-(line 324,col 76)",
        "(line 325,col 9)-(line 334,col 9)",
        "(line 336,col 9)-(line 336,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.fft(org.apache.commons.math.complex.Complex[])",
      "begin_line": 346,
      "end_line": 412,
      "comment": "\n     * Perform the base-4 Cooley-Tukey FFT algorithm (including inverse).\n     *\n     * @param data the complex data array to be transformed\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 34)",
        "(line 350,col 9)-(line 350,col 43)",
        "(line 353,col 9)-(line 353,col 28)",
        "(line 354,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 362,col 9)",
        "(line 365,col 9)-(line 365,col 19)",
        "(line 366,col 9)-(line 373,col 9)",
        "(line 376,col 9)-(line 388,col 9)",
        "(line 391,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 411,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.sample(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 430,
      "end_line": 446,
      "comment": "\n     * Sample the given univariate real function on the given interval.\n     * \u003cp\u003e\n     * The interval is divided equally into N sections and sample points\n     * are taken from min to max-(max-min)/N. Usually f(x) is periodic\n     * such that f(min) \u003d f(max) (note max is not sampled), but we don\u0027t\n     * require that.\u003c/p\u003e\n     *\n     * @param f the function to be sampled\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the samples array\n     * @throws MathUserException if function cannot be evaluated at some point\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 438,col 33)",
        "(line 440,col 9)-(line 440,col 35)",
        "(line 441,col 9)-(line 441,col 35)",
        "(line 442,col 9)-(line 444,col 9)",
        "(line 445,col 9)-(line 445,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.scaleArray(double[], double)",
      "begin_line": 456,
      "end_line": 461,
      "comment": "\n     * Multiply every component in the given real array by the\n     * given real number. The change is made in place.\n     *\n     * @param f the real array to be scaled\n     * @param d the real scaling coefficient\n     * @return a reference to the scaled array\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 459,col 9)",
        "(line 460,col 9)-(line 460,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.scaleArray(org.apache.commons.math.complex.Complex[], double)",
      "begin_line": 471,
      "end_line": 476,
      "comment": "\n     * Multiply every component in the given complex array by the\n     * given real number. The change is made in place.\n     *\n     * @param f the complex array to be scaled\n     * @param d the real scaling coefficient\n     * @return a reference to the scaled array\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 474,col 9)",
        "(line 475,col 9)-(line 475,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.isPowerOf2(long)",
      "begin_line": 484,
      "end_line": 486,
      "comment": "\n     * Returns true if the argument is power of 2.\n     *\n     * @param n the number to test\n     * @return true if the argument is power of 2\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(double[])",
      "begin_line": 494,
      "end_line": 499,
      "comment": "\n     * Verifies that the data set has length of power of 2.\n     *\n     * @param d the data array\n     * @throws IllegalArgumentException if array length is not power of 2\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 498,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(java.lang.Object[])",
      "begin_line": 507,
      "end_line": 512,
      "comment": "\n     * Verifies that the data set has length of power of 2.\n     *\n     * @param o the data array\n     * @throws IllegalArgumentException if array length is not power of 2\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 511,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.verifyInterval(double, double)",
      "begin_line": 521,
      "end_line": 529,
      "comment": "\n     * Verifies that the endpoints specify an interval.\n     *\n     * @param lower lower endpoint\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException if not interval\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 528,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.mdfft(java.lang.Object, boolean)",
      "begin_line": 545,
      "end_line": 555,
      "comment": "\n     * Performs a multi-dimensional Fourier transform on a given array.\n     * Use {@link #inversetransform2(Complex[])} and\n     * {@link #transform2(Complex[])} in a row-column implementation\n     * in any number of dimensions with O(N\u0026times;log(N)) complexity with\n     * N\u003dn\u003csub\u003e1\u003c/sub\u003e\u0026times;n\u003csub\u003e2\u003c/sub\u003e\u0026times;n\u003csub\u003e3\u003c/sub\u003e\u0026times;...\u0026times;n\u003csub\u003ed\u003c/sub\u003e,\n     * n\u003csub\u003ex\u003c/sub\u003e\u003dnumber of elements in dimension x,\n     * and d\u003dtotal number of dimensions.\n     *\n     * @param mdca Multi-Dimensional Complex Array id est Complex[][][][]\n     * @param forward inverseTransform2 is preformed if this is false\n     * @return transform of mdca as a Multi-Dimensional Complex Array id est Complex[][][][]\n     * @throws IllegalArgumentException if any dimension is not a power of two\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 548,col 64)",
        "(line 549,col 9)-(line 549,col 55)",
        "(line 551,col 9)-(line 553,col 9)",
        "(line 554,col 9)-(line 554,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.mdfft(org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix, boolean, int, int[])",
      "begin_line": 566,
      "end_line": 605,
      "comment": "\n     * Performs one dimension of a multi-dimensional Fourier transform.\n     *\n     * @param mdcm input matrix\n     * @param forward inverseTransform2 is preformed if this is false\n     * @param d index of the dimension to process\n     * @param subVector recursion subvector\n     * @throws IllegalArgumentException if any dimension is not a power of two\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 55)",
        "(line 571,col 9)-(line 603,col 9)",
        "(line 604,col 9)-(line 604,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultiDimensionalComplexMatrix",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable"
      ],
      "begin_line": 614,
      "end_line": 767,
      "comment": "\n     * Complex matrix implementation.\n     * Not designed for synchronized access\n     * may eventually be replaced by jsr-83 of the java community process\n     * http://jcp.org/en/jsr/detail?id\u003d83\n     * may require additional exception throws for other basic requirements.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dimensionSize"
      ],
      "begin_line": 618,
      "end_line": 618,
      "comment": " Size in all dimensions. "
    },
    {
      "type": "field",
      "varNames": [
        "multiDimensionalComplexArray"
      ],
      "begin_line": 621,
      "end_line": 621,
      "comment": " Storage array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.MultiDimensionalComplexMatrix(java.lang.Object)",
      "begin_line": 626,
      "end_line": 651,
      "comment": " Simple constructor.\n         * @param multiDimensionalComplexArray array containing the matrix elements\n         ",
      "child_ranges": [
        "(line 628,col 13)-(line 628,col 77)",
        "(line 631,col 13)-(line 631,col 36)",
        "(line 632,col 13)-(line 637,col 13)",
        "(line 640,col 13)-(line 640,col 53)",
        "(line 643,col 13)-(line 643,col 32)",
        "(line 644,col 13)-(line 649,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.get(int...)",
      "begin_line": 659,
      "end_line": 679,
      "comment": "\n         * Get a matrix element.\n         * @param vector indices of the element\n         * @return matrix element\n         * @exception IllegalArgumentException if dimensions do not match\n         ",
      "child_ranges": [
        "(line 661,col 13)-(line 667,col 13)",
        "(line 668,col 13)-(line 671,col 13)",
        "(line 673,col 13)-(line 673,col 64)",
        "(line 675,col 13)-(line 677,col 13)",
        "(line 678,col 13)-(line 678,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.set(org.apache.commons.math.complex.Complex, int...)",
      "begin_line": 688,
      "end_line": 711,
      "comment": "\n         * Set a matrix element.\n         * @param magnitude magnitude of the element\n         * @param vector indices of the element\n         * @return the previous value\n         * @exception IllegalArgumentException if dimensions do not match\n         ",
      "child_ranges": [
        "(line 690,col 13)-(line 696,col 13)",
        "(line 697,col 13)-(line 700,col 13)",
        "(line 702,col 13)-(line 702,col 77)",
        "(line 703,col 13)-(line 705,col 13)",
        "(line 707,col 13)-(line 707,col 90)",
        "(line 708,col 13)-(line 708,col 72)",
        "(line 710,col 13)-(line 710,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.getDimensionSizes()",
      "begin_line": 717,
      "end_line": 719,
      "comment": "\n         * Get the size in all dimensions.\n         * @return size in all dimensions\n         ",
      "child_ranges": [
        "(line 718,col 13)-(line 718,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.getArray()",
      "begin_line": 725,
      "end_line": 727,
      "comment": "\n         * Get the underlying storage array\n         * @return underlying storage array\n         ",
      "child_ranges": [
        "(line 726,col 13)-(line 726,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.clone()",
      "begin_line": 730,
      "end_line": 737,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 732,col 13)-(line 734,col 51)",
        "(line 735,col 13)-(line 735,col 24)",
        "(line 736,col 13)-(line 736,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.clone(org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix)",
      "begin_line": 743,
      "end_line": 766,
      "comment": "\n         * Copy contents of current array into mdcm.\n         * @param mdcm array where to copy data\n         ",
      "child_ranges": [
        "(line 744,col 13)-(line 744,col 57)",
        "(line 745,col 13)-(line 745,col 25)",
        "(line 746,col 13)-(line 748,col 13)",
        "(line 749,col 13)-(line 749,col 69)",
        "(line 750,col 13)-(line 761,col 13)",
        "(line 763,col 13)-(line 765,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RootsOfUnity",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 773,
      "end_line": 910,
      "comment": " Computes the n\u003csup\u003eth\u003c/sup\u003e roots of unity.\n     * A cache of already computed values is maintained.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 776,
      "end_line": 776,
      "comment": " Serializable version id. "
    },
    {
      "type": "field",
      "varNames": [
        "omegaCount"
      ],
      "begin_line": 779,
      "end_line": 779,
      "comment": " Number of roots of unity. "
    },
    {
      "type": "field",
      "varNames": [
        "omegaReal"
      ],
      "begin_line": 782,
      "end_line": 782,
      "comment": " Real part of the roots. "
    },
    {
      "type": "field",
      "varNames": [
        "omegaImaginaryForward"
      ],
      "begin_line": 785,
      "end_line": 785,
      "comment": " Imaginary part of the roots for forward transform. "
    },
    {
      "type": "field",
      "varNames": [
        "omegaImaginaryInverse"
      ],
      "begin_line": 788,
      "end_line": 788,
      "comment": " Imaginary part of the roots for reverse transform. "
    },
    {
      "type": "field",
      "varNames": [
        "isForward"
      ],
      "begin_line": 791,
      "end_line": 791,
      "comment": " Forward/reverse indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity.RootsOfUnity()",
      "begin_line": 796,
      "end_line": 804,
      "comment": "\n       * Build an engine for computing then \u003csup\u003eth\u003c/sup\u003e roots of unity\n       ",
      "child_ranges": [
        "(line 798,col 9)-(line 798,col 23)",
        "(line 799,col 9)-(line 799,col 25)",
        "(line 800,col 9)-(line 800,col 37)",
        "(line 801,col 9)-(line 801,col 37)",
        "(line 802,col 9)-(line 802,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity.isForward()",
      "begin_line": 811,
      "end_line": 818,
      "comment": "\n       * Check if computation has been done for forward or reverse transform.\n       * @return true if computation has been done for forward transform\n       * @throws IllegalStateException if no roots of unity have been computed yet\n       ",
      "child_ranges": [
        "(line 813,col 9)-(line 815,col 9)",
        "(line 816,col 9)-(line 816,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity.computeOmega(int)",
      "begin_line": 829,
      "end_line": 864,
      "comment": " Computes the n\u003csup\u003eth\u003c/sup\u003e roots of unity.\n       * \u003cp\u003eThe computed omega[] \u003d { 1, w, w\u003csup\u003e2\u003c/sup\u003e, ... w\u003csup\u003e(n-1)\u003c/sup\u003e } where\n       * w \u003d exp(-2 \u0026pi; i / n), i \u003d \u0026sqrt;(-1).\u003c/p\u003e\n       * \u003cp\u003eNote that n is positive for\n       * forward transform and negative for inverse transform.\u003c/p\u003e\n       * @param n number of roots of unity to compute,\n       * positive for forward transform, negative for inverse transform\n       * @throws IllegalArgumentException if n \u003d 0\n       ",
      "child_ranges": [
        "(line 831,col 9)-(line 834,col 9)",
        "(line 836,col 9)-(line 836,col 26)",
        "(line 839,col 9)-(line 839,col 41)",
        "(line 841,col 9)-(line 843,col 9)",
        "(line 846,col 9)-(line 846,col 53)",
        "(line 847,col 9)-(line 847,col 44)",
        "(line 848,col 9)-(line 848,col 44)",
        "(line 849,col 9)-(line 849,col 49)",
        "(line 850,col 9)-(line 850,col 49)",
        "(line 851,col 9)-(line 851,col 49)",
        "(line 852,col 9)-(line 852,col 39)",
        "(line 853,col 9)-(line 853,col 39)",
        "(line 854,col 9)-(line 854,col 39)",
        "(line 855,col 9)-(line 861,col 9)",
        "(line 862,col 9)-(line 862,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity.getOmegaReal(int)",
      "begin_line": 873,
      "end_line": 886,
      "comment": "\n       * Get the real part of the k\u003csup\u003eth\u003c/sup\u003e n\u003csup\u003eth\u003c/sup\u003e root of unity\n       * @param k index of the n\u003csup\u003eth\u003c/sup\u003e root of unity\n       * @return real part of the k\u003csup\u003eth\u003c/sup\u003e n\u003csup\u003eth\u003c/sup\u003e root of unity\n       * @throws IllegalStateException if no roots of unity have been computed yet\n       * @throws IllegalArgumentException if k is out of range\n       ",
      "child_ranges": [
        "(line 876,col 9)-(line 878,col 9)",
        "(line 879,col 9)-(line 882,col 9)",
        "(line 884,col 9)-(line 884,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity.getOmegaImaginary(int)",
      "begin_line": 895,
      "end_line": 908,
      "comment": "\n       * Get the imaginary part of the k\u003csup\u003eth\u003c/sup\u003e n\u003csup\u003eth\u003c/sup\u003e root of unity\n       * @param k index of the n\u003csup\u003eth\u003c/sup\u003e root of unity\n       * @return imaginary part of the k\u003csup\u003eth\u003c/sup\u003e n\u003csup\u003eth\u003c/sup\u003e root of unity\n       * @throws IllegalStateException if no roots of unity have been computed yet\n       * @throws IllegalArgumentException if k is out of range\n       ",
      "child_ranges": [
        "(line 898,col 9)-(line 900,col 9)",
        "(line 901,col 9)-(line 904,col 9)",
        "(line 906,col 9)-(line 906,col 79)"
      ]
    }
  ]
}