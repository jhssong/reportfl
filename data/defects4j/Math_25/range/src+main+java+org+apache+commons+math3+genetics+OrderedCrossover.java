{
  "filepath": "/tmp/Math-25b/src/main/java/org/apache/commons/math3/genetics/OrderedCrossover.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OrderedCrossover",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.genetics.CrossoverPolicy"
      ],
      "begin_line": 46,
      "end_line": 128,
      "comment": "\n * Order 1 Crossover [OX1] builds offspring from \u003cb\u003eordered\u003c/b\u003e chromosomes by copying a\n * consecutive slice from one parent, and filling up the remaining genes from the other\n * parent as they appear.\n * \u003cp\u003e\n * This policy works by applying the following rules:\n * \u003col\u003e\n *   \u003cli\u003eselect a random slice of consecutive genes from parent 1\u003c/li\u003e\n *   \u003cli\u003ecopy the slice to child 1 and mark out the genes in parent 2\u003c/li\u003e\n *   \u003cli\u003estarting from the right side of the slice, copy genes from parent 2 as they\n *       appear to child 1 if they are not yet marked out.\u003c/li\u003e\n * \u003c/ol\u003e\n * \u003c/p\u003e\n *\n * Example (random sublist from index 3 to 7, underlined):\n * \u003cpre\u003e\n * p1 \u003d (8 4 7 3 6 2 5 1 9 0)   X   c1 \u003d (0 4 7 3 6 2 5 1 8 9)\n *             ---------                        ---------\n * p2 \u003d (0 1 2 3 4 5 6 7 8 9)   X   c2 \u003d (8 1 2 3 4 5 6 7 9 0)\n * \u003c/pre\u003e\n *\n * This policy works only on {@link AbstractListChromosome}, and therefore it\n * is parameterized by T. Moreover, the chromosomes must have same lengths.\n *\n * @see \u003ca href\u003d\"http://www.rubicite.com/Tutorials/GeneticAlgorithms/CrossoverOperators/Order1CrossoverOperator.aspx\"\u003e\n * Order 1 Crossover Operator\u003c/a\u003e\n *\n * @param \u003cT\u003e generic type of the {@link AbstractListChromosome}s for crossover\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.OrderedCrossover.crossover(org.apache.commons.math3.genetics.Chromosome, org.apache.commons.math3.genetics.Chromosome)",
      "begin_line": 51,
      "end_line": 57,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 55,col 9)",
        "(line 56,col 9)-(line 56,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.OrderedCrossover.mate(org.apache.commons.math3.genetics.AbstractListChromosome\u003cT\u003e, org.apache.commons.math3.genetics.AbstractListChromosome\u003cT\u003e)",
      "begin_line": 67,
      "end_line": 127,
      "comment": "\n     * Helper for {@link #crossover(Chromosome, Chromosome)}. Performs the actual crossover.\n     *\n     * @param first the first chromosome\n     * @param second the second chromosome\n     * @return the pair of new chromosomes that resulted from the crossover\n     * @throws DimensionMismatchException if the length of the two chromosomes is different\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 45)",
        "(line 69,col 9)-(line 71,col 9)",
        "(line 74,col 9)-(line 74,col 61)",
        "(line 75,col 9)-(line 75,col 62)",
        "(line 77,col 9)-(line 77,col 56)",
        "(line 78,col 9)-(line 78,col 56)",
        "(line 80,col 9)-(line 80,col 56)",
        "(line 81,col 9)-(line 81,col 56)",
        "(line 83,col 9)-(line 83,col 77)",
        "(line 85,col 9)-(line 85,col 39)",
        "(line 86,col 9)-(line 86,col 14)",
        "(line 87,col 9)-(line 89,col 25)",
        "(line 91,col 9)-(line 91,col 42)",
        "(line 92,col 9)-(line 92,col 42)",
        "(line 95,col 9)-(line 95,col 54)",
        "(line 96,col 9)-(line 96,col 33)",
        "(line 97,col 9)-(line 97,col 54)",
        "(line 98,col 9)-(line 98,col 33)",
        "(line 101,col 9)-(line 119,col 9)",
        "(line 122,col 9)-(line 122,col 39)",
        "(line 123,col 9)-(line 123,col 39)",
        "(line 125,col 9)-(line 126,col 75)"
      ]
    }
  ]
}