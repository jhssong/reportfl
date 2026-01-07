{
  "filepath": "/tmp/Math-38b/src/main/java/org/apache/commons/math/distribution/PascalDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PascalDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractIntegerDistribution"
      ],
      "begin_line": 62,
      "end_line": 231,
      "comment": "\n * \u003cp\u003e\n * Implementation of the Pascal distribution. The Pascal distribution is a\n * special case of the Negative Binomial distribution where the number of\n * successes parameter is an integer.\n * \u003c/p\u003e\n * \u003cp\u003e\n * There are various ways to express the probability mass and distribution\n * functions for the Pascal distribution. The present implementation represents\n * the distribution of the number of failures before {@code r} successes occur.\n * This is the convention adopted in e.g.\n * \u003ca href\u003d\"http://mathworld.wolfram.com/NegativeBinomialDistribution.html\"\u003eMathWorld\u003c/a\u003e,\n * but \u003cem\u003enot\u003c/em\u003e in\n * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Negative_binomial_distribution\"\u003eWikipedia\u003c/a\u003e.\n * \u003c/p\u003e\n * \u003cp\u003e\n * For a random variable {@code X} whose values are distributed according to this\n * distribution, the probability mass function is given by\u003cbr/\u003e\n * {@code P(X \u003d k) \u003d C(k + r - 1, r - 1) * p^r * (1 - p)^k,}\u003cbr/\u003e\n * where {@code r} is the number of successes, {@code p} is the probability of\n * success, and {@code X} is the total number of failures. {@code C(n, k)} is\n * the binomial coefficient ({@code n} choose {@code k}). The mean and variance\n * of {@code X} are\u003cbr/\u003e\n * {@code E(X) \u003d (1 - p) * r / p, var(X) \u003d (1 - p) * r / p^2.}\u003cbr/\u003e\n * Finally, the cumulative distribution function is given by\u003cbr/\u003e\n * {@code P(X \u003c\u003d k) \u003d I(p, r, k + 1)},\n * where I is the regularized incomplete Beta function.\n * \u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Negative_binomial_distribution\"\u003e\n * Negative binomial distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/NegativeBinomialDistribution.html\"\u003e\n * Negative binomial distribution (MathWorld)\u003c/a\u003e\n * @version $Id$\n * @since 1.2 (changed to concrete class in 3.0)\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfSuccesses"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The number of successes. "
    },
    {
      "type": "field",
      "varNames": [
        "probabilityOfSuccess"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The probability of success. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PascalDistribution.PascalDistribution(int, double)",
      "begin_line": 80,
      "end_line": 92,
      "comment": "\n     * Create a Pascal distribution with the given number of trials and\n     * probability of success.\n     *\n     * @param r Number of successes.\n     * @param p Probability of success.\n     * @throws NotPositiveException if the number of successes is not positive\n     * @throws OutOfRangeException if the probability of success is not in the\n     * range [0, 1]\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 88,col 9)",
        "(line 90,col 9)-(line 90,col 30)",
        "(line 91,col 9)-(line 91,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistribution.getNumberOfSuccesses()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Access the number of successes for this distribution.\n     *\n     * @return the number of successes.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistribution.getProbabilityOfSuccess()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Access the probability of success for this distribution.\n     *\n     * @return the probability of success.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistribution.probability(int)",
      "begin_line": 113,
      "end_line": 124,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 19)",
        "(line 115,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistribution.cumulativeProbability(int)",
      "begin_line": 127,
      "end_line": 136,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 19)",
        "(line 129,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistribution.inverseCumulativeProbability(double)",
      "begin_line": 144,
      "end_line": 158,
      "comment": "\n     * {@inheritDoc}\n     *\n     * Returns {@code -1} when {@code p \u003d\u003d 0} and\n     * {@code Integer.MAX_VALUE} when {@code p \u003d\u003d 1}.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 16)",
        "(line 149,col 9)-(line 155,col 9)",
        "(line 157,col 9)-(line 157,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistribution.getDomainLowerBound(double)",
      "begin_line": 161,
      "end_line": 164,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistribution.getDomainUpperBound(double)",
      "begin_line": 167,
      "end_line": 171,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistribution.getNumericalMean()",
      "begin_line": 179,
      "end_line": 183,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For number of successes {@code r} and probability of success {@code p},\n     * the mean is {@code r * (1 - p) / p}.\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 51)",
        "(line 181,col 9)-(line 181,col 48)",
        "(line 182,col 9)-(line 182,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistribution.getNumericalVariance()",
      "begin_line": 191,
      "end_line": 195,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For number of successes {@code r} and probability of success {@code p},\n     * the variance is {@code r * (1 - p) / p^2}.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 51)",
        "(line 193,col 9)-(line 193,col 48)",
        "(line 194,col 9)-(line 194,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistribution.getSupportLowerBound()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the parameters.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistribution.getSupportUpperBound()",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity no matter the\n     * parameters. Positive infinity is symbolised by {@code Integer.MAX_VALUE}.\n     *\n     * @return upper bound of the support (always {@code Integer.MAX_VALUE}\n     * for positive infinity)\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistribution.isSupportConnected()",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 20)"
      ]
    }
  ]
}