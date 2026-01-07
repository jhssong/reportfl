{
  "filepath": "/tmp/Math-45b/src/main/java/org/apache/commons/math/ode/sampling/DummyStepHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DummyStepHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 37,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepHandler.DummyStepHandler()",
      "begin_line": 43,
      "end_line": 44,
      "comment": " Private constructor.\n     * The constructor is private to prevent users from creating\n     * instances (Singleton design-pattern).\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepHandler.getInstance()",
      "begin_line": 49,
      "end_line": 51,
      "comment": " Get the only instance.\n     * @return the only instance\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepHandler.reset()",
      "begin_line": 57,
      "end_line": 58,
      "comment": " Reset the step handler.\n     * Initialize the internal data as required before the first step is\n     * handled.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 72,
      "end_line": 73,
      "comment": "\n     * Handle the last accepted step.\n     * This method does nothing in this class.\n     * @param interpolator interpolator for the last accepted step. For\n     * efficiency purposes, the various integrators reuse the same\n     * object on each call, so if the instance wants to keep it across\n     * all calls (for example to provide at the end of the integration a\n     * continuous model valid throughout the integration range), it\n     * should build a local copy using the clone method and store this\n     * copy.\n     * @param isLast true if the step is the last one\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "LazyHolder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 79,
      "end_line": 82,
      "comment": " Holder for the instance.\n     * \u003cp\u003eWe use here the Initialization On Demand Holder Idiom.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Cached field instance. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepHandler.readResolve()",
      "begin_line": 88,
      "end_line": 91,
      "comment": " Handle deserialization of the singleton.\n     * @return the singleton instance\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 35)"
      ]
    }
  ]
}