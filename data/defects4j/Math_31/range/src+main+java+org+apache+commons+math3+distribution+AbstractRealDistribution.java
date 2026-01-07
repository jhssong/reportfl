{
  "filepath": "/tmp/Math-31b/src/main/java/org/apache/commons/math3/distribution/AbstractRealDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractRealDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.RealDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 38,
      "end_line": 228,
      "comment": "\n * Base class for probability distributions on the reals.\n * Default implementations are provided for some of the methods\n * that do not vary from distribution to distribution.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "SOLVER_DEFAULT_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 41,
      "end_line": 41,
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
      "begin_line": 47,
      "end_line": 47,
      "comment": " RandomData instance used to generate samples from the distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Solver absolute accuracy for inverse cumulative computation "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.AbstractRealDistribution()",
      "begin_line": 53,
      "end_line": 53,
      "comment": " Default constructor. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.cumulativeProbability(double, double)",
      "begin_line": 61,
      "end_line": 67,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation uses the identity\n     * \u003cp\u003e{@code P(x0 \u003c X \u003c\u003d x1) \u003d P(X \u003c\u003d x1) - P(X \u003c\u003d x0)}\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 66,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.inverseCumulativeProbability(double)",
      "begin_line": 78,
      "end_line": 181,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation returns\n     * \u003cul\u003e\n     * \u003cli\u003e{@link #getSupportLowerBound()} for {@code p \u003d 0},\u003c/li\u003e\n     * \u003cli\u003e{@link #getSupportUpperBound()} for {@code p \u003d 1}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 109,col 9)",
        "(line 111,col 9)-(line 111,col 51)",
        "(line 112,col 9)-(line 114,col 9)",
        "(line 116,col 9)-(line 116,col 51)",
        "(line 117,col 9)-(line 119,col 9)",
        "(line 121,col 9)-(line 121,col 45)",
        "(line 122,col 9)-(line 122,col 65)",
        "(line 123,col 9)-(line 123,col 39)",
        "(line 124,col 9)-(line 125,col 74)",
        "(line 127,col 9)-(line 136,col 9)",
        "(line 138,col 9)-(line 147,col 9)",
        "(line 149,col 9)-(line 154,col 10)",
        "(line 156,col 9)-(line 159,col 80)",
        "(line 161,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.Anonymous-3ebb0219-e8bb-422f-9556-5f24d9f9ea8c.value(double)",
      "begin_line": 151,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 152,col 17)-(line 152,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * Returns the solver absolute accuracy for inverse cumulative computation.\n     * You can override this method in order to use a Brent solver with an\n     * absolute accuracy different from the default.\n     *\n     * @return the maximum absolute error in inverse cumulative probability estimates\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.reseedRandomGenerator(long)",
      "begin_line": 195,
      "end_line": 197,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.sample()",
      "begin_line": 207,
      "end_line": 209,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation uses the\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Inverse_transform_sampling\"\u003e\n     * inversion method.\n     * \u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.AbstractRealDistribution.sample(int)",
      "begin_line": 217,
      "end_line": 227,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The default implementation generates the sample by calling\n     * {@link #sample()} in a loop.\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 46)",
        "(line 223,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 19)"
      ]
    }
  ]
}