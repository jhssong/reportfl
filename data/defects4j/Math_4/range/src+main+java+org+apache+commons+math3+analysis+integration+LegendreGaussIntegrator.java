{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/integration/LegendreGaussIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LegendreGaussIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator"
      ],
      "begin_line": 55,
      "end_line": 266,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/Legendre-GaussQuadrature.html\"\u003e\n * Legendre-Gauss\u003c/a\u003e quadrature formula.\n * \u003cp\u003e\n * Legendre-Gauss integrators are efficient integrators that can\n * accurately integrate functions with few function evaluations. A\n * Legendre-Gauss integrator using an n-points quadrature formula can\n * integrate 2n-1 degree polynomials exactly.\n * \u003c/p\u003e\n * \u003cp\u003e\n * These integrators evaluate the function on n carefully chosen\n * abscissas in each step interval (mapped to the canonical [-1,1] interval).\n * The evaluation abscissas are not evenly spaced and none of them are\n * at the interval endpoints. This implies the function integrated can be\n * undefined at integration interval endpoints.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The evaluation abscissas x\u003csub\u003ei\u003c/sub\u003e are the roots of the degree n\n * Legendre polynomial. The weights a\u003csub\u003ei\u003c/sub\u003e of the quadrature formula\n * integrals from -1 to +1 \u0026int; Li\u003csup\u003e2\u003c/sup\u003e where Li (x) \u003d\n * \u0026prod; (x-x\u003csub\u003ek\u003c/sub\u003e)/(x\u003csub\u003ei\u003c/sub\u003e-x\u003csub\u003ek\u003c/sub\u003e) for k !\u003d i.\n * \u003c/p\u003e\n * \u003cp\u003e\n * @version $Id$\n * @since 1.2\n * @deprecated As of 3.1 (to be removed in 4.0). Please use\n * {@link IterativeLegendreGaussIntegrator} instead.\n "
    },
    {
      "type": "field",
      "varNames": [
        "ABSCISSAS_2"
      ],
      "begin_line": 59,
      "end_line": 62,
      "comment": " Abscissas for the 2 points method. "
    },
    {
      "type": "field",
      "varNames": [
        "WEIGHTS_2"
      ],
      "begin_line": 65,
      "end_line": 68,
      "comment": " Weights for the 2 points method. "
    },
    {
      "type": "field",
      "varNames": [
        "ABSCISSAS_3"
      ],
      "begin_line": 71,
      "end_line": 75,
      "comment": " Abscissas for the 3 points method. "
    },
    {
      "type": "field",
      "varNames": [
        "WEIGHTS_3"
      ],
      "begin_line": 78,
      "end_line": 82,
      "comment": " Weights for the 3 points method. "
    },
    {
      "type": "field",
      "varNames": [
        "ABSCISSAS_4"
      ],
      "begin_line": 85,
      "end_line": 90,
      "comment": " Abscissas for the 4 points method. "
    },
    {
      "type": "field",
      "varNames": [
        "WEIGHTS_4"
      ],
      "begin_line": 93,
      "end_line": 98,
      "comment": " Weights for the 4 points method. "
    },
    {
      "type": "field",
      "varNames": [
        "ABSCISSAS_5"
      ],
      "begin_line": 101,
      "end_line": 107,
      "comment": " Abscissas for the 5 points method. "
    },
    {
      "type": "field",
      "varNames": [
        "WEIGHTS_5"
      ],
      "begin_line": 110,
      "end_line": 116,
      "comment": " Weights for the 5 points method. "
    },
    {
      "type": "field",
      "varNames": [
        "abscissas"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " Abscissas for the current method. "
    },
    {
      "type": "field",
      "varNames": [
        "weights"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " Weights for the current method. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.LegendreGaussIntegrator.LegendreGaussIntegrator(int, double, double, int, int)",
      "begin_line": 137,
      "end_line": 167,
      "comment": "\n     * Build a Legendre-Gauss integrator with given accuracies and iterations counts.\n     * @param n number of points desired (must be between 2 and 5 inclusive)\n     * @param relativeAccuracy relative accuracy of the result\n     * @param absoluteAccuracy absolute accuracy of the result\n     * @param minimalIterationCount minimum number of iterations\n     * @param maximalIterationCount maximum number of iterations\n     * @exception MathIllegalArgumentException if number of points is out of [2; 5]\n     * @exception NotStrictlyPositiveException if minimal number of iterations\n     * is not strictly positive\n     * @exception NumberIsTooSmallException if maximal number of iterations\n     * is lesser than or equal to the minimal number of iterations\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 96)",
        "(line 144,col 9)-(line 165,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.LegendreGaussIntegrator.LegendreGaussIntegrator(int, double, double)",
      "begin_line": 176,
      "end_line": 182,
      "comment": "\n     * Build a Legendre-Gauss integrator with given accuracies.\n     * @param n number of points desired (must be between 2 and 5 inclusive)\n     * @param relativeAccuracy relative accuracy of the result\n     * @param absoluteAccuracy absolute accuracy of the result\n     * @exception MathIllegalArgumentException if number of points is out of [2; 5]\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 181,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.LegendreGaussIntegrator.LegendreGaussIntegrator(int, int, int)",
      "begin_line": 195,
      "end_line": 201,
      "comment": "\n     * Build a Legendre-Gauss integrator with given iteration counts.\n     * @param n number of points desired (must be between 2 and 5 inclusive)\n     * @param minimalIterationCount minimum number of iterations\n     * @param maximalIterationCount maximum number of iterations\n     * @exception MathIllegalArgumentException if number of points is out of [2; 5]\n     * @exception NotStrictlyPositiveException if minimal number of iterations\n     * is not strictly positive\n     * @exception NumberIsTooSmallException if maximal number of iterations\n     * is lesser than or equal to the minimal number of iterations\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 200,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.LegendreGaussIntegrator.doIntegrate()",
      "begin_line": 204,
      "end_line": 236,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 31)",
        "(line 211,col 9)-(line 211,col 18)",
        "(line 212,col 9)-(line 234,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.LegendreGaussIntegrator.stage(int)",
      "begin_line": 245,
      "end_line": 264,
      "comment": "\n     * Compute the n-th stage integral.\n     * @param n number of steps\n     * @return the value of n-th stage integral\n     * @throws TooManyEvaluationsException if the maximum number of evaluations\n     * is exceeded.\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 58)",
        "(line 250,col 9)-(line 250,col 43)",
        "(line 253,col 9)-(line 253,col 46)",
        "(line 254,col 9)-(line 254,col 25)",
        "(line 255,col 9)-(line 260,col 9)",
        "(line 262,col 9)-(line 262,col 30)"
      ]
    }
  ]
}