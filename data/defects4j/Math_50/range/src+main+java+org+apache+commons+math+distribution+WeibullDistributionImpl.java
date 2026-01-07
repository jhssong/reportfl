{
  "filepath": "/tmp/Math-50b/src/main/java/org/apache/commons/math/distribution/WeibullDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WeibullDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractContinuousDistribution",
        "org.apache.commons.math.distribution.WeibullDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 35,
      "end_line": 296,
      "comment": "\n * Default implementation of\n * {@link org.apache.commons.math.distribution.WeibullDistribution}.\n *\n * @since 1.1\n * @version $Id$\n "
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
        "shape"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The shape parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " The scale parameter. "
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
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.WeibullDistributionImpl(double, double)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Create a Weibull distribution with the given shape and scale and a\n     * location equal to zero.\n     *\n     * @param alpha Shape parameter.\n     * @param beta Scale parameter.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.WeibullDistributionImpl(double, double, double)",
      "begin_line": 75,
      "end_line": 88,
      "comment": "\n     * Create a Weibull distribution with the given shape, scale and inverse\n     * cumulative probability accuracy and a location equal to zero.\n     *\n     * @param alpha Shape parameter.\n     * @param beta Scale parameter.\n     * @param inverseCumAccuracy Maximum absolute error in inverse\n     * cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @throws NotStrictlyPositiveException if {@code alpha \u003c\u003d 0} or\n     * {@code beta \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 85,col 21)",
        "(line 86,col 9)-(line 86,col 22)",
        "(line 87,col 9)-(line 87,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.cumulativeProbability(double)",
      "begin_line": 96,
      "end_line": 104,
      "comment": "\n     * For this distribution, {@code X}, this method returns {@code P(X \u003c x)}.\n     *\n     * @param x Value at which the CDF is evaluated.\n     * @return the CDF evaluated at {@code x}.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 19)",
        "(line 98,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getShape()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getScale()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.density(double)",
      "begin_line": 123,
      "end_line": 140,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 127,col 9)",
        "(line 129,col 9)-(line 129,col 40)",
        "(line 130,col 9)-(line 130,col 65)",
        "(line 137,col 9)-(line 137,col 57)",
        "(line 139,col 9)-(line 139,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 152,
      "end_line": 165,
      "comment": "\n     * For this distribution, {@code X}, this method returns the critical\n     * point {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     * It will return {@code Double.NEGATIVE_INFINITY} when p \u003d 0 and\n     * {@code Double.POSITIVE_INFINITY} when p \u003d 1.\n     *\n     * @param p Desired probability.\n     * @return {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     * @throws OutOfRangeException if {@code p} is not a valid probability.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 19)",
        "(line 155,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 176,
      "end_line": 179,
      "comment": "\n     * Access the domain value lower bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value lower bound, i.e. {@code P(X \u003c \u0027lower bound\u0027) \u003c p}.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 189,
      "end_line": 192,
      "comment": "\n     * Access the domain value upper bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value upper bound, i.e. {@code P(X \u003c \u0027upper bound\u0027) \u003e p}.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getInitialDomain(double)",
      "begin_line": 202,
      "end_line": 206,
      "comment": "\n     * Access the initial domain value, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the initial domain value.\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 215,
      "end_line": 218,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getSupportLowerBound()",
      "begin_line": 227,
      "end_line": 230,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the parameters.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getSupportUpperBound()",
      "begin_line": 240,
      "end_line": 243,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the parameters.\n     *\n     * @return upper bound of the support (always Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.calculateNumericalMean()",
      "begin_line": 253,
      "end_line": 259,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The mean is \u003ccode\u003escale * Gamma(1 + (1 / shape))\u003c/code\u003e\n     * where \u003ccode\u003eGamma(...)\u003c/code\u003e is the Gamma-function\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 37)",
        "(line 256,col 9)-(line 256,col 37)",
        "(line 258,col 9)-(line 258,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.calculateNumericalVariance()",
      "begin_line": 270,
      "end_line": 279,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The variance is\n     * \u003ccode\u003escale^2 * Gamma(1 + (2 / shape)) - mean^2\u003c/code\u003e\n     * where \u003ccode\u003eGamma(...)\u003c/code\u003e is the Gamma-function\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 37)",
        "(line 273,col 9)-(line 273,col 37)",
        "(line 274,col 9)-(line 274,col 45)",
        "(line 276,col 9)-(line 278,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.isSupportLowerBoundInclusive()",
      "begin_line": 284,
      "end_line": 287,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.isSupportUpperBoundInclusive()",
      "begin_line": 292,
      "end_line": 295,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 21)"
      ]
    }
  ]
}