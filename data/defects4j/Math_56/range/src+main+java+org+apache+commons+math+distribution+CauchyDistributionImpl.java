{
  "filepath": "/tmp/Math-56b/src/main/java/org/apache/commons/math/distribution/CauchyDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CauchyDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractContinuousDistribution",
        "org.apache.commons.math.distribution.CauchyDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 34,
      "end_line": 289,
      "comment": "\n * Default implementation of\n * {@link org.apache.commons.math.distribution.CauchyDistribution}.\n *\n * @since 1.1\n * @version $Revision$ $Date$\n "
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
        "median"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The median of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The scale of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Inverse cumulative probability accuracy "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.CauchyDistributionImpl()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Creates cauchy distribution with the medain equal to zero and scale\n     * equal to one.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.CauchyDistributionImpl(double, double)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Create a cauchy distribution using the given median and scale.\n     *\n     * @param median Median for this distribution.\n     * @param scale Scale parameter for this distribution.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.CauchyDistributionImpl(double, double, double)",
      "begin_line": 79,
      "end_line": 87,
      "comment": "\n     * Create a cauchy distribution using the given median and scale.\n     *\n     * @param median Median for this distribution.\n     * @param scale Scale parameter for this distribution.\n     * @param inverseCumAccuracy Maximum absolute error in inverse\n     * cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @throws NotStrictlyPositiveException if {@code s \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 27)",
        "(line 85,col 9)-(line 85,col 29)",
        "(line 86,col 9)-(line 86,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.cumulativeProbability(double)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * For this distribution, {@code X}, this method returns {@code P(X \u003c x)}.\n     *\n     * @param x Value at which the CDF is evaluated.\n     * @return CDF evaluated at {@code x}.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.getMedian()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.getScale()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.density(double)",
      "begin_line": 116,
      "end_line": 120,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 38)",
        "(line 119,col 9)-(line 119,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 132,
      "end_line": 145,
      "comment": "\n     * For this distribution, {@code X}, this method returns the critical\n     * point {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     * It will return {@code Double.NEGATIVE_INFINITY} when p \u003d 0 and\n     * {@code Double.POSITIVE_INFINITY} when p \u003d 1.\n     *\n     * @param p Desired probability.\n     * @return {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     * @throws OutOfRangeException if {@code p} is not a valid probability.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 19)",
        "(line 135,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 155,
      "end_line": 166,
      "comment": "\n     * Access the domain value lower bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return domain value lower bound, i.e. {@code P(X \u003c \u0027lower bound\u0027) \u003c p}.\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 19)",
        "(line 159,col 9)-(line 163,col 9)",
        "(line 165,col 9)-(line 165,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 176,
      "end_line": 187,
      "comment": "\n     * Access the domain value upper bound, based on \u003ccode\u003ep\u003c/code\u003e, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return domain value lower bound, i.e. {@code P(X \u003c \u0027upper bound\u0027) \u003e p}.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 19)",
        "(line 180,col 9)-(line 184,col 9)",
        "(line 186,col 9)-(line 186,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.getInitialDomain(double)",
      "begin_line": 197,
      "end_line": 210,
      "comment": "\n     * Access the initial domain value, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the initial domain value.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 19)",
        "(line 201,col 9)-(line 207,col 9)",
        "(line 209,col 9)-(line 209,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 219,
      "end_line": 222,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.getSupportLowerBound()",
      "begin_line": 232,
      "end_line": 235,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always negative infinity no matter\n     * the parameters.\n     *\n     * @return lower bound of the support (always Double.NEGATIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.getSupportUpperBound()",
      "begin_line": 245,
      "end_line": 248,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity no matter\n     * the parameters.\n     *\n     * @return upper bound of the support (always Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.calculateNumericalMean()",
      "begin_line": 257,
      "end_line": 260,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The mean is always undefined no matter the parameters.\n     *\n     * @return mean (always Double.NaN)\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.calculateNumericalVariance()",
      "begin_line": 269,
      "end_line": 272,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The variance is always undefined no matter the parameters.\n     *\n     * @return variance (always Double.NaN)\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.isSupportLowerBoundInclusive()",
      "begin_line": 277,
      "end_line": 280,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistributionImpl.isSupportUpperBoundInclusive()",
      "begin_line": 285,
      "end_line": 288,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 21)"
      ]
    }
  ]
}