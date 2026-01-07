{
  "filepath": "/tmp/Math-92b/src/java/org/apache/commons/math/distribution/FDistributionImpl.java",
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
      "begin_line": 30,
      "end_line": 196,
      "comment": "\n * Default implementation of\n * {@link org.apache.commons.math.distribution.FDistribution}.\n *\n * @version $Revision$ $Date$\n "
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
        "numeratorDegreesOfFreedom"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The numerator degrees of freedom"
    },
    {
      "type": "field",
      "varNames": [
        "denominatorDegreesOfFreedom"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The numerator degrees of freedom"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.FDistributionImpl(double, double)",
      "begin_line": 48,
      "end_line": 53,
      "comment": "\n     * Create a F distribution using the given degrees of freedom.\n     * @param numeratorDegreesOfFreedom the numerator degrees of freedom.\n     * @param denominatorDegreesOfFreedom the denominator degrees of freedom.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 16)",
        "(line 51,col 9)-(line 51,col 64)",
        "(line 52,col 9)-(line 52,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.cumulativeProbability(double)",
      "begin_line": 70,
      "end_line": 83,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026lt; x).\n     * \n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/F-Distribution.html\"\u003e\n     * F-Distribution\u003c/a\u003e, equation (4).\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param x the value at which the CDF is evaluated.\n     * @return CDF for this distribution. \n     * @throws MathException if the cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 19)",
        "(line 72,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 82,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.inverseCumulativeProbability(double)",
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
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     * \n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e \n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     * \n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e \n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getInitialDomain(double)",
      "begin_line": 143,
      "end_line": 151,
      "comment": "\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     * \n     * @param p the desired probability for the critical value\n     * @return initial domain value\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 25)",
        "(line 145,col 9)-(line 145,col 52)",
        "(line 146,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.setNumeratorDegreesOfFreedom(double)",
      "begin_line": 159,
      "end_line": 165,
      "comment": "\n     * Modify the numerator degrees of freedom.\n     * @param degreesOfFreedom the new numerator degrees of freedom.\n     * @throws IllegalArgumentException if \u003ccode\u003edegreesOfFreedom\u003c/code\u003e is not\n     *         positive.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getNumeratorDegreesOfFreedom()",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * Access the numerator degrees of freedom.\n     * @return the numerator degrees of freedom.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.setDenominatorDegreesOfFreedom(double)",
      "begin_line": 181,
      "end_line": 187,
      "comment": "\n     * Modify the denominator degrees of freedom.\n     * @param degreesOfFreedom the new denominator degrees of freedom.\n     * @throws IllegalArgumentException if \u003ccode\u003edegreesOfFreedom\u003c/code\u003e is not\n     *         positive.\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 186,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getDenominatorDegreesOfFreedom()",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\n     * Access the denominator degrees of freedom.\n     * @return the denominator degrees of freedom.\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 43)"
      ]
    }
  ]
}