{
  "filepath": "/tmp/Math-28b/src/main/java/org/apache/commons/math3/transform/FastFourierTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastFourierTransformer",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 58,
      "end_line": 689,
      "comment": "\n * \u003cp\u003e\n * Implements the Fast Fourier Transform for transformation of one-dimensional\n * real or complex data sets. For reference, see \u003cem\u003eApplied Numerical Linear\n * Algebra\u003c/em\u003e, ISBN 0898713897, chapter 6.\n * \u003c/p\u003e\n * \u003cp\u003e\n * There are several variants of the discrete Fourier transform, with various\n * normalization conventions, which are specified by the parameter\n * {@link DftNormalization}.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The current implementation of the discrete Fourier transform as a fast\n * Fourier transform requires the length of the data set to be a power of 2.\n * This greatly simplifies and speeds up the code. Users can pad the data with\n * zeros to meet this requirement. There are other flavors of FFT, for\n * reference, see S. Winograd,\n * \u003ci\u003eOn computing the discrete Fourier transform\u003c/i\u003e, Mathematics of\n * Computation, 32 (1978), 175 - 199.\n * \u003c/p\u003e\n *\n * @see DftNormalization\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "W_SUB_N_R"
      ],
      "begin_line": 68,
      "end_line": 84,
      "comment": "\n     * {@code W_SUB_N_R[i]} is the real part of\n     * {@code exp(- 2 * i * pi / n)}:\n     * {@code W_SUB_N_R[i] \u003d cos(2 * pi/ n)}, where {@code n \u003d 2^i}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "W_SUB_N_I"
      ],
      "begin_line": 91,
      "end_line": 107,
      "comment": "\n     * {@code W_SUB_N_I[i]} is the imaginary part of\n     * {@code exp(- 2 * i * pi / n)}:\n     * {@code W_SUB_N_I[i] \u003d -sin(2 * pi/ n)}, where {@code n \u003d 2^i}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "normalization"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " The type of DFT to be performed. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.FastFourierTransformer(org.apache.commons.math3.transform.DftNormalization)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * Creates a new instance of this class, with various normalization\n     * conventions.\n     *\n     * @param normalization the type of normalization to be applied to the\n     * transformed data\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.bitReversalShuffle2(double[], double[])",
      "begin_line": 133,
      "end_line": 158,
      "comment": "\n     * Performs identical index bit reversal shuffles on two arrays of identical\n     * size. Each element in the array is swapped with another element based on\n     * the bit-reversal of the index. For example, in an array with length 16,\n     * item at binary index 0011 (decimal 3) would be swapped with the item at\n     * binary index 1100 (decimal 12).\n     *\n     * @param a the first array to be shuffled\n     * @param b the second array to be shuffled\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 31)",
        "(line 135,col 9)-(line 135,col 29)",
        "(line 136,col 9)-(line 136,col 35)",
        "(line 138,col 9)-(line 138,col 18)",
        "(line 139,col 9)-(line 157,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.normalizeTransformedData(double[][], org.apache.commons.math3.transform.DftNormalization, org.apache.commons.math3.transform.TransformType)",
      "begin_line": 168,
      "end_line": 202,
      "comment": "\n     * Applies the proper normalization to the specified transformed data.\n     *\n     * @param dataRI the unscaled transformed data\n     * @param normalization the normalization to be applied\n     * @param type the type of transform (forward, inverse) which resulted in the\n     * specified data\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 41)",
        "(line 172,col 9)-(line 172,col 41)",
        "(line 173,col 9)-(line 173,col 35)",
        "(line 174,col 9)-(line 174,col 33)",
        "(line 176,col 9)-(line 201,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.transformInPlace(double[][], org.apache.commons.math3.transform.DftNormalization, org.apache.commons.math3.transform.TransformType)",
      "begin_line": 224,
      "end_line": 369,
      "comment": "\n     * Computes the standard transform of the specified complex data. The\n     * computation is done in place. The input data is laid out as follows\n     * \u003cul\u003e\n     * \u003cli\u003e{@code dataRI[0][i]} is the real part of the {@code i}-th data point,\n     * \u003c/li\u003e\n     * \u003cli\u003e{@code dataRI[1][i]} is the imaginary part of the {@code i}-th data\n     * point.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param dataRI the two dimensional array of real and imaginary parts of\n     * the data\n     * @param normalization the normalization to be applied to the transformed\n     * data\n     * @param type the type of transform (forward, inverse) to be performed\n     * @throws DimensionMismatchException if the number of rows of the specified\n     * array is not two, or the array is not rectangular\n     * @throws MathIllegalArgumentException if the number of data points is not\n     * a power of two\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 230,col 41)",
        "(line 231,col 9)-(line 231,col 41)",
        "(line 232,col 9)-(line 234,col 9)",
        "(line 236,col 9)-(line 236,col 35)",
        "(line 237,col 9)-(line 241,col 9)",
        "(line 243,col 9)-(line 260,col 9)",
        "(line 262,col 9)-(line 262,col 42)",
        "(line 265,col 9)-(line 323,col 9)",
        "(line 325,col 9)-(line 325,col 23)",
        "(line 326,col 9)-(line 326,col 26)",
        "(line 327,col 9)-(line 366,col 9)",
        "(line 368,col 9)-(line 368,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.transform(double[], org.apache.commons.math3.transform.TransformType)",
      "begin_line": 380,
      "end_line": 388,
      "comment": "\n     * Returns the (forward, inverse) transform of the specified real data set.\n     *\n     * @param f the real data array to be transformed\n     * @param type the type of transform (forward, inverse) to be performed\n     * @return the complex transformed array\n     * @throws MathIllegalArgumentException if the length of the data array is\n     * not a power of two\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 383,col 10)",
        "(line 385,col 9)-(line 385,col 54)",
        "(line 387,col 9)-(line 387,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.transform(org.apache.commons.math3.analysis.UnivariateFunction, double, double, int, org.apache.commons.math3.transform.TransformType)",
      "begin_line": 407,
      "end_line": 413,
      "comment": "\n     * Returns the (forward, inverse) transform of the specified real function,\n     * sampled on the specified interval.\n     *\n     * @param f the function to be sampled and transformed\n     * @param min the (inclusive) lower bound for the interval\n     * @param max the (exclusive) upper bound for the interval\n     * @param n the number of sample points\n     * @param type the type of transform (forward, inverse) to be performed\n     * @return the complex transformed array\n     * @throws org.apache.commons.math3.exception.NumberIsTooLargeException\n     * if the lower bound is greater than, or equal to the upper bound\n     * @throws org.apache.commons.math3.exception.NotStrictlyPositiveException\n     * if the number of sample points {@code n} is negative\n     * @throws MathIllegalArgumentException if the number of sample points\n     * {@code n} is not a power of two\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 67)",
        "(line 412,col 9)-(line 412,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.transform(org.apache.commons.math3.complex.Complex[], org.apache.commons.math3.transform.TransformType)",
      "begin_line": 425,
      "end_line": 431,
      "comment": "\n     * Returns the (forward, inverse) transform of the specified complex data\n     * set.\n     *\n     * @param f the complex data array to be transformed\n     * @param type the type of transform (forward, inverse) to be performed\n     * @return the complex transformed array\n     * @throws MathIllegalArgumentException if the length of the data array is\n     * not a power of two\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 77)",
        "(line 428,col 9)-(line 428,col 54)",
        "(line 430,col 9)-(line 430,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.mdfft(java.lang.Object, org.apache.commons.math3.transform.TransformType)",
      "begin_line": 450,
      "end_line": 460,
      "comment": "\n     * Performs a multi-dimensional Fourier transform on a given array. Use\n     * {@link #transform(Complex[], TransformType)} in a row-column\n     * implementation in any number of dimensions with\n     * O(N\u0026times;log(N)) complexity with\n     * N \u003d n\u003csub\u003e1\u003c/sub\u003e \u0026times; n\u003csub\u003e2\u003c/sub\u003e \u0026times;n\u003csub\u003e3\u003c/sub\u003e \u0026times; ...\n     * \u0026times; n\u003csub\u003ed\u003c/sub\u003e, where n\u003csub\u003ek\u003c/sub\u003e is the number of elements in\n     * dimension k, and d is the total number of dimensions.\n     *\n     * @param mdca Multi-Dimensional Complex Array id est\n     * {@code Complex[][][][]}\n     * @param type the type of transform (forward, inverse) to be performed\n     * @return transform of {@code mdca} as a Multi-Dimensional Complex Array\n     * id est {@code Complex[][][][]}\n     * @throws IllegalArgumentException if any dimension is not a power of two\n     * @deprecated see MATH-736\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 453,col 64)",
        "(line 454,col 9)-(line 454,col 55)",
        "(line 456,col 9)-(line 458,col 9)",
        "(line 459,col 9)-(line 459,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.mdfft(org.apache.commons.math3.transform.FastFourierTransformer.MultiDimensionalComplexMatrix, org.apache.commons.math3.transform.TransformType, int, int[])",
      "begin_line": 472,
      "end_line": 508,
      "comment": "\n     * Performs one dimension of a multi-dimensional Fourier transform.\n     *\n     * @param mdcm input matrix\n     * @param type the type of transform (forward, inverse) to be performed\n     * @param d index of the dimension to process\n     * @param subVector recursion subvector\n     * @throws IllegalArgumentException if any dimension is not a power of two\n     * @deprecated see MATH-736\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 55)",
        "(line 478,col 9)-(line 507,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultiDimensionalComplexMatrix",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable"
      ],
      "begin_line": 518,
      "end_line": 688,
      "comment": "\n     * Complex matrix implementation. Not designed for synchronized access may\n     * eventually be replaced by jsr-83 of the java community process\n     * http://jcp.org/en/jsr/detail?id\u003d83\n     * may require additional exception throws for other basic requirements.\n     *\n     * @deprecated see MATH-736\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dimensionSize"
      ],
      "begin_line": 523,
      "end_line": 523,
      "comment": " Size in all dimensions. "
    },
    {
      "type": "field",
      "varNames": [
        "multiDimensionalComplexArray"
      ],
      "begin_line": 526,
      "end_line": 526,
      "comment": " Storage array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.MultiDimensionalComplexMatrix(java.lang.Object)",
      "begin_line": 534,
      "end_line": 560,
      "comment": "\n         * Simple constructor.\n         *\n         * @param multiDimensionalComplexArray array containing the matrix\n         * elements\n         ",
      "child_ranges": [
        "(line 537,col 13)-(line 537,col 77)",
        "(line 540,col 13)-(line 540,col 36)",
        "(line 541,col 13)-(line 546,col 13)",
        "(line 549,col 13)-(line 549,col 53)",
        "(line 552,col 13)-(line 552,col 32)",
        "(line 553,col 13)-(line 558,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.get(int...)",
      "begin_line": 569,
      "end_line": 592,
      "comment": "\n         * Get a matrix element.\n         *\n         * @param vector indices of the element\n         * @return matrix element\n         * @exception DimensionMismatchException if dimensions do not match\n         ",
      "child_ranges": [
        "(line 572,col 13)-(line 579,col 13)",
        "(line 580,col 13)-(line 584,col 13)",
        "(line 586,col 13)-(line 586,col 64)",
        "(line 588,col 13)-(line 590,col 13)",
        "(line 591,col 13)-(line 591,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.set(org.apache.commons.math3.complex.Complex, int...)",
      "begin_line": 602,
      "end_line": 628,
      "comment": "\n         * Set a matrix element.\n         *\n         * @param magnitude magnitude of the element\n         * @param vector indices of the element\n         * @return the previous value\n         * @exception DimensionMismatchException if dimensions do not match\n         ",
      "child_ranges": [
        "(line 605,col 13)-(line 612,col 13)",
        "(line 613,col 13)-(line 617,col 13)",
        "(line 619,col 13)-(line 619,col 77)",
        "(line 620,col 13)-(line 622,col 13)",
        "(line 624,col 13)-(line 624,col 90)",
        "(line 625,col 13)-(line 625,col 72)",
        "(line 627,col 13)-(line 627,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.getDimensionSizes()",
      "begin_line": 635,
      "end_line": 637,
      "comment": "\n         * Get the size in all dimensions.\n         *\n         * @return size in all dimensions\n         ",
      "child_ranges": [
        "(line 636,col 13)-(line 636,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.getArray()",
      "begin_line": 644,
      "end_line": 646,
      "comment": "\n         * Get the underlying storage array.\n         *\n         * @return underlying storage array\n         ",
      "child_ranges": [
        "(line 645,col 13)-(line 645,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.clone()",
      "begin_line": 649,
      "end_line": 656,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 651,col 13)-(line 653,col 51)",
        "(line 654,col 13)-(line 654,col 24)",
        "(line 655,col 13)-(line 655,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.clone(org.apache.commons.math3.transform.FastFourierTransformer.MultiDimensionalComplexMatrix)",
      "begin_line": 663,
      "end_line": 687,
      "comment": "\n         * Copy contents of current array into mdcm.\n         *\n         * @param mdcm array where to copy data\n         ",
      "child_ranges": [
        "(line 665,col 13)-(line 665,col 57)",
        "(line 666,col 13)-(line 666,col 25)",
        "(line 667,col 13)-(line 669,col 13)",
        "(line 670,col 13)-(line 670,col 69)",
        "(line 671,col 13)-(line 682,col 13)",
        "(line 684,col 13)-(line 686,col 13)"
      ]
    }
  ]
}