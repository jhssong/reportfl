{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/ConvergingAlgorithmImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConvergingAlgorithmImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ConvergingAlgorithm"
      ],
      "begin_line": 28,
      "end_line": 121,
      "comment": "\n * Provide a default implementation for several functions useful to generic\n * converging algorithms.\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "absoluteAccuracy"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Maximum absolute error. "
    },
    {
      "type": "field",
      "varNames": [
        "relativeAccuracy"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Maximum relative error. "
    },
    {
      "type": "field",
      "varNames": [
        "maximalIterationCount"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Maximum number of iterations. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultAbsoluteAccuracy"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Default maximum absolute error. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultRelativeAccuracy"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Default maximum relative error. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultMaximalIterationCount"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Default maximum number of iterations. "
    },
    {
      "type": "field",
      "varNames": [
        "iterationCount"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " The last iteration count. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.ConvergingAlgorithmImpl(int, double)",
      "begin_line": 60,
      "end_line": 69,
      "comment": "\n     * Construct an algorithm with given iteration count and accuracy.\n     *\n     * @param defaultAbsoluteAccuracy maximum absolute error\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the\n     * defaultAbsoluteAccuracy is not valid\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 63)",
        "(line 63,col 9)-(line 63,col 47)",
        "(line 64,col 9)-(line 64,col 56)",
        "(line 65,col 9)-(line 65,col 56)",
        "(line 66,col 9)-(line 66,col 73)",
        "(line 67,col 9)-(line 67,col 66)",
        "(line 68,col 9)-(line 68,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.getIterationCount()",
      "begin_line": 72,
      "end_line": 74,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.setAbsoluteAccuracy(double)",
      "begin_line": 77,
      "end_line": 79,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.getAbsoluteAccuracy()",
      "begin_line": 82,
      "end_line": 84,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.resetAbsoluteAccuracy()",
      "begin_line": 87,
      "end_line": 89,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.setMaximalIterationCount(int)",
      "begin_line": 92,
      "end_line": 94,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.getMaximalIterationCount()",
      "begin_line": 97,
      "end_line": 99,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.resetMaximalIterationCount()",
      "begin_line": 102,
      "end_line": 104,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.setRelativeAccuracy(double)",
      "begin_line": 107,
      "end_line": 109,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.getRelativeAccuracy()",
      "begin_line": 112,
      "end_line": 114,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.resetRelativeAccuracy()",
      "begin_line": 117,
      "end_line": 119,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 51)"
      ]
    }
  ]
}