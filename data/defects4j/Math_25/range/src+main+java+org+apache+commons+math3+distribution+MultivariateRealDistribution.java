{
  "filepath": "/tmp/Math-25b/src/main/java/org/apache/commons/math3/distribution/MultivariateRealDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultivariateRealDistribution",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 130,
      "comment": "\n * Base interface for multivariate distributions on the reals.\n *\n * This is based largely on the RealDistribution interface, but cumulative\n * distribution functions are not required because they are often quite\n * difficult to compute for multivariate distributions.\n *\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MultivariateRealDistribution.probability(double[])",
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * For a random variable {@code X} whose values are distributed according to\n     * this distribution, this method returns {@code P(X \u003d x)}. In other words,\n     * this method represents the probability mass function (PMF) for the\n     * distribution.\n     *\n     * @param x Point at which the PMF is evaluated.\n     * @return the value of the probability mass function at point {@code x}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MultivariateRealDistribution.density(double[])",
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Returns the probability density function (PDF) of this distribution\n     * evaluated at the specified point {@code x}. In general, the PDF is the\n     * derivative of the cumulative distribution function. If the derivative\n     * does not exist at {@code x}, then an appropriate replacement should be\n     * returned, e.g. {@code Double.POSITIVE_INFINITY}, {@code Double.NaN}, or\n     * the limit inferior or limit superior of the difference quotient.\n     *\n     * @param x Point at which the PDF is evaluated.\n     * @return the value of the probability density function at point {@code x}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MultivariateRealDistribution.getSupportLowerBound()",
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Access the lower bound of the support.\n     * This method must return the same value as {@code inverseCumulativeProbability(0)}.\n     * In other words, this method must return\n     * \u003cp\u003e\n     * \u003ccode\u003einf {x in R | P(X \u003c\u003d x) \u003e 0}\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * @return the lower bound of the support (might be\n     * {@code Double.NEGATIVE_INFINITY}).\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MultivariateRealDistribution.getSupportUpperBound()",
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * Access the upper bound of the support.\n     * This method must return the same value as {@code inverseCumulativeProbability(1)}.\n     * In other words, this method must return\n     * \u003cp\u003e\n     * \u003ccode\u003einf {x in R | P(X \u003c\u003d x) \u003d 1}\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * @return the upper bound of the support (might be\n     * {@code Double.POSITIVE_INFINITY}).\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MultivariateRealDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * Gets information about whether the lower bound of the support is\n     * inclusive or not.\n     *\n     * @return whether the lower bound of the support is inclusive or not.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MultivariateRealDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 96,
      "end_line": 96,
      "comment": "\n     * gets information about whether the upper bound of the support is\n     * inclusive or not.\n     *\n     * @return whether the upper bound of the support is inclusive or not.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MultivariateRealDistribution.isSupportConnected()",
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n     * Gets information about whether the support is connected (i.e. all\n     * values between the lower and upper bound of the support are included\n     * in the support).\n     *\n     * @return whether the support is connected or not.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MultivariateRealDistribution.reseedRandomGenerator(long)",
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n     * Reseeds the random generator used to generate samples.\n     *\n     * @param seed Seed with which to initialize the random number generator.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MultivariateRealDistribution.sample()",
      "begin_line": 119,
      "end_line": 119,
      "comment": "\n     * Generates a random value vector sampled from this distribution.\n     *\n     * @return a random value vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MultivariateRealDistribution.sample(int)",
      "begin_line": 129,
      "end_line": 129,
      "comment": "\n     * Generates a list of a random value vectors from the distribution.\n     *\n     * @param sampleSize the number of random vectors to generate.\n     * @return an array representing the random samples.\n     * @throws org.apache.commons.math3.exception.NotStrictlyPositiveException\n     * if {@code sampleSize} is not positive.\n     ",
      "child_ranges": []
    }
  ]
}