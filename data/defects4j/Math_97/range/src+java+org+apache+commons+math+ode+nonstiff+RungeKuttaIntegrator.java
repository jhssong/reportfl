{
  "filepath": "/tmp/Math-97b/src/java/org/apache/commons/math/ode/nonstiff/RungeKuttaIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RungeKuttaIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderIntegrator"
      ],
      "begin_line": 58,
      "end_line": 307,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.RungeKuttaIntegrator(double[], double[][], double[], org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator, double)",
      "begin_line": 70,
      "end_line": 81,
      "comment": " Simple constructor.\n   * Build a Runge-Kutta integrator with the given\n   * step. The default step handler does nothing.\n   * @param c time steps from Butcher array (without the first zero)\n   * @param a internal weights from Butcher array (without the first empty row)\n   * @param b propagation weights for the high order method from Butcher array\n   * @param prototype prototype of the step interpolator to use\n   * @param step integration step\n   ",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 24)",
        "(line 74,col 5)-(line 74,col 24)",
        "(line 75,col 5)-(line 75,col 24)",
        "(line 76,col 5)-(line 76,col 32)",
        "(line 77,col 5)-(line 77,col 27)",
        "(line 78,col 5)-(line 78,col 53)",
        "(line 79,col 5)-(line 79,col 56)",
        "(line 80,col 5)-(line 80,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.getName()",
      "begin_line": 84,
      "end_line": 84,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.setStepHandler(org.apache.commons.math.ode.sampling.StepHandler)",
      "begin_line": 87,
      "end_line": 89,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.getStepHandler()",
      "begin_line": 92,
      "end_line": 94,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 93,col 5)-(line 93,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.addEventHandler(org.apache.commons.math.ode.events.EventHandler, double, double, int)",
      "begin_line": 97,
      "end_line": 102,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 101,col 5)-(line 101,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.getEventsHandlers()",
      "begin_line": 105,
      "end_line": 107,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 106,col 7)-(line 106,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.clearEventsHandlers()",
      "begin_line": 110,
      "end_line": 112,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 111,col 7)-(line 111,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.sanityChecks(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 122,
      "end_line": 145,
      "comment": " Perform some sanity checks on the integration parameters.\n   * @param equations differential equations set\n   * @param t0 start time\n   * @param y0 state vector at t0\n   * @param t target time for the integration\n   * @param y placeholder where to put the state vector\n   * @exception IntegratorException if some inconsistency is detected\n   ",
      "child_ranges": [
        "(line 125,col 5)-(line 132,col 5)",
        "(line 133,col 5)-(line 140,col 7)",
        "(line 141,col 5)-(line 144,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 148,
      "end_line": 262,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 153,col 5)-(line 153,col 42)",
        "(line 154,col 5)-(line 154,col 37)",
        "(line 157,col 5)-(line 157,col 36)",
        "(line 158,col 5)-(line 160,col 5)",
        "(line 161,col 5)-(line 161,col 50)",
        "(line 162,col 5)-(line 164,col 5)",
        "(line 165,col 5)-(line 165,col 48)",
        "(line 168,col 5)-(line 168,col 42)",
        "(line 169,col 5)-(line 175,col 5)",
        "(line 176,col 5)-(line 176,col 31)",
        "(line 179,col 5)-(line 179,col 76)",
        "(line 180,col 5)-(line 180,col 30)",
        "(line 181,col 5)-(line 181,col 19)",
        "(line 182,col 5)-(line 182,col 34)",
        "(line 183,col 5)-(line 183,col 20)",
        "(line 184,col 5)-(line 258,col 5)",
        "(line 260,col 5)-(line 260,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.getCurrentStepStart()",
      "begin_line": 265,
      "end_line": 267,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 266,col 5)-(line 266,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.getCurrentSignedStepsize()",
      "begin_line": 270,
      "end_line": 272,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 271,col 5)-(line 271,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.resetInternalState()",
      "begin_line": 275,
      "end_line": 278,
      "comment": " Reset internal state to dummy values. ",
      "child_ranges": [
        "(line 276,col 5)-(line 276,col 27)",
        "(line 277,col 5)-(line 277,col 27)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 281,
      "end_line": 281,
      "comment": " Time steps from Butcher array (without the first zero). "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 284,
      "end_line": 284,
      "comment": " Internal weights from Butcher array (without the first empty row). "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 287,
      "end_line": 287,
      "comment": " External weights for the high order method from Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "prototype"
      ],
      "begin_line": 290,
      "end_line": 290,
      "comment": " Prototype of the step interpolator. "
    },
    {
      "type": "field",
      "varNames": [
        "step"
      ],
      "begin_line": 293,
      "end_line": 293,
      "comment": " Integration step. "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 296,
      "end_line": 296,
      "comment": " Step handler. "
    },
    {
      "type": "field",
      "varNames": [
        "eventsHandlersManager"
      ],
      "begin_line": 299,
      "end_line": 299,
      "comment": " Events handlers manager. "
    },
    {
      "type": "field",
      "varNames": [
        "stepStart"
      ],
      "begin_line": 302,
      "end_line": 302,
      "comment": " Current step start time. "
    },
    {
      "type": "field",
      "varNames": [
        "stepSize"
      ],
      "begin_line": 305,
      "end_line": 305,
      "comment": " Current stepsize. "
    }
  ]
}