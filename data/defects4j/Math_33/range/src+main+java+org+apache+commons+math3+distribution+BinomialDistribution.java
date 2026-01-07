{
  "filepath": "/tmp/Math-33b/src/main/java/org/apache/commons/math3/distribution/BinomialDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BinomialDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractIntegerDistribution"
      ],
      "begin_line": 32,
      "end_line": 162,
      "comment": "\n * Implementation of the binomial distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Binomial_distribution\"\u003eBinomial distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/BinomialDistribution.html\"\u003eBinomial Distribution (MathWorld)\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfTrials"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " The number of trials. "
    },
    {
      "type": "field",
      "varNames": [
        "probabilityOfSuccess"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The probability of success. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.BinomialDistribution.BinomialDistribution(int, double)",
      "begin_line": 49,
      "end_line": 60,
      "comment": "\n     * Create a binomial distribution with the given number of trials and\n     * probability of success.\n     *\n     * @param trials Number of trials.\n     * @param p Probability of success.\n     * @throws NotPositiveException if {@code trials \u003c 0}.\n     * @throws OutOfRangeException if {@code p \u003c 0} or {@code p \u003e 1}.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 53,col 9)",
        "(line 54,col 9)-(line 56,col 9)",
        "(line 58,col 9)-(line 58,col 33)",
        "(line 59,col 9)-(line 59,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BinomialDistribution.getNumberOfTrials()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Access the number of trials for this distribution.\n     *\n     * @return the number of trials.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BinomialDistribution.getProbabilityOfSuccess()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Access the probability of success for this distribution.\n     *\n     * @return the probability of success.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BinomialDistribution.probability(int)",
      "begin_line": 81,
      "end_line": 91,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 19)",
        "(line 83,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BinomialDistribution.cumulativeProbability(int)",
      "begin_line": 94,
      "end_line": 105,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 19)",
        "(line 96,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BinomialDistribution.getNumericalMean()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For {@code n} trials and probability parameter {@code p}, the mean is\n     * {@code n * p}.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BinomialDistribution.getNumericalVariance()",
      "begin_line": 123,
      "end_line": 126,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For {@code n} trials and probability parameter {@code p}, the variance is\n     * {@code n * p * (1 - p)}.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 46)",
        "(line 125,col 9)-(line 125,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BinomialDistribution.getSupportLowerBound()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 except for the probability\n     * parameter {@code p \u003d 1}.\n     *\n     * @return lower bound of the support (0 or the number of trials)\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BinomialDistribution.getSupportUpperBound()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is the number of trials except for the\n     * probability parameter {@code p \u003d 0}.\n     *\n     * @return upper bound of the support (number of trials or 0)\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BinomialDistribution.isSupportConnected()",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 20)"
      ]
    }
  ]
}