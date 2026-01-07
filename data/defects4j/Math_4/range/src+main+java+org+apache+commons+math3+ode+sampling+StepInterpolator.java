{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/sampling/StepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StepInterpolator",
      "is_interface": true,
      "parent_types": [
        "java.io.Externalizable"
      ],
      "begin_line": 49,
      "end_line": 166,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepInterpolator.getPreviousTime()",
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n   * Get the previous grid point time.\n   * @return previous grid point time\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepInterpolator.getCurrentTime()",
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n   * Get the current grid point time.\n   * @return current grid point time\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepInterpolator.getInterpolatedTime()",
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n   * Get the time of the interpolated point.\n   * If {@link #setInterpolatedTime} has not been called, it returns\n   * the current grid point time.\n   * @return interpolation point time\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepInterpolator.setInterpolatedTime(double)",
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n   * Set the time of the interpolated point.\n   * \u003cp\u003eSetting the time outside of the current step is now allowed, but\n   * should be used with care since the accuracy of the interpolator will\n   * probably be very poor far from this step. This allowance has been\n   * added to simplify implementation of search algorithms near the\n   * step endpoints.\u003c/p\u003e\n   * \u003cp\u003eSetting the time changes the instance internal state. If a\n   * specific state must be preserved, a copy of the instance must be\n   * created using {@link #copy()}.\u003c/p\u003e\n   * @param time time of the interpolated point\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepInterpolator.getInterpolatedState()",
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n   * Get the state vector of the interpolated point.\n   * \u003cp\u003eThe returned vector is a reference to a reused array, so\n   * it should not be modified and it should be copied if it needs\n   * to be preserved across several calls.\u003c/p\u003e\n   * @return state vector at time {@link #getInterpolatedTime}\n   * @see #getInterpolatedDerivatives()\n   * @exception MaxCountExceededException if the number of functions evaluations is exceeded\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepInterpolator.getInterpolatedDerivatives()",
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n   * Get the derivatives of the state vector of the interpolated point.\n   * \u003cp\u003eThe returned vector is a reference to a reused array, so\n   * it should not be modified and it should be copied if it needs\n   * to be preserved across several calls.\u003c/p\u003e\n   * @return derivatives of the state vector at time {@link #getInterpolatedTime}\n   * @see #getInterpolatedState()\n   * @since 2.0\n   * @exception MaxCountExceededException if the number of functions evaluations is exceeded\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepInterpolator.getInterpolatedSecondaryState(int)",
      "begin_line": 124,
      "end_line": 124,
      "comment": " Get the interpolated secondary state corresponding to the secondary equations.\n   * \u003cp\u003eThe returned vector is a reference to a reused array, so\n   * it should not be modified and it should be copied if it needs\n   * to be preserved across several calls.\u003c/p\u003e\n   * @param index index of the secondary set, as returned by {@link\n   * org.apache.commons.math3.ode.ExpandableStatefulODE#addSecondaryEquations(\n   * org.apache.commons.math3.ode.SecondaryEquations)\n   * ExpandableStatefulODE.addSecondaryEquations(SecondaryEquations)}\n   * @return interpolated secondary state at the current interpolation date\n   * @see #getInterpolatedState()\n   * @see #getInterpolatedDerivatives()\n   * @see #getInterpolatedSecondaryDerivatives(int)\n   * @see #setInterpolatedTime(double)\n   * @since 3.0\n   * @exception MaxCountExceededException if the number of functions evaluations is exceeded\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepInterpolator.getInterpolatedSecondaryDerivatives(int)",
      "begin_line": 142,
      "end_line": 142,
      "comment": " Get the interpolated secondary derivatives corresponding to the secondary equations.\n   * \u003cp\u003eThe returned vector is a reference to a reused array, so\n   * it should not be modified and it should be copied if it needs\n   * to be preserved across several calls.\u003c/p\u003e\n   * @param index index of the secondary set, as returned by {@link\n   * org.apache.commons.math3.ode.ExpandableStatefulODE#addSecondaryEquations(\n   * org.apache.commons.math3.ode.SecondaryEquations)\n   * ExpandableStatefulODE.addSecondaryEquations(SecondaryEquations)}\n   * @return interpolated secondary derivatives at the current interpolation date\n   * @see #getInterpolatedState()\n   * @see #getInterpolatedDerivatives()\n   * @see #getInterpolatedSecondaryState(int)\n   * @see #setInterpolatedTime(double)\n   * @since 3.0\n   * @exception MaxCountExceededException if the number of functions evaluations is exceeded\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepInterpolator.isForward()",
      "begin_line": 153,
      "end_line": 153,
      "comment": " Check if the natural integration direction is forward.\n   * \u003cp\u003eThis method provides the integration direction as specified by\n   * the integrator itself, it avoid some nasty problems in\n   * degenerated cases like null steps due to cancellation at step\n   * initialization, step control or discrete events\n   * triggering.\u003c/p\u003e\n   * @return true if the integration variable (time) increases during\n   * integration\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepInterpolator.copy()",
      "begin_line": 164,
      "end_line": 164,
      "comment": " Copy the instance.\n   * \u003cp\u003eThe copied instance is guaranteed to be independent from the\n   * original one. Both can be used with different settings for\n   * interpolated time without any side effect.\u003c/p\u003e\n   * @return a deep copy of the instance, which can be used independently.\n   * @see #setInterpolatedTime(double)\n   * @exception MaxCountExceededException if the number of functions evaluations is exceeded\n   * during step finalization\n   ",
      "child_ranges": []
    }
  ]
}