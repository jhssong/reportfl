{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/ContinuousOutputModel.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ContinuousOutputModel",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.sampling.StepHandler",
        "java.io.Serializable"
      ],
      "begin_line": 90,
      "end_line": 383,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "initialTime"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Initial integration time. "
    },
    {
      "type": "field",
      "varNames": [
        "finalTime"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Final integration time. "
    },
    {
      "type": "field",
      "varNames": [
        "forward"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Integration direction indicator. "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " Current interpolator index. "
    },
    {
      "type": "field",
      "varNames": [
        "steps"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " Steps table. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.ContinuousOutputModel.ContinuousOutputModel()",
      "begin_line": 114,
      "end_line": 120,
      "comment": " Simple constructor.\n   * Build an empty continuous output model.\n   ",
      "child_ranges": [
        "(line 115,col 5)-(line 115,col 46)",
        "(line 116,col 5)-(line 116,col 29)",
        "(line 117,col 5)-(line 117,col 29)",
        "(line 118,col 5)-(line 118,col 23)",
        "(line 119,col 5)-(line 119,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ContinuousOutputModel.append(org.apache.commons.math3.ode.ContinuousOutputModel)",
      "begin_line": 130,
      "end_line": 170,
      "comment": " Append another model at the end of the instance.\n   * @param model model to add at the end of the instance\n   * @exception MathIllegalArgumentException if the model to append is not\n   * compatible with the instance (dimension of the state vector,\n   * propagation direction, hole between the dates)\n   * @exception MaxCountExceededException if the number of functions evaluations is exceeded\n   * during step finalization\n   ",
      "child_ranges": [
        "(line 133,col 5)-(line 135,col 5)",
        "(line 137,col 5)-(line 161,col 5)",
        "(line 163,col 5)-(line 165,col 5)",
        "(line 167,col 5)-(line 167,col 29)",
        "(line 168,col 5)-(line 168,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ContinuousOutputModel.init(double, double[], double)",
      "begin_line": 173,
      "end_line": 179,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 174,col 5)-(line 174,col 29)",
        "(line 175,col 5)-(line 175,col 29)",
        "(line 176,col 5)-(line 176,col 23)",
        "(line 177,col 5)-(line 177,col 20)",
        "(line 178,col 5)-(line 178,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ContinuousOutputModel.handleStep(org.apache.commons.math3.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 189,
      "end_line": 204,
      "comment": " Handle the last accepted step.\n   * A copy of the information provided by the last step is stored in\n   * the instance for later use.\n   * @param interpolator interpolator for the last accepted step.\n   * @param isLast true if the step is the last one\n   * @exception MaxCountExceededException if the number of functions evaluations is exceeded\n   * during step finalization\n   ",
      "child_ranges": [
        "(line 192,col 5)-(line 195,col 5)",
        "(line 197,col 5)-(line 197,col 35)",
        "(line 199,col 5)-(line 202,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ContinuousOutputModel.getInitialTime()",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\n   * Get the initial integration time.\n   * @return initial integration time\n   ",
      "child_ranges": [
        "(line 211,col 5)-(line 211,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ContinuousOutputModel.getFinalTime()",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\n   * Get the final integration time.\n   * @return final integration time\n   ",
      "child_ranges": [
        "(line 219,col 5)-(line 219,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ContinuousOutputModel.getInterpolatedTime()",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\n   * Get the time of the interpolated point.\n   * If {@link #setInterpolatedTime} has not been called, it returns\n   * the final integration time.\n   * @return interpolation point time\n   ",
      "child_ranges": [
        "(line 229,col 5)-(line 229,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ContinuousOutputModel.setInterpolatedTime(double)",
      "begin_line": 244,
      "end_line": 330,
      "comment": " Set the time of the interpolated point.\n   * \u003cp\u003eThis method should \u003cstrong\u003enot\u003c/strong\u003e be called before the\n   * integration is over because some internal variables are set only\n   * once the last step has been handled.\u003c/p\u003e\n   * \u003cp\u003eSetting the time outside of the integration interval is now\n   * allowed (it was not allowed up to version 5.9 of Mantissa), but\n   * should be used with care since the accuracy of the interpolator\n   * will probably be very poor far from this interval. This allowance\n   * has been added to simplify implementation of search algorithms\n   * near the interval endpoints.\u003c/p\u003e\n   * @param time time of the interpolated point\n   ",
      "child_ranges": [
        "(line 247,col 7)-(line 247,col 19)",
        "(line 248,col 7)-(line 248,col 52)",
        "(line 249,col 7)-(line 249,col 75)",
        "(line 251,col 7)-(line 251,col 34)",
        "(line 252,col 7)-(line 252,col 52)",
        "(line 253,col 7)-(line 253,col 75)",
        "(line 257,col 7)-(line 261,col 7)",
        "(line 262,col 7)-(line 266,col 7)",
        "(line 269,col 7)-(line 320,col 7)",
        "(line 323,col 7)-(line 323,col 19)",
        "(line 324,col 7)-(line 326,col 7)",
        "(line 328,col 7)-(line 328,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ContinuousOutputModel.getInterpolatedState()",
      "begin_line": 338,
      "end_line": 340,
      "comment": "\n   * Get the state vector of the interpolated point.\n   * @return state vector at time {@link #getInterpolatedTime}\n   * @exception MaxCountExceededException if the number of functions evaluations is exceeded\n   * @see #getInterpolatedSecondaryState(int)\n   ",
      "child_ranges": [
        "(line 339,col 5)-(line 339,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ContinuousOutputModel.getInterpolatedSecondaryState(int)",
      "begin_line": 352,
      "end_line": 355,
      "comment": " Get the interpolated secondary state corresponding to the secondary equations.\n   * @param secondaryStateIndex index of the secondary set, as returned by {@link\n   * org.apache.commons.math3.ode.ExpandableStatefulODE#addSecondaryEquations(\n   * org.apache.commons.math3.ode.SecondaryEquations)\n   * ExpandableStatefulODE.addSecondaryEquations(SecondaryEquations)}\n   * @return interpolated secondary state at the current interpolation date\n   * @see #getInterpolatedState()\n   * @since 3.2\n   * @exception MaxCountExceededException if the number of functions evaluations is exceeded\n   ",
      "child_ranges": [
        "(line 354,col 5)-(line 354,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.ContinuousOutputModel.locatePoint(double, org.apache.commons.math3.ode.sampling.StepInterpolator)",
      "begin_line": 364,
      "end_line": 381,
      "comment": " Compare a step interval and a double.\n   * @param time point to locate\n   * @param interval step interval\n   * @return -1 if the double is before the interval, 0 if it is in\n   * the interval, and +1 if it is after the interval, according to\n   * the interval direction\n   ",
      "child_ranges": [
        "(line 365,col 5)-(line 373,col 5)",
        "(line 374,col 5)-(line 380,col 5)"
      ]
    }
  ]
}