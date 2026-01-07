{
  "filepath": "/tmp/Math-27b/src/main/java/org/apache/commons/math3/distribution/AbstractRealDistribution.java",
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
      "end_line": 247,
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
      "end_line": 50,
      "comment": "\n      * RandomData instance used to generate samples from the distribution.\n      * @deprecated As of 3.1, to be removed in 4.0. Please use the\n      * {@link #random} instance variable instead.\n      "
    },
    {
      "type": "field",
      "varNames": [
        "random"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " RNG instance used to generate samples from the distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Solver absolute accuracy for inverse cumulative computation "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.AbstractRealDistribution()",
      "begin_line": 60,
      "end_line": 65,
      "comment": "\n     * @deprecated As of 3.1, to be removed in 4.0. Please use\n     * {@link #AbstractRealDistribution(RandomGenerator)} instead.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.AbstractRealDistribution(org.apache.commons.math3.random.RandomGenerator)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * @param rng Random number generator.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.cumulativeProbability(double, double)",
      "begin_line": 79,
      "end_line": 85,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation uses the identity\n     * \u003cp\u003e{@code P(x0 \u003c X \u003c\u003d x1) \u003d P(X \u003c\u003d x1) - P(X \u003c\u003d x0)}\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.inverseCumulativeProbability(double)",
      "begin_line": 96,
      "end_line": 199,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation returns\n     * \u003cul\u003e\n     * \u003cli\u003e{@link #getSupportLowerBound()} for {@code p \u003d 0},\u003c/li\u003e\n     * \u003cli\u003e{@link #getSupportUpperBound()} for {@code p \u003d 1}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 127,col 9)",
        "(line 129,col 9)-(line 129,col 51)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 134,col 9)-(line 134,col 51)",
        "(line 135,col 9)-(line 137,col 9)",
        "(line 139,col 9)-(line 139,col 45)",
        "(line 140,col 9)-(line 140,col 65)",
        "(line 141,col 9)-(line 141,col 39)",
        "(line 142,col 9)-(line 143,col 74)",
        "(line 145,col 9)-(line 154,col 9)",
        "(line 156,col 9)-(line 165,col 9)",
        "(line 167,col 9)-(line 172,col 10)",
        "(line 174,col 9)-(line 177,col 80)",
        "(line 179,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.Anonymous-09c5768b-a29a-4d57-b266-0357e1e49fbb.value(double)",
      "begin_line": 169,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 170,col 17)-(line 170,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\n     * Returns the solver absolute accuracy for inverse cumulative computation.\n     * You can override this method in order to use a Brent solver with an\n     * absolute accuracy different from the default.\n     *\n     * @return the maximum absolute error in inverse cumulative probability estimates\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.reseedRandomGenerator(long)",
      "begin_line": 213,
      "end_line": 216,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 29)",
        "(line 215,col 9)-(line 215,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.sample()",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation uses the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Inverse_transform_sampling\"\u003e\n     * inversion method.\n     * \u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.sample(int)",
      "begin_line": 236,
      "end_line": 246,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation generates the sample by calling\n     * {@link #sample()} in a loop.\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 46)",
        "(line 242,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 19)"
      ]
    }
  ]
}