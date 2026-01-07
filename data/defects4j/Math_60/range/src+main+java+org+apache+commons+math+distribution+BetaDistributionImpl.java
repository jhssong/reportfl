{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/distribution/BetaDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BetaDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractContinuousDistribution",
        "org.apache.commons.math.distribution.BetaDistribution"
      ],
      "begin_line": 38,
      "end_line": 187,
      "comment": "\n * Implements the Beta distribution.\n * \u003cp\u003e\n * References:\n * \u003cul\u003e\n * \u003cli\u003e\u003ca href\u003d\"http://en.wikipedia.org/wiki/Beta_distribution\"\u003e\n * Beta distribution\u003c/a\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Default inverse cumulative probability accuracy.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "alpha"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " First shape parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "beta"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Second shape parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "z"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Normalizing factor used in density computations.\n     * updated whenever alpha or beta are changed.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.BetaDistributionImpl(double, double, double)",
      "begin_line": 68,
      "end_line": 73,
      "comment": "\n     * Build a new instance.\n     *\n     * @param alpha First shape parameter (must be positive).\n     * @param beta Second shape parameter (must be positive).\n     * @param inverseCumAccuracy Maximum absolute error in inverse\n     * cumulative probability estimates (defaults to\n     * {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 27)",
        "(line 70,col 9)-(line 70,col 25)",
        "(line 71,col 9)-(line 71,col 23)",
        "(line 72,col 9)-(line 72,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.BetaDistributionImpl(double, double)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Build a new instance.\n     *\n     * @param alpha First shape parameter (must be positive).\n     * @param beta Second shape parameter (must be positive).\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.getAlpha()",
      "begin_line": 86,
      "end_line": 88,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.getBeta()",
      "begin_line": 91,
      "end_line": 93,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.recomputeZ()",
      "begin_line": 98,
      "end_line": 102,
      "comment": "\n     * Recompute the normalization factor.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 101,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.density(double)",
      "begin_line": 107,
      "end_line": 127,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 21)",
        "(line 110,col 9)-(line 126,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 130,
      "end_line": 139,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 132,col 9)-(line 138,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.getInitialDomain(double)",
      "begin_line": 142,
      "end_line": 145,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 148,
      "end_line": 151,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 154,
      "end_line": 157,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.cumulativeProbability(double)",
      "begin_line": 160,
      "end_line": 168,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 161,col 9)-(line 167,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.cumulativeProbability(double, double)",
      "begin_line": 171,
      "end_line": 174,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 183,
      "end_line": 186,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 38)"
      ]
    }
  ]
}