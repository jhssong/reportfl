{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/genetics/AbstractListChromosome.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractListChromosome",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.genetics.Chromosome"
      ],
      "begin_line": 31,
      "end_line": 104,
      "comment": "\n * Chromosome represented by an immutable list of a fixed length.\n *\n * @param \u003cT\u003e type of the representation list\n * @version $Revision$ $Date$\n * @since 2.0\n "
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
      "signature": "org.apache.commons.math.genetics.AbstractListChromosome.AbstractListChromosome(java.util.List\u003cT\u003e)",
      "begin_line": 40,
      "end_line": 47,
      "comment": "\n     * Constructor.\n     * @param representation inner representation of the chromosome\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 45,col 9)",
        "(line 46,col 9)-(line 46,col 94)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.genetics.AbstractListChromosome.AbstractListChromosome(T[])",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Constructor.\n     * @param representation inner representation of the chromosome\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.AbstractListChromosome.checkValidity(java.util.List\u003cT\u003e)",
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     *\n     * Asserts that \u003ccode\u003erepresentation\u003c/code\u003e can represent a valid chromosome.\n     * @param chromosomeRepresentation representation of the chromosome\n     * @throws InvalidRepresentationException iff the \u003ccode\u003erepresentation\u003c/code\u003e can not represent\n     *         a valid chromosome\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.AbstractListChromosome.getRepresentation()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Returns the (immutable) inner representation of the chromosome.\n     * @return the representation of the chromosome\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.AbstractListChromosome.getLength()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Returns the length of the chromosome.\n     * @return the length of the chromosome\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.AbstractListChromosome.newFixedLengthChromosome(java.util.List\u003cT\u003e)",
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * Creates a new instance of the same class as \u003ccode\u003ethis\u003c/code\u003e is, with a\n     * given \u003ccode\u003earrayRepresentation\u003c/code\u003e. This is needed in crossover and\n     * mutation operators, where we need a new instance of the same class, but\n     * with different array representation.\n     *\n     * Usually, this method just calls a constructor of the class.\n     *\n     * @param chromosomeRepresentation\n     *            the inner array representation of the new chromosome.\n     * @return new instance extended from FixedLengthChromosome with the given\n     *         arrayRepresentation\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.AbstractListChromosome.toString()",
      "begin_line": 100,
      "end_line": 103,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 77)"
      ]
    }
  ]
}