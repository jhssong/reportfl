{
  "filepath": "/tmp/Math-99b/src/java/org/apache/commons/math/ode/nonstiff/AdamsMoultonIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AdamsMoultonIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.MultistepIntegrator"
      ],
      "begin_line": 58,
      "end_line": 295,
      "comment": "\n * This class implements implicit Adams-Moulton integrators for Ordinary\n * Differential Equations.\n *\n * \u003cp\u003eAdams-Moulton (in fact due to Adams alone) methods are implicit\n * multistep ODE solvers witch fixed stepsize. The value of state vector\n * at step n+1 is a simple combination of the value at step n and of the\n * derivatives at steps n+1, n, n-1 ... Depending on the number k of previous\n * steps one wants to use for computing the next value, different formulas\n * are available:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ek \u003d 0: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h f\u003csub\u003en+1\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003ek \u003d 1: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h (f\u003csub\u003en+1\u003c/sub\u003e+f\u003csub\u003en\u003c/sub\u003e)/2\u003c/li\u003e\n *   \u003cli\u003ek \u003d 2: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h (5f\u003csub\u003en+1\u003c/sub\u003e+8f\u003csub\u003en\u003c/sub\u003e-f\u003csub\u003en-1\u003c/sub\u003e)/12\u003c/li\u003e\n *   \u003cli\u003ek \u003d 3: y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h (9f\u003csub\u003en+1\u003c/sub\u003e+19f\u003csub\u003en\u003c/sub\u003e-5f\u003csub\u003en-1\u003c/sub\u003e+f\u003csub\u003en-2)/24\u003c/sub\u003e\u003c/li\u003e\n *   \u003cli\u003e...\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003eA k-steps Adams-Moulton method is of order k+1. There is no limit to the\n * value of k.\u003c/p\u003e\n *\n * \u003cp\u003eThese methods are implicit: f\u003csub\u003en+1\u003c/sub\u003e is used to compute\n * y\u003csub\u003en+1\u003c/sub\u003e. Simpler explicit Adams methods exist: the\n * Adams-Bashforth methods (which are also due to Adams alone). They are\n * provided by the {@link AdamsBashforthIntegrator AdamsBashforthIntegrator} class.\u003c/p\u003e\n *\n * @see AdamsBashforthIntegrator\n * @version $Revision$ $Date$\n * @since 2.0\n "
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
        "predictorCoeffs"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Coefficients for the predictor phase of the method. "
    },
    {
      "type": "field",
      "varNames": [
        "correctorCoeffs"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Coefficients for the corrector phase of the method. "
    },
    {
      "type": "field",
      "varNames": [
        "step"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Integration step. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator.AdamsMoultonIntegrator(int, double)",
      "begin_line": 80,
      "end_line": 111,
      "comment": "\n     * Build an Adams-Moulton integrator with the given order and step size.\n     * @param order order of the method (must be strictly positive)\n     * @param step integration step size\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 74)",
        "(line 85,col 9)-(line 85,col 99)",
        "(line 87,col 9)-(line 87,col 81)",
        "(line 88,col 9)-(line 88,col 44)",
        "(line 89,col 9)-(line 96,col 9)",
        "(line 98,col 9)-(line 98,col 60)",
        "(line 99,col 9)-(line 99,col 48)",
        "(line 100,col 9)-(line 107,col 9)",
        "(line 109,col 9)-(line 109,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 114,
      "end_line": 246,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 46)",
        "(line 119,col 9)-(line 119,col 41)",
        "(line 122,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 125,col 52)",
        "(line 128,col 9)-(line 129,col 64)",
        "(line 130,col 9)-(line 130,col 71)",
        "(line 133,col 9)-(line 133,col 23)",
        "(line 134,col 9)-(line 134,col 43)",
        "(line 135,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 88)",
        "(line 141,col 9)-(line 142,col 84)",
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 33)",
        "(line 147,col 9)-(line 147,col 30)",
        "(line 148,col 9)-(line 148,col 45)",
        "(line 149,col 9)-(line 149,col 42)",
        "(line 151,col 9)-(line 151,col 33)",
        "(line 152,col 9)-(line 239,col 9)",
        "(line 241,col 9)-(line 241,col 30)",
        "(line 242,col 9)-(line 242,col 31)",
        "(line 243,col 9)-(line 243,col 31)",
        "(line 244,col 9)-(line 244,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator.getPredictorCoeffs()",
      "begin_line": 255,
      "end_line": 257,
      "comment": " Get the coefficients of the predictor phase of the method.\n     * \u003cp\u003eThe coefficients are the c\u003csub\u003ei\u003c/sub\u003e terms in the following formula:\u003c/p\u003e\n     * \u003cpre\u003e\n     *   y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h \u0026times; \u0026sum;\u003csub\u003ei\u003d0\u003c/sub\u003e\u003csup\u003ei\u003dk-1\u003c/sup\u003e c\u003csub\u003ei\u003c/sub\u003ef\u003csub\u003en-i\u003c/sub\u003e\u003c/li\u003e\n     * \u003c/pre\u003e\n     * @return a copy of the coefficients of the method\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator.getCorrectorCoeffs()",
      "begin_line": 266,
      "end_line": 268,
      "comment": " Get the coefficients of the corrector phase of the method.\n     * \u003cp\u003eThe coefficients are the c\u003csub\u003ei\u003c/sub\u003e terms in the following formula:\u003c/p\u003e\n     * \u003cpre\u003e\n     *   y\u003csub\u003en+1\u003c/sub\u003e \u003d y\u003csub\u003en\u003c/sub\u003e + h \u0026times; \u0026sum;\u003csub\u003ei\u003d0\u003c/sub\u003e\u003csup\u003ei\u003dk\u003c/sup\u003e c\u003csub\u003ei\u003c/sub\u003ef\u003csub\u003en-i\u003c/sub\u003e\u003c/li\u003e\n     * \u003c/pre\u003e\n     * @return a copy of the coefficients of the method\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator.computeGammaStarArray(int)",
      "begin_line": 274,
      "end_line": 293,
      "comment": " Compute the gamma star coefficients.\n     * @param order order of the integration method\n     * @return gamma star coefficients array\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 60)",
        "(line 280,col 9)-(line 280,col 41)",
        "(line 283,col 9)-(line 289,col 9)",
        "(line 291,col 9)-(line 291,col 30)"
      ]
    }
  ]
}