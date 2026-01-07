{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/distribution/PascalDistributionImpl.java",
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
      "begin_line": 33,
      "end_line": 214,
      "comment": "\n * The default implementation of {@link PascalDistribution}.\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfSuccesses"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The number of successes "
    },
    {
      "type": "field",
      "varNames": [
        "probabilityOfSuccess"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The probability of success "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.PascalDistributionImpl(int, double)",
      "begin_line": 51,
      "end_line": 55,
      "comment": "\n     * Create a Pascal distribution with the given number of trials and\n     * probability of success.\n     * @param r the number of successes\n     * @param p the probability of success\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 16)",
        "(line 53,col 9)-(line 53,col 40)",
        "(line 54,col 9)-(line 54,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.getNumberOfSuccesses()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Access the number of successes for this distribution.\n     * @return the number of successes\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.getProbabilityOfSuccess()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Access the probability of success for this distribution.\n     * @return the probability of success\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.setNumberOfSuccesses(int)",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\n     * Change the number of successes for this distribution.\n     * @param successes the new number of successes\n     * @throws IllegalArgumentException if \u003ccode\u003esuccesses\u003c/code\u003e is not\n     *         positive.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.setNumberOfSuccessesInternal(int)",
      "begin_line": 90,
      "end_line": 97,
      "comment": "\n     * Change the number of successes for this distribution.\n     * @param successes the new number of successes\n     * @throws IllegalArgumentException if \u003ccode\u003esuccesses\u003c/code\u003e is not\n     *         positive.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.setProbabilityOfSuccess(double)",
      "begin_line": 106,
      "end_line": 109,
      "comment": "\n     * Change the probability of success for this distribution.\n     * @param p the new probability of success\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *         probability.\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.setProbabilityOfSuccessInternal(double)",
      "begin_line": 116,
      "end_line": 122,
      "comment": "\n     * Change the probability of success for this distribution.\n     * @param p the new probability of success\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *         probability.\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 131,
      "end_line": 134,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e. P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt;\n     *         \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 143,
      "end_line": 147,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e. P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt;\n     *         \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.cumulativeProbability(int)",
      "begin_line": 156,
      "end_line": 166,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026le; x).\n     * @param x the value at which the PDF is evaluated\n     * @return PDF for this distribution\n     * @throws MathException if the cumulative probability can not be computed\n     *         due to convergence or other numerical errors\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 19)",
        "(line 159,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.probability(int)",
      "begin_line": 173,
      "end_line": 184,
      "comment": "\n     * For this distribution, X, this method returns P(X \u003d x).\n     * @param x the value at which the PMF is evaluated\n     * @return PMF for this distribution\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 19)",
        "(line 175,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PascalDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 198,
      "end_line": 213,
      "comment": "\n     * For this distribution, X, this method returns the largest x, such that\n     * P(X \u0026le; x) \u0026le; \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003e-1\u003c/code\u003e for p\u003d0 and \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     * for p\u003d1.\u003c/p\u003e\n     * @param p the desired probability\n     * @return the largest x such that P(X \u0026le; x) \u003c\u003d p\n     * @throws MathException if the inverse cumulative probability can not be\n     *         computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if p \u003c 0 or p \u003e 1\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 16)",
        "(line 204,col 9)-(line 210,col 9)",
        "(line 212,col 9)-(line 212,col 19)"
      ]
    }
  ]
}