{
  "filepath": "/tmp/Math-27b/src/main/java/org/apache/commons/math3/distribution/NormalDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NormalDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 35,
      "end_line": 257,
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
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.probability(double)",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For this distribution {@code P(X \u003d x)} always evaluates to 0.\n     *\n     * @return zero.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.density(double)",
      "begin_line": 145,
      "end_line": 149,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 35)",
        "(line 147,col 9)-(line 147,col 49)",
        "(line 148,col 9)-(line 148,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.cumulativeProbability(double)",
      "begin_line": 158,
      "end_line": 164,
      "comment": "\n     * {@inheritDoc}\n     *\n     * If {@code x} is more than 40 standard deviations from the mean, 0 or 1\n     * is returned, as in these cases the actual value is within\n     * {@code Double.MIN_VALUE} of 0 or 1.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 36)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.cumulativeProbability(double, double)",
      "begin_line": 167,
      "end_line": 178,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 170,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 55)",
        "(line 175,col 9)-(line 175,col 46)",
        "(line 176,col 9)-(line 176,col 46)",
        "(line 177,col 9)-(line 177,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 181,
      "end_line": 184,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.getNumericalMean()",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For mean parameter {@code mu}, the mean is {@code mu}.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.getNumericalVariance()",
      "begin_line": 200,
      "end_line": 203,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For standard deviation parameter {@code s}, the variance is {@code s^2}.\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 48)",
        "(line 202,col 9)-(line 202,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.getSupportLowerBound()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always negative infinity\n     * no matter the parameters.\n     *\n     * @return lower bound of the support (always\n     * {@code Double.NEGATIVE_INFINITY})\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.getSupportUpperBound()",
      "begin_line": 227,
      "end_line": 229,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the parameters.\n     *\n     * @return upper bound of the support (always\n     * {@code Double.POSITIVE_INFINITY})\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 232,
      "end_line": 234,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 237,
      "end_line": 239,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.isSupportConnected()",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.NormalDistribution.sample()",
      "begin_line": 253,
      "end_line": 256,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 64)"
      ]
    }
  ]
}