{
  "filepath": "/tmp/Math-104b/src/java/org/apache/commons/math/ode/FixedStepHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FixedStepHandler",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FixedStepHandler.handleStep(double, double[], boolean)",
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n   * Handle the last accepted step\n   * @param t time of the current step\n\n   * @param y state vector at t. For efficiency purposes, the {@link\n   * StepNormalizer} class reuse the same array on each call, so if\n   * the instance wants to keep it across all calls (for example to\n   * provide at the end of the integration a complete array of all\n   * steps), it should build a local copy store this copy.\n\n   * @param isLast true if the step is the last one\n   ",
      "child_ranges": []
    }
  ]
}