{
  "filepath": "/tmp/Math-95b/src/java/org/apache/commons/math/genetics/GeneticAlgorithm.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GeneticAlgorithm",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 24,
      "end_line": 182,
      "comment": "\n * Implementation of a genetic algorithm. All factors that govern the operation\n * of the algorithm can be configured for a specific problem.\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "crossoverPolicy"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": " the crossover policy used by the algorithm. "
    },
    {
      "type": "field",
      "varNames": [
        "crossoverRate"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": " the rate of crossover for the algorithm. "
    },
    {
      "type": "field",
      "varNames": [
        "mutationPolicy"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " the mutation policy used by the algorithm. "
    },
    {
      "type": "field",
      "varNames": [
        "mutationRate"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " the rate of mutation for the algorithm. "
    },
    {
      "type": "field",
      "varNames": [
        "selectionPolicy"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " the selection policy used by the algorithm. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.evolve(org.apache.commons.math.genetics.Population, org.apache.commons.math.genetics.StoppingCondition)",
      "begin_line": 48,
      "end_line": 54,
      "comment": "\n     * Evolve the given population. Evolution stops when the stopping condition\n     * is satisfied.\n     * \n     * @param initial the initial, seed population.\n     * @param condition the stopping condition used to stop evolution.\n     * @return the population that satisfies the stopping condition.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 37)",
        "(line 50,col 9)-(line 52,col 9)",
        "(line 53,col 9)-(line 53,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.getCrossoverPolicy()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Access the crossover policy.\n     * \n     * @return the crossover policy.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.getCrossoverRate()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Access the crossover rate.\n     * \n     * @return the crossover rate.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.getMutationPolicy()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Access the mutation policy.\n     * \n     * @return the mutation policy.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.getMutationRate()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Access the mutation rate.\n     * \n     * @return the mutation rate.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.getSelectionPolicy()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Access the selection policy.\n     * \n     * @return the selection policy.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.nextGeneration(org.apache.commons.math.genetics.Population)",
      "begin_line": 107,
      "end_line": 136,
      "comment": "\n     * Evolve the given population into the next generation.\n     * \n     * @param current the current population.\n     * @return the population for the next generation.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 61)",
        "(line 110,col 9)-(line 133,col 9)",
        "(line 135,col 9)-(line 135,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.setCrossoverPolicy(org.apache.commons.math.genetics.CrossoverPolicy)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * Modify the crossover policy.\n     * \n     * @param value the new crossover policy.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.setCrossoverRate(double)",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Modify the crossover rate.\n     * \n     * @param value the new crossover rate.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.setMutationPolicy(org.apache.commons.math.genetics.MutationPolicy)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * Modify the mutation policy.\n     * \n     * @param value the new mutation policy.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.setMutationRate(double)",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * Modify the mutation rate.\n     * \n     * @param value the new mutation rate.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithm.setSelectionPolicy(org.apache.commons.math.genetics.SelectionPolicy)",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\n     * Modify the selection policy.\n     * \n     * @param value the new selection policy.\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 37)"
      ]
    }
  ]
}