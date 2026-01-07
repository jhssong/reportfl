{
  "filepath": "/tmp/Math-104b/src/java/org/apache/commons/math/ode/FirstOrderIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FirstOrderIntegrator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegrator.getName()",
      "begin_line": 41,
      "end_line": 41,
      "comment": " Get the name of the method.\n   * @return name of the method\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegrator.setStepHandler(org.apache.commons.math.ode.StepHandler)",
      "begin_line": 48,
      "end_line": 48,
      "comment": " Set the step handler for this integrator.\n   * The handler will be called by the integrator for each accepted\n   * step.\n   * @param handler handler for the accepted steps\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegrator.getStepHandler()",
      "begin_line": 53,
      "end_line": 53,
      "comment": " Get the step handler for this integrator.\n   * @return the step handler for this integrator\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegrator.addSwitchingFunction(org.apache.commons.math.ode.SwitchingFunction, double, double)",
      "begin_line": 62,
      "end_line": 64,
      "comment": " Add a switching function to the integrator.\n   * @param function switching function\n   * @param maxCheckInterval maximal time interval between switching\n   * function checks (this interval prevents missing sign changes in\n   * case the integration steps becomes very large)\n   * @param convergence convergence threshold in the event time search\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 78,
      "end_line": 81,
      "comment": " Integrate the differential equations up to the given time\n   * @param equations differential equations to integrate\n   * @param t0 initial time\n   * @param y0 initial value of the state vector at t0\n   * @param t target time for the integration\n   * (can be set to a value smaller thant \u003ccode\u003et0\u003c/code\u003e for backward integration)\n   * @param y placeholder where to put the state vector at each successful\n   *  step (and hence at the end of integration), can be the same object as y0\n   * @throws IntegratorException if the integrator cannot perform integration\n   * @throws DerivativeException this exception is propagated to the caller if\n   * the underlying user function triggers one\n   ",
      "child_ranges": []
    }
  ]
}