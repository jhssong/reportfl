{
  "filepath": "/tmp/Math-20b/src/main/java/org/apache/commons/math3/distribution/UniformRealDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UniformRealDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 34,
      "end_line": 204,
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
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.density(double)",
      "begin_line": 108,
      "end_line": 113,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 109,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.cumulativeProbability(double)",
      "begin_line": 116,
      "end_line": 124,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 127,
      "end_line": 130,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.getNumericalMean()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For lower bound {@code lower} and upper bound {@code upper}, the mean is\n     * {@code 0.5 * (lower + upper)}.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.getNumericalVariance()",
      "begin_line": 148,
      "end_line": 151,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For lower bound {@code lower} and upper bound {@code upper}, the\n     * variance is {@code (upper - lower)^2 / 12}.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 34)",
        "(line 150,col 9)-(line 150,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.getSupportLowerBound()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is equal to the lower bound parameter\n     * of the distribution.\n     *\n     * @return lower bound of the support\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.getSupportUpperBound()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is equal to the upper bound parameter\n     * of the distribution.\n     *\n     * @return upper bound of the support\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 178,
      "end_line": 180,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 183,
      "end_line": 185,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.isSupportConnected()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.UniformRealDistribution.sample()",
      "begin_line": 199,
      "end_line": 203,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 45)",
        "(line 202,col 9)-(line 202,col 43)"
      ]
    }
  ]
}