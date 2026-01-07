{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/NormalDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NormalDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 36,
      "end_line": 270,
      "comment": "\n * Implementation of the normal (gaussian) distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Normal_distribution\"\u003eNormal distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/NormalDistribution.html\"\u003eNormal distribution (MathWorld)\u003c/a\u003e\n * @version $Id$\n "
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
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.NormalDistribution()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Create a normal distribution with mean equal to zero and standard\n     * deviation equal to one.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.NormalDistribution(double, double)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * Create a normal distribution using the given mean and standard deviation.\n     *\n     * @param mean Mean for this distribution.\n     * @param sd Standard deviation for this distribution.\n     * @throws NotStrictlyPositiveException if {@code sd \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.NormalDistribution(double, double, double)",
      "begin_line": 85,
      "end_line": 88,
      "comment": "\n     * Create a normal distribution using the given mean, standard deviation and\n     * inverse cumulative distribution accuracy.\n     *\n     * @param mean Mean for this distribution.\n     * @param sd Standard deviation for this distribution.\n     * @param inverseCumAccuracy Inverse cumulative probability accuracy.\n     * @throws NotStrictlyPositiveException if {@code sd \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.NormalDistribution(org.apache.commons.math3.random.RandomGenerator, double, double, double)",
      "begin_line": 100,
      "end_line": 114,
      "comment": "\n     * Creates a normal distribution.\n     *\n     * @param rng Random number generator.\n     * @param mean Mean for this distribution.\n     * @param sd Standard deviation for this distribution.\n     * @param inverseCumAccuracy Inverse cumulative probability accuracy.\n     * @throws NotStrictlyPositiveException if {@code sd \u003c\u003d 0}.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 19)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 111,col 9)-(line 111,col 25)",
        "(line 112,col 9)-(line 112,col 31)",
        "(line 113,col 9)-(line 113,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.getMean()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Access the mean.\n     *\n     * @return the mean for this distribution.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.getStandardDeviation()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n     * Access the standard deviation.\n     *\n     * @return the standard deviation for this distribution.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.density(double)",
      "begin_line": 135,
      "end_line": 139,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 35)",
        "(line 137,col 9)-(line 137,col 49)",
        "(line 138,col 9)-(line 138,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.cumulativeProbability(double)",
      "begin_line": 148,
      "end_line": 154,
      "comment": "\n     * {@inheritDoc}\n     *\n     * If {@code x} is more than 40 standard deviations from the mean, 0 or 1\n     * is returned, as in these cases the actual value is within\n     * {@code Double.MIN_VALUE} of 0 or 1.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 36)",
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.inverseCumulativeProbability(double)",
      "begin_line": 159,
      "end_line": 165,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.cumulativeProbability(double, double)",
      "begin_line": 172,
      "end_line": 176,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @deprecated See {@link RealDistribution#cumulativeProbability(double,double)}\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.probability(double, double)",
      "begin_line": 179,
      "end_line": 191,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 183,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 55)",
        "(line 188,col 9)-(line 188,col 46)",
        "(line 189,col 9)-(line 189,col 46)",
        "(line 190,col 9)-(line 190,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 194,
      "end_line": 197,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.getNumericalMean()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For mean parameter {@code mu}, the mean is {@code mu}.\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.getNumericalVariance()",
      "begin_line": 213,
      "end_line": 216,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For standard deviation parameter {@code s}, the variance is {@code s^2}.\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 48)",
        "(line 215,col 9)-(line 215,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.getSupportLowerBound()",
      "begin_line": 227,
      "end_line": 229,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always negative infinity\n     * no matter the parameters.\n     *\n     * @return lower bound of the support (always\n     * {@code Double.NEGATIVE_INFINITY})\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.getSupportUpperBound()",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the parameters.\n     *\n     * @return upper bound of the support (always\n     * {@code Double.POSITIVE_INFINITY})\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 245,
      "end_line": 247,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 250,
      "end_line": 252,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.isSupportConnected()",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.sample()",
      "begin_line": 266,
      "end_line": 269,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 64)"
      ]
    }
  ]
}