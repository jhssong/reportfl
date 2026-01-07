{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/genetics/GeneticAlgorithm.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GeneticAlgorithm",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 226,
      "comment": "\n * Implementation of a genetic algorithm. All factors that govern the operation\n * of the algorithm can be configured for a specific problem.\n *\n * @since 2.0\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "randomGenerator"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * Static random number generator shared by GA implementation classes.\n     * Set the randomGenerator seed to get reproducible results.\n     * Use {@link #setRandomGenerator(RandomGenerator)} to supply an alternative\n     * to the default JDK-provided PRNG.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "crossoverPolicy"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " the crossover policy used by the algorithm. "
    },
    {
      "type": "field",
      "varNames": [
        "crossoverRate"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " the rate of crossover for the algorithm. "
    },
    {
      "type": "field",
      "varNames": [
        "mutationPolicy"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " the mutation policy used by the algorithm. "
    },
    {
      "type": "field",
      "varNames": [
        "mutationRate"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " the rate of mutation for the algorithm. "
    },
    {
      "type": "field",
      "varNames": [
        "selectionPolicy"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " the selection policy used by the algorithm. "
    },
    {
      "type": "field",
      "varNames": [
        "generationsEvolved"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " the number of generations evolved to reach {@link StoppingCondition} in the last run. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.GeneticAlgorithm(org.apache.commons.math.genetics.CrossoverPolicy, double, org.apache.commons.math.genetics.MutationPolicy, double, org.apache.commons.math.genetics.SelectionPolicy)",
      "begin_line": 64,
      "end_line": 79,
      "comment": "\n     * @param crossoverPolicy The {@link CrossoverPolicy}\n     * @param crossoverRate The crossover rate as a percentage (0-1 inclusive)\n     * @param mutationPolicy The {@link MutationPolicy}\n     * @param mutationRate The mutation rate as a percentage (0-1 inclusive)\n     * @param selectionPolicy The {@link SelectionPolicy}\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 74,col 47)",
        "(line 75,col 9)-(line 75,col 43)",
        "(line 76,col 9)-(line 76,col 45)",
        "(line 77,col 9)-(line 77,col 41)",
        "(line 78,col 9)-(line 78,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.setRandomGenerator(org.apache.commons.math.random.RandomGenerator)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Set the (static) random generator.\n     *\n     * @param random random generator\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.getRandomGenerator()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Returns the (static) random generator.\n     *\n     * @return the static random generator shared by GA implementation classes\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.evolve(org.apache.commons.math.genetics.Population, org.apache.commons.math.genetics.StoppingCondition)",
      "begin_line": 109,
      "end_line": 117,
      "comment": "\n     * Evolve the given population. Evolution stops when the stopping condition\n     * is satisfied. Updates the {@link #getGenerationsEvolved() generationsEvolved}\n     * property with the number of generations evolved before the StoppingCondition\n     * is satisfied.\n     *\n     * @param initial the initial, seed population.\n     * @param condition the stopping condition used to stop evolution.\n     * @return the population that satisfies the stopping condition.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 37)",
        "(line 111,col 9)-(line 111,col 31)",
        "(line 112,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.nextGeneration(org.apache.commons.math.genetics.Population)",
      "begin_line": 141,
      "end_line": 174,
      "comment": "\n     * \u003cp\u003eEvolve the given population into the next generation.\u003c/p\u003e\n     * \u003cp\u003e\u003col\u003e\n     *    \u003cli\u003eGet nextGeneration population to fill from \u003ccode\u003ecurrent\u003c/code\u003e\n     *        generation, using its nextGeneration method\u003c/li\u003e\n     *    \u003cli\u003eLoop until new generation is filled:\u003c/li\u003e\n     *    \u003cul\u003e\u003cli\u003eApply configured SelectionPolicy to select a pair of parents\n     *            from \u003ccode\u003ecurrent\u003c/code\u003e\u003c/li\u003e\n     *        \u003cli\u003eWith probability \u003d {@link #getCrossoverRate()}, apply\n     *            configured {@link CrossoverPolicy} to parents\u003c/li\u003e\n     *        \u003cli\u003eWith probability \u003d {@link #getMutationRate()}, apply\n     *            configured {@link MutationPolicy} to each of the offspring\u003c/li\u003e\n     *        \u003cli\u003eAdd offspring individually to nextGeneration,\n     *            space permitting\u003c/li\u003e\n     *    \u003c/ul\u003e\n     *    \u003cli\u003eReturn nextGeneration\u003c/li\u003e\n     *    \u003c/ol\u003e\n     * \u003c/p\u003e\n     *\n     * @param current the current population.\n     * @return the population for the next generation.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 61)",
        "(line 144,col 9)-(line 144,col 55)",
        "(line 146,col 9)-(line 171,col 9)",
        "(line 173,col 9)-(line 173,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.getCrossoverPolicy()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * Returns the crossover policy.\n     * @return crossover policy\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.getCrossoverRate()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * Returns the crossover rate.\n     * @return crossover rate\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.getMutationPolicy()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * Returns the mutation policy.\n     * @return mutation policy\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.getMutationRate()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * Returns the mutation rate.\n     * @return mutation rate\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.getSelectionPolicy()",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n     * Returns the selection policy.\n     * @return selection policy\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.getGenerationsEvolved()",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\n     * Returns the number of generations evolved to \n     * reach {@link StoppingCondition} in the last run.\n     * \n     * @return number of generations evolved\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 34)"
      ]
    }
  ]
}