{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/distribution/WeibullDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WeibullDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractContinuousDistribution",
        "org.apache.commons.math.distribution.WeibullDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 28,
      "end_line": 172,
      "comment": "\r\n * Default implementation of\r\n * {@link org.apache.commons.math.distribution.WeibullDistribution}.\r\n *\r\n * @since 1.1\r\n * @version $Revision: 1.13 $ $Date: 2004-07-24 16:41:37 -0500 (Sat, 24 Jul 2004) $\r\n "
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
        "alpha"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " The shape parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "beta"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The scale parameter. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.WeibullDistributionImpl(double, double)",
      "begin_line": 46,
      "end_line": 50,
      "comment": "\r\n     * Creates weibull distribution with the given shape and scale and a\r\n     * location equal to zero.\r\n     * @param alpha the shape parameter.\r\n     * @param beta the scale parameter.\r\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 16)",
        "(line 48,col 9)-(line 48,col 24)",
        "(line 49,col 9)-(line 49,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.cumulativeProbability(double)",
      "begin_line": 57,
      "end_line": 65,
      "comment": "\r\n     * For this disbution, X, this method returns P(X \u0026lt; \u003ccode\u003ex\u003c/code\u003e).\r\n     * @param x the value at which the CDF is evaluated.\r\n     * @return CDF evaluted at \u003ccode\u003ex\u003c/code\u003e. \r\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 19)",
        "(line 59,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 64,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getShape()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\r\n     * Access the shape parameter.\r\n     * @return the shape parameter.\r\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getScale()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\r\n     * Access the scale parameter.\r\n     * @return the scale parameter.\r\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 95,
      "end_line": 108,
      "comment": "\r\n     * For this distribution, X, this method returns the critical point x, such\r\n     * that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e.\r\n     * \u003cp\u003e\r\n     * Returns \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e for p\u003d0 and \r\n     * \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e for p\u003d1.\r\n     *\r\n     * @param p the desired probability\r\n     * @return x, such that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e\r\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\r\n     *         probability.\r\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 19)",
        "(line 97,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.setShape(double)",
      "begin_line": 114,
      "end_line": 120,
      "comment": "\r\n     * Modify the shape parameter.\r\n     * @param alpha the new shape parameter value.\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.setScale(double)",
      "begin_line": 126,
      "end_line": 132,
      "comment": "\r\n     * Modify the scale parameter.\r\n     * @param beta the new scale parameter value.\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\r\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\r\n     * bracket a CDF root.  This method is used by\r\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\r\n     * \r\n     * @param p the desired probability for the critical value\r\n     * @return domain value lower bound, i.e.\r\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e \r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\r\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\r\n     * bracket a CDF root.  This method is used by\r\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\r\n     * \r\n     * @param p the desired probability for the critical value\r\n     * @return domain value upper bound, i.e.\r\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e \r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getInitialDomain(double)",
      "begin_line": 168,
      "end_line": 171,
      "comment": "\r\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\r\n     * bracket a CDF root.  This method is used by\r\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\r\n     * \r\n     * @param p the desired probability for the critical value\r\n     * @return initial domain value\r\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 70)"
      ]
    }
  ]
}