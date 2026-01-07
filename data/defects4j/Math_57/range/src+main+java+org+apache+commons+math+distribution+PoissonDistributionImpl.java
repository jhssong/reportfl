{
  "filepath": "/tmp/Math-57b/src/main/java/org/apache/commons/math/distribution/PoissonDistributionImpl.java",
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
      "end_line": 292,
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
      "begin_line": 44,
      "end_line": 44,
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
      "begin_line": 48,
      "end_line": 48,
      "comment": " Distribution used to compute normal approximation. "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Mean of the distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Maximum number of iterations for cumulative probability.\n     *\n     * Cumulative probabilities are estimated using either Lanczos series approximation of\n     * Gamma#regularizedGammaP or continued fraction approximation of Gamma#regularizedGammaQ.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Convergence criterion for cumulative probability.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.PoissonDistributionImpl(double)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Create a new Poisson distribution with the given the mean. The mean value\n     * must be positive; otherwise an \u003ccode\u003eIllegalArgument\u003c/code\u003e is thrown.\n     *\n     * @param p the Poisson mean\n     * @throws NotStrictlyPositiveException if {@code p \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.PoissonDistributionImpl(double, double, int)",
      "begin_line": 84,
      "end_line": 92,
      "comment": "\n     * Create a new Poisson distribution with the given mean, convergence criterion\n     * and maximum number of iterations.\n     *\n     * @param p Poisson mean.\n     * @param epsilon Convergence criterion for cumulative probabilities.\n     * @param maxIterations the maximum number of iterations for cumulative\n     * probabilities.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 88,col 17)",
        "(line 89,col 9)-(line 89,col 65)",
        "(line 90,col 9)-(line 90,col 31)",
        "(line 91,col 9)-(line 91,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.PoissonDistributionImpl(double, double)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Create a new Poisson distribution with the given mean and convergence criterion.\n     *\n     * @param p Poisson mean.\n     * @param epsilon Convergence criterion for cumulative probabilities.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.PoissonDistributionImpl(double, int)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Create a new Poisson distribution with the given mean and maximum number of iterations.\n     *\n     * @param p Poisson mean.\n     * @param maxIterations Maximum number of iterations for cumulative probabilities.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.getMean()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.probability(int)",
      "begin_line": 129,
      "end_line": 141,
      "comment": "\n     * The probability mass function {@code P(X \u003d x)} for a Poisson distribution.\n     *\n     * @param x Value at which the probability density function is evaluated.\n     * @return the value of the probability mass function at {@code x}.\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 19)",
        "(line 131,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.cumulativeProbability(int)",
      "begin_line": 152,
      "end_line": 161,
      "comment": "\n     * The probability distribution function {@code P(X \u003c\u003d x)} for a Poisson\n     * distribution.\n     *\n     * @param x Value at which the PDF is evaluated.\n     * @return the Poisson distribution function evaluated at {@code x}.\n     * @throws MathException if the cumulative probability cannot be computed\n     * due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.normalApproximateProbability(int)",
      "begin_line": 176,
      "end_line": 179,
      "comment": "\n     * Calculates the Poisson distribution function using a normal\n     * approximation. The {@code N(mean, sqrt(mean))} distribution is used\n     * to approximate the Poisson distribution.\n     * The computation uses \"half-correction\" (evaluating the normal\n     * distribution function at {@code x + 0.5}).\n     *\n     * @param x Upper bound, inclusive.\n     * @return the distribution function value calculated using a normal\n     * approximation.\n     * @throws MathException if an error occurs computing the normal\n     * approximation.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.sample()",
      "begin_line": 203,
      "end_line": 206,
      "comment": "\n     * Generates a random value sampled from this distribution.\n     * \u003cbr/\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e:\n     * \u003cul\u003e\n     *  \u003cli\u003eFor small means, uses simulation of a Poisson process\n     *   using Uniform deviates, as described\n     *   \u003ca href\u003d\"http://irmi.epfl.ch/cmos/Pmmi/interactive/rng7.htm\"\u003e here\u003c/a\u003e.\n     *   The Poisson process (and hence value returned) is bounded by 1000 * mean.\n     *  \u003c/li\u003e\n     *  \u003cli\u003eFor large means, uses the rejection algorithm described in\n     *   \u003cquote\u003e\n     *    Devroye, Luc. (1981).\u003ci\u003eThe Computer Generation of Poisson Random Variables\u003c/i\u003e\n     *    \u003cstrong\u003eComputing\u003c/strong\u003e vol. 26 pp. 197-207.\n     *   \u003c/quote\u003e\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @return a random value.\n     * @since 2.2\n     * @throws MathException if an error occurs generating the random value.\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 216,
      "end_line": 219,
      "comment": "\n     * Access the domain value lower bound, based on {@code p}, used to\n     * bracket a CDF root. This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain lower bound.\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 229,
      "end_line": 232,
      "comment": "\n     * Access the domain value upper bound, based on {@code p}, used to\n     * bracket a CDF root. This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain upper bound.\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.getSupportLowerBound()",
      "begin_line": 241,
      "end_line": 244,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the mean parameter.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.getSupportUpperBound()",
      "begin_line": 256,
      "end_line": 259,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is positive infinity,\n     * regardless of the parameter values. There is no integer infinity,\n     * so this method returns \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e and\n     * {@link #isSupportUpperBoundInclusive()} returns \u003ccode\u003etrue\u003c/code\u003e.\n     *\n     * @return upper bound of the support (always \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e for positive infinity)\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.calculateNumericalMean()",
      "begin_line": 268,
      "end_line": 271,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For mean parameter \u003ccode\u003ep\u003c/code\u003e, the mean is \u003ccode\u003ep\u003c/code\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.calculateNumericalVariance()",
      "begin_line": 280,
      "end_line": 283,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For mean parameter \u003ccode\u003ep\u003c/code\u003e, the variance is \u003ccode\u003ep\u003c/code\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.isSupportUpperBoundInclusive()",
      "begin_line": 288,
      "end_line": 291,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 20)"
      ]
    }
  ]
}