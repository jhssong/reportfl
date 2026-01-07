{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/distribution/HypergeometricDistributionImpl.java",
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
      "begin_line": 28,
      "end_line": 305,
      "comment": "\n * The default implementation of {@link HypergeometricDistribution}.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfSuccesses"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " The number of successes in the population. "
    },
    {
      "type": "field",
      "varNames": [
        "populationSize"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The population size. "
    },
    {
      "type": "field",
      "varNames": [
        "sampleSize"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The sample size. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.HypergeometricDistributionImpl(int, int, int)",
      "begin_line": 51,
      "end_line": 66,
      "comment": "\n     * Construct a new hypergeometric distribution with the given the population\n     * size, the number of successes in the population, and the sample size.\n     * @param populationSize the population size.\n     * @param numberOfSuccesses number of successes in the population.\n     * @param sampleSize the sample size.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 16)",
        "(line 54,col 9)-(line 58,col 9)",
        "(line 59,col 9)-(line 62,col 9)",
        "(line 63,col 9)-(line 63,col 42)",
        "(line 64,col 9)-(line 64,col 34)",
        "(line 65,col 9)-(line 65,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.cumulativeProbability(int)",
      "begin_line": 73,
      "end_line": 90,
      "comment": "\n     * For this disbution, X, this method returns P(X \u0026le; x).\n     * @param x the value at which the PDF is evaluated.\n     * @return PDF for this distribution. \n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 19)",
        "(line 76,col 9)-(line 76,col 36)",
        "(line 77,col 9)-(line 77,col 39)",
        "(line 78,col 9)-(line 78,col 32)",
        "(line 80,col 9)-(line 80,col 42)",
        "(line 81,col 9)-(line 87,col 9)",
        "(line 89,col 9)-(line 89,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getDomain(int, int, int)",
      "begin_line": 100,
      "end_line": 105,
      "comment": "\n     * Return the domain for the given hypergeometric distribution parameters.\n     * @param n the population size.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @return a two element array containing the lower and upper bounds of the\n     *         hypergeometric distribution.  \n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 104,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 115,
      "end_line": 118,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.\n     * \n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e \n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 117,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.\n     * \n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e \n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getLowerDomain(int, int, int)",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * Return the lowest domain value for the given hypergeometric distribution\n     * parameters.\n     * @param n the population size.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @return the lowest domain value of the hypergeometric distribution.  \n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getNumberOfSuccesses()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * Access the number of successes.\n     * @return the number of successes.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getPopulationSize()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * Access the population size.\n     * @return the population size.\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getSampleSize()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * Access the sample size.\n     * @return the sample size.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getUpperDomain(int, int)",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\n     * Return the highest domain value for the given hypergeometric distribution\n     * parameters.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @return the highest domain value of the hypergeometric distribution.  \n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.probability(int)",
      "begin_line": 185,
      "end_line": 200,
      "comment": "\n     * For this disbution, X, this method returns P(X \u003d x).\n     * \n     * @param x the value at which the PMF is evaluated.\n     * @return PMF for this distribution. \n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 19)",
        "(line 188,col 9)-(line 188,col 36)",
        "(line 189,col 9)-(line 189,col 39)",
        "(line 190,col 9)-(line 190,col 32)",
        "(line 192,col 9)-(line 192,col 42)",
        "(line 193,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 199,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.probability(int, int, int, int)",
      "begin_line": 212,
      "end_line": 216,
      "comment": "\n     * For the disbution, X, defined by the given hypergeometric distribution\n     * parameters, this method returns P(X \u003d x).\n     * \n     * @param n the population size.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @param x the value at which the PMF is evaluated.\n     * @return PMF for the distribution. \n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 215,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.setNumberOfSuccesses(int)",
      "begin_line": 223,
      "end_line": 229,
      "comment": "\n     * Modify the number of successes.\n     * @param num the new number of successes.\n     * @throws IllegalArgumentException if \u003ccode\u003enum\u003c/code\u003e is negative.\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.setPopulationSize(int)",
      "begin_line": 236,
      "end_line": 242,
      "comment": "\n     * Modify the population size.\n     * @param size the new population size.\n     * @throws IllegalArgumentException if \u003ccode\u003esize\u003c/code\u003e is not positive.\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.setSampleSize(int)",
      "begin_line": 249,
      "end_line": 255,
      "comment": "\n     * Modify the sample size.\n     * @param size the new sample size.\n     * @throws IllegalArgumentException if \u003ccode\u003esize\u003c/code\u003e is negative.\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 254,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.upperCumulativeProbability(int)",
      "begin_line": 263,
      "end_line": 280,
      "comment": "\n     * For this disbution, X, this method returns P(X \u0026ge; x).\n     * @param x the value at which the CDF is evaluated.\n     * @return upper tail CDF for this distribution.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 19)",
        "(line 266,col 9)-(line 266,col 36)",
        "(line 267,col 9)-(line 267,col 39)",
        "(line 268,col 9)-(line 268,col 32)",
        "(line 270,col 9)-(line 270,col 42)",
        "(line 271,col 9)-(line 277,col 9)",
        "(line 279,col 9)-(line 279,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.innerCumulativeProbability(int, int, int, int, int, int)",
      "begin_line": 295,
      "end_line": 304,
      "comment": "\n     * For this disbution, X, this method returns P(x0 \u0026le; X \u0026le; x1).  This\n     * probability is computed by summing the point probabilities for the values\n     * x0, x0 + 1, x0 + 2, ..., x1, in the order directed by dx. \n     * @param x0 the inclusive, lower bound\n     * @param x1 the inclusive, upper bound\n     * @param dx the direction of summation. 1 indicates summing from x0 to x1.\n     *           0 indicates summing from x1 to x0.\n     * @param n the population size.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @return P(x0 \u0026le; X \u0026le; x1). \n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 46)",
        "(line 299,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 19)"
      ]
    }
  ]
}