{
  "filepath": "/tmp/Math-23b/src/test/java/org/apache/commons/math3/optimization/general/CircleProblem.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CircleProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction"
      ],
      "begin_line": 40,
      "end_line": 172,
      "comment": "\n * Class that models a circle.\n * The parameters of problem are:\n * \u003cul\u003e\n *  \u003cli\u003ethe x-coordinate of the circle center,\u003c/li\u003e\n *  \u003cli\u003ethe y-coordinate of the circle center,\u003c/li\u003e\n *  \u003cli\u003ethe radius of the circle.\u003c/li\u003e\n * \u003c/ul\u003e\n * The model functions are:\n * \u003cul\u003e\n *  \u003cli\u003efor each triplet (cx, cy, r), the (x, y) coordinates of a point on the\n *   corresponding circle.\u003c/li\u003e\n * \u003c/ul\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Cloud of points assumed to be fitted by a circle. "
    },
    {
      "type": "field",
      "varNames": [
        "xSigma"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Error on the x-coordinate of the points. "
    },
    {
      "type": "field",
      "varNames": [
        "ySigma"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Error on the y-coordinate of the points. "
    },
    {
      "type": "field",
      "varNames": [
        "resolution"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Number of points on the circumference (when searching which\n        model point is closest to a given \"observation\". "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.CircleProblem.CircleProblem(double, double, int)",
      "begin_line": 57,
      "end_line": 64,
      "comment": "\n     * @param xError Assumed error for the x-coordinate of the circle points.\n     * @param yError Assumed error for the y-coordinate of the circle points.\n     * @param searchResolution Number of points to try when searching the one\n     * that is closest to a given \"observed\" point.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 43)",
        "(line 61,col 9)-(line 61,col 24)",
        "(line 62,col 9)-(line 62,col 24)",
        "(line 63,col 9)-(line 63,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.CircleProblem.CircleProblem(double, double)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * @param xError Assumed error for the x-coordinate of the circle points.\n     * @param yError Assumed error for the y-coordinate of the circle points.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.CircleProblem.addPoint(double, double)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.CircleProblem.target()",
      "begin_line": 79,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 57)",
        "(line 81,col 9)-(line 86,col 9)",
        "(line 88,col 9)-(line 88,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.CircleProblem.weight()",
      "begin_line": 91,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 48)",
        "(line 93,col 9)-(line 93,col 48)",
        "(line 94,col 9)-(line 94,col 57)",
        "(line 95,col 9)-(line 99,col 9)",
        "(line 101,col 9)-(line 101,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.CircleProblem.value(double[])",
      "begin_line": 104,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 36)",
        "(line 106,col 9)-(line 106,col 36)",
        "(line 107,col 9)-(line 107,col 35)",
        "(line 109,col 9)-(line 109,col 61)",
        "(line 111,col 9)-(line 111,col 64)",
        "(line 112,col 9)-(line 140,col 9)",
        "(line 142,col 9)-(line 142,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.CircleProblem.jacobian()",
      "begin_line": 145,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 150,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.CircleProblem.Anonymous-970e9023-bd52-4dfa-a366-92f135edfd55.value(double[])",
      "begin_line": 147,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 148,col 17)-(line 148,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.CircleProblem.jacobian(double[])",
      "begin_line": 153,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 69)",
        "(line 156,col 9)-(line 168,col 9)",
        "(line 170,col 9)-(line 170,col 24)"
      ]
    }
  ]
}