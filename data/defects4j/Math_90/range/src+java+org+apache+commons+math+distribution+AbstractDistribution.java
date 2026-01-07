{
  "filepath": "/tmp/Math-90b/src/java/org/apache/commons/math/distribution/AbstractDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.Distribution",
        "java.io.Serializable"
      ],
      "begin_line": 28,
      "end_line": 66,
      "comment": "\n * Base class for probability distributions.   \n *  \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.AbstractDistribution.AbstractDistribution()",
      "begin_line": 37,
      "end_line": 39,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractDistribution.cumulativeProbability(double, double)",
      "begin_line": 58,
      "end_line": 65,
      "comment": "\n     * For a random variable X whose values are distributed according\n     * to this distribution, this method returns P(x0 \u0026le; X \u0026le; x1).\n     * \u003cp\u003e\n     * The default implementation uses the identity\u003c/p\u003e\n     * \u003cp\u003e\n     * P(x0 \u0026le; X \u0026le; x1) \u003d P(X \u0026le; x1) - P(X \u0026le; x0) \u003c/p\u003e\n     * \n     * @param x0 the (inclusive) lower bound\n     * @param x1 the (inclusive) upper bound\n     * @return the probability that a random variable with this distribution\n     * will take a value between \u003ccode\u003ex0\u003c/code\u003e and \u003ccode\u003ex1\u003c/code\u003e,\n     * including the endpoints.\n     * @throws MathException if the cumulative probability can not be\n     * computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if \u003ccode\u003ex0 \u003e x1\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 64,col 69)"
      ]
    }
  ]
}