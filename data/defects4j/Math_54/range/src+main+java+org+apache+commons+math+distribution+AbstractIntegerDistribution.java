{
  "filepath": "/tmp/Math-54b/src/main/java/org/apache/commons/math/distribution/AbstractIntegerDistribution.java",
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
      "begin_line": 37,
      "end_line": 331,
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
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * RandomData instance used to generate samples from the distribution.\n     * @since 2.2\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.AbstractIntegerDistribution()",
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.cumulativeProbability(double)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * For a random variable {@code X} whose values are distributed according\n     * to this distribution, this method returns {@code P(X \u003c x)}.  In other\n     * words, this method represents the (cumulative) distribution function,\n     * or CDF, for this distribution.\n     * If {@code x} does not represent an integer value, the CDF is\n     * evaluated at the greatest integer less than {@code x}.\n     *\n     * @param x Value at which the distribution function is evaluated.\n     * @return the cumulative probability that a random variable with this\n     * distribution takes a value less than or equal to {@code x}.\n     * @throws MathException if the cumulative probability can not be\n     * computed due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.cumulativeProbability(double, double)",
      "begin_line": 84,
      "end_line": 98,
      "comment": "\n     * For a random variable {@code X} whose values are distributed\n     * according to this distribution, this method returns\n     * {@code P(x0 \u003c X \u003c x1)}.\n     *\n     * @param x0 Inclusive lower bound.\n     * @param x1 Inclusive upper bound.\n     * @return the probability that a random variable with this distribution\n     * will take a value between {@code x0} and {@code x1},\n     * including the endpoints.\n     * @throws MathException if the cumulative probability can not be\n     * computed due to convergence or other numerical errors.\n     * @throws NumberIsTooSmallException if {@code x1 \u003e x0}.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 97,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.cumulativeProbability(int)",
      "begin_line": 111,
      "end_line": 111,
      "comment": "\n     * For a random variable {@code X} whose values are distributed according\n     * to this distribution, this method returns {@code P(X \u003c x)}. In other\n     * words, this method represents the probability distribution function,\n     * or PDF, for this distribution.\n     *\n     * @param x Value at which the PDF is evaluated.\n     * @return PDF for this distribution.\n     * @throws MathException if the cumulative probability can not be\n     * computed due to convergence or other numerical errors.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.probability(double)",
      "begin_line": 123,
      "end_line": 130,
      "comment": "\n     * For a random variable {@code X} whose values are distributed according\n     * to this distribution, this method returns {@code P(X \u003d x)}. In other\n     * words, this method represents the probability mass function, or PMF,\n     * for the distribution.\n     * If {@code x} does not represent an integer value, 0 is returned.\n     *\n     * @param x Value at which the probability density function is evaluated.\n     * @return the value of the probability density function at {@code x}.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 38)",
        "(line 125,col 9)-(line 129,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.cumulativeProbability(int, int)",
      "begin_line": 143,
      "end_line": 149,
      "comment": "\n     * For a random variable {@code X} whose values are distributed according\n     * to this distribution, this method returns {@code P(x0 \u003c X \u003c x1)}.\n     *\n     * @param x0 Inclusive lower bound.\n     * @param x1 Inclusive upper bound.\n     * @return the cumulative probability.\n     * @throws MathException if the cumulative probability can not be\n     * computed due to convergence or other numerical errors.\n     * @throws NumberIsTooSmallException {@code if x0 \u003e x1}.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.inverseCumulativeProbability(double)",
      "begin_line": 162,
      "end_line": 206,
      "comment": "\n     * For a random variable {@code X} whose values are distributed according\n     * to this distribution, this method returns the largest {@code x}, such\n     * that {@code P(X \u003c x) \u003c p}.\n     *\n     * @param p Desired probability.\n     * @return the largest {@code x} such that {@code P(X \u003c x) \u003c\u003d p}.\n     * @throws MathException if the inverse cumulative probability can not be\n     * computed due to convergence or other numerical errors.\n     * @throws OutOfRangeException if {@code p \u003c 0} or {@code p \u003e 1}.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 165,col 9)",
        "(line 169,col 9)-(line 169,col 40)",
        "(line 170,col 9)-(line 170,col 40)",
        "(line 171,col 9)-(line 171,col 18)",
        "(line 172,col 9)-(line 196,col 9)",
        "(line 199,col 9)-(line 199,col 46)",
        "(line 200,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 205,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.reseedRandomGenerator(long)",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.sample()",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\n     * Generates a random value sampled from this distribution. The default\n     * implementation uses the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Inverse_transform_sampling\"\u003e\n     *  inversion method.\n     * \u003c/a\u003e\n     *\n     * @return a random value.\n     * @since 2.2\n     * @throws MathException if an error occurs generating the random value.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.sample(int)",
      "begin_line": 241,
      "end_line": 251,
      "comment": "\n     * Generates a random sample from the distribution.  The default\n     * implementation generates the sample by calling {@link #sample()}\n     * in a loop.\n     *\n     * @param sampleSize number of random values to generate.\n     * @since 2.2\n     * @return an array representing the random sample.\n     * @throws MathException if an error occurs generating the sample.\n     * @throws NotStrictlyPositiveException if {@code sampleSize \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 246,col 40)",
        "(line 247,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.checkedCumulativeProbability(int)",
      "begin_line": 264,
      "end_line": 272,
      "comment": "\n     * Computes the cumulative probability function and checks for NaN\n     * values returned.\n     * Throws MathException if the value is NaN. Rethrows any MathException encountered\n     * evaluating the cumulative probability function. Throws\n     * MathException if the cumulative probability function returns NaN.\n     *\n     * @param argument Input value.\n     * @return the cumulative probability.\n     * @throws MathException if the cumulative probability is NaN\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 35)",
        "(line 267,col 13)-(line 267,col 53)",
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.getDomainLowerBound(double)",
      "begin_line": 282,
      "end_line": 282,
      "comment": "\n     * Access the domain value lower bound, based on {@code p}, used to\n     * bracket a PDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value\n     * @return the domain value lower bound, i.e. {@code P(X \u003c \u0027lower bound\u0027) \u003c p}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.getDomainUpperBound(double)",
      "begin_line": 292,
      "end_line": 292,
      "comment": "\n     * Access the domain value upper bound, based on {@code p}, used to\n     * bracket a PDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value upper bound, i.e. {@code P(X \u003c \u0027upper bound\u0027) \u003e p}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.getSupportLowerBound()",
      "begin_line": 299,
      "end_line": 299,
      "comment": "\n     * Access the lower bound of the support.\n     *\n     * @return lower bound of the support (Integer.MIN_VALUE for negative infinity)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.getSupportUpperBound()",
      "begin_line": 306,
      "end_line": 306,
      "comment": "\n     * Access the upper bound of the support.\n     *\n     * @return upper bound of the support (Integer.MAX_VALUE for positive infinity)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 315,
      "end_line": 318,
      "comment": "\n     * Use this method to get information about whether the lower bound\n     * of the support is inclusive or not. For discrete support,\n     * only true here is meaningful.\n     *\n     * @return true (always but at Integer.MIN_VALUE because of the nature of discrete support)\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 327,
      "end_line": 330,
      "comment": "\n     * Use this method to get information about whether the upper bound\n     * of the support is inclusive or not. For discrete support,\n     * only true here is meaningful.\n     *\n     * @return true (always but at Integer.MAX_VALUE because of the nature of discrete support)\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 20)"
      ]
    }
  ]
}