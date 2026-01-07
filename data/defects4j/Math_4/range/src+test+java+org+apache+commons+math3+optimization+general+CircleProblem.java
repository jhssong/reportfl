{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/optimization/general/CircleProblem.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CircleProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction"
      ],
      "begin_line": 41,
      "end_line": 138,
      "comment": "\n * Class that models a circle.\n * The parameters of problem are:\n * \u003cul\u003e\n *  \u003cli\u003ethe x-coordinate of the circle center,\u003c/li\u003e\n *  \u003cli\u003ethe y-coordinate of the circle center,\u003c/li\u003e\n *  \u003cli\u003ethe radius of the circle.\u003c/li\u003e\n * \u003c/ul\u003e\n * The model functions are:\n * \u003cul\u003e\n *  \u003cli\u003efor each triplet (cx, cy, r), the (x, y) coordinates of a point on the\n *   corresponding circle.\u003c/li\u003e\n * \u003c/ul\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Cloud of points assumed to be fitted by a circle. "
    },
    {
      "type": "field",
      "varNames": [
        "xSigma"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Error on the x-coordinate of the points. "
    },
    {
      "type": "field",
      "varNames": [
        "ySigma"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Error on the y-coordinate of the points. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.CircleProblem.CircleProblem(double, double)",
      "begin_line": 53,
      "end_line": 58,
      "comment": "\n     * @param xError Assumed error for the x-coordinate of the circle points.\n     * @param yError Assumed error for the y-coordinate of the circle points.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 43)",
        "(line 56,col 9)-(line 56,col 24)",
        "(line 57,col 9)-(line 57,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.CircleProblem.addPoint(org.apache.commons.math3.geometry.euclidean.twod.Vector2D)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.CircleProblem.target()",
      "begin_line": 64,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 57)",
        "(line 66,col 9)-(line 71,col 9)",
        "(line 73,col 9)-(line 73,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.CircleProblem.weight()",
      "begin_line": 76,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 48)",
        "(line 78,col 9)-(line 78,col 48)",
        "(line 79,col 9)-(line 79,col 57)",
        "(line 80,col 9)-(line 84,col 9)",
        "(line 86,col 9)-(line 86,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.CircleProblem.value(double[])",
      "begin_line": 89,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 36)",
        "(line 91,col 9)-(line 91,col 36)",
        "(line 92,col 9)-(line 92,col 35)",
        "(line 94,col 9)-(line 94,col 61)",
        "(line 96,col 9)-(line 108,col 9)",
        "(line 110,col 9)-(line 110,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.CircleProblem.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
      "begin_line": 113,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 49)",
        "(line 115,col 9)-(line 115,col 49)",
        "(line 116,col 9)-(line 116,col 48)",
        "(line 118,col 9)-(line 118,col 87)",
        "(line 120,col 9)-(line 132,col 9)",
        "(line 134,col 9)-(line 134,col 21)"
      ]
    }
  ]
}