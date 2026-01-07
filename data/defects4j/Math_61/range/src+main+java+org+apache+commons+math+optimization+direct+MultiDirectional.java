{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/optimization/direct/MultiDirectional.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiDirectional",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.DirectSearchOptimizer",
        "org.apache.commons.math.optimization.MultivariateRealOptimizer"
      ],
      "begin_line": 34,
      "end_line": 145,
      "comment": "\n * This class implements the multi-directional direct search method.\n *\n * @version $Revision$ $Date$\n * @see NelderMead\n * @since 1.2\n "
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
      "begin_line": 39,
      "end_line": 39,
      "comment": " Contraction coefficient. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.MultiDirectional.MultiDirectional()",
      "begin_line": 45,
      "end_line": 48,
      "comment": "\n     * Build a multi-directional optimizer with default coefficients.\n     * The default values are 2.0 for khi and 0.5 for gamma.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 25)",
        "(line 47,col 9)-(line 47,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.MultiDirectional.MultiDirectional(double, double)",
      "begin_line": 56,
      "end_line": 59,
      "comment": "\n     * Build a multi-directional optimizer with specified coefficients.\n     *\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 25)",
        "(line 58,col 9)-(line 58,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultiDirectional.iterateSimplex(java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 62,
      "end_line": 106,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 87)",
        "(line 67,col 9)-(line 67,col 26)",
        "(line 68,col 9)-(line 105,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultiDirectional.evaluateNewSimplex(org.apache.commons.math.optimization.RealPointValuePair[], double, java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 121,
      "end_line": 144,
      "comment": "\n     * Compute and evaluate a new simplex.\n     *\n     * @param original Original simplex (to be preserved).\n     * @param coeff Linear coefficient.\n     * @param comparator Comparator to use to sort simplex vertices from best\n     * to poorest.\n     * @return the best point in the transformed simplex.\n     * @throws FunctionEvaluationException if the function cannot be\n     * evaluated at some point.\n     * @throws org.apache.commons.math.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 61)",
        "(line 127,col 9)-(line 127,col 39)",
        "(line 130,col 9)-(line 130,col 48)",
        "(line 131,col 9)-(line 131,col 33)",
        "(line 132,col 9)-(line 139,col 9)",
        "(line 142,col 9)-(line 142,col 36)",
        "(line 143,col 9)-(line 143,col 26)"
      ]
    }
  ]
}