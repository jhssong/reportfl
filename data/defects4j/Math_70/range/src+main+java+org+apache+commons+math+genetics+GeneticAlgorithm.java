{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/genetics/GeneticAlgorithm.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GeneticAlgorithm",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 228,
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
      "type": "field",
      "varNames": [
        "crossoverPolicy"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " the crossover policy used by the algorithm. "
    },
    {
      "type": "field",
      "varNames": [
        "crossoverRate"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " the rate of crossover for the algorithm. "
    },
    {
      "type": "field",
      "varNames": [
        "mutationPolicy"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " the mutation policy used by the algorithm. "
    },
    {
      "type": "field",
      "varNames": [
        "mutationRate"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " the rate of mutation for the algorithm. "
    },
    {
      "type": "field",
      "varNames": [
        "selectionPolicy"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " the selection policy used by the algorithm. "
    },
    {
      "type": "field",
      "varNames": [
        "generationsEvolved"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " the number of generations evolved to reach {@link StoppingCondition} in the last run. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.GeneticAlgorithm(org.apache.commons.math.genetics.CrossoverPolicy, double, org.apache.commons.math.genetics.MutationPolicy, double, org.apache.commons.math.genetics.SelectionPolicy)",
      "begin_line": 65,
      "end_line": 80,
      "comment": "\n     * @param crossoverPolicy The {@link CrossoverPolicy}\n     * @param crossoverRate The crossover rate as a percentage (0-1 inclusive)\n     * @param mutationPolicy The {@link MutationPolicy}\n     * @param mutationRate The mutation rate as a percentage (0-1 inclusive)\n     * @param selectionPolicy The {@link SelectionPolicy}\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 71,col 9)",
        "(line 72,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 47)",
        "(line 76,col 9)-(line 76,col 43)",
        "(line 77,col 9)-(line 77,col 45)",
        "(line 78,col 9)-(line 78,col 41)",
        "(line 79,col 9)-(line 79,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.setRandomGenerator(org.apache.commons.math.random.RandomGenerator)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Set the (static) random generator.\n     *\n     * @param random random generator\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.getRandomGenerator()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Returns the (static) random generator.\n     *\n     * @return the static random generator shared by GA implementation classes\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.evolve(org.apache.commons.math.genetics.Population, org.apache.commons.math.genetics.StoppingCondition)",
      "begin_line": 110,
      "end_line": 118,
      "comment": "\n     * Evolve the given population. Evolution stops when the stopping condition\n     * is satisfied. Updates the {@link #getGenerationsEvolved() generationsEvolved}\n     * property with the number of generations evolved before the StoppingCondition\n     * is satisfied.\n     *\n     * @param initial the initial, seed population.\n     * @param condition the stopping condition used to stop evolution.\n     * @return the population that satisfies the stopping condition.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 37)",
        "(line 112,col 9)-(line 112,col 31)",
        "(line 113,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.nextGeneration(org.apache.commons.math.genetics.Population)",
      "begin_line": 142,
      "end_line": 175,
      "comment": "\n     * \u003cp\u003eEvolve the given population into the next generation.\u003c/p\u003e\n     * \u003cp\u003e\u003col\u003e\n     *    \u003cli\u003eGet nextGeneration population to fill from \u003ccode\u003ecurrent\u003c/code\u003e\n     *        generation, using its nextGeneration method\u003c/li\u003e\n     *    \u003cli\u003eLoop until new generation is filled:\u003c/li\u003e\n     *    \u003cul\u003e\u003cli\u003eApply configured SelectionPolicy to select a pair of parents\n     *            from \u003ccode\u003ecurrent\u003c/code\u003e\u003c/li\u003e\n     *        \u003cli\u003eWith probability \u003d {@link #getCrossoverRate()}, apply\n     *            configured {@link CrossoverPolicy} to parents\u003c/li\u003e\n     *        \u003cli\u003eWith probability \u003d {@link #getMutationRate()}, apply\n     *            configured {@link MutationPolicy} to each of the offspring\u003c/li\u003e\n     *        \u003cli\u003eAdd offspring individually to nextGeneration,\n     *            space permitting\u003c/li\u003e\n     *    \u003c/ul\u003e\n     *    \u003cli\u003eReturn nextGeneration\u003c/li\u003e\n     *    \u003c/ol\u003e\n     * \u003c/p\u003e\n     *\n     * @param current the current population.\n     * @return the population for the next generation.\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 61)",
        "(line 145,col 9)-(line 145,col 55)",
        "(line 147,col 9)-(line 172,col 9)",
        "(line 174,col 9)-(line 174,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.getCrossoverPolicy()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * Returns the crossover policy.\n     * @return crossover policy\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.getCrossoverRate()",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\n     * Returns the crossover rate.\n     * @return crossover rate\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.getMutationPolicy()",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\n     * Returns the mutation policy.\n     * @return mutation policy\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.getMutationRate()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * Returns the mutation rate.\n     * @return mutation rate\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.getSelectionPolicy()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\n     * Returns the selection policy.\n     * @return selection policy\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.getGenerationsEvolved()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n     * Returns the number of generations evolved to\n     * reach {@link StoppingCondition} in the last run.\n     *\n     * @return number of generations evolved\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 34)"
      ]
    }
  ]
}