{
  "filepath": "/tmp/Math-56b/src/main/java/org/apache/commons/math/distribution/IntegerDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IntegerDistribution",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math.distribution.DiscreteDistribution"
      ],
      "begin_line": 26,
      "end_line": 120,
      "comment": "\n * Interface for discrete distributions of integer-valued random variables.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistribution.probability(int)",
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * For a random variable {@code X} whose values are distributed according\n     * to this distribution, this method returns {@code P(X \u003d x)}. In other\n     * words, this method represents the probability mass function for the\n     * distribution.\n     *\n     * @param x Value at which the probability density function is evaluated.\n     * @return the value of the probability density function at {@code x}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistribution.cumulativeProbability(int)",
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * For a random variable {@code X} whose values are distributed according\n     * to this distribution, this method returns {@code P(X \u003c x)}.  In other\n     * words, this method represents the probability distribution function, or\n     * PDF for the distribution.\n     *\n     * @param x Value at which the PDF is evaluated.\n     * @return PDF for this distribution.\n     * @throws MathException if the cumulative probability cannot be\n     * computed due to convergence or other numerical errors.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistribution.cumulativeProbability(int, int)",
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * For this distribution, {@code X}, this method returns\n     * {@code P(x0 \u003c X \u003c x1)}.\n     *\n     * @param x0 the inclusive, lower bound\n     * @param x1 the inclusive, upper bound\n     * @return the cumulative probability.\n     * @throws MathException if the cumulative probability can not be\n     * computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if {@code x0 \u003e x1}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistribution.inverseCumulativeProbability(double)",
      "begin_line": 90,
      "end_line": 90,
      "comment": "\n     * For this distribution, {@code X}, this method returns the largest\n     * {@code x} such that {@code P(X \u003c x) \u003c\u003d p}.\n     * \u003cbr/\u003e\n     * Note that this definition implies:\n     * \u003cul\u003e\n     *  \u003cli\u003e If there is a minimum value, {@code m}, with positive\n     *   probability under (the density of) {@code X}, then {@code m - 1} is\n     *   returned by {@code inverseCumulativeProbability(0).}  If there is\n     *   no such value {@code m},  {@code Integer.MIN_VALUE} is returned.\n     *  \u003c/li\u003e\n     *  \u003cli\u003e If there is a maximum value, {@code M}, such that\n     *   {@code P(X \u003c M) \u003d 1}, then {@code M} is returned by\n     *   {@code inverseCumulativeProbability(1)}.\n     *   If there is no such value, {@code M}, {@code Integer.MAX_VALUE} is\n     *   returned.\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param p Cumulative probability.\n     * @return the largest {@code x} such that {@code P(X \u003c x) \u003c\u003d p}.\n     * @throws MathException if the inverse cumulative probability cannot be\n     * computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if {@code p} is not between 0 and 1\n     * (inclusive).\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistribution.reseedRandomGenerator(long)",
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n     * Reseed the random generator used to generate samples.\n     *\n     * @param seed New seed.\n     * @since 3.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistribution.sample()",
      "begin_line": 107,
      "end_line": 107,
      "comment": "\n     * Generate a random value sampled from this distribution.\n     *\n     * @return a random value.\n     * @throws MathException if an error occurs generating the random value.\n     * @since 3.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistribution.sample(int)",
      "begin_line": 119,
      "end_line": 119,
      "comment": "\n     * Generate a random sample from the distribution.\n     *\n     * @param sampleSize number of random values to generate.\n     * @return an array representing the random sample.\n     * @throws MathException if an error occurs generating the sample.\n     * @throws org.apache.commons.math.exception.NotStrictlyPositiveException\n     * if {@code sampleSize} is not positive.\n     * @since 3.0\n     ",
      "child_ranges": []
    }
  ]
}