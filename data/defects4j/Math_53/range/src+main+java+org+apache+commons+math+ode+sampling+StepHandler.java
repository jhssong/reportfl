{
  "filepath": "/tmp/Math-53b/src/main/java/org/apache/commons/math/ode/sampling/StepHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StepHandler",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepHandler.reset()",
      "begin_line": 48,
      "end_line": 48,
      "comment": " Reset the step handler.\n   * Initialize the internal data as required before the first step is\n   * handled.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n   * Handle the last accepted step\n   * @param interpolator interpolator for the last accepted step. For\n   * efficiency purposes, the various integrators reuse the same\n   * object on each call, so if the instance wants to keep it across\n   * all calls (for example to provide at the end of the integration a\n   * continuous model valid throughout the integration range, as the\n   * {@link org.apache.commons.math.ode.ContinuousOutputModel\n   * ContinuousOutputModel} class does), it should build a local copy\n   * using the clone method of the interpolator and store this copy.\n   * Keeping only a reference to the interpolator and reusing it will\n   * result in unpredictable behavior (potentially crashing the application).\n   * @param isLast true if the step is the last one\n   * @exception MathUserException if user code called from step interpolator\n   * finalization triggers one\n   ",
      "child_ranges": []
    }
  ]
}