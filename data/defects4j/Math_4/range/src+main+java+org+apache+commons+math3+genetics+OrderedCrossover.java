{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/genetics/OrderedCrossover.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OrderedCrossover",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.genetics.CrossoverPolicy"
      ],
      "begin_line": 61,
      "end_line": 151,
      "comment": "\n * Order 1 Crossover [OX1] builds offspring from \u003cb\u003eordered\u003c/b\u003e chromosomes by copying a\n * consecutive slice from one parent, and filling up the remaining genes from the other\n * parent as they appear.\n * \u003cp\u003e\n * This policy works by applying the following rules:\n * \u003col\u003e\n *   \u003cli\u003eselect a random slice of consecutive genes from parent 1\u003c/li\u003e\n *   \u003cli\u003ecopy the slice to child 1 and mark out the genes in parent 2\u003c/li\u003e\n *   \u003cli\u003estarting from the right side of the slice, copy genes from parent 2 as they\n *       appear to child 1 if they are not yet marked out.\u003c/li\u003e\n * \u003c/ol\u003e\n * \u003cp\u003e\n * Example (random sublist from index 3 to 7, underlined):\n * \u003cpre\u003e\n * p1 \u003d (8 4 7 3 6 2 5 1 9 0)   X   c1 \u003d (0 4 7 3 6 2 5 1 8 9)\n *             ---------                        ---------\n * p2 \u003d (0 1 2 3 4 5 6 7 8 9)   X   c2 \u003d (8 1 2 3 4 5 6 7 9 0)\n * \u003c/pre\u003e\n * \u003cp\u003e\n * This policy works only on {@link AbstractListChromosome}, and therefore it\n * is parameterized by T. Moreover, the chromosomes must have same lengths.\n *\n * @see \u003ca href\u003d\"http://www.rubicite.com/Tutorials/GeneticAlgorithms/CrossoverOperators/Order1CrossoverOperator.aspx\"\u003e\n * Order 1 Crossover Operator\u003c/a\u003e\n *\n * @param \u003cT\u003e generic type of the {@link AbstractListChromosome}s for crossover\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.OrderedCrossover.crossover(org.apache.commons.math3.genetics.Chromosome, org.apache.commons.math3.genetics.Chromosome)",
      "begin_line": 70,
      "end_line": 78,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws MathIllegalArgumentException iff one of the chromosomes is\n     *   not an instance of {@link AbstractListChromosome}\n     * @throws DimensionMismatchException if the length of the two chromosomes is different\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.OrderedCrossover.mate(org.apache.commons.math3.genetics.AbstractListChromosome\u003cT\u003e, org.apache.commons.math3.genetics.AbstractListChromosome\u003cT\u003e)",
      "begin_line": 88,
      "end_line": 150,
      "comment": "\n     * Helper for {@link #crossover(Chromosome, Chromosome)}. Performs the actual crossover.\n     *\n     * @param first the first chromosome\n     * @param second the second chromosome\n     * @return the pair of new chromosomes that resulted from the crossover\n     * @throws DimensionMismatchException if the length of the two chromosomes is different\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 45)",
        "(line 92,col 9)-(line 94,col 9)",
        "(line 97,col 9)-(line 97,col 61)",
        "(line 98,col 9)-(line 98,col 62)",
        "(line 100,col 9)-(line 100,col 56)",
        "(line 101,col 9)-(line 101,col 56)",
        "(line 103,col 9)-(line 103,col 56)",
        "(line 104,col 9)-(line 104,col 56)",
        "(line 106,col 9)-(line 106,col 77)",
        "(line 108,col 9)-(line 108,col 39)",
        "(line 109,col 9)-(line 109,col 14)",
        "(line 110,col 9)-(line 112,col 25)",
        "(line 114,col 9)-(line 114,col 42)",
        "(line 115,col 9)-(line 115,col 42)",
        "(line 118,col 9)-(line 118,col 54)",
        "(line 119,col 9)-(line 119,col 33)",
        "(line 120,col 9)-(line 120,col 54)",
        "(line 121,col 9)-(line 121,col 33)",
        "(line 124,col 9)-(line 142,col 9)",
        "(line 145,col 9)-(line 145,col 39)",
        "(line 146,col 9)-(line 146,col 39)",
        "(line 148,col 9)-(line 149,col 75)"
      ]
    }
  ]
}