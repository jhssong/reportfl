{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/distribution/BinomialDistributionImpl.java",
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
      "begin_line": 32,
      "end_line": 223,
      "comment": "\n * The default implementation of {@link BinomialDistribution}.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfTrials"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The number of trials. "
    },
    {
      "type": "field",
      "varNames": [
        "probabilityOfSuccess"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The probability of success. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.BinomialDistributionImpl(int, double)",
      "begin_line": 51,
      "end_line": 55,
      "comment": "\n     * Create a binomial distribution with the given number of trials and\n     * probability of success.\n     *\n     * @param trials the number of trials.\n     * @param p the probability of success.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 16)",
        "(line 53,col 9)-(line 53,col 42)",
        "(line 54,col 9)-(line 54,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.getNumberOfTrials()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Access the number of trials for this distribution.\n     *\n     * @return the number of trials.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.getProbabilityOfSuccess()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Access the probability of success for this distribution.\n     *\n     * @return the probability of success.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.setNumberOfTrials(int)",
      "begin_line": 83,
      "end_line": 86,
      "comment": "\n     * Change the number of trials for this distribution.\n     *\n     * @param trials the new number of trials.\n     * @throws IllegalArgumentException if \u003ccode\u003etrials\u003c/code\u003e is not a valid\n     *             number of trials.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.setNumberOfTrialsInternal(int)",
      "begin_line": 94,
      "end_line": 100,
      "comment": "\n     * Change the number of trials for this distribution.\n     *\n     * @param trials the new number of trials.\n     * @throws IllegalArgumentException if \u003ccode\u003etrials\u003c/code\u003e is not a valid\n     *             number of trials.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.setProbabilityOfSuccess(double)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "\n     * Change the probability of success for this distribution.\n     *\n     * @param p the new probability of success.\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *             probability.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.setProbabilityOfSuccessInternal(double)",
      "begin_line": 121,
      "end_line": 127,
      "comment": "\n     * Change the probability of success for this distribution.\n     *\n     * @param p the new probability of success.\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *             probability.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 137,
      "end_line": 140,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e. P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt;\n     *         \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 150,
      "end_line": 153,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e. P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt;\n     *         \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.cumulativeProbability(int)",
      "begin_line": 163,
      "end_line": 175,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026le; x).\n     *\n     * @param x the value at which the PDF is evaluated.\n     * @return PDF for this distribution.\n     * @throws MathException if the cumulative probability can not be computed\n     *             due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 19)",
        "(line 166,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.probability(int)",
      "begin_line": 183,
      "end_line": 193,
      "comment": "\n     * For this distribution, X, this method returns P(X \u003d x).\n     *\n     * @param x the value at which the PMF is evaluated.\n     * @return PMF for this distribution.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 19)",
        "(line 185,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 209,
      "end_line": 222,
      "comment": "\n     * For this distribution, X, this method returns the largest x, such that\n     * P(X \u0026le; x) \u0026le; \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003e-1\u003c/code\u003e for p\u003d0 and \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e for\n     * p\u003d1.\n     * \u003c/p\u003e\n     *\n     * @param p the desired probability\n     * @return the largest x such that P(X \u0026le; x) \u003c\u003d p\n     * @throws MathException if the inverse cumulative probability can not be\n     *             computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if p \u003c 0 or p \u003e 1\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 218,col 9)",
        "(line 221,col 9)-(line 221,col 53)"
      ]
    }
  ]
}