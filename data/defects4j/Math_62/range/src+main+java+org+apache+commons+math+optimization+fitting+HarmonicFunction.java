{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/optimization/fitting/HarmonicFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HarmonicFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction"
      ],
      "begin_line": 27,
      "end_line": 80,
      "comment": " Harmonic function of the form \u003ccode\u003ef (t) \u003d a cos (\u0026omega; t + \u0026phi;)\u003c/code\u003e.\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " Amplitude a. "
    },
    {
      "type": "field",
      "varNames": [
        "omega"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Pulsation \u0026omega;. "
    },
    {
      "type": "field",
      "varNames": [
        "phi"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Phase \u0026phi;. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicFunction.HarmonicFunction(double, double, double)",
      "begin_line": 43,
      "end_line": 47,
      "comment": " Simple constructor.\n     * @param a amplitude\n     * @param omega pulsation\n     * @param phi phase\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 23)",
        "(line 45,col 9)-(line 45,col 27)",
        "(line 46,col 9)-(line 46,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicFunction.value(double)",
      "begin_line": 50,
      "end_line": 52,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicFunction.derivative()",
      "begin_line": 55,
      "end_line": 57,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicFunction.getAmplitude()",
      "begin_line": 62,
      "end_line": 64,
      "comment": " Get the amplitude a.\n     * @return amplitude a;\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicFunction.getPulsation()",
      "begin_line": 69,
      "end_line": 71,
      "comment": " Get the pulsation \u0026omega;.\n     * @return pulsation \u0026omega;\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.fitting.HarmonicFunction.getPhase()",
      "begin_line": 76,
      "end_line": 78,
      "comment": " Get the phase \u0026phi;.\n     * @return phase \u0026phi;\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 19)"
      ]
    }
  ]
}