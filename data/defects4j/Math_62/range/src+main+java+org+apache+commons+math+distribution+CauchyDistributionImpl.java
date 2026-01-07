{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/distribution/CauchyDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CauchyDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractContinuousDistribution",
        "org.apache.commons.math.distribution.CauchyDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 270,
      "comment": "\n * Default implementation of\n * {@link org.apache.commons.math.distribution.CauchyDistribution}.\n *\n * @since 1.1\n * @version $Revision$ $Date$\n "
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
        "median"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The median of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The scale of this distribution. "
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
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.CauchyDistributionImpl()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Creates cauchy distribution with the medain equal to zero and scale\n     * equal to one.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.CauchyDistributionImpl(double, double)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Create a cauchy distribution using the given median and scale.\n     * @param median median for this distribution\n     * @param s scale parameter for this distribution\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.CauchyDistributionImpl(double, double, double)",
      "begin_line": 79,
      "end_line": 84,
      "comment": "\n     * Create a cauchy distribution using the given median and scale.\n     * @param median median for this distribution\n     * @param s scale parameter for this distribution\n     * @param inverseCumAccuracy the maximum absolute error in inverse cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY})\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 16)",
        "(line 81,col 9)-(line 81,col 34)",
        "(line 82,col 9)-(line 82,col 28)",
        "(line 83,col 9)-(line 83,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.cumulativeProbability(double)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026lt; \u003ccode\u003ex\u003c/code\u003e).\n     * @param x the value at which the CDF is evaluated.\n     * @return CDF evaluted at \u003ccode\u003ex\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.getMedian()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Access the median.\n     * @return median for this distribution\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.getScale()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Access the scale parameter.\n     * @return scale parameter for this distribution\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.density(double)",
      "begin_line": 118,
      "end_line": 122,
      "comment": "\n     * Returns the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 38)",
        "(line 121,col 9)-(line 121,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 136,
      "end_line": 150,
      "comment": "\n     * For this distribution, X, this method returns the critical point x, such\n     * that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e for p\u003d0 and\n     * \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e for p\u003d1.\u003c/p\u003e\n     *\n     * @param p the desired probability\n     * @return x, such that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *         probability.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 19)",
        "(line 139,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.setMedian(double)",
      "begin_line": 157,
      "end_line": 160,
      "comment": "\n     * Modify the median.\n     * @param median for this distribution\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.setMedianInternal(double)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Modify the median.\n     * @param newMedian for this distribution\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.setScale(double)",
      "begin_line": 175,
      "end_line": 178,
      "comment": "\n     * Modify the scale parameter.\n     * @param s scale parameter for this distribution\n     * @throws IllegalArgumentException if \u003ccode\u003esd\u003c/code\u003e is not positive.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.setScaleInternal(double)",
      "begin_line": 184,
      "end_line": 190,
      "comment": "\n     * Modify the scale parameter.\n     * @param s scale parameter for this distribution\n     * @throws IllegalArgumentException if \u003ccode\u003esd\u003c/code\u003e is not positive.\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 201,
      "end_line": 212,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 19)",
        "(line 205,col 9)-(line 209,col 9)",
        "(line 211,col 9)-(line 211,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 223,
      "end_line": 234,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 19)",
        "(line 227,col 9)-(line 231,col 9)",
        "(line 233,col 9)-(line 233,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.getInitialDomain(double)",
      "begin_line": 244,
      "end_line": 257,
      "comment": "\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return initial domain value\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 19)",
        "(line 248,col 9)-(line 254,col 9)",
        "(line 256,col 9)-(line 256,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 266,
      "end_line": 269,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 38)"
      ]
    }
  ]
}