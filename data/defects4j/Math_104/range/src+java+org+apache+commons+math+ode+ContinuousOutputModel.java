{
  "filepath": "/tmp/Math-104b/src/java/org/apache/commons/math/ode/ContinuousOutputModel.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ContinuousOutputModel",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.StepHandler",
        "java.io.Serializable"
      ],
      "begin_line": 82,
      "end_line": 375,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.ContinuousOutputModel()",
      "begin_line": 88,
      "end_line": 91,
      "comment": " Simple constructor.\n   * Build an empty continuous output model.\n   ",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 28)",
        "(line 90,col 5)-(line 90,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.append(org.apache.commons.math.ode.ContinuousOutputModel)",
      "begin_line": 99,
      "end_line": 137,
      "comment": " Append another model at the end of the instance.\n   * @param model model to add at the end of the instance\n   * @exception IllegalArgumentException if the model to append is not\n   * compatible with the instance (dimension of the state vector,\n   * propagation direction, hole between the dates)\n   ",
      "child_ranges": [
        "(line 101,col 5)-(line 103,col 5)",
        "(line 105,col 5)-(line 127,col 5)",
        "(line 129,col 5)-(line 132,col 5)",
        "(line 134,col 5)-(line 134,col 29)",
        "(line 135,col 5)-(line 135,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.requiresDenseOutput()",
      "begin_line": 145,
      "end_line": 147,
      "comment": " Determines whether this handler needs dense output.\n   * \u003cp\u003eThe essence of this class is to provide dense output over all\n   * steps, hence it requires the internal steps to provide themselves\n   * dense output. The method therefore returns always true.\u003c/p\u003e\n   * @return always true\n   ",
      "child_ranges": [
        "(line 146,col 5)-(line 146,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.reset()",
      "begin_line": 153,
      "end_line": 159,
      "comment": " Reset the step handler.\n   * Initialize the internal data as required before the first step is\n   * handled.\n   ",
      "child_ranges": [
        "(line 154,col 5)-(line 154,col 29)",
        "(line 155,col 5)-(line 155,col 29)",
        "(line 156,col 5)-(line 156,col 23)",
        "(line 157,col 5)-(line 157,col 20)",
        "(line 158,col 5)-(line 158,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.handleStep(org.apache.commons.math.ode.StepInterpolator, boolean)",
      "begin_line": 169,
      "end_line": 187,
      "comment": " Handle the last accepted step.\n   * A copy of the information provided by the last step is stored in\n   * the instance for later use.\n   * @param interpolator interpolator for the last accepted step.\n   * @param isLast true if the step is the last one\n   * @throws DerivativeException this exception is propagated to the\n   * caller if the underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 172,col 5)-(line 172,col 74)",
        "(line 174,col 5)-(line 177,col 5)",
        "(line 179,col 5)-(line 179,col 22)",
        "(line 180,col 5)-(line 180,col 26)",
        "(line 182,col 5)-(line 185,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.getInitialTime()",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\n   * Get the initial integration time.\n   * @return initial integration time\n   ",
      "child_ranges": [
        "(line 194,col 5)-(line 194,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.getFinalTime()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\n   * Get the final integration time.\n   * @return final integration time\n   ",
      "child_ranges": [
        "(line 202,col 5)-(line 202,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.getInterpolatedTime()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\n   * Get the time of the interpolated point.\n   * If {@link #setInterpolatedTime} has not been called, it returns\n   * the final integration time.\n   * @return interpolation point time\n   ",
      "child_ranges": [
        "(line 212,col 5)-(line 212,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.setInterpolatedTime(double)",
      "begin_line": 227,
      "end_line": 322,
      "comment": " Set the time of the interpolated point.\n   * \u003cp\u003eThis method should \u003cstrong\u003enot\u003c/strong\u003e be called before the\n   * integration is over because some internal variables are set only\n   * once the last step has been handled.\u003c/p\u003e\n   * \u003cp\u003eSetting the time outside of the integration interval is now\n   * allowed (it was not allowed up to version 5.9 of Mantissa), but\n   * should be used with care since the accuracy of the interpolator\n   * will probably be very poor far from this interval. This allowance\n   * has been added to simplify implementation of search algorithms\n   * near the interval endpoints.\u003c/p\u003e\n   * @param time time of the interpolated point\n   ",
      "child_ranges": [
        "(line 229,col 5)-(line 320,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.getInterpolatedState()",
      "begin_line": 328,
      "end_line": 330,
      "comment": "\n   * Get the state vector of the interpolated point.\n   * @return state vector at time {@link #getInterpolatedTime}\n   ",
      "child_ranges": [
        "(line 329,col 5)-(line 329,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.locatePoint(double, org.apache.commons.math.ode.StepInterpolator)",
      "begin_line": 339,
      "end_line": 356,
      "comment": " Compare a step interval and a double. \n   * @param time point to locate\n   * @param interval step interval\n   * @return -1 if the double is before the interval, 0 if it is in\n   * the interval, and +1 if it is after the interval, according to\n   * the interval direction\n   ",
      "child_ranges": [
        "(line 340,col 5)-(line 348,col 5)",
        "(line 349,col 5)-(line 355,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "initialTime"
      ],
      "begin_line": 359,
      "end_line": 359,
      "comment": " Initial integration time. "
    },
    {
      "type": "field",
      "varNames": [
        "finalTime"
      ],
      "begin_line": 362,
      "end_line": 362,
      "comment": " Final integration time. "
    },
    {
      "type": "field",
      "varNames": [
        "forward"
      ],
      "begin_line": 365,
      "end_line": 365,
      "comment": " Integration direction indicator. "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 368,
      "end_line": 368,
      "comment": " Current interpolator index. "
    },
    {
      "type": "field",
      "varNames": [
        "steps"
      ],
      "begin_line": 371,
      "end_line": 371,
      "comment": " Steps table. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 373,
      "end_line": 373,
      "comment": ""
    }
  ]
}