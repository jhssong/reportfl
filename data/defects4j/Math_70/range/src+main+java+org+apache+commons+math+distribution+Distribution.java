{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/distribution/Distribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Distribution",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 55,
      "comment": "\n * Base interface for probability distributions.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.Distribution.cumulativeProbability(double)",
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * For a random variable X whose values are distributed according\n     * to this distribution, this method returns P(X \u0026le; x).  In other words,\n     * this method represents the  (cumulative) distribution function, or\n     * CDF, for this distribution.\n     *\n     * @param x the value at which the distribution function is evaluated.\n     * @return the probability that a random variable with this\n     * distribution takes a value less than or equal to \u003ccode\u003ex\u003c/code\u003e\n     * @throws MathException if the cumulative probability can not be\n     * computed due to convergence or other numerical errors.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.Distribution.cumulativeProbability(double, double)",
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * For a random variable X whose values are distributed according\n     * to this distribution, this method returns P(x0 \u0026le; X \u0026le; x1).\n     *\n     * @param x0 the (inclusive) lower bound\n     * @param x1 the (inclusive) upper bound\n     * @return the probability that a random variable with this distribution\n     * will take a value between \u003ccode\u003ex0\u003c/code\u003e and \u003ccode\u003ex1\u003c/code\u003e,\n     * including the endpoints\n     * @throws MathException if the cumulative probability can not be\n     * computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if \u003ccode\u003ex0 \u003e x1\u003c/code\u003e\n     ",
      "child_ranges": []
    }
  ]
}