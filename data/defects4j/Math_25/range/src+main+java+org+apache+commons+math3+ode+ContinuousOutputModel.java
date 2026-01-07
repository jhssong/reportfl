{
  "filepath": "/tmp/Math-25b/src/main/java/org/apache/commons/math3/ode/ContinuousOutputModel.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ContinuousOutputModel",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.sampling.StepHandler",
        "java.io.Serializable"
      ],
      "begin_line": 89,
      "end_line": 360,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "initialTime"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Initial integration time. "
    },
    {
      "type": "field",
      "varNames": [
        "finalTime"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Final integration time. "
    },
    {
      "type": "field",
      "varNames": [
        "forward"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " Integration direction indicator. "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " Current interpolator index. "
    },
    {
      "type": "field",
      "varNames": [
        "steps"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " Steps table. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.ContinuousOutputModel.ContinuousOutputModel()",
      "begin_line": 113,
      "end_line": 119,
      "comment": " Simple constructor.\n   * Build an empty continuous output model.\n   ",
      "child_ranges": [
        "(line 114,col 5)-(line 114,col 46)",
        "(line 115,col 5)-(line 115,col 29)",
        "(line 116,col 5)-(line 116,col 29)",
        "(line 117,col 5)-(line 117,col 23)",
        "(line 118,col 5)-(line 118,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ContinuousOutputModel.append(org.apache.commons.math3.ode.ContinuousOutputModel)",
      "begin_line": 127,
      "end_line": 167,
      "comment": " Append another model at the end of the instance.\n   * @param model model to add at the end of the instance\n   * @exception MathIllegalArgumentException if the model to append is not\n   * compatible with the instance (dimension of the state vector,\n   * propagation direction, hole between the dates)\n   ",
      "child_ranges": [
        "(line 130,col 5)-(line 132,col 5)",
        "(line 134,col 5)-(line 158,col 5)",
        "(line 160,col 5)-(line 162,col 5)",
        "(line 164,col 5)-(line 164,col 29)",
        "(line 165,col 5)-(line 165,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ContinuousOutputModel.init(double, double[], double)",
      "begin_line": 170,
      "end_line": 176,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 171,col 5)-(line 171,col 29)",
        "(line 172,col 5)-(line 172,col 29)",
        "(line 173,col 5)-(line 173,col 23)",
        "(line 174,col 5)-(line 174,col 20)",
        "(line 175,col 5)-(line 175,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ContinuousOutputModel.handleStep(org.apache.commons.math3.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 184,
      "end_line": 198,
      "comment": " Handle the last accepted step.\n   * A copy of the information provided by the last step is stored in\n   * the instance for later use.\n   * @param interpolator interpolator for the last accepted step.\n   * @param isLast true if the step is the last one\n   ",
      "child_ranges": [
        "(line 186,col 5)-(line 189,col 5)",
        "(line 191,col 5)-(line 191,col 35)",
        "(line 193,col 5)-(line 196,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ContinuousOutputModel.getInitialTime()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n   * Get the initial integration time.\n   * @return initial integration time\n   ",
      "child_ranges": [
        "(line 205,col 5)-(line 205,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ContinuousOutputModel.getFinalTime()",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n   * Get the final integration time.\n   * @return final integration time\n   ",
      "child_ranges": [
        "(line 213,col 5)-(line 213,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ContinuousOutputModel.getInterpolatedTime()",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\n   * Get the time of the interpolated point.\n   * If {@link #setInterpolatedTime} has not been called, it returns\n   * the final integration time.\n   * @return interpolation point time\n   ",
      "child_ranges": [
        "(line 223,col 5)-(line 223,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ContinuousOutputModel.setInterpolatedTime(double)",
      "begin_line": 238,
      "end_line": 324,
      "comment": " Set the time of the interpolated point.\n   * \u003cp\u003eThis method should \u003cstrong\u003enot\u003c/strong\u003e be called before the\n   * integration is over because some internal variables are set only\n   * once the last step has been handled.\u003c/p\u003e\n   * \u003cp\u003eSetting the time outside of the integration interval is now\n   * allowed (it was not allowed up to version 5.9 of Mantissa), but\n   * should be used with care since the accuracy of the interpolator\n   * will probably be very poor far from this interval. This allowance\n   * has been added to simplify implementation of search algorithms\n   * near the interval endpoints.\u003c/p\u003e\n   * @param time time of the interpolated point\n   ",
      "child_ranges": [
        "(line 241,col 7)-(line 241,col 19)",
        "(line 242,col 7)-(line 242,col 52)",
        "(line 243,col 7)-(line 243,col 75)",
        "(line 245,col 7)-(line 245,col 34)",
        "(line 246,col 7)-(line 246,col 52)",
        "(line 247,col 7)-(line 247,col 75)",
        "(line 251,col 7)-(line 255,col 7)",
        "(line 256,col 7)-(line 260,col 7)",
        "(line 263,col 7)-(line 314,col 7)",
        "(line 317,col 7)-(line 317,col 19)",
        "(line 318,col 7)-(line 320,col 7)",
        "(line 322,col 7)-(line 322,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ContinuousOutputModel.getInterpolatedState()",
      "begin_line": 330,
      "end_line": 332,
      "comment": "\n   * Get the state vector of the interpolated point.\n   * @return state vector at time {@link #getInterpolatedTime}\n   ",
      "child_ranges": [
        "(line 331,col 5)-(line 331,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ContinuousOutputModel.locatePoint(double, org.apache.commons.math3.ode.sampling.StepInterpolator)",
      "begin_line": 341,
      "end_line": 358,
      "comment": " Compare a step interval and a double.\n   * @param time point to locate\n   * @param interval step interval\n   * @return -1 if the double is before the interval, 0 if it is in\n   * the interval, and +1 if it is after the interval, according to\n   * the interval direction\n   ",
      "child_ranges": [
        "(line 342,col 5)-(line 350,col 5)",
        "(line 351,col 5)-(line 357,col 5)"
      ]
    }
  ]
}