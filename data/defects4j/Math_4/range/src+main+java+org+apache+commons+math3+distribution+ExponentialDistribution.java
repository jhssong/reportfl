{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/ExponentialDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExponentialDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 35,
      "end_line": 314,
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
      "signature": "org.apache.commons.math3.distribution.ExponentialDistribution.density(double)",
      "begin_line": 147,
      "end_line": 152,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ExponentialDistribution.cumulativeProbability(double)",
      "begin_line": 164,
      "end_line": 172,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/ExponentialDistribution.html\"\u003e\n     * Exponential Distribution\u003c/a\u003e, equation (1).\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 19)",
        "(line 166,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ExponentialDistribution.inverseCumulativeProbability(double)",
      "begin_line": 180,
      "end_line": 193,
      "comment": "\n     * {@inheritDoc}\n     *\n     * Returns {@code 0} when {@code p\u003d \u003d 0} and\n     * {@code Double.POSITIVE_INFINITY} when {@code p \u003d\u003d 1}.\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 19)",
        "(line 184,col 9)-(line 190,col 9)",
        "(line 192,col 9)-(line 192,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ExponentialDistribution.sample()",
      "begin_line": 206,
      "end_line": 244,
      "comment": "\n     * {@inheritDoc}\n     *\n     * \u003cp\u003e\u003cstrong\u003eAlgorithm Description\u003c/strong\u003e: this implementation uses the\n     * \u003ca href\u003d\"http://www.jesus.ox.ac.uk/~clifford/a5/chap1/node5.html\"\u003e\n     * Inversion Method\u003c/a\u003e to generate exponentially distributed random values\n     * from uniform deviates.\u003c/p\u003e\n     *\n     * @return a random value.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 21)",
        "(line 210,col 9)-(line 210,col 39)",
        "(line 213,col 9)-(line 216,col 9)",
        "(line 219,col 9)-(line 219,col 19)",
        "(line 222,col 9)-(line 224,col 9)",
        "(line 227,col 9)-(line 227,col 18)",
        "(line 228,col 9)-(line 228,col 40)",
        "(line 229,col 9)-(line 229,col 25)",
        "(line 232,col 9)-(line 241,col 43)",
        "(line 243,col 9)-(line 243,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ExponentialDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 247,
      "end_line": 250,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ExponentialDistribution.getNumericalMean()",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For mean parameter {@code k}, the mean is {@code k}.\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ExponentialDistribution.getNumericalVariance()",
      "begin_line": 266,
      "end_line": 269,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For mean parameter {@code k}, the variance is {@code k^2}.\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 35)",
        "(line 268,col 9)-(line 268,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ExponentialDistribution.getSupportLowerBound()",
      "begin_line": 278,
      "end_line": 280,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the mean parameter.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ExponentialDistribution.getSupportUpperBound()",
      "begin_line": 290,
      "end_line": 292,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the mean parameter.\n     *\n     * @return upper bound of the support (always Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ExponentialDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 295,
      "end_line": 297,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ExponentialDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 300,
      "end_line": 302,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ExponentialDistribution.isSupportConnected()",
      "begin_line": 311,
      "end_line": 313,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 20)"
      ]
    }
  ]
}