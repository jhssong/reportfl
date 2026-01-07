{
  "filepath": "/tmp/Math-44b/src/main/java/org/apache/commons/math/distribution/ChiSquaredDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChiSquaredDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractContinuousDistribution",
        "org.apache.commons.math.distribution.ChiSquaredDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 27,
      "end_line": 258,
      "comment": "\n * The default implementation of {@link ChiSquaredDistribution}\n *\n * @version $Id$\n "
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
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.ChiSquaredDistributionImpl(double)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Create a Chi-Squared distribution with the given degrees of freedom.\n     *\n     * @param degreesOfFreedom Degrees of freedom.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.ChiSquaredDistributionImpl(double, double)",
      "begin_line": 61,
      "end_line": 65,
      "comment": "\n     * Create a Chi-Squared distribution with the given degrees of freedom and\n     * inverse cumulative probability accuracy.\n     *\n     * @param degreesOfFreedom Degrees of freedom.\n     * @param inverseCumAccuracy the maximum absolute error in inverse\n     * cumulative probability estimates (defaults to\n     * {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 67)",
        "(line 64,col 9)-(line 64,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.getDegreesOfFreedom()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.density(double)",
      "begin_line": 77,
      "end_line": 80,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.cumulativeProbability(double)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * For this distribution, {@code X}, this method returns {@code P(X \u003c x)}.\n     *\n     * @param x the value at which the CDF is evaluated.\n     * @return CDF for this distribution.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 103,
      "end_line": 112,
      "comment": "\n     * For this distribution, X, this method returns the critical point\n     * {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     * It will return 0 when p \u003d 0 and {@code Double.POSITIVE_INFINITY}\n     * when p \u003d 1.\n     *\n     * @param p Desired probability.\n     * @return {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     * @throws org.apache.commons.math.exception.OutOfRangeException if\n     * {@code p} is not a valid probability.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 122,
      "end_line": 125,
      "comment": "\n     * Access the domain value lower bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e. {@code P(X \u003c \u0027lower bound\u0027) \u003c p}.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 135,
      "end_line": 151,
      "comment": "\n     * Access the domain value upper bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return domain value upper bound, i.e. {@code P(X \u003c \u0027upper bound\u0027) \u003e p}.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 19)",
        "(line 142,col 9)-(line 148,col 9)",
        "(line 150,col 9)-(line 150,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.getInitialDomain(double)",
      "begin_line": 161,
      "end_line": 177,
      "comment": "\n     * Access the initial domain value, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the initial domain value.\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 19)",
        "(line 168,col 9)-(line 174,col 9)",
        "(line 176,col 9)-(line 176,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 186,
      "end_line": 189,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.getSupportLowerBound()",
      "begin_line": 199,
      "end_line": 202,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the\n     * degrees of freedom.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.getSupportUpperBound()",
      "begin_line": 212,
      "end_line": 215,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity no matter the\n     * degrees of freedom.\n     *\n     * @return upper bound of the support (always Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.calculateNumericalMean()",
      "begin_line": 225,
      "end_line": 228,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For \u003ccode\u003ek\u003c/code\u003e degrees of freedom, the mean is\n     * \u003ccode\u003ek\u003c/code\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.calculateNumericalVariance()",
      "begin_line": 238,
      "end_line": 241,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For \u003ccode\u003ek\u003c/code\u003e degrees of freedom, the variance is\n     * \u003ccode\u003e2 * k\u003c/code\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.isSupportLowerBoundInclusive()",
      "begin_line": 246,
      "end_line": 249,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.isSupportUpperBoundInclusive()",
      "begin_line": 254,
      "end_line": 257,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 21)"
      ]
    }
  ]
}