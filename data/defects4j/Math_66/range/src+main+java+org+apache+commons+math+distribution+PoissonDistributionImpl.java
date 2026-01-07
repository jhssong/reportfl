{
  "filepath": "/tmp/Math-66b/src/main/java/org/apache/commons/math/distribution/PoissonDistributionImpl.java",
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
      "begin_line": 32,
      "end_line": 302,
      "comment": "\n * Implementation for the {@link PoissonDistribution}.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAX_ITERATIONS"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Default maximum number of iterations for cumulative probability calculations.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EPSILON"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Default convergence criterion.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "normal"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Distribution used to compute normal approximation. "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Holds the Poisson mean for the distribution.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * Maximum number of iterations for cumulative probability.\n     *\n     * Cumulative probabilities are estimated using either Lanczos series approximation of\n     * Gamma#regularizedGammaP or continued fraction approximation of Gamma#regularizedGammaQ.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * Convergence criterion for cumulative probability.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.PoissonDistributionImpl(double)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Create a new Poisson distribution with the given the mean. The mean value\n     * must be positive; otherwise an \u003ccode\u003eIllegalArgument\u003c/code\u003e is thrown.\n     *\n     * @param p the Poisson mean\n     * @throws IllegalArgumentException if p \u0026le; 0\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.PoissonDistributionImpl(double, double, int)",
      "begin_line": 91,
      "end_line": 95,
      "comment": "\n     * Create a new Poisson distribution with the given mean, convergence criterion\n     * and maximum number of iterations.\n     *\n     * @param p the Poisson mean\n     * @param epsilon the convergence criteria for cumulative probabilites\n     * @param maxIterations the maximum number of iterations for cumulative probabilites\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 19)",
        "(line 93,col 9)-(line 93,col 31)",
        "(line 94,col 9)-(line 94,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.PoissonDistributionImpl(double, double)",
      "begin_line": 104,
      "end_line": 107,
      "comment": "\n     * Create a new Poisson distribution with the given mean and convergence criterion.\n     *\n     * @param p the Poisson mean\n     * @param epsilon the convergence criteria for cumulative probabilites\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 19)",
        "(line 106,col 9)-(line 106,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.PoissonDistributionImpl(double, int)",
      "begin_line": 116,
      "end_line": 119,
      "comment": "\n     * Create a new Poisson distribution with the given mean and maximum number of iterations.\n     *\n     * @param p the Poisson mean\n     * @param maxIterations the maximum number of iterations for cumulative probabilites\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 19)",
        "(line 118,col 9)-(line 118,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.PoissonDistributionImpl(double, org.apache.commons.math.distribution.NormalDistribution)",
      "begin_line": 133,
      "end_line": 137,
      "comment": "\n     * Create a new Poisson distribution with the given the mean. The mean value\n     * must be positive; otherwise an \u003ccode\u003eIllegalArgument\u003c/code\u003e is thrown.\n     *\n     * @param p the Poisson mean\n     * @param z a normal distribution used to compute normal approximations.\n     * @throws IllegalArgumentException if p \u0026le; 0\n     * @since 1.2\n     * @deprecated as of 2.1 (to avoid possibly inconsistent state, the\n     * \"NormalDistribution\" will be instantiated internally)\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 16)",
        "(line 136,col 9)-(line 136,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.getMean()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * Get the Poisson mean for the distribution.\n     *\n     * @return the Poisson mean for the distribution.\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.setMean(double)",
      "begin_line": 156,
      "end_line": 159,
      "comment": "\n     * Set the Poisson mean for the distribution. The mean value must be\n     * positive; otherwise an \u003ccode\u003eIllegalArgument\u003c/code\u003e is thrown.\n     *\n     * @param p the Poisson mean value\n     * @throws IllegalArgumentException if p \u0026le; 0\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.setNormalAndMeanInternal(org.apache.commons.math.distribution.NormalDistribution, double)",
      "begin_line": 168,
      "end_line": 178,
      "comment": "\n     * Set the Poisson mean for the distribution. The mean value must be\n     * positive; otherwise an \u003ccode\u003eIllegalArgument\u003c/code\u003e is thrown.\n     *\n     * @param z the new distribution\n     * @param p the Poisson mean value\n     * @throws IllegalArgumentException if p \u0026le; 0\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 17)",
        "(line 175,col 9)-(line 175,col 19)",
        "(line 176,col 9)-(line 176,col 26)",
        "(line 177,col 9)-(line 177,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.probability(int)",
      "begin_line": 187,
      "end_line": 199,
      "comment": "\n     * The probability mass function P(X \u003d x) for a Poisson distribution.\n     *\n     * @param x the value at which the probability density function is\n     *            evaluated.\n     * @return the value of the probability mass function at x\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 19)",
        "(line 189,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.cumulativeProbability(int)",
      "begin_line": 210,
      "end_line": 219,
      "comment": "\n     * The probability distribution function P(X \u003c\u003d x) for a Poisson\n     * distribution.\n     *\n     * @param x the value at which the PDF is evaluated.\n     * @return Poisson distribution function evaluated at x\n     * @throws MathException if the cumulative probability can not be computed\n     *             due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.normalApproximateProbability(int)",
      "begin_line": 236,
      "end_line": 239,
      "comment": "\n     * Calculates the Poisson distribution function using a normal\n     * approximation. The \u003ccode\u003eN(mean, sqrt(mean))\u003c/code\u003e distribution is used\n     * to approximate the Poisson distribution.\n     * \u003cp\u003e\n     * The computation uses \"half-correction\" -- evaluating the normal\n     * distribution function at \u003ccode\u003ex + 0.5\u003c/code\u003e\n     * \u003c/p\u003e\n     *\n     * @param x the upper bound, inclusive\n     * @return the distribution function value calculated using a normal\n     *         approximation\n     * @throws MathException if an error occurs computing the normal\n     *             approximation\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.sample()",
      "begin_line": 258,
      "end_line": 261,
      "comment": "\n     * Generates a random value sampled from this distribution.\n     *\n     * \u003cp\u003e\u003cstrong\u003eAlgorithm Description\u003c/strong\u003e:\n     * \u003cul\u003e\u003cli\u003e For small means, uses simulation of a Poisson process\n     * using Uniform deviates, as described\n     * \u003ca href\u003d\"http://irmi.epfl.ch/cmos/Pmmi/interactive/rng7.htm\"\u003e here.\u003c/a\u003e\n     * The Poisson process (and hence value returned) is bounded by 1000 * mean.\u003c/li\u003e\u003c\n     *\n     * \u003cli\u003e For large means, uses the rejection algorithm described in \u003cbr/\u003e\n     * Devroye, Luc. (1981).\u003ci\u003eThe Computer Generation of Poisson Random Variables\u003c/i\u003e\n     * \u003cstrong\u003eComputing\u003c/strong\u003e vol. 26 pp. 197-207.\u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @return random value\n     * @since 2.2\n     * @throws MathException if an error occurs generating the random value\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 271,
      "end_line": 274,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root. This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain lower bound\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 284,
      "end_line": 287,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root. This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain upper bound\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.setNormal(org.apache.commons.math.distribution.NormalDistribution)",
      "begin_line": 298,
      "end_line": 301,
      "comment": "\n     * Modify the normal distribution used to compute normal approximations. The\n     * caller is responsible for insuring the normal distribution has the proper\n     * parameter settings.\n     *\n     * @param value the new distribution\n     * @since 1.2\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 46)"
      ]
    }
  ]
}