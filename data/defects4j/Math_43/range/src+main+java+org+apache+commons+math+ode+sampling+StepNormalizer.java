{
  "filepath": "/tmp/Math-43b/src/main/java/org/apache/commons/math/ode/sampling/StepNormalizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StepNormalizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 91,
      "end_line": 288,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "h"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Fixed time step. "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Underlying step handler. "
    },
    {
      "type": "field",
      "varNames": [
        "firstTime"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " First step time. "
    },
    {
      "type": "field",
      "varNames": [
        "lastTime"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " Last step time. "
    },
    {
      "type": "field",
      "varNames": [
        "lastState"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " Last state vector. "
    },
    {
      "type": "field",
      "varNames": [
        "lastDerivatives"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " Last derivatives vector. "
    },
    {
      "type": "field",
      "varNames": [
        "forward"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " Integration direction indicator. "
    },
    {
      "type": "field",
      "varNames": [
        "bounds"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " The step normalizer bounds settings to use. "
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " The step normalizer mode to use. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.StepNormalizer(double, org.apache.commons.math.ode.sampling.FixedStepHandler)",
      "begin_line": 125,
      "end_line": 128,
      "comment": " Simple constructor. Uses {@link StepNormalizerMode#INCREMENT INCREMENT}\n     * mode, and {@link StepNormalizerBounds#FIRST FIRST} bounds setting, for\n     * backwards compatibility.\n     * @param h fixed time step (sign is not used)\n     * @param handler fixed time step handler to wrap\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 127,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.StepNormalizer(double, org.apache.commons.math.ode.sampling.FixedStepHandler, org.apache.commons.math.ode.sampling.StepNormalizerMode)",
      "begin_line": 137,
      "end_line": 140,
      "comment": " Simple constructor. Uses {@link StepNormalizerBounds#FIRST FIRST}\n     * bounds setting.\n     * @param h fixed time step (sign is not used)\n     * @param handler fixed time step handler to wrap\n     * @param mode step normalizer mode to use\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.StepNormalizer(double, org.apache.commons.math.ode.sampling.FixedStepHandler, org.apache.commons.math.ode.sampling.StepNormalizerBounds)",
      "begin_line": 149,
      "end_line": 152,
      "comment": " Simple constructor. Uses {@link StepNormalizerMode#INCREMENT INCREMENT}\n     * mode.\n     * @param h fixed time step (sign is not used)\n     * @param handler fixed time step handler to wrap\n     * @param bounds step normalizer bounds setting to use\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.StepNormalizer(double, org.apache.commons.math.ode.sampling.FixedStepHandler, org.apache.commons.math.ode.sampling.StepNormalizerMode, org.apache.commons.math.ode.sampling.StepNormalizerBounds)",
      "begin_line": 161,
      "end_line": 169,
      "comment": " Simple constructor.\n     * @param h fixed time step (sign is not used)\n     * @param handler fixed time step handler to wrap\n     * @param mode step normalizer mode to use\n     * @param bounds step normalizer bounds setting to use\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 39)",
        "(line 165,col 9)-(line 165,col 31)",
        "(line 166,col 9)-(line 166,col 28)",
        "(line 167,col 9)-(line 167,col 30)",
        "(line 168,col 9)-(line 168,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.reset()",
      "begin_line": 175,
      "end_line": 181,
      "comment": " Reset the step handler.\n     * Initialize the internal data as required before the first step is\n     * handled.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 37)",
        "(line 177,col 9)-(line 177,col 37)",
        "(line 178,col 9)-(line 178,col 31)",
        "(line 179,col 9)-(line 179,col 31)",
        "(line 180,col 9)-(line 180,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 194,
      "end_line": 245,
      "comment": "\n     * Handle the last accepted step\n     * @param interpolator interpolator for the last accepted step. For\n     * efficiency purposes, the various integrators reuse the same\n     * object on each call, so if the instance wants to keep it across\n     * all calls (for example to provide at the end of the integration a\n     * continuous model valid throughout the integration range), it\n     * should build a local copy using the clone method and store this\n     * copy.\n     * @param isLast true if the step is the last one\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 208,col 9)",
        "(line 211,col 9)-(line 213,col 65)",
        "(line 214,col 9)-(line 217,col 9)",
        "(line 220,col 9)-(line 220,col 66)",
        "(line 221,col 9)-(line 231,col 9)",
        "(line 233,col 9)-(line 244,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.isNextInStep(double, org.apache.commons.math.ode.sampling.StepInterpolator)",
      "begin_line": 256,
      "end_line": 261,
      "comment": "\n     * Returns a value indicating whether the next normalized time is in the\n     * current step.\n     * @param nextTime the next normalized time\n     * @param interpolator interpolator for the last accepted step, to use to\n     * get the end time of the current step\n     * @return value indicating whether the next normalized time is in the\n     * current step\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 260,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.doNormalizedStep(boolean)",
      "begin_line": 267,
      "end_line": 272,
      "comment": "\n     * Invokes the underlying step handler for the current normalized step.\n     * @param isLast true if the step is the last one\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.storeStep(org.apache.commons.math.ode.sampling.StepInterpolator, double)",
      "begin_line": 280,
      "end_line": 287,
      "comment": " Stores the interpolated information for the given time in the current\n     * state.\n     * @param interpolator interpolator for the last accepted step, to use to\n     * get the interpolated information\n     * @param t the time for which to store the interpolated information\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 21)",
        "(line 282,col 9)-(line 282,col 51)",
        "(line 283,col 9)-(line 284,col 57)",
        "(line 285,col 9)-(line 286,col 69)"
      ]
    }
  ]
}