{
  "filepath": "/tmp/Math-94b/src/java/org/apache/commons/math/ode/ContinuousOutputModel.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ContinuousOutputModel",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler",
        "java.io.Serializable"
      ],
      "begin_line": 86,
      "end_line": 375,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.ContinuousOutputModel()",
      "begin_line": 92,
      "end_line": 95,
      "comment": " Simple constructor.\n   * Build an empty continuous output model.\n   ",
      "child_ranges": [
        "(line 93,col 5)-(line 93,col 46)",
        "(line 94,col 5)-(line 94,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.append(org.apache.commons.math.ode.ContinuousOutputModel)",
      "begin_line": 105,
      "end_line": 143,
      "comment": " Append another model at the end of the instance.\n   * @param model model to add at the end of the instance\n   * @exception DerivativeException if some step interpolators from\n   * the appended model cannot be copied\n   * @exception IllegalArgumentException if the model to append is not\n   * compatible with the instance (dimension of the state vector,\n   * propagation direction, hole between the dates)\n   ",
      "child_ranges": [
        "(line 108,col 5)-(line 110,col 5)",
        "(line 112,col 5)-(line 134,col 5)",
        "(line 136,col 5)-(line 138,col 5)",
        "(line 140,col 5)-(line 140,col 29)",
        "(line 141,col 5)-(line 141,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.requiresDenseOutput()",
      "begin_line": 151,
      "end_line": 153,
      "comment": " Determines whether this handler needs dense output.\n   * \u003cp\u003eThe essence of this class is to provide dense output over all\n   * steps, hence it requires the internal steps to provide themselves\n   * dense output. The method therefore returns always true.\u003c/p\u003e\n   * @return always true\n   ",
      "child_ranges": [
        "(line 152,col 5)-(line 152,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.reset()",
      "begin_line": 159,
      "end_line": 165,
      "comment": " Reset the step handler.\n   * Initialize the internal data as required before the first step is\n   * handled.\n   ",
      "child_ranges": [
        "(line 160,col 5)-(line 160,col 29)",
        "(line 161,col 5)-(line 161,col 29)",
        "(line 162,col 5)-(line 162,col 23)",
        "(line 163,col 5)-(line 163,col 20)",
        "(line 164,col 5)-(line 164,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 175,
      "end_line": 190,
      "comment": " Handle the last accepted step.\n   * A copy of the information provided by the last step is stored in\n   * the instance for later use.\n   * @param interpolator interpolator for the last accepted step.\n   * @param isLast true if the step is the last one\n   * @throws DerivativeException this exception is propagated to the\n   * caller if the underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 178,col 5)-(line 181,col 5)",
        "(line 183,col 5)-(line 183,col 35)",
        "(line 185,col 5)-(line 188,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.getInitialTime()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n   * Get the initial integration time.\n   * @return initial integration time\n   ",
      "child_ranges": [
        "(line 197,col 5)-(line 197,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.getFinalTime()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n   * Get the final integration time.\n   * @return final integration time\n   ",
      "child_ranges": [
        "(line 205,col 5)-(line 205,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.getInterpolatedTime()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n   * Get the time of the interpolated point.\n   * If {@link #setInterpolatedTime} has not been called, it returns\n   * the final integration time.\n   * @return interpolation point time\n   ",
      "child_ranges": [
        "(line 215,col 5)-(line 215,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.setInterpolatedTime(double)",
      "begin_line": 230,
      "end_line": 321,
      "comment": " Set the time of the interpolated point.\n   * \u003cp\u003eThis method should \u003cstrong\u003enot\u003c/strong\u003e be called before the\n   * integration is over because some internal variables are set only\n   * once the last step has been handled.\u003c/p\u003e\n   * \u003cp\u003eSetting the time outside of the integration interval is now\n   * allowed (it was not allowed up to version 5.9 of Mantissa), but\n   * should be used with care since the accuracy of the interpolator\n   * will probably be very poor far from this interval. This allowance\n   * has been added to simplify implementation of search algorithms\n   * near the interval endpoints.\u003c/p\u003e\n   * @param time time of the interpolated point\n   ",
      "child_ranges": [
        "(line 232,col 5)-(line 319,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.getInterpolatedState()",
      "begin_line": 327,
      "end_line": 329,
      "comment": "\n   * Get the state vector of the interpolated point.\n   * @return state vector at time {@link #getInterpolatedTime}\n   ",
      "child_ranges": [
        "(line 328,col 5)-(line 328,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.locatePoint(double, org.apache.commons.math.ode.sampling.StepInterpolator)",
      "begin_line": 338,
      "end_line": 355,
      "comment": " Compare a step interval and a double. \n   * @param time point to locate\n   * @param interval step interval\n   * @return -1 if the double is before the interval, 0 if it is in\n   * the interval, and +1 if it is after the interval, according to\n   * the interval direction\n   ",
      "child_ranges": [
        "(line 339,col 5)-(line 347,col 5)",
        "(line 348,col 5)-(line 354,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "initialTime"
      ],
      "begin_line": 358,
      "end_line": 358,
      "comment": " Initial integration time. "
    },
    {
      "type": "field",
      "varNames": [
        "finalTime"
      ],
      "begin_line": 361,
      "end_line": 361,
      "comment": " Final integration time. "
    },
    {
      "type": "field",
      "varNames": [
        "forward"
      ],
      "begin_line": 364,
      "end_line": 364,
      "comment": " Integration direction indicator. "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 367,
      "end_line": 367,
      "comment": " Current interpolator index. "
    },
    {
      "type": "field",
      "varNames": [
        "steps"
      ],
      "begin_line": 370,
      "end_line": 370,
      "comment": " Steps table. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 373,
      "end_line": 373,
      "comment": " Serializable version identifier "
    }
  ]
}