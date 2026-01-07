{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/sampling/StepNormalizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StepNormalizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.sampling.StepHandler"
      ],
      "begin_line": 92,
      "end_line": 301,
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
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizer.StepNormalizer(double, org.apache.commons.math3.ode.sampling.FixedStepHandler)",
      "begin_line": 126,
      "end_line": 129,
      "comment": " Simple constructor. Uses {@link StepNormalizerMode#INCREMENT INCREMENT}\n     * mode, and {@link StepNormalizerBounds#FIRST FIRST} bounds setting, for\n     * backwards compatibility.\n     * @param h fixed time step (sign is not used)\n     * @param handler fixed time step handler to wrap\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 128,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizer.StepNormalizer(double, org.apache.commons.math3.ode.sampling.FixedStepHandler, org.apache.commons.math3.ode.sampling.StepNormalizerMode)",
      "begin_line": 138,
      "end_line": 141,
      "comment": " Simple constructor. Uses {@link StepNormalizerBounds#FIRST FIRST}\n     * bounds setting.\n     * @param h fixed time step (sign is not used)\n     * @param handler fixed time step handler to wrap\n     * @param mode step normalizer mode to use\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizer.StepNormalizer(double, org.apache.commons.math3.ode.sampling.FixedStepHandler, org.apache.commons.math3.ode.sampling.StepNormalizerBounds)",
      "begin_line": 150,
      "end_line": 153,
      "comment": " Simple constructor. Uses {@link StepNormalizerMode#INCREMENT INCREMENT}\n     * mode.\n     * @param h fixed time step (sign is not used)\n     * @param handler fixed time step handler to wrap\n     * @param bounds step normalizer bounds setting to use\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizer.StepNormalizer(double, org.apache.commons.math3.ode.sampling.FixedStepHandler, org.apache.commons.math3.ode.sampling.StepNormalizerMode, org.apache.commons.math3.ode.sampling.StepNormalizerBounds)",
      "begin_line": 162,
      "end_line": 174,
      "comment": " Simple constructor.\n     * @param h fixed time step (sign is not used)\n     * @param handler fixed time step handler to wrap\n     * @param mode step normalizer mode to use\n     * @param bounds step normalizer bounds setting to use\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 42)",
        "(line 166,col 9)-(line 166,col 34)",
        "(line 167,col 9)-(line 167,col 31)",
        "(line 168,col 9)-(line 168,col 33)",
        "(line 169,col 9)-(line 169,col 37)",
        "(line 170,col 9)-(line 170,col 37)",
        "(line 171,col 9)-(line 171,col 31)",
        "(line 172,col 9)-(line 172,col 31)",
        "(line 173,col 9)-(line 173,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizer.init(double, double[], double)",
      "begin_line": 177,
      "end_line": 188,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 37)",
        "(line 180,col 9)-(line 180,col 37)",
        "(line 181,col 9)-(line 181,col 31)",
        "(line 182,col 9)-(line 182,col 31)",
        "(line 183,col 9)-(line 183,col 31)",
        "(line 186,col 9)-(line 186,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizer.handleStep(org.apache.commons.math3.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 203,
      "end_line": 255,
      "comment": "\n     * Handle the last accepted step\n     * @param interpolator interpolator for the last accepted step. For\n     * efficiency purposes, the various integrators reuse the same\n     * object on each call, so if the instance wants to keep it across\n     * all calls (for example to provide at the end of the integration a\n     * continuous model valid throughout the integration range), it\n     * should build a local copy using the clone method and store this\n     * copy.\n     * @param isLast true if the step is the last one\n     * @exception MaxCountExceededException if the interpolator throws one because\n     * the number of functions evaluations is exceeded\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 218,col 9)",
        "(line 221,col 9)-(line 223,col 65)",
        "(line 224,col 9)-(line 227,col 9)",
        "(line 230,col 9)-(line 230,col 66)",
        "(line 231,col 9)-(line 241,col 9)",
        "(line 243,col 9)-(line 254,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizer.isNextInStep(double, org.apache.commons.math3.ode.sampling.StepInterpolator)",
      "begin_line": 266,
      "end_line": 271,
      "comment": "\n     * Returns a value indicating whether the next normalized time is in the\n     * current step.\n     * @param nextTime the next normalized time\n     * @param interpolator interpolator for the last accepted step, to use to\n     * get the end time of the current step\n     * @return value indicating whether the next normalized time is in the\n     * current step\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 270,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizer.doNormalizedStep(boolean)",
      "begin_line": 277,
      "end_line": 282,
      "comment": "\n     * Invokes the underlying step handler for the current normalized step.\n     * @param isLast true if the step is the last one\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 281,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizer.storeStep(org.apache.commons.math3.ode.sampling.StepInterpolator, double)",
      "begin_line": 292,
      "end_line": 300,
      "comment": " Stores the interpolated information for the given time in the current\n     * state.\n     * @param interpolator interpolator for the last accepted step, to use to\n     * get the interpolated information\n     * @param t the time for which to store the interpolated information\n     * @exception MaxCountExceededException if the interpolator throws one because\n     * the number of functions evaluations is exceeded\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 21)",
        "(line 295,col 9)-(line 295,col 51)",
        "(line 296,col 9)-(line 297,col 57)",
        "(line 298,col 9)-(line 299,col 69)"
      ]
    }
  ]
}