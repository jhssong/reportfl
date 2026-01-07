{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/distribution/ExponentialDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExponentialDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractContinuousDistribution",
        "org.apache.commons.math.distribution.ExponentialDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 246,
      "comment": "\n * The default implementation of {@link ExponentialDistribution}.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * Default inverse cumulative probability accuracy\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The mean of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Inverse cumulative probability accuracy "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.ExponentialDistributionImpl(double)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Create a exponential distribution with the given mean.\n     * @param mean mean of this distribution.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.ExponentialDistributionImpl(double, double)",
      "begin_line": 62,
      "end_line": 66,
      "comment": "\n     * Create a exponential distribution with the given mean.\n     * @param mean mean of this distribution.\n     * @param inverseCumAccuracy the maximum absolute error in inverse cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY})\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 16)",
        "(line 64,col 9)-(line 64,col 30)",
        "(line 65,col 9)-(line 65,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.setMean(double)",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\n     * Modify the mean.\n     * @param mean the new mean.\n     * @throws IllegalArgumentException if \u003ccode\u003emean\u003c/code\u003e is not positive.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.setMeanInternal(double)",
      "begin_line": 83,
      "end_line": 89,
      "comment": "\n     * Modify the mean.\n     * @param newMean the new mean.\n     * @throws IllegalArgumentException if \u003ccode\u003enewMean\u003c/code\u003e is not positive.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 88,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.getMean()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Access the mean.\n     * @return the mean.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.density(java.lang.Double)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * Return the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     * @deprecated - use density(double)\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.density(double)",
      "begin_line": 117,
      "end_line": 123,
      "comment": "\n     * Return the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.cumulativeProbability(double)",
      "begin_line": 140,
      "end_line": 148,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026lt; x).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/ExponentialDistribution.html\"\u003e\n     * Exponential Distribution\u003c/a\u003e, equation (1).\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x the value at which the CDF is evaluated.\n     * @return CDF for this distribution.\n     * @throws MathException if the cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 19)",
        "(line 142,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 162,
      "end_line": 176,
      "comment": "\n     * For this distribution, X, this method returns the critical point x, such\n     * that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns 0 for p\u003d0 and \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e for p\u003d1.\u003c/p\u003e\n     *\n     * @param p the desired probability\n     * @return x, such that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e\n     * @throws MathException if the inverse cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if p \u003c 0 or p \u003e 1.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 19)",
        "(line 166,col 9)-(line 173,col 9)",
        "(line 175,col 9)-(line 175,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 186,
      "end_line": 189,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 199,
      "end_line": 211,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 210,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.getInitialDomain(double)",
      "begin_line": 220,
      "end_line": 233,
      "comment": "\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.\n     *\n     * @param p the desired probability for the critical value\n     * @return initial domain value\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 232,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 242,
      "end_line": 245,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 38)"
      ]
    }
  ]
}