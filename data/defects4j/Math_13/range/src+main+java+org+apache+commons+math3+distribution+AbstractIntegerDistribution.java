{
  "filepath": "/tmp/Math-13b/src/main/java/org/apache/commons/math3/distribution/AbstractIntegerDistribution.java",
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
      "end_line": 234,
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
      "comment": "\n      * RandomData instance used to generate samples from the distribution.\n      * @deprecated As of 3.1, to be removed in 4.0. Please use the\n      * {@link #random} instance variable instead.\n      "
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
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * @param rng Random number generator.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractIntegerDistribution.cumulativeProbability(int, int)",
      "begin_line": 80,
      "end_line": 86,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation uses the identity\n     * \u003cp\u003e{@code P(x0 \u003c X \u003c\u003d x1) \u003d P(X \u003c\u003d x1) - P(X \u003c\u003d x0)}\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 85,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractIntegerDistribution.inverseCumulativeProbability(double)",
      "begin_line": 99,
      "end_line": 142,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation returns\n     * \u003cul\u003e\n     * \u003cli\u003e{@link #getSupportLowerBound()} for {@code p \u003d 0},\u003c/li\u003e\n     * \u003cli\u003e{@link #getSupportUpperBound()} for {@code p \u003d 1}, and\u003c/li\u003e\n     * \u003cli\u003e{@link #solveInverseCumulativeProbability(double, int, int)} for\n     *     {@code 0 \u003c p \u003c 1}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 102,col 9)",
        "(line 104,col 9)-(line 104,col 43)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 115,col 9)",
        "(line 117,col 9)-(line 117,col 43)",
        "(line 118,col 9)-(line 120,col 9)",
        "(line 124,col 9)-(line 124,col 45)",
        "(line 125,col 9)-(line 125,col 67)",
        "(line 126,col 9)-(line 127,col 81)",
        "(line 128,col 9)-(line 139,col 9)",
        "(line 141,col 9)-(line 141,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractIntegerDistribution.solveInverseCumulativeProbability(double, int, int)",
      "begin_line": 156,
      "end_line": 176,
      "comment": "\n     * This is a utility function used by {@link\n     * #inverseCumulativeProbability(double)}. It assumes {@code 0 \u003c p \u003c 1} and\n     * that the inverse cumulative probability lies in the bracket {@code\n     * (lower, upper]}. The implementation does simple bisection to find the\n     * smallest {@code p}-quantile \u003ccode\u003einf{x in Z | P(X\u003c\u003dx) \u003e\u003d p}\u003c/code\u003e.\n     *\n     * @param p the cumulative probability\n     * @param lower a value satisfying {@code cumulativeProbability(lower) \u003c p}\n     * @param upper a value satisfying {@code p \u003c\u003d cumulativeProbability(upper)}\n     * @return the smallest {@code p}-quantile of this distribution\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractIntegerDistribution.reseedRandomGenerator(long)",
      "begin_line": 179,
      "end_line": 182,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 29)",
        "(line 181,col 9)-(line 181,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractIntegerDistribution.sample()",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation uses the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Inverse_transform_sampling\"\u003e\n     * inversion method\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractIntegerDistribution.sample(int)",
      "begin_line": 201,
      "end_line": 211,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation generates the sample by calling\n     * {@link #sample()} in a loop.\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 206,col 40)",
        "(line 207,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractIntegerDistribution.checkedCumulativeProbability(int)",
      "begin_line": 224,
      "end_line": 233,
      "comment": "\n     * Computes the cumulative probability function and checks for {@code NaN}\n     * values returned. Throws {@code MathInternalError} if the value is\n     * {@code NaN}. Rethrows any exception encountered evaluating the cumulative\n     * probability function. Throws {@code MathInternalError} if the cumulative\n     * probability function returns {@code NaN}.\n     *\n     * @param argument input value\n     * @return the cumulative probability\n     * @throws MathInternalError if the cumulative probability is {@code NaN}\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 35)",
        "(line 227,col 9)-(line 227,col 49)",
        "(line 228,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 22)"
      ]
    }
  ]
}