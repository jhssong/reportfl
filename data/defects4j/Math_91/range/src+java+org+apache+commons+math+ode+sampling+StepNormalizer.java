{
  "filepath": "/tmp/Math-91b/src/java/org/apache/commons/math/ode/sampling/StepNormalizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StepNormalizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 50,
      "end_line": 163,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "h"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Fixed time step. "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Underlying step handler. "
    },
    {
      "type": "field",
      "varNames": [
        "lastTime"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Last step time. "
    },
    {
      "type": "field",
      "varNames": [
        "lastState"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Last State vector. "
    },
    {
      "type": "field",
      "varNames": [
        "lastDerivatives"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Last Derivatives vector. "
    },
    {
      "type": "field",
      "varNames": [
        "forward"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Integration direction indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.StepNormalizer(double, org.apache.commons.math.ode.sampling.FixedStepHandler)",
      "begin_line": 77,
      "end_line": 81,
      "comment": " Simple constructor.\n     * @param h fixed time step (sign is not used)\n     * @param handler fixed time step handler to wrap\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 35)",
        "(line 79,col 9)-(line 79,col 31)",
        "(line 80,col 9)-(line 80,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.requiresDenseOutput()",
      "begin_line": 89,
      "end_line": 91,
      "comment": " Determines whether this handler needs dense output.\n     * This handler needs dense output in order to provide data at\n     * regularly spaced steps regardless of the steps the integrator\n     * uses, so this method always returns true.\n     * @return always true\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.reset()",
      "begin_line": 97,
      "end_line": 102,
      "comment": " Reset the step handler.\n     * Initialize the internal data as required before the first step is\n     * handled.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 37)",
        "(line 99,col 9)-(line 99,col 31)",
        "(line 100,col 9)-(line 100,col 31)",
        "(line 101,col 9)-(line 101,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 117,
      "end_line": 161,
      "comment": "\n     * Handle the last accepted step\n     * @param interpolator interpolator for the last accepted step. For\n     * efficiency purposes, the various integrators reuse the same\n     * object on each call, so if the instance wants to keep it across\n     * all calls (for example to provide at the end of the integration a\n     * continuous model valid throughout the integration range), it\n     * should build a local copy using the clone method and store this\n     * copy.\n     * @param isLast true if the step is the last one\n     * @throws DerivativeException this exception is propagated to the\n     * caller if the underlying user function triggers one\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 133,col 9)",
        "(line 135,col 9)-(line 135,col 39)",
        "(line 136,col 9)-(line 136,col 82)",
        "(line 137,col 9)-(line 153,col 9)",
        "(line 155,col 9)-(line 159,col 9)"
      ]
    }
  ]
}