{
  "filepath": "/tmp/Math-87b/src/java/org/apache/commons/math/distribution/HypergeometricDistributionImpl.java",
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
      "begin_line": 30,
      "end_line": 314,
      "comment": "\n * The default implementation of {@link HypergeometricDistribution}.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Serializable version identifier "
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
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.HypergeometricDistributionImpl(int, int, int)",
      "begin_line": 53,
      "end_line": 69,
      "comment": "\n     * Construct a new hypergeometric distribution with the given the population\n     * size, the number of successes in the population, and the sample size.\n     * @param populationSize the population size.\n     * @param numberOfSuccesses number of successes in the population.\n     * @param sampleSize the sample size.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 16)",
        "(line 56,col 9)-(line 60,col 9)",
        "(line 61,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 66,col 42)",
        "(line 67,col 9)-(line 67,col 34)",
        "(line 68,col 9)-(line 68,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.cumulativeProbability(int)",
      "begin_line": 76,
      "end_line": 94,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026le; x).\n     * @param x the value at which the PDF is evaluated.\n     * @return PDF for this distribution. \n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 19)",
        "(line 80,col 9)-(line 80,col 36)",
        "(line 81,col 9)-(line 81,col 39)",
        "(line 82,col 9)-(line 82,col 32)",
        "(line 84,col 9)-(line 84,col 42)",
        "(line 85,col 9)-(line 91,col 9)",
        "(line 93,col 9)-(line 93,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getDomain(int, int, int)",
      "begin_line": 104,
      "end_line": 109,
      "comment": "\n     * Return the domain for the given hypergeometric distribution parameters.\n     * @param n the population size.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @return a two element array containing the lower and upper bounds of the\n     *         hypergeometric distribution.  \n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 108,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 119,
      "end_line": 123,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.\n     * \n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e \n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 122,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 133,
      "end_line": 136,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.\n     * \n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e \n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getLowerDomain(int, int, int)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * Return the lowest domain value for the given hypergeometric distribution\n     * parameters.\n     * @param n the population size.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @return the lowest domain value of the hypergeometric distribution.  \n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getNumberOfSuccesses()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Access the number of successes.\n     * @return the number of successes.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getPopulationSize()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Access the population size.\n     * @return the population size.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getSampleSize()",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * Access the sample size.\n     * @return the sample size.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getUpperDomain(int, int)",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * Return the highest domain value for the given hypergeometric distribution\n     * parameters.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @return the highest domain value of the hypergeometric distribution.  \n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.probability(int)",
      "begin_line": 191,
      "end_line": 206,
      "comment": "\n     * For this distribution, X, this method returns P(X \u003d x).\n     * \n     * @param x the value at which the PMF is evaluated.\n     * @return PMF for this distribution. \n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 19)",
        "(line 194,col 9)-(line 194,col 36)",
        "(line 195,col 9)-(line 195,col 39)",
        "(line 196,col 9)-(line 196,col 32)",
        "(line 198,col 9)-(line 198,col 42)",
        "(line 199,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 205,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.probability(int, int, int, int)",
      "begin_line": 218,
      "end_line": 222,
      "comment": "\n     * For the distribution, X, defined by the given hypergeometric distribution\n     * parameters, this method returns P(X \u003d x).\n     * \n     * @param n the population size.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @param x the value at which the PMF is evaluated.\n     * @return PMF for the distribution. \n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 221,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.setNumberOfSuccesses(int)",
      "begin_line": 229,
      "end_line": 236,
      "comment": "\n     * Modify the number of successes.\n     * @param num the new number of successes.\n     * @throws IllegalArgumentException if \u003ccode\u003enum\u003c/code\u003e is negative.\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.setPopulationSize(int)",
      "begin_line": 243,
      "end_line": 250,
      "comment": "\n     * Modify the population size.\n     * @param size the new population size.\n     * @throws IllegalArgumentException if \u003ccode\u003esize\u003c/code\u003e is not positive.\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.setSampleSize(int)",
      "begin_line": 257,
      "end_line": 264,
      "comment": "\n     * Modify the sample size.\n     * @param size the new sample size.\n     * @throws IllegalArgumentException if \u003ccode\u003esize\u003c/code\u003e is negative.\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.upperCumulativeProbability(int)",
      "begin_line": 272,
      "end_line": 289,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026ge; x).\n     * @param x the value at which the CDF is evaluated.\n     * @return upper tail CDF for this distribution.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 19)",
        "(line 275,col 9)-(line 275,col 36)",
        "(line 276,col 9)-(line 276,col 39)",
        "(line 277,col 9)-(line 277,col 32)",
        "(line 279,col 9)-(line 279,col 42)",
        "(line 280,col 9)-(line 286,col 9)",
        "(line 288,col 9)-(line 288,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.innerCumulativeProbability(int, int, int, int, int, int)",
      "begin_line": 304,
      "end_line": 313,
      "comment": "\n     * For this distribution, X, this method returns P(x0 \u0026le; X \u0026le; x1).  This\n     * probability is computed by summing the point probabilities for the values\n     * x0, x0 + 1, x0 + 2, ..., x1, in the order directed by dx. \n     * @param x0 the inclusive, lower bound\n     * @param x1 the inclusive, upper bound\n     * @param dx the direction of summation. 1 indicates summing from x0 to x1.\n     *           0 indicates summing from x1 to x0.\n     * @param n the population size.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @return P(x0 \u0026le; X \u0026le; x1). \n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 46)",
        "(line 308,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 19)"
      ]
    }
  ]
}