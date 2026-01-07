{
  "filepath": "/tmp/Math-42b/src/main/java/org/apache/commons/math/distribution/FDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractContinuousDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 35,
      "end_line": 290,
      "comment": "\n * Implementation of the F-distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/F-distribution\"\u003eF-distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/F-Distribution.html\"\u003eF-distribution (MathWorld)\u003c/a\u003e\n * @version $Id$\n "
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
      "begin_line": 44,
      "end_line": 44,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "numeratorDegreesOfFreedom"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The numerator degrees of freedom. "
    },
    {
      "type": "field",
      "varNames": [
        "denominatorDegreesOfFreedom"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " The numerator degrees of freedom. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.FDistribution.FDistribution(double, double)",
      "begin_line": 60,
      "end_line": 65,
      "comment": "\n     * Create a F distribution using the given degrees of freedom.\n     * @param numeratorDegreesOfFreedom Numerator degrees of freedom.\n     * @param denominatorDegreesOfFreedom Denominator degrees of freedom.\n     * @throws NotStrictlyPositiveException if\n     * {@code numeratorDegreesOfFreedom \u003c\u003d 0} or\n     * {@code denominatorDegreesOfFreedom \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 64,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.FDistribution.FDistribution(double, double, double)",
      "begin_line": 80,
      "end_line": 95,
      "comment": "\n     * Create an F distribution using the given degrees of freedom\n     * and inverse cumulative probability accuracy.\n     * @param numeratorDegreesOfFreedom Numerator degrees of freedom.\n     * @param denominatorDegreesOfFreedom Denominator degrees of freedom.\n     * @param inverseCumAccuracy the maximum absolute error in inverse\n     * cumulative probability estimates.\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY})\n     * @throws NotStrictlyPositiveException if\n     * {@code numeratorDegreesOfFreedom \u003c\u003d 0} or\n     * {@code denominatorDegreesOfFreedom \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 92,col 67)",
        "(line 93,col 9)-(line 93,col 71)",
        "(line 94,col 9)-(line 94,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistribution.density(double)",
      "begin_line": 102,
      "end_line": 113,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 59)",
        "(line 104,col 9)-(line 104,col 61)",
        "(line 105,col 9)-(line 105,col 44)",
        "(line 106,col 9)-(line 106,col 68)",
        "(line 107,col 9)-(line 107,col 70)",
        "(line 108,col 9)-(line 109,col 72)",
        "(line 110,col 9)-(line 112,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistribution.cumulativeProbability(double)",
      "begin_line": 126,
      "end_line": 139,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The implementation of this method is based on\n     * \u003cul\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/F-Distribution.html\"\u003e\n     *   F-Distribution\u003c/a\u003e, equation (4).\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 19)",
        "(line 128,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistribution.inverseCumulativeProbability(double)",
      "begin_line": 147,
      "end_line": 156,
      "comment": "\n     * {@inheritDoc}\n     *\n     * Returns {@code 0} when {@code p \u003d\u003d 0} and\n     * {@code Double.POSITIVE_INFINITY} when {@code p \u003d\u003d 1}.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistribution.getDomainLowerBound(double)",
      "begin_line": 159,
      "end_line": 162,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistribution.getDomainUpperBound(double)",
      "begin_line": 165,
      "end_line": 168,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistribution.getInitialDomain(double)",
      "begin_line": 171,
      "end_line": 180,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 23)",
        "(line 174,col 9)-(line 174,col 47)",
        "(line 175,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistribution.getNumeratorDegreesOfFreedom()",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\n     * Access the numerator degrees of freedom.\n     *\n     * @return the numerator degrees of freedom.\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistribution.getDenominatorDegreesOfFreedom()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * Access the denominator degrees of freedom.\n     *\n     * @return the denominator degrees of freedom.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 201,
      "end_line": 204,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistribution.getSupportLowerBound()",
      "begin_line": 213,
      "end_line": 216,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the parameters.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistribution.getSupportUpperBound()",
      "begin_line": 226,
      "end_line": 229,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the parameters.\n     *\n     * @return upper bound of the support (always Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistribution.calculateNumericalMean()",
      "begin_line": 240,
      "end_line": 249,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For denominator degrees of freedom parameter {@code b}, the mean is\n     * \u003cul\u003e\n     *  \u003cli\u003eif {@code b \u003e 2} then {@code b / (b - 2)},\u003c/li\u003e\n     *  \u003cli\u003eelse undefined ({@code Double.NaN}).\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 70)",
        "(line 244,col 9)-(line 246,col 9)",
        "(line 248,col 9)-(line 248,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistribution.calculateNumericalVariance()",
      "begin_line": 264,
      "end_line": 277,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For numerator degrees of freedom parameter {@code a} and denominator\n     * degrees of freedom parameter {@code b}, the variance is\n     * \u003cul\u003e\n     *  \u003cli\u003e\n     *    if {@code b \u003e 4} then\n     *    {@code [2 * b^2 * (a + b - 2)] / [a * (b - 2)^2 * (b - 4)]},\n     *  \u003c/li\u003e\n     *  \u003cli\u003eelse undefined ({@code Double.NaN}).\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 70)",
        "(line 268,col 9)-(line 274,col 9)",
        "(line 276,col 9)-(line 276,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 280,
      "end_line": 283,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 286,
      "end_line": 289,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 21)"
      ]
    }
  ]
}