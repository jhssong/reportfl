{
  "filepath": "/tmp/Math-52b/src/main/java/org/apache/commons/math/distribution/Distribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Distribution",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 110,
      "comment": "\n * Base interface for probability distributions.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.Distribution.cumulativeProbability(double)",
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * For a random variable X whose values are distributed according\n     * to this distribution, this method returns P(X \u0026le; x).  In other words,\n     * this method represents the  (cumulative) distribution function, or\n     * CDF, for this distribution.\n     *\n     * @param x the value at which the distribution function is evaluated.\n     * @return the probability that a random variable with this\n     * distribution takes a value less than or equal to \u003ccode\u003ex\u003c/code\u003e\n     * @throws MathException if the cumulative probability can not be\n     * computed due to convergence or other numerical errors.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.Distribution.cumulativeProbability(double, double)",
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * For a random variable X whose values are distributed according\n     * to this distribution, this method returns P(x0 \u0026le; X \u0026le; x1).\n     *\n     * @param x0 the (inclusive) lower bound\n     * @param x1 the (inclusive) upper bound\n     * @return the probability that a random variable with this distribution\n     * will take a value between \u003ccode\u003ex0\u003c/code\u003e and \u003ccode\u003ex1\u003c/code\u003e,\n     * including the endpoints\n     * @throws MathException if the cumulative probability can not be\n     * computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if \u003ccode\u003ex0 \u003e x1\u003c/code\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.Distribution.getNumericalMean()",
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * Use this method to get the numerical value of the mean of this\n     * distribution.\n     *\n     * @return the mean or Double.NaN if it\u0027s not defined\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.Distribution.getNumericalVariance()",
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * Use this method to get the numerical value of the variance of this\n     * distribution.\n     *\n     * @return the variance (possibly Double.POSITIVE_INFINITY as\n     * for certain cases in {@link TDistributionImpl}) or\n     * Double.NaN if it\u0027s not defined\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.Distribution.isSupportLowerBoundInclusive()",
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * Use this method to get information about whether the lower bound\n     * of the support is inclusive or not.\n     *\n     * @return whether the lower bound of the support is inclusive or not\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.Distribution.isSupportUpperBoundInclusive()",
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * Use this method to get information about whether the upper bound\n     * of the support is inclusive or not.\n     *\n     * @return whether the upper bound of the support is inclusive or not\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.Distribution.isSupportConnected()",
      "begin_line": 109,
      "end_line": 109,
      "comment": "\n     * Use this method to get information about whether the support is connected,\n     * i.e. whether all values between the lower and upper bound of the support\n     * is included in the support.\n     *\n     * For {@link AbstractIntegerDistribution} the support is discrete, so\n     * if this is true, then the support is\n     * {lower bound, lower bound + 1, ..., upper bound}.\n     *\n     * For {@link AbstractContinuousDistribution} the support is continuous, so\n     * if this is true, then the support is the interval\n     * [lower bound, upper bound]\n     * where the limits are inclusive or not according to\n     * {@link #isSupportLowerBoundInclusive()} and {@link #isSupportUpperBoundInclusive()}\n     * (in the example both are true). If both are false, then the support is the interval\n     * (lower bound, upper bound)\n     *\n     * @return whether the support limits given by subclassed methods are connected or not\n     ",
      "child_ranges": []
    }
  ]
}