{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/ode/FirstOrderIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FirstOrderIntegrator",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math.ode.ODEIntegrator"
      ],
      "begin_line": 35,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 56,
      "end_line": 58,
      "comment": " Integrate the differential equations up to the given time.\n   * \u003cp\u003eThis method solves an Initial Value Problem (IVP).\u003c/p\u003e\n   * \u003cp\u003eSince this method stores some internal state variables made\n   * available in its public interface during integration ({@link\n   * #getCurrentSignedStepsize()}), it is \u003cem\u003enot\u003c/em\u003e thread-safe.\u003c/p\u003e\n   * @param equations differential equations to integrate\n   * @param t0 initial time\n   * @param y0 initial value of the state vector at t0\n   * @param t target time for the integration\n   * (can be set to a value smaller than \u003ccode\u003et0\u003c/code\u003e for backward integration)\n   * @param y placeholder where to put the state vector at each successful\n   *  step (and hence at the end of integration), can be the same object as y0\n   * @return stop time, will be the same as target time if integration reached its\n   * target, but may be different if some {@link\n   * org.apache.commons.math.ode.events.EventHandler} stops it at some point.\n   * @throws IntegratorException if the integrator cannot perform integration\n   * @throws DerivativeException this exception is propagated to the caller if\n   * the underlying user function triggers one\n   ",
      "child_ranges": []
    }
  ]
}