{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/distribution/NormalDistributionImpl.java",
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
      "begin_line": 33,
      "end_line": 297,
      "comment": "\n * Default implementation of\n * {@link org.apache.commons.math.distribution.NormalDistribution}.\n *\n * @version $Revision$ $Date$\n "
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
        "SQRT2PI"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " \u0026sqrt;(2 \u0026pi;) "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The mean of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "standardDeviation"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " The standard deviation of this distribution. "
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
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.NormalDistributionImpl(double, double)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Create a normal distribution using the given mean and standard deviation.\n     * @param mean mean for this distribution\n     * @param sd standard deviation for this distribution\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.NormalDistributionImpl(double, double, double)",
      "begin_line": 75,
      "end_line": 80,
      "comment": "\n     * Create a normal distribution using the given mean, standard deviation and\n     * inverse cumulative distribution accuracy.\n     *\n     * @param mean mean for this distribution\n     * @param sd standard deviation for this distribution\n     * @param inverseCumAccuracy inverse cumulative probability accuracy\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 16)",
        "(line 77,col 9)-(line 77,col 30)",
        "(line 78,col 9)-(line 78,col 41)",
        "(line 79,col 9)-(line 79,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.NormalDistributionImpl()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Creates normal distribution with the mean equal to zero and standard\n     * deviation equal to one.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getMean()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Access the mean.\n     * @return mean for this distribution\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.setMean(double)",
      "begin_line": 103,
      "end_line": 106,
      "comment": "\n     * Modify the mean.\n     * @param mean for this distribution\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.setMeanInternal(double)",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Modify the mean.\n     * @param newMean for this distribution\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getStandardDeviation()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * Access the standard deviation.\n     * @return standard deviation for this distribution\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.setStandardDeviation(double)",
      "begin_line": 129,
      "end_line": 132,
      "comment": "\n     * Modify the standard deviation.\n     * @param sd standard deviation for this distribution\n     * @throws IllegalArgumentException if \u003ccode\u003esd\u003c/code\u003e is not positive.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.setStandardDeviationInternal(double)",
      "begin_line": 138,
      "end_line": 145,
      "comment": "\n     * Modify the standard deviation.\n     * @param sd standard deviation for this distribution\n     * @throws IllegalArgumentException if \u003ccode\u003esd\u003c/code\u003e is not positive.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.density(java.lang.Double)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Return the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     * @deprecated\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.density(double)",
      "begin_line": 165,
      "end_line": 168,
      "comment": "\n     * Returns the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 29)",
        "(line 167,col 9)-(line 167,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.cumulativeProbability(double)",
      "begin_line": 178,
      "end_line": 191,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026lt; \u003ccode\u003ex\u003c/code\u003e).\n     * @param x the value at which the CDF is evaluated.\n     * @return CDF evaluted at \u003ccode\u003ex\u003c/code\u003e.\n     * @throws MathException if the algorithm fails to converge; unless\n     * x is more than 20 standard deviations from the mean, in which case the\n     * convergence exception is caught and 0 or 1 is returned.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 190,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 200,
      "end_line": 203,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 219,
      "end_line": 229,
      "comment": "\n     * For this distribution, X, this method returns the critical point x, such\n     * that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e for p\u003d0 and\n     * \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e for p\u003d1.\u003c/p\u003e\n     *\n     * @param p the desired probability\n     * @return x, such that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e\n     * @throws MathException if the inverse cumulative probability can not be\n     *         computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *         probability.\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 240,
      "end_line": 251,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 19)",
        "(line 244,col 9)-(line 248,col 9)",
        "(line 250,col 9)-(line 250,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 262,
      "end_line": 273,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 19)",
        "(line 266,col 9)-(line 270,col 9)",
        "(line 272,col 9)-(line 272,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getInitialDomain(double)",
      "begin_line": 283,
      "end_line": 296,
      "comment": "\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return initial domain value\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 19)",
        "(line 287,col 9)-(line 293,col 9)",
        "(line 295,col 9)-(line 295,col 19)"
      ]
    }
  ]
}