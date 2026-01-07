{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/genetics/Chromosome.java",
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
      "end_line": 111,
      "comment": "\n * Individual in a population. Chromosomes are compared based on their fitness.\n *\n * The chromosomes are IMMUTABLE, and so their fitness is also immutable and\n * therefore it can be cached.\n *\n * @since 2.0\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "fitness"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": "\n     * Cached value of the fitness of this chromosome.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.Chromosome.getFitness()",
      "begin_line": 44,
      "end_line": 50,
      "comment": "\n     * Access the fitness of this chromosome. The bigger the fitness, the better\n     * the chromosome.\n     *\n     * Computation of fitness is usually very time-consuming task, therefore the\n     * fitness is cached.\n     *\n     * @return the fitness.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 48,col 9)",
        "(line 49,col 9)-(line 49,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.Chromosome.compareTo(org.apache.commons.math.genetics.Chromosome)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Compares two chromosomes based on their fitness. The bigger the fitness,\n     * the better the chromosome.\n     *\n     * @param another another chromosome to compare\n     * @return\n     * \u003cul\u003e\n     *     \u003cli\u003e-1 if \u003ccode\u003eanother\u003c/code\u003e is better than \u003ccode\u003ethis\u003c/code\u003e\u003c/li\u003e\n     *     \u003cli\u003e1 if \u003ccode\u003eanother\u003c/code\u003e is worse than \u003ccode\u003ethis\u003c/code\u003e\u003c/li\u003e\n     *     \u003cli\u003e0 if the two chromosomes have the same fitness\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.Chromosome.isSame(org.apache.commons.math.genetics.Chromosome)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003ccode\u003e iff \u003ccode\u003eanother\u003c/code\u003e has the same\n     * representation and therefore the same fitness. By default, it returns\n     * false -- override it in your implementation if you need it.\n     * @param another chromosome to compare\n     * @return true if \u003ccode\u003eanother\u003c/code\u003e is equivalent to this chromosome\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.Chromosome.findSameChromosome(org.apache.commons.math.genetics.Population)",
      "begin_line": 89,
      "end_line": 95,
      "comment": "\n     * Searches the \u003ccode\u003epopulation\u003c/code\u003e for another chromosome with the same\n     * representation. If such chromosome is found, it is returned, if no such\n     * chromosome exists, returns \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * @param population\n     *            Population to search\n     * @return Chromosome with the same representation, or \u003ccode\u003enull\u003c/code\u003e if\n     *         no such chromosome exists.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.Chromosome.searchForFitnessUpdate(org.apache.commons.math.genetics.Population)",
      "begin_line": 104,
      "end_line": 109,
      "comment": "\n     * Searches the population for a chromosome representing the same solution,\n     * and if it finds one, updates the fitness to its value.\n     *\n     * @param population\n     *            Population to search\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 67)",
        "(line 106,col 9)-(line 108,col 9)"
      ]
    }
  ]
}