{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/UniformRealDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UniformRealDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 35,
      "end_line": 230,
      "comment": "\n * Implementation of the uniform real distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Uniform_distribution_(continuous)\"\n * \u003eUniform distribution (continuous), at Wikipedia\u003c/a\u003e\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 39,
      "end_line": 40,
      "comment": " Default inverse cumulative probability accuracy.\n     * @deprecated as of 3.2 not used anymore, will be removed in 4.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "lower"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Lower bound of this distribution (inclusive). "
    },
    {
      "type": "field",
      "varNames": [
        "upper"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Upper bound of this distribution (exclusive). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.UniformRealDistribution()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Create a standard uniform real distribution with lower bound (inclusive)\n     * equal to zero and upper bound (exclusive) equal to one.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.UniformRealDistribution(double, double)",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * Create a uniform real distribution using the given lower and upper\n     * bounds.\n     *\n     * @param lower Lower bound of this distribution (inclusive).\n     * @param upper Upper bound of this distribution (exclusive).\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.UniformRealDistribution(double, double, double)",
      "begin_line": 79,
      "end_line": 83,
      "comment": "\n     * Create a uniform distribution.\n     *\n     * @param lower Lower bound of this distribution (inclusive).\n     * @param upper Upper bound of this distribution (exclusive).\n     * @param inverseCumAccuracy Inverse cumulative probability accuracy.\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     * @deprecated as of 3.2, inverse CDF is now calculated analytically, use\n     *             {@link #UniformRealDistribution(double, double)} instead.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.UniformRealDistribution(org.apache.commons.math3.random.RandomGenerator, double, double, double)",
      "begin_line": 98,
      "end_line": 104,
      "comment": "\n     * Creates a uniform distribution.\n     *\n     * @param rng Random number generator.\n     * @param lower Lower bound of this distribution (inclusive).\n     * @param upper Upper bound of this distribution (exclusive).\n     * @param inverseCumAccuracy Inverse cumulative probability accuracy.\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     * @since 3.1\n     * @deprecated as of 3.2, inverse CDF is now calculated analytically, use\n     *             {@link #UniformRealDistribution(RandomGenerator, double, double)}\n     *             instead.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.UniformRealDistribution(org.apache.commons.math3.random.RandomGenerator, double, double)",
      "begin_line": 115,
      "end_line": 128,
      "comment": "\n     * Creates a uniform distribution.\n     *\n     * @param rng Random number generator.\n     * @param lower Lower bound of this distribution (inclusive).\n     * @param upper Upper bound of this distribution (exclusive).\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 19)",
        "(line 120,col 9)-(line 124,col 9)",
        "(line 126,col 9)-(line 126,col 27)",
        "(line 127,col 9)-(line 127,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.density(double)",
      "begin_line": 131,
      "end_line": 136,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.cumulativeProbability(double)",
      "begin_line": 139,
      "end_line": 147,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 140,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.inverseCumulativeProbability(double)",
      "begin_line": 149,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.getNumericalMean()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For lower bound {@code lower} and upper bound {@code upper}, the mean is\n     * {@code 0.5 * (lower + upper)}.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.getNumericalVariance()",
      "begin_line": 174,
      "end_line": 177,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For lower bound {@code lower} and upper bound {@code upper}, the\n     * variance is {@code (upper - lower)^2 / 12}.\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 34)",
        "(line 176,col 9)-(line 176,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.getSupportLowerBound()",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is equal to the lower bound parameter\n     * of the distribution.\n     *\n     * @return lower bound of the support\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.getSupportUpperBound()",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is equal to the upper bound parameter\n     * of the distribution.\n     *\n     * @return upper bound of the support\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 204,
      "end_line": 206,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 209,
      "end_line": 211,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.isSupportConnected()",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.sample()",
      "begin_line": 225,
      "end_line": 229,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 45)",
        "(line 228,col 9)-(line 228,col 43)"
      ]
    }
  ]
}