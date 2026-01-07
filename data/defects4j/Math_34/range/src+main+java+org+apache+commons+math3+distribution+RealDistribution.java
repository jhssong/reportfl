{
  "filepath": "/tmp/Math-34b/src/main/java/org/apache/commons/math3/distribution/RealDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealDistribution",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 183,
      "comment": "\n * Base interface for distributions on the reals.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistribution.probability(double)",
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * For a random variable {@code X} whose values are distributed according\n     * to this distribution, this method returns {@code P(X \u003d x)}. In other\n     * words, this method represents the probability mass function (PMF)\n     * for the distribution.\n     *\n     * @param x the point at which the PMF is evaluated\n     * @return the value of the probability mass function at point {@code x}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistribution.density(double)",
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Returns the probability density function (PDF) of this distribution\n     * evaluated at the specified point {@code x}. In general, the PDF is\n     * the derivative of the {@link #cumulativeProbability(double) CDF}.\n     * If the derivative does not exist at {@code x}, then an appropriate\n     * replacement should be returned, e.g. {@code Double.POSITIVE_INFINITY},\n     * {@code Double.NaN}, or  the limit inferior or limit superior of the\n     * difference quotient.\n     *\n     * @param x the point at which the PDF is evaluated\n     * @return the value of the probability density function at point {@code x}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistribution.cumulativeProbability(double)",
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * For a random variable {@code X} whose values are distributed according\n     * to this distribution, this method returns {@code P(X \u003c\u003d x)}. In other\n     * words, this method represents the (cumulative) distribution function\n     * (CDF) for this distribution.\n     *\n     * @param x the point at which the CDF is evaluated\n     * @return the probability that a random variable with this\n     * distribution takes a value less than or equal to {@code x}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistribution.cumulativeProbability(double, double)",
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * For a random variable {@code X} whose values are distributed according\n     * to this distribution, this method returns {@code P(x0 \u003c X \u003c\u003d x1)}.\n     *\n     * @param x0 the exclusive lower bound\n     * @param x1 the inclusive upper bound\n     * @return the probability that a random variable with this distribution\n     * takes a value between {@code x0} and {@code x1},\n     * excluding the lower and including the upper endpoint\n     * @throws NumberIsTooLargeException if {@code x0 \u003e x1}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistribution.inverseCumulativeProbability(double)",
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n     * Computes the quantile function of this distribution. For a random\n     * variable {@code X} distributed according to this distribution, the\n     * returned value is\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003einf{x in R | P(X\u003c\u003dx) \u003e\u003d p}\u003c/code\u003e for {@code 0 \u003c p \u003c\u003d 1},\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003einf{x in R | P(X\u003c\u003dx) \u003e 0}\u003c/code\u003e for {@code p \u003d 0}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param p the cumulative probability\n     * @return the smallest {@code p}-quantile of this distribution\n     * (largest 0-quantile for {@code p \u003d 0})\n     * @throws OutOfRangeException if {@code p \u003c 0} or {@code p \u003e 1}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistribution.getNumericalMean()",
      "begin_line": 101,
      "end_line": 101,
      "comment": "\n     * Use this method to get the numerical value of the mean of this\n     * distribution.\n     *\n     * @return the mean or {@code Double.NaN} if it is not defined\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistribution.getNumericalVariance()",
      "begin_line": 111,
      "end_line": 111,
      "comment": "\n     * Use this method to get the numerical value of the variance of this\n     * distribution.\n     *\n     * @return the variance (possibly {@code Double.POSITIVE_INFINITY} as\n     * for certain cases in {@link TDistribution}) or {@code Double.NaN} if it\n     * is not defined\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistribution.getSupportLowerBound()",
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n     * Access the lower bound of the support. This method must return the same\n     * value as {@code inverseCumulativeProbability(0)}. In other words, this\n     * method must return\n     * \u003cp\u003e\u003ccode\u003einf {x in R | P(X \u003c\u003d x) \u003e 0}\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return lower bound of the support (might be\n     * {@code Double.NEGATIVE_INFINITY})\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistribution.getSupportUpperBound()",
      "begin_line": 133,
      "end_line": 133,
      "comment": "\n     * Access the upper bound of the support. This method must return the same\n     * value as {@code inverseCumulativeProbability(1)}. In other words, this\n     * method must return\n     * \u003cp\u003e\u003ccode\u003einf {x in R | P(X \u003c\u003d x) \u003d 1}\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return upper bound of the support (might be\n     * {@code Double.POSITIVE_INFINITY})\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 141,
      "end_line": 141,
      "comment": "\n     * Use this method to get information about whether the lower bound\n     * of the support is inclusive or not.\n     *\n     * @return whether the lower bound of the support is inclusive or not\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 149,
      "end_line": 149,
      "comment": "\n     * Use this method to get information about whether the upper bound\n     * of the support is inclusive or not.\n     *\n     * @return whether the upper bound of the support is inclusive or not\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistribution.isSupportConnected()",
      "begin_line": 158,
      "end_line": 158,
      "comment": "\n     * Use this method to get information about whether the support is connected,\n     * i.e. whether all values between the lower and upper bound of the support\n     * are included in the support.\n     *\n     * @return whether the support is connected or not\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistribution.reseedRandomGenerator(long)",
      "begin_line": 165,
      "end_line": 165,
      "comment": "\n     * Reseed the random generator used to generate samples.\n     *\n     * @param seed the new seed\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistribution.sample()",
      "begin_line": 172,
      "end_line": 172,
      "comment": "\n     * Generate a random value sampled from this distribution.\n     *\n     * @return a random value.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistribution.sample(int)",
      "begin_line": 182,
      "end_line": 182,
      "comment": "\n     * Generate a random sample from the distribution.\n     *\n     * @param sampleSize the number of random values to generate\n     * @return an array representing the random sample\n     * @throws org.apache.commons.math3.exception.NotStrictlyPositiveException\n     * if {@code sampleSize} is not positive\n     ",
      "child_ranges": []
    }
  ]
}