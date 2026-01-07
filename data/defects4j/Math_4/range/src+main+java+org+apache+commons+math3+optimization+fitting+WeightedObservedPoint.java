{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/fitting/WeightedObservedPoint.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WeightedObservedPoint",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 76,
      "comment": " This class is a simple container for weighted observed point in\n * {@link CurveFitter curve fitting}.\n * \u003cp\u003eInstances of this class are guaranteed to be immutable.\u003c/p\u003e\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serializable version id. "
    },
    {
      "type": "field",
      "varNames": [
        "weight"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Weight of the measurement in the fitting process. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Abscissa of the point. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Observed value of the function at x. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.fitting.WeightedObservedPoint.WeightedObservedPoint(double, double, double)",
      "begin_line": 49,
      "end_line": 53,
      "comment": " Simple constructor.\n     * @param weight weight of the measurement in the fitting process\n     * @param x abscissa of the measurement\n     * @param y ordinate of the measurement\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 29)",
        "(line 51,col 9)-(line 51,col 24)",
        "(line 52,col 9)-(line 52,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.WeightedObservedPoint.getWeight()",
      "begin_line": 58,
      "end_line": 60,
      "comment": " Get the weight of the measurement in the fitting process.\n     * @return weight of the measurement in the fitting process\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.WeightedObservedPoint.getX()",
      "begin_line": 65,
      "end_line": 67,
      "comment": " Get the abscissa of the point.\n     * @return abscissa of the point\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.WeightedObservedPoint.getY()",
      "begin_line": 72,
      "end_line": 74,
      "comment": " Get the observed value of the function at x.\n     * @return observed value of the function at x\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 17)"
      ]
    }
  ]
}