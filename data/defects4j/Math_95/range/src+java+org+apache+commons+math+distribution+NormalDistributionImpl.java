{
  "filepath": "/tmp/Math-95b/src/java/org/apache/commons/math/distribution/NormalDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NormalDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractContinuousDistribution",
        "org.apache.commons.math.distribution.NormalDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 32,
      "end_line": 223,
      "comment": "\n * Default implementation of\n * {@link org.apache.commons.math.distribution.NormalDistribution}.\n *\n * @version $Revision$ $Date$\n "
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
        "mean"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The mean of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "standardDeviation"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The standard deviation of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "SQRT2PI"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.NormalDistributionImpl(double, double)",
      "begin_line": 50,
      "end_line": 54,
      "comment": "\n     * Create a normal distribution using the given mean and standard deviation.\n     * @param mean mean for this distribution\n     * @param sd standard deviation for this distribution\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 16)",
        "(line 52,col 9)-(line 52,col 22)",
        "(line 53,col 9)-(line 53,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.NormalDistributionImpl()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Creates normal distribution with the mean equal to zero and standard\n     * deviation equal to one. \n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getMean()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Access the mean.\n     * @return mean for this distribution\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.setMean(double)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Modify the mean.\n     * @param mean for this distribution\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getStandardDeviation()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Access the standard deviation.\n     * @return standard deviation for this distribution\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.setStandardDeviation(double)",
      "begin_line": 93,
      "end_line": 99,
      "comment": "\n     * Modify the standard deviation.\n     * @param sd standard deviation for this distribution\n     * @throws IllegalArgumentException if \u003ccode\u003esd\u003c/code\u003e is not positive.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.density(java.lang.Double)",
      "begin_line": 107,
      "end_line": 110,
      "comment": "\n     * Return the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 34)",
        "(line 109,col 9)-(line 109,col 127)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.cumulativeProbability(double)",
      "begin_line": 120,
      "end_line": 133,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026lt; \u003ccode\u003ex\u003c/code\u003e).\n     * @param x the value at which the CDF is evaluated.\n     * @return CDF evaluted at \u003ccode\u003ex\u003c/code\u003e. \n     * @throws MathException if the algorithm fails to converge; unless\n     * x is more than 20 standard deviations from the mean, in which case the\n     * convergence exception is caught and 0 or 1 is returned.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 132,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 149,
      "end_line": 158,
      "comment": "\n     * For this distribution, X, this method returns the critical point x, such\n     * that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e for p\u003d0 and \n     * \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e for p\u003d1.\u003c/p\u003e\n     *\n     * @param p the desired probability\n     * @return x, such that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e\n     * @throws MathException if the inverse cumulative probability can not be\n     *         computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *         probability.\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 169,
      "end_line": 179,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     * \n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e \n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 19)",
        "(line 172,col 9)-(line 176,col 9)",
        "(line 178,col 9)-(line 178,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 190,
      "end_line": 200,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     * \n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e \n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 19)",
        "(line 193,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 199,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getInitialDomain(double)",
      "begin_line": 210,
      "end_line": 222,
      "comment": "\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     * \n     * @param p the desired probability for the critical value\n     * @return initial domain value\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 19)",
        "(line 213,col 9)-(line 219,col 9)",
        "(line 221,col 9)-(line 221,col 19)"
      ]
    }
  ]
}