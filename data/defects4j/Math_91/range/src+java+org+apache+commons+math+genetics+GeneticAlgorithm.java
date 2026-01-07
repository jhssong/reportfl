{
  "filepath": "/tmp/Math-91b/src/java/org/apache/commons/math/genetics/GeneticAlgorithm.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GeneticAlgorithm",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 25,
      "end_line": 206,
      "comment": "\n * Implementation of a genetic algorithm. All factors that govern the operation\n * of the algorithm can be configured for a specific problem.\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "crossoverPolicy"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": " the crossover policy used by the algorithm. "
    },
    {
      "type": "field",
      "varNames": [
        "crossoverRate"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " the rate of crossover for the algorithm. "
    },
    {
      "type": "field",
      "varNames": [
        "mutationPolicy"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " the mutation policy used by the algorithm. "
    },
    {
      "type": "field",
      "varNames": [
        "mutationRate"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " the rate of mutation for the algorithm. "
    },
    {
      "type": "field",
      "varNames": [
        "selectionPolicy"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " the selection policy used by the algorithm. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.evolve(org.apache.commons.math.genetics.Population, org.apache.commons.math.genetics.StoppingCondition)",
      "begin_line": 49,
      "end_line": 55,
      "comment": "\n     * Evolve the given population. Evolution stops when the stopping condition\n     * is satisfied.\n     * \n     * @param initial the initial, seed population.\n     * @param condition the stopping condition used to stop evolution.\n     * @return the population that satisfies the stopping condition.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 37)",
        "(line 51,col 9)-(line 53,col 9)",
        "(line 54,col 9)-(line 54,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.getCrossoverPolicy()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Access the crossover policy.\n     * \n     * @return the crossover policy.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.getCrossoverRate()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Access the crossover rate.\n     * \n     * @return the crossover rate.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.getMutationPolicy()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Access the mutation policy.\n     * \n     * @return the mutation policy.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.getMutationRate()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Access the mutation rate.\n     * \n     * @return the mutation rate.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.getSelectionPolicy()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Access the selection policy.\n     * \n     * @return the selection policy.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.nextGeneration(org.apache.commons.math.genetics.Population)",
      "begin_line": 125,
      "end_line": 160,
      "comment": "\n     * \u003cp\u003eEvolve the given population into the next generation.\u003c/p\u003e\n     * \u003cp\u003e\u003col\u003e\n     *    \u003cli\u003eGet nextGeneration population to fill from \u003ccode\u003ecurrent\u003c/code\u003e\n     *        generation, using its nextGeneration method\u003c/li\u003e\n     *    \u003cli\u003eLoop until new generation is filled:\u003c/li\u003e\n     *    \u003cul\u003e\u003cli\u003eApply configured SelectionPolicy to select a pair of parents\n     *            from \u003ccode\u003ecurrent\u003c/code\u003e\u003c/li\u003e\n     *        \u003cli\u003eWith probability \u003d {@link #getCrossoverRate()}, apply\n     *            configured {@link CrossoverPolicy} to parents\u003c/li\u003e\n     *        \u003cli\u003eWith probability \u003d {@link #getMutationRate()}, apply\n     *            configured {@link MutationPolicy} to each of the offspring\u003c/li\u003e\n     *        \u003cli\u003eAdd offspring individually to nextGeneration,\n     *            space permitting\u003c/li\u003e\n     *    \u003c/ul\u003e\n     *    \u003cli\u003eReturn nextGeneration\u003c/li\u003e\n     *    \u003c/ol\u003e\n     * \u003c/p\u003e\n     * \n     * \n     * @param current the current population.\n     * @return the population for the next generation.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 61)",
        "(line 128,col 9)-(line 157,col 9)",
        "(line 159,col 9)-(line 159,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.setCrossoverPolicy(org.apache.commons.math.genetics.CrossoverPolicy)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * Modify the crossover policy.\n     * \n     * @param value the new crossover policy.\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.setCrossoverRate(double)",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * Modify the crossover rate.\n     * \n     * @param value the new crossover rate.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.setMutationPolicy(org.apache.commons.math.genetics.MutationPolicy)",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * Modify the mutation policy.\n     * \n     * @param value the new mutation policy.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.setMutationRate(double)",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * Modify the mutation rate.\n     * \n     * @param value the new mutation rate.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.setSelectionPolicy(org.apache.commons.math.genetics.SelectionPolicy)",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n     * Modify the selection policy.\n     * \n     * @param value the new selection policy.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 37)"
      ]
    }
  ]
}