{
  "filepath": "/tmp/Math-23b/src/main/java/org/apache/commons/math3/genetics/FixedElapsedTime.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FixedElapsedTime",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.genetics.StoppingCondition"
      ],
      "begin_line": 36,
      "end_line": 81,
      "comment": "\n * Stops after a fixed amount of time has elapsed.\n *\n * \u003cp\u003e\n * The first time {@link #isSatisfied(Population)} is invoked, the end time of\n * the evolution is determined based on the provided \u003ccode\u003emaxTime\u003c/code\u003e value.\n * Once the elapsed time reaches the configured \u003ccode\u003emaxTime\u003c/code\u003e value,\n * {@link #isSatisfied(Population)} returns true.\n * \u003c/p\u003e\n *\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "maxTimePeriod"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Maximum allowed time period (in nanoseconds). "
    },
    {
      "type": "field",
      "varNames": [
        "endTime"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The predetermined termination time (stopping condition). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.genetics.FixedElapsedTime.FixedElapsedTime(long)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Create a new {@link FixedElapsedTime} instance.\n     *\n     * @param maxTime maximum number of seconds generations are allowed to evolve\n     * @throws NumberIsTooSmallException if the provided time is \u0026lt; 0\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.genetics.FixedElapsedTime.FixedElapsedTime(long, java.util.concurrent.TimeUnit)",
      "begin_line": 60,
      "end_line": 65,
      "comment": "\n     * Create a new {@link FixedElapsedTime} instance.\n     *\n     * @param maxTime maximum time generations are allowed to evolve\n     * @param unit {@link TimeUnit} of the maxTime argument\n     * @throws NumberIsTooSmallException if the provided time is \u0026lt; 0\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 64,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.FixedElapsedTime.isSatisfied(org.apache.commons.math3.genetics.Population)",
      "begin_line": 74,
      "end_line": 80,
      "comment": "\n     * Determine whether or not the maximum allowed time has passed.\n     * The termination time is determined after the first generation.\n     *\n     * @param population ignored (no impact on result)\n     * @return \u003ccode\u003etrue\u003c/code\u003e IFF the maximum allowed time period has elapsed\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 77,col 9)",
        "(line 79,col 9)-(line 79,col 44)"
      ]
    }
  ]
}