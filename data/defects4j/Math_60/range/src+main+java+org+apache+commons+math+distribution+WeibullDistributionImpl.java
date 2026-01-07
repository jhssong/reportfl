{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/distribution/WeibullDistributionImpl.java",
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
      "begin_line": 34,
      "end_line": 218,
      "comment": "\n * Default implementation of\n * {@link org.apache.commons.math.distribution.WeibullDistribution}.\n *\n * @since 1.1\n * @version $Revision$ $Date$\n "
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
        "shape"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The shape parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The scale parameter. "
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
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.WeibullDistributionImpl(double, double)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Create a Weibull distribution with the given shape and scale and a\n     * location equal to zero.\n     *\n     * @param alpha Shape parameter.\n     * @param beta Scale parameter.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.WeibullDistributionImpl(double, double, double)",
      "begin_line": 74,
      "end_line": 87,
      "comment": "\n     * Create a Weibull distribution with the given shape, scale and inverse\n     * cumulative probability accuracy and a location equal to zero.\n     *\n     * @param alpha Shape parameter.\n     * @param beta Scale parameter.\n     * @param inverseCumAccuracy Maximum absolute error in inverse\n     * cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @throws NotStrictlyPositiveException if {@code alpha \u003c\u003d 0} or\n     * {@code beta \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 21)",
        "(line 85,col 9)-(line 85,col 22)",
        "(line 86,col 9)-(line 86,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.cumulativeProbability(double)",
      "begin_line": 95,
      "end_line": 103,
      "comment": "\n     * For this distribution, {@code X}, this method returns {@code P(X \u003c x)}.\n     *\n     * @param x Value at which the CDF is evaluated.\n     * @return the CDF evaluted at {@code x}.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 19)",
        "(line 97,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getShape()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getScale()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.density(double)",
      "begin_line": 122,
      "end_line": 139,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 126,col 9)",
        "(line 128,col 9)-(line 128,col 40)",
        "(line 129,col 9)-(line 129,col 65)",
        "(line 136,col 9)-(line 136,col 57)",
        "(line 138,col 9)-(line 138,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 151,
      "end_line": 164,
      "comment": "\n     * For this distribution, {@code X}, this method returns the critical\n     * point {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     * It will return {@code Double.NEGATIVE_INFINITY} when p \u003d 0 and\n     * {@code Double.POSITIVE_INFINITY} when p \u003d 1.\n     *\n     * @param p Desired probability.\n     * @return {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     * @throws OutOfRangeException if {@code p} is not a valid probability.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 19)",
        "(line 154,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 175,
      "end_line": 178,
      "comment": "\n     * Access the domain value lower bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value lower bound, i.e. {@code P(X \u003c \u0027lower bound\u0027) \u003c p}.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 188,
      "end_line": 191,
      "comment": "\n     * Access the domain value upper bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value upper bound, i.e. {@code P(X \u003c \u0027upper bound\u0027) \u003e p}.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getInitialDomain(double)",
      "begin_line": 201,
      "end_line": 205,
      "comment": "\n     * Access the initial domain value, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the initial domain value.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.WeibullDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 214,
      "end_line": 217,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 38)"
      ]
    }
  ]
}