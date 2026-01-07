{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/distribution/ExponentialDistributionImpl.java",
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
      "begin_line": 27,
      "end_line": 168,
      "comment": "\n * The default implementation of {@link ExponentialDistribution}.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " The mean of this distribution. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.ExponentialDistributionImpl(double)",
      "begin_line": 40,
      "end_line": 43,
      "comment": "\n     * Create a exponential distribution with the given mean.\n     * @param mean mean of this distribution.\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 16)",
        "(line 42,col 9)-(line 42,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.setMean(double)",
      "begin_line": 50,
      "end_line": 55,
      "comment": "\n     * Modify the mean.\n     * @param mean the new mean.\n     * @throws IllegalArgumentException if \u003ccode\u003emean\u003c/code\u003e is not positive.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 53,col 9)",
        "(line 54,col 9)-(line 54,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.getMean()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Access the mean.\n     * @return the mean.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.cumulativeProbability(double)",
      "begin_line": 80,
      "end_line": 88,
      "comment": "\n     * For this disbution, X, this method returns P(X \u0026lt; x).\n     * \n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/ExponentialDistribution.html\"\u003e\n     * Exponential Distribution\u003c/a\u003e, equation (1).\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param x the value at which the CDF is evaluated.\n     * @return CDF for this distribution.\n     * @throws MathException if the cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 19)",
        "(line 82,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 102,
      "end_line": 115,
      "comment": "\n     * For this distribution, X, this method returns the critical point x, such\n     * that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns 0 for p\u003d0 and \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e for p\u003d1.\n     * \n     * @param p the desired probability\n     * @return x, such that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e\n     * @throws MathException if the inverse cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if p \u003c 0 or p \u003e 1.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 19)",
        "(line 105,col 9)-(line 112,col 9)",
        "(line 114,col 9)-(line 114,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.   \n     * \n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 137,
      "end_line": 148,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.   \n     * \n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e \n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 147,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ExponentialDistributionImpl.getInitialDomain(double)",
      "begin_line": 157,
      "end_line": 167,
      "comment": "\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.   \n     * \n     * @param p the desired probability for the critical value\n     * @return initial domain value\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 166,col 9)"
      ]
    }
  ]
}