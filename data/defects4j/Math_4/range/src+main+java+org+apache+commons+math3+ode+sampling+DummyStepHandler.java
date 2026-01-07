{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/sampling/DummyStepHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DummyStepHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.sampling.StepHandler"
      ],
      "begin_line": 37,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.sampling.DummyStepHandler.DummyStepHandler()",
      "begin_line": 43,
      "end_line": 44,
      "comment": " Private constructor.\n     * The constructor is private to prevent users from creating\n     * instances (Singleton design-pattern).\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.DummyStepHandler.getInstance()",
      "begin_line": 49,
      "end_line": 51,
      "comment": " Get the only instance.\n     * @return the only instance\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.DummyStepHandler.init(double, double[], double)",
      "begin_line": 54,
      "end_line": 55,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.DummyStepHandler.handleStep(org.apache.commons.math3.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 69,
      "end_line": 70,
      "comment": "\n     * Handle the last accepted step.\n     * This method does nothing in this class.\n     * @param interpolator interpolator for the last accepted step. For\n     * efficiency purposes, the various integrators reuse the same\n     * object on each call, so if the instance wants to keep it across\n     * all calls (for example to provide at the end of the integration a\n     * continuous model valid throughout the integration range), it\n     * should build a local copy using the clone method and store this\n     * copy.\n     * @param isLast true if the step is the last one\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "LazyHolder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 76,
      "end_line": 79,
      "comment": " Holder for the instance.\n     * \u003cp\u003eWe use here the Initialization On Demand Holder Idiom.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Cached field instance. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.DummyStepHandler.readResolve()",
      "begin_line": 85,
      "end_line": 88,
      "comment": " Handle deserialization of the singleton.\n     * @return the singleton instance\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 35)"
      ]
    }
  ]
}