{
  "filepath": "/tmp/Math-49b/src/test/java/org/apache/commons/math/analysis/SumSincFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SumSincFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableMultivariateRealFunction"
      ],
      "begin_line": 26,
      "end_line": 84,
      "comment": "\n * Auxiliary class for testing optimizers.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "sinc"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sincDeriv"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factor"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": "\n     * Factor that will multiply each term of the sum.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.SumSincFunction.SumSincFunction(double)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * @param factor Factor that will multiply each term of the sum.\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SumSincFunction.value(double[])",
      "begin_line": 46,
      "end_line": 54,
      "comment": "\n     * @param point Argument.\n     * @return the value of this function at point {@code x}.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 23)",
        "(line 48,col 9)-(line 52,col 9)",
        "(line 53,col 9)-(line 53,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SumSincFunction.partialDerivative(int)",
      "begin_line": 59,
      "end_line": 65,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 64,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SumSincFunction.Anonymous-7255ab9b-afdd-44d0-b970-3527c880e238.value(double[])",
      "begin_line": 61,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 17)-(line 62,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SumSincFunction.gradient()",
      "begin_line": 70,
      "end_line": 83,
      "comment": "                                                                            \n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 82,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SumSincFunction.Anonymous-9bc2cffc-6e73-4007-baf9-5997b8ff76e6.value(double[])",
      "begin_line": 72,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 74,col 17)-(line 74,col 43)",
        "(line 75,col 17)-(line 75,col 49)",
        "(line 76,col 17)-(line 79,col 17)",
        "(line 80,col 17)-(line 80,col 25)"
      ]
    }
  ]
}