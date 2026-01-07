{
  "filepath": "/tmp/Math-37b/src/main/java/org/apache/commons/math/transform/FastFourierTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastFourierTransformer",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 87,
      "end_line": 809,
      "comment": "\n * \u003cp\u003e\n * Implements the Fast Fourier Transform for transformation of one-dimensional\n * real or complex data sets. For reference, see \u003cem\u003eApplied Numerical Linear\n * Algebra\u003c/em\u003e, ISBN 0898713897, chapter 6.\n * \u003c/p\u003e\n * \u003cp\u003e\n * There are several variants of the discrete Fourier transform, with various\n * normalization conventions, which are described below.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The current implementation of the discrete Fourier transform as a fast\n * Fourier transform requires the length of the data set to be a power of 2.\n * This greatly simplifies and speeds up the code. Users can pad the data with\n * zeros to meet this requirement. There are other flavors of FFT, for\n * reference, see S. Winograd,\n * \u003ci\u003eOn computing the discrete Fourier transform\u003c/i\u003e, Mathematics of\n * Computation, 32 (1978), 175 - 199.\n * \u003c/p\u003e\n * \u003ch3\u003e\u003ca id\u003d\"standard\"\u003eStandard DFT\u003c/a\u003e\u003c/h3\u003e\n * \u003cp\u003e\n * The standard normalization convention is defined as follows\n * \u003cul\u003e\n * \u003cli\u003eforward transform: y\u003csub\u003en\u003c/sub\u003e \u003d \u0026sum;\u003csub\u003ek\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e\n * x\u003csub\u003ek\u003c/sub\u003e exp(-2\u0026pi;i n k / N),\u003c/li\u003e\n * \u003cli\u003einverse transform: x\u003csub\u003ek\u003c/sub\u003e \u003d N\u003csup\u003e-1\u003c/sup\u003e\n * \u0026sum;\u003csub\u003en\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e y\u003csub\u003en\u003c/sub\u003e exp(2\u0026pi;i n k / N),\u003c/li\u003e\n * \u003c/ul\u003e\n * where N is the size of the data sample.\n * \u003c/p\u003e\n * \u003cp\u003e\n * {@link FastFourierTransformer}s following this convention are returned by the\n * factory method {@link #create()}.\n * \u003c/p\u003e\n * \u003ch3\u003e\u003ca id\u003d\"unitary\"\u003eUnitary DFT\u003c/a\u003e\u003c/h3\u003e\n * \u003cp\u003e\n * The unitary normalization convention is defined as follows\n * \u003cul\u003e\n * \u003cli\u003eforward transform: y\u003csub\u003en\u003c/sub\u003e \u003d (1 / \u0026radic;N)\n * \u0026sum;\u003csub\u003ek\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e x\u003csub\u003ek\u003c/sub\u003e exp(-2\u0026pi;i n k / N),\u003c/li\u003e\n * \u003cli\u003einverse transform: x\u003csub\u003ek\u003c/sub\u003e \u003d (1 / \u0026radic;N)\n * \u0026sum;\u003csub\u003en\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e y\u003csub\u003en\u003c/sub\u003e exp(2\u0026pi;i n k / N),\u003c/li\u003e\n * \u003c/ul\u003e\n * which makes the transform unitary. N is the size of the data sample.\n * \u003c/p\u003e\n * \u003cp\u003e\n * {@link FastFourierTransformer}s following this convention are returned by the\n * factory method {@link #createUnitary()}.\n * \u003c/p\u003e\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "unitary"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n     * {@code true} if the unitary version of the DFT should be used.\n     *\n     * @see #create()\n     * @see #createUnitary()\n     "
    },
    {
      "type": "field",
      "varNames": [
        "roots"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " The roots of unity. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.FastFourierTransformer(boolean)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Creates a new instance of this class, with various normalization\n     * conventions.\n     *\n     * @param unitary {@code false} if the DFT is \u003cem\u003enot\u003c/em\u003e to be scaled,\n     * {@code true} if it is to be scaled so as to make the transform unitary.\n     * @see #create()\n     * @see #createUnitary()\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.create()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * \u003cp\u003e\n     * Returns a new instance of this class. The returned transformer uses the\n     * \u003ca href\u003d\"#standard\"\u003estandard normalizing conventions\u003c/a\u003e.\n     * \u003c/p\u003e\n     *\n     * @return a new DFT transformer, with standard normalizing conventions\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.createUnitary()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * \u003cp\u003e\n     * Returns a new instance of this class. The returned transformer uses the\n     * \u003ca href\u003d\"#unitary\"\u003eunitary normalizing conventions\u003c/a\u003e.\n     * \u003c/p\u003e\n     *\n     * @return a new DFT transformer, with unitary normalizing conventions\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform(double[])",
      "begin_line": 150,
      "end_line": 156,
      "comment": "\n     * Returns the forward transform of the specified real data set.\n     *\n     * @param f the real data array to be transformed\n     * @return the complex transformed array\n     * @throws MathIllegalArgumentException if the length of the data array is\n     * not a power of two\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform(org.apache.commons.math.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 174,
      "end_line": 183,
      "comment": "\n     * Returns the forward transform of the specified real function, sampled on\n     * the specified interval.\n     *\n     * @param f the function to be sampled and transformed\n     * @param min the (inclusive) lower bound for the interval\n     * @param max the (exclusive) upper bound for the interval\n     * @param n the number of sample points\n     * @return the complex transformed array\n     * @throws org.apache.commons.math.exception.NumberIsTooLargeException\n     * if the lower bound is greater than, or equal to the upper bound\n     * @throws org.apache.commons.math.exception.NotStrictlyPositiveException\n     * if the number of sample points {@code n} is negative\n     * @throws MathIllegalArgumentException if the number of sample points\n     * {@code n} is not a power of two\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 67)",
        "(line 178,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform(org.apache.commons.math.complex.Complex[])",
      "begin_line": 193,
      "end_line": 201,
      "comment": "\n     * Returns the forward transform of the specified complex data set.\n     *\n     * @param f the complex data array to be transformed\n     * @return the complex transformed array\n     * @throws MathIllegalArgumentException if the length of the data array is\n     * not a power of two\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 37)",
        "(line 196,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 200,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inverseTransform(double[])",
      "begin_line": 211,
      "end_line": 214,
      "comment": "\n     * Returns the inverse transform of the specified real data set.\n     *\n     * @param f the real data array to be inversely transformed\n     * @return the complex inversely transformed array\n     * @throws MathIllegalArgumentException if the length of the data array is\n     * not a power of two\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 78)",
        "(line 213,col 9)-(line 213,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inverseTransform(org.apache.commons.math.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 232,
      "end_line": 237,
      "comment": "\n     * Returns the inverse transform of the specified real function, sampled\n     * on the given interval.\n     *\n     * @param f the function to be sampled and inversely transformed\n     * @param min the (inclusive) lower bound for the interval\n     * @param max the (exclusive) upper bound for the interval\n     * @param n the number of sample points\n     * @return the complex inversely transformed array\n     * @throws org.apache.commons.math.exception.NumberIsTooLargeException\n     * if the lower bound is greater than, or equal to the upper bound\n     * @throws org.apache.commons.math.exception.NotStrictlyPositiveException\n     * if the number of sample points {@code n} is negative\n     * @throws MathIllegalArgumentException if the number of sample points\n     * {@code n} is not a power of two\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 67)",
        "(line 235,col 9)-(line 235,col 64)",
        "(line 236,col 9)-(line 236,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inverseTransform(org.apache.commons.math.complex.Complex[])",
      "begin_line": 247,
      "end_line": 251,
      "comment": "\n     * Returns the inverse transform of the specified complex data set.\n     *\n     * @param f the complex data array to be inversely transformed\n     * @return the complex inversely transformed array\n     * @throws MathIllegalArgumentException if the length of the data array is\n     * not a power of two\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 38)",
        "(line 249,col 9)-(line 249,col 78)",
        "(line 250,col 9)-(line 250,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.fft(double[], boolean)",
      "begin_line": 263,
      "end_line": 302,
      "comment": "\n     * Returns the FFT of the specified real data set. Performs the base-4\n     * Cooley-Tukey FFT algorithm.\n     *\n     * @param f the real data array to be transformed\n     * @param isInverse {@code true} if inverse transform is to be carried out\n     * @return the complex transformed array\n     * @throws MathIllegalArgumentException if the length of the data array is\n     * not a power of two\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 269,col 9)",
        "(line 270,col 9)-(line 270,col 54)",
        "(line 271,col 9)-(line 274,col 9)",
        "(line 278,col 9)-(line 278,col 30)",
        "(line 279,col 9)-(line 279,col 44)",
        "(line 280,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 283,col 47)",
        "(line 284,col 9)-(line 284,col 36)",
        "(line 287,col 9)-(line 287,col 55)",
        "(line 288,col 9)-(line 288,col 86)",
        "(line 289,col 9)-(line 289,col 86)",
        "(line 290,col 9)-(line 299,col 9)",
        "(line 301,col 9)-(line 301,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.fft(org.apache.commons.math.complex.Complex[])",
      "begin_line": 313,
      "end_line": 383,
      "comment": "\n     * Returns the FFT of the specified complex data set. Performs the base-4\n     * Cooley-Tukey FFT algorithm.\n     *\n     * @param data the complex data array to be transformed\n     * @return the complex transformed array\n     * @throws MathIllegalArgumentException if the length of the data array is\n     * not a power of two\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 319,col 9)",
        "(line 321,col 9)-(line 321,col 34)",
        "(line 322,col 9)-(line 322,col 43)",
        "(line 325,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 333,col 9)",
        "(line 336,col 9)-(line 336,col 19)",
        "(line 337,col 9)-(line 344,col 9)",
        "(line 347,col 9)-(line 359,col 9)",
        "(line 362,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 382,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.mdfft(java.lang.Object, boolean)",
      "begin_line": 402,
      "end_line": 411,
      "comment": "\n     * Performs a multi-dimensional Fourier transform on a given array. Use\n     * {@link #transform(Complex[])} and {@link #inverseTransform(Complex[])} in\n     * a row-column implementation in any number of dimensions with\n     * O(N\u0026times;log(N)) complexity with\n     * N \u003d n\u003csub\u003e1\u003c/sub\u003e \u0026times; n\u003csub\u003e2\u003c/sub\u003e \u0026times;n\u003csub\u003e3\u003c/sub\u003e \u0026times; ...\n     * \u0026times; n\u003csub\u003ed\u003c/sub\u003e, where n\u003csub\u003ek\u003c/sub\u003e is the number of elements in\n     * dimension k, and d is the total number of dimensions.\n     *\n     * @param mdca Multi-Dimensional Complex Array id est\n     * {@code Complex[][][][]}\n     * @param forward {@link #inverseTransform} is performed if this is\n     * {@code false}\n     * @return transform of {@code mdca} as a Multi-Dimensional Complex Array\n     * id est {@code Complex[][][][]}\n     * @throws IllegalArgumentException if any dimension is not a power of two\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 404,col 64)",
        "(line 405,col 9)-(line 405,col 55)",
        "(line 407,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 410,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.mdfft(org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix, boolean, int, int[])",
      "begin_line": 423,
      "end_line": 463,
      "comment": "\n     * Performs one dimension of a multi-dimensional Fourier transform.\n     *\n     * @param mdcm input matrix\n     * @param forward {@link #inverseTransform} is performed if this is\n     * {@code false}\n     * @param d index of the dimension to process\n     * @param subVector recursion subvector\n     * @throws IllegalArgumentException if any dimension is not a power of two\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 55)",
        "(line 428,col 9)-(line 461,col 9)",
        "(line 462,col 9)-(line 462,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultiDimensionalComplexMatrix",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable"
      ],
      "begin_line": 471,
      "end_line": 640,
      "comment": "\n     * Complex matrix implementation. Not designed for synchronized access may\n     * eventually be replaced by jsr-83 of the java community process\n     * http://jcp.org/en/jsr/detail?id\u003d83\n     * may require additional exception throws for other basic requirements.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dimensionSize"
      ],
      "begin_line": 475,
      "end_line": 475,
      "comment": " Size in all dimensions. "
    },
    {
      "type": "field",
      "varNames": [
        "multiDimensionalComplexArray"
      ],
      "begin_line": 478,
      "end_line": 478,
      "comment": " Storage array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.MultiDimensionalComplexMatrix(java.lang.Object)",
      "begin_line": 486,
      "end_line": 512,
      "comment": "\n         * Simple constructor.\n         *\n         * @param multiDimensionalComplexArray array containing the matrix\n         * elements\n         ",
      "child_ranges": [
        "(line 489,col 13)-(line 489,col 77)",
        "(line 492,col 13)-(line 492,col 36)",
        "(line 493,col 13)-(line 498,col 13)",
        "(line 501,col 13)-(line 501,col 53)",
        "(line 504,col 13)-(line 504,col 32)",
        "(line 505,col 13)-(line 510,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.get(int...)",
      "begin_line": 521,
      "end_line": 544,
      "comment": "\n         * Get a matrix element.\n         *\n         * @param vector indices of the element\n         * @return matrix element\n         * @exception DimensionMismatchException if dimensions do not match\n         ",
      "child_ranges": [
        "(line 524,col 13)-(line 531,col 13)",
        "(line 532,col 13)-(line 536,col 13)",
        "(line 538,col 13)-(line 538,col 64)",
        "(line 540,col 13)-(line 542,col 13)",
        "(line 543,col 13)-(line 543,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.set(org.apache.commons.math.complex.Complex, int...)",
      "begin_line": 554,
      "end_line": 580,
      "comment": "\n         * Set a matrix element.\n         *\n         * @param magnitude magnitude of the element\n         * @param vector indices of the element\n         * @return the previous value\n         * @exception DimensionMismatchException if dimensions do not match\n         ",
      "child_ranges": [
        "(line 557,col 13)-(line 564,col 13)",
        "(line 565,col 13)-(line 569,col 13)",
        "(line 571,col 13)-(line 571,col 77)",
        "(line 572,col 13)-(line 574,col 13)",
        "(line 576,col 13)-(line 576,col 90)",
        "(line 577,col 13)-(line 577,col 72)",
        "(line 579,col 13)-(line 579,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.getDimensionSizes()",
      "begin_line": 587,
      "end_line": 589,
      "comment": "\n         * Get the size in all dimensions.\n         *\n         * @return size in all dimensions\n         ",
      "child_ranges": [
        "(line 588,col 13)-(line 588,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.getArray()",
      "begin_line": 596,
      "end_line": 598,
      "comment": "\n         * Get the underlying storage array.\n         *\n         * @return underlying storage array\n         ",
      "child_ranges": [
        "(line 597,col 13)-(line 597,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.clone()",
      "begin_line": 601,
      "end_line": 608,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 603,col 13)-(line 605,col 51)",
        "(line 606,col 13)-(line 606,col 24)",
        "(line 607,col 13)-(line 607,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.clone(org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix)",
      "begin_line": 615,
      "end_line": 639,
      "comment": "\n         * Copy contents of current array into mdcm.\n         *\n         * @param mdcm array where to copy data\n         ",
      "child_ranges": [
        "(line 617,col 13)-(line 617,col 57)",
        "(line 618,col 13)-(line 618,col 25)",
        "(line 619,col 13)-(line 621,col 13)",
        "(line 622,col 13)-(line 622,col 69)",
        "(line 623,col 13)-(line 634,col 13)",
        "(line 636,col 13)-(line 638,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RootsOfUnity",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 647,
      "end_line": 808,
      "comment": "\n     * Computes the {@code n}\u003csup\u003eth\u003c/sup\u003e roots of unity. A cache of already\n     * computed values is maintained.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 650,
      "end_line": 650,
      "comment": " Serializable version id. "
    },
    {
      "type": "field",
      "varNames": [
        "omegaCount"
      ],
      "begin_line": 653,
      "end_line": 653,
      "comment": " Number of roots of unity. "
    },
    {
      "type": "field",
      "varNames": [
        "omegaReal"
      ],
      "begin_line": 656,
      "end_line": 656,
      "comment": " Real part of the roots. "
    },
    {
      "type": "field",
      "varNames": [
        "omegaImaginaryForward"
      ],
      "begin_line": 659,
      "end_line": 659,
      "comment": " Imaginary part of the roots for forward transform. "
    },
    {
      "type": "field",
      "varNames": [
        "omegaImaginaryInverse"
      ],
      "begin_line": 662,
      "end_line": 662,
      "comment": " Imaginary part of the roots for reverse transform. "
    },
    {
      "type": "field",
      "varNames": [
        "isForward"
      ],
      "begin_line": 665,
      "end_line": 665,
      "comment": " Forward/reverse indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity.RootsOfUnity()",
      "begin_line": 671,
      "end_line": 678,
      "comment": "\n         * Build an engine for computing the {@code n}\u003csup\u003eth\u003c/sup\u003e roots of\n         * unity.\n         ",
      "child_ranges": [
        "(line 673,col 13)-(line 673,col 27)",
        "(line 674,col 13)-(line 674,col 29)",
        "(line 675,col 13)-(line 675,col 41)",
        "(line 676,col 13)-(line 676,col 41)",
        "(line 677,col 13)-(line 677,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity.isForward()",
      "begin_line": 687,
      "end_line": 695,
      "comment": "\n         * Check if computation has been done for forward or reverse transform.\n         *\n         * @return {@code true} if computation has been done for forward transform\n         * @throws MathIllegalStateException if no roots of unity have been computed\n         * yet\n         ",
      "child_ranges": [
        "(line 690,col 13)-(line 693,col 13)",
        "(line 694,col 13)-(line 694,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity.computeOmega(int)",
      "begin_line": 713,
      "end_line": 748,
      "comment": "\n         * \u003cp\u003e\n         * Computes the {@code n}\u003csup\u003eth\u003c/sup\u003e roots of unity. The roots are\n         * stored in {@code omega[]}, such that {@code omega[k] \u003d w ^ k}, where\n         * {@code k \u003d 0, ..., n - 1}, {@code w \u003d exp(-2 \u0026pi; i / n)} and\n         * {@code i \u003d sqrt(-1)}.\n         * \u003c/p\u003e\n         * \u003cp\u003e\n         * Note that {@code n} is positive for forward transform and negative\n         * for inverse transform.\n         * \u003c/p\u003e\n         *\n         * @param n number of roots of unity to compute, positive for forward\n         * transform, negative for inverse transform\n         * @throws ZeroException if {@code n \u003d 0}\n         ",
      "child_ranges": [
        "(line 715,col 13)-(line 718,col 13)",
        "(line 720,col 13)-(line 720,col 30)",
        "(line 723,col 13)-(line 723,col 45)",
        "(line 725,col 13)-(line 727,col 13)",
        "(line 731,col 13)-(line 731,col 54)",
        "(line 732,col 13)-(line 732,col 48)",
        "(line 733,col 13)-(line 733,col 48)",
        "(line 734,col 13)-(line 734,col 41)",
        "(line 735,col 13)-(line 735,col 53)",
        "(line 736,col 13)-(line 736,col 53)",
        "(line 737,col 13)-(line 737,col 31)",
        "(line 738,col 13)-(line 738,col 43)",
        "(line 739,col 13)-(line 739,col 43)",
        "(line 740,col 13)-(line 746,col 13)",
        "(line 747,col 13)-(line 747,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity.getOmegaReal(int)",
      "begin_line": 761,
      "end_line": 777,
      "comment": "\n         * Get the real part of the {@code k}\u003csup\u003eth\u003c/sup\u003e\n         * {@code n}\u003csup\u003eth\u003c/sup\u003e root of unity.\n         *\n         * @param k index of the {@code n}\u003csup\u003eth\u003c/sup\u003e root of unity\n         * @return real part of the {@code k}\u003csup\u003eth\u003c/sup\u003e\n         * {@code n}\u003csup\u003eth\u003c/sup\u003e root of unity\n         * @throws MathIllegalStateException if no roots of unity have been\n         * computed yet\n         * @throws MathIllegalArgumentException if {@code k} is out of range\n         ",
      "child_ranges": [
        "(line 764,col 13)-(line 767,col 13)",
        "(line 768,col 13)-(line 774,col 13)",
        "(line 776,col 13)-(line 776,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity.getOmegaImaginary(int)",
      "begin_line": 790,
      "end_line": 807,
      "comment": "\n         * Get the imaginary part of the {@code k}\u003csup\u003eth\u003c/sup\u003e\n         * {@code n}\u003csup\u003eth\u003c/sup\u003e root of unity.\n         *\n         * @param k index of the {@code n}\u003csup\u003eth\u003c/sup\u003e root of unity\n         * @return imaginary part of the {@code k}\u003csup\u003eth\u003c/sup\u003e\n         * {@code n}\u003csup\u003eth\u003c/sup\u003e root of unity\n         * @throws MathIllegalStateException if no roots of unity have been\n         * computed yet\n         * @throws OutOfRangeException if {@code k} is out of range\n         ",
      "child_ranges": [
        "(line 793,col 13)-(line 796,col 13)",
        "(line 797,col 13)-(line 803,col 13)",
        "(line 805,col 13)-(line 806,col 41)"
      ]
    }
  ]
}