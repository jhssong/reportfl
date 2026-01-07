{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/ode/jacobians/StepHandlerWithJacobians.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StepHandlerWithJacobians",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 62,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.StepHandlerWithJacobians.requiresDenseOutput()",
      "begin_line": 69,
      "end_line": 69,
      "comment": " Determines whether this handler needs dense output.\n   * \u003cp\u003eThis method allows the integrator to avoid performing extra\n   * computation if the handler does not need dense output.\u003c/p\u003e\n   * @return true if the handler needs dense output\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.StepHandlerWithJacobians.reset()",
      "begin_line": 75,
      "end_line": 75,
      "comment": " Reset the step handler.\n   * Initialize the internal data as required before the first step is\n   * handled.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.StepHandlerWithJacobians.handleStep(org.apache.commons.math.ode.jacobians.StepInterpolatorWithJacobians, boolean)",
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n   * Handle the last accepted step\n   * @param interpolator interpolator for the last accepted step. For\n   * efficiency purposes, the various integrators reuse the same\n   * object on each call, so if the instance wants to keep it across\n   * all calls (for example to provide at the end of the integration a\n   * continuous model valid throughout the integration range, as the\n   * {@link org.apache.commons.math.ode.ContinuousOutputModel\n   * ContinuousOutputModel} class does), it should build a local copy\n   * using the clone method of the interpolator and store this copy.\n   * Keeping only a reference to the interpolator and reusing it will\n   * result in unpredictable behavior (potentially crashing the application).\n   * @param isLast true if the step is the last one\n   * @throws DerivativeException this exception is propagated to the\n   * caller if the underlying user function triggers one\n   ",
      "child_ranges": []
    }
  ]
}