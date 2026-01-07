{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/analysis/integration/LegendreGaussIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LegendreGaussIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl"
      ],
      "begin_line": 54,
      "end_line": 235,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ABSCISSAS_2"
      ],
      "begin_line": 57,
      "end_line": 60,
      "comment": " Abscissas for the 2 points method. "
    },
    {
      "type": "field",
      "varNames": [
        "WEIGHTS_2"
      ],
      "begin_line": 63,
      "end_line": 66,
      "comment": " Weights for the 2 points method. "
    },
    {
      "type": "field",
      "varNames": [
        "ABSCISSAS_3"
      ],
      "begin_line": 69,
      "end_line": 73,
      "comment": " Abscissas for the 3 points method. "
    },
    {
      "type": "field",
      "varNames": [
        "WEIGHTS_3"
      ],
      "begin_line": 76,
      "end_line": 80,
      "comment": " Weights for the 3 points method. "
    },
    {
      "type": "field",
      "varNames": [
        "ABSCISSAS_4"
      ],
      "begin_line": 83,
      "end_line": 88,
      "comment": " Abscissas for the 4 points method. "
    },
    {
      "type": "field",
      "varNames": [
        "WEIGHTS_4"
      ],
      "begin_line": 91,
      "end_line": 96,
      "comment": " Weights for the 4 points method. "
    },
    {
      "type": "field",
      "varNames": [
        "ABSCISSAS_5"
      ],
      "begin_line": 99,
      "end_line": 105,
      "comment": " Abscissas for the 5 points method. "
    },
    {
      "type": "field",
      "varNames": [
        "WEIGHTS_5"
      ],
      "begin_line": 108,
      "end_line": 114,
      "comment": " Weights for the 5 points method. "
    },
    {
      "type": "field",
      "varNames": [
        "abscissas"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " Abscissas for the current method. "
    },
    {
      "type": "field",
      "varNames": [
        "weights"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " Weights for the current method. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.integration.LegendreGaussIntegrator.LegendreGaussIntegrator(int, int)",
      "begin_line": 128,
      "end_line": 154,
      "comment": " Build a Legendre-Gauss integrator.\n     * @param n number of points desired (must be between 2 and 5 inclusive)\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @exception IllegalArgumentException if the number of points is not\n     * in the supported range\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 44)",
        "(line 131,col 9)-(line 152,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.LegendreGaussIntegrator.integrate(double, double)",
      "begin_line": 157,
      "end_line": 161,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.LegendreGaussIntegrator.integrate(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 164,
      "end_line": 201,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 22)",
        "(line 168,col 9)-(line 168,col 33)",
        "(line 169,col 9)-(line 169,col 31)",
        "(line 172,col 9)-(line 172,col 44)",
        "(line 174,col 9)-(line 174,col 18)",
        "(line 175,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 199,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.LegendreGaussIntegrator.stage(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 213,
      "end_line": 233,
      "comment": "\n     * Compute the n-th stage integral.\n     * @param f the integrand function\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n number of steps\n     * @return the value of n-th stage integral\n     * @throws MathUserException if an error occurs evaluating the\n     * function\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 48)",
        "(line 219,col 9)-(line 219,col 43)",
        "(line 222,col 9)-(line 222,col 41)",
        "(line 223,col 9)-(line 223,col 25)",
        "(line 224,col 9)-(line 229,col 9)",
        "(line 231,col 9)-(line 231,col 30)"
      ]
    }
  ]
}