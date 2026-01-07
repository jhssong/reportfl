{
  "filepath": "/tmp/Math-67b/src/main/java/org/apache/commons/math/distribution/FDistributionImpl.java",
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
      "begin_line": 32,
      "end_line": 280,
      "comment": "\n * Default implementation of\n * {@link org.apache.commons.math.distribution.FDistribution}.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Default inverse cumulative probability accuracy\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "numeratorDegreesOfFreedom"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The numerator degrees of freedom"
    },
    {
      "type": "field",
      "varNames": [
        "denominatorDegreesOfFreedom"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The numerator degrees of freedom"
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Inverse cumulative probability accuracy "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.FDistributionImpl(double, double)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Create a F distribution using the given degrees of freedom.\n     * @param numeratorDegreesOfFreedom the numerator degrees of freedom.\n     * @param denominatorDegreesOfFreedom the denominator degrees of freedom.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 104)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.FDistributionImpl(double, double, double)",
      "begin_line": 72,
      "end_line": 78,
      "comment": "\n     * Create a F distribution using the given degrees of freedom and inverse cumulative probability accuracy.\n     * @param numeratorDegreesOfFreedom the numerator degrees of freedom.\n     * @param denominatorDegreesOfFreedom the denominator degrees of freedom.\n     * @param inverseCumAccuracy the maximum absolute error in inverse cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY})\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 16)",
        "(line 75,col 9)-(line 75,col 72)",
        "(line 76,col 9)-(line 76,col 76)",
        "(line 77,col 9)-(line 77,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.density(double)",
      "begin_line": 87,
      "end_line": 97,
      "comment": "\n     * Returns the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 59)",
        "(line 90,col 9)-(line 90,col 61)",
        "(line 91,col 9)-(line 91,col 40)",
        "(line 92,col 9)-(line 92,col 64)",
        "(line 93,col 9)-(line 93,col 66)",
        "(line 94,col 9)-(line 94,col 100)",
        "(line 95,col 9)-(line 96,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.cumulativeProbability(double)",
      "begin_line": 114,
      "end_line": 127,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026lt; x).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/F-Distribution.html\"\u003e\n     * F-Distribution\u003c/a\u003e, equation (4).\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x the value at which the CDF is evaluated.\n     * @return CDF for this distribution.\n     * @throws MathException if the cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 19)",
        "(line 116,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 142,
      "end_line": 152,
      "comment": "\n     * For this distribution, X, this method returns the critical point x, such\n     * that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns 0 for p\u003d0 and \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e for p\u003d1.\u003c/p\u003e\n     *\n     * @param p the desired probability\n     * @return x, such that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e\n     * @throws MathException if the inverse cumulative probability can not be\n     *         computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *         probability.\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 163,
      "end_line": 166,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 177,
      "end_line": 180,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getInitialDomain(double)",
      "begin_line": 190,
      "end_line": 199,
      "comment": "\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return initial domain value\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 25)",
        "(line 193,col 9)-(line 193,col 47)",
        "(line 194,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.setNumeratorDegreesOfFreedom(double)",
      "begin_line": 208,
      "end_line": 211,
      "comment": "\n     * Modify the numerator degrees of freedom.\n     * @param degreesOfFreedom the new numerator degrees of freedom.\n     * @throws IllegalArgumentException if \u003ccode\u003edegreesOfFreedom\u003c/code\u003e is not\n     *         positive.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.setNumeratorDegreesOfFreedomInternal(double)",
      "begin_line": 219,
      "end_line": 225,
      "comment": "\n     * Modify the numerator degrees of freedom.\n     * @param degreesOfFreedom the new numerator degrees of freedom.\n     * @throws IllegalArgumentException if \u003ccode\u003edegreesOfFreedom\u003c/code\u003e is not\n     *         positive.\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getNumeratorDegreesOfFreedom()",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\n     * Access the numerator degrees of freedom.\n     * @return the numerator degrees of freedom.\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.setDenominatorDegreesOfFreedom(double)",
      "begin_line": 242,
      "end_line": 245,
      "comment": "\n     * Modify the denominator degrees of freedom.\n     * @param degreesOfFreedom the new denominator degrees of freedom.\n     * @throws IllegalArgumentException if \u003ccode\u003edegreesOfFreedom\u003c/code\u003e is not\n     *         positive.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.setDenominatorDegreesOfFreedomInternal(double)",
      "begin_line": 253,
      "end_line": 259,
      "comment": "\n     * Modify the denominator degrees of freedom.\n     * @param degreesOfFreedom the new denominator degrees of freedom.\n     * @throws IllegalArgumentException if \u003ccode\u003edegreesOfFreedom\u003c/code\u003e is not\n     *         positive.\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 258,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getDenominatorDegreesOfFreedom()",
      "begin_line": 265,
      "end_line": 267,
      "comment": "\n     * Access the denominator degrees of freedom.\n     * @return the denominator degrees of freedom.\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 276,
      "end_line": 279,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 38)"
      ]
    }
  ]
}