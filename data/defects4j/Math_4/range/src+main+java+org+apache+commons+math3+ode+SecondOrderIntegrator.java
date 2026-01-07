{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/SecondOrderIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SecondOrderIntegrator",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math3.ode.ODEIntegrator"
      ],
      "begin_line": 37,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.SecondOrderIntegrator.integrate(org.apache.commons.math3.ode.SecondOrderDifferentialEquations, double, double[], double[], double, double[], double[])",
      "begin_line": 56,
      "end_line": 59,
      "comment": " Integrate the differential equations up to the given time\n   * @param equations differential equations to integrate\n   * @param t0 initial time\n   * @param y0 initial value of the state vector at t0\n   * @param yDot0 initial value of the first derivative of the state\n   * vector at t0\n   * @param t target time for the integration\n   * (can be set to a value smaller thant \u003ccode\u003et0\u003c/code\u003e for backward integration)\n   * @param y placeholder where to put the state vector at each\n   * successful step (and hence at the end of integration), can be the\n   * same object as y0\n   * @param yDot placeholder where to put the first derivative of\n   * the state vector at time t, can be the same object as yDot0\n   * @throws MathIllegalStateException if the integrator cannot perform integration\n   * @throws MathIllegalArgumentException if integration parameters are wrong (typically\n   * too small integration span)\n   ",
      "child_ranges": []
    }
  ]
}