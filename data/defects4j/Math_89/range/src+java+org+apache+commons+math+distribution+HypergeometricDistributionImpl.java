{
  "filepath": "/tmp/Math-89b/src/java/org/apache/commons/math/distribution/HypergeometricDistributionImpl.java",
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
      "begin_line": 29,
      "end_line": 309,
      "comment": "\n * The default implementation of {@link HypergeometricDistribution}.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfSuccesses"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The number of successes in the population. "
    },
    {
      "type": "field",
      "varNames": [
        "populationSize"
      ],
      "begin_line": 40,
      "end_line": 40,
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
      "begin_line": 52,
      "end_line": 67,
      "comment": "\n     * Construct a new hypergeometric distribution with the given the population\n     * size, the number of successes in the population, and the sample size.\n     * @param populationSize the population size.\n     * @param numberOfSuccesses number of successes in the population.\n     * @param sampleSize the sample size.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 16)",
        "(line 55,col 9)-(line 59,col 9)",
        "(line 60,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 64,col 42)",
        "(line 65,col 9)-(line 65,col 34)",
        "(line 66,col 9)-(line 66,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.cumulativeProbability(int)",
      "begin_line": 74,
      "end_line": 92,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026le; x).\n     * @param x the value at which the PDF is evaluated.\n     * @return PDF for this distribution. \n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 19)",
        "(line 78,col 9)-(line 78,col 36)",
        "(line 79,col 9)-(line 79,col 39)",
        "(line 80,col 9)-(line 80,col 32)",
        "(line 82,col 9)-(line 82,col 42)",
        "(line 83,col 9)-(line 89,col 9)",
        "(line 91,col 9)-(line 91,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getDomain(int, int, int)",
      "begin_line": 102,
      "end_line": 107,
      "comment": "\n     * Return the domain for the given hypergeometric distribution parameters.\n     * @param n the population size.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @return a two element array containing the lower and upper bounds of the\n     *         hypergeometric distribution.  \n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 106,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 117,
      "end_line": 121,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.\n     * \n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e \n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 120,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 131,
      "end_line": 134,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.\n     * \n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e \n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getLowerDomain(int, int, int)",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * Return the lowest domain value for the given hypergeometric distribution\n     * parameters.\n     * @param n the population size.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @return the lowest domain value of the hypergeometric distribution.  \n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getNumberOfSuccesses()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Access the number of successes.\n     * @return the number of successes.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getPopulationSize()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * Access the population size.\n     * @return the population size.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getSampleSize()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n     * Access the sample size.\n     * @return the sample size.\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getUpperDomain(int, int)",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\n     * Return the highest domain value for the given hypergeometric distribution\n     * parameters.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @return the highest domain value of the hypergeometric distribution.  \n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.probability(int)",
      "begin_line": 189,
      "end_line": 204,
      "comment": "\n     * For this distribution, X, this method returns P(X \u003d x).\n     * \n     * @param x the value at which the PMF is evaluated.\n     * @return PMF for this distribution. \n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 19)",
        "(line 192,col 9)-(line 192,col 36)",
        "(line 193,col 9)-(line 193,col 39)",
        "(line 194,col 9)-(line 194,col 32)",
        "(line 196,col 9)-(line 196,col 42)",
        "(line 197,col 9)-(line 201,col 9)",
        "(line 203,col 9)-(line 203,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.probability(int, int, int, int)",
      "begin_line": 216,
      "end_line": 220,
      "comment": "\n     * For the distribution, X, defined by the given hypergeometric distribution\n     * parameters, this method returns P(X \u003d x).\n     * \n     * @param n the population size.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @param x the value at which the PMF is evaluated.\n     * @return PMF for the distribution. \n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 219,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.setNumberOfSuccesses(int)",
      "begin_line": 227,
      "end_line": 233,
      "comment": "\n     * Modify the number of successes.\n     * @param num the new number of successes.\n     * @throws IllegalArgumentException if \u003ccode\u003enum\u003c/code\u003e is negative.\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.setPopulationSize(int)",
      "begin_line": 240,
      "end_line": 246,
      "comment": "\n     * Modify the population size.\n     * @param size the new population size.\n     * @throws IllegalArgumentException if \u003ccode\u003esize\u003c/code\u003e is not positive.\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.setSampleSize(int)",
      "begin_line": 253,
      "end_line": 259,
      "comment": "\n     * Modify the sample size.\n     * @param size the new sample size.\n     * @throws IllegalArgumentException if \u003ccode\u003esize\u003c/code\u003e is negative.\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 258,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.upperCumulativeProbability(int)",
      "begin_line": 267,
      "end_line": 284,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026ge; x).\n     * @param x the value at which the CDF is evaluated.\n     * @return upper tail CDF for this distribution.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 19)",
        "(line 270,col 9)-(line 270,col 36)",
        "(line 271,col 9)-(line 271,col 39)",
        "(line 272,col 9)-(line 272,col 32)",
        "(line 274,col 9)-(line 274,col 42)",
        "(line 275,col 9)-(line 281,col 9)",
        "(line 283,col 9)-(line 283,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.innerCumulativeProbability(int, int, int, int, int, int)",
      "begin_line": 299,
      "end_line": 308,
      "comment": "\n     * For this distribution, X, this method returns P(x0 \u0026le; X \u0026le; x1).  This\n     * probability is computed by summing the point probabilities for the values\n     * x0, x0 + 1, x0 + 2, ..., x1, in the order directed by dx. \n     * @param x0 the inclusive, lower bound\n     * @param x1 the inclusive, upper bound\n     * @param dx the direction of summation. 1 indicates summing from x0 to x1.\n     *           0 indicates summing from x1 to x0.\n     * @param n the population size.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @return P(x0 \u0026le; X \u0026le; x1). \n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 46)",
        "(line 303,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 307,col 19)"
      ]
    }
  ]
}