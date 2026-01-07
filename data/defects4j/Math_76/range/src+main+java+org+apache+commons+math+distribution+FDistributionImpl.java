{
  "filepath": "/tmp/Math-76b/src/main/java/org/apache/commons/math/distribution/FDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractContinuousDistribution",
        "org.apache.commons.math.distribution.FDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 205,
      "comment": "\n * Default implementation of\n * {@link org.apache.commons.math.distribution.FDistribution}.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "NON_POSITIVE_DEGREES_OF_FREEDOM_MESSAGE"
      ],
      "begin_line": 36,
      "end_line": 37,
      "comment": " Message for non positive degrees of freddom. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "numeratorDegreesOfFreedom"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The numerator degrees of freedom"
    },
    {
      "type": "field",
      "varNames": [
        "denominatorDegreesOfFreedom"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The numerator degrees of freedom"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.FDistributionImpl(double, double)",
      "begin_line": 53,
      "end_line": 58,
      "comment": "\n     * Create a F distribution using the given degrees of freedom.\n     * @param numeratorDegreesOfFreedom the numerator degrees of freedom.\n     * @param denominatorDegreesOfFreedom the denominator degrees of freedom.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 16)",
        "(line 56,col 9)-(line 56,col 64)",
        "(line 57,col 9)-(line 57,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.cumulativeProbability(double)",
      "begin_line": 75,
      "end_line": 88,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026lt; x).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/F-Distribution.html\"\u003e\n     * F-Distribution\u003c/a\u003e, equation (4).\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x the value at which the CDF is evaluated.\n     * @return CDF for this distribution.\n     * @throws MathException if the cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 19)",
        "(line 77,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 103,
      "end_line": 113,
      "comment": "\n     * For this distribution, X, this method returns the critical point x, such\n     * that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns 0 for p\u003d0 and \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e for p\u003d1.\u003c/p\u003e\n     *\n     * @param p the desired probability\n     * @return x, such that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e\n     * @throws MathException if the inverse cumulative probability can not be\n     *         computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *         probability.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 124,
      "end_line": 127,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 138,
      "end_line": 141,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getInitialDomain(double)",
      "begin_line": 151,
      "end_line": 160,
      "comment": "\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return initial domain value\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 25)",
        "(line 154,col 9)-(line 154,col 52)",
        "(line 155,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.setNumeratorDegreesOfFreedom(double)",
      "begin_line": 168,
      "end_line": 174,
      "comment": "\n     * Modify the numerator degrees of freedom.\n     * @param degreesOfFreedom the new numerator degrees of freedom.\n     * @throws IllegalArgumentException if \u003ccode\u003edegreesOfFreedom\u003c/code\u003e is not\n     *         positive.\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getNumeratorDegreesOfFreedom()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * Access the numerator degrees of freedom.\n     * @return the numerator degrees of freedom.\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.setDenominatorDegreesOfFreedom(double)",
      "begin_line": 190,
      "end_line": 196,
      "comment": "\n     * Modify the denominator degrees of freedom.\n     * @param degreesOfFreedom the new denominator degrees of freedom.\n     * @throws IllegalArgumentException if \u003ccode\u003edegreesOfFreedom\u003c/code\u003e is not\n     *         positive.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getDenominatorDegreesOfFreedom()",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\n     * Access the denominator degrees of freedom.\n     * @return the denominator degrees of freedom.\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 43)"
      ]
    }
  ]
}