{
  "filepath": "/tmp/Math-42b/src/main/java/org/apache/commons/math/distribution/Distribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Distribution",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 117,
      "comment": "\n * Base interface for probability distributions.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.Distribution.probability(double)",
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * For a random variable {@code X} whose values are distributed according\n     * to this distribution, this method returns {@code P(X \u003d x)}. In other\n     * words, this method represents the probability mass function (PMF)\n     * for the distribution.\n     *\n     * @param x the value at which the PMF is evaluated\n     * @return the value of the probability mass function at {@code x}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.Distribution.cumulativeProbability(double)",
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * For a random variable {@code X} whose values are distributed according\n     * to this distribution, this method returns {@code P(X \u003c\u003d x)}. In other\n     * words, this method represents the (cumulative) distribution function\n     * (CDF) for this distribution.\n     *\n     * @param x the value at which the CDF is evaluated\n     * @return the probability that a random variable with this\n     * distribution takes a value less than or equal to {@code x}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.Distribution.cumulativeProbability(double, double)",
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * For a random variable {@code X} whose values are distributed according\n     * to this distribution, this method returns {@code P(x0 \u003c X \u003c\u003d x1)}.\n     *\n     * @param x0 the exclusive lower bound\n     * @param x1 the inclusive upper bound\n     * @return the probability that a random variable with this distribution\n     * takes a value between {@code x0} and {@code x1},\n     * excluding the lower and including the upper endpoint\n     * @throws NumberIsTooLargeException if {@code x0 \u003e x1}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.Distribution.getNumericalMean()",
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * Use this method to get the numerical value of the mean of this\n     * distribution.\n     *\n     * @return the mean or Double.NaN if it\u0027s not defined\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.Distribution.getNumericalVariance()",
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * Use this method to get the numerical value of the variance of this\n     * distribution.\n     *\n     * @return the variance (possibly Double.POSITIVE_INFINITY as\n     * for certain cases in {@link TDistribution}) or\n     * Double.NaN if it\u0027s not defined\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.Distribution.isSupportLowerBoundInclusive()",
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n     * Use this method to get information about whether the lower bound\n     * of the support is inclusive or not.\n     *\n     * @return whether the lower bound of the support is inclusive or not\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.Distribution.isSupportUpperBoundInclusive()",
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * Use this method to get information about whether the upper bound\n     * of the support is inclusive or not.\n     *\n     * @return whether the upper bound of the support is inclusive or not\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.Distribution.isSupportConnected()",
      "begin_line": 116,
      "end_line": 116,
      "comment": "\n     * Use this method to get information about whether the support is connected,\n     * i.e. whether all values between the lower and upper bound of the support\n     * is included in the support.\n     *\n     * For {@link AbstractIntegerDistribution} the support is discrete, so\n     * if this is true, then the support is\n     * {lower bound, lower bound + 1, ..., upper bound}.\n     *\n     * For {@link AbstractContinuousDistribution} the support is continuous, so\n     * if this is true, then the support is the interval\n     * [lower bound, upper bound]\n     * where the limits are inclusive or not according to\n     * {@link #isSupportLowerBoundInclusive()} and {@link #isSupportUpperBoundInclusive()}\n     * (in the example both are true). If both are false, then the support is the interval\n     * (lower bound, upper bound)\n     *\n     * @return whether the support limits given by subclassed methods are connected or not\n     ",
      "child_ranges": []
    }
  ]
}