{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/distribution/CauchyDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CauchyDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractContinuousDistribution",
        "org.apache.commons.math.distribution.CauchyDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 28,
      "end_line": 195,
      "comment": "\r\n * Default implementation of\r\n * {@link org.apache.commons.math.distribution.CauchyDistribution}.\r\n *\r\n * @since 1.1\r\n * @version $Revision$ $Date$\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "median"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " The median of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The scale of this distribution. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.CauchyDistributionImpl()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\r\n     * Creates cauchy distribution with the medain equal to zero and scale\r\n     * equal to one. \r\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.CauchyDistributionImpl(double, double)",
      "begin_line": 53,
      "end_line": 57,
      "comment": "\r\n     * Create a cauchy distribution using the given median and scale.\r\n     * @param median median for this distribution\r\n     * @param s scale parameter for this distribution\r\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 16)",
        "(line 55,col 9)-(line 55,col 26)",
        "(line 56,col 9)-(line 56,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.cumulativeProbability(double)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\r\n     * For this disbution, X, this method returns P(X \u0026lt; \u003ccode\u003ex\u003c/code\u003e).\r\n     * @param x the value at which the CDF is evaluated.\r\n     * @return CDF evaluted at \u003ccode\u003ex\u003c/code\u003e. \r\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.getMedian()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\r\n     * Access the median.\r\n     * @return median for this distribution\r\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.getScale()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\r\n     * Access the scale parameter.\r\n     * @return scale parameter for this distribution\r\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 96,
      "end_line": 109,
      "comment": "\r\n     * For this distribution, X, this method returns the critical point x, such\r\n     * that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e.\r\n     * \u003cp\u003e\r\n     * Returns \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e for p\u003d0 and \r\n     * \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e for p\u003d1.\r\n     *\r\n     * @param p the desired probability\r\n     * @return x, such that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e\r\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\r\n     *         probability.\r\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 19)",
        "(line 98,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.setMedian(double)",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\r\n     * Modify the median.\r\n     * @param median for this distribution\r\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.setScale(double)",
      "begin_line": 124,
      "end_line": 130,
      "comment": "\r\n     * Modify the scale parameter.\r\n     * @param s scale parameter for this distribution\r\n     * @throws IllegalArgumentException if \u003ccode\u003esd\u003c/code\u003e is not positive.\r\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 141,
      "end_line": 151,
      "comment": "\r\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\r\n     * bracket a CDF root.  This method is used by\r\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\r\n     * \r\n     * @param p the desired probability for the critical value\r\n     * @return domain value lower bound, i.e.\r\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e \r\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 19)",
        "(line 144,col 9)-(line 148,col 9)",
        "(line 150,col 9)-(line 150,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 162,
      "end_line": 172,
      "comment": "\r\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\r\n     * bracket a CDF root.  This method is used by\r\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\r\n     * \r\n     * @param p the desired probability for the critical value\r\n     * @return domain value upper bound, i.e.\r\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e \r\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 19)",
        "(line 165,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 171,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.getInitialDomain(double)",
      "begin_line": 182,
      "end_line": 194,
      "comment": "\r\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\r\n     * bracket a CDF root.  This method is used by\r\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\r\n     * \r\n     * @param p the desired probability for the critical value\r\n     * @return initial domain value\r\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 19)",
        "(line 185,col 9)-(line 191,col 9)",
        "(line 193,col 9)-(line 193,col 19)"
      ]
    }
  ]
}