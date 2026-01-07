{
  "filepath": "/tmp/Math-26b/src/main/java/org/apache/commons/math3/ode/sampling/StepHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StepHandler",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepHandler.init(double, double[], double)",
      "begin_line": 53,
      "end_line": 53,
      "comment": " Initialize step handler at the start of an ODE integration.\n     * \u003cp\u003e\n     * This method is called once at the start of the integration. It\n     * may be used by the step handler to initialize some internal data\n     * if needed.\n     * \u003c/p\u003e\n     * @param t0 start value of the independent \u003ci\u003etime\u003c/i\u003e variable\n     * @param y0 array containing the start value of the state vector\n     * @param t target time for the integration\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepHandler.handleStep(org.apache.commons.math3.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * Handle the last accepted step\n     * @param interpolator interpolator for the last accepted step. For\n     * efficiency purposes, the various integrators reuse the same\n     * object on each call, so if the instance wants to keep it across\n     * all calls (for example to provide at the end of the integration a\n     * continuous model valid throughout the integration range, as the\n     * {@link org.apache.commons.math3.ode.ContinuousOutputModel\n     * ContinuousOutputModel} class does), it should build a local copy\n     * using the clone method of the interpolator and store this copy.\n     * Keeping only a reference to the interpolator and reusing it will\n     * result in unpredictable behavior (potentially crashing the application).\n     * @param isLast true if the step is the last one\n     ",
      "child_ranges": []
    }
  ]
}