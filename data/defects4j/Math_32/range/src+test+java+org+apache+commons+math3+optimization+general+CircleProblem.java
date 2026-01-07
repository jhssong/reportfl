{
  "filepath": "/tmp/Math-32b/src/test/java/org/apache/commons/math3/optimization/general/CircleProblem.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CircleProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction"
      ],
      "begin_line": 41,
      "end_line": 173,
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
      "type": "field",
      "varNames": [
        "resolution"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Number of points on the circumference (when searching which\n        model point is closest to a given \"observation\". "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.CircleProblem.CircleProblem(double, double, int)",
      "begin_line": 58,
      "end_line": 65,
      "comment": "\n     * @param xError Assumed error for the x-coordinate of the circle points.\n     * @param yError Assumed error for the y-coordinate of the circle points.\n     * @param searchResolution Number of points to try when searching the one\n     * that is closest to a given \"observed\" point.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 43)",
        "(line 62,col 9)-(line 62,col 24)",
        "(line 63,col 9)-(line 63,col 24)",
        "(line 64,col 9)-(line 64,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.CircleProblem.CircleProblem(double, double)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * @param xError Assumed error for the x-coordinate of the circle points.\n     * @param yError Assumed error for the y-coordinate of the circle points.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.CircleProblem.addPoint(double, double)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.CircleProblem.target()",
      "begin_line": 80,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 57)",
        "(line 82,col 9)-(line 87,col 9)",
        "(line 89,col 9)-(line 89,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.CircleProblem.weight()",
      "begin_line": 92,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 48)",
        "(line 94,col 9)-(line 94,col 48)",
        "(line 95,col 9)-(line 95,col 57)",
        "(line 96,col 9)-(line 100,col 9)",
        "(line 102,col 9)-(line 102,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.CircleProblem.value(double[])",
      "begin_line": 105,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 36)",
        "(line 107,col 9)-(line 107,col 36)",
        "(line 108,col 9)-(line 108,col 35)",
        "(line 110,col 9)-(line 110,col 61)",
        "(line 112,col 9)-(line 112,col 64)",
        "(line 113,col 9)-(line 141,col 9)",
        "(line 143,col 9)-(line 143,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.CircleProblem.jacobian()",
      "begin_line": 146,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 147,col 9)-(line 151,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.CircleProblem.Anonymous-0ad5cf72-5a72-451b-9223-cb8a47ff01ae.value(double[])",
      "begin_line": 148,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 17)-(line 149,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.CircleProblem.jacobian(double[])",
      "begin_line": 154,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 69)",
        "(line 157,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 171,col 24)"
      ]
    }
  ]
}