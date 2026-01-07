{
  "filepath": "/tmp/Math-46b/src/main/java/org/apache/commons/math/distribution/TDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractContinuousDistribution",
        "org.apache.commons.math.distribution.TDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 34,
      "end_line": 293,
      "comment": "\n * Default implementation of\n * {@link org.apache.commons.math.distribution.TDistribution}.\n *\n * @version $Id$\n "
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
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "degreesOfFreedom"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The degrees of freedom. "
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
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.TDistributionImpl(double, double)",
      "begin_line": 60,
      "end_line": 67,
      "comment": "\n     * Create a t distribution using the given degrees of freedom and the\n     * specified inverse cumulative probability absolute accuracy.\n     *\n     * @param degreesOfFreedom Degrees of freedom.\n     * @param inverseCumAccuracy the maximum absolute error in inverse\n     * cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @throws NotStrictlyPositiveException if {@code degreesOfFreedom \u003c\u003d 0}\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 64,col 9)",
        "(line 65,col 9)-(line 65,col 49)",
        "(line 66,col 9)-(line 66,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.TDistributionImpl(double)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Create a t distribution using the given degrees of freedom.\n     *\n     * @param degreesOfFreedom Degrees of freedom.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.getDegreesOfFreedom()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Access the degrees of freedom.\n     *\n     * @return the degrees of freedom.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.density(double)",
      "begin_line": 90,
      "end_line": 97,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 42)",
        "(line 93,col 9)-(line 93,col 47)",
        "(line 94,col 9)-(line 96,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.cumulativeProbability(double)",
      "begin_line": 107,
      "end_line": 125,
      "comment": "\n     * For this distribution, X, this method returns {@code P(X \u003c x}).\n     *\n     * @param x Value at which the CDF is evaluated.\n     * @return CDF evaluated at {@code x}.\n     * @throws MathException if the cumulative probability can not be\n     * computed due to convergence or other numerical errors.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 19)",
        "(line 109,col 9)-(line 122,col 9)",
        "(line 124,col 9)-(line 124,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 140,
      "end_line": 150,
      "comment": "\n     * For this distribution, {@code X}, this method returns the critical\n     * point {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     * Returns {@code Double.NEGATIVE_INFINITY} when p \u003d 0 and\n     * {@code Double.POSITIVE_INFINITY} when p \u003d 1.\n     *\n     * @param p Desired probability.\n     * @return {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     * @throws MathException if the inverse cumulative probability cannot be\n     * computed due to convergence or other numerical errors.\n     * @throws org.apache.commons.math.exception.OutOfRangeException if\n     * {@code p} is not a valid probability.\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 160,
      "end_line": 163,
      "comment": "\n     * Access the domain value lower bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value\n     * @return the domain value lower bound, i.e. {@code P(X \u003c \u0027lower bound\u0027) \u003e p}.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 173,
      "end_line": 176,
      "comment": "\n     * Access the domain value upper bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value upper bound, i.e. {@code P(X \u003c \u0027upper bound\u0027) \u003e p}.\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.getInitialDomain(double)",
      "begin_line": 186,
      "end_line": 189,
      "comment": "\n     * Access the initial domain value, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the initial domain value.\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 198,
      "end_line": 201,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.getSupportLowerBound()",
      "begin_line": 211,
      "end_line": 214,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always negative infinity\n     * no matter the parameters.\n     *\n     * @return lower bound of the support (always Double.NEGATIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.getSupportUpperBound()",
      "begin_line": 224,
      "end_line": 227,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the parameters.\n     *\n     * @return upper bound of the support (always Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.calculateNumericalMean()",
      "begin_line": 240,
      "end_line": 249,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For degrees of freedom parameter df, the mean is\n     * \u003cul\u003e\n     *  \u003cli\u003eif \u003ccode\u003edf \u0026gt; 1\u003c/code\u003e then \u003ccode\u003e0\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eelse \u003ccode\u003eundefined\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 48)",
        "(line 244,col 9)-(line 246,col 9)",
        "(line 248,col 9)-(line 248,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.calculateNumericalVariance()",
      "begin_line": 263,
      "end_line": 276,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For degrees of freedom parameter df, the variance is\n     * \u003cul\u003e\n     *  \u003cli\u003eif \u003ccode\u003edf \u0026gt; 2\u003c/code\u003e then \u003ccode\u003edf / (df - 2)\u003c/code\u003e \u003c/li\u003e\n     *  \u003cli\u003eif \u003ccode\u003e1 \u0026lt; df \u0026lt;\u003d 2\u003c/code\u003e then \u003ccode\u003epositive infinity\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eelse \u003ccode\u003eundefined\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 48)",
        "(line 267,col 9)-(line 269,col 9)",
        "(line 271,col 9)-(line 273,col 9)",
        "(line 275,col 9)-(line 275,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.isSupportLowerBoundInclusive()",
      "begin_line": 281,
      "end_line": 284,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.isSupportUpperBoundInclusive()",
      "begin_line": 289,
      "end_line": 292,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 21)"
      ]
    }
  ]
}