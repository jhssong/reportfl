{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/distribution/TDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractContinuousDistribution",
        "org.apache.commons.math.distribution.TDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 32,
      "end_line": 224,
      "comment": "\n * Default implementation of\n * {@link org.apache.commons.math.distribution.TDistribution}.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Default inverse cumulative probability accuracy\n     * @since 2.1\n    "
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
        "degreesOfFreedom"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The degrees of freedom"
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Inverse cumulative probability accuracy "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.TDistributionImpl(double, double)",
      "begin_line": 60,
      "end_line": 64,
      "comment": "\n     * Create a t distribution using the given degrees of freedom and the\n     * specified inverse cumulative probability absolute accuracy.\n     *\n     * @param degreesOfFreedom the degrees of freedom.\n     * @param inverseCumAccuracy the maximum absolute error in inverse cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY})\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 16)",
        "(line 62,col 9)-(line 62,col 54)",
        "(line 63,col 9)-(line 63,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.TDistributionImpl(double)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Create a t distribution using the given degrees of freedom.\n     * @param degreesOfFreedom the degrees of freedom.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.setDegreesOfFreedom(double)",
      "begin_line": 79,
      "end_line": 82,
      "comment": "\n     * Modify the degrees of freedom.\n     * @param degreesOfFreedom the new degrees of freedom.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.setDegreesOfFreedomInternal(double)",
      "begin_line": 87,
      "end_line": 94,
      "comment": "\n     * Modify the degrees of freedom.\n     * @param newDegreesOfFreedom the new degrees of freedom.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.getDegreesOfFreedom()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Access the degrees of freedom.\n     * @return the degrees of freedom.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.density(double)",
      "begin_line": 111,
      "end_line": 117,
      "comment": "\n     * Returns the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 42)",
        "(line 114,col 9)-(line 114,col 47)",
        "(line 115,col 9)-(line 116,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.cumulativeProbability(double)",
      "begin_line": 126,
      "end_line": 144,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026lt; \u003ccode\u003ex\u003c/code\u003e).\n     * @param x the value at which the CDF is evaluated.\n     * @return CDF evaluted at \u003ccode\u003ex\u003c/code\u003e.\n     * @throws MathException if the cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 19)",
        "(line 128,col 9)-(line 141,col 9)",
        "(line 143,col 9)-(line 143,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 160,
      "end_line": 170,
      "comment": "\n     * For this distribution, X, this method returns the critical point x, such\n     * that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e for p\u003d0 and\n     * \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e for p\u003d1.\u003c/p\u003e\n     *\n     * @param p the desired probability\n     * @return x, such that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e\n     * @throws MathException if the inverse cumulative probability can not be\n     *         computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *         probability.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 181,
      "end_line": 184,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 195,
      "end_line": 198,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.getInitialDomain(double)",
      "begin_line": 208,
      "end_line": 211,
      "comment": "\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return initial domain value\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 220,
      "end_line": 223,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 38)"
      ]
    }
  ]
}