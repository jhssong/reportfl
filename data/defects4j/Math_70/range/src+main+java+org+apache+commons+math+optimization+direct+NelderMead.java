{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/optimization/direct/NelderMead.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NelderMead",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.DirectSearchOptimizer"
      ],
      "begin_line": 33,
      "end_line": 181,
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
      "begin_line": 39,
      "end_line": 39,
      "comment": " Expansion coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "gamma"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Contraction coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Shrinkage coefficient. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.NelderMead.NelderMead()",
      "begin_line": 51,
      "end_line": 56,
      "comment": " Build a Nelder-Mead optimizer with default coefficients.\n     * \u003cp\u003eThe default coefficients are 1.0 for rho, 2.0 for khi and 0.5\n     * for both gamma and sigma.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 25)",
        "(line 53,col 9)-(line 53,col 25)",
        "(line 54,col 9)-(line 54,col 25)",
        "(line 55,col 9)-(line 55,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.NelderMead.NelderMead(double, double, double, double)",
      "begin_line": 64,
      "end_line": 70,
      "comment": " Build a Nelder-Mead optimizer with specified coefficients.\n     * @param rho reflection coefficient\n     * @param khi expansion coefficient\n     * @param gamma contraction coefficient\n     * @param sigma shrinkage coefficient\n     ",
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
        "(line 77,col 9)-(line 77,col 37)",
        "(line 80,col 9)-(line 80,col 41)",
        "(line 83,col 9)-(line 83,col 57)",
        "(line 84,col 9)-(line 84,col 59)",
        "(line 85,col 9)-(line 85,col 57)",
        "(line 86,col 9)-(line 86,col 52)",
        "(line 90,col 9)-(line 90,col 48)",
        "(line 91,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 39)",
        "(line 98,col 9)-(line 100,col 9)",
        "(line 103,col 9)-(line 103,col 42)",
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 93)",
        "(line 109,col 9)-(line 177,col 9)"
      ]
    }
  ]
}