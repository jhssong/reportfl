{
  "filepath": "/tmp/Math-45b/src/main/java/org/apache/commons/math/distribution/PoissonDistributionImpl.java",
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
      "end_line": 288,
      "comment": "\n * Implementation for the {@link PoissonDistribution}.\n *\n * @version $Id$\n "
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
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Default convergence criterion.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "normal"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Distribution used to compute normal approximation. "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Mean of the distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Maximum number of iterations for cumulative probability.\n     *\n     * Cumulative probabilities are estimated using either Lanczos series approximation of\n     * Gamma#regularizedGammaP or continued fraction approximation of Gamma#regularizedGammaQ.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Convergence criterion for cumulative probability.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.PoissonDistributionImpl(double)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Create a new Poisson distribution with the given the mean. The mean value\n     * must be positive; otherwise an \u003ccode\u003eIllegalArgument\u003c/code\u003e is thrown.\n     *\n     * @param p the Poisson mean\n     * @throws NotStrictlyPositiveException if {@code p \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.PoissonDistributionImpl(double, double, int)",
      "begin_line": 83,
      "end_line": 91,
      "comment": "\n     * Create a new Poisson distribution with the given mean, convergence criterion\n     * and maximum number of iterations.\n     *\n     * @param p Poisson mean.\n     * @param epsilon Convergence criterion for cumulative probabilities.\n     * @param maxIterations the maximum number of iterations for cumulative\n     * probabilities.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 17)",
        "(line 88,col 9)-(line 88,col 65)",
        "(line 89,col 9)-(line 89,col 31)",
        "(line 90,col 9)-(line 90,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.PoissonDistributionImpl(double, double)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Create a new Poisson distribution with the given mean and convergence criterion.\n     *\n     * @param p Poisson mean.\n     * @param epsilon Convergence criterion for cumulative probabilities.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.PoissonDistributionImpl(double, int)",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Create a new Poisson distribution with the given mean and maximum number of iterations.\n     *\n     * @param p Poisson mean.\n     * @param maxIterations Maximum number of iterations for cumulative probabilities.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.getMean()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.probability(int)",
      "begin_line": 128,
      "end_line": 140,
      "comment": "\n     * The probability mass function {@code P(X \u003d x)} for a Poisson distribution.\n     *\n     * @param x Value at which the probability density function is evaluated.\n     * @return the value of the probability mass function at {@code x}.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 19)",
        "(line 130,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.cumulativeProbability(int)",
      "begin_line": 150,
      "end_line": 159,
      "comment": "\n     * The probability distribution function {@code P(X \u003c\u003d x)} for a Poisson\n     * distribution.\n     *\n     * @param x Value at which the PDF is evaluated.\n     * @return the Poisson distribution function evaluated at {@code x}.\n     * due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.normalApproximateProbability(int)",
      "begin_line": 173,
      "end_line": 176,
      "comment": "\n     * Calculates the Poisson distribution function using a normal\n     * approximation. The {@code N(mean, sqrt(mean))} distribution is used\n     * to approximate the Poisson distribution.\n     * The computation uses \"half-correction\" (evaluating the normal\n     * distribution function at {@code x + 0.5}).\n     *\n     * @param x Upper bound, inclusive.\n     * @return the distribution function value calculated using a normal\n     * approximation.\n     * approximation.\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.sample()",
      "begin_line": 199,
      "end_line": 202,
      "comment": "\n     * Generates a random value sampled from this distribution.\n     * \u003cbr/\u003e\n     * \u003cstrong\u003eAlgorithm Description\u003c/strong\u003e:\n     * \u003cul\u003e\n     *  \u003cli\u003eFor small means, uses simulation of a Poisson process\n     *   using Uniform deviates, as described\n     *   \u003ca href\u003d\"http://irmi.epfl.ch/cmos/Pmmi/interactive/rng7.htm\"\u003e here\u003c/a\u003e.\n     *   The Poisson process (and hence value returned) is bounded by 1000 * mean.\n     *  \u003c/li\u003e\n     *  \u003cli\u003eFor large means, uses the rejection algorithm described in\n     *   \u003cquote\u003e\n     *    Devroye, Luc. (1981).\u003ci\u003eThe Computer Generation of Poisson Random Variables\u003c/i\u003e\n     *    \u003cstrong\u003eComputing\u003c/strong\u003e vol. 26 pp. 197-207.\n     *   \u003c/quote\u003e\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @return a random value.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 212,
      "end_line": 215,
      "comment": "\n     * Access the domain value lower bound, based on {@code p}, used to\n     * bracket a CDF root. This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain lower bound.\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 225,
      "end_line": 228,
      "comment": "\n     * Access the domain value upper bound, based on {@code p}, used to\n     * bracket a CDF root. This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain upper bound.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.getSupportLowerBound()",
      "begin_line": 237,
      "end_line": 240,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the mean parameter.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.getSupportUpperBound()",
      "begin_line": 252,
      "end_line": 255,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is positive infinity,\n     * regardless of the parameter values. There is no integer infinity,\n     * so this method returns \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e and\n     * {@link #isSupportUpperBoundInclusive()} returns \u003ccode\u003etrue\u003c/code\u003e.\n     *\n     * @return upper bound of the support (always \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e for positive infinity)\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.calculateNumericalMean()",
      "begin_line": 264,
      "end_line": 267,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For mean parameter \u003ccode\u003ep\u003c/code\u003e, the mean is \u003ccode\u003ep\u003c/code\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.calculateNumericalVariance()",
      "begin_line": 276,
      "end_line": 279,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For mean parameter \u003ccode\u003ep\u003c/code\u003e, the variance is \u003ccode\u003ep\u003c/code\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.isSupportUpperBoundInclusive()",
      "begin_line": 284,
      "end_line": 287,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 20)"
      ]
    }
  ]
}