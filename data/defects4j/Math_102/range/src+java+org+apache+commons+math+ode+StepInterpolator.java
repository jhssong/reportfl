{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/ode/StepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StepInterpolator",
      "is_interface": true,
      "parent_types": [
        "java.io.Externalizable"
      ],
      "begin_line": 40,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.StepInterpolator.getPreviousTime()",
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n   * Get the previous grid point time.\n   * @return previous grid point time\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.StepInterpolator.getCurrentTime()",
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n   * Get the current grid point time.\n   * @return current grid point time\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.StepInterpolator.getInterpolatedTime()",
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n   * Get the time of the interpolated point.\n   * If {@link #setInterpolatedTime} has not been called, it returns\n   * the current grid point time.\n   * @return interpolation point time\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.StepInterpolator.setInterpolatedTime(double)",
      "begin_line": 77,
      "end_line": 78,
      "comment": "\n   * Set the time of the interpolated point.\n   * \u003cp\u003eSetting the time outside of the current step is now allowed, but\n   * should be used with care since the accuracy of the interpolator will\n   * probably be very poor far from this step. This allowance has been\n   * added to simplify implementation of search algorithms near the\n   * step endpoints.\u003c/p\u003e\n   * \u003cp\u003eSetting the time changes the instance internal state. If a\n   * specific state must be preserved, a copy of the instance must be\n   * created using {@link #copy()}.\u003c/p\u003e\n   * @param time time of the interpolated point\n   * @throws DerivativeException if this call induces an automatic\n   * step finalization that throws one\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.StepInterpolator.getInterpolatedState()",
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n   * Get the state vector of the interpolated point.\n   * @return state vector at time {@link #getInterpolatedTime}\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.StepInterpolator.isForward()",
      "begin_line": 95,
      "end_line": 95,
      "comment": " Check if the natural integration direction is forward.\n   * \u003cp\u003eThis method provides the integration direction as specified by\n   * the integrator itself, it avoid some nasty problems in\n   * degenerated cases like null steps due to cancellation at step\n   * initialization, step control or switching function\n   * triggering.\u003c/p\u003e\n   * @return true if the integration variable (time) increases during\n   * integration\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.StepInterpolator.copy()",
      "begin_line": 106,
      "end_line": 106,
      "comment": " Copy the instance.\n   * \u003cp\u003eThe copied instance is guaranteed to be independent from the\n   * original one. Both can be used with different settings for\n   * interpolated time without any side effect.\u003c/p\u003e\n   * @return a deep copy of the instance, which can be used independently.\n   * @throws DerivativeException if this call induces an automatic\n   * step finalization that throws one\n   * @see #setInterpolatedTime(double)\n   ",
      "child_ranges": []
    }
  ]
}