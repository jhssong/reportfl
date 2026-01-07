{
  "filepath": "/tmp/Math-41b/src/main/java/org/apache/commons/math/distribution/BinomialDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BinomialDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractIntegerDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 34,
      "end_line": 190,
      "comment": "\n * Implementation of the binomial distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Binomial_distribution\"\u003eBinomial distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/BinomialDistribution.html\"\u003eBinomial Distribution (MathWorld)\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfTrials"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The number of trials. "
    },
    {
      "type": "field",
      "varNames": [
        "probabilityOfSuccess"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The probability of success. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.BinomialDistribution.BinomialDistribution(int, double)",
      "begin_line": 52,
      "end_line": 63,
      "comment": "\n     * Create a binomial distribution with the given number of trials and\n     * probability of success.\n     *\n     * @param trials Number of trials.\n     * @param p Probability of success.\n     * @throws NotPositiveException if {@code trials \u003c 0}.\n     * @throws OutOfRangeException if {@code p \u003c 0} or {@code p \u003e 1}.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 56,col 9)",
        "(line 57,col 9)-(line 59,col 9)",
        "(line 61,col 9)-(line 61,col 33)",
        "(line 62,col 9)-(line 62,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistribution.getNumberOfTrials()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Access the number of trials for this distribution.\n     *\n     * @return the number of trials.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistribution.getProbabilityOfSuccess()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Access the probability of success for this distribution.\n     *\n     * @return the probability of success.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistribution.getDomainLowerBound(double)",
      "begin_line": 84,
      "end_line": 87,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistribution.getDomainUpperBound(double)",
      "begin_line": 90,
      "end_line": 93,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistribution.cumulativeProbability(int)",
      "begin_line": 96,
      "end_line": 108,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 19)",
        "(line 99,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistribution.probability(int)",
      "begin_line": 111,
      "end_line": 121,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 19)",
        "(line 113,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistribution.inverseCumulativeProbability(double)",
      "begin_line": 129,
      "end_line": 141,
      "comment": "\n     * {@inheritDoc}\n     *\n     * This implementation return -1 when {@code p \u003d\u003d 0} and\n     * {@code Integer.MAX_VALUE} when {@code p \u003d\u003d 1}.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 137,col 9)",
        "(line 140,col 9)-(line 140,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistribution.getSupportLowerBound()",
      "begin_line": 151,
      "end_line": 154,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the number of trials\n     * and probability parameter.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistribution.getSupportUpperBound()",
      "begin_line": 163,
      "end_line": 166,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is the number of trials.\n     *\n     * @return upper bound of the support (equal to number of trials)\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistribution.calculateNumericalMean()",
      "begin_line": 174,
      "end_line": 177,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For {@code n} trials and probability parameter {@code p}, the mean is\n     * {@code n * p}.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistribution.calculateNumericalVariance()",
      "begin_line": 185,
      "end_line": 189,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For {@code n} trials and probability parameter {@code p}, the variance is\n     * {@code n * p * (1 - p)}.\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 51)",
        "(line 188,col 9)-(line 188,col 49)"
      ]
    }
  ]
}