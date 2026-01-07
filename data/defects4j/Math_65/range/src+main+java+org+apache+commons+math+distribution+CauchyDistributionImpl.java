{
  "filepath": "/tmp/Math-65b/src/main/java/org/apache/commons/math/distribution/CauchyDistributionImpl.java",
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
      "begin_line": 32,
      "end_line": 269,
      "comment": "\n * Default implementation of\n * {@link org.apache.commons.math.distribution.CauchyDistribution}.\n *\n * @since 1.1\n * @version $Revision$ $Date$\n "
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
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "median"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The median of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " The scale of this distribution. "
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
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.CauchyDistributionImpl()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Creates cauchy distribution with the medain equal to zero and scale\n     * equal to one.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.CauchyDistributionImpl(double, double)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Create a cauchy distribution using the given median and scale.\n     * @param median median for this distribution\n     * @param s scale parameter for this distribution\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.CauchyDistributionImpl(double, double, double)",
      "begin_line": 78,
      "end_line": 83,
      "comment": "\n     * Create a cauchy distribution using the given median and scale.\n     * @param median median for this distribution\n     * @param s scale parameter for this distribution\n     * @param inverseCumAccuracy the maximum absolute error in inverse cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY})\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 16)",
        "(line 80,col 9)-(line 80,col 34)",
        "(line 81,col 9)-(line 81,col 28)",
        "(line 82,col 9)-(line 82,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.cumulativeProbability(double)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026lt; \u003ccode\u003ex\u003c/code\u003e).\n     * @param x the value at which the CDF is evaluated.\n     * @return CDF evaluted at \u003ccode\u003ex\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.getMedian()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Access the median.\n     * @return median for this distribution\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.getScale()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * Access the scale parameter.\n     * @return scale parameter for this distribution\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.density(double)",
      "begin_line": 117,
      "end_line": 121,
      "comment": "\n     * Returns the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 38)",
        "(line 120,col 9)-(line 120,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 135,
      "end_line": 149,
      "comment": "\n     * For this distribution, X, this method returns the critical point x, such\n     * that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e for p\u003d0 and\n     * \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e for p\u003d1.\u003c/p\u003e\n     *\n     * @param p the desired probability\n     * @return x, such that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *         probability.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 19)",
        "(line 138,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.setMedian(double)",
      "begin_line": 156,
      "end_line": 159,
      "comment": "\n     * Modify the median.\n     * @param median for this distribution\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.setMedianInternal(double)",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * Modify the median.\n     * @param newMedian for this distribution\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.setScale(double)",
      "begin_line": 174,
      "end_line": 177,
      "comment": "\n     * Modify the scale parameter.\n     * @param s scale parameter for this distribution\n     * @throws IllegalArgumentException if \u003ccode\u003esd\u003c/code\u003e is not positive.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.setScaleInternal(double)",
      "begin_line": 183,
      "end_line": 189,
      "comment": "\n     * Modify the scale parameter.\n     * @param s scale parameter for this distribution\n     * @throws IllegalArgumentException if \u003ccode\u003esd\u003c/code\u003e is not positive.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 200,
      "end_line": 211,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 19)",
        "(line 204,col 9)-(line 208,col 9)",
        "(line 210,col 9)-(line 210,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 222,
      "end_line": 233,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 19)",
        "(line 226,col 9)-(line 230,col 9)",
        "(line 232,col 9)-(line 232,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.getInitialDomain(double)",
      "begin_line": 243,
      "end_line": 256,
      "comment": "\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return initial domain value\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 19)",
        "(line 247,col 9)-(line 253,col 9)",
        "(line 255,col 9)-(line 255,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 265,
      "end_line": 268,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 38)"
      ]
    }
  ]
}