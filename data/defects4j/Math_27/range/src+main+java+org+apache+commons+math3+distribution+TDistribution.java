{
  "filepath": "/tmp/Math-27b/src/main/java/org/apache/commons/math3/distribution/TDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 34,
      "end_line": 247,
      "comment": "\n * Implementation of Student\u0027s t-distribution.\n *\n * @see \"\u003ca href\u003d\u0027http://en.wikipedia.org/wiki/Student\u0026apos;s_t-distribution\u0027\u003eStudent\u0027s t-distribution (Wikipedia)\u003c/a\u003e\"\n * @see \"\u003ca href\u003d\u0027http://mathworld.wolfram.com/Studentst-Distribution.html\u0027\u003eStudent\u0027s t-distribution (MathWorld)\u003c/a\u003e\"\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Default inverse cumulative probability accuracy.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "degreesOfFreedom"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The degrees of freedom. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.TDistribution.TDistribution(double)",
      "begin_line": 53,
      "end_line": 56,
      "comment": "\n     * Create a t distribution using the given degrees of freedom.\n     *\n     * @param degreesOfFreedom Degrees of freedom.\n     * @throws NotStrictlyPositiveException if {@code degreesOfFreedom \u003c\u003d 0}\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.TDistribution.TDistribution(double, double)",
      "begin_line": 69,
      "end_line": 72,
      "comment": "\n     * Create a t distribution using the given degrees of freedom and the\n     * specified inverse cumulative probability absolute accuracy.\n     *\n     * @param degreesOfFreedom Degrees of freedom.\n     * @param inverseCumAccuracy the maximum absolute error in inverse\n     * cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @throws NotStrictlyPositiveException if {@code degreesOfFreedom \u003c\u003d 0}\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 69)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.TDistribution.TDistribution(org.apache.commons.math3.random.RandomGenerator, double, double)",
      "begin_line": 85,
      "end_line": 97,
      "comment": "\n     * Creates a t distribution.\n     *\n     * @param rng Random number generator.\n     * @param degreesOfFreedom Degrees of freedom.\n     * @param inverseCumAccuracy the maximum absolute error in inverse\n     * cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @throws NotStrictlyPositiveException if {@code degreesOfFreedom \u003c\u003d 0}\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 19)",
        "(line 91,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 49)",
        "(line 96,col 9)-(line 96,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistribution.getDegreesOfFreedom()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Access the degrees of freedom.\n     *\n     * @return the degrees of freedom.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistribution.probability(double)",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For this distribution {@code P(X \u003d x)} always evaluates to 0.\n     *\n     * @return 0\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistribution.density(double)",
      "begin_line": 120,
      "end_line": 128,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 42)",
        "(line 122,col 9)-(line 122,col 47)",
        "(line 123,col 9)-(line 127,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistribution.cumulativeProbability(double)",
      "begin_line": 131,
      "end_line": 149,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 19)",
        "(line 133,col 9)-(line 146,col 9)",
        "(line 148,col 9)-(line 148,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 152,
      "end_line": 155,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistribution.getNumericalMean()",
      "begin_line": 166,
      "end_line": 174,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For degrees of freedom parameter {@code df}, the mean is\n     * \u003cul\u003e\n     *  \u003cli\u003eif {@code df \u003e 1} then {@code 0},\u003c/li\u003e\n     * \u003cli\u003eelse undefined ({@code Double.NaN}).\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 48)",
        "(line 169,col 9)-(line 171,col 9)",
        "(line 173,col 9)-(line 173,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistribution.getNumericalVariance()",
      "begin_line": 187,
      "end_line": 199,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For degrees of freedom parameter {@code df}, the variance is\n     * \u003cul\u003e\n     *  \u003cli\u003eif {@code df \u003e 2} then {@code df / (df - 2)},\u003c/li\u003e\n     *  \u003cli\u003eif {@code 1 \u003c df \u003c\u003d 2} then positive infinity\n     *  ({@code Double.POSITIVE_INFINITY}),\u003c/li\u003e\n     *  \u003cli\u003eelse undefined ({@code Double.NaN}).\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 48)",
        "(line 190,col 9)-(line 192,col 9)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 198,col 9)-(line 198,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistribution.getSupportLowerBound()",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always negative infinity no matter the\n     * parameters.\n     *\n     * @return lower bound of the support (always\n     * {@code Double.NEGATIVE_INFINITY})\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistribution.getSupportUpperBound()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity no matter the\n     * parameters.\n     *\n     * @return upper bound of the support (always\n     * {@code Double.POSITIVE_INFINITY})\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 228,
      "end_line": 230,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 233,
      "end_line": 235,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistribution.isSupportConnected()",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 20)"
      ]
    }
  ]
}