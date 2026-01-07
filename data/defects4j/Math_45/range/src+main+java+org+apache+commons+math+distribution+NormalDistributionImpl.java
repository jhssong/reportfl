{
  "filepath": "/tmp/Math-45b/src/main/java/org/apache/commons/math/distribution/NormalDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NormalDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractContinuousDistribution",
        "org.apache.commons.math.distribution.NormalDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 34,
      "end_line": 325,
      "comment": "\n * Default implementation of\n * {@link org.apache.commons.math.distribution.NormalDistribution}.\n *\n * @version $Id$\n "
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
        "SQRT2PI"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " \u0026radic;(2 \u0026pi;) "
    },
    {
      "type": "field",
      "varNames": [
        "SQRT2"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " \u0026radic;(2) "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Mean of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "standardDeviation"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Standard deviation of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.NormalDistributionImpl(double, double)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Create a normal distribution using the given mean and standard deviation.\n     *\n     * @param mean Mean for this distribution.\n     * @param sd Standard deviation for this distribution.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.NormalDistributionImpl(double, double, double)",
      "begin_line": 74,
      "end_line": 82,
      "comment": "\n     * Create a normal distribution using the given mean, standard deviation and\n     * inverse cumulative distribution accuracy.\n     *\n     * @param mean Mean for this distribution.\n     * @param sd Standard deviation for this distribution.\n     * @param inverseCumAccuracy Inverse cumulative probability accuracy.\n     * @throws NotStrictlyPositiveException if {@code sd \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 77,col 9)",
        "(line 79,col 9)-(line 79,col 25)",
        "(line 80,col 9)-(line 80,col 31)",
        "(line 81,col 9)-(line 81,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.NormalDistributionImpl()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Create a normal distribution with mean equal to zero and standard\n     * deviation equal to one.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getMean()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getStandardDeviation()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.density(double)",
      "begin_line": 109,
      "end_line": 114,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 35)",
        "(line 112,col 9)-(line 112,col 49)",
        "(line 113,col 9)-(line 113,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.cumulativeProbability(double)",
      "begin_line": 124,
      "end_line": 130,
      "comment": "\n     * For this distribution, {@code X}, this method returns {@code P(X \u003c x)}.\n     * If {@code x}is more than 40 standard deviations from the mean, 0 or 1 is returned,\n     * as in these cases the actual value is within {@code Double.MIN_VALUE} of 0 or 1.\n     *\n     * @param x Value at which the CDF is evaluated.\n     * @return CDF evaluated at {@code x}.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 36)",
        "(line 126,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.cumulativeProbability(double, double)",
      "begin_line": 135,
      "end_line": 145,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 55)",
        "(line 142,col 9)-(line 142,col 46)",
        "(line 143,col 9)-(line 143,col 46)",
        "(line 144,col 9)-(line 144,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 154,
      "end_line": 157,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 170,
      "end_line": 180,
      "comment": "\n     * For this distribution, X, this method returns the critical point\n     * {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     * It will return {@code Double.NEGATIVE_INFINITY} when p \u003d 0 and\n     * {@code Double.POSITIVE_INFINITY} for p \u003d 1.\n     *\n     * @param p Desired probability.\n     * @return {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     * @throws org.apache.commons.math.exception.OutOfRangeException if\n     * {@code p} is not a valid probability.\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.sample()",
      "begin_line": 188,
      "end_line": 191,
      "comment": "\n     * Generate a random value sampled from this distribution.\n     *\n     * @return a random value.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 201,
      "end_line": 212,
      "comment": "\n     * Access the domain value lower bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value lower bound, i.e. {@code P(X \u003c \u0027lower bound\u0027) \u003c p}.\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 19)",
        "(line 205,col 9)-(line 209,col 9)",
        "(line 211,col 9)-(line 211,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 222,
      "end_line": 233,
      "comment": "\n     * Access the domain value upper bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value upper bound, i.e. {@code P(X \u003c \u0027upper bound\u0027) \u003e p}.\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 19)",
        "(line 226,col 9)-(line 230,col 9)",
        "(line 232,col 9)-(line 232,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getInitialDomain(double)",
      "begin_line": 243,
      "end_line": 256,
      "comment": "\n     * Access the initial domain value, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the initial domain value.\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 19)",
        "(line 247,col 9)-(line 253,col 9)",
        "(line 255,col 9)-(line 255,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getSupportLowerBound()",
      "begin_line": 266,
      "end_line": 269,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always negative infinity\n     * no matter the parameters.\n     *\n     * @return lower bound of the support (always Double.NEGATIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getSupportUpperBound()",
      "begin_line": 279,
      "end_line": 282,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the parameters.\n     *\n     * @return upper bound of the support (always Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.calculateNumericalMean()",
      "begin_line": 291,
      "end_line": 294,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For mean parameter \u003ccode\u003emu\u003c/code\u003e, the mean is \u003ccode\u003emu\u003c/code\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.calculateNumericalVariance()",
      "begin_line": 304,
      "end_line": 308,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For standard deviation parameter \u003ccode\u003es\u003c/code\u003e,\n     * the variance is \u003ccode\u003es^2\u003c/code\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 48)",
        "(line 307,col 9)-(line 307,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.isSupportLowerBoundInclusive()",
      "begin_line": 313,
      "end_line": 316,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.isSupportUpperBoundInclusive()",
      "begin_line": 321,
      "end_line": 324,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 21)"
      ]
    }
  ]
}