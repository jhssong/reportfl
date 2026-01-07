{
  "filepath": "/tmp/Math-8b/src/test/java/org/apache/commons/math3/optim/nonlinear/vector/jacobian/StraightLineProblem.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StraightLineProblem",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 167,
      "comment": "\n * Class that models a straight line defined as {@code y \u003d a x + b}.\n * The parameters of problem are:\n * \u003cul\u003e\n *  \u003cli\u003e{@code a}\u003c/li\u003e\n *  \u003cli\u003e{@code b}\u003c/li\u003e\n * \u003c/ul\u003e\n * The model functions are:\n * \u003cul\u003e\n *  \u003cli\u003efor each pair (a, b), the y-coordinate of the line.\u003c/li\u003e\n * \u003c/ul\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Cloud of points assumed to be fitted by a straight line. "
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Error (on the y-coordinate of the points). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StraightLineProblem.StraightLineProblem(double)",
      "begin_line": 49,
      "end_line": 52,
      "comment": "\n     * @param error Assumed error for the y-coordinate.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 43)",
        "(line 51,col 9)-(line 51,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StraightLineProblem.addPoint(double, double)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StraightLineProblem.x()",
      "begin_line": 61,
      "end_line": 69,
      "comment": "\n     * @return the list of x-coordinates.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 53)",
        "(line 63,col 9)-(line 66,col 9)",
        "(line 68,col 9)-(line 68,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StraightLineProblem.y()",
      "begin_line": 74,
      "end_line": 82,
      "comment": "\n     * @return the list of y-coordinates.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 53)",
        "(line 76,col 9)-(line 79,col 9)",
        "(line 81,col 9)-(line 81,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StraightLineProblem.target()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StraightLineProblem.weight()",
      "begin_line": 88,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 50)",
        "(line 90,col 9)-(line 90,col 53)",
        "(line 91,col 9)-(line 93,col 9)",
        "(line 95,col 9)-(line 95,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StraightLineProblem.getModelFunction()",
      "begin_line": 98,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 111,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StraightLineProblem.Anonymous-f5ec7d0c-7c04-42ed-a747-7f77c06ee6a3.value(double[])",
      "begin_line": 100,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 101,col 21)-(line 101,col 71)",
        "(line 103,col 21)-(line 103,col 69)",
        "(line 104,col 21)-(line 107,col 21)",
        "(line 109,col 21)-(line 109,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StraightLineProblem.getModelFunctionJacobian()",
      "begin_line": 114,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 119,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StraightLineProblem.Anonymous-4e080eb7-f525-4472-9700-d443a8cf6196.value(double[])",
      "begin_line": 116,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 21)-(line 117,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StraightLineProblem.solve()",
      "begin_line": 126,
      "end_line": 134,
      "comment": "\n     * Directly solve the linear problem, using the {@link SimpleRegression}\n     * class.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 68)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 132,col 9)-(line 132,col 79)",
        "(line 133,col 9)-(line 133,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StraightLineProblem.jacobian(double[])",
      "begin_line": 136,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 65)",
        "(line 139,col 9)-(line 145,col 9)",
        "(line 147,col 9)-(line 147,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Model",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.UnivariateFunction"
      ],
      "begin_line": 153,
      "end_line": 166,
      "comment": "\n     * Linear function.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StraightLineProblem.Model.Model(double, double)",
      "begin_line": 157,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 159,col 13)-(line 159,col 23)",
        "(line 160,col 13)-(line 160,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StraightLineProblem.Model.value(double)",
      "begin_line": 163,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 13)-(line 164,col 29)"
      ]
    }
  ]
}