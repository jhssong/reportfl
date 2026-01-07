{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/distribution/FDistributionImpl.java",
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
      "end_line": 283,
      "comment": "\n * Default implementation of\n * {@link org.apache.commons.math.distribution.FDistribution}.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Default inverse cumulative probability accuracy\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "NON_POSITIVE_DEGREES_OF_FREEDOM_MESSAGE"
      ],
      "begin_line": 42,
      "end_line": 43,
      "comment": " Message for non positive degrees of freddom. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "numeratorDegreesOfFreedom"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The numerator degrees of freedom"
    },
    {
      "type": "field",
      "varNames": [
        "denominatorDegreesOfFreedom"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " The numerator degrees of freedom"
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Inverse cumulative probability accuracy "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.FDistributionImpl(double, double)",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     * Create a F distribution using the given degrees of freedom.\n     * @param numeratorDegreesOfFreedom the numerator degrees of freedom.\n     * @param denominatorDegreesOfFreedom the denominator degrees of freedom.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 104)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.FDistributionImpl(double, double, double)",
      "begin_line": 75,
      "end_line": 81,
      "comment": "\n     * Create a F distribution using the given degrees of freedom and inverse cumulative probability accuracy.\n     * @param numeratorDegreesOfFreedom the numerator degrees of freedom.\n     * @param denominatorDegreesOfFreedom the denominator degrees of freedom.\n     * @param inverseCumAccuracy the maximum absolute error in inverse cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY})\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 16)",
        "(line 78,col 9)-(line 78,col 72)",
        "(line 79,col 9)-(line 79,col 76)",
        "(line 80,col 9)-(line 80,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.density(double)",
      "begin_line": 90,
      "end_line": 100,
      "comment": "\n     * Returns the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 59)",
        "(line 93,col 9)-(line 93,col 61)",
        "(line 94,col 9)-(line 94,col 40)",
        "(line 95,col 9)-(line 95,col 64)",
        "(line 96,col 9)-(line 96,col 66)",
        "(line 97,col 9)-(line 97,col 100)",
        "(line 98,col 9)-(line 99,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.cumulativeProbability(double)",
      "begin_line": 117,
      "end_line": 130,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026lt; x).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/F-Distribution.html\"\u003e\n     * F-Distribution\u003c/a\u003e, equation (4).\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x the value at which the CDF is evaluated.\n     * @return CDF for this distribution.\n     * @throws MathException if the cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 19)",
        "(line 119,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 145,
      "end_line": 155,
      "comment": "\n     * For this distribution, X, this method returns the critical point x, such\n     * that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns 0 for p\u003d0 and \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e for p\u003d1.\u003c/p\u003e\n     *\n     * @param p the desired probability\n     * @return x, such that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e\n     * @throws MathException if the inverse cumulative probability can not be\n     *         computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *         probability.\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 166,
      "end_line": 169,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 180,
      "end_line": 183,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getInitialDomain(double)",
      "begin_line": 193,
      "end_line": 202,
      "comment": "\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return initial domain value\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 25)",
        "(line 196,col 9)-(line 196,col 47)",
        "(line 197,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 201,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.setNumeratorDegreesOfFreedom(double)",
      "begin_line": 211,
      "end_line": 214,
      "comment": "\n     * Modify the numerator degrees of freedom.\n     * @param degreesOfFreedom the new numerator degrees of freedom.\n     * @throws IllegalArgumentException if \u003ccode\u003edegreesOfFreedom\u003c/code\u003e is not\n     *         positive.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.setNumeratorDegreesOfFreedomInternal(double)",
      "begin_line": 222,
      "end_line": 228,
      "comment": "\n     * Modify the numerator degrees of freedom.\n     * @param degreesOfFreedom the new numerator degrees of freedom.\n     * @throws IllegalArgumentException if \u003ccode\u003edegreesOfFreedom\u003c/code\u003e is not\n     *         positive.\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getNumeratorDegreesOfFreedom()",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\n     * Access the numerator degrees of freedom.\n     * @return the numerator degrees of freedom.\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.setDenominatorDegreesOfFreedom(double)",
      "begin_line": 245,
      "end_line": 248,
      "comment": "\n     * Modify the denominator degrees of freedom.\n     * @param degreesOfFreedom the new denominator degrees of freedom.\n     * @throws IllegalArgumentException if \u003ccode\u003edegreesOfFreedom\u003c/code\u003e is not\n     *         positive.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.setDenominatorDegreesOfFreedomInternal(double)",
      "begin_line": 256,
      "end_line": 262,
      "comment": "\n     * Modify the denominator degrees of freedom.\n     * @param degreesOfFreedom the new denominator degrees of freedom.\n     * @throws IllegalArgumentException if \u003ccode\u003edegreesOfFreedom\u003c/code\u003e is not\n     *         positive.\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 261,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getDenominatorDegreesOfFreedom()",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\n     * Access the denominator degrees of freedom.\n     * @return the denominator degrees of freedom.\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 279,
      "end_line": 282,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 38)"
      ]
    }
  ]
}