{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/BinomialDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BinomialDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractIntegerDistribution"
      ],
      "begin_line": 34,
      "end_line": 182,
      "comment": "\n * Implementation of the binomial distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Binomial_distribution\"\u003eBinomial distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/BinomialDistribution.html\"\u003eBinomial Distribution (MathWorld)\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfTrials"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The number of trials. "
    },
    {
      "type": "field",
      "varNames": [
        "probabilityOfSuccess"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The probability of success. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.BinomialDistribution.BinomialDistribution(int, double)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Create a binomial distribution with the given number of trials and\n     * probability of success.\n     *\n     * @param trials Number of trials.\n     * @param p Probability of success.\n     * @throws NotPositiveException if {@code trials \u003c 0}.\n     * @throws OutOfRangeException if {@code p \u003c 0} or {@code p \u003e 1}.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.BinomialDistribution.BinomialDistribution(org.apache.commons.math3.random.RandomGenerator, int, double)",
      "begin_line": 65,
      "end_line": 80,
      "comment": "\n     * Creates a binomial distribution.\n     *\n     * @param rng Random number generator.\n     * @param trials Number of trials.\n     * @param p Probability of success.\n     * @throws NotPositiveException if {@code trials \u003c 0}.\n     * @throws OutOfRangeException if {@code p \u003c 0} or {@code p \u003e 1}.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 19)",
        "(line 70,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 76,col 9)",
        "(line 78,col 9)-(line 78,col 33)",
        "(line 79,col 9)-(line 79,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BinomialDistribution.getNumberOfTrials()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Access the number of trials for this distribution.\n     *\n     * @return the number of trials.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BinomialDistribution.getProbabilityOfSuccess()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Access the probability of success for this distribution.\n     *\n     * @return the probability of success.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BinomialDistribution.probability(int)",
      "begin_line": 101,
      "end_line": 111,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 19)",
        "(line 103,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BinomialDistribution.cumulativeProbability(int)",
      "begin_line": 114,
      "end_line": 125,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 19)",
        "(line 116,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BinomialDistribution.getNumericalMean()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For {@code n} trials and probability parameter {@code p}, the mean is\n     * {@code n * p}.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BinomialDistribution.getNumericalVariance()",
      "begin_line": 143,
      "end_line": 146,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For {@code n} trials and probability parameter {@code p}, the variance is\n     * {@code n * p * (1 - p)}.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 46)",
        "(line 145,col 9)-(line 145,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BinomialDistribution.getSupportLowerBound()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 except for the probability\n     * parameter {@code p \u003d 1}.\n     *\n     * @return lower bound of the support (0 or the number of trials)\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BinomialDistribution.getSupportUpperBound()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is the number of trials except for the\n     * probability parameter {@code p \u003d 0}.\n     *\n     * @return upper bound of the support (number of trials or 0)\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BinomialDistribution.isSupportConnected()",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 20)"
      ]
    }
  ]
}