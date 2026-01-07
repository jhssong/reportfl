{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/genetics/Population.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Population",
      "is_interface": true,
      "parent_types": [
        "java.lang.Iterable\u003corg.apache.commons.math3.genetics.Chromosome\u003e"
      ],
      "begin_line": 28,
      "end_line": 60,
      "comment": "\n * A collection of chromosomes that facilitates generational evolution.\n *\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.Population.getPopulationSize()",
      "begin_line": 33,
      "end_line": 33,
      "comment": "\n     * Access the current population size.\n     * @return the current population size.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.Population.getPopulationLimit()",
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Access the maximum population size.\n     * @return the maximum population size.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.Population.nextGeneration()",
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Start the population for the next generation.\n     * @return the beginnings of the next generation.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.Population.addChromosome(org.apache.commons.math3.genetics.Chromosome)",
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Add the given chromosome to the population.\n     * @param chromosome the chromosome to add.\n     * @throws NumberIsTooLargeException if the population would exceed the population limit when adding\n     *   this chromosome\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.Population.getFittestChromosome()",
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Access the fittest chromosome in this population.\n     * @return the fittest chromosome.\n     ",
      "child_ranges": []
    }
  ]
}