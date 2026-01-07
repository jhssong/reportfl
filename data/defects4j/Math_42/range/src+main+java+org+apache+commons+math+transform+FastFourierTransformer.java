{
  "filepath": "/tmp/Math-42b/src/main/java/org/apache/commons/math/transform/FastFourierTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastFourierTransformer",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 47,
      "end_line": 903,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/FastFourierTransform.html\"\u003e\n * Fast Fourier Transform\u003c/a\u003e for transformation of one-dimensional data sets.\n * For reference, see \u003cb\u003eApplied Numerical Linear Algebra\u003c/b\u003e, ISBN 0898713897,\n * chapter 6.\n * \u003cp\u003e\n * There are several conventions for the definition of FFT and inverse FFT,\n * mainly on different coefficient and exponent. Here the equations are listed\n * in the comments of the corresponding methods.\u003c/p\u003e\n * \u003cp\u003e\n * We require the length of data set to be power of 2, this greatly simplifies\n * and speeds up the code. Users can pad the data with zeros to meet this\n * requirement. There are other flavors of FFT, for reference, see S. Winograd,\n * \u003ci\u003eOn computing the discrete Fourier transform\u003c/i\u003e, Mathematics of Computation,\n * 32 (1978), 175 - 199.\u003c/p\u003e\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "roots"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " roots of unity "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.FastFourierTransformer()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Construct a default transformer.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform(double[])",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ y_n \u003d \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k $\n     * \u003c/p\u003e\n     *\n     * @param f the real data array to be transformed\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform(org.apache.commons.math.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 90,
      "end_line": 95,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ y_n \u003d \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k $\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 47)",
        "(line 94,col 9)-(line 94,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform(org.apache.commons.math.complex.Complex[])",
      "begin_line": 107,
      "end_line": 111,
      "comment": "\n     * Transform the given complex data set.\n     * \u003cp\u003e\n     * The formula is $ y_n \u003d \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k $\n     * \u003c/p\u003e\n     *\n     * @param f the complex data array to be transformed\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 37)",
        "(line 110,col 9)-(line 110,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform2(double[])",
      "begin_line": 123,
      "end_line": 128,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $y_n \u003d (1/\\sqrt{N}) \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k$\n     * \u003c/p\u003e\n     *\n     * @param f the real data array to be transformed\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 67)",
        "(line 127,col 9)-(line 127,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform2(org.apache.commons.math.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 143,
      "end_line": 150,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $y_n \u003d (1/\\sqrt{N}) \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k$\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 47)",
        "(line 148,col 9)-(line 148,col 60)",
        "(line 149,col 9)-(line 149,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform2(org.apache.commons.math.complex.Complex[])",
      "begin_line": 162,
      "end_line": 168,
      "comment": "\n     * Transform the given complex data set.\n     * \u003cp\u003e\n     * The formula is $y_n \u003d (1/\\sqrt{N}) \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k$\n     * \u003c/p\u003e\n     *\n     * @param f the complex data array to be transformed\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 37)",
        "(line 166,col 9)-(line 166,col 67)",
        "(line 167,col 9)-(line 167,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inversetransform(double[])",
      "begin_line": 180,
      "end_line": 185,
      "comment": "\n     * Inversely transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ x_k \u003d (1/N) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n $\n     * \u003c/p\u003e\n     *\n     * @param f the real data array to be inversely transformed\n     * @return the complex inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 52)",
        "(line 184,col 9)-(line 184,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inversetransform(org.apache.commons.math.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 200,
      "end_line": 207,
      "comment": "\n     * Inversely transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ x_k \u003d (1/N) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n $\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the complex inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 47)",
        "(line 205,col 9)-(line 205,col 45)",
        "(line 206,col 9)-(line 206,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inversetransform(org.apache.commons.math.complex.Complex[])",
      "begin_line": 219,
      "end_line": 225,
      "comment": "\n     * Inversely transform the given complex data set.\n     * \u003cp\u003e\n     * The formula is $ x_k \u003d (1/N) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n $\n     * \u003c/p\u003e\n     *\n     * @param f the complex data array to be inversely transformed\n     * @return the complex inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 38)",
        "(line 223,col 9)-(line 223,col 52)",
        "(line 224,col 9)-(line 224,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inversetransform2(double[])",
      "begin_line": 237,
      "end_line": 242,
      "comment": "\n     * Inversely transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $x_k \u003d (1/\\sqrt{N}) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n$\n     * \u003c/p\u003e\n     *\n     * @param f the real data array to be inversely transformed\n     * @return the complex inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 67)",
        "(line 241,col 9)-(line 241,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inversetransform2(org.apache.commons.math.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 257,
      "end_line": 264,
      "comment": "\n     * Inversely transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $x_k \u003d (1/\\sqrt{N}) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n$\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the complex inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 47)",
        "(line 262,col 9)-(line 262,col 60)",
        "(line 263,col 9)-(line 263,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inversetransform2(org.apache.commons.math.complex.Complex[])",
      "begin_line": 276,
      "end_line": 282,
      "comment": "\n     * Inversely transform the given complex data set.\n     * \u003cp\u003e\n     * The formula is $x_k \u003d (1/\\sqrt{N}) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n$\n     * \u003c/p\u003e\n     *\n     * @param f the complex data array to be inversely transformed\n     * @return the complex inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 38)",
        "(line 280,col 9)-(line 280,col 67)",
        "(line 281,col 9)-(line 281,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.fft(double[], boolean)",
      "begin_line": 292,
      "end_line": 328,
      "comment": "\n     * Perform the base-4 Cooley-Tukey FFT algorithm (including inverse).\n     *\n     * @param f the real data array to be transformed\n     * @param isInverse the indicator of forward or inverse transform\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 25)",
        "(line 296,col 9)-(line 296,col 44)",
        "(line 297,col 9)-(line 300,col 9)",
        "(line 304,col 9)-(line 304,col 30)",
        "(line 305,col 9)-(line 305,col 37)",
        "(line 306,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 309,col 47)",
        "(line 310,col 9)-(line 310,col 29)",
        "(line 313,col 9)-(line 313,col 51)",
        "(line 314,col 9)-(line 314,col 76)",
        "(line 315,col 9)-(line 315,col 76)",
        "(line 316,col 9)-(line 325,col 9)",
        "(line 327,col 9)-(line 327,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.fft(org.apache.commons.math.complex.Complex[])",
      "begin_line": 337,
      "end_line": 403,
      "comment": "\n     * Perform the base-4 Cooley-Tukey FFT algorithm (including inverse).\n     *\n     * @param data the complex data array to be transformed\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 34)",
        "(line 341,col 9)-(line 341,col 43)",
        "(line 344,col 9)-(line 344,col 28)",
        "(line 345,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 353,col 9)",
        "(line 356,col 9)-(line 356,col 19)",
        "(line 357,col 9)-(line 364,col 9)",
        "(line 367,col 9)-(line 379,col 9)",
        "(line 382,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 402,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.sample(org.apache.commons.math.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 420,
      "end_line": 436,
      "comment": "\n     * Sample the given univariate real function on the given interval.\n     * \u003cp\u003e\n     * The interval is divided equally into N sections and sample points\n     * are taken from min to max-(max-min)/N. Usually f(x) is periodic\n     * such that f(min) \u003d f(max) (note max is not sampled), but we don\u0027t\n     * require that.\u003c/p\u003e\n     *\n     * @param f the function to be sampled\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the samples array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 427,col 9)",
        "(line 428,col 9)-(line 428,col 33)",
        "(line 430,col 9)-(line 430,col 35)",
        "(line 431,col 9)-(line 431,col 35)",
        "(line 432,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 435,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.scaleArray(double[], double)",
      "begin_line": 446,
      "end_line": 451,
      "comment": "\n     * Multiply every component in the given real array by the\n     * given real number. The change is made in place.\n     *\n     * @param f the real array to be scaled\n     * @param d the real scaling coefficient\n     * @return a reference to the scaled array\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 450,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.scaleArray(org.apache.commons.math.complex.Complex[], double)",
      "begin_line": 461,
      "end_line": 466,
      "comment": "\n     * Multiply every component in the given complex array by the\n     * given real number. The change is made in place.\n     *\n     * @param f the complex array to be scaled\n     * @param d the real scaling coefficient\n     * @return a reference to the scaled array\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 464,col 9)",
        "(line 465,col 9)-(line 465,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.isPowerOf2(long)",
      "begin_line": 474,
      "end_line": 476,
      "comment": "\n     * Returns true if the argument is power of 2.\n     *\n     * @param n the number to test\n     * @return true if the argument is power of 2\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(double[])",
      "begin_line": 484,
      "end_line": 489,
      "comment": "\n     * Verifies that the data set has length of power of 2.\n     *\n     * @param d the data array\n     * @throws IllegalArgumentException if array length is not power of 2\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 488,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(java.lang.Object[])",
      "begin_line": 497,
      "end_line": 502,
      "comment": "\n     * Verifies that the data set has length of power of 2.\n     *\n     * @param o the data array\n     * @throws IllegalArgumentException if array length is not power of 2\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 501,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.verifyInterval(double, double)",
      "begin_line": 511,
      "end_line": 519,
      "comment": "\n     * Verifies that the endpoints specify an interval.\n     *\n     * @param lower lower endpoint\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException if not interval\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 518,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.mdfft(java.lang.Object, boolean)",
      "begin_line": 535,
      "end_line": 545,
      "comment": "\n     * Performs a multi-dimensional Fourier transform on a given array.\n     * Use {@link #inversetransform2(Complex[])} and\n     * {@link #transform2(Complex[])} in a row-column implementation\n     * in any number of dimensions with O(N\u0026times;log(N)) complexity with\n     * N\u003dn\u003csub\u003e1\u003c/sub\u003e\u0026times;n\u003csub\u003e2\u003c/sub\u003e\u0026times;n\u003csub\u003e3\u003c/sub\u003e\u0026times;...\u0026times;n\u003csub\u003ed\u003c/sub\u003e,\n     * n\u003csub\u003ex\u003c/sub\u003e\u003dnumber of elements in dimension x,\n     * and d\u003dtotal number of dimensions.\n     *\n     * @param mdca Multi-Dimensional Complex Array id est Complex[][][][]\n     * @param forward inverseTransform2 is preformed if this is false\n     * @return transform of mdca as a Multi-Dimensional Complex Array id est Complex[][][][]\n     * @throws IllegalArgumentException if any dimension is not a power of two\n     ",
      "child_ranges": [
        "(line 537,col 9)-(line 538,col 64)",
        "(line 539,col 9)-(line 539,col 55)",
        "(line 541,col 9)-(line 543,col 9)",
        "(line 544,col 9)-(line 544,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.mdfft(org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix, boolean, int, int[])",
      "begin_line": 556,
      "end_line": 596,
      "comment": "\n     * Performs one dimension of a multi-dimensional Fourier transform.\n     *\n     * @param mdcm input matrix\n     * @param forward inverseTransform2 is preformed if this is false\n     * @param d index of the dimension to process\n     * @param subVector recursion subvector\n     * @throws IllegalArgumentException if any dimension is not a power of two\n     ",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 55)",
        "(line 561,col 9)-(line 594,col 9)",
        "(line 595,col 9)-(line 595,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultiDimensionalComplexMatrix",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable"
      ],
      "begin_line": 605,
      "end_line": 758,
      "comment": "\n     * Complex matrix implementation.\n     * Not designed for synchronized access\n     * may eventually be replaced by jsr-83 of the java community process\n     * http://jcp.org/en/jsr/detail?id\u003d83\n     * may require additional exception throws for other basic requirements.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dimensionSize"
      ],
      "begin_line": 609,
      "end_line": 609,
      "comment": " Size in all dimensions. "
    },
    {
      "type": "field",
      "varNames": [
        "multiDimensionalComplexArray"
      ],
      "begin_line": 612,
      "end_line": 612,
      "comment": " Storage array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.MultiDimensionalComplexMatrix(java.lang.Object)",
      "begin_line": 617,
      "end_line": 642,
      "comment": " Simple constructor.\n         * @param multiDimensionalComplexArray array containing the matrix elements\n         ",
      "child_ranges": [
        "(line 619,col 13)-(line 619,col 77)",
        "(line 622,col 13)-(line 622,col 36)",
        "(line 623,col 13)-(line 628,col 13)",
        "(line 631,col 13)-(line 631,col 53)",
        "(line 634,col 13)-(line 634,col 32)",
        "(line 635,col 13)-(line 640,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.get(int...)",
      "begin_line": 650,
      "end_line": 670,
      "comment": "\n         * Get a matrix element.\n         * @param vector indices of the element\n         * @return matrix element\n         * @exception IllegalArgumentException if dimensions do not match\n         ",
      "child_ranges": [
        "(line 652,col 13)-(line 658,col 13)",
        "(line 659,col 13)-(line 662,col 13)",
        "(line 664,col 13)-(line 664,col 64)",
        "(line 666,col 13)-(line 668,col 13)",
        "(line 669,col 13)-(line 669,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.set(org.apache.commons.math.complex.Complex, int...)",
      "begin_line": 679,
      "end_line": 702,
      "comment": "\n         * Set a matrix element.\n         * @param magnitude magnitude of the element\n         * @param vector indices of the element\n         * @return the previous value\n         * @exception IllegalArgumentException if dimensions do not match\n         ",
      "child_ranges": [
        "(line 681,col 13)-(line 687,col 13)",
        "(line 688,col 13)-(line 691,col 13)",
        "(line 693,col 13)-(line 693,col 77)",
        "(line 694,col 13)-(line 696,col 13)",
        "(line 698,col 13)-(line 698,col 90)",
        "(line 699,col 13)-(line 699,col 72)",
        "(line 701,col 13)-(line 701,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.getDimensionSizes()",
      "begin_line": 708,
      "end_line": 710,
      "comment": "\n         * Get the size in all dimensions.\n         * @return size in all dimensions\n         ",
      "child_ranges": [
        "(line 709,col 13)-(line 709,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.getArray()",
      "begin_line": 716,
      "end_line": 718,
      "comment": "\n         * Get the underlying storage array\n         * @return underlying storage array\n         ",
      "child_ranges": [
        "(line 717,col 13)-(line 717,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.clone()",
      "begin_line": 721,
      "end_line": 728,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 723,col 13)-(line 725,col 51)",
        "(line 726,col 13)-(line 726,col 24)",
        "(line 727,col 13)-(line 727,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.clone(org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix)",
      "begin_line": 734,
      "end_line": 757,
      "comment": "\n         * Copy contents of current array into mdcm.\n         * @param mdcm array where to copy data\n         ",
      "child_ranges": [
        "(line 735,col 13)-(line 735,col 57)",
        "(line 736,col 13)-(line 736,col 25)",
        "(line 737,col 13)-(line 739,col 13)",
        "(line 740,col 13)-(line 740,col 69)",
        "(line 741,col 13)-(line 752,col 13)",
        "(line 754,col 13)-(line 756,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RootsOfUnity",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 764,
      "end_line": 901,
      "comment": " Computes the n\u003csup\u003eth\u003c/sup\u003e roots of unity.\n     * A cache of already computed values is maintained.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 767,
      "end_line": 767,
      "comment": " Serializable version id. "
    },
    {
      "type": "field",
      "varNames": [
        "omegaCount"
      ],
      "begin_line": 770,
      "end_line": 770,
      "comment": " Number of roots of unity. "
    },
    {
      "type": "field",
      "varNames": [
        "omegaReal"
      ],
      "begin_line": 773,
      "end_line": 773,
      "comment": " Real part of the roots. "
    },
    {
      "type": "field",
      "varNames": [
        "omegaImaginaryForward"
      ],
      "begin_line": 776,
      "end_line": 776,
      "comment": " Imaginary part of the roots for forward transform. "
    },
    {
      "type": "field",
      "varNames": [
        "omegaImaginaryInverse"
      ],
      "begin_line": 779,
      "end_line": 779,
      "comment": " Imaginary part of the roots for reverse transform. "
    },
    {
      "type": "field",
      "varNames": [
        "isForward"
      ],
      "begin_line": 782,
      "end_line": 782,
      "comment": " Forward/reverse indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity.RootsOfUnity()",
      "begin_line": 787,
      "end_line": 795,
      "comment": "\n       * Build an engine for computing then \u003csup\u003eth\u003c/sup\u003e roots of unity\n       ",
      "child_ranges": [
        "(line 789,col 9)-(line 789,col 23)",
        "(line 790,col 9)-(line 790,col 25)",
        "(line 791,col 9)-(line 791,col 37)",
        "(line 792,col 9)-(line 792,col 37)",
        "(line 793,col 9)-(line 793,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity.isForward()",
      "begin_line": 802,
      "end_line": 809,
      "comment": "\n       * Check if computation has been done for forward or reverse transform.\n       * @return true if computation has been done for forward transform\n       * @throws IllegalStateException if no roots of unity have been computed yet\n       ",
      "child_ranges": [
        "(line 804,col 9)-(line 806,col 9)",
        "(line 807,col 9)-(line 807,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity.computeOmega(int)",
      "begin_line": 820,
      "end_line": 855,
      "comment": " Computes the n\u003csup\u003eth\u003c/sup\u003e roots of unity.\n       * \u003cp\u003eThe computed omega[] \u003d { 1, w, w\u003csup\u003e2\u003c/sup\u003e, ... w\u003csup\u003e(n-1)\u003c/sup\u003e } where\n       * w \u003d exp(-2 \u0026pi; i / n), i \u003d \u0026sqrt;(-1).\u003c/p\u003e\n       * \u003cp\u003eNote that n is positive for\n       * forward transform and negative for inverse transform.\u003c/p\u003e\n       * @param n number of roots of unity to compute,\n       * positive for forward transform, negative for inverse transform\n       * @throws IllegalArgumentException if n \u003d 0\n       ",
      "child_ranges": [
        "(line 822,col 9)-(line 825,col 9)",
        "(line 827,col 9)-(line 827,col 26)",
        "(line 830,col 9)-(line 830,col 41)",
        "(line 832,col 9)-(line 834,col 9)",
        "(line 837,col 9)-(line 837,col 53)",
        "(line 838,col 9)-(line 838,col 44)",
        "(line 839,col 9)-(line 839,col 44)",
        "(line 840,col 9)-(line 840,col 49)",
        "(line 841,col 9)-(line 841,col 49)",
        "(line 842,col 9)-(line 842,col 49)",
        "(line 843,col 9)-(line 843,col 39)",
        "(line 844,col 9)-(line 844,col 39)",
        "(line 845,col 9)-(line 845,col 39)",
        "(line 846,col 9)-(line 852,col 9)",
        "(line 853,col 9)-(line 853,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity.getOmegaReal(int)",
      "begin_line": 864,
      "end_line": 877,
      "comment": "\n       * Get the real part of the k\u003csup\u003eth\u003c/sup\u003e n\u003csup\u003eth\u003c/sup\u003e root of unity\n       * @param k index of the n\u003csup\u003eth\u003c/sup\u003e root of unity\n       * @return real part of the k\u003csup\u003eth\u003c/sup\u003e n\u003csup\u003eth\u003c/sup\u003e root of unity\n       * @throws IllegalStateException if no roots of unity have been computed yet\n       * @throws IllegalArgumentException if k is out of range\n       ",
      "child_ranges": [
        "(line 867,col 9)-(line 869,col 9)",
        "(line 870,col 9)-(line 873,col 9)",
        "(line 875,col 9)-(line 875,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity.getOmegaImaginary(int)",
      "begin_line": 886,
      "end_line": 899,
      "comment": "\n       * Get the imaginary part of the k\u003csup\u003eth\u003c/sup\u003e n\u003csup\u003eth\u003c/sup\u003e root of unity\n       * @param k index of the n\u003csup\u003eth\u003c/sup\u003e root of unity\n       * @return imaginary part of the k\u003csup\u003eth\u003c/sup\u003e n\u003csup\u003eth\u003c/sup\u003e root of unity\n       * @throws IllegalStateException if no roots of unity have been computed yet\n       * @throws IllegalArgumentException if k is out of range\n       ",
      "child_ranges": [
        "(line 889,col 9)-(line 891,col 9)",
        "(line 892,col 9)-(line 895,col 9)",
        "(line 897,col 9)-(line 897,col 79)"
      ]
    }
  ]
}