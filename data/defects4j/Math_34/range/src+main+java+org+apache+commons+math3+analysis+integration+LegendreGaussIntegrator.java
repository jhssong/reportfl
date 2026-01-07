{
  "filepath": "/tmp/Math-34b/src/main/java/org/apache/commons/math3/analysis/integration/LegendreGaussIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LegendreGaussIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator"
      ],
      "begin_line": 54,
      "end_line": 259,
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
      "signature": "org.apache.commons.math3.analysis.integration.LegendreGaussIntegrator.LegendreGaussIntegrator(int, double, double, int, int)",
      "begin_line": 134,
      "end_line": 164,
      "comment": "\n     * Build a Legendre-Gauss integrator with given accuracies and iterations counts.\n     * @param n number of points desired (must be between 2 and 5 inclusive)\n     * @param relativeAccuracy relative accuracy of the result\n     * @param absoluteAccuracy absolute accuracy of the result\n     * @param minimalIterationCount minimum number of iterations\n     * @param maximalIterationCount maximum number of iterations\n     * @exception NotStrictlyPositiveException if minimal number of iterations\n     * is not strictly positive\n     * @exception NumberIsTooSmallException if maximal number of iterations\n     * is lesser than or equal to the minimal number of iterations\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 96)",
        "(line 141,col 9)-(line 162,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.LegendreGaussIntegrator.LegendreGaussIntegrator(int, double, double)",
      "begin_line": 172,
      "end_line": 177,
      "comment": "\n     * Build a Legendre-Gauss integrator with given accuracies.\n     * @param n number of points desired (must be between 2 and 5 inclusive)\n     * @param relativeAccuracy relative accuracy of the result\n     * @param absoluteAccuracy absolute accuracy of the result\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 176,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.LegendreGaussIntegrator.LegendreGaussIntegrator(int, int, int)",
      "begin_line": 189,
      "end_line": 194,
      "comment": "\n     * Build a Legendre-Gauss integrator with given iteration counts.\n     * @param n number of points desired (must be between 2 and 5 inclusive)\n     * @param minimalIterationCount minimum number of iterations\n     * @param maximalIterationCount maximum number of iterations\n     * @exception NotStrictlyPositiveException if minimal number of iterations\n     * is not strictly positive\n     * @exception NumberIsTooSmallException if maximal number of iterations\n     * is lesser than or equal to the minimal number of iterations\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 193,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.LegendreGaussIntegrator.doIntegrate()",
      "begin_line": 197,
      "end_line": 229,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 31)",
        "(line 204,col 9)-(line 204,col 18)",
        "(line 205,col 9)-(line 227,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.LegendreGaussIntegrator.stage(int)",
      "begin_line": 238,
      "end_line": 257,
      "comment": "\n     * Compute the n-th stage integral.\n     * @param n number of steps\n     * @return the value of n-th stage integral\n     * @throws TooManyEvaluationsException if the maximum number of evaluations\n     * is exceeded.\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 58)",
        "(line 243,col 9)-(line 243,col 43)",
        "(line 246,col 9)-(line 246,col 46)",
        "(line 247,col 9)-(line 247,col 25)",
        "(line 248,col 9)-(line 253,col 9)",
        "(line 255,col 9)-(line 255,col 30)"
      ]
    }
  ]
}