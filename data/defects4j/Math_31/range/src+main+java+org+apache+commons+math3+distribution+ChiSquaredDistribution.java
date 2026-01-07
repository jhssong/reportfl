{
  "filepath": "/tmp/Math-31b/src/main/java/org/apache/commons/math3/distribution/ChiSquaredDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChiSquaredDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 26,
      "end_line": 164,
      "comment": "\n * Implementation of the chi-squared distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Chi-squared_distribution\"\u003eChi-squared distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/Chi-SquaredDistribution.html\"\u003eChi-squared Distribution (MathWorld)\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": "\n     * Default inverse cumulative probability accuracy\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "gamma"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Internal Gamma distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Inverse cumulative probability accuracy "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.ChiSquaredDistribution.ChiSquaredDistribution(double)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Create a Chi-Squared distribution with the given degrees of freedom.\n     *\n     * @param degreesOfFreedom Degrees of freedom.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.ChiSquaredDistribution.ChiSquaredDistribution(double, double)",
      "begin_line": 58,
      "end_line": 62,
      "comment": "\n     * Create a Chi-Squared distribution with the given degrees of freedom and\n     * inverse cumulative probability accuracy.\n     *\n     * @param degreesOfFreedom Degrees of freedom.\n     * @param inverseCumAccuracy the maximum absolute error in inverse\n     * cumulative probability estimates (defaults to\n     * {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 63)",
        "(line 61,col 9)-(line 61,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ChiSquaredDistribution.getDegreesOfFreedom()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Access the number of degrees of freedom.\n     *\n     * @return the degrees of freedom.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ChiSquaredDistribution.probability(double)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For this distribution {@code P(X \u003d x)} always evaluates to 0.\n     *\n     * @return 0\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ChiSquaredDistribution.density(double)",
      "begin_line": 85,
      "end_line": 87,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ChiSquaredDistribution.cumulativeProbability(double)",
      "begin_line": 90,
      "end_line": 92,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ChiSquaredDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 95,
      "end_line": 98,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ChiSquaredDistribution.getNumericalMean()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For {@code k} degrees of freedom, the mean is {@code k}.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ChiSquaredDistribution.getNumericalVariance()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For {@code k} degrees of freedom, the variance is {@code 2 * k}.\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ChiSquaredDistribution.getSupportLowerBound()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the\n     * degrees of freedom.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ChiSquaredDistribution.getSupportUpperBound()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity no matter the\n     * degrees of freedom.\n     *\n     * @return upper bound of the support (always Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ChiSquaredDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 145,
      "end_line": 147,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ChiSquaredDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 150,
      "end_line": 152,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ChiSquaredDistribution.isSupportConnected()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 20)"
      ]
    }
  ]
}