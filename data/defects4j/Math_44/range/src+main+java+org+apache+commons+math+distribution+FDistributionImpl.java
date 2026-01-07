{
  "filepath": "/tmp/Math-44b/src/main/java/org/apache/commons/math/distribution/FDistributionImpl.java",
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
      "begin_line": 33,
      "end_line": 327,
      "comment": "\n * Default implementation of\n * {@link org.apache.commons.math.distribution.FDistribution}.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Default inverse cumulative probability accuracy.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "numeratorDegreesOfFreedom"
      ],
      "begin_line": 44,
      "end_line": 44,
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
      "begin_line": 48,
      "end_line": 48,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.FDistributionImpl(double, double)",
      "begin_line": 57,
      "end_line": 61,
      "comment": "\n     * Create a F distribution using the given degrees of freedom.\n     * @param numeratorDegreesOfFreedom Numerator degrees of freedom.\n     * @param denominatorDegreesOfFreedom Denominator degrees of freedom.\n     * @throws NotStrictlyPositiveException if {@code numeratorDegreesOfFreedom \u003c\u003d 0}\n     * or {@code denominatorDegreesOfFreedom \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 60,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.FDistributionImpl(double, double, double)",
      "begin_line": 75,
      "end_line": 89,
      "comment": "\n     * Create an F distribution using the given degrees of freedom\n     * and inverse cumulative probability accuracy.\n     * @param numeratorDegreesOfFreedom Numerator degrees of freedom.\n     * @param denominatorDegreesOfFreedom Denominator degrees of freedom.\n     * @param inverseCumAccuracy the maximum absolute error in inverse\n     * cumulative probability estimates.\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY})\n     * @throws NotStrictlyPositiveException if {@code numeratorDegreesOfFreedom \u003c\u003d 0}\n     * or {@code denominatorDegreesOfFreedom \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 67)",
        "(line 87,col 9)-(line 87,col 71)",
        "(line 88,col 9)-(line 88,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.density(double)",
      "begin_line": 98,
      "end_line": 110,
      "comment": "\n     * Returns the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 59)",
        "(line 101,col 9)-(line 101,col 61)",
        "(line 102,col 9)-(line 102,col 44)",
        "(line 103,col 9)-(line 103,col 68)",
        "(line 104,col 9)-(line 104,col 70)",
        "(line 105,col 9)-(line 106,col 72)",
        "(line 107,col 9)-(line 109,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.cumulativeProbability(double)",
      "begin_line": 126,
      "end_line": 139,
      "comment": "\n     * For this distribution, {@code X}, this method returns {@code P(X \u003c x)}.\n     *\n     * The implementation of this method is based on\n     * \u003cul\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/F-Distribution.html\"\u003e\n     *   F-Distribution\u003c/a\u003e, equation (4).\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x Value at which the CDF is evaluated.\n     * @return CDF for this distribution.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 19)",
        "(line 128,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 151,
      "end_line": 160,
      "comment": "\n     * For this distribution, {@code X}, this method returns the critical\n     * point {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     * Returns 0 when p \u003d 0 and {@code Double.POSITIVE_INFINITY} when p \u003d 1.\n     *\n     * @param p Desired probability.\n     * @return {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     * @throws IllegalArgumentException if {@code p} is not a valid\n     * probability.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 170,
      "end_line": 173,
      "comment": "\n     * Access the domain value lower bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value lower bound, i.e. {@code P(X \u003c \u0027lower bound\u0027) \u003c p}.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 183,
      "end_line": 186,
      "comment": "\n     * Access the domain value upper bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value upper bound, i.e. {@code P(X \u003c \u0027upper bound\u0027) \u003e p}.\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getInitialDomain(double)",
      "begin_line": 196,
      "end_line": 205,
      "comment": "\n     * Access the initial domain value, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the initial domain value.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 23)",
        "(line 199,col 9)-(line 199,col 47)",
        "(line 200,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getNumeratorDegreesOfFreedom()",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getDenominatorDegreesOfFreedom()",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 228,
      "end_line": 231,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getSupportLowerBound()",
      "begin_line": 240,
      "end_line": 243,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the parameters.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.getSupportUpperBound()",
      "begin_line": 253,
      "end_line": 256,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the parameters.\n     *\n     * @return upper bound of the support (always Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.calculateNumericalMean()",
      "begin_line": 270,
      "end_line": 279,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For denominator degrees of freedom parameter \u003ccode\u003eb\u003c/code\u003e,\n     * the mean is\n     * \u003cul\u003e\n     *  \u003cli\u003eif \u003ccode\u003eb \u0026gt; 2\u003c/code\u003e then \u003ccode\u003eb / (b - 2)\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eelse \u003ccode\u003eundefined\u003c/code\u003e\n     * \u003c/ul\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 70)",
        "(line 274,col 9)-(line 276,col 9)",
        "(line 278,col 9)-(line 278,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.calculateNumericalVariance()",
      "begin_line": 297,
      "end_line": 310,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For numerator degrees of freedom parameter \u003ccode\u003ea\u003c/code\u003e\n     * and denominator degrees of freedom parameter \u003ccode\u003eb\u003c/code\u003e,\n     * the variance is\n     * \u003cul\u003e\n     *  \u003cli\u003e\n     *    if \u003ccode\u003eb \u0026gt; 4\u003c/code\u003e then\n     *    \u003ccode\u003e[ 2 * b^2 * (a + b - 2) ] / [ a * (b - 2)^2 * (b - 4) ]\u003c/code\u003e\n     *  \u003c/li\u003e\n     *  \u003cli\u003eelse \u003ccode\u003eundefined\u003c/code\u003e\n     * \u003c/ul\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 70)",
        "(line 301,col 9)-(line 307,col 9)",
        "(line 309,col 9)-(line 309,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.isSupportLowerBoundInclusive()",
      "begin_line": 315,
      "end_line": 318,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.FDistributionImpl.isSupportUpperBoundInclusive()",
      "begin_line": 323,
      "end_line": 326,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 21)"
      ]
    }
  ]
}