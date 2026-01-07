{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/distribution/PoissonDistributionImpl.java",
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
      "begin_line": 29,
      "end_line": 156,
      "comment": "\n * Implementation for the {@link PoissonDistribution}.\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Holds the Poisson mean for the distribution.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.PoissonDistributionImpl(double)",
      "begin_line": 48,
      "end_line": 51,
      "comment": "\n     * Create a new Poisson distribution with the given the mean.\n     * The mean value must be positive; otherwise an \n     * \u003ccode\u003eIllegalArgument\u003c/code\u003e is thrown.\n     * \n     * @param p the Poisson mean\n     * @throws IllegalArgumentException if p \u0026le; 0\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 16)",
        "(line 50,col 9)-(line 50,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.getMean()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Get the Poisson mean for the distribution.\n     * \n     * @return the Poisson mean for the distribution.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.setMean(double)",
      "begin_line": 70,
      "end_line": 76,
      "comment": "\n     * Set the Poisson mean for the distribution.\n     * The mean value must be positive; otherwise an \n     * \u003ccode\u003eIllegalArgument\u003c/code\u003e is thrown.\n     * \n     * @param p the Poisson mean value\n     * @throws IllegalArgumentException if p \u0026le; 0\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.probability(int)",
      "begin_line": 84,
      "end_line": 90,
      "comment": "\n     * The probability mass function P(X \u003d x) for a Poisson distribution.\n     * \n     * @param x the value at which the probability density function is evaluated.\n     * @return the value of the probability mass function at x\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 89,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.cumulativeProbability(int)",
      "begin_line": 100,
      "end_line": 109,
      "comment": "\n     * The probability distribution function P(X \u003c\u003d x) for a Poisson distribution.\n     * \n     * @param x the value at which the PDF is evaluated.\n     * @return Poisson distribution function evaluated at x\n     * @throws MathException if the cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 108,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.normalApproximateProbability(int)",
      "begin_line": 123,
      "end_line": 130,
      "comment": "\n     * Calculates the Poisson distribution function using a normal\n     * approximation.  The \u003ccode\u003eN(mean, sqrt(mean))\u003c/code\u003e\n     * distribution is used to approximate the Poisson distribution.\n     * \u003cp\u003e\n     * The computation uses \"half-correction\" -- evaluating the normal\n     * distribution function at \u003ccode\u003ex + 0.5\u003c/code\u003e\n     * \n     * @param x the upper bound, inclusive\n     * @return the distribution function value calculated using a normal approximation\n     * @throws MathException if an error occurs computing the normal approximation\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 126,col 46)",
        "(line 129,col 9)-(line 129,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     * \n     * @param p the desired probability for the critical value\n     * @return domain lower bound\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.PoissonDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     * \n     * @param p the desired probability for the critical value\n     * @return domain upper bound\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 33)"
      ]
    }
  ]
}