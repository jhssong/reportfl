{
  "filepath": "/tmp/Math-91b/src/java/org/apache/commons/math/optimization/direct/NelderMead.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NelderMead",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.DirectSearchOptimizer"
      ],
      "begin_line": 33,
      "end_line": 183,
      "comment": " \n * This class implements the Nelder-Mead direct search method.\n *\n * @version $Revision$ $Date$\n * @see MultiDirectional\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "rho"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Reflection coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "khi"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Expansion coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "gamma"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Contraction coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Shrinkage coefficient. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.NelderMead.NelderMead()",
      "begin_line": 54,
      "end_line": 59,
      "comment": " Build a Nelder-Mead optimizer with default coefficients.\n     * \u003cp\u003eThe default coefficients are 1.0 for rho, 2.0 for khi and 0.5\n     * for both gamma and sigma.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 25)",
        "(line 56,col 9)-(line 56,col 25)",
        "(line 57,col 9)-(line 57,col 25)",
        "(line 58,col 9)-(line 58,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.NelderMead.NelderMead(double, double, double, double)",
      "begin_line": 67,
      "end_line": 73,
      "comment": " Build a Nelder-Mead optimizer with specified coefficients.\n     * @param rho reflection coefficient\n     * @param khi expansion coefficient\n     * @param gamma contraction coefficient\n     * @param sigma shrinkage coefficient\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 25)",
        "(line 70,col 9)-(line 70,col 25)",
        "(line 71,col 9)-(line 71,col 27)",
        "(line 72,col 9)-(line 72,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.NelderMead.iterateSimplex(java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 76,
      "end_line": 181,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 37)",
        "(line 82,col 9)-(line 82,col 41)",
        "(line 85,col 9)-(line 85,col 57)",
        "(line 86,col 9)-(line 86,col 59)",
        "(line 87,col 9)-(line 87,col 57)",
        "(line 88,col 9)-(line 88,col 52)",
        "(line 92,col 9)-(line 92,col 48)",
        "(line 93,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 39)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 105,col 9)-(line 105,col 42)",
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 93)",
        "(line 111,col 9)-(line 179,col 9)"
      ]
    }
  ]
}