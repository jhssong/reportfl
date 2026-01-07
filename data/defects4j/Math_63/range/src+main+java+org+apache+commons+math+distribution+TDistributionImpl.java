{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/distribution/TDistributionImpl.java",
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
      "begin_line": 34,
      "end_line": 226,
      "comment": "\n * Default implementation of\n * {@link org.apache.commons.math.distribution.TDistribution}.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Default inverse cumulative probability accuracy\n     * @since 2.1\n    "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "degreesOfFreedom"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " The degrees of freedom"
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Inverse cumulative probability accuracy "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.TDistributionImpl(double, double)",
      "begin_line": 62,
      "end_line": 66,
      "comment": "\n     * Create a t distribution using the given degrees of freedom and the\n     * specified inverse cumulative probability absolute accuracy.\n     *\n     * @param degreesOfFreedom the degrees of freedom.\n     * @param inverseCumAccuracy the maximum absolute error in inverse cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY})\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 16)",
        "(line 64,col 9)-(line 64,col 54)",
        "(line 65,col 9)-(line 65,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.TDistributionImpl(double)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Create a t distribution using the given degrees of freedom.\n     * @param degreesOfFreedom the degrees of freedom.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.setDegreesOfFreedom(double)",
      "begin_line": 81,
      "end_line": 84,
      "comment": "\n     * Modify the degrees of freedom.\n     * @param degreesOfFreedom the new degrees of freedom.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.setDegreesOfFreedomInternal(double)",
      "begin_line": 89,
      "end_line": 96,
      "comment": "\n     * Modify the degrees of freedom.\n     * @param newDegreesOfFreedom the new degrees of freedom.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.getDegreesOfFreedom()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Access the degrees of freedom.\n     * @return the degrees of freedom.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.density(double)",
      "begin_line": 113,
      "end_line": 119,
      "comment": "\n     * Returns the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 42)",
        "(line 116,col 9)-(line 116,col 47)",
        "(line 117,col 9)-(line 118,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.cumulativeProbability(double)",
      "begin_line": 128,
      "end_line": 146,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026lt; \u003ccode\u003ex\u003c/code\u003e).\n     * @param x the value at which the CDF is evaluated.\n     * @return CDF evaluated at \u003ccode\u003ex\u003c/code\u003e.\n     * @throws MathException if the cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 19)",
        "(line 130,col 9)-(line 143,col 9)",
        "(line 145,col 9)-(line 145,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 162,
      "end_line": 172,
      "comment": "\n     * For this distribution, X, this method returns the critical point x, such\n     * that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e for p\u003d0 and\n     * \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e for p\u003d1.\u003c/p\u003e\n     *\n     * @param p the desired probability\n     * @return x, such that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e\n     * @throws MathException if the inverse cumulative probability can not be\n     *         computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *         probability.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 183,
      "end_line": 186,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 197,
      "end_line": 200,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.getInitialDomain(double)",
      "begin_line": 210,
      "end_line": 213,
      "comment": "\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return initial domain value\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 222,
      "end_line": 225,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 38)"
      ]
    }
  ]
}