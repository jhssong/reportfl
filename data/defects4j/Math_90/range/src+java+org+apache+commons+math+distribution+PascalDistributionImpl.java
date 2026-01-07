{
  "filepath": "/tmp/Math-90b/src/java/org/apache/commons/math/distribution/PascalDistributionImpl.java",
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
      "begin_line": 30,
      "end_line": 188,
      "comment": "\n * The default implementation of {@link PascalDistribution}.\n * @version $Revision$ $Date$\n * @since 1.2\n "
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
      "comment": " The number of successes "
    },
    {
      "type": "field",
      "varNames": [
        "probabilityOfSuccess"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The probability of success "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.PascalDistributionImpl(int, double)",
      "begin_line": 48,
      "end_line": 52,
      "comment": "\n     * Create a binomial distribution with the given number of trials and\n     * probability of success.\n     * @param r the number of successes\n     * @param p the probability of success\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 16)",
        "(line 50,col 9)-(line 50,col 32)",
        "(line 51,col 9)-(line 51,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.getNumberOfSuccesses()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Access the number of successes for this distribution.\n     * @return the number of successes\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.getProbabilityOfSuccess()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Access the probability of success for this distribution.\n     * @return the probability of success\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.setNumberOfSuccesses(int)",
      "begin_line": 76,
      "end_line": 82,
      "comment": "\n     * Change the number of successes for this distribution.\n     * @param successes the new number of successes\n     * @throws IllegalArgumentException if \u003ccode\u003esuccesses\u003c/code\u003e is not\n     *         positive.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.setProbabilityOfSuccess(double)",
      "begin_line": 90,
      "end_line": 96,
      "comment": "\n     * Change the probability of success for this distribution.\n     * @param p the new probability of success\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *         probability.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 105,
      "end_line": 108,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e. P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt;\n     *         \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 117,
      "end_line": 121,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e. P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt;\n     *         \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.cumulativeProbability(int)",
      "begin_line": 130,
      "end_line": 140,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026le; x).\n     * @param x the value at which the PDF is evaluated\n     * @return PDF for this distribution\n     * @throws MathException if the cumulative probability can not be computed\n     *         due to convergence or other numerical errors\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 19)",
        "(line 133,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.probability(int)",
      "begin_line": 147,
      "end_line": 158,
      "comment": "\n     * For this distribution, X, this method returns P(X \u003d x).\n     * @param x the value at which the PMF is evaluated\n     * @return PMF for this distribution\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 19)",
        "(line 149,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 172,
      "end_line": 187,
      "comment": "\n     * For this distribution, X, this method returns the largest x, such that\n     * P(X \u0026le; x) \u0026le; \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003e-1\u003c/code\u003e for p\u003d0 and \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     * for p\u003d1.\u003c/p\u003e\n     * @param p the desired probability\n     * @return the largest x such that P(X \u0026le; x) \u003c\u003d p\n     * @throws MathException if the inverse cumulative probability can not be\n     *         computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if p \u003c 0 or p \u003e 1\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 16)",
        "(line 178,col 9)-(line 184,col 9)",
        "(line 186,col 9)-(line 186,col 19)"
      ]
    }
  ]
}