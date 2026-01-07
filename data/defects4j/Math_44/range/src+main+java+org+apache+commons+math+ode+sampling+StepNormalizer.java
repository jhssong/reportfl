{
  "filepath": "/tmp/Math-44b/src/main/java/org/apache/commons/math/ode/sampling/StepNormalizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StepNormalizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 92,
      "end_line": 289,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "h"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Fixed time step. "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Underlying step handler. "
    },
    {
      "type": "field",
      "varNames": [
        "firstTime"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " First step time. "
    },
    {
      "type": "field",
      "varNames": [
        "lastTime"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Last step time. "
    },
    {
      "type": "field",
      "varNames": [
        "lastState"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " Last state vector. "
    },
    {
      "type": "field",
      "varNames": [
        "lastDerivatives"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " Last derivatives vector. "
    },
    {
      "type": "field",
      "varNames": [
        "forward"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " Integration direction indicator. "
    },
    {
      "type": "field",
      "varNames": [
        "bounds"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " The step normalizer bounds settings to use. "
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " The step normalizer mode to use. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.StepNormalizer(double, org.apache.commons.math.ode.sampling.FixedStepHandler)",
      "begin_line": 126,
      "end_line": 129,
      "comment": " Simple constructor. Uses {@link StepNormalizerMode#INCREMENT INCREMENT}\n     * mode, and {@link StepNormalizerBounds#FIRST FIRST} bounds setting, for\n     * backwards compatibility.\n     * @param h fixed time step (sign is not used)\n     * @param handler fixed time step handler to wrap\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 128,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.StepNormalizer(double, org.apache.commons.math.ode.sampling.FixedStepHandler, org.apache.commons.math.ode.sampling.StepNormalizerMode)",
      "begin_line": 138,
      "end_line": 141,
      "comment": " Simple constructor. Uses {@link StepNormalizerBounds#FIRST FIRST}\n     * bounds setting.\n     * @param h fixed time step (sign is not used)\n     * @param handler fixed time step handler to wrap\n     * @param mode step normalizer mode to use\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.StepNormalizer(double, org.apache.commons.math.ode.sampling.FixedStepHandler, org.apache.commons.math.ode.sampling.StepNormalizerBounds)",
      "begin_line": 150,
      "end_line": 153,
      "comment": " Simple constructor. Uses {@link StepNormalizerMode#INCREMENT INCREMENT}\n     * mode.\n     * @param h fixed time step (sign is not used)\n     * @param handler fixed time step handler to wrap\n     * @param bounds step normalizer bounds setting to use\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.StepNormalizer(double, org.apache.commons.math.ode.sampling.FixedStepHandler, org.apache.commons.math.ode.sampling.StepNormalizerMode, org.apache.commons.math.ode.sampling.StepNormalizerBounds)",
      "begin_line": 162,
      "end_line": 170,
      "comment": " Simple constructor.\n     * @param h fixed time step (sign is not used)\n     * @param handler fixed time step handler to wrap\n     * @param mode step normalizer mode to use\n     * @param bounds step normalizer bounds setting to use\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 39)",
        "(line 166,col 9)-(line 166,col 31)",
        "(line 167,col 9)-(line 167,col 28)",
        "(line 168,col 9)-(line 168,col 30)",
        "(line 169,col 9)-(line 169,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.reset()",
      "begin_line": 176,
      "end_line": 182,
      "comment": " Reset the step handler.\n     * Initialize the internal data as required before the first step is\n     * handled.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 37)",
        "(line 178,col 9)-(line 178,col 37)",
        "(line 179,col 9)-(line 179,col 31)",
        "(line 180,col 9)-(line 180,col 31)",
        "(line 181,col 9)-(line 181,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 195,
      "end_line": 246,
      "comment": "\n     * Handle the last accepted step\n     * @param interpolator interpolator for the last accepted step. For\n     * efficiency purposes, the various integrators reuse the same\n     * object on each call, so if the instance wants to keep it across\n     * all calls (for example to provide at the end of the integration a\n     * continuous model valid throughout the integration range), it\n     * should build a local copy using the clone method and store this\n     * copy.\n     * @param isLast true if the step is the last one\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 209,col 9)",
        "(line 212,col 9)-(line 214,col 65)",
        "(line 215,col 9)-(line 218,col 9)",
        "(line 221,col 9)-(line 221,col 66)",
        "(line 222,col 9)-(line 232,col 9)",
        "(line 234,col 9)-(line 245,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.isNextInStep(double, org.apache.commons.math.ode.sampling.StepInterpolator)",
      "begin_line": 257,
      "end_line": 262,
      "comment": "\n     * Returns a value indicating whether the next normalized time is in the\n     * current step.\n     * @param nextTime the next normalized time\n     * @param interpolator interpolator for the last accepted step, to use to\n     * get the end time of the current step\n     * @return value indicating whether the next normalized time is in the\n     * current step\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 261,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.doNormalizedStep(boolean)",
      "begin_line": 268,
      "end_line": 273,
      "comment": "\n     * Invokes the underlying step handler for the current normalized step.\n     * @param isLast true if the step is the last one\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 272,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.storeStep(org.apache.commons.math.ode.sampling.StepInterpolator, double)",
      "begin_line": 281,
      "end_line": 288,
      "comment": " Stores the interpolated information for the given time in the current\n     * state.\n     * @param interpolator interpolator for the last accepted step, to use to\n     * get the interpolated information\n     * @param t the time for which to store the interpolated information\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 21)",
        "(line 283,col 9)-(line 283,col 51)",
        "(line 284,col 9)-(line 285,col 57)",
        "(line 286,col 9)-(line 287,col 69)"
      ]
    }
  ]
}