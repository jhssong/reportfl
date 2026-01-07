{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/distribution/IntegerDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IntegerDistribution",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math.distribution.DiscreteDistribution"
      ],
      "begin_line": 26,
      "end_line": 84,
      "comment": "\n * Interface for discrete distributions of integer-valued random variables.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistribution.probability(int)",
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * For a random variable X whose values are distributed according\n     * to this distribution, this method returns P(X \u003d x). In other words, this\n     * method represents the probability mass function for the distribution.\n     *\n     * @param x the value at which the probability density function is evaluated.\n     * @return the value of the probability density function at x\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistribution.cumulativeProbability(int)",
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * For a random variable X whose values are distributed according\n     * to this distribution, this method returns P(X \u0026le; x).  In other words,\n     * this method represents the probability distribution function, or PDF\n     * for the distribution.\n     *\n     * @param x the value at which the PDF is evaluated.\n     * @return PDF for this distribution.\n     * @throws MathException if the cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistribution.cumulativeProbability(int, int)",
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * For this distribution, X, this method returns P(x0 \u0026le; X \u0026le; x1).\n     * @param x0 the inclusive, lower bound\n     * @param x1 the inclusive, upper bound\n     * @return the cumulative probability.\n     * @throws MathException if the cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if x0 \u003e x1\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.IntegerDistribution.inverseCumulativeProbability(double)",
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * For this distribution, X, this method returns the largest x such that\n     * P(X \u0026le; x) \u003c\u003d p.\n     * \u003cp\u003e\n     * Note that this definition implies: \u003cul\u003e\n     * \u003cli\u003e If there is a minimum value, \u003ccode\u003em\u003c/code\u003e, with postive\n     * probablility under (the density of) X, then \u003ccode\u003em - 1\u003c/code\u003e is\n     * returned by \u003ccode\u003einverseCumulativeProbability(0).\u003c/code\u003e  If there is\n     * no such value \u003ccode\u003em,  Integer.MIN_VALUE\u003c/code\u003e is\n     * returned.\u003c/li\u003e\n     * \u003cli\u003e If there is a maximum value, \u003ccode\u003eM\u003c/code\u003e, such that\n     * P(X \u0026le; M) \u003d1, then \u003ccode\u003eM\u003c/code\u003e is returned by\n     * \u003ccode\u003einverseCumulativeProbability(1).\u003c/code\u003e\n     * If there is no such value, \u003ccode\u003eM, Integer.MAX_VALUE\u003c/code\u003e is\n     * returned.\u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param p the cumulative probability.\n     * @return the largest x such that P(X \u0026le; x) \u003c\u003d p\n     * @throws MathException if the inverse cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if p is not between 0 and 1 (inclusive)\n     ",
      "child_ranges": []
    }
  ]
}