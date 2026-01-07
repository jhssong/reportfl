{
  "filepath": "/tmp/Math-104b/src/java/org/apache/commons/math/optimization/MultiDirectional.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiDirectional",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.DirectSearchOptimizer"
      ],
      "begin_line": 25,
      "end_line": 122,
      "comment": " This class implements the multi-directional direct search method.\n\n * @version $Id: MultiDirectional.java 1705 2006-09-17 19:57:39Z luc $\n * @see NelderMead\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.MultiDirectional.MultiDirectional()",
      "begin_line": 31,
      "end_line": 35,
      "comment": " Build a multi-directional optimizer with default coefficients.\n   * \u003cp\u003eThe default values are 2.0 for khi and 0.5 for gamma.\u003c/p\u003e\n   ",
      "child_ranges": [
        "(line 32,col 5)-(line 32,col 12)",
        "(line 33,col 5)-(line 33,col 21)",
        "(line 34,col 5)-(line 34,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.MultiDirectional.MultiDirectional(double, double)",
      "begin_line": 41,
      "end_line": 45,
      "comment": " Build a multi-directional optimizer with specified coefficients.\n   * @param khi expansion coefficient\n   * @param gamma contraction coefficient\n   ",
      "child_ranges": [
        "(line 42,col 5)-(line 42,col 12)",
        "(line 43,col 5)-(line 43,col 21)",
        "(line 44,col 5)-(line 44,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiDirectional.iterateSimplex()",
      "begin_line": 49,
      "end_line": 83,
      "comment": " Compute the next simplex of the algorithm.\n   ",
      "child_ranges": [
        "(line 52,col 5)-(line 81,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultiDirectional.evaluateNewSimplex(org.apache.commons.math.optimization.PointCostPair[], double)",
      "begin_line": 92,
      "end_line": 114,
      "comment": " Compute and evaluate a new simplex.\n   * @param original original simplex (to be preserved)\n   * @param coeff linear coefficient\n   * @return smallest cost in the transformed simplex\n   * @exception CostException if the function cannot be evaluated at\n   * some point\n   ",
      "child_ranges": [
        "(line 95,col 5)-(line 95,col 43)",
        "(line 96,col 5)-(line 96,col 29)",
        "(line 99,col 5)-(line 99,col 39)",
        "(line 100,col 5)-(line 100,col 29)",
        "(line 101,col 5)-(line 108,col 5)",
        "(line 111,col 5)-(line 111,col 22)",
        "(line 112,col 5)-(line 112,col 27)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "khi"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " Expansion coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "gamma"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " Contraction coefficient. "
    }
  ]
}