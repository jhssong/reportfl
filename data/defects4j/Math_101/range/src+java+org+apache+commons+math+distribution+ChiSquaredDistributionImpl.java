{
  "filepath": "/tmp/Math-101b/src/java/org/apache/commons/math/distribution/ChiSquaredDistributionImpl.java",
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
      "end_line": 191,
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
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.cumulativeProbability(double)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026lt; x).\n     * @param x the value at which the CDF is evaluated.\n     * @return CDF for this distribution. \n     * @throws MathException if the cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 98,
      "end_line": 107,
      "comment": "\n     * For this distribution, X, this method returns the critical point x, such\n     * that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns 0 for p\u003d0 and \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e for p\u003d1.\u003c/p\u003e\n     *\n     * @param p the desired probability\n     * @return x, such that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e\n     * @throws MathException if the inverse cumulative probability can not be\n     *         computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *         probability.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     * \n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e \n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 131,
      "end_line": 146,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     * \n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e \n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 19)",
        "(line 137,col 9)-(line 143,col 9)",
        "(line 145,col 9)-(line 145,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.getInitialDomain(double)",
      "begin_line": 156,
      "end_line": 171,
      "comment": "\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     * \n     * @param p the desired probability for the critical value\n     * @return initial domain value\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 19)",
        "(line 162,col 9)-(line 168,col 9)",
        "(line 170,col 9)-(line 170,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.setGamma(org.apache.commons.math.distribution.GammaDistribution)",
      "begin_line": 179,
      "end_line": 182,
      "comment": "\n     * Modify the underlying gamma distribution.  The caller is responsible for\n     * insuring the gamma distribution has the proper parameter settings.\n     * @param g the new distribution.\n     * @since 1.2 made public\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ChiSquaredDistributionImpl.getGamma()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * Access the Gamma distribution.\n     * @return the internal Gamma distribution.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 21)"
      ]
    }
  ]
}