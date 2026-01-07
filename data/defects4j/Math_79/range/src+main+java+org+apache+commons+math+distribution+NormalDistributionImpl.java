{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/distribution/NormalDistributionImpl.java",
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
      "begin_line": 33,
      "end_line": 231,
      "comment": "\n * Default implementation of\n * {@link org.apache.commons.math.distribution.NormalDistribution}.\n *\n * @version $Revision$ $Date$\n "
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
        "SQRT2PI"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " \u0026sqrt;(2 \u0026pi;) "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The mean of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "standardDeviation"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The standard deviation of this distribution. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.NormalDistributionImpl(double, double)",
      "begin_line": 53,
      "end_line": 57,
      "comment": "\n     * Create a normal distribution using the given mean and standard deviation.\n     * @param mean mean for this distribution\n     * @param sd standard deviation for this distribution\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 16)",
        "(line 55,col 9)-(line 55,col 22)",
        "(line 56,col 9)-(line 56,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.NormalDistributionImpl()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Creates normal distribution with the mean equal to zero and standard\n     * deviation equal to one.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getMean()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Access the mean.\n     * @return mean for this distribution\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.setMean(double)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Modify the mean.\n     * @param mean for this distribution\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getStandardDeviation()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Access the standard deviation.\n     * @return standard deviation for this distribution\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.setStandardDeviation(double)",
      "begin_line": 96,
      "end_line": 103,
      "comment": "\n     * Modify the standard deviation.\n     * @param sd standard deviation for this distribution\n     * @throws IllegalArgumentException if \u003ccode\u003esd\u003c/code\u003e is not positive.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.density(java.lang.Double)",
      "begin_line": 111,
      "end_line": 114,
      "comment": "\n     * Return the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 34)",
        "(line 113,col 9)-(line 113,col 127)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.cumulativeProbability(double)",
      "begin_line": 124,
      "end_line": 137,
      "comment": "\n     * For this distribution, X, this method returns P(X \u0026lt; \u003ccode\u003ex\u003c/code\u003e).\n     * @param x the value at which the CDF is evaluated.\n     * @return CDF evaluted at \u003ccode\u003ex\u003c/code\u003e.\n     * @throws MathException if the algorithm fails to converge; unless\n     * x is more than 20 standard deviations from the mean, in which case the\n     * convergence exception is caught and 0 or 1 is returned.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 136,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 153,
      "end_line": 163,
      "comment": "\n     * For this distribution, X, this method returns the critical point x, such\n     * that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e for p\u003d0 and\n     * \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e for p\u003d1.\u003c/p\u003e\n     *\n     * @param p the desired probability\n     * @return x, such that P(X \u0026lt; x) \u003d \u003ccode\u003ep\u003c/code\u003e\n     * @throws MathException if the inverse cumulative probability can not be\n     *         computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if \u003ccode\u003ep\u003c/code\u003e is not a valid\n     *         probability.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 162,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 174,
      "end_line": 185,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 19)",
        "(line 178,col 9)-(line 182,col 9)",
        "(line 184,col 9)-(line 184,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 196,
      "end_line": 207,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 19)",
        "(line 200,col 9)-(line 204,col 9)",
        "(line 206,col 9)-(line 206,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getInitialDomain(double)",
      "begin_line": 217,
      "end_line": 230,
      "comment": "\n     * Access the initial domain value, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return initial domain value\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 19)",
        "(line 221,col 9)-(line 227,col 9)",
        "(line 229,col 9)-(line 229,col 19)"
      ]
    }
  ]
}