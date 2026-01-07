{
  "filepath": "/tmp/Math-33b/src/main/java/org/apache/commons/math3/distribution/CauchyDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CauchyDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 32,
      "end_line": 219,
      "comment": "\n * Implementation of the Cauchy distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Cauchy_distribution\"\u003eCauchy distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/CauchyDistribution.html\"\u003eCauchy Distribution (MathWorld)\u003c/a\u003e\n * @since 1.1 (changed to concrete class in 3.0)\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * Default inverse cumulative probability accuracy.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "median"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The median of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The scale of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Inverse cumulative probability accuracy "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.CauchyDistribution()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Creates a Cauchy distribution with the median equal to zero and scale\n     * equal to one.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.CauchyDistribution(double, double)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Creates a Cauchy distribution using the given median and scale.\n     *\n     * @param median Median for this distribution.\n     * @param scale Scale parameter for this distribution.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.CauchyDistribution(double, double, double)",
      "begin_line": 76,
      "end_line": 84,
      "comment": "\n     * Creates a Cauchy distribution using the given median and scale.\n     *\n     * @param median Median for this distribution.\n     * @param scale Scale parameter for this distribution.\n     * @param inverseCumAccuracy Maximum absolute error in inverse\n     * cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @throws NotStrictlyPositiveException if {@code scale \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 27)",
        "(line 82,col 9)-(line 82,col 29)",
        "(line 83,col 9)-(line 83,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.cumulativeProbability(double)",
      "begin_line": 87,
      "end_line": 89,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.getMedian()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Access the median.\n     *\n     * @return the median for this distribution.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.getScale()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Access the scale parameter.\n     *\n     * @return the scale parameter for this distribution.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.probability(double)",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For this distribution {@code P(X \u003d x)} always evaluates to 0.\n     *\n     * @return 0\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.density(double)",
      "begin_line": 121,
      "end_line": 124,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 38)",
        "(line 123,col 9)-(line 123,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.inverseCumulativeProbability(double)",
      "begin_line": 132,
      "end_line": 145,
      "comment": "\n     * {@inheritDoc}\n     *\n     * Returns {@code Double.NEGATIVE_INFINITY} when {@code p \u003d\u003d 0}\n     * and {@code Double.POSITIVE_INFINITY} when {@code p \u003d\u003d 1}.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 19)",
        "(line 135,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 148,
      "end_line": 151,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.getNumericalMean()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The mean is always undefined no matter the parameters.\n     *\n     * @return mean (always Double.NaN)\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.getNumericalVariance()",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The variance is always undefined no matter the parameters.\n     *\n     * @return variance (always Double.NaN)\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.getSupportLowerBound()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always negative infinity no matter\n     * the parameters.\n     *\n     * @return lower bound of the support (always Double.NEGATIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.getSupportUpperBound()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity no matter\n     * the parameters.\n     *\n     * @return upper bound of the support (always Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 200,
      "end_line": 202,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 205,
      "end_line": 207,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.CauchyDistribution.isSupportConnected()",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 20)"
      ]
    }
  ]
}