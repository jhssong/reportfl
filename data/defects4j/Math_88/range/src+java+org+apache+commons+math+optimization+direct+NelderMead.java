{
  "filepath": "/tmp/Math-88b/src/java/org/apache/commons/math/optimization/direct/NelderMead.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NelderMead",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.DirectSearchOptimizer",
        "java.io.Serializable"
      ],
      "begin_line": 36,
      "end_line": 189,
      "comment": " \n * This class implements the Nelder-Mead direct search method.\n *\n * implements Serializable since 2.0\n * \n * @version $Revision$ $Date$\n * @see MultiDirectional\n * @since 1.2\n "
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
        "rho"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Reflection coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "khi"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Expansion coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "gamma"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Contraction coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Shrinkage coefficient. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.NelderMead.NelderMead()",
      "begin_line": 59,
      "end_line": 64,
      "comment": " Build a Nelder-Mead optimizer with default coefficients.\n     * \u003cp\u003eThe default coefficients are 1.0 for rho, 2.0 for khi and 0.5\n     * for both gamma and sigma.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 25)",
        "(line 61,col 9)-(line 61,col 25)",
        "(line 62,col 9)-(line 62,col 25)",
        "(line 63,col 9)-(line 63,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.NelderMead.NelderMead(double, double, double, double)",
      "begin_line": 72,
      "end_line": 78,
      "comment": " Build a Nelder-Mead optimizer with specified coefficients.\n     * @param rho reflection coefficient\n     * @param khi expansion coefficient\n     * @param gamma contraction coefficient\n     * @param sigma shrinkage coefficient\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 25)",
        "(line 75,col 9)-(line 75,col 25)",
        "(line 76,col 9)-(line 76,col 27)",
        "(line 77,col 9)-(line 77,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.NelderMead.iterateSimplex(java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 81,
      "end_line": 187,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 37)",
        "(line 88,col 9)-(line 88,col 41)",
        "(line 91,col 9)-(line 91,col 57)",
        "(line 92,col 9)-(line 92,col 59)",
        "(line 93,col 9)-(line 93,col 57)",
        "(line 94,col 9)-(line 94,col 52)",
        "(line 98,col 9)-(line 98,col 48)",
        "(line 99,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 39)",
        "(line 106,col 9)-(line 108,col 9)",
        "(line 111,col 9)-(line 111,col 42)",
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 93)",
        "(line 117,col 9)-(line 185,col 9)"
      ]
    }
  ]
}