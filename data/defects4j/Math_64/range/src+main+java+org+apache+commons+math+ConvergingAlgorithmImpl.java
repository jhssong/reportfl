{
  "filepath": "/tmp/Math-64b/src/main/java/org/apache/commons/math/ConvergingAlgorithmImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConvergingAlgorithmImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ConvergingAlgorithm"
      ],
      "begin_line": 27,
      "end_line": 152,
      "comment": "\n * Provide a default implementation for several functions useful to generic\n * converging algorithms.\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "absoluteAccuracy"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " Maximum absolute error. "
    },
    {
      "type": "field",
      "varNames": [
        "relativeAccuracy"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Maximum relative error. "
    },
    {
      "type": "field",
      "varNames": [
        "maximalIterationCount"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Maximum number of iterations. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultAbsoluteAccuracy"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Default maximum absolute error. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultRelativeAccuracy"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Default maximum relative error. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultMaximalIterationCount"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Default maximum number of iterations. "
    },
    {
      "type": "field",
      "varNames": [
        "iterationCount"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " The last iteration count. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.ConvergingAlgorithmImpl(int, double)",
      "begin_line": 60,
      "end_line": 69,
      "comment": "\n     * Construct an algorithm with given iteration count and accuracy.\n     *\n     * @param defaultAbsoluteAccuracy maximum absolute error\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the\n     * defaultAbsoluteAccuracy is not valid\n     * @deprecated in 2.2. Derived classes should use the \"setter\" methods\n     * in order to assign meaningful values to all the instances variables.\n     ",
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
      "type": "constructor",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.ConvergingAlgorithmImpl()",
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * Default constructor.\n     *\n     * @since 2.2\n     * @deprecated in 2.2 (to be removed as soon as the single non-default one\n     * has been removed).\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.getIterationCount()",
      "begin_line": 81,
      "end_line": 83,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.setAbsoluteAccuracy(double)",
      "begin_line": 86,
      "end_line": 88,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.getAbsoluteAccuracy()",
      "begin_line": 91,
      "end_line": 93,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.resetAbsoluteAccuracy()",
      "begin_line": 96,
      "end_line": 98,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.setMaximalIterationCount(int)",
      "begin_line": 101,
      "end_line": 103,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.getMaximalIterationCount()",
      "begin_line": 106,
      "end_line": 108,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.resetMaximalIterationCount()",
      "begin_line": 111,
      "end_line": 113,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.setRelativeAccuracy(double)",
      "begin_line": 116,
      "end_line": 118,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.getRelativeAccuracy()",
      "begin_line": 121,
      "end_line": 123,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.resetRelativeAccuracy()",
      "begin_line": 126,
      "end_line": 128,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.resetIterationsCounter()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * Reset the iterations counter to 0.\n     *\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.incrementIterationsCounter()",
      "begin_line": 146,
      "end_line": 151,
      "comment": "\n     * Increment the iterations counter by 1.\n     *\n     * @throws MaxIterationsExceededException if the maximal number\n     * of iterations is exceeded.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 150,col 9)"
      ]
    }
  ]
}