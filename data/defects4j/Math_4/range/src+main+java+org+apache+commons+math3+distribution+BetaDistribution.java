{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/BetaDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BetaDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 34,
      "end_line": 237,
      "comment": "\n * Implements the Beta distribution.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Beta_distribution\"\u003eBeta distribution\u003c/a\u003e\n * @version $Id$\n * @since 2.0 (changed to concrete class in 3.0)\n "
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
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "alpha"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " First shape parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "beta"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Second shape parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "z"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Normalizing factor used in density computations.\n     * updated whenever alpha or beta are changed.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Inverse cumulative probability accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.BetaDistribution(double, double)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Build a new instance.\n     *\n     * @param alpha First shape parameter (must be positive).\n     * @param beta Second shape parameter (must be positive).\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.BetaDistribution(double, double, double)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Build a new instance.\n     *\n     * @param alpha First shape parameter (must be positive).\n     * @param beta Second shape parameter (must be positive).\n     * @param inverseCumAccuracy Maximum absolute error in inverse\n     * cumulative probability estimates (defaults to\n     * {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.BetaDistribution(org.apache.commons.math3.random.RandomGenerator, double, double, double)",
      "begin_line": 88,
      "end_line": 98,
      "comment": "\n     * Creates a \u0026beta; distribution.\n     *\n     * @param rng Random number generator.\n     * @param alpha First shape parameter (must be positive).\n     * @param beta Second shape parameter (must be positive).\n     * @param inverseCumAccuracy Maximum absolute error in inverse\n     * cumulative probability estimates (defaults to\n     * {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY}).\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 19)",
        "(line 94,col 9)-(line 94,col 27)",
        "(line 95,col 9)-(line 95,col 25)",
        "(line 96,col 9)-(line 96,col 23)",
        "(line 97,col 9)-(line 97,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.getAlpha()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Access the first shape parameter, {@code alpha}.\n     *\n     * @return the first shape parameter.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.getBeta()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Access the second shape parameter, {@code beta}.\n     *\n     * @return the second shape parameter.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.recomputeZ()",
      "begin_line": 119,
      "end_line": 123,
      "comment": " Recompute the normalization factor. ",
      "child_ranges": [
        "(line 120,col 9)-(line 122,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.density(double)",
      "begin_line": 126,
      "end_line": 145,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 21)",
        "(line 128,col 9)-(line 144,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.cumulativeProbability(double)",
      "begin_line": 148,
      "end_line": 156,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 149,col 9)-(line 155,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.getSolverAbsoluteAccuracy()",
      "begin_line": 165,
      "end_line": 168,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.getNumericalMean()",
      "begin_line": 176,
      "end_line": 179,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For first shape parameter {@code alpha} and second shape parameter\n     * {@code beta}, the mean is {@code alpha / (alpha + beta)}.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 36)",
        "(line 178,col 9)-(line 178,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.getNumericalVariance()",
      "begin_line": 188,
      "end_line": 193,
      "comment": "\n     * {@inheritDoc}\n     *\n     * For first shape parameter {@code alpha} and second shape parameter\n     * {@code beta}, the variance is\n     * {@code (alpha * beta) / [(alpha + beta)^2 * (alpha + beta + 1)]}.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 36)",
        "(line 190,col 9)-(line 190,col 35)",
        "(line 191,col 9)-(line 191,col 42)",
        "(line 192,col 9)-(line 192,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.getSupportLowerBound()",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The lower bound of the support is always 0 no matter the parameters.\n     *\n     * @return lower bound of the support (always 0)\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.getSupportUpperBound()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The upper bound of the support is always 1 no matter the parameters.\n     *\n     * @return upper bound of the support (always 1)\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 218,
      "end_line": 220,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 223,
      "end_line": 225,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.BetaDistribution.isSupportConnected()",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\n     * {@inheritDoc}\n     *\n     * The support of this distribution is connected.\n     *\n     * @return {@code true}\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 20)"
      ]
    }
  ]
}