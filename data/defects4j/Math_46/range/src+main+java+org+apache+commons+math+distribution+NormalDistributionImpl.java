{
  "filepath": "/tmp/Math-46b/src/main/java/org/apache/commons/math/distribution/NormalDistributionImpl.java",
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
      "begin_line": 35,
      "end_line": 330,
      "comment": "\n * Default implementation of\n * {@link org.apache.commons.math.distribution.NormalDistribution}.\n *\n * @version $Id$\n "
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
        "SQRT2PI"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " \u0026radic;(2 \u0026pi;) "
    },
    {
      "type": "field",
      "varNames": [
        "SQRT2"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " \u0026radic;(2) "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Mean of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "standardDeviation"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Standard deviation of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.NormalDistributionImpl(double, double)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Create a normal distribution using the given mean and standard deviation.\n     *\n     * @param mean Mean for this distribution.\n     * @param sd Standard deviation for this distribution.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.NormalDistributionImpl(double, double, double)",
      "begin_line": 75,
      "end_line": 83,
      "comment": "\n     * Create a normal distribution using the given mean, standard deviation and\n     * inverse cumulative distribution accuracy.\n     *\n     * @param mean Mean for this distribution.\n     * @param sd Standard deviation for this distribution.\n     * @param inverseCumAccuracy Inverse cumulative probability accuracy.\n     * @throws NotStrictlyPositiveException if {@code sd \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 78,col 9)",
        "(line 80,col 9)-(line 80,col 25)",
        "(line 81,col 9)-(line 81,col 31)",
        "(line 82,col 9)-(line 82,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.NormalDistributionImpl()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Create a normal distribution with mean equal to zero and standard\n     * deviation equal to one.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getMean()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getStandardDeviation()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.density(double)",
      "begin_line": 110,
      "end_line": 115,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 35)",
        "(line 113,col 9)-(line 113,col 49)",
        "(line 114,col 9)-(line 114,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.cumulativeProbability(double)",
      "begin_line": 126,
      "end_line": 132,
      "comment": "\n     * For this distribution, {@code X}, this method returns {@code P(X \u003c x)}.\n     * If {@code x}is more than 40 standard deviations from the mean, 0 or 1 is returned,\n     * as in these cases the actual value is within {@code Double.MIN_VALUE} of 0 or 1.\n     *\n     * @param x Value at which the CDF is evaluated.\n     * @return CDF evaluated at {@code x}.\n     * @throws MathException if the algorithm fails to converge\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 36)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.cumulativeProbability(double, double)",
      "begin_line": 137,
      "end_line": 147,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 55)",
        "(line 144,col 9)-(line 144,col 46)",
        "(line 145,col 9)-(line 145,col 46)",
        "(line 146,col 9)-(line 146,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 156,
      "end_line": 159,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 174,
      "end_line": 184,
      "comment": "\n     * For this distribution, X, this method returns the critical point\n     * {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     * It will return {@code Double.NEGATIVE_INFINITY} when p \u003d 0 and\n     * {@code Double.POSITIVE_INFINITY} for p \u003d 1.\n     *\n     * @param p Desired probability.\n     * @return {@code x}, such that {@code P(X \u003c x) \u003d p}.\n     * @throws MathException if the inverse cumulative probability cannot be\n     * computed due to convergence or other numerical errors.\n     * @throws org.apache.commons.math.exception.OutOfRangeException if\n     * {@code p} is not a valid probability.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.sample()",
      "begin_line": 193,
      "end_line": 196,
      "comment": "\n     * Generate a random value sampled from this distribution.\n     *\n     * @return a random value.\n     * @since 2.2\n     * @throws MathException if an error occurs generating the random value.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 206,
      "end_line": 217,
      "comment": "\n     * Access the domain value lower bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value lower bound, i.e. {@code P(X \u003c \u0027lower bound\u0027) \u003c p}.\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 19)",
        "(line 210,col 9)-(line 214,col 9)",
        "(line 216,col 9)-(line 216,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 227,
      "end_line": 238,
      "comment": "\n     * Access the domain value upper bound, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the domain value upper bound, i.e. {@code P(X \u003c \u0027upper bound\u0027) \u003e p}.\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 19)",
        "(line 231,col 9)-(line 235,col 9)",
        "(line 237,col 9)-(line 237,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getInitialDomain(double)",
      "begin_line": 248,
      "end_line": 261,
      "comment": "\n     * Access the initial domain value, based on {@code p}, used to\n     * bracket a CDF root.  This method is used by\n     * {@link #inverseCumulativeProbability(double)} to find critical values.\n     *\n     * @param p Desired probability for the critical value.\n     * @return the initial domain value.\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 19)",
        "(line 252,col 9)-(line 258,col 9)",
        "(line 260,col 9)-(line 260,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getSupportLowerBound()",
      "begin_line": 271,
      "end_line": 274,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always negative infinity\n     * no matter the parameters.\n     *\n     * @return lower bound of the support (always Double.NEGATIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.getSupportUpperBound()",
      "begin_line": 284,
      "end_line": 287,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the parameters.\n     *\n     * @return upper bound of the support (always Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.calculateNumericalMean()",
      "begin_line": 296,
      "end_line": 299,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For mean parameter \u003ccode\u003emu\u003c/code\u003e, the mean is \u003ccode\u003emu\u003c/code\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.calculateNumericalVariance()",
      "begin_line": 309,
      "end_line": 313,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For standard deviation parameter \u003ccode\u003es\u003c/code\u003e,\n     * the variance is \u003ccode\u003es^2\u003c/code\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 48)",
        "(line 312,col 9)-(line 312,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.isSupportLowerBoundInclusive()",
      "begin_line": 318,
      "end_line": 321,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionImpl.isSupportUpperBoundInclusive()",
      "begin_line": 326,
      "end_line": 329,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 21)"
      ]
    }
  ]
}