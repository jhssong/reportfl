{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/univariate/SearchInterval.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SearchInterval",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.OptimizationData"
      ],
      "begin_line": 31,
      "end_line": 96,
      "comment": "\n * Search interval and (optional) start value.\n * \u003cbr/\u003e\n * Immutable class.\n *\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "lower"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Lower bound. "
    },
    {
      "type": "field",
      "varNames": [
        "upper"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Upper bound. "
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Start value. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.univariate.SearchInterval.SearchInterval(double, double, double)",
      "begin_line": 46,
      "end_line": 60,
      "comment": "\n     * @param lo Lower bound.\n     * @param hi Upper bound.\n     * @param init Start value.\n     * @throws NumberIsTooLargeException if {@code lo \u003e\u003d hi}.\n     * @throws OutOfRangeException if {@code init \u003c lo} or {@code init \u003e hi}.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 51,col 9)",
        "(line 52,col 9)-(line 55,col 9)",
        "(line 57,col 9)-(line 57,col 19)",
        "(line 58,col 9)-(line 58,col 19)",
        "(line 59,col 9)-(line 59,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.univariate.SearchInterval.SearchInterval(double, double)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "\n     * @param lo Lower bound.\n     * @param hi Upper bound.\n     * @throws NumberIsTooLargeException if {@code lo \u003e\u003d hi}.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.SearchInterval.getMin()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Gets the lower bound.\n     *\n     * @return the lower bound.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.SearchInterval.getMax()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Gets the upper bound.\n     *\n     * @return the upper bound.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.SearchInterval.getStartValue()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Gets the start value.\n     *\n     * @return the start value.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 21)"
      ]
    }
  ]
}