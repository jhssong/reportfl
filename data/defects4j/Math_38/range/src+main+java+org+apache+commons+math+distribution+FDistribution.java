{
  "filepath": "/tmp/Math-38b/src/main/java/org/apache/commons/math/distribution/FDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractRealDistribution"
      ],
      "begin_line": 32,
      "end_line": 283,
      "comment": "\n * Implementation of the F-distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/F-distribution\"\u003eF-distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/F-Distribution.html\"\u003eF-distribution (MathWorld)\u003c/a\u003e\n * @version $Id$\n "
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
      "begin_line": 40,
      "end_line": 40,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "numeratorDegreesOfFreedom"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The numerator degrees of freedom. "
    },
    {
      "type": "field",
      "varNames": [
        "denominatorDegreesOfFreedom"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The numerator degrees of freedom. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "numericalVariance"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Cached numerical variance "
    },
    {
      "type": "field",
      "varNames": [
        "numericalVarianceIsCalculated"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Whether or not the numerical variance has been calculated "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.FDistribution.FDistribution(double, double)",
      "begin_line": 65,
      "end_line": 70,
      "comment": "\n     * Create a F distribution using the given degrees of freedom.\n     * @param numeratorDegreesOfFreedom Numerator degrees of freedom.\n     * @param denominatorDegreesOfFreedom Denominator degrees of freedom.\n     * @throws NotStrictlyPositiveException if\n     * {@code numeratorDegreesOfFreedom \u003c\u003d 0} or\n     * {@code denominatorDegreesOfFreedom \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 69,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.FDistribution.FDistribution(double, double, double)",
      "begin_line": 85,
      "end_line": 100,
      "comment": "\n     * Create an F distribution using the given degrees of freedom\n     * and inverse cumulative probability accuracy.\n     * @param numeratorDegreesOfFreedom Numerator degrees of freedom.\n     * @param denominatorDegreesOfFreedom Denominator degrees of freedom.\n     * @param inverseCumAccuracy the maximum absolute error in inverse\n     * cumulative probability estimates.\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY})\n     * @throws NotStrictlyPositiveException if\n     * {@code numeratorDegreesOfFreedom \u003c\u003d 0} or\n     * {@code denominatorDegreesOfFreedom \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 67)",
        "(line 98,col 9)-(line 98,col 71)",
        "(line 99,col 9)-(line 99,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistribution.probability(double)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For this distribution {@code P(X \u003d x)} always evaluates to 0.\n     *\n     * @return 0\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistribution.density(double)",
      "begin_line": 118,
      "end_line": 129,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 59)",
        "(line 120,col 9)-(line 120,col 61)",
        "(line 121,col 9)-(line 121,col 44)",
        "(line 122,col 9)-(line 122,col 68)",
        "(line 123,col 9)-(line 123,col 70)",
        "(line 124,col 9)-(line 125,col 72)",
        "(line 126,col 9)-(line 128,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistribution.cumulativeProbability(double)",
      "begin_line": 142,
      "end_line": 155,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The implementation of this method is based on\n     * \u003cul\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/F-Distribution.html\"\u003e\n     *   F-Distribution\u003c/a\u003e, equation (4).\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 19)",
        "(line 144,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistribution.getNumeratorDegreesOfFreedom()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Access the numerator degrees of freedom.\n     *\n     * @return the numerator degrees of freedom.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistribution.getDenominatorDegreesOfFreedom()",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * Access the denominator degrees of freedom.\n     *\n     * @return the denominator degrees of freedom.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 176,
      "end_line": 179,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistribution.getNumericalMean()",
      "begin_line": 190,
      "end_line": 198,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For denominator degrees of freedom parameter {@code b}, the mean is\n     * \u003cul\u003e\n     *  \u003cli\u003eif {@code b \u003e 2} then {@code b / (b - 2)},\u003c/li\u003e\n     *  \u003cli\u003eelse undefined ({@code Double.NaN}).\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 70)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 197,col 9)-(line 197,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistribution.getNumericalVariance()",
      "begin_line": 213,
      "end_line": 219,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For numerator degrees of freedom parameter {@code a} and denominator\n     * degrees of freedom parameter {@code b}, the variance is\n     * \u003cul\u003e\n     *  \u003cli\u003e\n     *    if {@code b \u003e 4} then\n     *    {@code [2 * b^2 * (a + b - 2)] / [a * (b - 2)^2 * (b - 4)]},\n     *  \u003c/li\u003e\n     *  \u003cli\u003eelse undefined ({@code Double.NaN}).\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistribution.calculateNumericalVariance()",
      "begin_line": 226,
      "end_line": 238,
      "comment": "\n     * used by {@link #getNumericalVariance()}\n     *\n     * @return the variance of this distribution\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 70)",
        "(line 229,col 9)-(line 235,col 9)",
        "(line 237,col 9)-(line 237,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistribution.getSupportLowerBound()",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the parameters.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistribution.getSupportUpperBound()",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the parameters.\n     *\n     * @return upper bound of the support (always Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 264,
      "end_line": 266,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 269,
      "end_line": 271,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistribution.isSupportConnected()",
      "begin_line": 280,
      "end_line": 282,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 20)"
      ]
    }
  ]
}