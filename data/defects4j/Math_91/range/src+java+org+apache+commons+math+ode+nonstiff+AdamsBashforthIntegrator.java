{
  "filepath": "/tmp/Math-91b/src/java/org/apache/commons/math/ode/nonstiff/AdamsBashforthIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AdamsBashforthIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.MultistepIntegrator"
      ],
      "begin_line": 58,
      "end_line": 286,
      "comment": "\n * This class implements explicit Adams-Bashforth integrators for Ordinary\n * Differential Equations.\n *\n * \u003cp\u003eAdams-Bashforth (in fact due to Adams alone) methods are explicit\n * multistep ODE solvers witch fixed stepsize. The value of state vector\n * at step n+1 is a simple combination of the value at step n and of the\n * derivatives at steps n, n-1, n-2 ... Depending on the number k of previous\n * steps one wants to use for computing the next value, different formulas\n * are available:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ek \u003d 1: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h f\u003csub\u003en\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003ek \u003d 2: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h (3f\u003csub\u003en\u003c/sub\u003e-f\u003csub\u003en-1\u003c/sub\u003e)/2\u003c/li\u003e\n *   \u003cli\u003ek \u003d 3: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h (23f\u003csub\u003en\u003c/sub\u003e-16f\u003csub\u003en-1\u003c/sub\u003e+5f\u003csub\u003en-2\u003c/sub\u003e)/12\u003c/li\u003e\n *   \u003cli\u003ek \u003d 4: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h (55f\u003csub\u003en\u003c/sub\u003e-59f\u003csub\u003en-1\u003c/sub\u003e+37f\u003csub\u003en-2\u003c/sub\u003e-9f\u003csub\u003en-3)/24\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003e...\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003eA k-steps Adams-Bashforth method is of order k. There is no limit to the\n * value of k.\u003c/p\u003e\n *\n * \u003cp\u003eThese methods are explicit: f\u003csub\u003en+1\u003c/sub\u003e is not used to compute\n * y\u003csub\u003en+1\u003c/sub\u003e. More accurate implicit Adams methods exist: the\n * Adams-Moulton methods (which are also due to Adams alone). They are\n * provided by the {@link AdamsMoultonIntegrator AdamsMoultonIntegrator} class.\u003c/p\u003e\n *\n * @see AdamsMoultonIntegrator\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "METHOD_NAME"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Integrator method name. "
    },
    {
      "type": "field",
      "varNames": [
        "coeffs"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Coefficients for the current method. "
    },
    {
      "type": "field",
      "varNames": [
        "step"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Integration step. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator.AdamsBashforthIntegrator(int, double)",
      "begin_line": 77,
      "end_line": 95,
      "comment": "\n     * Build an Adams-Bashforth integrator with the given order and step size.\n     * @param order order of the method (must be strictly positive)\n     * @param step integration step size\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 72)",
        "(line 82,col 9)-(line 82,col 65)",
        "(line 83,col 9)-(line 83,col 52)",
        "(line 84,col 9)-(line 84,col 35)",
        "(line 85,col 9)-(line 91,col 9)",
        "(line 93,col 9)-(line 93,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 98,
      "end_line": 213,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 46)",
        "(line 103,col 9)-(line 103,col 41)",
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 52)",
        "(line 112,col 9)-(line 113,col 66)",
        "(line 114,col 9)-(line 114,col 71)",
        "(line 117,col 9)-(line 117,col 23)",
        "(line 118,col 9)-(line 118,col 43)",
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 88)",
        "(line 125,col 9)-(line 126,col 80)",
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 33)",
        "(line 131,col 9)-(line 131,col 42)",
        "(line 133,col 9)-(line 133,col 33)",
        "(line 134,col 9)-(line 206,col 9)",
        "(line 208,col 9)-(line 208,col 30)",
        "(line 209,col 9)-(line 209,col 31)",
        "(line 210,col 9)-(line 210,col 31)",
        "(line 211,col 9)-(line 211,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator.getCoeffs()",
      "begin_line": 222,
      "end_line": 224,
      "comment": " Get the coefficients of the method.\n     * \u003cp\u003eThe coefficients are the c\u003csub\u003ei\u003c/sub\u003e terms in the following formula:\u003c/p\u003e\n     * \u003cpre\u003e\n     *   y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h \u0026times; \u0026sum;\u003csub\u003ei\u003d0\u003c/sub\u003e\u003csup\u003ei\u003dk-1\u003c/sup\u003e c\u003csub\u003ei\u003c/sub\u003ef\u003csub\u003en-i\u003c/sub\u003e\u003c/li\u003e\n     * \u003c/pre\u003e\n     * @return a copy of the coefficients of the method\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator.computeBackwardDifferencesArray(int)",
      "begin_line": 239,
      "end_line": 259,
      "comment": " Compute the backward differences coefficients array.\n     * \u003cp\u003eThis is quite similar to the Pascal triangle containing the\n     * binomial coefficiens, except for an additional (-1)\u003csup\u003ei\u003c/sup\u003e sign.\n     * We use a straightforward approach here, since we don\u0027t expect this to\n     * be run too many times with too high k. It is based on the recurrence\n     * relations:\u003c/p\u003e\n     * \u003cpre\u003e\n     *   \u0026nabla;\u003csup\u003e0\u003c/sup\u003e f\u003csub\u003en\u003c/sub\u003e \u003d f\u003csub\u003en\u003c/sub\u003e\n     *   \u0026nabla;\u003csup\u003ei+1\u003c/sup\u003e f\u003csub\u003en\u003c/sub\u003e \u003d \u0026nabla;\u003csup\u003ei\u003c/sup\u003ef\u003csub\u003en\u003c/sub\u003e - \u0026nabla;\u003csup\u003ei\u003c/sup\u003ef\u003csub\u003en-1\u003c/sub\u003e\n     * \u003c/pre\u003e\n     * @param order order of the integration method\n     * @return the coefficients array for backward differences\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 43)",
        "(line 245,col 9)-(line 245,col 37)",
        "(line 248,col 9)-(line 255,col 9)",
        "(line 257,col 9)-(line 257,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator.computeGammaArray(int)",
      "begin_line": 265,
      "end_line": 284,
      "comment": " Compute the gamma coefficients.\n     * @param order order of the integration method\n     * @return gamma coefficients array\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 52)",
        "(line 271,col 9)-(line 271,col 37)",
        "(line 274,col 9)-(line 280,col 9)",
        "(line 282,col 9)-(line 282,col 26)"
      ]
    }
  ]
}