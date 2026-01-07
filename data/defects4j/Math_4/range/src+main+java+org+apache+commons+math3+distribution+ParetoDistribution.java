{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/ParetoDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ParetoDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 50,
      "end_line": 280,
      "comment": "\n * Implementation of the Pareto distribution.\n *\n * \u003cp\u003e\n * \u003cstrong\u003eParameters:\u003c/strong\u003e\n * The probability distribution function of {@code X} is given by (for {@code x \u003e\u003d k}):\n * \u003cpre\u003e\n *  α * k^α / x^(α + 1)\n * \u003c/pre\u003e\n * \u003cp\u003e\n * \u003cul\u003e\n * \u003cli\u003e{@code k} is the \u003cem\u003escale\u003c/em\u003e parameter: this is the minimum possible value of {@code X},\u003c/li\u003e\n * \u003cli\u003e{@code α} is the \u003cem\u003eshape\u003c/em\u003e parameter: this is the Pareto index\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Pareto_distribution\"\u003e\n * Pareto distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/ParetoDistribution.html\"\u003e\n * Pareto distribution (MathWorld)\u003c/a\u003e\n *\n * @version $Id$\n * @since 4.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Default inverse cumulative probability accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " The scale parameter of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "shape"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The shape parameter of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.ParetoDistribution.ParetoDistribution()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Create a Pareto distribution with a scale of {@code 1} and a shape of {@code 1}.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.ParetoDistribution.ParetoDistribution(double, double)",
      "begin_line": 81,
      "end_line": 84,
      "comment": "\n     * Create a Pareto distribution using the specified scale and shape.\n     *\n     * @param scale the scale parameter of this distribution\n     * @param shape the shape parameter of this distribution\n     * @throws NotStrictlyPositiveException if {@code scale \u003c\u003d 0} or {@code shape \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.ParetoDistribution.ParetoDistribution(double, double, double)",
      "begin_line": 95,
      "end_line": 98,
      "comment": "\n     * Create a Pareto distribution using the specified scale, shape and\n     * inverse cumulative distribution accuracy.\n     *\n     * @param scale the scale parameter of this distribution\n     * @param shape the shape parameter of this distribution\n     * @param inverseCumAccuracy Inverse cumulative probability accuracy.\n     * @throws NotStrictlyPositiveException if {@code scale \u003c\u003d 0} or {@code shape \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.ParetoDistribution.ParetoDistribution(org.apache.commons.math3.random.RandomGenerator, double, double, double)",
      "begin_line": 109,
      "end_line": 127,
      "comment": "\n     * Creates a log-normal distribution.\n     *\n     * @param rng Random number generator.\n     * @param scale Scale parameter of this distribution.\n     * @param shape Shape parameter of this distribution.\n     * @param inverseCumAccuracy Inverse cumulative probability accuracy.\n     * @throws NotStrictlyPositiveException if {@code scale \u003c\u003d 0} or {@code shape \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 19)",
        "(line 116,col 9)-(line 118,col 9)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 124,col 9)-(line 124,col 27)",
        "(line 125,col 9)-(line 125,col 27)",
        "(line 126,col 9)-(line 126,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ParetoDistribution.getScale()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Returns the scale parameter of this distribution.\n     *\n     * @return the scale parameter\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ParetoDistribution.getShape()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * Returns the shape parameter of this distribution.\n     *\n     * @return the shape parameter\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ParetoDistribution.density(double)",
      "begin_line": 157,
      "end_line": 162,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * For scale {@code k}, and shape {@code α} of this distribution, the PDF\n     * is given by\n     * \u003cul\u003e\n     * \u003cli\u003e{@code 0} if {@code x \u003c k},\u003c/li\u003e\n     * \u003cli\u003e{@code α * k^α / x^(α + 1)} otherwise.\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ParetoDistribution.cumulativeProbability(double)",
      "begin_line": 173,
      "end_line": 178,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * For scale {@code k}, and shape {@code α} of this distribution, the CDF is given by\n     * \u003cul\u003e\n     * \u003cli\u003e{@code 0} if {@code x \u003c k},\u003c/li\u003e\n     * \u003cli\u003e{@code 1 - (k / x)^α} otherwise.\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ParetoDistribution.cumulativeProbability(double, double)",
      "begin_line": 185,
      "end_line": 190,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @deprecated See {@link RealDistribution#cumulativeProbability(double,double)}\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ParetoDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 193,
      "end_line": 196,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ParetoDistribution.getNumericalMean()",
      "begin_line": 207,
      "end_line": 212,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * For scale {@code k} and shape {@code α}, the mean is given by\n     * \u003cul\u003e\n     * \u003cli\u003e{@code ∞} if {@code α \u003c\u003d 1},\u003c/li\u003e\n     * \u003cli\u003e{@code α * k / (α - 1)} otherwise.\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ParetoDistribution.getNumericalVariance()",
      "begin_line": 223,
      "end_line": 229,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * For scale {@code k} and shape {@code α}, the variance is given by\n     * \u003cul\u003e\n     * \u003cli\u003e{@code ∞} if {@code 1 \u003c α \u003c\u003d 2},\u003c/li\u003e\n     * \u003cli\u003e{@code k^2 * α / ((α - 1)^2 * (α - 2))} otherwise.\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 29)",
        "(line 228,col 9)-(line 228,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ParetoDistribution.getSupportLowerBound()",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * The lower bound of the support is equal to the scale parameter {@code k}.\n     *\n     * @return lower bound of the support\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ParetoDistribution.getSupportUpperBound()",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * The upper bound of the support is always positive infinity no matter the parameters.\n     *\n     * @return upper bound of the support (always {@code Double.POSITIVE_INFINITY})\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ParetoDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 254,
      "end_line": 256,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ParetoDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 259,
      "end_line": 261,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ParetoDistribution.isSupportConnected()",
      "begin_line": 270,
      "end_line": 272,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.ParetoDistribution.sample()",
      "begin_line": 275,
      "end_line": 279,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 45)",
        "(line 278,col 9)-(line 278,col 50)"
      ]
    }
  ]
}