{
  "filepath": "/tmp/Math-92b/src/java/org/apache/commons/math/ConvergingAlgorithmImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConvergingAlgorithmImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ConvergingAlgorithm"
      ],
      "begin_line": 27,
      "end_line": 123,
      "comment": "\n * Provide a default implementation for several functions useful to generic\n * converging algorithms.\n *  \n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "absoluteAccuracy"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Maximum absolute error. "
    },
    {
      "type": "field",
      "varNames": [
        "relativeAccuracy"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Maximum relative error. "
    },
    {
      "type": "field",
      "varNames": [
        "maximalIterationCount"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Maximum number of iterations. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultAbsoluteAccuracy"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Default maximum absolute error. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultRelativeAccuracy"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Default maximum relative error. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultMaximalIterationCount"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Default maximum number of iterations. "
    },
    {
      "type": "field",
      "varNames": [
        "iterationCount"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " The last iteration count. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.ConvergingAlgorithmImpl(int, double)",
      "begin_line": 62,
      "end_line": 71,
      "comment": "\n     * Construct an algorithm with given iteration count and accuracy.\n     * \n     * @param defaultAbsoluteAccuracy maximum absolute error\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the \n     * defaultAbsoluteAccuracy is not valid\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 63)",
        "(line 65,col 9)-(line 65,col 47)",
        "(line 66,col 9)-(line 66,col 56)",
        "(line 67,col 9)-(line 67,col 56)",
        "(line 68,col 9)-(line 68,col 73)",
        "(line 69,col 9)-(line 69,col 66)",
        "(line 70,col 9)-(line 70,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.getIterationCount()",
      "begin_line": 74,
      "end_line": 76,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.setAbsoluteAccuracy(double)",
      "begin_line": 79,
      "end_line": 81,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.getAbsoluteAccuracy()",
      "begin_line": 84,
      "end_line": 86,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.resetAbsoluteAccuracy()",
      "begin_line": 89,
      "end_line": 91,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.setMaximalIterationCount(int)",
      "begin_line": 94,
      "end_line": 96,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.getMaximalIterationCount()",
      "begin_line": 99,
      "end_line": 101,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.resetMaximalIterationCount()",
      "begin_line": 104,
      "end_line": 106,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.setRelativeAccuracy(double)",
      "begin_line": 109,
      "end_line": 111,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.getRelativeAccuracy()",
      "begin_line": 114,
      "end_line": 116,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.resetRelativeAccuracy()",
      "begin_line": 119,
      "end_line": 121,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 51)"
      ]
    }
  ]
}