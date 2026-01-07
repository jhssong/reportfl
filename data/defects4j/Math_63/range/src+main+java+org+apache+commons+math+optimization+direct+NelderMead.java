{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/optimization/direct/NelderMead.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NelderMead",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.DirectSearchOptimizer"
      ],
      "begin_line": 32,
      "end_line": 179,
      "comment": "\n * This class implements the Nelder-Mead direct search method.\n *\n * @version $Revision$ $Date$\n * @see MultiDirectional\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "rho"
      ],
      "begin_line": 35,
      "end_line": 35,
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
      "begin_line": 41,
      "end_line": 41,
      "comment": " Contraction coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Shrinkage coefficient. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.NelderMead.NelderMead()",
      "begin_line": 50,
      "end_line": 55,
      "comment": " Build a Nelder-Mead optimizer with default coefficients.\n     * \u003cp\u003eThe default coefficients are 1.0 for rho, 2.0 for khi and 0.5\n     * for both gamma and sigma.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 25)",
        "(line 52,col 9)-(line 52,col 25)",
        "(line 53,col 9)-(line 53,col 25)",
        "(line 54,col 9)-(line 54,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.NelderMead.NelderMead(double, double, double, double)",
      "begin_line": 63,
      "end_line": 69,
      "comment": " Build a Nelder-Mead optimizer with specified coefficients.\n     * @param rho reflection coefficient\n     * @param khi expansion coefficient\n     * @param gamma contraction coefficient\n     * @param sigma shrinkage coefficient\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 25)",
        "(line 66,col 9)-(line 66,col 25)",
        "(line 67,col 9)-(line 67,col 27)",
        "(line 68,col 9)-(line 68,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.NelderMead.iterateSimplex(java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 72,
      "end_line": 178,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 41)",
        "(line 80,col 9)-(line 80,col 57)",
        "(line 81,col 9)-(line 81,col 59)",
        "(line 82,col 9)-(line 82,col 57)",
        "(line 83,col 9)-(line 83,col 52)",
        "(line 87,col 9)-(line 87,col 48)",
        "(line 88,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 39)",
        "(line 95,col 9)-(line 97,col 9)",
        "(line 100,col 9)-(line 100,col 42)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 105,col 75)",
        "(line 107,col 9)-(line 177,col 9)"
      ]
    }
  ]
}