{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/distribution/HypergeometricDistributionImpl.java",
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
      "end_line": 330,
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
      "begin_line": 53,
      "end_line": 71,
      "comment": "\n     * Construct a new hypergeometric distribution with the given the population\n     * size, the number of successes in the population, and the sample size.\n     *\n     * @param populationSize the population size.\n     * @param numberOfSuccesses number of successes in the population.\n     * @param sampleSize the sample size.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 16)",
        "(line 56,col 9)-(line 61,col 9)",
        "(line 62,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 68,col 42)",
        "(line 69,col 9)-(line 69,col 34)",
        "(line 70,col 9)-(line 70,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.cumulativeProbability(int)",
      "begin_line": 79,
      "end_line": 97,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026le; x).\n     *\n     * @param x the value at which the PDF is evaluated.\n     * @return PDF for this distribution.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 19)",
        "(line 83,col 9)-(line 83,col 36)",
        "(line 84,col 9)-(line 84,col 39)",
        "(line 85,col 9)-(line 85,col 32)",
        "(line 87,col 9)-(line 87,col 42)",
        "(line 88,col 9)-(line 94,col 9)",
        "(line 96,col 9)-(line 96,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getDomain(int, int, int)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Return the domain for the given hypergeometric distribution parameters.\n     *\n     * @param n the population size.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @return a two element array containing the lower and upper bounds of the\n     *         hypergeometric distribution.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 120,
      "end_line": 124,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e. P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt;\n     *         \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 123,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 134,
      "end_line": 137,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e. P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt;\n     *         \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getLowerDomain(int, int, int)",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * Return the lowest domain value for the given hypergeometric distribution\n     * parameters.\n     *\n     * @param n the population size.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @return the lowest domain value of the hypergeometric distribution.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getNumberOfSuccesses()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * Access the number of successes.\n     *\n     * @return the number of successes.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getPopulationSize()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * Access the population size.\n     *\n     * @return the population size.\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getSampleSize()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\n     * Access the sample size.\n     *\n     * @return the sample size.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getUpperDomain(int, int)",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\n     * Return the highest domain value for the given hypergeometric distribution\n     * parameters.\n     *\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @return the highest domain value of the hypergeometric distribution.\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.probability(int)",
      "begin_line": 197,
      "end_line": 221,
      "comment": "\n     * For this distribution, X, this method returns P(X \u003d x).\n     *\n     * @param x the value at which the PMF is evaluated.\n     * @return PMF for this distribution.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 19)",
        "(line 200,col 9)-(line 200,col 36)",
        "(line 201,col 9)-(line 201,col 39)",
        "(line 202,col 9)-(line 202,col 22)",
        "(line 203,col 9)-(line 203,col 32)",
        "(line 205,col 9)-(line 205,col 42)",
        "(line 206,col 9)-(line 218,col 9)",
        "(line 220,col 9)-(line 220,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.probability(int, int, int, int)",
      "begin_line": 233,
      "end_line": 237,
      "comment": "\n     * For the distribution, X, defined by the given hypergeometric distribution\n     * parameters, this method returns P(X \u003d x).\n     *\n     * @param n the population size.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @param x the value at which the PMF is evaluated.\n     * @return PMF for the distribution.\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 236,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.setNumberOfSuccesses(int)",
      "begin_line": 245,
      "end_line": 251,
      "comment": "\n     * Modify the number of successes.\n     *\n     * @param num the new number of successes.\n     * @throws IllegalArgumentException if \u003ccode\u003enum\u003c/code\u003e is negative.\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.setPopulationSize(int)",
      "begin_line": 259,
      "end_line": 265,
      "comment": "\n     * Modify the population size.\n     *\n     * @param size the new population size.\n     * @throws IllegalArgumentException if \u003ccode\u003esize\u003c/code\u003e is not positive.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 264,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.setSampleSize(int)",
      "begin_line": 273,
      "end_line": 279,
      "comment": "\n     * Modify the sample size.\n     *\n     * @param size the new sample size.\n     * @throws IllegalArgumentException if \u003ccode\u003esize\u003c/code\u003e is negative.\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 278,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.upperCumulativeProbability(int)",
      "begin_line": 288,
      "end_line": 305,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026ge; x).\n     *\n     * @param x the value at which the CDF is evaluated.\n     * @return upper tail CDF for this distribution.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 19)",
        "(line 291,col 9)-(line 291,col 36)",
        "(line 292,col 9)-(line 292,col 39)",
        "(line 293,col 9)-(line 293,col 32)",
        "(line 295,col 9)-(line 295,col 42)",
        "(line 296,col 9)-(line 302,col 9)",
        "(line 304,col 9)-(line 304,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.innerCumulativeProbability(int, int, int, int, int, int)",
      "begin_line": 321,
      "end_line": 329,
      "comment": "\n     * For this distribution, X, this method returns P(x0 \u0026le; X \u0026le; x1). This\n     * probability is computed by summing the point probabilities for the values\n     * x0, x0 + 1, x0 + 2, ..., x1, in the order directed by dx.\n     *\n     * @param x0 the inclusive, lower bound\n     * @param x1 the inclusive, upper bound\n     * @param dx the direction of summation. 1 indicates summing from x0 to x1.\n     *            0 indicates summing from x1 to x0.\n     * @param n the population size.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @return P(x0 \u0026le; X \u0026le; x1).\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 46)",
        "(line 324,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 328,col 19)"
      ]
    }
  ]
}