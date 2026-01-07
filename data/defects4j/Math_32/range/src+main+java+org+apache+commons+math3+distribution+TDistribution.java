{
  "filepath": "/tmp/Math-32b/src/main/java/org/apache/commons/math3/distribution/TDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 32,
      "end_line": 225,
      "comment": "\n * Implementation of Student\u0027s t-distribution.\n *\n * @see \"\u003ca href\u003d\u0027http://en.wikipedia.org/wiki/Student\u0026apos;s_t-distribution\u0027\u003eStudent\u0027s t-distribution (Wikipedia)\u003c/a\u003e\"\n * @see \"\u003ca href\u003d\u0027http://mathworld.wolfram.com/Studentst-Distribution.html\u0027\u003eStudent\u0027s t-distribution (MathWorld)\u003c/a\u003e\"\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * Default inverse cumulative probability accuracy.\n     * @since 2.1\n     "
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
        "degreesOfFreedom"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The degrees of freedom. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.TDistribution.TDistribution(double, double)",
      "begin_line": 56,
      "end_line": 64,
      "comment": "\n     * Create a t distribution using the given degrees of freedom and the\n     * specified inverse cumulative probability absolute accuracy.\n     *\n     * @param degreesOfFreedom Degrees of freedom.\n     * @param inverseCumAccuracy the maximum absolute error in inverse\n     * cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @throws NotStrictlyPositiveException if {@code degreesOfFreedom \u003c\u003d 0}\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 61,col 9)",
        "(line 62,col 9)-(line 62,col 49)",
        "(line 63,col 9)-(line 63,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.TDistribution.TDistribution(double)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Create a t distribution using the given degrees of freedom.\n     *\n     * @param degreesOfFreedom Degrees of freedom.\n     * @throws NotStrictlyPositiveException if {@code degreesOfFreedom \u003c\u003d 0}\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistribution.getDegreesOfFreedom()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Access the degrees of freedom.\n     *\n     * @return the degrees of freedom.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistribution.probability(double)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For this distribution {@code P(X \u003d x)} always evaluates to 0.\n     *\n     * @return 0\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistribution.density(double)",
      "begin_line": 98,
      "end_line": 106,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 42)",
        "(line 100,col 9)-(line 100,col 47)",
        "(line 101,col 9)-(line 105,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistribution.cumulativeProbability(double)",
      "begin_line": 109,
      "end_line": 127,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 19)",
        "(line 111,col 9)-(line 124,col 9)",
        "(line 126,col 9)-(line 126,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 130,
      "end_line": 133,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistribution.getNumericalMean()",
      "begin_line": 144,
      "end_line": 152,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For degrees of freedom parameter {@code df}, the mean is\n     * \u003cul\u003e\n     *  \u003cli\u003eif {@code df \u003e 1} then {@code 0},\u003c/li\u003e\n     * \u003cli\u003eelse undefined ({@code Double.NaN}).\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 48)",
        "(line 147,col 9)-(line 149,col 9)",
        "(line 151,col 9)-(line 151,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistribution.getNumericalVariance()",
      "begin_line": 165,
      "end_line": 177,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For degrees of freedom parameter {@code df}, the variance is\n     * \u003cul\u003e\n     *  \u003cli\u003eif {@code df \u003e 2} then {@code df / (df - 2)},\u003c/li\u003e\n     *  \u003cli\u003eif {@code 1 \u003c df \u003c\u003d 2} then positive infinity\n     *  ({@code Double.POSITIVE_INFINITY}),\u003c/li\u003e\n     *  \u003cli\u003eelse undefined ({@code Double.NaN}).\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 48)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 172,col 9)-(line 174,col 9)",
        "(line 176,col 9)-(line 176,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistribution.getSupportLowerBound()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always negative infinity no matter the\n     * parameters.\n     *\n     * @return lower bound of the support (always\n     * {@code Double.NEGATIVE_INFINITY})\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistribution.getSupportUpperBound()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity no matter the\n     * parameters.\n     *\n     * @return upper bound of the support (always\n     * {@code Double.POSITIVE_INFINITY})\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 206,
      "end_line": 208,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 211,
      "end_line": 213,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistribution.isSupportConnected()",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 20)"
      ]
    }
  ]
}