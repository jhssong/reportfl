{
  "filepath": "/tmp/Math-58b/src/main/java/org/apache/commons/math/distribution/FDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractContinuousDistribution",
        "org.apache.commons.math.distribution.FDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 34,
      "end_line": 333,
      "comment": "\n * Default implementation of\n * {@link org.apache.commons.math.distribution.FDistribution}.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Default inverse cumulative probability accuracy.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "numeratorDegreesOfFreedom"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The numerator degrees of freedom. "
    },
    {
      "type": "field",
      "varNames": [
        "denominatorDegreesOfFreedom"
      ],
      "begin_line": 47,
      "end_line": 47,
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
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.FDistributionImpl(double, double)",
      "begin_line": 58,
      "end_line": 62,
      "comment": "\n     * Create a F distribution using the given degrees of freedom.\n     * @param numeratorDegreesOfFreedom Numerator degrees of freedom.\n     * @param denominatorDegreesOfFreedom Denominator degrees of freedom.\n     * @throws NotStrictlyPositiveException if {@code numeratorDegreesOfFreedom \u003c\u003d 0}\n     * or {@code denominatorDegreesOfFreedom \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 61,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.FDistributionImpl(double, double, double)",
      "begin_line": 76,
      "end_line": 90,
      "comment": "\n     * Create an F distribution using the given degrees of freedom\n     * and inverse cumulative probability accuracy.\n     * @param numeratorDegreesOfFreedom Numerator degrees of freedom.\n     * @param denominatorDegreesOfFreedom Denominator degrees of freedom.\n     * @param inverseCumAccuracy the maximum absolute error in inverse\n     * cumulative probability estimates.\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY})\n     * @throws NotStrictlyPositiveException if {@code numeratorDegreesOfFreedom \u003c\u003d 0}\n     * or {@code denominatorDegreesOfFreedom \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 67)",
        "(line 88,col 9)-(line 88,col 71)",
        "(line 89,col 9)-(line 89,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.density(double)",
      "begin_line": 99,
      "end_line": 111,
      "comment": "\n     * Returns the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 59)",
        "(line 102,col 9)-(line 102,col 61)",
        "(line 103,col 9)-(line 103,col 44)",
        "(line 104,col 9)-(line 104,col 68)",
        "(line 105,col 9)-(line 105,col 70)",
        "(line 106,col 9)-(line 107,col 72)",
        "(line 108,col 9)-(line 110,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.cumulativeProbability(double)",
      "begin_line": 129,
      "end_line": 142,
      "comment": "\n     * For this distribution, {@code X}, this method returns {@code P(X \u003c x)}.\n     *\n     * The implementation of this method is based on\n     * \u003cul\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/F-Distribution.html\"\u003e\n     *   F-Distribution\u003c/a\u003e, equation (4).\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x Value at which the CDF is evaluated.\n     * @return CDF for this distribution.\n     * @throws MathException if the cumulative probability cannot be\n     * computed due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 19)",
        "(line 131,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 156,
      "end_line": 166,
      "comment": "\n     * For this distribution, {@code X}, this method returns the critical\n     * point {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     * Returns 0 when p \u003d 0 and {@code Double.POSITIVE_INFINITY} when p \u003d 1.\n     *\n     * @param p Desired probability.\n     * @return {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     * @throws MathException if the inverse cumulative probability cannot be\n     * computed due to convergence or other numerical errors.\n     * @throws IllegalArgumentException if {@code p} is not a valid\n     * probability.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 176,
      "end_line": 179,
      "comment": "\n     * Access the domain value lower bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value lower bound, i.e. {@code P(X \u003c \u0027lower bound\u0027) \u003c p}.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 189,
      "end_line": 192,
      "comment": "\n     * Access the domain value upper bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value upper bound, i.e. {@code P(X \u003c \u0027upper bound\u0027) \u003e p}.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getInitialDomain(double)",
      "begin_line": 202,
      "end_line": 211,
      "comment": "\n     * Access the initial domain value, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the initial domain value.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 23)",
        "(line 205,col 9)-(line 205,col 47)",
        "(line 206,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getNumeratorDegreesOfFreedom()",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getDenominatorDegreesOfFreedom()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 234,
      "end_line": 237,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getSupportLowerBound()",
      "begin_line": 246,
      "end_line": 249,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the parameters.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getSupportUpperBound()",
      "begin_line": 259,
      "end_line": 262,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the parameters.\n     *\n     * @return upper bound of the support (always Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.calculateNumericalMean()",
      "begin_line": 276,
      "end_line": 285,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For denominator degrees of freedom parameter \u003ccode\u003eb\u003c/code\u003e,\n     * the mean is\n     * \u003cul\u003e\n     *  \u003cli\u003eif \u003ccode\u003eb \u0026gt; 2\u003c/code\u003e then \u003ccode\u003eb / (b - 2)\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eelse \u003ccode\u003eundefined\u003c/code\u003e\n     * \u003c/ul\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 70)",
        "(line 280,col 9)-(line 282,col 9)",
        "(line 284,col 9)-(line 284,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.calculateNumericalVariance()",
      "begin_line": 303,
      "end_line": 316,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For numerator degrees of freedom parameter \u003ccode\u003ea\u003c/code\u003e\n     * and denominator degrees of freedom parameter \u003ccode\u003eb\u003c/code\u003e,\n     * the variance is\n     * \u003cul\u003e\n     *  \u003cli\u003e\n     *    if \u003ccode\u003eb \u0026gt; 4\u003c/code\u003e then\n     *    \u003ccode\u003e[ 2 * b^2 * (a + b - 2) ] / [ a * (b - 2)^2 * (b - 4) ]\u003c/code\u003e\n     *  \u003c/li\u003e\n     *  \u003cli\u003eelse \u003ccode\u003eundefined\u003c/code\u003e\n     * \u003c/ul\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 70)",
        "(line 307,col 9)-(line 313,col 9)",
        "(line 315,col 9)-(line 315,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.isSupportLowerBoundInclusive()",
      "begin_line": 321,
      "end_line": 324,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.isSupportUpperBoundInclusive()",
      "begin_line": 329,
      "end_line": 332,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 21)"
      ]
    }
  ]
}