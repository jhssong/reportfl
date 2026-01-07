{
  "filepath": "/tmp/Math-103b/src/java/org/apache/commons/math/ode/DummyStepHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DummyStepHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.StepHandler"
      ],
      "begin_line": 38,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DummyStepHandler.DummyStepHandler()",
      "begin_line": 45,
      "end_line": 46,
      "comment": " Private constructor.\n   * The constructor is private to prevent users from creating\n   * instances (Singleton design-pattern).\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DummyStepHandler.getInstance()",
      "begin_line": 51,
      "end_line": 56,
      "comment": " Get the only instance.\n   * @return the only instance\n   ",
      "child_ranges": [
        "(line 52,col 5)-(line 54,col 5)",
        "(line 55,col 5)-(line 55,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DummyStepHandler.requiresDenseOutput()",
      "begin_line": 62,
      "end_line": 64,
      "comment": " Determines whether this handler needs dense output.\n   * Since this handler does nothing, it does not require dense output.\n   * @return always false\n   ",
      "child_ranges": [
        "(line 63,col 5)-(line 63,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DummyStepHandler.reset()",
      "begin_line": 70,
      "end_line": 71,
      "comment": " Reset the step handler.\n   * Initialize the internal data as required before the first step is\n   * handled.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DummyStepHandler.handleStep(org.apache.commons.math.ode.StepInterpolator, boolean)",
      "begin_line": 85,
      "end_line": 86,
      "comment": "\n   * Handle the last accepted step.\n   * This method does nothing in this class.\n   * @param interpolator interpolator for the last accepted step. For\n   * efficiency purposes, the various integrators reuse the same\n   * object on each call, so if the instance wants to keep it across\n   * all calls (for example to provide at the end of the integration a\n   * continuous model valid throughout the integration range), it\n   * should build a local copy using the clone method and store this\n   * copy.\n   * @param isLast true if the step is the last one\n   ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "instance"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " The only instance. "
    }
  ]
}