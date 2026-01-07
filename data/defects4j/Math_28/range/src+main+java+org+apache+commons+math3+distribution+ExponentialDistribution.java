{
  "filepath": "/tmp/Math-28b/src/main/java/org/apache/commons/math3/distribution/ExponentialDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExponentialDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 35,
      "end_line": 325,
      "comment": "\n * Implementation of the exponential distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Exponential_distribution\"\u003eExponential distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/ExponentialDistribution.html\"\u003eExponential distribution (MathWorld)\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Default inverse cumulative probability accuracy.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "EXPONENTIAL_SA_QI"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Used when generating Exponential samples.\n     * Table containing the constants\n     * q_i \u003d sum_{j\u003d1}^i (ln 2)^j/j! \u003d ln 2 + (ln 2)^2/2 + ... + (ln 2)^i/i!\n     * until the largest representable fraction below 1 is exceeded.\n     *\n     * Note that\n     * 1 \u003d 2 - 1 \u003d exp(ln 2) - 1 \u003d sum_{n\u003d1}^infty (ln 2)^n / n!\n     * thus q_i -\u003e 1 as i -\u003e +inf,\n     * so the higher i, the closer to one we get (the series is not alternating).\n     *\n     * By trying, n \u003d 16 in Java is enough to reach 1.0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " The mean of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.ExponentialDistribution.ExponentialDistribution(double)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Create an exponential distribution with the given mean.\n     * @param mean mean of this distribution.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.ExponentialDistribution.ExponentialDistribution(double, double)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Create an exponential distribution with the given mean.\n     *\n     * @param mean Mean of this distribution.\n     * @param inverseCumAccuracy Maximum absolute error in inverse\n     * cumulative probability estimates (defaults to\n     * {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @throws NotStrictlyPositiveException if {@code mean \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.ExponentialDistribution.ExponentialDistribution(org.apache.commons.math3.random.RandomGenerator, double, double)",
      "begin_line": 124,
      "end_line": 135,
      "comment": "\n     * Creates an exponential distribution.\n     *\n     * @param rng Random number generator.\n     * @param mean Mean of this distribution.\n     * @param inverseCumAccuracy Maximum absolute error in inverse\n     * cumulative probability estimates (defaults to\n     * {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @throws NotStrictlyPositiveException if {@code mean \u003c\u003d 0}.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 19)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 25)",
        "(line 134,col 9)-(line 134,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ExponentialDistribution.getMean()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * Access the mean.\n     *\n     * @return the mean.\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ExponentialDistribution.probability(double)",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For this distribution {@code P(X \u003d x)} always evaluates to 0.\n     *\n     * @return 0\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ExponentialDistribution.density(double)",
      "begin_line": 158,
      "end_line": 163,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 159,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 162,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ExponentialDistribution.cumulativeProbability(double)",
      "begin_line": 175,
      "end_line": 183,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/ExponentialDistribution.html\"\u003e\n     * Exponential Distribution\u003c/a\u003e, equation (1).\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 19)",
        "(line 177,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ExponentialDistribution.inverseCumulativeProbability(double)",
      "begin_line": 191,
      "end_line": 204,
      "comment": "\n     * {@inheritDoc}\n     *\n     * Returns {@code 0} when {@code p\u003d \u003d 0} and\n     * {@code Double.POSITIVE_INFINITY} when {@code p \u003d\u003d 1}.\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 19)",
        "(line 195,col 9)-(line 201,col 9)",
        "(line 203,col 9)-(line 203,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ExponentialDistribution.sample()",
      "begin_line": 217,
      "end_line": 255,
      "comment": "\n     * {@inheritDoc}\n     *\n     * \u003cp\u003e\u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: this implementation uses the\n     * \u003ca href\u003d\"http://www.jesus.ox.ac.uk/~clifford/a5/chap1/node5.html\"\u003e\n     * Inversion Method\u003c/a\u003e to generate exponentially distributed random values\n     * from uniform deviates.\u003c/p\u003e\n     *\n     * @return a random value.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 21)",
        "(line 221,col 9)-(line 221,col 39)",
        "(line 224,col 9)-(line 227,col 9)",
        "(line 230,col 9)-(line 230,col 19)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 238,col 9)-(line 238,col 18)",
        "(line 239,col 9)-(line 239,col 40)",
        "(line 240,col 9)-(line 240,col 25)",
        "(line 243,col 9)-(line 252,col 43)",
        "(line 254,col 9)-(line 254,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ExponentialDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 258,
      "end_line": 261,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ExponentialDistribution.getNumericalMean()",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For mean parameter {@code k}, the mean is {@code k}.\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ExponentialDistribution.getNumericalVariance()",
      "begin_line": 277,
      "end_line": 280,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For mean parameter {@code k}, the variance is {@code k^2}.\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 35)",
        "(line 279,col 9)-(line 279,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ExponentialDistribution.getSupportLowerBound()",
      "begin_line": 289,
      "end_line": 291,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the mean parameter.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ExponentialDistribution.getSupportUpperBound()",
      "begin_line": 301,
      "end_line": 303,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the mean parameter.\n     *\n     * @return upper bound of the support (always Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ExponentialDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 306,
      "end_line": 308,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ExponentialDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 311,
      "end_line": 313,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ExponentialDistribution.isSupportConnected()",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 20)"
      ]
    }
  ]
}