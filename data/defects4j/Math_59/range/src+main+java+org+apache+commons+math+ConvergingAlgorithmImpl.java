{
  "filepath": "/tmp/Math-59b/src/main/java/org/apache/commons/math/ConvergingAlgorithmImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConvergingAlgorithmImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ConvergingAlgorithm"
      ],
      "begin_line": 28,
      "end_line": 156,
      "comment": "\n * Provide a default implementation for several functions useful to generic\n * converging algorithms.\n *\n * @version $Revision$ $Date$\n * @since 2.0\n * @deprecated in 2.2 (to be removed in 3.0).\n "
    },
    {
      "type": "field",
      "varNames": [
        "absoluteAccuracy"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Maximum absolute error. "
    },
    {
      "type": "field",
      "varNames": [
        "relativeAccuracy"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Maximum relative error. "
    },
    {
      "type": "field",
      "varNames": [
        "maximalIterationCount"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Maximum number of iterations. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultAbsoluteAccuracy"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Default maximum absolute error. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultRelativeAccuracy"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Default maximum relative error. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultMaximalIterationCount"
      ],
      "begin_line": 47,
      "end_line": 47,
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
      "begin_line": 62,
      "end_line": 72,
      "comment": "\n     * Construct an algorithm with given iteration count and accuracy.\n     *\n     * @param defaultAbsoluteAccuracy maximum absolute error\n     * @param defaultMaximalIterationCount maximum number of iterations\n     * @throws IllegalArgumentException if f is null or the\n     * defaultAbsoluteAccuracy is not valid\n     * @deprecated in 2.2. Derived classes should use the \"setter\" methods\n     * in order to assign meaningful values to all the instances variables.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 63)",
        "(line 66,col 9)-(line 66,col 47)",
        "(line 67,col 9)-(line 67,col 56)",
        "(line 68,col 9)-(line 68,col 56)",
        "(line 69,col 9)-(line 69,col 73)",
        "(line 70,col 9)-(line 70,col 66)",
        "(line 71,col 9)-(line 71,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.ConvergingAlgorithmImpl()",
      "begin_line": 81,
      "end_line": 82,
      "comment": "\n     * Default constructor.\n     *\n     * @since 2.2\n     * @deprecated in 2.2 (to be removed as soon as the single non-default one\n     * has been removed).\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.getIterationCount()",
      "begin_line": 85,
      "end_line": 87,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.setAbsoluteAccuracy(double)",
      "begin_line": 90,
      "end_line": 92,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.getAbsoluteAccuracy()",
      "begin_line": 95,
      "end_line": 97,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.resetAbsoluteAccuracy()",
      "begin_line": 100,
      "end_line": 102,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.setMaximalIterationCount(int)",
      "begin_line": 105,
      "end_line": 107,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.getMaximalIterationCount()",
      "begin_line": 110,
      "end_line": 112,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.resetMaximalIterationCount()",
      "begin_line": 115,
      "end_line": 117,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.setRelativeAccuracy(double)",
      "begin_line": 120,
      "end_line": 122,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.getRelativeAccuracy()",
      "begin_line": 125,
      "end_line": 127,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.resetRelativeAccuracy()",
      "begin_line": 130,
      "end_line": 132,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.resetIterationsCounter()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * Reset the iterations counter to 0.\n     *\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithmImpl.incrementIterationsCounter()",
      "begin_line": 150,
      "end_line": 155,
      "comment": "\n     * Increment the iterations counter by 1.\n     *\n     * @throws MaxIterationsExceededException if the maximal number\n     * of iterations is exceeded.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 154,col 9)"
      ]
    }
  ]
}