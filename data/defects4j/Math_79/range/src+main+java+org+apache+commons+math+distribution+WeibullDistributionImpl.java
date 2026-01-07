{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/distribution/WeibullDistributionImpl.java",
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
      "begin_line": 31,
      "end_line": 181,
      "comment": "\n * Default implementation of\n * {@link org.apache.commons.math.distribution.WeibullDistribution}.\n *\n * @since 1.1\n * @version $Revision$ $Date$\n "
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
        "shape"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The shape parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The scale parameter. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.WeibullDistributionImpl(double, double)",
      "begin_line": 49,
      "end_line": 53,
      "comment": "\n     * Creates weibull distribution with the given shape and scale and a\n     * location equal to zero.\n     * @param alpha the shape parameter.\n     * @param beta the scale parameter.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 16)",
        "(line 51,col 9)-(line 51,col 24)",
        "(line 52,col 9)-(line 52,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.cumulativeProbability(double)",
      "begin_line": 60,
      "end_line": 68,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026lt; \u003ccode\u003ex\u003c/code\u003e).\n     * @param x the value at which the CDF is evaluated.\n     * @return CDF evaluted at \u003ccode\u003ex\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 19)",
        "(line 62,col 9)-(line 66,col 9)",
        "(line 67,col 9)-(line 67,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getShape()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Access the shape parameter.\n     * @return the shape parameter.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getScale()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Access the scale parameter.\n     * @return the scale parameter.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 98,
      "end_line": 112,
      "comment": "\n     * For this distribution, X, this method returns the critical point x, such\n     * that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e for p\u003d0 and\n     * \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e for p\u003d1.\u003c/p\u003e\n     *\n     * @param p the desired probability\n     * @return x, such that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *         probability.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 19)",
        "(line 101,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.setShape(double)",
      "begin_line": 118,
      "end_line": 125,
      "comment": "\n     * Modify the shape parameter.\n     * @param alpha the new shape parameter value.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.setScale(double)",
      "begin_line": 131,
      "end_line": 138,
      "comment": "\n     * Modify the scale parameter.\n     * @param beta the new scale parameter value.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 149,
      "end_line": 152,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 163,
      "end_line": 166,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getInitialDomain(double)",
      "begin_line": 176,
      "end_line": 180,
      "comment": "\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return initial domain value\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 70)"
      ]
    }
  ]
}