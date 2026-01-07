{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/CauchyDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CauchyDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 34,
      "end_line": 230,
      "comment": "\n * Implementation of the Cauchy distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Cauchy_distribution\"\u003eCauchy distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/CauchyDistribution.html\"\u003eCauchy Distribution (MathWorld)\u003c/a\u003e\n * @since 1.1 (changed to concrete class in 3.0)\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Default inverse cumulative probability accuracy.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "median"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The median of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The scale of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Inverse cumulative probability accuracy "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.CauchyDistribution()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Creates a Cauchy distribution with the median equal to zero and scale\n     * equal to one.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.CauchyDistribution(double, double)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Creates a Cauchy distribution using the given median and scale.\n     *\n     * @param median Median for this distribution.\n     * @param scale Scale parameter for this distribution.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.CauchyDistribution(double, double, double)",
      "begin_line": 78,
      "end_line": 81,
      "comment": "\n     * Creates a Cauchy distribution using the given median and scale.\n     *\n     * @param median Median for this distribution.\n     * @param scale Scale parameter for this distribution.\n     * @param inverseCumAccuracy Maximum absolute error in inverse\n     * cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @throws NotStrictlyPositiveException if {@code scale \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.CauchyDistribution(org.apache.commons.math3.random.RandomGenerator, double, double, double)",
      "begin_line": 95,
      "end_line": 106,
      "comment": "\n     * Creates a Cauchy distribution.\n     *\n     * @param rng Random number generator.\n     * @param median Median for this distribution.\n     * @param scale Scale parameter for this distribution.\n     * @param inverseCumAccuracy Maximum absolute error in inverse\n     * cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @throws NotStrictlyPositiveException if {@code scale \u003c\u003d 0}.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 19)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 27)",
        "(line 104,col 9)-(line 104,col 29)",
        "(line 105,col 9)-(line 105,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.cumulativeProbability(double)",
      "begin_line": 109,
      "end_line": 111,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.getMedian()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Access the median.\n     *\n     * @return the median for this distribution.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.getScale()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * Access the scale parameter.\n     *\n     * @return the scale parameter for this distribution.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.density(double)",
      "begin_line": 132,
      "end_line": 135,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 38)",
        "(line 134,col 9)-(line 134,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.inverseCumulativeProbability(double)",
      "begin_line": 143,
      "end_line": 156,
      "comment": "\n     * {@inheritDoc}\n     *\n     * Returns {@code Double.NEGATIVE_INFINITY} when {@code p \u003d\u003d 0}\n     * and {@code Double.POSITIVE_INFINITY} when {@code p \u003d\u003d 1}.\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 19)",
        "(line 146,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 159,
      "end_line": 162,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.getNumericalMean()",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The mean is always undefined no matter the parameters.\n     *\n     * @return mean (always Double.NaN)\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.getNumericalVariance()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The variance is always undefined no matter the parameters.\n     *\n     * @return variance (always Double.NaN)\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.getSupportLowerBound()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always negative infinity no matter\n     * the parameters.\n     *\n     * @return lower bound of the support (always Double.NEGATIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.getSupportUpperBound()",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity no matter\n     * the parameters.\n     *\n     * @return upper bound of the support (always Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 211,
      "end_line": 213,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 216,
      "end_line": 218,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.isSupportConnected()",
      "begin_line": 227,
      "end_line": 229,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 20)"
      ]
    }
  ]
}