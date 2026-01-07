{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/distribution/BetaDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BetaDistribution",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math.distribution.ContinuousDistribution",
        "org.apache.commons.math.distribution.HasDensity\u003cjava.lang.Double\u003e"
      ],
      "begin_line": 28,
      "end_line": 65,
      "comment": "\n * Computes the cumulative, inverse cumulative and density functions for the beta distribuiton.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Beta_distribution\"\u003eBeta_distribution\u003c/a\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistribution.setAlpha(double)",
      "begin_line": 34,
      "end_line": 35,
      "comment": "\n     * Modify the shape parameter, alpha.\n     * @param alpha the new shape parameter.\n     * @deprecated as of 2.1\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistribution.getAlpha()",
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n      * Access the shape parameter, alpha\n      * @return alpha.\n      ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistribution.setBeta(double)",
      "begin_line": 48,
      "end_line": 49,
      "comment": "\n      * Modify the shape parameter, beta.\n      * @param beta the new scale parameter.\n      * @deprecated as of 2.1\n      ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistribution.getBeta()",
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n      * Access the shape parameter, beta\n      * @return beta.\n      ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.BetaDistribution.density(java.lang.Double)",
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n      * Return the probability density for a particular point.\n      * @param x  The point at which the density should be computed.\n      * @return  The pdf at point x.\n      * @exception MathException if probability density cannot be computed\n      ",
      "child_ranges": []
    }
  ]
}