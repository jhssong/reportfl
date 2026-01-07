{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/ode/RungeKuttaIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RungeKuttaIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderIntegrator"
      ],
      "begin_line": 46,
      "end_line": 300,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.RungeKuttaIntegrator.RungeKuttaIntegrator(double[], double[][], double[], org.apache.commons.math.ode.RungeKuttaStepInterpolator, double)",
      "begin_line": 58,
      "end_line": 69,
      "comment": " Simple constructor.\n   * Build a Runge-Kutta integrator with the given\n   * step. The default step handler does nothing.\n   * @param c time steps from Butcher array (without the first zero)\n   * @param a internal weights from Butcher array (without the first empty row)\n   * @param b external weights for the high order method from Butcher array\n   * @param prototype prototype of the step interpolator to use\n   * @param step integration step\n   ",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 24)",
        "(line 62,col 5)-(line 62,col 24)",
        "(line 63,col 5)-(line 63,col 24)",
        "(line 64,col 5)-(line 64,col 32)",
        "(line 65,col 5)-(line 65,col 27)",
        "(line 66,col 5)-(line 66,col 53)",
        "(line 67,col 5)-(line 67,col 54)",
        "(line 68,col 5)-(line 68,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaIntegrator.getName()",
      "begin_line": 74,
      "end_line": 74,
      "comment": " Get the name of the method.\n   * @return name of the method\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaIntegrator.setStepHandler(org.apache.commons.math.ode.StepHandler)",
      "begin_line": 81,
      "end_line": 83,
      "comment": " Set the step handler for this integrator.\n   * The handler will be called by the integrator for each accepted\n   * step.\n   * @param handler handler for the accepted steps\n   ",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaIntegrator.getStepHandler()",
      "begin_line": 88,
      "end_line": 90,
      "comment": " Get the step handler for this integrator.\n   * @return the step handler for this integrator\n   ",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaIntegrator.addSwitchingFunction(org.apache.commons.math.ode.SwitchingFunction, double, double, int)",
      "begin_line": 101,
      "end_line": 106,
      "comment": " Add a switching function to the integrator.\n   * @param function switching function\n   * @param maxCheckInterval maximal time interval between switching\n   * function checks (this interval prevents missing sign changes in\n   * case the integration steps becomes very large)\n   * @param convergence convergence threshold in the event time search\n   * @param maxIterationCount upper limit of the iteration count in\n   * the event time search\n   ",
      "child_ranges": [
        "(line 105,col 5)-(line 105,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaIntegrator.sanityChecks(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 116,
      "end_line": 141,
      "comment": " Perform some sanity checks on the integration parameters.\n   * @param equations differential equations set\n   * @param t0 start time\n   * @param y0 state vector at t0\n   * @param t target time for the integration\n   * @param y placeholder where to put the state vector\n   * @exception IntegratorException if some inconsistency is detected\n   ",
      "child_ranges": [
        "(line 119,col 5)-(line 126,col 5)",
        "(line 127,col 5)-(line 134,col 7)",
        "(line 135,col 5)-(line 140,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 143,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 148,col 5)-(line 148,col 42)",
        "(line 149,col 5)-(line 149,col 31)",
        "(line 152,col 5)-(line 152,col 30)",
        "(line 153,col 5)-(line 155,col 5)",
        "(line 156,col 5)-(line 156,col 44)",
        "(line 157,col 5)-(line 159,col 5)",
        "(line 160,col 5)-(line 160,col 42)",
        "(line 163,col 5)-(line 163,col 42)",
        "(line 164,col 5)-(line 170,col 5)",
        "(line 171,col 5)-(line 171,col 31)",
        "(line 174,col 5)-(line 174,col 76)",
        "(line 175,col 5)-(line 175,col 30)",
        "(line 176,col 5)-(line 176,col 19)",
        "(line 177,col 5)-(line 177,col 34)",
        "(line 178,col 5)-(line 178,col 20)",
        "(line 179,col 5)-(line 253,col 5)",
        "(line 255,col 5)-(line 255,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaIntegrator.getCurrentStepStart()",
      "begin_line": 259,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 260,col 5)-(line 260,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaIntegrator.getCurrentSignedStepsize()",
      "begin_line": 263,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 264,col 5)-(line 264,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaIntegrator.resetInternalState()",
      "begin_line": 268,
      "end_line": 271,
      "comment": " Reset internal state to dummy values. ",
      "child_ranges": [
        "(line 269,col 5)-(line 269,col 27)",
        "(line 270,col 5)-(line 270,col 27)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 274,
      "end_line": 274,
      "comment": " Time steps from Butcher array (without the first zero). "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 277,
      "end_line": 277,
      "comment": " Internal weights from Butcher array (without the first empty row). "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 280,
      "end_line": 280,
      "comment": " External weights for the high order method from Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "prototype"
      ],
      "begin_line": 283,
      "end_line": 283,
      "comment": " Prototype of the step interpolator. "
    },
    {
      "type": "field",
      "varNames": [
        "step"
      ],
      "begin_line": 286,
      "end_line": 286,
      "comment": " Integration step. "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 289,
      "end_line": 289,
      "comment": " Step handler. "
    },
    {
      "type": "field",
      "varNames": [
        "switchesHandler"
      ],
      "begin_line": 292,
      "end_line": 292,
      "comment": " Switching functions handler. "
    },
    {
      "type": "field",
      "varNames": [
        "stepStart"
      ],
      "begin_line": 295,
      "end_line": 295,
      "comment": " Current step start time. "
    },
    {
      "type": "field",
      "varNames": [
        "stepSize"
      ],
      "begin_line": 298,
      "end_line": 298,
      "comment": " Current stepsize. "
    }
  ]
}