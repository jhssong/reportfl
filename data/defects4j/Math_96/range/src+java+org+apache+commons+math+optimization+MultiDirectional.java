{
  "filepath": "/tmp/Math-96b/src/java/org/apache/commons/math/optimization/MultiDirectional.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiDirectional",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.DirectSearchOptimizer"
      ],
      "begin_line": 27,
      "end_line": 126,
      "comment": " \n * This class implements the multi-directional direct search method.\n *\n * @version $Revision$ $Date$\n * @see NelderMead\n * @since 1.2\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.MultiDirectional.MultiDirectional()",
      "begin_line": 33,
      "end_line": 37,
      "comment": " Build a multi-directional optimizer with default coefficients.\n   * \u003cp\u003eThe default values are 2.0 for khi and 0.5 for gamma.\u003c/p\u003e\n   ",
      "child_ranges": [
        "(line 34,col 5)-(line 34,col 12)",
        "(line 35,col 5)-(line 35,col 21)",
        "(line 36,col 5)-(line 36,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.MultiDirectional.MultiDirectional(double, double)",
      "begin_line": 43,
      "end_line": 47,
      "comment": " Build a multi-directional optimizer with specified coefficients.\n   * @param khi expansion coefficient\n   * @param gamma contraction coefficient\n   ",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 12)",
        "(line 45,col 5)-(line 45,col 21)",
        "(line 46,col 5)-(line 46,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiDirectional.iterateSimplex()",
      "begin_line": 53,
      "end_line": 87,
      "comment": " Compute the next simplex of the algorithm.\n   * @exception CostException if the function cannot be evaluated at\n   * some point\n   ",
      "child_ranges": [
        "(line 56,col 5)-(line 85,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiDirectional.evaluateNewSimplex(org.apache.commons.math.optimization.PointCostPair[], double)",
      "begin_line": 96,
      "end_line": 118,
      "comment": " Compute and evaluate a new simplex.\n   * @param original original simplex (to be preserved)\n   * @param coeff linear coefficient\n   * @return smallest cost in the transformed simplex\n   * @exception CostException if the function cannot be evaluated at\n   * some point\n   ",
      "child_ranges": [
        "(line 99,col 5)-(line 99,col 48)",
        "(line 100,col 5)-(line 100,col 29)",
        "(line 103,col 5)-(line 103,col 39)",
        "(line 104,col 5)-(line 104,col 29)",
        "(line 105,col 5)-(line 112,col 5)",
        "(line 115,col 5)-(line 115,col 22)",
        "(line 116,col 5)-(line 116,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "khi"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " Expansion coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "gamma"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " Contraction coefficient. "
    }
  ]
}