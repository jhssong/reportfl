{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/optimization/direct/NelderMead.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NelderMead",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.DirectSearchOptimizer",
        "org.apache.commons.math.optimization.MultivariateRealOptimizer"
      ],
      "begin_line": 33,
      "end_line": 180,
      "comment": "\n * This class implements the Nelder-Mead direct search method.\n *\n * @version $Revision$ $Date$\n * @see MultiDirectional\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "rho"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Reflection coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "khi"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Expansion coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "gamma"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Contraction coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Shrinkage coefficient. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.NelderMead.NelderMead()",
      "begin_line": 49,
      "end_line": 54,
      "comment": "\n     * Build a Nelder-Mead optimizer with default coefficients.\n     * The default coefficients are 1.0 for rho, 2.0 for khi and 0.5\n     * for both gamma and sigma.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 25)",
        "(line 51,col 9)-(line 51,col 25)",
        "(line 52,col 9)-(line 52,col 25)",
        "(line 53,col 9)-(line 53,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.NelderMead.NelderMead(double, double, double, double)",
      "begin_line": 64,
      "end_line": 70,
      "comment": "\n     * Build a Nelder-Mead optimizer with specified coefficients.\n     *\n     * @param rho Reflection coefficient.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     * @param sigma Shrinkage coefficient.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 25)",
        "(line 67,col 9)-(line 67,col 25)",
        "(line 68,col 9)-(line 68,col 27)",
        "(line 69,col 9)-(line 69,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.NelderMead.iterateSimplex(java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 73,
      "end_line": 179,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 41)",
        "(line 81,col 9)-(line 81,col 57)",
        "(line 82,col 9)-(line 82,col 59)",
        "(line 83,col 9)-(line 83,col 57)",
        "(line 84,col 9)-(line 84,col 52)",
        "(line 88,col 9)-(line 88,col 48)",
        "(line 89,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 39)",
        "(line 96,col 9)-(line 98,col 9)",
        "(line 101,col 9)-(line 101,col 42)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 106,col 75)",
        "(line 108,col 9)-(line 178,col 9)"
      ]
    }
  ]
}