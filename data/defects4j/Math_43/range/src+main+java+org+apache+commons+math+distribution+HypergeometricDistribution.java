{
  "filepath": "/tmp/Math-43b/src/main/java/org/apache/commons/math/distribution/HypergeometricDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HypergeometricDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractIntegerDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 36,
      "end_line": 329,
      "comment": "\n * Implementation of the hypergeometric distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Hypergeometric_distribution\"\u003eHypergeometric distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/HypergeometricDistribution.html\"\u003eHypergeometric distribution (MathWorld)\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfSuccesses"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The number of successes in the population. "
    },
    {
      "type": "field",
      "varNames": [
        "populationSize"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The population size. "
    },
    {
      "type": "field",
      "varNames": [
        "sampleSize"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The sample size. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistribution.HypergeometricDistribution(int, int, int)",
      "begin_line": 60,
      "end_line": 91,
      "comment": "\n     * Construct a new hypergeometric distribution with the specified population\n     * size, number of successes in the population, and sample size.\n     *\n     * @param populationSize Population size.\n     * @param numberOfSuccesses Number of successes in the population.\n     * @param sampleSize Sample size.\n     * @throws NotPositiveException if {@code numberOfSuccesses \u003c 0},\n     * or {@code populationSize \u003c 0}.\n     * @throws NotStrictlyPositiveException if {@code populationSize \u003c\u003d 0}.\n     * @throws NumberIsTooLargeException if {@code numberOfSuccesses \u003e populationSize},\n     * or {@code sampleSize \u003e populationSize}.\n     ",
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
      "signature": "org.apache.commons.math.distribution.HypergeometricDistribution.cumulativeProbability(int)",
      "begin_line": 94,
      "end_line": 109,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 19)",
        "(line 98,col 9)-(line 98,col 80)",
        "(line 99,col 9)-(line 106,col 9)",
        "(line 108,col 9)-(line 108,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistribution.getDomain(int, int, int)",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * Return the domain for the given hypergeometric distribution parameters.\n     *\n     * @param n Population size.\n     * @param m Number of successes in the population.\n     * @param k Sample size.\n     * @return a two element array containing the lower and upper bounds of the\n     * hypergeometric distribution.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistribution.getDomainLowerBound(double)",
      "begin_line": 125,
      "end_line": 128,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistribution.getDomainUpperBound(double)",
      "begin_line": 131,
      "end_line": 134,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistribution.getLowerDomain(int, int, int)",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * Return the lowest domain value for the given hypergeometric distribution\n     * parameters.\n     *\n     * @param n Population size.\n     * @param m Number of successes in the population.\n     * @param k Sample size.\n     * @return the lowest domain value of the hypergeometric distribution.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistribution.getNumberOfSuccesses()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Access the number of successes.\n     *\n     * @return the number of successes.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistribution.getPopulationSize()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * Access the population size.\n     *\n     * @return the population size.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistribution.getSampleSize()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * Access the sample size.\n     *\n     * @return the sample size.\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistribution.getUpperDomain(int, int)",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\n     * Return the highest domain value for the given hypergeometric distribution\n     * parameters.\n     *\n     * @param m Number of successes in the population.\n     * @param k Sample size.\n     * @return the highest domain value of the hypergeometric distribution.\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistribution.probability(int)",
      "begin_line": 189,
      "end_line": 209,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 19)",
        "(line 192,col 9)-(line 192,col 80)",
        "(line 193,col 9)-(line 206,col 9)",
        "(line 208,col 9)-(line 208,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistribution.probability(int, int, int, int)",
      "begin_line": 221,
      "end_line": 225,
      "comment": "\n     * For this distribution, {@code X}, defined by the given hypergeometric\n     * distribution parameters, this method returns {@code P(X \u003d x)}.\n     *\n     * @param x Value at which the PMF is evaluated.\n     * @param n the population size.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @return PMF for the distribution.\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 224,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistribution.upperCumulativeProbability(int)",
      "begin_line": 234,
      "end_line": 248,
      "comment": "\n     * For this distribution, {@code X}, this method returns {@code P(X \u003e\u003d x)}.\n     *\n     * @param x Value at which the CDF is evaluated.\n     * @return the upper tail CDF for this distribution.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 19)",
        "(line 237,col 9)-(line 237,col 86)",
        "(line 238,col 9)-(line 245,col 9)",
        "(line 247,col 9)-(line 247,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistribution.innerCumulativeProbability(int, int, int, int, int, int)",
      "begin_line": 266,
      "end_line": 274,
      "comment": "\n     * For this distribution, {@code X}, this method returns\n     * {@code P(x0 \u003c\u003d X \u003c\u003d x1)}.\n     * This probability is computed by summing the point probabilities for the\n     * values {@code x0, x0 + 1, x0 + 2, ..., x1}, in the order directed by\n     * {@code dx}.\n     *\n     * @param x0 Inclusive lower bound.\n     * @param x1 Inclusive upper bound.\n     * @param dx Direction of summation (1 indicates summing from x0 to x1, and\n     * 0 indicates summing from x1 to x0).\n     * @param n the population size.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @return {@code P(x0 \u003c\u003d X \u003c\u003d x1)}.\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 46)",
        "(line 269,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 273,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistribution.getSupportLowerBound()",
      "begin_line": 285,
      "end_line": 289,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For population size {@code N}, number of successes {@code m}, and sample\n     * size {@code n}, the lower bound of the support is\n     * {@code max(0, n + m - N)}.\n     *\n     * @return lower bound of the support\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 288,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistribution.getSupportUpperBound()",
      "begin_line": 299,
      "end_line": 302,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For number of successes {@code m} and sample size {@code n}, the upper\n     * bound of the support is {@code min(m, n)}.\n     *\n     * @return upper bound of the support\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistribution.calculateNumericalMean()",
      "begin_line": 310,
      "end_line": 313,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For population size {@code N}, number of successes {@code m}, and sample\n     * size {@code n}, the mean is {@code n * m / N}.\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistribution.calculateNumericalVariance()",
      "begin_line": 322,
      "end_line": 328,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For population size {@code N}, number of successes {@code m}, and sample\n     * size {@code n}, the variance is\n     * {@code [n * m * (N - n) * (N - m)] / [N^2 * (N - 1)]}.\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 45)",
        "(line 325,col 9)-(line 325,col 48)",
        "(line 326,col 9)-(line 326,col 41)",
        "(line 327,col 9)-(line 327,col 67)"
      ]
    }
  ]
}