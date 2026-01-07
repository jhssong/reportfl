{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/optimization/direct/MultiDirectional.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiDirectional",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.DirectSearchOptimizer"
      ],
      "begin_line": 33,
      "end_line": 142,
      "comment": "\n * This class implements the multi-directional direct search method.\n *\n * @version $Revision$ $Date$\n * @see NelderMead\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "khi"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Expansion coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "gamma"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Contraction coefficient. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.MultiDirectional.MultiDirectional()",
      "begin_line": 44,
      "end_line": 47,
      "comment": " Build a multi-directional optimizer with default coefficients.\n     * \u003cp\u003eThe default values are 2.0 for khi and 0.5 for gamma.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 25)",
        "(line 46,col 9)-(line 46,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.MultiDirectional.MultiDirectional(double, double)",
      "begin_line": 53,
      "end_line": 56,
      "comment": " Build a multi-directional optimizer with specified coefficients.\n     * @param khi expansion coefficient\n     * @param gamma contraction coefficient\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 25)",
        "(line 55,col 9)-(line 55,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultiDirectional.iterateSimplex(java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 59,
      "end_line": 103,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 87)",
        "(line 64,col 9)-(line 64,col 26)",
        "(line 65,col 9)-(line 102,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[], double, java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 118,
      "end_line": 141,
      "comment": "\n     * Compute and evaluate a new simplex.\n     *\n     * @param original Original simplex (to be preserved).\n     * @param coeff Linear coefficient.\n     * @param comparator Comparator to use to sort simplex vertices from best\n     * to poorest.\n     * @return the best point in the transformed simplex.\n     * @exception FunctionEvaluationException if the function cannot be\n     * evaluated at some point.\n     * @exception TooManyEvaluationsException if the maximal number of\n     * evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 61)",
        "(line 124,col 9)-(line 124,col 39)",
        "(line 127,col 9)-(line 127,col 48)",
        "(line 128,col 9)-(line 128,col 33)",
        "(line 129,col 9)-(line 136,col 9)",
        "(line 139,col 9)-(line 139,col 36)",
        "(line 140,col 9)-(line 140,col 26)"
      ]
    }
  ]
}