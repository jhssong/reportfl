{
  "filepath": "/tmp/Math-50b/src/main/java/org/apache/commons/math/analysis/integration/LegendreGaussIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LegendreGaussIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl"
      ],
      "begin_line": 54,
      "end_line": 228,
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
      "signature": "org.apache.commons.math.analysis.integration.LegendreGaussIntegrator.integrate(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 157,
      "end_line": 194,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 22)",
        "(line 161,col 9)-(line 161,col 33)",
        "(line 162,col 9)-(line 162,col 31)",
        "(line 165,col 9)-(line 165,col 44)",
        "(line 167,col 9)-(line 167,col 18)",
        "(line 168,col 9)-(line 190,col 9)",
        "(line 192,col 9)-(line 192,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.LegendreGaussIntegrator.stage(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 206,
      "end_line": 226,
      "comment": "\n     * Compute the n-th stage integral.\n     * @param f the integrand function\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n number of steps\n     * @return the value of n-th stage integral\n     * @throws MathUserException if an error occurs evaluating the\n     * function\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 48)",
        "(line 212,col 9)-(line 212,col 43)",
        "(line 215,col 9)-(line 215,col 41)",
        "(line 216,col 9)-(line 216,col 25)",
        "(line 217,col 9)-(line 222,col 9)",
        "(line 224,col 9)-(line 224,col 30)"
      ]
    }
  ]
}