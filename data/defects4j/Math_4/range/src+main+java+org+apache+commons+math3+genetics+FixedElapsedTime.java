{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/genetics/FixedElapsedTime.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FixedElapsedTime",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.genetics.StoppingCondition"
      ],
      "begin_line": 33,
      "end_line": 78,
      "comment": "\n * Stops after a fixed amount of time has elapsed.\n * \u003cp\u003e\n * The first time {@link #isSatisfied(Population)} is invoked, the end time of the evolution is determined based on the\n * provided \u003ccode\u003emaxTime\u003c/code\u003e value. Once the elapsed time reaches the configured \u003ccode\u003emaxTime\u003c/code\u003e value,\n * {@link #isSatisfied(Population)} returns true.\n *\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "maxTimePeriod"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Maximum allowed time period (in nanoseconds). "
    },
    {
      "type": "field",
      "varNames": [
        "endTime"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The predetermined termination time (stopping condition). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.genetics.FixedElapsedTime.FixedElapsedTime(long)",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Create a new {@link FixedElapsedTime} instance.\n     *\n     * @param maxTime maximum number of seconds generations are allowed to evolve\n     * @throws NumberIsTooSmallException if the provided time is \u0026lt; 0\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.genetics.FixedElapsedTime.FixedElapsedTime(long, java.util.concurrent.TimeUnit)",
      "begin_line": 57,
      "end_line": 62,
      "comment": "\n     * Create a new {@link FixedElapsedTime} instance.\n     *\n     * @param maxTime maximum time generations are allowed to evolve\n     * @param unit {@link TimeUnit} of the maxTime argument\n     * @throws NumberIsTooSmallException if the provided time is \u0026lt; 0\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 60,col 9)",
        "(line 61,col 9)-(line 61,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.FixedElapsedTime.isSatisfied(org.apache.commons.math3.genetics.Population)",
      "begin_line": 71,
      "end_line": 77,
      "comment": "\n     * Determine whether or not the maximum allowed time has passed.\n     * The termination time is determined after the first generation.\n     *\n     * @param population ignored (no impact on result)\n     * @return \u003ccode\u003etrue\u003c/code\u003e IFF the maximum allowed time period has elapsed\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 74,col 9)",
        "(line 76,col 9)-(line 76,col 44)"
      ]
    }
  ]
}