{
  "filepath": "/tmp/Math-57b/src/main/java/org/apache/commons/math/distribution/HypergeometricDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HypergeometricDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractIntegerDistribution",
        "org.apache.commons.math.distribution.HypergeometricDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 34,
      "end_line": 352,
      "comment": "\n * The default implementation of {@link HypergeometricDistribution}.\n *\n * @version $Revision$ $Date$\n "
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
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.HypergeometricDistributionImpl(int, int, int)",
      "begin_line": 59,
      "end_line": 87,
      "comment": "\n     * Construct a new hypergeometric distribution with the given the\n     * population size, the number of successes in the population, and\n     * the sample size.\n     *\n     * @param populationSize Population size.\n     * @param numberOfSuccesses Number of successes in the population.\n     * @param sampleSize Sample size.\n     * @throws NotPositiveException if {@code numberOfSuccesses \u003c 0}.\n     * @throws NotStrictlyPositiveException if {@code populationSize \u003c\u003d 0}.\n     * @throws NotPositiveException if {@code populationSize \u003c 0}.\n     * @throws NumberIsTooLargeException if {@code numberOfSuccesses \u003e populationSize}.\n     * @throws NumberIsTooLargeException if {@code sampleSize \u003e populationSize}.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 73,col 9)",
        "(line 75,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 82,col 9)",
        "(line 84,col 9)-(line 84,col 51)",
        "(line 85,col 9)-(line 85,col 45)",
        "(line 86,col 9)-(line 86,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.cumulativeProbability(int)",
      "begin_line": 95,
      "end_line": 110,
      "comment": "\n     * For this distribution, {@code X}, this method returns {@code P(X \u003c x)}.\n     *\n     * @param x Value at which the PDF is evaluated.\n     * @return PDF for this distribution.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 19)",
        "(line 99,col 9)-(line 99,col 80)",
        "(line 100,col 9)-(line 107,col 9)",
        "(line 109,col 9)-(line 109,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getDomain(int, int, int)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Return the domain for the given hypergeometric distribution parameters.\n     *\n     * @param n Population size.\n     * @param m Number of successes in the population.\n     * @param k Sample size.\n     * @return a two element array containing the lower and upper bounds of the\n     * hypergeometric distribution.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 132,
      "end_line": 135,
      "comment": "\n     * Access the domain value lower bound, based on {@code p}, used to\n     * bracket a PDF root.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value lower bound, i.e. {@code P(X \u003c \u0027lower bound\u0027) \u003c p}.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 144,
      "end_line": 147,
      "comment": "\n     * Access the domain value upper bound, based on {@code p}, used to\n     * bracket a PDF root.\n     *\n     * @param p Desired probability for the critical value\n     * @return the domain value upper bound, i.e. {@code P(X \u003c \u0027upper bound\u0027) \u003e p}.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getLowerDomain(int, int, int)",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * Return the lowest domain value for the given hypergeometric distribution\n     * parameters.\n     *\n     * @param n Population size.\n     * @param m Number of successes in the population.\n     * @param k Sample size.\n     * @return the lowest domain value of the hypergeometric distribution.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getNumberOfSuccesses()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getPopulationSize()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getSampleSize()",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getUpperDomain(int, int)",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n     * Return the highest domain value for the given hypergeometric distribution\n     * parameters.\n     *\n     * @param m Number of successes in the population.\n     * @param k Sample size.\n     * @return the highest domain value of the hypergeometric distribution.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.probability(int)",
      "begin_line": 201,
      "end_line": 221,
      "comment": "\n     * For this distribution, {@code X}, this method returns {@code P(X \u003d x)}.\n     *\n     * @param x Value at which the PMF is evaluated.\n     * @return PMF for this distribution.\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 19)",
        "(line 204,col 9)-(line 204,col 80)",
        "(line 205,col 9)-(line 218,col 9)",
        "(line 220,col 9)-(line 220,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.probability(int, int, int, int)",
      "begin_line": 233,
      "end_line": 237,
      "comment": "\n     * For this distribution, {@code X}, defined by the given hypergeometric\n     *  distribution parameters, this method returns {@code P(X \u003d x)}.\n     *\n     * @param x Value at which the PMF is evaluated.\n     * @param n the population size.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @return PMF for the distribution.\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 236,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.upperCumulativeProbability(int)",
      "begin_line": 246,
      "end_line": 260,
      "comment": "\n     * For this distribution, {@code X}, this method returns {@code P(X \u003e\u003d x)}.\n     *\n     * @param x Value at which the CDF is evaluated.\n     * @return the upper tail CDF for this distribution.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 19)",
        "(line 249,col 9)-(line 249,col 86)",
        "(line 250,col 9)-(line 257,col 9)",
        "(line 259,col 9)-(line 259,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.innerCumulativeProbability(int, int, int, int, int, int)",
      "begin_line": 278,
      "end_line": 286,
      "comment": "\n     * For this distribution, {@code X}, this method returns\n     * {@code P(x0 \u003c\u003d X \u003c\u003d x1)}.\n     * This probability is computed by summing the point probabilities for the\n     * values {@code x0, x0 + 1, x0 + 2, ..., x1}, in the order directed by\n     * {@code dx}.\n     *\n     * @param x0 Inclusive lower bound.\n     * @param x1 Inclusive upper bound.\n     * @param dx Direction of summation (1 indicates summing from x0 to x1, and\n     * 0 indicates summing from x1 to x0).\n     * @param n the population size.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @return {@code P(x0 \u003c\u003d X \u003c\u003d x1)}.\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 46)",
        "(line 281,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 285,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getSupportLowerBound()",
      "begin_line": 299,
      "end_line": 303,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For population size \u003ccode\u003eN\u003c/code\u003e,\n     * number of successes \u003ccode\u003em\u003c/code\u003e, and\n     * sample size \u003ccode\u003en\u003c/code\u003e,\n     * the lower bound of the support is\n     * \u003ccode\u003emax(0, n + m - N)\u003c/code\u003e\n     *\n     * @return lower bound of the support\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 302,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getSupportUpperBound()",
      "begin_line": 315,
      "end_line": 318,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For number of successes \u003ccode\u003em\u003c/code\u003e and\n     * sample size \u003ccode\u003en\u003c/code\u003e,\n     * the upper bound of the support is\n     * \u003ccode\u003emin(m, n)\u003c/code\u003e\n     *\n     * @return upper bound of the support\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.calculateNumericalMean()",
      "begin_line": 330,
      "end_line": 333,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For population size \u003ccode\u003eN\u003c/code\u003e,\n     * number of successes \u003ccode\u003em\u003c/code\u003e, and\n     * sample size \u003ccode\u003en\u003c/code\u003e, the mean is\n     * \u003ccode\u003en * m / N\u003c/code\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.calculateNumericalVariance()",
      "begin_line": 345,
      "end_line": 351,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For population size \u003ccode\u003eN\u003c/code\u003e,\n     * number of successes \u003ccode\u003em\u003c/code\u003e, and\n     * sample size \u003ccode\u003en\u003c/code\u003e, the variance is\n     * \u003ccode\u003e[ n * m * (N - n) * (N - m) ] / [ N^2 * (N - 1) ]\u003c/code\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 45)",
        "(line 348,col 9)-(line 348,col 48)",
        "(line 349,col 9)-(line 349,col 41)",
        "(line 350,col 9)-(line 350,col 67)"
      ]
    }
  ]
}