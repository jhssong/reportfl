{
  "filepath": "/tmp/Math-47b/src/main/java/org/apache/commons/math/ode/sampling/StepNormalizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StepNormalizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 95,
      "end_line": 297,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "h"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Fixed time step. "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Underlying step handler. "
    },
    {
      "type": "field",
      "varNames": [
        "firstTime"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " First step time. "
    },
    {
      "type": "field",
      "varNames": [
        "lastTime"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " Last step time. "
    },
    {
      "type": "field",
      "varNames": [
        "lastState"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " Last state vector. "
    },
    {
      "type": "field",
      "varNames": [
        "lastDerivatives"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " Last derivatives vector. "
    },
    {
      "type": "field",
      "varNames": [
        "forward"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " Integration direction indicator. "
    },
    {
      "type": "field",
      "varNames": [
        "bounds"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " The step normalizer bounds settings to use. "
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " The step normalizer mode to use. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.StepNormalizer(double, org.apache.commons.math.ode.sampling.FixedStepHandler)",
      "begin_line": 129,
      "end_line": 132,
      "comment": " Simple constructor. Uses {@link StepNormalizerMode#INCREMENT INCREMENT}\n     * mode, and {@link StepNormalizerBounds#FIRST FIRST} bounds setting, for\n     * backwards compatibility.\n     * @param h fixed time step (sign is not used)\n     * @param handler fixed time step handler to wrap\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 131,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.StepNormalizer(double, org.apache.commons.math.ode.sampling.FixedStepHandler, org.apache.commons.math.ode.sampling.StepNormalizerMode)",
      "begin_line": 141,
      "end_line": 144,
      "comment": " Simple constructor. Uses {@link StepNormalizerBounds#FIRST FIRST}\n     * bounds setting.\n     * @param h fixed time step (sign is not used)\n     * @param handler fixed time step handler to wrap\n     * @param mode step normalizer mode to use\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.StepNormalizer(double, org.apache.commons.math.ode.sampling.FixedStepHandler, org.apache.commons.math.ode.sampling.StepNormalizerBounds)",
      "begin_line": 153,
      "end_line": 156,
      "comment": " Simple constructor. Uses {@link StepNormalizerMode#INCREMENT INCREMENT}\n     * mode.\n     * @param h fixed time step (sign is not used)\n     * @param handler fixed time step handler to wrap\n     * @param bounds step normalizer bounds setting to use\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.StepNormalizer(double, org.apache.commons.math.ode.sampling.FixedStepHandler, org.apache.commons.math.ode.sampling.StepNormalizerMode, org.apache.commons.math.ode.sampling.StepNormalizerBounds)",
      "begin_line": 165,
      "end_line": 173,
      "comment": " Simple constructor.\n     * @param h fixed time step (sign is not used)\n     * @param handler fixed time step handler to wrap\n     * @param mode step normalizer mode to use\n     * @param bounds step normalizer bounds setting to use\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 39)",
        "(line 169,col 9)-(line 169,col 31)",
        "(line 170,col 9)-(line 170,col 28)",
        "(line 171,col 9)-(line 171,col 30)",
        "(line 172,col 9)-(line 172,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.reset()",
      "begin_line": 179,
      "end_line": 185,
      "comment": " Reset the step handler.\n     * Initialize the internal data as required before the first step is\n     * handled.\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 37)",
        "(line 181,col 9)-(line 181,col 37)",
        "(line 182,col 9)-(line 182,col 31)",
        "(line 183,col 9)-(line 183,col 31)",
        "(line 184,col 9)-(line 184,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 200,
      "end_line": 252,
      "comment": "\n     * Handle the last accepted step\n     * @param interpolator interpolator for the last accepted step. For\n     * efficiency purposes, the various integrators reuse the same\n     * object on each call, so if the instance wants to keep it across\n     * all calls (for example to provide at the end of the integration a\n     * continuous model valid throughout the integration range), it\n     * should build a local copy using the clone method and store this\n     * copy.\n     * @param isLast true if the step is the last one\n     * @throws MathUserException this exception is propagated to the\n     * caller if the underlying user function triggers one\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 215,col 9)",
        "(line 218,col 9)-(line 220,col 65)",
        "(line 221,col 9)-(line 224,col 9)",
        "(line 227,col 9)-(line 227,col 66)",
        "(line 228,col 9)-(line 238,col 9)",
        "(line 240,col 9)-(line 251,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.isNextInStep(double, org.apache.commons.math.ode.sampling.StepInterpolator)",
      "begin_line": 263,
      "end_line": 268,
      "comment": "\n     * Returns a value indicating whether the next normalized time is in the\n     * current step.\n     * @param nextTime the next normalized time\n     * @param interpolator interpolator for the last accepted step, to use to\n     * get the end time of the current step\n     * @return value indicating whether the next normalized time is in the\n     * current step\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 267,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.doNormalizedStep(boolean)",
      "begin_line": 276,
      "end_line": 281,
      "comment": "\n     * Invokes the underlying step handler for the current normalized step.\n     * @param isLast true if the step is the last one\n     * @throws MathUserException this exception is propagated to the\n     * caller if the underlying user function triggers one\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.storeStep(org.apache.commons.math.ode.sampling.StepInterpolator, double)",
      "begin_line": 289,
      "end_line": 296,
      "comment": " Stores the interpolated information for the given time in the current\n     * state.\n     * @param interpolator interpolator for the last accepted step, to use to\n     * get the interpolated information\n     * @param t the time for which to store the interpolated information\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 21)",
        "(line 291,col 9)-(line 291,col 51)",
        "(line 292,col 9)-(line 293,col 57)",
        "(line 294,col 9)-(line 295,col 69)"
      ]
    }
  ]
}