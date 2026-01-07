{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/HypergeometricDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HypergeometricDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractIntegerDistribution"
      ],
      "begin_line": 35,
      "end_line": 334,
      "comment": "\n * Implementation of the hypergeometric distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Hypergeometric_distribution\"\u003eHypergeometric distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/HypergeometricDistribution.html\"\u003eHypergeometric distribution (MathWorld)\u003c/a\u003e\n * @version $Id$\n "
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
        "numberOfSuccesses"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The number of successes in the population. "
    },
    {
      "type": "field",
      "varNames": [
        "populationSize"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The population size. "
    },
    {
      "type": "field",
      "varNames": [
        "sampleSize"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The sample size. "
    },
    {
      "type": "field",
      "varNames": [
        "numericalVariance"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Cached numerical variance "
    },
    {
      "type": "field",
      "varNames": [
        "numericalVarianceIsCalculated"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Whether or not the numerical variance has been calculated "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.HypergeometricDistribution(int, int, int)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Construct a new hypergeometric distribution with the specified population\n     * size, number of successes in the population, and sample size.\n     *\n     * @param populationSize Population size.\n     * @param numberOfSuccesses Number of successes in the population.\n     * @param sampleSize Sample size.\n     * @throws NotPositiveException if {@code numberOfSuccesses \u003c 0}.\n     * @throws NotStrictlyPositiveException if {@code populationSize \u003c\u003d 0}.\n     * @throws NumberIsTooLargeException if {@code numberOfSuccesses \u003e populationSize},\n     * or {@code sampleSize \u003e populationSize}.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 78)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.HypergeometricDistribution(org.apache.commons.math3.random.RandomGenerator, int, int, int)",
      "begin_line": 79,
      "end_line": 111,
      "comment": "\n     * Creates a new hypergeometric distribution.\n     *\n     * @param rng Random number generator.\n     * @param populationSize Population size.\n     * @param numberOfSuccesses Number of successes in the population.\n     * @param sampleSize Sample size.\n     * @throws NotPositiveException if {@code numberOfSuccesses \u003c 0}.\n     * @throws NotStrictlyPositiveException if {@code populationSize \u003c\u003d 0}.\n     * @throws NumberIsTooLargeException if {@code numberOfSuccesses \u003e populationSize},\n     * or {@code sampleSize \u003e populationSize}.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 19)",
        "(line 86,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 97,col 9)",
        "(line 99,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 106,col 9)",
        "(line 108,col 9)-(line 108,col 51)",
        "(line 109,col 9)-(line 109,col 45)",
        "(line 110,col 9)-(line 110,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.cumulativeProbability(int)",
      "begin_line": 114,
      "end_line": 127,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 19)",
        "(line 117,col 9)-(line 117,col 80)",
        "(line 118,col 9)-(line 124,col 9)",
        "(line 126,col 9)-(line 126,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.getDomain(int, int, int)",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * Return the domain for the given hypergeometric distribution parameters.\n     *\n     * @param n Population size.\n     * @param m Number of successes in the population.\n     * @param k Sample size.\n     * @return a two element array containing the lower and upper bounds of the\n     * hypergeometric distribution.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.getLowerDomain(int, int, int)",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * Return the lowest domain value for the given hypergeometric distribution\n     * parameters.\n     *\n     * @param n Population size.\n     * @param m Number of successes in the population.\n     * @param k Sample size.\n     * @return the lowest domain value of the hypergeometric distribution.\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.getNumberOfSuccesses()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * Access the number of successes.\n     *\n     * @return the number of successes.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.getPopulationSize()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Access the population size.\n     *\n     * @return the population size.\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.getSampleSize()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * Access the sample size.\n     *\n     * @return the sample size.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.getUpperDomain(int, int)",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * Return the highest domain value for the given hypergeometric distribution\n     * parameters.\n     *\n     * @param m Number of successes in the population.\n     * @param k Sample size.\n     * @return the highest domain value of the hypergeometric distribution.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.probability(int)",
      "begin_line": 195,
      "end_line": 215,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 19)",
        "(line 198,col 9)-(line 198,col 80)",
        "(line 199,col 9)-(line 212,col 9)",
        "(line 214,col 9)-(line 214,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.upperCumulativeProbability(int)",
      "begin_line": 224,
      "end_line": 237,
      "comment": "\n     * For this distribution, {@code X}, this method returns {@code P(X \u003e\u003d x)}.\n     *\n     * @param x Value at which the CDF is evaluated.\n     * @return the upper tail CDF for this distribution.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 19)",
        "(line 227,col 9)-(line 227,col 86)",
        "(line 228,col 9)-(line 234,col 9)",
        "(line 236,col 9)-(line 236,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.innerCumulativeProbability(int, int, int)",
      "begin_line": 252,
      "end_line": 259,
      "comment": "\n     * For this distribution, {@code X}, this method returns\n     * {@code P(x0 \u003c\u003d X \u003c\u003d x1)}.\n     * This probability is computed by summing the point probabilities for the\n     * values {@code x0, x0 + 1, x0 + 2, ..., x1}, in the order directed by\n     * {@code dx}.\n     *\n     * @param x0 Inclusive lower bound.\n     * @param x1 Inclusive upper bound.\n     * @param dx Direction of summation (1 indicates summing from x0 to x1, and\n     * 0 indicates summing from x1 to x0).\n     * @return {@code P(x0 \u003c\u003d X \u003c\u003d x1)}.\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 37)",
        "(line 254,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 258,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.getNumericalMean()",
      "begin_line": 267,
      "end_line": 269,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For population size {@code N}, number of successes {@code m}, and sample\n     * size {@code n}, the mean is {@code n * m / N}.\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.getNumericalVariance()",
      "begin_line": 278,
      "end_line": 284,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For population size {@code N}, number of successes {@code m}, and sample\n     * size {@code n}, the variance is\n     * {@code [n * m * (N - n) * (N - m)] / [N^2 * (N - 1)]}.\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 283,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.calculateNumericalVariance()",
      "begin_line": 291,
      "end_line": 296,
      "comment": "\n     * Used by {@link #getNumericalVariance()}.\n     *\n     * @return the variance of this distribution\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 45)",
        "(line 293,col 9)-(line 293,col 48)",
        "(line 294,col 9)-(line 294,col 41)",
        "(line 295,col 9)-(line 295,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.getSupportLowerBound()",
      "begin_line": 307,
      "end_line": 310,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For population size {@code N}, number of successes {@code m}, and sample\n     * size {@code n}, the lower bound of the support is\n     * {@code max(0, n + m - N)}.\n     *\n     * @return lower bound of the support\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 309,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.getSupportUpperBound()",
      "begin_line": 320,
      "end_line": 322,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For number of successes {@code m} and sample size {@code n}, the upper\n     * bound of the support is {@code min(m, n)}.\n     *\n     * @return upper bound of the support\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.isSupportConnected()",
      "begin_line": 331,
      "end_line": 333,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 20)"
      ]
    }
  ]
}