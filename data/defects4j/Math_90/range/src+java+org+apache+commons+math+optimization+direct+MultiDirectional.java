{
  "filepath": "/tmp/Math-90b/src/java/org/apache/commons/math/optimization/direct/MultiDirectional.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiDirectional",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.DirectSearchOptimizer"
      ],
      "begin_line": 33,
      "end_line": 135,
      "comment": " \n * This class implements the multi-directional direct search method.\n *\n * @version $Revision$ $Date$\n * @see NelderMead\n * @since 1.2\n "
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
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.MultiDirectional.MultiDirectional()",
      "begin_line": 47,
      "end_line": 50,
      "comment": " Build a multi-directional optimizer with default coefficients.\n     * \u003cp\u003eThe default values are 2.0 for khi and 0.5 for gamma.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 25)",
        "(line 49,col 9)-(line 49,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.MultiDirectional.MultiDirectional(double, double)",
      "begin_line": 56,
      "end_line": 59,
      "comment": " Build a multi-directional optimizer with specified coefficients.\n     * @param khi expansion coefficient\n     * @param gamma contraction coefficient\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 25)",
        "(line 58,col 9)-(line 58,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultiDirectional.iterateSimplex(java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 62,
      "end_line": 99,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 66,col 9)-(line 97,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[], double, java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 109,
      "end_line": 133,
      "comment": " Compute and evaluate a new simplex.\n     * @param original original simplex (to be preserved)\n     * @param coeff linear coefficient\n     * @param comparator comparator to use to sort simplex vertices from best to poorest\n     * @return best point in the transformed simplex\n     * @exception FunctionEvaluationException if the function cannot be evaluated at\n     * some point\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 61)",
        "(line 115,col 9)-(line 115,col 39)",
        "(line 118,col 9)-(line 118,col 48)",
        "(line 119,col 9)-(line 119,col 33)",
        "(line 120,col 9)-(line 127,col 9)",
        "(line 130,col 9)-(line 130,col 36)",
        "(line 131,col 9)-(line 131,col 26)"
      ]
    }
  ]
}