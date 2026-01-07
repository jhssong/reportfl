{
  "filepath": "/tmp/Math-92b/src/java/org/apache/commons/math/analysis/integration/LegendreGaussIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LegendreGaussIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl"
      ],
      "begin_line": 52,
      "end_line": 238,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "ABSCISSAS_2"
      ],
      "begin_line": 58,
      "end_line": 61,
      "comment": " Abscissas for the 2 points method. "
    },
    {
      "type": "field",
      "varNames": [
        "WEIGHTS_2"
      ],
      "begin_line": 64,
      "end_line": 67,
      "comment": " Weights for the 2 points method. "
    },
    {
      "type": "field",
      "varNames": [
        "ABSCISSAS_3"
      ],
      "begin_line": 70,
      "end_line": 74,
      "comment": " Abscissas for the 3 points method. "
    },
    {
      "type": "field",
      "varNames": [
        "WEIGHTS_3"
      ],
      "begin_line": 77,
      "end_line": 81,
      "comment": " Weights for the 3 points method. "
    },
    {
      "type": "field",
      "varNames": [
        "ABSCISSAS_4"
      ],
      "begin_line": 84,
      "end_line": 89,
      "comment": " Abscissas for the 4 points method. "
    },
    {
      "type": "field",
      "varNames": [
        "WEIGHTS_4"
      ],
      "begin_line": 92,
      "end_line": 97,
      "comment": " Weights for the 4 points method. "
    },
    {
      "type": "field",
      "varNames": [
        "ABSCISSAS_5"
      ],
      "begin_line": 100,
      "end_line": 106,
      "comment": " Abscissas for the 5 points method. "
    },
    {
      "type": "field",
      "varNames": [
        "WEIGHTS_5"
      ],
      "begin_line": 109,
      "end_line": 115,
      "comment": " Weights for the 5 points method. "
    },
    {
      "type": "field",
      "varNames": [
        "abscissas"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " Abscissas for the current method. "
    },
    {
      "type": "field",
      "varNames": [
        "weights"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " Weights for the current method. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.integration.LegendreGaussIntegrator.LegendreGaussIntegrator(int, int)",
      "begin_line": 129,
      "end_line": 156,
      "comment": " Build a Legendre-Gauss integrator.\n     * @param n number of points desired (must be between 2 and 5 inclusive)\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @exception IllegalArgumentException if the number of points is not\n     * in the supported range\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 44)",
        "(line 132,col 9)-(line 154,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.LegendreGaussIntegrator.integrate(double, double)",
      "begin_line": 159,
      "end_line": 163,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.LegendreGaussIntegrator.integrate(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 166,
      "end_line": 204,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 22)",
        "(line 171,col 9)-(line 171,col 33)",
        "(line 172,col 9)-(line 172,col 31)",
        "(line 175,col 9)-(line 175,col 44)",
        "(line 177,col 9)-(line 177,col 18)",
        "(line 178,col 9)-(line 200,col 9)",
        "(line 202,col 9)-(line 202,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.LegendreGaussIntegrator.stage(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 216,
      "end_line": 236,
      "comment": "\n     * Compute the n-th stage integral.\n     * @param f the integrand function\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n number of steps\n     * @return the value of n-th stage integral\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 48)",
        "(line 222,col 9)-(line 222,col 43)",
        "(line 225,col 9)-(line 225,col 41)",
        "(line 226,col 9)-(line 226,col 25)",
        "(line 227,col 9)-(line 232,col 9)",
        "(line 234,col 9)-(line 234,col 30)"
      ]
    }
  ]
}