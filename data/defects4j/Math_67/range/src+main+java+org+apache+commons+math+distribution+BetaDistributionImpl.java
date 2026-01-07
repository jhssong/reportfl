{
  "filepath": "/tmp/Math-67b/src/main/java/org/apache/commons/math/distribution/BetaDistributionImpl.java",
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
      "end_line": 223,
      "comment": "\n * Implements the Beta distribution.\n * \u003cp\u003e\n * References:\n * \u003cul\u003e\n * \u003cli\u003e\u003ca href\u003d\"http://en.wikipedia.org/wiki/Beta_distribution\"\u003e\n * Beta distribution\u003c/a\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERSE_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Default inverse cumulative probability accurac\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "alpha"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " First shape parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "beta"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Second shape parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "z"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Normalizing factor used in density computations.\n     * updated whenever alpha or beta are changed.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "solverAbsoluteAccuracy"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Inverse cumulative probability accuracy "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.BetaDistributionImpl(double, double, double)",
      "begin_line": 71,
      "end_line": 76,
      "comment": "\n     * Build a new instance.\n     * @param alpha first shape parameter (must be positive)\n     * @param beta second shape parameter (must be positive)\n     * @param inverseCumAccuracy the maximum absolute error in inverse cumulative probability estimates\n     * (defaults to {@link #DEFAULT_INVERSE_ABSOLUTE_ACCURACY})\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 27)",
        "(line 73,col 9)-(line 73,col 25)",
        "(line 74,col 9)-(line 74,col 23)",
        "(line 75,col 9)-(line 75,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.BetaDistributionImpl(double, double)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Build a new instance.\n     * @param alpha first shape parameter (must be positive)\n     * @param beta second shape parameter (must be positive)\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.setAlpha(double)",
      "begin_line": 90,
      "end_line": 94,
      "comment": " {@inheritDoc}\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 27)",
        "(line 93,col 9)-(line 93,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.getAlpha()",
      "begin_line": 97,
      "end_line": 99,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.setBeta(double)",
      "begin_line": 104,
      "end_line": 108,
      "comment": " {@inheritDoc}\n     * @deprecated as of 2.1 (class will become immutable in 3.0)\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 25)",
        "(line 107,col 9)-(line 107,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.getBeta()",
      "begin_line": 111,
      "end_line": 113,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.recomputeZ()",
      "begin_line": 118,
      "end_line": 122,
      "comment": "\n     * Recompute the normalization factor.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 121,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.density(java.lang.Double)",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * Return the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     * @deprecated\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.density(double)",
      "begin_line": 142,
      "end_line": 163,
      "comment": "\n     * Return the probability density for a particular point.\n     *\n     * @param x The point at which the density should be computed.\n     * @return The pdf at point x.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 21)",
        "(line 144,col 9)-(line 162,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 166,
      "end_line": 175,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 168,col 9)-(line 174,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.getInitialDomain(double)",
      "begin_line": 178,
      "end_line": 181,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 184,
      "end_line": 187,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 190,
      "end_line": 193,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.cumulativeProbability(double)",
      "begin_line": 196,
      "end_line": 204,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 197,col 9)-(line 203,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.cumulativeProbability(double, double)",
      "begin_line": 207,
      "end_line": 210,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.getSolverAbsoluteAccuracy()",
      "begin_line": 219,
      "end_line": 222,
      "comment": "\n     * Return the absolute accuracy setting of the solver used to estimate\n     * inverse cumulative probabilities.\n     *\n     * @return the solver absolute accuracy\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 38)"
      ]
    }
  ]
}