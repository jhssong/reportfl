{
  "filepath": "/tmp/Math-93b/src/java/org/apache/commons/math/ode/sampling/DummyStepHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DummyStepHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler",
        "java.io.Serializable"
      ],
      "begin_line": 39,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepHandler.DummyStepHandler()",
      "begin_line": 46,
      "end_line": 47,
      "comment": " Private constructor.\n   * The constructor is private to prevent users from creating\n   * instances (Singleton design-pattern).\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepHandler.getInstance()",
      "begin_line": 52,
      "end_line": 54,
      "comment": " Get the only instance.\n   * @return the only instance\n   ",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepHandler.requiresDenseOutput()",
      "begin_line": 60,
      "end_line": 62,
      "comment": " Determines whether this handler needs dense output.\n   * Since this handler does nothing, it does not require dense output.\n   * @return always false\n   ",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepHandler.reset()",
      "begin_line": 68,
      "end_line": 69,
      "comment": " Reset the step handler.\n   * Initialize the internal data as required before the first step is\n   * handled.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepHandler.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 83,
      "end_line": 84,
      "comment": "\n   * Handle the last accepted step.\n   * This method does nothing in this class.\n   * @param interpolator interpolator for the last accepted step. For\n   * efficiency purposes, the various integrators reuse the same\n   * object on each call, so if the instance wants to keep it across\n   * all calls (for example to provide at the end of the integration a\n   * continuous model valid throughout the integration range), it\n   * should build a local copy using the clone method and store this\n   * copy.\n   * @param isLast true if the step is the last one\n   ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "instance"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " The only instance. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Serializable version identifier "
    }
  ]
}