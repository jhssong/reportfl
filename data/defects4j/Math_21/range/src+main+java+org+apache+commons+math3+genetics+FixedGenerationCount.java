{
  "filepath": "/tmp/Math-21b/src/main/java/org/apache/commons/math3/genetics/FixedGenerationCount.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FixedGenerationCount",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.genetics.StoppingCondition"
      ],
      "begin_line": 31,
      "end_line": 74,
      "comment": "\n * Stops after a fixed number of generations.  Each time\n * {@link #isSatisfied(Population)} is invoked, a generation counter is\n * incremented.  Once the counter reaches the configured\n * \u003ccode\u003emaxGenerations\u003c/code\u003e value, {@link #isSatisfied(Population)} returns\n * true.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "numGenerations"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Number of generations that have passed "
    },
    {
      "type": "field",
      "varNames": [
        "maxGenerations"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Maximum number of generations (stopping criteria) "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.genetics.FixedGenerationCount.FixedGenerationCount(int)",
      "begin_line": 44,
      "end_line": 49,
      "comment": "\n     * Create a new FixedGenerationCount instance.\n     *\n     * @param maxGenerations number of generations to evolve\n     * @throws NumberIsTooSmallException if the number of generations is \u0026lt; 1\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 47,col 9)",
        "(line 48,col 9)-(line 48,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.FixedGenerationCount.isSatisfied(org.apache.commons.math3.genetics.Population)",
      "begin_line": 59,
      "end_line": 65,
      "comment": "\n     * Determine whether or not the given number of generations have passed.\n     * Increments the number of generations counter if the maximum has not\n     * been reached.\n     *\n     * @param population ignored (no impact on result)\n     * @return \u003ccode\u003etrue\u003c/code\u003e IFF the maximum number of generations has been exceeded\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 64,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.FixedGenerationCount.getNumGenerations()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * @return the number of generations that have passed\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 30)"
      ]
    }
  ]
}