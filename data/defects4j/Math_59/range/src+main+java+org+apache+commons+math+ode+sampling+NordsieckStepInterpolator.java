{
  "filepath": "/tmp/Math-59b/src/main/java/org/apache/commons/math/ode/sampling/NordsieckStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NordsieckStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.AbstractStepInterpolator"
      ],
      "begin_line": 41,
      "end_line": 291,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "stateVariation"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " State variation. "
    },
    {
      "type": "field",
      "varNames": [
        "scalingH"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Step size used in the first scaled derivative and Nordsieck vector. "
    },
    {
      "type": "field",
      "varNames": [
        "referenceTime"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Reference time for all arrays.\n     * \u003cp\u003eSometimes, the reference time is the same as previousTime,\n     * sometimes it is the same as currentTime, so we use a separate\n     * field to avoid any confusion.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "scaled"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " First scaled derivative. "
    },
    {
      "type": "field",
      "varNames": [
        "nordsieck"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Nordsieck vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.NordsieckStepInterpolator()",
      "begin_line": 73,
      "end_line": 74,
      "comment": " Simple constructor.\n     * This constructor builds an instance that is not usable yet, the\n     * {@link AbstractStepInterpolator#reinitialize} method should be called\n     * before using the instance in order to initialize the internal arrays. This\n     * constructor is used only in order to delay the initialization in\n     * some cases.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.NordsieckStepInterpolator(org.apache.commons.math.ode.sampling.NordsieckStepInterpolator)",
      "begin_line": 81,
      "end_line": 94,
      "comment": " Copy constructor.\n     * @param interpolator interpolator to copy from. The copy is a deep\n     * copy: its arrays are separated from the original arrays of the\n     * instance\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 28)",
        "(line 83,col 9)-(line 83,col 46)",
        "(line 84,col 9)-(line 84,col 51)",
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 93,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.doCopy()",
      "begin_line": 97,
      "end_line": 100,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.reinitialize(double[], boolean)",
      "begin_line": 109,
      "end_line": 113,
      "comment": " Reinitialize the instance.\n     * \u003cp\u003eBeware that all arrays \u003cem\u003emust\u003c/em\u003e be references to integrator\n     * arrays, in order to ensure proper update without copy.\u003c/p\u003e\n     * @param y reference to the integrator array holding the state at\n     * the end of the step\n     * @param forward integration direction indicator\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 39)",
        "(line 112,col 9)-(line 112,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.reinitialize(double, double, double[], org.apache.commons.math.linear.Array2DRowRealMatrix)",
      "begin_line": 125,
      "end_line": 136,
      "comment": " Reinitialize the instance.\n     * \u003cp\u003eBeware that all arrays \u003cem\u003emust\u003c/em\u003e be references to integrator\n     * arrays, in order to ensure proper update without copy.\u003c/p\u003e\n     * @param time time at which all arrays are defined\n     * @param stepSize step size used in the scaled and nordsieck arrays\n     * @param scaledDerivative reference to the integrator array holding the first\n     * scaled derivative\n     * @param nordsieckVector reference to the integrator matrix holding the\n     * nordsieck vector\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 34)",
        "(line 129,col 9)-(line 129,col 38)",
        "(line 130,col 9)-(line 130,col 46)",
        "(line 131,col 9)-(line 131,col 45)",
        "(line 134,col 9)-(line 134,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.rescale(double)",
      "begin_line": 143,
      "end_line": 162,
      "comment": " Rescale the instance.\n     * \u003cp\u003eSince the scaled and Nordiseck arrays are shared with the caller,\n     * this method has the side effect of rescaling this arrays in the caller too.\u003c/p\u003e\n     * @param stepSize new step size to use in the scaled and nordsieck arrays\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 49)",
        "(line 146,col 9)-(line 148,col 9)",
        "(line 150,col 9)-(line 150,col 56)",
        "(line 151,col 9)-(line 151,col 29)",
        "(line 152,col 9)-(line 158,col 9)",
        "(line 160,col 9)-(line 160,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.getInterpolatedStateVariation()",
      "begin_line": 177,
      "end_line": 183,
      "comment": "\n     * Get the state vector variation from current to interpolated state.\n     * \u003cp\u003eThis method is aimed at computing y(t\u003csub\u003einterpolation\u003c/sub\u003e)\n     * -y(t\u003csub\u003ecurrent\u003c/sub\u003e) accurately by avoiding the cancellation errors\n     * that would occur if the subtraction were performed explicitly.\u003c/p\u003e\n     * \u003cp\u003eThe returned vector is a reference to a reused array, so\n     * it should not be modified and it should be copied if it needs\n     * to be preserved across several calls.\u003c/p\u003e\n     * @return state vector at time {@link #getInterpolatedTime}\n     * @see #getInterpolatedDerivatives()\n     * @throws MathUserException if this call induces an automatic\n     * step finalization that throws one\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 31)",
        "(line 182,col 9)-(line 182,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 186,
      "end_line": 216,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 58)",
        "(line 190,col 9)-(line 190,col 55)",
        "(line 192,col 9)-(line 192,col 41)",
        "(line 193,col 9)-(line 193,col 50)",
        "(line 197,col 9)-(line 197,col 56)",
        "(line 198,col 9)-(line 207,col 9)",
        "(line 209,col 9)-(line 214,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 219,
      "end_line": 249,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 31)",
        "(line 227,col 9)-(line 227,col 34)",
        "(line 228,col 9)-(line 228,col 39)",
        "(line 230,col 9)-(line 230,col 72)",
        "(line 231,col 9)-(line 238,col 9)",
        "(line 240,col 9)-(line 245,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.NordsieckStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 252,
      "end_line": 289,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 46)",
        "(line 260,col 9)-(line 260,col 40)",
        "(line 261,col 9)-(line 261,col 40)",
        "(line 263,col 9)-(line 263,col 72)",
        "(line 264,col 9)-(line 264,col 51)",
        "(line 265,col 9)-(line 272,col 9)",
        "(line 274,col 9)-(line 274,col 54)",
        "(line 275,col 9)-(line 279,col 9)",
        "(line 281,col 9)-(line 287,col 9)"
      ]
    }
  ]
}