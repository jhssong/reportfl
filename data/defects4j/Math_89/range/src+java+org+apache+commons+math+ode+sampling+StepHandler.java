{
  "filepath": "/tmp/Math-89b/src/java/org/apache/commons/math/ode/sampling/StepHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StepHandler",
      "is_interface": true,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 47,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepHandler.requiresDenseOutput()",
      "begin_line": 57,
      "end_line": 57,
      "comment": " Determines whether this handler needs dense output.\n   * \u003cp\u003eThis method allows the integrator to avoid performing extra\n   * computation if the handler does not need dense output. If this\n   * method returns false, the integrator will call the {@link\n   * #handleStep} method with a {@link DummyStepInterpolator} rather\n   * than a custom interpolator.\u003c/p\u003e\n   * @return true if the handler needs dense output\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepHandler.reset()",
      "begin_line": 63,
      "end_line": 63,
      "comment": " Reset the step handler.\n   * Initialize the internal data as required before the first step is\n   * handled.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 81,
      "end_line": 82,
      "comment": "\n   * Handle the last accepted step\n   * @param interpolator interpolator for the last accepted step. For\n   * efficiency purposes, the various integrators reuse the same\n   * object on each call, so if the instance wants to keep it across\n   * all calls (for example to provide at the end of the integration a\n   * continuous model valid throughout the integration range, as the\n   * {@link ContinuousOutputModel ContinuousOutputModel} class does),\n   * it should build a local copy using the clone method of the\n   * interpolator and store this copy. Keeping only a reference to the\n   * interpolator and reusing it will result in unpredictable\n   * behaviour (potentially crashing the application).\n   * @param isLast true if the step is the last one\n   * @throws DerivativeException this exception is propagated to the\n   * caller if the underlying user function triggers one\n   ",
      "child_ranges": []
    }
  ]
}