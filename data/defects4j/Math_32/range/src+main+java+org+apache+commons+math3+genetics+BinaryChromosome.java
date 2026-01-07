{
  "filepath": "/tmp/Math-32b/src/main/java/org/apache/commons/math3/genetics/BinaryChromosome.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BinaryChromosome",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.genetics.AbstractListChromosome\u003cjava.lang.Integer\u003e"
      ],
      "begin_line": 30,
      "end_line": 103,
      "comment": "\n * Chromosome represented by a vector of 0s and 1s.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.genetics.BinaryChromosome.BinaryChromosome(java.util.List\u003cjava.lang.Integer\u003e)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * Constructor.\n     * @param representation list of {0,1} values representing the chromosome\n     * @throws InvalidRepresentationException iff the \u003ccode\u003erepresentation\u003c/code\u003e can not represent\n     *         a valid chromosome\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.genetics.BinaryChromosome.BinaryChromosome(java.lang.Integer[])",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Constructor.\n     * @param representation array of {0,1} values representing the chromosome\n     * @throws InvalidRepresentationException iff the \u003ccode\u003erepresentation\u003c/code\u003e can not represent\n     *         a valid chromosome\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.BinaryChromosome.checkValidity(java.util.List\u003cjava.lang.Integer\u003e)",
      "begin_line": 55,
      "end_line": 64,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 63,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.BinaryChromosome.randomBinaryRepresentation(int)",
      "begin_line": 71,
      "end_line": 78,
      "comment": "\n     * Returns a representation of a random binary array of length \u003ccode\u003elength\u003c/code\u003e.\n     * @param length length of the array\n     * @return a random binary array of length \u003ccode\u003elength\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 61)",
        "(line 74,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.BinaryChromosome.isSame(org.apache.commons.math3.genetics.Chromosome)",
      "begin_line": 83,
      "end_line": 102,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 89,col 64)",
        "(line 91,col 9)-(line 93,col 9)",
        "(line 95,col 9)-(line 99,col 9)",
        "(line 101,col 9)-(line 101,col 20)"
      ]
    }
  ]
}