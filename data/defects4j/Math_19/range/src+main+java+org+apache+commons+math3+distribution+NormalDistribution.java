{
  "filepath": "/tmp/Math-19b/src/main/java/org/apache/commons/math3/distribution/NormalDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NormalDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 35,
      "end_line": 258,
      "comment": "\n * Implementation of the normal (gaussian) distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Normal_distribution\"\u003eNormal distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/NormalDistribution.html\"\u003eNormal distribution (MathWorld)\u003c/a\u003e\n * @version $Id$\n "
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
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.NormalDistribution()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Create a normal distribution with mean equal to zero and standard\n     * deviation equal to one.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.NormalDistribution(double, double)",
      "begin_line": 69,
      "end_line": 72,
      "comment": "\n     * Create a normal distribution using the given mean and standard deviation.\n     *\n     * @param mean Mean for this distribution.\n     * @param sd Standard deviation for this distribution.\n     * @throws NotStrictlyPositiveException if {@code sd \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.NormalDistribution(double, double, double)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * Create a normal distribution using the given mean, standard deviation and\n     * inverse cumulative distribution accuracy.\n     *\n     * @param mean Mean for this distribution.\n     * @param sd Standard deviation for this distribution.\n     * @param inverseCumAccuracy Inverse cumulative probability accuracy.\n     * @throws NotStrictlyPositiveException if {@code sd \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.NormalDistribution(org.apache.commons.math3.random.RandomGenerator, double, double, double)",
      "begin_line": 99,
      "end_line": 113,
      "comment": "\n     * Creates a normal distribution.\n     *\n     * @param rng Random number generator.\n     * @param mean Mean for this distribution.\n     * @param sd Standard deviation for this distribution.\n     * @param inverseCumAccuracy Inverse cumulative probability accuracy.\n     * @throws NotStrictlyPositiveException if {@code sd \u003c\u003d 0}.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 19)",
        "(line 106,col 9)-(line 108,col 9)",
        "(line 110,col 9)-(line 110,col 25)",
        "(line 111,col 9)-(line 111,col 31)",
        "(line 112,col 9)-(line 112,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.getMean()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * Access the mean.\n     *\n     * @return the mean for this distribution.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.getStandardDeviation()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Access the standard deviation.\n     *\n     * @return the standard deviation for this distribution.\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.density(double)",
      "begin_line": 134,
      "end_line": 138,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 35)",
        "(line 136,col 9)-(line 136,col 49)",
        "(line 137,col 9)-(line 137,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.cumulativeProbability(double)",
      "begin_line": 147,
      "end_line": 153,
      "comment": "\n     * {@inheritDoc}\n     *\n     * If {@code x} is more than 40 standard deviations from the mean, 0 or 1\n     * is returned, as in these cases the actual value is within\n     * {@code Double.MIN_VALUE} of 0 or 1.\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 36)",
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.cumulativeProbability(double, double)",
      "begin_line": 160,
      "end_line": 164,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @deprecated See {@link RealDistribution#cumulativeProbability(double,double)}\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.probability(double, double)",
      "begin_line": 167,
      "end_line": 179,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 171,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 55)",
        "(line 176,col 9)-(line 176,col 46)",
        "(line 177,col 9)-(line 177,col 46)",
        "(line 178,col 9)-(line 178,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 182,
      "end_line": 185,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.getNumericalMean()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For mean parameter {@code mu}, the mean is {@code mu}.\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.getNumericalVariance()",
      "begin_line": 201,
      "end_line": 204,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For standard deviation parameter {@code s}, the variance is {@code s^2}.\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 48)",
        "(line 203,col 9)-(line 203,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.getSupportLowerBound()",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always negative infinity\n     * no matter the parameters.\n     *\n     * @return lower bound of the support (always\n     * {@code Double.NEGATIVE_INFINITY})\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.getSupportUpperBound()",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the parameters.\n     *\n     * @return upper bound of the support (always\n     * {@code Double.POSITIVE_INFINITY})\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 233,
      "end_line": 235,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 238,
      "end_line": 240,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.isSupportConnected()",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.sample()",
      "begin_line": 254,
      "end_line": 257,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 64)"
      ]
    }
  ]
}