{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/distribution/FDistributionImpl.java",
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
      "begin_line": 33,
      "end_line": 281,
      "comment": "\n * Default implementation of\n * {@link org.apache.commons.math.distribution.FDistribution}.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Default inverse cumulative probability accuracy\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "numeratorDegreesOfFreedom"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " The numerator degrees of freedom"
    },
    {
      "type": "field",
      "varNames": [
        "denominatorDegreesOfFreedom"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " The numerator degrees of freedom"
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Inverse cumulative probability accuracy "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.FDistributionImpl(double, double)",
      "begin_line": 60,
      "end_line": 63,
      "comment": "\n     * Create a F distribution using the given degrees of freedom.\n     * @param numeratorDegreesOfFreedom the numerator degrees of freedom.\n     * @param denominatorDegreesOfFreedom the denominator degrees of freedom.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 104)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.FDistributionImpl(double, double, double)",
      "begin_line": 73,
      "end_line": 79,
      "comment": "\n     * Create a F distribution using the given degrees of freedom and inverse cumulative probability accuracy.\n     * @param numeratorDegreesOfFreedom the numerator degrees of freedom.\n     * @param denominatorDegreesOfFreedom the denominator degrees of freedom.\n     * @param inverseCumAccuracy the maximum absolute error in inverse cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY})\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 16)",
        "(line 76,col 9)-(line 76,col 72)",
        "(line 77,col 9)-(line 77,col 76)",
        "(line 78,col 9)-(line 78,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.density(double)",
      "begin_line": 88,
      "end_line": 98,
      "comment": "\n     * Returns the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 59)",
        "(line 91,col 9)-(line 91,col 61)",
        "(line 92,col 9)-(line 92,col 44)",
        "(line 93,col 9)-(line 93,col 68)",
        "(line 94,col 9)-(line 94,col 70)",
        "(line 95,col 9)-(line 95,col 104)",
        "(line 96,col 9)-(line 97,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.cumulativeProbability(double)",
      "begin_line": 115,
      "end_line": 128,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026lt; x).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/F-Distribution.html\"\u003e\n     * F-Distribution\u003c/a\u003e, equation (4).\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x the value at which the CDF is evaluated.\n     * @return CDF for this distribution.\n     * @throws MathException if the cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 19)",
        "(line 117,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 143,
      "end_line": 153,
      "comment": "\n     * For this distribution, X, this method returns the critical point x, such\n     * that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns 0 for p\u003d0 and \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e for p\u003d1.\u003c/p\u003e\n     *\n     * @param p the desired probability\n     * @return x, such that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e\n     * @throws MathException if the inverse cumulative probability can not be\n     *         computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *         probability.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 164,
      "end_line": 167,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 178,
      "end_line": 181,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getInitialDomain(double)",
      "begin_line": 191,
      "end_line": 200,
      "comment": "\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return initial domain value\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 25)",
        "(line 194,col 9)-(line 194,col 47)",
        "(line 195,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.setNumeratorDegreesOfFreedom(double)",
      "begin_line": 209,
      "end_line": 212,
      "comment": "\n     * Modify the numerator degrees of freedom.\n     * @param degreesOfFreedom the new numerator degrees of freedom.\n     * @throws IllegalArgumentException if \u003ccode\u003edegreesOfFreedom\u003c/code\u003e is not\n     *         positive.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.setNumeratorDegreesOfFreedomInternal(double)",
      "begin_line": 220,
      "end_line": 226,
      "comment": "\n     * Modify the numerator degrees of freedom.\n     * @param degreesOfFreedom the new numerator degrees of freedom.\n     * @throws IllegalArgumentException if \u003ccode\u003edegreesOfFreedom\u003c/code\u003e is not\n     *         positive.\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getNumeratorDegreesOfFreedom()",
      "begin_line": 232,
      "end_line": 234,
      "comment": "\n     * Access the numerator degrees of freedom.\n     * @return the numerator degrees of freedom.\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.setDenominatorDegreesOfFreedom(double)",
      "begin_line": 243,
      "end_line": 246,
      "comment": "\n     * Modify the denominator degrees of freedom.\n     * @param degreesOfFreedom the new denominator degrees of freedom.\n     * @throws IllegalArgumentException if \u003ccode\u003edegreesOfFreedom\u003c/code\u003e is not\n     *         positive.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.setDenominatorDegreesOfFreedomInternal(double)",
      "begin_line": 254,
      "end_line": 260,
      "comment": "\n     * Modify the denominator degrees of freedom.\n     * @param degreesOfFreedom the new denominator degrees of freedom.\n     * @throws IllegalArgumentException if \u003ccode\u003edegreesOfFreedom\u003c/code\u003e is not\n     *         positive.\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getDenominatorDegreesOfFreedom()",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\n     * Access the denominator degrees of freedom.\n     * @return the denominator degrees of freedom.\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 277,
      "end_line": 280,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 38)"
      ]
    }
  ]
}