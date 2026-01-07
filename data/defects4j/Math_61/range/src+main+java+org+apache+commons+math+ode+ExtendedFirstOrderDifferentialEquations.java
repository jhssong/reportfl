{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/ode/ExtendedFirstOrderDifferentialEquations.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExtendedFirstOrderDifferentialEquations",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderDifferentialEquations"
      ],
      "begin_line": 51,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ExtendedFirstOrderDifferentialEquations.getMainSetDimension()",
      "begin_line": 64,
      "end_line": 64,
      "comment": " Return the dimension of the main set of equations.\n     * \u003cp\u003e\n     * The main set of equations represent the first part of an ODE state.\n     * The error estimations and adaptive step size computation should be\n     * done on this first part only, not on the final part of the state\n     * which represent an extension set of equations which are considered\n     * secondary.\n     * \u003c/p\u003e\n     * @return dimension of the main set of equations, must be lesser than or\n     * equal to the {@link #getDimension() total dimension}\n     ",
      "child_ranges": []
    }
  ]
}