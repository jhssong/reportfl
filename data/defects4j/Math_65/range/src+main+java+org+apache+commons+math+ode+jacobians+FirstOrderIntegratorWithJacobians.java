{
  "filepath": "/tmp/Math-65b/src/main/java/org/apache/commons/math/ode/jacobians/FirstOrderIntegratorWithJacobians.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FirstOrderIntegratorWithJacobians",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 52,
      "end_line": 896,
      "comment": " This class enhances a first order integrator for differential equations to\n * compute also partial derivatives of the solution with respect to initial state\n * and parameters.\n * \u003cp\u003eIn order to compute both the state and its derivatives, the ODE problem\n * is extended with jacobians of the raw ODE and the variational equations are\n * added to form a new compound problem of higher dimension. If the original ODE\n * problem has dimension n and there are p parameters, the compound problem will\n * have dimension n \u0026times; (1 + n + p).\u003c/p\u003e\n * @see ParameterizedODE\n * @see ODEWithJacobians\n * @version $Revision$ $Date$\n * @since 2.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "integrator"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Underlying integrator for compound problem. "
    },
    {
      "type": "field",
      "varNames": [
        "ode"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Raw equations to integrate. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvaluations"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Number of evaluations already performed. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.FirstOrderIntegratorWithJacobians(org.apache.commons.math.ode.FirstOrderIntegrator, org.apache.commons.math.ode.jacobians.ParameterizedODE, double[], double[], double[])",
      "begin_line": 79,
      "end_line": 88,
      "comment": " Build an enhanced integrator using internal differentiation to compute jacobians.\n     * @param integrator underlying integrator to solve the compound problem\n     * @param ode original problem (f in the equation y\u0027 \u003d f(t, y))\n     * @param p parameters array (may be null if {@link\n     * ParameterizedODE#getParametersDimension()\n     * getParametersDimension()} from original problem is zero)\n     * @param hY step sizes to use for computing the jacobian df/dy, must have the\n     * same dimension as the original problem\n     * @param hP step sizes to use for computing the jacobian df/dp, must have the\n     * same dimension as the original problem parameters dimension\n     * @see #FirstOrderIntegratorWithJacobians(FirstOrderIntegrator,\n     * ODEWithJacobians)\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 47)",
        "(line 83,col 9)-(line 83,col 56)",
        "(line 84,col 9)-(line 84,col 57)",
        "(line 85,col 9)-(line 85,col 37)",
        "(line 86,col 9)-(line 86,col 64)",
        "(line 87,col 9)-(line 87,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.FirstOrderIntegratorWithJacobians(org.apache.commons.math.ode.FirstOrderIntegrator, org.apache.commons.math.ode.jacobians.ODEWithJacobians)",
      "begin_line": 96,
      "end_line": 101,
      "comment": " Build an enhanced integrator using ODE builtin jacobian computation features.\n     * @param integrator underlying integrator to solve the compound problem\n     * @param ode original problem, which can compute the jacobians by itself\n     * @see #FirstOrderIntegratorWithJacobians(FirstOrderIntegrator,\n     * ParameterizedODE, double[], double[], double[])\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 37)",
        "(line 99,col 9)-(line 99,col 23)",
        "(line 100,col 9)-(line 100,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.addStepHandler(org.apache.commons.math.ode.jacobians.StepHandlerWithJacobians)",
      "begin_line": 110,
      "end_line": 114,
      "comment": " Add a step handler to this integrator.\n     * \u003cp\u003eThe handler will be called by the integrator for each accepted\n     * step.\u003c/p\u003e\n     * @param handler handler for the accepted steps\n     * @see #getStepHandlers()\n     * @see #clearStepHandlers()\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 41)",
        "(line 112,col 9)-(line 112,col 51)",
        "(line 113,col 9)-(line 113,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.getStepHandlers()",
      "begin_line": 121,
      "end_line": 130,
      "comment": " Get all the step handlers that have been added to the integrator.\n     * @return an unmodifiable collection of the added events handlers\n     * @see #addStepHandler(StepHandlerWithJacobians)\n     * @see #clearStepHandlers()\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 123,col 54)",
        "(line 124,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.clearStepHandlers()",
      "begin_line": 136,
      "end_line": 138,
      "comment": " Remove all the step handlers that have been added to the integrator.\n     * @see #addStepHandler(StepHandlerWithJacobians)\n     * @see #getStepHandlers()\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.addEventHandler(org.apache.commons.math.ode.jacobians.EventHandlerWithJacobians, double, double, int)",
      "begin_line": 151,
      "end_line": 159,
      "comment": " Add an event handler to the integrator.\n     * @param handler event handler\n     * @param maxCheckInterval maximal time interval between switching\n     * function checks (this interval prevents missing sign changes in\n     * case the integration steps becomes very large)\n     * @param convergence convergence threshold in the event time search\n     * @param maxIterationCount upper limit of the iteration count in\n     * the event time search\n     * @see #getEventHandlers()\n     * @see #clearEventHandlers()\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 41)",
        "(line 156,col 9)-(line 156,col 51)",
        "(line 157,col 9)-(line 158,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.getEventHandlers()",
      "begin_line": 166,
      "end_line": 175,
      "comment": " Get all the event handlers that have been added to the integrator.\n     * @return an unmodifiable collection of the added events handlers\n     * @see #addEventHandler(EventHandlerWithJacobians, double, double, int)\n     * @see #clearEventHandlers()\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 168,col 55)",
        "(line 169,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.clearEventHandlers()",
      "begin_line": 181,
      "end_line": 183,
      "comment": " Remove all the event handlers that have been added to the integrator.\n     * @see #addEventHandler(EventHandlerWithJacobians, double, double, int)\n     * @see #getEventHandlers()\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.integrate(double, double[], double[][], double, double[], double[][], double[][])",
      "begin_line": 212,
      "end_line": 257,
      "comment": " Integrate the differential equations and the variational equations up to the given time.\n     * \u003cp\u003eThis method solves an Initial Value Problem (IVP) and also computes the derivatives\n     * of the solution with respect to initial state and parameters. This can be used as\n     * a basis to solve Boundary Value Problems (BVP).\u003c/p\u003e\n     * \u003cp\u003eSince this method stores some internal state variables made\n     * available in its public interface during integration ({@link\n     * #getCurrentSignedStepsize()}), it is \u003cem\u003enot\u003c/em\u003e thread-safe.\u003c/p\u003e\n     * @param t0 initial time\n     * @param y0 initial value of the state vector at t0\n     * @param dY0dP initial value of the state vector derivative with respect to the\n     * parameters at t0\n     * @param t target time for the integration\n     * (can be set to a value smaller than \u003ccode\u003et0\u003c/code\u003e for backward integration)\n     * @param y placeholder where to put the state vector at each successful\n     *  step (and hence at the end of integration), can be the same object as y0\n     * @param dYdY0 placeholder where to put the state vector derivative with respect\n     * to the initial state (dy[i]/dy0[j] is in element array dYdY0[i][j]) at each successful\n     *  step (and hence at the end of integration)\n     * @param dYdP placeholder where to put the state vector derivative with respect\n     * to the parameters (dy[i]/dp[j] is in element array dYdP[i][j]) at each successful\n     *  step (and hence at the end of integration)\n     * @return stop time, will be the same as target time if integration reached its\n     * target, but may be different if some event handler stops it at some point.\n     * @throws IntegratorException if the integrator cannot perform integration\n     * @throws DerivativeException this exception is propagated to the caller if\n     * the underlying user function triggers one\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 41)",
        "(line 218,col 9)-(line 218,col 51)",
        "(line 219,col 9)-(line 219,col 30)",
        "(line 220,col 9)-(line 220,col 29)",
        "(line 221,col 9)-(line 221,col 33)",
        "(line 222,col 9)-(line 222,col 36)",
        "(line 223,col 9)-(line 228,col 9)",
        "(line 236,col 9)-(line 236,col 55)",
        "(line 237,col 9)-(line 237,col 41)",
        "(line 238,col 9)-(line 246,col 9)",
        "(line 249,col 9)-(line 249,col 24)",
        "(line 250,col 9)-(line 250,col 88)",
        "(line 253,col 9)-(line 253,col 49)",
        "(line 255,col 9)-(line 255,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.dispatchCompoundState(double[], double[], double[][], double[][])",
      "begin_line": 265,
      "end_line": 284,
      "comment": " Dispatch a compound state array into state and jacobians arrays.\n     * @param z compound state\n     * @param y raw state array to fill\n     * @param dydy0 jacobian array to fill\n     * @param dydp jacobian array to fill\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 31)",
        "(line 269,col 9)-(line 269,col 37)",
        "(line 272,col 9)-(line 272,col 40)",
        "(line 275,col 9)-(line 277,col 9)",
        "(line 280,col 9)-(line 282,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.getCurrentStepStart()",
      "begin_line": 295,
      "end_line": 297,
      "comment": " Get the current value of the step start time t\u003csub\u003ei\u003c/sub\u003e.\n     * \u003cp\u003eThis method can be called during integration (typically by\n     * the object implementing the {@link org.apache.commons.math.ode.FirstOrderDifferentialEquations\n     * differential equations} problem) if the value of the current step that\n     * is attempted is needed.\u003c/p\u003e\n     * \u003cp\u003eThe result is undefined if the method is called outside of\n     * calls to \u003ccode\u003eintegrate\u003c/code\u003e.\u003c/p\u003e\n     * @return current value of the step start time t\u003csub\u003ei\u003c/sub\u003e\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.getCurrentSignedStepsize()",
      "begin_line": 308,
      "end_line": 310,
      "comment": " Get the current signed value of the integration stepsize.\n     * \u003cp\u003eThis method can be called during integration (typically by\n     * the object implementing the {@link org.apache.commons.math.ode.FirstOrderDifferentialEquations\n     * differential equations} problem) if the signed value of the current stepsize\n     * that is tried is needed.\u003c/p\u003e\n     * \u003cp\u003eThe result is undefined if the method is called outside of\n     * calls to \u003ccode\u003eintegrate\u003c/code\u003e.\u003c/p\u003e\n     * @return current signed value of the stepsize\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.setMaxEvaluations(int)",
      "begin_line": 320,
      "end_line": 322,
      "comment": " Set the maximal number of differential equations function evaluations.\n     * \u003cp\u003eThe purpose of this method is to avoid infinite loops which can occur\n     * for example when stringent error constraints are set or when lots of\n     * discrete events are triggered, thus leading to many rejected steps.\u003c/p\u003e\n     * @param maxEvaluations maximal number of function evaluations (negative\n     * values are silently converted to maximal integer value, thus representing\n     * almost unlimited evaluations)\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.getMaxEvaluations()",
      "begin_line": 327,
      "end_line": 329,
      "comment": " Get the maximal number of functions evaluations.\n     * @return maximal number of functions evaluations\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.getEvaluations()",
      "begin_line": 338,
      "end_line": 340,
      "comment": " Get the number of evaluations of the differential equations function.\n     * \u003cp\u003e\n     * The number of evaluations corresponds to the last call to the\n     * \u003ccode\u003eintegrate\u003c/code\u003e method. It is 0 if the method has not been called yet.\n     * \u003c/p\u003e\n     * @return number of evaluations of the differential equations function\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.checkDimension(int, java.lang.Object)",
      "begin_line": 347,
      "end_line": 354,
      "comment": " Check array dimensions.\n     * @param expected expected dimension\n     * @param array (may be null if expected is 0)\n     * @throws IllegalArgumentException if the array dimension does not match the expected one\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 74)",
        "(line 350,col 9)-(line 353,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MappingWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.ExtendedFirstOrderDifferentialEquations"
      ],
      "begin_line": 357,
      "end_line": 447,
      "comment": " Wrapper class used to map state and jacobians into compound state. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 360,
      "end_line": 360,
      "comment": " Current state. "
    },
    {
      "type": "field",
      "varNames": [
        "yDot"
      ],
      "begin_line": 363,
      "end_line": 363,
      "comment": " Time derivative of the current state. "
    },
    {
      "type": "field",
      "varNames": [
        "dFdY"
      ],
      "begin_line": 366,
      "end_line": 366,
      "comment": " Derivatives of yDot with respect to state. "
    },
    {
      "type": "field",
      "varNames": [
        "dFdP"
      ],
      "begin_line": 369,
      "end_line": 369,
      "comment": " Derivatives of yDot with respect to parameters. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.MappingWrapper.MappingWrapper()",
      "begin_line": 373,
      "end_line": 382,
      "comment": " Simple constructor.\n         ",
      "child_ranges": [
        "(line 375,col 13)-(line 375,col 45)",
        "(line 376,col 13)-(line 376,col 55)",
        "(line 377,col 13)-(line 377,col 33)",
        "(line 378,col 13)-(line 378,col 33)",
        "(line 379,col 13)-(line 379,col 36)",
        "(line 380,col 13)-(line 380,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.MappingWrapper.getDimension()",
      "begin_line": 385,
      "end_line": 389,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 386,col 13)-(line 386,col 35)",
        "(line 387,col 13)-(line 387,col 41)",
        "(line 388,col 13)-(line 388,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.MappingWrapper.getMainSetDimension()",
      "begin_line": 392,
      "end_line": 394,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 393,col 13)-(line 393,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.MappingWrapper.computeDerivatives(double, double[], double[])",
      "begin_line": 397,
      "end_line": 445,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 400,col 13)-(line 400,col 35)",
        "(line 401,col 13)-(line 401,col 41)",
        "(line 404,col 13)-(line 404,col 50)",
        "(line 405,col 13)-(line 407,col 13)",
        "(line 408,col 13)-(line 408,col 47)",
        "(line 409,col 13)-(line 409,col 57)",
        "(line 412,col 13)-(line 412,col 50)",
        "(line 415,col 13)-(line 427,col 13)",
        "(line 430,col 13)-(line 443,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FiniteDifferencesWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.jacobians.ODEWithJacobians"
      ],
      "begin_line": 450,
      "end_line": 535,
      "comment": " Wrapper class to compute jacobians by finite differences for ODE which do not compute them themselves. "
    },
    {
      "type": "field",
      "varNames": [
        "ode"
      ],
      "begin_line": 453,
      "end_line": 453,
      "comment": " Raw ODE without jacobians computation. "
    },
    {
      "type": "field",
      "varNames": [
        "p"
      ],
      "begin_line": 456,
      "end_line": 456,
      "comment": " Parameters array (may be null if parameters dimension from original problem is zero) "
    },
    {
      "type": "field",
      "varNames": [
        "hY"
      ],
      "begin_line": 459,
      "end_line": 459,
      "comment": " Step sizes to use for computing the jacobian df/dy. "
    },
    {
      "type": "field",
      "varNames": [
        "hP"
      ],
      "begin_line": 462,
      "end_line": 462,
      "comment": " Step sizes to use for computing the jacobian df/dp. "
    },
    {
      "type": "field",
      "varNames": [
        "tmpDot"
      ],
      "begin_line": 465,
      "end_line": 465,
      "comment": " Temporary array for state derivatives used to compute jacobians. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.FiniteDifferencesWrapper.FiniteDifferencesWrapper(org.apache.commons.math.ode.jacobians.ParameterizedODE, double[], double[], double[])",
      "begin_line": 473,
      "end_line": 480,
      "comment": " Simple constructor.\n         * @param ode original ODE problem, without jacobians computations\n         * @param p parameters array (may be null if parameters dimension from original problem is zero)\n         * @param hY step sizes to use for computing the jacobian df/dy\n         * @param hP step sizes to use for computing the jacobian df/dp\n         ",
      "child_ranges": [
        "(line 475,col 13)-(line 475,col 27)",
        "(line 476,col 13)-(line 476,col 32)",
        "(line 477,col 13)-(line 477,col 33)",
        "(line 478,col 13)-(line 478,col 33)",
        "(line 479,col 13)-(line 479,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.FiniteDifferencesWrapper.getDimension()",
      "begin_line": 483,
      "end_line": 485,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 484,col 13)-(line 484,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.FiniteDifferencesWrapper.computeDerivatives(double, double[], double[])",
      "begin_line": 488,
      "end_line": 492,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 491,col 13)-(line 491,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.FiniteDifferencesWrapper.getParametersDimension()",
      "begin_line": 495,
      "end_line": 497,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 496,col 13)-(line 496,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.FiniteDifferencesWrapper.computeJacobians(double, double[], double[], double[][], double[][])",
      "begin_line": 500,
      "end_line": 533,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 504,col 13)-(line 504,col 36)",
        "(line 505,col 13)-(line 505,col 36)",
        "(line 507,col 13)-(line 507,col 33)",
        "(line 508,col 13)-(line 510,col 13)",
        "(line 513,col 13)-(line 521,col 13)",
        "(line 524,col 13)-(line 531,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StepHandlerWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 538,
      "end_line": 584,
      "comment": " Wrapper for step handlers. "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 541,
      "end_line": 541,
      "comment": " Underlying step handler with jacobians. "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 544,
      "end_line": 544,
      "comment": " Dimension of the original ODE. "
    },
    {
      "type": "field",
      "varNames": [
        "k"
      ],
      "begin_line": 547,
      "end_line": 547,
      "comment": " Number of parameters. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepHandlerWrapper.StepHandlerWrapper(org.apache.commons.math.ode.jacobians.StepHandlerWithJacobians, int, int)",
      "begin_line": 554,
      "end_line": 559,
      "comment": " Simple constructor.\n         * @param handler underlying step handler with jacobians\n         * @param n dimension of the original ODE\n         * @param k number of parameters\n         ",
      "child_ranges": [
        "(line 556,col 13)-(line 556,col 35)",
        "(line 557,col 13)-(line 557,col 29)",
        "(line 558,col 13)-(line 558,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepHandlerWrapper.getHandler()",
      "begin_line": 564,
      "end_line": 566,
      "comment": " Get the underlying step handler with jacobians.\n         * @return underlying step handler with jacobians\n         ",
      "child_ranges": [
        "(line 565,col 13)-(line 565,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepHandlerWrapper.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 569,
      "end_line": 572,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 571,col 13)-(line 571,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepHandlerWrapper.requiresDenseOutput()",
      "begin_line": 575,
      "end_line": 577,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 576,col 13)-(line 576,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepHandlerWrapper.reset()",
      "begin_line": 580,
      "end_line": 582,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 581,col 13)-(line 581,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StepInterpolatorWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.jacobians.StepInterpolatorWithJacobians"
      ],
      "begin_line": 587,
      "end_line": 836,
      "comment": " Wrapper for step interpolators. "
    },
    {
      "type": "field",
      "varNames": [
        "interpolator"
      ],
      "begin_line": 591,
      "end_line": 591,
      "comment": " Wrapped interpolator. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 594,
      "end_line": 594,
      "comment": " State array. "
    },
    {
      "type": "field",
      "varNames": [
        "dydy0"
      ],
      "begin_line": 597,
      "end_line": 597,
      "comment": " Jacobian with respect to initial state dy/dy0. "
    },
    {
      "type": "field",
      "varNames": [
        "dydp"
      ],
      "begin_line": 600,
      "end_line": 600,
      "comment": " Jacobian with respect to parameters dy/dp. "
    },
    {
      "type": "field",
      "varNames": [
        "yDot"
      ],
      "begin_line": 603,
      "end_line": 603,
      "comment": " Time derivative of the state array. "
    },
    {
      "type": "field",
      "varNames": [
        "dydy0Dot"
      ],
      "begin_line": 606,
      "end_line": 606,
      "comment": " Time derivative of the sacobian with respect to initial state dy/dy0. "
    },
    {
      "type": "field",
      "varNames": [
        "dydpDot"
      ],
      "begin_line": 609,
      "end_line": 609,
      "comment": " Time derivative of the jacobian with respect to parameters dy/dp. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.StepInterpolatorWrapper()",
      "begin_line": 614,
      "end_line": 616,
      "comment": " Simple constructor.\n         * \u003cp\u003eThis constructor is used only for externalization. It does nothing.\u003c/p\u003e\n         ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.StepInterpolatorWrapper(org.apache.commons.math.ode.sampling.StepInterpolator, int, int)",
      "begin_line": 623,
      "end_line": 632,
      "comment": " Simple constructor.\n         * @param interpolator wrapped interpolator\n         * @param n dimension of the original ODE\n         * @param k number of parameters\n         ",
      "child_ranges": [
        "(line 625,col 13)-(line 625,col 45)",
        "(line 626,col 13)-(line 626,col 37)",
        "(line 627,col 13)-(line 627,col 40)",
        "(line 628,col 13)-(line 628,col 40)",
        "(line 629,col 13)-(line 629,col 37)",
        "(line 630,col 13)-(line 630,col 40)",
        "(line 631,col 13)-(line 631,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.setInterpolatedTime(double)",
      "begin_line": 635,
      "end_line": 637,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 636,col 13)-(line 636,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.isForward()",
      "begin_line": 640,
      "end_line": 642,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 641,col 13)-(line 641,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.getPreviousTime()",
      "begin_line": 645,
      "end_line": 647,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 646,col 13)-(line 646,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.getInterpolatedTime()",
      "begin_line": 650,
      "end_line": 652,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 651,col 13)-(line 651,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.getInterpolatedY()",
      "begin_line": 655,
      "end_line": 659,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 656,col 13)-(line 656,col 73)",
        "(line 657,col 13)-(line 657,col 63)",
        "(line 658,col 13)-(line 658,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.getInterpolatedDyDy0()",
      "begin_line": 662,
      "end_line": 671,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 663,col 13)-(line 663,col 73)",
        "(line 664,col 13)-(line 664,col 35)",
        "(line 665,col 13)-(line 665,col 26)",
        "(line 666,col 13)-(line 669,col 13)",
        "(line 670,col 13)-(line 670,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.getInterpolatedDyDp()",
      "begin_line": 674,
      "end_line": 684,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 675,col 13)-(line 675,col 73)",
        "(line 676,col 13)-(line 676,col 35)",
        "(line 677,col 13)-(line 677,col 41)",
        "(line 678,col 13)-(line 678,col 36)",
        "(line 679,col 13)-(line 682,col 13)",
        "(line 683,col 13)-(line 683,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.getInterpolatedYDot()",
      "begin_line": 687,
      "end_line": 691,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 688,col 13)-(line 688,col 85)",
        "(line 689,col 13)-(line 689,col 75)",
        "(line 690,col 13)-(line 690,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.getInterpolatedDyDy0Dot()",
      "begin_line": 694,
      "end_line": 703,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 695,col 13)-(line 695,col 85)",
        "(line 696,col 13)-(line 696,col 35)",
        "(line 697,col 13)-(line 697,col 26)",
        "(line 698,col 13)-(line 701,col 13)",
        "(line 702,col 13)-(line 702,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.getInterpolatedDyDpDot()",
      "begin_line": 706,
      "end_line": 716,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 707,col 13)-(line 707,col 85)",
        "(line 708,col 13)-(line 708,col 35)",
        "(line 709,col 13)-(line 709,col 44)",
        "(line 710,col 13)-(line 710,col 36)",
        "(line 711,col 13)-(line 714,col 13)",
        "(line 715,col 13)-(line 715,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.getCurrentTime()",
      "begin_line": 719,
      "end_line": 721,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 720,col 13)-(line 720,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.copy()",
      "begin_line": 724,
      "end_line": 736,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 725,col 13)-(line 725,col 35)",
        "(line 726,col 13)-(line 726,col 41)",
        "(line 727,col 13)-(line 728,col 71)",
        "(line 729,col 13)-(line 729,col 42)",
        "(line 730,col 13)-(line 730,col 46)",
        "(line 731,col 13)-(line 731,col 45)",
        "(line 732,col 13)-(line 732,col 45)",
        "(line 733,col 13)-(line 733,col 49)",
        "(line 734,col 13)-(line 734,col 48)",
        "(line 735,col 13)-(line 735,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.writeExternal(java.io.ObjectOutput)",
      "begin_line": 739,
      "end_line": 749,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 740,col 13)-(line 740,col 42)",
        "(line 741,col 13)-(line 741,col 35)",
        "(line 742,col 13)-(line 742,col 41)",
        "(line 743,col 13)-(line 743,col 31)",
        "(line 744,col 13)-(line 744,col 35)",
        "(line 745,col 13)-(line 745,col 34)",
        "(line 746,col 13)-(line 746,col 34)",
        "(line 747,col 13)-(line 747,col 38)",
        "(line 748,col 13)-(line 748,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.readExternal(java.io.ObjectInput)",
      "begin_line": 752,
      "end_line": 768,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 753,col 13)-(line 753,col 62)",
        "(line 754,col 13)-(line 754,col 39)",
        "(line 755,col 13)-(line 755,col 39)",
        "(line 756,col 13)-(line 756,col 37)",
        "(line 757,col 13)-(line 757,col 40)",
        "(line 758,col 13)-(line 758,col 40)",
        "(line 759,col 13)-(line 759,col 37)",
        "(line 760,col 13)-(line 760,col 40)",
        "(line 761,col 13)-(line 761,col 40)",
        "(line 762,col 13)-(line 762,col 29)",
        "(line 763,col 13)-(line 763,col 33)",
        "(line 764,col 13)-(line 764,col 32)",
        "(line 765,col 13)-(line 765,col 32)",
        "(line 766,col 13)-(line 766,col 36)",
        "(line 767,col 13)-(line 767,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.copyArray(double[], double[])",
      "begin_line": 774,
      "end_line": 776,
      "comment": " Copy an array.\n         * @param src source array\n         * @param dest destination array\n         ",
      "child_ranges": [
        "(line 775,col 13)-(line 775,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.copyArray(double[][], double[][])",
      "begin_line": 782,
      "end_line": 786,
      "comment": " Copy an array.\n         * @param src source array\n         * @param dest destination array\n         ",
      "child_ranges": [
        "(line 783,col 13)-(line 785,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.writeArray(java.io.ObjectOutput, double[])",
      "begin_line": 793,
      "end_line": 798,
      "comment": " Write an array.\n         * @param out output stream\n         * @param array array to write\n         * @exception IOException if array cannot be read\n         ",
      "child_ranges": [
        "(line 795,col 13)-(line 797,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.writeArray(java.io.ObjectOutput, double[][])",
      "begin_line": 805,
      "end_line": 810,
      "comment": " Write an array.\n         * @param out output stream\n         * @param array array to write\n         * @exception IOException if array cannot be read\n         ",
      "child_ranges": [
        "(line 807,col 13)-(line 809,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.readArray(java.io.ObjectInput, double[])",
      "begin_line": 817,
      "end_line": 822,
      "comment": " Read an array.\n         * @param in input stream\n         * @param array array to read\n         * @exception IOException if array cannot be read\n         ",
      "child_ranges": [
        "(line 819,col 13)-(line 821,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.StepInterpolatorWrapper.readArray(java.io.ObjectInput, double[][])",
      "begin_line": 829,
      "end_line": 834,
      "comment": " Read an array.\n         * @param in input stream\n         * @param array array to read\n         * @exception IOException if array cannot be read\n         ",
      "child_ranges": [
        "(line 831,col 13)-(line 833,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EventHandlerWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.events.EventHandler"
      ],
      "begin_line": 839,
      "end_line": 894,
      "comment": " Wrapper for event handlers. "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 842,
      "end_line": 842,
      "comment": " Underlying event handler with jacobians. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 845,
      "end_line": 845,
      "comment": " State array. "
    },
    {
      "type": "field",
      "varNames": [
        "dydy0"
      ],
      "begin_line": 848,
      "end_line": 848,
      "comment": " Jacobian with respect to initial state dy/dy0. "
    },
    {
      "type": "field",
      "varNames": [
        "dydp"
      ],
      "begin_line": 851,
      "end_line": 851,
      "comment": " Jacobian with respect to parameters dy/dp. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.EventHandlerWrapper.EventHandlerWrapper(org.apache.commons.math.ode.jacobians.EventHandlerWithJacobians, int, int)",
      "begin_line": 858,
      "end_line": 864,
      "comment": " Simple constructor.\n         * @param handler underlying event handler with jacobians\n         * @param n dimension of the original ODE\n         * @param k number of parameters\n         ",
      "child_ranges": [
        "(line 860,col 13)-(line 860,col 35)",
        "(line 861,col 13)-(line 861,col 37)",
        "(line 862,col 13)-(line 862,col 40)",
        "(line 863,col 13)-(line 863,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.EventHandlerWrapper.getHandler()",
      "begin_line": 869,
      "end_line": 871,
      "comment": " Get the underlying event handler with jacobians.\n         * @return underlying event handler with jacobians\n         ",
      "child_ranges": [
        "(line 870,col 13)-(line 870,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.EventHandlerWrapper.eventOccurred(double, double[], boolean)",
      "begin_line": 874,
      "end_line": 878,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 876,col 13)-(line 876,col 53)",
        "(line 877,col 13)-(line 877,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.EventHandlerWrapper.g(double, double[])",
      "begin_line": 881,
      "end_line": 885,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 883,col 13)-(line 883,col 53)",
        "(line 884,col 13)-(line 884,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.FirstOrderIntegratorWithJacobians.EventHandlerWrapper.resetState(double, double[])",
      "begin_line": 888,
      "end_line": 892,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 890,col 13)-(line 890,col 53)",
        "(line 891,col 13)-(line 891,col 50)"
      ]
    }
  ]
}