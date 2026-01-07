{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/distribution/PoissonDistributionImpl.java",
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
      "begin_line": 33,
      "end_line": 241,
      "comment": "\n * Implementation for the {@link PoissonDistribution}.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAX_ITERATIONS"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Default maximum number of iterations for cumulative probability calculations.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EPSILON"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * Default convergence criterion.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "normal"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Distribution used to compute normal approximation. "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Holds the Poisson mean for the distribution.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * Maximum number of iterations for cumulative probability.\n     *\n     * Cumulative probabilities are estimated using either Lanczos series approximation of\n     * Gamma#regularizedGammaP or continued fraction approximation of Gamma#regularizedGammaQ.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * Convergence criterion for cumulative probability.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.PoissonDistributionImpl(double)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Create a new Poisson distribution with the given the mean. The mean value\n     * must be positive; otherwise an \u003ccode\u003eIllegalArgument\u003c/code\u003e is thrown.\n     *\n     * @param p the Poisson mean\n     * @throws IllegalArgumentException if p \u0026le; 0\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.PoissonDistributionImpl(double, double, int)",
      "begin_line": 92,
      "end_line": 100,
      "comment": "\n     * Create a new Poisson distribution with the given mean, convergence criterion\n     * and maximum number of iterations.\n     *\n     * @param p the Poisson mean\n     * @param epsilon the convergence criteria for cumulative probabilites\n     * @param maxIterations the maximum number of iterations for cumulative probabilites\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 17)",
        "(line 97,col 9)-(line 97,col 65)",
        "(line 98,col 9)-(line 98,col 31)",
        "(line 99,col 9)-(line 99,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.PoissonDistributionImpl(double, double)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Create a new Poisson distribution with the given mean and convergence criterion.\n     *\n     * @param p the Poisson mean\n     * @param epsilon the convergence criteria for cumulative probabilites\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.PoissonDistributionImpl(double, int)",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * Create a new Poisson distribution with the given mean and maximum number of iterations.\n     *\n     * @param p the Poisson mean\n     * @param maxIterations the maximum number of iterations for cumulative probabilites\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.getMean()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Get the Poisson mean for the distribution.\n     *\n     * @return the Poisson mean for the distribution.\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.probability(int)",
      "begin_line": 140,
      "end_line": 152,
      "comment": "\n     * The probability mass function P(X \u003d x) for a Poisson distribution.\n     *\n     * @param x the value at which the probability density function is\n     *            evaluated.\n     * @return the value of the probability mass function at x\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 19)",
        "(line 142,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.cumulativeProbability(int)",
      "begin_line": 163,
      "end_line": 172,
      "comment": "\n     * The probability distribution function P(X \u003c\u003d x) for a Poisson\n     * distribution.\n     *\n     * @param x the value at which the PDF is evaluated.\n     * @return Poisson distribution function evaluated at x\n     * @throws MathException if the cumulative probability can not be computed\n     *             due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.normalApproximateProbability(int)",
      "begin_line": 189,
      "end_line": 192,
      "comment": "\n     * Calculates the Poisson distribution function using a normal\n     * approximation. The \u003ccode\u003eN(mean, sqrt(mean))\u003c/code\u003e distribution is used\n     * to approximate the Poisson distribution.\n     * \u003cp\u003e\n     * The computation uses \"half-correction\" -- evaluating the normal\n     * distribution function at \u003ccode\u003ex + 0.5\u003c/code\u003e\n     * \u003c/p\u003e\n     *\n     * @param x the upper bound, inclusive\n     * @return the distribution function value calculated using a normal\n     *         approximation\n     * @throws MathException if an error occurs computing the normal\n     *             approximation\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.sample()",
      "begin_line": 211,
      "end_line": 214,
      "comment": "\n     * Generates a random value sampled from this distribution.\n     *\n     * \u003cp\u003e\u003cstrong\u003eAlgorithm Description\u003c/strong\u003e:\n     * \u003cul\u003e\u003cli\u003e For small means, uses simulation of a Poisson process\n     * using Uniform deviates, as described\n     * \u003ca href\u003d\"http://irmi.epfl.ch/cmos/Pmmi/interactive/rng7.htm\"\u003e here.\u003c/a\u003e\n     * The Poisson process (and hence value returned) is bounded by 1000 * mean.\u003c/li\u003e\u003c\n     *\n     * \u003cli\u003e For large means, uses the rejection algorithm described in \u003cbr/\u003e\n     * Devroye, Luc. (1981).\u003ci\u003eThe Computer Generation of Poisson Random Variables\u003c/i\u003e\n     * \u003cstrong\u003eComputing\u003c/strong\u003e vol. 26 pp. 197-207.\u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @return random value\n     * @since 2.2\n     * @throws MathException if an error occurs generating the random value\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 224,
      "end_line": 227,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root. This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain lower bound\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 237,
      "end_line": 240,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root. This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain upper bound\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 33)"
      ]
    }
  ]
}