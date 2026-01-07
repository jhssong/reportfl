{
  "filepath": "/tmp/Math-92b/src/java/org/apache/commons/math/distribution/ChiSquaredDistributionImpl.java",
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
      "end_line": 201,
      "comment": "\n * The default implementation of {@link ChiSquaredDistribution}\n *\n * @version $Revision$ $Date$\n "
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
      "begin_line": 36,
      "end_line": 36,
      "comment": " Internal Gamma distribution. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.ChiSquaredDistributionImpl(double)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Create a Chi-Squared distribution with the given degrees of freedom.\n     * @param df degrees of freedom.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.ChiSquaredDistributionImpl(double, org.apache.commons.math.distribution.GammaDistribution)",
      "begin_line": 52,
      "end_line": 56,
      "comment": "\n     * Create a Chi-Squared distribution with the given degrees of freedom.\n     * @param df degrees of freedom.\n     * @param g the underlying gamma distribution used to compute probabilities.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 16)",
        "(line 54,col 9)-(line 54,col 20)",
        "(line 55,col 9)-(line 55,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.setDegreesOfFreedom(double)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Modify the degrees of freedom.\n     * @param degreesOfFreedom the new degrees of freedom.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.getDegreesOfFreedom()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Access the degrees of freedom.\n     * @return the degrees of freedom.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.density(java.lang.Double)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Return the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.cumulativeProbability(double)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026lt; x).\n     * @param x the value at which the CDF is evaluated.\n     * @return CDF for this distribution. \n     * @throws MathException if the cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 108,
      "end_line": 117,
      "comment": "\n     * For this distribution, X, this method returns the critical point x, such\n     * that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns 0 for p\u003d0 and \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e for p\u003d1.\u003c/p\u003e\n     *\n     * @param p the desired probability\n     * @return x, such that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e\n     * @throws MathException if the inverse cumulative probability can not be\n     *         computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *         probability.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     * \n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e \n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 141,
      "end_line": 156,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     * \n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e \n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 19)",
        "(line 147,col 9)-(line 153,col 9)",
        "(line 155,col 9)-(line 155,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.getInitialDomain(double)",
      "begin_line": 166,
      "end_line": 181,
      "comment": "\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     * \n     * @param p the desired probability for the critical value\n     * @return initial domain value\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 19)",
        "(line 172,col 9)-(line 178,col 9)",
        "(line 180,col 9)-(line 180,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.setGamma(org.apache.commons.math.distribution.GammaDistribution)",
      "begin_line": 189,
      "end_line": 192,
      "comment": "\n     * Modify the underlying gamma distribution.  The caller is responsible for\n     * insuring the gamma distribution has the proper parameter settings.\n     * @param g the new distribution.\n     * @since 1.2 made public\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.getGamma()",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\n     * Access the Gamma distribution.\n     * @return the internal Gamma distribution.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 21)"
      ]
    }
  ]
}