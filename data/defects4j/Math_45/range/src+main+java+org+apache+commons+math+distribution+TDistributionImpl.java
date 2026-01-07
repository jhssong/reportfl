{
  "filepath": "/tmp/Math-45b/src/main/java/org/apache/commons/math/distribution/TDistributionImpl.java",
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
      "begin_line": 33,
      "end_line": 287,
      "comment": "\n * Default implementation of\n * {@link org.apache.commons.math.distribution.TDistribution}.\n *\n * @version $Id$\n "
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
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "degreesOfFreedom"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The degrees of freedom. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.TDistributionImpl(double, double)",
      "begin_line": 59,
      "end_line": 66,
      "comment": "\n     * Create a t distribution using the given degrees of freedom and the\n     * specified inverse cumulative probability absolute accuracy.\n     *\n     * @param degreesOfFreedom Degrees of freedom.\n     * @param inverseCumAccuracy the maximum absolute error in inverse\n     * cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @throws NotStrictlyPositiveException if {@code degreesOfFreedom \u003c\u003d 0}\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 64,col 49)",
        "(line 65,col 9)-(line 65,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.TDistributionImpl(double)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Create a t distribution using the given degrees of freedom.\n     *\n     * @param degreesOfFreedom Degrees of freedom.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.getDegreesOfFreedom()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Access the degrees of freedom.\n     *\n     * @return the degrees of freedom.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.density(double)",
      "begin_line": 89,
      "end_line": 96,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 42)",
        "(line 92,col 9)-(line 92,col 47)",
        "(line 93,col 9)-(line 95,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.cumulativeProbability(double)",
      "begin_line": 104,
      "end_line": 122,
      "comment": "\n     * For this distribution, X, this method returns {@code P(X \u003c x}).\n     *\n     * @param x Value at which the CDF is evaluated.\n     * @return CDF evaluated at {@code x}.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 19)",
        "(line 106,col 9)-(line 119,col 9)",
        "(line 121,col 9)-(line 121,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 135,
      "end_line": 144,
      "comment": "\n     * For this distribution, {@code X}, this method returns the critical\n     * point {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     * Returns {@code Double.NEGATIVE_INFINITY} when p \u003d 0 and\n     * {@code Double.POSITIVE_INFINITY} when p \u003d 1.\n     *\n     * @param p Desired probability.\n     * @return {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     * @throws org.apache.commons.math.exception.OutOfRangeException if\n     * {@code p} is not a valid probability.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 154,
      "end_line": 157,
      "comment": "\n     * Access the domain value lower bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value\n     * @return the domain value lower bound, i.e. {@code P(X \u003c \u0027lower bound\u0027) \u003e p}.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 167,
      "end_line": 170,
      "comment": "\n     * Access the domain value upper bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value upper bound, i.e. {@code P(X \u003c \u0027upper bound\u0027) \u003e p}.\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.getInitialDomain(double)",
      "begin_line": 180,
      "end_line": 183,
      "comment": "\n     * Access the initial domain value, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the initial domain value.\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 192,
      "end_line": 195,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.getSupportLowerBound()",
      "begin_line": 205,
      "end_line": 208,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always negative infinity\n     * no matter the parameters.\n     *\n     * @return lower bound of the support (always Double.NEGATIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.getSupportUpperBound()",
      "begin_line": 218,
      "end_line": 221,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the parameters.\n     *\n     * @return upper bound of the support (always Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.calculateNumericalMean()",
      "begin_line": 234,
      "end_line": 243,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For degrees of freedom parameter df, the mean is\n     * \u003cul\u003e\n     *  \u003cli\u003eif \u003ccode\u003edf \u0026gt; 1\u003c/code\u003e then \u003ccode\u003e0\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003eelse \u003ccode\u003eundefined\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 48)",
        "(line 238,col 9)-(line 240,col 9)",
        "(line 242,col 9)-(line 242,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.calculateNumericalVariance()",
      "begin_line": 257,
      "end_line": 270,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For degrees of freedom parameter df, the variance is\n     * \u003cul\u003e\n     *  \u003cli\u003eif \u003ccode\u003edf \u0026gt; 2\u003c/code\u003e then \u003ccode\u003edf / (df - 2)\u003c/code\u003e \u003c/li\u003e\n     *  \u003cli\u003eif \u003ccode\u003e1 \u0026lt; df \u0026lt;\u003d 2\u003c/code\u003e then \u003ccode\u003epositive infinity\u003c/code\u003e\u003c/li\u003e\n     *  \u003cli\u003eelse \u003ccode\u003eundefined\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 48)",
        "(line 261,col 9)-(line 263,col 9)",
        "(line 265,col 9)-(line 267,col 9)",
        "(line 269,col 9)-(line 269,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.isSupportLowerBoundInclusive()",
      "begin_line": 275,
      "end_line": 278,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionImpl.isSupportUpperBoundInclusive()",
      "begin_line": 283,
      "end_line": 286,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 21)"
      ]
    }
  ]
}