{
  "filepath": "/tmp/Math-104b/src/java/org/apache/commons/math/ode/StepNormalizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StepNormalizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.StepHandler"
      ],
      "begin_line": 49,
      "end_line": 157,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.StepNormalizer.StepNormalizer(double, org.apache.commons.math.ode.FixedStepHandler)",
      "begin_line": 56,
      "end_line": 60,
      "comment": " Simple constructor.\n   * @param h fixed time step (sign is not used)\n   * @param handler fixed time step handler to wrap\n   ",
      "child_ranges": [
        "(line 57,col 5)-(line 57,col 31)",
        "(line 58,col 5)-(line 58,col 27)",
        "(line 59,col 5)-(line 59,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.StepNormalizer.requiresDenseOutput()",
      "begin_line": 68,
      "end_line": 70,
      "comment": " Determines whether this handler needs dense output.\n   * This handler needs dense output in order to provide data at\n   * regularly spaced steps regardless of the steps the integrator\n   * uses, so this method always returns true.\n   * @return always true\n   ",
      "child_ranges": [
        "(line 69,col 5)-(line 69,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.StepNormalizer.reset()",
      "begin_line": 76,
      "end_line": 80,
      "comment": " Reset the step handler.\n   * Initialize the internal data as required before the first step is\n   * handled.\n   ",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 27)",
        "(line 78,col 5)-(line 78,col 21)",
        "(line 79,col 5)-(line 79,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.StepNormalizer.handleStep(org.apache.commons.math.ode.StepInterpolator, boolean)",
      "begin_line": 95,
      "end_line": 140,
      "comment": "\n   * Handle the last accepted step\n   * @param interpolator interpolator for the last accepted step. For\n   * efficiency purposes, the various integrators reuse the same\n   * object on each call, so if the instance wants to keep it across\n   * all calls (for example to provide at the end of the integration a\n   * continuous model valid throughout the integration range), it\n   * should build a local copy using the clone method and store this\n   * copy.\n   * @param isLast true if the step is the last one\n   * @throws DerivativeException this exception is propagated to the\n   * caller if the underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 98,col 5)-(line 98,col 20)",
        "(line 100,col 5)-(line 114,col 5)",
        "(line 116,col 5)-(line 116,col 28)",
        "(line 117,col 5)-(line 117,col 78)",
        "(line 118,col 5)-(line 132,col 5)",
        "(line 134,col 5)-(line 138,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "h"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": " Fixed time step. "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": " Underlying step handler. "
    },
    {
      "type": "field",
      "varNames": [
        "lastTime"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": " Last step time. "
    },
    {
      "type": "field",
      "varNames": [
        "lastState"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": " Last State vector. "
    },
    {
      "type": "field",
      "varNames": [
        "forward"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": " Integration direction indicator. "
    }
  ]
}