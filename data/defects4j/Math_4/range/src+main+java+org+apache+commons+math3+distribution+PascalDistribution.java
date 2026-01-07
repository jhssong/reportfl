{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/PascalDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PascalDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractIntegerDistribution"
      ],
      "begin_line": 64,
      "end_line": 219,
      "comment": "\n * \u003cp\u003e\n * Implementation of the Pascal distribution. The Pascal distribution is a\n * special case of the Negative Binomial distribution where the number of\n * successes parameter is an integer.\n * \u003c/p\u003e\n * \u003cp\u003e\n * There are various ways to express the probability mass and distribution\n * functions for the Pascal distribution. The present implementation represents\n * the distribution of the number of failures before {@code r} successes occur.\n * This is the convention adopted in e.g.\n * \u003ca href\u003d\"http://mathworld.wolfram.com/NegativeBinomialDistribution.html\"\u003eMathWorld\u003c/a\u003e,\n * but \u003cem\u003enot\u003c/em\u003e in\n * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Negative_binomial_distribution\"\u003eWikipedia\u003c/a\u003e.\n * \u003c/p\u003e\n * \u003cp\u003e\n * For a random variable {@code X} whose values are distributed according to this\n * distribution, the probability mass function is given by\u003cbr/\u003e\n * {@code P(X \u003d k) \u003d C(k + r - 1, r - 1) * p^r * (1 - p)^k,}\u003cbr/\u003e\n * where {@code r} is the number of successes, {@code p} is the probability of\n * success, and {@code X} is the total number of failures. {@code C(n, k)} is\n * the binomial coefficient ({@code n} choose {@code k}). The mean and variance\n * of {@code X} are\u003cbr/\u003e\n * {@code E(X) \u003d (1 - p) * r / p, var(X) \u003d (1 - p) * r / p^2.}\u003cbr/\u003e\n * Finally, the cumulative distribution function is given by\u003cbr/\u003e\n * {@code P(X \u003c\u003d k) \u003d I(p, r, k + 1)},\n * where I is the regularized incomplete Beta function.\n * \u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Negative_binomial_distribution\"\u003e\n * Negative binomial distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/NegativeBinomialDistribution.html\"\u003e\n * Negative binomial distribution (MathWorld)\u003c/a\u003e\n * @version $Id$\n * @since 1.2 (changed to concrete class in 3.0)\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfSuccesses"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The number of successes. "
    },
    {
      "type": "field",
      "varNames": [
        "probabilityOfSuccess"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " The probability of success. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.PascalDistribution.PascalDistribution(int, double)",
      "begin_line": 82,
      "end_line": 85,
      "comment": "\n     * Create a Pascal distribution with the given number of successes and\n     * probability of success.\n     *\n     * @param r Number of successes.\n     * @param p Probability of success.\n     * @throws NotStrictlyPositiveException if the number of successes is not positive\n     * @throws OutOfRangeException if the probability of success is not in the\n     * range {@code [0, 1]}.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.PascalDistribution.PascalDistribution(org.apache.commons.math3.random.RandomGenerator, int, double)",
      "begin_line": 99,
      "end_line": 115,
      "comment": "\n     * Create a Pascal distribution with the given number of successes and\n     * probability of success.\n     *\n     * @param rng Random number generator.\n     * @param r Number of successes.\n     * @param p Probability of success.\n     * @throws NotStrictlyPositiveException if the number of successes is not positive\n     * @throws OutOfRangeException if the probability of success is not in the\n     * range {@code [0, 1]}.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 19)",
        "(line 105,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 113,col 9)-(line 113,col 30)",
        "(line 114,col 9)-(line 114,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.PascalDistribution.getNumberOfSuccesses()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Access the number of successes for this distribution.\n     *\n     * @return the number of successes.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.PascalDistribution.getProbabilityOfSuccess()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * Access the probability of success for this distribution.\n     *\n     * @return the probability of success.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.PascalDistribution.probability(int)",
      "begin_line": 136,
      "end_line": 147,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 19)",
        "(line 138,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.PascalDistribution.cumulativeProbability(int)",
      "begin_line": 150,
      "end_line": 159,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 19)",
        "(line 152,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.PascalDistribution.getNumericalMean()",
      "begin_line": 167,
      "end_line": 171,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For number of successes {@code r} and probability of success {@code p},\n     * the mean is {@code r * (1 - p) / p}.\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 51)",
        "(line 169,col 9)-(line 169,col 48)",
        "(line 170,col 9)-(line 170,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.PascalDistribution.getNumericalVariance()",
      "begin_line": 179,
      "end_line": 183,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For number of successes {@code r} and probability of success {@code p},\n     * the variance is {@code r * (1 - p) / p^2}.\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 51)",
        "(line 181,col 9)-(line 181,col 48)",
        "(line 182,col 9)-(line 182,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.PascalDistribution.getSupportLowerBound()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the parameters.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.PascalDistribution.getSupportUpperBound()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity no matter the\n     * parameters. Positive infinity is symbolized by {@code Integer.MAX_VALUE}.\n     *\n     * @return upper bound of the support (always {@code Integer.MAX_VALUE}\n     * for positive infinity)\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.PascalDistribution.isSupportConnected()",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 20)"
      ]
    }
  ]
}