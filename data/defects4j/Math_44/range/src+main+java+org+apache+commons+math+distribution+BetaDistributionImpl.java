{
  "filepath": "/tmp/Math-44b/src/main/java/org/apache/commons/math/distribution/BetaDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BetaDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractContinuousDistribution",
        "org.apache.commons.math.distribution.BetaDistribution"
      ],
      "begin_line": 37,
      "end_line": 259,
      "comment": "\n * Implements the Beta distribution.\n * \u003cp\u003e\n * References:\n * \u003cul\u003e\n * \u003cli\u003e\u003ca href\u003d\"http://en.wikipedia.org/wiki/Beta_distribution\"\u003e\n * Beta distribution\u003c/a\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Default inverse cumulative probability accuracy.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "alpha"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " First shape parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "beta"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Second shape parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "z"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Normalizing factor used in density computations.\n     * updated whenever alpha or beta are changed.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.BetaDistributionImpl(double, double, double)",
      "begin_line": 67,
      "end_line": 72,
      "comment": "\n     * Build a new instance.\n     *\n     * @param alpha First shape parameter (must be positive).\n     * @param beta Second shape parameter (must be positive).\n     * @param inverseCumAccuracy Maximum absolute error in inverse\n     * cumulative probability estimates (defaults to\n     * {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 27)",
        "(line 69,col 9)-(line 69,col 25)",
        "(line 70,col 9)-(line 70,col 23)",
        "(line 71,col 9)-(line 71,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.BetaDistributionImpl(double, double)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Build a new instance.\n     *\n     * @param alpha First shape parameter (must be positive).\n     * @param beta Second shape parameter (must be positive).\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.getAlpha()",
      "begin_line": 85,
      "end_line": 87,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.getBeta()",
      "begin_line": 90,
      "end_line": 92,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.recomputeZ()",
      "begin_line": 97,
      "end_line": 101,
      "comment": "\n     * Recompute the normalization factor.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 100,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.density(double)",
      "begin_line": 106,
      "end_line": 126,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 21)",
        "(line 109,col 9)-(line 125,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 129,
      "end_line": 138,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 131,col 9)-(line 137,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.getInitialDomain(double)",
      "begin_line": 141,
      "end_line": 144,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 147,
      "end_line": 150,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 153,
      "end_line": 156,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.cumulativeProbability(double)",
      "begin_line": 159,
      "end_line": 167,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 160,col 9)-(line 166,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.cumulativeProbability(double, double)",
      "begin_line": 170,
      "end_line": 173,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 182,
      "end_line": 185,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.getSupportLowerBound()",
      "begin_line": 194,
      "end_line": 197,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the parameters.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.getSupportUpperBound()",
      "begin_line": 206,
      "end_line": 209,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always 1 no matter the parameters.\n     *\n     * @return upper bound of the support (always 1)\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.calculateNumericalMean()",
      "begin_line": 220,
      "end_line": 224,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For first shape parameter \u003ccode\u003es1\u003c/code\u003e and\n     * second shape parameter \u003ccode\u003es2\u003c/code\u003e, the mean is\n     * \u003ccode\u003es1 / (s1 + s2)\u003c/code\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 36)",
        "(line 223,col 9)-(line 223,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.calculateNumericalVariance()",
      "begin_line": 236,
      "end_line": 242,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For first shape parameter \u003ccode\u003es1\u003c/code\u003e and\n     * second shape parameter \u003ccode\u003es2\u003c/code\u003e,\n     * the variance is\n     * \u003ccode\u003e[ s1 * s2 ] / [ (s1 + s2)^2 * (s1 + s2 + 1) ]\u003c/code\u003e\n     *\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 36)",
        "(line 239,col 9)-(line 239,col 35)",
        "(line 240,col 9)-(line 240,col 42)",
        "(line 241,col 9)-(line 241,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.isSupportLowerBoundInclusive()",
      "begin_line": 247,
      "end_line": 250,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.isSupportUpperBoundInclusive()",
      "begin_line": 255,
      "end_line": 258,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 21)"
      ]
    }
  ]
}