{
  "filepath": "/tmp/Math-23b/src/test/java/org/apache/commons/math3/optimization/general/StraightLineProblem.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StraightLineProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction"
      ],
      "begin_line": 38,
      "end_line": 161,
      "comment": "\n * Class that models a straight line defined as {@code y \u003d a x + b}.\n * The parameters of problem are:\n * \u003cul\u003e\n *  \u003cli\u003e{@code a}\u003c/li\u003e\n *  \u003cli\u003e{@code b}\u003c/li\u003e\n * \u003c/ul\u003e\n * The model functions are:\n * \u003cul\u003e\n *  \u003cli\u003efor each pair (a, b), the y-coordinate of the line.\u003c/li\u003e\n * \u003c/ul\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Cloud of points assumed to be fitted by a straight line. "
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Error (on the y-coordinate of the points). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.StraightLineProblem(double)",
      "begin_line": 47,
      "end_line": 50,
      "comment": "\n     * @param error Assumed error for the y-coordinate.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 43)",
        "(line 49,col 9)-(line 49,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.addPoint(double, double)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.x()",
      "begin_line": 59,
      "end_line": 67,
      "comment": "\n     * @return the list of x-coordinates.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 53)",
        "(line 61,col 9)-(line 64,col 9)",
        "(line 66,col 9)-(line 66,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.y()",
      "begin_line": 72,
      "end_line": 80,
      "comment": "\n     * @return the list of y-coordinates.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 53)",
        "(line 74,col 9)-(line 77,col 9)",
        "(line 79,col 9)-(line 79,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.target()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.weight()",
      "begin_line": 86,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 50)",
        "(line 88,col 9)-(line 88,col 53)",
        "(line 89,col 9)-(line 91,col 9)",
        "(line 93,col 9)-(line 93,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.value(double[])",
      "begin_line": 96,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 59)",
        "(line 99,col 9)-(line 99,col 57)",
        "(line 100,col 9)-(line 103,col 9)",
        "(line 105,col 9)-(line 105,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.jacobian()",
      "begin_line": 108,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 113,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.Anonymous-1c405abf-0383-4065-9c83-6c091989effd.value(double[])",
      "begin_line": 110,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 111,col 17)-(line 111,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.solve()",
      "begin_line": 120,
      "end_line": 128,
      "comment": "\n     * Directly solve the linear problem, using the {@link SimpleRegression}\n     * class.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 68)",
        "(line 122,col 9)-(line 124,col 9)",
        "(line 126,col 9)-(line 126,col 79)",
        "(line 127,col 9)-(line 127,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.jacobian(double[])",
      "begin_line": 130,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 65)",
        "(line 133,col 9)-(line 139,col 9)",
        "(line 141,col 9)-(line 141,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Model",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.UnivariateFunction"
      ],
      "begin_line": 147,
      "end_line": 160,
      "comment": "\n     * Linear function.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.Model.Model(double, double)",
      "begin_line": 151,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 153,col 13)-(line 153,col 23)",
        "(line 154,col 13)-(line 154,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StraightLineProblem.Model.value(double)",
      "begin_line": 157,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 158,col 13)-(line 158,col 29)"
      ]
    }
  ]
}