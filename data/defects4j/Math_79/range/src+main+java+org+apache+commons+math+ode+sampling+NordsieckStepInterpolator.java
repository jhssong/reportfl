{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/ode/sampling/NordsieckStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NordsieckStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.AbstractStepInterpolator"
      ],
      "begin_line": 40,
      "end_line": 290,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "stateVariation"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " State variation. "
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
        "referenceTime"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Reference time for all arrays.\n     * \u003cp\u003eSometimes, the reference time is the same as previousTime,\n     * sometimes it is the same as currentTime, so we use a separate\n     * field to avoid any confusion.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "scaled"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " First scaled derivative. "
    },
    {
      "type": "field",
      "varNames": [
        "nordsieck"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Nordsieck vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.NordsieckStepInterpolator()",
      "begin_line": 72,
      "end_line": 73,
      "comment": " Simple constructor.\n     * This constructor builds an instance that is not usable yet, the\n     * {@link AbstractStepInterpolator#reinitialize} method should be called\n     * before using the instance in order to initialize the internal arrays. This\n     * constructor is used only in order to delay the initialization in\n     * some cases.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.NordsieckStepInterpolator(org.apache.commons.math.ode.sampling.NordsieckStepInterpolator)",
      "begin_line": 80,
      "end_line": 93,
      "comment": " Copy constructor.\n     * @param interpolator interpolator to copy from. The copy is a deep\n     * copy: its arrays are separated from the original arrays of the\n     * instance\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 28)",
        "(line 82,col 9)-(line 82,col 46)",
        "(line 83,col 9)-(line 83,col 51)",
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 92,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.doCopy()",
      "begin_line": 96,
      "end_line": 99,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.reinitialize(double[], boolean)",
      "begin_line": 108,
      "end_line": 112,
      "comment": " Reinitialize the instance.\n     * \u003cp\u003eBeware that all arrays \u003cem\u003emust\u003c/em\u003e be references to integrator\n     * arrays, in order to ensure proper update without copy.\u003c/p\u003e\n     * @param y reference to the integrator array holding the state at\n     * the end of the step\n     * @param forward integration direction indicator\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 39)",
        "(line 111,col 9)-(line 111,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.reinitialize(double, double, double[], org.apache.commons.math.linear.Array2DRowRealMatrix)",
      "begin_line": 124,
      "end_line": 135,
      "comment": " Reinitialize the instance.\n     * \u003cp\u003eBeware that all arrays \u003cem\u003emust\u003c/em\u003e be references to integrator\n     * arrays, in order to ensure proper update without copy.\u003c/p\u003e\n     * @param time time at which all arrays are defined\n     * @param stepSize step size used in the scaled and nordsieck arrays\n     * @param scaledDerivative reference to the integrator array holding the first\n     * scaled derivative\n     * @param nordsieckVector reference to the integrator matrix holding the\n     * nordsieck vector\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 34)",
        "(line 128,col 9)-(line 128,col 38)",
        "(line 129,col 9)-(line 129,col 46)",
        "(line 130,col 9)-(line 130,col 45)",
        "(line 133,col 9)-(line 133,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.rescale(double)",
      "begin_line": 142,
      "end_line": 161,
      "comment": " Rescale the instance.\n     * \u003cp\u003eSince the scaled and Nordiseck arrays are shared with the caller,\n     * this method has the side effect of rescaling this arrays in the caller too.\u003c/p\u003e\n     * @param stepSize new step size to use in the scaled and nordsieck arrays\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 49)",
        "(line 145,col 9)-(line 147,col 9)",
        "(line 149,col 9)-(line 149,col 56)",
        "(line 150,col 9)-(line 150,col 29)",
        "(line 151,col 9)-(line 157,col 9)",
        "(line 159,col 9)-(line 159,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.getInterpolatedStateVariation()",
      "begin_line": 176,
      "end_line": 182,
      "comment": "\n     * Get the state vector variation from current to interpolated state.\n     * \u003cp\u003eThis method is aimed at computing y(t\u003csub\u003einterpolation\u003c/sub\u003e)\n     * -y(t\u003csub\u003ecurrent\u003c/sub\u003e) accurately by avoiding the cancellation errors\n     * that would occur if the subtraction were performed explicitly.\u003c/p\u003e\n     * \u003cp\u003eThe returned vector is a reference to a reused array, so\n     * it should not be modified and it should be copied if it needs\n     * to be preserved across several calls.\u003c/p\u003e\n     * @return state vector at time {@link #getInterpolatedTime}\n     * @see #getInterpolatedDerivatives()\n     * @throws DerivativeException if this call induces an automatic\n     * step finalization that throws one\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 31)",
        "(line 181,col 9)-(line 181,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 185,
      "end_line": 215,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 58)",
        "(line 189,col 9)-(line 189,col 55)",
        "(line 191,col 9)-(line 191,col 41)",
        "(line 192,col 9)-(line 192,col 50)",
        "(line 196,col 9)-(line 196,col 56)",
        "(line 197,col 9)-(line 206,col 9)",
        "(line 208,col 9)-(line 213,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 218,
      "end_line": 248,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 31)",
        "(line 226,col 9)-(line 226,col 34)",
        "(line 227,col 9)-(line 227,col 39)",
        "(line 229,col 9)-(line 229,col 72)",
        "(line 230,col 9)-(line 237,col 9)",
        "(line 239,col 9)-(line 244,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 251,
      "end_line": 288,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 46)",
        "(line 259,col 9)-(line 259,col 40)",
        "(line 260,col 9)-(line 260,col 40)",
        "(line 262,col 9)-(line 262,col 72)",
        "(line 263,col 9)-(line 263,col 51)",
        "(line 264,col 9)-(line 271,col 9)",
        "(line 273,col 9)-(line 273,col 54)",
        "(line 274,col 9)-(line 278,col 9)",
        "(line 280,col 9)-(line 286,col 9)"
      ]
    }
  ]
}