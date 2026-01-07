{
  "filepath": "/tmp/Math-53b/src/main/java/org/apache/commons/math/genetics/BinaryChromosome.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BinaryChromosome",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.genetics.AbstractListChromosome\u003cjava.lang.Integer\u003e"
      ],
      "begin_line": 30,
      "end_line": 99,
      "comment": "\n * Chromosome represented by a vector of 0s and 1s.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.genetics.BinaryChromosome.BinaryChromosome(java.util.List\u003cjava.lang.Integer\u003e)",
      "begin_line": 36,
      "end_line": 38,
      "comment": "\n     * Constructor.\n     * @param representation list of {0,1} values representing the chromosome\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.genetics.BinaryChromosome.BinaryChromosome(java.lang.Integer[])",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Constructor.\n     * @param representation array of {0,1} values representing the chromosome\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.BinaryChromosome.checkValidity(java.util.List\u003cjava.lang.Integer\u003e)",
      "begin_line": 51,
      "end_line": 60,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 59,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.BinaryChromosome.randomBinaryRepresentation(int)",
      "begin_line": 67,
      "end_line": 74,
      "comment": "\n     * Returns a representation of a random binary array of length \u003ccode\u003elength\u003c/code\u003e.\n     * @param length length of the array\n     * @return a random binary array of length \u003ccode\u003elength\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 61)",
        "(line 70,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 73,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.BinaryChromosome.isSame(org.apache.commons.math.genetics.Chromosome)",
      "begin_line": 79,
      "end_line": 98,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 85,col 64)",
        "(line 87,col 9)-(line 89,col 9)",
        "(line 91,col 9)-(line 95,col 9)",
        "(line 97,col 9)-(line 97,col 20)"
      ]
    }
  ]
}