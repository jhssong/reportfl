{
  "filepath": "/tmp/Math-40b/src/main/java/org/apache/commons/math/distribution/AbstractIntegerDistribution.java",
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
      "end_line": 319,
      "comment": "\n * Base class for integer-valued discrete distributions.  Default\n * implementations are provided for some of the methods that do not vary\n * from distribution to distribution.\n *\n * @version $Id$\n "
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
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * For a random variable {@code X} whose values are distributed according\n     * to this distribution, this method returns {@code P(X \u003c\u003d x)}.  In other\n     * words, this method represents the (cumulative) distribution function,\n     * or CDF, for this distribution.\n     * If {@code x} does not represent an integer value, the CDF is\n     * evaluated at the greatest integer less than {@code x}.\n     *\n     * @param x Value at which the distribution function is evaluated.\n     * @return the cumulative probability that a random variable with this\n     * distribution takes a value less than or equal to {@code x}.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.cumulativeProbability(double, double)",
      "begin_line": 80,
      "end_line": 93,
      "comment": "\n     * For a random variable {@code X} whose values are distributed\n     * according to this distribution, this method returns\n     * {@code P(x0 \u003c\u003d X \u003c\u003d x1)}.\n     *\n     * @param x0 Inclusive lower bound.\n     * @param x1 Inclusive upper bound.\n     * @return the probability that a random variable with this distribution\n     * will take a value between {@code x0} and {@code x1},\n     * including the endpoints.\n     * @throws NumberIsTooSmallException if {@code x1 \u003e x0}.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 92,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.cumulativeProbability(int)",
      "begin_line": 104,
      "end_line": 104,
      "comment": "\n     * For a random variable {@code X} whose values are distributed according\n     * to this distribution, this method returns {@code P(X \u003c\u003d x)}. In other\n     * words, this method represents the probability distribution function,\n     * or PDF, for this distribution.\n     *\n     * @param x Value at which the PDF is evaluated.\n     * @return PDF for this distribution.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.probability(double)",
      "begin_line": 116,
      "end_line": 123,
      "comment": "\n     * For a random variable {@code X} whose values are distributed according\n     * to this distribution, this method returns {@code P(X \u003d x)}. In other\n     * words, this method represents the probability mass function, or PMF,\n     * for the distribution.\n     * If {@code x} does not represent an integer value, 0 is returned.\n     *\n     * @param x Value at which the probability density function is evaluated.\n     * @return the value of the probability density function at {@code x}.\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 38)",
        "(line 118,col 9)-(line 122,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.cumulativeProbability(int, int)",
      "begin_line": 134,
      "end_line": 140,
      "comment": "\n     * For a random variable {@code X} whose values are distributed according\n     * to this distribution, this method returns {@code P(x0 \u003c X \u003c x1)}.\n     *\n     * @param x0 Inclusive lower bound.\n     * @param x1 Inclusive upper bound.\n     * @return the cumulative probability.\n     * @throws NumberIsTooSmallException {@code if x0 \u003e x1}.\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.inverseCumulativeProbability(double)",
      "begin_line": 151,
      "end_line": 195,
      "comment": "\n     * For a random variable {@code X} whose values are distributed according\n     * to this distribution, this method returns the largest {@code x}, such\n     * that {@code P(X \u003c\u003d x) \u003c\u003d p}.\n     *\n     * @param p Desired probability.\n     * @return the largest {@code x} such that {@code P(X \u003c x) \u003c\u003d p}.\n     * @throws OutOfRangeException if {@code p \u003c 0} or {@code p \u003e 1}.\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 154,col 9)",
        "(line 158,col 9)-(line 158,col 40)",
        "(line 159,col 9)-(line 159,col 40)",
        "(line 160,col 9)-(line 160,col 18)",
        "(line 161,col 9)-(line 185,col 9)",
        "(line 188,col 9)-(line 188,col 46)",
        "(line 189,col 9)-(line 192,col 9)",
        "(line 194,col 9)-(line 194,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.reseedRandomGenerator(long)",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.sample()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * Generates a random value sampled from this distribution. The default\n     * implementation uses the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Inverse_transform_sampling\"\u003e\n     *  inversion method.\n     * \u003c/a\u003e\n     *\n     * @return a random value.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.sample(int)",
      "begin_line": 228,
      "end_line": 238,
      "comment": "\n     * Generates a random sample from the distribution.  The default\n     * implementation generates the sample by calling {@link #sample()}\n     * in a loop.\n     *\n     * @param sampleSize number of random values to generate.\n     * @since 2.2\n     * @return an array representing the random sample.\n     * @throws NotStrictlyPositiveException if {@code sampleSize \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 233,col 40)",
        "(line 234,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 237,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.checkedCumulativeProbability(int)",
      "begin_line": 251,
      "end_line": 260,
      "comment": "\n     * Computes the cumulative probability function and checks for NaN\n     * values returned.\n     * Throws MathInternalError if the value is NaN. Rethrows any Exception encountered\n     * evaluating the cumulative probability function. Throws\n     * MathInternalError if the cumulative probability function returns NaN.\n     *\n     * @param argument Input value.\n     * @return the cumulative probability.\n     * @throws MathInternalError if the cumulative probability is NaN\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 35)",
        "(line 254,col 13)-(line 254,col 53)",
        "(line 255,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.getDomainLowerBound(double)",
      "begin_line": 270,
      "end_line": 270,
      "comment": "\n     * Access the domain value lower bound, based on {@code p}, used to\n     * bracket a PDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value\n     * @return the domain value lower bound, i.e. {@code P(X \u003c \u0027lower bound\u0027) \u003c p}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.getDomainUpperBound(double)",
      "begin_line": 280,
      "end_line": 280,
      "comment": "\n     * Access the domain value upper bound, based on {@code p}, used to\n     * bracket a PDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value upper bound, i.e. {@code P(X \u003c \u0027upper bound\u0027) \u003e p}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.getSupportLowerBound()",
      "begin_line": 287,
      "end_line": 287,
      "comment": "\n     * Access the lower bound of the support.\n     *\n     * @return lower bound of the support (Integer.MIN_VALUE for negative infinity)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.getSupportUpperBound()",
      "begin_line": 294,
      "end_line": 294,
      "comment": "\n     * Access the upper bound of the support.\n     *\n     * @return upper bound of the support (Integer.MAX_VALUE for positive infinity)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 303,
      "end_line": 306,
      "comment": "\n     * Use this method to get information about whether the lower bound\n     * of the support is inclusive or not. For discrete support,\n     * only true here is meaningful.\n     *\n     * @return true (always but at Integer.MIN_VALUE because of the nature of discrete support)\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbstractIntegerDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 315,
      "end_line": 318,
      "comment": "\n     * Use this method to get information about whether the upper bound\n     * of the support is inclusive or not. For discrete support,\n     * only true here is meaningful.\n     *\n     * @return true (always but at Integer.MAX_VALUE because of the nature of discrete support)\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 20)"
      ]
    }
  ]
}