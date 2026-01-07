{
  "filepath": "/tmp/Math-84b/src/main/java/org/apache/commons/math/genetics/GeneticAlgorithm.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GeneticAlgorithm",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 210,
      "comment": "\n * Implementation of a genetic algorithm. All factors that govern the operation\n * of the algorithm can be configured for a specific problem.\n *\n * @since 2.0\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "randomGenerator"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "@GuardedBy(\"this\")"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.setRandomGenerator(org.apache.commons.math.random.RandomGenerator)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Set the (static) random generator.\n     * \n     * @param random random generator\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.getRandomGenerator()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Returns the (static) random generator.\n     * \n     * @return the static random generator shared by GA implementation classes\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "crossoverPolicy"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " the crossover policy used by the algorithm. "
    },
    {
      "type": "field",
      "varNames": [
        "crossoverRate"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " the rate of crossover for the algorithm. "
    },
    {
      "type": "field",
      "varNames": [
        "mutationPolicy"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " the mutation policy used by the algorithm. "
    },
    {
      "type": "field",
      "varNames": [
        "mutationRate"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " the rate of mutation for the algorithm. "
    },
    {
      "type": "field",
      "varNames": [
        "selectionPolicy"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " the selection policy used by the algorithm. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.GeneticAlgorithm(org.apache.commons.math.genetics.CrossoverPolicy, double, org.apache.commons.math.genetics.MutationPolicy, double, org.apache.commons.math.genetics.SelectionPolicy)",
      "begin_line": 80,
      "end_line": 95,
      "comment": "\n     * @param crossoverPolicy The {@link CrossoverPolicy}\n     * @param crossoverRate The crossover rate as a percentage (0-1 inclusive)\n     * @param mutationPolicy The {@link MutationPolicy}\n     * @param mutationRate The mutation rate as a percentage (0-1 inclusive)\n     * @param selectionPolicy The {@link SelectionPolicy}\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 47)",
        "(line 91,col 9)-(line 91,col 43)",
        "(line 92,col 9)-(line 92,col 45)",
        "(line 93,col 9)-(line 93,col 41)",
        "(line 94,col 9)-(line 94,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.evolve(org.apache.commons.math.genetics.Population, org.apache.commons.math.genetics.StoppingCondition)",
      "begin_line": 105,
      "end_line": 111,
      "comment": "\n     * Evolve the given population. Evolution stops when the stopping condition\n     * is satisfied.\n     * \n     * @param initial the initial, seed population.\n     * @param condition the stopping condition used to stop evolution.\n     * @return the population that satisfies the stopping condition.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 37)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.nextGeneration(org.apache.commons.math.genetics.Population)",
      "begin_line": 135,
      "end_line": 168,
      "comment": "\n     * \u003cp\u003eEvolve the given population into the next generation.\u003c/p\u003e\n     * \u003cp\u003e\u003col\u003e\n     *    \u003cli\u003eGet nextGeneration population to fill from \u003ccode\u003ecurrent\u003c/code\u003e\n     *        generation, using its nextGeneration method\u003c/li\u003e\n     *    \u003cli\u003eLoop until new generation is filled:\u003c/li\u003e\n     *    \u003cul\u003e\u003cli\u003eApply configured SelectionPolicy to select a pair of parents\n     *            from \u003ccode\u003ecurrent\u003c/code\u003e\u003c/li\u003e\n     *        \u003cli\u003eWith probability \u003d {@link #getCrossoverRate()}, apply\n     *            configured {@link CrossoverPolicy} to parents\u003c/li\u003e\n     *        \u003cli\u003eWith probability \u003d {@link #getMutationRate()}, apply\n     *            configured {@link MutationPolicy} to each of the offspring\u003c/li\u003e\n     *        \u003cli\u003eAdd offspring individually to nextGeneration,\n     *            space permitting\u003c/li\u003e\n     *    \u003c/ul\u003e\n     *    \u003cli\u003eReturn nextGeneration\u003c/li\u003e\n     *    \u003c/ol\u003e\n     * \u003c/p\u003e\n     * \n     * @param current the current population.\n     * @return the population for the next generation.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 61)",
        "(line 138,col 9)-(line 138,col 55)",
        "(line 140,col 9)-(line 165,col 9)",
        "(line 167,col 9)-(line 167,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.getCrossoverPolicy()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * Returns the crossover policy.\n     * @return crossover policy\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.getCrossoverRate()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\n     * Returns the crossover rate.\n     * @return crossover rate\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.getMutationPolicy()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * Returns the mutation policy.\n     * @return mutation policy\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.getMutationRate()",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\n     * Returns the mutation rate.\n     * @return mutation rate\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.getSelectionPolicy()",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n     * Returns the selection policy.\n     * @return selection policy\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 31)"
      ]
    }
  ]
}