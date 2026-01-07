{
  "filepath": "/tmp/Math-29b/src/main/java/org/apache/commons/math3/distribution/BetaDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BetaDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 32,
      "end_line": 226,
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
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.BetaDistribution(double, double, double)",
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
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.BetaDistribution(double, double)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Build a new instance.\n     *\n     * @param alpha First shape parameter (must be positive).\n     * @param beta Second shape parameter (must be positive).\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.getAlpha()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Access the first shape parameter, {@code alpha}.\n     *\n     * @return the first shape parameter.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.getBeta()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Access the second shape parameter, {@code beta}.\n     *\n     * @return the second shape parameter.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.recomputeZ()",
      "begin_line": 97,
      "end_line": 101,
      "comment": " Recompute the normalization factor. ",
      "child_ranges": [
        "(line 98,col 9)-(line 100,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.probability(double)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For this distribution {@code P(X \u003d x)} always evaluates to 0.\n     *\n     * @return 0\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.density(double)",
      "begin_line": 115,
      "end_line": 134,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 21)",
        "(line 117,col 9)-(line 133,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.cumulativeProbability(double)",
      "begin_line": 137,
      "end_line": 145,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 138,col 9)-(line 144,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 154,
      "end_line": 157,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.getNumericalMean()",
      "begin_line": 165,
      "end_line": 168,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For first shape parameter {@code alpha} and second shape parameter\n     * {@code beta}, the mean is {@code alpha / (alpha + beta)}.\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 36)",
        "(line 167,col 9)-(line 167,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.getNumericalVariance()",
      "begin_line": 177,
      "end_line": 182,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For first shape parameter {@code alpha} and second shape parameter\n     * {@code beta}, the variance is\n     * {@code (alpha * beta) / [(alpha + beta)^2 * (alpha + beta + 1)]}.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 36)",
        "(line 179,col 9)-(line 179,col 35)",
        "(line 180,col 9)-(line 180,col 42)",
        "(line 181,col 9)-(line 181,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.getSupportLowerBound()",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the parameters.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.getSupportUpperBound()",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always 1 no matter the parameters.\n     *\n     * @return upper bound of the support (always 1)\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 207,
      "end_line": 209,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 212,
      "end_line": 214,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.isSupportConnected()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 20)"
      ]
    }
  ]
}