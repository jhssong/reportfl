{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/ode/jacobians/FirstOrderIntegratorWithJacobians.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FirstOrderIntegratorWithJacobians",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 51,
      "end_line": 891,
      "comment": " This class enhances a first order integrator for differential equations to\n * compute also partial derivatives of the solution with respect to initial state\n * and parameters.\n * \u003cp\u003eIn order to compute both the state and its derivatives, the ODE problem\n * is extended with jacobians of the raw ODE and the variational equations are\n * added to form a new compound problem of higher dimension. If the original ODE\n * problem has dimension n and there are p parameters, the compound problem will\n * have dimension n \u0026times; (1 + n + p).\u003c/p\u003e\n * @see ParameterizedODE\n * @see ODEWithJacobians\n * @version $Revision$ $Date$\n * @since 2.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "integrator"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Underlying integrator for compound problem. "
    },
    {
      "type": "field",
      "varNames": [
        "ode"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Raw equations to integrate. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvaluations"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Number of evaluations already performed. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.FirstOrderIntegratorWithJacobians(org.apache.commons.math.ode.FirstOrderIntegrator, org.apache.commons.math.ode.jacobians.ParameterizedODE, double[], double[], double[])",
      "begin_line": 78,
      "end_line": 87,
      "comment": " Build an enhanced integrator using internal differentiation to compute jacobians.\n     * @param integrator underlying integrator to solve the compound problem\n     * @param ode original problem (f in the equation y\u0027 \u003d f(t, y))\n     * @param p parameters array (may be null if {@link\n     * ParameterizedODE#getParametersDimension()\n     * getParametersDimension()} from original problem is zero)\n     * @param hY step sizes to use for computing the jacobian df/dy, must have the\n     * same dimension as the original problem\n     * @param hP step sizes to use for computing the jacobian df/dp, must have the\n     * same dimension as the original problem parameters dimension\n     * @see #FirstOrderIntegratorWithJacobians(FirstOrderIntegrator,\n     * ODEWithJacobians)\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 47)",
        "(line 82,col 9)-(line 82,col 56)",
        "(line 83,col 9)-(line 83,col 57)",
        "(line 84,col 9)-(line 84,col 37)",
        "(line 85,col 9)-(line 85,col 64)",
        "(line 86,col 9)-(line 86,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.FirstOrderIntegratorWithJacobians(org.apache.commons.math.ode.FirstOrderIntegrator, org.apache.commons.math.ode.jacobians.ODEWithJacobians)",
      "begin_line": 95,
      "end_line": 100,
      "comment": " Build an enhanced integrator using ODE builtin jacobian computation features.\n     * @param integrator underlying integrator to solve the compound problem\n     * @param ode original problem, which can compute the jacobians by itself\n     * @see #FirstOrderIntegratorWithJacobians(FirstOrderIntegrator,\n     * ParameterizedODE, double[], double[], double[])\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 37)",
        "(line 98,col 9)-(line 98,col 23)",
        "(line 99,col 9)-(line 99,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.addStepHandler(org.apache.commons.math.ode.jacobians.StepHandlerWithJacobians)",
      "begin_line": 109,
      "end_line": 113,
      "comment": " Add a step handler to this integrator.\n     * \u003cp\u003eThe handler will be called by the integrator for each accepted\n     * step.\u003c/p\u003e\n     * @param handler handler for the accepted steps\n     * @see #getStepHandlers()\n     * @see #clearStepHandlers()\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 41)",
        "(line 111,col 9)-(line 111,col 51)",
        "(line 112,col 9)-(line 112,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.getStepHandlers()",
      "begin_line": 120,
      "end_line": 129,
      "comment": " Get all the step handlers that have been added to the integrator.\n     * @return an unmodifiable collection of the added events handlers\n     * @see #addStepHandler(StepHandlerWithJacobians)\n     * @see #clearStepHandlers()\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 122,col 54)",
        "(line 123,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.clearStepHandlers()",
      "begin_line": 135,
      "end_line": 137,
      "comment": " Remove all the step handlers that have been added to the integrator.\n     * @see #addStepHandler(StepHandlerWithJacobians)\n     * @see #getStepHandlers()\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.addEventHandler(org.apache.commons.math.ode.jacobians.EventHandlerWithJacobians, double, double, int)",
      "begin_line": 150,
      "end_line": 158,
      "comment": " Add an event handler to the integrator.\n     * @param handler event handler\n     * @param maxCheckInterval maximal time interval between switching\n     * function checks (this interval prevents missing sign changes in\n     * case the integration steps becomes very large)\n     * @param convergence convergence threshold in the event time search\n     * @param maxIterationCount upper limit of the iteration count in\n     * the event time search\n     * @see #getEventHandlers()\n     * @see #clearEventHandlers()\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 41)",
        "(line 155,col 9)-(line 155,col 51)",
        "(line 156,col 9)-(line 157,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.getEventHandlers()",
      "begin_line": 165,
      "end_line": 174,
      "comment": " Get all the event handlers that have been added to the integrator.\n     * @return an unmodifiable collection of the added events handlers\n     * @see #addEventHandler(EventHandlerWithJacobians, double, double, int)\n     * @see #clearEventHandlers()\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 167,col 55)",
        "(line 168,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.clearEventHandlers()",
      "begin_line": 180,
      "end_line": 182,
      "comment": " Remove all the event handlers that have been added to the integrator.\n     * @see #addEventHandler(EventHandlerWithJacobians, double, double, int)\n     * @see #getEventHandlers()\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.integrate(double, double[], double[][], double, double[], double[][], double[][])",
      "begin_line": 211,
      "end_line": 256,
      "comment": " Integrate the differential equations and the variational equations up to the given time.\n     * \u003cp\u003eThis method solves an Initial Value Problem (IVP) and also computes the derivatives\n     * of the solution with respect to initial state and parameters. This can be used as\n     * a basis to solve Boundary Value Problems (BVP).\u003c/p\u003e\n     * \u003cp\u003eSince this method stores some internal state variables made\n     * available in its public interface during integration ({@link\n     * #getCurrentSignedStepsize()}), it is \u003cem\u003enot\u003c/em\u003e thread-safe.\u003c/p\u003e\n     * @param t0 initial time\n     * @param y0 initial value of the state vector at t0\n     * @param dY0dP initial value of the state vector derivative with respect to the\n     * parameters at t0\n     * @param t target time for the integration\n     * (can be set to a value smaller than \u003ccode\u003et0\u003c/code\u003e for backward integration)\n     * @param y placeholder where to put the state vector at each successful\n     *  step (and hence at the end of integration), can be the same object as y0\n     * @param dYdY0 placeholder where to put the state vector derivative with respect\n     * to the initial state (dy[i]/dy0[j] is in element array dYdY0[i][j]) at each successful\n     *  step (and hence at the end of integration)\n     * @param dYdP placeholder where to put the state vector derivative with respect\n     * to the parameters (dy[i]/dp[j] is in element array dYdP[i][j]) at each successful\n     *  step (and hence at the end of integration)\n     * @return stop time, will be the same as target time if integration reached its\n     * target, but may be different if some event handler stops it at some point.\n     * @throws IntegratorException if the integrator cannot perform integration\n     * @throws DerivativeException this exception is propagated to the caller if\n     * the underlying user function triggers one\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 41)",
        "(line 217,col 9)-(line 217,col 51)",
        "(line 218,col 9)-(line 218,col 30)",
        "(line 219,col 9)-(line 219,col 29)",
        "(line 220,col 9)-(line 220,col 33)",
        "(line 221,col 9)-(line 221,col 36)",
        "(line 222,col 9)-(line 227,col 9)",
        "(line 235,col 9)-(line 235,col 55)",
        "(line 236,col 9)-(line 236,col 41)",
        "(line 237,col 9)-(line 245,col 9)",
        "(line 248,col 9)-(line 248,col 24)",
        "(line 249,col 9)-(line 249,col 88)",
        "(line 252,col 9)-(line 252,col 49)",
        "(line 254,col 9)-(line 254,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.dispatchCompoundState(double[], double[], double[][], double[][])",
      "begin_line": 264,
      "end_line": 283,
      "comment": " Dispatch a compound state array into state and jacobians arrays.\n     * @param z compound state\n     * @param y raw state array to fill\n     * @param dydy0 jacobian array to fill\n     * @param dydp jacobian array to fill\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 31)",
        "(line 268,col 9)-(line 268,col 37)",
        "(line 271,col 9)-(line 271,col 40)",
        "(line 274,col 9)-(line 276,col 9)",
        "(line 279,col 9)-(line 281,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.getCurrentStepStart()",
      "begin_line": 294,
      "end_line": 296,
      "comment": " Get the current value of the step start time t\u003csub\u003ei\u003c/sub\u003e.\n     * \u003cp\u003eThis method can be called during integration (typically by\n     * the object implementing the {@link FirstOrderDifferentialEquations\n     * differential equations} problem) if the value of the current step that\n     * is attempted is needed.\u003c/p\u003e\n     * \u003cp\u003eThe result is undefined if the method is called outside of\n     * calls to \u003ccode\u003eintegrate\u003c/code\u003e.\u003c/p\u003e\n     * @return current value of the step start time t\u003csub\u003ei\u003c/sub\u003e\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.getCurrentSignedStepsize()",
      "begin_line": 307,
      "end_line": 309,
      "comment": " Get the current signed value of the integration stepsize.\n     * \u003cp\u003eThis method can be called during integration (typically by\n     * the object implementing the {@link FirstOrderDifferentialEquations\n     * differential equations} problem) if the signed value of the current stepsize\n     * that is tried is needed.\u003c/p\u003e\n     * \u003cp\u003eThe result is undefined if the method is called outside of\n     * calls to \u003ccode\u003eintegrate\u003c/code\u003e.\u003c/p\u003e\n     * @return current signed value of the stepsize\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.setMaxEvaluations(int)",
      "begin_line": 319,
      "end_line": 321,
      "comment": " Set the maximal number of differential equations function evaluations.\n     * \u003cp\u003eThe purpose of this method is to avoid infinite loops which can occur\n     * for example when stringent error constraints are set or when lots of\n     * discrete events are triggered, thus leading to many rejected steps.\u003c/p\u003e\n     * @param maxEvaluations maximal number of function evaluations (negative\n     * values are silently converted to maximal integer value, thus representing\n     * almost unlimited evaluations)\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.getMaxEvaluations()",
      "begin_line": 326,
      "end_line": 328,
      "comment": " Get the maximal number of functions evaluations.\n     * @return maximal number of functions evaluations\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.getEvaluations()",
      "begin_line": 337,
      "end_line": 339,
      "comment": " Get the number of evaluations of the differential equations function.\n     * \u003cp\u003e\n     * The number of evaluations corresponds to the last call to the\n     * \u003ccode\u003eintegrate\u003c/code\u003e method. It is 0 if the method has not been called yet.\n     * \u003c/p\u003e\n     * @return number of evaluations of the differential equations function\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.checkDimension(int, java.lang.Object)",
      "begin_line": 346,
      "end_line": 353,
      "comment": " Check array dimensions.\n     * @param expected expected dimension\n     * @param array (may be null if expected is 0)\n     * @throws IllegalArgumentException if the array dimension does not match the expected one\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 74)",
        "(line 349,col 9)-(line 352,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MappingWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderDifferentialEquations"
      ],
      "begin_line": 356,
      "end_line": 441,
      "comment": " Wrapper class used to map state and jacobians into compound state. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 359,
      "end_line": 359,
      "comment": " Current state. "
    },
    {
      "type": "field",
      "varNames": [
        "yDot"
      ],
      "begin_line": 362,
      "end_line": 362,
      "comment": " Time derivative of the current state. "
    },
    {
      "type": "field",
      "varNames": [
        "dFdY"
      ],
      "begin_line": 365,
      "end_line": 365,
      "comment": " Derivatives of yDot with respect to state. "
    },
    {
      "type": "field",
      "varNames": [
        "dFdP"
      ],
      "begin_line": 368,
      "end_line": 368,
      "comment": " Derivatives of yDot with respect to parameters. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.MappingWrapper.MappingWrapper()",
      "begin_line": 372,
      "end_line": 381,
      "comment": " Simple constructor.\n         ",
      "child_ranges": [
        "(line 374,col 13)-(line 374,col 45)",
        "(line 375,col 13)-(line 375,col 55)",
        "(line 376,col 13)-(line 376,col 33)",
        "(line 377,col 13)-(line 377,col 33)",
        "(line 378,col 13)-(line 378,col 36)",
        "(line 379,col 13)-(line 379,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.MappingWrapper.getDimension()",
      "begin_line": 384,
      "end_line": 388,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 385,col 13)-(line 385,col 35)",
        "(line 386,col 13)-(line 386,col 41)",
        "(line 387,col 13)-(line 387,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.MappingWrapper.computeDerivatives(double, double[], double[])",
      "begin_line": 391,
      "end_line": 439,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 394,col 13)-(line 394,col 35)",
        "(line 395,col 13)-(line 395,col 41)",
        "(line 398,col 13)-(line 398,col 50)",
        "(line 399,col 13)-(line 401,col 13)",
        "(line 402,col 13)-(line 402,col 47)",
        "(line 403,col 13)-(line 403,col 57)",
        "(line 406,col 13)-(line 406,col 50)",
        "(line 409,col 13)-(line 421,col 13)",
        "(line 424,col 13)-(line 437,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FiniteDifferencesWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.jacobians.ODEWithJacobians"
      ],
      "begin_line": 444,
      "end_line": 530,
      "comment": " Wrapper class to compute jacobians by finite differences for ODE which do not compute them themselves. "
    },
    {
      "type": "field",
      "varNames": [
        "ode"
      ],
      "begin_line": 448,
      "end_line": 448,
      "comment": " Raw ODE without jacobians computation. "
    },
    {
      "type": "field",
      "varNames": [
        "p"
      ],
      "begin_line": 451,
      "end_line": 451,
      "comment": " Parameters array (may be null if parameters dimension from original problem is zero) "
    },
    {
      "type": "field",
      "varNames": [
        "hY"
      ],
      "begin_line": 454,
      "end_line": 454,
      "comment": " Step sizes to use for computing the jacobian df/dy. "
    },
    {
      "type": "field",
      "varNames": [
        "hP"
      ],
      "begin_line": 457,
      "end_line": 457,
      "comment": " Step sizes to use for computing the jacobian df/dp. "
    },
    {
      "type": "field",
      "varNames": [
        "tmpDot"
      ],
      "begin_line": 460,
      "end_line": 460,
      "comment": " Temporary array for state derivatives used to compute jacobians. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.FiniteDifferencesWrapper.FiniteDifferencesWrapper(org.apache.commons.math.ode.jacobians.ParameterizedODE, double[], double[], double[])",
      "begin_line": 468,
      "end_line": 475,
      "comment": " Simple constructor.\n         * @param ode original ODE problem, without jacobians computations\n         * @param p parameters array (may be null if parameters dimension from original problem is zero)\n         * @param hY step sizes to use for computing the jacobian df/dy\n         * @param hP step sizes to use for computing the jacobian df/dp\n         ",
      "child_ranges": [
        "(line 470,col 13)-(line 470,col 27)",
        "(line 471,col 13)-(line 471,col 32)",
        "(line 472,col 13)-(line 472,col 33)",
        "(line 473,col 13)-(line 473,col 33)",
        "(line 474,col 13)-(line 474,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.FiniteDifferencesWrapper.getDimension()",
      "begin_line": 478,
      "end_line": 480,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 479,col 13)-(line 479,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.FiniteDifferencesWrapper.computeDerivatives(double, double[], double[])",
      "begin_line": 483,
      "end_line": 487,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 486,col 13)-(line 486,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.FiniteDifferencesWrapper.getParametersDimension()",
      "begin_line": 490,
      "end_line": 492,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 491,col 13)-(line 491,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.FiniteDifferencesWrapper.computeJacobians(double, double[], double[], double[][], double[][])",
      "begin_line": 495,
      "end_line": 528,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 499,col 13)-(line 499,col 36)",
        "(line 500,col 13)-(line 500,col 36)",
        "(line 502,col 13)-(line 502,col 33)",
        "(line 503,col 13)-(line 505,col 13)",
        "(line 508,col 13)-(line 516,col 13)",
        "(line 519,col 13)-(line 526,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StepHandlerWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 533,
      "end_line": 579,
      "comment": " Wrapper for step handlers. "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 536,
      "end_line": 536,
      "comment": " Underlying step handler with jacobians. "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 539,
      "end_line": 539,
      "comment": " Dimension of the original ODE. "
    },
    {
      "type": "field",
      "varNames": [
        "k"
      ],
      "begin_line": 542,
      "end_line": 542,
      "comment": " Number of parameters. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepHandlerWrapper.StepHandlerWrapper(org.apache.commons.math.ode.jacobians.StepHandlerWithJacobians, int, int)",
      "begin_line": 549,
      "end_line": 554,
      "comment": " Simple constructor.\n         * @param handler underlying step handler with jacobians\n         * @param n dimension of the original ODE\n         * @param k number of parameters\n         ",
      "child_ranges": [
        "(line 551,col 13)-(line 551,col 35)",
        "(line 552,col 13)-(line 552,col 29)",
        "(line 553,col 13)-(line 553,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepHandlerWrapper.getHandler()",
      "begin_line": 559,
      "end_line": 561,
      "comment": " Get the underlying step handler with jacobians.\n         * @return underlying step handler with jacobians\n         ",
      "child_ranges": [
        "(line 560,col 13)-(line 560,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepHandlerWrapper.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 564,
      "end_line": 567,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 566,col 13)-(line 566,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepHandlerWrapper.requiresDenseOutput()",
      "begin_line": 570,
      "end_line": 572,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 571,col 13)-(line 571,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepHandlerWrapper.reset()",
      "begin_line": 575,
      "end_line": 577,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 576,col 13)-(line 576,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StepInterpolatorWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.jacobians.StepInterpolatorWithJacobians"
      ],
      "begin_line": 582,
      "end_line": 831,
      "comment": " Wrapper for step interpolators. "
    },
    {
      "type": "field",
      "varNames": [
        "interpolator"
      ],
      "begin_line": 586,
      "end_line": 586,
      "comment": " Wrapped interpolator. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 589,
      "end_line": 589,
      "comment": " State array. "
    },
    {
      "type": "field",
      "varNames": [
        "dydy0"
      ],
      "begin_line": 592,
      "end_line": 592,
      "comment": " Jacobian with respect to initial state dy/dy0. "
    },
    {
      "type": "field",
      "varNames": [
        "dydp"
      ],
      "begin_line": 595,
      "end_line": 595,
      "comment": " Jacobian with respect to parameters dy/dp. "
    },
    {
      "type": "field",
      "varNames": [
        "yDot"
      ],
      "begin_line": 598,
      "end_line": 598,
      "comment": " Time derivative of the state array. "
    },
    {
      "type": "field",
      "varNames": [
        "dydy0Dot"
      ],
      "begin_line": 601,
      "end_line": 601,
      "comment": " Time derivative of the sacobian with respect to initial state dy/dy0. "
    },
    {
      "type": "field",
      "varNames": [
        "dydpDot"
      ],
      "begin_line": 604,
      "end_line": 604,
      "comment": " Time derivative of the jacobian with respect to parameters dy/dp. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.StepInterpolatorWrapper()",
      "begin_line": 609,
      "end_line": 611,
      "comment": " Simple constructor.\n         * \u003cp\u003eThis constructor is used only for externalization. It does nothing.\u003c/p\u003e\n         ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.StepInterpolatorWrapper(org.apache.commons.math.ode.sampling.StepInterpolator, int, int)",
      "begin_line": 618,
      "end_line": 627,
      "comment": " Simple constructor.\n         * @param interpolator wrapped interpolator\n         * @param n dimension of the original ODE\n         * @param k number of parameters\n         ",
      "child_ranges": [
        "(line 620,col 13)-(line 620,col 45)",
        "(line 621,col 13)-(line 621,col 37)",
        "(line 622,col 13)-(line 622,col 40)",
        "(line 623,col 13)-(line 623,col 40)",
        "(line 624,col 13)-(line 624,col 37)",
        "(line 625,col 13)-(line 625,col 40)",
        "(line 626,col 13)-(line 626,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.setInterpolatedTime(double)",
      "begin_line": 630,
      "end_line": 632,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 631,col 13)-(line 631,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.isForward()",
      "begin_line": 635,
      "end_line": 637,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 636,col 13)-(line 636,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.getPreviousTime()",
      "begin_line": 640,
      "end_line": 642,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 641,col 13)-(line 641,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.getInterpolatedTime()",
      "begin_line": 645,
      "end_line": 647,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 646,col 13)-(line 646,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.getInterpolatedY()",
      "begin_line": 650,
      "end_line": 654,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 651,col 13)-(line 651,col 73)",
        "(line 652,col 13)-(line 652,col 63)",
        "(line 653,col 13)-(line 653,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.getInterpolatedDyDy0()",
      "begin_line": 657,
      "end_line": 666,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 658,col 13)-(line 658,col 73)",
        "(line 659,col 13)-(line 659,col 35)",
        "(line 660,col 13)-(line 660,col 26)",
        "(line 661,col 13)-(line 664,col 13)",
        "(line 665,col 13)-(line 665,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.getInterpolatedDyDp()",
      "begin_line": 669,
      "end_line": 679,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 670,col 13)-(line 670,col 73)",
        "(line 671,col 13)-(line 671,col 35)",
        "(line 672,col 13)-(line 672,col 41)",
        "(line 673,col 13)-(line 673,col 36)",
        "(line 674,col 13)-(line 677,col 13)",
        "(line 678,col 13)-(line 678,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.getInterpolatedYDot()",
      "begin_line": 682,
      "end_line": 686,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 683,col 13)-(line 683,col 85)",
        "(line 684,col 13)-(line 684,col 75)",
        "(line 685,col 13)-(line 685,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.getInterpolatedDyDy0Dot()",
      "begin_line": 689,
      "end_line": 698,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 690,col 13)-(line 690,col 85)",
        "(line 691,col 13)-(line 691,col 35)",
        "(line 692,col 13)-(line 692,col 26)",
        "(line 693,col 13)-(line 696,col 13)",
        "(line 697,col 13)-(line 697,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.getInterpolatedDyDpDot()",
      "begin_line": 701,
      "end_line": 711,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 702,col 13)-(line 702,col 85)",
        "(line 703,col 13)-(line 703,col 35)",
        "(line 704,col 13)-(line 704,col 44)",
        "(line 705,col 13)-(line 705,col 36)",
        "(line 706,col 13)-(line 709,col 13)",
        "(line 710,col 13)-(line 710,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.getCurrentTime()",
      "begin_line": 714,
      "end_line": 716,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 715,col 13)-(line 715,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.copy()",
      "begin_line": 719,
      "end_line": 731,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 720,col 13)-(line 720,col 35)",
        "(line 721,col 13)-(line 721,col 41)",
        "(line 722,col 13)-(line 723,col 71)",
        "(line 724,col 13)-(line 724,col 42)",
        "(line 725,col 13)-(line 725,col 46)",
        "(line 726,col 13)-(line 726,col 45)",
        "(line 727,col 13)-(line 727,col 45)",
        "(line 728,col 13)-(line 728,col 49)",
        "(line 729,col 13)-(line 729,col 48)",
        "(line 730,col 13)-(line 730,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.writeExternal(java.io.ObjectOutput)",
      "begin_line": 734,
      "end_line": 744,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 735,col 13)-(line 735,col 42)",
        "(line 736,col 13)-(line 736,col 35)",
        "(line 737,col 13)-(line 737,col 41)",
        "(line 738,col 13)-(line 738,col 31)",
        "(line 739,col 13)-(line 739,col 35)",
        "(line 740,col 13)-(line 740,col 34)",
        "(line 741,col 13)-(line 741,col 34)",
        "(line 742,col 13)-(line 742,col 38)",
        "(line 743,col 13)-(line 743,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.readExternal(java.io.ObjectInput)",
      "begin_line": 747,
      "end_line": 763,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 748,col 13)-(line 748,col 62)",
        "(line 749,col 13)-(line 749,col 39)",
        "(line 750,col 13)-(line 750,col 39)",
        "(line 751,col 13)-(line 751,col 37)",
        "(line 752,col 13)-(line 752,col 40)",
        "(line 753,col 13)-(line 753,col 40)",
        "(line 754,col 13)-(line 754,col 37)",
        "(line 755,col 13)-(line 755,col 40)",
        "(line 756,col 13)-(line 756,col 40)",
        "(line 757,col 13)-(line 757,col 29)",
        "(line 758,col 13)-(line 758,col 33)",
        "(line 759,col 13)-(line 759,col 32)",
        "(line 760,col 13)-(line 760,col 32)",
        "(line 761,col 13)-(line 761,col 36)",
        "(line 762,col 13)-(line 762,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.copyArray(double[], double[])",
      "begin_line": 769,
      "end_line": 771,
      "comment": " Copy an array.\n         * @param src source array\n         * @param dest destination array\n         ",
      "child_ranges": [
        "(line 770,col 13)-(line 770,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.copyArray(double[][], double[][])",
      "begin_line": 777,
      "end_line": 781,
      "comment": " Copy an array.\n         * @param src source array\n         * @param dest destination array\n         ",
      "child_ranges": [
        "(line 778,col 13)-(line 780,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.writeArray(java.io.ObjectOutput, double[])",
      "begin_line": 788,
      "end_line": 793,
      "comment": " Write an array.\n         * @param out output stream\n         * @param array array to write\n         * @exception IOException if array cannot be read\n         ",
      "child_ranges": [
        "(line 790,col 13)-(line 792,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.writeArray(java.io.ObjectOutput, double[][])",
      "begin_line": 800,
      "end_line": 805,
      "comment": " Write an array.\n         * @param out output stream\n         * @param array array to write\n         * @exception IOException if array cannot be read\n         ",
      "child_ranges": [
        "(line 802,col 13)-(line 804,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.readArray(java.io.ObjectInput, double[])",
      "begin_line": 812,
      "end_line": 817,
      "comment": " Read an array.\n         * @param in input stream\n         * @param array array to read\n         * @exception IOException if array cannot be read\n         ",
      "child_ranges": [
        "(line 814,col 13)-(line 816,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.readArray(java.io.ObjectInput, double[][])",
      "begin_line": 824,
      "end_line": 829,
      "comment": " Read an array.\n         * @param in input stream\n         * @param array array to read\n         * @exception IOException if array cannot be read\n         ",
      "child_ranges": [
        "(line 826,col 13)-(line 828,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EventHandlerWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.events.EventHandler"
      ],
      "begin_line": 834,
      "end_line": 889,
      "comment": " Wrapper for event handlers. "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 837,
      "end_line": 837,
      "comment": " Underlying event handler with jacobians. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 840,
      "end_line": 840,
      "comment": " State array. "
    },
    {
      "type": "field",
      "varNames": [
        "dydy0"
      ],
      "begin_line": 843,
      "end_line": 843,
      "comment": " Jacobian with respect to initial state dy/dy0. "
    },
    {
      "type": "field",
      "varNames": [
        "dydp"
      ],
      "begin_line": 846,
      "end_line": 846,
      "comment": " Jacobian with respect to parameters dy/dp. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.EventHandlerWrapper.EventHandlerWrapper(org.apache.commons.math.ode.jacobians.EventHandlerWithJacobians, int, int)",
      "begin_line": 853,
      "end_line": 859,
      "comment": " Simple constructor.\n         * @param handler underlying event handler with jacobians\n         * @param n dimension of the original ODE\n         * @param k number of parameters\n         ",
      "child_ranges": [
        "(line 855,col 13)-(line 855,col 35)",
        "(line 856,col 13)-(line 856,col 37)",
        "(line 857,col 13)-(line 857,col 40)",
        "(line 858,col 13)-(line 858,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.EventHandlerWrapper.getHandler()",
      "begin_line": 864,
      "end_line": 866,
      "comment": " Get the underlying event handler with jacobians.\n         * @return underlying event handler with jacobians\n         ",
      "child_ranges": [
        "(line 865,col 13)-(line 865,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.EventHandlerWrapper.eventOccurred(double, double[], boolean)",
      "begin_line": 869,
      "end_line": 873,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 871,col 13)-(line 871,col 53)",
        "(line 872,col 13)-(line 872,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.EventHandlerWrapper.g(double, double[])",
      "begin_line": 876,
      "end_line": 880,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 878,col 13)-(line 878,col 53)",
        "(line 879,col 13)-(line 879,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.EventHandlerWrapper.resetState(double, double[])",
      "begin_line": 883,
      "end_line": 887,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 885,col 13)-(line 885,col 53)",
        "(line 886,col 13)-(line 886,col 50)"
      ]
    }
  ]
}