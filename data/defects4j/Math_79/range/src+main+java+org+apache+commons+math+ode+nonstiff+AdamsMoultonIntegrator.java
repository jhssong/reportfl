{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/ode/nonstiff/AdamsMoultonIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AdamsMoultonIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.AdamsIntegrator"
      ],
      "begin_line": 158,
      "end_line": 440,
      "comment": "\n * This class implements implicit Adams-Moulton integrators for Ordinary\n * Differential Equations.\n *\n * \u003cp\u003eAdams-Moulton methods (in fact due to Adams alone) are implicit\n * multistep ODE solvers. This implementation is a variation of the classical\n * one: it uses adaptive stepsize to implement error control, whereas\n * classical implementations are fixed step size. The value of state vector\n * at step n+1 is a simple combination of the value at step n and of the\n * derivatives at steps n+1, n, n-1 ... Since y\u0027\u003csub\u003en+1\u003c/sub\u003e is needed to\n * compute y\u003csub\u003en+1\u003c/sub\u003e,another method must be used to compute a first\n * estimate of y\u003csub\u003en+1\u003c/sub\u003e, then compute y\u0027\u003csub\u003en+1\u003c/sub\u003e, then compute\n * a final estimate of y\u003csub\u003en+1\u003c/sub\u003e using the following formulas. Depending\n * on the number k of previous steps one wants to use for computing the next\n * value, different formulas are available for the final estimate:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ek \u003d 1: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h y\u0027\u003csub\u003en+1\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003ek \u003d 2: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h (y\u0027\u003csub\u003en+1\u003c/sub\u003e+y\u0027\u003csub\u003en\u003c/sub\u003e)/2\u003c/li\u003e\n *   \u003cli\u003ek \u003d 3: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h (5y\u0027\u003csub\u003en+1\u003c/sub\u003e+8y\u0027\u003csub\u003en\u003c/sub\u003e-y\u0027\u003csub\u003en-1\u003c/sub\u003e)/12\u003c/li\u003e\n *   \u003cli\u003ek \u003d 4: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h (9y\u0027\u003csub\u003en+1\u003c/sub\u003e+19y\u0027\u003csub\u003en\u003c/sub\u003e-5y\u0027\u003csub\u003en-1\u003c/sub\u003e+y\u0027\u003csub\u003en-2\u003c/sub\u003e)/24\u003c/li\u003e\n *   \u003cli\u003e...\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003eA k-steps Adams-Moulton method is of order k+1.\u003c/p\u003e\n *\n * \u003ch3\u003eImplementation details\u003c/h3\u003e\n *\n * \u003cp\u003eWe define scaled derivatives s\u003csub\u003ei\u003c/sub\u003e(n) at step n as:\n * \u003cpre\u003e\n * s\u003csub\u003e1\u003c/sub\u003e(n) \u003d h y\u0027\u003csub\u003en\u003c/sub\u003e for first derivative\n * s\u003csub\u003e2\u003c/sub\u003e(n) \u003d h\u003csup\u003e2\u003c/sup\u003e/2 y\u0027\u0027\u003csub\u003en\u003c/sub\u003e for second derivative\n * s\u003csub\u003e3\u003c/sub\u003e(n) \u003d h\u003csup\u003e3\u003c/sup\u003e/6 y\u0027\u0027\u0027\u003csub\u003en\u003c/sub\u003e for third derivative\n * ...\n * s\u003csub\u003ek\u003c/sub\u003e(n) \u003d h\u003csup\u003ek\u003c/sup\u003e/k! y(k)\u003csub\u003en\u003c/sub\u003e for k\u003csup\u003eth\u003c/sup\u003e derivative\n * \u003c/pre\u003e\u003c/p\u003e\n *\n * \u003cp\u003eThe definitions above use the classical representation with several previous first\n * derivatives. Lets define\n * \u003cpre\u003e\n *   q\u003csub\u003en\u003c/sub\u003e \u003d [ s\u003csub\u003e1\u003c/sub\u003e(n-1) s\u003csub\u003e1\u003c/sub\u003e(n-2) ... s\u003csub\u003e1\u003c/sub\u003e(n-(k-1)) ]\u003csup\u003eT\u003c/sup\u003e\n * \u003c/pre\u003e\n * (we omit the k index in the notation for clarity). With these definitions,\n * Adams-Moulton methods can be written:\n * \u003cul\u003e\n *   \u003cli\u003ek \u003d 1: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + s\u003csub\u003e1\u003c/sub\u003e(n+1)\u003c/li\u003e\n *   \u003cli\u003ek \u003d 2: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + 1/2 s\u003csub\u003e1\u003c/sub\u003e(n+1) + [ 1/2 ] q\u003csub\u003en+1\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003ek \u003d 3: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + 5/12 s\u003csub\u003e1\u003c/sub\u003e(n+1) + [ 8/12 -1/12 ] q\u003csub\u003en+1\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003ek \u003d 4: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + 9/24 s\u003csub\u003e1\u003c/sub\u003e(n+1) + [ 19/24 -5/24 1/24 ] q\u003csub\u003en+1\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003e...\u003c/li\u003e\n * \u003c/ul\u003e\u003c/p\u003e\n *\n * \u003cp\u003eInstead of using the classical representation with first derivatives only (y\u003csub\u003en\u003c/sub\u003e,\n * s\u003csub\u003e1\u003c/sub\u003e(n+1) and q\u003csub\u003en+1\u003c/sub\u003e), our implementation uses the Nordsieck vector with\n * higher degrees scaled derivatives all taken at the same step (y\u003csub\u003en\u003c/sub\u003e, s\u003csub\u003e1\u003c/sub\u003e(n)\n * and r\u003csub\u003en\u003c/sub\u003e) where r\u003csub\u003en\u003c/sub\u003e is defined as:\n * \u003cpre\u003e\n * r\u003csub\u003en\u003c/sub\u003e \u003d [ s\u003csub\u003e2\u003c/sub\u003e(n), s\u003csub\u003e3\u003c/sub\u003e(n) ... s\u003csub\u003ek\u003c/sub\u003e(n) ]\u003csup\u003eT\u003c/sup\u003e\n * \u003c/pre\u003e\n * (here again we omit the k index in the notation for clarity)\n * \u003c/p\u003e\n *\n * \u003cp\u003eTaylor series formulas show that for any index offset i, s\u003csub\u003e1\u003c/sub\u003e(n-i) can be\n * computed from s\u003csub\u003e1\u003c/sub\u003e(n), s\u003csub\u003e2\u003c/sub\u003e(n) ... s\u003csub\u003ek\u003c/sub\u003e(n), the formula being exact\n * for degree k polynomials.\n * \u003cpre\u003e\n * s\u003csub\u003e1\u003c/sub\u003e(n-i) \u003d s\u003csub\u003e1\u003c/sub\u003e(n) + \u0026sum;\u003csub\u003ej\u003c/sub\u003e j (-i)\u003csup\u003ej-1\u003c/sup\u003e s\u003csub\u003ej\u003c/sub\u003e(n)\n * \u003c/pre\u003e\n * The previous formula can be used with several values for i to compute the transform between\n * classical representation and Nordsieck vector. The transform between r\u003csub\u003en\u003c/sub\u003e\n * and q\u003csub\u003en\u003c/sub\u003e resulting from the Taylor series formulas above is:\n * \u003cpre\u003e\n * q\u003csub\u003en\u003c/sub\u003e \u003d s\u003csub\u003e1\u003c/sub\u003e(n) u + P r\u003csub\u003en\u003c/sub\u003e\n * \u003c/pre\u003e\n * where u is the [ 1 1 ... 1 ]\u003csup\u003eT\u003c/sup\u003e vector and P is the (k-1)\u0026times;(k-1) matrix built\n * with the j (-i)\u003csup\u003ej-1\u003c/sup\u003e terms:\n * \u003cpre\u003e\n *        [  -2   3   -4    5  ... ]\n *        [  -4  12  -32   80  ... ]\n *   P \u003d  [  -6  27 -108  405  ... ]\n *        [  -8  48 -256 1280  ... ]\n *        [          ...           ]\n * \u003c/pre\u003e\u003c/p\u003e\n *\n * \u003cp\u003eUsing the Nordsieck vector has several advantages:\n * \u003cul\u003e\n *   \u003cli\u003eit greatly simplifies step interpolation as the interpolator mainly applies\n *   Taylor series formulas,\u003c/li\u003e\n *   \u003cli\u003eit simplifies step changes that occur when discrete events that truncate\n *   the step are triggered,\u003c/li\u003e\n *   \u003cli\u003eit allows to extend the methods in order to support adaptive stepsize.\u003c/li\u003e\n * \u003c/ul\u003e\u003c/p\u003e\n *\n * \u003cp\u003eThe predicted Nordsieck vector at step n+1 is computed from the Nordsieck vector at step\n * n as follows:\n * \u003cul\u003e\n *   \u003cli\u003eY\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + s\u003csub\u003e1\u003c/sub\u003e(n) + u\u003csup\u003eT\u003c/sup\u003e r\u003csub\u003en\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003eS\u003csub\u003e1\u003c/sub\u003e(n+1) \u003d h f(t\u003csub\u003en+1\u003c/sub\u003e, Y\u003csub\u003en+1\u003c/sub\u003e)\u003c/li\u003e\n *   \u003cli\u003eR\u003csub\u003en+1\u003c/sub\u003e \u003d (s\u003csub\u003e1\u003c/sub\u003e(n) - S\u003csub\u003e1\u003c/sub\u003e(n+1)) P\u003csup\u003e-1\u003c/sup\u003e u + P\u003csup\u003e-1\u003c/sup\u003e A P r\u003csub\u003en\u003c/sub\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n * where A is a rows shifting matrix (the lower left part is an identity matrix):\n * \u003cpre\u003e\n *        [ 0 0   ...  0 0 | 0 ]\n *        [ ---------------+---]\n *        [ 1 0   ...  0 0 | 0 ]\n *    A \u003d [ 0 1   ...  0 0 | 0 ]\n *        [       ...      | 0 ]\n *        [ 0 0   ...  1 0 | 0 ]\n *        [ 0 0   ...  0 1 | 0 ]\n * \u003c/pre\u003e\n * From this predicted vector, the corrected vector is computed as follows:\n * \u003cul\u003e\n *   \u003cli\u003ey\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + S\u003csub\u003e1\u003c/sub\u003e(n+1) + [ -1 +1 -1 +1 ... \u0026plusmn;1 ] r\u003csub\u003en+1\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003es\u003csub\u003e1\u003c/sub\u003e(n+1) \u003d h f(t\u003csub\u003en+1\u003c/sub\u003e, y\u003csub\u003en+1\u003c/sub\u003e)\u003c/li\u003e\n *   \u003cli\u003er\u003csub\u003en+1\u003c/sub\u003e \u003d R\u003csub\u003en+1\u003c/sub\u003e + (s\u003csub\u003e1\u003c/sub\u003e(n+1) - S\u003csub\u003e1\u003c/sub\u003e(n+1)) P\u003csup\u003e-1\u003c/sup\u003e u\u003c/li\u003e\n * \u003c/ul\u003e\n * where the upper case Y\u003csub\u003en+1\u003c/sub\u003e, S\u003csub\u003e1\u003c/sub\u003e(n+1) and R\u003csub\u003en+1\u003c/sub\u003e represent the\n * predicted states whereas the lower case y\u003csub\u003en+1\u003c/sub\u003e, s\u003csub\u003en+1\u003c/sub\u003e and r\u003csub\u003en+1\u003c/sub\u003e\n * represent the corrected states.\u003c/p\u003e\n *\n * \u003cp\u003eThe P\u003csup\u003e-1\u003c/sup\u003eu vector and the P\u003csup\u003e-1\u003c/sup\u003e A P matrix do not depend on the state,\n * they only depend on k and therefore are precomputed once for all.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator.AdamsMoultonIntegrator(int, double, double, double, double)",
      "begin_line": 171,
      "end_line": 178,
      "comment": "\n     * Build an Adams-Moulton integrator with the given order and error control parameters.\n     * @param nSteps number of steps of the method excluding the one being computed\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param scalAbsoluteTolerance allowed absolute error\n     * @param scalRelativeTolerance allowed relative error\n     * @exception IllegalArgumentException if order is 1 or less\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 177,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator.AdamsMoultonIntegrator(int, double, double, double[], double[])",
      "begin_line": 191,
      "end_line": 198,
      "comment": "\n     * Build an Adams-Moulton integrator with the given order and error control parameters.\n     * @param nSteps number of steps of the method excluding the one being computed\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param vecAbsoluteTolerance allowed absolute error\n     * @param vecRelativeTolerance allowed relative error\n     * @exception IllegalArgumentException if order is 1 or less\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 197,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 202,
      "end_line": 361,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 32)",
        "(line 209,col 9)-(line 209,col 46)",
        "(line 210,col 9)-(line 210,col 32)",
        "(line 211,col 9)-(line 211,col 27)",
        "(line 212,col 9)-(line 212,col 39)",
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 52)",
        "(line 219,col 9)-(line 219,col 52)",
        "(line 222,col 9)-(line 222,col 87)",
        "(line 223,col 9)-(line 223,col 46)",
        "(line 224,col 9)-(line 224,col 90)",
        "(line 225,col 9)-(line 225,col 52)",
        "(line 228,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 231,col 88)",
        "(line 235,col 9)-(line 235,col 24)",
        "(line 236,col 9)-(line 236,col 74)",
        "(line 237,col 9)-(line 237,col 42)",
        "(line 239,col 9)-(line 239,col 31)",
        "(line 240,col 9)-(line 240,col 35)",
        "(line 242,col 9)-(line 242,col 33)",
        "(line 243,col 9)-(line 354,col 9)",
        "(line 356,col 9)-(line 356,col 43)",
        "(line 357,col 9)-(line 357,col 31)",
        "(line 358,col 9)-(line 358,col 31)",
        "(line 359,col 9)-(line 359,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Corrector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealMatrixPreservingVisitor"
      ],
      "begin_line": 371,
      "end_line": 438,
      "comment": " Corrector for current state in Adams-Moulton method.\n     * \u003cp\u003e\n     * This visitor implements the Taylor series formula:\n     * \u003cpre\u003e\n     * Y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + s\u003csub\u003e1\u003c/sub\u003e(n+1) + [ -1 +1 -1 +1 ... \u0026plusmn;1 ] r\u003csub\u003en+1\u003c/sub\u003e\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "previous"
      ],
      "begin_line": 374,
      "end_line": 374,
      "comment": " Previous state. "
    },
    {
      "type": "field",
      "varNames": [
        "scaled"
      ],
      "begin_line": 377,
      "end_line": 377,
      "comment": " Current scaled first derivative. "
    },
    {
      "type": "field",
      "varNames": [
        "before"
      ],
      "begin_line": 380,
      "end_line": 380,
      "comment": " Current state before correction. "
    },
    {
      "type": "field",
      "varNames": [
        "after"
      ],
      "begin_line": 383,
      "end_line": 383,
      "comment": " Current state after correction. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator.Corrector.Corrector(double[], double[], double[])",
      "begin_line": 390,
      "end_line": 395,
      "comment": " Simple constructor.\n         * @param previous previous state\n         * @param scaled current scaled first derivative\n         * @param state state to correct (will be overwritten after visit)\n         ",
      "child_ranges": [
        "(line 391,col 13)-(line 391,col 37)",
        "(line 392,col 13)-(line 392,col 35)",
        "(line 393,col 13)-(line 393,col 34)",
        "(line 394,col 13)-(line 394,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator.Corrector.start(int, int, int, int, int, int)",
      "begin_line": 398,
      "end_line": 401,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 400,col 13)-(line 400,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator.Corrector.visit(int, int, double)",
      "begin_line": 404,
      "end_line": 411,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 406,col 13)-(line 410,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator.Corrector.end()",
      "begin_line": 422,
      "end_line": 437,
      "comment": "\n         * End visiting te Nordsieck vector.\n         * \u003cp\u003eThe correction is used to control stepsize. So its amplitude is\n         * considered to be an error, which must be normalized according to\n         * error control settings. If the normalized value is greater than 1,\n         * the correction was too large and the step must be rejected.\u003c/p\u003e\n         * @return the normalized correction, if greater than 1, the step\n         * must be rejected\n         ",
      "child_ranges": [
        "(line 424,col 13)-(line 424,col 29)",
        "(line 425,col 13)-(line 433,col 13)",
        "(line 435,col 13)-(line 435,col 51)"
      ]
    }
  ]
}