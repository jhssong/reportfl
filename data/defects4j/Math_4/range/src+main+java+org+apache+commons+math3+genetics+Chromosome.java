{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/genetics/Chromosome.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Chromosome",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable\u003corg.apache.commons.math3.genetics.Chromosome\u003e",
        "org.apache.commons.math3.genetics.Fitness"
      ],
      "begin_line": 28,
      "end_line": 105,
      "comment": "\n * Individual in a population. Chromosomes are compared based on their fitness.\n * \u003cp\u003e\n * The chromosomes are IMMUTABLE, and so their fitness is also immutable and\n * therefore it can be cached.\n *\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "NO_FITNESS"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " Value assigned when no fitness has been computed yet. "
    },
    {
      "type": "field",
      "varNames": [
        "fitness"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Cached value of the fitness of this chromosome. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.Chromosome.getFitness()",
      "begin_line": 42,
      "end_line": 48,
      "comment": "\n     * Access the fitness of this chromosome. The bigger the fitness, the better the chromosome.\n     * \u003cp\u003e\n     * Computation of fitness is usually very time-consuming task, therefore the fitness is cached.\n     *\n     * @return the fitness\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 46,col 9)",
        "(line 47,col 9)-(line 47,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.Chromosome.compareTo(org.apache.commons.math3.genetics.Chromosome)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Compares two chromosomes based on their fitness. The bigger the fitness, the better the chromosome.\n     *\n     * @param another another chromosome to compare\n     * @return\n     * \u003cul\u003e\n     *   \u003cli\u003e-1 if \u003ccode\u003eanother\u003c/code\u003e is better than \u003ccode\u003ethis\u003c/code\u003e\u003c/li\u003e\n     *   \u003cli\u003e1 if \u003ccode\u003eanother\u003c/code\u003e is worse than \u003ccode\u003ethis\u003c/code\u003e\u003c/li\u003e\n     *   \u003cli\u003e0 if the two chromosomes have the same fitness\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.Chromosome.isSame(org.apache.commons.math3.genetics.Chromosome)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff \u003ccode\u003eanother\u003c/code\u003e has the same representation and therefore the same fitness. By\n     * default, it returns false -- override it in your implementation if you need it.\n     *\n     * @param another chromosome to compare\n     * @return true if \u003ccode\u003eanother\u003c/code\u003e is equivalent to this chromosome\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.Chromosome.findSameChromosome(org.apache.commons.math3.genetics.Population)",
      "begin_line": 83,
      "end_line": 90,
      "comment": "\n     * Searches the \u003ccode\u003epopulation\u003c/code\u003e for another chromosome with the same representation. If such chromosome is\n     * found, it is returned, if no such chromosome exists, returns \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * @param population Population to search\n     * @return Chromosome with the same representation, or \u003ccode\u003enull\u003c/code\u003e if no such chromosome exists.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 89,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.Chromosome.searchForFitnessUpdate(org.apache.commons.math3.genetics.Population)",
      "begin_line": 98,
      "end_line": 103,
      "comment": "\n     * Searches the population for a chromosome representing the same solution, and if it finds one,\n     * updates the fitness to its value.\n     *\n     * @param population Population to search\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 67)",
        "(line 100,col 9)-(line 102,col 9)"
      ]
    }
  ]
}