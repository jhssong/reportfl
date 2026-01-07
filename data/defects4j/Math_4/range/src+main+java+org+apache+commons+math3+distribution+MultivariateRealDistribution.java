{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/MultivariateRealDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultivariateRealDistribution",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 79,
      "comment": "\n * Base interface for multivariate distributions on the reals.\n *\n * This is based largely on the RealDistribution interface, but cumulative\n * distribution functions are not required because they are often quite\n * difficult to compute for multivariate distributions.\n *\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MultivariateRealDistribution.density(double[])",
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Returns the probability density function (PDF) of this distribution\n     * evaluated at the specified point {@code x}. In general, the PDF is the\n     * derivative of the cumulative distribution function. If the derivative\n     * does not exist at {@code x}, then an appropriate replacement should be\n     * returned, e.g. {@code Double.POSITIVE_INFINITY}, {@code Double.NaN}, or\n     * the limit inferior or limit superior of the difference quotient.\n     *\n     * @param x Point at which the PDF is evaluated.\n     * @return the value of the probability density function at point {@code x}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MultivariateRealDistribution.reseedRandomGenerator(long)",
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Reseeds the random generator used to generate samples.\n     *\n     * @param seed Seed with which to initialize the random number generator.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MultivariateRealDistribution.getDimension()",
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Gets the number of random variables of the distribution.\n     * It is the size of the array returned by the {@link #sample() sample}\n     * method.\n     *\n     * @return the number of variables.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MultivariateRealDistribution.sample()",
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Generates a random value vector sampled from this distribution.\n     *\n     * @return a random value vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MultivariateRealDistribution.sample(int)",
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * Generates a list of a random value vectors from the distribution.\n     *\n     * @param sampleSize the number of random vectors to generate.\n     * @return an array representing the random samples.\n     * @throws org.apache.commons.math3.exception.NotStrictlyPositiveException\n     * if {@code sampleSize} is not positive.\n     *\n     * @see #sample()\n     ",
      "child_ranges": []
    }
  ]
}