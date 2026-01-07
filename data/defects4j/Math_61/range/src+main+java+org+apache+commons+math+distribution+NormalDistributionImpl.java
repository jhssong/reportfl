{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/distribution/NormalDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NormalDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractContinuousDistribution",
        "org.apache.commons.math.distribution.NormalDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 35,
      "end_line": 311,
      "comment": "\n * Default implementation of\n * {@link org.apache.commons.math.distribution.NormalDistribution}.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Default inverse cumulative probability accuracy\n     * @since 2.1\n     "
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
        "SQRT2PI"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " \u0026sqrt;(2 \u0026pi;) "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " The mean of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "standardDeviation"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " The standard deviation of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Inverse cumulative probability accuracy "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.NormalDistributionImpl(double, double)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Create a normal distribution using the given mean and standard deviation.\n     * @param mean mean for this distribution\n     * @param sd standard deviation for this distribution\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.NormalDistributionImpl(double, double, double)",
      "begin_line": 77,
      "end_line": 82,
      "comment": "\n     * Create a normal distribution using the given mean, standard deviation and\n     * inverse cumulative distribution accuracy.\n     *\n     * @param mean mean for this distribution\n     * @param sd standard deviation for this distribution\n     * @param inverseCumAccuracy inverse cumulative probability accuracy\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 16)",
        "(line 79,col 9)-(line 79,col 30)",
        "(line 80,col 9)-(line 80,col 41)",
        "(line 81,col 9)-(line 81,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.NormalDistributionImpl()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Creates normal distribution with the mean equal to zero and standard\n     * deviation equal to one.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getMean()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Access the mean.\n     * @return mean for this distribution\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.setMean(double)",
      "begin_line": 105,
      "end_line": 108,
      "comment": "\n     * Modify the mean.\n     * @param mean for this distribution\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.setMeanInternal(double)",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Modify the mean.\n     * @param newMean for this distribution\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getStandardDeviation()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Access the standard deviation.\n     * @return standard deviation for this distribution\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.setStandardDeviation(double)",
      "begin_line": 131,
      "end_line": 134,
      "comment": "\n     * Modify the standard deviation.\n     * @param sd standard deviation for this distribution\n     * @throws IllegalArgumentException if \u003ccode\u003esd\u003c/code\u003e is not positive.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.setStandardDeviationInternal(double)",
      "begin_line": 140,
      "end_line": 147,
      "comment": "\n     * Modify the standard deviation.\n     * @param sd standard deviation for this distribution\n     * @throws IllegalArgumentException if \u003ccode\u003esd\u003c/code\u003e is not positive.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.density(java.lang.Double)",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * Return the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     * @deprecated\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.density(double)",
      "begin_line": 167,
      "end_line": 170,
      "comment": "\n     * Returns the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 29)",
        "(line 169,col 9)-(line 169,col 116)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.cumulativeProbability(double)",
      "begin_line": 180,
      "end_line": 193,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026lt; \u003ccode\u003ex\u003c/code\u003e).\n     * @param x the value at which the CDF is evaluated.\n     * @return CDF evaluted at \u003ccode\u003ex\u003c/code\u003e.\n     * @throws MathException if the algorithm fails to converge; unless\n     * x is more than 20 standard deviations from the mean, in which case the\n     * convergence exception is caught and 0 or 1 is returned.\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 192,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 202,
      "end_line": 205,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 221,
      "end_line": 231,
      "comment": "\n     * For this distribution, X, this method returns the critical point x, such\n     * that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e for p\u003d0 and\n     * \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e for p\u003d1.\u003c/p\u003e\n     *\n     * @param p the desired probability\n     * @return x, such that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e\n     * @throws MathException if the inverse cumulative probability can not be\n     *         computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *         probability.\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 230,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.sample()",
      "begin_line": 240,
      "end_line": 243,
      "comment": "\n     * Generates a random value sampled from this distribution.\n     *\n     * @return random value\n     * @since 2.2\n     * @throws MathException if an error occurs generating the random value\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 254,
      "end_line": 265,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 19)",
        "(line 258,col 9)-(line 262,col 9)",
        "(line 264,col 9)-(line 264,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 276,
      "end_line": 287,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 19)",
        "(line 280,col 9)-(line 284,col 9)",
        "(line 286,col 9)-(line 286,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getInitialDomain(double)",
      "begin_line": 297,
      "end_line": 310,
      "comment": "\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return initial domain value\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 19)",
        "(line 301,col 9)-(line 307,col 9)",
        "(line 309,col 9)-(line 309,col 19)"
      ]
    }
  ]
}