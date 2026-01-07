{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/AbstractIntegerDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractIntegerDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.IntegerDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 37,
      "end_line": 235,
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
      "begin_line": 47,
      "end_line": 48,
      "comment": "\n     * RandomData instance used to generate samples from the distribution.\n     * @deprecated As of 3.1, to be removed in 4.0. Please use the\n     * {@link #random} instance variable instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "random"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * RNG instance used to generate samples from the distribution.\n     * @since 3.1\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.AbstractIntegerDistribution.AbstractIntegerDistribution()",
      "begin_line": 60,
      "end_line": 65,
      "comment": "\n     * @deprecated As of 3.1, to be removed in 4.0. Please use\n     * {@link #AbstractIntegerDistribution(RandomGenerator)} instead.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.AbstractIntegerDistribution.AbstractIntegerDistribution(org.apache.commons.math3.random.RandomGenerator)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * @param rng Random number generator.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractIntegerDistribution.cumulativeProbability(int, int)",
      "begin_line": 81,
      "end_line": 87,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation uses the identity\n     * \u003cp\u003e{@code P(x0 \u003c X \u003c\u003d x1) \u003d P(X \u003c\u003d x1) - P(X \u003c\u003d x0)}\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractIntegerDistribution.inverseCumulativeProbability(double)",
      "begin_line": 100,
      "end_line": 143,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation returns\n     * \u003cul\u003e\n     * \u003cli\u003e{@link #getSupportLowerBound()} for {@code p \u003d 0},\u003c/li\u003e\n     * \u003cli\u003e{@link #getSupportUpperBound()} for {@code p \u003d 1}, and\u003c/li\u003e\n     * \u003cli\u003e{@link #solveInverseCumulativeProbability(double, int, int)} for\n     *     {@code 0 \u003c p \u003c 1}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 103,col 9)",
        "(line 105,col 9)-(line 105,col 43)",
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 116,col 9)",
        "(line 118,col 9)-(line 118,col 43)",
        "(line 119,col 9)-(line 121,col 9)",
        "(line 125,col 9)-(line 125,col 45)",
        "(line 126,col 9)-(line 126,col 67)",
        "(line 127,col 9)-(line 128,col 81)",
        "(line 129,col 9)-(line 140,col 9)",
        "(line 142,col 9)-(line 142,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractIntegerDistribution.solveInverseCumulativeProbability(double, int, int)",
      "begin_line": 157,
      "end_line": 177,
      "comment": "\n     * This is a utility function used by {@link\n     * #inverseCumulativeProbability(double)}. It assumes {@code 0 \u003c p \u003c 1} and\n     * that the inverse cumulative probability lies in the bracket {@code\n     * (lower, upper]}. The implementation does simple bisection to find the\n     * smallest {@code p}-quantile \u003ccode\u003einf{x in Z | P(X\u003c\u003dx) \u003e\u003d p}\u003c/code\u003e.\n     *\n     * @param p the cumulative probability\n     * @param lower a value satisfying {@code cumulativeProbability(lower) \u003c p}\n     * @param upper a value satisfying {@code p \u003c\u003d cumulativeProbability(upper)}\n     * @return the smallest {@code p}-quantile of this distribution\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractIntegerDistribution.reseedRandomGenerator(long)",
      "begin_line": 180,
      "end_line": 183,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 29)",
        "(line 182,col 9)-(line 182,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractIntegerDistribution.sample()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation uses the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Inverse_transform_sampling\"\u003e\n     * inversion method\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractIntegerDistribution.sample(int)",
      "begin_line": 202,
      "end_line": 212,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation generates the sample by calling\n     * {@link #sample()} in a loop.\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 207,col 40)",
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractIntegerDistribution.checkedCumulativeProbability(int)",
      "begin_line": 225,
      "end_line": 234,
      "comment": "\n     * Computes the cumulative probability function and checks for {@code NaN}\n     * values returned. Throws {@code MathInternalError} if the value is\n     * {@code NaN}. Rethrows any exception encountered evaluating the cumulative\n     * probability function. Throws {@code MathInternalError} if the cumulative\n     * probability function returns {@code NaN}.\n     *\n     * @param argument input value\n     * @return the cumulative probability\n     * @throws MathInternalError if the cumulative probability is {@code NaN}\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 35)",
        "(line 228,col 9)-(line 228,col 49)",
        "(line 229,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 233,col 22)"
      ]
    }
  ]
}