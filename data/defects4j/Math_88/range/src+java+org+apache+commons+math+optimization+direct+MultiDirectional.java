{
  "filepath": "/tmp/Math-88b/src/java/org/apache/commons/math/optimization/direct/MultiDirectional.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiDirectional",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.DirectSearchOptimizer",
        "java.io.Serializable"
      ],
      "begin_line": 36,
      "end_line": 141,
      "comment": " \n * This class implements the multi-directional direct search method.\n *\n * implements Serializable since 2.0\n * \n * @version $Revision$ $Date$\n * @see NelderMead\n * @since 1.2\n "
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
        "khi"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Expansion coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "gamma"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Contraction coefficient. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.MultiDirectional.MultiDirectional()",
      "begin_line": 52,
      "end_line": 55,
      "comment": " Build a multi-directional optimizer with default coefficients.\n     * \u003cp\u003eThe default values are 2.0 for khi and 0.5 for gamma.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 25)",
        "(line 54,col 9)-(line 54,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.MultiDirectional.MultiDirectional(double, double)",
      "begin_line": 61,
      "end_line": 64,
      "comment": " Build a multi-directional optimizer with specified coefficients.\n     * @param khi expansion coefficient\n     * @param gamma contraction coefficient\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 25)",
        "(line 63,col 9)-(line 63,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultiDirectional.iterateSimplex(java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 67,
      "end_line": 104,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 71,col 9)-(line 102,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[], double, java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 115,
      "end_line": 139,
      "comment": " Compute and evaluate a new simplex.\n     * @param original original simplex (to be preserved)\n     * @param coeff linear coefficient\n     * @param comparator comparator to use to sort simplex vertices from best to poorest\n     * @return best point in the transformed simplex\n     * @exception FunctionEvaluationException if the function cannot be evaluated at\n     * some point\n     * @exception OptimizationException if the maximal number of evaluations is exceeded\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 61)",
        "(line 121,col 9)-(line 121,col 39)",
        "(line 124,col 9)-(line 124,col 48)",
        "(line 125,col 9)-(line 125,col 33)",
        "(line 126,col 9)-(line 133,col 9)",
        "(line 136,col 9)-(line 136,col 36)",
        "(line 137,col 9)-(line 137,col 26)"
      ]
    }
  ]
}