{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/genetics/GeneticAlgorithm.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GeneticAlgorithm",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 234,
      "comment": "\n * Implementation of a genetic algorithm. All factors that govern the operation\n * of the algorithm can be configured for a specific problem.\n *\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "randomGenerator"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "@GuardedBy(\"this\")"
    },
    {
      "type": "field",
      "varNames": [
        "crossoverPolicy"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " the crossover policy used by the algorithm. "
    },
    {
      "type": "field",
      "varNames": [
        "crossoverRate"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " the rate of crossover for the algorithm. "
    },
    {
      "type": "field",
      "varNames": [
        "mutationPolicy"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " the mutation policy used by the algorithm. "
    },
    {
      "type": "field",
      "varNames": [
        "mutationRate"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " the rate of mutation for the algorithm. "
    },
    {
      "type": "field",
      "varNames": [
        "selectionPolicy"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " the selection policy used by the algorithm. "
    },
    {
      "type": "field",
      "varNames": [
        "generationsEvolved"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " the number of generations evolved to reach {@link StoppingCondition} in the last run. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.genetics.GeneticAlgorithm.GeneticAlgorithm(org.apache.commons.math3.genetics.CrossoverPolicy, double, org.apache.commons.math3.genetics.MutationPolicy, double, org.apache.commons.math3.genetics.SelectionPolicy)",
      "begin_line": 68,
      "end_line": 87,
      "comment": "\n     * Create a new genetic algorithm.\n     * @param crossoverPolicy The {@link CrossoverPolicy}\n     * @param crossoverRate The crossover rate as a percentage (0-1 inclusive)\n     * @param mutationPolicy The {@link MutationPolicy}\n     * @param mutationRate The mutation rate as a percentage (0-1 inclusive)\n     * @param selectionPolicy The {@link SelectionPolicy}\n     * @throws OutOfRangeException if the crossover or mutation rate is outside the [0, 1] range\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 82,col 47)",
        "(line 83,col 9)-(line 83,col 43)",
        "(line 84,col 9)-(line 84,col 45)",
        "(line 85,col 9)-(line 85,col 41)",
        "(line 86,col 9)-(line 86,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.GeneticAlgorithm.setRandomGenerator(org.apache.commons.math3.random.RandomGenerator)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Set the (static) random generator.\n     *\n     * @param random random generator\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.GeneticAlgorithm.getRandomGenerator()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Returns the (static) random generator.\n     *\n     * @return the static random generator shared by GA implementation classes\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.GeneticAlgorithm.evolve(org.apache.commons.math3.genetics.Population, org.apache.commons.math3.genetics.StoppingCondition)",
      "begin_line": 117,
      "end_line": 125,
      "comment": "\n     * Evolve the given population. Evolution stops when the stopping condition\n     * is satisfied. Updates the {@link #getGenerationsEvolved() generationsEvolved}\n     * property with the number of generations evolved before the StoppingCondition\n     * is satisfied.\n     *\n     * @param initial the initial, seed population.\n     * @param condition the stopping condition used to stop evolution.\n     * @return the population that satisfies the stopping condition.\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 37)",
        "(line 119,col 9)-(line 119,col 31)",
        "(line 120,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.GeneticAlgorithm.nextGeneration(org.apache.commons.math3.genetics.Population)",
      "begin_line": 149,
      "end_line": 182,
      "comment": "\n     * Evolve the given population into the next generation.\n     * \u003cp\u003e\n     * \u003col\u003e\n     *  \u003cli\u003eGet nextGeneration population to fill from \u003ccode\u003ecurrent\u003c/code\u003e\n     *      generation, using its nextGeneration method\u003c/li\u003e\n     *  \u003cli\u003eLoop until new generation is filled:\u003c/li\u003e\n     *  \u003cul\u003e\u003cli\u003eApply configured SelectionPolicy to select a pair of parents\n     *          from \u003ccode\u003ecurrent\u003c/code\u003e\u003c/li\u003e\n     *      \u003cli\u003eWith probability \u003d {@link #getCrossoverRate()}, apply\n     *          configured {@link CrossoverPolicy} to parents\u003c/li\u003e\n     *      \u003cli\u003eWith probability \u003d {@link #getMutationRate()}, apply\n     *          configured {@link MutationPolicy} to each of the offspring\u003c/li\u003e\n     *      \u003cli\u003eAdd offspring individually to nextGeneration,\n     *          space permitting\u003c/li\u003e\n     *  \u003c/ul\u003e\n     *  \u003cli\u003eReturn nextGeneration\u003c/li\u003e\n     * \u003c/ol\u003e\n     *\n     * @param current the current population.\n     * @return the population for the next generation.\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 61)",
        "(line 152,col 9)-(line 152,col 55)",
        "(line 154,col 9)-(line 179,col 9)",
        "(line 181,col 9)-(line 181,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.GeneticAlgorithm.getCrossoverPolicy()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * Returns the crossover policy.\n     * @return crossover policy\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.GeneticAlgorithm.getCrossoverRate()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * Returns the crossover rate.\n     * @return crossover rate\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.GeneticAlgorithm.getMutationPolicy()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * Returns the mutation policy.\n     * @return mutation policy\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.GeneticAlgorithm.getMutationRate()",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n     * Returns the mutation rate.\n     * @return mutation rate\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.GeneticAlgorithm.getSelectionPolicy()",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\n     * Returns the selection policy.\n     * @return selection policy\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.GeneticAlgorithm.getGenerationsEvolved()",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\n     * Returns the number of generations evolved to reach {@link StoppingCondition} in the last run.\n     *\n     * @return number of generations evolved\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 34)"
      ]
    }
  ]
}