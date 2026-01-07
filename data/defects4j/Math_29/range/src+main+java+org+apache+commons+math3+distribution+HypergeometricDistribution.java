{
  "filepath": "/tmp/Math-29b/src/main/java/org/apache/commons/math3/distribution/HypergeometricDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HypergeometricDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractIntegerDistribution"
      ],
      "begin_line": 33,
      "end_line": 314,
      "comment": "\n * Implementation of the hypergeometric distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Hypergeometric_distribution\"\u003eHypergeometric distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/HypergeometricDistribution.html\"\u003eHypergeometric distribution (MathWorld)\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfSuccesses"
      ],
      "begin_line": 38,
      "end_line": 38,
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
      "begin_line": 44,
      "end_line": 44,
      "comment": " The sample size. "
    },
    {
      "type": "field",
      "varNames": [
        "numericalVariance"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Cached numerical variance "
    },
    {
      "type": "field",
      "varNames": [
        "numericalVarianceIsCalculated"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Whether or not the numerical variance has been calculated "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.HypergeometricDistribution(int, int, int)",
      "begin_line": 64,
      "end_line": 91,
      "comment": "\n     * Construct a new hypergeometric distribution with the specified population\n     * size, number of successes in the population, and sample size.\n     *\n     * @param populationSize Population size.\n     * @param numberOfSuccesses Number of successes in the population.\n     * @param sampleSize Sample size.\n     * @throws NotPositiveException if {@code numberOfSuccesses \u003c 0}.\n     * @throws NotStrictlyPositiveException if {@code populationSize \u003c\u003d 0}.\n     * @throws NumberIsTooLargeException if {@code numberOfSuccesses \u003e populationSize},\n     * or {@code sampleSize \u003e populationSize}.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 77,col 9)",
        "(line 79,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 86,col 9)",
        "(line 88,col 9)-(line 88,col 51)",
        "(line 89,col 9)-(line 89,col 45)",
        "(line 90,col 9)-(line 90,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.cumulativeProbability(int)",
      "begin_line": 94,
      "end_line": 107,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 19)",
        "(line 97,col 9)-(line 97,col 80)",
        "(line 98,col 9)-(line 104,col 9)",
        "(line 106,col 9)-(line 106,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.getDomain(int, int, int)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Return the domain for the given hypergeometric distribution parameters.\n     *\n     * @param n Population size.\n     * @param m Number of successes in the population.\n     * @param k Sample size.\n     * @return a two element array containing the lower and upper bounds of the\n     * hypergeometric distribution.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.getLowerDomain(int, int, int)",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * Return the lowest domain value for the given hypergeometric distribution\n     * parameters.\n     *\n     * @param n Population size.\n     * @param m Number of successes in the population.\n     * @param k Sample size.\n     * @return the lowest domain value of the hypergeometric distribution.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.getNumberOfSuccesses()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * Access the number of successes.\n     *\n     * @return the number of successes.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.getPopulationSize()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * Access the population size.\n     *\n     * @return the population size.\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.getSampleSize()",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * Access the sample size.\n     *\n     * @return the sample size.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.getUpperDomain(int, int)",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * Return the highest domain value for the given hypergeometric distribution\n     * parameters.\n     *\n     * @param m Number of successes in the population.\n     * @param k Sample size.\n     * @return the highest domain value of the hypergeometric distribution.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.probability(int)",
      "begin_line": 175,
      "end_line": 195,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 19)",
        "(line 178,col 9)-(line 178,col 80)",
        "(line 179,col 9)-(line 192,col 9)",
        "(line 194,col 9)-(line 194,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.upperCumulativeProbability(int)",
      "begin_line": 204,
      "end_line": 217,
      "comment": "\n     * For this distribution, {@code X}, this method returns {@code P(X \u003e\u003d x)}.\n     *\n     * @param x Value at which the CDF is evaluated.\n     * @return the upper tail CDF for this distribution.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 19)",
        "(line 207,col 9)-(line 207,col 86)",
        "(line 208,col 9)-(line 214,col 9)",
        "(line 216,col 9)-(line 216,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.innerCumulativeProbability(int, int, int)",
      "begin_line": 232,
      "end_line": 239,
      "comment": "\n     * For this distribution, {@code X}, this method returns\n     * {@code P(x0 \u003c\u003d X \u003c\u003d x1)}.\n     * This probability is computed by summing the point probabilities for the\n     * values {@code x0, x0 + 1, x0 + 2, ..., x1}, in the order directed by\n     * {@code dx}.\n     *\n     * @param x0 Inclusive lower bound.\n     * @param x1 Inclusive upper bound.\n     * @param dx Direction of summation (1 indicates summing from x0 to x1, and\n     * 0 indicates summing from x1 to x0).\n     * @return {@code P(x0 \u003c\u003d X \u003c\u003d x1)}.\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 37)",
        "(line 234,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.getNumericalMean()",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For population size {@code N}, number of successes {@code m}, and sample\n     * size {@code n}, the mean is {@code n * m / N}.\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.getNumericalVariance()",
      "begin_line": 258,
      "end_line": 264,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For population size {@code N}, number of successes {@code m}, and sample\n     * size {@code n}, the variance is\n     * {@code [n * m * (N - n) * (N - m)] / [N^2 * (N - 1)]}.\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.calculateNumericalVariance()",
      "begin_line": 271,
      "end_line": 276,
      "comment": "\n     * Used by {@link #getNumericalVariance()}.\n     *\n     * @return the variance of this distribution\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 45)",
        "(line 273,col 9)-(line 273,col 48)",
        "(line 274,col 9)-(line 274,col 41)",
        "(line 275,col 9)-(line 275,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.getSupportLowerBound()",
      "begin_line": 287,
      "end_line": 290,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For population size {@code N}, number of successes {@code m}, and sample\n     * size {@code n}, the lower bound of the support is\n     * {@code max(0, n + m - N)}.\n     *\n     * @return lower bound of the support\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 289,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.getSupportUpperBound()",
      "begin_line": 300,
      "end_line": 302,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For number of successes {@code m} and sample size {@code n}, the upper\n     * bound of the support is {@code min(m, n)}.\n     *\n     * @return upper bound of the support\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistribution.isSupportConnected()",
      "begin_line": 311,
      "end_line": 313,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 20)"
      ]
    }
  ]
}