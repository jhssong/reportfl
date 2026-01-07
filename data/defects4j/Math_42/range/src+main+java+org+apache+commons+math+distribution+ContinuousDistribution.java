{
  "filepath": "/tmp/Math-42b/src/main/java/org/apache/commons/math/distribution/ContinuousDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ContinuousDistribution",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math.distribution.Distribution"
      ],
      "begin_line": 26,
      "end_line": 78,
      "comment": "\n * Base interface for continuous distributions.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistribution.inverseCumulativeProbability(double)",
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Computes the quantile function of this distribution. For a random\n     * variable {@code X} distributed according to this distribution, the\n     * returned value is\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003einf{x in R | P(X\u003c\u003dx) \u003e\u003d p}\u003c/code\u003e for {@code 0 \u003c p \u003c\u003d 1},\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003einf{x in R | P(X\u003c\u003dx) \u003e 0}\u003c/code\u003e for {@code p \u003d 0}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param p the cumulative probability\n     * @return the smallest {@code p}-quantile of this distribution\n     * (largest 0-quantile for {@code p \u003d 0})\n     * @throws OutOfRangeException if {@code p \u003c 0} or {@code p \u003e 1}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistribution.density(double)",
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Returns the probability density function (PDF) of this distribution\n     * evaluated at the specified point.\n     *\n     * @param x the point at which the PDF should be evaluated\n     * @return the PDF at point {@code x}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistribution.reseedRandomGenerator(long)",
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Reseed the random generator used to generate samples.\n     *\n     * @param seed New seed.\n     * @since 3.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistribution.sample()",
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Generate a random value sampled from this distribution.\n     *\n     * @return a random value.\n     * @since 3.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.ContinuousDistribution.sample(int)",
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * Generate a random sample from the distribution.\n     *\n     * @param sampleSize number of random values to generate.\n     * @return an array representing the random sample.\n     * @throws org.apache.commons.math.exception.NotStrictlyPositiveException\n     * if {@code sampleSize} is not positive.\n     * @since 3.0\n     ",
      "child_ranges": []
    }
  ]
}