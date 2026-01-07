{
  "filepath": "/tmp/Math-38b/src/main/java/org/apache/commons/math/transform/FastFourierTransformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastFourierTransformer",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 82,
      "end_line": 864,
      "comment": "\n * \u003cp\u003e\n * Implements the Fast Fourier Transform for transformation of one-dimensional\n * real or complex data sets. For reference, see \u003cem\u003eApplied Numerical Linear\n * Algebra\u003c/em\u003e, ISBN 0898713897, chapter 6.\n * \u003c/p\u003e\n * \u003cp\u003e\n * There are several variants of the discrete Fourier transform, with various\n * normalization conventions, which are described below.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The current implementation of the discrete Fourier transform as a fast\n * Fourier transform requires the length of the data set to be a power of 2.\n * This greatly simplifies and speeds up the code. Users can pad the data with\n * zeros to meet this requirement. There are other flavors of FFT, for\n * reference, see S. Winograd,\n * \u003ci\u003eOn computing the discrete Fourier transform\u003c/i\u003e, Mathematics of\n * Computation, 32 (1978), 175 - 199.\n * \u003c/p\u003e\n * \u003ch3\u003e\u003ca id\u003d\"standard\"\u003eStandard DFT\u003c/a\u003e\u003c/h3\u003e\n * \u003cp\u003e\n * The standard normalization convention is defined as follows\n * \u003cul\u003e\n * \u003cli\u003eforward transform: y\u003csub\u003en\u003c/sub\u003e \u003d \u0026sum;\u003csub\u003ek\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e\n * x\u003csub\u003ek\u003c/sub\u003e exp(-2\u0026pi;i n k / N),\u003c/li\u003e\n * \u003cli\u003einverse transform: x\u003csub\u003ek\u003c/sub\u003e \u003d N\u003csup\u003e-1\u003c/sup\u003e\n * \u0026sum;\u003csub\u003en\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e y\u003csub\u003en\u003c/sub\u003e exp(2\u0026pi;i n k / N),\u003c/li\u003e\n * \u003c/ul\u003e\n * where N is the size of the data sample.\n * \u003c/p\u003e\n * \u003cp\u003e\n * {@link FastFourierTransformer}s following this convention are returned by the\n * factory method {@link #create()}.\n * \u003c/p\u003e\n * \u003ch3\u003e\u003ca id\u003d\"unitary\"\u003eUnitary DFT\u003c/a\u003e\u003c/h3\u003e\n * \u003cp\u003e\n * The unitary normalization convention is defined as follows\n * \u003cul\u003e\n * \u003cli\u003eforward transform: y\u003csub\u003en\u003c/sub\u003e \u003d (1 / \u0026radic;N)\n * \u0026sum;\u003csub\u003ek\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e x\u003csub\u003ek\u003c/sub\u003e exp(-2\u0026pi;i n k / N),\u003c/li\u003e\n * \u003cli\u003einverse transform: x\u003csub\u003ek\u003c/sub\u003e \u003d (1 / \u0026radic;N)\n * \u0026sum;\u003csub\u003en\u003d0\u003c/sub\u003e\u003csup\u003eN-1\u003c/sup\u003e y\u003csub\u003en\u003c/sub\u003e exp(2\u0026pi;i n k / N),\u003c/li\u003e\n * \u003c/ul\u003e\n * which makes the transform unitary. N is the size of the data sample.\n * \u003c/p\u003e\n * \u003cp\u003e\n * {@link FastFourierTransformer}s following this convention are returned by the\n * factory method {@link #createUnitary()}.\n * \u003c/p\u003e\n *\n * @version $Id: FastFourierTransformer.java 1212260 2011-12-09 06:45:09Z\n * celestin $\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "unitary"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n     * {@code true} if the unitary version of the DFT should be used.\n     *\n     * @see #create()\n     * @see #createUnitary()\n     "
    },
    {
      "type": "field",
      "varNames": [
        "roots"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " The roots of unity. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.FastFourierTransformer(boolean)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Creates a new instance of this class, with various normalization\n     * conventions.\n     *\n     * @param unitary {@code false} if the DFT is \u003cem\u003enot\u003c/em\u003e to be scaled,\n     * {@code true} if it is to be scaled so as to make the transform unitary.\n     * @see #create()\n     * @see #createUnitary()\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.create()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * \u003cp\u003e\n     * Returns a new instance of this class. The returned transformer uses the\n     * \u003ca href\u003d\"#standard\"\u003estandard normalizing conventions\u003c/a\u003e.\n     * \u003c/p\u003e\n     *\n     * @return a new DFT transformer, with standard normalizing conventions\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.createUnitary()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * \u003cp\u003e\n     * Returns a new instance of this class. The returned transformer uses the\n     * \u003ca href\u003d\"#unitary\"\u003eunitary normalizing conventions\u003c/a\u003e.\n     * \u003c/p\u003e\n     *\n     * @return a new DFT transformer, with unitary normalizing conventions\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform(double[])",
      "begin_line": 144,
      "end_line": 151,
      "comment": "\n     * Returns the forward transform of the specified real data set.\n     *\n     * @param f the real data array to be transformed\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform(org.apache.commons.math.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 164,
      "end_line": 173,
      "comment": "\n     * Returns the forward transform of the specified real function, sampled on\n     * the specified interval.\n     *\n     * @param f the function to be sampled and transformed\n     * @param min the (inclusive) lower bound for the interval\n     * @param max the (exclusive) upper bound for the interval\n     * @param n the number of sample points\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 53)",
        "(line 168,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.transform(org.apache.commons.math.complex.Complex[])",
      "begin_line": 182,
      "end_line": 190,
      "comment": "\n     * Returns the forward transform of the specified complex data set.\n     *\n     * @param f the complex data array to be transformed\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 37)",
        "(line 185,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inverseTransform(double[])",
      "begin_line": 199,
      "end_line": 204,
      "comment": "\n     * Returns the inverse transform of the specified real data set.\n     *\n     * @param f the real data array to be inversely transformed\n     * @return the complex inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 78)",
        "(line 203,col 9)-(line 203,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inverseTransform(org.apache.commons.math.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 217,
      "end_line": 224,
      "comment": "\n     * Returns the inverse transform of the specified real function, sampled\n     * on the given interval.\n     *\n     * @param f the function to be sampled and inversely transformed\n     * @param min the (inclusive) lower bound for the interval\n     * @param max the (exclusive) upper bound for the interval\n     * @param n the number of sample points\n     * @return the complex inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 53)",
        "(line 222,col 9)-(line 222,col 64)",
        "(line 223,col 9)-(line 223,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.inverseTransform(org.apache.commons.math.complex.Complex[])",
      "begin_line": 233,
      "end_line": 239,
      "comment": "\n     * Returns the inverse transform of the specified complex data set.\n     *\n     * @param f the complex data array to be inversely transformed\n     * @return the complex inversely transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 38)",
        "(line 237,col 9)-(line 237,col 78)",
        "(line 238,col 9)-(line 238,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.fft(double[], boolean)",
      "begin_line": 249,
      "end_line": 285,
      "comment": "\n     * Perform the base-4 Cooley-Tukey FFT algorithm (including inverse).\n     *\n     * @param f the real data array to be transformed\n     * @param isInverse the indicator of forward or inverse transform\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 25)",
        "(line 253,col 9)-(line 253,col 54)",
        "(line 254,col 9)-(line 257,col 9)",
        "(line 261,col 9)-(line 261,col 30)",
        "(line 262,col 9)-(line 262,col 44)",
        "(line 263,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 266,col 47)",
        "(line 267,col 9)-(line 267,col 36)",
        "(line 270,col 9)-(line 270,col 55)",
        "(line 271,col 9)-(line 271,col 86)",
        "(line 272,col 9)-(line 272,col 86)",
        "(line 273,col 9)-(line 282,col 9)",
        "(line 284,col 9)-(line 284,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.fft(org.apache.commons.math.complex.Complex[])",
      "begin_line": 294,
      "end_line": 360,
      "comment": "\n     * Perform the base-4 Cooley-Tukey FFT algorithm (including inverse).\n     *\n     * @param data the complex data array to be transformed\n     * @return the complex transformed array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 34)",
        "(line 298,col 9)-(line 298,col 43)",
        "(line 301,col 9)-(line 301,col 28)",
        "(line 302,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 310,col 9)",
        "(line 313,col 9)-(line 313,col 19)",
        "(line 314,col 9)-(line 321,col 9)",
        "(line 324,col 9)-(line 336,col 9)",
        "(line 339,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.sample(org.apache.commons.math.analysis.UnivariateFunction, double, double, int)",
      "begin_line": 377,
      "end_line": 393,
      "comment": "\n     * Sample the given univariate real function on the given interval.\n     * \u003cp\u003e\n     * The interval is divided equally into N sections and sample points\n     * are taken from min to max-(max-min)/N. Usually f(x) is periodic\n     * such that f(min) \u003d f(max) (note max is not sampled), but we don\u0027t\n     * require that.\u003c/p\u003e\n     *\n     * @param f the function to be sampled\n     * @param min the (inclusive) lower bound for the interval\n     * @param max the (exclusive) upper bound for the interval\n     * @param n the number of sample points\n     * @return the samples array\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 385,col 33)",
        "(line 387,col 9)-(line 387,col 35)",
        "(line 388,col 9)-(line 388,col 35)",
        "(line 389,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 392,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.scaleArray(double[], double)",
      "begin_line": 403,
      "end_line": 408,
      "comment": "\n     * Multiply every component in the given real array by the\n     * given real number. The change is made in place.\n     *\n     * @param f the real array to be scaled\n     * @param d the real scaling coefficient\n     * @return a reference to the scaled array\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 407,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.scaleArray(org.apache.commons.math.complex.Complex[], double)",
      "begin_line": 418,
      "end_line": 423,
      "comment": "\n     * Multiply every component in the given complex array by the\n     * given real number. The change is made in place.\n     *\n     * @param f the complex array to be scaled\n     * @param d the real scaling coefficient\n     * @return a reference to the scaled array\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 422,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.isPowerOf2(long)",
      "begin_line": 431,
      "end_line": 433,
      "comment": "\n     * Returns true if the argument is power of 2.\n     *\n     * @param n the number to test\n     * @return true if the argument is power of 2\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(double[])",
      "begin_line": 441,
      "end_line": 446,
      "comment": "\n     * Verifies that the data set has length of power of 2.\n     *\n     * @param d the data array\n     * @throws IllegalArgumentException if array length is not power of 2\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 445,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.verifyDataSet(java.lang.Object[])",
      "begin_line": 454,
      "end_line": 459,
      "comment": "\n     * Verifies that the data set has length of power of 2.\n     *\n     * @param o the data array\n     * @throws IllegalArgumentException if array length is not power of 2\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 458,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.verifyInterval(double, double)",
      "begin_line": 468,
      "end_line": 476,
      "comment": "\n     * Verifies that the endpoints specify an interval.\n     *\n     * @param lower lower endpoint\n     * @param upper upper endpoint\n     * @throws IllegalArgumentException if not interval\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 475,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.mdfft(java.lang.Object, boolean)",
      "begin_line": 495,
      "end_line": 505,
      "comment": "\n     * Performs a multi-dimensional Fourier transform on a given array. Use\n     * {@link #transform(Complex[])} and {@link #inverseTransform(Complex[])} in\n     * a row-column implementation in any number of dimensions with\n     * O(N\u0026times;log(N)) complexity with\n     * N \u003d n\u003csub\u003e1\u003c/sub\u003e \u0026times; n\u003csub\u003e2\u003c/sub\u003e \u0026times;n\u003csub\u003e3\u003c/sub\u003e \u0026times; ...\n     * \u0026times; n\u003csub\u003ed\u003c/sub\u003e, where n\u003csub\u003ek\u003c/sub\u003e is the number of elements in\n     * dimension k, and d is the total number of dimensions.\n     *\n     * @param mdca Multi-Dimensional Complex Array id est\n     * {@code Complex[][][][]}\n     * @param forward {@link #inverseTransform} is performed if this is\n     * {@code false}\n     * @return transform of {@code mdca} as a Multi-Dimensional Complex Array\n     * id est {@code Complex[][][][]}\n     * @throws IllegalArgumentException if any dimension is not a power of two\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 498,col 64)",
        "(line 499,col 9)-(line 499,col 55)",
        "(line 501,col 9)-(line 503,col 9)",
        "(line 504,col 9)-(line 504,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.mdfft(org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix, boolean, int, int[])",
      "begin_line": 517,
      "end_line": 557,
      "comment": "\n     * Performs one dimension of a multi-dimensional Fourier transform.\n     *\n     * @param mdcm input matrix\n     * @param forward {@link #inverseTransform} is performed if this is\n     * {@code false}\n     * @param d index of the dimension to process\n     * @param subVector recursion subvector\n     * @throws IllegalArgumentException if any dimension is not a power of two\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 55)",
        "(line 522,col 9)-(line 555,col 9)",
        "(line 556,col 9)-(line 556,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultiDimensionalComplexMatrix",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable"
      ],
      "begin_line": 566,
      "end_line": 719,
      "comment": "\n     * Complex matrix implementation.\n     * Not designed for synchronized access\n     * may eventually be replaced by jsr-83 of the java community process\n     * http://jcp.org/en/jsr/detail?id\u003d83\n     * may require additional exception throws for other basic requirements.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dimensionSize"
      ],
      "begin_line": 570,
      "end_line": 570,
      "comment": " Size in all dimensions. "
    },
    {
      "type": "field",
      "varNames": [
        "multiDimensionalComplexArray"
      ],
      "begin_line": 573,
      "end_line": 573,
      "comment": " Storage array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.MultiDimensionalComplexMatrix(java.lang.Object)",
      "begin_line": 578,
      "end_line": 603,
      "comment": " Simple constructor.\n         * @param multiDimensionalComplexArray array containing the matrix elements\n         ",
      "child_ranges": [
        "(line 580,col 13)-(line 580,col 77)",
        "(line 583,col 13)-(line 583,col 36)",
        "(line 584,col 13)-(line 589,col 13)",
        "(line 592,col 13)-(line 592,col 53)",
        "(line 595,col 13)-(line 595,col 32)",
        "(line 596,col 13)-(line 601,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.get(int...)",
      "begin_line": 611,
      "end_line": 631,
      "comment": "\n         * Get a matrix element.\n         * @param vector indices of the element\n         * @return matrix element\n         * @exception IllegalArgumentException if dimensions do not match\n         ",
      "child_ranges": [
        "(line 613,col 13)-(line 619,col 13)",
        "(line 620,col 13)-(line 623,col 13)",
        "(line 625,col 13)-(line 625,col 64)",
        "(line 627,col 13)-(line 629,col 13)",
        "(line 630,col 13)-(line 630,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.set(org.apache.commons.math.complex.Complex, int...)",
      "begin_line": 640,
      "end_line": 663,
      "comment": "\n         * Set a matrix element.\n         * @param magnitude magnitude of the element\n         * @param vector indices of the element\n         * @return the previous value\n         * @exception IllegalArgumentException if dimensions do not match\n         ",
      "child_ranges": [
        "(line 642,col 13)-(line 648,col 13)",
        "(line 649,col 13)-(line 652,col 13)",
        "(line 654,col 13)-(line 654,col 77)",
        "(line 655,col 13)-(line 657,col 13)",
        "(line 659,col 13)-(line 659,col 90)",
        "(line 660,col 13)-(line 660,col 72)",
        "(line 662,col 13)-(line 662,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.getDimensionSizes()",
      "begin_line": 669,
      "end_line": 671,
      "comment": "\n         * Get the size in all dimensions.\n         * @return size in all dimensions\n         ",
      "child_ranges": [
        "(line 670,col 13)-(line 670,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.getArray()",
      "begin_line": 677,
      "end_line": 679,
      "comment": "\n         * Get the underlying storage array.\n         * @return underlying storage array\n         ",
      "child_ranges": [
        "(line 678,col 13)-(line 678,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.clone()",
      "begin_line": 682,
      "end_line": 689,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 684,col 13)-(line 686,col 51)",
        "(line 687,col 13)-(line 687,col 24)",
        "(line 688,col 13)-(line 688,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix.clone(org.apache.commons.math.transform.FastFourierTransformer.MultiDimensionalComplexMatrix)",
      "begin_line": 695,
      "end_line": 718,
      "comment": "\n         * Copy contents of current array into mdcm.\n         * @param mdcm array where to copy data\n         ",
      "child_ranges": [
        "(line 696,col 13)-(line 696,col 57)",
        "(line 697,col 13)-(line 697,col 25)",
        "(line 698,col 13)-(line 700,col 13)",
        "(line 701,col 13)-(line 701,col 69)",
        "(line 702,col 13)-(line 713,col 13)",
        "(line 715,col 13)-(line 717,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RootsOfUnity",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 725,
      "end_line": 862,
      "comment": " Computes the n\u003csup\u003eth\u003c/sup\u003e roots of unity.\n     * A cache of already computed values is maintained.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 728,
      "end_line": 728,
      "comment": " Serializable version id. "
    },
    {
      "type": "field",
      "varNames": [
        "omegaCount"
      ],
      "begin_line": 731,
      "end_line": 731,
      "comment": " Number of roots of unity. "
    },
    {
      "type": "field",
      "varNames": [
        "omegaReal"
      ],
      "begin_line": 734,
      "end_line": 734,
      "comment": " Real part of the roots. "
    },
    {
      "type": "field",
      "varNames": [
        "omegaImaginaryForward"
      ],
      "begin_line": 737,
      "end_line": 737,
      "comment": " Imaginary part of the roots for forward transform. "
    },
    {
      "type": "field",
      "varNames": [
        "omegaImaginaryInverse"
      ],
      "begin_line": 740,
      "end_line": 740,
      "comment": " Imaginary part of the roots for reverse transform. "
    },
    {
      "type": "field",
      "varNames": [
        "isForward"
      ],
      "begin_line": 743,
      "end_line": 743,
      "comment": " Forward/reverse indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity.RootsOfUnity()",
      "begin_line": 748,
      "end_line": 756,
      "comment": "\n       * Build an engine for computing then \u003csup\u003eth\u003c/sup\u003e roots of unity.\n       ",
      "child_ranges": [
        "(line 750,col 9)-(line 750,col 23)",
        "(line 751,col 9)-(line 751,col 25)",
        "(line 752,col 9)-(line 752,col 37)",
        "(line 753,col 9)-(line 753,col 37)",
        "(line 754,col 9)-(line 754,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity.isForward()",
      "begin_line": 763,
      "end_line": 770,
      "comment": "\n       * Check if computation has been done for forward or reverse transform.\n       * @return true if computation has been done for forward transform\n       * @throws IllegalStateException if no roots of unity have been computed yet\n       ",
      "child_ranges": [
        "(line 765,col 9)-(line 767,col 9)",
        "(line 768,col 9)-(line 768,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity.computeOmega(int)",
      "begin_line": 781,
      "end_line": 816,
      "comment": " Computes the n\u003csup\u003eth\u003c/sup\u003e roots of unity.\n       * \u003cp\u003eThe computed omega[] \u003d { 1, w, w\u003csup\u003e2\u003c/sup\u003e, ... w\u003csup\u003e(n-1)\u003c/sup\u003e } where\n       * w \u003d exp(-2 \u0026pi; i / n), i \u003d \u0026sqrt;(-1).\u003c/p\u003e\n       * \u003cp\u003eNote that n is positive for\n       * forward transform and negative for inverse transform.\u003c/p\u003e\n       * @param n number of roots of unity to compute,\n       * positive for forward transform, negative for inverse transform\n       * @throws IllegalArgumentException if n \u003d 0\n       ",
      "child_ranges": [
        "(line 783,col 9)-(line 786,col 9)",
        "(line 788,col 9)-(line 788,col 26)",
        "(line 791,col 9)-(line 791,col 41)",
        "(line 793,col 9)-(line 795,col 9)",
        "(line 798,col 9)-(line 798,col 53)",
        "(line 799,col 9)-(line 799,col 44)",
        "(line 800,col 9)-(line 800,col 44)",
        "(line 801,col 9)-(line 801,col 49)",
        "(line 802,col 9)-(line 802,col 49)",
        "(line 803,col 9)-(line 803,col 49)",
        "(line 804,col 9)-(line 804,col 39)",
        "(line 805,col 9)-(line 805,col 39)",
        "(line 806,col 9)-(line 806,col 39)",
        "(line 807,col 9)-(line 813,col 9)",
        "(line 814,col 9)-(line 814,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity.getOmegaReal(int)",
      "begin_line": 825,
      "end_line": 838,
      "comment": "\n       * Get the real part of the k\u003csup\u003eth\u003c/sup\u003e n\u003csup\u003eth\u003c/sup\u003e root of unity.\n       * @param k index of the n\u003csup\u003eth\u003c/sup\u003e root of unity\n       * @return real part of the k\u003csup\u003eth\u003c/sup\u003e n\u003csup\u003eth\u003c/sup\u003e root of unity\n       * @throws IllegalStateException if no roots of unity have been computed yet\n       * @throws IllegalArgumentException if k is out of range\n       ",
      "child_ranges": [
        "(line 828,col 9)-(line 830,col 9)",
        "(line 831,col 9)-(line 834,col 9)",
        "(line 836,col 9)-(line 836,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.FastFourierTransformer.RootsOfUnity.getOmegaImaginary(int)",
      "begin_line": 847,
      "end_line": 860,
      "comment": "\n       * Get the imaginary part of the k\u003csup\u003eth\u003c/sup\u003e n\u003csup\u003eth\u003c/sup\u003e root of unity.\n       * @param k index of the n\u003csup\u003eth\u003c/sup\u003e root of unity\n       * @return imaginary part of the k\u003csup\u003eth\u003c/sup\u003e n\u003csup\u003eth\u003c/sup\u003e root of unity\n       * @throws IllegalStateException if no roots of unity have been computed yet\n       * @throws IllegalArgumentException if k is out of range\n       ",
      "child_ranges": [
        "(line 850,col 9)-(line 852,col 9)",
        "(line 853,col 9)-(line 856,col 9)",
        "(line 858,col 9)-(line 858,col 79)"
      ]
    }
  ]
}