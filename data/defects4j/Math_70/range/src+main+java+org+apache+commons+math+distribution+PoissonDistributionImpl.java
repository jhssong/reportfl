{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/distribution/PoissonDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PoissonDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractIntegerDistribution",
        "org.apache.commons.math.distribution.PoissonDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 279,
      "comment": "\n * Implementation for the {@link PoissonDistribution}.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAX_ITERATIONS"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Default maximum number of iterations for cumulative probability calculations.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EPSILON"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Default convergence criterion.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "normal"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Distribution used to compute normal approximation. "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * Holds the Poisson mean for the distribution.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * Maximum number of iterations for cumulative probability.\n     *\n     * Cumulative probabilities are estimated using either Lanczos series approximation of\n     * Gamma#regularizedGammaP or continued fraction approximation of Gamma#regularizedGammaQ.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * Convergence criterion for cumulative probability.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.PoissonDistributionImpl(double)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Create a new Poisson distribution with the given the mean. The mean value\n     * must be positive; otherwise an \u003ccode\u003eIllegalArgument\u003c/code\u003e is thrown.\n     *\n     * @param p the Poisson mean\n     * @throws IllegalArgumentException if p \u0026le; 0\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.PoissonDistributionImpl(double, double, int)",
      "begin_line": 90,
      "end_line": 94,
      "comment": "\n     * Create a new Poisson distribution with the given mean, convergence criterion\n     * and maximum number of iterations.\n     *\n     * @param p the Poisson mean\n     * @param epsilon the convergence criteria for cumulative probabilites\n     * @param maxIterations the maximum number of iterations for cumulative probabilites\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 19)",
        "(line 92,col 9)-(line 92,col 31)",
        "(line 93,col 9)-(line 93,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.PoissonDistributionImpl(double, double)",
      "begin_line": 103,
      "end_line": 106,
      "comment": "\n     * Create a new Poisson distribution with the given mean and convergence criterion.\n     *\n     * @param p the Poisson mean\n     * @param epsilon the convergence criteria for cumulative probabilites\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 19)",
        "(line 105,col 9)-(line 105,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.PoissonDistributionImpl(double, int)",
      "begin_line": 115,
      "end_line": 118,
      "comment": "\n     * Create a new Poisson distribution with the given mean and maximum number of iterations.\n     *\n     * @param p the Poisson mean\n     * @param maxIterations the maximum number of iterations for cumulative probabilites\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 19)",
        "(line 117,col 9)-(line 117,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.PoissonDistributionImpl(double, org.apache.commons.math.distribution.NormalDistribution)",
      "begin_line": 132,
      "end_line": 136,
      "comment": "\n     * Create a new Poisson distribution with the given the mean. The mean value\n     * must be positive; otherwise an \u003ccode\u003eIllegalArgument\u003c/code\u003e is thrown.\n     *\n     * @param p the Poisson mean\n     * @param z a normal distribution used to compute normal approximations.\n     * @throws IllegalArgumentException if p \u0026le; 0\n     * @since 1.2\n     * @deprecated as of 2.1 (to avoid possibly inconsistent state, the\n     * \"NormalDistribution\" will be instantiated internally)\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 16)",
        "(line 135,col 9)-(line 135,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.getMean()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * Get the Poisson mean for the distribution.\n     *\n     * @return the Poisson mean for the distribution.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.setMean(double)",
      "begin_line": 155,
      "end_line": 158,
      "comment": "\n     * Set the Poisson mean for the distribution. The mean value must be\n     * positive; otherwise an \u003ccode\u003eIllegalArgument\u003c/code\u003e is thrown.\n     *\n     * @param p the Poisson mean value\n     * @throws IllegalArgumentException if p \u0026le; 0\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.setNormalAndMeanInternal(org.apache.commons.math.distribution.NormalDistribution, double)",
      "begin_line": 167,
      "end_line": 177,
      "comment": "\n     * Set the Poisson mean for the distribution. The mean value must be\n     * positive; otherwise an \u003ccode\u003eIllegalArgument\u003c/code\u003e is thrown.\n     *\n     * @param z the new distribution\n     * @param p the Poisson mean value\n     * @throws IllegalArgumentException if p \u0026le; 0\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 17)",
        "(line 174,col 9)-(line 174,col 19)",
        "(line 175,col 9)-(line 175,col 26)",
        "(line 176,col 9)-(line 176,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.probability(int)",
      "begin_line": 186,
      "end_line": 198,
      "comment": "\n     * The probability mass function P(X \u003d x) for a Poisson distribution.\n     *\n     * @param x the value at which the probability density function is\n     *            evaluated.\n     * @return the value of the probability mass function at x\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 19)",
        "(line 188,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.cumulativeProbability(int)",
      "begin_line": 209,
      "end_line": 218,
      "comment": "\n     * The probability distribution function P(X \u003c\u003d x) for a Poisson\n     * distribution.\n     *\n     * @param x the value at which the PDF is evaluated.\n     * @return Poisson distribution function evaluated at x\n     * @throws MathException if the cumulative probability can not be computed\n     *             due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 217,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.normalApproximateProbability(int)",
      "begin_line": 235,
      "end_line": 238,
      "comment": "\n     * Calculates the Poisson distribution function using a normal\n     * approximation. The \u003ccode\u003eN(mean, sqrt(mean))\u003c/code\u003e distribution is used\n     * to approximate the Poisson distribution.\n     * \u003cp\u003e\n     * The computation uses \"half-correction\" -- evaluating the normal\n     * distribution function at \u003ccode\u003ex + 0.5\u003c/code\u003e\n     * \u003c/p\u003e\n     *\n     * @param x the upper bound, inclusive\n     * @return the distribution function value calculated using a normal\n     *         approximation\n     * @throws MathException if an error occurs computing the normal\n     *             approximation\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 248,
      "end_line": 251,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root. This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain lower bound\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 261,
      "end_line": 264,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root. This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain upper bound\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.setNormal(org.apache.commons.math.distribution.NormalDistribution)",
      "begin_line": 275,
      "end_line": 278,
      "comment": "\n     * Modify the normal distribution used to compute normal approximations. The\n     * caller is responsible for insuring the normal distribution has the proper\n     * parameter settings.\n     *\n     * @param value the new distribution\n     * @since 1.2\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 46)"
      ]
    }
  ]
}