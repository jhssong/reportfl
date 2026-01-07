{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/ode/sampling/FixedStepHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FixedStepHandler",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.FixedStepHandler.handleStep(double, double[], double[], boolean)",
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n   * Handle the last accepted step\n   * @param t time of the current step\n   * @param y state vector at t. For efficiency purposes, the {@link\n   * StepNormalizer} class reuses the same array on each call, so if\n   * the instance wants to keep it across all calls (for example to\n   * provide at the end of the integration a complete array of all\n   * steps), it should build a local copy store this copy.\n   * @param yDot derivatives of the state vector state vector at t.\n   * For efficiency purposes, the {@link StepNormalizer} class reuses\n   * the same array on each call, so if\n   * the instance wants to keep it across all calls (for example to\n   * provide at the end of the integration a complete array of all\n   * steps), it should build a local copy store this copy.\n   * @param isLast true if the step is the last one\n   * @throws DerivativeException if some error condition is encountered\n   ",
      "child_ranges": []
    }
  ]
}