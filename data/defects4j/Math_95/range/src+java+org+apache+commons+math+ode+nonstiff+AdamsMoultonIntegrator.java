{
  "filepath": "/tmp/Math-95b/src/java/org/apache/commons/math/ode/nonstiff/AdamsMoultonIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AdamsMoultonIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.MultistepIntegrator"
      ],
      "begin_line": 59,
      "end_line": 296,
      "comment": "\n * This class implements implicit Adams-Moulton integrators for Ordinary\n * Differential Equations.\n *\n * \u003cp\u003eAdams-Moulton (in fact due to Adams alone) methods are implicit\n * multistep ODE solvers witch fixed stepsize. The value of state vector\n * at step n+1 is a simple combination of the value at step n and of the\n * derivatives at steps n+1, n, n-1 ... Depending on the number k of previous\n * steps one wants to use for computing the next value, different formulas\n * are available:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ek \u003d 0: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h f\u003csub\u003en+1\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003ek \u003d 1: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h (f\u003csub\u003en+1\u003c/sub\u003e+f\u003csub\u003en\u003c/sub\u003e)/2\u003c/li\u003e\n *   \u003cli\u003ek \u003d 2: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h (5f\u003csub\u003en+1\u003c/sub\u003e+8f\u003csub\u003en\u003c/sub\u003e-f\u003csub\u003en-1\u003c/sub\u003e)/12\u003c/li\u003e\n *   \u003cli\u003ek \u003d 3: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h (9f\u003csub\u003en+1\u003c/sub\u003e+19f\u003csub\u003en\u003c/sub\u003e-5f\u003csub\u003en-1\u003c/sub\u003e+f\u003csub\u003en-2)/24\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003e...\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003eA k-steps Adams-Moulton method is of order k+1. There is no limit to the\n * value of k.\u003c/p\u003e\n *\n * \u003cp\u003eThese methods are implicit: f\u003csub\u003en+1\u003c/sub\u003e is used to compute\n * y\u003csub\u003en+1\u003c/sub\u003e. Simpler explicit Adams methods exist: the\n * Adams-Bashforth methods (which are also due to Adams alone). They are\n * provided by the {@link AdamsBashforthIntegrator AdamsBashforthIntegrator} class.\u003c/p\u003e\n *\n * @see AdamsBashforthIntegrator\n * @see BDFIntegrator\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "METHOD_NAME"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Integrator method name. "
    },
    {
      "type": "field",
      "varNames": [
        "predictorCoeffs"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Coefficients for the predictor phase of the method. "
    },
    {
      "type": "field",
      "varNames": [
        "correctorCoeffs"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Coefficients for the corrector phase of the method. "
    },
    {
      "type": "field",
      "varNames": [
        "step"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Integration step. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator.AdamsMoultonIntegrator(int, double)",
      "begin_line": 81,
      "end_line": 112,
      "comment": "\n     * Build an Adams-Moulton integrator with the given order and step size.\n     * @param order order of the method (must be strictly positive)\n     * @param step integration step size\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 74)",
        "(line 86,col 9)-(line 86,col 99)",
        "(line 88,col 9)-(line 88,col 81)",
        "(line 89,col 9)-(line 89,col 44)",
        "(line 90,col 9)-(line 97,col 9)",
        "(line 99,col 9)-(line 99,col 60)",
        "(line 100,col 9)-(line 100,col 48)",
        "(line 101,col 9)-(line 108,col 9)",
        "(line 110,col 9)-(line 110,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 115,
      "end_line": 247,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 46)",
        "(line 120,col 9)-(line 120,col 41)",
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 52)",
        "(line 129,col 9)-(line 130,col 64)",
        "(line 131,col 9)-(line 131,col 71)",
        "(line 134,col 9)-(line 134,col 23)",
        "(line 135,col 9)-(line 135,col 43)",
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 88)",
        "(line 142,col 9)-(line 143,col 84)",
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 33)",
        "(line 148,col 9)-(line 148,col 30)",
        "(line 149,col 9)-(line 149,col 45)",
        "(line 150,col 9)-(line 150,col 42)",
        "(line 152,col 9)-(line 152,col 33)",
        "(line 153,col 9)-(line 240,col 9)",
        "(line 242,col 9)-(line 242,col 30)",
        "(line 243,col 9)-(line 243,col 31)",
        "(line 244,col 9)-(line 244,col 31)",
        "(line 245,col 9)-(line 245,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator.getPredictorCoeffs()",
      "begin_line": 256,
      "end_line": 258,
      "comment": " Get the coefficients of the predictor phase of the method.\n     * \u003cp\u003eThe coefficients are the c\u003csub\u003ei\u003c/sub\u003e terms in the following formula:\u003c/p\u003e\n     * \u003cpre\u003e\n     *   y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h \u0026times; \u0026sum;\u003csub\u003ei\u003d0\u003c/sub\u003e\u003csup\u003ei\u003dk-1\u003c/sup\u003e c\u003csub\u003ei\u003c/sub\u003ef\u003csub\u003en-i\u003c/sub\u003e\u003c/li\u003e\n     * \u003c/pre\u003e\n     * @return a copy of the coefficients of the method\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator.getCorrectorCoeffs()",
      "begin_line": 267,
      "end_line": 269,
      "comment": " Get the coefficients of the corrector phase of the method.\n     * \u003cp\u003eThe coefficients are the c\u003csub\u003ei\u003c/sub\u003e terms in the following formula:\u003c/p\u003e\n     * \u003cpre\u003e\n     *   y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h \u0026times; \u0026sum;\u003csub\u003ei\u003d0\u003c/sub\u003e\u003csup\u003ei\u003dk\u003c/sup\u003e c\u003csub\u003ei\u003c/sub\u003ef\u003csub\u003en-i\u003c/sub\u003e\u003c/li\u003e\n     * \u003c/pre\u003e\n     * @return a copy of the coefficients of the method\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator.computeGammaStarArray(int)",
      "begin_line": 275,
      "end_line": 294,
      "comment": " Compute the gamma star coefficients.\n     * @param order order of the integration method\n     * @return gamma star coefficients array\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 60)",
        "(line 281,col 9)-(line 281,col 41)",
        "(line 284,col 9)-(line 290,col 9)",
        "(line 292,col 9)-(line 292,col 30)"
      ]
    }
  ]
}