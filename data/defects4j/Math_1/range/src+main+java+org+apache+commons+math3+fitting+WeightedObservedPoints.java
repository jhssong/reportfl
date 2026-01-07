{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/fitting/WeightedObservedPoints.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WeightedObservedPoints",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 113,
      "comment": "\n * Simple container for weighted observed points used\n * in {@link AbstractCurveFitter curve fitting} algorithms.\n *\n * @version $Id$\n * @since 3.3\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serializable version id. "
    },
    {
      "type": "field",
      "varNames": [
        "observations"
      ],
      "begin_line": 35,
      "end_line": 36,
      "comment": " Observed points. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.WeightedObservedPoints.add(double, double)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Adds a point to the sample.\n     * Calling this method is equivalent to calling\n     * {@code add(1.0, x, y)}.\n     *\n     * @param x Abscissa of the point.\n     * @param y Observed value  at {@code x}. After fitting we should\n     * have {@code f(x)} as close as possible to this value.\n     *\n     * @see #add(double, double, double)\n     * @see #add(WeightedObservedPoint)\n     * @see #toList()\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.WeightedObservedPoints.add(double, double, double)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Adds a point to the sample.\n     *\n     * @param weight Weight of the observed point.\n     * @param x Abscissa of the point.\n     * @param y Observed value  at {@code x}. After fitting we should\n     * have {@code f(x)} as close as possible to this value.\n     *\n     * @see #add(double, double)\n     * @see #add(WeightedObservedPoint)\n     * @see #toList()\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.WeightedObservedPoints.add(org.apache.commons.math3.fitting.WeightedObservedPoint)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Adds a point to the sample.\n     *\n     * @param observed Observed point to add.\n     *\n     * @see #add(double, double)\n     * @see #add(double, double, double)\n     * @see #toList()\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.WeightedObservedPoints.toList()",
      "begin_line": 100,
      "end_line": 105,
      "comment": "\n     * Gets a \u003cem\u003esnapshot\u003c/em\u003e of the observed points.\n     * The list of stored points is copied in order to ensure that\n     * modification of the returned instance does not affect this\n     * container.\n     * Conversely, further modification of this container (through\n     * the {@code add} or {@code clear} methods) will not affect the\n     * returned list.\n     *\n     * @return the observed points, in the order they were added to this\n     * container.\n     *\n     * @see #add(double, double)\n     * @see #add(double, double, double)\n     * @see #add(WeightedObservedPoint)\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.WeightedObservedPoints.clear()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Removes all observations from this container.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 29)"
      ]
    }
  ]
}