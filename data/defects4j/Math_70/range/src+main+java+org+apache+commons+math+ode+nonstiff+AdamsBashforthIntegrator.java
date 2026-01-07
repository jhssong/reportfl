{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/ode/nonstiff/AdamsBashforthIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AdamsBashforthIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.AdamsIntegrator"
      ],
      "begin_line": 141,
      "end_line": 353,
      "comment": "\n * This class implements explicit Adams-Bashforth integrators for Ordinary\n * Differential Equations.\n *\n * \u003cp\u003eAdams-Bashforth methods (in fact due to Adams alone) are explicit\n * multistep ODE solvers. This implementation is a variation of the classical\n * one: it uses adaptive stepsize to implement error control, whereas\n * classical implementations are fixed step size. The value of state vector\n * at step n+1 is a simple combination of the value at step n and of the\n * derivatives at steps n, n-1, n-2 ... Depending on the number k of previous\n * steps one wants to use for computing the next value, different formulas\n * are available:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ek \u003d 1: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h y\u0027\u003csub\u003en\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003ek \u003d 2: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h (3y\u0027\u003csub\u003en\u003c/sub\u003e-y\u0027\u003csub\u003en-1\u003c/sub\u003e)/2\u003c/li\u003e\n *   \u003cli\u003ek \u003d 3: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h (23y\u0027\u003csub\u003en\u003c/sub\u003e-16y\u0027\u003csub\u003en-1\u003c/sub\u003e+5y\u0027\u003csub\u003en-2\u003c/sub\u003e)/12\u003c/li\u003e\n *   \u003cli\u003ek \u003d 4: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h (55y\u0027\u003csub\u003en\u003c/sub\u003e-59y\u0027\u003csub\u003en-1\u003c/sub\u003e+37y\u0027\u003csub\u003en-2\u003c/sub\u003e-9y\u0027\u003csub\u003en-3\u003c/sub\u003e)/24\u003c/li\u003e\n *   \u003cli\u003e...\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003eA k-steps Adams-Bashforth method is of order k.\u003c/p\u003e\n *\n * \u003ch3\u003eImplementation details\u003c/h3\u003e\n *\n * \u003cp\u003eWe define scaled derivatives s\u003csub\u003ei\u003c/sub\u003e(n) at step n as:\n * \u003cpre\u003e\n * s\u003csub\u003e1\u003c/sub\u003e(n) \u003d h y\u0027\u003csub\u003en\u003c/sub\u003e for first derivative\n * s\u003csub\u003e2\u003c/sub\u003e(n) \u003d h\u003csup\u003e2\u003c/sup\u003e/2 y\u0027\u0027\u003csub\u003en\u003c/sub\u003e for second derivative\n * s\u003csub\u003e3\u003c/sub\u003e(n) \u003d h\u003csup\u003e3\u003c/sup\u003e/6 y\u0027\u0027\u0027\u003csub\u003en\u003c/sub\u003e for third derivative\n * ...\n * s\u003csub\u003ek\u003c/sub\u003e(n) \u003d h\u003csup\u003ek\u003c/sup\u003e/k! y(k)\u003csub\u003en\u003c/sub\u003e for k\u003csup\u003eth\u003c/sup\u003e derivative\n * \u003c/pre\u003e\u003c/p\u003e\n *\n * \u003cp\u003eThe definitions above use the classical representation with several previous first\n * derivatives. Lets define\n * \u003cpre\u003e\n *   q\u003csub\u003en\u003c/sub\u003e \u003d [ s\u003csub\u003e1\u003c/sub\u003e(n-1) s\u003csub\u003e1\u003c/sub\u003e(n-2) ... s\u003csub\u003e1\u003c/sub\u003e(n-(k-1)) ]\u003csup\u003eT\u003c/sup\u003e\n * \u003c/pre\u003e\n * (we omit the k index in the notation for clarity). With these definitions,\n * Adams-Bashforth methods can be written:\n * \u003cul\u003e\n *   \u003cli\u003ek \u003d 1: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + s\u003csub\u003e1\u003c/sub\u003e(n)\u003c/li\u003e\n *   \u003cli\u003ek \u003d 2: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + 3/2 s\u003csub\u003e1\u003c/sub\u003e(n) + [ -1/2 ] q\u003csub\u003en\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003ek \u003d 3: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + 23/12 s\u003csub\u003e1\u003c/sub\u003e(n) + [ -16/12 5/12 ] q\u003csub\u003en\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003ek \u003d 4: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + 55/24 s\u003csub\u003e1\u003c/sub\u003e(n) + [ -59/24 37/24 -9/24 ] q\u003csub\u003en\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003e...\u003c/li\u003e\n * \u003c/ul\u003e\u003c/p\u003e\n *\n * \u003cp\u003eInstead of using the classical representation with first derivatives only (y\u003csub\u003en\u003c/sub\u003e,\n * s\u003csub\u003e1\u003c/sub\u003e(n) and q\u003csub\u003en\u003c/sub\u003e), our implementation uses the Nordsieck vector with\n * higher degrees scaled derivatives all taken at the same step (y\u003csub\u003en\u003c/sub\u003e, s\u003csub\u003e1\u003c/sub\u003e(n)\n * and r\u003csub\u003en\u003c/sub\u003e) where r\u003csub\u003en\u003c/sub\u003e is defined as:\n * \u003cpre\u003e\n * r\u003csub\u003en\u003c/sub\u003e \u003d [ s\u003csub\u003e2\u003c/sub\u003e(n), s\u003csub\u003e3\u003c/sub\u003e(n) ... s\u003csub\u003ek\u003c/sub\u003e(n) ]\u003csup\u003eT\u003c/sup\u003e\n * \u003c/pre\u003e\n * (here again we omit the k index in the notation for clarity)\n * \u003c/p\u003e\n *\n * \u003cp\u003eTaylor series formulas show that for any index offset i, s\u003csub\u003e1\u003c/sub\u003e(n-i) can be\n * computed from s\u003csub\u003e1\u003c/sub\u003e(n), s\u003csub\u003e2\u003c/sub\u003e(n) ... s\u003csub\u003ek\u003c/sub\u003e(n), the formula being exact\n * for degree k polynomials.\n * \u003cpre\u003e\n * s\u003csub\u003e1\u003c/sub\u003e(n-i) \u003d s\u003csub\u003e1\u003c/sub\u003e(n) + \u0026sum;\u003csub\u003ej\u003c/sub\u003e j (-i)\u003csup\u003ej-1\u003c/sup\u003e s\u003csub\u003ej\u003c/sub\u003e(n)\n * \u003c/pre\u003e\n * The previous formula can be used with several values for i to compute the transform between\n * classical representation and Nordsieck vector. The transform between r\u003csub\u003en\u003c/sub\u003e\n * and q\u003csub\u003en\u003c/sub\u003e resulting from the Taylor series formulas above is:\n * \u003cpre\u003e\n * q\u003csub\u003en\u003c/sub\u003e \u003d s\u003csub\u003e1\u003c/sub\u003e(n) u + P r\u003csub\u003en\u003c/sub\u003e\n * \u003c/pre\u003e\n * where u is the [ 1 1 ... 1 ]\u003csup\u003eT\u003c/sup\u003e vector and P is the (k-1)\u0026times;(k-1) matrix built\n * with the j (-i)\u003csup\u003ej-1\u003c/sup\u003e terms:\n * \u003cpre\u003e\n *        [  -2   3   -4    5  ... ]\n *        [  -4  12  -32   80  ... ]\n *   P \u003d  [  -6  27 -108  405  ... ]\n *        [  -8  48 -256 1280  ... ]\n *        [          ...           ]\n * \u003c/pre\u003e\u003c/p\u003e\n *\n * \u003cp\u003eUsing the Nordsieck vector has several advantages:\n * \u003cul\u003e\n *   \u003cli\u003eit greatly simplifies step interpolation as the interpolator mainly applies\n *   Taylor series formulas,\u003c/li\u003e\n *   \u003cli\u003eit simplifies step changes that occur when discrete events that truncate\n *   the step are triggered,\u003c/li\u003e\n *   \u003cli\u003eit allows to extend the methods in order to support adaptive stepsize.\u003c/li\u003e\n * \u003c/ul\u003e\u003c/p\u003e\n *\n * \u003cp\u003eThe Nordsieck vector at step n+1 is computed from the Nordsieck vector at step n as follows:\n * \u003cul\u003e\n *   \u003cli\u003ey\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + s\u003csub\u003e1\u003c/sub\u003e(n) + u\u003csup\u003eT\u003c/sup\u003e r\u003csub\u003en\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003es\u003csub\u003e1\u003c/sub\u003e(n+1) \u003d h f(t\u003csub\u003en+1\u003c/sub\u003e, y\u003csub\u003en+1\u003c/sub\u003e)\u003c/li\u003e\n *   \u003cli\u003er\u003csub\u003en+1\u003c/sub\u003e \u003d (s\u003csub\u003e1\u003c/sub\u003e(n) - s\u003csub\u003e1\u003c/sub\u003e(n+1)) P\u003csup\u003e-1\u003c/sup\u003e u + P\u003csup\u003e-1\u003c/sup\u003e A P r\u003csub\u003en\u003c/sub\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n * where A is a rows shifting matrix (the lower left part is an identity matrix):\n * \u003cpre\u003e\n *        [ 0 0   ...  0 0 | 0 ]\n *        [ ---------------+---]\n *        [ 1 0   ...  0 0 | 0 ]\n *    A \u003d [ 0 1   ...  0 0 | 0 ]\n *        [       ...      | 0 ]\n *        [ 0 0   ...  1 0 | 0 ]\n *        [ 0 0   ...  0 1 | 0 ]\n * \u003c/pre\u003e\u003c/p\u003e\n *\n * \u003cp\u003eThe P\u003csup\u003e-1\u003c/sup\u003eu vector and the P\u003csup\u003e-1\u003c/sup\u003e A P matrix do not depend on the state,\n * they only depend on k and therefore are precomputed once for all.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator.AdamsBashforthIntegrator(int, double, double, double, double)",
      "begin_line": 154,
      "end_line": 161,
      "comment": "\n     * Build an Adams-Bashforth integrator with the given order and step control parameters.\n     * @param nSteps number of steps of the method excluding the one being computed\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param scalAbsoluteTolerance allowed absolute error\n     * @param scalRelativeTolerance allowed relative error\n     * @exception IllegalArgumentException if order is 1 or less\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 160,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator.AdamsBashforthIntegrator(int, double, double, double[], double[])",
      "begin_line": 174,
      "end_line": 181,
      "comment": "\n     * Build an Adams-Bashforth integrator with the given order and step control parameters.\n     * @param nSteps number of steps of the method excluding the one being computed\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param vecAbsoluteTolerance allowed absolute error\n     * @param vecRelativeTolerance allowed relative error\n     * @exception IllegalArgumentException if order is 1 or less\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 180,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 184,
      "end_line": 351,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 32)",
        "(line 191,col 9)-(line 191,col 46)",
        "(line 192,col 9)-(line 192,col 32)",
        "(line 193,col 9)-(line 193,col 27)",
        "(line 194,col 9)-(line 194,col 39)",
        "(line 197,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 200,col 44)",
        "(line 201,col 9)-(line 201,col 52)",
        "(line 204,col 9)-(line 204,col 87)",
        "(line 205,col 9)-(line 205,col 46)",
        "(line 206,col 9)-(line 206,col 90)",
        "(line 207,col 9)-(line 207,col 52)",
        "(line 210,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 213,col 88)",
        "(line 216,col 9)-(line 216,col 24)",
        "(line 217,col 9)-(line 217,col 74)",
        "(line 218,col 9)-(line 218,col 42)",
        "(line 219,col 9)-(line 219,col 60)",
        "(line 222,col 9)-(line 222,col 31)",
        "(line 223,col 9)-(line 223,col 35)",
        "(line 225,col 9)-(line 225,col 33)",
        "(line 226,col 9)-(line 344,col 9)",
        "(line 346,col 9)-(line 346,col 43)",
        "(line 347,col 9)-(line 347,col 31)",
        "(line 348,col 9)-(line 348,col 31)",
        "(line 349,col 9)-(line 349,col 24)"
      ]
    }
  ]
}