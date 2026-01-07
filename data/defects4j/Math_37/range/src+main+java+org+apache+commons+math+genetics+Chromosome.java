{
  "filepath": "/tmp/Math-37b/src/main/java/org/apache/commons/math/genetics/Chromosome.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Chromosome",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable\u003corg.apache.commons.math.genetics.Chromosome\u003e",
        "org.apache.commons.math.genetics.Fitness"
      ],
      "begin_line": 28,
      "end_line": 108,
      "comment": "\n * Individual in a population. Chromosomes are compared based on their fitness.\n *\n * The chromosomes are IMMUTABLE, and so their fitness is also immutable and\n * therefore it can be cached.\n *\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "fitness"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Cached value of the fitness of this chromosome. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.Chromosome.getFitness()",
      "begin_line": 42,
      "end_line": 48,
      "comment": "\n     * Access the fitness of this chromosome. The bigger the fitness, the better\n     * the chromosome.\n     *\n     * Computation of fitness is usually very time-consuming task, therefore the\n     * fitness is cached.\n     *\n     * @return the fitness.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 46,col 9)",
        "(line 47,col 9)-(line 47,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.Chromosome.compareTo(org.apache.commons.math.genetics.Chromosome)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Compares two chromosomes based on their fitness. The bigger the fitness,\n     * the better the chromosome.\n     *\n     * @param another another chromosome to compare\n     * @return\n     * \u003cul\u003e\n     *     \u003cli\u003e-1 if \u003ccode\u003eanother\u003c/code\u003e is better than \u003ccode\u003ethis\u003c/code\u003e\u003c/li\u003e\n     *     \u003cli\u003e1 if \u003ccode\u003eanother\u003c/code\u003e is worse than \u003ccode\u003ethis\u003c/code\u003e\u003c/li\u003e\n     *     \u003cli\u003e0 if the two chromosomes have the same fitness\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.Chromosome.isSame(org.apache.commons.math.genetics.Chromosome)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003ccode\u003e iff \u003ccode\u003eanother\u003c/code\u003e has the same\n     * representation and therefore the same fitness. By default, it returns\n     * false -- override it in your implementation if you need it.\n     * @param another chromosome to compare\n     * @return true if \u003ccode\u003eanother\u003c/code\u003e is equivalent to this chromosome\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.Chromosome.findSameChromosome(org.apache.commons.math.genetics.Population)",
      "begin_line": 86,
      "end_line": 93,
      "comment": "\n     * Searches the \u003ccode\u003epopulation\u003c/code\u003e for another chromosome with the same\n     * representation. If such chromosome is found, it is returned, if no such\n     * chromosome exists, returns \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * @param population Population to search\n     * @return Chromosome with the same representation, or \u003ccode\u003enull\u003c/code\u003e if\n     *         no such chromosome exists.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 92,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.Chromosome.searchForFitnessUpdate(org.apache.commons.math.genetics.Population)",
      "begin_line": 101,
      "end_line": 106,
      "comment": "\n     * Searches the population for a chromosome representing the same solution,\n     * and if it finds one, updates the fitness to its value.\n     *\n     * @param population Population to search\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 67)",
        "(line 103,col 9)-(line 105,col 9)"
      ]
    }
  ]
}