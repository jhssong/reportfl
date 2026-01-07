{
  "filepath": "/tmp/Math-44b/src/main/java/org/apache/commons/math/distribution/ContinuousDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ContinuousDistribution",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math.distribution.Distribution"
      ],
      "begin_line": 24,
      "end_line": 68,
      "comment": "\n * Base interface for continuous distributions.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistribution.inverseCumulativeProbability(double)",
      "begin_line": 32,
      "end_line": 32,
      "comment": "\n     * For a distribution, {@code X}, compute {@code x} such that\n     * {@code P(X \u003c x) \u003d p}.\n     *\n     * @param p Cumulative probability.\n     * @return {@code x} such that {@code P(X \u003c x) \u003d p}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistribution.density(double)",
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Probability density for a particular point.\n     *\n     * @param x Point at which the density should be computed.\n     * @return the pdf at point {@code x}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistribution.reseedRandomGenerator(long)",
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Reseed the random generator used to generate samples.\n     *\n     * @param seed New seed.\n     * @since 3.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistribution.sample()",
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Generate a random value sampled from this distribution.\n     *\n     * @return a random value.\n     * @since 3.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistribution.sample(int)",
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Generate a random sample from the distribution.\n     *\n     * @param sampleSize number of random values to generate.\n     * @return an array representing the random sample.\n     * @throws org.apache.commons.math.exception.NotStrictlyPositiveException\n     * if {@code sampleSize} is not positive.\n     * @since 3.0\n     ",
      "child_ranges": []
    }
  ]
}