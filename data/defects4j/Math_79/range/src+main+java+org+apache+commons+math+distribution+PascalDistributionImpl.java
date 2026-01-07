{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/distribution/PascalDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PascalDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractIntegerDistribution",
        "org.apache.commons.math.distribution.PascalDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 190,
      "comment": "\n * The default implementation of {@link PascalDistribution}.\n * @version $Revision$ $Date$\n * @since 1.2\n "
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
      "comment": " The number of successes "
    },
    {
      "type": "field",
      "varNames": [
        "probabilityOfSuccess"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The probability of success "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.PascalDistributionImpl(int, double)",
      "begin_line": 49,
      "end_line": 53,
      "comment": "\n     * Create a binomial distribution with the given number of trials and\n     * probability of success.\n     * @param r the number of successes\n     * @param p the probability of success\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 16)",
        "(line 51,col 9)-(line 51,col 32)",
        "(line 52,col 9)-(line 52,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.getNumberOfSuccesses()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Access the number of successes for this distribution.\n     * @return the number of successes\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.getProbabilityOfSuccess()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Access the probability of success for this distribution.\n     * @return the probability of success\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.setNumberOfSuccesses(int)",
      "begin_line": 77,
      "end_line": 84,
      "comment": "\n     * Change the number of successes for this distribution.\n     * @param successes the new number of successes\n     * @throws IllegalArgumentException if \u003ccode\u003esuccesses\u003c/code\u003e is not\n     *         positive.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.setProbabilityOfSuccess(double)",
      "begin_line": 92,
      "end_line": 98,
      "comment": "\n     * Change the probability of success for this distribution.\n     * @param p the new probability of success\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *         probability.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 107,
      "end_line": 110,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e. P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt;\n     *         \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 119,
      "end_line": 123,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e. P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt;\n     *         \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.cumulativeProbability(int)",
      "begin_line": 132,
      "end_line": 142,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026le; x).\n     * @param x the value at which the PDF is evaluated\n     * @return PDF for this distribution\n     * @throws MathException if the cumulative probability can not be computed\n     *         due to convergence or other numerical errors\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 19)",
        "(line 135,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.probability(int)",
      "begin_line": 149,
      "end_line": 160,
      "comment": "\n     * For this distribution, X, this method returns P(X \u003d x).\n     * @param x the value at which the PMF is evaluated\n     * @return PMF for this distribution\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 19)",
        "(line 151,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 174,
      "end_line": 189,
      "comment": "\n     * For this distribution, X, this method returns the largest x, such that\n     * P(X \u0026le; x) \u0026le; \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003e-1\u003c/code\u003e for p\u003d0 and \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     * for p\u003d1.\u003c/p\u003e\n     * @param p the desired probability\n     * @return the largest x such that P(X \u0026le; x) \u003c\u003d p\n     * @throws MathException if the inverse cumulative probability can not be\n     *         computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if p \u003c 0 or p \u003e 1\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 16)",
        "(line 180,col 9)-(line 186,col 9)",
        "(line 188,col 9)-(line 188,col 19)"
      ]
    }
  ]
}