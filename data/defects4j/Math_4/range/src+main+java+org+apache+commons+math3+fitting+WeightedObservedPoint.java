{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/fitting/WeightedObservedPoint.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WeightedObservedPoint",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 28,
      "end_line": 78,
      "comment": "\n * This class is a simple container for weighted observed point in\n * {@link CurveFitter curve fitting}.\n * \u003cp\u003eInstances of this class are guaranteed to be immutable.\u003c/p\u003e\n * @version $Id: WeightedObservedPoint.java 1416643 2012-12-03 19:37:14Z tn $\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " Serializable version id. "
    },
    {
      "type": "field",
      "varNames": [
        "weight"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Weight of the measurement in the fitting process. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Abscissa of the point. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Observed value of the function at x. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fitting.WeightedObservedPoint.WeightedObservedPoint(double, double, double)",
      "begin_line": 45,
      "end_line": 49,
      "comment": "\n     * Simple constructor.\n     *\n     * @param weight Weight of the measurement in the fitting process.\n     * @param x Abscissa of the measurement.\n     * @param y Ordinate of the measurement.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 29)",
        "(line 47,col 9)-(line 47,col 24)",
        "(line 48,col 9)-(line 48,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.WeightedObservedPoint.getWeight()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Gets the weight of the measurement in the fitting process.\n     *\n     * @return the weight of the measurement in the fitting process.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.WeightedObservedPoint.getX()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Gets the abscissa of the point.\n     *\n     * @return the abscissa of the point.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.WeightedObservedPoint.getY()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Gets the observed value of the function at x.\n     *\n     * @return the observed value of the function at x.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 17)"
      ]
    }
  ]
}