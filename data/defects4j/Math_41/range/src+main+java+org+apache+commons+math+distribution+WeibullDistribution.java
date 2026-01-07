{
  "filepath": "/tmp/Math-41b/src/main/java/org/apache/commons/math/distribution/WeibullDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WeibullDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractContinuousDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 39,
      "end_line": 264,
      "comment": "\n * Implementation of the Weibull distribution. This implementation uses the\n * two parameter form of the distribution defined by\n * \u003ca href\u003d\"http://mathworld.wolfram.com/WeibullDistribution.html\"\u003e\n * Weibull Distribution\u003c/a\u003e, equations (1) and (2).\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Weibull_distribution\"\u003eWeibull distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/WeibullDistribution.html\"\u003eWeibull distribution (MathWorld)\u003c/a\u003e\n * @since 1.1 (changed to concrete class in 3.0)\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Default inverse cumulative probability accuracy.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "shape"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The shape parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " The scale parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.WeibullDistribution.WeibullDistribution(double, double)",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * Create a Weibull distribution with the given shape and scale and a\n     * location equal to zero.\n     *\n     * @param alpha Shape parameter.\n     * @param beta Scale parameter.\n     * @throws NotStrictlyPositiveException if {@code alpha \u003c\u003d 0} or\n     * {@code beta \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.WeibullDistribution.WeibullDistribution(double, double, double)",
      "begin_line": 82,
      "end_line": 96,
      "comment": "\n     * Create a Weibull distribution with the given shape, scale and inverse\n     * cumulative probability accuracy and a location equal to zero.\n     *\n     * @param alpha Shape parameter.\n     * @param beta Scale parameter.\n     * @param inverseCumAccuracy Maximum absolute error in inverse\n     * cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @throws NotStrictlyPositiveException if {@code alpha \u003c\u003d 0} or\n     * {@code beta \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 21)",
        "(line 94,col 9)-(line 94,col 22)",
        "(line 95,col 9)-(line 95,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistribution.cumulativeProbability(double)",
      "begin_line": 99,
      "end_line": 107,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 19)",
        "(line 101,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistribution.getShape()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Access the shape parameter, {@code alpha}.\n     *\n     * @return the shape parameter, {@code alpha}.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistribution.getScale()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * Access the scale parameter, {@code beta}.\n     *\n     * @return the scale parameter, {@code beta}.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistribution.density(double)",
      "begin_line": 128,
      "end_line": 144,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 129,col 9)-(line 131,col 9)",
        "(line 133,col 9)-(line 133,col 40)",
        "(line 134,col 9)-(line 134,col 65)",
        "(line 141,col 9)-(line 141,col 57)",
        "(line 143,col 9)-(line 143,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistribution.inverseCumulativeProbability(double)",
      "begin_line": 152,
      "end_line": 165,
      "comment": "\n     * {@inheritDoc}\n     *\n     * Returns {@code 0} when {@code p \u003d\u003d 0} and\n     * {@code Double.POSITIVE_INFINITY} when {@code p \u003d\u003d 1}.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 19)",
        "(line 155,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistribution.getDomainLowerBound(double)",
      "begin_line": 168,
      "end_line": 171,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistribution.getDomainUpperBound(double)",
      "begin_line": 173,
      "end_line": 176,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistribution.getInitialDomain(double)",
      "begin_line": 178,
      "end_line": 182,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 191,
      "end_line": 194,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistribution.getSupportLowerBound()",
      "begin_line": 203,
      "end_line": 206,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the parameters.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistribution.getSupportUpperBound()",
      "begin_line": 217,
      "end_line": 220,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the parameters.\n     *\n     * @return upper bound of the support (always\n     * {@code Double.POSITIVE_INFINITY})\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistribution.calculateNumericalMean()",
      "begin_line": 228,
      "end_line": 234,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The mean is {@code scale * Gamma(1 + (1 / shape))}, where {@code Gamma()}\n     * is the Gamma-function.\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 37)",
        "(line 231,col 9)-(line 231,col 37)",
        "(line 233,col 9)-(line 233,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistribution.calculateNumericalVariance()",
      "begin_line": 242,
      "end_line": 251,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The variance is {@code scale^2 * Gamma(1 + (2 / shape)) - mean^2}\n     * where {@code Gamma()} is the Gamma-function.\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 37)",
        "(line 245,col 9)-(line 245,col 37)",
        "(line 246,col 9)-(line 246,col 45)",
        "(line 248,col 9)-(line 250,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 254,
      "end_line": 257,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 260,
      "end_line": 263,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 21)"
      ]
    }
  ]
}