{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/genetics/FixedGenerationCount.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FixedGenerationCount",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.genetics.StoppingCondition"
      ],
      "begin_line": 29,
      "end_line": 72,
      "comment": "\n * Stops after a fixed number of generations. Each time {@link #isSatisfied(Population)} is invoked, a generation\n * counter is incremented. Once the counter reaches the configured \u003ccode\u003emaxGenerations\u003c/code\u003e value,\n * {@link #isSatisfied(Population)} returns true.\n *\n * @version $Id$\n * @since 2.0\n "
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
      "signature": "org.apache.commons.math3.genetics.FixedGenerationCount.FixedGenerationCount(int)",
      "begin_line": 42,
      "end_line": 47,
      "comment": "\n     * Create a new FixedGenerationCount instance.\n     *\n     * @param maxGenerations number of generations to evolve\n     * @throws NumberIsTooSmallException if the number of generations is \u0026lt; 1\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 45,col 9)",
        "(line 46,col 9)-(line 46,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.FixedGenerationCount.isSatisfied(org.apache.commons.math3.genetics.Population)",
      "begin_line": 56,
      "end_line": 62,
      "comment": "\n     * Determine whether or not the given number of generations have passed. Increments the number of generations\n     * counter if the maximum has not been reached.\n     *\n     * @param population ignored (no impact on result)\n     * @return \u003ccode\u003etrue\u003c/code\u003e IFF the maximum number of generations has been exceeded\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 60,col 9)",
        "(line 61,col 9)-(line 61,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.FixedGenerationCount.getNumGenerations()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Returns the number of generations that have already passed.\n     * @return the number of generations that have passed\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 30)"
      ]
    }
  ]
}