{
  "filepath": "/tmp/Math-101b/src/java/org/apache/commons/math/optimization/NelderMead.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NelderMead",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.DirectSearchOptimizer"
      ],
      "begin_line": 27,
      "end_line": 176,
      "comment": " \n * This class implements the Nelder-Mead direct search method.\n *\n * @version $Revision$ $Date$\n * @see MultiDirectional\n * @since 1.2\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.NelderMead.NelderMead()",
      "begin_line": 34,
      "end_line": 40,
      "comment": " Build a Nelder-Mead optimizer with default coefficients.\n   * \u003cp\u003eThe default coefficients are 1.0 for rho, 2.0 for khi and 0.5\n   * for both gamma and sigma.\u003c/p\u003e\n   ",
      "child_ranges": [
        "(line 35,col 5)-(line 35,col 12)",
        "(line 36,col 5)-(line 36,col 21)",
        "(line 37,col 5)-(line 37,col 21)",
        "(line 38,col 5)-(line 38,col 21)",
        "(line 39,col 5)-(line 39,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.NelderMead.NelderMead(double, double, double, double)",
      "begin_line": 48,
      "end_line": 54,
      "comment": " Build a Nelder-Mead optimizer with specified coefficients.\n   * @param rho reflection coefficient\n   * @param khi expansion coefficient\n   * @param gamma contraction coefficient\n   * @param sigma shrinkage coefficient\n   ",
      "child_ranges": [
        "(line 49,col 5)-(line 49,col 12)",
        "(line 50,col 5)-(line 50,col 21)",
        "(line 51,col 5)-(line 51,col 21)",
        "(line 52,col 5)-(line 52,col 23)",
        "(line 53,col 5)-(line 53,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.NelderMead.iterateSimplex()",
      "begin_line": 60,
      "end_line": 162,
      "comment": " Compute the next simplex of the algorithm.\n   * @exception CostException if the function cannot be evaluated at\n   * some point\n   ",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 31)",
        "(line 67,col 5)-(line 67,col 50)",
        "(line 68,col 5)-(line 68,col 52)",
        "(line 69,col 5)-(line 69,col 50)",
        "(line 70,col 5)-(line 70,col 51)",
        "(line 74,col 5)-(line 74,col 38)",
        "(line 75,col 5)-(line 80,col 5)",
        "(line 81,col 5)-(line 81,col 29)",
        "(line 82,col 5)-(line 84,col 5)",
        "(line 87,col 5)-(line 87,col 38)",
        "(line 88,col 5)-(line 90,col 5)",
        "(line 91,col 5)-(line 91,col 36)",
        "(line 93,col 5)-(line 160,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "rho"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": " Reflection coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "khi"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": " Expansion coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "gamma"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": " Contraction coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": " Shrinkage coefficient. "
    }
  ]
}