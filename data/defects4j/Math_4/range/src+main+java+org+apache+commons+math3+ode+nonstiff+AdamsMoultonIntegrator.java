{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/nonstiff/AdamsMoultonIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AdamsMoultonIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.nonstiff.AdamsIntegrator"
      ],
      "begin_line": 159,
      "end_line": 422,
      "comment": "\n * This class implements implicit Adams-Moulton integrators for Ordinary\n * Differential Equations.\n *\n * \u003cp\u003eAdams-Moulton methods (in fact due to Adams alone) are implicit\n * multistep ODE solvers. This implementation is a variation of the classical\n * one: it uses adaptive stepsize to implement error control, whereas\n * classical implementations are fixed step size. The value of state vector\n * at step n+1 is a simple combination of the value at step n and of the\n * derivatives at steps n+1, n, n-1 ... Since y\u0027\u003csub\u003en+1\u003c/sub\u003e is needed to\n * compute y\u003csub\u003en+1\u003c/sub\u003e, another method must be used to compute a first\n * estimate of y\u003csub\u003en+1\u003c/sub\u003e, then compute y\u0027\u003csub\u003en+1\u003c/sub\u003e, then compute\n * a final estimate of y\u003csub\u003en+1\u003c/sub\u003e using the following formulas. Depending\n * on the number k of previous steps one wants to use for computing the next\n * value, different formulas are available for the final estimate:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ek \u003d 1: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h y\u0027\u003csub\u003en+1\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003ek \u003d 2: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h (y\u0027\u003csub\u003en+1\u003c/sub\u003e+y\u0027\u003csub\u003en\u003c/sub\u003e)/2\u003c/li\u003e\n *   \u003cli\u003ek \u003d 3: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h (5y\u0027\u003csub\u003en+1\u003c/sub\u003e+8y\u0027\u003csub\u003en\u003c/sub\u003e-y\u0027\u003csub\u003en-1\u003c/sub\u003e)/12\u003c/li\u003e\n *   \u003cli\u003ek \u003d 4: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h (9y\u0027\u003csub\u003en+1\u003c/sub\u003e+19y\u0027\u003csub\u003en\u003c/sub\u003e-5y\u0027\u003csub\u003en-1\u003c/sub\u003e+y\u0027\u003csub\u003en-2\u003c/sub\u003e)/24\u003c/li\u003e\n *   \u003cli\u003e...\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003eA k-steps Adams-Moulton method is of order k+1.\u003c/p\u003e\n *\n * \u003ch3\u003eImplementation details\u003c/h3\u003e\n *\n * \u003cp\u003eWe define scaled derivatives s\u003csub\u003ei\u003c/sub\u003e(n) at step n as:\n * \u003cpre\u003e\n * s\u003csub\u003e1\u003c/sub\u003e(n) \u003d h y\u0027\u003csub\u003en\u003c/sub\u003e for first derivative\n * s\u003csub\u003e2\u003c/sub\u003e(n) \u003d h\u003csup\u003e2\u003c/sup\u003e/2 y\u0027\u0027\u003csub\u003en\u003c/sub\u003e for second derivative\n * s\u003csub\u003e3\u003c/sub\u003e(n) \u003d h\u003csup\u003e3\u003c/sup\u003e/6 y\u0027\u0027\u0027\u003csub\u003en\u003c/sub\u003e for third derivative\n * ...\n * s\u003csub\u003ek\u003c/sub\u003e(n) \u003d h\u003csup\u003ek\u003c/sup\u003e/k! y\u003csup\u003e(k)\u003c/sup\u003e\u003csub\u003en\u003c/sub\u003e for k\u003csup\u003eth\u003c/sup\u003e derivative\n * \u003c/pre\u003e\u003c/p\u003e\n *\n * \u003cp\u003eThe definitions above use the classical representation with several previous first\n * derivatives. Lets define\n * \u003cpre\u003e\n *   q\u003csub\u003en\u003c/sub\u003e \u003d [ s\u003csub\u003e1\u003c/sub\u003e(n-1) s\u003csub\u003e1\u003c/sub\u003e(n-2) ... s\u003csub\u003e1\u003c/sub\u003e(n-(k-1)) ]\u003csup\u003eT\u003c/sup\u003e\n * \u003c/pre\u003e\n * (we omit the k index in the notation for clarity). With these definitions,\n * Adams-Moulton methods can be written:\n * \u003cul\u003e\n *   \u003cli\u003ek \u003d 1: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + s\u003csub\u003e1\u003c/sub\u003e(n+1)\u003c/li\u003e\n *   \u003cli\u003ek \u003d 2: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + 1/2 s\u003csub\u003e1\u003c/sub\u003e(n+1) + [ 1/2 ] q\u003csub\u003en+1\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003ek \u003d 3: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + 5/12 s\u003csub\u003e1\u003c/sub\u003e(n+1) + [ 8/12 -1/12 ] q\u003csub\u003en+1\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003ek \u003d 4: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + 9/24 s\u003csub\u003e1\u003c/sub\u003e(n+1) + [ 19/24 -5/24 1/24 ] q\u003csub\u003en+1\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003e...\u003c/li\u003e\n * \u003c/ul\u003e\u003c/p\u003e\n *\n * \u003cp\u003eInstead of using the classical representation with first derivatives only (y\u003csub\u003en\u003c/sub\u003e,\n * s\u003csub\u003e1\u003c/sub\u003e(n+1) and q\u003csub\u003en+1\u003c/sub\u003e), our implementation uses the Nordsieck vector with\n * higher degrees scaled derivatives all taken at the same step (y\u003csub\u003en\u003c/sub\u003e, s\u003csub\u003e1\u003c/sub\u003e(n)\n * and r\u003csub\u003en\u003c/sub\u003e) where r\u003csub\u003en\u003c/sub\u003e is defined as:\n * \u003cpre\u003e\n * r\u003csub\u003en\u003c/sub\u003e \u003d [ s\u003csub\u003e2\u003c/sub\u003e(n), s\u003csub\u003e3\u003c/sub\u003e(n) ... s\u003csub\u003ek\u003c/sub\u003e(n) ]\u003csup\u003eT\u003c/sup\u003e\n * \u003c/pre\u003e\n * (here again we omit the k index in the notation for clarity)\n * \u003c/p\u003e\n *\n * \u003cp\u003eTaylor series formulas show that for any index offset i, s\u003csub\u003e1\u003c/sub\u003e(n-i) can be\n * computed from s\u003csub\u003e1\u003c/sub\u003e(n), s\u003csub\u003e2\u003c/sub\u003e(n) ... s\u003csub\u003ek\u003c/sub\u003e(n), the formula being exact\n * for degree k polynomials.\n * \u003cpre\u003e\n * s\u003csub\u003e1\u003c/sub\u003e(n-i) \u003d s\u003csub\u003e1\u003c/sub\u003e(n) + \u0026sum;\u003csub\u003ej\u003c/sub\u003e j (-i)\u003csup\u003ej-1\u003c/sup\u003e s\u003csub\u003ej\u003c/sub\u003e(n)\n * \u003c/pre\u003e\n * The previous formula can be used with several values for i to compute the transform between\n * classical representation and Nordsieck vector. The transform between r\u003csub\u003en\u003c/sub\u003e\n * and q\u003csub\u003en\u003c/sub\u003e resulting from the Taylor series formulas above is:\n * \u003cpre\u003e\n * q\u003csub\u003en\u003c/sub\u003e \u003d s\u003csub\u003e1\u003c/sub\u003e(n) u + P r\u003csub\u003en\u003c/sub\u003e\n * \u003c/pre\u003e\n * where u is the [ 1 1 ... 1 ]\u003csup\u003eT\u003c/sup\u003e vector and P is the (k-1)\u0026times;(k-1) matrix built\n * with the j (-i)\u003csup\u003ej-1\u003c/sup\u003e terms:\n * \u003cpre\u003e\n *        [  -2   3   -4    5  ... ]\n *        [  -4  12  -32   80  ... ]\n *   P \u003d  [  -6  27 -108  405  ... ]\n *        [  -8  48 -256 1280  ... ]\n *        [          ...           ]\n * \u003c/pre\u003e\u003c/p\u003e\n *\n * \u003cp\u003eUsing the Nordsieck vector has several advantages:\n * \u003cul\u003e\n *   \u003cli\u003eit greatly simplifies step interpolation as the interpolator mainly applies\n *   Taylor series formulas,\u003c/li\u003e\n *   \u003cli\u003eit simplifies step changes that occur when discrete events that truncate\n *   the step are triggered,\u003c/li\u003e\n *   \u003cli\u003eit allows to extend the methods in order to support adaptive stepsize.\u003c/li\u003e\n * \u003c/ul\u003e\u003c/p\u003e\n *\n * \u003cp\u003eThe predicted Nordsieck vector at step n+1 is computed from the Nordsieck vector at step\n * n as follows:\n * \u003cul\u003e\n *   \u003cli\u003eY\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + s\u003csub\u003e1\u003c/sub\u003e(n) + u\u003csup\u003eT\u003c/sup\u003e r\u003csub\u003en\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003eS\u003csub\u003e1\u003c/sub\u003e(n+1) \u003d h f(t\u003csub\u003en+1\u003c/sub\u003e, Y\u003csub\u003en+1\u003c/sub\u003e)\u003c/li\u003e\n *   \u003cli\u003eR\u003csub\u003en+1\u003c/sub\u003e \u003d (s\u003csub\u003e1\u003c/sub\u003e(n) - S\u003csub\u003e1\u003c/sub\u003e(n+1)) P\u003csup\u003e-1\u003c/sup\u003e u + P\u003csup\u003e-1\u003c/sup\u003e A P r\u003csub\u003en\u003c/sub\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n * where A is a rows shifting matrix (the lower left part is an identity matrix):\n * \u003cpre\u003e\n *        [ 0 0   ...  0 0 | 0 ]\n *        [ ---------------+---]\n *        [ 1 0   ...  0 0 | 0 ]\n *    A \u003d [ 0 1   ...  0 0 | 0 ]\n *        [       ...      | 0 ]\n *        [ 0 0   ...  1 0 | 0 ]\n *        [ 0 0   ...  0 1 | 0 ]\n * \u003c/pre\u003e\n * From this predicted vector, the corrected vector is computed as follows:\n * \u003cul\u003e\n *   \u003cli\u003ey\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + S\u003csub\u003e1\u003c/sub\u003e(n+1) + [ -1 +1 -1 +1 ... \u0026plusmn;1 ] r\u003csub\u003en+1\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003es\u003csub\u003e1\u003c/sub\u003e(n+1) \u003d h f(t\u003csub\u003en+1\u003c/sub\u003e, y\u003csub\u003en+1\u003c/sub\u003e)\u003c/li\u003e\n *   \u003cli\u003er\u003csub\u003en+1\u003c/sub\u003e \u003d R\u003csub\u003en+1\u003c/sub\u003e + (s\u003csub\u003e1\u003c/sub\u003e(n+1) - S\u003csub\u003e1\u003c/sub\u003e(n+1)) P\u003csup\u003e-1\u003c/sup\u003e u\u003c/li\u003e\n * \u003c/ul\u003e\n * where the upper case Y\u003csub\u003en+1\u003c/sub\u003e, S\u003csub\u003e1\u003c/sub\u003e(n+1) and R\u003csub\u003en+1\u003c/sub\u003e represent the\n * predicted states whereas the lower case y\u003csub\u003en+1\u003c/sub\u003e, s\u003csub\u003en+1\u003c/sub\u003e and r\u003csub\u003en+1\u003c/sub\u003e\n * represent the corrected states.\u003c/p\u003e\n *\n * \u003cp\u003eThe P\u003csup\u003e-1\u003c/sup\u003eu vector and the P\u003csup\u003e-1\u003c/sup\u003e A P matrix do not depend on the state,\n * they only depend on k and therefore are precomputed once for all.\u003c/p\u003e\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "METHOD_NAME"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": " Integrator method name. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator.AdamsMoultonIntegrator(int, double, double, double, double)",
      "begin_line": 177,
      "end_line": 184,
      "comment": "\n     * Build an Adams-Moulton integrator with the given order and error control parameters.\n     * @param nSteps number of steps of the method excluding the one being computed\n     * @param minStep minimal step (sign is irrelevant, regardless of\n     * integration direction, forward or backward), the last step can\n     * be smaller than this\n     * @param maxStep maximal step (sign is irrelevant, regardless of\n     * integration direction, forward or backward), the last step can\n     * be smaller than this\n     * @param scalAbsoluteTolerance allowed absolute error\n     * @param scalRelativeTolerance allowed relative error\n     * @exception NumberIsTooSmallException if order is 1 or less\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 183,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator.AdamsMoultonIntegrator(int, double, double, double[], double[])",
      "begin_line": 199,
      "end_line": 206,
      "comment": "\n     * Build an Adams-Moulton integrator with the given order and error control parameters.\n     * @param nSteps number of steps of the method excluding the one being computed\n     * @param minStep minimal step (sign is irrelevant, regardless of\n     * integration direction, forward or backward), the last step can\n     * be smaller than this\n     * @param maxStep maximal step (sign is irrelevant, regardless of\n     * integration direction, forward or backward), the last step can\n     * be smaller than this\n     * @param vecAbsoluteTolerance allowed absolute error\n     * @param vecRelativeTolerance allowed relative error\n     * @exception IllegalArgumentException if order is 1 or less\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 205,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator.integrate(org.apache.commons.math3.ode.ExpandableStatefulODE, double)",
      "begin_line": 210,
      "end_line": 342,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 35)",
        "(line 216,col 9)-(line 216,col 32)",
        "(line 217,col 9)-(line 217,col 56)",
        "(line 220,col 9)-(line 220,col 59)",
        "(line 221,col 9)-(line 221,col 41)",
        "(line 222,col 9)-(line 222,col 51)",
        "(line 223,col 9)-(line 223,col 51)",
        "(line 224,col 9)-(line 224,col 62)",
        "(line 225,col 9)-(line 225,col 49)",
        "(line 228,col 9)-(line 228,col 87)",
        "(line 229,col 9)-(line 230,col 97)",
        "(line 233,col 9)-(line 233,col 52)",
        "(line 236,col 9)-(line 236,col 41)",
        "(line 237,col 9)-(line 237,col 74)",
        "(line 238,col 9)-(line 238,col 42)",
        "(line 240,col 9)-(line 240,col 31)",
        "(line 241,col 9)-(line 241,col 35)",
        "(line 243,col 9)-(line 243,col 27)",
        "(line 244,col 9)-(line 334,col 30)",
        "(line 337,col 9)-(line 337,col 37)",
        "(line 338,col 9)-(line 338,col 38)",
        "(line 340,col 9)-(line 340,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Corrector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.RealMatrixPreservingVisitor"
      ],
      "begin_line": 352,
      "end_line": 420,
      "comment": " Corrector for current state in Adams-Moulton method.\n     * \u003cp\u003e\n     * This visitor implements the Taylor series formula:\n     * \u003cpre\u003e\n     * Y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + s\u003csub\u003e1\u003c/sub\u003e(n+1) + [ -1 +1 -1 +1 ... \u0026plusmn;1 ] r\u003csub\u003en+1\u003c/sub\u003e\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "previous"
      ],
      "begin_line": 355,
      "end_line": 355,
      "comment": " Previous state. "
    },
    {
      "type": "field",
      "varNames": [
        "scaled"
      ],
      "begin_line": 358,
      "end_line": 358,
      "comment": " Current scaled first derivative. "
    },
    {
      "type": "field",
      "varNames": [
        "before"
      ],
      "begin_line": 361,
      "end_line": 361,
      "comment": " Current state before correction. "
    },
    {
      "type": "field",
      "varNames": [
        "after"
      ],
      "begin_line": 364,
      "end_line": 364,
      "comment": " Current state after correction. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator.Corrector.Corrector(double[], double[], double[])",
      "begin_line": 371,
      "end_line": 376,
      "comment": " Simple constructor.\n         * @param previous previous state\n         * @param scaled current scaled first derivative\n         * @param state state to correct (will be overwritten after visit)\n         ",
      "child_ranges": [
        "(line 372,col 13)-(line 372,col 37)",
        "(line 373,col 13)-(line 373,col 35)",
        "(line 374,col 13)-(line 374,col 34)",
        "(line 375,col 13)-(line 375,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator.Corrector.start(int, int, int, int, int, int)",
      "begin_line": 379,
      "end_line": 382,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 381,col 13)-(line 381,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator.Corrector.visit(int, int, double)",
      "begin_line": 385,
      "end_line": 391,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 386,col 13)-(line 390,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator.Corrector.end()",
      "begin_line": 402,
      "end_line": 419,
      "comment": "\n         * End visiting the Nordsieck vector.\n         * \u003cp\u003eThe correction is used to control stepsize. So its amplitude is\n         * considered to be an error, which must be normalized according to\n         * error control settings. If the normalized value is greater than 1,\n         * the correction was too large and the step must be rejected.\u003c/p\u003e\n         * @return the normalized correction, if greater than 1, the step\n         * must be rejected\n         ",
      "child_ranges": [
        "(line 404,col 13)-(line 404,col 29)",
        "(line 405,col 13)-(line 415,col 13)",
        "(line 417,col 13)-(line 417,col 59)"
      ]
    }
  ]
}