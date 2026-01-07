{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/distribution/AbstractIntegerDistribution.java",
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
      "begin_line": 36,
      "end_line": 301,
      "comment": "\n * Base class for integer-valued discrete distributions.  Default\n * implementations are provided for some of the methods that do not vary\n * from distribution to distribution.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * RandomData instance used to generate samples from the distribution\n     * @since 2.2\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.AbstractIntegerDistribution()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.cumulativeProbability(double)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * For a random variable X whose values are distributed according\n     * to this distribution, this method returns P(X \u0026le; x).  In other words,\n     * this method represents the  (cumulative) distribution function, or\n     * CDF, for this distribution.\n     * \u003cp\u003e\n     * If \u003ccode\u003ex\u003c/code\u003e does not represent an integer value, the CDF is\n     * evaluated at the greatest integer less than x.\n     *\n     * @param x the value at which the distribution function is evaluated.\n     * @return cumulative probability that a random variable with this\n     * distribution takes a value less than or equal to \u003ccode\u003ex\u003c/code\u003e\n     * @throws MathException if the cumulative probability can not be\n     * computed due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.cumulativeProbability(double, double)",
      "begin_line": 87,
      "end_line": 101,
      "comment": "\n     * For a random variable X whose values are distributed according\n     * to this distribution, this method returns P(x0 \u0026le; X \u0026le; x1).\n     *\n     * @param x0 the (inclusive) lower bound\n     * @param x1 the (inclusive) upper bound\n     * @return the probability that a random variable with this distribution\n     * will take a value between \u003ccode\u003ex0\u003c/code\u003e and \u003ccode\u003ex1\u003c/code\u003e,\n     * including the endpoints.\n     * @throws MathException if the cumulative probability can not be\n     * computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if \u003ccode\u003ex0 \u003e x1\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 100,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.cumulativeProbability(int)",
      "begin_line": 114,
      "end_line": 114,
      "comment": "\n     * For a random variable X whose values are distributed according\n     * to this distribution, this method returns P(X \u0026le; x).  In other words,\n     * this method represents the probability distribution function, or PDF,\n     * for this distribution.\n     *\n     * @param x the value at which the PDF is evaluated.\n     * @return PDF for this distribution.\n     * @throws MathException if the cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.probability(double)",
      "begin_line": 126,
      "end_line": 133,
      "comment": "\n     * For a random variable X whose values are distributed according\n     * to this distribution, this method returns P(X \u003d x). In other words, this\n     * method represents the probability mass function,  or PMF, for the distribution.\n     * \u003cp\u003e\n     * If \u003ccode\u003ex\u003c/code\u003e does not represent an integer value, 0 is returned.\n     *\n     * @param x the value at which the probability density function is evaluated\n     * @return the value of the probability density function at x\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 38)",
        "(line 128,col 9)-(line 132,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.cumulativeProbability(int, int)",
      "begin_line": 146,
      "end_line": 152,
      "comment": "\n    * For a random variable X whose values are distributed according\n     * to this distribution, this method returns P(x0 \u0026le; X \u0026le; x1).\n     *\n     * @param x0 the inclusive, lower bound\n     * @param x1 the inclusive, upper bound\n     * @return the cumulative probability.\n     * @throws MathException if the cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if x0 \u003e x1\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.inverseCumulativeProbability(double)",
      "begin_line": 165,
      "end_line": 210,
      "comment": "\n     * For a random variable X whose values are distributed according\n     * to this distribution, this method returns the largest x, such\n     * that P(X \u0026le; x) \u0026le; \u003ccode\u003ep\u003c/code\u003e.\n     *\n     * @param p the desired probability\n     * @return the largest x such that P(X \u0026le; x) \u003c\u003d p\n     * @throws MathException if the inverse cumulative probability can not be\n     *            computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if p \u003c 0 or p \u003e 1\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 169,col 9)",
        "(line 173,col 9)-(line 173,col 40)",
        "(line 174,col 9)-(line 174,col 40)",
        "(line 175,col 9)-(line 175,col 18)",
        "(line 176,col 9)-(line 200,col 9)",
        "(line 203,col 9)-(line 203,col 46)",
        "(line 204,col 9)-(line 207,col 9)",
        "(line 209,col 9)-(line 209,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.reseedRandomGenerator(long)",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\n     * Reseeds the random generator used to generate samples.\n     *\n     * @param seed the new seed\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.sample()",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\n     * Generates a random value sampled from this distribution. The default\n     * implementation uses the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Inverse_transform_sampling\"\u003e inversion method.\u003c/a\u003e\n     *\n     * @return random value\n     * @since 2.2\n     * @throws MathException if an error occurs generating the random value\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.sample(int)",
      "begin_line": 245,
      "end_line": 254,
      "comment": "\n     * Generates a random sample from the distribution.  The default implementation\n     * generates the sample by calling {@link #sample()} in a loop.\n     *\n     * @param sampleSize number of random values to generate\n     * @since 2.2\n     * @return an array representing the random sample\n     * @throws MathException if an error occurs generating the sample\n     * @throws IllegalArgumentException if sampleSize is not positive\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 40)",
        "(line 250,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 253,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.checkedCumulativeProbability(int)",
      "begin_line": 266,
      "end_line": 278,
      "comment": "\n     * Computes the cumulative probability function and checks for NaN values returned.\n     * Throws MathException if the value is NaN. Wraps and rethrows any MathException encountered\n     * evaluating the cumulative probability function in a FunctionEvaluationException. Throws\n     * FunctionEvaluationException of the cumulative probability function returns NaN.\n     *\n     * @param argument input value\n     * @return cumulative probability\n     * @throws FunctionEvaluationException if a MathException occurs computing the cumulative probability\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 35)",
        "(line 268,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 277,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.getDomainLowerBound(double)",
      "begin_line": 289,
      "end_line": 289,
      "comment": "\n     * Access the domain value lower bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value lower bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003elower bound\u003c/i\u003e) \u0026lt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.getDomainUpperBound(double)",
      "begin_line": 300,
      "end_line": 300,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a PDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p the desired probability for the critical value\n     * @return domain value upper bound, i.e.\n     *         P(X \u0026lt; \u003ci\u003eupper bound\u003c/i\u003e) \u0026gt; \u003ccode\u003ep\u003c/code\u003e\n     ",
      "child_ranges": []
    }
  ]
}