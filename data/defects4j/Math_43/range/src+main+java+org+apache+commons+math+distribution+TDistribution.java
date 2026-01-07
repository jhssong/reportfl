{
  "filepath": "/tmp/Math-43b/src/main/java/org/apache/commons/math/distribution/TDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractContinuousDistribution",
        "java.io.Serializable"
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
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Default inverse cumulative probability accuracy.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "degreesOfFreedom"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The degrees of freedom. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.TDistribution.TDistribution(double, double)",
      "begin_line": 59,
      "end_line": 67,
      "comment": "\n     * Create a t distribution using the given degrees of freedom and the\n     * specified inverse cumulative probability absolute accuracy.\n     *\n     * @param degreesOfFreedom Degrees of freedom.\n     * @param inverseCumAccuracy the maximum absolute error in inverse\n     * cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @throws NotStrictlyPositiveException if {@code degreesOfFreedom \u003c\u003d 0}\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 64,col 9)",
        "(line 65,col 9)-(line 65,col 49)",
        "(line 66,col 9)-(line 66,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.TDistribution.TDistribution(double)",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n     * Create a t distribution using the given degrees of freedom.\n     *\n     * @param degreesOfFreedom Degrees of freedom.\n     * @throws NotStrictlyPositiveException if {@code degreesOfFreedom \u003c\u003d 0}\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistribution.getDegreesOfFreedom()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Access the degrees of freedom.\n     *\n     * @return the degrees of freedom.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistribution.density(double)",
      "begin_line": 90,
      "end_line": 98,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 42)",
        "(line 92,col 9)-(line 92,col 47)",
        "(line 93,col 9)-(line 97,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistribution.cumulativeProbability(double)",
      "begin_line": 101,
      "end_line": 119,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 19)",
        "(line 103,col 9)-(line 116,col 9)",
        "(line 118,col 9)-(line 118,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistribution.inverseCumulativeProbability(double)",
      "begin_line": 127,
      "end_line": 136,
      "comment": "\n     * {@inheritDoc}\n     *\n     * Returns {@code Double.NEGATIVE_INFINITY} when {@code p \u003d 0}\n     * and {@code Double.POSITIVE_INFINITY} when {@code p \u003d 1}.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistribution.getDomainLowerBound(double)",
      "begin_line": 139,
      "end_line": 142,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistribution.getDomainUpperBound(double)",
      "begin_line": 145,
      "end_line": 148,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistribution.getInitialDomain(double)",
      "begin_line": 151,
      "end_line": 154,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 157,
      "end_line": 160,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistribution.getSupportLowerBound()",
      "begin_line": 171,
      "end_line": 174,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always negative infinity no matter the\n     * parameters.\n     *\n     * @return lower bound of the support (always\n     * {@code Double.NEGATIVE_INFINITY})\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistribution.getSupportUpperBound()",
      "begin_line": 185,
      "end_line": 188,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity no matter the\n     * parameters.\n     *\n     * @return upper bound of the support (always\n     * {@code Double.POSITIVE_INFINITY})\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistribution.calculateNumericalMean()",
      "begin_line": 199,
      "end_line": 208,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For degrees of freedom parameter {@code df}, the mean is\n     * \u003cul\u003e\n     *  \u003cli\u003eif {@code df \u003e 1} then {@code 0},\u003c/li\u003e\n     * \u003cli\u003eelse undefined ({@code Double.NaN}).\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 48)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 207,col 9)-(line 207,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistribution.calculateNumericalVariance()",
      "begin_line": 221,
      "end_line": 234,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For degrees of freedom parameter {@code df}, the variance is\n     * \u003cul\u003e\n     *  \u003cli\u003eif {@code df \u003e 2} then {@code df / (df - 2)},\u003c/li\u003e\n     *  \u003cli\u003eif {@code 1 \u003c df \u003c\u003d 2} then positive infinity\n     *  ({@code Double.POSITIVE_INFINITY}),\u003c/li\u003e\n     *  \u003cli\u003eelse undefined ({@code Double.NaN}).\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 48)",
        "(line 225,col 9)-(line 227,col 9)",
        "(line 229,col 9)-(line 231,col 9)",
        "(line 233,col 9)-(line 233,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 237,
      "end_line": 240,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 243,
      "end_line": 246,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 21)"
      ]
    }
  ]
}