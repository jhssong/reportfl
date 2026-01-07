{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/ode/jacobians/StepInterpolatorWithJacobians.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StepInterpolatorWithJacobians",
      "is_interface": true,
      "parent_types": [
        "java.io.Externalizable"
      ],
      "begin_line": 48,
      "end_line": 186,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.StepInterpolatorWithJacobians.getPreviousTime()",
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n   * Get the previous grid point time.\n   * @return previous grid point time\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.StepInterpolatorWithJacobians.getCurrentTime()",
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n   * Get the current grid point time.\n   * @return current grid point time\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.StepInterpolatorWithJacobians.getInterpolatedTime()",
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n   * Get the time of the interpolated point.\n   * If {@link #setInterpolatedTime} has not been called, it returns\n   * the current grid point time.\n   * @return interpolation point time\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.StepInterpolatorWithJacobians.setInterpolatedTime(double)",
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n   * Set the time of the interpolated point.\n   * \u003cp\u003eSetting the time outside of the current step is now allowed, but\n   * should be used with care since the accuracy of the interpolator will\n   * probably be very poor far from this step. This allowance has been\n   * added to simplify implementation of search algorithms near the\n   * step endpoints.\u003c/p\u003e\n   * \u003cp\u003eSetting the time changes the instance internal state. If a\n   * specific state must be preserved, a copy of the instance must be\n   * created using {@link #copy()}.\u003c/p\u003e\n   * @param time time of the interpolated point\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.StepInterpolatorWithJacobians.getInterpolatedY()",
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n   * Get the state vector of the interpolated point.\n   * \u003cp\u003eThe returned vector is a reference to a reused array, so\n   * it should not be modified and it should be copied if it needs\n   * to be preserved across several calls.\u003c/p\u003e\n   * @return state vector at time {@link #getInterpolatedTime}\n   * @see #getInterpolatedYDot()\n   * @throws DerivativeException if this call induces an automatic\n   * step finalization that throws one\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.StepInterpolatorWithJacobians.getInterpolatedDyDy0()",
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n   * Get the partial derivatives of the state vector with respect to\n   * the initial state of the interpolated point.\n   * \u003cp\u003eThe returned vector is a reference to a reused array, so\n   * it should not be modified and it should be copied if it needs\n   * to be preserved across several calls.\u003c/p\u003e\n   * @return partial derivatives of the state vector with respect to\n   * the initial state at time {@link #getInterpolatedTime}\n   * @see #getInterpolatedY()\n   * @throws DerivativeException if this call induces an automatic\n   * step finalization that throws one\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.StepInterpolatorWithJacobians.getInterpolatedDyDp()",
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n   * Get the partial derivatives of the state vector with respect to\n   * the ODE parameters of the interpolated point.\n   * \u003cp\u003eThe returned vector is a reference to a reused array, so\n   * it should not be modified and it should be copied if it needs\n   * to be preserved across several calls.\u003c/p\u003e\n   * @return partial derivatives of the state vector with respect to\n   * the ODE parameters at time {@link #getInterpolatedTime}\n   * @see #getInterpolatedY()\n   * @throws DerivativeException if this call induces an automatic\n   * step finalization that throws one\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.StepInterpolatorWithJacobians.getInterpolatedYDot()",
      "begin_line": 134,
      "end_line": 134,
      "comment": "\n   * Get the time derivatives of the state vector of the interpolated point.\n   * \u003cp\u003eThe returned vector is a reference to a reused array, so\n   * it should not be modified and it should be copied if it needs\n   * to be preserved across several calls.\u003c/p\u003e\n   * @return derivatives of the state vector at time {@link #getInterpolatedTime}\n   * @see #getInterpolatedY()\n   * @throws DerivativeException if this call induces an automatic\n   * step finalization that throws one\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.StepInterpolatorWithJacobians.getInterpolatedDyDy0Dot()",
      "begin_line": 148,
      "end_line": 148,
      "comment": "\n   * Get the time derivatives of the jacobian of the state vector\n   * with respect to the initial state of the interpolated point.\n   * \u003cp\u003eThe returned vector is a reference to a reused array, so\n   * it should not be modified and it should be copied if it needs\n   * to be preserved across several calls.\u003c/p\u003e\n   * @return time derivatives of the jacobian of the state vector\n   * with respect to the initial state at time {@link #getInterpolatedTime}\n   * @see #getInterpolatedY()\n   * @throws DerivativeException if this call induces an automatic\n   * step finalization that throws one\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.StepInterpolatorWithJacobians.getInterpolatedDyDpDot()",
      "begin_line": 162,
      "end_line": 162,
      "comment": "\n   * Get the time derivatives of the jacobian of the state vector\n   * with respect to the ODE parameters of the interpolated point.\n   * \u003cp\u003eThe returned vector is a reference to a reused array, so\n   * it should not be modified and it should be copied if it needs\n   * to be preserved across several calls.\u003c/p\u003e\n   * @return time derivatives of the jacobian of the state vector\n   * with respect to the ODE parameters at time {@link #getInterpolatedTime}\n   * @see #getInterpolatedY()\n   * @throws DerivativeException if this call induces an automatic\n   * step finalization that throws one\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.StepInterpolatorWithJacobians.isForward()",
      "begin_line": 173,
      "end_line": 173,
      "comment": " Check if the natural integration direction is forward.\n   * \u003cp\u003eThis method provides the integration direction as specified by\n   * the integrator itself, it avoid some nasty problems in\n   * degenerated cases like null steps due to cancellation at step\n   * initialization, step control or discrete events\n   * triggering.\u003c/p\u003e\n   * @return true if the integration variable (time) increases during\n   * integration\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.StepInterpolatorWithJacobians.copy()",
      "begin_line": 184,
      "end_line": 184,
      "comment": " Copy the instance.\n   * \u003cp\u003eThe copied instance is guaranteed to be independent from the\n   * original one. Both can be used with different settings for\n   * interpolated time without any side effect.\u003c/p\u003e\n   * @return a deep copy of the instance, which can be used independently.\n   * @throws DerivativeException if this call induces an automatic\n   * step finalization that throws one\n   * @see #setInterpolatedTime(double)\n   ",
      "child_ranges": []
    }
  ]
}