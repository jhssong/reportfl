{
  "filepath": "/tmp/Math-95b/src/java/org/apache/commons/math/distribution/BetaDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BetaDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractContinuousDistribution",
        "org.apache.commons.math.distribution.BetaDistribution"
      ],
      "begin_line": 33,
      "end_line": 232,
      "comment": "\n * Implements the Beta distribution.\n * \u003cp\u003e\n * References:\n * \u003cul\u003e\n * \u003cli\u003e\u003ca href\u003d\"http://en.wikipedia.org/wiki/Beta_distribution\"\u003e\n * Beta distribution\u003c/a\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "alpha"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " First shape parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "beta"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Second shape parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "z"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Normalizing factor used in density computations.\n     * updated whenever alpha or beta are changed.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.BetaDistributionImpl(double, double)",
      "begin_line": 55,
      "end_line": 59,
      "comment": "\n     * Build a new instance.\n     * @param alpha first shape parameter (must be positive)\n     * @param beta second shape parameter (must be positive)\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 27)",
        "(line 57,col 9)-(line 57,col 25)",
        "(line 58,col 9)-(line 58,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.setAlpha(double)",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * Modify the shape parameter, alpha.\n     *\n     * @param alpha the new shape parameter.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 27)",
        "(line 68,col 9)-(line 68,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.getAlpha()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Access the shape parameter, alpha\n     *\n     * @return alpha.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.setBeta(double)",
      "begin_line": 85,
      "end_line": 88,
      "comment": "\n     * Modify the shape parameter, beta.\n     *\n     * @param beta the new scale parameter.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 25)",
        "(line 87,col 9)-(line 87,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.getBeta()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Access the shape parameter, beta\n     *\n     * @return beta.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.recomputeZ()",
      "begin_line": 102,
      "end_line": 106,
      "comment": "\n     * Recompute the normalization factor.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 105,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.density(java.lang.Double)",
      "begin_line": 114,
      "end_line": 133,
      "comment": "\n     * Return the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 21)",
        "(line 116,col 9)-(line 132,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 144,
      "end_line": 152,
      "comment": "\n     * For this distribution, X, this method returns x such that P(X \u0026lt; x) \u003d p.\n     *\n     * @param p the cumulative probability.\n     * @return x.\n     * @throws org.apache.commons.math.MathException\n     *          if the inverse cumulative probability can not be\n     *          computed due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 151,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.getInitialDomain(double)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return initial domain value\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.cumulativeProbability(double)",
      "begin_line": 205,
      "end_line": 213,
      "comment": "\n     * For a random variable X whose values are distributed according\n     * to this distribution, this method returns P(X \u0026le; x).  In other words,\n     * this method represents the  (cumulative) distribution function, or\n     * CDF, for this distribution.\n     *\n     * @param x the value at which the distribution function is evaluated.\n     * @return the probability that a random variable with this\n     *         distribution takes a value less than or equal to \u003ccode\u003ex\u003c/code\u003e\n     * @throws org.apache.commons.math.MathException\n     *          if the cumulative probability can not be\n     *          computed due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 212,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.cumulativeProbability(double, double)",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n     * For a random variable X whose values are distributed according\n     * to this distribution, this method returns P(x0 \u0026le; X \u0026le; x1).\n     *\n     * @param x0 the (inclusive) lower bound\n     * @param x1 the (inclusive) upper bound\n     * @return the probability that a random variable with this distribution\n     *         will take a value between \u003ccode\u003ex0\u003c/code\u003e and \u003ccode\u003ex1\u003c/code\u003e,\n     *         including the endpoints\n     * @throws org.apache.commons.math.MathException\n     *                                  if the cumulative probability can not be\n     *                                  computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if \u003ccode\u003ex0 \u003e x1\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 69)"
      ]
    }
  ]
}