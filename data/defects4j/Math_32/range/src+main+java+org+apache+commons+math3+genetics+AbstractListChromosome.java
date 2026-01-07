{
  "filepath": "/tmp/Math-32b/src/main/java/org/apache/commons/math3/genetics/AbstractListChromosome.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractListChromosome",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.genetics.Chromosome"
      ],
      "begin_line": 31,
      "end_line": 102,
      "comment": "\n * Chromosome represented by an immutable list of a fixed length.\n *\n * @param \u003cT\u003e type of the representation list\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "representation"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " List representing the chromosome "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.genetics.AbstractListChromosome.AbstractListChromosome(java.util.List\u003cT\u003e)",
      "begin_line": 42,
      "end_line": 45,
      "comment": "\n     * Constructor.\n     * @param representation inner representation of the chromosome\n     * @throws InvalidRepresentationException iff the \u003ccode\u003erepresentation\u003c/code\u003e can not represent\n     *         a valid chromosome\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 38)",
        "(line 44,col 9)-(line 44,col 94)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.genetics.AbstractListChromosome.AbstractListChromosome(T[])",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Constructor.\n     * @param representation inner representation of the chromosome\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.AbstractListChromosome.checkValidity(java.util.List\u003cT\u003e)",
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     *\n     * Asserts that \u003ccode\u003erepresentation\u003c/code\u003e can represent a valid chromosome.\n     * @param chromosomeRepresentation representation of the chromosome\n     * @throws InvalidRepresentationException iff the \u003ccode\u003erepresentation\u003c/code\u003e can not represent\n     *         a valid chromosome\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.AbstractListChromosome.getRepresentation()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Returns the (immutable) inner representation of the chromosome.\n     * @return the representation of the chromosome\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.AbstractListChromosome.getLength()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Returns the length of the chromosome.\n     * @return the length of the chromosome\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.AbstractListChromosome.newFixedLengthChromosome(java.util.List\u003cT\u003e)",
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n     * Creates a new instance of the same class as \u003ccode\u003ethis\u003c/code\u003e is, with a\n     * given \u003ccode\u003earrayRepresentation\u003c/code\u003e. This is needed in crossover and\n     * mutation operators, where we need a new instance of the same class, but\n     * with different array representation.\n     *\n     * Usually, this method just calls a constructor of the class.\n     *\n     * @param chromosomeRepresentation\n     *            the inner array representation of the new chromosome.\n     * @return new instance extended from FixedLengthChromosome with the given\n     *         arrayRepresentation\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.AbstractListChromosome.toString()",
      "begin_line": 98,
      "end_line": 101,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 77)"
      ]
    }
  ]
}