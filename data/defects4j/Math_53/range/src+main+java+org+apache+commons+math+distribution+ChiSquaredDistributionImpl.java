{
  "filepath": "/tmp/Math-53b/src/main/java/org/apache/commons/math/distribution/ChiSquaredDistributionImpl.java",
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
      "begin_line": 28,
      "end_line": 264,
      "comment": "\n * The default implementation of {@link ChiSquaredDistribution}\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * Default inverse cumulative probability accuracy\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "gamma"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Internal Gamma distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Inverse cumulative probability accuracy "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.ChiSquaredDistributionImpl(double)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Create a Chi-Squared distribution with the given degrees of freedom.\n     *\n     * @param degreesOfFreedom Degrees of freedom.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.ChiSquaredDistributionImpl(double, double)",
      "begin_line": 62,
      "end_line": 66,
      "comment": "\n     * Create a Chi-Squared distribution with the given degrees of freedom and\n     * inverse cumulative probability accuracy.\n     *\n     * @param degreesOfFreedom Degrees of freedom.\n     * @param inverseCumAccuracy the maximum absolute error in inverse\n     * cumulative probability estimates (defaults to\n     * {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 67)",
        "(line 65,col 9)-(line 65,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.getDegreesOfFreedom()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.density(double)",
      "begin_line": 78,
      "end_line": 81,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.cumulativeProbability(double)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * For this distribution, {@code X}, this method returns {@code P(X \u003c x)}.\n     *\n     * @param x the value at which the CDF is evaluated.\n     * @return CDF for this distribution.\n     * @throws MathException if the cumulative probability cannot be\n     * computed due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 108,
      "end_line": 118,
      "comment": "\n     * For this distribution, X, this method returns the critical point\n     * {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     * It will return 0 when p \u003d 0 and {@code Double.POSITIVE_INFINITY}\n     * when p \u003d 1.\n     *\n     * @param p Desired probability.\n     * @return {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     * @throws MathException if the inverse cumulative probability can not be\n     * computed due to convergence or other numerical errors.\n     * @throws org.apache.commons.math.exception.OutOfRangeException if\n     * {@code p} is not a valid probability.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 128,
      "end_line": 131,
      "comment": "\n     * Access the domain value lower bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e. {@code P(X \u003c \u0027lower bound\u0027) \u003c p}.\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 141,
      "end_line": 157,
      "comment": "\n     * Access the domain value upper bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return domain value upper bound, i.e. {@code P(X \u003c \u0027upper bound\u0027) \u003e p}.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 19)",
        "(line 148,col 9)-(line 154,col 9)",
        "(line 156,col 9)-(line 156,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.getInitialDomain(double)",
      "begin_line": 167,
      "end_line": 183,
      "comment": "\n     * Access the initial domain value, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the initial domain value.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 19)",
        "(line 174,col 9)-(line 180,col 9)",
        "(line 182,col 9)-(line 182,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 192,
      "end_line": 195,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.getSupportLowerBound()",
      "begin_line": 205,
      "end_line": 208,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the\n     * degrees of freedom.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.getSupportUpperBound()",
      "begin_line": 218,
      "end_line": 221,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity no matter the\n     * degrees of freedom.\n     *\n     * @return upper bound of the support (always Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.calculateNumericalMean()",
      "begin_line": 231,
      "end_line": 234,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For \u003ccode\u003ek\u003c/code\u003e degrees of freedom, the mean is\n     * \u003ccode\u003ek\u003c/code\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.calculateNumericalVariance()",
      "begin_line": 244,
      "end_line": 247,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For \u003ccode\u003ek\u003c/code\u003e degrees of freedom, the variance is\n     * \u003ccode\u003e2 * k\u003c/code\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.isSupportLowerBoundInclusive()",
      "begin_line": 252,
      "end_line": 255,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.isSupportUpperBoundInclusive()",
      "begin_line": 260,
      "end_line": 263,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 21)"
      ]
    }
  ]
}