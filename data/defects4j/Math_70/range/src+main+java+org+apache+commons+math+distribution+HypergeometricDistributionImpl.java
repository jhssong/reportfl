{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/distribution/HypergeometricDistributionImpl.java",
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
      "end_line": 352,
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
      "end_line": 72,
      "comment": "\n     * Construct a new hypergeometric distribution with the given the population\n     * size, the number of successes in the population, and the sample size.\n     *\n     * @param populationSize the population size.\n     * @param numberOfSuccesses number of successes in the population.\n     * @param sampleSize the sample size.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 16)",
        "(line 56,col 9)-(line 61,col 9)",
        "(line 62,col 9)-(line 67,col 9)",
        "(line 69,col 9)-(line 69,col 50)",
        "(line 70,col 9)-(line 70,col 42)",
        "(line 71,col 9)-(line 71,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.cumulativeProbability(int)",
      "begin_line": 80,
      "end_line": 95,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026le; x).\n     *\n     * @param x the value at which the PDF is evaluated.\n     * @return PDF for this distribution.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 19)",
        "(line 84,col 9)-(line 84,col 80)",
        "(line 85,col 9)-(line 92,col 9)",
        "(line 94,col 9)-(line 94,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getDomain(int, int, int)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * Return the domain for the given hypergeometric distribution parameters.\n     *\n     * @param n the population size.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @return a two element array containing the lower and upper bounds of the\n     *         hypergeometric distribution.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 118,
      "end_line": 121,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e. P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt;\n     *         \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 131,
      "end_line": 134,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e. P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt;\n     *         \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getLowerDomain(int, int, int)",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * Return the lowest domain value for the given hypergeometric distribution\n     * parameters.\n     *\n     * @param n the population size.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @return the lowest domain value of the hypergeometric distribution.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getNumberOfSuccesses()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Access the number of successes.\n     *\n     * @return the number of successes.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getPopulationSize()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * Access the population size.\n     *\n     * @return the population size.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getSampleSize()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * Access the sample size.\n     *\n     * @return the sample size.\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.getUpperDomain(int, int)",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\n     * Return the highest domain value for the given hypergeometric distribution\n     * parameters.\n     *\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @return the highest domain value of the hypergeometric distribution.\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.probability(int)",
      "begin_line": 194,
      "end_line": 214,
      "comment": "\n     * For this distribution, X, this method returns P(X \u003d x).\n     *\n     * @param x the value at which the PMF is evaluated.\n     * @return PMF for this distribution.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 19)",
        "(line 197,col 9)-(line 197,col 80)",
        "(line 198,col 9)-(line 211,col 9)",
        "(line 213,col 9)-(line 213,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.probability(int, int, int, int)",
      "begin_line": 226,
      "end_line": 230,
      "comment": "\n     * For the distribution, X, defined by the given hypergeometric distribution\n     * parameters, this method returns P(X \u003d x).\n     *\n     * @param n the population size.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @param x the value at which the PMF is evaluated.\n     * @return PMF for the distribution.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 229,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.setNumberOfSuccesses(int)",
      "begin_line": 239,
      "end_line": 242,
      "comment": "\n     * Modify the number of successes.\n     *\n     * @param num the new number of successes.\n     * @throws IllegalArgumentException if \u003ccode\u003enum\u003c/code\u003e is negative.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.setNumberOfSuccessesInternal(int)",
      "begin_line": 249,
      "end_line": 255,
      "comment": "\n     * Modify the number of successes.\n     *\n     * @param num the new number of successes.\n     * @throws IllegalArgumentException if \u003ccode\u003enum\u003c/code\u003e is negative.\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 254,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.setPopulationSize(int)",
      "begin_line": 264,
      "end_line": 267,
      "comment": "\n     * Modify the population size.\n     *\n     * @param size the new population size.\n     * @throws IllegalArgumentException if \u003ccode\u003esize\u003c/code\u003e is not positive.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.setPopulationSizeInternal(int)",
      "begin_line": 274,
      "end_line": 280,
      "comment": "\n     * Modify the population size.\n     *\n     * @param size the new population size.\n     * @throws IllegalArgumentException if \u003ccode\u003esize\u003c/code\u003e is not positive.\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 279,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.setSampleSize(int)",
      "begin_line": 289,
      "end_line": 292,
      "comment": "\n     * Modify the sample size.\n     *\n     * @param size the new sample size.\n     * @throws IllegalArgumentException if \u003ccode\u003esize\u003c/code\u003e is negative.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.setSampleSizeInternal(int)",
      "begin_line": 299,
      "end_line": 305,
      "comment": "\n     * Modify the sample size.\n     *\n     * @param size the new sample size.\n     * @throws IllegalArgumentException if \u003ccode\u003esize\u003c/code\u003e is negative.\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 304,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.upperCumulativeProbability(int)",
      "begin_line": 314,
      "end_line": 327,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026ge; x).\n     *\n     * @param x the value at which the CDF is evaluated.\n     * @return upper tail CDF for this distribution.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 19)",
        "(line 317,col 9)-(line 317,col 86)",
        "(line 318,col 9)-(line 324,col 9)",
        "(line 326,col 9)-(line 326,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionImpl.innerCumulativeProbability(int, int, int, int, int, int)",
      "begin_line": 343,
      "end_line": 351,
      "comment": "\n     * For this distribution, X, this method returns P(x0 \u0026le; X \u0026le; x1). This\n     * probability is computed by summing the point probabilities for the values\n     * x0, x0 + 1, x0 + 2, ..., x1, in the order directed by dx.\n     *\n     * @param x0 the inclusive, lower bound\n     * @param x1 the inclusive, upper bound\n     * @param dx the direction of summation. 1 indicates summing from x0 to x1.\n     *            0 indicates summing from x1 to x0.\n     * @param n the population size.\n     * @param m number of successes in the population.\n     * @param k the sample size.\n     * @return P(x0 \u0026le; X \u0026le; x1).\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 46)",
        "(line 346,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 19)"
      ]
    }
  ]
}