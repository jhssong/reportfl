{
  "filepath": "/tmp/Math-87b/src/java/org/apache/commons/math/ode/sampling/NordsieckStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NordsieckStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.AbstractStepInterpolator"
      ],
      "begin_line": 43,
      "end_line": 268,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "scalingH"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Step size used in the first scaled derivative and Nordsieck vector. "
    },
    {
      "type": "field",
      "varNames": [
        "scaled"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " First scaled derivative. "
    },
    {
      "type": "field",
      "varNames": [
        "nordsieck"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Nordsieck vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.NordsieckStepInterpolator()",
      "begin_line": 64,
      "end_line": 65,
      "comment": " Simple constructor.\n     * This constructor builds an instance that is not usable yet, the\n     * {@link AbstractStepInterpolator#reinitialize} method should be called\n     * before using the instance in order to initialize the internal arrays. This\n     * constructor is used only in order to delay the initialization in\n     * some cases.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.NordsieckStepInterpolator(org.apache.commons.math.ode.sampling.NordsieckStepInterpolator)",
      "begin_line": 72,
      "end_line": 81,
      "comment": " Copy constructor.\n     * @param interpolator interpolator to copy from. The copy is a deep\n     * copy: its arrays are separated from the original arrays of the\n     * instance\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 28)",
        "(line 74,col 9)-(line 74,col 41)",
        "(line 75,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 80,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.doCopy()",
      "begin_line": 84,
      "end_line": 87,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.reinitialize(double[], boolean)",
      "begin_line": 96,
      "end_line": 99,
      "comment": " Reinitialize the instance\n     * \u003cp\u003eBeware that all arrays \u003cem\u003emust\u003c/em\u003e be references to integrator\n     * arrays, in order to ensure proper update without copy.\u003c/p\u003e\n     * @param y reference to the integrator array holding the state at\n     * the end of the step\n     * @param forward integration direction indicator\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.reinitialize(double, double[], org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 110,
      "end_line": 115,
      "comment": " Reinitialize the instance\n     * \u003cp\u003eBeware that all arrays \u003cem\u003emust\u003c/em\u003e be references to integrator\n     * arrays, in order to ensure proper update without copy.\u003c/p\u003e\n     * @param scalingH step size used in the scaled and nordsieck arrays\n     * @param scaled reference to the integrator array holding the first\n     * scaled derivative\n     * @param nordsieck reference to the integrator matrix holding the\n     * nordsieck vector\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 34)",
        "(line 113,col 9)-(line 113,col 32)",
        "(line 114,col 9)-(line 114,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.storeTime(double)",
      "begin_line": 120,
      "end_line": 126,
      "comment": " Store the current step time.\n     * @param t current time\n     ",
      "child_ranges": [
        "(line 122,col 7)-(line 122,col 27)",
        "(line 123,col 7)-(line 123,col 52)",
        "(line 124,col 7)-(line 124,col 27)",
        "(line 125,col 7)-(line 125,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 129,
      "end_line": 133,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 35)",
        "(line 132,col 9)-(line 132,col 76)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StateEstimator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealMatrixPreservingVisitor"
      ],
      "begin_line": 136,
      "end_line": 186,
      "comment": " State estimator. "
    },
    {
      "type": "field",
      "varNames": [
        "scale"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " Scaling factor for derivative. "
    },
    {
      "type": "field",
      "varNames": [
        "lowPower"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " First order power. "
    },
    {
      "type": "field",
      "varNames": [
        "highPowers"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " High order powers. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.StateEstimator.StateEstimator(double, double)",
      "begin_line": 151,
      "end_line": 160,
      "comment": " Simple constructor.\n         * @param scale scaling factor for derivative\n         * @param theta normalized interpolation abscissa within the step\n         ",
      "child_ranges": [
        "(line 152,col 13)-(line 152,col 32)",
        "(line 153,col 13)-(line 153,col 31)",
        "(line 154,col 13)-(line 154,col 65)",
        "(line 155,col 13)-(line 155,col 34)",
        "(line 156,col 13)-(line 159,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.StateEstimator.start(int, int, int, int, int, int)",
      "begin_line": 163,
      "end_line": 167,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 165,col 13)-(line 165,col 48)",
        "(line 166,col 13)-(line 166,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.StateEstimator.visit(int, int, double)",
      "begin_line": 170,
      "end_line": 174,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 171,col 13)-(line 171,col 53)",
        "(line 172,col 13)-(line 172,col 49)",
        "(line 173,col 13)-(line 173,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.StateEstimator.end()",
      "begin_line": 177,
      "end_line": 184,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 178,col 13)-(line 182,col 13)",
        "(line 183,col 13)-(line 183,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 189,
      "end_line": 220,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 31)",
        "(line 197,col 9)-(line 197,col 72)",
        "(line 198,col 9)-(line 205,col 9)",
        "(line 207,col 9)-(line 218,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 223,
      "end_line": 266,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 46)",
        "(line 231,col 9)-(line 231,col 72)",
        "(line 232,col 9)-(line 232,col 51)",
        "(line 233,col 9)-(line 240,col 9)",
        "(line 242,col 9)-(line 242,col 54)",
        "(line 243,col 9)-(line 255,col 9)",
        "(line 257,col 9)-(line 264,col 9)"
      ]
    }
  ]
}