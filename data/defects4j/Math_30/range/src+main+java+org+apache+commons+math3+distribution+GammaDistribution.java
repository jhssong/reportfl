{
  "filepath": "/tmp/Math-30b/src/main/java/org/apache/commons/math3/distribution/GammaDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GammaDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 31,
      "end_line": 365,
      "comment": "\n * Implementation of the Gamma distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Gamma_distribution\"\u003eGamma distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/GammaDistribution.html\"\u003eGamma distribution (MathWorld)\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * Default inverse cumulative probability accuracy.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "shape"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The shape parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The scale parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "shiftedShape"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * The constant value of {@code shape + g + 0.5}, where {@code g} is the\n     * Lanczos constant {@link Gamma#LANCZOS_G}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "densityPrefactor1"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * The constant value of\n     * {@code shape / scale * sqrt(e / (2 * pi * (shape + g + 0.5))) / L(shape)},\n     * where {@code L(shape)} is the Lanczos approximation returned by\n     * {@link Gamma#lanczos(double)}. This prefactor is used in\n     * {@link #density(double)}, when no overflow occurs with the natural\n     * calculation.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "densityPrefactor2"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * The constant value of\n     * {@code shape * sqrt(e / (2 * pi * (shape + g + 0.5))) / L(shape)},\n     * where {@code L(shape)} is the Lanczos approximation returned by\n     * {@link Gamma#lanczos(double)}. This prefactor is used in\n     * {@link #density(double)}, when overflow occurs with the natural\n     * calculation.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minY"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * Lower bound on {@code y \u003d x / scale} for the selection of the computation\n     * method in {@link #density(double)}. For {@code y \u003c\u003d minY}, the natural\n     * calculation overflows.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxLogY"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n     * Upper bound on {@code log(y)} ({@code y \u003d x / scale}) for the selection\n     * of the computation method in {@link #density(double)}. For\n     * {@code log(y) \u003e\u003d maxLogY}, the natural calculation overflows.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.GammaDistribution(double, double)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Creates a new gamma distribution with specified values of the shape and\n     * scale parameters.\n     *\n     * @param shape the shape parameter\n     * @param scale the scale parameter\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.GammaDistribution(double, double, double)",
      "begin_line": 114,
      "end_line": 134,
      "comment": "\n     * Creates a new gamma distribution with specified values of the shape and\n     * scale parameters.\n     *\n     * @param shape the shape parameter\n     * @param scale the scale parameter\n     * @param inverseCumAccuracy the maximum absolute error in inverse\n     * cumulative probability estimates (defaults to\n     * {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @throws NotStrictlyPositiveException if {@code shape \u003c\u003d 0} or\n     * {@code scale \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 121,col 9)",
        "(line 123,col 9)-(line 123,col 27)",
        "(line 124,col 9)-(line 124,col 27)",
        "(line 125,col 9)-(line 125,col 57)",
        "(line 126,col 9)-(line 126,col 58)",
        "(line 127,col 9)-(line 127,col 75)",
        "(line 128,col 9)-(line 128,col 83)",
        "(line 129,col 9)-(line 131,col 54)",
        "(line 132,col 9)-(line 132,col 77)",
        "(line 133,col 9)-(line 133,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.getAlpha()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * Returns the shape parameter of {@code this} distribution.\n     *\n     * @return the shape parameter\n     * @deprecated as of version 3.1, {@link #getShape()} should be preferred.\n     * This method will be removed in version 4.0.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.getShape()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Returns the shape parameter of {@code this} distribution.\n     *\n     * @return the shape parameter\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.getBeta()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * Returns the scale parameter of {@code this} distribution.\n     *\n     * @return the scale parameter\n     * @deprecated as of version 3.1, {@link #getScale()} should be preferred.\n     * This method will be removed in version 4.0.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.getScale()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * Returns the scale parameter of {@code this} distribution.\n     *\n     * @return the scale parameter\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.probability(double)",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For this distribution {@code P(X \u003d x)} always evaluates to 0.\n     *\n     * @return 0\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.density(double)",
      "begin_line": 188,
      "end_line": 246,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 227,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 230,col 35)",
        "(line 231,col 9)-(line 240,col 9)",
        "(line 244,col 9)-(line 245,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.cumulativeProbability(double)",
      "begin_line": 262,
      "end_line": 272,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/Chi-SquaredDistribution.html\"\u003e\n     *    Chi-Squared Distribution\u003c/a\u003e, equation (9).\n     *  \u003c/li\u003e\n     *  \u003cli\u003eCasella, G., \u0026 Berger, R. (1990). \u003ci\u003eStatistical Inference\u003c/i\u003e.\n     *    Belmont, CA: Duxbury Press.\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 19)",
        "(line 265,col 9)-(line 269,col 9)",
        "(line 271,col 9)-(line 271,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 275,
      "end_line": 278,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.getNumericalMean()",
      "begin_line": 286,
      "end_line": 288,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For shape parameter {@code alpha} and scale parameter {@code beta}, the\n     * mean is {@code alpha * beta}.\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.getNumericalVariance()",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For shape parameter {@code alpha} and scale parameter {@code beta}, the\n     * variance is {@code alpha * beta^2}.\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.getSupportLowerBound()",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the parameters.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.getSupportUpperBound()",
      "begin_line": 321,
      "end_line": 323,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the parameters.\n     *\n     * @return upper bound of the support (always Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 326,
      "end_line": 328,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 331,
      "end_line": 333,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.isSupportConnected()",
      "begin_line": 342,
      "end_line": 344,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.GammaDistribution.sample()",
      "begin_line": 361,
      "end_line": 364,
      "comment": "\n     * \u003cp\u003eThis implementation uses the following algorithms: \u003c/p\u003e\n     *\n     * \u003cp\u003eFor 0 \u003c shape \u003c 1: \u003cbr/\u003e\n     * Ahrens, J. H. and Dieter, U., \u003ci\u003eComputer methods for\n     * sampling from gamma, beta, Poisson and binomial distributions.\u003c/i\u003e\n     * Computing, 12, 223-246, 1974.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor shape \u003e\u003d 1: \u003cbr/\u003e\n     * Marsaglia and Tsang, \u003ci\u003eA Simple Method for Generating\n     * Gamma Variables.\u003c/i\u003e ACM Transactions on Mathematical Software,\n     * Volume 26 Issue 3, September, 2000.\u003c/p\u003e\n     *\n     * @return random value sampled from the Gamma(shape, scale) distribution\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 50)"
      ]
    }
  ]
}