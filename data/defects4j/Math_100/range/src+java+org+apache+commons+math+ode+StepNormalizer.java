{
  "filepath": "/tmp/Math-100b/src/java/org/apache/commons/math/ode/StepNormalizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StepNormalizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.StepHandler"
      ],
      "begin_line": 48,
      "end_line": 156,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.StepNormalizer.StepNormalizer(double, org.apache.commons.math.ode.FixedStepHandler)",
      "begin_line": 55,
      "end_line": 59,
      "comment": " Simple constructor.\n   * @param h fixed time step (sign is not used)\n   * @param handler fixed time step handler to wrap\n   ",
      "child_ranges": [
        "(line 56,col 5)-(line 56,col 31)",
        "(line 57,col 5)-(line 57,col 27)",
        "(line 58,col 5)-(line 58,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.StepNormalizer.requiresDenseOutput()",
      "begin_line": 67,
      "end_line": 69,
      "comment": " Determines whether this handler needs dense output.\n   * This handler needs dense output in order to provide data at\n   * regularly spaced steps regardless of the steps the integrator\n   * uses, so this method always returns true.\n   * @return always true\n   ",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.StepNormalizer.reset()",
      "begin_line": 75,
      "end_line": 79,
      "comment": " Reset the step handler.\n   * Initialize the internal data as required before the first step is\n   * handled.\n   ",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 27)",
        "(line 77,col 5)-(line 77,col 21)",
        "(line 78,col 5)-(line 78,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.StepNormalizer.handleStep(org.apache.commons.math.ode.StepInterpolator, boolean)",
      "begin_line": 94,
      "end_line": 139,
      "comment": "\n   * Handle the last accepted step\n   * @param interpolator interpolator for the last accepted step. For\n   * efficiency purposes, the various integrators reuse the same\n   * object on each call, so if the instance wants to keep it across\n   * all calls (for example to provide at the end of the integration a\n   * continuous model valid throughout the integration range), it\n   * should build a local copy using the clone method and store this\n   * copy.\n   * @param isLast true if the step is the last one\n   * @throws DerivativeException this exception is propagated to the\n   * caller if the underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 97,col 5)-(line 97,col 20)",
        "(line 99,col 5)-(line 113,col 5)",
        "(line 115,col 5)-(line 115,col 28)",
        "(line 116,col 5)-(line 116,col 78)",
        "(line 117,col 5)-(line 131,col 5)",
        "(line 133,col 5)-(line 137,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "h"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " Fixed time step. "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " Underlying step handler. "
    },
    {
      "type": "field",
      "varNames": [
        "lastTime"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": " Last step time. "
    },
    {
      "type": "field",
      "varNames": [
        "lastState"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": " Last State vector. "
    },
    {
      "type": "field",
      "varNames": [
        "forward"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " Integration direction indicator. "
    }
  ]
}