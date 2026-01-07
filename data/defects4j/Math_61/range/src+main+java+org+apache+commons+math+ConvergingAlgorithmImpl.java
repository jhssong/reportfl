{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/ConvergingAlgorithmImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConvergingAlgorithmImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ConvergingAlgorithm"
      ],
      "begin_line": 28,
      "end_line": 153,
      "comment": "\n * Provide a default implementation for several functions useful to generic\n * converging algorithms.\n *\n * @version $Revision$ $Date$\n * @since 2.0\n * @deprecated in 2.2 (to be removed in 3.0).\n "
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
      "begin_line": 49,
      "end_line": 49,
      "comment": " The last iteration count. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.ConvergingAlgorithmImpl(int, double)",
      "begin_line": 61,
      "end_line": 70,
      "comment": "\n     * Construct an algorithm with given iteration count and accuracy.\n     *\n     * @param defaultAbsoluteAccuracy maximum absolute error\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the\n     * defaultAbsoluteAccuracy is not valid\n     * @deprecated in 2.2. Derived classes should use the \"setter\" methods\n     * in order to assign meaningful values to all the instances variables.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 63)",
        "(line 64,col 9)-(line 64,col 47)",
        "(line 65,col 9)-(line 65,col 56)",
        "(line 66,col 9)-(line 66,col 56)",
        "(line 67,col 9)-(line 67,col 73)",
        "(line 68,col 9)-(line 68,col 66)",
        "(line 69,col 9)-(line 69,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.ConvergingAlgorithmImpl()",
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * Default constructor.\n     *\n     * @since 2.2\n     * @deprecated in 2.2 (to be removed as soon as the single non-default one\n     * has been removed).\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.getIterationCount()",
      "begin_line": 82,
      "end_line": 84,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.setAbsoluteAccuracy(double)",
      "begin_line": 87,
      "end_line": 89,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.getAbsoluteAccuracy()",
      "begin_line": 92,
      "end_line": 94,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.resetAbsoluteAccuracy()",
      "begin_line": 97,
      "end_line": 99,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.setMaximalIterationCount(int)",
      "begin_line": 102,
      "end_line": 104,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.getMaximalIterationCount()",
      "begin_line": 107,
      "end_line": 109,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.resetMaximalIterationCount()",
      "begin_line": 112,
      "end_line": 114,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.setRelativeAccuracy(double)",
      "begin_line": 117,
      "end_line": 119,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.getRelativeAccuracy()",
      "begin_line": 122,
      "end_line": 124,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.resetRelativeAccuracy()",
      "begin_line": 127,
      "end_line": 129,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.resetIterationsCounter()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Reset the iterations counter to 0.\n     *\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.incrementIterationsCounter()",
      "begin_line": 147,
      "end_line": 152,
      "comment": "\n     * Increment the iterations counter by 1.\n     *\n     * @throws MaxIterationsExceededException if the maximal number\n     * of iterations is exceeded.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 151,col 9)"
      ]
    }
  ]
}