{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/transform/FastFourierTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastFourierTransformer",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 46,
      "end_line": 923,
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
        "roots"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " roots of unity "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.FastFourierTransformer()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Construct a default transformer.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform(double[])",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ y_n \u003d \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k $\n     * \u003c/p\u003e\n     *\n     * @param f the real data array to be transformed\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 91,
      "end_line": 96,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ y_n \u003d \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k $\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the complex transformed array\n     * @throws FunctionEvaluationException if function cannot be evaluated\n     * at some point\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 47)",
        "(line 95,col 9)-(line 95,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform(org.apache.commons.math.complex.Complex[])",
      "begin_line": 108,
      "end_line": 112,
      "comment": "\n     * Transform the given complex data set.\n     * \u003cp\u003e\n     * The formula is $ y_n \u003d \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k $\n     * \u003c/p\u003e\n     *\n     * @param f the complex data array to be transformed\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 37)",
        "(line 111,col 9)-(line 111,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform2(double[])",
      "begin_line": 124,
      "end_line": 129,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $y_n \u003d (1/\\sqrt{N}) \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k$\n     * \u003c/p\u003e\n     *\n     * @param f the real data array to be transformed\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 63)",
        "(line 128,col 9)-(line 128,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform2(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 146,
      "end_line": 153,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $y_n \u003d (1/\\sqrt{N}) \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k$\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the complex transformed array\n     * @throws FunctionEvaluationException if function cannot be evaluated\n     * at some point\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 47)",
        "(line 151,col 9)-(line 151,col 56)",
        "(line 152,col 9)-(line 152,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform2(org.apache.commons.math.complex.Complex[])",
      "begin_line": 165,
      "end_line": 171,
      "comment": "\n     * Transform the given complex data set.\n     * \u003cp\u003e\n     * The formula is $y_n \u003d (1/\\sqrt{N}) \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k$\n     * \u003c/p\u003e\n     *\n     * @param f the complex data array to be transformed\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 37)",
        "(line 169,col 9)-(line 169,col 63)",
        "(line 170,col 9)-(line 170,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inversetransform(double[])",
      "begin_line": 183,
      "end_line": 188,
      "comment": "\n     * Inversely transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ x_k \u003d (1/N) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n $\n     * \u003c/p\u003e\n     *\n     * @param f the real data array to be inversely transformed\n     * @return the complex inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 52)",
        "(line 187,col 9)-(line 187,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inversetransform(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 205,
      "end_line": 212,
      "comment": "\n     * Inversely transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ x_k \u003d (1/N) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n $\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the complex inversely transformed array\n     * @throws FunctionEvaluationException if function cannot be evaluated\n     * at some point\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 47)",
        "(line 210,col 9)-(line 210,col 45)",
        "(line 211,col 9)-(line 211,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inversetransform(org.apache.commons.math.complex.Complex[])",
      "begin_line": 224,
      "end_line": 230,
      "comment": "\n     * Inversely transform the given complex data set.\n     * \u003cp\u003e\n     * The formula is $ x_k \u003d (1/N) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n $\n     * \u003c/p\u003e\n     *\n     * @param f the complex data array to be inversely transformed\n     * @return the complex inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 38)",
        "(line 228,col 9)-(line 228,col 52)",
        "(line 229,col 9)-(line 229,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inversetransform2(double[])",
      "begin_line": 242,
      "end_line": 247,
      "comment": "\n     * Inversely transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $x_k \u003d (1/\\sqrt{N}) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n$\n     * \u003c/p\u003e\n     *\n     * @param f the real data array to be inversely transformed\n     * @return the complex inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 63)",
        "(line 246,col 9)-(line 246,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inversetransform2(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 264,
      "end_line": 271,
      "comment": "\n     * Inversely transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $x_k \u003d (1/\\sqrt{N}) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n$\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the complex inversely transformed array\n     * @throws FunctionEvaluationException if function cannot be evaluated\n     * at some point\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 47)",
        "(line 269,col 9)-(line 269,col 56)",
        "(line 270,col 9)-(line 270,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inversetransform2(org.apache.commons.math.complex.Complex[])",
      "begin_line": 283,
      "end_line": 289,
      "comment": "\n     * Inversely transform the given complex data set.\n     * \u003cp\u003e\n     * The formula is $x_k \u003d (1/\\sqrt{N}) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n$\n     * \u003c/p\u003e\n     *\n     * @param f the complex data array to be inversely transformed\n     * @return the complex inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 38)",
        "(line 287,col 9)-(line 287,col 63)",
        "(line 288,col 9)-(line 288,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.fft(double[], boolean)",
      "begin_line": 299,
      "end_line": 335,
      "comment": "\n     * Perform the base-4 Cooley-Tukey FFT algorithm (including inverse).\n     *\n     * @param f the real data array to be transformed\n     * @param isInverse the indicator of forward or inverse transform\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 25)",
        "(line 303,col 9)-(line 303,col 44)",
        "(line 304,col 9)-(line 307,col 9)",
        "(line 311,col 9)-(line 311,col 30)",
        "(line 312,col 9)-(line 312,col 37)",
        "(line 313,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 47)",
        "(line 317,col 9)-(line 317,col 29)",
        "(line 320,col 9)-(line 320,col 51)",
        "(line 321,col 9)-(line 321,col 76)",
        "(line 322,col 9)-(line 322,col 76)",
        "(line 323,col 9)-(line 332,col 9)",
        "(line 334,col 9)-(line 334,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.fft(org.apache.commons.math.complex.Complex[])",
      "begin_line": 344,
      "end_line": 410,
      "comment": "\n     * Perform the base-4 Cooley-Tukey FFT algorithm (including inverse).\n     *\n     * @param data the complex data array to be transformed\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 34)",
        "(line 348,col 9)-(line 348,col 43)",
        "(line 351,col 9)-(line 351,col 28)",
        "(line 352,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 360,col 9)",
        "(line 363,col 9)-(line 363,col 19)",
        "(line 364,col 9)-(line 371,col 9)",
        "(line 374,col 9)-(line 386,col 9)",
        "(line 389,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 409,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.sample(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 429,
      "end_line": 446,
      "comment": "\n     * Sample the given univariate real function on the given interval.\n     * \u003cp\u003e\n     * The interval is divided equally into N sections and sample points\n     * are taken from min to max-(max-min)/N. Usually f(x) is periodic\n     * such that f(min) \u003d f(max) (note max is not sampled), but we don\u0027t\n     * require that.\u003c/p\u003e\n     *\n     * @param f the function to be sampled\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the samples array\n     * @throws FunctionEvaluationException if function cannot be evaluated\n     * at some point\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
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
      "end_line": 500,
      "comment": "\n     * Verifies that the data set has length of power of 2.\n     *\n     * @param d the data array\n     * @throws IllegalArgumentException if array length is not power of 2\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 499,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(java.lang.Object[])",
      "begin_line": 508,
      "end_line": 514,
      "comment": "\n     * Verifies that the data set has length of power of 2.\n     *\n     * @param o the data array\n     * @throws IllegalArgumentException if array length is not power of 2\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 513,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.verifyInterval(double, double)",
      "begin_line": 523,
      "end_line": 531,
      "comment": "\n     * Verifies that the endpoints specify an interval.\n     *\n     * @param lower lower endpoint\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException if not interval\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 530,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.mdfft(java.lang.Object, boolean)",
      "begin_line": 547,
      "end_line": 557,
      "comment": "\n     * Performs a multi-dimensional Fourier transform on a given array.\n     * Use {@link #inversetransform2(Complex[])} and\n     * {@link #transform2(Complex[])} in a row-column implementation\n     * in any number of dimensions with O(N\u0026times;log(N)) complexity with\n     * N\u003dn\u003csub\u003e1\u003c/sub\u003e\u0026times;n\u003csub\u003e2\u003c/sub\u003e\u0026times;n\u003csub\u003e3\u003c/sub\u003e\u0026times;...\u0026times;n\u003csub\u003ed\u003c/sub\u003e,\n     * n\u003csub\u003ex\u003c/sub\u003e\u003dnumber of elements in dimension x,\n     * and d\u003dtotal number of dimensions.\n     *\n     * @param mdca Multi-Dimensional Complex Array id est Complex[][][][]\n     * @param forward inverseTransform2 is preformed if this is false\n     * @return transform of mdca as a Multi-Dimensional Complex Array id est Complex[][][][]\n     * @throws IllegalArgumentException if any dimension is not a power of two\n     ",
      "child_ranges": [
        "(line 549,col 9)-(line 550,col 64)",
        "(line 551,col 9)-(line 551,col 55)",
        "(line 553,col 9)-(line 555,col 9)",
        "(line 556,col 9)-(line 556,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.mdfft(org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix, boolean, int, int[])",
      "begin_line": 568,
      "end_line": 607,
      "comment": "\n     * Performs one dimension of a multi-dimensional Fourier transform.\n     *\n     * @param mdcm input matrix\n     * @param forward inverseTransform2 is preformed if this is false\n     * @param d index of the dimension to process\n     * @param subVector recursion subvector\n     * @throws IllegalArgumentException if any dimension is not a power of two\n     ",
      "child_ranges": [
        "(line 571,col 9)-(line 571,col 55)",
        "(line 573,col 9)-(line 605,col 9)",
        "(line 606,col 9)-(line 606,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultiDimensionalComplexMatrix",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable"
      ],
      "begin_line": 616,
      "end_line": 773,
      "comment": "\n     * Complex matrix implementation.\n     * Not designed for synchronized access\n     * may eventually be replaced by jsr-83 of the java community process\n     * http://jcp.org/en/jsr/detail?id\u003d83\n     * may require additional exception throws for other basic requirements.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dimensionSize"
      ],
      "begin_line": 620,
      "end_line": 620,
      "comment": " Size in all dimensions. "
    },
    {
      "type": "field",
      "varNames": [
        "multiDimensionalComplexArray"
      ],
      "begin_line": 623,
      "end_line": 623,
      "comment": " Storage array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.MultiDimensionalComplexMatrix(java.lang.Object)",
      "begin_line": 628,
      "end_line": 653,
      "comment": " Simple constructor.\n         * @param multiDimensionalComplexArray array containing the matrix elements\n         ",
      "child_ranges": [
        "(line 630,col 13)-(line 630,col 77)",
        "(line 633,col 13)-(line 633,col 36)",
        "(line 634,col 13)-(line 639,col 13)",
        "(line 642,col 13)-(line 642,col 53)",
        "(line 645,col 13)-(line 645,col 32)",
        "(line 646,col 13)-(line 651,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.get(int...)",
      "begin_line": 661,
      "end_line": 683,
      "comment": "\n         * Get a matrix element.\n         * @param vector indices of the element\n         * @return matrix element\n         * @exception IllegalArgumentException if dimensions do not match\n         ",
      "child_ranges": [
        "(line 663,col 13)-(line 670,col 13)",
        "(line 671,col 13)-(line 675,col 13)",
        "(line 677,col 13)-(line 677,col 64)",
        "(line 679,col 13)-(line 681,col 13)",
        "(line 682,col 13)-(line 682,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.set(org.apache.commons.math.complex.Complex, int...)",
      "begin_line": 692,
      "end_line": 717,
      "comment": "\n         * Set a matrix element.\n         * @param magnitude magnitude of the element\n         * @param vector indices of the element\n         * @return the previous value\n         * @exception IllegalArgumentException if dimensions do not match\n         ",
      "child_ranges": [
        "(line 694,col 13)-(line 701,col 13)",
        "(line 702,col 13)-(line 706,col 13)",
        "(line 708,col 13)-(line 708,col 77)",
        "(line 709,col 13)-(line 711,col 13)",
        "(line 713,col 13)-(line 713,col 90)",
        "(line 714,col 13)-(line 714,col 72)",
        "(line 716,col 13)-(line 716,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.getDimensionSizes()",
      "begin_line": 723,
      "end_line": 725,
      "comment": "\n         * Get the size in all dimensions.\n         * @return size in all dimensions\n         ",
      "child_ranges": [
        "(line 724,col 13)-(line 724,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.getArray()",
      "begin_line": 731,
      "end_line": 733,
      "comment": "\n         * Get the underlying storage array\n         * @return underlying storage array\n         ",
      "child_ranges": [
        "(line 732,col 13)-(line 732,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.clone()",
      "begin_line": 736,
      "end_line": 743,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 738,col 13)-(line 740,col 51)",
        "(line 741,col 13)-(line 741,col 24)",
        "(line 742,col 13)-(line 742,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.clone(org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix)",
      "begin_line": 749,
      "end_line": 772,
      "comment": "\n         * Copy contents of current array into mdcm.\n         * @param mdcm array where to copy data\n         ",
      "child_ranges": [
        "(line 750,col 13)-(line 750,col 57)",
        "(line 751,col 13)-(line 751,col 25)",
        "(line 752,col 13)-(line 754,col 13)",
        "(line 755,col 13)-(line 755,col 69)",
        "(line 756,col 13)-(line 767,col 13)",
        "(line 769,col 13)-(line 771,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RootsOfUnity",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 779,
      "end_line": 921,
      "comment": " Computes the n\u003csup\u003eth\u003c/sup\u003e roots of unity.\n     * A cache of already computed values is maintained.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 782,
      "end_line": 782,
      "comment": " Serializable version id. "
    },
    {
      "type": "field",
      "varNames": [
        "omegaCount"
      ],
      "begin_line": 785,
      "end_line": 785,
      "comment": " Number of roots of unity. "
    },
    {
      "type": "field",
      "varNames": [
        "omegaReal"
      ],
      "begin_line": 788,
      "end_line": 788,
      "comment": " Real part of the roots. "
    },
    {
      "type": "field",
      "varNames": [
        "omegaImaginaryForward"
      ],
      "begin_line": 791,
      "end_line": 791,
      "comment": " Imaginary part of the roots for forward transform. "
    },
    {
      "type": "field",
      "varNames": [
        "omegaImaginaryInverse"
      ],
      "begin_line": 794,
      "end_line": 794,
      "comment": " Imaginary part of the roots for reverse transform. "
    },
    {
      "type": "field",
      "varNames": [
        "isForward"
      ],
      "begin_line": 797,
      "end_line": 797,
      "comment": " Forward/reverse indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity.RootsOfUnity()",
      "begin_line": 802,
      "end_line": 810,
      "comment": "\n       * Build an engine for computing then \u003csup\u003eth\u003c/sup\u003e roots of unity\n       ",
      "child_ranges": [
        "(line 804,col 9)-(line 804,col 23)",
        "(line 805,col 9)-(line 805,col 25)",
        "(line 806,col 9)-(line 806,col 37)",
        "(line 807,col 9)-(line 807,col 37)",
        "(line 808,col 9)-(line 808,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity.isForward()",
      "begin_line": 817,
      "end_line": 825,
      "comment": "\n       * Check if computation has been done for forward or reverse transform.\n       * @return true if computation has been done for forward transform\n       * @throws IllegalStateException if no roots of unity have been computed yet\n       ",
      "child_ranges": [
        "(line 819,col 9)-(line 822,col 9)",
        "(line 823,col 9)-(line 823,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity.computeOmega(int)",
      "begin_line": 836,
      "end_line": 871,
      "comment": " Computes the n\u003csup\u003eth\u003c/sup\u003e roots of unity.\n       * \u003cp\u003eThe computed omega[] \u003d { 1, w, w\u003csup\u003e2\u003c/sup\u003e, ... w\u003csup\u003e(n-1)\u003c/sup\u003e } where\n       * w \u003d exp(-2 \u0026pi; i / n), i \u003d \u0026sqrt;(-1).\u003c/p\u003e\n       * \u003cp\u003eNote that n is positive for\n       * forward transform and negative for inverse transform.\u003c/p\u003e\n       * @param n number of roots of unity to compute,\n       * positive for forward transform, negative for inverse transform\n       * @throws IllegalArgumentException if n \u003d 0\n       ",
      "child_ranges": [
        "(line 838,col 9)-(line 841,col 9)",
        "(line 843,col 9)-(line 843,col 26)",
        "(line 846,col 9)-(line 846,col 37)",
        "(line 848,col 9)-(line 850,col 9)",
        "(line 853,col 9)-(line 853,col 49)",
        "(line 854,col 9)-(line 854,col 40)",
        "(line 855,col 9)-(line 855,col 40)",
        "(line 856,col 9)-(line 856,col 49)",
        "(line 857,col 9)-(line 857,col 49)",
        "(line 858,col 9)-(line 858,col 49)",
        "(line 859,col 9)-(line 859,col 39)",
        "(line 860,col 9)-(line 860,col 39)",
        "(line 861,col 9)-(line 861,col 39)",
        "(line 862,col 9)-(line 868,col 9)",
        "(line 869,col 9)-(line 869,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity.getOmegaReal(int)",
      "begin_line": 880,
      "end_line": 895,
      "comment": "\n       * Get the real part of the k\u003csup\u003eth\u003c/sup\u003e n\u003csup\u003eth\u003c/sup\u003e root of unity\n       * @param k index of the n\u003csup\u003eth\u003c/sup\u003e root of unity\n       * @return real part of the k\u003csup\u003eth\u003c/sup\u003e n\u003csup\u003eth\u003c/sup\u003e root of unity\n       * @throws IllegalStateException if no roots of unity have been computed yet\n       * @throws IllegalArgumentException if k is out of range\n       ",
      "child_ranges": [
        "(line 883,col 9)-(line 886,col 9)",
        "(line 887,col 9)-(line 891,col 9)",
        "(line 893,col 9)-(line 893,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity.getOmegaImaginary(int)",
      "begin_line": 904,
      "end_line": 919,
      "comment": "\n       * Get the imaginary part of the k\u003csup\u003eth\u003c/sup\u003e n\u003csup\u003eth\u003c/sup\u003e root of unity\n       * @param k index of the n\u003csup\u003eth\u003c/sup\u003e root of unity\n       * @return imaginary part of the k\u003csup\u003eth\u003c/sup\u003e n\u003csup\u003eth\u003c/sup\u003e root of unity\n       * @throws IllegalStateException if no roots of unity have been computed yet\n       * @throws IllegalArgumentException if k is out of range\n       ",
      "child_ranges": [
        "(line 907,col 9)-(line 910,col 9)",
        "(line 911,col 9)-(line 915,col 9)",
        "(line 917,col 9)-(line 917,col 79)"
      ]
    }
  ]
}