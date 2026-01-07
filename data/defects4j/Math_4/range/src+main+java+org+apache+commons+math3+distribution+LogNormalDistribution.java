{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/LogNormalDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LogNormalDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 56,
      "end_line": 314,
      "comment": "\n * Implementation of the log-normal (gaussian) distribution.\n *\n * \u003cp\u003e\n * \u003cstrong\u003eParameters:\u003c/strong\u003e\n * {@code X} is log-normally distributed if its natural logarithm {@code log(X)}\n * is normally distributed. The probability distribution function of {@code X}\n * is given by (for {@code x \u003e 0})\n * \u003c/p\u003e\n * \u003cp\u003e\n * {@code exp(-0.5 * ((ln(x) - m) / s)^2) / (s * sqrt(2 * pi) * x)}\n * \u003c/p\u003e\n * \u003cul\u003e\n * \u003cli\u003e{@code m} is the \u003cem\u003escale\u003c/em\u003e parameter: this is the mean of the\n * normally distributed natural logarithm of this distribution,\u003c/li\u003e\n * \u003cli\u003e{@code s} is the \u003cem\u003eshape\u003c/em\u003e parameter: this is the standard\n * deviation of the normally distributed natural logarithm of this\n * distribution.\n * \u003c/ul\u003e\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Log-normal_distribution\"\u003e\n * Log-normal distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/LogNormalDistribution.html\"\u003e\n * Log Normal distribution (MathWorld)\u003c/a\u003e\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Default inverse cumulative probability accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "SQRT2PI"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " \u0026radic;(2 \u0026pi;) "
    },
    {
      "type": "field",
      "varNames": [
        "SQRT2"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " \u0026radic;(2) "
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " The scale parameter of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "shape"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " The shape parameter of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.LogNormalDistribution()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Create a log-normal distribution, where the mean and standard deviation\n     * of the {@link NormalDistribution normally distributed} natural\n     * logarithm of the log-normal distribution are equal to zero and one\n     * respectively. In other words, the scale of the returned distribution is\n     * {@code 0}, while its shape is {@code 1}.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.LogNormalDistribution(double, double)",
      "begin_line": 96,
      "end_line": 99,
      "comment": "\n     * Create a log-normal distribution using the specified scale and shape.\n     *\n     * @param scale the scale parameter of this distribution\n     * @param shape the shape parameter of this distribution\n     * @throws NotStrictlyPositiveException if {@code shape \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.LogNormalDistribution(double, double, double)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "\n     * Create a log-normal distribution using the specified scale, shape and\n     * inverse cumulative distribution accuracy.\n     *\n     * @param scale the scale parameter of this distribution\n     * @param shape the shape parameter of this distribution\n     * @param inverseCumAccuracy Inverse cumulative probability accuracy.\n     * @throws NotStrictlyPositiveException if {@code shape \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.LogNormalDistribution(org.apache.commons.math3.random.RandomGenerator, double, double, double)",
      "begin_line": 125,
      "end_line": 139,
      "comment": "\n     * Creates a log-normal distribution.\n     *\n     * @param rng Random number generator.\n     * @param scale Scale parameter of this distribution.\n     * @param shape Shape parameter of this distribution.\n     * @param inverseCumAccuracy Inverse cumulative probability accuracy.\n     * @throws NotStrictlyPositiveException if {@code shape \u003c\u003d 0}.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 19)",
        "(line 132,col 9)-(line 134,col 9)",
        "(line 136,col 9)-(line 136,col 27)",
        "(line 137,col 9)-(line 137,col 27)",
        "(line 138,col 9)-(line 138,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.getScale()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * Returns the scale parameter of this distribution.\n     *\n     * @return the scale parameter\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.getShape()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * Returns the shape parameter of this distribution.\n     *\n     * @return the shape parameter\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.density(double)",
      "begin_line": 170,
      "end_line": 177,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For scale {@code m}, and shape {@code s} of this distribution, the PDF\n     * is given by\n     * \u003cul\u003e\n     * \u003cli\u003e{@code 0} if {@code x \u003c\u003d 0},\u003c/li\u003e\n     * \u003cli\u003e{@code exp(-0.5 * ((ln(x) - m) / s)^2) / (s * sqrt(2 * pi) * x)}\n     * otherwise.\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 50)",
        "(line 175,col 9)-(line 175,col 37)",
        "(line 176,col 9)-(line 176,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.cumulativeProbability(double)",
      "begin_line": 194,
      "end_line": 203,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For scale {@code m}, and shape {@code s} of this distribution, the CDF\n     * is given by\n     * \u003cul\u003e\n     * \u003cli\u003e{@code 0} if {@code x \u003c\u003d 0},\u003c/li\u003e\n     * \u003cli\u003e{@code 0} if {@code ln(x) - m \u003c 0} and {@code m - ln(x) \u003e 40 * s}, as\n     * in these cases the actual value is within {@code Double.MIN_VALUE} of 0,\n     * \u003cli\u003e{@code 1} if {@code ln(x) - m \u003e\u003d 0} and {@code ln(x) - m \u003e 40 * s},\n     * as in these cases the actual value is within {@code Double.MIN_VALUE} of\n     * 1,\u003c/li\u003e\n     * \u003cli\u003e{@code 0.5 + 0.5 * erf((ln(x) - m) / (s * sqrt(2))} otherwise.\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 51)",
        "(line 199,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.cumulativeProbability(double, double)",
      "begin_line": 210,
      "end_line": 214,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @deprecated See {@link RealDistribution#cumulativeProbability(double,double)}\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.probability(double, double)",
      "begin_line": 217,
      "end_line": 232,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 221,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 43)",
        "(line 229,col 9)-(line 229,col 61)",
        "(line 230,col 9)-(line 230,col 61)",
        "(line 231,col 9)-(line 231,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 235,
      "end_line": 238,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.getNumericalMean()",
      "begin_line": 246,
      "end_line": 249,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For scale {@code m} and shape {@code s}, the mean is\n     * {@code exp(m + s^2 / 2)}.\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 25)",
        "(line 248,col 9)-(line 248,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.getNumericalVariance()",
      "begin_line": 257,
      "end_line": 261,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For scale {@code m} and shape {@code s}, the variance is\n     * {@code (exp(s^2) - 1) * exp(2 * m + s^2)}.\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 31)",
        "(line 259,col 9)-(line 259,col 32)",
        "(line 260,col 9)-(line 260,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.getSupportLowerBound()",
      "begin_line": 270,
      "end_line": 272,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the parameters.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.getSupportUpperBound()",
      "begin_line": 283,
      "end_line": 285,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the parameters.\n     *\n     * @return upper bound of the support (always\n     * {@code Double.POSITIVE_INFINITY})\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 288,
      "end_line": 290,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 293,
      "end_line": 295,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.isSupportConnected()",
      "begin_line": 304,
      "end_line": 306,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.sample()",
      "begin_line": 309,
      "end_line": 313,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 47)",
        "(line 312,col 9)-(line 312,col 47)"
      ]
    }
  ]
}