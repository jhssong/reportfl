{
  "filepath": "/tmp/Math-40b/src/main/java/org/apache/commons/math/distribution/NormalDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NormalDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractContinuousDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 35,
      "end_line": 282,
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
      "signature": "org.apache.commons.math.distribution.NormalDistribution.NormalDistribution(double, double)",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     * Create a normal distribution using the given mean and standard deviation.\n     *\n     * @param mean Mean for this distribution.\n     * @param sd Standard deviation for this distribution.\n     * @throws NotStrictlyPositiveException if {@code sd \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.NormalDistribution(double, double, double)",
      "begin_line": 77,
      "end_line": 85,
      "comment": "\n     * Create a normal distribution using the given mean, standard deviation and\n     * inverse cumulative distribution accuracy.\n     *\n     * @param mean Mean for this distribution.\n     * @param sd Standard deviation for this distribution.\n     * @param inverseCumAccuracy Inverse cumulative probability accuracy.\n     * @throws NotStrictlyPositiveException if {@code sd \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 80,col 9)",
        "(line 82,col 9)-(line 82,col 25)",
        "(line 83,col 9)-(line 83,col 31)",
        "(line 84,col 9)-(line 84,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.NormalDistribution()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Create a normal distribution with mean equal to zero and standard\n     * deviation equal to one.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.getMean()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Access the mean.\n     *\n     * @return the mean for this distribution.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.getStandardDeviation()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Access the standard deviation.\n     *\n     * @return the standard deviation for this distribution.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.density(double)",
      "begin_line": 114,
      "end_line": 118,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 35)",
        "(line 116,col 9)-(line 116,col 49)",
        "(line 117,col 9)-(line 117,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.cumulativeProbability(double)",
      "begin_line": 127,
      "end_line": 133,
      "comment": "\n     * {@inheritDoc}\n     *\n     * If {@code x} is more than 40 standard deviations from the mean, 0 or 1\n     * is returned, as in these cases the actual value is within\n     * {@code Double.MIN_VALUE} of 0 or 1.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 36)",
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.cumulativeProbability(double, double)",
      "begin_line": 136,
      "end_line": 147,
      "comment": " {@inheritDoc} ",
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
      "signature": "org.apache.commons.math.distribution.NormalDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 150,
      "end_line": 153,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.inverseCumulativeProbability(double)",
      "begin_line": 161,
      "end_line": 170,
      "comment": "\n     * {@inheritDoc}\n     *\n     * Returns {@code Double.NEGATIVE_INFINITY} when {@code p \u003d\u003d 0}\n     * and {@code Double.POSITIVE_INFINITY} for {@code p \u003d\u003d 1}.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.sample()",
      "begin_line": 173,
      "end_line": 176,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.getDomainLowerBound(double)",
      "begin_line": 179,
      "end_line": 190,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 19)",
        "(line 183,col 9)-(line 187,col 9)",
        "(line 189,col 9)-(line 189,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.getDomainUpperBound(double)",
      "begin_line": 193,
      "end_line": 204,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 19)",
        "(line 197,col 9)-(line 201,col 9)",
        "(line 203,col 9)-(line 203,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.getInitialDomain(double)",
      "begin_line": 207,
      "end_line": 220,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 19)",
        "(line 211,col 9)-(line 217,col 9)",
        "(line 219,col 9)-(line 219,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.getSupportLowerBound()",
      "begin_line": 231,
      "end_line": 234,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always negative infinity\n     * no matter the parameters.\n     *\n     * @return lower bound of the support (always\n     * {@code Double.NEGATIVE_INFINITY})\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.getSupportUpperBound()",
      "begin_line": 245,
      "end_line": 248,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity\n     * no matter the parameters.\n     *\n     * @return upper bound of the support (always\n     * {@code Double.POSITIVE_INFINITY})\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.calculateNumericalMean()",
      "begin_line": 255,
      "end_line": 258,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For mean parameter {@code mu}, the mean is {@code mu}.\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.calculateNumericalVariance()",
      "begin_line": 265,
      "end_line": 269,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For standard deviation parameter {@code s}, the variance is {@code s^2}.\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 48)",
        "(line 268,col 9)-(line 268,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 272,
      "end_line": 275,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 278,
      "end_line": 281,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 21)"
      ]
    }
  ]
}