{
  "filepath": "/tmp/Math-58b/src/main/java/org/apache/commons/math/distribution/BinomialDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BinomialDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractIntegerDistribution",
        "org.apache.commons.math.distribution.BinomialDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 221,
      "comment": "\n * The default implementation of {@link BinomialDistribution}.\n *\n * @version $Revision$ $Date$\n "
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
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.BinomialDistributionImpl(int, double)",
      "begin_line": 51,
      "end_line": 62,
      "comment": "\n     * Create a binomial distribution with the given number of trials and\n     * probability of success.\n     *\n     * @param trials Number of trials.\n     * @param p Probability of success.\n     * @throws NotPositiveException if {@code trials \u003c 0}.\n     * @throws OutOfRangeException if {@code p \u003c 0} or {@code p \u003e 1}.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 55,col 9)",
        "(line 56,col 9)-(line 58,col 9)",
        "(line 60,col 9)-(line 60,col 33)",
        "(line 61,col 9)-(line 61,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.getNumberOfTrials()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.getProbabilityOfSuccess()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 85,
      "end_line": 88,
      "comment": "\n     * Access the domain value lower bound, based on {@code p}, used to\n     * bracket a PDF root.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value lower bound, i.e. {@code P(X \u003c \u0027lower bound\u0027) \u003c p}.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 97,
      "end_line": 100,
      "comment": "\n     * Access the domain value upper bound, based on {@code p}, used to\n     * bracket a PDF root.\n     *\n     * @param p Desired probability for the critical value\n     * @return the domain value upper bound, i.e. {@code P(X \u003c \u0027upper bound\u0027) \u003e p}.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.cumulativeProbability(int)",
      "begin_line": 110,
      "end_line": 122,
      "comment": "\n     * For this distribution, {@code X}, this method returns {@code P(X \u003c x)}.\n     *\n     * @param x Value at which the PDF is evaluated.\n     * @return PDF for this distribution.\n     * @throws MathException if the cumulative probability can not be computed\n     * due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 19)",
        "(line 113,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.probability(int)",
      "begin_line": 130,
      "end_line": 140,
      "comment": "\n     * For this distribution, {@code X}, this method returns {@code P(X \u003d x)}.\n     *\n     * @param x Value at which the PMF is evaluated.\n     * @return PMF for this distribution.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 19)",
        "(line 132,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 153,
      "end_line": 166,
      "comment": "\n     * For this distribution, {@code X}, this method returns the largest\n     * {@code x}, such that {@code P(X \u003c x) p}.\n     * It will return -1 when p \u003d 0 and {@code Integer.MAX_VALUE} when p \u003d 1.\n     *\n     * @param p Desired probability.\n     * @return the largest {@code x} such that {@code P(X \u003c x) \u003c\u003d p}.\n     * @throws MathException if the inverse cumulative probability can not be\n     * computed due to convergence or other numerical errors.\n     * @throws OutOfRangeException if {@code p \u003c 0} or {@code p \u003e 1}.\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 165,col 9)-(line 165,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.getSupportLowerBound()",
      "begin_line": 176,
      "end_line": 179,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the number of trials\n     * and probability parameter.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.getSupportUpperBound()",
      "begin_line": 188,
      "end_line": 191,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is the number of trials.\n     *\n     * @return upper bound of the support (equal to number of trials)\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.calculateNumericalMean()",
      "begin_line": 202,
      "end_line": 205,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For \u003ccode\u003en\u003c/code\u003e number of trials and\n     * probability parameter \u003ccode\u003ep\u003c/code\u003e, the mean is\n     * \u003ccode\u003en * p\u003c/code\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.calculateNumericalVariance()",
      "begin_line": 216,
      "end_line": 220,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For \u003ccode\u003en\u003c/code\u003e number of trials and\n     * probability parameter \u003ccode\u003ep\u003c/code\u003e, the variance is\n     * \u003ccode\u003en * p * (1 - p)\u003c/code\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 51)",
        "(line 219,col 9)-(line 219,col 57)"
      ]
    }
  ]
}