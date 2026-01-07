{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/distribution/ChiSquaredDistributionImpl.java",
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
      "end_line": 271,
      "comment": "\n * The default implementation of {@link ChiSquaredDistribution}\n *\n * @version $Revision$ $Date$\n "
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
        "gamma"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Internal Gamma distribution. "
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
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.ChiSquaredDistributionImpl(double)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Create a Chi-Squared distribution with the given degrees of freedom.\n     * @param df degrees of freedom.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.ChiSquaredDistributionImpl(double, org.apache.commons.math.distribution.GammaDistribution)",
      "begin_line": 63,
      "end_line": 69,
      "comment": "\n     * Create a Chi-Squared distribution with the given degrees of freedom.\n     * @param df degrees of freedom.\n     * @param g the underlying gamma distribution used to compute probabilities.\n     * @since 1.2\n     * @deprecated as of 2.1 (to avoid possibly inconsistent state, the\n     * \"GammaDistribution\" will be instantiated internally)\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 16)",
        "(line 66,col 9)-(line 66,col 28)",
        "(line 67,col 9)-(line 67,col 40)",
        "(line 68,col 9)-(line 68,col 67)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.ChiSquaredDistributionImpl(double, double)",
      "begin_line": 79,
      "end_line": 84,
      "comment": "\n     * Create a Chi-Squared distribution with the given degrees of freedom and\n     * inverse cumulative probability accuracy.\n     * @param df degrees of freedom.\n     * @param inverseCumAccuracy the maximum absolute error in inverse cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY})\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 16)",
        "(line 81,col 9)-(line 81,col 57)",
        "(line 82,col 9)-(line 82,col 40)",
        "(line 83,col 9)-(line 83,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.setDegreesOfFreedom(double)",
      "begin_line": 91,
      "end_line": 94,
      "comment": "\n     * Modify the degrees of freedom.\n     * @param degreesOfFreedom the new degrees of freedom.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.setDegreesOfFreedomInternal(double)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Modify the degrees of freedom.\n     * @param degreesOfFreedom the new degrees of freedom.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.getDegreesOfFreedom()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Access the degrees of freedom.\n     * @return the degrees of freedom.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.density(java.lang.Double)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Return the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     * @deprecated\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.density(double)",
      "begin_line": 129,
      "end_line": 132,
      "comment": "\n     * Return the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.cumulativeProbability(double)",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026lt; x).\n     * @param x the value at which the CDF is evaluated.\n     * @return CDF for this distribution.\n     * @throws MathException if the cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 158,
      "end_line": 168,
      "comment": "\n     * For this distribution, X, this method returns the critical point x, such\n     * that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns 0 for p\u003d0 and \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e for p\u003d1.\u003c/p\u003e\n     *\n     * @param p the desired probability\n     * @return x, such that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e\n     * @throws MathException if the inverse cumulative probability can not be\n     *         computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *         probability.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 179,
      "end_line": 182,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 193,
      "end_line": 209,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 19)",
        "(line 200,col 9)-(line 206,col 9)",
        "(line 208,col 9)-(line 208,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.getInitialDomain(double)",
      "begin_line": 219,
      "end_line": 235,
      "comment": "\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return initial domain value\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 19)",
        "(line 226,col 9)-(line 232,col 9)",
        "(line 234,col 9)-(line 234,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.setGamma(org.apache.commons.math.distribution.GammaDistribution)",
      "begin_line": 244,
      "end_line": 247,
      "comment": "\n     * Modify the underlying gamma distribution.  The caller is responsible for\n     * insuring the gamma distribution has the proper parameter settings.\n     * @param g the new distribution.\n     * @since 1.2 made public\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.setGammaInternal(org.apache.commons.math.distribution.GammaDistribution)",
      "begin_line": 254,
      "end_line": 257,
      "comment": "\n     * Modify the underlying gamma distribution.  The caller is responsible for\n     * insuring the gamma distribution has the proper parameter settings.\n     * @param g the new distribution.\n     * @since 1.2 made public\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 267,
      "end_line": 270,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 38)"
      ]
    }
  ]
}