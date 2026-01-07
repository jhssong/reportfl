{
  "filepath": "/tmp/Math-40b/src/main/java/org/apache/commons/math/transform/FastFourierTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastFourierTransformer",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 47,
      "end_line": 901,
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
      "comment": " The roots of unity. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.FastFourierTransformer()",
      "begin_line": 56,
      "end_line": 58,
      "comment": " Construct a default transformer. ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform(double[])",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ y_n \u003d \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k $\n     * \u003c/p\u003e\n     *\n     * @param f the real data array to be transformed\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform(org.apache.commons.math.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 88,
      "end_line": 93,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ y_n \u003d \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k $\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 47)",
        "(line 92,col 9)-(line 92,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform(org.apache.commons.math.complex.Complex[])",
      "begin_line": 105,
      "end_line": 109,
      "comment": "\n     * Transform the given complex data set.\n     * \u003cp\u003e\n     * The formula is $ y_n \u003d \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k $\n     * \u003c/p\u003e\n     *\n     * @param f the complex data array to be transformed\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 37)",
        "(line 108,col 9)-(line 108,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform2(double[])",
      "begin_line": 121,
      "end_line": 126,
      "comment": "\n     * Transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $y_n \u003d (1/\\sqrt{N}) \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k$\n     * \u003c/p\u003e\n     *\n     * @param f the real data array to be transformed\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 66)",
        "(line 125,col 9)-(line 125,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform2(org.apache.commons.math.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 141,
      "end_line": 148,
      "comment": "\n     * Transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $y_n \u003d (1/\\sqrt{N}) \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k$\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 47)",
        "(line 146,col 9)-(line 146,col 59)",
        "(line 147,col 9)-(line 147,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform2(org.apache.commons.math.complex.Complex[])",
      "begin_line": 160,
      "end_line": 166,
      "comment": "\n     * Transform the given complex data set.\n     * \u003cp\u003e\n     * The formula is $y_n \u003d (1/\\sqrt{N}) \\Sigma_{k\u003d0}^{N-1} e^{-2 \\pi i nk/N} x_k$\n     * \u003c/p\u003e\n     *\n     * @param f the complex data array to be transformed\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 37)",
        "(line 164,col 9)-(line 164,col 66)",
        "(line 165,col 9)-(line 165,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inverseTransform(double[])",
      "begin_line": 178,
      "end_line": 183,
      "comment": "\n     * Inversely transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $ x_k \u003d (1/N) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n $\n     * \u003c/p\u003e\n     *\n     * @param f the real data array to be inversely transformed\n     * @return the complex inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 51)",
        "(line 182,col 9)-(line 182,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inverseTransform(org.apache.commons.math.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 198,
      "end_line": 205,
      "comment": "\n     * Inversely transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $ x_k \u003d (1/N) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n $\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the complex inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 47)",
        "(line 203,col 9)-(line 203,col 44)",
        "(line 204,col 9)-(line 204,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inverseTransform(org.apache.commons.math.complex.Complex[])",
      "begin_line": 217,
      "end_line": 223,
      "comment": "\n     * Inversely transform the given complex data set.\n     * \u003cp\u003e\n     * The formula is $ x_k \u003d (1/N) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n $\n     * \u003c/p\u003e\n     *\n     * @param f the complex data array to be inversely transformed\n     * @return the complex inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 38)",
        "(line 221,col 9)-(line 221,col 51)",
        "(line 222,col 9)-(line 222,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inverseTransform2(double[])",
      "begin_line": 235,
      "end_line": 240,
      "comment": "\n     * Inversely transform the given real data set.\n     * \u003cp\u003e\n     * The formula is $x_k \u003d (1/\\sqrt{N}) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n$\n     * \u003c/p\u003e\n     *\n     * @param f the real data array to be inversely transformed\n     * @return the complex inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 66)",
        "(line 239,col 9)-(line 239,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inverseTransform2(org.apache.commons.math.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 255,
      "end_line": 262,
      "comment": "\n     * Inversely transform the given real function, sampled on the given interval.\n     * \u003cp\u003e\n     * The formula is $x_k \u003d (1/\\sqrt{N}) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n$\n     * \u003c/p\u003e\n     *\n     * @param f the function to be sampled and inversely transformed\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the complex inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 47)",
        "(line 260,col 9)-(line 260,col 59)",
        "(line 261,col 9)-(line 261,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inverseTransform2(org.apache.commons.math.complex.Complex[])",
      "begin_line": 274,
      "end_line": 280,
      "comment": "\n     * Inversely transform the given complex data set.\n     * \u003cp\u003e\n     * The formula is $x_k \u003d (1/\\sqrt{N}) \\Sigma_{n\u003d0}^{N-1} e^{2 \\pi i nk/N} y_n$\n     * \u003c/p\u003e\n     *\n     * @param f the complex data array to be inversely transformed\n     * @return the complex inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 38)",
        "(line 278,col 9)-(line 278,col 66)",
        "(line 279,col 9)-(line 279,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.fft(double[], boolean)",
      "begin_line": 290,
      "end_line": 326,
      "comment": "\n     * Perform the base-4 Cooley-Tukey FFT algorithm (including inverse).\n     *\n     * @param f the real data array to be transformed\n     * @param isInverse the indicator of forward or inverse transform\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 25)",
        "(line 294,col 9)-(line 294,col 54)",
        "(line 295,col 9)-(line 298,col 9)",
        "(line 302,col 9)-(line 302,col 30)",
        "(line 303,col 9)-(line 303,col 44)",
        "(line 304,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 307,col 47)",
        "(line 308,col 9)-(line 308,col 36)",
        "(line 311,col 9)-(line 311,col 55)",
        "(line 312,col 9)-(line 312,col 86)",
        "(line 313,col 9)-(line 313,col 86)",
        "(line 314,col 9)-(line 323,col 9)",
        "(line 325,col 9)-(line 325,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.fft(org.apache.commons.math.complex.Complex[])",
      "begin_line": 335,
      "end_line": 401,
      "comment": "\n     * Perform the base-4 Cooley-Tukey FFT algorithm (including inverse).\n     *\n     * @param data the complex data array to be transformed\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 34)",
        "(line 339,col 9)-(line 339,col 43)",
        "(line 342,col 9)-(line 342,col 28)",
        "(line 343,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 351,col 9)",
        "(line 354,col 9)-(line 354,col 19)",
        "(line 355,col 9)-(line 362,col 9)",
        "(line 365,col 9)-(line 377,col 9)",
        "(line 380,col 9)-(line 399,col 9)",
        "(line 400,col 9)-(line 400,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.sample(org.apache.commons.math.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 418,
      "end_line": 434,
      "comment": "\n     * Sample the given univariate real function on the given interval.\n     * \u003cp\u003e\n     * The interval is divided equally into N sections and sample points\n     * are taken from min to max-(max-min)/N. Usually f(x) is periodic\n     * such that f(min) \u003d f(max) (note max is not sampled), but we don\u0027t\n     * require that.\u003c/p\u003e\n     *\n     * @param f the function to be sampled\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the number of sample points\n     * @return the samples array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 426,col 33)",
        "(line 428,col 9)-(line 428,col 35)",
        "(line 429,col 9)-(line 429,col 35)",
        "(line 430,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 433,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.scaleArray(double[], double)",
      "begin_line": 444,
      "end_line": 449,
      "comment": "\n     * Multiply every component in the given real array by the\n     * given real number. The change is made in place.\n     *\n     * @param f the real array to be scaled\n     * @param d the real scaling coefficient\n     * @return a reference to the scaled array\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 448,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.scaleArray(org.apache.commons.math.complex.Complex[], double)",
      "begin_line": 459,
      "end_line": 464,
      "comment": "\n     * Multiply every component in the given complex array by the\n     * given real number. The change is made in place.\n     *\n     * @param f the complex array to be scaled\n     * @param d the real scaling coefficient\n     * @return a reference to the scaled array\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 463,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.isPowerOf2(long)",
      "begin_line": 472,
      "end_line": 474,
      "comment": "\n     * Returns true if the argument is power of 2.\n     *\n     * @param n the number to test\n     * @return true if the argument is power of 2\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(double[])",
      "begin_line": 482,
      "end_line": 487,
      "comment": "\n     * Verifies that the data set has length of power of 2.\n     *\n     * @param d the data array\n     * @throws IllegalArgumentException if array length is not power of 2\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 486,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(java.lang.Object[])",
      "begin_line": 495,
      "end_line": 500,
      "comment": "\n     * Verifies that the data set has length of power of 2.\n     *\n     * @param o the data array\n     * @throws IllegalArgumentException if array length is not power of 2\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 499,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.verifyInterval(double, double)",
      "begin_line": 509,
      "end_line": 517,
      "comment": "\n     * Verifies that the endpoints specify an interval.\n     *\n     * @param lower lower endpoint\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException if not interval\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 516,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.mdfft(java.lang.Object, boolean)",
      "begin_line": 533,
      "end_line": 543,
      "comment": "\n     * Performs a multi-dimensional Fourier transform on a given array.\n     * Use {@link #inverseTransform2(Complex[])} and\n     * {@link #transform2(Complex[])} in a row-column implementation\n     * in any number of dimensions with O(N\u0026times;log(N)) complexity with\n     * N\u003dn\u003csub\u003e1\u003c/sub\u003e\u0026times;n\u003csub\u003e2\u003c/sub\u003e\u0026times;n\u003csub\u003e3\u003c/sub\u003e\u0026times;...\u0026times;n\u003csub\u003ed\u003c/sub\u003e,\n     * n\u003csub\u003ex\u003c/sub\u003e\u003dnumber of elements in dimension x,\n     * and d\u003dtotal number of dimensions.\n     *\n     * @param mdca Multi-Dimensional Complex Array id est Complex[][][][]\n     * @param forward inverseTransform2 is preformed if this is false\n     * @return transform of mdca as a Multi-Dimensional Complex Array id est Complex[][][][]\n     * @throws IllegalArgumentException if any dimension is not a power of two\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 536,col 64)",
        "(line 537,col 9)-(line 537,col 55)",
        "(line 539,col 9)-(line 541,col 9)",
        "(line 542,col 9)-(line 542,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.mdfft(org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix, boolean, int, int[])",
      "begin_line": 554,
      "end_line": 594,
      "comment": "\n     * Performs one dimension of a multi-dimensional Fourier transform.\n     *\n     * @param mdcm input matrix\n     * @param forward inverseTransform2 is preformed if this is false\n     * @param d index of the dimension to process\n     * @param subVector recursion subvector\n     * @throws IllegalArgumentException if any dimension is not a power of two\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 55)",
        "(line 559,col 9)-(line 592,col 9)",
        "(line 593,col 9)-(line 593,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultiDimensionalComplexMatrix",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable"
      ],
      "begin_line": 603,
      "end_line": 756,
      "comment": "\n     * Complex matrix implementation.\n     * Not designed for synchronized access\n     * may eventually be replaced by jsr-83 of the java community process\n     * http://jcp.org/en/jsr/detail?id\u003d83\n     * may require additional exception throws for other basic requirements.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dimensionSize"
      ],
      "begin_line": 607,
      "end_line": 607,
      "comment": " Size in all dimensions. "
    },
    {
      "type": "field",
      "varNames": [
        "multiDimensionalComplexArray"
      ],
      "begin_line": 610,
      "end_line": 610,
      "comment": " Storage array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.MultiDimensionalComplexMatrix(java.lang.Object)",
      "begin_line": 615,
      "end_line": 640,
      "comment": " Simple constructor.\n         * @param multiDimensionalComplexArray array containing the matrix elements\n         ",
      "child_ranges": [
        "(line 617,col 13)-(line 617,col 77)",
        "(line 620,col 13)-(line 620,col 36)",
        "(line 621,col 13)-(line 626,col 13)",
        "(line 629,col 13)-(line 629,col 53)",
        "(line 632,col 13)-(line 632,col 32)",
        "(line 633,col 13)-(line 638,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.get(int...)",
      "begin_line": 648,
      "end_line": 668,
      "comment": "\n         * Get a matrix element.\n         * @param vector indices of the element\n         * @return matrix element\n         * @exception IllegalArgumentException if dimensions do not match\n         ",
      "child_ranges": [
        "(line 650,col 13)-(line 656,col 13)",
        "(line 657,col 13)-(line 660,col 13)",
        "(line 662,col 13)-(line 662,col 64)",
        "(line 664,col 13)-(line 666,col 13)",
        "(line 667,col 13)-(line 667,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.set(org.apache.commons.math.complex.Complex, int...)",
      "begin_line": 677,
      "end_line": 700,
      "comment": "\n         * Set a matrix element.\n         * @param magnitude magnitude of the element\n         * @param vector indices of the element\n         * @return the previous value\n         * @exception IllegalArgumentException if dimensions do not match\n         ",
      "child_ranges": [
        "(line 679,col 13)-(line 685,col 13)",
        "(line 686,col 13)-(line 689,col 13)",
        "(line 691,col 13)-(line 691,col 77)",
        "(line 692,col 13)-(line 694,col 13)",
        "(line 696,col 13)-(line 696,col 90)",
        "(line 697,col 13)-(line 697,col 72)",
        "(line 699,col 13)-(line 699,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.getDimensionSizes()",
      "begin_line": 706,
      "end_line": 708,
      "comment": "\n         * Get the size in all dimensions.\n         * @return size in all dimensions\n         ",
      "child_ranges": [
        "(line 707,col 13)-(line 707,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.getArray()",
      "begin_line": 714,
      "end_line": 716,
      "comment": "\n         * Get the underlying storage array.\n         * @return underlying storage array\n         ",
      "child_ranges": [
        "(line 715,col 13)-(line 715,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.clone()",
      "begin_line": 719,
      "end_line": 726,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 721,col 13)-(line 723,col 51)",
        "(line 724,col 13)-(line 724,col 24)",
        "(line 725,col 13)-(line 725,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.clone(org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix)",
      "begin_line": 732,
      "end_line": 755,
      "comment": "\n         * Copy contents of current array into mdcm.\n         * @param mdcm array where to copy data\n         ",
      "child_ranges": [
        "(line 733,col 13)-(line 733,col 57)",
        "(line 734,col 13)-(line 734,col 25)",
        "(line 735,col 13)-(line 737,col 13)",
        "(line 738,col 13)-(line 738,col 69)",
        "(line 739,col 13)-(line 750,col 13)",
        "(line 752,col 13)-(line 754,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RootsOfUnity",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 762,
      "end_line": 899,
      "comment": " Computes the n\u003csup\u003eth\u003c/sup\u003e roots of unity.\n     * A cache of already computed values is maintained.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 765,
      "end_line": 765,
      "comment": " Serializable version id. "
    },
    {
      "type": "field",
      "varNames": [
        "omegaCount"
      ],
      "begin_line": 768,
      "end_line": 768,
      "comment": " Number of roots of unity. "
    },
    {
      "type": "field",
      "varNames": [
        "omegaReal"
      ],
      "begin_line": 771,
      "end_line": 771,
      "comment": " Real part of the roots. "
    },
    {
      "type": "field",
      "varNames": [
        "omegaImaginaryForward"
      ],
      "begin_line": 774,
      "end_line": 774,
      "comment": " Imaginary part of the roots for forward transform. "
    },
    {
      "type": "field",
      "varNames": [
        "omegaImaginaryInverse"
      ],
      "begin_line": 777,
      "end_line": 777,
      "comment": " Imaginary part of the roots for reverse transform. "
    },
    {
      "type": "field",
      "varNames": [
        "isForward"
      ],
      "begin_line": 780,
      "end_line": 780,
      "comment": " Forward/reverse indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity.RootsOfUnity()",
      "begin_line": 785,
      "end_line": 793,
      "comment": "\n       * Build an engine for computing then \u003csup\u003eth\u003c/sup\u003e roots of unity.\n       ",
      "child_ranges": [
        "(line 787,col 9)-(line 787,col 23)",
        "(line 788,col 9)-(line 788,col 25)",
        "(line 789,col 9)-(line 789,col 37)",
        "(line 790,col 9)-(line 790,col 37)",
        "(line 791,col 9)-(line 791,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity.isForward()",
      "begin_line": 800,
      "end_line": 807,
      "comment": "\n       * Check if computation has been done for forward or reverse transform.\n       * @return true if computation has been done for forward transform\n       * @throws IllegalStateException if no roots of unity have been computed yet\n       ",
      "child_ranges": [
        "(line 802,col 9)-(line 804,col 9)",
        "(line 805,col 9)-(line 805,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity.computeOmega(int)",
      "begin_line": 818,
      "end_line": 853,
      "comment": " Computes the n\u003csup\u003eth\u003c/sup\u003e roots of unity.\n       * \u003cp\u003eThe computed omega[] \u003d { 1, w, w\u003csup\u003e2\u003c/sup\u003e, ... w\u003csup\u003e(n-1)\u003c/sup\u003e } where\n       * w \u003d exp(-2 \u0026pi; i / n), i \u003d \u0026sqrt;(-1).\u003c/p\u003e\n       * \u003cp\u003eNote that n is positive for\n       * forward transform and negative for inverse transform.\u003c/p\u003e\n       * @param n number of roots of unity to compute,\n       * positive for forward transform, negative for inverse transform\n       * @throws IllegalArgumentException if n \u003d 0\n       ",
      "child_ranges": [
        "(line 820,col 9)-(line 823,col 9)",
        "(line 825,col 9)-(line 825,col 26)",
        "(line 828,col 9)-(line 828,col 41)",
        "(line 830,col 9)-(line 832,col 9)",
        "(line 835,col 9)-(line 835,col 53)",
        "(line 836,col 9)-(line 836,col 44)",
        "(line 837,col 9)-(line 837,col 44)",
        "(line 838,col 9)-(line 838,col 49)",
        "(line 839,col 9)-(line 839,col 49)",
        "(line 840,col 9)-(line 840,col 49)",
        "(line 841,col 9)-(line 841,col 39)",
        "(line 842,col 9)-(line 842,col 39)",
        "(line 843,col 9)-(line 843,col 39)",
        "(line 844,col 9)-(line 850,col 9)",
        "(line 851,col 9)-(line 851,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity.getOmegaReal(int)",
      "begin_line": 862,
      "end_line": 875,
      "comment": "\n       * Get the real part of the k\u003csup\u003eth\u003c/sup\u003e n\u003csup\u003eth\u003c/sup\u003e root of unity.\n       * @param k index of the n\u003csup\u003eth\u003c/sup\u003e root of unity\n       * @return real part of the k\u003csup\u003eth\u003c/sup\u003e n\u003csup\u003eth\u003c/sup\u003e root of unity\n       * @throws IllegalStateException if no roots of unity have been computed yet\n       * @throws IllegalArgumentException if k is out of range\n       ",
      "child_ranges": [
        "(line 865,col 9)-(line 867,col 9)",
        "(line 868,col 9)-(line 871,col 9)",
        "(line 873,col 9)-(line 873,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity.getOmegaImaginary(int)",
      "begin_line": 884,
      "end_line": 897,
      "comment": "\n       * Get the imaginary part of the k\u003csup\u003eth\u003c/sup\u003e n\u003csup\u003eth\u003c/sup\u003e root of unity.\n       * @param k index of the n\u003csup\u003eth\u003c/sup\u003e root of unity\n       * @return imaginary part of the k\u003csup\u003eth\u003c/sup\u003e n\u003csup\u003eth\u003c/sup\u003e root of unity\n       * @throws IllegalStateException if no roots of unity have been computed yet\n       * @throws IllegalArgumentException if k is out of range\n       ",
      "child_ranges": [
        "(line 887,col 9)-(line 889,col 9)",
        "(line 890,col 9)-(line 893,col 9)",
        "(line 895,col 9)-(line 895,col 79)"
      ]
    }
  ]
}