{
  "filepath": "/tmp/Math-43b/src/main/java/org/apache/commons/math/distribution/CauchyDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CauchyDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractContinuousDistribution",
        "java.io.Serializable"
      ],
      "begin_line": 35,
      "end_line": 251,
      "comment": "\n * Implementation of the Cauchy distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Cauchy_distribution\"\u003eCauchy distribution (Wikipedia)\u003c/a\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/CauchyDistribution.html\"\u003eCauchy Distribution (MathWorld)\u003c/a\u003e\n * @since 1.1 (changed to concrete class in 3.0)\n * @version $Id$\n "
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
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "median"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The median of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " The scale of this distribution. "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Inverse cumulative probability accuracy "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.CauchyDistribution.CauchyDistribution()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Creates a Cauchy distribution with the median equal to zero and scale\n     * equal to one.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.CauchyDistribution.CauchyDistribution(double, double)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Creates a Cauchy distribution using the given median and scale.\n     *\n     * @param median Median for this distribution.\n     * @param scale Scale parameter for this distribution.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.CauchyDistribution.CauchyDistribution(double, double, double)",
      "begin_line": 80,
      "end_line": 88,
      "comment": "\n     * Creates a Cauchy distribution using the given median and scale.\n     *\n     * @param median Median for this distribution.\n     * @param scale Scale parameter for this distribution.\n     * @param inverseCumAccuracy Maximum absolute error in inverse\n     * cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @throws NotStrictlyPositiveException if {@code scale \u003c\u003d 0}.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 85,col 27)",
        "(line 86,col 9)-(line 86,col 29)",
        "(line 87,col 9)-(line 87,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistribution.cumulativeProbability(double)",
      "begin_line": 91,
      "end_line": 93,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistribution.getMedian()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Access the median.\n     *\n     * @return the median for this distribution.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistribution.getScale()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Access the scale parameter.\n     *\n     * @return the scale parameter for this distribution.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistribution.density(double)",
      "begin_line": 114,
      "end_line": 117,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 38)",
        "(line 116,col 9)-(line 116,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistribution.inverseCumulativeProbability(double)",
      "begin_line": 125,
      "end_line": 138,
      "comment": "\n     * {@inheritDoc}\n     *\n     * Returns {@code Double.NEGATIVE_INFINITY} when {@code p \u003d\u003d 0}\n     * and {@code Double.POSITIVE_INFINITY} when {@code p \u003d\u003d 1}.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 19)",
        "(line 128,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistribution.getDomainLowerBound(double)",
      "begin_line": 141,
      "end_line": 152,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 19)",
        "(line 145,col 9)-(line 149,col 9)",
        "(line 151,col 9)-(line 151,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistribution.getDomainUpperBound(double)",
      "begin_line": 155,
      "end_line": 166,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 19)",
        "(line 159,col 9)-(line 163,col 9)",
        "(line 165,col 9)-(line 165,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistribution.getInitialDomain(double)",
      "begin_line": 169,
      "end_line": 182,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 19)",
        "(line 173,col 9)-(line 179,col 9)",
        "(line 181,col 9)-(line 181,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 185,
      "end_line": 188,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistribution.getSupportLowerBound()",
      "begin_line": 198,
      "end_line": 201,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always negative infinity no matter\n     * the parameters.\n     *\n     * @return lower bound of the support (always Double.NEGATIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistribution.getSupportUpperBound()",
      "begin_line": 211,
      "end_line": 214,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always positive infinity no matter\n     * the parameters.\n     *\n     * @return upper bound of the support (always Double.POSITIVE_INFINITY)\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistribution.calculateNumericalMean()",
      "begin_line": 223,
      "end_line": 226,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The mean is always undefined no matter the parameters.\n     *\n     * @return mean (always Double.NaN)\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistribution.calculateNumericalVariance()",
      "begin_line": 235,
      "end_line": 238,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The variance is always undefined no matter the parameters.\n     *\n     * @return variance (always Double.NaN)\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 241,
      "end_line": 244,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.CauchyDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 247,
      "end_line": 250,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 21)"
      ]
    }
  ]
}