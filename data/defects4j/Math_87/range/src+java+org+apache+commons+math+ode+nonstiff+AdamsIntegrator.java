{
  "filepath": "/tmp/Math-87b/src/java/org/apache/commons/math/ode/nonstiff/AdamsIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AdamsIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.MultistepIntegrator"
      ],
      "begin_line": 191,
      "end_line": 650,
      "comment": "\n * This class implements explicit Adams-Bashforth and Adams-Moulton integrators for Ordinary\n * Differential Equations.\n *\n * \u003cp\u003eAdams-Bashforth (in fact due to Adams alone) methods are explicit\n * multistep ODE solvers witch fixed stepsize. The value of state vector\n * at step n+1 is a simple combination of the value at step n and of the\n * derivatives at steps n, n-1, n-2 ... Depending on the number k of previous\n * steps one wants to use for computing the next value, different formulas\n * are available:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ek \u003d 1: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h y\u0027\u003csub\u003en\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003ek \u003d 2: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h (3y\u0027\u003csub\u003en\u003c/sub\u003e-y\u0027\u003csub\u003en-1\u003c/sub\u003e)/2\u003c/li\u003e\n *   \u003cli\u003ek \u003d 3: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h (23y\u0027\u003csub\u003en\u003c/sub\u003e-16y\u0027\u003csub\u003en-1\u003c/sub\u003e+5y\u0027\u003csub\u003en-2\u003c/sub\u003e)/12\u003c/li\u003e\n *   \u003cli\u003ek \u003d 4: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h (55y\u0027\u003csub\u003en\u003c/sub\u003e-59y\u0027\u003csub\u003en-1\u003c/sub\u003e+37y\u0027\u003csub\u003en-2\u003c/sub\u003e-9y\u0027\u003csub\u003en-3)/24\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003e...\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003eA k-steps Adams-Bashforth method is of order k. There is no theoretical limit to the\n * value of k, but due to an implementation limitation k must be greater than 1.\u003c/p\u003e\n *\n * \u003cp\u003eAdams-Moulton (also due to Adams alone) methods are implicit\n * multistep ODE solvers witch fixed stepsize. The value of state vector\n * at step n+1 is a simple combination of the value at step n and of the\n * derivatives at steps n+1, n, n-1 ... Depending on the number k of previous\n * steps one wants to use for computing the next value, different formulas\n * are available:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ek \u003d 1: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h y\u0027\u003csub\u003en+1\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003ek \u003d 2: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h (y\u0027\u003csub\u003en+1\u003c/sub\u003e+y\u0027\u003csub\u003en\u003c/sub\u003e)/2\u003c/li\u003e\n *   \u003cli\u003ek \u003d 3: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h (5y\u0027\u003csub\u003en+1\u003c/sub\u003e+8y\u0027\u003csub\u003en\u003c/sub\u003e-y\u0027\u003csub\u003en-1\u003c/sub\u003e)/12\u003c/li\u003e\n *   \u003cli\u003ek \u003d 4: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h (9y\u0027\u003csub\u003en+1\u003c/sub\u003e+19y\u0027\u003csub\u003en\u003c/sub\u003e-5y\u0027\u003csub\u003en-1\u003c/sub\u003e+y\u0027\u003csub\u003en-2)/24\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003e...\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003eA k-steps Adams-Moulton method is of order k+1. There is no theoretical limit to the\n * value of k, but due to an implementation limitation k must be greater than 1.\u003c/p\u003e\n *\n * \u003ch3\u003eImplementation details\u003c/h3\u003e\n *\n * \u003cp\u003eWe define scaled derivatives s\u003csub\u003ei\u003c/sub\u003e(n) at step n as:\n * \u003cpre\u003e\n * s\u003csub\u003e1\u003c/sub\u003e(n) \u003d h y\u0027\u003csub\u003en\u003c/sub\u003e for first derivative\n * s\u003csub\u003e2\u003c/sub\u003e(n) \u003d h\u003csup\u003e2\u003c/sup\u003e/2 y\u0027\u0027\u003csub\u003en\u003c/sub\u003e for second derivative\n * s\u003csub\u003e3\u003c/sub\u003e(n) \u003d h\u003csup\u003e3\u003c/sup\u003e/6 y\u0027\u0027\u0027\u003csub\u003en\u003c/sub\u003e for third derivative\n * ...\n * s\u003csub\u003ek\u003c/sub\u003e(n) \u003d h\u003csup\u003ek\u003c/sup\u003e/k! y(k)\u003csub\u003en\u003c/sub\u003e for k\u003csup\u003eth\u003c/sup\u003e derivative\n * \u003c/pre\u003e\u003c/p\u003e\n *\n * \u003cp\u003eThe definitions above use the classical representation with several previous first\n * derivatives. Lets define\n * \u003cpre\u003e\n *   q\u003csub\u003en\u003c/sub\u003e \u003d [ s\u003csub\u003e1\u003c/sub\u003e(n-1) s\u003csub\u003e1\u003c/sub\u003e(n-2) ... s\u003csub\u003e1\u003c/sub\u003e(n-(k-1)) ]\u003csup\u003eT\u003c/sup\u003e\n * \u003c/pre\u003e\n * (we omit the k index in the notation for clarity). With these definitions,\n * Adams-Bashforth methods can be written:\n * \u003cul\u003e\n *   \u003cli\u003ek \u003d 1: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + s\u003csub\u003e1\u003c/sub\u003e(n)\u003c/li\u003e\n *   \u003cli\u003ek \u003d 2: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + 3/2 s\u003csub\u003e1\u003c/sub\u003e(n) + [ -1/2 ] q\u003csub\u003en\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003ek \u003d 3: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + 23/12 s\u003csub\u003e1\u003c/sub\u003e(n) + [ -16/12 5/12 ] q\u003csub\u003en\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003ek \u003d 4: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + 55/24 s\u003csub\u003e1\u003c/sub\u003e(n) + [ -59/24 37/24 -9/24 ] q\u003csub\u003en\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003e...\u003c/li\u003e\n * \u003c/ul\u003eand Adams-Moulton methods can be written:\n * \u003cul\u003e\n *   \u003cli\u003ek \u003d 1: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + s\u003csub\u003e1\u003c/sub\u003e(n+1)\u003c/li\u003e\n *   \u003cli\u003ek \u003d 2: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + 1/2 s\u003csub\u003e1\u003c/sub\u003e(n+1) + [ 1/2 ] q\u003csub\u003en+1\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003ek \u003d 3: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + 5/12 s\u003csub\u003e1\u003c/sub\u003e(n+1) + [ 8/12 -1/12 ] q\u003csub\u003en+1\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003ek \u003d 4: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + 9/24 s\u003csub\u003e1\u003c/sub\u003e(n+1) + [ 19/24 -5/24 1/24 ] q\u003csub\u003en+1\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003e...\u003c/li\u003e\n * \u003c/ul\u003e\u003c/p\u003e\n *\n * \u003cp\u003eTaylor series formulas show that for any index offset i, s\u003csub\u003e1\u003c/sub\u003e(n-i) can be\n * computed from s\u003csub\u003e1\u003c/sub\u003e(n), s\u003csub\u003e2\u003c/sub\u003e(n) ... s\u003csub\u003ek\u003c/sub\u003e(n), the formula being exact\n * for degree k polynomials.\n * \u003cpre\u003e\n * s\u003csub\u003e1\u003c/sub\u003e(n-i) \u003d s\u003csub\u003e1\u003c/sub\u003e(n) + \u0026sum;\u003csub\u003ej\u003c/sub\u003e j (-i)\u003csup\u003ej-1\u003c/sup\u003e s\u003csub\u003ej\u003c/sub\u003e(n)\n * \u003c/pre\u003e\n * The previous formula can be used with several values for i to compute the transform between\n * classical representation (q\u003csub\u003en\u003c/sub\u003e for Adams-Bashforth or q\u003csub\u003en+1\u003c/sub\u003e for Adams-Moulton)\n * and Nordsieck vector\n * \u003cpre\u003e\n * r\u003csub\u003en\u003c/sub\u003e \u003d [ s\u003csub\u003e2\u003c/sub\u003e(n), s\u003csub\u003e3\u003c/sub\u003e(n) ... s\u003csub\u003ek\u003c/sub\u003e(n) ]\u003csupT\u003c/sup\u003e\n * \u003c/pre\u003e\n * (here again we omit the k index in the notation for clarity). The transform between r\u003csub\u003en\u003c/sub\u003e\n * and q\u003csub\u003en\u003c/sub\u003e resulting from the Taylor series formulas above is:\n * \u003cpre\u003e\n * q\u003csub\u003en\u003c/sub\u003e \u003d s\u003csub\u003e1\u003c/sub\u003e(n) u + P r\u003csub\u003en\u003c/sub\u003e\n * \u003c/pre\u003e\n * where u is the [ 1 1 ... 1 ]\u003csup\u003eT\u003c/sup\u003e vector and P is the (k-1)\u0026times;(k-1) matrix built\n * with the j (-i)\u003csup\u003ej-1\u003c/sup\u003e terms:\n * \u003cpre\u003e\n *        [  -2   3   -4    5  ... ]\n *        [  -4  12  -32   80  ... ]\n *   P \u003d  [  -6  27 -108  405  ... ]\n *        [  -8  48 -256 1280  ... ]\n *        [          ...           ]\n * \u003c/pre\u003e\u003c/p\u003e\n * \n * \u003cp\u003eThis class implements the Adams-Bashforth and Adams-Moulton method using the Nordsieck vector\n * (i.e. y\u003csub\u003en\u003c/sub\u003e, s\u003csub\u003e1\u003c/sub\u003e(n) and r\u003csub\u003en\u003c/sub\u003e) rather than the classical representation.\n * Using the Nordsieck vector has several advantages:\n * \u003cul\u003e\n *   \u003cli\u003eit leverages Adams-Bashforth and Adams-Moulton methods as in this representation\n *   they share most of their coefficients and most of their implementation,\u003c/li\u003e\n *   \u003cli\u003eit greatly simplifies step interpolation as the interpolator mainly applies\n *   Taylor series formulas,\u003c/li\u003e\n *   \u003cli\u003eit simplifies step changes that occur when discrete events that truncate\n *   the step are triggered,\u003c/li\u003e\n *   \u003cli\u003eit allows to extend the methods in order to support adaptive stepsize (not implemented yet).\u003c/li\u003e\n * \u003c/ul\u003e\u003c/p\u003e\n * \n * \u003cp\u003eThe Nordsieck vector at step n+1 is computed from the Nordsieck vector at step n as follows:\n * \u003cul\u003e\n *   \u003cli\u003ey\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + s\u003csub\u003e1\u003c/sub\u003e(n) + u\u003csup\u003eT\u003c/sup\u003e r\u003csub\u003en\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003es\u003csub\u003e1\u003c/sub\u003e(n+1) \u003d h f(t\u003csub\u003en+1\u003c/sub\u003e, y\u003csub\u003en+1\u003c/sub\u003e)\u003c/li\u003e\n *   \u003cli\u003er\u003csub\u003en+1\u003c/sub\u003e \u003d (s\u003csub\u003e1\u003c/sub\u003e(n) - s\u003csub\u003e1\u003c/sub\u003e(n+1)) P\u003csup\u003e-1\u003c/sup\u003e u + P\u003csup\u003e-1\u003c/sup\u003e A P r\u003csub\u003en\u003c/sub\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n * where A is a rows shifting matrix (the lower left part is an identity matrix):\n * \u003cpre\u003e\n *        [ 0 0   ...  0 0 | 0 ]\n *        [ ---------------+---]\n *        [ 1 0   ...  0 0 | 0 ]\n *    A \u003d [ 0 1   ...  0 0 | 0 ]\n *        [       ...      | 0 ]\n *        [ 0 0   ...  1 0 | 0 ]\n *        [ 0 0   ...  0 1 | 0 ]\n * \u003c/pre\u003e\n * If the method is an Adams-Moulton method, the following additional correction is performed:\n * \u003cul\u003e\n *   \u003cli\u003eY\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + s\u003csub\u003e1\u003c/sub\u003e(n+1) + [ -1 +1 -1 +1 ... \u0026plusmn;1 ] r\u003csub\u003en+1\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003eS\u003csub\u003e1\u003c/sub\u003e(n+1) \u003d h f(t\u003csub\u003en+1\u003c/sub\u003e, Y\u003csub\u003en+1\u003c/sub\u003e)\u003c/li\u003e\n *   \u003cli\u003eR\u003csub\u003en+1\u003c/sub\u003e \u003d r\u003csub\u003en+1\u003c/sub\u003e + (s\u003csub\u003e1\u003c/sub\u003e(n) - S\u003csub\u003e1\u003c/sub\u003e(n+1)) P\u003csup\u003e-1\u003c/sup\u003e u\u003c/li\u003e\n * \u003c/ul\u003e\n * where the upper case Y\u003csub\u003en+1\u003c/sub\u003e, S\u003csub\u003en+1\u003c/sub\u003e and R\u003csub\u003en+1\u003c/sub\u003e represent the\n * corrected states whereas the lower case y\u003csub\u003en+1\u003c/sub\u003e, s\u003csub\u003en+1\u003c/sub\u003e and r\u003csub\u003en+1\u003c/sub\u003e\n * represent the predicted states.\u003c/p\u003e\n *\n * \u003cp\u003eThe P\u003csup\u003e-1\u003c/sup\u003eu vector and the P\u003csup\u003e-1\u003c/sup\u003e A P matrix do not depend on the state,\n * they are precomputed once for all.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "cache"
      ],
      "begin_line": 197,
      "end_line": 198,
      "comment": " Cache for already computed coefficients. "
    },
    {
      "type": "field",
      "varNames": [
        "NO_CORRECTION_METHOD_NAME"
      ],
      "begin_line": 201,
      "end_line": 201,
      "comment": " No correction integrator method name. "
    },
    {
      "type": "field",
      "varNames": [
        "CORRECTION_METHOD_NAME"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": " Correction integrator method name. "
    },
    {
      "type": "field",
      "varNames": [
        "withCorrection"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": " Correction indicator (to choose between Adams-Bashforth and Adams-Moulton). "
    },
    {
      "type": "field",
      "varNames": [
        "coefficients"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": " Coefficients of the method. "
    },
    {
      "type": "field",
      "varNames": [
        "step"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": " Integration step. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsIntegrator.AdamsIntegrator(int, boolean, double)",
      "begin_line": 224,
      "end_line": 249,
      "comment": "\n     * Build an Adams-Bashforth or Adams-Moulton integrator with the given order and step size.\n     * @param order order of the method (must be greater than 1: due to\n     * an implementation limitation the order 1 method is not supported)\n     * @param withCorrection if true apply Adams-Moulton correction at end of\n     * step, otherwise use only Adams-Bashforth prediction\n     * @param step integration step size\n     * @exception IllegalArgumentException if order is 1 or less\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 229,col 54)",
        "(line 230,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 45)",
        "(line 238,col 9)-(line 245,col 9)",
        "(line 247,col 9)-(line 247,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 252,
      "end_line": 394,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 32)",
        "(line 258,col 9)-(line 258,col 46)",
        "(line 259,col 9)-(line 259,col 41)",
        "(line 262,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 265,col 52)",
        "(line 268,col 9)-(line 269,col 61)",
        "(line 270,col 9)-(line 270,col 49)",
        "(line 273,col 9)-(line 273,col 23)",
        "(line 274,col 9)-(line 274,col 43)",
        "(line 275,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 278,col 88)",
        "(line 281,col 9)-(line 282,col 80)",
        "(line 283,col 9)-(line 285,col 9)",
        "(line 286,col 9)-(line 286,col 33)",
        "(line 287,col 9)-(line 287,col 43)",
        "(line 290,col 9)-(line 290,col 55)",
        "(line 291,col 9)-(line 291,col 62)",
        "(line 292,col 9)-(line 292,col 63)",
        "(line 293,col 9)-(line 293,col 42)",
        "(line 295,col 9)-(line 295,col 33)",
        "(line 296,col 9)-(line 387,col 9)",
        "(line 389,col 9)-(line 389,col 30)",
        "(line 390,col 9)-(line 390,col 31)",
        "(line 391,col 9)-(line 391,col 31)",
        "(line 392,col 9)-(line 392,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsIntegrator.convertToNordsieckLow()",
      "begin_line": 399,
      "end_line": 408,
      "comment": " Convert the multistep representation after a restart to Nordsieck representation.\n     * @return first scaled derivative\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 41)",
        "(line 402,col 9)-(line 402,col 54)",
        "(line 403,col 9)-(line 405,col 9)",
        "(line 406,col 9)-(line 406,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsIntegrator.convertToNordsieckHigh(double[])",
      "begin_line": 414,
      "end_line": 428,
      "comment": " Convert the multistep representation after a restart to Nordsieck representation.\n     * @param scaled first scaled derivative\n     * @return Nordsieck matrix of the higher scaled derivatives\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 41)",
        "(line 417,col 9)-(line 417,col 100)",
        "(line 418,col 9)-(line 424,col 9)",
        "(line 426,col 9)-(line 426,col 81)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Corrector",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.RealMatrixPreservingVisitor"
      ],
      "begin_line": 438,
      "end_line": 483,
      "comment": " Corrector for current state in Adams-Moulton method.\n     * \u003cp\u003e\n     * This visitor implements the Taylor series formula:\n     * \u003cpre\u003e\n     * Y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + s\u003csub\u003e1\u003c/sub\u003e(n+1) + [ -1 +1 -1 +1 ... \u0026plusmn;1 ] r\u003csub\u003en+1\u003c/sub\u003e\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "previous"
      ],
      "begin_line": 441,
      "end_line": 441,
      "comment": " Previous state. "
    },
    {
      "type": "field",
      "varNames": [
        "scaled"
      ],
      "begin_line": 444,
      "end_line": 444,
      "comment": " Current scaled first derivative. "
    },
    {
      "type": "field",
      "varNames": [
        "corrected"
      ],
      "begin_line": 447,
      "end_line": 447,
      "comment": " Placeholder where to put the recomputed current state. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsIntegrator.Corrector.Corrector(double[], double[], double[])",
      "begin_line": 454,
      "end_line": 458,
      "comment": " Simple constructor.\n         * @param previous previous state\n         * @param scaled current scaled first derivative\n         * @param corrected placeholder where to put the corrected current state\n         ",
      "child_ranges": [
        "(line 455,col 13)-(line 455,col 37)",
        "(line 456,col 13)-(line 456,col 36)",
        "(line 457,col 13)-(line 457,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsIntegrator.Corrector.start(int, int, int, int, int, int)",
      "begin_line": 461,
      "end_line": 464,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 463,col 13)-(line 463,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsIntegrator.Corrector.visit(int, int, double)",
      "begin_line": 467,
      "end_line": 474,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 469,col 13)-(line 473,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsIntegrator.Corrector.end()",
      "begin_line": 477,
      "end_line": 482,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 478,col 13)-(line 480,col 13)",
        "(line 481,col 13)-(line 481,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NordsieckUpdater",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor"
      ],
      "begin_line": 486,
      "end_line": 516,
      "comment": " Updater for Nordsieck vector. "
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 489,
      "end_line": 489,
      "comment": " Scaled first derivative at step start. "
    },
    {
      "type": "field",
      "varNames": [
        "end"
      ],
      "begin_line": 492,
      "end_line": 492,
      "comment": " Scaled first derivative at step end. "
    },
    {
      "type": "field",
      "varNames": [
        "c1"
      ],
      "begin_line": 495,
      "end_line": 495,
      "comment": " Update coefficients. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsIntegrator.NordsieckUpdater.NordsieckUpdater(double[], double[], double[])",
      "begin_line": 502,
      "end_line": 507,
      "comment": " Simple constructor.\n         * @param start scaled first derivative at step start\n         * @param end scaled first derivative at step end\n         * @param c1 update coefficients\n         ",
      "child_ranges": [
        "(line 504,col 13)-(line 504,col 31)",
        "(line 505,col 13)-(line 505,col 29)",
        "(line 506,col 13)-(line 506,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsIntegrator.NordsieckUpdater.visit(int, int, double)",
      "begin_line": 510,
      "end_line": 514,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 513,col 13)-(line 513,col 67)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CachedCoefficients",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 519,
      "end_line": 600,
      "comment": " Cache for already computed coefficients. "
    },
    {
      "type": "field",
      "varNames": [
        "msToN"
      ],
      "begin_line": 522,
      "end_line": 522,
      "comment": " Transformer between multistep and Nordsieck representations. "
    },
    {
      "type": "field",
      "varNames": [
        "msUpdate"
      ],
      "begin_line": 525,
      "end_line": 525,
      "comment": " Update coefficients of the higher order derivatives wrt y\u0027\u0027, y\u0027\u0027\u0027 ... "
    },
    {
      "type": "field",
      "varNames": [
        "c1"
      ],
      "begin_line": 528,
      "end_line": 528,
      "comment": " Update coefficients of the higher order derivatives wrt y\u0027. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsIntegrator.CachedCoefficients.CachedCoefficients(int)",
      "begin_line": 534,
      "end_line": 565,
      "comment": " Simple constructor.\n         * @param order order of the method (must be greater than 1: due to\n         * an implementation limitation the order 1 method is not supported)\n         ",
      "child_ranges": [
        "(line 537,col 13)-(line 537,col 62)",
        "(line 538,col 13)-(line 539,col 93)",
        "(line 540,col 13)-(line 540,col 57)",
        "(line 541,col 13)-(line 541,col 44)",
        "(line 542,col 13)-(line 542,col 54)",
        "(line 547,col 13)-(line 547,col 58)",
        "(line 548,col 13)-(line 551,col 13)",
        "(line 552,col 13)-(line 552,col 53)",
        "(line 553,col 13)-(line 553,col 55)",
        "(line 554,col 13)-(line 555,col 85)",
        "(line 558,col 13)-(line 558,col 75)",
        "(line 559,col 13)-(line 559,col 78)",
        "(line 560,col 13)-(line 560,col 45)",
        "(line 561,col 13)-(line 563,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsIntegrator.CachedCoefficients.buildP(int)",
      "begin_line": 581,
      "end_line": 598,
      "comment": " Build the P matrix transforming multistep to Nordsieck.\n         * \u003cp\u003e\n         * \u003cp\u003e\n         * Multistep representation uses y(k), s\u003csub\u003e1\u003c/sub\u003e(k), s\u003csub\u003e1\u003c/sub\u003e(k-1) ... s\u003csub\u003e1\u003c/sub\u003e(k-(n-1)).\n         * Nordsieck representation uses y(k), s\u003csub\u003e1\u003c/sub\u003e(k), s\u003csub\u003e2\u003c/sub\u003e(k) ... s\u003csub\u003en\u003c/sub\u003e(k).\n         * The two representations share their two first components y(k) and\n         * s\u003csub\u003e1\u003c/sub\u003e(k). The P matrix is used to transform the remaining ones:\n         * \u003cpre\u003e\n         * [ s\u003csub\u003e1\u003c/sub\u003e(k-1) ... s\u003csub\u003e1\u003c/sub\u003e(k-(n-1)]\u003csup\u003eT\u003c/sup\u003e \u003d s\u003csub\u003e1\u003c/sub\u003e(k) [1 ... 1]\u003csup\u003eT\u003c/sup\u003e + P [s\u003csub\u003e2\u003c/sub\u003e(k) ... s\u003csub\u003en\u003c/sub\u003e(k)]\u003csup\u003eT\u003c/sup\u003e\n         * \u003c/pre\u003e\n         * \u003c/p\u003e\n         * @param order order of the method (must be strictly positive)\n         * @return P matrix\n         ",
      "child_ranges": [
        "(line 583,col 13)-(line 583,col 80)",
        "(line 585,col 13)-(line 594,col 13)",
        "(line 596,col 13)-(line 596,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsIntegrator.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 606,
      "end_line": 610,
      "comment": " Serialize the instance.\n     * @param oos stream where object should be written\n     * @throws IOException if object cannot be written to stream\n     ",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 33)",
        "(line 609,col 9)-(line 609,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsIntegrator.readObject(java.io.ObjectInputStream)",
      "begin_line": 617,
      "end_line": 648,
      "comment": " Deserialize the instance.\n     * @param ois stream from which the object should be read\n     * @throws ClassNotFoundException if a class in the stream cannot be found\n     * @throws IOException if object cannot be read from the stream\n     ",
      "child_ranges": [
        "(line 619,col 9)-(line 646,col 9)"
      ]
    }
  ]
}