{
  "filepath": "/tmp/Math-38b/src/main/java/org/apache/commons/math/distribution/IntegerDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IntegerDistribution",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 24,
      "end_line": 152,
      "comment": "\n * Interface for distributions on the integers.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistribution.probability(int)",
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     * For a random variable {@code X} whose values are distributed according\n     * to this distribution, this method returns {@code P(X \u003d x)}. In other\n     * words, this method represents the probability mass function for the\n     * distribution.\n     *\n     * @param x the point at which the probability density function is evaluated.\n     * @return the value of the probability density function at {@code x}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistribution.cumulativeProbability(int)",
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * For a random variable {@code X} whose values are distributed according\n     * to this distribution, this method returns {@code P(X \u003c\u003d x)}.  In other\n     * words, this method represents the probability distribution function, or\n     * PDF for the distribution.\n     *\n     * @param x the point at which the PDF is evaluated\n     * @return PDF for this distribution.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistribution.cumulativeProbability(int, int)",
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * For a random variable {@code X} whose values are distributed according\n     * to this distribution, this method returns {@code P(x0 \u003c\u003d X \u003c\u003d x1)}.\n     *\n     * @param x0 the inclusive lower bound\n     * @param x1 the inclusive upper bound\n     * @return the cumulative probability\n     * @throws IllegalArgumentException if {@code x0 \u003e x1}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistribution.inverseCumulativeProbability(double)",
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * For this distribution, {@code X}, this method returns the largest\n     * {@code x} such that {@code P(X \u003c\u003d x) \u003c\u003d p}.\n     * \u003cbr/\u003e\n     * Note that this definition implies:\n     * \u003cul\u003e\n     *  \u003cli\u003e If there is a minimum value, {@code m}, with positive\n     *   probability under (the density of) {@code X}, then {@code m - 1} is\n     *   returned by {@code inverseCumulativeProbability(0).}  If there is\n     *   no such value {@code m},  {@code Integer.MIN_VALUE} is returned.\n     *  \u003c/li\u003e\n     *  \u003cli\u003e If there is a maximum value, {@code M}, such that\n     *   {@code P(X \u003c\u003d M) \u003d 1}, then {@code M} is returned by\n     *   {@code inverseCumulativeProbability(1)}.\n     *   If there is no such value, {@code M}, {@code Integer.MAX_VALUE} is\n     *   returned.\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param p the cumulative probability\n     * @return the largest {@code x} such that {@code P(X \u003c x) \u003c\u003d p}\n     * @throws IllegalArgumentException if {@code p} is not between 0 and 1\n     * (inclusive)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistribution.getNumericalMean()",
      "begin_line": 90,
      "end_line": 90,
      "comment": "\n     * Use this method to get the numerical value of the mean of this\n     * distribution.\n     *\n     * @return the mean or {@code Double.NaN} if it is not defined\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistribution.getNumericalVariance()",
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * Use this method to get the numerical value of the variance of this\n     * distribution.\n     *\n     * @return the variance (possibly {@code Double.POSITIVE_INFINITY} or\n     * {@code Double.NaN} if it is not defined)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistribution.getSupportLowerBound()",
      "begin_line": 107,
      "end_line": 107,
      "comment": "\n     * Access the lower bound of the support.\n     *\n     * @return lower bound of the support ({@code Integer.MIN_VALUE}\n     * for negative infinity)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistribution.getSupportUpperBound()",
      "begin_line": 115,
      "end_line": 115,
      "comment": "\n     * Access the upper bound of the support.\n     *\n     * @return upper bound of the support ({@code Integer.MAX_VALUE}\n     * for positive infinity)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistribution.isSupportConnected()",
      "begin_line": 124,
      "end_line": 124,
      "comment": "\n     * Use this method to get information about whether the support is\n     * connected, i.e. whether all integers between the lower and upper bound of\n     * the support are included in the support.\n     *\n     * @return whether the support is connected or not\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistribution.reseedRandomGenerator(long)",
      "begin_line": 132,
      "end_line": 132,
      "comment": "\n     * Reseed the random generator used to generate samples.\n     *\n     * @param seed the new seed\n     * @since 3.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistribution.sample()",
      "begin_line": 140,
      "end_line": 140,
      "comment": "\n     * Generate a random value sampled from this distribution.\n     *\n     * @return a random value\n     * @since 3.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistribution.sample(int)",
      "begin_line": 151,
      "end_line": 151,
      "comment": "\n     * Generate a random sample from the distribution.\n     *\n     * @param sampleSize the number of random values to generate\n     * @return an array representing the random sample\n     * @throws org.apache.commons.math.exception.NotStrictlyPositiveException\n     * if {@code sampleSize} is not positive\n     * @since 3.0\n     ",
      "child_ranges": []
    }
  ]
}