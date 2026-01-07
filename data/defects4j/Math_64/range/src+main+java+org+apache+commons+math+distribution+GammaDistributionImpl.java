{
  "filepath": "/tmp/Math-64b/src/main/java/org/apache/commons/math/distribution/GammaDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GammaDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractContinuousDistribution",
        "org.apache.commons.math.distribution.GammaDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 299,
      "comment": "\n * The default implementation of {@link GammaDistribution}.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Default inverse cumulative probability accuracy\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "alpha"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The shape parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "beta"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " The scale parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Inverse cumulative probability accuracy "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.GammaDistributionImpl(double, double)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Create a new gamma distribution with the given alpha and beta values.\n     * @param alpha the shape parameter.\n     * @param beta the scale parameter.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.GammaDistributionImpl(double, double, double)",
      "begin_line": 69,
      "end_line": 74,
      "comment": "\n     * Create a new gamma distribution with the given alpha and beta values.\n     * @param alpha the shape parameter.\n     * @param beta the scale parameter.\n     * @param inverseCumAccuracy the maximum absolute error in inverse cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY})\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 16)",
        "(line 71,col 9)-(line 71,col 32)",
        "(line 72,col 9)-(line 72,col 30)",
        "(line 73,col 9)-(line 73,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.cumulativeProbability(double)",
      "begin_line": 93,
      "end_line": 103,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026lt; x).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/Chi-SquaredDistribution.html\"\u003e\n     * Chi-Squared Distribution\u003c/a\u003e, equation (9).\u003c/li\u003e\n     * \u003cli\u003eCasella, G., \u0026 Berger, R. (1990). \u003ci\u003eStatistical Inference\u003c/i\u003e.\n     * Belmont, CA: Duxbury Press.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x the value at which the CDF is evaluated.\n     * @return CDF for this distribution.\n     * @throws MathException if the cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 19)",
        "(line 96,col 9)-(line 100,col 9)",
        "(line 102,col 9)-(line 102,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 118,
      "end_line": 128,
      "comment": "\n     * For this distribution, X, this method returns the critical point x, such\n     * that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns 0 for p\u003d0 and \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e for p\u003d1.\u003c/p\u003e\n     *\n     * @param p the desired probability\n     * @return x, such that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e\n     * @throws MathException if the inverse cumulative probability can not be\n     *         computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *         probability.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.setAlpha(double)",
      "begin_line": 136,
      "end_line": 139,
      "comment": "\n     * Modify the shape parameter, alpha.\n     * @param alpha the new shape parameter.\n     * @throws IllegalArgumentException if \u003ccode\u003ealpha\u003c/code\u003e is not positive.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.setAlphaInternal(double)",
      "begin_line": 146,
      "end_line": 153,
      "comment": "\n     * Modify the shape parameter, alpha.\n     * @param newAlpha the new shape parameter.\n     * @throws IllegalArgumentException if \u003ccode\u003enewAlpha\u003c/code\u003e is not positive.\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.getAlpha()",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * Access the shape parameter, alpha\n     * @return alpha.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.setBeta(double)",
      "begin_line": 169,
      "end_line": 172,
      "comment": "\n     * Modify the scale parameter, beta.\n     * @param newBeta the new scale parameter.\n     * @throws IllegalArgumentException if \u003ccode\u003enewBeta\u003c/code\u003e is not positive.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.setBetaInternal(double)",
      "begin_line": 179,
      "end_line": 186,
      "comment": "\n     * Modify the scale parameter, beta.\n     * @param newBeta the new scale parameter.\n     * @throws IllegalArgumentException if \u003ccode\u003enewBeta\u003c/code\u003e is not positive.\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.getBeta()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * Access the scale parameter, beta\n     * @return beta.\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.density(double)",
      "begin_line": 202,
      "end_line": 206,
      "comment": "\n     * Returns the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 28)",
        "(line 205,col 9)-(line 205,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.density(java.lang.Double)",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\n     * Return the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     * @deprecated\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 228,
      "end_line": 232,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 243,
      "end_line": 260,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 19)",
        "(line 251,col 9)-(line 257,col 9)",
        "(line 259,col 9)-(line 259,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.getInitialDomain(double)",
      "begin_line": 270,
      "end_line": 286,
      "comment": "\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return initial domain value\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 19)",
        "(line 277,col 9)-(line 283,col 9)",
        "(line 285,col 9)-(line 285,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 295,
      "end_line": 298,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 38)"
      ]
    }
  ]
}