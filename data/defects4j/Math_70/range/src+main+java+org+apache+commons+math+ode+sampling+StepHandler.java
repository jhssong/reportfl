{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/ode/sampling/StepHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StepHandler",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepHandler.requiresDenseOutput()",
      "begin_line": 52,
      "end_line": 52,
      "comment": " Determines whether this handler needs dense output.\n   * \u003cp\u003eThis method allows the integrator to avoid performing extra\n   * computation if the handler does not need dense output. If this\n   * method returns false, the integrator will call the {@link\n   * #handleStep} method with a {@link DummyStepInterpolator} rather\n   * than a custom interpolator.\u003c/p\u003e\n   * @return true if the handler needs dense output\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepHandler.reset()",
      "begin_line": 58,
      "end_line": 58,
      "comment": " Reset the step handler.\n   * Initialize the internal data as required before the first step is\n   * handled.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n   * Handle the last accepted step\n   * @param interpolator interpolator for the last accepted step. For\n   * efficiency purposes, the various integrators reuse the same\n   * object on each call, so if the instance wants to keep it across\n   * all calls (for example to provide at the end of the integration a\n   * continuous model valid throughout the integration range, as the\n   * {@link org.apache.commons.math.ode.ContinuousOutputModel\n   * ContinuousOutputModel} class does), it should build a local copy\n   * using the clone method of the interpolator and store this copy.\n   * Keeping only a reference to the interpolator and reusing it will\n   * result in unpredictable behavior (potentially crashing the application).\n   * @param isLast true if the step is the last one\n   * @throws DerivativeException this exception is propagated to the\n   * caller if the underlying user function triggers one\n   ",
      "child_ranges": []
    }
  ]
}