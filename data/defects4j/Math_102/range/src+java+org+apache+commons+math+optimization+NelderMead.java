{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/optimization/NelderMead.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NelderMead",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.DirectSearchOptimizer"
      ],
      "begin_line": 25,
      "end_line": 172,
      "comment": " This class implements the Nelder-Mead direct search method.\n\n * @version $Id: NelderMead.java 1705 2006-09-17 19:57:39Z luc $\n * @see MultiDirectional\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.NelderMead.NelderMead()",
      "begin_line": 32,
      "end_line": 38,
      "comment": " Build a Nelder-Mead optimizer with default coefficients.\n   * \u003cp\u003eThe default coefficients are 1.0 for rho, 2.0 for khi and 0.5\n   * for both gamma and sigma.\u003c/p\u003e\n   ",
      "child_ranges": [
        "(line 33,col 5)-(line 33,col 12)",
        "(line 34,col 5)-(line 34,col 21)",
        "(line 35,col 5)-(line 35,col 21)",
        "(line 36,col 5)-(line 36,col 21)",
        "(line 37,col 5)-(line 37,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.NelderMead.NelderMead(double, double, double, double)",
      "begin_line": 46,
      "end_line": 52,
      "comment": " Build a Nelder-Mead optimizer with specified coefficients.\n   * @param rho reflection coefficient\n   * @param khi expansion coefficient\n   * @param gamma contraction coefficient\n   * @param sigma shrinkage coefficient\n   ",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 12)",
        "(line 48,col 5)-(line 48,col 21)",
        "(line 49,col 5)-(line 49,col 21)",
        "(line 50,col 5)-(line 50,col 23)",
        "(line 51,col 5)-(line 51,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.NelderMead.iterateSimplex()",
      "begin_line": 56,
      "end_line": 158,
      "comment": " Compute the next simplex of the algorithm.\n   ",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 31)",
        "(line 63,col 5)-(line 63,col 45)",
        "(line 64,col 5)-(line 64,col 47)",
        "(line 65,col 5)-(line 65,col 45)",
        "(line 66,col 5)-(line 66,col 46)",
        "(line 70,col 5)-(line 70,col 38)",
        "(line 71,col 5)-(line 76,col 5)",
        "(line 77,col 5)-(line 77,col 29)",
        "(line 78,col 5)-(line 80,col 5)",
        "(line 83,col 5)-(line 83,col 38)",
        "(line 84,col 5)-(line 86,col 5)",
        "(line 87,col 5)-(line 87,col 36)",
        "(line 89,col 5)-(line 156,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "rho"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": " Reflection coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "khi"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": " Expansion coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "gamma"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": " Contraction coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": " Shrinkage coefficient. "
    }
  ]
}