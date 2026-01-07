{
  "filepath": "/tmp/Math-21b/src/test/java/org/apache/commons/math3/analysis/SumSincFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SumSincFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.DifferentiableMultivariateFunction"
      ],
      "begin_line": 28,
      "end_line": 84,
      "comment": "\n * Auxiliary class for testing optimizers.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "sinc"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factor"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     * Factor that will multiply each term of the sum.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.SumSincFunction.SumSincFunction(double)",
      "begin_line": 39,
      "end_line": 41,
      "comment": "\n     * @param factor Factor that will multiply each term of the sum.\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.SumSincFunction.value(double[])",
      "begin_line": 47,
      "end_line": 55,
      "comment": "\n     * @param point Argument.\n     * @return the value of this function at point {@code x}.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 23)",
        "(line 49,col 9)-(line 53,col 9)",
        "(line 54,col 9)-(line 54,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.SumSincFunction.partialDerivative(int)",
      "begin_line": 60,
      "end_line": 66,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 65,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.SumSincFunction.Anonymous-5c6acb57-ac91-4e8f-b479-fdc9e18003ce.value(double[])",
      "begin_line": 62,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 17)-(line 63,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.SumSincFunction.gradient()",
      "begin_line": 71,
      "end_line": 83,
      "comment": "                                                                            \n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 82,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.SumSincFunction.Anonymous-0da0c6b9-d8dc-41fc-806a-b0da9d713b6a.value(double[])",
      "begin_line": 73,
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