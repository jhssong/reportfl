{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/IntegerDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IntegerDistribution",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 156,
      "comment": "\n * Interface for distributions on the integers.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistribution.probability(int)",
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * For a random variable {@code X} whose values are distributed according\n     * to this distribution, this method returns {@code P(X \u003d x)}. In other\n     * words, this method represents the probability mass function (PMF)\n     * for the distribution.\n     *\n     * @param x the point at which the PMF is evaluated\n     * @return the value of the probability mass function at {@code x}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistribution.cumulativeProbability(int)",
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * For a random variable {@code X} whose values are distributed according\n     * to this distribution, this method returns {@code P(X \u003c\u003d x)}.  In other\n     * words, this method represents the (cumulative) distribution function\n     * (CDF) for this distribution.\n     *\n     * @param x the point at which the CDF is evaluated\n     * @return the probability that a random variable with this\n     * distribution takes a value less than or equal to {@code x}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistribution.cumulativeProbability(int, int)",
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * For a random variable {@code X} whose values are distributed according\n     * to this distribution, this method returns {@code P(x0 \u003c X \u003c\u003d x1)}.\n     *\n     * @param x0 the exclusive lower bound\n     * @param x1 the inclusive upper bound\n     * @return the probability that a random variable with this distribution\n     * will take a value between {@code x0} and {@code x1},\n     * excluding the lower and including the upper endpoint\n     * @throws NumberIsTooLargeException if {@code x0 \u003e x1}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistribution.inverseCumulativeProbability(double)",
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * Computes the quantile function of this distribution.\n     * For a random variable {@code X} distributed according to this distribution,\n     * the returned value is\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003einf{x in Z | P(X\u003c\u003dx) \u003e\u003d p}\u003c/code\u003e for {@code 0 \u003c p \u003c\u003d 1},\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003einf{x in Z | P(X\u003c\u003dx) \u003e 0}\u003c/code\u003e for {@code p \u003d 0}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * If the result exceeds the range of the data type {@code int},\n     * then {@code Integer.MIN_VALUE} or {@code Integer.MAX_VALUE} is returned.\n     *\n     * @param p the cumulative probability\n     * @return the smallest {@code p}-quantile of this distribution\n     * (largest 0-quantile for {@code p \u003d 0})\n     * @throws OutOfRangeException if {@code p \u003c 0} or {@code p \u003e 1}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistribution.getNumericalMean()",
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * Use this method to get the numerical value of the mean of this\n     * distribution.\n     *\n     * @return the mean or {@code Double.NaN} if it is not defined\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistribution.getNumericalVariance()",
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n     * Use this method to get the numerical value of the variance of this\n     * distribution.\n     *\n     * @return the variance (possibly {@code Double.POSITIVE_INFINITY} or\n     * {@code Double.NaN} if it is not defined)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistribution.getSupportLowerBound()",
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n     * Access the lower bound of the support. This method must return the same\n     * value as {@code inverseCumulativeProbability(0)}. In other words, this\n     * method must return\n     * \u003cp\u003e\u003ccode\u003einf {x in Z | P(X \u003c\u003d x) \u003e 0}\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return lower bound of the support ({@code Integer.MIN_VALUE}\n     * for negative infinity)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistribution.getSupportUpperBound()",
      "begin_line": 119,
      "end_line": 119,
      "comment": "\n     * Access the upper bound of the support. This method must return the same\n     * value as {@code inverseCumulativeProbability(1)}. In other words, this\n     * method must return\n     * \u003cp\u003e\u003ccode\u003einf {x in R | P(X \u003c\u003d x) \u003d 1}\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return upper bound of the support ({@code Integer.MAX_VALUE}\n     * for positive infinity)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistribution.isSupportConnected()",
      "begin_line": 128,
      "end_line": 128,
      "comment": "\n     * Use this method to get information about whether the support is\n     * connected, i.e. whether all integers between the lower and upper bound of\n     * the support are included in the support.\n     *\n     * @return whether the support is connected or not\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistribution.reseedRandomGenerator(long)",
      "begin_line": 136,
      "end_line": 136,
      "comment": "\n     * Reseed the random generator used to generate samples.\n     *\n     * @param seed the new seed\n     * @since 3.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistribution.sample()",
      "begin_line": 144,
      "end_line": 144,
      "comment": "\n     * Generate a random value sampled from this distribution.\n     *\n     * @return a random value\n     * @since 3.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.IntegerDistribution.sample(int)",
      "begin_line": 155,
      "end_line": 155,
      "comment": "\n     * Generate a random sample from the distribution.\n     *\n     * @param sampleSize the number of random values to generate\n     * @return an array representing the random sample\n     * @throws org.apache.commons.math3.exception.NotStrictlyPositiveException\n     * if {@code sampleSize} is not positive\n     * @since 3.0\n     ",
      "child_ranges": []
    }
  ]
}