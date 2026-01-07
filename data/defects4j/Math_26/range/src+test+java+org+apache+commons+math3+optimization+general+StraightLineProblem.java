{
  "filepath": "/tmp/Math-26b/src/test/java/org/apache/commons/math3/optimization/general/StraightLineProblem.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StraightLineProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction"
      ],
      "begin_line": 41,
      "end_line": 164,
      "comment": "\n * Class that models a straight line defined as {@code y \u003d a x + b}.\n * The parameters of problem are:\n * \u003cul\u003e\n *  \u003cli\u003e{@code a}\u003c/li\u003e\n *  \u003cli\u003e{@code b}\u003c/li\u003e\n * \u003c/ul\u003e\n * The model functions are:\n * \u003cul\u003e\n *  \u003cli\u003efor each pair (a, b), the y-coordinate of the line.\u003c/li\u003e\n * \u003c/ul\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Cloud of points assumed to be fitted by a straight line. "
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Error (on the y-coordinate of the points). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.StraightLineProblem(double)",
      "begin_line": 50,
      "end_line": 53,
      "comment": "\n     * @param error Assumed error for the y-coordinate.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 43)",
        "(line 52,col 9)-(line 52,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.addPoint(double, double)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.x()",
      "begin_line": 62,
      "end_line": 70,
      "comment": "\n     * @return the list of x-coordinates.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 53)",
        "(line 64,col 9)-(line 67,col 9)",
        "(line 69,col 9)-(line 69,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.y()",
      "begin_line": 75,
      "end_line": 83,
      "comment": "\n     * @return the list of y-coordinates.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 53)",
        "(line 77,col 9)-(line 80,col 9)",
        "(line 82,col 9)-(line 82,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.target()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.weight()",
      "begin_line": 89,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 50)",
        "(line 91,col 9)-(line 91,col 53)",
        "(line 92,col 9)-(line 94,col 9)",
        "(line 96,col 9)-(line 96,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.value(double[])",
      "begin_line": 99,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 59)",
        "(line 102,col 9)-(line 102,col 57)",
        "(line 103,col 9)-(line 106,col 9)",
        "(line 108,col 9)-(line 108,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.jacobian()",
      "begin_line": 111,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 116,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.Anonymous-18486751-80f9-4c8f-b981-edb57d7b3079.value(double[])",
      "begin_line": 113,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 17)-(line 114,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.solve()",
      "begin_line": 123,
      "end_line": 131,
      "comment": "\n     * Directly solve the linear problem, using the {@link SimpleRegression}\n     * class.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 68)",
        "(line 125,col 9)-(line 127,col 9)",
        "(line 129,col 9)-(line 129,col 79)",
        "(line 130,col 9)-(line 130,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.jacobian(double[])",
      "begin_line": 133,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 65)",
        "(line 136,col 9)-(line 142,col 9)",
        "(line 144,col 9)-(line 144,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Model",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.UnivariateFunction"
      ],
      "begin_line": 150,
      "end_line": 163,
      "comment": "\n     * Linear function.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.Model.Model(double, double)",
      "begin_line": 154,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 156,col 13)-(line 156,col 23)",
        "(line 157,col 13)-(line 157,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.Model.value(double)",
      "begin_line": 160,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 161,col 13)-(line 161,col 29)"
      ]
    }
  ]
}