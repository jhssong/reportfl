{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/ChiSquaredDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChiSquaredDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 29,
      "end_line": 173,
      "comment": "\n * Implementation of the chi-squared distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Chi-squared_distribution\"\u003eChi-squared distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/Chi-SquaredDistribution.html\"\u003eChi-squared Distribution (MathWorld)\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     * Default inverse cumulative probability accuracy\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "gamma"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Internal Gamma distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Inverse cumulative probability accuracy "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.ChiSquaredDistribution.ChiSquaredDistribution(double)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Create a Chi-Squared distribution with the given degrees of freedom.\n     *\n     * @param degreesOfFreedom Degrees of freedom.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.ChiSquaredDistribution.ChiSquaredDistribution(double, double)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Create a Chi-Squared distribution with the given degrees of freedom and\n     * inverse cumulative probability accuracy.\n     *\n     * @param degreesOfFreedom Degrees of freedom.\n     * @param inverseCumAccuracy the maximum absolute error in inverse\n     * cumulative probability estimates (defaults to\n     * {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 69)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.ChiSquaredDistribution.ChiSquaredDistribution(org.apache.commons.math3.random.RandomGenerator, double, double)",
      "begin_line": 77,
      "end_line": 84,
      "comment": "\n     * Create a Chi-Squared distribution with the given degrees of freedom and\n     * inverse cumulative probability accuracy.\n     *\n     * @param rng Random number generator.\n     * @param degreesOfFreedom Degrees of freedom.\n     * @param inverseCumAccuracy the maximum absolute error in inverse\n     * cumulative probability estimates (defaults to\n     * {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 19)",
        "(line 82,col 9)-(line 82,col 63)",
        "(line 83,col 9)-(line 83,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ChiSquaredDistribution.getDegreesOfFreedom()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Access the number of degrees of freedom.\n     *\n     * @return the degrees of freedom.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ChiSquaredDistribution.density(double)",
      "begin_line": 96,
      "end_line": 98,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ChiSquaredDistribution.cumulativeProbability(double)",
      "begin_line": 101,
      "end_line": 103,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ChiSquaredDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 106,
      "end_line": 109,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ChiSquaredDistribution.getNumericalMean()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For {@code k} degrees of freedom, the mean is {@code k}.\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ChiSquaredDistribution.getNumericalVariance()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @return {@code 2 * k}, where {@code k} is the number of degrees of freedom.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ChiSquaredDistribution.getSupportLowerBound()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the\n     * degrees of freedom.\n     *\n     * @return zero.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ChiSquaredDistribution.getSupportUpperBound()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity no matter the\n     * degrees of freedom.\n     *\n     * @return {@code Double.POSITIVE_INFINITY}.\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ChiSquaredDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 154,
      "end_line": 156,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ChiSquaredDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 159,
      "end_line": 161,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ChiSquaredDistribution.isSupportConnected()",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 20)"
      ]
    }
  ]
}