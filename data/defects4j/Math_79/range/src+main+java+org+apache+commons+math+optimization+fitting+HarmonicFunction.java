{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/optimization/fitting/HarmonicFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HarmonicFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction"
      ],
      "begin_line": 26,
      "end_line": 79,
      "comment": " Harmonic function of the form \u003ccode\u003ef (t) \u003d a cos (\u0026omega; t + \u0026phi;)\u003c/code\u003e.\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": " Amplitude a. "
    },
    {
      "type": "field",
      "varNames": [
        "omega"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Pulsation \u0026omega;. "
    },
    {
      "type": "field",
      "varNames": [
        "phi"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Phase \u0026phi;. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicFunction.HarmonicFunction(double, double, double)",
      "begin_line": 42,
      "end_line": 46,
      "comment": " Simple constructor.\n     * @param a amplitude\n     * @param omega pulsation\n     * @param phi phase\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 23)",
        "(line 44,col 9)-(line 44,col 27)",
        "(line 45,col 9)-(line 45,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicFunction.value(double)",
      "begin_line": 49,
      "end_line": 51,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicFunction.derivative()",
      "begin_line": 54,
      "end_line": 56,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicFunction.getAmplitude()",
      "begin_line": 61,
      "end_line": 63,
      "comment": " Get the amplitude a.\n     * @return amplitude a;\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicFunction.getPulsation()",
      "begin_line": 68,
      "end_line": 70,
      "comment": " Get the pulsation \u0026omega;.\n     * @return pulsation \u0026omega;\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicFunction.getPhase()",
      "begin_line": 75,
      "end_line": 77,
      "comment": " Get the phase \u0026phi;.\n     * @return phase \u0026phi;\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 19)"
      ]
    }
  ]
}