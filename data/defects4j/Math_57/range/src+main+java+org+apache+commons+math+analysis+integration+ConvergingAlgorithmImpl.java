{
  "filepath": "/tmp/Math-57b/src/main/java/org/apache/commons/math/analysis/integration/ConvergingAlgorithmImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConvergingAlgorithmImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.integration.ConvergingAlgorithm"
      ],
      "begin_line": 30,
      "end_line": 118,
      "comment": "\n * Provide a default implementation for several functions useful to generic\n * converging algorithms.\n *\n * @version $Revision$ $Date$\n * @since 2.0\n * @deprecated in 2.2 (to be removed in 3.0).\n "
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
      "begin_line": 35,
      "end_line": 35,
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
      "begin_line": 39,
      "end_line": 39,
      "comment": " Default maximum absolute error. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultRelativeAccuracy"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Default maximum relative error. "
    },
    {
      "type": "field",
      "varNames": [
        "defaultMaximalIterationCount"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Default maximum number of iterations. "
    },
    {
      "type": "field",
      "varNames": [
        "iterationCount"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The last iteration count. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.ConvergingAlgorithmImpl.getIterationCount()",
      "begin_line": 48,
      "end_line": 50,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.ConvergingAlgorithmImpl.setAbsoluteAccuracy(double)",
      "begin_line": 53,
      "end_line": 55,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.ConvergingAlgorithmImpl.getAbsoluteAccuracy()",
      "begin_line": 58,
      "end_line": 60,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.ConvergingAlgorithmImpl.resetAbsoluteAccuracy()",
      "begin_line": 63,
      "end_line": 65,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.ConvergingAlgorithmImpl.setMaximalIterationCount(int)",
      "begin_line": 68,
      "end_line": 70,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.ConvergingAlgorithmImpl.getMaximalIterationCount()",
      "begin_line": 73,
      "end_line": 75,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.ConvergingAlgorithmImpl.resetMaximalIterationCount()",
      "begin_line": 78,
      "end_line": 80,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.ConvergingAlgorithmImpl.setRelativeAccuracy(double)",
      "begin_line": 83,
      "end_line": 85,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.ConvergingAlgorithmImpl.getRelativeAccuracy()",
      "begin_line": 88,
      "end_line": 90,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.ConvergingAlgorithmImpl.resetRelativeAccuracy()",
      "begin_line": 93,
      "end_line": 95,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.ConvergingAlgorithmImpl.resetIterationsCounter()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Reset the iterations counter to 0.\n     *\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.ConvergingAlgorithmImpl.incrementIterationsCounter()",
      "begin_line": 113,
      "end_line": 117,
      "comment": "\n     * Increment the iterations counter by 1.\n     *\n     * @throws MaxCountExceededException if the maximal number\n     * of iterations is exceeded.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 116,col 9)"
      ]
    }
  ]
}