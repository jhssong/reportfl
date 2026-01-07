{
  "filepath": "/tmp/Math-46b/src/main/java/org/apache/commons/math/ode/ContinuousOutputModel.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ContinuousOutputModel",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler",
        "java.io.Serializable"
      ],
      "begin_line": 89,
      "end_line": 369,
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
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.ContinuousOutputModel()",
      "begin_line": 113,
      "end_line": 116,
      "comment": " Simple constructor.\n   * Build an empty continuous output model.\n   ",
      "child_ranges": [
        "(line 114,col 5)-(line 114,col 46)",
        "(line 115,col 5)-(line 115,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.append(org.apache.commons.math.ode.ContinuousOutputModel)",
      "begin_line": 126,
      "end_line": 168,
      "comment": " Append another model at the end of the instance.\n   * @param model model to add at the end of the instance\n   * @exception MathUserException if user code called from step interpolator\n   * finalization triggers one\n   * @exception IllegalArgumentException if the model to append is not\n   * compatible with the instance (dimension of the state vector,\n   * propagation direction, hole between the dates)\n   ",
      "child_ranges": [
        "(line 129,col 5)-(line 131,col 5)",
        "(line 133,col 5)-(line 159,col 5)",
        "(line 161,col 5)-(line 163,col 5)",
        "(line 165,col 5)-(line 165,col 29)",
        "(line 166,col 5)-(line 166,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.reset()",
      "begin_line": 174,
      "end_line": 180,
      "comment": " Reset the step handler.\n   * Initialize the internal data as required before the first step is\n   * handled.\n   ",
      "child_ranges": [
        "(line 175,col 5)-(line 175,col 29)",
        "(line 176,col 5)-(line 176,col 29)",
        "(line 177,col 5)-(line 177,col 23)",
        "(line 178,col 5)-(line 178,col 20)",
        "(line 179,col 5)-(line 179,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 190,
      "end_line": 205,
      "comment": " Handle the last accepted step.\n   * A copy of the information provided by the last step is stored in\n   * the instance for later use.\n   * @param interpolator interpolator for the last accepted step.\n   * @param isLast true if the step is the last one\n   * @exception MathUserException if user code called from step interpolator\n   * finalization triggers one\n   ",
      "child_ranges": [
        "(line 193,col 5)-(line 196,col 5)",
        "(line 198,col 5)-(line 198,col 35)",
        "(line 200,col 5)-(line 203,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.getInitialTime()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\n   * Get the initial integration time.\n   * @return initial integration time\n   ",
      "child_ranges": [
        "(line 212,col 5)-(line 212,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.getFinalTime()",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\n   * Get the final integration time.\n   * @return final integration time\n   ",
      "child_ranges": [
        "(line 220,col 5)-(line 220,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.getInterpolatedTime()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n   * Get the time of the interpolated point.\n   * If {@link #setInterpolatedTime} has not been called, it returns\n   * the final integration time.\n   * @return interpolation point time\n   ",
      "child_ranges": [
        "(line 230,col 5)-(line 230,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.setInterpolatedTime(double)",
      "begin_line": 245,
      "end_line": 331,
      "comment": " Set the time of the interpolated point.\n   * \u003cp\u003eThis method should \u003cstrong\u003enot\u003c/strong\u003e be called before the\n   * integration is over because some internal variables are set only\n   * once the last step has been handled.\u003c/p\u003e\n   * \u003cp\u003eSetting the time outside of the integration interval is now\n   * allowed (it was not allowed up to version 5.9 of Mantissa), but\n   * should be used with care since the accuracy of the interpolator\n   * will probably be very poor far from this interval. This allowance\n   * has been added to simplify implementation of search algorithms\n   * near the interval endpoints.\u003c/p\u003e\n   * @param time time of the interpolated point\n   ",
      "child_ranges": [
        "(line 248,col 7)-(line 248,col 19)",
        "(line 249,col 7)-(line 249,col 52)",
        "(line 250,col 7)-(line 250,col 75)",
        "(line 252,col 7)-(line 252,col 34)",
        "(line 253,col 7)-(line 253,col 52)",
        "(line 254,col 7)-(line 254,col 75)",
        "(line 258,col 7)-(line 262,col 7)",
        "(line 263,col 7)-(line 267,col 7)",
        "(line 270,col 7)-(line 321,col 7)",
        "(line 324,col 7)-(line 324,col 19)",
        "(line 325,col 7)-(line 327,col 7)",
        "(line 329,col 7)-(line 329,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.getInterpolatedState()",
      "begin_line": 339,
      "end_line": 341,
      "comment": "\n   * Get the state vector of the interpolated point.\n   * @return state vector at time {@link #getInterpolatedTime}\n   * @exception MathUserException if user code called from step interpolator\n   * finalization triggers one\n   ",
      "child_ranges": [
        "(line 340,col 5)-(line 340,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ContinuousOutputModel.locatePoint(double, org.apache.commons.math.ode.sampling.StepInterpolator)",
      "begin_line": 350,
      "end_line": 367,
      "comment": " Compare a step interval and a double.\n   * @param time point to locate\n   * @param interval step interval\n   * @return -1 if the double is before the interval, 0 if it is in\n   * the interval, and +1 if it is after the interval, according to\n   * the interval direction\n   ",
      "child_ranges": [
        "(line 351,col 5)-(line 359,col 5)",
        "(line 360,col 5)-(line 366,col 5)"
      ]
    }
  ]
}