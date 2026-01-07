{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/WeibullDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WeibullDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 39,
      "end_line": 306,
      "comment": "\n * Implementation of the Weibull distribution. This implementation uses the\n * two parameter form of the distribution defined by\n * \u003ca href\u003d\"http://mathworld.wolfram.com/WeibullDistribution.html\"\u003e\n * Weibull Distribution\u003c/a\u003e, equations (1) and (2).\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Weibull_distribution\"\u003eWeibull distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/WeibullDistribution.html\"\u003eWeibull distribution (MathWorld)\u003c/a\u003e\n * @since 1.1 (changed to concrete class in 3.0)\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Default inverse cumulative probability accuracy.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "shape"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " The shape parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " The scale parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "numericalMean"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Cached numerical mean "
    },
    {
      "type": "field",
      "varNames": [
        "numericalMeanIsCalculated"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Whether or not the numerical mean has been calculated "
    },
    {
      "type": "field",
      "varNames": [
        "numericalVariance"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Cached numerical variance "
    },
    {
      "type": "field",
      "varNames": [
        "numericalVarianceIsCalculated"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Whether or not the numerical variance has been calculated "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.WeibullDistribution(double, double)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * Create a Weibull distribution with the given shape and scale and a\n     * location equal to zero.\n     *\n     * @param alpha Shape parameter.\n     * @param beta Scale parameter.\n     * @throws NotStrictlyPositiveException if {@code alpha \u003c\u003d 0} or\n     * {@code beta \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.WeibullDistribution(double, double, double)",
      "begin_line": 89,
      "end_line": 92,
      "comment": "\n     * Create a Weibull distribution with the given shape, scale and inverse\n     * cumulative probability accuracy and a location equal to zero.\n     *\n     * @param alpha Shape parameter.\n     * @param beta Scale parameter.\n     * @param inverseCumAccuracy Maximum absolute error in inverse\n     * cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @throws NotStrictlyPositiveException if {@code alpha \u003c\u003d 0} or\n     * {@code beta \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.WeibullDistribution(org.apache.commons.math3.random.RandomGenerator, double, double, double)",
      "begin_line": 107,
      "end_line": 125,
      "comment": "\n     * Creates a Weibull distribution.\n     *\n     * @param rng Random number generator.\n     * @param alpha Shape parameter.\n     * @param beta Scale parameter.\n     * @param inverseCumAccuracy Maximum absolute error in inverse\n     * cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @throws NotStrictlyPositiveException if {@code alpha \u003c\u003d 0} or\n     * {@code beta \u003c\u003d 0}.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 19)",
        "(line 114,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 21)",
        "(line 123,col 9)-(line 123,col 22)",
        "(line 124,col 9)-(line 124,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.getShape()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * Access the shape parameter, {@code alpha}.\n     *\n     * @return the shape parameter, {@code alpha}.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.getScale()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * Access the scale parameter, {@code beta}.\n     *\n     * @return the scale parameter, {@code beta}.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.density(double)",
      "begin_line": 146,
      "end_line": 162,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 147,col 9)-(line 149,col 9)",
        "(line 151,col 9)-(line 151,col 40)",
        "(line 152,col 9)-(line 152,col 65)",
        "(line 159,col 9)-(line 159,col 57)",
        "(line 161,col 9)-(line 161,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.cumulativeProbability(double)",
      "begin_line": 165,
      "end_line": 173,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 19)",
        "(line 167,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.inverseCumulativeProbability(double)",
      "begin_line": 181,
      "end_line": 194,
      "comment": "\n     * {@inheritDoc}\n     *\n     * Returns {@code 0} when {@code p \u003d\u003d 0} and\n     * {@code Double.POSITIVE_INFINITY} when {@code p \u003d\u003d 1}.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 19)",
        "(line 184,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 203,
      "end_line": 206,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.getNumericalMean()",
      "begin_line": 214,
      "end_line": 220,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The mean is {@code scale * Gamma(1 + (1 / shape))}, where {@code Gamma()}\n     * is the Gamma-function.\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 219,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.calculateNumericalMean()",
      "begin_line": 227,
      "end_line": 232,
      "comment": "\n     * used by {@link #getNumericalMean()}\n     *\n     * @return the mean of this distribution\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 37)",
        "(line 229,col 9)-(line 229,col 37)",
        "(line 231,col 9)-(line 231,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.getNumericalVariance()",
      "begin_line": 240,
      "end_line": 246,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The variance is {@code scale^2 * Gamma(1 + (2 / shape)) - mean^2}\n     * where {@code Gamma()} is the Gamma-function.\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.calculateNumericalVariance()",
      "begin_line": 253,
      "end_line": 260,
      "comment": "\n     * used by {@link #getNumericalVariance()}\n     *\n     * @return the variance of this distribution\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 37)",
        "(line 255,col 9)-(line 255,col 37)",
        "(line 256,col 9)-(line 256,col 45)",
        "(line 258,col 9)-(line 259,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.getSupportLowerBound()",
      "begin_line": 269,
      "end_line": 271,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the parameters.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.getSupportUpperBound()",
      "begin_line": 282,
      "end_line": 284,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the parameters.\n     *\n     * @return upper bound of the support (always\n     * {@code Double.POSITIVE_INFINITY})\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 287,
      "end_line": 289,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 292,
      "end_line": 294,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.isSupportConnected()",
      "begin_line": 303,
      "end_line": 305,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 20)"
      ]
    }
  ]
}