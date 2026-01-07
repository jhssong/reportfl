{
  "filepath": "/tmp/Math-58b/src/main/java/org/apache/commons/math/ode/sampling/StepNormalizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StepNormalizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 51,
      "end_line": 161,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "h"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Fixed time step. "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Underlying step handler. "
    },
    {
      "type": "field",
      "varNames": [
        "lastTime"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Last step time. "
    },
    {
      "type": "field",
      "varNames": [
        "lastState"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Last State vector. "
    },
    {
      "type": "field",
      "varNames": [
        "lastDerivatives"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Last Derivatives vector. "
    },
    {
      "type": "field",
      "varNames": [
        "forward"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Integration direction indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.StepNormalizer(double, org.apache.commons.math.ode.sampling.FixedStepHandler)",
      "begin_line": 75,
      "end_line": 79,
      "comment": " Simple constructor.\n     * @param h fixed time step (sign is not used)\n     * @param handler fixed time step handler to wrap\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 39)",
        "(line 77,col 9)-(line 77,col 31)",
        "(line 78,col 9)-(line 78,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.requiresDenseOutput()",
      "begin_line": 87,
      "end_line": 89,
      "comment": " Determines whether this handler needs dense output.\n     * This handler needs dense output in order to provide data at\n     * regularly spaced steps regardless of the steps the integrator\n     * uses, so this method always returns true.\n     * @return always true\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.reset()",
      "begin_line": 95,
      "end_line": 100,
      "comment": " Reset the step handler.\n     * Initialize the internal data as required before the first step is\n     * handled.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 37)",
        "(line 97,col 9)-(line 97,col 31)",
        "(line 98,col 9)-(line 98,col 31)",
        "(line 99,col 9)-(line 99,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 115,
      "end_line": 159,
      "comment": "\n     * Handle the last accepted step\n     * @param interpolator interpolator for the last accepted step. For\n     * efficiency purposes, the various integrators reuse the same\n     * object on each call, so if the instance wants to keep it across\n     * all calls (for example to provide at the end of the integration a\n     * continuous model valid throughout the integration range), it\n     * should build a local copy using the clone method and store this\n     * copy.\n     * @param isLast true if the step is the last one\n     * @throws MathUserException this exception is propagated to the\n     * caller if the underlying user function triggers one\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 131,col 9)",
        "(line 133,col 9)-(line 133,col 39)",
        "(line 134,col 9)-(line 134,col 82)",
        "(line 135,col 9)-(line 151,col 9)",
        "(line 153,col 9)-(line 157,col 9)"
      ]
    }
  ]
}