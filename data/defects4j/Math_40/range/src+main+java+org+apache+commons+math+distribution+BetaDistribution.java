{
  "filepath": "/tmp/Math-40b/src/main/java/org/apache/commons/math/distribution/BetaDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BetaDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractContinuousDistribution"
      ],
      "begin_line": 32,
      "end_line": 240,
      "comment": "\n * Implements the Beta distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Beta_distribution\"\u003eBeta distribution\u003c/a\u003e\n * @version $Id$\n * @since 2.0 (changed to concrete class in 3.0)\n "
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
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "alpha"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " First shape parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "beta"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Second shape parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "z"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Normalizing factor used in density computations.\n     * updated whenever alpha or beta are changed.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.BetaDistribution.BetaDistribution(double, double, double)",
      "begin_line": 61,
      "end_line": 66,
      "comment": "\n     * Build a new instance.\n     *\n     * @param alpha First shape parameter (must be positive).\n     * @param beta Second shape parameter (must be positive).\n     * @param inverseCumAccuracy Maximum absolute error in inverse\n     * cumulative probability estimates (defaults to\n     * {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 27)",
        "(line 63,col 9)-(line 63,col 25)",
        "(line 64,col 9)-(line 64,col 23)",
        "(line 65,col 9)-(line 65,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.BetaDistribution.BetaDistribution(double, double)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Build a new instance.\n     *\n     * @param alpha First shape parameter (must be positive).\n     * @param beta Second shape parameter (must be positive).\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistribution.getAlpha()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Access the first shape parameter, {@code alpha}.\n     *\n     * @return the first shape parameter.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistribution.getBeta()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Access the second shape parameter, {@code beta}.\n     *\n     * @return the second shape parameter.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistribution.recomputeZ()",
      "begin_line": 97,
      "end_line": 101,
      "comment": " Recompute the normalization factor. ",
      "child_ranges": [
        "(line 98,col 9)-(line 100,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistribution.density(double)",
      "begin_line": 104,
      "end_line": 123,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 21)",
        "(line 106,col 9)-(line 122,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistribution.inverseCumulativeProbability(double)",
      "begin_line": 126,
      "end_line": 135,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 128,col 9)-(line 134,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistribution.getInitialDomain(double)",
      "begin_line": 138,
      "end_line": 141,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistribution.getDomainLowerBound(double)",
      "begin_line": 144,
      "end_line": 147,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistribution.getDomainUpperBound(double)",
      "begin_line": 150,
      "end_line": 153,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistribution.cumulativeProbability(double)",
      "begin_line": 156,
      "end_line": 164,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 157,col 9)-(line 163,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 173,
      "end_line": 176,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistribution.getSupportLowerBound()",
      "begin_line": 185,
      "end_line": 188,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the parameters.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistribution.getSupportUpperBound()",
      "begin_line": 197,
      "end_line": 200,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always 1 no matter the parameters.\n     *\n     * @return upper bound of the support (always 1)\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistribution.calculateNumericalMean()",
      "begin_line": 208,
      "end_line": 212,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For first shape parameter {@code alpha} and second shape parameter {@code beta}, the\n     * mean is {@code alpha / (alpha + beta)}.\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 36)",
        "(line 211,col 9)-(line 211,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistribution.calculateNumericalVariance()",
      "begin_line": 221,
      "end_line": 227,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For first shape parameter {@code alpha} and second shape parameter\n     * {@code beta}, the variance is\n     * {@code (alpha * beta) / [(alpha + beta)^2 * (alpha + beta + 1)]}.\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 36)",
        "(line 224,col 9)-(line 224,col 35)",
        "(line 225,col 9)-(line 225,col 42)",
        "(line 226,col 9)-(line 226,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 230,
      "end_line": 233,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 236,
      "end_line": 239,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 21)"
      ]
    }
  ]
}