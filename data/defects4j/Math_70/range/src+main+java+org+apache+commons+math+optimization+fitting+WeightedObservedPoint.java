{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/optimization/fitting/WeightedObservedPoint.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WeightedObservedPoint",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 28,
      "end_line": 74,
      "comment": " This class is a simple container for weighted observed point in\n * {@link CurveFitter curve fitting}.\n * \u003cp\u003eInstances of this class are guaranteed to be immutable.\u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Serializable version id. "
    },
    {
      "type": "field",
      "varNames": [
        "weight"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Weight of the measurement in the fitting process. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Abscissa of the point. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Observed value of the function at x. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.WeightedObservedPoint.WeightedObservedPoint(double, double, double)",
      "begin_line": 47,
      "end_line": 51,
      "comment": " Simple constructor.\n     * @param weight weight of the measurement in the fitting process\n     * @param x abscissa of the measurement\n     * @param y ordinate of the measurement\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 29)",
        "(line 49,col 9)-(line 49,col 24)",
        "(line 50,col 9)-(line 50,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.WeightedObservedPoint.getWeight()",
      "begin_line": 56,
      "end_line": 58,
      "comment": " Get the weight of the measurement in the fitting process.\n     * @return weight of the measurement in the fitting process\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.WeightedObservedPoint.getX()",
      "begin_line": 63,
      "end_line": 65,
      "comment": " Get the abscissa of the point.\n     * @return abscissa of the point\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.WeightedObservedPoint.getY()",
      "begin_line": 70,
      "end_line": 72,
      "comment": " Get the observed value of the function at x.\n     * @return observed value of the function at x\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 17)"
      ]
    }
  ]
}