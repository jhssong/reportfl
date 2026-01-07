{
  "filepath": "/tmp/Math-34b/src/main/java/org/apache/commons/math3/distribution/AbstractIntegerDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractIntegerDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.IntegerDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 36,
      "end_line": 208,
      "comment": "\n * Base class for integer-valued discrete distributions.  Default\n * implementations are provided for some of the methods that do not vary\n * from distribution to distribution.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * RandomData instance used to generate samples from the distribution.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.AbstractIntegerDistribution.AbstractIntegerDistribution()",
      "begin_line": 47,
      "end_line": 47,
      "comment": " Default constructor. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractIntegerDistribution.cumulativeProbability(int, int)",
      "begin_line": 55,
      "end_line": 61,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation uses the identity\n     * \u003cp\u003e{@code P(x0 \u003c X \u003c\u003d x1) \u003d P(X \u003c\u003d x1) - P(X \u003c\u003d x0)}\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 59,col 9)",
        "(line 60,col 9)-(line 60,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractIntegerDistribution.inverseCumulativeProbability(double)",
      "begin_line": 74,
      "end_line": 117,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation returns\n     * \u003cul\u003e\n     * \u003cli\u003e{@link #getSupportLowerBound()} for {@code p \u003d 0},\u003c/li\u003e\n     * \u003cli\u003e{@link #getSupportUpperBound()} for {@code p \u003d 1}, and\u003c/li\u003e\n     * \u003cli\u003e{@link #solveInverseCumulativeProbability(double, int, int)} for\n     *     {@code 0 \u003c p \u003c 1}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 77,col 9)",
        "(line 79,col 9)-(line 79,col 43)",
        "(line 80,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 90,col 9)",
        "(line 92,col 9)-(line 92,col 43)",
        "(line 93,col 9)-(line 95,col 9)",
        "(line 99,col 9)-(line 99,col 45)",
        "(line 100,col 9)-(line 100,col 67)",
        "(line 101,col 9)-(line 102,col 81)",
        "(line 103,col 9)-(line 114,col 9)",
        "(line 116,col 9)-(line 116,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractIntegerDistribution.solveInverseCumulativeProbability(double, int, int)",
      "begin_line": 131,
      "end_line": 151,
      "comment": "\n     * This is a utility function used by {@link\n     * #inverseCumulativeProbability(double)}. It assumes {@code 0 \u003c p \u003c 1} and\n     * that the inverse cumulative probability lies in the bracket {@code\n     * (lower, upper]}. The implementation does simple bisection to find the\n     * smallest {@code p}-quantile \u003ccode\u003einf{x in Z | P(X\u003c\u003dx) \u003e\u003d p}\u003c/code\u003e.\n     *\n     * @param p the cumulative probability\n     * @param lower a value satisfying {@code cumulativeProbability(lower) \u003c p}\n     * @param upper a value satisfying {@code p \u003c\u003d cumulativeProbability(upper)}\n     * @return the smallest {@code p}-quantile of this distribution\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractIntegerDistribution.reseedRandomGenerator(long)",
      "begin_line": 154,
      "end_line": 156,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractIntegerDistribution.sample()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation uses the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Inverse_transform_sampling\"\u003e\n     * inversion method\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractIntegerDistribution.sample(int)",
      "begin_line": 175,
      "end_line": 185,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation generates the sample by calling\n     * {@link #sample()} in a loop.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 40)",
        "(line 181,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractIntegerDistribution.checkedCumulativeProbability(int)",
      "begin_line": 198,
      "end_line": 207,
      "comment": "\n     * Computes the cumulative probability function and checks for {@code NaN}\n     * values returned. Throws {@code MathInternalError} if the value is\n     * {@code NaN}. Rethrows any exception encountered evaluating the cumulative\n     * probability function. Throws {@code MathInternalError} if the cumulative\n     * probability function returns {@code NaN}.\n     *\n     * @param argument input value\n     * @return the cumulative probability\n     * @throws MathInternalError if the cumulative probability is {@code NaN}\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 35)",
        "(line 201,col 9)-(line 201,col 49)",
        "(line 202,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 206,col 22)"
      ]
    }
  ]
}