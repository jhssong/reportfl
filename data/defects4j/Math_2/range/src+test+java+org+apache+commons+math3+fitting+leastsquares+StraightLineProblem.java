{
  "filepath": "/tmp/Math-2b/src/test/java/org/apache/commons/math3/fitting/leastsquares/StraightLineProblem.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StraightLineProblem",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 165,
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
      "signature": "org.apache.commons.math3.fitting.leastsquares.StraightLineProblem.StraightLineProblem(double)",
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
      "signature": "org.apache.commons.math3.fitting.leastsquares.StraightLineProblem.addPoint(double, double)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.StraightLineProblem.x()",
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
      "signature": "org.apache.commons.math3.fitting.leastsquares.StraightLineProblem.y()",
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
      "signature": "org.apache.commons.math3.fitting.leastsquares.StraightLineProblem.target()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.StraightLineProblem.weight()",
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
      "signature": "org.apache.commons.math3.fitting.leastsquares.StraightLineProblem.getModelFunction()",
      "begin_line": 96,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 109,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.StraightLineProblem.Anonymous-d09ae190-9e57-443c-9032-a7f26acdce1e.value(double[])",
      "begin_line": 98,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 99,col 17)-(line 99,col 67)",
        "(line 101,col 17)-(line 101,col 65)",
        "(line 102,col 17)-(line 105,col 17)",
        "(line 107,col 17)-(line 107,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.StraightLineProblem.getModelFunctionJacobian()",
      "begin_line": 112,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 117,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.StraightLineProblem.Anonymous-c5b4f6b3-ec61-4ab9-8186-545e89c5dba0.value(double[])",
      "begin_line": 114,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 17)-(line 115,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.StraightLineProblem.solve()",
      "begin_line": 124,
      "end_line": 132,
      "comment": "\n     * Directly solve the linear problem, using the {@link SimpleRegression}\n     * class.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 68)",
        "(line 126,col 9)-(line 128,col 9)",
        "(line 130,col 9)-(line 130,col 79)",
        "(line 131,col 9)-(line 131,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.StraightLineProblem.jacobian(double[])",
      "begin_line": 134,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 65)",
        "(line 137,col 9)-(line 143,col 9)",
        "(line 145,col 9)-(line 145,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Model",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.UnivariateFunction"
      ],
      "begin_line": 151,
      "end_line": 164,
      "comment": "\n     * Linear function.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fitting.leastsquares.StraightLineProblem.Model.Model(double, double)",
      "begin_line": 155,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 157,col 13)-(line 157,col 23)",
        "(line 158,col 13)-(line 158,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.StraightLineProblem.Model.value(double)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 13)-(line 162,col 29)"
      ]
    }
  ]
}