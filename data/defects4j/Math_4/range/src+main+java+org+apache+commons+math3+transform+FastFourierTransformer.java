{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/transform/FastFourierTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastFourierTransformer",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 54,
      "end_line": 675,
      "comment": "\n * Implements the Fast Fourier Transform for transformation of one-dimensional\n * real or complex data sets. For reference, see \u003cem\u003eApplied Numerical Linear\n * Algebra\u003c/em\u003e, ISBN 0898713897, chapter 6.\n * \u003cp\u003e\n * There are several variants of the discrete Fourier transform, with various\n * normalization conventions, which are specified by the parameter\n * {@link DftNormalization}.\n * \u003cp\u003e\n * The current implementation of the discrete Fourier transform as a fast\n * Fourier transform requires the length of the data set to be a power of 2.\n * This greatly simplifies and speeds up the code. Users can pad the data with\n * zeros to meet this requirement. There are other flavors of FFT, for\n * reference, see S. Winograd,\n * \u003ci\u003eOn computing the discrete Fourier transform\u003c/i\u003e, Mathematics of\n * Computation, 32 (1978), 175 - 199.\n *\n * @see DftNormalization\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "W_SUB_N_R"
      ],
      "begin_line": 64,
      "end_line": 80,
      "comment": "\n     * {@code W_SUB_N_R[i]} is the real part of\n     * {@code exp(- 2 * i * pi / n)}:\n     * {@code W_SUB_N_R[i] \u003d cos(2 * pi/ n)}, where {@code n \u003d 2^i}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "W_SUB_N_I"
      ],
      "begin_line": 87,
      "end_line": 103,
      "comment": "\n     * {@code W_SUB_N_I[i]} is the imaginary part of\n     * {@code exp(- 2 * i * pi / n)}:\n     * {@code W_SUB_N_I[i] \u003d -sin(2 * pi/ n)}, where {@code n \u003d 2^i}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "normalization"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " The type of DFT to be performed. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.FastFourierTransformer(org.apache.commons.math3.transform.DftNormalization)",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Creates a new instance of this class, with various normalization\n     * conventions.\n     *\n     * @param normalization the type of normalization to be applied to the\n     * transformed data\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.bitReversalShuffle2(double[], double[])",
      "begin_line": 129,
      "end_line": 154,
      "comment": "\n     * Performs identical index bit reversal shuffles on two arrays of identical\n     * size. Each element in the array is swapped with another element based on\n     * the bit-reversal of the index. For example, in an array with length 16,\n     * item at binary index 0011 (decimal 3) would be swapped with the item at\n     * binary index 1100 (decimal 12).\n     *\n     * @param a the first array to be shuffled\n     * @param b the second array to be shuffled\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 31)",
        "(line 131,col 9)-(line 131,col 29)",
        "(line 132,col 9)-(line 132,col 35)",
        "(line 134,col 9)-(line 134,col 18)",
        "(line 135,col 9)-(line 153,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.normalizeTransformedData(double[][], org.apache.commons.math3.transform.DftNormalization, org.apache.commons.math3.transform.TransformType)",
      "begin_line": 163,
      "end_line": 197,
      "comment": "\n     * Applies the proper normalization to the specified transformed data.\n     *\n     * @param dataRI the unscaled transformed data\n     * @param normalization the normalization to be applied\n     * @param type the type of transform (forward, inverse) which resulted in the specified data\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 41)",
        "(line 167,col 9)-(line 167,col 41)",
        "(line 168,col 9)-(line 168,col 35)",
        "(line 169,col 9)-(line 169,col 33)",
        "(line 171,col 9)-(line 196,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.transformInPlace(double[][], org.apache.commons.math3.transform.DftNormalization, org.apache.commons.math3.transform.TransformType)",
      "begin_line": 215,
      "end_line": 360,
      "comment": "\n     * Computes the standard transform of the specified complex data. The\n     * computation is done in place. The input data is laid out as follows\n     * \u003cul\u003e\n     *   \u003cli\u003e{@code dataRI[0][i]} is the real part of the {@code i}-th data point,\u003c/li\u003e\n     *   \u003cli\u003e{@code dataRI[1][i]} is the imaginary part of the {@code i}-th data point.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param dataRI the two dimensional array of real and imaginary parts of the data\n     * @param normalization the normalization to be applied to the transformed data\n     * @param type the type of transform (forward, inverse) to be performed\n     * @throws DimensionMismatchException if the number of rows of the specified\n     *   array is not two, or the array is not rectangular\n     * @throws MathIllegalArgumentException if the number of data points is not\n     *   a power of two\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 221,col 41)",
        "(line 222,col 9)-(line 222,col 41)",
        "(line 223,col 9)-(line 225,col 9)",
        "(line 227,col 9)-(line 227,col 35)",
        "(line 228,col 9)-(line 232,col 9)",
        "(line 234,col 9)-(line 251,col 9)",
        "(line 253,col 9)-(line 253,col 42)",
        "(line 256,col 9)-(line 314,col 9)",
        "(line 316,col 9)-(line 316,col 23)",
        "(line 317,col 9)-(line 317,col 26)",
        "(line 318,col 9)-(line 357,col 9)",
        "(line 359,col 9)-(line 359,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.transform(double[], org.apache.commons.math3.transform.TransformType)",
      "begin_line": 370,
      "end_line": 378,
      "comment": "\n     * Returns the (forward, inverse) transform of the specified real data set.\n     *\n     * @param f the real data array to be transformed\n     * @param type the type of transform (forward, inverse) to be performed\n     * @return the complex transformed array\n     * @throws MathIllegalArgumentException if the length of the data array is not a power of two\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 373,col 10)",
        "(line 375,col 9)-(line 375,col 54)",
        "(line 377,col 9)-(line 377,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.transform(org.apache.commons.math3.analysis.UnivariateFunction, double, double, int, org.apache.commons.math3.transform.TransformType)",
      "begin_line": 397,
      "end_line": 403,
      "comment": "\n     * Returns the (forward, inverse) transform of the specified real function,\n     * sampled on the specified interval.\n     *\n     * @param f the function to be sampled and transformed\n     * @param min the (inclusive) lower bound for the interval\n     * @param max the (exclusive) upper bound for the interval\n     * @param n the number of sample points\n     * @param type the type of transform (forward, inverse) to be performed\n     * @return the complex transformed array\n     * @throws org.apache.commons.math3.exception.NumberIsTooLargeException\n     *   if the lower bound is greater than, or equal to the upper bound\n     * @throws org.apache.commons.math3.exception.NotStrictlyPositiveException\n     *   if the number of sample points {@code n} is negative\n     * @throws MathIllegalArgumentException if the number of sample points\n     *   {@code n} is not a power of two\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 67)",
        "(line 402,col 9)-(line 402,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.transform(org.apache.commons.math3.complex.Complex[], org.apache.commons.math3.transform.TransformType)",
      "begin_line": 413,
      "end_line": 419,
      "comment": "\n     * Returns the (forward, inverse) transform of the specified complex data set.\n     *\n     * @param f the complex data array to be transformed\n     * @param type the type of transform (forward, inverse) to be performed\n     * @return the complex transformed array\n     * @throws MathIllegalArgumentException if the length of the data array is not a power of two\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 77)",
        "(line 416,col 9)-(line 416,col 54)",
        "(line 418,col 9)-(line 418,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.mdfft(java.lang.Object, org.apache.commons.math3.transform.TransformType)",
      "begin_line": 436,
      "end_line": 446,
      "comment": "\n     * Performs a multi-dimensional Fourier transform on a given array. Use\n     * {@link #transform(Complex[], TransformType)} in a row-column\n     * implementation in any number of dimensions with\n     * O(N\u0026times;log(N)) complexity with\n     * N \u003d n\u003csub\u003e1\u003c/sub\u003e \u0026times; n\u003csub\u003e2\u003c/sub\u003e \u0026times;n\u003csub\u003e3\u003c/sub\u003e \u0026times; ...\n     * \u0026times; n\u003csub\u003ed\u003c/sub\u003e, where n\u003csub\u003ek\u003c/sub\u003e is the number of elements in\n     * dimension k, and d is the total number of dimensions.\n     *\n     * @param mdca Multi-Dimensional Complex Array, i.e. {@code Complex[][][][]}\n     * @param type the type of transform (forward, inverse) to be performed\n     * @return transform of {@code mdca} as a Multi-Dimensional Complex Array, i.e. {@code Complex[][][][]}\n     * @throws IllegalArgumentException if any dimension is not a power of two\n     * @deprecated see MATH-736\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 439,col 64)",
        "(line 440,col 9)-(line 440,col 55)",
        "(line 442,col 9)-(line 444,col 9)",
        "(line 445,col 9)-(line 445,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.mdfft(org.apache.commons.math3.transform.FastFourierTransformer.MultiDimensionalComplexMatrix, org.apache.commons.math3.transform.TransformType, int, int[])",
      "begin_line": 458,
      "end_line": 494,
      "comment": "\n     * Performs one dimension of a multi-dimensional Fourier transform.\n     *\n     * @param mdcm input matrix\n     * @param type the type of transform (forward, inverse) to be performed\n     * @param d index of the dimension to process\n     * @param subVector recursion subvector\n     * @throws IllegalArgumentException if any dimension is not a power of two\n     * @deprecated see MATH-736\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 55)",
        "(line 464,col 9)-(line 493,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultiDimensionalComplexMatrix",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable"
      ],
      "begin_line": 504,
      "end_line": 674,
      "comment": "\n     * Complex matrix implementation. Not designed for synchronized access may\n     * eventually be replaced by jsr-83 of the java community process\n     * http://jcp.org/en/jsr/detail?id\u003d83\n     * may require additional exception throws for other basic requirements.\n     *\n     * @deprecated see MATH-736\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dimensionSize"
      ],
      "begin_line": 509,
      "end_line": 509,
      "comment": " Size in all dimensions. "
    },
    {
      "type": "field",
      "varNames": [
        "multiDimensionalComplexArray"
      ],
      "begin_line": 512,
      "end_line": 512,
      "comment": " Storage array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.MultiDimensionalComplexMatrix(java.lang.Object)",
      "begin_line": 520,
      "end_line": 546,
      "comment": "\n         * Simple constructor.\n         *\n         * @param multiDimensionalComplexArray array containing the matrix\n         * elements\n         ",
      "child_ranges": [
        "(line 523,col 13)-(line 523,col 77)",
        "(line 526,col 13)-(line 526,col 36)",
        "(line 527,col 13)-(line 532,col 13)",
        "(line 535,col 13)-(line 535,col 53)",
        "(line 538,col 13)-(line 538,col 32)",
        "(line 539,col 13)-(line 544,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.get(int...)",
      "begin_line": 555,
      "end_line": 578,
      "comment": "\n         * Get a matrix element.\n         *\n         * @param vector indices of the element\n         * @return matrix element\n         * @exception DimensionMismatchException if dimensions do not match\n         ",
      "child_ranges": [
        "(line 558,col 13)-(line 565,col 13)",
        "(line 566,col 13)-(line 570,col 13)",
        "(line 572,col 13)-(line 572,col 64)",
        "(line 574,col 13)-(line 576,col 13)",
        "(line 577,col 13)-(line 577,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.set(org.apache.commons.math3.complex.Complex, int...)",
      "begin_line": 588,
      "end_line": 614,
      "comment": "\n         * Set a matrix element.\n         *\n         * @param magnitude magnitude of the element\n         * @param vector indices of the element\n         * @return the previous value\n         * @exception DimensionMismatchException if dimensions do not match\n         ",
      "child_ranges": [
        "(line 591,col 13)-(line 598,col 13)",
        "(line 599,col 13)-(line 603,col 13)",
        "(line 605,col 13)-(line 605,col 77)",
        "(line 606,col 13)-(line 608,col 13)",
        "(line 610,col 13)-(line 610,col 90)",
        "(line 611,col 13)-(line 611,col 72)",
        "(line 613,col 13)-(line 613,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.getDimensionSizes()",
      "begin_line": 621,
      "end_line": 623,
      "comment": "\n         * Get the size in all dimensions.\n         *\n         * @return size in all dimensions\n         ",
      "child_ranges": [
        "(line 622,col 13)-(line 622,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.getArray()",
      "begin_line": 630,
      "end_line": 632,
      "comment": "\n         * Get the underlying storage array.\n         *\n         * @return underlying storage array\n         ",
      "child_ranges": [
        "(line 631,col 13)-(line 631,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.clone()",
      "begin_line": 635,
      "end_line": 642,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 637,col 13)-(line 639,col 51)",
        "(line 640,col 13)-(line 640,col 24)",
        "(line 641,col 13)-(line 641,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.clone(org.apache.commons.math3.transform.FastFourierTransformer.MultiDimensionalComplexMatrix)",
      "begin_line": 649,
      "end_line": 673,
      "comment": "\n         * Copy contents of current array into mdcm.\n         *\n         * @param mdcm array where to copy data\n         ",
      "child_ranges": [
        "(line 651,col 13)-(line 651,col 57)",
        "(line 652,col 13)-(line 652,col 25)",
        "(line 653,col 13)-(line 655,col 13)",
        "(line 656,col 13)-(line 656,col 69)",
        "(line 657,col 13)-(line 668,col 13)",
        "(line 670,col 13)-(line 672,col 13)"
      ]
    }
  ]
}