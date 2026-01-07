{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/sampling/FixedStepHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FixedStepHandler",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.FixedStepHandler.init(double, double[], double)",
      "begin_line": 52,
      "end_line": 52,
      "comment": " Initialize step handler at the start of an ODE integration.\n   * \u003cp\u003e\n   * This method is called once at the start of the integration. It\n   * may be used by the step handler to initialize some internal data\n   * if needed.\n   * \u003c/p\u003e\n   * @param t0 start value of the independent \u003ci\u003etime\u003c/i\u003e variable\n   * @param y0 array containing the start value of the state vector\n   * @param t target time for the integration\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.FixedStepHandler.handleStep(double, double[], double[], boolean)",
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n   * Handle the last accepted step\n   * @param t time of the current step\n   * @param y state vector at t. For efficiency purposes, the {@link\n   * StepNormalizer} class reuses the same array on each call, so if\n   * the instance wants to keep it across all calls (for example to\n   * provide at the end of the integration a complete array of all\n   * steps), it should build a local copy store this copy.\n   * @param yDot derivatives of the state vector state vector at t.\n   * For efficiency purposes, the {@link StepNormalizer} class reuses\n   * the same array on each call, so if\n   * the instance wants to keep it across all calls (for example to\n   * provide at the end of the integration a complete array of all\n   * steps), it should build a local copy store this copy.\n   * @param isLast true if the step is the last one\n   ",
      "child_ranges": []
    }
  ]
}