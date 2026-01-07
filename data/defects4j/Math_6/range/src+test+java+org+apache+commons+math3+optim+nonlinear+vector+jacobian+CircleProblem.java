{
  "filepath": "/tmp/Math-6b/src/test/java/org/apache/commons/math3/optim/nonlinear/vector/jacobian/CircleProblem.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CircleProblem",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 177,
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
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.CircleProblem.CircleProblem(double, double, int)",
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
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.CircleProblem.CircleProblem(double, double)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * @param xError Assumed error for the x-coordinate of the circle points.\n     * @param yError Assumed error for the y-coordinate of the circle points.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.CircleProblem.addPoint(double, double)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.CircleProblem.target()",
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
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.CircleProblem.weight()",
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
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.CircleProblem.getModelFunction()",
      "begin_line": 105,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 147,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.CircleProblem.Anonymous-5ac18f0a-db70-4c9a-b422-009615efa897.value(double[])",
      "begin_line": 107,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 108,col 21)-(line 108,col 48)",
        "(line 109,col 21)-(line 109,col 48)",
        "(line 110,col 21)-(line 110,col 47)",
        "(line 112,col 21)-(line 112,col 73)",
        "(line 114,col 21)-(line 114,col 76)",
        "(line 115,col 21)-(line 143,col 21)",
        "(line 145,col 21)-(line 145,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.CircleProblem.getModelFunctionJacobian()",
      "begin_line": 150,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 151,col 9)-(line 155,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.CircleProblem.Anonymous-4248a7c6-f0f2-4cbc-89dd-bf1247e417d1.value(double[])",
      "begin_line": 152,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 21)-(line 153,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.CircleProblem.jacobian(double[])",
      "begin_line": 158,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 69)",
        "(line 161,col 9)-(line 173,col 9)",
        "(line 175,col 9)-(line 175,col 24)"
      ]
    }
  ]
}