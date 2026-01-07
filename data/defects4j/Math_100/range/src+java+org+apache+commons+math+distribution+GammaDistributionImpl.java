{
  "filepath": "/tmp/Math-100b/src/java/org/apache/commons/math/distribution/GammaDistributionImpl.java",
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
      "begin_line": 29,
      "end_line": 210,
      "comment": "\n * The default implementation of {@link GammaDistribution}.\n *\n * @version $Revision$ $Date$\n "
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
        "alpha"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " The shape parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "beta"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The scale parameter. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.GammaDistributionImpl(double, double)",
      "begin_line": 46,
      "end_line": 50,
      "comment": "\n     * Create a new gamma distribution with the given alpha and beta values.\n     * @param alpha the shape parameter.\n     * @param beta the scale parameter.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 16)",
        "(line 48,col 9)-(line 48,col 24)",
        "(line 49,col 9)-(line 49,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.cumulativeProbability(double)",
      "begin_line": 69,
      "end_line": 79,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026lt; x).\n     * \n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/Chi-SquaredDistribution.html\"\u003e\n     * Chi-Squared Distribution\u003c/a\u003e, equation (9).\u003c/li\u003e\n     * \u003cli\u003eCasella, G., \u0026 Berger, R. (1990). \u003ci\u003eStatistical Inference\u003c/i\u003e.\n     * Belmont, CA: Duxbury Press.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param x the value at which the CDF is evaluated.\n     * @return CDF for this distribution. \n     * @throws MathException if the cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 19)",
        "(line 72,col 9)-(line 76,col 9)",
        "(line 78,col 9)-(line 78,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 94,
      "end_line": 103,
      "comment": "\n     * For this distribution, X, this method returns the critical point x, such\n     * that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns 0 for p\u003d0 and \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e for p\u003d1.\u003c/p\u003e\n     *\n     * @param p the desired probability\n     * @return x, such that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e\n     * @throws MathException if the inverse cumulative probability can not be\n     *         computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *         probability.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.setAlpha(double)",
      "begin_line": 110,
      "end_line": 115,
      "comment": "\n     * Modify the shape parameter, alpha.\n     * @param alpha the new shape parameter.\n     * @throws IllegalArgumentException if \u003ccode\u003ealpha\u003c/code\u003e is not positive.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.getAlpha()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Access the shape parameter, alpha\n     * @return alpha.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.setBeta(double)",
      "begin_line": 130,
      "end_line": 135,
      "comment": "\n     * Modify the scale parameter, beta.\n     * @param beta the new scale parameter.\n     * @throws IllegalArgumentException if \u003ccode\u003ebeta\u003c/code\u003e is not positive.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.getBeta()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * Access the scale parameter, beta\n     * @return beta.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 154,
      "end_line": 157,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     * \n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 168,
      "end_line": 184,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     * \n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e \n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 19)",
        "(line 175,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 183,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionImpl.getInitialDomain(double)",
      "begin_line": 194,
      "end_line": 209,
      "comment": "\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     * \n     * @param p the desired probability for the critical value\n     * @return initial domain value\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 19)",
        "(line 200,col 9)-(line 206,col 9)",
        "(line 208,col 9)-(line 208,col 19)"
      ]
    }
  ]
}