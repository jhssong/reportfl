{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/optimization/general/StraightLineProblem.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StraightLineProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction"
      ],
      "begin_line": 39,
      "end_line": 158,
      "comment": "\n * Class that models a straight line defined as {@code y \u003d a x + b}.\n * The parameters of problem are:\n * \u003cul\u003e\n *  \u003cli\u003e{@code a}\u003c/li\u003e\n *  \u003cli\u003e{@code b}\u003c/li\u003e\n * \u003c/ul\u003e\n * The model functions are:\n * \u003cul\u003e\n *  \u003cli\u003efor each pair (a, b), the y-coordinate of the line.\u003c/li\u003e\n * \u003c/ul\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Cloud of points assumed to be fitted by a straight line. "
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Error (on the y-coordinate of the points). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.StraightLineProblem(double)",
      "begin_line": 48,
      "end_line": 51,
      "comment": "\n     * @param error Assumed error for the y-coordinate.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 43)",
        "(line 50,col 9)-(line 50,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.addPoint(double, double)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.x()",
      "begin_line": 60,
      "end_line": 68,
      "comment": "\n     * @return the list of x-coordinates.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 53)",
        "(line 62,col 9)-(line 65,col 9)",
        "(line 67,col 9)-(line 67,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.y()",
      "begin_line": 73,
      "end_line": 81,
      "comment": "\n     * @return the list of y-coordinates.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 53)",
        "(line 75,col 9)-(line 78,col 9)",
        "(line 80,col 9)-(line 80,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.target()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.weight()",
      "begin_line": 87,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 50)",
        "(line 89,col 9)-(line 89,col 53)",
        "(line 90,col 9)-(line 92,col 9)",
        "(line 94,col 9)-(line 94,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.value(double[])",
      "begin_line": 97,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 99,col 79)",
        "(line 101,col 9)-(line 101,col 57)",
        "(line 102,col 9)-(line 105,col 9)",
        "(line 107,col 9)-(line 107,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
      "begin_line": 110,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 59)",
        "(line 113,col 9)-(line 113,col 83)",
        "(line 114,col 9)-(line 117,col 9)",
        "(line 119,col 9)-(line 119,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.solve()",
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
      "type": "class_interface",
      "name": "Model",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction"
      ],
      "begin_line": 139,
      "end_line": 157,
      "comment": "\n     * Linear function.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.Model.Model(org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 143,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 145,col 13)-(line 145,col 23)",
        "(line 146,col 13)-(line 146,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.Model.value(double)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 13)-(line 150,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.Model.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 153,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 13)-(line 154,col 40)"
      ]
    }
  ]
}