{
  "filepath": "/tmp/Math-26b/src/main/java/org/apache/commons/math3/distribution/UniformRealDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UniformRealDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 34,
      "end_line": 215,
      "comment": "\n * Implementation of the uniform real distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Uniform_distribution_(continuous)\"\n * \u003eUniform distribution (continuous), at Wikipedia\u003c/a\u003e\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Default inverse cumulative probability accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "lower"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Lower bound of this distribution (inclusive). "
    },
    {
      "type": "field",
      "varNames": [
        "upper"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Upper bound of this distribution (exclusive). "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.UniformRealDistribution()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Create a standard uniform real distribution with lower bound (inclusive)\n     * equal to zero and upper bound (exclusive) equal to one.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.UniformRealDistribution(double, double)",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     * Create a uniform real distribution using the given lower and upper\n     * bounds.\n     *\n     * @param lower Lower bound of this distribution (inclusive).\n     * @param upper Upper bound of this distribution (exclusive).\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.UniformRealDistribution(double, double, double)",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n     * Create a uniform distribution.\n     *\n     * @param lower Lower bound of this distribution (inclusive).\n     * @param upper Upper bound of this distribution (exclusive).\n     * @param inverseCumAccuracy Inverse cumulative probability accuracy.\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.UniformRealDistribution(org.apache.commons.math3.random.RandomGenerator, double, double, double)",
      "begin_line": 90,
      "end_line": 105,
      "comment": "\n     * Creates a uniform distribution.\n     *\n     * @param rng Random number generator.\n     * @param lower Lower bound of this distribution (inclusive).\n     * @param upper Upper bound of this distribution (exclusive).\n     * @param inverseCumAccuracy Inverse cumulative probability accuracy.\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 19)",
        "(line 96,col 9)-(line 100,col 9)",
        "(line 102,col 9)-(line 102,col 27)",
        "(line 103,col 9)-(line 103,col 27)",
        "(line 104,col 9)-(line 104,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.probability(double)",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For this distribution {@code P(X \u003d x)} always evaluates to 0.\n     *\n     * @return 0\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.density(double)",
      "begin_line": 119,
      "end_line": 124,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.cumulativeProbability(double)",
      "begin_line": 127,
      "end_line": 135,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 138,
      "end_line": 141,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.getNumericalMean()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For lower bound {@code lower} and upper bound {@code upper}, the mean is\n     * {@code 0.5 * (lower + upper)}.\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.getNumericalVariance()",
      "begin_line": 159,
      "end_line": 162,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For lower bound {@code lower} and upper bound {@code upper}, the\n     * variance is {@code (upper - lower)^2 / 12}.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 34)",
        "(line 161,col 9)-(line 161,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.getSupportLowerBound()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is equal to the lower bound parameter\n     * of the distribution.\n     *\n     * @return lower bound of the support\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.getSupportUpperBound()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is equal to the upper bound parameter\n     * of the distribution.\n     *\n     * @return upper bound of the support\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 189,
      "end_line": 191,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 194,
      "end_line": 196,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.isSupportConnected()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.sample()",
      "begin_line": 210,
      "end_line": 214,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 45)",
        "(line 213,col 9)-(line 213,col 43)"
      ]
    }
  ]
}