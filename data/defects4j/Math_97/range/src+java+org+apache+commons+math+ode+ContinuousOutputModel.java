{
  "filepath": "/tmp/Math-97b/src/java/org/apache/commons/math/ode/ContinuousOutputModel.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ContinuousOutputModel",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler",
        "java.io.Serializable"
      ],
      "begin_line": 84,
      "end_line": 374,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.ContinuousOutputModel()",
      "begin_line": 90,
      "end_line": 93,
      "comment": " Simple constructor.\n   * Build an empty continuous output model.\n   ",
      "child_ranges": [
        "(line 91,col 5)-(line 91,col 46)",
        "(line 92,col 5)-(line 92,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.append(org.apache.commons.math.ode.ContinuousOutputModel)",
      "begin_line": 103,
      "end_line": 141,
      "comment": " Append another model at the end of the instance.\n   * @param model model to add at the end of the instance\n   * @exception DerivativeException if some step interpolators from\n   * the appended model cannot be copied\n   * @exception IllegalArgumentException if the model to append is not\n   * compatible with the instance (dimension of the state vector,\n   * propagation direction, hole between the dates)\n   ",
      "child_ranges": [
        "(line 106,col 5)-(line 108,col 5)",
        "(line 110,col 5)-(line 132,col 5)",
        "(line 134,col 5)-(line 136,col 5)",
        "(line 138,col 5)-(line 138,col 29)",
        "(line 139,col 5)-(line 139,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.requiresDenseOutput()",
      "begin_line": 149,
      "end_line": 151,
      "comment": " Determines whether this handler needs dense output.\n   * \u003cp\u003eThe essence of this class is to provide dense output over all\n   * steps, hence it requires the internal steps to provide themselves\n   * dense output. The method therefore returns always true.\u003c/p\u003e\n   * @return always true\n   ",
      "child_ranges": [
        "(line 150,col 5)-(line 150,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.reset()",
      "begin_line": 157,
      "end_line": 163,
      "comment": " Reset the step handler.\n   * Initialize the internal data as required before the first step is\n   * handled.\n   ",
      "child_ranges": [
        "(line 158,col 5)-(line 158,col 29)",
        "(line 159,col 5)-(line 159,col 29)",
        "(line 160,col 5)-(line 160,col 23)",
        "(line 161,col 5)-(line 161,col 20)",
        "(line 162,col 5)-(line 162,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 173,
      "end_line": 188,
      "comment": " Handle the last accepted step.\n   * A copy of the information provided by the last step is stored in\n   * the instance for later use.\n   * @param interpolator interpolator for the last accepted step.\n   * @param isLast true if the step is the last one\n   * @throws DerivativeException this exception is propagated to the\n   * caller if the underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 176,col 5)-(line 179,col 5)",
        "(line 181,col 5)-(line 181,col 35)",
        "(line 183,col 5)-(line 186,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.getInitialTime()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n   * Get the initial integration time.\n   * @return initial integration time\n   ",
      "child_ranges": [
        "(line 195,col 5)-(line 195,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.getFinalTime()",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\n   * Get the final integration time.\n   * @return final integration time\n   ",
      "child_ranges": [
        "(line 203,col 5)-(line 203,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.getInterpolatedTime()",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n   * Get the time of the interpolated point.\n   * If {@link #setInterpolatedTime} has not been called, it returns\n   * the final integration time.\n   * @return interpolation point time\n   ",
      "child_ranges": [
        "(line 213,col 5)-(line 213,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.setInterpolatedTime(double)",
      "begin_line": 228,
      "end_line": 320,
      "comment": " Set the time of the interpolated point.\n   * \u003cp\u003eThis method should \u003cstrong\u003enot\u003c/strong\u003e be called before the\n   * integration is over because some internal variables are set only\n   * once the last step has been handled.\u003c/p\u003e\n   * \u003cp\u003eSetting the time outside of the integration interval is now\n   * allowed (it was not allowed up to version 5.9 of Mantissa), but\n   * should be used with care since the accuracy of the interpolator\n   * will probably be very poor far from this interval. This allowance\n   * has been added to simplify implementation of search algorithms\n   * near the interval endpoints.\u003c/p\u003e\n   * @param time time of the interpolated point\n   ",
      "child_ranges": [
        "(line 230,col 5)-(line 318,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.getInterpolatedState()",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\n   * Get the state vector of the interpolated point.\n   * @return state vector at time {@link #getInterpolatedTime}\n   ",
      "child_ranges": [
        "(line 327,col 5)-(line 327,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.locatePoint(double, org.apache.commons.math.ode.sampling.StepInterpolator)",
      "begin_line": 337,
      "end_line": 354,
      "comment": " Compare a step interval and a double. \n   * @param time point to locate\n   * @param interval step interval\n   * @return -1 if the double is before the interval, 0 if it is in\n   * the interval, and +1 if it is after the interval, according to\n   * the interval direction\n   ",
      "child_ranges": [
        "(line 338,col 5)-(line 346,col 5)",
        "(line 347,col 5)-(line 353,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "initialTime"
      ],
      "begin_line": 357,
      "end_line": 357,
      "comment": " Initial integration time. "
    },
    {
      "type": "field",
      "varNames": [
        "finalTime"
      ],
      "begin_line": 360,
      "end_line": 360,
      "comment": " Final integration time. "
    },
    {
      "type": "field",
      "varNames": [
        "forward"
      ],
      "begin_line": 363,
      "end_line": 363,
      "comment": " Integration direction indicator. "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 366,
      "end_line": 366,
      "comment": " Current interpolator index. "
    },
    {
      "type": "field",
      "varNames": [
        "steps"
      ],
      "begin_line": 369,
      "end_line": 369,
      "comment": " Steps table. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 372,
      "end_line": 372,
      "comment": " Serializable version identifier "
    }
  ]
}