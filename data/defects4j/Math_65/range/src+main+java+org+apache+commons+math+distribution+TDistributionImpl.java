{
  "filepath": "/tmp/Math-65b/src/main/java/org/apache/commons/math/distribution/TDistributionImpl.java",
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
      "begin_line": 33,
      "end_line": 225,
      "comment": "\n * Default implementation of\n * {@link org.apache.commons.math.distribution.TDistribution}.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Default inverse cumulative probability accuracy\n     * @since 2.1\n    "
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
        "degreesOfFreedom"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " The degrees of freedom"
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Inverse cumulative probability accuracy "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.TDistributionImpl(double, double)",
      "begin_line": 61,
      "end_line": 65,
      "comment": "\n     * Create a t distribution using the given degrees of freedom and the\n     * specified inverse cumulative probability absolute accuracy.\n     *\n     * @param degreesOfFreedom the degrees of freedom.\n     * @param inverseCumAccuracy the maximum absolute error in inverse cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY})\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 16)",
        "(line 63,col 9)-(line 63,col 54)",
        "(line 64,col 9)-(line 64,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.TDistributionImpl(double)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Create a t distribution using the given degrees of freedom.\n     * @param degreesOfFreedom the degrees of freedom.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.setDegreesOfFreedom(double)",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\n     * Modify the degrees of freedom.\n     * @param degreesOfFreedom the new degrees of freedom.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.setDegreesOfFreedomInternal(double)",
      "begin_line": 88,
      "end_line": 95,
      "comment": "\n     * Modify the degrees of freedom.\n     * @param newDegreesOfFreedom the new degrees of freedom.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.getDegreesOfFreedom()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Access the degrees of freedom.\n     * @return the degrees of freedom.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.density(double)",
      "begin_line": 112,
      "end_line": 118,
      "comment": "\n     * Returns the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 42)",
        "(line 115,col 9)-(line 115,col 47)",
        "(line 116,col 9)-(line 117,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.cumulativeProbability(double)",
      "begin_line": 127,
      "end_line": 145,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026lt; \u003ccode\u003ex\u003c/code\u003e).\n     * @param x the value at which the CDF is evaluated.\n     * @return CDF evaluated at \u003ccode\u003ex\u003c/code\u003e.\n     * @throws MathException if the cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 19)",
        "(line 129,col 9)-(line 142,col 9)",
        "(line 144,col 9)-(line 144,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 161,
      "end_line": 171,
      "comment": "\n     * For this distribution, X, this method returns the critical point x, such\n     * that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e for p\u003d0 and\n     * \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e for p\u003d1.\u003c/p\u003e\n     *\n     * @param p the desired probability\n     * @return x, such that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e\n     * @throws MathException if the inverse cumulative probability can not be\n     *         computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *         probability.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 182,
      "end_line": 185,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 196,
      "end_line": 199,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.getInitialDomain(double)",
      "begin_line": 209,
      "end_line": 212,
      "comment": "\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return initial domain value\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 221,
      "end_line": 224,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 38)"
      ]
    }
  ]
}