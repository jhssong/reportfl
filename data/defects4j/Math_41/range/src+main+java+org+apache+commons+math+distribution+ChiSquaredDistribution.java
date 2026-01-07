{
  "filepath": "/tmp/Math-41b/src/main/java/org/apache/commons/math/distribution/ChiSquaredDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChiSquaredDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractContinuousDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 214,
      "comment": "\r\n * Implementation of the chi-squared distribution.\r\n *\r\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Chi-squared_distribution\"\u003eChi-squared distribution (Wikipedia)\u003c/a\u003e\r\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/Chi-SquaredDistribution.html\"\u003eChi-squared Distribution (MathWorld)\u003c/a\u003e\r\n * @version $Id: ChiSquaredDistribution.java 1206060 2011-11-25 05:16:56Z celestin $\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": "\r\n     * Default inverse cumulative probability accuracy\r\n     * @since 2.1\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "gamma"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Internal Gamma distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Inverse cumulative probability accuracy "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistribution.ChiSquaredDistribution(double)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\r\n     * Create a Chi-Squared distribution with the given degrees of freedom.\r\n     *\r\n     * @param degreesOfFreedom Degrees of freedom.\r\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistribution.ChiSquaredDistribution(double, double)",
      "begin_line": 63,
      "end_line": 67,
      "comment": "\r\n     * Create a Chi-Squared distribution with the given degrees of freedom and\r\n     * inverse cumulative probability accuracy.\r\n     *\r\n     * @param degreesOfFreedom Degrees of freedom.\r\n     * @param inverseCumAccuracy the maximum absolute error in inverse\r\n     * cumulative probability estimates (defaults to\r\n     * {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\r\n     * @since 2.1\r\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 63)",
        "(line 66,col 9)-(line 66,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistribution.getDegreesOfFreedom()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\r\n     * Access the number of degrees of freedom.\r\n     *\r\n     * @return the degrees of freedom.\r\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistribution.density(double)",
      "begin_line": 79,
      "end_line": 81,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistribution.cumulativeProbability(double)",
      "begin_line": 84,
      "end_line": 86,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistribution.inverseCumulativeProbability(double)",
      "begin_line": 94,
      "end_line": 103,
      "comment": "\r\n     * {@inheritDoc}\r\n     *\r\n     * Returns {@code 0} when {@code p \u003d\u003d 0} and\r\n     * {@code Double.POSITIVE_INFINITY} when {@code p \u003d\u003d 1}.\r\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistribution.getDomainLowerBound(double)",
      "begin_line": 106,
      "end_line": 109,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistribution.getDomainUpperBound(double)",
      "begin_line": 112,
      "end_line": 128,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 19)",
        "(line 119,col 9)-(line 125,col 9)",
        "(line 127,col 9)-(line 127,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistribution.getInitialDomain(double)",
      "begin_line": 131,
      "end_line": 147,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 19)",
        "(line 138,col 9)-(line 144,col 9)",
        "(line 146,col 9)-(line 146,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 150,
      "end_line": 153,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistribution.getSupportLowerBound()",
      "begin_line": 163,
      "end_line": 166,
      "comment": "\r\n     * {@inheritDoc}\r\n     *\r\n     * The lower bound of the support is always 0 no matter the\r\n     * degrees of freedom.\r\n     *\r\n     * @return lower bound of the support (always 0)\r\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistribution.getSupportUpperBound()",
      "begin_line": 176,
      "end_line": 179,
      "comment": "\r\n     * {@inheritDoc}\r\n     *\r\n     * The upper bound of the support is always positive infinity no matter the\r\n     * degrees of freedom.\r\n     *\r\n     * @return upper bound of the support (always Double.POSITIVE_INFINITY)\r\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistribution.calculateNumericalMean()",
      "begin_line": 186,
      "end_line": 189,
      "comment": "\r\n     * {@inheritDoc}\r\n     *\r\n     * For {@code k} degrees of freedom, the mean is {@code k}.\r\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistribution.calculateNumericalVariance()",
      "begin_line": 198,
      "end_line": 201,
      "comment": "\r\n     * {@inheritDoc}\r\n     *\r\n     * For {@code k} degrees of freedom, the variance is {@code 2 * k}.\r\n     *\r\n     * @return {@inheritDoc}\r\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 204,
      "end_line": 207,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 210,
      "end_line": 213,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 21)"
      ]
    }
  ]
}