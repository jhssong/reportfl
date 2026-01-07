{
  "filepath": "/tmp/Math-66b/src/main/java/org/apache/commons/math/ode/jacobians/FirstOrderIntegratorWithJacobians.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FirstOrderIntegratorWithJacobians",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 53,
      "end_line": 897,
      "comment": " This class enhances a first order integrator for differential equations to\n * compute also partial derivatives of the solution with respect to initial state\n * and parameters.\n * \u003cp\u003eIn order to compute both the state and its derivatives, the ODE problem\n * is extended with jacobians of the raw ODE and the variational equations are\n * added to form a new compound problem of higher dimension. If the original ODE\n * problem has dimension n and there are p parameters, the compound problem will\n * have dimension n \u0026times; (1 + n + p).\u003c/p\u003e\n * @see ParameterizedODE\n * @see ODEWithJacobians\n * @version $Revision$ $Date$\n * @since 2.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "integrator"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Underlying integrator for compound problem. "
    },
    {
      "type": "field",
      "varNames": [
        "ode"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Raw equations to integrate. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvaluations"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Number of evaluations already performed. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.FirstOrderIntegratorWithJacobians(org.apache.commons.math.ode.FirstOrderIntegrator, org.apache.commons.math.ode.jacobians.ParameterizedODE, double[], double[], double[])",
      "begin_line": 80,
      "end_line": 89,
      "comment": " Build an enhanced integrator using internal differentiation to compute jacobians.\n     * @param integrator underlying integrator to solve the compound problem\n     * @param ode original problem (f in the equation y\u0027 \u003d f(t, y))\n     * @param p parameters array (may be null if {@link\n     * ParameterizedODE#getParametersDimension()\n     * getParametersDimension()} from original problem is zero)\n     * @param hY step sizes to use for computing the jacobian df/dy, must have the\n     * same dimension as the original problem\n     * @param hP step sizes to use for computing the jacobian df/dp, must have the\n     * same dimension as the original problem parameters dimension\n     * @see #FirstOrderIntegratorWithJacobians(FirstOrderIntegrator,\n     * ODEWithJacobians)\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 47)",
        "(line 84,col 9)-(line 84,col 56)",
        "(line 85,col 9)-(line 85,col 57)",
        "(line 86,col 9)-(line 86,col 37)",
        "(line 87,col 9)-(line 87,col 64)",
        "(line 88,col 9)-(line 88,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.FirstOrderIntegratorWithJacobians(org.apache.commons.math.ode.FirstOrderIntegrator, org.apache.commons.math.ode.jacobians.ODEWithJacobians)",
      "begin_line": 97,
      "end_line": 102,
      "comment": " Build an enhanced integrator using ODE builtin jacobian computation features.\n     * @param integrator underlying integrator to solve the compound problem\n     * @param ode original problem, which can compute the jacobians by itself\n     * @see #FirstOrderIntegratorWithJacobians(FirstOrderIntegrator,\n     * ParameterizedODE, double[], double[], double[])\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 37)",
        "(line 100,col 9)-(line 100,col 23)",
        "(line 101,col 9)-(line 101,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.addStepHandler(org.apache.commons.math.ode.jacobians.StepHandlerWithJacobians)",
      "begin_line": 111,
      "end_line": 115,
      "comment": " Add a step handler to this integrator.\n     * \u003cp\u003eThe handler will be called by the integrator for each accepted\n     * step.\u003c/p\u003e\n     * @param handler handler for the accepted steps\n     * @see #getStepHandlers()\n     * @see #clearStepHandlers()\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 41)",
        "(line 113,col 9)-(line 113,col 51)",
        "(line 114,col 9)-(line 114,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.getStepHandlers()",
      "begin_line": 122,
      "end_line": 131,
      "comment": " Get all the step handlers that have been added to the integrator.\n     * @return an unmodifiable collection of the added events handlers\n     * @see #addStepHandler(StepHandlerWithJacobians)\n     * @see #clearStepHandlers()\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 124,col 54)",
        "(line 125,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.clearStepHandlers()",
      "begin_line": 137,
      "end_line": 139,
      "comment": " Remove all the step handlers that have been added to the integrator.\n     * @see #addStepHandler(StepHandlerWithJacobians)\n     * @see #getStepHandlers()\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.addEventHandler(org.apache.commons.math.ode.jacobians.EventHandlerWithJacobians, double, double, int)",
      "begin_line": 152,
      "end_line": 160,
      "comment": " Add an event handler to the integrator.\n     * @param handler event handler\n     * @param maxCheckInterval maximal time interval between switching\n     * function checks (this interval prevents missing sign changes in\n     * case the integration steps becomes very large)\n     * @param convergence convergence threshold in the event time search\n     * @param maxIterationCount upper limit of the iteration count in\n     * the event time search\n     * @see #getEventHandlers()\n     * @see #clearEventHandlers()\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 41)",
        "(line 157,col 9)-(line 157,col 51)",
        "(line 158,col 9)-(line 159,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.getEventHandlers()",
      "begin_line": 167,
      "end_line": 176,
      "comment": " Get all the event handlers that have been added to the integrator.\n     * @return an unmodifiable collection of the added events handlers\n     * @see #addEventHandler(EventHandlerWithJacobians, double, double, int)\n     * @see #clearEventHandlers()\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 169,col 55)",
        "(line 170,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.clearEventHandlers()",
      "begin_line": 182,
      "end_line": 184,
      "comment": " Remove all the event handlers that have been added to the integrator.\n     * @see #addEventHandler(EventHandlerWithJacobians, double, double, int)\n     * @see #getEventHandlers()\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.integrate(double, double[], double[][], double, double[], double[][], double[][])",
      "begin_line": 213,
      "end_line": 258,
      "comment": " Integrate the differential equations and the variational equations up to the given time.\n     * \u003cp\u003eThis method solves an Initial Value Problem (IVP) and also computes the derivatives\n     * of the solution with respect to initial state and parameters. This can be used as\n     * a basis to solve Boundary Value Problems (BVP).\u003c/p\u003e\n     * \u003cp\u003eSince this method stores some internal state variables made\n     * available in its public interface during integration ({@link\n     * #getCurrentSignedStepsize()}), it is \u003cem\u003enot\u003c/em\u003e thread-safe.\u003c/p\u003e\n     * @param t0 initial time\n     * @param y0 initial value of the state vector at t0\n     * @param dY0dP initial value of the state vector derivative with respect to the\n     * parameters at t0\n     * @param t target time for the integration\n     * (can be set to a value smaller than \u003ccode\u003et0\u003c/code\u003e for backward integration)\n     * @param y placeholder where to put the state vector at each successful\n     *  step (and hence at the end of integration), can be the same object as y0\n     * @param dYdY0 placeholder where to put the state vector derivative with respect\n     * to the initial state (dy[i]/dy0[j] is in element array dYdY0[i][j]) at each successful\n     *  step (and hence at the end of integration)\n     * @param dYdP placeholder where to put the state vector derivative with respect\n     * to the parameters (dy[i]/dp[j] is in element array dYdP[i][j]) at each successful\n     *  step (and hence at the end of integration)\n     * @return stop time, will be the same as target time if integration reached its\n     * target, but may be different if some event handler stops it at some point.\n     * @throws IntegratorException if the integrator cannot perform integration\n     * @throws DerivativeException this exception is propagated to the caller if\n     * the underlying user function triggers one\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 41)",
        "(line 219,col 9)-(line 219,col 51)",
        "(line 220,col 9)-(line 220,col 30)",
        "(line 221,col 9)-(line 221,col 29)",
        "(line 222,col 9)-(line 222,col 33)",
        "(line 223,col 9)-(line 223,col 36)",
        "(line 224,col 9)-(line 229,col 9)",
        "(line 237,col 9)-(line 237,col 55)",
        "(line 238,col 9)-(line 238,col 41)",
        "(line 239,col 9)-(line 247,col 9)",
        "(line 250,col 9)-(line 250,col 24)",
        "(line 251,col 9)-(line 251,col 88)",
        "(line 254,col 9)-(line 254,col 49)",
        "(line 256,col 9)-(line 256,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.dispatchCompoundState(double[], double[], double[][], double[][])",
      "begin_line": 266,
      "end_line": 285,
      "comment": " Dispatch a compound state array into state and jacobians arrays.\n     * @param z compound state\n     * @param y raw state array to fill\n     * @param dydy0 jacobian array to fill\n     * @param dydp jacobian array to fill\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 31)",
        "(line 270,col 9)-(line 270,col 37)",
        "(line 273,col 9)-(line 273,col 40)",
        "(line 276,col 9)-(line 278,col 9)",
        "(line 281,col 9)-(line 283,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.getCurrentStepStart()",
      "begin_line": 296,
      "end_line": 298,
      "comment": " Get the current value of the step start time t\u003csub\u003ei\u003c/sub\u003e.\n     * \u003cp\u003eThis method can be called during integration (typically by\n     * the object implementing the {@link FirstOrderDifferentialEquations\n     * differential equations} problem) if the value of the current step that\n     * is attempted is needed.\u003c/p\u003e\n     * \u003cp\u003eThe result is undefined if the method is called outside of\n     * calls to \u003ccode\u003eintegrate\u003c/code\u003e.\u003c/p\u003e\n     * @return current value of the step start time t\u003csub\u003ei\u003c/sub\u003e\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.getCurrentSignedStepsize()",
      "begin_line": 309,
      "end_line": 311,
      "comment": " Get the current signed value of the integration stepsize.\n     * \u003cp\u003eThis method can be called during integration (typically by\n     * the object implementing the {@link FirstOrderDifferentialEquations\n     * differential equations} problem) if the signed value of the current stepsize\n     * that is tried is needed.\u003c/p\u003e\n     * \u003cp\u003eThe result is undefined if the method is called outside of\n     * calls to \u003ccode\u003eintegrate\u003c/code\u003e.\u003c/p\u003e\n     * @return current signed value of the stepsize\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.setMaxEvaluations(int)",
      "begin_line": 321,
      "end_line": 323,
      "comment": " Set the maximal number of differential equations function evaluations.\n     * \u003cp\u003eThe purpose of this method is to avoid infinite loops which can occur\n     * for example when stringent error constraints are set or when lots of\n     * discrete events are triggered, thus leading to many rejected steps.\u003c/p\u003e\n     * @param maxEvaluations maximal number of function evaluations (negative\n     * values are silently converted to maximal integer value, thus representing\n     * almost unlimited evaluations)\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.getMaxEvaluations()",
      "begin_line": 328,
      "end_line": 330,
      "comment": " Get the maximal number of functions evaluations.\n     * @return maximal number of functions evaluations\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.getEvaluations()",
      "begin_line": 339,
      "end_line": 341,
      "comment": " Get the number of evaluations of the differential equations function.\n     * \u003cp\u003e\n     * The number of evaluations corresponds to the last call to the\n     * \u003ccode\u003eintegrate\u003c/code\u003e method. It is 0 if the method has not been called yet.\n     * \u003c/p\u003e\n     * @return number of evaluations of the differential equations function\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.checkDimension(int, java.lang.Object)",
      "begin_line": 348,
      "end_line": 355,
      "comment": " Check array dimensions.\n     * @param expected expected dimension\n     * @param array (may be null if expected is 0)\n     * @throws IllegalArgumentException if the array dimension does not match the expected one\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 74)",
        "(line 351,col 9)-(line 354,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MappingWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.ExtendedFirstOrderDifferentialEquations"
      ],
      "begin_line": 358,
      "end_line": 448,
      "comment": " Wrapper class used to map state and jacobians into compound state. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 361,
      "end_line": 361,
      "comment": " Current state. "
    },
    {
      "type": "field",
      "varNames": [
        "yDot"
      ],
      "begin_line": 364,
      "end_line": 364,
      "comment": " Time derivative of the current state. "
    },
    {
      "type": "field",
      "varNames": [
        "dFdY"
      ],
      "begin_line": 367,
      "end_line": 367,
      "comment": " Derivatives of yDot with respect to state. "
    },
    {
      "type": "field",
      "varNames": [
        "dFdP"
      ],
      "begin_line": 370,
      "end_line": 370,
      "comment": " Derivatives of yDot with respect to parameters. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.MappingWrapper.MappingWrapper()",
      "begin_line": 374,
      "end_line": 383,
      "comment": " Simple constructor.\n         ",
      "child_ranges": [
        "(line 376,col 13)-(line 376,col 45)",
        "(line 377,col 13)-(line 377,col 55)",
        "(line 378,col 13)-(line 378,col 33)",
        "(line 379,col 13)-(line 379,col 33)",
        "(line 380,col 13)-(line 380,col 36)",
        "(line 381,col 13)-(line 381,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.MappingWrapper.getDimension()",
      "begin_line": 386,
      "end_line": 390,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 387,col 13)-(line 387,col 35)",
        "(line 388,col 13)-(line 388,col 41)",
        "(line 389,col 13)-(line 389,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.MappingWrapper.getMainSetDimension()",
      "begin_line": 393,
      "end_line": 395,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 394,col 13)-(line 394,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.MappingWrapper.computeDerivatives(double, double[], double[])",
      "begin_line": 398,
      "end_line": 446,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 401,col 13)-(line 401,col 35)",
        "(line 402,col 13)-(line 402,col 41)",
        "(line 405,col 13)-(line 405,col 50)",
        "(line 406,col 13)-(line 408,col 13)",
        "(line 409,col 13)-(line 409,col 47)",
        "(line 410,col 13)-(line 410,col 57)",
        "(line 413,col 13)-(line 413,col 50)",
        "(line 416,col 13)-(line 428,col 13)",
        "(line 431,col 13)-(line 444,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FiniteDifferencesWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.jacobians.ODEWithJacobians"
      ],
      "begin_line": 451,
      "end_line": 536,
      "comment": " Wrapper class to compute jacobians by finite differences for ODE which do not compute them themselves. "
    },
    {
      "type": "field",
      "varNames": [
        "ode"
      ],
      "begin_line": 454,
      "end_line": 454,
      "comment": " Raw ODE without jacobians computation. "
    },
    {
      "type": "field",
      "varNames": [
        "p"
      ],
      "begin_line": 457,
      "end_line": 457,
      "comment": " Parameters array (may be null if parameters dimension from original problem is zero) "
    },
    {
      "type": "field",
      "varNames": [
        "hY"
      ],
      "begin_line": 460,
      "end_line": 460,
      "comment": " Step sizes to use for computing the jacobian df/dy. "
    },
    {
      "type": "field",
      "varNames": [
        "hP"
      ],
      "begin_line": 463,
      "end_line": 463,
      "comment": " Step sizes to use for computing the jacobian df/dp. "
    },
    {
      "type": "field",
      "varNames": [
        "tmpDot"
      ],
      "begin_line": 466,
      "end_line": 466,
      "comment": " Temporary array for state derivatives used to compute jacobians. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.FiniteDifferencesWrapper.FiniteDifferencesWrapper(org.apache.commons.math.ode.jacobians.ParameterizedODE, double[], double[], double[])",
      "begin_line": 474,
      "end_line": 481,
      "comment": " Simple constructor.\n         * @param ode original ODE problem, without jacobians computations\n         * @param p parameters array (may be null if parameters dimension from original problem is zero)\n         * @param hY step sizes to use for computing the jacobian df/dy\n         * @param hP step sizes to use for computing the jacobian df/dp\n         ",
      "child_ranges": [
        "(line 476,col 13)-(line 476,col 27)",
        "(line 477,col 13)-(line 477,col 32)",
        "(line 478,col 13)-(line 478,col 33)",
        "(line 479,col 13)-(line 479,col 33)",
        "(line 480,col 13)-(line 480,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.FiniteDifferencesWrapper.getDimension()",
      "begin_line": 484,
      "end_line": 486,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 485,col 13)-(line 485,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.FiniteDifferencesWrapper.computeDerivatives(double, double[], double[])",
      "begin_line": 489,
      "end_line": 493,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 492,col 13)-(line 492,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.FiniteDifferencesWrapper.getParametersDimension()",
      "begin_line": 496,
      "end_line": 498,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 497,col 13)-(line 497,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.FiniteDifferencesWrapper.computeJacobians(double, double[], double[], double[][], double[][])",
      "begin_line": 501,
      "end_line": 534,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 505,col 13)-(line 505,col 36)",
        "(line 506,col 13)-(line 506,col 36)",
        "(line 508,col 13)-(line 508,col 33)",
        "(line 509,col 13)-(line 511,col 13)",
        "(line 514,col 13)-(line 522,col 13)",
        "(line 525,col 13)-(line 532,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StepHandlerWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 539,
      "end_line": 585,
      "comment": " Wrapper for step handlers. "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 542,
      "end_line": 542,
      "comment": " Underlying step handler with jacobians. "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 545,
      "end_line": 545,
      "comment": " Dimension of the original ODE. "
    },
    {
      "type": "field",
      "varNames": [
        "k"
      ],
      "begin_line": 548,
      "end_line": 548,
      "comment": " Number of parameters. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepHandlerWrapper.StepHandlerWrapper(org.apache.commons.math.ode.jacobians.StepHandlerWithJacobians, int, int)",
      "begin_line": 555,
      "end_line": 560,
      "comment": " Simple constructor.\n         * @param handler underlying step handler with jacobians\n         * @param n dimension of the original ODE\n         * @param k number of parameters\n         ",
      "child_ranges": [
        "(line 557,col 13)-(line 557,col 35)",
        "(line 558,col 13)-(line 558,col 29)",
        "(line 559,col 13)-(line 559,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepHandlerWrapper.getHandler()",
      "begin_line": 565,
      "end_line": 567,
      "comment": " Get the underlying step handler with jacobians.\n         * @return underlying step handler with jacobians\n         ",
      "child_ranges": [
        "(line 566,col 13)-(line 566,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepHandlerWrapper.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 570,
      "end_line": 573,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 572,col 13)-(line 572,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepHandlerWrapper.requiresDenseOutput()",
      "begin_line": 576,
      "end_line": 578,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 577,col 13)-(line 577,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepHandlerWrapper.reset()",
      "begin_line": 581,
      "end_line": 583,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 582,col 13)-(line 582,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StepInterpolatorWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.jacobians.StepInterpolatorWithJacobians"
      ],
      "begin_line": 588,
      "end_line": 837,
      "comment": " Wrapper for step interpolators. "
    },
    {
      "type": "field",
      "varNames": [
        "interpolator"
      ],
      "begin_line": 592,
      "end_line": 592,
      "comment": " Wrapped interpolator. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 595,
      "end_line": 595,
      "comment": " State array. "
    },
    {
      "type": "field",
      "varNames": [
        "dydy0"
      ],
      "begin_line": 598,
      "end_line": 598,
      "comment": " Jacobian with respect to initial state dy/dy0. "
    },
    {
      "type": "field",
      "varNames": [
        "dydp"
      ],
      "begin_line": 601,
      "end_line": 601,
      "comment": " Jacobian with respect to parameters dy/dp. "
    },
    {
      "type": "field",
      "varNames": [
        "yDot"
      ],
      "begin_line": 604,
      "end_line": 604,
      "comment": " Time derivative of the state array. "
    },
    {
      "type": "field",
      "varNames": [
        "dydy0Dot"
      ],
      "begin_line": 607,
      "end_line": 607,
      "comment": " Time derivative of the sacobian with respect to initial state dy/dy0. "
    },
    {
      "type": "field",
      "varNames": [
        "dydpDot"
      ],
      "begin_line": 610,
      "end_line": 610,
      "comment": " Time derivative of the jacobian with respect to parameters dy/dp. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.StepInterpolatorWrapper()",
      "begin_line": 615,
      "end_line": 617,
      "comment": " Simple constructor.\n         * \u003cp\u003eThis constructor is used only for externalization. It does nothing.\u003c/p\u003e\n         ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.StepInterpolatorWrapper(org.apache.commons.math.ode.sampling.StepInterpolator, int, int)",
      "begin_line": 624,
      "end_line": 633,
      "comment": " Simple constructor.\n         * @param interpolator wrapped interpolator\n         * @param n dimension of the original ODE\n         * @param k number of parameters\n         ",
      "child_ranges": [
        "(line 626,col 13)-(line 626,col 45)",
        "(line 627,col 13)-(line 627,col 37)",
        "(line 628,col 13)-(line 628,col 40)",
        "(line 629,col 13)-(line 629,col 40)",
        "(line 630,col 13)-(line 630,col 37)",
        "(line 631,col 13)-(line 631,col 40)",
        "(line 632,col 13)-(line 632,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.setInterpolatedTime(double)",
      "begin_line": 636,
      "end_line": 638,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 637,col 13)-(line 637,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.isForward()",
      "begin_line": 641,
      "end_line": 643,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 642,col 13)-(line 642,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.getPreviousTime()",
      "begin_line": 646,
      "end_line": 648,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 647,col 13)-(line 647,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.getInterpolatedTime()",
      "begin_line": 651,
      "end_line": 653,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 652,col 13)-(line 652,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.getInterpolatedY()",
      "begin_line": 656,
      "end_line": 660,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 657,col 13)-(line 657,col 73)",
        "(line 658,col 13)-(line 658,col 63)",
        "(line 659,col 13)-(line 659,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.getInterpolatedDyDy0()",
      "begin_line": 663,
      "end_line": 672,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 664,col 13)-(line 664,col 73)",
        "(line 665,col 13)-(line 665,col 35)",
        "(line 666,col 13)-(line 666,col 26)",
        "(line 667,col 13)-(line 670,col 13)",
        "(line 671,col 13)-(line 671,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.getInterpolatedDyDp()",
      "begin_line": 675,
      "end_line": 685,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 676,col 13)-(line 676,col 73)",
        "(line 677,col 13)-(line 677,col 35)",
        "(line 678,col 13)-(line 678,col 41)",
        "(line 679,col 13)-(line 679,col 36)",
        "(line 680,col 13)-(line 683,col 13)",
        "(line 684,col 13)-(line 684,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.getInterpolatedYDot()",
      "begin_line": 688,
      "end_line": 692,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 689,col 13)-(line 689,col 85)",
        "(line 690,col 13)-(line 690,col 75)",
        "(line 691,col 13)-(line 691,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.getInterpolatedDyDy0Dot()",
      "begin_line": 695,
      "end_line": 704,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 696,col 13)-(line 696,col 85)",
        "(line 697,col 13)-(line 697,col 35)",
        "(line 698,col 13)-(line 698,col 26)",
        "(line 699,col 13)-(line 702,col 13)",
        "(line 703,col 13)-(line 703,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.getInterpolatedDyDpDot()",
      "begin_line": 707,
      "end_line": 717,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 708,col 13)-(line 708,col 85)",
        "(line 709,col 13)-(line 709,col 35)",
        "(line 710,col 13)-(line 710,col 44)",
        "(line 711,col 13)-(line 711,col 36)",
        "(line 712,col 13)-(line 715,col 13)",
        "(line 716,col 13)-(line 716,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.getCurrentTime()",
      "begin_line": 720,
      "end_line": 722,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 721,col 13)-(line 721,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.copy()",
      "begin_line": 725,
      "end_line": 737,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 726,col 13)-(line 726,col 35)",
        "(line 727,col 13)-(line 727,col 41)",
        "(line 728,col 13)-(line 729,col 71)",
        "(line 730,col 13)-(line 730,col 42)",
        "(line 731,col 13)-(line 731,col 46)",
        "(line 732,col 13)-(line 732,col 45)",
        "(line 733,col 13)-(line 733,col 45)",
        "(line 734,col 13)-(line 734,col 49)",
        "(line 735,col 13)-(line 735,col 48)",
        "(line 736,col 13)-(line 736,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.writeExternal(java.io.ObjectOutput)",
      "begin_line": 740,
      "end_line": 750,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 741,col 13)-(line 741,col 42)",
        "(line 742,col 13)-(line 742,col 35)",
        "(line 743,col 13)-(line 743,col 41)",
        "(line 744,col 13)-(line 744,col 31)",
        "(line 745,col 13)-(line 745,col 35)",
        "(line 746,col 13)-(line 746,col 34)",
        "(line 747,col 13)-(line 747,col 34)",
        "(line 748,col 13)-(line 748,col 38)",
        "(line 749,col 13)-(line 749,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.readExternal(java.io.ObjectInput)",
      "begin_line": 753,
      "end_line": 769,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 754,col 13)-(line 754,col 62)",
        "(line 755,col 13)-(line 755,col 39)",
        "(line 756,col 13)-(line 756,col 39)",
        "(line 757,col 13)-(line 757,col 37)",
        "(line 758,col 13)-(line 758,col 40)",
        "(line 759,col 13)-(line 759,col 40)",
        "(line 760,col 13)-(line 760,col 37)",
        "(line 761,col 13)-(line 761,col 40)",
        "(line 762,col 13)-(line 762,col 40)",
        "(line 763,col 13)-(line 763,col 29)",
        "(line 764,col 13)-(line 764,col 33)",
        "(line 765,col 13)-(line 765,col 32)",
        "(line 766,col 13)-(line 766,col 32)",
        "(line 767,col 13)-(line 767,col 36)",
        "(line 768,col 13)-(line 768,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.copyArray(double[], double[])",
      "begin_line": 775,
      "end_line": 777,
      "comment": " Copy an array.\n         * @param src source array\n         * @param dest destination array\n         ",
      "child_ranges": [
        "(line 776,col 13)-(line 776,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.copyArray(double[][], double[][])",
      "begin_line": 783,
      "end_line": 787,
      "comment": " Copy an array.\n         * @param src source array\n         * @param dest destination array\n         ",
      "child_ranges": [
        "(line 784,col 13)-(line 786,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.writeArray(java.io.ObjectOutput, double[])",
      "begin_line": 794,
      "end_line": 799,
      "comment": " Write an array.\n         * @param out output stream\n         * @param array array to write\n         * @exception IOException if array cannot be read\n         ",
      "child_ranges": [
        "(line 796,col 13)-(line 798,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.writeArray(java.io.ObjectOutput, double[][])",
      "begin_line": 806,
      "end_line": 811,
      "comment": " Write an array.\n         * @param out output stream\n         * @param array array to write\n         * @exception IOException if array cannot be read\n         ",
      "child_ranges": [
        "(line 808,col 13)-(line 810,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.readArray(java.io.ObjectInput, double[])",
      "begin_line": 818,
      "end_line": 823,
      "comment": " Read an array.\n         * @param in input stream\n         * @param array array to read\n         * @exception IOException if array cannot be read\n         ",
      "child_ranges": [
        "(line 820,col 13)-(line 822,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.readArray(java.io.ObjectInput, double[][])",
      "begin_line": 830,
      "end_line": 835,
      "comment": " Read an array.\n         * @param in input stream\n         * @param array array to read\n         * @exception IOException if array cannot be read\n         ",
      "child_ranges": [
        "(line 832,col 13)-(line 834,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EventHandlerWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.events.EventHandler"
      ],
      "begin_line": 840,
      "end_line": 895,
      "comment": " Wrapper for event handlers. "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 843,
      "end_line": 843,
      "comment": " Underlying event handler with jacobians. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 846,
      "end_line": 846,
      "comment": " State array. "
    },
    {
      "type": "field",
      "varNames": [
        "dydy0"
      ],
      "begin_line": 849,
      "end_line": 849,
      "comment": " Jacobian with respect to initial state dy/dy0. "
    },
    {
      "type": "field",
      "varNames": [
        "dydp"
      ],
      "begin_line": 852,
      "end_line": 852,
      "comment": " Jacobian with respect to parameters dy/dp. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.EventHandlerWrapper.EventHandlerWrapper(org.apache.commons.math.ode.jacobians.EventHandlerWithJacobians, int, int)",
      "begin_line": 859,
      "end_line": 865,
      "comment": " Simple constructor.\n         * @param handler underlying event handler with jacobians\n         * @param n dimension of the original ODE\n         * @param k number of parameters\n         ",
      "child_ranges": [
        "(line 861,col 13)-(line 861,col 35)",
        "(line 862,col 13)-(line 862,col 37)",
        "(line 863,col 13)-(line 863,col 40)",
        "(line 864,col 13)-(line 864,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.EventHandlerWrapper.getHandler()",
      "begin_line": 870,
      "end_line": 872,
      "comment": " Get the underlying event handler with jacobians.\n         * @return underlying event handler with jacobians\n         ",
      "child_ranges": [
        "(line 871,col 13)-(line 871,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.EventHandlerWrapper.eventOccurred(double, double[], boolean)",
      "begin_line": 875,
      "end_line": 879,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 877,col 13)-(line 877,col 53)",
        "(line 878,col 13)-(line 878,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.EventHandlerWrapper.g(double, double[])",
      "begin_line": 882,
      "end_line": 886,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 884,col 13)-(line 884,col 53)",
        "(line 885,col 13)-(line 885,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.EventHandlerWrapper.resetState(double, double[])",
      "begin_line": 889,
      "end_line": 893,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 891,col 13)-(line 891,col 53)",
        "(line 892,col 13)-(line 892,col 50)"
      ]
    }
  ]
}