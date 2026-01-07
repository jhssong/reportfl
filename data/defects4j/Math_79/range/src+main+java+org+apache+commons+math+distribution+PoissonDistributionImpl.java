{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/distribution/PoissonDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PoissonDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractIntegerDistribution",
        "org.apache.commons.math.distribution.PoissonDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 197,
      "comment": "\n * Implementation for the {@link PoissonDistribution}.\n *\n * @version $Revision$ $Date$\n "
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
        "normal"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Distribution used to compute normal approximation. "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Holds the Poisson mean for the distribution.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.PoissonDistributionImpl(double)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Create a new Poisson distribution with the given the mean. The mean value\n     * must be positive; otherwise an \u003ccode\u003eIllegalArgument\u003c/code\u003e is thrown.\n     *\n     * @param p the Poisson mean\n     * @throws IllegalArgumentException if p \u0026le; 0\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.PoissonDistributionImpl(double, org.apache.commons.math.distribution.NormalDistribution)",
      "begin_line": 65,
      "end_line": 69,
      "comment": "\n     * Create a new Poisson distribution with the given the mean. The mean value\n     * must be positive; otherwise an \u003ccode\u003eIllegalArgument\u003c/code\u003e is thrown.\n     *\n     * @param p the Poisson mean\n     * @param z a normal distribution used to compute normal approximations.\n     * @throws IllegalArgumentException if p \u0026le; 0\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 16)",
        "(line 67,col 9)-(line 67,col 21)",
        "(line 68,col 9)-(line 68,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.getMean()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Get the Poisson mean for the distribution.\n     *\n     * @return the Poisson mean for the distribution.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.setMean(double)",
      "begin_line": 87,
      "end_line": 95,
      "comment": "\n     * Set the Poisson mean for the distribution. The mean value must be\n     * positive; otherwise an \u003ccode\u003eIllegalArgument\u003c/code\u003e is thrown.\n     *\n     * @param p the Poisson mean value\n     * @throws IllegalArgumentException if p \u0026le; 0\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 92,col 22)",
        "(line 93,col 9)-(line 93,col 26)",
        "(line 94,col 9)-(line 94,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.probability(int)",
      "begin_line": 104,
      "end_line": 116,
      "comment": "\n     * The probability mass function P(X \u003d x) for a Poisson distribution.\n     *\n     * @param x the value at which the probability density function is\n     *            evaluated.\n     * @return the value of the probability mass function at x\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 19)",
        "(line 106,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.cumulativeProbability(int)",
      "begin_line": 127,
      "end_line": 137,
      "comment": "\n     * The probability distribution function P(X \u003c\u003d x) for a Poisson\n     * distribution.\n     *\n     * @param x the value at which the PDF is evaluated.\n     * @return Poisson distribution function evaluated at x\n     * @throws MathException if the cumulative probability can not be computed\n     *             due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 136,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.normalApproximateProbability(int)",
      "begin_line": 154,
      "end_line": 157,
      "comment": "\n     * Calculates the Poisson distribution function using a normal\n     * approximation. The \u003ccode\u003eN(mean, sqrt(mean))\u003c/code\u003e distribution is used\n     * to approximate the Poisson distribution.\n     * \u003cp\u003e\n     * The computation uses \"half-correction\" -- evaluating the normal\n     * distribution function at \u003ccode\u003ex + 0.5\u003c/code\u003e\n     * \u003c/p\u003e\n     *\n     * @param x the upper bound, inclusive\n     * @return the distribution function value calculated using a normal\n     *         approximation\n     * @throws MathException if an error occurs computing the normal\n     *             approximation\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 167,
      "end_line": 170,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root. This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain lower bound\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 180,
      "end_line": 183,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root. This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain upper bound\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.setNormal(org.apache.commons.math.distribution.NormalDistribution)",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\n     * Modify the normal distribution used to compute normal approximations. The\n     * caller is responsible for insuring the normal distribution has the proper\n     * parameter settings.\n     *\n     * @param value the new distribution\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 23)"
      ]
    }
  ]
}