{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/sampling/NordsieckStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NordsieckStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator"
      ],
      "begin_line": 42,
      "end_line": 294,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "stateVariation"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " State variation. "
    },
    {
      "type": "field",
      "varNames": [
        "scalingH"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Step size used in the first scaled derivative and Nordsieck vector. "
    },
    {
      "type": "field",
      "varNames": [
        "referenceTime"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Reference time for all arrays.\n     * \u003cp\u003eSometimes, the reference time is the same as previousTime,\n     * sometimes it is the same as currentTime, so we use a separate\n     * field to avoid any confusion.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "scaled"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " First scaled derivative. "
    },
    {
      "type": "field",
      "varNames": [
        "nordsieck"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Nordsieck vector. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator.NordsieckStepInterpolator()",
      "begin_line": 74,
      "end_line": 75,
      "comment": " Simple constructor.\n     * This constructor builds an instance that is not usable yet, the\n     * {@link AbstractStepInterpolator#reinitialize} method should be called\n     * before using the instance in order to initialize the internal arrays. This\n     * constructor is used only in order to delay the initialization in\n     * some cases.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator.NordsieckStepInterpolator(org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator)",
      "begin_line": 82,
      "end_line": 95,
      "comment": " Copy constructor.\n     * @param interpolator interpolator to copy from. The copy is a deep\n     * copy: its arrays are separated from the original arrays of the\n     * instance\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 28)",
        "(line 84,col 9)-(line 84,col 46)",
        "(line 85,col 9)-(line 85,col 51)",
        "(line 86,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 94,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator.doCopy()",
      "begin_line": 98,
      "end_line": 101,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator.reinitialize(double[], boolean, org.apache.commons.math3.ode.EquationsMapper, org.apache.commons.math3.ode.EquationsMapper[])",
      "begin_line": 112,
      "end_line": 118,
      "comment": " Reinitialize the instance.\n     * \u003cp\u003eBeware that all arrays \u003cem\u003emust\u003c/em\u003e be references to integrator\n     * arrays, in order to ensure proper update without copy.\u003c/p\u003e\n     * @param y reference to the integrator array holding the state at\n     * the end of the step\n     * @param forward integration direction indicator\n     * @param primaryMapper equations mapper for the primary equations set\n     * @param secondaryMappers equations mappers for the secondary equations sets\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 72)",
        "(line 117,col 9)-(line 117,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator.reinitialize(double, double, double[], org.apache.commons.math3.linear.Array2DRowRealMatrix)",
      "begin_line": 130,
      "end_line": 141,
      "comment": " Reinitialize the instance.\n     * \u003cp\u003eBeware that all arrays \u003cem\u003emust\u003c/em\u003e be references to integrator\n     * arrays, in order to ensure proper update without copy.\u003c/p\u003e\n     * @param time time at which all arrays are defined\n     * @param stepSize step size used in the scaled and nordsieck arrays\n     * @param scaledDerivative reference to the integrator array holding the first\n     * scaled derivative\n     * @param nordsieckVector reference to the integrator matrix holding the\n     * nordsieck vector\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 34)",
        "(line 134,col 9)-(line 134,col 38)",
        "(line 135,col 9)-(line 135,col 46)",
        "(line 136,col 9)-(line 136,col 45)",
        "(line 139,col 9)-(line 139,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator.rescale(double)",
      "begin_line": 148,
      "end_line": 167,
      "comment": " Rescale the instance.\n     * \u003cp\u003eSince the scaled and Nordiseck arrays are shared with the caller,\n     * this method has the side effect of rescaling this arrays in the caller too.\u003c/p\u003e\n     * @param stepSize new step size to use in the scaled and nordsieck arrays\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 49)",
        "(line 151,col 9)-(line 153,col 9)",
        "(line 155,col 9)-(line 155,col 56)",
        "(line 156,col 9)-(line 156,col 29)",
        "(line 157,col 9)-(line 163,col 9)",
        "(line 165,col 9)-(line 165,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator.getInterpolatedStateVariation()",
      "begin_line": 181,
      "end_line": 186,
      "comment": "\n     * Get the state vector variation from current to interpolated state.\n     * \u003cp\u003eThis method is aimed at computing y(t\u003csub\u003einterpolation\u003c/sub\u003e)\n     * -y(t\u003csub\u003ecurrent\u003c/sub\u003e) accurately by avoiding the cancellation errors\n     * that would occur if the subtraction were performed explicitly.\u003c/p\u003e\n     * \u003cp\u003eThe returned vector is a reference to a reused array, so\n     * it should not be modified and it should be copied if it needs\n     * to be preserved across several calls.\u003c/p\u003e\n     * @return state vector at time {@link #getInterpolatedTime}\n     * @see #getInterpolatedDerivatives()\n     * @exception MaxCountExceededException if the number of functions evaluations is exceeded\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 31)",
        "(line 185,col 9)-(line 185,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 189,
      "end_line": 219,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 58)",
        "(line 193,col 9)-(line 193,col 55)",
        "(line 195,col 9)-(line 195,col 41)",
        "(line 196,col 9)-(line 196,col 50)",
        "(line 200,col 9)-(line 200,col 56)",
        "(line 201,col 9)-(line 210,col 9)",
        "(line 212,col 9)-(line 217,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 222,
      "end_line": 252,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 31)",
        "(line 230,col 9)-(line 230,col 34)",
        "(line 231,col 9)-(line 231,col 39)",
        "(line 233,col 9)-(line 233,col 72)",
        "(line 234,col 9)-(line 241,col 9)",
        "(line 243,col 9)-(line 248,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 255,
      "end_line": 292,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 46)",
        "(line 263,col 9)-(line 263,col 40)",
        "(line 264,col 9)-(line 264,col 40)",
        "(line 266,col 9)-(line 266,col 72)",
        "(line 267,col 9)-(line 267,col 51)",
        "(line 268,col 9)-(line 275,col 9)",
        "(line 277,col 9)-(line 277,col 54)",
        "(line 278,col 9)-(line 282,col 9)",
        "(line 284,col 9)-(line 290,col 9)"
      ]
    }
  ]
}