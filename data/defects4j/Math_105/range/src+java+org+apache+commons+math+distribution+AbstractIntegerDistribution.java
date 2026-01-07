{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/distribution/AbstractIntegerDistribution.java",
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
      "begin_line": 30,
      "end_line": 192,
      "comment": "\n * Base class for integer-valued discrete distributions.  Default\n * implementations are provided for some of the methods that do not vary\n * from distribution to distribution.\n *  \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.AbstractIntegerDistribution()",
      "begin_line": 39,
      "end_line": 41,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.cumulativeProbability(double)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * For a random variable X whose values are distributed according\n     * to this distribution, this method returns P(X \u0026le; x).  In other words,\n     * this method represents the  (cumulative) distribution function, or\n     * CDF, for this distribution.\n     * \u003cp\u003e\n     * If \u003ccode\u003ex\u003c/code\u003e does not represent an integer value, the CDF is \n     * evaluated at the greatest integer less than x.\n     * \n     * @param x the value at which the distribution function is evaluated.\n     * @return cumulative probability that a random variable with this\n     * distribution takes a value less than or equal to \u003ccode\u003ex\u003c/code\u003e\n     * @throws MathException if the cumulative probability can not be\n     * computed due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.cumulativeProbability(int)",
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * For a random variable X whose values are distributed according\n     * to this distribution, this method returns P(X \u0026le; x).  In other words,\n     * this method represents the probability distribution function, or PDF,\n     * for this distribution.\n     * \n     * @param x the value at which the PDF is evaluated.\n     * @return PDF for this distribution. \n     * @throws MathException if the cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.probability(double)",
      "begin_line": 85,
      "end_line": 92,
      "comment": "\n     * For a random variable X whose values are distributed according\n     * to this distribution, this method returns P(X \u003d x). In other words, this\n     * method represents the probability mass function,  or PMF, for the distribution.\n     * \u003cp\u003e\n     * If \u003ccode\u003ex\u003c/code\u003e does not represent an integer value, 0 is returned.\n     * \n     * @param x the value at which the probability density function is evaluated\n     * @return the value of the probability density function at x\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 34)",
        "(line 87,col 9)-(line 91,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.cumulativeProbability(int, int)",
      "begin_line": 105,
      "end_line": 111,
      "comment": "\n    * For a random variable X whose values are distributed according\n     * to this distribution, this method returns P(x0 \u0026le; X \u0026le; x1).\n     * \n     * @param x0 the inclusive, lower bound\n     * @param x1 the inclusive, upper bound\n     * @return the cumulative probability. \n     * @throws MathException if the cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if x0 \u003e x1\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.inverseCumulativeProbability(double)",
      "begin_line": 124,
      "end_line": 169,
      "comment": "\n     * For a random variable X whose values are distributed according\n     * to this distribution, this method returns the largest x, such\n     * that P(X \u0026le; x) \u0026le; \u003ccode\u003ep\u003c/code\u003e.\n     *\n     * @param p the desired probability\n     * @return the largest x such that P(X \u0026le; x) \u003c\u003d p\n     * @throws MathException if the inverse cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if p \u003c 0 or p \u003e 1\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 128,col 9)",
        "(line 132,col 9)-(line 132,col 40)",
        "(line 133,col 9)-(line 133,col 40)",
        "(line 134,col 9)-(line 134,col 18)",
        "(line 135,col 9)-(line 159,col 9)",
        "(line 162,col 9)-(line 162,col 39)",
        "(line 163,col 9)-(line 166,col 9)",
        "(line 168,col 9)-(line 168,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.getDomainLowerBound(double)",
      "begin_line": 180,
      "end_line": 180,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     * \n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.getDomainUpperBound(double)",
      "begin_line": 191,
      "end_line": 191,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     * \n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e \n     ",
      "child_ranges": []
    }
  ]
}