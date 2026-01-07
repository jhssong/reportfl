{
  "filepath": "/tmp/Math-31b/src/main/java/org/apache/commons/math3/distribution/PoissonDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PoissonDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractIntegerDistribution"
      ],
      "begin_line": 32,
      "end_line": 257,
      "comment": "\n * Implementation of the Poisson distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Poisson_distribution\"\u003ePoisson distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/PoissonDistribution.html\"\u003ePoisson distribution (MathWorld)\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAX_ITERATIONS"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * Default maximum number of iterations for cumulative probability calculations.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EPSILON"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Default convergence criterion.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 46,
      "end_line": 46,
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
        "mean"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Mean of the distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Maximum number of iterations for cumulative probability. Cumulative\n     * probabilities are estimated using either Lanczos series approximation of\n     * {@link Gamma#regularizedGammaP(double, double, double, int)}\n     * or continued fraction approximation of\n     * {@link Gamma#regularizedGammaQ(double, double, double, int)}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Convergence criterion for cumulative probability. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.PoissonDistribution.PoissonDistribution(double)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Creates a new Poisson distribution with specified mean.\n     *\n     * @param p the Poisson mean\n     * @throws NotStrictlyPositiveException if {@code p \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.PoissonDistribution.PoissonDistribution(double, double, int)",
      "begin_line": 87,
      "end_line": 96,
      "comment": "\n     * Creates a new Poisson distribution with specified mean, convergence\n     * criterion and maximum number of iterations.\n     *\n     * @param p Poisson mean.\n     * @param epsilon Convergence criterion for cumulative probabilities.\n     * @param maxIterations the maximum number of iterations for cumulative\n     * probabilities.\n     * @throws NotStrictlyPositiveException if {@code p \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 92,col 17)",
        "(line 93,col 9)-(line 93,col 61)",
        "(line 94,col 9)-(line 94,col 31)",
        "(line 95,col 9)-(line 95,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.PoissonDistribution.PoissonDistribution(double, double)",
      "begin_line": 107,
      "end_line": 110,
      "comment": "\n     * Creates a new Poisson distribution with the specified mean and\n     * convergence criterion.\n     *\n     * @param p Poisson mean.\n     * @param epsilon Convergence criterion for cumulative probabilities.\n     * @throws NotStrictlyPositiveException if {@code p \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.PoissonDistribution.PoissonDistribution(double, int)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Creates a new Poisson distribution with the specified mean and maximum\n     * number of iterations.\n     *\n     * @param p Poisson mean.\n     * @param maxIterations Maximum number of iterations for cumulative\n     * probabilities.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.PoissonDistribution.getMean()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n     * Get the mean for the distribution.\n     *\n     * @return the mean for the distribution.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.PoissonDistribution.probability(int)",
      "begin_line": 135,
      "end_line": 147,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 19)",
        "(line 137,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.PoissonDistribution.cumulativeProbability(int)",
      "begin_line": 150,
      "end_line": 159,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 158,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.PoissonDistribution.normalApproximateProbability(int)",
      "begin_line": 172,
      "end_line": 175,
      "comment": "\n     * Calculates the Poisson distribution function using a normal\n     * approximation. The {@code N(mean, sqrt(mean))} distribution is used\n     * to approximate the Poisson distribution. The computation uses\n     * \"half-correction\" (evaluating the normal distribution function at\n     * {@code x + 0.5}).\n     *\n     * @param x Upper bound, inclusive.\n     * @return the distribution function value calculated using a normal\n     * approximation.\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.PoissonDistribution.getNumericalMean()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For mean parameter {@code p}, the mean is {@code p}.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.PoissonDistribution.getNumericalVariance()",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For mean parameter {@code p}, the variance is {@code p}.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.PoissonDistribution.getSupportLowerBound()",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the mean parameter.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.PoissonDistribution.getSupportUpperBound()",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is positive infinity,\n     * regardless of the parameter values. There is no integer infinity,\n     * so this method returns {@code Integer.MAX_VALUE}.\n     *\n     * @return upper bound of the support (always {@code Integer.MAX_VALUE} for\n     * positive infinity)\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.PoissonDistribution.isSupportConnected()",
      "begin_line": 227,
      "end_line": 229,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.PoissonDistribution.sample()",
      "begin_line": 253,
      "end_line": 256,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e:\n     * \u003cul\u003e\n     *  \u003cli\u003eFor small means, uses simulation of a Poisson process\n     *   using Uniform deviates, as described\n     *   \u003ca href\u003d\"http://irmi.epfl.ch/cmos/Pmmi/interactive/rng7.htm\"\u003e here\u003c/a\u003e.\n     *   The Poisson process (and hence value returned) is bounded by 1000 * mean.\n     *  \u003c/li\u003e\n     *  \u003cli\u003eFor large means, uses the rejection algorithm described in\n     *   \u003cquote\u003e\n     *    Devroye, Luc. (1981).\u003ci\u003eThe Computer Generation of Poisson Random Variables\u003c/i\u003e\n     *    \u003cstrong\u003eComputing\u003c/strong\u003e vol. 26 pp. 197-207.\n     *   \u003c/quote\u003e\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @return a random value.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 83)"
      ]
    }
  ]
}