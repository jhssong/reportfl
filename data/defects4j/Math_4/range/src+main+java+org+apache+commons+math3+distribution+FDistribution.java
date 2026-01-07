{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/FDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 34,
      "end_line": 293,
      "comment": "\n * Implementation of the F-distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/F-distribution\"\u003eF-distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/F-Distribution.html\"\u003eF-distribution (MathWorld)\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Default inverse cumulative probability accuracy.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
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
      "begin_line": 45,
      "end_line": 45,
      "comment": " The numerator degrees of freedom. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "numericalVariance"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Cached numerical variance "
    },
    {
      "type": "field",
      "varNames": [
        "numericalVarianceIsCalculated"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Whether or not the numerical variance has been calculated "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.FDistribution.FDistribution(double, double)",
      "begin_line": 62,
      "end_line": 67,
      "comment": "\n     * Creates an F distribution using the given degrees of freedom.\n     *\n     * @param numeratorDegreesOfFreedom Numerator degrees of freedom.\n     * @param denominatorDegreesOfFreedom Denominator degrees of freedom.\n     * @throws NotStrictlyPositiveException if\n     * {@code numeratorDegreesOfFreedom \u003c\u003d 0} or\n     * {@code denominatorDegreesOfFreedom \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 66,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.FDistribution.FDistribution(double, double, double)",
      "begin_line": 82,
      "end_line": 88,
      "comment": "\n     * Creates an F distribution using the given degrees of freedom\n     * and inverse cumulative probability accuracy.\n     *\n     * @param numeratorDegreesOfFreedom Numerator degrees of freedom.\n     * @param denominatorDegreesOfFreedom Denominator degrees of freedom.\n     * @param inverseCumAccuracy the maximum absolute error in inverse\n     * cumulative probability estimates.\n     * @throws NotStrictlyPositiveException if\n     * {@code numeratorDegreesOfFreedom \u003c\u003d 0} or\n     * {@code denominatorDegreesOfFreedom \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 87,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.FDistribution.FDistribution(org.apache.commons.math3.random.RandomGenerator, double, double, double)",
      "begin_line": 103,
      "end_line": 121,
      "comment": "\n     * Creates an F distribution.\n     *\n     * @param rng Random number generator.\n     * @param numeratorDegreesOfFreedom Numerator degrees of freedom.\n     * @param denominatorDegreesOfFreedom Denominator degrees of freedom.\n     * @param inverseCumAccuracy the maximum absolute error in inverse\n     * cumulative probability estimates.\n     * @throws NotStrictlyPositiveException if\n     * {@code numeratorDegreesOfFreedom \u003c\u003d 0} or\n     * {@code denominatorDegreesOfFreedom \u003c\u003d 0}.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 19)",
        "(line 110,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 67)",
        "(line 119,col 9)-(line 119,col 71)",
        "(line 120,col 9)-(line 120,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.FDistribution.density(double)",
      "begin_line": 128,
      "end_line": 139,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 59)",
        "(line 130,col 9)-(line 130,col 61)",
        "(line 131,col 9)-(line 131,col 44)",
        "(line 132,col 9)-(line 132,col 68)",
        "(line 133,col 9)-(line 133,col 70)",
        "(line 134,col 9)-(line 135,col 72)",
        "(line 136,col 9)-(line 138,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.FDistribution.cumulativeProbability(double)",
      "begin_line": 152,
      "end_line": 165,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The implementation of this method is based on\n     * \u003cul\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/F-Distribution.html\"\u003e\n     *   F-Distribution\u003c/a\u003e, equation (4).\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 19)",
        "(line 154,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.FDistribution.getNumeratorDegreesOfFreedom()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * Access the numerator degrees of freedom.\n     *\n     * @return the numerator degrees of freedom.\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.FDistribution.getDenominatorDegreesOfFreedom()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * Access the denominator degrees of freedom.\n     *\n     * @return the denominator degrees of freedom.\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.FDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 186,
      "end_line": 189,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.FDistribution.getNumericalMean()",
      "begin_line": 200,
      "end_line": 208,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For denominator degrees of freedom parameter {@code b}, the mean is\n     * \u003cul\u003e\n     *  \u003cli\u003eif {@code b \u003e 2} then {@code b / (b - 2)},\u003c/li\u003e\n     *  \u003cli\u003eelse undefined ({@code Double.NaN}).\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 70)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 207,col 9)-(line 207,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.FDistribution.getNumericalVariance()",
      "begin_line": 223,
      "end_line": 229,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For numerator degrees of freedom parameter {@code a} and denominator\n     * degrees of freedom parameter {@code b}, the variance is\n     * \u003cul\u003e\n     *  \u003cli\u003e\n     *    if {@code b \u003e 4} then\n     *    {@code [2 * b^2 * (a + b - 2)] / [a * (b - 2)^2 * (b - 4)]},\n     *  \u003c/li\u003e\n     *  \u003cli\u003eelse undefined ({@code Double.NaN}).\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.FDistribution.calculateNumericalVariance()",
      "begin_line": 236,
      "end_line": 248,
      "comment": "\n     * used by {@link #getNumericalVariance()}\n     *\n     * @return the variance of this distribution\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 70)",
        "(line 239,col 9)-(line 245,col 9)",
        "(line 247,col 9)-(line 247,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.FDistribution.getSupportLowerBound()",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the parameters.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.FDistribution.getSupportUpperBound()",
      "begin_line": 269,
      "end_line": 271,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the parameters.\n     *\n     * @return upper bound of the support (always Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.FDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 274,
      "end_line": 276,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.FDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 279,
      "end_line": 281,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.FDistribution.isSupportConnected()",
      "begin_line": 290,
      "end_line": 292,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 20)"
      ]
    }
  ]
}