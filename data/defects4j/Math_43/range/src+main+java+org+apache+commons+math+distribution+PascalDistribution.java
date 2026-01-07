{
  "filepath": "/tmp/Math-43b/src/main/java/org/apache/commons/math/distribution/PascalDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PascalDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractIntegerDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 49,
      "end_line": 228,
      "comment": "\n * \u003cp\u003e\n * Implementation of the Pascal distribution. The Pascal distribution is a\n * special case of the Negative Binomial distribution where the number of\n * successes parameter is an integer.\n * \u003c/p\u003e\n * \u003cp\u003e\n * There are various ways to express the probability mass and distribution\n * functions for the Pascal distribution.  The convention employed by the\n * library is to express these functions in terms of the number of failures in\n * a Bernoulli experiment\n * (see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Negative_binomial_distribution#Waiting_time_in_a_Bernoulli_process\"\u003eWaiting Time in a Bernoulli Process\u003c/a\u003e).\n * \u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Negative_binomial_distribution\"\u003e\n * Negative binomial distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/NegativeBinomialDistribution.html\"\u003e\n * Negative binomial distribution (MathWorld)\u003c/a\u003e\n * @version $Id$\n * @since 1.2 (changed to concrete class in 3.0)\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfSuccesses"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " The number of successes. "
    },
    {
      "type": "field",
      "varNames": [
        "probabilityOfSuccess"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " The probability of success. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PascalDistribution.PascalDistribution(int, double)",
      "begin_line": 68,
      "end_line": 80,
      "comment": "\n     * Create a Pascal distribution with the given number of trials and\n     * probability of success.\n     *\n     * @param r Number of successes.\n     * @param p Probability of success.\n     * @throws NotPositiveException if the number of successes is not positive\n     * @throws OutOfRangeException if the probability of success is not in the\n     * range [0, 1]\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 76,col 9)",
        "(line 78,col 9)-(line 78,col 30)",
        "(line 79,col 9)-(line 79,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistribution.getNumberOfSuccesses()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Access the number of successes for this distribution.\n     *\n     * @return the number of successes.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistribution.getProbabilityOfSuccess()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Access the probability of success for this distribution.\n     *\n     * @return the probability of success.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistribution.getDomainLowerBound(double)",
      "begin_line": 101,
      "end_line": 104,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistribution.getDomainUpperBound(double)",
      "begin_line": 107,
      "end_line": 111,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistribution.cumulativeProbability(int)",
      "begin_line": 114,
      "end_line": 124,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 19)",
        "(line 117,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistribution.probability(int)",
      "begin_line": 127,
      "end_line": 138,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 19)",
        "(line 129,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistribution.inverseCumulativeProbability(double)",
      "begin_line": 146,
      "end_line": 160,
      "comment": "\n     * {@inheritDoc}\n     *\n     * Returns {@code -1} when {@code p \u003d\u003d 0} and\n     * {@code Integer.MAX_VALUE} when {@code p \u003d\u003d 1}.\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 16)",
        "(line 151,col 9)-(line 157,col 9)",
        "(line 159,col 9)-(line 159,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistribution.getSupportLowerBound()",
      "begin_line": 169,
      "end_line": 172,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the parameters.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistribution.getSupportUpperBound()",
      "begin_line": 185,
      "end_line": 188,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity no matter the\n     * parameters. Positive infinity is symbolised by {@code Integer.MAX_VALUE}\n     * together with {@link #isSupportUpperBoundInclusive()} being\n     * {@code false}.\n     *\n     * @return upper bound of the support (always {@code Integer.MAX_VALUE}\n     * for positive infinity)\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistribution.calculateNumericalMean()",
      "begin_line": 196,
      "end_line": 201,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For number of successes {@code r} and probability of success {@code p},\n     * the mean is {@code (r * p) / (1 - p)}.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 51)",
        "(line 199,col 9)-(line 199,col 48)",
        "(line 200,col 9)-(line 200,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistribution.calculateNumericalVariance()",
      "begin_line": 209,
      "end_line": 215,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For number of successes {@code r} and probability of success {@code p},\n     * the mean is {@code (r * p) / (1 - p)^2}.\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 51)",
        "(line 212,col 9)-(line 212,col 48)",
        "(line 213,col 9)-(line 213,col 34)",
        "(line 214,col 9)-(line 214,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 224,
      "end_line": 227,
      "comment": "\n     * {@inheritDoc}\n     *\n     * Always returns {@code false}.\n     *\n     * @see PascalDistribution#getSupportUpperBound() getSupportUpperBound()\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 21)"
      ]
    }
  ]
}