{
  "filepath": "/tmp/Math-53b/src/main/java/org/apache/commons/math/genetics/AbstractListChromosome.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractListChromosome",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.genetics.Chromosome"
      ],
      "begin_line": 31,
      "end_line": 100,
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
      "signature": "org.apache.commons.math.genetics.AbstractListChromosome.AbstractListChromosome(java.util.List\u003cT\u003e)",
      "begin_line": 40,
      "end_line": 43,
      "comment": "\n     * Constructor.\n     * @param representation inner representation of the chromosome\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 38)",
        "(line 42,col 9)-(line 42,col 94)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.genetics.AbstractListChromosome.AbstractListChromosome(T[])",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Constructor.\n     * @param representation inner representation of the chromosome\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.AbstractListChromosome.checkValidity(java.util.List\u003cT\u003e)",
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     *\n     * Asserts that \u003ccode\u003erepresentation\u003c/code\u003e can represent a valid chromosome.\n     * @param chromosomeRepresentation representation of the chromosome\n     * @throws InvalidRepresentationException iff the \u003ccode\u003erepresentation\u003c/code\u003e can not represent\n     *         a valid chromosome\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.AbstractListChromosome.getRepresentation()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Returns the (immutable) inner representation of the chromosome.\n     * @return the representation of the chromosome\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.AbstractListChromosome.getLength()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Returns the length of the chromosome.\n     * @return the length of the chromosome\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.AbstractListChromosome.newFixedLengthChromosome(java.util.List\u003cT\u003e)",
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * Creates a new instance of the same class as \u003ccode\u003ethis\u003c/code\u003e is, with a\n     * given \u003ccode\u003earrayRepresentation\u003c/code\u003e. This is needed in crossover and\n     * mutation operators, where we need a new instance of the same class, but\n     * with different array representation.\n     *\n     * Usually, this method just calls a constructor of the class.\n     *\n     * @param chromosomeRepresentation\n     *            the inner array representation of the new chromosome.\n     * @return new instance extended from FixedLengthChromosome with the given\n     *         arrayRepresentation\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.AbstractListChromosome.toString()",
      "begin_line": 96,
      "end_line": 99,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 77)"
      ]
    }
  ]
}