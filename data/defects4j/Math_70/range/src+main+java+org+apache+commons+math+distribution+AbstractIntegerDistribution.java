{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/distribution/AbstractIntegerDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractIntegerDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractDistribution",
        "org.apache.commons.math.distribution.IntegerDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 256,
      "comment": "\n * Base class for integer-valued discrete distributions.  Default\n * implementations are provided for some of the methods that do not vary\n * from distribution to distribution.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "WRONG_ORDER_ENDPOINTS_MESSAGE"
      ],
      "begin_line": 37,
      "end_line": 38,
      "comment": " Message for endpoints in wrong order. "
    },
    {
      "type": "field",
      "varNames": [
        "OUT_OF_RANGE_POINT"
      ],
      "begin_line": 41,
      "end_line": 42,
      "comment": " Message for out of range point. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.AbstractIntegerDistribution()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.cumulativeProbability(double)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * For a random variable X whose values are distributed according\n     * to this distribution, this method returns P(X \u0026le; x).  In other words,\n     * this method represents the  (cumulative) distribution function, or\n     * CDF, for this distribution.\n     * \u003cp\u003e\n     * If \u003ccode\u003ex\u003c/code\u003e does not represent an integer value, the CDF is\n     * evaluated at the greatest integer less than x.\n     *\n     * @param x the value at which the distribution function is evaluated.\n     * @return cumulative probability that a random variable with this\n     * distribution takes a value less than or equal to \u003ccode\u003ex\u003c/code\u003e\n     * @throws MathException if the cumulative probability can not be\n     * computed due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.cumulativeProbability(double, double)",
      "begin_line": 86,
      "end_line": 100,
      "comment": "\n     * For a random variable X whose values are distributed according\n     * to this distribution, this method returns P(x0 \u0026le; X \u0026le; x1).\n     *\n     * @param x0 the (inclusive) lower bound\n     * @param x1 the (inclusive) upper bound\n     * @return the probability that a random variable with this distribution\n     * will take a value between \u003ccode\u003ex0\u003c/code\u003e and \u003ccode\u003ex1\u003c/code\u003e,\n     * including the endpoints.\n     * @throws MathException if the cumulative probability can not be\n     * computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if \u003ccode\u003ex0 \u003e x1\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 99,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.cumulativeProbability(int)",
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n     * For a random variable X whose values are distributed according\n     * to this distribution, this method returns P(X \u0026le; x).  In other words,\n     * this method represents the probability distribution function, or PDF,\n     * for this distribution.\n     *\n     * @param x the value at which the PDF is evaluated.\n     * @return PDF for this distribution.\n     * @throws MathException if the cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.probability(double)",
      "begin_line": 125,
      "end_line": 132,
      "comment": "\n     * For a random variable X whose values are distributed according\n     * to this distribution, this method returns P(X \u003d x). In other words, this\n     * method represents the probability mass function,  or PMF, for the distribution.\n     * \u003cp\u003e\n     * If \u003ccode\u003ex\u003c/code\u003e does not represent an integer value, 0 is returned.\n     *\n     * @param x the value at which the probability density function is evaluated\n     * @return the value of the probability density function at x\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 34)",
        "(line 127,col 9)-(line 131,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.cumulativeProbability(int, int)",
      "begin_line": 145,
      "end_line": 151,
      "comment": "\n    * For a random variable X whose values are distributed according\n     * to this distribution, this method returns P(x0 \u0026le; X \u0026le; x1).\n     *\n     * @param x0 the inclusive, lower bound\n     * @param x1 the inclusive, upper bound\n     * @return the cumulative probability.\n     * @throws MathException if the cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if x0 \u003e x1\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.inverseCumulativeProbability(double)",
      "begin_line": 164,
      "end_line": 209,
      "comment": "\n     * For a random variable X whose values are distributed according\n     * to this distribution, this method returns the largest x, such\n     * that P(X \u0026le; x) \u0026le; \u003ccode\u003ep\u003c/code\u003e.\n     *\n     * @param p the desired probability\n     * @return the largest x such that P(X \u0026le; x) \u003c\u003d p\n     * @throws MathException if the inverse cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if p \u003c 0 or p \u003e 1\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 168,col 9)",
        "(line 172,col 9)-(line 172,col 40)",
        "(line 173,col 9)-(line 173,col 40)",
        "(line 174,col 9)-(line 174,col 18)",
        "(line 175,col 9)-(line 199,col 9)",
        "(line 202,col 9)-(line 202,col 46)",
        "(line 203,col 9)-(line 206,col 9)",
        "(line 208,col 9)-(line 208,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.checkedCumulativeProbability(int)",
      "begin_line": 221,
      "end_line": 233,
      "comment": "\n     * Computes the cumulative probablity function and checks for NaN values returned.\n     * Throws MathException if the value is NaN. Wraps and rethrows any MathException encountered\n     * evaluating the cumulative probability function in a FunctionEvaluationException. Throws\n     * FunctionEvaluationException of the cumulative probability function returns NaN.\n     *\n     * @param argument input value\n     * @return cumulative probability\n     * @throws FunctionEvaluationException if a MathException occurs computing the cumulative probability\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 35)",
        "(line 223,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.getDomainLowerBound(double)",
      "begin_line": 244,
      "end_line": 244,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.getDomainUpperBound(double)",
      "begin_line": 255,
      "end_line": 255,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": []
    }
  ]
}