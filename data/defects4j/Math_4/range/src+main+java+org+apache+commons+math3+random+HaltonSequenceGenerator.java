{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/random/HaltonSequenceGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HaltonSequenceGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.random.RandomVectorGenerator"
      ],
      "begin_line": 55,
      "end_line": 184,
      "comment": "\n * Implementation of a Halton sequence.\n * \u003cp\u003e\n * A Halton sequence is a low-discrepancy sequence generating points in the interval [0, 1] according to\n * \u003cpre\u003e\n *   H(n) \u003d d_0 / b + d_1 / b^2 .... d_j / b^j+1\n *\n *   with\n *\n *   n \u003d d_j * b^j-1 + ... d_1 * b + d_0 * b^0\n * \u003c/pre\u003e\n * For higher dimensions, subsequent prime numbers are used as base, e.g. { 2, 3, 5 } for a Halton sequence in R^3.\n * \u003cp\u003e\n * Halton sequences are known to suffer from linear correlation for larger prime numbers, thus the individual digits\n * are usually scrambled. This implementation already comes with support for up to 40 dimensions with optimal weight\n * numbers from \u003ca href\u003d\"http://etd.lib.fsu.edu/theses/available/etd-07062004-140409/unrestricted/dissertation1.pdf\"\u003e\n * H. Chi: Scrambled quasirandom sequences and their applications\u003c/a\u003e.\n * \u003cp\u003e\n * The generator supports two modes:\n * \u003cul\u003e\n *   \u003cli\u003esequential generation of points: {@link #nextVector()}\u003c/li\u003e\n *   \u003cli\u003erandom access to the i-th point in the sequence: {@link #skipTo(int)}\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Halton_sequence\"\u003eHalton sequence (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"https://lirias.kuleuven.be/bitstream/123456789/131168/1/mcm2005_bartv.pdf\"\u003e\n * On the Halton sequence and its scramblings\u003c/a\u003e\n * @version $Id$\n * @since 4.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "PRIMES"
      ],
      "begin_line": 58,
      "end_line": 62,
      "comment": " The first 40 primes. "
    },
    {
      "type": "field",
      "varNames": [
        "WEIGHTS"
      ],
      "begin_line": 65,
      "end_line": 69,
      "comment": " The optimal weights used for scrambling of the first 40 dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Space dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " The current index in the sequence. "
    },
    {
      "type": "field",
      "varNames": [
        "base"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The base numbers for each component. "
    },
    {
      "type": "field",
      "varNames": [
        "weight"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " The scrambling weights for each component. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.HaltonSequenceGenerator.HaltonSequenceGenerator(int)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Construct a new Halton sequence generator for the given space dimension.\n     *\n     * @param dimension the space dimension\n     * @throws OutOfRangeException if the space dimension is outside the allowed range of [1, 40]\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.HaltonSequenceGenerator.HaltonSequenceGenerator(int, int[], int[])",
      "begin_line": 105,
      "end_line": 122,
      "comment": "\n     * Construct a new Halton sequence generator with the given base numbers and weights for each dimension.\n     * The length of the bases array defines the space dimension and is required to be \u0026gt; 0.\n     *\n     * @param dimension the space dimension\n     * @param bases the base number for each dimension, entries should be (pairwise) prime, may not be null\n     * @param weights the weights used during scrambling, may be null in which case no scrambling will be performed\n     * @throws NullArgumentException if base is null\n     * @throws OutOfRangeException if the space dimension is outside the range [1, len], where\n     *   len refers to the length of the bases array\n     * @throws DimensionMismatchException if weights is non-null and the length of the input arrays differ\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 38)",
        "(line 110,col 9)-(line 112,col 9)",
        "(line 114,col 9)-(line 116,col 9)",
        "(line 118,col 9)-(line 118,col 35)",
        "(line 119,col 9)-(line 119,col 34)",
        "(line 120,col 9)-(line 120,col 63)",
        "(line 121,col 9)-(line 121,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.HaltonSequenceGenerator.nextVector()",
      "begin_line": 125,
      "end_line": 141,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 49)",
        "(line 127,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 16)",
        "(line 140,col 9)-(line 140,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.HaltonSequenceGenerator.scramble(int, int, int, int)",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * Performs scrambling of digit {@code d_j} according to the formula:\n     * \u003cpre\u003e\n     *   ( weight_i * d_j ) mod base\n     * \u003c/pre\u003e\n     * Implementations can override this method to do a different scrambling.\n     *\n     * @param i the dimension index\n     * @param j the digit index\n     * @param b the base for this dimension\n     * @param digit the j-th digit\n     * @return the scrambled digit\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.HaltonSequenceGenerator.skipTo(int)",
      "begin_line": 169,
      "end_line": 172,
      "comment": "\n     * Skip to the i-th point in the Halton sequence.\n     * \u003cp\u003e\n     * This operation can be performed in O(1).\n     *\n     * @param index the index in the sequence to skip to\n     * @return the i-th point in the Halton sequence\n     * @throws NotPositiveException if index \u0026lt; 0\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 22)",
        "(line 171,col 9)-(line 171,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.HaltonSequenceGenerator.getNextIndex()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * Returns the index i of the next point in the Halton sequence that will be returned\n     * by calling {@link #nextVector()}.\n     *\n     * @return the index of the next point\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 21)"
      ]
    }
  ]
}