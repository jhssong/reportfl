{
  "filepath": "/tmp/Math-23b/src/main/java/org/apache/commons/math3/genetics/CycleCrossover.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CycleCrossover",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.genetics.CrossoverPolicy"
      ],
      "begin_line": 66,
      "end_line": 176,
      "comment": "\n * Cycle Crossover [CX] builds offspring from \u003cb\u003eordered\u003c/b\u003e chromosomes by identifying cycles\n * between two parent chromosomes. To form the children, the cycles are copied from the\n * respective parents.\n * \u003cp\u003e\n * To form a cycle the following procedure is applied:\n * \u003col\u003e\n *   \u003cli\u003estart with the first gene of parent 1\u003c/li\u003e\n *   \u003cli\u003elook at the gene at the same position of parent 2\u003c/li\u003e\n *   \u003cli\u003ego to the position with the same gene in parent 1\u003c/li\u003e\n *   \u003cli\u003eadd this gene index to the cycle\u003c/li\u003e\n *   \u003cli\u003erepeat the steps 2-5 until we arrive at the starting gene of this cycle\u003c/li\u003e\n * \u003c/ol\u003e\n * The indices that form a cycle are then used to form the children in alternating order, i.e.\n * in cycle 1, the genes of parent 1 are copied to child 1, while in cycle 2 the genes of parent 1\n * are copied to child 2, and so forth ...\n * \u003c/p\u003e\n *\n * Example (zero-start cycle):\n * \u003cpre\u003e\n * p1 \u003d (8 4 7 3 6 2 5 1 9 0)    X   c1 \u003d (8 1 2 3 4 5 6 7 9 0)\n * p2 \u003d (0 1 2 3 4 5 6 7 8 9)    X   c2 \u003d (0 4 7 3 6 2 5 1 8 9)\n *\n * cycle 1: 8 0 9\n * cycle 2: 4 1 7 2 5 6\n * cycle 3: 3\n * \u003c/pre\u003e\n *\n * This policy works only on {@link AbstractListChromosome}, and therefore it\n * is parameterized by T. Moreover, the chromosomes must have same lengths.\n *\n * @see \u003ca href\u003d\"http://www.rubicite.com/Tutorials/GeneticAlgorithms/CrossoverOperators/CycleCrossoverOperator.aspx\"\u003e\n * Cycle Crossover Operator\u003c/a\u003e\n *\n * @param \u003cT\u003e generic type of the {@link AbstractListChromosome}s for crossover\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "randomStart"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " If the start index shall be chosen randomly. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.genetics.CycleCrossover.CycleCrossover()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Creates a new {@link CycleCrossover} policy.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.genetics.CycleCrossover.CycleCrossover(boolean)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Creates a new {@link CycleCrossover} policy using the given {@code randomStart} behavior.\n     *\n     * @param randomStart whether the start index shall be chosen randomly or be set to 0\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.CycleCrossover.isRandomStart()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Returns whether the starting index is chosen randomly or set to zero.\n     *\n     * @return {@code true} if the starting index is chosen randomly, {@code false} otherwise\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.CycleCrossover.crossover(org.apache.commons.math3.genetics.Chromosome, org.apache.commons.math3.genetics.Chromosome)",
      "begin_line": 99,
      "end_line": 105,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.CycleCrossover.mate(org.apache.commons.math3.genetics.AbstractListChromosome\u003cT\u003e, org.apache.commons.math3.genetics.AbstractListChromosome\u003cT\u003e)",
      "begin_line": 115,
      "end_line": 175,
      "comment": "\n     * Helper for {@link #crossover(Chromosome, Chromosome)}. Performs the actual crossover.\n     *\n     * @param first the first chromosome\n     * @param second the second chromosome\n     * @return the pair of new chromosomes that resulted from the crossover\n     * @throws DimensionMismatchException if the length of the two chromosomes is different\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 45)",
        "(line 117,col 9)-(line 119,col 9)",
        "(line 122,col 9)-(line 122,col 61)",
        "(line 123,col 9)-(line 123,col 62)",
        "(line 125,col 9)-(line 125,col 79)",
        "(line 126,col 9)-(line 126,col 78)",
        "(line 129,col 9)-(line 129,col 73)",
        "(line 131,col 9)-(line 131,col 69)",
        "(line 134,col 9)-(line 134,col 90)",
        "(line 135,col 9)-(line 135,col 22)",
        "(line 137,col 9)-(line 171,col 9)",
        "(line 173,col 9)-(line 174,col 78)"
      ]
    }
  ]
}