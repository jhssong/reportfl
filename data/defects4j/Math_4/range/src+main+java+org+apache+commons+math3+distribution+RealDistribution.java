{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/RealDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealDistribution",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 195,
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
      "begin_line": 80,
      "end_line": 81,
      "comment": "\n     * For a random variable {@code X} whose values are distributed according\n     * to this distribution, this method returns {@code P(x0 \u003c X \u003c\u003d x1)}.\n     *\n     * @param x0 the exclusive lower bound\n     * @param x1 the inclusive upper bound\n     * @return the probability that a random variable with this distribution\n     * takes a value between {@code x0} and {@code x1},\n     * excluding the lower and including the upper endpoint\n     * @throws NumberIsTooLargeException if {@code x0 \u003e x1}\n     *\n     * @deprecated As of 3.1. In 4.0, this method will be renamed\n     * {@code probability(double x0, double x1)}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistribution.inverseCumulativeProbability(double)",
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n     * Computes the quantile function of this distribution. For a random\n     * variable {@code X} distributed according to this distribution, the\n     * returned value is\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003einf{x in R | P(X\u003c\u003dx) \u003e\u003d p}\u003c/code\u003e for {@code 0 \u003c p \u003c\u003d 1},\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003einf{x in R | P(X\u003c\u003dx) \u003e 0}\u003c/code\u003e for {@code p \u003d 0}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param p the cumulative probability\n     * @return the smallest {@code p}-quantile of this distribution\n     * (largest 0-quantile for {@code p \u003d 0})\n     * @throws OutOfRangeException if {@code p \u003c 0} or {@code p \u003e 1}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistribution.getNumericalMean()",
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n     * Use this method to get the numerical value of the mean of this\n     * distribution.\n     *\n     * @return the mean or {@code Double.NaN} if it is not defined\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistribution.getNumericalVariance()",
      "begin_line": 115,
      "end_line": 115,
      "comment": "\n     * Use this method to get the numerical value of the variance of this\n     * distribution.\n     *\n     * @return the variance (possibly {@code Double.POSITIVE_INFINITY} as\n     * for certain cases in {@link TDistribution}) or {@code Double.NaN} if it\n     * is not defined\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistribution.getSupportLowerBound()",
      "begin_line": 126,
      "end_line": 126,
      "comment": "\n     * Access the lower bound of the support. This method must return the same\n     * value as {@code inverseCumulativeProbability(0)}. In other words, this\n     * method must return\n     * \u003cp\u003e\u003ccode\u003einf {x in R | P(X \u003c\u003d x) \u003e 0}\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return lower bound of the support (might be\n     * {@code Double.NEGATIVE_INFINITY})\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistribution.getSupportUpperBound()",
      "begin_line": 137,
      "end_line": 137,
      "comment": "\n     * Access the upper bound of the support. This method must return the same\n     * value as {@code inverseCumulativeProbability(1)}. In other words, this\n     * method must return\n     * \u003cp\u003e\u003ccode\u003einf {x in R | P(X \u003c\u003d x) \u003d 1}\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return upper bound of the support (might be\n     * {@code Double.POSITIVE_INFINITY})\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 149,
      "end_line": 149,
      "comment": "\n     * Whether or not the lower bound of support is in the domain of the density\n     * function.  Returns true iff {@code getSupporLowerBound()} is finite and\n     * {@code density(getSupportLowerBound())} returns a non-NaN, non-infinite\n     * value.\n     *\n     * @return true if the lower bound of support is finite and the density\n     * function returns a non-NaN, non-infinite value there\n     * @deprecated to be removed in 4.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 161,
      "end_line": 161,
      "comment": "\n     * Whether or not the upper bound of support is in the domain of the density\n     * function.  Returns true iff {@code getSupportUpperBound()} is finite and\n     * {@code density(getSupportUpperBound())} returns a non-NaN, non-infinite\n     * value.\n     *\n     * @return true if the upper bound of support is finite and the density\n     * function returns a non-NaN, non-infinite value there\n     * @deprecated to be removed in 4.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistribution.isSupportConnected()",
      "begin_line": 170,
      "end_line": 170,
      "comment": "\n     * Use this method to get information about whether the support is connected,\n     * i.e. whether all values between the lower and upper bound of the support\n     * are included in the support.\n     *\n     * @return whether the support is connected or not\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistribution.reseedRandomGenerator(long)",
      "begin_line": 177,
      "end_line": 177,
      "comment": "\n     * Reseed the random generator used to generate samples.\n     *\n     * @param seed the new seed\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistribution.sample()",
      "begin_line": 184,
      "end_line": 184,
      "comment": "\n     * Generate a random value sampled from this distribution.\n     *\n     * @return a random value.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.RealDistribution.sample(int)",
      "begin_line": 194,
      "end_line": 194,
      "comment": "\n     * Generate a random sample from the distribution.\n     *\n     * @param sampleSize the number of random values to generate\n     * @return an array representing the random sample\n     * @throws org.apache.commons.math3.exception.NotStrictlyPositiveException\n     * if {@code sampleSize} is not positive\n     ",
      "child_ranges": []
    }
  ]
}