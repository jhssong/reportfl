{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/genetics/AbstractListChromosome.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractListChromosome",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.genetics.Chromosome"
      ],
      "begin_line": 31,
      "end_line": 95,
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
      "begin_line": 41,
      "end_line": 44,
      "comment": "\n     * Constructor.\n     * @param representation inner representation of the chromosome\n     * @throws InvalidRepresentationException iff the \u003ccode\u003erepresentation\u003c/code\u003e can not represent a valid chromosome\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 38)",
        "(line 43,col 9)-(line 43,col 94)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.genetics.AbstractListChromosome.AbstractListChromosome(T[])",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Constructor.\n     * @param representation inner representation of the chromosome\n     * @throws InvalidRepresentationException iff the \u003ccode\u003erepresentation\u003c/code\u003e can not represent a valid chromosome\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.AbstractListChromosome.checkValidity(java.util.List\u003cT\u003e)",
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Asserts that \u003ccode\u003erepresentation\u003c/code\u003e can represent a valid chromosome.\n     *\n     * @param chromosomeRepresentation representation of the chromosome\n     * @throws InvalidRepresentationException iff the \u003ccode\u003erepresentation\u003c/code\u003e can not represent a valid chromosome\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.AbstractListChromosome.getRepresentation()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Returns the (immutable) inner representation of the chromosome.\n     * @return the representation of the chromosome\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.AbstractListChromosome.getLength()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Returns the length of the chromosome.\n     * @return the length of the chromosome\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.AbstractListChromosome.newFixedLengthChromosome(java.util.List\u003cT\u003e)",
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * Creates a new instance of the same class as \u003ccode\u003ethis\u003c/code\u003e is, with a given \u003ccode\u003earrayRepresentation\u003c/code\u003e.\n     * This is needed in crossover and mutation operators, where we need a new instance of the same class, but with\n     * different array representation.\n     * \u003cp\u003e\n     * Usually, this method just calls a constructor of the class.\n     *\n     * @param chromosomeRepresentation the inner array representation of the new chromosome.\n     * @return new instance extended from FixedLengthChromosome with the given arrayRepresentation\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.AbstractListChromosome.toString()",
      "begin_line": 91,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 77)"
      ]
    }
  ]
}