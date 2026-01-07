{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/distribution/CauchyDistributionImpl.java",
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
      "begin_line": 31,
      "end_line": 202,
      "comment": "\n * Default implementation of\n * {@link org.apache.commons.math.distribution.CauchyDistribution}.\n *\n * @since 1.1\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "median"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The median of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The scale of this distribution. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.CauchyDistributionImpl()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Creates cauchy distribution with the medain equal to zero and scale\n     * equal to one.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.CauchyDistributionImpl(double, double)",
      "begin_line": 56,
      "end_line": 60,
      "comment": "\n     * Create a cauchy distribution using the given median and scale.\n     * @param median median for this distribution\n     * @param s scale parameter for this distribution\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 16)",
        "(line 58,col 9)-(line 58,col 26)",
        "(line 59,col 9)-(line 59,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.cumulativeProbability(double)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026lt; \u003ccode\u003ex\u003c/code\u003e).\n     * @param x the value at which the CDF is evaluated.\n     * @return CDF evaluted at \u003ccode\u003ex\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.getMedian()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Access the median.\n     * @return median for this distribution\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.getScale()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Access the scale parameter.\n     * @return scale parameter for this distribution\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 99,
      "end_line": 113,
      "comment": "\n     * For this distribution, X, this method returns the critical point x, such\n     * that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e for p\u003d0 and\n     * \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e for p\u003d1.\u003c/p\u003e\n     *\n     * @param p the desired probability\n     * @return x, such that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *         probability.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 19)",
        "(line 102,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.setMedian(double)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * Modify the median.\n     * @param median for this distribution\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.setScale(double)",
      "begin_line": 128,
      "end_line": 134,
      "comment": "\n     * Modify the scale parameter.\n     * @param s scale parameter for this distribution\n     * @throws IllegalArgumentException if \u003ccode\u003esd\u003c/code\u003e is not positive.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 145,
      "end_line": 156,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 19)",
        "(line 149,col 9)-(line 153,col 9)",
        "(line 155,col 9)-(line 155,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 167,
      "end_line": 178,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 19)",
        "(line 171,col 9)-(line 175,col 9)",
        "(line 177,col 9)-(line 177,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.getInitialDomain(double)",
      "begin_line": 188,
      "end_line": 201,
      "comment": "\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return initial domain value\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 19)",
        "(line 192,col 9)-(line 198,col 9)",
        "(line 200,col 9)-(line 200,col 19)"
      ]
    }
  ]
}