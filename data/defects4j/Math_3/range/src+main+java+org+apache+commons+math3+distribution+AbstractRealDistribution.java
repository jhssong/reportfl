{
  "filepath": "/tmp/Math-3b/src/main/java/org/apache/commons/math3/distribution/AbstractRealDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractRealDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.RealDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 39,
      "end_line": 289,
      "comment": "\n * Base class for probability distributions on the reals.\n * Default implementations are provided for some of the methods\n * that do not vary from distribution to distribution.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "SOLVER_DEFAULT_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Default accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 50,
      "end_line": 51,
      "comment": "\n      * RandomData instance used to generate samples from the distribution.\n      * @deprecated As of 3.1, to be removed in 4.0. Please use the\n      * {@link #random} instance variable instead.\n      "
    },
    {
      "type": "field",
      "varNames": [
        "random"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * RNG instance used to generate samples from the distribution.\n     * @since 3.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Solver absolute accuracy for inverse cumulative computation "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.AbstractRealDistribution()",
      "begin_line": 66,
      "end_line": 71,
      "comment": "\n     * @deprecated As of 3.1, to be removed in 4.0. Please use\n     * {@link #AbstractRealDistribution(RandomGenerator)} instead.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.AbstractRealDistribution(org.apache.commons.math3.random.RandomGenerator)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * @param rng Random number generator.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.cumulativeProbability(double, double)",
      "begin_line": 89,
      "end_line": 92,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation uses the identity\n     * \u003cp\u003e{@code P(x0 \u003c X \u003c\u003d x1) \u003d P(X \u003c\u003d x1) - P(X \u003c\u003d x0)}\u003c/p\u003e\n     *\n     * @deprecated As of 3.1 (to be removed in 4.0). Please use\n     * {@link #probability(double,double)} instead.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.probability(double, double)",
      "begin_line": 110,
      "end_line": 117,
      "comment": "\n     * For a random variable {@code X} whose values are distributed according\n     * to this distribution, this method returns {@code P(x0 \u003c X \u003c\u003d x1)}.\n     *\n     * @param x0 Lower bound (excluded).\n     * @param x1 Upper bound (included).\n     * @return the probability that a random variable with this distribution\n     * takes a value between {@code x0} and {@code x1}, excluding the lower\n     * and including the upper endpoint.\n     * @throws NumberIsTooLargeException if {@code x0 \u003e x1}.\n     *\n     * The default implementation uses the identity\n     * {@code P(x0 \u003c X \u003c\u003d x1) \u003d P(X \u003c\u003d x1) - P(X \u003c\u003d x0)}\n     *\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.inverseCumulativeProbability(double)",
      "begin_line": 128,
      "end_line": 231,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation returns\n     * \u003cul\u003e\n     * \u003cli\u003e{@link #getSupportLowerBound()} for {@code p \u003d 0},\u003c/li\u003e\n     * \u003cli\u003e{@link #getSupportUpperBound()} for {@code p \u003d 1}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 159,col 9)",
        "(line 161,col 9)-(line 161,col 51)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 166,col 9)-(line 166,col 51)",
        "(line 167,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 171,col 45)",
        "(line 172,col 9)-(line 172,col 65)",
        "(line 173,col 9)-(line 173,col 39)",
        "(line 174,col 9)-(line 175,col 74)",
        "(line 177,col 9)-(line 186,col 9)",
        "(line 188,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 204,col 10)",
        "(line 206,col 9)-(line 209,col 80)",
        "(line 211,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 230,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.Anonymous-c4decc55-03ea-4961-93c5-26617f8046ea.value(double)",
      "begin_line": 201,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 202,col 17)-(line 202,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     * Returns the solver absolute accuracy for inverse cumulative computation.\n     * You can override this method in order to use a Brent solver with an\n     * absolute accuracy different from the default.\n     *\n     * @return the maximum absolute error in inverse cumulative probability estimates\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.reseedRandomGenerator(long)",
      "begin_line": 245,
      "end_line": 248,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 29)",
        "(line 247,col 9)-(line 247,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.sample()",
      "begin_line": 258,
      "end_line": 260,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation uses the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Inverse_transform_sampling\"\u003e\n     * inversion method.\n     * \u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.sample(int)",
      "begin_line": 268,
      "end_line": 278,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation generates the sample by calling\n     * {@link #sample()} in a loop.\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 273,col 46)",
        "(line 274,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 277,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.probability(double)",
      "begin_line": 286,
      "end_line": 288,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @return zero.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 18)"
      ]
    }
  ]
}