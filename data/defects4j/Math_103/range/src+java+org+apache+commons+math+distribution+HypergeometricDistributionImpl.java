{
  "filepath": "/tmp/Math-103b/src/java/org/apache/commons/math/distribution/HypergeometricDistributionImpl.java",
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
      "end_line": 306,
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
      "end_line": 91,
      "comment": "\n     * For this disbution, X, this method returns P(X \u0026le; x).\n     * @param x the value at which the PDF is evaluated.\n     * @return PDF for this distribution. \n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 19)",
        "(line 77,col 9)-(line 77,col 36)",
        "(line 78,col 9)-(line 78,col 39)",
        "(line 79,col 9)-(line 79,col 32)",
        "(line 81,col 9)-(line 81,col 42)",
        "(line 82,col 9)-(line 88,col 9)",
        "(line 90,col 9)-(line 90,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getDomain(int, int, int)",
      "begin_line": 101,
      "end_line": 106,
      "comment": "\n     * Return the domain for the given hypergeometric distribution parameters.\n     * @param n the population size.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @return a two element array containing the lower and upper bounds of the\n     *         hypergeometric distribution.  \n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 105,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 116,
      "end_line": 119,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.\n     * \n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e \n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 118,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.\n     * \n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e \n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getLowerDomain(int, int, int)",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * Return the lowest domain value for the given hypergeometric distribution\n     * parameters.\n     * @param n the population size.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @return the lowest domain value of the hypergeometric distribution.  \n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getNumberOfSuccesses()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * Access the number of successes.\n     * @return the number of successes.\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getPopulationSize()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * Access the population size.\n     * @return the population size.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getSampleSize()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Access the sample size.\n     * @return the sample size.\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getUpperDomain(int, int)",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * Return the highest domain value for the given hypergeometric distribution\n     * parameters.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @return the highest domain value of the hypergeometric distribution.  \n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.probability(int)",
      "begin_line": 186,
      "end_line": 201,
      "comment": "\n     * For this disbution, X, this method returns P(X \u003d x).\n     * \n     * @param x the value at which the PMF is evaluated.\n     * @return PMF for this distribution. \n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 19)",
        "(line 189,col 9)-(line 189,col 36)",
        "(line 190,col 9)-(line 190,col 39)",
        "(line 191,col 9)-(line 191,col 32)",
        "(line 193,col 9)-(line 193,col 42)",
        "(line 194,col 9)-(line 198,col 9)",
        "(line 200,col 9)-(line 200,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.probability(int, int, int, int)",
      "begin_line": 213,
      "end_line": 217,
      "comment": "\n     * For the disbution, X, defined by the given hypergeometric distribution\n     * parameters, this method returns P(X \u003d x).\n     * \n     * @param n the population size.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @param x the value at which the PMF is evaluated.\n     * @return PMF for the distribution. \n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 216,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.setNumberOfSuccesses(int)",
      "begin_line": 224,
      "end_line": 230,
      "comment": "\n     * Modify the number of successes.\n     * @param num the new number of successes.\n     * @throws IllegalArgumentException if \u003ccode\u003enum\u003c/code\u003e is negative.\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 229,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.setPopulationSize(int)",
      "begin_line": 237,
      "end_line": 243,
      "comment": "\n     * Modify the population size.\n     * @param size the new population size.\n     * @throws IllegalArgumentException if \u003ccode\u003esize\u003c/code\u003e is not positive.\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 242,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.setSampleSize(int)",
      "begin_line": 250,
      "end_line": 256,
      "comment": "\n     * Modify the sample size.\n     * @param size the new sample size.\n     * @throws IllegalArgumentException if \u003ccode\u003esize\u003c/code\u003e is negative.\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.upperCumulativeProbability(int)",
      "begin_line": 264,
      "end_line": 281,
      "comment": "\n     * For this disbution, X, this method returns P(X \u0026ge; x).\n     * @param x the value at which the CDF is evaluated.\n     * @return upper tail CDF for this distribution.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 19)",
        "(line 267,col 9)-(line 267,col 36)",
        "(line 268,col 9)-(line 268,col 39)",
        "(line 269,col 9)-(line 269,col 32)",
        "(line 271,col 9)-(line 271,col 42)",
        "(line 272,col 9)-(line 278,col 9)",
        "(line 280,col 9)-(line 280,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.innerCumulativeProbability(int, int, int, int, int, int)",
      "begin_line": 296,
      "end_line": 305,
      "comment": "\n     * For this disbution, X, this method returns P(x0 \u0026le; X \u0026le; x1).  This\n     * probability is computed by summing the point probabilities for the values\n     * x0, x0 + 1, x0 + 2, ..., x1, in the order directed by dx. \n     * @param x0 the inclusive, lower bound\n     * @param x1 the inclusive, upper bound\n     * @param dx the direction of summation. 1 indicates summing from x0 to x1.\n     *           0 indicates summing from x1 to x0.\n     * @param n the population size.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @return P(x0 \u0026le; X \u0026le; x1). \n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 46)",
        "(line 300,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 304,col 19)"
      ]
    }
  ]
}