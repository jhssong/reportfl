{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/nonstiff/AdamsBashforthIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AdamsBashforthIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.nonstiff.AdamsIntegrator"
      ],
      "begin_line": 143,
      "end_line": 326,
      "comment": "\n * This class implements explicit Adams-Bashforth integrators for Ordinary\n * Differential Equations.\n *\n * \u003cp\u003eAdams-Bashforth methods (in fact due to Adams alone) are explicit\n * multistep ODE solvers. This implementation is a variation of the classical\n * one: it uses adaptive stepsize to implement error control, whereas\n * classical implementations are fixed step size. The value of state vector\n * at step n+1 is a simple combination of the value at step n and of the\n * derivatives at steps n, n-1, n-2 ... Depending on the number k of previous\n * steps one wants to use for computing the next value, different formulas\n * are available:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ek \u003d 1: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h y\u0027\u003csub\u003en\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003ek \u003d 2: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h (3y\u0027\u003csub\u003en\u003c/sub\u003e-y\u0027\u003csub\u003en-1\u003c/sub\u003e)/2\u003c/li\u003e\n *   \u003cli\u003ek \u003d 3: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h (23y\u0027\u003csub\u003en\u003c/sub\u003e-16y\u0027\u003csub\u003en-1\u003c/sub\u003e+5y\u0027\u003csub\u003en-2\u003c/sub\u003e)/12\u003c/li\u003e\n *   \u003cli\u003ek \u003d 4: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h (55y\u0027\u003csub\u003en\u003c/sub\u003e-59y\u0027\u003csub\u003en-1\u003c/sub\u003e+37y\u0027\u003csub\u003en-2\u003c/sub\u003e-9y\u0027\u003csub\u003en-3\u003c/sub\u003e)/24\u003c/li\u003e\n *   \u003cli\u003e...\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003eA k-steps Adams-Bashforth method is of order k.\u003c/p\u003e\n *\n * \u003ch3\u003eImplementation details\u003c/h3\u003e\n *\n * \u003cp\u003eWe define scaled derivatives s\u003csub\u003ei\u003c/sub\u003e(n) at step n as:\n * \u003cpre\u003e\n * s\u003csub\u003e1\u003c/sub\u003e(n) \u003d h y\u0027\u003csub\u003en\u003c/sub\u003e for first derivative\n * s\u003csub\u003e2\u003c/sub\u003e(n) \u003d h\u003csup\u003e2\u003c/sup\u003e/2 y\u0027\u0027\u003csub\u003en\u003c/sub\u003e for second derivative\n * s\u003csub\u003e3\u003c/sub\u003e(n) \u003d h\u003csup\u003e3\u003c/sup\u003e/6 y\u0027\u0027\u0027\u003csub\u003en\u003c/sub\u003e for third derivative\n * ...\n * s\u003csub\u003ek\u003c/sub\u003e(n) \u003d h\u003csup\u003ek\u003c/sup\u003e/k! y\u003csup\u003e(k)\u003c/sup\u003e\u003csub\u003en\u003c/sub\u003e for k\u003csup\u003eth\u003c/sup\u003e derivative\n * \u003c/pre\u003e\u003c/p\u003e\n *\n * \u003cp\u003eThe definitions above use the classical representation with several previous first\n * derivatives. Lets define\n * \u003cpre\u003e\n *   q\u003csub\u003en\u003c/sub\u003e \u003d [ s\u003csub\u003e1\u003c/sub\u003e(n-1) s\u003csub\u003e1\u003c/sub\u003e(n-2) ... s\u003csub\u003e1\u003c/sub\u003e(n-(k-1)) ]\u003csup\u003eT\u003c/sup\u003e\n * \u003c/pre\u003e\n * (we omit the k index in the notation for clarity). With these definitions,\n * Adams-Bashforth methods can be written:\n * \u003cul\u003e\n *   \u003cli\u003ek \u003d 1: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + s\u003csub\u003e1\u003c/sub\u003e(n)\u003c/li\u003e\n *   \u003cli\u003ek \u003d 2: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + 3/2 s\u003csub\u003e1\u003c/sub\u003e(n) + [ -1/2 ] q\u003csub\u003en\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003ek \u003d 3: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + 23/12 s\u003csub\u003e1\u003c/sub\u003e(n) + [ -16/12 5/12 ] q\u003csub\u003en\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003ek \u003d 4: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + 55/24 s\u003csub\u003e1\u003c/sub\u003e(n) + [ -59/24 37/24 -9/24 ] q\u003csub\u003en\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003e...\u003c/li\u003e\n * \u003c/ul\u003e\u003c/p\u003e\n *\n * \u003cp\u003eInstead of using the classical representation with first derivatives only (y\u003csub\u003en\u003c/sub\u003e,\n * s\u003csub\u003e1\u003c/sub\u003e(n) and q\u003csub\u003en\u003c/sub\u003e), our implementation uses the Nordsieck vector with\n * higher degrees scaled derivatives all taken at the same step (y\u003csub\u003en\u003c/sub\u003e, s\u003csub\u003e1\u003c/sub\u003e(n)\n * and r\u003csub\u003en\u003c/sub\u003e) where r\u003csub\u003en\u003c/sub\u003e is defined as:\n * \u003cpre\u003e\n * r\u003csub\u003en\u003c/sub\u003e \u003d [ s\u003csub\u003e2\u003c/sub\u003e(n), s\u003csub\u003e3\u003c/sub\u003e(n) ... s\u003csub\u003ek\u003c/sub\u003e(n) ]\u003csup\u003eT\u003c/sup\u003e\n * \u003c/pre\u003e\n * (here again we omit the k index in the notation for clarity)\n * \u003c/p\u003e\n *\n * \u003cp\u003eTaylor series formulas show that for any index offset i, s\u003csub\u003e1\u003c/sub\u003e(n-i) can be\n * computed from s\u003csub\u003e1\u003c/sub\u003e(n), s\u003csub\u003e2\u003c/sub\u003e(n) ... s\u003csub\u003ek\u003c/sub\u003e(n), the formula being exact\n * for degree k polynomials.\n * \u003cpre\u003e\n * s\u003csub\u003e1\u003c/sub\u003e(n-i) \u003d s\u003csub\u003e1\u003c/sub\u003e(n) + \u0026sum;\u003csub\u003ej\u003c/sub\u003e j (-i)\u003csup\u003ej-1\u003c/sup\u003e s\u003csub\u003ej\u003c/sub\u003e(n)\n * \u003c/pre\u003e\n * The previous formula can be used with several values for i to compute the transform between\n * classical representation and Nordsieck vector. The transform between r\u003csub\u003en\u003c/sub\u003e\n * and q\u003csub\u003en\u003c/sub\u003e resulting from the Taylor series formulas above is:\n * \u003cpre\u003e\n * q\u003csub\u003en\u003c/sub\u003e \u003d s\u003csub\u003e1\u003c/sub\u003e(n) u + P r\u003csub\u003en\u003c/sub\u003e\n * \u003c/pre\u003e\n * where u is the [ 1 1 ... 1 ]\u003csup\u003eT\u003c/sup\u003e vector and P is the (k-1)\u0026times;(k-1) matrix built\n * with the j (-i)\u003csup\u003ej-1\u003c/sup\u003e terms:\n * \u003cpre\u003e\n *        [  -2   3   -4    5  ... ]\n *        [  -4  12  -32   80  ... ]\n *   P \u003d  [  -6  27 -108  405  ... ]\n *        [  -8  48 -256 1280  ... ]\n *        [          ...           ]\n * \u003c/pre\u003e\u003c/p\u003e\n *\n * \u003cp\u003eUsing the Nordsieck vector has several advantages:\n * \u003cul\u003e\n *   \u003cli\u003eit greatly simplifies step interpolation as the interpolator mainly applies\n *   Taylor series formulas,\u003c/li\u003e\n *   \u003cli\u003eit simplifies step changes that occur when discrete events that truncate\n *   the step are triggered,\u003c/li\u003e\n *   \u003cli\u003eit allows to extend the methods in order to support adaptive stepsize.\u003c/li\u003e\n * \u003c/ul\u003e\u003c/p\u003e\n *\n * \u003cp\u003eThe Nordsieck vector at step n+1 is computed from the Nordsieck vector at step n as follows:\n * \u003cul\u003e\n *   \u003cli\u003ey\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + s\u003csub\u003e1\u003c/sub\u003e(n) + u\u003csup\u003eT\u003c/sup\u003e r\u003csub\u003en\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003es\u003csub\u003e1\u003c/sub\u003e(n+1) \u003d h f(t\u003csub\u003en+1\u003c/sub\u003e, y\u003csub\u003en+1\u003c/sub\u003e)\u003c/li\u003e\n *   \u003cli\u003er\u003csub\u003en+1\u003c/sub\u003e \u003d (s\u003csub\u003e1\u003c/sub\u003e(n) - s\u003csub\u003e1\u003c/sub\u003e(n+1)) P\u003csup\u003e-1\u003c/sup\u003e u + P\u003csup\u003e-1\u003c/sup\u003e A P r\u003csub\u003en\u003c/sub\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n * where A is a rows shifting matrix (the lower left part is an identity matrix):\n * \u003cpre\u003e\n *        [ 0 0   ...  0 0 | 0 ]\n *        [ ---------------+---]\n *        [ 1 0   ...  0 0 | 0 ]\n *    A \u003d [ 0 1   ...  0 0 | 0 ]\n *        [       ...      | 0 ]\n *        [ 0 0   ...  1 0 | 0 ]\n *        [ 0 0   ...  0 1 | 0 ]\n * \u003c/pre\u003e\u003c/p\u003e\n *\n * \u003cp\u003eThe P\u003csup\u003e-1\u003c/sup\u003eu vector and the P\u003csup\u003e-1\u003c/sup\u003e A P matrix do not depend on the state,\n * they only depend on k and therefore are precomputed once for all.\u003c/p\u003e\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "METHOD_NAME"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": " Integrator method name. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator.AdamsBashforthIntegrator(int, double, double, double, double)",
      "begin_line": 161,
      "end_line": 168,
      "comment": "\n     * Build an Adams-Bashforth integrator with the given order and step control parameters.\n     * @param nSteps number of steps of the method excluding the one being computed\n     * @param minStep minimal step (sign is irrelevant, regardless of\n     * integration direction, forward or backward), the last step can\n     * be smaller than this\n     * @param maxStep maximal step (sign is irrelevant, regardless of\n     * integration direction, forward or backward), the last step can\n     * be smaller than this\n     * @param scalAbsoluteTolerance allowed absolute error\n     * @param scalRelativeTolerance allowed relative error\n     * @exception NumberIsTooSmallException if order is 1 or less\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 167,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator.AdamsBashforthIntegrator(int, double, double, double[], double[])",
      "begin_line": 183,
      "end_line": 190,
      "comment": "\n     * Build an Adams-Bashforth integrator with the given order and step control parameters.\n     * @param nSteps number of steps of the method excluding the one being computed\n     * @param minStep minimal step (sign is irrelevant, regardless of\n     * integration direction, forward or backward), the last step can\n     * be smaller than this\n     * @param maxStep maximal step (sign is irrelevant, regardless of\n     * integration direction, forward or backward), the last step can\n     * be smaller than this\n     * @param vecAbsoluteTolerance allowed absolute error\n     * @param vecRelativeTolerance allowed relative error\n     * @exception IllegalArgumentException if order is 1 or less\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 189,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator.integrate(org.apache.commons.math3.ode.ExpandableStatefulODE, double)",
      "begin_line": 193,
      "end_line": 324,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 35)",
        "(line 199,col 9)-(line 199,col 32)",
        "(line 200,col 9)-(line 200,col 56)",
        "(line 203,col 9)-(line 203,col 59)",
        "(line 204,col 9)-(line 204,col 41)",
        "(line 205,col 9)-(line 205,col 51)",
        "(line 208,col 9)-(line 208,col 87)",
        "(line 209,col 9)-(line 210,col 97)",
        "(line 213,col 9)-(line 213,col 52)",
        "(line 216,col 9)-(line 216,col 41)",
        "(line 217,col 9)-(line 217,col 74)",
        "(line 218,col 9)-(line 218,col 42)",
        "(line 219,col 9)-(line 219,col 60)",
        "(line 222,col 9)-(line 222,col 31)",
        "(line 223,col 9)-(line 223,col 35)",
        "(line 226,col 9)-(line 226,col 27)",
        "(line 227,col 9)-(line 316,col 30)",
        "(line 319,col 9)-(line 319,col 37)",
        "(line 320,col 9)-(line 320,col 38)",
        "(line 322,col 9)-(line 322,col 29)"
      ]
    }
  ]
}