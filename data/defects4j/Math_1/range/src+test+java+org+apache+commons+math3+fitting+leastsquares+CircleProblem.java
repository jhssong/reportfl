{
  "filepath": "/tmp/Math-1b/src/test/java/org/apache/commons/math3/fitting/leastsquares/CircleProblem.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CircleProblem",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 175,
      "comment": "\n * Class that models a circle.\n * The parameters of problem are:\n * \u003cul\u003e\n *  \u003cli\u003ethe x-coordinate of the circle center,\u003c/li\u003e\n *  \u003cli\u003ethe y-coordinate of the circle center,\u003c/li\u003e\n *  \u003cli\u003ethe radius of the circle.\u003c/li\u003e\n * \u003c/ul\u003e\n * The model functions are:\n * \u003cul\u003e\n *  \u003cli\u003efor each triplet (cx, cy, r), the (x, y) coordinates of a point on the\n *   corresponding circle.\u003c/li\u003e\n * \u003c/ul\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Cloud of points assumed to be fitted by a circle. "
    },
    {
      "type": "field",
      "varNames": [
        "xSigma"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Error on the x-coordinate of the points. "
    },
    {
      "type": "field",
      "varNames": [
        "ySigma"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Error on the y-coordinate of the points. "
    },
    {
      "type": "field",
      "varNames": [
        "resolution"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Number of points on the circumference (when searching which\n        model point is closest to a given \"observation\". "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fitting.leastsquares.CircleProblem.CircleProblem(double, double, int)",
      "begin_line": 56,
      "end_line": 63,
      "comment": "\n     * @param xError Assumed error for the x-coordinate of the circle points.\n     * @param yError Assumed error for the y-coordinate of the circle points.\n     * @param searchResolution Number of points to try when searching the one\n     * that is closest to a given \"observed\" point.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 43)",
        "(line 60,col 9)-(line 60,col 24)",
        "(line 61,col 9)-(line 61,col 24)",
        "(line 62,col 9)-(line 62,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fitting.leastsquares.CircleProblem.CircleProblem(double, double)",
      "begin_line": 69,
      "end_line": 72,
      "comment": "\n     * @param xError Assumed error for the x-coordinate of the circle points.\n     * @param yError Assumed error for the y-coordinate of the circle points.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.CircleProblem.addPoint(double, double)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.CircleProblem.target()",
      "begin_line": 78,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 57)",
        "(line 80,col 9)-(line 85,col 9)",
        "(line 87,col 9)-(line 87,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.CircleProblem.weight()",
      "begin_line": 90,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 48)",
        "(line 92,col 9)-(line 92,col 48)",
        "(line 93,col 9)-(line 93,col 57)",
        "(line 94,col 9)-(line 98,col 9)",
        "(line 100,col 9)-(line 100,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.CircleProblem.getModelFunction()",
      "begin_line": 103,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 145,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.CircleProblem.Anonymous-fceab02f-e0c5-47df-ae70-790fbf1e7e70.value(double[])",
      "begin_line": 105,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 106,col 17)-(line 106,col 44)",
        "(line 107,col 17)-(line 107,col 44)",
        "(line 108,col 17)-(line 108,col 43)",
        "(line 110,col 17)-(line 110,col 69)",
        "(line 112,col 17)-(line 112,col 72)",
        "(line 113,col 17)-(line 141,col 17)",
        "(line 143,col 17)-(line 143,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.CircleProblem.getModelFunctionJacobian()",
      "begin_line": 148,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 153,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.CircleProblem.Anonymous-12d1da82-1b83-461c-87c7-598bbfa2e293.value(double[])",
      "begin_line": 150,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 151,col 17)-(line 151,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.CircleProblem.jacobian(double[])",
      "begin_line": 156,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 69)",
        "(line 159,col 9)-(line 171,col 9)",
        "(line 173,col 9)-(line 173,col 24)"
      ]
    }
  ]
}