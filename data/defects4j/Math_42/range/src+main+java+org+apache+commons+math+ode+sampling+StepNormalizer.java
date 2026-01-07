{
  "filepath": "/tmp/Math-42b/src/main/java/org/apache/commons/math/ode/sampling/StepNormalizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StepNormalizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 91,
      "end_line": 294,
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
      "end_line": 173,
      "comment": " Simple constructor.\n     * @param h fixed time step (sign is not used)\n     * @param handler fixed time step handler to wrap\n     * @param mode step normalizer mode to use\n     * @param bounds step normalizer bounds setting to use\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 42)",
        "(line 165,col 9)-(line 165,col 34)",
        "(line 166,col 9)-(line 166,col 31)",
        "(line 167,col 9)-(line 167,col 33)",
        "(line 168,col 9)-(line 168,col 37)",
        "(line 169,col 9)-(line 169,col 37)",
        "(line 170,col 9)-(line 170,col 31)",
        "(line 171,col 9)-(line 171,col 31)",
        "(line 172,col 9)-(line 172,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.init(double, double[], double)",
      "begin_line": 176,
      "end_line": 187,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 37)",
        "(line 179,col 9)-(line 179,col 37)",
        "(line 180,col 9)-(line 180,col 31)",
        "(line 181,col 9)-(line 181,col 31)",
        "(line 182,col 9)-(line 182,col 31)",
        "(line 185,col 9)-(line 185,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 200,
      "end_line": 251,
      "comment": "\n     * Handle the last accepted step\n     * @param interpolator interpolator for the last accepted step. For\n     * efficiency purposes, the various integrators reuse the same\n     * object on each call, so if the instance wants to keep it across\n     * all calls (for example to provide at the end of the integration a\n     * continuous model valid throughout the integration range), it\n     * should build a local copy using the clone method and store this\n     * copy.\n     * @param isLast true if the step is the last one\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 214,col 9)",
        "(line 217,col 9)-(line 219,col 65)",
        "(line 220,col 9)-(line 223,col 9)",
        "(line 226,col 9)-(line 226,col 66)",
        "(line 227,col 9)-(line 237,col 9)",
        "(line 239,col 9)-(line 250,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.isNextInStep(double, org.apache.commons.math.ode.sampling.StepInterpolator)",
      "begin_line": 262,
      "end_line": 267,
      "comment": "\n     * Returns a value indicating whether the next normalized time is in the\n     * current step.\n     * @param nextTime the next normalized time\n     * @param interpolator interpolator for the last accepted step, to use to\n     * get the end time of the current step\n     * @return value indicating whether the next normalized time is in the\n     * current step\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 266,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.doNormalizedStep(boolean)",
      "begin_line": 273,
      "end_line": 278,
      "comment": "\n     * Invokes the underlying step handler for the current normalized step.\n     * @param isLast true if the step is the last one\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 277,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizer.storeStep(org.apache.commons.math.ode.sampling.StepInterpolator, double)",
      "begin_line": 286,
      "end_line": 293,
      "comment": " Stores the interpolated information for the given time in the current\n     * state.\n     * @param interpolator interpolator for the last accepted step, to use to\n     * get the interpolated information\n     * @param t the time for which to store the interpolated information\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 21)",
        "(line 288,col 9)-(line 288,col 51)",
        "(line 289,col 9)-(line 290,col 57)",
        "(line 291,col 9)-(line 292,col 69)"
      ]
    }
  ]
}