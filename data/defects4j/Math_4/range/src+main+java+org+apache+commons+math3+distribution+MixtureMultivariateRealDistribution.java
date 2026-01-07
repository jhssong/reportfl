{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/MixtureMultivariateRealDistribution.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MixtureMultivariateRealDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution"
      ],
      "begin_line": 38,
      "end_line": 162,
      "comment": "\n * Class for representing \u003ca href\u003d\"http://en.wikipedia.org/wiki/Mixture_model\"\u003e\n * mixture model\u003c/a\u003e distributions.\n *\n * @param \u003cT\u003e Type of the mixture components.\n *\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "weight"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Normalized weight of each mixture component. "
    },
    {
      "type": "field",
      "varNames": [
        "distribution"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Mixture components. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.MixtureMultivariateRealDistribution.MixtureMultivariateRealDistribution(java.util.List\u003corg.apache.commons.math3.util.Pair\u003cjava.lang.Double, T\u003e\u003e)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Creates a mixture model from a list of distributions and their\n     * associated weights.\n     *\n     * @param components List of (weight, distribution) pairs from which to sample.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.MixtureMultivariateRealDistribution.MixtureMultivariateRealDistribution(org.apache.commons.math3.random.RandomGenerator, java.util.List\u003corg.apache.commons.math3.util.Pair\u003cjava.lang.Double, T\u003e\u003e)",
      "begin_line": 65,
      "end_line": 96,
      "comment": "\n     * Creates a mixture model from a list of distributions and their\n     * associated weights.\n     *\n     * @param rng Random number generator.\n     * @param components Distributions from which to sample.\n     * @throws NotPositiveException if any of the weights is negative.\n     * @throws DimensionMismatchException if not all components have the same\n     * number of variables.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 65)",
        "(line 69,col 9)-(line 69,col 46)",
        "(line 70,col 9)-(line 70,col 39)",
        "(line 71,col 9)-(line 71,col 29)",
        "(line 72,col 9)-(line 81,col 9)",
        "(line 84,col 9)-(line 86,col 9)",
        "(line 89,col 9)-(line 89,col 42)",
        "(line 90,col 9)-(line 90,col 37)",
        "(line 91,col 9)-(line 95,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MixtureMultivariateRealDistribution.density(double[])",
      "begin_line": 99,
      "end_line": 105,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 21)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MixtureMultivariateRealDistribution.sample()",
      "begin_line": 108,
      "end_line": 133,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 29)",
        "(line 113,col 9)-(line 113,col 55)",
        "(line 114,col 9)-(line 114,col 23)",
        "(line 116,col 9)-(line 123,col 9)",
        "(line 125,col 9)-(line 130,col 9)",
        "(line 132,col 9)-(line 132,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MixtureMultivariateRealDistribution.reseedRandomGenerator(long)",
      "begin_line": 136,
      "end_line": 146,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 42)",
        "(line 141,col 9)-(line 145,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.MixtureMultivariateRealDistribution.getComponents()",
      "begin_line": 153,
      "end_line": 161,
      "comment": "\n     * Gets the distributions that make up the mixture model.\n     *\n     * @return the component distributions and associated weights.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 76)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 160,col 9)-(line 160,col 20)"
      ]
    }
  ]
}