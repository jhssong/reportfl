{
  "filepath": "/tmp/Math-84b/src/main/java/org/apache/commons/math/optimization/direct/MultiDirectional.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiDirectional",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.DirectSearchOptimizer"
      ],
      "begin_line": 34,
      "end_line": 136,
      "comment": " \n * This class implements the multi-directional direct search method.\n *\n * @version $Revision$ $Date$\n * @see NelderMead\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "khi"
      ],
      "begin_line": 37,
      "end_line": 37,
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
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.MultiDirectional.MultiDirectional()",
      "begin_line": 45,
      "end_line": 48,
      "comment": " Build a multi-directional optimizer with default coefficients.\n     * \u003cp\u003eThe default values are 2.0 for khi and 0.5 for gamma.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 25)",
        "(line 47,col 9)-(line 47,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.MultiDirectional.MultiDirectional(double, double)",
      "begin_line": 54,
      "end_line": 57,
      "comment": " Build a multi-directional optimizer with specified coefficients.\n     * @param khi expansion coefficient\n     * @param gamma contraction coefficient\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 25)",
        "(line 56,col 9)-(line 56,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultiDirectional.iterateSimplex(java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 60,
      "end_line": 99,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 64,col 9)-(line 97,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[], double, java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 110,
      "end_line": 134,
      "comment": " Compute and evaluate a new simplex.\n     * @param original original simplex (to be preserved)\n     * @param coeff linear coefficient\n     * @param comparator comparator to use to sort simplex vertices from best to poorest\n     * @return best point in the transformed simplex\n     * @exception FunctionEvaluationException if the function cannot be evaluated at\n     * some point\n     * @exception OptimizationException if the maximal number of evaluations is exceeded\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 61)",
        "(line 116,col 9)-(line 116,col 39)",
        "(line 119,col 9)-(line 119,col 48)",
        "(line 120,col 9)-(line 120,col 33)",
        "(line 121,col 9)-(line 128,col 9)",
        "(line 131,col 9)-(line 131,col 36)",
        "(line 132,col 9)-(line 132,col 26)"
      ]
    }
  ]
}