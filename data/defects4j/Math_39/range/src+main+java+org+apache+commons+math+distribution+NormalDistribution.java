{
  "filepath": "/tmp/Math-39b/src/main/java/org/apache/commons/math/distribution/NormalDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NormalDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractRealDistribution"
      ],
      "begin_line": 33,
      "end_line": 235,
      "comment": "\n * Implementation of the normal (gaussian) distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Normal_distribution\"\u003eNormal distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/NormalDistribution.html\"\u003eNormal distribution (MathWorld)\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Default inverse cumulative probability accuracy.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "SQRT2PI"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " \u0026radic;(2 \u0026pi;) "
    },
    {
      "type": "field",
      "varNames": [
        "SQRT2"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " \u0026radic;(2) "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Mean of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "standardDeviation"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Standard deviation of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.NormalDistribution(double, double)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Create a normal distribution using the given mean and standard deviation.\n     *\n     * @param mean Mean for this distribution.\n     * @param sd Standard deviation for this distribution.\n     * @throws NotStrictlyPositiveException if {@code sd \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.NormalDistribution(double, double, double)",
      "begin_line": 74,
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
      "signature": "org.apache.commons.math.distribution.NormalDistribution.NormalDistribution()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Create a normal distribution with mean equal to zero and standard\n     * deviation equal to one.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.getMean()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Access the mean.\n     *\n     * @return the mean for this distribution.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.getStandardDeviation()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Access the standard deviation.\n     *\n     * @return the standard deviation for this distribution.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.probability(double)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For this distribution {@code P(X \u003d x)} always evaluates to 0.\n     *\n     * @return 0\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.density(double)",
      "begin_line": 123,
      "end_line": 127,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 35)",
        "(line 125,col 9)-(line 125,col 49)",
        "(line 126,col 9)-(line 126,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.cumulativeProbability(double)",
      "begin_line": 136,
      "end_line": 142,
      "comment": "\n     * {@inheritDoc}\n     *\n     * If {@code x} is more than 40 standard deviations from the mean, 0 or 1\n     * is returned, as in these cases the actual value is within\n     * {@code Double.MIN_VALUE} of 0 or 1.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 36)",
        "(line 138,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.cumulativeProbability(double, double)",
      "begin_line": 145,
      "end_line": 156,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 148,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 55)",
        "(line 153,col 9)-(line 153,col 46)",
        "(line 154,col 9)-(line 154,col 46)",
        "(line 155,col 9)-(line 155,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 159,
      "end_line": 162,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.getNumericalMean()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For mean parameter {@code mu}, the mean is {@code mu}.\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.getNumericalVariance()",
      "begin_line": 178,
      "end_line": 181,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For standard deviation parameter {@code s}, the variance is {@code s^2}.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 48)",
        "(line 180,col 9)-(line 180,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.getSupportLowerBound()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always negative infinity\n     * no matter the parameters.\n     *\n     * @return lower bound of the support (always\n     * {@code Double.NEGATIVE_INFINITY})\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.getSupportUpperBound()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the parameters.\n     *\n     * @return upper bound of the support (always\n     * {@code Double.POSITIVE_INFINITY})\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 210,
      "end_line": 212,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 215,
      "end_line": 217,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.isSupportConnected()",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.sample()",
      "begin_line": 231,
      "end_line": 234,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 64)"
      ]
    }
  ]
}