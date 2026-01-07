{
  "filepath": "/tmp/Math-101b/src/java/org/apache/commons/math/distribution/PoissonDistributionImpl.java",
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
      "begin_line": 30,
      "end_line": 184,
      "comment": "\n * Implementation for the {@link PoissonDistribution}.\n * \n * @version $Revision$ $Date$\n "
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
        "normal"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Distribution used to compute normal approximation. "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Holds the Poisson mean for the distribution.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.PoissonDistributionImpl(double)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Create a new Poisson distribution with the given the mean.\n     * The mean value must be positive; otherwise an \n     * \u003ccode\u003eIllegalArgument\u003c/code\u003e is thrown.\n     * \n     * @param p the Poisson mean\n     * @throws IllegalArgumentException if p \u0026le; 0\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.PoissonDistributionImpl(double, org.apache.commons.math.distribution.NormalDistribution)",
      "begin_line": 66,
      "end_line": 70,
      "comment": "\n     * Create a new Poisson distribution with the given the mean.\n     * The mean value must be positive; otherwise an \n     * \u003ccode\u003eIllegalArgument\u003c/code\u003e is thrown.\n     * \n     * @param p the Poisson mean\n     * @param z a normal distribution used to compute normal approximations.\n     * @throws IllegalArgumentException if p \u0026le; 0\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 16)",
        "(line 68,col 9)-(line 68,col 21)",
        "(line 69,col 9)-(line 69,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.getMean()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Get the Poisson mean for the distribution.\n     * \n     * @return the Poisson mean for the distribution.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.setMean(double)",
      "begin_line": 89,
      "end_line": 97,
      "comment": "\n     * Set the Poisson mean for the distribution.\n     * The mean value must be positive; otherwise an \n     * \u003ccode\u003eIllegalArgument\u003c/code\u003e is thrown.\n     * \n     * @param p the Poisson mean value\n     * @throws IllegalArgumentException if p \u0026le; 0\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 22)",
        "(line 95,col 9)-(line 95,col 26)",
        "(line 96,col 9)-(line 96,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.probability(int)",
      "begin_line": 105,
      "end_line": 111,
      "comment": "\n     * The probability mass function P(X \u003d x) for a Poisson distribution.\n     * \n     * @param x the value at which the probability density function is evaluated.\n     * @return the value of the probability mass function at x\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 110,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.cumulativeProbability(int)",
      "begin_line": 121,
      "end_line": 130,
      "comment": "\n     * The probability distribution function P(X \u003c\u003d x) for a Poisson distribution.\n     * \n     * @param x the value at which the PDF is evaluated.\n     * @return Poisson distribution function evaluated at x\n     * @throws MathException if the cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 129,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.normalApproximateProbability(int)",
      "begin_line": 144,
      "end_line": 147,
      "comment": "\n     * Calculates the Poisson distribution function using a normal\n     * approximation.  The \u003ccode\u003eN(mean, sqrt(mean))\u003c/code\u003e\n     * distribution is used to approximate the Poisson distribution.\n     * \u003cp\u003e\n     * The computation uses \"half-correction\" -- evaluating the normal\n     * distribution function at \u003ccode\u003ex + 0.5\u003c/code\u003e\u003c/p\u003e\n     * \n     * @param x the upper bound, inclusive\n     * @return the distribution function value calculated using a normal approximation\n     * @throws MathException if an error occurs computing the normal approximation\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     * \n     * @param p the desired probability for the critical value\n     * @return domain lower bound\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     * \n     * @param p the desired probability for the critical value\n     * @return domain upper bound\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.setNormal(org.apache.commons.math.distribution.NormalDistribution)",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * Modify the normal distribution used to compute normal approximations.\n     * The caller is responsible for insuring the normal distribution has the\n     * proper parameter settings.\n     * @param value the new distribution\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 23)"
      ]
    }
  ]
}