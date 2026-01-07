{
  "filepath": "/tmp/Math-35b/src/test/java/org/apache/commons/math3/analysis/SumSincFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SumSincFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.DifferentiableMultivariateFunction"
      ],
      "begin_line": 24,
      "end_line": 81,
      "comment": "\n * Auxiliary class for testing optimizers.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "sinc"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sincDeriv"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factor"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": "\n     * Factor that will multiply each term of the sum.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.SumSincFunction.SumSincFunction(double)",
      "begin_line": 36,
      "end_line": 38,
      "comment": "\n     * @param factor Factor that will multiply each term of the sum.\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.SumSincFunction.value(double[])",
      "begin_line": 44,
      "end_line": 52,
      "comment": "\n     * @param point Argument.\n     * @return the value of this function at point {@code x}.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 23)",
        "(line 46,col 9)-(line 50,col 9)",
        "(line 51,col 9)-(line 51,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.SumSincFunction.partialDerivative(int)",
      "begin_line": 57,
      "end_line": 63,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 62,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.SumSincFunction.Anonymous-c6e2ed34-4ddf-4a37-9ba7-ff30a812935e.value(double[])",
      "begin_line": 59,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 17)-(line 60,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.SumSincFunction.gradient()",
      "begin_line": 68,
      "end_line": 80,
      "comment": "                                                                            \n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 79,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.SumSincFunction.Anonymous-f834b212-39ae-4bf2-888b-d39e766c5b5d.value(double[])",
      "begin_line": 70,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 71,col 17)-(line 71,col 43)",
        "(line 72,col 17)-(line 72,col 49)",
        "(line 73,col 17)-(line 76,col 17)",
        "(line 77,col 17)-(line 77,col 25)"
      ]
    }
  ]
}