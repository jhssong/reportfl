{
  "filepath": "/tmp/Math-33b/src/main/java/org/apache/commons/math3/distribution/LogNormalDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LogNormalDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 54,
      "end_line": 291,
      "comment": "\n * Implementation of the log-normal (gaussian) distribution.\n *\n * \u003cp\u003e\n * \u003cstrong\u003eParameters:\u003c/strong\u003e\n * {@code X} is log-normally distributed if its natural logarithm {@code log(X)}\n * is normally distributed. The probability distribution function of {@code X}\n * is given by (for {@code x \u003e 0})\n * \u003c/p\u003e\n * \u003cp\u003e\n * {@code exp(-0.5 * ((ln(x) - m) / s)^2) / (s * sqrt(2 * pi) * x)}\n * \u003c/p\u003e\n * \u003cul\u003e\n * \u003cli\u003e{@code m} is the \u003cem\u003escale\u003c/em\u003e parameter: this is the mean of the\n * normally distributed natural logarithm of this distribution,\u003c/li\u003e\n * \u003cli\u003e{@code s} is the \u003cem\u003eshape\u003c/em\u003e parameter: this is the standard\n * deviation of the normally distributed natural logarithm of this\n * distribution.\n * \u003c/ul\u003e\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Log-normal_distribution\"\u003e\n * Log-normal distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/LogNormalDistribution.html\"\u003e\n * Log Normal distribution (MathWorld)\u003c/a\u003e\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Default inverse cumulative probability accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "SQRT2PI"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " \u0026radic;(2 \u0026pi;) "
    },
    {
      "type": "field",
      "varNames": [
        "SQRT2"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " \u0026radic;(2) "
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The scale parameter of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "shape"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " The shape parameter of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.LogNormalDistribution(double, double)",
      "begin_line": 83,
      "end_line": 86,
      "comment": "\n     * Create a log-normal distribution using the specified scale and shape.\n     *\n     * @param scale the scale parameter of this distribution\n     * @param shape the shape parameter of this distribution\n     * @throws NotStrictlyPositiveException if {@code shape \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.LogNormalDistribution(double, double, double)",
      "begin_line": 97,
      "end_line": 106,
      "comment": "\n     * Create a log-normal distribution using the specified scale, shape and\n     * inverse cumulative distribution accuracy.\n     *\n     * @param scale the scale parameter of this distribution\n     * @param shape the shape parameter of this distribution\n     * @param inverseCumAccuracy Inverse cumulative probability accuracy.\n     * @throws NotStrictlyPositiveException if {@code shape \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 101,col 9)",
        "(line 103,col 9)-(line 103,col 27)",
        "(line 104,col 9)-(line 104,col 27)",
        "(line 105,col 9)-(line 105,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.LogNormalDistribution()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Create a log-normal distribution, where the mean and standard deviation\n     * of the {@link NormalDistribution normally distributed} natural\n     * logarithm of the log-normal distribution are equal to zero and one\n     * respectively. In other words, the scale of the returned distribution is\n     * {@code 0}, while its shape is {@code 1}.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.getScale()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * Returns the scale parameter of this distribution.\n     *\n     * @return the scale parameter\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.getShape()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * Returns the shape parameter of this distribution.\n     *\n     * @return the shape parameter\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.probability(double)",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For this distribution {@code P(X \u003d x)} always evaluates to 0.\n     *\n     * @return 0\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.density(double)",
      "begin_line": 159,
      "end_line": 166,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For scale {@code m}, and shape {@code s} of this distribution, the PDF\n     * is given by\n     * \u003cul\u003e\n     * \u003cli\u003e{@code 0} if {@code x \u003c\u003d 0},\u003c/li\u003e\n     * \u003cli\u003e{@code exp(-0.5 * ((ln(x) - m) / s)^2) / (s * sqrt(2 * pi) * x)}\n     * otherwise.\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 50)",
        "(line 164,col 9)-(line 164,col 37)",
        "(line 165,col 9)-(line 165,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.cumulativeProbability(double)",
      "begin_line": 183,
      "end_line": 192,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For scale {@code m}, and shape {@code s} of this distribution, the CDF\n     * is given by\n     * \u003cul\u003e\n     * \u003cli\u003e{@code 0} if {@code x \u003c\u003d 0},\u003c/li\u003e\n     * \u003cli\u003e{@code 0} if {@code ln(x) - m \u003c 0} and {@code m - ln(x) \u003e 40 * s}, as\n     * in these cases the actual value is within {@code Double.MIN_VALUE} of 0,\n     * \u003cli\u003e{@code 1} if {@code ln(x) - m \u003e\u003d 0} and {@code ln(x) - m \u003e 40 * s},\n     * as in these cases the actual value is within {@code Double.MIN_VALUE} of\n     * 1,\u003c/li\u003e\n     * \u003cli\u003e{@code 0.5 + 0.5 * erf((ln(x) - m) / (s * sqrt(2))} otherwise.\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 51)",
        "(line 188,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 191,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.cumulativeProbability(double, double)",
      "begin_line": 195,
      "end_line": 209,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 198,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 205,col 43)",
        "(line 206,col 9)-(line 206,col 61)",
        "(line 207,col 9)-(line 207,col 61)",
        "(line 208,col 9)-(line 208,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 212,
      "end_line": 215,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.getNumericalMean()",
      "begin_line": 223,
      "end_line": 226,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For scale {@code m} and shape {@code s}, the mean is\n     * {@code exp(m + s^2 / 2)}.\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 25)",
        "(line 225,col 9)-(line 225,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.getNumericalVariance()",
      "begin_line": 234,
      "end_line": 238,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For scale {@code m} and shape {@code s}, the variance is\n     * {@code (exp(s^2) - 1) * exp(2 * m + s^2)}.\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 31)",
        "(line 236,col 9)-(line 236,col 32)",
        "(line 237,col 9)-(line 237,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.getSupportLowerBound()",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the parameters.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.getSupportUpperBound()",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the parameters.\n     *\n     * @return upper bound of the support (always\n     * {@code Double.POSITIVE_INFINITY})\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 265,
      "end_line": 267,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 270,
      "end_line": 272,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.isSupportConnected()",
      "begin_line": 281,
      "end_line": 283,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.LogNormalDistribution.sample()",
      "begin_line": 286,
      "end_line": 290,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 49)",
        "(line 289,col 9)-(line 289,col 47)"
      ]
    }
  ]
}