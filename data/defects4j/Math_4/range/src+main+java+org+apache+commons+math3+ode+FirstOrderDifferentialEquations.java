{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/FirstOrderDifferentialEquations.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FirstOrderDifferentialEquations",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 52,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.FirstOrderDifferentialEquations.getDimension()",
      "begin_line": 57,
      "end_line": 57,
      "comment": " Get the dimension of the problem.\n     * @return dimension of the problem\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.FirstOrderDifferentialEquations.computeDerivatives(double, double[], double[])",
      "begin_line": 66,
      "end_line": 67,
      "comment": " Get the current time derivative of the state vector.\n     * @param t current value of the independent \u003cI\u003etime\u003c/I\u003e variable\n     * @param y array containing the current value of the state vector\n     * @param yDot placeholder array where to put the time derivative of the state vector\n     * @exception MaxCountExceededException if the number of functions evaluations is exceeded\n     * @exception DimensionMismatchException if arrays dimensions do not match equations settings\n     ",
      "child_ranges": []
    }
  ]
}