{
  "filepath": "/tmp/Math-29b/src/main/java/org/apache/commons/math3/distribution/UniformRealDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UniformRealDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 32,
      "end_line": 198,
      "comment": "\n * Implementation of the uniform real distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Uniform_distribution_(continuous)\"\n * \u003eUniform distribution (continuous), at Wikipedia\u003c/a\u003e\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Default inverse cumulative probability accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
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
      "begin_line": 43,
      "end_line": 43,
      "comment": " Upper bound of this distribution (exclusive). "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.UniformRealDistribution(double, double)",
      "begin_line": 56,
      "end_line": 59,
      "comment": "\n     * Create a uniform real distribution using the given lower and upper\n     * bounds.\n     *\n     * @param lower Lower bound of this distribution (inclusive).\n     * @param upper Upper bound of this distribution (exclusive).\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.UniformRealDistribution(double, double, double)",
      "begin_line": 70,
      "end_line": 81,
      "comment": "\n     * Create a normal distribution using the given mean, standard deviation and\n     * inverse cumulative distribution accuracy.\n     *\n     * @param lower Lower bound of this distribution (inclusive).\n     * @param upper Upper bound of this distribution (exclusive).\n     * @param inverseCumAccuracy Inverse cumulative probability accuracy.\n     * @throws NumberIsTooLargeException if {@code lower \u003e\u003d upper}.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 76,col 9)",
        "(line 78,col 9)-(line 78,col 27)",
        "(line 79,col 9)-(line 79,col 27)",
        "(line 80,col 9)-(line 80,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.UniformRealDistribution()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Create a standard uniform real distribution with lower bound (inclusive)\n     * equal to zero and upper bound (exclusive) equal to one.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.probability(double)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For this distribution {@code P(X \u003d x)} always evaluates to 0.\n     *\n     * @return 0\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.density(double)",
      "begin_line": 103,
      "end_line": 108,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.cumulativeProbability(double)",
      "begin_line": 111,
      "end_line": 119,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 122,
      "end_line": 125,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.getNumericalMean()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For lower bound {@code lower} and upper bound {@code upper}, the mean is\n     * {@code 0.5 * (lower + upper)}.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.getNumericalVariance()",
      "begin_line": 143,
      "end_line": 146,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For lower bound {@code lower} and upper bound {@code upper}, the\n     * variance is {@code (upper - lower)^2 / 12}.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 34)",
        "(line 145,col 9)-(line 145,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.getSupportLowerBound()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is equal to the lower bound parameter\n     * of the distribution.\n     *\n     * @return lower bound of the support\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.getSupportUpperBound()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is equal to the upper bound parameter\n     * of the distribution.\n     *\n     * @return upper bound of the support\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 173,
      "end_line": 175,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 178,
      "end_line": 180,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.isSupportConnected()",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.sample()",
      "begin_line": 194,
      "end_line": 197,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 58)"
      ]
    }
  ]
}