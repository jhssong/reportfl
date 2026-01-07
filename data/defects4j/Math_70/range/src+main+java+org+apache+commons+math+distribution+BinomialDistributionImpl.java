{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/distribution/BinomialDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BinomialDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractIntegerDistribution",
        "org.apache.commons.math.distribution.BinomialDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 221,
      "comment": "\n * The default implementation of {@link BinomialDistribution}.\n *\n * @version $Revision$ $Date$\n "
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
        "numberOfTrials"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The number of trials. "
    },
    {
      "type": "field",
      "varNames": [
        "probabilityOfSuccess"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The probability of success. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.BinomialDistributionImpl(int, double)",
      "begin_line": 49,
      "end_line": 53,
      "comment": "\n     * Create a binomial distribution with the given number of trials and\n     * probability of success.\n     *\n     * @param trials the number of trials.\n     * @param p the probability of success.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 16)",
        "(line 51,col 9)-(line 51,col 42)",
        "(line 52,col 9)-(line 52,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.getNumberOfTrials()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Access the number of trials for this distribution.\n     *\n     * @return the number of trials.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.getProbabilityOfSuccess()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Access the probability of success for this distribution.\n     *\n     * @return the probability of success.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.setNumberOfTrials(int)",
      "begin_line": 81,
      "end_line": 84,
      "comment": "\n     * Change the number of trials for this distribution.\n     *\n     * @param trials the new number of trials.\n     * @throws IllegalArgumentException if \u003ccode\u003etrials\u003c/code\u003e is not a valid\n     *             number of trials.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.setNumberOfTrialsInternal(int)",
      "begin_line": 92,
      "end_line": 98,
      "comment": "\n     * Change the number of trials for this distribution.\n     *\n     * @param trials the new number of trials.\n     * @throws IllegalArgumentException if \u003ccode\u003etrials\u003c/code\u003e is not a valid\n     *             number of trials.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.setProbabilityOfSuccess(double)",
      "begin_line": 108,
      "end_line": 111,
      "comment": "\n     * Change the probability of success for this distribution.\n     *\n     * @param p the new probability of success.\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *             probability.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.setProbabilityOfSuccessInternal(double)",
      "begin_line": 119,
      "end_line": 125,
      "comment": "\n     * Change the probability of success for this distribution.\n     *\n     * @param p the new probability of success.\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *             probability.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 135,
      "end_line": 138,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e. P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt;\n     *         \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 148,
      "end_line": 151,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e. P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt;\n     *         \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.cumulativeProbability(int)",
      "begin_line": 161,
      "end_line": 173,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026le; x).\n     *\n     * @param x the value at which the PDF is evaluated.\n     * @return PDF for this distribution.\n     * @throws MathException if the cumulative probability can not be computed\n     *             due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 19)",
        "(line 164,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.probability(int)",
      "begin_line": 181,
      "end_line": 191,
      "comment": "\n     * For this distribution, X, this method returns P(X \u003d x).\n     *\n     * @param x the value at which the PMF is evaluated.\n     * @return PMF for this distribution.\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 19)",
        "(line 183,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 207,
      "end_line": 220,
      "comment": "\n     * For this distribution, X, this method returns the largest x, such that\n     * P(X \u0026le; x) \u0026le; \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003e-1\u003c/code\u003e for p\u003d0 and \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e for\n     * p\u003d1.\n     * \u003c/p\u003e\n     *\n     * @param p the desired probability\n     * @return the largest x such that P(X \u0026le; x) \u003c\u003d p\n     * @throws MathException if the inverse cumulative probability can not be\n     *             computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if p \u003c 0 or p \u003e 1\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 216,col 9)",
        "(line 219,col 9)-(line 219,col 53)"
      ]
    }
  ]
}