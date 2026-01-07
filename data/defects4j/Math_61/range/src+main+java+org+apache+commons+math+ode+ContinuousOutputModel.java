{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/ode/ContinuousOutputModel.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ContinuousOutputModel",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler",
        "java.io.Serializable"
      ],
      "begin_line": 88,
      "end_line": 378,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "initialTime"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Initial integration time. "
    },
    {
      "type": "field",
      "varNames": [
        "finalTime"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " Final integration time. "
    },
    {
      "type": "field",
      "varNames": [
        "forward"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " Integration direction indicator. "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " Current interpolator index. "
    },
    {
      "type": "field",
      "varNames": [
        "steps"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " Steps table. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.ContinuousOutputModel()",
      "begin_line": 112,
      "end_line": 115,
      "comment": " Simple constructor.\n   * Build an empty continuous output model.\n   ",
      "child_ranges": [
        "(line 113,col 5)-(line 113,col 46)",
        "(line 114,col 5)-(line 114,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.append(org.apache.commons.math.ode.ContinuousOutputModel)",
      "begin_line": 125,
      "end_line": 167,
      "comment": " Append another model at the end of the instance.\n   * @param model model to add at the end of the instance\n   * @exception DerivativeException if some step interpolators from\n   * the appended model cannot be copied\n   * @exception IllegalArgumentException if the model to append is not\n   * compatible with the instance (dimension of the state vector,\n   * propagation direction, hole between the dates)\n   ",
      "child_ranges": [
        "(line 128,col 5)-(line 130,col 5)",
        "(line 132,col 5)-(line 158,col 5)",
        "(line 160,col 5)-(line 162,col 5)",
        "(line 164,col 5)-(line 164,col 29)",
        "(line 165,col 5)-(line 165,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.requiresDenseOutput()",
      "begin_line": 175,
      "end_line": 177,
      "comment": " Determines whether this handler needs dense output.\n   * \u003cp\u003eThe essence of this class is to provide dense output over all\n   * steps, hence it requires the internal steps to provide themselves\n   * dense output. The method therefore returns always true.\u003c/p\u003e\n   * @return always true\n   ",
      "child_ranges": [
        "(line 176,col 5)-(line 176,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.reset()",
      "begin_line": 183,
      "end_line": 189,
      "comment": " Reset the step handler.\n   * Initialize the internal data as required before the first step is\n   * handled.\n   ",
      "child_ranges": [
        "(line 184,col 5)-(line 184,col 29)",
        "(line 185,col 5)-(line 185,col 29)",
        "(line 186,col 5)-(line 186,col 23)",
        "(line 187,col 5)-(line 187,col 20)",
        "(line 188,col 5)-(line 188,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 199,
      "end_line": 214,
      "comment": " Handle the last accepted step.\n   * A copy of the information provided by the last step is stored in\n   * the instance for later use.\n   * @param interpolator interpolator for the last accepted step.\n   * @param isLast true if the step is the last one\n   * @throws DerivativeException this exception is propagated to the\n   * caller if the underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 202,col 5)-(line 205,col 5)",
        "(line 207,col 5)-(line 207,col 35)",
        "(line 209,col 5)-(line 212,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.getInitialTime()",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\n   * Get the initial integration time.\n   * @return initial integration time\n   ",
      "child_ranges": [
        "(line 221,col 5)-(line 221,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.getFinalTime()",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\n   * Get the final integration time.\n   * @return final integration time\n   ",
      "child_ranges": [
        "(line 229,col 5)-(line 229,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.getInterpolatedTime()",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n   * Get the time of the interpolated point.\n   * If {@link #setInterpolatedTime} has not been called, it returns\n   * the final integration time.\n   * @return interpolation point time\n   ",
      "child_ranges": [
        "(line 239,col 5)-(line 239,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.setInterpolatedTime(double)",
      "begin_line": 254,
      "end_line": 340,
      "comment": " Set the time of the interpolated point.\n   * \u003cp\u003eThis method should \u003cstrong\u003enot\u003c/strong\u003e be called before the\n   * integration is over because some internal variables are set only\n   * once the last step has been handled.\u003c/p\u003e\n   * \u003cp\u003eSetting the time outside of the integration interval is now\n   * allowed (it was not allowed up to version 5.9 of Mantissa), but\n   * should be used with care since the accuracy of the interpolator\n   * will probably be very poor far from this interval. This allowance\n   * has been added to simplify implementation of search algorithms\n   * near the interval endpoints.\u003c/p\u003e\n   * @param time time of the interpolated point\n   ",
      "child_ranges": [
        "(line 257,col 7)-(line 257,col 19)",
        "(line 258,col 7)-(line 258,col 52)",
        "(line 259,col 7)-(line 259,col 75)",
        "(line 261,col 7)-(line 261,col 34)",
        "(line 262,col 7)-(line 262,col 52)",
        "(line 263,col 7)-(line 263,col 75)",
        "(line 267,col 7)-(line 271,col 7)",
        "(line 272,col 7)-(line 276,col 7)",
        "(line 279,col 7)-(line 330,col 7)",
        "(line 333,col 7)-(line 333,col 19)",
        "(line 334,col 7)-(line 336,col 7)",
        "(line 338,col 7)-(line 338,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.getInterpolatedState()",
      "begin_line": 348,
      "end_line": 350,
      "comment": "\n   * Get the state vector of the interpolated point.\n   * @return state vector at time {@link #getInterpolatedTime}\n   * @throws DerivativeException if this call induces an automatic\n   * step finalization that throws one\n   ",
      "child_ranges": [
        "(line 349,col 5)-(line 349,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.locatePoint(double, org.apache.commons.math.ode.sampling.StepInterpolator)",
      "begin_line": 359,
      "end_line": 376,
      "comment": " Compare a step interval and a double.\n   * @param time point to locate\n   * @param interval step interval\n   * @return -1 if the double is before the interval, 0 if it is in\n   * the interval, and +1 if it is after the interval, according to\n   * the interval direction\n   ",
      "child_ranges": [
        "(line 360,col 5)-(line 368,col 5)",
        "(line 369,col 5)-(line 375,col 5)"
      ]
    }
  ]
}