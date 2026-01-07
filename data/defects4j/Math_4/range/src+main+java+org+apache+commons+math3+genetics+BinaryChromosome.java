{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/genetics/BinaryChromosome.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BinaryChromosome",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.genetics.AbstractListChromosome\u003cjava.lang.Integer\u003e"
      ],
      "begin_line": 30,
      "end_line": 97,
      "comment": "\n * Chromosome represented by a vector of 0s and 1s.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.genetics.BinaryChromosome.BinaryChromosome(java.util.List\u003cjava.lang.Integer\u003e)",
      "begin_line": 37,
      "end_line": 39,
      "comment": "\n     * Constructor.\n     * @param representation list of {0,1} values representing the chromosome\n     * @throws InvalidRepresentationException iff the \u003ccode\u003erepresentation\u003c/code\u003e can not represent a valid chromosome\n     ",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.genetics.BinaryChromosome.BinaryChromosome(java.lang.Integer[])",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Constructor.\n     * @param representation array of {0,1} values representing the chromosome\n     * @throws InvalidRepresentationException iff the \u003ccode\u003erepresentation\u003c/code\u003e can not represent a valid chromosome\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.BinaryChromosome.checkValidity(java.util.List\u003cjava.lang.Integer\u003e)",
      "begin_line": 53,
      "end_line": 61,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 60,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.BinaryChromosome.randomBinaryRepresentation(int)",
      "begin_line": 68,
      "end_line": 75,
      "comment": "\n     * Returns a representation of a random binary array of length \u003ccode\u003elength\u003c/code\u003e.\n     * @param length length of the array\n     * @return a random binary array of length \u003ccode\u003elength\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 61)",
        "(line 71,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 74,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.BinaryChromosome.isSame(org.apache.commons.math3.genetics.Chromosome)",
      "begin_line": 77,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 64)",
        "(line 85,col 9)-(line 87,col 9)",
        "(line 89,col 9)-(line 93,col 9)",
        "(line 95,col 9)-(line 95,col 20)"
      ]
    }
  ]
}