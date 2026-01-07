{
  "filepath": "/tmp/Math-85b/src/java/org/apache/commons/math/distribution/BinomialDistributionImpl.java",
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
      "begin_line": 31,
      "end_line": 196,
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
      "begin_line": 50,
      "end_line": 54,
      "comment": "\n     * Create a binomial distribution with the given number of trials and\n     * probability of success.\n     * @param trials the number of trials.\n     * @param p the probability of success.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 16)",
        "(line 52,col 9)-(line 52,col 34)",
        "(line 53,col 9)-(line 53,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.getNumberOfTrials()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Access the number of trials for this distribution.\n     * @return the number of trials.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.getProbabilityOfSuccess()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Access the probability of success for this distribution.\n     * @return the probability of success.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.setNumberOfTrials(int)",
      "begin_line": 78,
      "end_line": 84,
      "comment": "\n     * Change the number of trials for this distribution.\n     * @param trials the new number of trials.\n     * @throws IllegalArgumentException if \u003ccode\u003etrials\u003c/code\u003e is not a valid\n     *         number of trials.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.setProbabilityOfSuccess(double)",
      "begin_line": 92,
      "end_line": 98,
      "comment": "\n     * Change the probability of success for this distribution.\n     * @param p the new probability of success.\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *         probability.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 108,
      "end_line": 111,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.\n     * \n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e \n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 121,
      "end_line": 124,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.\n     * \n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e \n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.cumulativeProbability(int)",
      "begin_line": 133,
      "end_line": 148,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026le; x).\n     * @param x the value at which the PDF is evaluated.\n     * @return PDF for this distribution. \n     * @throws MathException if the cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 19)",
        "(line 136,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.probability(int)",
      "begin_line": 156,
      "end_line": 168,
      "comment": "\n     * For this distribution, X, this method returns P(X \u003d x).\n     * \n     * @param x the value at which the PMF is evaluated.\n     * @return PMF for this distribution. \n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 19)",
        "(line 158,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BinomialDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 183,
      "end_line": 195,
      "comment": "\n     * For this distribution, X, this method returns the largest x, such\n     * that P(X \u0026le; x) \u0026le; \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003e-1\u003c/code\u003e for p\u003d0 and \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e for\n     * p\u003d1.\u003c/p\u003e\n     *\n     * @param p the desired probability\n     * @return the largest x such that P(X \u0026le; x) \u003c\u003d p\n     * @throws MathException if the inverse cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if p \u003c 0 or p \u003e 1\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 191,col 9)",
        "(line 194,col 9)-(line 194,col 53)"
      ]
    }
  ]
}