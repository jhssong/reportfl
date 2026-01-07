{
  "filepath": "/tmp/Math-67b/src/main/java/org/apache/commons/math/distribution/NormalDistributionImpl.java",
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
      "begin_line": 34,
      "end_line": 310,
      "comment": "\n * Default implementation of\n * {@link org.apache.commons.math.distribution.NormalDistribution}.\n *\n * @version $Revision$ $Date$\n "
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
        "SQRT2PI"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " \u0026sqrt;(2 \u0026pi;) "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " The mean of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "standardDeviation"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " The standard deviation of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Inverse cumulative probability accuracy "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.NormalDistributionImpl(double, double)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Create a normal distribution using the given mean and standard deviation.\n     * @param mean mean for this distribution\n     * @param sd standard deviation for this distribution\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.NormalDistributionImpl(double, double, double)",
      "begin_line": 76,
      "end_line": 81,
      "comment": "\n     * Create a normal distribution using the given mean, standard deviation and\n     * inverse cumulative distribution accuracy.\n     *\n     * @param mean mean for this distribution\n     * @param sd standard deviation for this distribution\n     * @param inverseCumAccuracy inverse cumulative probability accuracy\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 16)",
        "(line 78,col 9)-(line 78,col 30)",
        "(line 79,col 9)-(line 79,col 41)",
        "(line 80,col 9)-(line 80,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.NormalDistributionImpl()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Creates normal distribution with the mean equal to zero and standard\n     * deviation equal to one.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getMean()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Access the mean.\n     * @return mean for this distribution\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.setMean(double)",
      "begin_line": 104,
      "end_line": 107,
      "comment": "\n     * Modify the mean.\n     * @param mean for this distribution\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.setMeanInternal(double)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Modify the mean.\n     * @param newMean for this distribution\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getStandardDeviation()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * Access the standard deviation.\n     * @return standard deviation for this distribution\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.setStandardDeviation(double)",
      "begin_line": 130,
      "end_line": 133,
      "comment": "\n     * Modify the standard deviation.\n     * @param sd standard deviation for this distribution\n     * @throws IllegalArgumentException if \u003ccode\u003esd\u003c/code\u003e is not positive.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.setStandardDeviationInternal(double)",
      "begin_line": 139,
      "end_line": 146,
      "comment": "\n     * Modify the standard deviation.\n     * @param sd standard deviation for this distribution\n     * @throws IllegalArgumentException if \u003ccode\u003esd\u003c/code\u003e is not positive.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.density(java.lang.Double)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * Return the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     * @deprecated\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.density(double)",
      "begin_line": 166,
      "end_line": 169,
      "comment": "\n     * Returns the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 29)",
        "(line 168,col 9)-(line 168,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.cumulativeProbability(double)",
      "begin_line": 179,
      "end_line": 192,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026lt; \u003ccode\u003ex\u003c/code\u003e).\n     * @param x the value at which the CDF is evaluated.\n     * @return CDF evaluted at \u003ccode\u003ex\u003c/code\u003e.\n     * @throws MathException if the algorithm fails to converge; unless\n     * x is more than 20 standard deviations from the mean, in which case the\n     * convergence exception is caught and 0 or 1 is returned.\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 191,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 201,
      "end_line": 204,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 220,
      "end_line": 230,
      "comment": "\n     * For this distribution, X, this method returns the critical point x, such\n     * that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e for p\u003d0 and\n     * \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e for p\u003d1.\u003c/p\u003e\n     *\n     * @param p the desired probability\n     * @return x, such that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e\n     * @throws MathException if the inverse cumulative probability can not be\n     *         computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *         probability.\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 229,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.sample()",
      "begin_line": 239,
      "end_line": 242,
      "comment": "\n     * Generates a random value sampled from this distribution.\n     *\n     * @return random value\n     * @since 2.2\n     * @throws MathException if an error occurs generating the random value\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 253,
      "end_line": 264,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 19)",
        "(line 257,col 9)-(line 261,col 9)",
        "(line 263,col 9)-(line 263,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 275,
      "end_line": 286,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 19)",
        "(line 279,col 9)-(line 283,col 9)",
        "(line 285,col 9)-(line 285,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getInitialDomain(double)",
      "begin_line": 296,
      "end_line": 309,
      "comment": "\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return initial domain value\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 19)",
        "(line 300,col 9)-(line 306,col 9)",
        "(line 308,col 9)-(line 308,col 19)"
      ]
    }
  ]
}