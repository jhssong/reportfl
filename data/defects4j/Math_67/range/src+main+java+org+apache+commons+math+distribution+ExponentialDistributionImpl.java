{
  "filepath": "/tmp/Math-67b/src/main/java/org/apache/commons/math/distribution/ExponentialDistributionImpl.java",
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
      "begin_line": 30,
      "end_line": 264,
      "comment": "\n * The default implementation of {@link ExponentialDistribution}.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * Default inverse cumulative probability accuracy\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The mean of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Inverse cumulative probability accuracy "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.ExponentialDistributionImpl(double)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Create a exponential distribution with the given mean.\n     * @param mean mean of this distribution.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.ExponentialDistributionImpl(double, double)",
      "begin_line": 63,
      "end_line": 67,
      "comment": "\n     * Create a exponential distribution with the given mean.\n     * @param mean mean of this distribution.\n     * @param inverseCumAccuracy the maximum absolute error in inverse cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY})\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 16)",
        "(line 65,col 9)-(line 65,col 30)",
        "(line 66,col 9)-(line 66,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.setMean(double)",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n     * Modify the mean.\n     * @param mean the new mean.\n     * @throws IllegalArgumentException if \u003ccode\u003emean\u003c/code\u003e is not positive.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.setMeanInternal(double)",
      "begin_line": 84,
      "end_line": 90,
      "comment": "\n     * Modify the mean.\n     * @param newMean the new mean.\n     * @throws IllegalArgumentException if \u003ccode\u003enewMean\u003c/code\u003e is not positive.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 89,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.getMean()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Access the mean.\n     * @return the mean.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.density(java.lang.Double)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Return the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     * @deprecated - use density(double)\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.density(double)",
      "begin_line": 118,
      "end_line": 124,
      "comment": "\n     * Return the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.cumulativeProbability(double)",
      "begin_line": 141,
      "end_line": 149,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026lt; x).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/ExponentialDistribution.html\"\u003e\n     * Exponential Distribution\u003c/a\u003e, equation (1).\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x the value at which the CDF is evaluated.\n     * @return CDF for this distribution.\n     * @throws MathException if the cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 19)",
        "(line 143,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 163,
      "end_line": 177,
      "comment": "\n     * For this distribution, X, this method returns the critical point x, such\n     * that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns 0 for p\u003d0 and \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e for p\u003d1.\u003c/p\u003e\n     *\n     * @param p the desired probability\n     * @return x, such that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e\n     * @throws MathException if the inverse cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if p \u003c 0 or p \u003e 1.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 19)",
        "(line 167,col 9)-(line 174,col 9)",
        "(line 176,col 9)-(line 176,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.sample()",
      "begin_line": 191,
      "end_line": 194,
      "comment": "\n     * Generates a random value sampled from this distribution.\n     *\n     * \u003cp\u003e\u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: Uses the \u003ca\n     * href\u003d\"http://www.jesus.ox.ac.uk/~clifford/a5/chap1/node5.html\"\u003e Inversion\n     * Method\u003c/a\u003e to generate exponentially distributed random values from\n     * uniform deviates. \u003c/p\u003e\n     *\n     * @return random value\n     * @since 2.2\n     * @throws MathException if an error occurs generating the random value\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 204,
      "end_line": 207,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 217,
      "end_line": 229,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 228,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.getInitialDomain(double)",
      "begin_line": 238,
      "end_line": 251,
      "comment": "\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.\n     *\n     * @param p the desired probability for the critical value\n     * @return initial domain value\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 250,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 260,
      "end_line": 263,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 38)"
      ]
    }
  ]
}