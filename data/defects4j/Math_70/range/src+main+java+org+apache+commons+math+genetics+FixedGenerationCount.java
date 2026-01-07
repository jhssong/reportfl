{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/genetics/FixedGenerationCount.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FixedGenerationCount",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.genetics.StoppingCondition"
      ],
      "begin_line": 29,
      "end_line": 70,
      "comment": "\n * Stops after a fixed number of generations.  Each time\n * {@link #isSatisfied(Population)} is invoked, a generation counter is\n * incremented.  Once the counter reaches the configured\n * \u003ccode\u003emaxGenerations\u003c/code\u003e value, {@link #isSatisfied(Population)} returns\n * true.\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "numGenerations"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Number of generations that have passed "
    },
    {
      "type": "field",
      "varNames": [
        "maxGenerations"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Maximum number of generations (stopping criteria) "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.genetics.FixedGenerationCount.FixedGenerationCount(int)",
      "begin_line": 41,
      "end_line": 45,
      "comment": "\n     * Create a new FixedGenerationCount instance.\n     *\n     * @param maxGenerations number of generations to evolve\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 43,col 91)",
        "(line 44,col 9)-(line 44,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.FixedGenerationCount.isSatisfied(org.apache.commons.math.genetics.Population)",
      "begin_line": 55,
      "end_line": 61,
      "comment": "\n     * Determine whether or not the given number of generations have passed.\n     * Increments the number of generations counter if the maximum has not\n     * been reached.\n     *\n     * @param population ignored (no impact on result)\n     * @return \u003ccode\u003etrue\u003c/code\u003e IFF the maximum number of generations has been exceeded\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 59,col 9)",
        "(line 60,col 9)-(line 60,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.FixedGenerationCount.getNumGenerations()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * @return the number of generations that have passed\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 30)"
      ]
    }
  ]
}