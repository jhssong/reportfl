{
  "filepath": "/tmp/Math-30b/src/main/java/org/apache/commons/math3/distribution/WeibullDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WeibullDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 37,
      "end_line": 301,
      "comment": "\n * Implementation of the Weibull distribution. This implementation uses the\n * two parameter form of the distribution defined by\n * \u003ca href\u003d\"http://mathworld.wolfram.com/WeibullDistribution.html\"\u003e\n * Weibull Distribution\u003c/a\u003e, equations (1) and (2).\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Weibull_distribution\"\u003eWeibull distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/WeibullDistribution.html\"\u003eWeibull distribution (MathWorld)\u003c/a\u003e\n * @since 1.1 (changed to concrete class in 3.0)\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Default inverse cumulative probability accuracy.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
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
      "begin_line": 51,
      "end_line": 51,
      "comment": " The scale parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "numericalMean"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Cached numerical mean "
    },
    {
      "type": "field",
      "varNames": [
        "numericalMeanIsCalculated"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Whether or not the numerical mean has been calculated "
    },
    {
      "type": "field",
      "varNames": [
        "numericalVariance"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Cached numerical variance "
    },
    {
      "type": "field",
      "varNames": [
        "numericalVarianceIsCalculated"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Whether or not the numerical variance has been calculated "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.WeibullDistribution(double, double)",
      "begin_line": 77,
      "end_line": 80,
      "comment": "\n     * Create a Weibull distribution with the given shape and scale and a\n     * location equal to zero.\n     *\n     * @param alpha Shape parameter.\n     * @param beta Scale parameter.\n     * @throws NotStrictlyPositiveException if {@code alpha \u003c\u003d 0} or\n     * {@code beta \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.WeibullDistribution(double, double, double)",
      "begin_line": 95,
      "end_line": 109,
      "comment": "\n     * Create a Weibull distribution with the given shape, scale and inverse\n     * cumulative probability accuracy and a location equal to zero.\n     *\n     * @param alpha Shape parameter.\n     * @param beta Scale parameter.\n     * @param inverseCumAccuracy Maximum absolute error in inverse\n     * cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @throws NotStrictlyPositiveException if {@code alpha \u003c\u003d 0} or\n     * {@code beta \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 21)",
        "(line 107,col 9)-(line 107,col 22)",
        "(line 108,col 9)-(line 108,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.getShape()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * Access the shape parameter, {@code alpha}.\n     *\n     * @return the shape parameter, {@code alpha}.\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.getScale()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * Access the scale parameter, {@code beta}.\n     *\n     * @return the scale parameter, {@code beta}.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.probability(double)",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For this distribution {@code P(X \u003d x)} always evaluates to 0.\n     *\n     * @return 0\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.density(double)",
      "begin_line": 141,
      "end_line": 157,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 142,col 9)-(line 144,col 9)",
        "(line 146,col 9)-(line 146,col 40)",
        "(line 147,col 9)-(line 147,col 65)",
        "(line 154,col 9)-(line 154,col 57)",
        "(line 156,col 9)-(line 156,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.cumulativeProbability(double)",
      "begin_line": 160,
      "end_line": 168,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 19)",
        "(line 162,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.inverseCumulativeProbability(double)",
      "begin_line": 176,
      "end_line": 189,
      "comment": "\n     * {@inheritDoc}\n     *\n     * Returns {@code 0} when {@code p \u003d\u003d 0} and\n     * {@code Double.POSITIVE_INFINITY} when {@code p \u003d\u003d 1}.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 19)",
        "(line 179,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 198,
      "end_line": 201,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.getNumericalMean()",
      "begin_line": 209,
      "end_line": 215,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The mean is {@code scale * Gamma(1 + (1 / shape))}, where {@code Gamma()}\n     * is the Gamma-function.\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.calculateNumericalMean()",
      "begin_line": 222,
      "end_line": 227,
      "comment": "\n     * used by {@link #getNumericalMean()}\n     *\n     * @return the mean of this distribution\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 37)",
        "(line 224,col 9)-(line 224,col 37)",
        "(line 226,col 9)-(line 226,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.getNumericalVariance()",
      "begin_line": 235,
      "end_line": 241,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The variance is {@code scale^2 * Gamma(1 + (2 / shape)) - mean^2}\n     * where {@code Gamma()} is the Gamma-function.\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.calculateNumericalVariance()",
      "begin_line": 248,
      "end_line": 255,
      "comment": "\n     * used by {@link #getNumericalVariance()}\n     *\n     * @return the variance of this distribution\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 37)",
        "(line 250,col 9)-(line 250,col 37)",
        "(line 251,col 9)-(line 251,col 45)",
        "(line 253,col 9)-(line 254,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.getSupportLowerBound()",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the parameters.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.getSupportUpperBound()",
      "begin_line": 277,
      "end_line": 279,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the parameters.\n     *\n     * @return upper bound of the support (always\n     * {@code Double.POSITIVE_INFINITY})\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 282,
      "end_line": 284,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 287,
      "end_line": 289,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.WeibullDistribution.isSupportConnected()",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 20)"
      ]
    }
  ]
}