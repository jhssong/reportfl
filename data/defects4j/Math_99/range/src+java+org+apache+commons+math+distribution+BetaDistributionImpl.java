{
  "filepath": "/tmp/Math-99b/src/java/org/apache/commons/math/distribution/BetaDistributionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BetaDistributionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractContinuousDistribution",
        "org.apache.commons.math.distribution.BetaDistribution"
      ],
      "begin_line": 35,
      "end_line": 157,
      "comment": "\n * Implements the Beta distribution.\n * \u003cp\u003e\n * References:\n * \u003cul\u003e\n * \u003cli\u003e\u003ca href\u003d\"http://en.wikipedia.org/wiki/Beta_distribution\"\u003e\n * Beta distribution\u003c/a\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
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
      "begin_line": 42,
      "end_line": 42,
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
      "begin_line": 50,
      "end_line": 50,
      "comment": " Normalizing factor used in density computations.\n     * updated whenever alpha or beta are changed.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.BetaDistributionImpl(double, double)",
      "begin_line": 57,
      "end_line": 61,
      "comment": "\n     * Build a new instance.\n     * @param alpha first shape parameter (must be positive)\n     * @param beta second shape parameter (must be positive)\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 27)",
        "(line 59,col 9)-(line 59,col 25)",
        "(line 60,col 9)-(line 60,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.setAlpha(double)",
      "begin_line": 64,
      "end_line": 67,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 27)",
        "(line 66,col 9)-(line 66,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.getAlpha()",
      "begin_line": 70,
      "end_line": 72,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.setBeta(double)",
      "begin_line": 75,
      "end_line": 78,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 25)",
        "(line 77,col 9)-(line 77,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.getBeta()",
      "begin_line": 81,
      "end_line": 83,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.recomputeZ()",
      "begin_line": 88,
      "end_line": 92,
      "comment": "\n     * Recompute the normalization factor.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 91,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.density(java.lang.Double)",
      "begin_line": 95,
      "end_line": 114,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 21)",
        "(line 97,col 9)-(line 113,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.inverseCumulativeProbability(double)",
      "begin_line": 117,
      "end_line": 125,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 118,col 9)-(line 124,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.getInitialDomain(double)",
      "begin_line": 128,
      "end_line": 130,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.getDomainLowerBound(double)",
      "begin_line": 133,
      "end_line": 135,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.getDomainUpperBound(double)",
      "begin_line": 138,
      "end_line": 140,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.cumulativeProbability(double)",
      "begin_line": 143,
      "end_line": 151,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 144,col 9)-(line 150,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistributionImpl.cumulativeProbability(double, double)",
      "begin_line": 154,
      "end_line": 156,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 69)"
      ]
    }
  ]
}