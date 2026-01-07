{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/PoissonDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PoissonDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractIntegerDistribution"
      ],
      "begin_line": 35,
      "end_line": 375,
      "comment": "\n * Implementation of the Poisson distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Poisson_distribution\"\u003ePoisson distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/PoissonDistribution.html\"\u003ePoisson distribution (MathWorld)\u003c/a\u003e\n * @version $Id$\n "
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
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Default convergence criterion.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "normal"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Distribution used to compute normal approximation. "
    },
    {
      "type": "field",
      "varNames": [
        "exponential"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Distribution needed for the {@link #sample()} method. "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Mean of the distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * Maximum number of iterations for cumulative probability. Cumulative\n     * probabilities are estimated using either Lanczos series approximation\n     * of {@link Gamma#regularizedGammaP(double, double, double, int)}\n     * or continued fraction approximation of\n     * {@link Gamma#regularizedGammaQ(double, double, double, int)}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Convergence criterion for cumulative probability. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.PoissonDistribution.PoissonDistribution(double)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Creates a new Poisson distribution with specified mean.\n     *\n     * @param p the Poisson mean\n     * @throws NotStrictlyPositiveException if {@code p \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.PoissonDistribution.PoissonDistribution(double, double, int)",
      "begin_line": 88,
      "end_line": 91,
      "comment": "\n     * Creates a new Poisson distribution with specified mean, convergence\n     * criterion and maximum number of iterations.\n     *\n     * @param p Poisson mean.\n     * @param epsilon Convergence criterion for cumulative probabilities.\n     * @param maxIterations the maximum number of iterations for cumulative\n     * probabilities.\n     * @throws NotStrictlyPositiveException if {@code p \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.PoissonDistribution.PoissonDistribution(org.apache.commons.math3.random.RandomGenerator, double, double, int)",
      "begin_line": 105,
      "end_line": 124,
      "comment": "\n     * Creates a new Poisson distribution with specified mean, convergence\n     * criterion and maximum number of iterations.\n     *\n     * @param rng Random number generator.\n     * @param p Poisson mean.\n     * @param epsilon Convergence criterion for cumulative probabilities.\n     * @param maxIterations the maximum number of iterations for cumulative\n     * probabilities.\n     * @throws NotStrictlyPositiveException if {@code p \u003c\u003d 0}.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 19)",
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 17)",
        "(line 116,col 9)-(line 116,col 31)",
        "(line 117,col 9)-(line 117,col 43)",
        "(line 120,col 9)-(line 121,col 94)",
        "(line 122,col 9)-(line 123,col 109)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.PoissonDistribution.PoissonDistribution(double, double)",
      "begin_line": 135,
      "end_line": 138,
      "comment": "\n     * Creates a new Poisson distribution with the specified mean and\n     * convergence criterion.\n     *\n     * @param p Poisson mean.\n     * @param epsilon Convergence criterion for cumulative probabilities.\n     * @throws NotStrictlyPositiveException if {@code p \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.PoissonDistribution.PoissonDistribution(double, int)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * Creates a new Poisson distribution with the specified mean and maximum\n     * number of iterations.\n     *\n     * @param p Poisson mean.\n     * @param maxIterations Maximum number of iterations for cumulative\n     * probabilities.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.PoissonDistribution.getMean()",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * Get the mean for the distribution.\n     *\n     * @return the mean for the distribution.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.PoissonDistribution.probability(int)",
      "begin_line": 163,
      "end_line": 175,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 19)",
        "(line 165,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.PoissonDistribution.cumulativeProbability(int)",
      "begin_line": 178,
      "end_line": 187,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 179,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 186,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.PoissonDistribution.normalApproximateProbability(int)",
      "begin_line": 200,
      "end_line": 203,
      "comment": "\n     * Calculates the Poisson distribution function using a normal\n     * approximation. The {@code N(mean, sqrt(mean))} distribution is used\n     * to approximate the Poisson distribution. The computation uses\n     * \"half-correction\" (evaluating the normal distribution function at\n     * {@code x + 0.5}).\n     *\n     * @param x Upper bound, inclusive.\n     * @return the distribution function value calculated using a normal\n     * approximation.\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.PoissonDistribution.getNumericalMean()",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For mean parameter {@code p}, the mean is {@code p}.\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.PoissonDistribution.getNumericalVariance()",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For mean parameter {@code p}, the variance is {@code p}.\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.PoissonDistribution.getSupportLowerBound()",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the mean parameter.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.PoissonDistribution.getSupportUpperBound()",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is positive infinity,\n     * regardless of the parameter values. There is no integer infinity,\n     * so this method returns {@code Integer.MAX_VALUE}.\n     *\n     * @return upper bound of the support (always {@code Integer.MAX_VALUE} for\n     * positive infinity)\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.PoissonDistribution.isSupportConnected()",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.PoissonDistribution.sample()",
      "begin_line": 281,
      "end_line": 284,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e:\n     * \u003cul\u003e\n     *  \u003cli\u003eFor small means, uses simulation of a Poisson process\n     *   using Uniform deviates, as described\n     *   \u003ca href\u003d\"http://irmi.epfl.ch/cmos/Pmmi/interactive/rng7.htm\"\u003e here\u003c/a\u003e.\n     *   The Poisson process (and hence value returned) is bounded by 1000 * mean.\n     *  \u003c/li\u003e\n     *  \u003cli\u003eFor large means, uses the rejection algorithm described in\n     *   \u003cquote\u003e\n     *    Devroye, Luc. (1981).\u003ci\u003eThe Computer Generation of Poisson Random Variables\u003c/i\u003e\n     *    \u003cstrong\u003eComputing\u003c/strong\u003e vol. 26 pp. 197-207.\n     *   \u003c/quote\u003e\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @return a random value.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.PoissonDistribution.nextPoisson(double)",
      "begin_line": 290,
      "end_line": 374,
      "comment": "\n     * @param meanPoisson Mean of the Poisson distribution.\n     * @return the next sample.\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 35)",
        "(line 292,col 9)-(line 373,col 9)"
      ]
    }
  ]
}